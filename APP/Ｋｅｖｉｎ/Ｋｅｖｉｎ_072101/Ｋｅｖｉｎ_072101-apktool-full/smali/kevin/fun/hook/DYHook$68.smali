.class Lkevin/fun/hook/DYHook$68;
.super Landroid/graphics/drawable/Drawable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lkevin/fun/hook/DYHook;->showDownloadDialog(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# static fields
.field private static final short:[S


# instance fields
.field private final paint:Landroid/graphics/Paint;

.field final this$0:Lkevin/fun/hook/DYHook;

.field private final val$ctx:Landroid/content/Context;

.field private final val$isWatermarkEnabled:Z

.field private final val$watermarkText:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/4 v0, 0x1

    new-array v0, v0, [S

    const/4 v1, 0x0

    const/16 v2, 0x8f9

    aput-short v2, v0, v1

    sput-object v0, Lkevin/fun/hook/DYHook$68;->short:[S

    return-void
.end method

.method constructor <init>(Lkevin/fun/hook/DYHook;Landroid/content/Context;ZLjava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lkevin/fun/hook/DYHook$68;->this$0:Lkevin/fun/hook/DYHook;

    iput-object p2, p0, Lkevin/fun/hook/DYHook$68;->val$ctx:Landroid/content/Context;

    iput-boolean p3, p0, Lkevin/fun/hook/DYHook$68;->val$isWatermarkEnabled:Z

    iput-object p4, p0, Lkevin/fun/hook/DYHook$68;->val$watermarkText:Ljava/lang/String;

    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    new-instance v0, Landroid/graphics/Paint;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/graphics/Paint;-><init>(I)V

    iput-object v0, p0, Lkevin/fun/hook/DYHook$68;->paint:Landroid/graphics/Paint;

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "2uQ43H57g8T"

    invoke-static {v0}, Landroidx/core/ۧ۟ۤۨ;->ۡۤ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Double;->valueOf(Ljava/lang/String;)Ljava/lang/Double;

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

.method public static ۣ۟ۨۢۡ(Ljava/lang/Object;)Ljava/lang/String;
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
    check-cast p0, Lkevin/fun/hook/DYHook$68;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$68;->val$watermarkText:Ljava/lang/String;

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

.method public static ۟ۥۨ۠ۥ(Ljava/lang/Object;)Landroid/content/Context;
    .locals 2

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$68;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$68;->val$ctx:Landroid/content/Context;

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

.method public static ۣ۟ۧۦۨ()[S
    .locals 2

    invoke-static {}, Landroidx/customview/ۤۡۥ;->۟ۢۢۦ()I

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
    sget-object v0, Lkevin/fun/hook/DYHook$68;->short:[S

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

.method public static ۣ۟ۥۢ(Ljava/lang/Object;)Landroid/graphics/Rect;
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
    check-cast p0, Lkevin/fun/hook/DYHook$68;

    invoke-virtual {p0}, Lkevin/fun/hook/DYHook$68;->getBounds()Landroid/graphics/Rect;

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

.method public static ۣۡۧ(Ljava/lang/Object;F)I
    .locals 2

    invoke-static {}, Lkevin/fun/hook/webdav/ۢۦۧ;->۟ۤۡۥۣ()I

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

.method public static ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$68;

    iget-object v0, p0, Lkevin/fun/hook/DYHook$68;->paint:Landroid/graphics/Paint;

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

.method public static ۣۤۨ۟(Ljava/lang/Object;)Z
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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    check-cast p0, Lkevin/fun/hook/DYHook$68;

    iget-boolean v0, p0, Lkevin/fun/hook/DYHook$68;->val$isWatermarkEnabled:Z

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


# virtual methods
.method public draw(Landroid/graphics/Canvas;)V
    .locals 14

    const/4 v1, 0x0

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    sget v2, Landroidx/loader/ۣ۟۟ۧ۠;->ۡۢ۟ۥ:I

    xor-int/lit16 v2, v2, -0x175

    invoke-static {v0, v2}, Landroidx/lifecycle/livedata/ۡۢۦۦ;->ۦۢۢۧ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->۟ۥۨ۠ۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41a00000    # 20.0f

    invoke-static {v2, v3}, Lkevin/fun/hook/DYHook$68;->ۣۡۧ(Ljava/lang/Object;F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v2}, Landroidx/lifecycle/process/ۨۦۧۦ;->۟ۥ۟ۢۧ(Ljava/lang/Object;F)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣ۟ۥۢ(Ljava/lang/Object;)Landroid/graphics/Rect;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/loader/ۡۢۢ;->ۤ۟ۤۡ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v0, p1}, Landroidx/lifecycle/process/ۨۦۧۦ;->ۣ۟۟ۢۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۤۨ۟(Ljava/lang/Object;)Z

    move-result v2

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
    if-eqz v2, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣ۟ۨۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroidx/activity/ۨ۠۟ۧ;->۟ۧ۟ۡ۠(Ljava/lang/Object;)Z

    move-result v2

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_3
    if-nez v2, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_4
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_5
    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;

    move-result-object v0

    const v2, 0x1a00022e

    sget v3, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/2addr v2, v3

    invoke-static {v0, v2}, Landroidx/lifecycle/process/ۣ۟۟ۨۥ;->۟۟ۡۨۥ(Ljava/lang/Object;I)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->۟ۥۨ۠ۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x41400000    # 12.0f

    invoke-static {v2, v3}, Lkevin/fun/hook/DYHook$68;->ۣۡۧ(Ljava/lang/Object;F)I

    move-result v2

    int-to-float v2, v2

    invoke-static {v0, v2}, Landroidx/activity/ۨ۠۟ۧ;->۟ۡ۟ۡۢ(Ljava/lang/Object;F)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-static {}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->ۧ۠ۧۨ()Landroid/graphics/Paint$Align;

    move-result-object v2

    invoke-static {v0, v2}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۥ۠ۦۣ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣ۟ۥۢ(Ljava/lang/Object;)Landroid/graphics/Rect;

    move-result-object v0

    invoke-static {v0}, Ldev/rikka/ndk/thirdparty/libcxx/ۢۧۤۢ;->۟ۨ۟ۢ(Ljava/lang/Object;)I

    move-result v6

    invoke-static {v0}, Landroidx/customview/ۤۡۥ;->۟ۤ۟ۤۨ(Ljava/lang/Object;)I

    move-result v7

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->۟ۥۨ۠ۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x42dc0000    # 110.0f

    invoke-static {v2, v3}, Lkevin/fun/hook/DYHook$68;->ۣۡۧ(Ljava/lang/Object;F)I

    move-result v8

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->۟ۥۨ۠ۥ(Ljava/lang/Object;)Landroid/content/Context;

    move-result-object v2

    const/high16 v3, 0x42b40000    # 90.0f

    invoke-static {v2, v3}, Lkevin/fun/hook/DYHook$68;->ۣۡۧ(Ljava/lang/Object;F)I

    move-result v9

    invoke-static {p1}, Landroidx/loader/ۣۦ۟ۡ;->۟۠ۢۨۥ(Ljava/lang/Object;)I

    invoke-static {p1, v0}, Landroidx/vectordrawable/ۢۤۡۤ;->۟ۡ۟۟۠(Ljava/lang/Object;Ljava/lang/Object;)Z

    move v4, v1

    :goto_2
    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_6
    add-int v0, v6, v8

    if-lt v4, v0, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_7
    const v0, 0xbe41

    goto :goto_3

    :sswitch_8
    invoke-static {p1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۡۧۢ(Ljava/lang/Object;)V

    const v0, 0xbe7f

    :goto_4
    const v1, 0xbe90

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :sswitch_9
    invoke-static {}, Landroidx/annotation/experimental/ۦ۟ۨۢ;->ۥۥۦۢ()I

    move-result v1

    const v0, 0xc67d

    :goto_5
    const v2, 0xc68e

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_3
    :sswitch_a
    const v0, 0xc6bb

    goto :goto_5

    :sswitch_b
    const v0, 0xbe9e

    goto :goto_4

    :sswitch_c
    move v3, v1

    :goto_6
    const v0, 0xbefb

    :goto_7
    const v2, 0xbf0c

    xor-int/2addr v0, v2

    sparse-switch v0, :sswitch_data_5

    goto :goto_7

    :cond_4
    :sswitch_d
    const v0, 0xbf39

    goto :goto_7

    :sswitch_e
    add-int v0, v7, v9

    if-lt v3, v0, :cond_4

    const v0, 0xc1e3

    goto :goto_7

    :sswitch_f
    add-int v0, v4, v8

    const v2, 0xc202

    :goto_8
    const v3, 0xc213

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_6

    goto :goto_8

    :sswitch_10
    const v2, 0xc221

    goto :goto_8

    :sswitch_11
    move v4, v0

    goto :goto_2

    :sswitch_12
    invoke-static {p1}, Landroidx/loader/ۣۦ۟ۡ;->۟۠ۢۨۥ(Ljava/lang/Object;)I

    const/high16 v0, -0x3df40000    # -35.0f

    int-to-float v2, v4

    int-to-float v5, v3

    invoke-static {p1, v0, v2, v5}, Lkevin/fun/hook/audio/۟۟ۤ۠ۦ;->۟ۤۢ۠ۡ(Ljava/lang/Object;FFF)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣ۟ۨۢۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lkevin/fun/hook/DYHook$68;->ۣ۟ۧۦۨ()[S

    move-result-object v2

    const/4 v5, 0x1

    const/16 v10, 0x8f3

    invoke-static {v2, v1, v5, v10}, Landroidx/versionedparcelable/۠ۡۧۤ;->۟۟ۤۢۡ([SIII)Ljava/lang/String;

    move-result-object v2

    invoke-static {v0, v2}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۢۦۣۨ(Ljava/lang/Object;Ljava/lang/Object;)[Ljava/lang/String;

    move-result-object v10

    int-to-float v2, v3

    array-length v11, v10

    move v0, v1

    :sswitch_13
    const v5, 0xc27e

    :goto_9
    const v12, 0xc28f

    xor-int/2addr v5, v12

    sparse-switch v5, :sswitch_data_7

    goto :goto_9

    :cond_5
    :sswitch_14
    const v5, 0xc2bc

    goto :goto_9

    :sswitch_15
    if-lt v0, v11, :cond_5

    const v5, 0xc2db

    goto :goto_9

    :sswitch_16
    invoke-static {p1}, Lkevin/fun/hook/audio/ۣۧۤۦ;->ۡۧۢ(Ljava/lang/Object;)V

    add-int v0, v3, v9

    const v2, 0xc2fa

    :goto_a
    const v3, 0xc30b

    xor-int/2addr v2, v3

    sparse-switch v2, :sswitch_data_8

    goto :goto_a

    :sswitch_17
    const v2, 0xc5a4

    goto :goto_a

    :sswitch_18
    move v3, v0

    goto :goto_6

    :sswitch_19
    aget-object v5, v10, v0

    int-to-float v12, v4

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;

    move-result-object v13

    invoke-static {p1, v5, v12, v2, v13}, Landroidx/lifecycle/livedata/ۣ۟۠ۥۤ;->ۣۢ۟ۥ(Ljava/lang/Object;Ljava/lang/Object;FFLjava/lang/Object;)V

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;

    move-result-object v5

    invoke-static {v5}, Landroidx/loader/ۣ۟۟ۧ۠;->۟ۦۡ۠ۥ(Ljava/lang/Object;)F

    move-result v5

    add-float/2addr v2, v5

    sget v5, Landroidx/core/ktx/۟۟ۡۢ۠;->ۣ۟ۧۡ:I

    xor-int/lit16 v5, v5, 0x22f

    add-int/2addr v0, v5

    const v5, 0xc601

    :goto_b
    const v12, 0xc612

    xor-int/2addr v5, v12

    sparse-switch v5, :sswitch_data_9

    goto :goto_b

    :sswitch_1a
    const v5, 0xc620

    goto :goto_b

    :sswitch_1b
    if-ltz v1, :cond_3

    const v0, 0xc965

    goto/16 :goto_5

    :sswitch_1c
    const-string v0, "DWoSLv7QcbXZYLShbvT9QI69FwMU"

    invoke-static {v0}, Lcom/tencent/mmkv/ۣ۟۟۠ۧ;->۟ۥۢ۟ۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->decode(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_1d
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_9
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_3
        0x36 -> :sswitch_4
        0x1d7 -> :sswitch_9
        0x1f4 -> :sswitch_5
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_6
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
        0x12 -> :sswitch_a
        0x35 -> :sswitch_1d
        0xf3 -> :sswitch_1b
        0xfeb -> :sswitch_1c
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x16 -> :sswitch_d
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_e
        0x7eef -> :sswitch_f
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x11 -> :sswitch_10
        0x32 -> :sswitch_11
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x12 -> :sswitch_14
        0x33 -> :sswitch_19
        0x54 -> :sswitch_16
        0xf1 -> :sswitch_15
    .end sparse-switch

    :sswitch_data_8
    .sparse-switch
        0x1f1 -> :sswitch_17
        0x6af -> :sswitch_18
    .end sparse-switch

    :sswitch_data_9
    .sparse-switch
        0x13 -> :sswitch_1a
        0x32 -> :sswitch_13
    .end sparse-switch
.end method

.method public getOpacity()I
    .locals 1

    sget v0, Landroidx/loader/ۣۦ۟ۡ;->۟ۢۥۤ:I

    xor-int/lit16 v0, v0, 0x320

    return v0
.end method

.method public setAlpha(I)V
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/activity/ۣ۟ۢ۠ۧ;->۟ۢۨۢ۟(Ljava/lang/Object;I)V

    return-void
.end method

.method public setColorFilter(Landroid/graphics/ColorFilter;)V
    .locals 1

    invoke-static {p0}, Lkevin/fun/hook/DYHook$68;->ۣۢۢۦ(Ljava/lang/Object;)Landroid/graphics/Paint;

    move-result-object v0

    invoke-static {v0, p1}, Landroidx/loader/۟۠ۢۧۡ;->۟ۢ۟ۥۧ(Ljava/lang/Object;Ljava/lang/Object;)Landroid/graphics/ColorFilter;

    return-void
.end method
