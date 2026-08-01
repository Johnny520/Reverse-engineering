package androidx.compose.p001ui.layout;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import androidx.appcompat.app.C0923;
import androidx.collection.C1082;
import androidx.collection.C1083;
import androidx.collection.C1091;
import androidx.collection.C1093;
import androidx.compose.runtime.AbstractC2181;
import androidx.compose.runtime.AbstractC2182;
import androidx.compose.runtime.AbstractC2184;
import androidx.compose.runtime.AbstractC2202;
import androidx.compose.runtime.InterfaceC2230;
import androidx.compose.runtime.InterfaceC2233;
import androidx.compose.runtime.snapshots.AbstractC2115;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.core.view.AbstractC3026;
import androidx.core.view.AbstractC3095;
import androidx.core.view.AbstractC3103;
import androidx.core.view.AbstractC3108;
import androidx.core.view.AbstractC3112;
import androidx.core.view.C3058;
import androidx.core.view.C3087;
import androidx.core.view.C3107;
import androidx.core.view.InterfaceC3038;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.internal.AbstractC5227;
import p180.C8494;

/* JADX INFO: renamed from: androidx.compose.ui.layout.飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC2536 extends AbstractC3112 implements Runnable, InterfaceC3038, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public C3058 f5313;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public int f5314;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public final C1091 f5315;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
    public final SnapshotStateList f5316;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final C1083 f5317;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public final InterfaceC2233 f5318;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public boolean f5319;

    public RunnableC2536() {
        super(1);
        C1083 c1083 = new C1083(9);
        InterfaceC2518.f5287.getClass();
        c1083.m1315(C2517.f5281, new C2512("caption bar"));
        c1083.m1315(C2517.f5280, new C2512("display cutout"));
        c1083.m1315(C2517.f5279, new C2512("ime"));
        c1083.m1315(C2517.f5278, new C2512("mandatory system gestures"));
        c1083.m1315(C2517.f5277, new C2512("navigation bars"));
        c1083.m1315(C2517.f5284, new C2512("status bars"));
        c1083.m1315(C2517.f5283, new C2512("system gestures"));
        c1083.m1315(C2517.f5285, new C2512("tappable element"));
        c1083.m1315(C2517.f5286, new C2512("waterfall"));
        this.f5317 = c1083;
        this.f5318 = AbstractC2202.m3037(0);
        this.f5315 = new C1091(4);
        this.f5316 = new SnapshotStateList();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        AbstractC3026.m4564(view, this);
        AbstractC3103.m4802(view, this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            view = view2;
        }
        WeakHashMap weakHashMap = AbstractC3103.f6939;
        AbstractC3026.m4564(view, null);
        AbstractC3103.m4802(view, null);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f5319) {
            this.f5314 = 0;
            this.f5319 = false;
            C3058 c3058 = this.f5313;
            if (c3058 != null) {
                m3684(c3058);
                this.f5313 = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x0262  */
    /* JADX INFO: renamed from: 飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m3684(C3058 c3058) {
        char c;
        char c2;
        boolean z;
        char c3;
        boolean z2;
        boolean z3;
        long j;
        boolean z4;
        long[] jArr;
        int[] iArr;
        Object[] objArr;
        long[] jArr2;
        int[] iArr2;
        Object[] objArr2;
        long j2;
        int i;
        C1093 c1093 = AbstractC2516.f5276;
        int[] iArr3 = c1093.f1318;
        Object[] objArr3 = c1093.f1317;
        long[] jArr3 = c1093.f1319;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i2 = 0;
            z2 = false;
            z3 = false;
            c = 16;
            c2 = ' ';
            while (true) {
                long j3 = jArr3[i2];
                z = true;
                if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i3 = 8;
                    int i4 = 8 - ((~(i2 - length)) >>> 31);
                    int i5 = 0;
                    c3 = '0';
                    while (i5 < i4) {
                        if ((j3 & 255) < 128) {
                            int i6 = (i2 << 3) + i5;
                            int i7 = iArr3[i6];
                            InterfaceC2518 interfaceC2518 = (InterfaceC2518) objArr3[i6];
                            C8494 c8494Mo4612 = c3058.f6866.mo4612(i7);
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            long j4 = (((long) c8494Mo4612.f21155) << 48) | (((long) c8494Mo4612.f21154) << 32) | (((long) c8494Mo4612.f21153) << 16) | ((long) c8494Mo4612.f21152);
                            Object objM1317 = this.f5317.m1317(interfaceC2518);
                            objM1317.getClass();
                            C2512 c2512 = (C2512) objM1317;
                            j2 = j3;
                            if (!AbstractC2505.m3669(j4, c2512.f5267)) {
                                c2512.f5267 = j4;
                                z2 = true;
                                if (!AbstractC2505.m3669(j4, 0L)) {
                                    z3 = true;
                                }
                            }
                            if (i7 != 8) {
                                C8494 c8494Mo4613 = c3058.f6866.mo4613(i7);
                                objArr2 = objArr3;
                                long j5 = (((long) c8494Mo4613.f21154) << 32) | (((long) c8494Mo4613.f21155) << 48) | (((long) c8494Mo4613.f21153) << 16) | ((long) c8494Mo4613.f21152);
                                if (!AbstractC2505.m3669(c2512.f5270, j5)) {
                                    c2512.f5270 = j5;
                                    z2 = true;
                                    if (!AbstractC2505.m3669(j5, 0L)) {
                                        z3 = true;
                                    }
                                }
                            } else {
                                objArr2 = objArr3;
                            }
                            ((AbstractC2182) c2512.f5266).setValue(Boolean.valueOf(c3058.f6866.mo4605(i7)));
                            i = 8;
                        } else {
                            jArr2 = jArr3;
                            iArr2 = iArr3;
                            objArr2 = objArr3;
                            j2 = j3;
                            i = i3;
                        }
                        j3 = j2 >> i;
                        i5++;
                        i3 = i;
                        objArr3 = objArr2;
                        jArr3 = jArr2;
                        iArr3 = iArr2;
                    }
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    if (i4 != i3) {
                        break;
                    }
                } else {
                    jArr = jArr3;
                    iArr = iArr3;
                    objArr = objArr3;
                    c3 = '0';
                }
                if (i2 == length) {
                    break;
                }
                i2++;
                objArr3 = objArr;
                jArr3 = jArr;
                iArr3 = iArr;
            }
        } else {
            c = 16;
            c2 = ' ';
            z = true;
            c3 = '0';
            z2 = false;
            z3 = false;
        }
        C3087 c3087Mo4582 = c3058.f6866.mo4582();
        if (c3087Mo4582 == null) {
            j = 0;
        } else {
            C8494 c8494M4772 = c3087Mo4582.m4772();
            j = (((long) c8494M4772.f21155) << c3) | (((long) c8494M4772.f21154) << c2) | (((long) c8494M4772.f21153) << c) | ((long) c8494M4772.f21152);
        }
        C1083 c1083 = this.f5317;
        InterfaceC2518.f5287.getClass();
        Object objM13172 = c1083.m1317(C2517.f5286);
        objM13172.getClass();
        C2512 c25122 = (C2512) objM13172;
        ((AbstractC2182) c25122.f5266).setValue(Boolean.valueOf(!AbstractC2505.m3669(j, 0L)));
        if (!AbstractC2505.m3669(c25122.f5267, j)) {
            c25122.f5267 = j;
            c25122.f5270 = j;
            z2 = z;
            if (!AbstractC2505.m3669(j, 0L)) {
                z3 = z2;
            }
        }
        if (c3087Mo4582 == null) {
            C1091 c1091 = this.f5315;
            if (c1091.f1349 > 0) {
                c1091.m1339();
                this.f5316.clear();
                z2 = z;
            }
        } else {
            List listM4780 = Build.VERSION.SDK_INT >= 28 ? AbstractC3095.m4780(c3087Mo4582.f6906) : Collections.EMPTY_LIST;
            int size = listM4780.size();
            C1091 c10912 = this.f5315;
            if (size < c10912.f1349) {
                c10912.m1331(listM4780.size(), this.f5315.f1349);
                this.f5316.m2755(listM4780.size(), this.f5316.size());
                z2 = z;
            } else {
                int size2 = listM4780.size() - this.f5315.f1349;
                int i8 = 0;
                while (i8 < size2) {
                    C1091 c10913 = this.f5315;
                    c10913.m1335(AbstractC2202.m3034(listM4780.get(c10913.f1349)));
                    this.f5316.add(new C2535("display cutout rect " + this.f5315.f1349));
                    i8++;
                    z2 = z;
                }
            }
            int size3 = listM4780.size();
            for (int i9 = 0; i9 < size3; i9++) {
                Rect rect = (Rect) listM4780.get(i9);
                InterfaceC2230 interfaceC2230 = (InterfaceC2230) this.f5315.m1441(i9);
                if (!AbstractC5227.m9466(interfaceC2230.getValue(), rect)) {
                    interfaceC2230.setValue(rect);
                    z2 = z;
                }
            }
            if (!listM4780.isEmpty()) {
                z3 = z;
            }
        }
        if ((z3 || ((AbstractC2181) this.f5318).m2992() != 0) && z2) {
            AbstractC2181 abstractC2181 = (AbstractC2181) this.f5318;
            abstractC2181.m2993(abstractC2181.m2992() + 1);
            synchronized (AbstractC2115.f4090) {
                C1082 c1082 = AbstractC2115.f4097.f4042;
                if (c1082 != null) {
                    boolean z5 = z;
                    z4 = c1082.m1432() == z5 ? z5 : false;
                }
            }
            if (z4) {
                AbstractC2115.m2823();
            }
        }
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世兰楪 */
    public final C3058 mo2025(C3058 c3058, List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3107 c3107 = (C3107) list.get(i);
            InterfaceC2518 interfaceC2518 = (InterfaceC2518) AbstractC2516.f5276.m1393(c3107.f6949.mo4814());
            if (interfaceC2518 != null) {
                Object objM1317 = this.f5317.m1317(interfaceC2518);
                objM1317.getClass();
                C2512 c2512 = (C2512) objM1317;
                if (((Boolean) ((AbstractC2182) c2512.f5265).getValue()).booleanValue()) {
                    AbstractC3108 abstractC3108 = c3107.f6949;
                    ((AbstractC2184) c2512.f5264).m2995(abstractC3108.mo4815());
                    ((AbstractC2184) c2512.f5262).m2995(abstractC3108.mo4817());
                    c2512.f5263.m2958(abstractC3108.mo4816());
                }
            }
        }
        m3684(c3058);
        return c3058;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲世楪兰 */
    public final void mo2026(C3107 c3107) {
        this.f5319 = true;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲兰楪世 */
    public final C0923 mo2027(C3107 c3107, C0923 c0923) {
        C3058 c3058 = this.f5313;
        boolean z = false;
        this.f5319 = false;
        this.f5313 = null;
        if (c3107.f6949.mo4816() > 0 && c3058 != null) {
            int iMo4814 = c3107.f6949.mo4814();
            this.f5314 |= iMo4814;
            InterfaceC2518 interfaceC2518 = (InterfaceC2518) AbstractC2516.f5276.m1393(iMo4814);
            if (interfaceC2518 != null) {
                Object objM1317 = this.f5317.m1317(interfaceC2518);
                objM1317.getClass();
                C2512 c2512 = (C2512) objM1317;
                C8494 c8494Mo4612 = c3058.f6866.mo4612(iMo4814);
                long j = (((long) c8494Mo4612.f21155) << 48) | (((long) c8494Mo4612.f21154) << 32) | (((long) c8494Mo4612.f21153) << 16) | ((long) c8494Mo4612.f21152);
                long j2 = c2512.f5267;
                if (!AbstractC2505.m3669(j, j2)) {
                    c2512.f5271 = j2;
                    c2512.f5269 = j;
                    ((AbstractC2182) c2512.f5265).setValue(Boolean.TRUE);
                    AbstractC3108 abstractC3108 = c3107.f6949;
                    ((AbstractC2184) c2512.f5264).m2995(abstractC3108.mo4815());
                    ((AbstractC2184) c2512.f5262).m2995(abstractC3108.mo4817());
                    c2512.f5263.m2958(abstractC3108.mo4816());
                    AbstractC2181 abstractC2181 = (AbstractC2181) this.f5318;
                    abstractC2181.m2993(abstractC2181.m2992() + 1);
                    synchronized (AbstractC2115.f4090) {
                        C1082 c1082 = AbstractC2115.f4097.f4042;
                        if (c1082 != null) {
                            if (c1082.m1432()) {
                                z = true;
                            }
                        }
                    }
                    if (z) {
                        AbstractC2115.m2823();
                        return c0923;
                    }
                }
            }
        }
        return c0923;
    }

    @Override // androidx.core.view.AbstractC3112
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪世兰 */
    public final void mo2028(C3107 c3107) {
        boolean z = false;
        this.f5319 = false;
        int iMo4814 = c3107.f6949.mo4814();
        this.f5314 &= ~iMo4814;
        this.f5313 = null;
        InterfaceC2518 interfaceC2518 = (InterfaceC2518) AbstractC2516.f5276.m1393(iMo4814);
        if (interfaceC2518 != null) {
            Object objM1317 = this.f5317.m1317(interfaceC2518);
            objM1317.getClass();
            C2512 c2512 = (C2512) objM1317;
            ((AbstractC2184) c2512.f5264).m2995(0.0f);
            ((AbstractC2184) c2512.f5262).m2995(1.0f);
            c2512.f5263.m2958(0L);
            ((AbstractC2184) c2512.f5264).m2995(0.0f);
            ((AbstractC2182) c2512.f5265).setValue(Boolean.FALSE);
            c2512.f5271 = -1L;
            c2512.f5269 = -1L;
            AbstractC2181 abstractC2181 = (AbstractC2181) this.f5318;
            abstractC2181.m2993(abstractC2181.m2992() + 1);
            synchronized (AbstractC2115.f4090) {
                C1082 c1082 = AbstractC2115.f4097.f4042;
                if (c1082 != null) {
                    if (c1082.m1432()) {
                        z = true;
                    }
                }
            }
            if (z) {
                AbstractC2115.m2823();
            }
        }
    }

    @Override // androidx.core.view.InterfaceC3038
    /* JADX INFO: renamed from: 飘花落叶言子苏哲楪兰世 */
    public final C3058 mo863(View view, C3058 c3058) {
        if (this.f5319) {
            this.f5313 = c3058;
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
                return c3058;
            }
        } else if (this.f5314 == 0) {
            m3684(c3058);
        }
        return c3058;
    }
}
