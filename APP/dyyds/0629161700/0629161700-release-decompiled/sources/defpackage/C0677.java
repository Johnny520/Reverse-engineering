package defpackage;

/* JADX INFO: renamed from: ᛴᛵᛸᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0677 implements defpackage.InterfaceC0276 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.InterfaceC0598 f3262;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f3263;

    public /* synthetic */ C0677(defpackage.InterfaceC0598 r1, defpackage.AbstractC0343 r2, int r3) {
            r0 = this;
            r0.f3263 = r3
            r0.f3262 = r1
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0276
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo910(defpackage.C1007 r3) {
            r2 = this;
            int r0 = r2.f3263
            switch(r0) {
                case 0: goto L3f;
                default: goto L5;
            }
        L5:
            r0 = -654012134628910(0xfffdad2def0961d2, double:NaN)
            ᛳᲈᲇᛳ r2 = r2.f3262
            r2.mo617(r3)     // Catch: java.lang.Throwable -> L15
            ᲁᲀᛱᲁ r2 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L15
            goto L1c
        L15:
            r2 = move-exception
            ᛴᛸᛲᲀ r3 = new ᛴᛸᛲᲀ
            r3.<init>(r2)
            r2 = r3
        L1c:
            java.lang.Throwable r2 = defpackage.C2165.m3569(r2)
            if (r2 == 0) goto L3e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = -654050789334574(0xfffdad24ef0961d2, double:NaN)
            java.lang.String r0 = "Hook before failed: "
            r3.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            defpackage.AbstractC0343.m1009(r3, r2)
        L3e:
            return
        L3f:
            r2 = -676848475741742(0xfffd9868ef0961d2, double:NaN)
            return
    }

    @Override // defpackage.InterfaceC0276
    /* JADX INFO: renamed from: ᲇᛱᛸᲇ */
    public final void mo911(defpackage.C1741 r3) {
            r2 = this;
            int r0 = r2.f3263
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r2 = -676887130447406(0xfffd985fef0961d2, double:NaN)
            return
        Le:
            r0 = -535462447324718(0xfffe18ffef0961d2, double:NaN)
            ᛳᲈᲇᛳ r2 = r2.f3262
            r2.mo617(r3)     // Catch: java.lang.Throwable -> L1e
            ᲁᲀᛱᲁ r2 = defpackage.C1907.f8270     // Catch: java.lang.Throwable -> L1e
            goto L25
        L1e:
            r2 = move-exception
            ᛴᛸᛲᲀ r3 = new ᛴᛸᛲᲀ
            r3.<init>(r2)
            r2 = r3
        L25:
            java.lang.Throwable r2 = defpackage.C2165.m3569(r2)
            if (r2 == 0) goto L47
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r0 = -535501102030382(0xfffe18f6ef0961d2, double:NaN)
            java.lang.String r0 = "Hook after failed: "
            r3.<init>(r0)
            java.lang.String r0 = r2.getMessage()
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            defpackage.AbstractC0343.m1009(r3, r2)
        L47:
            return
    }
}
