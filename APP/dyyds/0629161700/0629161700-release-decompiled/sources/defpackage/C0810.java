package defpackage;

/* JADX INFO: renamed from: ᛵᛱᛴᛴ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C0810 extends java.lang.ClassLoader {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public static final /* synthetic */ int f3732 = 0;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.ClassLoader f3733;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.ClassLoader f3734;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.ClassLoader f3735;

    static {
            r0 = 83
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    public C0810(java.lang.ClassLoader r3, java.lang.ClassLoader r4) {
            r2 = this;
            r0 = -710907566399022(0xfffd796eef0961d2, double:NaN)
            r0 = -710929041235502(0xfffd7969ef0961d2, double:NaN)
            r2.<init>()
            r2.f3734 = r3
            r2.f3735 = r4
            java.lang.Class<android.content.Context> r3 = android.content.Context.class
            java.lang.ClassLoader r3 = r3.getClassLoader()
            r2.f3733 = r3
            return
    }

    @Override // java.lang.ClassLoader
    public final native java.net.URL getResource(java.lang.String r1);

    @Override // java.lang.ClassLoader
    public final native java.lang.Class loadClass(java.lang.String r1, boolean r2);
}
