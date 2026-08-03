package p004e;

import p000a.AbstractC0001b;
import p009j.C0158i;
import p010k.C0180j;

/* JADX INFO: renamed from: e.B */
/* JADX INFO: loaded from: classes.dex */
final class C0018B extends AbstractC0001b {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean[] f66a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f67b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f68c;

    C0018B(boolean[] zArr, int i2, int i3) {
        this.f66a = zArr;
        this.f67b = i2;
        this.f68c = i3;
    }

    @Override // p009j.InterfaceC0155f
    /* JADX INFO: renamed from: b */
    public final void mo71b(C0158i c0158i) {
        if (c0158i.m366h().m414d() == 3) {
            int iMo438h = ((C0180j) c0158i.m362l()).mo438h();
            boolean[] zArr = this.f66a;
            zArr[0] = zArr[0] && (this.f67b - this.f68c) + iMo438h == c0158i.m368j().m384i();
        }
    }
}
