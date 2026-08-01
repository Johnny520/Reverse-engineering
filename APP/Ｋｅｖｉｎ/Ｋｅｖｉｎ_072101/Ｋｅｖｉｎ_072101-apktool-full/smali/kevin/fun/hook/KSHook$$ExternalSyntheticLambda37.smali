.class public final synthetic Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/KSHook;

.field public final f$1:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

.field public final f$2:I

.field public final f$3:I

.field public final f$4:J


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/KSHook;Lkevin/fun/hook/KSHook$DownloadDialogHolder;IIJ)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;->f$0:Lkevin/fun/hook/KSHook;

    iput-object p2, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;->f$1:Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    iput p3, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;->f$2:I

    iput p4, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;->f$3:I

    iput-wide p5, p0, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;->f$4:J

    invoke-static {}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟۟۠()I

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
    const-string v0, "eiopXAsoU"

    invoke-static {v0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣ۟ۢۥ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟ۢۦۦۨ(Ljava/lang/Object;Ljava/lang/Object;IIJ)V
    .locals 6

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/KSHook;

    move-object v1, p1

    check-cast v1, Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    move v2, p2

    move v3, p3

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/KSHook;->lambda$32$kevin-fun-hook-KSHook(Lkevin/fun/hook/KSHook$DownloadDialogHolder;IIJ)V

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
.method public final run()V
    .locals 9

    const/4 v6, 0x0

    const/4 v8, 0x0

    const-wide/16 v4, 0x0

    const-string v7, "\u06df\u06df\u06e3"

    move-object v0, v6

    move-object v1, v6

    move v2, v8

    move v3, v8

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۦۦۦ(Ljava/lang/Object;)I

    move-result v3

    const-string v6, "\u06e0\u06e8\u06df"

    move-object v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۥۨۡ(Ljava/lang/Object;)Lkevin/fun/hook/KSHook$DownloadDialogHolder;

    move-result-object v1

    const-string v6, "\u06e5\u06e2\u06df"

    move-object v7, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۤۨۤ۟(Ljava/lang/Object;)I

    move-result v2

    const-string v6, "\u06df\u06e3\u06e1"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۧۤۧ۟(Ljava/lang/Object;)Lkevin/fun/hook/KSHook;

    move-result-object v0

    const-string v6, "\u06e1\u06df\u06e0"

    move-object v7, v6

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۠۠ۥۥ(Ljava/lang/Object;)J

    move-result-wide v4

    const-string v6, "\u06e8\u06e3\u06df"

    move-object v7, v6

    goto :goto_0

    :sswitch_4
    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/KSHook$$ExternalSyntheticLambda37;->۟ۢۦۦۨ(Ljava/lang/Object;Ljava/lang/Object;IIJ)V

    const-string v6, "\u06e0\u06e7\u06e7"

    move-object v7, v6

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa703 -> :sswitch_2
        0x1aabc0 -> :sswitch_5
        0x1aabd7 -> :sswitch_3
        0x1aae82 -> :sswitch_0
        0x1abde2 -> :sswitch_1
        0x1ac944 -> :sswitch_4
    .end sparse-switch
.end method
