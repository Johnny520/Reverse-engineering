.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda68;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/DYHook$Consumer;


# instance fields
.field public final f$0:[I

.field public final f$1:Lkevin/fun/hook/DYHook$Consumer;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>([ILkevin/fun/hook/DYHook$Consumer;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda68;->f$0:[I

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda68;->f$1:Lkevin/fun/hook/DYHook$Consumer;

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
    const-string v0, "hfBe51ZAE97XsD6wqhDLCBvzsF"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۟ۧ۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/loader/ۥۧۨۤ;->ۣۡۧۨ()I

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
    check-cast p0, [I

    check-cast p1, Lkevin/fun/hook/DYHook$Consumer;

    check-cast p2, Ljava/lang/Integer;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->lambda$194([ILkevin/fun/hook/DYHook$Consumer;Ljava/lang/Integer;)V

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
.method public final accept(Ljava/lang/Object;)V
    .locals 5

    const/4 v1, 0x0

    const-string v4, "\u06df\u06e3\u06e4"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    return-void

    :sswitch_0
    move-object v0, p1

    check-cast v0, Ljava/lang/Integer;

    const-string v1, "\u06df\u06e6"

    move-object v4, v1

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->ۧۦۤ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook$Consumer;

    move-result-object v1

    const-string v4, "\u06e8\u06e1\u06e1"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    invoke-static {v3, v2, v0}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda68;->۟ۧ۠ۥۣ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v1, "\u06e0\u06e5\u06e0"

    move-object v4, v1

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟ۤۡۡ(Ljava/lang/Object;)[I

    move-result-object v1

    const-string v4, "\u06e4\u06e1\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdbe7 -> :sswitch_2
        0x1aa780 -> :sswitch_3
        0x1aba09 -> :sswitch_1
        0x1ac908 -> :sswitch_0
    .end sparse-switch
.end method
