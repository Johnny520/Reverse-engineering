package p001;

import android.content.Context;
import android.widget.FrameLayout;

/* JADX INFO: renamed from: ۟.h7 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0240h7 implements Runnable {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f833;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ FrameLayout f834;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ C0310m7 f1497;

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final /* synthetic */ String f1498;

    public /* synthetic */ RunnableC0240h7(FrameLayout frameLayout, C0310m7 c0310m7, String str, int i) {
        this.f833 = i;
        this.f834 = frameLayout;
        this.f1497 = c0310m7;
        this.f1498 = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f833) {
            case 0:
                FrameLayout frameLayout = this.f834;
                C0310m7 c0310m7 = this.f1497;
                String str = this.f1498;
                C0237h4.m1090(C0341oa.m915(new byte[]{126, -80, 16, 106, -29, 22}, new byte[]{10, -40, 121, 25, -57, 38}), c0310m7);
                C0237h4.m1090(C0341oa.m915(new byte[]{-28, -78, -26, -56}, new byte[]{-64, -57, -108, -92, 24, 16}), str);
                Context context = frameLayout.getContext();
                C0237h4.m1089(C0341oa.m915(new byte[]{14, -81, 20, 45, 103, 22, 29, -81, 24, 26, 32, 86, 71, -28, 73}, new byte[]{105, -54, 96, 110, 8, 120}), context);
                frameLayout.addView(C0310m7.m1152(c0310m7, context, new C0254i7(str)));
                break;
            default:
                FrameLayout frameLayout2 = this.f834;
                C0310m7 c0310m72 = this.f1497;
                String str2 = this.f1498;
                C0237h4.m1090(C0341oa.m915(new byte[]{-98, 22, 1, -105, 10, 11}, new byte[]{-22, 126, 104, -28, 46, 59}), c0310m72);
                C0237h4.m1090(C0341oa.m915(new byte[]{-47, 84, -40, 69}, new byte[]{-11, 33, -86, 41, 38, 66}), str2);
                Context context2 = frameLayout2.getContext();
                C0237h4.m1089(C0341oa.m915(new byte[]{122, -49, 74, 127, -97, -36, 105, -49, 70, 72, -40, -100, 51, -124, 23}, new byte[]{29, -86, 62, 60, -16, -78}), context2);
                frameLayout2.addView(C0310m7.m1152(c0310m72, context2, new C0282k7(str2)));
                break;
        }
    }
}
