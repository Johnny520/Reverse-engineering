package p312v8;

import java.time.Instant;
import p297u8.AbstractC8565a;
import p314vb.C8904k;
import p314vb.InterfaceC8893a;
import p328wb.AbstractC9212a;

/* JADX INFO: renamed from: v8.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public class C8854a extends AbstractC8565a {

    /* JADX INFO: renamed from: v8.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f29407a = new a();

        /* JADX INFO: renamed from: b */
        public static final Integer f29408b;

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
            f29408b = num;
        }
    }

    /* JADX INFO: renamed from: v8.a$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b implements InterfaceC8893a {
        @Override // p314vb.InterfaceC8893a
        /* JADX INFO: renamed from: a */
        public C8904k mo34000a() {
            Instant instantNow = Instant.now();
            instantNow.getClass();
            return AbstractC9212a.m35876a(instantNow);
        }
    }

    /* JADX INFO: renamed from: v8.a$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c implements InterfaceC8893a {
        @Override // p314vb.InterfaceC8893a
        /* JADX INFO: renamed from: a */
        public C8904k mo34000a() {
            return C8904k.f29505s.m34178a(System.currentTimeMillis());
        }
    }

    @Override // p283t8.AbstractC8203a
    /* JADX INFO: renamed from: c */
    public InterfaceC8893a mo31891c() {
        return m33999d(26) ? new b() : new c();
    }

    /* JADX INFO: renamed from: d */
    public final boolean m33999d(int i10) {
        Integer num = a.f29408b;
        return num == null || num.intValue() >= i10;
    }
}
