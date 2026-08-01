package com.typesafe.config.impl;

import java.util.HashMap;

/* JADX INFO: renamed from: com.typesafe.config.impl.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3859 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final boolean f12087;

    static {
        HashMap map = new HashMap();
        Boolean bool = Boolean.FALSE;
        map.put("loads", bool);
        map.put("substitutions", bool);
        String property = System.getProperty("config.trace");
        if (property != null) {
            for (String str : property.split(",")) {
                if (str.equals("loads")) {
                    map.put("loads", Boolean.TRUE);
                } else if (str.equals("substitutions")) {
                    map.put("substitutions", Boolean.TRUE);
                } else {
                    System.err.println("config.trace property contains unknown trace topic '" + str + "'");
                }
            }
        }
        ((Boolean) map.get("loads")).getClass();
        f12087 = ((Boolean) map.get("substitutions")).booleanValue();
    }
}
