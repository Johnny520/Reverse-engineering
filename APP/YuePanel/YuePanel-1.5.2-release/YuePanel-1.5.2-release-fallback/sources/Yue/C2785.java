package Yue;

/* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class C2785 extends android.widget.TabHost implements android.widget.TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final java.util.ArrayList<Yue.C2785.C2789> f9098;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public android.widget.FrameLayout f9099;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public android.content.Context f9100;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public androidx.fragment.app.FragmentManager f9101;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public int f9102;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public android.widget.TabHost.OnTabChangeListener f9103;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public Yue.C2785.C2789 f9104;

    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public boolean f9105;

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ, reason: contains not printable characters */
    public static class C2786 implements android.widget.TabHost.TabContentFactory {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final android.content.Context f9106;

        public C2786(android.content.Context r1) {
                r0 = this;
                r0.<init>()
                r0.f9106 = r1
                return
        }

        @Override // android.widget.TabHost.TabContentFactory
        public android.view.View createTabContent(java.lang.String r2) {
                r1 = this;
                android.view.View r2 = new android.view.View
                android.content.Context r0 = r1.f9106
                r2.<init>(r0)
                r0 = 0
                r2.setMinimumWidth(r0)
                r2.setMinimumHeight(r0)
                return r2
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ۟, reason: contains not printable characters */
    public static class C2787 extends android.view.View.BaseSavedState {
        public static final android.os.Parcelable.Creator<Yue.C2785.C2787> CREATOR = null;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public java.lang.String f9107;

        /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ۟$ۥ, reason: contains not printable characters */
        public class C2788 implements android.os.Parcelable.Creator<Yue.C2785.C2787> {
            public C2788() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Yue.C2785.C2787 createFromParcel(android.os.Parcel r1) {
                    r0 = this;
                    Yue.ۥۣ۠۟ۢ$ۥ۟ r1 = r0.m12198(r1)
                    return r1
            }

            @Override // android.os.Parcelable.Creator
            public /* bridge */ /* synthetic */ Yue.C2785.C2787[] newArray(int r1) {
                    r0 = this;
                    Yue.ۥۣ۠۟ۢ$ۥ۟[] r1 = r0.m12199(r1)
                    return r1
            }

            /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
            public Yue.C2785.C2787 m12198(android.os.Parcel r2) {
                    r1 = this;
                    Yue.ۥۣ۠۟ۢ$ۥ۟ r0 = new Yue.ۥۣ۠۟ۢ$ۥ۟
                    r0.<init>(r2)
                    return r0
            }

            /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
            public Yue.C2785.C2787[] m12199(int r1) {
                    r0 = this;
                    Yue.ۥۣ۠۟ۢ$ۥ۟[] r1 = new Yue.C2785.C2787[r1]
                    return r1
            }
        }

        static {
                Yue.ۥۣ۠۟ۢ$ۥ۟$ۥ r0 = new Yue.ۥۣ۠۟ۢ$ۥ۟$ۥ
                r0.<init>()
                Yue.C2785.C2787.CREATOR = r0
                return
        }

        public C2787(android.os.Parcel r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.String r1 = r1.readString()
                r0.f9107 = r1
                return
        }

        public C2787(android.os.Parcelable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Yue.InterfaceC4410
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "FragmentTabHost.SavedState{"
                r0.append(r1)
                int r1 = java.lang.System.identityHashCode(r2)
                java.lang.String r1 = java.lang.Integer.toHexString(r1)
                r0.append(r1)
                java.lang.String r1 = " curTab="
                r0.append(r1)
                java.lang.String r1 = r2.f9107
                r0.append(r1)
                java.lang.String r1 = "}"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(android.os.Parcel r1, int r2) {
                r0 = this;
                super.writeToParcel(r1, r2)
                java.lang.String r2 = r0.f9107
                r1.writeString(r2)
                return
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۠۟ۢ$ۥ۟۟, reason: contains not printable characters */
    public static final class C2789 {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final java.lang.String f9108;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        @Yue.InterfaceC4410
        public final java.lang.Class<?> f9109;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        @Yue.InterfaceC4544
        public final android.os.Bundle f9110;

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public androidx.fragment.app.Fragment f9111;

        public C2789(@Yue.InterfaceC4410 java.lang.String r1, @Yue.InterfaceC4410 java.lang.Class<?> r2, @Yue.InterfaceC4544 android.os.Bundle r3) {
                r0 = this;
                r0.<init>()
                r0.f9108 = r1
                r0.f9109 = r2
                r0.f9110 = r3
                return
        }
    }

    @java.lang.Deprecated
    public C2785(@Yue.InterfaceC4410 android.content.Context r3) {
            r2 = this;
            r0 = 0
            r2.<init>(r3, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2.f9098 = r1
            r2.m12195(r3, r0)
            return
    }

    @java.lang.Deprecated
    public C2785(@Yue.InterfaceC4410 android.content.Context r2, @Yue.InterfaceC4544 android.util.AttributeSet r3) {
            r1 = this;
            r1.<init>(r2, r3)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.f9098 = r0
            r1.m12195(r2, r3)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @java.lang.Deprecated
    public void onAttachedToWindow() {
            r7 = this;
            super.onAttachedToWindow()
            java.lang.String r0 = r7.getCurrentTabTag()
            java.util.ArrayList<Yue.ۥۣ۠۟ۢ$ۥ۟۟> r1 = r7.f9098
            int r1 = r1.size()
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r1) goto L46
            java.util.ArrayList<Yue.ۥۣ۠۟ۢ$ۥ۟۟> r4 = r7.f9098
            java.lang.Object r4 = r4.get(r3)
            Yue.ۥۣ۠۟ۢ$ۥ۟۟ r4 = (Yue.C2785.C2789) r4
            androidx.fragment.app.FragmentManager r5 = r7.f9101
            java.lang.String r6 = r4.f9108
            androidx.fragment.app.Fragment r5 = r5.m29147(r6)
            r4.f9111 = r5
            if (r5 == 0) goto L43
            boolean r5 = r5.isDetached()
            if (r5 != 0) goto L43
            java.lang.String r5 = r4.f9108
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L36
            r7.f9104 = r4
            goto L43
        L36:
            if (r2 != 0) goto L3e
            androidx.fragment.app.FragmentManager r2 = r7.f9101
            androidx.fragment.app.ۥ۟۟۠۟ r2 = r2.m29100()
        L3e:
            androidx.fragment.app.Fragment r4 = r4.f9111
            r2.mo29272(r4)
        L43:
            int r3 = r3 + 1
            goto Lf
        L46:
            r1 = 1
            r7.f9105 = r1
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r7.m12191(r0, r2)
            if (r0 == 0) goto L57
            r0.mo29268()
            androidx.fragment.app.FragmentManager r0 = r7.f9101
            r0.m29143()
        L57:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    @java.lang.Deprecated
    public void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.f9105 = r0
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void onRestoreInstanceState(@android.annotation.SuppressLint({"UnknownNullness"}) android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof Yue.C2785.C2787
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            Yue.ۥۣ۠۟ۢ$ۥ۟ r2 = (Yue.C2785.C2787) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r2 = r2.f9107
            r1.setCurrentTabByTag(r2)
            return
    }

    @Override // android.view.View
    @Yue.InterfaceC4410
    @java.lang.Deprecated
    public android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            Yue.ۥۣ۠۟ۢ$ۥ۟ r1 = new Yue.ۥۣ۠۟ۢ$ۥ۟
            r1.<init>(r0)
            java.lang.String r0 = r2.getCurrentTabTag()
            r1.f9107 = r0
            return r1
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    @java.lang.Deprecated
    public void onTabChanged(@Yue.InterfaceC4544 java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.f9105
            if (r0 == 0) goto Le
            r0 = 0
            androidx.fragment.app.ۥ۟۟۠۟ r0 = r1.m12191(r2, r0)
            if (r0 == 0) goto Le
            r0.mo29268()
        Le:
            android.widget.TabHost$OnTabChangeListener r0 = r1.f9103
            if (r0 == 0) goto L15
            r0.onTabChanged(r2)
        L15:
            return
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setOnTabChangedListener(@Yue.InterfaceC4544 android.widget.TabHost.OnTabChangeListener r1) {
            r0 = this;
            r0.f9103 = r1
            return
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setup() {
            r2 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must call setup() that takes a Context and FragmentManager"
            r0.<init>(r1)
            throw r0
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
    public void m12190(@Yue.InterfaceC4410 android.widget.TabHost.TabSpec r3, @Yue.InterfaceC4410 java.lang.Class<?> r4, @Yue.InterfaceC4544 android.os.Bundle r5) {
            r2 = this;
            Yue.ۥۣ۠۟ۢ$ۥ r0 = new Yue.ۥۣ۠۟ۢ$ۥ
            android.content.Context r1 = r2.f9100
            r0.<init>(r1)
            r3.setContent(r0)
            java.lang.String r0 = r3.getTag()
            Yue.ۥۣ۠۟ۢ$ۥ۟۟ r1 = new Yue.ۥۣ۠۟ۢ$ۥ۟۟
            r1.<init>(r0, r4, r5)
            boolean r4 = r2.f9105
            if (r4 == 0) goto L35
            androidx.fragment.app.FragmentManager r4 = r2.f9101
            androidx.fragment.app.Fragment r4 = r4.m29147(r0)
            r1.f9111 = r4
            if (r4 == 0) goto L35
            boolean r4 = r4.isDetached()
            if (r4 != 0) goto L35
            androidx.fragment.app.FragmentManager r4 = r2.f9101
            androidx.fragment.app.ۥ۟۟۠۟ r4 = r4.m29100()
            androidx.fragment.app.Fragment r5 = r1.f9111
            r4.mo29272(r5)
            r4.mo29268()
        L35:
            java.util.ArrayList<Yue.ۥۣ۠۟ۢ$ۥ۟۟> r4 = r2.f9098
            r4.add(r1)
            r2.addTab(r3)
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
    public final androidx.fragment.app.AbstractC7632 m12191(@Yue.InterfaceC4544 java.lang.String r4, @Yue.InterfaceC4544 androidx.fragment.app.AbstractC7632 r5) {
            r3 = this;
            Yue.ۥۣ۠۟ۢ$ۥ۟۟ r4 = r3.m12194(r4)
            Yue.ۥۣ۠۟ۢ$ۥ۟۟ r0 = r3.f9104
            if (r0 == r4) goto L4d
            if (r5 != 0) goto L10
            androidx.fragment.app.FragmentManager r5 = r3.f9101
            androidx.fragment.app.ۥ۟۟۠۟ r5 = r5.m29100()
        L10:
            Yue.ۥۣ۠۟ۢ$ۥ۟۟ r0 = r3.f9104
            if (r0 == 0) goto L1b
            androidx.fragment.app.Fragment r0 = r0.f9111
            if (r0 == 0) goto L1b
            r5.mo29272(r0)
        L1b:
            if (r4 == 0) goto L4b
            androidx.fragment.app.Fragment r0 = r4.f9111
            if (r0 != 0) goto L48
            androidx.fragment.app.FragmentManager r0 = r3.f9101
            androidx.fragment.app.ۥ۟۟۟ۡ r0 = r0.m29160()
            android.content.Context r1 = r3.f9100
            java.lang.ClassLoader r1 = r1.getClassLoader()
            java.lang.Class<?> r2 = r4.f9109
            java.lang.String r2 = r2.getName()
            androidx.fragment.app.Fragment r0 = r0.mo29237(r1, r2)
            r4.f9111 = r0
            android.os.Bundle r1 = r4.f9110
            r0.setArguments(r1)
            int r0 = r3.f9102
            androidx.fragment.app.Fragment r1 = r4.f9111
            java.lang.String r2 = r4.f9108
            r5.m29433(r0, r1, r2)
            goto L4b
        L48:
            r5.m29442(r0)
        L4b:
            r3.f9104 = r4
        L4d:
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final void m12192() {
            r3 = this;
            android.widget.FrameLayout r0 = r3.f9099
            if (r0 != 0) goto L2a
            int r0 = r3.f9102
            android.view.View r0 = r3.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r3.f9099 = r0
            if (r0 == 0) goto L11
            goto L2a
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No tab content FrameLayout found for id "
            r1.append(r2)
            int r2 = r3.f9102
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L2a:
            return
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final void m12193(android.content.Context r8) {
            r7 = this;
            r0 = 16908307(0x1020013, float:2.3877282E-38)
            android.view.View r1 = r7.findViewById(r0)
            if (r1 != 0) goto L5a
            android.widget.LinearLayout r1 = new android.widget.LinearLayout
            r1.<init>(r8)
            r2 = 1
            r1.setOrientation(r2)
            android.widget.FrameLayout$LayoutParams r2 = new android.widget.FrameLayout$LayoutParams
            r3 = -1
            r2.<init>(r3, r3)
            r7.addView(r1, r2)
            android.widget.TabWidget r2 = new android.widget.TabWidget
            r2.<init>(r8)
            r2.setId(r0)
            r0 = 0
            r2.setOrientation(r0)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r5 = -2
            r6 = 0
            r4.<init>(r3, r5, r6)
            r1.addView(r2, r4)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r8)
            r4 = 16908305(0x1020011, float:2.3877277E-38)
            r2.setId(r4)
            android.widget.LinearLayout$LayoutParams r4 = new android.widget.LinearLayout$LayoutParams
            r4.<init>(r0, r0, r6)
            r1.addView(r2, r4)
            android.widget.FrameLayout r2 = new android.widget.FrameLayout
            r2.<init>(r8)
            r7.f9099 = r2
            int r8 = r7.f9102
            r2.setId(r8)
            android.widget.LinearLayout$LayoutParams r8 = new android.widget.LinearLayout$LayoutParams
            r4 = 1065353216(0x3f800000, float:1.0)
            r8.<init>(r3, r0, r4)
            r1.addView(r2, r8)
        L5a:
            return
    }

    @Yue.InterfaceC4544
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final Yue.C2785.C2789 m12194(java.lang.String r5) {
            r4 = this;
            java.util.ArrayList<Yue.ۥۣ۠۟ۢ$ۥ۟۟> r0 = r4.f9098
            int r0 = r0.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L1d
            java.util.ArrayList<Yue.ۥۣ۠۟ۢ$ۥ۟۟> r2 = r4.f9098
            java.lang.Object r2 = r2.get(r1)
            Yue.ۥۣ۠۟ۢ$ۥ۟۟ r2 = (Yue.C2785.C2789) r2
            java.lang.String r3 = r2.f9108
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L1a
            return r2
        L1a:
            int r1 = r1 + 1
            goto L7
        L1d:
            r5 = 0
            return r5
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public final void m12195(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 16842995(0x10100f3, float:2.369424E-38)
            int[] r0 = new int[]{r0}
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r1, r1)
            int r4 = r3.getResourceId(r1, r1)
            r2.f9102 = r4
            r3.recycle()
            super.setOnTabChangedListener(r2)
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void m12196(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2) {
            r0 = this;
            r0.m12193(r1)
            super.setup()
            r0.f9100 = r1
            r0.f9101 = r2
            r0.m12192()
            return
    }

    @java.lang.Deprecated
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void m12197(@Yue.InterfaceC4410 android.content.Context r1, @Yue.InterfaceC4410 androidx.fragment.app.FragmentManager r2, int r3) {
            r0 = this;
            r0.m12193(r1)
            super.setup()
            r0.f9100 = r1
            r0.f9101 = r2
            r0.f9102 = r3
            r0.m12192()
            android.widget.FrameLayout r1 = r0.f9099
            r1.setId(r3)
            int r1 = r0.getId()
            r2 = -1
            if (r1 != r2) goto L21
            r1 = 16908306(0x1020012, float:2.387728E-38)
            r0.setId(r1)
        L21:
            return
    }
}
