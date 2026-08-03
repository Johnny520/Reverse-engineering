package p152k7;

import java.io.ByteArrayOutputStream;
import p075f6.C1075b;
import p241q7.C3445b;

/* JADX INFO: renamed from: k7.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2333c extends AbstractC2331a implements InterfaceC2335e {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: B */
    public void mo1893B(C3445b c3445b) {
        AbstractC2331a[] abstractC2331aArrMo5559L = mo5559L();
        if (abstractC2331aArrMo5559L == null) {
            return;
        }
        for (AbstractC2331a abstractC2331a : abstractC2331aArrMo5559L) {
            if (abstractC2331a != null) {
                abstractC2331a.m5545G(c3445b);
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: C */
    public int mo5544C(ByteArrayOutputStream byteArrayOutputStream) {
        AbstractC2331a[] abstractC2331aArrMo5559L;
        if (mo5555y() || (abstractC2331aArrMo5559L = mo5559L()) == null) {
            return 0;
        }
        int iM5549K = 0;
        for (AbstractC2331a abstractC2331a : abstractC2331aArrMo5559L) {
            if (abstractC2331a != null) {
                iM5549K = abstractC2331a.m5549K(byteArrayOutputStream) + iM5549K;
            }
        }
        return iM5549K;
    }

    /* JADX INFO: renamed from: L */
    public abstract AbstractC2331a[] mo5559L();

    /* JADX INFO: renamed from: N */
    public abstract void mo1891N();

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: O */
    public void mo5561O() {
        Object[] objArrMo5559L = mo5559L();
        if (objArrMo5559L == null) {
            return;
        }
        for (Object obj : objArrMo5559L) {
            if (obj instanceof InterfaceC2335e) {
                ((InterfaceC2335e) obj).mo5562c();
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.InterfaceC2335e
    /* JADX INFO: renamed from: c */
    public final void mo5562c() {
        if (mo5555y()) {
            return;
        }
        mo5560M();
        mo5561O();
        mo1891N();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: p */
    public int mo5551p() {
        AbstractC2331a[] abstractC2331aArrMo5559L;
        if (mo5555y() || (abstractC2331aArrMo5559L = mo5559L()) == null) {
            return 0;
        }
        int iMo5551p = 0;
        for (AbstractC2331a abstractC2331a : abstractC2331aArrMo5559L) {
            if (abstractC2331a != null) {
                iMo5551p = abstractC2331a.mo5551p() + iMo5551p;
            }
        }
        return iMo5551p;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: r */
    public byte[] mo5552r() {
        AbstractC2331a[] abstractC2331aArrMo5559L;
        byte[] bArrM5537o = null;
        if (mo5555y() || (abstractC2331aArrMo5559L = mo5559L()) == null) {
            return null;
        }
        for (AbstractC2331a abstractC2331a : abstractC2331aArrMo5559L) {
            if (abstractC2331a != null) {
                bArrM5537o = AbstractC2331a.m5537o(bArrM5537o, abstractC2331a.mo5552r());
            }
        }
        return bArrM5537o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p152k7.AbstractC2331a
    /* JADX INFO: renamed from: z */
    public void mo5556z(C1075b c1075b) {
        if (c1075b.f3459b) {
            return;
        }
        if (((AbstractC2331a) c1075b.f3461d) == this) {
            c1075b.f3459b = true;
            return;
        }
        AbstractC2331a[] abstractC2331aArrMo5559L = mo5559L();
        if (abstractC2331aArrMo5559L == null) {
            return;
        }
        int length = abstractC2331aArrMo5559L.length;
        for (int i9 = 0; i9 < length && !c1075b.f3459b; i9++) {
            AbstractC2331a abstractC2331a = abstractC2331aArrMo5559L[i9];
            if (abstractC2331a != null) {
                abstractC2331a.mo5556z(c1075b);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void mo5560M() {
    }
}
