package p000;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public final class l01 {

    /* JADX INFO: renamed from: α */
    public final io.github.libxposed.api.XposedInterface.HookHandle f6340;

    public l01(io.github.libxposed.api.XposedInterface.HookHandle r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.f6340 = r1
            return
    }

    /* JADX INFO: renamed from: α */
    public final void m3432() {
            r0 = this;
            io.github.libxposed.api.XposedInterface$HookHandle r0 = r0.f6340
            r0.unhook()
            return
    }
}
