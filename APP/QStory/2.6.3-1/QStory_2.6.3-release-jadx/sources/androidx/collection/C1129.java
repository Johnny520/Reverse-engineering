package androidx.collection;

import android.content.res.ColorStateList;
import java.util.Arrays;
import kotlin.collections.AbstractC5179;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p203.AbstractC8601;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C1129 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public /* synthetic */ Object[] f1335;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public /* synthetic */ int f1336;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public /* synthetic */ int[] f1337;

    public C1129(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.f1337 = new int[i5];
        this.f1335 = new Object[i5];
    }

    public final String toString() {
        int i = this.f1336;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f1336;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f1337[i3]);
            sb.append(SignatureVisitor.INSTANCEOF);
            Object objM1417 = m1417(i3);
            if (objM1417 != this) {
                sb.append(objM1417);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m1417(int i) {
        Object[] objArr = this.f1335;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m1418(int i, Object obj) {
        int iM13683 = AbstractC8601.m13683(this.f1337, this.f1336, i);
        if (iM13683 >= 0) {
            this.f1335[iM13683] = obj;
            return;
        }
        int i2 = ~iM13683;
        int i3 = this.f1336;
        if (i2 < i3) {
            Object[] objArr = this.f1335;
            if (objArr[i2] == AbstractC1114.f1305) {
                this.f1337[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f1337.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            this.f1337 = Arrays.copyOf(this.f1337, i7);
            this.f1335 = Arrays.copyOf(this.f1335, i7);
        }
        int i8 = this.f1336;
        if (i8 - i2 != 0) {
            int[] iArr = this.f1337;
            int i9 = i2 + 1;
            AbstractC5179.m9395(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.f1335;
            AbstractC5179.m9394(i9, i2, objArr2, this.f1336, objArr2);
        }
        this.f1337[i2] = i;
        this.f1335[i2] = obj;
        this.f1336++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m1419(int i) {
        Object obj;
        int iM13683 = AbstractC8601.m13683(this.f1337, this.f1336, i);
        if (iM13683 < 0 || (obj = this.f1335[iM13683]) == AbstractC1114.f1305) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C1129 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C1129 c1129 = (C1129) objClone;
        c1129.f1337 = (int[]) this.f1337.clone();
        c1129.f1335 = (Object[]) this.f1335.clone();
        return c1129;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m1421(int i, ColorStateList colorStateList) {
        int i2 = this.f1336;
        if (i2 != 0 && i <= this.f1337[i2 - 1]) {
            m1418(i, colorStateList);
            return;
        }
        if (i2 >= this.f1337.length) {
            int i3 = (i2 + 1) * 4;
            int i4 = 4;
            while (true) {
                if (i4 >= 32) {
                    break;
                }
                int i5 = (1 << i4) - 12;
                if (i3 <= i5) {
                    i3 = i5;
                    break;
                }
                i4++;
            }
            int i6 = i3 / 4;
            this.f1337 = Arrays.copyOf(this.f1337, i6);
            this.f1335 = Arrays.copyOf(this.f1335, i6);
        }
        this.f1337[i2] = i;
        this.f1335[i2] = colorStateList;
        this.f1336 = i2 + 1;
    }
}
