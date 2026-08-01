package defpackage;

/* JADX INFO: renamed from: ᛷᲀᛸᲁ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1356 implements defpackage.InterfaceC0715 {
    static {
            r0 = 38
            com.android.NativeUtil.classesInit0(r0)
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static /* synthetic */ void m2533(java.lang.String r2, int r3, java.lang.Object r4, int r5) {
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            r1.append(r3)
            r1.append(r4)
            r1.append(r5)
            java.lang.String r2 = ")."
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
    }

    @Override // defpackage.InterfaceC0715
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public native boolean mo560(com.ss.android.ugc.aweme.feed.model.Aweme r1);
}
