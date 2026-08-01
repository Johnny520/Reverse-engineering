.class public final Lｍ;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Liy;


# instance fields
.field public α:Landroid/content/Context;


# direct methods
.method public static β(Landroid/content/Context;)Lｍ;
    .locals 1

    .line 1
    new-instance v0, Lｍ;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p0, v0, Lｍ;->α:Landroid/content/Context;

    .line 7
    .line 8
    return-object v0
.end method


# virtual methods
.method public α(Lpd2;)V
    .locals 8

    .line 1
    new-instance v7, Lho;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    const-string v1, "EmojiCompatInitializer"

    .line 5
    .line 6
    invoke-direct {v7, v0, v1}, Lho;-><init>(ILjava/io/Serializable;)V

    .line 7
    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ThreadPoolExecutor;

    .line 10
    .line 11
    new-instance v6, Ljava/util/concurrent/LinkedBlockingDeque;

    .line 12
    .line 13
    invoke-direct {v6}, Ljava/util/concurrent/LinkedBlockingDeque;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    const-wide/16 v3, 0xf

    .line 19
    .line 20
    sget-object v5, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    invoke-direct/range {v0 .. v7}, Ljava/util/concurrent/ThreadPoolExecutor;-><init>(IIJLjava/util/concurrent/TimeUnit;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/ThreadFactory;)V

    .line 23
    .line 24
    .line 25
    const/4 v1, 0x1

    .line 26
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->allowCoreThreadTimeOut(Z)V

    .line 27
    .line 28
    .line 29
    new-instance v1, Le9;

    .line 30
    .line 31
    const/16 v2, 0xa

    .line 32
    .line 33
    invoke-direct {v1, p0, p1, v0, v2}, Le9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/util/concurrent/ThreadPoolExecutor;->execute(Ljava/lang/Runnable;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public γ()I
    .locals 3

    .line 1
    iget-object p0, p0, Lｍ;->α:Landroid/content/Context;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    iget v0, p0, Landroid/content/res/Configuration;->screenWidthDp:I

    .line 12
    .line 13
    iget v1, p0, Landroid/content/res/Configuration;->screenHeightDp:I

    .line 14
    .line 15
    iget p0, p0, Landroid/content/res/Configuration;->smallestScreenWidthDp:I

    .line 16
    .line 17
    const/16 v2, 0x258

    .line 18
    .line 19
    if-gt p0, v2, :cond_6

    .line 20
    .line 21
    if-gt v0, v2, :cond_6

    .line 22
    .line 23
    const/16 p0, 0x2d0

    .line 24
    .line 25
    const/16 v2, 0x3c0

    .line 26
    .line 27
    if-le v0, v2, :cond_0

    .line 28
    .line 29
    if-gt v1, p0, :cond_6

    .line 30
    .line 31
    :cond_0
    if-le v0, p0, :cond_1

    .line 32
    .line 33
    if-le v1, v2, :cond_1

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_1
    const/16 p0, 0x1f4

    .line 37
    .line 38
    if-ge v0, p0, :cond_5

    .line 39
    .line 40
    const/16 p0, 0x1e0

    .line 41
    .line 42
    const/16 v2, 0x280

    .line 43
    .line 44
    if-le v0, v2, :cond_2

    .line 45
    .line 46
    if-gt v1, p0, :cond_5

    .line 47
    .line 48
    :cond_2
    if-le v0, p0, :cond_3

    .line 49
    .line 50
    if-le v1, v2, :cond_3

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_3
    const/16 p0, 0x168

    .line 54
    .line 55
    if-lt v0, p0, :cond_4

    .line 56
    .line 57
    const/4 p0, 0x3

    .line 58
    return p0

    .line 59
    :cond_4
    const/4 p0, 0x2

    .line 60
    return p0

    .line 61
    :cond_5
    :goto_0
    const/4 p0, 0x4

    .line 62
    return p0

    .line 63
    :cond_6
    :goto_1
    const/4 p0, 0x5

    .line 64
    return p0
.end method

.method public δ()I
    .locals 4

    .line 1
    iget-object p0, p0, Lｍ;->α:Landroid/content/Context;

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sget-object v1, Lkk1;->α:[I

    .line 5
    .line 6
    const v2, 0x7f040005

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-virtual {p0, v0, v1, v2, v3}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const/16 v1, 0xd

    .line 15
    .line 16
    invoke-virtual {v0, v1, v3}, Landroid/content/res/TypedArray;->getLayoutDimension(II)I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    const/high16 v3, 0x7f050000

    .line 29
    .line 30
    invoke-virtual {p0, v3}, Landroid/content/res/Resources;->getBoolean(I)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-nez p0, :cond_0

    .line 35
    .line 36
    const p0, 0x7f070009

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p0}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    invoke-static {v1, p0}, Ljava/lang/Math;->min(II)I

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    :cond_0
    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 48
    .line 49
    .line 50
    return v1
.end method
