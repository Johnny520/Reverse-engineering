package p116i;

import p085fg.InterfaceC1231l;
import p136j8.C2104o;
import p144k.C2187l0;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p276sf.C3967n;
import p322w0.AbstractC4655f;
import p322w0.AbstractC4662m;
import p322w0.C4659j;
import p339x1.InterfaceC5600e2;

/* JADX INFO: renamed from: i.x0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1802x0 implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f6012g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ InterfaceC1231l f6013h;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1802x0(InterfaceC1231l interfaceC1231l, int i9) {
        this.f6012g = i9;
        this.f6013h = interfaceC1231l;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f6012g) {
            case 0:
                InterfaceC1231l interfaceC1231l = this.f6013h;
                Long l10 = (Long) obj;
                l10.getClass();
                return interfaceC1231l.invoke(l10);
            case 1:
                InterfaceC1231l interfaceC1231l2 = this.f6013h;
                InterfaceC5600e2 interfaceC5600e2 = (InterfaceC5600e2) obj;
                if (!(interfaceC5600e2 instanceof C2187l0)) {
                    C2104o.m5276A("Node is not a GestureNode instance");
                    return null;
                }
                Boolean bool = (Boolean) interfaceC1231l2.invoke(((C2187l0) interfaceC5600e2).f7263u);
                bool.getClass();
                return bool;
            case 2:
                AbstractC4655f abstractC4655f = (AbstractC4655f) this.f6013h.invoke((C4659j) obj);
                synchronized (AbstractC4662m.f15512c) {
                    AbstractC4662m.f15513d = AbstractC4662m.f15513d.m9119f(abstractC4655f.mo9109g());
                }
                return abstractC4655f;
            case 3:
                InterfaceC1231l interfaceC1231l3 = this.f6013h;
                String str = (String) obj;
                str.getClass();
                interfaceC1231l3.invoke(AbstractC3149m.m6701P0(19, str));
                return C3967n.f12976a;
            case 4:
                InterfaceC1231l interfaceC1231l4 = this.f6013h;
                String str2 = (String) obj;
                str2.getClass();
                StringBuilder sb2 = new StringBuilder();
                int length = str2.length();
                for (int i9 = 0; i9 < length; i9++) {
                    char cCharAt = str2.charAt(i9);
                    if (Character.isDigit(cCharAt)) {
                        sb2.append(cCharAt);
                    }
                }
                interfaceC1231l4.invoke(sb2.toString());
                return C3967n.f12976a;
            case 5:
                InterfaceC1231l interfaceC1231l5 = this.f6013h;
                String str3 = (String) obj;
                str3.getClass();
                StringBuilder sb3 = new StringBuilder();
                int length2 = str3.length();
                for (int i10 = 0; i10 < length2; i10++) {
                    char cCharAt2 = str3.charAt(i10);
                    if (Character.isDigit(cCharAt2)) {
                        sb3.append(cCharAt2);
                    }
                }
                interfaceC1231l5.invoke(AbstractC3149m.m6701P0(3, sb3.toString()));
                return C3967n.f12976a;
            case 6:
                InterfaceC1231l interfaceC1231l6 = this.f6013h;
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                interfaceC1231l6.invoke(bool2);
                return C3967n.f12976a;
            case 7:
                InterfaceC1231l interfaceC1231l7 = this.f6013h;
                String str4 = (String) obj;
                str4.getClass();
                Integer numM6741e0 = AbstractC3156t.m6741e0(10, str4);
                interfaceC1231l7.invoke(Integer.valueOf(numM6741e0 != null ? numM6741e0.intValue() : 0));
                return C3967n.f12976a;
            case 8:
                InterfaceC1231l interfaceC1231l8 = this.f6013h;
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                interfaceC1231l8.invoke(bool3);
                return C3967n.f12976a;
            case 9:
                InterfaceC1231l interfaceC1231l9 = this.f6013h;
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                interfaceC1231l9.invoke(bool4);
                return C3967n.f12976a;
            case 10:
                InterfaceC1231l interfaceC1231l10 = this.f6013h;
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                interfaceC1231l10.invoke(bool5);
                return C3967n.f12976a;
            case 11:
                InterfaceC1231l interfaceC1231l11 = this.f6013h;
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                interfaceC1231l11.invoke(bool6);
                return C3967n.f12976a;
            case 12:
                InterfaceC1231l interfaceC1231l12 = this.f6013h;
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                interfaceC1231l12.invoke(bool7);
                return C3967n.f12976a;
            case 13:
                this.f6013h.invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                return C3967n.f12976a;
            default:
                this.f6013h.invoke(Integer.valueOf((int) ((Float) obj).floatValue()));
                return C3967n.f12976a;
        }
    }
}
