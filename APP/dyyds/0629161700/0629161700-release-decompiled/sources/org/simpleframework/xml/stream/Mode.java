package org.simpleframework.xml.stream;

/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public enum Mode extends java.lang.Enum<org.simpleframework.xml.stream.Mode> {
    private static final /* synthetic */ org.simpleframework.xml.stream.Mode[] $VALUES = null;
    public static final org.simpleframework.xml.stream.Mode DATA = null;
    public static final org.simpleframework.xml.stream.Mode ESCAPE = null;
    public static final org.simpleframework.xml.stream.Mode INHERIT = null;

    static {
            org.simpleframework.xml.stream.Mode r0 = new org.simpleframework.xml.stream.Mode
            java.lang.String r1 = "DATA"
            r2 = 0
            r0.<init>(r1, r2)
            org.simpleframework.xml.stream.Mode.DATA = r0
            org.simpleframework.xml.stream.Mode r1 = new org.simpleframework.xml.stream.Mode
            java.lang.String r2 = "ESCAPE"
            r3 = 1
            r1.<init>(r2, r3)
            org.simpleframework.xml.stream.Mode.ESCAPE = r1
            org.simpleframework.xml.stream.Mode r2 = new org.simpleframework.xml.stream.Mode
            java.lang.String r3 = "INHERIT"
            r4 = 2
            r2.<init>(r3, r4)
            org.simpleframework.xml.stream.Mode.INHERIT = r2
            org.simpleframework.xml.stream.Mode[] r0 = new org.simpleframework.xml.stream.Mode[]{r0, r1, r2}
            org.simpleframework.xml.stream.Mode.$VALUES = r0
            return
    }

    Mode(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static org.simpleframework.xml.stream.Mode valueOf(java.lang.String r1) {
            java.lang.Class<org.simpleframework.xml.stream.Mode> r0 = org.simpleframework.xml.stream.Mode.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.simpleframework.xml.stream.Mode r1 = (org.simpleframework.xml.stream.Mode) r1
            return r1
    }

    public static org.simpleframework.xml.stream.Mode[] values() {
            org.simpleframework.xml.stream.Mode[] r0 = org.simpleframework.xml.stream.Mode.$VALUES
            java.lang.Object r0 = r0.clone()
            org.simpleframework.xml.stream.Mode[] r0 = (org.simpleframework.xml.stream.Mode[]) r0
            return r0
    }
}
