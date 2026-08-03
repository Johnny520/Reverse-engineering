package p000a;

import java.lang.reflect.Method;

/* JADX INFO: renamed from: a.Fb */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0104Fb implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ boolean f360a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f361b;

    public /* synthetic */ RunnableC0104Fb(String str, boolean z) {
        this.f360a = z;
        this.f361b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ClassLoader classLoader;
        boolean z = this.f360a;
        String str = this.f361b;
        try {
            Object obj = C0122Gb.f391c;
            if (obj != null && (classLoader = obj.getClass().getClassLoader()) != null) {
                if (C0122Gb.f392d == null || C0122Gb.f391c == null) {
                    C0122Gb.f389a.getClass();
                    if (!C0122Gb.m321i(classLoader)) {
                        return;
                    }
                }
                String str2 = z ? "hidden_conv_parent" : "";
                Method method = C0122Gb.f392d;
                if (method != null) {
                    method.invoke(C0122Gb.f391c, new String[]{str}, str2);
                }
                C0122Gb.f389a.getClass();
                C0122Gb.m322j("setHiddenAsync OK: " + str + " hidden=" + z);
            }
        } catch (Throwable unused) {
        }
    }
}
