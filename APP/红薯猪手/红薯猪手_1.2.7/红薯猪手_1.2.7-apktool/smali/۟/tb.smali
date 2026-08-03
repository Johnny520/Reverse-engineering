.class public final L۟/tb;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(I)I
    .locals 4

    shr-int/lit8 v0, p0, 0x18

    and-int/lit16 v0, v0, 0xff

    shr-int/lit8 v1, p0, 0x10

    and-int/lit16 v1, v1, 0xff

    int-to-float v1, v1

    const v2, 0x3f733333    # 0.95f

    mul-float/2addr v1, v2

    float-to-int v1, v1

    shr-int/lit8 v3, p0, 0x8

    and-int/lit16 v3, v3, 0xff

    int-to-float v3, v3

    mul-float/2addr v3, v2

    float-to-int v3, v3

    and-int/lit16 p0, p0, 0xff

    int-to-float p0, p0

    mul-float/2addr p0, v2

    float-to-int p0, p0

    invoke-static {v0, v1, v3, p0}, Landroid/graphics/Color;->argb(IIII)I

    move-result p0

    return p0
.end method

.method public static ۥ۟(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 3

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    int-to-float p0, p0

    const/16 v2, 0x8

    new-array v2, v2, [F

    aput p0, v2, v1

    const/4 v1, 0x1

    aput p0, v2, v1

    const/4 v1, 0x2

    aput p0, v2, v1

    const/4 v1, 0x3

    aput p0, v2, v1

    const/4 p0, 0x4

    const/4 v1, 0x0

    aput v1, v2, p0

    const/4 p0, 0x5

    aput v1, v2, p0

    const/4 p0, 0x6

    aput v1, v2, p0

    const/4 p0, 0x7

    aput v1, v2, p0

    invoke-virtual {v0, v2}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadii([F)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-object v0
.end method

.method public static ۥ۟۟(II)Landroid/graphics/drawable/GradientDrawable;
    .locals 2

    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setGradientType(I)V

    int-to-float p0, p0

    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    invoke-virtual {v0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    return-object v0
.end method

.method public static ۥ۟۠(F)I
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-static {v0, p0}, L۟/c4;->ۥۣ۟(IF)F

    .line 3
    .line 4
    .line 5
    move-result p0

    .line 6
    float-to-int p0, p0

    .line 7
    return p0
.end method
