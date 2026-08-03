package p049d9;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.C0119x;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import okio.ByteString;
import p020b5.C0184c;
import p036c9.C0446i;
import p036c9.RunnableC0487t;
import p051db.C0765c;
import p071f1.C1003g;
import p071f1.C1017n;
import p085fg.InterfaceC1220a;
import p085fg.InterfaceC1231l;
import p101h1.C1565b;
import p101h1.InterfaceC1567d;
import p109hb.C1686j0;
import p117i0.InterfaceC1809a1;
import p251r.C3623h;
import p251r.C3632q;
import p266s0.C3874d;
import p276sf.C3958e;
import p276sf.C3967n;
import p308v1.AbstractC4374a1;
import p332wb.AbstractC4955ho;
import p332wb.AbstractC5193p0;
import p332wb.C5436wc;
import p332wb.C5445wl;
import p332wb.C5502yd;
import p339x1.C5610h0;
import p345x8.C5718k;

/* JADX INFO: renamed from: d9.h */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0747h implements InterfaceC1231l {

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ int f2222g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ boolean f2223h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Object f2224i;

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object f2225j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ Object f2226k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0747h(InterfaceC1809a1 interfaceC1809a1, ArrayList arrayList, List list, boolean z9) {
        this.f2222g = 2;
        this.f2224i = interfaceC1809a1;
        this.f2225j = arrayList;
        this.f2226k = list;
        this.f2223h = z9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // p085fg.InterfaceC1231l
    public final Object invoke(Object obj) {
        switch (this.f2222g) {
            case 0:
                Activity activity = (Activity) this.f2224i;
                String str = (String) this.f2225j;
                boolean z9 = this.f2223h;
                C0752m c0752m = (C0752m) this.f2226k;
                if (((Integer) obj).intValue() == 0) {
                    C0446i c0446i = new C0446i(c0752m, 11, activity);
                    C0745f c0745f = C0745f.f2216a;
                    activity.getClass();
                    str.getClass();
                    C0745f.f2216a.m1935b(activity, c0446i, str, true);
                } else if (z9) {
                    AbstractC0754o.m1950g(c0752m.f2241a.f12143a, str);
                    if (activity != null) {
                        new Handler(Looper.getMainLooper()).post(new RunnableC0487t(activity, "已恢复微信头像", 3));
                    }
                }
                return C3967n.f12976a;
            case 1:
                InterfaceC1220a interfaceC1220a = (InterfaceC1220a) this.f2224i;
                boolean z10 = this.f2223h;
                C1003g c1003g = (C1003g) this.f2225j;
                C1017n c1017n = (C1017n) this.f2226k;
                C5610h0 c5610h0 = (C5610h0) obj;
                c5610h0.m10064e();
                C1565b c1565b = c5610h0.f22833g;
                if (((Boolean) interfaceC1220a.invoke()).booleanValue()) {
                    if (z10) {
                        long jMo4090I0 = c1565b.mo4090I0();
                        C0184c c0184c = c1565b.f5220h;
                        long jM825v = c0184c.m825v();
                        c0184c.m819p().mo2487e();
                        try {
                            ((C0119x) c0184c.f469a).m587S(-1.0f, 1.0f, jMo4090I0);
                            InterfaceC1567d.m4084U(c5610h0, c1003g, 0L, 0.0f, c1017n, 0, 46);
                        } finally {
                            c0184c.m819p().mo2497p();
                            c0184c.m803U(jM825v);
                        }
                    } else {
                        InterfaceC1567d.m4084U(c5610h0, c1003g, 0L, 0.0f, c1017n, 0, 46);
                    }
                }
                return C3967n.f12976a;
            case 2:
                InterfaceC1809a1 interfaceC1809a1 = (InterfaceC1809a1) this.f2224i;
                ArrayList arrayList = (ArrayList) this.f2225j;
                ?? r2 = this.f2226k;
                boolean z11 = this.f2223h;
                AbstractC4374a1 abstractC4374a1 = (AbstractC4374a1) obj;
                abstractC4374a1.f14583g = true;
                int size = arrayList.size();
                for (int i9 = 0; i9 < size; i9++) {
                    ((C3632q) arrayList.get(i9)).m7615c(abstractC4374a1, z11);
                }
                int size2 = r2.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    ((C3632q) r2.get(i10)).m7615c(abstractC4374a1, z11);
                }
                abstractC4374a1.f14583g = false;
                interfaceC1809a1.getValue();
                break;
            case 3:
                List list = (List) this.f2224i;
                boolean z12 = this.f2223h;
                InterfaceC1231l interfaceC1231l = (InterfaceC1231l) this.f2225j;
                InterfaceC1231l interfaceC1231l2 = (InterfaceC1231l) this.f2226k;
                C3623h c3623h = (C3623h) obj;
                c3623h.getClass();
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19844p4, 3);
                C3623h.m7604a(c3623h, null, new C3874d(1130585210, new C5502yd(z12, interfaceC1231l, list), true), 3);
                C3623h.m7604a(c3623h, null, AbstractC5193p0.f19852q4, 3);
                if (list.isEmpty()) {
                    C3623h.m7604a(c3623h, null, AbstractC5193p0.f19868s4, 3);
                } else {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C3623h.m7604a(c3623h, null, new C3874d(660479474, new C5436wc(2, (C0765c) it.next(), interfaceC1231l2), true), 3);
                    }
                }
                return C3967n.f12976a;
            case 4:
                boolean z13 = this.f2223h;
                InterfaceC1231l interfaceC1231l3 = (InterfaceC1231l) this.f2224i;
                List list2 = (List) this.f2225j;
                InterfaceC1220a interfaceC1220a2 = (InterfaceC1220a) this.f2226k;
                C3623h c3623h2 = (C3623h) obj;
                c3623h2.getClass();
                C3623h.m7604a(c3623h2, null, AbstractC5193p0.f19608K0, 3);
                C3623h.m7604a(c3623h2, null, new C3874d(-7471039, new C1686j0(z13, interfaceC1231l3, list2, interfaceC1220a2), true), 3);
                break;
            case 5:
                boolean z14 = this.f2223h;
                InterfaceC1231l interfaceC1231l4 = (InterfaceC1231l) this.f2224i;
                InterfaceC1809a1 interfaceC1809a12 = (InterfaceC1809a1) this.f2225j;
                InterfaceC1809a1 interfaceC1809a13 = (InterfaceC1809a1) this.f2226k;
                String strM9500a5 = (String) obj;
                strM9500a5.getClass();
                if (z14) {
                    C3958e c3958eM9483Y4 = AbstractC4955ho.m9483Y4((String) interfaceC1809a12.getValue());
                    if (((Boolean) interfaceC1809a13.getValue()).booleanValue()) {
                        CharSequence charSequence = (CharSequence) c3958eM9483Y4.f12961g;
                        if (charSequence.length() == 0) {
                            charSequence = strM9500a5;
                        }
                        strM9500a5 = AbstractC4955ho.m9500a5((String) charSequence, strM9500a5);
                    } else {
                        strM9500a5 = AbstractC4955ho.m9500a5(strM9500a5, (String) c3958eM9483Y4.f12962h);
                    }
                }
                interfaceC1231l4.invoke(strM9500a5);
                break;
            case 6:
                SharedPreferences sharedPreferences = (SharedPreferences) this.f2224i;
                boolean z15 = this.f2223h;
                InterfaceC1809a1 interfaceC1809a14 = (InterfaceC1809a1) this.f2225j;
                InterfaceC1809a1 interfaceC1809a15 = (InterfaceC1809a1) this.f2226k;
                C3623h c3623h3 = (C3623h) obj;
                c3623h3.getClass();
                C3623h.m7604a(c3623h3, null, AbstractC5193p0.f19668S4, 3);
                C3623h.m7604a(c3623h3, null, new C3874d(-227850278, new C5445wl(sharedPreferences, z15, interfaceC1809a14, interfaceC1809a15), true), 3);
                break;
            default:
                C5718k c5718k = (C5718k) this.f2224i;
                AtomicBoolean atomicBoolean = (AtomicBoolean) this.f2225j;
                boolean z16 = this.f2223h;
                ArrayList arrayList2 = (ArrayList) this.f2226k;
                ByteString byteString = (ByteString) obj;
                byteString.getClass();
                if (c5718k != null) {
                    c5718k.m10323i();
                }
                if (atomicBoolean.get()) {
                    byte[] byteArray = byteString.toByteArray();
                    if (z16 && byteArray.length != 0) {
                        synchronized (arrayList2) {
                            arrayList2.add(byteArray);
                        }
                    }
                }
                return C3967n.f12976a;
        }
        return C3967n.f12976a;
    }

    public /* synthetic */ C0747h(int i9, Object obj, Object obj2, Object obj3, boolean z9) {
        this.f2222g = i9;
        this.f2224i = obj;
        this.f2223h = z9;
        this.f2225j = obj2;
        this.f2226k = obj3;
    }

    public /* synthetic */ C0747h(Object obj, Serializable serializable, boolean z9, Object obj2, int i9) {
        this.f2222g = i9;
        this.f2224i = obj;
        this.f2225j = serializable;
        this.f2223h = z9;
        this.f2226k = obj2;
    }

    public /* synthetic */ C0747h(boolean z9, InterfaceC1231l interfaceC1231l, Object obj, Object obj2, int i9) {
        this.f2222g = i9;
        this.f2223h = z9;
        this.f2224i = interfaceC1231l;
        this.f2225j = obj;
        this.f2226k = obj2;
    }
}
