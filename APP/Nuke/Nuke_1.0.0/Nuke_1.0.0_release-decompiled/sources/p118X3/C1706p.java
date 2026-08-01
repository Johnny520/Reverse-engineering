package p118X3;

import com.bumptech.glide.AbstractC1923e;
import java.util.ArrayList;
import me.dartcv.nuke.BuildConfig;
import p078P1.InterfaceC1150l;
import p117X2.AbstractC1665j;
import p148d2.C1971b;
import p165g2.C2183d;
import p245u0.C3313j;
import p245u0.C3314k;
import p245u0.C3316m;
import p245u0.C3317n;
import p245u0.C3319p;
import p245u0.C3322s;
import p245u0.C3323t;
import p245u0.C3324u;
import p245u0.C3327x;
import p245u0.C3329z;

/* JADX INFO: renamed from: X3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C1706p {

    /* JADX INFO: renamed from: a */
    public final ArrayList f5857a;

    public C1706p(int i5) {
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                this.f5857a = new ArrayList();
                break;
            case 2:
                this.f5857a = new ArrayList();
                break;
            case 3:
                this.f5857a = new ArrayList();
                break;
            case 4:
                this.f5857a = new ArrayList();
                break;
            case 5:
                this.f5857a = new ArrayList(32);
                break;
            default:
                this.f5857a = new ArrayList(20);
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m3022a(String str, String str2) {
        AbstractC1665j.m2985e(str, "name");
        AbstractC1665j.m2985e(str2, "value");
        AbstractC1923e.m3446E(str);
        AbstractC1923e.m3447F(str2, str);
        AbstractC1923e.m3477o(this, str, str2);
    }

    /* JADX INFO: renamed from: b */
    public void m3023b(String str, String str2) {
        AbstractC1665j.m2985e(str, "name");
        AbstractC1665j.m2985e(str2, "value");
        AbstractC1923e.m3477o(this, str, str2);
    }

    /* JADX INFO: renamed from: c */
    public C1707q m3024c() {
        return new C1707q((String[]) this.f5857a.toArray(new String[0]));
    }

    /* JADX INFO: renamed from: d */
    public void m3025d() {
        this.f5857a.add(C3313j.f10317c);
    }

    /* JADX INFO: renamed from: e */
    public void m3026e(float f2, float f5, float f6, float f7, float f8, float f9) {
        this.f5857a.add(new C3314k(f2, f5, f6, f7, f8, f9));
    }

    /* JADX INFO: renamed from: f */
    public void m3027f(float f2, float f5, float f6, float f7, float f8, float f9) {
        this.f5857a.add(new C3322s(f2, f5, f6, f7, f8, f9));
    }

    /* JADX INFO: renamed from: g */
    public synchronized InterfaceC1150l m3028g(Class cls) {
        int size = this.f5857a.size();
        for (int i5 = 0; i5 < size; i5++) {
            C2183d c2183d = (C2183d) this.f5857a.get(i5);
            if (c2183d.f7146a.isAssignableFrom(cls)) {
                return c2183d.f7147b;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h */
    public synchronized ArrayList m3029h(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (cls2.isAssignableFrom(cls)) {
            arrayList.add(cls2);
            return arrayList;
        }
        for (C1971b c1971b : this.f5857a) {
            if ((c1971b.f6657a.isAssignableFrom(cls) && cls2.isAssignableFrom(c1971b.f6658b)) && !arrayList.contains(c1971b.f6658b)) {
                arrayList.add(c1971b.f6658b);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: i */
    public void m3030i(float f2) {
        this.f5857a.add(new C3323t(f2));
    }

    /* JADX INFO: renamed from: j */
    public void m3031j(float f2, float f5) {
        this.f5857a.add(new C3316m(f2, f5));
    }

    /* JADX INFO: renamed from: k */
    public void m3032k(float f2, float f5) {
        this.f5857a.add(new C3324u(f2, f5));
    }

    /* JADX INFO: renamed from: l */
    public void m3033l(float f2, float f5) {
        this.f5857a.add(new C3317n(f2, f5));
    }

    /* JADX INFO: renamed from: m */
    public void m3034m(float f2, float f5, float f6, float f7) {
        this.f5857a.add(new C3319p(f2, f5, f6, f7));
    }

    /* JADX INFO: renamed from: n */
    public void m3035n(float f2, float f5, float f6, float f7) {
        this.f5857a.add(new C3327x(f2, f5, f6, f7));
    }

    /* JADX INFO: renamed from: o */
    public void m3036o(String str) {
        int i5 = 0;
        while (true) {
            ArrayList arrayList = this.f5857a;
            if (i5 >= arrayList.size()) {
                return;
            }
            if (str.equalsIgnoreCase((String) arrayList.get(i5))) {
                arrayList.remove(i5);
                arrayList.remove(i5);
                i5 -= 2;
            }
            i5 += 2;
        }
    }

    /* JADX INFO: renamed from: p */
    public void m3037p(float f2) {
        this.f5857a.add(new C3329z(f2));
    }
}
