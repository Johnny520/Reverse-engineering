package p000;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class af0 implements bq0 {

    /* JADX INFO: renamed from: h */
    public volatile Object f182h;

    /* JADX INFO: renamed from: i */
    public final Object f183i;

    public /* synthetic */ af0(Object obj) {
        this.f183i = obj;
    }

    /* JADX INFO: renamed from: a */
    public a90 m145a() {
        if (((a90) this.f182h) == null) {
            synchronized (this) {
                try {
                    if (((a90) this.f182h) == null) {
                        File cacheDir = ((r80) ((C0485n4) this.f183i).f6983i).f9426i.getCacheDir();
                        i90 i90Var = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            i90Var = new i90(file);
                        }
                        this.f182h = i90Var;
                    }
                    if (((a90) this.f182h) == null) {
                        this.f182h = new C0160eb(16);
                    }
                } finally {
                }
            }
        }
        return (a90) this.f182h;
    }

    @Override // p000.bq0
    public Object get() {
        if (this.f182h == null) {
            synchronized (this) {
                try {
                    if (this.f182h == null) {
                        Object obj = ((bq0) this.f183i).get();
                        fg1.m1642q("Argument must not be null", obj);
                        this.f182h = obj;
                    }
                } finally {
                }
            }
        }
        return this.f182h;
    }
}
