.class public final L۟/q$c;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/q;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# direct methods
.method public static ۥ()Ljava/util/Stack;
    .locals 4

    const-string v0, "\u06df\u06eb\u06d9\u06e6\u06db\u06dc\u06df\u06e7\u06e8\u06d8\u06db\u06e0\u06e6\u06e7\u06ec\u06db\u06d7\u06e8\u06eb\u06e2\u06e6\u06e6\u06e6\u06e6\u06d9\u06e7\u06ec\u06e1\u06d8\u06d6\u06e8\u06e2\u06e0\u06db\u06eb\u06e5\u06e8\u06df\u06d9\u06df\u06e2\u06d6\u06dc\u06d8\u06d9\u06d6\u06e5\u06e6\u06e0\u06d7\u06da\u06e4\u06db\u06e7\u06e5\u06d8\u06d6\u06ec\u06e0\u06dc\u06df\u06d6\u06d8\u06d8\u06e2\u06e1"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x315

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x172

    const/16 v2, 0x1d2

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x17f

    const/16 v2, 0x1c8

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x2be

    const/16 v2, 0x240

    const v3, -0x2fd67e80

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v0, L۟/q;->ۥ۟۠:Ljava/util/Stack;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch -0x27ef6312
        :pswitch_0
    .end packed-switch
.end method

.method public static ۥ۟()Landroid/os/Handler;
    .locals 4

    const-string v0, "\u06db\u06e5\u06d6\u06d8\u06eb\u06e6\u06e2\u06e4\u06e6\u06e0\u06dc\u06e8\u06d6\u06d8\u06e1\u06db\u06dc\u06eb\u06df\u06d7\u06dc\u06e7\u06d8\u06d8\u06da\u06e0\u06e1\u06e7\u06e0\u06e5\u06d8\u06e4\u06dc\u06e1\u06d8\u06e4\u06e4\u06da\u06d9\u06df\u06e6\u06e8\u06eb\u06d7\u06d6\u06d6\u06dc\u06d8\u06e4\u06e6\u06ec\u06dc\u06e6\u06e8\u06e7\u06df\u06d8\u06e1\u06e5\u06e1\u06d8\u06e4\u06df\u06d9\u06e2\u06da\u06ec\u06e6\u06d8\u06d8\u06e4\u06d8\u06df\u06e2\u06e8\u06d6\u06d8\u06e2\u06d6\u06e2"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x30e

    xor-int/2addr v1, v2

    xor-int/lit8 v1, v1, 0x30

    const/16 v2, 0xd8

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x384

    const/16 v2, 0x280

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x180

    const/16 v2, 0x21

    const v3, 0x3e56d5d8

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    packed-switch v1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    sget-object v0, L۟/q;->ۥ۟:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Handler;

    return-object v0

    nop

    :pswitch_data_0
    .packed-switch 0x4a09c4ee
        :pswitch_0
    .end packed-switch
.end method

