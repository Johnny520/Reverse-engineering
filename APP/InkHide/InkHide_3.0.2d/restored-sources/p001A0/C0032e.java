package p001A0;

import android.widget.EditText;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Comparator;
import p006D.AbstractC0079h;
import p009E0.C0103c;
import p027N0.AbstractC0223g;
import p040U0.AbstractC0307q;
import p052b1.C0505j;

/* JADX INFO: renamed from: A0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0032e implements Comparator {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f224a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Marked for inline */
    /* JADX DEBUG: Method not inlined, still used in: [A0.a.c(java.lang.Object):java.lang.Object, A0.h.c(java.lang.Object):java.lang.Object, A0.h.d(java.lang.Object):java.lang.Object, A0.h.e(java.lang.Object):java.lang.Object, A0.h.f(java.lang.Object):java.lang.Object, A0.h.g(java.lang.Object):java.lang.Object, A0.h.i(java.lang.Object):java.lang.Object, A0.h.j(java.lang.Object):java.lang.Object] */
    public /* synthetic */ C0032e(int i2) {
        this.f224a = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f224a) {
            case 0:
                return AbstractC0079h.m184h((Comparable) ((C0103c) obj2).f395b, (Comparable) ((C0103c) obj).f395b);
            case 1:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m32h((C0505j) obj2)), Integer.valueOf(C0034g.m32h((C0505j) obj)));
            case 2:
                return AbstractC0079h.m184h(Boolean.valueOf(AbstractC0307q.m538h0(((C0505j) obj2).m1006b().f1869a, false, "com.tencent.mm.sdk.platformtools.")), Boolean.valueOf(AbstractC0307q.m538h0(((C0505j) obj).m1006b().f1869a, false, "com.tencent.mm.sdk.platformtools.")));
            case 3:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m25a((C0505j) obj2)), Integer.valueOf(C0034g.m25a((C0505j) obj)));
            case 4:
                return AbstractC0079h.m184h(Boolean.valueOf(AbstractC0223g.m414a(((Field) obj2).getName(), "data")), Boolean.valueOf(AbstractC0223g.m414a(((Field) obj).getName(), "data")));
            case 5:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m26b((Class) obj2)), Integer.valueOf(C0034g.m26b((Class) obj)));
            case 6:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m30f((Class) obj2)), Integer.valueOf(C0034g.m30f((Class) obj)));
            case 7:
                return AbstractC0079h.m184h(Boolean.valueOf(AbstractC0223g.m414a(((Field) obj2).getName(), "data")), Boolean.valueOf(AbstractC0223g.m414a(((Field) obj).getName(), "data")));
            case 8:
                return AbstractC0079h.m184h(Boolean.valueOf(AbstractC0223g.m414a(((Field) obj).getType(), EditText.class)), Boolean.valueOf(AbstractC0223g.m414a(((Field) obj2).getType(), EditText.class)));
            case 9:
                return AbstractC0079h.m184h(Boolean.valueOf(AbstractC0307q.m532b0((String) obj2, "ActionBarSearchView")), Boolean.valueOf(AbstractC0307q.m532b0((String) obj, "ActionBarSearchView")));
            case 10:
                String name = ((Method) obj2).getName();
                AbstractC0223g.m417d(name, "getName(...)");
                Integer numValueOf = Integer.valueOf(C0034g.m31g(name));
                String name2 = ((Method) obj).getName();
                AbstractC0223g.m417d(name2, "getName(...)");
                return AbstractC0079h.m184h(numValueOf, Integer.valueOf(C0034g.m31g(name2)));
            case 11:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m24O((Class) obj2)), Integer.valueOf(C0034g.m24O((Class) obj)));
            case 12:
                return AbstractC0079h.m184h((Comparable) ((C0103c) obj2).f395b, (Comparable) ((C0103c) obj).f395b);
            case 13:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m24O((Class) obj2)), Integer.valueOf(C0034g.m24O((Class) obj)));
            case 14:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m27c((Class) obj2)), Integer.valueOf(C0034g.m27c((Class) obj)));
            default:
                return AbstractC0079h.m184h(Integer.valueOf(C0034g.m28d((Class) obj2)), Integer.valueOf(C0034g.m28d((Class) obj)));
        }
    }
}
