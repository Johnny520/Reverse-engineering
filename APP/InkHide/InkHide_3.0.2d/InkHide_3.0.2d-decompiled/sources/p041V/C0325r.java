package p041V;

import java.lang.reflect.Method;
import p024M.C0191e;

/* JADX INFO: renamed from: V.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0325r extends AbstractC0328u {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Method f728b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f729c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0325r(int i2, Method method) {
        this.f728b = method;
        this.f729c = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p041V.AbstractC0328u
    /* JADX INFO: renamed from: a */
    public final Object mo560a(Class cls) {
        String strM400a = C0191e.m400a(cls);
        if (strM400a != null) {
            throw new AssertionError("UnsafeAllocator is used for non-instantiable type: ".concat(strM400a));
        }
        return this.f728b.invoke(null, cls, Integer.valueOf(this.f729c));
    }
}
