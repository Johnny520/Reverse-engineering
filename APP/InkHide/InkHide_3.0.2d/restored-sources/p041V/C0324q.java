package p041V;

import java.lang.reflect.Method;
import p024M.C0191e;

/* JADX INFO: renamed from: V.q */
/* JADX INFO: loaded from: classes.dex */
public final class C0324q extends AbstractC0328u {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f726b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f727c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0324q(Object obj, Method method) {
        this.f726b = method;
        this.f727c = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041V.AbstractC0328u
    /* JADX INFO: renamed from: a */
    public final Object mo560a(Class cls) {
        String strM400a = C0191e.m400a(cls);
        if (strM400a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM400a));
        }
        return this.f726b.invoke(this.f727c, cls);
    }
}
