package io.sentry;

import android.graphics.Bitmap;
import io.sentry.android.core.C1667J;
import io.sentry.android.core.C1670M;
import io.sentry.android.core.ScreenshotEventProcessor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.clientreport.C1851b;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.concurrent.Callable;

/* JADX INFO: renamed from: io.sentry.K1 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class CallableC1600K1 implements Callable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f5777a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f5778b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f5779c;

    public /* synthetic */ CallableC1600K1(int i, Object obj, Object obj2) {
        this.f5777a = i;
        this.f5778b = obj;
        this.f5779c = obj2;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        BufferedWriter bufferedWriter;
        switch (this.f5777a) {
            case 0:
                InterfaceC1866e0 interfaceC1866e0 = (InterfaceC1866e0) this.f5778b;
                C1581F2 c1581f2 = (C1581F2) this.f5779c;
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream2, C1620P1.f5821d));
                    try {
                        interfaceC1866e0.mo3610d(c1581f2, bufferedWriter2);
                        byte[] byteArray = byteArrayOutputStream2.toByteArray();
                        bufferedWriter2.close();
                        byteArrayOutputStream2.close();
                        return byteArray;
                    } finally {
                        try {
                            bufferedWriter2.close();
                            break;
                        } catch (Throwable th) {
                            th.addSuppressed(th);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream2.close();
                        break;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
            case 1:
                InterfaceC1866e0 interfaceC1866e02 = (InterfaceC1866e0) this.f5778b;
                AbstractC1568C1 abstractC1568C1 = (AbstractC1568C1) this.f5779c;
                ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                try {
                    BufferedWriter bufferedWriter3 = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream3, C1620P1.f5821d));
                    try {
                        interfaceC1866e02.mo3610d(abstractC1568C1, bufferedWriter3);
                        byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                        bufferedWriter3.close();
                        byteArrayOutputStream3.close();
                        return byteArray2;
                    } finally {
                        try {
                            bufferedWriter3.close();
                            break;
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    }
                } finally {
                    try {
                        byteArrayOutputStream3.close();
                        break;
                    } catch (Throwable th4) {
                        th.addSuppressed(th4);
                    }
                }
            case 2:
                InterfaceC1866e0 interfaceC1866e03 = (InterfaceC1866e0) this.f5778b;
                C1851b c1851b = (C1851b) this.f5779c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C1620P1.f5821d));
                    try {
                        interfaceC1866e03.mo3610d(c1851b, bufferedWriter);
                        byte[] byteArray3 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray3;
                    } finally {
                        try {
                            bufferedWriter.close();
                            break;
                        } catch (Throwable th5) {
                            th.addSuppressed(th5);
                        }
                    }
                } finally {
                    try {
                        break;
                    } catch (Throwable th6) {
                    }
                }
            case 3:
                InterfaceC1866e0 interfaceC1866e04 = (InterfaceC1866e0) this.f5778b;
                C1864d2 c1864d2 = (C1864d2) this.f5779c;
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, C1620P1.f5821d));
                    try {
                        interfaceC1866e04.mo3610d(c1864d2, bufferedWriter);
                        byte[] byteArray4 = byteArrayOutputStream.toByteArray();
                        bufferedWriter.close();
                        byteArrayOutputStream.close();
                        return byteArray4;
                    } finally {
                        try {
                            break;
                        } catch (Throwable th52) {
                        }
                    }
                } finally {
                    try {
                        break;
                    } catch (Throwable th62) {
                    }
                }
            case 4:
                C1667J c1667j = (C1667J) this.f5778b;
                return C1670M.m3842c(c1667j.f5975a, (SentryAndroidOptions) this.f5779c);
            default:
                ScreenshotEventProcessor screenshotEventProcessor = (ScreenshotEventProcessor) this.f5778b;
                Bitmap bitmap = (Bitmap) this.f5779c;
                ILogger logger = screenshotEventProcessor.f6009a.getLogger();
                byte[] bArr = null;
                if (!bitmap.isRecycled()) {
                    try {
                        ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                        try {
                            bitmap.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream4);
                            bitmap.recycle();
                            if (byteArrayOutputStream4.size() <= 0) {
                                logger.mo3680e(EnumC1657a2.DEBUG, "Screenshot is 0 bytes, not attaching the image.", new Object[0]);
                                byteArrayOutputStream4.close();
                            } else {
                                byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                bArr = byteArray5;
                            }
                        } finally {
                            try {
                                break;
                            } catch (Throwable th7) {
                            }
                        }
                    } catch (Throwable th8) {
                        logger.mo3683r(EnumC1657a2.ERROR, "Compressing bitmap failed.", th8);
                    }
                    break;
                }
                return bArr;
        }
    }
}
