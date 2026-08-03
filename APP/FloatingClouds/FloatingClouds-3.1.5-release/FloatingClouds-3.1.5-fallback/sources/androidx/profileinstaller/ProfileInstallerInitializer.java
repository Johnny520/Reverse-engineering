package androidx.profileinstaller;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements a.V8<androidx.profileinstaller.ProfileInstallerInitializer.c> {

    public static class a {
        public static void a(java.lang.Runnable r2) {
                android.view.Choreographer r0 = android.view.Choreographer.getInstance()
                a.Jc r1 = new a.Jc
                r1.<init>(r2)
                r0.postFrameCallback(r1)
                return
        }
    }

    public static class b {
        public static android.os.Handler a(android.os.Looper r0) {
                android.os.Handler r0 = android.os.Handler.createAsync(r0)
                return r0
        }
    }

    public static class c {
    }

    public ProfileInstallerInitializer() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // a.V8
    public final java.util.List<java.lang.Class<? extends a.V8<?>>> a() {
            r1 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // a.V8
    public final androidx.profileinstaller.ProfileInstallerInitializer.c b(android.content.Context r3) {
            r2 = this;
            android.content.Context r3 = r3.getApplicationContext()
            a.P0 r0 = new a.P0
            r1 = 13
            r0.<init>(r2, r1, r3)
            androidx.profileinstaller.ProfileInstallerInitializer.a.a(r0)
            androidx.profileinstaller.ProfileInstallerInitializer$c r3 = new androidx.profileinstaller.ProfileInstallerInitializer$c
            r3.<init>()
            return r3
    }
}
