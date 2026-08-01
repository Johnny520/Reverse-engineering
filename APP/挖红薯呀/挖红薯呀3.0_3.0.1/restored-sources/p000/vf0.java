package p000;

import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Typeface;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p000.cf1;
import p000.m00;

/* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
/* JADX INFO: loaded from: classes.dex */
public final class vf0 {

    /* JADX INFO: renamed from: a */
    public static final vf0 f6671a = new vf0();

    /* JADX INFO: renamed from: b */
    public static final int f6672b = 0;

    /* JADX INFO: renamed from: vf0$a */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0839a {

        /* JADX INFO: renamed from: a */
        private final TextView f6673a;

        /* JADX INFO: renamed from: b */
        private final LinearLayout f6674b;

        /* JADX INFO: renamed from: c */
        private boolean f6675c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0839a(TextView textView, LinearLayout linearLayout) {
            textView.getClass();
            linearLayout.getClass();
            this.f6673a = textView;
            this.f6674b = linearLayout;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final void m4715a() {
            this.f6675c = false;
            this.f6674b.setVisibility(8);
            this.f6673a.setText("▶");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final void m4716b() {
            this.f6675c = true;
            this.f6674b.setVisibility(0);
            this.f6673a.setText("▼");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final TextView m4717c() {
            return this.f6673a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final LinearLayout m4718d() {
            return this.f6674b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final boolean m4719e() {
            return this.f6675c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final void m4720f(boolean z) {
            this.f6675c = z;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final void m4721g() {
            if (this.f6675c) {
                m4715a();
            } else {
                m4716b();
            }
        }
    }

    /* JADX INFO: renamed from: vf0$b */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0840b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ float f6676a;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0840b(float f) {
            this.f6676a = f;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            view.getClass();
            outline.getClass();
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), this.f6676a);
        }
    }

    /* JADX INFO: renamed from: vf0$c */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0841c implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f6677a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SharedPreferences f6678b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0841c(TextView textView, SharedPreferences sharedPreferences) {
            this.f6677a = textView;
            this.f6678b = sharedPreferences;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            seekBar.getClass();
            this.f6677a.setText((i + 30) + "dp");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
            this.f6678b.edit().putInt(m00.f3663S.m2391p(), seekBar.getProgress() + 30).apply();
        }
    }

    /* JADX INFO: renamed from: vf0$d */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0842d implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ xt0 f6679a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f6680b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ SharedPreferences f6681c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0842d(xt0 xt0Var, TextView textView, SharedPreferences sharedPreferences) {
            this.f6679a = xt0Var;
            this.f6680b = textView;
            this.f6681c = sharedPreferences;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            seekBar.getClass();
            int i2 = i + 30;
            this.f6679a.f7423d = i2;
            this.f6680b.setText(i2 + "dp");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
            this.f6681c.edit().putInt(m00.f3663S.m2391p(), seekBar.getProgress() + 30).apply();
        }
    }

    /* JADX INFO: renamed from: vf0$e */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class RunnableC0843e implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ xt0 f6682d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ Dialog f6683e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ InterfaceC0298hw f6684f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ TextView f6685g;

        /* JADX INFO: renamed from: h */
        final /* synthetic */ Handler f6686h;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RunnableC0843e(xt0 xt0Var, Dialog dialog, InterfaceC0298hw interfaceC0298hw, TextView textView, Handler handler) {
            this.f6682d = xt0Var;
            this.f6683e = dialog;
            this.f6684f = interfaceC0298hw;
            this.f6685g = textView;
            this.f6686h = handler;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            int i = this.f6682d.f7423d;
            if (i <= 0) {
                try {
                    this.f6683e.dismiss();
                } catch (Exception unused) {
                }
                this.f6684f.invoke();
                return;
            }
            this.f6685g.setText(i + "s 后跳转...");
            xt0 xt0Var = this.f6682d;
            xt0Var.f7423d = xt0Var.f7423d + (-1);
            this.f6686h.postDelayed(this, 1000L);
        }
    }

    /* JADX INFO: renamed from: vf0$f */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0844f implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f6687a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SharedPreferences f6688b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0844f(TextView textView, SharedPreferences sharedPreferences) {
            this.f6687a = textView;
            this.f6688b = sharedPreferences;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            seekBar.getClass();
            this.f6687a.setText((i + 30) + "dp");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
            this.f6688b.edit().putInt(m00.f3663S.m2348K(), seekBar.getProgress() + 30).apply();
        }
    }

