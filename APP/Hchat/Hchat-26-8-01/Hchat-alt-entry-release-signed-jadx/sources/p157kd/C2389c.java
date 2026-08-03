package p157kd;

import java.util.function.IntConsumer;
import java.util.regex.Pattern;
import p020b5.C0192k;
import p351xe.C5796q;

/* JADX INFO: renamed from: kd.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C2389c implements IntConsumer {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f7851a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f7852b;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public /* synthetic */ C2389c(C5796q c5796q, StringBuilder sb2) {
        this.f7851a = 2;
        this.f7852b = sb2;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // java.util.function.IntConsumer
    public final void accept(int i9) {
        int type;
        int i10 = this.f7851a;
        boolean z9 = true;
        Object obj = this.f7852b;
        switch (i10) {
            case 0:
                StringBuilder sb2 = (StringBuilder) obj;
                if (AbstractC2390d.m5713b(i9)) {
                    sb2.appendCodePoint(i9);
                }
                break;
            case 1:
                StringBuilder sb3 = (StringBuilder) obj;
                if (AbstractC2390d.m5713b(i9) && Character.isJavaIdentifierPart(i9)) {
                    sb3.appendCodePoint(i9);
                    break;
                }
                break;
            case 2:
                StringBuilder sb4 = (StringBuilder) obj;
                String strM10500f = C5796q.m10500f(i9);
                if (strM10500f == null) {
                    if (i9 >= 32) {
                        boolean z10 = false;
                        if (i9 < 127) {
                            z9 = false;
                        } else {
                            Pattern pattern = AbstractC2390d.f7853a;
                            if (!Character.isISOControl(i9) && (!Character.isWhitespace(i9) ? !((type = Character.getType(i9)) == 0 || type == 15 || type == 16 || type == 18 || type == 19) : i9 == 32)) {
                                z10 = true;
                            }
                            z9 = true ^ z10;
                        }
                    }
                    if (!z9) {
                        sb4.appendCodePoint(i9);
                    } else {
                        sb4.append("\\u");
                        sb4.append(String.format("%04x", Integer.valueOf(i9)));
                    }
                } else {
                    sb4.append(strM10500f);
                }
                break;
            default:
                C0192k c0192k = (C0192k) obj;
                if (Character.isDigit(i9)) {
                    c0192k.f489c++;
                }
                c0192k.f488b++;
                break;
        }
    }

    public /* synthetic */ C2389c(Object obj, int i9) {
        this.f7851a = i9;
        this.f7852b = obj;
    }
}
