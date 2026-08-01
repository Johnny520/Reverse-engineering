.class Lkevin/fun/hook/DYHook$72;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->showWatchListDialog(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$categories:Ljava/util/List;

.field private final val$categoryItems:Ljava/util/Map;

.field private final val$ctx:Landroid/content/Context;

.field private final val$currentDisplayItems:[Ljava/util/List;

.field private final val$currentPage:[I

.field private final val$currentTabIndex:[I

.field private final val$deleteBtn:Landroid/widget/TextView;

.field private final val$dialogRef:Ljava/lang/ref/WeakReference;

.field private final val$hasMore:[Z

.field private final val$isSelectMode:[Z

.field private final val$listContent:Landroid/widget/LinearLayout;

.field private final val$openWatchItem:Ljava/util/function/BiConsumer;

.field private final val$searchInput:Landroid/widget/EditText;

.field private final val$selectAllBtn:Landroid/widget/TextView;

.field private final val$selectedMap:Ljava/util/Map;

.field private final val$title:Landroid/widget/TextView;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x7b

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$72;->short:[S

    return-void

    :array_0
    .array-data 2
        0x6f40s
        0x6c22s
        0x5bc4s
        0x75b9s
        -0x932s
        -0x7dcbs
        0x588as
        0x6439s
        0x5b62s
        0x5bc4s
        0x75b9s
        0x60abs
        0x63c9s
        0x65fbs
        0x7115s
        -0x7267s
        0x597cs
        0x2e3s
        0x2ebs
        0x2f3s
        0x2eas
        0x6e6s
        0x63a8s
        0x7a96s
        0x7967s
        0x6028s
        0x794s
        0x79cs
        0x6216s
        0x6742s
        0x570cs
        0x5605s
        -0x6b8fs
        0x73b8s
        0x66ees
        0x7200s
        0x24b7s
        -0x3e8s
        0x237s
        0x5d44s
        0x505as
        0x5011s
        0x7e6cs
        0x651es
        0x237s
        0x6b0s
        0x61f1s
        0x6542s
        0x71acs
        0x69as
        0x4855s
        0x60aes
        0x7faas
        0x54dds
        0x6a5s
        0x6a0s
        0x6a0s
        0x61f1s
        -0x664s
        -0x7299s
        0x49efs
        0x73b8s
        0x628cs
        0x7bb2s
        0x540fs
        -0x7993s
        0x7dcbs
        -0x6967s
        -0x7354s
        0x647ds
        0x354s
        0x205s
        0x6544s
        0x650fs
        0x641bs
        0x7b1fs
        -0x2d7s
        -0x762es
        0x4d5as
        0x770ds
        0x6639s
        0x7f07s
        0x50bas
        -0x7d28s
        0x797es
        -0x6dd4s
        0x31cs
        0x65ds
        0x655s
        0x5f4ds
        0x6113s
        0x5df3s
        -0x636es
        0x50d1s
        -0x6e50s
        0x397as
        0x921s
        0x90fs
        0x91cs
        0x903s
        0x904s
        0x397bs
        0x94as
        0x918s
        0x90fs
        0x90cs
        0x918s
        0x90fs
        0x919s
        0x902s
        0x926s
        0x903s
        0x919s
        0x91es
        0x94as
        0x90cs
        0x90bs
        0x903s
        0x906s
        0x90fs
        0x90es
        0x950s
        0x94as
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Landroid/widget/LinearLayout;[I[Ljava/util/List;[ZLjava/util/List;Landroid/content/Context;[ILjava/util/Map;Landroid/widget/TextView;Landroid/widget/EditText;[ZLjava/util/Map;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/ref/WeakReference;Ljava/util/function/BiConsumer;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/DYHook$72;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$72;->val$listContent:Landroid/widget/LinearLayout;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$72;->val$currentPage:[I

    iput-object p4, p0, Lkevin/fun/hook/DYHook$72;->val$currentDisplayItems:[Ljava/util/List;

    iput-object p5, p0, Lkevin/fun/hook/DYHook$72;->val$hasMore:[Z

    iput-object p6, p0, Lkevin/fun/hook/DYHook$72;->val$categories:Ljava/util/List;

    iput-object p7, p0, Lkevin/fun/hook/DYHook$72;->val$ctx:Landroid/content/Context;

    iput-object p8, p0, Lkevin/fun/hook/DYHook$72;->val$currentTabIndex:[I

    iput-object p9, p0, Lkevin/fun/hook/DYHook$72;->val$categoryItems:Ljava/util/Map;

    iput-object p10, p0, Lkevin/fun/hook/DYHook$72;->val$title:Landroid/widget/TextView;

    iput-object p11, p0, Lkevin/fun/hook/DYHook$72;->val$searchInput:Landroid/widget/EditText;

    iput-object p12, p0, Lkevin/fun/hook/DYHook$72;->val$isSelectMode:[Z

    move-object/from16 v0, p13

    iput-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$selectedMap:Ljava/util/Map;

    move-object/from16 v0, p14

    iput-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$deleteBtn:Landroid/widget/TextView;

    move-object/from16 v0, p15

    iput-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$selectAllBtn:Landroid/widget/TextView;

    move-object/from16 v0, p16

    iput-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$dialogRef:Ljava/lang/ref/WeakReference;

    move-object/from16 v0, p17

    iput-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$openWatchItem:Ljava/util/function/BiConsumer;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

    move-result v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v1, "7dGXVe091Cnt6kGSN"

    invoke-static {v1}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۤۡۥۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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

.method static synthetic lambda$0(Landroid/widget/CheckBox;)V
    .locals 0

    return-void
.end method

.method public static ۟۟ۤۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Lkevin/fun/hook/DYHook$WatchItem;

    check-cast p2, Ljava/lang/String;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$mmatchesKeyword(Lkevin/fun/hook/DYHook;Lkevin/fun/hook/DYHook$WatchItem;Ljava/lang/String;)Z

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->۟ۡۧۦۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$ctx:Landroid/content/Context;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟۠ۧۧۨ(Ljava/lang/Object;)[Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$currentDisplayItems:[Ljava/util/List;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 2

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$listContent:Landroid/widget/LinearLayout;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۡۨ۠ۨ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$selectedMap:Ljava/util/Map;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۣ۟ۢۡۢ()[S
    .locals 2

    invoke-static {}, Landroidx/versionedparcelable/۠ۡۧۤ;->ۢۡۡۨ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$72;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۤۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;
    .locals 12

    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۡ۟ۦ()I

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

    check-cast v1, Landroid/content/Context;

    move-object v2, p2

    check-cast v2, Lkevin/fun/hook/DYHook$WatchItem;

    move-object/from16 v4, p4

    check-cast v4, Ljava/util/List;

    move-object/from16 v6, p6

    check-cast v6, Ljava/util/Map;

    move-object/from16 v7, p7

    check-cast v7, Landroid/widget/TextView;

    move-object/from16 v8, p8

    check-cast v8, Landroid/widget/TextView;

    move-object/from16 v9, p9

    check-cast v9, Ljava/lang/ref/WeakReference;

    move-object/from16 v10, p10

    check-cast v10, Ljava/util/function/BiConsumer;

    move-object/from16 v11, p11

    check-cast v11, Ljava/util/function/Consumer;

    move v3, p3

    move/from16 v5, p5

    invoke-static/range {v0 .. v11}, Lkevin/fun/hook/DYHook;->_$$Nest$mcreateItemRow(Lkevin/fun/hook/DYHook;Landroid/content/Context;Lkevin/fun/hook/DYHook$WatchItem;ILjava/util/List;ZLjava/util/Map;Landroid/widget/TextView;Landroid/widget/TextView;Ljava/lang/ref/WeakReference;Ljava/util/function/BiConsumer;Ljava/util/function/Consumer;)Landroid/widget/LinearLayout;

    move-result-object v0

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۦ۠ۢۧ(Ljava/lang/Object;)Ljava/util/function/BiConsumer;
    .locals 2

    invoke-static {}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۣ۟ۦۣۡ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$openWatchItem:Ljava/util/function/BiConsumer;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۦۢۥ۟(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/۟ۧۢۧۨ;->ۣۢۥ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$deleteBtn:Landroid/widget/TextView;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۦۦۧۡ(Ljava/lang/Object;)Ljava/util/Map;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$categoryItems:Ljava/util/Map;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۧۡ۠ۧ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۣ۟ۦۣۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$title:Landroid/widget/TextView;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۧۤ۠(Ljava/lang/Object;)Landroid/widget/EditText;
    .locals 2

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$searchInput:Landroid/widget/EditText;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۟ۧۧ۠ۨ(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠ۦۤۦ()I

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
    check-cast p0, Landroid/content/Context;

    invoke-static {p0, p1}, Lkevin/fun/hook/DYHook;->_$$Nest$smdp(Landroid/content/Context;F)I

    move-result v0

    :sswitch_3
    return v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۠ۡۡۧ(Ljava/lang/Object;)V
    .locals 2

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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

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

.method public static ۣۢۤۢ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;
    .locals 2

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$dialogRef:Ljava/lang/ref/WeakReference;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۥۡۥۤ(Ljava/lang/Object;)[Z
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$isSelectMode:[Z

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۥۥۡۥ(Ljava/lang/Object;)[I
    .locals 2

    invoke-static {}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤۦۥۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$currentPage:[I

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۦ۠ۢ۠(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$selectAllBtn:Landroid/widget/TextView;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۦۣۨ۠(Ljava/lang/Object;)[Z
    .locals 2

    invoke-static {}, Landroidx/activity/ۨ۠۟ۧ;->ۤۥۡ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$hasMore:[Z

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۣۧۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->this$0:Lkevin/fun/hook/DYHook;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۧۨۥۥ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

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
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$categories:Ljava/util/List;

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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

.method public static ۨۥۣۤ(Ljava/lang/Object;)[I
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$72;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$72;->val$currentTabIndex:[I

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

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
.method public run()V
    .locals 16

    :try_start_0
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-static {v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->۟ۦۡۢۡ(Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۥۥۡۥ(Ljava/lang/Object;)[I

    move-result-object v1

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    aput v4, v1, v2

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۠ۧۧۨ(Ljava/lang/Object;)[Ljava/util/List;

    move-result-object v1

    const/4 v2, 0x0

    aget-object v1, v1, v2

    invoke-static {v1}, Landroidx/core/ۤۦ۟ۢ;->ۡۢۦ۟(Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۦۣۨ۠(Ljava/lang/Object;)[Z

    move-result-object v1

    const/4 v2, 0x0

    const/4 v4, 0x1

    aput-boolean v4, v1, v2

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۧۨۥۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v4

    sget v1, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v2, v1, -0x3d3

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v4, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v1, Landroid/widget/TextView;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v3

    const/4 v4, 0x0

    sget v5, Landroidx/interpolator/۟ۧۦ۟ۨ;->ۤۦۤۧ:I

    xor-int/lit16 v5, v5, 0x154

    const/16 v6, 0x9c2

    invoke-static {v3, v4, v5, v6}, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->۟۠۠ۧۥ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41600000    # 14.0f

    invoke-static {v1, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v3, -0x666667

    invoke-static {v1, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x42200000    # 40.0f

    invoke-static {v3, v4}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v3

    const/4 v4, 0x0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x42200000    # 40.0f

    invoke-static {v5, v6}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_1
    :sswitch_3
    return-void

    :sswitch_4
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۧۨۥۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۨۥۣۤ(Ljava/lang/Object;)[I

    move-result-object v4

    const/4 v5, 0x0

    aget v4, v4, v5

    invoke-static {v1, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    move-object v0, v1

    check-cast v0, Ljava/lang/String;

    move-object v13, v0

    new-instance v4, Ljava/util/ArrayList;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۦۦۧۡ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1, v13}, Lorg/luckypray/dexkit/۟ۧۥ۠ۢ;->۟ۡۥ۠ۨ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Collection;

    invoke-direct {v4, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    invoke-static {v4}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v5

    const/16 v1, 0x6cc

    :goto_2
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_2

    :sswitch_5
    if-eqz v5, :cond_1

    const/16 v1, 0x729

    goto :goto_2

    :cond_1
    :sswitch_6
    const/16 v1, 0x70a

    goto :goto_2

    :sswitch_7
    new-instance v1, Landroid/widget/TextView;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v3

    const/16 v4, 0xb

    sget v5, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v5, v5, 0x10a

    const/16 v6, 0x629

    invoke-static {v3, v4, v5, v6}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41600000    # 14.0f

    invoke-static {v1, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v3, -0x666667

    invoke-static {v1, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x42200000    # 40.0f

    invoke-static {v3, v4}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v3

    const/4 v4, 0x0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x42200000    # 40.0f

    invoke-static {v5, v6}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {v1, v2, v3, v4, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۧۡ۠ۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v13}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v3

    const/16 v4, 0x11

    sget v5, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v5, v5, -0x7f

    const/16 v6, 0x2c3

    invoke-static {v3, v4, v5, v6}, Landroidx/interpolator/۟ۧۦ۟ۨ;->۠ۤۤۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->۟ۥ۟ۦ۟()I

    move-result v2

    const/16 v1, 0x748

    :goto_3
    xor-int/lit16 v1, v1, 0x759

    sparse-switch v1, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-gtz v2, :cond_2

    const v1, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v1, 0xbe41

    goto :goto_3

    :sswitch_a
    const-string v1, "gtZeQvrYG5llWpqPy7xG7JKcC7"

    invoke-static {v1}, Landroidx/lifecycle/process/۟ۧ۠ۦ۠;->۟ۧۦ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v1

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_1

    :catchall_0
    move-exception v1

    invoke-static {v1}, Landroidx/loader/ۥۧۨۤ;->ۦۢ۠ۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v3

    const/16 v4, 0x5f

    sget v5, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v5, v5, 0x212

    const/16 v6, 0x96a

    invoke-static {v3, v4, v5, v6}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/DYHook$72;->۠ۡۡۧ(Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_b
    :try_start_1
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۧۤ۠(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v1

    invoke-static {v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v7

    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v7}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result v8

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v1

    const/16 v9, 0x15

    const/4 v10, 0x1

    const/16 v11, 0x6cf

    invoke-static {v1, v9, v10, v11}, Landroidx/core/ۤۦ۟ۢ;->ۣۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v15

    const v1, 0xbe7f

    :goto_4
    const v9, 0xbe90

    xor-int/2addr v1, v9

    sparse-switch v1, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_c
    const v1, 0xbebd

    goto :goto_4

    :sswitch_d
    if-eqz v8, :cond_3

    const v1, 0xbedc

    goto :goto_4

    :sswitch_e
    const v1, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_4

    goto :goto_5

    :sswitch_f
    move-object v14, v4

    move v3, v6

    move v1, v2

    :goto_6
    :try_start_2
    invoke-static {v14}, Landroidx/activity/ۤۧۧۧ;->ۡۥۦۦ(Ljava/lang/Object;)Z

    move-result v4

    const v2, 0xc27e

    :goto_7
    const v5, 0xc28f

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_5

    goto :goto_7

    :cond_4
    :sswitch_10
    const v2, 0xc2bc

    goto :goto_7

    :sswitch_11
    const v1, 0xbf1a

    goto :goto_5

    :sswitch_12
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->ۧ۟ۥۦ(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v4

    :goto_8
    :sswitch_13
    invoke-static {v4}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v6

    const v1, 0xc202

    :goto_9
    const v8, 0xc213

    xor-int/2addr v1, v8

    sparse-switch v1, :sswitch_data_6

    goto :goto_9

    :sswitch_14
    if-nez v6, :cond_5

    const v1, 0xc25f

    goto :goto_9

    :cond_5
    :sswitch_15
    const v1, 0xc240

    goto :goto_9

    :sswitch_16
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۧۡ۠ۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v4

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v7

    const/16 v8, 0x16

    sget v9, Landroidx/emoji2/ۢۧۡۧ;->۟ۦ۠ۥۦ:I

    xor-int/lit16 v9, v9, 0x17f

    const/16 v10, 0x7b4

    invoke-static {v7, v8, v9, v10}, Landroidx/interpolator/ۣ۟ۤۢۧ;->ۤۦۢۧ([SIII)Ljava/lang/String;

    move-result-object v7

    invoke-static {v6, v7}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v6

    invoke-static {v6, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4, v15}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v1, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    move-object v14, v5

    move v1, v2

    goto :goto_6

    :sswitch_17
    if-eqz v4, :cond_4

    const v2, 0xc2db

    goto :goto_7

    :sswitch_18
    new-instance v2, Landroid/widget/TextView;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v4

    const/16 v5, 0x1c

    sget v6, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۥۥۦ:I

    xor-int/lit16 v6, v6, 0x26f

    const/16 v7, 0x53c

    invoke-static {v4, v5, v6, v7}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۢ۟ۥۨ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41600000    # 14.0f

    invoke-static {v2, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, -0x666667

    invoke-static {v2, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v2, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const/high16 v4, 0x42200000    # 40.0f

    invoke-static {v1, v4}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v1

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const/high16 v5, 0x42200000    # 40.0f

    invoke-static {v4, v5}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v4

    invoke-static {v2, v3, v1, v3, v4}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-static {v1, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto/16 :goto_1

    :sswitch_19
    invoke-static {v14}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v4

    const v2, 0xc2fa

    :goto_a
    const v5, 0xc30b

    xor-int/2addr v2, v5

    sparse-switch v2, :sswitch_data_7

    goto :goto_a

    :sswitch_1a
    const/16 v2, 0x1f4

    if-le v4, v2, :cond_6

    const v2, 0xc5e2

    goto :goto_a

    :cond_6
    :sswitch_1b
    const v2, 0xc5c3

    goto :goto_a

    :sswitch_1c
    new-instance v2, Landroid/widget/TextView;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v14}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v6

    const/16 v7, 0x24

    sget v8, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v8, v8, -0x251

    const/16 v9, 0x217

    invoke-static {v6, v7, v8, v9}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣ۟۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v5

    invoke-static {v5, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v5

    const/16 v6, 0x2d

    sget v7, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v7, v7, 0x2e9

    const/16 v8, 0x690

    invoke-static {v5, v6, v7, v8}, Landroidx/activity/ۤۧۧۧ;->ۣ۟۟۠ۡ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v4, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-static {v4}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v4, 0x41400000    # 12.0f

    invoke-static {v2, v4}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v4, 0xa844

    sget v5, Landroidx/appcompat/ۣۧۤۢ;->۟۠ۡۤۤ:I

    xor-int/2addr v4, v5

    invoke-static {v2, v4}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v2, v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const/high16 v5, 0x41800000    # 16.0f

    invoke-static {v4, v5}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v4

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x41800000    # 16.0f

    invoke-static {v5, v6}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {v2, v3, v4, v3, v5}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v4

    invoke-static {v4, v2}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_1d
    invoke-static {v14}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v2

    const/16 v4, 0x1f4

    invoke-static {v2, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۢۦۥ۠(II)I

    move-result v2

    invoke-static {v14, v3, v2}, Landroidx/drawerlayout/ۤۨۡۤ;->ۥ۠ۧۤ(Ljava/lang/Object;II)Ljava/util/List;

    move-result-object v5

    const/4 v4, 0x0

    move v2, v1

    :sswitch_1e
    invoke-static {v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v3

    const v1, 0xc601

    :goto_b
    const v6, 0xc612

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_8

    goto :goto_b

    :sswitch_1f
    if-lt v4, v3, :cond_7

    const v1, 0xc65e

    goto :goto_b

    :cond_7
    :sswitch_20
    const v1, 0xc63f

    goto :goto_b

    :sswitch_21
    invoke-static {v14}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v3

    const v1, 0xc67d

    :goto_c
    const v4, 0xc68e

    xor-int/2addr v1, v4

    sparse-switch v1, :sswitch_data_9

    goto :goto_c

    :cond_8
    :sswitch_22
    const v1, 0xc6bb

    goto :goto_c

    :sswitch_23
    const/16 v1, 0x1f4

    if-le v3, v1, :cond_8

    const v1, 0xc965

    goto :goto_c

    :sswitch_24
    new-instance v1, Landroid/widget/TextView;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v1, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v14}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v6

    const/16 v7, 0x44

    sget v8, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/lit16 v8, v8, 0x381

    const/16 v9, 0x374

    invoke-static {v6, v7, v8, v9}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۦ۠ۧۨ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v4

    add-int/lit16 v3, v3, -0x1f4

    invoke-static {v4, v3}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v4

    const/16 v6, 0x47

    sget v7, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v7, v7, -0x76

    const/16 v8, 0x225

    invoke-static {v4, v6, v7, v8}, Landroidx/customview/ۤۡۥ;->۟ۢۢۡۥ([SIII)Ljava/lang/String;

    move-result-object v4

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-static {v3}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v1, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    const v3, -0x666667

    invoke-static {v1, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v1, v2}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/4 v2, 0x0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const/high16 v4, 0x41800000    # 16.0f

    invoke-static {v3, v4}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v3

    const/4 v4, 0x0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    const/high16 v7, 0x41800000    # 16.0f

    invoke-static {v6, v7}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v6

    invoke-static {v1, v2, v3, v4, v6}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_25
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۧۤ۠(Ljava/lang/Object;)Landroid/widget/EditText;

    move-result-object v1

    invoke-static {v1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟۠۟ۡۡ(Ljava/lang/Object;)Landroid/text/Editable;

    move-result-object v1

    invoke-static {v1}, Landroidx/startup/ۤۧۥۣ;->۟۠ۧۨۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->۠۠ۦۦ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۥۦۣ(Ljava/lang/Object;)Z

    move-result v2

    const v1, 0xc984

    :goto_d
    const v3, 0xc995

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_a

    goto :goto_d

    :sswitch_26
    if-eqz v2, :cond_9

    const v1, 0xc9e1

    goto :goto_d

    :cond_9
    :sswitch_27
    const v1, 0xc9c2

    goto :goto_d

    :sswitch_28
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۧۡ۠ۧ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v3

    invoke-static {v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v4

    invoke-static {v14}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v2

    const v1, 0xca00

    :goto_e
    const v6, 0xca11

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_b

    goto :goto_e

    :cond_a
    :sswitch_29
    const v1, 0xca3e

    goto :goto_e

    :sswitch_2a
    const/16 v1, 0x1f4

    if-le v2, v1, :cond_a

    const v1, 0xca5d

    goto :goto_e

    :sswitch_2b
    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v1

    const/16 v2, 0x56

    const/4 v6, 0x1

    const/16 v7, 0x337

    invoke-static {v1, v2, v6, v7}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    const v2, 0xca7c

    :goto_f
    const v6, 0xca8d

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_c

    goto :goto_f

    :sswitch_2c
    const v2, 0xcd26

    goto :goto_f

    :sswitch_2d
    invoke-static {}, Landroidx/emoji2/ۢۧۡۧ;->ۧۢۤۢ()Ljava/lang/String;

    move-result-object v1

    :sswitch_2e
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {v2, v13}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v6

    const/16 v7, 0x57

    sget v8, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۣۨ۟:I

    xor-int/lit8 v8, v8, 0x4b

    const/16 v9, 0x67d

    invoke-static {v6, v7, v8, v9}, Lorg/luckypray/dexkit/۠۠ۥ;->۟ۥۧۦ۠([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v4}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v15}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v3, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_2f
    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۦ۠ۢ۠(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v3

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۨ۠ۨ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v1

    invoke-static {v1}, Landroidx/activity/ۨ۠۟ۧ;->ۡۨ۠ۧ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v4

    const v1, 0xcd83

    :goto_10
    const v5, 0xcd94

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_d

    goto :goto_10

    :sswitch_30
    if-ne v2, v4, :cond_b

    const v1, 0xcde0

    goto :goto_10

    :cond_b
    :sswitch_31
    const v1, 0xcdc1

    goto :goto_10

    :sswitch_32
    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v1

    const/16 v2, 0x59

    sget v4, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v4, v4, 0x1bb

    const/16 v5, 0xc9b

    invoke-static {v1, v2, v4, v5}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۥۡۤۧ([SIII)Ljava/lang/String;

    move-result-object v1

    const v2, 0xcdff

    :goto_11
    const v4, 0xce10

    xor-int/2addr v2, v4

    sparse-switch v2, :sswitch_data_e

    goto :goto_11

    :goto_12
    :sswitch_33
    invoke-static {v3, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd106

    :goto_13
    const v2, 0xd117

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_f

    goto :goto_13

    :sswitch_34
    const v1, 0xd125

    goto :goto_13

    :sswitch_35
    const v2, 0xce1e

    goto :goto_11

    :sswitch_36
    invoke-static {}, Lkevin/fun/hook/DYHook$72;->ۣ۟ۢۡۢ()[S

    move-result-object v1

    const/16 v2, 0x5d

    sget v4, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v4, v4, -0x3bd

    const/16 v5, 0x1b9

    invoke-static {v1, v2, v4, v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v1

    goto :goto_12

    :sswitch_37
    invoke-static {v5, v4}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۣۧۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v1

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۥۡۥۤ(Ljava/lang/Object;)[Z

    move-result-object v6

    const/4 v7, 0x0

    aget-boolean v6, v6, v7

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۨ۠ۨ(Ljava/lang/Object;)Ljava/util/Map;

    move-result-object v7

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۦۢۥ۟(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v8

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۦ۠ۢ۠(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v9

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۣۢۤۢ(Ljava/lang/Object;)Ljava/lang/ref/WeakReference;

    move-result-object v10

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۦ۠ۢۧ(Ljava/lang/Object;)Ljava/util/function/BiConsumer;

    move-result-object v11

    new-instance v12, Lkevin/fun/hook/DYHook$72$$ExternalSyntheticLambda0;

    invoke-direct {v12}, Lkevin/fun/hook/DYHook$72$$ExternalSyntheticLambda0;-><init>()V

    invoke-static/range {v1 .. v12}, Lkevin/fun/hook/DYHook$72;->۟ۤۤۨۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v1

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v5}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v2

    const v1, 0xd182

    :goto_14
    const v3, 0xd193

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_10

    goto :goto_14

    :sswitch_38
    add-int/lit8 v1, v2, -0x1

    if-ge v4, v1, :cond_c

    const v1, 0xd1df

    goto :goto_14

    :cond_c
    :sswitch_39
    const v1, 0xd1c0

    goto :goto_14

    :sswitch_3a
    new-instance v1, Landroid/view/View;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v1, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    const/high16 v6, 0x3f000000    # 0.5f

    invoke-static {v3, v6}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v3

    sget v6, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v6, v6, -0x2ff

    invoke-direct {v2, v6, v3}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۦۤۡۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x111173

    sget v3, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/2addr v2, v3

    invoke-static {v1, v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41800000    # 16.0f

    invoke-static {v2, v3}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v2

    const/4 v3, 0x0

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟۟ۦ۠۠(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    const/high16 v7, 0x41800000    # 16.0f

    invoke-static {v6, v7}, Lkevin/fun/hook/DYHook$72;->۟ۧۧ۠ۨ(Ljava/lang/Object;F)I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v1, v2, v3, v6, v7}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۡ۠۟ۤ(Ljava/lang/Object;IIII)V

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->۟ۡۡ۟ۧ(Ljava/lang/Object;)Landroid/widget/LinearLayout;

    move-result-object v2

    invoke-static {v2, v1}, Landroidx/activity/ۤۧۧۧ;->ۤۥۧۦ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v1, 0xd1fe

    :goto_15
    const v2, 0xd20f

    xor-int/2addr v1, v2

    sparse-switch v1, :sswitch_data_11

    goto :goto_15

    :sswitch_3b
    const v1, 0xd4a8

    goto :goto_15

    :sswitch_3c
    sget v1, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v1, v1, -0x13

    add-int/2addr v4, v1

    const/16 v2, 0x11

    const v1, 0xd505

    :goto_16
    const v3, 0xd516

    xor-int/2addr v1, v3

    sparse-switch v1, :sswitch_data_12

    goto :goto_16

    :sswitch_3d
    const v1, 0xd524

    goto :goto_16

    :sswitch_3e
    invoke-static {v4}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lkevin/fun/hook/DYHook$WatchItem;

    invoke-static/range {p0 .. p0}, Lkevin/fun/hook/DYHook$72;->ۣۧۡ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v2

    invoke-static {v2, v1, v7}, Lkevin/fun/hook/DYHook$72;->۟۟ۤۧۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    const v2, 0xd581

    :goto_17
    const v8, 0xd592

    xor-int/2addr v2, v8

    sparse-switch v2, :sswitch_data_13

    goto :goto_17

    :sswitch_3f
    if-eqz v6, :cond_d

    const v2, 0xd869

    goto :goto_17

    :cond_d
    :sswitch_40
    const v2, 0xd5bf

    goto :goto_17

    :sswitch_41
    invoke-static {v5, v1}, Landroidx/emoji2/viewsintegration/ۣۡۢۨ;->ۧۡۦۥ(Ljava/lang/Object;Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const/16 v1, 0x11

    const v2, 0xd888

    :goto_18
    const v6, 0xd899

    xor-int/2addr v2, v6

    sparse-switch v2, :sswitch_data_14

    goto :goto_18

    :sswitch_42
    const v2, 0xd8a7

    goto :goto_18

    :sswitch_43
    move v2, v1

    goto/16 :goto_8

    :sswitch_44
    const/16 v2, 0x11

    const v1, 0xd904

    :goto_19
    const v6, 0xd915

    xor-int/2addr v1, v6

    sparse-switch v1, :sswitch_data_15

    goto :goto_19

    :sswitch_45
    const v1, 0xd923

    goto :goto_19

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
        0x36 -> :sswitch_6
        0x1d7 -> :sswitch_b
        0x1f4 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_3
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_c
        0x2d -> :sswitch_12
        0x4c -> :sswitch_e
        0xef -> :sswitch_d
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_f
        0x1f7 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x12 -> :sswitch_10
        0x33 -> :sswitch_19
        0x54 -> :sswitch_18
        0xf1 -> :sswitch_17
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_14
        0x32 -> :sswitch_15
        0x4c -> :sswitch_16
        0x53 -> :sswitch_3e
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_1a
        0x6af -> :sswitch_1b
        0x6c8 -> :sswitch_1d
        0x6e9 -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_1f
        0x2d -> :sswitch_37
        0x32 -> :sswitch_20
        0x4c -> :sswitch_21
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_22
        0x35 -> :sswitch_25
        0xf3 -> :sswitch_23
        0xfeb -> :sswitch_24
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_26
        0x36 -> :sswitch_27
        0x57 -> :sswitch_2f
        0x74 -> :sswitch_28
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_29
        0x11 -> :sswitch_2a
        0x2f -> :sswitch_2d
        0x4c -> :sswitch_2b
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_2c
        0x7ab -> :sswitch_2e
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_30
        0x36 -> :sswitch_31
        0x55 -> :sswitch_36
        0x74 -> :sswitch_32
    .end sparse-switch

    :sswitch_data_e
    .sparse-switch
        0xe -> :sswitch_33
        0x3ef -> :sswitch_35
    .end sparse-switch

    :sswitch_data_f
    .sparse-switch
        0x11 -> :sswitch_34
        0x32 -> :sswitch_3
    .end sparse-switch

    :sswitch_data_10
    .sparse-switch
        0x11 -> :sswitch_38
        0x32 -> :sswitch_39
        0x4c -> :sswitch_3a
        0x53 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_11
    .sparse-switch
        0x3f1 -> :sswitch_3b
        0x6a7 -> :sswitch_3c
    .end sparse-switch

    :sswitch_data_12
    .sparse-switch
        0x13 -> :sswitch_3d
        0x32 -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_13
    .sparse-switch
        0x13 -> :sswitch_3f
        0x2d -> :sswitch_44
        0x32 -> :sswitch_40
        0xdfb -> :sswitch_41
    .end sparse-switch

    :sswitch_data_14
    .sparse-switch
        0x11 -> :sswitch_42
        0x3e -> :sswitch_43
    .end sparse-switch

    :sswitch_data_15
    .sparse-switch
        0x11 -> :sswitch_45
        0x36 -> :sswitch_13
    .end sparse-switch
.end method
