.class public final LYue/ۥ۟ۥۢۦ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(I)Landroid/graphics/drawable/ColorDrawable;
    .locals 1
    .param p0    # I
        .annotation build LYue/ۥ۟ۥۢۧ;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-direct {v0, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0
.end method

.method public static final ۥ۟(Landroid/graphics/Color;)Landroid/graphics/drawable/ColorDrawable;
    .locals 1
    .param p0    # Landroid/graphics/Color;
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

    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    invoke-virtual {p0}, Landroid/graphics/Color;->toArgb()I

    move-result p0

    invoke-direct {v0, p0}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    return-object v0
.end method
