.class public final LYue/ۥ۟ۢۧۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Landroid/graphics/Bitmap;Landroid/content/res/Resources;)Landroid/graphics/drawable/BitmapDrawable;
    .locals 1
    .param p0    # Landroid/graphics/Bitmap;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {v0, p1, p0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method
