.class public final L۟/v4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/v4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static ۥ(Lorg/json/JSONObject;)L۟/v4;
    .locals 8

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    new-array v3, v0, [B

    fill-array-data v3, :array_2

    new-array v4, v2, [B

    fill-array-data v4, :array_3

    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p0, v3}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    sget v5, L۟/o;->ۥ:I

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    if-lez v5, :cond_1

    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result v5

    move v6, v4

    :goto_0
    if-ge v6, v5, :cond_1

    invoke-virtual {v3, v6}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v7

    if-eqz v7, :cond_0

    invoke-static {v7}, L۟/w4$a;->ۥ(Lorg/json/JSONObject;)L۟/w4;

    move-result-object v7

    invoke-virtual {v1, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    add-int/lit8 v6, v6, 0x1

    goto :goto_0

    :cond_1
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v2, v2, [B

    fill-array-data v2, :array_5

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p0

    if-eqz p0, :cond_3

    sget v0, L۟/o;->ۥ:I

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-lez v0, :cond_3

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result v0

    :goto_1
    if-ge v4, v0, :cond_3

    invoke-virtual {p0, v4}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_2

    invoke-static {v2}, L۟/w4$a;->ۥ(Lorg/json/JSONObject;)L۟/w4;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_3
    new-instance p0, L۟/v4;

    invoke-direct {p0, v1, v3}, L۟/v4;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    return-object p0

    nop

    :array_0
    .array-data 1
        -0x67t
        0x5t
        -0x52t
        0x14t
    .end array-data

    :array_1
    .array-data 1
        -0xdt
        0x76t
        -0x3ft
        0x7at
        -0x45t
        0x25t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x1ft
        -0x44t
        -0x4ft
        -0x2t
    .end array-data

    :array_3
    .array-data 1
        -0x77t
        -0x72t
        -0x79t
        -0x36t
        0x6bt
        0x6bt
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x4at
        -0x61t
        -0x13t
        0xct
    .end array-data

    :array_5
    .array-data 1
        -0x22t
        -0x53t
        -0x25t
        0x39t
        -0x7t
        -0x15t
    .end array-data
.end method
