package p000;

import java.util.ArrayList;
import java.util.List;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class un2 extends w51 implements mn0 {

    /* JADX INFO: renamed from: j */
    public static final un2 f11374j;

    /* JADX INFO: renamed from: k */
    public static final un2 f11375k;

    /* JADX INFO: renamed from: l */
    public static final un2 f11376l;

    /* JADX INFO: renamed from: m */
    public static final un2 f11377m;

    /* JADX INFO: renamed from: n */
    public static final un2 f11378n;

    /* JADX INFO: renamed from: o */
    public static final un2 f11379o;

    /* JADX INFO: renamed from: p */
    public static final un2 f11380p;

    /* JADX INFO: renamed from: q */
    public static final un2 f11381q;

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f11382i;

    static {
        int i = 2;
        f11374j = new un2(i, 0);
        f11375k = new un2(i, 1);
        f11376l = new un2(i, 2);
        f11377m = new un2(i, 3);
        f11378n = new un2(i, 4);
        f11379o = new un2(i, 5);
        f11380p = new un2(i, 6);
        f11381q = new un2(i, 7);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un2(int i, int i2) {
        super(i);
        this.f11382i = i2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) {
        String str;
        un0 un0Var;
        switch (this.f11382i) {
            case 0:
                return (String) obj;
            case 1:
                List list = (List) obj;
                List list2 = (List) obj2;
                if (list == null) {
                    return list2;
                }
                ArrayList arrayList = new ArrayList(list);
                arrayList.addAll(list2);
                return arrayList;
            case 2:
                Float f = (Float) obj;
                ((Number) obj2).floatValue();
                return f;
            case 3:
                return (String) obj;
            case 4:
                Boolean bool = (Boolean) obj;
                ((Boolean) obj2).booleanValue();
                return bool;
            case 5:
                C0603q3 c0603q3 = (C0603q3) obj;
                C0603q3 c0603q32 = (C0603q3) obj2;
                if (c0603q3 == null || (str = c0603q3.f8712a) == null) {
                    str = c0603q32.f8712a;
                }
                if (c0603q3 == null || (un0Var = c0603q3.f8713b) == null) {
                    un0Var = c0603q32.f8713b;
                }
                return new C0603q3(str, un0Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return obj == null ? obj2 : obj;
            default:
                qn2 qn2Var = (qn2) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                ln2 ln2Var = ((qn2) obj).f9050d;
                yn2 yn2Var = vn2.f12078u;
                Object objM4505g = ln2Var.f6221h.m4505g(yn2Var);
                if (objM4505g == null) {
                    objM4505g = objValueOf;
                }
                float fFloatValue = ((Number) objM4505g).floatValue();
                Object objM4505g2 = qn2Var.f9050d.f6221h.m4505g(yn2Var);
                if (objM4505g2 != null) {
                    objValueOf = objM4505g2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
