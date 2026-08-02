package defpackage;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 extends op0 {
    public final /* synthetic */ int h;
    public final String i;
    public final sn j;
    public final boolean k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public zw1(int i, String str, boolean z) {
        this.h = i;
        switch (i) {
            case 1:
                sn snVar = sn.i;
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = snVar;
                this.k = z;
                break;
            case 2:
                sn snVar2 = sn.i;
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = snVar2;
                this.k = z;
                break;
            default:
                sn snVar3 = sn.i;
                Objects.requireNonNull(str, "name == null");
                this.i = str;
                this.j = snVar3;
                this.k = z;
                break;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.op0
    public final void j(r82 r82Var, Object obj) {
        int i = this.h;
        boolean z = this.k;
        String str = this.i;
        sn snVar = this.j;
        switch (i) {
            case 0:
                if (obj != null) {
                    snVar.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        r82Var.a(str, string, z);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    snVar.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        r82Var.b(str, string2, z);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    snVar.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        r82Var.d(str, string3, z);
                        break;
                    }
                }
                break;
        }
    }
}
