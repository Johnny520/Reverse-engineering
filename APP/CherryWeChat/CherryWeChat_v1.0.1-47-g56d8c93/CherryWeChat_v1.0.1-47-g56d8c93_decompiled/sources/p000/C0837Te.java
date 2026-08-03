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
        if (this.f2665a == null) {
            try {
                Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                declaredMethod.setAccessible(true);
                Long l = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                l.longValue();
                this.f2665a = l;
            } catch (Exception unused) {
                this.f2665a = -1L;
            }
        }
        return this.f2665a.longValue() >= 40100;
    }
}
