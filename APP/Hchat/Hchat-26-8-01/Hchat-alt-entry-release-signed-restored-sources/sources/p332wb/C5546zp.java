package p332wb;

import android.content.Context;
import android.widget.Toast;
import gb.C1382f;
import gb.C1385i;
import gb.C1391o;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1235p;
import p116i.AbstractC1742d;
import p116i.C1739c;
import p116i.C1785r0;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p222p.InterfaceC3252r1;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3960g;
import p276sf.C3967n;
import p293u2.InterfaceC4233c;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p357y1.InterfaceC5885g2;
import p370yf.AbstractC6044i;
import tf.AbstractC4167n;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.zp */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5546zp extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f22527h = 0;

    /* JADX INFO: renamed from: i */
    public int f22528i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ InterfaceC1809a1 f22529j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean f22530k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ InterfaceC1809a1 f22531l;

    /* JADX INFO: renamed from: m */
    public /* synthetic */ Object f22532m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ Object f22533n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f22534o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ Object f22535p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ Object f22536q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ Object f22537r;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5546zp(Context context, C1391o c1391o, boolean z9, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f22532m = context;
        this.f22533n = c1391o;
        this.f22530k = z9;
        this.f22529j = interfaceC1809a1;
        this.f22531l = interfaceC1809a12;
        this.f22534o = interfaceC1809a13;
        this.f22535p = interfaceC1809a14;
        this.f22536q = interfaceC1809a15;
        this.f22537r = interfaceC1809a16;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f22527h) {
            case 0:
                return new C5546zp((Context) this.f22532m, (C1391o) this.f22533n, this.f22530k, this.f22529j, this.f22531l, (InterfaceC1809a1) this.f22534o, (InterfaceC1809a1) this.f22535p, (InterfaceC1809a1) this.f22536q, (InterfaceC1809a1) this.f22537r, interfaceC5557c);
            default:
                C5546zp c5546zp = new C5546zp(this.f22529j, (C1739c) this.f22533n, this.f22530k, (InterfaceC3252r1) this.f22534o, (InterfaceC4233c) this.f22535p, (InterfaceC5885g2) this.f22536q, (C1739c) this.f22537r, this.f22531l, interfaceC5557c);
                c5546zp.f22532m = obj;
                return c5546zp;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f22527h) {
        }
        return ((C5546zp) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7570x;
        String string;
        C1785r0 c1785r0;
        int i9 = this.f22527h;
        boolean z9 = this.f22530k;
        Object obj2 = this.f22533n;
        InterfaceC1809a1 interfaceC1809a1 = this.f22531l;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        Object obj3 = this.f22537r;
        InterfaceC1809a1 interfaceC1809a12 = this.f22529j;
        C3967n c3967n = C3967n.f12976a;
        int i10 = 1;
        InterfaceC5557c interfaceC5557c = null;
        switch (i9) {
            case 0:
                C1391o c1391o = (C1391o) obj2;
                Context context = (Context) this.f22532m;
                int i11 = this.f22528i;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                    C5514yp c5514yp = new C5514yp(context, c1391o, z9, null);
                    this.f22528i = 1;
                    objM7570x = AbstractC3603v.m7570x(executorC5807d, c5514yp, this);
                    if (objM7570x == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i11 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x = obj;
                }
                Object obj4 = ((C3960g) objM7570x).f12964g;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f22534o;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f22535p;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f22536q;
                Throwable thM8182b = C3960g.m8182b(obj4);
                if (thM8182b == null) {
                    C1385i c1385i = (C1385i) obj4;
                    interfaceC1809a12.setValue(Boolean.TRUE);
                    Long l10 = c1385i.f4604d;
                    if (l10 != null) {
                        long jLongValue = l10.longValue();
                        C1391o c1391o2 = (C1391o) interfaceC1809a1.getValue();
                        interfaceC1809a1.setValue(c1391o2 != null ? C1391o.m3788a(c1391o2, jLongValue, 0L, 0L, 3967) : null);
                        C1391o c1391o3 = (C1391o) interfaceC1809a13.getValue();
                        interfaceC1809a13.setValue(c1391o3 != null ? C1391o.m3788a(c1391o3, jLongValue, 0L, 0L, 3967) : null);
                        List<C1391o> list = (List) interfaceC1809a14.getValue();
                        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(list));
                        for (C1391o c1391oM3788a : list) {
                            if (c1391oM3788a.f4617a.equals(c1391o.f4617a)) {
                                c1391oM3788a = C1391o.m3788a(c1391oM3788a, jLongValue, 0L, 0L, 3967);
                            }
                            arrayList.add(c1391oM3788a);
                        }
                        interfaceC1809a14.setValue(arrayList);
                    }
                    interfaceC1809a15.setValue(c1385i.f4603c ? "更新成功，插件已保持禁用" : "安装成功，插件默认禁用");
                    Toast.makeText(context, (String) interfaceC1809a15.getValue(), 0).show();
                } else {
                    if ((thM8182b instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b).f4589g, "UPLOADER_BLACKLISTED")) {
                        string = "当前微信账号已被禁止上传在线插件";
                    } else {
                        String message = thM8182b.getMessage();
                        string = message != null ? AbstractC3149m.m6703R0(message).toString() : null;
                        if (string == null || AbstractC3149m.m6721t0(string)) {
                            string = null;
                        }
                        if (string == null) {
                            string = thM8182b.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a15.setValue("安装失败: ".concat(string));
                }
                ((InterfaceC1809a1) obj3).setValue(null);
                return c3967n;
            default:
                C1739c c1739c = (C1739c) obj3;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f22532m;
                int i12 = this.f22528i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    interfaceC1809a12.setValue(Boolean.TRUE);
                    AbstractC3603v.m7563q(interfaceC3599t, null, new C5130n3(c1739c, interfaceC5557c, i10), 3);
                    C1739c c1739c2 = (C1739c) obj2;
                    Float f3 = new Float(1.0f);
                    if (z9) {
                        double d10 = 6.283185307179586d / ((double) 0.3f);
                        c1785r0 = AbstractC1742d.m4379o(0.9f, (float) (d10 * d10), null, 4);
                    } else {
                        c1785r0 = new C1785r0(0.88f, 450.0f, new Float(1.0E-4f));
                    }
                    this.f22532m = null;
                    this.f22528i = 1;
                    if (C1739c.m4359c(c1739c2, f3, c1785r0, null, this, 12) == enumC5799a) {
                        return enumC5799a;
                    }
                } else if (i12 != 1) {
                    if (i12 == 2) {
                        AbstractC1089i.m2732I0(obj);
                        this.f22532m = null;
                        this.f22528i = 3;
                        if (c1739c.m4362f(this) == enumC5799a) {
                            return enumC5799a;
                        }
                    } else {
                        if (i12 != 3) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        AbstractC1089i.m2732I0(obj);
                    }
                    interfaceC1809a12.setValue(Boolean.FALSE);
                    InterfaceC1220a interfaceC1220a = (InterfaceC1220a) interfaceC1809a1.getValue();
                    if (interfaceC1220a != null) {
                        interfaceC1220a.invoke();
                    }
                } else {
                    AbstractC1089i.m2732I0(obj);
                }
                return c3967n;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5546zp(InterfaceC1809a1 interfaceC1809a1, C1739c c1739c, boolean z9, InterfaceC3252r1 interfaceC3252r1, InterfaceC4233c interfaceC4233c, InterfaceC5885g2 interfaceC5885g2, C1739c c1739c2, InterfaceC1809a1 interfaceC1809a12, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f22529j = interfaceC1809a1;
        this.f22533n = c1739c;
        this.f22530k = z9;
        this.f22534o = interfaceC3252r1;
        this.f22535p = interfaceC4233c;
        this.f22536q = interfaceC5885g2;
        this.f22537r = c1739c2;
        this.f22531l = interfaceC1809a12;
    }
}
