package p134j6;

import java.lang.reflect.Method;
import p100h0.C1545q0;
import p136j8.C2104o;

/* JADX INFO: renamed from: j6.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2081s extends AbstractC2084v {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f6986b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f6987c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2081s(Method method, int i9) {
        this.f6986b = method;
        this.f6987c = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p134j6.AbstractC2084v
    /* JADX INFO: renamed from: a */
    public final Object mo5140a(Class cls) {
        String strM4040b = C1545q0.m4040b(cls);
        if (strM4040b == null) {
            return this.f6986b.invoke(null, cls, Integer.valueOf(this.f6987c));
        }
        C2104o.m5281f("UnsafeAllocator is used for non-instantiable type: ".concat(strM4040b));
        return null;
    }
}
