package p099h;

import android.view.ViewConfiguration;
import androidx.lifecycle.C0119x;
import p116i.C1793u;
import p117i0.C1836h0;
import p117i0.C1851l;
import p293u2.InterfaceC4233c;
import p357y1.AbstractC5888h1;

/* JADX INFO: renamed from: h.g1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1460g1 {

    /* JADX INFO: renamed from: a */
    public static final float f4851a = ViewConfiguration.getScrollFriction();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static final C1793u m3988a(C1836h0 c1836h0) {
        InterfaceC4233c interfaceC4233c = (InterfaceC4233c) c1836h0.m4542j(AbstractC5888h1.f23926h);
        boolean zM4528c = c1836h0.m4528c(interfaceC4233c.mo1333d());
        Object objM4514P = c1836h0.m4514P();
        if (zM4528c || objM4514P == C1851l.f6155a) {
            objM4514P = new C1793u(new C0119x(interfaceC4233c));
            c1836h0.m4545k0(objM4514P);
        }
        return (C1793u) objM4514P;
    }
}
