package p298u9;

import java.util.Set;
import p081fa.InterfaceC2379g;
import p081fa.InterfaceC2393u;
import p213oa.C5691b;
import p213oa.C5692c;
import p299ub.AbstractC8611a0;
import p313v9.C8858b0;
import p313v9.C8879q;
import p358y9.InterfaceC9649u;

/* JADX INFO: renamed from: u9.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8569d implements InterfaceC9649u {

    /* JADX INFO: renamed from: a */
    public final ClassLoader f28609a;

    public C8569d(ClassLoader classLoader) {
        classLoader.getClass();
        this.f28609a = classLoader;
    }

    @Override // p358y9.InterfaceC9649u
    /* JADX INFO: renamed from: a */
    public Set mo32981a(C5692c c5692c) {
        c5692c.getClass();
        return null;
    }

    @Override // p358y9.InterfaceC9649u
    /* JADX INFO: renamed from: b */
    public InterfaceC2379g mo32982b(InterfaceC9649u.a aVar) {
        aVar.getClass();
        C5691b c5691bM37749a = aVar.m37749a();
        C5692c c5692cM22986f = c5691bM37749a.m22986f();
        String strM33068M = AbstractC8611a0.m33068M(c5691bM37749a.m22987g().m22994a(), '.', '$', false, 4, null);
        if (!c5692cM22986f.m22996c()) {
            strM33068M = c5692cM22986f.m22994a() + '.' + strM33068M;
        }
        Class clsM32984a = AbstractC8570e.m32984a(this.f28609a, strM33068M);
        if (clsM32984a != null) {
            return new C8879q(clsM32984a);
        }
        return null;
    }

    @Override // p358y9.InterfaceC9649u
    /* JADX INFO: renamed from: c */
    public InterfaceC2393u mo32983c(C5692c c5692c, boolean z10) {
        c5692c.getClass();
        return new C8858b0(c5692c);
    }
}
