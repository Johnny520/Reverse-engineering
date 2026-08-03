package p000;

/* JADX INFO: renamed from: Jv */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0425Jv {

    /* JADX INFO: renamed from: a */
    public static final C0468Kv f1405a = null;

    static {
        C0468Kv r0 = null;
        r0 = (C0468Kv) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();     // Catch: Throwable -> L10
    L5:
        if (r0 != null) goto L8;
        r0 = new C0468Kv();
    L8:
        f1405a = r0;
    }

    /* JADX INFO: renamed from: a */
    public static C0225F9 m881a(Class r1) {
        f1405a.getClass();
        return new C0225F9(r1);
    }
}
