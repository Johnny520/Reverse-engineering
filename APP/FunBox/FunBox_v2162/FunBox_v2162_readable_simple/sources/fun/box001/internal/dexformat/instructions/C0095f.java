package fun.box001.internal.dexformat.instructions;

import fun.box001.internal.dexformat.InterfaceC0031h;
import fun.box001.internal.dexformat.writer.code.AbstractC0171a;

/* JADX INFO: renamed from: g.f */
/* JADX INFO: loaded from: classes.dex */
final class C0095f implements InterfaceC0031h {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0100k f356a;

    C0095f(C0100k r1) {
        this.f356a = r1;
    }

    @Override // fun.box001.internal.dexformat.InterfaceC0031h
    /* JADX INFO: renamed from: a */
    public final int mo119a(AbstractC0171a r2) {
        AbstractC0107r r22 = this.f356a.m292b(r2);
        if (r22 != null) goto L7;
        return -1;
    L7:
        return r22.m317e();
    }
}
