package top.mmjz.floatingclouds.databinding;

/* JADX INFO: loaded from: classes.dex */
public final class FragmentMainBinding {
    private final androidx.recyclerview.widget.RecyclerView rootView;
    public final androidx.recyclerview.widget.RecyclerView settingsList;

    private FragmentMainBinding(androidx.recyclerview.widget.RecyclerView r1, androidx.recyclerview.widget.RecyclerView r2) {
            r0 = this;
            r0.<init>()
            r0.rootView = r1
            r0.settingsList = r2
            return
    }

    public static top.mmjz.floatingclouds.databinding.FragmentMainBinding bind(android.view.View r1) {
            if (r1 == 0) goto La
            androidx.recyclerview.widget.RecyclerView r1 = (androidx.recyclerview.widget.RecyclerView) r1
            top.mmjz.floatingclouds.databinding.FragmentMainBinding r0 = new top.mmjz.floatingclouds.databinding.FragmentMainBinding
            r0.<init>(r1, r1)
            return r0
        La:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException
            java.lang.String r0 = "rootView"
            r1.<init>(r0)
            throw r1
    }

    public static top.mmjz.floatingclouds.databinding.FragmentMainBinding inflate(android.view.LayoutInflater r2) {
            r0 = 0
            r1 = 0
            top.mmjz.floatingclouds.databinding.FragmentMainBinding r2 = inflate(r2, r0, r1)
            return r2
    }

    public static top.mmjz.floatingclouds.databinding.FragmentMainBinding inflate(android.view.LayoutInflater r2, android.view.ViewGroup r3, boolean r4) {
            int r0 = top.mmjz.floatingclouds.R.layout.fragment_main
            r1 = 0
            android.view.View r2 = r2.inflate(r0, r3, r1)
            if (r4 == 0) goto Lc
            r3.addView(r2)
        Lc:
            top.mmjz.floatingclouds.databinding.FragmentMainBinding r2 = bind(r2)
            return r2
    }

    public /* bridge */ /* synthetic */ android.view.View getRoot() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.m0getRoot()
            return r0
    }

    /* JADX INFO: renamed from: getRoot, reason: collision with other method in class */
    public androidx.recyclerview.widget.RecyclerView m0getRoot() {
            r1 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r1.rootView
            return r0
    }
}
