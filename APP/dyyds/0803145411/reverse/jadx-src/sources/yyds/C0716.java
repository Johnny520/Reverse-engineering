package yyds;

import java.io.File;

/* JADX INFO: renamed from: yyds.ᛳᲇᛲᲁ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0716 implements InterfaceC1564 {

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public volatile Object f3370;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public final Object f3371;

    public /* synthetic */ C0716(Object obj) {
        this.f3371 = obj;
    }

    @Override // yyds.InterfaceC1564
    public Object get() {
        if (this.f3370 == null) {
            synchronized (this) {
                try {
                    if (this.f3370 == null) {
                        Object obj = ((InterfaceC1564) this.f3371).get();
                        AbstractC0319.m992(obj, "Argument must not be null");
                        this.f3370 = obj;
                    }
                } finally {
                }
            }
        }
        return this.f3370;
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public InterfaceC0594 m1635() {
        if (((InterfaceC0594) this.f3370) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC0594) this.f3370) == null) {
                        File cacheDir = ((C1483) ((C2014) this.f3371).f10074).f7021.getCacheDir();
                        C0299 c0299 = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c0299 = new C0299(file);
                        }
                        this.f3370 = c0299;
                    }
                    if (((InterfaceC0594) this.f3370) == null) {
                        this.f3370 = new C1985(12);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC0594) this.f3370;
    }
}
