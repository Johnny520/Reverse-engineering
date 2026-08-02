package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* JADX INFO: renamed from: cg */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0090cg extends AbstractC0031au {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1519b = 1;

    /* JADX INFO: renamed from: c */
    public final rb1 f1520c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0090cg(w41 w41Var) {
        super(w41Var);
        w41Var.getClass();
        yo2 yo2VarMo168e = w41Var.mo168e();
        yo2VarMo168e.getClass();
        this.f1520c = new C0054bg(yo2VarMo168e, 0);
    }

    @Override // p000.w41
    /* JADX INFO: renamed from: e */
    public final yo2 mo168e() {
        switch (this.f1519b) {
        }
        return (C0054bg) this.f1520c;
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: f */
    public final Object mo771f() {
        switch (this.f1519b) {
            case 0:
                return new ArrayList();
            default:
                return new LinkedHashSet();
        }
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: g */
    public final int mo772g(Object obj) {
        switch (this.f1519b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList.size();
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet.size();
        }
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: h */
    public final Iterator mo773h(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.iterator();
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: i */
    public final int mo572i(Object obj) {
        Collection collection = (Collection) obj;
        collection.getClass();
        return collection.size();
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: l */
    public final Object mo573l(Object obj) {
        switch (this.f1519b) {
            case 0:
                throw null;
            default:
                throw null;
        }
    }

    @Override // p000.AbstractC0409l2
    /* JADX INFO: renamed from: m */
    public final Object mo774m(Object obj) {
        switch (this.f1519b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                return arrayList;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                return linkedHashSet;
        }
    }

    @Override // p000.AbstractC0031au
    /* JADX INFO: renamed from: n */
    public final void mo279n(int i, Object obj, Object obj2) {
        switch (this.f1519b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj;
                arrayList.getClass();
                arrayList.add(i, obj2);
                break;
            default:
                LinkedHashSet linkedHashSet = (LinkedHashSet) obj;
                linkedHashSet.getClass();
                linkedHashSet.add(obj2);
                break;
        }
    }

    public C0090cg() {
        super(nv2.f7346a);
        g32 g32Var = nv2.f7347b;
        g32Var.getClass();
        this.f1520c = new C0054bg(g32Var, 1);
    }
}
