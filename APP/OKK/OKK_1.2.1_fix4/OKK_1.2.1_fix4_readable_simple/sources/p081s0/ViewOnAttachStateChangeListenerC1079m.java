package p081s0;

import android.view.View;
import java.lang.reflect.Field;
import p006D.AbstractC0068E;
import p006D.AbstractC0080Q;

/* JADX INFO: renamed from: s0.m */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnAttachStateChangeListenerC1079m implements View.OnAttachStateChangeListener {
    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View r2) {
        r2.removeOnAttachStateChangeListener(this);
        Field r02 = AbstractC0080Q.f219a;
        AbstractC0068E.m210c(r2);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View r1) {
    }
}
