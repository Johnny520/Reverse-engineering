package p000;

/* JADX INFO: renamed from: τ */
/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public class C1096 implements java.util.Iterator, p000.lo0 {

    /* JADX INFO: renamed from: ε */
    public final /* synthetic */ int f13417;

    /* JADX INFO: renamed from: ζ */
    public int f13418;

    /* JADX INFO: renamed from: η */
    public final java.lang.Object f13419;

    public C1096(p000.AbstractC1099 r2) {
            r1 = this;
            r0 = 0
            r1.f13417 = r0
            r1.<init>()
            r1.f13419 = r2
            return
    }

    public C1096(java.lang.Object[] r2) {
            r1 = this;
            r0 = 1
            r1.f13417 = r0
            r2.getClass()
            r1.<init>()
            r1.f13419 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r1 = this;
            int r0 = r1.f13417
            switch(r0) {
                case 0: goto L12;
                default: goto L5;
            }
        L5:
            int r0 = r1.f13418
            java.lang.Object r1 = r1.f13419
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
            if (r0 >= r1) goto L10
            r1 = 1
            goto L11
        L10:
            r1 = 0
        L11:
            return r1
        L12:
            int r0 = r1.f13418
            java.lang.Object r1 = r1.f13419
            χ r1 = (p000.AbstractC1099) r1
            int r1 = r1.mo2340()
            if (r0 >= r1) goto L20
            r1 = 1
            goto L21
        L20:
            r1 = 0
        L21:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f13417
            switch(r0) {
                case 0: goto L23;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r3.f13419     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            java.lang.Object[] r0 = (java.lang.Object[]) r0     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            int r1 = r3.f13418     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            int r2 = r1 + 1
            r3.f13418 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            r3 = r0[r1]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L12
            return r3
        L12:
            r0 = move-exception
            int r1 = r3.f13418
            int r1 = r1 + (-1)
            r3.f13418 = r1
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r3.<init>(r0)
            throw r3
        L23:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r3.f13419
            χ r0 = (p000.AbstractC1099) r0
            int r1 = r3.f13418
            int r2 = r1 + 1
            r3.f13418 = r2
            java.lang.Object r3 = r0.get(r1)
            goto L3c
        L38:
            p000.C1080.m7277()
            r3 = 0
        L3c:
            return r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r1 = this;
            int r1 = r1.f13417
            switch(r1) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
        Ld:
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r1.<init>(r0)
            throw r1
    }
}
