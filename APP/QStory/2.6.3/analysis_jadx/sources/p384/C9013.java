package p384;

import androidx.activity.AbstractC0053;
import kotlin.jvm.internal.AbstractC4395;
import p009.AbstractC6183;
import p089.InterfaceC7181;
import p287.AbstractC8405;

/* JADX INFO: renamed from: 飘花落叶言苏楪世子哲兰.飘花落叶言子世哲楪苏兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7181
public final class C9013 {
    public static final C9022 Companion = new C9022();

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final String f25291;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final long f25292;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final int f25293;

    public /* synthetic */ C9013(int i, int i2, long j, String str) {
        this.f25293 = (i & 1) == 0 ? 0 : i2;
        if ((i & 2) == 0) {
            this.f25292 = 0L;
        } else {
            this.f25292 = j;
        }
        if ((i & 4) == 0) {
            this.f25291 = "";
        } else {
            this.f25291 = str;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9013)) {
            return false;
        }
        C9013 c9013 = (C9013) obj;
        return this.f25293 == c9013.f25293 && this.f25292 == c9013.f25292 && AbstractC4395.m8907(this.f25291, c9013.f25291);
    }

    public final int hashCode() {
        return this.f25291.hashCode() + AbstractC0053.m142(Integer.hashCode(this.f25293) * 31, 31, this.f25292);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(AbstractC8405.m13972(1432));
        AbstractC6183.m11578(sb, this.f25293, 1425);
        sb.append(this.f25292);
        sb.append(AbstractC8405.m13972(1433));
        return AbstractC0053.m148(sb, this.f25291, ')');
    }

    public C9013(int i, long j, String str) {
        AbstractC8405.m13972(1431);
        str.getClass();
        this.f25293 = i;
        this.f25292 = j;
        this.f25291 = str;
    }
}
