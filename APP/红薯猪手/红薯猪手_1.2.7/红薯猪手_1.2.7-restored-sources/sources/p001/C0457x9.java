package p001;

import android.text.TextUtils;
import p001.C0178d1;
import p001.C0463y2;

/* JADX INFO: renamed from: ۟.x9 */
/* JADX INFO: loaded from: classes.dex */
public final class C0457x9 extends AbstractC0335o4 implements InterfaceC0222g3<String, Boolean> {

    /* JADX INFO: renamed from: ۥ */
    public final /* synthetic */ C0344p0 f1194;

    public C0457x9(C0344p0 c0344p0) {
        this.f1194 = c0344p0;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    /* JADX DEBUG: Return type fixed from 'java.lang.Object' to match base method */
    @Override // p001.InterfaceC0222g3
    /* JADX INFO: renamed from: ۥ۟۟ */
    public final Boolean mo984(String str) {
        String strM915;
        String str2 = str;
        C0237h4.m1090("text", str2);
        String string = C0432va.m1260(str2).toString();
        if (!TextUtils.isEmpty(string)) {
            if (C0406ta.m1244(string, "|")) {
                string = string.substring(0, C0432va.m1254(string));
                strM915 = "substring(...)";
            } else if (C0406ta.m942(string, "|")) {
                string = string.substring(1, string.length());
                strM915 = "substring(...)";
            }
            C0237h4.m1089(strM915, string);
        }
        this.f1194.m916(string);
        C0286kb c0286kb = C0178d1.f750;
        C0178d1.b.m841().mo850(this.f1194.f1018, string);
        if (C0237h4.m864(this.f1194.f1018, EnumC0164c1.f1386.f728)) {
            boolean z = C0463y2.f1203;
            C0463y2.a.m1272(string);
        } else {
            boolean z2 = C0463y2.f1203;
            C0463y2.a.m1271(string);
        }
        int i = C0330o.f1000;
        C0330o.m1173(1, "免重启立即生效");
        return Boolean.TRUE;
    }
}
