package top.mmjz.floatingclouds.bean;

import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;
import p000a.C0259O4;
import p000a.C0631i9;
import p000a.InterfaceC0821s9;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0821s9
@Metadata(m3302d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\b\u0007\u0018\u0000 !2\u00020\u0001:\u0002\"#B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000f\"\u0004\b\u0012\u0010\u0013R\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0013R\"\u0010\u0006\u001a\u00020\u00058\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\r\"\u0004\b\u001d\u0010\u001eR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0010\u001a\u0004\b\u001f\u0010\u000f\"\u0004\b \u0010\u0013¨\u0006$"}, m3303d2 = {"Ltop/mmjz/floatingclouds/bean/MaskItemBean;", "", "", "maskId", "tagName", "", "tipMode", "Lorg/json/JSONObject;", "tipData", "mapId", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILorg/json/JSONObject;Ljava/lang/String;)V", "toJSONObject", "()Lorg/json/JSONObject;", "toJson", "()Ljava/lang/String;", "Ljava/lang/String;", "getMaskId", "setMaskId", "(Ljava/lang/String;)V", "getTagName", "setTagName", "I", "getTipMode", "()I", "setTipMode", "(I)V", "Lorg/json/JSONObject;", "getTipData", "setTipData", "(Lorg/json/JSONObject;)V", "getMapId", "setMapId", "Companion", "a", "TipData", "app_release"}, m3304k = 1, m3305mv = {2, 0, 0}, m3307xi = 48)
public final class MaskItemBean {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    private String mapId;
    private String maskId;
    private String tagName;
    private JSONObject tipData;
    private int tipMode;

