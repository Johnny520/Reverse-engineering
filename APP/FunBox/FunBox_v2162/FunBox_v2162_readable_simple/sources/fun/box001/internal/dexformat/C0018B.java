package fun.box001.internal.dexformat;

import fun.box001.internal.dexbridge.RuntimeDexGenerator;
import fun.box001.internal.dexformat.writer.C0158i;
import fun.box001.internal.dexformat.writer.code.C0180j;

/* JADX INFO: renamed from: e.B */
/* JADX INFO: loaded from: classes.dex */
final class C0018B extends RuntimeDexGenerator {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ boolean[] f66a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f67b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ int f68c;

    C0018B(boolean[] r1, int r2, int r3) {
        this.f66a = r1;
        this.f67b = r2;
        this.f68c = r3;
    }

    @Override // fun.box001.internal.dexformat.writer.InterfaceC0155f
    /* JADX INFO: renamed from: b */
    public final void mo71b(C0158i r6) {
        if (r6.m366h().m414d() != 3) goto L12;
        int r0 = ((C0180j) r6.m362l()).mo438h();
        boolean[] r1 = this.f66a;
        if (r1[0] == true) goto L7;
    L9:
        boolean r62 = false;
    L10:
        r1[0] = r62;
        return;
    L7:
        if (((this.f67b - this.f68c) + r0) != r6.m368j().m384i()) goto L9;
        r62 = true;
        goto L10
    }
}
