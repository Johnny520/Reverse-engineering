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

    public C2379pm(boolean r1, boolean r2, boolean r3, String r4, boolean r5, String r6, boolean r7, int r8) {
        this.f8371a = r1;
        this.f8372b = r2;
        this.f8373c = r3;
        this.f8374d = r4;
        this.f8375e = r5;
        this.f8376f = r6;
        this.f8377g = r7;
        this.f8378h = r8;
    }

    public final String toString() {
        StringBuilder r0 = new StringBuilder("JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=");
        r0.append(this.f8371a);
        r0.append(", isLenient=");
        r0.append(this.f8372b);
        r0.append(", allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=");
        r0.append(this.f8373c);
        r0.append(", prettyPrintIndent='");
        r0.append(this.f8374d);
        r0.append("', coerceInputValues=");
        r0.append(this.f8375e);
        r0.append(", useArrayPolymorphism=false, classDiscriminator='");
        r0.append(this.f8376f);
        r0.append("', allowSpecialFloatingPointValues=false, useAlternativeNames=");
        r0.append(this.f8377g);
        r0.append(", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=");
        int r2 = this.f8378h;
        if (r2 != 1) goto L5;
        String r1 = "NONE";
    L12:
        r0.append(r1);
        r0.append(')');
        return r0.toString();
    L5:
        if (r2 != 2) goto L7;
        r1 = "ALL_JSON_OBJECTS";
        goto L12
    L7:
        if (r2 == 3) goto L9;
        r1 = "null";
        goto L12
    L9:
        r1 = "POLYMORPHIC";
        goto L12
    }
}
