package Yue;

import android.os.PersistableBundle;

/* JADX INFO: renamed from: Yue.ۥۡۤ۠ۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7113(21)
public final class C6656 {

    /* JADX INFO: renamed from: ۥ */
    @InterfaceC6399
    public static final C6656 f2212 = new C6656();

    @InterfaceC6399
    @InterfaceC4482
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ */
    public static final PersistableBundle m3133(int i) {
        return new PersistableBundle(i);
    }

    @InterfaceC4482
    @InterfaceC5578
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m3134(@InterfaceC6399 PersistableBundle persistableBundle, @InterfaceC6489 String str, @InterfaceC6489 Object obj) {
        if (obj == null) {
            persistableBundle.putString(str, null);
            return;
        }
        if (obj instanceof Boolean) {
            C6657.m3135(persistableBundle, str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Double) {
            persistableBundle.putDouble(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Integer) {
            persistableBundle.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Long) {
            persistableBundle.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof String) {
            persistableBundle.putString(str, (String) obj);
            return;
        }
        if (obj instanceof boolean[]) {
            C6657.m3136(persistableBundle, str, (boolean[]) obj);
            return;
        }
        if (obj instanceof double[]) {
            persistableBundle.putDoubleArray(str, (double[]) obj);
            return;
        }
        if (obj instanceof int[]) {
            persistableBundle.putIntArray(str, (int[]) obj);
            return;
        }
        if (obj instanceof long[]) {
            persistableBundle.putLongArray(str, (long[]) obj);
            return;
        }
        if (!(obj instanceof Object[])) {
            throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + C8039.f3212);
        }
        Class<?> componentType = obj.getClass().getComponentType();
        C5499.m17100(componentType);
        if (String.class.isAssignableFrom(componentType)) {
            C5499.m17101(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
            persistableBundle.putStringArray(str, (String[]) obj);
            return;
        }
        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + C8039.f3212);
    }
}
