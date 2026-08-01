package p088R1;

import java.io.File;
import p000A.C0066i0;
import p002A1.C0115D;
import p097T1.C1415d;
import p097T1.C1416e;
import p097T1.InterfaceC1412a;
import p195l2.AbstractC2503g;
import p195l2.InterfaceC2504h;

/* JADX INFO: renamed from: R1.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1213n implements InterfaceC2504h {

    /* JADX INFO: renamed from: d */
    public volatile Object f4031d;

    /* JADX INFO: renamed from: e */
    public final Object f4032e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [R1.o.<init>(T1.f, A.i0, U1.e, U1.e, U1.e, U1.e):void, Y1.t.<clinit>():void, com.bumptech.glide.c.<init>(android.content.Context, R1.o, T1.f, S1.a, S1.f, e2.d, W0.b, W0.b, k.e, java.util.List, java.util.ArrayList, a.a, Y1.n):void, com.bumptech.glide.i.<init>(android.content.Context, S1.f, e2.h, W0.b, W0.b, k.e, java.util.List, R1.o, Y1.n):void, e2.h.<init>(android.content.Context):void] */
    public /* synthetic */ C1213n(Object obj) {
        this.f4032e = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public InterfaceC1412a m2288a() {
        if (((InterfaceC1412a) this.f4031d) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC1412a) this.f4031d) == null) {
                        File cacheDir = ((C1416e) ((C0066i0) this.f4032e).f297e).f5067e.getCacheDir();
                        C1415d c1415d = null;
                        File file = cacheDir == null ? null : new File(cacheDir, "image_manager_disk_cache");
                        if (file != null && (file.isDirectory() || file.mkdirs())) {
                            c1415d = new C1415d(file);
                        }
                        this.f4031d = c1415d;
                    }
                    if (((InterfaceC1412a) this.f4031d) == null) {
                        this.f4031d = new C0115D(25);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC1412a) this.f4031d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p195l2.InterfaceC2504h
    public Object get() {
        if (this.f4031d == null) {
            synchronized (this) {
                try {
                    if (this.f4031d == null) {
                        Object obj = ((InterfaceC2504h) this.f4032e).get();
                        AbstractC2503g.m4445c(obj, "Argument must not be null");
                        this.f4031d = obj;
                    }
                } finally {
                }
            }
        }
        return this.f4031d;
    }
}
