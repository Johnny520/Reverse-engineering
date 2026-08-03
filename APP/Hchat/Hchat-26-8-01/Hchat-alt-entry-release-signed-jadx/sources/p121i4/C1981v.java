package p121i4;

import p000a.AbstractC0000a;
import p136j8.C2104o;
import p326w4.C4683c;
import p326w4.InterfaceC4684d;

/* JADX INFO: renamed from: i4.v */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C1981v implements InterfaceC4684d {

    /* JADX INFO: renamed from: g */
    public final int f6709g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1981v(int i9) {
        if (i9 >= 0) {
            this.f6709g = i9;
        } else {
            C2104o.m5294t("subroutineAddress < 0");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p376z4.InterfaceC6097k
    /* JADX INFO: renamed from: a */
    public final String mo4901a() {
        return toString();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: b */
    public final int mo4905b() {
        return C4683c.f15646y.f15649h;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: c */
    public final boolean mo4906c() {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (obj instanceof C1981v) {
            return this.f6709g == ((C1981v) obj).f6709g;
        }
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: f */
    public final int mo4907f() {
        return C4683c.f15646y.mo4907f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p326w4.InterfaceC4684d
    public final C4683c getType() {
        return C4683c.f15646y;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f6709g;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        return "<addr:" + AbstractC0000a.m46X0(this.f6709g) + ">";
    }

    @Override // p326w4.InterfaceC4684d
    /* JADX INFO: renamed from: g */
    public final InterfaceC4684d mo4908g() {
        return this;
    }
}
