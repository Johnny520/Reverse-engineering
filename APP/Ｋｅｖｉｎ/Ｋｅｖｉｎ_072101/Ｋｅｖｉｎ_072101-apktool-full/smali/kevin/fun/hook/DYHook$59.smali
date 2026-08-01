.class Lkevin/fun/hook/DYHook$59;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookDisableBottomAndSearch(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$59;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Lde/robv/android/xposed/XC_MethodHook;-><init>()V

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "rqqGjzDCpBsCFY99ZB"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۡۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۧۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;)V
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;

    invoke-virtual {p0, p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

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

.method public static ۦۥۡۦ(Ljava/lang/Object;)[Ljava/lang/Object;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

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


# virtual methods
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static {p1}, Lkevin/fun/hook/DYHook$59;->ۦۥۡۦ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v5

    array-length v6, v5

    move v1, v2

    :goto_0
    const/16 v0, 0x650

    :goto_1
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_1

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_1

    :sswitch_1
    if-lt v1, v6, :cond_0

    const/16 v0, 0x6ad

    goto :goto_1

    :sswitch_2
    const/16 v0, 0x6cc

    :goto_2
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_2

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_2

    :sswitch_4
    move-object v0, v3

    :goto_3
    :sswitch_5
    new-instance v1, Landroid/view/View;

    invoke-direct {v1, v0}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v2, v2}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v0, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v0, v0, -0x3b7

    invoke-static {v1, v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۣۢ۠(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->۟ۥۤۢ۟(Ljava/lang/Object;Z)V

    invoke-static {v1, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->ۣۤۢ۠(Ljava/lang/Object;Z)V

    invoke-static {p1, v1}, Lkevin/fun/hook/DYHook$59;->۟ۧۦۣۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

    move-result v1

    const v0, 0xc2fa

    :goto_4
    const v2, 0xc30b

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_2

    goto :goto_4

    :sswitch_6
    if-ltz v1, :cond_4

    const v0, 0xc5e2

    goto :goto_4

    :sswitch_7
    aget-object v0, v5, v1

    instance-of v7, v0, Landroid/content/Context;

    const/16 v4, 0x748

    :goto_5
    xor-int/lit16 v4, v4, 0x759

    sparse-switch v4, :sswitch_data_3

    goto :goto_5

    :sswitch_8
    if-eqz v7, :cond_1

    const v4, 0xbe60

    goto :goto_5

    :cond_1
    :sswitch_9
    const v4, 0xbe41

    goto :goto_5

    :sswitch_a
    check-cast v0, Landroid/content/Context;

    const v1, 0xbe7f

    :goto_6
    const v3, 0xbe90

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_6

    :sswitch_b
    const v1, 0xbe9e

    goto :goto_6

    :sswitch_c
    instance-of v7, v0, Landroid/view/View;

    const v4, 0xbefb

    :goto_7
    const v8, 0xbf0c

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_5

    goto :goto_7

    :cond_2
    :sswitch_d
    const v4, 0xbf39

    goto :goto_7

    :sswitch_e
    if-eqz v7, :cond_2

    const v4, 0xc1e3

    goto :goto_7

    :sswitch_f
    check-cast v0, Landroid/view/View;

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۢۤۤۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const v1, 0xc202

    :goto_8
    const v3, 0xc213

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_6

    goto :goto_8

    :sswitch_10
    const v1, 0xc221

    goto :goto_8

    :sswitch_11
    instance-of v7, v0, Landroid/view/ViewGroup;

    const v4, 0xc27e

    :goto_9
    const v8, 0xc28f

    xor-int/2addr v4, v8

    sparse-switch v4, :sswitch_data_7

    goto :goto_9

    :cond_3
    :sswitch_12
    const v4, 0xc2bc

    goto :goto_9

    :sswitch_13
    if-eqz v7, :cond_3

    const v4, 0xc2db

    goto :goto_9

    :sswitch_14
    check-cast v0, Landroid/view/ViewGroup;

    invoke-static {v0}, Landroidx/customview/ۡۤۡۤ;->ۨۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    goto/16 :goto_3

    :cond_4
    :sswitch_15
    const v0, 0xc5c3

    goto/16 :goto_4

    :sswitch_16
    const-string v0, "K92uIbMVMaibZx8zxDbEJB"

    invoke-static {v0}, Landroidx/loader/ۡۢۢ;->ۨۦۦۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_17
    return-void

    :sswitch_18
    sget v0, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v0, v0, 0x28c

    add-int/2addr v0, v1

    const v1, 0xc601

    :goto_a
    const v4, 0xc612

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_8

    goto :goto_a

    :sswitch_19
    const v1, 0xc620

    goto :goto_a

    :sswitch_1a
    move v1, v0

    goto/16 :goto_0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_7
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x1f1 -> :sswitch_6
        0x6af -> :sswitch_15
        0x6c8 -> :sswitch_17
        0x6e9 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0xe -> :sswitch_5
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_11
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_12
        0x33 -> :sswitch_18
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1a
    .end sparse-switch
.end method
