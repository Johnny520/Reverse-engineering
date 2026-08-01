package p263s;

import android.os.Parcel;
import android.util.Base64;
import p004a3.C0052p;
import p004a3.C0053q;
import p004a3.C0054r;
import p104h3.C2848a;
import p104h3.C2858k;
import p104h3.C2864q;
import p121i3.AbstractC3194x;
import p121i3.C3193w;
import p121i3.C3195y;
import p185m8.AbstractC5114x;
import p250r1.C6455e;
import p265s1.AbstractC7087i0;
import p265s1.C7080g3;
import p265s1.C7128q1;
import p319w2.C9067f3;

/* JADX INFO: renamed from: s.c */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C6633c {

    /* JADX INFO: renamed from: a */
    public final Parcel f20767a;

    public C6633c(String str) {
        Parcel parcelObtain = Parcel.obtain();
        this.f20767a = parcelObtain;
        byte[] bArrDecode = Base64.decode(str, 0);
        parcelObtain.unmarshall(bArrDecode, 0, bArrDecode.length);
        parcelObtain.setDataPosition(0);
    }

    /* JADX INFO: renamed from: a */
    public final int m26286a() {
        return this.f20767a.dataAvail();
    }

    /* JADX INFO: renamed from: b */
    public final float m26287b() {
        return C2848a.m10094c(m26290e());
    }

    /* JADX INFO: renamed from: c */
    public final byte m26288c() {
        return this.f20767a.readByte();
    }

    /* JADX INFO: renamed from: d */
    public final long m26289d() {
        return AbstractC7087i0.m27899a(C7128q1.f23644b, this.f20767a.readLong());
    }

    /* JADX INFO: renamed from: e */
    public final float m26290e() {
        return this.f20767a.readFloat();
    }

    /* JADX INFO: renamed from: f */
    public final int m26291f() {
        byte bM26288c = m26288c();
        return bM26288c == 0 ? C0052p.f99b.m178b() : bM26288c == 1 ? C0052p.f99b.m177a() : C0052p.f99b.m178b();
    }

    /* JADX INFO: renamed from: g */
    public final int m26292g() {
        byte bM26288c = m26288c();
        return bM26288c == 0 ? C0053q.f103b.m191b() : bM26288c == 1 ? C0053q.f103b.m190a() : bM26288c == 3 ? C0053q.f103b.m192c() : bM26288c == 2 ? C0053q.f103b.m193d() : C0053q.f103b.m191b();
    }

    /* JADX INFO: renamed from: h */
    public final C0054r m26293h() {
        return new C0054r(m26294i());
    }

    /* JADX INFO: renamed from: i */
    public final int m26294i() {
        return this.f20767a.readInt();
    }

    /* JADX INFO: renamed from: j */
    public final C7080g3 m26295j() {
        long jM26289d = m26289d();
        float fM26290e = m26290e();
        return new C7080g3(jM26289d, C6455e.m25551e((((long) Float.floatToRawIntBits(m26290e())) & 4294967295L) | (Float.floatToRawIntBits(fM26290e) << 32)), m26290e(), null);
    }

    /* JADX INFO: renamed from: k */
    public final C9067f3 m26296k() {
        C6636f c6636f = new C6636f(0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 16383, null);
        while (this.f20767a.dataAvail() > 1) {
            byte bM26288c = m26288c();
            if (bM26288c != 1) {
                if (bM26288c != 2) {
                    if (bM26288c != 3) {
                        if (bM26288c != 4) {
                            if (bM26288c != 5) {
                                if (bM26288c != 6) {
                                    if (bM26288c != 7) {
                                        if (bM26288c != 8) {
                                            if (bM26288c != 9) {
                                                if (bM26288c != 10) {
                                                    if (bM26288c != 11) {
                                                        if (bM26288c == 12) {
                                                            if (m26286a() < 20) {
                                                                break;
                                                            }
                                                            c6636f.m26332j(m26295j());
                                                        } else {
                                                            continue;
                                                        }
                                                    } else {
                                                        if (m26286a() < 4) {
                                                            break;
                                                        }
                                                        c6636f.m26333k(m26298m());
                                                    }
                                                } else {
                                                    if (m26286a() < 8) {
                                                        break;
                                                    }
                                                    c6636f.m26323a(m26289d());
                                                }
                                            } else {
                                                if (m26286a() < 8) {
                                                    break;
                                                }
                                                c6636f.m26334l(m26299n());
                                            }
                                        } else {
                                            if (m26286a() < 4) {
                                                break;
                                            }
                                            c6636f.m26324b(C2848a.m10093b(m26287b()));
                                        }
                                    } else {
                                        if (m26286a() < 5) {
                                            break;
                                        }
                                        c6636f.m26331i(m26300o());
                                    }
                                } else {
                                    c6636f.m26326d(m26297l());
                                }
                            } else {
                                if (m26286a() < 1) {
                                    break;
                                }
                                c6636f.m26329g(C0053q.m183e(m26292g()));
                            }
                        } else {
                            if (m26286a() < 1) {
                                break;
                            }
                            c6636f.m26328f(C0052p.m170c(m26291f()));
                        }
                    } else {
                        if (m26286a() < 4) {
                            break;
                        }
                        c6636f.m26330h(m26293h());
                    }
                } else {
                    if (m26286a() < 5) {
                        break;
                    }
                    c6636f.m26327e(m26300o());
                }
            } else {
                if (m26286a() < 8) {
                    break;
                }
                c6636f.m26325c(m26289d());
            }
        }
        return c6636f.m26335m();
    }

    /* JADX INFO: renamed from: l */
    public final String m26297l() {
        return this.f20767a.readString();
    }

    /* JADX INFO: renamed from: m */
    public final C2858k m26298m() {
        int iM26294i = m26294i();
        C2858k.a aVar = C2858k.f7480b;
        boolean z10 = (aVar.m10238b().m10236e() & iM26294i) != 0;
        boolean z11 = (iM26294i & aVar.m10240d().m10236e()) != 0;
        return (z10 && z11) ? aVar.m10237a(AbstractC5114x.m20803r(aVar.m10238b(), aVar.m10240d())) : z10 ? aVar.m10238b() : z11 ? aVar.m10240d() : aVar.m10239c();
    }

    /* JADX INFO: renamed from: n */
    public final C2864q m26299n() {
        return new C2864q(m26290e(), m26290e());
    }

    /* JADX INFO: renamed from: o */
    public final long m26300o() {
        byte bM26288c = m26288c();
        long jM12128b = bM26288c == 1 ? C3195y.f8493b.m12128b() : bM26288c == 2 ? C3195y.f8493b.m12127a() : C3195y.f8493b.m12129c();
        return C3195y.m12123g(jM12128b, C3195y.f8493b.m12129c()) ? C3193w.f8489b.m12108a() : AbstractC3194x.m12109a(m26290e(), jM12128b);
    }
}
