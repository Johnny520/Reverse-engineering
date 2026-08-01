.class Lkevin/fun/hook/DYHook$58;
.super Lde/robv/android/xposed/XC_MethodHook;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->hookDisableLandscapeEntrance(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
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

    iput-object p1, p0, Lkevin/fun/hook/DYHook$58;->this$0:Lkevin/fun/hook/DYHook;

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
    const-string v0, "BERCie2x07GoA7pEW7DxKOWbk1R"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۢ۠ۡ(Ljava/lang/Object;)[Ljava/lang/Object;
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

.method public static ۥ۠ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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


# virtual methods
.method protected afterHookedMethod(Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;)V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v8, 0x0

    const-string v6, "\u06e7\u06e1\u06e6"

    move-object v2, v0

    move-object v3, v0

    move-object v4, v0

    move-object v5, v0

    move-object v1, v0

    move v7, v8

    move v9, v8

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p1, v2}, Lkevin/fun/hook/DYHook$58;->ۥ۠ۡۤ(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e7\u06e5\u06e5"

    move-object v6, v0

    goto :goto_0

    :sswitch_0
    aget-object v1, v5, v8

    const-string v0, "\u06e6\u06df\u06e8"

    move-object v6, v0

    goto :goto_0

    :sswitch_1
    new-instance v0, Landroid/view/ViewGroup$LayoutParams;

    invoke-direct {v0, v8, v8}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    const-string v6, "\u06e4\u06df\u06e8"

    move-object v3, v0

    goto :goto_0

    :sswitch_2
    new-instance v0, Landroid/widget/FrameLayout;

    invoke-direct {v0, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const-string v6, "\u06e0\u06e8\u06e0"

    move-object v2, v0

    goto :goto_0

    :sswitch_3
    move-object v0, v1

    check-cast v0, Landroid/content/Context;

    const-string v6, "\u06e6\u06df\u06e7"

    move-object v4, v0

    goto :goto_0

    :sswitch_4
    invoke-static {p1}, Lkevin/fun/hook/DYHook$58;->ۣۢ۠ۡ(Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    const-string v6, "\u06e7\u06e0\u06e1"

    move-object v5, v0

    goto :goto_0

    :sswitch_5
    invoke-static {v2, v3}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e5\u06e6\u06e8"

    move-object v6, v0

    goto :goto_0

    :sswitch_6
    invoke-static {v2, v7}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۡۦ۠۠(Ljava/lang/Object;I)V

    const-string v0, "\u06e1\u06e7\u06e0"

    move-object v6, v0

    goto :goto_0

    :sswitch_7
    xor-int/lit16 v7, v9, 0x317

    const-string v0, "\u06e7\u06e6\u06df"

    move-object v6, v0

    goto :goto_0

    :sswitch_8
    sget v9, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۣ۟ۥۨۥ:I

    const-string v0, "\u06e7\u06e7\u06e1"

    move-object v6, v0

    goto :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aabd8 -> :sswitch_1
        0x1ab9cd -> :sswitch_5
        0x1abe67 -> :sswitch_8
        0x1ac14e -> :sswitch_2
        0x1ac14f -> :sswitch_3
        0x1ac528 -> :sswitch_0
        0x1ac54c -> :sswitch_4
        0x1ac5c7 -> :sswitch_9
        0x1ac5e0 -> :sswitch_6
        0x1ac601 -> :sswitch_7
    .end sparse-switch
.end method
