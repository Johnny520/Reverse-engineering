package p265s1;

import android.graphics.Bitmap;

/* JADX INFO: renamed from: s1.m0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7107m0 implements InterfaceC7089i2 {

    /* JADX INFO: renamed from: b */
    public final Bitmap f23611b;

    public C7107m0(Bitmap bitmap) {
        this.f23611b = bitmap;
    }

    @Override // p265s1.InterfaceC7089i2
    /* JADX INFO: renamed from: a */
    public int mo27905a() {
        return this.f23611b.getHeight();
    }

    @Override // p265s1.InterfaceC7089i2
    /* JADX INFO: renamed from: b */
    public void mo27906b() {
        this.f23611b.prepareToDraw();
    }

    @Override // p265s1.InterfaceC7089i2
    /* JADX INFO: renamed from: c */
    public int mo27907c() {
        Bitmap.Config config = this.f23611b.getConfig();
        config.getClass();
        return AbstractC7112n0.m28017e(config);
    }

    /* JADX INFO: renamed from: d */
    public final Bitmap m28000d() {
        return this.f23611b;
    }

    @Override // p265s1.InterfaceC7089i2
    /* JADX INFO: renamed from: e */
    public int mo27908e() {
        return this.f23611b.getWidth();
    }
}
