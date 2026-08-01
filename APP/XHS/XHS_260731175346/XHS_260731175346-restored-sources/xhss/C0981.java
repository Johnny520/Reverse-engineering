package xhss;

/* JADX INFO: renamed from: xhss.ᲁᲀᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc */
/* JADX INFO: loaded from: classes.dex */
public final class C0981 {

    /* JADX INFO: renamed from: ᛱᛱᛲᲇ, reason: contains not printable characters */
    public final java.lang.reflect.Field f3184;

    /* JADX INFO: renamed from: ᛳᲁᲇᛸ, reason: contains not printable characters */
    public final java.lang.String f3185;

    /* JADX INFO: renamed from: ᛷᛴᛷᛱ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f3186;

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final java.lang.String f3187;

    /* JADX INFO: renamed from: ᛸᛴᛶᛳ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3188;

    /* JADX INFO: renamed from: ᲀᲇᛳᲁ, reason: contains not printable characters */
    public final /* synthetic */ boolean f3189;

    /* JADX INFO: renamed from: ᲇᛴᲇᛵ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.reflect.Method f3190;

    /* JADX INFO: renamed from: ᲇᛶᛴᲀ, reason: contains not printable characters */
    public final /* synthetic */ xhss.AbstractC0121 f3191;

    public C0981(java.lang.String r1, java.lang.reflect.Field r2, java.lang.reflect.Method r3, xhss.AbstractC0121 r4, xhss.AbstractC0121 r5, boolean r6, boolean r7) {
            r0 = this;
            r0.<init>()
            r0.f3190 = r3
            r0.f3186 = r4
            r0.f3191 = r5
            r0.f3189 = r6
            r0.f3188 = r7
            r0.f3187 = r1
            r0.f3184 = r2
            java.lang.String r1 = r2.getName()
            r0.f3185 = r1
            return
    }

    /* JADX INFO: renamed from: ᛷᛵᛵᲈ, reason: contains not printable characters */
    public final void m1617(xhss.C0827 r3, java.lang.Object r4) {
            r2 = this;
            java.lang.reflect.Method r0 = r2.f3190
            if (r0 == 0) goto L22
            r1 = 0
            java.lang.Object r0 = r0.invoke(r4, r1)     // Catch: java.lang.reflect.InvocationTargetException -> La
            goto L28
        La:
            r2 = move-exception
            r3 = 0
            java.lang.String r3 = xhss.AbstractC1031.m1680(r0, r3)
            xhss.ᛱᲈᛲᛷ r4 = new xhss.ᛱᲈᛲᛷ
            java.lang.String r0 = "Accessor "
            java.lang.String r1 = " threw exception"
            java.lang.String r3 = xhss.AbstractC0390.m781(r0, r3, r1)
            java.lang.Throwable r2 = r2.getCause()
            r4.<init>(r3, r2)
            throw r4
        L22:
            java.lang.reflect.Field r0 = r2.f3184
            java.lang.Object r0 = r0.get(r4)
        L28:
            if (r0 != r4) goto L2b
            return
        L2b:
            java.lang.String r4 = r2.f3187
            r3.m1403(r4)
            xhss.ᛲᛱᛶᛴ r2 = r2.f3186
            r2.mo120(r3, r0)
            return
    }
}
