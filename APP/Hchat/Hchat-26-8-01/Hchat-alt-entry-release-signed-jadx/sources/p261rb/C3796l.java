package p261rb;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import okhttp3.HttpUrl;
import org.json.JSONArray;
import p000a.AbstractC0000a;
import p136j8.AbstractC2091b;
import p218og.AbstractC3149m;
import p276sf.C3959f;
import p300ub.AbstractC4302b;
import p304uf.C4329c;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.C4173t;

/* JADX INFO: renamed from: rb.l */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3796l {

    /* JADX INFO: renamed from: a */
    public final SharedPreferences f12465a;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3796l(Context context) {
        this.f12465a = AbstractC4302b.m8640c(context, "Hchat_zombie_check_config");
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static String m7987a(Iterable iterable) {
        JSONArray jSONArray = new JSONArray();
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(iterable));
        Iterator it = iterable.iterator();
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
            jSONArray.put((String) it2.next());
        }
        String string = jSONArray.toString();
        string.getClass();
        return string;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public final List m7988b(String str) {
        Object c3959f;
        SharedPreferences sharedPreferences = this.f12465a;
        String str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        String string = sharedPreferences.getString(str, HttpUrl.FRAGMENT_ENCODE_SET);
        if (string != null) {
            str2 = string;
        }
        boolean zM6721t0 = AbstractC3149m.m6721t0(str2);
        C4173t c4173t = C4173t.f13710g;
        if (zM6721t0) {
            return c4173t;
        }
        try {
            JSONArray jSONArray = new JSONArray(str2);
            C4329c c4329cM7E = AbstractC0000a.m7E();
            int length = jSONArray.length();
            for (int i9 = 0; i9 < length; i9++) {
                String strOptString = jSONArray.optString(i9);
                strOptString.getClass();
                String string2 = AbstractC3149m.m6703R0(strOptString).toString();
                if (!(string2.length() > 0)) {
                    string2 = null;
                }
                if (string2 != null) {
                    c4329cM7E.add(string2);
                }
            }
            c3959f = AbstractC4166m.m8418p1(AbstractC0000a.m90t(c4329cM7E));
        } catch (Throwable th2) {
            c3959f = new C3959f(th2);
        }
        Object obj = c4173t;
        if (!(c3959f instanceof C3959f)) {
            obj = c3959f;
        }
        return (List) obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final Set m7989c(String str) {
        return AbstractC4166m.m8412U1(m7988b(str));
    }
}
