package androidx.fragment.app;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class FragmentTabHost extends android.widget.TabHost implements android.widget.TabHost.OnTabChangeListener {

    /* JADX INFO: renamed from: ε */
    public final java.util.ArrayList f1102;

    /* JADX INFO: renamed from: ζ */
    public android.widget.TabHost.OnTabChangeListener f1103;

    /* JADX INFO: renamed from: η */
    public boolean f1104;

    @java.lang.Deprecated
    public FragmentTabHost(android.content.Context r4) {
            r3 = this;
            r0 = 0
            r3.<init>(r4, r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.f1102 = r1
            r1 = 16842995(0x10100f3, float:2.369424E-38)
            int[] r1 = new int[]{r1}
            r2 = 0
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r0, r1, r2, r2)
            r4.getResourceId(r2, r2)
            r4.recycle()
            super.setOnTabChangedListener(r3)
            return
    }

    @java.lang.Deprecated
    public FragmentTabHost(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r2.<init>(r3, r4)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f1102 = r0
            r0 = 16842995(0x10100f3, float:2.369424E-38)
            int[] r0 = new int[]{r0}
            r1 = 0
            android.content.res.TypedArray r3 = r3.obtainStyledAttributes(r4, r0, r1, r1)
            r3.getResourceId(r1, r1)
            r3.recycle()
            super.setOnTabChangedListener(r2)
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r3 = this;
            super.onAttachedToWindow()
            r3.getCurrentTabTag()
            java.util.ArrayList r0 = r3.f1102
            int r1 = r0.size()
            r2 = 0
            if (r1 > 0) goto L1e
            r1 = 1
            r3.f1104 = r1
            int r3 = r0.size()
            if (r3 > 0) goto L19
            return
        L19:
            java.lang.ClassCastException r3 = p000.lz1.m3685(r2, r0)
            throw r3
        L1e:
            java.lang.ClassCastException r3 = p000.lz1.m3685(r2, r0)
            throw r3
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            r0 = 0
            r1.f1104 = r0
            return
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            boolean r0 = r2 instanceof p000.l70
            if (r0 != 0) goto L8
            super.onRestoreInstanceState(r2)
            return
        L8:
            l70 r2 = (p000.l70) r2
            android.os.Parcelable r0 = r2.getSuperState()
            super.onRestoreInstanceState(r0)
            java.lang.String r2 = r2.f6462
            r1.setCurrentTabByTag(r2)
            return
    }

    @Override // android.view.View
    public final android.os.Parcelable onSaveInstanceState() {
            r2 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            l70 r1 = new l70
            r1.<init>(r0)
            java.lang.String r2 = r2.getCurrentTabTag()
            r1.f6462 = r2
            return r1
    }

    @Override // android.widget.TabHost.OnTabChangeListener
    public final void onTabChanged(java.lang.String r3) {
            r2 = this;
            boolean r0 = r2.f1104
            if (r0 == 0) goto L13
            java.util.ArrayList r0 = r2.f1102
            int r1 = r0.size()
            if (r1 > 0) goto Ld
            goto L13
        Ld:
            r2 = 0
            java.lang.ClassCastException r2 = p000.lz1.m3685(r2, r0)
            throw r2
        L13:
            android.widget.TabHost$OnTabChangeListener r2 = r2.f1103
            if (r2 == 0) goto L1a
            r2.onTabChanged(r3)
        L1a:
            return
    }

    @Override // android.widget.TabHost
    @java.lang.Deprecated
    public void setOnTabChangedListener(android.widget.TabHost.OnTabChangeListener r1) {
            r0 = this;
            r0.f1103 = r1
            return
    }

    @Override // android.widget.TabHost
    public final void setup() {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "Must call setup() that takes a Context and FragmentManager"
            r1.<init>(r0)
            throw r1
    }
}
