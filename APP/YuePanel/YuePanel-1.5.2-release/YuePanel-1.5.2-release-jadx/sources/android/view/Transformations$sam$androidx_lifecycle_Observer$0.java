package android.view;

import Yue.C5499;
import Yue.InterfaceC5124;
import Yue.InterfaceC5139;
import Yue.InterfaceC5148;
import Yue.InterfaceC6211;
import Yue.InterfaceC6399;
import Yue.InterfaceC6489;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC6211(m2700k = 3, m2701mv = {1, 8, 0}, m2703xi = 48)
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, InterfaceC5148 {
    private final /* synthetic */ InterfaceC5124 function;

    public Transformations$sam$androidx_lifecycle_Observer$0(InterfaceC5124 interfaceC5124) {
        C5499.m17103(interfaceC5124, "function");
        this.function = interfaceC5124;
    }

    public final boolean equals(@InterfaceC6489 Object obj) {
        if ((obj instanceof Observer) && (obj instanceof InterfaceC5148)) {
            return C5499.m17094(getFunctionDelegate(), ((InterfaceC5148) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // Yue.InterfaceC5148
    @InterfaceC6399
    public final InterfaceC5139<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // android.view.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
