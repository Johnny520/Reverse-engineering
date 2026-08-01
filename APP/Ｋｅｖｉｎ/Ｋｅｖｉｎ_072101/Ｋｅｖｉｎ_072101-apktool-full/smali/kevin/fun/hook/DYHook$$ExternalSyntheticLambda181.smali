.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda181;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Ljava/lang/String;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Ljava/lang/String;

.field public final f$4:[Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda181;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda181;->f$1:Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda181;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda181;->f$3:Ljava/lang/String;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda181;->f$4:[Ljava/lang/Runnable;

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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
    const-string v0, "KSrq98pk1kZuFHcHeKkVnb1"

    invoke-static {v0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۡۨ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۟ۥۣۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

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

    check-cast v1, Ljava/lang/String;

    move-object v2, p2

    check-cast v2, Landroid/content/Context;

    move-object v3, p3

    check-cast v3, Ljava/lang/String;

    move-object v4, p4

    check-cast v4, [Ljava/lang/Runnable;

    move-object v5, p5

    check-cast v5, Landroid/view/View;

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/DYHook;->lambda$5$kevin-fun-hook-DYHook(Ljava/lang/String;Landroid/content/Context;Ljava/lang/String;[Ljava/lang/Runnable;Landroid/view/View;)V

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
    .locals 7

    const/4 v5, 0x0

    const-string v6, "\u06e8\u06e3\u06e8"

    move-object v0, v5

    move-object v3, v5

    move-object v1, v5

    move-object v4, v5

    move-object v2, v5

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Landroidx/customview/ۤۡۥ;->۟ۥۥۦۡ(Ljava/lang/Object;)[Ljava/lang/Runnable;

    move-result-object v4

    const-string v5, "\u06df\u06e0\u06e7"

    move-object v6, v5

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۤۢۢ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v5, "\u06e3\u06e1\u06e1"

    move-object v6, v5

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۡۡۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e7\u06e7\u06e6"

    move-object v6, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/startup/۟ۦۤۨۧ;->۠ۥۧۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const-string v5, "\u06e6\u06e1\u06df"

    move-object v6, v5

    goto :goto_0

    :sswitch_4
    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda181;->۟ۥۣۢۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "\u06e2\u06e3\u06df"

    move-object v6, v5

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣۣ۟ۧ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "\u06e6\u06df\u06e5"

    move-object v6, v5

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0x1aa726 -> :sswitch_4
        0x1ab643 -> :sswitch_2
        0x1ac14c -> :sswitch_0
        0x1ac184 -> :sswitch_5
        0x1ac606 -> :sswitch_3
        0x1ac94d -> :sswitch_1
    .end sparse-switch
.end method
