.class public final LYue/ۥ۠ۥ۠ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "ClassVerificationFailure"
    }
.end annotation


# direct methods
.method public static final ۥ(Landroid/graphics/ImageDecoder$Source;LYue/ۥۣ۠ۢۤ;)Landroid/graphics/Bitmap;
    .locals 1
    .param p0    # Landroid/graphics/ImageDecoder$Source;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1c
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/ImageDecoder$Source;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Landroid/graphics/ImageDecoder;",
            "-",
            "Landroid/graphics/ImageDecoder$ImageInfo;",
            "-",
            "Landroid/graphics/ImageDecoder$Source;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۥ۠ۥ$ۥ;

    invoke-direct {v0, p1}, LYue/ۥ۠ۥ۠ۥ$ۥ;-><init>(LYue/ۥۣ۠ۢۤ;)V

    invoke-static {v0}, LYue/ۥ۠ۥ۠ۢ;->ۥ(Ljava/lang/Object;)Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۥ۠ۤ;->ۥ(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/Bitmap;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟(Landroid/graphics/ImageDecoder$Source;LYue/ۥۣ۠ۢۤ;)Landroid/graphics/drawable/Drawable;
    .locals 1
    .param p0    # Landroid/graphics/ImageDecoder$Source;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠ۢۤ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۡۦۥۣ;
        value = 0x1c
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/ImageDecoder$Source;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e4<",
            "-",
            "Landroid/graphics/ImageDecoder;",
            "-",
            "Landroid/graphics/ImageDecoder$ImageInfo;",
            "-",
            "Landroid/graphics/ImageDecoder$Source;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/graphics/drawable/Drawable;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۥ۠ۥ$ۥ۟;

    invoke-direct {v0, p1}, LYue/ۥ۠ۥ۠ۥ$ۥ۟;-><init>(LYue/ۥۣ۠ۢۤ;)V

    invoke-static {v0}, LYue/ۥ۠ۥ۠ۢ;->ۥ(Ljava/lang/Object;)Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۥۣ۠;->ۥ(Landroid/graphics/ImageDecoder$Source;Landroid/graphics/ImageDecoder$OnHeaderDecodedListener;)Landroid/graphics/drawable/Drawable;

    move-result-object p0

    return-object p0
.end method
