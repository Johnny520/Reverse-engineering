package androidx.collection;

import android.content.res.ColorStateList;
import java.util.Arrays;
import kotlin.collections.AbstractC4347;
import net.bytebuddy.jar.asm.signature.SignatureVisitor;
import p187.AbstractC7772;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏世兰楪哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0282 implements Cloneable {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public /* synthetic */ Object[] f990;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public /* synthetic */ int f991;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public /* synthetic */ int[] f992;

    public C0282(int i) {
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
        this.f992 = new int[i5];
        this.f990 = new Object[i5];
    }

    public final String toString() {
        int i = this.f991;
        if (i <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(i * 28);
        sb.append('{');
        int i2 = this.f991;
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            sb.append(this.f992[i3]);
            sb.append(SignatureVisitor.INSTANCEOF);
            Object objM857 = m857(i3);
            if (objM857 != this) {
                sb.append(objM857);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final Object m857(int i) {
        Object[] objArr = this.f990;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final void m858(int i, Object obj) {
        int iM13124 = AbstractC7772.m13124(this.f992, this.f991, i);
        if (iM13124 >= 0) {
            this.f990[iM13124] = obj;
            return;
        }
        int i2 = ~iM13124;
        int i3 = this.f991;
        if (i2 < i3) {
            Object[] objArr = this.f990;
            if (objArr[i2] == AbstractC0267.f960) {
                this.f992[i2] = i;
                objArr[i2] = obj;
                return;
            }
        }
        if (i3 >= this.f992.length) {
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
            this.f992 = Arrays.copyOf(this.f992, i7);
            this.f990 = Arrays.copyOf(this.f990, i7);
        }
        int i8 = this.f991;
        if (i8 - i2 != 0) {
            int[] iArr = this.f992;
            int i9 = i2 + 1;
            AbstractC4347.m8836(i9, i2, i8, iArr, iArr);
            Object[] objArr2 = this.f990;
            AbstractC4347.m8835(i9, i2, objArr2, this.f991, objArr2);
        }
        this.f992[i2] = i;
        this.f990[i2] = obj;
        this.f991++;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m859(int i) {
        Object obj;
        int iM13124 = AbstractC7772.m13124(this.f992, this.f991, i);
        if (iM13124 < 0 || (obj = this.f990[iM13124]) == AbstractC0267.f960) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters and merged with bridge method [inline-methods] */
    public final C0282 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        objClone.getClass();
        C0282 c0282 = (C0282) objClone;
        c0282.f992 = (int[]) this.f992.clone();
        c0282.f990 = (Object[]) this.f990.clone();
        return c0282;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final void m861(int i, ColorStateList colorStateList) {
        int i2 = this.f991;
        if (i2 != 0 && i <= this.f992[i2 - 1]) {
            m858(i, colorStateList);
            return;
        }
        if (i2 >= this.f992.length) {
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
            this.f992 = Arrays.copyOf(this.f992, i6);
            this.f990 = Arrays.copyOf(this.f990, i6);
        }
        this.f992[i2] = i;
        this.f990[i2] = colorStateList;
        this.f991 = i2 + 1;
    }
}
