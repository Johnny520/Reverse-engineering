package p241q7;

import okhttp3.internal.url._UrlKt;
import p024b9.AbstractC1043k;
import p281t6.C8173z;
import p281t6.InterfaceC8141d0;

/* JADX INFO: renamed from: q7.j0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6296j0 {

    /* JADX INFO: renamed from: a */
    public final C6319w f19750a;

    /* JADX INFO: renamed from: q7.j0$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC6296j0 {

        /* JADX INFO: renamed from: b */
        public final String f19751b;

        /* JADX INFO: renamed from: c */
        public final C8173z f19752c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C6319w c6319w, String str, C8173z c8173z) {
            super(c6319w, null);
            c6319w.getClass();
            str.getClass();
            c8173z.getClass();
            this.f19751b = str;
            this.f19752c = c8173z;
        }

        /* JADX INFO: renamed from: b */
        public final C8173z m24904b() {
            return this.f19752c;
        }

        public String toString() {
            return "FAILURE \"" + this.f19751b + "\" @ " + m24903a();
        }
    }

    /* JADX INFO: renamed from: q7.j0$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC6296j0 {

        /* JADX INFO: renamed from: b */
        public final InterfaceC8141d0 f19753b;

        /* JADX INFO: renamed from: c */
        public final double f19754c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C6319w c6319w, InterfaceC8141d0 interfaceC8141d0, double d10) {
            super(c6319w, null);
            c6319w.getClass();
            interfaceC8141d0.getClass();
            this.f19753b = interfaceC8141d0;
            this.f19754c = d10;
        }

        /* JADX INFO: renamed from: b */
        public InterfaceC8141d0 m24905b() {
            return this.f19753b;
        }

        /* JADX INFO: renamed from: c */
        public final double m24906c() {
            return this.f19754c;
        }

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("SUCCESS");
            if (m24905b().isEmpty()) {
                str = _UrlKt.FRAGMENT_ENCODE_SET;
            } else {
                str = "; " + m24905b();
            }
            sb2.append(str);
            sb2.append(" @ ");
            sb2.append(m24903a());
            return sb2.toString();
        }
    }

    public AbstractC6296j0(C6319w c6319w) {
        this.f19750a = c6319w;
    }

    /* JADX INFO: renamed from: a */
    public final C6319w m24903a() {
        return this.f19750a;
    }

    public /* synthetic */ AbstractC6296j0(C6319w c6319w, AbstractC1043k abstractC1043k) {
        this(c6319w);
    }
}
