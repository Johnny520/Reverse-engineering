package p050da;

import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Constructor;
import java.util.Comparator;
import p009a9.C0031h;
import p036c9.C0415a0;
import p196n8.C2911c;

/* JADX INFO: renamed from: da.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0761g implements Comparator {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2272g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Object f2273h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2274i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0761g(C0762h c0762h, View view) {
        this.f2272g = 1;
        this.f2273h = c0762h;
        this.f2274i = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2272g) {
            case 0:
                C0762h c0762h = (C0762h) this.f2273h;
                int iCompare = ((C0415a0) this.f2274i).compare(obj, obj2);
                if (iCompare != 0) {
                    return iCompare;
                }
                C0760f c0760f = ((C0759e) obj).f2267a;
                View view = c0760f.f2270a;
                TextView textView = c0760f.f2271b;
                c0762h.getClass();
                Integer numValueOf = Integer.valueOf(C0762h.m1966s(C0762h.m1965r(view, textView)).length());
                C0760f c0760f2 = ((C0759e) obj2).f2267a;
                return numValueOf.compareTo(Integer.valueOf(C0762h.m1966s(C0762h.m1965r(c0760f2.f2270a, c0760f2.f2271b)).length()));
            case 1:
                C0762h c0762h2 = (C0762h) this.f2273h;
                View view2 = (View) this.f2274i;
                return Integer.valueOf(C0762h.m1952a(c0762h2, view2, (C0760f) obj2)).compareTo(Integer.valueOf(C0762h.m1952a(c0762h2, view2, (C0760f) obj)));
            case 2:
                C0762h c0762h3 = (C0762h) this.f2273h;
                int iCompare2 = ((C0761g) this.f2274i).compare(obj, obj2);
                if (iCompare2 != 0) {
                    return iCompare2;
                }
                C0760f c0760f3 = (C0760f) obj;
                View view3 = c0760f3.f2270a;
                TextView textView2 = c0760f3.f2271b;
                c0762h3.getClass();
                C0760f c0760f4 = (C0760f) obj2;
                return Integer.valueOf(C0762h.m1966s(C0762h.m1965r(view3, textView2)).length()).compareTo(Integer.valueOf(C0762h.m1966s(C0762h.m1965r(c0760f4.f2270a, c0760f4.f2271b)).length()));
            default:
                C2911c c2911c = (C2911c) this.f2273h;
                int iCompare3 = ((C0031h) this.f2274i).compare(obj, obj2);
                return iCompare3 != 0 ? iCompare3 : Integer.valueOf(C2911c.m6313a(c2911c, (Constructor) obj2)).compareTo(Integer.valueOf(C2911c.m6313a(c2911c, (Constructor) obj)));
        }
    }

    public /* synthetic */ C0761g(Comparator comparator, Object obj, int i9) {
        this.f2272g = i9;
        this.f2274i = comparator;
        this.f2273h = obj;
    }
}
