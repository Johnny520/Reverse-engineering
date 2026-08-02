package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class hg1 implements in0 {
    public final /* synthetic */ int h;
    public final /* synthetic */ yf1 i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ hg1(yf1 yf1Var, int i) {
        this.h = i;
        this.i = yf1Var;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.in0
    public final Object j(Object obj) {
        int i = this.h;
        yf1 yf1Var = this.i;
        switch (i) {
            case 0:
                Member member = (Member) obj;
                member.getClass();
                zg1 zg1Var = new zg1((Method) member);
                Object obj2 = yf1Var.b;
                if (obj2 != null) {
                    zg1Var.f0(obj2);
                }
                return zg1Var;
            case 1:
                Member member2 = (Member) obj;
                member2.getClass();
                kz kzVar = new kz((Constructor) member2);
                Object obj3 = yf1Var.b;
                return kzVar;
            case 2:
                Member member3 = (Member) obj;
                member3.getClass();
                pi0 pi0Var = new pi0((Field) member3);
                Object obj4 = yf1Var.b;
                if (obj4 != null) {
                    pi0Var.f0(obj4);
                }
                return pi0Var;
            case 3:
                Member member4 = (Member) obj;
                member4.getClass();
                zg1 zg1Var2 = new zg1((Method) member4);
                Object obj5 = yf1Var.b;
                if (obj5 != null) {
                    zg1Var2.f0(obj5);
                }
                return zg1Var2;
            case 4:
                Member member5 = (Member) obj;
                member5.getClass();
                kz kzVar2 = new kz((Constructor) member5);
                Object obj6 = yf1Var.b;
                return kzVar2;
            default:
                Member member6 = (Member) obj;
                member6.getClass();
                pi0 pi0Var2 = new pi0((Field) member6);
                Object obj7 = yf1Var.b;
                if (obj7 != null) {
                    pi0Var2.f0(obj7);
                }
                return pi0Var2;
        }
    }
}
