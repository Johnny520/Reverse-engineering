package p297u8;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import p185m8.AbstractC5102r;
import p283t8.AbstractC8203a;

/* JADX INFO: renamed from: u8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC8565a extends AbstractC8203a {

    /* JADX INFO: renamed from: u8.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f28602a = new a();

        /* JADX INFO: renamed from: b */
        public static final Integer f28603b;

        static {
            Object obj;
            Integer num = null;
            try {
                obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
            } catch (Throwable unused) {
            }
            Integer num2 = obj instanceof Integer ? (Integer) obj : null;
            if (num2 != null && num2.intValue() > 0) {
                num = num2;
            }
            f28603b = num;
        }
    }

    /* JADX INFO: renamed from: d */
    private final boolean m32969d(int i10) {
        Integer num = a.f28603b;
        return num == null || num.intValue() >= i10;
    }

    @Override // p283t8.AbstractC8203a
    /* JADX INFO: renamed from: a */
    public void mo31889a(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
        th.getClass();
        th2.getClass();
        if (m32969d(19)) {
            th.addSuppressed(th2);
        } else {
            super.mo31889a(th, th2);
        }
    }

    @Override // p283t8.AbstractC8203a
    /* JADX INFO: renamed from: b */
    public List mo31890b(Throwable th) {
        th.getClass();
        if (!m32969d(19)) {
            return super.mo31890b(th);
        }
        Throwable[] suppressed = th.getSuppressed();
        suppressed.getClass();
        return AbstractC5102r.m20652d(suppressed);
    }
}
