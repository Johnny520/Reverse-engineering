package p100;

import androidx.compose.animation.core.C1171;
import com.bumptech.glide.AbstractC3889;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.AbstractC5263;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C5262;
import kotlin.reflect.jvm.internal.impl.load.java.AbstractC5447;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.InterfaceC5402;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.C5410;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import p065.AbstractC7356;
import p097.InterfaceC7857;

/* JADX INFO: renamed from: 飘花落叶言世楪苏哲子兰.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC7874 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C5523 f19265 = C5523.m9889("message");

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final C5523 f19264 = C5523.m9889("allowedTargets");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final C5523 f19263 = C5523.m9889("value");

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final Map f19262 = AbstractC5171.m9333(new Pair(AbstractC7356.f18231, AbstractC5447.f13828), new Pair(AbstractC7356.f18233, AbstractC5447.f13827), new Pair(AbstractC7356.f18234, AbstractC5447.f13825));

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static InterfaceC5402 m12934(C1171 c1171, C5262 c5262, boolean z) {
        c5262.getClass();
        c1171.getClass();
        C5520 c5520M9536 = AbstractC5263.m9536(AbstractC3889.m7316(AbstractC3889.m7319(c5262.f13396)));
        C5519 c5519 = AbstractC5447.f13828;
        c5519.getClass();
        if (c5520M9536.equals(new C5520(c5519.m9879(), c5519.f14041.m9877()))) {
            return new C7880(c5262, c1171);
        }
        C5519 c55192 = AbstractC5447.f13827;
        c55192.getClass();
        if (c5520M9536.equals(new C5520(c55192.m9879(), c55192.f14041.m9877()))) {
            return new C7879(c5262, c1171);
        }
        C5519 c55193 = AbstractC5447.f13825;
        c55193.getClass();
        if (c5520M9536.equals(new C5520(c55193.m9879(), c55193.f14041.m9877()))) {
            return new C7875(c1171, c5262, AbstractC7356.f18234);
        }
        C5519 c55194 = AbstractC5447.f13826;
        c55194.getClass();
        if (c5520M9536.equals(new C5520(c55194.m9879(), c55194.f14041.m9877()))) {
            return null;
        }
        return new C5410(c1171, c5262, z);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static InterfaceC5402 m12935(C5519 c5519, InterfaceC7857 interfaceC7857, C1171 c1171) {
        C5262 c5262Mo9531;
        c5519.getClass();
        interfaceC7857.getClass();
        c1171.getClass();
        if (c5519.equals(AbstractC7356.f18238)) {
            C5519 c55192 = AbstractC5447.f13826;
            c55192.getClass();
            C5262 c5262Mo95312 = interfaceC7857.mo9531(c55192);
            if (c5262Mo95312 != null) {
                return new C7878(c5262Mo95312, c1171);
            }
        }
        C5519 c55193 = (C5519) f19262.get(c5519);
        if (c55193 == null || (c5262Mo9531 = interfaceC7857.mo9531(c55193)) == null) {
            return null;
        }
        return m12934(c1171, c5262Mo9531, false);
    }
}
