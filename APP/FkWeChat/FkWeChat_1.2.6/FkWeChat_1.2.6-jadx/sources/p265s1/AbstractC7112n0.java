package p265s1;

import android.graphics.Bitmap;
import p215oc.C5725t;
import p265s1.C7094j2;
import p276t1.AbstractC8027c;

/* JADX INFO: renamed from: s1.n0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7112n0 {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC7089i2 m28013a(int i10, int i11, int i12, boolean z10, AbstractC8027c abstractC8027c) {
        m28016d(i12);
        return new C7107m0(C7160x0.m28250a(i10, i11, i12, z10, abstractC8027c));
    }

    /* JADX INFO: renamed from: b */
    public static final Bitmap m28014b(InterfaceC7089i2 interfaceC7089i2) {
        if (interfaceC7089i2 instanceof C7107m0) {
            return ((C7107m0) interfaceC7089i2).m28000d();
        }
        C5725t.m23179a("Unable to obtain android.graphics.Bitmap");
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static final InterfaceC7089i2 m28015c(Bitmap bitmap) {
        return new C7107m0(bitmap);
    }

    /* JADX INFO: renamed from: d */
    public static final Bitmap.Config m28016d(int i10) {
        C7094j2.a aVar = C7094j2.f23571b;
        return C7094j2.m27928i(i10, aVar.m27933b()) ? Bitmap.Config.ARGB_8888 : C7094j2.m27928i(i10, aVar.m27932a()) ? Bitmap.Config.ALPHA_8 : C7094j2.m27928i(i10, aVar.m27936e()) ? Bitmap.Config.RGB_565 : C7094j2.m27928i(i10, aVar.m27934c()) ? Bitmap.Config.RGBA_F16 : C7094j2.m27928i(i10, aVar.m27935d()) ? Bitmap.Config.HARDWARE : Bitmap.Config.ARGB_8888;
    }

    /* JADX INFO: renamed from: e */
    public static final int m28017e(Bitmap.Config config) {
        return config == Bitmap.Config.ALPHA_8 ? C7094j2.f23571b.m27932a() : config == Bitmap.Config.RGB_565 ? C7094j2.f23571b.m27936e() : config == Bitmap.Config.ARGB_4444 ? C7094j2.f23571b.m27933b() : config == Bitmap.Config.RGBA_F16 ? C7094j2.f23571b.m27934c() : config == Bitmap.Config.HARDWARE ? C7094j2.f23571b.m27935d() : C7094j2.f23571b.m27933b();
    }
}
