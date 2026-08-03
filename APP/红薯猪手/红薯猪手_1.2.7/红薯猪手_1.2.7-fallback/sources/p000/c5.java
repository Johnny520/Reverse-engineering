package p000;

/* JADX INFO: loaded from: classes.dex */
public final class c5 extends p000.gb {

    /* JADX INFO: renamed from: ۥۡۧ, reason: contains not printable characters */
    public static final /* synthetic */ int f251 = 0;

    /* JADX INFO: renamed from: ۥۡ۠, reason: contains not printable characters */
    public final java.lang.String f252;

    /* JADX INFO: renamed from: ۥۡۡ, reason: contains not printable characters */
    public final p000.g3<java.lang.String, p000.vb> f253;

    /* JADX INFO: renamed from: ۥۡۢ, reason: contains not printable characters */
    public final java.lang.String f254;

    /* JADX INFO: renamed from: ۥۣۡ, reason: contains not printable characters */
    public android.widget.EditText f255;

    /* JADX INFO: renamed from: ۥۡۤ, reason: contains not printable characters */
    public android.widget.EditText f256;

    /* JADX INFO: renamed from: ۥۡۥ, reason: contains not printable characters */
    public android.widget.Button f257;

    /* JADX INFO: renamed from: ۥۡۦ, reason: contains not printable characters */
    public android.webkit.WebView f258;

    public final class a {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public long f259;

        /* JADX INFO: renamed from: ۥ۟, reason: contains not printable characters */
        public boolean f260;

        /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
        public final /* synthetic */ p000.c5 f261;

        /* JADX DEBUG: Incorrect args count in method signature: ()V */
        public a(p000.c5 r1) {
                r0 = this;
                r0.f261 = r1
                r0.<init>()
                return
        }

