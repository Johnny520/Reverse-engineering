package yyds;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: yyds.ᛳᲁᲀᛷ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class ThreadFactoryC0710 implements ThreadFactory {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f3352;

    public /* synthetic */ ThreadFactoryC0710(int i) {
        this.f3352 = i;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        switch (this.f3352) {
            case 0:
                return new Thread(new RunnableC0871(0, runnable), "glide-active-resources");
            case 1:
                return new C0840(runnable);
            default:
                return new C0840(runnable, "fonts-androidx");
        }
    }
}
