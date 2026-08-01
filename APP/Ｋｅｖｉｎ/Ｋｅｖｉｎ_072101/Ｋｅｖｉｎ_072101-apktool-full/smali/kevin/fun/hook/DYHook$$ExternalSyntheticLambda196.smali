.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final f$0:Landroid/widget/LinearLayout;

.field public final f$1:[Ljava/lang/String;

.field public final f$2:Ljava/util/List;

.field public final f$3:Ljava/util/List;

.field public final f$4:[I

.field public final f$5:Landroid/widget/HorizontalScrollView;

.field public final f$6:Landroid/content/Context;

.field public final f$7:Landroid/widget/LinearLayout;

.field public final f$8:Landroid/widget/ScrollView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/LinearLayout;[Ljava/lang/String;Ljava/util/List;Ljava/util/List;[ILandroid/widget/HorizontalScrollView;Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$0:Landroid/widget/LinearLayout;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$1:[Ljava/lang/String;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$2:Ljava/util/List;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$3:Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$4:[I

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$5:Landroid/widget/HorizontalScrollView;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$6:Landroid/content/Context;

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$7:Landroid/widget/LinearLayout;

    iput-object p9, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->f$8:Landroid/widget/ScrollView;

    invoke-static {}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۣۢۢۦ()I

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
    const-string v0, "TkDC8Joy2c3vvvG"

    invoke-static {v0}, Landroidx/activity/ۣۦۡۥ;->۟۟ۥۧۥ(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 9

    invoke-static {}, Landroidx/versionedparcelable/ۣ۠ۢۡ;->ۣۤۦۣ()I

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
    move-object v0, p0

    check-cast v0, Landroid/widget/LinearLayout;

    move-object v1, p1

    check-cast v1, [Ljava/lang/String;

    move-object v2, p2

    check-cast v2, Ljava/util/List;

    move-object v3, p3

    check-cast v3, Ljava/util/List;

    move-object v4, p4

    check-cast v4, [I

    move-object v5, p5

    check-cast v5, Landroid/widget/HorizontalScrollView;

    move-object v6, p6

    check-cast v6, Landroid/content/Context;

    move-object/from16 v7, p7

    check-cast v7, Landroid/widget/LinearLayout;

    move-object/from16 v8, p8

    check-cast v8, Landroid/widget/ScrollView;

    invoke-static/range {v0 .. v8}, Lkevin/fun/hook/DYHook;->lambda$90(Landroid/widget/LinearLayout;[Ljava/lang/String;Ljava/util/List;Ljava/util/List;[ILandroid/widget/HorizontalScrollView;Landroid/content/Context;Landroid/widget/LinearLayout;Landroid/widget/ScrollView;)V

    :sswitch_3
    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    const-string v0, "yrxiGfKVNmY6m1K14lZR7"

    invoke-static {v0}, Landroidx/activity/ۤۧۧۧ;->ۣۣۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

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
.method public final run()V
    .locals 11

    const/4 v9, 0x0

    const-string v10, "\u06e7\u06e5\u06e8"

    move-object v0, v9

    move-object v2, v9

    move-object v5, v9

    move-object v8, v9

    move-object v4, v9

    move-object v1, v9

    move-object v3, v9

    move-object v7, v9

    move-object v6, v9

    :goto_0
    invoke-static {v10}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v9

    sparse-switch v9, :sswitch_data_0

    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۤۢۡۨ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v0

    const-string v9, "\u06e5\u06df\u06e8"

    move-object v10, v9

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟۠ۥۥۤ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v7

    const-string v9, "\u06e1\u06df\u06e7"

    move-object v10, v9

    goto :goto_0

    :sswitch_1
    invoke-static/range {v0 .. v8}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda196;->ۣۤ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v9, "\u06e7\u06e3"

    move-object v10, v9

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۢۤۨۧ(Ljava/lang/Object;)Landroid/widget/ScrollView;

    move-result-object v8

    const-string v9, "\u06df\u06df\u06e8"

    move-object v10, v9

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۡۧۤ(Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v1

    const-string v9, "\u06df\u06e6\u06e5"

    move-object v10, v9

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۥۨۦۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const-string v9, "\u06e0\u06e1\u06e0"

    move-object v10, v9

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟۟ۢۧۦ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    const-string v9, "\u06e7\u06e8\u06e6"

    move-object v10, v9

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۣۣۨ۟(Ljava/lang/Object;)Landroid/widget/HorizontalScrollView;

    move-result-object v5

    const-string v9, "\u06e8\u06e5\u06e4"

    move-object v10, v9

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->۟۠ۤ۟ۨ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    const-string v9, "\u06e7\u06df\u06e2"

    move-object v10, v9

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢۢۥ(Ljava/lang/Object;)[I

    move-result-object v4

    const-string v9, "\u06e4\u06e4\u06e6"

    move-object v10, v9

    goto :goto_0

    :sswitch_9
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdcdc -> :sswitch_9
        0x1aa708 -> :sswitch_1
        0x1aa7de -> :sswitch_4
        0x1aaaff -> :sswitch_5
        0x1aae89 -> :sswitch_2
        0x1aba66 -> :sswitch_6
        0x1abd8e -> :sswitch_3
        0x1ac50a -> :sswitch_0
        0x1ac625 -> :sswitch_8
        0x1ac987 -> :sswitch_7
    .end sparse-switch
.end method
