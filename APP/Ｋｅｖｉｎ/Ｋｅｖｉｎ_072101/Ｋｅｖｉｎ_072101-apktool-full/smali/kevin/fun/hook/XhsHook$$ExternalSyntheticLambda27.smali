.class public final synthetic Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/XhsHook;

.field public final f$1:Z

.field public final f$2:Ljava/lang/String;

.field public final f$3:Landroid/content/Context;

.field public final f$4:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/XhsHook;ZLjava/lang/String;Landroid/content/Context;Ljava/lang/String;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;->f$0:Lkevin/fun/hook/XhsHook;

    iput-boolean p2, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;->f$1:Z

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;->f$2:Ljava/lang/String;

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;->f$4:Ljava/lang/String;

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "2L9aGm7HIhCNPJuMh5k82chKxHn1"

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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

.method public static ۠۟ۥ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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

    check-cast v0, Lkevin/fun/hook/XhsHook;

    move-object v2, p2

    check-cast v2, Ljava/lang/String;

    move-object v3, p3

    check-cast v3, Landroid/content/Context;

    move-object v4, p4

    check-cast v4, Ljava/lang/String;

    move-object v5, p5

    check-cast v5, Landroid/view/View;

    move v1, p1

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/XhsHook;->lambda$9$kevin-fun-hook-XhsHook(ZLjava/lang/String;Landroid/content/Context;Ljava/lang/String;Landroid/view/View;)V

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

    const/4 v1, 0x0

    const-string v6, "\u06e7\u06e2\u06df"

    move-object v2, v5

    move-object v0, v5

    move-object v3, v5

    move-object v4, v5

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣۢ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const-string v5, "\u06e5\u06e7"

    move-object v6, v5

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/startup/۟ۦۤۨۧ;->ۣۧ۟ۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const-string v5, "\u06e4\u06e2\u06e5"

    move-object v6, v5

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟ۦۣۨ(Ljava/lang/Object;)Z

    move-result v1

    const-string v5, "\u06e1\u06df\u06e6"

    move-object v6, v5

    goto :goto_0

    :sswitch_2
    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/XhsHook$$ExternalSyntheticLambda27;->۠۟ۥ(Ljava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "\u06e4\u06e4\u06df"

    move-object v6, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->ۣ۟۟ۢۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "\u06e2\u06df\u06df"

    move-object v6, v5

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۦ۠ۦۦ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v5, "\u06e5\u06e7\u06e1"

    move-object v6, v5

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdca2 -> :sswitch_0
        0x1ab242 -> :sswitch_2
        0x1aba27 -> :sswitch_3
        0x1aba5f -> :sswitch_5
        0x1abe7f -> :sswitch_1
        0x1ac564 -> :sswitch_4
    .end sparse-switch
.end method
