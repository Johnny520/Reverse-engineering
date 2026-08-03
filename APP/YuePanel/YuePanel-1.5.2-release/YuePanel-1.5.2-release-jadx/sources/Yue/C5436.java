package Yue;

import java.util.ArrayList;

/* JADX INFO: renamed from: Yue.ۥ۠ۥۢۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5570
public final class C5436<E> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final Object f1508;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥ۠ۥۢۡ.ۥ(java.lang.Object):Yue.ۥ۠ۥۢۡ] */
    public /* synthetic */ C5436(Object obj) {
        this.f1508 = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (m)] call: Yue.ۥ۠ۥۢۡ.<init>(java.lang.Object):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ C5436 m2206(Object obj) {
        return new C5436(obj);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static <E> Object m2207(@InterfaceC6489 Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static /* synthetic */ Object m16921(Object obj, int i, C4335 c4335) {
        if ((i & 1) != 0) {
            obj = null;
        }
        return m2207(obj);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static boolean m16922(Object obj, Object obj2) {
        return (obj2 instanceof C5436) && C5499.m17094(obj, ((C5436) obj2).m16928());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final boolean m16923(Object obj, Object obj2) {
        return C5499.m17094(obj, obj2);
    }

    /* JADX DEBUG: Move duplicate insns, count: 1 to block B:8:0x0013 */
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final void m16924(Object obj, @InterfaceC6399 InterfaceC5124<? super E, C8107> interfaceC5124) {
        if (obj == null) {
            return;
        }
        if (!(obj instanceof ArrayList)) {
            interfaceC5124.invoke(obj);
            return;
        }
        ArrayList arrayList = (ArrayList) obj;
        int size = arrayList.size();
        while (true) {
            size--;
            if (-1 >= size) {
                return;
            } else {
                interfaceC5124.invoke((Object) arrayList.get(size));
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m16925(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Object m16926(Object obj, E e) {
        if (obj == null) {
            return m2207(e);
        }
        if (obj instanceof ArrayList) {
            ((ArrayList) obj).add(e);
            return m2207(obj);
        }
        ArrayList arrayList = new ArrayList(4);
        arrayList.add(obj);
        arrayList.add(e);
        return m2207(arrayList);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static String m16927(Object obj) {
        return "InlineList(holder=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m16922(this.f1508, obj);
    }

    public int hashCode() {
        return m16925(this.f1508);
    }

    public String toString() {
        return m16927(this.f1508);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ Object m16928() {
        return this.f1508;
    }
}
