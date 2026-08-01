package p307;

import androidx.collection.C1123;
import com.alibaba.fastjson2.AbstractC3730;
import com.alibaba.fastjson2.InterfaceC3745;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC3693;
import com.alibaba.fastjson2.util.AbstractC3700;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C9282 extends AbstractC9280 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Enum[] f23740;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f23741;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public byte[] f23742;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23743;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Member f23744;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long[] f23745;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String[] f23746;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public byte[][] f23747;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String[] f23748;

    /* JADX WARN: Multi-variable type inference failed */
    public C9282(Class cls, Member member, String[] strArr) {
        this.f23743 = cls;
        this.f23744 = member;
        if (member instanceof AccessibleObject) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f23740 = enumArr;
        this.f23746 = new String[enumArr.length];
        this.f23745 = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f23740;
            if (i >= enumArr2.length) {
                this.f23748 = strArr;
                return;
            }
            String strName = enumArr2[i].name();
            this.f23746[i] = strName;
            this.f23745[i] = AbstractC3693.m6334(strName);
            i++;
        }
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo6238(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        if (abstractC3730.m6618(obj, type, j)) {
            if (this.f23742 == null) {
                String strM6503 = AbstractC3700.m6503(this.f23743);
                this.f23742 = InterfaceC3745.m6915(strM6503);
                this.f23741 = AbstractC3693.m6334(strM6503);
            }
            abstractC3730.mo6603(this.f23741, this.f23742);
        }
        Enum r2 = (Enum) obj;
        if (abstractC3730.m6636(JSONWriter$Feature.WriteEnumUsingToString)) {
            abstractC3730.mo6577(r2.toString());
            return;
        }
        byte[][] bArr = this.f23747;
        String[] strArr = this.f23746;
        if (bArr == null) {
            this.f23747 = new byte[strArr.length][];
        }
        int iOrdinal = r2.ordinal();
        byte[] bArrM6915 = this.f23747[iOrdinal];
        if (bArrM6915 == null) {
            bArrM6915 = InterfaceC3745.m6915(strArr[iOrdinal]);
            this.f23747[iOrdinal] = bArrM6915;
        }
        abstractC3730.mo6568(bArrM6915);
    }

    @Override // p307.InterfaceC9352
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo6239(AbstractC3730 abstractC3730, Object obj, Object obj2, Type type, long j) {
        int iOrdinal;
        Enum r7 = (Enum) obj;
        if (r7 == null) {
            abstractC3730.mo6527();
            return;
        }
        String strName = null;
        Member member = this.f23744;
        if (member != null) {
            try {
                Object objInvoke = member instanceof Field ? ((Field) member).get(obj) : ((Method) member).invoke(obj, null);
                if (objInvoke != obj) {
                    abstractC3730.mo6597(objInvoke);
                    return;
                }
            } catch (Exception e) {
                C1123.m1403("getEnumValue error", e);
                return;
            }
        }
        long jM6638 = abstractC3730.m6638(j);
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & jM6638) != 0) {
            abstractC3730.mo6577(r7.toString());
            return;
        }
        if ((jM6638 & JSONWriter$Feature.WriteEnumUsingOrdinal.mask) != 0) {
            abstractC3730.mo6533(r7.ordinal());
            return;
        }
        String[] strArr = this.f23748;
        if (strArr != null && (iOrdinal = r7.ordinal()) < strArr.length) {
            strName = strArr[iOrdinal];
        }
        if (strName == null) {
            strName = r7.name();
        }
        abstractC3730.mo6577(strName);
    }
}
