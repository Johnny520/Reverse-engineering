package p000;

import java.util.Iterator;

/* JADX INFO: renamed from: t2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public class C0717t2 implements Iterator, q41 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f10502h;

    /* JADX INFO: renamed from: i */
    public int f10503i;

    /* JADX INFO: renamed from: j */
    public final Object f10504j;

    public C0717t2(wf0 wf0Var) {
        this.f10502h = 2;
        this.f10504j = wf0Var;
        this.f10503i = wf0Var.f515c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.f10502h;
        Object obj = this.f10504j;
        switch (i) {
            case 0:
                if (this.f10503i < ((AbstractC0832w2) obj).mo529a()) {
                }
                break;
            case 1:
                if (this.f10503i < ((Object[]) obj).length) {
                }
                break;
            case 2:
                if (this.f10503i > 0) {
                }
                break;
            case 3:
                if (this.f10503i < ((byte[]) obj).length) {
                }
                break;
            case 4:
                if (this.f10503i < ((int[]) obj).length) {
                }
                break;
            case 5:
                if (this.f10503i < ((long[]) obj).length) {
                }
                break;
            default:
                if (this.f10503i < ((short[]) obj).length) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f10502h;
        Object obj = this.f10504j;
        switch (i) {
            case 0:
                if (!hasNext()) {
                    um2.m5513b();
                } else {
                    int i2 = this.f10503i;
                    this.f10503i = i2 + 1;
                }
                break;
            case 1:
                try {
                    int i3 = this.f10503i;
                    this.f10503i = i3 + 1;
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f10503i--;
                    um2.m5519i(e.getMessage());
                    return null;
                }
                break;
            case 2:
                wf0 wf0Var = (wf0) obj;
                int i4 = wf0Var.f515c;
                int i5 = this.f10503i;
                this.f10503i = i5 - 1;
                break;
            case 3:
                int i6 = this.f10503i;
                byte[] bArr = (byte[]) obj;
                if (i6 >= bArr.length) {
                    um2.m5519i(String.valueOf(i6));
                } else {
                    this.f10503i = i6 + 1;
                }
                break;
            case 4:
                int i7 = this.f10503i;
                int[] iArr = (int[]) obj;
                if (i7 >= iArr.length) {
                    um2.m5519i(String.valueOf(i7));
                } else {
                    this.f10503i = i7 + 1;
                }
                break;
            case 5:
                int i8 = this.f10503i;
                long[] jArr = (long[]) obj;
                if (i8 >= jArr.length) {
                    um2.m5519i(String.valueOf(i8));
                } else {
                    this.f10503i = i8 + 1;
                }
                break;
            default:
                int i9 = this.f10503i;
                short[] sArr = (short[]) obj;
                if (i9 >= sArr.length) {
                    um2.m5519i(String.valueOf(i9));
                } else {
                    this.f10503i = i9 + 1;
                }
                break;
        }
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f10502h) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
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
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public C0717t2(Object[] objArr) {
        this.f10502h = 1;
        objArr.getClass();
        this.f10504j = objArr;
    }

    public /* synthetic */ C0717t2(int i, Object obj) {
        this.f10502h = i;
        this.f10504j = obj;
    }
}
