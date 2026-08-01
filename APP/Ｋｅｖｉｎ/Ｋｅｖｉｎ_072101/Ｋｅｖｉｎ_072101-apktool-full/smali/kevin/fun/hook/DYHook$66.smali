.class Lkevin/fun/hook/DYHook$66;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookShareInnerButtons(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$lpparam:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7a

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$66;->short:[S

    return-void

    :array_0
    .array-data 2
        0x1bbs
        0x1a0s
        0x1a9s
        0x1bas
        0x1ads
        0x222s
        0x22es
        0x22cs
        0x26fs
        0x223s
        0x238s
        0x235s
        0x224s
        0x225s
        0x220s
        0x22fs
        0x222s
        0x224s
        0x26fs
        0x225s
        0x234s
        0x239s
        0x26fs
        0x231s
        0x220s
        0x22fs
        0x224s
        0x22ds
        0x26fs
        0x205s
        0x234s
        0x239s
        0x203s
        0x220s
        0x232s
        0x224s
        0x211s
        0x220s
        0x22fs
        0x224s
        0x22ds
        0x205s
        0x228s
        0x220s
        0x22ds
        0x22es
        0x226s
        0x215s
        0x219s
        0x21bs
        0x258s
        0x205s
        0x205s
        0x258s
        0x217s
        0x218s
        0x212s
        0x204s
        0x219s
        0x21fs
        0x212s
        0x258s
        0x203s
        0x211s
        0x215s
        0x258s
        0x217s
        0x201s
        0x213s
        0x21bs
        0x213s
        0x258s
        0x205s
        0x21es
        0x217s
        0x204s
        0x213s
        0x204s
        0x258s
        0x206s
        0x217s
        0x218s
        0x213s
        0x21as
        0x21bs
        0x219s
        0x212s
        0x213s
        0x21as
        0x258s
        0x214s
        0x217s
        0x205s
        0x213s
        0x258s
        0x232s
        0x21fs
        0x217s
        0x21as
        0x219s
        0x211s
        0x226s
        0x217s
        0x218s
        0x213s
        0x21as
        0x360fs
        0x654s
        0x67as
        0x669s
        0x676s
        0x671s
        0x360es
        0x63fs
        0x657s
        0x670s
        0x670s
        0x674s
        0x5f2es
        -0x74c6s
        0x625s
        0x63fs
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$66;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$66;->val$lpparam:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/core/ۧ۟ۤۨ;->۟ۦ۠ۢ()I

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
    const-string v0, "U6ZDLKBoDKNCPNRMCMFvDde"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method static synthetic access$0(Lkevin/fun/hook/DYHook$66;)Lkevin/fun/hook/DYHook;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$66;->ۣ۟ۡۢۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    return-object v0
.end method

.method public static ۟۠ۥۡۤ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/loader/ۣۦ۟ۡ;->۟ۦ۠ۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$misNightMode(Lkevin/fun/hook/DYHook;)Z

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

.method public static ۣ۟ۡۢۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$66;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$66;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۟ۢ۠ۡۦ()[S
    .locals 2

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$66;->short:[S

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

.method public static ۟ۢۤۥ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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

    iget-object v0, p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->thisObject:Ljava/lang/Object;

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

.method public static ۣ۟ۧۡۤ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;
    .locals 2

    invoke-static {}, Landroidx/startup/ۤۧۥۣ;->۟۠ۨۢۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$66;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$66;->val$lpparam:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

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

.method public static ۥۨۦۣ(Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣۤۥۥ()I

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


# virtual methods
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9

    const/4 v0, -0x1

    const/high16 v1, -0x1000000

    :try_start_0
    invoke-static {p1}, Lkevin/fun/hook/DYHook$66;->۟ۢۤۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/app/Dialog;

    invoke-static {v3}, Landroidx/emoji2/ۢۧۡۧ;->۟ۤۤۨۢ(Ljava/lang/Object;)Ljava/lang/Class;

    move-result-object v2

    invoke-static {v2}, Landroidx/core/ۤۦ۟ۢ;->ۡۡۢۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۨۡۥۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DYHook$66;->۟ۢ۠ۡۦ()[S

    move-result-object v5

    const/4 v6, 0x0

    sget v7, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۥۥۧ۟:I

    xor-int/lit8 v7, v7, 0x16

    const/16 v8, 0x1c8

    invoke-static {v5, v6, v7, v8}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v2, v5}, Landroidx/emoji2/ۢۧۡۧ;->ۥۥ۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v5, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$66;->ۣ۟ۡۢۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$66;->۟۠ۥۡۤ(Ljava/lang/Object;)Z

    move-result v4

    const/16 v2, 0x6cc

    :goto_1
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-eqz v4, :cond_1

    const/16 v2, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v2, 0x70a

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    const v1, 0xbe22

    goto :goto_2

    :sswitch_7
    move v0, v1

    :sswitch_8
    const v1, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_3

    goto :goto_3

    :sswitch_9
    move v5, v0

    :goto_4
    new-instance v4, Ljava/lang/ref/WeakReference;

    invoke-direct {v4, v3}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v1

    const v0, 0xc67d

    :goto_5
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_2
    :sswitch_a
    const v0, 0xc6bb

    goto :goto_5

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_3

    :sswitch_c
    invoke-static {}, Lkevin/fun/hook/DYHook$66;->۟ۢ۠ۡۦ()[S

    move-result-object v2

    const/4 v5, 0x5

    sget v6, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v6, v6, 0x2d4

    const/16 v7, 0x241

    invoke-static {v2, v5, v6, v7}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۢۦۧ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v4}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    const v2, 0xbefb

    :goto_6
    const v6, 0xbf0c

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_5

    goto :goto_6

    :cond_3
    :sswitch_d
    const v2, 0xbf39

    goto :goto_6

    :sswitch_e
    if-eqz v5, :cond_3

    const v2, 0xc1e3

    goto :goto_6

    :sswitch_f
    const v1, 0xc202

    :goto_7
    const v2, 0xc213

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_6

    goto :goto_7

    :sswitch_10
    const v1, 0xc221

    goto :goto_7

    :sswitch_11
    move v5, v0

    goto :goto_4

    :sswitch_12
    invoke-static {}, Lkevin/fun/hook/DYHook$66;->۟ۢ۠ۡۦ()[S

    move-result-object v2

    const/16 v5, 0x2f

    sget v6, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v6, v6, 0x3b9

    const/16 v7, 0x276

    invoke-static {v2, v5, v6, v7}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v4, v2}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۨۧۨ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xc27e

    :goto_8
    const v5, 0xc28f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_7

    goto :goto_8

    :cond_4
    :sswitch_13
    const v2, 0xc2bc

    goto :goto_8

    :sswitch_14
    if-eqz v4, :cond_4

    const v2, 0xc2db

    goto :goto_8

    :sswitch_15
    invoke-static {p0}, Lkevin/fun/hook/DYHook$66;->ۣ۟ۡۢۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/DYHook$66;->۟۠ۥۡۤ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xc2fa

    :goto_9
    const v5, 0xc30b

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_8

    goto :goto_9

    :sswitch_16
    if-eqz v4, :cond_5

    const v2, 0xc5e2

    goto :goto_9

    :cond_5
    :sswitch_17
    const v2, 0xc5c3

    goto :goto_9

    :sswitch_18
    const v1, 0xc601

    :goto_a
    const v2, 0xc612

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_9

    goto :goto_a

    :sswitch_19
    const v1, 0xc620

    goto :goto_a

    :sswitch_1a
    move v5, v0

    goto/16 :goto_4

    :sswitch_1b
    move v5, v1

    goto/16 :goto_4

    :sswitch_1c
    if-eqz v1, :cond_2

    const v0, 0xc965

    goto/16 :goto_5

    :sswitch_1d
    invoke-static {v3}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۨۥۢ(Ljava/lang/Object;)Landroid/view/Window;

    move-result-object v0

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟۟ۦۢ۟(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v0

    const v1, 0xc984

    :goto_b
    const v2, 0xc995

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_a

    goto :goto_b

    :sswitch_1e
    const v1, 0xc9a3

    goto :goto_b

    :sswitch_1f
    move-object v6, v0

    :goto_c
    const v0, 0xca00

    :goto_d
    const v1, 0xca11

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_b

    goto :goto_d

    :cond_6
    :sswitch_20
    const v0, 0xca3e

    goto :goto_d

    :sswitch_21
    const/4 v0, 0x0

    move-object v6, v0

    goto :goto_c

    :sswitch_22
    if-eqz v6, :cond_6

    const v0, 0xca5d

    goto :goto_d

    :sswitch_23
    new-instance v0, Lkevin/fun/hook/DYHook$66$1;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$66;->ۣ۟ۧۡۤ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/DYHook$66$1;-><init>(Lkevin/fun/hook/DYHook$66;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/app/Dialog;Ljava/lang/ref/WeakReference;I)V

    invoke-static {v6, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->۟۟ۧۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v0, Lkevin/fun/hook/DYHook$66$2;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$66;->ۣ۟ۧۡۤ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v2

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/DYHook$66$2;-><init>(Lkevin/fun/hook/DYHook$66;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/app/Dialog;Ljava/lang/ref/WeakReference;I)V

    const-wide/16 v2, 0x2e6

    sget v1, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    int-to-long v4, v1

    xor-long/2addr v2, v4

    invoke-static {v6, v0, v2, v3}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۡۧ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const v0, 0xca7c

    :goto_e
    const v1, 0xca8d

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_c

    goto :goto_e

    :sswitch_24
    const v0, 0xcd26

    goto :goto_e

    :sswitch_25
    const v0, 0xcd83

    :goto_f
    const v1, 0xcd94

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_d

    goto :goto_f

    :sswitch_26
    const v0, 0xcda2

    goto :goto_f

    :sswitch_27
    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

    move-result v1

    const v0, 0xcdff

    :goto_10
    const v2, 0xce10

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_e

    goto :goto_10

    :cond_7
    :sswitch_28
    const v0, 0xce3d

    goto :goto_10

    :sswitch_29
    if-ltz v1, :cond_7

    const v0, 0xd0e7

    goto :goto_10

    :sswitch_2a
    const-string v0, "ixHVrtDqNS6oy37pV4gEUrA5"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_11
    :sswitch_2b
    return-void

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$66;->۟ۢ۠ۡۦ()[S

    move-result-object v2

    const/16 v3, 0x6a

    sget v4, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v4, v4, 0x164

    const/16 v5, 0x61f

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$66;->ۥۨۦۣ(Ljava/lang/Object;)V

    goto :goto_11

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_c
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
        0xb97b -> :sswitch_8
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x12 -> :sswitch_a
        0x35 -> :sswitch_21
        0xf3 -> :sswitch_1c
        0xfeb -> :sswitch_1d
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_13
        0x33 -> :sswitch_27
        0x54 -> :sswitch_15
        0xf1 -> :sswitch_14
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_16
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1b
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1e
        0x36 -> :sswitch_1f
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_20
        0x11 -> :sswitch_22
        0x2f -> :sswitch_25
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_28
        0x2d -> :sswitch_2b
        0x3ef -> :sswitch_29
        0x1ef7 -> :sswitch_2a
    .end sparse-switch
.end method
