package p291;

import androidx.collection.C0276;
import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子兰楪世哲苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public final class C8461 extends AbstractC8459 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final Enum[] f23404;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public long f23405;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public byte[] f23406;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23407;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Member f23408;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final long[] f23409;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String[] f23410;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public byte[][] f23411;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final String[] f23412;

    /* JADX WARN: Multi-variable type inference failed */
    public C8461(Class cls, Member member, String[] strArr) {
        this.f23407 = cls;
        this.f23408 = member;
        if (member instanceof AccessibleObject) {
            try {
                ((AccessibleObject) member).setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        Enum[] enumArr = (Enum[]) cls.getEnumConstants();
        this.f23404 = enumArr;
        this.f23410 = new String[enumArr.length];
        this.f23409 = new long[enumArr.length];
        int i = 0;
        while (true) {
            Enum[] enumArr2 = this.f23404;
            if (i >= enumArr2.length) {
                this.f23412 = strArr;
                return;
            }
            String strName = enumArr2[i].name();
            this.f23410[i] = strName;
            this.f23409[i] = AbstractC2859.m5729(strName);
            i++;
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public final void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (abstractC2896.m6043(obj, type, j)) {
            if (this.f23406 == null) {
                String strM5898 = AbstractC2866.m5898(this.f23407);
                this.f23406 = InterfaceC2911.m6297(strM5898);
                this.f23405 = AbstractC2859.m5729(strM5898);
            }
            abstractC2896.mo5998(this.f23405, this.f23406);
        }
        Enum r2 = (Enum) obj;
        if (abstractC2896.m6030(JSONWriter$Feature.WriteEnumUsingToString)) {
            abstractC2896.mo5972(r2.toString());
            return;
        }
        byte[][] bArr = this.f23411;
        String[] strArr = this.f23410;
        if (bArr == null) {
            this.f23411 = new byte[strArr.length][];
        }
        int iOrdinal = r2.ordinal();
        byte[] bArrM6297 = this.f23411[iOrdinal];
        if (bArrM6297 == null) {
            bArrM6297 = InterfaceC2911.m6297(strArr[iOrdinal]);
            this.f23411[iOrdinal] = bArrM6297;
        }
        abstractC2896.mo5963(bArrM6297);
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        int iOrdinal;
        Enum r7 = (Enum) obj;
        if (r7 == null) {
            abstractC2896.mo5922();
            return;
        }
        String strName = null;
        Member member = this.f23408;
        if (member != null) {
            try {
                Object objInvoke = member instanceof Field ? ((Field) member).get(obj) : ((Method) member).invoke(obj, null);
                if (objInvoke != obj) {
                    abstractC2896.mo5992(objInvoke);
                    return;
                }
            } catch (Exception e) {
                C0276.m842("getEnumValue error", e);
                return;
            }
        }
        long jM6032 = abstractC2896.m6032(j);
        if ((JSONWriter$Feature.WriteEnumUsingToString.mask & jM6032) != 0) {
            abstractC2896.mo5972(r7.toString());
            return;
        }
        if ((jM6032 & JSONWriter$Feature.WriteEnumUsingOrdinal.mask) != 0) {
            abstractC2896.mo5928(r7.ordinal());
            return;
        }
        String[] strArr = this.f23412;
        if (strArr != null && (iOrdinal = r7.ordinal()) < strArr.length) {
            strName = strArr[iOrdinal];
        }
        if (strName == null) {
            strName = r7.name();
        }
        abstractC2896.mo5972(strName);
    }
}
