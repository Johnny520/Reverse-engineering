package defpackage;

/* JADX INFO: renamed from: ᲈᛷᲀᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-65b058289e3cb96da105536443e3beb4a8f831596ad09af536e247b4a16ebae5 */
/* JADX INFO: loaded from: classes.dex */
public final class C2295 {

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public java.lang.Object f9710;

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public java.lang.Object f9711;

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public int f9712;

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public final /* synthetic */ int f9713;

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public java.lang.Object f9714;

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public java.lang.Object f9715;

    public C2295(int r2) {
            r1 = this;
            r1.f9713 = r2
            switch(r2) {
                case 2: goto L6f;
                default: goto L5;
            }
        L5:
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9714 = r2
            ᛳᲈᛳᛸ r2 = new ᛳᲈᛳᛸ
            r0 = 1
            r2.<init>(r0)
            r1.f9711 = r2
            ᛶᲀᛱᛴ r2 = new ᛶᲀᛱᛴ
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.f9715 = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Collections.synchronizedMap(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Collections.synchronizedMap(r2)
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            java.util.Collections.synchronizedMap(r2)
            ᲀᛴᛱᛱ r2 = new ᲀᛴᛱᛱ
            r2.<init>(r1)
            java.util.concurrent.CopyOnWriteArrayList r2 = new java.util.concurrent.CopyOnWriteArrayList
            r2.<init>()
            ᛵᛳᲀᲀ r2 = new ᛵᛳᲀᲀ
            r0 = 0
            r2.<init>(r1, r0)
            ᛵᛳᲀᲀ r2 = new ᛵᛳᲀᲀ
            r0 = 1
            r2.<init>(r1, r0)
            ᲀᛵᛳᲁ r2 = new ᲀᛵᛳᲁ
            r0 = 0
            r2.<init>(r1, r0)
            ᲀᛵᛳᲁ r2 = new ᲀᛵᛳᲁ
            r0 = 1
            r2.<init>(r1, r0)
            r2 = -1
            r1.f9712 = r2
            ᲈᛶᛵᲇ r2 = new ᲈᛶᛵᲇ
            java.util.ArrayDeque r2 = new java.util.ArrayDeque
            r2.<init>()
            ᛳᛳᛵᛲ r2 = new ᛳᛳᛵᛲ
            r0 = 9
            r2.<init>(r0, r1)
            return
        L6f:
            r1.<init>()
            r2 = -1
            r1.f9712 = r2
            return
    }

    public C2295(defpackage.C1662 r2) {
            r1 = this;
            r0 = 0
            r1.f9713 = r0
            r1.<init>()
            r1.f9712 = r0
            r1.f9711 = r2
            ᛱᲀᛸᛴ r2 = new ᛱᲀᛸᛴ
            r2.<init>()
            r1.f9710 = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.f9714 = r2
            return
    }

    /* JADX INFO: renamed from: ᲁᲈᲇᲁ, reason: contains not printable characters */
    public static boolean m3710(defpackage.AbstractComponentCallbacksC0293 r0) {
            if (r0 != 0) goto L3
            goto L7
        L3:
            boolean r0 = r0.f1605
            if (r0 == 0) goto L9
        L7:
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    /* JADX INFO: renamed from: ᲇᲀᛲᛱ, reason: contains not printable characters */
    public static boolean m3711(int r1) {
            java.lang.String r0 = "FragmentManager"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.f9713
            switch(r0) {
                case 0: goto L35;
                case 1: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 128(0x80, float:1.8E-43)
            r0.<init>(r1)
            java.lang.String r1 = "FragmentManager{"
            r0.append(r1)
            int r2 = java.lang.System.identityHashCode(r2)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r0.append(r2)
            java.lang.String r2 = " in "
            r0.append(r2)
            java.lang.String r2 = "null"
            r0.append(r2)
            java.lang.String r2 = "}}"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r2.f9710
            ᛱᲀᛸᛴ r1 = (defpackage.C0167) r1
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.lang.Object r2 = r2.f9714
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            int r2 = r2.size()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    /* JADX INFO: renamed from: ᛱᛳᛲᛸ, reason: contains not printable characters */
    public boolean m3712() {
            r4 = this;
            int r0 = r4.f9712
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            java.lang.Object r4 = r4.f9711
            ᛳᲈᛳᛸ r4 = (defpackage.C0588) r4
            java.util.List r4 = r4.m1390()
            java.util.Iterator r4 = r4.iterator()
        L13:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L31
            java.lang.Object r0 = r4.next()
            ᛲᛵᛴᲁ r0 = (defpackage.AbstractComponentCallbacksC0293) r0
            if (r0 == 0) goto L13
            boolean r3 = m3710(r0)
            if (r3 == 0) goto L13
            ᲈᛷᲀᲀ r0 = r0.f1601
            boolean r0 = r0.m3712()
            if (r0 == 0) goto L13
            r1 = r2
            goto L13
        L31:
            return r1
    }

    /* JADX INFO: renamed from: ᛲᛲᛵ, reason: contains not printable characters */
    public int m3713() {
            r1 = this;
            java.lang.Object r0 = r1.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            ᛱᛳᛶᛱ r0 = r0.f7409
            int r0 = r0.getChildCount()
            java.lang.Object r1 = r1.f9714
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ᛲᛴᛱᛶ, reason: contains not printable characters */
    public int m3714(int r4) {
            r3 = this;
            java.lang.Object r0 = r3.f9710
            ᛱᲀᛸᛴ r0 = (defpackage.C0167) r0
            if (r4 >= 0) goto L7
            goto L2a
        L7:
            java.lang.Object r3 = r3.f9711
            ᲀᛴᛴᛸ r3 = (defpackage.C1662) r3
            ᛱᛳᛶᛱ r3 = r3.f7409
            int r3 = r3.getChildCount()
            r1 = r4
        L12:
            if (r1 >= r3) goto L2a
            int r2 = r0.m702(r1)
            int r2 = r1 - r2
            int r2 = r4 - r2
            if (r2 != 0) goto L28
        L1e:
            boolean r3 = r0.m699(r1)
            if (r3 == 0) goto L27
            int r1 = r1 + 1
            goto L1e
        L27:
            return r1
        L28:
            int r1 = r1 + r2
            goto L12
        L2a:
            r3 = -1
            return r3
    }

    /* JADX INFO: renamed from: ᛲᛴᲇᛳ, reason: contains not printable characters */
    public void m3715() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "FragmentManager has not been attached to a host."
            r1.<init>(r0)
            throw r1
    }

    /* JADX INFO: renamed from: ᛴᛸᲀ, reason: contains not printable characters */
    public void m3716(android.view.View r4) {
            r3 = this;
            java.lang.Object r0 = r3.f9714
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r0.add(r4)
            java.lang.Object r3 = r3.f9711
            ᲀᛴᛴᛸ r3 = (defpackage.C1662) r3
            ᲈᛸᲈᛷ r4 = defpackage.C0055.m405(r4)
            if (r4 == 0) goto L35
            android.view.View r0 = r4.f9791
            ᛱᛳᛶᛱ r3 = r3.f7409
            int r1 = r4.f9794
            r2 = -1
            if (r1 == r2) goto L1d
            r4.f9798 = r1
            goto L23
        L1d:
            int r1 = r0.getImportantForAccessibility()
            r4.f9798 = r1
        L23:
            boolean r1 = r3.m437()
            r2 = 4
            if (r1 == 0) goto L32
            r4.f9794 = r2
            java.util.ArrayList r3 = r3.f638
            r3.add(r4)
            return
        L32:
            r0.setImportantForAccessibility(r2)
        L35:
            return
    }

    /* JADX INFO: renamed from: ᛵᛱᛵᛲ, reason: contains not printable characters */
    public boolean m3717() {
            r7 = this;
            int r0 = r7.f9712
            r1 = 0
            r2 = 1
            if (r0 >= r2) goto L7
            return r1
        L7:
            java.lang.Object r0 = r7.f9711
            ᛳᲈᛳᛸ r0 = (defpackage.C0588) r0
            java.util.List r0 = r0.m1390()
            java.util.Iterator r0 = r0.iterator()
            r3 = 0
            r4 = r1
        L15:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L3d
            java.lang.Object r5 = r0.next()
            ᛲᛵᛴᲁ r5 = (defpackage.AbstractComponentCallbacksC0293) r5
            if (r5 == 0) goto L15
            boolean r6 = m3710(r5)
            if (r6 == 0) goto L15
            ᲈᛷᲀᲀ r6 = r5.f1601
            boolean r6 = r6.m3717()
            if (r6 == 0) goto L15
            if (r3 != 0) goto L38
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L38:
            r3.add(r5)
            r4 = r2
            goto L15
        L3d:
            java.lang.Object r0 = r7.f9710
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L65
        L43:
            java.lang.Object r0 = r7.f9710
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r1 >= r0) goto L65
            java.lang.Object r0 = r7.f9710
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r0 = r0.get(r1)
            ᛲᛵᛴᲁ r0 = (defpackage.AbstractComponentCallbacksC0293) r0
            if (r3 == 0) goto L5f
            boolean r2 = r3.contains(r0)
            if (r2 != 0) goto L62
        L5f:
            r0.getClass()
        L62:
            int r1 = r1 + 1
            goto L43
        L65:
            r7.f9710 = r3
            return r4
    }

    /* JADX INFO: renamed from: ᛶᛷᛱᲀ, reason: contains not printable characters */
    public android.view.View m3718(int r1) {
            r0 = this;
            java.lang.Object r0 = r0.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            ᛱᛳᛶᛱ r0 = r0.f7409
            android.view.View r0 = r0.getChildAt(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᛷᛲᲇᲈ, reason: contains not printable characters */
    public void m3719(boolean r3) {
            r2 = this;
            java.lang.Object r2 = r2.f9711
            ᛳᲈᛳᛸ r2 = (defpackage.C0588) r2
            java.util.List r2 = r2.m1390()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            ᛲᛵᛴᲁ r0 = (defpackage.AbstractComponentCallbacksC0293) r0
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Lc
            ᲈᛷᲀᲀ r0 = r0.f1601
            r1 = 1
            r0.m3719(r1)
            goto Lc
        L23:
            return
    }

    /* JADX INFO: renamed from: ᛷᛸᛵᲇ, reason: contains not printable characters */
    public void m3720(int r4) {
            r3 = this;
            int r4 = r3.m3714(r4)
            java.lang.Object r0 = r3.f9710
            ᛱᲀᛸᛴ r0 = (defpackage.C0167) r0
            r0.m704(r4)
            java.lang.Object r3 = r3.f9711
            ᲀᛴᛴᛸ r3 = (defpackage.C1662) r3
            ᛱᛳᛶᛱ r3 = r3.f7409
            android.view.View r0 = r3.getChildAt(r4)
            if (r0 == 0) goto L59
            ᲈᛸᲈᛷ r0 = defpackage.C0055.m405(r0)
            if (r0 == 0) goto L5d
            boolean r1 = r0.m3777()
            if (r1 == 0) goto L3c
            boolean r1 = r0.m3787()
            if (r1 == 0) goto L2a
            goto L3c
        L2a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r1 = "called detach on an already detached child "
            r4.<init>(r1)
            r4.append(r0)
            java.lang.String r3 = r3.m457()
            defpackage.C2264.m3670(r4, r3)
            return
        L3c:
            boolean r1 = defpackage.C0055.f605
            if (r1 == 0) goto L53
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "tmpDetach "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.d(r2, r1)
        L53:
            r1 = 256(0x100, float:3.59E-43)
            r0.m3784(r1)
            goto L5d
        L59:
            boolean r0 = defpackage.C0055.f603
            if (r0 != 0) goto L61
        L5d:
            defpackage.C0055.m407(r3, r4)
            return
        L61:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.m457()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "No view at offset "
            r1.<init>(r2)
            r1.append(r4)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    /* JADX INFO: renamed from: ᛷᲁᛳᛳ, reason: contains not printable characters */
    public void m3721(android.view.View r3, int r4, boolean r5) {
            r2 = this;
            java.lang.Object r0 = r2.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            ᛱᛳᛶᛱ r0 = r0.f7409
            if (r4 >= 0) goto Ld
            int r4 = r0.getChildCount()
            goto L11
        Ld:
            int r4 = r2.m3714(r4)
        L11:
            java.lang.Object r1 = r2.f9710
            ᛱᲀᛸᛴ r1 = (defpackage.C0167) r1
            r1.m698(r4, r5)
            if (r5 == 0) goto L1d
            r2.m3716(r3)
        L1d:
            r0.addView(r3, r4)
            ᲈᛸᲈᛷ r2 = defpackage.C0055.m405(r3)
            ᛶᲈᲀᲇ r3 = r0.f633
            if (r3 == 0) goto L2d
            if (r2 == 0) goto L2d
            r3.onViewAttachedToWindow(r2)
        L2d:
            java.util.ArrayList r2 = r0.f616
            if (r2 == 0) goto L47
            int r2 = r2.size()
            int r2 = r2 + (-1)
        L37:
            if (r2 < 0) goto L47
            java.util.ArrayList r3 = r0.f616
            java.lang.Object r3 = r3.get(r2)
            ᛲᲇᛷᲁ r3 = (defpackage.C0375) r3
            r3.getClass()
            int r2 = r2 + (-1)
            goto L37
        L47:
            return
    }

    /* JADX INFO: renamed from: ᛸᛵᛸᛷ, reason: contains not printable characters */
    public android.view.View m3722(int r1) {
            r0 = this;
            int r1 = r0.m3714(r1)
            java.lang.Object r0 = r0.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            ᛱᛳᛶᛱ r0 = r0.f7409
            android.view.View r0 = r0.getChildAt(r1)
            return r0
    }

    /* JADX INFO: renamed from: ᲀᛳᲀᛵ, reason: contains not printable characters */
    public int m3723() {
            r0 = this;
            java.lang.Object r0 = r0.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            ᛱᛳᛶᛱ r0 = r0.f7409
            int r0 = r0.getChildCount()
            return r0
    }

    /* JADX INFO: renamed from: ᲇᛱᛸᲇ, reason: contains not printable characters */
    public void m3724(android.view.View r3) {
            r2 = this;
            java.lang.Object r0 = r2.f9714
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.remove(r3)
            if (r0 == 0) goto L2e
            java.lang.Object r2 = r2.f9711
            ᲀᛴᛴᛸ r2 = (defpackage.C1662) r2
            ᲈᛸᲈᛷ r3 = defpackage.C0055.m405(r3)
            if (r3 == 0) goto L2e
            ᛱᛳᛶᛱ r2 = r2.f7409
            int r0 = r3.f9798
            boolean r1 = r2.m437()
            if (r1 == 0) goto L26
            r3.f9794 = r0
            java.util.ArrayList r2 = r2.f638
            r2.add(r3)
            goto L2b
        L26:
            android.view.View r2 = r3.f9791
            r2.setImportantForAccessibility(r0)
        L2b:
            r2 = 0
            r3.f9798 = r2
        L2e:
            return
    }

    /* JADX INFO: renamed from: ᲇᛶᛵᲇ, reason: contains not printable characters */
    public void m3725(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5, boolean r6) {
            r2 = this;
            java.lang.Object r0 = r2.f9711
            ᲀᛴᛴᛸ r0 = (defpackage.C1662) r0
            ᛱᛳᛶᛱ r0 = r0.f7409
            if (r4 >= 0) goto Ld
            int r4 = r0.getChildCount()
            goto L11
        Ld:
            int r4 = r2.m3714(r4)
        L11:
            java.lang.Object r1 = r2.f9710
            ᛱᲀᛸᛴ r1 = (defpackage.C0167) r1
            r1.m698(r4, r6)
            if (r6 == 0) goto L1d
            r2.m3716(r3)
        L1d:
            ᲈᛸᲈᛷ r2 = defpackage.C0055.m405(r3)
            if (r2 == 0) goto L60
            boolean r6 = r2.m3777()
            if (r6 != 0) goto L42
            boolean r6 = r2.m3787()
            if (r6 == 0) goto L30
            goto L42
        L30:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Called attach on a child which is not detached: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r0.m457()
            defpackage.C2264.m3670(r3, r2)
            return
        L42:
            boolean r6 = defpackage.C0055.f605
            if (r6 == 0) goto L59
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = "reAttach "
            r6.<init>(r1)
            r6.append(r2)
            java.lang.String r6 = r6.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.d(r1, r6)
        L59:
            int r6 = r2.f9792
            r6 = r6 & (-257(0xfffffffffffffeff, float:NaN))
            r2.f9792 = r6
            goto L64
        L60:
            boolean r2 = defpackage.C0055.f603
            if (r2 != 0) goto L68
        L64:
            defpackage.C0055.m404(r0, r3, r4, r5)
            return
        L68:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "No ViewHolder found for child: "
            r5.<init>(r6)
            r5.append(r3)
            java.lang.String r3 = r0.m457()
            java.lang.String r6 = ", index: "
            r5.append(r6)
            r5.append(r4)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r2.<init>(r3)
            throw r2
    }

    /* JADX INFO: renamed from: ᲇᛸᲁᛱ, reason: contains not printable characters */
    public void m3726(boolean r3) {
            r2 = this;
            java.lang.Object r2 = r2.f9711
            ᛳᲈᛳᛸ r2 = (defpackage.C0588) r2
            java.util.List r2 = r2.m1390()
            java.util.Iterator r2 = r2.iterator()
        Lc:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L23
            java.lang.Object r0 = r2.next()
            ᛲᛵᛴᲁ r0 = (defpackage.AbstractComponentCallbacksC0293) r0
            if (r0 == 0) goto Lc
            if (r3 == 0) goto Lc
            ᲈᛷᲀᲀ r0 = r0.f1601
            r1 = 1
            r0.m3726(r1)
            goto Lc
        L23:
            return
    }

    /* JADX INFO: renamed from: ᲈᲈᛸᲁ, reason: contains not printable characters */
    public boolean m3727() {
            r2 = this;
            int r0 = r2.f9712
            r1 = 1
            if (r0 >= r1) goto L6
            goto L29
        L6:
            java.lang.Object r2 = r2.f9711
            ᛳᲈᛳᛸ r2 = (defpackage.C0588) r2
            java.util.List r2 = r2.m1390()
            java.util.Iterator r2 = r2.iterator()
        L12:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L29
            java.lang.Object r0 = r2.next()
            ᛲᛵᛴᲁ r0 = (defpackage.AbstractComponentCallbacksC0293) r0
            if (r0 == 0) goto L12
            ᲈᛷᲀᲀ r0 = r0.f1601
            boolean r0 = r0.m3727()
            if (r0 == 0) goto L12
            return r1
        L29:
            r2 = 0
            return r2
    }
}
