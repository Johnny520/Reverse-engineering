package p332wb;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.Toast;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p117i0.InterfaceC1809a1;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p276sf.C3967n;
import qa.C3479g;
import th.InterfaceC4209a;

/* JADX INFO: renamed from: wb.i8 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4972i8 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17787g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ SharedPreferences f17788h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Context f17789i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1220a f17790j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1809a1 f17791k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f17792l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f17793m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f17794n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f17795o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f17796p;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4972i8(SharedPreferences sharedPreferences, Context context, InterfaceC1220a interfaceC1220a, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, int i9) {
        this.f17787g = i9;
        this.f17788h = sharedPreferences;
        this.f17789i = context;
        this.f17790j = interfaceC1220a;
        this.f17791k = interfaceC1809a1;
        this.f17792l = interfaceC1809a12;
        this.f17793m = interfaceC1809a13;
        this.f17794n = interfaceC1809a14;
        this.f17795o = interfaceC1809a15;
        this.f17796p = interfaceC1809a16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        switch (this.f17787g) {
            case 0:
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h0.m4516S(iIntValue & 1, (iIntValue & 17) != 16)) {
                    final SharedPreferences sharedPreferences = this.f17788h;
                    boolean zM4538h = c1836h0.m4538h(sharedPreferences);
                    final Context context = this.f17789i;
                    boolean zM4538h2 = zM4538h | c1836h0.m4538h(context);
                    Object objM4514P = c1836h0.m4514P();
                    if (zM4538h2 || objM4514P == C1851l.f6155a) {
                        final int i9 = 0;
                        final InterfaceC1809a1 interfaceC1809a1 = this.f17791k;
                        final InterfaceC1809a1 interfaceC1809a12 = this.f17792l;
                        final InterfaceC1809a1 interfaceC1809a13 = this.f17793m;
                        final InterfaceC1809a1 interfaceC1809a14 = this.f17794n;
                        final InterfaceC1809a1 interfaceC1809a15 = this.f17795o;
                        final InterfaceC1809a1 interfaceC1809a16 = this.f17796p;
                        InterfaceC1220a interfaceC1220a = new InterfaceC1220a() { // from class: wb.wk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                int i10 = i9;
                                C3967n c3967n = C3967n.f12976a;
                                InterfaceC1809a1 interfaceC1809a17 = interfaceC1809a16;
                                InterfaceC1809a1 interfaceC1809a18 = interfaceC1809a15;
                                InterfaceC1809a1 interfaceC1809a19 = interfaceC1809a14;
                                InterfaceC1809a1 interfaceC1809a110 = interfaceC1809a13;
                                InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a12;
                                InterfaceC1809a1 interfaceC1809a112 = interfaceC1809a1;
                                Context context2 = context;
                                SharedPreferences sharedPreferences2 = sharedPreferences;
                                switch (i10) {
                                    case 0:
                                        sharedPreferences2.edit().putString("protobuf_packet_block_types", (String) interfaceC1809a112.getValue()).putString("protobuf_packet_send_uri", AbstractC3149m.m6703R0((String) interfaceC1809a111.getValue()).toString()).putString("protobuf_packet_send_type", AbstractC3149m.m6703R0((String) interfaceC1809a110.getValue()).toString()).putString("protobuf_packet_send_func_id", AbstractC3149m.m6703R0((String) interfaceC1809a19.getValue()).toString()).putString("protobuf_packet_send_route_id", AbstractC3149m.m6703R0((String) interfaceC1809a18.getValue()).toString()).putString("protobuf_packet_send_payload", (String) interfaceC1809a17.getValue()).apply();
                                        Toast.makeText(context2, "设置已保存", 0).show();
                                        break;
                                    default:
                                        C3147k c3147k = C3479g.f11292a;
                                        String strM7292d = C3479g.m7292d((String) interfaceC1809a112.getValue());
                                        String strM7292d2 = C3479g.m7292d((String) interfaceC1809a111.getValue());
                                        String strM7292d3 = C3479g.m7292d((String) interfaceC1809a110.getValue());
                                        interfaceC1809a112.setValue(strM7292d);
                                        interfaceC1809a111.setValue(strM7292d2);
                                        interfaceC1809a110.setValue(strM7292d3);
                                        sharedPreferences2.edit().putString("fake_wallet_balance_amount", strM7292d).putString("fake_wallet_lqt_amount", strM7292d2).putString("fake_wallet_business_amount", strM7292d3).putString("fake_wallet_balance_mode_balance", (String) interfaceC1809a19.getValue()).putString("fake_wallet_balance_mode_lqt", (String) interfaceC1809a18.getValue()).putString("fake_wallet_balance_mode_business", (String) interfaceC1809a17.getValue()).apply();
                                        Toast.makeText(context2, "设置已保存", 0).show();
                                        break;
                                }
                                return c3967n;
                            }
                        };
                        c1836h0.m4545k0(interfaceC1220a);
                        objM4514P = interfaceC1220a;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P, "返回", this.f17790j, null, null, c1836h0, 390, 48);
                } else {
                    c1836h0.m4519V();
                }
                break;
            default:
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((InterfaceC4209a) obj).getClass();
                if (c1836h02.m4516S(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    final SharedPreferences sharedPreferences2 = this.f17788h;
                    boolean zM4538h3 = c1836h02.m4538h(sharedPreferences2);
                    final Context context2 = this.f17789i;
                    boolean zM4538h4 = zM4538h3 | c1836h02.m4538h(context2);
                    Object objM4514P2 = c1836h02.m4514P();
                    if (zM4538h4 || objM4514P2 == C1851l.f6155a) {
                        final int i10 = 1;
                        final InterfaceC1809a1 interfaceC1809a17 = this.f17791k;
                        final InterfaceC1809a1 interfaceC1809a18 = this.f17792l;
                        final InterfaceC1809a1 interfaceC1809a19 = this.f17793m;
                        final InterfaceC1809a1 interfaceC1809a110 = this.f17794n;
                        final InterfaceC1809a1 interfaceC1809a111 = this.f17795o;
                        final InterfaceC1809a1 interfaceC1809a112 = this.f17796p;
                        InterfaceC1220a interfaceC1220a2 = new InterfaceC1220a() { // from class: wb.wk
                            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                            @Override // p085fg.InterfaceC1220a
                            public final Object invoke() {
                                int i102 = i10;
                                C3967n c3967n = C3967n.f12976a;
                                InterfaceC1809a1 interfaceC1809a172 = interfaceC1809a112;
                                InterfaceC1809a1 interfaceC1809a182 = interfaceC1809a111;
                                InterfaceC1809a1 interfaceC1809a192 = interfaceC1809a110;
                                InterfaceC1809a1 interfaceC1809a1102 = interfaceC1809a19;
                                InterfaceC1809a1 interfaceC1809a1112 = interfaceC1809a18;
                                InterfaceC1809a1 interfaceC1809a1122 = interfaceC1809a17;
                                Context context22 = context2;
                                SharedPreferences sharedPreferences22 = sharedPreferences2;
                                switch (i102) {
                                    case 0:
                                        sharedPreferences22.edit().putString("protobuf_packet_block_types", (String) interfaceC1809a1122.getValue()).putString("protobuf_packet_send_uri", AbstractC3149m.m6703R0((String) interfaceC1809a1112.getValue()).toString()).putString("protobuf_packet_send_type", AbstractC3149m.m6703R0((String) interfaceC1809a1102.getValue()).toString()).putString("protobuf_packet_send_func_id", AbstractC3149m.m6703R0((String) interfaceC1809a192.getValue()).toString()).putString("protobuf_packet_send_route_id", AbstractC3149m.m6703R0((String) interfaceC1809a182.getValue()).toString()).putString("protobuf_packet_send_payload", (String) interfaceC1809a172.getValue()).apply();
                                        Toast.makeText(context22, "设置已保存", 0).show();
                                        break;
                                    default:
                                        C3147k c3147k = C3479g.f11292a;
                                        String strM7292d = C3479g.m7292d((String) interfaceC1809a1122.getValue());
                                        String strM7292d2 = C3479g.m7292d((String) interfaceC1809a1112.getValue());
                                        String strM7292d3 = C3479g.m7292d((String) interfaceC1809a1102.getValue());
                                        interfaceC1809a1122.setValue(strM7292d);
                                        interfaceC1809a1112.setValue(strM7292d2);
                                        interfaceC1809a1102.setValue(strM7292d3);
                                        sharedPreferences22.edit().putString("fake_wallet_balance_amount", strM7292d).putString("fake_wallet_lqt_amount", strM7292d2).putString("fake_wallet_business_amount", strM7292d3).putString("fake_wallet_balance_mode_balance", (String) interfaceC1809a192.getValue()).putString("fake_wallet_balance_mode_lqt", (String) interfaceC1809a182.getValue()).putString("fake_wallet_balance_mode_business", (String) interfaceC1809a172.getValue()).apply();
                                        Toast.makeText(context22, "设置已保存", 0).show();
                                        break;
                                }
                                return c3967n;
                            }
                        };
                        c1836h02.m4545k0(interfaceC1220a2);
                        objM4514P2 = interfaceC1220a2;
                    }
                    AbstractC4955ho.m9382M("保存设置", (InterfaceC1220a) objM4514P2, "返回", this.f17790j, null, null, c1836h02, 390, 48);
                } else {
                    c1836h02.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }
}
