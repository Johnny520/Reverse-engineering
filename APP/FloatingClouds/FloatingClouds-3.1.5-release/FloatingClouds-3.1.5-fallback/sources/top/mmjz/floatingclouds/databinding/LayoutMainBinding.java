package top.mmjz.floatingclouds.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class LayoutMainBinding {
    public final android.widget.FrameLayout mainContainer;
    private final android.widget.LinearLayout rootView;

    private LayoutMainBinding(android.widget.LinearLayout r1, android.widget.FrameLayout r2) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.mainContainer = r2
            return
    }

    public static top.mmjz.floatingclouds.databinding.LayoutMainBinding bind(android.view.View r2) {
            int r0 = top.mmjz.floatingclouds.R.id.mainContainer
            android.view.View r1 = a.C0282n9.p(r2, r0)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            if (r1 == 0) goto L12
            top.mmjz.floatingclouds.databinding.LayoutMainBinding r0 = new top.mmjz.floatingclouds.databinding.LayoutMainBinding
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            r0.<init>(r2, r1)
            return r0
        L12:
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r2 = r2.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r2 = r1.concat(r2)
            r0.<init>(r2)
            throw r0
    }

    public static top.mmjz.floatingclouds.databinding.LayoutMainBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            top.mmjz.floatingclouds.databinding.LayoutMainBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static top.mmjz.floatingclouds.databinding.LayoutMainBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = top.mmjz.floatingclouds.R.layout.layout_main
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            top.mmjz.floatingclouds.databinding.LayoutMainBinding r2 = bind(r2)
            return r2
    }

    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.m3getRoot()
            return r0
    }

    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public android.widget.LinearLayout m3getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.rootView
            return r0
    }
}
