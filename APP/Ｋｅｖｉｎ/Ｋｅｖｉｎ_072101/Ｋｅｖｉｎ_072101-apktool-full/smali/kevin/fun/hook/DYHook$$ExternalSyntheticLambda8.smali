.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Ljava/util/Map;

.field public final f$10:Landroid/app/Dialog;

.field public final f$11:Ljava/lang/Runnable;

.field public final f$2:Landroid/content/Context;

.field public final f$3:Ljava/util/List;

.field public final f$4:[I

.field public final f$5:Ljava/util/Map;

.field public final f$6:Landroid/widget/EditText;

.field public final f$7:Ljava/util/List;

.field public final f$8:Ljava/util/function/Consumer;

.field public final f$9:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Ljava/util/Map;Landroid/content/Context;Ljava/util/List;[ILjava/util/Map;Landroid/widget/EditText;Ljava/util/List;Ljava/util/function/Consumer;Landroid/widget/TextView;Landroid/app/Dialog;Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$1:Ljava/util/Map;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$2:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$3:Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$4:[I

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$5:Ljava/util/Map;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$6:Landroid/widget/EditText;

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$7:Ljava/util/List;

    iput-object p9, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$8:Ljava/util/function/Consumer;

    iput-object p10, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$9:Landroid/widget/TextView;

    iput-object p11, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$10:Landroid/app/Dialog;

    iput-object p12, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->f$11:Ljava/lang/Runnable;

    invoke-static {}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۨۤۧۢ()I

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
    const-string v0, "ENMUlUmbRPSef7ApqT6Zfnso1"

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

.method public static ۡۤۨۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 13

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۡۨۡ()I

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

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, Ljava/util/Map;

    move-object v2, p2

    check-cast v2, Landroid/content/Context;

    move-object/from16 v3, p3

    check-cast v3, Ljava/util/List;

    move-object/from16 v4, p4

    check-cast v4, [I

    move-object/from16 v5, p5

    check-cast v5, Ljava/util/Map;

    move-object/from16 v6, p6

    check-cast v6, Landroid/widget/EditText;

    move-object/from16 v7, p7

    check-cast v7, Ljava/util/List;

    move-object/from16 v8, p8

    check-cast v8, Ljava/util/function/Consumer;

    move-object/from16 v9, p9

    check-cast v9, Landroid/widget/TextView;

    move-object/from16 v10, p10

    check-cast v10, Landroid/app/Dialog;

    move-object/from16 v11, p11

    check-cast v11, Ljava/lang/Runnable;

    move-object/from16 v12, p12

    check-cast v12, Landroid/view/View;

    invoke-virtual/range {v0 .. v12}, Lkevin/fun/hook/DYHook;->lambda$61$kevin-fun-hook-DYHook(Ljava/util/Map;Landroid/content/Context;Ljava/util/List;[ILjava/util/Map;Landroid/widget/EditText;Ljava/util/List;Ljava/util/function/Consumer;Landroid/widget/TextView;Landroid/app/Dialog;Ljava/lang/Runnable;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

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
    const-string v0, "ybLankx0VRbv7"

    invoke-static {v0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۣ۟ۤۧۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->valueOf(Ljava/lang/String;)Ljava/lang/Long;

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
    .locals 14

    const/4 v12, 0x0

    const-string v13, "\u06e3\u06e1\u06e2"

    move-object v7, v12

    move-object v8, v12

    move-object v3, v12

    move-object v10, v12

    move-object v4, v12

    move-object v0, v12

    move-object v2, v12

    move-object v9, v12

    move-object v5, v12

    move-object v11, v12

    move-object v1, v12

    move-object v6, v12

    :goto_0
    invoke-static {v13}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    invoke-static {p0}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۧ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    const-string v12, "\u06e1\u06e5\u06e3"

    move-object v13, v12

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->۟ۢ۟۠ۢ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const-string v12, "\u06e2\u06e4\u06e3"

    move-object v13, v12

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۦ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const-string v12, "\u06e3\u06e0\u06e7"

    move-object v13, v12

    goto :goto_0

    :sswitch_2
    move-object v12, p1

    invoke-static/range {v0 .. v12}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda8;->ۡۤۨۥ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v12, "\u06e6\u06e8\u06e7"

    move-object v13, v12

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۨۤ۠(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v6

    const-string v12, "\u06e7\u06e1"

    move-object v13, v12

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۥۣۧ۟(Ljava/lang/Object;)[I

    move-result-object v4

    const-string v12, "\u06e2\u06e4\u06df"

    move-object v13, v12

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۣۡۥۢ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v10

    const-string v12, "\u06e8\u06e1"

    move-object v13, v12

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->ۦۦۣۢ(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v11

    const-string v12, "\u06e0\u06e3\u06e0"

    move-object v13, v12

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۥۤۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    const-string v12, "\u06e1\u06e4\u06e4"

    move-object v13, v12

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟۠ۦ۟ۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v12, "\u06e5\u06e0\u06e7"

    move-object v13, v12

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧ۠ۢ(Ljava/lang/Object;)Ljava/util/function/Consumer;

    move-result-object v8

    const-string v12, "\u06e4\u06e0\u06e1"

    move-object v13, v12

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥ۟ۦۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v12, "\u06e2\u06e7\u06df"

    move-object v13, v12

    goto :goto_0

    :sswitch_b
    invoke-static {p0}, Landroidx/vectordrawable/۟ۧۢۧۨ;->۟ۤۥۡ۟(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v9

    const-string v12, "\u06e6\u06e4\u06e0"

    move-object v13, v12

    goto :goto_0

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcda -> :sswitch_7
        0xdcf9 -> :sswitch_6
        0x1aab3d -> :sswitch_2
        0x1aaf21 -> :sswitch_9
        0x1aaf3f -> :sswitch_0
        0x1ab2dd -> :sswitch_1
        0x1ab2e1 -> :sswitch_8
        0x1ab62a -> :sswitch_3
        0x1ab644 -> :sswitch_a
        0x1ab9e5 -> :sswitch_b
        0x1abdac -> :sswitch_4
        0x1ac1e2 -> :sswitch_5
        0x1ac265 -> :sswitch_c
    .end sparse-switch
.end method
