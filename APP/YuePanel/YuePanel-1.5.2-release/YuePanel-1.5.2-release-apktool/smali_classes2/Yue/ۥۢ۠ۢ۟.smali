.class public LYue/ۥۢ۠ۢ۟;
.super LYue/ۥۢ۠ۢ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥۢ۠ۢ;-><init>()V

    return-void
.end method

.method public static final ۥۣ۟۟۠(Ljava/lang/String;)LYue/ۥۡۦۣۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦۣۢ;

    invoke-direct {v0, p0}, LYue/ۥۡۦۣۢ;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static final ۥ۟۟۠ۤ(Ljava/lang/String;LYue/ۥۡۦۣۥ;)LYue/ۥۡۦۣۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "option"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦۣۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۦۣۢ;-><init>(Ljava/lang/String;LYue/ۥۡۦۣۥ;)V

    return-object v0
.end method

.method public static final ۥ۟۟۠ۥ(Ljava/lang/String;Ljava/util/Set;)LYue/ۥۡۦۣۢ;
    .locals 1
    .annotation build LYue/ۥ۠ۥۣۢ;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Set<",
            "+",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e5;",
            ">;)",
            "LYue/\u06e5\u06e1\u06e6\u06e3\u06e2;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "options"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥۡۦۣۢ;

    invoke-direct {v0, p0, p1}, LYue/ۥۡۦۣۢ;-><init>(Ljava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method
