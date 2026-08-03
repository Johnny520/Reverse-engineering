package p358y2;

import bsh.org.objectweb.asm.Opcodes;
import p068eh.AbstractC0921a;
import p117i0.C1883u;

/* JADX INFO: renamed from: y2.c0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5967c0 {

    /* JADX INFO: renamed from: a */
    public final int f24250a;

    /* JADX INFO: renamed from: b */
    public final boolean f24251b;

    /* JADX INFO: renamed from: c */
    public final boolean f24252c;

    /* JADX INFO: renamed from: d */
    public final boolean f24253d;

    /* JADX INFO: renamed from: e */
    public final boolean f24254e;

    /* JADX INFO: renamed from: f */
    public final int f24255f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5967c0(boolean z9, EnumC5969d0 enumC5969d0, boolean z10) {
        C1883u c1883u = AbstractC5978m.f24291a;
        int i9 = !z9 ? 262152 : Opcodes.ASM4;
        i9 = enumC5969d0 == EnumC5969d0.f24262h ? i9 | 8192 : i9;
        i9 = z10 ? i9 : i9 | Opcodes.ACC_INTERFACE;
        boolean z11 = enumC5969d0 == EnumC5969d0.f24261g;
        this.f24250a = i9;
        this.f24251b = z11;
        this.f24252c = true;
        this.f24253d = true;
        this.f24254e = true;
        this.f24255f = 1002;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5967c0)) {
            return false;
        }
        C5967c0 c5967c0 = (C5967c0) obj;
        return this.f24250a == c5967c0.f24250a && this.f24251b == c5967c0.f24251b && this.f24252c == c5967c0.f24252c && this.f24253d == c5967c0.f24253d && this.f24254e == c5967c0.f24254e && this.f24255f == c5967c0.f24255f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return (AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(AbstractC0921a.m2245h(this.f24250a * 31, 31, this.f24251b), 31, this.f24252c), 31, this.f24253d), 31, this.f24254e), 31, false) + this.f24255f) * 31;
    }
}
