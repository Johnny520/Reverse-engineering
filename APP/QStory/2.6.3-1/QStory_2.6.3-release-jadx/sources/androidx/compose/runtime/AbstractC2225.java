package androidx.compose.runtime;

import androidx.appcompat.widget.C1041;
import kotlin.jvm.internal.AbstractC5227;
import p068.InterfaceC7372;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.compose.runtime.飘花落叶言子苏哲兰楪世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2225 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C2143 f4384;

    public AbstractC2225(InterfaceC7372 interfaceC7372) {
        this.f4384 = new C2143(interfaceC7372);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[PHI: r4
  0x0036: PHI (r4v2 androidx.compose.runtime.飘花落叶言子兰楪世哲苏) = (r4v6 androidx.compose.runtime.飘花落叶言子兰楪世哲苏), (r4v7 androidx.compose.runtime.飘花落叶言子兰楪世哲苏) binds: [B:21:0x0043, B:16:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC2160 m3091(C1041 c1041, InterfaceC2160 interfaceC2160) {
        InterfaceC2160 interfaceC21602;
        InterfaceC2160 interfaceC21603 = null;
        interfaceC21603 = null;
        interfaceC21603 = null;
        interfaceC21603 = null;
        interfaceC21603 = null;
        interfaceC21603 = null;
        if (interfaceC2160 instanceof C2152) {
            if (c1041.f1108) {
                C2152 c2152 = (C2152) interfaceC2160;
                ((AbstractC2182) c2152.f4166).setValue(c1041.m1257());
                interfaceC21603 = c2152;
            }
        } else if (interfaceC2160 instanceof C2173) {
            if ((c1041.f1109 || c1041.f1110 != null) && !c1041.f1108) {
                C2173 c2173 = (C2173) interfaceC2160;
                boolean zM9466 = AbstractC5227.m9466(c1041.m1257(), c2173.f4245);
                interfaceC21602 = c2173;
                if (zM9466) {
                    interfaceC21603 = interfaceC21602;
                }
            }
        } else if (interfaceC2160 instanceof C2192) {
            c1041.getClass();
            C2192 c2192 = (C2192) interfaceC2160;
            InterfaceC7387 interfaceC7387 = c2192.f4275;
            interfaceC21602 = c2192;
            if (interfaceC7387 == null) {
            }
        }
        if (interfaceC21603 != null) {
            return interfaceC21603;
        }
        if (!c1041.f1108) {
            return new C2173(c1041.m1257());
        }
        Object obj = c1041.f1110;
        C2188 c2188 = (C2188) c1041.f1111;
        if (c2188 == null) {
            c2188 = C2188.f4267;
        }
        return new C2152(new ParcelableSnapshotMutableState(obj, c2188));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    public InterfaceC2160 mo2998() {
        return this.f4384;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰 */
    public abstract C1041 mo2988(Object obj);
}
