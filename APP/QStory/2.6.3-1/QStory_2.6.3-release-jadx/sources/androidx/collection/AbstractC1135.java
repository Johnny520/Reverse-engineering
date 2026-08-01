package androidx.collection;

import androidx.activity.AbstractC0900;
import androidx.window.area.AbstractC3400;
import io.ktor.util.C5043;
import kotlin.jvm.internal.AbstractC5227;
import p064.C7348;
import p068.InterfaceC7387;

/* JADX INFO: renamed from: androidx.collection.飘花落叶言子苏楪世哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1135 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public int f1349;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public Object[] f1350;

    public final boolean equals(Object obj) {
        if (obj instanceof AbstractC1135) {
            AbstractC1135 abstractC1135 = (AbstractC1135) obj;
            int i = abstractC1135.f1349;
            int i2 = this.f1349;
            if (i == i2) {
                Object[] objArr = this.f1350;
                Object[] objArr2 = abstractC1135.f1350;
                C7348 c7348M5627 = AbstractC3400.m5627(0, i2);
                int i3 = c7348M5627.f18163;
                int i4 = c7348M5627.f18161;
                if (i3 > i4) {
                    return true;
                }
                while (AbstractC5227.m9466(objArr[i3], objArr2[i3])) {
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
        Object[] objArr = this.f1350;
        int i = this.f1349;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        InterfaceC7387 interfaceC7387 = new InterfaceC7387() { // from class: androidx.collection.ObjectList$toString$1
            {
                super(1);
            }

            @Override // p068.InterfaceC7387
            public final CharSequence invoke(Object obj) {
                return obj == this.this$0 ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        Object[] objArr = this.f1350;
        int i = this.f1349;
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
            sb.append((CharSequence) interfaceC7387.invoke(obj));
            i2++;
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final void m1437(int i) {
        StringBuilder sbM710 = AbstractC0900.m710(i, "Index ", " must be in 0..");
        sbM710.append(this.f1349 - 1);
        throw new IndexOutOfBoundsException(sbM710.toString());
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean m1438() {
        return this.f1349 != 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean m1439() {
        return this.f1349 == 0;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final int m1440(Object obj) {
        Object[] objArr = this.f1350;
        int i = 0;
        if (obj == null) {
            int i2 = this.f1349;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int i3 = this.f1349;
        while (i < i3) {
            if (obj.equals(objArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final Object m1441(int i) {
        if (i >= 0 && i < this.f1349) {
            return this.f1350[i];
        }
        m1437(i);
        throw null;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m1442() {
        if (!m1439()) {
            return this.f1350[0];
        }
        C5043.m9176("ObjectList is empty.");
        return null;
    }
}
