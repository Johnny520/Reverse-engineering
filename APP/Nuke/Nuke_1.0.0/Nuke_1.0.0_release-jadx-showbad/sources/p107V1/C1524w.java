package p107V1;

import com.bumptech.glide.C1929k;
import java.util.ArrayList;
import java.util.HashSet;
import p000A.C0072l0;

/* JADX INFO: renamed from: V1.w */
/* JADX INFO: loaded from: classes.dex */
public final class C1524w {

    /* JADX INFO: renamed from: e */
    public static final C1527z f5285e = new C1527z(10);

    /* JADX INFO: renamed from: f */
    public static final C1498A f5286f = new C1498A(2);

    /* JADX INFO: renamed from: d */
    public final C0072l0 f5290d;

    /* JADX INFO: renamed from: a */
    public final ArrayList f5287a = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final HashSet f5289c = new HashSet();

    /* JADX INFO: renamed from: b */
    public final C1527z f5288b = f5285e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1524w(C0072l0 c0072l0) {
        this.f5290d = c0072l0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public final synchronized InterfaceC1518q m2789a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z5 = false;
            for (C1523v c1523v : this.f5287a) {
                if (this.f5289c.contains(c1523v)) {
                    z5 = true;
                } else if (c1523v.f5282a.isAssignableFrom(cls) && c1523v.f5283b.isAssignableFrom(cls2)) {
                    this.f5289c.add(c1523v);
                    arrayList.add(c1523v.f5284c.mo68g(this));
                    this.f5289c.remove(c1523v);
                }
            }
            if (arrayList.size() > 1) {
                C1527z c1527z = this.f5288b;
                C0072l0 c0072l0 = this.f5290d;
                c1527z.getClass();
                return new C1503b(2, arrayList, c0072l0);
            }
            if (arrayList.size() == 1) {
                return (InterfaceC1518q) arrayList.get(0);
            }
            if (z5) {
                return f5286f;
            }
            throw new C1929k("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        } catch (Throwable th) {
            this.f5289c.clear();
            throw th;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: b */
    public final synchronized ArrayList m2790b(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (C1523v c1523v : this.f5287a) {
                if (!this.f5289c.contains(c1523v) && c1523v.f5282a.isAssignableFrom(cls)) {
                    this.f5289c.add(c1523v);
                    arrayList.add(c1523v.f5284c.mo68g(this));
                    this.f5289c.remove(c1523v);
                }
            }
        } finally {
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final synchronized ArrayList m2791c(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        for (C1523v c1523v : this.f5287a) {
            if (!arrayList.contains(c1523v.f5283b) && c1523v.f5282a.isAssignableFrom(cls)) {
                arrayList.add(c1523v.f5283b);
            }
        }
        return arrayList;
    }
}
