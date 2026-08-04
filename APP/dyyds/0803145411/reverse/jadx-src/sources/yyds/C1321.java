package yyds;

import java.util.ArrayList;
import sun.misc.Unsafe;

/* JADX INFO: renamed from: yyds.ᛶᛴᲀᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1321 implements InterfaceC2067 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final /* synthetic */ long f6071;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public static final /* synthetic */ long f6072;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static final /* synthetic */ long f6073;
    private volatile /* synthetic */ Object _exceptionsHolder$volatile;
    private volatile /* synthetic */ int _isCompleting$volatile = 0;
    private volatile /* synthetic */ Object _rootCause$volatile;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final C1518 f6074;

    static {
        Unsafe unsafe = AbstractC2112.f10448;
        f6071 = unsafe.objectFieldOffset(C1321.class.getDeclaredField("_isCompleting$volatile"));
        f6072 = unsafe.objectFieldOffset(C1321.class.getDeclaredField("_rootCause$volatile"));
        f6073 = unsafe.objectFieldOffset(C1321.class.getDeclaredField("_exceptionsHolder$volatile"));
    }

    public C1321(C1518 c1518, Throwable th) {
        this.f6074 = c1518;
        this._rootCause$volatile = th;
    }

    public final String toString() {
        return "Finishing[cancelling=" + m2611() + ", completing=" + m2615() + ", rootCause=" + m2614() + ", exceptions=" + AbstractC2112.f10448.getObjectVolatile(this, f6073) + ", list=" + this.f6074 + ']';
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final boolean m2611() {
        return m2614() != null;
    }

    @Override // yyds.InterfaceC2067
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final boolean mo2048() {
        return m2614() == null;
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m2612(Throwable th) {
        Throwable thM2614 = m2614();
        if (thM2614 == null) {
            AbstractC2112.f10448.putObjectVolatile(this, f6072, th);
            return;
        }
        if (th == thM2614) {
            return;
        }
        Unsafe unsafe = AbstractC2112.f10448;
        long j = f6073;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            unsafe.putObjectVolatile(this, j, th);
            return;
        }
        if (!(objectVolatile instanceof Throwable)) {
            if (objectVolatile instanceof ArrayList) {
                ((ArrayList) objectVolatile).add(th);
                return;
            } else {
                C0188.m791(objectVolatile, "State is ");
                return;
            }
        }
        if (th == objectVolatile) {
            return;
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(objectVolatile);
        arrayList.add(th);
        unsafe.putObjectVolatile(this, j, arrayList);
    }

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final ArrayList m2613(Throwable th) {
        ArrayList arrayList;
        Unsafe unsafe = AbstractC2112.f10448;
        long j = f6073;
        Object objectVolatile = unsafe.getObjectVolatile(this, j);
        if (objectVolatile == null) {
            arrayList = new ArrayList(4);
        } else if (objectVolatile instanceof Throwable) {
            ArrayList arrayList2 = new ArrayList(4);
            arrayList2.add(objectVolatile);
            arrayList = arrayList2;
        } else {
            if (!(objectVolatile instanceof ArrayList)) {
                C0188.m791(objectVolatile, "State is ");
                return null;
            }
            arrayList = (ArrayList) objectVolatile;
        }
        Throwable thM2614 = m2614();
        if (thM2614 != null) {
            arrayList.add(0, thM2614);
        }
        if (th != null && !th.equals(thM2614)) {
            arrayList.add(th);
        }
        unsafe.putObjectVolatile(this, j, AbstractC0395.f2033);
        return arrayList;
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final Throwable m2614() {
        return (Throwable) AbstractC2112.f10448.getObjectVolatile(this, f6072);
    }

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public final boolean m2615() {
        return AbstractC2112.f10448.getIntVolatile(this, f6071) != 0;
    }

    @Override // yyds.InterfaceC2067
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final C1518 mo2049() {
        return this.f6074;
    }
}
