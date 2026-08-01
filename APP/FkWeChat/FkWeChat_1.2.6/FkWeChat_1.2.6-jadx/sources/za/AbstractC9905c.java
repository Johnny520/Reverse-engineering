package za;

import za.C9906d;

/* JADX INFO: renamed from: za.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC9905c {

    /* JADX INFO: renamed from: za.c$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends AbstractC9905c {

        /* JADX INFO: renamed from: a */
        public static final a f33392a = new a();

        /* JADX INFO: renamed from: b */
        public static final int f33393b;

        static {
            C9906d.a aVar = C9906d.f33395c;
            f33393b = (~(aVar.m38445i() | aVar.m38440d())) & aVar.m38438b();
        }

        @Override // za.AbstractC9905c
        /* JADX INFO: renamed from: a */
        public int mo38422a() {
            return f33393b;
        }
    }

    /* JADX INFO: renamed from: za.c$b */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class b extends AbstractC9905c {

        /* JADX INFO: renamed from: a */
        public static final b f33394a = new b();

        @Override // za.AbstractC9905c
        /* JADX INFO: renamed from: a */
        public int mo38422a() {
            return 0;
        }
    }

    /* JADX INFO: renamed from: a */
    public abstract int mo38422a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
