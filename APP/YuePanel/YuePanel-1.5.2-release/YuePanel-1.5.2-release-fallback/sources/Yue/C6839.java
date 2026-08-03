package Yue;

/* JADX INFO: renamed from: Yue.ۥۢۤۥۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6839 {

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ, reason: contains not printable characters */
    public static final class C6840 implements Yue.InterfaceC5609<android.view.View> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewGroup f23960;

        public C6840(android.view.ViewGroup r1) {
                r0 = this;
                r0.f23960 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<android.view.View> iterator() {
                r1 = this;
                android.view.ViewGroup r0 = r1.f23960
                java.util.Iterator r0 = Yue.C6839.m26520(r0)
                return r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ۟, reason: contains not printable characters */
    public static final class C6841 extends Yue.AbstractC3560 implements Yue.InterfaceC2825<android.view.View, java.util.Iterator<? extends android.view.View>> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public static final Yue.C6839.C6841 f23961 = null;

        static {
                Yue.ۥۢۤۥۦ$ۥ۟ r0 = new Yue.ۥۢۤۥۦ$ۥ۟
                r0.<init>()
                Yue.C6839.C6841.f23961 = r0
                return
        }

        public C6841() {
                r1 = this;
                r0 = 1
                r1.<init>(r0)
                return
        }

        @Override // Yue.InterfaceC2825
        public /* bridge */ /* synthetic */ java.util.Iterator<? extends android.view.View> invoke(android.view.View r1) {
                r0 = this;
                android.view.View r1 = (android.view.View) r1
                java.util.Iterator r1 = r0.m26528(r1)
                return r1
        }

        @Yue.InterfaceC4543
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final java.util.Iterator<android.view.View> m26528(@Yue.InterfaceC4418 android.view.View r3) {
                r2 = this;
                boolean r0 = r3 instanceof android.view.ViewGroup
                r1 = 0
                if (r0 == 0) goto L8
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                goto L9
            L8:
                r3 = r1
            L9:
                if (r3 == 0) goto L15
                Yue.ۥۡۨۢ r3 = Yue.C6839.m26514(r3)
                if (r3 == 0) goto L15
                java.util.Iterator r1 = r3.iterator()
            L15:
                return r1
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ۟۟, reason: contains not printable characters */
    public static final class C6842 implements java.util.Iterator<android.view.View>, Yue.InterfaceC3446 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public int f23962;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewGroup f23963;

        public C6842(android.view.ViewGroup r1) {
                r0 = this;
                r0.f23963 = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.f23962
                android.view.ViewGroup r1 = r2.f23963
                int r1 = r1.getChildCount()
                if (r0 >= r1) goto Lc
                r0 = 1
                goto Ld
            Lc:
                r0 = 0
            Ld:
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ android.view.View next() {
                r1 = this;
                android.view.View r0 = r1.m26529()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                android.view.ViewGroup r0 = r2.f23963
                int r1 = r2.f23962
                int r1 = r1 + (-1)
                r2.f23962 = r1
                r0.removeViewAt(r1)
                return
        }

        @Yue.InterfaceC4418
        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public android.view.View m26529() {
                r3 = this;
                android.view.ViewGroup r0 = r3.f23963
                int r1 = r3.f23962
                int r2 = r1 + 1
                r3.f23962 = r2
                android.view.View r0 = r0.getChildAt(r1)
                if (r0 == 0) goto Lf
                return r0
            Lf:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                r0.<init>()
                throw r0
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۢۤۥۦ$ۥ۟۟۟, reason: contains not printable characters */
    @Yue.InterfaceC5840({"SMAP\nSequences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Sequences.kt\nkotlin/sequences/SequencesKt__SequencesKt$Sequence$1\n+ 2 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,680:1\n127#2:681\n*E\n"})
    public static final class C6843 implements Yue.InterfaceC5609<android.view.View> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ android.view.ViewGroup f23964;

        public C6843(android.view.ViewGroup r1) {
                r0 = this;
                r0.f23964 = r1
                r0.<init>()
                return
        }

        @Override // Yue.InterfaceC5609
        @Yue.InterfaceC4418
        public java.util.Iterator<android.view.View> iterator() {
                r3 = this;
                Yue.ۥۢۢۢ r0 = new Yue.ۥۢۢۢ
                android.view.ViewGroup r1 = r3.f23964
                Yue.ۥۡۨۢ r1 = Yue.C6839.m26514(r1)
                java.util.Iterator r1 = r1.iterator()
                Yue.ۥۢۤۥۦ$ۥ۟ r2 = Yue.C6839.C6841.f23961
                r0.<init>(r1, r2)
                return r0
        }
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public static final boolean m26510(@Yue.InterfaceC4418 android.view.ViewGroup r0, @Yue.InterfaceC4418 android.view.View r1) {
            int r0 = r0.indexOfChild(r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            goto La
        L9:
            r0 = 0
        La:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public static final void m26511(@Yue.InterfaceC4418 android.view.ViewGroup r3, @Yue.InterfaceC4418 Yue.InterfaceC2825<? super android.view.View, Yue.C6593> r4) {
            int r0 = r3.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L11
            android.view.View r2 = r3.getChildAt(r1)
            r4.invoke(r2)
            int r1 = r1 + 1
            goto L5
        L11:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m26512(@Yue.InterfaceC4418 android.view.ViewGroup r4, @Yue.InterfaceC4418 Yue.InterfaceC2839<? super java.lang.Integer, ? super android.view.View, Yue.C6593> r5) {
            int r0 = r4.getChildCount()
            r1 = 0
        L5:
            if (r1 >= r0) goto L15
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            android.view.View r3 = r4.getChildAt(r1)
            r5.invoke(r2, r3)
            int r1 = r1 + 1
            goto L5
        L15:
            return
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final android.view.View m26513(@Yue.InterfaceC4418 android.view.ViewGroup r3, int r4) {
            android.view.View r0 = r3.getChildAt(r4)
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Size: "
            r1.append(r4)
            int r3 = r3.getChildCount()
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<android.view.View> m26514(@Yue.InterfaceC4418 android.view.ViewGroup r1) {
            Yue.ۥۢۤۥۦ$ۥ r0 = new Yue.ۥۢۤۥۦ$ۥ
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Yue.InterfaceC5609<android.view.View> m26515(@Yue.InterfaceC4418 android.view.ViewGroup r1) {
            Yue.ۥۢۤۥۦ$ۥ۟۟۟ r0 = new Yue.ۥۢۤۥۦ$ۥ۟۟۟
            r0.<init>(r1)
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Yue.C3279 m26516(@Yue.InterfaceC4418 android.view.ViewGroup r1) {
            r0 = 0
            int r1 = r1.getChildCount()
            Yue.ۥ۠ۥۣۨ r1 = Yue.C5196.m19646(r0, r1)
            return r1
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final int m26517(@Yue.InterfaceC4418 android.view.ViewGroup r0) {
            int r0 = r0.getChildCount()
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final boolean m26518(@Yue.InterfaceC4418 android.view.ViewGroup r0) {
            int r0 = r0.getChildCount()
            if (r0 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final boolean m26519(@Yue.InterfaceC4418 android.view.ViewGroup r0) {
            int r0 = r0.getChildCount()
            if (r0 == 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            return r0
    }

    @Yue.InterfaceC4418
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final java.util.Iterator<android.view.View> m26520(@Yue.InterfaceC4418 android.view.ViewGroup r1) {
            Yue.ۥۢۤۥۦ$ۥ۟۟ r0 = new Yue.ۥۢۤۥۦ$ۥ۟۟
            r0.<init>(r1)
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final void m26521(@Yue.InterfaceC4418 android.view.ViewGroup r0, @Yue.InterfaceC4418 android.view.View r1) {
            r0.removeView(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final void m26522(@Yue.InterfaceC4418 android.view.ViewGroup r0, @Yue.InterfaceC4418 android.view.View r1) {
            r0.addView(r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final void m26523(@Yue.InterfaceC4418 android.view.ViewGroup.MarginLayoutParams r0, @Yue.InterfaceC4992 int r1) {
            r0.setMargins(r1, r1, r1, r1)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final void m26524(@Yue.InterfaceC4418 android.view.ViewGroup.MarginLayoutParams r0, @Yue.InterfaceC4992 int r1, @Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, @Yue.InterfaceC4992 int r4) {
            r0.setMargins(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public static /* synthetic */ void m26525(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            int r1 = r0.leftMargin
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.topMargin
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.rightMargin
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.bottomMargin
        L18:
            r0.setMargins(r1, r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public static final void m26526(@Yue.InterfaceC4418 android.view.ViewGroup.MarginLayoutParams r0, @Yue.InterfaceC4992 int r1, @Yue.InterfaceC4992 int r2, @Yue.InterfaceC4992 int r3, @Yue.InterfaceC4992 int r4) {
            r0.setMarginStart(r1)
            r0.topMargin = r2
            r0.setMarginEnd(r3)
            r0.bottomMargin = r4
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public static /* synthetic */ void m26527(android.view.ViewGroup.MarginLayoutParams r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L8
            int r1 = r0.getMarginStart()
        L8:
            r6 = r5 & 2
            if (r6 == 0) goto Le
            int r2 = r0.topMargin
        Le:
            r6 = r5 & 4
            if (r6 == 0) goto L16
            int r3 = r0.getMarginEnd()
        L16:
            r5 = r5 & 8
            if (r5 == 0) goto L1c
            int r4 = r0.bottomMargin
        L1c:
            r0.setMarginStart(r1)
            r0.topMargin = r2
            r0.setMarginEnd(r3)
            r0.bottomMargin = r4
            return
    }
}
