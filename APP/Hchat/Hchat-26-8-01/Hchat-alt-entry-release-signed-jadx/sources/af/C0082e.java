package af;

import okhttp3.HttpUrl;
import p035c8.AbstractC0413b;
import p068eh.AbstractC0921a;
import p099h.Hchat.hooks.api.model.WeChatSnsPost;
import p250qh.InterfaceC3613a;
import p302ud.C4322r;
import p351xe.C5787h;

/* JADX INFO: renamed from: af.e */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C0082e extends Exception {
    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C0082e(String str, InterfaceC3613a interfaceC3613a) {
        String string;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str.concat(" "));
        if (interfaceC3613a == null) {
            string = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            StringBuilder sb3 = new StringBuilder("(position:");
            AbstractC0413b abstractC0413b = (AbstractC0413b) interfaceC3613a;
            StringBuilder sb4 = new StringBuilder("[");
            sb4.append(abstractC0413b.m1386e());
            sb4.append(":");
            int i9 = abstractC0413b.f1172t;
            for (int i10 = 0; i10 < abstractC0413b.f1169q; i10++) {
                i9 = abstractC0413b.f1168p[i10] == '\n' ? 0 : i9 + 1;
            }
            sb4.append(i9 + 1);
            sb4.append("]\n");
            int i11 = abstractC0413b.f1173u;
            sb4.append(i11 < 11 ? InterfaceC3613a.f11646d[i11] : WeChatSnsPost.TYPE_UNKNOWN);
            sb4.append(' ');
            int i12 = abstractC0413b.f1173u;
            if (i12 == 2 || i12 == 3) {
                if (abstractC0413b.f1153A) {
                    sb4.append("(empty) ");
                }
                sb4.append('<');
                if (abstractC0413b.f1173u == 3) {
                    sb4.append('/');
                }
                if (abstractC0413b.f1176x != null) {
                    sb4.append("{");
                    sb4.append(abstractC0413b.f1175w);
                    sb4.append("}");
                    sb4.append(abstractC0413b.f1176x);
                    sb4.append(":");
                }
                sb4.append(abstractC0413b.f1177y);
                int i13 = abstractC0413b.f1154B * 4;
                for (int i14 = 0; i14 < i13; i14 += 4) {
                    sb4.append(' ');
                    int i15 = i14 + 1;
                    if (abstractC0413b.f1156D[i15] != null) {
                        sb4.append("{");
                        sb4.append(abstractC0413b.f1156D[i14]);
                        sb4.append("}");
                        sb4.append(abstractC0413b.f1156D[i15]);
                        sb4.append(":");
                    }
                    sb4.append(abstractC0413b.f1156D[i14 + 2]);
                    sb4.append("='");
                    sb4.append(abstractC0413b.f1156D[i14 + 3]);
                    sb4.append("'");
                }
                sb4.append('>');
            } else if (i12 == 7) {
                sb4.append("(whitespace)");
            } else if (i12 != 4) {
                sb4.append(abstractC0413b.m1388h());
            } else if (abstractC0413b.f1174v) {
                sb4.append("(whitespace)");
            } else {
                String strM1388h = abstractC0413b.m1388h();
                sb4.append(strM1388h.length() > 16 ? strM1388h.substring(0, 16).concat("...") : strM1388h);
            }
            sb3.append(sb4.toString());
            sb3.append(") ");
            string = sb3.toString();
        }
        super(AbstractC0921a.m2255r(sb2, string, HttpUrl.FRAGMENT_ENCODE_SET));
        if (interfaceC3613a != null) {
            AbstractC0413b abstractC0413b2 = (AbstractC0413b) interfaceC3613a;
            abstractC0413b2.m1386e();
            for (int i16 = 0; i16 < abstractC0413b2.f1169q; i16++) {
                char c10 = abstractC0413b2.f1168p[i16];
            }
        }
    }

    public C0082e(C4322r c4322r, String str, Exception exc) {
        super(C5787h.m10469b(c4322r, str), exc);
    }
}
