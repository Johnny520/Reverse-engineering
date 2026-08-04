package yyds;

import android.os.IBinder;
import com.p000ss.android.ugc.awemes.MainActivity;
import com.p000ss.android.ugc.awemes.MainApp;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: renamed from: yyds.ᛳᛲᛲᲈ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0532 implements IBinder.DeathRecipient {

    /* JADX INFO: renamed from: ᛲᲈᲁ, reason: contains not printable characters */
    public final /* synthetic */ int f2560;

    /* JADX INFO: renamed from: ᛵᛸᛸᛷ, reason: contains not printable characters */
    public final /* synthetic */ C1416 f2561;

    public /* synthetic */ C0532(C1416 c1416, int i) {
        this.f2560 = i;
        this.f2561 = c1416;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        int i = this.f2560;
        C1416 c1416 = this.f2561;
        switch (i) {
            case 0:
                AbstractC1174.f5383.getClass();
                AbstractC2328.m4341(-1297414703711086L);
                if (MainApp.f486 == c1416) {
                    MainApp.f486 = null;
                }
                C1416 c14162 = MainApp.f486;
                CopyOnWriteArraySet<InterfaceC2324> copyOnWriteArraySet = MainApp.f487;
                AbstractC2328.m4341(-1297234315084654L);
                for (InterfaceC2324 interfaceC2324 : copyOnWriteArraySet) {
                    if (copyOnWriteArraySet.contains(interfaceC2324)) {
                        MainActivity mainActivity = (MainActivity) interfaceC2324;
                        mainActivity.getClass();
                        mainActivity.runOnUiThread(new RunnableC2696(mainActivity, 7, c14162));
                    }
                }
                break;
            default:
                AbstractC1174.f5383.getClass();
                AbstractC2328.m4341(-1297414703711086L);
                if (MainApp.f486 == c1416) {
                    MainApp.f486 = null;
                }
                C1416 c14163 = MainApp.f486;
                CopyOnWriteArraySet<InterfaceC2324> copyOnWriteArraySet2 = MainApp.f487;
                AbstractC2328.m4341(-1297234315084654L);
                for (InterfaceC2324 interfaceC23242 : copyOnWriteArraySet2) {
                    if (copyOnWriteArraySet2.contains(interfaceC23242)) {
                        MainActivity mainActivity2 = (MainActivity) interfaceC23242;
                        mainActivity2.getClass();
                        mainActivity2.runOnUiThread(new RunnableC2696(mainActivity2, 7, c14163));
                    }
                }
                break;
        }
    }
}
