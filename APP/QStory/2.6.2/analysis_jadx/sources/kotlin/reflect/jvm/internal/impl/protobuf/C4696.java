package kotlin.reflect.jvm.internal.impl.protobuf;

import bsh.C2632;
import com.google.protobuf.C3348;
import com.google.protobuf.C3411;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子世楪兰苏哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C4696 extends AbstractC4709 {

    /* JADX INFO: renamed from: 飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
    public static final int[] f13743;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世哲苏, reason: contains not printable characters */
    public final int f13744;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final AbstractC4709 f13745;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏世哲, reason: contains not printable characters */
    public final int f13746;

    /* JADX INFO: renamed from: 飘花落叶言子楪兰苏哲世, reason: contains not printable characters */
    public int f13747 = 0;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final int f13748;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final AbstractC4709 f13749;

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
        f13743 = new int[arrayList.size()];
        int i4 = 0;
        while (true) {
            int[] iArr = f13743;
            if (i4 >= iArr.length) {
                return;
            }
            iArr[i4] = ((Integer) arrayList.get(i4)).intValue();
            i4++;
        }
    }

    public C4696(AbstractC4709 abstractC4709, AbstractC4709 abstractC47092) {
        this.f13749 = abstractC4709;
        this.f13745 = abstractC47092;
        int size = abstractC4709.size();
        this.f13744 = size;
        this.f13748 = abstractC47092.size() + size;
        this.f13746 = Math.max(abstractC4709.mo9362(), abstractC47092.mo9362()) + 1;
    }

    public final boolean equals(Object obj) {
        int iMo9359;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC4709) {
            AbstractC4709 abstractC4709 = (AbstractC4709) obj;
            int size = abstractC4709.size();
            int i = this.f13748;
            if (i == size) {
                if (i == 0) {
                    return true;
                }
                if (this.f13747 == 0 || (iMo9359 = abstractC4709.mo9359()) == 0 || this.f13747 == iMo9359) {
                    C3411 c3411 = new C3411(this);
                    C4715 c4715M7526 = c3411.m7526();
                    C3411 c34112 = new C3411(abstractC4709);
                    C4715 c4715M75262 = c34112.m7526();
                    int i2 = 0;
                    int i3 = 0;
                    int i4 = 0;
                    while (true) {
                        int length = c4715M7526.f13780.length - i2;
                        int length2 = c4715M75262.f13780.length - i3;
                        int iMin = Math.min(length, length2);
                        if (!(i2 == 0 ? c4715M7526.m9418(c4715M75262, i3, iMin) : c4715M75262.m9418(c4715M7526, i2, iMin))) {
                            break;
                        }
                        i4 += iMin;
                        if (i4 >= i) {
                            if (i4 == i) {
                                return true;
                            }
                            C2632.m5296();
                            return false;
                        }
                        if (iMin == length) {
                            c4715M7526 = c3411.m7526();
                            i2 = 0;
                        } else {
                            i2 += iMin;
                        }
                        if (iMin == length2) {
                            c4715M75262 = c34112.m7526();
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
        int iMo9363 = this.f13747;
        if (iMo9363 == 0) {
            int i = this.f13748;
            iMo9363 = mo9363(i, 0, i);
            if (iMo9363 == 0) {
                iMo9363 = 1;
            }
            this.f13747 = iMo9363;
        }
        return iMo9363;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new C3348(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    public final int size() {
        return this.f13748;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void mo9356(byte[] bArr, int i, int i2, int i3) {
        int i4 = i + i3;
        AbstractC4709 abstractC4709 = this.f13749;
        int i5 = this.f13744;
        if (i4 <= i5) {
            abstractC4709.mo9356(bArr, i, i2, i3);
            return;
        }
        AbstractC4709 abstractC47092 = this.f13745;
        if (i >= i5) {
            abstractC47092.mo9356(bArr, i - i5, i2, i3);
            return;
        }
        int i6 = i5 - i;
        abstractC4709.mo9356(bArr, i, i2, i6);
        abstractC47092.mo9356(bArr, 0, i2 + i6, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏, reason: contains not printable characters */
    public final int mo9357(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC4709 abstractC4709 = this.f13749;
        int i5 = this.f13744;
        if (i4 <= i5) {
            return abstractC4709.mo9357(i, i2, i3);
        }
        AbstractC4709 abstractC47092 = this.f13745;
        if (i2 >= i5) {
            return abstractC47092.mo9357(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC47092.mo9357(abstractC4709.mo9357(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final void mo9358(OutputStream outputStream, int i, int i2) {
        int i3 = i + i2;
        AbstractC4709 abstractC4709 = this.f13749;
        int i4 = this.f13744;
        if (i3 <= i4) {
            abstractC4709.mo9358(outputStream, i, i2);
            return;
        }
        AbstractC4709 abstractC47092 = this.f13745;
        if (i >= i4) {
            abstractC47092.mo9358(outputStream, i - i4, i2);
            return;
        }
        int i5 = i4 - i;
        abstractC4709.mo9358(outputStream, i, i5);
        abstractC47092.mo9358(outputStream, 0, i2 - i5);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰, reason: contains not printable characters */
    public final int mo9359() {
        return this.f13747;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final String mo9360() {
        byte[] bArr;
        int i = this.f13748;
        if (i == 0) {
            bArr = AbstractC4714.f13779;
        } else {
            byte[] bArr2 = new byte[i];
            mo9356(bArr2, 0, 0, i);
            bArr = bArr2;
        }
        return new String(bArr, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean mo9361() {
        return this.f13748 >= f13743[this.f13746];
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final int mo9362() {
        return this.f13746;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲, reason: contains not printable characters */
    public final int mo9363(int i, int i2, int i3) {
        int i4 = i2 + i3;
        AbstractC4709 abstractC4709 = this.f13749;
        int i5 = this.f13744;
        if (i4 <= i5) {
            return abstractC4709.mo9363(i, i2, i3);
        }
        AbstractC4709 abstractC47092 = this.f13745;
        if (i2 >= i5) {
            return abstractC47092.mo9363(i, i2 - i5, i3);
        }
        int i6 = i5 - i2;
        return abstractC47092.mo9363(abstractC4709.mo9363(i, i2, i6), 0, i3 - i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC4709
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final boolean mo9364() {
        int iMo9357 = this.f13749.mo9357(0, 0, this.f13744);
        AbstractC4709 abstractC4709 = this.f13745;
        return abstractC4709.mo9357(iMo9357, 0, abstractC4709.size()) == 0;
    }
}
