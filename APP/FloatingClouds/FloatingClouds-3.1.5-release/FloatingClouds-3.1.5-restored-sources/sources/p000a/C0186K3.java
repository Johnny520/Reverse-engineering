package p000a;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;
import p000a.C0638ig;
import p000a.C0653jc;
import top.mmjz.floatingclouds.bean.MaskItemBean;

/* JADX INFO: renamed from: a.K3 */
/* JADX INFO: loaded from: classes.dex */
public final class C0186K3 {

    /* JADX INFO: renamed from: j */
    public static volatile C0653jc f647j;

    /* JADX INFO: renamed from: k */
    public static volatile ArrayList<MaskItemBean> f648k;

    /* JADX INFO: renamed from: l */
    public static volatile Boolean f649l;

    /* JADX INFO: renamed from: a */
    public static final a f638a = new a();

    /* JADX INFO: renamed from: b */
    public static final String f639b = "maskList";

    /* JADX INFO: renamed from: c */
    public static final String f640c = "options";

    /* JADX INFO: renamed from: d */
    public static final String f641d = "config_mode_flag";

    /* JADX INFO: renamed from: e */
    public static final String f642e = "hiddenOwnSnsIds";

    /* JADX INFO: renamed from: f */
    public static final String f643f = "blockHotUpdate_reminder_acked";

    /* JADX INFO: renamed from: g */
    public static final String f644g = "migration_guard";

    /* JADX INFO: renamed from: h */
    public static final C0233Me f645h = new C0233Me(new C0891w3(1));

    /* JADX INFO: renamed from: i */
    public static final C0233Me f646i = new C0233Me(new C0891w3(2));

    /* JADX INFO: renamed from: m */
    public static final ArrayList<b> f650m = new ArrayList<>();

