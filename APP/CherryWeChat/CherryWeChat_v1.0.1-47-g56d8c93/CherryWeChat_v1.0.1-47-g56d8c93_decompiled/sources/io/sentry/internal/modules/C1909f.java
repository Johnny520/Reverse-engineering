package io.sentry.internal.modules;

import android.content.Context;
import io.sentry.EnumC1657a2;
import io.sentry.ILogger;
import io.sentry.RunnableC1631S1;
import io.sentry.config.AbstractC1856a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: renamed from: io.sentry.internal.modules.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1909f extends AbstractC1907d {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f6797e = 1;

    /* JADX INFO: renamed from: f */
    public final Object f6798f;

    public C1909f(List list, ILogger iLogger) {
        super(iLogger);
        this.f6798f = list;
    }

    @Override // io.sentry.internal.modules.AbstractC1907d
    /* JADX INFO: renamed from: b */
    public final Map mo4117b() {
        switch (this.f6797e) {
            case 0:
                ILogger iLogger = this.f6793a;
                TreeMap treeMap = new TreeMap();
                try {
                    InputStream resourceAsStream = ((ClassLoader) this.f6798f).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (resourceAsStream == null) {
                            iLogger.mo3680e(EnumC1657a2.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (resourceAsStream != null) {
                                resourceAsStream.close();
                            }
                        } else {
                            TreeMap treeMapM4118c = m4118c(resourceAsStream);
                            resourceAsStream.close();
                            treeMap = treeMapM4118c;
                        }
                    } catch (Throwable th) {
                        if (resourceAsStream != null) {
                            try {
                                resourceAsStream.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            break;
                        }
                        throw th;
                    }
                    break;
                } catch (IOException e) {
                    iLogger.mo3683r(EnumC1657a2.INFO, "Access to resources failed.", e);
                } catch (SecurityException e2) {
                    iLogger.mo3683r(EnumC1657a2.INFO, "Access to resources denied.", e2);
                }
                return treeMap;
            case 1:
                ILogger iLogger2 = this.f6793a;
                TreeMap treeMap2 = new TreeMap();
                try {
                    InputStream inputStreamOpen = ((Context) this.f6798f).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap treeMapM4118c2 = m4118c(inputStreamOpen);
                        if (inputStreamOpen != null) {
                            inputStreamOpen.close();
                        }
                        return treeMapM4118c2;
                    } finally {
                        if (inputStreamOpen != null) {
                            try {
                                break;
                            } catch (Throwable th3) {
                            }
                        }
                    }
                } catch (FileNotFoundException unused) {
                    iLogger2.mo3680e(EnumC1657a2.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap2;
                } catch (IOException e3) {
                    iLogger2.mo3683r(EnumC1657a2.ERROR, "Error extracting modules.", e3);
                    return treeMap2;
                }
            default:
                TreeMap treeMap3 = new TreeMap();
                Iterator it = ((List) this.f6798f).iterator();
                while (it.hasNext()) {
                    Map mapMo4116a = ((InterfaceC1904a) it.next()).mo4116a();
                    if (mapMo4116a != null) {
                        treeMap3.putAll(mapMo4116a);
                    }
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1909f(ILogger iLogger) {
        super(iLogger);
        ClassLoader classLoader = C1909f.class.getClassLoader();
        this.f6798f = AbstractC1856a.m4058d(classLoader);
    }

    public C1909f(Context context, ILogger iLogger) {
        super(iLogger);
        Context applicationContext = context.getApplicationContext();
        this.f6798f = applicationContext != null ? applicationContext : context;
        new Thread(new RunnableC1631S1(7, this)).start();
    }
}
