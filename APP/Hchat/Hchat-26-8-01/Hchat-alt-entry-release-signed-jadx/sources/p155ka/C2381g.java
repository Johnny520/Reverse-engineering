package p155ka;

import ac.AbstractC0063p;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4335i;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4175v;

/* JADX INFO: renamed from: ka.g */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2381g {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f7826a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2381g(Context context) {
        this.f7826a = AbstractC4302b.m8640c(context, "Hchat_qq_music_order_config");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public final Set m5700a() {
        Object c3959f;
        String strM5703d = m5703d("qq_music_order_allowed_talkers", HttpUrl.FRAGMENT_ENCODE_SET);
        boolean zM6721t0 = AbstractC3149m.m6721t0(strM5703d);
        C4175v c4175v = C4175v.f13712g;
        if (zM6721t0) {
            return c4175v;
        }
        try {
            JSONArray jSONArray = new JSONArray(strM5703d);
            C4335i c4335i = new C4335i();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                String strOptString = jSONArray.optString(i9);
                strOptString.getClass();
                String string = AbstractC3149m.m6703R0(strOptString).toString();
                if (string.length() <= 0) {
                    string = null;
                }
                if (string != null) {
                    c4335i.add(string);
                }
            }
            c3959f = AbstractC0063p.m415h(c4335i);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4175v;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (Set) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final boolean m5701b(String str, boolean z9) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f7826a;
            c3959f = Boolean.valueOf(sharedPreferences != null ? sharedPreferences.getBoolean(str, z9) : z9);
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object objValueOf = Boolean.valueOf(z9);
        if (c3959f instanceof C3959f) {
            c3959f = objValueOf;
        }
        return ((Boolean) c3959f).booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final void m5702c(Set set) {
        SharedPreferences.Editor editorEdit;
        set.getClass();
        SharedPreferences sharedPreferences = this.f7826a;
        if (sharedPreferences == null || (editorEdit = sharedPreferences.edit()) == null) {
            return;
        }
        JSONArray jSONArray = new JSONArray();
        Set set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(set2));
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        Iterator it2 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2)).iterator();
        while (it2.hasNext()) {
            jSONArray.put(it2.next());
        }
        String string = jSONArray.toString();
        string.getClass();
        SharedPreferences.Editor editorPutString = editorEdit.putString("qq_music_order_allowed_talkers", string);
        if (editorPutString != null) {
            editorPutString.commit();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:9:0x000d  */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String m5703d(String str, String str2) {
        Object c3959f;
        try {
            SharedPreferences sharedPreferences = this.f7826a;
            if (sharedPreferences != null) {
                String string = sharedPreferences.getString(str, str2);
                c3959f = string;
                if (string == null) {
                    c3959f = str2;
                }
            }
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = str2;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (String) obj;
    }
}
