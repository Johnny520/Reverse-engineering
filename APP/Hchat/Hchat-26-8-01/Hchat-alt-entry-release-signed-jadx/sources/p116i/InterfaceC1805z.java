package p116i;

import p109hb.C1671c;

/* JADX INFO: renamed from: i.z */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC1805z extends InterfaceC1763k {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p116i.InterfaceC1763k
    /* JADX INFO: renamed from: a */
    default InterfaceC1774n1 mo4363a(C1771m1 c1771m1) {
        return new C1671c(this);
    }

    /* JADX INFO: renamed from: b */
    long mo4353b(float f3, float f10, float f11);

    /* JADX INFO: renamed from: c */
    float mo4354c(float f3, float f10, float f11, long j3);

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: d */
    default float mo4355d(float f3, float f10, float f11) {
        return mo4354c(f3, f10, f11, mo4353b(f3, f10, f11));
    }

    /* JADX INFO: renamed from: e */
    float mo4356e(float f3, float f10, float f11, long j3);
}
