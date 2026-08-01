package gd;

import android.content.ContentValues;
import com.alibaba.fastjson2.JSONB;
import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import md.AbstractC5161p;
import md.InterfaceC5154i;
import md.InterfaceC5156k;
import me.yun.fkwechat.core.config.AppConfig;
import me.yun.fkwechat.loader.api.HookEngine;
import okhttp3.internal.url._UrlKt;
import p053dd.C1951c;
import p068ed.AbstractC2212a;
import p084fd.AbstractC2427g;
import p114hd.C3014l;
import p114hd.C3016n;
import p183m6.SharedPreferencesC5046p;
import p201nd.C5580h;

/* JADX INFO: renamed from: gd.r */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C2777r extends AbstractC2212a {

    /* JADX INFO: renamed from: f */
    public static SharedPreferencesC5046p f7238f;

    /* JADX INFO: renamed from: g */
    public static final Pattern f7239g = Pattern.compile("<atuserlist>(.*?)</atuserlist>");

    /* JADX INFO: renamed from: h */
    public static final List f7240h = Arrays.asList("ImgInfo2", "voiceinfo", "videoinfo2", "WxFileIndex2");

    /* JADX INFO: renamed from: i */
    public static byte[] f7241i = null;

    /* JADX INFO: renamed from: e */
    public Class f7242e;

    /* JADX INFO: renamed from: q */
    public static byte[] m9916q(String str) {
        byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
        int length = bytes.length;
        byte[] bArr = new byte[length + 74];
        bArr[0] = JSONB.Constants.BC_STR_UTF16;
        bArr[8] = JSONB.Constants.BC_STR_UTF8;
        System.arraycopy(bytes, 0, bArr, 9, bytes.length);
        bArr[length + 73] = JSONB.Constants.BC_STR_UTF16BE;
        return bArr;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9917s(long j10) {
        SharedPreferencesC5046p sharedPreferencesC5046p = f7238f;
        return sharedPreferencesC5046p != null && sharedPreferencesC5046p.getBoolean(String.valueOf(j10), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public /* synthetic */ void m9918t(InterfaceC5154i interfaceC5154i) {
        ContentValues contentValues;
        String asString;
        if ("message".equals((String) interfaceC5154i.getArgs()[0]) && m7967c("anti_revoke", false) && (contentValues = (ContentValues) interfaceC5154i.getArgs()[1]) != null && contentValues.containsKey("content") && (asString = contentValues.getAsString("content")) != null) {
            if (asString.contains("撤回了一条消息") || asString.contains("revokemsg")) {
                if (contentValues.getAsInteger("msgId") != null) {
                    m9922x(r0.intValue());
                }
                interfaceC5154i.setResult(1);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m9919u(InterfaceC5154i interfaceC5154i) {
        String str = (String) interfaceC5154i.getArgs()[0];
        if (m7967c("anti_revoke", false) && f7240h.contains(str)) {
            interfaceC5154i.setResult(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m9920v(InterfaceC5154i interfaceC5154i) {
        if (m7967c("anti_revoke", false)) {
            String absolutePath = ((File) interfaceC5154i.getThisObject()).getAbsolutePath();
            if (absolutePath.contains("/image2/") || absolutePath.contains("/voice2/") || absolutePath.contains("/video/")) {
                interfaceC5154i.setResult(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m9921w(InterfaceC5154i interfaceC5154i) {
        ContentValues contentValues;
        if ("message".equals((String) interfaceC5154i.getArgs()[0]) && (contentValues = (ContentValues) interfaceC5154i.getArgs()[2]) != null) {
            new C3014l().m11115o(contentValues);
            new C3016n().m11119n(contentValues);
            C5580h.dispatchMsg(contentValues);
            m9923r(contentValues, interfaceC5154i);
        }
    }

    /* JADX INFO: renamed from: x */
    public static void m9922x(long j10) {
        SharedPreferencesC5046p sharedPreferencesC5046p = f7238f;
        if (sharedPreferencesC5046p != null) {
            sharedPreferencesC5046p.putBoolean(String.valueOf(j10), true);
        }
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: h */
    public boolean mo7972h() {
        this.f7242e = this.f6039b.loadClass("com.tencent.wcdb.database.SQLiteDatabase");
        if (AppConfig.hostContext != null) {
            f7238f = new SharedPreferencesC5046p.a(AppConfig.hostContext, "FkWeChat_Revoke_Msgid").m20406a();
        }
        return this.f7242e != null;
    }

    @Override // p068ed.AbstractC2212a
    /* JADX INFO: renamed from: j */
    public void mo7974j() {
        Class cls = this.f7242e;
        Class cls2 = Integer.TYPE;
        HookEngine.hookBefore(AbstractC5161p.findMethodExact(cls, "updateWithOnConflict", String.class, ContentValues.class, String.class, String[].class, cls2), new InterfaceC5156k() { // from class: gd.n
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7234a.m9918t(interfaceC5154i);
            }
        });
        HookEngine.hookBefore(AbstractC5161p.findMethodExact(this.f7242e, "delete", String.class, String.class, String[].class), new InterfaceC5156k() { // from class: gd.o
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7235a.m9919u(interfaceC5154i);
            }
        });
        HookEngine.hookBefore(AbstractC5161p.findMethodExact(File.class, "delete", new Class[0]), new InterfaceC5156k() { // from class: gd.p
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7236a.m9920v(interfaceC5154i);
            }
        });
        HookEngine.hookBefore(AbstractC5161p.findMethodExact(this.f7242e, "insertWithOnConflict", String.class, String.class, ContentValues.class, cls2), new InterfaceC5156k() { // from class: gd.q
            @Override // md.InterfaceC5156k
            /* JADX INFO: renamed from: a */
            public final void mo8716a(InterfaceC5154i interfaceC5154i) {
                this.f7237a.m9921w(interfaceC5154i);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final void m9923r(ContentValues contentValues, InterfaceC5154i interfaceC5154i) {
        byte[] bArr;
        String title;
        String asString = contentValues.getAsString("content");
        Integer asInteger = contentValues.getAsInteger("isSend");
        Integer asInteger2 = contentValues.getAsInteger("type");
        byte[] asByteArray = contentValues.getAsByteArray("lvbuffer");
        String asString2 = contentValues.getAsString("talker");
        if (asString == null || asInteger == null || asInteger2 == null) {
            return;
        }
        if (m7967c("custom_announcement", false) && asInteger.intValue() == 1 && asInteger2.intValue() == 822083633 && (title = new C1951c(contentValues).getTitle()) != null && title.startsWith("#公告")) {
            contentValues.put("lvbuffer", m9916q("<msgsource><atuserlist><![CDATA[announcement@all]]></atuserlist></msgsource>"));
            contentValues.put("content", asString.replace("<title>#公告", "<title>"));
        }
        if (m7967c("hide_at", false)) {
            if (asInteger2.intValue() != 1 && asInteger.intValue() == 1 && (bArr = f7241i) != null) {
                contentValues.put("lvbuffer", bArr);
                f7241i = null;
            }
            if (asInteger2.intValue() == 1 && asInteger.intValue() == 1 && asString.contains("@") && asByteArray != null) {
                Matcher matcher = f7239g.matcher(new String(asByteArray, StandardCharsets.UTF_8));
                if (matcher.find()) {
                    f7241i = m9916q("<msgsource><atuserlist>" + matcher.group(1) + "</atuserlist></msgsource>");
                    AbstractC2427g.m8765c(asString2, "<msg><appmsg><title><![CDATA[" + asString.replaceAll("@(.*)\\s", _UrlKt.FRAGMENT_ENCODE_SET).replace("\u2005", _UrlKt.FRAGMENT_ENCODE_SET).trim() + "]]></title><type><![CDATA[57]]></type></appmsg></msg>");
                    interfaceC5154i.setResult(1L);
                }
            }
        }
    }
}
