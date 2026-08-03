.class public LYue/ۥ۠ۢ۟ۦ;
.super LYue/ۥ۠ۢ۟ۥ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۠ۢ۟ۥ;-><init>()V

    return-void
.end method

.method public static final ۥ۟۟ۡۨ(Ljava/io/File;LYue/ۥ۠ۢ۟ۢ;)LYue/ۥ۠ۡۨۦ;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۠ۢ۟ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "direction"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۡۨۦ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۡۨۦ;-><init>(Ljava/io/File;LYue/ۥ۠ۢ۟ۢ;)V

    return-object v0
.end method

.method public static synthetic ۥ۟۟ۢ(Ljava/io/File;LYue/ۥ۠ۢ۟ۢ;ILjava/lang/Object;)LYue/ۥ۠ۡۨۦ;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    sget-object p1, LYue/ۥ۠ۢ۟ۢ;->ۥۣ۟۟۠:LYue/ۥ۠ۢ۟ۢ;

    :cond_0
    invoke-static {p0, p1}, LYue/ۥ۠ۢ۟ۦ;->ۥ۟۟ۡۨ(Ljava/io/File;LYue/ۥ۠ۢ۟ۢ;)LYue/ۥ۠ۡۨۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢ۟(Ljava/io/File;)LYue/ۥ۠ۡۨۦ;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠ۢ۟ۢ;->ۥ۟۟۠ۤ:LYue/ۥ۠ۢ۟ۢ;

    invoke-static {p0, v0}, LYue/ۥ۠ۢ۟ۦ;->ۥ۟۟ۡۨ(Ljava/io/File;LYue/ۥ۠ۢ۟ۢ;)LYue/ۥ۠ۡۨۦ;

    move-result-object p0

    return-object p0
.end method

.method public static final ۥ۟۟ۢ۠(Ljava/io/File;)LYue/ۥ۠ۡۨۦ;
    .locals 1
    .param p0    # Ljava/io/File;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥ۠ۢ۟ۢ;->ۥۣ۟۟۠:LYue/ۥ۠ۢ۟ۢ;

    invoke-static {p0, v0}, LYue/ۥ۠ۢ۟ۦ;->ۥ۟۟ۡۨ(Ljava/io/File;LYue/ۥ۠ۢ۟ۢ;)LYue/ۥ۠ۡۨۦ;

    move-result-object p0

    return-object p0
.end method
