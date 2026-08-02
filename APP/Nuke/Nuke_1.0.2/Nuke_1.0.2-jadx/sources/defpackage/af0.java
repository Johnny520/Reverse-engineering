package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class af0 implements bq0 {
    public volatile Object h;
    public final Object i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [bf0.<init>(yd1, n4, aq0, aq0, aq0, aq0):void, er2.<init>(android.content.Context):void, se.<clinit>():void, vp0.<init>(android.content.Context, td1, er2, z8, eb, hg, java.util.List, bf0, n4):void] */
    public /* synthetic */ af0(Object obj) {
        this.i = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public a90 a() {
        if (((a90) this.h) == null) {
            synchronized (this) {
                try {
                    if (((a90) this.h) == null) {
                        File cacheDir = ((r80) ((n4) this.i).i).i.getCacheDir();
                        i90 i90Var = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            i90Var = new i90(file);
                        }
                        this.h = i90Var;
                    }
                    if (((a90) this.h) == null) {
                        this.h = new eb(16);
                    }
                } finally {
                }
            }
        }
        return (a90) this.h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.bq0
    public Object get() {
        if (this.h == null) {
            synchronized (this) {
                try {
                    if (this.h == null) {
                        Object obj = ((bq0) this.i).get();
                        fg1.q("Argument must not be null", obj);
                        this.h = obj;
                    }
                } finally {
                }
            }
        }
        return this.h;
    }
}