    /* JADX INFO: renamed from: vf0$g */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0845g implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ xt0 f6689a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f6690b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ SharedPreferences f6691c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0845g(xt0 xt0Var, TextView textView, SharedPreferences sharedPreferences) {
            this.f6689a = xt0Var;
            this.f6690b = textView;
            this.f6691c = sharedPreferences;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            seekBar.getClass();
            int i2 = i + 30;
            this.f6689a.f7423d = i2;
            this.f6690b.setText(i2 + "dp");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
            this.f6691c.edit().putInt(m00.f3663S.m2348K(), seekBar.getProgress() + 30).apply();
        }
    }

    /* JADX INFO: renamed from: vf0$h */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class RunnableC0846h implements Runnable {

        /* JADX INFO: renamed from: d */
        final /* synthetic */ xt0 f6692d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ TextView f6693e;

        /* JADX INFO: renamed from: f */
        final /* synthetic */ Handler f6694f;

        /* JADX INFO: renamed from: g */
        final /* synthetic */ Context f6695g;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public RunnableC0846h(xt0 xt0Var, TextView textView, Handler handler, Context context) {
            this.f6692d = xt0Var;
            this.f6693e = textView;
            this.f6694f = handler;
            this.f6695g = context;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // java.lang.Runnable
        public void run() {
            xt0 xt0Var = this.f6692d;
            int i = xt0Var.f7423d - 1;
            xt0Var.f7423d = i;
            TextView textView = this.f6693e;
            if (i > 0) {
                textView.setText("确定（" + i + "s）");
                this.f6694f.postDelayed(this, 1000L);
                return;
            }
            textView.setText("确定");
            this.f6693e.setEnabled(true);
            this.f6693e.setTextColor(-1);
            TextView textView2 = this.f6693e;
            GradientDrawable gradientDrawable = new GradientDrawable();
            Context context = this.f6695g;
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(vf0.f6671a.m4606e1(context, 28));
            gradientDrawable.setColor(Color.argb(220, 220, 50, 50));
            textView2.setBackground(gradientDrawable);
        }
    }

    /* JADX INFO: renamed from: vf0$i */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0847i implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ TextView f6696a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ SharedPreferences f6697b;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0847i(TextView textView, SharedPreferences sharedPreferences) {
            this.f6696a = textView;
            this.f6697b = sharedPreferences;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            seekBar.getClass();
            this.f6696a.setText((i + 30) + "dp");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
            this.f6697b.edit().putInt(m00.f3663S.m2357T(), seekBar.getProgress() + 30).apply();
        }
    }

    /* JADX INFO: renamed from: vf0$j */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0848j implements SeekBar.OnSeekBarChangeListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ xt0 f6698a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ TextView f6699b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ SharedPreferences f6700c;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0848j(xt0 xt0Var, TextView textView, SharedPreferences sharedPreferences) {
            this.f6698a = xt0Var;
            this.f6699b = textView;
            this.f6700c = sharedPreferences;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            seekBar.getClass();
            int i2 = i + 30;
            this.f6698a.f7423d = i2;
            this.f6699b.setText(i2 + "dp");
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            seekBar.getClass();
            this.f6700c.edit().putInt(m00.f3663S.m2357T(), seekBar.getProgress() + 30).apply();
        }
    }

    /* JADX INFO: renamed from: vf0$k */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0849k {

        /* JADX INFO: renamed from: a */
        private final String f6701a;

        /* JADX INFO: renamed from: b */
        private final String f6702b;

        /* JADX INFO: renamed from: c */
        private final boolean f6703c;

        /* JADX INFO: renamed from: d */
        private final String f6704d;

        /* JADX INFO: renamed from: e */
        private final String f6705e;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0849k(String str, String str2, boolean z, String str3, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            this.f6701a = str;
            this.f6702b = str2;
            this.f6703c = z;
            this.f6704d = str3;
            this.f6705e = str4;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public static /* synthetic */ C0849k m4722g(C0849k c0849k, String str, String str2, boolean z, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0849k.f6701a;
            }
            if ((i & 2) != 0) {
                str2 = c0849k.f6702b;
            }
            if ((i & 4) != 0) {
                z = c0849k.f6703c;
            }
            if ((i & 8) != 0) {
                str3 = c0849k.f6704d;
            }
            if ((i & 16) != 0) {
                str4 = c0849k.f6705e;
            }
            String str5 = str4;
            boolean z2 = z;
            return c0849k.m4728f(str, str2, z2, str3, str5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m4723a() {
            return this.f6701a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final String m4724b() {
            return this.f6702b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final boolean m4725c() {
            return this.f6703c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final String m4726d() {
            return this.f6704d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final String m4727e() {
            return this.f6705e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0849k)) {
                return false;
            }
            C0849k c0849k = (C0849k) obj;
            return p30.m3002l(this.f6701a, c0849k.f6701a) && p30.m3002l(this.f6702b, c0849k.f6702b) && this.f6703c == c0849k.f6703c && p30.m3002l(this.f6704d, c0849k.f6704d) && p30.m3002l(this.f6705e, c0849k.f6705e);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public final C0849k m4728f(String str, String str2, boolean z, String str3, String str4) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            str4.getClass();
            return new C0849k(str, str2, z, str3, str4);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final boolean m4729h() {
            return this.f6703c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.f6705e.hashCode() + ((this.f6704d.hashCode() + AbstractC0748t1.m4145c((this.f6702b.hashCode() + (this.f6701a.hashCode() * 31)) * 31, 31, this.f6703c)) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i */
        public final String m4730i() {
            return this.f6704d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: j */
        public final String m4731j() {
            return this.f6705e;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: k */
        public final String m4732k() {
            return this.f6702b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: l */
        public final String m4733l() {
            return this.f6701a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "SideMenuItem(tag=" + this.f6701a + ", key=" + this.f6702b + ", default=" + this.f6703c + ", displayName=" + this.f6704d + ", icon=" + this.f6705e + ")";
        }
    }

    /* JADX INFO: renamed from: vf0$l */
    /* JADX INFO: compiled from: r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6 */
    public static final class C0850l {

        /* JADX INFO: renamed from: a */
        private final String f6706a;

        /* JADX INFO: renamed from: b */
        private final boolean f6707b;

        /* JADX INFO: renamed from: c */
        private final String f6708c;

        /* JADX INFO: renamed from: d */
        private final String f6709d;

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public C0850l(String str, boolean z, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.f6706a = str;
            this.f6707b = z;
            this.f6708c = str2;
            this.f6709d = str3;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: f */
        public static /* synthetic */ C0850l m4734f(C0850l c0850l, String str, boolean z, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0850l.f6706a;
            }
            if ((i & 2) != 0) {
                z = c0850l.f6707b;
            }
            if ((i & 4) != 0) {
                str2 = c0850l.f6708c;
            }
            if ((i & 8) != 0) {
                str3 = c0850l.f6709d;
            }
            return c0850l.m4739e(str, z, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: a */
        public final String m4735a() {
            return this.f6706a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: b */
        public final boolean m4736b() {
            return this.f6707b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: c */
        public final String m4737c() {
            return this.f6708c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: d */
        public final String m4738d() {
            return this.f6709d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: e */
        public final C0850l m4739e(String str, boolean z, String str2, String str3) {
            str.getClass();
            str2.getClass();
            str3.getClass();
            return new C0850l(str, z, str2, str3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0850l)) {
                return false;
            }
            C0850l c0850l = (C0850l) obj;
            return p30.m3002l(this.f6706a, c0850l.f6706a) && this.f6707b == c0850l.f6707b && p30.m3002l(this.f6708c, c0850l.f6708c) && p30.m3002l(this.f6709d, c0850l.f6709d);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: g */
        public final boolean m4740g() {
            return this.f6707b;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: h */
        public final String m4741h() {
            return this.f6708c;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public int hashCode() {
            return this.f6709d.hashCode() + ((this.f6708c.hashCode() + AbstractC0748t1.m4145c(this.f6706a.hashCode() * 31, 31, this.f6707b)) * 31);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: i */
        public final String m4742i() {
            return this.f6709d;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX INFO: renamed from: j */
        public final String m4743j() {
            return this.f6706a;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public String toString() {
            return "TabItem(key=" + this.f6706a + ", default=" + this.f6707b + ", displayName=" + this.f6708c + ", icon=" + this.f6709d + ")";
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    private vf0() {
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A1 */
    public static final void m4476A1(Context context, int i, Dialog dialog) {
        View decorView;
        float fM4606e1 = f6671a.m4606e1(context, i);
        Window window = dialog.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.setClipToOutline(true);
        decorView.setOutlineProvider(new C0840b(fM4606e1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A2 */
    public static final na1 m4477A2(Dialog dialog, Context context) {
        dialog.dismiss();
        f6671a.m4613f3(context);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: A3 */
    private final void m4478A3(Dialog dialog, Context context, View view) {
        dialog.setContentView(view);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B2 */
    public static final na1 m4481B2(Context context, Dialog dialog) {
        Activity activity;
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
                break;
            }
            context = ((ContextWrapper) context).getBaseContext();
            context.getClass();
        }
        if (activity != null) {
            dialog.dismiss();
            DialogC0076c2 dialogC0076c2 = new DialogC0076c2(activity);
            dialogC0076c2.setOnDismissListener(new DialogInterfaceOnDismissListenerC0040b2(2));
            dialogC0076c2.show();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: B3 */
    private final void m4482B3(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences) {
        int i4 = i;
        List<C0850l> listM2783w = o30.m2783w(new C0850l(C0980yy.f7726l, false, "关注", "⭐"), new C0850l(C0980yy.f7727m, false, "发现", "🔍"), new C0850l(C0980yy.f7728n, false, "世界杯", "⚽"), new C0850l(C0980yy.f7729o, false, "同城", "📍"));
        Dialog dialog = new Dialog(context);
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        scrollView.setFillViewport(true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        vf0 vf0Var = f6671a;
        linearLayout2.setPadding(vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 8));
        linearLayout2.setBackgroundColor(iArgb);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        textView.setText("顶部Tab设置");
        textView.setTextSize(18.0f);
        textView.setTextColor(i4);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(0, vf0Var.m4606e1(context, 8), 0, vf0Var.m4606e1(context, 16));
        linearLayout3.addView(textView);
        linearLayout2.addView(linearLayout3);
        vt0 vt0Var = new vt0();
        vt0Var.f6825d = sharedPreferences.getBoolean(C0980yy.f7726l, false) || sharedPreferences.getBoolean(C0980yy.f7727m, false) || sharedPreferences.getBoolean(C0980yy.f7728n, false) || sharedPreferences.getBoolean(C0980yy.f7729o, false);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 10));
        linearLayout4.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 12));
        int i5 = i3;
        gradientDrawable.setColor(i5);
        linearLayout4.setBackground(gradientDrawable);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, "启用隐藏", 15.0f, i4);
        textViewM4151i.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        textViewM4151i.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout4.addView(textViewM4151i);
        TextView textView2 = new TextView(context);
        textView2.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8));
        textView2.setGravity(17);
        textView2.setTextSize(13.0f);
        vf0Var.m4507G3(context, textView2, vt0Var.f6825d);
        textView2.setTag(Boolean.valueOf(vt0Var.f6825d));
        textView2.setOnClickListener(new xe0(context, vt0Var, sharedPreferences, 0));
        linearLayout4.addView(textView2);
        linearLayout2.addView(linearLayout4);
        m4581Z0(context, linearLayout2, m4606e1(context, 2));
        for (C0850l c0850l : listM2783w) {
            boolean z = sharedPreferences.getBoolean(c0850l.m4743j(), c0850l.m4740g());
            linearLayout2.addView(f6671a.m4701x1(context, c0850l.m4742i(), c0850l.m4741h(), "首页顶部" + c0850l.m4741h() + "Tab按钮，设置后左右滑动首页生效，重启也需滑动触发", i4, i2, i5, z, new C0073c(12, sharedPreferences, c0850l)));
            i4 = i;
            i5 = i3;
        }
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(0);
        linearLayout5.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iArgb2 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "关闭", 14.0f, zM4611f1 ? -1 : Color.argb(255, 50, 50, 60), 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        vf0 vf0Var2 = f6671a;
        gradientDrawableM4150h.setCornerRadius(vf0Var2.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(iArgb2);
        textViewM4152j.setBackground(gradientDrawableM4150h);
        textViewM4152j.setPadding(0, vf0Var2.m4606e1(context, 12), 0, vf0Var2.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(0, 0, vf0Var2.m4606e1(context, 6), 0);
        textViewM4152j.setLayoutParams(layoutParams2);
        textViewM4152j.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 4));
        linearLayout5.addView(textViewM4152j);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, "完成", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h2 = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h2.setCornerRadius(vf0Var2.m4606e1(context, 28));
        gradientDrawableM4150h2.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j2.setBackground(gradientDrawableM4150h2);
        textViewM4152j2.setPadding(0, vf0Var2.m4606e1(context, 12), 0, vf0Var2.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams3.setMargins(vf0Var2.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams3);
        textViewM4152j2.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 5));
        linearLayout5.addView(textViewM4152j2);
        linearLayout5.setPadding(m4606e1(context, 16), m4606e1(context, 8), m4606e1(context, 16), m4606e1(context, 16));
        scrollView.addView(linearLayout2);
        linearLayout.addView(scrollView);
        linearLayout.addView(linearLayout5);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.5d));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C1 */
    public static final na1 m4485C1(Context context, int i, int i2, int i3, String str, long j, String str2, LinearLayout linearLayout) {
        linearLayout.getClass();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout2.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 4));
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, "模块版本", 13.0f, i2);
        textViewM4151i.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView = new TextView(context);
        textView.setText("v3.0.1 (30121)");
        textView.setTextSize(13.0f);
        textView.setTextColor(i3);
        linearLayout2.addView(textViewM4151i);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        linearLayout.addView(vf0Var.m4616g1(context, i));
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8));
        TextView textViewM4151i2 = AbstractC0748t1.m4151i(context, "当前版本", 13.0f, i2);
        textViewM4151i2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView2 = new TextView(context);
        textView2.setText(str + " (" + j + ")");
        textView2.setTextSize(13.0f);
        textView2.setTextColor(i3);
        linearLayout3.addView(textViewM4151i2);
        linearLayout3.addView(textView2);
        linearLayout.addView(linearLayout3);
        linearLayout.addView(vf0Var.m4616g1(context, i));
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8));
        TextView textViewM4151i3 = AbstractC0748t1.m4151i(context, "推荐版本", 13.0f, i2);
        textViewM4151i3.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        TextView textView3 = new TextView(context);
        textView3.setText(str2);
        textView3.setTextSize(13.0f);
        textView3.setTextColor(i3);
        linearLayout4.addView(textViewM4151i3);
        linearLayout4.addView(textView3);
        linearLayout.addView(linearLayout4);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C3 */
    public static final void m4487C3(Context context, vt0 vt0Var, SharedPreferences sharedPreferences, View view) {
        Object tag = view.getTag();
        tag.getClass();
        boolean z = !((Boolean) tag).booleanValue();
        view.setTag(Boolean.valueOf(z));
        f6671a.m4507G3(context, (TextView) view, z);
        vt0Var.f6825d = z;
        sharedPreferences.edit().putBoolean(C0980yy.f7726l, z).putBoolean(C0980yy.f7727m, z).putBoolean(C0980yy.f7728n, z).putBoolean(C0980yy.f7729o, z).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D1 */
    public static final boolean m4490D1(Context context, String str, View view) {
        Object systemService = context.getSystemService("vibrator");
        systemService.getClass();
        ((Vibrator) systemService).vibrate(VibrationEffect.createOneShot(50L, -1));
        Object systemService2 = context.getSystemService("clipboard");
        systemService2.getClass();
        ((ClipboardManager) systemService2).setPrimaryClip(ClipData.newPlainText("version_info", str));
        Toast.makeText(context, "已全部复制", 0).show();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D2 */
    public static final void m4491D2(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D3 */
    public static final na1 m4492D3(SharedPreferences sharedPreferences, C0850l c0850l, boolean z) {
        sharedPreferences.edit().putBoolean(c0850l.m4743j(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E1 */
    public static final na1 m4495E1(Context context, LinearLayout linearLayout) {
        linearLayout.getClass();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        vf0 vf0Var = f6671a;
        linearLayout2.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 12));
        TextView textView = new TextView(context);
        textView.setText("致谢名单 →");
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.argb(255, 254, 44, 85));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: E2 */
    private final void m4496E2(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences) {
        String strM2389n = m00.f3663S.m2389n();
        String str = m00.f3726x1;
        String string = sharedPreferences.getString(strM2389n, m00.f3726x1);
        if (string != null) {
            str = string;
        }
        Dialog dialog = new Dialog(context);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 24), vf0Var.m4606e1(context, 24), vf0Var.m4606e1(context, 24), vf0Var.m4606e1(context, 16));
        linearLayout.setBackgroundColor(-1);
        TextView textView = new TextView(context);
        textView.setText("设置粉丝数");
        textView.setTextSize(18.0f);
        textView.setTextColor(Color.argb(255, 30, 30, 30));
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textView);
        EditText editText = new EditText(context);
        editText.setText(str);
        editText.setTextSize(16.0f);
        editText.setTextColor(Color.argb(255, 30, 30, 30));
        editText.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 10));
        gradientDrawable.setColor(Color.argb(40, 0, 0, 0));
        editText.setBackground(gradientDrawable);
        editText.setInputType(2);
        editText.setSelection(str.length());
        linearLayout.addView(editText);
        TextView textView2 = new TextView(context);
        textView2.setText("修改完毕后需在个人主页下拉刷新生效");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(Color.argb(150, 100, 100, 100));
        textView2.setGravity(17);
        textView2.setPadding(0, vf0Var.m4606e1(context, 6), 0, 0);
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, vf0Var.m4606e1(context, 16), 0, 0);
        linearLayout2.setLayoutParams(layoutParams);
        TextView textView3 = new TextView(context);
        textView3.setText("取消");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(Color.argb(255, 100, 100, 100));
        textView3.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(vf0Var.m4606e1(context, 24));
        gradientDrawable2.setColor(Color.argb(60, 200, 200, 200));
        textView3.setBackground(gradientDrawable2);
        textView3.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(0, 0, vf0Var.m4606e1(context, 8), 0);
        textView3.setLayoutParams(layoutParams2);
        textView3.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 16));
        linearLayout2.addView(textView3);
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "保存", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var.m4606e1(context, 24));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j.setBackground(gradientDrawableM4150h);
        textViewM4152j.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams3.setMargins(vf0Var.m4606e1(context, 8), 0, 0, 0);
        textViewM4152j.setLayoutParams(layoutParams3);
        textViewM4152j.setOnClickListener(new ViewOnClickListenerC0869vy((Object) editText, (Object) sharedPreferences, dialog, 3));
        linearLayout2.addView(textViewM4152j);
        linearLayout.addView(linearLayout2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.8d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 20);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E3 */
    public static final void m4497E3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F1 */
    public static final void m4500F1(Context context, View view) {
        f6671a.m4555S2(context, new bf0(context, 2));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F2 */
    public static final void m4501F2(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F3 */
    public static final void m4502F3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G1 */
    public static final na1 m4505G1(Context context) {
        Intent intent = new Intent();
        intent.setClassName(C0013ac.f94b, "top.anjao2024.xp1whs.MainActivity");
        intent.putExtra("open_tab", "thanks");
        intent.addFlags(268435456);
        context.startActivity(intent);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G2 */
    public static final void m4506G2(EditText editText, SharedPreferences sharedPreferences, Dialog dialog, View view) {
        String string = k41.m1775g0(editText.getText().toString()).toString();
        if (string.length() > 0) {
            int i = 0;
            while (true) {
                if (i < string.length()) {
                    if (!Character.isDigit(string.charAt(i))) {
                        break;
                    } else {
                        i++;
                    }
                } else if (r41.m3383T(string) != null) {
                    sharedPreferences.edit().putString(m00.f3663S.m2389n(), string).apply();
                }
            }
        }
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: G3 */
    private final void m4507G3(Context context, TextView textView, boolean z) {
        textView.setText(z ? "✓ 已开启" : "✗ 已关闭");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f6671a.m4606e1(context, 10));
        if (z) {
            gradientDrawable.setColor(Color.argb(200, 254, 44, 85));
        } else {
            gradientDrawable.setColor(Color.argb(100, 120, 120, 130));
        }
        textView.setBackground(gradientDrawable);
        textView.setTextColor(-1);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H1 */
    public static final na1 m4510H1(Context context, int i, LinearLayout linearLayout) {
        linearLayout.getClass();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setGravity(17);
        vf0 vf0Var = f6671a;
        linearLayout2.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 10));
        TextView textView = new TextView(context);
        textView.setText("❤ 自愿打赏 →");
        textView.setTextSize(14.0f);
        textView.setTextColor(Color.argb(255, 254, 44, 85));
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setGravity(17);
        TextView textView2 = new TextView(context);
        textView2.setText("觉得模块不错？点击支持作者，感谢你的鼓励！");
        textView2.setTextSize(10.0f);
        textView2.setTextColor(i);
        textView2.setGravity(17);
        textView2.setPadding(0, vf0Var.m4606e1(context, 2), 0, 0);
        linearLayout2.addView(textView);
        linearLayout2.addView(textView2);
        linearLayout.addView(linearLayout2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: H2 */
    private final void m4511H2(Context context, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zM4611f1 = m4611f1(context);
        if (zM4611f1) {
            i3 = 28;
            i4 = 22;
        } else {
            i3 = 252;
            i4 = 248;
        }
        int iArgb = Color.argb(255, i4, i4, i3);
        if (zM4611f1) {
            i5 = 90;
            i6 = 80;
        } else {
            i5 = 210;
            i6 = 200;
        }
        int iArgb2 = Color.argb(140, i6, i6, i5);
        int iArgb3 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        m00.C0452a c0452a = m00.f3663S;
        int i7 = 0;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 18), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "浮动下载按钮", 20.0f, i, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textViewM4152j);
        vt0 vt0Var = new vt0();
        boolean z = sharedPreferences.getBoolean(c0452a.m2390o(), c0452a.m2368c());
        vt0Var.f6825d = z;
        linearLayout.addView(m4596c1(context, "启用浮动按钮", i, z, new ve0(vt0Var, sharedPreferences, i7)));
        int i8 = sharedPreferences.getInt(c0452a.m2391p(), c0452a.m2370d());
        TextView textView = new TextView(context);
        textView.setText(i8 + "dp");
        textView.setTextSize(24.0f);
        textView.setTextColor(i);
        textView.setGravity(17);
        textView.setPadding(0, vf0Var.m4606e1(context, 8), 0, vf0Var.m4606e1(context, 10));
        linearLayout.addView(textView);
        SeekBar seekBarM4591b1 = m4591b1(context, i8);
        seekBarM4591b1.setMax(70);
        seekBarM4591b1.setProgress(w60.m4907n(i8 - 30, 0, seekBarM4591b1.getMax()));
        seekBarM4591b1.setOnSeekBarChangeListener(new C0841c(textView, sharedPreferences));
        linearLayout.addView(seekBarM4591b1);
        TextView textView2 = new TextView(context);
        textView2.setText("拖动滑块调整大小，下次进入笔记时生效");
        textView2.setTextSize(11.0f);
        textView2.setTextColor(i2);
        textView2.setPadding(0, vf0Var.m4606e1(context, 10), 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textView2);
        m4569W0(context, linearLayout, iArgb3, iArgb2, new we0(dialog, i7));
        m4478A3(dialog, context, linearLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I1 */
    public static final void m4514I1(Context context, View view) {
        f6671a.m4555S2(context, new bf0(context, 1));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I2 */
    public static final na1 m4515I2(vt0 vt0Var, SharedPreferences sharedPreferences, boolean z) {
        vt0Var.f6825d = z;
        sharedPreferences.edit().putBoolean(m00.f3663S.m2390o(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J1 */
    public static final na1 m4518J1(Context context) {
        Intent intent = new Intent();
        intent.setClassName(C0013ac.f94b, "top.anjao2024.xp1whs.MainActivity");
        intent.putExtra("open_tab", "thanks");
        intent.putExtra("open_donate", true);
        intent.addFlags(268435456);
        context.startActivity(intent);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J2 */
    public static final na1 m4519J2(Dialog dialog) {
        dialog.dismiss();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K1 */
    public static final boolean m4522K1(cf1.C0090a c0090a, Context context, View view) {
        String strM526f = c0090a != null ? c0090a.m526f() : null;
        if (strM526f == null || k41.m1769a0(strM526f)) {
            Toast.makeText(context, "当前未登录，无法复制", 0).show();
            return true;
        }
        Object systemService = context.getSystemService("clipboard");
        systemService.getClass();
        ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("user_id", strM526f));
        Toast.makeText(context, "复制小红书ID成功: ".concat(strM526f), 0).show();
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: K2 */
    private final void m4523K2(Context context) {
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(150, 255, 255, 255) : Color.argb(150, 80, 80, 90);
        int iArgb4 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb5 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        m00.C0452a c0452a = m00.f3663S;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        xt0 xt0Var = new xt0();
        xt0Var.f7423d = sharedPreferences.getInt(c0452a.m2391p(), c0452a.m2370d());
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 18), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "浮动按钮大小", 20.0f, iArgb2, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 20));
        linearLayout.addView(textViewM4152j);
        TextView textView = new TextView(context);
        textView.setText(xt0Var.f7423d + "dp");
        textView.setTextSize(28.0f);
        textView.setTextColor(iArgb2);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 14));
        linearLayout.addView(textView);
        SeekBar seekBarM4591b1 = m4591b1(context, xt0Var.f7423d);
        seekBarM4591b1.setOnSeekBarChangeListener(new C0842d(xt0Var, textView, sharedPreferences));
        linearLayout.addView(seekBarM4591b1);
        TextView textView2 = new TextView(context);
        textView2.setText("拖动滑块调整大小，下次进入笔记时生效");
        textView2.setTextSize(11.0f);
        textView2.setTextColor(iArgb3);
        textView2.setPadding(0, vf0Var.m4606e1(context, 10), 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView3 = new TextView(context);
        textView3.setText("← 返回");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(iArgb5);
        textView3.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable.setColor(iArgb4);
        textView3.setBackground(gradientDrawable);
        textView3.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, vf0Var.m4606e1(context, 6), 0);
        textView3.setLayoutParams(layoutParams);
        textView3.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 17));
        linearLayout2.addView(textView3);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, "完成", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j2.setBackground(gradientDrawableM4150h);
        textViewM4152j2.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(vf0Var.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams2);
        textViewM4152j2.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 18));
        linearLayout2.addView(textViewM4152j2);
        linearLayout.addView(linearLayout2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L1 */
    public static final na1 m4526L1(Context context, int i, int i2, LinearLayout linearLayout) {
        linearLayout.getClass();
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout2.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 10));
        TextView textView = new TextView(context);
        textView.setText("📢");
        textView.setTextSize(18.0f);
        textView.setGravity(17);
        textView.setPadding(0, 0, vf0Var.m4606e1(context, 8), 0);
        linearLayout2.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("查看最新在线通知");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(i);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText("›");
        textView3.setTextSize(22.0f);
        textView3.setTextColor(i2);
        textView3.setGravity(17);
        textView3.setPadding(vf0Var.m4606e1(context, 8), 0, 0, 0);
        linearLayout2.addView(textView3);
        linearLayout.addView(linearLayout2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L2 */
    public static final void m4527L2(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M1 */
    public static final void m4530M1(Context context, View view) {
        Context context2 = null;
        try {
            if (context instanceof Activity) {
                context2 = (Activity) context;
            }
        } catch (Exception unused) {
        }
        if (context2 == null) {
            context2 = context;
        }
        hk0.f2275a.m1372y(context2, new bf0(context, 0));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M2 */
    public static final void m4531M2(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N1 */
    public static final na1 m4534N1(Context context) {
        Toast.makeText(context, "当前没有新的在线通知公告", 0).show();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: N2 */
    private final void m4535N2(Context context, int i, int i2, int i3) {
        int i4 = i;
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb3 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        int i5 = 1;
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 18), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "隐藏原生导航栏按钮", 20.0f, i4, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.addView(textViewM4152j);
        m00.C0452a c0452a = m00.f3663S;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        vt0 vt0Var = new vt0();
        vt0Var.f6825d = c0452a.m2375f0(context);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout2.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 12));
        gradientDrawable.setColor(i3);
        linearLayout2.setBackground(gradientDrawable);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, "启用隐藏", 15.0f, i4);
        int i6 = iArgb2;
        textViewM4151i.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        textViewM4151i.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.addView(textViewM4151i);
        TextView textView = new TextView(context);
        textView.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8));
        textView.setGravity(17);
        textView.setTextSize(13.0f);
        vf0Var.m4507G3(context, textView, vt0Var.f6825d);
        textView.setTag(Boolean.valueOf(vt0Var.f6825d));
        textView.setOnClickListener(new xe0(context, vt0Var, sharedPreferences, 2));
        linearLayout2.addView(textView);
        linearLayout.addView(linearLayout2);
        TextView textView2 = new TextView(context);
        textView2.setText("取消勾选即隐藏对应原生按钮，修改立即生效");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(i2);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textView2);
        List listM2783w = o30.m2783w("★ 发现", "🛒 商城", "➕ 发布", "✉ 消息", "☺ 我的");
        final xt0 xt0Var = new xt0();
        xt0Var.f7423d = c0452a.m2376g(context);
        Iterator it = listM2783w.iterator();
        final int i7 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            int i8 = i7 + 1;
            if (i7 < 0) {
                o30.m2757A();
                throw null;
            }
            String str = (String) next;
            boolean z = (xt0Var.f7423d & (1 << i7)) != 0;
            TextView textViewM4151i2 = AbstractC0748t1.m4151i(context, str, 16.0f, i4);
            vf0 vf0Var2 = f6671a;
            textViewM4151i2.setPadding(vf0Var2.m4606e1(context, 14), vf0Var2.m4606e1(context, 10), vf0Var2.m4606e1(context, 8), vf0Var2.m4606e1(context, 10));
            textViewM4151i2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            final TextView textView3 = new TextView(context);
            textView3.setText(z ? "☐" : "☑");
            textView3.setTextSize(24.0f);
            textView3.setGravity(17);
            Iterator it2 = it;
            textView3.setPadding(vf0Var2.m4606e1(context, 12), vf0Var2.m4606e1(context, 8), vf0Var2.m4606e1(context, 12), vf0Var2.m4606e1(context, 8));
            textView3.setTextColor(!z ? Color.argb(255, 254, 44, 85) : Color.argb(120, 120, 120, 130));
            textView3.setTag(Boolean.valueOf(z));
            textView3.setOnClickListener(new View.OnClickListener() { // from class: hf0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vf0.m4543P2(textView3, xt0Var, i7, view);
                }
            });
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(0);
            linearLayout3.setGravity(16);
            linearLayout3.setPadding(vf0Var2.m4606e1(context, 4), vf0Var2.m4606e1(context, 4), vf0Var2.m4606e1(context, 4), vf0Var2.m4606e1(context, 4));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(0, 0, 0, vf0Var2.m4606e1(context, 6));
            linearLayout3.setLayoutParams(layoutParams2);
            GradientDrawable gradientDrawable2 = new GradientDrawable();
            gradientDrawable2.setShape(0);
            gradientDrawable2.setCornerRadius(vf0Var2.m4606e1(context, 12));
            gradientDrawable2.setColor(i3);
            linearLayout3.setBackground(gradientDrawable2);
            linearLayout3.addView(textViewM4151i2);
            linearLayout3.addView(textView3);
            linearLayout.addView(linearLayout3);
            i4 = i;
            i7 = i8;
            it = it2;
        }
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        vf0 vf0Var3 = f6671a;
        layoutParams3.setMargins(0, vf0Var3.m4606e1(context, 4), 0, 0);
        linearLayout4.setLayoutParams(layoutParams3);
        TextView textView4 = new TextView(context);
        textView4.setText("取消");
        textView4.setTextSize(14.0f);
        textView4.setTextColor(iArgb3);
        textView4.setGravity(17);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(vf0Var3.m4606e1(context, 28));
        gradientDrawable3.setColor(i6);
        textView4.setBackground(gradientDrawable3);
        textView4.setPadding(0, vf0Var3.m4606e1(context, 12), 0, vf0Var3.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.setMargins(0, 0, vf0Var3.m4606e1(context, 6), 0);
        textView4.setLayoutParams(layoutParams4);
        textView4.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 9));
        linearLayout4.addView(textView4);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, "保存", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var3.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j2.setBackground(gradientDrawableM4150h);
        textViewM4152j2.setPadding(0, vf0Var3.m4606e1(context, 12), 0, vf0Var3.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams5.setMargins(vf0Var3.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams5);
        textViewM4152j2.setOnClickListener(new ViewOnClickListenerC0869vy((Object) context, (Object) xt0Var, dialog, i5));
        linearLayout4.addView(textViewM4152j2);
        linearLayout.addView(linearLayout4);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O1 */
    public static final na1 m4538O1(final SharedPreferences sharedPreferences, final Context context, int i, int i2, final int i3, final int i4, final int i5, final TextView textView, LinearLayout linearLayout) {
        linearLayout.getClass();
        m00.C0452a c0452a = m00.f3663S;
        sharedPreferences.getBoolean(c0452a.m2390o(), c0452a.m2368c());
        vf0 vf0Var = f6671a;
        linearLayout.addView(vf0Var.m4671r1(context, i, i2, new cf0(i3, context, i4, 3)));
        linearLayout.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: uf0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                return vf0.m4550R1(context, i3, i4, i5, sharedPreferences, textView, (LinearLayout) obj);
            }
        }));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O2 */
    public static final void m4539O2(Context context, vt0 vt0Var, SharedPreferences sharedPreferences, View view) {
        Object tag = view.getTag();
        tag.getClass();
        boolean z = !((Boolean) tag).booleanValue();
        view.setTag(Boolean.valueOf(z));
        f6671a.m4507G3(context, (TextView) view, z);
        vt0Var.f6825d = z;
        sharedPreferences.edit().putBoolean(m00.f3663S.m2339B(), z).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P1 */
    public static final na1 m4542P1(Context context, int i, int i2, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(f6671a.m4621h1(context, "📋", "浮动下载按钮", "在笔记页面显示浮动下载按钮", i, i2, new gf0(i, context, i2, 2)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P2 */
    public static final void m4543P2(TextView textView, xt0 xt0Var, int i, View view) {
        Object tag = textView.getTag();
        tag.getClass();
        boolean zBooleanValue = ((Boolean) tag).booleanValue();
        textView.setTag(Boolean.valueOf(!zBooleanValue));
        textView.setText(!zBooleanValue ? "☐" : "☑");
        textView.setTextColor(zBooleanValue ? Color.argb(255, 254, 44, 85) : Color.argb(120, 120, 120, 130));
        xt0Var.f7423d = !zBooleanValue ? (1 << i) | xt0Var.f7423d : (~(1 << i)) & xt0Var.f7423d;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q1 */
    public static final na1 m4546Q1(Context context, int i, int i2) {
        f6671a.m4511H2(context, i, i2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public static final void m4547Q2(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R1 */
    public static final na1 m4550R1(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences, TextView textView, LinearLayout linearLayout) {
        linearLayout.getClass();
        vf0 vf0Var = f6671a;
        m00.C0452a c0452a = m00.f3663S;
        linearLayout.addView(vf0Var.m4631j1(context, "📁", "保存目录", "当前：" + c0452a.m2367b0(context), i, i2, new C0081c7(7, context, textView)));
        linearLayout.addView(vf0Var.m4616g1(context, i3));
        linearLayout.addView(m4646m1(vf0Var, context, "📂", "分类保存", "原图/动态图/视频分别创建对应文件夹分类存放", i, i2, c0452a.m2371d0(context), false, new ye0(sharedPreferences, 6), 128, null));
        linearLayout.addView(vf0Var.m4616g1(context, i3));
        linearLayout.addView(m4646m1(vf0Var, context, "📅", "按日期保存", "下载时自动创建当天日期命名的文件夹（如 2026.5.1）", i, i2, c0452a.m2373e0(context), false, new ye0(sharedPreferences, 7), 128, null));
        linearLayout.addView(vf0Var.m4616g1(context, i3));
        linearLayout.addView(m4646m1(vf0Var, context, "📊", "下载进度弹窗", "下载时显示进度弹窗，可查看进度、速度和取消下载", i, i2, sharedPreferences.getBoolean(c0452a.m2382j(), false), false, new ye0(sharedPreferences, 8), 128, null));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public static final void m4551R2(Context context, xt0 xt0Var, Dialog dialog, View view) {
        m00.f3663S.m2383j0(context, xt0Var.f7423d);
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S1 */
    public static final na1 m4554S1(Context context, TextView textView) {
        f6671a.m4633j3(context, textView);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: S2 */
    private final void m4555S2(Context context, InterfaceC0298hw interfaceC0298hw) {
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(180, 255, 255, 255) : Color.argb(180, 80, 80, 90);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(false);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 24), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, "⚠️ 提示", 18.0f, iArgb2);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textViewM4151i.setTypeface(typeface);
        textViewM4151i.setGravity(17);
        textViewM4151i.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textViewM4151i);
        TextView textView = new TextView(context);
        textView.setText("即将跳转模块主界面，若跳转失败或闪退，请检查是否对小红书隐藏了模块。可打开桌面模块APP查看，或从LSPosed管理器启动模块。");
        textView.setTextSize(13.0f);
        textView.setTextColor(iArgb3);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("3s 后跳转...");
        textView2.setTextSize(14.0f);
        textView2.setTextColor(Color.argb(220, 254, 44, 85));
        textView2.setTypeface(typeface);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textView2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
        Handler handler = new Handler(Looper.getMainLooper());
        xt0 xt0Var = new xt0();
        xt0Var.f7423d = 3;
        handler.postDelayed(new RunnableC0843e(xt0Var, dialog, interfaceC0298hw, textView2, handler), 1000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T1 */
    public static final na1 m4558T1(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2378h(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: T2 */
    private final void m4559T2(Context context, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zM4611f1 = m4611f1(context);
        if (zM4611f1) {
            i3 = 28;
            i4 = 22;
        } else {
            i3 = 252;
            i4 = 248;
        }
        int iArgb = Color.argb(255, i4, i4, i3);
        if (zM4611f1) {
            i5 = 90;
            i6 = 80;
        } else {
            i5 = 210;
            i6 = 200;
        }
        int iArgb2 = Color.argb(140, i6, i6, i5);
        int iArgb3 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        m00.C0452a c0452a = m00.f3663S;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 18), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "笔记页回到顶部按钮", 20.0f, i, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textViewM4152j);
        vt0 vt0Var = new vt0();
        boolean z = sharedPreferences.getBoolean(c0452a.m2346I(), true);
        vt0Var.f6825d = z;
        linearLayout.addView(m4596c1(context, "启用回到顶部", i, z, new ve0(vt0Var, sharedPreferences, 1)));
        int i7 = sharedPreferences.getInt(c0452a.m2348K(), 44);
        TextView textView = new TextView(context);
        textView.setText(i7 + "dp");
        textView.setTextSize(24.0f);
        textView.setTextColor(i);
        textView.setGravity(17);
        textView.setPadding(0, vf0Var.m4606e1(context, 8), 0, vf0Var.m4606e1(context, 10));
        linearLayout.addView(textView);
        SeekBar seekBarM4591b1 = m4591b1(context, i7);
        seekBarM4591b1.setMax(42);
        seekBarM4591b1.setProgress(w60.m4907n(i7 - 30, 0, seekBarM4591b1.getMax()));
        seekBarM4591b1.setOnSeekBarChangeListener(new C0844f(textView, sharedPreferences));
        linearLayout.addView(seekBarM4591b1);
        TextView textView2 = new TextView(context);
        textView2.setText("拖动滑块调整大小，下次进入笔记页时生效");
        textView2.setTextSize(11.0f);
        textView2.setTextColor(i2);
        textView2.setPadding(0, vf0Var.m4606e1(context, 10), 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textView2);
        m4569W0(context, linearLayout, iArgb3, iArgb2, new we0(dialog, 1));
        m4478A3(dialog, context, linearLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U1 */
    public static final na1 m4562U1(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2380i(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U2 */
    public static final na1 m4563U2(vt0 vt0Var, SharedPreferences sharedPreferences, boolean z) {
        vt0Var.f6825d = z;
        sharedPreferences.edit().putBoolean(m00.f3663S.m2346I(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V1 */
    public static final na1 m4566V1(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2382j(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public static final na1 m4567V2(Dialog dialog) {
        dialog.dismiss();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W0 */
    private final void m4569W0(Context context, LinearLayout linearLayout, int i, int i2, InterfaceC0298hw interfaceC0298hw) {
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        textView.setText("取消");
        textView.setTextSize(14.0f);
        textView.setTextColor(i);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        vf0 vf0Var = f6671a;
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable.setColor(i2);
        textView.setBackground(gradientDrawable);
        textView.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, vf0Var.m4606e1(context, 6), 0);
        textView.setLayoutParams(layoutParams);
        textView.setOnClickListener(new d00(2, interfaceC0298hw));
        linearLayout2.addView(textView);
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "完成", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 254, 44, 85));
        textViewM4152j.setBackground(gradientDrawableM4150h);
        textViewM4152j.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(vf0Var.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j.setLayoutParams(layoutParams2);
        textViewM4152j.setOnClickListener(new d00(3, interfaceC0298hw));
        linearLayout2.addView(textViewM4152j);
        linearLayout.addView(linearLayout2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W1 */
    public static final na1 m4570W1(final SharedPreferences sharedPreferences, final Context context, int i, int i2, LinearLayout linearLayout, final int i3, final int i4, int i5, LinearLayout linearLayout2) {
        linearLayout2.getClass();
        m00.C0452a c0452a = m00.f3663S;
        sharedPreferences.getBoolean(c0452a.m2355R(), true);
        vf0 vf0Var = f6671a;
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new cf0(i3, context, i4, 0)));
        vf0Var.m4581Z0(context, linearLayout, vf0Var.m4606e1(context, 4));
        sharedPreferences.getBoolean(c0452a.m2346I(), true);
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new cf0(i3, context, i4, 1)));
        final boolean z = sharedPreferences.getBoolean(c0452a.m2345H(), false);
        final int i6 = 0;
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: df0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        return vf0.m4592b2(context, i3, i4, z, sharedPreferences, (LinearLayout) obj);
                    case 1:
                        return vf0.m4612f2(context, i3, i4, z, sharedPreferences, (LinearLayout) obj);
                    case 2:
                        return vf0.m4637k2(context, i3, i4, z, sharedPreferences, (LinearLayout) obj);
                    default:
                        return vf0.m4647m2(context, i3, i4, z, sharedPreferences, (LinearLayout) obj);
                }
            }
        }));
        final boolean zM3002l = p30.m3002l(n90.f4211a.m2678y(context), "X");
        final boolean z2 = zM3002l ? sharedPreferences.getBoolean(c0452a.m2351N(), false) : false;
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: ef0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                return vf0.m4602d2(context, zM3002l, i3, i4, z2, sharedPreferences, (LinearLayout) obj);
            }
        }));
        final boolean z3 = sharedPreferences.getBoolean(c0452a.m2384k(), false);
        final int i7 = 1;
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: df0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i7) {
                    case 0:
                        return vf0.m4592b2(context, i3, i4, z3, sharedPreferences, (LinearLayout) obj);
                    case 1:
                        return vf0.m4612f2(context, i3, i4, z3, sharedPreferences, (LinearLayout) obj);
                    case 2:
                        return vf0.m4637k2(context, i3, i4, z3, sharedPreferences, (LinearLayout) obj);
                    default:
                        return vf0.m4647m2(context, i3, i4, z3, sharedPreferences, (LinearLayout) obj);
                }
            }
        }));
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new ff0(context, sharedPreferences, i3, i4, i5, i)));
        final boolean z4 = sharedPreferences.getBoolean(c0452a.m2352O(), false);
        final int i8 = 2;
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: df0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i8) {
                    case 0:
                        return vf0.m4592b2(context, i3, i4, z4, sharedPreferences, (LinearLayout) obj);
                    case 1:
                        return vf0.m4612f2(context, i3, i4, z4, sharedPreferences, (LinearLayout) obj);
                    case 2:
                        return vf0.m4637k2(context, i3, i4, z4, sharedPreferences, (LinearLayout) obj);
                    default:
                        return vf0.m4647m2(context, i3, i4, z4, sharedPreferences, (LinearLayout) obj);
                }
            }
        }));
        vf0Var.m4581Z0(context, linearLayout, vf0Var.m4606e1(context, 4));
        final boolean z5 = sharedPreferences.getBoolean(c0452a.m2361X(), true);
        final int i9 = 3;
        linearLayout2.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: df0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i9) {
                    case 0:
                        return vf0.m4592b2(context, i3, i4, z5, sharedPreferences, (LinearLayout) obj);
                    case 1:
                        return vf0.m4612f2(context, i3, i4, z5, sharedPreferences, (LinearLayout) obj);
                    case 2:
                        return vf0.m4637k2(context, i3, i4, z5, sharedPreferences, (LinearLayout) obj);
                    default:
                        return vf0.m4647m2(context, i3, i4, z5, sharedPreferences, (LinearLayout) obj);
                }
            }
        }));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: W2 */
    private final void m4571W2(Context context) {
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(150, 255, 255, 255) : Color.argb(150, 80, 80, 90);
        int iArgb4 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb5 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        m00.C0452a c0452a = m00.f3663S;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        xt0 xt0Var = new xt0();
        xt0Var.f7423d = sharedPreferences.getInt(c0452a.m2348K(), 44);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 18), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "笔记页回到顶部按钮大小", 20.0f, iArgb2, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 20));
        linearLayout.addView(textViewM4152j);
        TextView textView = new TextView(context);
        textView.setText(xt0Var.f7423d + "dp");
        textView.setTextSize(28.0f);
        textView.setTextColor(iArgb2);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 14));
        linearLayout.addView(textView);
        SeekBar seekBarM4591b1 = m4591b1(context, xt0Var.f7423d);
        seekBarM4591b1.setMax(42);
        seekBarM4591b1.setProgress(w60.m4907n(xt0Var.f7423d - 30, 0, seekBarM4591b1.getMax()));
        seekBarM4591b1.setOnSeekBarChangeListener(new C0845g(xt0Var, textView, sharedPreferences));
        linearLayout.addView(seekBarM4591b1);
        TextView textView2 = new TextView(context);
        textView2.setText("拖动滑块调整大小，下次进入笔记页时生效");
        textView2.setTextSize(11.0f);
        textView2.setTextColor(iArgb3);
        textView2.setPadding(0, vf0Var.m4606e1(context, 10), 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView3 = new TextView(context);
        textView3.setText("← 返回");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(iArgb5);
        textView3.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable.setColor(iArgb4);
        textView3.setBackground(gradientDrawable);
        textView3.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, vf0Var.m4606e1(context, 6), 0);
        textView3.setLayoutParams(layoutParams);
        textView3.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 11));
        linearLayout2.addView(textView3);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, "完成", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j2.setBackground(gradientDrawableM4150h);
        textViewM4152j2.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(vf0Var.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams2);
        textViewM4152j2.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 12));
        linearLayout2.addView(textViewM4152j2);
        linearLayout.addView(linearLayout2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public static final void m4573X0(InterfaceC0298hw interfaceC0298hw, View view) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public static final na1 m4574X1(Context context, int i, int i2, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(f6671a.m4621h1(context, "⬆", "主页回到顶部按钮", "在别人主页可以一键重置回到顶部，开关需要下次进入笔记生效", i, i2, new gf0(i, context, i2, 0)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X2 */
    public static final void m4575X2(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public static final void m4577Y0(InterfaceC0298hw interfaceC0298hw, View view) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public static final na1 m4578Y1(Context context, int i, int i2) {
        f6671a.m4663p3(context, i, i2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y2 */
    public static final void m4579Y2(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z0 */
    private final void m4581Z0(Context context, LinearLayout linearLayout, int i) {
        View view = new View(context);
        view.setLayoutParams(new LinearLayout.LayoutParams(-1, i));
        linearLayout.addView(view);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z1 */
    public static final na1 m4582Z1(Context context, int i, int i2, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(f6671a.m4621h1(context, "⬆", "笔记页回到顶部按钮", "在笔记详情页可以一键回到顶部，滑动进他人主页时自动隐藏", i, i2, new gf0(i, context, i2, 1)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: Z2 */
    private final void m4583Z2(Context context) {
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(180, 255, 255, 255) : Color.argb(180, 80, 80, 90);
        int iArgb4 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb5 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 22), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textView = new TextView(context);
        textView.setText("✖");
        textView.setTextSize(36.0f);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("快捷重启");
        textView2.setTextSize(18.0f);
        textView2.setTextColor(iArgb2);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText("确定要立即重启小红书吗？\n\n这将强制关闭小红书应用，请确保当前数据已保存。");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(iArgb3);
        textView3.setGravity(17);
        textView3.setPadding(0, 0, 0, vf0Var.m4606e1(context, 20));
        linearLayout.addView(textView3);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView4 = new TextView(context);
        textView4.setText("取消");
        textView4.setTextSize(14.0f);
        textView4.setTextColor(iArgb5);
        textView4.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable.setColor(iArgb4);
        textView4.setBackground(gradientDrawable);
        textView4.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, vf0Var.m4606e1(context, 6), 0);
        textView4.setLayoutParams(layoutParams);
        textView4.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 13));
        linearLayout2.addView(textView4);
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "确定", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j.setBackground(gradientDrawableM4150h);
        textViewM4152j.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(vf0Var.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j.setLayoutParams(layoutParams2);
        textViewM4152j.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 14));
        linearLayout2.addView(textViewM4152j);
        linearLayout.addView(linearLayout2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.82d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a1 */
    private final void m4586a1(Context context, TextView textView, boolean z) {
        textView.setText(z ? "☑" : "☐");
        textView.setBackgroundColor(0);
        textView.setTextColor(z ? Color.argb(255, 254, 44, 85) : Color.argb(120, 120, 120, 130));
        textView.setPadding(m4606e1(context, 12), m4606e1(context, 8), m4606e1(context, 12), m4606e1(context, 8));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a2 */
    public static final na1 m4587a2(Context context, int i, int i2) {
        f6671a.m4559T2(context, i, i2);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a3 */
    public static final void m4588a3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: b1 */
    private final SeekBar m4591b1(Context context, int i) {
        int iArgb = Color.argb(255, 230, 230, 230);
        int iM4606e1 = m4606e1(context, 4);
        int iM4606e12 = m4606e1(context, 8);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        float f = iM4606e1 / 2.0f;
        gradientDrawableM4150h.setCornerRadius(f);
        gradientDrawableM4150h.setColor(Color.argb(60, 255, 255, 255));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setColor(iArgb);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(-1);
        int i2 = iM4606e12 * 2;
        gradientDrawable2.setSize(i2, i2);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{gradientDrawableM4150h, new ClipDrawable(gradientDrawable, 8388611, 1)});
        vf0 vf0Var = f6671a;
        layerDrawable.setLayerInset(0, 0, vf0Var.m4606e1(context, 6), 0, vf0Var.m4606e1(context, 6));
        layerDrawable.setLayerInset(1, 0, vf0Var.m4606e1(context, 6), 0, vf0Var.m4606e1(context, 6));
        layerDrawable.setId(0, R.id.background);
        layerDrawable.setId(1, R.id.progress);
        SeekBar seekBar = new SeekBar(context);
        seekBar.setMax(70);
        seekBar.setProgress(w60.m4907n(i - 30, 0, seekBar.getMax()));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, vf0Var.m4606e1(context, 4), 0, vf0Var.m4606e1(context, 4));
        seekBar.setLayoutParams(layoutParams);
        seekBar.setProgressDrawable(layerDrawable);
        seekBar.setThumbOffset(0);
        seekBar.setThumb(gradientDrawable2);
        seekBar.setSplitTrack(false);
        seekBar.setPadding(vf0Var.m4606e1(context, 2), 0, vf0Var.m4606e1(context, 2), 0);
        return seekBar;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public static final na1 m4592b2(Context context, int i, int i2, boolean z, SharedPreferences sharedPreferences, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(m4646m1(f6671a, context, "🛑", "首页刷新确认", "拦截Tab点击、返回手势、下拉刷新，弹窗二次确认，修改立即生效", i, i2, z, false, new ye0(sharedPreferences, 1), 128, null));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b3 */
    public static final void m4593b3(Dialog dialog, View view) {
        dialog.dismiss();
        Process.killProcess(Process.myPid());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c1 */
    private final View m4596c1(Context context, String str, int i, boolean z, InterfaceC0742sw interfaceC0742sw) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.setLayoutParams(layoutParams);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(15.0f);
        textView.setTextColor(i);
        textView.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        textView.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8));
        textView2.setGravity(17);
        textView2.setTextSize(13.0f);
        vf0Var.m4507G3(context, textView2, z);
        textView2.setTag(Boolean.valueOf(z));
        textView2.setOnClickListener(new if0(context, interfaceC0742sw, 0));
        linearLayout.addView(textView2);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public static final na1 m4597c2(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2345H(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: c3 */
    private final void m4598c3(Context context) {
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(180, 255, 255, 255) : Color.argb(180, 80, 80, 90);
        int iArgb4 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb5 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 22), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textView = new TextView(context);
        textView.setText("⚠️");
        textView.setTextSize(36.0f);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("重新适配");
        textView2.setTextSize(18.0f);
        textView2.setTextColor(iArgb2);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText("确定要删除适配缓存并重新扫描吗？\n\n小红书将被关闭，下次打开时会重新查找Hook点。");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(iArgb3);
        textView3.setGravity(17);
        textView3.setPadding(0, 0, 0, vf0Var.m4606e1(context, 20));
        linearLayout.addView(textView3);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView4 = new TextView(context);
        textView4.setText("取消");
        textView4.setTextSize(14.0f);
        textView4.setTextColor(iArgb5);
        textView4.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable.setColor(iArgb4);
        textView4.setBackground(gradientDrawable);
        textView4.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, vf0Var.m4606e1(context, 6), 0);
        textView4.setLayoutParams(layoutParams);
        textView4.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 1));
        linearLayout2.addView(textView4);
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "确定", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j.setBackground(gradientDrawableM4150h);
        textViewM4152j.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(vf0Var.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j.setLayoutParams(layoutParams2);
        textViewM4152j.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 6));
        linearLayout2.addView(textViewM4152j);
        linearLayout.addView(linearLayout2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.82d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d1 */
    public static final void m4601d1(Context context, InterfaceC0742sw interfaceC0742sw, View view) {
        Object tag = view.getTag();
        tag.getClass();
        boolean z = !((Boolean) tag).booleanValue();
        view.setTag(Boolean.valueOf(z));
        f6671a.m4507G3(context, (TextView) view, z);
        interfaceC0742sw.invoke(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public static final na1 m4602d2(Context context, boolean z, int i, int i2, boolean z2, SharedPreferences sharedPreferences, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(f6671a.m4641l1(context, z ? "✨" : "💬", z ? "消息防撤回 · X内测专属" : "消息防撤回", z ? "拦截好友私聊消息撤回，被撤回消息气泡变红，需重启生效" : "仅限内测用户 (X) 可用", i, i2, z2, z, new ye0(sharedPreferences, 4)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d3 */
    public static final void m4603d3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e1 */
    public final int m4606e1(Context context, int i) {
        return (int) (i * context.getResources().getDisplayMetrics().density);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public static final na1 m4607e2(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2351N(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public static final void m4608e3(Dialog dialog, View view) {
        dialog.dismiss();
        try {
            C0289hn.f2299a.m1428G();
        } catch (Exception unused) {
        }
        Process.killProcess(Process.myPid());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f1 */
    private final boolean m4611f1(Context context) {
        Object systemService = context.getSystemService("uimode");
        systemService.getClass();
        return ((UiModeManager) systemService).getNightMode() == 2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f2 */
    public static final na1 m4612f2(Context context, int i, int i2, boolean z, SharedPreferences sharedPreferences, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(m4646m1(f6671a, context, "👆", "双击点赞拦截", "拦截笔记详情页双击点赞，防止误触，修改立即生效", i, i2, z, false, new ye0(sharedPreferences, 5), 128, null));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: f3 */
    private final void m4613f3(Context context) {
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(180, 255, 255, 255) : Color.argb(180, 80, 80, 90);
        int iArgb4 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb5 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        int iArgb6 = zM4611f1 ? Color.argb(220, 255, 80, 80) : Color.parseColor("#CC2222");
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 22), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textView = new TextView(context);
        textView.setText("⚠️");
        textView.setTextSize(36.0f);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView);
        TextView textView2 = new TextView(context);
        textView2.setText("重新验证激活");
        textView2.setTextSize(18.0f);
        textView2.setTextColor(iArgb2);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textView2);
        TextView textView3 = new TextView(context);
        textView3.setText("确定要重新进行授权验证吗？\n\n重新验证将清除当前的授权状态，需要重新输入授权码进行验证。\n\n⚠️ 警告：如果频繁重新激活验证，将导致封禁使用模块！");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(iArgb3);
        textView3.setGravity(17);
        textView3.setPadding(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView3);
        TextView textView4 = new TextView(context);
        textView4.setText("请确认你确实需要重新验证后再操作");
        textView4.setTextSize(12.0f);
        textView4.setTextColor(iArgb6);
        textView4.setGravity(17);
        textView4.setPadding(0, 0, 0, vf0Var.m4606e1(context, 20));
        linearLayout.addView(textView4);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView5 = new TextView(context);
        textView5.setText("取消");
        textView5.setTextSize(14.0f);
        textView5.setTextColor(iArgb5);
        textView5.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable.setColor(iArgb4);
        textView5.setBackground(gradientDrawable);
        textView5.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, vf0Var.m4606e1(context, 6), 0);
        textView5.setLayoutParams(layoutParams);
        textView5.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 10));
        linearLayout2.addView(textView5);
        TextView textView6 = new TextView(context);
        textView6.setText("确定（5s）");
        textView6.setTextSize(14.0f);
        textView6.setTextColor(Color.argb(120, 255, 255, 255));
        textView6.setGravity(17);
        textView6.setEnabled(false);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable2.setColor(Color.argb(100, 220, 50, 50));
        textView6.setBackground(gradientDrawable2);
        textView6.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(vf0Var.m4606e1(context, 6), 0, 0, 0);
        textView6.setLayoutParams(layoutParams2);
        textView6.setOnClickListener(new ViewOnClickListenerC0282hg(dialog, context));
        linearLayout2.addView(textView6);
        linearLayout.addView(linearLayout2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.82d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
        Handler handler = new Handler(Looper.getMainLooper());
        xt0 xt0Var = new xt0();
        xt0Var.f7423d = 5;
        handler.postDelayed(new RunnableC0846h(xt0Var, textView6, handler, context), 1000L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: g1 */
    private final View m4616g1(Context context, int i) {
        View view = new View(context);
        vf0 vf0Var = f6671a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, vf0Var.m4606e1(context, 1));
        layoutParams.setMargins(vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12), 0);
        view.setLayoutParams(layoutParams);
        view.setBackgroundColor(i);
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public static final na1 m4617g2(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2384k(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public static final void m4618g3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: h1 */
    private final View m4621h1(Context context, String str, String str2, String str3, int i, int i2, InterfaceC0298hw interfaceC0298hw) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(20.0f);
        textView.setGravity(17);
        textView.setPadding(vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setPadding(0, vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8));
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(i);
        linearLayout2.addView(textView2);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str3, 11.0f, i2);
        textViewM4151i.setPadding(0, vf0Var.m4606e1(context, 2), 0, 0);
        linearLayout2.addView(textViewM4151i);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(context);
        textView3.setText("›");
        textView3.setTextSize(22.0f);
        textView3.setTextColor(i2);
        textView3.setGravity(17);
        textView3.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView3);
        linearLayout.setOnClickListener(new d00(4, interfaceC0298hw));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public static final na1 m4622h2(final Context context, final SharedPreferences sharedPreferences, final int i, final int i2, int i3, final int i4, LinearLayout linearLayout) {
        String str;
        linearLayout.getClass();
        final boolean zM3002l = p30.m3002l(n90.f4211a.m2678y(context), "X");
        boolean z = zM3002l ? sharedPreferences.getBoolean(m00.f3663S.m2388m(), false) : false;
        vf0 vf0Var = f6671a;
        linearLayout.addView(vf0Var.m4641l1(context, zM3002l ? "✨" : "📈", zM3002l ? "粉丝数伪装 · X内测专属" : "粉丝数伪装", zM3002l ? "显示自定义粉丝数，修改立即生效" : "仅限内测用户 (X) 可用", i, i2, z, zM3002l, new ye0(sharedPreferences, 3)));
        linearLayout.addView(vf0Var.m4616g1(context, i3));
        if (zM3002l) {
            String strM2389n = m00.f3663S.m2389n();
            str = m00.f3726x1;
            String string = sharedPreferences.getString(strM2389n, m00.f3726x1);
            if (string != null) {
                str = string;
            }
        } else {
            str = "--";
        }
        linearLayout.addView(vf0Var.m4621h1(context, "✏", "设置粉丝数", zM3002l ? "当前: ".concat(str) : "仅限内测用户可用", i, i2, new InterfaceC0298hw() { // from class: nf0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                return vf0.m4632j2(zM3002l, context, i, i2, i4, sharedPreferences);
            }
        }));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h3 */
    public static final void m4623h3(Dialog dialog, Context context, View view) {
        dialog.dismiss();
        try {
            n90.f4211a.m2676v(context);
        } catch (Exception unused) {
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0269h3(2), 300L);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i1 */
    public static final void m4626i1(InterfaceC0298hw interfaceC0298hw, View view) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public static final na1 m4627i2(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2388m(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i3 */
    public static final void m4628i3() {
        Process.killProcess(Process.myPid());
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j1 */
    private final View m4631j1(Context context, String str, String str2, String str3, int i, int i2, InterfaceC0298hw interfaceC0298hw) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(20.0f);
        textView.setGravity(17);
        textView.setPadding(vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setPadding(0, vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8));
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(i);
        linearLayout2.addView(textView2);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str3, 11.0f, i2);
        textViewM4151i.setPadding(0, vf0Var.m4606e1(context, 2), 0, 0);
        linearLayout2.addView(textViewM4151i);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(context);
        textView3.setText("›");
        textView3.setTextSize(22.0f);
        textView3.setTextColor(i2);
        textView3.setGravity(17);
        textView3.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView3);
        linearLayout.setOnClickListener(new d00(1, interfaceC0298hw));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j2 */
    public static final na1 m4632j2(boolean z, Context context, int i, int i2, int i3, SharedPreferences sharedPreferences) {
        if (z) {
            vf0 vf0Var = f6671a;
            sharedPreferences.getClass();
            vf0Var.m4496E2(context, i, i2, i3, sharedPreferences);
        } else {
            Toast.makeText(context, "仅限内测用户可用", 0).show();
        }
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: j3 */
    private final void m4633j3(final Context context, final TextView textView) {
        int iArgb = Color.argb(255, 230, 230, 230);
        boolean zM4611f1 = m4611f1(context);
        int iArgb2 = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb3 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb4 = zM4611f1 ? Color.argb(180, 255, 255, 255) : Color.argb(180, 80, 80, 90);
        int iArgb5 = zM4611f1 ? Color.argb(100, 60, 60, 70) : Color.argb(80, 180, 180, 190);
        int iArgb6 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb7 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        m00.C0452a c0452a = m00.f3663S;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        final Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb2);
        vf0 vf0Var = f6671a;
        final int i = iArgb7;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 22), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "保存目录设置", 18.0f, iArgb3, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 4));
        linearLayout.addView(textViewM4152j);
        TextView textView2 = new TextView(context);
        textView2.setText("仅支持系统公共目录，选择后可自定义子目录名");
        textView2.setTextSize(12.0f);
        textView2.setTextColor(iArgb4);
        textView2.setGravity(17);
        textView2.setPadding(0, 0, 0, vf0Var.m4606e1(context, 12));
        linearLayout.addView(textView2);
        String strM2369c0 = c0452a.m2369c0(context);
        Iterator<uo0> it = c0452a.m2363Z().iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            } else if (p30.m3002l(it.next().f6274d, strM2369c0)) {
                break;
            } else {
                i2++;
            }
        }
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, f6671a.m4606e1(context, 12));
        linearLayout2.setLayoutParams(layoutParams);
        z20 z20VarM2777q = o30.m2777q(m00.f3663S.m2363Z());
        final ArrayList arrayList = new ArrayList(AbstractC1001ze.m5585E(z20VarM2777q));
        Iterator it2 = z20VarM2777q.iterator();
        while (true) {
            y20 y20Var = (y20) it2;
            if (!y20Var.f7497f) {
                break;
            }
            int iNextInt = y20Var.nextInt();
            String str = (String) m00.f3663S.m2363Z().get(iNextInt).f6275e;
            boolean z = iNextInt == (i2 < 0 ? 0 : i2);
            Iterator it3 = it2;
            TextView textView3 = new TextView(context);
            textView3.setText(str);
            textView3.setTextSize(13.0f);
            textView3.setTextColor(z ? -1 : i);
            textView3.setGravity(17);
            GradientDrawable gradientDrawable = new GradientDrawable();
            int i3 = i2;
            gradientDrawable.setShape(0);
            vf0 vf0Var2 = f6671a;
            int i4 = iArgb6;
            int i5 = iArgb;
            gradientDrawable.setCornerRadius(vf0Var2.m4606e1(context, 16));
            gradientDrawable.setColor(z ? i5 : i4);
            textView3.setBackground(gradientDrawable);
            textView3.setPadding(vf0Var2.m4606e1(context, 10), vf0Var2.m4606e1(context, 8), vf0Var2.m4606e1(context, 10), vf0Var2.m4606e1(context, 8));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
            layoutParams2.setMargins(iNextInt > 0 ? vf0Var2.m4606e1(context, 4) : 0, 0, 0, 0);
            textView3.setLayoutParams(layoutParams2);
            arrayList.add(textView3);
            iArgb = i5;
            it2 = it3;
            i2 = i3;
            iArgb6 = i4;
        }
        final int i6 = iArgb6;
        final int i7 = iArgb;
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            linearLayout2.addView((TextView) it4.next());
        }
        linearLayout.addView(linearLayout2);
        final int i8 = 0;
        for (Object obj : arrayList) {
            int i9 = i8 + 1;
            if (i8 < 0) {
                o30.m2757A();
                throw null;
            }
            final SharedPreferences sharedPreferences2 = sharedPreferences;
            ((TextView) obj).setOnClickListener(new View.OnClickListener() { // from class: sf0
                /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    vf0.m4643l3(sharedPreferences2, i8, context, arrayList, i, i7, i6, view);
                }
            });
            i8 = i9;
            sharedPreferences = sharedPreferences2;
        }
        final SharedPreferences sharedPreferences3 = sharedPreferences;
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, "自定义子目录名", 13.0f, iArgb3);
        vf0 vf0Var3 = f6671a;
        textViewM4151i.setPadding(0, 0, 0, vf0Var3.m4606e1(context, 6));
        linearLayout.addView(textViewM4151i);
        String strM2364a = m00.f3663S.m2364a(context);
        final EditText editText = new EditText(context);
        editText.setText(strM2364a);
        editText.setTextColor(iArgb3);
        editText.setHintTextColor(iArgb4);
        editText.setHint("例如：红薯仓");
        editText.setTextSize(14.0f);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(vf0Var3.m4606e1(context, 10));
        gradientDrawable2.setColor(iArgb5);
        editText.setBackground(gradientDrawable2);
        editText.setPadding(vf0Var3.m4606e1(context, 14), vf0Var3.m4606e1(context, 12), vf0Var3.m4606e1(context, 14), vf0Var3.m4606e1(context, 12));
        editText.setSingleLine(true);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, 0, 0, vf0Var3.m4606e1(context, 14));
        editText.setLayoutParams(layoutParams3);
        linearLayout.addView(editText);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView4 = new TextView(context);
        textView4.setText("取消");
        textView4.setTextSize(14.0f);
        textView4.setTextColor(i);
        textView4.setGravity(17);
        GradientDrawable gradientDrawable3 = new GradientDrawable();
        gradientDrawable3.setShape(0);
        gradientDrawable3.setCornerRadius(vf0Var3.m4606e1(context, 28));
        gradientDrawable3.setColor(i6);
        textView4.setBackground(gradientDrawable3);
        textView4.setPadding(0, vf0Var3.m4606e1(context, 12), 0, vf0Var3.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams4.setMargins(0, 0, vf0Var3.m4606e1(context, 6), 0);
        textView4.setLayoutParams(layoutParams4);
        textView4.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 19));
        linearLayout3.addView(textView4);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, "保存", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var3.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j2.setBackground(gradientDrawableM4150h);
        textViewM4152j2.setPadding(0, vf0Var3.m4606e1(context, 12), 0, vf0Var3.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams5.setMargins(vf0Var3.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams5);
        textViewM4152j2.setOnClickListener(new View.OnClickListener() { // from class: tf0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                vf0.m4653n3(editText, sharedPreferences3, textView, context, dialog, view);
            }
        });
        linearLayout3.addView(textViewM4152j2);
        linearLayout.addView(linearLayout3);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k1 */
    public static final void m4636k1(InterfaceC0298hw interfaceC0298hw, View view) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public static final na1 m4637k2(Context context, int i, int i2, boolean z, SharedPreferences sharedPreferences, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(m4646m1(f6671a, context, "☰", "侧边栏入口还原", "主页左上角点点入口还原为原生侧边栏菜单，修改立即生效", i, i2, z, false, new ye0(sharedPreferences, 0), 128, null));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ void m4638k3(vf0 vf0Var, Context context, TextView textView, int i, Object obj) {
        if ((i & 2) != 0) {
            textView = null;
        }
        vf0Var.m4633j3(context, textView);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: l1 */
    private final View m4641l1(Context context, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, InterfaceC0742sw interfaceC0742sw) {
        LinearLayout linearLayout = new LinearLayout(context);
        boolean z3 = false;
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        if (!z2) {
            linearLayout.setAlpha(0.45f);
        }
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(20.0f);
        textView.setGravity(17);
        textView.setPadding(vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8));
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        int i3 = 1;
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setPadding(0, vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 8));
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(14.0f);
        textView2.setTextColor(i);
        linearLayout2.addView(textView2);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str3, 11.0f, i2);
        textViewM4151i.setPadding(0, vf0Var.m4606e1(context, 2), 0, 0);
        linearLayout2.addView(textViewM4151i);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(context);
        if (z && z2) {
            z3 = true;
        }
        textView3.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 6), vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 6));
        textView3.setGravity(17);
        textView3.setTextSize(12.0f);
        vf0Var.m4507G3(context, textView3, z3);
        if (z2) {
            textView3.setOnClickListener(new if0(context, interfaceC0742sw, i3));
        }
        textView3.setTag(Boolean.valueOf(z3));
        linearLayout.addView(textView3);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l2 */
    public static final na1 m4642l2(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2352O(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l3 */
    public static final void m4643l3(SharedPreferences sharedPreferences, int i, Context context, List list, int i2, int i3, int i4, View view) {
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        m00.C0452a c0452a = m00.f3663S;
        editorEdit.putString(c0452a.m2354Q(), (String) c0452a.m2363Z().get(i).f6274d).apply();
        m4658o3(context, list, i2, i3, i4);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: m1 */
    public static /* synthetic */ View m4646m1(vf0 vf0Var, Context context, String str, String str2, String str3, int i, int i2, boolean z, boolean z2, InterfaceC0742sw interfaceC0742sw, int i3, Object obj) {
        return vf0Var.m4641l1(context, str, str2, str3, i, i2, z, (i3 & 128) != 0 ? true : z2, interfaceC0742sw);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m2 */
    public static final na1 m4647m2(Context context, int i, int i2, boolean z, SharedPreferences sharedPreferences, LinearLayout linearLayout) {
        linearLayout.getClass();
        int i3 = 2;
        View viewM4646m1 = m4646m1(f6671a, context, "🚫", "小红书升级拦截", "开启后阻止所有升级检测、弹窗、下载链路", i, i2, z, false, new ye0(sharedPreferences, i3), 128, null);
        m4662p2(new ViewOnClickListenerC0869vy(new yt0(), new xt0(), context, i3), viewM4646m1);
        linearLayout.addView(viewM4646m1);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m3 */
    public static final void m4648m3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n1 */
    public static final void m4651n1(Context context, InterfaceC0742sw interfaceC0742sw, View view) {
        Object tag = view.getTag();
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean z = !(bool != null ? bool.booleanValue() : false);
        view.setTag(Boolean.valueOf(z));
        f6671a.m4507G3(context, (TextView) view, z);
        interfaceC0742sw.invoke(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n2 */
    public static final na1 m4652n2(SharedPreferences sharedPreferences, boolean z) {
        sharedPreferences.edit().putBoolean(m00.f3663S.m2361X(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n3 */
    public static final void m4653n3(EditText editText, SharedPreferences sharedPreferences, TextView textView, Context context, Dialog dialog, View view) {
        String string = k41.m1775g0(editText.getText().toString()).toString();
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        m00.C0452a c0452a = m00.f3663S;
        editorEdit.putString(c0452a.m2353P(), string).apply();
        if (textView != null) {
            textView.setText("当前：" + c0452a.m2367b0(context));
        }
        dialog.dismiss();
        Toast.makeText(context, "保存成功：" + c0452a.m2367b0(context), 0).show();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public final View m4656o1(Context context, String str, int i, int i2, int i3, int i4, boolean z, List<C0839a> list, InterfaceC0742sw interfaceC0742sw) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setVisibility(z ? 0 : 8);
        vf0 vf0Var = f6671a;
        linearLayout2.setPadding(0, vf0Var.m4606e1(context, 6), 0, vf0Var.m4606e1(context, 6));
        interfaceC0742sw.invoke(linearLayout2);
        TextView textView = new TextView(context);
        textView.setText(z ? "▼" : "▶");
        textView.setTextSize(16.0f);
        textView.setTextColor(Color.argb(200, 254, 44, 85));
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        textView.setGravity(17);
        textView.setPadding(vf0Var.m4606e1(context, 8), 0, vf0Var.m4606e1(context, 4), 0);
        C0839a c0839a = new C0839a(textView, linearLayout2);
        if (z) {
            c0839a.m4716b();
        }
        if (list != null) {
            list.add(c0839a);
        }
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 2));
        linearLayout3.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 12));
        gradientDrawable.setColor(i3);
        linearLayout3.setBackground(gradientDrawable);
        TextView textView2 = new TextView(context);
        textView2.setText(str);
        textView2.setTextSize(16.0f);
        textView2.setTextColor(i);
        textView2.setTypeface(typeface);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout3.addView(textView2);
        linearLayout3.addView(textView);
        linearLayout3.setOnClickListener(new qf0(0, c0839a, list));
        linearLayout.addView(linearLayout3);
        linearLayout.addView(linearLayout2);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o2 */
    public static final void m4657o2(yt0 yt0Var, xt0 xt0Var, Context context, View view) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - yt0Var.f7691d > 800) {
            xt0Var.f7423d = 0;
        }
        yt0Var.f7691d = jCurrentTimeMillis;
        int i = xt0Var.f7423d + 1;
        xt0Var.f7423d = i;
        if (i >= 5) {
            xt0Var.f7423d = 0;
            Object systemService = context.getSystemService("vibrator");
            Vibrator vibrator = systemService instanceof Vibrator ? (Vibrator) systemService : null;
            if (vibrator != null) {
                vibrator.vibrate(VibrationEffect.createOneShot(50L, -1));
            }
            af1.f152a.m166J();
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o3 */
    private static final void m4658o3(Context context, List<? extends TextView> list, int i, int i2, int i3) {
        Iterator it = o30.m2777q(m00.f3663S.m2363Z()).iterator();
        while (it.hasNext()) {
            int iNextInt = ((y20) it).nextInt();
            m00.C0452a c0452a = m00.f3663S;
            boolean zM3002l = p30.m3002l(c0452a.m2369c0(context), (String) c0452a.m2363Z().get(iNextInt).f6274d);
            TextView textView = list.get(iNextInt);
            GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
            gradientDrawableM4150h.setCornerRadius(f6671a.m4606e1(context, 16));
            gradientDrawableM4150h.setColor(zM3002l ? i2 : i3);
            textView.setBackground(gradientDrawableM4150h);
            list.get(iNextInt).setTextColor(zM3002l ? -1 : i);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p2 */
    private static final void m4662p2(View.OnClickListener onClickListener, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                childAt.getClass();
                m4662p2(onClickListener, childAt);
            }
        }
        if (view.isClickable()) {
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p3 */
    private final void m4663p3(Context context, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        boolean zM4611f1 = m4611f1(context);
        if (zM4611f1) {
            i3 = 28;
            i4 = 22;
        } else {
            i3 = 252;
            i4 = 248;
        }
        int iArgb = Color.argb(255, i4, i4, i3);
        if (zM4611f1) {
            i5 = 90;
            i6 = 80;
        } else {
            i5 = 210;
            i6 = 200;
        }
        int iArgb2 = Color.argb(140, i6, i6, i5);
        int iArgb3 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        m00.C0452a c0452a = m00.f3663S;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 18), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "回到顶部按钮", 20.0f, i, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textViewM4152j);
        vt0 vt0Var = new vt0();
        boolean z = sharedPreferences.getBoolean(c0452a.m2355R(), true);
        vt0Var.f6825d = z;
        linearLayout.addView(m4596c1(context, "启用回到顶部", i, z, new ve0(vt0Var, sharedPreferences, 2)));
        int i7 = sharedPreferences.getInt(c0452a.m2357T(), 48);
        TextView textView = new TextView(context);
        textView.setText(i7 + "dp");
        textView.setTextSize(24.0f);
        textView.setTextColor(i);
        textView.setGravity(17);
        textView.setPadding(0, vf0Var.m4606e1(context, 8), 0, vf0Var.m4606e1(context, 10));
        linearLayout.addView(textView);
        SeekBar seekBarM4591b1 = m4591b1(context, i7);
        seekBarM4591b1.setMax(50);
        seekBarM4591b1.setProgress(w60.m4907n(i7 - 30, 0, seekBarM4591b1.getMax()));
        seekBarM4591b1.setOnSeekBarChangeListener(new C0847i(textView, sharedPreferences));
        linearLayout.addView(seekBarM4591b1);
        TextView textView2 = new TextView(context);
        textView2.setText("拖动滑块调整大小，下次进入主页时生效");
        textView2.setTextSize(11.0f);
        textView2.setTextColor(i2);
        textView2.setPadding(0, vf0Var.m4606e1(context, 10), 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textView2);
        m4569W0(context, linearLayout, iArgb3, iArgb2, new we0(dialog, 2));
        m4478A3(dialog, context, linearLayout);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q1 */
    public static final void m4666q1(C0839a c0839a, List list, View view) {
        if (c0839a.m4719e()) {
            c0839a.m4715a();
            return;
        }
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                ((C0839a) it.next()).m4715a();
            }
        }
        c0839a.m4716b();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q2 */
    public static final na1 m4667q2(final SharedPreferences sharedPreferences, final Context context, final int i, int i2, final int i3, final int i4, LinearLayout linearLayout) {
        linearLayout.getClass();
        sharedPreferences.getBoolean(C0980yy.f7726l, false);
        sharedPreferences.getBoolean(C0980yy.f7727m, false);
        sharedPreferences.getBoolean(C0980yy.f7728n, false);
        sharedPreferences.getBoolean(C0980yy.f7729o, false);
        vf0 vf0Var = f6671a;
        final int i5 = 0;
        linearLayout.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: of0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i5) {
                    case 0:
                        return vf0.m4672r2(context, i3, i4, i, sharedPreferences, (LinearLayout) obj);
                    default:
                        return vf0.m4682t2(context, i3, i4, i, sharedPreferences, (LinearLayout) obj);
                }
            }
        }));
        m00.C0452a c0452a = m00.f3663S;
        c0452a.m2379h0(context);
        final int i6 = 1;
        linearLayout.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: of0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                switch (i6) {
                    case 0:
                        return vf0.m4672r2(context, i3, i4, i, sharedPreferences, (LinearLayout) obj);
                    default:
                        return vf0.m4682t2(context, i3, i4, i, sharedPreferences, (LinearLayout) obj);
                }
            }
        }));
        c0452a.m2375f0(context);
        linearLayout.addView(vf0Var.m4671r1(context, i, i2, new InterfaceC0742sw() { // from class: pf0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                return vf0.m4692v2(context, i3, i4, i, (LinearLayout) obj);
            }
        }));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q3 */
    public static final na1 m4668q3(vt0 vt0Var, SharedPreferences sharedPreferences, boolean z) {
        vt0Var.f6825d = z;
        sharedPreferences.edit().putBoolean(m00.f3663S.m2355R(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: r1 */
    private final View m4671r1(Context context, int i, int i2, InterfaceC0742sw interfaceC0742sw) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        vf0 vf0Var = f6671a;
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 12));
        gradientDrawable.setColor(i);
        gradientDrawable.setStroke(vf0Var.m4606e1(context, 1), i2);
        linearLayout.setBackground(gradientDrawable);
        interfaceC0742sw.invoke(linearLayout);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r2 */
    public static final na1 m4672r2(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(f6671a.m4621h1(context, "🏷", "顶部导航栏Tab", "自定义选择隐藏哪些顶部Tab，设置后左右滑动首页生效，重启也需滑动触发", i, i2, new af0(context, sharedPreferences, i, i2, i3, 0)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r3 */
    public static final na1 m4673r3(Dialog dialog) {
        dialog.dismiss();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s1 */
    private final View m4676s1(Context context, boolean z, boolean z2) {
        int iArgb;
        int iArgb2;
        int iArgb3;
        View view = new View(context);
        if (z2) {
            iArgb = Color.argb(0, 255, 140, 50);
            iArgb2 = z ? Color.argb(160, 255, 180, 80) : Color.argb(180, 255, 160, 60);
            iArgb3 = Color.argb(0, 255, 140, 50);
        } else {
            iArgb = Color.argb(0, 0, 180, 80);
            iArgb2 = z ? Color.argb(160, 80, 220, 120) : Color.argb(180, 0, 180, 100);
            iArgb3 = Color.argb(0, 0, 180, 80);
        }
        vf0 vf0Var = f6671a;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, vf0Var.m4606e1(context, 3));
        layoutParams.setMargins(vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 10));
        view.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 2));
        gradientDrawable.setColors(new int[]{iArgb, iArgb2, iArgb3});
        gradientDrawable.setGradientType(0);
        gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
        view.setBackground(gradientDrawable);
        return view;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s2 */
    public static final na1 m4677s2(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences) {
        vf0 vf0Var = f6671a;
        sharedPreferences.getClass();
        vf0Var.m4482B3(context, i, i2, i3, sharedPreferences);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: s3 */
    private final void m4678s3(Context context) {
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(150, 255, 255, 255) : Color.argb(150, 80, 80, 90);
        int iArgb4 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        int iArgb5 = zM4611f1 ? -1 : Color.argb(255, 50, 50, 60);
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        m00.C0452a c0452a = m00.f3663S;
        SharedPreferences sharedPreferences = context.getSharedPreferences(c0452a.m2362Y(), 0);
        xt0 xt0Var = new xt0();
        xt0Var.f7423d = sharedPreferences.getInt(c0452a.m2357T(), 48);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 18), vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "回到顶部按钮大小", 20.0f, iArgb2, 17);
        textViewM4152j.setPadding(0, 0, 0, vf0Var.m4606e1(context, 20));
        linearLayout.addView(textViewM4152j);
        TextView textView = new TextView(context);
        textView.setText(xt0Var.f7423d + "dp");
        textView.setTextSize(28.0f);
        textView.setTextColor(iArgb2);
        textView.setGravity(17);
        textView.setPadding(0, 0, 0, vf0Var.m4606e1(context, 14));
        linearLayout.addView(textView);
        SeekBar seekBarM4591b1 = m4591b1(context, xt0Var.f7423d);
        seekBarM4591b1.setMax(50);
        seekBarM4591b1.setProgress(w60.m4907n(xt0Var.f7423d - 30, 0, seekBarM4591b1.getMax()));
        seekBarM4591b1.setOnSeekBarChangeListener(new C0848j(xt0Var, textView, sharedPreferences));
        linearLayout.addView(seekBarM4591b1);
        TextView textView2 = new TextView(context);
        textView2.setText("拖动滑块调整大小，下次进入主页时生效");
        textView2.setTextSize(11.0f);
        textView2.setTextColor(iArgb3);
        textView2.setPadding(0, vf0Var.m4606e1(context, 10), 0, vf0Var.m4606e1(context, 16));
        linearLayout.addView(textView2);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView3 = new TextView(context);
        textView3.setText("← 返回");
        textView3.setTextSize(14.0f);
        textView3.setTextColor(iArgb5);
        textView3.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawable.setColor(iArgb4);
        textView3.setBackground(gradientDrawable);
        textView3.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams.setMargins(0, 0, vf0Var.m4606e1(context, 6), 0);
        textView3.setLayoutParams(layoutParams);
        textView3.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 2));
        linearLayout2.addView(textView3);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, "完成", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h.setCornerRadius(vf0Var.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j2.setBackground(gradientDrawableM4150h);
        textViewM4152j2.setPadding(0, vf0Var.m4606e1(context, 12), 0, vf0Var.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(vf0Var.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams2);
        textViewM4152j2.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 3));
        linearLayout2.addView(textViewM4152j2);
        linearLayout.addView(linearLayout2);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), -2);
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: t1 */
    public static /* synthetic */ View m4681t1(vf0 vf0Var, Context context, boolean z, boolean z2, int i, Object obj) {
        if ((i & 4) != 0) {
            z2 = false;
        }
        return vf0Var.m4676s1(context, z, z2);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t2 */
    public static final na1 m4682t2(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(f6671a.m4621h1(context, "📋", "侧边栏", "自定义隐藏侧边栏菜单中的功能选项，修改立即生效", i, i2, new af0(context, sharedPreferences, i, i2, i3, 1)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t3 */
    public static final void m4683t3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: u1 */
    private final View m4686u1(Context context, String str) {
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str, 12.0f, -8355712);
        vf0 vf0Var = f6671a;
        textViewM4151i.setPadding(vf0Var.m4606e1(context, 24), vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 8));
        return textViewM4151i;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u2 */
    public static final na1 m4687u2(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences) {
        vf0 vf0Var = f6671a;
        sharedPreferences.getClass();
        vf0Var.m4693v3(context, i, i2, i3, sharedPreferences);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u3 */
    public static final void m4688u3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v1 */
    private final View m4691v1(Context context, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, InterfaceC0298hw interfaceC0298hw) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 12));
        gradientDrawable.setColor(i3);
        gradientDrawable.setStroke(vf0Var.m4606e1(context, 1), i4);
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(22.0f);
        textView.setGravity(17);
        textView.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setPadding(0, vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(15.0f);
        textView2.setTextColor(i);
        linearLayout2.addView(textView2);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str3, 12.0f, i2);
        textViewM4151i.setPadding(0, vf0Var.m4606e1(context, 2), 0, 0);
        linearLayout2.addView(textViewM4151i);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(context);
        textView3.setText("›");
        textView3.setTextSize(24.0f);
        textView3.setTextColor(i5);
        textView3.setGravity(17);
        textView3.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 10));
        linearLayout.addView(textView3);
        linearLayout.setOnClickListener(new d00(5, interfaceC0298hw));
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v2 */
    public static final na1 m4692v2(final Context context, final int i, final int i2, final int i3, LinearLayout linearLayout) {
        linearLayout.getClass();
        linearLayout.addView(f6671a.m4621h1(context, "📦", "底部导航栏", "自定义选择隐藏哪些底部导航栏按钮，修改立即生效", i, i2, new InterfaceC0298hw() { // from class: ze0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0298hw
            public final Object invoke() {
                int i4 = i2;
                int i5 = i3;
                return vf0.m4697w2(context, i, i4, i5);
            }
        }));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: v3 */
    private final void m4693v3(Context context, int i, int i2, int i3, SharedPreferences sharedPreferences) {
        m00.C0452a c0452a = m00.f3663S;
        List<C0849k> listM2783w = o30.m2783w(new C0849k("discover_friends", c0452a.m2392q(), false, "添加好友", "👤"), new C0849k("creator_center", c0452a.m2395t(), false, "创作者中心", "🎨"), new C0849k("draft", c0452a.m2401z(), false, "我的草稿", "📝"), new C0849k("my_events", c0452a.m2338A(), false, "我的活动", "🎟️"), new C0849k("history", c0452a.m2397v(), false, "浏览记录", "📖"), new C0849k("download", c0452a.m2400y(), false, "我的下载", "⬇️"), new C0849k("order", c0452a.m2341D(), false, "订单", "📦"), new C0849k("cart", c0452a.m2393r(), false, "购物车", "🛒"), new C0849k("wallet", c0452a.m2344G(), false, "钱包", "💰"), new C0849k("applets", c0452a.m2398w(), false, "小程序", "📱"), new C0849k("hey_post", c0452a.m2399x(), false, "瞬间", "✨"), new C0849k("community_rule", c0452a.m2394s(), false, "社区公约", "📜"), new C0849k("scan", c0452a.m2342E(), false, "扫一扫", "📷"), new C0849k("help_center", c0452a.m2396u(), false, "帮助与客服", "❓"), new C0849k("setting", c0452a.m2343F(), false, "设置", "⚙️"));
        Dialog dialog = new Dialog(context);
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        ScrollView scrollView = new ScrollView(context);
        scrollView.setLayoutParams(new LinearLayout.LayoutParams(-1, 0, 1.0f));
        scrollView.setFillViewport(true);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        vf0 vf0Var = f6671a;
        linearLayout2.setPadding(vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 16), vf0Var.m4606e1(context, 8));
        linearLayout2.setBackgroundColor(iArgb);
        LinearLayout linearLayout3 = new LinearLayout(context);
        linearLayout3.setOrientation(0);
        linearLayout3.setGravity(16);
        linearLayout3.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        textView.setText("侧边栏选项");
        textView.setTextSize(18.0f);
        textView.setTextColor(i);
        textView.setTypeface(Typeface.DEFAULT_BOLD);
        textView.setPadding(0, vf0Var.m4606e1(context, 8), 0, vf0Var.m4606e1(context, 16));
        linearLayout3.addView(textView);
        linearLayout2.addView(linearLayout3);
        vt0 vt0Var = new vt0();
        vt0Var.f6825d = c0452a.m2379h0(context);
        LinearLayout linearLayout4 = new LinearLayout(context);
        linearLayout4.setOrientation(0);
        linearLayout4.setGravity(16);
        linearLayout4.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 10));
        linearLayout4.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 12));
        int i4 = i3;
        gradientDrawable.setColor(i4);
        linearLayout4.setBackground(gradientDrawable);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, "启用隐藏", 15.0f, i);
        textViewM4151i.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        textViewM4151i.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout4.addView(textViewM4151i);
        TextView textView2 = new TextView(context);
        textView2.setPadding(vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 14), vf0Var.m4606e1(context, 8));
        textView2.setGravity(17);
        textView2.setTextSize(13.0f);
        vf0Var.m4507G3(context, textView2, vt0Var.f6825d);
        textView2.setTag(Boolean.valueOf(vt0Var.f6825d));
        textView2.setOnClickListener(new xe0(context, vt0Var, sharedPreferences, 1));
        linearLayout4.addView(textView2);
        linearLayout2.addView(linearLayout4);
        m4581Z0(context, linearLayout2, m4606e1(context, 2));
        for (C0849k c0849k : listM2783w) {
            boolean z = sharedPreferences.getBoolean(c0849k.m4732k(), c0849k.m4729h());
            LinearLayout linearLayout5 = linearLayout2;
            linearLayout5.addView(f6671a.m4701x1(context, c0849k.m4731j(), c0849k.m4730i(), "侧边栏中的" + c0849k.m4730i() + "选项", i, i2, i4, z, new C0073c(13, sharedPreferences, c0849k)));
            i4 = i3;
            linearLayout2 = linearLayout5;
        }
        View view = linearLayout2;
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(0);
        linearLayout6.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int iArgb2 = zM4611f1 ? Color.argb(140, 80, 80, 90) : Color.argb(140, 200, 200, 210);
        TextView textViewM4152j = AbstractC0748t1.m4152j(context, "取消", 14.0f, zM4611f1 ? -1 : Color.argb(255, 50, 50, 60), 17);
        GradientDrawable gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
        vf0 vf0Var2 = f6671a;
        gradientDrawableM4150h.setCornerRadius(vf0Var2.m4606e1(context, 28));
        gradientDrawableM4150h.setColor(iArgb2);
        textViewM4152j.setBackground(gradientDrawableM4150h);
        textViewM4152j.setPadding(0, vf0Var2.m4606e1(context, 12), 0, vf0Var2.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams2.setMargins(0, 0, vf0Var2.m4606e1(context, 6), 0);
        textViewM4152j.setLayoutParams(layoutParams2);
        textViewM4152j.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 7));
        linearLayout6.addView(textViewM4152j);
        TextView textViewM4152j2 = AbstractC0748t1.m4152j(context, "保存", 14.0f, -1, 17);
        GradientDrawable gradientDrawableM4150h2 = AbstractC0748t1.m4150h(0);
        gradientDrawableM4150h2.setCornerRadius(vf0Var2.m4606e1(context, 28));
        gradientDrawableM4150h2.setColor(Color.argb(220, 0, 180, 80));
        textViewM4152j2.setBackground(gradientDrawableM4150h2);
        textViewM4152j2.setPadding(0, vf0Var2.m4606e1(context, 12), 0, vf0Var2.m4606e1(context, 12));
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(0, -2, 1.0f);
        layoutParams3.setMargins(vf0Var2.m4606e1(context, 6), 0, 0, 0);
        textViewM4152j2.setLayoutParams(layoutParams3);
        textViewM4152j2.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 8));
        linearLayout6.addView(textViewM4152j2);
        linearLayout6.setPadding(m4606e1(context, 16), m4606e1(context, 8), m4606e1(context, 16), m4606e1(context, 16));
        scrollView.addView(view);
        linearLayout.addView(scrollView);
        linearLayout.addView(linearLayout6);
        dialog.setContentView(linearLayout);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.7d));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w1 */
    public static final void m4696w1(InterfaceC0298hw interfaceC0298hw, View view) {
        interfaceC0298hw.invoke();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w2 */
    public static final na1 m4697w2(Context context, int i, int i2, int i3) {
        f6671a.m4535N2(context, i, i2, i3);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w3 */
    public static final void m4698w3(Context context, vt0 vt0Var, SharedPreferences sharedPreferences, View view) {
        Object tag = view.getTag();
        tag.getClass();
        boolean z = !((Boolean) tag).booleanValue();
        view.setTag(Boolean.valueOf(z));
        f6671a.m4507G3(context, (TextView) view, z);
        vt0Var.f6825d = z;
        sharedPreferences.edit().putBoolean(m00.f3663S.m2386l(), z).apply();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: x1 */
    private final View m4701x1(Context context, String str, String str2, String str3, int i, int i2, int i3, boolean z, InterfaceC0742sw interfaceC0742sw) {
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setGravity(16);
        vf0 vf0Var = f6671a;
        linearLayout.setPadding(vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4), vf0Var.m4606e1(context, 4));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, vf0Var.m4606e1(context, 8));
        linearLayout.setLayoutParams(layoutParams);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 12));
        gradientDrawable.setColor(i3);
        linearLayout.setBackground(gradientDrawable);
        TextView textView = new TextView(context);
        textView.setText(str);
        textView.setTextSize(22.0f);
        textView.setGravity(17);
        textView.setPadding(vf0Var.m4606e1(context, 12), vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        linearLayout.addView(textView);
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(1);
        linearLayout2.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
        linearLayout2.setPadding(0, vf0Var.m4606e1(context, 10), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 10));
        TextView textView2 = new TextView(context);
        textView2.setText(str2);
        textView2.setTextSize(15.0f);
        textView2.setTextColor(i);
        linearLayout2.addView(textView2);
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, str3, 12.0f, i2);
        textViewM4151i.setPadding(0, vf0Var.m4606e1(context, 2), 0, 0);
        linearLayout2.addView(textViewM4151i);
        linearLayout.addView(linearLayout2);
        TextView textView3 = new TextView(context);
        textView3.setGravity(17);
        textView3.setTextSize(22.0f);
        vf0Var.m4586a1(context, textView3, z);
        textView3.setOnClickListener(new if0(context, interfaceC0742sw, 2));
        textView3.setTag(Boolean.valueOf(z));
        linearLayout.addView(textView3);
        return linearLayout;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x2 */
    public static final na1 m4702x2(Context context, int i, int i2, int i3, int i4, Dialog dialog, LinearLayout linearLayout) {
        linearLayout.getClass();
        vf0 vf0Var = f6671a;
        linearLayout.addView(vf0Var.m4691v1(context, "✖", "快捷重启", "立即重启小红书，快速生效设置变更", i, i2, i3, i4, i2, new rf0(context, 0, dialog)));
        linearLayout.addView(vf0Var.m4691v1(context, "🔄", "重新适配", "删除缓存并重新扫描宿主APP的Hook点", i, i2, i3, i4, i2, new rf0(context, 1, dialog)));
        linearLayout.addView(vf0Var.m4691v1(context, "🔐", "重新验证激活", "清除授权状态，重新进行授权验证", i, i2, i3, i4, i2, new rf0(context, 2, dialog)));
        linearLayout.addView(vf0Var.m4691v1(context, "📜", "查看使用协议", "重新查看并确认完整的使用协议与承诺", i, i2, i3, i4, i2, new rf0(dialog, context)));
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x3 */
    public static final na1 m4703x3(SharedPreferences sharedPreferences, C0849k c0849k, boolean z) {
        sharedPreferences.edit().putBoolean(c0849k.m4732k(), z).apply();
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y1 */
    public static final void m4706y1(Context context, InterfaceC0742sw interfaceC0742sw, View view) {
        Object tag = view.getTag();
        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
        boolean z = !(bool != null ? bool.booleanValue() : false);
        view.setTag(Boolean.valueOf(z));
        f6671a.m4586a1(context, (TextView) view, z);
        interfaceC0742sw.invoke(Boolean.valueOf(z));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y2 */
    public static final na1 m4707y2(Dialog dialog, Context context) {
        dialog.dismiss();
        f6671a.m4583Z2(context);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public static final void m4708y3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: z1 */
    private final void m4711z1(Context context, Dialog dialog, int i) {
        View decorView;
        Window window = dialog.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return;
        }
        decorView.post(new RunnableC0178en(i, 2, context, dialog));
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z2 */
    public static final na1 m4712z2(Dialog dialog, Context context) {
        dialog.dismiss();
        f6671a.m4598c3(context);
        return na1.f4229a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z3 */
    public static final void m4713z3(Dialog dialog, View view) {
        dialog.dismiss();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bd A[PHI: r8
  0x00bd: PHI (r8v2 java.lang.String) = (r8v1 java.lang.String), (r8v1 java.lang.String), (r8v35 java.lang.String) binds: [B:31:0x0090, B:33:0x009e, B:36:0x00a6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: B1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m4714B1(final Context context) {
        cf1.C0090a c0090aM518d;
        String strM526f;
        PackageInfo packageInfo;
        String str;
        View view;
        View view2;
        int i;
        View view3;
        int i2;
        View view4;
        boolean z;
        int i3;
        GradientDrawable gradientDrawableM4150h;
        int i4;
        context.getClass();
        boolean zM4611f1 = m4611f1(context);
        int iArgb = zM4611f1 ? Color.argb(255, 22, 22, 28) : Color.argb(255, 248, 248, 252);
        int iArgb2 = zM4611f1 ? -1 : Color.argb(255, 22, 22, 28);
        int iArgb3 = zM4611f1 ? Color.argb(100, 255, 255, 255) : Color.argb(100, 0, 0, 0);
        int iArgb4 = zM4611f1 ? Color.argb(80, 50, 50, 58) : Color.argb(80, 200, 200, 210);
        int iArgb5 = zM4611f1 ? Color.argb(30, 255, 255, 255) : Color.argb(30, 0, 0, 0);
        int iArgb6 = zM4611f1 ? Color.argb(60, 180, 180, 190) : Color.argb(100, 160, 160, 170);
        SharedPreferences sharedPreferences = context.getSharedPreferences(m00.f3663S.m2362Y(), 0);
        try {
            cf1 cf1Var = cf1.f801a;
            ClassLoader classLoader = context.getClassLoader();
            classLoader.getClass();
            c0090aM518d = cf1Var.m518d(classLoader);
        } catch (Exception unused) {
            c0090aM518d = null;
        }
        String str2 = "未登录";
        if (c0090aM518d != null) {
            strM526f = c0090aM518d.m526f();
            String strM527g = c0090aM518d.m527g();
            if (k41.m1769a0(strM526f)) {
                strM526f = str2;
            } else if (!k41.m1769a0(strM527g)) {
                str2 = strM527g + " (" + strM526f + ")";
                strM526f = str2;
            }
        }
        Dialog dialog = new Dialog(context, R.style.Theme.Black.NoTitleBar.Fullscreen);
        dialog.setCancelable(true);
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setBackgroundColor(iArgb);
        vf0 vf0Var = f6671a;
        final int i5 = iArgb3;
        int i6 = iArgb6;
        linearLayout.setPadding(vf0Var.m4606e1(context, 20), 0, vf0Var.m4606e1(context, 20), vf0Var.m4606e1(context, 16));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(16);
        linearLayout2.setPadding(0, 0, 0, vf0Var.m4606e1(context, 16));
        TextView textViewM4151i = AbstractC0748t1.m4151i(context, "挖红薯呀-WHS", 20.0f, iArgb2);
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textViewM4151i.setTypeface(typeface);
        linearLayout2.addView(textViewM4151i);
        TextView textView = new TextView(context);
        textView.setText("3.0");
        textView.setTextSize(13.0f);
        textView.setTextColor(-1);
        textView.setTypeface(typeface);
        textView.setGravity(17);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        final int i7 = iArgb2;
        gradientDrawable.setCornerRadius(vf0Var.m4606e1(context, 4));
        int i8 = iArgb4;
        cf1.C0090a c0090a = c0090aM518d;
        gradientDrawable.setColor(Color.argb(255, 33, 150, 243));
        textView.setBackground(gradientDrawable);
        textView.setPadding(vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 3), vf0Var.m4606e1(context, 8), vf0Var.m4606e1(context, 3));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMargins(vf0Var.m4606e1(context, 8), 0, 0, 0);
        textView.setLayoutParams(layoutParams);
        linearLayout2.addView(textView);
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Exception unused2) {
            packageInfo = null;
        }
        final long longVersionCode = packageInfo != null ? packageInfo.getLongVersionCode() : 0L;
        if (packageInfo == null || (str = packageInfo.versionName) == null) {
            str = "unknown";
        }
        final String strM4229c = tu0.f6046a.m4229c();
        String str3 = "模块版本: v3.0.1 (30121)\n当前版本: " + str + " (" + longVersionCode + ")\n当前账号: " + strM526f + "\n推荐版本: " + strM4229c;
        m4581Z0(context, linearLayout, m4606e1(context, 4));
        final String str4 = str;
        final int i9 = iArgb5;
        String str5 = strM526f;
        int i10 = 1;
        View viewM4671r1 = m4671r1(context, i8, i6, new InterfaceC0742sw() { // from class: jf0
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            @Override // p000.InterfaceC0742sw
            public final Object invoke(Object obj) {
                return vf0.m4485C1(context, i9, i7, i5, str4, longVersionCode, strM4229c, (LinearLayout) obj);
            }
        });
        viewM4671r1.setOnLongClickListener(new lf0(context, str3));
        View viewM4671r12 = m4671r1(context, i8, i6, new mf0(context, 0));
        viewM4671r12.setOnClickListener(new ViewOnClickListenerC0245gg(context, i10));
        View viewM4671r13 = m4671r1(context, i8, i6, new h00(i5, i10, context));
        viewM4671r13.setOnClickListener(new ViewOnClickListenerC0245gg(context, 2));
        String strM2678y = n90.f4211a.m2678y(context);
        if (strM2678y.length() > 0) {
            boolean zEquals = strM2678y.equals("X");
            int iArgb7 = zM4611f1 ? Color.argb(255, 255, 200, 50) : Color.argb(255, 180, 120, 10);
            if (zEquals) {
                gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
                vf0 vf0Var2 = f6671a;
                view = viewM4671r1;
                gradientDrawableM4150h.setCornerRadius(vf0Var2.m4606e1(context, 12));
                view2 = viewM4671r13;
                i = i9;
                gradientDrawableM4150h.setStroke(vf0Var2.m4606e1(context, 1), Color.argb(120, 255, 200, 50));
                z = zEquals;
                i3 = iArgb7;
                gradientDrawableM4150h.setColors(new int[]{Color.argb(60, 255, 180, 30), Color.argb(60, 200, 100, 255), Color.argb(60, 255, 180, 30)});
                i4 = 0;
                gradientDrawableM4150h.setGradientType(0);
                gradientDrawableM4150h.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                view3 = viewM4671r12;
            } else {
                view = viewM4671r1;
                view2 = viewM4671r13;
                i = i9;
                z = zEquals;
                i3 = iArgb7;
                gradientDrawableM4150h = AbstractC0748t1.m4150h(0);
                vf0 vf0Var3 = f6671a;
                gradientDrawableM4150h.setCornerRadius(vf0Var3.m4606e1(context, 12));
                view3 = viewM4671r12;
                gradientDrawableM4150h.setColors(new int[]{Color.argb(60, 100, 180, 255), Color.argb(60, 160, 210, 255), Color.argb(60, 100, 180, 255)});
                i4 = 0;
                gradientDrawableM4150h.setGradientType(0);
                gradientDrawableM4150h.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawableM4150h.setStroke(vf0Var3.m4606e1(context, 1), i6);
            }
            LinearLayout linearLayout3 = new LinearLayout(context);
            linearLayout3.setOrientation(i4);
            linearLayout3.setGravity(16);
            vf0 vf0Var4 = f6671a;
            linearLayout3.setPadding(vf0Var4.m4606e1(context, 14), vf0Var4.m4606e1(context, 12), vf0Var4.m4606e1(context, 14), vf0Var4.m4606e1(context, 12));
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
            layoutParams2.setMargins(i4, i4, i4, vf0Var4.m4606e1(context, 8));
            linearLayout3.setLayoutParams(layoutParams2);
            linearLayout3.setBackground(gradientDrawableM4150h);
            linearLayout3.setOnLongClickListener(new lf0(c0090a, context));
            TextView textView2 = new TextView(context);
            textView2.setText(z ? "✨" : "👤");
            textView2.setTextSize(z ? 24.0f : 20.0f);
            textView2.setGravity(17);
            textView2.setPadding(0, 0, vf0Var4.m4606e1(context, 12), 0);
            linearLayout3.addView(textView2);
            LinearLayout linearLayout4 = new LinearLayout(context);
            linearLayout4.setOrientation(1);
            linearLayout4.setLayoutParams(new LinearLayout.LayoutParams(0, -2, 1.0f));
            TextView textView3 = new TextView(context);
            textView3.setText(z ? "内测用户 · X" : "普通用户 · Y");
            textView3.setTextSize(15.0f);
            textView3.setTextColor(z ? i3 : i7);
            textView3.setTypeface(Typeface.DEFAULT_BOLD);
            linearLayout4.addView(textView3);
            TextView textView4 = new TextView(context);
            textView4.setText(str5);
            textView4.setTextSize(12.0f);
            textView4.setTextColor(i5);
            i2 = 2;
            textView4.setPadding(0, vf0Var4.m4606e1(context, 2), 0, 0);
            linearLayout4.addView(textView4);
            linearLayout3.addView(linearLayout4);
            view4 = linearLayout3;
        } else {
            view = viewM4671r1;
            view2 = viewM4671r13;
            i = i9;
            view3 = viewM4671r12;
            i2 = 2;
            view4 = null;
        }
        View viewM4671r14 = m4671r1(context, i8, i6, new cf0(i7, context, i5, i2));
        viewM4671r14.setOnClickListener(new ViewOnClickListenerC0245gg(context, 3));
        TextView textView5 = new TextView(context);
        textView5.setText("反馈日志时需长按上方“模块信息“板块复制版本信息，然后按照群组关于反馈的相关公告格式填写完整反馈信息+lsposed日志+问题复现录屏等一并发送反馈。若不看公告、不按格式反馈，直接踢出封禁使用处理");
        textView5.setTextSize(10.0f);
        textView5.setTextColor(Color.argb(200, 254, 44, 85));
        textView5.setGravity(17);
        vf0 vf0Var5 = f6671a;
        textView5.setPadding(0, vf0Var5.m4606e1(context, 4), 0, 0);
        m4581Z0(context, linearLayout, m4606e1(context, 2));
        TextView textView6 = new TextView(context);
        textView6.setText("当前：" + m00.f3663S.m2367b0(context));
        textView6.setTextSize(12.0f);
        textView6.setTextColor(i5);
        textView6.setPadding(0, vf0Var5.m4606e1(context, 2), 0, 0);
        List<C0839a> arrayList = new ArrayList<>();
        View view5 = view2;
        int i11 = i;
        linearLayout.addView(m4656o1(context, "📥 下载与保存", i7, i5, i8, i11, false, arrayList, new kf0(sharedPreferences, context, i8, i6, i7, i5, i11, textView6)));
        m4581Z0(context, linearLayout, m4606e1(context, 6));
        linearLayout.addView(m4656o1(context, "⚡ 增强功能", i7, i5, i8, i11, false, arrayList, new kf0(sharedPreferences, context, i8, i6, linearLayout, i7, i5, i11)));
        m4581Z0(context, linearLayout, m4606e1(context, 6));
        linearLayout.addView(m4656o1(context, "🎨 UI净化与定制", i7, i5, i8, i11, false, arrayList, new ff0(sharedPreferences, context, i8, i6, i7, i5)));
        m4581Z0(context, linearLayout, m4606e1(context, 6));
        linearLayout.addView(m4656o1(context, "🔧 模块工具", i7, i5, i8, i11, false, arrayList, new ff0(context, i7, i5, i8, i6, dialog)));
        TextView textView7 = new TextView(context);
        textView7.setText("关闭");
        textView7.setTextSize(16.0f);
        textView7.setTextColor(-1);
        textView7.setTypeface(Typeface.DEFAULT_BOLD);
        textView7.setGravity(17);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(0);
        gradientDrawable2.setCornerRadius(vf0Var5.m4606e1(context, 28));
        gradientDrawable2.setColor(Color.argb(220, 254, 44, 85));
        textView7.setBackground(gradientDrawable2);
        textView7.setPadding(0, vf0Var5.m4606e1(context, 14), 0, vf0Var5.m4606e1(context, 14));
        textView7.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        textView7.setOnClickListener(new ViewOnClickListenerC0820uy(dialog, 15));
        LinearLayout linearLayout5 = new LinearLayout(context);
        linearLayout5.setOrientation(1);
        linearLayout5.addView(linearLayout2);
        TextView textView8 = new TextView(context);
        textView8.setText("模块信息");
        textView8.setTextSize(12.0f);
        textView8.setTextColor(i5);
        textView8.setPadding(vf0Var5.m4606e1(context, 4), 0, 0, vf0Var5.m4606e1(context, 6));
        linearLayout5.addView(textView8);
        linearLayout5.addView(view);
        if (view4 != null) {
            linearLayout5.addView(view4);
        }
        linearLayout5.addView(view3);
        linearLayout5.addView(view5);
        linearLayout5.addView(viewM4671r14);
        linearLayout5.addView(textView5);
        linearLayout5.addView(linearLayout);
        ScrollView scrollView = new ScrollView(context);
        scrollView.addView(linearLayout5);
        LinearLayout linearLayout6 = new LinearLayout(context);
        linearLayout6.setOrientation(1);
        linearLayout6.setBackgroundColor(iArgb);
        linearLayout6.setPadding(vf0Var5.m4606e1(context, 20), vf0Var5.m4606e1(context, 18), vf0Var5.m4606e1(context, 20), 0);
        linearLayout6.addView(scrollView, new LinearLayout.LayoutParams(-1, 0, 1.0f));
        linearLayout6.addView(textView7);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.setMargins(0, vf0Var5.m4606e1(context, 8), 0, vf0Var5.m4606e1(context, 16));
        textView7.setLayoutParams(layoutParams3);
        dialog.setContentView(linearLayout6);
        Window window = dialog.getWindow();
        if (window != null) {
            window.setLayout((int) (((double) context.getResources().getDisplayMetrics().widthPixels) * 0.85d), (int) (((double) context.getResources().getDisplayMetrics().heightPixels) * 0.82d));
        }
        Window window2 = dialog.getWindow();
        if (window2 != null) {
            window2.setGravity(17);
        }
        Window window3 = dialog.getWindow();
        if (window3 != null) {
            window3.setBackgroundDrawable(new ColorDrawable(0));
        }
        dialog.show();
        m4711z1(context, dialog, 28);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C2 */
    public static final void m4486C2(DialogInterface dialogInterface) {
    }
}
