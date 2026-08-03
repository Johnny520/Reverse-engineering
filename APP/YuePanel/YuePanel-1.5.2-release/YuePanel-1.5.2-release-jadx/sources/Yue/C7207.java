package Yue;

import Yue.C7148;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import net.bytebuddy.implementation.MethodDelegation;

/* JADX INFO: renamed from: Yue.ۥۣۡۧۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC6839
@InterfaceC7470(version = "1.3")
public final class C7207<T> implements InterfaceC4199<T>, InterfaceC4246 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public static final C1210 f21773 = new C1210(null);

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final AtomicReferenceFieldUpdater<C7207<?>, Object> f21774 = AtomicReferenceFieldUpdater.newUpdater(C7207.class, Object.class, "result");

    @InterfaceC6489
    private volatile Object result;

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4199<T> f21775;

    /* JADX INFO: renamed from: Yue.ۥۣۡۧۢ$ۥ */
    public static final class C1210 {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: Yue.ۥۣۡۧۢ.ۥ.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ C1210(C4335 c4335) {
            this();
        }

        /* JADX INFO: renamed from: ۥ */
        public static /* synthetic */ void m3501() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public C1210() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Multi-variable search result rejected for r2v0, resolved type: Yue.ۥ۟ۧۤۢ<? super T> */
    /* JADX WARN: Multi-variable type inference failed */
    public C7207(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199, @InterfaceC6489 Object obj) {
        C5499.m17103(interfaceC4199, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
        this.f21775 = interfaceC4199;
        this.result = obj;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        InterfaceC4199<T> interfaceC4199 = this.f21775;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @Override // Yue.InterfaceC4199
    @InterfaceC6399
    public InterfaceC4225 getContext() {
        return this.f21775.getContext();
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // Yue.InterfaceC4199
    public void resumeWith(@InterfaceC6399 Object obj) {
        while (true) {
            Object obj2 = this.result;
            EnumC4245 enumC4245 = EnumC4245.f8634;
            if (obj2 == enumC4245) {
                if (C3008.m74(f21774, this, enumC4245, obj)) {
                    return;
                }
            } else {
                if (obj2 != C5508.m17142()) {
                    throw new IllegalStateException("Already resumed");
                }
                if (C3008.m74(f21774, this, C5508.m17142(), EnumC4245.f8635)) {
                    this.f21775.resumeWith(obj);
                    return;
                }
            }
        }
    }

    @InterfaceC6399
    public String toString() {
        return "SafeContinuation for " + this.f21775;
    }

    @InterfaceC6839
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final Object m3500() throws Throwable {
        Object obj = this.result;
        EnumC4245 enumC4245 = EnumC4245.f8634;
        if (obj == enumC4245) {
            if (C3008.m74(f21774, this, enumC4245, C5508.m17142())) {
                return C5508.m17142();
            }
            obj = this.result;
        }
        if (obj == EnumC4245.f8635) {
            return C5508.m17142();
        }
        if (obj instanceof C7148.C1190) {
            throw ((C7148.C1190) obj).f21562;
        }
        return obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @InterfaceC6839
    public C7207(@InterfaceC6399 InterfaceC4199<? super T> interfaceC4199) {
        this(interfaceC4199, EnumC4245.f8634);
        C5499.m17103(interfaceC4199, MethodDelegation.ImplementationDelegate.FIELD_NAME_PREFIX);
    }
}
