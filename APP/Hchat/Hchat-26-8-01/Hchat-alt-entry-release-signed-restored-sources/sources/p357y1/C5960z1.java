package p357y1;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import android.provider.Settings;
import ci.C0589j;
import p000a.AbstractC0000a;
import p069f.C0943k0;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.C1829f1;
import p136j8.C2104o;
import p174m.C2571a;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.C3560e1;
import p249qg.C3566g1;
import p332wb.C5183on;
import p353xg.C5808e;
import p356y0.InterfaceC5854p;
import sg.AbstractC3978j;
import sg.C3971c;
import tg.AbstractC4201s;
import tg.C4207y;
import tg.InterfaceC4208z;
import vg.AbstractC4564m;
import vg.C4554c;
import wf.InterfaceC5557c;
import wf.InterfaceC5559e;
import wf.InterfaceC5560f;
import wf.InterfaceC5561g;

/* JADX INFO: renamed from: y1.z1 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5960z1 implements InterfaceC5854p {

    /* JADX INFO: renamed from: g */
    public final Context f24232g;

    /* JADX INFO: renamed from: h */
    public C4554c f24233h;

    /* JADX INFO: renamed from: i */
    public final C1829f1 f24234i = new C1829f1(1.0f);

    /* JADX INFO: renamed from: j */
    public C3560e1 f24235j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C5960z1(Context context) {
        this.f24232g = context;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: e */
    public final InterfaceC5561g mo2059e(InterfaceC5561g interfaceC5561g) {
        return AbstractC1089i.m2786q0(this, interfaceC5561g);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p356y0.InterfaceC5854p
    /* JADX INFO: renamed from: i */
    public final float mo2060i() {
        InterfaceC5557c interfaceC5557c;
        InterfaceC4208z interfaceC4208z;
        if (this.f24235j == null) {
            Context context = this.f24232g;
            C0943k0 c0943k0 = AbstractC5945v2.f24167a;
            synchronized (c0943k0) {
                try {
                    Object objM2320g = c0943k0.m2320g(context);
                    interfaceC5557c = null;
                    if (objM2320g == null) {
                        ContentResolver contentResolver = context.getContentResolver();
                        Uri uriFor = Settings.Global.getUriFor("animator_duration_scale");
                        C3971c c3971cM8218a = AbstractC3978j.m8218a(-1, 6, null);
                        C2571a c2571a = new C2571a(new C5183on(contentResolver, uriFor, new C5941u2(c3971cM8218a, AbstractC0000a.m4C(Looper.getMainLooper())), c3971cM8218a, context, null));
                        C3566g1 c3566g1 = new C3566g1(null);
                        C5808e c5808e = AbstractC3553c0.f11555a;
                        objM2320g = AbstractC4201s.m8470h(c2571a, new C4554c(AbstractC1089i.m2786q0(c3566g1, AbstractC4564m.f15049a)), new C4207y(), Float.valueOf(Settings.Global.getFloat(context.getContentResolver(), "animator_duration_scale", 1.0f)));
                        c0943k0.m2326m(context, objM2320g);
                    }
                    interfaceC4208z = (InterfaceC4208z) objM2320g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f24234i.m4489h(((Number) interfaceC4208z.getValue()).floatValue());
            C4554c c4554c = this.f24233h;
            if (c4554c == null) {
                C2104o.m5276A("MotionDurationScale scale factor requested before recomposer loop start");
                return 0.0f;
            }
            this.f24235j = AbstractC3603v.m7563q(c4554c, null, new C0589j(interfaceC4208z, this, interfaceC5557c, 27), 3);
        }
        return this.f24234i.m4488g();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: k */
    public final Object mo2061k(InterfaceC1235p interfaceC1235p, Object obj) {
        return interfaceC1235p.invoke(obj, this);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: s */
    public final InterfaceC5559e mo2062s(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2797w(this, interfaceC5560f);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // wf.InterfaceC5561g
    /* JADX INFO: renamed from: t */
    public final InterfaceC5561g mo2063t(InterfaceC5560f interfaceC5560f) {
        return AbstractC1089i.m2777l0(this, interfaceC5560f);
    }
}
