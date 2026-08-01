package p087;

import androidx.activity.compose.C0004;
import java.util.Arrays;
import kotlin.AbstractC5187;
import kotlin.InterfaceC5184;
import kotlin.collections.AbstractC4347;
import kotlinx.serialization.SerializationException;
import p089.InterfaceC7184;
import p090.InterfaceC7186;
import p090.InterfaceC7187;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲子楪.飘花落叶言子楪兰哲苏世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7109 implements InterfaceC7184 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final InterfaceC5184 f19037;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Enum[] f19038;

    public C7109(String str, Enum[] enumArr) {
        enumArr.getClass();
        this.f19038 = enumArr;
        this.f19037 = AbstractC5187.m10214(new C0004(this, 16, str));
    }

    @Override // p089.InterfaceC7184
    public final Object deserialize(InterfaceC7187 interfaceC7187) {
        int iMo10672 = interfaceC7187.mo10672(getDescriptor());
        Enum[] enumArr = this.f19038;
        if (iMo10672 >= 0 && iMo10672 < enumArr.length) {
            return enumArr[iMo10672];
        }
        throw new SerializationException(iMo10672 + " is not among valid " + getDescriptor().mo12382() + " enum values, values size is " + enumArr.length);
    }

    @Override // p089.InterfaceC7184
    public final InterfaceC7191 getDescriptor() {
        return (InterfaceC7191) this.f19037.getValue();
    }

    @Override // p089.InterfaceC7184
    public final void serialize(InterfaceC7186 interfaceC7186, Object obj) {
        Enum r5 = (Enum) obj;
        r5.getClass();
        Enum[] enumArr = this.f19038;
        int iM8852 = AbstractC4347.m8852(r5, enumArr);
        if (iM8852 != -1) {
            interfaceC7186.mo10706(getDescriptor(), iM8852);
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(r5);
        String strMo12382 = getDescriptor().mo12382();
        String string = Arrays.toString(enumArr);
        string.getClass();
        sb.append(" is not a valid enum ");
        sb.append(strMo12382);
        sb.append(", must be one of ");
        sb.append(string);
        throw new SerializationException(sb.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().mo12382() + '>';
    }
}
