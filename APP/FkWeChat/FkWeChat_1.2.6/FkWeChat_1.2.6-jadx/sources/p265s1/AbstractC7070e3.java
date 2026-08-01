package p265s1;

import android.graphics.Shader;
import p024b9.AbstractC1061t;
import p250r1.C6461k;
import p265s1.C7128q1;

/* JADX INFO: renamed from: s1.e3 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7070e3 extends AbstractC7078g1 {

    /* JADX INFO: renamed from: c */
    public C7140s3 f23540c;

    /* JADX INFO: renamed from: d */
    public long f23541d;

    /* JADX INFO: renamed from: e */
    public float[] f23542e;

    public AbstractC7070e3() {
        super(null);
        this.f23541d = C6461k.f20335b.m25626a();
    }

    @Override // p265s1.AbstractC7078g1
    /* JADX INFO: renamed from: a */
    public final void mo27855a(long j10, InterfaceC7134r2 interfaceC7134r2, float f10) {
        C7140s3 c7140s3M27857c = this.f23540c;
        if (c7140s3M27857c == null || !C6461k.m25618f(this.f23541d, j10)) {
            if (C6461k.m25623k(j10)) {
                this.f23540c = null;
                this.f23541d = C6461k.f20335b.m25626a();
                c7140s3M27857c = null;
            } else {
                c7140s3M27857c = m27857c();
                float[] fArr = this.f23542e;
                if (fArr != null) {
                    c7140s3M27857c.m28215d(fArr);
                }
                c7140s3M27857c.m28214c(mo27856b(j10));
                this.f23540c = c7140s3M27857c;
                this.f23541d = j10;
            }
        }
        long jMo28057b = interfaceC7134r2.mo28057b();
        C7128q1.a aVar = C7128q1.f23644b;
        if (!C7128q1.m28131q(jMo28057b, aVar.m28140a())) {
            interfaceC7134r2.mo28076u(aVar.m28140a());
        }
        if (!AbstractC1061t.m3842c(interfaceC7134r2.mo28068m(), c7140s3M27857c != null ? c7140s3M27857c.m28212a() : null)) {
            interfaceC7134r2.mo28067l(c7140s3M27857c != null ? c7140s3M27857c.m28212a() : null);
        }
        if (interfaceC7134r2.mo28056a() == f10) {
            return;
        }
        interfaceC7134r2.mo28060e(f10);
    }

    /* JADX INFO: renamed from: b */
    public abstract Shader mo27856b(long j10);

    /* JADX INFO: renamed from: c */
    public final C7140s3 m27857c() {
        C7140s3 c7140s3 = this.f23540c;
        if (c7140s3 != null) {
            return c7140s3;
        }
        C7140s3 c7140s32 = new C7140s3();
        this.f23540c = c7140s32;
        return c7140s32;
    }
}
