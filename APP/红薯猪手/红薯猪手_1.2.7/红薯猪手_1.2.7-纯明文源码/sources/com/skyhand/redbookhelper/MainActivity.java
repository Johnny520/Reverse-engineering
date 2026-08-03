package com.skyhand.redbookhelper;

import android.app.Activity;
import android.content.ComponentName;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.preference.PreferenceManager;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skyhand.hookhand.dialog.view.SwitchButton;
import com.skyhand.redbookhelper.MainActivity;
import java.nio.charset.Charset;
import p001.AbstractC0335o4;
import p001.AbstractC0356q;
import p001.C0235h2;
import p001.C0237h4;
import p001.C0286kb;
import p001.C0292l3;
import p001.C0330o;
import p001.C0433vb;
import p001.C0460y;
import p001.InterfaceC0208f3;
import p001.InterfaceC0222g3;
import p001.RunnableC0258ib;
import p001.ViewOnClickListenerC0358q1;

/* JADX INFO: loaded from: classes.dex */
public final class MainActivity extends Activity {

    /* JADX INFO: renamed from: ۥۣ۟, reason: contains not printable characters */
    public static final C0286kb f1289;

    /* JADX INFO: renamed from: ۥ */
    public final C0286kb f15 = new C0286kb(new C0008b(this));

    /* JADX INFO: renamed from: ۥ۟ */
    public final C0286kb f16 = new C0286kb(new C0009c(this));

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final C0286kb f1290 = new C0286kb(new C0011e(this));

    /* JADX INFO: renamed from: ۥ۟۠, reason: contains not printable characters */
    public final C0286kb f1291 = new C0286kb(new C0010d(this));

    /* JADX INFO: renamed from: ۥ۟ۡ, reason: contains not printable characters */
    public int f1292;

    /* JADX INFO: renamed from: ۥ۟ۢ, reason: contains not printable characters */
    public int f1293;

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.MainActivity$a */
    public static final class C0007a extends AbstractC0335o4 implements InterfaceC0208f3<Handler> {

        /* JADX INFO: renamed from: ۥ */
        public static final C0007a f17;

