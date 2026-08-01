package defpackage;

/* JADX INFO: renamed from: ᛸᛱᛳᛵ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C1415 implements java.util.ListIterator, defpackage.InterfaceC0958 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public int f6199;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public int f6200;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public final /* synthetic */ int f6201;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public int f6202;

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public final defpackage.AbstractC1973 f6203;

    public C1415(defpackage.C0203 r2, int r3) {
            r1 = this;
            r0 = 1
            r1.f6201 = r0
            r1.<init>()
            r1.f6203 = r2
            r1.f6200 = r3
            r3 = -1
            r1.f6199 = r3
            int r2 = defpackage.C0203.m743(r2)
            r1.f6202 = r2
            return
    }

    public C1415(defpackage.C1339 r2, int r3) {
            r1 = this;
            r0 = 0
            r1.f6201 = r0
            r1.<init>()
            r1.f6203 = r2
            r1.f6200 = r3
            r3 = -1
            r1.f6199 = r3
            int r2 = defpackage.C1339.m2485(r2)
            r1.f6202 = r2
            return
    }

    @Override // java.util.ListIterator
    public final void add(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f6201
            r1 = -1
            ᲁᲈᲇᲁ r2 = r4.f6203
            switch(r0) {
                case 0: goto L1f;
                default: goto L8;
            }
        L8:
            r4.m2600()
            ᛱᲇᲀᛲ r2 = (defpackage.C0203) r2
            int r0 = r4.f6200
            int r3 = r0 + 1
            r4.f6200 = r3
            r2.add(r0, r5)
            r4.f6199 = r1
            int r5 = defpackage.C0203.m743(r2)
            r4.f6202 = r5
            return
        L1f:
            r4.m2599()
            ᛷᛸᛸᛷ r2 = (defpackage.C1339) r2
            int r0 = r4.f6200
            int r3 = r0 + 1
            r4.f6200 = r3
            r2.add(r0, r5)
            r4.f6199 = r1
            int r5 = defpackage.C1339.m2485(r2)
            r4.f6202 = r5
            return
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
            r4 = this;
            int r0 = r4.f6201
            r1 = 0
            r2 = 1
            ᲁᲈᲇᲁ r3 = r4.f6203
            switch(r0) {
                case 0: goto L13;
                default: goto L9;
            }
        L9:
            int r4 = r4.f6200
            ᛱᲇᲀᛲ r3 = (defpackage.C0203) r3
            int r0 = r3.f1277
            if (r4 >= r0) goto L12
            r1 = r2
        L12:
            return r1
        L13:
            int r4 = r4.f6200
            ᛷᛸᛸᛷ r3 = (defpackage.C1339) r3
            int r0 = r3.f5913
            if (r4 >= r0) goto L1c
            r1 = r2
        L1c:
            return r1
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
            r1 = this;
            int r0 = r1.f6201
            switch(r0) {
                case 0: goto Ld;
                default: goto L5;
            }
        L5:
            int r1 = r1.f6200
            if (r1 <= 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            return r1
        Ld:
            int r1 = r1.f6200
            if (r1 <= 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = 0
        L14:
            return r1
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final java.lang.Object next() {
            r3 = this;
            int r0 = r3.f6201
            ᲁᲈᲇᲁ r1 = r3.f6203
            switch(r0) {
                case 0: goto L23;
                default: goto L7;
            }
        L7:
            r3.m2600()
            int r0 = r3.f6200
            ᛱᲇᲀᛲ r1 = (defpackage.C0203) r1
            int r2 = r1.f1277
            if (r0 >= r2) goto L1d
            int r2 = r0 + 1
            r3.f6200 = r2
            r3.f6199 = r0
            java.lang.Object[] r3 = r1.f1278
            r3 = r3[r0]
            return r3
        L1d:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
        L23:
            r3.m2599()
            int r0 = r3.f6200
            ᛷᛸᛸᛷ r1 = (defpackage.C1339) r1
            int r2 = r1.f5913
            if (r0 >= r2) goto L3c
            int r2 = r0 + 1
            r3.f6200 = r2
            r3.f6199 = r0
            java.lang.Object[] r3 = r1.f5915
            int r1 = r1.f5914
            int r1 = r1 + r0
            r3 = r3[r1]
            return r3
        L3c:
            java.util.NoSuchElementException r3 = new java.util.NoSuchElementException
            r3.<init>()
            throw r3
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
            r1 = this;
            int r0 = r1.f6201
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r1 = r1.f6200
            return r1
        L8:
            int r1 = r1.f6200
            return r1
    }

    @Override // java.util.ListIterator
    public final java.lang.Object previous() {
            r2 = this;
            int r0 = r2.f6201
            ᲁᲈᲇᲁ r1 = r2.f6203
            switch(r0) {
                case 0: goto L21;
                default: goto L7;
            }
        L7:
            r2.m2600()
            int r0 = r2.f6200
            if (r0 <= 0) goto L1b
            int r0 = r0 + (-1)
            r2.f6200 = r0
            r2.f6199 = r0
            ᛱᲇᲀᛲ r1 = (defpackage.C0203) r1
            java.lang.Object[] r2 = r1.f1278
            r2 = r2[r0]
            return r2
        L1b:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
        L21:
            r2.m2599()
            int r0 = r2.f6200
            if (r0 <= 0) goto L38
            int r0 = r0 + (-1)
            r2.f6200 = r0
            r2.f6199 = r0
            ᛷᛸᛸᛷ r1 = (defpackage.C1339) r1
            java.lang.Object[] r2 = r1.f5915
            int r1 = r1.f5914
            int r1 = r1 + r0
            r2 = r2[r1]
            return r2
        L38:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
            r1 = this;
            int r0 = r1.f6201
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r1.f6200
        L7:
            int r1 = r1 + (-1)
            return r1
        La:
            int r1 = r1.f6200
            goto L7
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
            r4 = this;
            int r0 = r4.f6201
            java.lang.String r1 = "Call next() or previous() before removing element from the iterator."
            r2 = -1
            ᲁᲈᲇᲁ r3 = r4.f6203
            switch(r0) {
                case 0: goto L27;
                default: goto La;
            }
        La:
            ᛱᲇᲀᛲ r3 = (defpackage.C0203) r3
            r4.m2600()
            int r0 = r4.f6199
            if (r0 == r2) goto L23
            r3.mo750(r0)
            int r0 = r4.f6199
            r4.f6200 = r0
            r4.f6199 = r2
            int r0 = defpackage.C0203.m743(r3)
            r4.f6202 = r0
            goto L26
        L23:
            defpackage.C2264.m3676(r1)
        L26:
            return
        L27:
            ᛷᛸᛸᛷ r3 = (defpackage.C1339) r3
            r4.m2599()
            int r0 = r4.f6199
            if (r0 == r2) goto L40
            r3.mo750(r0)
            int r0 = r4.f6199
            r4.f6200 = r0
            r4.f6199 = r2
            int r0 = defpackage.C1339.m2485(r3)
            r4.f6202 = r0
            goto L43
        L40:
            defpackage.C2264.m3676(r1)
        L43:
            return
    }

    @Override // java.util.ListIterator
    public final void set(java.lang.Object r5) {
            r4 = this;
            int r0 = r4.f6201
            java.lang.String r1 = "Call next() or previous() before replacing element from the iterator."
            ᲁᲈᲇᲁ r2 = r4.f6203
            r3 = -1
            switch(r0) {
                case 0: goto L1b;
                default: goto La;
            }
        La:
            r4.m2600()
            int r4 = r4.f6199
            if (r4 == r3) goto L17
            ᛱᲇᲀᛲ r2 = (defpackage.C0203) r2
            r2.set(r4, r5)
            goto L1a
        L17:
            defpackage.C2264.m3676(r1)
        L1a:
            return
        L1b:
            r4.m2599()
            int r4 = r4.f6199
            if (r4 == r3) goto L28
            ᛷᛸᛸᛷ r2 = (defpackage.C1339) r2
            r2.set(r4, r5)
            goto L2b
        L28:
            defpackage.C2264.m3676(r1)
        L2b:
            return
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m2599() {
            r1 = this;
            ᲁᲈᲇᲁ r0 = r1.f6203
            ᛷᛸᛸᛷ r0 = (defpackage.C1339) r0
            ᛱᲇᲀᛲ r0 = r0.f5917
            int r0 = defpackage.C0203.m743(r0)
            int r1 = r1.f6202
            if (r0 != r1) goto Lf
            return
        Lf:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m2600() {
            r1 = this;
            ᲁᲈᲇᲁ r0 = r1.f6203
            ᛱᲇᲀᛲ r0 = (defpackage.C0203) r0
            int r0 = defpackage.C0203.m743(r0)
            int r1 = r1.f6202
            if (r0 != r1) goto Ld
            return
        Ld:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }
}
