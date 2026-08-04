package yyds;

import java.util.HashMap;

/* JADX INFO: renamed from: yyds.ᲁᛳᛸᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C2201 extends C0422 {

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public final HashMap f10859 = new HashMap();

    @Override // yyds.C0422
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final C2598 mo1181(Object obj) {
        return (C2598) this.f10859.get(obj);
    }

    @Override // yyds.C0422
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final Object mo1182(Object obj) {
        Object objMo1182 = super.mo1182(obj);
        this.f10859.remove(obj);
        return objMo1182;
    }
}
