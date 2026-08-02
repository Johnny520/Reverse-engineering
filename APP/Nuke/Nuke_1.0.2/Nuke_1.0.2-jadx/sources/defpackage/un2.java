package defpackage;

import java.util.ArrayList;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class un2 extends w51 implements mn0 {
    public static final un2 j;
    public static final un2 k;
    public static final un2 l;
    public static final un2 m;
    public static final un2 n;
    public static final un2 o;
    public static final un2 p;
    public static final un2 q;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        j = new un2(i, 0);
        k = new un2(i, 1);
        l = new un2(i, 2);
        m = new un2(i, 3);
        n = new un2(i, 4);
        o = new un2(i, 5);
        p = new un2(i, 6);
        q = new un2(i, 7);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ un2(int i, int i2) {
        super(i);
        this.i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        String str;
        un0 un0Var;
        switch (this.i) {
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
                q3 q3Var = (q3) obj;
                q3 q3Var2 = (q3) obj2;
                if (q3Var == null || (str = q3Var.a) == null) {
                    str = q3Var2.a;
                }
                if (q3Var == null || (un0Var = q3Var.b) == null) {
                    un0Var = q3Var2.b;
                }
                return new q3(str, un0Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return obj == null ? obj2 : obj;
            default:
                qn2 qn2Var = (qn2) obj2;
                Object objValueOf = Float.valueOf(0.0f);
                ln2 ln2Var = ((qn2) obj).d;
                yn2 yn2Var = vn2.u;
                Object objG = ln2Var.h.g(yn2Var);
                if (objG == null) {
                    objG = objValueOf;
                }
                float fFloatValue = ((Number) objG).floatValue();
                Object objG2 = qn2Var.d.h.g(yn2Var);
                if (objG2 != null) {
                    objValueOf = objG2;
                }
                return Integer.valueOf(Float.compare(fFloatValue, ((Number) objValueOf).floatValue()));
        }
    }
}
