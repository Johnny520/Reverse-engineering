package io.github.cherrywechat.application;

import android.app.Application;
import java.lang.ref.WeakReference;
import p000.AbstractC0966We;
import p000.AbstractC2397q3;
import p000.C0349I4;
import p000.C0607O4;
import p000.C0923Ve;
import p000.C1456gf;
import p000.LayoutInflaterFactory2C0176E3;

/* JADX INFO: loaded from: classes.dex */
public final class MainApplication extends Application {

    /* JADX INFO: renamed from: a */
    public static MainApplication f5549a;

    @Override // android.app.Application
    public final void onCreate() {
        super.onCreate();
        f5549a = this;
        if (AbstractC2397q3.f8399b != -1) {
            AbstractC2397q3.f8399b = -1;
            synchronized (AbstractC2397q3.f8405h) {
                try {
                    C0607O4 c0607o4 = AbstractC2397q3.f8404g;
                    c0607o4.getClass();
                    C0349I4 c0349i4 = new C0349I4(c0607o4);
                    while (c0349i4.hasNext()) {
                        AbstractC2397q3 abstractC2397q3 = (AbstractC2397q3) ((WeakReference) c0349i4.next()).get();
                        if (abstractC2397q3 != null) {
                            ((LayoutInflaterFactory2C0176E3) abstractC2397q3).m350m(true, true);
                        }
                    }
                } finally {
                }
            }
        }
        int[] iArr = AbstractC0966We.f3008a;
        new C1456gf(4);
        registerActivityLifecycleCallbacks(new C0923Ve());
    }
}