    /* JADX INFO: renamed from: a.K3$a */
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m500a(MaskItemBean maskItemBean) {
            ArrayList arrayListM506g;
            try {
                arrayListM506g = m506g();
            } catch (Exception e) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{maskItemBean.toJson(), e}, 2));
                arrayListM506g = null;
            }
            if (arrayListM506g == null) {
                return;
            }
            arrayListM506g.add(maskItemBean);
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayListM506g.iterator();
            while (it.hasNext()) {
                jSONArray.put(((MaskItemBean) it.next()).toJSONObject());
            }
            String string = jSONArray.toString();
            C0186K3.f638a.getClass();
            m509j().edit().putString(C0186K3.f639b, string).commit();
            C0186K3.f648k = new ArrayList<>(arrayListM506g);
            C0186K3.f649l = Boolean.FALSE;
            m512m();
        }

        /* JADX INFO: renamed from: b */
        public static File m501b(String str) {
            File parentFile;
            Context context = C0889w1.f3488p;
            Object obj = null;
            if (context == null) {
                return null;
            }
            String str2 = context.getApplicationInfo().dataDir;
            File dataDir = context.getDataDir();
            String absolutePath = dataDir != null ? dataDir.getAbsolutePath() : null;
            File filesDir = context.getFilesDir();
            List listM1757d0 = C0739o3.m1757d0(str2, absolutePath, (filesDir == null || (parentFile = filesDir.getParentFile()) == null) ? null : parentFile.getAbsolutePath());
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listM1757d0) {
                if (obj2 != null) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(C0758p3.m1800g0(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new File((String) it.next(), "shared_prefs"));
            }
            ArrayList arrayList3 = new ArrayList(C0758p3.m1800g0(arrayList2, 10));
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(new File((File) it2.next(), str.concat(".xml")));
            }
            Iterator it3 = arrayList3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                Object next = it3.next();
                if (((File) next).exists()) {
                    obj = next;
                    break;
                }
            }
            return (File) obj;
        }

        /* JADX INFO: renamed from: c */
        public static LinkedHashSet m502c() {
            String str = "[]";
            try {
                String string = m509j().getString(C0186K3.f642e, "[]");
                if (string != null) {
                    str = string;
                }
                JSONArray jSONArray = new JSONArray(str);
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArray.optString(i);
                    C0631i9.m1479b(strOptString);
                    if (C0034Be.m101P(strOptString)) {
                        strOptString = null;
                    }
                    if (strOptString != null) {
                        linkedHashSet.add(strOptString);
                    }
                }
                return linkedHashSet;
            } catch (Exception e) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"getHiddenOwnSnsIds fail", e}, 2));
                return new LinkedHashSet();
            }
        }

        /* JADX INFO: renamed from: d */
        public static C0638ig m503d() {
            try {
                String string = m509j().getString("version_initial_snapshot", null);
                if (string == null) {
                    return null;
                }
                return C0638ig.a.m1499a(new JSONObject(string));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: e */
        public static C0638ig m504e() {
            try {
                String string = m509j().getString("version_latest_snapshot", null);
                if (string == null) {
                    return null;
                }
                return C0638ig.a.m1499a(new JSONObject(string));
            } catch (Throwable unused) {
                return null;
            }
        }

        /* JADX INFO: renamed from: f */
        public static ArrayList m505f() {
            ArrayList<MaskItemBean> arrayList;
            ArrayList<MaskItemBean> arrayList2 = C0186K3.f648k;
            if (arrayList2 != null) {
                return arrayList2;
            }
            try {
                arrayList = m506g();
            } catch (Throwable th) {
                C0908x1.m2193a(Arrays.copyOf(new Object[]{th}, 1));
                arrayList = new ArrayList<>();
            }
            C0186K3.f648k = arrayList;
            C0186K3.f649l = Boolean.valueOf(arrayList.isEmpty());
            return arrayList;
        }

        /* JADX INFO: renamed from: g */
        public static ArrayList m506g() {
            ArrayList arrayList = new ArrayList();
            try {
                JSONArray jSONArray = new JSONArray(m509j().getString(C0186K3.f639b, "[]"));
                int length = jSONArray.length();
                boolean z = false;
                for (int i = 0; i < length; i++) {
                    String strOptString = jSONArray.optString(i);
                    if (strOptString != null && !C0034Be.m101P(strOptString)) {
                        MaskItemBean.INSTANCE.getClass();
                        MaskItemBean maskItemBeanM3333a = MaskItemBean.Companion.m3333a(strOptString);
                        if (!TextUtils.isEmpty(maskItemBeanM3333a.getMaskId())) {
                            String mapId = maskItemBeanM3333a.getMapId();
                            if (mapId == null || C0034Be.m101P(mapId)) {
                                maskItemBeanM3333a.setMapId("filehelper");
                                z = true;
                            }
                            if (!C0034Be.m101P(maskItemBeanM3333a.getMaskId())) {
                                arrayList.add(maskItemBeanM3333a);
                            }
                        }
                    }
                }
                if (z) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"ConfigUtil: sanitized empty mapId, persisting default"}, 1));
                    m518s(arrayList);
                    return arrayList;
                }
            } catch (Exception e) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"getMaskList fail", e}, 2));
            }
            return arrayList;
        }

        /* JADX INFO: renamed from: h */
        public static SharedPreferences m507h() {
            return (SharedPreferences) C0186K3.f646i.m625a();
        }

        /* JADX INFO: renamed from: i */
        public static C0653jc m508i() {
            C0653jc c0653jc = C0186K3.f647j;
            if (c0653jc != null) {
                return c0653jc;
            }
            m513n();
            C0653jc c0653jc2 = C0186K3.f647j;
            if (c0653jc2 != null) {
                return c0653jc2;
            }
            SharedPreferences sharedPreferencesM509j = m509j();
            String str = C0186K3.f640c;
            String string = sharedPreferencesM509j.getString(str, null);
            if (string == null || C0034Be.m101P(string) || string.equals("{}")) {
                C0653jc c0653jcM1517a = C0653jc.a.m1517a("{}");
                C0186K3.f647j = c0653jcM1517a;
                return c0653jcM1517a;
            }
            C0653jc c0653jcM1517a2 = C0653jc.a.m1517a(string);
            m507h().edit().putString(str, string).commit();
            C0186K3.f647j = c0653jcM1517a2;
            C0908x1.m2196d(4, "getOptionData migrated from legacy file: masterEnabled=" + c0653jcM1517a2.f2420L + " pid=" + Process.myPid(), null);
            return c0653jcM1517a2;
        }

        /* JADX INFO: renamed from: j */
        public static SharedPreferences m509j() {
            return (SharedPreferences) C0186K3.f645h.m625a();
        }

        /* JADX INFO: renamed from: k */
        public static boolean m510k() {
            boolean z = m509j().getBoolean(C0186K3.f641d, false);
            C0726n9.m1670m("ConfigModeFlag read: " + z);
            return z;
        }

        /* JADX INFO: renamed from: l */
        public static boolean m511l() {
            if (!m508i().f2420L) {
                return false;
            }
            String[] strArr = C0446Yc.f1658a;
            return !C0446Yc.f1659b;
        }

        /* JADX INFO: renamed from: m */
        public static void m512m() {
            Iterator<b> it = C0186K3.f650m.iterator();
            while (it.hasNext()) {
                it.next().onConfigChange();
            }
        }

        /* JADX INFO: renamed from: n */
        public static void m513n() {
            boolean z;
            try {
                File fileM501b = m501b("fc_options");
                if (fileM501b == null) {
                    fileM501b = m501b("mask_wechat_options");
                }
                if (fileM501b == null) {
                    fileM501b = m501b("fc_config");
                    if (fileM501b == null) {
                        fileM501b = m501b("mask_wechat_config");
                    }
                    z = false;
                } else {
                    z = true;
                }
                if (fileM501b == null) {
                    C0908x1.m2196d(3, "reloadConfigFromDisk: no SP file found, pid=" + Process.myPid(), null);
                    return;
                }
                String strM2133T = C0889w1.m2133T(fileM501b);
                Pattern patternCompile = Pattern.compile("<string name=\"options\">(.*?)</string>", 32);
                C0631i9.m1481d(patternCompile, "compile(...)");
                Matcher matcher = patternCompile.matcher(strM2133T);
                C0631i9.m1481d(matcher, "matcher(...)");
                C0459Z7 c0459z7 = !matcher.find(0) ? null : new C0459Z7(matcher, strM2133T);
                if (c0459z7 == null) {
                    C0908x1.m2196d(3, "reloadConfigFromDisk: <string name=\"options\"> not found in XML (new=" + z + ")", null);
                    return;
                }
                if (((C0917xa) c0459z7.f1727b) == null) {
                    c0459z7.f1727b = new C0917xa(c0459z7);
                }
                C0917xa c0917xa = (C0917xa) c0459z7.f1727b;
                C0631i9.m1479b(c0917xa);
                String strM48G = C0015Ae.m48G(C0015Ae.m48G(C0015Ae.m48G(C0015Ae.m48G((String) c0917xa.get(1), "&quot;", "\""), "&lt;", "<"), "&gt;", ">"), "&amp;", "&");
                C0653jc c0653jcM1517a = C0653jc.a.m1517a(strM48G);
                C0186K3.f647j = c0653jcM1517a;
                if (!z) {
                    m507h().edit().putString(C0186K3.f640c, strM48G).commit();
                }
                C0908x1.m2196d(4, "reloadConfigFromDisk OK (new=" + z + "): len=" + strM48G.length() + " masterEnabled=" + c0653jcM1517a.f2420L + " hideMainConvList=" + c0653jcM1517a.f2444n + " pid=" + Process.myPid(), null);
            } catch (Exception e) {
                C0908x1.m2196d(5, "reloadConfigFromDisk failed", e);
            }
        }

        /* JADX INFO: renamed from: o */
        public static void m514o(String str) {
            ArrayList arrayListM506g;
            C0631i9.m1482e(str, "wxid");
            try {
                arrayListM506g = m506g();
            } catch (Exception unused) {
                arrayListM506g = null;
            }
            if (arrayListM506g == null) {
                return;
            }
            C0815s3.m1887i0(arrayListM506g, new C0168J3(str, 0));
            JSONArray jSONArray = new JSONArray();
            Iterator it = arrayListM506g.iterator();
            while (it.hasNext()) {
                jSONArray.put(((MaskItemBean) it.next()).toJSONObject());
            }
            String string = jSONArray.toString();
            C0186K3.f638a.getClass();
            m509j().edit().putString(C0186K3.f639b, string).commit();
            C0186K3.f648k = new ArrayList<>(arrayListM506g);
            C0186K3.f649l = Boolean.valueOf(arrayListM506g.isEmpty());
            m512m();
        }

        /* JADX INFO: renamed from: p */
        public static void m515p(C0638ig c0638ig) {
            try {
                if (m509j().contains("version_initial_snapshot")) {
                    return;
                }
                m509j().edit().putString("version_initial_snapshot", c0638ig.m1498b().toString()).apply();
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: q */
        public static void m516q(C0638ig c0638ig) {
            try {
                m509j().edit().putString("version_latest_snapshot", c0638ig.m1498b().toString()).apply();
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: renamed from: r */
        public static void m517r(Set set) {
            try {
                m509j().edit().putString(C0186K3.f642e, new JSONArray((Collection) C0834t3.m1959w0(set)).toString()).commit();
            } catch (Exception e) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"setHiddenOwnSnsIds fail", e}, 2));
            }
        }

        /* JADX INFO: renamed from: s */
        public static void m518s(List list) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                jSONArray.put(((MaskItemBean) it.next()).toJSONObject());
            }
            String string = jSONArray.toString();
            C0186K3.f638a.getClass();
            m509j().edit().putString(C0186K3.f639b, string).commit();
            C0186K3.f648k = new ArrayList<>(list);
            C0186K3.f649l = Boolean.valueOf(list.isEmpty());
            m512m();
        }

        /* JADX INFO: renamed from: t */
        public static void m519t(C0653jc c0653jc) {
            C0631i9.m1482e(c0653jc, "data");
            try {
                C0186K3.f647j = c0653jc;
                String strM1518b = C0653jc.a.m1518b(c0653jc);
                SharedPreferences.Editor editorEdit = m507h().edit();
                String str = C0186K3.f640c;
                boolean zCommit = editorEdit.putString(str, strM1518b).commit();
                m509j().edit().putString(str, strM1518b).commit();
                if (!zCommit) {
                    C0908x1.m2197e(Arrays.copyOf(new Object[]{"setOptionData: optSp commit returned false — disk may be full or write failed"}, 1));
                }
                Log.d("Floatingclouds_Config", "setOptionData committed ok=" + zCommit + " len=" + strM1518b.length());
            } catch (Exception e) {
                C0908x1.m2197e(Arrays.copyOf(new Object[]{"save option fail", e}, 2));
            }
        }
    }

    /* JADX INFO: renamed from: a.K3$b */
    public interface b {
        void onConfigChange();
    }
}
