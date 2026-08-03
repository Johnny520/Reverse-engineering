package p000;

import android.app.Activity;
import android.content.Intent;
import de.robv.android.xposed.XposedHelpers;

/* JADX INFO: renamed from: Ps */
/* JADX INFO: loaded from: classes.dex */
public final class C0680Ps extends AbstractC1101Zk {

    /* JADX INFO: renamed from: b */
    public static final C0680Ps f2178b = null;

    static {
        f2178b = new C0680Ps(new C1116Zz(AbstractC0295Gu.m625r(-3912715204661L), AbstractC0295Gu.m625r(-3934190041141L), false, AbstractC0295Gu.m625r(-4002909517877L), AbstractC0295Gu.m625r(-4032974288949L), null, 100));
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: a */
    public final void mo369a() {
        XposedHelpers.findAndHookMethod(Activity.class, AbstractC0295Gu.m625r(-2516850833461L), new Object[]{Intent.class, new C0637Os()});
    }

    @Override // p000.AbstractC2700x5
    /* JADX INFO: renamed from: b */
    public final String mo370b() {
        return AbstractC0295Gu.m625r(-4101693765685L);
    }
}
