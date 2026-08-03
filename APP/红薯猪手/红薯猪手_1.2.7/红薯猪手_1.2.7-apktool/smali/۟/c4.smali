.class public final synthetic L۟/c4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static ۥ(I)Z
    .locals 0

    and-int/lit8 p0, p0, 0x4

    if-eqz p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥ۟(I)Z
    .locals 1

    const/4 v0, 0x1

    and-int/2addr p0, v0

    if-nez p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public static ۥ۟۟(I)Z
    .locals 0

    and-int/lit8 p0, p0, 0x2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static synthetic ۥ۟۠(I)I
    .locals 3

    const/4 v0, 0x3

    const/4 v1, 0x1

    if-ne p0, v1, :cond_0

    return v0

    :cond_0
    const/4 v2, 0x2

    if-ne p0, v2, :cond_1

    return v1

    :cond_1
    if-ne p0, v0, :cond_2

    return v2

    :cond_2
    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic ۥ۟ۡ(I)I
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/16 p0, 0x60

    return p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const/16 p0, 0x180

    return p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    const/4 p0, -0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    throw p0
.end method

.method public static synthetic ۥ۟ۢ(I)I
    .locals 1

    const/4 v0, 0x1

    if-ne p0, v0, :cond_0

    const/16 p0, 0x60

    return p0

    :cond_0
    const/4 v0, 0x2

    if-ne p0, v0, :cond_1

    const/16 p0, 0x200

    return p0

    :cond_1
    const/4 v0, 0x3

    if-ne p0, v0, :cond_2

    const/4 p0, -0x1

    return p0

    :cond_2
    const/4 p0, 0x0

    throw p0
.end method

.method public static ۥۣ۟(IF)F
    .locals 1

    .line 1
    invoke-static {}, Landroid/content/res/Resources;->getSystem()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p0, p1, v0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    return p0
.end method

.method public static ۥ۟ۤ(Ljava/lang/String;)Ljava/lang/StringBuilder;
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public static synthetic ۥ۟ۥ(I)I
    .locals 0

    if-eqz p0, :cond_0

    add-int/lit8 p0, p0, -0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    throw p0
.end method
