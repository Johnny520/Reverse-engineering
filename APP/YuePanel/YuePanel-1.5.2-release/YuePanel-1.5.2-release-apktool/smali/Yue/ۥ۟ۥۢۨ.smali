.class public final LYue/ۥ۟ۥۢۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->red(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟(Landroid/graphics/Color;)F
    .locals 1
    .param p0    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/graphics/Color;->getComponent(I)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟۟(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->green(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۟(Landroid/graphics/Color;)F
    .locals 1
    .param p0    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/graphics/Color;->getComponent(I)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟۠(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    shr-int/lit8 p0, p0, 0x10

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟۟ۡ(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->blue(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۢ(Landroid/graphics/Color;)F
    .locals 1
    .param p0    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Landroid/graphics/Color;->getComponent(I)F

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۟(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    shr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟۟ۤ(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->alpha(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۥ(Landroid/graphics/Color;)F
    .locals 1
    .param p0    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    const/4 v0, 0x3

    invoke-virtual {p0, v0}, Landroid/graphics/Color;->getComponent(I)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۟ۦ(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟۟ۧ(ILandroid/graphics/ColorSpace$Named;)J
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/ColorSpace$Named;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p1}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p1

    invoke-static {p0, p1}, Landroid/graphics/Color;->convert(ILandroid/graphics/ColorSpace;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۟ۨ(ILandroid/graphics/ColorSpace;)J
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/ColorSpace;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->convert(ILandroid/graphics/ColorSpace;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠(JLandroid/graphics/ColorSpace$Named;)J
    .locals 0
    .param p2    # Landroid/graphics/ColorSpace$Named;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p2}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p2

    invoke-static {p0, p1, p2}, Landroid/graphics/Color;->convert(JLandroid/graphics/ColorSpace;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠۟(JLandroid/graphics/ColorSpace;)J
    .locals 0
    .param p2    # Landroid/graphics/ColorSpace;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1, p2}, Landroid/graphics/Color;->convert(JLandroid/graphics/ColorSpace;)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final ۥ۟۟۠۠(Landroid/graphics/Color;Landroid/graphics/ColorSpace$Named;)Landroid/graphics/Color;
    .locals 0
    .param p0    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/ColorSpace$Named;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p1}, Landroid/graphics/ColorSpace;->get(Landroid/graphics/ColorSpace$Named;)Landroid/graphics/ColorSpace;

    move-result-object p1

    invoke-virtual {p0, p1}, Landroid/graphics/Color;->convert(Landroid/graphics/ColorSpace;)Landroid/graphics/Color;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۡ(Landroid/graphics/Color;Landroid/graphics/ColorSpace;)Landroid/graphics/Color;
    .locals 0
    .param p0    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/ColorSpace;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-virtual {p0, p1}, Landroid/graphics/Color;->convert(Landroid/graphics/ColorSpace;)Landroid/graphics/Color;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۢ(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->alpha(J)F

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟۠(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    shr-int/lit8 p0, p0, 0x18

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟۠ۤ(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->blue(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۥ(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟۠ۦ(J)Landroid/graphics/ColorSpace;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->colorSpace(J)Landroid/graphics/ColorSpace;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۠ۧ(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->green(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟۠ۨ(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    shr-int/lit8 p0, p0, 0x8

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟ۡ(I)F
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0}, Landroid/graphics/Color;->luminance(I)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ۟(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->luminance(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡ۠(J)F
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->red(J)F

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۡ(I)I
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param

    shr-int/lit8 p0, p0, 0x10

    and-int/lit16 p0, p0, 0xff

    return p0
.end method

.method public static final ۥ۟۟ۡۢ(J)Z
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->isSrgb(J)Z

    move-result p0

    return p0
.end method

.method public static final ۥۣ۟۟ۡ(J)Z
    .locals 0
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->isWideGamut(J)Z

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۤ(Landroid/graphics/Color;Landroid/graphics/Color;)Landroid/graphics/Color;
    .locals 0
    .param p0    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Color;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p1, p0}, LYue/ۥ۟ۥۤ۟;->ۥ۟۟۠ۦ(Landroid/graphics/Color;Landroid/graphics/Color;)Landroid/graphics/Color;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۥ(I)Landroid/graphics/Color;
    .locals 0
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0}, Landroid/graphics/Color;->valueOf(I)Landroid/graphics/Color;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۦ(J)Landroid/graphics/Color;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->valueOf(J)Landroid/graphics/Color;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۡۧ(J)I
    .locals 0
    .annotation build LYue/ۥ۟ۥۢۧ;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0, p1}, Landroid/graphics/Color;->toArgb(J)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۡۨ(Ljava/lang/String;)I
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥ۟ۥۢۧ;
    .end annotation

    invoke-static {p0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method public static final ۥ۟۟ۢ(I)J
    .locals 2
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1a
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ClassVerificationFailure"
        }
    .end annotation

    invoke-static {p0}, Landroid/graphics/Color;->pack(I)J

    move-result-wide v0

    return-wide v0
.end method
