package p221q;

import p056K2.C0891q;
import p095T.C1383r;
import p112W2.InterfaceC1599a;
import p112W2.InterfaceC1604f;
import p112W2.InterfaceC1607i;
import p169h0.C2204m;

/* JADX INFO: renamed from: q.a */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2893a implements InterfaceC1607i {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p112W2.InterfaceC1607i
    /* JADX INFO: renamed from: m */
    public final Object mo2857m(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, C1383r c1383r, Integer num) {
        int i5;
        String str = (String) obj;
        boolean zBooleanValue = bool.booleanValue();
        C2895c c2895c = (C2895c) obj2;
        InterfaceC1604f interfaceC1604f = (InterfaceC1604f) obj3;
        InterfaceC1599a interfaceC1599a = (InterfaceC1599a) obj4;
        int iIntValue = num.intValue();
        int i6 = iIntValue & 6;
        C2204m c2204m = C2204m.f7185a;
        if (i6 == 0) {
            i5 = (c1383r.m2582f(c2204m) ? 4 : 2) | iIntValue;
        } else {
            i5 = iIntValue;
        }
        if ((iIntValue & 48) == 0) {
            i5 |= c1383r.m2582f(str) ? 32 : 16;
        }
        if ((iIntValue & 384) == 0) {
            i5 |= c1383r.m2584g(zBooleanValue) ? 256 : 128;
        }
        if ((iIntValue & 3072) == 0) {
            i5 |= c1383r.m2582f(c2895c) ? 2048 : 1024;
        }
        if ((iIntValue & 24576) == 0) {
            i5 |= c1383r.m2586h(interfaceC1604f) ? 16384 : 8192;
        }
        if ((iIntValue & 196608) == 0) {
            i5 |= c1383r.m2586h(interfaceC1599a) ? 131072 : 65536;
        }
        if (c1383r.m2560O(i5 & 1, (599187 & i5) != 599186)) {
            AbstractC2899g.m5095c(str, zBooleanValue, c2895c, c2204m, interfaceC1604f, interfaceC1599a, c1383r, ((i5 >> 3) & 1022) | ((i5 << 9) & 7168) | (57344 & i5) | (i5 & 458752));
        } else {
            c1383r.m2563R();
        }
        return C0891q.f2780a;
    }
}
