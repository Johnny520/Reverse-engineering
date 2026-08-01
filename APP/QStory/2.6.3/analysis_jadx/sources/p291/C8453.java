package p291;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C8453 extends AbstractC8451 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Enum[] f23395;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f23396;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public byte[] f23397;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23398;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Member f23399;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long[] f23400;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String[] f23401;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public byte[][] f23402;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String[] f23403;

    /* JADX WARN: Multi-variable type inference failed */
    public C8453(Class cls, Member member, String[] strArr) {
        this.f23398 = cls;
        this.f23399 = member;
        if (member instanceof AccessibleObject) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f23395 = enumArr;
        this.f23401 = new String[enumArr.length];
        this.f23400 = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f23395;
            if (i >= enumArr2.length) {
                this.f23403 = strArr;
                return;
            }
            String strName = enumArr2[i].name();
            this.f23401[i] = strName;
            this.f23400[i] = AbstractC2860.m5774(strName);
            i++;
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (abstractC2897.m6058(obj, type, j)) {
            if (this.f23397 == null) {
                String strM5943 = AbstractC2867.m5943(this.f23398);
                this.f23397 = InterfaceC2912.m6355(strM5943);
                this.f23396 = AbstractC2860.m5774(strM5943);
            }
            abstractC2897.mo6043(this.f23396, this.f23397);
        }
        Enum r2 = (Enum) obj;
        if (abstractC2897.m6076(JSONWriter$Feature.WriteEnumUsingToString)) {
            abstractC2897.mo6017(r2.toString());
            return;
        }
        byte[][] bArr = this.f23402;
        String[] strArr = this.f23401;
        if (bArr == null) {
            this.f23402 = new byte[strArr.length][];
        }
        int iOrdinal = r2.ordinal();
        byte[] bArrM6355 = this.f23402[iOrdinal];
        if (bArrM6355 == null) {
            bArrM6355 = InterfaceC2912.m6355(strArr[iOrdinal]);
            this.f23402[iOrdinal] = bArrM6355;
        }
        abstractC2897.mo6008(bArrM6355);
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        int iOrdinal;
        Enum r7 = (Enum) obj;
        if (r7 == null) {
            abstractC2897.mo5967();
            return;
        }
        String strName = null;
        Member member = this.f23399;
        if (member != null) {
            try {
                Object objInvoke = member instanceof Field ? ((Field) member).get(obj) : ((Method) member).invoke(obj, null);
                if (objInvoke != obj) {
                    abstractC2897.mo6037(objInvoke);
                    return;
                }
            } catch (Exception e) {
                C0276.m843("getEnumValue error", e);
                return;
            }
        }
        long jM6078 = abstractC2897.m6078(j);
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & jM6078) != 0) {
            abstractC2897.mo6017(r7.toString());
            return;
        }
        if ((jM6078 & JSONWriter$Feature.WriteEnumUsingOrdinal.mask) != 0) {
            abstractC2897.mo5973(r7.ordinal());
            return;
        }
        String[] strArr = this.f23403;
        if (strArr != null && (iOrdinal = r7.ordinal()) < strArr.length) {
            strName = strArr[iOrdinal];
        }
        if (strName == null) {
            strName = r7.name();
        }
        abstractC2897.mo6017(strName);
    }
}
