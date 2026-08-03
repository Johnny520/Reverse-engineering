package top.mmjz.floatingclouds.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemSettingButtonBinding {
    private final android.widget.LinearLayout rootView;
    public final android.widget.TextView tvDesc;
    public final android.widget.TextView tvTitle;

    private ItemSettingButtonBinding(android.widget.LinearLayout r1, android.widget.TextView r2, android.widget.TextView r3) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.tvDesc = r2
            r0.tvTitle = r3
            return
    }

    public static top.mmjz.floatingclouds.databinding.ItemSettingButtonBinding bind(android.view.View r3) {
            int r0 = top.mmjz.floatingclouds.R.id.tvDesc
            android.view.View r1 = a.C0282n9.p(r3, r0)
            android.widget.TextView r1 = (android.widget.TextView) r1
            if (r1 == 0) goto L1c
            int r0 = top.mmjz.floatingclouds.R.id.tvTitle
            android.view.View r2 = a.C0282n9.p(r3, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L1c
            top.mmjz.floatingclouds.databinding.ItemSettingButtonBinding r0 = new top.mmjz.floatingclouds.databinding.ItemSettingButtonBinding
            android.widget.LinearLayout r3 = (android.widget.LinearLayout) r3
            r0.<init>(r3, r1, r2)
            return r0
        L1c:
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r3 = r3.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
    }

    public static top.mmjz.floatingclouds.databinding.ItemSettingButtonBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            top.mmjz.floatingclouds.databinding.ItemSettingButtonBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static top.mmjz.floatingclouds.databinding.ItemSettingButtonBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = top.mmjz.floatingclouds.R.layout.item_setting_button
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            top.mmjz.floatingclouds.databinding.ItemSettingButtonBinding r2 = bind(r2)
            return r2
    }

    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.m1getRoot()
            return r0
    }

    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public android.widget.LinearLayout m1getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.rootView
            return r0
    }
}
