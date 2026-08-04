package yyds;

import java.util.Iterator;

/* JADX INFO: renamed from: yyds.ᲈᛷᛶᲀ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2704 extends AbstractC1214 implements Iterator {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public final /* synthetic */ C0422 f13274;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public C2598 f13275;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public boolean f13276 = true;

    public C2704(C0422 c0422) {
        this.f13274 = c0422;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f13276) {
            return this.f13274.f2166 != null;
        }
        C2598 c2598 = this.f13275;
        return (c2598 == null || c2598.f12793 == null) ? false : true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f13276) {
            this.f13276 = false;
            C2598 c2598 = this.f13274.f2166;
            this.f13275 = c2598;
            return c2598;
        }
        C2598 c25982 = this.f13275;
        C2598 c25983 = c25982 != null ? c25982.f12793 : null;
        this.f13275 = c25983;
        return c25983;
    }

    @Override // yyds.AbstractC1214
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo2473(C2598 c2598) {
        C2598 c25982 = this.f13275;
        if (c2598 == c25982) {
            C2598 c25983 = c25982.f12795;
            this.f13275 = c25983;
            this.f13276 = c25983 == null;
        }
    }
}
