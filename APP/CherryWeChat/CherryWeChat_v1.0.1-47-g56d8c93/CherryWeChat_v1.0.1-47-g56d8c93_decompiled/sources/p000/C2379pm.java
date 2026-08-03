package p000;

/* JADX INFO: renamed from: pm */
/* JADX INFO: loaded from: classes.dex */
public final class C2379pm {

    /* JADX INFO: renamed from: a */
    public final boolean f8371a;

    /* JADX INFO: renamed from: b */
    public final boolean f8372b;

    /* JADX INFO: renamed from: c */
    public final boolean f8373c;

    /* JADX INFO: renamed from: d */
    public final String f8374d;

    /* JADX INFO: renamed from: e */
    public final boolean f8375e;

    /* JADX INFO: renamed from: f */
    public final String f8376f;

    /* JADX INFO: renamed from: g */
    public final boolean f8377g;

    /* JADX INFO: renamed from: h */
    public final int f8378h;

    public C2379pm(boolean z, boolean z2, boolean z3, String str, boolean z4, String str2, boolean z5, int i) {
        this.f8371a = z;
        this.f8372b = z2;
        this.f8373c = z3;
        this.f8374d = str;
        this.f8375e = z4;
        this.f8376f = str2;
        this.f8377g = z5;
        this.f8378h = i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=");
        sb.append(this.f8371a);
        sb.append(", isLenient=");
        sb.append(this.f8372b);
        sb.append(", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=");
        sb.append(this.f8373c);
        sb.append(", prettyPrintIndent='");
        sb.append(this.f8374d);
        sb.append("', coerceInputValues=");
        sb.append(this.f8375e);
        sb.append(", useArrayPolymorphism=false, classDiscriminator='");
        sb.append(this.f8376f);
        sb.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        sb.append(this.f8377g);
        sb.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        int i = this.f8378h;
        sb.append(i != 1 ? i != 2 ? i != 3 ? "null" : "POLYMORPHIC" : "ALL_JSON_OBJECTS" : "NONE");
        sb.append(')');
        return sb.toString();
    }
}
