package p007B0;

import p023E0.AbstractC0277a;
import p041H0.EnumC0556D0;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p117X2.C1671p;
import p121Y1.C1753n;
import p187k0.C2449e;

/* JADX INFO: renamed from: B0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C0192f extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f673e = 0;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C1671p f674f;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192f(C1671p c1671p) {
        super(1);
        this.f674f = c1671p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f673e) {
            case 0:
                if (((AbstractC0194h) obj).f677t) {
                    this.f674f.f5705d = false;
                }
                break;
            default:
                C2449e c2449e = (C2449e) obj;
                if (c2449e.f7199q) {
                    if (c2449e.f7910s != null) {
                        AbstractC0277a.m483b("DragAndDropTarget self reference must be null at the start of a drag and drop session");
                    }
                    c2449e.f7910s = null;
                    C1671p c1671p = this.f674f;
                    c1671p.f5705d = c1671p.f5705d;
                }
                break;
        }
        return EnumC0556D0.f1668d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0192f(C1753n c1753n, C2449e c2449e, C1671p c1671p) {
        super(1);
        this.f674f = c1671p;
    }
}
