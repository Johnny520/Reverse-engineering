package p084fd;

import cd.C1517b;
import java.util.List;
import md.AbstractC5161p;
import okhttp3.internal.url._UrlKt;
import p315vd.AbstractC8924d;

/* JADX INFO: renamed from: fd.j */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2430j {

    /* JADX INFO: renamed from: a */
    public static Class f6593a;

    /* JADX INFO: renamed from: b */
    public static Class f6594b;

    /* JADX INFO: renamed from: c */
    public static Class f6595c;

    /* JADX INFO: renamed from: d */
    public static Class f6596d;

    /* JADX INFO: renamed from: e */
    public static Class f6597e;

    /* JADX INFO: renamed from: f */
    public static Class f6598f;

    /* JADX INFO: renamed from: a */
    public static void m8779a(String str, List list) {
        try {
            m8785g(AbstractC5161p.newInstance(f6594b, str, list, _UrlKt.FRAGMENT_ENCODE_SET, null));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("RelationBridge", "addMember failed", th);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m8780b(String str, List list) {
        try {
            m8785g(AbstractC5161p.newInstance(f6596d, str, list, _UrlKt.FRAGMENT_ENCODE_SET, _UrlKt.FRAGMENT_ENCODE_SET));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("RelationBridge", "createGroup failed", th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m8781c(String str, List list) {
        try {
            m8785g(AbstractC5161p.newInstance(f6593a, str, list, 0));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("RelationBridge", "deleteMember failed", th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m8782d(String str) {
        try {
            m8785g(AbstractC5161p.newInstance(f6597e, str));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("RelationBridge", "dismissGroup failed", th);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m8783e() {
        try {
            f6593a = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/delchatroommember").get();
            f6594b = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/addchatroommember").get();
            f6595c = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/invitechatroommember").get();
            f6596d = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/createchatroom").get();
            f6597e = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/dismisschatroom").get();
            f6598f = C1517b.findClass().usingStrings("/cgi-bin/micromsg-bin/addchatroomadmin").get();
        } catch (Throwable unused) {
            AbstractC8924d.m34263c("RelationBridge", "init failed");
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m8784f(String str, List list) {
        try {
            m8785g(AbstractC5161p.newInstance(f6595c, str, list, 0, _UrlKt.FRAGMENT_ENCODE_SET, null));
        } catch (Throwable th) {
            AbstractC8924d.m34264d("RelationBridge", "inviteMember failed", th);
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m8785g(Object obj) {
        AbstractC2429i.m8778c(obj);
    }
}
