package kotlin.reflect.jvm.internal.impl.protobuf;

import androidx.activity.AbstractC0900;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import top.suzhelan.qstory.hook.item.C6755;

/* JADX INFO: renamed from: kotlin.reflect.jvm.internal.impl.protobuf.飘花落叶言子楪兰哲世苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C5548 extends AbstractC5542 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public final byte[] f14129;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public int f14130 = 0;

    public C5548(byte[] bArr) {
        this.f14129 = bArr;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC5542) || size() != ((AbstractC5542) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C5548) {
            return m9967((C5548) obj, 0, size());
        }
        if (obj instanceof C5529) {
            return obj.equals(this);
        }
        String strValueOf = String.valueOf(obj.getClass());
        C6755.m11869(AbstractC0900.m711(new StringBuilder(strValueOf.length() + 49), "Has a new type of ByteString been created? Found ", strValueOf));
        return false;
    }

    public final int hashCode() {
        int iMo9912 = this.f14130;
        if (iMo9912 == 0) {
            int size = size();
            iMo9912 = mo9912(size, 0, size);
            if (iMo9912 == 0) {
                iMo9912 = 1;
            }
            this.f14130 = iMo9912;
        }
        return iMo9912;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return new C5551(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    public int size() {
        return this.f14129.length;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲 */
    public void mo9905(byte[] bArr, int i, int i2, int i3) {
        System.arraycopy(this.f14129, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪兰世苏哲, reason: contains not printable characters */
    public final boolean m9967(C5548 c5548, int i, int i2) {
        byte[] bArr = c5548.f14129;
        int length = bArr.length;
        byte[] bArr2 = this.f14129;
        if (i2 > length) {
            int length2 = bArr2.length;
            StringBuilder sb = new StringBuilder(40);
            sb.append("Length too large: ");
            sb.append(i2);
            sb.append(length2);
            throw new IllegalArgumentException(sb.toString());
        }
        if (i + i2 <= bArr.length) {
            int i3 = 0;
            while (i3 < i2) {
                if (bArr2[i3] != bArr[i]) {
                    return false;
                }
                i3++;
                i++;
            }
            return true;
        }
        int length3 = bArr.length;
        StringBuilder sb2 = new StringBuilder(59);
        sb2.append("Ran off end of other: ");
        sb2.append(i);
        sb2.append(", ");
        sb2.append(i2);
        sb2.append(", ");
        sb2.append(length3);
        throw new IllegalArgumentException(sb2.toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x001c, code lost:
    
        r8 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0049, code lost:
    
        if (r6[r8] > (-65)) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0092, code lost:
    
        if (r6[r7] > (-65)) goto L59;
     */
    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲世兰苏 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int mo9906(int i, int i2, int i3) {
        byte b;
        int i4;
        int i5;
        int i6 = i3 + i2;
        byte[] bArr = this.f14129;
        if (i != 0) {
            if (i2 >= i6) {
                return i;
            }
            byte b2 = (byte) i;
            if (b2 < -32) {
                if (b2 >= -62) {
                    i5 = i2 + 1;
                }
                return -1;
            }
            if (b2 < -16) {
                byte b3 = (byte) (~(i >> 8));
                if (b3 == 0) {
                    int i7 = i2 + 1;
                    byte b4 = bArr[i2];
                    if (i7 >= i6) {
                        return AbstractC5537.m9916(b2, b4);
                    }
                    i2 = i7;
                    b3 = b4;
                }
                if (b3 <= -65 && ((b2 != -32 || b3 >= -96) && (b2 != -19 || b3 < -96))) {
                    i5 = i2 + 1;
                }
            } else {
                byte b5 = (byte) (~(i >> 8));
                if (b5 == 0) {
                    i4 = i2 + 1;
                    b5 = bArr[i2];
                    if (i4 >= i6) {
                        return AbstractC5537.m9916(b2, b5);
                    }
                    b = 0;
                } else {
                    b = (byte) (i >> 16);
                    i4 = i2;
                }
                if (b == 0) {
                    int i8 = i4 + 1;
                    byte b6 = bArr[i4];
                    if (i8 >= i6) {
                        if (b2 > -12 || b5 > -65 || b6 > -65) {
                            return -1;
                        }
                        return ((b5 << 8) ^ b2) ^ (b6 << 16);
                    }
                    b = b6;
                    i4 = i8;
                }
                if (b5 <= -65) {
                    if ((((b5 + 112) + (b2 << 28)) >> 30) == 0 && b <= -65) {
                        i2 = i4 + 1;
                    }
                }
            }
            return -1;
        }
        return AbstractC5537.m9914(i2, bArr, i6);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世 */
    public final void mo9907(OutputStream outputStream, int i, int i2) throws IOException {
        outputStream.write(this.f14129, i, i2);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏世兰 */
    public final int mo9908() {
        return this.f14130;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世 */
    public final String mo9909() {
        byte[] bArr = this.f14129;
        return new String(bArr, 0, bArr.length, "UTF-8");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲 */
    public final boolean mo9910() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰 */
    public final int mo9911() {
        return 0;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏兰世哲 */
    public final int mo9912(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f14129[i4];
        }
        return i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC5542
    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰 */
    public final boolean mo9913() {
        byte[] bArr = this.f14129;
        return AbstractC5537.m9914(0, bArr, bArr.length) == 0;
    }
}
