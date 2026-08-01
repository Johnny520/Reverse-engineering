package p094v0;

import android.content.Context;
import android.content.ContextWrapper;
import com.p055lu.wxmask.config.AppConfigUtil;
import com.p055lu.wxmask.p057ui.MainActivity;
import com.p055lu.wxmask272.R;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Map;
import p001A0.C0035h;
import p006D.AbstractC0079h;
import p007D0.AbstractC0096d;
import p007D0.RunnableC0093a;
import p027N0.AbstractC0223g;
import p052b1.AbstractC0503h;

/* JADX INFO: renamed from: v0.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1027b {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Finally have unexpected throw blocks count: 2, expect 1 */
    /* JADX INFO: renamed from: a */
    public static String m2221a(MainActivity mainActivity) {
        InputStream inputStreamOpenRawResource = mainActivity.getResources().openRawResource(R.raw.menu_ui);
        try {
            AbstractC0223g.m415b(inputStreamOpenRawResource);
            byte[] bArrM171N = AbstractC0079h.m171N(inputStreamOpenRawResource);
            Charset charsetForName = Charset.forName("UTF-8");
            AbstractC0223g.m417d(charsetForName, "forName(...)");
            String str = new String(bArrM171N, charsetForName);
            inputStreamOpenRawResource.close();
            return str;
        } finally {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b */
    public static void m2222b(ContextWrapper contextWrapper) {
        Context applicationContext = contextWrapper.getApplicationContext();
        String str = AppConfigUtil.Companion.getGithubMainUrl() + "/res/raw/menu_ui.json";
        AbstractC0503h.f1601j = true;
        Map map = AbstractC0096d.f382b;
        C1026a c1026a = new C1026a(str);
        C0035h c0035h = new C0035h(applicationContext, 21);
        AbstractC0223g.m418e(str, "url");
        AbstractC0223g.m418e(map, "header");
        AbstractC0096d.f381a.submit(new RunnableC0093a(str, map, c1026a, c0035h, 0));
    }
}
