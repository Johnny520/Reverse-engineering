package p215oc;

import java.io.IOException;
import java.io.InputStream;
import p010a9.InterfaceC0173a;
import p024b9.AbstractC1072z;
import p376zd.C10023w;

/* JADX INFO: renamed from: oc.z */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC5731z {
    /* JADX INFO: renamed from: a */
    public static boolean m23183a() {
        return false;
    }

    /* JADX INFO: renamed from: b */
    public static final InputStream m23184b(InterfaceC5728w interfaceC5728w) {
        InterfaceC0173a interfaceC0173a;
        interfaceC5728w.getClass();
        if (interfaceC5728w instanceof C5719n) {
            interfaceC0173a = new AbstractC1072z(interfaceC5728w) { // from class: oc.z.b
                @Override // p098g9.InterfaceC2558l
                public Object get() {
                    return Boolean.valueOf(((C5719n) this.f3190r).f18046r);
                }
            };
        } else {
            if (!(interfaceC5728w instanceof C5708d)) {
                C5729x.m23182a();
                return null;
            }
            interfaceC0173a = new InterfaceC0173a() { // from class: oc.y
                @Override // p010a9.InterfaceC0173a
                public final Object invoke() {
                    return Boolean.valueOf(AbstractC5731z.m23183a());
                }
            };
        }
        return new a(interfaceC0173a, interfaceC5728w);
    }

    /* JADX INFO: renamed from: oc.z$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    public static final class a extends InputStream {

        /* JADX INFO: renamed from: q */
        public final /* synthetic */ InterfaceC0173a f18069q;

        /* JADX INFO: renamed from: r */
        public final /* synthetic */ InterfaceC5728w f18070r;

        public a(InterfaceC0173a interfaceC0173a, InterfaceC5728w interfaceC5728w) {
            this.f18069q = interfaceC0173a;
            this.f18070r = interfaceC5728w;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            if (!((Boolean) this.f18069q.invoke()).booleanValue()) {
                return (int) Math.min(this.f18070r.mo23102b().m23111j(), Integer.MAX_VALUE);
            }
            C10023w.m38841a("Underlying source is closed.");
            return 0;
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f18070r.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (((Boolean) this.f18069q.invoke()).booleanValue()) {
                C10023w.m38841a("Underlying source is closed.");
                return 0;
            }
            if (this.f18070r.mo23108g()) {
                return -1;
            }
            return this.f18070r.readByte() & 255;
        }

        public String toString() {
            return this.f18070r + ".asInputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            bArr.getClass();
            if (!((Boolean) this.f18069q.invoke()).booleanValue()) {
                AbstractC5709d0.m23125b(bArr.length, i10, i11);
                return this.f18070r.mo23098H(bArr, i10, i11 + i10);
            }
            C10023w.m38841a("Underlying source is closed.");
            return 0;
        }
    }
}
