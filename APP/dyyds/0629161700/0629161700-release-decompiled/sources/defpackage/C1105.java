package defpackage;

/* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public class C1105 implements java.util.Iterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public final java.lang.Object f4941;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f4942;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f4943;

    public /* synthetic */ C1105(int r1, java.lang.Object r2) {
            r0 = this;
            r0.f4943 = r1
            r0.f4941 = r2
            r0.<init>()
            return
    }

    public C1105(defpackage.C0265 r2) {
            r1 = this;
            r0 = 2
            r1.f4943 = r0
            r1.<init>()
            ᛶᲁᛴ r0 = r2.f1525
            java.util.Iterator r0 = r0.iterator()
            r1.f4941 = r0
            int r2 = r2.f1526
            r1.f4942 = r2
            return
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f4943
            r1 = 0
            r2 = 1
            java.lang.Object r3 = r4.f4941
            switch(r0) {
                case 0: goto L39;
                case 1: goto L30;
                case 2: goto L15;
                default: goto L9;
            }
        L9:
            int r4 = r4.f4942
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            int r0 = r3.getChildCount()
            if (r4 >= r0) goto L14
            r1 = r2
        L14:
            return r1
        L15:
            java.util.Iterator r3 = (java.util.Iterator) r3
        L17:
            int r0 = r4.f4942
            if (r0 <= 0) goto L2b
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2b
            r3.next()
            int r0 = r4.f4942
            int r0 = r0 + (-1)
            r4.f4942 = r0
            goto L17
        L2b:
            boolean r4 = r3.hasNext()
            return r4
        L30:
            int r4 = r4.f4942
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            int r0 = r3.length
            if (r4 >= r0) goto L38
            r1 = r2
        L38:
            return r1
        L39:
            int r4 = r4.f4942
            ᲇᲀᛲᛱ r3 = (defpackage.AbstractC2115) r3
            int r0 = r3.mo395()
            if (r4 >= r0) goto L44
            r1 = r2
        L44:
            return r1
    }

    @Override // java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f4943
            java.lang.Object r1 = r3.f4941
            switch(r0) {
                case 0: goto L53;
                case 1: goto L37;
                case 2: goto L1c;
                default: goto L7;
            }
        L7:
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            int r0 = r3.f4942
            int r2 = r0 + 1
            r3.f4942 = r2
            android.view.View r3 = r1.getChildAt(r0)
            if (r3 == 0) goto L16
            return r3
        L16:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
        L1c:
            java.util.Iterator r1 = (java.util.Iterator) r1
        L1e:
            int r0 = r3.f4942
            if (r0 <= 0) goto L32
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L32
            r1.next()
            int r0 = r3.f4942
            int r0 = r0 + (-1)
            r3.f4942 = r0
            goto L1e
        L32:
            java.lang.Object r3 = r1.next()
            return r3
        L37:
            java.lang.Object[] r1 = (java.lang.Object[]) r1     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L42
            int r0 = r3.f4942     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L42
            int r2 = r0 + 1
            r3.f4942 = r2     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L42
            r3 = r1[r0]     // Catch: java.lang.ArrayIndexOutOfBoundsException -> L42
            return r3
        L42:
            r0 = move-exception
            int r1 = r3.f4942
            int r1 = r1 + (-1)
            r3.f4942 = r1
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            java.lang.String r0 = r0.getMessage()
            r3.<init>(r0)
            throw r3
        L53:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L66
            ᲇᲀᛲᛱ r1 = (defpackage.AbstractC2115) r1
            int r0 = r3.f4942
            int r2 = r0 + 1
            r3.f4942 = r2
            java.lang.Object r3 = r1.get(r0)
            return r3
        L66:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.Iterator
    public final void remove() {
            r2 = this;
            int r0 = r2.f4943
            switch(r0) {
                case 0: goto L23;
                case 1: goto L1b;
                case 2: goto L13;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r2.f4941
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = r2.f4942
            int r1 = r1 + (-1)
            r2.f4942 = r1
            r0.removeViewAt(r1)
            return
        L13:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L1b:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
        L23:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }
}
