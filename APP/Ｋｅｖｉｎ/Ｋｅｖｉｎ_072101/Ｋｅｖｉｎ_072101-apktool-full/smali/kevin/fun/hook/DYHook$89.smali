.class Lkevin/fun/hook/DYHook$89;
.super Landroid/widget/BaseAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->showCommentImageGrid(Landroid/content/Context;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$context:Landroid/content/Context;

.field private final val$imageInfos:Ljava/util/List;

.field private final val$selectedSet:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x8

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/DYHook$89;->short:[S

    return-void

    :array_0
    .array-data 2
        0x59bds
        0x5396s
        0x457cs
        -0x7bf6s
        0x6937s
        -0x6482s
        0xb5fs
        0x876s
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Ljava/util/List;Landroid/content/Context;Ljava/util/Set;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$89;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$89;->val$imageInfos:Ljava/util/List;

    iput-object p3, p0, Lkevin/fun/hook/DYHook$89;->val$context:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/DYHook$89;->val$selectedSet:Ljava/util/Set;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    invoke-static {}, Lorg/luckypray/dexkit/۠۠ۥ;->ۡۥ۠ۦ()I

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
    const-string v0, "y3IT9bTu6Bnrt4YjRT5KKLPNi6yQ"

    invoke-static {v0}, Landroidx/loader/ۢۥ۟;->۟ۦۡۨ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;
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
    check-cast p0, Lkevin/fun/hook/DYHook$CommentViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$CommentViewHolder;->image:Landroid/widget/ImageView;

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

.method public static ۣ۟۟ۥۢ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۢۦ۠()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$89;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$89;->this$0:Lkevin/fun/hook/DYHook;

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

.method public static ۣ۟۠ۤۢ(Ljava/lang/Object;)Landroid/view/View;
    .locals 2

    invoke-static {}, Landroidx/activity/ۣۦۡۥ;->ۦۧۥۨ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$CommentViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$CommentViewHolder;->mask:Landroid/view/View;

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

.method public static ۣ۟ۢ۟۠(Ljava/lang/Object;)Ljava/util/Set;
    .locals 2

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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$89;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$89;->val$selectedSet:Ljava/util/Set;

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

.method public static ۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$89;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$89;->val$context:Landroid/content/Context;

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

.method public static ۣ۟ۤۢۧ(Ljava/lang/Object;)Ljava/util/List;
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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$89;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$89;->val$imageInfos:Ljava/util/List;

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

.method public static ۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$CommentViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$CommentViewHolder;->liveBadge:Landroid/widget/TextView;

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

.method public static ۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;
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
    check-cast p0, Lkevin/fun/hook/DYHook$CommentViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$CommentViewHolder;->indexBadge:Landroid/widget/TextView;

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

.method public static ۠ۤ(Ljava/lang/Object;)Landroid/widget/TextView;
    .locals 2

    invoke-static {}, Landroidx/loader/۟۠ۢۧۡ;->۟ۦۨ۠ۥ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    invoke-static {p0}, Lkevin/fun/hook/DYHook;->_$$Nest$fgetbtnSelected(Lkevin/fun/hook/DYHook;)Landroid/widget/TextView;

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

.method public static ۣ۠ۨ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    invoke-static {}, Landroidx/loader/ۡۢۢ;->ۢۥۧ۟()I

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
    check-cast p0, Lkevin/fun/hook/DYHook;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/widget/ImageView;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/DYHook;->_$$Nest$mloadImageFast(Lkevin/fun/hook/DYHook;Ljava/lang/String;Landroid/widget/ImageView;)V

    :sswitch_3
    invoke-static {}, Landroidx/loader/ۢۥ۟;->۟ۦۦۨۢ()I

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
    const-string v0, "LCXHCsTMKSDh3"

    invoke-static {v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣ۟ۧۦۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۡۡ۠ۨ(Ljava/lang/Object;)Z
    .locals 2

    invoke-static {}, Landroidx/interpolator/ۦۨۢۦ;->ۣۤۦۦ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$CommentImageInfo;

    iget-boolean v0, p0, Lkevin/fun/hook/DYHook$CommentImageInfo;->isLivePhoto:Z

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

.method public static ۢۨۨ۟(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->ۣ۟()I

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

.method public static ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;
    .locals 2

    invoke-static {}, Landroidx/drawerlayout/ۤۨۡۤ;->ۨۧۢۤ()I

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
    check-cast p0, Lkevin/fun/hook/DYHook$CommentViewHolder;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$CommentViewHolder;->itemRoot:Landroid/widget/FrameLayout;

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

.method public static ۧ۠ۦۤ()[S
    .locals 2

    invoke-static {}, Landroidx/vectordrawable/ۢۤۡۤ;->ۤۤۥ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$89;->short:[S

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

.method public static ۨۡۢۤ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$CommentImageInfo;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$CommentImageInfo;->imageUrl:Ljava/lang/String;

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

.method public static ۨۤۢۧ(Ljava/lang/Object;)V
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
    check-cast p0, Lkevin/fun/hook/DYHook$89;

    invoke-virtual {p0}, Lkevin/fun/hook/DYHook$89;->notifyDataSetChanged()V

    :sswitch_3
    invoke-static {}, Landroidx/vectordrawable/۟ۤۨۥۣ;->۟ۥۧۨ()I

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
    const-string v0, "uh5fjfW"

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣۣۤۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->decode(Ljava/lang/String;)Ljava/lang/Double;

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
.method public getCount()I
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟ۤۢۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟ۤۢۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method

.method public getItemId(I)J
    .locals 2

    int-to-long v0, p1

    return-wide v0
.end method

.method public getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 11

    const/high16 v8, 0x41a00000    # 20.0f

    const/high16 v10, 0x40000000    # 2.0f

    const/16 v3, 0x8

    const/high16 v9, 0x40c00000    # 6.0f

    const/4 v2, 0x0

    const v0, -0xa0a09

    sget v1, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int v4, v0, v1

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
    if-nez p2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v0, Lkevin/fun/hook/DYHook$CommentViewHolder;

    invoke-direct {v0}, Lkevin/fun/hook/DYHook$CommentViewHolder;-><init>()V

    new-instance v1, Landroid/widget/FrameLayout;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v1, v5}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lkevin/fun/hook/DYHook$CommentViewHolder;->itemRoot:Landroid/widget/FrameLayout;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x42dc0000    # 110.0f

    invoke-static {v5, v6}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v5

    sget v6, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۨۥۦ۟:I

    xor-int/lit16 v6, v6, -0x28e

    new-instance v7, Landroid/widget/AbsListView$LayoutParams;

    invoke-direct {v7, v6, v5}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-static {v1, v7}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/ImageView;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v1, v5}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lkevin/fun/hook/DYHook$CommentViewHolder;->image:Landroid/widget/ImageView;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۠۠ۦ()Landroid/widget/ImageView$ScaleType;

    move-result-object v5

    invoke-static {v1, v5}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۦۦۢۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v1

    invoke-static {v1, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦۥۦ(Ljava/lang/Object;I)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v1

    const/4 v5, 0x1

    invoke-static {v1, v5}, Landroidx/activity/ۦۧۥۥ;->ۢۦۨ۟(Ljava/lang/Object;Z)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v7, 0x41000000    # 8.0f

    invoke-static {v5, v7}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v1, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v5

    invoke-static {v5, v1}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤۢ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v5

    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v7, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v5, v7}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/view/View;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v1, v5}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lkevin/fun/hook/DYHook$CommentViewHolder;->mask:Landroid/view/View;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۣ۟۠ۤۢ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v1

    const v5, -0x7fffff3d

    sget v7, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->۟ۢۤۧ:I

    xor-int/2addr v5, v7

    invoke-static {v1, v5}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۣ۟۠ۤۢ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    new-instance v7, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v7, v6, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {v1, v5, v7}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v1, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lkevin/fun/hook/DYHook$CommentViewHolder;->indexBadge:Landroid/widget/TextView;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v1, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    const/high16 v5, 0x41400000    # 12.0f

    invoke-static {v1, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    sget v5, Landroidx/documentfile/ۡۢ۟ۥ;->ۧۤ۠ۥ:I

    xor-int/lit16 v5, v5, -0x249

    invoke-static {v1, v5}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v5, 0x1

    invoke-static {v1, v5}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۤۨۦۡ(Ljava/lang/Object;I)V

    const v5, -0x1d0a8

    sget v7, Landroidx/lifecycle/livedata/ۡۢۦۦ;->۟ۡۧ۟ۧ:I

    xor-int/2addr v5, v7

    invoke-static {v1, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v5

    invoke-static {v5, v1}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v8}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v8}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v7

    invoke-direct {v1, v5, v7}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v5, 0x800035

    iput v5, v1, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v9}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v9}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v1, v2, v5, v7, v2}, Landroidx/loader/ۡۢۢ;->ۢۢ۠ۢ(Ljava/lang/Object;IIII)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;

    move-result-object v5

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v7

    invoke-static {v5, v7, v1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v1, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-direct {v1, v5}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    iput-object v1, v0, Lkevin/fun/hook/DYHook$CommentViewHolder;->liveBadge:Landroid/widget/TextView;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DYHook$89;->ۧ۠ۦۤ()[S

    move-result-object v5

    sget v7, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۨ۠ۦۡ:I

    xor-int/lit8 v7, v7, -0x38

    const/16 v8, 0x223

    invoke-static {v5, v2, v7, v8}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1, v5}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {v1, v6}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    const/high16 v5, 0x41200000    # 10.0f

    invoke-static {v1, v5}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    invoke-static {v5, v9}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v10}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v6

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v7

    invoke-static {v7, v9}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v7

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v8

    invoke-static {v8, v10}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v1, v5, v6, v7, v8}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v1}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const v5, 0x33fffc39

    sget v6, Lorg/luckypray/dexkit/۟ۥۤۤۦ;->ۣۣۧۢ:I

    xor-int/2addr v5, v6

    invoke-static {v1, v5}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x40800000    # 4.0f

    invoke-static {v5, v6}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v5

    int-to-float v5, v5

    invoke-static {v1, v5}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v5

    invoke-static {v5, v1}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/ۨۧۢ۟;->ۨۤۨۡ:I

    xor-int/lit16 v1, v1, 0x3a4

    new-instance v5, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v5, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v1, 0x800053

    iput v1, v5, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    invoke-static {v1, v9}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->۟ۤ۟ۧۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    invoke-static {v6, v9}, Lkevin/fun/hook/DYHook$89;->ۢۨۨ۟(Ljava/lang/Object;F)I

    move-result v6

    invoke-static {v5, v1, v2, v2, v6}, Landroidx/loader/ۡۢۢ;->ۢۢ۠ۢ(Ljava/lang/Object;IIII)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;

    move-result-object v1

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v6

    invoke-static {v1, v6, v5}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;

    move-result-object p2

    invoke-static {p2, v0}, Landroidx/activity/ۦۧۥۥ;->۟ۢۡۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v1, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v1, v0

    :goto_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟ۤۢۧ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/DYHook$CommentImageInfo;

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۨۡۢۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v6

    const/4 v7, 0x0

    invoke-static {v6, v7}, Landroidx/emoji2/ۢۧۡۧ;->ۣۢۢۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v6

    invoke-static {v6, v4}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟ۦۥۦ(Ljava/lang/Object;I)V

    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v4

    invoke-static {v4, v5}, Landroidx/startup/۟ۦۤۨۧ;->ۡۦ۠۠(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟۟ۥۢ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v4

    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->۟۠۠۟۟(Ljava/lang/Object;)Landroid/widget/ImageView;

    move-result-object v6

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/DYHook$89;->ۣ۠ۨ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->۟ۥ۠ۨۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v4

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->ۡۡ۠ۨ(Ljava/lang/Object;)Z

    move-result v5

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-eqz v5, :cond_1

    const v0, 0xbe60

    goto :goto_3

    :sswitch_6
    invoke-static {p2}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۠ۨۥۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lkevin/fun/hook/DYHook$CommentViewHolder;

    move-object v1, v0

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    const v0, 0xbe7f

    :goto_4
    const v5, 0xbe90

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_9
    move v0, v2

    :goto_5
    invoke-static {v4, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟ۢ۟۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Landroidx/customview/ۤۡۥ;->۟ۤ۟ۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->ۣ۟۠ۤۢ(Ljava/lang/Object;)Landroid/view/View;

    move-result-object v5

    const v0, 0xbefb

    :goto_6
    const v6, 0xbf0c

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_4

    goto :goto_6

    :cond_2
    :sswitch_a
    const v0, 0xbf39

    goto :goto_6

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_4

    :sswitch_c
    move v0, v3

    goto :goto_5

    :sswitch_d
    if-eqz v4, :cond_2

    const v0, 0xc1e3

    goto :goto_6

    :sswitch_e
    const v0, 0xc202

    :goto_7
    const v6, 0xc213

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_f
    const v0, 0xc221

    goto :goto_7

    :sswitch_10
    move v0, v2

    :goto_8
    invoke-static {v5, v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۣۢ۠(Ljava/lang/Object;I)V

    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v5

    const v0, 0xc27e

    :goto_9
    const v6, 0xc28f

    xor-int/2addr v0, v6

    sparse-switch v0, :sswitch_data_6

    goto :goto_9

    :cond_3
    :sswitch_11
    const v0, 0xc2bc

    goto :goto_9

    :sswitch_12
    move v0, v3

    goto :goto_8

    :sswitch_13
    if-eqz v4, :cond_3

    const v0, 0xc2db

    goto :goto_9

    :sswitch_14
    const v0, 0xc2fa

    :goto_a
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_a

    :sswitch_15
    const v0, 0xc5a4

    goto :goto_a

    :sswitch_16
    move v3, v2

    :sswitch_17
    invoke-static {v5, v3}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    const v0, 0xc601

    :goto_b
    const v3, 0xc612

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_8

    goto :goto_b

    :sswitch_18
    if-eqz v4, :cond_4

    const v0, 0xc65e

    goto :goto_b

    :cond_4
    :sswitch_19
    const v0, 0xc63f

    goto :goto_b

    :sswitch_1a
    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟ۢ۟۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/۟ۥ۠۠;->ۣ۟۟ۤ۟(Ljava/lang/Object;)Ljava/util/Iterator;

    move-result-object v3

    :sswitch_1b
    invoke-static {v3}, Landroidx/activity/ۣۦۡۥ;->ۣ۟ۧۧۡ(Ljava/lang/Object;)Z

    move-result v4

    const v0, 0xc67d

    :goto_c
    const v5, 0xc68e

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_9

    goto :goto_c

    :cond_5
    :sswitch_1c
    const v0, 0xc6bb

    goto :goto_c

    :sswitch_1d
    if-nez v4, :cond_5

    const v0, 0xc965

    goto :goto_c

    :sswitch_1e
    const v0, 0xc984

    :goto_d
    const v3, 0xc995

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_a

    goto :goto_d

    :sswitch_1f
    const v0, 0xc9a3

    goto :goto_d

    :sswitch_20
    invoke-static {v3}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۦۥۦۥ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    invoke-static {v0}, Landroidx/interpolator/ۣ۟ۤۢۧ;->۟ۤۡۧ۠(Ljava/lang/Object;)I

    move-result v4

    const v0, 0xca00

    :goto_e
    const v5, 0xca11

    xor-int/2addr v0, v5

    sparse-switch v0, :sswitch_data_b

    goto :goto_e

    :cond_6
    :sswitch_21
    const v0, 0xca3e

    goto :goto_e

    :sswitch_22
    if-ne v4, p1, :cond_6

    const v0, 0xca5d

    goto :goto_e

    :sswitch_23
    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->۟ۥۨۢۦ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    sget v3, Landroidx/activity/ۣۦۡۥ;->ۣۢۤۡ:I

    xor-int/lit8 v3, v3, 0x3

    add-int/2addr v2, v3

    invoke-static {v2}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۢۨ۠(I)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const v0, 0xca7c

    :goto_f
    const v2, 0xca8d

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_c

    goto :goto_f

    :sswitch_24
    const v0, 0xcd26

    goto :goto_f

    :sswitch_25
    sget v0, Landroidx/appcompat/resources/ۦۨۦۢ;->۟ۧ۠۠ۡ:I

    xor-int/lit16 v0, v0, 0x20f

    add-int/2addr v2, v0

    const v0, 0xcd83

    :goto_10
    const v4, 0xcd94

    xor-int/2addr v0, v4

    sparse-switch v0, :sswitch_data_d

    goto :goto_10

    :sswitch_26
    const v0, 0xcda2

    goto :goto_10

    :sswitch_27
    invoke-static {v1}, Lkevin/fun/hook/DYHook$89;->ۦ۠ۤۧ(Ljava/lang/Object;)Landroid/widget/FrameLayout;

    move-result-object v0

    new-instance v1, Lkevin/fun/hook/DYHook$89$$ExternalSyntheticLambda0;

    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟ۢ۟۠(Ljava/lang/Object;)Ljava/util/Set;

    move-result-object v2

    invoke-direct {v1, p0, v2, p1}, Lkevin/fun/hook/DYHook$89$$ExternalSyntheticLambda0;-><init>(Lkevin/fun/hook/DYHook$89;Ljava/util/Set;I)V

    invoke-static {v0, v1}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p2

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_6
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_5
        0xb918 -> :sswitch_c
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_9
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_a
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_d
        0x7eef -> :sswitch_e
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_f
        0x32 -> :sswitch_10
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_11
        0x33 -> :sswitch_17
        0x54 -> :sswitch_14
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_18
        0x2d -> :sswitch_27
        0x32 -> :sswitch_19
        0x4c -> :sswitch_1a
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0x35 -> :sswitch_20
        0xf3 -> :sswitch_1d
        0xfeb -> :sswitch_1e
    .end sparse-switch

    :sswitch_data_a
    .sparse-switch
        0x11 -> :sswitch_1f
        0x36 -> :sswitch_23
    .end sparse-switch

    :sswitch_data_b
    .sparse-switch
        0xe -> :sswitch_21
        0x11 -> :sswitch_22
        0x2f -> :sswitch_25
        0x4c -> :sswitch_23
    .end sparse-switch

    :sswitch_data_c
    .sparse-switch
        0xf1 -> :sswitch_24
        0x7ab -> :sswitch_27
    .end sparse-switch

    :sswitch_data_d
    .sparse-switch
        0x17 -> :sswitch_26
        0x36 -> :sswitch_1b
    .end sparse-switch
.end method

.method synthetic lambda$0$kevin-fun-hook-DYHook$89(Ljava/util/Set;ILandroid/view/View;)V
    .locals 7

    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/customview/ۤۡۥ;->۟ۤ۟ۤۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

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
    if-eqz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/appcompat/ۣۧۤۢ;->ۣۣ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :sswitch_4
    invoke-static {p2}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p1, v0}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۤۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟۟ۥۢ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۠ۤ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_6
    if-eqz v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_7
    const v0, 0xbe41

    goto :goto_2

    :sswitch_8
    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۣ۟۟ۥۢ(Ljava/lang/Object;)Lkevin/fun/hook/DYHook;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/DYHook$89;->۠ۤ(Ljava/lang/Object;)Landroid/widget/TextView;

    move-result-object v0

    invoke-static {p1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۥۣۡۡ(Ljava/lang/Object;)I

    move-result v1

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/DYHook$89;->ۧ۠ۦۤ()[S

    move-result-object v3

    const/4 v4, 0x2

    sget v5, Landroidx/core/ۧ۟ۤۨ;->ۣۤ۠ۤ:I

    xor-int/lit16 v5, v5, 0x1ba

    const/16 v6, 0xb77

    invoke-static {v3, v4, v5, v6}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۥۧۤ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-static {v2, v1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/DYHook$89;->ۧ۠ۦۤ()[S

    move-result-object v2

    const/4 v3, 0x7

    const/4 v4, 0x1

    const/16 v5, 0x85f

    invoke-static {v2, v3, v4, v5}, Landroidx/core/ktx/۟۟ۨۧ۠;->۟ۧ۟ۧۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_9
    invoke-static {p0}, Lkevin/fun/hook/DYHook$89;->ۨۤۢۧ(Ljava/lang/Object;)V

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

    move-result v1

    const v0, 0xbe7f

    :goto_3
    const v2, 0xbe90

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :cond_2
    :sswitch_a
    const v0, 0xbebd

    goto :goto_3

    :sswitch_b
    if-ltz v1, :cond_2

    const v0, 0xbedc

    goto :goto_3

    :sswitch_c
    const-string v0, "deYn"

    invoke-static {v0}, Lorg/luckypray/dexkit/۠۠ۥ;->ۣ۠ۢۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

    :sswitch_d
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_d
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch
.end method
