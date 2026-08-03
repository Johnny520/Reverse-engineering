package androidx.recyclerview.widget;

import java.util.ArrayList;
import p000.C1384ev;
import p000.C2208lv;
import p000.InterfaceC2165kv;

/* JADX INFO: renamed from: androidx.recyclerview.widget.h */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1159h {

    /* JADX INFO: renamed from: a */
    public InterfaceC2165kv f4033a;

    /* JADX INFO: renamed from: b */
    public ArrayList f4034b;

    /* JADX INFO: renamed from: c */
    public long f4035c;

    /* JADX INFO: renamed from: d */
    public long f4036d;

    /* JADX INFO: renamed from: e */
    public long f4037e;

    /* JADX INFO: renamed from: f */
    public long f4038f;

    /* JADX INFO: renamed from: b */
    public static void m2245b(AbstractC1166o abstractC1166o) {
        int i = abstractC1166o.mFlags;
        if (!abstractC1166o.isInvalid() && (i & 4) == 0) {
            abstractC1166o.getOldPosition();
            abstractC1166o.getAbsoluteAdapterPosition();
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2246a(AbstractC1166o abstractC1166o, AbstractC1166o abstractC1166o2, C2208lv c2208lv, C2208lv c2208lv2);

    /* JADX INFO: renamed from: c */
    public final void m2247c(AbstractC1166o abstractC1166o) {
        InterfaceC2165kv interfaceC2165kv = this.f4033a;
        if (interfaceC2165kv != null) {
            RecyclerView recyclerView = ((C1384ev) interfaceC2165kv).f4930a;
            abstractC1166o.setIsRecyclable(true);
            if (abstractC1166o.mShadowedHolder != null && abstractC1166o.mShadowingHolder == null) {
                abstractC1166o.mShadowedHolder = null;
            }
            abstractC1166o.mShadowingHolder = null;
            if (abstractC1166o.shouldBeKeptAsChild() || recyclerView.removeAnimatingView(abstractC1166o.itemView) || !abstractC1166o.isTmpDetached()) {
                return;
            }
            recyclerView.removeDetachedView(abstractC1166o.itemView, false);
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2248d(AbstractC1166o abstractC1166o);

    /* JADX INFO: renamed from: e */
    public abstract void mo2249e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2250f();
}
