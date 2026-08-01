package p140j7;

import io.ktor.utils.p131io.AbstractC3458b;
import io.ktor.utils.p131io.InterfaceC3468g;
import java.util.Iterator;
import p034c7.InterfaceC1355b;
import p172l8.AbstractC4693f;
import p184m7.AbstractC5061e;
import p210o7.AbstractC5653e;
import p210o7.InterfaceC5652d;
import p281t6.C8173z;
import p299ub.AbstractC8621f0;
import p323w6.AbstractC9195f;

/* JADX INFO: renamed from: j7.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C3618i extends AbstractC9195f.c {

    /* JADX INFO: renamed from: a */
    public final String f10070a;

    public C3618i(InterfaceC1355b interfaceC1355b, Throwable th) {
        interfaceC1355b.getClass();
        th.getClass();
        StringBuilder sb2 = new StringBuilder("<html><body><h1>Internal Server Error</h1><h2>Request Information:</h2><pre>");
        InterfaceC5652d interfaceC5652dMo5372m = interfaceC1355b.mo5372m();
        sb2.append("Method: " + AbstractC5653e.m22858c(interfaceC5652dMo5372m) + '\n');
        sb2.append("Path: " + AbstractC5653e.m22862g(interfaceC5652dMo5372m) + '\n');
        sb2.append("Parameters: " + interfaceC5652dMo5372m.mo7351i() + '\n');
        sb2.append("From origin: " + AbstractC5061e.m20474a(interfaceC5652dMo5372m) + '\n');
        sb2.append("</pre><h2>Stack Trace:</h2><pre>");
        Iterator it = AbstractC8621f0.m33170y0(AbstractC4693f.m18755c(th)).iterator();
        while (it.hasNext()) {
            sb2.append("<span style=\"color:blue;\">" + ((String) it.next()) + "</span><br>");
        }
        for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
            sb2.append("<br>Caused by:<br>");
            Iterator it2 = AbstractC8621f0.m33170y0(AbstractC4693f.m18755c(cause)).iterator();
            while (it2.hasNext()) {
                sb2.append("<span style=\"color:green;\">" + ((String) it2.next()) + "</span><br>");
            }
        }
        sb2.append("</pre></body></html>");
        this.f10070a = sb2.toString();
    }

    @Override // p323w6.AbstractC9195f
    /* JADX INFO: renamed from: d */
    public C8173z mo12275d() {
        return C8173z.f27462s.m31812n();
    }

    @Override // p323w6.AbstractC9195f.c
    /* JADX INFO: renamed from: e */
    public InterfaceC3468g mo13548e() {
        return AbstractC3458b.m12906d(this.f10070a, null, 2, null);
    }
}
