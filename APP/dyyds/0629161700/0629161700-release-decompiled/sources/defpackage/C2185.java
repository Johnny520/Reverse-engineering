package defpackage;

/* JADX INFO: renamed from: ᲈᛲᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2185 {

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9271;

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f9272;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.reflect.Method f9273;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final java.lang.String f9274;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final java.lang.String f9275;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Field f9276;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.AbstractC0758 f9277;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f9278;

    public C2185(java.lang.String r1, java.lang.reflect.Field r2, java.lang.reflect.Method r3, defpackage.AbstractC0758 r4, defpackage.AbstractC0758 r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.f9273 = r3
            r0.f9272 = r4
            r0.f9277 = r5
            r0.f9278 = r6
            r0.f9271 = r7
            r0.f9275 = r1
            r0.f9276 = r2
            java.lang.String r1 = r2.getName()
            r0.f9274 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3580(defpackage.C0353 r3, java.lang.Object r4) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f9273
            if (r0 == 0) goto L22
            r1 = 0
            java.lang.Object r0 = r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> La
            goto L28
        La:
            r2 = move-exception
            r3 = 0
            java.lang.String r3 = defpackage.AbstractC2026.m3413(r0, r3)
            ᛲᛱᛶᲀ r4 = new ᛲᛱᛶᲀ
            java.lang.String r0 = "Accessor "
            java.lang.String r1 = " threw exception"
            java.lang.String r3 = defpackage.AbstractC0225.m817(r0, r3, r1)
            java.lang.Throwable r2 = r2.getCause()
            r4.<init>(r3, r2)
            throw r4
        L22:
            java.lang.reflect.Field r0 = r2.f9276
            java.lang.Object r0 = r0.get(r4)
        L28:
            if (r0 != r4) goto L2b
            return
        L2b:
            java.lang.String r4 = r2.f9275
            r3.m1072(r4)
            ᛴᲀᲈᛴ r2 = r2.f9272
            r2.mo561(r3, r0)
            return
    }
}