    @Metadata(m3302d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u0000 \n2\u00020\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\u0005¨\u0006\f"}, m3303d2 = {"Ltop/mmjz/floatingclouds/bean/MaskItemBean$TipData;", "", "", "mess", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/String;", "getMess", "()Ljava/lang/String;", "setMess", "Companion", "a", "app_release"}, m3304k = 1, m3305mv = {2, 0, 0}, m3307xi = 48)
    @InterfaceC0821s9
    public static final class TipData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        private String mess;

        /* JADX INFO: renamed from: top.mmjz.floatingclouds.bean.MaskItemBean$TipData$a, reason: from kotlin metadata */
        public static final class Companion {
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public TipData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r1v1, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
        /* JADX DEBUG: Multi-variable search result rejected for r1v3, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public static final TipData from(MaskItemBean maskItemBean) {
            INSTANCE.getClass();
            C0631i9.m1482e(maskItemBean, "wrapper");
            int i = 1;
            String str = null;
            Object[] objArr = 0;
            try {
                JSONObject tipData = maskItemBean.getTipData();
                if (tipData == null) {
                    return new TipData(str, i, objArr == true ? 1 : 0);
                }
                String strOptString = tipData.optString("mess", "");
                if (strOptString.length() == 0) {
                    strOptString = "该用户已对您私密（拉黑），请联系对方解除~";
                }
                return new TipData(strOptString);
            } catch (Exception unused) {
                return new TipData(0 == true ? 1 : 0, i, 0 == true ? 1 : 0);
            }
        }

        public final String getMess() {
            return this.mess;
        }

        public final void setMess(String str) {
            C0631i9.m1482e(str, "<set-?>");
            this.mess = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public TipData(String str) {
            C0631i9.m1482e(str, "mess");
            this.mess = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("该用户已对您私密（拉黑），请联系对方解除~") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:3) call: top.mmjz.floatingclouds.bean.MaskItemBean.TipData.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ TipData(String str, int i, C0259O4 c0259o4) {
            this((i & 1) != 0 ? "该用户已对您私密（拉黑），请联系对方解除~" : str);
        }
    }

    /* JADX INFO: renamed from: top.mmjz.floatingclouds.bean.MaskItemBean$a, reason: from kotlin metadata */
    public static final class Companion {
        /* JADX INFO: renamed from: a */
        public static MaskItemBean m3333a(String str) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            C0631i9.m1482e(str, "jsonText");
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString("maskId", "");
            C0631i9.m1481d(strOptString, "optString(...)");
            String strOptString2 = jSONObject.optString("tagName", "");
            C0631i9.m1481d(strOptString2, "optString(...)");
            int iOptInt = jSONObject.optInt("tipMode", 10086);
            try {
                jSONObject2 = new JSONObject(jSONObject.optString("tipData", "{}"));
            } catch (Exception unused2) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject3 = jSONObject2;
            String strOptString3 = jSONObject.optString("mapId", "filehelper");
            C0631i9.m1481d(strOptString3, "optString(...)");
            return new MaskItemBean(strOptString, strOptString2, iOptInt, jSONObject3, strOptString3);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaskItemBean(String str, String str2, int i, JSONObject jSONObject, String str3) {
        C0631i9.m1482e(str, "maskId");
        C0631i9.m1482e(str2, "tagName");
        C0631i9.m1482e(str3, "mapId");
        this.maskId = str;
        this.tagName = str2;
        this.tipMode = i;
        this.tipData = jSONObject;
        this.mapId = str3;
    }

    public final String getMapId() {
        return this.mapId;
    }

    public final String getMaskId() {
        return this.maskId;
    }

    public final String getTagName() {
        return this.tagName;
    }

    public final JSONObject getTipData() {
        return this.tipData;
    }

    public final int getTipMode() {
        return this.tipMode;
    }

    public final void setMapId(String str) {
        C0631i9.m1482e(str, "<set-?>");
        this.mapId = str;
    }

    public final void setMaskId(String str) {
        C0631i9.m1482e(str, "<set-?>");
        this.maskId = str;
    }

    public final void setTagName(String str) {
        C0631i9.m1482e(str, "<set-?>");
        this.tagName = str;
    }

    public final void setTipData(JSONObject jSONObject) {
        this.tipData = jSONObject;
    }

    public final void setTipMode(int i) {
        this.tipMode = i;
    }

    public final JSONObject toJSONObject() throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("maskId", this.maskId);
        jSONObject.put("tagName", this.tagName);
        jSONObject.put("tipMode", this.tipMode);
        JSONObject jSONObject2 = this.tipData;
        if (jSONObject2 == null || (string = jSONObject2.toString()) == null) {
            string = "{}";
        }
        jSONObject.put("tipData", string);
        jSONObject.put("mapId", this.mapId);
        return jSONObject;
    }

    public final String toJson() {
        String string = toJSONObject().toString();
        C0631i9.m1481d(string, "toString(...)");
        return string;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0021: CONSTRUCTOR 
  (r7v0 java.lang.String)
  (wrap:java.lang.String:0x0006: TERNARY null = ((wrap:int:0x0000: ARITH (r12v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r8v0 java.lang.String))
  (wrap:int:0x000d: TERNARY null = ((wrap:int:0x0007: ARITH (r12v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (10086 int) : (r9v0 int))
  (wrap:org.json.JSONObject:0x0017: TERNARY null = ((wrap:int:0x000e: ARITH (r12v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:org.json.JSONObject:0x0014: CONSTRUCTOR  A[MD:():void (c), WRAPPED] (LINE:8) call: org.json.JSONObject.<init>():void type: CONSTRUCTOR) : (r10v0 org.json.JSONObject))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0018: ARITH (r12v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("filehelper") : (r11v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, org.json.JSONObject, java.lang.String):void (m)] (LINE:10) call: top.mmjz.floatingclouds.bean.MaskItemBean.<init>(java.lang.String, java.lang.String, int, org.json.JSONObject, java.lang.String):void type: THIS */
    public /* synthetic */ MaskItemBean(String str, String str2, int i, JSONObject jSONObject, String str3, int i2, C0259O4 c0259o4) {
        this(str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? 10086 : i, (i2 & 8) != 0 ? new JSONObject() : jSONObject, (i2 & 16) != 0 ? "filehelper" : str3);
    }
}
