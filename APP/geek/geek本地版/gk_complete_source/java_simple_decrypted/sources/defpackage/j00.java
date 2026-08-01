package defpackage;

/* JADX INFO: loaded from: classes.dex */
public abstract class j00 {
    public static final k00 a = null;

    static {
        k00 r0 = null;
        r0 = (k00) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();     // Catch: Throwable -> L10
    L5:
        if (r0 != null) goto L8;
        r0 = new k00();
    L8:
        a = r0;
    }
}
