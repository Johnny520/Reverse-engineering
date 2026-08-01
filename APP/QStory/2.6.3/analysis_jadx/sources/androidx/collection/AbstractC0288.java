package androidx.collection;

import androidx.activity.AbstractC0053;
import androidx.window.area.AbstractC2567;
import io.ktor.util.C4211;
import kotlin.jvm.internal.AbstractC4395;
import p048.C6519;
import p052.InterfaceC6558;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
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
                C6519 c6519M5067 = AbstractC2567.m5067(0, i2);
                int i3 = c6519M5067.f17818;
                int i4 = c6519M5067.f17816;
                if (i3 > i4) {
                    return true;
                }
                while (AbstractC4395.m8907(objArr[i3], objArr2[i3])) {
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
        InterfaceC6558 interfaceC6558 = new InterfaceC6558() { // from class: androidx.collection.ObjectList$toString$1
            {
                super(1);
            }

            @Override // p052.InterfaceC6558
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
            sb.append((CharSequence) interfaceC6558.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m877(int i) {
        StringBuilder sbM150 = AbstractC0053.m150(i, "Index ", " must be in 0..");
        sbM150.append(this.f1004 - 1);
        throw new IndexOutOfBoundsException(sbM150.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m878() {
        return this.f1004 != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m879() {
        return this.f1004 == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m880(Object obj) {
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
    public final Object m881(int i) {
        if (i >= 0 && i < this.f1004) {
            return this.f1005[i];
        }
        m877(i);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m882() {
        if (!m879()) {
            return this.f1005[0];
        }
        C4211.m8617("ObjectList is empty.");
        return null;
    }
}
