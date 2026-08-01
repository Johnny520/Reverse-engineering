package p391;

import bsh.C2633;
import com.bumptech.glide.AbstractC3065;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.AbstractC4339;
import kotlin.collections.AbstractC4344;
import kotlin.collections.AbstractC4345;
import kotlin.reflect.jvm.internal.types.AbstractC4922;
import p087.C7088;
import p087.C7103;
import p088.AbstractC7168;
import p088.AbstractC7176;
import p088.C7152;
import p088.C7157;
import p088.C7161;
import p088.C7162;
import p088.C7163;
import p089.C7180;
import p089.InterfaceC7184;
import p251.C8183;
import p251.SharedPreferencesC8176;

/* JADX INFO: renamed from: 飘花落叶言苏楪哲兰子世.飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9095 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public static String f25488 = "";

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final SharedPreferencesC8176 f25489;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final C7162 f25490;

    public C9095(String str, String str2) {
        this.f25490 = AbstractC3065.m6823(new C7180(24));
        if (f25488.length() != 0) {
            this.f25489 = new C8183(f25488, str).m13673();
        } else {
            C2633.m5339("storePath is empty(请使用KvHelper.initialize(String path)初始化");
            throw null;
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final void m14677(Object obj, String str) {
        obj.getClass();
        boolean z = obj instanceof String;
        SharedPreferencesC8176 sharedPreferencesC8176 = this.f25489;
        if (z) {
            sharedPreferencesC8176.putString(str, (String) obj);
            return;
        }
        if (obj instanceof Integer) {
            sharedPreferencesC8176.putInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            sharedPreferencesC8176.putBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Float) {
            sharedPreferencesC8176.putFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            sharedPreferencesC8176.putLong(str, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            sharedPreferencesC8176.m13668(str, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof byte[]) {
            sharedPreferencesC8176.m13664(str, (byte[]) obj);
            return;
        }
        boolean z2 = obj instanceof Collection;
        C7162 c7162 = this.f25490;
        if (z2) {
            AbstractC7176 abstractC7176M14681 = m14681(obj);
            c7162.getClass();
            sharedPreferencesC8176.putString(str, c7162.m12424(AbstractC7176.Companion.serializer(), abstractC7176M14681));
        } else {
            if (!(obj instanceof Map)) {
                sharedPreferencesC8176.putString(str, c7162.m12424(AbstractC4922.m9872(c7162.f19127, obj.getClass()), obj));
                return;
            }
            AbstractC7176 abstractC7176M146812 = m14681(obj);
            c7162.getClass();
            sharedPreferencesC8176.putString(str, c7162.m12424(AbstractC7176.Companion.serializer(), abstractC7176M146812));
        }
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final String m14678(String str, String str2) {
        str2.getClass();
        String string = this.f25489.getString(str, str2);
        return string == null ? "" : string;
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final Object m14679(String str, InterfaceC7184 interfaceC7184) {
        String string = this.f25489.getString(str, "");
        if (string == null || string.length() == 0) {
            return null;
        }
        return this.f25490.m12426(string, interfaceC7184);
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final ArrayList m14680(Class cls, String str) {
        C7162 c7162 = this.f25490;
        InterfaceC7184 interfaceC7184M9872 = AbstractC4922.m9872(c7162.f19127, cls);
        String string = this.f25489.getString(str, "");
        return (string == null || string.length() == 0) ? new ArrayList() : AbstractC4344.m8786((Collection) c7162.m12426(string, new C7103(interfaceC7184M9872, 0)));
    }

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final AbstractC7176 m14681(Object obj) {
        if (obj == null) {
            return C7163.INSTANCE;
        }
        if (obj instanceof String) {
            return AbstractC7168.m12432((String) obj);
        }
        if (obj instanceof Number) {
            return AbstractC7168.m12433((Number) obj);
        }
        if (obj instanceof Boolean) {
            C7088 c7088 = AbstractC7168.f19137;
            return new C7161((Boolean) obj, false, null);
        }
        if (obj instanceof List) {
            Iterable iterable = (Iterable) obj;
            ArrayList arrayList = new ArrayList(AbstractC4345.m8822(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(m14681(it.next()));
            }
            return new C7157(arrayList);
        }
        if (!(obj instanceof Map)) {
            C7162 c7162 = this.f25490;
            return c7162.m12425(AbstractC4922.m9872(c7162.f19127, obj.getClass()), obj);
        }
        Set<Map.Entry> setEntrySet = ((Map) obj).entrySet();
        int iM8772 = AbstractC4339.m8772(AbstractC4345.m8822(setEntrySet, 10));
        if (iM8772 < 16) {
            iM8772 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iM8772);
        for (Map.Entry entry : setEntrySet) {
            Pair pair = new Pair(String.valueOf(entry.getKey()), m14681(entry.getValue()));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return new C7152(linkedHashMap);
    }

    public /* synthetic */ C9095(String str, int i) {
        this(str, "");
    }
}
