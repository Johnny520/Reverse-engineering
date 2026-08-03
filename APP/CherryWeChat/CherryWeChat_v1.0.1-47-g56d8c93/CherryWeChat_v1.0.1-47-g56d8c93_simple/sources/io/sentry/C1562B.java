package io.sentry;

import io.sentry.config.AbstractC1856a;
import io.sentry.hints.InterfaceC1888f;
import io.sentry.hints.InterfaceC1889g;
import io.sentry.internal.debugmeta.C1901c;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: io.sentry.B */
/* JADX INFO: loaded from: classes.dex */
public final class C1562B extends AbstractC2052w {

    /* JADX INFO: renamed from: e */
    public final InterfaceC1651Z f5597e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC1866e0 f5598f;

    /* JADX INFO: renamed from: g */
    public final ILogger f5599g;

    public C1562B(InterfaceC1651Z r7, InterfaceC1866e0 r8, ILogger r9, long r10, int r12) {
        super(r7, r9, r10, r12);
        AbstractC1856a.m4048D("Scopes are required.", r7);
        this.f5597e = r7;
        AbstractC1856a.m4048D("Serializer is required.", r8);
        this.f5598f = r8;
        AbstractC1856a.m4048D("Logger is required.", r9);
        this.f5599g = r9;
    }

    /* JADX INFO: renamed from: c */
    public static void m3586c(C1562B r4, File r5, InterfaceC1889g r6) {
        ILogger r42 = r4.f5599g;
        if (r6.mo3846a() == false) goto L15;
        r42.mo3680e(EnumC1657a2.INFO, "File not deleted since retry was marked. %s.", new Object[]{r5.getAbsolutePath()});
        return;
    L15:
    L9:
        th = move-exception;
        r42.mo3682n(EnumC1657a2.ERROR, th, "Failed to delete '%s' %s", new Object[]{r5.getAbsolutePath(), "after trying to capture it"});
    L11:
        r42.mo3680e(EnumC1657a2.DEBUG, "Deleted file %s.", new Object[]{r5.getAbsolutePath()});
        return;
    L6:
        if (r5.delete() == true) goto L11;
        r42.mo3680e(EnumC1657a2.ERROR, "Failed to delete '%s' %s", new Object[]{r5.getAbsolutePath(), "after trying to capture it"});     // Catch: Throwable -> L9
        goto L11
    }

    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: a */
    public final boolean mo3587a(String r2) {
        return r2.endsWith(".envelope");
    }

    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: b */
    public final void mo3588b(File r8, C1586H r9) {
        boolean r1 = r8.isFile();
        ILogger r2 = this.f5599g;
        if (r1 == true) goto L7;
        r2.mo3680e(EnumC1657a2.DEBUG, "'%s' is not a file.", new Object[]{r8.getAbsolutePath()});
        return;
    L7:
        if (r8.getName().endsWith(".envelope") == true) goto L11;
        r2.mo3680e(EnumC1657a2.DEBUG, "File '%s' doesn't match extension expected.", new Object[]{r8.getAbsolutePath()});
        return;
    L11:
        if (r8.getParentFile().canWrite() == true) goto L80;
        r2.mo3680e(EnumC1657a2.WARNING, "File '%s' cannot be deleted so it will not be processed.", new Object[]{r8.getAbsolutePath()});
        return;
    L80:
        BufferedInputStream r3 = new BufferedInputStream(new FileInputStream(r8));     // Catch: Throwable -> L37 IOException -> L39 FileNotFoundException -> L41
        C1901c r4 = this.f5598f.mo3609c(r3);     // Catch: Throwable -> L19
        if (r4 != null) goto L21;
        r2.mo3680e(EnumC1657a2.ERROR, "Failed to deserialize cached envelope %s", new Object[]{r8.getAbsolutePath()});     // Catch: Throwable -> L19
    L22:
        Object r5 = AbstractC1856a.m4072s(r9);     // Catch: Throwable -> L19
        if (InterfaceC1888f.class.isInstance(AbstractC1856a.m4072s(r9)) == false) goto L28;
        if (r5 == null) goto L28;
        if (((InterfaceC1888f) r5).mo3849d() == true) goto L29;
        r2.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for envelope submission.", new Object[0]);     // Catch: Throwable -> L19
    L29:
        r3.close();     // Catch: Throwable -> L37 IOException -> L39 FileNotFoundException -> L41
        Object r12 = AbstractC1856a.m4072s(r9);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r9)) == false) goto L35;
        if (r12 == null) goto L35;
        m3586c(this, r8, (InterfaceC1889g) r12);
        return;
    L35:
        AbstractC1856a.m4078z(InterfaceC1889g.class, r12, r2);
        return;
    L28:
        AbstractC1856a.m4078z(InterfaceC1888f.class, r5, r2);     // Catch: Throwable -> L19
        goto L29
    L21:
        this.f5597e.mo3713g(r4, r9);     // Catch: Throwable -> L19
    L19:
        th = move-exception;
        r3.close();     // Catch: Throwable -> L45
    L47:
        throw th;     // Catch: Throwable -> L37 IOException -> L39 FileNotFoundException -> L41
    L45:
        th = move-exception;
        th.addSuppressed(th);     // Catch: Throwable -> L37 IOException -> L39 FileNotFoundException -> L41
    L58:
        th = move-exception;
        Object r32 = AbstractC1856a.m4072s(r9);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r9)) == false) goto L75;
        if (r32 == null) goto L75;
        m3586c(this, r8, (InterfaceC1889g) r32);
    L76:
        throw th;
    L75:
        AbstractC1856a.m4078z(InterfaceC1889g.class, r32, r2);
    L41:
        e = move-exception;
        r2.mo3682n(EnumC1657a2.ERROR, e, "File '%s' cannot be found.", new Object[]{r8.getAbsolutePath()});     // Catch: Throwable -> L58
        Object r13 = AbstractC1856a.m4072s(r9);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r9)) == true) goto L68;
    L57:
        AbstractC1856a.m4078z(InterfaceC1889g.class, r13, r2);
        return;
    L68:
        if (r13 == null) goto L57;
    L56:
        m3586c(this, r8, (InterfaceC1889g) r13);
        return;
    L39:
        e = move-exception;
        r2.mo3682n(EnumC1657a2.ERROR, e, "I/O on file '%s' failed.", new Object[]{r8.getAbsolutePath()});     // Catch: Throwable -> L58
        r13 = AbstractC1856a.m4072s(r9);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r9)) == false) goto L57;
        if (r13 == null) goto L57;
    L37:
        th = move-exception;
        r2.mo3682n(EnumC1657a2.ERROR, th, "Failed to capture cached envelope %s", new Object[]{r8.getAbsolutePath()});     // Catch: Throwable -> L58
        Object r42 = AbstractC1856a.m4072s(r9);     // Catch: Throwable -> L58
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r9)) == false) goto L52;
        if (r42 == null) goto L52;
        ((InterfaceC1889g) r42).mo3850e(false);     // Catch: Throwable -> L58
        r2.mo3682n(EnumC1657a2.INFO, th, "File '%s' won't retry.", new Object[]{r8.getAbsolutePath()});     // Catch: Throwable -> L58
    L53:
        r13 = AbstractC1856a.m4072s(r9);
        if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(r9)) == false) goto L57;
        if (r13 == null) goto L57;
    L52:
        AbstractC1856a.m4078z(InterfaceC1889g.class, r42, r2);     // Catch: Throwable -> L58
        goto L53
    }
}
