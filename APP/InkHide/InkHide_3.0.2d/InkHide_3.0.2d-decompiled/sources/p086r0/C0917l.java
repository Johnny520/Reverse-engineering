package p086r0;

import android.view.View;
import android.widget.ListView;
import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: r0.l */
/* JADX INFO: loaded from: classes.dex */
public final class C0917l {

    /* JADX INFO: renamed from: a */
    public final ListView f3246a;

    /* JADX INFO: renamed from: b */
    public final View f3247b;

    /* JADX INFO: renamed from: c */
    public final Object f3248c;

    /* JADX INFO: renamed from: d */
    public final Class f3249d;

    /* JADX INFO: renamed from: e */
    public final List f3250e;

    /* JADX INFO: renamed from: f */
    public final List f3251f;

    /* JADX INFO: renamed from: g */
    public final int f3252g;

    /* JADX INFO: renamed from: h */
    public final EnumC0923n f3253h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0917l(ListView listView, View view, Object obj, Class cls, List list, List list2, int i2, EnumC0923n enumC0923n) {
        AbstractC0223g.m418e(obj, "adapter");
        AbstractC0223g.m418e(list, "sampleUsernames");
        AbstractC0223g.m418e(list2, "sampleItemClassNames");
        this.f3246a = listView;
        this.f3247b = view;
        this.f3248c = obj;
        this.f3249d = cls;
        this.f3250e = list;
        this.f3251f = list2;
        this.f3252g = i2;
        this.f3253h = enumC0923n;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0917l)) {
            return false;
        }
        C0917l c0917l = (C0917l) obj;
        return AbstractC0223g.m414a(this.f3246a, c0917l.f3246a) && AbstractC0223g.m414a(this.f3247b, c0917l.f3247b) && AbstractC0223g.m414a(this.f3248c, c0917l.f3248c) && AbstractC0223g.m414a(this.f3249d, c0917l.f3249d) && AbstractC0223g.m414a(this.f3250e, c0917l.f3250e) && AbstractC0223g.m414a(this.f3251f, c0917l.f3251f) && this.f3252g == c0917l.f3252g && this.f3253h == c0917l.f3253h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        ListView listView = this.f3246a;
        int iHashCode = (listView == null ? 0 : listView.hashCode()) * 31;
        View view = this.f3247b;
        return this.f3253h.hashCode() + AbstractC0174d.m345a(this.f3252g, AbstractC0174d.m349e(this.f3251f, AbstractC0174d.m349e(this.f3250e, (this.f3249d.hashCode() + AbstractC0174d.m346b(this.f3248c, (iHashCode + (view != null ? view.hashCode() : 0)) * 31, 31)) * 31, 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ConversationSurface(listView=" + this.f3246a + ", recyclerView=" + this.f3247b + ", adapter=" + this.f3248c + ", adapterClass=" + this.f3249d + ", sampleUsernames=" + this.f3250e + ", sampleItemClassNames=" + this.f3251f + ", sampleConfidence=" + this.f3252g + ", source=" + this.f3253h + ")";
    }
}
