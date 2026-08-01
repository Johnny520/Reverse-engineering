package defpackage;

/* JADX INFO: loaded from: classes.dex */
public enum hk extends java.lang.Enum {
    public static final defpackage.hk a = null;
    public static final /* synthetic */ defpackage.hk[] b = null;

    static {
            hk r0 = new hk
            java.lang.String r1 = "TOP_DOWN"
            r2 = 0
            r0.<init>(r1, r2)
            hk r1 = new hk
            java.lang.String r2 = "BOTTOM_UP"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.hk.a = r1
            hk[] r0 = new defpackage.hk[]{r0, r1}
            defpackage.hk.b = r0
            return
    }

    public static defpackage.hk valueOf(java.lang.String r1) {
            java.lang.Class<hk> r0 = defpackage.hk.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hk r1 = (defpackage.hk) r1
            return r1
    }

    public static defpackage.hk[] values() {
            hk[] r0 = defpackage.hk.b
            java.lang.Object r0 = r0.clone()
            hk[] r0 = (defpackage.hk[]) r0
            return r0
    }
}
