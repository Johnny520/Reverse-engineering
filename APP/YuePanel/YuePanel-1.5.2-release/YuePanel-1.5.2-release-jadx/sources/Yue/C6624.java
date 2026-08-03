package Yue;

import java.nio.file.Path;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۣۡۨۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public final class C6624 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public final Path f2184;

    /* JADX INFO: renamed from: ۥ۟ */
    @InterfaceC6489
    public final Object f2185;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public final C6624 f16993;

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public Iterator<C6624> f16994;

    public C6624(@InterfaceC6399 Path path, @InterfaceC6489 Object obj, @InterfaceC6489 C6624 c6624) {
        C5499.m17103(path, "path");
        this.f2184 = path;
        this.f2185 = obj;
        this.f16993 = c6624;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ */
    public final Iterator<C6624> m3099() {
        return this.f16994;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final Object m3100() {
        return this.f2185;
    }

    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C6624 m21062() {
        return this.f16993;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public final Path m21063() {
        return this.f2184;
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public final void m21064(@InterfaceC6489 Iterator<C6624> it) {
        this.f16994 = it;
    }
}
