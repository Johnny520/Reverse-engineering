package androidx.compose.p001ui.text.font;

import android.graphics.Typeface;
import androidx.appcompat.app.C0923;
import androidx.appcompat.app.C0960;
import androidx.collection.C1115;
import androidx.compose.foundation.C1905;
import androidx.window.area.AbstractC3400;
import com.google.protobuf.DescriptorProtos$Edition;
import p089.C7766;
import p091.C7787;
import p091.C7790;
import p352.C9620;

/* JADX INFO: renamed from: androidx.compose.ui.text.font.飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C2828 implements InterfaceC2830 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C0960 f6228;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C2823 f6229;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C0923 f6230;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2811 f6231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2812 f6232;

    public C2828(C2812 c2812, C2811 c2811) {
        C0923 c0923 = AbstractC2820.f6214;
        C2823 c2823 = new C2823(AbstractC2820.f6213);
        C0960 c0960 = new C0960(27);
        this.f6232 = c2812;
        this.f6231 = c2811;
        this.f6230 = c0923;
        this.f6229 = c2823;
        this.f6228 = c0960;
        new C1905(this, 12);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C2803 m4263(AbstractC2827 abstractC2827, C2822 c2822, int i, int i2) {
        C2811 c2811 = this.f6231;
        c2811.getClass();
        int i3 = c2811.f6207;
        C2822 c28222 = (i3 == 0 || i3 == Integer.MAX_VALUE) ? c2822 : new C2822(AbstractC3400.m5650(c2822.f6222 + i3, 1, DescriptorProtos$Edition.EDITION_2023_VALUE));
        this.f6232.getClass();
        return m4264(new C2804(abstractC2827, c28222, i, i2, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c A[Catch: Exception -> 0x00a4, TRY_ENTER, TryCatch #2 {Exception -> 0x00a4, blocks: (B:26:0x0045, B:28:0x0058, B:31:0x005d, B:33:0x0061, B:39:0x0074, B:55:0x009c, B:56:0x00a3, B:34:0x0068, B:38:0x0070), top: B:66:0x0045 }] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C2803 m4264(C2804 c2804) {
        Typeface typefaceMo4256;
        C2803 c2803;
        Object objRemove;
        C0923 c0923 = this.f6230;
        synchronized (((C7790) c0923.f572)) {
            try {
                C2803 c28032 = (C2803) ((C1115) c0923.f573).m1392(c2804);
                if (c28032 != null) {
                    if (c28032.f6196) {
                        return c28032;
                    }
                    C1115 c1115 = (C1115) c0923.f573;
                    synchronized (((C7787) c1115.f1314)) {
                        C7766 c7766 = (C7766) c1115.f1308;
                        c7766.getClass();
                        objRemove = c7766.f18849.remove(c2804);
                        if (objRemove != null) {
                            c1115.f1311--;
                        }
                    }
                }
                try {
                    this.f6229.getClass();
                    AbstractC2827 abstractC2827 = c2804.f6202;
                    InterfaceC2806 interfaceC2806 = (InterfaceC2806) this.f6228.f702;
                    int i = c2804.f6200;
                    C2822 c2822 = c2804.f6201;
                    if (abstractC2827 == null || (abstractC2827 instanceof C2826)) {
                        typefaceMo4256 = interfaceC2806.mo4256(c2822, i);
                    } else if (abstractC2827 instanceof C2813) {
                        typefaceMo4256 = interfaceC2806.mo4257((C2813) abstractC2827, c2822, i);
                    } else {
                        if (!(abstractC2827 instanceof AbstractC2817)) {
                            c2803 = null;
                            if (c2803 != null) {
                                throw new IllegalStateException("Could not load font");
                            }
                            synchronized (((C7790) c0923.f572)) {
                                if (((C1115) c0923.f573).m1392(c2804) == null && c2803.f6196) {
                                    ((C1115) c0923.f573).m1391(c2804, c2803);
                                }
                            }
                            return c2803;
                        }
                        typefaceMo4256 = null;
                    }
                    c2803 = new C2803(typefaceMo4256);
                    if (c2803 != null) {
                    }
                } catch (Exception e) {
                    C9620.m15032("Could not load font", e);
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
