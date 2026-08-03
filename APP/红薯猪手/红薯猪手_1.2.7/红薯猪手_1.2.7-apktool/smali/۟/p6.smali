.class public final L۟/p6;
.super L۟/o4;
.source "SourceFile"

# interfaces
.implements L۟/g3;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "L\u06df/o4;",
        "L\u06df/g3<",
        "Lorg/json/JSONObject;",
        "Ljava/lang/Object;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:L۟/f6;


# direct methods
.method public constructor <init>(L۟/f6;)V
    .locals 0

    iput-object p1, p0, L۟/p6;->ۥ:L۟/f6;

    invoke-direct {p0}, L۟/o4;-><init>()V

    return-void
.end method


# virtual methods
.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p1

    check-cast v0, Lorg/json/JSONObject;

    const/4 v1, 0x2

    new-array v1, v1, [B

    .line 1
    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    move-object/from16 v1, p0

    iget-object v3, v1, L۟/p6;->ۥ:L۟/f6;

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v4, 0x4

    new-array v5, v4, [B

    .line 2
    fill-array-data v5, :array_2

    new-array v6, v2, [B

    fill-array-data v6, :array_3

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-array v5, v4, [B

    fill-array-data v5, :array_4

    new-array v6, v2, [B

    fill-array-data v6, :array_5

    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    const/4 v7, 0x5

    if-eqz v5, :cond_0

    new-array v8, v7, [B

    fill-array-data v8, :array_6

    new-array v9, v2, [B

    fill-array-data v9, :array_7

    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v5

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    if-eqz v5, :cond_13

    sget v8, L۟/o;->ۥ:I

    invoke-static {v5}, L۟/o;->ۥ۟ۡ(Lorg/json/JSONArray;)Z

    move-result v8

    const/4 v9, 0x1

    if-ne v8, v9, :cond_1

    move v8, v9

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_1
    if-eqz v8, :cond_13

    invoke-static {v5}, L۟/o;->ۥ۟ۤ(Lorg/json/JSONArray;)I

    move-result v8

    :goto_2
    const/4 v11, -0x1

    if-ge v11, v8, :cond_13

    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v11

    if-eqz v11, :cond_12

    const/16 v12, 0xa

    new-array v12, v12, [B

    fill-array-data v12, :array_8

    new-array v13, v2, [B

    fill-array-data v13, :array_9

    invoke-static {v12, v13}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    const/4 v13, 0x3

    new-array v13, v13, [B

    fill-array-data v13, :array_a

    new-array v14, v2, [B

    fill-array-data v14, :array_b

    invoke-static {v13, v14}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_2

    goto/16 :goto_e

    :cond_2
    iget-boolean v13, v3, L۟/f6;->ۥۣ۟:Z

    if-eqz v13, :cond_3

    invoke-static {v12}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    new-array v13, v4, [B

    fill-array-data v13, :array_c

    new-array v14, v2, [B

    fill-array-data v14, :array_d

    invoke-static {v13, v14}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v13

    invoke-static {v12, v13}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v12

    if-eqz v12, :cond_3

    goto/16 :goto_e

    :cond_3
    new-array v12, v4, [B

    fill-array-data v12, :array_e

    new-array v13, v2, [B

    fill-array-data v13, :array_f

    invoke-static {v12, v13}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v11

    iget-boolean v12, v3, L۟/f6;->ۥ۟ۤ:Z

    const-string v13, ""

    if-eqz v12, :cond_8

    sget v12, L۟/o;->ۥ:I

    if-eqz v11, :cond_4

    const/16 v12, 0xf

    new-array v12, v12, [B

    fill-array-data v12, :array_10

    new-array v14, v2, [B

    fill-array-data v14, :array_11

    invoke-static {v12, v14}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v12

    invoke-virtual {v11, v12}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v12

    goto :goto_3

    :cond_4
    const/4 v12, 0x0

    :goto_3
    if-eqz v12, :cond_8

    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v14

    if-lez v14, :cond_8

    invoke-virtual {v12}, Lorg/json/JSONArray;->length()I

    move-result v14

    const/4 v15, 0x0

    :goto_4
    if-ge v15, v14, :cond_8

    invoke-virtual {v12, v15}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v16

    if-eqz v16, :cond_6

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v16

    if-nez v16, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v6, v16

    goto :goto_6

    :cond_6
    :goto_5
    move-object v6, v13

    :goto_6
    new-array v9, v7, [B

    fill-array-data v9, :array_12

    new-array v10, v2, [B

    fill-array-data v10, :array_13

    invoke-static {v9, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v9

    invoke-static {v6, v9}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_7

    goto/16 :goto_e

    :cond_7
    add-int/lit8 v15, v15, 0x1

    const/4 v9, 0x1

    goto :goto_4

    .line 3
    :cond_8
    sget-boolean v6, L۟/y2;->ۥ:Z

    if-eqz v6, :cond_12

    .line 4
    sget-object v6, L۟/y2;->ۥ۟ۡ:Ljava/lang/String;

    .line 5
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_9

    const/4 v6, 0x1

    goto :goto_7

    :cond_9
    const/4 v6, 0x0

    :goto_7
    const-string v9, "compile(...)"

    const-string v10, "pattern"

    const/16 v12, 0x42

    if-eqz v6, :cond_d

    if-eqz v11, :cond_a

    new-array v6, v4, [B

    fill-array-data v6, :array_14

    new-array v14, v2, [B

    fill-array-data v14, :array_15

    invoke-static {v6, v14}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v6

    if-eqz v6, :cond_a

    const/16 v14, 0x8

    new-array v14, v14, [B

    fill-array-data v14, :array_16

    new-array v15, v2, [B

    fill-array-data v15, :array_17

    invoke-static {v14, v15}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v6, v14}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_8

    :cond_a
    const/4 v6, 0x0

    :goto_8
    if-nez v6, :cond_b

    move-object v6, v13

    :cond_b
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v14

    if-lez v14, :cond_c

    const/4 v14, 0x1

    goto :goto_9

    :cond_c
    const/4 v14, 0x0

    :goto_9
    if-eqz v14, :cond_d

    .line 6
    sget-object v14, L۟/y2;->ۥ۟ۡ:Ljava/lang/String;

    .line 7
    sget-object v15, L۟/u8;->ۥ:[L۟/u8;

    .line 8
    invoke-static {v10, v14}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v14, v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v14

    invoke-static {v9, v14}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 9
    invoke-virtual {v14, v6}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_d

    .line 10
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    .line 11
    :cond_d
    sget-object v6, L۟/y2;->ۥ۟۠:Ljava/lang/String;

    .line 12
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_e

    const/4 v6, 0x1

    goto :goto_a

    :cond_e
    const/4 v6, 0x0

    :goto_a
    if-eqz v6, :cond_12

    if-eqz v11, :cond_f

    new-array v6, v7, [B

    fill-array-data v6, :array_18

    new-array v14, v2, [B

    fill-array-data v14, :array_19

    invoke-static {v6, v14}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v11, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_b

    :cond_f
    const/4 v6, 0x0

    :goto_b
    if-nez v6, :cond_10

    goto :goto_c

    :cond_10
    move-object v13, v6

    :goto_c
    invoke-virtual {v13}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_11

    const/4 v6, 0x1

    goto :goto_d

    :cond_11
    const/4 v6, 0x0

    :goto_d
    if-eqz v6, :cond_12

    .line 13
    sget-object v6, L۟/y2;->ۥ۟۠:Ljava/lang/String;

    .line 14
    sget-object v11, L۟/u8;->ۥ:[L۟/u8;

    .line 15
    invoke-static {v10, v6}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {v6, v12}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    move-result-object v6

    invoke-static {v9, v6}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 16
    invoke-virtual {v6, v13}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v6

    invoke-virtual {v6}, Ljava/util/regex/Matcher;->find()Z

    move-result v6

    if-eqz v6, :cond_12

    .line 17
    :goto_e
    invoke-virtual {v5, v8}, Lorg/json/JSONArray;->remove(I)Ljava/lang/Object;

    :cond_12
    add-int/lit8 v8, v8, -0x1

    const/4 v9, 0x1

    goto/16 :goto_2

    :cond_13
    return-object v0

    nop

    :array_0
    .array-data 1
        0x56t
        0x55t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x3ft
        0x21t
        0x62t
        0x1bt
        -0x28t
        -0x4et
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x54t
        0x77t
        0x7et
        -0x37t
    .end array-data

    :array_3
    .array-data 1
        -0x3at
        0x4t
        0x11t
        -0x59t
        -0x3dt
        0xdt
    .end array-data

    nop

    :array_4
    .array-data 1
        0x7at
        0x46t
        -0x6ct
        -0x76t
    .end array-data

    :array_5
    .array-data 1
        0x1et
        0x27t
        -0x20t
        -0x15t
        0x12t
        0x57t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x34t
        -0x30t
        -0x73t
        -0x80t
        0x1dt
    .end array-data

    nop

    :array_7
    .array-data 1
        -0x5bt
        -0x5ct
        -0x18t
        -0x13t
        0x6et
        -0x10t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x6dt
        -0x38t
        -0x17t
        -0x6dt
        0x4bt
        0x39t
        -0x76t
        -0x22t
        -0x3t
        -0x6dt
    .end array-data

    nop

    :array_9
    .array-data 1
        -0x2t
        -0x59t
        -0x73t
        -0xat
        0x27t
        0x66t
    .end array-data

    nop

    :array_a
    .array-data 1
        -0x59t
        -0x29t
        -0x4ct
    .end array-data

    :array_b
    .array-data 1
        -0x3at
        -0x4dt
        -0x39t
        -0x7bt
        -0x56t
        0x65t
    .end array-data

    nop

    :array_c
    .array-data 1
        0x27t
        0x6ft
        0x23t
        -0x3at
    .end array-data

    :array_d
    .array-data 1
        0x4bt
        0x6t
        0x55t
        -0x5dt
        -0x5at
        0x41t
    .end array-data

    nop

    :array_e
    .array-data 1
        -0x4bt
        -0x5dt
        -0x1t
        -0x6ct
    .end array-data

    :array_f
    .array-data 1
        -0x25t
        -0x34t
        -0x75t
        -0xft
        0x6et
        0x2bt
    .end array-data

    nop

    :array_10
    .array-data 1
        0x6bt
        0x5at
        -0x68t
        -0x30t
        -0x2at
        0x70t
        0x71t
        0x41t
        -0x62t
        -0x24t
        -0x15t
        0x64t
        0x71t
        0x50t
        -0x61t
    .end array-data

    :array_11
    .array-data 1
        0x5t
        0x35t
        -0x14t
        -0x4bt
        -0x77t
        0x11t
    .end array-data

    nop

    :array_12
    .array-data 1
        0x2ft
        -0x1ft
        0x1ft
        -0x1t
        0xct
    .end array-data

    nop

    :array_13
    .array-data 1
        0x48t
        -0x72t
        0x70t
        -0x65t
        0x7ft
        0x7dt
    .end array-data

    nop

    :array_14
    .array-data 1
        -0x70t
        0x1t
        -0x65t
        -0x6ft
    .end array-data

    :array_15
    .array-data 1
        -0x1bt
        0x72t
        -0x2t
        -0x1dt
        -0x18t
        -0x7ft
    .end array-data

    nop

    :array_16
    .array-data 1
        0x61t
        0x1ct
        -0x7bt
        0x24t
        0x0t
        -0x1ct
        0x62t
        0x10t
    .end array-data

    :array_17
    .array-data 1
        0xft
        0x75t
        -0x1at
        0x4ft
        0x6et
        -0x7bt
    .end array-data

    nop

    :array_18
    .array-data 1
        -0x51t
        0x4dt
        -0x4dt
        -0x37t
        -0x20t
    .end array-data

    nop

    :array_19
    .array-data 1
        -0x25t
        0x24t
        -0x39t
        -0x5bt
        -0x7bt
        0x7et
    .end array-data
.end method
