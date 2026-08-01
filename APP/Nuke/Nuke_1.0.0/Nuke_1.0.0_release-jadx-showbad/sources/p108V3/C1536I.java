package p108V3;

import android.view.View;
import p044H3.AbstractC0648c;
import p056K2.C0891q;
import p112W2.InterfaceC1601c;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: V3.I */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1536I implements InterfaceC1601c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f5337d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ View f5338e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1536I(View view, int i5) {
        this.f5337d = i5;
        this.f5338e = view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    public final Object mo1h(Object obj) throws Throwable {
        AbstractC0648c abstractC0648c = (AbstractC0648c) obj;
        switch (this.f5337d) {
            case 0:
                AbstractC1665j.m2985e(abstractC0648c, "hooker");
                AbstractC1543P.m2812S(abstractC0648c, this.f5338e);
                break;
            default:
                AbstractC1665j.m2985e(abstractC0648c, "hooker");
                AbstractC1543P.m2812S(abstractC0648c, this.f5338e);
                break;
        }
        return C0891q.f2780a;
    }
}
