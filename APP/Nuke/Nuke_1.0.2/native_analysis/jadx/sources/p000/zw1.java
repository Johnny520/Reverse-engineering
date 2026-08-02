package p000;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class zw1 extends op0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f14122h;

    /* JADX INFO: renamed from: i */
    public final String f14123i;

    /* JADX INFO: renamed from: j */
    public final C0700sn f14124j;

    /* JADX INFO: renamed from: k */
    public final boolean f14125k;

    public zw1(int i, String str, boolean z) {
        this.f14122h = i;
        switch (i) {
            case 1:
                C0700sn c0700sn = C0700sn.f10221i;
                Objects.requireNonNull(str, "name == null");
                this.f14123i = str;
                this.f14124j = c0700sn;
                this.f14125k = z;
                break;
            case 2:
                C0700sn c0700sn2 = C0700sn.f10221i;
                Objects.requireNonNull(str, "name == null");
                this.f14123i = str;
                this.f14124j = c0700sn2;
                this.f14125k = z;
                break;
            default:
                C0700sn c0700sn3 = C0700sn.f10221i;
                Objects.requireNonNull(str, "name == null");
                this.f14123i = str;
                this.f14124j = c0700sn3;
                this.f14125k = z;
                break;
        }
    }

    @Override // p000.op0
    /* JADX INFO: renamed from: j */
    public final void mo301j(r82 r82Var, Object obj) {
        int i = this.f14122h;
        boolean z = this.f14125k;
        String str = this.f14123i;
        C0700sn c0700sn = this.f14124j;
        switch (i) {
            case 0:
                if (obj != null) {
                    c0700sn.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        r82Var.m4404a(str, string, z);
                        break;
                    }
                }
                break;
            case 1:
                if (obj != null) {
                    c0700sn.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        r82Var.m4405b(str, string2, z);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    c0700sn.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        r82Var.m4407d(str, string3, z);
                        break;
                    }
                }
                break;
        }
    }
}