        @android.webkit.JavascriptInterface
        @android.annotation.SuppressLint({"SetTextI18n"})
        public final void showLocation(java.lang.String r10, java.lang.String r11) {
                r9 = this;
                r0 = 3
                byte[] r1 = new byte[r0]
                r1 = {x00e2: FILL_ARRAY_DATA , data: [92, 61, 59} // fill-array
                r2 = 6
                byte[] r3 = new byte[r2]
                r3 = {x00e8: FILL_ARRAY_DATA , data: [48, 92, 79, 61, 70, -98} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r3)
                p000.h4.m189(r1, r10)
                byte[] r1 = new byte[r0]
                r1 = {x00f0: FILL_ARRAY_DATA , data: [-21, 103, 94} // fill-array
                byte[] r3 = new byte[r2]
                r3 = {x00f6: FILL_ARRAY_DATA , data: [-121, 9, 57, 12, -34, -15} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r3)
                p000.h4.m189(r1, r11)
                long r3 = java.lang.System.currentTimeMillis()
                long r5 = r9.f259
                long r5 = r3 - r5
                r7 = 500(0x1f4, double:2.47E-321)
                int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
                if (r1 >= 0) goto L33
                return
            L33:
                r9.f259 = r3
                boolean r1 = android.text.TextUtils.isEmpty(r10)
                if (r1 != 0) goto Le0
                boolean r1 = android.text.TextUtils.isEmpty(r11)
                if (r1 != 0) goto Le0
                byte[] r1 = new byte[r0]
                r1 = {x00fe: FILL_ARRAY_DATA , data: [-120, -91, 4} // fill-array
                byte[] r3 = new byte[r2]
                r3 = {x0104: FILL_ARRAY_DATA , data: [-72, -117, 52, -26, 39, -109} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r3)
                boolean r1 = p000.h4.m185(r10, r1)
                if (r1 != 0) goto Le0
                byte[] r1 = new byte[r0]
                r1 = {x010c: FILL_ARRAY_DATA , data: [-110, -84, 23} // fill-array
                byte[] r3 = new byte[r2]
                r3 = {x0112: FILL_ARRAY_DATA , data: [-94, -126, 39, -61, -68, -51} // fill-array
                java.lang.String r1 = p000.oa.m332(r1, r3)
                boolean r1 = p000.h4.m185(r11, r1)
                if (r1 != 0) goto Le0
                ۟.c5 r1 = r9.f261     // Catch: java.lang.Exception -> Le0
                android.widget.EditText r3 = r1.f255     // Catch: java.lang.Exception -> Le0
                r4 = 0
                if (r3 == 0) goto L79
                ۟.b5 r0 = new ۟.b5     // Catch: java.lang.Exception -> Le0
                r0.<init>(r1, r11, r10, r4)     // Catch: java.lang.Exception -> Le0
                r3.post(r0)     // Catch: java.lang.Exception -> Le0
                goto Le0
            L79:
                r10 = 13
                byte[] r10 = new byte[r10]     // Catch: java.lang.Exception -> Le0
                r11 = -86
                r10[r4] = r11     // Catch: java.lang.Exception -> Le0
                r11 = -65
                r1 = 1
                r10[r1] = r11     // Catch: java.lang.Exception -> Le0
                r11 = 69
                r3 = 2
                r10[r3] = r11     // Catch: java.lang.Exception -> Le0
                r11 = -44
                r10[r0] = r11     // Catch: java.lang.Exception -> Le0
                r11 = 118(0x76, float:1.65E-43)
                r5 = 4
                r10[r5] = r11     // Catch: java.lang.Exception -> Le0
                r11 = 53
                r6 = 5
                r10[r6] = r11     // Catch: java.lang.Exception -> Le0
                r11 = -88
                r10[r2] = r11     // Catch: java.lang.Exception -> Le0
                r11 = 7
                r7 = -103(0xffffffffffffff99, float:NaN)
                r10[r11] = r7     // Catch: java.lang.Exception -> Le0
                r11 = 8
                r7 = 64
                r10[r11] = r7     // Catch: java.lang.Exception -> Le0
                r11 = 9
                r7 = -55
                r10[r11] = r7     // Catch: java.lang.Exception -> Le0
                r11 = 10
                r7 = 107(0x6b, float:1.5E-43)
                r10[r11] = r7     // Catch: java.lang.Exception -> Le0
                r11 = 11
                r7 = 22
                r10[r11] = r7     // Catch: java.lang.Exception -> Le0
                r11 = 12
                r7 = -87
                r10[r11] = r7     // Catch: java.lang.Exception -> Le0
                byte[] r11 = new byte[r2]     // Catch: java.lang.Exception -> Le0
                r2 = -57
                r11[r4] = r2     // Catch: java.lang.Exception -> Le0
                r2 = -6
                r11[r1] = r2     // Catch: java.lang.Exception -> Le0
                r1 = 33
                r11[r3] = r1     // Catch: java.lang.Exception -> Le0
                r1 = -67
                r11[r0] = r1     // Catch: java.lang.Exception -> Le0
                r11[r5] = r3     // Catch: java.lang.Exception -> Le0
                r0 = 121(0x79, float:1.7E-43)
                r11[r6] = r0     // Catch: java.lang.Exception -> Le0
                java.lang.String r10 = p000.oa.m332(r10, r11)     // Catch: java.lang.Exception -> Le0
                p000.h4.m191(r10)     // Catch: java.lang.Exception -> Le0
                r10 = 0
                throw r10     // Catch: java.lang.Exception -> Le0
            Le0:
                return
        }

        @android.webkit.JavascriptInterface
        public final void showLog(java.lang.String r3) {
                r2 = this;
                r0 = 4
                byte[] r0 = new byte[r0]
                r0 = {x0014: FILL_ARRAY_DATA , data: [101, 48, -35, -32} // fill-array
                r1 = 6
                byte[] r1 = new byte[r1]
                r1 = {x001a: FILL_ARRAY_DATA , data: [17, 85, -91, -108, 101, -54} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m189(r0, r3)
                return
        }

        @android.webkit.JavascriptInterface
        public final void showToast(java.lang.String r4) {
                r3 = this;
                r0 = 4
                byte[] r0 = new byte[r0]
                r0 = {x0038: FILL_ARRAY_DATA , data: [119, -54, -60, 21} // fill-array
                r1 = 6
                byte[] r2 = new byte[r1]
                r2 = {x003e: FILL_ARRAY_DATA , data: [3, -81, -68, 97, 88, 81} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r2)
                p000.h4.m189(r0, r4)
                ۟.c5 r0 = r3.f261
                android.webkit.WebView r0 = r0.f258
                if (r0 == 0) goto L23
                ۟.j4 r1 = new ۟.j4
                r2 = 1
                r1.<init>(r2, r4)
                r0.post(r1)
                return
            L23:
                r4 = 8
                byte[] r4 = new byte[r4]
                r4 = {x0046: FILL_ARRAY_DATA , data: [76, 84, 28, 77, 105, -18, 68, 116} // fill-array
                byte[] r0 = new byte[r1]
                r0 = {x004e: FILL_ARRAY_DATA , data: [33, 3, 121, 47, 63, -121} // fill-array
                java.lang.String r4 = p000.oa.m332(r4, r0)
                p000.h4.m191(r4)
                r4 = 0
                throw r4
        }

        @android.webkit.JavascriptInterface
        public final void tilesLoaded() {
                r9 = this;
                boolean r0 = r9.f260
                if (r0 != 0) goto L62
                r0 = 1
                r9.f260 = r0
                ۟.c5 r2 = r9.f261
                java.lang.String r1 = r2.f252
                boolean r1 = android.text.TextUtils.isEmpty(r1)
                if (r1 != 0) goto L62
                java.lang.String r1 = r2.f252
                java.lang.String r3 = ","
                java.lang.String[] r3 = new java.lang.String[]{r3}
                java.util.List r1 = p000.va.m444(r1, r3)
                int r3 = r1.size()
                r4 = 2
                if (r3 != r4) goto L62
                r3 = 0
                java.lang.Object r3 = r1.get(r3)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.Double r3 = p000.sa.m406(r3)
                r4 = 0
                if (r3 == 0) goto L38
                double r6 = r3.doubleValue()
                goto L39
            L38:
                r6 = r4
            L39:
                java.lang.Object r0 = r1.get(r0)
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Double r0 = p000.sa.m406(r0)
                if (r0 == 0) goto L4b
                double r0 = r0.doubleValue()
                r3 = r0
                goto L4c
            L4b:
                r3 = r4
            L4c:
                android.webkit.WebView r0 = r2.f258
                if (r0 == 0) goto L5b
                ۟.a5 r8 = new ۟.a5
                r1 = r8
                r5 = r6
                r1.<init>(r2, r3, r5)
                r0.post(r8)
                goto L62
            L5b:
                java.lang.String r0 = "mWebView"
                p000.h4.m191(r0)
                r0 = 0
                throw r0
            L62:
                return
        }
    }

    public static final class b extends p000.o4 implements p000.f3<java.lang.Boolean> {

        /* JADX INFO: renamed from: ۥ, reason: contains not printable characters */
        public final /* synthetic */ p000.c5 f262;

        public b(p000.c5 r1) {
                r0 = this;
                r0.f262 = r1
                r0.<init>()
                return
        }

        /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
        @Override // p000.f3
        /* JADX INFO: renamed from: ۥ */
        public final java.lang.Boolean mo11() {
                r12 = this;
                ۟.c5 r0 = r12.f262
                android.widget.EditText r0 = r0.f255
                r1 = 6
                if (r0 == 0) goto Ld0
                android.text.Editable r0 = r0.getText()
                java.lang.String r0 = r0.toString()
                java.lang.CharSequence r0 = p000.va.m445(r0)
                java.lang.String r0 = r0.toString()
                int r2 = r0.length()
                r3 = 1
                r4 = 0
                if (r2 <= 0) goto L21
                r2 = r3
                goto L22
            L21:
                r2 = r4
            L22:
                if (r2 == 0) goto Lc6
                r2 = 3
                byte[] r2 = new byte[r2]
                r2 = {x00e6: FILL_ARRAY_DATA , data: [102, -76, 34} // fill-array
                byte[] r5 = new byte[r1]
                r5 = {x00ec: FILL_ARRAY_DATA , data: [-119, 8, -82, -119, 60, -128} // fill-array
                java.lang.String r2 = p000.oa.m332(r2, r5)
                byte[] r5 = new byte[r3]
                r6 = -63
                r5[r4] = r6
                byte[] r6 = new byte[r1]
                r6 = {x00f4: FILL_ARRAY_DATA , data: [-19, 113, -51, 52, 63, -15} // fill-array
                java.lang.String r5 = p000.oa.m332(r5, r6)
                java.lang.String r0 = p000.ta.m422(r0, r2, r5)
                java.lang.String[] r2 = new java.lang.String[r3]
                byte[] r5 = new byte[r3]
                r6 = 112(0x70, float:1.57E-43)
                r5[r4] = r6
                byte[] r6 = new byte[r1]
                r6 = {x00fc: FILL_ARRAY_DATA , data: [92, -48, 106, 46, -118, 41} // fill-array
                java.lang.String r5 = p000.oa.m332(r5, r6)
                r2[r4] = r5
                java.util.List r2 = p000.va.m444(r0, r2)
                int r5 = r2.size()
                r6 = 2
                if (r5 == r6) goto L77
                int r0 = p000.o.f829
                r0 = 24
                byte[] r0 = new byte[r0]
                r0 = {x0104: FILL_ARRAY_DATA , data: [-4, -53, 117, -75, 60, -107, -13, -17, 98, -76, 4, -67, -13, -56, 72, -76, 1, -67, -14, -40, 69, -73, 24, -98} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x0114: FILL_ARRAY_DATA , data: [20, 117, -26, 80, -71, 48} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                goto Lc0
            L77:
                java.lang.Object r5 = r2.get(r4)
                java.lang.String r5 = (java.lang.String) r5
                java.lang.Double r5 = p000.sa.m406(r5)
                r6 = 0
                if (r5 == 0) goto L8a
                double r8 = r5.doubleValue()
                goto L8b
            L8a:
                r8 = r6
            L8b:
                java.lang.Object r2 = r2.get(r3)
                java.lang.String r2 = (java.lang.String) r2
                java.lang.Double r2 = p000.sa.m406(r2)
                if (r2 == 0) goto L9c
                double r10 = r2.doubleValue()
                goto L9d
            L9c:
                r10 = r6
            L9d:
                int r2 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                if (r2 != 0) goto La3
                r2 = r3
                goto La4
            La3:
                r2 = r4
            La4:
                if (r2 != 0) goto Lae
                int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                if (r2 != 0) goto Lab
                goto Lac
            Lab:
                r3 = r4
            Lac:
                if (r3 == 0) goto Lc6
            Lae:
                int r0 = p000.o.f829
                r0 = 35
                byte[] r0 = new byte[r0]
                r0 = {x011c: FILL_ARRAY_DATA , data: [31, -59, 18, 115, -30, -102, 16, -31, 5, 114, -38, -78, 16, -58, 47, 114, -33, -78, 17, -42, 34, 113, -58, -111, -37, -97, 57, 27, -113, -68, 74, -97, 57, 44, 87} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x0132: FILL_ARRAY_DATA , data: [-9, 123, -127, -106, 103, 63} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
            Lc0:
                p000.o.m318(r4, r0)
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                goto Lcf
            Lc6:
                ۟.c5 r1 = r12.f262
                ۟.g3<java.lang.String, ۟.vb> r1 = r1.f253
                r1.mo12(r0)
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
            Lcf:
                return r0
            Ld0:
                r0 = 13
                byte[] r0 = new byte[r0]
                r0 = {x013a: FILL_ARRAY_DATA , data: [-35, 73, -111, 22, -42, -61, -33, 111, -108, 11, -53, -32, -34} // fill-array
                byte[] r1 = new byte[r1]
                r1 = {x0146: FILL_ARRAY_DATA , data: [-80, 12, -11, 127, -94, -113} // fill-array
                java.lang.String r0 = p000.oa.m332(r0, r1)
                p000.h4.m191(r0)
                r0 = 0
                throw r0
        }
    }

    public c5(android.content.Context r2, java.lang.String r3, java.lang.String r4, p000.ia r5) {
            r1 = this;
            java.lang.String r0 = "cxt"
            p000.h4.m189(r0, r2)
            java.lang.String r0 = "textValue"
            p000.h4.m189(r0, r4)
            r1.<init>(r2, r3)
            r1.f252 = r4
            r1.f253 = r5
            java.lang.String r2 = "<html>\n<head>\n    <meta http-equiv='Content-Type' content='text/html' charset='utf-8'>\n    <script src='https://map.qq.com/api/gljs?v=2.exp&libraries=service&key=I2GBZ-CW43F-Y5OJB-NTEUL-PEES6-NNBL2'></script>\n    <script>\n        var map,geocoder,markerGeo,markerLayer;\n\n        function getLocation() {\n            var position = map.getCenter();\n            if (position != null) {\n                var lat = position.getLat().toFixed(6).toString()\n                var lng = position.getLng().toFixed(6).toString()\n                window.java_obj.showLocation(lat, lng)\n            }\n        }\n\n        function setMapCenter(lat, lng) {\n            map.setCenter(new TMap.LatLng(lat, lng));\n            updateCenterMaker();\n        }\n\n        function updateCenterMaker() {\n            markerGeo.position = map.getCenter();\n            markerLayer.updateGeometries([markerGeo]);\n            getLocation();\n        }\n\n        function initMap() {\n            var center = new TMap.LatLng(39.908802, 116.397502)\n            map = new TMap.Map(document.getElementById('container'), {\n                center: center,\n                // zoom: 17.2,  \n                // pitch: 43.5,\n                rotation: 45 \n            });\n            map.on('tilesloaded', function () {\n                window.java_obj.tilesLoaded()\n            })\n\n            geocoder = new TMap.service.Geocoder();\n\n            markerGeo = {id: 'center', position: map.getCenter()}\n            markerLayer = new TMap.MultiMarker({\n                map: map,\n                geometries: [markerGeo]\n            })\n\n            map.on('center_changed', updateCenterMaker)\n        }\n\n        function searchAddr(addr) {\n            geocoder.getLocation({address: addr})\n                .then((result) => {\n                    map.setCenter(result.result.location)\n                    getLocation()\n                },(c) => {                   window.java_obj.showToast('address error:'.concat(c.message));\n                })\n        }\n    </script>\n</head>\n<body onload='initMap()'>\n<div id='container'></div>\n</body>\n</html>"
            r1.f254 = r2
            return
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
            r4 = this;
            super.dismiss()
            android.webkit.WebView r0 = r4.f258
            r1 = 0
            java.lang.String r2 = "mWebView"
            if (r0 == 0) goto L3b
            r0.clearHistory()
            android.webkit.WebView r0 = r4.f258
            if (r0 == 0) goto L37
            r3 = 1
            r0.clearCache(r3)
            android.webkit.WebView r0 = r4.f258
            if (r0 == 0) goto L33
            r0.freeMemory()
            android.webkit.WebView r0 = r4.f258
            if (r0 == 0) goto L2f
            r0.pauseTimers()
            android.webkit.WebView r0 = r4.f258
            if (r0 == 0) goto L2b
            r0.destroy()
            return
        L2b:
            p000.h4.m191(r2)
            throw r1
        L2f:
            p000.h4.m191(r2)
            throw r1
        L33:
            p000.h4.m191(r2)
            throw r1
        L37:
            p000.h4.m191(r2)
            throw r1
        L3b:
            p000.h4.m191(r2)
            throw r1
    }

    @Override // p000.gb, p000.ya, android.app.AlertDialog, android.app.Dialog
    public final void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto Lf
            r0 = 131080(0x20008, float:1.83682E-40)
            r3.clearFlags(r0)
        Lf:
            android.view.Window r3 = r2.getWindow()
            if (r3 == 0) goto L19
            r0 = 2
            r3.setSoftInputMode(r0)
        L19:
            ۟.c5$b r3 = new ۟.c5$b
            r3.<init>(r2)
            r2.m175(r3)
            android.widget.Button r3 = r2.f257
            if (r3 == 0) goto L2f
            ۟.q1 r0 = new ۟.q1
            r1 = 4
            r0.<init>(r1, r2)
            r3.setOnClickListener(r0)
            return
        L2f:
            java.lang.String r3 = "mBtnSearch"
            p000.h4.m191(r3)
            r3 = 0
            throw r3
    }

    @Override // p000.gb
    @android.annotation.SuppressLint({"ResourceType", "SetJavaScriptEnabled"})
    /* JADX INFO: renamed from: ۥ۟ۦ */
    public final java.util.List<android.view.View> mo49() {
            r13 = this;
            r0 = 1
            r1 = 1109393408(0x42200000, float:40.0)
            float r1 = p000.c4.m107(r0, r1)
            int r1 = (int) r1
            android.widget.LinearLayout r2 = new android.widget.LinearLayout
            android.content.Context r3 = r13.f1218
            r2.<init>(r3)
            r3 = 0
            r2.setOrientation(r3)
            android.widget.TextView r4 = new android.widget.TextView
            android.content.Context r5 = r13.f1218
            r4.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r6 = -2
            r5.<init>(r6, r1)
            r4.setLayoutParams(r5)
            java.lang.String r5 = "彟剙余罺"
            java.lang.String r5 = p000.jb.m208(r5)
            r4.setText(r5)
            r5 = 17
            r4.setGravity(r5)
            r7 = 1097859072(0x41700000, float:15.0)
            r4.setTextSize(r7)
            int r8 = p000.ya.f1217
            r4.setPadding(r8, r3, r8, r3)
            r2.addView(r4)
            android.widget.EditText r4 = new android.widget.EditText
            android.content.Context r9 = r13.f1218
            r4.<init>(r9)
            r9 = 102(0x66, float:1.43E-43)
            r4.setId(r9)
            r4.setGravity(r5)
            android.widget.LinearLayout$LayoutParams r9 = new android.widget.LinearLayout$LayoutParams
            r10 = -1
            r9.<init>(r10, r1)
            r11 = 1065353216(0x3f800000, float:1.0)
            r9.weight = r11
            r4.setLayoutParams(r9)
            r4.setTextSize(r7)
            java.lang.String r9 = "辟共绛纸庲８妎F,==?:?8>?:=@"
            java.lang.String r9 = p000.jb.m208(r9)
            r4.setHint(r9)
            r13.f255 = r4
            r2.addView(r4)
            android.widget.LinearLayout r4 = new android.widget.LinearLayout
            android.content.Context r9 = r13.f1218
            r4.<init>(r9)
            r4.setOrientation(r3)
            android.widget.TextView r9 = new android.widget.TextView
            android.content.Context r12 = r13.f1218
            r9.<init>(r12)
            android.widget.LinearLayout$LayoutParams r12 = new android.widget.LinearLayout$LayoutParams
            r12.<init>(r6, r1)
            r9.setLayoutParams(r12)
            java.lang.String r6 = "圼坌搨紮"
            java.lang.String r6 = p000.jb.m208(r6)
            r9.setText(r6)
            r9.setGravity(r5)
            r9.setTextSize(r7)
            r9.setPadding(r8, r3, r8, r3)
            r4.addView(r9)
            android.widget.EditText r6 = new android.widget.EditText
            android.content.Context r7 = r13.f1218
            r6.<init>(r7)
            r7 = 26214(0x6666, float:3.6734E-41)
            r6.setId(r7)
            r6.setGravity(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r10, r1)
            r5.weight = r11
            r6.setLayoutParams(r5)
            r5 = 1095761920(0x41500000, float:13.0)
            r6.setTextSize(r5)
            java.lang.String r7 = "辟共圼坌８妎Ｆ匣亸"
            java.lang.String r7 = p000.jb.m208(r7)
            r6.setHint(r7)
            r13.f256 = r6
            r4.addView(r6)
            android.widget.Button r6 = new android.widget.Button
            android.content.Context r7 = r13.f1218
            r6.<init>(r7)
            android.widget.LinearLayout$LayoutParams r7 = new android.widget.LinearLayout$LayoutParams
            int r9 = p000.ya.f1216
            int r9 = r9 + r1
            int r1 = r1 - r8
            r7.<init>(r9, r1)
            r6.setLayoutParams(r7)
            java.lang.String r1 = "搨紮"
            java.lang.String r1 = p000.jb.m208(r1)
            r6.setText(r1)
            r6.setTextSize(r5)
            r13.f257 = r6
            r4.addView(r6)
            android.webkit.WebView r1 = new android.webkit.WebView
            android.content.Context r5 = r13.f1218
            r1.<init>(r5)
            r5 = 1638(0x666, float:2.295E-42)
            r1.setId(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            r5.<init>(r10, r3)
            r5.weight = r11
            r1.setLayoutParams(r5)
            android.content.res.Resources r5 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            r6 = 1106247680(0x41f00000, float:30.0)
            float r5 = android.util.TypedValue.applyDimension(r0, r6, r5)
            int r5 = (int) r5
            int r5 = -r5
            r1.setPadding(r3, r3, r3, r5)
            android.webkit.WebSettings r5 = r1.getSettings()
            r5.setJavaScriptEnabled(r0)
            ۟.c5$a r5 = new ۟.c5$a
            r5.<init>(r13)
            java.lang.String r7 = "java_obj"
            r1.addJavascriptInterface(r5, r7)
            java.lang.String r5 = r13.f254
            java.lang.String r7 = "utf-8"
            java.lang.String r5 = java.net.URLDecoder.decode(r5, r7)
            java.lang.String r8 = "text/html"
            r1.loadData(r5, r8, r7)
            r13.f258 = r1
            android.view.View r1 = new android.view.View
            android.content.Context r5 = r13.f1218
            r1.<init>(r5)
            android.widget.LinearLayout$LayoutParams r5 = new android.widget.LinearLayout$LayoutParams
            float r7 = p000.c4.m107(r0, r6)
            int r7 = (int) r7
            r5.<init>(r10, r7)
            float r6 = p000.c4.m107(r0, r6)
            int r6 = (int) r6
            int r6 = -r6
            r5.setMargins(r3, r6, r3, r3)
            r1.setLayoutParams(r5)
            r1.setBackgroundColor(r10)
            r5 = 4
            android.view.View[] r5 = new android.view.View[r5]
            r5[r3] = r2
            r5[r0] = r4
            android.webkit.WebView r0 = r13.f258
            if (r0 == 0) goto L168
            r2 = 2
            r5[r2] = r0
            r0 = 3
            r5[r0] = r1
            java.util.ArrayList r0 = p000.jb.m205(r5)
            return r0
        L168:
            java.lang.String r0 = "mWebView"
            p000.h4.m191(r0)
            r0 = 0
            throw r0
    }
}
