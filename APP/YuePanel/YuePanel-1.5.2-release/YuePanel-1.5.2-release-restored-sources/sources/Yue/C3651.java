package Yue;

import com.google.common.util.concurrent.ListenableFuture;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: renamed from: Yue.ۥۣ۟ۧ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
public final class C3651 {

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ */
    public static final class C0211<T> {

        /* JADX INFO: renamed from: ۥ */
        public Object f440;

        /* JADX INFO: renamed from: ۥ۟ */
        public C3653<T> f441;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public C7120<Void> f6457 = C7120.m22230();

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean f6458;

        public void finalize() {
            C7120<Void> c7120;
            C3653<T> c3653 = this.f441;
            if (c3653 != null && !c3653.isDone()) {
                c3653.m9985(new C0212("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f440));
            }
            if (this.f6458 || (c7120 = this.f6457) == null) {
                return;
            }
            c7120.mo5833(null);
        }

        /* JADX INFO: renamed from: ۥ */
        public void m719(@InterfaceC6391 Runnable runnable, @InterfaceC6391 Executor executor) {
            C7120<Void> c7120 = this.f6457;
            if (c7120 != null) {
                c7120.addListener(runnable, executor);
            }
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public void m720() {
            this.f440 = null;
            this.f441 = null;
            this.f6457.mo5833(null);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m9981(T t) {
            this.f6458 = true;
            C3653<T> c3653 = this.f441;
            boolean z = c3653 != null && c3653.m723(t);
            if (z) {
                m9983();
            }
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
        public boolean m9982() {
            this.f6458 = true;
            C3653<T> c3653 = this.f441;
            boolean z = c3653 != null && c3653.m722(true);
            if (z) {
                m9983();
            }
            return z;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
        public final void m9983() {
            this.f440 = null;
            this.f441 = null;
            this.f6457 = null;
        }

        /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
        public boolean m9984(@InterfaceC6391 Throwable th) {
            this.f6458 = true;
            C3653<T> c3653 = this.f441;
            boolean z = c3653 != null && c3653.m9985(th);
            if (z) {
                m9983();
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟ */
    public static final class C0212 extends Throwable {
        public C0212(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟۟, reason: contains not printable characters */
    public interface InterfaceC3652<T> {
        @InterfaceC6490
        /* JADX INFO: renamed from: ۥ */
        Object m721(@InterfaceC6391 C0211<T> c0211) throws Exception;
    }

    /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟۟۟, reason: contains not printable characters */
    public static final class C3653<T> implements ListenableFuture<T> {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        public final WeakReference<C0211<T>> f6459;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        public final AbstractC3000<T> f6460 = new C0213();

        /* JADX INFO: renamed from: Yue.ۥۣ۟ۧ$ۥ۟۟۟$ۥ */
        public class C0213 extends AbstractC3000<T> {
            public C0213() {
            }

            @Override // Yue.AbstractC3000
            /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
            public String mo5830() {
                C0211<T> c0211 = C3653.this.f6459.get();
                if (c0211 == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + c0211.f440 + "]";
            }
        }

        public C3653(C0211<T> c0211) {
            this.f6459 = new WeakReference<>(c0211);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(@InterfaceC6391 Runnable runnable, @InterfaceC6391 Executor executor) {
            this.f6460.addListener(runnable, executor);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            C0211<T> c0211 = this.f6459.get();
            boolean zCancel = this.f6460.cancel(z);
            if (zCancel && c0211 != null) {
                c0211.m720();
            }
            return zCancel;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f6460.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f6460.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f6460.isDone();
        }

        public String toString() {
            return this.f6460.toString();
        }

        /* JADX INFO: renamed from: ۥ */
        public boolean m722(boolean z) {
            return this.f6460.cancel(z);
        }

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean m723(T t) {
            return this.f6460.mo5833(t);
        }

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public boolean m9985(Throwable th) {
            return this.f6460.mo5834(th);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        @Override // java.util.concurrent.Future
        public T get(long j, @InterfaceC6391 TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f6460.get(j, timeUnit);
        }
    }

    @InterfaceC6391
    /* JADX INFO: renamed from: ۥ */
    public static <T> ListenableFuture<T> m718(@InterfaceC6391 InterfaceC3652<T> interfaceC3652) {
        C0211<T> c0211 = new C0211<>();
        C3653<T> c3653 = new C3653<>(c0211);
        c0211.f441 = c3653;
        c0211.f440 = interfaceC3652.getClass();
        try {
            Object objM721 = interfaceC3652.m721(c0211);
            if (objM721 != null) {
                c0211.f440 = objM721;
            }
        } catch (Exception e) {
            c3653.m9985(e);
        }
        return c3653;
    }
}
