package p257r8;

import java.io.Serializable;
import p172l8.AbstractC4713t;
import p172l8.C4712s;
import p228p8.InterfaceC5976f;
import p242q8.AbstractC6325c;

/* JADX INFO: renamed from: r8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6532a implements InterfaceC5976f, InterfaceC6536e, Serializable {
    private final InterfaceC5976f completion;

    public AbstractC6532a(InterfaceC5976f interfaceC5976f) {
        this.completion = interfaceC5976f;
    }

    public InterfaceC5976f create(InterfaceC5976f interfaceC5976f) {
        interfaceC5976f.getClass();
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public InterfaceC6536e getCallerFrame() {
        InterfaceC5976f interfaceC5976f = this.completion;
        if (interfaceC5976f instanceof InterfaceC6536e) {
            return (InterfaceC6536e) interfaceC5976f;
        }
        return null;
    }

    public final InterfaceC5976f getCompletion() {
        return this.completion;
    }

    public StackTraceElement getStackTraceElement() {
        return AbstractC6538g.m25857c(this);
    }

    public abstract Object invokeSuspend(Object obj);

    @Override // p228p8.InterfaceC5976f
    public final void resumeWith(Object obj) {
        Object objInvokeSuspend;
        InterfaceC5976f interfaceC5976f = this;
        while (true) {
            AbstractC6539h.m25859b(interfaceC5976f);
            AbstractC6532a abstractC6532a = (AbstractC6532a) interfaceC5976f;
            InterfaceC5976f interfaceC5976f2 = abstractC6532a.completion;
            interfaceC5976f2.getClass();
            try {
                objInvokeSuspend = abstractC6532a.invokeSuspend(obj);
            } catch (Throwable th) {
                C4712s.a aVar = C4712s.f13928r;
                obj = C4712s.m18798b(AbstractC4713t.m18807a(th));
            }
            if (objInvokeSuspend == AbstractC6325c.m24992g()) {
                return;
            }
            obj = C4712s.m18798b(objInvokeSuspend);
            abstractC6532a.releaseIntercepted();
            if (!(interfaceC5976f2 instanceof AbstractC6532a)) {
                interfaceC5976f2.resumeWith(obj);
                return;
            }
            interfaceC5976f = interfaceC5976f2;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Continuation at ");
        Object stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb2.append(stackTraceElement);
        return sb2.toString();
    }

    public InterfaceC5976f create(Object obj, InterfaceC5976f interfaceC5976f) {
        interfaceC5976f.getClass();
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public void releaseIntercepted() {
    }
}
