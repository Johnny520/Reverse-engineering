package p001A0;

import me.dartcv.nuke.BuildConfig;
import p007B0.AbstractC0194h;
import p041H0.InterfaceC0558E0;
import p041H0.InterfaceC0597i;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p117X2.C1675t;
import p169h0.AbstractC2206o;
import p198m0.C2567A;

/* JADX INFO: renamed from: A0.k */
/* JADX INFO: loaded from: classes.dex */
public final class C0111k extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f488e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1675t f489f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0111k(C1675t c1675t, int i5) {
        super(1);
        this.f488e = i5;
        this.f489f = c1675t;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        boolean z5;
        switch (this.f488e) {
            case 0:
                InterfaceC0597i interfaceC0597i = (InterfaceC0558E0) obj;
                if (((AbstractC2206o) interfaceC0597i).f7186d.f7199q) {
                    this.f489f.f5710e = interfaceC0597i;
                    z5 = false;
                } else {
                    z5 = true;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                AbstractC0194h abstractC0194h = (AbstractC0194h) obj;
                C1675t c1675t = this.f489f;
                Object obj2 = c1675t.f5710e;
                if (obj2 == null && abstractC0194h.f677t) {
                    c1675t.f5710e = abstractC0194h;
                } else if (obj2 != null) {
                    abstractC0194h.getClass();
                }
                break;
            default:
                this.f489f.f5710e = (C2567A) obj;
                break;
        }
        return Boolean.TRUE;
    }
}
