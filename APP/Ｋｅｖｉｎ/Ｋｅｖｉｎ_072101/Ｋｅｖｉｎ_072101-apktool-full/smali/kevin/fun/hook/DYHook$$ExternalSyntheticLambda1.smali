.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/util/function/Consumer;


# instance fields
.field public final f$0:Ljava/util/List;

.field public final f$1:Ljava/util/Map;

.field public final f$10:Ljava/util/Map;

.field public final f$11:[I

.field public final f$12:[Ljava/util/List;

.field public final f$13:[Z

.field public final f$14:Landroid/widget/TextView;

.field public final f$15:[Ljava/lang/Runnable;

.field public final f$2:Ljava/util/List;

.field public final f$3:Ljava/util/List;

.field public final f$4:Landroid/widget/LinearLayout;

.field public final f$5:Ljava/util/List;

.field public final f$6:[I

.field public final f$7:Ljava/util/function/Function;

.field public final f$8:[I

.field public final f$9:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Landroid/widget/LinearLayout;Ljava/util/List;[ILjava/util/function/Function;[ILandroid/content/Context;Ljava/util/Map;[I[Ljava/util/List;[ZLandroid/widget/TextView;[Ljava/lang/Runnable;)V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$0:Ljava/util/List;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$1:Ljava/util/Map;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$2:Ljava/util/List;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$3:Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$4:Landroid/widget/LinearLayout;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$5:Ljava/util/List;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$6:[I

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$7:Ljava/util/function/Function;

    iput-object p9, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$8:[I

    iput-object p10, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$9:Landroid/content/Context;

    move-object/from16 v0, p11

    iput-object v0, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$10:Ljava/util/Map;

    move-object/from16 v0, p12

    iput-object v0, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$11:[I

    move-object/from16 v0, p13

    iput-object v0, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$12:[Ljava/util/List;

    move-object/from16 v0, p14

    iput-object v0, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$13:[Z

    move-object/from16 v0, p15

    iput-object v0, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$14:Landroid/widget/TextView;

    move-object/from16 v0, p16

    iput-object v0, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->f$15:[Ljava/lang/Runnable;

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v3, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v2, "frO16t"

    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۥۧۨ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v2

    sget-object v4, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v4, v2, v3}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۣ۟ۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 17

    invoke-static {}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->ۥۦۨ۠()I

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
    move-object/from16 v0, p0

    check-cast v0, Ljava/util/List;

    move-object/from16 v1, p1

    check-cast v1, Ljava/util/Map;

    move-object/from16 v2, p2

    check-cast v2, Ljava/util/List;

    move-object/from16 v3, p3

    check-cast v3, Ljava/util/List;

    move-object/from16 v4, p4

    check-cast v4, Landroid/widget/LinearLayout;

    move-object/from16 v5, p5

    check-cast v5, Ljava/util/List;

    move-object/from16 v6, p6

    check-cast v6, [I

    move-object/from16 v7, p7

    check-cast v7, Ljava/util/function/Function;

    move-object/from16 v8, p8

    check-cast v8, [I

    move-object/from16 v9, p9

    check-cast v9, Landroid/content/Context;

    move-object/from16 v10, p10

    check-cast v10, Ljava/util/Map;

    move-object/from16 v11, p11

    check-cast v11, [I

    move-object/from16 v12, p12

    check-cast v12, [Ljava/util/List;

    move-object/from16 v13, p13

    check-cast v13, [Z

    move-object/from16 v14, p14

    check-cast v14, Landroid/widget/TextView;

    move-object/from16 v15, p15

    check-cast v15, [Ljava/lang/Runnable;

    move-object/from16 v16, p16

    check-cast v16, Ljava/lang/Boolean;

    invoke-static/range {v0 .. v16}, Lkevin/fun/hook/DYHook;->lambda$49(Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Landroid/widget/LinearLayout;Ljava/util/List;[ILjava/util/function/Function;[ILandroid/content/Context;Ljava/util/Map;[I[Ljava/util/List;[ZLandroid/widget/TextView;[Ljava/lang/Runnable;Ljava/lang/Boolean;)V

    :sswitch_3
    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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
    const-string v0, "b7ijx9QI3Rq5cFimvNjWQhdFzNU"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->parseDouble(Ljava/lang/String;)D

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(D)V

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
.method public final accept(Ljava/lang/Object;)V
    .locals 17

    invoke-static/range {p0 .. p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۧ۠ۡۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static/range {p0 .. p0}, Landroidx/core/ۧ۟ۤۨ;->۟ۥۥۢۥ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static/range {p0 .. p0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->ۥۨۦۡ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۦۡ۠۟(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Landroidx/activity/ۨ۠۟ۧ;->ۣ۟۠ۥۦ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-static/range {p0 .. p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۦۧ۠ۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    invoke-static/range {p0 .. p0}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧۡۨۨ(Ljava/lang/Object;)[I

    move-result-object v6

    invoke-static/range {p0 .. p0}, Landroidx/loader/ۣۦ۟ۡ;->ۣ۟ۡۡ۠(Ljava/lang/Object;)Ljava/util/function/Function;

    move-result-object v7

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۨ۟ۢ(Ljava/lang/Object;)[I

    move-result-object v8

    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۥۦۡ۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v9

    invoke-static/range {p0 .. p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۠ۧ۟۠(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v10

    invoke-static/range {p0 .. p0}, Landroidx/customview/ۤۡۥ;->ۦۤۤۤ(Ljava/lang/Object;)[I

    move-result-object v11

    invoke-static/range {p0 .. p0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟۟ۧۦۧ(Ljava/lang/Object;)[Ljava/util/List;

    move-result-object v12

    invoke-static/range {p0 .. p0}, Landroidx/activity/ۨ۠۟ۧ;->ۦۡۥۢ(Ljava/lang/Object;)[Z

    move-result-object v13

    invoke-static/range {p0 .. p0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۥۥۥ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v14

    invoke-static/range {p0 .. p0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۤۧۦۥ(Ljava/lang/Object;)[Ljava/lang/Runnable;

    move-result-object v15

    move-object/from16 v16, p1

    check-cast v16, Ljava/lang/Boolean;

    invoke-static/range {v0 .. v16}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda1;->ۣ۟ۡۡ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Landroidx/documentfile/ۡۢ۟ۥ;->۟۟ۧۢۡ()I

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
    const-string v0, "rB0LPtx6oq48UYBSStKnUTWq"

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۣۣۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

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
