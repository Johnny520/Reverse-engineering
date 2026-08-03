package p222p;

import gg.AbstractC1416l;
import p293u2.EnumC4243m;
import p293u2.InterfaceC4233c;

/* JADX INFO: renamed from: p.l1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3234l1 implements InterfaceC3252r1 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3252r1 f10317a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC3252r1 f10318b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3234l1(InterfaceC3252r1 interfaceC3252r1, InterfaceC3252r1 interfaceC3252r12) {
        this.f10317a = interfaceC3252r1;
        this.f10318b = interfaceC3252r12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: a */
    public final int mo6854a(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        return Math.max(this.f10317a.mo6854a(interfaceC4233c, enumC4243m), this.f10318b.mo6854a(interfaceC4233c, enumC4243m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: b */
    public final int mo6855b(InterfaceC4233c interfaceC4233c) {
        return Math.max(this.f10317a.mo6855b(interfaceC4233c), this.f10318b.mo6855b(interfaceC4233c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: c */
    public final int mo6856c(InterfaceC4233c interfaceC4233c, EnumC4243m enumC4243m) {
        return Math.max(this.f10317a.mo6856c(interfaceC4233c, enumC4243m), this.f10318b.mo6856c(interfaceC4233c, enumC4243m));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p222p.InterfaceC3252r1
    /* JADX INFO: renamed from: d */
    public final int mo6857d(InterfaceC4233c interfaceC4233c) {
        return Math.max(this.f10317a.mo6857d(interfaceC4233c), this.f10318b.mo6857d(interfaceC4233c));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3234l1)) {
            return false;
        }
        C3234l1 c3234l1 = (C3234l1) obj;
        return AbstractC1416l.m3825a(c3234l1.f10317a, this.f10317a) && AbstractC1416l.m3825a(c3234l1.f10318b, this.f10318b);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (this.f10318b.hashCode() * 31) + this.f10317a.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "(" + this.f10317a + " ∪ " + this.f10318b + ')';
    }
}
