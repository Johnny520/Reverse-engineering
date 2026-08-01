.class Lkevin/fun/hook/XhsHook$9;
.super Landroid/widget/BaseAdapter;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/XhsHook;->showImageGridPanel(Landroid/content/Context;Ljava/util/List;Lorg/json/JSONObject;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field final this$0:Lkevin/fun/hook/XhsHook;

.field private final val$context:Landroid/content/Context;

.field private final val$imageUrls:Ljava/util/List;

.field private final val$isLivePhotoList:Ljava/util/List;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x39

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lkevin/fun/hook/XhsHook$9;->short:[S

    return-void

    :array_0
    .array-data 2
        0x349s
        0x32fs
        0x35as
        0x32fs
        0x35as
        0x32fs
        0x35as
        0x5991s
        0x53bas
        0x303s
        0x338s
        0x331s
        0x322s
        0x335s
        0x305s
        0x323s
        0x335s
        0x322s
        0x306s
        0x339s
        0x335s
        0x327s
        0x318s
        0x33fs
        0x33fs
        0x33bs
        0x370s
        0x337s
        0x335s
        0x324s
        0x306s
        0x339s
        0x335s
        0x327s
        0x370s
        0x336s
        0x331s
        0x339s
        0x33cs
        0x335s
        0x334s
        0x370s
        0x336s
        0x33fs
        0x322s
        0x370s
        0x320s
        0x33fs
        0x323s
        0x339s
        0x324s
        0x339s
        0x33fs
        0x33es
        0x370s
        0x697s
        0x68ds
    .end array-data
.end method

.method constructor <init>(Lkevin/fun/hook/XhsHook;Ljava/util/List;Landroid/content/Context;Ljava/util/List;)V
    .locals 3

    iput-object p1, p0, Lkevin/fun/hook/XhsHook$9;->this$0:Lkevin/fun/hook/XhsHook;

    iput-object p2, p0, Lkevin/fun/hook/XhsHook$9;->val$imageUrls:Ljava/util/List;

    iput-object p3, p0, Lkevin/fun/hook/XhsHook$9;->val$context:Landroid/content/Context;

    iput-object p4, p0, Lkevin/fun/hook/XhsHook$9;->val$isLivePhotoList:Ljava/util/List;

    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    invoke-static {}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۢۦۥۢ()I

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
    const-string v0, "dGCJQuaVcgDeldYaco"

    invoke-static {v0}, Landroidx/lifecycle/runtime/۟ۢ۠۠ۨ;->ۧۢ۟ۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public static ۟ۡ۟ۡۥ(Ljava/lang/Object;)Ljava/util/List;
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
    check-cast p0, Lkevin/fun/hook/XhsHook$9;

    iget-object v0, p0, Lkevin/fun/hook/XhsHook$9;->val$imageUrls:Ljava/util/List;

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

.method public static ۣ۟ۡۡ۟()[S
    .locals 2

    invoke-static {}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟ۢۢۥ()I

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
    sget-object v0, Lkevin/fun/hook/XhsHook$9;->short:[S

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

.method public static ۟ۡۧۦ(Ljava/lang/Object;)Z
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook;->_$$Nest$fgetisMultiSelectDragging(Lkevin/fun/hook/XhsHook;)Z

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

.method public static ۟ۢۥ۠ۤ(Ljava/lang/Object;Z)V
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
    if-gez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/XhsHook;->_$$Nest$fputisMultiSelectDragging(Lkevin/fun/hook/XhsHook;Z)V

    :sswitch_3
    invoke-static {}, Landroidx/appcompat/ۣۧۤۢ;->ۢ۟۟ۨ()I

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
    const-string v0, "p9qws9Heqfzr9JkuMqdZze9pDpMM"

    invoke-static {v0}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->۟ۡ۠ۢ۠(Ljava/lang/String;)Ljava/lang/String;

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

.method public static ۣ۟ۢۨۨ(Ljava/lang/Object;)Ljava/util/List;
    .locals 2

    invoke-static {}, Landroidx/viewpager/ۣۢ۟ۤ;->ۥ۠ۤ()I

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
    check-cast p0, Lkevin/fun/hook/XhsHook$9;

    iget-object v0, p0, Lkevin/fun/hook/XhsHook$9;->val$isLivePhotoList:Ljava/util/List;

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

.method public static ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I
    .locals 2

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
    if-lez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook;

    check-cast p1, Landroid/content/Context;

    invoke-static {p0, p1, p2}, Lkevin/fun/hook/XhsHook;->_$$Nest$mdipToPx(Lkevin/fun/hook/XhsHook;Landroid/content/Context;F)I

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

.method public static ۣ۟ۦۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
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
    check-cast p0, Lkevin/fun/hook/XhsHook;

    check-cast p1, Ljava/lang/String;

    check-cast p2, Landroid/widget/ImageView;

    invoke-static {p0, p1, p2, p3}, Lkevin/fun/hook/XhsHook;->_$$Nest$mloadImageFast(Lkevin/fun/hook/XhsHook;Ljava/lang/String;Landroid/widget/ImageView;I)V

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

.method public static ۣ۟ۤۦۤ(Ljava/lang/Object;)I
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
    check-cast p0, Lkevin/fun/hook/XhsHook;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook;->_$$Nest$fgetlastDragPosition(Lkevin/fun/hook/XhsHook;)I

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

.method public static ۟ۦۣۡۨ(Ljava/lang/Object;)Ljava/util/List;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook;->_$$Nest$fgetselectedIndex(Lkevin/fun/hook/XhsHook;)Ljava/util/List;

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

.method public static ۡۨۨۡ(Ljava/lang/Object;I)V
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
    check-cast p0, Lkevin/fun/hook/XhsHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/XhsHook;->_$$Nest$fputlastDragPosition(Lkevin/fun/hook/XhsHook;I)V

    :sswitch_3
    invoke-static {}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣ۟ۢۡ۟()I

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
    const-string v0, "2c370QapvXAVWT"

    invoke-static {v0}, Landroidx/startup/ۤۧۥۣ;->۟ۡ۟ۡۢ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

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

.method public static ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;
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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/XhsHook$9;

    iget-object v0, p0, Lkevin/fun/hook/XhsHook$9;->this$0:Lkevin/fun/hook/XhsHook;

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

.method public static ۨۢۦۣ(Ljava/lang/Object;I)V
    .locals 2

    invoke-static {}, Landroidx/core/ۤۦ۟ۢ;->ۣۧۧۡ()I

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
    check-cast p0, Lkevin/fun/hook/XhsHook;

    invoke-static {p0, p1}, Lkevin/fun/hook/XhsHook;->_$$Nest$mtoggleSelect(Lkevin/fun/hook/XhsHook;I)V

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

.method public static ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

    invoke-static {}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۢ۠ۨ۟()I

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
    check-cast p0, Lkevin/fun/hook/XhsHook$9;

    iget-object v0, p0, Lkevin/fun/hook/XhsHook$9;->val$context:Landroid/content/Context;

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

.method public static ۨۤۥۤ(Ljava/lang/Object;)V
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
    check-cast p0, Ljava/lang/String;

    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    :sswitch_3
    invoke-static {}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟ۡۤۦ۟()I

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
    const-string v0, "N8AksB74Qh8lg3ihsE"

    invoke-static {v0}, Landroidx/viewpager/ۣۢ۟ۤ;->۟ۧۤ۟ۥ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

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

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->۟ۡ۟ۡۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public getItem(I)Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->۟ۡ۟ۡۥ(Ljava/lang/Object;)Ljava/util/List;

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
    new-instance p2, Landroid/widget/FrameLayout;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p2, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x42dc0000    # 110.0f

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v0

    sget v1, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v3, v1, 0x3c3

    new-instance v1, Landroid/widget/AbsListView$LayoutParams;

    invoke-direct {v1, v3, v0}, Landroid/widget/AbsListView$LayoutParams;-><init>(II)V

    invoke-static {p2, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣۡ۠۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {v0, v3}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v4, 0x41000000    # 8.0f

    invoke-static {v1, v2, v4}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v1

    int-to-float v1, v1

    invoke-static {v0, v1}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v1, v2, v4}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v1

    invoke-static {}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۡۡ۟()[S

    move-result-object v2

    const/4 v4, 0x0

    sget v5, Landroidx/loader/ۡۢۢ;->ۣۡۦ۟:I

    xor-int/lit16 v5, v5, -0x3ba

    const/16 v6, 0x36a

    invoke-static {v2, v4, v5, v6}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۨۤ۠۠([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lkevin/fun/hook/audio/۟۟ۦۨۤ;->۟ۤۦۦۣ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {v0, v1, v2}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۣ۟ۧ۟۠(Ljava/lang/Object;II)V

    invoke-static {p2, v0}, Landroidx/appcompat/ۣۧۤۢ;->۟ۦۣۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v1

    const/high16 v2, 0x40000000    # 2.0f

    invoke-static {v0, v1, v2}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v1

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v4, 0x40000000    # 2.0f

    invoke-static {v1, v2, v4}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v1

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const/high16 v5, 0x40000000    # 2.0f

    invoke-static {v2, v4, v5}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v2

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x40000000    # 2.0f

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    invoke-static {p2, v0, v1, v2, v4}, Landroidx/documentfile/ۡۢ۟ۥ;->ۣ۟۠ۧ(Ljava/lang/Object;IIII)V

    new-instance v1, Landroid/widget/ImageView;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {v1, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Landroidx/loader/ۣ۟۟ۧ۠;->ۣ۟۠۠ۦ()Landroid/widget/ImageView$ScaleType;

    move-result-object v0

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->۟ۦۦۢۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v2

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-static {v2, v4, v5}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v1, v0}, Landroidx/lifecycle/process/۠ۢۧۡ;->ۣ۟ۤۢ۠(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {p2, v1, v0}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Landroid/view/View;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2}, Landroid/view/View;-><init>(Landroid/content/Context;)V

    const v2, -0x55ff40f5

    sget v4, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۣۧۦ۟:I

    xor-int/2addr v2, v4

    invoke-static {v0, v2}, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۤۥۧ(Ljava/lang/Object;I)V

    new-instance v2, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v2}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x41000000    # 8.0f

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v2, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v0, v2}, Landroidx/core/ktx/۟۟ۡۢ۠;->۟۟ۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v2, 0x8

    invoke-static {v0, v2}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۣۢ۠(Ljava/lang/Object;I)V

    new-instance v2, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v2, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-static {p2, v0, v2}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v2, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    invoke-direct {v2, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {v2, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v2, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    sget v3, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۤۨۨ:I

    xor-int/lit16 v3, v3, 0x11d

    invoke-static {v2, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    const/16 v3, 0x8

    invoke-static {v2, v3}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v4, 0x1

    invoke-static {v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۤۨۦۡ(Ljava/lang/Object;I)V

    const v4, -0x1ac549

    sget v5, Landroidx/core/ktx/۟۟ۨۧ۠;->ۦۡۡ۠:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {v2, v3}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v3, Landroid/widget/FrameLayout$LayoutParams;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v6, 0x41b00000    # 22.0f

    invoke-static {v4, v5, v6}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v5

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    const/high16 v7, 0x41b00000    # 22.0f

    invoke-static {v5, v6, v7}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    invoke-direct {v3, v4, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v4, 0x800035

    iput v4, v3, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    const/4 v4, 0x0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v5

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v6

    const/high16 v7, 0x40800000    # 4.0f

    invoke-static {v5, v6, v7}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v6

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v7

    const/high16 v8, 0x40800000    # 4.0f

    invoke-static {v6, v7, v8}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v6

    const/4 v7, 0x0

    invoke-static {v3, v4, v5, v6, v7}, Landroidx/loader/ۡۢۢ;->ۢۢ۠ۢ(Ljava/lang/Object;IIII)V

    invoke-static {p2, v2, v3}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v6, Landroid/widget/TextView;

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v3

    invoke-direct {v6, v3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    invoke-static {}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۡۡ۟()[S

    move-result-object v3

    const/4 v4, 0x7

    sget v5, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۧۢۤۦ:I

    xor-int/lit8 v5, v5, -0x12

    const/16 v7, 0x20f

    invoke-static {v3, v4, v5, v7}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v3

    invoke-static {v6, v3}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v3, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۢۡۡۥ:I

    xor-int/lit8 v3, v3, -0x53

    invoke-static {v6, v3}, Lkevin/fun/hook/webdav/۟۟ۤۥۢ;->ۣۡ۠ۢ(Ljava/lang/Object;I)V

    const/high16 v3, 0x41200000    # 10.0f

    invoke-static {v6, v3}, Landroidx/vectordrawable/animated/ۣ۟ۧۨ;->ۣۡۤۡ(Ljava/lang/Object;F)V

    sget v3, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۡۦۥۨ:I

    xor-int/lit16 v3, v3, 0x10f

    invoke-static {v6, v3}, Landroidx/documentfile/ۡۢ۟ۥ;->۟ۥۦۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v3

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v4

    const/high16 v5, 0x40c00000    # 6.0f

    invoke-static {v3, v4, v5}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v3

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v7, 0x40400000    # 3.0f

    invoke-static {v4, v5, v7}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v5

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v7

    const/high16 v8, 0x40c00000    # 6.0f

    invoke-static {v5, v7, v8}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v5

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v7

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v8

    const/high16 v9, 0x40400000    # 3.0f

    invoke-static {v7, v8, v9}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v7

    invoke-static {v6, v3, v4, v5, v7}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۟ۦۧۢ(Ljava/lang/Object;IIII)V

    new-instance v3, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v3}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v4, 0x0

    invoke-static {v3, v4}, Landroidx/lifecycle/viewmodel/۟ۧ۟ۤۧ;->ۤۨۦۡ(Ljava/lang/Object;I)V

    const v4, 0x66ffff9d

    sget v5, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->ۧۨۨ:I

    xor-int/2addr v4, v5

    invoke-static {v3, v4}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v4

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v7, 0x40800000    # 4.0f

    invoke-static {v4, v5, v7}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v4

    int-to-float v4, v4

    invoke-static {v3, v4}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {v6, v3}, Landroidx/core/ۧ۟ۤۨ;->ۣ۟ۢۧ۟(Ljava/lang/Object;Ljava/lang/Object;)V

    sget v3, Landroidx/loader/ۥۧۨۤ;->ۣ۟ۨ۠ۨ:I

    xor-int/lit16 v3, v3, -0x35b

    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v4, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    const v3, 0x800053

    iput v3, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v3

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v5

    const/high16 v7, 0x40c00000    # 6.0f

    invoke-static {v3, v5, v7}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v3

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v8

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۣۨۦ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v9

    const/high16 v10, 0x40c00000    # 6.0f

    invoke-static {v8, v9, v10}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۣۢ(Ljava/lang/Object;Ljava/lang/Object;F)I

    move-result v8

    invoke-static {v4, v3, v5, v7, v8}, Landroidx/loader/ۡۢۢ;->ۢۢ۠ۢ(Ljava/lang/Object;IIII)V

    invoke-static {p2, v6, v4}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۤ۠ۦۡ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v3, 0x4

    new-array v3, v3, [Landroid/view/View;

    const/4 v4, 0x0

    aput-object v1, v3, v4

    const/4 v4, 0x1

    aput-object v0, v3, v4

    const/4 v4, 0x2

    aput-object v2, v3, v4

    const/4 v4, 0x3

    aput-object v6, v3, v4

    invoke-static {p2, v3}, Landroidx/activity/ۤۧۧۧ;->۟ۤۨۤۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/16 v3, 0x6cc

    :goto_1
    xor-int/lit16 v3, v3, 0x6dd

    sparse-switch v3, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v3, 0x6eb

    goto :goto_1

    :sswitch_4
    move-object v3, v0

    move-object v4, v2

    move-object v5, v1

    :goto_2
    :try_start_0
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->۟ۡ۟ۡۥ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۢۨۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    invoke-static {v2}, Landroidx/lifecycle/livedata/ۥ۠۟ۥ;->ۥۨۨ۠(Ljava/lang/Object;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result v7

    const/16 v2, 0x748

    :goto_3
    xor-int/lit16 v2, v2, 0x759

    sparse-switch v2, :sswitch_data_2

    goto :goto_3

    :sswitch_5
    if-ge p1, v7, :cond_1

    const v2, 0xbe60

    goto :goto_3

    :sswitch_6
    check-cast p2, Landroid/widget/FrameLayout;

    invoke-static {p2}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۣۥۥۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Landroid/view/View;

    const/4 v1, 0x0

    aget-object v1, v0, v1

    check-cast v1, Landroid/widget/ImageView;

    const/4 v2, 0x1

    aget-object v3, v0, v2

    const/4 v2, 0x2

    aget-object v2, v0, v2

    check-cast v2, Landroid/widget/TextView;

    const/4 v4, 0x3

    aget-object v0, v0, v4

    check-cast v0, Landroid/widget/TextView;

    move-object v4, v2

    move-object v5, v1

    move-object v6, v0

    goto :goto_2

    :cond_1
    :sswitch_7
    const v2, 0xbe41

    goto :goto_3

    :sswitch_8
    :try_start_1
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۢۨۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-static {v1, p1}, Landroidx/drawerlayout/ۤۨۡۤ;->۟ۦۣ۟۠(Ljava/lang/Object;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-static {v1}, Landroidx/activity/ۤۧۧۧ;->ۦۣۡ۠(Ljava/lang/Object;)Z

    move-result v1

    :sswitch_9
    const v2, 0xbe7f

    :goto_4
    const v7, 0xbe90

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_3

    goto :goto_4

    :cond_2
    :sswitch_a
    const v2, 0xbebd

    goto :goto_4

    :sswitch_b
    if-eqz v1, :cond_2

    const v2, 0xbedc

    goto :goto_4

    :sswitch_c
    const/4 v1, 0x0

    const v2, 0xbefb

    :goto_5
    const v7, 0xbf0c

    xor-int/2addr v2, v7

    sparse-switch v2, :sswitch_data_4

    goto :goto_5

    :goto_6
    :sswitch_d
    invoke-static {v6, v1}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v1

    const/4 v2, 0x0

    invoke-static {v1, v0, v5, v2}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۦۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$9;->۟ۦۣۡۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->۠ۧۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xc202

    :goto_7
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :sswitch_e
    if-eqz v2, :cond_3

    const v0, 0xc25f

    goto :goto_7

    :sswitch_f
    const v2, 0xbf1a

    goto :goto_5

    :sswitch_10
    const/16 v1, 0x8

    goto :goto_6

    :cond_3
    :sswitch_11
    const v0, 0xc240

    goto :goto_7

    :sswitch_12
    const/4 v0, 0x0

    const v1, 0xc27e

    :goto_8
    const v5, 0xc28f

    xor-int/2addr v1, v5

    sparse-switch v1, :sswitch_data_6

    goto :goto_8

    :goto_9
    :sswitch_13
    invoke-static {v3, v0}, Landroidx/vectordrawable/۟ۤۨۥۣ;->ۣۣۢ۠(Ljava/lang/Object;I)V

    const v0, 0xc2fa

    :goto_a
    const v1, 0xc30b

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_7

    goto :goto_a

    :sswitch_14
    if-eqz v2, :cond_4

    const v0, 0xc5e2

    goto :goto_a

    :sswitch_15
    const v1, 0xc29d

    goto :goto_8

    :sswitch_16
    const/16 v0, 0x8

    goto :goto_9

    :cond_4
    :sswitch_17
    const v0, 0xc5c3

    goto :goto_a

    :sswitch_18
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$9;->۟ۦۣۡۨ(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {p1}, Landroidx/activity/ۤۧۧۧ;->ۣ۟ۦۣ۠(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۣ۟۠ۨ۠(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-static {v0}, Landroidx/documentfile/ۡۢ۟ۥ;->ۢۢۨ۠(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v4, v0}, Landroidx/lifecycle/process/۟۠ۧۤۦ;->۟۟ۥۨۥ(Ljava/lang/Object;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v4, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    const v0, 0xc601

    :goto_b
    const v1, 0xc612

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_8

    goto :goto_b

    :sswitch_19
    const v0, 0xc620

    goto :goto_b

    :sswitch_1a
    sget v0, Landroidx/loader/۟۠ۢۧۡ;->ۤۥۧۨ:I

    xor-int/lit16 v0, v0, -0x3cc

    invoke-static {v4, v0}, Landroidx/loader/۟۠ۢۧۡ;->ۦۡ۠ۨ(Ljava/lang/Object;I)V

    :sswitch_1b
    new-instance v0, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda0;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda0;-><init>(Lkevin/fun/hook/XhsHook$9;I)V

    invoke-static {p2, v0}, Landroidx/emoji2/viewsintegration/ۤ۠۠۟;->ۥۥۥۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda1;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda1;-><init>(Lkevin/fun/hook/XhsHook$9;I)V

    invoke-static {p2, v0}, Landroidx/activity/ۣۦۡۥ;->۟ۦۤۨۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    new-instance v0, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda2;

    invoke-direct {v0, p0, p1}, Lkevin/fun/hook/XhsHook$9$$ExternalSyntheticLambda2;-><init>(Lkevin/fun/hook/XhsHook$9;I)V

    invoke-static {p2, v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->ۣ۟ۢ۠ۢ(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const v0, 0xc67d

    :goto_c
    const v1, 0xc68e

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_9

    goto :goto_c

    :goto_d
    :sswitch_1c
    return-object p2

    :sswitch_1d
    const v0, 0xc69c

    goto :goto_c

    :catchall_0
    move-exception v0

    invoke-static {v0}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۦۣۡۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۡۡ۟()[S

    move-result-object v2

    const/16 v3, 0x9

    sget v4, Landroidx/startup/ۤۧۥۣ;->ۦ۟ۨۥ:I

    xor-int/lit16 v4, v4, 0x2d0

    const/16 v5, 0x350

    invoke-static {v2, v3, v4, v5}, Landroidx/emoji2/ۢۧۡۧ;->۟ۥۢ۟ۢ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, p1}, Ldev/rikka/ndk/thirdparty/libcxx/۟ۦۤۡ۟;->ۣ۟ۢۤ۟(Ljava/lang/Object;I)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۡۡ۟()[S

    move-result-object v2

    const/16 v3, 0x37

    sget v4, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v4, v4, -0x321

    const/16 v5, 0x6ad

    invoke-static {v2, v3, v4, v5}, Landroidx/loader/ۡۢۢ;->ۡ۟ۧۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۢۡۦۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۥۢۡۤ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$9;->ۨۤۥۤ(Ljava/lang/Object;)V

    goto :goto_d

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
        0xb918 -> :sswitch_9
        0xb939 -> :sswitch_8
        0xb97b -> :sswitch_7
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_a
        0x2d -> :sswitch_10
        0x4c -> :sswitch_c
        0xef -> :sswitch_b
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_d
        0x1f7 -> :sswitch_f
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_e
        0x32 -> :sswitch_11
        0x4c -> :sswitch_12
        0x53 -> :sswitch_16
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_13
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_14
        0x6af -> :sswitch_17
        0x6c8 -> :sswitch_1a
        0x6e9 -> :sswitch_18
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x13 -> :sswitch_19
        0x32 -> :sswitch_1b
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x12 -> :sswitch_1c
        0xf3 -> :sswitch_1d
    .end sparse-switch
.end method

.method synthetic lambda$0$kevin-fun-hook-XhsHook$9(ILandroid/view/View;)V
    .locals 2

    const/4 v0, 0x0

    const-string v1, "\u06e4\u06e2"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {v0, p1}, Lkevin/fun/hook/XhsHook$9;->ۨۢۦۣ(Ljava/lang/Object;I)V

    const-string v1, "\u06e0\u06e7"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v1, "\u06e6\u06df\u06e8"

    goto :goto_0

    :sswitch_1
    return-void

    :sswitch_data_0
    .sparse-switch
        0xdc07 -> :sswitch_1
        0xdc7e -> :sswitch_0
    .end sparse-switch
.end method

.method synthetic lambda$1$kevin-fun-hook-XhsHook$9(ILandroid/view/View;)Z
    .locals 3

    const/4 v2, 0x1

    const/4 v0, 0x0

    const-string v1, "\u06e7\u06e7\u06df"

    :goto_0
    invoke-static {v1}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->ۥۢ۟ۡ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v1, "\u06e0\u06e6\u06e8"

    goto :goto_0

    :sswitch_0
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v1, "\u06e4\u06df"

    goto :goto_0

    :sswitch_1
    invoke-static {v0, p1}, Lkevin/fun/hook/XhsHook$9;->ۡۨۨۡ(Ljava/lang/Object;I)V

    const-string v1, "\u06e7\u06e8\u06e6"

    goto :goto_0

    :sswitch_2
    invoke-static {v0, v2}, Lkevin/fun/hook/XhsHook$9;->۟ۢۥ۠ۤ(Ljava/lang/Object;Z)V

    const-string v1, "\u06e0\u06e0"

    goto :goto_0

    :sswitch_3
    invoke-static {v0, p1}, Lkevin/fun/hook/XhsHook$9;->ۨۢۦۣ(Ljava/lang/Object;I)V

    const-string v1, "\u06e3\u06e4\u06e0"

    goto :goto_0

    :sswitch_4
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    const-string v1, "\u06e0\u06e2\u06e6"

    goto :goto_0

    :sswitch_5
    return v2

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_2
        0x1aab24 -> :sswitch_3
        0x1aaba2 -> :sswitch_1
        0x1ab69f -> :sswitch_5
        0x1ac5ff -> :sswitch_0
        0x1ac625 -> :sswitch_4
    .end sparse-switch
.end method

.method synthetic lambda$2$kevin-fun-hook-XhsHook$9(ILandroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 3

    const/4 v2, 0x0

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$9;->۟ۡۧۦ(Ljava/lang/Object;)Z

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
    if-nez v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p3}, Lkevin/fun/hook/audio/۟ۤۤۥۦ;->ۤ۠ۡ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    const/16 v0, 0x6eb

    goto :goto_1

    :pswitch_0
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {v0}, Lkevin/fun/hook/XhsHook$9;->ۣ۟ۤۦۤ(Ljava/lang/Object;)I

    move-result v1

    const/16 v0, 0x748

    :goto_2
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_2

    :sswitch_4
    if-eq p1, v1, :cond_1

    const v0, 0xbe60

    goto :goto_2

    :cond_1
    :sswitch_5
    const v0, 0xbe41

    goto :goto_2

    :sswitch_6
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {v0, p1}, Lkevin/fun/hook/XhsHook$9;->ۨۢۦۣ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {v0, p1}, Lkevin/fun/hook/XhsHook$9;->ۡۨۨۡ(Ljava/lang/Object;I)V

    const v0, 0xbe7f

    :goto_3
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_3

    :goto_4
    :sswitch_7
    return v2

    :sswitch_8
    const v0, 0xbe9e

    goto :goto_3

    :pswitch_1
    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    invoke-static {v0, v2}, Lkevin/fun/hook/XhsHook$9;->۟ۢۥ۠ۤ(Ljava/lang/Object;Z)V

    invoke-static {p0}, Lkevin/fun/hook/XhsHook$9;->ۣۤ۟ۢ(Ljava/lang/Object;)Lkevin/fun/hook/XhsHook;

    move-result-object v0

    sget v1, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟۟ۦۣۧ:I

    xor-int/lit8 v1, v1, 0x7a

    invoke-static {v0, v1}, Lkevin/fun/hook/XhsHook$9;->ۡۨۨۡ(Ljava/lang/Object;I)V

    goto :goto_4

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_7
        0xef -> :sswitch_2
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_4
        0xb918 -> :sswitch_7
        0xb939 -> :sswitch_6
        0xb97b -> :sswitch_5
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_7
        0xef -> :sswitch_8
    .end sparse-switch
.end method
