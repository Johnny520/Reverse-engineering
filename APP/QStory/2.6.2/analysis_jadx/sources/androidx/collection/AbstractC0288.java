package androidx.collection;

import androidx.activity.AbstractC0053;
import io.ktor.util.C4210;
import kotlin.jvm.internal.AbstractC4394;
import p000.AbstractC6087;
import p048.C6518;
import p052.InterfaceC6557;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0288 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f1004;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object[] f1005;

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC0288) {
            AbstractC0288 abstractC0288 = (AbstractC0288) obj;
            int i = abstractC0288.f1004;
            int i2 = this.f1004;
            if (i == i2) {
                Object[] objArr = this.f1005;
                Object[] objArr2 = abstractC0288.f1005;
                C6518 c6518M11422 = AbstractC6087.m11422(0, i2);
                int i3 = c6518M11422.f17822;
                int i4 = c6518M11422.f17820;
                if (i3 > i4) {
                    return true;
                }
                while (AbstractC4394.m8917(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = this.f1005;
        int i = this.f1004;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        InterfaceC6557 interfaceC6557 = new InterfaceC6557() { // from class: androidx.collection.ObjectList$toString$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6557
            public final CharSequence invoke(Object obj) {
                return obj == this.this$0 ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f1005;
        int i = this.f1004;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) interfaceC6557.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m876(int i) {
        StringBuilder sbM148 = AbstractC0053.m148(i, "Index ", " must be in 0..");
        sbM148.append(this.f1004 - 1);
        throw new IndexOutOfBoundsException(sbM148.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m877() {
        return this.f1004 != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m878() {
        return this.f1004 == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m879(Object obj) {
        Object[] objArr = this.f1005;
        int i = 0;
        if (obj == null) {
            int i2 = this.f1004;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.f1004;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m880(int i) {
        if (i >= 0 && i < this.f1004) {
            return this.f1005[i];
        }
        m876(i);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m881() {
        if (!m878()) {
            return this.f1005[0];
        }
        C4210.m8627("ObjectList is empty.");
        return null;
    }
}
