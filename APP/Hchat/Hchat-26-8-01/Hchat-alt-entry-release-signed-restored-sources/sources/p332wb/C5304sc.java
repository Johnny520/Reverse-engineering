package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import okhttp3.HttpUrl;
import p025bc.AbstractC0255e;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p117i0.C1823e;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p129ig.AbstractC2043a;
import p218og.AbstractC3149m;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.sc */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5304sc implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f20631g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Context f20632h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ SharedPreferences f20633i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f20634j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f20635k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C5304sc(int i9, Context context, SharedPreferences sharedPreferences, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12) {
        this.f20631g = i9;
        this.f20632h = context;
        this.f20633i = sharedPreferences;
        this.f20634j = interfaceC1809a1;
        this.f20635k = interfaceC1809a12;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC1220a interfaceC1220a;
        switch (this.f20631g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final InterfaceC1809a1 interfaceC1809a1 = this.f20634j;
                    String str = (String) interfaceC1809a1.getValue();
                    final Context context = this.f20632h;
                    boolean zM4538h = c1836h0.m4538h(context);
                    final SharedPreferences sharedPreferences = this.f20633i;
                    boolean zM4538h2 = zM4538h | c1836h0.m4538h(sharedPreferences);
                    Object objM4514P = c1836h0.m4514P();
                    C1823e c1823e = C1851l.f6155a;
                    if (zM4538h2 || objM4514P == c1823e) {
                        final int i9 = 0;
                        objM4514P = new InterfaceC1220a() { // from class: wb.bg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i9) {
                                    case 0:
                                        String strM1018g = AbstractC0255e.m1018g(System.nanoTime(), "bubble-");
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        Context context2 = context;
                                        AbstractC4955ho.m9447U0(context2, strM1018g, new C5337tc(sharedPreferences2, context2, interfaceC1809a1, 9));
                                        break;
                                    case 1:
                                        InterfaceC1809a1 interfaceC1809a12 = interfaceC1809a1;
                                        String str2 = (String) interfaceC1809a12.getValue();
                                        interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                        sharedPreferences.edit().remove("bubble_icon").apply();
                                        AbstractC2043a.m5039m(context, str2);
                                        break;
                                    case 2:
                                        String strM1018g2 = AbstractC0255e.m1018g(System.nanoTime(), "bubble-dark-");
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        Context context3 = context;
                                        AbstractC4955ho.m9447U0(context3, strM1018g2, new C5337tc(sharedPreferences3, context3, interfaceC1809a1, 8));
                                        break;
                                    default:
                                        InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a1;
                                        String str3 = (String) interfaceC1809a13.getValue();
                                        interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                        sharedPreferences.edit().remove("bubble_dark_icon").apply();
                                        AbstractC2043a.m5039m(context, str3);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P);
                    }
                    InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) objM4514P;
                    InterfaceC1220a interfaceC1220a3 = null;
                    if (AbstractC3149m.m6721t0((String) interfaceC1809a1.getValue())) {
                        c1836h0.m4525a0(-1218492592);
                        c1836h0.m4553p(false);
                        interfaceC1220a = null;
                    } else {
                        c1836h0.m4525a0(-1218470271);
                        boolean zM4538h3 = c1836h0.m4538h(sharedPreferences) | c1836h0.m4538h(context);
                        Object objM4514P2 = c1836h0.m4514P();
                        if (zM4538h3 || objM4514P2 == c1823e) {
                            final int i10 = 1;
                            objM4514P2 = new InterfaceC1220a() { // from class: wb.bg
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i10) {
                                        case 0:
                                            String strM1018g = AbstractC0255e.m1018g(System.nanoTime(), "bubble-");
                                            SharedPreferences sharedPreferences2 = sharedPreferences;
                                            Context context2 = context;
                                            AbstractC4955ho.m9447U0(context2, strM1018g, new C5337tc(sharedPreferences2, context2, interfaceC1809a1, 9));
                                            break;
                                        case 1:
                                            InterfaceC1809a1 interfaceC1809a12 = interfaceC1809a1;
                                            String str2 = (String) interfaceC1809a12.getValue();
                                            interfaceC1809a12.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                            sharedPreferences.edit().remove("bubble_icon").apply();
                                            AbstractC2043a.m5039m(context, str2);
                                            break;
                                        case 2:
                                            String strM1018g2 = AbstractC0255e.m1018g(System.nanoTime(), "bubble-dark-");
                                            SharedPreferences sharedPreferences3 = sharedPreferences;
                                            Context context3 = context;
                                            AbstractC4955ho.m9447U0(context3, strM1018g2, new C5337tc(sharedPreferences3, context3, interfaceC1809a1, 8));
                                            break;
                                        default:
                                            InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a1;
                                            String str3 = (String) interfaceC1809a13.getValue();
                                            interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                            sharedPreferences.edit().remove("bubble_dark_icon").apply();
                                            AbstractC2043a.m5039m(context, str3);
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P2);
                        }
                        c1836h0.m4553p(false);
                        interfaceC1220a = (InterfaceC1220a) objM4514P2;
                    }
                    AbstractC4955ho.m9415Q0("浅色模式图标", str, "未选择时使用内置快捷菜单图标", interfaceC1220a2, interfaceC1220a, c1836h0, 390);
                    AbstractC4955ho.m9312D1(0.0f, c1836h0, 0, 1);
                    final InterfaceC1809a1 interfaceC1809a12 = this.f20635k;
                    String str2 = (String) interfaceC1809a12.getValue();
                    boolean zM4538h4 = c1836h0.m4538h(context) | c1836h0.m4538h(sharedPreferences);
                    Object objM4514P3 = c1836h0.m4514P();
                    if (zM4538h4 || objM4514P3 == c1823e) {
                        final int i11 = 2;
                        objM4514P3 = new InterfaceC1220a() { // from class: wb.bg
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                switch (i11) {
                                    case 0:
                                        String strM1018g = AbstractC0255e.m1018g(System.nanoTime(), "bubble-");
                                        SharedPreferences sharedPreferences2 = sharedPreferences;
                                        Context context2 = context;
                                        AbstractC4955ho.m9447U0(context2, strM1018g, new C5337tc(sharedPreferences2, context2, interfaceC1809a12, 9));
                                        break;
                                    case 1:
                                        InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a12;
                                        String str22 = (String) interfaceC1809a122.getValue();
                                        interfaceC1809a122.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                        sharedPreferences.edit().remove("bubble_icon").apply();
                                        AbstractC2043a.m5039m(context, str22);
                                        break;
                                    case 2:
                                        String strM1018g2 = AbstractC0255e.m1018g(System.nanoTime(), "bubble-dark-");
                                        SharedPreferences sharedPreferences3 = sharedPreferences;
                                        Context context3 = context;
                                        AbstractC4955ho.m9447U0(context3, strM1018g2, new C5337tc(sharedPreferences3, context3, interfaceC1809a12, 8));
                                        break;
                                    default:
                                        InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a12;
                                        String str3 = (String) interfaceC1809a13.getValue();
                                        interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                        sharedPreferences.edit().remove("bubble_dark_icon").apply();
                                        AbstractC2043a.m5039m(context, str3);
                                        break;
                                }
                                return C3967n.f12976a;
                            }
                        };
                        c1836h0.m4545k0(objM4514P3);
                    }
                    InterfaceC1220a interfaceC1220a4 = (InterfaceC1220a) objM4514P3;
                    if (AbstractC3149m.m6721t0((String) interfaceC1809a12.getValue())) {
                        c1836h0.m4525a0(-1217215888);
                    } else {
                        c1836h0.m4525a0(-1217193164);
                        boolean zM4538h5 = c1836h0.m4538h(sharedPreferences) | c1836h0.m4538h(context);
                        Object objM4514P4 = c1836h0.m4514P();
                        if (zM4538h5 || objM4514P4 == c1823e) {
                            final int i12 = 3;
                            objM4514P4 = new InterfaceC1220a() { // from class: wb.bg
                                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                                @Override // p085fg.InterfaceC1220a
                                public final Object invoke() {
                                    switch (i12) {
                                        case 0:
                                            String strM1018g = AbstractC0255e.m1018g(System.nanoTime(), "bubble-");
                                            SharedPreferences sharedPreferences2 = sharedPreferences;
                                            Context context2 = context;
                                            AbstractC4955ho.m9447U0(context2, strM1018g, new C5337tc(sharedPreferences2, context2, interfaceC1809a12, 9));
                                            break;
                                        case 1:
                                            InterfaceC1809a1 interfaceC1809a122 = interfaceC1809a12;
                                            String str22 = (String) interfaceC1809a122.getValue();
                                            interfaceC1809a122.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                            sharedPreferences.edit().remove("bubble_icon").apply();
                                            AbstractC2043a.m5039m(context, str22);
                                            break;
                                        case 2:
                                            String strM1018g2 = AbstractC0255e.m1018g(System.nanoTime(), "bubble-dark-");
                                            SharedPreferences sharedPreferences3 = sharedPreferences;
                                            Context context3 = context;
                                            AbstractC4955ho.m9447U0(context3, strM1018g2, new C5337tc(sharedPreferences3, context3, interfaceC1809a12, 8));
                                            break;
                                        default:
                                            InterfaceC1809a1 interfaceC1809a13 = interfaceC1809a12;
                                            String str3 = (String) interfaceC1809a13.getValue();
                                            interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                                            sharedPreferences.edit().remove("bubble_dark_icon").apply();
                                            AbstractC2043a.m5039m(context, str3);
                                            break;
                                    }
                                    return C3967n.f12976a;
                                }
                            };
                            c1836h0.m4545k0(objM4514P4);
                        }
                        interfaceC1220a3 = (InterfaceC1220a) objM4514P4;
                    }
                    c1836h0.m4553p(false);
                    AbstractC4955ho.m9415Q0("深色模式图标", str2, "未选择时沿用浅色模式图标", interfaceC1220a4, interfaceC1220a3, c1836h0, 390);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                AbstractC4955ho.m9684v0(this.f20633i, this.f20634j, this.f20635k, ((Double) obj).doubleValue(), ((Double) obj2).doubleValue());
                Toast.makeText(this.f20632h, "已保存虚拟定位", 0).show();
                break;
        }
        return C3967n.f12976a;
    }
}
