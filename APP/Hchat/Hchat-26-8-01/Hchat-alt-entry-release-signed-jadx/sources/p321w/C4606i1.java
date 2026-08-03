package p321w;

import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.AbstractC1874r;
import p117i0.C1892x;
import p144k.EnumC2164d1;
import p174m.InterfaceC2613i2;
import p370yf.AbstractC6038c;

/* JADX INFO: renamed from: w.i1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4606i1 implements InterfaceC2613i2 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC2613i2 f15190a;

    /* JADX INFO: renamed from: b */
    public final C1892x f15191b;

    /* JADX INFO: renamed from: c */
    public final C1892x f15192c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C4606i1(InterfaceC2613i2 interfaceC2613i2, final C4609j1 c4609j1) {
        this.f15190a = interfaceC2613i2;
        final int i9 = 0;
        this.f15191b = AbstractC1874r.m4634p(new InterfaceC1220a() { // from class: w.h1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i9) {
                    case 0:
                        C4609j1 c4609j12 = c4609j1;
                        return Boolean.valueOf(c4609j12.f15206a.m4488g() < c4609j12.f15207b.m4488g());
                    default:
                        return Boolean.valueOf(c4609j1.f15206a.m4488g() > 0.0f);
                }
            }
        });
        final int i10 = 1;
        this.f15192c = AbstractC1874r.m4634p(new InterfaceC1220a() { // from class: w.h1
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p085fg.InterfaceC1220a
            public final Object invoke() {
                switch (i10) {
                    case 0:
                        C4609j1 c4609j12 = c4609j1;
                        return Boolean.valueOf(c4609j12.f15206a.m4488g() < c4609j12.f15207b.m4488g());
                    default:
                        return Boolean.valueOf(c4609j1.f15206a.m4488g() > 0.0f);
                }
            }
        });
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: a */
    public final boolean mo5458a() {
        return this.f15190a.mo5458a();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: b */
    public final Object mo5459b(EnumC2164d1 enumC2164d1, InterfaceC1235p interfaceC1235p, AbstractC6038c abstractC6038c) {
        return this.f15190a.mo5459b(enumC2164d1, interfaceC1235p, abstractC6038c);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: c */
    public final boolean mo5460c() {
        return ((Boolean) this.f15192c.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: d */
    public final boolean mo5461d() {
        return ((Boolean) this.f15191b.getValue()).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p174m.InterfaceC2613i2
    /* JADX INFO: renamed from: e */
    public final float mo5462e(float f3) {
        return this.f15190a.mo5462e(f3);
    }
}
