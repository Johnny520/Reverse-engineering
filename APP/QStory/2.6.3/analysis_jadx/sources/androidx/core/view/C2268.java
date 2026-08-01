package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import bsh.C2633;
import io.ktor.util.C4211;
import java.util.Iterator;
import kotlin.C5173;
import kotlin.C5178;
import kotlin.C5179;
import kotlin.C5181;
import kotlin.collections.AbstractC4330;
import p054.InterfaceC6567;
import p087.C7108;
import p091.InterfaceC7191;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public class C2268 implements Iterator, InterfaceC6567 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6586;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6587;

    public C2268(InterfaceC7191 interfaceC7191) {
        this.f6587 = 7;
        this.f6586 = interfaceC7191;
        this.f6585 = interfaceC7191.mo12380();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6587;
        Object obj = this.f6586;
        switch (i) {
            case 0:
                if (this.f6585 < ((ViewGroup) obj).getChildCount()) {
                }
                break;
            case 1:
                if (this.f6585 < ((byte[]) obj).length) {
                }
                break;
            case 2:
                if (this.f6585 < ((int[]) obj).length) {
                }
                break;
            case 3:
                if (this.f6585 < ((long[]) obj).length) {
                }
                break;
            case 4:
                if (this.f6585 < ((short[]) obj).length) {
                }
                break;
            case 5:
                if (this.f6585 < ((AbstractC4330) obj).size()) {
                }
                break;
            case 6:
                if (this.f6585 < ((Object[]) obj).length) {
                }
                break;
            case 7:
                if (this.f6585 > 0) {
                }
                break;
            default:
                if (this.f6585 > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6587;
        Object obj = this.f6586;
        switch (i) {
            case 0:
                int i2 = this.f6585;
                this.f6585 = i2 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i3 = this.f6585;
                byte[] bArr = (byte[]) obj;
                if (i3 < bArr.length) {
                    this.f6585 = i3 + 1;
                    return new C5178(bArr[i3]);
                }
                C4211.m8617(String.valueOf(i3));
                return null;
            case 2:
                int i4 = this.f6585;
                int[] iArr = (int[]) obj;
                if (i4 < iArr.length) {
                    this.f6585 = i4 + 1;
                    return new C5181(iArr[i4]);
                }
                C4211.m8617(String.valueOf(i4));
                return null;
            case 3:
                int i5 = this.f6585;
                long[] jArr = (long[]) obj;
                if (i5 < jArr.length) {
                    this.f6585 = i5 + 1;
                    return new C5179(jArr[i5]);
                }
                C4211.m8617(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.f6585;
                short[] sArr = (short[]) obj;
                if (i6 < sArr.length) {
                    this.f6585 = i6 + 1;
                    return new C5173(sArr[i6]);
                }
                C4211.m8617(String.valueOf(i6));
                return null;
            case 5:
                if (!hasNext()) {
                    C2633.m5336();
                    return null;
                }
                int i7 = this.f6585;
                this.f6585 = i7 + 1;
                return ((AbstractC4330) obj).get(i7);
            case 6:
                try {
                    int i8 = this.f6585;
                    this.f6585 = i8 + 1;
                    return ((Object[]) obj)[i8];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f6585--;
                    C4211.m8617(e.getMessage());
                    return null;
                }
            case 7:
                InterfaceC7191 interfaceC7191 = (InterfaceC7191) obj;
                int iMo12380 = interfaceC7191.mo12380();
                int i9 = this.f6585;
                this.f6585 = i9 - 1;
                return interfaceC7191.mo12383(iMo12380 - i9);
            default:
                C7108 c7108 = (C7108) obj;
                int i10 = c7108.f19069;
                int i11 = this.f6585;
                this.f6585 = i11 - 1;
                return c7108.f19067[i10 - i11];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6587) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f6586;
                int i = this.f6585 - 1;
                this.f6585 = i;
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

    public C2268(Object[] objArr) {
        this.f6587 = 6;
        objArr.getClass();
        this.f6586 = objArr;
    }

    public /* synthetic */ C2268(Object obj, int i) {
        this.f6587 = i;
        this.f6586 = obj;
    }

    public C2268(C7108 c7108) {
        this.f6587 = 8;
        this.f6586 = c7108;
        this.f6585 = c7108.f19069;
    }
}
