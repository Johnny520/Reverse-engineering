package p000;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Te */
/* JADX INFO: loaded from: classes.dex */
public final class C0837Te implements InterfaceC0880Ue {

    /* JADX INFO: renamed from: a */
    public Long f2665a;

    @Override // p000.InterfaceC0880Ue
    /* JADX INFO: renamed from: a */
    public final boolean mo1608a() {
        if (this.f2665a != null) goto L8;
        Method r0 = Build.class.getDeclaredMethod("getLong", new Class[]{String.class});     // Catch: Exception -> L6
        r0.setAccessible(true);     // Catch: Exception -> L6
        Long r02 = (Long) r0.invoke(null, new Object[]{"ro.build.version.oneui"});     // Catch: Exception -> L6
        r02.longValue();     // Catch: Exception -> L6
        this.f2665a = r02;     // Catch: Exception -> L6
    L6:
        this.f2665a = -1L;
    L8:
        if (this.f2665a.longValue() >= 40100) goto L14;
        return false;
    L14:
        return true;
    }
}
