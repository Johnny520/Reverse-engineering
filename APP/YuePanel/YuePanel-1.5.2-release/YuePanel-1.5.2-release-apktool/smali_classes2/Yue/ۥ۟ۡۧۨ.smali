.class public final LYue/ۥ۟ۡۧۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ([Ljava/lang/Object;)Ljava/util/Iterator;
    .locals 1
    .param p0    # [Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">([TT;)",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    const-string v0, "array"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۡۧۦ;

    invoke-direct {v0, p0}, LYue/ۥ۟ۡۧۦ;-><init>([Ljava/lang/Object;)V

    return-object v0
.end method
