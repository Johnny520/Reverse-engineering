package p154e2;

import android.content.Context;
import android.view.WindowInsetsAnimation;
import com.bumptech.glide.C1946o;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import p013C0.C0238e;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p079P2.EnumC1152a;
import p095T.C1394w0;
import p117X2.C1671p;
import p165g2.C2182c;
import p178i3.C2327h;
import p178i3.InterfaceC2323d;
import p178i3.InterfaceC2324e;
import p184j3.C2391j;
import p186k.AbstractC2412I;
import p186k.C2423e;
import p186k.C2444z;
import p203n.C2661j;
import p203n.EnumC2655g;
import p205n1.C2688b;
import p216p.C2865v;
import p260x.C3438u;
import p267y0.C3480b;

/* JADX INFO: renamed from: e2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C2023b implements InterfaceC2024c, InterfaceC2323d {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f6751d;

    /* JADX INFO: renamed from: e */
    public Object f6752e;

    /* JADX INFO: renamed from: f */
    public Object f6753f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2023b(int i5, Object obj, Object obj2) {
        this.f6751d = i5;
        this.f6752e = obj;
        this.f6753f = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public synchronized List m3719a(String str) {
        List arrayList;
        try {
            if (!((ArrayList) this.f6752e).contains(str)) {
                ((ArrayList) this.f6752e).add(str);
            }
            arrayList = (List) ((HashMap) this.f6753f).get(str);
            if (arrayList == null) {
                arrayList = new ArrayList();
                ((HashMap) this.f6753f).put(str, arrayList);
            }
        } catch (Throwable th) {
            throw th;
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public synchronized ArrayList m3720b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        Iterator it = ((ArrayList) this.f6752e).iterator();
        while (it.hasNext()) {
            List<C2182c> list = (List) ((HashMap) this.f6753f).get((String) it.next());
            if (list != null) {
                for (C2182c c2182c : list) {
                    if ((c2182c.f7143a.isAssignableFrom(cls) && cls2.isAssignableFrom(c2182c.f7144b)) && !arrayList.contains(c2182c.f7144b)) {
                        arrayList.add(c2182c.f7144b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public void m3721c() {
        if (((C3480b) this.f6753f) != null) {
            this.f6753f = null;
            ((C2865v) this.f6752e).m5063N0(true);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p178i3.InterfaceC2323d
    /* JADX INFO: renamed from: i */
    public Object mo3119i(InterfaceC2324e interfaceC2324e, InterfaceC1046d interfaceC1046d) {
        Object objMo3119i = ((C2391j) this.f6752e).mo3119i(new C2327h(new C1671p(), interfaceC2324e, (C1394w0) this.f6753f, 0), interfaceC1046d);
        return objMo3119i == EnumC1152a.f3788d ? objMo3119i : C0891q.f2780a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f6751d) {
            case 5:
                return "AnimationResult(endReason=" + ((EnumC2655g) this.f6753f) + ", endState=" + ((C2661j) this.f6752e) + ')';
            case 8:
                return "Bounds{lower=" + ((C2688b) this.f6752e) + " upper=" + ((C2688b) this.f6753f) + "}";
            default:
                return super.toString();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p154e2.InterfaceC2024c
    /* JADX INFO: renamed from: x */
    public void mo2852x() {
        Context context = (Context) this.f6752e;
        if (C2029h.f6760h == null) {
            synchronized (C2029h.class) {
                try {
                    if (C2029h.f6760h == null) {
                        C2029h.f6760h = new C2029h(context.getApplicationContext());
                    }
                } finally {
                }
            }
        }
        C2029h c2029h = C2029h.f6760h;
        C1946o c1946o = (C1946o) this.f6753f;
        synchronized (c2029h) {
            ((HashSet) c2029h.f6764g).add(c1946o);
            c2029h.m3727e();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    public C2023b(int i5) {
        this.f6751d = i5;
        switch (i5) {
            case 2:
                this.f6752e = new ArrayList();
                this.f6753f = new HashMap();
                break;
            case 7:
                this.f6752e = new C0238e(0);
                this.f6753f = new C0238e(0);
                break;
            case 10:
                break;
            default:
                this.f6752e = new AtomicReference();
                this.f6753f = new C2423e(0);
                break;
        }
    }

    public C2023b(Context context, C1946o c1946o) {
        this.f6751d = 0;
        this.f6752e = context.getApplicationContext();
        this.f6753f = c1946o;
    }

    public C2023b(C3438u c3438u) {
        this.f6751d = 9;
        this.f6752e = c3438u;
        C2444z c2444z = AbstractC2412I.f7812a;
        this.f6753f = new C2444z();
    }

    public C2023b(WindowInsetsAnimation.Bounds bounds) {
        this.f6751d = 8;
        this.f6752e = C2688b.m4668c(bounds.getLowerBound());
        this.f6753f = C2688b.m4668c(bounds.getUpperBound());
    }

    public C2023b(C2865v c2865v) {
        this.f6751d = 6;
        this.f6752e = c2865v;
    }
}
