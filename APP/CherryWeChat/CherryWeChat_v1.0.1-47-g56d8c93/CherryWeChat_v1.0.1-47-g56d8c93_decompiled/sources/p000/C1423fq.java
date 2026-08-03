package p000;

import android.content.SharedPreferences;
import android.widget.LinearLayout;
import com.youth.banner.Banner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: fq */
/* JADX INFO: loaded from: classes.dex */
public final class C1423fq extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f5022e;

    /* JADX INFO: renamed from: f */
    public int f5023f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ C2112jq f5024g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1423fq(C2112jq c2112jq, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f5022e = i;
        this.f5024g = c2112jq;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f5022e) {
        }
        return ((C1423fq) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f5022e) {
            case 0:
                return new C1423fq(this.f5024g, interfaceC0190Eb, 0);
            default:
                return new C1423fq(this.f5024g, interfaceC0190Eb, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        Object[] objArr;
        int i = this.f5022e;
        C0829TC c0829tc = C0829TC.f2620a;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        C2112jq c2112jq = this.f5024g;
        Object obj2 = null;
        LinearLayout linearLayout = null;
        switch (i) {
            case 0:
                int i2 = this.f5023f;
                try {
                    if (i2 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0594Ns c0594Ns = C0594Ns.f1925a;
                        this.f5023f = 1;
                        c0594Ns.getClass();
                        obj = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400248002312245L), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i2 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-811065919141941L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    List listM4302e = C2112jq.m4302e(c2112jq, (String) obj);
                    Iterator it = listM4302e.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            Object next = it.next();
                            if (AbstractC0585Nj.m1134a(((C1335dq) next).f4809a, AbstractC0295Gu.m625r(-811216242997301L))) {
                                obj2 = next;
                            }
                        }
                    }
                    C1335dq c1335dq = (C1335dq) obj2;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listM4302e) {
                        if (!AbstractC0585Nj.m1134a(((C1335dq) obj3).f4809a, AbstractC0295Gu.m625r(-811306437310517L))) {
                            arrayList.add(obj3);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        C1335dq c1335dq2 = (C1335dq) obj4;
                        String str = c1335dq2.f4815g;
                        if (AbstractC0585Nj.m1134a(str, AbstractC0295Gu.m625r(-811396631623733L)) ? true : AbstractC0585Nj.m1134a(str, AbstractC0295Gu.m625r(-811413811492917L)) ? c1335dq2.f4816h.contains(C1456gf.m2791I()) : false) {
                            arrayList2.add(obj4);
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj5 : arrayList2) {
                        C1335dq c1335dq3 = (C1335dq) obj5;
                        if (c1335dq3.f4814f) {
                            SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
                            StringBuilder sb = new StringBuilder();
                            sb.append(AbstractC0295Gu.m625r(-811435286329397L));
                            sb.append(c1335dq3.f4809a);
                            sb.append(AbstractC0295Gu.m625r(-810945660057653L));
                            objArr = !AbstractC0599Nx.m1172a(sb.toString(), false);
                        }
                        if (objArr != false) {
                            arrayList3.add(obj5);
                        }
                    }
                    if (c1335dq != null) {
                        SharedPreferences sharedPreferences2 = AbstractC0599Nx.f1939a;
                        if (!AbstractC0599Nx.m1172a(AbstractC0295Gu.m625r(-810975724828725L), false)) {
                            C2112jq.m4303f(c2112jq, c1335dq, new C1389f(7, arrayList3, c2112jq));
                            return c0829tc;
                        }
                    }
                    if (!arrayList3.isEmpty() && !arrayList3.isEmpty()) {
                        c2112jq.m4309l(arrayList3, 0);
                        return c0829tc;
                    }
                    return c0829tc;
                } catch (Exception e) {
                    e.printStackTrace();
                    return c0829tc;
                }
            default:
                int i3 = this.f5023f;
                try {
                    if (i3 == 0) {
                        AbstractC0628Oj.m1232T(obj);
                        C0594Ns c0594Ns2 = C0594Ns.f1925a;
                        this.f5023f = 1;
                        c0594Ns2.getClass();
                        obj = C0594Ns.m1166e(AbstractC0295Gu.m625r(-400668909107253L), this);
                        if (obj == enumC1453gc) {
                            return enumC1453gc;
                        }
                    } else {
                        if (i3 != 1) {
                            throw new IllegalStateException(AbstractC0295Gu.m625r(-809670054770741L));
                        }
                        AbstractC0628Oj.m1232T(obj);
                    }
                    c2112jq.f7430a = C2112jq.m4301a(c2112jq, (String) obj);
                    Banner banner = c2112jq.f7431b;
                    if (banner == null) {
                        AbstractC0295Gu.m625r(-826313053042741L);
                        banner = null;
                    }
                    banner.setDatas(c2112jq.f7430a);
                    if (c2112jq.f7430a.isEmpty()) {
                        LinearLayout linearLayout2 = c2112jq.f7432c;
                        if (linearLayout2 == null) {
                            AbstractC0295Gu.m625r(-826390362454069L);
                            linearLayout2 = null;
                        }
                        linearLayout2.setVisibility(8);
                        return c0829tc;
                    }
                    LinearLayout linearLayout3 = c2112jq.f7432c;
                    if (linearLayout3 == null) {
                        AbstractC0295Gu.m625r(-826343117813813L);
                        linearLayout3 = null;
                    }
                    linearLayout3.setVisibility(0);
                    return c0829tc;
                } catch (Exception e2) {
                    e2.printStackTrace();
                    LinearLayout linearLayout4 = c2112jq.f7432c;
                    if (linearLayout4 == null) {
                        AbstractC0295Gu.m625r(-809622810130485L);
                    } else {
                        linearLayout = linearLayout4;
                    }
                    linearLayout.setVisibility(8);
                    return c0829tc;
                }
        }
    }
}
