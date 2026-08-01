package p046I;

import p000A.InterfaceC0092v0;
import p007B0.C0185S;
import p049I2.C0793k;
import p056K2.C0891q;
import p074O2.InterfaceC1046d;
import p084Q2.AbstractC1183h;
import p112W2.InterfaceC1603e;
import p154e2.C2029h;

/* JADX INFO: renamed from: I.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0656c extends AbstractC1183h implements InterfaceC1603e {

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ int f2075f = 0;

    /* JADX INFO: renamed from: g */
    public int f2076g;

    /* JADX INFO: renamed from: h */
    public /* synthetic */ Object f2077h;

    /* JADX INFO: renamed from: i */
    public Object f2078i;

    /* JADX INFO: renamed from: j */
    public Object f2079j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2080k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656c(C0657d c0657d, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2080k = c0657d;
    }

    @Override // p112W2.InterfaceC1603e
    /* JADX INFO: renamed from: g */
    public final Object mo0g(Object obj, Object obj2) {
        C0185S c0185s = (C0185S) obj;
        InterfaceC1046d interfaceC1046d = (InterfaceC1046d) obj2;
        switch (this.f2075f) {
        }
        return ((C0656c) mo7n(interfaceC1046d, c0185s)).mo8p(C0891q.f2780a);
    }

    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: n */
    public final InterfaceC1046d mo7n(InterfaceC1046d interfaceC1046d, Object obj) {
        switch (this.f2075f) {
            case 0:
                C0656c c0656c = new C0656c((C0657d) this.f2080k, interfaceC1046d);
                c0656c.f2077h = obj;
                return c0656c;
            default:
                C0656c c0656c2 = new C0656c((C0793k) this.f2078i, (C2029h) this.f2079j, (InterfaceC0092v0) this.f2080k, interfaceC1046d);
                c0656c2.f2077h = obj;
                return c0656c2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:183:0x031b, code lost:
    
        if (r6 != r8) goto L185;
     */
    /* JADX WARN: Code restructure failed: missing block: B:233:0x0298, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:?, code lost:
    
        return r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0142, code lost:
    
        if (r10 == r9) goto L62;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0144, code lost:
    
        r8 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x01b4, code lost:
    
        if (r12 == r9) goto L62;
     */
    /* JADX WARN: Path cross not found for [B:77:0x0197, B:72:0x0176], limit reached: 235 */
    /* JADX WARN: Path cross not found for [B:80:0x019c, B:83:0x01a2], limit reached: 235 */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c8  */
    /* JADX WARN: Type inference failed for: r10v16, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r12v17, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v3, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:183:0x031b -> B:185:0x031f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x01b4 -> B:88:0x01b7). Please report as a decompilation issue!!! */
    @Override // p084Q2.AbstractC1176a
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo8p(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 868
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p046I.C0656c.mo8p(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0656c(C0793k c0793k, C2029h c2029h, InterfaceC0092v0 interfaceC0092v0, InterfaceC1046d interfaceC1046d) {
        super(2, interfaceC1046d);
        this.f2078i = c0793k;
        this.f2079j = c2029h;
        this.f2080k = interfaceC0092v0;
    }
}
