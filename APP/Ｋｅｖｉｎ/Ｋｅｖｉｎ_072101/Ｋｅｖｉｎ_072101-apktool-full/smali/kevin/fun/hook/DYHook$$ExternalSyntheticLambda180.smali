.class public final synthetic Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field public final f$0:Lkevin/fun/hook/DYHook;

.field public final f$1:Ljava/util/List;

.field public final f$10:Landroid/content/Context;

.field public final f$11:Ljava/lang/Runnable;

.field public final f$2:[I

.field public final f$3:Ljava/util/Map;

.field public final f$4:Landroid/widget/EditText;

.field public final f$5:Ljava/util/Map;

.field public final f$6:Ljava/util/List;

.field public final f$7:Ljava/util/function/Consumer;

.field public final f$8:Landroid/widget/TextView;

.field public final f$9:Landroid/app/Dialog;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lkevin/fun/hook/DYHook;Ljava/util/List;[ILjava/util/Map;Landroid/widget/EditText;Ljava/util/Map;Ljava/util/List;Ljava/util/function/Consumer;Landroid/widget/TextView;Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/Runnable;)V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$1:Ljava/util/List;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$2:[I

    iput-object p4, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$3:Ljava/util/Map;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$4:Landroid/widget/EditText;

    iput-object p6, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$5:Ljava/util/Map;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$6:Ljava/util/List;

    iput-object p8, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$7:Ljava/util/function/Consumer;

    iput-object p9, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$8:Landroid/widget/TextView;

    iput-object p10, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$9:Landroid/app/Dialog;

    iput-object p11, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$10:Landroid/content/Context;

    iput-object p12, p0, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->f$11:Ljava/lang/Runnable;

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
    const-string v0, "MGNjNhkYTLhZlSuwGPeGcn9C9DYT"

    invoke-static {v0}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۨۧۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 14

    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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

    check-cast v1, Ljava/util/List;

    move-object/from16 v2, p2

    check-cast v2, [I

    move-object/from16 v3, p3

    check-cast v3, Ljava/util/Map;

    move-object/from16 v4, p4

    check-cast v4, Landroid/widget/EditText;

    move-object/from16 v5, p5

    check-cast v5, Ljava/util/Map;

    move-object/from16 v6, p6

    check-cast v6, Ljava/util/List;

    move-object/from16 v7, p7

    check-cast v7, Ljava/util/function/Consumer;

    move-object/from16 v8, p8

    check-cast v8, Landroid/widget/TextView;

    move-object/from16 v9, p9

    check-cast v9, Landroid/app/Dialog;

    move-object/from16 v10, p10

    check-cast v10, Landroid/content/Context;

    move-object/from16 v11, p11

    check-cast v11, Ljava/lang/Runnable;

    move-object/from16 v12, p12

    check-cast v12, Landroid/content/DialogInterface;

    move/from16 v13, p13

    invoke-virtual/range {v0 .. v13}, Lkevin/fun/hook/DYHook;->lambda$62$kevin-fun-hook-DYHook(Ljava/util/List;[ILjava/util/Map;Landroid/widget/EditText;Ljava/util/Map;Ljava/util/List;Ljava/util/function/Consumer;Landroid/widget/TextView;Landroid/app/Dialog;Landroid/content/Context;Ljava/lang/Runnable;Landroid/content/DialogInterface;I)V

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
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 14

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-string v12, "\u06e0\u06e2\u06e2"

    :goto_0
    invoke-static {v12}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v12

    sparse-switch v12, :sswitch_data_0

    invoke-static {p0}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟ۨۡۤ(Ljava/lang/Object;)Landroid/app/Dialog;

    move-result-object v9

    const-string v12, "\u06e7\u06e5\u06e1"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Landroidx/activity/ۨ۠۟ۧ;->۟۟ۦۥ۠(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v3

    const-string v12, "\u06e2\u06e4\u06e3"

    goto :goto_0

    :sswitch_1
    invoke-static {p0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۧۨۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v12, "\u06e7\u06e8\u06e3"

    goto :goto_0

    :sswitch_2
    move-object v12, p1

    move/from16 v13, p2

    invoke-static/range {v0 .. v13}, Lkevin/fun/hook/DYHook$$ExternalSyntheticLambda180;->ۨۧۧ۟(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const-string v12, "\u06e7\u06e6\u06e6"

    goto :goto_0

    :sswitch_3
    invoke-static {p0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۥۣ۠(Ljava/lang/Object;)[I

    move-result-object v2

    const-string v12, "\u06e1\u06e8"

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Landroidx/appcompat/resources/ۦۨۦۢ;->ۣۨۡۧ(Ljava/lang/Object;)Ljava/util/function/Consumer;

    move-result-object v7

    const-string v12, "\u06e8\u06e3\u06e1"

    goto :goto_0

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۡ۟ۨۧ(Ljava/lang/Object;)Ljava/lang/Runnable;

    move-result-object v11

    const-string v12, "\u06df\u06e3\u06e1"

    goto :goto_0

    :sswitch_6
    invoke-static {p0}, Landroidx/activity/ۣۦۡۥ;->ۨۧۧۡ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v10

    const-string v12, "\u06e4\u06e7\u06e5"

    goto :goto_0

    :sswitch_7
    invoke-static {p0}, Landroidx/appcompat/ۣۧۤۢ;->ۥۢۦۢ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    const-string v12, "\u06e0\u06e6\u06e6"

    goto :goto_0

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۤۨۧۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const-string v12, "\u06e8\u06e5\u06e8"

    goto :goto_0

    :sswitch_9
    invoke-static {p0}, Landroidx/drawerlayout/ۤۨۡۤ;->ۡۡۨۢ(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v4

    const-string v12, "\u06e2\u06df\u06e4"

    goto :goto_0

    :sswitch_a
    invoke-static {p0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۡۢۤۨ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v8

    const-string v12, "\u06e2\u06e5"

    goto :goto_0

    :sswitch_b
    invoke-static {p0}, Landroidx/loader/ۥۧۨۤ;->ۨۨۦۡ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v5

    const-string v12, "\u06e1\u06e6\u06e2"

    goto :goto_0

    :sswitch_c
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc27 -> :sswitch_0
        0x1aa77d -> :sswitch_2
        0x1aab20 -> :sswitch_7
        0x1aaba0 -> :sswitch_8
        0x1aaf5d -> :sswitch_1
        0x1ab247 -> :sswitch_b
        0x1ab2e1 -> :sswitch_9
        0x1abac2 -> :sswitch_5
        0x1ac5c3 -> :sswitch_6
        0x1ac5e7 -> :sswitch_c
        0x1ac622 -> :sswitch_4
        0x1ac946 -> :sswitch_a
        0x1ac98b -> :sswitch_3
    .end sparse-switch
.end method
