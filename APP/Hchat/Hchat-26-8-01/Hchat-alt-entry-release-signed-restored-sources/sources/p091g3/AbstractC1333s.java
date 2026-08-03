package p091g3;

import java.util.List;
import p014b.C0126e;

/* JADX INFO: renamed from: g3.s */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1333s {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f4399g = 0;

    /* JADX INFO: renamed from: h */
    public final int f4400h;

    /* JADX INFO: renamed from: i */
    public Object f4401i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1333s(int i9, String str) {
        this.f4400h = i9;
        this.f4401i = str;
    }

    /* JADX INFO: renamed from: d */
    public abstract C1332r0 mo3562d(C1332r0 c1332r0, List list);

    /* JADX INFO: renamed from: e */
    public abstract C0126e mo3563e(C1300b0 c1300b0, C0126e c0126e);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public boolean equals(Object obj) {
        switch (this.f4399g) {
            case 1:
                return obj == this;
            default:
                return super.equals(obj);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public int hashCode() {
        switch (this.f4399g) {
            case 1:
                return ((String) this.f4401i).hashCode();
            default:
                return super.hashCode();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f4399g) {
            case 1:
                return (String) this.f4401i;
            default:
                return super.toString();
        }
    }

    public AbstractC1333s(int i9) {
        this.f4400h = i9;
    }

    /* JADX INFO: renamed from: b */
    public void mo3561b() {
    }

    /* JADX INFO: renamed from: a */
    public void mo3560a(C1300b0 c1300b0) {
    }
}
