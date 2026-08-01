package p407;

import bsh.C3466;
import com.bumptech.glide.AbstractC3897;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC5171;
import kotlin.collections.AbstractC5176;
import kotlin.collections.AbstractC5177;
import kotlin.reflect.jvm.internal.types.AbstractC5754;
import p103.C7917;
import p103.C7932;
import p104.AbstractC7997;
import p104.AbstractC8005;
import p104.C7981;
import p104.C7986;
import p104.C7990;
import p104.C7991;
import p104.C7992;
import p105.C8009;
import p105.InterfaceC8013;
import p267.C9012;
import p267.SharedPreferencesC9005;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9924 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String f25833 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SharedPreferencesC9005 f25834;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7991 f25835;

    public C9924(String str, String str2) {
        this.f25835 = AbstractC3897.m7383(new C8009(24));
        if (f25833.length() != 0) {
            this.f25834 = new C9012(f25833, str).m14232();
        } else {
            C3466.m5899("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m15236(Object obj, String str) {
        obj.getClass();
        boolean z = obj instanceof String;
        SharedPreferencesC9005 sharedPreferencesC9005 = this.f25834;
        if (z) {
            sharedPreferencesC9005.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            sharedPreferencesC9005.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            sharedPreferencesC9005.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            sharedPreferencesC9005.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            sharedPreferencesC9005.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            sharedPreferencesC9005.m14227(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof byte[]) {
            sharedPreferencesC9005.m14223(str, (byte[]) obj);
            return;
        }
        boolean z2 = obj instanceof Collection;
        C7991 c7991 = this.f25835;
        if (z2) {
            AbstractC8005 abstractC8005M15240 = m15240(obj);
            c7991.getClass();
            sharedPreferencesC9005.putString(str, c7991.m12983(AbstractC8005.Companion.serializer(), abstractC8005M15240));
        } else {
            if (!(obj instanceof Map)) {
                sharedPreferencesC9005.putString(str, c7991.m12983(AbstractC5754.m10431(c7991.f19472, obj.getClass()), obj));
                return;
            }
            AbstractC8005 abstractC8005M152402 = m15240(obj);
            c7991.getClass();
            sharedPreferencesC9005.putString(str, c7991.m12983(AbstractC8005.Companion.serializer(), abstractC8005M152402));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m15237(String str, String str2) {
        str2.getClass();
        String string = this.f25834.getString(str, str2);
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m15238(String str, InterfaceC8013 interfaceC8013) {
        String string = this.f25834.getString(str, "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return this.f25835.m12985(string, interfaceC8013);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m15239(Class cls, String str) {
        C7991 c7991 = this.f25835;
        InterfaceC8013 interfaceC8013M10431 = AbstractC5754.m10431(c7991.f19472, cls);
        String string = this.f25834.getString(str, "");
        return (string == null || string.length() == 0) ? new ArrayList() : AbstractC5176.m9345((Collection) c7991.m12985(string, new C7932(interfaceC8013M10431, 0)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC8005 m15240(Object obj) {
        if (obj == null) {
            return C7992.INSTANCE;
        }
        if (obj instanceof String) {
            return AbstractC7997.m12991((String) obj);
        }
        if (obj instanceof Number) {
            return AbstractC7997.m12992((Number) obj);
        }
        if (obj instanceof Boolean) {
            C7917 c7917 = AbstractC7997.f19482;
            return new C7990((Boolean) obj, false, null);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC5177.m9381(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m15240(it.next()));
            }
            return new C7986(arrayList);
        }
        if (!(obj instanceof Map)) {
            C7991 c7991 = this.f25835;
            return c7991.m12984(AbstractC5754.m10431(c7991.f19472, obj.getClass()), obj);
        }
        Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
        int iM9331 = AbstractC5171.m9331(AbstractC5177.m9381(setEntrySet, 10));
        if (iM9331 < 16) {
            iM9331 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM9331);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(String.valueOf(entry.getKey()), m15240(entry.getValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new C7981(linkedHashMap);
    }

    public /* synthetic */ C9924(String str, int i) {
        this(str, "");
    }
}
