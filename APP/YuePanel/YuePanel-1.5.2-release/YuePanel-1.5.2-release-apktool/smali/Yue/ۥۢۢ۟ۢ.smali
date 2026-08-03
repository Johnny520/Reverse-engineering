.class public final LYue/ۥۢۢ۟ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥۣ۠۠ۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation runtime LYue/ۥ۟ۨۨۦ;
        message = "Use androidx.tracing.Trace instead"
        replaceWith = .subannotation LYue/ۥۡۦۣۤ;
            expression = "trace(sectionName, block)"
            imports = {
                "androidx.tracing.trace"
            }
        .end subannotation
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "+TT;>;)TT;"
        }
    .end annotation

    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    const/4 p0, 0x1

    :try_start_0
    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟۟(I)V

    invoke-static {}, Landroid/os/Trace;->endSection()V

    invoke-static {p0}, LYue/ۥ۠ۥۢۢ;->ۥ۟۟(I)V

    throw p1
.end method
