package p075p;

import android.view.ViewGroup;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: renamed from: p.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1043i {

    /* JADX INFO: renamed from: a */
    public int f3955a;

    /* JADX INFO: renamed from: b */
    public final C1046l f3956b;

    /* JADX INFO: renamed from: c */
    public final C1045k f3957c;

    /* JADX INFO: renamed from: d */
    public final C1044j f3958d;

    /* JADX INFO: renamed from: e */
    public final C1047m f3959e;

    /* JADX INFO: renamed from: f */
    public HashMap f3960f;

    public C1043i() {
        C1046l c1046l = new C1046l();
        c1046l.f4028a = 0;
        c1046l.f4029b = 0;
        c1046l.f4030c = 1.0f;
        c1046l.f4031d = Float.NaN;
        this.f3956b = c1046l;
        C1045k c1045k = new C1045k();
        c1045k.f4024a = -1;
        c1045k.f4025b = -1;
        c1045k.f4026c = Float.NaN;
        c1045k.f4027d = Float.NaN;
        this.f3957c = c1045k;
        C1044j c1044j = new C1044j();
        c1044j.f3988a = false;
        c1044j.f3994d = -1;
        c1044j.f3996e = -1;
        c1044j.f3998f = -1.0f;
        c1044j.f4000g = -1;
        c1044j.f4002h = -1;
        c1044j.f4004i = -1;
        c1044j.f4006j = -1;
        c1044j.f4007k = -1;
        c1044j.f4008l = -1;
        c1044j.f4009m = -1;
        c1044j.f4010n = -1;
        c1044j.f4011o = -1;
        c1044j.f4012p = -1;
        c1044j.f4013q = -1;
        c1044j.f4014r = -1;
        c1044j.f4015s = -1;
        c1044j.f4016t = 0.5f;
        c1044j.f4017u = 0.5f;
        c1044j.f4018v = null;
        c1044j.f4019w = -1;
        c1044j.f4020x = 0;
        c1044j.f4021y = 0.0f;
        c1044j.f4022z = -1;
        c1044j.f3962A = -1;
        c1044j.f3963B = -1;
        c1044j.f3964C = -1;
        c1044j.f3965D = -1;
        c1044j.f3966E = -1;
        c1044j.f3967F = -1;
        c1044j.f3968G = -1;
        c1044j.f3969H = -1;
        c1044j.f3970I = -1;
        c1044j.f3971J = -1;
        c1044j.f3972K = -1;
        c1044j.f3973L = -1;
        c1044j.f3974M = -1;
        c1044j.f3975N = -1;
        c1044j.f3976O = -1.0f;
        c1044j.f3977P = -1.0f;
        c1044j.f3978Q = 0;
        c1044j.f3979R = 0;
        c1044j.f3980S = 0;
        c1044j.f3981T = 0;
        c1044j.f3982U = -1;
        c1044j.f3983V = -1;
        c1044j.f3984W = -1;
        c1044j.f3985X = -1;
        c1044j.f3986Y = 1.0f;
        c1044j.f3987Z = 1.0f;
        c1044j.f3989a0 = -1;
        c1044j.f3991b0 = 0;
        c1044j.f3993c0 = -1;
        c1044j.f4001g0 = false;
        c1044j.f4003h0 = false;
        c1044j.f4005i0 = true;
        this.f3958d = c1044j;
        C1047m c1047m = new C1047m();
        c1047m.f4033a = 0.0f;
        c1047m.f4034b = 0.0f;
        c1047m.f4035c = 0.0f;
        c1047m.f4036d = 1.0f;
        c1047m.f4037e = 1.0f;
        c1047m.f4038f = Float.NaN;
        c1047m.f4039g = Float.NaN;
        c1047m.f4040h = 0.0f;
        c1047m.f4041i = 0.0f;
        c1047m.f4042j = 0.0f;
        c1047m.f4043k = false;
        c1047m.f4044l = 0.0f;
        this.f3959e = c1047m;
        this.f3960f = new HashMap();
    }

    /* JADX INFO: renamed from: a */
    public final void m2520a(C1039e c1039e) {
        C1044j c1044j = this.f3958d;
        c1039e.f3909d = c1044j.f4000g;
        c1039e.f3911e = c1044j.f4002h;
        c1039e.f3913f = c1044j.f4004i;
        c1039e.f3915g = c1044j.f4006j;
        c1039e.f3917h = c1044j.f4007k;
        c1039e.f3919i = c1044j.f4008l;
        c1039e.f3921j = c1044j.f4009m;
        c1039e.f3923k = c1044j.f4010n;
        c1039e.f3925l = c1044j.f4011o;
        c1039e.f3929p = c1044j.f4012p;
        c1039e.f3930q = c1044j.f4013q;
        c1039e.f3931r = c1044j.f4014r;
        c1039e.f3932s = c1044j.f4015s;
        ((ViewGroup.MarginLayoutParams) c1039e).leftMargin = c1044j.f3964C;
        ((ViewGroup.MarginLayoutParams) c1039e).rightMargin = c1044j.f3965D;
        ((ViewGroup.MarginLayoutParams) c1039e).topMargin = c1044j.f3966E;
        ((ViewGroup.MarginLayoutParams) c1039e).bottomMargin = c1044j.f3967F;
        c1039e.f3937x = c1044j.f3975N;
        c1039e.f3938y = c1044j.f3974M;
        c1039e.f3934u = c1044j.f3971J;
        c1039e.f3936w = c1044j.f3973L;
        c1039e.f3939z = c1044j.f4016t;
        c1039e.f3877A = c1044j.f4017u;
        c1039e.f3926m = c1044j.f4019w;
        c1039e.f3927n = c1044j.f4020x;
        c1039e.f3928o = c1044j.f4021y;
        c1039e.f3878B = c1044j.f4018v;
        c1039e.f3892P = c1044j.f4022z;
        c1039e.f3893Q = c1044j.f3962A;
        c1039e.f3881E = c1044j.f3976O;
        c1039e.f3880D = c1044j.f3977P;
        c1039e.f3883G = c1044j.f3979R;
        c1039e.f3882F = c1044j.f3978Q;
        c1039e.f3895S = c1044j.f4001g0;
        c1039e.f3896T = c1044j.f4003h0;
        c1039e.f3884H = c1044j.f3980S;
        c1039e.f3885I = c1044j.f3981T;
        c1039e.f3888L = c1044j.f3982U;
        c1039e.f3889M = c1044j.f3983V;
        c1039e.f3886J = c1044j.f3984W;
        c1039e.f3887K = c1044j.f3985X;
        c1039e.f3890N = c1044j.f3986Y;
        c1039e.f3891O = c1044j.f3987Z;
        c1039e.f3894R = c1044j.f3963B;
        c1039e.f3907c = c1044j.f3998f;
        c1039e.f3903a = c1044j.f3994d;
        c1039e.f3905b = c1044j.f3996e;
        ((ViewGroup.MarginLayoutParams) c1039e).width = c1044j.f3990b;
        ((ViewGroup.MarginLayoutParams) c1039e).height = c1044j.f3992c;
        String str = c1044j.f3999f0;
        if (str != null) {
            c1039e.f3897U = str;
        }
        c1039e.setMarginStart(c1044j.f3969H);
        c1039e.setMarginEnd(c1044j.f3968G);
        c1039e.m2518a();
    }

    public final Object clone() {
        C1043i c1043i = new C1043i();
        C1044j c1044j = c1043i.f3958d;
        c1044j.getClass();
        C1044j c1044j2 = this.f3958d;
        c1044j.f3988a = c1044j2.f3988a;
        c1044j.f3990b = c1044j2.f3990b;
        c1044j.f3992c = c1044j2.f3992c;
        c1044j.f3994d = c1044j2.f3994d;
        c1044j.f3996e = c1044j2.f3996e;
        c1044j.f3998f = c1044j2.f3998f;
        c1044j.f4000g = c1044j2.f4000g;
        c1044j.f4002h = c1044j2.f4002h;
        c1044j.f4004i = c1044j2.f4004i;
        c1044j.f4006j = c1044j2.f4006j;
        c1044j.f4007k = c1044j2.f4007k;
        c1044j.f4008l = c1044j2.f4008l;
        c1044j.f4009m = c1044j2.f4009m;
        c1044j.f4010n = c1044j2.f4010n;
        c1044j.f4011o = c1044j2.f4011o;
        c1044j.f4012p = c1044j2.f4012p;
        c1044j.f4013q = c1044j2.f4013q;
        c1044j.f4014r = c1044j2.f4014r;
        c1044j.f4015s = c1044j2.f4015s;
        c1044j.f4016t = c1044j2.f4016t;
        c1044j.f4017u = c1044j2.f4017u;
        c1044j.f4018v = c1044j2.f4018v;
        c1044j.f4019w = c1044j2.f4019w;
        c1044j.f4020x = c1044j2.f4020x;
        c1044j.f4021y = c1044j2.f4021y;
        c1044j.f4022z = c1044j2.f4022z;
        c1044j.f3962A = c1044j2.f3962A;
        c1044j.f3963B = c1044j2.f3963B;
        c1044j.f3964C = c1044j2.f3964C;
        c1044j.f3965D = c1044j2.f3965D;
        c1044j.f3966E = c1044j2.f3966E;
        c1044j.f3967F = c1044j2.f3967F;
        c1044j.f3968G = c1044j2.f3968G;
        c1044j.f3969H = c1044j2.f3969H;
        c1044j.f3970I = c1044j2.f3970I;
        c1044j.f3971J = c1044j2.f3971J;
        c1044j.f3972K = c1044j2.f3972K;
        c1044j.f3973L = c1044j2.f3973L;
        c1044j.f3974M = c1044j2.f3974M;
        c1044j.f3975N = c1044j2.f3975N;
        c1044j.f3976O = c1044j2.f3976O;
        c1044j.f3977P = c1044j2.f3977P;
        c1044j.f3978Q = c1044j2.f3978Q;
        c1044j.f3979R = c1044j2.f3979R;
        c1044j.f3980S = c1044j2.f3980S;
        c1044j.f3981T = c1044j2.f3981T;
        c1044j.f3982U = c1044j2.f3982U;
        c1044j.f3983V = c1044j2.f3983V;
        c1044j.f3984W = c1044j2.f3984W;
        c1044j.f3985X = c1044j2.f3985X;
        c1044j.f3986Y = c1044j2.f3986Y;
        c1044j.f3987Z = c1044j2.f3987Z;
        c1044j.f3989a0 = c1044j2.f3989a0;
        c1044j.f3991b0 = c1044j2.f3991b0;
        c1044j.f3993c0 = c1044j2.f3993c0;
        c1044j.f3999f0 = c1044j2.f3999f0;
        int[] iArr = c1044j2.f3995d0;
        if (iArr != null) {
            c1044j.f3995d0 = Arrays.copyOf(iArr, iArr.length);
        } else {
            c1044j.f3995d0 = null;
        }
        c1044j.f3997e0 = c1044j2.f3997e0;
        c1044j.f4001g0 = c1044j2.f4001g0;
        c1044j.f4003h0 = c1044j2.f4003h0;
        c1044j.f4005i0 = c1044j2.f4005i0;
        C1045k c1045k = c1043i.f3957c;
        c1045k.getClass();
        C1045k c1045k2 = this.f3957c;
        c1045k2.getClass();
        c1045k.f4024a = c1045k2.f4024a;
        c1045k.f4025b = c1045k2.f4025b;
        c1045k.f4027d = c1045k2.f4027d;
        c1045k.f4026c = c1045k2.f4026c;
        C1046l c1046l = c1043i.f3956b;
        c1046l.getClass();
        C1046l c1046l2 = this.f3956b;
        c1046l2.getClass();
        c1046l.f4028a = c1046l2.f4028a;
        c1046l.f4030c = c1046l2.f4030c;
        c1046l.f4031d = c1046l2.f4031d;
        c1046l.f4029b = c1046l2.f4029b;
        C1047m c1047m = c1043i.f3959e;
        c1047m.getClass();
        C1047m c1047m2 = this.f3959e;
        c1047m2.getClass();
        c1047m.f4033a = c1047m2.f4033a;
        c1047m.f4034b = c1047m2.f4034b;
        c1047m.f4035c = c1047m2.f4035c;
        c1047m.f4036d = c1047m2.f4036d;
        c1047m.f4037e = c1047m2.f4037e;
        c1047m.f4038f = c1047m2.f4038f;
        c1047m.f4039g = c1047m2.f4039g;
        c1047m.f4040h = c1047m2.f4040h;
        c1047m.f4041i = c1047m2.f4041i;
        c1047m.f4042j = c1047m2.f4042j;
        c1047m.f4043k = c1047m2.f4043k;
        c1047m.f4044l = c1047m2.f4044l;
        c1043i.f3955a = this.f3955a;
        return c1043i;
    }
}
