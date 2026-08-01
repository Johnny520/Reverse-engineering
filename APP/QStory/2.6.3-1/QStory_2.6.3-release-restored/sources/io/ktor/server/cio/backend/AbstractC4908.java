package io.ktor.server.cio.backend;

import androidx.activity.compose.C0849;
import io.ktor.network.selector.C4835;
import io.ktor.server.cio.C4916;
import io.ktor.server.cio.C4918;
import kotlin.coroutines.InterfaceC5192;
import kotlin.jvm.internal.AbstractC5228;
import kotlin.jvm.internal.C5229;
import kotlin.time.AbstractC5992;
import kotlin.time.C5989;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.AbstractC6231;
import kotlinx.coroutines.C6234;
import kotlinx.coroutines.C6249;
import kotlinx.coroutines.C6270;
import kotlinx.coroutines.C6283;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.InterfaceC6233;
import p025.AbstractC7012;
import p068.InterfaceC7380;
import p321.C9452;
import p332.C9496;
import p414.AbstractC9968;
import p414.InterfaceC9970;

/* JADX INFO: renamed from: io.ktor.server.cio.backend.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC4908 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static final C4916 m9036(InterfaceC6233 interfaceC6233, C4918 c4918, InterfaceC7380 interfaceC7380) {
        interfaceC6233.getClass();
        C6270 c6270M11049 = AbstractC6231.m11049();
        C6283 c6283M11047 = AbstractC6231.m11047();
        StringBuilder sb = new StringBuilder("server-root-");
        int i = c4918.f12764;
        sb.append(i);
        C6249 c6249M11037 = AbstractC6231.m11037(interfaceC6233, new C6234(sb.toString()), CoroutineStart.UNDISPATCHED, new HttpServerKt$httpServer$serverJob$1(c6283M11047, null));
        InterfaceC5192 interfaceC5192Mo2990 = interfaceC6233.mo2990();
        interfaceC5192Mo2990.getClass();
        C4835 c4835 = new C4835(interfaceC5192Mo2990);
        C9452 c9452 = C5989.f15057;
        long jM10766 = AbstractC5992.m10766(c4918.f12763, DurationUnit.SECONDS);
        C5229 c5229 = AbstractC5228.f13320;
        String simpleName = c5229.mo9476(C4916.class).getSimpleName();
        if (simpleName == null && (simpleName = c5229.mo9476(C4916.class).mo9444()) == null) {
            simpleName = c5229.mo9476(C4916.class).toString();
        }
        simpleName.getClass();
        InterfaceC9970 interfaceC9970M15262 = AbstractC9968.m15262(simpleName);
        interfaceC9970M15262.getClass();
        C6249 c6249M11036 = AbstractC6231.m11036(interfaceC6233, C9496.m14924(c6249M11037, new C6234(AbstractC7012.m12147(i, "accept-"))), null, new HttpServerKt$httpServer$acceptJob$1(c4835, c4918, c6270M11049, interfaceC9970M15262, c6249M11037, jM10766, interfaceC7380, null), 2);
        c6249M11036.mo11118(new C0849(c6283M11047, 19, c6270M11049));
        c6249M11037.mo11118(new C4909(c4835, 1));
        return new C4916(c6249M11037, c6249M11036, c6270M11049);
    }
}
