package p000;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class gz0 extends b12 {

    /* JADX INFO: renamed from: l */
    public final boolean f3744l;

    public gz0(String str, hz0 hz0Var) {
        super(str, hz0Var, 1);
        this.f3744l = true;
    }

    @Override // p000.b12
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gz0) {
            yo2 yo2Var = (yo2) obj;
            if (this.f513a.equals(yo2Var.mo250b())) {
                gz0 gz0Var = (gz0) obj;
                if (gz0Var.f3744l && Arrays.equals((yo2[]) this.f522j.getValue(), (yo2[]) gz0Var.f522j.getValue())) {
                    int iMo252d = yo2Var.mo252d();
                    int i = this.f515c;
                    if (i == iMo252d) {
                        for (int i2 = 0; i2 < i; i2++) {
                            if (t11.m5086l(mo256j(i2).mo250b(), yo2Var.mo256j(i2).mo250b()) && t11.m5086l(mo256j(i2).mo251c(), yo2Var.mo256j(i2).mo251c())) {
                            }
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // p000.yo2
    /* JADX INFO: renamed from: f */
    public final boolean mo362f() {
        return this.f3744l;
    }

    @Override // p000.b12
    public final int hashCode() {
        return super.hashCode() * 31;
    }
}
