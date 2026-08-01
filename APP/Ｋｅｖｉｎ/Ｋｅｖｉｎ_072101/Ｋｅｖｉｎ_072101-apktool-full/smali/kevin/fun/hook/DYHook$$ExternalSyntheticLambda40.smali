.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Landroid/widget/LinearLayout;

.field public final f$2:Ljava/util/List;

.field public final f$3:Landroid/content/Context;

.field public final f$4:[Ljava/lang/Runnable;

.field public final f$5:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Landroid/widget/LinearLayout;Ljava/util/List;Landroid/content/Context;[Ljava/lang/Runnable;Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;->f$1:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;->f$2:Ljava/util/List;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;->f$3:Landroid/content/Context;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;->f$4:[Ljava/lang/Runnable;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;->f$5:Landroid/widget/TextView;

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

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
    const-string v0, "2QVpaMLv54DdrXYo"

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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

.method public static ۟ۥۨ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

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
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, Landroid/widget/LinearLayout;

    move-object v2, p2

    check-cast v2, Ljava/util/List;

    move-object v3, p3

    check-cast v3, Landroid/content/Context;

    move-object v4, p4

    check-cast v4, [Ljava/lang/Runnable;

    move-object v5, p5

    check-cast v5, Landroid/widget/TextView;

    invoke-virtual/range {v0 .. v5}, Lkevin/fun/hook/DYHook;->lambda$4$kevin-fun-hook-DYHook(Landroid/widget/LinearLayout;Ljava/util/List;Landroid/content/Context;[Ljava/lang/Runnable;Landroid/widget/TextView;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۡۦ()I

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
    const-string v0, "wJOjlEyyCgSRAlO"

    invoke-static {v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۨۢۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

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
.method public final run()V
    .locals 8

    const/4 v6, 0x0

    const-string v7, "\u06e8\u06e8\u06e7"

    move-object v2, v6

    move-object v0, v6

    move-object v1, v6

    move-object v3, v6

    move-object v5, v6

    move-object v4, v6

    :goto_0
    invoke-static {v7}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v6

    sparse-switch v6, :sswitch_data_0

    invoke-static {p0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣۡۤۢ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v1

    const-string v6, "\u06e5\u06df\u06e8"

    move-object v7, v6

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣ۠۟ۢ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v6, "\u06df\u06e8\u06e8"

    move-object v7, v6

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/viewpager/ۣۢ۟ۤ;->ۣ۟ۡۤۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const-string v6, "\u06df\u06df\u06df"

    move-object v7, v6

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/loader/ۡۢۢ;->ۢۧ۠۠(Ljava/lang/Object;)[Ljava/lang/Runnable;

    move-result-object v4

    const-string v6, "\u06e0\u06e2\u06e5"

    move-object v7, v6

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۧۢۨۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v5

    const-string v6, "\u06e7\u06e3\u06e3"

    move-object v7, v6

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->ۢ۠ۥ۟(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v6, "\u06df\u06e8\u06e3"

    move-object v7, v6

    goto :goto_0

    :sswitch_5
    invoke-static/range {v0 .. v5}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda40;->۟ۥۨ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v6, "\u06e5\u06e1"

    move-object v7, v6

    goto :goto_0

    :sswitch_6
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc9c -> :sswitch_6
        0x1aa6ff -> :sswitch_2
        0x1aa81f -> :sswitch_1
        0x1aab23 -> :sswitch_3
        0x1abd8e -> :sswitch_0
        0x1ac587 -> :sswitch_5
        0x1ac9e7 -> :sswitch_4
    .end sparse-switch
.end method
