package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: G9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0268G9 {

    /* JADX INFO: renamed from: a */
    public final String f859a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f860b;

    /* JADX INFO: renamed from: c */
    public final HashSet f861c;

    /* JADX INFO: renamed from: d */
    public final ArrayList f862d;

    /* JADX INFO: renamed from: e */
    public final ArrayList f863e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f864f;

    public C0268G9(String r1) {
        this.f859a = r1;
        this.f860b = new ArrayList();
        this.f861c = new HashSet();
        this.f862d = new ArrayList();
        this.f863e = new ArrayList();
        this.f864f = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public static void m551a(C0268G9 r1, String r2, C2680wm r3) {
        if (r1.f861c.add(r2) == false) goto L7;
        r1.f860b.add(r2);
        r1.f862d.add(r3);
        r1.f863e.add(C0452Kf.f1484a);
        r1.f864f.add(false);
        return;
    L7:
        throw new IllegalArgumentException(("Element with name '" + r2 + "' is already registered in " + r1.f859a).toString());
    }
}
