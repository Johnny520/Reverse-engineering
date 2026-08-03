package p144k;

import ac.AbstractC0063p;
import ac.C0058k;
import android.view.KeyEvent;
import java.util.ArrayList;
import p057e1.C0807b;
import p174m.AbstractC2677y2;
import p224p1.C3287b;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p339x1.AbstractC5618k;
import p357y1.AbstractC5888h1;
import p357y1.InterfaceC5905l2;

/* JADX INFO: renamed from: k.w */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C2219w extends AbstractC2171g {

    /* JADX INFO: renamed from: R */
    public C3914t f7348R;

    /* JADX INFO: renamed from: S */
    public C3287b f7349S;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A1 */
    public final void m5457A1(boolean z9) {
        if (z9) {
            this.f7349S = null;
        } else {
            this.f7348R = null;
        }
        m5393r1(z9);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p144k.AbstractC2171g, p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: P */
    public final void mo1608P(C3903k c3903k, EnumC3905l enumC3905l, long j3) {
        super.mo1608P(c3903k, enumC3905l, j3);
        if (enumC3905l != EnumC3905l.f12813h) {
            if (enumC3905l != EnumC3905l.f12814i || this.f7348R == null) {
                return;
            }
            ?? r72 = c3903k.f12800a;
            int size = r72.size();
            for (int i9 = 0; i9 < size; i9++) {
                C3914t c3914t = (C3914t) r72.get(i9);
                if (c3914t.m8119b() && !c3914t.equals(this.f7348R)) {
                    m5457A1(false);
                    return;
                }
            }
            return;
        }
        if (this.f7348R == null) {
            if (AbstractC2677y2.m6120e(c3903k, true)) {
                C3914t c3914t2 = (C3914t) c3903k.f12800a.get(0);
                c3914t2.m8118a();
                this.f7348R = c3914t2;
                if (this.f7190B) {
                    m5396u1(c3914t2);
                    return;
                }
                return;
            }
            return;
        }
        ?? r73 = c3903k.f12800a;
        int size2 = r73.size();
        for (int i10 = 0; i10 < size2; i10++) {
            if (!AbstractC3913s.m8110c((C3914t) r73.get(i10))) {
                long jM5392q1 = m5392q1(j3);
                int size3 = r73.size();
                for (int i11 = 0; i11 < size3; i11++) {
                    C3914t c3914t3 = (C3914t) r73.get(i11);
                    if (c3914t3.m8119b() || AbstractC3913s.m8113f(c3914t3, j3, jM5392q1)) {
                        m5457A1(false);
                        return;
                    }
                }
                return;
            }
        }
        ((C3914t) r73.get(0)).m8118a();
        if (this.f7190B) {
            C3914t c3914t4 = this.f7348R;
            c3914t4.getClass();
            m5394s1(c3914t4.f12836c, false);
            this.f7191C.invoke();
        }
        this.f7348R = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p224p1.InterfaceC3288c
    /* JADX INFO: renamed from: T0 */
    public final void mo5377T0(C0058k c0058k, EnumC3905l enumC3905l) {
        ArrayList arrayList = (ArrayList) c0058k.f177i;
        m5397v1();
        if (this.f7190B && this.f7195G == null) {
            C2187l0 c2187l0 = new C2187l0(this);
            m10122k1(c2187l0);
            this.f7195G = c2187l0;
        }
        if (enumC3905l != EnumC3905l.f12813h) {
            if (enumC3905l != EnumC3905l.f12814i || this.f7349S == null) {
                return;
            }
            int size = arrayList.size();
            for (int i9 = 0; i9 < size; i9++) {
                C3287b c3287b = (C3287b) arrayList.get(i9);
                if (c3287b.f10458i && !c3287b.equals(this.f7349S)) {
                    m5457A1(true);
                    return;
                }
            }
            return;
        }
        if (this.f7349S == null) {
            int size2 = arrayList.size();
            for (int i10 = 0; i10 < size2; i10++) {
                if (AbstractC0063p.m417j((C3287b) arrayList.get(i10))) {
                    C3287b c3287b2 = (C3287b) arrayList.get(0);
                    c3287b2.f10458i = true;
                    this.f7349S = c3287b2;
                    if (this.f7190B) {
                        m5395t1(c3287b2);
                        return;
                    }
                    return;
                }
            }
            return;
        }
        int size3 = arrayList.size();
        for (int i11 = 0; i11 < size3; i11++) {
            C3287b c3287b3 = (C3287b) arrayList.get(i11);
            if (c3287b3.f10458i || !c3287b3.f10457h || c3287b3.f10453d) {
                float fMo10228f = ((InterfaceC5905l2) AbstractC5618k.m10152h(this, AbstractC5888h1.f23938t)).mo10228f();
                int size4 = arrayList.size();
                for (int i12 = 0; i12 < size4; i12++) {
                    C3287b c3287b4 = (C3287b) arrayList.get(i12);
                    long j3 = c3287b4.f10452c;
                    C3287b c3287b5 = this.f7349S;
                    c3287b5.getClass();
                    boolean z9 = Math.abs(C0807b.m2040c(C0807b.m2041d(j3, c3287b5.f10452c))) > fMo10228f;
                    if (c3287b4.f10458i || z9) {
                        m5457A1(true);
                        return;
                    }
                }
                return;
            }
        }
        ((C3287b) arrayList.get(0)).f10458i = true;
        if (this.f7190B) {
            C3287b c3287b6 = this.f7349S;
            c3287b6.getClass();
            m5394s1(c3287b6.f10452c, true);
            this.f7191C.invoke();
        }
        this.f7349S = null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g, p339x1.InterfaceC5656w1
    /* JADX INFO: renamed from: b0 */
    public final void mo1611b0() {
        super.mo1611b0();
        m5457A1(false);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g
    /* JADX INFO: renamed from: x1 */
    public final boolean mo5381x1(KeyEvent keyEvent) {
        return false;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p224p1.InterfaceC3288c
    /* JADX INFO: renamed from: y0 */
    public final void mo5382y0() {
        m5457A1(true);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p144k.AbstractC2171g
    /* JADX INFO: renamed from: y1 */
    public final void mo5383y1(KeyEvent keyEvent) {
        this.f7191C.invoke();
    }
}
