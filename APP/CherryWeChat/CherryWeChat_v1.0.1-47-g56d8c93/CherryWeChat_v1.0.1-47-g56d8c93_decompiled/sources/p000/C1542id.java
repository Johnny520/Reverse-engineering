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

    public /* synthetic */ C1542id(Object obj, Object obj2, Object obj3, Object obj4) {
        this.f5438a = obj;
        this.f5439b = obj2;
        this.f5440c = obj3;
        this.f5441d = obj4;
    }

    /* JADX INFO: renamed from: a */
    public void m2956a() {
        ILogger iLogger = (ILogger) this.f5438a;
        String str = (String) this.f5439b;
        AbstractC2052w abstractC2052w = (AbstractC2052w) this.f5440c;
        File file = (File) this.f5441d;
        EnumC1657a2 enumC1657a2 = EnumC1657a2.DEBUG;
        iLogger.mo3680e(enumC1657a2, "Started processing cached files from %s", str);
        C1609M2 c1609m2 = abstractC2052w.f7274d;
        ILogger iLogger2 = abstractC2052w.f7272b;
        try {
            iLogger2.mo3680e(enumC1657a2, "Processing dir. %s", file.getAbsolutePath());
            if (!file.exists()) {
                iLogger2.mo3680e(EnumC1657a2.WARNING, "Directory '%s' doesn't exist. No cached events to send.", file.getAbsolutePath());
            } else if (file.isDirectory()) {
                File[] fileArrListFiles = file.listFiles();
                if (fileArrListFiles != null) {
                    File[] fileArrListFiles2 = file.listFiles(new C2025u(0, abstractC2052w));
                    int i = 0;
                    iLogger2.mo3680e(enumC1657a2, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles2 != null ? fileArrListFiles2.length : 0), file.getAbsolutePath());
                    int length = fileArrListFiles.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        File file2 = fileArrListFiles[i2];
                        if (file2.isFile()) {
                            String absolutePath = file2.getAbsolutePath();
                            if (!c1609m2.contains(absolutePath)) {
                                C2021p c2021pMo3709c = abstractC2052w.f7271a.mo3709c();
                                if (c2021pMo3709c != null && c2021pMo3709c.m4170f(EnumC1929n.All)) {
                                    iLogger2.mo3680e(EnumC1657a2.INFO, "DirectoryProcessor, rate limiting active.", new Object[i]);
                                    break;
                                } else {
                                    iLogger2.mo3680e(EnumC1657a2.DEBUG, "Processing file: %s", absolutePath);
                                    abstractC2052w.mo3588b(file2, AbstractC1856a.m4059e(new C2043v(abstractC2052w.f7273c, abstractC2052w.f7272b, absolutePath, c1609m2)));
                                    Thread.sleep(100L);
                                }
                            } else {
                                iLogger2.mo3680e(EnumC1657a2.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                            }
                        } else {
                            iLogger2.mo3680e(EnumC1657a2.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                        }
                        i2++;
                        i = 0;
                    }
                } else {
                    iLogger2.mo3680e(EnumC1657a2.ERROR, "Cache dir %s is null.", file.getAbsolutePath());
                }
            } else {
                iLogger2.mo3680e(EnumC1657a2.ERROR, "Cache dir %s is not a directory.", file.getAbsolutePath());
            }
        } catch (Throwable th) {
            iLogger2.mo3682n(EnumC1657a2.ERROR, th, "Failed processing '%s'", file.getAbsolutePath());
        }
        iLogger.mo3680e(EnumC1657a2.DEBUG, "Finished processing cached files from %s", str);
    }

    @Override // p000.InterfaceC0566N6
    public void onCancel() {
        View view = (View) this.f5438a;
        C2276nd c2276nd = (C2276nd) this.f5439b;
        C2099jd c2099jd = (C2099jd) this.f5440c;
        C0557My c0557My = (C0557My) this.f5441d;
        view.clearAnimation();
        c2276nd.f8009a.endViewTransition(view);
        c2099jd.m78d();
        if (AbstractC2805zi.m5374G(2)) {
            c0557My.toString();
        }
    }
}
