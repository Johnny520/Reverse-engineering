package androidx.recyclerview.widget;

/* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class C7738 {

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean f29788 = false;

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final java.lang.String f29789 = "ChildrenHelper";

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7738.InterfaceC7740 f29790;

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.recyclerview.widget.C7738.C7739 f29791;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final java.util.List<android.view.View> f29792;

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ, reason: contains not printable characters */
    public static class C7739 {

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public static final int f29793 = 64;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public static final long f29794 = Long.MIN_VALUE;

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public long f29795;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public androidx.recyclerview.widget.C7738.C7739 f29796;

        public C7739() {
                r2 = this;
                r2.<init>()
                r0 = 0
                r2.f29795 = r0
                return
        }

        public java.lang.String toString() {
                r3 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r3.f29796
                if (r0 != 0) goto Lb
                long r0 = r3.f29795
                java.lang.String r0 = java.lang.Long.toBinaryString(r0)
                goto L2b
            Lb:
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r3.f29796
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r1 = "xx"
                r0.append(r1)
                long r1 = r3.f29795
                java.lang.String r1 = java.lang.Long.toBinaryString(r1)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
            L2b:
                return r0
        }

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public void m30062(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Ld
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r4.f29796
                if (r1 == 0) goto L16
                int r5 = r5 - r0
                r1.m30062(r5)
                goto L16
            Ld:
                long r0 = r4.f29795
                r2 = 1
                long r2 = r2 << r5
                long r2 = ~r2
                long r0 = r0 & r2
                r4.f29795 = r0
            L16:
                return
        }

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public int m30063(int r7) {
                r6 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r6.f29796
                r1 = 64
                r2 = 1
                if (r0 != 0) goto L1c
                if (r7 < r1) goto L11
                long r0 = r6.f29795
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L11:
                long r0 = r6.f29795
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L1c:
                if (r7 >= r1) goto L29
                long r0 = r6.f29795
                long r4 = r2 << r7
                long r4 = r4 - r2
                long r0 = r0 & r4
                int r7 = java.lang.Long.bitCount(r0)
                return r7
            L29:
                int r7 = r7 - r1
                int r7 = r0.m30063(r7)
                long r0 = r6.f29795
                int r0 = java.lang.Long.bitCount(r0)
                int r7 = r7 + r0
                return r7
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final void m30064() {
                r1 = this;
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r1.f29796
                if (r0 != 0) goto Lb
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = new androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ
                r0.<init>()
                r1.f29796 = r0
            Lb:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m30065(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Lf
                r4.m30064()
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r4.f29796
                int r5 = r5 - r0
                boolean r5 = r1.m30065(r5)
                return r5
            Lf:
                long r0 = r4.f29795
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 & r2
                r2 = 0
                int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r5 == 0) goto L1d
                r5 = 1
                goto L1e
            L1d:
                r5 = 0
            L1e:
                return r5
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public void m30066(int r10, boolean r11) {
                r9 = this;
                r0 = 64
                if (r10 < r0) goto Le
                r9.m30064()
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r9.f29796
                int r10 = r10 - r0
                r1.m30066(r10, r11)
                goto L42
            Le:
                long r0 = r9.f29795
                r2 = -9223372036854775808
                long r2 = r2 & r0
                r4 = 0
                int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                r3 = 0
                r4 = 1
                if (r2 == 0) goto L1d
                r2 = r4
                goto L1e
            L1d:
                r2 = r3
            L1e:
                r5 = 1
                long r7 = r5 << r10
                long r7 = r7 - r5
                long r5 = r0 & r7
                long r7 = ~r7
                long r0 = r0 & r7
                long r0 = r0 << r4
                long r0 = r0 | r5
                r9.f29795 = r0
                if (r11 == 0) goto L31
                r9.m30069(r10)
                goto L34
            L31:
                r9.m30062(r10)
            L34:
                if (r2 != 0) goto L3a
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r10 = r9.f29796
                if (r10 == 0) goto L42
            L3a:
                r9.m30064()
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r10 = r9.f29796
                r10.m30066(r3, r2)
            L42:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m30067(int r11) {
                r10 = this;
                r0 = 64
                if (r11 < r0) goto Lf
                r10.m30064()
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r10.f29796
                int r11 = r11 - r0
                boolean r11 = r1.m30067(r11)
                return r11
            Lf:
                r0 = 1
                long r2 = r0 << r11
                long r4 = r10.f29795
                long r6 = r4 & r2
                r8 = 0
                int r11 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                r6 = 1
                r7 = 0
                if (r11 == 0) goto L21
                r11 = r6
                goto L22
            L21:
                r11 = r7
            L22:
                long r8 = ~r2
                long r4 = r4 & r8
                r10.f29795 = r4
                long r2 = r2 - r0
                long r0 = r4 & r2
                long r2 = ~r2
                long r2 = r2 & r4
                long r2 = java.lang.Long.rotateRight(r2, r6)
                long r0 = r0 | r2
                r10.f29795 = r0
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r10.f29796
                if (r0 == 0) goto L46
                boolean r0 = r0.m30065(r7)
                if (r0 == 0) goto L41
                r0 = 63
                r10.m30069(r0)
            L41:
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r10.f29796
                r0.m30067(r7)
            L46:
                return r11
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
        public void m30068() {
                r2 = this;
                r0 = 0
                r2.f29795 = r0
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r2.f29796
                if (r0 == 0) goto Lb
                r0.m30068()
            Lb:
                return
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public void m30069(int r5) {
                r4 = this;
                r0 = 64
                if (r5 < r0) goto Le
                r4.m30064()
                androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r4.f29796
                int r5 = r5 - r0
                r1.m30069(r5)
                goto L16
            Le:
                long r0 = r4.f29795
                r2 = 1
                long r2 = r2 << r5
                long r0 = r0 | r2
                r4.f29795 = r0
            L16:
                return
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟, reason: contains not printable characters */
    public interface InterfaceC7740 {
        /* JADX INFO: renamed from: ۥ */
        android.view.View mo29697(int r1);

        /* JADX INFO: renamed from: ۥ۟ */
        void mo29698(android.view.View r1);

        /* JADX INFO: renamed from: ۥ۟۟ */
        int mo29699();

        /* JADX INFO: renamed from: ۥ۟۟۟ */
        void mo29700();

        /* JADX INFO: renamed from: ۥ۟۟۟۟ */
        int mo29701(android.view.View r1);

        /* JADX INFO: renamed from: ۥ۟۟۟۠ */
        androidx.recyclerview.widget.RecyclerView.AbstractC7716 mo29702(android.view.View r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
        void mo29703(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
        void mo29704(android.view.View r1);

        /* JADX INFO: renamed from: ۥۣ۟۟۟ */
        void mo29705(android.view.View r1, int r2);

        /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
        void mo29706(int r1);

        /* JADX INFO: renamed from: ۥ۟۟۟ۥ */
        void mo29707(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3);
    }

    public C7738(androidx.recyclerview.widget.C7738.InterfaceC7740 r1) {
            r0 = this;
            r0.<init>()
            r0.f29790 = r1
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = new androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ
            r1.<init>()
            r0.f29791 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.f29792 = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r2.f29791
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", hidden list:"
            r0.append(r1)
            java.util.List<android.view.View> r1 = r2.f29792
            int r1 = r1.size()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m30042(android.view.View r2, int r3, boolean r4) {
            r1 = this;
            if (r3 >= 0) goto L9
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r3 = r1.f29790
            int r3 = r3.mo29699()
            goto Ld
        L9:
            int r3 = r1.m30049(r3)
        Ld:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r1.f29791
            r0.m30066(r3, r4)
            if (r4 == 0) goto L17
            r1.m30053(r2)
        L17:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r4 = r1.f29790
            r4.mo29705(r2, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public void m30043(android.view.View r2, boolean r3) {
            r1 = this;
            r0 = -1
            r1.m30042(r2, r0, r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void m30044(android.view.View r2, int r3, android.view.ViewGroup.LayoutParams r4, boolean r5) {
            r1 = this;
            if (r3 >= 0) goto L9
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r3 = r1.f29790
            int r3 = r3.mo29699()
            goto Ld
        L9:
            int r3 = r1.m30049(r3)
        Ld:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r1.f29791
            r0.m30066(r3, r5)
            if (r5 == 0) goto L17
            r1.m30053(r2)
        L17:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r5 = r1.f29790
            r5.mo29707(r2, r3, r4)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void m30045(int r2) {
            r1 = this;
            int r2 = r1.m30049(r2)
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r1.f29791
            r0.m30067(r2)
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r1.f29790
            r0.mo29703(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public android.view.View m30046(int r6) {
            r5 = this;
            java.util.List<android.view.View> r0 = r5.f29792
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L2d
            java.util.List<android.view.View> r2 = r5.f29792
            java.lang.Object r2 = r2.get(r1)
            android.view.View r2 = (android.view.View) r2
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r3 = r5.f29790
            androidx.recyclerview.widget.RecyclerView$ۥ۟۟ۡۤ r3 = r3.mo29702(r2)
            int r4 = r3.getLayoutPosition()
            if (r4 != r6) goto L2a
            boolean r4 = r3.isInvalid()
            if (r4 != 0) goto L2a
            boolean r3 = r3.isRemoved()
            if (r3 != 0) goto L2a
            return r2
        L2a:
            int r1 = r1 + 1
            goto L7
        L2d:
            r6 = 0
            return r6
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public android.view.View m30047(int r2) {
            r1 = this;
            int r2 = r1.m30049(r2)
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r1.f29790
            android.view.View r2 = r0.mo29697(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public int m30048() {
            r2 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r2.f29790
            int r0 = r0.mo29699()
            java.util.List<android.view.View> r1 = r2.f29792
            int r1 = r1.size()
            int r0 = r0 - r1
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public final int m30049(int r5) {
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L4
            return r0
        L4:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r1 = r4.f29790
            int r1 = r1.mo29699()
            r2 = r5
        Lb:
            if (r2 >= r1) goto L27
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r3 = r4.f29791
            int r3 = r3.m30063(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L25
        L19:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r5 = r4.f29791
            boolean r5 = r5.m30065(r2)
            if (r5 == 0) goto L24
            int r2 = r2 + 1
            goto L19
        L24:
            return r2
        L25:
            int r2 = r2 + r3
            goto Lb
        L27:
            return r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public android.view.View m30050(int r2) {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r1.f29790
            android.view.View r2 = r0.mo29697(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public int m30051() {
            r1 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r1.f29790
            int r0 = r0.mo29699()
            return r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public void m30052(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r3.f29790
            int r0 = r0.mo29701(r4)
            if (r0 < 0) goto L11
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r3.f29791
            r1.m30069(r0)
            r3.m30053(r4)
            return
        L11:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public final void m30053(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f29792
            r0.add(r2)
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r1.f29790
            r0.mo29698(r2)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public int m30054(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r2.f29790
            int r3 = r0.mo29701(r3)
            r0 = -1
            if (r3 != r0) goto La
            return r0
        La:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r2.f29791
            boolean r1 = r1.m30065(r3)
            if (r1 == 0) goto L13
            return r0
        L13:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r2.f29791
            int r0 = r0.m30063(r3)
            int r3 = r3 - r0
            return r3
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public boolean m30055(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f29792
            boolean r2 = r0.contains(r2)
            return r2
    }

    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void m30056() {
            r3 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r0 = r3.f29791
            r0.m30068()
            java.util.List<android.view.View> r0 = r3.f29792
            int r0 = r0.size()
            int r0 = r0 + (-1)
        Ld:
            if (r0 < 0) goto L24
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r1 = r3.f29790
            java.util.List<android.view.View> r2 = r3.f29792
            java.lang.Object r2 = r2.get(r0)
            android.view.View r2 = (android.view.View) r2
            r1.mo29704(r2)
            java.util.List<android.view.View> r1 = r3.f29792
            r1.remove(r0)
            int r0 = r0 + (-1)
            goto Ld
        L24:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r3.f29790
            r0.mo29700()
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void m30057(android.view.View r3) {
            r2 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r2.f29790
            int r0 = r0.mo29701(r3)
            if (r0 >= 0) goto L9
            return
        L9:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r2.f29791
            boolean r1 = r1.m30067(r0)
            if (r1 == 0) goto L14
            r2.m30061(r3)
        L14:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r3 = r2.f29790
            r3.mo29706(r0)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void m30058(int r3) {
            r2 = this;
            int r3 = r2.m30049(r3)
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r2.f29790
            android.view.View r0 = r0.mo29697(r3)
            if (r0 != 0) goto Ld
            return
        Ld:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r2.f29791
            boolean r1 = r1.m30067(r3)
            if (r1 == 0) goto L18
            r2.m30061(r0)
        L18:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r2.f29790
            r0.mo29706(r3)
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean m30059(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r3.f29790
            int r0 = r0.mo29701(r4)
            r1 = -1
            r2 = 1
            if (r0 != r1) goto Le
            r3.m30061(r4)
            return r2
        Le:
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r3.f29791
            boolean r1 = r1.m30065(r0)
            if (r1 == 0) goto L24
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r3.f29791
            r1.m30067(r0)
            r3.m30061(r4)
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r4 = r3.f29790
            r4.mo29706(r0)
            return r2
        L24:
            r4 = 0
            return r4
    }

    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public void m30060(android.view.View r4) {
            r3 = this;
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r3.f29790
            int r0 = r0.mo29701(r4)
            if (r0 < 0) goto L30
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r3.f29791
            boolean r1 = r1.m30065(r0)
            if (r1 == 0) goto L19
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ r1 = r3.f29791
            r1.m30062(r0)
            r3.m30061(r4)
            return
        L19:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "trying to unhide a view that was not hidden"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L30:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "view is not a child, cannot hide "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final boolean m30061(android.view.View r2) {
            r1 = this;
            java.util.List<android.view.View> r0 = r1.f29792
            boolean r0 = r0.remove(r2)
            if (r0 == 0) goto Lf
            androidx.recyclerview.widget.ۥ۟۟۟۟$ۥ۟ r0 = r1.f29790
            r0.mo29704(r2)
            r2 = 1
            return r2
        Lf:
            r2 = 0
            return r2
    }
}
