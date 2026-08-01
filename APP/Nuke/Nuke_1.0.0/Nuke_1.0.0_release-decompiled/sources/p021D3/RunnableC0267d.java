package p021D3;

import android.content.SharedPreferences;
import android.view.ActionMode;
import com.bumptech.glide.AbstractC1926h;
import java.io.IOException;
import me.dartcv.nuke.BuildConfig;
import p000A.C0038T0;
import p027E4.C0306U;
import p027E4.C0328o;
import p027E4.InterfaceC0321h;
import p028F.ActionModeCallbackC0356q;
import p028F.C0344e;
import p028F.C0345f;
import p028F.C0348i;
import p049I2.SharedPreferencesC0796n;
import p095T.C1358e0;
import p095T.C1366i0;
import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: D3.d */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0267d implements Runnable {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f861d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ Object f862e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ Object f863f;

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ Object f864g;

    public /* synthetic */ RunnableC0267d(SharedPreferencesC0796n sharedPreferencesC0796n, SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener, String str) {
        this.f861d = 4;
        this.f862e = sharedPreferencesC0796n;
        this.f864g = onSharedPreferenceChangeListener;
        this.f863f = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f861d) {
            case 0:
                C0038T0 c0038t0 = (C0038T0) this.f862e;
                String str = (String) this.f863f;
                Float f2 = (Float) this.f864g;
                c0038t0.getClass();
                AbstractC1665j.m2985e(str, "<set-?>");
                ((C1366i0) c0038t0.f169e).setValue(str);
                if (f2 != null) {
                    ((C1358e0) c0038t0.f170f).m2508h(AbstractC1926h.m3567j(AbstractC1926h.m3567j(f2.floatValue(), 0.0f, 1.0f), 0.0f, 1.0f));
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                C0038T0 c0038t02 = (C0038T0) this.f862e;
                InterfaceC0321h interfaceC0321h = (InterfaceC0321h) this.f863f;
                C0306U c0306u = (C0306U) this.f864g;
                C0328o c0328o = (C0328o) c0038t02.f170f;
                if (!c0328o.f1048e.mo513f()) {
                    interfaceC0321h.mo32a(c0328o, c0306u);
                } else {
                    interfaceC0321h.mo44m(c0328o, new IOException("Canceled"));
                }
                break;
            case 2:
                C0038T0 c0038t03 = (C0038T0) this.f862e;
                ((InterfaceC0321h) this.f863f).mo44m((C0328o) c0038t03.f170f, (Throwable) this.f864g);
                break;
            case 3:
                C0348i c0348i = (C0348i) this.f862e;
                C0344e c0344e = (C0344e) this.f863f;
                C0345f c0345f = (C0345f) this.f864g;
                ActionMode actionModeStartActionMode = c0348i.f1092a.startActionMode(new ActionModeCallbackC0356q(c0344e), 1);
                AbstractC1665j.m2981a(c0348i.f1099h, actionModeStartActionMode);
                if (actionModeStartActionMode == null) {
                    c0345f.close();
                }
                break;
            default:
                SharedPreferencesC0796n sharedPreferencesC0796n = (SharedPreferencesC0796n) this.f862e;
                SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = (SharedPreferences.OnSharedPreferenceChangeListener) this.f864g;
                String str2 = (String) this.f863f;
                sharedPreferencesC0796n.getClass();
                onSharedPreferenceChangeListener.onSharedPreferenceChanged(sharedPreferencesC0796n, str2);
                break;
        }
    }

    public /* synthetic */ RunnableC0267d(Object obj, Object obj2, Object obj3, int i5) {
        this.f861d = i5;
        this.f862e = obj;
        this.f863f = obj2;
        this.f864g = obj3;
    }
}
