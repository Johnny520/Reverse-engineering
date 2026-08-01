package p027E4;

import java.util.concurrent.Executor;
import p000A.C0038T0;
import p118X3.C1679A;

/* JADX INFO: renamed from: E4.o */
/* JADX INFO: loaded from: classes.dex */
public final class C0328o implements InterfaceC0318e {

    /* JADX INFO: renamed from: d */
    public final Executor f1047d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC0318e f1048e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0328o(Executor executor, InterfaceC0318e interfaceC0318e) {
        this.f1047d = executor;
        this.f1048e = interfaceC0318e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: b */
    public final C0306U mo509b() {
        return this.f1048e.mo509b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: c */
    public final void mo510c(InterfaceC0321h interfaceC0321h) {
        this.f1048e.mo510c(new C0038T0(3, this, interfaceC0321h, false));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.InterfaceC0318e
    public final void cancel() {
        this.f1048e.cancel();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: d */
    public final C1679A mo511d() {
        return this.f1048e.mo511d();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: f */
    public final boolean mo513f() {
        return this.f1048e.mo513f();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX DEBUG: Method merged with bridge method: clone()Ljava/lang/Object; */
    @Override // p027E4.InterfaceC0318e
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final InterfaceC0318e m5856clone() {
        return new C0328o(this.f1047d, this.f1048e.m5856clone());
    }
}
