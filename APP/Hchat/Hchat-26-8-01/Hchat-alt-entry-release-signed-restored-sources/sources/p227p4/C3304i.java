package p227p4;

import java.io.IOException;
import java.io.StringWriter;
import okhttp3.HttpUrl;
import p012ah.C0086a;
import p073f4.C1064a;
import p183m8.C2815c;
import p376z4.AbstractC6091e;
import p376z4.C6090d;
import p376z4.C6092f;

/* JADX INFO: renamed from: p4.i */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C3304i extends AbstractC6091e {

    /* JADX INFO: renamed from: i */
    public final int f10491i;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C3304i(int i9, int i10) {
        super(i9);
        this.f10491i = i10;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: o */
    public final int m6991o() {
        int length = this.f24601h.length;
        if (length == 0) {
            return 0;
        }
        AbstractC3303h abstractC3303h = (AbstractC3303h) m10840l(length - 1);
        return abstractC3303h.mo6969b() + abstractC3303h.m6989e();
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: p */
    public final void m6992p(C6090d c6090d) {
        int i9 = c6090d.f24596c;
        int length = this.f24601h.length;
        if (c6090d.m10829d()) {
            boolean z9 = c6090d.f24597d;
            for (int i10 = 0; i10 < length; i10++) {
                AbstractC3303h abstractC3303h = (AbstractC3303h) m10840l(i10);
                int iMo6969b = abstractC3303h.mo6969b() * 2;
                String string = null;
                if (iMo6969b != 0 || z9) {
                    int i11 = c6090d.f24600g;
                    int i12 = c6090d.f24599f - ((i11 / 2) + ((i11 * 2) + 8));
                    String strMo6970g = abstractC3303h.mo6970g();
                    if (strMo6970g != null) {
                        String str = "  " + abstractC3303h.m6990f() + ": ";
                        int length2 = str.length();
                        int length3 = i12 == 0 ? strMo6970g.length() : i12 - length2;
                        StringWriter stringWriter = new StringWriter((str.length() + strMo6970g.length()) * 3);
                        C2815c c2815c = new C2815c(stringWriter, length2, length3, HttpUrl.FRAGMENT_ENCODE_SET);
                        try {
                            ((C6092f) c2815c.f9084e).write(str);
                            ((C6092f) c2815c.f9085f).write(strMo6970g);
                            StringBuffer stringBuffer = (StringBuffer) c2815c.f9083d;
                            StringBuffer stringBuffer2 = (StringBuffer) c2815c.f9082c;
                            C6092f c6092f = (C6092f) c2815c.f9085f;
                            C6092f c6092f2 = (C6092f) c2815c.f9084e;
                            try {
                                C2815c.m6206a(stringBuffer2, c6092f2);
                                C2815c.m6206a(stringBuffer, c6092f);
                                c2815c.m6215i();
                                C2815c.m6206a(stringBuffer2, c6092f2);
                                while (stringBuffer2.length() != 0) {
                                    c6092f.write(10);
                                    c2815c.m6215i();
                                }
                                C2815c.m6206a(stringBuffer, c6092f);
                                while (stringBuffer.length() != 0) {
                                    c6092f2.write(10);
                                    c2815c.m6215i();
                                }
                                string = stringWriter.toString();
                            } catch (IOException e6) {
                                throw new RuntimeException(e6);
                            }
                        } catch (IOException e7) {
                            C0086a.m457p("shouldn't happen", e7);
                            return;
                        }
                    }
                }
                if (string != null) {
                    c6090d.m10827b(iMo6969b, string);
                } else if (iMo6969b != 0) {
                    c6090d.m10827b(iMo6969b, HttpUrl.FRAGMENT_ENCODE_SET);
                }
            }
        }
        for (int i13 = 0; i13 < length; i13++) {
            AbstractC3303h abstractC3303h2 = (AbstractC3303h) m10840l(i13);
            try {
                abstractC3303h2.mo6972l(c6090d);
            } catch (RuntimeException e10) {
                throw C1064a.m2686b("...while writing " + abstractC3303h2, e10);
            }
        }
        int i14 = (c6090d.f24596c - i9) / 2;
        if (i14 == m6991o()) {
            return;
        }
        throw new RuntimeException("write length mismatch; expected " + m6991o() + " but actually wrote " + i14);
    }
}
