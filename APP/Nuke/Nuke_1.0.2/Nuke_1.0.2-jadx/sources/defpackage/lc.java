package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import nuke.module.wechat.ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class lc extends w51 implements mn0 {
    public static final lc A;
    public static final lc B;
    public static final lc C;
    public static final lc D;
    public static final lc E;
    public static final lc F;
    public static final lc G;
    public static final lc H;
    public static final lc I;
    public static final lc J;
    public static final lc K;
    public static final lc L;
    public static final lc M;
    public static final lc j;
    public static final lc k;
    public static final lc l;
    public static final lc m;
    public static final lc n;
    public static final lc o;
    public static final lc p;
    public static final lc q;
    public static final lc r;
    public static final lc s;
    public static final lc t;
    public static final lc u;
    public static final lc v;
    public static final lc w;
    public static final lc x;
    public static final lc y;
    public static final lc z;
    public final /* synthetic */ int i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int i = 2;
        j = new lc(i, 0);
        k = new lc(i, 1);
        l = new lc(i, 2);
        m = new lc(i, 3);
        n = new lc(i, 4);
        o = new lc(i, 5);
        p = new lc(i, 6);
        q = new lc(i, 7);
        r = new lc(i, 8);
        s = new lc(i, 9);
        t = new lc(i, 10);
        u = new lc(i, 11);
        v = new lc(i, 12);
        w = new lc(i, 13);
        x = new lc(i, 14);
        y = new lc(i, 15);
        z = new lc(i, 16);
        A = new lc(i, 17);
        B = new lc(i, 18);
        C = new lc(i, 19);
        D = new lc(i, 20);
        E = new lc(i, 21);
        F = new lc(i, 22);
        G = new lc(i, 23);
        H = new lc(i, 24);
        I = new lc(i, 25);
        J = new lc(i, 26);
        K = new lc(i, 27);
        L = new lc(i, 28);
        M = new lc(i, 29);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lc(int i, int i2) {
        super(i);
        this.i = i2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:160:0x0134 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:162:0x00e7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:164:0x00e7 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:167:0x012e */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:72:0x0125 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v11, types: [zk1] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [zk1] */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v35, types: [th1] */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40, types: [th1] */
    /* JADX WARN: Type inference failed for: r9v41, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v64 */
    /* JADX WARN: Type inference failed for: r9v65 */
    @Override // defpackage.mn0
    public final Object g(Object obj, Object obj2) {
        int i = this.i;
        int i2 = 1;
        a83 a83Var = a83.a;
        switch (i) {
            case 0:
                pp0.k((r61) obj).setUpdateBlock((in0) obj2);
                return a83Var;
            case 1:
                pp0.k((r61) obj).setReleaseBlock((in0) obj2);
                return a83Var;
            case 2:
                pp0.k((r61) obj).setModifier((uh1) obj2);
                return a83Var;
            case 3:
                pp0.k((r61) obj).setDensity((e70) obj2);
                return a83Var;
            case 4:
                pp0.k((r61) obj).setLifecycleOwner((ia1) obj2);
                return a83Var;
            case 5:
                pp0.k((r61) obj).setSavedStateRegistryOwner((tc2) obj2);
                return a83Var;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                ab3 ab3VarK = pp0.k((r61) obj);
                int iOrdinal = ((d61) obj2).ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    c80.s();
                    return null;
                }
                ab3VarK.setLayoutDirection(i2);
                return a83Var;
            case 7:
                if0 if0Var = (if0) obj2;
                return Boolean.valueOf(((if0) obj) == if0Var && if0Var == if0.j);
            case 8:
                String str = (String) obj;
                sh1 sh1Var = (sh1) obj2;
                if (str.length() == 0) {
                    return sh1Var.toString();
                }
                return str + ", " + sh1Var;
            case 9:
                px pxVar = (px) obj;
                int iIntValue = ((Number) obj2).intValue();
                go0 go0Var = (go0) pxVar;
                if (!go0Var.O(iIntValue & 1, (iIntValue & 3) != 2)) {
                    go0Var.R();
                }
                return a83Var;
            case 10:
                px pxVar2 = (px) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                go0 go0Var2 = (go0) pxVar2;
                if (!go0Var2.O(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    go0Var2.R();
                }
                return a83Var;
            case 11:
                px pxVar3 = (px) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                go0 go0Var3 = (go0) pxVar3;
                if (!go0Var3.O(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    go0Var3.R();
                }
                return a83Var;
            case 12:
                px pxVar4 = (px) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                go0 go0Var4 = (go0) pxVar4;
                if (!go0Var4.O(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    go0Var4.R();
                }
                return a83Var;
            case 13:
                ((Number) obj2).intValue();
                ((r61) ((hx) obj)).getClass();
                return a83Var;
            case 14:
                ((r61) ((hx) obj)).c0((nf1) obj2);
                return a83Var;
            case 15:
                ((r61) ((hx) obj)).d0((uh1) obj2);
                return a83Var;
            case 16:
                iy iyVar = (iy) obj2;
                r61 r61Var = (r61) ((hx) obj);
                r61Var.I = iyVar;
                vn1 vn1Var = r61Var.M;
                tu2 tu2Var = ly.h;
                yy1 yy1Var = (yy1) iyVar;
                yy1Var.getClass();
                r61Var.Z((e70) op0.w(yy1Var, tu2Var));
                yy1 yy1Var2 = (yy1) iyVar;
                d61 d61Var = (d61) op0.w(yy1Var2, ly.n);
                if (r61Var.G != d61Var) {
                    r61Var.G = d61Var;
                    r61Var.E();
                    r61 r61VarU = r61Var.u();
                    if (r61VarU != null) {
                        r61VarU.C();
                    } else {
                        zv1 zv1Var = r61Var.u;
                        if (zv1Var != null) {
                            ((b7) zv1Var).invalidate();
                        }
                    }
                    r61Var.D();
                    for (th1 th1Var = (th1) vn1Var.g; th1Var != null; th1Var = th1Var.m) {
                        th1Var.w0();
                    }
                }
                r61Var.e0((za3) op0.w(yy1Var2, ly.t));
                th1 th1Var2 = (th1) vn1Var.g;
                if ((th1Var2.k & AIChatConfig.MaxOutputTokens) != 0) {
                    while (th1Var2 != null) {
                        if ((th1Var2.j & AIChatConfig.MaxOutputTokens) != 0) {
                            ?? M2 = th1Var2;
                            ?? zk1Var = 0;
                            while (M2 != 0) {
                                if (M2 instanceof gy) {
                                    th1 th1Var3 = ((th1) ((gy) M2)).h;
                                    if (th1Var3.u) {
                                        ao1.c(th1Var3);
                                    } else {
                                        th1Var3.q = true;
                                    }
                                } else if ((M2.j & AIChatConfig.MaxOutputTokens) != 0 && (M2 instanceof u60)) {
                                    th1 th1Var4 = ((u60) M2).w;
                                    int i3 = 0;
                                    zk1Var = zk1Var;
                                    M2 = M2;
                                    while (th1Var4 != null) {
                                        if ((th1Var4.j & AIChatConfig.MaxOutputTokens) != 0) {
                                            i3++;
                                            zk1Var = zk1Var;
                                            if (i3 == 1) {
                                                M2 = th1Var4;
                                            } else {
                                                if (zk1Var == 0) {
                                                    zk1Var = new zk1(new th1[16]);
                                                }
                                                if (M2 != 0) {
                                                    zk1Var.b(M2);
                                                    M2 = 0;
                                                }
                                                zk1Var.b(th1Var4);
                                            }
                                        }
                                        th1Var4 = th1Var4.m;
                                        zk1Var = zk1Var;
                                        M2 = M2;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                M2 = sp0.m(zk1Var);
                            }
                        }
                        if ((th1Var2.k & AIChatConfig.MaxOutputTokens) != 0) {
                            th1Var2 = th1Var2.m;
                        }
                    }
                }
                return a83Var;
            case 17:
                Collection collection = (List) obj;
                List list = (List) obj2;
                if (collection == null) {
                    collection = be0.h;
                }
                return du.x0(collection, list);
            case 18:
                return (x7) obj;
            case 19:
                List list2 = (List) obj;
                List list3 = (List) obj2;
                if (list2 == null) {
                    return list3;
                }
                ArrayList arrayList = new ArrayList(list2);
                arrayList.addAll(list3);
                return arrayList;
            case AIChatConfig.MaxContextRounds /* 20 */:
                return (k00) obj;
            case 21:
                return (v8) obj;
            case 22:
                return (a83) obj;
            case 23:
                return (a83) obj;
            case 24:
                throw new IllegalStateException("merge function called on unmergeable property IsDialog. A dialog should not be a child of a clickable/focusable node.");
            case 25:
                throw new IllegalStateException("merge function called on unmergeable property IsPopup. A popup should not be a child of a clickable/focusable node.");
            case 26:
                return (a83) obj;
            case 27:
                throw new IllegalStateException("merge function called on unmergeable property PaneTitle.");
            case 28:
                va2 va2Var = (va2) obj;
                ((va2) obj2).getClass();
                return va2Var;
            default:
                return (eq2) obj;
        }
    }
}
