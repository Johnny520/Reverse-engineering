package p075f6;

import java.util.Arrays;
import p068eh.AbstractC0921a;
import p136j8.C2104o;
import p152k7.AbstractC2331a;

/* JADX INFO: renamed from: f6.b */
/* JADX INFO: compiled from: r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496 */
/* JADX INFO: loaded from: classes.dex */
public class C1075b {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f3458a = 0;

    /* JADX INFO: renamed from: b */
    public boolean f3459b;

    /* JADX INFO: renamed from: c */
    public int f3460c;

    /* JADX INFO: renamed from: d */
    public Object f3461d;

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public C1075b(AbstractC2331a abstractC2331a) {
        this.f3461d = abstractC2331a;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    /* JADX INFO: renamed from: a */
    public void m2707a(Object obj) {
        obj.getClass();
        Object[] objArr = (Object[]) this.f3461d;
        int length = objArr.length;
        int i9 = this.f3460c;
        int i10 = i9 + 1;
        if (i10 < 0) {
            C2104o.m5294t("cannot store more than Integer.MAX_VALUE elements");
            return;
        }
        if (i10 > length) {
            length = length + (length >> 1) + 1;
            if (length < i10) {
                length = Integer.highestOneBit(i9) << 1;
            }
            if (length < 0) {
                length = Integer.MAX_VALUE;
            }
        }
        if (length > objArr.length || this.f3459b) {
            this.f3461d = Arrays.copyOf((Object[]) this.f3461d, length);
            this.f3459b = false;
        }
        Object[] objArr2 = (Object[]) this.f3461d;
        int i11 = this.f3460c;
        this.f3460c = i11 + 1;
        objArr2[i11] = obj;
    }

    /* JADX DEBUG: Don't trust debug lines info. Lines numbers was adjusted: min line is 1 */
    public String toString() {
        switch (this.f3458a) {
            case 1:
                boolean z9 = this.f3459b;
                int i9 = this.f3460c;
                return z9 ? AbstractC0921a.m2249l(i9, "FOUND=") : String.valueOf(i9);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C1075b() {
    }
}
