package defpackage;

/* JADX INFO: renamed from: ᛱᲈᛷᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C0220 extends defpackage.AbstractC1346 implements java.util.Iterator {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final /* synthetic */ defpackage.C1418 f1344;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public boolean f1345;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public defpackage.C0672 f1346;

    public C0220(defpackage.C1418 r1) {
            r0 = this;
            r0.<init>()
            r0.f1344 = r1
            r1 = 1
            r0.f1345 = r1
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            boolean r0 = r1.f1345
            if (r0 == 0) goto Lb
            ᛸᛱᛴᲀ r1 = r1.f1344
            ᛴᛵᛳ r1 = r1.f6209
            if (r1 == 0) goto L15
            goto L13
        Lb:
            ᛴᛵᛳ r1 = r1.f1346
            if (r1 == 0) goto L15
            ᛴᛵᛳ r1 = r1.f3253
            if (r1 == 0) goto L15
        L13:
            r1 = 1
            return r1
        L15:
            r1 = 0
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r1 = this;
            boolean r0 = r1.f1345
            if (r0 == 0) goto Le
            r0 = 0
            r1.f1345 = r0
            ᛸᛱᛴᲀ r0 = r1.f1344
            ᛴᛵᛳ r0 = r0.f6209
            r1.f1346 = r0
            return r0
        Le:
            ᛴᛵᛳ r0 = r1.f1346
            if (r0 == 0) goto L15
            ᛴᛵᛳ r0 = r0.f3253
            goto L16
        L15:
            r0 = 0
        L16:
            r1.f1346 = r0
            return r0
    }

    @Override // defpackage.AbstractC1346
    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final void mo793(defpackage.C0672 r2) {
            r1 = this;
            ᛴᛵᛳ r0 = r1.f1346
            if (r2 != r0) goto Lf
            ᛴᛵᛳ r2 = r0.f3256
            r1.f1346 = r2
            if (r2 != 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.f1345 = r2
        Lf:
            return
    }
}
