package org.simpleframework.xml.stream;

/* JADX INFO: loaded from: classes2.dex */
public enum Verbosity extends java.lang.Enum<org.simpleframework.xml.stream.Verbosity> {
    private static final /* synthetic */ org.simpleframework.xml.stream.Verbosity[] $VALUES = null;
    public static final org.simpleframework.xml.stream.Verbosity HIGH = null;
    public static final org.simpleframework.xml.stream.Verbosity LOW = null;

    static {
            org.simpleframework.xml.stream.Verbosity r0 = new org.simpleframework.xml.stream.Verbosity
            java.lang.String r1 = "HIGH"
            r2 = 0
            r0.<init>(r1, r2)
            org.simpleframework.xml.stream.Verbosity.HIGH = r0
            org.simpleframework.xml.stream.Verbosity r1 = new org.simpleframework.xml.stream.Verbosity
            java.lang.String r2 = "LOW"
            r3 = 1
            r1.<init>(r2, r3)
            org.simpleframework.xml.stream.Verbosity.LOW = r1
            org.simpleframework.xml.stream.Verbosity[] r0 = new org.simpleframework.xml.stream.Verbosity[]{r0, r1}
            org.simpleframework.xml.stream.Verbosity.$VALUES = r0
            return
    }

    Verbosity(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.simpleframework.xml.stream.Verbosity valueOf(java.lang.String r1) {
            java.lang.Class<org.simpleframework.xml.stream.Verbosity> r0 = org.simpleframework.xml.stream.Verbosity.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.simpleframework.xml.stream.Verbosity r1 = (org.simpleframework.xml.stream.Verbosity) r1
            return r1
    }

    public static org.simpleframework.xml.stream.Verbosity[] values() {
            org.simpleframework.xml.stream.Verbosity[] r0 = org.simpleframework.xml.stream.Verbosity.$VALUES
            java.lang.Object r0 = r0.clone()
            org.simpleframework.xml.stream.Verbosity[] r0 = (org.simpleframework.xml.stream.Verbosity[]) r0
            return r0
    }
}
