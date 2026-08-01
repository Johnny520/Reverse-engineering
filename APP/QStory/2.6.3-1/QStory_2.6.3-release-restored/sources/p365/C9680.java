package p365;

import androidx.activity.AbstractC0900;
import p047.InterfaceC7155;

/* JADX INFO: renamed from: 飘花落叶言苏哲子楪兰世.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C9680 implements InterfaceC7155 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f25298;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f25299;

    public /* synthetic */ C9680(int i, int i2) {
        this.f25299 = i2;
        this.f25298 = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.f25299) {
        }
        return InterfaceC7155.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        int i = this.f25299;
        int i2 = this.f25298;
        switch (i) {
            case 0:
                if (!(obj instanceof InterfaceC7155) || i2 != ((InterfaceC7155) obj).number()) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof InterfaceC7155) || i2 != ((InterfaceC7155) obj).number()) {
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof InterfaceC7155) || i2 != ((InterfaceC7155) obj).number()) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof InterfaceC7155) || i2 != ((InterfaceC7155) obj).number()) {
                    break;
                }
                break;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = this.f25299;
        int i2 = this.f25298;
        switch (i) {
            case 0:
                iHashCode = "number".hashCode() * 127;
                iHashCode2 = Integer.hashCode(i2);
                break;
            case 1:
                iHashCode = "number".hashCode() * 127;
                iHashCode2 = Integer.hashCode(i2);
                break;
            case 2:
                iHashCode = "number".hashCode() * 127;
                iHashCode2 = Integer.hashCode(i2);
                break;
            default:
                iHashCode = "number".hashCode() * 127;
                iHashCode2 = Integer.hashCode(i2);
                break;
        }
        return iHashCode2 ^ iHashCode;
    }

    @Override // p047.InterfaceC7155
    public final /* synthetic */ int number() {
        switch (this.f25299) {
        }
        return this.f25298;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        int i = this.f25299;
        int i2 = this.f25298;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0900.m716(sb, i2, ')');
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0900.m716(sb2, i2, ')');
            case 2:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0900.m716(sb3, i2, ')');
            default:
                StringBuilder sb4 = new StringBuilder();
                sb4.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0900.m716(sb4, i2, ')');
        }
    }
}
