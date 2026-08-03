package p000;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: x */
/* JADX INFO: loaded from: classes.dex */
public class C2694x implements Iterator, InterfaceC0545Mm {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f9267a;

    /* JADX INFO: renamed from: b */
    public int f9268b;

    /* JADX INFO: renamed from: c */
    public final Object f9269c;

    public /* synthetic */ C2694x(int r1, Object r2) {
        this.f9267a = r1;
        this.f9269c = r2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch(this.f9267a) {
            case 0: goto L37;
            case 1: goto L32;
            case 2: goto L30;
            case 3: goto L25;
            case 4: goto L20;
            case 5: goto L15;
            case 6: goto L10;
            default: goto L5;
        };
    L5:
        if (this.f9268b >= ((ViewGroup) this.f9269c).getChildCount()) goto L7;
        return true;
    L7:
        return false;
    L10:
        if (this.f9268b >= ((short[]) this.f9269c).length) goto L12;
        return true;
    L12:
        return false;
    L15:
        if (this.f9268b >= ((long[]) this.f9269c).length) goto L17;
        return true;
    L17:
        return false;
    L20:
        if (this.f9268b >= ((int[]) this.f9269c).length) goto L22;
        return true;
    L22:
        return false;
    L25:
        if (this.f9268b >= ((byte[]) this.f9269c).length) goto L27;
        return true;
    L27:
        return false;
    L30:
        return ((Iterator) this.f9269c).hasNext();
    L32:
        if (this.f9268b >= ((Object[]) this.f9269c).length) goto L34;
        return true;
    L34:
        return false;
    L37:
        if (this.f9268b >= ((AbstractC0000A) this.f9269c).mo0a()) goto L39;
        return true;
    L39:
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch(this.f9267a) {
            case 0: goto L45;
            case 1: goto L50;
            case 2: goto L33;
            case 3: goto L27;
            case 4: goto L21;
            case 5: goto L15;
            case 6: goto L9;
            default: goto L4;
        };
    L4:
        ViewGroup r0 = (ViewGroup) this.f9269c;
        int r1 = this.f9268b;
        this.f9268b = r1 + 1;
        View r02 = r0.getChildAt(r1);
        if (r02 == null) goto L8;
        return r02;
    L8:
        throw new IndexOutOfBoundsException();
    L9:
        int r03 = this.f9268b;
        short[] r12 = (short[]) this.f9269c;
        if (r03 >= r12.length) goto L14;
        this.f9268b = r03 + 1;
        return new C2355pC(r12[r03]);
    L14:
        throw new NoSuchElementException(String.valueOf(this.f9268b));
    L15:
        int r04 = this.f9268b;
        long[] r13 = (long[]) this.f9269c;
        if (r04 >= r13.length) goto L20;
        this.f9268b = r04 + 1;
        return new C2135kC(r13[r04]);
    L20:
        throw new NoSuchElementException(String.valueOf(this.f9268b));
    L21:
        int r05 = this.f9268b;
        int[] r14 = (int[]) this.f9269c;
        if (r05 >= r14.length) goto L26;
        this.f9268b = r05 + 1;
        return new C1402fC(r14[r05]);
    L26:
        throw new NoSuchElementException(String.valueOf(this.f9268b));
    L27:
        int r06 = this.f9268b;
        byte[] r15 = (byte[]) this.f9269c;
        if (r06 >= r15.length) goto L32;
        this.f9268b = r06 + 1;
        return new C1130aC(r15[r06]);
    L32:
        throw new NoSuchElementException(String.valueOf(this.f9268b));
    L33:
        int r16 = this.f9268b;
        this.f9268b = r16 + 1;
        if (r16 >= 0) goto L36;
        AbstractC2496sa.m4978c0();
        throw null;
    L36:
        return new C1549il(r16, ((Iterator) this.f9269c).next());
    L50:
        Object[] r07 = (Object[]) this.f9269c;     // Catch: ArrayIndexOutOfBoundsException -> L41
        int r17 = this.f9268b;     // Catch: ArrayIndexOutOfBoundsException -> L41
        this.f9268b = r17 + 1;     // Catch: ArrayIndexOutOfBoundsException -> L41
        return r07[r17];
    L41:
        e = move-exception;
        this.f9268b--;
        throw new NoSuchElementException(e.getMessage());
    L45:
        if (hasNext() == false) goto L49;
        AbstractC0000A r08 = (AbstractC0000A) this.f9269c;
        int r18 = this.f9268b;
        this.f9268b = r18 + 1;
        return r08.get(r18);
    L49:
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch(this.f9267a) {
            case 0: goto L19;
            case 1: goto L17;
            case 2: goto L15;
            case 3: goto L13;
            case 4: goto L11;
            case 5: goto L9;
            case 6: goto L7;
            default: goto L4;
        };
    L4:
        ViewGroup r0 = (ViewGroup) this.f9269c;
        int r1 = this.f9268b - 1;
        this.f9268b = r1;
        r0.removeViewAt(r1);
        return;
    L7:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L9:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L11:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L13:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L15:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L17:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    L19:
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
