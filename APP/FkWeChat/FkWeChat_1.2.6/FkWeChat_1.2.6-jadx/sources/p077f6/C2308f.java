package p077f6;

import p024b9.AbstractC1043k;
import p121i3.C3179i;

/* JADX INFO: renamed from: f6.f */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2308f implements InterfaceC2340z {

    /* JADX INFO: renamed from: a */
    public final float f6311a;

    /* JADX INFO: renamed from: b */
    public final float f6312b;

    /* JADX INFO: renamed from: c */
    public final float f6313c;

    /* JADX INFO: renamed from: d */
    public final float f6314d;

    /* JADX INFO: renamed from: e */
    public final float f6315e;

    /* JADX INFO: renamed from: f */
    public final float f6316f;

    /* JADX INFO: renamed from: g */
    public final float f6317g;

    public C2308f(float f10, float f11, float f12, float f13, float f14, float f15, float f16) {
        this.f6311a = f10;
        this.f6312b = f11;
        this.f6313c = f12;
        this.f6314d = f13;
        this.f6315e = f14;
        this.f6316f = f15;
        this.f6317g = f16;
    }

    @Override // p077f6.InterfaceC2340z
    /* JADX INFO: renamed from: a */
    public float mo8438a() {
        return this.f6314d;
    }

    @Override // p077f6.InterfaceC2340z
    /* JADX INFO: renamed from: b */
    public float mo8439b() {
        return this.f6316f;
    }

    @Override // p077f6.InterfaceC2340z
    /* JADX INFO: renamed from: c */
    public float mo8440c() {
        return this.f6317g;
    }

    @Override // p077f6.InterfaceC2340z
    /* JADX INFO: renamed from: d */
    public float mo8441d() {
        return this.f6313c;
    }

    @Override // p077f6.InterfaceC2340z
    /* JADX INFO: renamed from: e */
    public float mo8442e() {
        return this.f6315e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2308f)) {
            return false;
        }
        C2308f c2308f = (C2308f) obj;
        return C3179i.m12005m(this.f6311a, c2308f.f6311a) && C3179i.m12005m(this.f6312b, c2308f.f6312b) && C3179i.m12005m(this.f6313c, c2308f.f6313c) && C3179i.m12005m(this.f6314d, c2308f.f6314d) && C3179i.m12005m(this.f6315e, c2308f.f6315e) && C3179i.m12005m(this.f6316f, c2308f.f6316f) && C3179i.m12005m(this.f6317g, c2308f.f6317g);
    }

    @Override // p077f6.InterfaceC2340z
    /* JADX INFO: renamed from: f */
    public float mo8443f() {
        return this.f6312b;
    }

    @Override // p077f6.InterfaceC2340z
    /* JADX INFO: renamed from: g */
    public float mo8444g() {
        return this.f6311a;
    }

    public int hashCode() {
        return (((((((((((C3179i.m12006n(this.f6311a) * 31) + C3179i.m12006n(this.f6312b)) * 31) + C3179i.m12006n(this.f6313c)) * 31) + C3179i.m12006n(this.f6314d)) * 31) + C3179i.m12006n(this.f6315e)) * 31) + C3179i.m12006n(this.f6316f)) * 31) + C3179i.m12006n(this.f6317g);
    }

    public String toString() {
        return "DefaultMarkdownDimens(dividerThickness=" + C3179i.m12007p(this.f6311a) + ", codeBackgroundCornerSize=" + C3179i.m12007p(this.f6312b) + ", blockQuoteThickness=" + C3179i.m12007p(this.f6313c) + ", tableMaxWidth=" + C3179i.m12007p(this.f6314d) + ", tableCellWidth=" + C3179i.m12007p(this.f6315e) + ", tableCellPadding=" + C3179i.m12007p(this.f6316f) + ", tableCornerSize=" + C3179i.m12007p(this.f6317g) + ")";
    }

    public /* synthetic */ C2308f(float f10, float f11, float f12, float f13, float f14, float f15, float f16, AbstractC1043k abstractC1043k) {
        this(f10, f11, f12, f13, f14, f15, f16);
    }
}
