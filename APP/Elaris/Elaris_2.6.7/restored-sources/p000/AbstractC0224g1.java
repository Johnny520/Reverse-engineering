package p000;

import android.graphics.Color;
import com.p001mr.elaris.HookEntry;
import com.p001mr.elaris.Prefs;

/* JADX INFO: renamed from: g1 */
/* JADX INFO: compiled from: r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0224g1 {

    /* JADX INFO: renamed from: a */
    public static final int f286a;

    /* JADX INFO: renamed from: b */
    public static volatile String f287b;

    /* JADX INFO: renamed from: c */
    public static volatile int f288c;

    /* JADX INFO: renamed from: d */
    public static volatile String f289d;

    /* JADX INFO: renamed from: e */
    public static volatile String f290e;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    static {
        int iArgb = Color.argb(176, 85, 90, 102);
        f286a = iArgb;
        f287b = "";
        f288c = iArgb;
        f289d = "";
        f290e = "ah:mm";
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public static int m414a() {
        String strRuntimeString = HookEntry.runtimeString(Prefs.KEY_CHAT_MESSAGE_CORNER_TIME_COLOR, "");
        String str = strRuntimeString != null ? strRuntimeString : "";
        if (str.equals(f287b)) {
            return f288c;
        }
        int color = f286a;
        if (str.trim().length() != 0) {
            try {
                color = Color.parseColor(str.trim());
            } catch (Throwable unused) {
            }
        }
        f288c = color;
        f287b = str;
        return color;
    }
}
