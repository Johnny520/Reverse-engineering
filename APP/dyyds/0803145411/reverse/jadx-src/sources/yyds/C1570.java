package yyds;

import java.io.Serializable;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: yyds.ᛷᛶᛳᛴ, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9 */
/* JADX INFO: loaded from: classes.dex */
public final class C1570 implements InterfaceC0732, Serializable {

    /* JADX INFO: renamed from: ᛲᛴᛳᛲ, reason: contains not printable characters */
    public LinkedBlockingQueue f7964;

    /* JADX INFO: renamed from: ᲀᛲᛳᲀ, reason: contains not printable characters */
    public String f7965;

    /* JADX INFO: renamed from: ᲇᲈᛵᛷ, reason: contains not printable characters */
    public C1064 f7966;

    @Override // yyds.InterfaceC0732
    public final String getName() {
        return this.f7965;
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛱᛳᲇ */
    public final void mo1678(Object obj) {
        m3214(5, new Object[]{obj});
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛱᲈᲁ */
    public final boolean mo1679() {
        return true;
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛲᛲᲈᲈ */
    public final boolean mo1680() {
        return true;
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛲᛴᛳᛲ */
    public final void mo1682(String str, Throwable th) {
        m3214(2, null);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛲᲈᲁ */
    public final void mo1683(Object obj) {
        m3214(4, new Object[]{obj});
    }

    /* JADX INFO: renamed from: ᛳᲁᲁᲇ, reason: contains not printable characters */
    public final void m3213(int i, String str, Object[] objArr) {
        Throwable th = null;
        if (objArr.length != 0) {
            Object obj = objArr[objArr.length - 1];
            if (obj instanceof Throwable) {
                th = (Throwable) obj;
            }
        }
        if (th == null) {
            m3214(i, objArr);
            return;
        }
        if (objArr.length == 0) {
            C0188.m800("non-sensical empty or null argument array");
            return;
        }
        int length = objArr.length - 1;
        Object[] objArr2 = new Object[length];
        if (length > 0) {
            System.arraycopy(objArr, 0, objArr2, 0, length);
        }
        m3214(i, objArr2);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛵᛸᛸᛷ */
    public final void mo1684(String str, Object... objArr) {
        m3213(4, str, objArr);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛶᛷᛲᲁ */
    public final void mo1685(String str, Object... objArr) {
        m3213(5, str, objArr);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛷᛲᲈᛱ */
    public final void mo1686(String str) {
        m3214(4, null);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛷᛵᲇᲀ */
    public final void mo1687(String str) {
        m3214(4, null);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᛷᲈᲈᲁ */
    public final boolean mo1688() {
        return true;
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᲀᛲᛳᲀ */
    public final boolean mo1689() {
        return true;
    }

    /* JADX INFO: renamed from: ᲇᛱᛲ, reason: contains not printable characters */
    public final void m3214(int i, Object[] objArr) {
        C0268 c0268 = new C0268();
        System.currentTimeMillis();
        c0268.f1467 = i;
        c0268.f1468 = this.f7966;
        Thread.currentThread().getName();
        c0268.f1469 = objArr;
        this.f7964.add(c0268);
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᲇᲇᲇᛱ */
    public final void mo1690(Object obj, Boolean bool) {
        m3214(5, new Object[]{obj, bool});
    }

    @Override // yyds.InterfaceC0732
    /* JADX INFO: renamed from: ᲇᲈᛵᛷ */
    public final boolean mo1691() {
        return true;
    }
}
