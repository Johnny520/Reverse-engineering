package p001A0;

import java.util.List;
import p022L.AbstractC0174d;
import p027N0.AbstractC0223g;

/* JADX INFO: renamed from: A0.S */
/* JADX INFO: loaded from: classes.dex */
public final class C0018S {

    /* JADX INFO: renamed from: a */
    public final String f144a;

    /* JADX INFO: renamed from: b */
    public final String f145b;

    /* JADX INFO: renamed from: c */
    public final String f146c;

    /* JADX INFO: renamed from: d */
    public final List f147d;

    /* JADX INFO: renamed from: e */
    public final String f148e;

    /* JADX INFO: renamed from: f */
    public final String f149f;

    /* JADX INFO: renamed from: g */
    public final String f150g;

    /* JADX INFO: renamed from: h */
    public final String f151h;

    /* JADX INFO: renamed from: i */
    public final String f152i;

    /* JADX INFO: renamed from: j */
    public final String f153j;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0018S(String str, String str2, String str3, List list, String str4, String str5, String str6, String str7, String str8, String str9) {
        AbstractC0223g.m418e(str, "sendClickClassName");
        AbstractC0223g.m418e(str2, "sendClickMethodName");
        AbstractC0223g.m418e(str3, "sendClickMethodSign");
        AbstractC0223g.m418e(str4, "appMsgContentClassName");
        AbstractC0223g.m418e(str5, "parseXmlMethodName");
        AbstractC0223g.m418e(str6, "parseXmlMethodSign");
        AbstractC0223g.m418e(str7, "appMsgLogicClassName");
        AbstractC0223g.m418e(str8, "sendAppMsgMethodName");
        AbstractC0223g.m418e(str9, "sendAppMsgMethodSign");
        this.f144a = str;
        this.f145b = str2;
        this.f146c = str3;
        this.f147d = list;
        this.f148e = str4;
        this.f149f = str5;
        this.f150g = str6;
        this.f151h = str7;
        this.f152i = str8;
        this.f153j = str9;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0018S)) {
            return false;
        }
        C0018S c0018s = (C0018S) obj;
        return AbstractC0223g.m414a(this.f144a, c0018s.f144a) && AbstractC0223g.m414a(this.f145b, c0018s.f145b) && AbstractC0223g.m414a(this.f146c, c0018s.f146c) && AbstractC0223g.m414a(this.f147d, c0018s.f147d) && AbstractC0223g.m414a(this.f148e, c0018s.f148e) && AbstractC0223g.m414a(this.f149f, c0018s.f149f) && AbstractC0223g.m414a(this.f150g, c0018s.f150g) && AbstractC0223g.m414a(this.f151h, c0018s.f151h) && AbstractC0223g.m414a(this.f152i, c0018s.f152i) && AbstractC0223g.m414a(this.f153j, c0018s.f153j);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final int hashCode() {
        return this.f153j.hashCode() + AbstractC0174d.m347c(this.f152i, AbstractC0174d.m347c(this.f151h, AbstractC0174d.m347c(this.f150g, AbstractC0174d.m347c(this.f149f, AbstractC0174d.m347c(this.f148e, AbstractC0174d.m349e(this.f147d, AbstractC0174d.m347c(this.f146c, AbstractC0174d.m347c(this.f145b, this.f144a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public final String toString() {
        StringBuilder sb = new StringBuilder("HookPoint(sendClickClassName=");
        sb.append(this.f144a);
        sb.append(", sendClickMethodName=");
        sb.append(this.f145b);
        sb.append(", sendClickMethodSign=");
        sb.append(this.f146c);
        sb.append(", sendClickMethods=");
        sb.append(this.f147d);
        sb.append(", appMsgContentClassName=");
        sb.append(this.f148e);
        sb.append(", parseXmlMethodName=");
        sb.append(this.f149f);
        sb.append(", parseXmlMethodSign=");
        sb.append(this.f150g);
        sb.append(", appMsgLogicClassName=");
        sb.append(this.f151h);
        sb.append(", sendAppMsgMethodName=");
        sb.append(this.f152i);
        sb.append(", sendAppMsgMethodSign=");
        return AbstractC0174d.m356l(sb, this.f153j, ")");
    }
}
