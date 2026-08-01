package p077f6;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;
import p121i3.C3179i;
import p274t.InterfaceC7887q2;

/* JADX INFO: renamed from: f6.i */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2314i implements InterfaceC2309f0 {

    /* JADX INFO: renamed from: a */
    public final float f6320a;

    /* JADX INFO: renamed from: b */
    public final float f6321b;

    /* JADX INFO: renamed from: c */
    public final float f6322c;

    /* JADX INFO: renamed from: d */
    public final float f6323d;

    /* JADX INFO: renamed from: e */
    public final float f6324e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC7887q2 f6325f;

    /* JADX INFO: renamed from: g */
    public final InterfaceC7887q2 f6326g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC7887q2 f6327h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC7887q2.a f6328i;

    public C2314i(float f10, float f11, float f12, float f13, float f14, InterfaceC7887q2 interfaceC7887q2, InterfaceC7887q2 interfaceC7887q22, InterfaceC7887q2 interfaceC7887q23, InterfaceC7887q2.a aVar) {
        interfaceC7887q2.getClass();
        interfaceC7887q22.getClass();
        interfaceC7887q23.getClass();
        aVar.getClass();
        this.f6320a = f10;
        this.f6321b = f11;
        this.f6322c = f12;
        this.f6323d = f13;
        this.f6324e = f14;
        this.f6325f = interfaceC7887q2;
        this.f6326g = interfaceC7887q22;
        this.f6327h = interfaceC7887q23;
        this.f6328i = aVar;
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: b */
    public InterfaceC7887q2 mo8445b() {
        return this.f6326g;
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: c */
    public InterfaceC7887q2 mo8446c() {
        return this.f6325f;
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: d */
    public float mo8447d() {
        return this.f6322c;
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: e */
    public float mo8448e() {
        return this.f6321b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2314i)) {
            return false;
        }
        C2314i c2314i = (C2314i) obj;
        return C3179i.m12005m(this.f6320a, c2314i.f6320a) && C3179i.m12005m(this.f6321b, c2314i.f6321b) && C3179i.m12005m(this.f6322c, c2314i.f6322c) && C3179i.m12005m(this.f6323d, c2314i.f6323d) && C3179i.m12005m(this.f6324e, c2314i.f6324e) && AbstractC1061t.m3842c(this.f6325f, c2314i.f6325f) && AbstractC1061t.m3842c(this.f6326g, c2314i.f6326g) && AbstractC1061t.m3842c(this.f6327h, c2314i.f6327h) && AbstractC1061t.m3842c(this.f6328i, c2314i.f6328i);
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: f */
    public float mo8449f() {
        return this.f6324e;
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: g */
    public float mo8450g() {
        return this.f6323d;
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: h */
    public float mo8451h() {
        return this.f6320a;
    }

    public int hashCode() {
        return (((((((((((((((C3179i.m12006n(this.f6320a) * 31) + C3179i.m12006n(this.f6321b)) * 31) + C3179i.m12006n(this.f6322c)) * 31) + C3179i.m12006n(this.f6323d)) * 31) + C3179i.m12006n(this.f6324e)) * 31) + this.f6325f.hashCode()) * 31) + this.f6326g.hashCode()) * 31) + this.f6327h.hashCode()) * 31) + this.f6328i.hashCode();
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: i */
    public InterfaceC7887q2.a mo8452i() {
        return this.f6328i;
    }

    @Override // p077f6.InterfaceC2309f0
    /* JADX INFO: renamed from: j */
    public InterfaceC7887q2 mo8453j() {
        return this.f6327h;
    }

    public String toString() {
        return "DefaultMarkdownPadding(block=" + C3179i.m12007p(this.f6320a) + ", list=" + C3179i.m12007p(this.f6321b) + ", listItemTop=" + C3179i.m12007p(this.f6322c) + ", listItemBottom=" + C3179i.m12007p(this.f6323d) + ", listIndent=" + C3179i.m12007p(this.f6324e) + ", codeBlock=" + this.f6325f + ", blockQuote=" + this.f6326g + ", blockQuoteText=" + this.f6327h + ", blockQuoteBar=" + this.f6328i + ")";
    }

    public /* synthetic */ C2314i(float f10, float f11, float f12, float f13, float f14, InterfaceC7887q2 interfaceC7887q2, InterfaceC7887q2 interfaceC7887q22, InterfaceC7887q2 interfaceC7887q23, InterfaceC7887q2.a aVar, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, f14, interfaceC7887q2, interfaceC7887q22, interfaceC7887q23, aVar);
    }
}
