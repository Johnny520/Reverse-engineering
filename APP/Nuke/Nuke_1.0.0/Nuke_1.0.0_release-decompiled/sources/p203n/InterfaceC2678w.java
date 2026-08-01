package p203n;

import p007B0.C0173F;

/* JADX INFO: renamed from: n.w */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC2678w extends InterfaceC2659i {
    @Override // p203n.InterfaceC2659i
    /* JADX INFO: renamed from: a */
    default InterfaceC2656g0 mo4572a(C2652e0 c2652e0) {
        return new C0173F(this);
    }

    /* JADX INFO: renamed from: b */
    float mo4635b(long j5, float f2, float f5, float f6);

    /* JADX INFO: renamed from: c */
    float mo4636c(long j5, float f2, float f5, float f6);

    /* JADX INFO: renamed from: d */
    long mo4637d(float f2, float f5, float f6);

    /* JADX INFO: renamed from: e */
    default float mo4638e(float f2, float f5, float f6) {
        return mo4636c(mo4637d(f2, f5, f6), f2, f5, f6);
    }
}
