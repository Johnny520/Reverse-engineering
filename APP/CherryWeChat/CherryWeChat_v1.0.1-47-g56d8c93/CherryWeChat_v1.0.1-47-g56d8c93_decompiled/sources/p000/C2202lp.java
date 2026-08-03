package p000;

import android.os.Bundle;
import java.io.File;
import kotlin.jvm.functions.Function2;
import org.json.JSONObject;

/* JADX INFO: renamed from: lp */
/* JADX INFO: loaded from: classes.dex */
public final class C2202lp extends AbstractC0644Oz implements Function2 {

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ int f7654e;

    /* JADX INFO: renamed from: f */
    public int f7655f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ String f7656g;

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ String f7657h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2202lp(String str, String str2, InterfaceC0190Eb interfaceC0190Eb, int i) {
        super(interfaceC0190Eb);
        this.f7654e = i;
        this.f7656g = str;
        this.f7657h = str2;
    }

    @Override // kotlin.jvm.functions.Function2
    /* JADX INFO: renamed from: d */
    public final Object mo446d(Object obj, Object obj2) {
        InterfaceC1409fc interfaceC1409fc = (InterfaceC1409fc) obj;
        InterfaceC0190Eb interfaceC0190Eb = (InterfaceC0190Eb) obj2;
        switch (this.f7654e) {
        }
        return ((C2202lp) mo447h(interfaceC0190Eb, interfaceC1409fc)).mo448i(C0829TC.f2620a);
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: h */
    public final InterfaceC0190Eb mo447h(InterfaceC0190Eb interfaceC0190Eb, Object obj) {
        switch (this.f7654e) {
            case 0:
                return new C2202lp(this.f7656g, this.f7657h, interfaceC0190Eb, 0);
            case 1:
                return new C2202lp(this.f7656g, this.f7657h, interfaceC0190Eb, 1);
            default:
                return new C2202lp(this.f7656g, this.f7657h, interfaceC0190Eb, 2);
        }
    }

    @Override // p000.AbstractC2571u5
    /* JADX INFO: renamed from: i */
    public final Object mo448i(Object obj) throws Throwable {
        int i = this.f7654e;
        C0829TC c0829tc = C0829TC.f2620a;
        String str = this.f7657h;
        String str2 = this.f7656g;
        EnumC1453gc enumC1453gc = EnumC1453gc.f5148a;
        switch (i) {
            case 0:
                int i2 = this.f7655f;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-82171314305077L));
                    }
                    AbstractC0628Oj.m1232T(obj);
                    return obj;
                }
                AbstractC0628Oj.m1232T(obj);
                C0594Ns c0594Ns = C0594Ns.f1925a;
                String strM2794L = C1456gf.m2794L();
                String strM2791I = C1456gf.m2791I();
                String strM2793K = C1456gf.m2793K();
                String strM2792J = C1456gf.m2792J();
                String strM625r = AbstractC0295Gu.m625r(-82141249534005L);
                this.f7655f = 1;
                c0594Ns.getClass();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AbstractC0295Gu.m625r(-400394031200309L), strM2794L);
                jSONObject.put(AbstractC0295Gu.m625r(-400432685905973L), strM2791I);
                jSONObject.put(AbstractC0295Gu.m625r(-400497110415413L), strM2793K);
                jSONObject.put(AbstractC0295Gu.m625r(-401094110869557L), AbstractC0295Gu.m625r(-401124175640629L));
                jSONObject.put(AbstractC0295Gu.m625r(-401158535378997L), str2);
                jSONObject.put(AbstractC0295Gu.m625r(-401184305182773L), str);
                jSONObject.put(AbstractC0295Gu.m625r(-401222959888437L), strM2792J);
                jSONObject.put(AbstractC0295Gu.m625r(-401248729692213L), strM625r);
                String strM625r2 = AbstractC0295Gu.m625r(-401278794463285L);
                int i3 = AbstractC1450gG.f5067a;
                jSONObject.put(strM625r2, AbstractC0295Gu.m625r(AbstractC1406fG.m2699Y(C1456gf.f5172p) ? -400776283289653L : -400806348060725L));
                String string = jSONObject.toString();
                AbstractC0295Gu.m625r(-400845002766389L);
                Object objM1167f = C0594Ns.m1167f(AbstractC0295Gu.m625r(-400905132308533L), string, this);
                return objM1167f == enumC1453gc ? enumC1453gc : objM1167f;
            case 1:
                int i4 = this.f7655f;
                if (i4 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0668Pg c0668Pg = AbstractC2248ms.f7951a;
                    this.f7655f = 1;
                    obj = C0668Pg.m1326d(c0668Pg, str2, this);
                    if (obj == enumC1453gc) {
                        return enumC1453gc;
                    }
                } else {
                    if (i4 != 1) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-175196010969141L));
                    }
                    AbstractC0628Oj.m1232T(obj);
                }
                String str3 = (String) obj;
                if (str3 == null) {
                    return c0829tc;
                }
                String name = new File(str3).getName();
                Bundle bundle = new Bundle();
                bundle.putString(AbstractC0295Gu.m625r(-158930969819189L), AbstractC0295Gu.m625r(-159025459099701L));
                bundle.putString(AbstractC0295Gu.m625r(-159085588641845L), str3);
                bundle.putString(AbstractC0295Gu.m625r(-175127291492405L), name);
                AbstractC2248ms.f7951a.getClass();
                C0668Pg.m1332m(bundle, str);
                return c0829tc;
            default:
                int i5 = this.f7655f;
                if (i5 == 0) {
                    AbstractC0628Oj.m1232T(obj);
                    C0668Pg c0668Pg2 = AbstractC2248ms.f7951a;
                    this.f7655f = 1;
                    obj = C0668Pg.m1326d(c0668Pg2, str2, this);
                    if (obj == enumC1453gc) {
                        return enumC1453gc;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException(AbstractC0295Gu.m625r(-175668457371701L));
                    }
                    AbstractC0628Oj.m1232T(obj);
                }
                String str4 = (String) obj;
                if (str4 == null) {
                    return c0829tc;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putString(AbstractC0295Gu.m625r(-174852413585461L), AbstractC0295Gu.m625r(-174946902865973L));
                bundle2.putString(AbstractC0295Gu.m625r(-175011327375413L), str4);
                AbstractC2248ms.f7951a.getClass();
                C0668Pg.m1332m(bundle2, str);
                return c0829tc;
        }
    }
}
