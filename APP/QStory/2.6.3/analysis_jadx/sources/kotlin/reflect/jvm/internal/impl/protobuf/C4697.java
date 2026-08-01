package kotlin.reflect.jvm.internal.impl.protobuf;

import bsh.C2633;
import com.google.protobuf.C3349;
import com.google.protobuf.C3412;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4697 extends AbstractC4710 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final int[] f13747;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f13748;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4710 f13749;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f13750;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13751 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13752;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4710 f13753;

    static {
        ArrayList arrayList = new ArrayList();
        int i = 1;
        int i2 = 1;
        while (i > 0) {
            arrayList.add(Integer.valueOf(i));
            int i3 = i2 + i;
            i2 = i;
            i = i3;
        }
        arrayList.add(Integer.MAX_VALUE);
        f13747 = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f13747;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C4697(AbstractC4710 abstractC4710, AbstractC4710 abstractC47102) {
        this.f13753 = abstractC4710;
        this.f13749 = abstractC47102;
        int size = abstractC4710.size();
        this.f13748 = size;
        this.f13752 = abstractC47102.size() + size;
        this.f13750 = Math.max(abstractC4710.mo9352(), abstractC47102.mo9352()) + 1;
    }

    public final boolean equals(Object obj) {
        int iMo9349;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4710) {
            AbstractC4710 abstractC4710 = (AbstractC4710) obj;
            int size = abstractC4710.size();
            int i = this.f13752;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f13751 == 0 || (iMo9349 = abstractC4710.mo9349()) == 0 || this.f13751 == iMo9349) {
                    C3412 c3412 = new C3412(this);
                    C4716 c4716M7513 = c3412.m7513();
                    C3412 c34122 = new C3412(abstractC4710);
                    C4716 c4716M75132 = c34122.m7513();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = c4716M7513.f13784.length - i2;
                        int length2 = c4716M75132.f13784.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? c4716M7513.m9408(c4716M75132, i3, iMin) : c4716M75132.m9408(c4716M7513, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            C2633.m5341();
                            return false;
                        }
                        if (iMin == length) {
                            c4716M7513 = c3412.m7513();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            c4716M75132 = c34122.m7513();
                            i3 = 0;
                        } else {
                            i3 += iMin;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int iMo9353 = this.f13751;
        if (iMo9353 == 0) {
            int i = this.f13752;
            iMo9353 = mo9353(i, 0, i);
            if (iMo9353 == 0) {
                iMo9353 = 1;
            }
            this.f13751 = iMo9353;
        }
        return iMo9353;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3349(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    public final int size() {
        return this.f13752;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo9346(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        AbstractC4710 abstractC4710 = this.f13753;
        int i5 = this.f13748;
        if (i4 <= i5) {
            abstractC4710.mo9346(bArr, i, i2, i3);
            return;
        }
        AbstractC4710 abstractC47102 = this.f13749;
        if (i >= i5) {
            abstractC47102.mo9346(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC4710.mo9346(bArr, i, i2, i6);
        abstractC47102.mo9346(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int mo9347(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC4710 abstractC4710 = this.f13753;
        int i5 = this.f13748;
        if (i4 <= i5) {
            return abstractC4710.mo9347(i, i2, i3);
        }
        AbstractC4710 abstractC47102 = this.f13749;
        if (i2 >= i5) {
            return abstractC47102.mo9347(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC47102.mo9347(abstractC4710.mo9347(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo9348(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC4710 abstractC4710 = this.f13753;
        int i4 = this.f13748;
        if (i3 <= i4) {
            abstractC4710.mo9348(outputStream, i, i2);
            return;
        }
        AbstractC4710 abstractC47102 = this.f13749;
        if (i >= i4) {
            abstractC47102.mo9348(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC4710.mo9348(outputStream, i, i5);
        abstractC47102.mo9348(outputStream, 0, i2 - i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int mo9349() {
        return this.f13751;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String mo9350() {
        byte[] bArr;
        int i = this.f13752;
        if (i == 0) {
            bArr = AbstractC4715.f13783;
        } else {
            byte[] bArr2 = new byte[i];
            mo9346(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo9351() {
        return this.f13752 >= f13747[this.f13750];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo9352() {
        return this.f13750;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo9353(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC4710 abstractC4710 = this.f13753;
        int i5 = this.f13748;
        if (i4 <= i5) {
            return abstractC4710.mo9353(i, i2, i3);
        }
        AbstractC4710 abstractC47102 = this.f13749;
        if (i2 >= i5) {
            return abstractC47102.mo9353(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC47102.mo9353(abstractC4710.mo9353(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4710
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo9354() {
        int iMo9347 = this.f13753.mo9347(0, 0, this.f13748);
        AbstractC4710 abstractC4710 = this.f13749;
        return abstractC4710.mo9347(iMo9347, 0, abstractC4710.size()) == 0;
    }
}
