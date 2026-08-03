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
    public static void m2245b(AbstractC1166o r2) {
        int r0 = r2.mFlags;
        if (r2.isInvalid() == false) goto L6;
        return;
    L6:
        if ((r0 & 4) != 0) goto L9;
        r2.getOldPosition();
        r2.getAbsoluteAdapterPosition();
        return;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo2246a(AbstractC1166o r1, AbstractC1166o r2, C2208lv r3, C2208lv r4);

    /* JADX INFO: renamed from: c */
    public final void m2247c(AbstractC1166o r4) {
        InterfaceC2165kv r0 = this.f4033a;
        if (r0 == null) goto L17;
        RecyclerView r02 = ((C1384ev) r0).f4930a;
        r4.setIsRecyclable(true);
        if (r4.mShadowedHolder != null) goto L7;
    L9:
        r4.mShadowingHolder = null;
        if (r4.shouldBeKeptAsChild() == false) goto L12;
        return;
    L12:
        if (r02.removeAnimatingView(r4.itemView) == false) goto L14;
        return;
    L14:
        if (r4.isTmpDetached() == false) goto L20;
        r02.removeDetachedView(r4.itemView, false);
        return;
    L20:
        return;
    L7:
        if (r4.mShadowingHolder != null) goto L9;
        r4.mShadowedHolder = null;
        goto L9
    }

    /* JADX INFO: renamed from: d */
    public abstract void mo2248d(AbstractC1166o r1);

    /* JADX INFO: renamed from: e */
    public abstract void mo2249e();

    /* JADX INFO: renamed from: f */
    public abstract boolean mo2250f();
}
