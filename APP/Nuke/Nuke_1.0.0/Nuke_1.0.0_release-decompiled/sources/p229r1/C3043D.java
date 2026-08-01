package p229r1;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import p010B3.AbstractC0228g;
import p154e2.C2023b;
import p205n1.C2688b;

/* JADX INFO: renamed from: r1.D */
/* JADX INFO: loaded from: classes.dex */
public final class C3043D extends WindowInsetsAnimation$Callback {

    /* JADX INFO: renamed from: a */
    public final AbstractC3094x f9732a;

    /* JADX INFO: renamed from: b */
    public List f9733b;

    /* JADX INFO: renamed from: c */
    public ArrayList f9734c;

    /* JADX INFO: renamed from: d */
    public final HashMap f9735d;

    public C3043D(AbstractC3094x abstractC3094x) {
        super(abstractC3094x.f9813d);
        this.f9735d = new HashMap();
        this.f9732a = abstractC3094x;
    }

    /* JADX INFO: renamed from: a */
    public final C3046G m5315a(WindowInsetsAnimation windowInsetsAnimation) {
        C3046G c3046g = (C3046G) this.f9735d.get(windowInsetsAnimation);
        if (c3046g != null) {
            return c3046g;
        }
        C3046G c3046g2 = new C3046G(0, null, 0L);
        c3046g2.f9741a = new C3044E(windowInsetsAnimation);
        this.f9735d.put(windowInsetsAnimation, c3046g2);
        return c3046g2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f9732a.mo681b(m5315a(windowInsetsAnimation));
        this.f9735d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f9732a.mo682c(m5315a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f9734c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f9734c = arrayList2;
            this.f9733b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationM372j = AbstractC0228g.m372j(list.get(size));
            C3046G c3046gM5315a = m5315a(windowInsetsAnimationM372j);
            c3046gM5315a.f9741a.mo5320e(windowInsetsAnimationM372j.getFraction());
            this.f9734c.add(c3046gM5315a);
        }
        return this.f9732a.mo683d(C3070c0.m5393c(null, windowInsets), this.f9733b).m5394b();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C2023b c2023bMo684e = this.f9732a.mo684e(m5315a(windowInsetsAnimation), new C2023b(bounds));
        c2023bMo684e.getClass();
        AbstractC0228g.m374l();
        return AbstractC0228g.m370h(((C2688b) c2023bMo684e.f6752e).m4669d(), ((C2688b) c2023bMo684e.f6753f).m4669d());
    }
}
