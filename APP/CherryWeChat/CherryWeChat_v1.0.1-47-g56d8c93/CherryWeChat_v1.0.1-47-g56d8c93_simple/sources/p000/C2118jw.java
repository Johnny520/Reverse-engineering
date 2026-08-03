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
    public final String f7438a;

    /* JADX INFO: renamed from: b */
    public final Handler f7439b;

    /* JADX INFO: renamed from: c */
    public final HashMap f7440c;

    /* JADX INFO: renamed from: d */
    public final HashMap f7441d;

    /* JADX INFO: renamed from: e */
    public final HashMap f7442e;

    /* JADX INFO: renamed from: f */
    public final HashMap f7443f;

    public C2118jw() {
        this.f7438a = RunnableC1286a.class.getName().concat(".");
        this.f7440c = new HashMap();
        this.f7441d = new HashMap();
        this.f7442e = new HashMap();
        this.f7443f = new HashMap();
        this.f7439b = new Handler(Looper.getMainLooper(), this);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message r4) {
        int r0 = r4.what;
        if (r0 != 1) goto L5;
        FragmentManager r42 = (FragmentManager) r4.obj;
        this.f7440c.remove(r42);
        return true;
    L5:
        if (r0 != 2) goto L7;
        AbstractC2805zi r43 = (AbstractC2805zi) r4.obj;
        this.f7441d.remove(r43);
        return true;
    L7:
        if (r0 != 3) goto L9;
        String r44 = (String) r4.obj;
        this.f7442e.remove(r44);
        return true;
    L9:
        if (r0 == 4) goto L12;
        return false;
    L12:
        String r45 = (String) r4.obj;
        this.f7443f.remove(r45);
        return true;
    }
}
