package defpackage;

/* JADX INFO: renamed from: ᛷᛶᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1288 implements defpackage.InterfaceC1753, defpackage.InterfaceC0532 {

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5723;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ java.lang.Object f5724;

    public /* synthetic */ C1288(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.f5724 = r1
            r0.f5723 = r2
            r0.<init>()
            return
    }

    @Override // defpackage.InterfaceC0532
    /* JADX INFO: renamed from: ᛷᛸᛵᲇ */
    public defpackage.C2300 mo1325(android.view.View r2, defpackage.C2300 r3) {
            r1 = this;
            java.lang.Object r2 = r1.f5724
            ᛱᛶᛴ r2 = (defpackage.C0112) r2
            java.lang.Object r1 = r1.f5723
            ᛷᛸᛳᛶ r1 = (defpackage.C1331) r1
            boolean r0 = r2.f978
            if (r0 == 0) goto Ld
            return r3
        Ld:
            ᛷᛸᛳᛶ r0 = new ᛷᛸᛳᛶ
            r0.<init>(r1)
            r2.m626(r3, r0)
            return r3
    }

    @Override // defpackage.InterfaceC1753
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public void mo740(com.kongzue.dialogx.interfaces.AbstractC0008 r10) {
            r9 = this;
            java.lang.Object r0 = r9.f5724
            ᛶᛱᛵᛳ r0 = (defpackage.C1006) r0
            java.lang.Object r9 = r9.f5723
            ᛳᲈᲇᛳ r9 = (defpackage.InterfaceC0598) r9
            ᛶᛵᛳᛸ r10 = (defpackage.C1069) r10
            int r10 = r10.f4773
            r1 = 2
            r2 = 0
            if (r10 != r1) goto L12
            r10 = 1
            goto L13
        L12:
            r10 = r2
        L13:
            if (r10 == 0) goto L5e
            int r1 = r0.f4472
            java.util.ArrayList r3 = defpackage.AbstractC0577.m1372()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r3.remove(r4)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r3.add(r2, r1)
            int r1 = r3.size()
            r2 = 8
            if (r1 <= r2) goto L3c
            int r1 = r3.size()
            java.util.List r1 = r3.subList(r2, r1)
            r1.clear()
        L3c:
            com.tencent.mmkv.MMKV r1 = defpackage.AbstractC0902.m1871()
            r4 = -96903336730158(0xffffa7ddef0961d2, double:NaN)
            java.lang.String r2 = "color_picker_recent"
            r4 = -96989236076078(0xffffa7c9ef0961d2, double:NaN)
            java.lang.String r4 = ","
            r7 = 0
            r8 = 62
            r5 = 0
            r6 = 0
            java.lang.String r3 = defpackage.AbstractC1107.m2125(r3, r4, r5, r6, r7, r8)
            r1.putString(r2, r3)
        L5e:
            if (r10 == 0) goto L67
            int r10 = r0.f4472
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            goto L68
        L67:
            r10 = 0
        L68:
            r9.mo617(r10)
            return
    }
}
