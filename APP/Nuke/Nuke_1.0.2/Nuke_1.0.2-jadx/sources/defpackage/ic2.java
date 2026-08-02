package defpackage;

import android.os.Bundle;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class ic2 implements fc2, tc2 {
    public final /* synthetic */ gc2 h;
    public la1 i;
    public rc2 j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public ic2(gc2 gc2Var) {
        this.h = gc2Var;
        Object objD = gc2Var.d("androidx.savedstate.SavedStateRegistry");
        Bundle bundle = objD instanceof Bundle ? (Bundle) objD : null;
        if (bundle != null) {
            e(bundle);
        }
        gc2Var.a("androidx.savedstate.SavedStateRegistry", new ta(19, this));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final ec2 a(String str, xm0 xm0Var) {
        return this.h.a(str, xm0Var);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final boolean b(Object obj) {
        return this.h.b(obj);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final Map c() {
        return this.h.c();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.fc2
    public final Object d(String str) {
        return this.h.d(str);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final rc2 e(Bundle bundle) {
        rc2 rc2Var = this.j;
        if (rc2Var != null) {
            return rc2Var;
        }
        rc2 rc2Var2 = new rc2(new sc2(this, new ta(20, this)));
        this.j = rc2Var2;
        rc2Var2.a(bundle);
        return rc2Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.ia1
    public final ba1 getLifecycle() {
        la1 la1Var = this.i;
        if (la1Var != null) {
            return la1Var;
        }
        la1 la1Var2 = new la1(this, false);
        this.i = la1Var2;
        return la1Var2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.tc2
    public final qc2 getSavedStateRegistry() {
        return e(null).b;
    }
}
