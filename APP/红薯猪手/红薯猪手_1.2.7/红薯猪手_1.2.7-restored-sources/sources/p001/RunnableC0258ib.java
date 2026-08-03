package p001;

import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skyhand.redbookhelper.MainActivity;
import com.skyhand.redbookhelper.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import p001.AbstractC0356q;
import p001.C0235h2;
import p001.C0283k8;

/* JADX INFO: renamed from: ۟.ib */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class RunnableC0258ib implements Runnable {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ int f864;

    /* JADX INFO: renamed from: ۥ۟ */
    public final /* synthetic */ Object f865;

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public final /* synthetic */ Object f1521;

    public /* synthetic */ RunnableC0258ib(Object obj, Object obj2, int i) {
        this.f864 = i;
        this.f865 = obj;
        this.f1521 = obj2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x030a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() throws InterruptedException {
        int iM1256;
        String strM1177;
        boolean z;
        String str;
        String str2;
        final int i = 0;
        final int i2 = 3;
        final int i3 = 2;
        final int i4 = 1;
        switch (this.f864) {
            case 0:
                AbstractAlertDialogC0230gb abstractAlertDialogC0230gb = (AbstractAlertDialogC0230gb) this.f865;
                CharSequence charSequence = (CharSequence) this.f1521;
                C0237h4.m1090("$this_showButtonTime", abstractAlertDialogC0230gb);
                abstractAlertDialogC0230gb.f1486.setEnabled(true);
                if (abstractAlertDialogC0230gb.f1485.getVisibility() == 0) {
                    abstractAlertDialogC0230gb.f1485.setEnabled(true);
                }
                abstractAlertDialogC0230gb.f1486.setText(charSequence);
                return;
            case 1:
                InterfaceC0222g3<? super CharSequence, C0433vb> interfaceC0222g3 = (InterfaceC0222g3) this.f865;
                MainActivity mainActivity = (MainActivity) this.f1521;
                C0286kb c0286kb = MainActivity.f1289;
                C0237h4.m1090("$callback", interfaceC0222g3);
                C0237h4.m1090("this$0", mainActivity);
                Thread.sleep(500L);
                C0235h2.f823.getClass();
                String strM949 = C0415u6.m949(C0235h2.a.m862() + "adapter-26.json", null, 6);
                if (strM949.length() > 0) {
                    String str3 = C0134a.f671;
                    strM949 = C0272jb.m1099(C0134a.m799(strM949, "adapter026666666"));
                }
                if (!C0406ta.m942(strM949, "{")) {
                    mainActivity.m6(interfaceC0222g3);
                    return;
                }
                JSONObject jSONObject = new JSONObject(strM949);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("info");
                Integer numValueOf = jSONObjectOptJSONObject != null ? Integer.valueOf(jSONObjectOptJSONObject.optInt("s")) : null;
                if (numValueOf != null && numValueOf.intValue() == 4) {
                    strM1177 = "-1";
                } else {
                    ArrayList arrayList = new ArrayList();
                    Iterator<String> itKeys = jSONObject.keys();
                    C0237h4.m1089("keys(...)", itKeys);
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        if (!C0237h4.m864(next, "info")) {
                            C0237h4.m865(next);
                            arrayList.add(C0406ta.m1247(next, "a", ""));
                        }
                    }
                    strM1177 = C0331o0.m1177(arrayList, "、", null, null, null, 62);
                }
                interfaceC0222g3.mo984(strM1177);
                return;
            case 2:
                MainActivity mainActivity2 = (MainActivity) this.f865;
                final C0336o5 c0336o5 = (C0336o5) this.f1521;
                C0237h4.m1090("this$0", mainActivity2);
                C0286kb c0286kb2 = MainActivity.f1289;
                if (C0237h4.m864(c0336o5.f1729, Boolean.TRUE)) {
                    ((TextView) mainActivity2.f1290.m886()).setOnClickListener(new ViewOnClickListenerC0458xa(i4));
                    ((TextView) mainActivity2.findViewById(R.id.mTvWechatTitle)).setVisibility(0);
                    TextView textView = (TextView) mainActivity2.findViewById(R.id.mTvWechat);
                    textView.setVisibility(0);
                    textView.setOnClickListener(new ViewOnClickListenerC0458xa(i3));
                }
                if (!TextUtils.isEmpty(c0336o5.f1728)) {
                    TextView textView2 = (TextView) mainActivity2.findViewById(R.id.mTvTip);
                    textView2.setVisibility(0);
                    int i5 = C0330o.f1000;
                    String str4 = c0336o5.f1728;
                    C0237h4.m865(str4);
                    textView2.setText(C0330o.m1175(str4));
                    ((TextView) mainActivity2.findViewById(R.id.mTestTip)).setVisibility(8);
                }
                C0332o1 c0332o1 = c0336o5.f1008;
                if (c0332o1 == null || (str2 = c0332o1.f1723) == null) {
                    z = false;
                } else if (str2.length() > 0) {
                    z = true;
                }
                if (z) {
                    TextView textView3 = (TextView) mainActivity2.findViewById(R.id.mTvQQOne);
                    textView3.setVisibility(0);
                    textView3.setOnClickListener(new View.OnClickListener(c0336o5, i) { // from class: ۟.j5

                        /* JADX INFO: renamed from: ۥ */
                        public final int f874;

                        /* JADX INFO: renamed from: ۥ۟ */
                        public final C0336o5 f875;

                        {
                            this.f874 = i;
                            this.f875 = c0336o5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = 0;
                            String str5 = null;
                            String str6 = null;
                            String str7 = null;
                            String str8 = null;
                            C0336o5 c0336o52 = null;
                            C0332o1 c0332o12 = null;
                            String str9 = null;
                            String str10 = null;
                            C0336o5 c0336o53 = null;
                            C0332o1 c0332o13 = null;
                            String str11 = null;
                            String str12 = null;
                            C0336o5 c0336o54 = null;
                            C0332o1 c0332o14 = null;
                            String str13 = null;
                            String str14 = null;
                            C0336o5 c0336o55 = null;
                            C0332o1 c0332o15 = null;
                            String str15 = null;
                            String str16 = null;
                            String str17 = "ۜۨۙۨۚۜۘۘ۬ۤۥۗۗۙ۫ۜۨۨۨۘ۫ۨۜۘ۟ۙ۟ۘۚ۬ۢۧۨۘۘۧ۫ۘۚۜۘۤۡۡۘ۬ۨۘ۬ۚۧۜۘۚۙۙۢۨۥۚ";
                            while (true) {
                                switch ((((((((str17.hashCode() ^ 937) ^ 416) ^ 550) ^ 440) ^ 297) ^ 920) ^ 0) ^ (-193156567)) {
                                    case -1976897249:
                                        String str18 = "ۨۖ۠ۤۨ۟ۜۡۘۘ۠ۛ۟۟ۦۡ۫ۧۛۢۨۙۢۜۘۤۖ۟۬۬ۙۤۘۛۢۙۖۘۛۗۡۨۨۥ۠ۜۥۘۢۗۚۨۚۥۢ";
                                        while (true) {
                                            switch (str18.hashCode() ^ (-1657001700)) {
                                                case -1542852949:
                                                    String str19 = "ۚۘۨۡۦۥۘۡۜۤۥۖۤۦۚۚۜ۫ۥۘ۟ۚۢۡۚۡۘ۟ۜۢۧۗۛۧۘ۫۟ۙۨ۠ۦۥۚۙۙ۫۫ۙ۟ۡ۬ۢۦۗۦۜۘۘ۠ۥۘۗۖۛۢ۫";
                                                    while (true) {
                                                        switch (str19.hashCode() ^ 114193177) {
                                                            case -1654208069:
                                                                str19 = "ۤۧۜۘۜۜۜۖ۠۠ۖۨۢۢۧ۫ۛ۬ۜۘ۠ۚ۟ۘۦۘۢۛ۫ۗۥۘۘۧ۫ۘۘۙۜۚۤۢ۬ۗۦۚۡۘۘۘۖۘۗ۠ۤۜ۫۠ۗۖۜۡۢۚۦۧ";
                                                                break;
                                                            case -824909501:
                                                                String str20 = "ۦۛۛۡۙۜ۠ۤۥۚۢۥۛۚۢۙۖ۟ۤۡ۬ۗۥۦۘۛۨۘۛۙۜۨۙۦۨۚ۟ۖۨ۠ۤ۬ۡۘۧۚۨۘ۬ۥۨ۫۫۫ۨۗۙ";
                                                                while (true) {
                                                                    switch (str20.hashCode() ^ 164210155) {
                                                                        case -527667276:
                                                                            str20 = c0332o13 != null ? "ۙۤۤۧۖۙۗ۟۠۬ۤۨۥۜۛۦ۠۫ۥۨۥۙۘ۫ۧ۫ۘۦۨۘۙ۬ۧۘۜۤۖ۬ۚۗۡۧۚۡۡۘۙۚۢ۬۬ۡۘۤ۟ۚۛۖۥۘۡۛۧۡۙۘۤۚ۟ۛۙۡۘۜۦۡ" : "۟ۧۧۦۥۘۡۘۗۜۜۘۗ۬۬ۢۧۜۖۖۢۨۨۘ۠ۖۘۘۗۗۡ۬ۛۡۗۜۡ۟ۨۦۘۗۛۚ۫ۚ۬ۛۤۙۤۧ۠ۙ۟ۙ";
                                                                            break;
                                                                        case 930427964:
                                                                            str19 = "ۦۤۖۘۖۦۨۖۚۘۡۧۙۡ۬ۤۧ۬ۤۗ۟ۢۡۛۢۧۦۘۘ۟۠ۚۖۡۘۗۨۖۘۥۚۛۜۧۘۥ۟ۜۘ۠ۛ۠ۙۖۘۛ۬ۢ۠ۘۢۙۛۚۡۡ۬ۙۘۖۘۢۡۡۙ۬۟ۚۢ۬ۚ۫۠ۧۤ";
                                                                            break;
                                                                        case 1310252649:
                                                                            str19 = "ۛۘۥۙۖ۫ۢۖ۟۟ۢۥۘۥۡۦۖ۬ۖ۫ۜۧۨۛ۬۠ۤۦۖۖۛۥۦۘۨۤ۟ۚۛۧۛۤۖۘۧۦۙ";
                                                                            break;
                                                                        case 1964778413:
                                                                            str20 = "۠ۨۡۙ۬ۘۤۦۜۘۤ۠ۦۥۦۨۦ۫ۡ۫ۢ۠ۥۢۨ۠ۧ۠ۘۧۥۜ۠ۥ۫ۨۘۙ۫ۦۙ۬ۚۦۢ۟";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -423824707:
                                                                str18 = "ۡۗۘۦۖۗ۫ۘۦۘۨۚۨۘۢۛۨ۬ۢۖۢۜۘۢۧ۠۠ۛۡۦۧۖ۬ۘۜۗۥۘۚۗۤۗۦۖۘۙۘۜ۟ۢۨ۫ۥۦۘ۟ۥ۟";
                                                                break;
                                                            case 982425732:
                                                                str18 = "ۦۨ۫ۜۤۘۘ۫۠ۚ۠۫ۖ۫۠ۜۥۦۦۖۗۥۘۜۘۖۘۢۚۘۡۥۨۖۧۗۨۧۗۜۤ۬ۢۙۘ۬۟۬ۗۦۥۘۚۚۢۜۖۡۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 526286094:
                                                    str18 = "ۜۖۖۘۚۗ۬ۛۛۖۗ۟ۥۢۛۛۖۧ۠ۖۤۡۘۚۥۗۡ۫ۖ۫ۖۤۗۛۡۘۡ۫ۡۘۨ۫ۜۘۢۧ۟ۛ۠ۨ";
                                                    break;
                                                case 653886550:
                                                    str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                                    continue;
                                                case 871669741:
                                                    str17 = "ۖۥۥۘۛۨۨۘ۬ۜۨۖ۟ۖ۠ۛۘۘۜۥ۟ۜۙۦۘۗۨۘۘ۫ۛۨۘ۬ۘۗۗۗۗۘۙۙۥۚۜۗۧۗۦۡۙۤۡۥۖۙ۫ۦۙۜۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1958056289:
                                        c0336o54 = this.f875;
                                        str17 = "ۜ۟ۗۙۖۡۘۧۡ۟ۤۧۚۦۨ۫ۦۦۦۘۨۡۡۘ۬ۤۗۛۙۘۚۛۘۘۦۘ۫ۧۧ۫ۦ۠ۙ۫ۨۘۥۡۘ";
                                        break;
                                    case -1917108434:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "۟ۛ۠ۚۡۖۖ۠ۡۘۥۢۛۖۥۘ۬ۢۢۘۗۤۤۜۖۧۗۨۦۖۦۘۙۡۙۧۚۙۚۗۧۥۚ۫ۙۡۨۖ۟ۦۘۗۢۗۗۛۨۘۤۧ۫ۛۛۘۥۢۜۘۗ۫ۛۢۙۨۘۡ۠ۖ";
                                        break;
                                    case -1788180115:
                                        str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                        str12 = str11;
                                        break;
                                    case -1777849339:
                                        str17 = "ۜ۠ۧۧۡ۟ۗۘۥۚۢۜۘۙۛۦۘۗۤۗ۫ۡۥ۫۫ۧۡۤۥۘۦۡ۠ۧۡۜۨۨۨۘۗۢۚۤۙۚۖ۬ۧۖۧۙۡۚۨۥۛۙ";
                                        str14 = str6;
                                        break;
                                    case -1542759203:
                                        C0237h4.m865(str12);
                                        str17 = "۟ۖۤۦۤۘۘ۠۫ۗۗۙۘۗۤ۫ۡ۠ۦۢۧۡ۬ۘ۠۠ۦ۬ۨۙۥۨۢۖ۫ۧۚۘۖۘۦۧۜۨۖۧۘۗۨۗۥ۠ۚۛۘۛ";
                                        break;
                                    case -1484789383:
                                        c0336o53 = this.f875;
                                        str17 = "ۚ۠ۦۘۨۨ۟ۚۢ۠ۨۙۡۘۤۖۘۘۛۚ۬۟۠ۧۖۘۖۖۦۘۦۦۥۘۧۜ۠۫ۧ۬ۘۤۥۘۗۧۜۘۥ۟ۦ";
                                        break;
                                    case -1430289878:
                                        c0332o15 = c0336o55.f1008;
                                        str17 = "ۦۥ۫ۤۤۛۚۖ۬ۙ۫ۘۚ۠ۙۢۨۖۘۨۢۧۗۚۧۘۛۙۗۧۦۘۗۚ۠ۚۜۘۘۜ۟۠ۨۘۙۛۖۘۘۨۨۘۖ۫ۖۘۧۡۦۢۚۨ۠ۚۧۤۜۧۛۡۧۘۖۤۡ۬ۡۧۘۢ۠۫ۨۦۡۘ۬ۗۗ";
                                        break;
                                    case -1402821200:
                                        c0336o52 = this.f875;
                                        str17 = "ۤ۫ۖۘۗۛۦۖۖ۫ۛۧ۬۬ۥۨۜ۫ۢۡۢۢۖۖ۫ۤۘۨۗۢۨۧۗۧۤ۫ۥۦۙۙ۟ۧۛ۟ۢۢ";
                                        break;
                                    case -1341922224:
                                        String str21 = "ۖۡۙۥۘۘۥۚۧۧۘۧۘۤۘۥۘۘ۟۬ۙ۫ۢۦۘۙ۠ۥ۬ۘۘۙۡۖۤۧ۫ۗ۟ۘۨۘۨۙۚ۬ۜۜۘۗۧۜۧ۠ۖۚۢۨۖ۫ۨۘۖۢۡۜۨۘ";
                                        while (true) {
                                            switch (str21.hashCode() ^ (-551252153)) {
                                                case -1848917142:
                                                    String str22 = "۬ۤۛ۫ۖۜۨۘ۫ۦ۬ۗۖۧۡۘ۫۟ۘ۟ۗۘۨۙۤۖۙۖۢۜۘ۟ۨۡۚۤۜۘ۠ۥۧ۫۟۠۫ۗۘ";
                                                    while (true) {
                                                        switch (str22.hashCode() ^ 229539457) {
                                                            case -2047809925:
                                                                String str23 = "ۚۛۙۘۚۦۘ۬ۘۚۦ۠ۦۛۙۖ۬ۖۖۙ۫ۘۘۛۖۘۖۙۦۘۤۨۨۚۙۘۘۢۙۚۢ۟ۥۥۜۧۘۤۛۦۘۛ۠ۜ۬ۡۖۙۖۖۘ";
                                                                while (true) {
                                                                    switch (str23.hashCode() ^ 1882648421) {
                                                                        case -1342174619:
                                                                            str23 = c0332o12 != null ? "۬۟ۘۘۦ۠۫ۙۦۨۘۧۙۡۡۡۘ۠ۦۛ۬۠ۡۛ۟ۦۘ۠۠ۛۗۡ۟۟ۦۙۗۖۜۨۨۛ۠ۥۥۘ۬ۥۛۚۖۡۚۖۜۛۢۨ" : "ۤۙۚۖ۠ۡۦۥۘۡۚ۬ۗۨ۟ۨ۠ۖۛۡۘۤۜۤۦۧ۠۬ۛ۟ۧۘۢۦۖۢۤۘۧۘ۟ۤۨۘۦۖۘۙۜۥۢۘۥ۠۬ۤۚ۟ۦۘۘۥ۠۟ۤۦۘۙۨۢ۬۬ۜۘۖۙ۠ۧۗۦۘ۫ۥ۬ۢ۟ۥ";
                                                                            break;
                                                                        case -1005594639:
                                                                            str22 = "ۗ۟ۢ۟۠ۤۛۜۦۗۦۥۥۢۖۤۖ۬ۛ۬۬ۧۛۙۡۦۡۡ۬ۘۨۜۛ۟ۤۖ۬ۛۚۤۡۧۖۨۨۘۖۙۘۘۛۧۘۙۥۢۨۧۜۧۡۚۗۧ۬";
                                                                            break;
                                                                        case 818439621:
                                                                            str23 = "۫۫ۤۙۙۚۙۙۖۡۨۘ۟۠ۤۦۘۙۡۡۙۤۧۖۘ۟ۛ۠۬۬ۦۘۖۡۖۧۧۥۘۡۨۗۛۛۖۘۦۡ۠ۖۤۨۘۜ۟ۧۤۗۛ۠ۡۢۘۘۘۗ۠ۙۡۘۘۗۘۦۘ";
                                                                            break;
                                                                        case 1987400100:
                                                                            str22 = "ۢۨۙ۟۟ۘۘۚۧۗ۟ۖۘۘ۟ۖۘۛۚۨ۬ۚ۟ۜۨۡۘۢۜۗۦ۟ۘ۫ۢۤۚۥ۟ۢ۟۫ۗۙۢۡ۟ۨۗۜۖ۟۠ۥۘۨۚۡۘ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -1875414390:
                                                                str21 = "ۖۗۜۘۢۖۙۛۡۜۥۥ۫ۖ۠۫۬ۖۗۡ۠ۘ۠ۨۜۘۗۘۜ۫ۛۙۤۗۖۘۚۘۚۘۛۡۘۧ۬ۨۘ۟ۘۘۢۗۗۖ۟ۦۘۘۤۛۦۛۖۚۢۨۨۗۨۘۢۜۘۢۖۦۥ۫";
                                                                break;
                                                            case -1586829220:
                                                                str22 = "ۡۢۛۤۛۛ۠ۙ۫۟ۨۨۘ۟ۛۘۘ۟ۤ۫ۘۨۚۛۦۗۥۡۡۥۧۦۛۜۚۚۨۗ۬ۧۤ۬۫ۨۗۘۡ۠ۚۙ۫ۥۘۗۜۡ۠ۦۛۖۗۛ۬ۦ۠";
                                                                break;
                                                            case -40669877:
                                                                str21 = "ۚ۟ۜ۟۟ۚ۟ۨۚۘۜ۠ۖۥۛۥۘۗۡ۫ۡۘۦۖۤۤ۟ۚۢۨۚۢ۫ۗۘ۠ۖۘ۠۠ۨۘ۫ۥۙ۬ۡۦ۠ۘ۠ۗۨۘۘ۠۠ۦۨۢۥۘۢۖۙۤۖ۟ۜ۫ۥۚۧۥۚۗۜ۬ۗۡۤۗۡۤۧ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -1454025742:
                                                    str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                                    continue;
                                                case 678583481:
                                                    str21 = "ۙۦ۟ۦۡۘۘۖۥ۫ۨۤ۫ۘۛۥۘۗۨۨۦۙۨۚۛۦۘۙۜۗۥۧۜۨ۫ۚ۬۟ۜۙۖۘۨۢۢۨۧۘۤۖۖۡۚ۬ۦ۠ۘ۠ۖۛۘۡۡۡۥۛۦۛۘۘۖ۟ۜۡ۟ۦۗۨۛۖۜۙۦ۟ۗ";
                                                    break;
                                                case 2072360398:
                                                    str17 = "ۗ۠۟ۨۗۨۧۜ۠ۧ۫ۡۘۧۚۡۤۤۥۥۦۧ۠ۨۨۘ۠ۦۖۘ۠ۛۢۤۨۖۨۛۡۘۖۙۨ۠ۢۦۢ۟۟ۙ۬ۤۡۡۖۘۧۡۙ۠ۙۡۘۥۡۘ۬۫ۡۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1340151938:
                                        C0286kb c0286kb3 = MainActivity.f1289;
                                        str17 = "ۜۧ۫۬ۨۜۘۥ۟ۜۘۡ۠ۙۖۖۜۘۛۧۘۘۨۛۚۗۡۥۘۦۛۧۛۥۖۘۨ۟ۡۙ۬ۢۚۜۘۡۗۥ۫ۛۢۧۚۥۘۙ۫ۨۨۤۤۖۛۤ۫۟ۜۚ۫ۗ";
                                        break;
                                    case -1319014332:
                                        str17 = "ۜ۟ۦۦۛۜۙ۠ۦۖۦۘۗۜ۠ۘۘۥۨ۬ۘۘ۫ۙۡۚۤۢۦ۟ۜۘ۟ۘۡۘۘۢۚۦۛۢۨۛۛ۫ۜۨۘۧۘۛۛۘۥۡۦ۟";
                                        break;
                                    case -1278481967:
                                        C0330o.m1167(str14);
                                        str17 = "ۘ۬۠۟ۥۘۘ۟ۗۤۨۘ۟ۧ۟ۢۦ۫۫ۗۗ۬ۚۙۤ۬ۦۤۧۚۙ۫۠ۧۗۚۘۜ۟ۤۢ۫ۡۘ۫ۢۡۘ۫۫ۜۘۦۧۧ";
                                        break;
                                    case -1219436409:
                                        str11 = c0332o13.f1723;
                                        str17 = "ۨۦۙۤۡۢ۠ۧ۬ۘۛۡۘ۠ۛۘۖۛۘۜۧۖۘۦۤۘۘۗۗۦۧۢۚ۠ۡۙۛۢۦۘۖۥۙۥ۠ۨ۬ۘۧۘ";
                                        break;
                                    case -1064727507:
                                        C0330o.m1170(str10);
                                        str17 = "ۗۖۘۘۘۙۨۙۨۘۘۢ۟ۡۡۦۧۘۢۤۚۧۚۦۜۨۚۗ۬ۨۘۚ۫ۖۘ۬ۧۜۘ۠ۘ۬۫ۖۤۗۜۘ۫ۛۖۗۘۗۡۢۗۦۜۘۜۥۨۜ۟ۛۚۡۨۢۨۤۦۨۜۘۗۙۢ";
                                        break;
                                    case -1055073887:
                                        str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                        str16 = str15;
                                        break;
                                    case -1006430172:
                                        C0286kb c0286kb4 = MainActivity.f1289;
                                        str17 = "۟ۖۤۦۤۘۘۚۧۛۥۖۘۢۜۥ۬ۤۨۘۧ۠ۗۡۙ۠ۙۢۖۜۘۘۤۜۡۘ۟ۨ۟ۘۥۖۘۙ۠ۙۖ۫ۖۘۡۚۨۢۧۨۘۚۖ۬ۙۙۖۘۡ۠ۥۤ۫ۢۛۚۤۤۛۜ۠ۜ۫";
                                        break;
                                    case -901673525:
                                        C0237h4.m1090("$mainTip", c0336o52);
                                        str17 = "۠ۥۡۦ۫ۥ۬۠ۗۗۖۜۚ۟ۗۨ۫ۗۙۘۗۖ۬ۙۧۥۜۘۜۚۛۧ۠ۚ۬ۚ۫ۧۗۤۚۚۜۚۖۧۘ";
                                        break;
                                    case -883400274:
                                        String str24 = "ۧۚۥۘ۠ۦۥۘۧۧۢۥۘۡ۬ۘۢۖ۫ۚۛۥ۟ۤۥۚۨۧۜ۠ۜۧ۠ۢۥ۠ۥۖ۠ۖۧۢۘۘۨۤ";
                                        while (true) {
                                            switch (str24.hashCode() ^ (-1337738846)) {
                                                case -2041230381:
                                                    str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                                    continue;
                                                case -1619909312:
                                                    str24 = "ۜ۬ۗۢۜۖۘۥۦۛۢۜۖ۟ۛ۬ۤۤۜۚۜۥۘۧۥۦۖۡۖۘۛۦ۠ۢۚۙ۟ۦۘۦۗۚ۟ۙۖۥ۠ۘۗۙۥ۟ۢۖۘۨ۠۟۟ۖۥۘ۫ۖۤۙۡۦۘۤۨۦۘۤۙ۬۫ۛۦۘ";
                                                    break;
                                                case -159876017:
                                                    str17 = "ۦ۟۫ۨۤ۠ۥ۠ۤۙۜۥۘۜۨۧۘ۫ۛۚۨۚۢۦ۬ۜۡۢۚۜۤۡۜ۠ۖ۫ۥۜ۠ۢۖۚۜ۟ۥۦ۟ۖ۬ۛۧۙۢۢۨۘ";
                                                    continue;
                                                case 1207178405:
                                                    String str25 = "ۥۡۧۘۤۡ۟ۦ۟ۛۖۜ۬ۤۧۛ۫ۙۢۦۡۘۛۛۖۜۨۖۘ۠ۦۙۗۦۖۘۙۚ۠۬ۜۖۘ۫ۦۖۨ۬ۘۛۤ۬ۤۘۘ۬ۛۥۘۥۘۦۘۧۚۗ۟ۜ۟۟ۚۥۛۨۙۜۘۖۙ۟ۖۖۡۘۖۚۨ";
                                                    while (true) {
                                                        switch (str25.hashCode() ^ (-1641056421)) {
                                                            case -2000160485:
                                                                str25 = "ۤۢۡۥ۬ۢ۬ۡۘ۫ۡۢۦۙۡۘۚ۠ۘۚۧۥۘۖۤۧۖۧ۫ۖۖ۠ۘ۫۫ۚۡۘۨۨۘۘۖۢۨۧ۟ۧۗۗۡۘۡۚ۟ۡۥۘۘۤۨۥۘ۬ۤۖۘ۠ۛۛ";
                                                                break;
                                                            case -1715308133:
                                                                str24 = "ۛۡۧ۟۠ۥۜۦۘۘۘ۫ۜۘۗ۠ۦۚۨۨۖۚۨۤۙۧۗۜۧۚۢۤ۬۠ۛۖۦۜۨ۟۟ۥۤ۬ۖۡۥۥۡۙۨۧ۫ۥۚۘ۠۟ۡۙۙۘۥۙ۟۟۫۬ۚ۬ۛۦۦۥ۫ۘۜۚۥۘۘۥۙ";
                                                                break;
                                                            case 29356844:
                                                                String str26 = "۠۬ۚۗ۟ۦۘۚۤۦۗۨۖۘۛۚ۬ۗۤۥۦۡۜۘۢۛۦۘ۟ۦۖۘ۟ۛۧۜۡۥۘۙۜۖۘۤۜۙ۬ۜۗۜۥۘ۬ۖۡۘۗۛۧۢۧۧۙۢۖۖۧ۬ۦۛ۟ۧۡۗۡۛۜ۬ۡۛۦۢۦۘ۟ۨۥۘۚۛۡ";
                                                                while (true) {
                                                                    switch (str26.hashCode() ^ (-1241209605)) {
                                                                        case -2055825451:
                                                                            str25 = "ۧۦ۬ۥۗ۫ۤۨۢۧۘۜۘ۠ۙۘۘۥۘۜۘۤۗۘۦۜۨۤۜۡ۠ۜۥ۟۫ۜۘۚۤۜۛۤۨ۬ۙۦۖۜ۫ۖۖ۟ۖۖۘۗۘۧۘ";
                                                                            break;
                                                                        case -1953861585:
                                                                            str25 = "۫ۘ۫۬ۨۡۤۥۖۧۤۖۚۛۖ۠ۦۘۘ۫ۢۦۘۨ۬۠ۖۙ۟ۗۘۧۘۧۙۡۘ۫۬۬ۦۚۨۘ۠۟ۡۖۘۘۘۨۡۦۜۧۗۥۜۖ۬ۜ۬ۖۥۖۘۚ۟ۜۘۥۜۦۦۡۨۖۜۥ";
                                                                            break;
                                                                        case 29235425:
                                                                            str26 = "۫۟ۦۧ۫ۚۡ۫ۖۘ۫ۥۗۧ۠ۤۨۦۘۘۚۥۘۢۦۗۛۖۗۢ۫ۥۡۖۖۗۛۦۘۗۚۙ۫ۗۗۡۨ۟";
                                                                            break;
                                                                        case 1120936232:
                                                                            str26 = c0332o15 != null ? "ۥۖۙ۟ۧۖۘ۠ۢ۬ۢۦ۬ۦ۠ۥۥ۫ۡ۬ۡۖۧۜۨۘۧۗ۟ۜ۬ۨۘ۟ۥۦۤۤۢۧۤۡۘ۠۫ۨۢۙۡۡ۟۫ۧ۟ۨۘ۫ۦۤۨۦۗ۬ۡۥۦۡ۠ۦۘ۬ۦۙۡ۟ۚ۫ۙۤۦۤۖۘۗۘۘۘ" : "ۦ۠۬ۦ۟۬۬۬۬۠۟ۤ۬ۢ۫۫ۧۖۘۧۧۦ۟ۙ۟ۙۦۦۘۨۛۦۘ۫ۛۤۤۙۧ۟ۨۧۥۦۛۦۤ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1018951985:
                                                                str24 = "۟۬ۨۗۨۧ۠ۤۙۥ۟ۨۘ۫ۥۦ۫ۦ۬ۨۨ۬ۗۨۥ۬ۤۨۘۘۡۧۘۢۥۨۥۚ۬ۥۧۡۘ۟ۙۖ۟ۙۘۛ۠۫ۖۘۧۘۛ۬ۛ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case -821110150:
                                        str8 = null;
                                        str17 = "ۚۖۨۙۨۤۥۘۦۢۦۧۗۘۜۘ۫ۚۚۧۥ۬ۤۗۨۘ۟ۙۡۦ۟ۖ۬ۥۢۚۘۨۨۢۥۙۖۚۨ۬۬";
                                        break;
                                    case -820682056:
                                        str13 = c0332o14.f1723;
                                        str17 = "۫ۘ۟۠ۖۥ۫۟ۥۘۙۘۚۙۡۖۘۚۗۥۜۦۨۦۥۘ۠ۥۧۘۨۘۢ۫ۗ۟۫ۢۘۘۚۦۨۦۚۚۢۘ۠ۨ۠ۖۘۛۥۘۙۢۡۘۥ۫ۚ۬ۗۧۛۚ۟ۛۖۡ۫ۘۘۦۦ۬";
                                        break;
                                    case -809698330:
                                        int i7 = C0330o.f1000;
                                        str17 = "ۚۧۧۡۤۢۨۗۢۦۡۜۘ۬۟ۢۤ۫ۙۜ۫ۜ۠ۛۨۘۧۨۘ۠ۘۙۧۗۡۘۡۨۦۘ۟ۚۦۘۤۥۦۘۤ۬ۗ۫ۖ۠۬ۢۢۨۦۨۙۛۦۘ۬ۨ۠ۤ۬ۤ۫ۢۦۦۤۖۘۜ۫ۙ";
                                        break;
                                    case -796298144:
                                        str17 = "ۗۢۤۢۖۖۘۢۧۘۘۢ۟ۚۨۦۜ۠ۡ۬ۖۜۘۡۙ۠ۡۨۢۜۚ۬ۥ۠ۖۜۙۡۘۛ۠ۘۘۥ۬ۜۘۤۥۛۜۗۙ۠ۨۘۦۙۗ";
                                        str12 = str5;
                                        break;
                                    case -770041575:
                                        C0237h4.m865(str14);
                                        str17 = "ۨۚۡۘۥۥۨۘۢۧۨۘ۬ۦۖۢۖۧۘۤۦۧۘۢۖ۬ۥ۠۬۬ۦۜۘۨ۟۟ۧۖۚۧۜۗ۠ۦ۫۬ۖۨۘۥۗۥ";
                                        break;
                                    case -769501765:
                                        str9 = c0332o12.f1717;
                                        str17 = "۫ۡ۠۠ۚۖۙۢۘۜۖۥۘۛۖۤۨۧ۬ۛۡ۫ۖۢۜ۫۠ۢۚۤۖۘ۫ۘۧۘۧۦۨۘ۟ۧۘۘ۫ۥۘۥۥۤۡۜۖۘ۬ۦۨۘۗ۠ۗۤۙۛۖۢۢۨۙۧ۠ۜ۟ۚۡۥۗۡۗۚۦۧۘۥۘۧۢۛ۬";
                                        break;
                                    case -677506853:
                                        str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                        str10 = str9;
                                        break;
                                    case -608322675:
                                        c0332o13 = c0336o53.f1008;
                                        str17 = "ۙۧۧ۟ۚ۫ۚۡ۠ۖۤۙ۟ۙۡۚۢ۬ۧۘۘ۟ۙۨۥۥۨۘۖۜۘۘ۬ۡۙۡۙۙۖ۠۟ۢۥۥۘ۟ۗۖۡۛۘۘۥۜۦۨۙ۫۬ۜۘۙۖۜ۠۫ۥۡۧۥۘ۬ۢۖۨۛۘۘ";
                                        break;
                                    case -599498489:
                                        C0237h4.m865(str16);
                                        str17 = "ۢۡۙۚۗۧۤۖۢۚۤۥ۠ۢۖۜۚۨۘ۠ۧۜۢۢۡۛۨۘۦۜۧۥۨۖۘۙۡ۟ۘۥۚۧۧ۠ۚۚ۠۬ۤۘ۬ۙ۫ۥۦۛۖ۬۬ۡۜۙۙۢۛۧۚ۟۫ۨۧۘۖۢۡۢۨۘ۬۟ۜۤ۫ۗ";
                                        break;
                                    case -520634394:
                                        int i8 = C0330o.f1000;
                                        str17 = "۫ۙۗ۟۠ۧۥۗ۬۟ۛۘۘۦ۫ۘ۫ۘ۬ۙ۬ۖۘۚۧ۬۠ۗۥۦۡۘ۟ۛۥۘۡ۬ۦ۫ۧۖۚ۬ۚ۠ۜۡ۠۠ۨۦۖۜ۬۫ۨۧۥۘۤ۟ۗ۟ۘۘ";
                                        break;
                                    case -385682546:
                                        str5 = null;
                                        str17 = "ۗۡۜۜۘۛۢۢ۫۫ۢ۟ۛۗ۟ۖۢۦۘۧ۠۬ۗۘ۟ۛۜۚ۠ۥۗۖۛ۠ۤۧۙ۠ۚۡۖۜ۠ۨ۟ۗۜۗ۬۬ۥۘۙۘۨۡ۟ۦۜۗۛۥۗ";
                                        break;
                                    case -360761663:
                                        str6 = null;
                                        str17 = "ۢۖۡ۬ۨ۫ۛ۠۬۫ۢۙۜۜۘۚۢۡ۫ۘۥۘ۬ۧۘۘۖۤۨۘ۠۠ۗۦۧۦۨۛۨ۠ۖۨ۫ۢۖۨ۫ۥۘۛۗۖۥۡۧۥۘۘۜۧ۟ۖ۠ۖۘۚۨۗۨۚۘۘۧۢۛۘۨۘOۛۖۜۘۦۡۡ";
                                        break;
                                    case -269330834:
                                        C0286kb c0286kb5 = MainActivity.f1289;
                                        str17 = "۫۫ۘۘۡۛۜۘۘۛۜۛ۬ۖۘۥۢ۫ۡۧۙۗۧۡۘۢۗۢ۫ۙۖۘ۟ۨۡۘ۬ۥۧۘۨۚۢ۬ۦۜۘۡۨۛۖۨۤۥۧۨ۬ۘۖۘ۠ۖۨۘ";
                                        break;
                                    case -91938708:
                                        switch (i6) {
                                            case 0:
                                                str17 = "ۥ۠ۡ۬ۚۖۘ۬ۤۘۧۥۘۘۙۚۨ۬ۘۘۨۧ۬ۦ۫۫ۧۜۗۖۧ۟ۡۧۧۢۧۡۡ۫ۜۨۘۖۖۥۜۥۗۧۗۜۘۚۗۗ";
                                                break;
                                            case 1:
                                                str17 = "ۜۨۥۘۡۘۨۘۗۘۢۛۘ۠۫ۖ۬ۘۛۨۘ۬ۖۦۘ۬ۜۙ۫۠ۖۘۡۢۦۧۘۧۤ۫ۜۘۨ۟ۢۙۢۢۛ۫ۙۧ۟ۨۘۗۗۨۛۜۨ";
                                                break;
                                            case 2:
                                                str17 = "ۚۦۨۨۢۗۚۢۛۖۡ۟ۛۛۨۧۦۦۘۧۤۦۗۡۡۙۡۜۘ۟۟ۛۡ۫ۜۘۤۘۧۨ۠ۥۨۛۚ۬ۖ";
                                                break;
                                            default:
                                                str17 = "ۢ۫ۨۙۢ۟ۘۙۘ۬ۗۥۚ۬ۡۘ۠۫ۖۘۙۖۢ۬ۙۡۘۗۡۢۘ۟ۦۢۜۦۖۨۜۧۦۨۘۥۥۧۢۛۙ۠ۖۘۛ۟ۖۦۜ";
                                                break;
                                        }
                                        break;
                                    case 156129331:
                                        str17 = "ۢ۬۟ۧ۫ۗۡ۬ۨۘۦۧۤ۬۫ۗۙۚۖۛۧ۟ۙ۫ۖۚۥ۫ۤۗ۠۬ۙ۫ۖۨ۠ۧۘۙۦۡۤۢۥۘ";
                                        str10 = str8;
                                        break;
                                    case 225955315:
                                        c0332o14 = c0336o54.f1008;
                                        str17 = "ۧۗۜۘۦۨۘۖۗ۫ۗۙۘۘۢۖۧۘۡۨۜۛۜۡۘۥۨۧۖۛۚۡۛۜۜۘۨۢۤۙۙۗۚۘۜ۫ۢۗ۫۠ۜۥۘ۠ۙۛۤۨۘۘۧۖۨ۠ۢۜۗۙۦۚۙۢ۠۠ۤ۟ۗۤ";
                                        break;
                                    case 275824491:
                                    case 783311659:
                                    case 1340027351:
                                    case 1678782081:
                                        return;
                                    case 366225306:
                                        str17 = "ۜۡۡۘۚۜۖ۠۫ۢ۫ۚۢۚۨۗۜ۬۫ۡۨۛۥ۟۟۬ۙۗۡۗۖۢۤۦ۟ۛۥۘۨۨۜۘۤ۟ۗۖۨۡۘۘۦۜۘۦۢ۟ۗۜۙ";
                                        break;
                                    case 583592890:
                                        int i9 = C0330o.f1000;
                                        str17 = "۬ۗۤۚۨۛۦۜ۫۠ۛۤ۟ۙۘۘ۠ۜ۫ۗۡۚۚۤۡۘۜۥۧۘۢۛۘ۠ۥ۟ۥۛ۠ۛۘۨۗۥۘۗۜۖۘۤ۟ۖۘ۠ۨۧۘۥۗۡ";
                                        break;
                                    case 595212816:
                                        C0237h4.m1090("$mainTip", c0336o53);
                                        str17 = "۬ۙۦ۬ۚۥۘۡۘۥۘۧ۬ۥ۬۟ۥۛۖۙۦۚ۬ۥۖ۬ۛۗۛۥۢ۬ۜۦۥۖۦۧۜۖ۬ۛ۬ۥۙۚۡۘۢ۫ۨۦۢ۟۠ۚۡۗۢۛ۫ۤۚۧۨۘۚۥۦ۟ۥۘۙۙ۠";
                                        break;
                                    case 603348436:
                                        C0237h4.m1090("$mainTip", c0336o54);
                                        str17 = "ۘۖۨۦۖۧۘۛۧۜۜۘۧۘۙۖۡۘۤۗۥۚۖۥۘۧۥۘۦ۬ۛ۬ۥۡۘۤ۫۟۫ۙۡۚۘۡۛۚۤۢۤۗ۠ۢۜۡۜۨۙۜۘۨۦۦۘۧۙۧۘۗۘۖۚۤۥۘۘۗۥ۠";
                                        break;
                                    case 625864105:
                                        C0286kb c0286kb6 = MainActivity.f1289;
                                        str17 = "۫ۥۙۡۨۜۤ۠ۜۘۙۦۦ۫ۧۖ۟ۜۧۘۢ۠ۨۘۖۨۨۘۗۤۥۘۡ۟ۥۖ۠ۗۗ۠ۗۘۡۦۢۦۧۥۘۧۖۦ۟۬۟۠ۚۜ۬ۨۧۛۙۖۖۚۛۛ";
                                        break;
                                    case 748969091:
                                        str17 = "ۘۤۛۢۢۡۘ۠ۜۥۘۥۚ۟ۧ۬ۖۧۖۘۖۧۨۘۨ۬ۜ۠ۥۘۦۨ۟ۖۙۜۘۢۦۦۧۧۜۘۙۦۢۧ۬ۨۨۡۘۡ۟ۡۢۚ۫ۥۜۨۘۗ۫ۧۤۦ۠۫۠ۗۦۦۥۘۨۘۖۜ۬ۥۘۜۜۜۘ۫ۙۛ";
                                        break;
                                    case 929513715:
                                        C0330o.m1170(str16);
                                        str17 = "ۤۨ۬ۢۚ۫۬ۤۖ۟ۢ۫ۧۦۘۧ۬۠ۨۜۧۧۚۢۡۖۘۜۗۡۥ۬ۦۘۜ۫۬۬ۜۙۤۤۖۘۛ۫ۧۛۤۛۙۗۧۜۧۤ۬ۢ۟ۤۨۘۘۜ۟ۦ";
                                        break;
                                    case 974053466:
                                        c0336o55 = this.f875;
                                        str17 = "ۜۘ۫ۢۥ۫ۨۙۙ۠ۗۖۘۘ۠ۦۥ۫ۖۥۢۧ۟ۥ۫ۘۡۨۘۗ۫۫ۨۦۥ۬ۛۡۘۗۡۘۘ۠ۦۨۘۥۥۛۜۥۖۘۗۢۖۖۙ۟ۙۜۖۘۖ۟ۤۦۘۡۖۖۦۚۡۦۘۜۡۚ۟ۛۖ۬۟ۘۘۡۖ۫";
                                        break;
                                    case 994974833:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "ۦۡۤۛۛۢۧۧۗ۬ۦۖۘۗۜۘۘۖۥۖۘۖۧۥۘۧۙۜۘۚۤۨۘۜۗۥ۠ۘۥۘۛۤۛۙ۟ۖۚۜۡ۟ۤۖۘۚۖۡ۫۫ۘۘۜۛۖۘۛۗ۬ۦۖۗۖۗۨۧۢۤۢۗۦۘ۬ۙۜ";
                                        break;
                                    case 1054170174:
                                        C0237h4.m1090("$mainTip", c0336o55);
                                        str17 = "۟ۧۛۨ۠ۤ۬ۗۡۚ۠۠ۙۡۘۜ۠۠ۥۗۥۘۡۖۥۘۘۡۦۘۦۤۥۘۨۙۛۚۜۜ۟ۦۘۢۢۙۙۖۘۧ۟ۦۥۖ۬ۡۦۖ۠ۤۖ۠ۜ۬ۖۨۜ";
                                        break;
                                    case 1285812657:
                                        i6 = this.f874;
                                        str17 = "ۛۤۙۨ۟۠ۖۥۡۖۡۢۛۡۧۥۙ۫ۘۘۧۜۛ۬ۦۧۘ۫۫ۙۜ۠ۥۘۨۘۖۤۥۦۤۜۛ۟ۛ۠ۥۚۗ۠ۖۢۙۚۡۘ۫ۨۗۢۤ۫ۗۚۧۥۥۤۙۛۡۤ۠ۘ";
                                        break;
                                    case 1353876195:
                                        String str27 = "ۦ۬ۡۤۥۖۚۙۘ۬ۦۦۘۙۥۡ۠ۛۨۖۜ۟ۖۢۥۘ۠ۜۡۦۧۘۜۧۖۘۤۥۥۡۗۜۨ۟ۡۗۙۗ";
                                        while (true) {
                                            switch (str27.hashCode() ^ (-539259595)) {
                                                case -1875564994:
                                                    str17 = "ۧۖۡۦۡۘ۬ۖۢۘۦۡ۟ۢۛۗۤۜۘۦۘۧ۫ۚۛۚۤۜۤۜۘ۟ۨۖ۬۠ۢۡۖۢ۠ۗۜۘۙ۠۠ۡۢۢ۫ۡ۫۟ۖۖۘۧۛ۠ۢ۟۬۫ۘ";
                                                    continue;
                                                case 667432776:
                                                    str27 = "ۡۛۘۘۤۛۦۦۖۖ۟ۙۜۘۤۜۥۘۡۧۘۘۘۜۛۢ۠ۦۗۨۘۘۥۡۜ۠۟ۦۘۨۦ۠ۤۛ۬ۛۤۡ۬ۙۚۘ۫ۡ۬ۤۜۘۦۜۦۘ";
                                                    break;
                                                case 1767964991:
                                                    str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                                    continue;
                                                case 2056888340:
                                                    String str28 = "۟ۢۜ۠ۙۥۘۜۤۖۘ۠۫ۨۘۙۥۨۘ۟ۥ۟۫ۜۤۗۤۨۘۖۤۡۘ۫ۥۙ۟۬ۡۘۖۜۛۦ۠ۨ۠ۦۡۛۦۖۛۢۧۥۧۚۚ۫۬ۛۛۚ۠ۚۥ۬ۡۧۖۚۤۚ۟۟ۜۙ۟۟ۛۚۘۗ۟ۛۢۘ";
                                                    while (true) {
                                                        switch (str28.hashCode() ^ (-1711662654)) {
                                                            case -1572277747:
                                                                String str29 = "ۦۛۙۢۚ۠ۤ۫ۧۨ۠۫ۨۡۦۘۧۘ۫ۤۜ۠۫ۜۦۤۡ۬ۚ۬ۡۦۙۧۡۨ۟ۜۡۨۘۥۚۨۚۚۖۘ۬ۧۘۙۧۤۤۥۗ۠ۨۦ۬ۜۤ۠ۖۘ";
                                                                while (true) {
                                                                    switch (str29.hashCode() ^ (-730203158)) {
                                                                        case -2016148936:
                                                                            str28 = "ۧ۬ۨۘۗۗۥۘۢۙۤۗ۬ۧ۠ۜۚۛۛ۬ۗۡۥۘۖۜۜۘۥۙۜۘۨۖۧۤۥ۫ۜ۬ۛۥۡۡۘۘۢۖۤۜۚ";
                                                                            break;
                                                                        case -8051377:
                                                                            str29 = "ۗۜۧۚۗۗۗۛۥۙۨۢۦ۫ۘۘۖۙۨۘ۠۟۠ۗ۠ۘۘۥۙۡ۟۫ۘۥۥۜۘۘۛۗۜۦۥۖۨۘۤ۠۫۟ۨ۫۫۠ۖۛۨۘۘۖۗۦۘۖ۠۬ۙۡۗۡۧۜ۠ۖۡۘۛ۠ۘۘۜۚ۫۫ۦۖۘۢۜۡ";
                                                                            break;
                                                                        case 357980236:
                                                                            str28 = "ۦۙ۫ۦۥۚۤۢۡۘۤ۠ۡ۫ۛۛۛۡۘۘۥۗۢۙ۠ۦۖۡ۬ۚۨۨۘۢۘۜۘۚ۠ۜۘۡۖۛۛۗۜۘۗ۟۬ۥۨۡۘ۠۬ۨۙۘ۟ۥۥۨۨۦۡ۫ۨۨۤ۟ۚ۟ۧۘۜۛۡۘ";
                                                                            break;
                                                                        case 987953900:
                                                                            str29 = c0332o14 != null ? "ۚۤۚ۫ۗ۬۠۠ۢ۫ۡۢ۬ۘۗ۬ۘۘۥۤۥۘۧۘۥۘۜ۫ۦۖۚ۬۠ۙۖۘۧۦۨۘۜۘۗۙ۠ۘ۫ۖۘۧۤۘۘۡ۬ۖۘۢۖۜۘۚۗۖ۠ۤۗۗ۟۬" : "ۡۦۦۗۨۤ۟۫ۚۘۗۧ۟ۗۥۨۤ۟ۨۗۡۚۤ۬ۚ۠ۛۡۖۘ۟ۙۡۛۤۜۘۨ۫ۚۦ۬ۥۙۧ۬ۢۗۥۜۧۘ۫ۡ۫ۘۘۘۧ۫۠";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 2956209:
                                                                str28 = "۠ۛۡۘۢۨۥۦۦۤ۟ۥۚۧۜۘۥۛۡۘۚ۬ۡۖۤۖۘۖ۫ۨ۫ۖۤۦۢۗۨۦۢۜۢ۟ۛۦۘۢۗۗۖ۠ۨۜۛ۬ۜۛ۠ۨۦۗۡ۠ۥۘۘۚۤ";
                                                                break;
                                                            case 466636123:
                                                                str27 = "۫ۛۜۘ۠ۤ۟ۤۧۙ۬۟ۗۤۛ۫ۗۦۤ۟ۥۡۘۦۜۘۢۢۥۘ۠ۛ۟۬ۗۧۦۢۛۥۚ۬ۤۗ۟ۚۗۜۘ۬ۦۜۘۚۨۗۗۙۤ";
                                                                break;
                                                            case 1092978740:
                                                                str27 = "۠ۖ۬ۥ۠ۙۨۙۗۖ۠ۜۘ۟ۗۖۗۡۘۡ۠ۗۚۨ۫۬ۙۘۘ۫ۘ۟ۢۚۜۗۧۡۡ۫ۤۨ۬ۥ۟ۢۖۘ۫۟۠۬ۜۡۗۦ۠۬ۢۖۘۚۚ۟ۨ۟ۨۦۖۥۙۗۘۘۙۗۗۨۢۖ۠ۢۨۡۨۥ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1490954571:
                                        str7 = null;
                                        str17 = "ۢ۠ۡۘۧ۟ۨۘ۟ۛ۠۟ۡۜۦۜۦۘۨۧۛۨۡۦۢ۠ۨۘۖ۠۠۬ۙۢۦۨۖۘۖ۠ۥۖ۠۟ۦ۬ۜۘۤۢۥۘۘۜۢ۬ۦۢۘ۬ۥۗۨۥۘۘۨ۬۫ۦ۫";
                                        break;
                                    case 1567174269:
                                        str17 = "ۜۙ۫ۘۤۧۦۚ۫ۨۛۡۦۡۛۧۜۘ۬ۡۜۘۥۖۧۤۡ۬ۗۧۙ۟ۤۖۡۨۢ۠ۖۛۧ۫ۦۘۖۤۘۜ۟۠ۧ۬ۥۦۨۗ";
                                        str16 = str7;
                                        break;
                                    case 1658023366:
                                        int i10 = C0330o.f1000;
                                        str17 = "ۛۥ۟ۨۢۛ۬ۖۖۧۨۧۘ۫۬ۗ۟ۧۛۡۤۙۥ۬۟ۤۢۜۧۗۙ۫ۖ۬ۥۗۢ۫ۧ۬ۖ۫ۨۛ۫ۖ۟ۗۚۖۗۙۗۧۨۡۘ۟ۡۘۘ۟";
                                        break;
                                    case 1681125014:
                                        C0237h4.m865(str10);
                                        str17 = "ۨۢۥ۬۠ۜۘۘۚۚۦۘۦۨۚۖۘۗۤۘۢۜۤۗۜۡۘۧۚۖۥۜۨۘۨ۟ۢۧۖۜۘۛ۟۟ۧ۠ۘۛۛۘ";
                                        break;
                                    case 1731513016:
                                        c0332o12 = c0336o52.f1008;
                                        str17 = "ۧ۟۫ۗۢ۠ۖۧۤ۠ۗۖۗۢۙۧ۫۠ۙۙ۟ۚۛۗۥۧۜۡۧۘۜ۠۠۫۬۠ۥ۟ۨۘۖۦۦۚۨۨۘ";
                                        break;
                                    case 1752004423:
                                        str15 = c0332o15.f1717;
                                        str17 = "۟۬ۨۡۗ۫ۦۢۨ۠ۗ۬ۦۥۥۡۢ۠۬ۗۨۘۥۡۨۘۛ۬ۖۘۥۗۡۘۡۢ۬ۥۚۤۨۚ۠۠ۗ۠۟۬ۘ۟۠۠ۘۦۘۦ";
                                        break;
                                    case 2049773532:
                                        str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                        str14 = str13;
                                        break;
                                    case 2064801264:
                                        C0330o.m1167(str12);
                                        str17 = "ۤ۠ۗ۫ۗ۬ۥ۬ۤۚۜ۫ۦۡۖۢۜۥ۟ۜۢۙۚ۬ۘۨۖۘۧ۟ۚۖۧ۬۫۫ۨۘۡۥۖۛۜۥ۫ۤۖ۟ۨۗۥ۟ۛ۠ۙۛۗۡۥۢۥۢۗ۟ۡۘۦۧ۠ۡۘ۟ۦۦۘۤۗ۫۫ۖۧۘ۟ۨۡۘ";
                                        break;
                                }
                            }
                        }
                    });
                    TextView textView4 = (TextView) mainActivity2.findViewById(R.id.mTvQQTwo);
                    textView4.setVisibility(0);
                    textView4.setOnClickListener(new View.OnClickListener(c0336o5, i4) { // from class: ۟.j5

                        /* JADX INFO: renamed from: ۥ */
                        public final int f874;

                        /* JADX INFO: renamed from: ۥ۟ */
                        public final C0336o5 f875;

                        {
                            this.f874 = i4;
                            this.f875 = c0336o5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = 0;
                            String str5 = null;
                            String str6 = null;
                            String str7 = null;
                            String str8 = null;
                            C0336o5 c0336o52 = null;
                            C0332o1 c0332o12 = null;
                            String str9 = null;
                            String str10 = null;
                            C0336o5 c0336o53 = null;
                            C0332o1 c0332o13 = null;
                            String str11 = null;
                            String str12 = null;
                            C0336o5 c0336o54 = null;
                            C0332o1 c0332o14 = null;
                            String str13 = null;
                            String str14 = null;
                            C0336o5 c0336o55 = null;
                            C0332o1 c0332o15 = null;
                            String str15 = null;
                            String str16 = null;
                            String str17 = "ۜۨۙۨۚۜۘۘ۬ۤۥۗۗۙ۫ۜۨۨۨۘ۫ۨۜۘ۟ۙ۟ۘۚ۬ۢۧۨۘۘۧ۫ۘۚۜۘۤۡۡۘ۬ۨۘ۬ۚۧۜۘۚۙۙۢۨۥۚ";
                            while (true) {
                                switch ((((((((str17.hashCode() ^ 937) ^ 416) ^ 550) ^ 440) ^ 297) ^ 920) ^ 0) ^ (-193156567)) {
                                    case -1976897249:
                                        String str18 = "ۨۖ۠ۤۨ۟ۜۡۘۘ۠ۛ۟۟ۦۡ۫ۧۛۢۨۙۢۜۘۤۖ۟۬۬ۙۤۘۛۢۙۖۘۛۗۡۨۨۥ۠ۜۥۘۢۗۚۨۚۥۢ";
                                        while (true) {
                                            switch (str18.hashCode() ^ (-1657001700)) {
                                                case -1542852949:
                                                    String str19 = "ۚۘۨۡۦۥۘۡۜۤۥۖۤۦۚۚۜ۫ۥۘ۟ۚۢۡۚۡۘ۟ۜۢۧۗۛۧۘ۫۟ۙۨ۠ۦۥۚۙۙ۫۫ۙ۟ۡ۬ۢۦۗۦۜۘۘ۠ۥۘۗۖۛۢ۫";
                                                    while (true) {
                                                        switch (str19.hashCode() ^ 114193177) {
                                                            case -1654208069:
                                                                str19 = "ۤۧۜۘۜۜۜۖ۠۠ۖۨۢۢۧ۫ۛ۬ۜۘ۠ۚ۟ۘۦۘۢۛ۫ۗۥۘۘۧ۫ۘۘۙۜۚۤۢ۬ۗۦۚۡۘۘۘۖۘۗ۠ۤۜ۫۠ۗۖۜۡۢۚۦۧ";
                                                                break;
                                                            case -824909501:
                                                                String str20 = "ۦۛۛۡۙۜ۠ۤۥۚۢۥۛۚۢۙۖ۟ۤۡ۬ۗۥۦۘۛۨۘۛۙۜۨۙۦۨۚ۟ۖۨ۠ۤ۬ۡۘۧۚۨۘ۬ۥۨ۫۫۫ۨۗۙ";
                                                                while (true) {
                                                                    switch (str20.hashCode() ^ 164210155) {
                                                                        case -527667276:
                                                                            str20 = c0332o13 != null ? "ۙۤۤۧۖۙۗ۟۠۬ۤۨۥۜۛۦ۠۫ۥۨۥۙۘ۫ۧ۫ۘۦۨۘۙ۬ۧۘۜۤۖ۬ۚۗۡۧۚۡۡۘۙۚۢ۬۬ۡۘۤ۟ۚۛۖۥۘۡۛۧۡۙۘۤۚ۟ۛۙۡۘۜۦۡ" : "۟ۧۧۦۥۘۡۘۗۜۜۘۗ۬۬ۢۧۜۖۖۢۨۨۘ۠ۖۘۘۗۗۡ۬ۛۡۗۜۡ۟ۨۦۘۗۛۚ۫ۚ۬ۛۤۙۤۧ۠ۙ۟ۙ";
                                                                            break;
                                                                        case 930427964:
                                                                            str19 = "ۦۤۖۘۖۦۨۖۚۘۡۧۙۡ۬ۤۧ۬ۤۗ۟ۢۡۛۢۧۦۘۘ۟۠ۚۖۡۘۗۨۖۘۥۚۛۜۧۘۥ۟ۜۘ۠ۛ۠ۙۖۘۛ۬ۢ۠ۘۢۙۛۚۡۡ۬ۙۘۖۘۢۡۡۙ۬۟ۚۢ۬ۚ۫۠ۧۤ";
                                                                            break;
                                                                        case 1310252649:
                                                                            str19 = "ۛۘۥۙۖ۫ۢۖ۟۟ۢۥۘۥۡۦۖ۬ۖ۫ۜۧۨۛ۬۠ۤۦۖۖۛۥۦۘۨۤ۟ۚۛۧۛۤۖۘۧۦۙ";
                                                                            break;
                                                                        case 1964778413:
                                                                            str20 = "۠ۨۡۙ۬ۘۤۦۜۘۤ۠ۦۥۦۨۦ۫ۡ۫ۢ۠ۥۢۨ۠ۧ۠ۘۧۥۜ۠ۥ۫ۨۘۙ۫ۦۙ۬ۚۦۢ۟";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -423824707:
                                                                str18 = "ۡۗۘۦۖۗ۫ۘۦۘۨۚۨۘۢۛۨ۬ۢۖۢۜۘۢۧ۠۠ۛۡۦۧۖ۬ۘۜۗۥۘۚۗۤۗۦۖۘۙۘۜ۟ۢۨ۫ۥۦۘ۟ۥ۟";
                                                                break;
                                                            case 982425732:
                                                                str18 = "ۦۨ۫ۜۤۘۘ۫۠ۚ۠۫ۖ۫۠ۜۥۦۦۖۗۥۘۜۘۖۘۢۚۘۡۥۨۖۧۗۨۧۗۜۤ۬ۢۙۘ۬۟۬ۗۦۥۘۚۚۢۜۖۡۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 526286094:
                                                    str18 = "ۜۖۖۘۚۗ۬ۛۛۖۗ۟ۥۢۛۛۖۧ۠ۖۤۡۘۚۥۗۡ۫ۖ۫ۖۤۗۛۡۘۡ۫ۡۘۨ۫ۜۘۢۧ۟ۛ۠ۨ";
                                                    break;
                                                case 653886550:
                                                    str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                                    continue;
                                                case 871669741:
                                                    str17 = "ۖۥۥۘۛۨۨۘ۬ۜۨۖ۟ۖ۠ۛۘۘۜۥ۟ۜۙۦۘۗۨۘۘ۫ۛۨۘ۬ۘۗۗۗۗۘۙۙۥۚۜۗۧۗۦۡۙۤۡۥۖۙ۫ۦۙۜۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1958056289:
                                        c0336o54 = this.f875;
                                        str17 = "ۜ۟ۗۙۖۡۘۧۡ۟ۤۧۚۦۨ۫ۦۦۦۘۨۡۡۘ۬ۤۗۛۙۘۚۛۘۘۦۘ۫ۧۧ۫ۦ۠ۙ۫ۨۘۥۡۘ";
                                        break;
                                    case -1917108434:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "۟ۛ۠ۚۡۖۖ۠ۡۘۥۢۛۖۥۘ۬ۢۢۘۗۤۤۜۖۧۗۨۦۖۦۘۙۡۙۧۚۙۚۗۧۥۚ۫ۙۡۨۖ۟ۦۘۗۢۗۗۛۨۘۤۧ۫ۛۛۘۥۢۜۘۗ۫ۛۢۙۨۘۡ۠ۖ";
                                        break;
                                    case -1788180115:
                                        str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                        str12 = str11;
                                        break;
                                    case -1777849339:
                                        str17 = "ۜ۠ۧۧۡ۟ۗۘۥۚۢۜۘۙۛۦۘۗۤۗ۫ۡۥ۫۫ۧۡۤۥۘۦۡ۠ۧۡۜۨۨۨۘۗۢۚۤۙۚۖ۬ۧۖۧۙۡۚۨۥۛۙ";
                                        str14 = str6;
                                        break;
                                    case -1542759203:
                                        C0237h4.m865(str12);
                                        str17 = "۟ۖۤۦۤۘۘ۠۫ۗۗۙۘۗۤ۫ۡ۠ۦۢۧۡ۬ۘ۠۠ۦ۬ۨۙۥۨۢۖ۫ۧۚۘۖۘۦۧۜۨۖۧۘۗۨۗۥ۠ۚۛۘۛ";
                                        break;
                                    case -1484789383:
                                        c0336o53 = this.f875;
                                        str17 = "ۚ۠ۦۘۨۨ۟ۚۢ۠ۨۙۡۘۤۖۘۘۛۚ۬۟۠ۧۖۘۖۖۦۘۦۦۥۘۧۜ۠۫ۧ۬ۘۤۥۘۗۧۜۘۥ۟ۦ";
                                        break;
                                    case -1430289878:
                                        c0332o15 = c0336o55.f1008;
                                        str17 = "ۦۥ۫ۤۤۛۚۖ۬ۙ۫ۘۚ۠ۙۢۨۖۘۨۢۧۗۚۧۘۛۙۗۧۦۘۗۚ۠ۚۜۘۘۜ۟۠ۨۘۙۛۖۘۘۨۨۘۖ۫ۖۘۧۡۦۢۚۨ۠ۚۧۤۜۧۛۡۧۘۖۤۡ۬ۡۧۘۢ۠۫ۨۦۡۘ۬ۗۗ";
                                        break;
                                    case -1402821200:
                                        c0336o52 = this.f875;
                                        str17 = "ۤ۫ۖۘۗۛۦۖۖ۫ۛۧ۬۬ۥۨۜ۫ۢۡۢۢۖۖ۫ۤۘۨۗۢۨۧۗۧۤ۫ۥۦۙۙ۟ۧۛ۟ۢۢ";
                                        break;
                                    case -1341922224:
                                        String str21 = "ۖۡۙۥۘۘۥۚۧۧۘۧۘۤۘۥۘۘ۟۬ۙ۫ۢۦۘۙ۠ۥ۬ۘۘۙۡۖۤۧ۫ۗ۟ۘۨۘۨۙۚ۬ۜۜۘۗۧۜۧ۠ۖۚۢۨۖ۫ۨۘۖۢۡۜۨۘ";
                                        while (true) {
                                            switch (str21.hashCode() ^ (-551252153)) {
                                                case -1848917142:
                                                    String str22 = "۬ۤۛ۫ۖۜۨۘ۫ۦ۬ۗۖۧۡۘ۫۟ۘ۟ۗۘۨۙۤۖۙۖۢۜۘ۟ۨۡۚۤۜۘ۠ۥۧ۫۟۠۫ۗۘ";
                                                    while (true) {
                                                        switch (str22.hashCode() ^ 229539457) {
                                                            case -2047809925:
                                                                String str23 = "ۚۛۙۘۚۦۘ۬ۘۚۦ۠ۦۛۙۖ۬ۖۖۙ۫ۘۘۛۖۘۖۙۦۘۤۨۨۚۙۘۘۢۙۚۢ۟ۥۥۜۧۘۤۛۦۘۛ۠ۜ۬ۡۖۙۖۖۘ";
                                                                while (true) {
                                                                    switch (str23.hashCode() ^ 1882648421) {
                                                                        case -1342174619:
                                                                            str23 = c0332o12 != null ? "۬۟ۘۘۦ۠۫ۙۦۨۘۧۙۡۡۡۘ۠ۦۛ۬۠ۡۛ۟ۦۘ۠۠ۛۗۡ۟۟ۦۙۗۖۜۨۨۛ۠ۥۥۘ۬ۥۛۚۖۡۚۖۜۛۢۨ" : "ۤۙۚۖ۠ۡۦۥۘۡۚ۬ۗۨ۟ۨ۠ۖۛۡۘۤۜۤۦۧ۠۬ۛ۟ۧۘۢۦۖۢۤۘۧۘ۟ۤۨۘۦۖۘۙۜۥۢۘۥ۠۬ۤۚ۟ۦۘۘۥ۠۟ۤۦۘۙۨۢ۬۬ۜۘۖۙ۠ۧۗۦۘ۫ۥ۬ۢ۟ۥ";
                                                                            break;
                                                                        case -1005594639:
                                                                            str22 = "ۗ۟ۢ۟۠ۤۛۜۦۗۦۥۥۢۖۤۖ۬ۛ۬۬ۧۛۙۡۦۡۡ۬ۘۨۜۛ۟ۤۖ۬ۛۚۤۡۧۖۨۨۘۖۙۘۘۛۧۘۙۥۢۨۧۜۧۡۚۗۧ۬";
                                                                            break;
                                                                        case 818439621:
                                                                            str23 = "۫۫ۤۙۙۚۙۙۖۡۨۘ۟۠ۤۦۘۙۡۡۙۤۧۖۘ۟ۛ۠۬۬ۦۘۖۡۖۧۧۥۘۡۨۗۛۛۖۘۦۡ۠ۖۤۨۘۜ۟ۧۤۗۛ۠ۡۢۘۘۘۗ۠ۙۡۘۘۗۘۦۘ";
                                                                            break;
                                                                        case 1987400100:
                                                                            str22 = "ۢۨۙ۟۟ۘۘۚۧۗ۟ۖۘۘ۟ۖۘۛۚۨ۬ۚ۟ۜۨۡۘۢۜۗۦ۟ۘ۫ۢۤۚۥ۟ۢ۟۫ۗۙۢۡ۟ۨۗۜۖ۟۠ۥۘۨۚۡۘ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -1875414390:
                                                                str21 = "ۖۗۜۘۢۖۙۛۡۜۥۥ۫ۖ۠۫۬ۖۗۡ۠ۘ۠ۨۜۘۗۘۜ۫ۛۙۤۗۖۘۚۘۚۘۛۡۘۧ۬ۨۘ۟ۘۘۢۗۗۖ۟ۦۘۘۤۛۦۛۖۚۢۨۨۗۨۘۢۜۘۢۖۦۥ۫";
                                                                break;
                                                            case -1586829220:
                                                                str22 = "ۡۢۛۤۛۛ۠ۙ۫۟ۨۨۘ۟ۛۘۘ۟ۤ۫ۘۨۚۛۦۗۥۡۡۥۧۦۛۜۚۚۨۗ۬ۧۤ۬۫ۨۗۘۡ۠ۚۙ۫ۥۘۗۜۡ۠ۦۛۖۗۛ۬ۦ۠";
                                                                break;
                                                            case -40669877:
                                                                str21 = "ۚ۟ۜ۟۟ۚ۟ۨۚۘۜ۠ۖۥۛۥۘۗۡ۫ۡۘۦۖۤۤ۟ۚۢۨۚۢ۫ۗۘ۠ۖۘ۠۠ۨۘ۫ۥۙ۬ۡۦ۠ۘ۠ۗۨۘۘ۠۠ۦۨۢۥۘۢۖۙۤۖ۟ۜ۫ۥۚۧۥۚۗۜ۬ۗۡۤۗۡۤۧ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -1454025742:
                                                    str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                                    continue;
                                                case 678583481:
                                                    str21 = "ۙۦ۟ۦۡۘۘۖۥ۫ۨۤ۫ۘۛۥۘۗۨۨۦۙۨۚۛۦۘۙۜۗۥۧۜۨ۫ۚ۬۟ۜۙۖۘۨۢۢۨۧۘۤۖۖۡۚ۬ۦ۠ۘ۠ۖۛۘۡۡۡۥۛۦۛۘۘۖ۟ۜۡ۟ۦۗۨۛۖۜۙۦ۟ۗ";
                                                    break;
                                                case 2072360398:
                                                    str17 = "ۗ۠۟ۨۗۨۧۜ۠ۧ۫ۡۘۧۚۡۤۤۥۥۦۧ۠ۨۨۘ۠ۦۖۘ۠ۛۢۤۨۖۨۛۡۘۖۙۨ۠ۢۦۢ۟۟ۙ۬ۤۡۡۖۘۧۡۙ۠ۙۡۘۥۡۘ۬۫ۡۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1340151938:
                                        C0286kb c0286kb3 = MainActivity.f1289;
                                        str17 = "ۜۧ۫۬ۨۜۘۥ۟ۜۘۡ۠ۙۖۖۜۘۛۧۘۘۨۛۚۗۡۥۘۦۛۧۛۥۖۘۨ۟ۡۙ۬ۢۚۜۘۡۗۥ۫ۛۢۧۚۥۘۙ۫ۨۨۤۤۖۛۤ۫۟ۜۚ۫ۗ";
                                        break;
                                    case -1319014332:
                                        str17 = "ۜ۟ۦۦۛۜۙ۠ۦۖۦۘۗۜ۠ۘۘۥۨ۬ۘۘ۫ۙۡۚۤۢۦ۟ۜۘ۟ۘۡۘۘۢۚۦۛۢۨۛۛ۫ۜۨۘۧۘۛۛۘۥۡۦ۟";
                                        break;
                                    case -1278481967:
                                        C0330o.m1167(str14);
                                        str17 = "ۘ۬۠۟ۥۘۘ۟ۗۤۨۘ۟ۧ۟ۢۦ۫۫ۗۗ۬ۚۙۤ۬ۦۤۧۚۙ۫۠ۧۗۚۘۜ۟ۤۢ۫ۡۘ۫ۢۡۘ۫۫ۜۘۦۧۧ";
                                        break;
                                    case -1219436409:
                                        str11 = c0332o13.f1723;
                                        str17 = "ۨۦۙۤۡۢ۠ۧ۬ۘۛۡۘ۠ۛۘۖۛۘۜۧۖۘۦۤۘۘۗۗۦۧۢۚ۠ۡۙۛۢۦۘۖۥۙۥ۠ۨ۬ۘۧۘ";
                                        break;
                                    case -1064727507:
                                        C0330o.m1170(str10);
                                        str17 = "ۗۖۘۘۘۙۨۙۨۘۘۢ۟ۡۡۦۧۘۢۤۚۧۚۦۜۨۚۗ۬ۨۘۚ۫ۖۘ۬ۧۜۘ۠ۘ۬۫ۖۤۗۜۘ۫ۛۖۗۘۗۡۢۗۦۜۘۜۥۨۜ۟ۛۚۡۨۢۨۤۦۨۜۘۗۙۢ";
                                        break;
                                    case -1055073887:
                                        str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                        str16 = str15;
                                        break;
                                    case -1006430172:
                                        C0286kb c0286kb4 = MainActivity.f1289;
                                        str17 = "۟ۖۤۦۤۘۘۚۧۛۥۖۘۢۜۥ۬ۤۨۘۧ۠ۗۡۙ۠ۙۢۖۜۘۘۤۜۡۘ۟ۨ۟ۘۥۖۘۙ۠ۙۖ۫ۖۘۡۚۨۢۧۨۘۚۖ۬ۙۙۖۘۡ۠ۥۤ۫ۢۛۚۤۤۛۜ۠ۜ۫";
                                        break;
                                    case -901673525:
                                        C0237h4.m1090("$mainTip", c0336o52);
                                        str17 = "۠ۥۡۦ۫ۥ۬۠ۗۗۖۜۚ۟ۗۨ۫ۗۙۘۗۖ۬ۙۧۥۜۘۜۚۛۧ۠ۚ۬ۚ۫ۧۗۤۚۚۜۚۖۧۘ";
                                        break;
                                    case -883400274:
                                        String str24 = "ۧۚۥۘ۠ۦۥۘۧۧۢۥۘۡ۬ۘۢۖ۫ۚۛۥ۟ۤۥۚۨۧۜ۠ۜۧ۠ۢۥ۠ۥۖ۠ۖۧۢۘۘۨۤ";
                                        while (true) {
                                            switch (str24.hashCode() ^ (-1337738846)) {
                                                case -2041230381:
                                                    str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                                    continue;
                                                case -1619909312:
                                                    str24 = "ۜ۬ۗۢۜۖۘۥۦۛۢۜۖ۟ۛ۬ۤۤۜۚۜۥۘۧۥۦۖۡۖۘۛۦ۠ۢۚۙ۟ۦۘۦۗۚ۟ۙۖۥ۠ۘۗۙۥ۟ۢۖۘۨ۠۟۟ۖۥۘ۫ۖۤۙۡۦۘۤۨۦۘۤۙ۬۫ۛۦۘ";
                                                    break;
                                                case -159876017:
                                                    str17 = "ۦ۟۫ۨۤ۠ۥ۠ۤۙۜۥۘۜۨۧۘ۫ۛۚۨۚۢۦ۬ۜۡۢۚۜۤۡۜ۠ۖ۫ۥۜ۠ۢۖۚۜ۟ۥۦ۟ۖ۬ۛۧۙۢۢۨۘ";
                                                    continue;
                                                case 1207178405:
                                                    String str25 = "ۥۡۧۘۤۡ۟ۦ۟ۛۖۜ۬ۤۧۛ۫ۙۢۦۡۘۛۛۖۜۨۖۘ۠ۦۙۗۦۖۘۙۚ۠۬ۜۖۘ۫ۦۖۨ۬ۘۛۤ۬ۤۘۘ۬ۛۥۘۥۘۦۘۧۚۗ۟ۜ۟۟ۚۥۛۨۙۜۘۖۙ۟ۖۖۡۘۖۚۨ";
                                                    while (true) {
                                                        switch (str25.hashCode() ^ (-1641056421)) {
                                                            case -2000160485:
                                                                str25 = "ۤۢۡۥ۬ۢ۬ۡۘ۫ۡۢۦۙۡۘۚ۠ۘۚۧۥۘۖۤۧۖۧ۫ۖۖ۠ۘ۫۫ۚۡۘۨۨۘۘۖۢۨۧ۟ۧۗۗۡۘۡۚ۟ۡۥۘۘۤۨۥۘ۬ۤۖۘ۠ۛۛ";
                                                                break;
                                                            case -1715308133:
                                                                str24 = "ۛۡۧ۟۠ۥۜۦۘۘۘ۫ۜۘۗ۠ۦۚۨۨۖۚۨۤۙۧۗۜۧۚۢۤ۬۠ۛۖۦۜۨ۟۟ۥۤ۬ۖۡۥۥۡۙۨۧ۫ۥۚۘ۠۟ۡۙۙۘۥۙ۟۟۫۬ۚ۬ۛۦۦۥ۫ۘۜۚۥۘۘۥۙ";
                                                                break;
                                                            case 29356844:
                                                                String str26 = "۠۬ۚۗ۟ۦۘۚۤۦۗۨۖۘۛۚ۬ۗۤۥۦۡۜۘۢۛۦۘ۟ۦۖۘ۟ۛۧۜۡۥۘۙۜۖۘۤۜۙ۬ۜۗۜۥۘ۬ۖۡۘۗۛۧۢۧۧۙۢۖۖۧ۬ۦۛ۟ۧۡۗۡۛۜ۬ۡۛۦۢۦۘ۟ۨۥۘۚۛۡ";
                                                                while (true) {
                                                                    switch (str26.hashCode() ^ (-1241209605)) {
                                                                        case -2055825451:
                                                                            str25 = "ۧۦ۬ۥۗ۫ۤۨۢۧۘۜۘ۠ۙۘۘۥۘۜۘۤۗۘۦۜۨۤۜۡ۠ۜۥ۟۫ۜۘۚۤۜۛۤۨ۬ۙۦۖۜ۫ۖۖ۟ۖۖۘۗۘۧۘ";
                                                                            break;
                                                                        case -1953861585:
                                                                            str25 = "۫ۘ۫۬ۨۡۤۥۖۧۤۖۚۛۖ۠ۦۘۘ۫ۢۦۘۨ۬۠ۖۙ۟ۗۘۧۘۧۙۡۘ۫۬۬ۦۚۨۘ۠۟ۡۖۘۘۘۨۡۦۜۧۗۥۜۖ۬ۜ۬ۖۥۖۘۚ۟ۜۘۥۜۦۦۡۨۖۜۥ";
                                                                            break;
                                                                        case 29235425:
                                                                            str26 = "۫۟ۦۧ۫ۚۡ۫ۖۘ۫ۥۗۧ۠ۤۨۦۘۘۚۥۘۢۦۗۛۖۗۢ۫ۥۡۖۖۗۛۦۘۗۚۙ۫ۗۗۡۨ۟";
                                                                            break;
                                                                        case 1120936232:
                                                                            str26 = c0332o15 != null ? "ۥۖۙ۟ۧۖۘ۠ۢ۬ۢۦ۬ۦ۠ۥۥ۫ۡ۬ۡۖۧۜۨۘۧۗ۟ۜ۬ۨۘ۟ۥۦۤۤۢۧۤۡۘ۠۫ۨۢۙۡۡ۟۫ۧ۟ۨۘ۫ۦۤۨۦۗ۬ۡۥۦۡ۠ۦۘ۬ۦۙۡ۟ۚ۫ۙۤۦۤۖۘۗۘۘۘ" : "ۦ۠۬ۦ۟۬۬۬۬۠۟ۤ۬ۢ۫۫ۧۖۘۧۧۦ۟ۙ۟ۙۦۦۘۨۛۦۘ۫ۛۤۤۙۧ۟ۨۧۥۦۛۦۤ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1018951985:
                                                                str24 = "۟۬ۨۗۨۧ۠ۤۙۥ۟ۨۘ۫ۥۦ۫ۦ۬ۨۨ۬ۗۨۥ۬ۤۨۘۘۡۧۘۢۥۨۥۚ۬ۥۧۡۘ۟ۙۖ۟ۙۘۛ۠۫ۖۘۧۘۛ۬ۛ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case -821110150:
                                        str8 = null;
                                        str17 = "ۚۖۨۙۨۤۥۘۦۢۦۧۗۘۜۘ۫ۚۚۧۥ۬ۤۗۨۘ۟ۙۡۦ۟ۖ۬ۥۢۚۘۨۨۢۥۙۖۚۨ۬۬";
                                        break;
                                    case -820682056:
                                        str13 = c0332o14.f1723;
                                        str17 = "۫ۘ۟۠ۖۥ۫۟ۥۘۙۘۚۙۡۖۘۚۗۥۜۦۨۦۥۘ۠ۥۧۘۨۘۢ۫ۗ۟۫ۢۘۘۚۦۨۦۚۚۢۘ۠ۨ۠ۖۘۛۥۘۙۢۡۘۥ۫ۚ۬ۗۧۛۚ۟ۛۖۡ۫ۘۘۦۦ۬";
                                        break;
                                    case -809698330:
                                        int i7 = C0330o.f1000;
                                        str17 = "ۚۧۧۡۤۢۨۗۢۦۡۜۘ۬۟ۢۤ۫ۙۜ۫ۜ۠ۛۨۘۧۨۘ۠ۘۙۧۗۡۘۡۨۦۘ۟ۚۦۘۤۥۦۘۤ۬ۗ۫ۖ۠۬ۢۢۨۦۨۙۛۦۘ۬ۨ۠ۤ۬ۤ۫ۢۦۦۤۖۘۜ۫ۙ";
                                        break;
                                    case -796298144:
                                        str17 = "ۗۢۤۢۖۖۘۢۧۘۘۢ۟ۚۨۦۜ۠ۡ۬ۖۜۘۡۙ۠ۡۨۢۜۚ۬ۥ۠ۖۜۙۡۘۛ۠ۘۘۥ۬ۜۘۤۥۛۜۗۙ۠ۨۘۦۙۗ";
                                        str12 = str5;
                                        break;
                                    case -770041575:
                                        C0237h4.m865(str14);
                                        str17 = "ۨۚۡۘۥۥۨۘۢۧۨۘ۬ۦۖۢۖۧۘۤۦۧۘۢۖ۬ۥ۠۬۬ۦۜۘۨ۟۟ۧۖۚۧۜۗ۠ۦ۫۬ۖۨۘۥۗۥ";
                                        break;
                                    case -769501765:
                                        str9 = c0332o12.f1717;
                                        str17 = "۫ۡ۠۠ۚۖۙۢۘۜۖۥۘۛۖۤۨۧ۬ۛۡ۫ۖۢۜ۫۠ۢۚۤۖۘ۫ۘۧۘۧۦۨۘ۟ۧۘۘ۫ۥۘۥۥۤۡۜۖۘ۬ۦۨۘۗ۠ۗۤۙۛۖۢۢۨۙۧ۠ۜ۟ۚۡۥۗۡۗۚۦۧۘۥۘۧۢۛ۬";
                                        break;
                                    case -677506853:
                                        str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                        str10 = str9;
                                        break;
                                    case -608322675:
                                        c0332o13 = c0336o53.f1008;
                                        str17 = "ۙۧۧ۟ۚ۫ۚۡ۠ۖۤۙ۟ۙۡۚۢ۬ۧۘۘ۟ۙۨۥۥۨۘۖۜۘۘ۬ۡۙۡۙۙۖ۠۟ۢۥۥۘ۟ۗۖۡۛۘۘۥۜۦۨۙ۫۬ۜۘۙۖۜ۠۫ۥۡۧۥۘ۬ۢۖۨۛۘۘ";
                                        break;
                                    case -599498489:
                                        C0237h4.m865(str16);
                                        str17 = "ۢۡۙۚۗۧۤۖۢۚۤۥ۠ۢۖۜۚۨۘ۠ۧۜۢۢۡۛۨۘۦۜۧۥۨۖۘۙۡ۟ۘۥۚۧۧ۠ۚۚ۠۬ۤۘ۬ۙ۫ۥۦۛۖ۬۬ۡۜۙۙۢۛۧۚ۟۫ۨۧۘۖۢۡۢۨۘ۬۟ۜۤ۫ۗ";
                                        break;
                                    case -520634394:
                                        int i8 = C0330o.f1000;
                                        str17 = "۫ۙۗ۟۠ۧۥۗ۬۟ۛۘۘۦ۫ۘ۫ۘ۬ۙ۬ۖۘۚۧ۬۠ۗۥۦۡۘ۟ۛۥۘۡ۬ۦ۫ۧۖۚ۬ۚ۠ۜۡ۠۠ۨۦۖۜ۬۫ۨۧۥۘۤ۟ۗ۟ۘۘ";
                                        break;
                                    case -385682546:
                                        str5 = null;
                                        str17 = "ۗۡۜۜۘۛۢۢ۫۫ۢ۟ۛۗ۟ۖۢۦۘۧ۠۬ۗۘ۟ۛۜۚ۠ۥۗۖۛ۠ۤۧۙ۠ۚۡۖۜ۠ۨ۟ۗۜۗ۬۬ۥۘۙۘۨۡ۟ۦۜۗۛۥۗ";
                                        break;
                                    case -360761663:
                                        str6 = null;
                                        str17 = "ۢۖۡ۬ۨ۫ۛ۠۬۫ۢۙۜۜۘۚۢۡ۫ۘۥۘ۬ۧۘۘۖۤۨۘ۠۠ۗۦۧۦۨۛۨ۠ۖۨ۫ۢۖۨ۫ۥۘۛۗۖۥۡۧۥۘۘۜۧ۟ۖ۠ۖۘۚۨۗۨۚۘۘۧۢۛۘۨۘOۛۖۜۘۦۡۡ";
                                        break;
                                    case -269330834:
                                        C0286kb c0286kb5 = MainActivity.f1289;
                                        str17 = "۫۫ۘۘۡۛۜۘۘۛۜۛ۬ۖۘۥۢ۫ۡۧۙۗۧۡۘۢۗۢ۫ۙۖۘ۟ۨۡۘ۬ۥۧۘۨۚۢ۬ۦۜۘۡۨۛۖۨۤۥۧۨ۬ۘۖۘ۠ۖۨۘ";
                                        break;
                                    case -91938708:
                                        switch (i6) {
                                            case 0:
                                                str17 = "ۥ۠ۡ۬ۚۖۘ۬ۤۘۧۥۘۘۙۚۨ۬ۘۘۨۧ۬ۦ۫۫ۧۜۗۖۧ۟ۡۧۧۢۧۡۡ۫ۜۨۘۖۖۥۜۥۗۧۗۜۘۚۗۗ";
                                                break;
                                            case 1:
                                                str17 = "ۜۨۥۘۡۘۨۘۗۘۢۛۘ۠۫ۖ۬ۘۛۨۘ۬ۖۦۘ۬ۜۙ۫۠ۖۘۡۢۦۧۘۧۤ۫ۜۘۨ۟ۢۙۢۢۛ۫ۙۧ۟ۨۘۗۗۨۛۜۨ";
                                                break;
                                            case 2:
                                                str17 = "ۚۦۨۨۢۗۚۢۛۖۡ۟ۛۛۨۧۦۦۘۧۤۦۗۡۡۙۡۜۘ۟۟ۛۡ۫ۜۘۤۘۧۨ۠ۥۨۛۚ۬ۖ";
                                                break;
                                            default:
                                                str17 = "ۢ۫ۨۙۢ۟ۘۙۘ۬ۗۥۚ۬ۡۘ۠۫ۖۘۙۖۢ۬ۙۡۘۗۡۢۘ۟ۦۢۜۦۖۨۜۧۦۨۘۥۥۧۢۛۙ۠ۖۘۛ۟ۖۦۜ";
                                                break;
                                        }
                                        break;
                                    case 156129331:
                                        str17 = "ۢ۬۟ۧ۫ۗۡ۬ۨۘۦۧۤ۬۫ۗۙۚۖۛۧ۟ۙ۫ۖۚۥ۫ۤۗ۠۬ۙ۫ۖۨ۠ۧۘۙۦۡۤۢۥۘ";
                                        str10 = str8;
                                        break;
                                    case 225955315:
                                        c0332o14 = c0336o54.f1008;
                                        str17 = "ۧۗۜۘۦۨۘۖۗ۫ۗۙۘۘۢۖۧۘۡۨۜۛۜۡۘۥۨۧۖۛۚۡۛۜۜۘۨۢۤۙۙۗۚۘۜ۫ۢۗ۫۠ۜۥۘ۠ۙۛۤۨۘۘۧۖۨ۠ۢۜۗۙۦۚۙۢ۠۠ۤ۟ۗۤ";
                                        break;
                                    case 275824491:
                                    case 783311659:
                                    case 1340027351:
                                    case 1678782081:
                                        return;
                                    case 366225306:
                                        str17 = "ۜۡۡۘۚۜۖ۠۫ۢ۫ۚۢۚۨۗۜ۬۫ۡۨۛۥ۟۟۬ۙۗۡۗۖۢۤۦ۟ۛۥۘۨۨۜۘۤ۟ۗۖۨۡۘۘۦۜۘۦۢ۟ۗۜۙ";
                                        break;
                                    case 583592890:
                                        int i9 = C0330o.f1000;
                                        str17 = "۬ۗۤۚۨۛۦۜ۫۠ۛۤ۟ۙۘۘ۠ۜ۫ۗۡۚۚۤۡۘۜۥۧۘۢۛۘ۠ۥ۟ۥۛ۠ۛۘۨۗۥۘۗۜۖۘۤ۟ۖۘ۠ۨۧۘۥۗۡ";
                                        break;
                                    case 595212816:
                                        C0237h4.m1090("$mainTip", c0336o53);
                                        str17 = "۬ۙۦ۬ۚۥۘۡۘۥۘۧ۬ۥ۬۟ۥۛۖۙۦۚ۬ۥۖ۬ۛۗۛۥۢ۬ۜۦۥۖۦۧۜۖ۬ۛ۬ۥۙۚۡۘۢ۫ۨۦۢ۟۠ۚۡۗۢۛ۫ۤۚۧۨۘۚۥۦ۟ۥۘۙۙ۠";
                                        break;
                                    case 603348436:
                                        C0237h4.m1090("$mainTip", c0336o54);
                                        str17 = "ۘۖۨۦۖۧۘۛۧۜۜۘۧۘۙۖۡۘۤۗۥۚۖۥۘۧۥۘۦ۬ۛ۬ۥۡۘۤ۫۟۫ۙۡۚۘۡۛۚۤۢۤۗ۠ۢۜۡۜۨۙۜۘۨۦۦۘۧۙۧۘۗۘۖۚۤۥۘۘۗۥ۠";
                                        break;
                                    case 625864105:
                                        C0286kb c0286kb6 = MainActivity.f1289;
                                        str17 = "۫ۥۙۡۨۜۤ۠ۜۘۙۦۦ۫ۧۖ۟ۜۧۘۢ۠ۨۘۖۨۨۘۗۤۥۘۡ۟ۥۖ۠ۗۗ۠ۗۘۡۦۢۦۧۥۘۧۖۦ۟۬۟۠ۚۜ۬ۨۧۛۙۖۖۚۛۛ";
                                        break;
                                    case 748969091:
                                        str17 = "ۘۤۛۢۢۡۘ۠ۜۥۘۥۚ۟ۧ۬ۖۧۖۘۖۧۨۘۨ۬ۜ۠ۥۘۦۨ۟ۖۙۜۘۢۦۦۧۧۜۘۙۦۢۧ۬ۨۨۡۘۡ۟ۡۢۚ۫ۥۜۨۘۗ۫ۧۤۦ۠۫۠ۗۦۦۥۘۨۘۖۜ۬ۥۘۜۜۜۘ۫ۙۛ";
                                        break;
                                    case 929513715:
                                        C0330o.m1170(str16);
                                        str17 = "ۤۨ۬ۢۚ۫۬ۤۖ۟ۢ۫ۧۦۘۧ۬۠ۨۜۧۧۚۢۡۖۘۜۗۡۥ۬ۦۘۜ۫۬۬ۜۙۤۤۖۘۛ۫ۧۛۤۛۙۗۧۜۧۤ۬ۢ۟ۤۨۘۘۜ۟ۦ";
                                        break;
                                    case 974053466:
                                        c0336o55 = this.f875;
                                        str17 = "ۜۘ۫ۢۥ۫ۨۙۙ۠ۗۖۘۘ۠ۦۥ۫ۖۥۢۧ۟ۥ۫ۘۡۨۘۗ۫۫ۨۦۥ۬ۛۡۘۗۡۘۘ۠ۦۨۘۥۥۛۜۥۖۘۗۢۖۖۙ۟ۙۜۖۘۖ۟ۤۦۘۡۖۖۦۚۡۦۘۜۡۚ۟ۛۖ۬۟ۘۘۡۖ۫";
                                        break;
                                    case 994974833:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "ۦۡۤۛۛۢۧۧۗ۬ۦۖۘۗۜۘۘۖۥۖۘۖۧۥۘۧۙۜۘۚۤۨۘۜۗۥ۠ۘۥۘۛۤۛۙ۟ۖۚۜۡ۟ۤۖۘۚۖۡ۫۫ۘۘۜۛۖۘۛۗ۬ۦۖۗۖۗۨۧۢۤۢۗۦۘ۬ۙۜ";
                                        break;
                                    case 1054170174:
                                        C0237h4.m1090("$mainTip", c0336o55);
                                        str17 = "۟ۧۛۨ۠ۤ۬ۗۡۚ۠۠ۙۡۘۜ۠۠ۥۗۥۘۡۖۥۘۘۡۦۘۦۤۥۘۨۙۛۚۜۜ۟ۦۘۢۢۙۙۖۘۧ۟ۦۥۖ۬ۡۦۖ۠ۤۖ۠ۜ۬ۖۨۜ";
                                        break;
                                    case 1285812657:
                                        i6 = this.f874;
                                        str17 = "ۛۤۙۨ۟۠ۖۥۡۖۡۢۛۡۧۥۙ۫ۘۘۧۜۛ۬ۦۧۘ۫۫ۙۜ۠ۥۘۨۘۖۤۥۦۤۜۛ۟ۛ۠ۥۚۗ۠ۖۢۙۚۡۘ۫ۨۗۢۤ۫ۗۚۧۥۥۤۙۛۡۤ۠ۘ";
                                        break;
                                    case 1353876195:
                                        String str27 = "ۦ۬ۡۤۥۖۚۙۘ۬ۦۦۘۙۥۡ۠ۛۨۖۜ۟ۖۢۥۘ۠ۜۡۦۧۘۜۧۖۘۤۥۥۡۗۜۨ۟ۡۗۙۗ";
                                        while (true) {
                                            switch (str27.hashCode() ^ (-539259595)) {
                                                case -1875564994:
                                                    str17 = "ۧۖۡۦۡۘ۬ۖۢۘۦۡ۟ۢۛۗۤۜۘۦۘۧ۫ۚۛۚۤۜۤۜۘ۟ۨۖ۬۠ۢۡۖۢ۠ۗۜۘۙ۠۠ۡۢۢ۫ۡ۫۟ۖۖۘۧۛ۠ۢ۟۬۫ۘ";
                                                    continue;
                                                case 667432776:
                                                    str27 = "ۡۛۘۘۤۛۦۦۖۖ۟ۙۜۘۤۜۥۘۡۧۘۘۘۜۛۢ۠ۦۗۨۘۘۥۡۜ۠۟ۦۘۨۦ۠ۤۛ۬ۛۤۡ۬ۙۚۘ۫ۡ۬ۤۜۘۦۜۦۘ";
                                                    break;
                                                case 1767964991:
                                                    str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                                    continue;
                                                case 2056888340:
                                                    String str28 = "۟ۢۜ۠ۙۥۘۜۤۖۘ۠۫ۨۘۙۥۨۘ۟ۥ۟۫ۜۤۗۤۨۘۖۤۡۘ۫ۥۙ۟۬ۡۘۖۜۛۦ۠ۨ۠ۦۡۛۦۖۛۢۧۥۧۚۚ۫۬ۛۛۚ۠ۚۥ۬ۡۧۖۚۤۚ۟۟ۜۙ۟۟ۛۚۘۗ۟ۛۢۘ";
                                                    while (true) {
                                                        switch (str28.hashCode() ^ (-1711662654)) {
                                                            case -1572277747:
                                                                String str29 = "ۦۛۙۢۚ۠ۤ۫ۧۨ۠۫ۨۡۦۘۧۘ۫ۤۜ۠۫ۜۦۤۡ۬ۚ۬ۡۦۙۧۡۨ۟ۜۡۨۘۥۚۨۚۚۖۘ۬ۧۘۙۧۤۤۥۗ۠ۨۦ۬ۜۤ۠ۖۘ";
                                                                while (true) {
                                                                    switch (str29.hashCode() ^ (-730203158)) {
                                                                        case -2016148936:
                                                                            str28 = "ۧ۬ۨۘۗۗۥۘۢۙۤۗ۬ۧ۠ۜۚۛۛ۬ۗۡۥۘۖۜۜۘۥۙۜۘۨۖۧۤۥ۫ۜ۬ۛۥۡۡۘۘۢۖۤۜۚ";
                                                                            break;
                                                                        case -8051377:
                                                                            str29 = "ۗۜۧۚۗۗۗۛۥۙۨۢۦ۫ۘۘۖۙۨۘ۠۟۠ۗ۠ۘۘۥۙۡ۟۫ۘۥۥۜۘۘۛۗۜۦۥۖۨۘۤ۠۫۟ۨ۫۫۠ۖۛۨۘۘۖۗۦۘۖ۠۬ۙۡۗۡۧۜ۠ۖۡۘۛ۠ۘۘۜۚ۫۫ۦۖۘۢۜۡ";
                                                                            break;
                                                                        case 357980236:
                                                                            str28 = "ۦۙ۫ۦۥۚۤۢۡۘۤ۠ۡ۫ۛۛۛۡۘۘۥۗۢۙ۠ۦۖۡ۬ۚۨۨۘۢۘۜۘۚ۠ۜۘۡۖۛۛۗۜۘۗ۟۬ۥۨۡۘ۠۬ۨۙۘ۟ۥۥۨۨۦۡ۫ۨۨۤ۟ۚ۟ۧۘۜۛۡۘ";
                                                                            break;
                                                                        case 987953900:
                                                                            str29 = c0332o14 != null ? "ۚۤۚ۫ۗ۬۠۠ۢ۫ۡۢ۬ۘۗ۬ۘۘۥۤۥۘۧۘۥۘۜ۫ۦۖۚ۬۠ۙۖۘۧۦۨۘۜۘۗۙ۠ۘ۫ۖۘۧۤۘۘۡ۬ۖۘۢۖۜۘۚۗۖ۠ۤۗۗ۟۬" : "ۡۦۦۗۨۤ۟۫ۚۘۗۧ۟ۗۥۨۤ۟ۨۗۡۚۤ۬ۚ۠ۛۡۖۘ۟ۙۡۛۤۜۘۨ۫ۚۦ۬ۥۙۧ۬ۢۗۥۜۧۘ۫ۡ۫ۘۘۘۧ۫۠";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 2956209:
                                                                str28 = "۠ۛۡۘۢۨۥۦۦۤ۟ۥۚۧۜۘۥۛۡۘۚ۬ۡۖۤۖۘۖ۫ۨ۫ۖۤۦۢۗۨۦۢۜۢ۟ۛۦۘۢۗۗۖ۠ۨۜۛ۬ۜۛ۠ۨۦۗۡ۠ۥۘۘۚۤ";
                                                                break;
                                                            case 466636123:
                                                                str27 = "۫ۛۜۘ۠ۤ۟ۤۧۙ۬۟ۗۤۛ۫ۗۦۤ۟ۥۡۘۦۜۘۢۢۥۘ۠ۛ۟۬ۗۧۦۢۛۥۚ۬ۤۗ۟ۚۗۜۘ۬ۦۜۘۚۨۗۗۙۤ";
                                                                break;
                                                            case 1092978740:
                                                                str27 = "۠ۖ۬ۥ۠ۙۨۙۗۖ۠ۜۘ۟ۗۖۗۡۘۡ۠ۗۚۨ۫۬ۙۘۘ۫ۘ۟ۢۚۜۗۧۡۡ۫ۤۨ۬ۥ۟ۢۖۘ۫۟۠۬ۜۡۗۦ۠۬ۢۖۘۚۚ۟ۨ۟ۨۦۖۥۙۗۘۘۙۗۗۨۢۖ۠ۢۨۡۨۥ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1490954571:
                                        str7 = null;
                                        str17 = "ۢ۠ۡۘۧ۟ۨۘ۟ۛ۠۟ۡۜۦۜۦۘۨۧۛۨۡۦۢ۠ۨۘۖ۠۠۬ۙۢۦۨۖۘۖ۠ۥۖ۠۟ۦ۬ۜۘۤۢۥۘۘۜۢ۬ۦۢۘ۬ۥۗۨۥۘۘۨ۬۫ۦ۫";
                                        break;
                                    case 1567174269:
                                        str17 = "ۜۙ۫ۘۤۧۦۚ۫ۨۛۡۦۡۛۧۜۘ۬ۡۜۘۥۖۧۤۡ۬ۗۧۙ۟ۤۖۡۨۢ۠ۖۛۧ۫ۦۘۖۤۘۜ۟۠ۧ۬ۥۦۨۗ";
                                        str16 = str7;
                                        break;
                                    case 1658023366:
                                        int i10 = C0330o.f1000;
                                        str17 = "ۛۥ۟ۨۢۛ۬ۖۖۧۨۧۘ۫۬ۗ۟ۧۛۡۤۙۥ۬۟ۤۢۜۧۗۙ۫ۖ۬ۥۗۢ۫ۧ۬ۖ۫ۨۛ۫ۖ۟ۗۚۖۗۙۗۧۨۡۘ۟ۡۘۘ۟";
                                        break;
                                    case 1681125014:
                                        C0237h4.m865(str10);
                                        str17 = "ۨۢۥ۬۠ۜۘۘۚۚۦۘۦۨۚۖۘۗۤۘۢۜۤۗۜۡۘۧۚۖۥۜۨۘۨ۟ۢۧۖۜۘۛ۟۟ۧ۠ۘۛۛۘ";
                                        break;
                                    case 1731513016:
                                        c0332o12 = c0336o52.f1008;
                                        str17 = "ۧ۟۫ۗۢ۠ۖۧۤ۠ۗۖۗۢۙۧ۫۠ۙۙ۟ۚۛۗۥۧۜۡۧۘۜ۠۠۫۬۠ۥ۟ۨۘۖۦۦۚۨۨۘ";
                                        break;
                                    case 1752004423:
                                        str15 = c0332o15.f1717;
                                        str17 = "۟۬ۨۡۗ۫ۦۢۨ۠ۗ۬ۦۥۥۡۢ۠۬ۗۨۘۥۡۨۘۛ۬ۖۘۥۗۡۘۡۢ۬ۥۚۤۨۚ۠۠ۗ۠۟۬ۘ۟۠۠ۘۦۘۦ";
                                        break;
                                    case 2049773532:
                                        str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                        str14 = str13;
                                        break;
                                    case 2064801264:
                                        C0330o.m1167(str12);
                                        str17 = "ۤ۠ۗ۫ۗ۬ۥ۬ۤۚۜ۫ۦۡۖۢۜۥ۟ۜۢۙۚ۬ۘۨۖۘۧ۟ۚۖۧ۬۫۫ۨۘۡۥۖۛۜۥ۫ۤۖ۟ۨۗۥ۟ۛ۠ۙۛۗۡۥۢۥۢۗ۟ۡۘۦۧ۠ۡۘ۟ۦۦۘۤۗ۫۫ۖۧۘ۟ۨۡۘ";
                                        break;
                                }
                            }
                        }
                    });
                }
                C0332o1 c0332o12 = c0336o5.f1008;
                if (c0332o12 == null || (str = c0332o12.f1717) == null) {
                    i4 = 0;
                } else if (!(str.length() > 0)) {
                }
                if (i4 != 0) {
                    TextView textView5 = (TextView) mainActivity2.findViewById(R.id.mTvUsedTitle);
                    TextView textView6 = (TextView) mainActivity2.findViewById(R.id.mTvUsed);
                    textView5.setVisibility(0);
                    textView6.setVisibility(0);
                    textView5.setOnClickListener(new View.OnClickListener(c0336o5, i3) { // from class: ۟.j5

                        /* JADX INFO: renamed from: ۥ */
                        public final int f874;

                        /* JADX INFO: renamed from: ۥ۟ */
                        public final C0336o5 f875;

                        {
                            this.f874 = i3;
                            this.f875 = c0336o5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = 0;
                            String str5 = null;
                            String str6 = null;
                            String str7 = null;
                            String str8 = null;
                            C0336o5 c0336o52 = null;
                            C0332o1 c0332o122 = null;
                            String str9 = null;
                            String str10 = null;
                            C0336o5 c0336o53 = null;
                            C0332o1 c0332o13 = null;
                            String str11 = null;
                            String str12 = null;
                            C0336o5 c0336o54 = null;
                            C0332o1 c0332o14 = null;
                            String str13 = null;
                            String str14 = null;
                            C0336o5 c0336o55 = null;
                            C0332o1 c0332o15 = null;
                            String str15 = null;
                            String str16 = null;
                            String str17 = "ۜۨۙۨۚۜۘۘ۬ۤۥۗۗۙ۫ۜۨۨۨۘ۫ۨۜۘ۟ۙ۟ۘۚ۬ۢۧۨۘۘۧ۫ۘۚۜۘۤۡۡۘ۬ۨۘ۬ۚۧۜۘۚۙۙۢۨۥۚ";
                            while (true) {
                                switch ((((((((str17.hashCode() ^ 937) ^ 416) ^ 550) ^ 440) ^ 297) ^ 920) ^ 0) ^ (-193156567)) {
                                    case -1976897249:
                                        String str18 = "ۨۖ۠ۤۨ۟ۜۡۘۘ۠ۛ۟۟ۦۡ۫ۧۛۢۨۙۢۜۘۤۖ۟۬۬ۙۤۘۛۢۙۖۘۛۗۡۨۨۥ۠ۜۥۘۢۗۚۨۚۥۢ";
                                        while (true) {
                                            switch (str18.hashCode() ^ (-1657001700)) {
                                                case -1542852949:
                                                    String str19 = "ۚۘۨۡۦۥۘۡۜۤۥۖۤۦۚۚۜ۫ۥۘ۟ۚۢۡۚۡۘ۟ۜۢۧۗۛۧۘ۫۟ۙۨ۠ۦۥۚۙۙ۫۫ۙ۟ۡ۬ۢۦۗۦۜۘۘ۠ۥۘۗۖۛۢ۫";
                                                    while (true) {
                                                        switch (str19.hashCode() ^ 114193177) {
                                                            case -1654208069:
                                                                str19 = "ۤۧۜۘۜۜۜۖ۠۠ۖۨۢۢۧ۫ۛ۬ۜۘ۠ۚ۟ۘۦۘۢۛ۫ۗۥۘۘۧ۫ۘۘۙۜۚۤۢ۬ۗۦۚۡۘۘۘۖۘۗ۠ۤۜ۫۠ۗۖۜۡۢۚۦۧ";
                                                                break;
                                                            case -824909501:
                                                                String str20 = "ۦۛۛۡۙۜ۠ۤۥۚۢۥۛۚۢۙۖ۟ۤۡ۬ۗۥۦۘۛۨۘۛۙۜۨۙۦۨۚ۟ۖۨ۠ۤ۬ۡۘۧۚۨۘ۬ۥۨ۫۫۫ۨۗۙ";
                                                                while (true) {
                                                                    switch (str20.hashCode() ^ 164210155) {
                                                                        case -527667276:
                                                                            str20 = c0332o13 != null ? "ۙۤۤۧۖۙۗ۟۠۬ۤۨۥۜۛۦ۠۫ۥۨۥۙۘ۫ۧ۫ۘۦۨۘۙ۬ۧۘۜۤۖ۬ۚۗۡۧۚۡۡۘۙۚۢ۬۬ۡۘۤ۟ۚۛۖۥۘۡۛۧۡۙۘۤۚ۟ۛۙۡۘۜۦۡ" : "۟ۧۧۦۥۘۡۘۗۜۜۘۗ۬۬ۢۧۜۖۖۢۨۨۘ۠ۖۘۘۗۗۡ۬ۛۡۗۜۡ۟ۨۦۘۗۛۚ۫ۚ۬ۛۤۙۤۧ۠ۙ۟ۙ";
                                                                            break;
                                                                        case 930427964:
                                                                            str19 = "ۦۤۖۘۖۦۨۖۚۘۡۧۙۡ۬ۤۧ۬ۤۗ۟ۢۡۛۢۧۦۘۘ۟۠ۚۖۡۘۗۨۖۘۥۚۛۜۧۘۥ۟ۜۘ۠ۛ۠ۙۖۘۛ۬ۢ۠ۘۢۙۛۚۡۡ۬ۙۘۖۘۢۡۡۙ۬۟ۚۢ۬ۚ۫۠ۧۤ";
                                                                            break;
                                                                        case 1310252649:
                                                                            str19 = "ۛۘۥۙۖ۫ۢۖ۟۟ۢۥۘۥۡۦۖ۬ۖ۫ۜۧۨۛ۬۠ۤۦۖۖۛۥۦۘۨۤ۟ۚۛۧۛۤۖۘۧۦۙ";
                                                                            break;
                                                                        case 1964778413:
                                                                            str20 = "۠ۨۡۙ۬ۘۤۦۜۘۤ۠ۦۥۦۨۦ۫ۡ۫ۢ۠ۥۢۨ۠ۧ۠ۘۧۥۜ۠ۥ۫ۨۘۙ۫ۦۙ۬ۚۦۢ۟";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -423824707:
                                                                str18 = "ۡۗۘۦۖۗ۫ۘۦۘۨۚۨۘۢۛۨ۬ۢۖۢۜۘۢۧ۠۠ۛۡۦۧۖ۬ۘۜۗۥۘۚۗۤۗۦۖۘۙۘۜ۟ۢۨ۫ۥۦۘ۟ۥ۟";
                                                                break;
                                                            case 982425732:
                                                                str18 = "ۦۨ۫ۜۤۘۘ۫۠ۚ۠۫ۖ۫۠ۜۥۦۦۖۗۥۘۜۘۖۘۢۚۘۡۥۨۖۧۗۨۧۗۜۤ۬ۢۙۘ۬۟۬ۗۦۥۘۚۚۢۜۖۡۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 526286094:
                                                    str18 = "ۜۖۖۘۚۗ۬ۛۛۖۗ۟ۥۢۛۛۖۧ۠ۖۤۡۘۚۥۗۡ۫ۖ۫ۖۤۗۛۡۘۡ۫ۡۘۨ۫ۜۘۢۧ۟ۛ۠ۨ";
                                                    break;
                                                case 653886550:
                                                    str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                                    continue;
                                                case 871669741:
                                                    str17 = "ۖۥۥۘۛۨۨۘ۬ۜۨۖ۟ۖ۠ۛۘۘۜۥ۟ۜۙۦۘۗۨۘۘ۫ۛۨۘ۬ۘۗۗۗۗۘۙۙۥۚۜۗۧۗۦۡۙۤۡۥۖۙ۫ۦۙۜۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1958056289:
                                        c0336o54 = this.f875;
                                        str17 = "ۜ۟ۗۙۖۡۘۧۡ۟ۤۧۚۦۨ۫ۦۦۦۘۨۡۡۘ۬ۤۗۛۙۘۚۛۘۘۦۘ۫ۧۧ۫ۦ۠ۙ۫ۨۘۥۡۘ";
                                        break;
                                    case -1917108434:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "۟ۛ۠ۚۡۖۖ۠ۡۘۥۢۛۖۥۘ۬ۢۢۘۗۤۤۜۖۧۗۨۦۖۦۘۙۡۙۧۚۙۚۗۧۥۚ۫ۙۡۨۖ۟ۦۘۗۢۗۗۛۨۘۤۧ۫ۛۛۘۥۢۜۘۗ۫ۛۢۙۨۘۡ۠ۖ";
                                        break;
                                    case -1788180115:
                                        str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                        str12 = str11;
                                        break;
                                    case -1777849339:
                                        str17 = "ۜ۠ۧۧۡ۟ۗۘۥۚۢۜۘۙۛۦۘۗۤۗ۫ۡۥ۫۫ۧۡۤۥۘۦۡ۠ۧۡۜۨۨۨۘۗۢۚۤۙۚۖ۬ۧۖۧۙۡۚۨۥۛۙ";
                                        str14 = str6;
                                        break;
                                    case -1542759203:
                                        C0237h4.m865(str12);
                                        str17 = "۟ۖۤۦۤۘۘ۠۫ۗۗۙۘۗۤ۫ۡ۠ۦۢۧۡ۬ۘ۠۠ۦ۬ۨۙۥۨۢۖ۫ۧۚۘۖۘۦۧۜۨۖۧۘۗۨۗۥ۠ۚۛۘۛ";
                                        break;
                                    case -1484789383:
                                        c0336o53 = this.f875;
                                        str17 = "ۚ۠ۦۘۨۨ۟ۚۢ۠ۨۙۡۘۤۖۘۘۛۚ۬۟۠ۧۖۘۖۖۦۘۦۦۥۘۧۜ۠۫ۧ۬ۘۤۥۘۗۧۜۘۥ۟ۦ";
                                        break;
                                    case -1430289878:
                                        c0332o15 = c0336o55.f1008;
                                        str17 = "ۦۥ۫ۤۤۛۚۖ۬ۙ۫ۘۚ۠ۙۢۨۖۘۨۢۧۗۚۧۘۛۙۗۧۦۘۗۚ۠ۚۜۘۘۜ۟۠ۨۘۙۛۖۘۘۨۨۘۖ۫ۖۘۧۡۦۢۚۨ۠ۚۧۤۜۧۛۡۧۘۖۤۡ۬ۡۧۘۢ۠۫ۨۦۡۘ۬ۗۗ";
                                        break;
                                    case -1402821200:
                                        c0336o52 = this.f875;
                                        str17 = "ۤ۫ۖۘۗۛۦۖۖ۫ۛۧ۬۬ۥۨۜ۫ۢۡۢۢۖۖ۫ۤۘۨۗۢۨۧۗۧۤ۫ۥۦۙۙ۟ۧۛ۟ۢۢ";
                                        break;
                                    case -1341922224:
                                        String str21 = "ۖۡۙۥۘۘۥۚۧۧۘۧۘۤۘۥۘۘ۟۬ۙ۫ۢۦۘۙ۠ۥ۬ۘۘۙۡۖۤۧ۫ۗ۟ۘۨۘۨۙۚ۬ۜۜۘۗۧۜۧ۠ۖۚۢۨۖ۫ۨۘۖۢۡۜۨۘ";
                                        while (true) {
                                            switch (str21.hashCode() ^ (-551252153)) {
                                                case -1848917142:
                                                    String str22 = "۬ۤۛ۫ۖۜۨۘ۫ۦ۬ۗۖۧۡۘ۫۟ۘ۟ۗۘۨۙۤۖۙۖۢۜۘ۟ۨۡۚۤۜۘ۠ۥۧ۫۟۠۫ۗۘ";
                                                    while (true) {
                                                        switch (str22.hashCode() ^ 229539457) {
                                                            case -2047809925:
                                                                String str23 = "ۚۛۙۘۚۦۘ۬ۘۚۦ۠ۦۛۙۖ۬ۖۖۙ۫ۘۘۛۖۘۖۙۦۘۤۨۨۚۙۘۘۢۙۚۢ۟ۥۥۜۧۘۤۛۦۘۛ۠ۜ۬ۡۖۙۖۖۘ";
                                                                while (true) {
                                                                    switch (str23.hashCode() ^ 1882648421) {
                                                                        case -1342174619:
                                                                            str23 = c0332o122 != null ? "۬۟ۘۘۦ۠۫ۙۦۨۘۧۙۡۡۡۘ۠ۦۛ۬۠ۡۛ۟ۦۘ۠۠ۛۗۡ۟۟ۦۙۗۖۜۨۨۛ۠ۥۥۘ۬ۥۛۚۖۡۚۖۜۛۢۨ" : "ۤۙۚۖ۠ۡۦۥۘۡۚ۬ۗۨ۟ۨ۠ۖۛۡۘۤۜۤۦۧ۠۬ۛ۟ۧۘۢۦۖۢۤۘۧۘ۟ۤۨۘۦۖۘۙۜۥۢۘۥ۠۬ۤۚ۟ۦۘۘۥ۠۟ۤۦۘۙۨۢ۬۬ۜۘۖۙ۠ۧۗۦۘ۫ۥ۬ۢ۟ۥ";
                                                                            break;
                                                                        case -1005594639:
                                                                            str22 = "ۗ۟ۢ۟۠ۤۛۜۦۗۦۥۥۢۖۤۖ۬ۛ۬۬ۧۛۙۡۦۡۡ۬ۘۨۜۛ۟ۤۖ۬ۛۚۤۡۧۖۨۨۘۖۙۘۘۛۧۘۙۥۢۨۧۜۧۡۚۗۧ۬";
                                                                            break;
                                                                        case 818439621:
                                                                            str23 = "۫۫ۤۙۙۚۙۙۖۡۨۘ۟۠ۤۦۘۙۡۡۙۤۧۖۘ۟ۛ۠۬۬ۦۘۖۡۖۧۧۥۘۡۨۗۛۛۖۘۦۡ۠ۖۤۨۘۜ۟ۧۤۗۛ۠ۡۢۘۘۘۗ۠ۙۡۘۘۗۘۦۘ";
                                                                            break;
                                                                        case 1987400100:
                                                                            str22 = "ۢۨۙ۟۟ۘۘۚۧۗ۟ۖۘۘ۟ۖۘۛۚۨ۬ۚ۟ۜۨۡۘۢۜۗۦ۟ۘ۫ۢۤۚۥ۟ۢ۟۫ۗۙۢۡ۟ۨۗۜۖ۟۠ۥۘۨۚۡۘ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -1875414390:
                                                                str21 = "ۖۗۜۘۢۖۙۛۡۜۥۥ۫ۖ۠۫۬ۖۗۡ۠ۘ۠ۨۜۘۗۘۜ۫ۛۙۤۗۖۘۚۘۚۘۛۡۘۧ۬ۨۘ۟ۘۘۢۗۗۖ۟ۦۘۘۤۛۦۛۖۚۢۨۨۗۨۘۢۜۘۢۖۦۥ۫";
                                                                break;
                                                            case -1586829220:
                                                                str22 = "ۡۢۛۤۛۛ۠ۙ۫۟ۨۨۘ۟ۛۘۘ۟ۤ۫ۘۨۚۛۦۗۥۡۡۥۧۦۛۜۚۚۨۗ۬ۧۤ۬۫ۨۗۘۡ۠ۚۙ۫ۥۘۗۜۡ۠ۦۛۖۗۛ۬ۦ۠";
                                                                break;
                                                            case -40669877:
                                                                str21 = "ۚ۟ۜ۟۟ۚ۟ۨۚۘۜ۠ۖۥۛۥۘۗۡ۫ۡۘۦۖۤۤ۟ۚۢۨۚۢ۫ۗۘ۠ۖۘ۠۠ۨۘ۫ۥۙ۬ۡۦ۠ۘ۠ۗۨۘۘ۠۠ۦۨۢۥۘۢۖۙۤۖ۟ۜ۫ۥۚۧۥۚۗۜ۬ۗۡۤۗۡۤۧ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -1454025742:
                                                    str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                                    continue;
                                                case 678583481:
                                                    str21 = "ۙۦ۟ۦۡۘۘۖۥ۫ۨۤ۫ۘۛۥۘۗۨۨۦۙۨۚۛۦۘۙۜۗۥۧۜۨ۫ۚ۬۟ۜۙۖۘۨۢۢۨۧۘۤۖۖۡۚ۬ۦ۠ۘ۠ۖۛۘۡۡۡۥۛۦۛۘۘۖ۟ۜۡ۟ۦۗۨۛۖۜۙۦ۟ۗ";
                                                    break;
                                                case 2072360398:
                                                    str17 = "ۗ۠۟ۨۗۨۧۜ۠ۧ۫ۡۘۧۚۡۤۤۥۥۦۧ۠ۨۨۘ۠ۦۖۘ۠ۛۢۤۨۖۨۛۡۘۖۙۨ۠ۢۦۢ۟۟ۙ۬ۤۡۡۖۘۧۡۙ۠ۙۡۘۥۡۘ۬۫ۡۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1340151938:
                                        C0286kb c0286kb3 = MainActivity.f1289;
                                        str17 = "ۜۧ۫۬ۨۜۘۥ۟ۜۘۡ۠ۙۖۖۜۘۛۧۘۘۨۛۚۗۡۥۘۦۛۧۛۥۖۘۨ۟ۡۙ۬ۢۚۜۘۡۗۥ۫ۛۢۧۚۥۘۙ۫ۨۨۤۤۖۛۤ۫۟ۜۚ۫ۗ";
                                        break;
                                    case -1319014332:
                                        str17 = "ۜ۟ۦۦۛۜۙ۠ۦۖۦۘۗۜ۠ۘۘۥۨ۬ۘۘ۫ۙۡۚۤۢۦ۟ۜۘ۟ۘۡۘۘۢۚۦۛۢۨۛۛ۫ۜۨۘۧۘۛۛۘۥۡۦ۟";
                                        break;
                                    case -1278481967:
                                        C0330o.m1167(str14);
                                        str17 = "ۘ۬۠۟ۥۘۘ۟ۗۤۨۘ۟ۧ۟ۢۦ۫۫ۗۗ۬ۚۙۤ۬ۦۤۧۚۙ۫۠ۧۗۚۘۜ۟ۤۢ۫ۡۘ۫ۢۡۘ۫۫ۜۘۦۧۧ";
                                        break;
                                    case -1219436409:
                                        str11 = c0332o13.f1723;
                                        str17 = "ۨۦۙۤۡۢ۠ۧ۬ۘۛۡۘ۠ۛۘۖۛۘۜۧۖۘۦۤۘۘۗۗۦۧۢۚ۠ۡۙۛۢۦۘۖۥۙۥ۠ۨ۬ۘۧۘ";
                                        break;
                                    case -1064727507:
                                        C0330o.m1170(str10);
                                        str17 = "ۗۖۘۘۘۙۨۙۨۘۘۢ۟ۡۡۦۧۘۢۤۚۧۚۦۜۨۚۗ۬ۨۘۚ۫ۖۘ۬ۧۜۘ۠ۘ۬۫ۖۤۗۜۘ۫ۛۖۗۘۗۡۢۗۦۜۘۜۥۨۜ۟ۛۚۡۨۢۨۤۦۨۜۘۗۙۢ";
                                        break;
                                    case -1055073887:
                                        str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                        str16 = str15;
                                        break;
                                    case -1006430172:
                                        C0286kb c0286kb4 = MainActivity.f1289;
                                        str17 = "۟ۖۤۦۤۘۘۚۧۛۥۖۘۢۜۥ۬ۤۨۘۧ۠ۗۡۙ۠ۙۢۖۜۘۘۤۜۡۘ۟ۨ۟ۘۥۖۘۙ۠ۙۖ۫ۖۘۡۚۨۢۧۨۘۚۖ۬ۙۙۖۘۡ۠ۥۤ۫ۢۛۚۤۤۛۜ۠ۜ۫";
                                        break;
                                    case -901673525:
                                        C0237h4.m1090("$mainTip", c0336o52);
                                        str17 = "۠ۥۡۦ۫ۥ۬۠ۗۗۖۜۚ۟ۗۨ۫ۗۙۘۗۖ۬ۙۧۥۜۘۜۚۛۧ۠ۚ۬ۚ۫ۧۗۤۚۚۜۚۖۧۘ";
                                        break;
                                    case -883400274:
                                        String str24 = "ۧۚۥۘ۠ۦۥۘۧۧۢۥۘۡ۬ۘۢۖ۫ۚۛۥ۟ۤۥۚۨۧۜ۠ۜۧ۠ۢۥ۠ۥۖ۠ۖۧۢۘۘۨۤ";
                                        while (true) {
                                            switch (str24.hashCode() ^ (-1337738846)) {
                                                case -2041230381:
                                                    str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                                    continue;
                                                case -1619909312:
                                                    str24 = "ۜ۬ۗۢۜۖۘۥۦۛۢۜۖ۟ۛ۬ۤۤۜۚۜۥۘۧۥۦۖۡۖۘۛۦ۠ۢۚۙ۟ۦۘۦۗۚ۟ۙۖۥ۠ۘۗۙۥ۟ۢۖۘۨ۠۟۟ۖۥۘ۫ۖۤۙۡۦۘۤۨۦۘۤۙ۬۫ۛۦۘ";
                                                    break;
                                                case -159876017:
                                                    str17 = "ۦ۟۫ۨۤ۠ۥ۠ۤۙۜۥۘۜۨۧۘ۫ۛۚۨۚۢۦ۬ۜۡۢۚۜۤۡۜ۠ۖ۫ۥۜ۠ۢۖۚۜ۟ۥۦ۟ۖ۬ۛۧۙۢۢۨۘ";
                                                    continue;
                                                case 1207178405:
                                                    String str25 = "ۥۡۧۘۤۡ۟ۦ۟ۛۖۜ۬ۤۧۛ۫ۙۢۦۡۘۛۛۖۜۨۖۘ۠ۦۙۗۦۖۘۙۚ۠۬ۜۖۘ۫ۦۖۨ۬ۘۛۤ۬ۤۘۘ۬ۛۥۘۥۘۦۘۧۚۗ۟ۜ۟۟ۚۥۛۨۙۜۘۖۙ۟ۖۖۡۘۖۚۨ";
                                                    while (true) {
                                                        switch (str25.hashCode() ^ (-1641056421)) {
                                                            case -2000160485:
                                                                str25 = "ۤۢۡۥ۬ۢ۬ۡۘ۫ۡۢۦۙۡۘۚ۠ۘۚۧۥۘۖۤۧۖۧ۫ۖۖ۠ۘ۫۫ۚۡۘۨۨۘۘۖۢۨۧ۟ۧۗۗۡۘۡۚ۟ۡۥۘۘۤۨۥۘ۬ۤۖۘ۠ۛۛ";
                                                                break;
                                                            case -1715308133:
                                                                str24 = "ۛۡۧ۟۠ۥۜۦۘۘۘ۫ۜۘۗ۠ۦۚۨۨۖۚۨۤۙۧۗۜۧۚۢۤ۬۠ۛۖۦۜۨ۟۟ۥۤ۬ۖۡۥۥۡۙۨۧ۫ۥۚۘ۠۟ۡۙۙۘۥۙ۟۟۫۬ۚ۬ۛۦۦۥ۫ۘۜۚۥۘۘۥۙ";
                                                                break;
                                                            case 29356844:
                                                                String str26 = "۠۬ۚۗ۟ۦۘۚۤۦۗۨۖۘۛۚ۬ۗۤۥۦۡۜۘۢۛۦۘ۟ۦۖۘ۟ۛۧۜۡۥۘۙۜۖۘۤۜۙ۬ۜۗۜۥۘ۬ۖۡۘۗۛۧۢۧۧۙۢۖۖۧ۬ۦۛ۟ۧۡۗۡۛۜ۬ۡۛۦۢۦۘ۟ۨۥۘۚۛۡ";
                                                                while (true) {
                                                                    switch (str26.hashCode() ^ (-1241209605)) {
                                                                        case -2055825451:
                                                                            str25 = "ۧۦ۬ۥۗ۫ۤۨۢۧۘۜۘ۠ۙۘۘۥۘۜۘۤۗۘۦۜۨۤۜۡ۠ۜۥ۟۫ۜۘۚۤۜۛۤۨ۬ۙۦۖۜ۫ۖۖ۟ۖۖۘۗۘۧۘ";
                                                                            break;
                                                                        case -1953861585:
                                                                            str25 = "۫ۘ۫۬ۨۡۤۥۖۧۤۖۚۛۖ۠ۦۘۘ۫ۢۦۘۨ۬۠ۖۙ۟ۗۘۧۘۧۙۡۘ۫۬۬ۦۚۨۘ۠۟ۡۖۘۘۘۨۡۦۜۧۗۥۜۖ۬ۜ۬ۖۥۖۘۚ۟ۜۘۥۜۦۦۡۨۖۜۥ";
                                                                            break;
                                                                        case 29235425:
                                                                            str26 = "۫۟ۦۧ۫ۚۡ۫ۖۘ۫ۥۗۧ۠ۤۨۦۘۘۚۥۘۢۦۗۛۖۗۢ۫ۥۡۖۖۗۛۦۘۗۚۙ۫ۗۗۡۨ۟";
                                                                            break;
                                                                        case 1120936232:
                                                                            str26 = c0332o15 != null ? "ۥۖۙ۟ۧۖۘ۠ۢ۬ۢۦ۬ۦ۠ۥۥ۫ۡ۬ۡۖۧۜۨۘۧۗ۟ۜ۬ۨۘ۟ۥۦۤۤۢۧۤۡۘ۠۫ۨۢۙۡۡ۟۫ۧ۟ۨۘ۫ۦۤۨۦۗ۬ۡۥۦۡ۠ۦۘ۬ۦۙۡ۟ۚ۫ۙۤۦۤۖۘۗۘۘۘ" : "ۦ۠۬ۦ۟۬۬۬۬۠۟ۤ۬ۢ۫۫ۧۖۘۧۧۦ۟ۙ۟ۙۦۦۘۨۛۦۘ۫ۛۤۤۙۧ۟ۨۧۥۦۛۦۤ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1018951985:
                                                                str24 = "۟۬ۨۗۨۧ۠ۤۙۥ۟ۨۘ۫ۥۦ۫ۦ۬ۨۨ۬ۗۨۥ۬ۤۨۘۘۡۧۘۢۥۨۥۚ۬ۥۧۡۘ۟ۙۖ۟ۙۘۛ۠۫ۖۘۧۘۛ۬ۛ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case -821110150:
                                        str8 = null;
                                        str17 = "ۚۖۨۙۨۤۥۘۦۢۦۧۗۘۜۘ۫ۚۚۧۥ۬ۤۗۨۘ۟ۙۡۦ۟ۖ۬ۥۢۚۘۨۨۢۥۙۖۚۨ۬۬";
                                        break;
                                    case -820682056:
                                        str13 = c0332o14.f1723;
                                        str17 = "۫ۘ۟۠ۖۥ۫۟ۥۘۙۘۚۙۡۖۘۚۗۥۜۦۨۦۥۘ۠ۥۧۘۨۘۢ۫ۗ۟۫ۢۘۘۚۦۨۦۚۚۢۘ۠ۨ۠ۖۘۛۥۘۙۢۡۘۥ۫ۚ۬ۗۧۛۚ۟ۛۖۡ۫ۘۘۦۦ۬";
                                        break;
                                    case -809698330:
                                        int i7 = C0330o.f1000;
                                        str17 = "ۚۧۧۡۤۢۨۗۢۦۡۜۘ۬۟ۢۤ۫ۙۜ۫ۜ۠ۛۨۘۧۨۘ۠ۘۙۧۗۡۘۡۨۦۘ۟ۚۦۘۤۥۦۘۤ۬ۗ۫ۖ۠۬ۢۢۨۦۨۙۛۦۘ۬ۨ۠ۤ۬ۤ۫ۢۦۦۤۖۘۜ۫ۙ";
                                        break;
                                    case -796298144:
                                        str17 = "ۗۢۤۢۖۖۘۢۧۘۘۢ۟ۚۨۦۜ۠ۡ۬ۖۜۘۡۙ۠ۡۨۢۜۚ۬ۥ۠ۖۜۙۡۘۛ۠ۘۘۥ۬ۜۘۤۥۛۜۗۙ۠ۨۘۦۙۗ";
                                        str12 = str5;
                                        break;
                                    case -770041575:
                                        C0237h4.m865(str14);
                                        str17 = "ۨۚۡۘۥۥۨۘۢۧۨۘ۬ۦۖۢۖۧۘۤۦۧۘۢۖ۬ۥ۠۬۬ۦۜۘۨ۟۟ۧۖۚۧۜۗ۠ۦ۫۬ۖۨۘۥۗۥ";
                                        break;
                                    case -769501765:
                                        str9 = c0332o122.f1717;
                                        str17 = "۫ۡ۠۠ۚۖۙۢۘۜۖۥۘۛۖۤۨۧ۬ۛۡ۫ۖۢۜ۫۠ۢۚۤۖۘ۫ۘۧۘۧۦۨۘ۟ۧۘۘ۫ۥۘۥۥۤۡۜۖۘ۬ۦۨۘۗ۠ۗۤۙۛۖۢۢۨۙۧ۠ۜ۟ۚۡۥۗۡۗۚۦۧۘۥۘۧۢۛ۬";
                                        break;
                                    case -677506853:
                                        str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                        str10 = str9;
                                        break;
                                    case -608322675:
                                        c0332o13 = c0336o53.f1008;
                                        str17 = "ۙۧۧ۟ۚ۫ۚۡ۠ۖۤۙ۟ۙۡۚۢ۬ۧۘۘ۟ۙۨۥۥۨۘۖۜۘۘ۬ۡۙۡۙۙۖ۠۟ۢۥۥۘ۟ۗۖۡۛۘۘۥۜۦۨۙ۫۬ۜۘۙۖۜ۠۫ۥۡۧۥۘ۬ۢۖۨۛۘۘ";
                                        break;
                                    case -599498489:
                                        C0237h4.m865(str16);
                                        str17 = "ۢۡۙۚۗۧۤۖۢۚۤۥ۠ۢۖۜۚۨۘ۠ۧۜۢۢۡۛۨۘۦۜۧۥۨۖۘۙۡ۟ۘۥۚۧۧ۠ۚۚ۠۬ۤۘ۬ۙ۫ۥۦۛۖ۬۬ۡۜۙۙۢۛۧۚ۟۫ۨۧۘۖۢۡۢۨۘ۬۟ۜۤ۫ۗ";
                                        break;
                                    case -520634394:
                                        int i8 = C0330o.f1000;
                                        str17 = "۫ۙۗ۟۠ۧۥۗ۬۟ۛۘۘۦ۫ۘ۫ۘ۬ۙ۬ۖۘۚۧ۬۠ۗۥۦۡۘ۟ۛۥۘۡ۬ۦ۫ۧۖۚ۬ۚ۠ۜۡ۠۠ۨۦۖۜ۬۫ۨۧۥۘۤ۟ۗ۟ۘۘ";
                                        break;
                                    case -385682546:
                                        str5 = null;
                                        str17 = "ۗۡۜۜۘۛۢۢ۫۫ۢ۟ۛۗ۟ۖۢۦۘۧ۠۬ۗۘ۟ۛۜۚ۠ۥۗۖۛ۠ۤۧۙ۠ۚۡۖۜ۠ۨ۟ۗۜۗ۬۬ۥۘۙۘۨۡ۟ۦۜۗۛۥۗ";
                                        break;
                                    case -360761663:
                                        str6 = null;
                                        str17 = "ۢۖۡ۬ۨ۫ۛ۠۬۫ۢۙۜۜۘۚۢۡ۫ۘۥۘ۬ۧۘۘۖۤۨۘ۠۠ۗۦۧۦۨۛۨ۠ۖۨ۫ۢۖۨ۫ۥۘۛۗۖۥۡۧۥۘۘۜۧ۟ۖ۠ۖۘۚۨۗۨۚۘۘۧۢۛۘۨۘOۛۖۜۘۦۡۡ";
                                        break;
                                    case -269330834:
                                        C0286kb c0286kb5 = MainActivity.f1289;
                                        str17 = "۫۫ۘۘۡۛۜۘۘۛۜۛ۬ۖۘۥۢ۫ۡۧۙۗۧۡۘۢۗۢ۫ۙۖۘ۟ۨۡۘ۬ۥۧۘۨۚۢ۬ۦۜۘۡۨۛۖۨۤۥۧۨ۬ۘۖۘ۠ۖۨۘ";
                                        break;
                                    case -91938708:
                                        switch (i6) {
                                            case 0:
                                                str17 = "ۥ۠ۡ۬ۚۖۘ۬ۤۘۧۥۘۘۙۚۨ۬ۘۘۨۧ۬ۦ۫۫ۧۜۗۖۧ۟ۡۧۧۢۧۡۡ۫ۜۨۘۖۖۥۜۥۗۧۗۜۘۚۗۗ";
                                                break;
                                            case 1:
                                                str17 = "ۜۨۥۘۡۘۨۘۗۘۢۛۘ۠۫ۖ۬ۘۛۨۘ۬ۖۦۘ۬ۜۙ۫۠ۖۘۡۢۦۧۘۧۤ۫ۜۘۨ۟ۢۙۢۢۛ۫ۙۧ۟ۨۘۗۗۨۛۜۨ";
                                                break;
                                            case 2:
                                                str17 = "ۚۦۨۨۢۗۚۢۛۖۡ۟ۛۛۨۧۦۦۘۧۤۦۗۡۡۙۡۜۘ۟۟ۛۡ۫ۜۘۤۘۧۨ۠ۥۨۛۚ۬ۖ";
                                                break;
                                            default:
                                                str17 = "ۢ۫ۨۙۢ۟ۘۙۘ۬ۗۥۚ۬ۡۘ۠۫ۖۘۙۖۢ۬ۙۡۘۗۡۢۘ۟ۦۢۜۦۖۨۜۧۦۨۘۥۥۧۢۛۙ۠ۖۘۛ۟ۖۦۜ";
                                                break;
                                        }
                                        break;
                                    case 156129331:
                                        str17 = "ۢ۬۟ۧ۫ۗۡ۬ۨۘۦۧۤ۬۫ۗۙۚۖۛۧ۟ۙ۫ۖۚۥ۫ۤۗ۠۬ۙ۫ۖۨ۠ۧۘۙۦۡۤۢۥۘ";
                                        str10 = str8;
                                        break;
                                    case 225955315:
                                        c0332o14 = c0336o54.f1008;
                                        str17 = "ۧۗۜۘۦۨۘۖۗ۫ۗۙۘۘۢۖۧۘۡۨۜۛۜۡۘۥۨۧۖۛۚۡۛۜۜۘۨۢۤۙۙۗۚۘۜ۫ۢۗ۫۠ۜۥۘ۠ۙۛۤۨۘۘۧۖۨ۠ۢۜۗۙۦۚۙۢ۠۠ۤ۟ۗۤ";
                                        break;
                                    case 275824491:
                                    case 783311659:
                                    case 1340027351:
                                    case 1678782081:
                                        return;
                                    case 366225306:
                                        str17 = "ۜۡۡۘۚۜۖ۠۫ۢ۫ۚۢۚۨۗۜ۬۫ۡۨۛۥ۟۟۬ۙۗۡۗۖۢۤۦ۟ۛۥۘۨۨۜۘۤ۟ۗۖۨۡۘۘۦۜۘۦۢ۟ۗۜۙ";
                                        break;
                                    case 583592890:
                                        int i9 = C0330o.f1000;
                                        str17 = "۬ۗۤۚۨۛۦۜ۫۠ۛۤ۟ۙۘۘ۠ۜ۫ۗۡۚۚۤۡۘۜۥۧۘۢۛۘ۠ۥ۟ۥۛ۠ۛۘۨۗۥۘۗۜۖۘۤ۟ۖۘ۠ۨۧۘۥۗۡ";
                                        break;
                                    case 595212816:
                                        C0237h4.m1090("$mainTip", c0336o53);
                                        str17 = "۬ۙۦ۬ۚۥۘۡۘۥۘۧ۬ۥ۬۟ۥۛۖۙۦۚ۬ۥۖ۬ۛۗۛۥۢ۬ۜۦۥۖۦۧۜۖ۬ۛ۬ۥۙۚۡۘۢ۫ۨۦۢ۟۠ۚۡۗۢۛ۫ۤۚۧۨۘۚۥۦ۟ۥۘۙۙ۠";
                                        break;
                                    case 603348436:
                                        C0237h4.m1090("$mainTip", c0336o54);
                                        str17 = "ۘۖۨۦۖۧۘۛۧۜۜۘۧۘۙۖۡۘۤۗۥۚۖۥۘۧۥۘۦ۬ۛ۬ۥۡۘۤ۫۟۫ۙۡۚۘۡۛۚۤۢۤۗ۠ۢۜۡۜۨۙۜۘۨۦۦۘۧۙۧۘۗۘۖۚۤۥۘۘۗۥ۠";
                                        break;
                                    case 625864105:
                                        C0286kb c0286kb6 = MainActivity.f1289;
                                        str17 = "۫ۥۙۡۨۜۤ۠ۜۘۙۦۦ۫ۧۖ۟ۜۧۘۢ۠ۨۘۖۨۨۘۗۤۥۘۡ۟ۥۖ۠ۗۗ۠ۗۘۡۦۢۦۧۥۘۧۖۦ۟۬۟۠ۚۜ۬ۨۧۛۙۖۖۚۛۛ";
                                        break;
                                    case 748969091:
                                        str17 = "ۘۤۛۢۢۡۘ۠ۜۥۘۥۚ۟ۧ۬ۖۧۖۘۖۧۨۘۨ۬ۜ۠ۥۘۦۨ۟ۖۙۜۘۢۦۦۧۧۜۘۙۦۢۧ۬ۨۨۡۘۡ۟ۡۢۚ۫ۥۜۨۘۗ۫ۧۤۦ۠۫۠ۗۦۦۥۘۨۘۖۜ۬ۥۘۜۜۜۘ۫ۙۛ";
                                        break;
                                    case 929513715:
                                        C0330o.m1170(str16);
                                        str17 = "ۤۨ۬ۢۚ۫۬ۤۖ۟ۢ۫ۧۦۘۧ۬۠ۨۜۧۧۚۢۡۖۘۜۗۡۥ۬ۦۘۜ۫۬۬ۜۙۤۤۖۘۛ۫ۧۛۤۛۙۗۧۜۧۤ۬ۢ۟ۤۨۘۘۜ۟ۦ";
                                        break;
                                    case 974053466:
                                        c0336o55 = this.f875;
                                        str17 = "ۜۘ۫ۢۥ۫ۨۙۙ۠ۗۖۘۘ۠ۦۥ۫ۖۥۢۧ۟ۥ۫ۘۡۨۘۗ۫۫ۨۦۥ۬ۛۡۘۗۡۘۘ۠ۦۨۘۥۥۛۜۥۖۘۗۢۖۖۙ۟ۙۜۖۘۖ۟ۤۦۘۡۖۖۦۚۡۦۘۜۡۚ۟ۛۖ۬۟ۘۘۡۖ۫";
                                        break;
                                    case 994974833:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "ۦۡۤۛۛۢۧۧۗ۬ۦۖۘۗۜۘۘۖۥۖۘۖۧۥۘۧۙۜۘۚۤۨۘۜۗۥ۠ۘۥۘۛۤۛۙ۟ۖۚۜۡ۟ۤۖۘۚۖۡ۫۫ۘۘۜۛۖۘۛۗ۬ۦۖۗۖۗۨۧۢۤۢۗۦۘ۬ۙۜ";
                                        break;
                                    case 1054170174:
                                        C0237h4.m1090("$mainTip", c0336o55);
                                        str17 = "۟ۧۛۨ۠ۤ۬ۗۡۚ۠۠ۙۡۘۜ۠۠ۥۗۥۘۡۖۥۘۘۡۦۘۦۤۥۘۨۙۛۚۜۜ۟ۦۘۢۢۙۙۖۘۧ۟ۦۥۖ۬ۡۦۖ۠ۤۖ۠ۜ۬ۖۨۜ";
                                        break;
                                    case 1285812657:
                                        i6 = this.f874;
                                        str17 = "ۛۤۙۨ۟۠ۖۥۡۖۡۢۛۡۧۥۙ۫ۘۘۧۜۛ۬ۦۧۘ۫۫ۙۜ۠ۥۘۨۘۖۤۥۦۤۜۛ۟ۛ۠ۥۚۗ۠ۖۢۙۚۡۘ۫ۨۗۢۤ۫ۗۚۧۥۥۤۙۛۡۤ۠ۘ";
                                        break;
                                    case 1353876195:
                                        String str27 = "ۦ۬ۡۤۥۖۚۙۘ۬ۦۦۘۙۥۡ۠ۛۨۖۜ۟ۖۢۥۘ۠ۜۡۦۧۘۜۧۖۘۤۥۥۡۗۜۨ۟ۡۗۙۗ";
                                        while (true) {
                                            switch (str27.hashCode() ^ (-539259595)) {
                                                case -1875564994:
                                                    str17 = "ۧۖۡۦۡۘ۬ۖۢۘۦۡ۟ۢۛۗۤۜۘۦۘۧ۫ۚۛۚۤۜۤۜۘ۟ۨۖ۬۠ۢۡۖۢ۠ۗۜۘۙ۠۠ۡۢۢ۫ۡ۫۟ۖۖۘۧۛ۠ۢ۟۬۫ۘ";
                                                    continue;
                                                case 667432776:
                                                    str27 = "ۡۛۘۘۤۛۦۦۖۖ۟ۙۜۘۤۜۥۘۡۧۘۘۘۜۛۢ۠ۦۗۨۘۘۥۡۜ۠۟ۦۘۨۦ۠ۤۛ۬ۛۤۡ۬ۙۚۘ۫ۡ۬ۤۜۘۦۜۦۘ";
                                                    break;
                                                case 1767964991:
                                                    str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                                    continue;
                                                case 2056888340:
                                                    String str28 = "۟ۢۜ۠ۙۥۘۜۤۖۘ۠۫ۨۘۙۥۨۘ۟ۥ۟۫ۜۤۗۤۨۘۖۤۡۘ۫ۥۙ۟۬ۡۘۖۜۛۦ۠ۨ۠ۦۡۛۦۖۛۢۧۥۧۚۚ۫۬ۛۛۚ۠ۚۥ۬ۡۧۖۚۤۚ۟۟ۜۙ۟۟ۛۚۘۗ۟ۛۢۘ";
                                                    while (true) {
                                                        switch (str28.hashCode() ^ (-1711662654)) {
                                                            case -1572277747:
                                                                String str29 = "ۦۛۙۢۚ۠ۤ۫ۧۨ۠۫ۨۡۦۘۧۘ۫ۤۜ۠۫ۜۦۤۡ۬ۚ۬ۡۦۙۧۡۨ۟ۜۡۨۘۥۚۨۚۚۖۘ۬ۧۘۙۧۤۤۥۗ۠ۨۦ۬ۜۤ۠ۖۘ";
                                                                while (true) {
                                                                    switch (str29.hashCode() ^ (-730203158)) {
                                                                        case -2016148936:
                                                                            str28 = "ۧ۬ۨۘۗۗۥۘۢۙۤۗ۬ۧ۠ۜۚۛۛ۬ۗۡۥۘۖۜۜۘۥۙۜۘۨۖۧۤۥ۫ۜ۬ۛۥۡۡۘۘۢۖۤۜۚ";
                                                                            break;
                                                                        case -8051377:
                                                                            str29 = "ۗۜۧۚۗۗۗۛۥۙۨۢۦ۫ۘۘۖۙۨۘ۠۟۠ۗ۠ۘۘۥۙۡ۟۫ۘۥۥۜۘۘۛۗۜۦۥۖۨۘۤ۠۫۟ۨ۫۫۠ۖۛۨۘۘۖۗۦۘۖ۠۬ۙۡۗۡۧۜ۠ۖۡۘۛ۠ۘۘۜۚ۫۫ۦۖۘۢۜۡ";
                                                                            break;
                                                                        case 357980236:
                                                                            str28 = "ۦۙ۫ۦۥۚۤۢۡۘۤ۠ۡ۫ۛۛۛۡۘۘۥۗۢۙ۠ۦۖۡ۬ۚۨۨۘۢۘۜۘۚ۠ۜۘۡۖۛۛۗۜۘۗ۟۬ۥۨۡۘ۠۬ۨۙۘ۟ۥۥۨۨۦۡ۫ۨۨۤ۟ۚ۟ۧۘۜۛۡۘ";
                                                                            break;
                                                                        case 987953900:
                                                                            str29 = c0332o14 != null ? "ۚۤۚ۫ۗ۬۠۠ۢ۫ۡۢ۬ۘۗ۬ۘۘۥۤۥۘۧۘۥۘۜ۫ۦۖۚ۬۠ۙۖۘۧۦۨۘۜۘۗۙ۠ۘ۫ۖۘۧۤۘۘۡ۬ۖۘۢۖۜۘۚۗۖ۠ۤۗۗ۟۬" : "ۡۦۦۗۨۤ۟۫ۚۘۗۧ۟ۗۥۨۤ۟ۨۗۡۚۤ۬ۚ۠ۛۡۖۘ۟ۙۡۛۤۜۘۨ۫ۚۦ۬ۥۙۧ۬ۢۗۥۜۧۘ۫ۡ۫ۘۘۘۧ۫۠";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 2956209:
                                                                str28 = "۠ۛۡۘۢۨۥۦۦۤ۟ۥۚۧۜۘۥۛۡۘۚ۬ۡۖۤۖۘۖ۫ۨ۫ۖۤۦۢۗۨۦۢۜۢ۟ۛۦۘۢۗۗۖ۠ۨۜۛ۬ۜۛ۠ۨۦۗۡ۠ۥۘۘۚۤ";
                                                                break;
                                                            case 466636123:
                                                                str27 = "۫ۛۜۘ۠ۤ۟ۤۧۙ۬۟ۗۤۛ۫ۗۦۤ۟ۥۡۘۦۜۘۢۢۥۘ۠ۛ۟۬ۗۧۦۢۛۥۚ۬ۤۗ۟ۚۗۜۘ۬ۦۜۘۚۨۗۗۙۤ";
                                                                break;
                                                            case 1092978740:
                                                                str27 = "۠ۖ۬ۥ۠ۙۨۙۗۖ۠ۜۘ۟ۗۖۗۡۘۡ۠ۗۚۨ۫۬ۙۘۘ۫ۘ۟ۢۚۜۗۧۡۡ۫ۤۨ۬ۥ۟ۢۖۘ۫۟۠۬ۜۡۗۦ۠۬ۢۖۘۚۚ۟ۨ۟ۨۦۖۥۙۗۘۘۙۗۗۨۢۖ۠ۢۨۡۨۥ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1490954571:
                                        str7 = null;
                                        str17 = "ۢ۠ۡۘۧ۟ۨۘ۟ۛ۠۟ۡۜۦۜۦۘۨۧۛۨۡۦۢ۠ۨۘۖ۠۠۬ۙۢۦۨۖۘۖ۠ۥۖ۠۟ۦ۬ۜۘۤۢۥۘۘۜۢ۬ۦۢۘ۬ۥۗۨۥۘۘۨ۬۫ۦ۫";
                                        break;
                                    case 1567174269:
                                        str17 = "ۜۙ۫ۘۤۧۦۚ۫ۨۛۡۦۡۛۧۜۘ۬ۡۜۘۥۖۧۤۡ۬ۗۧۙ۟ۤۖۡۨۢ۠ۖۛۧ۫ۦۘۖۤۘۜ۟۠ۧ۬ۥۦۨۗ";
                                        str16 = str7;
                                        break;
                                    case 1658023366:
                                        int i10 = C0330o.f1000;
                                        str17 = "ۛۥ۟ۨۢۛ۬ۖۖۧۨۧۘ۫۬ۗ۟ۧۛۡۤۙۥ۬۟ۤۢۜۧۗۙ۫ۖ۬ۥۗۢ۫ۧ۬ۖ۫ۨۛ۫ۖ۟ۗۚۖۗۙۗۧۨۡۘ۟ۡۘۘ۟";
                                        break;
                                    case 1681125014:
                                        C0237h4.m865(str10);
                                        str17 = "ۨۢۥ۬۠ۜۘۘۚۚۦۘۦۨۚۖۘۗۤۘۢۜۤۗۜۡۘۧۚۖۥۜۨۘۨ۟ۢۧۖۜۘۛ۟۟ۧ۠ۘۛۛۘ";
                                        break;
                                    case 1731513016:
                                        c0332o122 = c0336o52.f1008;
                                        str17 = "ۧ۟۫ۗۢ۠ۖۧۤ۠ۗۖۗۢۙۧ۫۠ۙۙ۟ۚۛۗۥۧۜۡۧۘۜ۠۠۫۬۠ۥ۟ۨۘۖۦۦۚۨۨۘ";
                                        break;
                                    case 1752004423:
                                        str15 = c0332o15.f1717;
                                        str17 = "۟۬ۨۡۗ۫ۦۢۨ۠ۗ۬ۦۥۥۡۢ۠۬ۗۨۘۥۡۨۘۛ۬ۖۘۥۗۡۘۡۢ۬ۥۚۤۨۚ۠۠ۗ۠۟۬ۘ۟۠۠ۘۦۘۦ";
                                        break;
                                    case 2049773532:
                                        str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                        str14 = str13;
                                        break;
                                    case 2064801264:
                                        C0330o.m1167(str12);
                                        str17 = "ۤ۠ۗ۫ۗ۬ۥ۬ۤۚۜ۫ۦۡۖۢۜۥ۟ۜۢۙۚ۬ۘۨۖۘۧ۟ۚۖۧ۬۫۫ۨۘۡۥۖۛۜۥ۫ۤۖ۟ۨۗۥ۟ۛ۠ۙۛۗۡۥۢۥۢۗ۟ۡۘۦۧ۠ۡۘ۟ۦۦۘۤۗ۫۫ۖۧۘ۟ۨۡۘ";
                                        break;
                                }
                            }
                        }
                    });
                    textView6.setOnClickListener(new View.OnClickListener(c0336o5, i2) { // from class: ۟.j5

                        /* JADX INFO: renamed from: ۥ */
                        public final int f874;

                        /* JADX INFO: renamed from: ۥ۟ */
                        public final C0336o5 f875;

                        {
                            this.f874 = i2;
                            this.f875 = c0336o5;
                        }

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            int i6 = 0;
                            String str5 = null;
                            String str6 = null;
                            String str7 = null;
                            String str8 = null;
                            C0336o5 c0336o52 = null;
                            C0332o1 c0332o122 = null;
                            String str9 = null;
                            String str10 = null;
                            C0336o5 c0336o53 = null;
                            C0332o1 c0332o13 = null;
                            String str11 = null;
                            String str12 = null;
                            C0336o5 c0336o54 = null;
                            C0332o1 c0332o14 = null;
                            String str13 = null;
                            String str14 = null;
                            C0336o5 c0336o55 = null;
                            C0332o1 c0332o15 = null;
                            String str15 = null;
                            String str16 = null;
                            String str17 = "ۜۨۙۨۚۜۘۘ۬ۤۥۗۗۙ۫ۜۨۨۨۘ۫ۨۜۘ۟ۙ۟ۘۚ۬ۢۧۨۘۘۧ۫ۘۚۜۘۤۡۡۘ۬ۨۘ۬ۚۧۜۘۚۙۙۢۨۥۚ";
                            while (true) {
                                switch ((((((((str17.hashCode() ^ 937) ^ 416) ^ 550) ^ 440) ^ 297) ^ 920) ^ 0) ^ (-193156567)) {
                                    case -1976897249:
                                        String str18 = "ۨۖ۠ۤۨ۟ۜۡۘۘ۠ۛ۟۟ۦۡ۫ۧۛۢۨۙۢۜۘۤۖ۟۬۬ۙۤۘۛۢۙۖۘۛۗۡۨۨۥ۠ۜۥۘۢۗۚۨۚۥۢ";
                                        while (true) {
                                            switch (str18.hashCode() ^ (-1657001700)) {
                                                case -1542852949:
                                                    String str19 = "ۚۘۨۡۦۥۘۡۜۤۥۖۤۦۚۚۜ۫ۥۘ۟ۚۢۡۚۡۘ۟ۜۢۧۗۛۧۘ۫۟ۙۨ۠ۦۥۚۙۙ۫۫ۙ۟ۡ۬ۢۦۗۦۜۘۘ۠ۥۘۗۖۛۢ۫";
                                                    while (true) {
                                                        switch (str19.hashCode() ^ 114193177) {
                                                            case -1654208069:
                                                                str19 = "ۤۧۜۘۜۜۜۖ۠۠ۖۨۢۢۧ۫ۛ۬ۜۘ۠ۚ۟ۘۦۘۢۛ۫ۗۥۘۘۧ۫ۘۘۙۜۚۤۢ۬ۗۦۚۡۘۘۘۖۘۗ۠ۤۜ۫۠ۗۖۜۡۢۚۦۧ";
                                                                break;
                                                            case -824909501:
                                                                String str20 = "ۦۛۛۡۙۜ۠ۤۥۚۢۥۛۚۢۙۖ۟ۤۡ۬ۗۥۦۘۛۨۘۛۙۜۨۙۦۨۚ۟ۖۨ۠ۤ۬ۡۘۧۚۨۘ۬ۥۨ۫۫۫ۨۗۙ";
                                                                while (true) {
                                                                    switch (str20.hashCode() ^ 164210155) {
                                                                        case -527667276:
                                                                            str20 = c0332o13 != null ? "ۙۤۤۧۖۙۗ۟۠۬ۤۨۥۜۛۦ۠۫ۥۨۥۙۘ۫ۧ۫ۘۦۨۘۙ۬ۧۘۜۤۖ۬ۚۗۡۧۚۡۡۘۙۚۢ۬۬ۡۘۤ۟ۚۛۖۥۘۡۛۧۡۙۘۤۚ۟ۛۙۡۘۜۦۡ" : "۟ۧۧۦۥۘۡۘۗۜۜۘۗ۬۬ۢۧۜۖۖۢۨۨۘ۠ۖۘۘۗۗۡ۬ۛۡۗۜۡ۟ۨۦۘۗۛۚ۫ۚ۬ۛۤۙۤۧ۠ۙ۟ۙ";
                                                                            break;
                                                                        case 930427964:
                                                                            str19 = "ۦۤۖۘۖۦۨۖۚۘۡۧۙۡ۬ۤۧ۬ۤۗ۟ۢۡۛۢۧۦۘۘ۟۠ۚۖۡۘۗۨۖۘۥۚۛۜۧۘۥ۟ۜۘ۠ۛ۠ۙۖۘۛ۬ۢ۠ۘۢۙۛۚۡۡ۬ۙۘۖۘۢۡۡۙ۬۟ۚۢ۬ۚ۫۠ۧۤ";
                                                                            break;
                                                                        case 1310252649:
                                                                            str19 = "ۛۘۥۙۖ۫ۢۖ۟۟ۢۥۘۥۡۦۖ۬ۖ۫ۜۧۨۛ۬۠ۤۦۖۖۛۥۦۘۨۤ۟ۚۛۧۛۤۖۘۧۦۙ";
                                                                            break;
                                                                        case 1964778413:
                                                                            str20 = "۠ۨۡۙ۬ۘۤۦۜۘۤ۠ۦۥۦۨۦ۫ۡ۫ۢ۠ۥۢۨ۠ۧ۠ۘۧۥۜ۠ۥ۫ۨۘۙ۫ۦۙ۬ۚۦۢ۟";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -423824707:
                                                                str18 = "ۡۗۘۦۖۗ۫ۘۦۘۨۚۨۘۢۛۨ۬ۢۖۢۜۘۢۧ۠۠ۛۡۦۧۖ۬ۘۜۗۥۘۚۗۤۗۦۖۘۙۘۜ۟ۢۨ۫ۥۦۘ۟ۥ۟";
                                                                break;
                                                            case 982425732:
                                                                str18 = "ۦۨ۫ۜۤۘۘ۫۠ۚ۠۫ۖ۫۠ۜۥۦۦۖۗۥۘۜۘۖۘۢۚۘۡۥۨۖۧۗۨۧۗۜۤ۬ۢۙۘ۬۟۬ۗۦۥۘۚۚۢۜۖۡۘ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case 526286094:
                                                    str18 = "ۜۖۖۘۚۗ۬ۛۛۖۗ۟ۥۢۛۛۖۧ۠ۖۤۡۘۚۥۗۡ۫ۖ۫ۖۤۗۛۡۘۡ۫ۡۘۨ۫ۜۘۢۧ۟ۛ۠ۨ";
                                                    break;
                                                case 653886550:
                                                    str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                                    continue;
                                                case 871669741:
                                                    str17 = "ۖۥۥۘۛۨۨۘ۬ۜۨۖ۟ۖ۠ۛۘۘۜۥ۟ۜۙۦۘۗۨۘۘ۫ۛۨۘ۬ۘۗۗۗۗۘۙۙۥۚۜۗۧۗۦۡۙۤۡۥۖۙ۫ۦۙۜۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1958056289:
                                        c0336o54 = this.f875;
                                        str17 = "ۜ۟ۗۙۖۡۘۧۡ۟ۤۧۚۦۨ۫ۦۦۦۘۨۡۡۘ۬ۤۗۛۙۘۚۛۘۘۦۘ۫ۧۧ۫ۦ۠ۙ۫ۨۘۥۡۘ";
                                        break;
                                    case -1917108434:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "۟ۛ۠ۚۡۖۖ۠ۡۘۥۢۛۖۥۘ۬ۢۢۘۗۤۤۜۖۧۗۨۦۖۦۘۙۡۙۧۚۙۚۗۧۥۚ۫ۙۡۨۖ۟ۦۘۗۢۗۗۛۨۘۤۧ۫ۛۛۘۥۢۜۘۗ۫ۛۢۙۨۘۡ۠ۖ";
                                        break;
                                    case -1788180115:
                                        str17 = "۬ۨۗۢ۠ۘۘۜۚۘۘۜۜۘۥۢۘۘ۫ۧ۠ۥ۟ۡۗۙۘۘۚۡۢۢ۬۟۫ۙۦۘۖۙۗۢۡۨۘۢۧۥۚۜۜۘۙۤۥۘۢ۟۟۟۫ۥ۫۫ۘۘۢۛۡ۟۫ۜۘ۠۬ۖ۬۫ۨۘۖ۟ۥۘ";
                                        str12 = str11;
                                        break;
                                    case -1777849339:
                                        str17 = "ۜ۠ۧۧۡ۟ۗۘۥۚۢۜۘۙۛۦۘۗۤۗ۫ۡۥ۫۫ۧۡۤۥۘۦۡ۠ۧۡۜۨۨۨۘۗۢۚۤۙۚۖ۬ۧۖۧۙۡۚۨۥۛۙ";
                                        str14 = str6;
                                        break;
                                    case -1542759203:
                                        C0237h4.m865(str12);
                                        str17 = "۟ۖۤۦۤۘۘ۠۫ۗۗۙۘۗۤ۫ۡ۠ۦۢۧۡ۬ۘ۠۠ۦ۬ۨۙۥۨۢۖ۫ۧۚۘۖۘۦۧۜۨۖۧۘۗۨۗۥ۠ۚۛۘۛ";
                                        break;
                                    case -1484789383:
                                        c0336o53 = this.f875;
                                        str17 = "ۚ۠ۦۘۨۨ۟ۚۢ۠ۨۙۡۘۤۖۘۘۛۚ۬۟۠ۧۖۘۖۖۦۘۦۦۥۘۧۜ۠۫ۧ۬ۘۤۥۘۗۧۜۘۥ۟ۦ";
                                        break;
                                    case -1430289878:
                                        c0332o15 = c0336o55.f1008;
                                        str17 = "ۦۥ۫ۤۤۛۚۖ۬ۙ۫ۘۚ۠ۙۢۨۖۘۨۢۧۗۚۧۘۛۙۗۧۦۘۗۚ۠ۚۜۘۘۜ۟۠ۨۘۙۛۖۘۘۨۨۘۖ۫ۖۘۧۡۦۢۚۨ۠ۚۧۤۜۧۛۡۧۘۖۤۡ۬ۡۧۘۢ۠۫ۨۦۡۘ۬ۗۗ";
                                        break;
                                    case -1402821200:
                                        c0336o52 = this.f875;
                                        str17 = "ۤ۫ۖۘۗۛۦۖۖ۫ۛۧ۬۬ۥۨۜ۫ۢۡۢۢۖۖ۫ۤۘۨۗۢۨۧۗۧۤ۫ۥۦۙۙ۟ۧۛ۟ۢۢ";
                                        break;
                                    case -1341922224:
                                        String str21 = "ۖۡۙۥۘۘۥۚۧۧۘۧۘۤۘۥۘۘ۟۬ۙ۫ۢۦۘۙ۠ۥ۬ۘۘۙۡۖۤۧ۫ۗ۟ۘۨۘۨۙۚ۬ۜۜۘۗۧۜۧ۠ۖۚۢۨۖ۫ۨۘۖۢۡۜۨۘ";
                                        while (true) {
                                            switch (str21.hashCode() ^ (-551252153)) {
                                                case -1848917142:
                                                    String str22 = "۬ۤۛ۫ۖۜۨۘ۫ۦ۬ۗۖۧۡۘ۫۟ۘ۟ۗۘۨۙۤۖۙۖۢۜۘ۟ۨۡۚۤۜۘ۠ۥۧ۫۟۠۫ۗۘ";
                                                    while (true) {
                                                        switch (str22.hashCode() ^ 229539457) {
                                                            case -2047809925:
                                                                String str23 = "ۚۛۙۘۚۦۘ۬ۘۚۦ۠ۦۛۙۖ۬ۖۖۙ۫ۘۘۛۖۘۖۙۦۘۤۨۨۚۙۘۘۢۙۚۢ۟ۥۥۜۧۘۤۛۦۘۛ۠ۜ۬ۡۖۙۖۖۘ";
                                                                while (true) {
                                                                    switch (str23.hashCode() ^ 1882648421) {
                                                                        case -1342174619:
                                                                            str23 = c0332o122 != null ? "۬۟ۘۘۦ۠۫ۙۦۨۘۧۙۡۡۡۘ۠ۦۛ۬۠ۡۛ۟ۦۘ۠۠ۛۗۡ۟۟ۦۙۗۖۜۨۨۛ۠ۥۥۘ۬ۥۛۚۖۡۚۖۜۛۢۨ" : "ۤۙۚۖ۠ۡۦۥۘۡۚ۬ۗۨ۟ۨ۠ۖۛۡۘۤۜۤۦۧ۠۬ۛ۟ۧۘۢۦۖۢۤۘۧۘ۟ۤۨۘۦۖۘۙۜۥۢۘۥ۠۬ۤۚ۟ۦۘۘۥ۠۟ۤۦۘۙۨۢ۬۬ۜۘۖۙ۠ۧۗۦۘ۫ۥ۬ۢ۟ۥ";
                                                                            break;
                                                                        case -1005594639:
                                                                            str22 = "ۗ۟ۢ۟۠ۤۛۜۦۗۦۥۥۢۖۤۖ۬ۛ۬۬ۧۛۙۡۦۡۡ۬ۘۨۜۛ۟ۤۖ۬ۛۚۤۡۧۖۨۨۘۖۙۘۘۛۧۘۙۥۢۨۧۜۧۡۚۗۧ۬";
                                                                            break;
                                                                        case 818439621:
                                                                            str23 = "۫۫ۤۙۙۚۙۙۖۡۨۘ۟۠ۤۦۘۙۡۡۙۤۧۖۘ۟ۛ۠۬۬ۦۘۖۡۖۧۧۥۘۡۨۗۛۛۖۘۦۡ۠ۖۤۨۘۜ۟ۧۤۗۛ۠ۡۢۘۘۘۗ۠ۙۡۘۘۗۘۦۘ";
                                                                            break;
                                                                        case 1987400100:
                                                                            str22 = "ۢۨۙ۟۟ۘۘۚۧۗ۟ۖۘۘ۟ۖۘۛۚۨ۬ۚ۟ۜۨۡۘۢۜۗۦ۟ۘ۫ۢۤۚۥ۟ۢ۟۫ۗۙۢۡ۟ۨۗۜۖ۟۠ۥۘۨۚۡۘ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case -1875414390:
                                                                str21 = "ۖۗۜۘۢۖۙۛۡۜۥۥ۫ۖ۠۫۬ۖۗۡ۠ۘ۠ۨۜۘۗۘۜ۫ۛۙۤۗۖۘۚۘۚۘۛۡۘۧ۬ۨۘ۟ۘۘۢۗۗۖ۟ۦۘۘۤۛۦۛۖۚۢۨۨۗۨۘۢۜۘۢۖۦۥ۫";
                                                                break;
                                                            case -1586829220:
                                                                str22 = "ۡۢۛۤۛۛ۠ۙ۫۟ۨۨۘ۟ۛۘۘ۟ۤ۫ۘۨۚۛۦۗۥۡۡۥۧۦۛۜۚۚۨۗ۬ۧۤ۬۫ۨۗۘۡ۠ۚۙ۫ۥۘۗۜۡ۠ۦۛۖۗۛ۬ۦ۠";
                                                                break;
                                                            case -40669877:
                                                                str21 = "ۚ۟ۜ۟۟ۚ۟ۨۚۘۜ۠ۖۥۛۥۘۗۡ۫ۡۘۦۖۤۤ۟ۚۢۨۚۢ۫ۗۘ۠ۖۘ۠۠ۨۘ۫ۥۙ۬ۡۦ۠ۘ۠ۗۨۘۘ۠۠ۦۨۢۥۘۢۖۙۤۖ۟ۜ۫ۥۚۧۥۚۗۜ۬ۗۡۤۗۡۤۧ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                                case -1454025742:
                                                    str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                                    continue;
                                                case 678583481:
                                                    str21 = "ۙۦ۟ۦۡۘۘۖۥ۫ۨۤ۫ۘۛۥۘۗۨۨۦۙۨۚۛۦۘۙۜۗۥۧۜۨ۫ۚ۬۟ۜۙۖۘۨۢۢۨۧۘۤۖۖۡۚ۬ۦ۠ۘ۠ۖۛۘۡۡۡۥۛۦۛۘۘۖ۟ۜۡ۟ۦۗۨۛۖۜۙۦ۟ۗ";
                                                    break;
                                                case 2072360398:
                                                    str17 = "ۗ۠۟ۨۗۨۧۜ۠ۧ۫ۡۘۧۚۡۤۤۥۥۦۧ۠ۨۨۘ۠ۦۖۘ۠ۛۢۤۨۖۨۛۡۘۖۙۨ۠ۢۦۢ۟۟ۙ۬ۤۡۡۖۘۧۡۙ۠ۙۡۘۥۡۘ۬۫ۡۘ";
                                                    continue;
                                            }
                                        }
                                        break;
                                    case -1340151938:
                                        C0286kb c0286kb3 = MainActivity.f1289;
                                        str17 = "ۜۧ۫۬ۨۜۘۥ۟ۜۘۡ۠ۙۖۖۜۘۛۧۘۘۨۛۚۗۡۥۘۦۛۧۛۥۖۘۨ۟ۡۙ۬ۢۚۜۘۡۗۥ۫ۛۢۧۚۥۘۙ۫ۨۨۤۤۖۛۤ۫۟ۜۚ۫ۗ";
                                        break;
                                    case -1319014332:
                                        str17 = "ۜ۟ۦۦۛۜۙ۠ۦۖۦۘۗۜ۠ۘۘۥۨ۬ۘۘ۫ۙۡۚۤۢۦ۟ۜۘ۟ۘۡۘۘۢۚۦۛۢۨۛۛ۫ۜۨۘۧۘۛۛۘۥۡۦ۟";
                                        break;
                                    case -1278481967:
                                        C0330o.m1167(str14);
                                        str17 = "ۘ۬۠۟ۥۘۘ۟ۗۤۨۘ۟ۧ۟ۢۦ۫۫ۗۗ۬ۚۙۤ۬ۦۤۧۚۙ۫۠ۧۗۚۘۜ۟ۤۢ۫ۡۘ۫ۢۡۘ۫۫ۜۘۦۧۧ";
                                        break;
                                    case -1219436409:
                                        str11 = c0332o13.f1723;
                                        str17 = "ۨۦۙۤۡۢ۠ۧ۬ۘۛۡۘ۠ۛۘۖۛۘۜۧۖۘۦۤۘۘۗۗۦۧۢۚ۠ۡۙۛۢۦۘۖۥۙۥ۠ۨ۬ۘۧۘ";
                                        break;
                                    case -1064727507:
                                        C0330o.m1170(str10);
                                        str17 = "ۗۖۘۘۘۙۨۙۨۘۘۢ۟ۡۡۦۧۘۢۤۚۧۚۦۜۨۚۗ۬ۨۘۚ۫ۖۘ۬ۧۜۘ۠ۘ۬۫ۖۤۗۜۘ۫ۛۖۗۘۗۡۢۗۦۜۘۜۥۨۜ۟ۛۚۡۨۢۨۤۦۨۜۘۗۙۢ";
                                        break;
                                    case -1055073887:
                                        str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                        str16 = str15;
                                        break;
                                    case -1006430172:
                                        C0286kb c0286kb4 = MainActivity.f1289;
                                        str17 = "۟ۖۤۦۤۘۘۚۧۛۥۖۘۢۜۥ۬ۤۨۘۧ۠ۗۡۙ۠ۙۢۖۜۘۘۤۜۡۘ۟ۨ۟ۘۥۖۘۙ۠ۙۖ۫ۖۘۡۚۨۢۧۨۘۚۖ۬ۙۙۖۘۡ۠ۥۤ۫ۢۛۚۤۤۛۜ۠ۜ۫";
                                        break;
                                    case -901673525:
                                        C0237h4.m1090("$mainTip", c0336o52);
                                        str17 = "۠ۥۡۦ۫ۥ۬۠ۗۗۖۜۚ۟ۗۨ۫ۗۙۘۗۖ۬ۙۧۥۜۘۜۚۛۧ۠ۚ۬ۚ۫ۧۗۤۚۚۜۚۖۧۘ";
                                        break;
                                    case -883400274:
                                        String str24 = "ۧۚۥۘ۠ۦۥۘۧۧۢۥۘۡ۬ۘۢۖ۫ۚۛۥ۟ۤۥۚۨۧۜ۠ۜۧ۠ۢۥ۠ۥۖ۠ۖۧۢۘۘۨۤ";
                                        while (true) {
                                            switch (str24.hashCode() ^ (-1337738846)) {
                                                case -2041230381:
                                                    str17 = "ۙۥۥۘۖۙۘۘۥۧۨۧ۬ۨۘۖ۬ۥۘ۟۟ۖۘۖۧ۫ۗ۫ۡۘۚۢۘۘۛۛۛۖۖۧۗۛۧ۫ۙۥۚۦ۬ۧۙ۬ۢۛ۟۠ۗ۫ۚۖۦۧۤۧ۟ۜۖ۠ۨۘ";
                                                    continue;
                                                case -1619909312:
                                                    str24 = "ۜ۬ۗۢۜۖۘۥۦۛۢۜۖ۟ۛ۬ۤۤۜۚۜۥۘۧۥۦۖۡۖۘۛۦ۠ۢۚۙ۟ۦۘۦۗۚ۟ۙۖۥ۠ۘۗۙۥ۟ۢۖۘۨ۠۟۟ۖۥۘ۫ۖۤۙۡۦۘۤۨۦۘۤۙ۬۫ۛۦۘ";
                                                    break;
                                                case -159876017:
                                                    str17 = "ۦ۟۫ۨۤ۠ۥ۠ۤۙۜۥۘۜۨۧۘ۫ۛۚۨۚۢۦ۬ۜۡۢۚۜۤۡۜ۠ۖ۫ۥۜ۠ۢۖۚۜ۟ۥۦ۟ۖ۬ۛۧۙۢۢۨۘ";
                                                    continue;
                                                case 1207178405:
                                                    String str25 = "ۥۡۧۘۤۡ۟ۦ۟ۛۖۜ۬ۤۧۛ۫ۙۢۦۡۘۛۛۖۜۨۖۘ۠ۦۙۗۦۖۘۙۚ۠۬ۜۖۘ۫ۦۖۨ۬ۘۛۤ۬ۤۘۘ۬ۛۥۘۥۘۦۘۧۚۗ۟ۜ۟۟ۚۥۛۨۙۜۘۖۙ۟ۖۖۡۘۖۚۨ";
                                                    while (true) {
                                                        switch (str25.hashCode() ^ (-1641056421)) {
                                                            case -2000160485:
                                                                str25 = "ۤۢۡۥ۬ۢ۬ۡۘ۫ۡۢۦۙۡۘۚ۠ۘۚۧۥۘۖۤۧۖۧ۫ۖۖ۠ۘ۫۫ۚۡۘۨۨۘۘۖۢۨۧ۟ۧۗۗۡۘۡۚ۟ۡۥۘۘۤۨۥۘ۬ۤۖۘ۠ۛۛ";
                                                                break;
                                                            case -1715308133:
                                                                str24 = "ۛۡۧ۟۠ۥۜۦۘۘۘ۫ۜۘۗ۠ۦۚۨۨۖۚۨۤۙۧۗۜۧۚۢۤ۬۠ۛۖۦۜۨ۟۟ۥۤ۬ۖۡۥۥۡۙۨۧ۫ۥۚۘ۠۟ۡۙۙۘۥۙ۟۟۫۬ۚ۬ۛۦۦۥ۫ۘۜۚۥۘۘۥۙ";
                                                                break;
                                                            case 29356844:
                                                                String str26 = "۠۬ۚۗ۟ۦۘۚۤۦۗۨۖۘۛۚ۬ۗۤۥۦۡۜۘۢۛۦۘ۟ۦۖۘ۟ۛۧۜۡۥۘۙۜۖۘۤۜۙ۬ۜۗۜۥۘ۬ۖۡۘۗۛۧۢۧۧۙۢۖۖۧ۬ۦۛ۟ۧۡۗۡۛۜ۬ۡۛۦۢۦۘ۟ۨۥۘۚۛۡ";
                                                                while (true) {
                                                                    switch (str26.hashCode() ^ (-1241209605)) {
                                                                        case -2055825451:
                                                                            str25 = "ۧۦ۬ۥۗ۫ۤۨۢۧۘۜۘ۠ۙۘۘۥۘۜۘۤۗۘۦۜۨۤۜۡ۠ۜۥ۟۫ۜۘۚۤۜۛۤۨ۬ۙۦۖۜ۫ۖۖ۟ۖۖۘۗۘۧۘ";
                                                                            break;
                                                                        case -1953861585:
                                                                            str25 = "۫ۘ۫۬ۨۡۤۥۖۧۤۖۚۛۖ۠ۦۘۘ۫ۢۦۘۨ۬۠ۖۙ۟ۗۘۧۘۧۙۡۘ۫۬۬ۦۚۨۘ۠۟ۡۖۘۘۘۨۡۦۜۧۗۥۜۖ۬ۜ۬ۖۥۖۘۚ۟ۜۘۥۜۦۦۡۨۖۜۥ";
                                                                            break;
                                                                        case 29235425:
                                                                            str26 = "۫۟ۦۧ۫ۚۡ۫ۖۘ۫ۥۗۧ۠ۤۨۦۘۘۚۥۘۢۦۗۛۖۗۢ۫ۥۡۖۖۗۛۦۘۗۚۙ۫ۗۗۡۨ۟";
                                                                            break;
                                                                        case 1120936232:
                                                                            str26 = c0332o15 != null ? "ۥۖۙ۟ۧۖۘ۠ۢ۬ۢۦ۬ۦ۠ۥۥ۫ۡ۬ۡۖۧۜۨۘۧۗ۟ۜ۬ۨۘ۟ۥۦۤۤۢۧۤۡۘ۠۫ۨۢۙۡۡ۟۫ۧ۟ۨۘ۫ۦۤۨۦۗ۬ۡۥۦۡ۠ۦۘ۬ۦۙۡ۟ۚ۫ۙۤۦۤۖۘۗۘۘۘ" : "ۦ۠۬ۦ۟۬۬۬۬۠۟ۤ۬ۢ۫۫ۧۖۘۧۧۦ۟ۙ۟ۙۦۦۘۨۛۦۘ۫ۛۤۤۙۧ۟ۨۧۥۦۛۦۤ";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 1018951985:
                                                                str24 = "۟۬ۨۗۨۧ۠ۤۙۥ۟ۨۘ۫ۥۦ۫ۦ۬ۨۨ۬ۗۨۥ۬ۤۨۘۘۡۧۘۢۥۨۥۚ۬ۥۧۡۘ۟ۙۖ۟ۙۘۛ۠۫ۖۘۧۘۛ۬ۛ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case -821110150:
                                        str8 = null;
                                        str17 = "ۚۖۨۙۨۤۥۘۦۢۦۧۗۘۜۘ۫ۚۚۧۥ۬ۤۗۨۘ۟ۙۡۦ۟ۖ۬ۥۢۚۘۨۨۢۥۙۖۚۨ۬۬";
                                        break;
                                    case -820682056:
                                        str13 = c0332o14.f1723;
                                        str17 = "۫ۘ۟۠ۖۥ۫۟ۥۘۙۘۚۙۡۖۘۚۗۥۜۦۨۦۥۘ۠ۥۧۘۨۘۢ۫ۗ۟۫ۢۘۘۚۦۨۦۚۚۢۘ۠ۨ۠ۖۘۛۥۘۙۢۡۘۥ۫ۚ۬ۗۧۛۚ۟ۛۖۡ۫ۘۘۦۦ۬";
                                        break;
                                    case -809698330:
                                        int i7 = C0330o.f1000;
                                        str17 = "ۚۧۧۡۤۢۨۗۢۦۡۜۘ۬۟ۢۤ۫ۙۜ۫ۜ۠ۛۨۘۧۨۘ۠ۘۙۧۗۡۘۡۨۦۘ۟ۚۦۘۤۥۦۘۤ۬ۗ۫ۖ۠۬ۢۢۨۦۨۙۛۦۘ۬ۨ۠ۤ۬ۤ۫ۢۦۦۤۖۘۜ۫ۙ";
                                        break;
                                    case -796298144:
                                        str17 = "ۗۢۤۢۖۖۘۢۧۘۘۢ۟ۚۨۦۜ۠ۡ۬ۖۜۘۡۙ۠ۡۨۢۜۚ۬ۥ۠ۖۜۙۡۘۛ۠ۘۘۥ۬ۜۘۤۥۛۜۗۙ۠ۨۘۦۙۗ";
                                        str12 = str5;
                                        break;
                                    case -770041575:
                                        C0237h4.m865(str14);
                                        str17 = "ۨۚۡۘۥۥۨۘۢۧۨۘ۬ۦۖۢۖۧۘۤۦۧۘۢۖ۬ۥ۠۬۬ۦۜۘۨ۟۟ۧۖۚۧۜۗ۠ۦ۫۬ۖۨۘۥۗۥ";
                                        break;
                                    case -769501765:
                                        str9 = c0332o122.f1717;
                                        str17 = "۫ۡ۠۠ۚۖۙۢۘۜۖۥۘۛۖۤۨۧ۬ۛۡ۫ۖۢۜ۫۠ۢۚۤۖۘ۫ۘۧۘۧۦۨۘ۟ۧۘۘ۫ۥۘۥۥۤۡۜۖۘ۬ۦۨۘۗ۠ۗۤۙۛۖۢۢۨۙۧ۠ۜ۟ۚۡۥۗۡۗۚۦۧۘۥۘۧۢۛ۬";
                                        break;
                                    case -677506853:
                                        str17 = "ۡۛۨۘۘۚۥۘ۫ۤۖۢۦ۬ۥۧۦۦۖۖۨ۫ۥۨۛ۟ۗ۬۟۬ۦۗۙۛۘۘۖۤۤۛۥۙۚۗۦۘۡۧ";
                                        str10 = str9;
                                        break;
                                    case -608322675:
                                        c0332o13 = c0336o53.f1008;
                                        str17 = "ۙۧۧ۟ۚ۫ۚۡ۠ۖۤۙ۟ۙۡۚۢ۬ۧۘۘ۟ۙۨۥۥۨۘۖۜۘۘ۬ۡۙۡۙۙۖ۠۟ۢۥۥۘ۟ۗۖۡۛۘۘۥۜۦۨۙ۫۬ۜۘۙۖۜ۠۫ۥۡۧۥۘ۬ۢۖۨۛۘۘ";
                                        break;
                                    case -599498489:
                                        C0237h4.m865(str16);
                                        str17 = "ۢۡۙۚۗۧۤۖۢۚۤۥ۠ۢۖۜۚۨۘ۠ۧۜۢۢۡۛۨۘۦۜۧۥۨۖۘۙۡ۟ۘۥۚۧۧ۠ۚۚ۠۬ۤۘ۬ۙ۫ۥۦۛۖ۬۬ۡۜۙۙۢۛۧۚ۟۫ۨۧۘۖۢۡۢۨۘ۬۟ۜۤ۫ۗ";
                                        break;
                                    case -520634394:
                                        int i8 = C0330o.f1000;
                                        str17 = "۫ۙۗ۟۠ۧۥۗ۬۟ۛۘۘۦ۫ۘ۫ۘ۬ۙ۬ۖۘۚۧ۬۠ۗۥۦۡۘ۟ۛۥۘۡ۬ۦ۫ۧۖۚ۬ۚ۠ۜۡ۠۠ۨۦۖۜ۬۫ۨۧۥۘۤ۟ۗ۟ۘۘ";
                                        break;
                                    case -385682546:
                                        str5 = null;
                                        str17 = "ۗۡۜۜۘۛۢۢ۫۫ۢ۟ۛۗ۟ۖۢۦۘۧ۠۬ۗۘ۟ۛۜۚ۠ۥۗۖۛ۠ۤۧۙ۠ۚۡۖۜ۠ۨ۟ۗۜۗ۬۬ۥۘۙۘۨۡ۟ۦۜۗۛۥۗ";
                                        break;
                                    case -360761663:
                                        str6 = null;
                                        str17 = "ۢۖۡ۬ۨ۫ۛ۠۬۫ۢۙۜۜۘۚۢۡ۫ۘۥۘ۬ۧۘۘۖۤۨۘ۠۠ۗۦۧۦۨۛۨ۠ۖۨ۫ۢۖۨ۫ۥۘۛۗۖۥۡۧۥۘۘۜۧ۟ۖ۠ۖۘۚۨۗۨۚۘۘۧۢۛۘۨۘOۛۖۜۘۦۡۡ";
                                        break;
                                    case -269330834:
                                        C0286kb c0286kb5 = MainActivity.f1289;
                                        str17 = "۫۫ۘۘۡۛۜۘۘۛۜۛ۬ۖۘۥۢ۫ۡۧۙۗۧۡۘۢۗۢ۫ۙۖۘ۟ۨۡۘ۬ۥۧۘۨۚۢ۬ۦۜۘۡۨۛۖۨۤۥۧۨ۬ۘۖۘ۠ۖۨۘ";
                                        break;
                                    case -91938708:
                                        switch (i6) {
                                            case 0:
                                                str17 = "ۥ۠ۡ۬ۚۖۘ۬ۤۘۧۥۘۘۙۚۨ۬ۘۘۨۧ۬ۦ۫۫ۧۜۗۖۧ۟ۡۧۧۢۧۡۡ۫ۜۨۘۖۖۥۜۥۗۧۗۜۘۚۗۗ";
                                                break;
                                            case 1:
                                                str17 = "ۜۨۥۘۡۘۨۘۗۘۢۛۘ۠۫ۖ۬ۘۛۨۘ۬ۖۦۘ۬ۜۙ۫۠ۖۘۡۢۦۧۘۧۤ۫ۜۘۨ۟ۢۙۢۢۛ۫ۙۧ۟ۨۘۗۗۨۛۜۨ";
                                                break;
                                            case 2:
                                                str17 = "ۚۦۨۨۢۗۚۢۛۖۡ۟ۛۛۨۧۦۦۘۧۤۦۗۡۡۙۡۜۘ۟۟ۛۡ۫ۜۘۤۘۧۨ۠ۥۨۛۚ۬ۖ";
                                                break;
                                            default:
                                                str17 = "ۢ۫ۨۙۢ۟ۘۙۘ۬ۗۥۚ۬ۡۘ۠۫ۖۘۙۖۢ۬ۙۡۘۗۡۢۘ۟ۦۢۜۦۖۨۜۧۦۨۘۥۥۧۢۛۙ۠ۖۘۛ۟ۖۦۜ";
                                                break;
                                        }
                                        break;
                                    case 156129331:
                                        str17 = "ۢ۬۟ۧ۫ۗۡ۬ۨۘۦۧۤ۬۫ۗۙۚۖۛۧ۟ۙ۫ۖۚۥ۫ۤۗ۠۬ۙ۫ۖۨ۠ۧۘۙۦۡۤۢۥۘ";
                                        str10 = str8;
                                        break;
                                    case 225955315:
                                        c0332o14 = c0336o54.f1008;
                                        str17 = "ۧۗۜۘۦۨۘۖۗ۫ۗۙۘۘۢۖۧۘۡۨۜۛۜۡۘۥۨۧۖۛۚۡۛۜۜۘۨۢۤۙۙۗۚۘۜ۫ۢۗ۫۠ۜۥۘ۠ۙۛۤۨۘۘۧۖۨ۠ۢۜۗۙۦۚۙۢ۠۠ۤ۟ۗۤ";
                                        break;
                                    case 275824491:
                                    case 783311659:
                                    case 1340027351:
                                    case 1678782081:
                                        return;
                                    case 366225306:
                                        str17 = "ۜۡۡۘۚۜۖ۠۫ۢ۫ۚۢۚۨۗۜ۬۫ۡۨۛۥ۟۟۬ۙۗۡۗۖۢۤۦ۟ۛۥۘۨۨۜۘۤ۟ۗۖۨۡۘۘۦۜۘۦۢ۟ۗۜۙ";
                                        break;
                                    case 583592890:
                                        int i9 = C0330o.f1000;
                                        str17 = "۬ۗۤۚۨۛۦۜ۫۠ۛۤ۟ۙۘۘ۠ۜ۫ۗۡۚۚۤۡۘۜۥۧۘۢۛۘ۠ۥ۟ۥۛ۠ۛۘۨۗۥۘۗۜۖۘۤ۟ۖۘ۠ۨۧۘۥۗۡ";
                                        break;
                                    case 595212816:
                                        C0237h4.m1090("$mainTip", c0336o53);
                                        str17 = "۬ۙۦ۬ۚۥۘۡۘۥۘۧ۬ۥ۬۟ۥۛۖۙۦۚ۬ۥۖ۬ۛۗۛۥۢ۬ۜۦۥۖۦۧۜۖ۬ۛ۬ۥۙۚۡۘۢ۫ۨۦۢ۟۠ۚۡۗۢۛ۫ۤۚۧۨۘۚۥۦ۟ۥۘۙۙ۠";
                                        break;
                                    case 603348436:
                                        C0237h4.m1090("$mainTip", c0336o54);
                                        str17 = "ۘۖۨۦۖۧۘۛۧۜۜۘۧۘۙۖۡۘۤۗۥۚۖۥۘۧۥۘۦ۬ۛ۬ۥۡۘۤ۫۟۫ۙۡۚۘۡۛۚۤۢۤۗ۠ۢۜۡۜۨۙۜۘۨۦۦۘۧۙۧۘۗۘۖۚۤۥۘۘۗۥ۠";
                                        break;
                                    case 625864105:
                                        C0286kb c0286kb6 = MainActivity.f1289;
                                        str17 = "۫ۥۙۡۨۜۤ۠ۜۘۙۦۦ۫ۧۖ۟ۜۧۘۢ۠ۨۘۖۨۨۘۗۤۥۘۡ۟ۥۖ۠ۗۗ۠ۗۘۡۦۢۦۧۥۘۧۖۦ۟۬۟۠ۚۜ۬ۨۧۛۙۖۖۚۛۛ";
                                        break;
                                    case 748969091:
                                        str17 = "ۘۤۛۢۢۡۘ۠ۜۥۘۥۚ۟ۧ۬ۖۧۖۘۖۧۨۘۨ۬ۜ۠ۥۘۦۨ۟ۖۙۜۘۢۦۦۧۧۜۘۙۦۢۧ۬ۨۨۡۘۡ۟ۡۢۚ۫ۥۜۨۘۗ۫ۧۤۦ۠۫۠ۗۦۦۥۘۨۘۖۜ۬ۥۘۜۜۜۘ۫ۙۛ";
                                        break;
                                    case 929513715:
                                        C0330o.m1170(str16);
                                        str17 = "ۤۨ۬ۢۚ۫۬ۤۖ۟ۢ۫ۧۦۘۧ۬۠ۨۜۧۧۚۢۡۖۘۜۗۡۥ۬ۦۘۜ۫۬۬ۜۙۤۤۖۘۛ۫ۧۛۤۛۙۗۧۜۧۤ۬ۢ۟ۤۨۘۘۜ۟ۦ";
                                        break;
                                    case 974053466:
                                        c0336o55 = this.f875;
                                        str17 = "ۜۘ۫ۢۥ۫ۨۙۙ۠ۗۖۘۘ۠ۦۥ۫ۖۥۢۧ۟ۥ۫ۘۡۨۘۗ۫۫ۨۦۥ۬ۛۡۘۗۡۘۘ۠ۦۨۘۥۥۛۜۥۖۘۗۢۖۖۙ۟ۙۜۖۘۖ۟ۤۦۘۡۖۖۦۚۡۦۘۜۡۚ۟ۛۖ۬۟ۘۘۡۖ۫";
                                        break;
                                    case 994974833:
                                        C0330o.m1173(0, "正在打开浏览器...");
                                        str17 = "ۦۡۤۛۛۢۧۧۗ۬ۦۖۘۗۜۘۘۖۥۖۘۖۧۥۘۧۙۜۘۚۤۨۘۜۗۥ۠ۘۥۘۛۤۛۙ۟ۖۚۜۡ۟ۤۖۘۚۖۡ۫۫ۘۘۜۛۖۘۛۗ۬ۦۖۗۖۗۨۧۢۤۢۗۦۘ۬ۙۜ";
                                        break;
                                    case 1054170174:
                                        C0237h4.m1090("$mainTip", c0336o55);
                                        str17 = "۟ۧۛۨ۠ۤ۬ۗۡۚ۠۠ۙۡۘۜ۠۠ۥۗۥۘۡۖۥۘۘۡۦۘۦۤۥۘۨۙۛۚۜۜ۟ۦۘۢۢۙۙۖۘۧ۟ۦۥۖ۬ۡۦۖ۠ۤۖ۠ۜ۬ۖۨۜ";
                                        break;
                                    case 1285812657:
                                        i6 = this.f874;
                                        str17 = "ۛۤۙۨ۟۠ۖۥۡۖۡۢۛۡۧۥۙ۫ۘۘۧۜۛ۬ۦۧۘ۫۫ۙۜ۠ۥۘۨۘۖۤۥۦۤۜۛ۟ۛ۠ۥۚۗ۠ۖۢۙۚۡۘ۫ۨۗۢۤ۫ۗۚۧۥۥۤۙۛۡۤ۠ۘ";
                                        break;
                                    case 1353876195:
                                        String str27 = "ۦ۬ۡۤۥۖۚۙۘ۬ۦۦۘۙۥۡ۠ۛۨۖۜ۟ۖۢۥۘ۠ۜۡۦۧۘۜۧۖۘۤۥۥۡۗۜۨ۟ۡۗۙۗ";
                                        while (true) {
                                            switch (str27.hashCode() ^ (-539259595)) {
                                                case -1875564994:
                                                    str17 = "ۧۖۡۦۡۘ۬ۖۢۘۦۡ۟ۢۛۗۤۜۘۦۘۧ۫ۚۛۚۤۜۤۜۘ۟ۨۖ۬۠ۢۡۖۢ۠ۗۜۘۙ۠۠ۡۢۢ۫ۡ۫۟ۖۖۘۧۛ۠ۢ۟۬۫ۘ";
                                                    continue;
                                                case 667432776:
                                                    str27 = "ۡۛۘۘۤۛۦۦۖۖ۟ۙۜۘۤۜۥۘۡۧۘۘۘۜۛۢ۠ۦۗۨۘۘۥۡۜ۠۟ۦۘۨۦ۠ۤۛ۬ۛۤۡ۬ۙۚۘ۫ۡ۬ۤۜۘۦۜۦۘ";
                                                    break;
                                                case 1767964991:
                                                    str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                                    continue;
                                                case 2056888340:
                                                    String str28 = "۟ۢۜ۠ۙۥۘۜۤۖۘ۠۫ۨۘۙۥۨۘ۟ۥ۟۫ۜۤۗۤۨۘۖۤۡۘ۫ۥۙ۟۬ۡۘۖۜۛۦ۠ۨ۠ۦۡۛۦۖۛۢۧۥۧۚۚ۫۬ۛۛۚ۠ۚۥ۬ۡۧۖۚۤۚ۟۟ۜۙ۟۟ۛۚۘۗ۟ۛۢۘ";
                                                    while (true) {
                                                        switch (str28.hashCode() ^ (-1711662654)) {
                                                            case -1572277747:
                                                                String str29 = "ۦۛۙۢۚ۠ۤ۫ۧۨ۠۫ۨۡۦۘۧۘ۫ۤۜ۠۫ۜۦۤۡ۬ۚ۬ۡۦۙۧۡۨ۟ۜۡۨۘۥۚۨۚۚۖۘ۬ۧۘۙۧۤۤۥۗ۠ۨۦ۬ۜۤ۠ۖۘ";
                                                                while (true) {
                                                                    switch (str29.hashCode() ^ (-730203158)) {
                                                                        case -2016148936:
                                                                            str28 = "ۧ۬ۨۘۗۗۥۘۢۙۤۗ۬ۧ۠ۜۚۛۛ۬ۗۡۥۘۖۜۜۘۥۙۜۘۨۖۧۤۥ۫ۜ۬ۛۥۡۡۘۘۢۖۤۜۚ";
                                                                            break;
                                                                        case -8051377:
                                                                            str29 = "ۗۜۧۚۗۗۗۛۥۙۨۢۦ۫ۘۘۖۙۨۘ۠۟۠ۗ۠ۘۘۥۙۡ۟۫ۘۥۥۜۘۘۛۗۜۦۥۖۨۘۤ۠۫۟ۨ۫۫۠ۖۛۨۘۘۖۗۦۘۖ۠۬ۙۡۗۡۧۜ۠ۖۡۘۛ۠ۘۘۜۚ۫۫ۦۖۘۢۜۡ";
                                                                            break;
                                                                        case 357980236:
                                                                            str28 = "ۦۙ۫ۦۥۚۤۢۡۘۤ۠ۡ۫ۛۛۛۡۘۘۥۗۢۙ۠ۦۖۡ۬ۚۨۨۘۢۘۜۘۚ۠ۜۘۡۖۛۛۗۜۘۗ۟۬ۥۨۡۘ۠۬ۨۙۘ۟ۥۥۨۨۦۡ۫ۨۨۤ۟ۚ۟ۧۘۜۛۡۘ";
                                                                            break;
                                                                        case 987953900:
                                                                            str29 = c0332o14 != null ? "ۚۤۚ۫ۗ۬۠۠ۢ۫ۡۢ۬ۘۗ۬ۘۘۥۤۥۘۧۘۥۘۜ۫ۦۖۚ۬۠ۙۖۘۧۦۨۘۜۘۗۙ۠ۘ۫ۖۘۧۤۘۘۡ۬ۖۘۢۖۜۘۚۗۖ۠ۤۗۗ۟۬" : "ۡۦۦۗۨۤ۟۫ۚۘۗۧ۟ۗۥۨۤ۟ۨۗۡۚۤ۬ۚ۠ۛۡۖۘ۟ۙۡۛۤۜۘۨ۫ۚۦ۬ۥۙۧ۬ۢۗۥۜۧۘ۫ۡ۫ۘۘۘۧ۫۠";
                                                                            break;
                                                                    }
                                                                }
                                                                break;
                                                            case 2956209:
                                                                str28 = "۠ۛۡۘۢۨۥۦۦۤ۟ۥۚۧۜۘۥۛۡۘۚ۬ۡۖۤۖۘۖ۫ۨ۫ۖۤۦۢۗۨۦۢۜۢ۟ۛۦۘۢۗۗۖ۠ۨۜۛ۬ۜۛ۠ۨۦۗۡ۠ۥۘۘۚۤ";
                                                                break;
                                                            case 466636123:
                                                                str27 = "۫ۛۜۘ۠ۤ۟ۤۧۙ۬۟ۗۤۛ۫ۗۦۤ۟ۥۡۘۦۜۘۢۢۥۘ۠ۛ۟۬ۗۧۦۢۛۥۚ۬ۤۗ۟ۚۗۜۘ۬ۦۜۘۚۨۗۗۙۤ";
                                                                break;
                                                            case 1092978740:
                                                                str27 = "۠ۖ۬ۥ۠ۙۨۙۗۖ۠ۜۘ۟ۗۖۗۡۘۡ۠ۗۚۨ۫۬ۙۘۘ۫ۘ۟ۢۚۜۗۧۡۡ۫ۤۨ۬ۥ۟ۢۖۘ۫۟۠۬ۜۡۗۦ۠۬ۢۖۘۚۚ۟ۨ۟ۨۦۖۥۙۗۘۘۙۗۗۨۢۖ۠ۢۨۡۨۥ";
                                                                break;
                                                        }
                                                    }
                                                    break;
                                            }
                                        }
                                        break;
                                    case 1490954571:
                                        str7 = null;
                                        str17 = "ۢ۠ۡۘۧ۟ۨۘ۟ۛ۠۟ۡۜۦۜۦۘۨۧۛۨۡۦۢ۠ۨۘۖ۠۠۬ۙۢۦۨۖۘۖ۠ۥۖ۠۟ۦ۬ۜۘۤۢۥۘۘۜۢ۬ۦۢۘ۬ۥۗۨۥۘۘۨ۬۫ۦ۫";
                                        break;
                                    case 1567174269:
                                        str17 = "ۜۙ۫ۘۤۧۦۚ۫ۨۛۡۦۡۛۧۜۘ۬ۡۜۘۥۖۧۤۡ۬ۗۧۙ۟ۤۖۡۨۢ۠ۖۛۧ۫ۦۘۖۤۘۜ۟۠ۧ۬ۥۦۨۗ";
                                        str16 = str7;
                                        break;
                                    case 1658023366:
                                        int i10 = C0330o.f1000;
                                        str17 = "ۛۥ۟ۨۢۛ۬ۖۖۧۨۧۘ۫۬ۗ۟ۧۛۡۤۙۥ۬۟ۤۢۜۧۗۙ۫ۖ۬ۥۗۢ۫ۧ۬ۖ۫ۨۛ۫ۖ۟ۗۚۖۗۙۗۧۨۡۘ۟ۡۘۘ۟";
                                        break;
                                    case 1681125014:
                                        C0237h4.m865(str10);
                                        str17 = "ۨۢۥ۬۠ۜۘۘۚۚۦۘۦۨۚۖۘۗۤۘۢۜۤۗۜۡۘۧۚۖۥۜۨۘۨ۟ۢۧۖۜۘۛ۟۟ۧ۠ۘۛۛۘ";
                                        break;
                                    case 1731513016:
                                        c0332o122 = c0336o52.f1008;
                                        str17 = "ۧ۟۫ۗۢ۠ۖۧۤ۠ۗۖۗۢۙۧ۫۠ۙۙ۟ۚۛۗۥۧۜۡۧۘۜ۠۠۫۬۠ۥ۟ۨۘۖۦۦۚۨۨۘ";
                                        break;
                                    case 1752004423:
                                        str15 = c0332o15.f1717;
                                        str17 = "۟۬ۨۡۗ۫ۦۢۨ۠ۗ۬ۦۥۥۡۢ۠۬ۗۨۘۥۡۨۘۛ۬ۖۘۥۗۡۘۡۢ۬ۥۚۤۨۚ۠۠ۗ۠۟۬ۘ۟۠۠ۘۦۘۦ";
                                        break;
                                    case 2049773532:
                                        str17 = "ۧۦۦۥۗ۟ۢۥۜۘۤۜۗۚۜۖۗ۫ۢۥۗۙۜۘۗ۟ۙ۫۟ۧۡۥۘۨۧۡۘۤۜۖ۬۬ۖۘۨۡۖ";
                                        str14 = str13;
                                        break;
                                    case 2064801264:
                                        C0330o.m1167(str12);
                                        str17 = "ۤ۠ۗ۫ۗ۬ۥ۬ۤۚۜ۫ۦۡۖۢۜۥ۟ۜۢۙۚ۬ۘۨۖۘۧ۟ۚۖۧ۬۫۫ۨۘۡۥۖۛۜۥ۫ۤۖ۟ۨۗۥ۟ۛ۠ۙۛۗۡۥۢۥۢۗ۟ۡۘۦۧ۠ۡۘ۟ۦۦۘۤۗ۫۫ۖۧۘ۟ۨۡۘ";
                                        break;
                                }
                            }
                        }
                    });
                    return;
                }
                return;
            case 3:
                AlertDialogC0168c5 alertDialogC0168c5 = (AlertDialogC0168c5) this.f865;
                String str5 = (String) this.f1521;
                int i6 = AlertDialogC0168c5.f1401;
                C0237h4.m1090("this$0", alertDialogC0168c5);
                C0237h4.m1090("$addr", str5);
                WebView webView = alertDialogC0168c5.f1408;
                if (webView == null) {
                    C0237h4.m1092("mWebView");
                    throw null;
                }
                webView.loadUrl("javascript:searchAddr('" + str5 + "')");
                return;
            case 4:
                final LinearLayout linearLayout = (LinearLayout) this.f865;
                C0475z1 c0475z1 = (C0475z1) this.f1521;
                String str6 = C0475z1.f1221;
                C0237h4.m1090("$linearLayout", linearLayout);
                C0237h4.m1090("this$0", c0475z1);
                TextView textViewM1285 = C0475z1.m1285(linearLayout);
                textViewM1285.setText("访问用户历史");
                textViewM1285.setOnClickListener(new View.OnClickListener() { // from class: ۟.y1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i) {
                            case 0:
                                LinearLayout linearLayout2 = linearLayout;
                                C0237h4.m1090("$linearLayout", linearLayout2);
                                C0286kb c0286kb3 = AbstractC0356q.f1031;
                                AbstractC0356q.c.m1191().execute(new RunnableC0265j4(2, linearLayout2));
                                break;
                            default:
                                LinearLayout linearLayout3 = linearLayout;
                                C0237h4.m1090("$linearLayout", linearLayout3);
                                Context context = linearLayout3.getContext();
                                C0237h4.m1089("getContext(...)", context);
                                new AlertDialogC0308m5(context).show();
                                break;
                        }
                    }
                });
                linearLayout.addView(textViewM1285, 0);
                TextView textViewM12852 = C0475z1.m1285(linearLayout);
                textViewM12852.setText("红薯猪手");
                textViewM12852.setTextSize(16.0f);
                textViewM12852.setTypeface(Typeface.DEFAULT_BOLD);
                textViewM12852.setOnClickListener(new View.OnClickListener() { // from class: ۟.y1
                    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i4) {
                            case 0:
                                LinearLayout linearLayout2 = linearLayout;
                                C0237h4.m1090("$linearLayout", linearLayout2);
                                C0286kb c0286kb3 = AbstractC0356q.f1031;
                                AbstractC0356q.c.m1191().execute(new RunnableC0265j4(2, linearLayout2));
                                break;
                            default:
                                LinearLayout linearLayout3 = linearLayout;
                                C0237h4.m1090("$linearLayout", linearLayout3);
                                Context context = linearLayout3.getContext();
                                C0237h4.m1089("getContext(...)", context);
                                new AlertDialogC0308m5(context).show();
                                break;
                        }
                    }
                });
                linearLayout.addView(textViewM12852, linearLayout.getChildCount() - 1);
                return;
            case 5:
                C0235h2 c0235h2 = (C0235h2) this.f865;
                Activity activity = (Activity) this.f1521;
                C0237h4.m1090("this$0", c0235h2);
                C0237h4.m1090("$context", activity);
                C0235h2.m1084(c0235h2, activity);
                return;
            case 6:
                FrameLayout frameLayout = (FrameLayout) this.f865;
                Activity activity2 = (Activity) this.f1521;
                C0237h4.m1090("$act", activity2);
                frameLayout.addView(new C0430v8(activity2, new C0291l2(activity2)));
                return;
            case 7:
                String str7 = (String) this.f865;
                JSONObject jSONObject2 = (JSONObject) this.f1521;
                ArrayList<C0250i3> arrayList2 = C0211f6.f1445;
                C0237h4.m1090("$json", jSONObject2);
                C0274k c0274k = C0283k8.f1632;
                InterfaceC0472yb interfaceC0472ybMo985 = C0283k8.a.m884().mo985();
                C0237h4.m865(str7);
                String strOptString = jSONObject2.optString("red_id");
                C0237h4.m1089("optString(...)", strOptString);
                String strOptString2 = jSONObject2.optString("nickname");
                C0237h4.m1089("optString(...)", strOptString2);
                String strOptString3 = jSONObject2.optString("images");
                C0237h4.m1089("optString(...)", strOptString3);
                String strOptString4 = jSONObject2.optString("desc");
                C0237h4.m1089("optString(...)", strOptString4);
                String strOptString5 = jSONObject2.optString("location");
                C0237h4.m1089("optString(...)", strOptString5);
                String strOptString6 = jSONObject2.optString("ip_location");
                C0237h4.m1089("optString(...)", strOptString6);
                interfaceC0472ybMo985.mo972(new C0264j3(str7, strOptString, strOptString2, strOptString3, strOptString4, strOptString5, strOptString6, "", System.currentTimeMillis()));
                return;
            default:
                String str8 = (String) this.f865;
                List<String> list = (List) this.f1521;
                String str9 = C0436w1.f1166;
                C0237h4.m1090("$extName", str8);
                C0237h4.m1090("$urlList", list);
                if (C0237h4.m864(str8, "mp4")) {
                    String str10 = C0436w1.f1166;
                    C0436w1.m1262(str8, list);
                    return;
                }
                ArrayList arrayList3 = new ArrayList();
                for (String strSubstring : list) {
                    if (C0432va.m1253(strSubstring, "?") && (iM1256 = C0432va.m1256(strSubstring, "?", 0, false, 6)) != -1) {
                        strSubstring = strSubstring.substring(0, iM1256);
                        C0237h4.m1089("substring(...)", strSubstring);
                    }
                    arrayList3.add(strSubstring);
                }
                String str11 = C0436w1.f1166;
                C0436w1.m1262(str8, arrayList3);
                return;
        }
    }
}
