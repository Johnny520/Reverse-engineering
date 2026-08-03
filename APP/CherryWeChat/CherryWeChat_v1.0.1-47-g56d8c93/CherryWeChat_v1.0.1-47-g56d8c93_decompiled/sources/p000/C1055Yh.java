package p000;

import android.content.SharedPreferences;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yh */
/* JADX INFO: loaded from: classes.dex */
public final class C1055Yh extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1055Yh f3357b = new C1055Yh(new C1116Zz(AbstractC0295Gu.m625r(-27676769253429L), AbstractC0295Gu.m625r(-27698244089909L), false, AbstractC0295Gu.m625r(-27758373632053L), AbstractC0295Gu.m625r(-28338194217013L), new C2648vx(AbstractC0295Gu.m625r(-27509265528885L), AbstractC0295Gu.m625r(-27595164874805L), AbstractC0295Gu.m625r(-27612344743989L), AbstractC0295Gu.m625r(-27642409515061L), new ViewOnClickListenerC1079Z4(8)), 64));

    /* JADX INFO: renamed from: c */
    public static float f3358c = 1.0f;

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        float fFloatValue = 1.0f;
        if (m2024e()) {
            SharedPreferences sharedPreferences = AbstractC0599Nx.f1939a;
            String strM1173b = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-28505697941557L), AbstractC0295Gu.m625r(-28041841473589L));
            Float fValueOf = AbstractC2822zz.m5460E(strM1173b) ? Float.valueOf(Float.parseFloat(strM1173b)) : null;
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        f3358c = fFloatValue;
        C1214bG c1214bG = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586228676163637L));
        Object obj = c1214bG != null ? c1214bG.f4146a : null;
        Method method = obj instanceof Method ? (Method) obj : null;
        if (method != null) {
            C0620Ob c0620Ob = new C0620Ob(10);
            AbstractC0295Gu.m625r(-577887849674805L);
            AbstractC0295Gu.m625r(-577917914445877L);
            new C1538iG(method).m2916a(c0620Ob);
        }
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-28449863366709L);
    }
}
