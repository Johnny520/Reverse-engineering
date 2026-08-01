.class Lkevin/fun/hook/DYHook$15;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookBaseAdapter(Ljava/lang/ClassLoader;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x3b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$15;->short:[S

    return-void

    :array_0
    .array-data 2
        0x9c7s
        0x9e2s
        0x9e7s
        0x9f6s
        0x9f2s
        0x9e3s
        0x9f4s
        0x9b4s
        0x9d9s
        0x9c5s
        0x9cas
        0x9c7s
        0x9d5s
        0x9d5s
        0x3b7s
        0x392s
        0x397s
        0x386s
        0x382s
        0x393s
        0x384s
        0x3c2s
        0x3a9s
        0x3b5s
        0x3bas
        0x3b7s
        0x3a5s
        0x3a5s
        0x741s
        0x764s
        0x761s
        0x770s
        0x774s
        0x765s
        0x772s
        0x734s
        0x75fs
        0x749s
        0x74ds
        0x75fs
        0x755s
        0x753s
        0x745s
        0x752s
        0x75fs
        0x746s
        0x749s
        0x745s
        0x74cs
        0x744s
        0xb1bs
        0xb1es
        0xb0ds
        0xb1bs
        0xb1bs
        0xb1bs
        0x451s
        0x44ds
        0x440s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$15;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "A5sJbVVIszzM"

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۟ۢۤۡ۟()[S
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$15;->short:[S

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

.method public static ۟ۦۡۢۦ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$15;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$15;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۠ۡۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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

.method public static ۣ۠ۦۥ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

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

.method public static ۥ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Z
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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/String;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$misUidHidden(Lkevin/fun/hook/DYHook;Ljava/lang/String;)Z

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


# virtual methods
.method protected beforeHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v9, 0x0

    const/4 v8, 0x0

    invoke-static {p1}, Lkevin/fun/hook/DYHook$15;->ۣ۠ۦۥ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, v9

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
    if-nez v0, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {v0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v1

    :sswitch_3
    invoke-static {v1}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-nez v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_7
    if-ltz v1, :cond_2

    const v0, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_8
    const v0, 0xbe41

    goto :goto_2

    :sswitch_9
    const-string v0, "pqbW8xnRPxeLRknT8VHzzDHCd0Ni"

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_a
    return-void

    :sswitch_b
    invoke-static {v1}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v0, 0xbe7f

    :goto_3
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_3
    :sswitch_c
    const v0, 0xbebd

    goto :goto_3

    :sswitch_d
    if-nez v2, :cond_3

    const v0, 0xbedc

    goto :goto_3

    :sswitch_e
    const v0, 0xbefb

    :goto_4
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :sswitch_f
    const v0, 0xbf1a

    goto :goto_4

    :sswitch_10
    invoke-static {}, Lkevin/fun/hook/DYHook$15;->۟ۢۤۡ۟()[S

    move-result-object v0

    sget v3, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/lit16 v3, v3, -0xe3

    const/16 v4, 0x986

    invoke-static {v0, v9, v3, v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۦۤۢۦ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v8}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$15;->۟ۢۤۡ۟()[S

    move-result-object v3

    const/16 v4, 0xe

    sget v5, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v5, v5, -0x3b1

    const/16 v6, 0x3f6

    invoke-static {v3, v4, v5, v6}, Landroidx/startup/ۤۧۥۣ;->۟ۧۦ۠ۦ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v8}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DYHook$15;->۟ۢۤۡ۟()[S

    move-result-object v4

    const/16 v5, 0x1c

    sget v6, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v6, v6, 0x5f

    const/16 v7, 0x700

    invoke-static {v4, v5, v6, v7}, Landroidx/activity/ۣۦۡۥ;->۟ۡۨ۟۟([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v8}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۦۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v5

    invoke-static {v5}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v0, 0xc202

    :goto_5
    const v6, 0xc213

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_11
    if-nez v5, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_12
    const v0, 0xc240

    goto :goto_5

    :sswitch_13
    const v0, 0xc27e

    :goto_6
    const v2, 0xc28f

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :sswitch_14
    const v0, 0xc29d

    goto :goto_6

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/DYHook$15;->۟ۢۤۡ۟()[S

    move-result-object v0

    const/16 v5, 0x32

    sget v6, Landroidx/loader/ۢۥ۟;->۟ۧ۟ۡ:I

    xor-int/lit8 v6, v6, 0x74

    const/16 v7, 0xb57

    invoke-static {v0, v5, v6, v7}, Landroidx/customview/ۡۤۡۤ;->ۧ۟ۤۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DYHook$15;->۠ۡۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v0, 0xc2fa

    :goto_7
    const v5, 0xc30b

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_16
    if-nez v2, :cond_5

    const v0, 0xc5e2

    goto :goto_7

    :cond_5
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_7

    :sswitch_18
    const v0, 0xc601

    :goto_8
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_19
    const v0, 0xc620

    goto :goto_8

    :sswitch_1a
    invoke-static {v2}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v0

    invoke-static {v0}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v3}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    const v0, 0xc67d

    :goto_9
    const v5, 0xc68e

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_9

    goto :goto_9

    :cond_6
    :sswitch_1b
    const v0, 0xc6bb

    goto :goto_9

    :sswitch_1c
    if-nez v3, :cond_6

    const v0, 0xc965

    goto :goto_9

    :sswitch_1d
    const v0, 0xc984

    :goto_a
    const v2, 0xc995

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_a

    goto :goto_a

    :sswitch_1e
    const v0, 0xc9a3

    goto :goto_a

    :sswitch_1f
    invoke-static {v2, v4}, Lkevin/fun/hook/DYHook$15;->۠ۡۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const v0, 0xca00

    :goto_b
    const v3, 0xca11

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_b

    goto :goto_b

    :cond_7
    :sswitch_20
    const v0, 0xca3e

    goto :goto_b

    :sswitch_21
    if-nez v2, :cond_7

    const v0, 0xca5d

    goto :goto_b

    :sswitch_22
    const v0, 0xca7c

    :goto_c
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_c

    goto :goto_c

    :sswitch_23
    const v0, 0xcd26

    goto :goto_c

    :sswitch_24
    invoke-static {}, Lkevin/fun/hook/DYHook$15;->۟ۢۤۡ۟()[S

    move-result-object v0

    const/16 v3, 0x38

    sget v4, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۨۨۢ۠:I

    xor-int/lit16 v4, v4, -0x10c

    const/16 v5, 0x424

    invoke-static {v0, v3, v4, v5}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lkevin/fun/hook/DYHook$15;->۠ۡۤۥ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$15;->۟ۦۡۢۦ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v2

    invoke-static {v2, v0}, Lkevin/fun/hook/DYHook$15;->ۥ۟ۢۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xcd83

    :goto_d
    const v3, 0xcd94

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_d

    goto :goto_d

    :sswitch_25
    if-eqz v2, :cond_8

    const v0, 0xcde0

    goto :goto_d

    :cond_8
    :sswitch_26
    const v0, 0xcdc1

    goto :goto_d

    :sswitch_27
    invoke-static {v1}, Landroidx/customview/ۤۡۥ;->ۧۤۢۦ(Ljava/lang/Object;)V

    const v0, 0xcdff

    :goto_e
    const v2, 0xce10

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_e

    goto :goto_e

    :sswitch_28
    const v0, 0xce1e

    goto :goto_e

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_a
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_7
        0xb918 -> :sswitch_a
        0xb939 -> :sswitch_9
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_10
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_3
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_12
        0x4c -> :sswitch_13
        0x53 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_3
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1b
        0x35 -> :sswitch_1f
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_20
        0x11 -> :sswitch_21
        0x2f -> :sswitch_24
        0x4c -> :sswitch_22
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_23
        0x7ab -> :sswitch_3
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_25
        0x36 -> :sswitch_26
        0x55 -> :sswitch_3
        0x74 -> :sswitch_27
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_3
        0x3ef -> :sswitch_28
    .end sparse-switch
.end method
