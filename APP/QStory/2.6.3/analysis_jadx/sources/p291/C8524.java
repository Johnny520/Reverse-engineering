package p291;

import com.alibaba.fastjson2.AbstractC2897;
import com.alibaba.fastjson2.C2895;
import com.alibaba.fastjson2.InterfaceC2912;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2860;
import com.alibaba.fastjson2.util.AbstractC2867;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public class C8524 implements InterfaceC8523 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f23711;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC8494[] f23712;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f23713;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23714;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f23715;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f23716;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final long[] f23717;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f23718;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f23719;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f23720;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final short[] f23721;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f23722;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f23723;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte[] f23724;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public byte[] f23725;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public char[] f23726;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f23727;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final byte[] f23728;

    public C8524(Class cls, String str, String str2, long j, List list) {
        if (str2 == null && cls != null) {
            str2 = (!Enum.class.isAssignableFrom(cls) || cls.isEnum()) ? AbstractC2867.m5943(cls) : cls.getSuperclass().getName();
        }
        this.f23714 = cls;
        this.f23711 = (str == null || str.isEmpty()) ? "@type" : str;
        this.f23723 = str2;
        this.f23727 = str2 != null ? AbstractC2860.m5774(str2) : 0L;
        this.f23728 = InterfaceC2912.m6355(str2);
        this.f23718 = j;
        this.f23713 = list;
        this.f23719 = cls == null || Serializable.class.isAssignableFrom(cls);
        this.f23716 = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2);
        AbstractC8494[] abstractC8494Arr = new AbstractC8494[list.size()];
        this.f23712 = abstractC8494Arr;
        list.toArray(abstractC8494Arr);
        this.f23722 = abstractC8494Arr.length == 1 && (abstractC8494Arr[0].f23611 & 281474976710656L) != 0;
        int length = abstractC8494Arr.length;
        long[] jArr = new long[length];
        int i = 0;
        boolean z = false;
        while (true) {
            AbstractC8494[] abstractC8494Arr2 = this.f23712;
            if (i >= abstractC8494Arr2.length) {
                break;
            }
            AbstractC8494 abstractC8494 = abstractC8494Arr2[i];
            jArr[i] = AbstractC2860.m5774(abstractC8494.f23618);
            if (abstractC8494.f23603 != null && (abstractC8494.f23611 & 4503599627370496L) == 0) {
                z = true;
            }
            i++;
        }
        this.f23720 = z;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.f23717 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.f23721 = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f23721[Arrays.binarySearch(this.f23717, jArr[i2])] = (short) i2;
        }
    }

    @Override // p291.InterfaceC8523
    public final long getFeatures() {
        return this.f23718;
    }

    public final String toString() {
        return this.f23714.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14099(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        C2895 c2895 = abstractC2897.f9178;
        if (obj == null) {
            abstractC2897.mo5967();
            return;
        }
        if (!abstractC2897.m6058(obj, type, j)) {
            abstractC2897.mo5997();
        } else if (abstractC2897.f9171) {
            abstractC2897.mo6043(this.f23727, this.f23728);
            abstractC2897.mo5997();
        } else {
            abstractC2897.mo5997();
            m14100(abstractC2897);
        }
        long j2 = c2895.f9153 | j;
        long j3 = JSONWriter$Feature.ReferenceDetection.mask;
        int i = 0;
        boolean z = (j2 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0;
        while (true) {
            List list = this.f23713;
            if (i >= list.size()) {
                abstractC2897.mo5994();
                return;
            }
            AbstractC8494 abstractC8494 = (AbstractC8494) list.get(i);
            Field field = abstractC8494.f23613;
            if (!z || abstractC8494.f23603 == null || (abstractC8494.f23611 & 4503599627370496L) != 0) {
                abstractC8494.mo13999(abstractC2897, obj);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14100(AbstractC2897 abstractC2897) {
        boolean z = abstractC2897.f9176;
        String str = this.f23723;
        String str2 = this.f23711;
        if (z) {
            if (this.f23725 == null) {
                int length = str2.length();
                int length2 = str.length();
                int i = length + length2;
                byte[] bArr = new byte[i + 5];
                bArr[0] = 34;
                str2.getBytes(0, length, bArr, 1);
                bArr[length + 1] = 34;
                bArr[length + 2] = 58;
                bArr[length + 3] = 34;
                str.getBytes(0, length2, bArr, length + 4);
                bArr[i + 4] = 34;
                this.f23725 = bArr;
            }
            abstractC2897.mo5974(this.f23725);
            return true;
        }
        if (!abstractC2897.f9177) {
            if (!abstractC2897.f9171) {
                abstractC2897.mo6017(str2);
                abstractC2897.mo5979();
                abstractC2897.mo6017(str);
                return true;
            }
            if (this.f23724 == null) {
                this.f23724 = InterfaceC2912.m6355(str2);
            }
            abstractC2897.mo6008(this.f23724);
            abstractC2897.mo6008(this.f23728);
            return true;
        }
        if (this.f23726 == null) {
            int length3 = str2.length();
            int length4 = str.length();
            int i2 = length3 + length4;
            char[] cArr = new char[i2 + 5];
            cArr[0] = '\"';
            str2.getChars(0, length3, cArr, 1);
            cArr[length3 + 1] = '\"';
            cArr[length3 + 2] = ':';
            cArr[length3 + 3] = '\"';
            str.getChars(0, length4, cArr, length3 + 4);
            cArr[i2 + 4] = '\"';
            this.f23726 = cArr;
        }
        abstractC2897.mo5966(this.f23726);
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:251:0x057b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alibaba.fastjson2.JSONObject mo14092(java.lang.Object r57, long r58) {
        /*
            Method dump skipped, instruction units count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8524.mo14092(java.lang.Object, long):com.alibaba.fastjson2.JSONObject");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14101() {
        throw new JSONException("not support none serializable class ".concat(this.f23714.getName()));
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public AbstractC8494 mo14091(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f23717, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f23712[this.f23721[iBinarySearch]];
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo14097(AbstractC2897 abstractC2897) {
        return (this.f23720 && (abstractC2897.f9178.f9153 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0) | this.f23715;
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo5678(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        long j2 = this.f23718 | j | abstractC2897.f9178.f9153;
        if (!this.f23719) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j2) != 0) {
                m14101();
                throw null;
            }
            if ((JSONWriter$Feature.IgnoreNoneSerializable.mask & j2) != 0) {
                abstractC2897.mo5967();
                return;
            }
        }
        if ((j2 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
            m14099(abstractC2897, obj, obj2, type, j);
            return;
        }
        int length = this.f23712.length;
        if (abstractC2897.m6058(obj, type, j)) {
            abstractC2897.mo6043(this.f23727, this.f23728);
        }
        abstractC2897.mo5997();
        for (int i = 0; i < length; i++) {
            ((AbstractC8494) this.f23713.get(i)).mo13999(abstractC2897, obj);
        }
        abstractC2897.mo5994();
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo14018(AbstractC2897 abstractC2897, Object obj, Type type, long j) {
        if (abstractC2897.m6058(obj, type, j)) {
            abstractC2897.mo6043(this.f23727, this.f23728);
        }
        List list = this.f23713;
        int size = list.size();
        abstractC2897.mo6040(size);
        for (int i = 0; i < size; i++) {
            ((AbstractC8494) list.get(i)).mo13998(abstractC2897, obj);
        }
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo5679(AbstractC2897 abstractC2897, Object obj, Object obj2, Type type, long j) {
        if (this.f23722) {
            this.f23712[0].mo13998(abstractC2897, obj);
            return;
        }
        long j2 = j | this.f23718;
        long j3 = abstractC2897.f9178.f9153 | j2;
        boolean z = (JSONWriter$Feature.BeanToArray.mask & j3) != 0;
        if (abstractC2897.f9171) {
            if (z) {
                mo14018(abstractC2897, obj, type, j);
                return;
            } else {
                mo5678(abstractC2897, obj, obj2, type, j);
                return;
            }
        }
        if (this.f23716) {
            C8471.f23501.mo5679(abstractC2897, (Collection) obj, obj2, type, j);
            return;
        }
        if (z) {
            mo14019(abstractC2897, obj, obj2, type, j);
            return;
        }
        if (!this.f23719) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                m14101();
                throw null;
            }
            if ((j3 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
                abstractC2897.mo5967();
                return;
            }
        }
        if (mo14097(abstractC2897)) {
            m14099(abstractC2897, obj, obj2, type, j);
            return;
        }
        abstractC2897.mo5997();
        if ((j2 & JSONWriter$Feature.WriteClassName.mask) != 0 || abstractC2897.m6060(obj, j)) {
            m14100(abstractC2897);
        }
        List list = this.f23713;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8494) list.get(i)).mo13999(abstractC2897, obj);
        }
        abstractC2897.mo5994();
    }

    @Override // p291.InterfaceC8523
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final List mo14098() {
        return this.f23713;
    }
}
