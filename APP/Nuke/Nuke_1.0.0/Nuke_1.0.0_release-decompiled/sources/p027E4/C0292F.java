package p027E4;

import java.util.Objects;
import me.dartcv.nuke.BuildConfig;

/* JADX INFO: renamed from: E4.F */
/* JADX INFO: loaded from: classes.dex */
public final class C0292F extends AbstractC0315b0 {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f936d;

    /* JADX INFO: renamed from: e */
    public final String f937e;

    /* JADX INFO: renamed from: f */
    public final C0314b f938f;

    /* JADX INFO: renamed from: g */
    public final boolean f939g;

    public C0292F(int i5, String str, boolean z5) {
        this.f936d = i5;
        switch (i5) {
            case BuildConfig.VERSION_CODE /* 1 */:
                C0314b c0314b = C0314b.f1031e;
                Objects.requireNonNull(str, "name == null");
                this.f937e = str;
                this.f938f = c0314b;
                this.f939g = z5;
                break;
            case 2:
                C0314b c0314b2 = C0314b.f1031e;
                Objects.requireNonNull(str, "name == null");
                this.f937e = str;
                this.f938f = c0314b2;
                this.f939g = z5;
                break;
            default:
                C0314b c0314b3 = C0314b.f1031e;
                Objects.requireNonNull(str, "name == null");
                this.f937e = str;
                this.f938f = c0314b3;
                this.f939g = z5;
                break;
        }
    }

    @Override // p027E4.AbstractC0315b0
    /* JADX INFO: renamed from: a */
    public final void mo515a(C0303Q c0303q, Object obj) {
        switch (this.f936d) {
            case 0:
                if (obj != null) {
                    this.f938f.getClass();
                    String string = obj.toString();
                    if (string != null) {
                        c0303q.m522a(this.f937e, string, this.f939g);
                        break;
                    }
                }
                break;
            case BuildConfig.VERSION_CODE /* 1 */:
                if (obj != null) {
                    this.f938f.getClass();
                    String string2 = obj.toString();
                    if (string2 != null) {
                        c0303q.m523b(this.f937e, string2, this.f939g);
                        break;
                    }
                }
                break;
            default:
                if (obj != null) {
                    this.f938f.getClass();
                    String string3 = obj.toString();
                    if (string3 != null) {
                        c0303q.m525d(this.f937e, string3, this.f939g);
                        break;
                    }
                }
                break;
        }
    }
}
