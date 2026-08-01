package com.p055lu.wxmask.bean;

import org.json.JSONObject;
import p027N0.AbstractC0221e;
import p027N0.AbstractC0223g;
import p037T.AbstractC0264o;
import p037T.C0261l;
import p037T.C0267r;
import p041V.AbstractC0311d;
import p049a0.C0367a;
import p053c.InterfaceC0508a;
import p067g0.AbstractC0575a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class MaskItemBean {
    public static final Companion Companion = new Companion(null);
    private String avatarUrl;
    private String mapId;
    private String maskId;
    private String tagName;
    private AbstractC0264o tipData;
    private int tipMode;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.lu.wxmask.bean.MaskItemBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0221e abstractC0221e) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final MaskItemBean fromJson(String str) {
            JSONObject jSONObject;
            AbstractC0223g.m418e(str, "jsonText");
            try {
                jSONObject = new JSONObject(str);
            } catch (Exception unused) {
                jSONObject = new JSONObject();
            }
            String strOptString = jSONObject.optString("maskId", "");
            AbstractC0223g.m417d(strOptString, "optString(...)");
            String strOptString2 = jSONObject.optString("tagName", "");
            AbstractC0223g.m417d(strOptString2, "optString(...)");
            int iOptInt = jSONObject.optInt("tipMode", 10086);
            String strOptString3 = jSONObject.optString("tipData", "{}");
            C0261l c0261l = AbstractC0575a.f1940a;
            c0261l.getClass();
            AbstractC0264o abstractC0264o = (AbstractC0264o) AbstractC0311d.m549k(C0267r.class).cast(c0261l.m480c(strOptString3, new C0367a(C0267r.class)));
            String strOptString4 = jSONObject.optString("mapId", "gh_e087bb5b95e6");
            AbstractC0223g.m417d(strOptString4, "optString(...)");
            String strOptString5 = jSONObject.optString("avatarUrl", "");
            AbstractC0223g.m417d(strOptString5, "optString(...)");
            return new MaskItemBean(strOptString, strOptString2, iOptInt, abstractC0264o, strOptString4, strOptString5);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    @InterfaceC0508a
    public static final class TipData {
        public static final Companion Companion = new Companion(null);
        private String mess;

        public static final class Companion {
            /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.lu.wxmask.bean.MaskItemBean.TipData.Companion.<init>():void type: THIS */
            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            public /* synthetic */ Companion(AbstractC0221e abstractC0221e) {
                this();
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
            /* JADX DEBUG: Multi-variable search result rejected for r1v2, resolved type: java.lang.Object[] */
            /* JADX WARN: Multi-variable type inference failed */
            public final TipData from(MaskItemBean maskItemBean) {
                AbstractC0223g.m418e(maskItemBean, "wrapper");
                try {
                    Object objM1143a = AbstractC0575a.m1143a(maskItemBean.getTipData());
                    TipData tipData = (TipData) objM1143a;
                    if (tipData.getMess() == null) {
                        tipData.setMess("该用户已对您私密（拉黑），请联系对方解除~");
                    }
                    return (TipData) objM1143a;
                } catch (Exception unused) {
                    return new TipData(null, 1, 0 == true ? 1 : 0);
                }
            }

            /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
            private Companion() {
            }
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        /* JADX DEBUG: Multi-variable search result rejected for r0v1, resolved type: java.lang.Object[] */
        /* JADX WARN: Multi-variable type inference failed */
        public TipData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public static final TipData from(MaskItemBean maskItemBean) {
            return Companion.from(maskItemBean);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final String getMess() {
            return this.mess;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final void setMess(String str) {
            AbstractC0223g.m418e(str, "<set-?>");
            this.mess = str;
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        public TipData(String str) {
            AbstractC0223g.m418e(str, "mess");
            this.mess = str;
        }

        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0006: CONSTRUCTOR 
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r2v0 int) & (1 int) A[WRAPPED]) != (0 int)) ? ("该用户已对您私密（拉黑），请联系对方解除~") : (r1v0 java.lang.String))
 A[MD:(java.lang.String):void (m)] (LINE:3) call: com.lu.wxmask.bean.MaskItemBean.TipData.<init>(java.lang.String):void type: THIS */
        public /* synthetic */ TipData(String str, int i2, AbstractC0221e abstractC0221e) {
            this((i2 & 1) != 0 ? "该用户已对您私密（拉黑），请联系对方解除~" : str);
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public MaskItemBean(String str, String str2, int i2, AbstractC0264o abstractC0264o, String str3, String str4) {
        AbstractC0223g.m418e(str, "maskId");
        AbstractC0223g.m418e(str2, "tagName");
        AbstractC0223g.m418e(str3, "mapId");
        AbstractC0223g.m418e(str4, "avatarUrl");
        this.maskId = str;
        this.tagName = str2;
        this.tipMode = i2;
        this.tipData = abstractC0264o;
        this.mapId = str3;
        this.avatarUrl = str4;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getAvatarUrl() {
        return this.avatarUrl;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMapId() {
        return this.mapId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMaskId() {
        return this.maskId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getTagName() {
        return this.tagName;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final AbstractC0264o getTipData() {
        return this.tipData;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int getTipMode() {
        return this.tipMode;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setAvatarUrl(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.avatarUrl = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMapId(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.mapId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMaskId(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.maskId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTagName(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.tagName = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTipData(AbstractC0264o abstractC0264o) {
        this.tipData = abstractC0264o;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setTipMode(int i2) {
        this.tipMode = i2;
    }

    /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x002a: CONSTRUCTOR 
  (r2v0 java.lang.String)
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0000: ARITH (r8v0 int) & (2 int) A[WRAPPED]) != (0 int)) ? ("") : (r3v0 java.lang.String))
  (wrap:int:?: TERNARY null = ((wrap:int:0x0007: ARITH (r8v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? (10086 int) : (r4v0 int))
  (wrap:T.o:?: TERNARY null = ((wrap:int:0x000d: ARITH (r8v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? (wrap:T.o:0x0013: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:9) call: T.r.<init>():void type: CONSTRUCTOR) : (r5v0 T.o))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0016: ARITH (r8v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? ("gh_e087bb5b95e6") : (r6v0 java.lang.String))
  (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x001c: ARITH (r8v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? ("") : (r7v0 java.lang.String))
 A[MD:(java.lang.String, java.lang.String, int, T.o, java.lang.String, java.lang.String):void (m)] (LINE:11) call: com.lu.wxmask.bean.MaskItemBean.<init>(java.lang.String, java.lang.String, int, T.o, java.lang.String, java.lang.String):void type: THIS */
    public /* synthetic */ MaskItemBean(String str, String str2, int i2, AbstractC0264o abstractC0264o, String str3, String str4, int i3, AbstractC0221e abstractC0221e) {
        this(str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? 10086 : i2, (i3 & 8) != 0 ? new C0267r() : abstractC0264o, (i3 & 16) != 0 ? "gh_e087bb5b95e6" : str3, (i3 & 32) != 0 ? "" : str4);
    }
}
