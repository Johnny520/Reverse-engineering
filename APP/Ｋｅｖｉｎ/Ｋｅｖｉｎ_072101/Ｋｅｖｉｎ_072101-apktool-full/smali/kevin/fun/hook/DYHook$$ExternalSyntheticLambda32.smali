.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Ljava/util/Set;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Ljava/util/List;

.field public final f$4:Ljava/lang/ref/WeakReference;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Ljava/util/Set;Landroid/content/Context;Ljava/util/List;Ljava/lang/ref/WeakReference;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;->f$1:Ljava/util/Set;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;->f$3:Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;->f$4:Ljava/lang/ref/WeakReference;

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "9rBE"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۠ۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

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

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, Ljava/util/Set;

    move-object v2, p2

    check-cast v2, Landroid/content/Context;

    move-object v3, p3

    check-cast v3, Ljava/util/List;

    move-object v4, p4

    check-cast v4, Ljava/lang/ref/WeakReference;

    move-object v5, p5

    check-cast v5, Landroid/view/View;

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/DYHook;->lambda$82$kevin-fun-hook-DYHook(Ljava/util/Set;Landroid/content/Context;Ljava/util/List;Ljava/lang/ref/WeakReference;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "rYEyYTA4mZ"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

    nop

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
    .locals 7

    const/4 v5, 0x0

    const-string v6, "\u06e4\u06e5"

    move-object v1, v5

    move-object v3, v5

    move-object v0, v5

    move-object v2, v5

    move-object v4, v5

    :goto_0
    invoke-static {v6}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v5

    sparse-switch v5, :sswitch_data_0

    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۢۨۥۥ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v5, "\u06e1\u06e3\u06e2"

    move-object v6, v5

    goto :goto_0

    :sswitch_0
    move-object v5, p1

    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda32;->ۣ۠ۡۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v5, "\u06e7\u06e5\u06e6"

    move-object v6, v5

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۧۧۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v5, "\u06e1\u06e2\u06e4"

    move-object v6, v5

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۡ۠ۥۧ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const-string v5, "\u06e8\u06e3\u06e7"

    move-object v6, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۥۢۨۦ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v4

    const-string v5, "\u06e0\u06e7\u06e5"

    move-object v6, v5

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۧۧۥۡ(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v1

    const-string v5, "\u06e3\u06e8\u06e2"

    move-object v6, v5

    goto :goto_0

    :sswitch_5
    return-void

    :sswitch_data_0
    .sparse-switch
        0x1aabbe -> :sswitch_0
        0x1aaee3 -> :sswitch_3
        0x1aaf00 -> :sswitch_4
        0x1ab71d -> :sswitch_2
        0x1ac5c8 -> :sswitch_5
        0x1ac94c -> :sswitch_1
    .end sparse-switch
.end method
