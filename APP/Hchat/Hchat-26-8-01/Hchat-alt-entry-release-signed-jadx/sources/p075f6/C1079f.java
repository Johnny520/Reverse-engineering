package p075f6;

import java.util.Objects;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: f6.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1079f extends AbstractC1078e {

    /* JADX INFO: renamed from: k */
    public static final C1079f f3469k = new C1079f(0, new Object[0]);

    /* JADX INFO: renamed from: i */
    public final transient Object[] f3470i;

    /* JADX INFO: renamed from: j */
    public final transient int f3471j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1079f(int i9, Object[] objArr) {
        this.f3470i = objArr;
        this.f3471j = i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1078e, p075f6.AbstractC1074a
    /* JADX INFO: renamed from: a */
    public final int mo2702a(Object[] objArr) {
        Object[] objArr2 = this.f3470i;
        int i9 = this.f3471j;
        System.arraycopy(objArr2, 0, objArr, 0, i9);
        return i9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: b */
    public final Object[] mo2703b() {
        return this.f3470i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: c */
    public final int mo2704c() {
        return this.f3471j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: d */
    public final int mo2705d() {
        return 0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: e */
    public final boolean mo2706e() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        AbstractC3165h.m6788o(i9, this.f3471j);
        Object obj = this.f3470i[i9];
        Objects.requireNonNull(obj);
        return obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3471j;
    }
}
