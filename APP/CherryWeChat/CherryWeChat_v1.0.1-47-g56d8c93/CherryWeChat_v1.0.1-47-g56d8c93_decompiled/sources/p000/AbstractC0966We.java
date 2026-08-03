package p000;

import io.github.cherrywechat.R;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: We */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0966We {

    /* JADX INFO: renamed from: a */
    public static final int[] f3008a = {R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: b */
    public static final Map f3009b;

    /* JADX INFO: renamed from: c */
    public static final Map f3010c;

    static {
        C0794Se c0794Se = new C0794Se();
        C0837Te c0837Te = new C0837Te();
        HashMap map = new HashMap();
        map.put("fcnt", c0794Se);
        map.put("google", c0794Se);
        map.put("hmd global", c0794Se);
        map.put("infinix", c0794Se);
        map.put("infinix mobility limited", c0794Se);
        map.put("itel", c0794Se);
        map.put("kyocera", c0794Se);
        map.put("lenovo", c0794Se);
        map.put("lge", c0794Se);
        map.put("meizu", c0794Se);
        map.put("motorola", c0794Se);
        map.put("nothing", c0794Se);
        map.put("oneplus", c0794Se);
        map.put("oppo", c0794Se);
        map.put("realme", c0794Se);
        map.put("robolectric", c0794Se);
        map.put("samsung", c0837Te);
        map.put("sharp", c0794Se);
        map.put("shift", c0794Se);
        map.put("sony", c0794Se);
        map.put("tcl", c0794Se);
        map.put("tecno", c0794Se);
        map.put("tecno mobile limited", c0794Se);
        map.put("vivo", c0794Se);
        map.put("wingtech", c0794Se);
        map.put("xiaomi", c0794Se);
        f3009b = Collections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", c0794Se);
        map2.put("jio", c0794Se);
        f3010c = Collections.unmodifiableMap(map2);
    }
}
