package top.mmjz.floatingclouds.bean;

/* JADX INFO: loaded from: classes.dex */
@a.InterfaceC0371s9
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"#B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0013¨\u0006$"}, d2 = {"Ltop/mmjz/floatingclouds/bean/MaskItemBean;", "", "", "maskId", "tagName", "", "tipMode", "Lorg/json/JSONObject;", "tipData", "mapId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;)V", "toJSONObject", "()Lorg/json/JSONObject;", "toJson", "()Ljava/lang/String;", "Ljava/lang/String;", "getMaskId", "setMaskId", "(Ljava/lang/String;)V", "getTagName", "setTagName", "I", "getTipMode", "()I", "setTipMode", "(I)V", "Lorg/json/JSONObject;", "getTipData", "setTipData", "(Lorg/json/JSONObject;)V", "getMapId", "setMapId", "Companion", "a", "TipData", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MaskItemBean {
    public static final top.mmjz.floatingclouds.bean.MaskItemBean.a Companion = null;
    private java.lang.String mapId;
    private java.lang.String maskId;
    private java.lang.String tagName;
    private org.json.JSONObject tipData;
    private int tipMode;

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\f"}, d2 = {"Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;", "", "", "mess", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMess", "()Ljava/lang/String;", "setMess", "Companion", "a", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @a.InterfaceC0371s9
    public static final class TipData {
        public static final top.mmjz.floatingclouds.bean.MaskItemBean.TipData.a Companion = null;
        private java.lang.String mess;

        public static final class a {
        }

        static {
                top.mmjz.floatingclouds.bean.MaskItemBean$TipData$a r0 = new top.mmjz.floatingclouds.bean.MaskItemBean$TipData$a
                r0.<init>()
                top.mmjz.floatingclouds.bean.MaskItemBean.TipData.Companion = r0
                return
        }

        public TipData() {
                r2 = this;
                r0 = 0
                r1 = 1
                r2.<init>(r0, r1, r0)
                return
        }

        public TipData(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "mess"
                a.C0193i9.e(r2, r0)
                r1.<init>()
                r1.mess = r2
                return
        }

        public /* synthetic */ TipData(java.lang.String r1, int r2, a.O4 r3) {
                r0 = this;
                r2 = r2 & 1
                if (r2 == 0) goto L6
                java.lang.String r1 = "该用户已对您私密（拉黑），请联系对方解除~"
            L6:
                r0.<init>(r1)
                return
        }

        public static final top.mmjz.floatingclouds.bean.MaskItemBean.TipData from(top.mmjz.floatingclouds.bean.MaskItemBean r4) {
                top.mmjz.floatingclouds.bean.MaskItemBean$TipData$a r0 = top.mmjz.floatingclouds.bean.MaskItemBean.TipData.Companion
                r0.getClass()
                java.lang.String r0 = "wrapper"
                a.C0193i9.e(r4, r0)
                r0 = 1
                r1 = 0
                org.json.JSONObject r4 = r4.getTipData()     // Catch: java.lang.Exception -> L2e
                if (r4 != 0) goto L18
                top.mmjz.floatingclouds.bean.MaskItemBean$TipData r4 = new top.mmjz.floatingclouds.bean.MaskItemBean$TipData     // Catch: java.lang.Exception -> L2e
                r4.<init>(r1, r0, r1)     // Catch: java.lang.Exception -> L2e
                return r4
            L18:
                java.lang.String r2 = "mess"
                java.lang.String r3 = ""
                java.lang.String r4 = r4.optString(r2, r3)     // Catch: java.lang.Exception -> L2e
                int r2 = r4.length()     // Catch: java.lang.Exception -> L2e
                if (r2 != 0) goto L28
                java.lang.String r4 = "该用户已对您私密（拉黑），请联系对方解除~"
            L28:
                top.mmjz.floatingclouds.bean.MaskItemBean$TipData r2 = new top.mmjz.floatingclouds.bean.MaskItemBean$TipData     // Catch: java.lang.Exception -> L2e
                r2.<init>(r4)     // Catch: java.lang.Exception -> L2e
                return r2
            L2e:
                top.mmjz.floatingclouds.bean.MaskItemBean$TipData r4 = new top.mmjz.floatingclouds.bean.MaskItemBean$TipData
                r4.<init>(r1, r0, r1)
                return r4
        }

        public final java.lang.String getMess() {
                r1 = this;
                java.lang.String r0 = r1.mess
                return r0
        }

        public final void setMess(java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "<set-?>"
                a.C0193i9.e(r2, r0)
                r1.mess = r2
                return
        }
    }

    public static final class a {
        public static top.mmjz.floatingclouds.bean.MaskItemBean a(java.lang.String r8) {
                java.lang.String r0 = "jsonText"
                a.C0193i9.e(r8, r0)
                org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lb
                r0.<init>(r8)     // Catch: java.lang.Exception -> Lb
                goto L10
            Lb:
                org.json.JSONObject r0 = new org.json.JSONObject
                r0.<init>()
            L10:
                java.lang.String r8 = "maskId"
                java.lang.String r1 = ""
                java.lang.String r3 = r0.optString(r8, r1)
                java.lang.String r8 = "optString(...)"
                a.C0193i9.d(r3, r8)
                java.lang.String r2 = "tagName"
                java.lang.String r4 = r0.optString(r2, r1)
                a.C0193i9.d(r4, r8)
                java.lang.String r1 = "tipMode"
                r2 = 10086(0x2766, float:1.4133E-41)
                int r5 = r0.optInt(r1, r2)
                org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L3d
                java.lang.String r2 = "tipData"
                java.lang.String r6 = "{}"
                java.lang.String r2 = r0.optString(r2, r6)     // Catch: java.lang.Exception -> L3d
                r1.<init>(r2)     // Catch: java.lang.Exception -> L3d
            L3b:
                r6 = r1
                goto L43
            L3d:
                org.json.JSONObject r1 = new org.json.JSONObject
                r1.<init>()
                goto L3b
            L43:
                java.lang.String r1 = "mapId"
                java.lang.String r2 = "filehelper"
                java.lang.String r7 = r0.optString(r1, r2)
                a.C0193i9.d(r7, r8)
                top.mmjz.floatingclouds.bean.MaskItemBean r2 = new top.mmjz.floatingclouds.bean.MaskItemBean
                r2.<init>(r3, r4, r5, r6, r7)
                return r2
        }
    }

    static {
            top.mmjz.floatingclouds.bean.MaskItemBean$a r0 = new top.mmjz.floatingclouds.bean.MaskItemBean$a
            r0.<init>()
            top.mmjz.floatingclouds.bean.MaskItemBean.Companion = r0
            return
    }

    public MaskItemBean(java.lang.String r2, java.lang.String r3, int r4, org.json.JSONObject r5, java.lang.String r6) {
            r1 = this;
            java.lang.String r0 = "maskId"
            a.C0193i9.e(r2, r0)
            java.lang.String r0 = "tagName"
            a.C0193i9.e(r3, r0)
            java.lang.String r0 = "mapId"
            a.C0193i9.e(r6, r0)
            r1.<init>()
            r1.maskId = r2
            r1.tagName = r3
            r1.tipMode = r4
            r1.tipData = r5
            r1.mapId = r6
            return
    }

    public /* synthetic */ MaskItemBean(java.lang.String r7, java.lang.String r8, int r9, org.json.JSONObject r10, java.lang.String r11, int r12, a.O4 r13) {
            r6 = this;
            r13 = r12 & 2
            if (r13 == 0) goto L6
            java.lang.String r8 = ""
        L6:
            r2 = r8
            r8 = r12 & 4
            if (r8 == 0) goto Ld
            r9 = 10086(0x2766, float:1.4133E-41)
        Ld:
            r3 = r9
            r8 = r12 & 8
            if (r8 == 0) goto L17
            org.json.JSONObject r10 = new org.json.JSONObject
            r10.<init>()
        L17:
            r4 = r10
            r8 = r12 & 16
            if (r8 == 0) goto L1e
            java.lang.String r11 = "filehelper"
        L1e:
            r0 = r6
            r1 = r7
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public final java.lang.String getMapId() {
            r1 = this;
            java.lang.String r0 = r1.mapId
            return r0
    }

    public final java.lang.String getMaskId() {
            r1 = this;
            java.lang.String r0 = r1.maskId
            return r0
    }

    public final java.lang.String getTagName() {
            r1 = this;
            java.lang.String r0 = r1.tagName
            return r0
    }

    public final org.json.JSONObject getTipData() {
            r1 = this;
            org.json.JSONObject r0 = r1.tipData
            return r0
    }

    public final int getTipMode() {
            r1 = this;
            int r0 = r1.tipMode
            return r0
    }

    public final void setMapId(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            a.C0193i9.e(r2, r0)
            r1.mapId = r2
            return
    }

    public final void setMaskId(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            a.C0193i9.e(r2, r0)
            r1.maskId = r2
            return
    }

    public final void setTagName(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            a.C0193i9.e(r2, r0)
            r1.tagName = r2
            return
    }

    public final void setTipData(org.json.JSONObject r1) {
            r0 = this;
            r0.tipData = r1
            return
    }

    public final void setTipMode(int r1) {
            r0 = this;
            r0.tipMode = r1
            return
    }

    public final org.json.JSONObject toJSONObject() {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "maskId"
            java.lang.String r2 = r3.maskId
            r0.put(r1, r2)
            java.lang.String r1 = "tagName"
            java.lang.String r2 = r3.tagName
            r0.put(r1, r2)
            java.lang.String r1 = "tipMode"
            int r2 = r3.tipMode
            r0.put(r1, r2)
            org.json.JSONObject r1 = r3.tipData
            if (r1 == 0) goto L24
            java.lang.String r1 = r1.toString()
            if (r1 != 0) goto L26
        L24:
            java.lang.String r1 = "{}"
        L26:
            java.lang.String r2 = "tipData"
            r0.put(r2, r1)
            java.lang.String r1 = "mapId"
            java.lang.String r2 = r3.mapId
            r0.put(r1, r2)
            return r0
    }

    public final java.lang.String toJson() {
            r2 = this;
            org.json.JSONObject r0 = r2.toJSONObject()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            a.C0193i9.d(r0, r1)
            return r0
    }
}
