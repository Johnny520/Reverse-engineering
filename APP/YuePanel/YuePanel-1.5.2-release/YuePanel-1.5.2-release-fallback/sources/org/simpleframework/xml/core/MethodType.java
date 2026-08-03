package org.simpleframework.xml.core;

/* JADX INFO: loaded from: classes2.dex */
enum MethodType extends java.lang.Enum<org.simpleframework.xml.core.MethodType> {
    private static final /* synthetic */ org.simpleframework.xml.core.MethodType[] $VALUES = null;
    public static final org.simpleframework.xml.core.MethodType GET = null;
    public static final org.simpleframework.xml.core.MethodType IS = null;
    public static final org.simpleframework.xml.core.MethodType NONE = null;
    public static final org.simpleframework.xml.core.MethodType SET = null;
    private int prefix;

    static {
            org.simpleframework.xml.core.MethodType r0 = new org.simpleframework.xml.core.MethodType
            java.lang.String r1 = "GET"
            r2 = 0
            r3 = 3
            r0.<init>(r1, r2, r3)
            org.simpleframework.xml.core.MethodType.GET = r0
            org.simpleframework.xml.core.MethodType r1 = new org.simpleframework.xml.core.MethodType
            java.lang.String r4 = "IS"
            r5 = 1
            r6 = 2
            r1.<init>(r4, r5, r6)
            org.simpleframework.xml.core.MethodType.IS = r1
            org.simpleframework.xml.core.MethodType r4 = new org.simpleframework.xml.core.MethodType
            java.lang.String r5 = "SET"
            r4.<init>(r5, r6, r3)
            org.simpleframework.xml.core.MethodType.SET = r4
            org.simpleframework.xml.core.MethodType r5 = new org.simpleframework.xml.core.MethodType
            java.lang.String r6 = "NONE"
            r5.<init>(r6, r3, r2)
            org.simpleframework.xml.core.MethodType.NONE = r5
            org.simpleframework.xml.core.MethodType[] r0 = new org.simpleframework.xml.core.MethodType[]{r0, r1, r4, r5}
            org.simpleframework.xml.core.MethodType.$VALUES = r0
            return
    }

    MethodType(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.prefix = r3
            return
    }

    public static org.simpleframework.xml.core.MethodType valueOf(java.lang.String r1) {
            java.lang.Class<org.simpleframework.xml.core.MethodType> r0 = org.simpleframework.xml.core.MethodType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.simpleframework.xml.core.MethodType r1 = (org.simpleframework.xml.core.MethodType) r1
            return r1
    }

    public static org.simpleframework.xml.core.MethodType[] values() {
            org.simpleframework.xml.core.MethodType[] r0 = org.simpleframework.xml.core.MethodType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.simpleframework.xml.core.MethodType[] r0 = (org.simpleframework.xml.core.MethodType[]) r0
            return r0
    }

    public int getPrefix() {
            r1 = this;
            int r0 = r1.prefix
            return r0
    }
}
