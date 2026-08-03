package p134j6;

import java.lang.reflect.Method;
import p100h0.C1545q0;
import p136j8.C2104o;

/* JADX INFO: renamed from: j6.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2080r extends AbstractC2084v {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f6984b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f6985c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2080r(Method method, Object obj) {
        this.f6984b = method;
        this.f6985c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p134j6.AbstractC2084v
    /* JADX INFO: renamed from: a */
    public final Object mo5140a(Class cls) {
        String strM4040b = C1545q0.m4040b(cls);
        if (strM4040b == null) {
            return this.f6984b.invoke(this.f6985c, cls);
        }
        C2104o.m5281f("UnsafeAllocator is used for non-instantiable type: ".concat(strM4040b));
        return null;
    }
}
