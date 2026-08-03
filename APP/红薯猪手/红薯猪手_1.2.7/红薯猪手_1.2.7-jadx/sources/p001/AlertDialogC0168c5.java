package p001;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.Window;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tendcloud.tenddata.C0133zz;
import java.net.URLDecoder;
import java.util.List;

/* JADX INFO: renamed from: ۟.c5 */
/* JADX INFO: loaded from: classes.dex */
public final class AlertDialogC0168c5 extends AbstractAlertDialogC0230gb {

    /* JADX INFO: renamed from: ۥۡۧ, reason: contains not printable characters */
    public static final /* synthetic */ int f1401 = 0;

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public final String f1402;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public final InterfaceC0222g3<String, C0433vb> f1403;

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public final String f1404;

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public EditText f1405;

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public EditText f1406;

    /* JADX INFO: renamed from: ۥۡۥ, reason: contains not printable characters */
    public Button f1407;

    /* JADX INFO: renamed from: ۥۡۦ, reason: contains not printable characters */
    public WebView f1408;

    /* JADX INFO: renamed from: ۟.c5$a */
    public final class a {

        /* JADX INFO: renamed from: ۥ */
        public long f736;

        /* JADX INFO: renamed from: ۥ۟ */
        public boolean f737;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @JavascriptInterface
        @SuppressLint({"SetTextI18n"})
        public final void showLocation(String str, String str2) {
            C0237h4.m1090(C0341oa.m915(new byte[]{92, 61, 59}, new byte[]{48, 92, 79, 61, 70, -98}), str);
            C0237h4.m1090(C0341oa.m915(new byte[]{-21, 103, 94}, new byte[]{-121, 9, 57, 12, -34, -15}), str2);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - this.f736 < 500) {
                return;
            }
            this.f736 = jCurrentTimeMillis;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || C0237h4.m864(str, C0341oa.m915(new byte[]{-120, -91, 4}, new byte[]{-72, -117, 52, -26, 39, -109})) || C0237h4.m864(str2, C0341oa.m915(new byte[]{-110, -84, 23}, new byte[]{-94, -126, 39, -61, -68, -51}))) {
                return;
            }
            try {
                AlertDialogC0168c5 alertDialogC0168c5 = AlertDialogC0168c5.this;
                EditText editText = alertDialogC0168c5.f1405;
                int i = 0;
                if (editText != null) {
                    editText.post(new RunnableC0154b5(alertDialogC0168c5, str2, str, i));
                } else {
                    C0237h4.m1092(C0341oa.m915(new byte[]{-86, -65, 69, -44, 118, 53, -88, -103, 64, -55, 107, 22, -87}, new byte[]{-57, -6, 33, -67, 2, 121}));
                    throw null;
                }
            } catch (Exception unused) {
            }
        }

        @JavascriptInterface
        public final void showLog(String str) {
            C0237h4.m1090(C0341oa.m915(new byte[]{101, 48, -35, -32}, new byte[]{17, 85, -91, -108, 101, -54}), str);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @JavascriptInterface
        public final void showToast(String str) {
            C0237h4.m1090(C0341oa.m915(new byte[]{119, -54, -60, 21}, new byte[]{3, -81, -68, 97, 88, 81}), str);
            WebView webView = AlertDialogC0168c5.this.f1408;
            if (webView != null) {
                webView.post(new RunnableC0265j4(1, str));
            } else {
                C0237h4.m1092(C0341oa.m915(new byte[]{76, 84, 28, 77, 105, -18, 68, 116}, new byte[]{33, 3, 121, 47, 63, -121}));
                throw null;
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        @JavascriptInterface
        public final void tilesLoaded() {
            if (this.f737) {
                return;
            }
            this.f737 = true;
            final AlertDialogC0168c5 alertDialogC0168c5 = AlertDialogC0168c5.this;
            if (TextUtils.isEmpty(alertDialogC0168c5.f1402)) {
                return;
            }
            List listM1259 = C0432va.m1259(alertDialogC0168c5.f1402, new String[]{","});
            if (listM1259.size() == 2) {
                Double dM1233 = C0393sa.m1233((String) listM1259.get(0));
                double dDoubleValue = dM1233 != null ? dM1233.doubleValue() : 0.0d;
                Double dM12332 = C0393sa.m1233((String) listM1259.get(1));
                final double dDoubleValue2 = dM12332 != null ? dM12332.doubleValue() : 0.0d;
                WebView webView = alertDialogC0168c5.f1408;
                if (webView == null) {
                    C0237h4.m1092("mWebView");
                    throw null;
                }
                final double d = dDoubleValue;
                webView.post(new Runnable() { // from class: ۟.a5
                    @Override // java.lang.Runnable
                    public final void run() {
                        AlertDialogC0168c5 alertDialogC0168c52 = alertDialogC0168c5;
                        double d2 = dDoubleValue2;
                        double d3 = d;
                        C0237h4.m1090("this$0", alertDialogC0168c52);
                        WebView webView2 = alertDialogC0168c52.f1408;
                        if (webView2 == null) {
                            C0237h4.m1092("mWebView");
                            throw null;
                        }
                        webView2.loadUrl("javascript:setMapCenter(" + d2 + "," + d3 + ")");
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: ۟.c5$b */
    public static final class b extends AbstractC0335o4 implements InterfaceC0208f3<Boolean> {
        public b() {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x00ac, code lost:
        
            if ((r10 == 0.0d) != false) goto L30;
         */
        @Override // p001.InterfaceC0208f3
        /* JADX INFO: renamed from: ۥ */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Boolean mo7() {
            String strM915;
            EditText editText = AlertDialogC0168c5.this.f1405;
            if (editText == null) {
                C0237h4.m1092(C0341oa.m915(new byte[]{-35, 73, -111, 22, -42, -61, -33, 111, -108, 11, -53, -32, -34}, new byte[]{-80, 12, -11, 127, -94, -113}));
                throw null;
            }
            String string = C0432va.m1260(editText.getText().toString()).toString();
            if (string.length() > 0) {
                string = C0406ta.m1247(string, C0341oa.m915(new byte[]{102, -76, 34}, new byte[]{-119, 8, -82, -119, 60, -128}), C0341oa.m915(new byte[]{-63}, new byte[]{-19, 113, -51, 52, 63, -15}));
                List listM1259 = C0432va.m1259(string, new String[]{C0341oa.m915(new byte[]{112}, new byte[]{92, -48, 106, 46, -118, 41})});
                if (listM1259.size() != 2) {
                    int i = C0330o.f1000;
                    strM915 = C0341oa.m915(new byte[]{-4, -53, 117, -75, 60, -107, -13, -17, 98, -76, 4, -67, -13, -56, 72, -76, 1, -67, -14, -40, 69, -73, 24, -98}, new byte[]{20, 117, -26, 80, -71, 48});
                } else {
                    Double dM1233 = C0393sa.m1233((String) listM1259.get(0));
                    double dDoubleValue = dM1233 != null ? dM1233.doubleValue() : 0.0d;
                    Double dM12332 = C0393sa.m1233((String) listM1259.get(1));
                    double dDoubleValue2 = dM12332 != null ? dM12332.doubleValue() : 0.0d;
                    if (!(dDoubleValue == 0.0d)) {
                    }
                    int i2 = C0330o.f1000;
                    strM915 = C0341oa.m915(new byte[]{31, -59, 18, 115, -30, -102, 16, -31, 5, 114, -38, -78, 16, -58, 47, 114, -33, -78, 17, -42, 34, 113, -58, -111, -37, -97, 57, 27, -113, -68, 74, -97, 57, 44, 87}, new byte[]{-9, 123, -127, -106, 103, 63});
                }
                C0330o.m1173(0, strM915);
                return Boolean.FALSE;
            }
            AlertDialogC0168c5.this.f1403.mo984(string);
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlertDialogC0168c5(Context context, String str, String str2, C0257ia c0257ia) {
        super(context, str);
        C0237h4.m1090("cxt", context);
        C0237h4.m1090("textValue", str2);
        this.f1402 = str2;
        this.f1403 = c0257ia;
        this.f1404 = "<html>\n<head>\n    <meta http-equiv='Content-Type' content='text/html' charset='utf-8'>\n    <script src='https://map.qq.com/api/gljs?v=2.exp&libraries=service&key=I2GBZ-CW43F-Y5OJB-NTEUL-PEES6-NNBL2'></script>\n    <script>\n        var map,geocoder,markerGeo,markerLayer;\n\n        function getLocation() {\n            var position = map.getCenter();\n            if (position != null) {\n                var lat = position.getLat().toFixed(6).toString()\n                var lng = position.getLng().toFixed(6).toString()\n                window.java_obj.showLocation(lat, lng)\n            }\n        }\n\n        function setMapCenter(lat, lng) {\n            map.setCenter(new TMap.LatLng(lat, lng));\n            updateCenterMaker();\n        }\n\n        function updateCenterMaker() {\n            markerGeo.position = map.getCenter();\n            markerLayer.updateGeometries([markerGeo]);\n            getLocation();\n        }\n\n        function initMap() {\n            var center = new TMap.LatLng(39.908802, 116.397502)\n            map = new TMap.Map(document.getElementById('container'), {\n                center: center,\n                // zoom: 17.2,  \n                // pitch: 43.5,\n                rotation: 45 \n            });\n            map.on('tilesloaded', function () {\n                window.java_obj.tilesLoaded()\n            })\n\n            geocoder = new TMap.service.Geocoder();\n\n            markerGeo = {id: 'center', position: map.getCenter()}\n            markerLayer = new TMap.MultiMarker({\n                map: map,\n                geometries: [markerGeo]\n            })\n\n            map.on('center_changed', updateCenterMaker)\n        }\n\n        function searchAddr(addr) {\n            geocoder.getLocation({address: addr})\n                .then((result) => {\n                    map.setCenter(result.result.location)\n                    getLocation()\n                },(c) => {                   window.java_obj.showToast('address error:'.concat(c.message));\n                })\n        }\n    </script>\n</head>\n<body onload='initMap()'>\n<div id='container'></div>\n</body>\n</html>";
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        WebView webView = this.f1408;
        if (webView == null) {
            C0237h4.m1092("mWebView");
            throw null;
        }
        webView.clearHistory();
        WebView webView2 = this.f1408;
        if (webView2 == null) {
            C0237h4.m1092("mWebView");
            throw null;
        }
        webView2.clearCache(true);
        WebView webView3 = this.f1408;
        if (webView3 == null) {
            C0237h4.m1092("mWebView");
            throw null;
        }
        webView3.freeMemory();
        WebView webView4 = this.f1408;
        if (webView4 == null) {
            C0237h4.m1092("mWebView");
            throw null;
        }
        webView4.pauseTimers();
        WebView webView5 = this.f1408;
        if (webView5 != null) {
            webView5.destroy();
        } else {
            C0237h4.m1092("mWebView");
            throw null;
        }
    }

    @Override // p001.AbstractAlertDialogC0230gb, p001.AbstractAlertDialogC0471ya, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.clearFlags(131080);
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(2);
        }
        m1083(new b());
        Button button = this.f1407;
        if (button != null) {
            button.setOnClickListener(new ViewOnClickListenerC0358q1(4, this));
        } else {
            C0237h4.m1092("mBtnSearch");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p001.AbstractAlertDialogC0230gb
    @SuppressLint({"ResourceType", "SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: ۥ۟ۦ */
    public final List<View> mo1003() {
        int iM1038 = (int) C0167c4.m1038(1, 40.0f);
        LinearLayout linearLayout = new LinearLayout(this.f1217);
        linearLayout.setOrientation(0);
        TextView textView = new TextView(this.f1217);
        textView.setLayoutParams(new LinearLayout.LayoutParams(-2, iM1038));
        textView.setText(C0272jb.m1099("彟剙余罺"));
        textView.setGravity(17);
        textView.setTextSize(15.0f);
        int i = AbstractAlertDialogC0471ya.f1886;
        textView.setPadding(i, 0, i, 0);
        linearLayout.addView(textView);
        EditText editText = new EditText(this.f1217);
        editText.setId(C0133zz.f658f);
        editText.setGravity(17);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, iM1038);
        layoutParams.weight = 1.0f;
        editText.setLayoutParams(layoutParams);
        editText.setTextSize(15.0f);
        editText.setHint(C0272jb.m1099("辟共绛纸庲８妎F,==?:?8>?:=@"));
        this.f1405 = editText;
        linearLayout.addView(editText);
        LinearLayout linearLayout2 = new LinearLayout(this.f1217);
        linearLayout2.setOrientation(0);
        TextView textView2 = new TextView(this.f1217);
        textView2.setLayoutParams(new LinearLayout.LayoutParams(-2, iM1038));
        textView2.setText(C0272jb.m1099("圼坌搨紮"));
        textView2.setGravity(17);
        textView2.setTextSize(15.0f);
        textView2.setPadding(i, 0, i, 0);
        linearLayout2.addView(textView2);
        EditText editText2 = new EditText(this.f1217);
        editText2.setId(26214);
        editText2.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, iM1038);
        layoutParams2.weight = 1.0f;
        editText2.setLayoutParams(layoutParams2);
        editText2.setTextSize(13.0f);
        editText2.setHint(C0272jb.m1099("辟共圼坌８妎Ｆ匣亸"));
        this.f1406 = editText2;
        linearLayout2.addView(editText2);
        Button button = new Button(this.f1217);
        button.setLayoutParams(new LinearLayout.LayoutParams(AbstractAlertDialogC0471ya.f1885 + iM1038, iM1038 - i));
        button.setText(C0272jb.m1099("搨紮"));
        button.setTextSize(13.0f);
        this.f1407 = button;
        linearLayout2.addView(button);
        WebView webView = new WebView(this.f1217);
        webView.setId(1638);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, 0);
        layoutParams3.weight = 1.0f;
        webView.setLayoutParams(layoutParams3);
        webView.setPadding(0, 0, 0, -((int) TypedValue.applyDimension(1, 30.0f, Resources.getSystem().getDisplayMetrics())));
        webView.getSettings().setJavaScriptEnabled(true);
        webView.addJavascriptInterface(new a(), "java_obj");
        webView.loadData(URLDecoder.decode(this.f1404, "utf-8"), "text/html", "utf-8");
        this.f1408 = webView;
        View view = new View(this.f1217);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, (int) C0167c4.m1038(1, 30.0f));
        layoutParams4.setMargins(0, -((int) C0167c4.m1038(1, 30.0f)), 0, 0);
        view.setLayoutParams(layoutParams4);
        view.setBackgroundColor(-1);
        View[] viewArr = new View[4];
        viewArr[0] = linearLayout;
        viewArr[1] = linearLayout2;
        View view2 = this.f1408;
        if (view2 == null) {
            C0237h4.m1092("mWebView");
            throw null;
        }
        viewArr[2] = view2;
        viewArr[3] = view;
        return C0272jb.m874(viewArr);
    }
}
