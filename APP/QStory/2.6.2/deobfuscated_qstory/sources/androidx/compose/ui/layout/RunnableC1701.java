package androidx.compose.ui.layout;

import android.os.Build;
import android.view.View;
import androidx.appcompat.app.C0076;
import androidx.collection.C0235;
import androidx.collection.C0236;
import androidx.collection.C0244;
import androidx.compose.runtime.AbstractC1346;
import androidx.compose.runtime.AbstractC1347;
import androidx.compose.runtime.AbstractC1349;
import androidx.compose.runtime.AbstractC1367;
import androidx.compose.runtime.InterfaceC1398;
import androidx.compose.runtime.snapshots.AbstractC1280;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.AbstractC2193;
import androidx.core.view.AbstractC2270;
import androidx.core.view.AbstractC2275;
import androidx.core.view.AbstractC2279;
import androidx.core.view.C2225;
import androidx.core.view.C2274;
import androidx.core.view.InterfaceC2205;
import java.util.List;
import java.util.WeakHashMap;
import p164.C7664;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1701 extends AbstractC2279 implements Runnable, InterfaceC2205, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2225 f4967;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f4968;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0244 f4969;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final SnapshotStateList f4970;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0236 f4971;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC1398 f4972;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f4973;

    public RunnableC1701() {
        super(1);
        C0236 c0236 = new C0236(9);
        InterfaceC1683.f4941.getClass();
        c0236.m754(C1682.f4935, new C1677("caption bar"));
        c0236.m754(C1682.f4934, new C1677("display cutout"));
        c0236.m754(C1682.f4933, new C1677("ime"));
        c0236.m754(C1682.f4932, new C1677("mandatory system gestures"));
        c0236.m754(C1682.f4931, new C1677("navigation bars"));
        c0236.m754(C1682.f4938, new C1677("status bars"));
        c0236.m754(C1682.f4937, new C1677("system gestures"));
        c0236.m754(C1682.f4939, new C1677("tappable element"));
        c0236.m754(C1682.f4940, new C1677("waterfall"));
        this.f4971 = c0236;
        this.f4972 = AbstractC1367.m2468(0);
        this.f4969 = new C0244(4);
        this.f4970 = new SnapshotStateList();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        AbstractC2193.m3994(view, this);
        AbstractC2270.m4232(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6593;
        AbstractC2193.m3994(view, null);
        AbstractC2270.m4232(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4973) {
            this.f4968 = 0;
            this.f4973 = false;
            C2225 c2225 = this.f4967;
            if (c2225 != null) {
                m3114(c2225);
                this.f4967 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0262  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3114(androidx.core.view.C2225 r28) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.RunnableC1701.m3114(androidx.core.view.飘花落叶言子哲兰世苏楪):void");
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C2225 mo1455(C2225 c2225, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2274 c2274 = (C2274) list.get(i);
            InterfaceC1683 interfaceC1683 = (InterfaceC1683) AbstractC1681.f4930.m832(c2274.f6603.mo4244());
            if (interfaceC1683 != null) {
                Object objM756 = this.f4971.m756(interfaceC1683);
                objM756.getClass();
                C1677 c1677 = (C1677) objM756;
                if (((Boolean) ((AbstractC1347) c1677.f4919).getValue()).booleanValue()) {
                    AbstractC2275 abstractC2275 = c2274.f6603;
                    ((AbstractC1349) c1677.f4918).m2425(abstractC2275.mo4245());
                    ((AbstractC1349) c1677.f4916).m2425(abstractC2275.mo4247());
                    c1677.f4917.m2388(abstractC2275.mo4246());
                }
            }
        }
        m3114(c2225);
        return c2225;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo1456(C2274 c2274) {
        this.f4973 = true;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0076 mo1457(C2274 c2274, C0076 c0076) {
        C2225 c2225 = this.f4967;
        boolean z = false;
        this.f4973 = false;
        this.f4967 = null;
        if (c2274.f6603.mo4246() > 0 && c2225 != null) {
            int iMo4244 = c2274.f6603.mo4244();
            this.f4968 |= iMo4244;
            InterfaceC1683 interfaceC1683 = (InterfaceC1683) AbstractC1681.f4930.m832(iMo4244);
            if (interfaceC1683 != null) {
                Object objM756 = this.f4971.m756(interfaceC1683);
                objM756.getClass();
                C1677 c1677 = (C1677) objM756;
                C7664 c7664Mo4042 = c2225.f6520.mo4042(iMo4244);
                long j = (((long) c7664Mo4042.f20815) << 48) | (((long) c7664Mo4042.f20814) << 32) | (((long) c7664Mo4042.f20813) << 16) | ((long) c7664Mo4042.f20812);
                long j2 = c1677.f4921;
                if (!AbstractC1670.m3099(j, j2)) {
                    c1677.f4925 = j2;
                    c1677.f4923 = j;
                    ((AbstractC1347) c1677.f4919).setValue(Boolean.TRUE);
                    AbstractC2275 abstractC2275 = c2274.f6603;
                    ((AbstractC1349) c1677.f4918).m2425(abstractC2275.mo4245());
                    ((AbstractC1349) c1677.f4916).m2425(abstractC2275.mo4247());
                    c1677.f4917.m2388(abstractC2275.mo4246());
                    AbstractC1346 abstractC1346 = (AbstractC1346) this.f4972;
                    abstractC1346.m2423(abstractC1346.m2422() + 1);
                    synchronized (AbstractC1280.f3744) {
                        C0235 c0235 = AbstractC1280.f3751.f3696;
                        if (c0235 != null) {
                            if (c0235.m871()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        AbstractC1280.m2253();
                        return c0076;
                    }
                }
            }
        }
        return c0076;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo1458(C2274 c2274) {
        boolean z = false;
        this.f4973 = false;
        int iMo4244 = c2274.f6603.mo4244();
        this.f4968 &= ~iMo4244;
        this.f4967 = null;
        InterfaceC1683 interfaceC1683 = (InterfaceC1683) AbstractC1681.f4930.m832(iMo4244);
        if (interfaceC1683 != null) {
            Object objM756 = this.f4971.m756(interfaceC1683);
            objM756.getClass();
            C1677 c1677 = (C1677) objM756;
            ((AbstractC1349) c1677.f4918).m2425(0.0f);
            ((AbstractC1349) c1677.f4916).m2425(1.0f);
            c1677.f4917.m2388(0L);
            ((AbstractC1349) c1677.f4918).m2425(0.0f);
            ((AbstractC1347) c1677.f4919).setValue(Boolean.FALSE);
            c1677.f4925 = -1L;
            c1677.f4923 = -1L;
            AbstractC1346 abstractC1346 = (AbstractC1346) this.f4972;
            abstractC1346.m2423(abstractC1346.m2422() + 1);
            synchronized (AbstractC1280.f3744) {
                C0235 c0235 = AbstractC1280.f3751.f3696;
                if (c0235 != null) {
                    if (c0235.m871()) {
                        z = true;
                    }
                }
            }
            if (z) {
                AbstractC1280.m2253();
            }
        }
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C2225 mo302(View view, C2225 c2225) {
        if (this.f4973) {
            this.f4967 = c2225;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c2225;
            }
        } else if (this.f4968 == 0) {
            m3114(c2225);
        }
        return c2225;
    }
}
