package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class v72 {
    public final sz0 a;
    public final ye0 b;
    public final dq1 c;
    public final ye0 d;
    public final l40 e;
    public final ye0 f;
    public final ye0 g;
    public final sz0 h = new sz0(26);
    public final xb1 i = new xb1();
    public final b5 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public v72() {
        b5 b5Var = new b5(new e9(20, 6), new z8(21), new eb(21), 11, false);
        this.j = b5Var;
        this.a = new sz0(b5Var);
        this.b = new ye0(0);
        this.c = new dq1(7);
        this.d = new ye0(4);
        this.e = new l40(0);
        this.f = new ye0(5);
        this.g = new ye0(2);
        List listAsList = Arrays.asList("Animation", "Bitmap", "BitmapDrawable");
        ArrayList arrayList = new ArrayList(listAsList.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        dq1 dq1Var = this.c;
        synchronized (dq1Var) {
            try {
                ArrayList<String> arrayList2 = new ArrayList((ArrayList) dq1Var.i);
                ((ArrayList) dq1Var.i).clear();
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    ((ArrayList) dq1Var.i).add((String) it2.next());
                }
                for (String str : arrayList2) {
                    if (!arrayList.contains(str)) {
                        ((ArrayList) dq1Var.i).add(str);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void a(Class cls, we0 we0Var) {
        ye0 ye0Var = this.b;
        synchronized (ye0Var) {
            ye0Var.a.add(new xe0(cls, we0Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void b(Class cls, j92 j92Var) {
        ye0 ye0Var = this.d;
        synchronized (ye0Var) {
            ye0Var.a.add(new k92(cls, j92Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void c(Class cls, Class cls2, kh1 kh1Var) {
        sz0 sz0Var = this.a;
        synchronized (sz0Var) {
            kj1 kj1Var = (kj1) sz0Var.i;
            synchronized (kj1Var) {
                try {
                    jj1 jj1Var = new jj1(cls, cls2, kh1Var);
                    ArrayList arrayList = (ArrayList) kj1Var.i;
                    arrayList.add(arrayList.size(), jj1Var);
                } catch (Throwable th) {
                    throw th;
                }
            }
            ((l40) sz0Var.j).a.clear();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void d(String str, Class cls, Class cls2, g92 g92Var) {
        dq1 dq1Var = this.c;
        synchronized (dq1Var) {
            dq1Var.E(str).add(new h92(cls, cls2, g92Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ArrayList e() {
        ArrayList arrayList;
        ye0 ye0Var = this.g;
        synchronized (ye0Var) {
            arrayList = ye0Var.a;
        }
        if (arrayList.isEmpty()) {
            throw new u72("Failed to find image header parser.");
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final List f(Object obj) {
        List listUnmodifiableList;
        sz0 sz0Var = this.a;
        sz0Var.getClass();
        Class<?> cls = obj.getClass();
        synchronized (sz0Var) {
            lh1 lh1Var = (lh1) ((l40) sz0Var.j).a.get(cls);
            listUnmodifiableList = lh1Var == null ? null : lh1Var.a;
            if (listUnmodifiableList == null) {
                listUnmodifiableList = Collections.unmodifiableList(((kj1) sz0Var.i).m(cls));
                if (((lh1) ((l40) sz0Var.j).a.put(cls, new lh1(listUnmodifiableList))) != null) {
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
            if (jh1Var.a(obj)) {
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

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final k40 g(Object obj) {
        k40 k40VarB;
        l40 l40Var = this.e;
        synchronized (l40Var) {
            try {
                fg1.p(obj);
                j40 j40Var = (j40) l40Var.a.get(obj.getClass());
                if (j40Var == null) {
                    Iterator it = l40Var.a.values().iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        j40 j40Var2 = (j40) it.next();
                        if (j40Var2.a().isAssignableFrom(obj.getClass())) {
                            j40Var = j40Var2;
                            break;
                        }
                    }
                }
                if (j40Var == null) {
                    j40Var = l40.b;
                }
                k40VarB = j40Var.b(obj);
            } catch (Throwable th) {
                throw th;
            }
        }
        return k40VarB;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void h(Class cls, g92 g92Var) {
        dq1 dq1Var = this.c;
        synchronized (dq1Var) {
            dq1Var.E("legacy_prepend_all").add(0, new h92(Uri.class, cls, g92Var));
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void i(j40 j40Var) {
        l40 l40Var = this.e;
        synchronized (l40Var) {
            l40Var.a.put(j40Var.a(), j40Var);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void j(Class cls, Class cls2, n92 n92Var) {
        ye0 ye0Var = this.f;
        synchronized (ye0Var) {
            ye0Var.a.add(new f33(cls, cls2, n92Var));
        }
    }
}
