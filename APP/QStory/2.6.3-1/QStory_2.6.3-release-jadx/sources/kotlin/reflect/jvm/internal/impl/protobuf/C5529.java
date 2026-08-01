package kotlin.reflect.jvm.internal.impl.protobuf;

import bsh.C3466;
import com.google.protobuf.C4181;
import com.google.protobuf.C4244;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C5529 extends AbstractC5542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final int[] f14092;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f14093;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC5542 f14094;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f14095;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f14096 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f14097;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC5542 f14098;

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
        f14092 = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f14092;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C5529(AbstractC5542 abstractC5542, AbstractC5542 abstractC55422) {
        this.f14098 = abstractC5542;
        this.f14094 = abstractC55422;
        int size = abstractC5542.size();
        this.f14093 = size;
        this.f14097 = abstractC55422.size() + size;
        this.f14095 = Math.max(abstractC5542.mo9911(), abstractC55422.mo9911()) + 1;
    }

    public final boolean equals(Object obj) {
        int iMo9908;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC5542) {
            AbstractC5542 abstractC5542 = (AbstractC5542) obj;
            int size = abstractC5542.size();
            int i = this.f14097;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f14096 == 0 || (iMo9908 = abstractC5542.mo9908()) == 0 || this.f14096 == iMo9908) {
                    C4244 c4244 = new C4244(this);
                    C5548 c5548M8072 = c4244.m8072();
                    C4244 c42442 = new C4244(abstractC5542);
                    C5548 c5548M80722 = c42442.m8072();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = c5548M8072.f14129.length - i2;
                        int length2 = c5548M80722.f14129.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? c5548M8072.m9967(c5548M80722, i3, iMin) : c5548M80722.m9967(c5548M8072, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            C3466.m5901();
                            return false;
                        }
                        if (iMin == length) {
                            c5548M8072 = c4244.m8072();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            c5548M80722 = c42442.m8072();
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
        int iMo9912 = this.f14096;
        if (iMo9912 == 0) {
            int i = this.f14097;
            iMo9912 = mo9912(i, 0, i);
            if (iMo9912 == 0) {
                iMo9912 = 1;
            }
            this.f14096 = iMo9912;
        }
        return iMo9912;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C4181(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    public final int size() {
        return this.f14097;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo9905(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        AbstractC5542 abstractC5542 = this.f14098;
        int i5 = this.f14093;
        if (i4 <= i5) {
            abstractC5542.mo9905(bArr, i, i2, i3);
            return;
        }
        AbstractC5542 abstractC55422 = this.f14094;
        if (i >= i5) {
            abstractC55422.mo9905(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC5542.mo9905(bArr, i, i2, i6);
        abstractC55422.mo9905(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int mo9906(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC5542 abstractC5542 = this.f14098;
        int i5 = this.f14093;
        if (i4 <= i5) {
            return abstractC5542.mo9906(i, i2, i3);
        }
        AbstractC5542 abstractC55422 = this.f14094;
        if (i2 >= i5) {
            return abstractC55422.mo9906(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC55422.mo9906(abstractC5542.mo9906(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo9907(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC5542 abstractC5542 = this.f14098;
        int i4 = this.f14093;
        if (i3 <= i4) {
            abstractC5542.mo9907(outputStream, i, i2);
            return;
        }
        AbstractC5542 abstractC55422 = this.f14094;
        if (i >= i4) {
            abstractC55422.mo9907(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC5542.mo9907(outputStream, i, i5);
        abstractC55422.mo9907(outputStream, 0, i2 - i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int mo9908() {
        return this.f14096;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String mo9909() {
        byte[] bArr;
        int i = this.f14097;
        if (i == 0) {
            bArr = AbstractC5547.f14128;
        } else {
            byte[] bArr2 = new byte[i];
            mo9905(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo9910() {
        return this.f14097 >= f14092[this.f14095];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo9911() {
        return this.f14095;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo9912(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC5542 abstractC5542 = this.f14098;
        int i5 = this.f14093;
        if (i4 <= i5) {
            return abstractC5542.mo9912(i, i2, i3);
        }
        AbstractC5542 abstractC55422 = this.f14094;
        if (i2 >= i5) {
            return abstractC55422.mo9912(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC55422.mo9912(abstractC5542.mo9912(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo9913() {
        int iMo9906 = this.f14098.mo9906(0, 0, this.f14093);
        AbstractC5542 abstractC5542 = this.f14094;
        return abstractC5542.mo9906(iMo9906, 0, abstractC5542.size()) == 0;
    }
}
