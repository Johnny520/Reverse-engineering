package p000;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: Bb */
/* JADX INFO: loaded from: classes.dex */
public final class C0061Bb implements InterfaceC1014Xj {

    /* JADX INFO: renamed from: a */
    public final Object f141a;

    /* JADX INFO: renamed from: b */
    public volatile Object f142b;

    public /* synthetic */ C0061Bb(Object obj) {
        this.f141a = obj;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0879Ud m96a() {
        if (((InterfaceC0879Ud) this.f142b) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC0879Ud) this.f142b) == null) {
                        File cacheDir = ((C0793Sd) ((C0132D2) this.f141a).f328b).f2493b.getCacheDir();
                        C1262ce c1262ce = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c1262ce = new C1262ce(file);
                        }
                        this.f142b = c1262ce;
                    }
                    if (((InterfaceC0879Ud) this.f142b) == null) {
                        this.f142b = new C2220m6(12);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC0879Ud) this.f142b;
    }

    /* JADX INFO: renamed from: b */
    public Object m97b(Context context) {
        if (this.f142b == null) {
            synchronized (this) {
                try {
                    if (this.f142b == null) {
                        this.f142b = ((C2438r1) this.f141a).m4890e(context);
                    }
                } finally {
                }
            }
        }
        return this.f142b;
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        if (this.f142b == null) {
            synchronized (this) {
                try {
                    if (this.f142b == null) {
                        Object obj = ((InterfaceC1014Xj) this.f141a).get();
                        AbstractC0714Qj.m1488j("Argument must not be null", obj);
                        this.f142b = obj;
                    }
                } finally {
                }
            }
        }
        return this.f142b;
    }

    public C0061Bb(C2438r1 c2438r1) {
        this.f142b = null;
        this.f141a = c2438r1;
    }

    public C0061Bb() {
        this.f141a = new CopyOnWriteArraySet();
    }
}
