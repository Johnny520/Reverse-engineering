package p291;

import com.alibaba.fastjson2.AbstractC2896;
import com.alibaba.fastjson2.C2894;
import com.alibaba.fastjson2.InterfaceC2911;
import com.alibaba.fastjson2.JSONException;
import com.alibaba.fastjson2.JSONWriter$Feature;
import com.alibaba.fastjson2.util.AbstractC2859;
import com.alibaba.fastjson2.util.AbstractC2866;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: 飘花落叶言楪子哲兰世苏.飘花落叶言子苏兰楪哲世, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public class C8532 implements InterfaceC8531 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f23720;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final AbstractC8502[] f23721;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final List f23722;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Class f23723;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public boolean f23724;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean f23725;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final long[] f23726;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲世苏兰, reason: contains not printable characters */
    public final long f23727;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final boolean f23728;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final boolean f23729;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final short[] f23730;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final boolean f23731;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final String f23732;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public byte[] f23733;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public byte[] f23734;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰哲世, reason: contains not printable characters */
    public char[] f23735;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final long f23736;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final byte[] f23737;

    public C8532(Class cls, String str, String str2, long j, List list) {
        if (str2 == null && cls != null) {
            str2 = (!Enum.class.isAssignableFrom(cls) || cls.isEnum()) ? AbstractC2866.m5898(cls) : cls.getSuperclass().getName();
        }
        this.f23723 = cls;
        this.f23720 = (str == null || str.isEmpty()) ? "@type" : str;
        this.f23732 = str2;
        this.f23736 = str2 != null ? AbstractC2859.m5729(str2) : 0L;
        this.f23737 = InterfaceC2911.m6297(str2);
        this.f23727 = j;
        this.f23722 = list;
        this.f23728 = cls == null || Serializable.class.isAssignableFrom(cls);
        this.f23725 = "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList".equals(str2) || "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet".equals(str2);
        AbstractC8502[] abstractC8502Arr = new AbstractC8502[list.size()];
        this.f23721 = abstractC8502Arr;
        list.toArray(abstractC8502Arr);
        this.f23731 = abstractC8502Arr.length == 1 && (abstractC8502Arr[0].f23620 & 281474976710656L) != 0;
        int length = abstractC8502Arr.length;
        long[] jArr = new long[length];
        int i = 0;
        boolean z = false;
        while (true) {
            AbstractC8502[] abstractC8502Arr2 = this.f23721;
            if (i >= abstractC8502Arr2.length) {
                break;
            }
            AbstractC8502 abstractC8502 = abstractC8502Arr2[i];
            jArr[i] = AbstractC2859.m5729(abstractC8502.f23627);
            if (abstractC8502.f23612 != null && (abstractC8502.f23620 & 4503599627370496L) == 0) {
                z = true;
            }
            i++;
        }
        this.f23729 = z;
        long[] jArrCopyOf = Arrays.copyOf(jArr, length);
        this.f23726 = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
        this.f23730 = new short[jArrCopyOf.length];
        for (int i2 = 0; i2 < length; i2++) {
            this.f23730[Arrays.binarySearch(this.f23726, jArr[i2])] = (short) i2;
        }
    }

    @Override // p291.InterfaceC8531
    public final long getFeatures() {
        return this.f23727;
    }

    public final String toString() {
        return this.f23723.getName();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m14080(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        C2894 c2894 = abstractC2896.f9176;
        if (obj == null) {
            abstractC2896.mo5922();
            return;
        }
        if (!abstractC2896.m6043(obj, type, j)) {
            abstractC2896.mo5952();
        } else if (abstractC2896.f9169) {
            abstractC2896.mo5998(this.f23736, this.f23737);
            abstractC2896.mo5952();
        } else {
            abstractC2896.mo5952();
            m14081(abstractC2896);
        }
        long j2 = c2894.f9151 | j;
        long j3 = JSONWriter$Feature.ReferenceDetection.mask;
        int i = 0;
        boolean z = (j2 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0;
        while (true) {
            List list = this.f23722;
            if (i >= list.size()) {
                abstractC2896.mo5949();
                return;
            }
            AbstractC8502 abstractC8502 = (AbstractC8502) list.get(i);
            Field field = abstractC8502.f23622;
            if (!z || abstractC8502.f23612 == null || (abstractC8502.f23620 & 4503599627370496L) != 0) {
                abstractC8502.mo13980(abstractC2896, obj);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean m14081(AbstractC2896 abstractC2896) {
        boolean z = abstractC2896.f9174;
        String str = this.f23732;
        String str2 = this.f23720;
        if (z) {
            if (this.f23734 == null) {
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
                this.f23734 = bArr;
            }
            abstractC2896.mo5929(this.f23734);
            return true;
        }
        if (!abstractC2896.f9175) {
            if (!abstractC2896.f9169) {
                abstractC2896.mo5972(str2);
                abstractC2896.mo5934();
                abstractC2896.mo5972(str);
                return true;
            }
            if (this.f23733 == null) {
                this.f23733 = InterfaceC2911.m6297(str2);
            }
            abstractC2896.mo5963(this.f23733);
            abstractC2896.mo5963(this.f23737);
            return true;
        }
        if (this.f23735 == null) {
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
            this.f23735 = cArr;
        }
        abstractC2896.mo5921(this.f23735);
        return true;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:251:0x057b  */
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.alibaba.fastjson2.JSONObject mo14073(java.lang.Object r57, long r58) {
        /*
            Method dump skipped, instruction units count: 1664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p291.C8532.mo14073(java.lang.Object, long):com.alibaba.fastjson2.JSONObject");
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m14082() {
        throw new JSONException("not support none serializable class ".concat(this.f23723.getName()));
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏 */
    public AbstractC8502 mo14072(long j) {
        int iBinarySearch = Arrays.binarySearch(this.f23726, j);
        if (iBinarySearch < 0) {
            return null;
        }
        return this.f23721[this.f23730[iBinarySearch]];
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏 */
    public final boolean mo14078(AbstractC2896 abstractC2896) {
        return (this.f23729 && (abstractC2896.f9176.f9151 & JSONWriter$Feature.IgnoreNonFieldGetter.mask) != 0) | this.f23724;
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲 */
    public void mo5633(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        long j2 = this.f23727 | j | abstractC2896.f9176.f9151;
        if (!this.f23728) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j2) != 0) {
                m14082();
                throw null;
            }
            if ((JSONWriter$Feature.IgnoreNoneSerializable.mask & j2) != 0) {
                abstractC2896.mo5922();
                return;
            }
        }
        if ((j2 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
            m14080(abstractC2896, obj, obj2, type, j);
            return;
        }
        int length = this.f23721.length;
        if (abstractC2896.m6043(obj, type, j)) {
            abstractC2896.mo5998(this.f23736, this.f23737);
        }
        abstractC2896.mo5952();
        for (int i = 0; i < length; i++) {
            ((AbstractC8502) this.f23722.get(i)).mo13980(abstractC2896, obj);
        }
        abstractC2896.mo5949();
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏 */
    public final void mo13999(AbstractC2896 abstractC2896, Object obj, Type type, long j) {
        if (abstractC2896.m6043(obj, type, j)) {
            abstractC2896.mo5998(this.f23736, this.f23737);
        }
        List list = this.f23722;
        int size = list.size();
        abstractC2896.mo5995(size);
        for (int i = 0; i < size; i++) {
            ((AbstractC8502) list.get(i)).mo13979(abstractC2896, obj);
        }
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public void mo5634(AbstractC2896 abstractC2896, Object obj, Object obj2, Type type, long j) {
        if (this.f23731) {
            this.f23721[0].mo13979(abstractC2896, obj);
            return;
        }
        long j2 = j | this.f23727;
        long j3 = abstractC2896.f9176.f9151 | j2;
        boolean z = (JSONWriter$Feature.BeanToArray.mask & j3) != 0;
        if (abstractC2896.f9169) {
            if (z) {
                mo13999(abstractC2896, obj, type, j);
                return;
            } else {
                mo5633(abstractC2896, obj, obj2, type, j);
                return;
            }
        }
        if (this.f23725) {
            C8479.f23510.mo5634(abstractC2896, (Collection) obj, obj2, type, j);
            return;
        }
        if (z) {
            mo14000(abstractC2896, obj, obj2, type, j);
            return;
        }
        if (!this.f23728) {
            if ((JSONWriter$Feature.ErrorOnNoneSerializable.mask & j3) != 0) {
                m14082();
                throw null;
            }
            if ((j3 & JSONWriter$Feature.IgnoreNoneSerializable.mask) != 0) {
                abstractC2896.mo5922();
                return;
            }
        }
        if (mo14078(abstractC2896)) {
            m14080(abstractC2896, obj, obj2, type, j);
            return;
        }
        abstractC2896.mo5952();
        if ((j2 & JSONWriter$Feature.WriteClassName.mask) != 0 || abstractC2896.m6013(obj, j)) {
            m14081(abstractC2896);
        }
        List list = this.f23722;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC8502) list.get(i)).mo13980(abstractC2896, obj);
        }
        abstractC2896.mo5949();
    }

    @Override // p291.InterfaceC8531
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final List mo14079() {
        return this.f23722;
    }
}
