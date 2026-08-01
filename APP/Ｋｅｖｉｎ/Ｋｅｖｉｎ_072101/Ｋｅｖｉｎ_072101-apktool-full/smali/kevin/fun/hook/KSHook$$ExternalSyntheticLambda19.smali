.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Ljava/lang/ref/WeakReference;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Ljava/lang/ref/WeakReference;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;->f$1:Ljava/lang/ref/WeakReference;

    iput-object p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;->f$3:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

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
    const-string v0, "x0PVsxd1Dp"

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->ۥۣۢۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۟ۤۢۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۤۢۤۦ()I

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
    check-cast p0, Lkevin/fun/hook/KSHook;

    check-cast p1, Ljava/lang/ref/WeakReference;

    check-cast p2, Landroid/content/Context;

    check-cast p3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    check-cast p4, Landroid/view/View;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/KSHook;->lambda$5$kevin-fun-hook-KSHook(Ljava/lang/ref/WeakReference;Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/view/View;)V

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
.method public final onClick(Landroid/view/View;)V
    .locals 6

    const/4 v1, 0x0

    const-string v5, "\u06e7\u06e5\u06e8"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۧۨۥۥ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v1

    const-string v5, "\u06df\u06e4\u06e3"

    move-object v2, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟ۧۡۦۢ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v1

    const-string v5, "\u06e3\u06e5\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v2, v3, v0, v4, p1}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda19;->۟ۤۢۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e3\u06e6\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟ۤۧۨۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    const-string v1, "\u06e4\u06e6\u06e7"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۤۦ۟۟(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v1

    const-string v5, "\u06e1\u06e4\u06e2"

    move-object v4, v1

    goto :goto_0

    :sswitch_4
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa79e -> :sswitch_0
        0x1aaf1f -> :sswitch_1
        0x1ab6c3 -> :sswitch_2
        0x1ab6e3 -> :sswitch_4
        0x1abaa5 -> :sswitch_3
    .end sparse-switch
.end method
