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

    public C1562B(InterfaceC1651Z interfaceC1651Z, InterfaceC1866e0 interfaceC1866e0, ILogger iLogger, long j, int i) {
        super(interfaceC1651Z, iLogger, j, i);
        AbstractC1856a.m4048D("Scopes are required.", interfaceC1651Z);
        this.f5597e = interfaceC1651Z;
        AbstractC1856a.m4048D("Serializer is required.", interfaceC1866e0);
        this.f5598f = interfaceC1866e0;
        AbstractC1856a.m4048D("Logger is required.", iLogger);
        this.f5599g = iLogger;
    }

    /* JADX INFO: renamed from: c */
    public static void m3586c(C1562B c1562b, File file, InterfaceC1889g interfaceC1889g) {
        ILogger iLogger = c1562b.f5599g;
        if (interfaceC1889g.mo3846a()) {
            iLogger.mo3680e(EnumC1657a2.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.delete()) {
                iLogger.mo3680e(EnumC1657a2.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
            }
        } catch (Throwable th) {
            iLogger.mo3682n(EnumC1657a2.ERROR, th, "Failed to delete '%s' %s", file.getAbsolutePath(), "after trying to capture it");
        }
        iLogger.mo3680e(EnumC1657a2.DEBUG, "Deleted file %s.", file.getAbsolutePath());
    }

    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: a */
    public final boolean mo3587a(String str) {
        return str.endsWith(".envelope");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0113, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0115, code lost:
    
        m3586c(r7, r8, (io.sentry.hints.InterfaceC1889g) r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x013e, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x015e, code lost:
    
        if (r1 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0161, code lost:
    
        return;
     */
    @Override // io.sentry.AbstractC2052w
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void mo3588b(File file, C1586H c1586h) {
        Object objM4072s;
        boolean zIsFile = file.isFile();
        ILogger iLogger = this.f5599g;
        if (!zIsFile) {
            iLogger.mo3680e(EnumC1657a2.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!file.getName().endsWith(".envelope")) {
            iLogger.mo3680e(EnumC1657a2.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        if (!file.getParentFile().canWrite()) {
            iLogger.mo3680e(EnumC1657a2.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
            return;
        }
        try {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    C1901c c1901cMo3609c = this.f5598f.mo3609c(bufferedInputStream);
                    if (c1901cMo3609c == null) {
                        iLogger.mo3680e(EnumC1657a2.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                    } else {
                        this.f5597e.mo3713g(c1901cMo3609c, c1586h);
                    }
                    Object objM4072s2 = AbstractC1856a.m4072s(c1586h);
                    if (!InterfaceC1888f.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s2 == null) {
                        AbstractC1856a.m4078z(InterfaceC1888f.class, objM4072s2, iLogger);
                    } else if (!((InterfaceC1888f) objM4072s2).mo3849d()) {
                        iLogger.mo3680e(EnumC1657a2.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
                    }
                    bufferedInputStream.close();
                } catch (Throwable th) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } finally {
                Object objM4072s3 = AbstractC1856a.m4072s(c1586h);
                if (!InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s3 == null) {
                    AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s3, iLogger);
                } else {
                    m3586c(this, file, (InterfaceC1889g) objM4072s3);
                }
            }
        } catch (FileNotFoundException e) {
            iLogger.mo3682n(EnumC1657a2.ERROR, e, "File '%s' cannot be found.", file.getAbsolutePath());
            objM4072s = AbstractC1856a.m4072s(c1586h);
            if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
            }
            AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s, iLogger);
        } catch (IOException e2) {
            iLogger.mo3682n(EnumC1657a2.ERROR, e2, "I/O on file '%s' failed.", file.getAbsolutePath());
            objM4072s = AbstractC1856a.m4072s(c1586h);
            if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
            }
            AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s, iLogger);
        } catch (Throwable th3) {
            iLogger.mo3682n(EnumC1657a2.ERROR, th3, "Failed to capture cached envelope %s", file.getAbsolutePath());
            Object objM4072s4 = AbstractC1856a.m4072s(c1586h);
            if (!InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h)) || objM4072s4 == null) {
                AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s4, iLogger);
            } else {
                ((InterfaceC1889g) objM4072s4).mo3850e(false);
                iLogger.mo3682n(EnumC1657a2.INFO, th3, "File '%s' won't retry.", file.getAbsolutePath());
            }
            objM4072s = AbstractC1856a.m4072s(c1586h);
            if (InterfaceC1889g.class.isInstance(AbstractC1856a.m4072s(c1586h))) {
            }
            AbstractC1856a.m4078z(InterfaceC1889g.class, objM4072s, iLogger);
        }
    }
}
