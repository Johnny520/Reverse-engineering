package p037cb;

import de.robv.android.xposed.XC_MethodHook;
import p129ig.AbstractC2043a;
import p259r9.AbstractC3754e0;
import p300ub.AbstractC4302b;

/* JADX INFO: renamed from: cb.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0544e extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C0545f f1715a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f1716b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ int f1717c;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0544e(C0545f c0545f, int i9, int i10) {
        this.f1715a = c0545f;
        this.f1716b = i9;
        this.f1717c = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        int i9;
        methodHookParam.getClass();
        if (AbstractC4302b.m8640c(this.f1715a.f1719b.f12143a, "Hchat_round_avatar_config").getBoolean("round_avatar_enable", false) && (i9 = this.f1716b) >= 0) {
            Object[] objArr = methodHookParam.args;
            if (i9 < objArr.length) {
                objArr[i9] = Float.valueOf(AbstractC2043a.m5018X(AbstractC3754e0.m7907q(AbstractC4302b.m8640c(r0.f12143a, "Hchat_round_avatar_config").getFloat("round_avatar_radius_factor", 0.5f), 0.1f, 0.5f) * 100.0f) / 100.0f);
                int i10 = this.f1717c;
                if (i10 >= 0) {
                    Object[] objArr2 = methodHookParam.args;
                    if (i10 < objArr2.length) {
                        Object obj = objArr2[i10];
                        Number number = obj instanceof Number ? (Number) obj : null;
                        if (number != null) {
                            methodHookParam.args[i10] = Integer.valueOf(number.intValue() & (-5));
                        }
                    }
                }
            }
        }
    }
}
