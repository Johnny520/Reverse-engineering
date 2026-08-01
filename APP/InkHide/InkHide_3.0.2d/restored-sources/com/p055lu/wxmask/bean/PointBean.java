package com.p055lu.wxmask.bean;

import org.json.JSONObject;
import p027N0.AbstractC0221e;
import p027N0.AbstractC0223g;
import p053c.InterfaceC0508a;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC0508a
public final class PointBean {
    public static final Companion Companion = new Companion(null);
    private String clazz;
    private String featId;
    private String method;

    public static final class Companion {
        /* JADX DEBUG: Can't inline method, not implemented redirect type for insn: 0x0000: CONSTRUCTOR  A[MD:():void (m)] (LINE:1) call: com.lu.wxmask.bean.PointBean.Companion.<init>():void type: THIS */
        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public /* synthetic */ Companion(AbstractC0221e abstractC0221e) {
            this();
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
        public final PointBean fromJson(JSONObject jSONObject) {
            AbstractC0223g.m418e(jSONObject, "value");
            String strOptString = jSONObject.optString("featId", null);
            String strOptString2 = jSONObject.optString("clazz", null);
            String strOptString3 = jSONObject.optString("method", null);
            AbstractC0223g.m415b(strOptString);
            AbstractC0223g.m415b(strOptString2);
            AbstractC0223g.m415b(strOptString3);
            return new PointBean(strOptString, strOptString2, strOptString3);
        }

        /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
        private Companion() {
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public PointBean(String str, String str2, String str3) {
        AbstractC0223g.m418e(str, "featId");
        AbstractC0223g.m418e(str2, "clazz");
        AbstractC0223g.m418e(str3, "method");
        this.featId = str;
        this.clazz = str2;
        this.method = str3;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getClazz() {
        return this.clazz;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getFeatId() {
        return this.featId;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String getMethod() {
        return this.method;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setClazz(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.clazz = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setFeatId(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.featId = str;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final void setMethod(String str) {
        AbstractC0223g.m418e(str, "<set-?>");
        this.method = str;
    }
}
