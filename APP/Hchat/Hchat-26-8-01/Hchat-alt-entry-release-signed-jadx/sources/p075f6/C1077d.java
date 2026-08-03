package p075f6;

import java.util.Iterator;
import java.util.ListIterator;
import p219oh.AbstractC3165h;

/* JADX INFO: renamed from: f6.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1077d extends AbstractC1078e {

    /* JADX INFO: renamed from: i */
    public final transient int f3465i;

    /* JADX INFO: renamed from: j */
    public final transient int f3466j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ AbstractC1078e f3467k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1077d(AbstractC1078e abstractC1078e, int i9, int i10) {
        this.f3467k = abstractC1078e;
        this.f3465i = i9;
        this.f3466j = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: b */
    public final Object[] mo2703b() {
        return this.f3467k.mo2703b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: c */
    public final int mo2704c() {
        return this.f3467k.mo2705d() + this.f3465i + this.f3466j;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: d */
    public final int mo2705d() {
        return this.f3467k.mo2705d() + this.f3465i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1074a
    /* JADX INFO: renamed from: e */
    public final boolean mo2706e() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.List
    public final Object get(int i9) {
        AbstractC3165h.m6788o(i9, this.f3466j);
        return this.f3467k.get(i9 + this.f3465i);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1078e, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method merged with bridge method: subList(II)Ljava/util/List; */
    @Override // p075f6.AbstractC1078e, java.util.List
    /* JADX INFO: renamed from: j */
    public final AbstractC1078e subList(int i9, int i10) {
        AbstractC3165h.m6789p(i9, i10, this.f3466j);
        int i11 = this.f3465i;
        return this.f3467k.subList(i9 + i11, i10 + i11);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p075f6.AbstractC1078e, java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f3466j;
    }

    @Override // p075f6.AbstractC1078e, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i9) {
        return listIterator(i9);
    }
}
