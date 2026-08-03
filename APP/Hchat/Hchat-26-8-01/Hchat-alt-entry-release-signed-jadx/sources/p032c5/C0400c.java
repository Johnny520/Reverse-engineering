package p032c5;

import java.io.IOException;
import p020b5.C0192k;
import p061e5.C0826a;
import p259r9.AbstractC3754e0;
import p342x5.AbstractC5690a;
import p342x5.C5691b;
import p342x5.C5694e;
import p342x5.C5696g;

/* JADX INFO: renamed from: c5.c */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public final class C0400c extends AbstractC0399b {

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ int f1098i;

    /* JADX INFO: renamed from: j */
    public final C0192k f1099j;

    /* JADX INFO: renamed from: k */
    public final AbstractC5690a f1100k;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0400c(int i9, C0192k c0192k, AbstractC5690a abstractC5690a, int i10) {
        super(i9, -1);
        this.f1098i = i10;
        this.f1100k = abstractC5690a;
        this.f1099j = c0192k;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    @Override // p020b5.AbstractC0191j
    /* JADX INFO: renamed from: c */
    public final boolean mo776c(C0826a c0826a) throws IOException {
        switch (this.f1098i) {
            case 0:
                c0826a.write(".end local ");
                C5691b c5691b = (C5691b) this.f1100k;
                this.f1099j.m862o(c0826a, c5691b.f23150h);
                String str = c5691b.f23151i;
                String str2 = c5691b.f23152j;
                String str3 = c5691b.f23153k;
                if (str != null || str2 != null || str3 != null) {
                    c0826a.write("    # ");
                    AbstractC3754e0.m7912s0(c0826a, str, str2, str3);
                }
                break;
            case 1:
                c0826a.write(".restart local ");
                C5694e c5694e = (C5694e) this.f1100k;
                this.f1099j.m862o(c0826a, c5694e.f23156h);
                String str4 = c5694e.f23157i;
                String str5 = c5694e.f23158j;
                String str6 = c5694e.f23159k;
                if (str4 != null || str5 != null || str6 != null) {
                    c0826a.write("    # ");
                    AbstractC3754e0.m7912s0(c0826a, str4, str5, str6);
                }
                break;
            default:
                c0826a.write(".local ");
                C5696g c5696g = (C5696g) this.f1100k;
                this.f1099j.m862o(c0826a, c5696g.f23161h);
                String str7 = c5696g.f23162i;
                String str8 = c5696g.f23163j;
                String str9 = c5696g.f23164k;
                if (str7 != null || str8 != null || str9 != null) {
                    c0826a.write(", ");
                    AbstractC3754e0.m7912s0(c0826a, str7, str8, str9);
                }
                break;
        }
        return true;
    }
}
