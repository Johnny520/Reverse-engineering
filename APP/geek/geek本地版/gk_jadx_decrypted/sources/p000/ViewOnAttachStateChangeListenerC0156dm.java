package p000;

import android.view.View;
import com.github.megatronking.stringfog.Base64;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: dm */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC0156dm implements View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1605a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ View f1606b;

    public /* synthetic */ ViewOnAttachStateChangeListenerC0156dm(View view, int i) {
        this.f1605a = i;
        this.f1606b = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.f1605a) {
            case Base64.DEFAULT /* 0 */:
                View view2 = this.f1606b;
                view2.removeOnAttachStateChangeListener(this);
                WeakHashMap weakHashMap = ja0.f2600a;
                w90.m2552c(view2);
                break;
            default:
                AbstractC0346ip.m1503o("v", view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.f1605a) {
            case Base64.DEFAULT /* 0 */:
                break;
            default:
                AbstractC0346ip.m1503o("v", view);
                Object tag = view.getTag(2115043329);
                h40 h40Var = tag instanceof h40 ? (h40) tag : null;
                if (h40Var != null) {
                    h40Var.m1341c();
                }
                Object tag2 = view.getTag(2115043330);
                h40 h40Var2 = tag2 instanceof h40 ? (h40) tag2 : null;
                if (h40Var2 != null) {
                    h40Var2.m1341c();
                }
                View view2 = this.f1606b;
                if (view2 != null) {
                    Object tag3 = view2.getTag(2115043331);
                    h40 h40Var3 = tag3 instanceof h40 ? (h40) tag3 : null;
                    if (h40Var3 != null) {
                        h40Var3.m1341c();
                    }
                    Object tag4 = view2.getTag(2115043332);
                    h40 h40Var4 = tag4 instanceof h40 ? (h40) tag4 : null;
                    if (h40Var4 != null) {
                        h40Var4.m1341c();
                    }
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private final void m944a(View view) {
    }
}
