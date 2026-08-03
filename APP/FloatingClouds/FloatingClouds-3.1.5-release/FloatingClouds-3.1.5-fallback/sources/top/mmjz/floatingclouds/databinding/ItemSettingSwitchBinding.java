package top.mmjz.floatingclouds.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class ItemSettingSwitchBinding {
    private final android.widget.LinearLayout rootView;
    public final androidx.appcompat.widget.SwitchCompat switchCompat;
    public final android.widget.TextView tvDesc;
    public final android.widget.TextView tvTitle;

    private ItemSettingSwitchBinding(android.widget.LinearLayout r1, androidx.appcompat.widget.SwitchCompat r2, android.widget.TextView r3, android.widget.TextView r4) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.switchCompat = r2
            r0.tvDesc = r3
            r0.tvTitle = r4
            return
    }

    public static top.mmjz.floatingclouds.databinding.ItemSettingSwitchBinding bind(android.view.View r4) {
            int r0 = top.mmjz.floatingclouds.R.id.switchCompat
            android.view.View r1 = a.C0282n9.p(r4, r0)
            androidx.appcompat.widget.SwitchCompat r1 = (androidx.appcompat.widget.SwitchCompat) r1
            if (r1 == 0) goto L26
            int r0 = top.mmjz.floatingclouds.R.id.tvDesc
            android.view.View r2 = a.C0282n9.p(r4, r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L26
            int r0 = top.mmjz.floatingclouds.R.id.tvTitle
            android.view.View r3 = a.C0282n9.p(r4, r0)
            android.widget.TextView r3 = (android.widget.TextView) r3
            if (r3 == 0) goto L26
            top.mmjz.floatingclouds.databinding.ItemSettingSwitchBinding r0 = new top.mmjz.floatingclouds.databinding.ItemSettingSwitchBinding
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r0.<init>(r4, r1, r2, r3)
            return r0
        L26:
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r4 = r4.getResourceName(r0)
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "Missing required view with ID: "
            java.lang.String r4 = r1.concat(r4)
            r0.<init>(r4)
            throw r0
    }

    public static top.mmjz.floatingclouds.databinding.ItemSettingSwitchBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            top.mmjz.floatingclouds.databinding.ItemSettingSwitchBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static top.mmjz.floatingclouds.databinding.ItemSettingSwitchBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = top.mmjz.floatingclouds.R.layout.item_setting_switch
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            top.mmjz.floatingclouds.databinding.ItemSettingSwitchBinding r2 = bind(r2)
            return r2
    }

    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.m2getRoot()
            return r0
    }

    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public android.widget.LinearLayout m2getRoot() {
            r1 = this;
            android.widget.LinearLayout r0 = r1.rootView
            return r0
    }
}
