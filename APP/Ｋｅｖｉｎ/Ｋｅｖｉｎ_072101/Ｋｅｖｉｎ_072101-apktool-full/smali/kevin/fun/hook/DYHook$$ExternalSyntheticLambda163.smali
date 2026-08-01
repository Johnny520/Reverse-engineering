.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Ljava/util/List;

.field public final f$1:I

.field public final f$2:Ljava/util/List;

.field public final f$3:[I

.field public final f$4:Landroid/widget/HorizontalScrollView;

.field public final f$5:Landroid/view/View;

.field public final f$6:Landroid/content/Context;

.field public final f$7:Landroid/widget/LinearLayout;

.field public final f$8:Ljava/lang/String;

.field public final f$9:Landroid/widget/ScrollView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;ILjava/util/List;[ILandroid/widget/HorizontalScrollView;Landroid/view/View;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/lang/String;Landroid/widget/ScrollView;)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$0:Ljava/util/List;

    iput p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$1:I

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$2:Ljava/util/List;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$3:[I

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$4:Landroid/widget/HorizontalScrollView;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$5:Landroid/view/View;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$6:Landroid/content/Context;

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$7:Landroid/widget/LinearLayout;

    iput-object p9, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$8:Ljava/lang/String;

    iput-object p10, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->f$9:Landroid/widget/ScrollView;

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

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
    const-string v0, "jquNJ4j1zX"

    invoke-static {v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۨۢۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۧۦۣ۠(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 11

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۥۢۦ()I

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

    check-cast v0, Ljava/util/List;

    move-object v2, p2

    check-cast v2, Ljava/util/List;

    move-object v3, p3

    check-cast v3, [I

    move-object v4, p4

    check-cast v4, Landroid/widget/HorizontalScrollView;

    move-object/from16 v5, p5

    check-cast v5, Landroid/view/View;

    move-object/from16 v6, p6

    check-cast v6, Landroid/content/Context;

    move-object/from16 v7, p7

    check-cast v7, Landroid/widget/LinearLayout;

    move-object/from16 v8, p8

    check-cast v8, Ljava/lang/String;

    move-object/from16 v9, p9

    check-cast v9, Landroid/widget/ScrollView;

    move-object/from16 v10, p10

    check-cast v10, Landroid/view/View;

    move v1, p1

    invoke-static/range {v0 .. v10}, Lkevin/fun/hook/DYHook;->lambda$91(Ljava/util/List;ILjava/util/List;[ILandroid/widget/HorizontalScrollView;Landroid/view/View;Landroid/content/Context;Landroid/widget/LinearLayout;Ljava/lang/String;Landroid/widget/ScrollView;Landroid/view/View;)V

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
    .locals 12

    const/4 v10, 0x0

    const/4 v1, 0x0

    const-string v11, "\u06e3\u06e6\u06e7"

    move-object v3, v10

    move-object v8, v10

    move-object v9, v10

    move-object v4, v10

    move-object v5, v10

    move-object v2, v10

    move-object v7, v10

    move-object v6, v10

    move-object v0, v10

    :goto_0
    invoke-static {v11}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v10

    sparse-switch v10, :sswitch_data_0

    invoke-static {p0}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۟ۧۡ۟ۥ(Ljava/lang/Object;)[I

    move-result-object v3

    const-string v10, "\u06e4\u06df\u06e7"

    move-object v11, v10

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣۢۢ۠(Ljava/lang/Object;)I

    move-result v1

    const-string v10, "\u06e6\u06e5\u06e7"

    move-object v11, v10

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۧۧۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v10, "\u06e2\u06e7\u06e0"

    move-object v11, v10

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۨۧۥۥ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v7

    const-string v10, "\u06e6\u06e2\u06e0"

    move-object v11, v10

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۧۧۧۤ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    const-string v10, "\u06e8\u06e8\u06e8"

    move-object v11, v10

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۣ۟ۥۣۢ(Ljava/lang/Object;)Landroid/widget/ScrollView;

    move-result-object v9

    const-string v10, "\u06e0\u06e5\u06e6"

    move-object v11, v10

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۣۤۦۡ(Ljava/lang/Object;)Landroid/widget/HorizontalScrollView;

    move-result-object v4

    const-string v10, "\u06e4\u06e7\u06e7"

    move-object v11, v10

    goto :goto_0

    :sswitch_6
    move-object v10, p1

    invoke-static/range {v0 .. v10}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda163;->ۧۦۣ۠(Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v10, "\u06e4\u06e0"

    move-object v11, v10

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/vectordrawable/ۢۤۡۤ;->ۥۢۧۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v10, "\u06e6\u06e6\u06e8"

    move-object v11, v10

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->۟ۡۤۨۤ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    const-string v10, "\u06df\u06e0\u06df"

    move-object v11, v10

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۧ۟ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v8

    const-string v10, "\u06e1\u06e4\u06e2"

    move-object v11, v10

    goto :goto_0

    :sswitch_a
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7c -> :sswitch_a
        0x1aa71e -> :sswitch_3
        0x1aab81 -> :sswitch_6
        0x1aaf1f -> :sswitch_4
        0x1ab6e4 -> :sswitch_7
        0x1ab9cc -> :sswitch_5
        0x1abac4 -> :sswitch_8
        0x1ac1a4 -> :sswitch_9
        0x1ac208 -> :sswitch_1
        0x1ac228 -> :sswitch_0
        0x1ac9e8 -> :sswitch_2
    .end sparse-switch
.end method
