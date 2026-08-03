package p000;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: l6 */
/* JADX INFO: loaded from: classes.dex */
public final class C2177l6 implements InterfaceC2541tc {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7587a;

    /* JADX INFO: renamed from: b */
    public final Object f7588b;

    public /* synthetic */ C2177l6(int r1, Object r2) {
        this.f7587a = r1;
        this.f7588b = r2;
    }

    /* JADX INFO: renamed from: b */
    private final void m4383b() {
    }

    /* JADX INFO: renamed from: e */
    private final void m4384e() {
    }

    /* JADX INFO: renamed from: g */
    private final void m4385g() {
    }

    /* JADX INFO: renamed from: h */
    private final void m4386h() {
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: a */
    public final Class mo912a() {
        switch(this.f7587a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        return ByteBuffer.class;
    L5:
        return this.f7588b.getClass();
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        int r0 = this.f7587a;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        int r0 = this.f7587a;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu r1, InterfaceC2498sc r2) {
        switch(this.f7587a) {
            case 0: goto L11;
            default: goto L4;
        };
    L4:
        r2.mo638e(this.f7588b);
        return;
    L11:
        r2.mo638e(AbstractC2529t6.m5009a((File) this.f7588b));     // Catch: IOException -> L8
        return;
    L8:
        e = move-exception;
        r2.mo635b(e);
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        switch(this.f7587a) {
            case 0: goto L6;
            default: goto L4;
        };
    L4:
        return 1;
    L6:
        return 1;
    }
}
