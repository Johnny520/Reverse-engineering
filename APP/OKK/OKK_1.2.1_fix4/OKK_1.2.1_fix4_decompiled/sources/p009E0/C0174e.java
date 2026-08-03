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

    public C0174e(AbstractC0175f abstractC0175f, int i2, int i3) {
        AbstractC0307g.m703e(abstractC0175f, "list");
        this.f388a = abstractC0175f;
        this.f389b = i2;
        AbstractC0040p.m107j(i2, i3, abstractC0175f.mo516a());
        this.f390c = i3 - i2;
    }

    @Override // p009E0.AbstractC0175f
    /* JADX INFO: renamed from: a */
    public final int mo516a() {
        return this.f390c;
    }

    @Override // java.util.List
    public final Object get(int i2) {
        int i3 = this.f390c;
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException(AbstractC0324d.m721d("index: ", i2, ", size: ", i3));
        }
        return this.f388a.get(this.f389b + i2);
    }
}
