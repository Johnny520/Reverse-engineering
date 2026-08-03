.class public final L۟/o;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic ۥ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    const/16 v0, 0xd

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/16 v0, 0x13

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v2, v1, [B

    fill-array-data v2, :array_3

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/16 v0, 0x1c

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v2, v1, [B

    fill-array-data v2, :array_5

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/16 v0, 0xe

    new-array v0, v0, [B

    fill-array-data v0, :array_6

    new-array v1, v1, [B

    fill-array-data v1, :array_7

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    return-void

    :array_0
    .array-data 1
        -0x38t
        -0x45t
        0x1t
        0x5ft
        -0x1dt
        0x1et
        -0x2at
        -0x4at
        0x5at
        0x6t
        -0x1dt
        0xft
        -0x2bt
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x5bt
        -0x22t
        0x2ft
        0x28t
        -0x7at
        0x77t
    .end array-data

    nop

    :array_2
    .array-data 1
        0x3t
        0x62t
        -0xet
        0xbt
        -0x32t
        -0x27t
        0x1ct
        0x7ft
        -0x1at
        0x40t
        -0x3at
        -0x7ct
        0x1t
        0x71t
        -0x5t
        0x44t
        -0x3bt
        -0x31t
        0x1et
    .end array-data

    :array_3
    .array-data 1
        0x6ct
        0x10t
        -0x6bt
        0x25t
        -0x5et
        -0x56t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x63t
        -0x31t
        0x2at
        -0x6bt
        -0xbt
        -0x74t
        -0x63t
        -0x36t
        0x2et
        -0x26t
        -0x14t
        -0x39t
        -0x69t
        -0x27t
        0x35t
        -0x35t
        -0x9t
        -0x66t
        -0x69t
        -0x27t
        0x63t
        -0x2at
        -0x7t
        -0x79t
        -0x6dt
        -0x26t
        0x28t
        -0x37t
    .end array-data

    :array_5
    .array-data 1
        -0xet
        -0x43t
        0x4dt
        -0x45t
        -0x68t
        -0x17t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x6ct
        0x9t
        -0x72t
        -0x22t
        0x62t
        0x76t
        -0x70t
        0x48t
        -0x65t
        -0x80t
        0x6ft
        0x70t
        -0x6et
        0x2t
    .end array-data

    nop

    :array_7
    .array-data 1
        -0x9t
        0x66t
        -0x1dt
        -0x10t
        0x0t
        0x3t
    .end array-data
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Ljava/lang/String;)V
    .locals 15

    const/4 v0, 0x3

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v3, v2, [B

    fill-array-data v3, :array_1

    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, L۟/ta;->ۥ۠ۦ(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v3, 0x1

    xor-int/2addr v1, v3

    if-eqz v1, :cond_8

    new-array v1, v3, [B

    const/16 v4, 0x4e

    const/4 v5, 0x0

    aput-byte v4, v1, v5

    new-array v4, v2, [B

    fill-array-data v4, :array_2

    invoke-static {v1, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    const/4 v4, 0x2

    invoke-static {p0, v1}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v1

    const/16 v6, 0xe

    if-eqz v1, :cond_0

    new-array v1, v3, [B

    const/16 v7, 0x61

    aput-byte v7, v1, v5

    new-array v7, v2, [B

    fill-array-data v7, :array_3

    invoke-static {v1, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {p0, v1, v5, v5, v2}, L۟/va;->ۥۡۢ(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v1

    add-int/2addr v1, v3

    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    new-array v7, v6, [B

    fill-array-data v7, :array_4

    new-array v8, v2, [B

    fill-array-data v8, :array_5

    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string v1, ""

    :goto_0
    const/4 v7, 0x4

    new-array v8, v7, [B

    fill-array-data v8, :array_6

    new-array v9, v2, [B

    fill-array-data v9, :array_7

    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v8

    invoke-static {p0, v8}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    invoke-static {v1}, L۟/o;->ۥ۟ۢ(Ljava/lang/String;)V

    goto/16 :goto_3

    :cond_1
    new-array v8, v0, [B

    fill-array-data v8, :array_8

    new-array v9, v2, [B

    fill-array-data v9, :array_9

    invoke-static {v8, v9}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v8

    invoke-static {p0, v8}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v8

    const/16 v9, 0x15

    const/4 v10, 0x5

    if-eqz v8, :cond_2

    new-array p0, v10, [B

    .line 1
    fill-array-data p0, :array_a

    new-array v8, v2, [B

    fill-array-data v8, :array_b

    invoke-static {p0, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    :try_start_0
    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v8, "mqqwpa://im/chat?chat_type=wpa&uin="

    invoke-virtual {p0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {}, L۟/l3;->ۥ۟()Landroid/app/Activity;

    move-result-object v1

    new-instance v8, Landroid/content/Intent;

    const/16 v11, 0x1a

    new-array v11, v11, [B

    const/16 v12, -0x58

    aput-byte v12, v11, v5

    const/16 v12, -0x45

    aput-byte v12, v11, v3

    aput-byte v2, v11, v4

    const/16 v12, -0x24

    aput-byte v12, v11, v0

    const/16 v12, 0x78

    aput-byte v12, v11, v7

    const/16 v12, -0x41

    aput-byte v12, v11, v10

    const/16 v12, -0x53

    aput-byte v12, v11, v2

    const/4 v12, 0x7

    const/4 v13, -0x5

    aput-byte v13, v11, v12

    const/16 v12, 0x8

    const/16 v13, 0xb

    aput-byte v13, v11, v12

    const/16 v12, 0x9

    const/16 v14, -0x40

    aput-byte v14, v11, v12

    const/16 v12, 0xa

    const/16 v14, 0x63

    aput-byte v14, v11, v12

    const/16 v12, -0x4d

    aput-byte v12, v11, v13

    const/16 v12, -0x59

    const/16 v13, 0xc

    aput-byte v12, v11, v13

    const/16 v12, 0xd

    const/16 v14, -0x5f

    aput-byte v14, v11, v12

    const/16 v12, 0x4c

    aput-byte v12, v11, v6

    const/16 v6, 0xf

    const/16 v12, -0x31

    aput-byte v12, v11, v6

    const/16 v6, 0x10

    const/16 v12, 0x74

    aput-byte v12, v11, v6

    const/16 v6, 0x11

    const/16 v12, -0x5e

    aput-byte v12, v11, v6

    const/16 v6, 0x12

    const/16 v12, -0x60

    aput-byte v12, v11, v6

    const/16 v6, 0x13

    const/16 v12, -0x46

    aput-byte v12, v11, v6

    const/16 v6, 0x14

    aput-byte v13, v11, v6

    const/16 v6, -0x80

    aput-byte v6, v11, v9

    const/16 v6, 0x16

    const/16 v9, 0x41

    aput-byte v9, v11, v6

    const/16 v6, -0x61

    const/16 v9, 0x17

    aput-byte v6, v11, v9

    const/16 v6, 0x18

    const/16 v12, -0x74

    aput-byte v12, v11, v6

    const/16 v6, 0x19

    const/16 v12, -0x7e

    aput-byte v12, v11, v6

    new-array v2, v2, [B

    const/16 v6, -0x37

    aput-byte v6, v2, v5

    const/16 v5, -0x2b

    aput-byte v5, v2, v3

    const/16 v3, 0x62

    aput-byte v3, v2, v4

    const/16 v3, -0x52

    aput-byte v3, v2, v0

    aput-byte v9, v2, v7

    const/16 v0, -0x2a

    aput-byte v0, v2, v10

    invoke-static {v11, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-direct {v8, v0, p0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    invoke-virtual {v1, v8}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_3

    :catch_0
    move-exception p0

    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    goto/16 :goto_3

    :cond_2
    new-array v4, v10, [B

    .line 2
    fill-array-data v4, :array_c

    new-array v6, v2, [B

    fill-array-data v6, :array_d

    invoke-static {v4, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-static {v1}, L۟/o;->ۥ۟(Ljava/lang/String;)V

    new-array p0, v9, [B

    fill-array-data p0, :array_e

    new-array v0, v2, [B

    fill-array-data v0, :array_f

    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p0

    goto/16 :goto_1

    :cond_3
    new-array v4, v2, [B

    fill-array-data v4, :array_10

    new-array v6, v2, [B

    fill-array-data v6, :array_11

    invoke-static {v4, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    .line 3
    invoke-static {v5, v1}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    goto :goto_3

    :cond_4
    new-array v4, v0, [B

    .line 4
    fill-array-data v4, :array_12

    new-array v6, v2, [B

    fill-array-data v6, :array_13

    invoke-static {v4, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v4

    invoke-static {p0, v4}, L۟/ta;->ۥۡ(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    invoke-static {v1}, L۟/o;->ۥ۟(Ljava/lang/String;)V

    const/16 p0, 0x3c

    new-array p0, p0, [B

    fill-array-data p0, :array_14

    new-array v0, v2, [B

    fill-array-data v0, :array_15

    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object p0

    invoke-static {v3, p0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    goto :goto_3

    :cond_5
    new-array v0, v0, [B

    fill-array-data v0, :array_16

    new-array v1, v2, [B

    fill-array-data v1, :array_17

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_7

    new-array v0, v7, [B

    fill-array-data v0, :array_18

    new-array v1, v2, [B

    fill-array-data v1, :array_19

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {p0, v0}, L۟/va;->ۥۡ۟(Ljava/lang/CharSequence;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_6

    goto :goto_2

    :cond_6
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u5904\u7406url\u5931\u8d25:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    .line 5
    :goto_1
    invoke-static {v5, p0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    goto :goto_3

    .line 6
    :cond_7
    :goto_2
    invoke-static {p0}, L۟/o;->ۥ۟ۥ(Ljava/lang/String;)V

    :cond_8
    :goto_3
    return-void

    nop

    :array_0
    .array-data 1
        -0x8t
        -0x34t
        0x74t
    .end array-data

    :array_1
    .array-data 1
        -0x73t
        -0x42t
        0x18t
        -0x1ft
        -0x3ct
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x74t
        0x36t
        0x6at
        0x17t
        -0x65t
        0x7ct
    .end array-data

    nop

    :array_3
    .array-data 1
        0x5bt
        0x0t
        0x39t
        -0x58t
        0x2t
        -0x4at
    .end array-data

    nop

    :array_4
    .array-data 1
        0x4et
        -0x54t
        0x4ft
        0x5bt
        -0x7et
        -0x46t
        0x54t
        -0x49t
        0x4at
        0x0t
        -0x28t
        -0x1at
        0x13t
        -0x10t
    .end array-data

    nop

    :array_5
    .array-data 1
        0x3dt
        -0x27t
        0x2dt
        0x28t
        -0xat
        -0x38t
    .end array-data

    nop

    :array_6
    .array-data 1
        -0x1ct
        -0x40t
        0x6ft
        -0x73t
    .end array-data

    :array_7
    .array-data 1
        -0x6bt
        -0x4ft
        0x8t
        -0x49t
        -0x40t
        0x46t
    .end array-data

    nop

    :array_8
    .array-data 1
        -0x19t
        0x2ct
        -0x2at
    .end array-data

    :array_9
    .array-data 1
        -0x6at
        0x5dt
        -0x14t
        0x67t
        -0x4et
        0x39t
    .end array-data

    nop

    :array_a
    .array-data 1
        -0x36t
        -0x3bt
        0x24t
        -0x63t
        0x29t
    .end array-data

    nop

    :array_b
    .array-data 1
        -0x45t
        -0x4ct
        0x6at
        -0x18t
        0x44t
        -0x38t
    .end array-data

    nop

    :array_c
    .array-data 1
        0x3t
        0x76t
        0x2ct
        -0x2bt
        0x5at
    .end array-data

    nop

    :array_d
    .array-data 1
        0x60t
        0x19t
        0x5ct
        -0x54t
        0x60t
        -0x73t
    .end array-data

    nop

    :array_e
    .array-data 1
        -0x35t
        0x41t
        0x3at
        0x72t
        0x0t
        0x14t
        -0x35t
        0x7et
        0x3et
        0x72t
        0x2ct
        0x29t
        -0x37t
        0x44t
        0x10t
        0x7ft
        0x10t
        0x2dt
        -0x38t
        0x6bt
        0x37t
    .end array-data

    nop

    :array_f
    .array-data 1
        0x2et
        -0xat
        -0x78t
        -0x69t
        -0x5ct
        -0x67t
    .end array-data

    nop

    :array_10
    .array-data 1
        -0x23t
        -0x41t
        -0x1bt
        -0x5t
        0x37t
        -0x56t
    .end array-data

    nop

    :array_11
    .array-data 1
        -0x57t
        -0x30t
        -0x7ct
        -0x78t
        0x43t
        -0x70t
    .end array-data

    nop

    :array_12
    .array-data 1
        -0x4t
        -0x34t
        -0x72t
    .end array-data

    :array_13
    .array-data 1
        -0x6ft
        -0x44t
        -0x4ct
        0x52t
        -0x39t
        0x51t
    .end array-data

    nop

    :array_14
    .array-data 1
        -0x16t
        -0x70t
        -0x20t
        -0x4et
        -0x9t
        0x4ft
        -0x16t
        -0x51t
        -0x1ct
        -0x4et
        -0x2at
        0x6et
        -0x15t
        -0x65t
        -0x3bt
        -0x4et
        -0x24t
        0x75t
        -0x20t
        -0x65t
        -0x22t
        -0x41t
        -0x4t
        0x75t
        -0x16t
        -0x51t
        -0x1et
        -0x4et
        -0x13t
        0x6ct
        -0x15t
        -0x68t
        -0xdt
        -0x41t
        -0x14t
        0x59t
        -0x19t
        -0x7at
        -0x22t
        -0x50t
        -0x1ft
        0x5at
        -0x19t
        -0x6dt
        -0x1at
        -0x4ft
        -0x3dt
        0x5et
        -0x18t
        -0x6dt
        -0x10t
        -0x4et
        -0x2at
        0x6et
        -0x15t
        -0x65t
        -0x3bt
        -0x4et
        -0x24t
        0x75t
    .end array-data

    :array_15
    .array-data 1
        0xft
        0x27t
        0x52t
        0x57t
        0x53t
        -0x3et
    .end array-data

    nop

    :array_16
    .array-data 1
        0x7ft
        -0x2ft
        0x49t
    .end array-data

    :array_17
    .array-data 1
        0x45t
        -0x2t
        0x66t
        0x43t
        0x35t
        -0x62t
    .end array-data

    nop

    :array_18
    .array-data 1
        0x7et
        -0x7dt
        -0x2ct
        0x1ct
    .end array-data

    :array_19
    .array-data 1
        0x16t
        -0x9t
        -0x60t
        0x6ct
        0x5bt
        0x3et
    .end array-data
.end method

.method public static ۥ۟(Ljava/lang/String;)V
    .locals 4

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v2, v0, [B

    .line 8
    .line 9
    fill-array-data v2, :array_1

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    const/16 v1, 0x18

    .line 20
    .line 21
    new-array v1, v1, [B

    .line 22
    .line 23
    fill-array-data v1, :array_2

    .line 24
    .line 25
    .line 26
    new-array v2, v0, [B

    .line 27
    .line 28
    fill-array-data v2, :array_3

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1, p0}, Landroid/content/ClipData;->newPlainText(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Landroid/content/ClipData;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    sget-object v1, L۟/l3;->ۥ:Landroid/content/Context;

    .line 40
    .line 41
    const/4 v2, 0x0

    .line 42
    if-eqz v1, :cond_2

    .line 43
    .line 44
    const/16 v3, 0x9

    .line 45
    .line 46
    new-array v3, v3, [B

    .line 47
    .line 48
    fill-array-data v3, :array_4

    .line 49
    .line 50
    .line 51
    new-array v0, v0, [B

    .line 52
    .line 53
    fill-array-data v0, :array_5

    .line 54
    .line 55
    .line 56
    invoke-static {v3, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    instance-of v1, v0, Landroid/content/ClipboardManager;

    .line 65
    .line 66
    if-eqz v1, :cond_0

    .line 67
    .line 68
    move-object v2, v0

    .line 69
    check-cast v2, Landroid/content/ClipboardManager;

    .line 70
    .line 71
    :cond_0
    if-eqz v2, :cond_1

    .line 72
    .line 73
    invoke-virtual {v2, p0}, Landroid/content/ClipboardManager;->setPrimaryClip(Landroid/content/ClipData;)V

    .line 74
    .line 75
    .line 76
    :cond_1
    return-void

    .line 77
    :cond_2
    const/4 p0, 0x7

    .line 78
    new-array p0, p0, [B

    .line 79
    .line 80
    fill-array-data p0, :array_6

    .line 81
    .line 82
    .line 83
    new-array v0, v0, [B

    .line 84
    .line 85
    fill-array-data v0, :array_7

    .line 86
    .line 87
    .line 88
    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-static {p0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    throw v2

    .line 96
    nop

    .line 97
    :array_0
    .array-data 1
        0x74t
        0x7ft
        0xft
        -0x15t
        0x76t
        -0x49t
    .end array-data

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    nop

    .line 105
    :array_1
    .array-data 1
        0x48t
        0xbt
        0x67t
        -0x7et
        0x5t
        -0x77t
    .end array-data

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    nop

    .line 113
    :array_2
    .array-data 1
        -0x2et
        0x67t
        0x3at
        0x1t
        -0x21t
        0x59t
        -0x38t
        0x60t
        0x36t
        0x41t
        -0x38t
        0x1ct
        -0x2dt
        0x69t
        0x24t
        0x4at
        -0x2ct
        0x42t
        -0x27t
        0x6dt
        0x3bt
        0x5ft
        -0x37t
        0x40t
    .end array-data

    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    :array_3
    .array-data 1
        -0x4ft
        0x8t
        0x57t
        0x2ft
        -0x54t
        0x32t
    .end array-data

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    nop

    .line 137
    :array_4
    .array-data 1
        0x70t
        -0x41t
        0x0t
        0x57t
        0x56t
        -0xbt
        0x72t
        -0x5ft
        0xdt
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    nop

    .line 147
    :array_5
    .array-data 1
        0x13t
        -0x2dt
        0x69t
        0x27t
        0x34t
        -0x66t
    .end array-data

    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    nop

    .line 155
    :array_6
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    :array_7
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public static ۥ۟۟(Ljava/lang/String;)Landroid/content/Intent;
    .locals 4

    const/16 v0, 0xb

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v2, v1, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-instance v0, Landroid/content/Intent;

    const/16 v2, 0x2d

    new-array v2, v2, [B

    fill-array-data v2, :array_2

    new-array v3, v1, [B

    fill-array-data v3, :array_3

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "package:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {v0, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    move-result-object p0

    const/high16 v0, 0x10000000

    invoke-virtual {p0, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    move-result-object p0

    const/16 v0, 0xd

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v1, v1, [B

    fill-array-data v1, :array_5

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0

    :array_0
    .array-data 1
        0x62t
        0x26t
        0x39t
        0x2t
        -0x1ct
        0x6dt
        0x77t
        0x9t
        0x3bt
        0x4t
        -0x20t
    .end array-data

    :array_1
    .array-data 1
        0x12t
        0x47t
        0x5at
        0x69t
        -0x7bt
        0xat
    .end array-data

    nop

    :array_2
    .array-data 1
        0x21t
        0x7ct
        0x14t
        0x7t
        0x2bt
        -0x4at
        0x24t
        0x3ct
        0x3t
        0x10t
        0x30t
        -0x55t
        0x29t
        0x7ct
        0x17t
        0x6t
        0x6at
        -0x62t
        0x10t
        0x42t
        0x3ct
        0x3ct
        0x7t
        -0x62t
        0x14t
        0x5bt
        0x3ft
        0x3bt
        0x1bt
        -0x65t
        0x5t
        0x46t
        0x31t
        0x3ct
        0x8t
        -0x74t
        0x1ft
        0x41t
        0x35t
        0x21t
        0x10t
        -0x6at
        0xet
        0x55t
        0x23t
    .end array-data

    nop

    :array_3
    .array-data 1
        0x40t
        0x12t
        0x70t
        0x75t
        0x44t
        -0x21t
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x53t
        0x6t
        -0x47t
        0x3dt
        0x3ct
        0x29t
        -0x55t
        0x11t
        -0xbt
        0x55t
        0x7et
        0x66t
        -0x1bt
    .end array-data

    nop

    :array_5
    .array-data 1
        -0x34t
        0x62t
        -0x23t
        0x7bt
        0x50t
        0x48t
    .end array-data
.end method

.method public static ۥ۟۠(Ljava/lang/String;)Ljava/lang/String;
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    new-array v3, v2, [B

    .line 9
    .line 10
    fill-array-data v3, :array_1

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    const/4 v3, 0x1

    .line 25
    const/4 v4, 0x0

    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    move v1, v3

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v1, v4

    .line 31
    :goto_0
    if-eqz v1, :cond_1

    .line 32
    .line 33
    const-string p0, ""

    .line 34
    .line 35
    return-object p0

    .line 36
    :cond_1
    const/16 v1, 0xf

    .line 37
    .line 38
    new-array v1, v1, [Ljava/lang/String;

    .line 39
    .line 40
    new-array v5, v3, [B

    .line 41
    .line 42
    const/16 v6, -0x13

    .line 43
    .line 44
    aput-byte v6, v5, v4

    .line 45
    .line 46
    new-array v6, v2, [B

    .line 47
    .line 48
    fill-array-data v6, :array_2

    .line 49
    .line 50
    .line 51
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v5

    .line 55
    aput-object v5, v1, v4

    .line 56
    .line 57
    new-array v5, v3, [B

    .line 58
    .line 59
    const/16 v6, 0x15

    .line 60
    .line 61
    aput-byte v6, v5, v4

    .line 62
    .line 63
    new-array v7, v2, [B

    .line 64
    .line 65
    fill-array-data v7, :array_3

    .line 66
    .line 67
    .line 68
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v5

    .line 72
    aput-object v5, v1, v3

    .line 73
    .line 74
    const/4 v5, 0x2

    .line 75
    new-array v7, v3, [B

    .line 76
    .line 77
    const/16 v8, -0x5a

    .line 78
    .line 79
    aput-byte v8, v7, v4

    .line 80
    .line 81
    new-array v8, v2, [B

    .line 82
    .line 83
    fill-array-data v8, :array_4

    .line 84
    .line 85
    .line 86
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    aput-object v7, v1, v5

    .line 91
    .line 92
    const/4 v5, 0x3

    .line 93
    new-array v7, v3, [B

    .line 94
    .line 95
    aput-byte v4, v7, v4

    .line 96
    .line 97
    new-array v8, v2, [B

    .line 98
    .line 99
    fill-array-data v8, :array_5

    .line 100
    .line 101
    .line 102
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v7

    .line 106
    aput-object v7, v1, v5

    .line 107
    .line 108
    new-array v5, v3, [B

    .line 109
    .line 110
    const/16 v7, -0x42

    .line 111
    .line 112
    aput-byte v7, v5, v4

    .line 113
    .line 114
    new-array v7, v2, [B

    .line 115
    .line 116
    fill-array-data v7, :array_6

    .line 117
    .line 118
    .line 119
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    aput-object v5, v1, v0

    .line 124
    .line 125
    const/4 v0, 0x5

    .line 126
    new-array v5, v3, [B

    .line 127
    .line 128
    const/16 v7, -0x7e

    .line 129
    .line 130
    aput-byte v7, v5, v4

    .line 131
    .line 132
    new-array v7, v2, [B

    .line 133
    .line 134
    fill-array-data v7, :array_7

    .line 135
    .line 136
    .line 137
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v5

    .line 141
    aput-object v5, v1, v0

    .line 142
    .line 143
    new-array v0, v3, [B

    .line 144
    .line 145
    const/16 v5, 0x25

    .line 146
    .line 147
    aput-byte v5, v0, v4

    .line 148
    .line 149
    new-array v5, v2, [B

    .line 150
    .line 151
    fill-array-data v5, :array_8

    .line 152
    .line 153
    .line 154
    invoke-static {v0, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v0

    .line 158
    aput-object v0, v1, v2

    .line 159
    .line 160
    const/4 v0, 0x7

    .line 161
    new-array v5, v3, [B

    .line 162
    .line 163
    const/16 v7, -0x2d

    .line 164
    .line 165
    aput-byte v7, v5, v4

    .line 166
    .line 167
    new-array v7, v2, [B

    .line 168
    .line 169
    fill-array-data v7, :array_9

    .line 170
    .line 171
    .line 172
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v5

    .line 176
    aput-object v5, v1, v0

    .line 177
    .line 178
    const/16 v0, 0x8

    .line 179
    .line 180
    new-array v5, v3, [B

    .line 181
    .line 182
    const/16 v7, -0x3a

    .line 183
    .line 184
    aput-byte v7, v5, v4

    .line 185
    .line 186
    new-array v7, v2, [B

    .line 187
    .line 188
    fill-array-data v7, :array_a

    .line 189
    .line 190
    .line 191
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 192
    .line 193
    .line 194
    move-result-object v5

    .line 195
    aput-object v5, v1, v0

    .line 196
    .line 197
    const/16 v0, 0x9

    .line 198
    .line 199
    new-array v5, v3, [B

    .line 200
    .line 201
    const/16 v7, 0x3f

    .line 202
    .line 203
    aput-byte v7, v5, v4

    .line 204
    .line 205
    new-array v7, v2, [B

    .line 206
    .line 207
    fill-array-data v7, :array_b

    .line 208
    .line 209
    .line 210
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v5

    .line 214
    aput-object v5, v1, v0

    .line 215
    .line 216
    const/16 v0, 0xa

    .line 217
    .line 218
    new-array v5, v3, [B

    .line 219
    .line 220
    const/16 v7, -0x7d

    .line 221
    .line 222
    aput-byte v7, v5, v4

    .line 223
    .line 224
    new-array v7, v2, [B

    .line 225
    .line 226
    fill-array-data v7, :array_c

    .line 227
    .line 228
    .line 229
    invoke-static {v5, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 230
    .line 231
    .line 232
    move-result-object v5

    .line 233
    aput-object v5, v1, v0

    .line 234
    .line 235
    const/16 v0, 0xb

    .line 236
    .line 237
    new-array v5, v3, [B

    .line 238
    .line 239
    aput-byte v6, v5, v4

    .line 240
    .line 241
    new-array v6, v2, [B

    .line 242
    .line 243
    fill-array-data v6, :array_d

    .line 244
    .line 245
    .line 246
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v5

    .line 250
    aput-object v5, v1, v0

    .line 251
    .line 252
    const/16 v0, 0xc

    .line 253
    .line 254
    new-array v5, v3, [B

    .line 255
    .line 256
    const/16 v6, 0x6a

    .line 257
    .line 258
    aput-byte v6, v5, v4

    .line 259
    .line 260
    new-array v6, v2, [B

    .line 261
    .line 262
    fill-array-data v6, :array_e

    .line 263
    .line 264
    .line 265
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v5

    .line 269
    aput-object v5, v1, v0

    .line 270
    .line 271
    const/16 v0, 0xd

    .line 272
    .line 273
    new-array v5, v3, [B

    .line 274
    .line 275
    const/16 v6, 0x7a

    .line 276
    .line 277
    aput-byte v6, v5, v4

    .line 278
    .line 279
    new-array v6, v2, [B

    .line 280
    .line 281
    fill-array-data v6, :array_f

    .line 282
    .line 283
    .line 284
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v5

    .line 288
    aput-object v5, v1, v0

    .line 289
    .line 290
    const/16 v0, 0xe

    .line 291
    .line 292
    new-array v5, v3, [B

    .line 293
    .line 294
    const/16 v6, 0x5d

    .line 295
    .line 296
    aput-byte v6, v5, v4

    .line 297
    .line 298
    new-array v6, v2, [B

    .line 299
    .line 300
    fill-array-data v6, :array_10

    .line 301
    .line 302
    .line 303
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 304
    .line 305
    .line 306
    move-result-object v5

    .line 307
    aput-object v5, v1, v0

    .line 308
    .line 309
    invoke-static {v1}, L۟/jb;->ۥ۟ۧ([Ljava/lang/Object;)Ljava/util/List;

    .line 310
    .line 311
    .line 312
    move-result-object v0

    .line 313
    new-instance v5, Ljava/util/ArrayList;

    .line 314
    .line 315
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 316
    .line 317
    .line 318
    new-array v1, v3, [Ljava/lang/String;

    .line 319
    .line 320
    new-array v6, v3, [B

    .line 321
    .line 322
    const/16 v7, 0x3b

    .line 323
    .line 324
    aput-byte v7, v6, v4

    .line 325
    .line 326
    new-array v7, v2, [B

    .line 327
    .line 328
    fill-array-data v7, :array_11

    .line 329
    .line 330
    .line 331
    invoke-static {v6, v7}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v6

    .line 335
    aput-object v6, v1, v4

    .line 336
    .line 337
    invoke-static {p0, v1}, L۟/va;->ۥۡۥ(Ljava/lang/CharSequence;[Ljava/lang/String;)Ljava/util/List;

    .line 338
    .line 339
    .line 340
    move-result-object p0

    .line 341
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 346
    .line 347
    .line 348
    move-result v1

    .line 349
    if-eqz v1, :cond_3

    .line 350
    .line 351
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 352
    .line 353
    .line 354
    move-result-object v1

    .line 355
    check-cast v1, Ljava/lang/String;

    .line 356
    .line 357
    :try_start_0
    const-string v6, "pattern"

    .line 358
    .line 359
    invoke-static {v6, v1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 360
    .line 361
    .line 362
    invoke-static {v1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 363
    .line 364
    .line 365
    move-result-object v6

    .line 366
    const-string v7, "compile(...)"

    .line 367
    .line 368
    invoke-static {v7, v6}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 369
    .line 370
    .line 371
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 372
    .line 373
    .line 374
    goto :goto_1

    .line 375
    :catch_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 376
    .line 377
    .line 378
    move-result-object v6

    .line 379
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 380
    .line 381
    .line 382
    move-result v7

    .line 383
    if-eqz v7, :cond_2

    .line 384
    .line 385
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 386
    .line 387
    .line 388
    move-result-object v7

    .line 389
    check-cast v7, Ljava/lang/String;

    .line 390
    .line 391
    new-instance v8, Ljava/lang/StringBuilder;

    .line 392
    .line 393
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 394
    .line 395
    .line 396
    const-string v9, "\\"

    .line 397
    .line 398
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 399
    .line 400
    .line 401
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 402
    .line 403
    .line 404
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 405
    .line 406
    .line 407
    move-result-object v8

    .line 408
    invoke-static {v1, v7, v8}, L۟/ta;->ۥ۠ۨ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 409
    .line 410
    .line 411
    move-result-object v1

    .line 412
    goto :goto_2

    .line 413
    :cond_2
    invoke-virtual {v5, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 414
    .line 415
    .line 416
    goto :goto_1

    .line 417
    :cond_3
    new-array p0, v3, [B

    .line 418
    .line 419
    const/16 v0, -0x77

    .line 420
    .line 421
    aput-byte v0, p0, v4

    .line 422
    .line 423
    new-array v0, v2, [B

    .line 424
    .line 425
    fill-array-data v0, :array_12

    .line 426
    .line 427
    .line 428
    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v6

    .line 432
    const/4 v7, 0x0

    .line 433
    const/4 v8, 0x0

    .line 434
    const/4 v9, 0x0

    .line 435
    const/16 v10, 0x3e

    .line 436
    .line 437
    invoke-static/range {v5 .. v10}, L۟/o0;->ۥ۠ۥ(Ljava/lang/Iterable;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;L۟/c$a;I)Ljava/lang/String;

    .line 438
    .line 439
    .line 440
    move-result-object p0

    .line 441
    return-object p0

    .line 442
    nop

    .line 443
    :array_0
    .array-data 1
        0x4bt
        -0x3bt
        0x0t
        -0x2et
    .end array-data

    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    :array_1
    .array-data 1
        0x3ft
        -0x60t
        0x78t
        -0x5at
        -0x63t
        0x52t
    .end array-data

    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    nop

    .line 457
    :array_2
    .array-data 1
        -0x4ft
        -0xct
        -0x77t
        -0x5at
        0x27t
        0x69t
    .end array-data

    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    nop

    .line 465
    :array_3
    .array-data 1
        0x3dt
        0x4ft
        0x57t
        0x6t
        -0x50t
        0x1dt
    .end array-data

    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    nop

    .line 473
    :array_4
    .array-data 1
        -0x3t
        -0x6bt
        -0x4ft
        0x76t
        0x3t
        -0x4ct
    .end array-data

    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    nop

    .line 481
    :array_5
    .array-data 1
        0x7bt
        -0x35t
        0x38t
        0xct
        -0x74t
        0x10t
    .end array-data

    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    nop

    .line 489
    :array_6
    .array-data 1
        -0x3dt
        0x70t
        0x26t
        0x4et
        0x62t
        0x26t
    .end array-data

    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    nop

    .line 497
    :array_7
    .array-data 1
        -0x21t
        0x78t
        0x5ft
        0x62t
        -0x51t
        0x58t
    .end array-data

    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    nop

    .line 505
    :array_8
    .array-data 1
        0xct
        0x6dt
        -0xet
        -0x6t
        0x40t
        -0x77t
    .end array-data

    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    nop

    .line 513
    :array_9
    .array-data 1
        -0x73t
        -0xbt
        -0x68t
        0x3ft
        0x51t
        0x57t
    .end array-data

    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    nop

    .line 521
    :array_a
    .array-data 1
        -0x15t
        -0x61t
        -0x63t
        -0x15t
        0x4dt
        -0x7t
    .end array-data

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    nop

    .line 529
    :array_b
    .array-data 1
        0x1bt
        -0x4bt
        0x59t
        0x44t
        -0x74t
        -0x55t
    .end array-data

    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    nop

    .line 537
    :array_c
    .array-data 1
        -0x1t
        0x31t
        0x54t
        -0x49t
        0x34t
        0x76t
    .end array-data

    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    nop

    .line 545
    :array_d
    .array-data 1
        0x2at
        -0x51t
        -0x69t
        -0x3ct
        0x6bt
        0x3dt
    .end array-data

    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    nop

    .line 553
    :array_e
    .array-data 1
        0x40t
        -0x52t
        -0x4at
        0x6ft
        0x15t
        0x5ft
    .end array-data

    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    nop

    .line 561
    :array_f
    .array-data 1
        0x51t
        0x5bt
        0x1bt
        0x7ft
        0x8t
        0x19t
    .end array-data

    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    nop

    .line 569
    :array_10
    .array-data 1
        0x73t
        0x54t
        0x78t
        0x67t
        -0x35t
        -0x62t
    .end array-data

    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    nop

    .line 577
    :array_11
    .array-data 1
        0x47t
        -0x22t
        -0x58t
        -0x2et
        0x13t
        -0x6t
    .end array-data

    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    nop

    .line 585
    :array_12
    .array-data 1
        -0xbt
        -0x4ft
        -0x49t
        -0x75t
        -0x67t
        -0x9t
    .end array-data
.end method

.method public static ۥ۟ۡ(Lorg/json/JSONArray;)Z
    .locals 0

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result p0

    if-lez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟ۢ(Ljava/lang/String;)V
    .locals 11

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    new-array v3, v2, [B

    .line 9
    .line 10
    fill-array-data v3, :array_1

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    new-instance v1, Landroid/content/Intent;

    .line 17
    .line 18
    invoke-direct {v1}, Landroid/content/Intent;-><init>()V

    .line 19
    .line 20
    .line 21
    const/high16 v3, 0x10000000

    .line 22
    .line 23
    invoke-virtual {v1, v3}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 24
    .line 25
    .line 26
    new-instance v3, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 29
    .line 30
    .line 31
    const-string v4, "mqqopensdkapi://bizAgent/qm/qr?url=http%3A%2F%2Fqm.qq.com%2Fcgi-bin%2Fqm%2Fqr%3Ffrom%3Dapp%26p%3Dandroid%26jump_from%3Dwebapi%26k%3D"

    .line 32
    .line 33
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-virtual {v1, p0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 48
    .line 49
    .line 50
    const/16 p0, 0xb

    .line 51
    .line 52
    const/4 v3, 0x0

    .line 53
    :try_start_0
    new-array p0, p0, [B

    .line 54
    .line 55
    const/16 v4, 0x48

    .line 56
    .line 57
    aput-byte v4, p0, v3

    .line 58
    .line 59
    const/16 v4, 0x74

    .line 60
    .line 61
    const/4 v5, 0x1

    .line 62
    aput-byte v4, p0, v5

    .line 63
    .line 64
    const/16 v4, -0x15

    .line 65
    .line 66
    const/4 v6, 0x2

    .line 67
    aput-byte v4, p0, v6

    .line 68
    .line 69
    const/16 v4, -0x38

    .line 70
    .line 71
    aput-byte v4, p0, v0

    .line 72
    .line 73
    const/16 v4, -0x78

    .line 74
    .line 75
    const/4 v7, 0x4

    .line 76
    aput-byte v4, p0, v7

    .line 77
    .line 78
    const/16 v4, 0xd

    .line 79
    .line 80
    const/4 v8, 0x5

    .line 81
    aput-byte v4, p0, v8

    .line 82
    .line 83
    const/16 v4, -0xf

    .line 84
    .line 85
    aput-byte v4, p0, v2

    .line 86
    .line 87
    const/16 v4, -0x6e

    .line 88
    .line 89
    const/4 v9, 0x7

    .line 90
    aput-byte v4, p0, v9

    .line 91
    .line 92
    const/16 v4, 0x8

    .line 93
    .line 94
    const/16 v10, -0x41

    .line 95
    .line 96
    aput-byte v10, p0, v4

    .line 97
    .line 98
    const/16 v4, 0x9

    .line 99
    .line 100
    const/16 v10, -0x62

    .line 101
    .line 102
    aput-byte v10, p0, v4

    .line 103
    .line 104
    const/16 v4, 0xa

    .line 105
    .line 106
    const/16 v10, -0x6f

    .line 107
    .line 108
    aput-byte v10, p0, v4

    .line 109
    .line 110
    new-array v4, v2, [B

    .line 111
    .line 112
    const/16 v10, -0x60

    .line 113
    .line 114
    aput-byte v10, v4, v3

    .line 115
    .line 116
    const/16 v10, -0x3d

    .line 117
    .line 118
    aput-byte v10, v4, v5

    .line 119
    .line 120
    const/16 v5, 0x58

    .line 121
    .line 122
    aput-byte v5, v4, v6

    .line 123
    .line 124
    const/16 v5, 0x20

    .line 125
    .line 126
    aput-byte v5, v4, v0

    .line 127
    .line 128
    const/16 v0, 0x35

    .line 129
    .line 130
    aput-byte v0, v4, v7

    .line 131
    .line 132
    const/16 v0, -0x5f

    .line 133
    .line 134
    aput-byte v0, v4, v8

    .line 135
    .line 136
    invoke-static {p0, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    invoke-static {v3, p0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    sget-object p0, L۟/l3;->ۥ:Landroid/content/Context;

    .line 144
    .line 145
    if-eqz p0, :cond_0

    .line 146
    .line 147
    invoke-virtual {p0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 148
    .line 149
    .line 150
    goto :goto_0

    .line 151
    :cond_0
    new-array p0, v9, [B

    .line 152
    .line 153
    fill-array-data p0, :array_2

    .line 154
    .line 155
    .line 156
    new-array v0, v2, [B

    .line 157
    .line 158
    fill-array-data v0, :array_3

    .line 159
    .line 160
    .line 161
    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-static {p0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    const/4 p0, 0x0

    .line 169
    throw p0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 170
    :catch_0
    move-exception p0

    .line 171
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p0

    .line 175
    new-instance v0, Ljava/lang/StringBuilder;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 178
    .line 179
    .line 180
    const-string v1, "\u8df3\u8f6cQQ\u7fa4\u5931\u8d25:"

    .line 181
    .line 182
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object p0

    .line 192
    invoke-static {v3, p0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :goto_0
    return-void

    .line 196
    nop

    .line 197
    :array_0
    .array-data 1
        -0x45t
        0x5at
        -0x3dt
    .end array-data

    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    :array_1
    .array-data 1
        -0x30t
        0x3ft
        -0x46t
        0x41t
        -0x33t
        -0x67t
    .end array-data

    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    nop

    .line 211
    :array_2
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    :array_3
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public static ۥۣ۟()V
    .locals 4

    .line 1
    sget-object v0, L۟/l3;->ۥ:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v1, 0x6

    .line 4
    if-eqz v0, :cond_2

    .line 5
    .line 6
    const/16 v2, 0x8

    .line 7
    .line 8
    new-array v2, v2, [B

    .line 9
    .line 10
    fill-array-data v2, :array_0

    .line 11
    .line 12
    .line 13
    new-array v3, v1, [B

    .line 14
    .line 15
    fill-array-data v3, :array_1

    .line 16
    .line 17
    .line 18
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const/16 v2, 0x40

    .line 27
    .line 28
    new-array v2, v2, [B

    .line 29
    .line 30
    fill-array-data v2, :array_2

    .line 31
    .line 32
    .line 33
    new-array v3, v1, [B

    .line 34
    .line 35
    fill-array-data v3, :array_3

    .line 36
    .line 37
    .line 38
    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    invoke-static {v2, v0}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    check-cast v0, Landroid/app/ActivityManager;

    .line 46
    .line 47
    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    const/16 v2, 0x1b

    .line 52
    .line 53
    new-array v2, v2, [B

    .line 54
    .line 55
    fill-array-data v2, :array_4

    .line 56
    .line 57
    .line 58
    new-array v1, v1, [B

    .line 59
    .line 60
    fill-array-data v1, :array_5

    .line 61
    .line 62
    .line 63
    invoke-static {v2, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result v1

    .line 78
    if-eqz v1, :cond_1

    .line 79
    .line 80
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    check-cast v1, Landroid/app/ActivityManager$RunningAppProcessInfo;

    .line 85
    .line 86
    iget v2, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 87
    .line 88
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 89
    .line 90
    .line 91
    move-result v3

    .line 92
    if-eq v2, v3, :cond_0

    .line 93
    .line 94
    iget v1, v1, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    .line 95
    .line 96
    invoke-static {v1}, Landroid/os/Process;->killProcess(I)V

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_1
    invoke-static {}, Landroid/os/Process;->myPid()I

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    invoke-static {v0}, Landroid/os/Process;->killProcess(I)V

    .line 105
    .line 106
    .line 107
    return-void

    .line 108
    :cond_2
    const/4 v0, 0x7

    .line 109
    new-array v0, v0, [B

    .line 110
    .line 111
    fill-array-data v0, :array_6

    .line 112
    .line 113
    .line 114
    new-array v1, v1, [B

    .line 115
    .line 116
    fill-array-data v1, :array_7

    .line 117
    .line 118
    .line 119
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v0

    .line 123
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    const/4 v0, 0x0

    .line 127
    throw v0

    .line 128
    nop

    .line 129
    :array_0
    .array-data 1
        0x34t
        0x24t
        -0x3t
        -0x71t
        -0x68t
        -0x44t
        0x21t
        0x3et
    .end array-data

    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    :array_1
    .array-data 1
        0x55t
        0x47t
        -0x77t
        -0x1at
        -0x12t
        -0x2bt
    .end array-data

    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    nop

    .line 145
    :array_2
    .array-data 1
        -0x5bt
        -0x70t
        -0x13t
        0xat
        0x30t
        0x5dt
        -0x56t
        -0x75t
        -0x11t
        0x9t
        0x64t
        0x1et
        -0x57t
        -0x80t
        -0x5ft
        0x5t
        0x71t
        0x4dt
        -0x41t
        -0x3bt
        -0xbt
        0x9t
        0x30t
        0x50t
        -0x5ct
        -0x75t
        -0x54t
        0x8t
        0x65t
        0x52t
        -0x59t
        -0x3bt
        -0xbt
        0x1ft
        0x60t
        0x5bt
        -0x15t
        -0x7ct
        -0x11t
        0x2t
        0x62t
        0x51t
        -0x5et
        -0x7ft
        -0x51t
        0x7t
        0x60t
        0x4et
        -0x1bt
        -0x5ct
        -0x1et
        0x12t
        0x79t
        0x48t
        -0x5et
        -0x6ft
        -0x8t
        0x2bt
        0x71t
        0x50t
        -0x56t
        -0x7et
        -0x1ct
        0x14t
    .end array-data

    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    :array_3
    .array-data 1
        -0x35t
        -0x1bt
        -0x7ft
        0x66t
        0x10t
        0x3et
    .end array-data

    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    nop

    .line 189
    :array_4
    .array-data 1
        0x4bt
        0x19t
        -0x2ft
        -0x1bt
        -0x31t
        -0x38t
        0x42t
        0x15t
        -0x35t
        -0x30t
        -0x5t
        -0x2at
        0x5ct
        0x2ct
        -0x29t
        -0x28t
        -0x27t
        -0x3dt
        0x5ft
        0xft
        -0x40t
        -0x3ct
        -0x6et
        -0x78t
        0x2t
        0x52t
        -0x74t
    .end array-data

    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    :array_5
    .array-data 1
        0x2ct
        0x7ct
        -0x5bt
        -0x49t
        -0x46t
        -0x5at
    .end array-data

    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    nop

    .line 215
    :array_6
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    :array_7
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public static ۥ۟ۤ(Lorg/json/JSONArray;)I
    .locals 2

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v0, v0, [B

    fill-array-data v0, :array_1

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    return p0

    nop

    :array_0
    .array-data 1
        -0xft
        0x56t
        -0x76t
        0x1bt
        -0x48t
        -0x3dt
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x33t
        0x22t
        -0x1et
        0x72t
        -0x35t
        -0x3t
    .end array-data
.end method

.method public static ۥ۟ۥ(Ljava/lang/String;)V
    .locals 17

    .line 1
    const/4 v0, 0x3

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x6

    .line 8
    new-array v3, v2, [B

    .line 9
    .line 10
    fill-array-data v3, :array_1

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    move-object/from16 v3, p0

    .line 18
    .line 19
    invoke-static {v1, v3}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x12

    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    :try_start_0
    sget-object v5, L۟/l3;->ۥ:Landroid/content/Context;

    .line 26
    .line 27
    const/4 v6, 0x7

    .line 28
    if-eqz v5, :cond_0

    .line 29
    .line 30
    new-instance v7, Landroid/content/Intent;

    .line 31
    .line 32
    const/16 v8, 0x1a

    .line 33
    .line 34
    new-array v8, v8, [B

    .line 35
    .line 36
    const/16 v9, 0x37

    .line 37
    .line 38
    aput-byte v9, v8, v4

    .line 39
    .line 40
    const/16 v9, -0x7b

    .line 41
    .line 42
    const/4 v10, 0x1

    .line 43
    aput-byte v9, v8, v10

    .line 44
    .line 45
    const/16 v9, 0xd

    .line 46
    .line 47
    const/4 v11, 0x2

    .line 48
    aput-byte v9, v8, v11

    .line 49
    .line 50
    const/16 v12, -0x32

    .line 51
    .line 52
    aput-byte v12, v8, v0

    .line 53
    .line 54
    const/16 v12, -0x21

    .line 55
    .line 56
    const/4 v13, 0x4

    .line 57
    aput-byte v12, v8, v13

    .line 58
    .line 59
    const/4 v12, 0x5

    .line 60
    aput-byte v1, v8, v12

    .line 61
    .line 62
    const/16 v14, 0x32

    .line 63
    .line 64
    aput-byte v14, v8, v2

    .line 65
    .line 66
    const/16 v15, -0x3b

    .line 67
    .line 68
    aput-byte v15, v8, v6

    .line 69
    .line 70
    const/16 v15, 0x8

    .line 71
    .line 72
    aput-byte v4, v8, v15

    .line 73
    .line 74
    const/16 v15, 0x9

    .line 75
    .line 76
    const/16 v16, -0x2e

    .line 77
    .line 78
    aput-byte v16, v8, v15

    .line 79
    .line 80
    const/16 v15, 0xa

    .line 81
    .line 82
    const/16 v16, -0x3c

    .line 83
    .line 84
    aput-byte v16, v8, v15

    .line 85
    .line 86
    const/16 v15, 0xb

    .line 87
    .line 88
    const/16 v16, 0x1e

    .line 89
    .line 90
    aput-byte v16, v8, v15

    .line 91
    .line 92
    const/16 v15, 0xc

    .line 93
    .line 94
    const/16 v16, 0x38

    .line 95
    .line 96
    aput-byte v16, v8, v15

    .line 97
    .line 98
    const/16 v15, -0x61

    .line 99
    .line 100
    aput-byte v15, v8, v9

    .line 101
    .line 102
    const/16 v9, 0xe

    .line 103
    .line 104
    const/16 v15, 0x47

    .line 105
    .line 106
    aput-byte v15, v8, v9

    .line 107
    .line 108
    const/16 v9, -0x23

    .line 109
    .line 110
    const/16 v15, 0xf

    .line 111
    .line 112
    aput-byte v9, v8, v15

    .line 113
    .line 114
    const/16 v9, 0x10

    .line 115
    .line 116
    const/16 v16, -0x2d

    .line 117
    .line 118
    aput-byte v16, v8, v9

    .line 119
    .line 120
    const/16 v9, 0x11

    .line 121
    .line 122
    aput-byte v15, v8, v9

    .line 123
    .line 124
    const/16 v9, 0x3f

    .line 125
    .line 126
    aput-byte v9, v8, v1

    .line 127
    .line 128
    const/16 v9, -0x7c

    .line 129
    .line 130
    const/16 v15, 0x13

    .line 131
    .line 132
    aput-byte v9, v8, v15

    .line 133
    .line 134
    const/16 v9, 0x14

    .line 135
    .line 136
    aput-byte v6, v8, v9

    .line 137
    .line 138
    const/16 v6, 0x15

    .line 139
    .line 140
    const/16 v9, -0x6e

    .line 141
    .line 142
    aput-byte v9, v8, v6

    .line 143
    .line 144
    const/16 v6, 0x16

    .line 145
    .line 146
    const/16 v9, -0x1a

    .line 147
    .line 148
    aput-byte v9, v8, v6

    .line 149
    .line 150
    const/16 v6, 0x17

    .line 151
    .line 152
    aput-byte v14, v8, v6

    .line 153
    .line 154
    const/16 v6, 0x18

    .line 155
    .line 156
    aput-byte v15, v8, v6

    .line 157
    .line 158
    const/16 v6, 0x19

    .line 159
    .line 160
    const/16 v9, -0x44

    .line 161
    .line 162
    aput-byte v9, v8, v6

    .line 163
    .line 164
    new-array v6, v2, [B

    .line 165
    .line 166
    const/16 v14, 0x56

    .line 167
    .line 168
    aput-byte v14, v6, v4

    .line 169
    .line 170
    const/16 v14, -0x15

    .line 171
    .line 172
    aput-byte v14, v6, v10

    .line 173
    .line 174
    const/16 v10, 0x69

    .line 175
    .line 176
    aput-byte v10, v6, v11

    .line 177
    .line 178
    aput-byte v9, v6, v0

    .line 179
    .line 180
    const/16 v0, -0x50

    .line 181
    .line 182
    aput-byte v0, v6, v13

    .line 183
    .line 184
    const/16 v0, 0x7b

    .line 185
    .line 186
    aput-byte v0, v6, v12

    .line 187
    .line 188
    invoke-static {v8, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    invoke-static/range {p0 .. p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-direct {v7, v0, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 197
    .line 198
    .line 199
    const/high16 v0, 0x10000000

    .line 200
    .line 201
    invoke-virtual {v7, v0}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v5, v7}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 205
    .line 206
    .line 207
    goto :goto_0

    .line 208
    :cond_0
    new-array v0, v6, [B

    .line 209
    .line 210
    fill-array-data v0, :array_2

    .line 211
    .line 212
    .line 213
    new-array v3, v2, [B

    .line 214
    .line 215
    fill-array-data v3, :array_3

    .line 216
    .line 217
    .line 218
    invoke-static {v0, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    invoke-static {v0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    const/4 v0, 0x0

    .line 226
    throw v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 227
    :catch_0
    new-array v0, v1, [B

    .line 228
    .line 229
    fill-array-data v0, :array_4

    .line 230
    .line 231
    .line 232
    new-array v1, v2, [B

    .line 233
    .line 234
    fill-array-data v1, :array_5

    .line 235
    .line 236
    .line 237
    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    invoke-static {v4, v0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 242
    .line 243
    .line 244
    :goto_0
    return-void

    .line 245
    :array_0
    .array-data 1
        0x63t
        0x17t
        0x70t
    .end array-data

    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    :array_1
    .array-data 1
        0x16t
        0x65t
        0x1ct
        -0x74t
        -0x33t
        -0x69t
    .end array-data

    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    nop

    .line 259
    :array_2
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    :array_3
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data

    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    nop

    .line 275
    :array_4
    .array-data 1
        -0x3at
        0x28t
        0x4bt
        0x2dt
        0x5ct
        0x2at
        -0x37t
        0x32t
        0x66t
        0x2et
        0x6et
        0xft
        -0x3bt
        0x5t
        0x69t
        0x20t
        0x54t
        0xft
    .end array-data

    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    nop

    .line 289
    :array_5
    .array-data 1
        0x20t
        -0x5ft
        -0x28t
        -0x38t
        -0x20t
        -0x56t
    .end array-data
.end method

.method public static ۥ۟ۦ(Z)V
    .locals 9

    .line 1
    invoke-static {}, L۟/l3;->ۥ۟۠()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/16 v1, 0x13

    .line 10
    .line 11
    new-array v1, v1, [B

    .line 12
    .line 13
    fill-array-data v1, :array_0

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x6

    .line 17
    new-array v3, v2, [B

    .line 18
    .line 19
    fill-array-data v3, :array_1

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 v1, 0x7

    .line 30
    new-array v3, v1, [B

    .line 31
    .line 32
    fill-array-data v3, :array_2

    .line 33
    .line 34
    .line 35
    new-array v4, v2, [B

    .line 36
    .line 37
    fill-array-data v4, :array_3

    .line 38
    .line 39
    .line 40
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    const/4 v3, 0x3

    .line 44
    new-array v3, v3, [B

    .line 45
    .line 46
    fill-array-data v3, :array_4

    .line 47
    .line 48
    .line 49
    new-array v4, v2, [B

    .line 50
    .line 51
    fill-array-data v4, :array_5

    .line 52
    .line 53
    .line 54
    invoke-static {v3, v4}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    new-instance v3, Landroid/content/Intent;

    .line 58
    .line 59
    const/16 v4, 0x1a

    .line 60
    .line 61
    new-array v5, v4, [B

    .line 62
    .line 63
    fill-array-data v5, :array_6

    .line 64
    .line 65
    .line 66
    new-array v6, v2, [B

    .line 67
    .line 68
    fill-array-data v6, :array_7

    .line 69
    .line 70
    .line 71
    invoke-static {v5, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    const/4 v6, 0x0

    .line 76
    invoke-direct {v3, v5, v6}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V

    .line 77
    .line 78
    .line 79
    const/16 v5, 0x20

    .line 80
    .line 81
    new-array v7, v5, [B

    .line 82
    .line 83
    fill-array-data v7, :array_8

    .line 84
    .line 85
    .line 86
    new-array v8, v2, [B

    .line 87
    .line 88
    fill-array-data v8, :array_9

    .line 89
    .line 90
    .line 91
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v7

    .line 95
    invoke-virtual {v3, v7}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v0}, Landroid/content/Intent;->setPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 99
    .line 100
    .line 101
    sget-object v7, L۟/l3;->ۥ:Landroid/content/Context;

    .line 102
    .line 103
    if-eqz v7, :cond_5

    .line 104
    .line 105
    invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    const/16 v7, 0x16

    .line 110
    .line 111
    new-array v7, v7, [B

    .line 112
    .line 113
    fill-array-data v7, :array_a

    .line 114
    .line 115
    .line 116
    new-array v8, v2, [B

    .line 117
    .line 118
    fill-array-data v8, :array_b

    .line 119
    .line 120
    .line 121
    invoke-static {v7, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v7

    .line 125
    invoke-static {v7, v1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    invoke-virtual {v1, v3, v7}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    new-array v3, v4, [B

    .line 134
    .line 135
    fill-array-data v3, :array_c

    .line 136
    .line 137
    .line 138
    new-array v8, v2, [B

    .line 139
    .line 140
    fill-array-data v8, :array_d

    .line 141
    .line 142
    .line 143
    invoke-static {v3, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object v3

    .line 147
    invoke-static {v3, v1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 148
    .line 149
    .line 150
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 151
    .line 152
    .line 153
    move-result v3

    .line 154
    if-nez v3, :cond_0

    .line 155
    .line 156
    const-string v1, ""

    .line 157
    .line 158
    goto :goto_0

    .line 159
    :cond_0
    invoke-interface {v1, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v1

    .line 163
    check-cast v1, Landroid/content/pm/ResolveInfo;

    .line 164
    .line 165
    iget-object v1, v1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    .line 166
    .line 167
    iget-object v1, v1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    .line 168
    .line 169
    const/4 v3, 0x4

    .line 170
    new-array v3, v3, [B

    .line 171
    .line 172
    fill-array-data v3, :array_e

    .line 173
    .line 174
    .line 175
    new-array v8, v2, [B

    .line 176
    .line 177
    fill-array-data v8, :array_f

    .line 178
    .line 179
    .line 180
    invoke-static {v3, v8}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v3

    .line 184
    invoke-static {v3, v1}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    .line 185
    .line 186
    .line 187
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 188
    .line 189
    .line 190
    move-result v3

    .line 191
    if-nez v3, :cond_1

    .line 192
    .line 193
    const/4 v3, 0x1

    .line 194
    goto :goto_1

    .line 195
    :cond_1
    move v3, v7

    .line 196
    :goto_1
    if-eqz v3, :cond_2

    .line 197
    .line 198
    goto :goto_2

    .line 199
    :cond_2
    new-instance v3, Landroid/content/Intent;

    .line 200
    .line 201
    new-array v4, v4, [B

    .line 202
    .line 203
    fill-array-data v4, :array_10

    .line 204
    .line 205
    .line 206
    new-array v6, v2, [B

    .line 207
    .line 208
    fill-array-data v6, :array_11

    .line 209
    .line 210
    .line 211
    invoke-static {v4, v6}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v4

    .line 215
    invoke-direct {v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 216
    .line 217
    .line 218
    new-array v4, v5, [B

    .line 219
    .line 220
    fill-array-data v4, :array_12

    .line 221
    .line 222
    .line 223
    new-array v5, v2, [B

    .line 224
    .line 225
    fill-array-data v5, :array_13

    .line 226
    .line 227
    .line 228
    invoke-static {v4, v5}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v4

    .line 232
    invoke-virtual {v3, v4}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3, v0, v1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 236
    .line 237
    .line 238
    const/high16 v0, 0x10000000

    .line 239
    .line 240
    invoke-virtual {v3, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 241
    .line 242
    .line 243
    move-result-object v6

    .line 244
    :goto_2
    if-nez v6, :cond_3

    .line 245
    .line 246
    const/16 p0, 0x1e

    .line 247
    .line 248
    new-array p0, p0, [B

    .line 249
    .line 250
    fill-array-data p0, :array_14

    .line 251
    .line 252
    .line 253
    new-array v0, v2, [B

    .line 254
    .line 255
    fill-array-data v0, :array_15

    .line 256
    .line 257
    .line 258
    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-static {v7, p0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    .line 263
    .line 264
    .line 265
    return-void

    .line 266
    :cond_3
    const v0, 0x14008000

    .line 267
    .line 268
    .line 269
    invoke-virtual {v6, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 270
    .line 271
    .line 272
    invoke-static {}, L۟/l3;->ۥ۟۠()Landroid/content/Context;

    .line 273
    .line 274
    .line 275
    move-result-object v0

    .line 276
    invoke-virtual {v0, v6}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 277
    .line 278
    .line 279
    if-nez p0, :cond_4

    .line 280
    .line 281
    return-void

    .line 282
    :cond_4
    invoke-static {}, L۟/o;->ۥۣ۟()V

    .line 283
    .line 284
    .line 285
    return-void

    .line 286
    :cond_5
    new-array p0, v1, [B

    .line 287
    .line 288
    fill-array-data p0, :array_16

    .line 289
    .line 290
    .line 291
    new-array v0, v2, [B

    .line 292
    .line 293
    fill-array-data v0, :array_17

    .line 294
    .line 295
    .line 296
    invoke-static {p0, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 297
    .line 298
    .line 299
    move-result-object p0

    .line 300
    invoke-static {p0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 301
    .line 302
    .line 303
    throw v6

    .line 304
    nop

    .line 305
    :array_0
    .array-data 1
        0x18t
        -0x19t
        -0x60t
        0x7bt
        -0x76t
        -0x73t
        0x14t
        -0x1dt
        -0x4dt
        0x4et
        -0x5bt
        -0x71t
        0x12t
        -0x19t
        -0x4t
        0x5t
        -0x3bt
        -0x40t
        0x56t
    .end array-data

    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    :array_1
    .array-data 1
        0x7ft
        -0x7et
        -0x2ct
        0x2bt
        -0x15t
        -0x12t
    .end array-data

    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    nop

    .line 327
    :array_2
    .array-data 1
        0x36t
        -0x4ct
        0x5bt
        0x9t
        -0x12t
        0x13t
        0x23t
    .end array-data

    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    :array_3
    .array-data 1
        0x46t
        -0x21t
        0x3ct
        0x47t
        -0x71t
        0x7et
    .end array-data

    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    nop

    .line 343
    :array_4
    .array-data 1
        -0x2bt
        0x4t
        0x74t
    .end array-data

    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    :array_5
    .array-data 1
        -0x5bt
        0x6ft
        0x13t
        -0x58t
        0x1at
        -0x33t
    .end array-data

    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    nop

    .line 357
    :array_6
    .array-data 1
        -0x2bt
        -0x37t
        0x7t
        0x56t
        0x4dt
        0x30t
        -0x30t
        -0x77t
        0xat
        0x4at
        0x56t
        0x3ct
        -0x26t
        -0x2dt
        0x4dt
        0x45t
        0x41t
        0x2dt
        -0x23t
        -0x38t
        0xdt
        0xat
        0x6ft
        0x18t
        -0x3t
        -0x17t
    .end array-data

    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    nop

    .line 375
    :array_7
    .array-data 1
        -0x4ct
        -0x59t
        0x63t
        0x24t
        0x22t
        0x59t
    .end array-data

    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    nop

    .line 383
    :array_8
    .array-data 1
        -0x48t
        0x54t
        -0x16t
        0x0t
        -0xet
        0x27t
        -0x43t
        0x14t
        -0x19t
        0x1ct
        -0x17t
        0x2bt
        -0x49t
        0x4et
        -0x60t
        0x11t
        -0x4t
        0x3at
        -0x44t
        0x5dt
        -0x1ft
        0x0t
        -0x1ct
        0x60t
        -0x6bt
        0x7bt
        -0x25t
        0x3ct
        -0x22t
        0x6t
        -0x64t
        0x68t
    .end array-data

    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    :array_9
    .array-data 1
        -0x27t
        0x3at
        -0x72t
        0x72t
        -0x63t
        0x4et
    .end array-data

    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    nop

    .line 411
    :array_a
    .array-data 1
        -0x32t
        0x3ct
        0x23t
        0x29t
        0x44t
        -0x7et
        -0x3et
        0x38t
        0x30t
        0x1ct
        0x68t
        -0x80t
        -0x39t
        0x38t
        0x30t
        0x1ct
        0x57t
        -0x37t
        -0x79t
        0x77t
        0x79t
        0x50t
    .end array-data

    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    nop

    .line 427
    :array_b
    .array-data 1
        -0x57t
        0x59t
        0x57t
        0x79t
        0x25t
        -0x1ft
    .end array-data

    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    nop

    .line 435
    :array_c
    .array-data 1
        -0x7t
        -0x62t
        0x41t
        0xct
        0x58t
        0x2et
        -0x1at
        -0x61t
        0x41t
        0x10t
        0x55t
        0x26t
        -0x15t
        -0x61t
        0x4dt
        0x8t
        0x48t
        0x13t
        -0x1ft
        -0x72t
        0x57t
        0x56t
        0xft
        0x49t
        -0x5at
        -0x3et
    .end array-data

    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    nop

    .line 453
    :array_d
    .array-data 1
        -0x78t
        -0x15t
        0x24t
        0x7et
        0x21t
        0x67t
    .end array-data

    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    nop

    .line 461
    :array_e
    .array-data 1
        -0x35t
        0x74t
        -0x52t
        -0x66t
    .end array-data

    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    :array_f
    .array-data 1
        -0x5bt
        0x15t
        -0x3dt
        -0x1t
        -0x2ct
        -0x43t
    .end array-data

    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    nop

    .line 475
    :array_10
    .array-data 1
        0x7dt
        0x44t
        -0x50t
        -0x80t
        0x4et
        0x4dt
        0x78t
        0x4t
        -0x43t
        -0x64t
        0x55t
        0x41t
        0x72t
        0x5et
        -0x6t
        -0x6dt
        0x42t
        0x50t
        0x75t
        0x45t
        -0x46t
        -0x24t
        0x6ct
        0x65t
        0x55t
        0x64t
    .end array-data

    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    nop

    .line 493
    :array_11
    .array-data 1
        0x1ct
        0x2at
        -0x2ct
        -0xet
        0x21t
        0x24t
    .end array-data

    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    nop

    .line 501
    :array_12
    .array-data 1
        -0x2t
        0x4bt
        0x72t
        -0xft
        -0x44t
        -0x7ft
        -0x5t
        0xbt
        0x7ft
        -0x13t
        -0x59t
        -0x73t
        -0xft
        0x51t
        0x38t
        -0x20t
        -0x4et
        -0x64t
        -0x6t
        0x42t
        0x79t
        -0xft
        -0x56t
        -0x3at
        -0x2dt
        0x64t
        0x43t
        -0x33t
        -0x70t
        -0x60t
        -0x26t
        0x77t
    .end array-data

    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    :array_13
    .array-data 1
        -0x61t
        0x25t
        0x16t
        -0x7dt
        -0x2dt
        -0x18t
    .end array-data

    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    nop

    .line 529
    :array_14
    .array-data 1
        0x4et
        -0x6et
        -0x45t
        0x10t
        0x20t
        -0x18t
        -0x3dt
        0x44t
        0x75t
        -0x6et
        -0x19t
        0x26t
        -0x38t
        0x40t
        0x43t
        -0x64t
        -0x37t
        0x11t
        -0x3et
        0x6ct
        0x60t
        0x14t
        0x3et
        -0x14t
        -0x3et
        0x58t
        0x7et
        -0x63t
        -0x6t
        0x39t
    .end array-data

    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    nop

    .line 549
    :array_15
    .array-data 1
        0x27t
        -0x4t
        -0x31t
        0x75t
        0x4et
        -0x64t
    .end array-data

    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    nop

    .line 557
    :array_16
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    :array_17
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public static ۥ۟ۧ(Landroid/widget/TextView;)V
    .locals 11

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    invoke-static {}, Landroid/text/method/LinkMovementMethod;->getInstance()Landroid/text/method/MovementMethod;

    move-result-object v1

    invoke-virtual {p0, v1}, Landroid/widget/TextView;->setMovementMethod(Landroid/text/method/MovementMethod;)V

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    instance-of v1, v1, Landroid/text/Spannable;

    if-eqz v1, :cond_3

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v1

    const/16 v2, 0x3b

    new-array v2, v2, [B

    fill-array-data v2, :array_2

    new-array v3, v0, [B

    fill-array-data v3, :array_3

    invoke-static {v2, v3}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    check-cast v1, Landroid/text/Spannable;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    const-class v3, Landroid/text/style/URLSpan;

    const/4 v4, 0x0

    invoke-interface {v1, v4, v2, v3}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v2

    check-cast v2, [Landroid/text/style/URLSpan;

    invoke-static {v2}, L۟/h4;->ۥ۟(Ljava/lang/Object;)V

    array-length v3, v2

    if-nez v3, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    if-eqz v3, :cond_1

    return-void

    :cond_1
    new-instance v3, Landroid/text/SpannableStringBuilder;

    invoke-virtual {p0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v5

    invoke-direct {v3, v5}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    invoke-virtual {v3}, Landroid/text/SpannableStringBuilder;->clearSpans()V

    array-length v5, v2

    :goto_1
    if-ge v4, v5, :cond_2

    aget-object v6, v2, v4

    new-instance v7, L۟/l1;

    invoke-virtual {v6}, Landroid/text/style/URLSpan;->getURL()Ljava/lang/String;

    move-result-object v8

    const/16 v9, 0xb

    new-array v9, v9, [B

    fill-array-data v9, :array_4

    new-array v10, v0, [B

    fill-array-data v10, :array_5

    invoke-static {v9, v10}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v8}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    new-instance v9, L۟/o$a;

    invoke-direct {v9, p0}, L۟/o$a;-><init>(Landroid/widget/TextView;)V

    invoke-direct {v7, v8, v9}, L۟/l1;-><init>(Ljava/lang/String;L۟/o$a;)V

    invoke-interface {v1, v6}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    move-result v8

    invoke-interface {v1, v6}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    move-result v6

    const/16 v9, 0x21

    invoke-virtual {v3, v7, v8, v6, v9}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_2
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_3
    return-void

    nop

    :array_0
    .array-data 1
        0x5ft
        -0x32t
        0x2bt
        -0x1ft
        0x47t
        -0xct
    .end array-data

    nop

    :array_1
    .array-data 1
        0x63t
        -0x46t
        0x43t
        -0x78t
        0x34t
        -0x36t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x8t
        -0x25t
        -0x23t
        -0x27t
        0x2bt
        -0x19t
        -0x9t
        -0x40t
        -0x21t
        -0x26t
        0x7ft
        -0x5ct
        -0xct
        -0x35t
        -0x6ft
        -0x2at
        0x6at
        -0x9t
        -0x1et
        -0x72t
        -0x3bt
        -0x26t
        0x2bt
        -0x16t
        -0x7t
        -0x40t
        -0x64t
        -0x25t
        0x7et
        -0x18t
        -0x6t
        -0x72t
        -0x3bt
        -0x34t
        0x7bt
        -0x1ft
        -0x4at
        -0x31t
        -0x21t
        -0x2ft
        0x79t
        -0x15t
        -0x1t
        -0x36t
        -0x61t
        -0x3ft
        0x6et
        -0x4t
        -0x1et
        -0x80t
        -0x1et
        -0x3bt
        0x6at
        -0x16t
        -0x8t
        -0x31t
        -0x2dt
        -0x27t
        0x6et
    .end array-data

    :array_3
    .array-data 1
        -0x6at
        -0x52t
        -0x4ft
        -0x4bt
        0xbt
        -0x7ct
    .end array-data

    nop

    :array_4
    .array-data 1
        -0x33t
        0x50t
        0xat
        -0x24t
        0x2bt
        0x45t
        -0x7et
        0x1bt
        0x50t
        -0x59t
        0x50t
    .end array-data

    :array_5
    .array-data 1
        -0x56t
        0x35t
        0x7et
        -0x77t
        0x79t
        0x9t
    .end array-data
.end method

.method public static ۥ۟ۨ(ILjava/lang/String;)V
    .locals 3

    .line 1
    const/4 v0, 0x6

    .line 2
    new-array v1, v0, [B

    .line 3
    .line 4
    fill-array-data v1, :array_0

    .line 5
    .line 6
    .line 7
    new-array v2, v0, [B

    .line 8
    .line 9
    fill-array-data v2, :array_1

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1, p1}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, L۟/ta;->ۥ۠ۦ(Ljava/lang/CharSequence;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-static {v1, v2}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_2

    .line 39
    .line 40
    sget-object v1, L۟/l3;->ۥ:Landroid/content/Context;

    .line 41
    .line 42
    if-eqz v1, :cond_1

    .line 43
    .line 44
    invoke-static {v1, p1, p0}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 49
    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const/4 p0, 0x7

    .line 53
    new-array p0, p0, [B

    .line 54
    .line 55
    fill-array-data p0, :array_2

    .line 56
    .line 57
    .line 58
    new-array p1, v0, [B

    .line 59
    .line 60
    fill-array-data p1, :array_3

    .line 61
    .line 62
    .line 63
    invoke-static {p0, p1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, L۟/h4;->ۥۣ۟(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    const/4 p0, 0x0

    .line 71
    throw p0

    .line 72
    :cond_2
    new-instance v0, L۟/p;

    .line 73
    .line 74
    invoke-direct {v0, p1, p0}, L۟/p;-><init>(Ljava/lang/String;I)V

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, L۟/l3;->ۥۣ۟(L۟/g3;)V

    .line 78
    .line 79
    .line 80
    :goto_0
    return-void

    .line 81
    :array_0
    .array-data 1
        0x44t
        -0x47t
        -0x40t
        -0x5t
        0x37t
        -0x69t
    .end array-data

    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    nop

    .line 89
    :array_1
    .array-data 1
        0x78t
        -0x33t
        -0x58t
        -0x6et
        0x44t
        -0x57t
    .end array-data

    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    nop

    .line 97
    :array_2
    .array-data 1
        -0x79t
        -0x69t
        0xft
        -0x3t
        -0x9t
        0x4et
        -0x70t
    .end array-data

    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    :array_3
    .array-data 1
        -0x1ct
        -0x8t
        0x61t
        -0x77t
        -0x6et
        0x36t
    .end array-data
.end method

.method public static synthetic ۥ۠(Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x0

    invoke-static {v0, p0}, L۟/o;->ۥ۟ۨ(ILjava/lang/String;)V

    return-void
.end method

.method public static ۥ۠۟(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const/4 v1, 0x5

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<font color=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "\'>"

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "</font>"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0

    nop

    :array_0
    .array-data 1
        -0x5et
        0x40t
        0x6et
        0x1et
        0x62t
        -0x1dt
    .end array-data

    nop

    :array_1
    .array-data 1
        -0x62t
        0x34t
        0x6t
        0x77t
        0x11t
        -0x23t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x4et
        -0x76t
        0x56t
        0x4ct
        0xft
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x2ft
        -0x1bt
        0x3at
        0x23t
        0x7dt
        0x7dt
    .end array-data
.end method

.method public static ۥ۠۠(Ljava/lang/String;)Landroid/text/Spanned;
    .locals 3

    const/4 v0, 0x6

    new-array v1, v0, [B

    fill-array-data v1, :array_0

    new-array v2, v0, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, p0}, L۟/h4;->ۥ۟ۡ(Ljava/lang/String;Ljava/lang/Object;)V

    invoke-static {p0}, Landroid/text/Html;->fromHtml(Ljava/lang/String;)Landroid/text/Spanned;

    move-result-object p0

    const/16 v1, 0xd

    new-array v1, v1, [B

    fill-array-data v1, :array_2

    new-array v0, v0, [B

    fill-array-data v0, :array_3

    invoke-static {v1, v0}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, p0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    return-object p0

    :array_0
    .array-data 1
        0x2t
        0x47t
        0x5t
        -0x38t
        -0x36t
        0x6t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x3et
        0x33t
        0x6dt
        -0x5ft
        -0x47t
        0x38t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x30t
        -0x60t
        0x7et
        0x37t
        -0x7et
        -0x34t
        -0x25t
        -0x42t
        0x39t
        0x74t
        -0x1ct
        -0x6at
        -0x61t
    .end array-data

    nop

    :array_3
    .array-data 1
        -0x4at
        -0x2et
        0x11t
        0x5at
        -0x36t
        -0x48t
    .end array-data
.end method
