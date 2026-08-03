package p000a;

import android.content.Context;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: a.te */
/* JADX INFO: loaded from: classes.dex */
public final class C0845te {

    /* JADX INFO: renamed from: a.te$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final String f3320a;

        /* JADX INFO: renamed from: b */
        public final String f3321b;

        /* JADX INFO: renamed from: c */
        public final LinkedHashMap f3322c;

        /* JADX INFO: renamed from: d */
        public final long f3323d;

        public a(String str, String str2, LinkedHashMap linkedHashMap, long j) {
            this.f3320a = str;
            this.f3321b = str2;
            this.f3322c = linkedHashMap;
            this.f3323d = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f3320a.equals(aVar.f3320a) && this.f3321b.equals(aVar.f3321b) && this.f3322c.equals(aVar.f3322c) && this.f3323d == aVar.f3323d;
        }

        public final int hashCode() {
            return Long.hashCode(this.f3323d) + ((this.f3322c.hashCode() + C0944z.m2222b(this.f3321b, this.f3320a.hashCode() * 31, 31)) * 31);
        }

        public final String toString() {
            return "StartupSnapshot(wechatVersion=" + this.f3320a + ", pluginVersion=" + this.f3321b + ", resolvedClasses=" + this.f3322c + ", createdAt=" + this.f3323d + ")";
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1970a(Context context, String str, LinkedHashMap linkedHashMap) {
        C0631i9.m1482e(str, "wechatVersion");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("wechatVersion", str);
            jSONObject.put("pluginVersion", "3.1.5");
            jSONObject.put("resolvedClasses", new JSONObject(linkedHashMap));
            jSONObject.put("createdAt", System.currentTimeMillis());
            context.getSharedPreferences("fc_startup_state", 0).edit().putString("startup_snapshot", jSONObject.toString()).apply();
            C0908x1.m2194b("StartupSnapshot", "SAVED: wechat=" + str + " plugin=3.1.5 classes=" + linkedHashMap.size());
        } catch (Exception e) {
            C0908x1.m2197e("StartupSnapshot", C0944z.m2231k("save failed: ", e.getMessage()));
        }
    }
}
