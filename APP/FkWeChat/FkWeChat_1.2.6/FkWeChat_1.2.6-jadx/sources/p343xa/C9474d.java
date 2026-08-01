package p343xa;

import p213oa.C5691b;
import p213oa.C5692c;

/* JADX INFO: renamed from: xa.d */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public class C9474d {

    /* JADX INFO: renamed from: a */
    public final String f32186a;

    /* JADX INFO: renamed from: b */
    public C5692c f32187b;

    public C9474d(String str) {
        if (str == null) {
            m36902a(7);
        }
        this.f32186a = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void m36902a(int r9) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p343xa.C9474d.m36902a(int):void");
    }

    /* JADX INFO: renamed from: b */
    public static C9474d m36903b(C5691b c5691b) {
        if (c5691b == null) {
            m36902a(1);
        }
        return new C9474d(m36906h(c5691b));
    }

    /* JADX INFO: renamed from: c */
    public static C9474d m36904c(C5692c c5692c) {
        if (c5692c == null) {
            m36902a(4);
        }
        C9474d c9474d = new C9474d(c5692c.m22994a().replace('.', '/'));
        c9474d.f32187b = c5692c;
        return c9474d;
    }

    /* JADX INFO: renamed from: d */
    public static C9474d m36905d(String str) {
        if (str == null) {
            m36902a(0);
        }
        return new C9474d(str);
    }

    /* JADX INFO: renamed from: h */
    public static String m36906h(C5691b c5691b) {
        if (c5691b == null) {
            m36902a(2);
        }
        C5692c c5692cM22986f = c5691b.m22986f();
        String strReplace = c5691b.m22987g().m22994a().replace('.', '$');
        if (!c5692cM22986f.m22996c()) {
            strReplace = c5692cM22986f.m22994a().replace('.', '/') + "/" + strReplace;
        }
        if (strReplace == null) {
            m36902a(3);
        }
        return strReplace;
    }

    /* JADX INFO: renamed from: e */
    public C5692c m36907e() {
        return new C5692c(this.f32186a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f32186a.equals(((C9474d) obj).f32186a);
    }

    /* JADX INFO: renamed from: f */
    public String m36908f() {
        String str = this.f32186a;
        if (str == null) {
            m36902a(10);
        }
        return str;
    }

    /* JADX INFO: renamed from: g */
    public C5692c m36909g() {
        int iLastIndexOf = this.f32186a.lastIndexOf("/");
        if (iLastIndexOf != -1) {
            return new C5692c(this.f32186a.substring(0, iLastIndexOf).replace('/', '.'));
        }
        C5692c c5692c = C5692c.f17899d;
        if (c5692c == null) {
            m36902a(9);
        }
        return c5692c;
    }

    public int hashCode() {
        return this.f32186a.hashCode();
    }

    public String toString() {
        return this.f32186a;
    }
}
