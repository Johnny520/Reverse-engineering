package p041;

import android.content.Intent;
import android.os.Bundle;
import com.bumptech.glide.AbstractC3056;
import de.robv.android.xposed.XposedHelpers;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.net.URLEncoder;
import lin.xposed.hook.util.qq.Hook_cookie;
import org.json.JSONException;
import org.json.JSONObject;
import p000.AbstractC6087;
import p007.AbstractC6136;
import p032.AbstractC6314;
import p032.AbstractC6317;
import p032.AbstractC6318;
import p033.AbstractC6325;
import p034.C6335;

/* JADX INFO: renamed from: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC6438 {
    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public static void m11937(final String str, String str2, final String str3, final String str4, final String str5) {
        final String myuin = Hook_cookie.getMyuin();
        final String skey = Hook_cookie.getSkey();
        StringBuilder sb = new StringBuilder();
        AbstractC6136.m11544(-3937589604325262759L, sb, str3);
        AbstractC6136.m11544(-3937611981104874919L, sb, str);
        sb.append(AbstractC3056.m6668(-3937611616032654759L));
        sb.append(1);
        sb.append(AbstractC3056.m6668(-3937611886615594407L));
        sb.append(C6335.f17453);
        sb.append(AbstractC3056.m6668(-3937612595285198247L));
        sb.append(str4);
        sb.append(AbstractC3056.m6668(-3937612298932454823L));
        sb.append(0);
        AbstractC6136.m11544(-3937612977537287591L, sb, str4);
        AbstractC6136.m11544(-3937612852983236007L, sb, str2);
        sb.append(AbstractC3056.m6668(-3937612346177095079L));
        sb.append(URLEncoder.encode(Hook_cookie.getName(myuin)));
        AbstractC6136.m11544(-3937612376241866151L, sb, myuin);
        String strM11891 = C6335.m11891(AbstractC6136.m11557(-3937612694069446055L, sb, str5), AbstractC3056.m6668(-3937612084184090023L));
        Intent intentM11863 = AbstractC6325.m11863();
        Object objM11392 = AbstractC6087.m11392(AbstractC6318.m11838(AbstractC3056.m6668(-3937599306656384423L)), new Object[0]);
        XposedHelpers.callMethod(AbstractC6317.m11831(null, AbstractC3056.m6668(-3937598885749589415L), objM11392), AbstractC3056.m6668(-3937598920109327783L), new Class[]{String.class}, new Object[]{AbstractC3056.m6668(-3937598834209981863L)});
        XposedHelpers.callMethod(AbstractC6317.m11831(null, AbstractC3056.m6668(-3937612054119318951L), objM11392), AbstractC3056.m6668(-3937598920109327783L), new Class[]{String.class}, new Object[]{strM11891});
        XposedHelpers.callMethod(AbstractC6317.m11831(null, AbstractC3056.m6668(-3937611951040103847L), objM11392), AbstractC3056.m6668(-3937598920109327783L), new Class[]{String.class}, new Object[]{Integer.toString(C6335.f17453)});
        XposedHelpers.callMethod(AbstractC6317.m11831(null, AbstractC3056.m6668(-3937598748310635943L), objM11392), AbstractC3056.m6668(-3937598920109327783L), new Class[]{Integer.TYPE}, new Object[]{0});
        intentM11863.putExtra(AbstractC3056.m6668(-3937589565670557095L), C6335.m11893((byte[]) objM11392.getClass().getSuperclass().getDeclaredMethod(AbstractC3056.m6668(-3937598778375407015L), null).invoke(objM11392, null)));
        XposedHelpers.callMethod(intentM11863, AbstractC3056.m6668(-3937598593691813287L), new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937598473432728999L))}, new Object[]{Proxy.newProxyInstance(AbstractC6318.f17411, new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937598473432728999L))}, new InvocationHandler() { // from class: 飘花落叶言世哲苏子兰楪.飘花落叶言子楪世哲苏兰
            @Override // java.lang.reflect.InvocationHandler
            public final Object invoke(Object obj, Method method, Object[] objArr) throws JSONException {
                byte[] byteArray = ((Bundle) objArr[2]).getByteArray(AbstractC3056.m6668(-3937589565670557095L));
                Object objM113922 = AbstractC6087.m11392(AbstractC6318.m11838(AbstractC3056.m6668(-3937613776401204647L)), new Object[0]);
                AbstractC6314.m11817(objM113922, AbstractC3056.m6668(-3937613565947807143L), new Class[]{byte[].class}, byteArray);
                JSONObject jSONObject = new JSONObject(C6335.m11892((String) XposedHelpers.callMethod(AbstractC6317.m11831(null, AbstractC3056.m6668(-3937611903795463591L), objM113922), AbstractC3056.m6668(-3937613501523297703L), new Object[0]), AbstractC3056.m6668(-3937598834209981863L)));
                if (jSONObject.optString(AbstractC3056.m6668(-3937599461275207079L)).equals(AbstractC3056.m6668(-3937561652678100391L)) && jSONObject.has(AbstractC3056.m6668(-3937611800716248487L))) {
                    String string = jSONObject.getString(AbstractC3056.m6668(-3937611800716248487L));
                    StringBuilder sb2 = new StringBuilder();
                    AbstractC6136.m11544(-3937613368379311527L, sb2, str);
                    String str6 = str4;
                    AbstractC6136.m11544(-3937611573082981799L, sb2, str6);
                    sb2.append(AbstractC3056.m6668(-3937613029076895143L));
                    sb2.append(0);
                    sb2.append(AbstractC3056.m6668(-3937612298932454823L));
                    sb2.append(0);
                    sb2.append(AbstractC3056.m6668(-3937612852983236007L));
                    sb2.append(1);
                    sb2.append(AbstractC3056.m6668(-3937612251687814567L));
                    sb2.append(URLEncoder.encode(string));
                    AbstractC6136.m11544(-3937612694069446055L, sb2, str5);
                    AbstractC6136.m11544(-3937612676889576871L, sb2, str3);
                    sb2.append(AbstractC3056.m6668(-3937602686795646375L));
                    String str7 = skey;
                    sb2.append(AbstractC3056.m6668(str7.length() <= 12 ? -3937595612984509863L : -3937561652678100391L));
                    sb2.append(AbstractC3056.m6668(-3937612578105329063L));
                    sb2.append(1);
                    AbstractC6136.m11544(-3937612595285198247L, sb2, str6);
                    sb2.append(AbstractC3056.m6668(-3937612346177095079L));
                    String str8 = myuin;
                    sb2.append(URLEncoder.encode(Hook_cookie.getName(str8)));
                    AbstractC6136.m11544(-3937612376241866151L, sb2, str8);
                    sb2.append(AbstractC3056.m6668(-3937602532176823719L));
                    sb2.append(str7);
                    C6335.f17453 = Integer.parseInt(new JSONObject(C6335.m11894(sb2.toString(), str7)).getString(AbstractC3056.m6668(-3937611710521935271L)));
                }
                return null;
            }
        })});
        XposedHelpers.callMethod(Hook_cookie.getRuntime(), AbstractC3056.m6668(-3937598327403840935L), new Class[]{AbstractC6318.m11838(AbstractC3056.m6668(-3937601664593429927L))}, new Object[]{intentM11863});
    }
}
