package yyds;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: yyds.ᛵᲈᛳᛳ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1239 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C1239 f5669;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final List f5670;

    static {
        AbstractC2328.m4341(-275865322292078L);
        AbstractC2328.m4341(-275955516605294L);
        AbstractC2328.m4341(-276002761245550L);
        AbstractC2328.m4341(-276101545493358L);
        f5669 = new C1239();
        f5670 = AbstractC2725.m4854(AbstractC2328.m4341(-276153085100910L), AbstractC2328.m4341(-276178854904686L), AbstractC2328.m4341(-276204624708462L), AbstractC2328.m4341(-276234689479534L), AbstractC2328.m4341(-276269049217902L), AbstractC2328.m4341(-276294819021678L), AbstractC2328.m4341(-276320588825454L), AbstractC2328.m4341(-276346358629230L), AbstractC2328.m4341(-276372128433006L), AbstractC2328.m4341(-276397898236782L), AbstractC2328.m4341(-276423668040558L), AbstractC2328.m4341(-276449437844334L), AbstractC2328.m4341(-276475207648110L));
    }

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public static void m2526(Context context, List list) {
        AbstractC2328.m4341(-275689228632942L);
        AbstractC2328.m4341(-275723588371310L);
        SharedPreferences sharedPreferencesM2529 = m2529(context);
        String strM3285 = AbstractC1595.m3285(list, AbstractC2328.m4341(-275826667586414L), AbstractC2328.m4341(-275835257521006L), AbstractC2328.m4341(-275843847455598L), new C0061(7), 24);
        SharedPreferences.Editor editorEdit = sharedPreferencesM2529.edit();
        editorEdit.putString(AbstractC2328.m4341(-275770833011566L), strM3285);
        editorEdit.apply();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v4, types: [yyds.ᛸᲀᛶᲈ] */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static ArrayList m2527(Context context) {
        ?? arrayList;
        AbstractC2328.m4341(-274658436481902L);
        SharedPreferences sharedPreferencesM2529 = m2529(context);
        if (!sharedPreferencesM2529.getBoolean(AbstractC2328.m4341(-274555357266798L), false)) {
            m2526(context, f5670);
            SharedPreferences.Editor editorEdit = sharedPreferencesM2529.edit();
            editorEdit.putBoolean(AbstractC2328.m4341(-274606896874350L), true);
            editorEdit.apply();
        }
        String string = m2529(context).getString(AbstractC2328.m4341(-274692796220270L), AbstractC2328.m4341(-274740040860526L));
        if (string == null) {
            string = AbstractC2328.m4341(-274752925762414L);
        }
        try {
            List listM1296 = AbstractC0473.m1296(AbstractC0473.m1298(string, '[', ']'), new String[]{AbstractC2328.m4341(-275818077651822L)}, 6);
            ArrayList arrayList2 = new ArrayList(AbstractC0055.m419(listM1296, 10));
            Iterator it = listM1296.iterator();
            while (it.hasNext()) {
                arrayList2.add(AbstractC0473.m1298(AbstractC0473.m1314((String) it.next()).toString(), '\"'));
            }
            arrayList = new ArrayList();
            for (Object obj : arrayList2) {
                if (((String) obj).length() > 0) {
                    arrayList.add(obj);
                }
            }
        } catch (Exception unused) {
            arrayList = C1860.f9345;
        }
        return new ArrayList((Collection) arrayList);
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static String m2528(Context context) {
        AbstractC2328.m4341(-275354221183854L);
        return m2529(context).getString(AbstractC2328.m4341(-275388580922222L), null);
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static SharedPreferences m2529(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(AbstractC2328.m4341(-275487365170030L), 0);
        AbstractC2328.m4341(-275577559483246L);
        return sharedPreferences;
    }

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public static void m2530(Context context, String str) {
        AbstractC2328.m4341(-275122292949870L);
        SharedPreferences.Editor editorEdit = m2529(context).edit();
        if (str == null) {
            editorEdit.remove(AbstractC2328.m4341(-275156652688238L));
        } else {
            editorEdit.putString(AbstractC2328.m4341(-275255436936046L), str);
        }
        editorEdit.apply();
    }
}
