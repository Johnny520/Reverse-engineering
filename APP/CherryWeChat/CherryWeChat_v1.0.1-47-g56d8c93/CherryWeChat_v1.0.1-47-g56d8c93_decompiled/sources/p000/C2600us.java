package p000;

import android.os.Looper;
import android.view.View;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: us */
/* JADX INFO: loaded from: classes.dex */
public class C2600us {

    /* JADX INFO: renamed from: j */
    public static final Object f8976j = new Object();

    /* JADX INFO: renamed from: a */
    public final Object f8977a = new Object();

    /* JADX INFO: renamed from: b */
    public final C1027Xw f8978b = new C1027Xw();

    /* JADX INFO: renamed from: c */
    public int f8979c = 0;

    /* JADX INFO: renamed from: d */
    public boolean f8980d;

    /* JADX INFO: renamed from: e */
    public volatile Object f8981e;

    /* JADX INFO: renamed from: f */
    public volatile Object f8982f;

    /* JADX INFO: renamed from: g */
    public int f8983g;

    /* JADX INFO: renamed from: h */
    public boolean f8984h;

    /* JADX INFO: renamed from: i */
    public boolean f8985i;

    public C2600us() {
        Object obj = f8976j;
        this.f8982f = obj;
        this.f8981e = obj;
        this.f8983g = -1;
    }

    /* JADX INFO: renamed from: a */
    public static void m5112a(String str) {
        C0005A4.m2X().f3f.getClass();
        if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            throw new IllegalStateException(AbstractC2374ph.m4814k("Cannot invoke ", str, " on a background thread"));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5113b(C0547Mo c0547Mo) {
        if (c0547Mo.f1768b) {
            int i = c0547Mo.f1769c;
            int i2 = this.f8983g;
            if (i >= i2) {
                return;
            }
            c0547Mo.f1769c = i2;
            C0132D2 c0132d2 = c0547Mo.f1767a;
            Object obj = this.f8981e;
            c0132d2.getClass();
            InterfaceC1061Yn interfaceC1061Yn = (InterfaceC1061Yn) obj;
            DialogInterfaceOnCancelListenerC0450Kd dialogInterfaceOnCancelListenerC0450Kd = (DialogInterfaceOnCancelListenerC0450Kd) c0132d2.f328b;
            if (interfaceC1061Yn == null || !dialogInterfaceOnCancelListenerC0450Kd.f1475Y) {
                return;
            }
            View viewM2879z = dialogInterfaceOnCancelListenerC0450Kd.m2879z();
            if (viewM2879z.getParent() != null) {
                throw new IllegalStateException("DialogFragment can not be attached to a container view");
            }
            if (dialogInterfaceOnCancelListenerC0450Kd.f1479c0 != null) {
                if (AbstractC2805zi.m5374G(3)) {
                    Objects.toString(dialogInterfaceOnCancelListenerC0450Kd.f1479c0);
                }
                dialogInterfaceOnCancelListenerC0450Kd.f1479c0.setContentView(viewM2879z);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5114c(C0547Mo c0547Mo) {
        if (this.f8984h) {
            this.f8985i = true;
            return;
        }
        this.f8984h = true;
        do {
            this.f8985i = false;
            if (c0547Mo != null) {
                m5113b(c0547Mo);
                c0547Mo = null;
            } else {
                C1027Xw c1027Xw = this.f8978b;
                c1027Xw.getClass();
                C0941Vw c0941Vw = new C0941Vw(c1027Xw);
                c1027Xw.f3271c.put(c0941Vw, Boolean.FALSE);
                while (c0941Vw.hasNext()) {
                    m5113b((C0547Mo) ((Map.Entry) c0941Vw.next()).getValue());
                    if (this.f8985i) {
                        break;
                    }
                }
            }
        } while (this.f8985i);
        this.f8984h = false;
    }

    /* JADX INFO: renamed from: d */
    public final void m5115d(Object obj) {
        m5112a("setValue");
        this.f8983g++;
        this.f8981e = obj;
        m5114c(null);
    }
}
