.class public final L۟/w4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/w4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static ۥ(Lorg/json/JSONObject;)L۟/w4;
    .locals 4

    const/4 v0, 0x4

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-instance v0, L۟/w4;

    const/16 v2, 0xa

    new-array v2, v2, [B

    fill-array-data v2, :array_2

    new-array v3, v1, [B

    fill-array-data v3, :array_3

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    new-array v3, v1, [B

    fill-array-data v3, :array_4

    new-array v1, v1, [B

    fill-array-data v1, :array_5

    invoke-static {v3, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, v2, p0}, L۟/w4;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0

    nop

    :array_0
    .array-data 1
        0x72t
        -0x59t
        -0x6ct
        0x6ft
    .end array-data

    :array_1
    .array-data 1
        0x18t
        -0x2ct
        -0x5t
        0x1t
        0x27t
        -0x3t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x80t
        0x39t
        -0x44t
        -0x42t
        0x6ct
        0x6ct
        -0x4et
        0x2dt
        -0x43t
        -0x5at
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x13t
        0x58t
        -0x31t
        -0x36t
        0x9t
        0x1et
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x3et
        0x35t
        0x56t
        -0x4et
        0x74t
        0x65t
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x5ct
        0x5at
        0x24t
        -0x21t
        0x15t
        0x11t
    .end array-data
.end method
