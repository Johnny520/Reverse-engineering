package p000A;

import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import me.dartcv.nuke.BuildConfig;
import p012C.C0233a;
import p034G.C0461f;
import p034G.C0462g;
import p034G.C0463h;
import p040H.AbstractC0548f;
import p040H.InterfaceC0547e;
import p041H0.AbstractC0601k;
import p056K2.C0891q;
import p058L.C0911M;
import p058L.C0929c0;
import p074O2.InterfaceC1046d;
import p092S0.C1259L;
import p112W2.InterfaceC1601c;
import p115X0.C1626a;
import p115X0.C1646u;
import p117X2.AbstractC1665j;
import p117X2.C1663h;
import p117X2.C1671p;
import p160f3.AbstractC2118V;
import p160f3.AbstractC2162v;
import p179i4.AbstractC2352g;
import p186k.C2442x;
import p204n0.C2683b;
import p216p.C2841e;
import p216p.C2865v;
import p232s.C3164k;
import p273z0.AbstractC3510c;
import p273z0.C3509b;

/* JADX INFO: renamed from: A.E0 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0009E0 extends C1663h implements InterfaceC1601c {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f46k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0009E0(int i5, Object obj, Class cls, String str, String str2, int i6, int i7, int i8) {
        super(i5, obj, cls, str, str2, i6, i7);
        this.f46k = i8;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0175  */
    @Override // p112W2.InterfaceC1601c
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo1h(Object obj) {
        C1626a c1626a;
        EnumC0060f0 enumC0060f0M60a;
        Integer numValueOf;
        Object[] objArr;
        Object[] objArr2;
        int i5;
        switch (this.f46k) {
            case 0:
                KeyEvent keyEvent = ((C3509b) obj).f10951a;
                C0005C0 c0005c0 = (C0005C0) this.f5693e;
                C0929c0 c0929c0 = c0005c0.f22f;
                boolean z5 = c0005c0.f20d;
                boolean z6 = true;
                if (keyEvent.getAction() != 0 || Character.isISOControl(keyEvent.getUnicodeChar())) {
                    c1626a = null;
                } else {
                    C0047Y c0047y = c0005c0.f25i;
                    c0047y.getClass();
                    int unicodeChar = keyEvent.getUnicodeChar();
                    if ((Integer.MIN_VALUE & unicodeChar) != 0) {
                        c0047y.f199a = Integer.valueOf(unicodeChar & Integer.MAX_VALUE);
                        numValueOf = null;
                    } else {
                        Integer num = c0047y.f199a;
                        if (num != null) {
                            c0047y.f199a = null;
                            int deadChar = KeyCharacterMap.getDeadChar(num.intValue(), unicodeChar);
                            Integer numValueOf2 = Integer.valueOf(deadChar);
                            if (deadChar == 0) {
                                numValueOf2 = null;
                            }
                            if (numValueOf2 != null) {
                                unicodeChar = numValueOf2.intValue();
                            }
                            numValueOf = Integer.valueOf(unicodeChar);
                        } else {
                            numValueOf = Integer.valueOf(unicodeChar);
                        }
                    }
                    if (numValueOf != null) {
                        c1626a = new C1626a(new StringBuilder().appendCodePoint(numValueOf.intValue()).toString(), 1);
                    }
                }
                if (c1626a != null) {
                    if (z5) {
                        c0005c0.m4a(AbstractC2352g.m4211y(c1626a));
                        c0929c0.f2917a = null;
                    } else {
                        z6 = false;
                    }
                } else if (AbstractC3510c.m5765c(keyEvent) == 2 && (enumC0060f0M60a = c0005c0.f26j.m60a(keyEvent)) != null && (!enumC0060f0M60a.f286d || z5)) {
                    C1671p c1671p = new C1671p();
                    c1671p.f5705d = true;
                    C0075n c0075n = new C0075n(enumC0060f0M60a, c0005c0, c1671p, 3);
                    C1646u c1646u = c0005c0.f19c;
                    C0911M c0911m = new C0911M(c1646u, c0005c0.f23g, c0005c0.f17a.m123d(), c0929c0);
                    c0075n.mo1h(c0911m);
                    if (!C1259L.m2334b(c0911m.f2834f, c1646u.f5651b) || !AbstractC1665j.m2981a(c0911m.f2835g, c1646u.f5650a)) {
                        c0005c0.f27k.mo1h(C1646u.m2944a(c1646u, c0911m.f2835g, c0911m.f2834f, 4));
                    }
                    C0040U0 c0040u0 = c0005c0.f24h;
                    if (c0040u0 != null) {
                        c0040u0.f179e = true;
                    }
                    z6 = c1671p.f5705d;
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                long j5 = ((C2683b) obj).f8556a;
                C0463h c0463h = (C0463h) this.f5693e;
                c0463h.getClass();
                InterfaceC0547e interfaceC0547e = (InterfaceC0547e) AbstractC0601k.m1032h(c0463h, AbstractC0548f.f1661a);
                if (interfaceC0547e != null) {
                    AbstractC2162v.m3994p(c0463h.m4023x0(), null, new C0462g(c0463h, j5, interfaceC0547e, new C0461f(c0463h, j5), (InterfaceC1046d) null), 3);
                }
                break;
            case 2:
                ((C0233a) this.f5693e).f786b.m4243a((InterfaceC1601c) obj);
                break;
            case 3:
                ((AbstractC2118V) this.f5693e).mo3885l((Throwable) obj);
                break;
            default:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                C2865v c2865v = (C2865v) this.f5693e;
                C2442x c2442x = c2865v.f9037E;
                if (zBooleanValue) {
                    c2865v.m5066Q0();
                } else {
                    InterfaceC1046d interfaceC1046d = null;
                    if (c2865v.f9046t != null) {
                        Object[] objArr3 = c2442x.f7889c;
                        long[] jArr = c2442x.f7887a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j6 = jArr[i6];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8;
                                    int i8 = 8 - ((~(i6 - length)) >>> 31);
                                    int i9 = 0;
                                    while (i9 < i8) {
                                        if ((255 & j6) < 128) {
                                            i5 = i7;
                                            objArr2 = objArr3;
                                            AbstractC2162v.m3994p(c2865v.m4023x0(), null, new C2841e(c2865v, (C3164k) objArr3[(i6 << 3) + i9], interfaceC1046d, 0), 3);
                                        } else {
                                            objArr2 = objArr3;
                                            i5 = i7;
                                        }
                                        j6 >>= i5;
                                        i9++;
                                        i7 = i5;
                                        objArr3 = objArr2;
                                    }
                                    objArr = objArr3;
                                    if (i8 == i7) {
                                    }
                                } else {
                                    objArr = objArr3;
                                }
                                if (i6 != length) {
                                    i6++;
                                    objArr3 = objArr;
                                }
                            }
                        }
                        C3164k c3164k = c2865v.f9039G;
                        if (c3164k != null) {
                            AbstractC2162v.m3994p(c2865v.m4023x0(), null, new C2841e(c2865v, c3164k, interfaceC1046d, 1), 3);
                        }
                    }
                    c2442x.m4352a();
                    c2865v.f9039G = null;
                }
                break;
        }
        return C0891q.f2780a;
    }
}
