package p000;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class u70 implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a */
    public r70 f4679a;

    /* JADX INFO: renamed from: b */
    public ViewGroup f4680b;

    /* JADX WARN: Removed duplicated region for block: B:102:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fa A[EDGE_INSN: B:137:0x01fa->B:92:0x01fa BREAK  A[LOOP:1: B:18:0x0085->B:91:0x01ef], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0202  */
    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onPreDraw() {
        /*
            Method dump skipped, instruction units count: 710
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.u70.onPreDraw():boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.f4680b;
        viewGroup.getViewTreeObserver().removeOnPreDrawListener(this);
        viewGroup.removeOnAttachStateChangeListener(this);
        v70.f4816c.remove(viewGroup);
        ArrayList arrayList = (ArrayList) v70.m2491b().getOrDefault(viewGroup, null);
        if (arrayList != null && arrayList.size() > 0) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                ((r70) obj).mo2274v(viewGroup);
            }
        }
        this.f4679a.m2265h(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
