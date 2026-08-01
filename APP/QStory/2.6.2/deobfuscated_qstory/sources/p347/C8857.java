package p347;

import androidx.activity.AbstractC0053;
import com.bumptech.glide.AbstractC3056;
import p030.InterfaceC6307;

/* JADX INFO: renamed from: 飘花落叶言苏哲子世楪兰.飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class C8857 implements InterfaceC6307 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final /* synthetic */ int f24967;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final /* synthetic */ int f24968;

    public /* synthetic */ C8857(int i, int i2) {
        this.f24968 = i2;
        this.f24967 = i;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        switch (this.f24968) {
        }
        return InterfaceC6307.class;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        int i = this.f24968;
        int i2 = this.f24967;
        switch (i) {
            case 0:
                if (!(obj instanceof InterfaceC6307) || i2 != ((InterfaceC6307) obj).number()) {
                    break;
                }
                break;
            case 1:
                if (!(obj instanceof InterfaceC6307) || i2 != ((InterfaceC6307) obj).number()) {
                    break;
                }
                break;
            case 2:
                if (!(obj instanceof InterfaceC6307) || i2 != ((InterfaceC6307) obj).number()) {
                    break;
                }
                break;
            default:
                if (!(obj instanceof InterfaceC6307) || i2 != ((InterfaceC6307) obj).number()) {
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
        int i = this.f24968;
        int i2 = this.f24967;
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

    @Override // p030.InterfaceC6307
    public final /* synthetic */ int number() {
        switch (this.f24968) {
        }
        return this.f24967;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        int i = this.f24968;
        int i2 = this.f24967;
        switch (i) {
            case 0:
                StringBuilder sb = new StringBuilder();
                sb.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0053.m154(sb, i2, ')');
            case 1:
                StringBuilder sb2 = new StringBuilder();
                sb2.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0053.m154(sb2, i2, ')');
            case 2:
                StringBuilder sb3 = new StringBuilder();
                sb3.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0053.m154(sb3, i2, ')');
            default:
                StringBuilder sb4 = new StringBuilder();
                sb4.append("@kotlinx.serialization.protobuf.ProtoNumber(number=");
                return AbstractC0053.m154(sb4, i2, ')');
        }
    }
}
