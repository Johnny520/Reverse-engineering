package p332wb;

import android.content.Context;
import android.widget.Toast;
import gb.C1379c;
import gb.C1380d;
import gb.C1382f;
import gb.C1391o;
import gg.AbstractC1416l;
import java.util.ArrayList;
import java.util.List;
import okhttp3.HttpUrl;
import p000a.AbstractC0000a;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1235p;
import p100h0.C1538n;
import p117i0.InterfaceC1809a1;
import p136j8.C2096g;
import p136j8.C2097h;
import p136j8.C2104o;
import p218og.AbstractC3149m;
import p218og.C3147k;
import p222p.AbstractC3199a;
import p249qg.AbstractC3553c0;
import p249qg.AbstractC3603v;
import p249qg.InterfaceC3599t;
import p276sf.C3959f;
import p276sf.C3960g;
import p276sf.C3967n;
import p321w.C4639u0;
import p352xf.EnumC5799a;
import p353xg.C5808e;
import p353xg.ExecutorC5807d;
import p370yf.AbstractC6044i;
import tf.AbstractC4166m;
import tf.C4173t;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.rn */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C5282rn extends AbstractC6044i implements InterfaceC1235p {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f20495h;

    /* JADX INFO: renamed from: i */
    public int f20496i;

    /* JADX INFO: renamed from: j */
    public InterfaceC1809a1 f20497j;

    /* JADX INFO: renamed from: k */
    public InterfaceC1809a1 f20498k;

    /* JADX INFO: renamed from: l */
    public InterfaceC1809a1 f20499l;

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ InterfaceC1809a1 f20500m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ InterfaceC1809a1 f20501n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ InterfaceC1809a1 f20502o;

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ InterfaceC1809a1 f20503p;

    /* JADX INFO: renamed from: q */
    public Object f20504q;

    /* JADX INFO: renamed from: r */
    public /* synthetic */ Object f20505r;

    /* JADX INFO: renamed from: s */
    public Object f20506s;

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ Object f20507t;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C5282rn(Context context, C1391o c1391o, Object obj, InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, InterfaceC1809a1 interfaceC1809a14, InterfaceC1809a1 interfaceC1809a15, InterfaceC1809a1 interfaceC1809a16, InterfaceC1809a1 interfaceC1809a17, InterfaceC1809a1 interfaceC1809a18, InterfaceC5557c interfaceC5557c, int i9) {
        super(2, interfaceC5557c);
        this.f20495h = i9;
        this.f20504q = context;
        this.f20505r = c1391o;
        this.f20506s = obj;
        this.f20497j = interfaceC1809a1;
        this.f20498k = interfaceC1809a12;
        this.f20499l = interfaceC1809a13;
        this.f20500m = interfaceC1809a14;
        this.f20501n = interfaceC1809a15;
        this.f20502o = interfaceC1809a16;
        this.f20503p = interfaceC1809a17;
        this.f20507t = interfaceC1809a18;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f20495h) {
            case 0:
                C5282rn c5282rn = new C5282rn(this.f20500m, this.f20501n, this.f20502o, (C2097h) this.f20507t, this.f20503p, interfaceC5557c);
                c5282rn.f20505r = obj;
                return c5282rn;
            case 1:
                return new C5282rn((Context) this.f20504q, (C1391o) this.f20505r, (C1379c) this.f20506s, this.f20497j, this.f20498k, this.f20499l, this.f20500m, this.f20501n, this.f20502o, this.f20503p, (InterfaceC1809a1) this.f20507t, interfaceC5557c, 1);
            default:
                return new C5282rn((Context) this.f20504q, (C1391o) this.f20505r, (String) this.f20506s, this.f20497j, this.f20498k, this.f20499l, this.f20500m, this.f20501n, this.f20502o, this.f20503p, (InterfaceC1809a1) this.f20507t, interfaceC5557c, 2);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        InterfaceC3599t interfaceC3599t = (InterfaceC3599t) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f20495h) {
        }
        return ((C5282rn) create(interfaceC3599t, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:145:0x025f */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:93:0x027d */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x02c9, code lost:
    
        if (r0 == r10) goto L118;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0326 A[Catch: all -> 0x027d, TRY_LEAVE, TryCatch #1 {all -> 0x027d, blocks: (B:91:0x0273, B:112:0x0316, B:116:0x0326, B:97:0x0292), top: B:145:0x025f }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0371  */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v25 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v93 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v22, types: [i0.a1] */
    /* JADX WARN: Type inference failed for: r3v23, types: [i0.a1] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [i0.a1] */
    /* JADX WARN: Type inference failed for: r3v50 */
    /* JADX WARN: Type inference failed for: r3v51 */
    /* JADX WARN: Type inference failed for: r3v52 */
    /* JADX WARN: Type inference failed for: r3v53 */
    /* JADX WARN: Type inference failed for: r3v54 */
    /* JADX WARN: Type inference failed for: r3v55 */
    /* JADX WARN: Type inference failed for: r3v56 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v26 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r7v1, types: [j8.h] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:119:0x033f -> B:120:0x0345). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object c3959f;
        ?? r02;
        Throwable thM8182b;
        ?? r72;
        ?? r32;
        Object objM7570x;
        ?? r5;
        InterfaceC1809a1 interfaceC1809a1;
        Object objM7570x2;
        InterfaceC1809a1 interfaceC1809a12;
        ?? r03;
        C2096g c2096g;
        ?? r73;
        C1379c c1379c;
        Object objM7570x3;
        Object objM7570x4;
        int i9 = this.f20495h;
        InterfaceC1809a1 interfaceC1809a13 = this.f20502o;
        String simpleName = "当前微信账号已被禁止上传在线插件";
        C3967n c3967n = C3967n.f12976a;
        Object obj2 = this.f20507t;
        InterfaceC1809a1 interfaceC1809a14 = this.f20503p;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        InterfaceC5557c interfaceC5557c = null;
        switch (i9) {
            case 0:
                ?? r74 = (C2097h) obj2;
                InterfaceC3599t interfaceC3599t = (InterfaceC3599t) this.f20505r;
                ?? r33 = this.f20496i;
                InterfaceC1809a1 interfaceC1809a15 = this.f20501n;
                InterfaceC1809a1 interfaceC1809a16 = this.f20500m;
                try {
                } catch (Throwable th2) {
                    th = th2;
                }
                if (r33 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C3147k c3147k = AbstractC4955ho.f17686a;
                    interfaceC1809a15.setValue(Boolean.valueOf(((List) interfaceC1809a16.getValue()).isEmpty()));
                    interfaceC1809a13.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    C5808e c5808e = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d = ExecutorC5807d.f23583i;
                    C5249qn c5249qn = new C5249qn(r74, null);
                    this.f20505r = interfaceC3599t;
                    this.f20496i = 1;
                    objM7570x = AbstractC3603v.m7570x(executorC5807d, c5249qn, this);
                    break;
                } else if (r33 == 1) {
                    AbstractC1089i.m2732I0(obj);
                    objM7570x = obj;
                } else if (r33 != 2) {
                    if (r33 == 3) {
                        InterfaceC1809a1 interfaceC1809a17 = this.f20499l;
                        C2097h c2097h = (C2097h) this.f20506s;
                        interfaceC1809a15 = this.f20498k;
                        InterfaceC1809a1 interfaceC1809a18 = this.f20497j;
                        Object obj3 = this.f20504q;
                        AbstractC1089i.m2732I0(obj);
                        ?? r75 = c2097h;
                        interfaceC1809a1 = interfaceC1809a18;
                        ?? r52 = obj3;
                        char c10 = 3;
                        ?? r34 = interfaceC1809a17;
                        interfaceC5557c = null;
                        r33 = r34;
                        r5 = r52;
                        r73 = r75;
                        try {
                            C5808e c5808e2 = AbstractC3553c0.f11555a;
                            ExecutorC5807d executorC5807d2 = ExecutorC5807d.f23583i;
                            C1538n c1538n = new C1538n(r73, interfaceC5557c, 4);
                            this.f20505r = interfaceC5557c;
                            this.f20504q = r5;
                            this.f20497j = interfaceC1809a1;
                            this.f20498k = interfaceC1809a15;
                            this.f20506s = r73;
                            this.f20499l = r33;
                            this.f20496i = 2;
                            objM7570x2 = AbstractC3603v.m7570x(executorC5807d2, c1538n, this);
                        } catch (Throwable th3) {
                            th = th3;
                            r74 = r5;
                            c3959f = new C3959f(th);
                            r32 = r33;
                            r72 = r74;
                        }
                        if (objM7570x2 != enumC5799a) {
                            ?? r23 = r5;
                            interfaceC1809a12 = interfaceC1809a1;
                            r03 = r73;
                            r74 = r23;
                            r33 = r33;
                            c2096g = (C2096g) objM7570x2;
                            List list = c2096g.f7004a;
                            C3147k c3147k2 = AbstractC4955ho.f17686a;
                            interfaceC1809a12.setValue(list);
                            if (c2096g.f7005b) {
                                c3959f = c3967n;
                                r32 = r33;
                                r72 = r74;
                                r02 = r72;
                                Throwable thM8182b2 = C3960g.m8182b(c3959f);
                                if (thM8182b2 != null) {
                                    String message = thM8182b2.getMessage();
                                    if (message == null) {
                                        message = "后台读取收藏失败";
                                    }
                                    C3147k c3147k3 = AbstractC4955ho.f17686a;
                                    r32.setValue(message);
                                }
                                C3147k c3147k4 = AbstractC4955ho.f17686a;
                                interfaceC1809a15.setValue(Boolean.FALSE);
                                thM8182b = C3960g.m8182b(r02);
                                if (thM8182b == null) {
                                    String message2 = thM8182b.getMessage();
                                    if (message2 == null) {
                                        message2 = "读取收藏失败";
                                    }
                                    interfaceC1809a13.setValue(message2);
                                    if (((List) interfaceC1809a16.getValue()).isEmpty()) {
                                        interfaceC1809a16.setValue(C4173t.f13710g);
                                    }
                                    interfaceC1809a14.setValue(Boolean.FALSE);
                                }
                                break;
                            } else {
                                this.f20505r = interfaceC5557c;
                                this.f20504q = r74;
                                this.f20497j = interfaceC1809a12;
                                this.f20498k = interfaceC1809a15;
                                this.f20506s = r03;
                                this.f20499l = r33;
                                c10 = 3;
                                this.f20496i = 3;
                                if (AbstractC3603v.m7552f(40L, this) != enumC5799a) {
                                    ?? r232 = r74;
                                    r75 = r03;
                                    interfaceC1809a1 = interfaceC1809a12;
                                    r52 = r232;
                                    r34 = r33;
                                    interfaceC5557c = null;
                                    r33 = r34;
                                    r5 = r52;
                                    r73 = r75;
                                    C5808e c5808e22 = AbstractC3553c0.f11555a;
                                    ExecutorC5807d executorC5807d22 = ExecutorC5807d.f23583i;
                                    C1538n c1538n2 = new C1538n(r73, interfaceC5557c, 4);
                                    this.f20505r = interfaceC5557c;
                                    this.f20504q = r5;
                                    this.f20497j = interfaceC1809a1;
                                    this.f20498k = interfaceC1809a15;
                                    this.f20506s = r73;
                                    this.f20499l = r33;
                                    this.f20496i = 2;
                                    objM7570x2 = AbstractC3603v.m7570x(executorC5807d22, c1538n2, this);
                                    if (objM7570x2 != enumC5799a) {
                                    }
                                }
                            }
                        }
                    } else {
                        C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                    }
                    break;
                } else {
                    InterfaceC1809a1 interfaceC1809a19 = this.f20499l;
                    C2097h c2097h2 = (C2097h) this.f20506s;
                    interfaceC1809a15 = this.f20498k;
                    interfaceC1809a12 = this.f20497j;
                    Object obj4 = this.f20504q;
                    AbstractC1089i.m2732I0(obj);
                    objM7570x2 = obj;
                    r03 = c2097h2;
                    r33 = interfaceC1809a19;
                    r74 = obj4;
                    c2096g = (C2096g) objM7570x2;
                    List list2 = c2096g.f7004a;
                    C3147k c3147k22 = AbstractC4955ho.f17686a;
                    interfaceC1809a12.setValue(list2);
                    if (c2096g.f7005b) {
                    }
                }
                Object obj5 = ((C3960g) objM7570x).f12964g;
                C3147k c3147k5 = AbstractC4955ho.f17686a;
                interfaceC1809a15.setValue(Boolean.FALSE);
                boolean z9 = obj5 instanceof C3959f;
                r02 = obj5;
                if (!z9) {
                    C2096g c2096g2 = (C2096g) obj5;
                    interfaceC1809a16.setValue(c2096g2.f7004a);
                    r02 = obj5;
                    if (c2096g2.f7005b) {
                        interfaceC1809a14.setValue(Boolean.TRUE);
                        r5 = obj5;
                        r33 = interfaceC1809a13;
                        interfaceC1809a15 = interfaceC1809a14;
                        interfaceC1809a1 = interfaceC1809a16;
                        r73 = r74;
                        C5808e c5808e222 = AbstractC3553c0.f11555a;
                        ExecutorC5807d executorC5807d222 = ExecutorC5807d.f23583i;
                        C1538n c1538n22 = new C1538n(r73, interfaceC5557c, 4);
                        this.f20505r = interfaceC5557c;
                        this.f20504q = r5;
                        this.f20497j = interfaceC1809a1;
                        this.f20498k = interfaceC1809a15;
                        this.f20506s = r73;
                        this.f20499l = r33;
                        this.f20496i = 2;
                        objM7570x2 = AbstractC3603v.m7570x(executorC5807d222, c1538n22, this);
                        if (objM7570x2 != enumC5799a) {
                        }
                    }
                }
                thM8182b = C3960g.m8182b(r02);
                if (thM8182b == null) {
                }
                break;
            case 1:
                C1379c c1379c2 = (C1379c) this.f20506s;
                C1391o c1391o = (C1391o) this.f20505r;
                Context context = (Context) this.f20504q;
                int i10 = this.f20496i;
                InterfaceC5557c interfaceC5557c2 = null;
                if (i10 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e3 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d3 = ExecutorC5807d.f23583i;
                    C4639u0 c4639u0 = new C4639u0(context, c1391o, c1379c2, interfaceC5557c2, 6);
                    c1379c = c1379c2;
                    this.f20496i = 1;
                    objM7570x3 = AbstractC3603v.m7570x(executorC5807d3, c4639u0, this);
                    if (objM7570x3 == enumC5799a) {
                    }
                } else if (i10 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                    objM7570x3 = obj;
                    c1379c = c1379c2;
                }
                Object obj6 = ((C3960g) objM7570x3).f12964g;
                InterfaceC1809a1 interfaceC1809a110 = this.f20497j;
                InterfaceC1809a1 interfaceC1809a111 = this.f20498k;
                InterfaceC1809a1 interfaceC1809a112 = this.f20499l;
                Throwable thM8182b3 = C3960g.m8182b(obj6);
                if (thM8182b3 == null) {
                    C1380d c1380d = (C1380d) obj6;
                    List list3 = (List) interfaceC1809a110.getValue();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj7 : list3) {
                        if (!AbstractC1416l.m3825a(((C1379c) obj7).f4578a, c1379c.f4578a)) {
                            arrayList.add(obj7);
                        }
                    }
                    interfaceC1809a110.setValue(arrayList);
                    interfaceC1809a111.setValue(Boolean.TRUE);
                    C5491y2.m9767A1(interfaceC1809a112, this.f20500m, this.f20501n, c1391o.f4617a, null, new Long(c1380d.f4585b), 16);
                    if (c1380d.f4585b > ((List) interfaceC1809a110.getValue()).size()) {
                        AbstractC3199a.m6848u((Number) interfaceC1809a13.getValue(), 1, interfaceC1809a13);
                    }
                } else {
                    if (!(thM8182b3 instanceof C1382f) || !AbstractC1416l.m3825a(((C1382f) thM8182b3).f4589g, "UPLOADER_BLACKLISTED")) {
                        String message3 = thM8182b3.getMessage();
                        String string = message3 != null ? AbstractC3149m.m6703R0(message3).toString() : null;
                        simpleName = (string == null || AbstractC3149m.m6721t0(string)) ? null : string;
                        if (simpleName == null) {
                            simpleName = thM8182b3.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a14.setValue(simpleName);
                    Toast.makeText(context, "删除评论失败: " + ((String) interfaceC1809a14.getValue()), 1).show();
                }
                ((InterfaceC1809a1) obj2).setValue(null);
                break;
            default:
                C1391o c1391o2 = (C1391o) this.f20505r;
                Context context2 = (Context) this.f20504q;
                int i11 = this.f20496i;
                InterfaceC5557c interfaceC5557c3 = null;
                if (i11 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    C5808e c5808e4 = AbstractC3553c0.f11555a;
                    ExecutorC5807d executorC5807d4 = ExecutorC5807d.f23583i;
                    C4639u0 c4639u02 = new C4639u0(context2, c1391o2, (String) this.f20506s, interfaceC5557c3, 8);
                    this.f20496i = 1;
                    objM7570x4 = AbstractC3603v.m7570x(executorC5807d4, c4639u02, this);
                    if (objM7570x4 == enumC5799a) {
                    }
                } else if (i11 != 1) {
                    C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                } else {
                    AbstractC1089i.m2732I0(obj);
                    objM7570x4 = obj;
                }
                Object obj8 = ((C3960g) objM7570x4).f12964g;
                InterfaceC1809a1 interfaceC1809a113 = this.f20497j;
                InterfaceC1809a1 interfaceC1809a114 = this.f20498k;
                InterfaceC1809a1 interfaceC1809a115 = this.f20499l;
                Throwable thM8182b4 = C3960g.m8182b(obj8);
                if (thM8182b4 == null) {
                    C1380d c1380d2 = (C1380d) obj8;
                    C1379c c1379c3 = c1380d2.f4584a;
                    if (c1379c3 != null) {
                        List listM99x0 = AbstractC0000a.m99x0(c1379c3);
                        List list4 = (List) interfaceC1809a113.getValue();
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj9 : list4) {
                            if (!AbstractC1416l.m3825a(((C1379c) obj9).f4578a, c1379c3.f4578a)) {
                                arrayList2.add(obj9);
                            }
                        }
                        interfaceC1809a113.setValue(AbstractC4166m.m8403L1(100, AbstractC4166m.m8397F1(listM99x0, arrayList2)));
                    }
                    interfaceC1809a114.setValue(HttpUrl.FRAGMENT_ENCODE_SET);
                    interfaceC1809a115.setValue(Boolean.TRUE);
                    C5491y2.m9767A1(this.f20500m, this.f20501n, this.f20502o, c1391o2.f4617a, null, new Long(c1380d2.f4585b), 16);
                } else {
                    if (!(thM8182b4 instanceof C1382f) || !AbstractC1416l.m3825a(((C1382f) thM8182b4).f4589g, "UPLOADER_BLACKLISTED")) {
                        String message4 = thM8182b4.getMessage();
                        String string2 = message4 != null ? AbstractC3149m.m6703R0(message4).toString() : null;
                        simpleName = (string2 == null || AbstractC3149m.m6721t0(string2)) ? null : string2;
                        if (simpleName == null) {
                            simpleName = thM8182b4.getClass().getSimpleName();
                        }
                    }
                    interfaceC1809a14.setValue(simpleName);
                    Toast.makeText(context2, "评论失败: " + ((String) interfaceC1809a14.getValue()), 1).show();
                }
                ((InterfaceC1809a1) obj2).setValue(Boolean.FALSE);
                break;
        }
        return c3967n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5282rn(InterfaceC1809a1 interfaceC1809a1, InterfaceC1809a1 interfaceC1809a12, InterfaceC1809a1 interfaceC1809a13, C2097h c2097h, InterfaceC1809a1 interfaceC1809a14, InterfaceC5557c interfaceC5557c) {
        super(2, interfaceC5557c);
        this.f20495h = 0;
        this.f20500m = interfaceC1809a1;
        this.f20501n = interfaceC1809a12;
        this.f20502o = interfaceC1809a13;
        this.f20507t = c2097h;
        this.f20503p = interfaceC1809a14;
    }
}
