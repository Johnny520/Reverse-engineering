package p342;

import com.alibaba.fastjson2.InterfaceC2915;
import com.bumptech.glide.AbstractC3056;
import kotlin.reflect.jvm.internal.impl.descriptors.C4484;
import p251.C8182;
import p251.SharedPreferencesC8175;

/* JADX INFO: renamed from: 飘花落叶言苏哲世子楪兰.飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8821 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public static String f24811 = AbstractC3056.m6668(-3937561979095614887L);

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final SharedPreferencesC8175 f24812;

    public C8821() {
        String strM6668 = AbstractC3056.m6668(-3937358904451925415L);
        AbstractC3056.m6668(-3937592030981784999L);
        C8182 c8182 = new C8182(f24811, strM6668);
        c8182.f22551 = new C4484();
        this.f24812 = c8182.m13649();
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final void m14465(Object obj, String str) {
        AbstractC3056.m6668(-3937803416387192231L);
        AbstractC3056.m6668(-3937685966211515815L);
        boolean z = obj instanceof String;
        SharedPreferencesC8175 sharedPreferencesC8175 = this.f24812;
        if (z) {
            sharedPreferencesC8175.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            sharedPreferencesC8175.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            sharedPreferencesC8175.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            sharedPreferencesC8175.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            sharedPreferencesC8175.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            sharedPreferencesC8175.m13644(str, ((Number) obj).doubleValue());
        } else if (obj instanceof byte[]) {
            sharedPreferencesC8175.m13640(str, (byte[]) obj);
        } else {
            sharedPreferencesC8175.putString(str, InterfaceC2915.m6317(obj));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final Object m14466(Class cls, String str) {
        AbstractC3056.m6668(-3937803416387192231L);
        AbstractC3056.m6668(-3937627417217336743L);
        String string = this.f24812.getString(str, "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return InterfaceC2915.m6311(string, cls);
    }
}