.method public static ۥ۟۟()Ljava/util/concurrent/ExecutorService;
    .locals 5

    const/4 v0, 0x0

    const-string v1, "\u06da\u06d7\u06e2\u06e6\u06dc\u06da\u06e5\u06e7\u06da\u06e0\u06e5\u06d8\u06e0\u06e8\u06e5\u06e7\u06df\u06dc\u06db\u06e1\u06df\u06dc\u06dc\u06d8\u06e7\u06e7\u06da\u06e1\u06e7\u06dc\u06d8\u06dc\u06d9\u06e6\u06d8\u06dc\u06da\u06dc\u06d8\u06d8\u06db\u06e6\u06d8\u06d8\u06ec\u06d6\u06e5\u06e7\u06e8\u06d8\u06db\u06d9\u06dc\u06db\u06df\u06e6\u06d8\u06dc\u06e8\u06e7\u06d8\u06df\u06eb\u06e1\u06d8\u06ec\u06d7\u06e6\u06d8\u06db\u06dc\u06e8\u06e8\u06d8\u06d6\u06db\u06d7\u06d6\u06e2\u06d7\u06d8"

    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v2

    const/16 v3, 0x27e

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x176

    const/16 v3, 0xe3

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x32d

    const/16 v3, 0x28

    xor-int/2addr v2, v3

    xor-int/lit16 v2, v2, 0x1dd

    const/16 v3, 0x54

    const v4, -0x708bc3ba

    xor-int/2addr v2, v3

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    sget-object v0, L۟/q;->ۥ۟۟:L۟/kb;

    invoke-virtual {v0}, L۟/kb;->ۥ()Ljava/lang/Object;

    move-result-object v0

    const-string v1, "\u06d7\u06e2\u06e6\u06d8\u06e1\u06e8\u06d8\u06e6\u06df\u06e0\u06e7\u06dc\u06e2\u06e5\u06dc\u06d9\u06e1\u06db\u06e4\u06d8\u06da\u06d6\u06d8\u06db\u06d6\u06e1\u06ec\u06ec\u06da\u06e6\u06d9\u06df\u06d8\u06da\u06e4\u06ec\u06e7\u06ec\u06db\u06e4\u06d6\u06d8\u06e4\u06d9\u06ec\u06eb\u06d6\u06e6\u06d8\u06e4\u06e1\u06d7\u06d7\u06e7\u06e4\u06eb\u06da\u06d6\u06d8\u06e6\u06da\u06d8\u06d8\u06e5\u06e8\u06e8\u06e1\u06eb\u06d7\u06d8\u06d8\u06d8\u06eb\u06ec\u06d7\u06e8\u06da\u06d9"

    goto :goto_0

    :sswitch_1
    const/16 v1, 0xd

    new-array v1, v1, [B

    fill-array-data v1, :array_0

    const/4 v2, 0x6

    new-array v2, v2, [B

    fill-array-data v2, :array_1

    invoke-static {v1, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v1, "\u06db\u06dc\u06df\u06d7\u06db\u06e0\u06ec\u06e8\u06d7\u06e6\u06e0\u06df\u06df\u06e1\u06da\u06e2\u06e8\u06e1\u06db\u06e4\u06dc\u06e1\u06d9\u06df\u06d7\u06e5\u06d8\u06e0\u06e2\u06e5\u06d8\u06e7\u06e8\u06e2\u06df\u06db\u06e5\u06da\u06e8\u06e4\u06e5\u06e4\u06db\u06d8\u06dc\u06eb\u06e6\u06d8\u06e0\u06e4\u06db\u06d6\u06d8\u06db\u06dc\u06db\u06ec\u06db\u06d9\u06d9\u06d6\u06e8\u06d8\u06e7\u06e6\u06e1\u06ec\u06e8\u06d6\u06e7\u06e0\u06dc\u06e4\u06e7\u06e7\u06df\u06dc\u06e6\u06d8\u06db\u06da\u06ec"

    goto :goto_0

    :sswitch_2
    check-cast v0, Ljava/util/concurrent/ExecutorService;

    return-object v0

    :sswitch_data_0
    .sparse-switch
        -0x4eefb8a5 -> :sswitch_1
        0x1699397e -> :sswitch_0
        0x6de0621b -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        0x29t
        -0x2ft
        -0x46t
        0x3at
        0x5t
        -0x7ct
        0x3bt
        -0x2ft
        -0x1at
        0x42t
        0x4at
        -0x3at
        0x67t
    .end array-data

    nop

    :array_1
    .array-data 1
        0x4et
        -0x4ct
        -0x32t
        0x6ct
        0x64t
        -0x18t
    .end array-data
.end method

.method public static ۥ۟۠(Landroid/app/Application;)Ljava/lang/String;
    .locals 12

    const/16 v11, 0xb

    const/4 v4, 0x0

    const/4 v10, 0x6

    const/4 v7, 0x0

    const-string v0, "\u06d7\u06db\u06e5\u06d8\u06eb\u06e8\u06e8\u06d8\u06e5\u06da\u06dc\u06df\u06da\u06d9\u06dc\u06d6\u06d8\u06e6\u06e6\u06e8\u06eb\u06e7\u06e5\u06d8\u06dc\u06d7\u06e4\u06da\u06d8\u06d7\u06e1\u06e6\u06d9\u06d6\u06d6\u06db\u06e1\u06df\u06d6\u06d8\u06d6\u06e7\u06e0\u06e6\u06e2\u06e5\u06d8\u06ec\u06e1\u06dc\u06d8\u06e6\u06e6\u06e4\u06df\u06ec\u06df\u06d9\u06e7\u06d7\u06e5\u06e7\u06df\u06e6\u06e0\u06e4\u06d8\u06ec\u06d6\u06d8"

    move-object v2, v0

    move-object v3, v4

    move-object v5, v4

    move-object v6, v4

    move-object v1, v4

    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v4, 0x34a

    xor-int/2addr v0, v4

    xor-int/lit16 v0, v0, 0x284

    const/16 v4, 0x2c4

    xor-int/2addr v0, v4

    xor-int/lit16 v0, v0, 0x200

    const/16 v4, 0x1d5

    xor-int/2addr v0, v4

    xor-int/lit16 v0, v0, 0x284

    const/16 v4, 0x36b

    const v8, 0x5569c8fe

    xor-int/2addr v0, v4

    xor-int/2addr v0, v8

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06eb\u06e7\u06e1\u06d8\u06d7\u06d7\u06e8\u06e7\u06e0\u06e7\u06df\u06df\u06e0\u06d8\u06e8\u06d6\u06e5\u06e1\u06d8\u06dc\u06da\u06d6\u06d8\u06db\u06e5\u06dc\u06d8\u06db\u06ec\u06e0\u06eb\u06e2\u06e6\u06d8\u06e0\u06d8\u06d8\u06e6\u06dc\u06e1\u06e8\u06d6\u06dc\u06dc\u06ec\u06e2\u06eb\u06df\u06da\u06df\u06da\u06d8\u06d8\u06db\u06d7\u06ec\u06e1\u06e6\u06ec\u06e4\u06db\u06e1\u06da\u06e8\u06df\u06e1\u06e5\u06dc\u06d8\u06df\u06e7\u06e8\u06e4\u06d9\u06d8\u06d8\u06db\u06db\u06e6\u06d8\u06d7\u06e1\u06e5\u06e6\u06e6\u06ec\u06e6\u06df\u06db"

    move-object v2, v0

    goto :goto_0

    :sswitch_1
    new-array v0, v11, [B

    fill-array-data v0, :array_0

    new-array v2, v10, [B

    fill-array-data v2, :array_1

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06e6\u06e7\u06e6\u06ec\u06e6\u06d8\u06e5\u06db\u06d9\u06e6\u06d6\u06e6\u06d8\u06e5\u06ec\u06d9\u06d7\u06d6\u06e0\u06e2\u06e7\u06e8\u06d8\u06db\u06d9\u06e1\u06e5\u06d9\u06d9\u06e4\u06db\u06d8\u06d8\u06e6\u06dc\u06ec\u06e5\u06eb\u06d6\u06e8\u06e7\u06e2\u06e7\u06ec\u06e4\u06d6\u06db\u06d7"

    move-object v2, v0

    goto :goto_0

    :sswitch_2
    invoke-static {}, Landroid/os/Process;->myPid()I

    move-result v4

    const-string v0, "\u06db\u06d8\u06ec\u06e8\u06da\u06dc\u06d8\u06e1\u06e8\u06d6\u06eb\u06d8\u06e1\u06dc\u06e5\u06dc\u06e5\u06e8\u06d7\u06ec\u06e1\u06d8\u06e5\u06db\u06d7\u06e7\u06d9\u06df\u06e8\u06df\u06e5\u06ec\u06e2\u06d9\u06d8\u06e6\u06ec\u06eb\u06e1\u06d8\u06e4\u06dc\u06e5\u06e4\u06d9\u06ec\u06eb\u06d8\u06d8\u06e4\u06dc\u06dc\u06d9\u06df\u06e5\u06db\u06e6\u06d8\u06db\u06df\u06da\u06e1\u06d9\u06e8\u06d8\u06d9\u06df\u06e1\u06e1\u06d9\u06e5"

    move-object v2, v0

    move v7, v4

    goto :goto_0

    :sswitch_3
    const/16 v0, 0x8

    new-array v0, v0, [B

    fill-array-data v0, :array_2

    new-array v1, v10, [B

    fill-array-data v1, :array_3

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06df\u06eb\u06e6\u06d9\u06d6\u06e1\u06d8\u06df\u06dc\u06e7\u06d8\u06da\u06e1\u06d6\u06d8\u06db\u06e6\u06d7\u06e4\u06dc\u06e6\u06d8\u06e5\u06e6\u06e4\u06ec\u06d6\u06d9\u06dc\u06dc\u06e5\u06d8\u06e1\u06db\u06d9\u06dc\u06e8\u06eb\u06d9\u06e0\u06da\u06eb\u06e6\u06db\u06e5\u06db\u06db\u06e7\u06e6\u06d6\u06d8\u06e4\u06d8\u06e7\u06d8\u06df\u06e7\u06e2\u06e1\u06dc\u06d9\u06e2\u06df\u06e2\u06e6\u06d6\u06da\u06e1\u06db\u06e0\u06e2\u06eb\u06e8\u06d8\u06e2\u06e1\u06dc\u06d8\u06df\u06d9\u06e2"

    move-object v2, v0

    goto :goto_0

    :sswitch_4
    const/16 v0, 0x40

    new-array v0, v0, [B

    fill-array-data v0, :array_4

    new-array v2, v10, [B

    fill-array-data v2, :array_5

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, L۟/h4;->ۥ۟۟(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06d9\u06e4\u06e8\u06dc\u06d7\u06e8\u06e6\u06e8\u06d8\u06d8\u06ec\u06e5\u06ec\u06d8\u06df\u06db\u06d6\u06eb\u06e6\u06dc\u06e6\u06eb\u06db\u06e0\u06e7\u06d7\u06ec\u06e0\u06e6\u06d9\u06eb\u06d6\u06dc\u06d8\u06e6\u06ec\u06d9\u06d6\u06e2\u06d6\u06e1\u06db\u06e8\u06d8\u06d7\u06d6\u06da\u06df\u06e7\u06e0\u06e2\u06ec\u06e6\u06d8\u06da\u06d6\u06e5\u06d8"

    move-object v2, v0

    goto :goto_0

    :sswitch_5
    move-object v0, v1

    check-cast v0, Landroid/app/ActivityManager;

    invoke-virtual {v0}, Landroid/app/ActivityManager;->getRunningAppProcesses()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v4

    const-string v0, "\u06e2\u06e5\u06d6\u06e6\u06e7\u06d6\u06d8\u06db\u06d8\u06e1\u06e5\u06e4\u06e5\u06d8\u06e0\u06e2\u06e1\u06e2\u06d8\u06d8\u06dc\u06e1\u06d8\u06e8\u06e1\u06e7\u06e1\u06ec\u06e8\u06d8\u06d7\u06e7\u06d6\u06d8\u06db\u06e7\u06e8\u06d7\u06db\u06e6\u06d9\u06e0\u06d7\u06e4\u06e5\u06d8\u06ec\u06da\u06e0"

    move-object v2, v0

    move-object v6, v4

    goto :goto_0

    :sswitch_6
    const v2, -0x2995c86c

    const-string v0, "\u06e4\u06d9\u06dc\u06e0\u06dc\u06d6\u06d8\u06e8\u06eb\u06e1\u06d8\u06ec\u06db\u06e1\u06d8\u06e5\u06df\u06d8\u06d8\u06d6\u06e2\u06e0\u06e7\u06ec\u06e2\u06eb\u06df\u06df\u06eb\u06e0\u06d8\u06e6\u06e5\u06e1\u06db\u06e7\u06d6\u06e7\u06d8\u06ec\u06eb\u06dc\u06e0\u06e2\u06e7\u06eb"

    :goto_1
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v2

    sparse-switch v4, :sswitch_data_1

    goto :goto_1

    :sswitch_7
    const-string v0, "\u06d8\u06e7\u06e1\u06d8\u06eb\u06df\u06e1\u06d8\u06df\u06e0\u06d8\u06dc\u06db\u06d9\u06e8\u06df\u06e1\u06d8\u06db\u06e0\u06d6\u06d8\u06e5\u06eb\u06ec\u06e5\u06e2\u06d8\u06d8\u06e1\u06d9\u06e4\u06d9\u06d7\u06e6\u06df\u06ec\u06e1\u06e5\u06e5\u06d8\u06d8\u06d9\u06e5\u06d8\u06e5\u06e4\u06e5\u06d7\u06df\u06df\u06eb\u06e2\u06d8\u06d8\u06eb\u06e8\u06e5\u06d8\u06e2\u06e0\u06d6\u06e1\u06da\u06e0\u06d8\u06e5\u06d8\u06db\u06ec\u06e6\u06d8\u06dc\u06d6\u06e8\u06d8\u06dc\u06da\u06e8\u06d8\u06d7\u06d8\u06db"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_8
    const-string v0, "\u06eb\u06d7\u06e6\u06d8\u06dc\u06e0\u06d6\u06ec\u06e5\u06e7\u06df\u06e8\u06e1\u06d8\u06e7\u06e1\u06d8\u06da\u06dc\u06dc\u06d8\u06dc\u06e0\u06e6\u06db\u06e5\u06d8\u06e5\u06d8\u06eb\u06dc\u06ec\u06d6\u06d8\u06d8\u06e6\u06e1\u06e8\u06eb\u06e4\u06e5\u06dc\u06d8\u06db\u06df\u06dc\u06d8\u06da\u06e4\u06e4\u06dc\u06db\u06ec\u06dc\u06e7\u06db\u06df\u06df\u06dc\u06d8\u06df\u06e6\u06eb\u06df\u06e5\u06e7\u06e5\u06da\u06e4\u06e8\u06e0\u06d6\u06e4\u06da\u06eb\u06d6\u06d8\u06eb"

    goto :goto_1

    :sswitch_9
    const v4, -0x30b3b980

    const-string v0, "\u06e5\u06e1\u06dc\u06d7\u06e6\u06db\u06e2\u06e4\u06d7\u06d7\u06d7\u06d7\u06df\u06d8\u06e1\u06d8\u06d6\u06e7\u06e4\u06d6\u06e8\u06e6\u06e2\u06e6\u06db\u06d6\u06dc\u06dc\u06d8\u06d9\u06ec\u06dc\u06d8\u06e0\u06da\u06e0\u06e5\u06e0\u06e1\u06d8\u06db\u06d8\u06ec\u06e6\u06e4\u06df\u06e8\u06e8\u06da\u06e2\u06e0\u06d9\u06e8\u06db\u06da\u06dc\u06e4\u06db\u06dc\u06dc\u06e7\u06eb\u06d9\u06e6\u06df\u06df\u06e6"

    :goto_2
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v8

    xor-int/2addr v8, v4

    sparse-switch v8, :sswitch_data_2

    goto :goto_2

    :sswitch_a
    const-string v0, "\u06eb\u06d7\u06d7\u06dc\u06e0\u06e4\u06d7\u06d7\u06e8\u06d8\u06da\u06e5\u06da\u06e4\u06e7\u06e1\u06e1\u06e1\u06e1\u06e7\u06e7\u06e7\u06e0\u06db\u06d7\u06db\u06d9\u06d6\u06d8\u06d7\u06db\u06e8\u06e4\u06e5\u06df\u06e6\u06e4\u06da\u06e1\u06e1\u06e7\u06e5\u06db\u06eb\u06da\u06e7\u06e6\u06d6\u06df\u06da\u06e2\u06e0\u06e8\u06d8\u06dc\u06e4\u06e4\u06ec\u06e5\u06e5\u06dc\u06dc\u06d7\u06d9\u06e5\u06e8\u06d8\u06e0\u06dc\u06dc\u06d8\u06d6\u06d7\u06e1\u06d8\u06df\u06d6\u06e0"

    goto :goto_2

    :sswitch_b
    const-string v0, "\u06dc\u06da\u06da\u06dc\u06eb\u06e8\u06dc\u06d8\u06e5\u06dc\u06eb\u06d6\u06e4\u06d9\u06d6\u06d8\u06e8\u06d7\u06e7\u06d8\u06e5\u06df\u06e2\u06e0\u06e1\u06e0\u06e7\u06df\u06e1\u06e2\u06d8\u06d8\u06d7\u06e8\u06e8\u06d8\u06e6\u06e0\u06e2\u06e1\u06dc\u06ec\u06db\u06d8\u06e7\u06d8\u06df\u06e7\u06d8\u06d8\u06e1\u06db\u06e7\u06e2\u06e6\u06e1\u06e6\u06dc\u06d8"

    goto :goto_2

    :sswitch_c
    const v8, 0x7bfb7119

    const-string v0, "\u06d8\u06e2\u06e8\u06ec\u06d6\u06d8\u06d8\u06dc\u06e6\u06df\u06d9\u06e0\u06dc\u06d8\u06da\u06db\u06dc\u06d8\u06e5\u06ec\u06d6\u06d8\u06e8\u06eb\u06d9\u06eb\u06d6\u06e7\u06e1\u06e4\u06d8\u06d8\u06da\u06d9\u06d8\u06df\u06eb\u06d6\u06df\u06e1\u06e5\u06d8\u06e5\u06df\u06eb\u06d9\u06d6\u06e8\u06d8\u06df\u06df\u06da"

    :goto_3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v9

    xor-int/2addr v9, v8

    sparse-switch v9, :sswitch_data_3

    goto :goto_3

    :sswitch_d
    const-string v0, "\u06eb\u06ec\u06d6\u06d8\u06e2\u06e6\u06e2\u06dc\u06d9\u06e8\u06db\u06d8\u06d6\u06d8\u06da\u06db\u06d6\u06e5\u06e2\u06e1\u06d8\u06df\u06e4\u06d6\u06d8\u06d7\u06d9\u06e7\u06db\u06dc\u06da\u06e1\u06e2\u06e0\u06dc\u06e0\u06db\u06eb\u06e4\u06e6\u06ec\u06e8\u06d7\u06e6\u06da\u06d7\u06eb\u06d7\u06e1\u06e0\u06dc\u06d8\u06ec\u06e7\u06e8\u06d8\u06eb\u06e7\u06d6\u06e6\u06dc\u06dc\u06d8\u06da\u06e6\u06d8\u06d8\u06e1\u06ec\u06df\u06db\u06d9\u06e5\u06d8\u06e1\u06e8\u06e8\u06d8\u06df\u06e2\u06d6\u06d8"

    goto :goto_3

    :cond_0
    const-string v0, "\u06df\u06dc\u06e5\u06e6\u06e4\u06ec\u06d8\u06d9\u06d8\u06d8\u06dc\u06e6\u06e7\u06e8\u06e2\u06d9\u06e7\u06e1\u06d7\u06e8\u06da\u06e7\u06e4\u06e7\u06e1\u06d8\u06e1\u06d8\u06d8\u06eb\u06da\u06eb\u06e2\u06e6\u06d7\u06d8\u06e1\u06d8\u06e5\u06d8\u06eb\u06dc\u06e5\u06e7\u06eb\u06e6\u06e0"

    goto :goto_3

    :sswitch_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, "\u06d9\u06eb\u06e5\u06e2\u06d8\u06e8\u06d8\u06d9\u06d8\u06e1\u06d8\u06e1\u06dc\u06e2\u06df\u06df\u06e8\u06d8\u06e5\u06dc\u06d8\u06ec\u06d8\u06d8\u06e5\u06da\u06da\u06ec\u06e2\u06d7\u06dc\u06d6\u06d9\u06ec\u06e8\u06d8\u06df\u06e4\u06db\u06e7\u06dc\u06e1\u06e7\u06d7\u06db\u06e7\u06d8\u06e5\u06d8\u06e1\u06ec\u06e0\u06e4\u06e8\u06e7\u06dc\u06df\u06e7\u06e5\u06d6\u06df\u06d8\u06d6\u06e1\u06d8\u06d7\u06d9\u06d8\u06d8\u06e5\u06e0\u06e6\u06d8\u06d9\u06da\u06e7\u06d6\u06e4\u06d8\u06e0\u06df\u06d9\u06e4\u06db\u06e6\u06d8\u06e2\u06e7\u06eb"

    goto :goto_3

    :sswitch_f
    const-string v0, "\u06d6\u06e5\u06dc\u06e7\u06e1\u06db\u06e4\u06e5\u06e5\u06e7\u06ec\u06e6\u06e2\u06e5\u06df\u06e1\u06db\u06e8\u06e4\u06e8\u06d8\u06e6\u06e1\u06e8\u06d8\u06e7\u06eb\u06e5\u06df\u06e5\u06d7\u06e1\u06e4\u06e6\u06e5\u06e5\u06e1\u06d8\u06dc\u06d7\u06d6\u06d8\u06d7\u06e0\u06e0\u06d7\u06e1\u06e6\u06d8\u06e6\u06e1\u06e0\u06e0\u06e1\u06ec\u06e5\u06d8\u06e8\u06d8"

    goto :goto_2

    :sswitch_10
    const-string v0, "\u06df\u06d9\u06e6\u06d8\u06df\u06e8\u06e7\u06d8\u06e7\u06e5\u06e1\u06d8\u06e7\u06e7\u06e1\u06d8\u06d6\u06e7\u06e1\u06d7\u06e5\u06d9\u06da\u06eb\u06ec\u06e0\u06e2\u06e7\u06e5\u06e5\u06df\u06d7\u06e1\u06d8\u06db\u06dc\u06e7\u06e7\u06e7\u06e8\u06d8\u06ec\u06d6\u06e4\u06d9\u06da\u06e2\u06eb\u06e2\u06e7\u06e7\u06e4\u06d6\u06d8\u06dc\u06e8\u06ec\u06e4\u06e1\u06e8\u06df\u06e8\u06e2\u06e0\u06e8\u06db\u06db\u06e5\u06e2\u06d8\u06dc\u06d8\u06ec\u06ec\u06d8\u06d8\u06e8\u06da\u06d6"

    goto :goto_1

    :sswitch_11
    const-string v0, "\u06d6\u06db\u06e0\u06e6\u06d6\u06d6\u06d8\u06e1\u06e1\u06e2\u06e7\u06d6\u06e5\u06ec\u06db\u06d8\u06d8\u06e0\u06e8\u06dc\u06d8\u06dc\u06df\u06e5\u06eb\u06df\u06e8\u06df\u06da\u06d9\u06e8\u06ec\u06dc\u06e6\u06e6\u06e1\u06df\u06e8\u06dc\u06d8\u06eb\u06e2\u06d9\u06e1\u06e4\u06e6\u06e0\u06e0\u06dc\u06df\u06e8\u06eb\u06db\u06db\u06d6\u06d8\u06e4\u06db\u06dc\u06eb\u06d6\u06dc\u06d8\u06eb\u06d6\u06e4\u06d7\u06d6\u06db\u06df\u06d8\u06dc\u06d6\u06ec\u06e8\u06d8\u06e5\u06df\u06e6\u06eb\u06ec\u06e2\u06db\u06df\u06db"

    goto :goto_1

    :sswitch_12
    const-string v0, "\u06e0\u06db\u06e1\u06d8\u06d6\u06dc\u06e7\u06dc\u06e2\u06e0\u06eb\u06e4\u06d9\u06da\u06d8\u06eb\u06e5\u06d7\u06eb\u06e4\u06eb\u06e2\u06e5\u06d9\u06e8\u06e2\u06db\u06db\u06e5\u06e8\u06d6\u06d8\u06d7\u06db\u06da\u06dc\u06d8\u06e8\u06d8\u06e7\u06db\u06d6\u06d8\u06df\u06ec\u06e2\u06dc\u06d8\u06d7\u06e0\u06e4\u06e0\u06e6\u06dc\u06d8\u06e1\u06e7\u06df\u06e8\u06e0\u06d8\u06e5\u06e2\u06e6\u06d8\u06d6\u06e5\u06da"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_13
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/app/ActivityManager$RunningAppProcessInfo;

    const-string v2, "\u06e2\u06d7\u06df\u06e5\u06da\u06e0\u06ec\u06e0\u06d9\u06dc\u06e6\u06d8\u06e1\u06d7\u06d6\u06e4\u06e8\u06e6\u06eb\u06ec\u06e4\u06d7\u06ec\u06d6\u06d8\u06e1\u06dc\u06da\u06e4\u06df\u06d8\u06d8\u06e5\u06e8\u06e7\u06e4\u06dc\u06e1\u06d9\u06d9\u06e1\u06d8\u06db\u06db\u06e0\u06e4\u06e2\u06e8\u06d7\u06e5\u06d8\u06d8\u06e6\u06d8\u06da\u06e6\u06dc\u06e8\u06d8\u06db\u06e8\u06eb\u06e6\u06d8\u06d6\u06d8\u06d8\u06df\u06d6\u06d6\u06d8\u06d6\u06da\u06da\u06d6\u06da\u06d9\u06db\u06eb\u06eb\u06e8\u06eb\u06ec\u06da\u06eb"

    move-object v5, v0

    goto/16 :goto_0

    :sswitch_14
    const v2, -0x415c5ab7

    const-string v0, "\u06da\u06e1\u06eb\u06e2\u06e5\u06e2\u06e8\u06e4\u06d7\u06e8\u06df\u06e6\u06d8\u06d9\u06ec\u06df\u06d8\u06da\u06e6\u06e5\u06d7\u06dc\u06d8\u06e0\u06eb\u06e4\u06d7\u06e5\u06e0\u06ec\u06ec\u06d7\u06ec\u06ec\u06e1\u06e5\u06d7\u06e8\u06df\u06e1\u06e5\u06d8\u06da\u06db\u06e2\u06db\u06e6\u06e6\u06d9\u06e0\u06d6\u06d8\u06d9\u06d9\u06e1\u06db\u06d6\u06d9"

    :goto_4
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v4

    xor-int/2addr v4, v2

    sparse-switch v4, :sswitch_data_4

    goto :goto_4

    :sswitch_15
    const-string v0, "\u06d9\u06eb\u06e5\u06d8\u06da\u06d7\u06dc\u06d9\u06e6\u06db\u06df\u06df\u06e6\u06d8\u06e1\u06e1\u06e0\u06e6\u06dc\u06da\u06e4\u06d8\u06e4\u06d8\u06d6\u06d8\u06db\u06ec\u06d7\u06d7\u06d9\u06df\u06e5\u06e1\u06dc\u06e1\u06d9\u06db\u06e2\u06d6\u06e6\u06e2\u06ec\u06e7\u06d7\u06e2\u06e5\u06d8"

    goto :goto_4

    :sswitch_16
    const-string v0, "\u06da\u06df\u06e2\u06dc\u06e7\u06e6\u06e5\u06e2\u06e8\u06d8\u06e0\u06e5\u06e6\u06d8\u06da\u06d6\u06dc\u06d8\u06d7\u06ec\u06d7\u06df\u06e8\u06ec\u06da\u06d9\u06d6\u06d8\u06e7\u06d6\u06e1\u06d8\u06e5\u06e8\u06d9\u06d7\u06e5\u06e1\u06d8\u06d6\u06d6\u06d7\u06dc\u06d6\u06d9\u06e1\u06e5\u06d6\u06da\u06d8"

    goto :goto_4

    :sswitch_17
    const v4, -0x42d854d4

    const-string v0, "\u06eb\u06d8\u06e1\u06e0\u06db\u06e5\u06d8\u06d8\u06e0\u06d9\u06df\u06e1\u06e5\u06d8\u06e8\u06e7\u06ec\u06d7\u06e2\u06e6\u06d7\u06d8\u06dc\u06d8\u06d9\u06db\u06ec\u06e5\u06d9\u06e1\u06d8\u06e2\u06e0\u06e0\u06d6\u06d9\u06e2\u06e4\u06e2\u06e6\u06d8\u06e0\u06e2\u06e4\u06e4\u06db\u06d6\u06d8\u06df\u06e0\u06e6\u06d8\u06ec\u06e6\u06db\u06d6\u06da\u06e4\u06e2\u06db\u06e0\u06e2\u06eb\u06db\u06d6\u06e5\u06d8\u06e1\u06db\u06ec"

    :goto_5
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v8

    xor-int/2addr v8, v4

    sparse-switch v8, :sswitch_data_5

    goto :goto_5

    :sswitch_18
    const-string v0, "\u06e1\u06d8\u06df\u06d9\u06df\u06e0\u06ec\u06db\u06df\u06e7\u06ec\u06e2\u06d9\u06eb\u06e5\u06d8\u06d7\u06e2\u06e6\u06d8\u06e2\u06e2\u06d6\u06e8\u06e8\u06d6\u06db\u06e0\u06ec\u06d9\u06e2\u06d8\u06da\u06e7\u06db\u06da\u06e2\u06e1\u06e6\u06d8\u06e5\u06d8\u06dc\u06d7\u06e6\u06e6\u06d8\u06e8\u06da\u06e0\u06d9\u06d7\u06e1\u06e7\u06dc\u06e0\u06db"

    goto :goto_5

    :sswitch_19
    const-string v0, "\u06eb\u06e5\u06d9\u06ec\u06e7\u06e6\u06db\u06d7\u06d9\u06eb\u06d9\u06e6\u06d6\u06e2\u06e8\u06e8\u06eb\u06e1\u06d8\u06df\u06e7\u06d6\u06d8\u06d7\u06df\u06ec\u06e5\u06dc\u06e4\u06e4\u06e7\u06d7\u06e5\u06d9\u06ec\u06ec\u06eb\u06d9\u06e1\u06ec\u06d7\u06db\u06db\u06d8\u06d6\u06e7\u06d8\u06d8\u06df\u06e5\u06e8\u06e7\u06d9\u06e2\u06ec\u06e2\u06dc\u06d8\u06da\u06d9\u06df\u06db\u06e7\u06e6\u06df\u06e7\u06e6\u06d8\u06e7\u06e5\u06d8\u06d8\u06eb\u06e0\u06eb\u06dc\u06dc\u06da\u06e6\u06e1\u06e1\u06d8\u06e1\u06ec\u06e8\u06e5\u06ec\u06e6"

    goto :goto_5

    :sswitch_1a
    const v8, 0x2b7e1b8b

    const-string v0, "\u06dc\u06d9\u06d8\u06da\u06db\u06e5\u06da\u06df\u06e2\u06d8\u06e1\u06d8\u06d8\u06e1\u06e7\u06e1\u06d8\u06d7\u06db\u06e0\u06d6\u06ec\u06ec\u06e1\u06d7\u06e2\u06e0\u06d7\u06eb\u06eb\u06e2\u06d8\u06da\u06d9\u06d7\u06e4\u06d8\u06e5\u06ec\u06e2\u06e5\u06df\u06e7\u06d8\u06e2\u06e5\u06d8"

    :goto_6
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v9

    xor-int/2addr v9, v8

    sparse-switch v9, :sswitch_data_6

    goto :goto_6

    :sswitch_1b
    const-string v0, "\u06ec\u06e1\u06e6\u06eb\u06d8\u06e4\u06d9\u06e5\u06d6\u06d8\u06d8\u06df\u06e4\u06e6\u06dc\u06e7\u06d8\u06e0\u06e1\u06d8\u06d8\u06e5\u06eb\u06d6\u06d8\u06e7\u06e1\u06e5\u06d8\u06d9\u06e8\u06e6\u06da\u06d8\u06e7\u06d8\u06e5\u06da\u06d7\u06e6\u06df\u06e4\u06dc\u06e6\u06e5\u06d8\u06e1\u06db\u06e8\u06db\u06ec\u06d9\u06da\u06e0\u06dc\u06e7\u06e8\u06e6\u06d8\u06d9\u06eb\u06e1\u06e6\u06dc\u06d8\u06ec\u06e2\u06e4\u06df"

    goto :goto_6

    :cond_1
    const-string v0, "\u06e0\u06e0\u06db\u06e5\u06e8\u06e7\u06ec\u06da\u06db\u06da\u06ec\u06e7\u06e4\u06e4\u06eb\u06db\u06eb\u06ec\u06e0\u06d9\u06d8\u06d8\u06e1\u06e2\u06dc\u06d8\u06e7\u06e0\u06e2\u06eb\u06e2\u06d8\u06da\u06e7\u06ec\u06db\u06df\u06ec\u06e6\u06da\u06df\u06da\u06d9\u06dc\u06eb\u06d8\u06d6\u06e6\u06d8\u06d8\u06e1\u06e1\u06da\u06da\u06dc\u06ec\u06ec\u06e6\u06d8\u06e4\u06e5\u06e4"

    goto :goto_6

    :sswitch_1c
    iget v0, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->pid:I

    if-ne v0, v7, :cond_1

    const-string v0, "\u06d9\u06e1\u06da\u06e1\u06e8\u06d8\u06d8\u06ec\u06d6\u06e0\u06ec\u06e5\u06e0\u06d6\u06e8\u06df\u06e6\u06da\u06e4\u06df\u06db\u06e8\u06d8\u06e8\u06d7\u06e0\u06e5\u06e6\u06dc\u06db\u06e4\u06d7\u06ec\u06e4\u06d8\u06e1\u06e7\u06e5\u06d8\u06dc\u06ec\u06db\u06d8\u06da\u06e5\u06d8\u06e0\u06d8\u06d9\u06e4\u06e5\u06e6\u06eb\u06d8\u06e8\u06d8\u06df\u06d9\u06e5\u06d8\u06d8\u06e7\u06df\u06eb\u06e2\u06e2\u06dc\u06e7\u06da"

    goto :goto_6

    :sswitch_1d
    const-string v0, "\u06d7\u06e0\u06df\u06e4\u06eb\u06d6\u06d8\u06e6\u06da\u06e5\u06e0\u06db\u06d6\u06e4\u06e5\u06e1\u06e0\u06e0\u06d8\u06db\u06d7\u06e2\u06df\u06d9\u06d9\u06e0\u06d8\u06e8\u06e2\u06da\u06d6\u06e6\u06e8\u06d8\u06d6\u06d6\u06d8\u06eb\u06d9\u06e1\u06e0\u06e4\u06d8\u06db\u06e7\u06e0\u06da\u06d6\u06da\u06db\u06e0\u06db\u06e0\u06d8\u06d8\u06e4\u06e4\u06e1\u06e0\u06e4\u06e8\u06e6\u06e7\u06e0\u06eb\u06eb\u06e6\u06d6\u06d6\u06e4\u06e1\u06d7\u06e4\u06d6\u06e7\u06e0\u06e1\u06d8\u06e7\u06d8\u06df\u06da\u06d7"

    goto :goto_5

    :sswitch_1e
    const-string v0, "\u06d9\u06df\u06d8\u06d8\u06db\u06e6\u06db\u06e7\u06eb\u06d7\u06d6\u06eb\u06e5\u06e5\u06eb\u06e6\u06d8\u06e0\u06e1\u06e6\u06d8\u06e5\u06e1\u06dc\u06d8\u06d8\u06d8\u06da\u06e0\u06eb\u06eb\u06d6\u06e1\u06e5\u06d8\u06df\u06d8\u06e0\u06db\u06e7\u06e4\u06e7\u06df\u06e5\u06da\u06e2\u06dc\u06d8\u06e8\u06e8\u06d6\u06d8\u06da\u06d6\u06eb\u06e7\u06e2\u06dc\u06e8\u06e8\u06d8\u06da\u06dc\u06d7\u06e6\u06e7\u06d9\u06d7\u06db"

    goto :goto_4

    :sswitch_1f
    const-string v0, "\u06da\u06e4\u06df\u06d6\u06e0\u06d8\u06d8\u06d8\u06e8\u06dc\u06eb\u06eb\u06ec\u06e1\u06d9\u06d8\u06d8\u06e1\u06e8\u06e0\u06e4\u06e5\u06e1\u06d8\u06e6\u06db\u06e1\u06d9\u06eb\u06eb\u06ec\u06ec\u06e7\u06d8\u06e7\u06d7\u06dc\u06dc\u06d7\u06dc\u06e7\u06eb\u06da\u06da\u06e0\u06eb\u06d9\u06e8\u06da\u06e5\u06d8\u06d9\u06e7\u06d6\u06d8\u06d9\u06dc\u06d8\u06d8\u06df\u06d9\u06dc\u06e8\u06e2\u06e6\u06d8\u06d8\u06d7\u06e8\u06d8\u06e5\u06e1\u06e5\u06d8\u06da\u06e6\u06ec\u06e4\u06d7\u06da"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_20
    iget-object v3, v5, Landroid/app/ActivityManager$RunningAppProcessInfo;->processName:Ljava/lang/String;

    const-string v0, "\u06e7\u06d7\u06ec\u06db\u06e0\u06d8\u06e8\u06ec\u06d9\u06d9\u06d8\u06e2\u06e7\u06da\u06e8\u06e2\u06d6\u06e7\u06df\u06db\u06e4\u06e0\u06e6\u06e8\u06e1\u06db\u06eb\u06e2\u06e0\u06d7\u06d6\u06e0\u06dc\u06e7\u06d8\u06d9\u06df\u06e8\u06dc\u06e2\u06e0\u06e8\u06d6\u06e2\u06e1\u06e2\u06d9\u06e0\u06e2\u06da\u06e4\u06e1\u06d8"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_21
    new-array v0, v11, [B

    fill-array-data v0, :array_6

    new-array v2, v10, [B

    fill-array-data v2, :array_7

    invoke-static {v0, v2}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, L۟/h4;->ۥ۟۠(Ljava/lang/String;Ljava/lang/Object;)V

    const-string v0, "\u06e6\u06db\u06e0\u06ec\u06da\u06d8\u06e5\u06e5\u06e5\u06ec\u06ec\u06e5\u06d8\u06eb\u06dc\u06e6\u06d6\u06eb\u06e2\u06e2\u06e6\u06d8\u06d8\u06d6\u06dc\u06e7\u06d8\u06ec\u06d6\u06e4\u06da\u06e0\u06e8\u06e0\u06eb\u06e5\u06d8\u06e7\u06e6\u06e8\u06d6\u06d9\u06d6\u06df\u06df\u06e7\u06e5\u06e0\u06d6\u06d8\u06ec\u06d7\u06e6\u06d8\u06ec\u06e1\u06eb\u06e0\u06e8\u06da\u06da\u06e5\u06d8\u06d8\u06e6\u06e7\u06e1\u06e5\u06db\u06d6\u06dc\u06ec\u06dc\u06ec\u06d9\u06e2\u06dc\u06e7\u06d8\u06e6\u06dc\u06d8\u06d8\u06e1\u06e6\u06d7\u06e2\u06db"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_22
    const-string v3, ""

    :sswitch_23
    return-object v3

    :sswitch_24
    const-string v0, "\u06e2\u06e5\u06d6\u06e6\u06e7\u06d6\u06d8\u06db\u06d8\u06e1\u06e5\u06e4\u06e5\u06d8\u06e0\u06e2\u06e1\u06e2\u06d8\u06d8\u06dc\u06e1\u06d8\u06e8\u06e1\u06e7\u06e1\u06ec\u06e8\u06d8\u06d7\u06e7\u06d6\u06d8\u06db\u06e7\u06e8\u06d7\u06db\u06e6\u06d9\u06e0\u06d7\u06e4\u06e5\u06d8\u06ec\u06da\u06e0"

    move-object v2, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        -0x7405c675 -> :sswitch_1
        -0x6f2ef1cc -> :sswitch_0
        -0x6ee1f6f9 -> :sswitch_22
        -0x6d3dce5f -> :sswitch_5
        -0x475ea12d -> :sswitch_21
        -0x377e6415 -> :sswitch_4
        -0x34e1b003 -> :sswitch_2
        -0x3299e20c -> :sswitch_3
        -0x189c4e8d -> :sswitch_23
        -0x64b1070 -> :sswitch_20
        0x103be874 -> :sswitch_6
        0x291f66c5 -> :sswitch_14
        0x31205bf0 -> :sswitch_13
    .end sparse-switch

    :array_0
    .array-data 1
        -0x22t
        -0x5ct
        -0x3ft
        0x19t
        -0x2ft
        0x2t
        -0x22t
        -0x60t
        -0x28t
        0x1at
        -0x2at
    .end array-data

    :array_1
    .array-data 1
        -0x41t
        -0x2ct
        -0x4ft
        0x75t
        -0x48t
        0x61t
    .end array-data

    nop

    :array_2
    .array-data 1
        -0x61t
        -0x7bt
        0x58t
        -0x1t
        0x64t
        -0x68t
        -0x76t
        -0x61t
    .end array-data

    :array_3
    .array-data 1
        -0x2t
        -0x1at
        0x2ct
        -0x6at
        0x12t
        -0xft
    .end array-data

    nop

    :array_4
    .array-data 1
        0x11t
        0x7ft
        0x2at
        0x1et
        0x77t
        0x32t
        0x1et
        0x64t
        0x28t
        0x1dt
        0x23t
        0x71t
        0x1dt
        0x6ft
        0x66t
        0x11t
        0x36t
        0x22t
        0xbt
        0x2at
        0x32t
        0x1dt
        0x77t
        0x3ft
        0x10t
        0x64t
        0x6bt
        0x1ct
        0x22t
        0x3dt
        0x13t
        0x2at
        0x32t
        0xbt
        0x27t
        0x34t
        0x5ft
        0x6bt
        0x28t
        0x16t
        0x25t
        0x3et
        0x16t
        0x6et
        0x68t
        0x13t
        0x27t
        0x21t
        0x51t
        0x4bt
        0x25t
        0x6t
        0x3et
        0x27t
        0x16t
        0x7et
        0x3ft
        0x3ft
        0x36t
        0x3ft
        0x1et
        0x6dt
        0x23t
        0x0t
    .end array-data

    :array_5
    .array-data 1
        0x7ft
        0xat
        0x46t
        0x72t
        0x57t
        0x51t
    .end array-data

    nop

    :sswitch_data_1
    .sparse-switch
        -0x781ca233 -> :sswitch_12
        -0x50f856a1 -> :sswitch_11
        0x1039776 -> :sswitch_7
        0xccfc89e -> :sswitch_9
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        -0x480b67f6 -> :sswitch_10
        0x2b054cd0 -> :sswitch_8
        0x373b8bf1 -> :sswitch_a
        0x3f9ec847 -> :sswitch_c
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        -0x76a0546c -> :sswitch_b
        -0x2d0eadd7 -> :sswitch_d
        0x41b5a4b8 -> :sswitch_e
        0x55048bda -> :sswitch_f
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        -0x333c4a30 -> :sswitch_17
        -0x14dc39c2 -> :sswitch_1f
        -0x1975cf0 -> :sswitch_15
        0x7e8a4626 -> :sswitch_24
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        -0x353ba87e -> :sswitch_1a
        -0x18b65c49 -> :sswitch_16
        0x3ea0d614 -> :sswitch_18
        0x6c8c15e5 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        -0x40dfb22a -> :sswitch_19
        -0x24a50d1a -> :sswitch_1d
        0x1cc12fbf -> :sswitch_1b
        0x2ab2ac7d -> :sswitch_1c
    .end sparse-switch

    :array_6
    .array-data 1
        -0x2at
        0x18t
        0x2ft
        -0x13t
        0x6at
        -0x74t
        -0x2bt
        0x24t
        0x21t
        -0x1dt
        0x6at
    .end array-data

    :array_7
    .array-data 1
        -0x5at
        0x6at
        0x40t
        -0x72t
        0xft
        -0x1t
    .end array-data
.end method

.method public static ۥ۟ۡ(Landroid/app/Application;)Z
    .locals 4

    const-string v0, "\u06e6\u06e8\u06dc\u06d8\u06dc\u06d6\u06e1\u06df\u06e2\u06d6\u06d8\u06e1\u06e5\u06da\u06df\u06df\u06d8\u06da\u06e8\u06e6\u06d8\u06dc\u06e7\u06e1\u06e8\u06df\u06d8\u06d8\u06ec\u06e6\u06d7\u06df\u06e1\u06e5\u06e6\u06e8\u06eb\u06ec\u06df\u06e7\u06e2\u06e6\u06d6\u06df\u06d6\u06dc\u06d8\u06e1\u06d6\u06e8\u06d8\u06e8\u06d6\u06e6\u06e5\u06da\u06d6\u06e2\u06db\u06df\u06eb\u06d6\u06ec\u06e5\u06d7\u06df\u06e6\u06d9\u06e0\u06db\u06d8\u06e7\u06dc\u06d8\u06e2\u06d9\u06e0"

    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v1

    const/16 v2, 0x1a9

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x354

    const/16 v2, 0x24b

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0xb5

    const/16 v2, 0x34c

    xor-int/2addr v1, v2

    xor-int/lit16 v1, v1, 0x261

    const/16 v2, 0x2b9

    const v3, -0x7cf7e1ed    # -4.000133E-37f

    xor-int/2addr v1, v2

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :sswitch_0
    const-string v0, "\u06e8\u06db\u06e1\u06d6\u06e0\u06d6\u06e0\u06d9\u06d8\u06d8\u06db\u06e0\u06ec\u06e8\u06e7\u06e7\u06ec\u06dc\u06e1\u06d8\u06da\u06df\u06ec\u06e7\u06e2\u06e8\u06d8\u06ec\u06eb\u06df\u06e0\u06d7\u06e1\u06e0\u06e6\u06d8\u06e0\u06e0\u06d8\u06d8\u06ec\u06eb\u06e7\u06e5\u06e2\u06e8\u06d8\u06df\u06eb\u06db\u06db\u06d8\u06e8\u06d8\u06ec\u06d7\u06e1\u06e8\u06e4"

    goto :goto_0

    :sswitch_1
    const/16 v0, 0xb

    new-array v0, v0, [B

    fill-array-data v0, :array_0

    const/4 v1, 0x6

    new-array v1, v1, [B

    fill-array-data v1, :array_1

    invoke-static {v0, v1}, L۟/oa;->ۥ([B[B)Ljava/lang/String;

    const-string v0, "\u06da\u06e2\u06d8\u06e0\u06dc\u06e1\u06e1\u06e2\u06e6\u06d8\u06e0\u06d8\u06e8\u06d8\u06d8\u06db\u06d9\u06da\u06eb\u06e2\u06da\u06e8\u06d9\u06e1\u06dc\u06d8\u06e7\u06e5\u06e5\u06d8\u06db\u06e5\u06e1\u06d8\u06e6\u06df\u06df\u06dc\u06d8\u06d6\u06d8\u06e0\u06df\u06e1\u06d8\u06e7\u06e5\u06ec\u06dc\u06df\u06da\u06d9\u06e0\u06e2\u06d7\u06e7\u06e6\u06d8\u06e7\u06e2\u06d7\u06db\u06df\u06df\u06d6\u06eb\u06d6\u06da\u06e1\u06e1\u06d9\u06db\u06db\u06d6\u06da\u06e6\u06e7\u06e4\u06ec"

    goto :goto_0

    :sswitch_2
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    move-result-object v0

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    invoke-static {p0}, L۟/q$c;->ۥ۟۠(Landroid/app/Application;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, L۟/h4;->ۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    return v0

    nop

    :sswitch_data_0
    .sparse-switch
        -0x7d8f5099 -> :sswitch_0
        -0x62ae1bee -> :sswitch_1
        0x2fe34181 -> :sswitch_2
    .end sparse-switch

    :array_0
    .array-data 1
        -0x2ft
        -0x47t
        -0x41t
        0x75t
        0x56t
        -0x46t
        -0x2ft
        -0x43t
        -0x5at
        0x76t
        0x51t
    .end array-data

    :array_1
    .array-data 1
        -0x50t
        -0x37t
        -0x31t
        0x19t
        0x3ft
        -0x27t
    .end array-data
.end method
