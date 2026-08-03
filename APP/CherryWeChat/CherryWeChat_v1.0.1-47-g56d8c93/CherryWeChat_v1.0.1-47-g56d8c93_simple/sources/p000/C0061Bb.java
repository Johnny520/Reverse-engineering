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

    public /* synthetic */ C0061Bb(Object r1) {
        this.f141a = r1;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC0879Ud m96a() {
        if (((InterfaceC0879Ud) this.f142b) != null) goto L29;
        monitor-enter(this);
    L19:
        th = move-exception;
        throw th;
    L6:
        if (((InterfaceC0879Ud) this.f142b) != null) goto L22;
        File r0 = ((C0793Sd) ((C0132D2) this.f141a).f328b).f2493b.getCacheDir();     // Catch: Throwable -> L19
        C1262ce r2 = null;
        if (r0 != null) goto L10;
        File r3 = null;
    L11:
        if (r3 != null) goto L14;
    L18:
        this.f142b = r2;     // Catch: Throwable -> L19
        goto L22
    L14:
        if (r3.isDirectory() == false) goto L16;
    L17:
        r2 = new C1262ce(r3);     // Catch: Throwable -> L19
        goto L18
    L16:
        if (r3.mkdirs() == false) goto L18;
    L10:
        r3 = new File(r0, "image_manager_disk_cache");     // Catch: Throwable -> L19
    L22:
        if (((InterfaceC0879Ud) this.f142b) != null) goto L24;
        this.f142b = new C2220m6(12);     // Catch: Throwable -> L19
    L24:
        monitor-exit(this);     // Catch: Throwable -> L19
    L29:
        return (InterfaceC0879Ud) this.f142b;
    }

    /* JADX INFO: renamed from: b */
    public Object m97b(Context r2) {
        if (this.f142b != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.f142b != null) goto L10;
        this.f142b = ((C2438r1) this.f141a).m4890e(r2);     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.f142b;
    }

    @Override // p000.InterfaceC1014Xj
    public Object get() {
        if (this.f142b != null) goto L15;
        monitor-enter(this);
    L8:
        th = move-exception;
        throw th;
    L6:
        if (this.f142b != null) goto L10;
        Object r0 = ((InterfaceC1014Xj) this.f141a).get();     // Catch: Throwable -> L8
        AbstractC0714Qj.m1488j("Argument must not be null", r0);     // Catch: Throwable -> L8
        this.f142b = r0;     // Catch: Throwable -> L8
    L10:
        monitor-exit(this);     // Catch: Throwable -> L8
    L15:
        return this.f142b;
    }

    public C0061Bb(C2438r1 r2) {
        this.f142b = null;
        this.f141a = r2;
    }

    public C0061Bb() {
        this.f141a = new CopyOnWriteArraySet();
    }
}
