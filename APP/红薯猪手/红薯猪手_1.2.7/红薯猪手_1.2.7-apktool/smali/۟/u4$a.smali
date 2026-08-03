.class public final L۟/u4$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/u4;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# direct methods
.method public static ۥ(Ljava/lang/String;)L۟/u4;
    .locals 13

    const/4 v0, 0x4

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    const/4 p0, 0x0

    :try_start_0
    new-array v3, v2, [B

    const/16 v4, 0x49

    const/4 v5, 0x0

    aput-byte v4, v3, v5

    const/16 v4, -0x80

    const/4 v6, 0x1

    aput-byte v4, v3, v6

    const/16 v4, -0x31

    const/4 v7, 0x2

    aput-byte v4, v3, v7

    const/16 v4, -0xf

    const/4 v8, 0x3

    aput-byte v4, v3, v8

    const/16 v4, -0x43

    aput-byte v4, v3, v0

    const/16 v9, 0x42

    const/4 v10, 0x5

    aput-byte v9, v3, v10

    new-array v11, v2, [B

    const/16 v12, 0x3a

    aput-byte v12, v11, v5

    const/16 v12, -0xc

    aput-byte v12, v11, v6

    aput-byte v4, v11, v7

    const/16 v4, -0x6c

    aput-byte v4, v11, v8

    const/16 v4, -0x24

    aput-byte v4, v11, v0

    const/16 v12, 0x2f

    aput-byte v12, v11, v10

    invoke-static {v3, v11}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, L۟/v4$a;->ۥ(Lorg/json/JSONObject;)L۟/v4;

    move-result-object v3

    goto :goto_0

    :cond_0
    move-object v3, p0

    :goto_0
    const/16 v11, 0x8

    new-array v11, v11, [B

    const/16 v12, -0x56

    aput-byte v12, v11, v5

    const/16 v12, -0x19

    aput-byte v12, v11, v6

    const/16 v12, -0x5d

    aput-byte v12, v11, v7

    aput-byte v4, v11, v8

    aput-byte v9, v11, v0

    const/16 v9, 0x7d

    aput-byte v9, v11, v10

    const/16 v9, -0x4b

    aput-byte v9, v11, v2

    const/4 v9, 0x7

    const/16 v12, -0x16

    aput-byte v12, v11, v9

    new-array v2, v2, [B

    aput-byte v4, v2, v5

    const/16 v4, -0x72

    aput-byte v4, v2, v6

    const/16 v4, -0x39

    aput-byte v4, v2, v7

    const/16 v4, -0x47

    aput-byte v4, v2, v8

    const/16 v4, 0x2d

    aput-byte v4, v2, v0

    const/16 v0, 0x22

    aput-byte v0, v2, v10

    invoke-static {v11, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    new-instance v0, L۟/u4;

    invoke-direct {v0, v3}, L۟/u4;-><init>(L۟/v4;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object p0, v0

    :catch_0
    return-object p0

    nop

    :array_0
    .array-data 1
        0x35t
        -0x6ft
        -0x7at
        0x6at
    .end array-data

    :array_1
    .array-data 1
        0x5ft
        -0x1et
        -0x17t
        0x4t
        -0x48t
        -0x48t
    .end array-data
.end method
