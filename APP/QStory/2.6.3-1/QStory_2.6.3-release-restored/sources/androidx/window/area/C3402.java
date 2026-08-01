package androidx.window.area;

import android.util.DisplayMetrics;
import androidx.core.view.AbstractC3063;
import androidx.window.extensions.area.ExtensionWindowAreaStatus;
import androidx.window.extensions.area.WindowAreaComponent;
import androidx.window.layout.C3426;
import androidx.window.layout.C3432;
import androidx.window.layout.InterfaceC3425;
import java.util.HashMap;
import kotlin.jvm.internal.AbstractC5228;
import p163.AbstractC8392;
import p163.C8396;

/* JADX INFO: renamed from: androidx.window.area.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C3402 extends AbstractC3399 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final /* synthetic */ int f8069 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final WindowAreaComponent f8072;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public C3393 f8071 = C3393.f8049;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final HashMap f8070 = new HashMap();

    static {
        AbstractC5228.f13320.mo9476(C3402.class).getSimpleName();
    }

    public C3402(WindowAreaComponent windowAreaComponent) {
        this.f8072 = windowAreaComponent;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final void m5655(C3393 c3393, C3393 c33932, C3432 c3432) {
        HashMap map = this.f8070;
        C3397 c3397 = (C3397) map.get("WINDOW_AREA_REAR_DISPLAY");
        C3393 c33933 = C3393.f8048;
        if (c33932 != c33933) {
            if (c3397 == null) {
                c3397 = new C3397(c3432, AbstractC3063.m4670(), this.f8072);
            }
            c3397.f8061.put(c3393, new C3392(c3393, c33932));
            c3397.f8062 = c3432;
            map.put("WINDOW_AREA_REAR_DISPLAY", c3397);
            return;
        }
        if (c3397 != null) {
            HashMap map2 = c3397.f8061;
            for (Object obj : map2.values()) {
                obj.getClass();
                if (((C3392) obj).f8046 != c33933) {
                    map2.put(c3393, new C3392(c3393, c33932));
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
    */
    public final void m5656(ExtensionWindowAreaStatus extensionWindowAreaStatus) {
        int windowAreaStatus = extensionWindowAreaStatus.getWindowAreaStatus();
        int iM13351 = AbstractC8392.m13351();
        C3393 c3393 = C3393.f8053;
        C3393 c33932 = C3393.f8052;
        C3393 c33933 = C3393.f8048;
        C3393 c33934 = C3393.f8054;
        if (iM13351 <= 3) {
            if (windowAreaStatus == 0) {
                c3393 = c33933;
            } else if (windowAreaStatus != 1) {
                if (windowAreaStatus != 2) {
                    if (windowAreaStatus == 3) {
                        c3393 = c33934;
                    }
                }
                c3393 = c33932;
            }
        } else if (windowAreaStatus != 0) {
            if (windowAreaStatus != 1) {
                if (windowAreaStatus != 2) {
                    if (windowAreaStatus != 3) {
                    }
                }
                c3393 = c33932;
            }
        }
        this.f8071 = c3393;
        C3426 c3426 = InterfaceC3425.f8118;
        DisplayMetrics windowAreaDisplayMetrics = extensionWindowAreaStatus.getWindowAreaDisplayMetrics();
        windowAreaDisplayMetrics.getClass();
        c3426.getClass();
        m5655(C3393.f8050, this.f8071, new C3432(new C8396(0, 0, windowAreaDisplayMetrics.widthPixels, windowAreaDisplayMetrics.heightPixels), windowAreaDisplayMetrics.density));
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5657(int i) {
        C3426 c3426 = InterfaceC3425.f8118;
        DisplayMetrics rearDisplayMetrics = this.f8072.getRearDisplayMetrics();
        rearDisplayMetrics.getClass();
        c3426.getClass();
        C3432 c3432 = new C3432(new C8396(0, 0, rearDisplayMetrics.widthPixels, rearDisplayMetrics.heightPixels), rearDisplayMetrics.density);
        int iM13351 = AbstractC8392.m13351();
        C3393 c3393 = C3393.f8053;
        C3393 c33932 = C3393.f8052;
        C3393 c33933 = C3393.f8048;
        C3393 c33934 = C3393.f8054;
        if (iM13351 <= 3) {
            if (i == 0) {
                c3393 = c33933;
            } else if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        c3393 = c33934;
                    }
                }
                c3393 = c33932;
            }
        } else if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                    }
                }
                c3393 = c33932;
            }
        }
        m5655(C3393.f8051, c3393, c3432);
    }
}
