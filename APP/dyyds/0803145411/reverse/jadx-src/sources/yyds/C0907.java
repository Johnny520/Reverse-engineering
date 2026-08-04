package yyds;

import com.tencent.mmkv.MMKV;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: yyds.ᛴᛸᛴᛲ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0907 {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static final C0907 f4128;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static final C0078 f4129;

    static {
        AbstractC2328.m4341(-755845097489262L);
        AbstractC2328.m4341(-755918111933294L);
        f4128 = new C0907();
        f4129 = new C0078(new C0824(14));
    }

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public static void m2021(String str, String str2, String str3, String str4, long j) {
        AbstractC2328.m4341(-754479297889134L);
        AbstractC2328.m4341(-754500772725614L);
        AbstractC2328.m4341(-754535132463982L);
        AbstractC2328.m4341(-754578082136942L);
        C2336 c2336 = C2336.f11496;
        c2336.m4354(AbstractC2328.m4341(-754638211679086L) + str3 + AbstractC2328.m4341(-754689751286638L) + str4 + AbstractC2328.m4341(-754719816057710L) + j + AbstractC2328.m4341(-754749880828782L));
        ArrayList arrayList = new ArrayList(m2022());
        C2467 c2467 = new C2467(System.currentTimeMillis(), str, str2, str3, str4, j, System.currentTimeMillis());
        File file = new File(str4);
        if (file.exists()) {
            c2336.m4354(AbstractC2328.m4341(-754844370109294L) + file.length() + AbstractC2328.m4341(-754895909716846L));
        } else {
            c2336.m4353(AbstractC2328.m4341(-754762765730670L).concat(str4));
        }
        arrayList.add(0, c2467);
        while (arrayList.size() > 20) {
            C2467 c24672 = (C2467) arrayList.remove(arrayList.size() - 1);
            try {
                new File(c24672.f12182).delete();
                C2336.f11496.m4354(AbstractC2328.m4341(-754925974487918L) + c24672.f12182);
            } catch (Exception e) {
                C2336.f11496.m4354(AbstractC2328.m4341(-754977514095470L) + e.getMessage());
            }
        }
        m2023(arrayList);
        C2336.f11496.m4354(AbstractC2328.m4341(-755033348670318L) + arrayList.size());
    }

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public static List m2022() {
        String string = ((MMKV) f4129.getValue()).getString(AbstractC2328.m4341(-753727678612334L), null);
        C1860 c1860 = C1860.f9345;
        if (string == null) {
            return c1860;
        }
        try {
            JSONArray jSONArray = new JSONArray(string);
            ArrayList arrayList = new ArrayList();
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                long j = jSONObject.getLong(AbstractC2328.m4341(-753800693056366L));
                String string2 = jSONObject.getString(AbstractC2328.m4341(-753813577958254L));
                AbstractC2328.m4341(-753835052794734L);
                String string3 = jSONObject.getString(AbstractC2328.m4341(-753899477304174L));
                AbstractC2328.m4341(-753933837042542L);
                String string4 = jSONObject.getString(AbstractC2328.m4341(-753998261551982L));
                AbstractC2328.m4341(-754041211224942L);
                String string5 = jSONObject.getString(AbstractC2328.m4341(-754105635734382L));
                AbstractC2328.m4341(-754165765276526L);
                C2467 c2467 = new C2467(j, string2, string3, string4, string5, jSONObject.optLong(AbstractC2328.m4341(-754230189785966L), 0L), jSONObject.getLong(AbstractC2328.m4341(-754268844491630L)));
                String str = c2467.f12182;
                if (!new File(str).exists()) {
                    C2336.f11496.m4354(AbstractC2328.m4341(-754316089131886L) + str);
                }
                arrayList.add(c2467);
            }
            C2336.f11496.m4354(AbstractC2328.m4341(-754376218674030L) + arrayList.size() + AbstractC2328.m4341(-754397693510510L));
            return AbstractC1595.m3272(arrayList, new C1300(23));
        } catch (Exception e) {
            C2336.f11496.m4358(AbstractC2328.m4341(-754427758281582L), e);
            return c1860;
        }
    }

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public static void m2023(ArrayList arrayList) {
        try {
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C2467 c2467 = (C2467) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(AbstractC2328.m4341(-755342586315630L), c2467.f12183);
                jSONObject.put(AbstractC2328.m4341(-755355471217518L), c2467.f12184);
                jSONObject.put(AbstractC2328.m4341(-755376946053998L), c2467.f12186);
                jSONObject.put(AbstractC2328.m4341(-755411305792366L), c2467.f12188);
                jSONObject.put(AbstractC2328.m4341(-755454255465326L), c2467.f12182);
                jSONObject.put(AbstractC2328.m4341(-755514385007470L), c2467.f12187);
                jSONObject.put(AbstractC2328.m4341(-755553039713134L), c2467.f12185);
                jSONArray.put(jSONObject);
            }
            ((MMKV) f4129.getValue()).putString(AbstractC2328.m4341(-755600284353390L), jSONArray.toString());
        } catch (Exception e) {
            C2336.f11496.m4358(AbstractC2328.m4341(-755673298797422L), e);
        }
    }
}
