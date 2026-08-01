package androidx.window.area;

import androidx.core.view.AbstractC2230;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.layout.C2599;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC4396;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2569 extends AbstractC2566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f7724 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final WindowAreaComponent f7727;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C2560 f7726 = C2560.f7704;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f7725 = new HashMap();

    static {
        AbstractC4396.f12975.mo8917(C2569.class).getSimpleName();
    }

    public C2569(WindowAreaComponent windowAreaComponent) {
        this.f7727 = windowAreaComponent;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5095(C2560 c2560, C2560 c25602, C2599 c2599) {
        HashMap map = this.f7725;
        C2564 c2564 = (C2564) map.get("WINDOW_AREA_REAR_DISPLAY");
        C2560 c25603 = C2560.f7703;
        if (c25602 != c25603) {
            if (c2564 == null) {
                c2564 = new C2564(c2599, AbstractC2230.m4110(), this.f7727);
            }
            c2564.f7716.put(c2560, new C2559(c2560, c25602));
            c2564.f7717 = c2599;
            map.put("WINDOW_AREA_REAR_DISPLAY", c2564);
            return;
        }
        if (c2564 != null) {
            HashMap map2 = c2564.f7716;
            for (Object obj : map2.values()) {
                obj.getClass();
                if (((C2559) obj).f7701 != c25603) {
                    map2.put(c2560, new C2559(c2560, c25602));
                    return;
                }
            }
            map.remove("WINDOW_AREA_REAR_DISPLAY");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5096(androidx.window.extensions.area.ExtensionWindowAreaStatus r10) {
        /*
            r9 = this;
            int r0 = r10.getWindowAreaStatus()
            int r1 = p147.AbstractC7563.m12792()
            androidx.window.area.飘花落叶言子楪世哲兰苏 r2 = androidx.window.area.C2560.f7708
            androidx.window.area.飘花落叶言子楪世哲兰苏 r3 = androidx.window.area.C2560.f7707
            androidx.window.area.飘花落叶言子楪世哲兰苏 r4 = androidx.window.area.C2560.f7703
            androidx.window.area.飘花落叶言子楪世哲兰苏 r5 = androidx.window.area.C2560.f7709
            r6 = 2
            r7 = 1
            r8 = 3
            if (r1 > r8) goto L1e
            if (r0 == 0) goto L2b
            if (r0 == r7) goto L2c
            if (r0 == r6) goto L29
            if (r0 == r8) goto L27
            goto L2b
        L1e:
            if (r0 == 0) goto L2b
            if (r0 == r7) goto L2c
            if (r0 == r6) goto L29
            if (r0 == r8) goto L27
            goto L2b
        L27:
            r2 = r5
            goto L2c
        L29:
            r2 = r3
            goto L2c
        L2b:
            r2 = r4
        L2c:
            r9.f7726 = r2
            androidx.window.layout.飘花落叶言子楪哲世苏兰 r0 = androidx.window.layout.InterfaceC2592.f7773
            android.util.DisplayMetrics r10 = r10.getWindowAreaDisplayMetrics()
            r10.getClass()
            r0.getClass()
            androidx.window.layout.飘花落叶言子楪苏兰哲世 r0 = new androidx.window.layout.飘花落叶言子楪苏兰哲世
            飘花落叶言子兰苏哲世楪.飘花落叶言子楪世苏兰哲 r1 = new 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世苏兰哲
            int r2 = r10.widthPixels
            int r3 = r10.heightPixels
            r4 = 0
            r1.<init>(r4, r4, r2, r3)
            float r10 = r10.density
            r0.<init>(r1, r10)
            androidx.window.area.飘花落叶言子楪世哲兰苏 r10 = androidx.window.area.C2560.f7705
            androidx.window.area.飘花落叶言子楪世哲兰苏 r1 = r9.f7726
            r9.m5095(r10, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.area.C2569.m5096(androidx.window.extensions.area.ExtensionWindowAreaStatus):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m5097(int r10) {
        /*
            r9 = this;
            androidx.window.layout.飘花落叶言子楪哲世苏兰 r0 = androidx.window.layout.InterfaceC2592.f7773
            androidx.window.extensions.area.WindowAreaComponent r1 = r9.f7727
            android.util.DisplayMetrics r1 = r1.getRearDisplayMetrics()
            r1.getClass()
            r0.getClass()
            androidx.window.layout.飘花落叶言子楪苏兰哲世 r0 = new androidx.window.layout.飘花落叶言子楪苏兰哲世
            飘花落叶言子兰苏哲世楪.飘花落叶言子楪世苏兰哲 r2 = new 飘花落叶言子兰苏哲世楪.飘花落叶言子楪世苏兰哲
            int r3 = r1.widthPixels
            int r4 = r1.heightPixels
            r5 = 0
            r2.<init>(r5, r5, r3, r4)
            float r1 = r1.density
            r0.<init>(r2, r1)
            int r1 = p147.AbstractC7563.m12792()
            androidx.window.area.飘花落叶言子楪世哲兰苏 r2 = androidx.window.area.C2560.f7708
            androidx.window.area.飘花落叶言子楪世哲兰苏 r3 = androidx.window.area.C2560.f7707
            androidx.window.area.飘花落叶言子楪世哲兰苏 r4 = androidx.window.area.C2560.f7703
            androidx.window.area.飘花落叶言子楪世哲兰苏 r5 = androidx.window.area.C2560.f7709
            r6 = 2
            r7 = 1
            r8 = 3
            if (r1 > r8) goto L39
            if (r10 == 0) goto L46
            if (r10 == r7) goto L47
            if (r10 == r6) goto L44
            if (r10 == r8) goto L42
            goto L46
        L39:
            if (r10 == 0) goto L46
            if (r10 == r7) goto L47
            if (r10 == r6) goto L44
            if (r10 == r8) goto L42
            goto L46
        L42:
            r2 = r5
            goto L47
        L44:
            r2 = r3
            goto L47
        L46:
            r2 = r4
        L47:
            androidx.window.area.飘花落叶言子楪世哲兰苏 r10 = androidx.window.area.C2560.f7706
            r9.m5095(r10, r2, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.area.C2569.m5097(int):void");
    }
}
