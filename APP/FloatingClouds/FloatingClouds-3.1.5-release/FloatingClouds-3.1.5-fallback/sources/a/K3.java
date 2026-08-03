package a;

/* JADX INFO: loaded from: classes.dex */
public final class K3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a.K3.a f148a = null;
    public static final java.lang.String b = null;
    public static final java.lang.String c = null;
    public static final java.lang.String d = null;
    public static final java.lang.String e = null;
    public static final java.lang.String f = null;
    public static final java.lang.String g = null;
    public static final a.Me h = null;
    public static final a.Me i = null;
    public static volatile a.C0213jc j;
    public static volatile java.util.ArrayList<top.mmjz.floatingclouds.bean.MaskItemBean> k;
    public static volatile java.lang.Boolean l;
    public static final java.util.ArrayList<a.K3.b> m = null;

    public static final class a {
        public static void a(top.mmjz.floatingclouds.bean.MaskItemBean r3) {
                java.util.ArrayList r0 = g()     // Catch: java.lang.Exception -> L5
                goto L17
            L5:
                r0 = move-exception
                java.lang.String r1 = r3.toJson()
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
                r1 = 2
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                a.C0453x1.a(r0)
                r0 = 0
            L17:
                if (r0 != 0) goto L1a
                return
            L1a:
                r0.add(r3)
                org.json.JSONArray r3 = new org.json.JSONArray
                r3.<init>()
                java.util.Iterator r1 = r0.iterator()
            L26:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L3a
                java.lang.Object r2 = r1.next()
                top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
                org.json.JSONObject r2 = r2.toJSONObject()
                r3.put(r2)
                goto L26
            L3a:
                java.lang.String r3 = r3.toString()
                a.K3$a r1 = a.K3.f148a
                r1.getClass()
                android.content.SharedPreferences r1 = j()
                android.content.SharedPreferences$Editor r1 = r1.edit()
                java.lang.String r2 = a.K3.b
                android.content.SharedPreferences$Editor r3 = r1.putString(r2, r3)
                r3.commit()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r0)
                a.K3.k = r3
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                a.K3.l = r3
                m()
                return
        }

        public static java.io.File b(java.lang.String r7) {
                android.content.Context r0 = a.C0435w1.p
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                android.content.pm.ApplicationInfo r2 = r0.getApplicationInfo()
                java.lang.String r2 = r2.dataDir
                java.io.File r3 = r0.getDataDir()
                if (r3 == 0) goto L17
                java.lang.String r3 = r3.getAbsolutePath()
                goto L18
            L17:
                r3 = r1
            L18:
                java.io.File r0 = r0.getFilesDir()
                if (r0 == 0) goto L29
                java.io.File r0 = r0.getParentFile()
                if (r0 == 0) goto L29
                java.lang.String r0 = r0.getAbsolutePath()
                goto L2a
            L29:
                r0 = r1
            L2a:
                java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0}
                java.util.List r0 = a.C0294o3.d0(r0)
                java.util.ArrayList r2 = new java.util.ArrayList
                r2.<init>()
                java.util.Iterator r0 = r0.iterator()
            L3b:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L4b
                java.lang.Object r3 = r0.next()
                if (r3 == 0) goto L3b
                r2.add(r3)
                goto L3b
            L4b:
                java.util.ArrayList r0 = new java.util.ArrayList
                r3 = 10
                int r4 = a.C0312p3.g0(r2, r3)
                r0.<init>(r4)
                java.util.Iterator r2 = r2.iterator()
            L5a:
                boolean r4 = r2.hasNext()
                if (r4 == 0) goto L71
                java.lang.Object r4 = r2.next()
                java.lang.String r4 = (java.lang.String) r4
                java.io.File r5 = new java.io.File
                java.lang.String r6 = "shared_prefs"
                r5.<init>(r4, r6)
                r0.add(r5)
                goto L5a
            L71:
                java.util.ArrayList r2 = new java.util.ArrayList
                int r3 = a.C0312p3.g0(r0, r3)
                r2.<init>(r3)
                java.util.Iterator r0 = r0.iterator()
            L7e:
                boolean r3 = r0.hasNext()
                if (r3 == 0) goto L99
                java.lang.Object r3 = r0.next()
                java.io.File r3 = (java.io.File) r3
                java.io.File r4 = new java.io.File
                java.lang.String r5 = ".xml"
                java.lang.String r5 = r7.concat(r5)
                r4.<init>(r3, r5)
                r2.add(r4)
                goto L7e
            L99:
                java.util.Iterator r7 = r2.iterator()
            L9d:
                boolean r0 = r7.hasNext()
                if (r0 == 0) goto Lb1
                java.lang.Object r0 = r7.next()
                r2 = r0
                java.io.File r2 = (java.io.File) r2
                boolean r2 = r2.exists()
                if (r2 == 0) goto L9d
                r1 = r0
            Lb1:
                java.io.File r1 = (java.io.File) r1
                return r1
        }

        public static java.util.LinkedHashSet c() {
                java.lang.String r0 = "[]"
                android.content.SharedPreferences r1 = j()     // Catch: java.lang.Exception -> L39
                java.lang.String r2 = a.K3.e     // Catch: java.lang.Exception -> L39
                java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Exception -> L39
                if (r1 != 0) goto Lf
                goto L10
            Lf:
                r0 = r1
            L10:
                org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Exception -> L39
                r1.<init>(r0)     // Catch: java.lang.Exception -> L39
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet     // Catch: java.lang.Exception -> L39
                r0.<init>()     // Catch: java.lang.Exception -> L39
                int r2 = r1.length()     // Catch: java.lang.Exception -> L39
                r3 = 0
            L1f:
                if (r3 >= r2) goto L38
                java.lang.String r4 = r1.optString(r3)     // Catch: java.lang.Exception -> L39
                a.C0193i9.b(r4)     // Catch: java.lang.Exception -> L39
                boolean r5 = a.Be.P(r4)     // Catch: java.lang.Exception -> L39
                if (r5 != 0) goto L2f
                goto L30
            L2f:
                r4 = 0
            L30:
                if (r4 == 0) goto L35
                r0.add(r4)     // Catch: java.lang.Exception -> L39
            L35:
                int r3 = r3 + 1
                goto L1f
            L38:
                return r0
            L39:
                r0 = move-exception
                java.lang.String r1 = "getHiddenOwnSnsIds fail"
                java.lang.Object[] r0 = new java.lang.Object[]{r1, r0}
                r1 = 2
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                a.C0453x1.e(r0)
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                return r0
        }

        public static a.C0199ig d() {
                r0 = 0
                android.content.SharedPreferences r1 = j()     // Catch: java.lang.Throwable -> L17
                java.lang.String r2 = "version_initial_snapshot"
                java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto Le
                goto L17
            Le:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L17
                a.ig r0 = a.C0199ig.a.a(r2)     // Catch: java.lang.Throwable -> L17
            L17:
                return r0
        }

        public static a.C0199ig e() {
                r0 = 0
                android.content.SharedPreferences r1 = j()     // Catch: java.lang.Throwable -> L17
                java.lang.String r2 = "version_latest_snapshot"
                java.lang.String r1 = r1.getString(r2, r0)     // Catch: java.lang.Throwable -> L17
                if (r1 != 0) goto Le
                goto L17
            Le:
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L17
                r2.<init>(r1)     // Catch: java.lang.Throwable -> L17
                a.ig r0 = a.C0199ig.a.a(r2)     // Catch: java.lang.Throwable -> L17
            L17:
                return r0
        }

        public static java.util.ArrayList f() {
                java.util.ArrayList<top.mmjz.floatingclouds.bean.MaskItemBean> r0 = a.K3.k
                if (r0 == 0) goto L5
                return r0
            L5:
                java.util.ArrayList r0 = g()     // Catch: java.lang.Throwable -> La
                goto L1c
            La:
                r0 = move-exception
                java.lang.Object[] r0 = new java.lang.Object[]{r0}
                r1 = 1
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                a.C0453x1.a(r0)
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
            L1c:
                a.K3.k = r0
                boolean r1 = r0.isEmpty()
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
                a.K3.l = r1
                return r0
        }

        public static java.util.ArrayList g() {
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                android.content.SharedPreferences r1 = j()     // Catch: java.lang.Exception -> L4d
                java.lang.String r2 = a.K3.b     // Catch: java.lang.Exception -> L4d
                java.lang.String r3 = "[]"
                java.lang.String r1 = r1.getString(r2, r3)     // Catch: java.lang.Exception -> L4d
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L4d
                r2.<init>(r1)     // Catch: java.lang.Exception -> L4d
                int r1 = r2.length()     // Catch: java.lang.Exception -> L4d
                r3 = 0
                r4 = r3
            L1c:
                r5 = 1
                if (r3 >= r1) goto L66
                java.lang.String r6 = r2.optString(r3)     // Catch: java.lang.Exception -> L4d
                if (r6 == 0) goto L63
                boolean r7 = a.Be.P(r6)     // Catch: java.lang.Exception -> L4d
                if (r7 == 0) goto L2c
                goto L63
            L2c:
                top.mmjz.floatingclouds.bean.MaskItemBean$a r7 = top.mmjz.floatingclouds.bean.MaskItemBean.Companion     // Catch: java.lang.Exception -> L4d
                r7.getClass()     // Catch: java.lang.Exception -> L4d
                top.mmjz.floatingclouds.bean.MaskItemBean r6 = top.mmjz.floatingclouds.bean.MaskItemBean.a.a(r6)     // Catch: java.lang.Exception -> L4d
                java.lang.String r7 = r6.getMaskId()     // Catch: java.lang.Exception -> L4d
                boolean r7 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Exception -> L4d
                if (r7 == 0) goto L40
                goto L63
            L40:
                java.lang.String r7 = r6.getMapId()     // Catch: java.lang.Exception -> L4d
                if (r7 == 0) goto L4f
                boolean r7 = a.Be.P(r7)     // Catch: java.lang.Exception -> L4d
                if (r7 == 0) goto L55
                goto L4f
            L4d:
                r1 = move-exception
                goto L79
            L4f:
                java.lang.String r4 = "filehelper"
                r6.setMapId(r4)     // Catch: java.lang.Exception -> L4d
                r4 = r5
            L55:
                java.lang.String r5 = r6.getMaskId()     // Catch: java.lang.Exception -> L4d
                boolean r5 = a.Be.P(r5)     // Catch: java.lang.Exception -> L4d
                if (r5 == 0) goto L60
                goto L63
            L60:
                r0.add(r6)     // Catch: java.lang.Exception -> L4d
            L63:
                int r3 = r3 + 1
                goto L1c
            L66:
                if (r4 == 0) goto L87
                java.lang.String r1 = "ConfigUtil: sanitized empty mapId, persisting default"
                java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Exception -> L4d
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r5)     // Catch: java.lang.Exception -> L4d
                a.C0453x1.e(r1)     // Catch: java.lang.Exception -> L4d
                s(r0)     // Catch: java.lang.Exception -> L4d
                return r0
            L79:
                java.lang.String r2 = "getMaskList fail"
                java.lang.Object[] r1 = new java.lang.Object[]{r2, r1}
                r2 = 2
                java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
                a.C0453x1.e(r1)
            L87:
                return r0
        }

        public static android.content.SharedPreferences h() {
                a.Me r0 = a.K3.i
                java.lang.Object r0 = r0.a()
                android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
                return r0
        }

        public static a.C0213jc i() {
                a.jc r0 = a.K3.j
                if (r0 == 0) goto L5
                return r0
            L5:
                n()
                a.jc r0 = a.K3.j
                if (r0 == 0) goto Ld
                return r0
            Ld:
                android.content.SharedPreferences r0 = j()
                java.lang.String r1 = a.K3.c
                r2 = 0
                java.lang.String r0 = r0.getString(r1, r2)
                java.lang.String r3 = "{}"
                if (r0 == 0) goto L5f
                boolean r4 = a.Be.P(r0)
                if (r4 == 0) goto L23
                goto L5f
            L23:
                boolean r4 = r0.equals(r3)
                if (r4 != 0) goto L5f
                a.jc r3 = a.C0213jc.a.a(r0)
                android.content.SharedPreferences r4 = h()
                android.content.SharedPreferences$Editor r4 = r4.edit()
                android.content.SharedPreferences$Editor r0 = r4.putString(r1, r0)
                r0.commit()
                a.K3.j = r3
                boolean r0 = r3.L
                int r1 = android.os.Process.myPid()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                java.lang.String r5 = "getOptionData migrated from legacy file: masterEnabled="
                r4.<init>(r5)
                r4.append(r0)
                java.lang.String r0 = " pid="
                r4.append(r0)
                r4.append(r1)
                java.lang.String r0 = r4.toString()
                r1 = 4
                a.C0453x1.d(r1, r0, r2)
                return r3
            L5f:
                a.jc r0 = a.C0213jc.a.a(r3)
                a.K3.j = r0
                return r0
        }

        public static android.content.SharedPreferences j() {
                a.Me r0 = a.K3.h
                java.lang.Object r0 = r0.a()
                android.content.SharedPreferences r0 = (android.content.SharedPreferences) r0
                return r0
        }

        public static boolean k() {
                android.content.SharedPreferences r0 = j()
                java.lang.String r1 = a.K3.d
                r2 = 0
                boolean r0 = r0.getBoolean(r1, r2)
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                java.lang.String r2 = "ConfigModeFlag read: "
                r1.<init>(r2)
                r1.append(r0)
                java.lang.String r1 = r1.toString()
                java.lang.Object[] r1 = new java.lang.Object[]{r1}
                a.C0282n9.m(r1)
                return r0
        }

        public static boolean l() {
                a.jc r0 = i()
                boolean r0 = r0.L
                if (r0 == 0) goto L10
                java.lang.String[] r0 = a.Yc.f358a
                boolean r0 = a.Yc.b
                if (r0 != 0) goto L10
                r0 = 1
                return r0
            L10:
                r0 = 0
                return r0
        }

        public static void m() {
                java.util.ArrayList<a.K3$b> r0 = a.K3.m
                java.util.Iterator r0 = r0.iterator()
            L6:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L16
                java.lang.Object r1 = r0.next()
                a.K3$b r1 = (a.K3.b) r1
                r1.onConfigChange()
                goto L6
            L16:
                return
        }

        public static void n() {
                java.lang.String r0 = "reloadConfigFromDisk OK (new="
                java.lang.String r1 = "reloadConfigFromDisk: <string name=\"options\"> not found in XML (new="
                java.lang.String r2 = "reloadConfigFromDisk: no SP file found, pid="
                java.lang.String r3 = "fc_options"
                java.io.File r3 = b(r3)     // Catch: java.lang.Exception -> L10f
                if (r3 != 0) goto L14
                java.lang.String r3 = "mask_wechat_options"
                java.io.File r3 = b(r3)     // Catch: java.lang.Exception -> L10f
            L14:
                r4 = 0
                r5 = 1
                if (r3 != 0) goto L28
                java.lang.String r3 = "fc_config"
                java.io.File r3 = b(r3)     // Catch: java.lang.Exception -> L10f
                if (r3 != 0) goto L26
                java.lang.String r3 = "mask_wechat_config"
                java.io.File r3 = b(r3)     // Catch: java.lang.Exception -> L10f
            L26:
                r6 = r4
                goto L29
            L28:
                r6 = r5
            L29:
                r7 = 3
                r8 = 0
                if (r3 != 0) goto L41
                int r0 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L10f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10f
                r1.<init>(r2)     // Catch: java.lang.Exception -> L10f
                r1.append(r0)     // Catch: java.lang.Exception -> L10f
                java.lang.String r0 = r1.toString()     // Catch: java.lang.Exception -> L10f
                a.C0453x1.d(r7, r0, r8)     // Catch: java.lang.Exception -> L10f
                return
            L41:
                java.lang.String r2 = a.C0435w1.T(r3)     // Catch: java.lang.Exception -> L10f
                java.lang.String r3 = "<string name=\"options\">(.*?)</string>"
                r9 = 32
                java.util.regex.Pattern r3 = java.util.regex.Pattern.compile(r3, r9)     // Catch: java.lang.Exception -> L10f
                java.lang.String r9 = "compile(...)"
                a.C0193i9.d(r3, r9)     // Catch: java.lang.Exception -> L10f
                java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch: java.lang.Exception -> L10f
                java.lang.String r9 = "matcher(...)"
                a.C0193i9.d(r3, r9)     // Catch: java.lang.Exception -> L10f
                boolean r4 = r3.find(r4)     // Catch: java.lang.Exception -> L10f
                if (r4 != 0) goto L63
                r4 = r8
                goto L68
            L63:
                a.Z7 r4 = new a.Z7     // Catch: java.lang.Exception -> L10f
                r4.<init>(r3, r2)     // Catch: java.lang.Exception -> L10f
            L68:
                if (r4 != 0) goto L7f
                java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10f
                r0.<init>(r1)     // Catch: java.lang.Exception -> L10f
                r0.append(r6)     // Catch: java.lang.Exception -> L10f
                java.lang.String r1 = ")"
                r0.append(r1)     // Catch: java.lang.Exception -> L10f
                java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L10f
                a.C0453x1.d(r7, r0, r8)     // Catch: java.lang.Exception -> L10f
                return
            L7f:
                java.lang.Object r1 = r4.b     // Catch: java.lang.Exception -> L10f
                a.xa r1 = (a.C0462xa) r1     // Catch: java.lang.Exception -> L10f
                if (r1 != 0) goto L8c
                a.xa r1 = new a.xa     // Catch: java.lang.Exception -> L10f
                r1.<init>(r4)     // Catch: java.lang.Exception -> L10f
                r4.b = r1     // Catch: java.lang.Exception -> L10f
            L8c:
                java.lang.Object r1 = r4.b     // Catch: java.lang.Exception -> L10f
                a.xa r1 = (a.C0462xa) r1     // Catch: java.lang.Exception -> L10f
                a.C0193i9.b(r1)     // Catch: java.lang.Exception -> L10f
                java.lang.Object r1 = r1.get(r5)     // Catch: java.lang.Exception -> L10f
                java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L10f
                java.lang.String r2 = "&quot;"
                java.lang.String r3 = "\""
                java.lang.String r1 = a.Ae.G(r1, r2, r3)     // Catch: java.lang.Exception -> L10f
                java.lang.String r2 = "&lt;"
                java.lang.String r3 = "<"
                java.lang.String r1 = a.Ae.G(r1, r2, r3)     // Catch: java.lang.Exception -> L10f
                java.lang.String r2 = "&gt;"
                java.lang.String r3 = ">"
                java.lang.String r1 = a.Ae.G(r1, r2, r3)     // Catch: java.lang.Exception -> L10f
                java.lang.String r2 = "&amp;"
                java.lang.String r3 = "&"
                java.lang.String r1 = a.Ae.G(r1, r2, r3)     // Catch: java.lang.Exception -> L10f
                a.jc r2 = a.C0213jc.a.a(r1)     // Catch: java.lang.Exception -> L10f
                a.K3.j = r2     // Catch: java.lang.Exception -> L10f
                if (r6 != 0) goto Ld2
                android.content.SharedPreferences r3 = h()     // Catch: java.lang.Exception -> L10f
                android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Exception -> L10f
                java.lang.String r4 = a.K3.c     // Catch: java.lang.Exception -> L10f
                android.content.SharedPreferences$Editor r3 = r3.putString(r4, r1)     // Catch: java.lang.Exception -> L10f
                r3.commit()     // Catch: java.lang.Exception -> L10f
            Ld2:
                int r1 = r1.length()     // Catch: java.lang.Exception -> L10f
                boolean r3 = r2.L     // Catch: java.lang.Exception -> L10f
                boolean r2 = r2.n     // Catch: java.lang.Exception -> L10f
                int r4 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L10f
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L10f
                r5.<init>(r0)     // Catch: java.lang.Exception -> L10f
                r5.append(r6)     // Catch: java.lang.Exception -> L10f
                java.lang.String r0 = "): len="
                r5.append(r0)     // Catch: java.lang.Exception -> L10f
                r5.append(r1)     // Catch: java.lang.Exception -> L10f
                java.lang.String r0 = " masterEnabled="
                r5.append(r0)     // Catch: java.lang.Exception -> L10f
                r5.append(r3)     // Catch: java.lang.Exception -> L10f
                java.lang.String r0 = " hideMainConvList="
                r5.append(r0)     // Catch: java.lang.Exception -> L10f
                r5.append(r2)     // Catch: java.lang.Exception -> L10f
                java.lang.String r0 = " pid="
                r5.append(r0)     // Catch: java.lang.Exception -> L10f
                r5.append(r4)     // Catch: java.lang.Exception -> L10f
                java.lang.String r0 = r5.toString()     // Catch: java.lang.Exception -> L10f
                r1 = 4
                a.C0453x1.d(r1, r0, r8)     // Catch: java.lang.Exception -> L10f
                return
            L10f:
                r0 = move-exception
                r1 = 5
                java.lang.String r2 = "reloadConfigFromDisk failed"
                a.C0453x1.d(r1, r2, r0)
                return
        }

        public static void o(java.lang.String r3) {
                java.lang.String r0 = "wxid"
                a.C0193i9.e(r3, r0)
                java.util.ArrayList r0 = g()     // Catch: java.lang.Exception -> La
                goto Lb
            La:
                r0 = 0
            Lb:
                if (r0 != 0) goto Le
                return
            Le:
                a.J3 r1 = new a.J3
                r2 = 0
                r1.<init>(r3, r2)
                a.C0365s3.i0(r0, r1)
                org.json.JSONArray r3 = new org.json.JSONArray
                r3.<init>()
                java.util.Iterator r1 = r0.iterator()
            L20:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L34
                java.lang.Object r2 = r1.next()
                top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
                org.json.JSONObject r2 = r2.toJSONObject()
                r3.put(r2)
                goto L20
            L34:
                java.lang.String r3 = r3.toString()
                a.K3$a r1 = a.K3.f148a
                r1.getClass()
                android.content.SharedPreferences r1 = j()
                android.content.SharedPreferences$Editor r1 = r1.edit()
                java.lang.String r2 = a.K3.b
                android.content.SharedPreferences$Editor r3 = r1.putString(r2, r3)
                r3.commit()
                java.util.ArrayList r3 = new java.util.ArrayList
                r3.<init>(r0)
                a.K3.k = r3
                boolean r3 = r0.isEmpty()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                a.K3.l = r3
                m()
                return
        }

        public static void p(a.C0199ig r2) {
                java.lang.String r0 = "version_initial_snapshot"
                android.content.SharedPreferences r1 = j()     // Catch: java.lang.Throwable -> L24
                boolean r1 = r1.contains(r0)     // Catch: java.lang.Throwable -> L24
                if (r1 == 0) goto Ld
                goto L24
            Ld:
                android.content.SharedPreferences r1 = j()     // Catch: java.lang.Throwable -> L24
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Throwable -> L24
                org.json.JSONObject r2 = r2.b()     // Catch: java.lang.Throwable -> L24
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L24
                android.content.SharedPreferences$Editor r2 = r1.putString(r0, r2)     // Catch: java.lang.Throwable -> L24
                r2.apply()     // Catch: java.lang.Throwable -> L24
            L24:
                return
        }

        public static void q(a.C0199ig r2) {
                android.content.SharedPreferences r0 = j()     // Catch: java.lang.Throwable -> L19
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Throwable -> L19
                java.lang.String r1 = "version_latest_snapshot"
                org.json.JSONObject r2 = r2.b()     // Catch: java.lang.Throwable -> L19
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19
                android.content.SharedPreferences$Editor r2 = r0.putString(r1, r2)     // Catch: java.lang.Throwable -> L19
                r2.apply()     // Catch: java.lang.Throwable -> L19
            L19:
                return
        }

        public static void r(java.util.Set r3) {
                android.content.SharedPreferences r0 = j()     // Catch: java.lang.Exception -> L1f
                android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch: java.lang.Exception -> L1f
                java.lang.String r1 = a.K3.e     // Catch: java.lang.Exception -> L1f
                org.json.JSONArray r2 = new org.json.JSONArray     // Catch: java.lang.Exception -> L1f
                java.util.List r3 = a.C0383t3.w0(r3)     // Catch: java.lang.Exception -> L1f
                r2.<init>(r3)     // Catch: java.lang.Exception -> L1f
                java.lang.String r3 = r2.toString()     // Catch: java.lang.Exception -> L1f
                android.content.SharedPreferences$Editor r3 = r0.putString(r1, r3)     // Catch: java.lang.Exception -> L1f
                r3.commit()     // Catch: java.lang.Exception -> L1f
                return
            L1f:
                r3 = move-exception
                java.lang.String r0 = "setHiddenOwnSnsIds fail"
                java.lang.Object[] r3 = new java.lang.Object[]{r0, r3}
                r0 = 2
                java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
                a.C0453x1.e(r3)
                return
        }

        public static void s(java.util.List r3) {
                org.json.JSONArray r0 = new org.json.JSONArray
                r0.<init>()
                java.util.Iterator r1 = r3.iterator()
            L9:
                boolean r2 = r1.hasNext()
                if (r2 == 0) goto L1d
                java.lang.Object r2 = r1.next()
                top.mmjz.floatingclouds.bean.MaskItemBean r2 = (top.mmjz.floatingclouds.bean.MaskItemBean) r2
                org.json.JSONObject r2 = r2.toJSONObject()
                r0.put(r2)
                goto L9
            L1d:
                java.lang.String r0 = r0.toString()
                a.K3$a r1 = a.K3.f148a
                r1.getClass()
                android.content.SharedPreferences r1 = j()
                android.content.SharedPreferences$Editor r1 = r1.edit()
                java.lang.String r2 = a.K3.b
                android.content.SharedPreferences$Editor r0 = r1.putString(r2, r0)
                r0.commit()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                a.K3.k = r0
                boolean r3 = r3.isEmpty()
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
                a.K3.l = r3
                m()
                return
        }

        public static void t(a.C0213jc r4) {
                java.lang.String r0 = "setOptionData committed ok="
                java.lang.String r1 = "data"
                a.C0193i9.e(r4, r1)
                a.K3.j = r4     // Catch: java.lang.Exception -> L5c
                java.lang.String r4 = a.C0213jc.a.b(r4)     // Catch: java.lang.Exception -> L5c
                android.content.SharedPreferences r1 = h()     // Catch: java.lang.Exception -> L5c
                android.content.SharedPreferences$Editor r1 = r1.edit()     // Catch: java.lang.Exception -> L5c
                java.lang.String r2 = a.K3.c     // Catch: java.lang.Exception -> L5c
                android.content.SharedPreferences$Editor r1 = r1.putString(r2, r4)     // Catch: java.lang.Exception -> L5c
                boolean r1 = r1.commit()     // Catch: java.lang.Exception -> L5c
                android.content.SharedPreferences r3 = j()     // Catch: java.lang.Exception -> L5c
                android.content.SharedPreferences$Editor r3 = r3.edit()     // Catch: java.lang.Exception -> L5c
                android.content.SharedPreferences$Editor r2 = r3.putString(r2, r4)     // Catch: java.lang.Exception -> L5c
                r2.commit()     // Catch: java.lang.Exception -> L5c
                if (r1 != 0) goto L3e
                java.lang.String r2 = "setOptionData: optSp commit returned false — disk may be full or write failed"
                java.lang.Object[] r2 = new java.lang.Object[]{r2}     // Catch: java.lang.Exception -> L5c
                r3 = 1
                java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r3)     // Catch: java.lang.Exception -> L5c
                a.C0453x1.e(r2)     // Catch: java.lang.Exception -> L5c
            L3e:
                java.lang.String r2 = "Floatingclouds_Config"
                int r4 = r4.length()     // Catch: java.lang.Exception -> L5c
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L5c
                r3.<init>(r0)     // Catch: java.lang.Exception -> L5c
                r3.append(r1)     // Catch: java.lang.Exception -> L5c
                java.lang.String r0 = " len="
                r3.append(r0)     // Catch: java.lang.Exception -> L5c
                r3.append(r4)     // Catch: java.lang.Exception -> L5c
                java.lang.String r4 = r3.toString()     // Catch: java.lang.Exception -> L5c
                android.util.Log.d(r2, r4)     // Catch: java.lang.Exception -> L5c
                return
            L5c:
                r4 = move-exception
                java.lang.String r0 = "save option fail"
                java.lang.Object[] r4 = new java.lang.Object[]{r0, r4}
                r0 = 2
                java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r0)
                a.C0453x1.e(r4)
                return
        }
    }

    public interface b {
        void onConfigChange();
    }

    static {
            a.K3$a r0 = new a.K3$a
            r0.<init>()
            a.K3.f148a = r0
            java.lang.String r0 = "maskList"
            a.K3.b = r0
            java.lang.String r0 = "options"
            a.K3.c = r0
            java.lang.String r0 = "config_mode_flag"
            a.K3.d = r0
            java.lang.String r0 = "hiddenOwnSnsIds"
            a.K3.e = r0
            java.lang.String r0 = "blockHotUpdate_reminder_acked"
            a.K3.f = r0
            java.lang.String r0 = "migration_guard"
            a.K3.g = r0
            a.w3 r0 = new a.w3
            r1 = 1
            r0.<init>(r1)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            a.K3.h = r1
            a.w3 r0 = new a.w3
            r1 = 2
            r0.<init>(r1)
            a.Me r1 = new a.Me
            r1.<init>(r0)
            a.K3.i = r1
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            a.K3.m = r0
            return
    }
}
