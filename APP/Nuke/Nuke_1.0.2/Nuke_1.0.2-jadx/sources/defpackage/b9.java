package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import java.util.Iterator;
import me.dartcv.nuke.R;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class b9 implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ b9(int i, Object obj) {
        this.h = i;
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.h) {
            case 0:
                c9 c9Var = (c9) this.i;
                Context context = view.getContext();
                if (!c9Var.d) {
                    context.getApplicationContext().registerComponentCallbacks(c9Var.e);
                    c9Var.d = true;
                }
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.h;
        boolean z = false;
        Object obj = this.i;
        switch (i) {
            case 0:
                c9 c9Var = (c9) obj;
                Context context = view.getContext();
                if (c9Var.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(c9Var.e);
                    c9Var.d = false;
                }
                break;
            case 1:
                o2 o2Var = (o2) obj;
                ViewParent parent = o2Var.getParent();
                Iterator it = (parent == null ? ee0.a : new c70(new ta(23, parent), bb3.o)).iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object obj2 = (ViewParent) it.next();
                        if (obj2 instanceof View) {
                            View view2 = (View) obj2;
                            view2.getClass();
                            Object tag = view2.getTag(R.id.is_pooling_container_tag);
                            Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                            if (bool != null ? bool.booleanValue() : false) {
                                z = true;
                            }
                        }
                    }
                }
                if (!z) {
                    o2Var.f();
                }
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((zt2) obj).c(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }
}
