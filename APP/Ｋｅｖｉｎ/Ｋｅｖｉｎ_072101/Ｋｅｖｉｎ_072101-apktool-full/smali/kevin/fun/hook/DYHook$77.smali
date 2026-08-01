.class Lkevin/fun/hook/DYHook$77;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookLongPressAction(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$commentRecyclerViewCls:Ljava/lang/Class;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$77;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3190s
        0x1cbs
        0x1e5s
        0x1f6s
        0x1e9s
        0x1ees
        0x3191s
        0x1a0s
        0x1e8s
        0x1efs
        0x1efs
        0x1ebs
        0x1ccs
        0x1efs
        0x1ees
        0x1e7s
        0x1d0s
        0x1f2s
        0x1e5s
        0x1f3s
        0x1f3s
        0x1c1s
        0x1e3s
        0x1f4s
        0x1e9s
        0x1efs
        0x1ees
        0x1a0s
        0x1e5s
        0x1f2s
        0x1f2s
        0x1efs
        0x1f2s
        0x18as
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Ljava/lang/Class;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$77;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$77;->val$commentRecyclerViewCls:Ljava/lang/Class;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    const-string v0, "uWcLIrWBg3Ru2H8jta5svZc"

    invoke-static {v0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

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

.method static synthetic access$0(Lkevin/fun/hook/DYHook$77;)Lkevin/fun/hook/DYHook;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$77;->۟ۥ۟۟ۥ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    return-object v0
.end method

.method public static ۣ۟ۧ()[S
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$77;->short:[S

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

.method public static ۟ۥ۟۟ۥ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$77;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$77;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۦۣ۟ۧ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

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

.method public static ۣۣۧۨ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

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

.method public static ۨۨۧۨ(Ljava/lang/Object;)Ljava/lang/Class;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$77;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$77;->val$commentRecyclerViewCls:Ljava/lang/Class;

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
    .locals 16

    :try_start_0
    invoke-static/range {p1 .. p1}, Lkevin/fun/hook/DYHook$77;->ۦۣ۟ۧ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static/range {p1 .. p1}, Lkevin/fun/hook/DYHook$77;->ۦۣ۟ۧ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    array-length v1, v0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/4 v0, 0x1

    if-eq v1, v0, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

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
    invoke-static/range {p1 .. p1}, Lkevin/fun/hook/DYHook$77;->ۦۣ۟ۧ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    aget-object v3, v0, v1

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-nez v3, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

    move-result v1

    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    if-ltz v1, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_d
    const-string v0, "Ct7ED1H0Pptyk3pyPuT6"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_5
    :sswitch_e
    return-void

    :sswitch_f
    invoke-static {v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۠ۨۢۧ(Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object v8

    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_10
    if-eqz v8, :cond_4

    const v0, 0xc25f

    goto :goto_6

    :cond_4
    :sswitch_11
    const v0, 0xc240

    goto :goto_6

    :sswitch_12
    array-length v1, v8

    const v0, 0xc27e

    :goto_7
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :cond_5
    :sswitch_13
    const v0, 0xc2bc

    goto :goto_7

    :sswitch_14
    if-nez v1, :cond_5

    const v0, 0xc2db

    goto :goto_7

    :sswitch_15
    const v0, 0xc2fa

    :goto_8
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_16
    const v0, 0xc5a4

    goto :goto_8

    :sswitch_17
    const/4 v0, 0x0

    const/4 v4, 0x0

    array-length v9, v8

    const/4 v1, 0x0

    move v5, v1

    :goto_9
    const v1, 0xc601

    :goto_a
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_18
    if-lt v5, v9, :cond_6

    const v1, 0xc65e

    goto :goto_a

    :cond_6
    :sswitch_19
    const v1, 0xc63f

    goto :goto_a

    :sswitch_1a
    const v1, 0xc67d

    :goto_b
    const v2, 0xc68e

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_9

    goto :goto_b

    :sswitch_1b
    move-object v2, v0

    :goto_c
    const v0, 0xd1fe

    :goto_d
    const v1, 0xd20f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_a

    goto :goto_d

    :sswitch_1c
    if-eqz v2, :cond_d

    const v0, 0xd4e6

    goto :goto_d

    :sswitch_1d
    const v1, 0xc69c

    goto :goto_b

    :sswitch_1e
    aget-object v2, v8, v5

    invoke-static {v2}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۥۧۢۦ(Ljava/lang/Object;)[Ljava/lang/reflect/Method;

    move-result-object v10

    array-length v11, v10

    const/4 v1, 0x0

    move v6, v1

    :goto_e
    const v1, 0xc984

    :goto_f
    const v7, 0xc995

    xor-int/2addr v1, v7

    sparse-switch v1, :sswitch_data_b

    goto :goto_f

    :sswitch_1f
    if-lt v6, v11, :cond_7

    const v1, 0xc9e1

    goto :goto_f

    :cond_7
    :sswitch_20
    const v1, 0xc9c2

    goto :goto_f

    :sswitch_21
    const v1, 0xca00

    :goto_10
    const v2, 0xca11

    xor-int/2addr v1, v2

    packed-switch v1, :pswitch_data_0

    :pswitch_0
    goto :goto_10

    :goto_11
    :pswitch_1
    const v1, 0xd182

    :goto_12
    const v2, 0xd193

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_c

    goto :goto_12

    :sswitch_22
    if-eqz v0, :cond_c

    const v1, 0xd1df

    goto :goto_12

    :pswitch_2
    const v1, 0xca1f

    goto :goto_10

    :sswitch_23
    aget-object v1, v10, v6

    invoke-static {v1}, Landroidx/loader/ۡۢۢ;->ۣ۟ۡۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v12

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡۨ۟ۥ()Ljava/lang/Class;

    move-result-object v13

    const v7, 0xca7c

    :goto_13
    const v14, 0xca8d

    xor-int/2addr v7, v14

    sparse-switch v7, :sswitch_data_d

    goto :goto_13

    :sswitch_24
    if-ne v12, v13, :cond_8

    const v7, 0xcd64

    goto :goto_13

    :cond_8
    :sswitch_25
    const v7, 0xcd45

    goto :goto_13

    :sswitch_26
    invoke-static {v1}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۡۤ۠۟(Ljava/lang/Object;)[Ljava/lang/Class;

    move-result-object v12

    array-length v13, v12

    const v7, 0xcd83

    :goto_14
    const v14, 0xcd94

    xor-int/2addr v7, v14

    sparse-switch v7, :sswitch_data_e

    goto :goto_14

    :sswitch_27
    const/4 v7, 0x2

    if-ne v13, v7, :cond_9

    const v7, 0xcde0

    goto :goto_14

    :cond_9
    :sswitch_28
    const v7, 0xcdc1

    goto :goto_14

    :sswitch_29
    const/4 v7, 0x0

    aget-object v13, v12, v7

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->۟ۤۨۨۤ()Ljava/lang/Class;

    move-result-object v14

    const v7, 0xcdff

    :goto_15
    const v15, 0xce10

    xor-int/2addr v7, v15

    sparse-switch v7, :sswitch_data_f

    goto :goto_15

    :cond_a
    :sswitch_2a
    const v7, 0xce3d

    goto :goto_15

    :sswitch_2b
    if-ne v13, v14, :cond_a

    const v7, 0xd0e7

    goto :goto_15

    :sswitch_2c
    const/4 v7, 0x1

    aget-object v12, v12, v7

    invoke-static {}, Landroidx/startup/۟ۦۤۨۧ;->۟ۤۨۨۤ()Ljava/lang/Class;

    move-result-object v13

    const v7, 0xd106

    :goto_16
    const v14, 0xd117

    xor-int/2addr v7, v14

    sparse-switch v7, :sswitch_data_10

    goto :goto_16

    :sswitch_2d
    if-ne v12, v13, :cond_b

    const v7, 0xd163

    goto :goto_16

    :cond_b
    :sswitch_2e
    const v7, 0xd144

    goto :goto_16

    :sswitch_2f
    move-object v0, v1

    move-object v4, v2

    goto/16 :goto_11

    :cond_c
    :sswitch_30
    const v1, 0xd1c0

    goto/16 :goto_12

    :sswitch_31
    move-object v2, v0

    goto/16 :goto_c

    :cond_d
    :sswitch_32
    const v0, 0xd4c7

    goto/16 :goto_d

    :sswitch_33
    const v0, 0xd505

    :goto_17
    const v1, 0xd516

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_11

    goto :goto_17

    :sswitch_34
    if-nez v4, :cond_e

    const v0, 0xd562

    goto :goto_17

    :cond_e
    :sswitch_35
    const v0, 0xd543

    goto :goto_17

    :sswitch_36
    const v0, 0xd581

    :goto_18
    const v1, 0xd592

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_12

    goto :goto_18

    :sswitch_37
    const v0, 0xd5a0

    goto :goto_18

    :sswitch_38
    invoke-static {v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۢ۠ۧ(Ljava/lang/Object;)Ljava/lang/ClassLoader;

    move-result-object v6

    const/4 v0, 0x1

    new-array v7, v0, [Ljava/lang/Class;

    sget v0, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v0, v0, -0xed

    aput-object v4, v7, v0

    new-instance v0, Lkevin/fun/hook/DYHook$77$1;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$77;->ۨۨۧۨ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v5

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/DYHook$77$1;-><init>(Lkevin/fun/hook/DYHook$77;Ljava/lang/reflect/Method;Ljava/lang/Object;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/lang/Class;)V

    invoke-static {v6, v7, v0}, Landroidx/customview/ۤۡۥ;->ۡۥ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static/range {p1 .. p1}, Lkevin/fun/hook/DYHook$77;->ۦۣ۟ۧ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v1

    const/4 v2, 0x0

    aput-object v0, v1, v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xd888

    :goto_19
    const v1, 0xd899

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_13

    goto :goto_19

    :sswitch_39
    const v0, 0xd8a7

    goto :goto_19

    :sswitch_3a
    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v1, v1, 0x28c

    add-int/2addr v1, v5

    const v2, 0xd904

    :goto_1a
    const v5, 0xd915

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_14

    goto :goto_1a

    :sswitch_3b
    const v2, 0xd923

    goto :goto_1a

    :sswitch_3c
    move v5, v1

    goto/16 :goto_9

    :sswitch_3d
    sget v1, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v1, v1, 0x178

    add-int/2addr v1, v6

    const v6, 0xd980

    :goto_1b
    const v7, 0xd991

    xor-int/2addr v6, v7

    sparse-switch v6, :sswitch_data_15

    goto :goto_1b

    :sswitch_3e
    const v6, 0xdc2a

    goto :goto_1b

    :sswitch_3f
    move v6, v1

    goto/16 :goto_e

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$77;->ۣ۟ۧ()[S

    move-result-object v2

    const/4 v3, 0x0

    sget v4, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v4, v4, -0xcf

    const/16 v5, 0x180

    invoke-static {v2, v3, v4, v5}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$77;->ۣۣۧۨ(Ljava/lang/Object;)V

    goto/16 :goto_5

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_e
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
        0xb97b -> :sswitch_e
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_f
        0x4c -> :sswitch_a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_e
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_17
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_e
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_1e
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0xf3 -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x3f1 -> :sswitch_1c
        0x6a7 -> :sswitch_32
        0x6c8 -> :sswitch_e
        0x6e9 -> :sswitch_33
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_20
        0x57 -> :sswitch_23
        0x74 -> :sswitch_21
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0xe
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_2
    .end packed-switch

    :sswitch_data_c
    .sparse-switch
        0x11 -> :sswitch_22
        0x32 -> :sswitch_30
        0x4c -> :sswitch_31
        0x53 -> :sswitch_3a
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_25
        0x7c8 -> :sswitch_3d
        0x7e9 -> :sswitch_26
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0x17 -> :sswitch_27
        0x36 -> :sswitch_28
        0x55 -> :sswitch_3d
        0x74 -> :sswitch_29
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0xe -> :sswitch_2a
        0x2d -> :sswitch_3d
        0x3ef -> :sswitch_2b
        0x1ef7 -> :sswitch_2c
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_2d
        0x32 -> :sswitch_2e
        0x53 -> :sswitch_3d
        0x74 -> :sswitch_2f
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x13 -> :sswitch_34
        0x32 -> :sswitch_35
        0x55 -> :sswitch_38
        0x74 -> :sswitch_36
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_37
        0x32 -> :sswitch_e
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x11 -> :sswitch_39
        0x3e -> :sswitch_e
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_3b
        0x36 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_3e
        0x5bb -> :sswitch_3f
    .end sparse-switch
.end method
