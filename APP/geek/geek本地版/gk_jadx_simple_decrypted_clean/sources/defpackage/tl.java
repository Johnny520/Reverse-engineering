package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class tl {
    public static final u30 b = null;
    public final /* synthetic */ yl a;

    static {
        b = new u30();
    }

    public tl(yl r1) {
        this.a = r1;
    }

    public static Class b(ClassLoader r3, String r4) {
        u30 r0 = b;
        u30 r2 = (u30) r0.getOrDefault(r3, null);
        if (r2 != null) goto L5;
        r2 = new u30();
        r0.put(r3, r2);
    L5:
        Class r02 = (Class) r2.getOrDefault(r4, null);
        if (r02 != null) goto L9;
        Class<?> r32 = Class.forName(r4, false, r3);
        r2.put(r4, r32);
        return r32;
    L9:
        return r02;
    }

    public static Class c(ClassLoader r3, String r4) {
        return b(r3, r4);
    L5:
        e = move-exception;
        throw new pb(z30.j("Unable to instantiate fragment ", r4, ": make sure class is a valid subclass of Fragment"), e);
    L8:
        e = move-exception;
        throw new pb(z30.j("Unable to instantiate fragment ", r4, ": make sure class name exists"), e);
    }

    public final ml a(String r5) {
        return (ml) c(this.a.n.D.getClassLoader(), r5).getConstructor(null).newInstance(null);
    L9:
        e = move-exception;
        throw new pb(z30.j("Unable to instantiate fragment ", r5, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
    L11:
        e = move-exception;
        throw new pb(z30.j("Unable to instantiate fragment ", r5, ": make sure class name exists, is public, and has an empty constructor that is public"), e);
    L7:
        e = move-exception;
        throw new pb(z30.j("Unable to instantiate fragment ", r5, ": could not find Fragment constructor"), e);
    L5:
        e = move-exception;
        throw new pb(z30.j("Unable to instantiate fragment ", r5, ": calling Fragment constructor caused an exception"), e);
    }
}
