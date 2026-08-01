.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda110;
.super Ljava/lang/Object;

# interfaces
.implements Lkevin/fun/hook/DYHook$Consumer;


# instance fields
.field public final f$0:[Z

.field public final f$1:I

.field public final f$2:Ljava/lang/Runnable;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>([ZILjava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda110;->f$0:[Z

    iput p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda110;->f$1:I

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda110;->f$2:Ljava/lang/Runnable;

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "GdQQ2JOOTvjwNQY1reZTo42Elw"

    invoke-static {v0}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟ۥ۟ۨ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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

.method public static ۠ۥۣۡ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

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
    check-cast p0, [Z

    check-cast p2, Ljava/lang/Runnable;

    check-cast p3, Ljava/lang/Boolean;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/DYHook;->lambda$161([ZILjava/lang/Runnable;Ljava/lang/Boolean;)V

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
    .locals 6

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-string v4, "\u06e5\u06df\u06e0"

    move-object v1, v0

    move-object v2, v0

    move-object v3, v0

    :goto_0
    invoke-static {v4}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    invoke-static {p0}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦۢۧۥ(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v0

    const-string v4, "\u06e1\u06e4\u06e4"

    move-object v1, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v5, v1, v3}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda110;->۠ۥۣۡ(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;)V

    const-string v0, "\u06e7\u06df\u06e5"

    move-object v4, v0

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/startup/ۤۧۥۣ;->۟ۢۤۢ۟(Ljava/lang/Object;)I

    move-result v5

    const-string v0, "\u06e5\u06e2\u06e7"

    move-object v4, v0

    goto :goto_0

    :sswitch_2
    move-object v0, p1

    check-cast v0, Ljava/lang/Boolean;

    const-string v4, "\u06e1\u06e7\u06df"

    move-object v3, v0

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/loader/ۢۥ۟;->ۣۣ۟ۤۤ(Ljava/lang/Object;)[Z

    move-result-object v0

    const-string v4, "\u06e8\u06e4\u06df"

    move-object v2, v0

    goto :goto_0

    :sswitch_4
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aaf21 -> :sswitch_2
        0x1aaf79 -> :sswitch_0
        0x1abd86 -> :sswitch_3
        0x1ac50d -> :sswitch_4
        0x1ac963 -> :sswitch_1
    .end sparse-switch
.end method
