package androidx.fragment.app;

/* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public class LayoutInflaterFactory2C7617 implements android.view.LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public static final java.lang.String f29303 = "FragmentManager";

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final androidx.fragment.app.FragmentManager f29304;

    /* JADX INFO: renamed from: androidx.fragment.app.ۥ۟۟۟ۢ$ۥ, reason: contains not printable characters */
    public class ViewOnAttachStateChangeListenerC7618 implements android.view.View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.C7627 f29305;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final /* synthetic */ androidx.fragment.app.LayoutInflaterFactory2C7617 f29306;

        public ViewOnAttachStateChangeListenerC7618(androidx.fragment.app.LayoutInflaterFactory2C7617 r1, androidx.fragment.app.C7627 r2) {
                r0 = this;
                r0.f29306 = r1
                r0.f29305 = r2
                r0.<init>()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(android.view.View r2) {
                r1 = this;
                androidx.fragment.app.ۥ۟۟۟ۧ r2 = r1.f29305
                androidx.fragment.app.Fragment r2 = r2.m29390()
                androidx.fragment.app.ۥ۟۟۟ۧ r0 = r1.f29305
                r0.m29392()
                android.view.View r2 = r2.mView
                android.view.ViewParent r2 = r2.getParent()
                android.view.ViewGroup r2 = (android.view.ViewGroup) r2
                androidx.fragment.app.ۥ۟۟۟ۢ r0 = r1.f29306
                androidx.fragment.app.FragmentManager r0 = r0.f29304
                androidx.fragment.app.ۥ۟۟۠ۡ r2 = androidx.fragment.app.AbstractC7635.m29472(r2, r0)
                r2.m29481()
                return
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(android.view.View r1) {
                r0 = this;
                return
        }
    }

    public LayoutInflaterFactory2C7617(androidx.fragment.app.FragmentManager r1) {
            r0 = this;
            r0.<init>()
            r0.f29304 = r1
            return
    }

    @Override // android.view.LayoutInflater.Factory2
    @Yue.InterfaceC4544
    public android.view.View onCreateView(@Yue.InterfaceC4544 android.view.View r9, @Yue.InterfaceC4410 java.lang.String r10, @Yue.InterfaceC4410 android.content.Context r11, @Yue.InterfaceC4410 android.util.AttributeSet r12) {
            r8 = this;
            java.lang.Class<androidx.fragment.app.FragmentContainerView> r0 = androidx.fragment.app.FragmentContainerView.class
            java.lang.String r0 = r0.getName()
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L14
            androidx.fragment.app.FragmentContainerView r9 = new androidx.fragment.app.FragmentContainerView
            androidx.fragment.app.FragmentManager r10 = r8.f29304
            r9.<init>(r11, r12, r10)
            return r9
        L14:
            java.lang.String r0 = "fragment"
            boolean r10 = r0.equals(r10)
            r0 = 0
            if (r10 != 0) goto L1e
            return r0
        L1e:
            java.lang.String r10 = "class"
            java.lang.String r10 = r12.getAttributeValue(r0, r10)
            int[] r1 = Yue.C5040.C5044.f16387
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r1)
            if (r10 != 0) goto L32
            int r10 = Yue.C5040.C5044.f16388
            java.lang.String r10 = r1.getString(r10)
        L32:
            int r2 = Yue.C5040.C5044.f16389
            r3 = -1
            int r2 = r1.getResourceId(r2, r3)
            int r4 = Yue.C5040.C5044.f16390
            java.lang.String r4 = r1.getString(r4)
            r1.recycle()
            if (r10 == 0) goto L1d5
            java.lang.ClassLoader r1 = r11.getClassLoader()
            boolean r1 = androidx.fragment.app.C7616.m29341(r1, r10)
            if (r1 != 0) goto L50
            goto L1d5
        L50:
            if (r9 == 0) goto L57
            int r1 = r9.getId()
            goto L58
        L57:
            r1 = 0
        L58:
            if (r1 != r3) goto L7d
            if (r2 != r3) goto L7d
            if (r4 == 0) goto L5f
            goto L7d
        L5f:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Must specify unique android:id, android:tag, or have a parent with an id for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L7d:
            if (r2 == r3) goto L85
            androidx.fragment.app.FragmentManager r0 = r8.f29304
            androidx.fragment.app.Fragment r0 = r0.m29146(r2)
        L85:
            if (r0 != 0) goto L8f
            if (r4 == 0) goto L8f
            androidx.fragment.app.FragmentManager r0 = r8.f29304
            androidx.fragment.app.Fragment r0 = r0.m29147(r4)
        L8f:
            if (r0 != 0) goto L99
            if (r1 == r3) goto L99
            androidx.fragment.app.FragmentManager r0 = r8.f29304
            androidx.fragment.app.Fragment r0 = r0.m29146(r1)
        L99:
            java.lang.String r3 = "Fragment "
            java.lang.String r5 = "FragmentManager"
            r6 = 2
            r7 = 1
            if (r0 != 0) goto L102
            androidx.fragment.app.FragmentManager r0 = r8.f29304
            androidx.fragment.app.ۥ۟۟۟ۡ r0 = r0.m29160()
            java.lang.ClassLoader r11 = r11.getClassLoader()
            androidx.fragment.app.Fragment r0 = r0.mo29237(r11, r10)
            r0.mFromLayout = r7
            if (r2 == 0) goto Lb5
            r11 = r2
            goto Lb6
        Lb5:
            r11 = r1
        Lb6:
            r0.mFragmentId = r11
            r0.mContainerId = r1
            r0.mTag = r4
            r0.mInLayout = r7
            androidx.fragment.app.FragmentManager r11 = r8.f29304
            r0.mFragmentManager = r11
            Yue.ۥ۠ۢۨ r11 = r11.m29163()
            r0.mHost = r11
            androidx.fragment.app.FragmentManager r11 = r8.f29304
            Yue.ۥ۠ۢۨ r11 = r11.m29163()
            android.content.Context r11 = r11.m12114()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate(r11, r12, r1)
            androidx.fragment.app.FragmentManager r11 = r8.f29304
            androidx.fragment.app.ۥ۟۟۟ۧ r11 = r11.m29093(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.m29090(r6)
            if (r12 == 0) goto L14d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            r12.append(r0)
            java.lang.String r1 = " has been inflated via the <fragment> tag: id=0x"
            r12.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r5, r12)
            goto L14d
        L102:
            boolean r11 = r0.mInLayout
            if (r11 != 0) goto L197
            r0.mInLayout = r7
            androidx.fragment.app.FragmentManager r11 = r8.f29304
            r0.mFragmentManager = r11
            Yue.ۥ۠ۢۨ r11 = r11.m29163()
            r0.mHost = r11
            androidx.fragment.app.FragmentManager r11 = r8.f29304
            Yue.ۥ۠ۢۨ r11 = r11.m29163()
            android.content.Context r11 = r11.m12114()
            android.os.Bundle r1 = r0.mSavedFragmentState
            r0.onInflate(r11, r12, r1)
            androidx.fragment.app.FragmentManager r11 = r8.f29304
            androidx.fragment.app.ۥ۟۟۟ۧ r11 = r11.m29109(r0)
            boolean r12 = androidx.fragment.app.FragmentManager.m29090(r6)
            if (r12 == 0) goto L14d
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = "Retained Fragment "
            r12.append(r1)
            r12.append(r0)
            java.lang.String r1 = " has been re-attached via the <fragment> tag: id=0x"
            r12.append(r1)
            java.lang.String r1 = java.lang.Integer.toHexString(r2)
            r12.append(r1)
            java.lang.String r12 = r12.toString()
            android.util.Log.v(r5, r12)
        L14d:
            android.view.ViewGroup r9 = (android.view.ViewGroup) r9
            Yue.C2779.m12155(r0, r9)
            r0.mContainer = r9
            r11.m29392()
            r11.m29389()
            android.view.View r9 = r0.mView
            if (r9 == 0) goto L17d
            if (r2 == 0) goto L163
            r9.setId(r2)
        L163:
            android.view.View r9 = r0.mView
            java.lang.Object r9 = r9.getTag()
            if (r9 != 0) goto L170
            android.view.View r9 = r0.mView
            r9.setTag(r4)
        L170:
            android.view.View r9 = r0.mView
            androidx.fragment.app.ۥ۟۟۟ۢ$ۥ r10 = new androidx.fragment.app.ۥ۟۟۟ۢ$ۥ
            r10.<init>(r8, r11)
            r9.addOnAttachStateChangeListener(r10)
            android.view.View r9 = r0.mView
            return r9
        L17d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r3)
            r11.append(r10)
            java.lang.String r10 = " did not create a view."
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L197:
            java.lang.IllegalArgumentException r9 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r12.getPositionDescription()
            r11.append(r12)
            java.lang.String r12 = ": Duplicate id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r2)
            r11.append(r12)
            java.lang.String r12 = ", tag "
            r11.append(r12)
            r11.append(r4)
            java.lang.String r12 = ", or parent id 0x"
            r11.append(r12)
            java.lang.String r12 = java.lang.Integer.toHexString(r1)
            r11.append(r12)
            java.lang.String r12 = " with another fragment for "
            r11.append(r12)
            r11.append(r10)
            java.lang.String r10 = r11.toString()
            r9.<init>(r10)
            throw r9
        L1d5:
            return r0
    }

    @Override // android.view.LayoutInflater.Factory
    @Yue.InterfaceC4544
    public android.view.View onCreateView(@Yue.InterfaceC4410 java.lang.String r2, @Yue.InterfaceC4410 android.content.Context r3, @Yue.InterfaceC4410 android.util.AttributeSet r4) {
            r1 = this;
            r0 = 0
            android.view.View r2 = r1.onCreateView(r0, r2, r3, r4)
            return r2
    }
}
