package p104h4;

import bsh.C0353j;
import p060e4.C0824a;
import p282t4.C4115b;
import p282t4.C4116c;
import p376z4.AbstractC6096j;

/* JADX INFO: renamed from: h4.r */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1604r extends AbstractC1605s {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ int f5272b = 0;

    /* JADX INFO: renamed from: c */
    public final int f5273c;

    /* JADX INFO: renamed from: d */
    public final AbstractC6096j f5274d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public AbstractC1604r(String str, C4115b c4115b, int i9) {
        super(str);
        try {
            if (c4115b.f24613g) {
                throw new C0824a("annotations.isMutable()", null);
            }
            this.f5274d = c4115b;
            this.f5273c = i9;
        } catch (NullPointerException unused) {
            C0353j.m1305c("annotations == null");
            throw null;
        }
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p104h4.AbstractC1605s
    /* JADX INFO: renamed from: a */
    public final int mo4124a() {
        int i9;
        switch (this.f5272b) {
            case 0:
                i9 = this.f5273c;
                break;
            default:
                i9 = this.f5273c;
                break;
        }
        return i9 + 6;
    }

    public AbstractC1604r(String str, C4116c c4116c, int i9) {
        super(str);
        try {
            if (!c4116c.f24613g) {
                this.f5274d = c4116c;
                this.f5273c = i9;
                return;
            }
            throw new C0824a("parameterAnnotations.isMutable()", null);
        } catch (NullPointerException unused) {
            C0353j.m1305c("parameterAnnotations == null");
            throw null;
        }
    }
}
