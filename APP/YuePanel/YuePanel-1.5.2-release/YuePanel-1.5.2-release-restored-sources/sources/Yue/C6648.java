package Yue;

import Yue.InterfaceC7144;
import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C6648 {

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ */
    @InterfaceC7113(23)
    public static class C1043 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static void m3124(@InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, @InterfaceC6490 PendingIntent.OnFinished onFinished, @InterfaceC6490 Handler handler, @InterfaceC6490 String str, @InterfaceC6490 Bundle bundle) throws PendingIntent.CanceledException {
            pendingIntent.send(context, i, intent, onFinished, handler, str, bundle);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ۟ */
    @InterfaceC7113(26)
    public static class C1044 {
        @InterfaceC4482
        /* JADX INFO: renamed from: ۥ */
        public static PendingIntent m3125(Context context, int i, Intent intent, int i2) {
            return PendingIntent.getForegroundService(context, i, intent, i2);
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ۟۟, reason: contains not printable characters */
    @InterfaceC7144({InterfaceC7144.EnumC1188.LIBRARY})
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC6649 {
    }

    /* JADX INFO: renamed from: Yue.ۥۡۤ۟ۨ$ۥ۟۟۟, reason: contains not printable characters */
    public static class C6650 implements Closeable {

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6490
        public PendingIntent.OnFinished f17084;

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final CountDownLatch f17083 = new CountDownLatch(1);

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f17085 = false;

        public C6650(@InterfaceC6490 PendingIntent.OnFinished onFinished) {
            this.f17084 = onFinished;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f17085) {
                this.f17084 = null;
            }
            this.f17083.countDown();
        }

        public void complete() {
            this.f17085 = true;
        }

        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public PendingIntent.OnFinished m21261() {
            if (this.f17084 == null) {
                return null;
            }
            return new PendingIntent.OnFinished() { // from class: Yue.ۥۡۤ۠
                @Override // android.app.PendingIntent.OnFinished
                public final void onSendFinished(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
                    this.f2207.m21262(pendingIntent, intent, i, str, bundle);
                }
            };
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public final void m21262(PendingIntent pendingIntent, Intent intent, int i, String str, Bundle bundle) {
            boolean z = false;
            while (true) {
                try {
                    this.f17083.await();
                    break;
                } catch (InterruptedException unused) {
                    z = true;
                } catch (Throwable th) {
                    if (z) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (z) {
                Thread.currentThread().interrupt();
            }
            PendingIntent.OnFinished onFinished = this.f17084;
            if (onFinished != null) {
                onFinished.onSendFinished(pendingIntent, intent, i, str, bundle);
                this.f17084 = null;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public static int m3122(boolean z, int i) {
        int i2;
        if (!z) {
            i2 = 67108864;
        } else {
            if (Build.VERSION.SDK_INT < 31) {
                return i;
            }
            i2 = 33554432;
        }
        return i | i2;
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟ */
    public static PendingIntent m3123(@InterfaceC6391 Context context, int i, @InterfaceC6391 @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i2, @InterfaceC6490 Bundle bundle, boolean z) {
        return PendingIntent.getActivities(context, i, intentArr, m3122(z, i2), bundle);
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static PendingIntent m21252(@InterfaceC6391 Context context, int i, @InterfaceC6391 @SuppressLint({"ArrayReturn"}) Intent[] intentArr, int i2, boolean z) {
        return PendingIntent.getActivities(context, i, intentArr, m3122(z, i2));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static PendingIntent m21253(@InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, int i2, @InterfaceC6490 Bundle bundle, boolean z) {
        return PendingIntent.getActivity(context, i, intent, m3122(z, i2), bundle);
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static PendingIntent m21254(@InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, int i2, boolean z) {
        return PendingIntent.getActivity(context, i, intent, m3122(z, i2));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static PendingIntent m21255(@InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, int i2, boolean z) {
        return PendingIntent.getBroadcast(context, i, intent, m3122(z, i2));
    }

    @InterfaceC6391
    @InterfaceC7113(26)
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static PendingIntent m21256(@InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, int i2, boolean z) {
        return C1044.m3125(context, i, intent, m3122(z, i2));
    }

    @InterfaceC6490
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static PendingIntent m21257(@InterfaceC6391 Context context, int i, @InterfaceC6391 Intent intent, int i2, boolean z) {
        return PendingIntent.getService(context, i, intent, m3122(z, i2));
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static void m21258(@InterfaceC6391 PendingIntent pendingIntent, int i, @InterfaceC6490 PendingIntent.OnFinished onFinished, @InterfaceC6490 Handler handler) throws PendingIntent.CanceledException {
        C6650 c6650 = new C6650(onFinished);
        try {
            pendingIntent.send(i, c6650.m21261(), handler);
            c6650.complete();
            c6650.close();
        } catch (Throwable th) {
            try {
                c6650.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static void m21259(@InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 @SuppressLint({"ContextFirst"}) Context context, int i, @InterfaceC6391 Intent intent, @InterfaceC6490 PendingIntent.OnFinished onFinished, @InterfaceC6490 Handler handler) throws PendingIntent.CanceledException {
        m21260(pendingIntent, context, i, intent, onFinished, handler, null, null);
    }

    @SuppressLint({"LambdaLast"})
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static void m21260(@InterfaceC6391 PendingIntent pendingIntent, @InterfaceC6391 @SuppressLint({"ContextFirst"}) Context context, int i, @InterfaceC6391 Intent intent, @InterfaceC6490 PendingIntent.OnFinished onFinished, @InterfaceC6490 Handler handler, @InterfaceC6490 String str, @InterfaceC6490 Bundle bundle) throws PendingIntent.CanceledException {
        C6650 c6650 = new C6650(onFinished);
        try {
            C1043.m3124(pendingIntent, context, i, intent, onFinished, handler, str, bundle);
            c6650.complete();
            c6650.close();
        } catch (Throwable th) {
            try {
                c6650.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
