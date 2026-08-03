package top.mmjz.floatingclouds.p001ui;

import android.os.Bundle;
import android.util.Log;
import kotlin.Metadata;
import p000a.AbstractC0553e7;
import p000a.ActivityC0075E0;
import p000a.C0327S1;
import p000a.C0425X9;
import p000a.C0631i9;
import p000a.C0698m0;
import top.mmjz.floatingclouds.databinding.LayoutMainBinding;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m3302d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, m3303d2 = {"Ltop/mmjz/floatingclouds/ui/MainActivity;", "La/E0;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "La/Wf;", "onCreate", "(Landroid/os/Bundle;)V", "Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;", "binding", "Ltop/mmjz/floatingclouds/databinding/LayoutMainBinding;", "app_release"}, m3304k = 1, m3305mv = {2, 0, 0}, m3307xi = 48)
public final class MainActivity extends ActivityC0075E0 {
    private LayoutMainBinding binding;

    @Override // p000a.ActivityC0422X6, androidx.activity.ComponentActivity, p000a.ActivityC0060D3, android.app.Activity
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Floatingclouds", "MainActivity onCreate");
        LayoutMainBinding layoutMainBindingInflate = LayoutMainBinding.inflate(getLayoutInflater());
        this.binding = layoutMainBindingInflate;
        if (layoutMainBindingInflate == null) {
            C0631i9.m1484g("binding");
            throw null;
        }
        setContentView(layoutMainBindingInflate.getRoot());
        if (savedInstanceState == null) {
            AbstractC0553e7 supportFragmentManager = getSupportFragmentManager();
            supportFragmentManager.getClass();
            C0327S1 c0327s1 = new C0327S1(supportFragmentManager);
            LayoutMainBinding layoutMainBinding = this.binding;
            if (layoutMainBinding == null) {
                C0631i9.m1484g("binding");
                throw null;
            }
            c0327s1.m905e(layoutMainBinding.mainContainer.getId(), new C0425X9(), null, 1);
            if (c0327s1.f3006g) {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
            c0327s1.f1161q.m1335A(c0327s1, false);
            Log.i("Floatingclouds", "MainFragment attached");
        }
        C0698m0.f2635a.getClass();
        C0698m0.m1589b(this);
    }
}
