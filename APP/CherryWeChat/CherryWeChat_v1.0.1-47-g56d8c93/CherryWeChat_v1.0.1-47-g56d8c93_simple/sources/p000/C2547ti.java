package p000;

/* JADX INFO: renamed from: ti */
/* JADX INFO: loaded from: classes.dex */
public final class C2547ti {

    /* JADX INFO: renamed from: b */
    public static final C2520sy f8868b = null;

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC2805zi f8869a;

    static {
        f8868b = new C2520sy(0);
    }

    public C2547ti(AbstractC2805zi r1) {
        this.f8869a = r1;
    }

    /* JADX INFO: renamed from: b */
    public static Class m5031b(String r3, ClassLoader r4) {
        C2520sy r0 = f8868b;
        C2520sy r1 = (C2520sy) r0.get(r4);
        if (r1 != null) goto L5;
        r1 = new C2520sy(0);
        r0.put(r4, r1);
    L5:
        Class r02 = (Class) r1.get(r3);
        if (r02 != null) goto L9;
        Class<?> r42 = Class.forName(r3, false, r4);
        r1.put(r3, r42);
        return r42;
    L9:
        return r02;
    }

    /* JADX INFO: renamed from: c */
    public static Class m5032c(String r3, ClassLoader r4) {
        return m5031b(r3, r4);
    L5:
        e = move-exception;
        throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", r3, ": make sure class is a valid subclass of Fragment"), e);
    L8:
        e = move-exception;
        throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", r3, ": make sure class name exists"), e);
    }

    /* JADX INFO: renamed from: a */
    public final AbstractComponentCallbacksC1503hi m5033a(String r5) {
        return (AbstractComponentCallbacksC1503hi) m5032c(r5, this.f8869a.f9512u.f7401m.getClassLoader()).getConstructor(null).newInstance(null);
    L9:
        e = move-exception;
        throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", r5, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
    L11:
        e = move-exception;
        throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", r5, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
    L7:
        e = move-exception;
        throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", r5, ": could not find Fragment constructor"), e);
    L5:
        e = move-exception;
        throw new C0232Fa(AbstractC2374ph.m4814k("Unable to instantiate fragment ", r5, ": calling Fragment constructor caused an exception"), e);
    }
}
