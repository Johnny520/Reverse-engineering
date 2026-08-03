package p000a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: renamed from: a.je */
/* JADX INFO: loaded from: classes.dex */
public final class C0655je {

    /* JADX INFO: renamed from: b */
    public static C0655je f2459b;

    /* JADX INFO: renamed from: a */
    public final Object f2460a = new Object();

    /* JADX INFO: renamed from: a.je$a */
    public class a implements Handler.Callback {
        public a() {
        }

        @Override // android.os.Handler.Callback
        public final boolean handleMessage(Message message) {
            if (message.what != 0) {
                return false;
            }
            C0655je c0655je = C0655je.this;
            b bVar = (b) message.obj;
            synchronized (c0655je.f2460a) {
                try {
                    if (bVar == null || bVar == null) {
                        bVar.getClass();
                        throw null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: a.je$b */
    public static class b {
    }

    public C0655je() {
        new Handler(Looper.getMainLooper(), new a());
    }

    /* JADX INFO: renamed from: a */
    public static C0655je m1519a() {
        if (f2459b == null) {
            f2459b = new C0655je();
        }
        return f2459b;
    }
}
