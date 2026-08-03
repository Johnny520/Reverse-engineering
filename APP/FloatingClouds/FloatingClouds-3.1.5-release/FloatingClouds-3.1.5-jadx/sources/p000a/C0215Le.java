package p000a;

import android.view.View;
import com.google.android.material.behavior.SwipeDismissBehavior;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: a.Le */
/* JADX INFO: loaded from: classes.dex */
public final class C0215Le implements InterfaceC0182K {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SwipeDismissBehavior f732a;

    public C0215Le(SwipeDismissBehavior swipeDismissBehavior) {
        this.f732a = swipeDismissBehavior;
    }

    @Override // p000a.InterfaceC0182K
    /* JADX INFO: renamed from: a */
    public final boolean mo493a(View view) {
        SwipeDismissBehavior swipeDismissBehavior = this.f732a;
        if (!swipeDismissBehavior.mo3085s(view)) {
            return false;
        }
        WeakHashMap<View, C0181Jg> weakHashMap = C0866ug.f3395a;
        boolean z = view.getLayoutDirection() == 1;
        int i = swipeDismissBehavior.f5399d;
        view.offsetLeftAndRight((!(i == 0 && z) && (i != 1 || z)) ? view.getWidth() : -view.getWidth());
        view.setAlpha(0.0f);
        return true;
    }
}
