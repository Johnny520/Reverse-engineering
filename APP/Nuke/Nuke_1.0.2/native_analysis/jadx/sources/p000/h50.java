package p000;

import nuke.module.wechat.p002ai.AIChatConfig;

/* JADX INFO: compiled from: r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4 */
/* JADX INFO: loaded from: classes.dex */
public final class h50 extends tw2 implements mn0 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f3821l;

    /* JADX INFO: renamed from: m */
    public int f3822m;

    /* JADX INFO: renamed from: n */
    public Object f3823n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(d91 d91Var, int i, t00 t00Var) {
        super(2, t00Var);
        this.f3821l = 3;
        this.f3823n = d91Var;
        this.f3822m = i;
    }

    @Override // p000.mn0
    /* JADX INFO: renamed from: g */
    public final Object mo12g(Object obj, Object obj2) throws Throwable {
        int i = this.f3821l;
        a83 a83Var = a83.f116a;
        switch (i) {
            case 0:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 1:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 2:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 3:
                ((h50) mo13p((t00) obj2, (kl2) obj)).mo7r(a83Var);
                return a83Var;
            case 4:
                ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
                return k20.f5323h;
            case 5:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 7:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 8:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            case 9:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
            default:
                return ((h50) mo13p((t00) obj2, (j20) obj)).mo7r(a83Var);
        }
    }

    @Override // p000.AbstractC0658rj
    /* JADX INFO: renamed from: p */
    public final t00 mo13p(t00 t00Var, Object obj) {
        int i = 2;
        switch (this.f3821l) {
            case 0:
                return new h50((i50) this.f3823n, t00Var, 0);
            case 1:
                return new h50((ul0) this.f3823n, t00Var, 1);
            case 2:
                return new h50((sz0) this.f3823n, t00Var, i);
            case 3:
                return new h50((d91) this.f3823n, this.f3822m, t00Var);
            case 4:
                return new h50((ge1) this.f3823n, t00Var, 4);
            case 5:
                return new h50((si1) this.f3823n, t00Var, 5);
            case AIChatConfig.DefaultContextRounds /* 6 */:
                h50 h50Var = new h50(i, t00Var, 6);
                h50Var.f3823n = obj;
                return h50Var;
            case 7:
                return new h50((ep1) this.f3823n, t00Var, 7);
            case 8:
                return new h50(i, t00Var, 8);
            case 9:
                return new h50((zw2) this.f3823n, t00Var, 9);
            default:
                return new h50((v30) this.f3823n, t00Var, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0227  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0207 -> B:114:0x01f8). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:122:0x0220 -> B:124:0x0223). Please report as a decompilation issue!!! */
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
    public final java.lang.Object mo7r(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.h50.mo7r(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h50(int i, t00 t00Var, int i2) {
        super(i, t00Var);
        this.f3821l = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h50(Object obj, t00 t00Var, int i) {
        super(2, t00Var);
        this.f3821l = i;
        this.f3823n = obj;
    }
}
