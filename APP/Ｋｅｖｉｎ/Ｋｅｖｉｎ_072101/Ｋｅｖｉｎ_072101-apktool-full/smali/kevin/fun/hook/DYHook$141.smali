.class Lkevin/fun/hook/DYHook$141;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/DYHook$Consumer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->buildAllSettingsContentWithPositions(Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/app/Dialog;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkevin/fun/hook/DYHook$Consumer",
        "<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$141;->short:[S

    return-void

    :array_0
    .array-data 2
        0x3dds
        0x3dcs
        0x3d1s
        0x3d0s
        0x3eas
        0x3d0s
        0x3d8s
        0x3das
        0x3dfs
        0x3dcs
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$141;->this$0:Lkevin/fun/hook/DYHook;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

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
    const-string v0, "wQc6NFjEkA41nLB3lp5DsggytSWrW"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۟ۡۧۦۢ()[S
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
    sget-object v0, Lkevin/fun/hook/DYHook$141;->short:[S

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

.method public static ۣ۟ۤۢۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$141;

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1}, Lkevin/fun/hook/DYHook$141;->accept(Ljava/lang/Boolean;)V

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
.method public accept(Ljava/lang/Boolean;)V
    .locals 8

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e2\u06e8\u06e3"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    move v7, v5

    :goto_0
    invoke-static {v3}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z

    move-result v4

    const-string v1, "\u06e0\u06e6\u06e2"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    xor-int/lit8 v7, v6, -0x1a

    const-string v1, "\u06e0\u06e3\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    const/16 v1, 0x3b5

    invoke-static {v0, v5, v7, v1}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡۨۨۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const-string v3, "\u06e4\u06e0\u06e7"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v4}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۥۥۤ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e2\u06e4\u06e1"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/DYHook$141;->۟ۡۧۦۢ()[S

    move-result-object v0

    const-string v1, "\u06df\u06e7\u06e5"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    sget v6, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    const-string v1, "\u06e0\u06e0\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aa7fd -> :sswitch_4
        0x1aaadf -> :sswitch_0
        0x1aab3c -> :sswitch_1
        0x1aab9c -> :sswitch_2
        0x1ab2df -> :sswitch_5
        0x1ab35d -> :sswitch_3
    .end sparse-switch
.end method

.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook$141;->ۣ۟ۤۢۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-void
.end method
