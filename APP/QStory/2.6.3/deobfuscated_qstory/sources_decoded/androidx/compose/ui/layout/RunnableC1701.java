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
import p164.C7665;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC1701 extends AbstractC2279 implements Runnable, InterfaceC2205, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C2225 f4968;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f4969;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C0244 f4970;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final SnapshotStateList f4971;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C0236 f4972;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC1398 f4973;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f4974;

    public RunnableC1701() {
        super(1);
        C0236 c0236 = new C0236(9);
        InterfaceC1683.f4942.getClass();
        c0236.m755(C1682.f4936, new C1677("caption bar"));
        c0236.m755(C1682.f4935, new C1677("display cutout"));
        c0236.m755(C1682.f4934, new C1677("ime"));
        c0236.m755(C1682.f4933, new C1677("mandatory system gestures"));
        c0236.m755(C1682.f4932, new C1677("navigation bars"));
        c0236.m755(C1682.f4939, new C1677("status bars"));
        c0236.m755(C1682.f4938, new C1677("system gestures"));
        c0236.m755(C1682.f4940, new C1677("tappable element"));
        c0236.m755(C1682.f4941, new C1677("waterfall"));
        this.f4972 = c0236;
        this.f4973 = AbstractC1367.m2477(0);
        this.f4970 = new C0244(4);
        this.f4971 = new SnapshotStateList();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        AbstractC2193.m4004(view, this);
        AbstractC2270.m4242(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC2270.f6594;
        AbstractC2193.m4004(view, null);
        AbstractC2270.m4242(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f4974) {
            this.f4969 = 0;
            this.f4974 = false;
            C2225 c2225 = this.f4968;
            if (c2225 != null) {
                m3124(c2225);
                this.f4968 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0262  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m3124(androidx.core.view.C2225 r28) {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.layout.RunnableC1701.m3124(androidx.core.view.飘花落叶言子哲兰世苏楪):void");
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C2225 mo1465(C2225 c2225, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C2274 c2274 = (C2274) list.get(i);
            InterfaceC1683 interfaceC1683 = (InterfaceC1683) AbstractC1681.f4931.m833(c2274.f6604.mo4254());
            if (interfaceC1683 != null) {
                Object objM757 = this.f4972.m757(interfaceC1683);
                objM757.getClass();
                C1677 c1677 = (C1677) objM757;
                if (((Boolean) ((AbstractC1347) c1677.f4920).getValue()).booleanValue()) {
                    AbstractC2275 abstractC2275 = c2274.f6604;
                    ((AbstractC1349) c1677.f4919).m2435(abstractC2275.mo4255());
                    ((AbstractC1349) c1677.f4917).m2435(abstractC2275.mo4257());
                    c1677.f4918.m2398(abstractC2275.mo4256());
                }
            }
        }
        m3124(c2225);
        return c2225;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo1466(C2274 c2274) {
        this.f4974 = true;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0076 mo1467(C2274 c2274, C0076 c0076) {
        C2225 c2225 = this.f4968;
        boolean z = false;
        this.f4974 = false;
        this.f4968 = null;
        if (c2274.f6604.mo4256() > 0 && c2225 != null) {
            int iMo4254 = c2274.f6604.mo4254();
            this.f4969 |= iMo4254;
            InterfaceC1683 interfaceC1683 = (InterfaceC1683) AbstractC1681.f4931.m833(iMo4254);
            if (interfaceC1683 != null) {
                Object objM757 = this.f4972.m757(interfaceC1683);
                objM757.getClass();
                C1677 c1677 = (C1677) objM757;
                C7665 c7665Mo4052 = c2225.f6521.mo4052(iMo4254);
                long j = (((long) c7665Mo4052.f20810) << 48) | (((long) c7665Mo4052.f20809) << 32) | (((long) c7665Mo4052.f20808) << 16) | ((long) c7665Mo4052.f20807);
                long j2 = c1677.f4922;
                if (!AbstractC1670.m3109(j, j2)) {
                    c1677.f4926 = j2;
                    c1677.f4924 = j;
                    ((AbstractC1347) c1677.f4920).setValue(Boolean.TRUE);
                    AbstractC2275 abstractC2275 = c2274.f6604;
                    ((AbstractC1349) c1677.f4919).m2435(abstractC2275.mo4255());
                    ((AbstractC1349) c1677.f4917).m2435(abstractC2275.mo4257());
                    c1677.f4918.m2398(abstractC2275.mo4256());
                    AbstractC1346 abstractC1346 = (AbstractC1346) this.f4973;
                    abstractC1346.m2433(abstractC1346.m2432() + 1);
                    synchronized (AbstractC1280.f3745) {
                        C0235 c0235 = AbstractC1280.f3752.f3697;
                        if (c0235 != null) {
                            if (c0235.m872()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        AbstractC1280.m2263();
                        return c0076;
                    }
                }
            }
        }
        return c0076;
    }

    @Override // androidx.core.view.AbstractC2279
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo1468(C2274 c2274) {
        boolean z = false;
        this.f4974 = false;
        int iMo4254 = c2274.f6604.mo4254();
        this.f4969 &= ~iMo4254;
        this.f4968 = null;
        InterfaceC1683 interfaceC1683 = (InterfaceC1683) AbstractC1681.f4931.m833(iMo4254);
        if (interfaceC1683 != null) {
            Object objM757 = this.f4972.m757(interfaceC1683);
            objM757.getClass();
            C1677 c1677 = (C1677) objM757;
            ((AbstractC1349) c1677.f4919).m2435(0.0f);
            ((AbstractC1349) c1677.f4917).m2435(1.0f);
            c1677.f4918.m2398(0L);
            ((AbstractC1349) c1677.f4919).m2435(0.0f);
            ((AbstractC1347) c1677.f4920).setValue(Boolean.FALSE);
            c1677.f4926 = -1L;
            c1677.f4924 = -1L;
            AbstractC1346 abstractC1346 = (AbstractC1346) this.f4973;
            abstractC1346.m2433(abstractC1346.m2432() + 1);
            synchronized (AbstractC1280.f3745) {
                C0235 c0235 = AbstractC1280.f3752.f3697;
                if (c0235 != null) {
                    if (c0235.m872()) {
                        z = true;
                    }
                }
            }
            if (z) {
                AbstractC1280.m2263();
            }
        }
    }

    @Override // androidx.core.view.InterfaceC2205
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C2225 mo303(View view, C2225 c2225) {
        if (this.f4974) {
            this.f4968 = c2225;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c2225;
            }
        } else if (this.f4969 == 0) {
            m3124(c2225);
        }
        return c2225;
    }
}
