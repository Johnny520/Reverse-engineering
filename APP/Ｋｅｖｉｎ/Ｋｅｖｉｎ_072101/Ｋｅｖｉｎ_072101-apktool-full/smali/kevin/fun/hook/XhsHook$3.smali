.class Lkevin/fun/hook/XhsHook$3;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/XhsHook;->handleLoadPackage(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/XhsHook;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x4c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/XhsHook$3;->short:[S

    return-void

    :array_0
    .array-data 2
        0x870s
        0x860s
        0x87bs
        0x864s
        0x861s
        0x866s
        0x863s
        0x826s
        0x86bs
        0x867s
        0x865s
        0x4b9s
        0x4f9s
        0x4e5s
        0x4e5s
        0x4e1s
        0x4e2s
        0x4aes
        0x4abs
        0x4bes
        0x4bes
        0x4e9s
        0x4f9s
        0x4e2s
        0x4fds
        0x4f8s
        0x4ffs
        0x4fas
        0x4cds
        0x4bfs
        0x4f2s
        0x4fes
        0x4fcs
        0x4bes
        0x4cas
        0x4cfs
        0x4cds
        0x4e2s
        0x4ccs
        0x4bas
        0x4b8s
        0x2760s
        -0x31s
        0x1e0s
        0x1a3s
        0x1b5s
        0x1b2s
        0x1b2s
        0x1a5s
        0x1aes
        0x1b4s
        0x181s
        0x1a3s
        0x1b4s
        0x1a9s
        0x1b6s
        0x1a9s
        0x1b4s
        0x1b9s
        0x1e0s
        0x1fds
        0x1fds
        0x1e0s
        0x1aes
        0x1b5s
        0x1acs
        0x1acs
        -0x134s
        -0x73cds
        -0x71f9s
        0x1e0s
        0x195s
        0x189s
        0x1e0s
        0x650ds
        0x4e9cs
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/XhsHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$3;->this$0:Lkevin/fun/hook/XhsHook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "JOMtutLPintwLrOTXY7u"

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۧۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟۠ۥۤۥ()[S
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
    sget-object v0, Lkevin/fun/hook/XhsHook$3;->short:[S

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

.method public static ۣ۟ۡۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/XhsHook;

    check-cast p1, Landroid/content/Context;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/XhsHook;->_$$Nest$mstartParse(Lkevin/fun/hook/XhsHook;Landroid/content/Context;Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "eKjFgU2iLWdE1bHd"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_7
    return-void

    :sswitch_8
    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_9
    const v0, 0xbe22

    goto :goto_2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_8
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_9
        0xb97b -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۣۣ۟ۨۢ(Ljava/lang/Object;)V
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

.method public static ۠۟ۢۨ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

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

.method public static ۤ۟ۡۤ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook$3;

    iget-object v0, p0, Lkevin/fun/hook/XhsHook$3;->this$0:Lkevin/fun/hook/XhsHook;

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
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v4, 0x0

    invoke-static {p1}, Lkevin/fun/hook/XhsHook$3;->۠۟ۢۨ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    aget-object v0, v0, v4

    check-cast v0, Landroid/content/ClipData;

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
    invoke-static {v0}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦۣۣۡ(Ljava/lang/Object;)I

    move-result v2

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

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
    invoke-static {v0, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۥۣۨۡ(Ljava/lang/Object;I)Landroid/content/ClipData$Item;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟۠۟۠ۡ(Ljava/lang/Object;)Ljava/lang/CharSequence;

    move-result-object v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_8
    const v0, 0xbebd

    goto :goto_3

    :sswitch_9
    if-nez v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_a
    invoke-static {v1}, Landroidx/loader/۟۠ۢۧۡ;->ۣ۟ۨۡۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/XhsHook$3;->۟۠ۥۤۥ()[S

    move-result-object v0

    sget v2, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۡۢ۟:I

    xor-int/lit16 v2, v2, 0x329

    const/16 v3, 0x808

    invoke-static {v0, v4, v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۡۧۨ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbefb

    :goto_4
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbf39

    goto :goto_4

    :sswitch_c
    if-nez v2, :cond_3

    const v0, 0xc1e3

    goto :goto_4

    :sswitch_d
    invoke-static {}, Lkevin/fun/hook/XhsHook$3;->۟۠ۥۤۥ()[S

    move-result-object v0

    const/16 v2, 0xb

    sget v3, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v3, v3, 0x293

    const/16 v4, 0x491

    invoke-static {v0, v2, v3, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢ۠ۤۥ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۦ۠۠۟(Ljava/lang/Object;)Ljava/util/regex/Pattern;

    move-result-object v0

    invoke-static {v0, v1}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۦۢۡۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/regex/Matcher;

    move-result-object v1

    invoke-static {v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡ۠ۤۧ(Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc202

    :goto_5
    const v3, 0xc213

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_5

    goto :goto_5

    :sswitch_e
    if-nez v2, :cond_4

    const v0, 0xc25f

    goto :goto_5

    :cond_4
    :sswitch_f
    const v0, 0xc240

    goto :goto_5

    :sswitch_10
    const/4 v0, 0x1

    invoke-static {v1, v0}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۧۢ(Ljava/lang/Object;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۨ۠ۡ()Landroid/app/Activity;

    move-result-object v2

    const v0, 0xc27e

    :goto_6
    const v3, 0xc28f

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_6

    goto :goto_6

    :cond_5
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_6

    :sswitch_12
    if-eqz v2, :cond_5

    const v0, 0xc2db

    goto :goto_6

    :sswitch_13
    new-instance v0, Lkevin/fun/hook/XhsHook$3$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, v2, v1}, Lkevin/fun/hook/XhsHook$3$$ExternalSyntheticLambda0;-><init>(Lkevin/fun/hook/XhsHook$3;Landroid/app/Activity;Ljava/lang/String;)V

    invoke-static {v2, v0}, Landroidx/core/ۤۦ۟ۢ;->۟ۡۤ۟۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xc2fa

    :goto_7
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_7

    :sswitch_14
    const v0, 0xc5a4

    goto :goto_7

    :sswitch_15
    invoke-static {}, Lkevin/fun/hook/XhsHook$3;->۟۠ۥۤۥ()[S

    move-result-object v0

    const/16 v1, 0x29

    sget v2, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v2, v2, 0x2ae

    const/16 v3, 0x1c0

    invoke-static {v0, v1, v2, v3}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$3;->ۣۣ۟ۨۢ(Ljava/lang/Object;)V

    :sswitch_16
    invoke-static {}, Landroidx/activity/ۦۧۥۥ;->ۣ۠ۦۤ()I

    move-result v1

    const v0, 0xc601

    :goto_8
    const v2, 0xc612

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_8

    goto :goto_8

    :sswitch_17
    if-gtz v1, :cond_6

    const v0, 0xc65e

    goto :goto_8

    :cond_6
    :sswitch_18
    const v0, 0xc63f

    goto :goto_8

    :sswitch_19
    const-string v0, "jCKu"

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_1a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_1a
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
        0xb97b -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_8
        0x2d -> :sswitch_a
        0x4c -> :sswitch_1a
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_b
        0x35 -> :sswitch_d
        0x1f7 -> :sswitch_c
        0x7eef -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_f
        0x4c -> :sswitch_1a
        0x53 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_15
        0x54 -> :sswitch_13
        0xf1 -> :sswitch_12
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_17
        0x2d -> :sswitch_1a
        0x32 -> :sswitch_18
        0x4c -> :sswitch_19
    .end sparse-switch
.end method

.method synthetic lambda$0$kevin-fun-hook-XhsHook$3(Landroid/app/Activity;Ljava/lang/String;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06df\u06e8\u06e1"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$3;->ۤ۟ۡۤ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v1, "\u06e3\u06e0\u06e0"

    goto :goto_0

    :sswitch_0
    invoke-static {v0, p1, p2}, Lkevin/fun/hook/XhsHook$3;->ۣ۟ۡۨۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e5\u06e4"

    goto :goto_0

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7be -> :sswitch_1
        0x1ab623 -> :sswitch_0
    .end sparse-switch
.end method
