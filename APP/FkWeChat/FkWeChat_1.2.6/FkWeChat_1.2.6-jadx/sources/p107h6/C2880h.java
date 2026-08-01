package p107h6;

import java.io.IOException;
import java.io.Serializable;
import java.io.StreamCorruptedException;
import p024b9.AbstractC1043k;

/* JADX INFO: renamed from: h6.h */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C2880h implements Serializable {

    /* JADX INFO: renamed from: s */
    public static final a f7547s = new a(null);
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: q */
    public final byte[] f7548q;

    /* JADX INFO: renamed from: r */
    public final Class f7549r;

    public C2880h(byte[] bArr, Class cls) {
        bArr.getClass();
        cls.getClass();
        this.f7548q = bArr;
        this.f7549r = cls;
    }

    public final Object readResolve() throws StreamCorruptedException {
        try {
            return AbstractC2882j.f7577i.m10376a(this.f7549r).m10368c(this.f7548q);
        } catch (IOException e10) {
            throw new StreamCorruptedException(e10.getMessage());
        }
    }

    /* JADX INFO: renamed from: h6.h$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a {
        public /* synthetic */ a(AbstractC1043k abstractC1043k) {
            this();
        }

        public a() {
        }
    }
}
