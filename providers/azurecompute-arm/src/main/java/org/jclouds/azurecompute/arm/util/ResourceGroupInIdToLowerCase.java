package org.jclouds.azurecompute.arm.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *  Returns full azure id with the resour cegroup section in lower case
 *
 */
public class ResourceGroupInIdToLowerCase
{
   private static final Pattern RESOURCE_GROUP_PATTERN = Pattern.compile("^.*/resourceGroups/([^/]+)(/.*)?$");

   public static String apply(String id) {
      Matcher m = RESOURCE_GROUP_PATTERN.matcher(id);
      return m.matches() ? id.substring(0, m.start(1)) + m.group(1).toLowerCase() + id.substring(m.start(2)) : id;
   }
}
