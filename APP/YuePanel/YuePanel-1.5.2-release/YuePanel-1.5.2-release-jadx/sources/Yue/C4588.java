package Yue;

import Yue.C7700;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import androidx.activity.ComponentActivity;

/* JADX INFO: renamed from: Yue.ۥ۠۠ۤ۟, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nEdgeToEdge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EdgeToEdge.kt\nandroidx/activity/EdgeToEdge\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
@InterfaceC5572(name = "EdgeToEdge")
public final class C4588 {

    /* JADX INFO: renamed from: ۥ */
    public static final int f986 = Color.argb(230, 255, 255, 255);

    /* JADX INFO: renamed from: ۥ۟ */
    public static final int f987 = Color.argb(128, 27, 27, 27);

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    @InterfaceC6489
    public static InterfaceC4596 f9870;

    @InterfaceC5573
    @InterfaceC5572(name = "enable")
    /* JADX INFO: renamed from: ۥ */
    public static final void m1550(@InterfaceC6399 ComponentActivity componentActivity) {
        C5499.m17103(componentActivity, "<this>");
        m13650(componentActivity, null, null, 3, null);
    }

    @InterfaceC5573
    @InterfaceC5572(name = "enable")
    /* JADX INFO: renamed from: ۥ۟ */
    public static final void m1551(@InterfaceC6399 ComponentActivity componentActivity, @InterfaceC6399 C7700 c7700) {
        C5499.m17103(componentActivity, "<this>");
        C5499.m17103(c7700, "statusBarStyle");
        m13650(componentActivity, c7700, null, 2, null);
    }

    @InterfaceC5573
    @InterfaceC5572(name = "enable")
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final void m13649(@InterfaceC6399 ComponentActivity componentActivity, @InterfaceC6399 C7700 c7700, @InterfaceC6399 C7700 c77002) {
        C5499.m17103(componentActivity, "<this>");
        C5499.m17103(c7700, "statusBarStyle");
        C5499.m17103(c77002, "navigationBarStyle");
        View decorView = componentActivity.getWindow().getDecorView();
        C5499.m17102(decorView, "window.decorView");
        InterfaceC5124<Resources, Boolean> interfaceC5124M24490 = c7700.m24490();
        Resources resources = decorView.getResources();
        C5499.m17102(resources, "view.resources");
        boolean zBooleanValue = interfaceC5124M24490.invoke(resources).booleanValue();
        InterfaceC5124<Resources, Boolean> interfaceC5124M244902 = c77002.m24490();
        Resources resources2 = decorView.getResources();
        C5499.m17102(resources2, "view.resources");
        boolean zBooleanValue2 = interfaceC5124M244902.invoke(resources2).booleanValue();
        InterfaceC4596 c4594 = f9870;
        if (c4594 == null) {
            c4594 = Build.VERSION.SDK_INT >= 29 ? new C4594() : new C4591();
        }
        InterfaceC4596 interfaceC4596 = c4594;
        Window window = componentActivity.getWindow();
        C5499.m17102(window, "window");
        interfaceC4596.mo1552(c7700, c77002, window, decorView, zBooleanValue, zBooleanValue2);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static /* synthetic */ void m13650(ComponentActivity componentActivity, C7700 c7700, C7700 c77002, int i, Object obj) {
        if ((i & 1) != 0) {
            c7700 = C7700.C1330.m24494(C7700.f23203, 0, 0, null, 4, null);
        }
        if ((i & 2) != 0) {
            c77002 = C7700.C1330.m24494(C7700.f23203, f986, f987, null, 4, null);
        }
        m13649(componentActivity, c7700, c77002);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final int m13651() {
        return f987;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static /* synthetic */ void m13652() {
    }

    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final int m13653() {
        return f986;
    }

    @InterfaceC8392
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static /* synthetic */ void m13654() {
    }
}
