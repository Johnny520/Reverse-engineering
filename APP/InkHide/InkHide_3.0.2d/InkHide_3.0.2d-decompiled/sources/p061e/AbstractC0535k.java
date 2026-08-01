package p061e;

import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p075l.C0745c;
import p075l.C0749g;

/* JADX INFO: renamed from: e.k */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0535k {

    /* JADX INFO: renamed from: b */
    public static final C0745c f1755b = new C0745c();

    /* JADX INFO: renamed from: c */
    public static final Object f1756c = new Object();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m1082e(LayoutInflaterFactory2C0545u layoutInflaterFactory2C0545u) {
        synchronized (f1756c) {
            try {
                Iterator it = f1755b.iterator();
                while (true) {
                    C0749g c0749g = (C0749g) it;
                    if (c0749g.hasNext()) {
                        AbstractC0535k abstractC0535k = (AbstractC0535k) ((WeakReference) c0749g.next()).get();
                        if (abstractC0535k == layoutInflaterFactory2C0545u || abstractC0535k == null) {
                            c0749g.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo1083a();

    /* JADX INFO: renamed from: b */
    public abstract void mo1084b();

    /* JADX INFO: renamed from: c */
    public abstract void mo1085c();

    /* JADX INFO: renamed from: d */
    public abstract void mo1086d();

    /* JADX INFO: renamed from: h */
    public abstract boolean mo1087h(int i2);

    /* JADX INFO: renamed from: i */
    public abstract void mo1088i(int i2);

    /* JADX INFO: renamed from: j */
    public abstract void mo1089j(View view);

    /* JADX INFO: renamed from: k */
    public abstract void mo1090k(View view, ViewGroup.LayoutParams layoutParams);

    /* JADX INFO: renamed from: l */
    public abstract void mo1091l(CharSequence charSequence);
}
