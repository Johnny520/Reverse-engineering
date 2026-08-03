.class public LYue/ۥ۠ۧ۟ۢ;
.super LYue/ۥ۠ۧ۟ۡ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۧ۟ۡ;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟۟(LYue/ۥ۠ۦۨۨ;Ljava/lang/Object;LYue/ۥ۠ۦۤ۟;)Ljava/lang/Object;
    .locals 0
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8<",
            "+TT;>;",
            "Ljava/lang/Object;",
            "LYue/\u06e5\u06e0\u06e6\u06e4\u06df<",
            "*>;)TT;"
        }
    .end annotation

    const-string p1, "<this>"

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "property"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, LYue/ۥ۠ۦۨۨ;->getValue()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟۟۟(Ljava/lang/Object;)LYue/ۥ۠ۦۨۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(TT;)",
            "LYue/\u06e5\u06e0\u06e6\u06e8\u06e8<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۢ۟;

    invoke-direct {v0, p0}, LYue/ۥ۠ۥۢ۟;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method
