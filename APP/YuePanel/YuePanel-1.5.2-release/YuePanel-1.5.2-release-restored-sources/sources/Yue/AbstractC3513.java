package Yue;

import Yue.C7148;
import java.io.Serializable;

/* JADX INFO: renamed from: Yue.ۥ۟ۢۥۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
public abstract class AbstractC3513 implements InterfaceC4199<Object>, InterfaceC4246, Serializable {

    @InterfaceC6489
    private final InterfaceC4199<Object> completion;

    public AbstractC3513(@InterfaceC6489 InterfaceC4199<Object> interfaceC4199) {
        this.completion = interfaceC4199;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @InterfaceC6399
    public InterfaceC4199<C8107> create(@InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        C5499.m17103(interfaceC4199, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public InterfaceC4246 getCallerFrame() {
        InterfaceC4199<Object> interfaceC4199 = this.completion;
        if (interfaceC4199 instanceof InterfaceC4246) {
            return (InterfaceC4246) interfaceC4199;
        }
        return null;
    }

    @InterfaceC6489
    public final InterfaceC4199<Object> getCompletion() {
        return this.completion;
    }

    @Override // Yue.InterfaceC4246
    @InterfaceC6489
    public StackTraceElement getStackTraceElement() {
        return C4314.m12463(this);
    }

    @InterfaceC6489
    public abstract Object invokeSuspend(@InterfaceC6399 Object obj);

    public void releaseIntercepted() {
    }

    @Override // Yue.InterfaceC4199
    public final void resumeWith(@InterfaceC6399 Object obj) {
        Object objInvokeSuspend;
        InterfaceC4199<Object> interfaceC4199 = this;
        while (true) {
            C4324.m1287(interfaceC4199);
            AbstractC3513 abstractC3513 = (AbstractC3513) interfaceC4199;
            InterfaceC4199<Object> interfaceC41992 = abstractC3513.completion;
            C5499.m17100(interfaceC41992);
            try {
                objInvokeSuspend = abstractC3513.invokeSuspend(obj);
            } catch (Throwable th) {
                C7148.C1189 c1189 = C7148.f21560;
                obj = C7148.m3438(C7149.m3441(th));
            }
            if (objInvokeSuspend == C5508.m17142()) {
                return;
            }
            C7148.C1189 c11892 = C7148.f21560;
            obj = C7148.m3438(objInvokeSuspend);
            abstractC3513.releaseIntercepted();
            if (!(interfaceC41992 instanceof AbstractC3513)) {
                interfaceC41992.resumeWith(obj);
                return;
            }
            interfaceC4199 = interfaceC41992;
        }
    }

    @InterfaceC6399
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @InterfaceC6399
    public InterfaceC4199<C8107> create(@InterfaceC6489 Object obj, @InterfaceC6399 InterfaceC4199<?> interfaceC4199) {
        C5499.m17103(interfaceC4199, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }
}
