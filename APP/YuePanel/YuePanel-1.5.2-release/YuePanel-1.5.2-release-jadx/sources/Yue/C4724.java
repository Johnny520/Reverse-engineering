package Yue;

import java.util.Queue;

/* JADX INFO: renamed from: Yue.ۥ۠ۡۡۨ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C4724 implements InterfaceC5866 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public String f10096;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public C7672 f10097;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Queue<C7674> f10098;

    public C4724(C7672 c7672, Queue<C7674> queue) {
        this.f10097 = c7672;
        this.f10096 = c7672.getName();
        this.f10098 = queue;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void debug(String str) {
        m14157(EnumC5694.TRACE, str, null, null);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void error(String str) {
        m14157(EnumC5694.ERROR, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    public String getName() {
        return this.f10096;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void info(String str) {
        m14157(EnumC5694.INFO, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    public boolean isDebugEnabled() {
        return true;
    }

    @Override // Yue.InterfaceC5866
    public boolean isErrorEnabled() {
        return true;
    }

    @Override // Yue.InterfaceC5866
    public boolean isInfoEnabled() {
        return true;
    }

    @Override // Yue.InterfaceC5866
    public boolean isWarnEnabled() {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void warn(String str) {
        m14157(EnumC5694.WARN, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ */
    public void mo1638(InterfaceC5949 interfaceC5949, String str) {
        m14157(EnumC5694.WARN, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1639(String str, Object obj) {
        m14157(EnumC5694.INFO, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public void mo14126(String str, Object obj) {
        m14157(EnumC5694.WARN, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public void mo14127(String str, Object obj, Object obj2) {
        m14157(EnumC5694.DEBUG, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public void mo14128(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m14150(EnumC5694.ERROR, interfaceC5949, str, null, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public void mo14129(InterfaceC5949 interfaceC5949, String str) {
        m14150(EnumC5694.INFO, interfaceC5949, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public void mo14130(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m14157(EnumC5694.WARN, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public void mo14131(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m14150(EnumC5694.ERROR, interfaceC5949, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo14132(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m14150(EnumC5694.INFO, interfaceC5949, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public void mo14133(String str, Object obj) {
        m14157(EnumC5694.TRACE, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public void mo14134(String str, Object obj, Object obj2) {
        m14157(EnumC5694.TRACE, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public void mo14135(InterfaceC5949 interfaceC5949, String str) {
        m14150(EnumC5694.DEBUG, interfaceC5949, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public void mo14136(String str, Object... objArr) {
        m14157(EnumC5694.WARN, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public void mo14137(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m14150(EnumC5694.TRACE, interfaceC5949, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠۟, reason: contains not printable characters */
    public void mo14138(String str, Object obj, Object obj2) {
        m14157(EnumC5694.WARN, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠۠, reason: contains not printable characters */
    public void mo14139(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m14150(EnumC5694.DEBUG, interfaceC5949, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ, reason: contains not printable characters */
    public boolean mo14140(InterfaceC5949 interfaceC5949) {
        return true;
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ, reason: contains not printable characters */
    public boolean mo14141() {
        return true;
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo14142(String str, Object obj, Object obj2) {
        m14157(EnumC5694.ERROR, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public void mo14143(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m14150(EnumC5694.INFO, interfaceC5949, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public void mo14144(String str, Object... objArr) {
        m14157(EnumC5694.ERROR, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public boolean mo14145(InterfaceC5949 interfaceC5949) {
        return true;
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public void mo14146(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m14150(EnumC5694.TRACE, interfaceC5949, str, null, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public void mo14147(String str, Object obj) {
        m14157(EnumC5694.DEBUG, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public void mo14148(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m14150(EnumC5694.WARN, interfaceC5949, str, null, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟, reason: contains not printable characters */
    public void mo14149(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m14150(EnumC5694.INFO, interfaceC5949, str, new Object[]{obj, obj2}, null);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public final void m14150(EnumC5694 enumC5694, InterfaceC5949 interfaceC5949, String str, Object[] objArr, Throwable th) {
        C7674 c7674 = new C7674();
        c7674.m24426(System.currentTimeMillis());
        c7674.m24419(enumC5694);
        c7674.m24420(this.f10097);
        c7674.m24421(this.f10096);
        c7674.m24422(interfaceC5949);
        c7674.m24423(str);
        c7674.m24418(objArr);
        c7674.m24425(th);
        c7674.m24424(Thread.currentThread().getName());
        this.f10098.add(c7674);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ, reason: contains not printable characters */
    public boolean mo14151(InterfaceC5949 interfaceC5949) {
        return true;
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ, reason: contains not printable characters */
    public void mo14152(String str, Object obj) {
        m14157(EnumC5694.ERROR, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void mo14153(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m14150(EnumC5694.TRACE, interfaceC5949, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ, reason: contains not printable characters */
    public void mo14154(InterfaceC5949 interfaceC5949, String str) {
        m14150(EnumC5694.ERROR, interfaceC5949, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ, reason: contains not printable characters */
    public void mo14155(String str, Object... objArr) {
        m14157(EnumC5694.DEBUG, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ, reason: contains not printable characters */
    public void mo14156(String str, Throwable th) {
        m14157(EnumC5694.TRACE, str, null, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final void m14157(EnumC5694 enumC5694, String str, Object[] objArr, Throwable th) {
        m14150(enumC5694, null, str, objArr, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ, reason: contains not printable characters */
    public void mo14158(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m14150(EnumC5694.DEBUG, interfaceC5949, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢ, reason: contains not printable characters */
    public void mo14159(String str, Object... objArr) {
        m14157(EnumC5694.TRACE, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟, reason: contains not printable characters */
    public void mo14160(String str) {
        m14157(EnumC5694.TRACE, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠, reason: contains not printable characters */
    public void mo14161(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m14150(EnumC5694.ERROR, interfaceC5949, str, new Object[]{obj}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ, reason: contains not printable characters */
    public void mo14162(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m14150(EnumC5694.DEBUG, interfaceC5949, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ, reason: contains not printable characters */
    public void mo14163(String str, Object... objArr) {
        m14157(EnumC5694.INFO, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public void mo14164(String str, Object obj, Object obj2) {
        m14157(EnumC5694.INFO, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ, reason: contains not printable characters */
    public void mo14165(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m14150(EnumC5694.DEBUG, interfaceC5949, str, null, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ, reason: contains not printable characters */
    public void mo14166(InterfaceC5949 interfaceC5949, String str) {
        m14150(EnumC5694.TRACE, interfaceC5949, str, null, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ, reason: contains not printable characters */
    public void mo14167(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m14150(EnumC5694.ERROR, interfaceC5949, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ, reason: contains not printable characters */
    public boolean mo14168(InterfaceC5949 interfaceC5949) {
        return true;
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ, reason: contains not printable characters */
    public void mo14169(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m14150(EnumC5694.WARN, interfaceC5949, str, objArr, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public void mo14170(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m14150(EnumC5694.TRACE, interfaceC5949, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public void mo14171(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m14150(EnumC5694.WARN, interfaceC5949, str, new Object[]{obj, obj2}, null);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ, reason: contains not printable characters */
    public void mo14172(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m14150(EnumC5694.INFO, interfaceC5949, str, null, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ, reason: contains not printable characters */
    public boolean mo14173(InterfaceC5949 interfaceC5949) {
        return true;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void debug(String str, Throwable th) {
        m14157(EnumC5694.DEBUG, str, null, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void error(String str, Throwable th) {
        m14157(EnumC5694.ERROR, str, null, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void info(String str, Throwable th) {
        m14157(EnumC5694.INFO, str, null, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void warn(String str, Throwable th) {
        m14157(EnumC5694.WARN, str, null, th);
    }
}
