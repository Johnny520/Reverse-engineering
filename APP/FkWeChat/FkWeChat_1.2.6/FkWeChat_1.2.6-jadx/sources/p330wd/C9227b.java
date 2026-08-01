package p330wd;

import org.json.JSONObject;
import p185m8.AbstractC5102r;
import p299ub.AbstractC8611a0;

/* JADX INFO: renamed from: wd.b */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public final class C9227b {

    /* JADX INFO: renamed from: a */
    public static final C9227b f31491a = new C9227b();

    /* JADX INFO: renamed from: a */
    public static final String m35911a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "{}";
        }
        if (bArr.length > 4 && bArr[0] == 0 && bArr[1] == 0) {
            bArr = AbstractC5102r.m20666r(bArr, 4, bArr.length);
        }
        String string = new JSONObject(new C9228c(bArr).m35913b()).toString();
        string.getClass();
        return AbstractC8611a0.m33069N(string, "\\/", "/", false, 4, null);
    }
}
