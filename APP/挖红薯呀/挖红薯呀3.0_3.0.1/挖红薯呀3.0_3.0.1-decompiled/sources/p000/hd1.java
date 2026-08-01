package p000;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class hd1 extends WindowInsetsAnimation.Callback {

    /* JADX INFO: renamed from: a */
    public final gd1 f2216a;

    /* JADX INFO: renamed from: b */
    public List f2217b;

    /* JADX INFO: renamed from: c */
    public ArrayList f2218c;

    /* JADX INFO: renamed from: d */
    public final HashMap f2219d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public hd1(gd1 gd1Var) {
        super(gd1Var.f1928d);
        this.f2219d = new HashMap();
        this.f2216a = gd1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final id1 m1299a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.f2219d;
        id1 id1Var = (id1) map.get(windowInsetsAnimation);
        if (id1Var != null) {
            return id1Var;
        }
        id1 id1Var2 = new id1();
        new WindowInsetsAnimation(0, null, 0L);
        id1Var2.f2526a = new qb1(windowInsetsAnimation);
        map.put(windowInsetsAnimation, id1Var2);
        return id1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2216a.mo1237b(m1299a(windowInsetsAnimation));
        this.f2219d.remove(windowInsetsAnimation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.WindowInsetsAnimation.Callback
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f2216a.mo1238c(m1299a(windowInsetsAnimation));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f2218c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f2218c = arrayList2;
            this.f2217b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            id1 id1VarM1299a = m1299a(windowInsetsAnimation);
            ((WindowInsetsAnimation) id1VarM1299a.f2526a.f5106d).setFraction(windowInsetsAnimation.getFraction());
            this.f2218c.add(id1VarM1299a);
        }
        yd1 yd1Var = this.f2216a.mo1239d(be1.m352b(null, windowInsets), this.f2217b).f503a;
        if (yd1Var instanceof qd1) {
            return ((qd1) yd1Var).f5126c;
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // android.view.WindowInsetsAnimation.Callback
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        C0111d c0111dMo1240e = this.f2216a.mo1240e(m1299a(windowInsetsAnimation), new C0111d(bounds));
        c0111dMo1240e.getClass();
        return new WindowInsetsAnimation.Bounds(((i20) c0111dMo1240e.f919e).m1514c(), ((i20) c0111dMo1240e.f920f).m1514c());
    }
}
