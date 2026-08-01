package p242t3;

import p117X2.AbstractC1665j;

/* JADX INFO: renamed from: t3.e */
/* JADX INFO: loaded from: classes.dex */
public final class C3216e {

    /* JADX INFO: renamed from: a */
    public final boolean f10000a;

    /* JADX INFO: renamed from: b */
    public final boolean f10001b;

    /* JADX INFO: renamed from: c */
    public final String f10002c;

    /* JADX INFO: renamed from: d */
    public final String f10003d;

    /* JADX INFO: renamed from: e */
    public final boolean f10004e;

    /* JADX INFO: renamed from: f */
    public final EnumC3212a f10005f;

    /* JADX INFO: renamed from: g */
    public final boolean f10006g;

    public C3216e(boolean z5, boolean z6, String str, String str2, boolean z7, EnumC3212a enumC3212a, boolean z8) {
        AbstractC1665j.m2985e(str, "prettyPrintIndent");
        AbstractC1665j.m2985e(str2, "classDiscriminator");
        AbstractC1665j.m2985e(enumC3212a, "classDiscriminatorMode");
        this.f10000a = z5;
        this.f10001b = z6;
        this.f10002c = str;
        this.f10003d = str2;
        this.f10004e = z7;
        this.f10005f = enumC3212a;
        this.f10006g = z8;
    }

    public final String toString() {
        return "JsonConfiguration(encodeDefaults=false, ignoreUnknownKeys=" + this.f10000a + ", isLenient=false, allowStructuredMapKeys=false, prettyPrint=false, explicitNulls=" + this.f10001b + ", prettyPrintIndent='" + this.f10002c + "', coerceInputValues=false, useArrayPolymorphism=false, classDiscriminator='" + this.f10003d + "', allowSpecialFloatingPointValues=false, useAlternativeNames=" + this.f10004e + ", namingStrategy=null, decodeEnumsCaseInsensitive=false, allowTrailingComma=false, allowComments=false, classDiscriminatorMode=" + this.f10005f + ", exceptionsWithDebugInfo=" + this.f10006g + ')';
    }
}
