package io.github.cherrywechat.p002ui.activity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import io.github.cherrywechat.R;
import io.github.cherrywechat.p002ui.MaterialSwitch;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import p000.AbstractActivityC2528t5;
import p000.AbstractC0295Gu;
import p000.AbstractC0585Nj;
import p000.AbstractC1220bf;
import p000.C1313dA;
import p000.C1325df;
import p000.C1368ef;
import p000.C1412ff;
import p000.C2132k9;
import p000.InterfaceC0759Rm;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends AbstractActivityC2528t5 {
    public MainActivity() {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m3555b(MainActivity r0, CompoundButton r1, boolean r2) {
        onCreate$lambda$0(r0, r1, r2);
    }

    private final String executeCmd(String r10) {
        DataOutputStream r0 = null;
        Process r1 = Runtime.getRuntime().exec(AbstractC0295Gu.m625r(-801290573576245L));     // Catch: Throwable -> L40 IOException -> L42
        DataOutputStream r2 = new DataOutputStream(r1.getOutputStream());     // Catch: Throwable -> L36 IOException -> L38
        r2.writeBytes(r10 + '\n');     // Catch: Throwable -> L9 IOException -> L11
        r2.flush();     // Catch: Throwable -> L9 IOException -> L11
        r2.writeBytes(AbstractC0295Gu.m625r(-801303458478133L));     // Catch: Throwable -> L9 IOException -> L11
        r2.flush();     // Catch: Throwable -> L9 IOException -> L11
        BufferedReader r102 = new BufferedReader(new InputStreamReader(r1.getErrorStream()));     // Catch: Throwable -> L9 IOException -> L11
        char[] r02 = new char[4096];     // Catch: Throwable -> L9 IOException -> L11
        StringBuilder r3 = new StringBuilder();     // Catch: Throwable -> L9 IOException -> L11
    L6:
        int r4 = r102.read(r02);     // Catch: Throwable -> L9 IOException -> L11
        if (r4 <= 0) goto L13;
        r3.append(r02, 0, r4);     // Catch: Throwable -> L9 IOException -> L11
        AbstractC0295Gu.m625r(-801329228281909L);     // Catch: Throwable -> L9 IOException -> L11
        goto L6
    L13:
        r102.close();     // Catch: Throwable -> L9 IOException -> L11
        String r103 = r3.toString();     // Catch: Throwable -> L9 IOException -> L11
        AbstractC0295Gu.m625r(-801380767889461L);     // Catch: Throwable -> L9 IOException -> L11
        int r03 = r103.length() - 1;     // Catch: Throwable -> L9 IOException -> L11
        int r42 = 0;
        boolean r6 = false;
    L14:
        if (r42 > r03) goto L29;
        if (r6 == true) goto L17;
        int r7 = r42;
    L19:
        if (AbstractC0585Nj.m1139g(r103.charAt(r7), 32) > 0) goto L21;
        boolean r72 = true;
    L22:
        if (r6 == false) goto L23;
        if (r72 == false) goto L29;
        r03 = r03 - 1;
        goto L14
    L23:
        if (r72 == false) goto L24;
        r42 = r42 + 1;     // Catch: Throwable -> L9 IOException -> L11
        goto L14
    L24:
        r6 = true;
        goto L14
    L21:
        r72 = false;
        goto L22
    L17:
        r7 = r03;
    L29:
        String r104 = r103.subSequence(r42, r03 + 1).toString();     // Catch: Throwable -> L9 IOException -> L11
        r2.close();     // Catch: IOException -> L32
    L34:
        r1.destroy();
        return r104;
    L32:
        e = move-exception;
        e.printStackTrace();
        goto L34
    L11:
        e = e;
        r0 = r2;
    L44:
        e.printStackTrace();     // Catch: Throwable -> L36
        String r105 = e.getMessage();     // Catch: Throwable -> L36
        if (r0 != null) goto L61;
    L50:
        if (r1 == null) goto L52;
        r1.destroy();
    L52:
        return r105;
    L61:
        r0.close();     // Catch: IOException -> L48
    L48:
        e = move-exception;
        e.printStackTrace();
    L9:
        th = th;
        r0 = r2;
    L53:
        if (r0 != null) goto L63;
    L58:
        if (r1 == null) goto L86;
        r1.destroy();
        throw th;
    L86:
        throw th;
    L63:
        r0.close();     // Catch: IOException -> L56
    L56:
        e = move-exception;
        e.printStackTrace();
    L38:
        e = e;
        goto L44
    L36:
        th = th;
    L42:
        e = e;
        r1 = null;
    L40:
        th = th;
        r1 = null;
        goto L53
    }

    private final boolean hideIcon() {
        ComponentName r0 = new ComponentName(this, AbstractC0295Gu.m625r(-800526069397557L));
        if (getPackageManager().getComponentEnabledSetting(r0) != 2) goto L6;
        return true;
    L6:
        return false;
    }

    private final void hideOrShowLauncherIcon(boolean r4) {
        ComponentName r0 = new ComponentName(this, AbstractC0295Gu.m625r(-800861076846645L));
        PackageManager r1 = getPackageManager();
        if (r4 == false) goto L5;
        int r42 = 2;
    L6:
        r1.setComponentEnabledSetting(r0, r42, 1);
        return;
    L5:
        r42 = 0;
        goto L6
    }

    @InterfaceC0759Rm
    private final long hookFlag() {
        return System.currentTimeMillis();
    }

    private static final void onCreate$lambda$0(MainActivity r2, CompoundButton r3, boolean r4) {
        AbstractC0295Gu.m625r(-801041465473077L);
        if (r3.isPressed() == false) goto L6;
        r2.hideOrShowLauncherIcon(r4);
        return;
    }

    private static final void onCreate$lambda$2$lambda$1(MainActivity r2, View r3) {
        r2.executeCmd(AbstractC0295Gu.m625r(-801071530244149L));
        r2.startAppWithPackageName(AbstractC0295Gu.m625r(-801196084295733L));
    }

    private static final void onCreate$lambda$4$lambda$3(MainActivity r1, View r2, View r3) {
        r1.startActivity(new Intent(r2.getContext(), TestActivity.class));
    }

    @Override // p000.AbstractActivityC2528t5
    @SuppressLint({"SetTextI18n"})
    public void onCreate() {
        C1313dA r1 = new C1313dA(0, 0);
        C1313dA r2 = new C1313dA(AbstractC1220bf.f4171a, AbstractC1220bf.f4172b);
        View r4 = getWindow().getDecorView();
        boolean r5 = true;
        if ((r4.getResources().getConfiguration().uiMode & 48) != 32) goto L5;
        boolean r3 = true;
    L7:
        if ((r4.getResources().getConfiguration().uiMode & 48) != 32) goto L9;
        boolean r6 = r3;
    L10:
        int r0 = Build.VERSION.SDK_INT;
        if (r0 < 30) goto L14;
        C1325df r02 = new C1412ff();
    L17:
        r02.mo2399a(r1, r2, getWindow(), r4, r5, r6);
        r02.mo2581b(getWindow());
        setContentView(R.layout.activity_main);
        LinearLayout r03 = (LinearLayout) findViewById(R.id.module_state);
        if (hookFlag() != 0) goto L20;
        int r12 = R.drawable.bg_status_card_success;
    L21:
        r03.setBackgroundResource(r12);
        ImageView r04 = (ImageView) findViewById(R.id.main_img_status);
        if (hookFlag() != 0) goto L24;
        int r13 = R.mipmap.ic_success;
    L25:
        r04.setImageResource(r13);
        ((TextView) findViewById(R.id.main_text_version)).setText(AbstractC0295Gu.m625r(-800813832206389L));
        TextView r05 = (TextView) findViewById(R.id.main_text_status);
        if (hookFlag() != 0) goto L28;
        int r14 = R.string.module_activated;
    L29:
        r05.setText(getString(r14));
        MaterialSwitch r06 = (MaterialSwitch) findViewById(R.id.hide_icon_in_launcher_switch);
        r06.setChecked(hideIcon());
        r06.setOnCheckedChangeListener(new C2132k9(this, 1));
        return;
    L28:
        r14 = R.string.module_not_activated;
        goto L29
    L24:
        r13 = R.mipmap.ic_warn;
        goto L25
    L20:
        r12 = R.drawable.bg_status_card_error;
        goto L21
    L14:
        if (r0 < 29) goto L16;
        r02 = new C1368ef();
        goto L17
    L16:
        r02 = new C1325df();
        goto L17
    L9:
        r6 = false;
        goto L10
    L5:
        r3 = true;
        r5 = false;
        goto L7
    }

    public final void startAppWithPackageName(String r4) {
        AbstractC0295Gu.m625r(-801440897431605L);
        PackageManager r0 = getPackageManager();     // Catch: Exception -> L5
        AbstractC0295Gu.m625r(-801492437039157L);     // Catch: Exception -> L5
        startActivity(r0.getLaunchIntentForPackage(r4));     // Catch: Exception -> L5
        return;
    }
}
