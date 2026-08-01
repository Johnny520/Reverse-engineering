package defpackage;

/* JADX INFO: renamed from: ᲁᲁᲈᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1937 implements defpackage.InterfaceC2267 {

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public static final defpackage.C0980 f8438 = null;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final defpackage.C1180 f8439;

    static {
            r0 = 2500(0x9c4, float:3.503E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.String r1 = "com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout"
            ᛵᲇᛳᲇ r0 = defpackage.C0980.m1921(r0, r1)
            defpackage.C1937.f8438 = r0
            return
    }

    public C1937(defpackage.C1180 r1) {
            r0 = this;
            r0.<init>()
            r0.f8439 = r1
            return
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final boolean mo1265(java.lang.Object r1) {
            r0 = this;
            ᲈᛸᛳᛲ r1 = (defpackage.C2302) r1
            r0 = 1
            return r0
    }

    @Override // defpackage.InterfaceC2267
    /* JADX INFO: renamed from: ᲇᛶᛵᲇ */
    public final defpackage.C0402 mo1266(java.lang.Object r2, int r3, int r4, defpackage.C0533 r5) {
            r1 = this;
            ᲈᛸᛳᛲ r2 = (defpackage.C2302) r2
            ᛶᲈᛱᲈ r1 = r1.f8439
            java.lang.Object r1 = r1.f5356
            ᛱᲀᛱᲀ r1 = (defpackage.C0157) r1
            ᛴᲁᛴᲇ r3 = defpackage.C0765.m1695(r2)
            java.lang.Object r4 = r1.m1693(r3)
            java.util.ArrayDeque r0 = defpackage.C0765.f3558
            monitor-enter(r0)
            r0.offer(r3)     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            ᲈᛸᛳᛲ r4 = (defpackage.C2302) r4
            if (r4 != 0) goto L23
            ᛴᲁᛴᲇ r3 = defpackage.C0765.m1695(r2)
            r1.m1692(r3, r2)
            goto L24
        L23:
            r2 = r4
        L24:
            ᛵᲇᛳᲇ r1 = defpackage.C1937.f8438
            java.lang.Object r1 = r5.m1326(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            ᛳᛱᛱᛲ r3 = new ᛳᛱᛱᛲ
            ᛲᛲᛳᲀ r4 = new ᛲᛲᛳᲀ
            r4.<init>(r2, r1)
            r3.<init>(r2, r4)
            return r3
        L3b:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L3b
            throw r1
    }
}
