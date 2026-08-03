package p000;

import android.content.SharedPreferences;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: Yh */
/* JADX INFO: loaded from: classes.dex */
public final class C1055Yh extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C1055Yh f3357b = null;

    /* JADX INFO: renamed from: c */
    public static float f3358c;

    static {
        C2648vx r1 = new C2648vx(AbstractC0295Gu.m625r(-27509265528885L), AbstractC0295Gu.m625r(-27595164874805L), AbstractC0295Gu.m625r(-27612344743989L), AbstractC0295Gu.m625r(-27642409515061L), new ViewOnClickListenerC1079Z4(8));
        f3357b = new C1055Yh(new C1116Zz(AbstractC0295Gu.m625r(-27676769253429L), AbstractC0295Gu.m625r(-27698244089909L), false, AbstractC0295Gu.m625r(-27758373632053L), AbstractC0295Gu.m625r(-28338194217013L), r1, 64));
        f3358c = 1.0f;
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        Method r1 = null;
        float r2 = 1.0f;
        if (m2024e() == false) goto L12;
        SharedPreferences r0 = AbstractC0599Nx.f1939a;
        String r02 = AbstractC0599Nx.m1173b(AbstractC0295Gu.m625r(-28505697941557L), AbstractC0295Gu.m625r(-28041841473589L));
        if (AbstractC2822zz.m5460E(r02) == false) goto L9;
        Float r03 = Float.valueOf(Float.parseFloat(r02));     // Catch: NumberFormatException -> L22
    L10:
        if (r03 == null) goto L12;
        r2 = r03.floatValue();
    L9:
        r03 = null;
    L12:
        f3358c = r2;
        C1214bG r04 = (C1214bG) AbstractC1257cG.f4258a.get(AbstractC0295Gu.m625r(-586228676163637L));
        if (r04 == null) goto L15;
        Object r05 = r04.f4146a;
    L17:
        if ((r05 instanceof Method) == false) goto L19;
        r1 = (Method) r05;
    L19:
        if (r1 == null) goto L25;
        C0620Ob r06 = new C0620Ob(10);
        AbstractC0295Gu.m625r(-577887849674805L);
        AbstractC0295Gu.m625r(-577917914445877L);
        new C1538iG(r1).m2916a(r06);
        return;
    L25:
        return;
    L15:
        r05 = null;
        goto L17
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-28449863366709L);
    }
}
