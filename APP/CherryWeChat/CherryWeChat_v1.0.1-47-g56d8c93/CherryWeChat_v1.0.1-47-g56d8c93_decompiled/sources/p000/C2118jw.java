package p000;

import android.app.FragmentManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.gyf.immersionbar.RunnableC1286a;
import java.util.HashMap;

/* JADX INFO: renamed from: jw */
/* JADX INFO: loaded from: classes.dex */
public final class C2118jw implements Handler.Callback {

    /* JADX INFO: renamed from: a */
    public final String f7438a = RunnableC1286a.class.getName().concat(".");

    /* JADX INFO: renamed from: c */
    public final HashMap f7440c = new HashMap();

    /* JADX INFO: renamed from: d */
    public final HashMap f7441d = new HashMap();

    /* JADX INFO: renamed from: e */
    public final HashMap f7442e = new HashMap();

    /* JADX INFO: renamed from: f */
    public final HashMap f7443f = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Handler f7439b = new Handler(Looper.getMainLooper(), this);

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 1) {
            this.f7440c.remove((FragmentManager) message.obj);
            return true;
        }
        if (i == 2) {
            this.f7441d.remove((AbstractC2805zi) message.obj);
            return true;
        }
        if (i == 3) {
            this.f7442e.remove((String) message.obj);
            return true;
        }
        if (i != 4) {
            return false;
        }
        this.f7443f.remove((String) message.obj);
        return true;
    }
}
