package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1012;
import com.bumptech.glide.AbstractC3055;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4456;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4471;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4480;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC4484;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC4773;
import p018.AbstractC6253;
import p049.AbstractC6530;
import p052.InterfaceC6558;
import p079.AbstractC6977;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4608 implements InterfaceC6558 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13466;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C4608 f13464 = new C4608(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C4608 f13465 = new C4608(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C4608 f13460 = new C4608(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C4608 f13459 = new C4608(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C4608 f13462 = new C4608(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C4608 f13463 = new C4608(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C4608 f13461 = new C4608(6);

    public /* synthetic */ C4608(int i) {
        this.f13466 = i;
    }

    @Override // p052.InterfaceC6558
    public final Object invoke(Object obj) {
        InterfaceC4480 interfaceC4480M9502;
        String strM6659;
        boolean z = false;
        switch (this.f13466) {
            case 0:
                InterfaceC4480 interfaceC4480 = (InterfaceC4480) obj;
                int i = AbstractC4607.f13458;
                interfaceC4480.getClass();
                return Boolean.valueOf(AbstractC4344.m8806(AbstractC4602.f13438, AbstractC3055.m6659(interfaceC4480)));
            case 1:
                InterfaceC4480 interfaceC44802 = (InterfaceC4480) obj;
                int i2 = AbstractC4607.f13458;
                interfaceC44802.getClass();
                if ((interfaceC44802 instanceof InterfaceC4484) && AbstractC4344.m8806(AbstractC4602.f13438, AbstractC3055.m6659(interfaceC44802))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                InterfaceC4480 interfaceC44803 = (InterfaceC4480) obj;
                interfaceC44803.getClass();
                return Boolean.valueOf(AbstractC6253.m11752(interfaceC44803));
            case 3:
                return ((AbstractC6977) ((InterfaceC4456) obj)).getType();
            case 4:
                InterfaceC4480 interfaceC44804 = (InterfaceC4480) obj;
                interfaceC44804.getClass();
                return Boolean.valueOf(AbstractC6253.m11752(AbstractC4773.m9506(interfaceC44804)));
            case 5:
                InterfaceC4480 interfaceC44805 = (InterfaceC4480) obj;
                interfaceC44805.getClass();
                int i3 = AbstractC4609.f13467;
                InterfaceC4471 interfaceC4471 = (InterfaceC4471) interfaceC44805;
                if (AbstractC6530.m12012(interfaceC4471) && AbstractC4773.m9502(interfaceC4471, new C1012(interfaceC4471, 5)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                InterfaceC4480 interfaceC44806 = (InterfaceC4480) obj;
                interfaceC44806.getClass();
                if (AbstractC6530.m12012(interfaceC44806)) {
                    int i4 = AbstractC4607.f13458;
                    SpecialGenericSignatures$SpecialSignatureInfo specialGenericSignatures$SpecialSignatureInfo = null;
                    if (AbstractC4602.f13439.contains(interfaceC44806.getName()) && (interfaceC4480M9502 = AbstractC4773.m9502(interfaceC44806, f13465)) != null && (strM6659 = AbstractC3055.m6659(interfaceC4480M9502)) != null) {
                        specialGenericSignatures$SpecialSignatureInfo = AbstractC4602.f13442.contains(strM6659) ? SpecialGenericSignatures$SpecialSignatureInfo.ONE_COLLECTION_PARAMETER : ((SpecialGenericSignatures$TypeSafeBarrierDescription) AbstractC4339.m8773(strM6659, AbstractC4602.f13440)) == SpecialGenericSignatures$TypeSafeBarrierDescription.NULL ? SpecialGenericSignatures$SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialGenericSignatures$SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                    }
                    if (specialGenericSignatures$SpecialSignatureInfo != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
