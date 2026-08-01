package p074f3;

import android.text.Spannable;
import java.util.List;
import p031c4.AbstractC1320f;
import p121i3.C3193w;
import p121i3.C3195y;
import p121i3.InterfaceC3175e;
import p319w2.AbstractC9059e0;
import p319w2.C9054d0;
import p319w2.C9058e;
import p366z2.C9842j;
import p376zd.C10010p0;

/* JADX INFO: renamed from: f3.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2282b {
    /* JADX INFO: renamed from: a */
    public static final int m8299a(long j10) {
        long jM12102g = C3193w.m12102g(j10);
        C3195y.a aVar = C3195y.f8493b;
        if (C3195y.m12123g(jM12102g, aVar.m12128b())) {
            return 0;
        }
        return C3195y.m12123g(jM12102g, aVar.m12127a()) ? 1 : 2;
    }

    /* JADX INFO: renamed from: b */
    public static final int m8300b(int i10) {
        AbstractC9059e0.a aVar = AbstractC9059e0.f31078a;
        if (AbstractC9059e0.m35203i(i10, aVar.m35206a())) {
            return 0;
        }
        if (AbstractC9059e0.m35203i(i10, aVar.m35212g())) {
            return 1;
        }
        if (AbstractC9059e0.m35203i(i10, aVar.m35207b())) {
            return 2;
        }
        if (AbstractC9059e0.m35203i(i10, aVar.m35208c())) {
            return 3;
        }
        if (AbstractC9059e0.m35203i(i10, aVar.m35211f())) {
            return 4;
        }
        if (AbstractC9059e0.m35203i(i10, aVar.m35209d())) {
            return 5;
        }
        if (AbstractC9059e0.m35203i(i10, aVar.m35210e())) {
            return 6;
        }
        C10010p0.m38820a("Invalid PlaceholderVerticalAlign");
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static final void m8301c(Spannable spannable, C9054d0 c9054d0, int i10, int i11, InterfaceC3175e interfaceC3175e) {
        for (Object obj : spannable.getSpans(i10, i11, AbstractC1320f.class)) {
            spannable.removeSpan((AbstractC1320f) obj);
        }
        AbstractC2284d.m8326w(spannable, new C9842j(C3193w.m12103h(c9054d0.m35145c()), m8299a(c9054d0.m35145c()), C3193w.m12103h(c9054d0.m35143a()), m8299a(c9054d0.m35143a()), interfaceC3175e, m8300b(c9054d0.m35144b())), i10, i11);
    }

    /* JADX INFO: renamed from: d */
    public static final void m8302d(Spannable spannable, List list, InterfaceC3175e interfaceC3175e) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C9058e.d dVar = (C9058e.d) list.get(i10);
            m8301c(spannable, (C9054d0) dVar.m35187a(), dVar.m35188b(), dVar.m35189c(), interfaceC3175e);
        }
    }
}
