package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5179;
import kotlin.jvm.internal.AbstractC5227;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5298;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader$Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Class;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5658;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5663;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.C5665;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5622;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.C5628;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p083.C7714;
import p083.C7722;
import p086.C7727;
import p088.C7752;
import p093.C7799;
import p191.AbstractC8568;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.kotlin.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5483 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public static final C7727 f13933;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public static final C7727 f13934;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public C5665 f13937;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static final Set f13936 = AbstractC8568.m13614(KotlinClassHeader$Kind.CLASS);

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static final Set f13935 = AbstractC5179.m9404(new KotlinClassHeader$Kind[]{KotlinClassHeader$Kind.FILE_FACADE, KotlinClassHeader$Kind.MULTIFILE_CLASS_PART});

    static {
        new C7727(new int[]{1, 1, 2}, false);
        f13934 = new C7727(new int[]{1, 1, 11}, false);
        f13933 = new C7727(new int[]{1, 1, 13}, false);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final boolean m9812(C7799 c7799) {
        m9815().f14435.getClass();
        m9815().f14435.getClass();
        C7752 c7752 = c7799.f19005;
        return (c7752.f18819 & 2) != 0 && c7752.f18817.equals(f13934);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final C7727 m9813() {
        m9815().f14435.getClass();
        return C7727.f18701;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final C5658 m9814(C7799 c7799) {
        m9815().f14435.getClass();
        C7752 c7752 = c7799.f19005;
        C7727 c7727 = c7752.f18817;
        C7727 c77272 = c7752.f18817;
        C7727 c7727M9813 = m9813();
        c7727M9813.getClass();
        C7727 c77273 = c77272.f18702 ? C7727.f18701 : C7727.f18700;
        int i = c77273.f18755;
        int i2 = c7727M9813.f18755;
        if (i > i2 || (i >= i2 && c77273.f18754 > c7727M9813.f18754)) {
            c7727M9813 = c77273;
        }
        int i3 = c77272.f18754;
        int i4 = c77272.f18755;
        boolean z = false;
        if ((i4 != 1 || i3 != 0) && i4 != 0) {
            int i5 = c7727M9813.f18755;
            if (i4 > i5 || (i4 >= i5 && i3 > c7727M9813.f18754)) {
                z = true;
            }
            z = !z;
        }
        if (z) {
            return null;
        }
        C7727 c77274 = C7727.f18701;
        C7727 c7727M98132 = m9813();
        C7727 c7727M98133 = m9813();
        boolean z2 = c7727.f18702;
        c7727M98133.getClass();
        C7727 c77275 = z2 ? c77274 : C7727.f18700;
        int i6 = c77275.f18755;
        int i7 = c7727M98133.f18755;
        return new C5658(c7727, c77274, c7727M98132, (i6 <= i7 && (i6 < i7 || c77275.f18754 <= c7727M98133.f18754)) ? c7727M98133 : c77275, c7799.m12844());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final C5665 m9815() {
        C5665 c5665 = this.f13937;
        if (c5665 != null) {
            return c5665;
        }
        AbstractC5227.m9467("components");
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final DeserializedContainerAbiStability m9816(C7799 c7799) {
        m9815().f14435.getClass();
        int i = c7799.f19005.f18819;
        return ((i & 16) == 0 || (i & 32) != 0) ? DeserializedContainerAbiStability.STABLE : DeserializedContainerAbiStability.UNSTABLE;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001d  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5628 m9817(InterfaceC5298 interfaceC5298, C7799 c7799) {
        String[] strArr;
        Pair pairM12733;
        c7799.getClass();
        C7752 c7752 = c7799.f19005;
        C7727 c7727 = c7752.f18817;
        String[] strArr2 = c7752.f18816;
        if (strArr2 == null) {
            strArr2 = c7752.f18815;
        }
        if (strArr2 != null) {
            if (!f13935.contains(c7752.f18818)) {
                strArr2 = null;
            }
        }
        if (strArr2 != null && (strArr = c7752.f18814) != null) {
            try {
                try {
                    pairM12733 = C7722.m12733(strArr2, strArr);
                } catch (InvalidProtocolBufferException e) {
                    throw new IllegalStateException("Could not read data from ".concat(c7799.m12844()), e);
                }
            } catch (Throwable th) {
                m9815().f14435.getClass();
                C7727 c7727M9813 = m9813();
                c7727M9813.getClass();
                C7727 c77272 = c7727.f18702 ? C7727.f18701 : C7727.f18700;
                int i = c77272.f18755;
                int i2 = c7727M9813.f18755;
                if (i > i2 || (i >= i2 && c77272.f18754 > c7727M9813.f18754)) {
                    c7727M9813 = c77272;
                }
                int i3 = c7727.f18754;
                int i4 = c7727.f18755;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = c7727M9813.f18755;
                    if (i4 > i5 || (i4 >= i5 && i3 > c7727M9813.f18754)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                pairM12733 = null;
            }
            if (pairM12733 != null) {
                C7714 c7714 = (C7714) pairM12733.component1();
                ProtoBuf$Package protoBuf$Package = (ProtoBuf$Package) pairM12733.component2();
                m9814(c7799);
                C5481 c5481 = new C5481(c7799, protoBuf$Package, c7714, m9812(c7799), m9816(c7799));
                return new C5628(interfaceC5298, protoBuf$Package, c7714, c7727, c5481, m9815(), "scope for " + c5481 + " in " + interfaceC5298, C5479.f13923);
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C5663 m9818(C7799 c7799) {
        String[] strArr;
        Pair pairM12725;
        C7752 c7752 = c7799.f19005;
        C7727 c7727 = c7752.f18817;
        String[] strArr2 = c7752.f18816;
        if (strArr2 == null) {
            strArr2 = c7752.f18815;
        }
        if (strArr2 != null) {
            if (!f13936.contains(c7752.f18818)) {
                strArr2 = null;
            }
        }
        if (strArr2 != null && (strArr = c7752.f18814) != null) {
            try {
                try {
                    pairM12725 = C7722.m12725(strArr2, strArr);
                } catch (InvalidProtocolBufferException e) {
                    throw new IllegalStateException("Could not read data from ".concat(c7799.m12844()), e);
                }
            } catch (Throwable th) {
                m9815().f14435.getClass();
                C7727 c7727M9813 = m9813();
                c7727M9813.getClass();
                C7727 c77272 = c7727.f18702 ? C7727.f18701 : C7727.f18700;
                int i = c77272.f18755;
                int i2 = c7727M9813.f18755;
                if (i > i2 || (i >= i2 && c77272.f18754 > c7727M9813.f18754)) {
                    c7727M9813 = c77272;
                }
                int i3 = c7727.f18754;
                int i4 = c7727.f18755;
                boolean z = false;
                if ((i4 != 1 || i3 != 0) && i4 != 0) {
                    int i5 = c7727M9813.f18755;
                    if (i4 > i5 || (i4 >= i5 && i3 > c7727M9813.f18754)) {
                        z = true;
                    }
                    z = !z;
                }
                if (z) {
                    throw th;
                }
                pairM12725 = null;
            }
            if (pairM12725 != null) {
                C7714 c7714 = (C7714) pairM12725.component1();
                ProtoBuf$Class protoBuf$Class = (ProtoBuf$Class) pairM12725.component2();
                m9814(c7799);
                return new C5663(c7714, protoBuf$Class, c7727, new C5467(c7799, new C5622(m9812(c7799)), m9816(c7799)));
            }
        }
        return null;
    }
}
