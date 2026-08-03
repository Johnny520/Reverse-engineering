package io.github.cherrywechat.p002ui.activity;

import android.annotation.SuppressLint;
import android.content.ComponentName;
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
    private final String executeCmd(String str) throws Throwable {
        Process processExec;
        DataOutputStream dataOutputStream;
        DataOutputStream dataOutputStream2 = null;
        try {
            try {
                processExec = Runtime.getRuntime().exec(AbstractC0295Gu.m625r(-801290573576245L));
                try {
                    dataOutputStream = new DataOutputStream(processExec.getOutputStream());
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
            processExec = null;
        } catch (Throwable th2) {
            th = th2;
            processExec = null;
        }
        try {
            dataOutputStream.writeBytes(str + '\n');
            dataOutputStream.flush();
            dataOutputStream.writeBytes(AbstractC0295Gu.m625r(-801303458478133L));
            dataOutputStream.flush();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(processExec.getErrorStream()));
            char[] cArr = new char[4096];
            StringBuilder sb = new StringBuilder();
            while (true) {
                int i = bufferedReader.read(cArr);
                if (i <= 0) {
                    break;
                }
                sb.append(cArr, 0, i);
                AbstractC0295Gu.m625r(-801329228281909L);
            }
            bufferedReader.close();
            String string = sb.toString();
            AbstractC0295Gu.m625r(-801380767889461L);
            int length = string.length() - 1;
            int i2 = 0;
            boolean z = false;
            while (i2 <= length) {
                boolean z2 = AbstractC0585Nj.m1139g(string.charAt(!z ? i2 : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i2++;
                } else {
                    z = true;
                }
            }
            String string2 = string.subSequence(i2, length + 1).toString();
            try {
                dataOutputStream.close();
            } catch (IOException e3) {
                e3.printStackTrace();
            }
            processExec.destroy();
            return string2;
        } catch (IOException e4) {
            e = e4;
            dataOutputStream2 = dataOutputStream;
            e.printStackTrace();
            String message = e.getMessage();
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.close();
                } catch (IOException e5) {
                    e5.printStackTrace();
                }
            }
            if (processExec != null) {
                processExec.destroy();
            }
            return message;
        } catch (Throwable th3) {
            th = th3;
            dataOutputStream2 = dataOutputStream;
            if (dataOutputStream2 != null) {
                try {
                    dataOutputStream2.close();
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            if (processExec == null) {
                throw th;
            }
            processExec.destroy();
            throw th;
        }
    }

    private final boolean hideIcon() {
        return getPackageManager().getComponentEnabledSetting(new ComponentName(this, AbstractC0295Gu.m625r(-800526069397557L))) == 2;
    }

    private final void hideOrShowLauncherIcon(boolean z) {
        getPackageManager().setComponentEnabledSetting(new ComponentName(this, AbstractC0295Gu.m625r(-800861076846645L)), z ? 2 : 0, 1);
    }

    @InterfaceC0759Rm
    private final long hookFlag() {
        return System.currentTimeMillis();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCreate$lambda$0(MainActivity mainActivity, CompoundButton compoundButton, boolean z) {
        AbstractC0295Gu.m625r(-801041465473077L);
        if (compoundButton.isPressed()) {
            mainActivity.hideOrShowLauncherIcon(z);
        }
    }

    private static final void onCreate$lambda$2$lambda$1(MainActivity mainActivity, View view) throws Throwable {
        mainActivity.executeCmd(AbstractC0295Gu.m625r(-801071530244149L));
        mainActivity.startAppWithPackageName(AbstractC0295Gu.m625r(-801196084295733L));
    }

    @Override // p000.AbstractActivityC2528t5
    @SuppressLint({"SetTextI18n"})
    public void onCreate() {
        boolean z;
        C1313dA c1313dA = new C1313dA(0, 0);
        C1313dA c1313dA2 = new C1313dA(AbstractC1220bf.f4171a, AbstractC1220bf.f4172b);
        View decorView = getWindow().getDecorView();
        boolean z2 = true;
        if ((decorView.getResources().getConfiguration().uiMode & 48) == 32) {
            z = true;
        } else {
            z = true;
            z2 = false;
        }
        boolean z3 = (decorView.getResources().getConfiguration().uiMode & 48) == 32 ? z : false;
        int i = Build.VERSION.SDK_INT;
        C1325df c1412ff = i >= 30 ? new C1412ff() : i >= 29 ? new C1368ef() : new C1325df();
        c1412ff.mo2399a(c1313dA, c1313dA2, getWindow(), decorView, z2, z3);
        c1412ff.mo2581b(getWindow());
        setContentView(R.layout.activity_main);
        ((LinearLayout) findViewById(R.id.module_state)).setBackgroundResource(hookFlag() == 0 ? R.drawable.bg_status_card_success : R.drawable.bg_status_card_error);
        ((ImageView) findViewById(R.id.main_img_status)).setImageResource(hookFlag() == 0 ? R.mipmap.ic_success : R.mipmap.ic_warn);
        ((TextView) findViewById(R.id.main_text_version)).setText(AbstractC0295Gu.m625r(-800813832206389L));
        ((TextView) findViewById(R.id.main_text_status)).setText(getString(hookFlag() == 0 ? R.string.module_activated : R.string.module_not_activated));
        MaterialSwitch materialSwitch = (MaterialSwitch) findViewById(R.id.hide_icon_in_launcher_switch);
        materialSwitch.setChecked(hideIcon());
        materialSwitch.setOnCheckedChangeListener(new C2132k9(this, 1));
    }

    public final void startAppWithPackageName(String str) {
        AbstractC0295Gu.m625r(-801440897431605L);
        try {
            PackageManager packageManager = getPackageManager();
            AbstractC0295Gu.m625r(-801492437039157L);
            startActivity(packageManager.getLaunchIntentForPackage(str));
        } catch (Exception unused) {
        }
    }
}
