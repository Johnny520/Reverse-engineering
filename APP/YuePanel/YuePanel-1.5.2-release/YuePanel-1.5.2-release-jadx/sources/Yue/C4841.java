package Yue;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: Yue.ۥ۠ۢ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4841<T> implements InterfaceC7326<T> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final InterfaceC7326<T> f1156;

    /* JADX INFO: renamed from: ۥ۟ */
    public final boolean f1157;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<T, Boolean> f10909;

    /* JADX INFO: renamed from: Yue.ۥ۠ۢ۠$ۥ */
    public static final class C0507 implements Iterator<T>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final Iterator<T> f10910;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public int f10911 = -1;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        @InterfaceC6489
        public T f10912;

        /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
        public final /* synthetic */ C4841<T> f10913;

        public C0507(C4841<T> c4841) {
            this.f10913 = c4841;
            this.f10910 = c4841.f1156.iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f10911 == -1) {
                m1749();
            }
            return this.f10911 == 1;
        }

        @Override // java.util.Iterator
        public T next() {
            if (this.f10911 == -1) {
                m1749();
            }
            if (this.f10911 == 0) {
                throw new NoSuchElementException();
            }
            T t = this.f10912;
            this.f10912 = null;
            this.f10911 = -1;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX INFO: renamed from: ۥ */
        public final void m1749() {
            while (this.f10910.hasNext()) {
                T next = this.f10910.next();
                if (((Boolean) this.f10913.f10909.invoke(next)).booleanValue() == this.f10913.f1157) {
                    this.f10912 = next;
                    this.f10911 = 1;
                    return;
                }
            }
            this.f10911 = 0;
        }

        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ۟ */
        public final Iterator<T> m1750() {
            return this.f10910;
        }

        @InterfaceC6489
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final T m14791() {
            return this.f10912;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final int m14792() {
            return this.f10911;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
        public final void m14793(@InterfaceC6489 T t) {
            this.f10912 = t;
        }

        /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
        public final void m14794(int i) {
            this.f10911 = i;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥۡۨۢ<? extends T> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: Yue.ۥۣ۠ۡ۟<? super T, java.lang.Boolean> */
    /* JADX WARN: Multi-variable type inference failed */
    public C4841(@InterfaceC6399 InterfaceC7326<? extends T> interfaceC7326, boolean z, @InterfaceC6399 InterfaceC5124<? super T, Boolean> interfaceC5124) {
        C5499.m17103(interfaceC7326, "sequence");
        C5499.m17103(interfaceC5124, "predicate");
        this.f1156 = interfaceC7326;
        this.f1157 = z;
        this.f10909 = interfaceC5124;
    }

    @Override // Yue.InterfaceC7326
    @InterfaceC6399
    public Iterator<T> iterator() {
        return new C0507(this);
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0005: CONSTRUCTOR 
  (r1v0 Yue.ۥۡۨۢ)
  (wrap:boolean:?: TERNARY null = ((wrap:int:0x0000: ARITH (r4v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? true : (r2v0 boolean))
  (r3v0 Yue.ۥۣ۠ۡ۟)
 A[MD:(Yue.ۥۡۨۢ<? extends T>, boolean, Yue.ۥۣ۠ۡ۟<? super T, java.lang.Boolean>):void (m)] (LINE:5) call: Yue.ۥ۠ۢ۠.<init>(Yue.ۥۡۨۢ, boolean, Yue.ۥۣ۠ۡ۟):void type: THIS */
    public /* synthetic */ C4841(InterfaceC7326 interfaceC7326, boolean z, InterfaceC5124 interfaceC5124, int i, C4335 c4335) {
        this(interfaceC7326, (i & 2) != 0 ? true : z, interfaceC5124);
    }
}
