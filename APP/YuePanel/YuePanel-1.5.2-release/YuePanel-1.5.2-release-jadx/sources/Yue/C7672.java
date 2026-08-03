package Yue;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Queue;

/* JADX INFO: renamed from: Yue.ۥۢ۠ۤۢ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes2.dex */
public class C7672 implements InterfaceC5866 {

    /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
    public final String f23078;

    /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
    public volatile InterfaceC5866 f23079;

    /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
    public Boolean f23080;

    /* JADX INFO: renamed from: ۥ۟۟۠ۦ, reason: contains not printable characters */
    public Method f23081;

    /* JADX INFO: renamed from: ۥ۟۟۠ۧ, reason: contains not printable characters */
    public C4724 f23082;

    /* JADX INFO: renamed from: ۥ۟۟۠ۨ, reason: contains not printable characters */
    public Queue<C7674> f23083;

    /* JADX INFO: renamed from: ۥ۟۟ۡ, reason: contains not printable characters */
    public final boolean f23084;

    public C7672(String str, Queue<C7674> queue, boolean z) {
        this.f23078 = str;
        this.f23083 = queue;
        this.f23084 = z;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void debug(String str) {
        m24406().debug(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.f23078.equals(((C7672) obj).f23078);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void error(String str) {
        m24406().error(str);
    }

    @Override // Yue.InterfaceC5866
    public String getName() {
        return this.f23078;
    }

    public int hashCode() {
        return this.f23078.hashCode();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void info(String str) {
        m24406().info(str);
    }

    @Override // Yue.InterfaceC5866
    public boolean isDebugEnabled() {
        return m24406().isDebugEnabled();
    }

    @Override // Yue.InterfaceC5866
    public boolean isErrorEnabled() {
        return m24406().isErrorEnabled();
    }

    @Override // Yue.InterfaceC5866
    public boolean isInfoEnabled() {
        return m24406().isInfoEnabled();
    }

    @Override // Yue.InterfaceC5866
    public boolean isWarnEnabled() {
        return m24406().isWarnEnabled();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // Yue.InterfaceC5866
    public void warn(String str) {
        m24406().warn(str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ */
    public void mo1638(InterfaceC5949 interfaceC5949, String str) {
        m24406().mo1638(interfaceC5949, str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟ */
    public void mo1639(String str, Object obj) {
        m24406().mo1639(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ */
    public void mo14126(String str, Object obj) {
        m24406().mo14126(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ */
    public void mo14127(String str, Object obj, Object obj2) {
        m24406().mo14127(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟۟ */
    public void mo14128(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m24406().mo14128(interfaceC5949, str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟۠ */
    public void mo14129(InterfaceC5949 interfaceC5949, String str) {
        m24406().mo14129(interfaceC5949, str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ */
    public void mo14130(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m24406().mo14130(interfaceC5949, str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ */
    public void mo14131(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m24406().mo14131(interfaceC5949, str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo14132(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m24406().mo14132(interfaceC5949, str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ */
    public void mo14133(String str, Object obj) {
        m24406().mo14133(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ */
    public void mo14134(String str, Object obj, Object obj2) {
        m24406().mo14134(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ */
    public void mo14135(InterfaceC5949 interfaceC5949, String str) {
        m24406().mo14135(interfaceC5949, str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ */
    public void mo14136(String str, Object... objArr) {
        m24406().mo14136(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ */
    public void mo14137(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m24406().mo14137(interfaceC5949, str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠۟ */
    public void mo14138(String str, Object obj, Object obj2) {
        m24406().mo14138(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠۠ */
    public void mo14139(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m24406().mo14139(interfaceC5949, str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۡ */
    public boolean mo14140(InterfaceC5949 interfaceC5949) {
        return m24406().mo14140(interfaceC5949);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۢ */
    public boolean mo14141() {
        return m24406().mo14141();
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo14142(String str, Object obj, Object obj2) {
        m24406().mo14142(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۤ */
    public void mo14143(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m24406().mo14143(interfaceC5949, str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۥ */
    public void mo14144(String str, Object... objArr) {
        m24406().mo14144(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۦ */
    public boolean mo14145(InterfaceC5949 interfaceC5949) {
        return m24406().mo14145(interfaceC5949);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۧ */
    public void mo14146(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m24406().mo14146(interfaceC5949, str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟۠ۨ */
    public void mo14147(String str, Object obj) {
        m24406().mo14147(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡ */
    public void mo14148(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m24406().mo14148(interfaceC5949, str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡ۟ */
    public void mo14149(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m24406().mo14149(interfaceC5949, str, obj, obj2);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡ۠, reason: contains not printable characters */
    public InterfaceC5866 m24406() {
        return this.f23079 != null ? this.f23079 : this.f23084 ? C6340.f16114 : m24407();
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۡ */
    public boolean mo14151(InterfaceC5949 interfaceC5949) {
        return m24406().mo14151(interfaceC5949);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۢ */
    public void mo14152(String str, Object obj) {
        m24406().mo14152(str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo14153(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m24406().mo14153(interfaceC5949, str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۤ */
    public void mo14154(InterfaceC5949 interfaceC5949, String str) {
        m24406().mo14154(interfaceC5949, str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۥ */
    public void mo14155(String str, Object... objArr) {
        m24406().mo14155(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۦ */
    public void mo14156(String str, Throwable th) {
        m24406().mo14156(str, th);
    }

    /* JADX INFO: renamed from: ۥ۟۟ۡۧ, reason: contains not printable characters */
    public final InterfaceC5866 m24407() {
        if (this.f23082 == null) {
            this.f23082 = new C4724(this, this.f23083);
        }
        return this.f23082;
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۡۨ */
    public void mo14158(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m24406().mo14158(interfaceC5949, str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢ */
    public void mo14159(String str, Object... objArr) {
        m24406().mo14159(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢ۟ */
    public void mo14160(String str) {
        m24406().mo14160(str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢ۠ */
    public void mo14161(InterfaceC5949 interfaceC5949, String str, Object obj) {
        m24406().mo14161(interfaceC5949, str, obj);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۡ */
    public void mo14162(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m24406().mo14162(interfaceC5949, str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۢ */
    public void mo14163(String str, Object... objArr) {
        m24406().mo14163(str, objArr);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public void mo14164(String str, Object obj, Object obj2) {
        m24406().mo14164(str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۤ */
    public void mo14165(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m24406().mo14165(interfaceC5949, str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۥ */
    public void mo14166(InterfaceC5949 interfaceC5949, String str) {
        m24406().mo14166(interfaceC5949, str);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۦ */
    public void mo14167(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m24406().mo14167(interfaceC5949, str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۧ */
    public boolean mo14168(InterfaceC5949 interfaceC5949) {
        return m24406().mo14168(interfaceC5949);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥ۟۟ۢۨ */
    public void mo14169(InterfaceC5949 interfaceC5949, String str, Object... objArr) {
        m24406().mo14169(interfaceC5949, str, objArr);
    }

    /* JADX INFO: renamed from: ۥۣ۟۟, reason: contains not printable characters */
    public boolean m24408() {
        Boolean bool = this.f23080;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.f23081 = this.f23079.getClass().getMethod("log", InterfaceC5869.class);
            this.f23080 = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.f23080 = Boolean.FALSE;
        }
        return this.f23080.booleanValue();
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۟ */
    public void mo14170(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m24406().mo14170(interfaceC5949, str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟۠ */
    public void mo14171(InterfaceC5949 interfaceC5949, String str, Object obj, Object obj2) {
        m24406().mo14171(interfaceC5949, str, obj, obj2);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۡ */
    public void mo14172(InterfaceC5949 interfaceC5949, String str, Throwable th) {
        m24406().mo14172(interfaceC5949, str, th);
    }

    @Override // Yue.InterfaceC5866
    /* JADX INFO: renamed from: ۥۣ۟۟ۢ */
    public boolean mo14173(InterfaceC5949 interfaceC5949) {
        return m24406().mo14173(interfaceC5949);
    }

    /* JADX INFO: renamed from: ۥۣۣ۟۟, reason: contains not printable characters */
    public boolean m24409() {
        return this.f23079 instanceof C6340;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۤ, reason: contains not printable characters */
    public boolean m24410() {
        return this.f23079 == null;
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۥ, reason: contains not printable characters */
    public void m24411(InterfaceC5869 interfaceC5869) {
        if (m24408()) {
            try {
                this.f23081.invoke(this.f23079, interfaceC5869);
            } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: ۥۣ۟۟ۦ, reason: contains not printable characters */
    public void m24412(InterfaceC5866 interfaceC5866) {
        this.f23079 = interfaceC5866;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void debug(String str, Throwable th) {
        m24406().debug(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void error(String str, Throwable th) {
        m24406().error(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void info(String str, Throwable th) {
        m24406().info(str, th);
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 2 */
    @Override // Yue.InterfaceC5866
    public void warn(String str, Throwable th) {
        m24406().warn(str, th);
    }
}
