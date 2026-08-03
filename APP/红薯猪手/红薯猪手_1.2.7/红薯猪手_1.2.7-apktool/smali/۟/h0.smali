.class public final L۟/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static ۥ([B)Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/math/BigInteger;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ljava/math/BigInteger;-><init>(I[B)V

    const/4 p0, 0x5

    new-array p0, p0, [B

    fill-array-data p0, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {p0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p0

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object v0, v1, v2

    invoke-static {p0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0

    :array_0
    .array-data 1
        -0x51t
        -0x45t
        0x1t
        -0x6bt
        0x4et
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x76t
        -0x75t
        0x32t
        -0x59t
        0x36t
        0x17t
    .end array-data
.end method
