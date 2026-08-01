package p104;

import androidx.activity.AbstractC0900;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C8006 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f19497;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f19498;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f19499;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f19500;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f19501;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f19502;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f19503;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f19504;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ClassDiscriminatorMode f19505;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f19506;

    public C8006(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, ClassDiscriminatorMode classDiscriminatorMode, boolean z7) {
        str.getClass();
        str2.getClass();
        classDiscriminatorMode.getClass();
        this.f19502 = z;
        this.f19501 = z2;
        this.f19500 = z3;
        this.f19499 = z4;
        this.f19498 = z5;
        this.f19497 = str;
        this.f19504 = str2;
        this.f19503 = z6;
        this.f19505 = classDiscriminatorMode;
        this.f19506 = z7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.f19502);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.f19501);
        sb.append(", isLenient=");
        sb.append(this.f19500);
        sb.append(", allowStructuredMapKeys=false, prettyPrint=");
        sb.append(this.f19499);
        sb.append(", explicitNulls=");
        sb.append(this.f19498);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f19497);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f19504);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.f19503);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.f19505);
        sb.append(", exceptionsWithDebugInfo=");
        return AbstractC0900.m712(sb, this.f19506, ')');
    }
}
