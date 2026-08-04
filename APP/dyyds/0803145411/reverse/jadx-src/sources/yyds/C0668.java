package yyds;

import java.util.LinkedHashMap;

/* JADX INFO: renamed from: yyds.ᛳᲀᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0668 {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static final LinkedHashMap f3168 = new LinkedHashMap();

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static long f3169;

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object f3170;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final InterfaceC0477 f3171;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final InterfaceC0477 f3172;

    public C0668(Object obj, InterfaceC0477 interfaceC0477, InterfaceC0477 interfaceC04772) {
        AbstractC2328.m4341(-739558581502830L);
        AbstractC2328.m4341(-739588646273902L);
        this.f3170 = obj;
        this.f3171 = interfaceC0477;
        this.f3172 = interfaceC04772;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final Object m1579(InterfaceC1989 interfaceC1989) {
        AbstractC2328.m4341(-739657365750638L);
        return this.f3171.mo511(((AbstractC0227) interfaceC1989).f1247, this.f3170);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final void m1580(InterfaceC1989 interfaceC1989) {
        AbstractC2328.m4341(-739618711044974L);
        String str = ((AbstractC0227) interfaceC1989).f1247;
        f3168.put(str, new C0350(str, this.f3170, new C1524(this, 1, interfaceC1989), new C2001(this, 3, interfaceC1989)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final void m1581(InterfaceC1989 interfaceC1989, Object obj) {
        AbstractC2328.m4341(-739696020456302L);
        f3169 = System.currentTimeMillis();
        this.f3172.mo511(((AbstractC0227) interfaceC1989).f1247, obj);
    }
}
