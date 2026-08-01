package p139j6;

import p024b9.AbstractC1043k;
import p024b9.AbstractC1061t;

/* JADX INFO: renamed from: j6.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3606c {

    /* JADX INFO: renamed from: j6.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC3606c {

        /* JADX INFO: renamed from: a */
        public final String f10018a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(null);
            str.getClass();
            this.f10018a = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m13489a() {
            return this.f10018a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && AbstractC1061t.m3842c(this.f10018a, ((a) obj).f10018a);
        }

        public int hashCode() {
            return this.f10018a.hashCode();
        }

        public String toString() {
            return "Decrease(change=" + this.f10018a + ")";
        }
    }

    /* JADX INFO: renamed from: j6.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC3606c {

        /* JADX INFO: renamed from: a */
        public static final b f10019a = new b();

        public b() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public int hashCode() {
            return -221356426;
        }

        public String toString() {
            return "Full";
        }
    }

    /* JADX INFO: renamed from: j6.c$c */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class c extends AbstractC3606c {

        /* JADX INFO: renamed from: a */
        public final String f10020a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(null);
            str.getClass();
            this.f10020a = str;
        }

        /* JADX INFO: renamed from: a */
        public final String m13490a() {
            return this.f10020a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && AbstractC1061t.m3842c(this.f10020a, ((c) obj).f10020a);
        }

        public int hashCode() {
            return this.f10020a.hashCode();
        }

        public String toString() {
            return "Increase(change=" + this.f10020a + ")";
        }
    }

    /* JADX INFO: renamed from: j6.c$d */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class d extends AbstractC3606c {

        /* JADX INFO: renamed from: a */
        public static final d f10021a = new d();

        public d() {
            super(null);
        }

        public boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public int hashCode() {
            return -221123809;
        }

        public String toString() {
            return "None";
        }
    }

    public /* synthetic */ AbstractC3606c(AbstractC1043k abstractC1043k) {
        this();
    }

    public AbstractC3606c() {
    }
}
