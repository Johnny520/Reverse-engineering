package p103;

import androidx.activity.compose.C0851;
import java.util.Arrays;
import kotlin.AbstractC6019;
import kotlin.InterfaceC6016;
import kotlin.collections.AbstractC5179;
import kotlinx.serialization.SerializationException;
import p105.InterfaceC8013;
import p106.InterfaceC8015;
import p106.InterfaceC8016;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7938 implements InterfaceC8013 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC6016 f19382;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Enum[] f19383;

    public C7938(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.f19383 = enumArr;
        this.f19382 = AbstractC6019.m10773(new C0851(this, 16, str));
    }

    @Override // p105.InterfaceC8013
    public final Object deserialize(InterfaceC8016 interfaceC8016) {
        int iMo11231 = interfaceC8016.mo11231(getDescriptor());
        Enum[] enumArr = this.f19383;
        if (iMo11231 >= 0 && iMo11231 < enumArr.length) {
            return enumArr[iMo11231];
        }
        throw new SerializationException(iMo11231 + " is not among valid " + getDescriptor().mo12941() + " enum values, values size is " + enumArr.length);
    }

    @Override // p105.InterfaceC8013
    public final InterfaceC8020 getDescriptor() {
        return (InterfaceC8020) this.f19382.getValue();
    }

    @Override // p105.InterfaceC8013
    public final void serialize(InterfaceC8015 interfaceC8015, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.f19383;
        int iM9411 = AbstractC5179.m9411(r5, enumArr);
        if (iM9411 != -1) {
            interfaceC8015.mo11265(getDescriptor(), iM9411);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strMo12941 = getDescriptor().mo12941();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strMo12941);
        sb.append(", must be one of ");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo12941() + '>';
    }
}
