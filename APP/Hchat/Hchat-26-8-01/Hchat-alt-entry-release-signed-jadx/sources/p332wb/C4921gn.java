package p332wb;

import android.content.Context;
import android.widget.Toast;
import gb.C1382f;
import gb.C1389m;
import gb.EnumC1392p;
import gg.AbstractC1416l;
import gg.C1423s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import okhttp3.HttpUrl;
import okio.C3193a;
import p065eb.C0859c0;
import p068eh.AbstractC0921a;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p117i0.InterfaceC1809a1;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.C3140d;
import p218og.C3147k;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3960g;
import p276sf.C3967n;
import p277t.C4075g;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.gn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4921gn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ Object f17452A;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f17453h = 0;

    /* JADX INFO: renamed from: i */
    public InterfaceC1809a1 f17454i;

    /* JADX INFO: renamed from: j */
    public Context f17455j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1809a1 f17456k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1809a1 f17457l;

    /* JADX INFO: renamed from: m */
    public InterfaceC1809a1 f17458m;

    /* JADX INFO: renamed from: n */
    public InterfaceC1809a1 f17459n;

    /* JADX INFO: renamed from: o */
    public int f17460o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f17461p;

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ InterfaceC1809a1 f17462q;

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ InterfaceC1809a1 f17463r;

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ InterfaceC1809a1 f17464s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ InterfaceC1809a1 f17465t;

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ InterfaceC1809a1 f17466u;

    /* JADX INFO: renamed from: v */
    public Object f17467v;

    /* JADX INFO: renamed from: w */
    public Object f17468w;

    /* JADX INFO: renamed from: x */
    public Object f17469x;

    /* JADX INFO: renamed from: y */
    public Object f17470y;

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ Object f17471z;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4921gn(Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC1809a1 interfaceC1809a19, InterfaceC1809a1 interfaceC1809a110, InterfaceC1809a1 interfaceC1809a111, InterfaceC1809a1 interfaceC1809a112, InterfaceC1809a1 interfaceC1809a113, InterfaceC1809a1 interfaceC1809a114, InterfaceC1809a1 interfaceC1809a115, InterfaceC1809a1 interfaceC1809a116, InterfaceC1809a1 interfaceC1809a117, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f17455j = context;
        this.f17454i = interfaceC1809a1;
        this.f17456k = interfaceC1809a12;
        this.f17457l = interfaceC1809a13;
        this.f17458m = interfaceC1809a14;
        this.f17459n = interfaceC1809a15;
        this.f17461p = interfaceC1809a16;
        this.f17462q = interfaceC1809a17;
        this.f17463r = interfaceC1809a18;
        this.f17464s = interfaceC1809a19;
        this.f17465t = interfaceC1809a110;
        this.f17466u = interfaceC1809a111;
        this.f17467v = interfaceC1809a112;
        this.f17468w = interfaceC1809a113;
        this.f17469x = interfaceC1809a114;
        this.f17470y = interfaceC1809a115;
        this.f17471z = interfaceC1809a116;
        this.f17452A = interfaceC1809a117;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f17453h) {
            case 0:
                return new C4921gn(this.f17455j, this.f17454i, this.f17456k, this.f17457l, this.f17458m, this.f17459n, this.f17461p, this.f17462q, this.f17463r, this.f17464s, this.f17465t, this.f17466u, (InterfaceC1809a1) this.f17467v, (InterfaceC1809a1) this.f17468w, (InterfaceC1809a1) this.f17469x, (InterfaceC1809a1) this.f17470y, (InterfaceC1809a1) this.f17471z, (InterfaceC1809a1) this.f17452A, interfaceC5557c);
            default:
                return new C4921gn((ArrayList) this.f17471z, (Context) this.f17452A, this.f17461p, this.f17462q, this.f17463r, this.f17464s, this.f17465t, this.f17466u, interfaceC5557c);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f17453h) {
        }
        return ((C4921gn) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f9  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x00ef -> B:8:0x0040). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM7570x;
        C1423s c1423s;
        Context context;
        Iterator it;
        InterfaceC1809a1 interfaceC1809a1;
        InterfaceC1809a1 interfaceC1809a12;
        InterfaceC1809a1 interfaceC1809a13;
        InterfaceC1809a1 interfaceC1809a14;
        InterfaceC1809a1 interfaceC1809a15;
        C1423s c1423s2;
        Map map;
        String simpleName;
        Map mapSingletonMap;
        Map map2;
        Map map3;
        int i9 = this.f17453h;
        C3967n c3967n = C3967n.f12976a;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        Object obj2 = this.f17471z;
        Object obj3 = this.f17452A;
        switch (i9) {
            case 0:
                Context context2 = this.f17455j;
                int i10 = this.f17460o;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                    C4888fn c4888fn = new C4888fn(context2, this.f17454i, this.f17456k, this.f17457l, this.f17458m, this.f17459n, this.f17461p, this.f17462q, this.f17463r, this.f17464s, this.f17465t, this.f17466u, (InterfaceC1809a1) this.f17467v, (InterfaceC1809a1) this.f17468w, (InterfaceC1809a1) this.f17469x, (InterfaceC1809a1) this.f17470y, (InterfaceC1809a1) obj2, null);
                    this.f17460o = 1;
                    objM7570x = AbstractC3603v.m7570x(executorC5807d, c4888fn, this);
                    if (objM7570x == enumC5799a) {
                        return enumC5799a;
                    }
                } else {
                    if (i10 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM7570x = obj;
                }
                String str = (String) objM7570x;
                C3147k c3147k = AbstractC4955ho.f17686a;
                ((InterfaceC1809a1) obj3).setValue(str);
                str.getClass();
                C3140d c3140d = new C3140d(str);
                String str2 = (String) (!c3140d.hasNext() ? null : c3140d.next());
                if (str2 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                Toast.makeText(context2, str2, 0).show();
                return c3967n;
            default:
                Context context3 = (Context) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                int i11 = this.f17460o;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C1423s c1423s3 = new C1423s();
                    C1423s c1423s4 = new C1423s();
                    Iterator it2 = arrayList.iterator();
                    InterfaceC1809a1 interfaceC1809a16 = this.f17461p;
                    c1423s = c1423s4;
                    context = context3;
                    it = it2;
                    interfaceC1809a1 = interfaceC1809a16;
                    interfaceC1809a12 = this.f17462q;
                    interfaceC1809a13 = this.f17463r;
                    interfaceC1809a14 = this.f17464s;
                    interfaceC1809a15 = this.f17465t;
                    c1423s2 = c1423s3;
                    if (it.hasNext()) {
                    }
                } else {
                    if (i11 != 1) {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    C0859c0 c0859c0 = (C0859c0) this.f17470y;
                    it = (Iterator) this.f17469x;
                    interfaceC1809a15 = this.f17459n;
                    InterfaceC1809a1 interfaceC1809a17 = this.f17458m;
                    InterfaceC1809a1 interfaceC1809a18 = this.f17457l;
                    InterfaceC1809a1 interfaceC1809a19 = this.f17456k;
                    Context context4 = this.f17455j;
                    InterfaceC1809a1 interfaceC1809a110 = this.f17454i;
                    c1423s = (C1423s) this.f17468w;
                    c1423s2 = (C1423s) this.f17467v;
                    AbstractC1089i.m2732I0(obj);
                    C3967n c3967n2 = c3967n;
                    C0859c0 c0859c02 = c0859c0;
                    Object objM7570x2 = obj;
                    InterfaceC1809a1 interfaceC1809a111 = interfaceC1809a110;
                    interfaceC1809a14 = interfaceC1809a17;
                    interfaceC1809a13 = interfaceC1809a18;
                    interfaceC1809a12 = interfaceC1809a19;
                    context = context4;
                    Object obj4 = ((C3960g) objM7570x2).f12964g;
                    Throwable thM8182b = C3960g.m8182b(obj4);
                    if (thM8182b != null) {
                        C1389m c1389m = (C1389m) obj4;
                        interfaceC1809a15.setValue(Boolean.TRUE);
                        EnumC1392p enumC1392p = c1389m.f4613c;
                        String str3 = c1389m.f4611a;
                        int iOrdinal = enumC1392p.ordinal();
                        if (iOrdinal == 0) {
                            c1423s.f4736g++;
                            Map map4 = (Map) interfaceC1809a111.getValue();
                            String str4 = c0859c02.f2626a;
                            C5350tp c5350tp = new C5350tp(EnumC5317sp.f20708j, AbstractC4855en.m9263g("上传成功，待审核 · ", str3));
                            map4.getClass();
                            if (map4.isEmpty()) {
                                Map mapSingletonMap2 = Collections.singletonMap(str4, c5350tp);
                                mapSingletonMap2.getClass();
                                map2 = mapSingletonMap2;
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(map4);
                                linkedHashMap.put(str4, c5350tp);
                                map2 = linkedHashMap;
                            }
                            interfaceC1809a111.setValue(map2);
                        } else {
                            if (iOrdinal != 1) {
                                C3193a.m6822k();
                                return null;
                            }
                            c1423s2.f4736g++;
                            Map map5 = (Map) interfaceC1809a111.getValue();
                            String str5 = c0859c02.f2626a;
                            C5350tp c5350tp2 = new C5350tp(EnumC5317sp.f20707i, AbstractC4855en.m9263g("上传成功 · ", str3));
                            map5.getClass();
                            if (map5.isEmpty()) {
                                Map mapSingletonMap3 = Collections.singletonMap(str5, c5350tp2);
                                mapSingletonMap3.getClass();
                                map3 = mapSingletonMap3;
                            } else {
                                LinkedHashMap linkedHashMap2 = new LinkedHashMap(map5);
                                linkedHashMap2.put(str5, c5350tp2);
                                map3 = linkedHashMap2;
                            }
                            interfaceC1809a111.setValue(map3);
                        }
                    } else {
                        Map map6 = (Map) interfaceC1809a111.getValue();
                        String str6 = c0859c02.f2626a;
                        if ((thM8182b instanceof C1382f) && AbstractC1416l.m3825a(((C1382f) thM8182b).f4589g, "UPLOADER_BLACKLISTED")) {
                            simpleName = "当前微信账号已被禁止上传在线插件";
                        } else {
                            String message = thM8182b.getMessage();
                            String string = message != null ? AbstractC3149m.m6703R0(message).toString() : null;
                            if (string == null || AbstractC3149m.m6721t0(string)) {
                                string = null;
                            }
                            simpleName = string != null ? string : thM8182b.getClass().getSimpleName();
                        }
                        C5350tp c5350tp3 = new C5350tp(EnumC5317sp.f20709k, "上传失败: ".concat(simpleName));
                        map6.getClass();
                        if (map6.isEmpty()) {
                            mapSingletonMap = Collections.singletonMap(str6, c5350tp3);
                            mapSingletonMap.getClass();
                        } else {
                            LinkedHashMap linkedHashMap3 = new LinkedHashMap(map6);
                            linkedHashMap3.put(str6, c5350tp3);
                            mapSingletonMap = linkedHashMap3;
                        }
                        interfaceC1809a111.setValue(mapSingletonMap);
                    }
                    c3967n = c3967n2;
                    interfaceC1809a1 = interfaceC1809a111;
                    if (it.hasNext()) {
                        C0859c0 c0859c03 = (C0859c0) it.next();
                        Map map7 = (Map) interfaceC1809a1.getValue();
                        String str7 = c0859c03.f2626a;
                        C5350tp c5350tp4 = new C5350tp(EnumC5317sp.f20706h, "正在上传");
                        map7.getClass();
                        if (map7.isEmpty()) {
                            Map mapSingletonMap4 = Collections.singletonMap(str7, c5350tp4);
                            mapSingletonMap4.getClass();
                            map = mapSingletonMap4;
                        } else {
                            LinkedHashMap linkedHashMap4 = new LinkedHashMap(map7);
                            linkedHashMap4.put(str7, c5350tp4);
                            map = linkedHashMap4;
                        }
                        interfaceC1809a1.setValue(map);
                        C5808e c5808e2 = AbstractC3553c0.f11555a;
                        ExecutorC5807d executorC5807d2 = ExecutorC5807d.f23583i;
                        C4075g c4075g = new C4075g(context, c0859c03, interfaceC1809a12, interfaceC1809a13, interfaceC1809a14, null, 4);
                        c3967n2 = c3967n;
                        context4 = context;
                        interfaceC1809a19 = interfaceC1809a12;
                        interfaceC1809a18 = interfaceC1809a13;
                        interfaceC1809a17 = interfaceC1809a14;
                        this.f17467v = c1423s2;
                        this.f17468w = c1423s;
                        this.f17454i = interfaceC1809a1;
                        this.f17455j = context4;
                        this.f17456k = interfaceC1809a19;
                        this.f17457l = interfaceC1809a18;
                        this.f17458m = interfaceC1809a17;
                        this.f17459n = interfaceC1809a15;
                        this.f17469x = it;
                        this.f17470y = c0859c03;
                        this.f17460o = 1;
                        objM7570x2 = AbstractC3603v.m7570x(executorC5807d2, c4075g, this);
                        if (objM7570x2 == enumC5799a) {
                            return enumC5799a;
                        }
                        c0859c02 = c0859c03;
                        interfaceC1809a111 = interfaceC1809a1;
                        interfaceC1809a14 = interfaceC1809a17;
                        interfaceC1809a13 = interfaceC1809a18;
                        interfaceC1809a12 = interfaceC1809a19;
                        context = context4;
                        Object obj42 = ((C3960g) objM7570x2).f12964g;
                        Throwable thM8182b2 = C3960g.m8182b(obj42);
                        if (thM8182b2 != null) {
                        }
                        c3967n = c3967n2;
                        interfaceC1809a1 = interfaceC1809a111;
                        if (it.hasNext()) {
                            C3967n c3967n3 = c3967n;
                            this.f17466u.setValue(Boolean.FALSE);
                            int i12 = c1423s2.f4736g;
                            int i13 = c1423s.f4736g;
                            int size = (arrayList.size() - c1423s2.f4736g) - c1423s.f4736g;
                            StringBuilder sbM2256s = AbstractC0921a.m2256s(i12, i13, "上传完成：已发布 ", "，待审核 ", "，失败 ");
                            sbM2256s.append(size);
                            Toast.makeText(context3, sbM2256s.toString(), 1).show();
                            return c3967n3;
                        }
                    }
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4921gn(ArrayList arrayList, Context context, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f17471z = arrayList;
        this.f17452A = context;
        this.f17461p = interfaceC1809a1;
        this.f17462q = interfaceC1809a12;
        this.f17463r = interfaceC1809a13;
        this.f17464s = interfaceC1809a14;
        this.f17465t = interfaceC1809a15;
        this.f17466u = interfaceC1809a16;
    }
}
