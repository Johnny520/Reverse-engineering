.class public final LYue/ۥۡۧ۠ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۧ۠ۢ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ:Ljava/lang/String; = "RoundedBitmapDrawableFa"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static ۥ(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)LYue/ۥۡۧ۠ۡ;
    .locals 1
    .param p0    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Landroid/graphics/Bitmap;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, LYue/ۥۡۧ۠۠;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۧ۠۠;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    return-object v0
.end method

.method public static ۥ۟(Landroid/content/res/Resources;Ljava/io/InputStream;)LYue/ۥۡۧ۠ۡ;
    .locals 2
    .param p0    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/io/InputStream;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {p0, v0}, LYue/ۥۡۧ۠ۢ;->ۥ(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)LYue/ۥۡۧ۠ۡ;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۧ۠ۡ;->ۥ۟()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RoundedBitmapDrawable cannot decode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RoundedBitmapDrawableFa"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object p0
.end method

.method public static ۥ۟۟(Landroid/content/res/Resources;Ljava/lang/String;)LYue/ۥۡۧ۠ۡ;
    .locals 2
    .param p0    # Landroid/content/res/Resources;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    invoke-static {p1}, Landroid/graphics/BitmapFactory;->decodeFile(Ljava/lang/String;)Landroid/graphics/Bitmap;

    move-result-object v0

    invoke-static {p0, v0}, LYue/ۥۡۧ۠ۢ;->ۥ(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)LYue/ۥۡۧ۠ۡ;

    move-result-object p0

    invoke-virtual {p0}, LYue/ۥۡۧ۠ۡ;->ۥ۟()Landroid/graphics/Bitmap;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "RoundedBitmapDrawable cannot decode "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RoundedBitmapDrawableFa"

    invoke-static {v0, p1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    :cond_0
    return-object p0
.end method
