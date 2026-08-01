package p391;

import androidx.compose.foundation.draganddrop.AbstractC0455;
import bsh.C2632;
import com.bumptech.glide.AbstractC3056;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4338;
import kotlin.collections.AbstractC4343;
import kotlin.collections.AbstractC4344;
import p087.C7087;
import p087.C7102;
import p088.AbstractC7167;
import p088.AbstractC7175;
import p088.C7151;
import p088.C7156;
import p088.C7160;
import p088.C7161;
import p088.C7162;
import p089.C7179;
import p089.InterfaceC7183;
import p251.C8182;
import p251.SharedPreferencesC8175;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰世子.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9114 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String f25484 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SharedPreferencesC8175 f25485;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7161 f25486;

    public C9114(String str, String str2) {
        this.f25486 = AbstractC0455.m1152(new C7179(25));
        if (f25484.length() != 0) {
            this.f25485 = new C8182(f25484, str).m13649();
        } else {
            C2632.m5294("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14640(Object obj, String str) {
        obj.getClass();
        boolean z = obj instanceof String;
        SharedPreferencesC8175 sharedPreferencesC8175 = this.f25485;
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
            return;
        }
        if (obj instanceof byte[]) {
            sharedPreferencesC8175.m13640(str, (byte[]) obj);
            return;
        }
        boolean z2 = obj instanceof Collection;
        C7161 c7161 = this.f25486;
        if (z2) {
            AbstractC7175 abstractC7175M14644 = m14644(obj);
            c7161.getClass();
            sharedPreferencesC8175.putString(str, c7161.m12397(AbstractC7175.Companion.serializer(), abstractC7175M14644));
        } else {
            if (!(obj instanceof Map)) {
                sharedPreferencesC8175.putString(str, c7161.m12397(AbstractC3056.m6714(c7161.f19132, obj.getClass()), obj));
                return;
            }
            AbstractC7175 abstractC7175M146442 = m14644(obj);
            c7161.getClass();
            sharedPreferencesC8175.putString(str, c7161.m12397(AbstractC7175.Companion.serializer(), abstractC7175M146442));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m14641(String str, String str2) {
        str2.getClass();
        String string = this.f25485.getString(str, str2);
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m14642(String str, InterfaceC7183 interfaceC7183) {
        String string = this.f25485.getString(str, "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return this.f25486.m12399(string, interfaceC7183);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m14643(Class cls, String str) {
        C7161 c7161 = this.f25486;
        InterfaceC7183 interfaceC7183M6714 = AbstractC3056.m6714(c7161.f19132, cls);
        String string = this.f25485.getString(str, "");
        return (string == null || string.length() == 0) ? new ArrayList() : AbstractC4343.m8799((Collection) c7161.m12399(string, new C7102(interfaceC7183M6714, 0)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7175 m14644(Object obj) {
        if (obj == null) {
            return C7162.INSTANCE;
        }
        if (obj instanceof String) {
            return AbstractC7167.m12405((String) obj);
        }
        if (obj instanceof Number) {
            return AbstractC7167.m12406((Number) obj);
        }
        if (obj instanceof Boolean) {
            C7087 c7087 = AbstractC7167.f19142;
            return new C7160((Boolean) obj, false, null);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC4344.m8832(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m14644(it.next()));
            }
            return new C7156(arrayList);
        }
        if (!(obj instanceof Map)) {
            C7161 c7161 = this.f25486;
            return c7161.m12398(AbstractC3056.m6714(c7161.f19132, obj.getClass()), obj);
        }
        Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
        int iM8779 = AbstractC4338.m8779(AbstractC4344.m8832(setEntrySet, 10));
        if (iM8779 < 16) {
            iM8779 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8779);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(String.valueOf(entry.getKey()), m14644(entry.getValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new C7151(linkedHashMap);
    }

    public /* synthetic */ C9114(String str, int i) {
        this(str, "");
    }
}
