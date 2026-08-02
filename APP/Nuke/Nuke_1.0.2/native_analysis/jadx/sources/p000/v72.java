package p000;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v72 {

    /* JADX INFO: renamed from: a */
    public final sz0 f11805a;

    /* JADX INFO: renamed from: b */
    public final ye0 f11806b;

    /* JADX INFO: renamed from: c */
    public final dq1 f11807c;

    /* JADX INFO: renamed from: d */
    public final ye0 f11808d;

    /* JADX INFO: renamed from: e */
    public final l40 f11809e;

    /* JADX INFO: renamed from: f */
    public final ye0 f11810f;

    /* JADX INFO: renamed from: g */
    public final ye0 f11811g;

    /* JADX INFO: renamed from: h */
    public final sz0 f11812h = new sz0(26);

    /* JADX INFO: renamed from: i */
    public final xb1 f11813i = new xb1();

    /* JADX INFO: renamed from: j */
    public final C0043b5 f11814j;

    public v72() {
        C0043b5 c0043b5 = new C0043b5(new C0158e9(20, 6), new C0953z8(21), new C0160eb(21), 11, false);
        this.f11814j = c0043b5;
        this.f11805a = new sz0(c0043b5);
        this.f11806b = new ye0(0);
        this.f11807c = new dq1(7);
        this.f11808d = new ye0(4);
        this.f11809e = new l40(0);
        this.f11810f = new ye0(5);
        this.f11811g = new ye0(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        dq1 dq1Var = this.f11807c;
        synchronized (dq1Var) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) dq1Var.f2147i);
                ((ArrayList) dq1Var.f2147i).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) dq1Var.f2147i).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) dq1Var.f2147i).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m5641a(Class cls, we0 we0Var) {
        ye0 ye0Var = this.f11806b;
        synchronized (ye0Var) {
            ye0Var.f13428a.add(new xe0(cls, we0Var));
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m5642b(Class cls, j92 j92Var) {
        ye0 ye0Var = this.f11808d;
        synchronized (ye0Var) {
            ye0Var.f13428a.add(new k92(cls, j92Var));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m5643c(Class cls, Class cls2, kh1 kh1Var) {
        sz0 sz0Var = this.f11805a;
        synchronized (sz0Var) {
            kj1 kj1Var = (kj1) sz0Var.f10436i;
            synchronized (kj1Var) {
                try {
                    jj1 jj1Var = new jj1(cls, cls2, kh1Var);
                    ArrayList arrayList = (ArrayList) kj1Var.f5594i;
                    arrayList.add(arrayList.size(), jj1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((l40) sz0Var.f10437j).f5918a.clear();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m5644d(String str, Class cls, Class cls2, g92 g92Var) {
        dq1 dq1Var = this.f11807c;
        synchronized (dq1Var) {
            dq1Var.m1082E(str).add(new h92(cls, cls2, g92Var));
        }
    }

    /* JADX INFO: renamed from: e */
    public final ArrayList m5645e() {
        ArrayList arrayList;
        ye0 ye0Var = this.f11811g;
        synchronized (ye0Var) {
            arrayList = ye0Var.f13428a;
        }
        if (arrayList.isEmpty()) {
            throw new u72("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: f */
    public final List m5646f(Object obj) {
        List listUnmodifiableList;
        sz0 sz0Var = this.f11805a;
        sz0Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (sz0Var) {
            lh1 lh1Var = (lh1) ((l40) sz0Var.f10437j).f5918a.get(cls);
            listUnmodifiableList = lh1Var == null ? null : lh1Var.f6120a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((kj1) sz0Var.f10436i).m2709m(cls));
                if (((lh1) ((l40) sz0Var.f10437j).f5918a.put(cls, new lh1(listUnmodifiableList))) != null) {
                    throw new IllegalStateException("Already cached loaders for model: " + cls);
                }
            }
        }
        if (listUnmodifiableList.isEmpty()) {
            throw new u72("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }
        int size = listUnmodifiableList.size();
        List arrayList = Collections.EMPTY_LIST;
        boolean z = true;
        for (int i = 0; i < size; i++) {
            jh1 jh1Var = (jh1) listUnmodifiableList.get(i);
            if (jh1Var.mo235a(obj)) {
                if (z) {
                    arrayList = new ArrayList(size - i);
                    z = false;
                }
                arrayList.add(jh1Var);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new u72("Found ModelLoaders for model class: " + listUnmodifiableList + ", but none that handle this specific model instance: " + obj);
    }

    /* JADX INFO: renamed from: g */
    public final k40 m5647g(Object obj) {
        k40 k40VarMo2223b;
        l40 l40Var = this.f11809e;
        synchronized (l40Var) {
            try {
                fg1.m1641p(obj);
                j40 j40Var = (j40) l40Var.f5918a.get(obj.getClass());
                if (j40Var == null) {
                    Iterator it = l40Var.f5918a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        j40 j40Var2 = (j40) it.next();
                        if (j40Var2.mo2222a().isAssignableFrom(obj.getClass())) {
                            j40Var = j40Var2;
                            break;
                        }
                    }
                }
                if (j40Var == null) {
                    j40Var = l40.f5917b;
                }
                k40VarMo2223b = j40Var.mo2223b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return k40VarMo2223b;
    }

    /* JADX INFO: renamed from: h */
    public final void m5648h(Class cls, g92 g92Var) {
        dq1 dq1Var = this.f11807c;
        synchronized (dq1Var) {
            dq1Var.m1082E("legacy_prepend_all").add(0, new h92(Uri.class, cls, g92Var));
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m5649i(j40 j40Var) {
        l40 l40Var = this.f11809e;
        synchronized (l40Var) {
            l40Var.f5918a.put(j40Var.mo2222a(), j40Var);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m5650j(Class cls, Class cls2, n92 n92Var) {
        ye0 ye0Var = this.f11810f;
        synchronized (ye0Var) {
            ye0Var.f13428a.add(new f33(cls, cls2, n92Var));
        }
    }
}
