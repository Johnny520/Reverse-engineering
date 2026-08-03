package p000a;

import android.app.Dialog;
import android.view.View;
import android.view.Window;
import android.widget.PopupWindow;
import io.github.libxposed.api.XposedInterface;

/* JADX INFO: renamed from: a.N8 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C0245N8 implements InterfaceC0064D7 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f850a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C0316R8 f851b;

    public /* synthetic */ C0245N8(C0316R8 c0316r8, int i) {
        this.f850a = i;
        this.f851b = c0316r8;
    }

    @Override // p000a.InterfaceC0064D7
    /* JADX INFO: renamed from: f */
    public final Object mo53f(Object obj) {
        View decorView;
        View contentView;
        XposedInterface.Chain chain = (XposedInterface.Chain) obj;
        switch (this.f850a) {
            case 0:
                C0631i9.m1482e(chain, "chain");
                this.f851b.getClass();
                break;
            case 1:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress MediaPlayer.start");
                }
                break;
            case 2:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress SoundPool.play");
                }
                break;
            case 3:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress Ringtone.play");
                }
                break;
            case 4:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress AudioTrack.play");
                }
                break;
            case 5:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress AudioTrack.start");
                }
                break;
            case 6:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress ToneGenerator.startTone(int)");
                }
                break;
            case 7:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress ToneGenerator.startTone(int,int)");
                }
                break;
            case 8:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress Vibrator.vibrate(long)");
                }
                break;
            case 9:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress Vibrator.vibrate(long[], int)");
                }
                break;
            case 10:
                C0631i9.m1482e(chain, "chain");
                if (C0506bh.m1255f()) {
                    this.f851b.getClass();
                    C0316R8.m873r("suppress Vibrator.vibrate(VibrationEffect)");
                }
                break;
            case 11:
                C0631i9.m1482e(chain, "chain");
                Object thisObject = chain.getThisObject();
                Dialog dialog = thisObject instanceof Dialog ? (Dialog) thisObject : null;
                if (dialog != null) {
                    Window window = dialog.getWindow();
                    if (window != null && (decorView = window.getDecorView()) != null) {
                        this.f851b.getClass();
                        String strM1952p0 = C0834t3.m1952p0(C0316R8.m860b(decorView), " ", null, 62);
                        for (String str : C0316R8.f1133e) {
                            if (C0034Be.m94I(strM1952p0, str, true)) {
                                String strM1250a = C0506bh.m1250a();
                                if (C0506bh.m1251b() && strM1250a != null) {
                                    C0316R8.m873r("Dialog.show suppressed for active intercept user=" + strM1250a + " text=" + strM1952p0);
                                }
                            }
                            break;
                        }
                    }
                }
                break;
            default:
                C0631i9.m1482e(chain, "chain");
                Object thisObject2 = chain.getThisObject();
                PopupWindow popupWindow = thisObject2 instanceof PopupWindow ? (PopupWindow) thisObject2 : null;
                if (popupWindow != null && (contentView = popupWindow.getContentView()) != null) {
                    this.f851b.getClass();
                    String strM1952p02 = C0834t3.m1952p0(C0316R8.m860b(contentView), " ", null, 62);
                    for (String str2 : C0316R8.f1133e) {
                        if (C0034Be.m94I(strM1952p02, str2, true)) {
                            if (C0506bh.m1251b()) {
                                C0316R8.m873r("PopupWindow.showAtLocation suppressed text=".concat(strM1952p02));
                            }
                        }
                    }
                }
                break;
        }
        return chain.proceed();
    }
}
