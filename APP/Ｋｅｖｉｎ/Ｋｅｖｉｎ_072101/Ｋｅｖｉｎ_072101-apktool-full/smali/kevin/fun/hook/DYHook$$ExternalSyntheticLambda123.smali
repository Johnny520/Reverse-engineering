.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Landroid/app/Dialog;

.field public final f$2:Ljava/lang/ref/WeakReference;

.field public final f$3:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

.field public final f$4:J

.field public final f$5:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Landroid/app/Dialog;Ljava/lang/ref/WeakReference;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;JI)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;->f$1:Landroid/app/Dialog;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;->f$2:Ljava/lang/ref/WeakReference;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;->f$3:Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    iput-wide p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;->f$4:J

    iput p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;->f$5:I

    invoke-static {}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۦۣۡۡ()I

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
    const-string v0, "sm0IQWs"

    invoke-static {v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۤۦۡۧ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۥ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JILjava/lang/Object;)V
    .locals 8

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, Landroid/app/Dialog;

    move-object v2, p2

    check-cast v2, Ljava/lang/ref/WeakReference;

    move-object v3, p3

    check-cast v3, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-object v7, p7

    check-cast v7, Landroid/view/View;

    move-wide v4, p4

    move v6, p6

    invoke-virtual/range {v0 .. v7}, Lkevin/fun/hook/DYHook;->lambda$13$kevin-fun-hook-DYHook(Landroid/app/Dialog;Ljava/lang/ref/WeakReference;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;JILandroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "6TvRqUMuB9Xrv9Y"

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۣۣۨۤ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 v7, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const-string v8, "\u06df\u06e2\u06e5"

    move-object v3, v7

    move-object v0, v7

    move-object v1, v7

    move-object v2, v7

    :goto_0
    invoke-static {v8}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v7

    sparse-switch v7, :sswitch_data_0

    invoke-static {p0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟۟ۨۦۨ(Ljava/lang/Object;)I

    move-result v6

    const-string v7, "\u06df\u06e6\u06e3"

    move-object v8, v7

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۥۥ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v7, "\u06e5\u06e3\u06e6"

    move-object v8, v7

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۣ۟ۧ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v2

    const-string v7, "\u06e4\u06e5\u06e6"

    move-object v8, v7

    goto :goto_0

    :sswitch_2
    move-object v7, p1

    invoke-static/range {v0 .. v7}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda123;->ۣۥ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JILjava/lang/Object;)V

    const-string v7, "\u06e0\u06e8\u06e8"

    move-object v8, v7

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۣۢ۠ۦ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v7, "\u06e8\u06e7\u06e4"

    move-object v8, v7

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۡۨۡۡ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v1

    const-string v7, "\u06e2\u06e7\u06e4"

    move-object v8, v7

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->ۡۢۧۧ(Ljava/lang/Object;)Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;

    move-result-object v3

    const-string v7, "\u06e3\u06df\u06e5"

    move-object v8, v7

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa762 -> :sswitch_3
        0x1aa7dc -> :sswitch_2
        0x1aabe0 -> :sswitch_6
        0x1ab33f -> :sswitch_1
        0x1ab609 -> :sswitch_0
        0x1aba85 -> :sswitch_5
        0x1ac9c5 -> :sswitch_4
    .end sparse-switch
.end method
