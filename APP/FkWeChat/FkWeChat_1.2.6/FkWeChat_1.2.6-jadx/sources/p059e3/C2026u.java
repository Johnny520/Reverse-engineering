package p059e3;

import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import java.util.WeakHashMap;
import p319w2.AbstractC9083j;
import p319w2.C9058e;
import p319w2.C9162y3;

/* JADX INFO: renamed from: e3.u */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2026u {

    /* JADX INFO: renamed from: a */
    public final WeakHashMap f5620a = new WeakHashMap();

    /* JADX INFO: renamed from: b */
    public final WeakHashMap f5621b = new WeakHashMap();

    /* JADX INFO: renamed from: c */
    public final WeakHashMap f5622c = new WeakHashMap();

    /* JADX INFO: renamed from: a */
    public final ClickableSpan m7292a(C9058e.d dVar) {
        WeakHashMap weakHashMap = this.f5622c;
        Object c2017l = weakHashMap.get(dVar);
        if (c2017l == null) {
            c2017l = new C2017l((AbstractC9083j) dVar.m35192g());
            weakHashMap.put(dVar, c2017l);
        }
        return (ClickableSpan) c2017l;
    }

    /* JADX INFO: renamed from: b */
    public final URLSpan m7293b(C9058e.d dVar) {
        WeakHashMap weakHashMap = this.f5621b;
        Object uRLSpan = weakHashMap.get(dVar);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(((AbstractC9083j.b) dVar.m35192g()).m35306c());
            weakHashMap.put(dVar, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }

    /* JADX INFO: renamed from: c */
    public final URLSpan m7294c(C9162y3 c9162y3) {
        WeakHashMap weakHashMap = this.f5620a;
        Object uRLSpan = weakHashMap.get(c9162y3);
        if (uRLSpan == null) {
            uRLSpan = new URLSpan(c9162y3.m35606a());
            weakHashMap.put(c9162y3, uRLSpan);
        }
        return (URLSpan) uRLSpan;
    }
}
