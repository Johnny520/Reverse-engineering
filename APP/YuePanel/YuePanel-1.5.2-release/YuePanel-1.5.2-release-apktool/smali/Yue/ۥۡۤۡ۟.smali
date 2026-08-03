.class public final LYue/ۥۡۤۡ۟;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Landroid/graphics/Picture;IILYue/ۥۣ۠ۡ۟;)Landroid/graphics/Picture;
    .locals 0
    .param p0    # Landroid/graphics/Picture;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p3    # LYue/ۥۣ۠ۡ۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Picture;",
            "II",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "Landroid/graphics/Canvas;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Landroid/graphics/Picture;"
        }
    .end annotation

    invoke-virtual {p0, p1, p2}, Landroid/graphics/Picture;->beginRecording(II)Landroid/graphics/Canvas;

    move-result-object p1

    const/4 p2, 0x1

    :try_start_0
    invoke-interface {p3, p1}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, Landroid/graphics/Picture;->endRecording()V

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p0

    :catchall_0
    move-exception p1

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-virtual {p0}, Landroid/graphics/Picture;->endRecording()V

    invoke-static {p2}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method
