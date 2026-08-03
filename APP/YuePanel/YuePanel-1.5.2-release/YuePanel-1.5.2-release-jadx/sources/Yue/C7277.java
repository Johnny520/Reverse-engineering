package Yue;

import Yue.AbstractC7276;

/* JADX INFO: renamed from: Yue.ۥۡۧۨ۠, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC5570
public final class C7277<S extends AbstractC7276<S>> {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6489
    public final Object f2780;

    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [Yue.ۥۡۧۨ۠.ۥ(java.lang.Object):Yue.ۥۡۧۨ۠] */
    public /* synthetic */ C7277(Object obj) {
        this.f2780 = obj;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0002: CONSTRUCTOR (r1v0 java.lang.Object) A[MD:(java.lang.Object):void (m)] call: Yue.ۥۡۧۨ۠.<init>(java.lang.Object):void type: CONSTRUCTOR */
    /* JADX INFO: renamed from: ۥ */
    public static final /* synthetic */ C7277 m3541(Object obj) {
        return new C7277(obj);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static <S extends AbstractC7276<S>> Object m3542(@InterfaceC6489 Object obj) {
        return obj;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static boolean m22736(Object obj, Object obj2) {
        return (obj2 instanceof C7277) && C5499.m17094(obj, ((C7277) obj2).m22743());
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final boolean m22737(Object obj, Object obj2) {
        return C5499.m17094(obj, obj2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m22738() {
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final S m22739(Object obj) {
        if (obj == C4077.f652) {
            throw new IllegalStateException("Does not contain segment".toString());
        }
        if (obj != null) {
            return (S) obj;
        }
        throw new NullPointerException("null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static int m22740(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final boolean m22741(Object obj) {
        return obj == C4077.f652;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static String m22742(Object obj) {
        return "SegmentOrClosed(value=" + obj + ')';
    }

    public boolean equals(Object obj) {
        return m22736(this.f2780, obj);
    }

    public int hashCode() {
        return m22740(this.f2780);
    }

    public String toString() {
        return m22742(this.f2780);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public final /* synthetic */ Object m22743() {
        return this.f2780;
    }
}
