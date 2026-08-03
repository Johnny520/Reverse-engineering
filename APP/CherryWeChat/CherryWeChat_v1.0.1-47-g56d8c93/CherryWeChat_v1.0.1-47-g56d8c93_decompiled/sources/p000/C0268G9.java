package p000;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: renamed from: G9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0268G9 {

    /* JADX INFO: renamed from: a */
    public final String f859a;

    /* JADX INFO: renamed from: b */
    public final ArrayList f860b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final HashSet f861c = new HashSet();

    /* JADX INFO: renamed from: d */
    public final ArrayList f862d = new ArrayList();

    /* JADX INFO: renamed from: e */
    public final ArrayList f863e = new ArrayList();

    /* JADX INFO: renamed from: f */
    public final ArrayList f864f = new ArrayList();

    public C0268G9(String str) {
        this.f859a = str;
    }

    /* JADX INFO: renamed from: a */
    public static void m551a(C0268G9 c0268g9, String str, C2680wm c2680wm) {
        if (c0268g9.f861c.add(str)) {
            c0268g9.f860b.add(str);
            c0268g9.f862d.add(c2680wm);
            c0268g9.f863e.add(C0452Kf.f1484a);
            c0268g9.f864f.add(false);
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + str + "' is already registered in " + c0268g9.f859a).toString());
    }
}
