.class public final LYue/ۥ۠ۤۤۤ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final ۥ(LYue/ۥۣ۠ۡ۟;)LYue/ۥۣ۠ۤۤ;
    .locals 1
    .annotation build LYue/ۥ۠ۡۥ۟;
    .end annotation

    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.9"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e3\u06e1\u06df<",
            "-",
            "LYue/\u06e5\u06e0\u06e4\u06e4\u06e3$\u06e5;",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "LYue/\u06e5\u06e0\u06e4\u06e4\u06e3;"
        }
    .end annotation

    const-string v0, "builderAction"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۣ۠ۤۤ$ۥ;

    invoke-direct {v0}, LYue/ۥۣ۠ۤۤ$ۥ;-><init>()V

    invoke-interface {p0, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, LYue/ۥۣ۠ۤۤ$ۥ;->ۥ()LYue/ۥۣ۠ۤۤ;

    move-result-object p0

    return-object p0
.end method
