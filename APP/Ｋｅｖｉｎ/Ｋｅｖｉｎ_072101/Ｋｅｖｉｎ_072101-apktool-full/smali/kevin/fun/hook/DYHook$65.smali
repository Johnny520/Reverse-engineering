.class Lkevin/fun/hook/DYHook$65;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookFeedDescTime(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
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

    const/16 v0, 0x4c

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$65;->short:[S

    return-void

    :array_0
    .array-data 2
        0xaaes
        0xab3s
        0xab7s
        0xabfs
        0xaa9s
        0xaaes
        0xabbs
        0xab7s
        0xaaas
        0xa85s
        0xaa9s
        0xaaes
        0xaa3s
        0xab6s
        0xabfs
        0xa85s
        0xabfs
        0xab4s
        0xabbs
        0xab8s
        0xab6s
        0xabfs
        0x9c1s
        0x9dcs
        0x9d8s
        0x9d0s
        0x9c6s
        0x9c1s
        0x9d4s
        0x9d8s
        0x9c5s
        0x9eas
        0x9c6s
        0x9c1s
        0x9ccs
        0x9d9s
        0x9d0s
        0x9eas
        0x9c1s
        0x9ccs
        0x9c5s
        0x9d0s
        0x129s
        0x134s
        0x130s
        0x138s
        0x12es
        0x129s
        0x13cs
        0x130s
        0x12ds
        0x102s
        0x13es
        0x132s
        0x131s
        0x132s
        0x12fs
        0x793s
        0x78es
        0x78as
        0x782s
        0x794s
        0x793s
        0x786s
        0x78as
        0x797s
        0x7b8s
        0x793s
        0x782s
        0x79fs
        0x793s
        0x7b8s
        0x794s
        0x78es
        0x79ds
        0x782s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$65;->this$0:Lkevin/fun/hook/DYHook;

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
    const-string v0, "8SBLjWf"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method static synthetic access$0(Lkevin/fun/hook/DYHook$65;)Lkevin/fun/hook/DYHook;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$65;->۟۠ۧ۠ۥ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    return-object v0
.end method

.method public static ۟۠ۧ۠ۥ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$65;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$65;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۟ۡۧۨ۟()[S
    .locals 2

    invoke-static {}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۧ۟()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$65;->short:[S

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

.method public static ۣ۟ۢ۠ۥ(Ljava/lang/Object;)Ljava/lang/Object;
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
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {p0}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

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
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v3, 0x1

    const/4 v0, 0x0

    invoke-static {}, Lkevin/fun/hook/DYHook$65;->۟ۡۧۨ۟()[S

    move-result-object v1

    sget v2, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v2, v2, 0x238

    const/16 v4, 0xada

    invoke-static {v1, v0, v2, v4}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۦۣ۠ۤ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۣۤۧ(Ljava/lang/Object;Z)Z

    move-result v2

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
    if-nez v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lkevin/fun/hook/DYHook$65;->۟ۡۧۨ۟()[S

    move-result-object v1

    const/16 v2, 0x16

    sget v4, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v4, v4, 0x21a

    const/16 v5, 0x9b5

    invoke-static {v1, v2, v4, v5}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۤ۠ۡ([SIII)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/activity/ۤۧۧۧ;->۟ۥۣ۟ۢ(Ljava/lang/Object;I)I

    move-result v6

    invoke-static {}, Lkevin/fun/hook/DYHook$65;->۟ۡۧۨ۟()[S

    move-result-object v1

    const/16 v2, 0x2a

    sget v4, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۣ۟ۡ:I

    xor-int/lit16 v4, v4, 0x3af

    const/16 v5, 0x15d

    invoke-static {v1, v2, v4, v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const v2, -0xa082e

    sget v4, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/2addr v2, v4

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->۟ۥۣ۟ۢ(Ljava/lang/Object;I)I

    move-result v4

    invoke-static {}, Lkevin/fun/hook/DYHook$65;->۟ۡۧۨ۟()[S

    move-result-object v1

    const/16 v2, 0x39

    sget v5, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۣ۟ۥۨ:I

    xor-int/lit16 v5, v5, 0x297

    const/16 v7, 0x7e7

    invoke-static {v1, v2, v5, v7}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v1

    sget v2, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۦ۟ۡ:I

    xor-int/lit16 v2, v2, 0x16a

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->۟ۥۣ۟ۢ(Ljava/lang/Object;I)I

    move-result v5

    invoke-static {p1}, Lkevin/fun/hook/DYHook$65;->ۣ۟ۢ۠ۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    instance-of v7, v2, Landroid/view/View;

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v7, :cond_1

    const/16 v1, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v1, 0x70a

    goto :goto_1

    :sswitch_5
    check-cast v2, Landroid/view/View;

    const/16 v1, 0x748

    :goto_2
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-ne v6, v3, :cond_2

    const v1, 0xbe60

    goto :goto_2

    :cond_2
    :sswitch_7
    const v1, 0xbe41

    goto :goto_2

    :sswitch_8
    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_9
    new-instance v0, Lkevin/fun/hook/DYHook$65$1;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/DYHook$65$1;-><init>(Lkevin/fun/hook/DYHook$65;Landroid/view/View;ZII)V

    invoke-static {v2, v0}, Lorg/luckypray/dexkit/۠۠ۥ;->۟۟ۧۥ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    new-instance v0, Lkevin/fun/hook/DYHook$65$2;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/DYHook$65$2;-><init>(Lkevin/fun/hook/DYHook$65;Landroid/view/View;ZII)V

    const-wide/16 v6, 0x30b

    sget v1, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    int-to-long v8, v1

    xor-long/2addr v6, v8

    invoke-static {v2, v0, v6, v7}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۡۧ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    new-instance v0, Lkevin/fun/hook/DYHook$65$3;

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lkevin/fun/hook/DYHook$65$3;-><init>(Lkevin/fun/hook/DYHook$65;Landroid/view/View;ZII)V

    const-wide/16 v4, -0x1de

    sget v1, Landroidx/startup/۟ۦۤۨۧ;->ۧۡۡۦ:I

    int-to-long v6, v1

    xor-long/2addr v4, v6

    invoke-static {v2, v0, v4, v5}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۡۧ۟ۨ(Ljava/lang/Object;Ljava/lang/Object;J)Z

    :sswitch_a
    return-void

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_3

    :sswitch_c
    move v3, v0

    goto :goto_4

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
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_5
        0x1f4 -> :sswitch_a
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch
.end method
