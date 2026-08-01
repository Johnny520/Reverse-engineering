package p198m0;

import p029F0.InterfaceC0396e;
import p041H0.AbstractC0601k;
import p047I0.ViewTreeObserverOnGlobalLayoutListenerC0772y;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1666k;
import p170h1.C2214e;
import p204n0.C2684c;

/* JADX INFO: renamed from: m0.C */
/* JADX INFO: loaded from: classes.dex */
public final class C2569C extends AbstractC1666k implements InterfaceC1601c {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f8195e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ C2567A f8196f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2567A f8197g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f8198h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ C2214e f8199i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f8200j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2569C(C2567A c2567a, C2567A c2567a2, Object obj, int i5, C2214e c2214e, int i6) {
        super(1);
        this.f8195e = i6;
        this.f8196f = c2567a;
        this.f8197g = c2567a2;
        this.f8200j = obj;
        this.f8198h = i5;
        this.f8199i = c2214e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) {
        switch (this.f8195e) {
            case 0:
                InterfaceC0396e interfaceC0396e = (InterfaceC0396e) obj;
                C2567A c2567a = this.f8197g;
                if (this.f8196f != ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a)).getFocusOwner()).m4531f()) {
                    return Boolean.TRUE;
                }
                boolean zM4492B = AbstractC2573d.m4492B(c2567a, (C2567A) this.f8200j, this.f8198h, this.f8199i);
                Boolean boolValueOf = Boolean.valueOf(zM4492B);
                if (zM4492B || !interfaceC0396e.mo669a()) {
                    return boolValueOf;
                }
                return null;
            default:
                InterfaceC0396e interfaceC0396e2 = (InterfaceC0396e) obj;
                C2567A c2567a2 = this.f8197g;
                if (this.f8196f != ((C2584o) ((ViewTreeObserverOnGlobalLayoutListenerC0772y) AbstractC0601k.m1045u(c2567a2)).getFocusOwner()).m4531f()) {
                    return Boolean.TRUE;
                }
                boolean zM4491A = AbstractC2573d.m4491A(this.f8198h, this.f8199i, c2567a2, (C2684c) this.f8200j);
                Boolean boolValueOf2 = Boolean.valueOf(zM4491A);
                if (zM4491A || !interfaceC0396e2.mo669a()) {
                    return boolValueOf2;
                }
                return null;
        }
    }
}
