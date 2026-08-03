package p080fb;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: fb.z1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1197z1 {

    /* JADX INFO: renamed from: a */
    public final List f4024a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1197z1(List list) {
        this.f4024a = list;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final boolean m3248a() {
        return m3249b().isEmpty();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final ArrayList m3249b() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f4024a) {
            if (((C1100a0) obj).f3544a == EnumC1104b0.f3555g) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final ArrayList m3250c() {
        ArrayList arrayList = new ArrayList();
        for (Object obj : this.f4024a) {
            if (((C1100a0) obj).f3544a == EnumC1104b0.f3556h) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1197z1) && this.f4024a.equals(((C1197z1) obj).f4024a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f4024a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "ScriptPluginAgentValidation(issues=" + this.f4024a + ")";
    }
}
