package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import bsh.C3466;
import io.ktor.util.C5043;
import java.util.Iterator;
import kotlin.C6005;
import kotlin.C6010;
import kotlin.C6011;
import kotlin.C6013;
import kotlin.collections.AbstractC5162;
import p070.InterfaceC7396;
import p103.C7937;
import p107.InterfaceC8020;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C3101 implements Iterator, InterfaceC7396 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6930;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6931;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6932;

    public C3101(InterfaceC8020 interfaceC8020) {
        this.f6932 = 7;
        this.f6931 = interfaceC8020;
        this.f6930 = interfaceC8020.mo12939();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6932;
        Object obj = this.f6931;
        switch (i) {
            case 0:
                if (this.f6930 < ((ViewGroup) obj).getChildCount()) {
                }
                break;
            case 1:
                if (this.f6930 < ((byte[]) obj).length) {
                }
                break;
            case 2:
                if (this.f6930 < ((int[]) obj).length) {
                }
                break;
            case 3:
                if (this.f6930 < ((long[]) obj).length) {
                }
                break;
            case 4:
                if (this.f6930 < ((short[]) obj).length) {
                }
                break;
            case 5:
                if (this.f6930 < ((AbstractC5162) obj).size()) {
                }
                break;
            case 6:
                if (this.f6930 < ((Object[]) obj).length) {
                }
                break;
            case 7:
                if (this.f6930 > 0) {
                }
                break;
            default:
                if (this.f6930 > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6932;
        Object obj = this.f6931;
        switch (i) {
            case 0:
                int i2 = this.f6930;
                this.f6930 = i2 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i3 = this.f6930;
                byte[] bArr = (byte[]) obj;
                if (i3 < bArr.length) {
                    this.f6930 = i3 + 1;
                    return new C6010(bArr[i3]);
                }
                C5043.m9176(String.valueOf(i3));
                return null;
            case 2:
                int i4 = this.f6930;
                int[] iArr = (int[]) obj;
                if (i4 < iArr.length) {
                    this.f6930 = i4 + 1;
                    return new C6013(iArr[i4]);
                }
                C5043.m9176(String.valueOf(i4));
                return null;
            case 3:
                int i5 = this.f6930;
                long[] jArr = (long[]) obj;
                if (i5 < jArr.length) {
                    this.f6930 = i5 + 1;
                    return new C6011(jArr[i5]);
                }
                C5043.m9176(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.f6930;
                short[] sArr = (short[]) obj;
                if (i6 < sArr.length) {
                    this.f6930 = i6 + 1;
                    return new C6005(sArr[i6]);
                }
                C5043.m9176(String.valueOf(i6));
                return null;
            case 5:
                if (!hasNext()) {
                    C3466.m5896();
                    return null;
                }
                int i7 = this.f6930;
                this.f6930 = i7 + 1;
                return ((AbstractC5162) obj).get(i7);
            case 6:
                try {
                    int i8 = this.f6930;
                    this.f6930 = i8 + 1;
                    return ((Object[]) obj)[i8];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f6930--;
                    C5043.m9176(e.getMessage());
                    return null;
                }
            case 7:
                InterfaceC8020 interfaceC8020 = (InterfaceC8020) obj;
                int iMo12939 = interfaceC8020.mo12939();
                int i9 = this.f6930;
                this.f6930 = i9 - 1;
                return interfaceC8020.mo12942(iMo12939 - i9);
            default:
                C7937 c7937 = (C7937) obj;
                int i10 = c7937.f19414;
                int i11 = this.f6930;
                this.f6930 = i11 - 1;
                return c7937.f19412[i10 - i11];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6932) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f6931;
                int i = this.f6930 - 1;
                this.f6930 = i;
                viewGroup.removeViewAt(i);
                return;
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 2:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 3:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 4:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 5:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 6:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 7:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C3101(Object[] objArr) {
        this.f6932 = 6;
        objArr.getClass();
        this.f6931 = objArr;
    }

    public /* synthetic */ C3101(Object obj, int i) {
        this.f6932 = i;
        this.f6931 = obj;
    }

    public C3101(C7937 c7937) {
        this.f6932 = 8;
        this.f6931 = c7937;
        this.f6930 = c7937.f19414;
    }
}
