.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Ljava/util/List;

.field public final f$1:Ljava/util/List;

.field public final f$10:[Ljava/lang/Runnable;

.field public final f$2:I

.field public final f$3:Ljava/util/List;

.field public final f$4:[I

.field public final f$5:Ljava/util/Map;

.field public final f$6:[I

.field public final f$7:[Ljava/util/List;

.field public final f$8:[Z

.field public final f$9:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/List;Ljava/util/List;ILjava/util/List;[ILjava/util/Map;[I[Ljava/util/List;[ZLandroid/widget/TextView;[Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$0:Ljava/util/List;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$1:Ljava/util/List;

    iput p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$2:I

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$3:Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$4:[I

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$5:Ljava/util/Map;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$6:[I

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$7:[Ljava/util/List;

    iput-object p9, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$8:[Z

    iput-object p10, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$9:Landroid/widget/TextView;

    iput-object p11, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->f$10:[Ljava/lang/Runnable;

    invoke-static {}, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۧۢ۟ۥ()I

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
    const-string v0, "vqZdNd7r1ogtapReanCdz9sPqW"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۤۡۧۨ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۡۡۢۦ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 12

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
    move-object v0, p0

    check-cast v0, Ljava/util/List;

    move-object v1, p1

    check-cast v1, Ljava/util/List;

    move-object v3, p3

    check-cast v3, Ljava/util/List;

    move-object/from16 v4, p4

    check-cast v4, [I

    move-object/from16 v5, p5

    check-cast v5, Ljava/util/Map;

    move-object/from16 v6, p6

    check-cast v6, [I

    move-object/from16 v7, p7

    check-cast v7, [Ljava/util/List;

    move-object/from16 v8, p8

    check-cast v8, [Z

    move-object/from16 v9, p9

    check-cast v9, Landroid/widget/TextView;

    move-object/from16 v10, p10

    check-cast v10, [Ljava/lang/Runnable;

    move-object/from16 v11, p11

    check-cast v11, Landroid/view/View;

    move v2, p2

    invoke-static/range {v0 .. v11}, Lkevin/fun/hook/DYHook;->lambda$52(Ljava/util/List;Ljava/util/List;ILjava/util/List;[ILjava/util/Map;[I[Ljava/util/List;[ZLandroid/widget/TextView;[Ljava/lang/Runnable;Landroid/view/View;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-gtz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "kM9bH7Ngo"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

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
.method public final onClick(Landroid/view/View;)V
    .locals 12

    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۥ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->۟ۢۨ۟ۢ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {p0}, Landroidx/core/ktx/۟۟ۡۢ۠;->ۨۡۦۤ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢۧ۠(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->ۨۦۧۤ(Ljava/lang/Object;)[I

    move-result-object v4

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟۟ۧۤۤ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨ۠ۦۦ(Ljava/lang/Object;)[I

    move-result-object v6

    invoke-static {p0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۥۧۥ(Ljava/lang/Object;)[Ljava/util/List;

    move-result-object v7

    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۦۧۥ۟(Ljava/lang/Object;)[Z

    move-result-object v8

    invoke-static {p0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۡۢ۠(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v9

    invoke-static {p0}, Landroidx/customview/ۡۤۡۤ;->۟ۡ۠ۦۡ(Ljava/lang/Object;)[Ljava/lang/Runnable;

    move-result-object v10

    move-object v11, p1

    invoke-static/range {v0 .. v11}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda24;->ۡۡۢۦ(Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->ۡ۟ۨۨ()I

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
    const-string v0, "KE72m5SdzaqZOiMhxEj"

    invoke-static {v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۧۦۦۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method
