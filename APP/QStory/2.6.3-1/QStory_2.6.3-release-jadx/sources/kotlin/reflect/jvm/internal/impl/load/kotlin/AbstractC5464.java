package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.bumptech.glide.AbstractC3889;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5294;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.name.C5519;
import kotlin.reflect.jvm.internal.impl.name.C5520;
import kotlin.reflect.jvm.internal.impl.name.C5523;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractC5640;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5652;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5653;
import net.bytebuddy.pool.TypePool;
import p081.C7697;
import p086.C7727;
import p093.C7799;
import p093.C7800;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5464 {
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c4  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C7799 m9806(AbstractC5640 abstractC5640, boolean z, boolean z2, Boolean bool, boolean z3, C7800 c7800, C7727 c7727) {
        C5652 c5652;
        ProtoBuf$Class.Kind kind;
        abstractC5640.getClass();
        InterfaceC5294 interfaceC5294 = abstractC5640.f14362;
        c7727.getClass();
        if (z) {
            if (bool == null) {
                throw new IllegalStateException(("isConst should not be null for property (container=" + abstractC5640 + ')').toString());
            }
            if (abstractC5640 instanceof C5652) {
                C5652 c56522 = (C5652) abstractC5640;
                if (c56522.f14391 == ProtoBuf$Class.Kind.INTERFACE) {
                    return AbstractC3889.m7314(c7800, c56522.f14387.m9884(C5523.m9889("DefaultImpls")), c7727);
                }
            }
            if (bool.booleanValue() && (abstractC5640 instanceof C5653)) {
                C5481 c5481 = interfaceC5294 instanceof C5481 ? (C5481) interfaceC5294 : null;
                C7697 c7697 = c5481 != null ? c5481.f13929 : null;
                if (c7697 != null) {
                    String strM12651 = c7697.m12651();
                    strM12651.getClass();
                    String strReplace = strM12651.replace('/', TypePool.Default.LazyTypeDescription.GenericTypeToken.INNER_CLASS_PATH);
                    strReplace.getClass();
                    C5519 c5519 = new C5519(strReplace);
                    return AbstractC3889.m7314(c7800, new C5520(c5519.m9879(), c5519.f14041.m9877()), c7727);
                }
            }
        }
        if (z2 && (abstractC5640 instanceof C5652)) {
            C5652 c56523 = (C5652) abstractC5640;
            if (c56523.f14391 == ProtoBuf$Class.Kind.COMPANION_OBJECT && (c5652 = c56523.f14388) != null && ((kind = c5652.f14391) == ProtoBuf$Class.Kind.CLASS || kind == ProtoBuf$Class.Kind.ENUM_CLASS || (z3 && (kind == ProtoBuf$Class.Kind.INTERFACE || kind == ProtoBuf$Class.Kind.ANNOTATION_CLASS)))) {
                InterfaceC5294 interfaceC52942 = c5652.f14362;
                C5467 c5467 = interfaceC52942 instanceof C5467 ? (C5467) interfaceC52942 : null;
                if (c5467 != null) {
                    return c5467.f13899;
                }
            }
        } else if ((abstractC5640 instanceof C5653) && (interfaceC5294 instanceof C5481)) {
            C5481 c54812 = (C5481) interfaceC5294;
            C7799 c7799 = c54812.f13930;
            return c7799 == null ? AbstractC3889.m7314(c7800, c54812.m9811(), c7727) : c7799;
        }
        return null;
    }
}
