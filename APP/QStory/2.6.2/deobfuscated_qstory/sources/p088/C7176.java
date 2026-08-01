package p088;

import androidx.activity.AbstractC0053;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* JADX INFO: renamed from: 飘花落叶言世苏兰哲楪子.飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public final class C7176 {

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰哲苏, reason: contains not printable characters */
    public final String f19157;

    /* JADX INFO: renamed from: 飘花落叶言子楪世兰苏哲, reason: contains not printable characters */
    public final boolean f19158;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲兰苏, reason: contains not printable characters */
    public final boolean f19159;

    /* JADX INFO: renamed from: 飘花落叶言子楪世哲苏兰, reason: contains not printable characters */
    public final boolean f19160;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏兰哲, reason: contains not printable characters */
    public final boolean f19161;

    /* JADX INFO: renamed from: 飘花落叶言子楪世苏哲兰, reason: contains not printable characters */
    public final boolean f19162;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世兰哲, reason: contains not printable characters */
    public final boolean f19163;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏世哲兰, reason: contains not printable characters */
    public final String f19164;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲世兰, reason: contains not printable characters */
    public final ClassDiscriminatorMode f19165;

    /* JADX INFO: renamed from: 飘花落叶言子楪苏哲兰世, reason: contains not printable characters */
    public final boolean f19166;

    public C7176(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, String str, String str2, boolean z6, ClassDiscriminatorMode classDiscriminatorMode, boolean z7) {
        str.getClass();
        str2.getClass();
        classDiscriminatorMode.getClass();
        this.f19162 = z;
        this.f19161 = z2;
        this.f19160 = z3;
        this.f19159 = z4;
        this.f19158 = z5;
        this.f19157 = str;
        this.f19164 = str2;
        this.f19163 = z6;
        this.f19165 = classDiscriminatorMode;
        this.f19166 = z7;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=");
        sb.append(this.f19162);
        sb.append(", ignoreUnknownKeys=");
        sb.append(this.f19161);
        sb.append(", isLenient=");
        sb.append(this.f19160);
        sb.append(", allowStructuredMapKeys=false, prettyPrint=");
        sb.append(this.f19159);
        sb.append(", explicitNulls=");
        sb.append(this.f19158);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f19157);
        sb.append("', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f19164);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.f19163);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        sb.append(this.f19165);
        sb.append(", exceptionsWithDebugInfo=");
        return AbstractC0053.m150(sb, this.f19166, ')');
    }
}
