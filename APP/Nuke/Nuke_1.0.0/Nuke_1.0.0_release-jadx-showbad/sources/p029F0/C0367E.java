package p029F0;

import java.util.List;
import java.util.Map;
import p023E0.AbstractC0277a;
import p041H0.C0564I;
import p041H0.EnumC0557E;
import p105V.C1480b;
import p105V.C1483e;
import p112W2.InterfaceC1601c;
import p112W2.InterfaceC1603e;
import p153e1.EnumC2017m;
import p186k.C2408E;

/* JADX INFO: renamed from: F0.E */
/* JADX INFO: loaded from: classes.dex */
public final class C0367E implements InterfaceC0415n0 {

    /* JADX INFO: renamed from: d */
    public EnumC2017m f1154d = EnumC2017m.f6743e;

    /* JADX INFO: renamed from: e */
    public float f1155e;

    /* JADX INFO: renamed from: f */
    public float f1156f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C0373K f1157g;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0367E(C0373K c0373k) {
        this.f1157g = c0373k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    @Override // p029F0.InterfaceC0415n0
    /* JADX INFO: renamed from: J */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final List mo603J(InterfaceC1603e interfaceC1603e, Object obj) {
        Object obj2;
        C0373K c0373k = this.f1157g;
        c0373k.m622g();
        C0564I c0564i = c0373k.f1171d;
        EnumC0557E enumC0557E = c0564i.f1700K.f1748d;
        EnumC0557E enumC0557E2 = EnumC0557E.f1674f;
        EnumC0557E enumC0557E3 = EnumC0557E.f1672d;
        if (enumC0557E != enumC0557E3 && enumC0557E != enumC0557E2 && enumC0557E != EnumC0557E.f1673e && enumC0557E != EnumC0557E.f1675g) {
            AbstractC0277a.m483b("subcompose can only be used inside the measure or layout blocks");
        }
        C2408E c2408e = c0373k.f1177j;
        Object objM4272g = c2408e.m4272g(obj);
        if (objM4272g == null) {
            objM4272g = (C0564I) c0373k.f1180m.m4276k(obj);
            if (objM4272g != null) {
                if (c0373k.f1185r <= 0) {
                    AbstractC0277a.m483b("Check failed.");
                }
                c0373k.f1185r--;
            } else {
                objM4272g = c0373k.m627l(obj);
                if (objM4272g == null) {
                    int i5 = c0373k.f1174g;
                    C0564I c0564i2 = new C0564I(2);
                    c0564i.f1728u = true;
                    c0564i.m793A(i5, c0564i2);
                    c0564i.f1728u = false;
                    objM4272g = c0564i2;
                }
            }
            c2408e.m4278m(obj, objM4272g);
        }
        C0564I c0564i3 = (C0564I) objM4272g;
        List listM833o = c0564i.m833o();
        int i6 = c0373k.f1174g;
        if (i6 >= 0) {
            C1480b c1480b = (C1480b) listM833o;
            obj2 = i6 < ((C1483e) c1480b.f5173e).f5183f ? c1480b.get(i6) : null;
        }
        if (obj2 != c0564i3) {
            int iM2760i = ((C1483e) ((C1480b) c0564i.m833o()).f5173e).m2760i(c0564i3);
            if (iM2760i < c0373k.f1174g) {
                AbstractC0277a.m482a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i7 = c0373k.f1174g;
            if (i7 != iM2760i) {
                c0373k.m624i(iM2760i, i7);
            }
        }
        c0373k.f1174g++;
        c0373k.m626k(c0564i3, obj, false, interfaceC1603e);
        return (enumC0557E == enumC0557E3 || enumC0557E == enumC0557E2) ? c0564i3.m831m() : c0564i3.m830l();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: b */
    public final float mo272b() {
        return this.f1155e;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    public final EnumC2017m getLayoutDirection() {
        return this.f1154d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p153e1.InterfaceC2007c
    /* JADX INFO: renamed from: p */
    public final float mo282p() {
        return this.f1156f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0379Q
    /* JADX INFO: renamed from: r */
    public final InterfaceC0378P mo605r(int i5, int i6, Map map, InterfaceC1601c interfaceC1601c, InterfaceC1601c interfaceC1601c2) {
        if ((i5 & (-16777216)) != 0 || ((-16777216) & i6) != 0) {
            AbstractC0277a.m483b("Size(" + i5 + " x " + i6 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new C0366D(i5, i6, map, interfaceC1601c, this, this.f1157g, interfaceC1601c2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p029F0.InterfaceC0420q
    /* JADX INFO: renamed from: z */
    public final boolean mo606z() {
        EnumC0557E enumC0557E = this.f1157g.f1171d.f1700K.f1748d;
        return enumC0557E == EnumC0557E.f1675g || enumC0557E == EnumC0557E.f1673e;
    }
}
