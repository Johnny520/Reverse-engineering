.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Z

.field public final f$2:Ljava/lang/String;

.field public final f$3:Landroid/content/Context;

.field public final f$4:Ljava/lang/String;

.field public final f$5:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;ZLjava/lang/String;Landroid/content/Context;Ljava/lang/String;I)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;->f$0:Lkevin/fun/hook/XhsHook;

    iput-boolean p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;->f$1:Z

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;->f$4:Ljava/lang/String;

    iput p6, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;->f$5:I

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
    const-string v0, "26Ezo"

    invoke-static {v0}, Landroidx/activity/ۦۧۥۥ;->ۧۧ۠ۤ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۡ۟ۧۨ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V
    .locals 7

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/XhsHook;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Landroid/content/Context;

    move-object v4, p4

    check-cast v4, Ljava/lang/String;

    move-object v6, p6

    check-cast v6, Landroid/view/View;

    move v1, p1

    move v5, p5

    invoke-virtual/range {v0 .. v6}, Lkevin/fun/hook/XhsHook;->lambda$6$kevin-fun-hook-XhsHook(ZLjava/lang/String;Landroid/content/Context;Ljava/lang/String;ILandroid/view/View;)V

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
.method public final onClick(Landroid/view/View;)V
    .locals 9

    const/4 v8, 0x0

    const/4 v6, 0x0

    const-string v7, "\u06e7\u06e8\u06e2"

    move-object v0, v6

    move-object v2, v6

    move-object v3, v6

    move-object v4, v6

    move v1, v8

    move v5, v8

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۥۥ۠ۨ(Ljava/lang/Object;)I

    move-result v5

    const-string v6, "\u06e4\u06df\u06e0"

    move-object v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/loader/ۣۦ۟ۡ;->ۦۡۤ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v6, "\u06e5\u06e6\u06e8"

    move-object v7, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->۠ۤ۠ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v6, "\u06e8\u06e0\u06e7"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->۟ۤ۟ۤۤ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v6, "\u06e1\u06e3\u06e3"

    move-object v7, v6

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۡۧ(Ljava/lang/Object;)Z

    move-result v1

    const-string v6, "\u06e3\u06e5\u06e2"

    move-object v7, v6

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡۥ۟ۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const-string v6, "\u06e5\u06e8\u06e3"

    move-object v7, v6

    goto :goto_0

    :sswitch_5
    move-object v6, p1

    invoke-static/range {v0 .. v6}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda24;->ۡ۟ۧۨ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;)V

    const-string v6, "\u06e1\u06e8\u06e6"

    move-object v7, v6

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aaf01 -> :sswitch_3
        0x1aaf9f -> :sswitch_6
        0x1ab6c0 -> :sswitch_0
        0x1ab9c5 -> :sswitch_5
        0x1abe67 -> :sswitch_4
        0x1abea0 -> :sswitch_1
        0x1ac621 -> :sswitch_2
    .end sparse-switch
.end method
