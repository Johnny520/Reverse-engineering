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

    public /* synthetic */ C2177l6(int i, Object obj) {
        this.f7587a = i;
        this.f7588b = obj;
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
        switch (this.f7587a) {
            case 0:
                return ByteBuffer.class;
            default:
                return this.f7588b.getClass();
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: c */
    public final void mo914c() {
        int i = this.f7587a;
    }

    @Override // p000.InterfaceC2541tc
    public final void cancel() {
        int i = this.f7587a;
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: d */
    public final void mo915d(EnumC2688wu enumC2688wu, InterfaceC2498sc interfaceC2498sc) {
        switch (this.f7587a) {
            case 0:
                try {
                    interfaceC2498sc.mo638e(AbstractC2529t6.m5009a((File) this.f7588b));
                } catch (IOException e) {
                    interfaceC2498sc.mo635b(e);
                    return;
                }
                break;
            default:
                interfaceC2498sc.mo638e(this.f7588b);
                break;
        }
    }

    @Override // p000.InterfaceC2541tc
    /* JADX INFO: renamed from: f */
    public final int mo916f() {
        switch (this.f7587a) {
        }
        return 1;
    }
}
