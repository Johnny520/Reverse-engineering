package yyds;

import java.lang.reflect.Method;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: yyds.ᛵᛴᛳᛱ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1064 implements InterfaceC0732 {

    /* JADX INFO: renamed from: ᛱᲈᲁ, reason: contains not printable characters */
    public final LinkedBlockingQueue f4851;

    /* JADX INFO: renamed from: ᛲᛳᛶᲁ, reason: contains not printable characters */
    public final boolean f4852;

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public Boolean f4853;

    /* JADX INFO: renamed from: ᛶᛷᛲᲁ, reason: contains not printable characters */
    public C1570 f4854;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public final String f4855;

    /* JADX INFO: renamed from: ᲇᲇᲇᛱ, reason: contains not printable characters */
    public Method f4856;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public volatile InterfaceC0732 f4857;

    public C1064(String str, LinkedBlockingQueue linkedBlockingQueue, boolean z) {
        this.f4855 = str;
        this.f4851 = linkedBlockingQueue;
        this.f4852 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C1064.class == obj.getClass() && this.f4855.equals(((C1064) obj).f4855);
    }

    @Override // yyds.InterfaceC0732
    public final String getName() {
        return this.f4855;
    }

    public final int hashCode() {
        return this.f4855.hashCode();
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo1678(Object obj) {
        m2255().mo1678(obj);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo1679() {
        return m2255().mo1679();
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final boolean mo1680() {
        return m2255().mo1680();
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛲᛳᛶᲁ */
    public final boolean mo1681(int i) {
        return m2255().mo1681(i);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1682(String str, Throwable th) {
        m2255().mo1682(str, th);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1683(Object obj) {
        m2255().mo1683(obj);
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final InterfaceC0732 m2255() {
        if (this.f4857 != null) {
            return this.f4857;
        }
        if (this.f4852) {
            return C1720.f8706;
        }
        C1570 c1570 = this.f4854;
        if (c1570 != null) {
            return c1570;
        }
        LinkedBlockingQueue linkedBlockingQueue = this.f4851;
        C1570 c15702 = new C1570();
        c15702.f7966 = this;
        c15702.f7965 = this.f4855;
        c15702.f7964 = linkedBlockingQueue;
        this.f4854 = c15702;
        return c15702;
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1684(String str, Object... objArr) {
        m2255().mo1684(str, objArr);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final void mo1685(String str, Object... objArr) {
        m2255().mo1685(str, objArr);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo1686(String str) {
        m2255().mo1686(str);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo1687(String str) {
        m2255().mo1687(str);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo1688() {
        return m2255().mo1688();
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo1689() {
        return m2255().mo1689();
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final boolean m2256() {
        Boolean bool;
        Boolean bool2 = this.f4853;
        if (bool2 != null) {
            return bool2.booleanValue();
        }
        try {
            this.f4856 = this.f4857.getClass().getMethod("log", C0268.class);
            bool = Boolean.TRUE;
            this.f4853 = bool;
        } catch (NoSuchMethodException unused) {
            bool = Boolean.FALSE;
            this.f4853 = bool;
        }
        return bool.booleanValue();
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1690(Object obj, Boolean bool) {
        m2255().mo1690(obj, bool);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo1691() {
        return m2255().mo1691();
    }
}
