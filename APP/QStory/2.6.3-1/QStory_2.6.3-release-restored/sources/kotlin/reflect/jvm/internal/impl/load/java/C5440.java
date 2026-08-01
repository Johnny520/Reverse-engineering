package kotlin.reflect.jvm.internal.impl.load.java;

import androidx.compose.foundation.text.C1850;
import com.bumptech.glide.AbstractC3887;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5288;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5303;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5312;
import kotlin.reflect.jvm.internal.impl.descriptors.InterfaceC5316;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.AbstractC5605;
import p034.AbstractC7082;
import p065.AbstractC7359;
import p068.InterfaceC7387;
import p095.AbstractC7806;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.load.java.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C5440 implements InterfaceC7387 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f13811;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public static final C5440 f13809 = new C5440(0);

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public static final C5440 f13810 = new C5440(1);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public static final C5440 f13805 = new C5440(2);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public static final C5440 f13804 = new C5440(3);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public static final C5440 f13807 = new C5440(4);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public static final C5440 f13808 = new C5440(5);

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final C5440 f13806 = new C5440(6);

    public /* synthetic */ C5440(int i) {
        this.f13811 = i;
    }

    @Override // p068.InterfaceC7387
    public final Object invoke(Object obj) {
        InterfaceC5312 interfaceC5312M10061;
        String strM7219;
        boolean z = false;
        switch (this.f13811) {
            case 0:
                InterfaceC5312 interfaceC5312 = (InterfaceC5312) obj;
                int i = AbstractC5439.f13803;
                interfaceC5312.getClass();
                return Boolean.valueOf(AbstractC5176.m9365(AbstractC5434.f13783, AbstractC3887.m7219(interfaceC5312)));
            case 1:
                InterfaceC5312 interfaceC53122 = (InterfaceC5312) obj;
                int i2 = AbstractC5439.f13803;
                interfaceC53122.getClass();
                if ((interfaceC53122 instanceof InterfaceC5316) && AbstractC5176.m9365(AbstractC5434.f13783, AbstractC3887.m7219(interfaceC53122))) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                InterfaceC5312 interfaceC53123 = (InterfaceC5312) obj;
                interfaceC53123.getClass();
                return Boolean.valueOf(AbstractC7082.m12311(interfaceC53123));
            case 3:
                return ((AbstractC7806) ((InterfaceC5288) obj)).getType();
            case 4:
                InterfaceC5312 interfaceC53124 = (InterfaceC5312) obj;
                interfaceC53124.getClass();
                return Boolean.valueOf(AbstractC7082.m12311(AbstractC5605.m10065(interfaceC53124)));
            case 5:
                InterfaceC5312 interfaceC53125 = (InterfaceC5312) obj;
                interfaceC53125.getClass();
                int i3 = AbstractC5441.f13812;
                InterfaceC5303 interfaceC5303 = (InterfaceC5303) interfaceC53125;
                if (AbstractC7359.m12571(interfaceC5303) && AbstractC5605.m10061(interfaceC5303, new C1850(interfaceC5303, 5)) != null) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                InterfaceC5312 interfaceC53126 = (InterfaceC5312) obj;
                interfaceC53126.getClass();
                if (AbstractC7359.m12571(interfaceC53126)) {
                    int i4 = AbstractC5439.f13803;
                    SpecialGenericSignatures$SpecialSignatureInfo specialGenericSignatures$SpecialSignatureInfo = null;
                    if (AbstractC5434.f13784.contains(interfaceC53126.getName()) && (interfaceC5312M10061 = AbstractC5605.m10061(interfaceC53126, f13810)) != null && (strM7219 = AbstractC3887.m7219(interfaceC5312M10061)) != null) {
                        specialGenericSignatures$SpecialSignatureInfo = AbstractC5434.f13787.contains(strM7219) ? SpecialGenericSignatures$SpecialSignatureInfo.ONE_COLLECTION_PARAMETER : ((SpecialGenericSignatures$TypeSafeBarrierDescription) AbstractC5171.m9332(strM7219, AbstractC5434.f13785)) == SpecialGenericSignatures$TypeSafeBarrierDescription.NULL ? SpecialGenericSignatures$SpecialSignatureInfo.OBJECT_PARAMETER_GENERIC : SpecialGenericSignatures$SpecialSignatureInfo.OBJECT_PARAMETER_NON_GENERIC;
                    }
                    if (specialGenericSignatures$SpecialSignatureInfo != null) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
