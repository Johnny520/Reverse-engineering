package p000;

import android.view.View;
import android.view.textclassifier.TextClassifier;
import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: renamed from: a2 */
/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class C0003a2 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f32l;

    /* JADX INFO: renamed from: m */
    public int f33m;

    /* JADX INFO: renamed from: n */
    public Object f34n;

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ Object f35o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0003a2(Object obj, Object obj2, t00 t00Var, int i) {
        super(2, t00Var);
        this.f32l = i;
        this.f34n = obj;
        this.f35o = obj2;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws Throwable {
        int i = this.f32l;
        k20 k20Var = k20.f5323h;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 2:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 3:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 4:
                ((C0003a2) mo13p((t00) obj2, (tz0) obj)).mo7r(a83Var);
                return k20Var;
            case 5:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 7:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 8:
                return ((C0003a2) mo13p((t00) obj2, (o32) obj)).mo7r(a83Var);
            case 9:
                return ((C0003a2) mo13p((t00) obj2, (ak0) obj)).mo7r(a83Var);
            case 10:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 11:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 12:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 13:
                ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                return k20Var;
            case 14:
                ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                return k20Var;
            case 15:
                ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                return k20Var;
            case 16:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 17:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 18:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 19:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 21:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 22:
                return ((C0003a2) mo13p((t00) obj2, (Object[]) obj)).mo7r(a83Var);
            case 23:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 24:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 25:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 26:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 27:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 28:
                return ((C0003a2) mo13p((t00) obj2, obj)).mo7r(a83Var);
            default:
                return ((C0003a2) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = this.f32l;
        Object obj2 = this.f35o;
        switch (i) {
            case 0:
                C0003a2 c0003a2 = new C0003a2((String) obj2, t00Var, 0);
                c0003a2.f34n = obj;
                return c0003a2;
            case 1:
                return new C0003a2((bk1) this.f34n, (xu0) obj2, t00Var, 1);
            case 2:
                return new C0003a2((bk1) this.f34n, (yu0) obj2, t00Var, 2);
            case 3:
                return new C0003a2((C0416l9) this.f34n, (sz0) obj2, t00Var, 3);
            case 4:
                C0003a2 c0003a22 = new C0003a2((C0233ga) obj2, t00Var, 4);
                c0003a22.f34n = obj;
                return c0003a22;
            case 5:
                C0003a2 c0003a23 = new C0003a2((d22) obj2, t00Var, 5);
                c0003a23.f34n = obj;
                return c0003a23;
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return new C0003a2((C0392km) this.f34n, (o62) obj2, t00Var, 6);
            case 7:
                return new C0003a2((C0699sm) this.f34n, (C0678s1) obj2, t00Var, 7);
            case 8:
                C0003a2 c0003a24 = new C0003a2((AbstractC0286hq) obj2, t00Var, 8);
                c0003a24.f34n = obj;
                return c0003a24;
            case 9:
                C0003a2 c0003a25 = new C0003a2((C0470mq) obj2, t00Var, 9);
                c0003a25.f34n = obj;
                return c0003a25;
            case 10:
                return new C0003a2((C0940yw) obj2, t00Var, 10);
            case 11:
                return new C0003a2((ScrollCaptureCallbackC0109cx) this.f34n, (Runnable) obj2, t00Var, 11);
            case 12:
                return new C0003a2((s12) this.f34n, (b03) obj2, t00Var, 12);
            case 13:
                return new C0003a2((k21) this.f34n, (v30) obj2, t00Var, 13);
            case 14:
                return new C0003a2((m91) this.f34n, (C0379k9) obj2, t00Var, 14);
            case 15:
                return new C0003a2((hu2) this.f34n, (gi1) obj2, t00Var, 15);
            case 16:
                C0003a2 c0003a26 = new C0003a2((si1) obj2, t00Var, 16);
                c0003a26.f34n = obj;
                return c0003a26;
            case 17:
                return new C0003a2((io1) this.f34n, (mn0) obj2, t00Var, 17);
            case 18:
                C0003a2 c0003a27 = new C0003a2((InterfaceC0212fq) obj2, t00Var, 18);
                c0003a27.f34n = obj;
                return c0003a27;
            case 19:
                return new C0003a2((mn0) this.f34n, (yk2) obj2, t00Var, 19);
            case AIChatConfig.MaxContextRounds /* 20 */:
                return new C0003a2((TextClassifier) this.f34n, (mn0) obj2, t00Var, 20);
            case 21:
                return new C0003a2((bk1) this.f34n, (xk1) obj2, t00Var, 21);
            case 22:
                C0003a2 c0003a28 = new C0003a2((InterfaceC0697sk) obj2, t00Var, 22);
                c0003a28.f34n = obj;
                return c0003a28;
            case 23:
                C0003a2 c0003a29 = new C0003a2((C0766ua) obj2, t00Var, 23);
                c0003a29.f34n = obj;
                return c0003a29;
            case 24:
                return new C0003a2((pb0) this.f34n, (am2) obj2, t00Var, 24);
            case 25:
                return new C0003a2((zj0) this.f34n, (n32) obj2, t00Var, 25);
            case 26:
                return new C0003a2((C0554os) this.f34n, (InterfaceC0273hd) obj2, t00Var, 26);
            case 27:
                return new C0003a2((k21) this.f34n, (x22) obj2, t00Var, 27);
            case 28:
                C0003a2 c0003a210 = new C0003a2((ak0) obj2, t00Var, 28);
                c0003a210.f34n = obj;
                return c0003a210;
            default:
                return new C0003a2((i62) this.f34n, (View) obj2, t00Var, 29);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:346:0x05b9  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x05e5  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x0727  */
    /* JADX WARN: Removed duplicated region for block: B:484:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v0, types: [a20, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v23, types: [k21] */
    /* JADX WARN: Type inference failed for: r1v26, types: [k21] */
    /* JADX WARN: Type inference failed for: r1v52 */
    /* JADX WARN: Type inference failed for: r1v53 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:200:0x0374 -> B:193:0x033b). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:254:0x0432 -> B:256:0x0435). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:349:0x05d5 -> B:351:0x05d9). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: r */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object mo7r(java.lang.Object r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0003a2.mo7r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0003a2(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.f32l = i;
        this.f35o = obj;
    }
}
