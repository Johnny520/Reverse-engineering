package Yue;

import java.io.Serializable;
import java.lang.Enum;

/* JADX INFO: renamed from: Yue.ۥ۠ۡ۠۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C4657<E extends Enum<E>> implements Serializable {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C0463 f9984 = new C0463(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f9985 = 0;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final Class<E> f9986;

    /* JADX INFO: renamed from: Yue.ۥ۠ۡ۠۟$ۥ */
    public static final class C0463 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥ۠ۡ۠۟.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C0463(C4335 c4335) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C0463() {
        }
    }

    public C4657(@InterfaceC6399 E[] eArr) {
        C5499.m17103(eArr, "entries");
        Class<E> cls = (Class<E>) eArr.getClass().getComponentType();
        C5499.m17100(cls);
        this.f9986 = cls;
    }

    /* JADX INFO: renamed from: ۥ */
    public final Object m1609() {
        E[] enumConstants = this.f9986.getEnumConstants();
        C5499.m17102(enumConstants, "c.enumConstants");
        return C4655.m1607(enumConstants);
    }
}
