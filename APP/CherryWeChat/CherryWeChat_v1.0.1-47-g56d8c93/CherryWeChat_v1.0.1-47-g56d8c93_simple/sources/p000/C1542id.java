package p000;

import android.view.View;
import io.sentry.AbstractC2052w;
import io.sentry.C1609M2;
import io.sentry.C2025u;
import io.sentry.C2043v;
import io.sentry.EnumC1657a2;
import io.sentry.EnumC1929n;
import io.sentry.ILogger;
import io.sentry.config.AbstractC1856a;
import io.sentry.transport.C2021p;
import java.io.File;

/* JADX INFO: renamed from: id */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1542id implements InterfaceC0566N6 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f5438a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5439b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5440c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f5441d;

    public /* synthetic */ C1542id(Object r1, Object r2, Object r3, Object r4) {
        this.f5438a = r1;
        this.f5439b = r2;
        this.f5440c = r3;
        this.f5441d = r4;
    }

    /* JADX INFO: renamed from: a */
    public void m2956a() {
        ILogger r2 = (ILogger) this.f5438a;
        String r3 = (String) this.f5439b;
        AbstractC2052w r0 = (AbstractC2052w) this.f5440c;
        File r4 = (File) this.f5441d;
        EnumC1657a2 r5 = EnumC1657a2.DEBUG;
        r2.mo3680e(r5, "Started processing cached files from %s", new Object[]{r3});
        C1609M2 r13 = r0.f7274d;
        ILogger r6 = r0.f7272b;
        r6.mo3680e(r5, "Processing dir. %s", new Object[]{r4.getAbsolutePath()});     // Catch: Throwable -> L6
        if (r4.exists() == true) goto L9;
        r6.mo3680e(EnumC1657a2.WARNING, "Directory '%s' doesn't exist. No cached events to send.", new Object[]{r4.getAbsolutePath()});     // Catch: Throwable -> L6
    L34:
        r2.mo3680e(EnumC1657a2.DEBUG, "Finished processing cached files from %s", new Object[]{r3});
        return;
    L9:
        if (r4.isDirectory() == true) goto L11;
        r6.mo3680e(EnumC1657a2.ERROR, "Cache dir %s is not a directory.", new Object[]{r4.getAbsolutePath()});     // Catch: Throwable -> L6
        goto L34
    L11:
        File[] r7 = r4.listFiles();     // Catch: Throwable -> L6
        if (r7 != null) goto L14;
        r6.mo3680e(EnumC1657a2.ERROR, "Cache dir %s is null.", new Object[]{r4.getAbsolutePath()});     // Catch: Throwable -> L6
        goto L34
    L14:
        File[] r8 = r4.listFiles(new C2025u(0, r0));     // Catch: Throwable -> L6
        int r14 = 0;
        if (r8 == null) goto L17;
        int r82 = r8.length;     // Catch: Throwable -> L6
    L18:
        r6.mo3680e(r5, "Processing %d items from cache dir %s", new Object[]{Integer.valueOf(r82), r4.getAbsolutePath()});     // Catch: Throwable -> L6
        int r52 = r7.length;     // Catch: Throwable -> L6
        int r15 = 0;
    L19:
        if (r15 >= r52) goto L34;
        File r83 = r7[r15];     // Catch: Throwable -> L6
        if (r83.isFile() == true) goto L23;
        r6.mo3680e(EnumC1657a2.DEBUG, "File %s is not a File.", new Object[]{r83.getAbsolutePath()});     // Catch: Throwable -> L6
    L32:
        r15 = r15 + 1;
        r14 = 0;
        goto L19
    L23:
        String r12 = r83.getAbsolutePath();     // Catch: Throwable -> L6
        if (r13.contains(r12) == false) goto L26;
        r6.mo3680e(EnumC1657a2.DEBUG, "File '%s' has already been processed so it will not be processed again.", new Object[]{r12});     // Catch: Throwable -> L6
        goto L32
    L26:
        C2021p r9 = r0.f7271a.mo3709c();     // Catch: Throwable -> L6
        if (r9 != null) goto L29;
    L31:
        r6.mo3680e(EnumC1657a2.DEBUG, "Processing file: %s", new Object[]{r12});     // Catch: Throwable -> L6
        r0.mo3588b(r83, AbstractC1856a.m4059e(new C2043v(r0.f7273c, r0.f7272b, r12, r13)));     // Catch: Throwable -> L6
        Thread.sleep(100);     // Catch: Throwable -> L6
        goto L32
    L29:
        if (r9.m4170f(EnumC1929n.All) == false) goto L31;
        r6.mo3680e(EnumC1657a2.INFO, "DirectoryProcessor, rate limiting active.", new Object[r14]);     // Catch: Throwable -> L6
        goto L34
    L17:
        r82 = 0;
    L6:
        th = move-exception;
        r6.mo3682n(EnumC1657a2.ERROR, th, "Failed processing '%s'", new Object[]{r4.getAbsolutePath()});
        goto L34
    }

    @Override // p000.InterfaceC0566N6
    public void onCancel() {
        View r0 = (View) this.f5438a;
        C2276nd r1 = (C2276nd) this.f5439b;
        C2099jd r2 = (C2099jd) this.f5440c;
        C0557My r3 = (C0557My) this.f5441d;
        r0.clearAnimation();
        r1.f8009a.endViewTransition(r0);
        r2.m78d();
        if (AbstractC2805zi.m5374G(2) == false) goto L6;
        r3.toString();
        return;
    }
}
