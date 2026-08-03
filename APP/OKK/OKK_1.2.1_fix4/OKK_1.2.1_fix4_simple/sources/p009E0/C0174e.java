package p009E0;

import java.util.RandomAccess;
import p001A0.AbstractC0040p;
import p031Q0.AbstractC0307g;
import p034S.AbstractC0324d;

/* JADX INFO: renamed from: E0.e */
/* JADX INFO: loaded from: classes.dex */
public final class C0174e extends AbstractC0175f implements RandomAccess {

    /* JADX INFO: renamed from: a */
    public final AbstractC0175f f388a;

    /* JADX INFO: renamed from: b */
    public final int f389b;

    /* JADX INFO: renamed from: c */
    public final int f390c;

    public C0174e(AbstractC0175f r2, int r3, int r4) {
        AbstractC0307g.m703e(r2, "list");
        this.f388a = r2;
        this.f389b = r3;
        AbstractC0040p.m107j(r3, r4, r2.mo516a());
        this.f390c = r4 - r3;
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        return this.f390c;
    }

    @Override // java.util.List
    public final Object get(int r5) {
        int r02 = this.f390c;
        if (r5 < 0) goto L8;
        if (r5 >= r02) goto L8;
        int r03 = this.f389b + r5;
        return this.f388a.get(r03);
    L8:
        throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", r5, ", size: ", r02));
    }
}
