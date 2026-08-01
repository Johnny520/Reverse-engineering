package p041V;

import java.lang.reflect.Method;
import p024M.C0191e;

/* JADX INFO: renamed from: V.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0326s extends AbstractC0328u {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f730b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0326s(Method method) {
        this.f730b = method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041V.AbstractC0328u
    /* JADX INFO: renamed from: a */
    public final Object mo560a(Class cls) {
        String strM400a = C0191e.m400a(cls);
        if (strM400a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM400a));
        }
        return this.f730b.invoke(null, cls, Object.class);
    }
}
