package p155ka;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import gg.AbstractC1416l;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import okhttp3.HttpUrl;
import okio.C3193a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.AbstractC0000a;
import p025bc.AbstractC0255e;
import p036c9.ThreadFactoryC0478q;
import p068eh.AbstractC0921a;
import p096g8.C1363d;
import p096g8.C1368i;
import p099h.Hchat.hooks.api.core.WeChatApis;
import p099h.Hchat.hooks.api.model.WeChatContact;
import p126ia.C2026t;
import p129ig.AbstractC2043a;
import p136j8.AbstractC2091b;
import p136j8.C2105p;
import p136j8.C2114y;
import p153k8.C2341e;
import p153k8.C2343g;
import p218og.AbstractC3137a;
import p218og.AbstractC3149m;
import p218og.AbstractC3156t;
import p222p.AbstractC3199a;
import p276sf.C3958e;
import p276sf.C3959f;
import p276sf.C3960g;
import p332wb.AbstractC4855en;
import tf.AbstractC4166m;
import tf.AbstractC4167n;
import tf.AbstractC4178y;

/* JADX INFO: renamed from: ka.f */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C2380f {

    /* JADX INFO: renamed from: f */
    public static final List f7820f = AbstractC0000a.m101y0(".mp3", ".m4a", ".mp4", ".flac", ".ogg", ".wav");

    /* JADX INFO: renamed from: a */
    public final C2026t f7821a;

    /* JADX INFO: renamed from: b */
    public final Context f7822b;

    /* JADX INFO: renamed from: c */
    public final C2381g f7823c;

    /* JADX INFO: renamed from: d */
    public final C2375a f7824d;

    /* JADX INFO: renamed from: e */
    public final ExecutorService f7825e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C2380f(Context context, C2026t c2026t) {
        this.f7821a = c2026t;
        Context applicationContext = context.getApplicationContext();
        this.f7822b = applicationContext == null ? context : applicationContext;
        this.f7823c = new C2381g(context);
        this.f7824d = new C2375a();
        this.f7825e = Executors.newSingleThreadExecutor(new ThreadFactoryC0478q(19));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static void m5694a(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        file.deleteOnExit();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: e */
    public static void m5695e(long j3, String str, String str2) {
        C2343g c2343gM6844q = AbstractC3199a.m6844q();
        if (c2343gM6844q != null) {
            if (j3 <= 0 || !c2343gM6844q.m5598u(j3, str, str2)) {
                c2343gM6844q.m5601x(str, str2);
            }
        }
    }

    /* JADX DEBUG: Another duplicated slice has different insns count: {[]}, finally: {[THROW, INVOKE, MOVE_EXCEPTION, THROW, MOVE_EXCEPTION] complete} */
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x014e  */
    /* JADX INFO: renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean m5696b(File file, File file2, String str) {
        Object c3959f;
        HttpURLConnection httpURLConnection;
        Throwable thM8182b;
        int responseCode;
        InputStream inputStream;
        boolean z9;
        boolean z10;
        String strExtractMetadata;
        Long lM6743g0;
        boolean z11 = false;
        if (AbstractC3149m.m6721t0(str)) {
            return false;
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
            uRLConnectionOpenConnection.getClass();
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setConnectTimeout(15000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setInstanceFollowRedirects(true);
            httpURLConnection.setRequestProperty("User-Agent", "MicroMessenger Client");
            httpURLConnection.setRequestProperty("Referer", "https://y.qq.com/");
            responseCode = httpURLConnection.getResponseCode();
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            c3959f = new C3959f(th);
            httpURLConnection = httpURLConnection2;
            thM8182b = C3960g.m8182b(c3959f);
            if (thM8182b != null) {
            }
            Boolean bool = Boolean.FALSE;
            if (c3959f instanceof C3959f) {
            }
            Boolean bool2 = (Boolean) c3959f;
            if (httpURLConnection != null) {
            }
            return bool2.booleanValue();
        }
        if (200 <= responseCode && responseCode < 300) {
            String contentType = httpURLConnection.getContentType();
            if (contentType == null) {
                contentType = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            String lowerCase = AbstractC3149m.m6698M0(contentType, ';').toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            if (!AbstractC3156t.m6740d0(lowerCase, "text/", false) && !AbstractC3149m.m6709h0(lowerCase, "json", false) && !AbstractC3149m.m6709h0(lowerCase, "xml", false) && httpURLConnection.getContentLengthLong() <= 134217728 && (inputStream = httpURLConnection.getInputStream()) != null) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(file, false);
                    try {
                        byte[] bArr = new byte[8192];
                        long j3 = 0;
                        while (true) {
                            int i9 = inputStream.read(bArr);
                            if (i9 < 0) {
                                z9 = false;
                                break;
                            }
                            j3 += (long) i9;
                            if (j3 > 134217728) {
                                z9 = true;
                                break;
                            }
                            fileOutputStream.write(bArr, 0, i9);
                        }
                        fileOutputStream.flush();
                        fileOutputStream.close();
                        inputStream.close();
                        if (!z9 && file.isFile() && file.length() > 0 && ((!file2.exists() || file2.delete()) && file.renameTo(file2) && file2.isFile() && file2.length() > 0)) {
                            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                            try {
                                try {
                                    mediaMetadataRetriever.setDataSource(file2.getAbsolutePath());
                                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(9);
                                } catch (Throwable unused) {
                                    z10 = false;
                                    if (z10) {
                                    }
                                    c3959f = Boolean.valueOf(z11);
                                    thM8182b = C3960g.m8182b(c3959f);
                                    if (thM8182b != null) {
                                    }
                                    Boolean bool3 = Boolean.FALSE;
                                    if (c3959f instanceof C3959f) {
                                    }
                                    Boolean bool22 = (Boolean) c3959f;
                                    if (httpURLConnection != null) {
                                    }
                                    return bool22.booleanValue();
                                }
                            } catch (Throwable unused2) {
                                mediaMetadataRetriever.release();
                                z10 = false;
                                if (z10) {
                                }
                                c3959f = Boolean.valueOf(z11);
                                thM8182b = C3960g.m8182b(c3959f);
                                if (thM8182b != null) {
                                }
                                Boolean bool32 = Boolean.FALSE;
                                if (c3959f instanceof C3959f) {
                                }
                                Boolean bool222 = (Boolean) c3959f;
                                if (httpURLConnection != null) {
                                }
                                return bool222.booleanValue();
                            }
                            if (strExtractMetadata == null || (lM6743g0 = AbstractC3156t.m6743g0(strExtractMetadata)) == null) {
                                z10 = false;
                                try {
                                    mediaMetadataRetriever.release();
                                } catch (Throwable unused3) {
                                }
                                if (z10) {
                                    z11 = true;
                                }
                            } else {
                                if (lM6743g0.longValue() > 0) {
                                    z10 = true;
                                }
                                mediaMetadataRetriever.release();
                                if (z10) {
                                }
                            }
                            thM8182b = C3960g.m8182b(c3959f);
                            if (thM8182b != null) {
                                this.f7821a.invoke("QQ点歌歌曲音频下载失败", thM8182b);
                            }
                            Boolean bool322 = Boolean.FALSE;
                            if (c3959f instanceof C3959f) {
                                c3959f = bool322;
                            }
                            Boolean bool2222 = (Boolean) c3959f;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            return bool2222.booleanValue();
                        }
                    } finally {
                    }
                } finally {
                }
            }
        }
        c3959f = Boolean.valueOf(z11);
        thM8182b = C3960g.m8182b(c3959f);
        if (thM8182b != null) {
        }
        Boolean bool3222 = Boolean.FALSE;
        if (c3959f instanceof C3959f) {
        }
        Boolean bool22222 = (Boolean) c3959f;
        if (httpURLConnection != null) {
        }
        return bool22222.booleanValue();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c */
    public final C2378d m5697c(String str) {
        Object next;
        String string;
        int iM6718q0;
        String string2 = AbstractC3149m.m6703R0(str).toString();
        C2381g c2381g = this.f7823c;
        List listM6691F0 = AbstractC3149m.m6691F0(c2381g.m5703d("qq_music_order_triggers", "点歌"), new char[]{',', 65292, '\n'}, 6);
        ArrayList arrayList = new ArrayList(AbstractC4167n.m8429e1(listM6691F0));
        Iterator it = listM6691F0.iterator();
        while (it.hasNext()) {
            AbstractC2091b.m5171r((String) it.next(), arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        List listM8407P1 = AbstractC4166m.m8407P1(AbstractC4166m.m8411T1(arrayList2));
        if (listM8407P1.isEmpty()) {
            listM8407P1 = AbstractC0000a.m99x0("点歌");
        }
        Iterator it2 = listM8407P1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
            if (AbstractC3156t.m6740d0(string2, (String) next, false)) {
                break;
            }
        }
        String str2 = (String) next;
        if (str2 != null) {
            String string3 = AbstractC3149m.m6703R0(AbstractC3149m.m6686A0(string2, str2)).toString();
            if (!c2381g.m5701b("qq_music_order_custom_singer", false) || (iM6718q0 = AbstractC3149m.m6718q0(string3, '&', 0, 6)) < 0) {
                string = null;
            } else {
                string = AbstractC3149m.m6703R0(string3.substring(iM6718q0 + 1)).toString();
                if (!(string.length() > 0)) {
                    string = null;
                }
                string3 = AbstractC3149m.m6703R0(string3.substring(0, iM6718q0)).toString();
            }
            if (!(string3.length() > 0)) {
                string3 = null;
            }
            if (string3 != null) {
                return new C2378d(string3, string);
            }
        }
        return null;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:330:0x067c */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:335:0x0685 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:460:0x0654 */
    /* JADX DEBUG: Failed to insert an additional move for type inference into block B:490:0x0652 */
    /* JADX WARN: Code restructure failed: missing block: B:321:0x0664, code lost:
    
        r0 = r0.toByteArray();
     */
    /* JADX WARN: Code restructure failed: missing block: B:322:0x0668, code lost:
    
        r38 = r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03f1  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04e5  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:343:0x0692  */
    /* JADX WARN: Removed duplicated region for block: B:351:0x06aa  */
    /* JADX WARN: Removed duplicated region for block: B:354:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:357:0x06ba  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:371:0x0704  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:424:0x07ee  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0816  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x081c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0209  */
    /* JADX WARN: Type inference failed for: r0v152, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v230, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r2v18, types: [androidx.lifecycle.x] */
    /* JADX WARN: Type inference failed for: r38v0, types: [ka.d] */
    /* JADX WARN: Type inference failed for: r38v1 */
    /* JADX WARN: Type inference failed for: r38v10 */
    /* JADX WARN: Type inference failed for: r38v14 */
    /* JADX WARN: Type inference failed for: r38v15 */
    /* JADX WARN: Type inference failed for: r38v16 */
    /* JADX WARN: Type inference failed for: r38v17 */
    /* JADX WARN: Type inference failed for: r38v19 */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v20 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v4 */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r38v6 */
    /* JADX WARN: Type inference failed for: r38v8 */
    /* JADX WARN: Type inference failed for: r3v32, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r5v21, types: [java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5698d(String str, long j3, String str2, C2378d c2378d) throws JSONException {
        C2375a c2375a;
        String str3;
        Object c3959f;
        String str4;
        String str5;
        Object c3959f2;
        Charset charset;
        String strM5692b;
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONObject jSONObjectOptJSONObject3;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject4;
        C2382h c2382h;
        String str6;
        C2384j c2384j;
        Object c2383i;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean bool;
        boolean z9;
        boolean z10;
        Object c3959f3;
        Object obj;
        String str7;
        String str8;
        String strM3733v;
        String string;
        String str9;
        HttpURLConnection httpURLConnection;
        Object c3959f4;
        ?? r38;
        Throwable thM8182b;
        byte[] bArr;
        int responseCode;
        String str10;
        Throwable th2;
        String str11;
        ?? r382;
        C2105p c2105p;
        String str12;
        String str13;
        Object c3959f5;
        String str14;
        String str15;
        String str16;
        Object c3959f6;
        String strConcat;
        JSONObject jSONObjectOptJSONObject5;
        JSONObject jSONObjectOptJSONObject6;
        JSONArray jSONArrayOptJSONArray2;
        JSONObject jSONObjectOptJSONObject7;
        String str17;
        Object c3959f7;
        Object c3959f8;
        JSONObject jSONObjectOptJSONObject8;
        JSONObject jSONObjectOptJSONObject9;
        JSONObject jSONObjectOptJSONObject10;
        JSONObject jSONObjectOptJSONObject11;
        JSONObject jSONObjectOptJSONObject12;
        JSONObject jSONObjectOptJSONObject13;
        JSONArray jSONArrayOptJSONArray3;
        JSONObject jSONObjectOptJSONObject14;
        JSONObject jSONObjectOptJSONObject15;
        JSONObject jSONObjectOptJSONObject16;
        String str18 = c2378d.f7817a;
        C2375a c2375a2 = this.f7824d;
        c2375a2.getClass();
        Map mapM8439b0 = AbstractC4178y.m8439b0(new C3958e("User-Agent", "Mozilla/5.0 (Linux; Android 13) AppleWebKit/537.36 (KHTML, like Gecko) Mobile Safari/537.36"), new C3958e("Referer", "https://y.qq.com/"), new C3958e("Origin", "https://y.qq.com"), new C3958e("Accept", "application/json, text/plain, */*"));
        try {
            ?? jSONObject = new JSONObject();
            jSONObject.put("comm", new JSONObject().put("ct", "19").put("cv", "1882"));
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("method", "DoSearchForQQMusicDesktop");
            jSONObject2.put("module", "music.search.SearchCgiService");
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("num_per_page", 10);
            jSONObject3.put("page_num", 1);
            jSONObject3.put("query", str18);
            jSONObject3.put("search_type", 0);
            jSONObject2.put("param", jSONObject3);
            jSONObject.put("req", jSONObject2);
            str3 = "https://u.y.qq.com/cgi-bin/musicu.fcg?data=";
            try {
                c2375a = c2375a2;
                try {
                    c3959f = C2375a.m5690d(c2375a.m5692b(str3 + URLEncoder.encode(jSONObject.toString(), AbstractC3137a.f10177a.name()), mapM8439b0));
                } catch (Throwable th3) {
                    th = th3;
                    c3959f = new C3959f(th);
                }
            } catch (Throwable th4) {
                th = th4;
                c2375a = c2375a2;
            }
        } catch (Throwable th5) {
            th = th5;
            c2375a = c2375a2;
            str3 = "https://u.y.qq.com/cgi-bin/musicu.fcg?data=";
        }
        if (c3959f instanceof C3959f) {
            c3959f = null;
        }
        JSONObject jSONObject4 = (JSONObject) c3959f;
        String str19 = str3;
        if (jSONObject4 != null) {
            str4 = str18;
            str5 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            try {
                charset = AbstractC3137a.f10177a;
                str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                try {
                    str4 = str18;
                } catch (Throwable th6) {
                    th = th6;
                    str4 = str18;
                }
                try {
                    strM5692b = c2375a.m5692b("https://c.y.qq.com/splcloud/fcgi-bin/smartbox_new.fcg?format=json&inCharset=utf8&outCharset=utf-8&key=" + URLEncoder.encode(str18, charset.name()), mapM8439b0);
                } catch (Throwable th7) {
                    th = th7;
                    c3959f2 = new C3959f(th);
                }
            } catch (Throwable th8) {
                th = th8;
                str4 = str18;
                str5 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            if (strM5692b == null) {
                c3959f2 = null;
                if (c3959f2 instanceof C3959f) {
                    c3959f2 = null;
                }
                jSONObject4 = (JSONObject) c3959f2;
            } else {
                JSONObject jSONObjectOptJSONObject17 = new JSONObject(strM5692b).optJSONObject("data");
                String strOptString = (jSONObjectOptJSONObject17 == null || (jSONObjectOptJSONObject3 = jSONObjectOptJSONObject17.optJSONObject("song")) == null || (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("itemlist")) == null || (jSONObjectOptJSONObject4 = jSONArrayOptJSONArray.optJSONObject(0)) == null) ? null : jSONObjectOptJSONObject4.optString("mid");
                if (strOptString == null) {
                    strOptString = str5;
                }
                if (!AbstractC3149m.m6721t0(strOptString)) {
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.put("comm", new JSONObject().put("ct", "19").put("cv", "1882"));
                    JSONObject jSONObject6 = new JSONObject();
                    jSONObject6.put("module", "music.pf_song_detail_svr");
                    jSONObject6.put("method", "get_song_detail");
                    jSONObject6.put("param", new JSONObject().put("song_mid", strOptString));
                    jSONObject5.put("req", jSONObject6);
                    String strM5692b2 = c2375a.m5692b(str19 + URLEncoder.encode(jSONObject5.toString(), charset.name()), mapM8439b0);
                    if (strM5692b2 != null && (jSONObjectOptJSONObject = new JSONObject(strM5692b2).optJSONObject("req")) != null && (jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject("data")) != null) {
                        c3959f2 = jSONObjectOptJSONObject2.optJSONObject("track_info");
                    }
                    if (c3959f2 instanceof C3959f) {
                    }
                    jSONObject4 = (JSONObject) c3959f2;
                }
                c3959f2 = null;
                if (c3959f2 instanceof C3959f) {
                }
                jSONObject4 = (JSONObject) c3959f2;
            }
        }
        C2384j c2384j2 = C2384j.f7829a;
        C2382h c2382h2 = C2382h.f7827a;
        if (jSONObject4 == null) {
            c2382h = c2382h2;
            str6 = "User-Agent";
            c2384j = c2384j2;
            c2383i = c2382h;
        } else {
            JSONObject jSONObjectOptJSONObject18 = jSONObject4.optJSONObject("album");
            String strOptString2 = jSONObjectOptJSONObject18 != null ? jSONObjectOptJSONObject18.optString("pmid") : null;
            if (strOptString2 == null) {
                strOptString2 = str5;
            }
            JSONObject jSONObjectOptJSONObject19 = jSONObject4.optJSONObject("file");
            String strOptString3 = jSONObjectOptJSONObject19 != null ? jSONObjectOptJSONObject19.optString("media_mid") : null;
            if (strOptString3 == null) {
                strOptString3 = str5;
            }
            String strOptString4 = jSONObject4.optString("mid");
            strOptString4.getClass();
            if (!AbstractC3149m.m6721t0(strOptString4)) {
                String strOptString5 = jSONObject4.optString("name");
                String str20 = AbstractC3149m.m6721t0(strOptString5) ? str4 : strOptString5;
                JSONArray jSONArrayOptJSONArray4 = jSONObject4.optJSONArray("singer");
                String strOptString6 = (jSONArrayOptJSONArray4 == null || (jSONObjectOptJSONObject16 = jSONArrayOptJSONArray4.optJSONObject(0)) == null) ? null : jSONObjectOptJSONObject16.optString("name");
                String str21 = strOptString6 == null ? str5 : strOptString6;
                long jOptLong = jSONObject4.optLong("id", 0L);
                try {
                    try {
                        str12 = strOptString2;
                        str13 = "User-Agent";
                        try {
                            c2382h = c2382h2;
                            c2384j = c2384j2;
                            try {
                                String strM5692b3 = c2375a.m5692b("https://c.y.qq.com/lyric/fcgi-bin/fcg_query_lyric_new.fcg?format=json&nobase64=1&songmid=".concat(strOptString4), AbstractC4178y.m8439b0(new C3958e(str13, "Mozilla/5.0"), new C3958e("Referer", "https://y.qq.com/")));
                                c3959f5 = strM5692b3 != null ? new JSONObject(strM5692b3).optString("lyric") : null;
                                if (c3959f5 == null) {
                                    c3959f5 = str5;
                                }
                            } catch (Throwable th9) {
                                th = th9;
                                c3959f5 = new C3959f(th);
                            }
                        } catch (Throwable th10) {
                            th = th10;
                            c2384j = c2384j2;
                            c2382h = c2382h2;
                        }
                    } catch (Throwable th11) {
                        th = th11;
                        str12 = strOptString2;
                        str13 = "User-Agent";
                        c2382h = c2382h2;
                        c2384j = c2384j2;
                        c3959f5 = new C3959f(th);
                        if (c3959f5 instanceof C3959f) {
                        }
                        String str22 = (String) c3959f5;
                        if (jOptLong <= 0) {
                        }
                        if (AbstractC3149m.m6721t0(str16)) {
                        }
                    }
                } catch (Throwable th12) {
                    th = th12;
                    c2382h = c2382h2;
                    str12 = strOptString2;
                    str13 = "User-Agent";
                }
                if (c3959f5 instanceof C3959f) {
                    c3959f5 = str5;
                }
                String str222 = (String) c3959f5;
                if (jOptLong <= 0) {
                    JSONObject jSONObject7 = new JSONObject();
                    str6 = str13;
                    jSONObject7.put("comm", C2375a.m5689c());
                    JSONObject jSONObject8 = new JSONObject();
                    str16 = strOptString3;
                    jSONObject8.put("module", "music.qqmusiclite.MtLimitFreeSvr");
                    jSONObject8.put("method", "Obtain");
                    str15 = "comm";
                    jSONObject8.put("param", new JSONObject().put("songid", new JSONArray().put(jOptLong)).put("need_ppurl", true));
                    jSONObject7.put("request", jSONObject8);
                    try {
                        String string2 = jSONObject7.toString();
                        string2.getClass();
                        String strM5693e = c2375a.m5693e(string2);
                        c3959f7 = (strM5693e == null || (jSONObjectOptJSONObject12 = new JSONObject(strM5693e).optJSONObject("request")) == null || (jSONObjectOptJSONObject13 = jSONObjectOptJSONObject12.optJSONObject("data")) == null || (jSONArrayOptJSONArray3 = jSONObjectOptJSONObject13.optJSONArray("tracks")) == null || (jSONObjectOptJSONObject14 = jSONArrayOptJSONArray3.optJSONObject(0)) == null || (jSONObjectOptJSONObject15 = jSONObjectOptJSONObject14.optJSONObject("control")) == null) ? null : jSONObjectOptJSONObject15.optString("ppurl");
                        if (c3959f7 == null) {
                            c3959f7 = str5;
                        }
                    } catch (Throwable th13) {
                        c3959f7 = new C3959f(th13);
                    }
                    if (c3959f7 instanceof C3959f) {
                        c3959f7 = str5;
                    }
                    String str23 = (String) c3959f7;
                    if (AbstractC3149m.m6721t0(str23)) {
                        str14 = "guid";
                    } else {
                        ?? jSONObject9 = new JSONObject();
                        JSONObject jSONObjectM9268l = AbstractC4855en.m9268l("module", "music.vkey.GetVkey", "method", "CgiGetTempVkey");
                        JSONObject jSONObjectM9267k = AbstractC4855en.m9267k("guid", "Yun");
                        JSONArray jSONArray = new JSONArray();
                        str14 = "guid";
                        JSONObject jSONObjectM9268l2 = AbstractC4855en.m9268l("mediamid", "Yun", "tempVkey", str23);
                        jSONObjectM9268l2.put("songMID", strOptString4);
                        jSONObjectM9267k.put("songlist", jSONArray.put(jSONObjectM9268l2));
                        jSONObjectM9268l.put("param", jSONObjectM9267k);
                        try {
                            String string3 = jSONObject9.put("request", jSONObjectM9268l).toString();
                            string3.getClass();
                            String strM5693e2 = c2375a.m5693e(string3);
                            c3959f8 = (strM5693e2 == null || (jSONObjectOptJSONObject8 = new JSONObject(strM5693e2).optJSONObject("request")) == null || (jSONObjectOptJSONObject9 = jSONObjectOptJSONObject8.optJSONObject("data")) == null || (jSONObjectOptJSONObject10 = jSONObjectOptJSONObject9.optJSONObject("data")) == null || (jSONObjectOptJSONObject11 = jSONObjectOptJSONObject10.optJSONObject("Yun")) == null) ? null : jSONObjectOptJSONObject11.optString("purl");
                            if (c3959f8 == null) {
                                c3959f8 = str5;
                            }
                        } catch (Throwable th14) {
                            c3959f8 = new C3959f(th14);
                        }
                        if (c3959f8 instanceof C3959f) {
                            c3959f8 = str5;
                        }
                        strConcat = (String) c3959f8;
                        if (!AbstractC3149m.m6721t0(strConcat)) {
                            str17 = strConcat;
                            if (str17 != null) {
                                String str24 = !AbstractC3149m.m6721t0(str12) ? str12 : null;
                                String strM2251n = str24 != null ? AbstractC0921a.m2251n("https://y.gtimg.cn/music/photo_new/T002R500x500M000", str24, ".jpg") : null;
                                c2383i = new C2383i(new C2385k(str20, str21, strOptString4, str17, str222, strM2251n == null ? str5 : strM2251n, "https://y.qq.com/n/ryqq/songDetail/".concat(strOptString4)));
                            } else {
                                c2383i = c2384j;
                            }
                        }
                    }
                } else {
                    str14 = "guid";
                    str15 = "comm";
                    str6 = str13;
                    str16 = strOptString3;
                }
                if (AbstractC3149m.m6721t0(str16)) {
                    ?? jSONObject10 = new JSONObject();
                    jSONObject10.put(str15, C2375a.m5689c());
                    JSONObject jSONObject11 = new JSONObject();
                    jSONObject11.put("module", "music.vkey.GetVkey");
                    jSONObject11.put("method", "UrlGetVkey");
                    JSONObject jSONObject12 = new JSONObject();
                    jSONObject12.put(str14, "Yun");
                    jSONObject12.put("songmid", new JSONArray().put(strOptString4));
                    jSONObject12.put("filename", new JSONArray().put("M500" + str16 + ".mp3"));
                    jSONObject11.put("param", jSONObject12);
                    jSONObject10.put("request", jSONObject11);
                    try {
                        String string4 = jSONObject10.toString();
                        string4.getClass();
                        String strM5693e3 = c2375a.m5693e(string4);
                        c3959f6 = (strM5693e3 == null || (jSONObjectOptJSONObject5 = new JSONObject(strM5693e3).optJSONObject("request")) == null || (jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("data")) == null || (jSONArrayOptJSONArray2 = jSONObjectOptJSONObject6.optJSONArray("midurlinfo")) == null || (jSONObjectOptJSONObject7 = jSONArrayOptJSONArray2.optJSONObject(0)) == null) ? null : jSONObjectOptJSONObject7.optString("flowurl");
                        if (c3959f6 == null) {
                            c3959f6 = str5;
                        }
                    } catch (Throwable th15) {
                        c3959f6 = new C3959f(th15);
                    }
                    if (c3959f6 instanceof C3959f) {
                        c3959f6 = str5;
                    }
                    String str25 = (String) c3959f6;
                    if (AbstractC3149m.m6721t0(str25)) {
                        str25 = null;
                    }
                    strConcat = str25 != null ? "https://sjy.stream.qqmusic.qq.com/".concat(str25) : null;
                    str17 = strConcat;
                    if (str17 != null) {
                    }
                } else {
                    str17 = null;
                    if (str17 != null) {
                    }
                }
            }
        }
        if (!(c2383i instanceof C2383i)) {
            if (c2383i.equals(c2382h)) {
                m5695e(j3, str, "未搜到");
                return;
            } else if (c2383i.equals(c2384j)) {
                m5695e(j3, str, "获取失败，可能是版权限制或数字专辑");
                return;
            } else {
                C3193a.m6822k();
                return;
            }
        }
        C2385k c2385k = ((C2383i) c2383i).f7828a;
        String str26 = c2385k.f7833d;
        C2381g c2381g = this.f7823c;
        boolean zM5701b = c2381g.m5701b("qq_music_order_send_as_card", true);
        boolean zM5701b2 = c2381g.m5701b("qq_music_order_send_as_voice", false);
        if (!zM5701b && !zM5701b2) {
            m5695e(j3, str, "请至少开启音乐卡片或歌曲语音发送");
            return;
        }
        String str27 = str;
        if (zM5701b) {
            String str28 = c2378d.f7818b;
            String str29 = c2385k.f7831b;
            String str30 = c2385k.f7835f;
            if (str28 == null || AbstractC3149m.m6721t0(str28)) {
                if (c2381g.m5701b("qq_music_order_custom_singer", false)) {
                    str7 = str5;
                    if (!AbstractC3149m.m6721t0(AbstractC3149m.m6703R0(c2381g.m5703d("qq_music_order_default_singer", str7)).toString())) {
                        string = AbstractC3149m.m6703R0(c2381g.m5703d("qq_music_order_default_singer", str7)).toString();
                        str8 = str2;
                    }
                    str9 = string;
                } else {
                    str7 = str5;
                }
                if (!c2381g.m5701b("qq_music_order_replace_singer_with_nickname", false) || AbstractC3149m.m6721t0(str2)) {
                    str8 = str2;
                    str9 = str29;
                } else {
                    C1368i c1368iM9259c = AbstractC4855en.m9259c();
                    str8 = str2;
                    WeChatContact weChatContactM3725n = c1368iM9259c != null ? c1368iM9259c.m3725n(str8) : null;
                    if (AbstractC3156t.m6733W(str27, "@chatroom", false) || AbstractC3156t.m6733W(str27, "@im.chatroom", false)) {
                        C1363d c1363dM5159f = AbstractC2091b.m5159f();
                        if (c1363dM5159f != null) {
                            C1368i c1368i = c1363dM5159f.f4517b;
                            strM3733v = c1368i == null ? str8 : c1368i.m3733v(str27, str8);
                        } else {
                            strM3733v = null;
                        }
                        if (strM3733v == null) {
                            strM3733v = str7;
                        }
                        if (AbstractC3149m.m6721t0(strM3733v)) {
                            String strM3731t = c1368iM9259c != null ? c1368iM9259c.m3731t(str27, str8) : null;
                            strM3733v = strM3731t == null ? str7 : strM3731t;
                        }
                        if (AbstractC3149m.m6721t0(strM3733v)) {
                            String str31 = weChatContactM3725n != null ? weChatContactM3725n.remarkName : null;
                            strM3733v = str31 == null ? str7 : str31;
                        }
                        if (AbstractC3149m.m6721t0(strM3733v)) {
                            string = weChatContactM3725n != null ? weChatContactM3725n.nickname : null;
                            if (string == null) {
                                string = str7;
                            }
                        } else {
                            string = strM3733v;
                        }
                        str9 = str29;
                        if (!AbstractC3149m.m6721t0(string)) {
                            str9 = str29;
                            if (!string.equals(str8)) {
                                str9 = string;
                            }
                        }
                    }
                }
            } else {
                str8 = str2;
                str9 = str28;
                str7 = str5;
            }
            if (c2381g.m5701b("qq_music_order_replace_cover_with_avatar", false)) {
                C1368i c1368iM9259c2 = AbstractC4855en.m9259c();
                String strM3724m = c1368iM9259c2 != null ? c1368iM9259c2.m3724m(str8, true) : null;
                if (strM3724m == null) {
                    strM3724m = str7;
                }
                if (!AbstractC3149m.m6721t0(strM3724m)) {
                    str30 = strM3724m;
                }
            }
            String str32 = str30;
            String strM6737a0 = AbstractC3156t.m6737a0(str32, "R500x500", "R300x300", false);
            if (AbstractC3149m.m6721t0(strM6737a0)) {
                r382 = str9;
                bArr = null;
            } else {
                try {
                    URLConnection uRLConnectionOpenConnection = new URL(strM6737a0).openConnection();
                    uRLConnectionOpenConnection.getClass();
                    httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
                    try {
                        httpURLConnection.setConnectTimeout(10000);
                        httpURLConnection.setReadTimeout(10000);
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setRequestProperty(str6, "MicroMessenger Client");
                        responseCode = httpURLConnection.getResponseCode();
                    } catch (Throwable th16) {
                        th = th16;
                        c2378d = str9;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    c2378d = str9;
                    httpURLConnection = null;
                }
                if (200 > responseCode || responseCode >= 300) {
                    r38 = str9;
                    c3959f4 = null;
                    thM8182b = C3960g.m8182b(c3959f4);
                    if (thM8182b != null) {
                        this.f7821a.invoke("QQ点歌封面下载失败", thM8182b);
                    }
                    if (c3959f4 instanceof C3959f) {
                        c3959f4 = null;
                    }
                    byte[] bArr2 = (byte[]) c3959f4;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    bArr = bArr2;
                    r382 = r38;
                } else {
                    InputStream inputStream = httpURLConnection.getInputStream();
                    try {
                        if (inputStream != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                byte[] bArr3 = new byte[8192];
                                int i9 = 0;
                                str9 = str9;
                                while (true) {
                                    int i10 = inputStream.read(bArr3);
                                    if (i10 < 0) {
                                        try {
                                            break;
                                        } catch (Throwable th18) {
                                            th2 = th18;
                                            c2378d = str9;
                                            try {
                                                throw th2;
                                            } catch (Throwable th19) {
                                                AbstractC2043a.m5035i(inputStream, th2);
                                                throw th19;
                                            }
                                        }
                                    }
                                    i9 += i10;
                                    str10 = str9;
                                    if (i9 > 131072) {
                                        c3959f4 = null;
                                        str11 = str10;
                                        break;
                                    }
                                    try {
                                        byteArrayOutputStream.write(bArr3, 0, i10);
                                        str9 = str10;
                                    } catch (Throwable th20) {
                                        th = th20;
                                        th2 = th;
                                        c2378d = str10;
                                        throw th2;
                                    }
                                }
                                inputStream.close();
                                r38 = str11;
                            } catch (Throwable th21) {
                                th = th21;
                                str10 = str9;
                            }
                        }
                    } catch (Throwable th22) {
                        th = th22;
                        c3959f4 = new C3959f(th);
                        r38 = c2378d;
                        thM8182b = C3960g.m8182b(c3959f4);
                        if (thM8182b != null) {
                        }
                        if (c3959f4 instanceof C3959f) {
                        }
                        byte[] bArr22 = (byte[]) c3959f4;
                        if (httpURLConnection != null) {
                        }
                        bArr = bArr22;
                        r382 = r38;
                        WeChatApis.interaction().getClass();
                        c2105p = WeChatApis.mediaApi;
                        if (c2105p == null) {
                        }
                        boolValueOf = Boolean.valueOf(z);
                        if (zM5701b2) {
                        }
                        bool = Boolean.FALSE;
                        if (AbstractC1416l.m3825a(boolValueOf, bool)) {
                        }
                        if (!AbstractC1416l.m3825a(boolValueOf, bool)) {
                        }
                        if (!AbstractC1416l.m3825a(boolValueOf, bool)) {
                        }
                    }
                    thM8182b = C3960g.m8182b(c3959f4);
                    if (thM8182b != null) {
                    }
                    if (c3959f4 instanceof C3959f) {
                    }
                    byte[] bArr222 = (byte[]) c3959f4;
                    if (httpURLConnection != null) {
                    }
                    bArr = bArr222;
                    r382 = r38;
                }
            }
            WeChatApis.interaction().getClass();
            c2105p = WeChatApis.mediaApi;
            if (c2105p == null) {
                String str33 = c2385k.f7830a;
                str5 = str7;
                String str34 = c2385k.f7836g;
                String str35 = c2385k.f7834e;
                if (AbstractC3149m.m6721t0(str35)) {
                    str35 = "[99:99.99]暂无歌词";
                }
                String str36 = str35;
                String string5 = AbstractC3149m.m6703R0(c2381g.m5703d("qq_music_order_app_id", "wx485a97c844086dc9")).toString();
                str27 = str;
                boolean z11 = c2105p.f7039e.m593Z(str27, str33, r382, str34, str26, str36, str32, bArr, AbstractC3149m.m6721t0(string5) ? "wx485a97c844086dc9" : string5);
                boolValueOf = Boolean.valueOf(z11);
            } else {
                str27 = str;
                str5 = str7;
            }
            boolValueOf = Boolean.valueOf(z11);
        } else {
            boolValueOf = null;
        }
        if (zM5701b2) {
            boolValueOf2 = null;
        } else {
            C2105p c2105pMedia = WeChatApis.media();
            C2114y c2114y = c2105pMedia != null ? c2105pMedia.f7036b : null;
            if (c2114y == null || !c2114y.m5308b()) {
                z9 = false;
            } else {
                File file = new File(this.f7822b.getCacheDir(), "Hchat_qq_music_order_voice");
                if ((file.isDirectory() || file.mkdirs()) && file.canWrite()) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    long jNanoTime = System.nanoTime();
                    try {
                        String path = new URL(str26).getPath();
                        path.getClass();
                        c3959f3 = path.toLowerCase(Locale.ROOT);
                        c3959f3.getClass();
                    } catch (Throwable th23) {
                        c3959f3 = new C3959f(th23);
                    }
                    if (c3959f3 instanceof C3959f) {
                        c3959f3 = str5;
                    }
                    String str37 = (String) c3959f3;
                    Iterator it = f7820f.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z9 = false;
                            obj = null;
                            break;
                        }
                        Object next = it.next();
                        Iterator it2 = it;
                        z9 = false;
                        if (AbstractC3156t.m6733W(str37, (String) next, false)) {
                            obj = next;
                            break;
                        }
                        it = it2;
                    }
                    String str38 = (String) obj;
                    if (str38 == null) {
                        str38 = ".audio";
                    }
                    File file2 = new File(file, AbstractC0921a.m2253p(AbstractC3199a.m6842o(jCurrentTimeMillis, "qq_music_", "_"), jNanoTime, str38));
                    File file3 = new File(AbstractC0255e.m1020i(file2.getAbsolutePath(), ".part"));
                    try {
                        if (m5696b(file3, file2, str26)) {
                            if (c2114y.m5324t(str27, file2.getAbsolutePath())) {
                                z9 = true;
                            }
                        }
                    } finally {
                        m5694a(file3);
                        m5694a(file2);
                    }
                } else {
                    z10 = false;
                    boolValueOf2 = Boolean.valueOf(z10);
                }
            }
            z10 = z9;
            boolValueOf2 = Boolean.valueOf(z10);
        }
        bool = Boolean.FALSE;
        if (!AbstractC1416l.m3825a(boolValueOf, bool) || AbstractC1416l.m3825a(boolValueOf2, bool)) {
            if (!AbstractC1416l.m3825a(boolValueOf, bool) && AbstractC1416l.m3825a(boolValueOf2, bool)) {
                m5695e(j3, str27, "音乐卡片和歌曲语音发送失败");
            } else if (!AbstractC1416l.m3825a(boolValueOf, bool)) {
                m5695e(j3, str27, "音乐卡片发送失败");
            } else if (AbstractC1416l.m3825a(boolValueOf2, bool)) {
                m5695e(j3, str27, "歌曲语音发送失败");
            }
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f */
    public final void m5699f(String str, boolean z9) {
        C2381g c2381g = this.f7823c;
        Set setM8411T1 = AbstractC4166m.m8411T1(c2381g.m5700a());
        if (z9) {
            setM8411T1.add(str);
        } else {
            setM8411T1.remove(str);
        }
        c2381g.m5702c(setM8411T1);
        String str2 = z9 ? "该聊天点歌开关已开启，其他人可以点歌了" : "该聊天点歌开关已关闭，只有你能点歌了";
        WeChatApis.message().getClass();
        C2341e c2341e = WeChatApis.localMessageApi;
        if (c2341e != null) {
            c2341e.m5572e(str, str2, System.currentTimeMillis(), true);
        }
    }
}
