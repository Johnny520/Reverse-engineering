package p012;

import androidx.compose.foundation.lazy.layout.C0734;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4395;
import p007.C6125;
import p007.C6131;
import p007.C6149;
import p007.InterfaceC6140;
import p007.InterfaceC6141;
import p011.C6203;
import p011.C6206;
import p011.InterfaceC6210;
import top.suzhelan.qstory.hook.item.C5925;

/* JADX INFO: renamed from: 飘花落叶言世兰楪哲苏子.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6221 implements InterfaceC6141 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f17143;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6125 f17144;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0734 f17145;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17146;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f17147;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6203 f17148;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f17149;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f17150;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f17151;

    public C6221(C6203 c6203, ArrayList arrayList, int i, C0734 c0734, C6125 c6125, int i2, int i3, int i4) {
        this.f17148 = c6203;
        this.f17147 = arrayList;
        this.f17146 = i;
        this.f17145 = c0734;
        this.f17144 = c6125;
        this.f17143 = i2;
        this.f17150 = i3;
        this.f17149 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6221 m11672(C6221 c6221, int i, C0734 c0734, C6125 c6125, int i2) {
        if ((i2 & 1) != 0) {
            i = c6221.f17146;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c0734 = c6221.f17145;
        }
        C0734 c07342 = c0734;
        if ((i2 & 4) != 0) {
            c6125 = c6221.f17144;
        }
        C6125 c61252 = c6125;
        int i4 = c6221.f17143;
        int i5 = c6221.f17150;
        int i6 = c6221.f17149;
        c61252.getClass();
        return new C6221(c6221.f17148, c6221.f17147, i3, c07342, c61252, i4, i5, i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6131 m11673(C6125 c6125) {
        c6125.getClass();
        ArrayList arrayList = this.f17147;
        int size = arrayList.size();
        int i = this.f17146;
        if (i >= size) {
            C5925.m11311("Check failed.");
            return null;
        }
        this.f17151++;
        C0734 c0734 = this.f17145;
        if (c0734 != null) {
            C6206 c6206Mo11261 = ((InterfaceC6210) c0734.f2070).mo11261();
            C6149 c6149 = c6125.f16716;
            c6206Mo11261.getClass();
            c6149.getClass();
            C6149 c61492 = c6206Mo11261.f17107.f16815;
            if (c6149.f16880 != c61492.f16880 || !AbstractC4395.m8907(c6149.f16881, c61492.f16881)) {
                C5925.m11303(arrayList.get(i - 1), "network interceptor ", " must retain the same host and port");
                return null;
            }
            if (this.f17151 != 1) {
                C5925.m11303(arrayList.get(i - 1), "network interceptor ", " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        C6221 c6221M11672 = m11672(this, i2, null, c6125, 58);
        InterfaceC6140 interfaceC6140 = (InterfaceC6140) arrayList.get(i);
        C6131 c6131Intercept = interfaceC6140.intercept(c6221M11672);
        if (c6131Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC6140 + " returned null");
        }
        if (c0734 == null || i2 >= arrayList.size() || c6221M11672.f17151 == 1) {
            return c6131Intercept;
        }
        C5925.m11303(interfaceC6140, "network interceptor ", " must call proceed() exactly once");
        return null;
    }
}
