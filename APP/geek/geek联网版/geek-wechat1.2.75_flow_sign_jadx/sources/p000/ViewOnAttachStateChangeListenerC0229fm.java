package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: fm */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0229fm implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1806a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1807b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0229fm(View view, int i) {
        this.f1806a = i;
        this.f1807b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1806a) {
            case Base64.DEFAULT /* 0 */:
                View view2 = this.f1807b;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = oa0.f3426a;
                ba0.m506c(view2);
                break;
            default:
                AbstractC0493mp.m1857g(b50.m492a("mQ==\n", "7xCjbHIijUA=\n"), view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1806a) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                AbstractC0493mp.m1857g(b50.m492a("wg==\n", "tDWJv2m5r94=\n"), view);
                Object tag = view.getTag(2115043329);
                o40 o40Var = tag instanceof o40 ? (o40) tag : null;
                if (o40Var != null) {
                    o40Var.m1986c();
                }
                Object tag2 = view.getTag(2115043330);
                o40 o40Var2 = tag2 instanceof o40 ? (o40) tag2 : null;
                if (o40Var2 != null) {
                    o40Var2.m1986c();
                }
                View view2 = this.f1807b;
                if (view2 != null) {
                    Object tag3 = view2.getTag(2115043331);
                    o40 o40Var3 = tag3 instanceof o40 ? (o40) tag3 : null;
                    if (o40Var3 != null) {
                        o40Var3.m1986c();
                    }
                    Object tag4 = view2.getTag(2115043332);
                    o40 o40Var4 = tag4 instanceof o40 ? (o40) tag4 : null;
                    if (o40Var4 != null) {
                        o40Var4.m1986c();
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m1103a(View view) {
    }
}
