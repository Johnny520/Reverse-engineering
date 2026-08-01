package p088;

import androidx.activity.AbstractC0053;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7177 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f19152;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f19153;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f19154;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f19155;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f19156;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f19157;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f19158;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f19159;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ClassDiscriminatorMode f19160;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f19161;

    public C7177(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, ClassDiscriminatorMode classDiscriminatorMode, boolean z7) {
        str.getClass();
        str2.getClass();
        classDiscriminatorMode.getClass();
        this.f19157 = z;
        this.f19156 = z2;
        this.f19155 = z3;
        this.f19154 = z4;
        this.f19153 = z5;
        this.f19152 = str;
        this.f19159 = str2;
        this.f19158 = z6;
        this.f19160 = classDiscriminatorMode;
        this.f19161 = z7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.f19157);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.f19156);
        sb.append(", isLenient=");
        sb.append(this.f19155);
        sb.append(", allowStructuredMapKeys=false, prettyPrint=");
        sb.append(this.f19154);
        sb.append(", explicitNulls=");
        sb.append(this.f19153);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f19152);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f19159);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.f19158);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.f19160);
        sb.append(", exceptionsWithDebugInfo=");
        return AbstractC0053.m152(sb, this.f19161, ')');
    }
}
