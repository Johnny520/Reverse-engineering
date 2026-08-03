package p332wb;

import android.graphics.Color;
import java.util.Arrays;
import java.util.Iterator;
import p077f8.AbstractC1089i;
import p085fg.InterfaceC1231l;
import p085fg.InterfaceC1235p;
import p136j8.C2104o;
import p174m.AbstractC2677y2;
import p259r9.AbstractC3754e0;
import p267s1.AbstractC3913s;
import p267s1.C3903k;
import p267s1.C3904k0;
import p267s1.C3914t;
import p267s1.EnumC3905l;
import p276sf.C3967n;
import p352xf.EnumC5799a;
import p370yf.AbstractC6043h;
import wf.InterfaceC5557c;

/* JADX INFO: renamed from: wb.f5 */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C4870f5 extends AbstractC6043h implements InterfaceC1235p {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f17050g;

    /* JADX INFO: renamed from: h */
    public C3914t f17051h;

    /* JADX INFO: renamed from: i */
    public int f17052i;

    /* JADX INFO: renamed from: j */
    public /* synthetic */ Object f17053j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ InterfaceC1231l f17054k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C4837e5 f17055l;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4870f5(InterfaceC1231l interfaceC1231l, C4837e5 c4837e5, InterfaceC5557c interfaceC5557c, int i9) {
        super(interfaceC5557c);
        this.f17050g = i9;
        this.f17054k = interfaceC1231l;
        this.f17055l = c4837e5;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p370yf.AbstractC6036a
    public final InterfaceC5557c create(Object obj, InterfaceC5557c interfaceC5557c) {
        switch (this.f17050g) {
            case 0:
                C4870f5 c4870f5 = new C4870f5(this.f17054k, this.f17055l, interfaceC5557c, 0);
                c4870f5.f17053j = obj;
                return c4870f5;
            default:
                C4870f5 c4870f52 = new C4870f5(this.f17054k, this.f17055l, interfaceC5557c, 1);
                c4870f52.f17053j = obj;
                return c4870f52;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p085fg.InterfaceC1235p
    public final Object invoke(Object obj, Object obj2) {
        C3904k0 c3904k0 = (C3904k0) obj;
        InterfaceC5557c interfaceC5557c = (InterfaceC5557c) obj2;
        switch (this.f17050g) {
        }
        return ((C4870f5) create(c3904k0, interfaceC5557c)).invokeSuspend(C3967n.f12976a);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (r4 == r5) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00af, code lost:
    
        if (r6 != r5) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0177, code lost:
    
        if (r4 == r5) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01dd, code lost:
    
        if (r1 != r5) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:?, code lost:
    
        return r5;
     */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v23, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x00af -> B:18:0x00b4). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x01dd -> B:48:0x01e2). Please report as a decompilation issue!!! */
    @Override // p370yf.AbstractC6036a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM6117b;
        C3914t c3914t;
        C3967n c3967n;
        char c10;
        InterfaceC1231l interfaceC1231l;
        float f3;
        int i9;
        Object objM8102e;
        Object next;
        Object objM6117b2;
        C3914t c3914t2;
        int i10;
        InterfaceC1231l interfaceC1231l2;
        Object objM8102e2;
        float f10;
        C3967n c3967n2;
        Object next2;
        C4870f5 c4870f5 = this;
        int i11 = c4870f5.f17050g;
        C3967n c3967n3 = C3967n.f12976a;
        EnumC3905l enumC3905l = EnumC3905l.f12813h;
        EnumC5799a enumC5799a = EnumC5799a.f23547g;
        InterfaceC1231l interfaceC1231l3 = c4870f5.f17054k;
        C4837e5 c4837e5 = c4870f5.f17055l;
        switch (i11) {
            case 0:
                float f11 = c4837e5.f16753a;
                C3904k0 c3904k0 = (C3904k0) c4870f5.f17053j;
                int i12 = c4870f5.f17052i;
                if (i12 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c4870f5.f17053j = c3904k0;
                    c4870f5.f17052i = 1;
                    objM6117b = AbstractC2677y2.m6117b(c3904k0, c4870f5, 2);
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c3914t = c4870f5.f17051h;
                        AbstractC1089i.m2732I0(obj);
                        c3967n = c3967n3;
                        interfaceC1231l = interfaceC1231l3;
                        f3 = f11;
                        objM8102e = obj;
                        c10 = ' ';
                        Iterator it = ((C3903k) objM8102e).f12800a.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                if (AbstractC3913s.m8112e(((C3914t) next).f12834a, c3914t.f12834a)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        C3914t c3914t3 = (C3914t) next;
                        if (c3914t3 != null) {
                            long j3 = c3914t3.f12836c;
                            long j4 = c3904k0.f12811l.f12820E;
                            interfaceC1231l.invoke(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.HSVToColor(new float[]{f3, AbstractC3754e0.m7907q(Float.intBitsToFloat((int) (j3 >> c10)) / ((int) (j4 >> c10)), 0.0f, 1.0f), AbstractC3754e0.m7907q(1.0f - (Float.intBitsToFloat((int) (j3 & 4294967295L)) / ((int) (j4 & 4294967295L))), 0.0f, 1.0f)}) & 16777215)}, 1)));
                            c3914t3.m8118a();
                            if (c3914t3.f12837d) {
                                c4870f5 = this;
                                i9 = 2;
                                c4870f5.f17053j = c3904k0;
                                c4870f5.f17051h = c3914t;
                                c4870f5.f17052i = i9;
                                objM8102e = c3904k0.m8102e(enumC3905l, c4870f5);
                            }
                            break;
                        }
                        return c3967n;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM6117b = obj;
                }
                c3914t = (C3914t) objM6117b;
                long j5 = c3914t.f12836c;
                c3967n = c3967n3;
                long j10 = c3904k0.f12811l.f12820E;
                c10 = ' ';
                interfaceC1231l = interfaceC1231l3;
                f3 = f11;
                i9 = 2;
                interfaceC1231l.invoke(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.HSVToColor(new float[]{f3, AbstractC3754e0.m7907q(Float.intBitsToFloat((int) (j5 >> 32)) / ((int) (j10 >> 32)), 0.0f, 1.0f), AbstractC3754e0.m7907q(1.0f - (Float.intBitsToFloat((int) (j5 & 4294967295L)) / ((int) (j10 & 4294967295L))), 0.0f, 1.0f)}) & 16777215)}, 1)));
                c3904k0 = c3904k0;
                c4870f5.f17053j = c3904k0;
                c4870f5.f17051h = c3914t;
                c4870f5.f17052i = i9;
                objM8102e = c3904k0.m8102e(enumC3905l, c4870f5);
                break;
            default:
                float f12 = c4837e5.f16755c;
                float f13 = c4837e5.f16754b;
                C3904k0 c3904k02 = (C3904k0) c4870f5.f17053j;
                int i13 = c4870f5.f17052i;
                if (i13 == 0) {
                    AbstractC1089i.m2732I0(obj);
                    c4870f5.f17053j = c3904k02;
                    c4870f5.f17052i = 1;
                    objM6117b2 = AbstractC2677y2.m6117b(c3904k02, c4870f5, 2);
                } else {
                    if (i13 != 1) {
                        if (i13 != 2) {
                            C2104o.m5276A("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        c3914t2 = c4870f5.f17051h;
                        AbstractC1089i.m2732I0(obj);
                        objM8102e2 = obj;
                        interfaceC1231l2 = interfaceC1231l3;
                        Iterator it2 = ((C3903k) objM8102e2).f12800a.iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                next2 = it2.next();
                                f10 = f12;
                                c3967n2 = c3967n3;
                                if (!AbstractC3913s.m8112e(((C3914t) next2).f12834a, c3914t2.f12834a)) {
                                    c3967n3 = c3967n2;
                                    f12 = f10;
                                }
                            } else {
                                f10 = f12;
                                c3967n2 = c3967n3;
                                next2 = null;
                            }
                        }
                        C3914t c3914t4 = (C3914t) next2;
                        if (c3914t4 != null) {
                            interfaceC1231l2.invoke(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.HSVToColor(new float[]{AbstractC3754e0.m7907q(Float.intBitsToFloat((int) (c3914t4.f12836c & 4294967295L)) / ((int) (c3904k02.f12811l.f12820E & 4294967295L)), 0.0f, 1.0f) * 360.0f, f13, f10}) & 16777215)}, 1)));
                            c3914t4.m8118a();
                            if (c3914t4.f12837d) {
                                c3967n3 = c3967n2;
                                f12 = f10;
                                i10 = 2;
                                c4870f5.f17053j = c3904k02;
                                c4870f5.f17051h = c3914t2;
                                c4870f5.f17052i = i10;
                                objM8102e2 = c3904k02.m8102e(enumC3905l, c4870f5);
                            }
                            break;
                        }
                        return c3967n2;
                    }
                    AbstractC1089i.m2732I0(obj);
                    objM6117b2 = obj;
                }
                c3914t2 = (C3914t) objM6117b2;
                i10 = 2;
                interfaceC1231l2 = interfaceC1231l3;
                interfaceC1231l2.invoke(String.format("#%06X", Arrays.copyOf(new Object[]{Integer.valueOf(Color.HSVToColor(new float[]{AbstractC3754e0.m7907q(Float.intBitsToFloat((int) (c3914t2.f12836c & 4294967295L)) / ((int) (c3904k02.f12811l.f12820E & 4294967295L)), 0.0f, 1.0f) * 360.0f, f13, f12}) & 16777215)}, 1)));
                c4870f5.f17053j = c3904k02;
                c4870f5.f17051h = c3914t2;
                c4870f5.f17052i = i10;
                objM8102e2 = c3904k02.m8102e(enumC3905l, c4870f5);
                break;
        }
    }
}
