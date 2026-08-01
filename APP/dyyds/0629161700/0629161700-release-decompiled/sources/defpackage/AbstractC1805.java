package defpackage;

/* JADX INFO: renamed from: ᲁᛲᛱᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1805 extends defpackage.AbstractC1493 implements defpackage.InterfaceC1151 {
    public AbstractC1805() {
            r1 = this;
            ᲀᛴᛱᛱ r0 = defpackage.C1654.f7364
            r1.<init>(r0)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.<init>(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r2 = defpackage.AbstractC0762.m1681(r2)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛲᛲᛸᲈ */
    public abstract void mo572(defpackage.InterfaceC0493 r1, java.lang.Runnable r2);

    @Override // defpackage.AbstractC1493, defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᛳᲁᲈᲁ */
    public final defpackage.InterfaceC1151 mo970(defpackage.InterfaceC1192 r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.AbstractC0250
            r1 = 0
            if (r0 == 0) goto Ld
            ᛲᛲᛵ r3 = (defpackage.AbstractC0250) r3
            ᛶᲈᲇᛶ r2 = r2.f6588
            if (r2 == r3) goto Lc
            return r1
        Lc:
            throw r1
        Ld:
            ᲀᛴᛱᛱ r0 = defpackage.C1654.f7364
            if (r0 != r3) goto L12
            return r2
        L12:
            return r1
    }

    /* JADX INFO: renamed from: ᛶᲈᲈᛸ */
    public boolean mo2540(defpackage.InterfaceC0493 r1) {
            r0 = this;
            boolean r0 = r0 instanceof defpackage.AbstractC0032
            r0 = r0 ^ 1
            return r0
    }

    @Override // defpackage.AbstractC1493, defpackage.InterfaceC0493
    /* JADX INFO: renamed from: ᲀᲀᛴᛳ */
    public final defpackage.InterfaceC0493 mo972(defpackage.InterfaceC1192 r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.AbstractC0250
            if (r0 == 0) goto Ld
            ᛲᛲᛵ r2 = (defpackage.AbstractC0250) r2
            ᛶᲈᲇᛶ r0 = r1.f6588
            if (r0 == r2) goto Lb
            return r1
        Lb:
            r1 = 0
            throw r1
        Ld:
            ᲀᛴᛱᛱ r0 = defpackage.C1654.f7364
            if (r0 != r2) goto L13
            ᛲᛶᛳᛱ r1 = defpackage.C0303.f1620
        L13:
            return r1
    }

    /* JADX INFO: renamed from: ᲈᛸᲇ, reason: contains not printable characters */
    public defpackage.AbstractC1805 mo3200(int r2) {
            r1 = this;
            defpackage.AbstractC2193.m3594(r2)
            ᲁᛵᛷᛳ r0 = new ᲁᛵᛷᛳ
            r0.<init>(r1, r2)
            return r0
    }
}
