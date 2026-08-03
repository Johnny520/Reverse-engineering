package p037cb;

import android.app.Notification;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import de.robv.android.xposed.XC_MethodHook;
import p099h.Hchat.utils.KavaReflector;
import p129ig.AbstractC2043a;
import p259r9.AbstractC3754e0;
import p300ub.AbstractC4302b;
import tf.AbstractC4165l;

/* JADX INFO: renamed from: cb.d */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0543d extends XC_MethodHook {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0545f f1714b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C0543d(C0545f c0545f, int i9) {
        this.f1713a = i9;
        this.f1714b = c0545f;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void beforeHookedMethod(XC_MethodHook.MethodHookParam methodHookParam) {
        Bitmap bitmapM1534a;
        Object obj;
        Bitmap bitmap;
        int i9 = this.f1713a;
        methodHookParam.getClass();
        switch (i9) {
            case 0:
                if (AbstractC4302b.m8640c(this.f1714b.f1719b.f12143a, "Hchat_round_avatar_config").getBoolean("round_avatar_enable", false)) {
                    Object[] objArr = methodHookParam.args;
                    objArr.getClass();
                    Object objM8391z0 = AbstractC4165l.m8391z0(objArr);
                    Bitmap bitmap2 = objM8391z0 instanceof Bitmap ? (Bitmap) objM8391z0 : null;
                    if (bitmap2 != null) {
                        methodHookParam.args[0] = C0541b.f1707a.m1534a(bitmap2, AbstractC2043a.m5018X(AbstractC3754e0.m7907q(AbstractC4302b.m8640c(r0.f12143a, "Hchat_round_avatar_config").getFloat("round_avatar_radius_factor", 0.5f), 0.1f, 0.5f) * 100.0f) / 100.0f);
                    }
                    break;
                }
                break;
            case 1:
                if (AbstractC4302b.m8640c(this.f1714b.f1719b.f12143a, "Hchat_round_avatar_config").getBoolean("round_avatar_enable", false)) {
                    Object[] objArr2 = methodHookParam.args;
                    objArr2.getClass();
                    Object objM8391z02 = AbstractC4165l.m8391z0(objArr2);
                    Icon icon = objM8391z02 instanceof Icon ? (Icon) objM8391z02 : null;
                    if (icon != null) {
                        Object objInvokeMethod = KavaReflector.invokeMethod(icon, "getBitmap", new Object[0]);
                        Bitmap bitmap3 = objInvokeMethod instanceof Bitmap ? (Bitmap) objInvokeMethod : null;
                        if (bitmap3 != null && (bitmapM1534a = C0541b.f1707a.m1534a(bitmap3, AbstractC2043a.m5018X(AbstractC3754e0.m7907q(AbstractC4302b.m8640c(r0.f12143a, "Hchat_round_avatar_config").getFloat("round_avatar_radius_factor", 0.5f), 0.1f, 0.5f) * 100.0f) / 100.0f)) != bitmap3) {
                            methodHookParam.args[0] = Icon.createWithBitmap(bitmapM1534a);
                            break;
                        }
                    }
                }
                break;
            default:
                int i10 = 0;
                if (AbstractC4302b.m8640c(this.f1714b.f1719b.f12143a, "Hchat_round_avatar_config").getBoolean("round_avatar_enable", false)) {
                    Object[] objArr3 = methodHookParam.args;
                    objArr3.getClass();
                    int length = objArr3.length;
                    while (true) {
                        if (i10 < length) {
                            obj = objArr3[i10];
                            if (!(obj instanceof Notification)) {
                                i10++;
                            }
                        } else {
                            obj = null;
                        }
                    }
                    Notification notification = obj instanceof Notification ? (Notification) obj : null;
                    if (notification != null && (bitmap = notification.largeIcon) != null) {
                        notification.largeIcon = C0541b.f1707a.m1534a(bitmap, AbstractC2043a.m5018X(AbstractC3754e0.m7907q(AbstractC4302b.m8640c(r0.f12143a, "Hchat_round_avatar_config").getFloat("round_avatar_radius_factor", 0.5f), 0.1f, 0.5f) * 100.0f) / 100.0f);
                        break;
                    }
                }
                break;
        }
    }
}
