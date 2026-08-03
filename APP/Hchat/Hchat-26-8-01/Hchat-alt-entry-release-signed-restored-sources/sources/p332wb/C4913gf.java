package p332wb;

import android.app.Activity;
import android.content.Context;
import ba.EnumC0234n;
import p000a.AbstractC0000a;
import p036c9.C0454k;
import p036c9.C0467n0;
import p085fg.InterfaceC1220a;
import p117i0.InterfaceC1809a1;
import p144k.C2209s1;
import p189n1.C2864c;
import p189n1.InterfaceC2862a;
import p276sf.C3958e;
import p276sf.C3967n;

/* JADX INFO: renamed from: wb.gf */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4913gf implements InterfaceC1220a {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17423g = 0;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f17424h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f17425i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f17426j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f17427k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C4913gf(Context context, boolean z9, EnumC0234n enumC0234n, InterfaceC1220a interfaceC1220a) {
        this.f17425i = context;
        this.f17424h = z9;
        this.f17426j = enumC0234n;
        this.f17427k = interfaceC1220a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1220a
    public final Object invoke() {
        switch (this.f17423g) {
            case 0:
                Context context = (Context) this.f17425i;
                EnumC0234n enumC0234n = (EnumC0234n) this.f17426j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f17427k;
                Activity activity = context instanceof Activity ? (Activity) context : null;
                if (activity != null) {
                    C0467n0 c0467n0 = new C0467n0(activity, enumC0234n, interfaceC1220a, context, 15);
                    if (this.f17424h) {
                        C5491y2.m9799Q1(activity, enumC0234n.f615h, "管理当前气泡图片", AbstractC0000a.m101y0(new C3958e("更换气泡", "重新选择一张本地图片"), new C3958e("恢复微信气泡", "删除当前自定义气泡")), new C0454k(c0467n0, context, enumC0234n, interfaceC1220a, 16), new C2209s1(25), EnumC5092lv.f18824j);
                    } else {
                        c0467n0.invoke();
                    }
                }
                break;
            default:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f17425i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f17426j;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f17427k;
                if (this.f17424h) {
                    interfaceC1809a1.setValue(Boolean.valueOf(!((Boolean) interfaceC1809a1.getValue()).booleanValue()));
                    if (((Boolean) interfaceC1809a1.getValue()).booleanValue()) {
                        interfaceC1809a12.setValue(Boolean.TRUE);
                        ((C2864c) ((InterfaceC2862a) interfaceC1809a13.getValue())).m6283a(6);
                    }
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C4913gf(boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13) {
        this.f17424h = z9;
        this.f17425i = interfaceC1809a1;
        this.f17426j = interfaceC1809a12;
        this.f17427k = interfaceC1809a13;
    }
}