        static {
            String str = "ۗ۠ۥۘ۟ۦۡۘۖۜۢۙۖ۟ۖۨۦۜۙۙۦ۟ۨۘۖۜۘۙ۫ۦ۫ۧ۟ۦۙ۫ۨۜۥۖۛۙ۟ۘ۟ۚ۫۫ۥ۠۫ۗۗ۠ۨ۠ۙ۬ۢۦۘۙۗۥۦۘۗۥ۬ۥۥۛۨۘ۫ۗۧ";
            while (true) {
                switch ((((((((str.hashCode() ^ 230) ^ 433) ^ 352) ^ 59) ^ 882) ^ 812) ^ 874) ^ 523066402) {
                    case -1969578308:
                        return;
                    case -1740262859:
                        f17 = new C0007a();
                        str = "ۤۥ۫ۛۜۥۘۗۤۖۨۚۢۡۜۡۢۨۡۢۡۘۘۘۜۘۚۡ۠ۤۤۗۥۗۦۘۥۢۖۚۡۘۨۛۥۘۚۛ۠ۘۤۤۗۢ۠ۤۗۜۧۤۤۡۢۦ";
                        break;
                }
            }
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final Handler mo7() {
            String str = "ۢ۫ۧ۟ۥۙۗۧۚۙۡۘۚۥۢۙۡۥۘۚۙۜۙۚ۟ۨۗۦۘۜۥۘ۬۬ۖۖ۟ۜۘ۫۫۫ۙۨ۫ۜۛۡ۠ۧۤ۫ۡۙۨۥۤۥ۬ۖۘۤ۟ۦۘۜۨۛۘۛۦۘۗۡۦۘۢۢۤ";
            while (true) {
                switch ((((((((str.hashCode() ^ 590) ^ 520) ^ 575) ^ 55) ^ 812) ^ 793) ^ 617) ^ (-1248218167)) {
                    case 1856376372:
                        str = "ۖۖۙۙۙۡۡۥۛۨۡ۠ۨۙۥۘ۬ۦ۬ۨۘۛ۫ۛۗ۫۠ۥۖۗۨۘۗۘۖۘۧ۠ۧۡ۠ۡۙ۠ۥ۠ۗۨۘ";
                        break;
                    case 1991163108:
                        return new Handler(Looper.getMainLooper());
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.MainActivity$b */
    public static final class C0008b extends AbstractC0335o4 implements InterfaceC0208f3<SharedPreferences> {

        /* JADX INFO: renamed from: ۥ */
        public final MainActivity f18;

        public C0008b(MainActivity mainActivity) {
            this.f18 = mainActivity;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final SharedPreferences mo7() {
            String str = "ۜۗۦۘۙۗۜۛۥۦۖۘۢۧۘۚۛ۫ۜ۟۠ۡۘۚ۫ۖۘۡۚۜۚۘۥۗۢ۬ۦۖۥۘ۬۬ۖۘ۠ۦۥۘۚۨۘ۟ۚۨۘۢۛ۠ۙۛۨۘۨۛ۫ۤۢۘ۠ۤۥۘۥۡۗۘ۠ۥۜۥ۠";
            while (true) {
                switch ((((((((str.hashCode() ^ 784) ^ 838) ^ 332) ^ 144) ^ 754) ^ 322) ^ 478) ^ 1557026750) {
                    case -975849798:
                        str = "ۨ۬ۖ۬ۖۥۧۜۢۖۦۜۘۘۢۨۨۚۤۡۘۜۘ۬ۛۜۘۜۦۖۙ۟ۘۥۛۤۙۚۗۖۗۘۘۢۨۡۘ۬ۗۥ";
                        break;
                    case -235925994:
                        return PreferenceManager.getDefaultSharedPreferences(this.f18);
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.MainActivity$c */
    public static final class C0009c extends AbstractC0335o4 implements InterfaceC0208f3<SharedPreferences.Editor> {

        /* JADX INFO: renamed from: ۥ */
        public final MainActivity f19;

        public C0009c(MainActivity mainActivity) {
            this.f19 = mainActivity;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final SharedPreferences.Editor mo7() {
            MainActivity mainActivity = null;
            String str = "۟۫ۢۨۧۡۛۡۥۜۘۢۚ۠ۦۙۚ۟ۦۦ۟ۛۜۡۢۘۘۤۦ۫ۧۘۘۡ۫۟ۧۙ۟ۜ۟ۜۢ۠ۡۘ۟ۛۜ۬ۨۖۘ۬ۘۥۜۜۘۚۨۗۙۨۥۘۦ۬ۨۖۢ۬۟ۢۘۘ";
            while (true) {
                switch ((((((((str.hashCode() ^ 181) ^ 660) ^ 788) ^ 332) ^ 853) ^ 636) ^ 690) ^ 2019042675) {
                    case -900716400:
                        return ((SharedPreferences) mainActivity.f15.m886()).edit();
                    case -222945338:
                        str = "۫ۨۥ۬ۤ۟ۗۙۘۜۜۡۢۚۛ۬ۡۘ۠۬۬ۖۚۛ۫ۚۦۘۥ۫ۚۜۡۧۘ۟ۚۢۙۡ۬ۨ۬ۘۜۙۖۥ۫۬ۨۙۨ۟۠۬ۗۢۜۗۙۢۥۛ";
                        break;
                    case 479638175:
                        C0286kb c0286kb = MainActivity.f1289;
                        str = "ۥۜۜۘ۠ۡۧۘۙۛۖۧۢۜ۬۫ۧۖۚۜۚۥۥۖۤۨۘۚۖ۠ۧۡۚۘۙۘۘۧ۟ۡۧۤۗۘۜۘ۫ۚۖۘ";
                        break;
                    case 1870907844:
                        mainActivity = this.f19;
                        str = "۬ۧ۟ۨۛۨۘ۫ۦۖۘۚ۫ۥۘۘ۬ۖۛۢۡۖ۫ۜۥ۠ۛۦ۫ۙۥ۟ۨۚۥۦۘۦۜۧ۫ۗۖ۠۬ۜۘۘ۫ۘ۠ۥۦۘۥۡۢۜۘۗۡۚ۫ۗ۟ۨۘۥۛۙ۠ۚ۠۟ۦۜۦۘۤۗۙۗۖۨۘۚۨۗ";
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.MainActivity$d */
    public static final class C0010d extends AbstractC0335o4 implements InterfaceC0208f3<TextView> {

        /* JADX INFO: renamed from: ۥ */
        public final MainActivity f20;

        public C0010d(MainActivity mainActivity) {
            this.f20 = mainActivity;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final TextView mo7() {
            String str = "۠ۦۙۘۤۨۘ۟ۥۗۥۛۗ۫ۚۗۜ۟ۤۨ۠ۥۛۖۜۘۤ۬ۨۘۦۢۡۘۛ۟۬ۜۧۥۤۚۢ۬ۚۢ۫ۢۢۤۜۨۧۚۙۦۛ۟۬ۥۙ۠ۥۘۗۧۦۘۦ۬ۛۚۗۢۢۙۢۥۨۚۛۥ۬ۤۤ۟";
            while (true) {
                switch ((((((((str.hashCode() ^ 444) ^ 749) ^ 298) ^ 558) ^ 965) ^ 156) ^ 749) ^ (-1895167056)) {
                    case -1100592850:
                        return (TextView) this.f20.findViewById(R.id.mTvAdapterList);
                    case 1930061305:
                        str = "ۛۥ۬ۛۛۘۨ۬ۢۖۛ۟ۗ۠ۦۘ۫۬ۦۖۤۤۘۤۦۛۘۧۘ۬۟ۧۨۢۙ۠ۙۚۥ۟۫ۗۖۘ۟۠۟ۨ۠ۢ۫۫۫ۚۜۦۘ";
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.MainActivity$e */
    public static final class C0011e extends AbstractC0335o4 implements InterfaceC0208f3<TextView> {

        /* JADX INFO: renamed from: ۥ */
        public final MainActivity f21;

        public C0011e(MainActivity mainActivity) {
            this.f21 = mainActivity;
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        public final TextView mo7() {
            String str = "۠ۗۡۘ۫ۦۦۤۦۙۨۚۨۡۡ۫ۛۦۘۘۛ۟ۙۢۧۥۘ۬۬ۨۨ۫ۥۛۥۙۘۢۤۚۢۛ۠ۧۨۘۚ۬ۨ";
            while (true) {
                switch ((((((((str.hashCode() ^ 609) ^ 867) ^ 985) ^ 1015) ^ 227) ^ 15) ^ 498) ^ (-892333712)) {
                    case -616592358:
                        return (TextView) this.f21.findViewById(R.id.mTvVersion);
                    case 316321958:
                        str = "ۖ۫ۥۘۖۡۘۖۢۨۙ۠ۧ۫ۘۨ۬ۚۦۧۢۚۥ۬ۚۢۘۨۧۙ۠۠ۖۘۧۜۛ۠۬ۦۘۧۧۖۨۥۥۘۡۘۤۚۦۦۜۘۘۗۘ۫ۧۘۡۘۘۦۡۖ۬ۦۚۚۦۜۧ۬ۖۘۗۧۚ۬ۛۜۦ";
                        break;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.skyhand.redbookhelper.MainActivity$f */
    public static final class C0012f extends AbstractC0335o4 implements InterfaceC0222g3<CharSequence, C0433vb> {

        /* JADX INFO: renamed from: ۥ */
        public final MainActivity f22;

        public C0012f(MainActivity mainActivity) {
            this.f22 = mainActivity;
        }

        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p001.InterfaceC0222g3
        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final C0433vb mo984(CharSequence charSequence) {
            CharSequence charSequence2 = null;
            String str = "ۧۜۦۘ۬ۢۚۘۤۢۢۦۖۘ۠ۥۡ۟ۡۚۗۦۖۡۨۘۜۦۥۘۦۚۨۙۘۚۥۘۢۛ۫۬ۥۜ۫۟۠ۜۘۜۥۦۡۖۘۘۨۨ۟ۧۦۘ۟ۖ۟۫ۗۛۥۖۘۚ۫ۥۘۜ۬ۥ";
            while (true) {
                switch ((((((((str.hashCode() ^ 342) ^ 421) ^ 794) ^ 455) ^ 473) ^ 95) ^ 682) ^ (-2028543692)) {
                    case -1684379625:
                        C0237h4.m1090("str", charSequence2);
                        str = "۠ۦۗۗ۠۟۠ۢۛۦۖۙۜۛۘۚ۟ۛ۠ۢۦۛۡۡۘۥۡۧۘۢۘۤ۟۫ۨۜۨۘۦۤۦۘۘۢ۠ۨۢۡ";
                        break;
                    case -434208702:
                        str = "۫۠ۡۚۧۙ۟ۥۘۛۦۘۘۜۖ۫ۦ۬ۥۘۘۖۢۦ۟ۦۘ۬ۥۦۨ۫ۤ۫ۡۘۧ۟ۘۧۗ۫ۙۗۖۘ۠ۚۢۢۧۙ۟ۡ۟۬ۢۢ۟ۥۘۦ۫۠ۥۥ";
                        break;
                    case 281044877:
                        return C0433vb.f1163;
                    case 344728661:
                        C0292l3.m1141(new C0013a(charSequence2, this.f22));
                        str = "ۥۜ۠ۙۜۨۗۜۦۤۗۛۚۜۡۘۢۧۨۘۦ۬ۥۘۘۛۨۛۨۙۡۥۘ۬ۢۘۘۤۚۗۦۜۙ۬ۨۖۘۜۦ۟ۡۚ۬۬ۙۡۘۨۛ۬ۛ۬ۧۧۜۡۘۛ۠ۦۘۖۘۘۙۥۡۘۗ۠ۢ";
                        break;
                    case 546870420:
                        str = "ۦۙ۫ۨۡۥ۟ۢۧ۫ۜۘۖۨ۠ۗۗۙۢۖۡۥ۟۫ۤۨۥۘۜۦۜۚۢۙۛۚۖۧۗ۫ۦ۬ۦۢۧۙ";
                        break;
                    case 1377469821:
                        str = "ۙۦۖۘۚۙۥۘۛۦۖۛۢۦۚۜۥۜۜۥۘۜ۟ۧ۟ۥۦۘۙۧۧ۫ۜۨۙۜۥۙۧ۬ۚۙۡۗۗۦ۠ۤۜۥۗۗۙۙۘ۠ۥۗۜۦۘۙۖۜۘۗۖۧۤ۟ۜۚۦۧۘۙۚ۟";
                        charSequence2 = charSequence;
                        break;
                }
            }
        }
    }

    static {
        String str = "ۚۢۡۙۘۦۘۤ۠ۖۗۢۢ۠۟ۜۘۚۗ۫۠ۚۛ۠۠ۜۘۡۘۗۘ۠ۦۗۥۡۨۜۜۥ۟ۥۡۜۦۖۛۤۛۨۚۜۜ۬ۥۥ۠ۚ۬ۖۘۘ۫ۥۖۖۥۘۛۡۥۗۢۧ۟ۦۥۘ";
        while (true) {
            switch ((((((((str.hashCode() ^ 944) ^ 244) ^ 765) ^ 1021) ^ 269) ^ 129) ^ 90) ^ 971444279) {
                case -936827129:
                    f1289 = new C0286kb(C0007a.f17);
                    str = "ۢ۟ۜۘۖ۟ۜۙۢۛۦۦۘۗۚۨۘ۬ۚۦۘۘۢۢۚۧ۠ۙ۬۟۠ۦۦۘۜۥۥۡۨ۠ۚۜۡۘۢ۠۫ۖۨۨۛۜ۬۬ۜۚۖۚۗ۫ۘۖۘۥۜۙۤۢۙ";
                    break;
                case 1724055490:
                    return;
            }
        }
    }

    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i = 3;
        final int i2 = 0;
        SwitchButton switchButton = null;
        String str = "ۘۗۖۤ۠ۖۚۗۦۘۙ۬ۡۘ۟ۤۥۜ۫ۛۦۤۤۤ۫ۤۨۧۦۘۖۖۖۘ۬ۙۚۨۙۜۘ۫ۗۜۡ۠ۤۛۚ۠ۘۥۡ۠ۧۤۗۡۘۦۥ۫۬ۡۨۘۛۦۤ";
        while (true) {
            switch ((((((((str.hashCode() ^ 193) ^ 228) ^ 354) ^ 813) ^ 846) ^ 671) ^ 235) ^ 155704947) {
                case -1643369343:
                    switchButton.setOnCheckedChangeListener(new C0460y(switchButton, this, i));
                    str = "ۡ۫۟ۗۘۚۥۦۚۡ۠ۥۘۗۨۖۜۧۧۡۜۙ۬ۗۥۚۗ۠ۦۡۦۜ۠۬ۡۥۘۦۢۘۦۧۚۗۤۡۘۚ۬ۡۥۙۗۗۙۦۘۛ۠ۡۘۜۗۥۜۙۗۗۤ۫ۛ۠۬ۜۘ";
                    break;
                case -1412578517:
                    ((LinearLayout) findViewById(R.id.mLayoutHideIcon)).setOnClickListener(new ViewOnClickListenerC0358q1(i, switchButton));
                    str = "ۘ۬ۤۤ۬ۥۘۢۚۡۘۢ۠ۖۘۧۡۧۘۡۛۚ۠ۘۨۢۤۖۙۥۘۗۧ۬ۗ۠ۘۘۗ۬ۜ۬ۧ۫۬ۜۘۜۥۨۘ۬۠ۥ۠ۛ۫ۜۗۜۘ";
                    break;
                case -1256879595:
                    return;
                case -1119989864:
                    str = "ۛ۠ۡۘۜۛۖ۬ۥۢۢۧۜۤۙ۠ۙۗ۬ۦۦ۬۫ۦۜۘۖۥ۬ۧۖۗ۫ۢ۫۠ۥۡۘۨۛۨۘۛۘۦ۠ۤۗۢۧۨۘ۬۟ۦۖۥۘۦۚۦۦۤۡۘۗۛۥۘۤۨۘۘۧۨۤۨۚۨۧۖۦ۠۟ۧۢ۟۟";
                    break;
                case -1100426380:
                    switchButton.postInvalidate();
                    str = "ۨ۫ۥۘۡۗ۠۬۠ۡۢۧۜۘۡۧۖۘۛۚۢۦۘۡۘۡۛ۟ۢۨۗ۠ۖۧۘۤۜۙۦۢۗۖۚۨۦۨۚۡۙۘۤ۫ۙۥۖ۬ۛۖ۫ۜۢۚۦۢۖۨۨۧۚ۠ۛۢۢۡۘۘ";
                    break;
                case -1018521558:
                    C0292l3.m1143(this);
                    str = "۫ۛۨۘۢۤۦ۟ۤۥۢۦۦۘۤۧۨۘۚۘۢۧۥۜۦۢۦ۬ۜۗۤۖ۠۠ۘۥۥ۫ۛ۠۠ۖۘ۬ۦۦۘ۫۬ۥۘۧۛۙ۠ۗۚۤۚۡۘ";
                    break;
                case -393363112:
                    C0292l3.m1144("1.2.7");
                    str = "ۚۗۨۚۧۤۤ۠ۖۚۥۘۧۢۥ۠ۚۧۜۙۤۙ۠ۘۨۜۤۦۧۖ۠ۥۘۘۧۢۢۗۧۘۚۚۖۤ۟";
                    break;
                case -257404820:
                    String str2 = "ۛۗۥۘ۫ۥۢۧۘۖۖۙۥۘۙۡۦۘ۠ۗۗ۫ۘۛ۟۠ۤ۬ۗۖۘ۠ۦۢۖۚۡۘ۠ۤۤۦۙ۟ۘۛۖۙۖۡۤۥ۫۫ۤۡۛ۟۠";
                    while (true) {
                        switch (str2.hashCode() ^ (-227392996)) {
                            case -1706871711:
                                str = "۠۫ۤ۠۬۟ۛۧۥۘ۫ۨۧ۠ۢ۠۠ۗۖۦۘ۫ۜۨۘۦۘۘۙ۫ۙ۫ۦ۠ۜ۫۫ۙ۠ۗۗۗۛ۠ۤۖۖۢۜۜۛۥۛۜۨۥۘۧۤۘۘ۟ۗۧۤۜ۬ۨۜۘ۬۟ۥۘ";
                                continue;
                            case -1680866756:
                                str = "۬ۧۥۘۡۤۙ۫ۢ۫ۦۥۖۘۡ۫ۖۘۡ۫۬۟ۤۗۨۢۨۘۤۙۡۘۨ۫ۥۗ۫ۜ۫ۖۛۜۚۧۛۗۨۢۤۜۘۚۦۘۧۖۨۘ۫ۘۖۤۢ۬ۚۖۘۦۙۤ۬۟۟ۢ۟ۡۢۛۡ";
                                continue;
                            case -1389667508:
                                String str3 = "ۧۧۜۢ۠ۗۤۘۤۜۡۥۥۡۨ۠۟۬ۦۨۘۙۦۦۗۦۜۘۖۘۘ۟۬۫ۘۢۨۘۥۤۨۘۡ۟ۤۛۧ۠ۦۜۘ۬ۡۜۘۖۜ۠۟ۦۘۘۢ۫ۜۘۘۘۡۢۛۡۘۨۜۧ۬ۦۡۖۖۦۘۛ۠ۘۥۨۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1473792122) {
                                        case -623218607:
                                            String str4 = "ۗ۫ۢۘۗۨ۫ۡ۬ۨۗۢۢۢۜۛۖۢ۫ۚۤ۠ۦۦۘۡۢۥۘۢ۫ۛ۟ۤۖۖۤۥۦۙۨۢ۟ۢ۟ۧۤۧۦۙ۠۠ۜۙۚۤۦۖ۫ۤۡۥۘۧۦۦۘۡۡۖۘۖۚۦۡ۟ۥۘۨۚۜۘۤۦۢۢۡ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-2034721563)) {
                                                    case -596675381:
                                                        str3 = "۠۟ۨۘۢۜۗۗ۟ۜۘۙۗۗ۟ۧ۟ۥ۠ۘۘۨ۟ۖۘۥۥۧۘۛۧ۟ۛۖۨۘۤ۠ۤۜۧۛۗ۟ۨ۫۟ۤ۟ۨۛ۬ۙۡ۠ۗ۠۬ۜۘۤ۠ۜۡۘۤۦۦ۠ۡۙ۟ۙۛۦۡۜۨۘۛۖۦۘۛۥ۠۠۬";
                                                        break;
                                                    case 58714163:
                                                        str4 = "۫ۘۖۘۢۙۧۜ۠ۜۘۚ۫ۨۨۥ۫ۗۢۡۖۘۥۤ۬ۜۜۙ۬ۖۨۡۙ۟ۢۢۜۡۛۧۙۖۡۘۗ۬ۥۘۡۨۘۘۧ۠ۘۗ۫ۧ۟ۨۨۘ۠۬ۜۘۨۥۖۘۜۙۜۙۡۖۥۙۚۧۜۨۛ۫۬ۚۛۤ";
                                                        break;
                                                    case 1203928741:
                                                        str3 = "ۗۧ۫ۖۘۨۘۨۜۥۙۗۖۘۘ۠ۨۘۛۜۨ۫ۚۖ۬ۦ۫ۙۦۧۧۧۘۜۘۜۙ۬ۤ۟۫ۛۦۨۙ۫ۛۧۛۖۘ۠ۨۧۡۗۢۡۙۨۦۢۤۧۨۦ۟ۛۙۜۦۦ۬ۚ۟ۗ۫ۖۢۨۡ";
                                                        break;
                                                    case 1876341384:
                                                        str4 = ((SharedPreferences) this.f15.m886()).getBoolean("hide_icon", false) == switchButton.isChecked() ? "۟ۙۦۥۗۗ۫۫ۥۦۗ۟ۙۜۡۙ۫ۦۘۢۜۖۘ۬ۢۘۘ۫ۡۤۧۥۜ۬ۖ۬ۚۘۦۚۨۘۗ۟ۜۘۙۗۦۘ" : "ۛ۬ۡۙۡۤۥۦۛۢۡۦۦۘۚۗۜۦۧۢۖۘۙ۟ۖۤۥۦۘۘۜۚۥۦۛۢۘ۟۬۠ۧ۬ۜۢۚۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -409344161:
                                            str2 = "ۢۨۤ۫ۘۘ۬ۦۛۚۨۤۥ۬۟۟۠ۥ۠ۗۙۘۛۤ۠ۢۜۘۗ۬ۚۛۧۘۛۨۘۘ۠ۛۚۤۜۡۘۡۢۡۘۡۛۥۨۥ۟۟۠۫";
                                            break;
                                        case 425346182:
                                            str2 = "ۡ۟ۢۦۦۘۘۢۗۢۛۚۨۘۥۘۧۘ۫ۥۜ۟ۤۗۜۘۥۘۤۢۤۢۡۖۦۧۖۘۥۤۚۘۘۜۙ۬۫۬ۡ";
                                            break;
                                        case 1644275399:
                                            str3 = "ۨۦۤۖۚۧ۫۠ۚ۟ۧۦ۬۠ۛۡۢۦۘۙۗۖۨۗۗ۠ۨ۬ۥ۟ۦۖۛۘ۫ۜ۫ۡۗۘۥۘ۬۫ۖ";
                                            break;
                                    }
                                }
                                break;
                            case -208723312:
                                str2 = "ۡ۫ۘۙۧۖۧ۫ۥۘۢۜۘۤ۠ۦ۫ۖۦۡۥۘۘۙۢۘۚۙۚ۬ۜۚۨۡۡۘۖۗۤ۟ۜۗ۟ۙ۠ۖۥۘۙۢۢۘۦۗۙۚۡۙۦۥۚۜۜۡۥۨۘ";
                                break;
                        }
                    }
                    break;
                case -110704160:
                    str = "ۨۙۨۗ۠ۥۘۚۡ۬۟ۢۢۚۜ۠ۦۢۡۘۥ۠ۦۘۙۚ۟ۜۢۛۨۙۖۡ۟ۜۛۧۗۖۨۨۘ۟ۥۘۘۨۜۗۙۖۧۡۨ۟ۡ۬ۜۥۘۧۚۘۥۛۗۛ۫۬۟۟۠ۚ۬ۥ۬۠ۥۘ۟ۜۙۨۛ";
                    break;
                case 145452356:
                    AbstractC0356q.f1755.add(this);
                    str = "ۦۖۧۘۖۥۙۧۗۡۛۡۢۘۗۥۤۦۧۦۘۦۗۘۥ۫ۖۛۥۦۥۘۙۗۥۖۧۥۘۛۙۘۥ۟ۛۖۦۨۘۙۥۦۘۜۙۨۘ۠۟ۦۘۤ۠۠۫ۙۥۘۧۡۚۙۘۧۘۨ۠ۡ۟ۚۦ۬ۜۥۗ۬ۘۘۙۦۘ";
                    break;
                case 357565785:
                    C0292l3.f1686 = 32;
                    str = "ۗ۠ۗۤ۟ۦۘۦۨۙۜ۟۬ۢ۟ۨۥۡۜ۬ۗۡۙ۫۬۠ۨ۟ۗ۠ۡ۫۬ۢۢ۟۟ۖۜۢۨۖ۠ۗۡۘۗۦ۫ۢۗ۫ۦۦۘۖۥۥ۬۟ۥۘۥ۬ۜۘۢ۫ۖۘ۟ۜۘۘۦ۟۫ۗ۬ۛ۬ۖۡۜۙ";
                    break;
                case 370680526:
                    ((TextView) this.f1290.m886()).setText("v1.2.7（32）");
                    str = "۟۠ۨۘۘ۟ۙ۬ۛۡۘۧۗ۠۫ۘۚۦۤۖۘۘۛۖۡۗۥۘ۠ۚۡۘ۟ۚ۫ۢۗۗۧۛۡۦۦۘ۟۠ۡۘۧۖۖۘ";
                    break;
                case 882935146:
                    str = "ۘۨۦۤۧ۫۠ۧۨۡ۫ۘۘۦۧۘ۠ۘۦۘۙۤۗ۬ۜۜۥۧۦۘۧۗۧۘ۬ۥۖۚۥۗۦۨۘ۫۟۫ۖۢۜۘۡۛۘۘۦۛۡۖ۫ۗۛۢۢۡ۫۬۫ۧ۬ۖ۬ۥۨۥۦۘ۟ۢ۠";
                    break;
                case 963787205:
                    AbstractC0356q.c.m921().postDelayed(new Runnable(this, i2) { // from class: ۟.i5

                        /* JADX INFO: renamed from: ۥ */
                        public final int f856;

                        /* JADX INFO: renamed from: ۥ۟ */
                        public final MainActivity f857;

                        {
                            this.f856 = i2;
                            this.f857 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str5 = "ۤۥۦۘۥۡۡ۠ۡ۟۟ۦۡ۫ۘۦۧ۠ۥۘۖۨۖۥۜۛۨۨ۟ۥۖۢۜۜۘۜ۟۬ۨۦۘ۬ۡۧۨۡۚۦۗۘۦۘۘۜۜۖۘۨ۫ۧۘۜۧۤ۫۠";
                            C0280k5 c0280k5 = null;
                            C0235h2.a aVar = null;
                            MainActivity mainActivity = null;
                            String strM1100 = null;
                            byte[] bytes = null;
                            Charset charsetForName = null;
                            String strM839 = null;
                            MainActivity mainActivity2 = null;
                            while (true) {
                                switch ((((((((str5.hashCode() ^ 978) ^ 18) ^ 572) ^ 445) ^ 159) ^ 604) ^ 189) ^ (-436594943)) {
                                    case -2137753430:
                                        C0235h2.a.m861(c0280k5);
                                        str5 = "ۦۡۘۤۧ۠ۤۥۛۧۧۨۤۤۨۘ۬۬ۨ۠۟ۡۛۨۘۢۧۗ۫ۥۘ۠ۤۦۗۛۡۙۗۘۘۥۜۙۡۥۘۗۖۘۘۧ۬ۥۚۥۨۨۜۖۘۛۖۢۛ۬ۗۡۜۖۘۥۜۦۤۡۥ";
                                        break;
                                    case -1735083452:
                                        str5 = "۬ۙۡۘۥۖۢۜۙۡۘ۠۬ۡۢۥۤۗۚۨۡۙۤ۫۬ۧ۟ۚ۫ۖۗۖۤ۫ۗ۫ۡۡ۠ۚۤۥۛۙۖۛ";
                                        strM1100 = C0272jb.m1100(bytes);
                                        break;
                                    case -1609752931:
                                        C0237h4.m1090("this$0", mainActivity);
                                        str5 = "ۛ۫ۘۦۚۦۨۡۖ۫ۥۛۛ۫۫ۛۦۨۘۗۧۡۘ۫ۤۤ۠ۙ۫ۗۥۘۚۜ۟ۤ۠ۛۤۢۨۘ۫ۘۛۡۤۗۜۜۥۘ۬ۙۛۘۨۘۗۘۡۘۚۦۚۖۚۤۦ۫۫۫ۨۨۘۢۜۗ";
                                        break;
                                    case -1510715389:
                                        str5 = "ۡۜۧۘ۟ۚۥۢۜ۫۫ۨۦۜ۟ۙۘ۟ۗۢۢ۫ۧۧۨۘۥۘۚۡۚۥۘ۠۟ۖۗ۫۫۬ۖۜۘۢۜۖۘۢ۫ۖۘۗۧۜۖۙۤۡۨ۟ۙۜۦۗۥۥۘۜۚۗ";
                                        aVar = C0235h2.f823;
                                        break;
                                    case -1403537985:
                                        str5 = "ۡۥۖۘۢ۟ۦۘۘ۬ۦۘۖ۟ۥ۬ۗۥۘۖ۫ۖۛۥۦۤۢۥۘ۫ۦ۠ۜۤۙۡۡۘۖ۫۟۟ۨۗۙۚۖ۠ۥۢۦۙۦۗۡۛۖۛۥۘ۫ۜۤۚۤۖۜ۟ۙ۬ۖۨۘۖۘۙ۠ۖۘ";
                                        charsetForName = Charset.forName("ISO-8859-1");
                                        break;
                                    case -929609862:
                                        C0237h4.m1089("getBytes(...)", bytes);
                                        str5 = "۬ۦۡۘۚ۟ۙ۬ۢۦ۠ۜۛۛۡۥۘۡۛۢۙۚۗ۫ۗۙۧۛۗۨۡۘۘ۬ۖۡۧۧۙۨۖۨۦۦۥۘۧۙۧۜۦۛۘۤۢۘۥۗۦ۬۟۬ۘۘ۠۠ۦ۠۫ۡۘۡۨۦۖۘۡ۟۫ۢۨۜۘۥۡۦ";
                                        break;
                                    case -813166664:
                                        switch (this.f856) {
                                            case 0:
                                                str5 = "ۦۖۥ۟ۧۜ۟ۤۢۜۚۘۘ۬ۨۜۘۢۦۡۗۢۗۗۜۜۘ۬ۜۘۘۦۛۦ۟ۨۜ۠ۦۘۦ۫ۖۘۢ۟ۛ۟ۨۡۘ";
                                                break;
                                            default:
                                                str5 = "ۗۖۜۘ۬ۨۧۘۨۡۡۘۨۧۖۧ۬۫ۘۘ۟ۛۤ۫ۚۜ۫ۨۙۤۜۡۘۘۚۧ۬۬۟۠ۛۤۢۢ۠۟ۘ۬ۧۧۖۘ۬۟ۛ۫ۖۨۤۗۡۘ۠ۘۧۨۘ۬۠ۦۜۥۦۘۚۖ";
                                                break;
                                        }
                                        break;
                                    case -661515071:
                                        C0237h4.m1089("forName(...)", charsetForName);
                                        str5 = "ۙۖۥۢۢۘ۬ۨۖۥۦۡۘۛۤۨۘۖۤۚۧۘ۟ۢۧۦۚ۫ۦۘۨۢۡۨۚ۠ۖۧۜۘۢ۫ۨۨۜۨۘۛۙۜۘۤۖۥۘۛۜۧۨۚۡۘۜ۠۬ۨۤۥۘۧ۬ۦۖۗۨۘۚۘۦۛۜ۟";
                                        break;
                                    case -353024994:
                                        str5 = "ۢۦۙۡۦۙۙ۫ۛۘۜۜۖۚۙ۫ۦۘۘۦۤۖ۠۠۬ۗۘ۟ۖۦۗۚۗۤۛۡ۠ۛۛۘۘ۫ۚۜۘۤۥۦۘۙۖۘۤۖۥۘۥۨۢۗ۠ۥۦۨ۟ۙۥۘ۬ۡۙۤۗۜۘۧۥۜۘۜۜۗۤۥۨ۟ۢۢ";
                                        strM839 = C0173ca.m839(mainActivity2, "com.skyhand.redbookhelper");
                                        break;
                                    case -217763780:
                                        C0286kb c0286kb = MainActivity.f1289;
                                        str5 = "ۨ۠ۥ۠ۡۜۢۨۖۡۛۥۘۡۤۛۨ۟ۙۦۜۡۤ۠۬ۚۜۦ۠ۡ۟ۥۗ۠۬ۦ۟ۘۜۘۦۖۚۨۥ۬ۙۘۧۢۡۦۘۤۧۤۙ۠ۦۡ۫ۚۗۗ";
                                        break;
                                    case -196064070:
                                        str5 = "ۦۡۘۤۧ۠ۤۥۛۧۧۨۤۤۨۘ۬۬ۨ۠۟ۡۛۨۘۢۧۗ۫ۥۘ۠ۤۦۗۛۡۙۗۘۘۥۜۙۡۥۘۗۖۘۘۧ۬ۥۚۥۨۨۜۖۘۛۖۢۛ۬ۗۡۜۖۘۥۜۦۤۡۥ";
                                        break;
                                    case 122187728:
                                        str5 = "۬ۡۧۘ۬ۖۥۘۖۦۘۡۧۜۡ۬۬ۙ۫ۘ۟ۗۦۘۥۘۤۘۘۨۘۧۜ۬ۚۡ۠ۗۖۘۛۡۜۘ۠ۧۖۡۙۡۘۤۛ۠ۢۥۥۦ۫ۖۘۚۗۡ۟ۦ۬ۢۜۘ۬ۥۘۧۚۖۘۨۛۘ";
                                        break;
                                    case 148080797:
                                        c0280k5 = new C0280k5(mainActivity);
                                        str5 = "۠ۢۖۘۚۙۥ۠ۛ۫ۨ۟ۥۦۖۥۘ۟۫ۙ۠ۗۗۖۚۥۗۢ۬ۥ۠ۚۤۧۚۗۢۖۘۗۗۙۗۖۖۢۛ۬ۤۢۚۖۘۘۛ۬۬ۦ۠ۜۘۨۢۘۘۢۡۙ";
                                        break;
                                    case 337080423:
                                        str5 = "ۗۛۚۢۖۥۘۨۥۗ۠۬ۡۘۗۧۡۧۗۨۘۗۛۡۢۛۗۖۥۨۘۖۛۢۢۢۨۦۘۘۘۛۗۧۘۖ۠ۨۢۙۥۨۘۜۦۘۗۧۗۢۤ۠ۢۙ۟ۦۜۘ";
                                        bytes = strM839.getBytes(charsetForName);
                                        break;
                                    case 551803669:
                                        String str6 = "ۖ۫۬ۤۙۙۨ۟ۙۧۛۦۜ۟ۤۜۛۡۥۥۧۘۗۚۥۦۦۨۘۧۧۜ۠ۢۦۘ۬۠ۥۛ۠ۥۘۜۧ۬ۡۜ۬";
                                        while (true) {
                                            switch (str6.hashCode() ^ (-1808769631)) {
                                                case -2099944755:
                                                    String str7 = "ۛۖۘۥ۟ۡۘۧۤۘۘۛۨۜۦۥۥۧۢۚ۟ۨ۬ۗۖۢۢۧۡۛ۬ۦۨۖۘۨ۠ۡۘۜۦۥۘۢۥۡۘۚ۟ۡۘۖۦۧ۠ۙۘۘ۠۠۫۬ۚۥۘۜۗۜۧۡۧۘ";
                                                    while (true) {
                                                        switch (str7.hashCode() ^ (-1243991532)) {
                                                            case -1535391788:
                                                                str6 = "ۙ۟ۜ۠ۛۢ۟۟ۜۘۗۚۦۘۖۛۨۘۧۥۦۥ۬ۡۘۤۜۤۦۧۛ۫ۚۡۘ۬ۦۧۘۛۘۛۦۧۘۛۤۛۛۨۘۘۙ۠ۜۘ۠ۜۖۘۗ۠ۢ";
                                                                break;
                                                            case -1442192160:
                                                                str6 = "ۙ۟ۦۘ۠۠ۖۙ۫ۨۧۙۜۘۛ۫ۥ۫۟ۨۧۗۖۙۖۡۘۚ۫ۜۛۛۧۗۘۙۜ۟۫۠ۖۚۥۤۖۘۧ۠ۘۘ";
                                                                break;
                                                            case -545030386:
                                                                String str8 = "۟۠ۙۧۨۦۘۙ۫ۚۦ۬۟ۤۗۢۚ۫۠۫ۜۖۡ۟ۦۘۦ۬ۘۘۖ۠ۢۖۚۥۤۚۡۘۘۖۨۘ۟۬ۨۘ۠ۧۚۖۡۨۦۡۘۘۜ۠ۥۘۨۡۡۡ۬ۙ۟ۛ";
                                                                while (true) {
                                                                    switch (str8.hashCode() ^ 670698223) {
                                                                        case -2122583430:
                                                                            str7 = "۟ۗۖۘۥۦۥ۠۠ۡۘ۬ۨۢ۬ۖ۠ۨۚۗ۬ۥۨۘ۬ۥۛۨ۠ۖۘۤۥۡۘ۠ۥۥۘۗۤۛ۫۫ۢۛۗۦ۠۫ۗۗ۬ۧۡۘۢ۫ۤۗ۠ۢۚ۟۟ۦۦ۟ۧۙۥۛۖۘۘ۫ۜۖۘ";
                                                                            break;
                                                                        case -488448162:
                                                                            str8 = "ۚۚۧ۟ۢۥۜۚۤۖ۠ۨۚۚۨۘ۫۬ۜۘ۬ۢۛۥۥۜۧۚۘۢ۬ۨ۬ۢ۟ۤ۠ۖۙۚۛ۠۟ۡۘۡۗۚ";
                                                                            break;
                                                                        case 1195141430:
                                                                            str7 = "ۗۙۛۧ۟ۧۘۤۜۗۙۧ۠۟ۘۗۙۜۨ۫ۤ۠ۘۨ۬۠ۤۥۨۡ۬ۙ۫ۙۧۘۘۘۡۨۛۜۧۘۚۤۜ۠ۚۨۘۢۘۥۦۜ۫";
                                                                            break;
                                                                        case 1840137713:
                                                                            str8 = mainActivity.f1292 > 3 ? "ۗۥ۬۫ۥۜ۬۠ۤۢۨۜۘۘۡۘۘ۠۟ۡۦۗ۠۫ۤۘۘ۬ۨۖۚۗۙ۠ۨۢۡۦ۟ۢۧۗۦۘۘ۫ۗۜۘۤۢۘۘۥۘۡۘۢۙۡۘ" : "ۨۗۧۥۘۧۘۥۡۦ۫۠ۘۛۘۦ۟۬ۤ۫ۗۧۜ۫۬ۚۢ۫ۘۘۢۡۖۚۦۘ۬ۡۢ۬ۤۜ۫ۜۘ۬ۘۜۨ۬ۙ۬ۙ۟ۤۧ۟۟۬ۡۘۛۦۘ۠۫ۖۙۥۥۨۛۗ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 627733518:
                                                                str7 = "ۥۡۡۘۛۤ۠ۨۖۥ۠ۡۥ۟ۗ۠ۨۛۘۤۗۤۚ۟ۜۘۙۨۡۡۨۧۘۢۡۛۙ۬ۦۥۖۘۚۜۚۨۨۧ۠ۡۨ۟ۙ۠ۡ۬ۡۛۖۡۜۧۖۘۡۢۘۘۨۨۖۘۨۡۘۘۙۚ۠ۤۧۘۘۡۚۙۢۙۦ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -293657572:
                                                    str5 = "۟۬۟ۨۚۥۘ۠ۥۦۤۤۦۘۗۜۘ۬ۛۙ۠ۚۡۜۥۘۘۨۤ۟ۜۡۢۚۤۙۜۘۤۗۦ۬ۨۙۗۘۜ";
                                                    continue;
                                                case 693596012:
                                                    str5 = "ۥۨ۬ۥ۟۫ۖ۠ۛ۟۫ۦۜۙۦۘۘۦۧۘۨ۠ۡ۟۫ۡۡۘ۟ۦ۟ۥۢۤ۫۟ۖۥۥۧۖۤۛۥۥۘۥۗۗۖۡۛۚۜۚۜۖ۫ۤۜۤۜۡۗ۟ۖۛ۬ۥۦۖۡۘ";
                                                    continue;
                                                case 1118359969:
                                                    str6 = "۟ۡۦۢ۟ۜۧۚۜۖۥۧۖۥ۟ۨۢۦۘۗ۟ۡۖۦۦۢ۬ۧۤۨۨۜۨۖۘۥۧۥۗ۠ۘۘۥ۟ۥۘۨۙۨۘۤ۫ۤۧۧۜۘۙۡۘ";
                                                    break;
                                            }
                                        }
                                        break;
                                    case 662061583:
                                    case 1838436264:
                                        return;
                                    case 668434676:
                                        str5 = "ۨۗۘۘۤۚۢۛۤۜۘۙۜۧۘۨۦۛۖۛ۠ۛۧ۫ۦۨۘۢۥۘ۬ۖۦۙۗۖۘۚ۫۬ۡۢۙۘۤۘۧۚۘ۬ۦۧ۫ۛۧ۟ۗۥ۬۫۟ۖ۬ۘۚۨۨ۫ۙۥۧۡ۫ۜ۠ۢۘۨۘۜۧۜۛۜۗ";
                                        break;
                                    case 970682179:
                                        C0286kb c0286kb2 = MainActivity.f1289;
                                        str5 = "ۤۙۧۧۖۨ۠ۤۜۛۧۖۡۛۘۘۧۜۦۘۡۢۦۧۖۛۥۜۤۡۦۤۙۥۧۦ۠ۥۚۨۡۘۖۦۧۗۨۦۘ۠ۨۢۖۛۙۛۖ۠ۘۙۡۚ۠ۨۚۨۢۤۛۖۛۛۙۨ۟";
                                        break;
                                    case 1181766055:
                                        mainActivity.f1292 = 0;
                                        str5 = "۫ۨ۫ۘ۫ۜۘۨ۠ۡۚ۠ۥۖ۠ۨۤۦۧۜ۬ۖۘۛۛۚۧۡ۠ۖۘۨۙ۟ۖۘۨۜۘۚۨۨۨۖۦۘۗ۟ۨۘ";
                                        break;
                                    case 1253779630:
                                        ((SharedPreferences.Editor) mainActivity2.f16.m886()).putString("s", strM1100).apply();
                                        str5 = "۫ۗۖ۟ۤۜۛۤۖ۟ۤۘۘ۫۠ۦۖۡۤۨۛۦۧۢۜ۠ۥۘۧۢۘۘۙ۬ۤۧۗۛۙۥۥۘۧۚۙۦ۫ۜۛۜۘۥۙۢۛۗۧۛۙۛۧۨۙۦ۟ۡ";
                                        break;
                                    case 1416849652:
                                        C0237h4.m1090("this$0", mainActivity2);
                                        str5 = "ۡۖۖۘۗۦۖ۟ۦۡۘۘ۠ۛۚ۫۠ۢۥۙۢۥۧ۠ۘۛۗۨ۬ۡۢۘۥۜۗۜۖۖۘ۠۟ۗ۫ۨۘۘۨۨۗۡۚۖۥۘۖۛۘ۫ۙ۠ۥۘۘ۫ۨۡ۠ۡۘ";
                                        break;
                                    case 1488338016:
                                        String str9 = "ۡۖۤۜ۫ۧ۠ۙۥۧۜۘۘۙۥۢ۠ۘۥۖۜۧۗۤۧ۠ۖ۫ۘۚۛۢ۟ۥۖۤ۫۟۠۫ۖۜۚ۟۬۠ۦۙۛۥۘۘ۫ۡۨۘ";
                                        while (true) {
                                            switch (str9.hashCode() ^ 1831493357) {
                                                case -1090466680:
                                                    str9 = "۠ۚۤ۠۬ۥۘ۟ۡۦۘ۬ۥ۠ۜۖۜۜ۬ۛۚۘۙۛ۬۬ۙۛ۫ۤۥۦۚۙۘۛۚۜۘۨۨ۟۟ۘۘ۫ۖۧۖۥۤۗۖۨ۫ۡۥۥ۬ۦۘۖ۫ۤۙۖۙۛۤۗۧۗۥۘۡۦۜۘ";
                                                    break;
                                                case 401398825:
                                                    str5 = "۫ۗۖ۟ۤۜۛۤۖ۟ۤۘۘ۫۠ۦۖۡۤۨۛۦۧۢۜ۠ۥۘۧۢۘۘۙ۬ۤۧۗۛۙۥۥۘۧۚۙۦ۫ۜۛۜۘۥۙۢۛۗۧۛۙۛۧۨۙۦ۟ۡ";
                                                    continue;
                                                case 1756088646:
                                                    String str10 = "ۦۡ۬ۤۧ۬۠ۥۛ۫۬ۦۘ۫ۡۗ۬ۗ۠ۙ۠ۡۥۡۜ۠۟ۥ۟ۤۡۘۧۛۗ۬ۧۡ۬۟ۨۘۥۨ۫۫ۗۡۚۡ۟۬ۨۨ۬ۤۦۘۢۙۘ۠۠۟۫ۘۥۘ۬ۡۗۙۗۛ۠۫ۖ";
                                                    while (true) {
                                                        switch (str10.hashCode() ^ (-1989102105)) {
                                                            case -1627476491:
                                                                str9 = "ۡ۬ۖۘ۟۠ۙۗۜۢ۫۫ۛ۫ۗۖۡۢ۠ۢۢ۫ۘۘۗۤ۟ۘۙۛۗ۠ۗۚۡۥۘۤۙۡۘۢۛۧۘۜۘ۬ۚۤۘۘۥۘۜ۫ۘ";
                                                                break;
                                                            case -1493468737:
                                                                str9 = "ۨۜۨۛۥۙۘ۫ۖۖۙۗۧۚۖۖۧۥۖ۟ۛۦۧۘ۫ۛۖۢۨۡۘۚ۟ۡۘۦۥۚۜ۟ۡۘ۫۟۟ۙ۠ۥۖ۬ۢۤۘۘۥۥۗۖۘۡۘۜۚۥ۫ۘ۫";
                                                                break;
                                                            case -1490055891:
                                                                String str11 = "ۨۡۖۙۨۤۘۖۜۘۢۤۜ۫ۧۥۙۤۗۗۜۧۘۜ۠۠ۚۦۜۡۛۦۗۤۚ۠۫۬ۥ۬ۗۧۥۘۢۦ۟ۖۥۘۚ۟ۘۘۙۗ۬۟ۧۜۥۜۘۦۗۨۘ";
                                                                while (true) {
                                                                    switch (str11.hashCode() ^ (-1035869245)) {
                                                                        case -1697992073:
                                                                            str11 = C0406ta.m1245(strM839) ^ true ? "ۧۡۥۘۗۢۗۚۢۚۢ۟۠ۢۧۥۘۥۖۡۡ۬ۗۖۙ۠ۜۥۘۛۥۙۦ۟ۙ۫ۢۗۨۦۜۙۖ۟ۡ۟ۗ" : "ۧۤۦ۬ۖۧۘۨۡۜ۫ۡۘ۫ۨۡۘۦۦۥۘۢۜۜۘۡۡۖۙۡۗ۫ۚۨۘۜۙۖۢۚۖۡۥۢۡۖۢۘۗ۠ۧۦۧۘۥۢۥۘۢۢۙۡۦۖ۟ۤۡ۬ۢ۫ۗۧۛ۬ۜ۟ۖۚۡ";
                                                                            break;
                                                                        case -1391006977:
                                                                            str11 = "ۖۛۥ۬ۚۥۘ۫ۗۖۘ۠۫۫۠ۜۨۘۘۚۥۥۤۙ۠۟ۗ۠ۜۨۘ۠۠ۦۜ۟ۖۘۘۥۖۜۛ۠ۖۦ۬ۜۦۢۜۨۘۧ۟ۦۡ۟ۚ";
                                                                            break;
                                                                        case -827556720:
                                                                            str10 = "۬ۚۜۧۧۜۚ۟ۢۙۢۥۘ۠ۚۡۘۜ۬۫ۨۥۖۜ۬ۤۢ۟ۤۤۤۤۦۜۛۚۨۖۘ۫۫ۜۤۢۤ۫ۜۜۘۤ۬ۘۘۙۥۖۘۥ۫ۖۚۗۘۖۘ۬ۚۡۜۦۧۗۢ۠ۡۘۙۛۤ";
                                                                            break;
                                                                        case -470858168:
                                                                            str10 = "ۘۗ۠ۙۡ۠ۥۖ۠ۖۢۚ۟ۛۜۘۤۨۛۥۦۦ۟۬۬۟ۗۦۘۙۤۧۨ۫ۦۥۛۗۙۦۡۚ۠ۗۤۨۛۡۧۨ۫ۡۘ۫ۦۗۢۨۗۢۥۢۢ۫۫ۡۥۗۗۦۦۘۦۡۨۨۡ۫ۜۥۥ۠ۥۢ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -988826670:
                                                                str10 = "۬ۨ۬ۗ۫ۜۘۥۢۙ۫ۗۛ۫ۨۛۥ۟ۥۡۢۙۤۜۛۙۖۡۖ۬ۧ۟ۙۧۖۖ۬ۧ۠ۛۧۜۘ۬ۛۥۥۧۛۜۧۘ۬ۦۥۖۛۜۦۛۨ۟۠ۜۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1926050341:
                                                    str5 = "ۛۦۦۘۡ۠ۥۘۙۙۜۘۦۖۥۘۡۤۡۤ۟ۨۘ۟ۘۡ۟۠ۨۘۖۧۖ۬ۖۙۖۚۤۧۥۜ۠ۛ۫ۤ۬ۡۡۤۦ۫ۡۧۤۖۡۘۧ۬ۗۥ۬ۦۤۘۘۥۦ۫ۗۥ۫۟ۙۢۨ۠ۗ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 1558396133:
                                        str5 = "۠ۨ۟ۜۜۗۛۤۖۘ۟ۡۧۘ۟ۢۨۘۧۧۡۘۨۦۜۗۜۢۖۥۡۘۖۘۜۘۚۤۡۘۢۨۡۘۨۘۨۥۨۨۥۖۜۘۗۛۦۘۤۖۦۧۥۘۖ۟ۙۚۙۢۧۦۡ۟ۚ۫ۧۤۨۦۘ";
                                        mainActivity2 = this.f857;
                                        break;
                                    case 1647411397:
                                        "data";
                                        str5 = "ۤۦ۠۬ۜۛۜۨۘۗۜۧۧۚۥۘۦۗۧۧ۟ۨۚ۫۫ۜۜۛۤۙ۠ۜۜۘۗۧۜ۬ۥۘۘۧ۫۫ۤۨۖ۠ۤۦۧۥۥ۠ۛۡۘۖۤۨ۬ۚۘۘ۠۬ۛۛۦۦۘۡۢۡۘۤ۠ۥۘ";
                                        break;
                                    case 1927215549:
                                        aVar.getClass();
                                        str5 = "۬ۖۖۜۦۖۘۙۡۚ۠ۦۘۗۨۘۧۧ۠ۙۡۘۘۗۥۜۙۖ۟ۗۜۧۧۗۜۘۜۧۦ۫ۗۚۢۧۗۖ۬ۥۘۗۦۨۘۘۡۦۘ۠ۥۚ";
                                        break;
                                    case 2145274550:
                                        str5 = "ۧ۫۫ۡۨۖۖۡ۠ۤۤ۬ۢ۫ۦۦۡۘۤۤۢۚۧ۠ۨۡۨۘۧۘۧ۟۟ۙ۬ۘۘ۠ۥۦۥۛۢۥۤۜ";
                                        mainActivity = this.f857;
                                        break;
                                }
                            }
                        }
                    }, 100L);
                    str = "ۜۘ۬ۢ۫۟ۙ۠ۧ۟ۚۦۘۢۗۨ۬۫ۦۘۡۧۢۜۧۧۖ۠ۘۤۤۜۙۚۦۘۜۦۥۘ۟ۘۘ۫ۨۗۜۤ۫ۧۗۗۛۦۤۥۦۥۨ۠ۥۢۨۡۥۦۧۧۦۡۙ۠۫ۗۥۗ";
                    break;
                case 1115254327:
                    final int i3 = 1;
                    ((Handler) f1289.m886()).post(new Runnable(this, i3) { // from class: ۟.i5

                        /* JADX INFO: renamed from: ۥ */
                        public final int f856;

                        /* JADX INFO: renamed from: ۥ۟ */
                        public final MainActivity f857;

                        {
                            this.f856 = i3;
                            this.f857 = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            String str5 = "ۤۥۦۘۥۡۡ۠ۡ۟۟ۦۡ۫ۘۦۧ۠ۥۘۖۨۖۥۜۛۨۨ۟ۥۖۢۜۜۘۜ۟۬ۨۦۘ۬ۡۧۨۡۚۦۗۘۦۘۘۜۜۖۘۨ۫ۧۘۜۧۤ۫۠";
                            C0280k5 c0280k5 = null;
                            C0235h2.a aVar = null;
                            MainActivity mainActivity = null;
                            String strM1100 = null;
                            byte[] bytes = null;
                            Charset charsetForName = null;
                            String strM839 = null;
                            MainActivity mainActivity2 = null;
                            while (true) {
                                switch ((((((((str5.hashCode() ^ 978) ^ 18) ^ 572) ^ 445) ^ 159) ^ 604) ^ 189) ^ (-436594943)) {
                                    case -2137753430:
                                        C0235h2.a.m861(c0280k5);
                                        str5 = "ۦۡۘۤۧ۠ۤۥۛۧۧۨۤۤۨۘ۬۬ۨ۠۟ۡۛۨۘۢۧۗ۫ۥۘ۠ۤۦۗۛۡۙۗۘۘۥۜۙۡۥۘۗۖۘۘۧ۬ۥۚۥۨۨۜۖۘۛۖۢۛ۬ۗۡۜۖۘۥۜۦۤۡۥ";
                                        break;
                                    case -1735083452:
                                        str5 = "۬ۙۡۘۥۖۢۜۙۡۘ۠۬ۡۢۥۤۗۚۨۡۙۤ۫۬ۧ۟ۚ۫ۖۗۖۤ۫ۗ۫ۡۡ۠ۚۤۥۛۙۖۛ";
                                        strM1100 = C0272jb.m1100(bytes);
                                        break;
                                    case -1609752931:
                                        C0237h4.m1090("this$0", mainActivity);
                                        str5 = "ۛ۫ۘۦۚۦۨۡۖ۫ۥۛۛ۫۫ۛۦۨۘۗۧۡۘ۫ۤۤ۠ۙ۫ۗۥۘۚۜ۟ۤ۠ۛۤۢۨۘ۫ۘۛۡۤۗۜۜۥۘ۬ۙۛۘۨۘۗۘۡۘۚۦۚۖۚۤۦ۫۫۫ۨۨۘۢۜۗ";
                                        break;
                                    case -1510715389:
                                        str5 = "ۡۜۧۘ۟ۚۥۢۜ۫۫ۨۦۜ۟ۙۘ۟ۗۢۢ۫ۧۧۨۘۥۘۚۡۚۥۘ۠۟ۖۗ۫۫۬ۖۜۘۢۜۖۘۢ۫ۖۘۗۧۜۖۙۤۡۨ۟ۙۜۦۗۥۥۘۜۚۗ";
                                        aVar = C0235h2.f823;
                                        break;
                                    case -1403537985:
                                        str5 = "ۡۥۖۘۢ۟ۦۘۘ۬ۦۘۖ۟ۥ۬ۗۥۘۖ۫ۖۛۥۦۤۢۥۘ۫ۦ۠ۜۤۙۡۡۘۖ۫۟۟ۨۗۙۚۖ۠ۥۢۦۙۦۗۡۛۖۛۥۘ۫ۜۤۚۤۖۜ۟ۙ۬ۖۨۘۖۘۙ۠ۖۘ";
                                        charsetForName = Charset.forName("ISO-8859-1");
                                        break;
                                    case -929609862:
                                        C0237h4.m1089("getBytes(...)", bytes);
                                        str5 = "۬ۦۡۘۚ۟ۙ۬ۢۦ۠ۜۛۛۡۥۘۡۛۢۙۚۗ۫ۗۙۧۛۗۨۡۘۘ۬ۖۡۧۧۙۨۖۨۦۦۥۘۧۙۧۜۦۛۘۤۢۘۥۗۦ۬۟۬ۘۘ۠۠ۦ۠۫ۡۘۡۨۦۖۘۡ۟۫ۢۨۜۘۥۡۦ";
                                        break;
                                    case -813166664:
                                        switch (this.f856) {
                                            case 0:
                                                str5 = "ۦۖۥ۟ۧۜ۟ۤۢۜۚۘۘ۬ۨۜۘۢۦۡۗۢۗۗۜۜۘ۬ۜۘۘۦۛۦ۟ۨۜ۠ۦۘۦ۫ۖۘۢ۟ۛ۟ۨۡۘ";
                                                break;
                                            default:
                                                str5 = "ۗۖۜۘ۬ۨۧۘۨۡۡۘۨۧۖۧ۬۫ۘۘ۟ۛۤ۫ۚۜ۫ۨۙۤۜۡۘۘۚۧ۬۬۟۠ۛۤۢۢ۠۟ۘ۬ۧۧۖۘ۬۟ۛ۫ۖۨۤۗۡۘ۠ۘۧۨۘ۬۠ۦۜۥۦۘۚۖ";
                                                break;
                                        }
                                        break;
                                    case -661515071:
                                        C0237h4.m1089("forName(...)", charsetForName);
                                        str5 = "ۙۖۥۢۢۘ۬ۨۖۥۦۡۘۛۤۨۘۖۤۚۧۘ۟ۢۧۦۚ۫ۦۘۨۢۡۨۚ۠ۖۧۜۘۢ۫ۨۨۜۨۘۛۙۜۘۤۖۥۘۛۜۧۨۚۡۘۜ۠۬ۨۤۥۘۧ۬ۦۖۗۨۘۚۘۦۛۜ۟";
                                        break;
                                    case -353024994:
                                        str5 = "ۢۦۙۡۦۙۙ۫ۛۘۜۜۖۚۙ۫ۦۘۘۦۤۖ۠۠۬ۗۘ۟ۖۦۗۚۗۤۛۡ۠ۛۛۘۘ۫ۚۜۘۤۥۦۘۙۖۘۤۖۥۘۥۨۢۗ۠ۥۦۨ۟ۙۥۘ۬ۡۙۤۗۜۘۧۥۜۘۜۜۗۤۥۨ۟ۢۢ";
                                        strM839 = C0173ca.m839(mainActivity2, "com.skyhand.redbookhelper");
                                        break;
                                    case -217763780:
                                        C0286kb c0286kb = MainActivity.f1289;
                                        str5 = "ۨ۠ۥ۠ۡۜۢۨۖۡۛۥۘۡۤۛۨ۟ۙۦۜۡۤ۠۬ۚۜۦ۠ۡ۟ۥۗ۠۬ۦ۟ۘۜۘۦۖۚۨۥ۬ۙۘۧۢۡۦۘۤۧۤۙ۠ۦۡ۫ۚۗۗ";
                                        break;
                                    case -196064070:
                                        str5 = "ۦۡۘۤۧ۠ۤۥۛۧۧۨۤۤۨۘ۬۬ۨ۠۟ۡۛۨۘۢۧۗ۫ۥۘ۠ۤۦۗۛۡۙۗۘۘۥۜۙۡۥۘۗۖۘۘۧ۬ۥۚۥۨۨۜۖۘۛۖۢۛ۬ۗۡۜۖۘۥۜۦۤۡۥ";
                                        break;
                                    case 122187728:
                                        str5 = "۬ۡۧۘ۬ۖۥۘۖۦۘۡۧۜۡ۬۬ۙ۫ۘ۟ۗۦۘۥۘۤۘۘۨۘۧۜ۬ۚۡ۠ۗۖۘۛۡۜۘ۠ۧۖۡۙۡۘۤۛ۠ۢۥۥۦ۫ۖۘۚۗۡ۟ۦ۬ۢۜۘ۬ۥۘۧۚۖۘۨۛۘ";
                                        break;
                                    case 148080797:
                                        c0280k5 = new C0280k5(mainActivity);
                                        str5 = "۠ۢۖۘۚۙۥ۠ۛ۫ۨ۟ۥۦۖۥۘ۟۫ۙ۠ۗۗۖۚۥۗۢ۬ۥ۠ۚۤۧۚۗۢۖۘۗۗۙۗۖۖۢۛ۬ۤۢۚۖۘۘۛ۬۬ۦ۠ۜۘۨۢۘۘۢۡۙ";
                                        break;
                                    case 337080423:
                                        str5 = "ۗۛۚۢۖۥۘۨۥۗ۠۬ۡۘۗۧۡۧۗۨۘۗۛۡۢۛۗۖۥۨۘۖۛۢۢۢۨۦۘۘۘۛۗۧۘۖ۠ۨۢۙۥۨۘۜۦۘۗۧۗۢۤ۠ۢۙ۟ۦۜۘ";
                                        bytes = strM839.getBytes(charsetForName);
                                        break;
                                    case 551803669:
                                        String str6 = "ۖ۫۬ۤۙۙۨ۟ۙۧۛۦۜ۟ۤۜۛۡۥۥۧۘۗۚۥۦۦۨۘۧۧۜ۠ۢۦۘ۬۠ۥۛ۠ۥۘۜۧ۬ۡۜ۬";
                                        while (true) {
                                            switch (str6.hashCode() ^ (-1808769631)) {
                                                case -2099944755:
                                                    String str7 = "ۛۖۘۥ۟ۡۘۧۤۘۘۛۨۜۦۥۥۧۢۚ۟ۨ۬ۗۖۢۢۧۡۛ۬ۦۨۖۘۨ۠ۡۘۜۦۥۘۢۥۡۘۚ۟ۡۘۖۦۧ۠ۙۘۘ۠۠۫۬ۚۥۘۜۗۜۧۡۧۘ";
                                                    while (true) {
                                                        switch (str7.hashCode() ^ (-1243991532)) {
                                                            case -1535391788:
                                                                str6 = "ۙ۟ۜ۠ۛۢ۟۟ۜۘۗۚۦۘۖۛۨۘۧۥۦۥ۬ۡۘۤۜۤۦۧۛ۫ۚۡۘ۬ۦۧۘۛۘۛۦۧۘۛۤۛۛۨۘۘۙ۠ۜۘ۠ۜۖۘۗ۠ۢ";
                                                                break;
                                                            case -1442192160:
                                                                str6 = "ۙ۟ۦۘ۠۠ۖۙ۫ۨۧۙۜۘۛ۫ۥ۫۟ۨۧۗۖۙۖۡۘۚ۫ۜۛۛۧۗۘۙۜ۟۫۠ۖۚۥۤۖۘۧ۠ۘۘ";
                                                                break;
                                                            case -545030386:
                                                                String str8 = "۟۠ۙۧۨۦۘۙ۫ۚۦ۬۟ۤۗۢۚ۫۠۫ۜۖۡ۟ۦۘۦ۬ۘۘۖ۠ۢۖۚۥۤۚۡۘۘۖۨۘ۟۬ۨۘ۠ۧۚۖۡۨۦۡۘۘۜ۠ۥۘۨۡۡۡ۬ۙ۟ۛ";
                                                                while (true) {
                                                                    switch (str8.hashCode() ^ 670698223) {
                                                                        case -2122583430:
                                                                            str7 = "۟ۗۖۘۥۦۥ۠۠ۡۘ۬ۨۢ۬ۖ۠ۨۚۗ۬ۥۨۘ۬ۥۛۨ۠ۖۘۤۥۡۘ۠ۥۥۘۗۤۛ۫۫ۢۛۗۦ۠۫ۗۗ۬ۧۡۘۢ۫ۤۗ۠ۢۚ۟۟ۦۦ۟ۧۙۥۛۖۘۘ۫ۜۖۘ";
                                                                            break;
                                                                        case -488448162:
                                                                            str8 = "ۚۚۧ۟ۢۥۜۚۤۖ۠ۨۚۚۨۘ۫۬ۜۘ۬ۢۛۥۥۜۧۚۘۢ۬ۨ۬ۢ۟ۤ۠ۖۙۚۛ۠۟ۡۘۡۗۚ";
                                                                            break;
                                                                        case 1195141430:
                                                                            str7 = "ۗۙۛۧ۟ۧۘۤۜۗۙۧ۠۟ۘۗۙۜۨ۫ۤ۠ۘۨ۬۠ۤۥۨۡ۬ۙ۫ۙۧۘۘۘۡۨۛۜۧۘۚۤۜ۠ۚۨۘۢۘۥۦۜ۫";
                                                                            break;
                                                                        case 1840137713:
                                                                            str8 = mainActivity.f1292 > 3 ? "ۗۥ۬۫ۥۜ۬۠ۤۢۨۜۘۘۡۘۘ۠۟ۡۦۗ۠۫ۤۘۘ۬ۨۖۚۗۙ۠ۨۢۡۦ۟ۢۧۗۦۘۘ۫ۗۜۘۤۢۘۘۥۘۡۘۢۙۡۘ" : "ۨۗۧۥۘۧۘۥۡۦ۫۠ۘۛۘۦ۟۬ۤ۫ۗۧۜ۫۬ۚۢ۫ۘۘۢۡۖۚۦۘ۬ۡۢ۬ۤۜ۫ۜۘ۬ۘۜۨ۬ۙ۬ۙ۟ۤۧ۟۟۬ۡۘۛۦۘ۠۫ۖۙۥۥۨۛۗ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 627733518:
                                                                str7 = "ۥۡۡۘۛۤ۠ۨۖۥ۠ۡۥ۟ۗ۠ۨۛۘۤۗۤۚ۟ۜۘۙۨۡۡۨۧۘۢۡۛۙ۬ۦۥۖۘۚۜۚۨۨۧ۠ۡۨ۟ۙ۠ۡ۬ۡۛۖۡۜۧۖۘۡۢۘۘۨۨۖۘۨۡۘۘۙۚ۠ۤۧۘۘۡۚۙۢۙۦ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -293657572:
                                                    str5 = "۟۬۟ۨۚۥۘ۠ۥۦۤۤۦۘۗۜۘ۬ۛۙ۠ۚۡۜۥۘۘۨۤ۟ۜۡۢۚۤۙۜۘۤۗۦ۬ۨۙۗۘۜ";
                                                    continue;
                                                case 693596012:
                                                    str5 = "ۥۨ۬ۥ۟۫ۖ۠ۛ۟۫ۦۜۙۦۘۘۦۧۘۨ۠ۡ۟۫ۡۡۘ۟ۦ۟ۥۢۤ۫۟ۖۥۥۧۖۤۛۥۥۘۥۗۗۖۡۛۚۜۚۜۖ۫ۤۜۤۜۡۗ۟ۖۛ۬ۥۦۖۡۘ";
                                                    continue;
                                                case 1118359969:
                                                    str6 = "۟ۡۦۢ۟ۜۧۚۜۖۥۧۖۥ۟ۨۢۦۘۗ۟ۡۖۦۦۢ۬ۧۤۨۨۜۨۖۘۥۧۥۗ۠ۘۘۥ۟ۥۘۨۙۨۘۤ۫ۤۧۧۜۘۙۡۘ";
                                                    break;
                                            }
                                        }
                                        break;
                                    case 662061583:
                                    case 1838436264:
                                        return;
                                    case 668434676:
                                        str5 = "ۨۗۘۘۤۚۢۛۤۜۘۙۜۧۘۨۦۛۖۛ۠ۛۧ۫ۦۨۘۢۥۘ۬ۖۦۙۗۖۘۚ۫۬ۡۢۙۘۤۘۧۚۘ۬ۦۧ۫ۛۧ۟ۗۥ۬۫۟ۖ۬ۘۚۨۨ۫ۙۥۧۡ۫ۜ۠ۢۘۨۘۜۧۜۛۜۗ";
                                        break;
                                    case 970682179:
                                        C0286kb c0286kb2 = MainActivity.f1289;
                                        str5 = "ۤۙۧۧۖۨ۠ۤۜۛۧۖۡۛۘۘۧۜۦۘۡۢۦۧۖۛۥۜۤۡۦۤۙۥۧۦ۠ۥۚۨۡۘۖۦۧۗۨۦۘ۠ۨۢۖۛۙۛۖ۠ۘۙۡۚ۠ۨۚۨۢۤۛۖۛۛۙۨ۟";
                                        break;
                                    case 1181766055:
                                        mainActivity.f1292 = 0;
                                        str5 = "۫ۨ۫ۘ۫ۜۘۨ۠ۡۚ۠ۥۖ۠ۨۤۦۧۜ۬ۖۘۛۛۚۧۡ۠ۖۘۨۙ۟ۖۘۨۜۘۚۨۨۨۖۦۘۗ۟ۨۘ";
                                        break;
                                    case 1253779630:
                                        ((SharedPreferences.Editor) mainActivity2.f16.m886()).putString("s", strM1100).apply();
                                        str5 = "۫ۗۖ۟ۤۜۛۤۖ۟ۤۘۘ۫۠ۦۖۡۤۨۛۦۧۢۜ۠ۥۘۧۢۘۘۙ۬ۤۧۗۛۙۥۥۘۧۚۙۦ۫ۜۛۜۘۥۙۢۛۗۧۛۙۛۧۨۙۦ۟ۡ";
                                        break;
                                    case 1416849652:
                                        C0237h4.m1090("this$0", mainActivity2);
                                        str5 = "ۡۖۖۘۗۦۖ۟ۦۡۘۘ۠ۛۚ۫۠ۢۥۙۢۥۧ۠ۘۛۗۨ۬ۡۢۘۥۜۗۜۖۖۘ۠۟ۗ۫ۨۘۘۨۨۗۡۚۖۥۘۖۛۘ۫ۙ۠ۥۘۘ۫ۨۡ۠ۡۘ";
                                        break;
                                    case 1488338016:
                                        String str9 = "ۡۖۤۜ۫ۧ۠ۙۥۧۜۘۘۙۥۢ۠ۘۥۖۜۧۗۤۧ۠ۖ۫ۘۚۛۢ۟ۥۖۤ۫۟۠۫ۖۜۚ۟۬۠ۦۙۛۥۘۘ۫ۡۨۘ";
                                        while (true) {
                                            switch (str9.hashCode() ^ 1831493357) {
                                                case -1090466680:
                                                    str9 = "۠ۚۤ۠۬ۥۘ۟ۡۦۘ۬ۥ۠ۜۖۜۜ۬ۛۚۘۙۛ۬۬ۙۛ۫ۤۥۦۚۙۘۛۚۜۘۨۨ۟۟ۘۘ۫ۖۧۖۥۤۗۖۨ۫ۡۥۥ۬ۦۘۖ۫ۤۙۖۙۛۤۗۧۗۥۘۡۦۜۘ";
                                                    break;
                                                case 401398825:
                                                    str5 = "۫ۗۖ۟ۤۜۛۤۖ۟ۤۘۘ۫۠ۦۖۡۤۨۛۦۧۢۜ۠ۥۘۧۢۘۘۙ۬ۤۧۗۛۙۥۥۘۧۚۙۦ۫ۜۛۜۘۥۙۢۛۗۧۛۙۛۧۨۙۦ۟ۡ";
                                                    continue;
                                                case 1756088646:
                                                    String str10 = "ۦۡ۬ۤۧ۬۠ۥۛ۫۬ۦۘ۫ۡۗ۬ۗ۠ۙ۠ۡۥۡۜ۠۟ۥ۟ۤۡۘۧۛۗ۬ۧۡ۬۟ۨۘۥۨ۫۫ۗۡۚۡ۟۬ۨۨ۬ۤۦۘۢۙۘ۠۠۟۫ۘۥۘ۬ۡۗۙۗۛ۠۫ۖ";
                                                    while (true) {
                                                        switch (str10.hashCode() ^ (-1989102105)) {
                                                            case -1627476491:
                                                                str9 = "ۡ۬ۖۘ۟۠ۙۗۜۢ۫۫ۛ۫ۗۖۡۢ۠ۢۢ۫ۘۘۗۤ۟ۘۙۛۗ۠ۗۚۡۥۘۤۙۡۘۢۛۧۘۜۘ۬ۚۤۘۘۥۘۜ۫ۘ";
                                                                break;
                                                            case -1493468737:
                                                                str9 = "ۨۜۨۛۥۙۘ۫ۖۖۙۗۧۚۖۖۧۥۖ۟ۛۦۧۘ۫ۛۖۢۨۡۘۚ۟ۡۘۦۥۚۜ۟ۡۘ۫۟۟ۙ۠ۥۖ۬ۢۤۘۘۥۥۗۖۘۡۘۜۚۥ۫ۘ۫";
                                                                break;
                                                            case -1490055891:
                                                                String str11 = "ۨۡۖۙۨۤۘۖۜۘۢۤۜ۫ۧۥۙۤۗۗۜۧۘۜ۠۠ۚۦۜۡۛۦۗۤۚ۠۫۬ۥ۬ۗۧۥۘۢۦ۟ۖۥۘۚ۟ۘۘۙۗ۬۟ۧۜۥۜۘۦۗۨۘ";
                                                                while (true) {
                                                                    switch (str11.hashCode() ^ (-1035869245)) {
                                                                        case -1697992073:
                                                                            str11 = C0406ta.m1245(strM839) ^ true ? "ۧۡۥۘۗۢۗۚۢۚۢ۟۠ۢۧۥۘۥۖۡۡ۬ۗۖۙ۠ۜۥۘۛۥۙۦ۟ۙ۫ۢۗۨۦۜۙۖ۟ۡ۟ۗ" : "ۧۤۦ۬ۖۧۘۨۡۜ۫ۡۘ۫ۨۡۘۦۦۥۘۢۜۜۘۡۡۖۙۡۗ۫ۚۨۘۜۙۖۢۚۖۡۥۢۡۖۢۘۗ۠ۧۦۧۘۥۢۥۘۢۢۙۡۦۖ۟ۤۡ۬ۢ۫ۗۧۛ۬ۜ۟ۖۚۡ";
                                                                            break;
                                                                        case -1391006977:
                                                                            str11 = "ۖۛۥ۬ۚۥۘ۫ۗۖۘ۠۫۫۠ۜۨۘۘۚۥۥۤۙ۠۟ۗ۠ۜۨۘ۠۠ۦۜ۟ۖۘۘۥۖۜۛ۠ۖۦ۬ۜۦۢۜۨۘۧ۟ۦۡ۟ۚ";
                                                                            break;
                                                                        case -827556720:
                                                                            str10 = "۬ۚۜۧۧۜۚ۟ۢۙۢۥۘ۠ۚۡۘۜ۬۫ۨۥۖۜ۬ۤۢ۟ۤۤۤۤۦۜۛۚۨۖۘ۫۫ۜۤۢۤ۫ۜۜۘۤ۬ۘۘۙۥۖۘۥ۫ۖۚۗۘۖۘ۬ۚۡۜۦۧۗۢ۠ۡۘۙۛۤ";
                                                                            break;
                                                                        case -470858168:
                                                                            str10 = "ۘۗ۠ۙۡ۠ۥۖ۠ۖۢۚ۟ۛۜۘۤۨۛۥۦۦ۟۬۬۟ۗۦۘۙۤۧۨ۫ۦۥۛۗۙۦۡۚ۠ۗۤۨۛۡۧۨ۫ۡۘ۫ۦۗۢۨۗۢۥۢۢ۫۫ۡۥۗۗۦۦۘۦۡۨۨۡ۫ۜۥۥ۠ۥۢ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -988826670:
                                                                str10 = "۬ۨ۬ۗ۫ۜۘۥۢۙ۫ۗۛ۫ۨۛۥ۟ۥۡۢۙۤۜۛۙۖۡۖ۬ۧ۟ۙۧۖۖ۬ۧ۠ۛۧۜۘ۬ۛۥۥۧۛۜۧۘ۬ۦۥۖۛۜۦۛۨ۟۠ۜۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 1926050341:
                                                    str5 = "ۛۦۦۘۡ۠ۥۘۙۙۜۘۦۖۥۘۡۤۡۤ۟ۨۘ۟ۘۡ۟۠ۨۘۖۧۖ۬ۖۙۖۚۤۧۥۜ۠ۛ۫ۤ۬ۡۡۤۦ۫ۡۧۤۖۡۘۧ۬ۗۥ۬ۦۤۘۘۥۦ۫ۗۥ۫۟ۙۢۨ۠ۗ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case 1558396133:
                                        str5 = "۠ۨ۟ۜۜۗۛۤۖۘ۟ۡۧۘ۟ۢۨۘۧۧۡۘۨۦۜۗۜۢۖۥۡۘۖۘۜۘۚۤۡۘۢۨۡۘۨۘۨۥۨۨۥۖۜۘۗۛۦۘۤۖۦۧۥۘۖ۟ۙۚۙۢۧۦۡ۟ۚ۫ۧۤۨۦۘ";
                                        mainActivity2 = this.f857;
                                        break;
                                    case 1647411397:
                                        "data";
                                        str5 = "ۤۦ۠۬ۜۛۜۨۘۗۜۧۧۚۥۘۦۗۧۧ۟ۨۚ۫۫ۜۜۛۤۙ۠ۜۜۘۗۧۜ۬ۥۘۘۧ۫۫ۤۨۖ۠ۤۦۧۥۥ۠ۛۡۘۖۤۨ۬ۚۘۘ۠۬ۛۛۦۦۘۡۢۡۘۤ۠ۥۘ";
                                        break;
                                    case 1927215549:
                                        aVar.getClass();
                                        str5 = "۬ۖۖۜۦۖۘۙۡۚ۠ۦۘۗۨۘۧۧ۠ۙۡۘۘۗۥۜۙۖ۟ۗۜۧۧۗۜۘۜۧۦ۫ۗۚۢۧۗۖ۬ۥۘۗۦۨۘۘۡۦۘ۠ۥۚ";
                                        break;
                                    case 2145274550:
                                        str5 = "ۧ۫۫ۡۨۖۖۡ۠ۤۤ۬ۢ۫ۦۦۡۘۤۤۢۚۧ۠ۨۡۨۘۧۘۧ۟۟ۙ۬ۘۘ۠ۥۦۥۛۢۥۤۜ";
                                        mainActivity = this.f857;
                                        break;
                                }
                            }
                        }
                    });
                    str = "ۚ۟ۗۜۖۛۚۨۜۘۜۦۦۤۧۜۤ۫ۤۤ۟ۙۢۤۤۦۖۜۘۤ۫ۧۤۖۥۘ۬ۚۚۚۥۨۨۖۦۘۛۧۢ۫ۖۗ۫۟ۧۚ۬ۨۛ۫ۖ۟ۘ۟ۦۘۧۘۤۗۧۤۦۖ۬ۢۖ";
                    break;
                case 1234511524:
                    setContentView(R.layout.main_activity);
                    str = "ۙۤ۠ۢۧۜۘۘۤۙۧۘۦۘۤۨۧۘ۟ۜۘۥۢۡۦۥۨۖۖۜۘۖۙ۟ۘۨۦۘۙۛۨۜۙۦۘۛۦۢۡۦۘۘۘۙ۠۟ۚ۟ۨۧۜۘ۟ۥ۠۠ۢۜۘۦ";
                    break;
                case 1338280492:
                    ((TextView) findViewById(R.id.mTvAdapter)).setText("不适配精简版，最佳适配:v8.57.0");
                    str = "ۥۧۘۘۢۘۘۡ۬ۘۢ۟ۧۙۚۘۨۙۦۥۡۧۘۢۤۢۜۛۢۨۢ۫۫ۡۡۥ۠ۚۜۛۢۥ۫ۚ۫ۘۘۚۖۛۦۘۡۘۖۢۜ";
                    break;
                case 1358959577:
                    super.onCreate(bundle);
                    str = "ۛ۬ۦۘۙۗۖۖ۠ۖۘۢۢۖۡۗۡۘ۠ۥ۠ۡۨۜۘۛ۠ۚۗۤۚ۠ۙۖۤۜ۟ۧۙۨۥۖۡۢۖۥۘۘۡۖ۟ۢ۬ۦۜۘۧۥۗۜۢ۠ۦۤۧۗ۫ۗ۫ۢۡ۬ۤۖ۟ۚۢ۠ۖۗ۫ۢۛۡۜۘ";
                    break;
                case 1432887755:
                    str = "ۨۙۚۘۥۦ۬ۦۘۗۗۗۜۗۨۘۧۨۧۘۢۡۢ۬۠۠۠ۢۖۘۛۚۙۖۛۖۥۙۡۘۜۙۜۜۥۧۜ۫ۦ۠۠ۛۢۢۧۛۡۦۧ۟ۖۘۥ۫ۤ۠ۜۘۘ";
                    switchButton = (SwitchButton) findViewById(R.id.mRbHide);
                    break;
                case 1519775789:
                    switchButton.m983(false, false);
                    str = "ۛ۠ۡۘۜۛۖ۬ۥۢۢۧۜۤۙ۠ۙۗ۬ۦۦ۬۫ۦۜۘۖۥ۬ۧۖۗ۫ۢ۫۠ۥۡۘۨۛۨۘۛۘۦ۠ۤۗۢۧۨۘ۬۟ۦۖۥۘۦۚۦۦۤۡۘۗۛۥۘۤۨۘۘۧۨۤۨۚۨۧۖۦ۠۟ۧۢ۟۟";
                    break;
                case 2124743270:
                    m6(new C0012f(this));
                    str = "ۚۗۨۗۘۥۚۛۥۘۧۘۨۜۖۧ۫ۜۘۤۙۜۘ۫ۚ۠ۛۡۡۖۥ۟ۨۜۙ۫ۥۜۘۙۚۨ۟ۥۘۢۡ۠ۢۢۦۢ۬ۡۘ۟ۜۡۘ۬ۚۨۘۢۖۤۧ۟ۦۘ";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ */
    public final void m5(boolean z) {
        String str = "ۥ۬ۥۘۖۦۚۗۢۜۘۖۜ۬ۤۜۨۘۡۢۦۘۡۛۨۘۤۢۜۘ۟۠ۡۘۤۨۤ۫ۡۥۘ۟ۜۨۘۨۢۗ۫۫ۥۖۘ۟۫ۡۘۢۢۙۜۤۡ";
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        ComponentName componentName = null;
        PackageManager packageManager = null;
        String strM915 = null;
        while (true) {
            switch ((((((((str.hashCode() ^ 753) ^ 878) ^ 686) ^ 640) ^ 19) ^ 272) ^ 47) ^ (-1270603220)) {
                case -1437444533:
                    str = "ۦۖۘۘۢۜ۟ۛۡ۟۫ۨۘۚ۫ۖۘۘۖ۬ۖ۬۫ۥۗۨۤ۫ۦۦۢۘۚۙ۠ۜۜۖۚۘۥ۬ۡۘۚ۬ۘ";
                    break;
                case -1425163308:
                    str = "ۨ۬ۛۙۜۖۖۚۧۘۨ۬۬ۡۡۖۨۥۘ۠ۧۥۘۙۜۙۗۦۛۜۤۜۘۘۥۜ۟ۛ۠۬۠ۚۙۛۙ۠ۦۚۢۨۡ۠ۜۘۙۦ۟ۘۛۖۘۧۖۤۦۡ۫ۛۢۙۢۦۡۤۥ۬";
                    packageManager = getPackageManager();
                    break;
                case -1257038845:
                    String str2 = "۬ۗۖۘۡۤۖۥۜۙۢۙۙۜۦۖۘۦۡۚۜ۬ۜۜۜ۬ۦۙۡۘۖۦۛۤۡۙۚۨۗۖۛۘۘۥۢۖۘۘۘۛۙۙۧۤۛۜۦ۠ۥۘ۫ۘۘ۠۫ۨۢ۠ۧۤۡۖۘۤۗۦۡۨۜۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1788508941) {
                            case -1180144000:
                                str = "ۚ۫ۦۘ۫ۖۜ۬ۘ۬ۧۛ۟ۡۧۘۨۗۖۘۜۤۜۘۙۧۦۘ۬ۗۜۘۗۖ۠ۘۦۦۘۧۦۦۘۨ۠ۡۘۛ۟۫ۗۖۢۥۛۡۘۧ۠ۦۘۜۖۤۜ۟ۛۗۥۗۥۧۥ";
                                continue;
                            case -650975028:
                                String str3 = "ۧۘ۬ۜۜۦۘ۬ۡۦۘۤۢۡۦ۬ۢۘۙۙۤ۠ۡۜ۬ۥۤ۬ۡۘۢۧۜۘۨۘۦۚ۬۟ۜۜۨۦۦۘۡ۬ۥۘۡ۠ۢۜۜۡۘۧۦۗ۠ۤۖۧۨ۟ۖ۟ۖۘ";
                                while (true) {
                                    switch (str3.hashCode() ^ (-303567573)) {
                                        case -1406234730:
                                            str2 = "ۚۖۥۘۤ۠ۢ۠ۛۜۘۨۥۜۘۤۖ۠ۤۧۢۧۦۧۘۤۤ۠ۨۖۢۜۡۘۡ۫ۧ۬۬ۘۤۥ۟ۖۨۨۡۥ۫ۖۧ۫ۙۙۙۢۙۥۘۛۛۥۤۚ۟ۙۢ۠";
                                            break;
                                        case -761268670:
                                            str3 = "ۨۛۥۘۘ۬ۜۘ۫ۦۡۘۦۨ۬ۖۤ۟ۤۧۥۦۗۡ۠۫۠ۗۢۘۙ۠ۚۗۖۘۥۛۚ۬ۦۘۗ۬ۦۧۦۘۘۡۘۧۘۨۨۛ۟ۨۢۦۖ۬ۛۚ۟ۡۥ۬۟ۘۘۡۖۗۨۧۨ";
                                            break;
                                        case -30538050:
                                            String str4 = "۠ۥۗۜۛۨۗۧۜۘۨۦۖۘ۟ۙ۠ۥۘۜۛۗۛۧۗۜۚۘۖۜۘۖۛۤۛۦۜۜۘ۠۬۠۫۟ۘ۬ۜ";
                                            while (true) {
                                                switch (str4.hashCode() ^ 334466079) {
                                                    case -1427338733:
                                                        str4 = "ۙۚۛۨۙۚ۬ۦۥۘۖۨۘۧ۫ۨۛۢۢۘ۬ۜۤ۟۫ۖۚۘۦۜۨۘۙ۟۠ۚۗۙۧ۟۫۬ۜۙۢۖۤۨۥۤۗۡۖۧۦۛ۟ۘۙۛۦۚۙۜ";
                                                        break;
                                                    case -1278836707:
                                                        str3 = "ۜ۠ۧۥۨۜۘۙۖۖۘۖۨۜۦۛۚۤ۠ۢۨ۟ۨۘۜۧۡۙ۫ۜۥ۬ۖۤ۠ۘۧۘۨۘۥۢ۫ۖۖ۠۫ۙ۠ۘۡۘۙۤۧۤۚۙ";
                                                        break;
                                                    case -955606414:
                                                        str3 = "ۙ۫ۜۘۤۘۚۥۥۘ۫ۗۦ۟ۦۖۘ۠۬ۥۧۚۗۧۧۨۨۧ۫ۤۡۦۚۧۥۘ۫ۧۡ۬ۖۘۦۜۥۘۡۘ۟۠۫ۚۨۦۗۙۜۧۘ";
                                                        break;
                                                    case -309677776:
                                                        str4 = packageManager.getComponentEnabledSetting(componentName) != i2 ? "ۛۜ۟ۡۤۘ۬ۧۖ۠ۙۨۗۥۘۘۙ۬ۛۖۖۘۦ۫ۤۙۥ۫ۧۢۦۖ۟۟ۨۖۘ۠ۢۦۢۢۦۘۙۥۘۘ" : "ۜۛۧۗۗۤ۠۠ۚ۬ۛ۫۫۟ۛ۫ۜۛ۟ۖۨۘۙۥۦۗ۠ۨۘۙۥۖۡ۬ۡۘ۬ۦ۬ۛۜۥۡۘۘۚۗۘ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 492178600:
                                            str2 = "ۨۙۦۘۦۚۗۥ۠ۖ۠۠ۨۘۢۘۢ۬۠ۥ۫ۢۖۘۚۡۡۘ۠ۘۨۖۥۘۥ۠ۨۗۡۜۘۨۥۥۘۦۚۘۘۜ۟ۙۛۤۥۘۛ۬۠۫ۥ۫ۢ۠ۙۡۤۨۘۨ۠ۙ۠ۖۛ۬۫ۖۘ۬ۗۥۘۜ۬۠ۖۜۜۢۘۘ";
                                            break;
                                    }
                                }
                                break;
                            case -584865243:
                                str2 = "ۦۥۜۤۚۘۤۨۨۖ۫ۧۜ۠ۚۛۤ۫ۜۘ۬ۚ۫ۤ۫ۥۧ۫ۘۧ۬۠ۖۧ۬ۥۙۢۢۡۜ۟ۖۜ۬ۡۜۘۛۗ۫ۜ۠ۖ۬۠ۦۘۗۥۨۘۦۙ";
                                break;
                            case -32263132:
                                str = "ۖۡۛ۟ۖۜۦۙۡۘۢ۫ۢ۠ۛۤ۫ۡۤۗۗۤۚۚۜۘۜۚۨۜۚۛ۫ۦۙۥۦۘ۠ۜ۫ۥۘۧۘۘۖۧۘۖۨۥ۠ۦۖۚۖۨۘۧۚۗۨۘۡۜۚۨۘ";
                                continue;
                        }
                    }
                    break;
                case -853716274:
                    i3 = 2;
                    str = "ۥ۟ۡۘۢۛۘ۬۟ۦۘۖ۟ۤۗۜ۫ۡۙۨۥۚۡ۬ۘۨ۫ۚۖۘۙۜۤۦۙۦۖۛۨۤۗۛۗ۟ۜ۫۟ۚۡۙۢۨۨۤۨۚۗۥۦۦۡۥۧۦۡ۟۠ۘۖ۠ۦۘۤۜۧۛۢۢۦۥۧۥۧۜ";
                    break;
                case -742419444:
                    str = "۠۬۟۬۟ۧۦۡۥۖۗۤ۠ۡۖۘۡۤ۬ۖۥۦۨۤۧۖۘۖۘ۬ۦۘۘۚ۟۫ۙۦۘۢۘۘۘۦۘۢۥۧۙ۟ۡ۟ۤۡۘۨۥۨۡ۫ۦۤۙۜۘۗ۟ۦۘ";
                    break;
                case -667215073:
                    str = "۟ۤۘۘۘۖ۟ۥۙ۠ۧۨۦۘ۟ۛۗۘۚ۠۟۟ۨۡۧۘ۟ۥۡۘۤ۬۫ۥۛۘۦۢۖ۬ۨۦۘ۬۠ۨۘۨۖ۠";
                    break;
                case -651480964:
                    str = "ۛۙۨۘۢۙ۠ۖۢۙۜ۫ۗ۫ۡۦۨۦۤۥ۟ۗ۬ۨۤۘ۬ۚۨ۫ۥۡۧۘۘ۠ۜۨۚۤۦۘۤۨۜۜۧۥۘۥ۟ۖۘ۬۬ۙۖ۟ۡۢۡۜۢۦۦۗ۠ۥۘ";
                    componentName = new ComponentName(this, strM915);
                    break;
                case -611138296:
                    packageManager.setComponentEnabledSetting(componentName, i2, 1);
                    str = "ۚ۫ۦۘ۫ۖۜ۬ۘ۬ۧۛ۟ۡۧۘۨۗۖۘۜۤۜۘۙۧۦۘ۬ۗۜۘۗۖ۠ۘۦۦۘۧۦۦۘۨ۠ۡۘۛ۟۫ۗۖۢۥۛۡۘۧ۠ۦۘۜۖۤۜ۟ۛۗۥۗۥۧۥ";
                    break;
                case -595508801:
                    str = "۟ۤۘۘۘۖ۟ۥۙ۠ۧۨۦۘ۟ۛۗۘۚ۠۟۟ۨۡۧۘ۟ۥۡۘۤ۬۫ۥۛۘۦۢۖ۬ۨۦۘ۬۠ۨۘۨۖ۠";
                    i2 = i;
                    break;
                case -349419276:
                    "alias";
                    str = "ۨۤۧۖ۟ۘۘۤۢۦۗۚ۬ۜ۫ۥ۠ۦ۫ۤۥۜۘۙ۟ۛ۫ۚۨۧ۬۠ۨۡۖۦۢ۬ۦۘۘۘۨۜ۟ۥۦۖۛۡۤۧۡۦۦۨۚ";
                    break;
                case -149366894:
                    String str5 = "ۗ۫ۗۨ۬ۜۘ۬ۙ۫ۢۨۦۘۡۛۥۘۧ۬۠ۢ۟۟ۦۧۡۘۦ۠ۨۘۚ۠ۘۘ۬ۙۤۛۜۘۗۢۗ۠ۢۢۘۤۚۜۡۨۘ۬ۘۖۘۖۛۖ۫۬ۥۘۨۦۜۘۚ۠۟ۧ۟ۘۨۗۥۗۛۚۤۜۥۘۛ۟ۨۘۤ۫ۧ";
                    while (true) {
                        switch (str5.hashCode() ^ 1350957929) {
                            case -1701396811:
                                str5 = "ۤۗۧۗۡۗ۠۠ۛۘۨۢۖۥۧ۟ۡۦۜ۟ۙۡۦ۫ۤۗۘۘۙۘۧۢۚۖۘۧۤۖۤ۬ۜۖ۬ۥۧۜ۠";
                                break;
                            case -1371860461:
                                str = "ۖۡۙۤۜۜۘۢ۟ۙۢ۬ۥۘۡۡۡۘ۠۬ۖۥۛۘۨۥ۫ۚۜۦۘۦۙۚۗۜۘۙۤۛ۠ۦۨۘۖ۫ۨ۟۬۠ۨ۬ۗۥۛۥۛ۠ۜۘۖ۟ۜۘۡۖۚ۠ۧۖۘۙ۫ۛۥ۟ۤۛۨۛ";
                                continue;
                            case -985237216:
                                String str6 = "۟ۚ۫ۧۙۨۘۧۚۡۘۥ۬ۦ۟ۡۗ۟۫ۜۤۦۜۛۖۖۚۦۧۘۥۜۙ۟ۧ۫ۤۤۙۡۘۘۦۙۨۗۘۙ۫ۥۘۥۛ۠ۜۢۘۡۘۦ۬ۗ۠۟ۗۡ۠۟۫ۦۧۘۨۚۥ";
                                while (true) {
                                    switch (str6.hashCode() ^ 320564569) {
                                        case -1231912385:
                                            str5 = "ۥ۟ۨۖۜ۫ۜۚۗۡۘ۠۬۬ۥ۠ۡۡۢۜۧۘۥ۟۬ۡۘۢ۫ۥۖۘۡۧۘۘۘۨۘۘ۟ۖ۟ۨۖ۬ۜۥۧۘۜۢۦۘ۫ۛ۟ۚۗۜۘ";
                                            break;
                                        case -1105025606:
                                            String str7 = "ۢۜۗ۠ۨۛۗۖۢ۬ۧۜۘۡۢۜۨۜۥۦۙۧۙۥۘۘۛ۟ۚۘۗۡۜۤۛ۟۟ۧۢۤۦۘۘ۠ۚۘۘۧۘۘ۬ۢۧ۠ۢۧۘ۫ۖۦۡۘ۟ۜۢۢۗۤۛۦۦۤۢۘۘ۠۫ۡ";
                                            while (true) {
                                                switch (str7.hashCode() ^ (-1297086518)) {
                                                    case -1580999491:
                                                        str6 = "ۛۘ۫ۦۛۡۥ۟ۥۘۥۛۙ۟ۡۨۘۧۗ۠ۦۡۗۧۜۥۡ۬ۛۤۧ۬ۤۤۘۘۙۚۖۨۛ۬ۧۚۘۘ۟ۧ۟ۦۦۡۘۜۨۜۘ۟ۥۧ۠۟۫۫ۛ۫ۜۖۦۘۤۛ۠ۚۛ۫";
                                                        break;
                                                    case -126336114:
                                                        str7 = z ? "ۙۨۜۘۥۛۘۨ۟ۖ۠ۨۘۘۦۦۥۘۜۘۨۘ۬ۙۘ۫ۛۜۘۛ۟ۦۧۡۜۘۢۤۖۘۨ۫ۥۘۥ۠۫ۘۥۗۦۨۦ۟۬۠ۗۤۖۗ۫ۧ" : "ۦ۠۬۫ۦۧۘۙ۫ۦۗۤ۫ۚۧۜ۬ۡۤۢۧۜۗ۬ۢۘۡۡۡۢۤ۫ۦۥ۠ۜۜۨۨۤۜ۠ۜۖۚۛۙۨۡۛ۟ۢۚۥۘۡۥۜۥ۠ۖ۠ۡۘۘ";
                                                        break;
                                                    case 1617783371:
                                                        str6 = "ۡۜۦۘۥ۠ۙۗۗۧۙۧۥ۬ۧۦ۟۟ۤۘۗۙۦۦۜۘۧۢۛۛۙۢ۟ۙۥۘۛۙۜۘۙۘۦۘ۬ۛ۫ۘۘۖۗۜۢ۬ۘ۠ۖۗ۫ۥۘ۫ۦۧۘۡۧ۬";
                                                        break;
                                                    case 1913513943:
                                                        str7 = "ۛ۟ۢ۬ۥۛۜ۟ۘۘۜۚۥ۟ۛ۬ۦۨۘۦۖۦۘۙۡ۫ۗ۬ۚۦۢۗۖۢۦۘۘۢۙۛ۟ۛۚۥۤ۟۟ۡۘۦۥۨۚ۟ۧ۟ۤ";
                                                        break;
                                                }
                                            }
                                            break;
                                        case -988004659:
                                            str5 = "ۡۜۜۚۡۥۗۧۦ۫ۘۧۘۘۖۘۘۨۧۥۖ۟ۡۗۜۜۘۢۥ۫ۢۛۡۘۢۜۨ۬۬ۖۡۤۗ۠ۘۢ۟ۜۦۦۡۘۢۦ۫ۜۖۖ۟۠ۘۘۖۛۗ۫ۡ۬";
                                            break;
                                        case -830937336:
                                            str6 = "ۦ۬ۦ۟ۗۖۘۙۦ۫ۥۜ۫ۢۡۦۗ۠ۗۧ۫ۡۜۨۘ۬۫ۦۘۢۤۨۘ۬ۗۖۘ۟۬ۛۘۚۘۘ۬۟ۦۥ۬ۚ۫ۚۤۖۖۜۘ۟ۙۦۘۡۘۧۘۢۙۤ۠ۖۖۧۤۜۘ۠ۘۚۗۜۦۡۨۨۙۙۨ۫ۢۨ";
                                            break;
                                    }
                                }
                                break;
                            case 336755201:
                                str = "۠ۧۖۖ۟ۜۘۢۘۜۘۚ۫ۡۖۨۦۘۖۧۗۧۨۘۨۡۧۢ۠ۨ۟ۦۨۘۥۤۖۘ۟ۙۘۘۦۥۘۘۙۛۢۛۤ۠ۛۤۛۜ۠ۥۘۨۙۨۘۛۘۖ۫۟ۖۘۧۛۛۢۜۦۧۚ۫ۨ۠ۘۘۖۜۦۜۡۡۧ";
                                continue;
                        }
                    }
                    break;
                case -4785282:
                    "context";
                    str = "ۗۗۨۘ۠۬ۜ۫ۨۥۘۜۢ۟۟ۨۨۦۖۘۡۚ۬ۗۨۨۗ۠ۡۘۛ۠ۙ۬۠ۗۜۚۢۖۘۨۤ۟۫ۛۢ۟ۘۦۘۢۜۙۨۙۚ";
                    break;
                case 715738840:
                    str = "ۨۤۜ۫ۙۘۘۤۘۥۖۦۜۤۜۦۘۚ۟۫ۥۘۖۘۥۜۤۢۛۢۤ۠ۘۘۢۤۖ۫ۧۘۘۚۘ۠ۨۦۗۘۘۜۚۤۖ۠۠ۙ۫ۨۘۤۨۧۘۙۦۥۘۥۛۛۢۙ۠ۙۘۜۨۦۗ";
                    i2 = i3;
                    break;
                case 1147438681:
                    return;
                case 1208350841:
                    str = "ۗ۟ۥۦ۫ۢۨۨۖۡۢۖۘۚۖۜۥۡۘۚۙۦۗۡۡۛۦۧۨۨۙۘ۬ۧۘۙۨۨۧۧۢۡۛۥۢۘ۫۟۬ۛ۫ۤۧۦۚ";
                    i = 1;
                    break;
                case 1391666754:
                    ((SharedPreferences.Editor) this.f16.m886()).putBoolean("hide_icon", z).apply();
                    str = "ۢ۟ۘۘۦۨ۫ۤۙ۠ۚۤۦۡۖۨۧۥۖۘۗ۟ۡۚۥۥۨۡۖۜۛۖۘۛۥۗۙ۟ۦۘۚ۫ۜۘۨۗۢ۟ۦ۬ۢۦۢۨۖۖۘۡۛۜ۠ۧۡۢۛۛۛ۫ۜۚۦۘ۫۟ۛۨۖۖۦۘۜۦۙ۠ۢۖۡ";
                    break;
                case 1699350593:
                    str = "ۡۡۦۘۦۧۜۘ۠ۙۥۖۦۧۗ۫۬ۙۗۢۚ۟۟ۛۥۘۥۛۨۧۢۜۘۛۖۘ۟۫ۘۧۢۦۘ۠ۤۨۗۢۜۘۨۢۥۘ۫ۡۡ۬ۤۙ۟ۘ۬۫۫ۗۥۧۘ۫ۢۙۙۘ۫ۡۘۨۘۖ۠ۗۡۜۦۤۙۜۘ";
                    strM915 = "com.skyhand.redbookhelper.MainActivityAlias";
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: ۥ۟ */
    public final void m6(InterfaceC0222g3<? super CharSequence, C0433vb> interfaceC0222g3) {
        String str = "ۨۤۨۤ۫ۦۘۖۗ۟۟ۧۧۙۧۧۛۦۜۘۜ۫ۜۘۜۛۥۘۘۢ۬۬ۜۘ۠ۡ۟ۘۜۡۥۨۢۛۜۤۜۨۜۘۡ۟ۜۘۦۦۘ۠۟ۘۜ۬ۢ۫ۗۨۘۢۙۥۘۡۤۖۘۚۘۦۘ۟ۖ۫";
        int i = 0;
        while (true) {
            switch ((((((((str.hashCode() ^ 689) ^ 745) ^ 616) ^ 358) ^ 942) ^ 987) ^ 865) ^ (-1619192683)) {
                case -2044079602:
                case -1105399743:
                    return;
                case -1979012997:
                    int i2 = C0330o.f1000;
                    str = "ۡۚۥۛۧۘۘۦۜۖۧ۫ۥۗۡۥۡۦۜۘۤ۫ۨۘۚۥۘۨ۬ۜۘۖ۠ۡۘۙۥ۫۟ۤۨۖۛۦۡۦۤۤۚۦۡۤۤۖۘۨۜۢۖ";
                    break;
                case -1595934536:
                    C0286kb c0286kb = AbstractC0356q.f1031;
                    str = "ۛۦ۬ۖۥۘۘۦۙۛ۟ۧۖۘۤۤۛۡۡۧۘۦۚۨۤۛ۬ۢۜۢۦۘۥۜۜۨۜۙۧۡۧۛۘۙ۫ۦۥ۟ۗ۬ۘۜۙۚۧۡۘ";
                    break;
                case -958301411:
                    str = "ۡۥۘۘۗۖۦۥۚۦۘۚ۫ۦۥۜۜۘۙۡۙۙۥۥۘۜۦ۫ۢۦۨۘۚۖۙۥۥ۬ۚۖۙۜۨۘۡۖۦۘ۫ۜۜۤۥۦۙۧۘۥۥ";
                    break;
                case -524448673:
                    str = "ۡۢۚ۬ۜۨۘۦ۠ۨۖۥۚۡۖۘۛۜۦۘ۬ۧۜۘۛ۬ۚۖۜۢۗۘ۫ۛ۫ۦۧۤۙۨ۠ۖۘۙۡۘۘ۟ۨۘۘۡۗۚۗ۫۫ۥۧ۠ۚۛۗۥۜۡ۬ۗۨۘۗۤۖۖۧۖۘۚۤ۫۬ۦۗۖ۟ۖۘۤۤۖۘ";
                    break;
                case -7280752:
                    String str2 = "ۡۛ۠۬ۜۘۘ۫ۧۤۨۖۧۘۘۗۡۘۙۘۤۛ۠ۘۤ۫ۦۘۗۘۘۘۛۥۜ۟ۡ۫ۦۜۘ۟ۖۥۛۤۤۗۨۢ۬ۦۗۦۗۙۙۨۘ۠ۙ۟ۙ۠ۨۘ۟ۘۘ";
                    while (true) {
                        switch (str2.hashCode() ^ 1456223456) {
                            case -1319067377:
                                str2 = "ۨۧ۫ۖۡۘۘۡۗ۫ۢۨۦ۟ۢۦۗۗۛۗۖۘۙۗۙۡۡۘۘۨ۟ۖۘۗۢۡۗۖۦۤۨۥ۠ۨۧۢ۠ۛۘۢۙ۬ۦۧۘ۠ۤۘۡۤۡۤۚۘۘۦۥۦۖۙۢۜ۟ۘۘ۟ۙۜۨۡ۬ۤۦۚ۠ۥۥ";
                                break;
                            case -303497804:
                                str = "ۥۛۙۚۤۛۥ۠۠ۤۨۘۛۡۚۙۜۘۜۡۖۘۛۖۚۜۦۤۨۦۢ۟ۜۘۡۦۥۥۥۖۘۧ۟ۡۘۨ۟ۦۖۚۨۗۚۡۗۘۛۡ۫ۨۘ۠ۤۚۥۚۢۡۖۖۛ۟ۤۢۘۘ";
                                continue;
                            case -173640619:
                                str = "ۤۦۨۜۖۧۙ۟۠ۨۘ۟۟ۖۖۘۨ۟ۗۛۨ۟ۖ۟ۢۘۗۛ۟ۤۥۙۗۤۧۜۧۤ۟ۥۘۜۙۧۖ۬ۖۨ۠ۗ۠۫ۙۖۢۦۚۨۛۤ۬ۙ۠ۦ۬ۗ۬ۦۘۨۖۘۥۙۜۘ";
                                continue;
                            case 2114027736:
                                String str3 = "ۘ۠۠ۖۤۖۘ۬ۡۚۚۛۢۡ۬ۙۦۛۚۚۛ۫ۦۗۘۘۡۡۢۗۨ۠ۙۘۦۘۢ۬۠ۨۧ۟ۘۚۛۘۗ۟۟۠ۦۘ۬ۦۡۗۚۖۘۡۛۙ۬ۜۦۘۜۧۨۘۜۦۘ۬۠ۨۘۧۚۛ";
                                while (true) {
                                    switch (str3.hashCode() ^ 1940290833) {
                                        case -1919093898:
                                            str2 = "ۤۘۜۘ۟ۙۖۡۥۘۚۖۘۥۨ۬ۗۦۖۛۨۛۖۛ۟ۘ۫ۨ۫۫ۤ۬ۨۢۥۜۜۢۥۥۘ۫ۧ۠۟ۧۡۧۙۦۖۨۛ۬ۧۡۘۢۥۧۛۙۘ";
                                            break;
                                        case -18054887:
                                            str2 = "ۗۧ۟ۖۗۤۗۚۖۘۤۧۡۘۧ۠ۥۙۡۦۥۥۦۘۛۡ۬ۢ۫ۤۢۤۤۢۤۚۖ۟ۡ۫۠۟ۛۧۥۘۨۧۥۘۤۡۡۘ۟۟ۚۖۗۨۘۥۜۗۘۛۨ۠ۦۤۨ۫ۥۛۖۡۖۜ۠";
                                            break;
                                        case 440188441:
                                            String str4 = "۬۫ۡۘۢ۬ۡۘۡۛۥۧۘ۫ۡۥ۠ۥ۟۬ۚۛۚۚۖۙ۫ۥۥ۬ۡۛۖۥۘ۫ۜۨۘ۬۬ۥۘۢۜۨۘۨۗۡۘۚۖۤ۠۬ۧ۬ۘ۫ۜۛۘۘۤ۠ۢ۠ۧۙ";
                                            while (true) {
                                                switch (str4.hashCode() ^ (-1272364635)) {
                                                    case -160502639:
                                                        str3 = "ۧۜۙ۟ۢۜۘۧ۬ۜۥۢۧۤۧ۫ۖۥۘۘۥۖۘۘ۬ۘۥۘۖۡۨ۬ۨۥۜۛۘۦۡۢ۬ۜۧۛۥۘۧۧۗۧۙۦ۠ۦۘۘ۬۫ۛۘۗۚۧۜۢۜۦۜۢۢۙۙۚۥۘۧۦۘۖ۟ۗ۬ۧۥۘ۬ۢۤ";
                                                        break;
                                                    case -73586221:
                                                        str3 = "ۗۡۜۛۛۤۚۡۚ۬ۛۘۘۦۗۦۡۧۖۘ۟ۙۗۜۥۗۘ۬ۨۘۦ۫ۙۥۙۗۖۚۚ۬ۚ۠ۘۥۘ۠ۡ۠ۘۚۥۜۡۧۘ۟۬ۗۨۤۖۘۢۘۘۥ۠ۢ۠ۖۥۦۙۡۢ۟ۢ";
                                                        break;
                                                    case 776726080:
                                                        str4 = i > 3 ? "ۘۖ۟ۗۘۤۨۧۖۘ۠ۛ۟ۧۘۥۤۥۢ۬ۡۧۘ۬ۨۜۘۗۖۨ۫ۨ۫ۨۜۡۘ۬ۖۥۙۥۖۘ۬ۤ۫ۛۙۦۘۜۗۛۖۢۡۘ۬ۖ۠ۛ۬۟ۚۘۥۘۙۡۙ۟ۘۚۚۜۜۘۜۗۤۢۧ۬۠۬ۢۧۥۖ" : "ۥ۠ۛۥۜۤۘۧۤۛ۬۫ۛۖۥۥۨۚ۠ۧۘۘۦۢۗۜۜۙ۬ۨۗۘۜۘۘۥۛۚۢ۟ۜۘ۫۬ۛۦۤۛۤۖۜۚۢۧ۬ۤۧ۠ۤۚۚۢۗۨۘۛ۠۠ۛ۬ۖۙ۬ۦ۟";
                                                        break;
                                                    case 1028452609:
                                                        str4 = "ۢۢۘۘۗۙۡۘۧۛ۫ۥۧۖۡۦۘۤۨۛۖۗ۫ۡۜۜۜۖۤۡۛۘۘۙۦۛ۬ۘۘۘۘۙۘۘۚۦۖۘۤۢۡۙۙۡۘ۬ۙۛ۠";
                                                        break;
                                                }
                                            }
                                            break;
                                        case 721193440:
                                            str3 = "ۙۦۘ۟ۡۖۥ۟ۘۘۤۜۥۘۧ۬ۡۘ۬۠۬ۙۘۡۘۜۧۧۗۖۛ۠ۥ۠ۢ۬ۡۥۡۨۨۚۥ۬ۘ۫ۦۖ";
                                            break;
                                    }
                                }
                                break;
                        }
                    }
                    break;
                case 825257313:
                    this.f1293 = 0;
                    str = "ۥۨ۟ۖۡۦۗۤۘۘ۠ۙۗۜ۫ۡۘۗۡۘۗۙۦۘ۠ۦۥۘۥۜۡۘ۫ۦۡ۬ۜۚ۟ۗۗۖ۫ۡۖۗۤۤۗۗۥ۬ۥۨۗۚۤۨ۫ۦۚۨۤۙۢۜ";
                    break;
                case 1596954790:
                    interfaceC0222g3.mo984(C0330o.m1175(C0330o.m1174("获取适配版本失败，请确认允许网络权限", "red")));
                    str = "ۜ۟ۖۨۘۨ۬ۤۙۤۨۥۚ۫۟۬۬۬ۚۖۦۘۖۨۦۛ۬ۨ۠ۤۙۤۗۥۙۢۢ۫ۨ۠ۡۦ۠ۗۖۘ";
                    break;
                case 1733310950:
                    AbstractC0356q.c.m1191().execute(new RunnableC0258ib(interfaceC0222g3, this, 1));
                    str = "ۙۤۙۗ۠ۗۧۡۘۢ۟ۙۛۘ۫ۡۘۚ۬ۤۖۧۘۘ۬ۢۤۚۜۚ۠ۥۘۤۧ۬ۖۧۥۥ۠ۥۛۘۥۗۘۥۚۜۨۘ۟ۢۘۘۜۥۧۘۗۗۚ۫ۚۜۘۥۥۢۖۢۡۘ۫۬ۦۗ۬۫ۘ۬۫ۥ۠ۦۘ";
                    break;
                case 1746779472:
                    this.f1293 = i + 1;
                    str = "ۚۧۨۘۨۤۦۙ۬۠ۖۛۘۦ۬ۡۘۚۦ۬ۢۡۙ۠ۡۜۙۥ۬۠ۡۡۘۘۘۨۘۥۙۢ۫۟ۥۙ۫ۨۡۛۘ۬ۨۡۘ۠ۚۨۢۘ";
                    break;
                case 1821393195:
                    i = this.f1293;
                    str = "ۘۧۥۘۘۧۘۖۢۘۘ۟ۦۙۖۦۘۙۥ۬ۧۨ۫ۖۤۙ۬ۨۘۡۥۜۘۨۖۥۘ۠ۗۥۘۜۗۡۘۜ۠ۤۧۦۘۙۗۜۘۚۧۙۛ۬ۢۖۜۦۘۥ۠۟۟ۤ۟";
                    break;
            }
        }
    }
}
