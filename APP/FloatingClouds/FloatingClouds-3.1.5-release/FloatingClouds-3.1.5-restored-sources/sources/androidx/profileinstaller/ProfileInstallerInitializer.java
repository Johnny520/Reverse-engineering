package androidx.profileinstaller;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import java.util.Collections;
import java.util.List;
import p000a.InterfaceC0388V8;
import p000a.RunnableC0273P0;

/* JADX INFO: loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0388V8<C1146c> {

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$a */
    public static class C1144a {
        /* JADX INFO: renamed from: a */
        public static void m2619a(final Runnable runnable) {
            Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: a.Jc
                @Override // android.view.Choreographer.FrameCallback
                public final void doFrame(long j) {
                    runnable.run();
                }
            });
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$b */
    public static class C1145b {
        /* JADX INFO: renamed from: a */
        public static Handler m2620a(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    /* JADX INFO: renamed from: androidx.profileinstaller.ProfileInstallerInitializer$c */
    public static class C1146c {
    }

    @Override // p000a.InterfaceC0388V8
    /* JADX INFO: renamed from: a */
    public final List<Class<? extends InterfaceC0388V8<?>>> mo1019a() {
        return Collections.EMPTY_LIST;
    }

    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p000a.InterfaceC0388V8
    /* JADX INFO: renamed from: b */
    public final C1146c mo1020b(Context context) {
        C1144a.m2619a(new RunnableC0273P0(this, 13, context.getApplicationContext()));
        return new C1146c();
    }
}
