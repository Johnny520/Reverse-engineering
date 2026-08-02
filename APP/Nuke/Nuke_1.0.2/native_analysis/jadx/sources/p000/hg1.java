package p000;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hg1 implements in0 {

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ int f4000h;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ yf1 f4001i;

    public /* synthetic */ hg1(yf1 yf1Var, int i) {
        this.f4000h = i;
        this.f4001i = yf1Var;
    }

    @Override // p000.in0
    /* JADX INFO: renamed from: j */
    public final Object mo5j(Object obj) {
        int i = this.f4000h;
        yf1 yf1Var = this.f4001i;
        switch (i) {
            case 0:
                Member member = (Member) obj;
                member.getClass();
                zg1 zg1Var = new zg1((Method) member);
                Object obj2 = yf1Var.f13435b;
                if (obj2 != null) {
                    zg1Var.mo2782f0(obj2);
                }
                return zg1Var;
            case 1:
                Member member2 = (Member) obj;
                member2.getClass();
                C0405kz c0405kz = new C0405kz((Constructor) member2);
                Object obj3 = yf1Var.f13435b;
                return c0405kz;
            case 2:
                Member member3 = (Member) obj;
                member3.getClass();
                pi0 pi0Var = new pi0((Field) member3);
                Object obj4 = yf1Var.f13435b;
                if (obj4 != null) {
                    pi0Var.mo2782f0(obj4);
                }
                return pi0Var;
            case 3:
                Member member4 = (Member) obj;
                member4.getClass();
                zg1 zg1Var2 = new zg1((Method) member4);
                Object obj5 = yf1Var.f13435b;
                if (obj5 != null) {
                    zg1Var2.mo2782f0(obj5);
                }
                return zg1Var2;
            case 4:
                Member member5 = (Member) obj;
                member5.getClass();
                C0405kz c0405kz2 = new C0405kz((Constructor) member5);
                Object obj6 = yf1Var.f13435b;
                return c0405kz2;
            default:
                Member member6 = (Member) obj;
                member6.getClass();
                pi0 pi0Var2 = new pi0((Field) member6);
                Object obj7 = yf1Var.f13435b;
                if (obj7 != null) {
                    pi0Var2.mo2782f0(obj7);
                }
                return pi0Var2;
        }
    }
}
