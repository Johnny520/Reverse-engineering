package p000a;

import java.util.Locale;
import java.util.Set;

/* JADX INFO: renamed from: a.yh */
/* JADX INFO: loaded from: classes.dex */
public final class C0943yh {

    /* JADX INFO: renamed from: a */
    public static final C0233Me f3555a = new C0233Me(new C0891w3(24));

    static {
        new C0233Me(new C0891w3(25));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x01bc A[RETURN] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean m2221a(String str) {
        if (str != null && !C0034Be.m101P(str)) {
            String string = C0034Be.m107V(str).toString();
            if (string.length() != 0) {
                if (C0015Ae.m49H(string, "wxid_", true)) {
                    if (string.length() > 5) {
                        return true;
                    }
                } else if (C0015Ae.m49H(string, "gh_", true)) {
                    if (string.length() > 3) {
                    }
                } else if (C0015Ae.m49H(string, "phacct_", true)) {
                    if (string.length() > 7) {
                    }
                } else if (!C0015Ae.m49H(string, "wx_", true)) {
                    if (!C0034Be.m94I(string, "@", false)) {
                        Set set = (Set) f3555a.m625a();
                        String lowerCase = string.toLowerCase(Locale.ROOT);
                        C0631i9.m1481d(lowerCase, "toLowerCase(...)");
                        if (!set.contains(lowerCase)) {
                            if (string.length() >= 6 && string.length() <= 20 && Character.isLetter(string.charAt(0))) {
                                for (int i = 0; i < string.length(); i++) {
                                    char cCharAt = string.charAt(i);
                                    if (Character.isLetterOrDigit(cCharAt) || cCharAt == '_' || cCharAt == '-') {
                                    }
                                }
                            }
                        }
                        return true;
                    }
                    String lowerCase2 = string.toLowerCase(Locale.ROOT);
                    C0631i9.m1481d(lowerCase2, "toLowerCase(...)");
                    if (C0034Be.m100O(lowerCase2, '@', 0, 6) > 0 && (lowerCase2.endsWith("@chatroom") || lowerCase2.endsWith("@im.chatroom") || lowerCase2.endsWith("@openim") || lowerCase2.endsWith("@kefu.openim") || lowerCase2.endsWith("@stranger") || lowerCase2.endsWith("@finder") || lowerCase2.endsWith("@findermsg") || lowerCase2.endsWith("@findermsgalias") || lowerCase2.endsWith("@findermsgstranger") || lowerCase2.endsWith("@qqim") || lowerCase2.endsWith("@bottle") || C0034Be.m94I(lowerCase2, "@bottle:", false) || lowerCase2.endsWith("@status") || lowerCase2.endsWith("@app") || lowerCase2.endsWith("@bizfansmsg") || lowerCase2.endsWith("@picfansmsg") || lowerCase2.endsWith("@zhugemsg") || lowerCase2.endsWith("@zhugepublic") || lowerCase2.endsWith("@zhugeprivate") || lowerCase2.endsWith("@gamelife") || lowerCase2.endsWith("@gamelifesess") || lowerCase2.endsWith("@weclaw") || lowerCase2.endsWith("@t.qq.com") || lowerCase2.endsWith("@micromsg.qq.com") || lowerCase2.endsWith("@qr") || lowerCase2.endsWith("@fb") || lowerCase2.endsWith("@google") || lowerCase2.endsWith("@fakeuser") || lowerCase2.equals("brandecstemplatemsg@fakeuser") || lowerCase2.equals("@placeholder_foldgroup"))) {
                    }
                } else if (string.length() > 3) {
                }
            }
        }
        return false;
    }
}
