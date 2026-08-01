.class Lkevin/fun/hook/DYHook$203;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookShareMenuFilter(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x14

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$203;->short:[S

    return-void

    :array_0
    .array-data 2
        0x68cs
        0x689s
        0x69as
        0x215s
        0x213s
        0x210s
        0x210s
        0x213s
        0x2b57s
        0xc3bs
        0x5e1ds
        0x42b0s
        -0x7039s
        0x5f4es
        -0x7c24s
        0x62ffs
        0x552as
        -0x7ec2s
        0xc21s
        0xc3bs
    .end array-data
.end method

.method constructor <init>()V
    .locals 2

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "Rg6eEbwCVUoL"

    invoke-static {v0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->۟۠ۧۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟۟۟ۤۨ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۦۣ۠۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    return-void

    :sswitch_4
    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۟ۡۥۢ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    iget-object v0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->args:[Ljava/lang/Object;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۥ۠ۡۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p1, Ljava/lang/String;

    check-cast p2, [Ljava/lang/Object;

    invoke-static {p0, p1, p2}, Lde/robv/android/xposed/XposedHelpers;->callMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۟ۦ۠ۥۧ()[S
    .locals 2

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lkevin/fun/hook/DYHook$203;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣ۠ۨۡ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۡۢۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$smshouldBlockFeature(Ljava/lang/String;)Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۨ۠ۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lde/robv/android/xposed/XposedHelpers;->getObjectField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method protected beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    :try_start_0
    invoke-static {p1}, Lkevin/fun/hook/DYHook$203;->ۣ۟ۡۥۢ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v0, v0, v1

    check-cast v0, Ljava/util/List;

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v2, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v0, 0xbe22

    goto :goto_2

    :sswitch_7
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v1

    invoke-direct {v2, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_8
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v4, 0xbe90

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbebd

    goto :goto_3

    :sswitch_a
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_b
    invoke-static {p1}, Lkevin/fun/hook/DYHook$203;->ۣ۟ۡۥۢ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    aput-object v2, v0, v1

    const v0, 0xbefb

    :goto_4
    const v1, 0xbf0c

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :goto_5
    :sswitch_c
    return-void

    :sswitch_d
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_e
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-result-object v4

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_f
    if-nez v4, :cond_3

    const v0, 0xc25f

    goto :goto_6

    :cond_3
    :sswitch_10
    const v0, 0xc240

    goto :goto_6

    :sswitch_11
    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_12
    const v0, 0xc29d

    goto :goto_7

    :sswitch_13
    :try_start_1
    invoke-static {}, Lkevin/fun/hook/DYHook$203;->۟ۦ۠ۥۧ()[S

    move-result-object v0

    const/4 v1, 0x0

    sget v5, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۡۤۥ:I

    xor-int/lit16 v5, v5, 0x3ba

    const/16 v6, 0x6c0

    invoke-static {v0, v1, v5, v6}, Landroidx/loader/۟۠ۢۧۡ;->ۢ۟ۨۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Lkevin/fun/hook/DYHook$203;->ۨ۠ۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const v0, 0xc2fa

    :goto_8
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_14
    if-nez v1, :cond_4

    const v0, 0xc5e2

    goto :goto_8

    :cond_4
    :sswitch_15
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_16
    invoke-static {v2, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc601

    :goto_9
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_9

    :sswitch_17
    const v0, 0xc620

    goto :goto_9

    :sswitch_18
    invoke-static {}, Lkevin/fun/hook/DYHook$203;->۟ۦ۠ۥۧ()[S

    move-result-object v0

    const/4 v5, 0x3

    sget v6, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v6, v6, 0x123

    const/16 v7, 0x259

    invoke-static {v0, v5, v6, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۦۥۢ([SIII)Ljava/lang/String;

    move-result-object v0

    const/4 v5, 0x0

    new-array v5, v5, [Ljava/lang/Object;

    invoke-static {v1, v0, v5}, Lkevin/fun/hook/DYHook$203;->۟ۥ۠ۡۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v5

    const v1, 0xc67d

    :goto_a
    const v6, 0xc68e

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :cond_5
    :sswitch_19
    const v1, 0xc6bb

    goto :goto_a

    :sswitch_1a
    if-eqz v5, :cond_5

    const v1, 0xc965

    goto :goto_a

    :sswitch_1b
    invoke-static {v2, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z

    const v0, 0xc984

    :goto_b
    const v1, 0xc995

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_b

    :sswitch_1c
    const v0, 0xc9a3

    goto :goto_b

    :sswitch_1d
    invoke-static {v0}, Lkevin/fun/hook/DYHook$203;->ۣ۠ۨۡ(Ljava/lang/Object;)Z

    move-result v1

    const v0, 0xca00

    :goto_c
    const v5, 0xca11

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_b

    goto :goto_c

    :cond_6
    :sswitch_1e
    const v0, 0xca3e

    goto :goto_c

    :sswitch_1f
    if-nez v1, :cond_6

    const v0, 0xca5d

    goto :goto_c

    :sswitch_20
    invoke-static {v2, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xca7c

    :goto_d
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_d

    :sswitch_21
    const v0, 0xcd26

    goto :goto_d

    :catchall_0
    move-exception v0

    :try_start_2
    invoke-static {v2, v4}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const v0, 0xcd83

    :goto_e
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_e

    :sswitch_22
    const v0, 0xcda2

    goto :goto_e

    :sswitch_23
    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

    move-result v1

    const v0, 0xcdff

    :goto_f
    const v2, 0xce10

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_e

    goto :goto_f

    :cond_7
    :sswitch_24
    const v0, 0xce3d

    goto :goto_f

    :sswitch_25
    if-ltz v1, :cond_7

    const v0, 0xd0e7

    goto :goto_f

    :sswitch_26
    const-string v0, "FpuOydKId24kxTEBwWZkLIfBv"

    invoke-static {v0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۨ۠ۦۣ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    goto/16 :goto_5

    :catchall_1
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$203;->۟ۦ۠ۥۧ()[S

    move-result-object v2

    const/16 v3, 0x8

    sget v4, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v4, v4, 0x26b

    const/16 v5, 0xc1b

    invoke-static {v2, v3, v4, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$203;->۟۟۟ۤۨ(Ljava/lang/Object;)V

    goto/16 :goto_5

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_23
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb97b -> :sswitch_23
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0x2d -> :sswitch_e
        0x4c -> :sswitch_b
        0xef -> :sswitch_a
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_c
        0x1f7 -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
        0x4c -> :sswitch_11
        0x53 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_8
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x32 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_19
        0x35 -> :sswitch_1d
        0xf3 -> :sswitch_1a
        0xfeb -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1c
        0x36 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_1e
        0x11 -> :sswitch_1f
        0x2f -> :sswitch_8
        0x4c -> :sswitch_20
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_21
        0x7ab -> :sswitch_8
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_22
        0x36 -> :sswitch_8
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_24
        0x2d -> :sswitch_c
        0x3ef -> :sswitch_25
        0x1ef7 -> :sswitch_26
    .end sparse-switch
.end method
