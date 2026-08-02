package defpackage;

import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class de3 extends WindowInsetsAnimation$Callback {
    public final wd3 a;
    public List b;
    public ArrayList c;
    public final HashMap d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public de3(wd3 wd3Var) {
        super(wd3Var.i);
        this.d = new HashMap();
        this.a = wd3Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final ge3 a(WindowInsetsAnimation windowInsetsAnimation) {
        HashMap map = this.d;
        ge3 ge3Var = (ge3) map.get(windowInsetsAnimation);
        if (ge3Var != null) {
            return ge3Var;
        }
        ge3 ge3Var2 = new ge3(0, null, 0L);
        ge3Var2.a = new ee3(windowInsetsAnimation);
        map.put(windowInsetsAnimation, ge3Var2);
        return ge3Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.a(a(windowInsetsAnimation));
        this.d.remove(windowInsetsAnimation);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.a.c(a(windowInsetsAnimation));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.c = arrayList2;
            this.b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationG = ce3.g(list.get(size));
            ge3 ge3VarA = a(windowInsetsAnimationG);
            ge3VarA.a.e(windowInsetsAnimationG.getFraction());
            this.c.add(ge3VarA);
        }
        return this.a.d(cf3.c(null, windowInsets), this.b).b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        dq1 dq1VarE = this.a.e(a(windowInsetsAnimation), new dq1(bounds));
        dq1VarE.getClass();
        e4.n();
        return e4.i(((zz0) dq1VarE.i).d(), ((zz0) dq1VarE.j).d());
    }
}
