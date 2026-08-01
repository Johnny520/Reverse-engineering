.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda13;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Z

.field public final f$2:Ljava/lang/String;

.field public final f$3:Landroid/content/Context;

.field public final f$4:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;ZLjava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda13;->f$0:Lkevin/fun/hook/DYHook;

    iput-boolean p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda13;->f$1:Z

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda13;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda13;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda13;->f$4:Ljava/lang/String;

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "MgeVKw6g"

    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۦۥۨۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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

.method public static ۦۡۥۣ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Lkevin/fun/hook/۟ۥ۠۠;->ۥ۠۠ۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p2, Ljava/lang/String;

    check-cast p3, Landroid/content/Context;

    check-cast p4, Ljava/lang/String;

    invoke-virtual {p0, p1, p2, p3, p4}, Lkevin/fun/hook/DYHook;->lambda$71$kevin-fun-hook-DYHook(ZLjava/lang/String;Landroid/content/Context;Ljava/lang/String;)V

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
.method public final run()V
    .locals 7

    const/4 v1, 0x0

    const/4 v6, 0x0

    const-string v5, "\u06e2\u06df\u06e3"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move-object v4, v1

    :goto_0
    invoke-static {v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۤۧۢ۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const-string v5, "\u06e0\u06e0\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣ۟ۧۧ۠(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e0\u06e5\u06e0"

    move-object v2, v1

    goto :goto_0

    :sswitch_1
    invoke-static {v0, v6, v2, v4, v3}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda13;->ۦۡۥۣ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06df\u06e5\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۥۧ۟ۤ(Ljava/lang/Object;)Z

    move-result v6

    const-string v1, "\u06e3\u06e4\u06df"

    move-object v5, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/customview/ۤۡۥ;->۟ۦۨۢ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v5, "\u06e6\u06e1\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۡۤۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v1, "\u06e4\u06e8\u06e6"

    move-object v5, v1

    goto :goto_0

    :sswitch_5
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aa7b9 -> :sswitch_5
        0x1aaae0 -> :sswitch_3
        0x1ab246 -> :sswitch_4
        0x1ab69e -> :sswitch_0
        0x1abae2 -> :sswitch_2
        0x1ac18d -> :sswitch_1
    .end sparse-switch
.end method
