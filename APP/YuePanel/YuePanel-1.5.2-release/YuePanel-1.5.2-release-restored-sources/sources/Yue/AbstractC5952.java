package Yue;

/* JADX INFO: renamed from: Yue.ۥ۠ۨۨۥ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5952 extends AbstractC6345 implements InterfaceC5866 {

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public static final long f14894 = 9044267456635152283L;

    @Override // Yue.AbstractC6345, Yue.InterfaceC5866
    public /* bridge */ /* synthetic */ String getName() {
        return super.getName();
    }

    public String toString() {
        return getClass().getName() + "(" + getName() + ")";
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ */
    public void mo1638(InterfaceC5949 interfaceC5949, String str) {
        warn(str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo14128(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        error(str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo14129(InterfaceC5949 interfaceC5949, String str) {
        info(str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14130(InterfaceC5949 interfaceC5949, String str, Object obj) {
        mo14126(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo14131(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        mo14144(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo14132(InterfaceC5949 interfaceC5949, String str, Object obj) {
        mo1639(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo14135(InterfaceC5949 interfaceC5949, String str) {
        debug(str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo14137(InterfaceC5949 interfaceC5949, String str, Object obj) {
        mo14133(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo14139(InterfaceC5949 interfaceC5949, String str, Object obj) {
        mo14147(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo14140(InterfaceC5949 interfaceC5949) {
        return isInfoEnabled();
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo14143(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        mo14163(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public boolean mo14145(InterfaceC5949 interfaceC5949) {
        return mo14141();
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo14146(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        mo14156(str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo14148(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        warn(str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo14149(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        mo14164(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public boolean mo14151(InterfaceC5949 interfaceC5949) {
        return isDebugEnabled();
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo14153(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        mo14159(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public void mo14154(InterfaceC5949 interfaceC5949, String str) {
        error(str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public void mo14158(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        mo14127(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo14161(InterfaceC5949 interfaceC5949, String str, Object obj) {
        mo14152(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo14162(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        mo14155(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo14165(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        debug(str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public void mo14166(InterfaceC5949 interfaceC5949, String str) {
        mo14160(str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public void mo14167(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        mo14142(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public boolean mo14168(InterfaceC5949 interfaceC5949) {
        return isErrorEnabled();
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public void mo14169(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        mo14136(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo14170(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        mo14134(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo14171(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        mo14138(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo14172(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        info(str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public boolean mo14173(InterfaceC5949 interfaceC5949) {
        return isWarnEnabled();
    }
}
