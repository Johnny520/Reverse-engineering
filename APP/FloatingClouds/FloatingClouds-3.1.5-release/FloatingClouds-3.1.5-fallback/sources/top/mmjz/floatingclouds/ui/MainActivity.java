package top.mmjz.floatingclouds.ui;

/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ltop/mmjz/floatingclouds/ui/MainActivity;", "La/E0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "La/Wf;", "onCreate", "(Landroid/os/Bundle;)V", "Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;", "binding", "Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MainActivity extends a.E0 {
    private top.mmjz.floatingclouds.databinding.LayoutMainBinding binding;

    public MainActivity() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.X6, androidx.activity.ComponentActivity, a.D3, android.app.Activity
    public void onCreate(android.os.Bundle r6) {
            r5 = this;
            super.onCreate(r6)
            java.lang.String r0 = "Floatingclouds"
            java.lang.String r1 = "MainActivity onCreate"
            android.util.Log.i(r0, r1)
            android.view.LayoutInflater r1 = r5.getLayoutInflater()
            top.mmjz.floatingclouds.databinding.LayoutMainBinding r1 = top.mmjz.floatingclouds.databinding.LayoutMainBinding.inflate(r1)
            r5.binding = r1
            java.lang.String r2 = "binding"
            r3 = 0
            if (r1 == 0) goto L66
            android.widget.LinearLayout r1 = r1.m3getRoot()
            r5.setContentView(r1)
            if (r6 != 0) goto L5d
            a.e7 r6 = r5.getSupportFragmentManager()
            r6.getClass()
            a.S1 r1 = new a.S1
            r1.<init>(r6)
            top.mmjz.floatingclouds.databinding.LayoutMainBinding r6 = r5.binding
            if (r6 == 0) goto L59
            android.widget.FrameLayout r6 = r6.mainContainer
            int r6 = r6.getId()
            a.X9 r2 = new a.X9
            r2.<init>()
            r4 = 1
            r1.e(r6, r2, r3, r4)
            boolean r6 = r1.g
            if (r6 != 0) goto L51
            a.e7 r6 = r1.q
            r2 = 0
            r6.A(r1, r2)
            java.lang.String r6 = "MainFragment attached"
            android.util.Log.i(r0, r6)
            goto L5d
        L51:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "This transaction is already being added to the back stack"
            r6.<init>(r0)
            throw r6
        L59:
            a.C0193i9.g(r2)
            throw r3
        L5d:
            a.m0 r6 = a.C0255m0.f569a
            r6.getClass()
            a.C0255m0.b(r5)
            return
        L66:
            a.C0193i9.g(r2)
            throw r3
    }
}
