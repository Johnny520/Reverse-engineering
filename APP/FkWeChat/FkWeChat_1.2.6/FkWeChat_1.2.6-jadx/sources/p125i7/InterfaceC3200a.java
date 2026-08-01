package p125i7;

import java.util.ArrayList;
import java.util.List;
import p140j7.AbstractC3611b;
import p228p8.InterfaceC5976f;

/* JADX INFO: renamed from: i7.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public interface InterfaceC3200a {

    /* JADX INFO: renamed from: i7.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static class a {

        /* JADX INFO: renamed from: a */
        public final int f8518a;

        /* JADX INFO: renamed from: b */
        public int f8519b;

        /* JADX INFO: renamed from: c */
        public int f8520c;

        /* JADX INFO: renamed from: d */
        public int f8521d;

        /* JADX INFO: renamed from: e */
        public long f8522e;

        /* JADX INFO: renamed from: f */
        public long f8523f;

        /* JADX INFO: renamed from: g */
        public List f8524g;

        public a() {
            int iM13526b = AbstractC3611b.m13526b();
            this.f8518a = iM13526b;
            this.f8519b = (iM13526b / 2) + 1;
            this.f8520c = (iM13526b / 2) + 1;
            this.f8521d = iM13526b;
            this.f8522e = 1000L;
            this.f8523f = 5000L;
            this.f8524g = new ArrayList();
        }

        /* JADX INFO: renamed from: a */
        public final List m12156a() {
            return this.f8524g;
        }

        /* JADX INFO: renamed from: b */
        public final long m12157b() {
            return this.f8522e;
        }

        /* JADX INFO: renamed from: c */
        public final long m12158c() {
            return this.f8523f;
        }
    }

    /* JADX INFO: renamed from: a */
    InterfaceC3200a mo7331a(boolean z10);

    /* JADX INFO: renamed from: b */
    Object mo12155b(InterfaceC5976f interfaceC5976f);

    /* JADX INFO: renamed from: c */
    void mo7332c(long j10, long j11);
}
