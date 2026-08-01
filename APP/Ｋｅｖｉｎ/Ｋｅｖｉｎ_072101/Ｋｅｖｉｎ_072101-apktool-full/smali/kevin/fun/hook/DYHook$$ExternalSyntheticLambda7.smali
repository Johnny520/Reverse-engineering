.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Ljava/util/List;

.field public final f$2:[I

.field public final f$3:Ljava/util/Map;

.field public final f$4:Landroid/widget/EditText;

.field public final f$5:Ljava/util/Map;

.field public final f$6:Landroid/widget/TextView;

.field public final f$7:Ljava/lang/Runnable;

.field public final f$8:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Ljava/util/List;[ILjava/util/Map;Landroid/widget/EditText;Ljava/util/Map;Landroid/widget/TextView;Ljava/lang/Runnable;Landroid/widget/TextView;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$1:Ljava/util/List;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$2:[I

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$3:Ljava/util/Map;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$4:Landroid/widget/EditText;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$5:Ljava/util/Map;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$6:Landroid/widget/TextView;

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$7:Ljava/lang/Runnable;

    iput-object p9, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->f$8:Landroid/widget/TextView;

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "g0J889FSmvl2NVTFUspmrOsC5IbjT"

    invoke-static {v0}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۥۦ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method public static ۣۤ۠۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 10

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    move-object v0, p0

    check-cast v0, Lkevin/fun/hook/DYHook;

    move-object v1, p1

    check-cast v1, Ljava/util/List;

    move-object v2, p2

    check-cast v2, [I

    move-object v3, p3

    check-cast v3, Ljava/util/Map;

    move-object v4, p4

    check-cast v4, Landroid/widget/EditText;

    move-object v5, p5

    check-cast v5, Ljava/util/Map;

    move-object/from16 v6, p6

    check-cast v6, Landroid/widget/TextView;

    move-object/from16 v7, p7

    check-cast v7, Ljava/lang/Runnable;

    move-object/from16 v8, p8

    check-cast v8, Landroid/widget/TextView;

    move-object/from16 v9, p9

    check-cast v9, Landroid/view/View;

    invoke-virtual/range {v0 .. v9}, Lkevin/fun/hook/DYHook;->lambda$60$kevin-fun-hook-DYHook(Ljava/util/List;[ILjava/util/Map;Landroid/widget/EditText;Ljava/util/Map;Landroid/widget/TextView;Ljava/lang/Runnable;Landroid/widget/TextView;Landroid/view/View;)V

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
    .locals 11

    const/4 v9, 0x0

    const-string v10, "\u06e3\u06df\u06e1"

    move-object v7, v9

    move-object v2, v9

    move-object v0, v9

    move-object v4, v9

    move-object v5, v9

    move-object v8, v9

    move-object v1, v9

    move-object v6, v9

    move-object v3, v9

    :goto_0
    invoke-static {v10}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v9

    sparse-switch v9, :sswitch_data_0

    return-void

    :sswitch_0
    invoke-static {p0}, Landroidx/activity/ۦۧۥۥ;->ۣ۟ۤۡ۟(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v8

    const-string v9, "\u06e1\u06df\u06e4"

    move-object v10, v9

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->۟ۦۦۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v6

    const-string v9, "\u06e6\u06e7\u06e4"

    move-object v10, v9

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۣ۟ۡۥ(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v7

    const-string v9, "\u06e0\u06e6"

    move-object v10, v9

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۧۥۢۧ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    const-string v9, "\u06e4\u06e7\u06e4"

    move-object v10, v9

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۢۨۤۧ(Ljava/lang/Object;)[I

    move-result-object v2

    const-string v9, "\u06e0\u06e0\u06e0"

    move-object v10, v9

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۥۡۦۨ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    const-string v9, "\u06e1\u06df\u06e5"

    move-object v10, v9

    goto :goto_0

    :sswitch_6
    move-object v9, p1

    invoke-static/range {v0 .. v9}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda7;->ۣۤ۠۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const-string v9, "\u06e6\u06e7"

    move-object v10, v9

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/core/ۤۦ۟ۢ;->ۨۧۦۥ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const-string v9, "\u06e3\u06e6\u06e5"

    move-object v10, v9

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->۟ۤ۠۟ۧ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v9, "\u06e1\u06e3\u06e7"

    move-object v10, v9

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣۧۦۡ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v9, "\u06e0\u06e2\u06e3"

    move-object v10, v9

    goto :goto_0

    :sswitch_data_0
    .sparse-switch
        0xdc06 -> :sswitch_0
        0x1aaae0 -> :sswitch_3
        0x1aab21 -> :sswitch_4
        0x1aae86 -> :sswitch_6
        0x1aae87 -> :sswitch_7
        0x1aaf05 -> :sswitch_9
        0x1ab605 -> :sswitch_8
        0x1ab6e2 -> :sswitch_1
        0x1abac1 -> :sswitch_5
        0x1ac243 -> :sswitch_2
    .end sparse-switch
.end method
