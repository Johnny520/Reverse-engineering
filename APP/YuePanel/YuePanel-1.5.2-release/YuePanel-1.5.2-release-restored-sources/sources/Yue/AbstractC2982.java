package Yue;

import Yue.InterfaceC4225;
import Yue.InterfaceC4225.InterfaceC0357;

/* JADX INFO: renamed from: Yue.ۥ۟۟ۡ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7470(version = "1.3")
@InterfaceC4772
public abstract class AbstractC2982<B extends InterfaceC4225.InterfaceC0357, E extends B> implements InterfaceC4225.InterfaceC4228<E> {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC5124<InterfaceC4225.InterfaceC0357, E> f4317;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    @InterfaceC6399
    public final InterfaceC4225.InterfaceC4228<?> f4318;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [Yue.ۥ۟ۧۦۥ$ۥ۟۟<?>] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v0, types: [Yue.ۥۣ۠ۡ۟<? super Yue.ۥ۟ۧۦۥ$ۥ۟, ? extends E extends B>, Yue.ۥۣ۠ۡ۟<Yue.ۥ۟ۧۦۥ$ۥ۟, E extends B>, java.lang.Object] */
    public AbstractC2982(@InterfaceC6399 InterfaceC4225.InterfaceC4228<B> interfaceC4228, @InterfaceC6399 InterfaceC5124<? super InterfaceC4225.InterfaceC0357, ? extends E> interfaceC5124) {
        C5499.m17103(interfaceC4228, "baseKey");
        C5499.m17103(interfaceC5124, "safeCast");
        this.f4317 = interfaceC5124;
        this.f4318 = interfaceC4228 instanceof AbstractC2982 ? (InterfaceC4225.InterfaceC4228<B>) ((AbstractC2982) interfaceC4228).f4318 : interfaceC4228;
    }

    /* JADX INFO: renamed from: ۥ */
    public final boolean m42(@InterfaceC6399 InterfaceC4225.InterfaceC4228<?> interfaceC4228) {
        C5499.m17103(interfaceC4228, C6659.f17103);
        return interfaceC4228 == this || this.f4318 == interfaceC4228;
    }

    /* JADX WARN: Incorrect return type in method signature: (LYue/ۥ۟ۧۦۥ$ۥ۟;)TE; */
    @InterfaceC6489
    /* JADX INFO: renamed from: ۥ۟ */
    public final InterfaceC4225.InterfaceC0357 m43(@InterfaceC6399 InterfaceC4225.InterfaceC0357 interfaceC0357) {
        C5499.m17103(interfaceC0357, "element");
        return (InterfaceC4225.InterfaceC0357) this.f4317.invoke(interfaceC0357);
    }
}
