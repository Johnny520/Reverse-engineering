package p332wb;

import android.os.Trace;
import android.view.View;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import p036c9.C0482r0;
import p068eh.AbstractC0921a;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p345x8.C5718k;
import p345x8.C5721n;
import p347xa.C5747h;
import p347xa.C5752m;
import p357y1.AbstractC5858a;
import p357y1.ViewOnAttachStateChangeListenerC5958z;
import p366ya.C6011a;
import tf.AbstractC4167n;

/* JADX INFO: renamed from: wb.cr */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC4794cr implements Runnable {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f16435g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f16436h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ RunnableC4794cr(Object obj, int i9) {
        this.f16435g = i9;
        this.f16436h = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        Object c3959f;
        ArrayList<C3958e> arrayList;
        switch (this.f16435g) {
            case 0:
                ViewOnAttachStateChangeListenerC4826dr viewOnAttachStateChangeListenerC4826dr = (ViewOnAttachStateChangeListenerC4826dr) this.f16436h;
                viewOnAttachStateChangeListenerC4826dr.getClass();
                viewOnAttachStateChangeListenerC4826dr.m9256a();
                return;
            case 1:
                C5453wt c5453wt = (C5453wt) this.f16436h;
                c5453wt.f21823d = false;
                c5453wt.m9764a();
                return;
            case 2:
                ((C0482r0) this.f16436h).invoke();
                return;
            case 3:
                C5718k c5718k = (C5718k) this.f16436h;
                try {
                    Thread.sleep(30000L);
                    if (!c5718k.f23263i.get()) {
                        c5718k.m10318c();
                    }
                    c3959f = C3967n.f12976a;
                    break;
                } catch (Throwable th2) {
                    c3959f = new C3959f(th2);
                }
                Throwable thM8182b = C3960g.m8182b(c3959f);
                if (thM8182b != null) {
                    c5718k.f23264j.set(false);
                    AbstractC0921a.m2261x("[Hchat:AutoReply] 小智MCP桥接重连失败: ", thM8182b.getMessage(), thM8182b);
                    return;
                }
                return;
            case 4:
                C5721n c5721n = (C5721n) this.f16436h;
                if (!c5721n.f23288g.get() && c5721n.f23287f.get() == null && System.currentTimeMillis() - c5721n.f23290i.get() >= 90000) {
                    c5721n.m10324a("idle timeout");
                    return;
                }
                return;
            case 5:
                C5752m c5752m = (C5752m) this.f16436h;
                Map map = c5752m.f23421i;
                map.getClass();
                synchronized (map) {
                    try {
                        Set<Map.Entry> setEntrySet = c5752m.f23421i.entrySet();
                        arrayList = new ArrayList(AbstractC4167n.m8429e1(setEntrySet));
                        for (Map.Entry entry : setEntrySet) {
                            arrayList.add(new C3958e(entry.getKey(), entry.getValue()));
                        }
                        c5752m.f23421i.clear();
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                for (C3958e c3958e : arrayList) {
                    View view = (View) c3958e.f12961g;
                    C5747h c5747h = (C5747h) c3958e.f12962h;
                    try {
                        view.setOnLongClickListener(c5747h.f23404c);
                        view.setLongClickable(c5747h.f23405d);
                    } catch (Throwable unused) {
                    }
                }
                return;
            case 6:
                ((AbstractC5858a) this.f16436h).m10552b();
                return;
            case 7:
                ViewOnAttachStateChangeListenerC5958z viewOnAttachStateChangeListenerC5958z = (ViewOnAttachStateChangeListenerC5958z) this.f16436h;
                Trace.beginSection("measureAndLayout");
                try {
                    viewOnAttachStateChangeListenerC5958z.f24215j.m10666x(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        viewOnAttachStateChangeListenerC5958z.m10694g();
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC5958z.f24210O = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            default:
                ((C6011a) this.f16436h).m10771a();
                return;
        }
    }
}
