package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1012;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4455;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4470;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4479;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4483;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4772;
import p000.AbstractC6087;
import p049.AbstractC6529;
import p052.InterfaceC6557;
import p079.AbstractC6976;
import p253.AbstractC8189;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4607 implements InterfaceC6557 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13462;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4607 f13460 = new C4607(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4607 f13461 = new C4607(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4607 f13456 = new C4607(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4607 f13455 = new C4607(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4607 f13458 = new C4607(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4607 f13459 = new C4607(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4607 f13457 = new C4607(6);

    public /* synthetic */ C4607(int i) {
        this.f13462 = i;
    }

    @Override // p052.InterfaceC6557
    public final Object invoke(Object obj) {
        InterfaceC4479 interfaceC4479M9512;
        String strM11409;
        boolean z = false;
        switch (this.f13462) {
            case 0:
                InterfaceC4479 interfaceC4479 = (InterfaceC4479) obj;
                int i = AbstractC4606.f13454;
                interfaceC4479.getClass();
                return Boolean.valueOf(AbstractC4343.m8789(AbstractC4601.f13434, AbstractC6087.m11409(interfaceC4479)));
            case 1:
                InterfaceC4479 interfaceC44792 = (InterfaceC4479) obj;
                int i2 = AbstractC4606.f13454;
                interfaceC44792.getClass();
                if ((interfaceC44792 instanceof InterfaceC4483) && AbstractC4343.m8789(AbstractC4601.f13434, AbstractC6087.m11409(interfaceC44792))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                InterfaceC4479 interfaceC44793 = (InterfaceC4479) obj;
                interfaceC44793.getClass();
                return Boolean.valueOf(AbstractC8189.m13677(interfaceC44793));
            case 3:
                return ((AbstractC6976) ((InterfaceC4455) obj)).getType();
            case 4:
                InterfaceC4479 interfaceC44794 = (InterfaceC4479) obj;
                interfaceC44794.getClass();
                return Boolean.valueOf(AbstractC8189.m13677(AbstractC4772.m9516(interfaceC44794)));
            case 5:
                InterfaceC4479 interfaceC44795 = (InterfaceC4479) obj;
                interfaceC44795.getClass();
                int i3 = AbstractC4608.f13463;
                InterfaceC4470 interfaceC4470 = (InterfaceC4470) interfaceC44795;
                if (AbstractC6529.m11969(interfaceC4470) && AbstractC4772.m9512(interfaceC4470, new C1012(interfaceC4470, 5)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                InterfaceC4479 interfaceC44796 = (InterfaceC4479) obj;
                interfaceC44796.getClass();
                if (AbstractC6529.m11969(interfaceC44796)) {
                    int i4 = AbstractC4606.f13454;
                    SpecialGenericSignatures$SpecialSignatureInfo specialGenericSignatures$SpecialSignatureInfo = null;
                    if (AbstractC4601.f13435.contains(interfaceC44796.getName()) && (interfaceC4479M9512 = AbstractC4772.m9512(interfaceC44796, f13461)) != null && (strM11409 = AbstractC6087.m11409(interfaceC4479M9512)) != null) {
                        specialGenericSignatures$SpecialSignatureInfo = AbstractC4601.f13438.contains(strM11409) ? SpecialGenericSignatures$SpecialSignatureInfo.ONE_COLLECTION_PARAMETER : ((SpecialGenericSignatures$TypeSafeBarrierDescription) AbstractC4338.m8780(strM11409, AbstractC4601.f13436)) == SpecialGenericSignatures$TypeSafeBarrierDescription.NULL ? SpecialGenericSignatures$SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialGenericSignatures$SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                    }
                    if (specialGenericSignatures$SpecialSignatureInfo != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
