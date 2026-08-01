package defpackage;

/* JADX INFO: renamed from: ᲁᲇᛸ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1947 implements defpackage.InterfaceC2182 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean f8471;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public final defpackage.C0852 f8472;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0520 f8473;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C0669 f8474;

    public AbstractC1947(defpackage.C0669 r1, defpackage.C0520 r2) {
            r0 = this;
            r0.<init>()
            r0.f8474 = r1
            r0.f8473 = r2
            ᛵᛳᛸᛶ r2 = new ᛵᛳᛸᛶ
            ᛷᛸᛱᛸ r1 = r1.f3242
            java.lang.Object r1 = r1.f5857
            ᲈᛵᲈᛵ r1 = (defpackage.C2252) r1
            ᲈᛱᲇᛳ r1 = r1.f9579
            ᛶᛵᛸᛱ r1 = r1.mo1707()
            r2.<init>(r1)
            r0.f8472 = r2
            return
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᛷᛲᲇᲈ */
    public final defpackage.C1077 mo1707() {
            r0 = this;
            ᛵᛳᛸᛶ r0 = r0.f8472
            return r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void m3363(defpackage.C0024 r6) {
            r5 = this;
            ᛴᛴᲈᛷ r0 = r5.f8474
            int r1 = r0.f3241
            r2 = 6
            if (r1 != r2) goto L8
            goto L2e
        L8:
            r3 = 5
            if (r1 != r3) goto L2f
            ᛵᛳᛸᛶ r1 = r5.f8472
            ᛶᛵᛸᛱ r3 = r1.f3891
            ᛳᲇᛲ r4 = defpackage.C1077.f4838
            r1.f3891 = r4
            r3.mo1800()
            r3.mo1801()
            r0.f3241 = r2
            int r1 = r6.size()
            if (r1 <= 0) goto L2e
            ᲈᛴᛶᲁ r0 = r0.f3243
            if (r0 == 0) goto L2e
            ᛸᛶᛱᛵ r0 = r0.f9505
            if (r0 == 0) goto L2e
            ᛳᛸᛲ r5 = r5.f8473
            defpackage.AbstractC0232.m839(r0, r5, r6)
        L2e:
            return
        L2f:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            int r6 = r0.f3241
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "state: "
            r0.<init>(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r5.<init>(r6)
            throw r5
    }

    @Override // defpackage.InterfaceC2182
    /* JADX INFO: renamed from: ᲇᛸᲁᛱ */
    public long mo782(long r3, defpackage.C1569 r5) {
            r2 = this;
            ᛴᛴᲈᛷ r0 = r2.f8474
            ᛷᛸᛱᛸ r1 = r0.f3242     // Catch: java.io.IOException -> Ld
            java.lang.Object r1 = r1.f5857     // Catch: java.io.IOException -> Ld
            ᲈᛵᲈᛵ r1 = (defpackage.C2252) r1     // Catch: java.io.IOException -> Ld
            long r2 = r1.mo782(r3, r5)     // Catch: java.io.IOException -> Ld
            return r2
        Ld:
            r3 = move-exception
            ᛳᲁᲀᲇ r4 = r0.f3244
            r4.mo1355()
            ᛱᛱᛷᛳ r4 = defpackage.C0669.f3239
            r2.m3363(r4)
            throw r3
    }
}
