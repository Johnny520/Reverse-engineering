package p021;

import androidx.compose.foundation.lazy.layout.C0734;
import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC4394;
import p013.C6177;
import p013.C6179;
import p013.InterfaceC6184;
import p015.C6198;
import p015.C6204;
import p015.C6222;
import p015.InterfaceC6213;
import p015.InterfaceC6214;
import top.suzhelan.qstory.hook.item.C5919;

/* JADX INFO: renamed from: 飘花落叶言世兰苏子楪哲.飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C6259 implements InterfaceC6214 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final int f17229;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C6198 f17230;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C0734 f17231;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int f17232;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList f17233;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C6177 f17234;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final int f17235;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int f17236;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public int f17237;

    public C6259(C6177 c6177, ArrayList arrayList, int i, C0734 c0734, C6198 c6198, int i2, int i3, int i4) {
        this.f17234 = c6177;
        this.f17233 = arrayList;
        this.f17232 = i;
        this.f17231 = c0734;
        this.f17230 = c6198;
        this.f17229 = i2;
        this.f17236 = i3;
        this.f17235 = i4;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static C6259 m11742(C6259 c6259, int i, C0734 c0734, C6198 c6198, int i2) {
        if ((i2 & 1) != 0) {
            i = c6259.f17232;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            c0734 = c6259.f17231;
        }
        C0734 c07342 = c0734;
        if ((i2 & 4) != 0) {
            c6198 = c6259.f17230;
        }
        C6198 c61982 = c6198;
        int i4 = c6259.f17229;
        int i5 = c6259.f17236;
        int i6 = c6259.f17235;
        c61982.getClass();
        return new C6259(c6259.f17234, c6259.f17233, i3, c07342, c61982, i4, i5, i6);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final C6204 m11743(C6198 c6198) {
        c6198.getClass();
        ArrayList arrayList = this.f17233;
        int size = arrayList.size();
        int i = this.f17232;
        if (i >= size) {
            C5919.m11250("Check failed.");
            return null;
        }
        this.f17237++;
        C0734 c0734 = this.f17231;
        if (c0734 != null) {
            C6179 c6179Mo11199 = ((InterfaceC6184) c0734.f2069).mo11199();
            C6222 c6222 = c6198.f16955;
            c6179Mo11199.getClass();
            c6222.getClass();
            C6222 c62222 = c6179Mo11199.f16898.f17054;
            if (c6222.f17119 != c62222.f17119 || !AbstractC4394.m8917(c6222.f17120, c62222.f17120)) {
                C5919.m11242(arrayList.get(i - 1), "network interceptor ", " must retain the same host and port");
                return null;
            }
            if (this.f17237 != 1) {
                C5919.m11242(arrayList.get(i - 1), "network interceptor ", " must call proceed() exactly once");
                return null;
            }
        }
        int i2 = i + 1;
        C6259 c6259M11742 = m11742(this, i2, null, c6198, 58);
        InterfaceC6213 interfaceC6213 = (InterfaceC6213) arrayList.get(i);
        C6204 c6204Intercept = interfaceC6213.intercept(c6259M11742);
        if (c6204Intercept == null) {
            throw new NullPointerException("interceptor " + interfaceC6213 + " returned null");
        }
        if (c0734 == null || i2 >= arrayList.size() || c6259M11742.f17237 == 1) {
            return c6204Intercept;
        }
        C5919.m11242(interfaceC6213, "network interceptor ", " must call proceed() exactly once");
        return null;
    }
}
