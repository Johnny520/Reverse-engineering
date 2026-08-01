package p185m8;

import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: renamed from: m8.b1 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5068b1 extends AbstractC5065a1 {
    /* JADX INFO: renamed from: e */
    public static Set m20483e() {
        return C5091l0.f15401q;
    }

    /* JADX INFO: renamed from: f */
    public static LinkedHashSet m20484f(Object... objArr) {
        objArr.getClass();
        return (LinkedHashSet) AbstractC5106t.m20699O0(objArr, new LinkedHashSet(AbstractC5107t0.m20763e(objArr.length)));
    }

    /* JADX INFO: renamed from: g */
    public static Set m20485g(Object... objArr) {
        objArr.getClass();
        return (Set) AbstractC5106t.m20699O0(objArr, new LinkedHashSet(AbstractC5107t0.m20763e(objArr.length)));
    }

    /* JADX INFO: renamed from: h */
    public static final Set m20486h(Set set) {
        set.getClass();
        int size = set.size();
        return size != 0 ? size != 1 ? set : AbstractC5065a1.m20479d(set.iterator().next()) : m20483e();
    }

    /* JADX INFO: renamed from: i */
    public static Set m20487i(Object... objArr) {
        objArr.getClass();
        return AbstractC5106t.m20737h1(objArr);
    }
}
