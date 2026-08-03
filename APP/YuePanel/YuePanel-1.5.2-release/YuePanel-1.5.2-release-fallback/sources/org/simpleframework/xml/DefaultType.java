package org.simpleframework.xml;

/* JADX INFO: loaded from: classes2.dex */
public enum DefaultType extends java.lang.Enum<org.simpleframework.xml.DefaultType> {
    private static final /* synthetic */ org.simpleframework.xml.DefaultType[] $VALUES = null;
    public static final org.simpleframework.xml.DefaultType FIELD = null;
    public static final org.simpleframework.xml.DefaultType PROPERTY = null;

    static {
            org.simpleframework.xml.DefaultType r0 = new org.simpleframework.xml.DefaultType
            java.lang.String r1 = "FIELD"
            r2 = 0
            r0.<init>(r1, r2)
            org.simpleframework.xml.DefaultType.FIELD = r0
            org.simpleframework.xml.DefaultType r1 = new org.simpleframework.xml.DefaultType
            java.lang.String r2 = "PROPERTY"
            r3 = 1
            r1.<init>(r2, r3)
            org.simpleframework.xml.DefaultType.PROPERTY = r1
            org.simpleframework.xml.DefaultType[] r0 = new org.simpleframework.xml.DefaultType[]{r0, r1}
            org.simpleframework.xml.DefaultType.$VALUES = r0
            return
    }

    DefaultType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.simpleframework.xml.DefaultType valueOf(java.lang.String r1) {
            java.lang.Class<org.simpleframework.xml.DefaultType> r0 = org.simpleframework.xml.DefaultType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.simpleframework.xml.DefaultType r1 = (org.simpleframework.xml.DefaultType) r1
            return r1
    }

    public static org.simpleframework.xml.DefaultType[] values() {
            org.simpleframework.xml.DefaultType[] r0 = org.simpleframework.xml.DefaultType.$VALUES
            java.lang.Object r0 = r0.clone()
            org.simpleframework.xml.DefaultType[] r0 = (org.simpleframework.xml.DefaultType[]) r0
            return r0
    }
}
