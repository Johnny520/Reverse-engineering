package p109hb;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import p000a.AbstractC0000a;
import p036c9.RunnableC0487t;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1236q;
import p117i0.C1836h0;
import p117i0.C1851l;
import p222p.AbstractC3208d;
import p222p.AbstractC3222h1;
import p222p.C3259u;
import p222p.C3272z0;
import p222p.InterfaceC3268x0;
import p251r.C3619d;
import p251r.C3641z;
import p253r1.AbstractC3649f;
import p266s0.AbstractC3879i;
import p276sf.C3967n;
import p332wb.AbstractC4955ho;
import p332wb.C4901g3;
import p332wb.C5292s0;
import p332wb.InterfaceC5059kv;
import p356y0.InterfaceC5853o;
import sh.C4018j;
import sh.C4060x;

/* JADX INFO: renamed from: hb.j0 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1686j0 implements InterfaceC1236q {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f5595g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f5596h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f5597i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f5598j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f5599k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C1686j0(C4060x c4060x, C3641z c3641z, SharedPreferences sharedPreferences, boolean z9) {
        this.f5595g = 3;
        this.f5597i = c4060x;
        this.f5598j = c3641z;
        this.f5599k = sharedPreferences;
        this.f5596h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1236q
    /* JADX INFO: renamed from: b */
    public final Object mo734b(Object obj, Object obj2, Object obj3) {
        String str;
        switch (this.f5595g) {
            case 0:
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f5597i;
                InterfaceC5059kv interfaceC5059kv = (InterfaceC5059kv) this.f5598j;
                Activity activity = (Activity) this.f5599k;
                int iIntValue = ((Integer) obj).intValue();
                int iIntValue2 = ((Integer) obj2).intValue();
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                atomicBoolean.set(true);
                if (interfaceC5059kv != null) {
                    interfaceC5059kv.close();
                }
                String str2 = this.f5596h ? "原生群发" : "模块群发";
                if (zBooleanValue) {
                    str = str2 + " 已取消: " + iIntValue + "/" + iIntValue2;
                } else if (iIntValue == iIntValue2) {
                    str = str2 + " 完成: " + iIntValue + "/" + iIntValue2;
                } else {
                    str = str2 + " 部分失败: " + iIntValue + "/" + iIntValue2;
                }
                new Handler(Looper.getMainLooper()).post(new RunnableC0487t(activity, str, 7));
                break;
            case 1:
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f5597i;
                List list = (List) this.f5598j;
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f5599k;
                C1836h0 c1836h0 = (C1836h0) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((C3619d) obj).getClass();
                if (c1836h0.m4516S(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    AbstractC4955ho.m9306C3(null, AbstractC3879i.m8071e(-122897600, new C4018j(3, interfaceC1231l, list, interfaceC1220a, this.f5596h), c1836h0), c1836h0, 48, 1);
                } else {
                    c1836h0.m4519V();
                }
                break;
            case 2:
                C5292s0 c5292s0 = (C5292s0) this.f5597i;
                String str3 = (String) this.f5598j;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f5599k;
                C1836h0 c1836h02 = (C1836h0) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((C3259u) obj).getClass();
                if (c1836h02.m4516S(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    AbstractC4955ho.m9464W1(c5292s0, str3, this.f5596h, interfaceC1220a2, c1836h02, 0);
                } else {
                    c1836h02.m4519V();
                }
                break;
            default:
                C4060x c4060x = (C4060x) this.f5597i;
                C3641z c3641z = (C3641z) this.f5598j;
                SharedPreferences sharedPreferences = (SharedPreferences) this.f5599k;
                InterfaceC3268x0 interfaceC3268x0 = (InterfaceC3268x0) obj;
                C1836h0 c1836h03 = (C1836h0) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                interfaceC3268x0.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= c1836h03.m4534f(interfaceC3268x0) ? 4 : 2;
                }
                if (c1836h03.m4516S(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    InterfaceC5853o interfaceC5853oM7631a = AbstractC3649f.m7631a(AbstractC3222h1.f10289c, c4060x.f13440e, null);
                    C3272z0 c3272z0M6872b = AbstractC3208d.m6872b(interfaceC3268x0.mo6924c() + 8, interfaceC3268x0.mo6922a() + 84, 5);
                    boolean zM4538h = c1836h03.m4538h(sharedPreferences);
                    Object objM4514P = c1836h03.m4514P();
                    if (zM4538h || objM4514P == C1851l.f6155a) {
                        objM4514P = new C4901g3(sharedPreferences, this.f5596h, 1);
                        c1836h03.m4545k0(objM4514P);
                    }
                    AbstractC0000a.m53b(interfaceC5853oM7631a, c3641z, c3272z0M6872b, null, null, null, false, null, (InterfaceC1231l) objM4514P, c1836h03, 0, 504);
                } else {
                    c1836h03.m4519V();
                }
                break;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C1686j0(int i9, Object obj, Object obj2, Object obj3, boolean z9) {
        this.f5595g = i9;
        this.f5597i = obj;
        this.f5598j = obj2;
        this.f5596h = z9;
        this.f5599k = obj3;
    }

    public /* synthetic */ C1686j0(boolean z9, InterfaceC1231l interfaceC1231l, List list, InterfaceC1220a interfaceC1220a) {
        this.f5595g = 1;
        this.f5596h = z9;
        this.f5597i = interfaceC1231l;
        this.f5598j = list;
        this.f5599k = interfaceC1220a;
    }
}
