package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import bsh.C2632;
import io.ktor.util.C4210;
import java.util.Iterator;
import kotlin.C5172;
import kotlin.C5177;
import kotlin.C5178;
import kotlin.C5180;
import kotlin.collections.AbstractC4329;
import p054.InterfaceC6566;
import p087.C7107;
import p091.InterfaceC7190;

/* JADX INFO: renamed from: androidx.core.view.飘花落叶言子苏世哲兰楪, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public class C2268 implements Iterator, InterfaceC6566 {

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰世苏, reason: contains not printable characters */
    public int f6584;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲兰苏世, reason: contains not printable characters */
    public final Object f6585;

    /* JADX INFO: renamed from: 飘花落叶言子楪哲苏兰世, reason: contains not printable characters */
    public final /* synthetic */ int f6586;

    public C2268(InterfaceC7190 interfaceC7190) {
        this.f6586 = 7;
        this.f6585 = interfaceC7190;
        this.f6584 = interfaceC7190.mo12353();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f6586;
        Object obj = this.f6585;
        switch (i) {
            case 0:
                if (this.f6584 < ((ViewGroup) obj).getChildCount()) {
                }
                break;
            case 1:
                if (this.f6584 < ((byte[]) obj).length) {
                }
                break;
            case 2:
                if (this.f6584 < ((int[]) obj).length) {
                }
                break;
            case 3:
                if (this.f6584 < ((long[]) obj).length) {
                }
                break;
            case 4:
                if (this.f6584 < ((short[]) obj).length) {
                }
                break;
            case 5:
                if (this.f6584 < ((AbstractC4329) obj).size()) {
                }
                break;
            case 6:
                if (this.f6584 < ((Object[]) obj).length) {
                }
                break;
            case 7:
                if (this.f6584 > 0) {
                }
                break;
            default:
                if (this.f6584 > 0) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f6586;
        Object obj = this.f6585;
        switch (i) {
            case 0:
                int i2 = this.f6584;
                this.f6584 = i2 + 1;
                View childAt = ((ViewGroup) obj).getChildAt(i2);
                if (childAt != null) {
                    return childAt;
                }
                throw new IndexOutOfBoundsException();
            case 1:
                int i3 = this.f6584;
                byte[] bArr = (byte[]) obj;
                if (i3 < bArr.length) {
                    this.f6584 = i3 + 1;
                    return new C5177(bArr[i3]);
                }
                C4210.m8627(String.valueOf(i3));
                return null;
            case 2:
                int i4 = this.f6584;
                int[] iArr = (int[]) obj;
                if (i4 < iArr.length) {
                    this.f6584 = i4 + 1;
                    return new C5180(iArr[i4]);
                }
                C4210.m8627(String.valueOf(i4));
                return null;
            case 3:
                int i5 = this.f6584;
                long[] jArr = (long[]) obj;
                if (i5 < jArr.length) {
                    this.f6584 = i5 + 1;
                    return new C5178(jArr[i5]);
                }
                C4210.m8627(String.valueOf(i5));
                return null;
            case 4:
                int i6 = this.f6584;
                short[] sArr = (short[]) obj;
                if (i6 < sArr.length) {
                    this.f6584 = i6 + 1;
                    return new C5172(sArr[i6]);
                }
                C4210.m8627(String.valueOf(i6));
                return null;
            case 5:
                if (!hasNext()) {
                    C2632.m5291();
                    return null;
                }
                int i7 = this.f6584;
                this.f6584 = i7 + 1;
                return ((AbstractC4329) obj).get(i7);
            case 6:
                try {
                    int i8 = this.f6584;
                    this.f6584 = i8 + 1;
                    return ((Object[]) obj)[i8];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f6584--;
                    C4210.m8627(e.getMessage());
                    return null;
                }
            case 7:
                InterfaceC7190 interfaceC7190 = (InterfaceC7190) obj;
                int iMo12353 = interfaceC7190.mo12353();
                int i9 = this.f6584;
                this.f6584 = i9 - 1;
                return interfaceC7190.mo12356(iMo12353 - i9);
            default:
                C7107 c7107 = (C7107) obj;
                int i10 = c7107.f19074;
                int i11 = this.f6584;
                this.f6584 = i11 - 1;
                return c7107.f19072[i10 - i11];
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f6586) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.f6585;
                int i = this.f6584 - 1;
                this.f6584 = i;
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
        this.f6586 = 6;
        objArr.getClass();
        this.f6585 = objArr;
    }

    public /* synthetic */ C2268(Object obj, int i) {
        this.f6586 = i;
        this.f6585 = obj;
    }

    public C2268(C7107 c7107) {
        this.f6586 = 8;
        this.f6585 = c7107;
        this.f6584 = c7107.f19074;
    }
}
