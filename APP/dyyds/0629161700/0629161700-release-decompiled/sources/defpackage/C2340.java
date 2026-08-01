package defpackage;

/* JADX INFO: renamed from: ᲈᲁᛸᛶ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2340 extends defpackage.AbstractC1346 implements java.util.Iterator {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ int f10096;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public defpackage.C0672 f10097;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0672 f10098;

    public C2340(defpackage.C0672 r1, defpackage.C0672 r2, int r3) {
            r0 = this;
            r0.f10096 = r3
            r0.<init>()
            r0.f10098 = r2
            r0.f10097 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r0 = this;
            ᛴᛵᛳ r0 = r0.f10097
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r2 = this;
            ᛴᛵᛳ r0 = r2.f10097
            ᛴᛵᛳ r1 = r2.f10098
            if (r0 == r1) goto Le
            if (r1 != 0) goto L9
            goto Le
        L9:
            ᛴᛵᛳ r1 = r2.m3821(r0)
            goto Lf
        Le:
            r1 = 0
        Lf:
            r2.f10097 = r1
            return r0
    }

    @Override // defpackage.AbstractC1346
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ */
    public final void mo793(defpackage.C0672 r4) {
            r3 = this;
            ᛴᛵᛳ r0 = r3.f10098
            r1 = 0
            if (r0 != r4) goto Le
            ᛴᛵᛳ r2 = r3.f10097
            if (r4 != r2) goto Le
            r3.f10097 = r1
            r3.f10098 = r1
            r0 = r1
        Le:
            r2 = r0
            if (r0 != r4) goto L1f
            int r2 = r3.f10096
            switch(r2) {
                case 0: goto L1a;
                default: goto L16;
            }
        L16:
            ᛴᛵᛳ r0 = r0.f3253
        L18:
            r2 = r0
            goto L1d
        L1a:
            ᛴᛵᛳ r0 = r0.f3256
            goto L18
        L1d:
            r3.f10098 = r2
        L1f:
            ᛴᛵᛳ r0 = r3.f10097
            if (r0 != r4) goto L2e
            if (r0 == r2) goto L2c
            if (r2 != 0) goto L28
            goto L2c
        L28:
            ᛴᛵᛳ r1 = r3.m3821(r0)
        L2c:
            r3.f10097 = r1
        L2e:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public final defpackage.C0672 m3821(defpackage.C0672 r1) {
            r0 = this;
            int r0 = r0.f10096
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            ᛴᛵᛳ r0 = r1.f3256
            return r0
        L8:
            ᛴᛵᛳ r0 = r1.f3253
            return r0
    }
}
