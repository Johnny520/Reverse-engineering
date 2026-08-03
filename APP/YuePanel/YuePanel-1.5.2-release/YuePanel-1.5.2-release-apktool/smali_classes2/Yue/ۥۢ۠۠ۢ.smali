.class public LYue/ۥۢ۠۠ۢ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final ۥ(Ljava/io/InputStream;LYue/ۥ۟ۢۥ;)Ljava/io/InputStream;
    .locals 1
    .param p0    # Ljava/io/InputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۢۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۠ۡۤ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "base64"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۟ۨۤۦ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۨۤۦ;-><init>(Ljava/io/InputStream;LYue/ۥ۟ۢۥ;)V

    return-object v0
.end method

.method public static final ۥ۟(Ljava/io/OutputStream;LYue/ۥ۟ۢۥ;)Ljava/io/OutputStream;
    .locals 1
    .param p0    # Ljava/io/OutputStream;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # LYue/ۥ۟ۢۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۠ۡۤ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build LYue/ۥۢ۟ۡۡ;
        version = "1.8"
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "base64"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠۠ۨۤ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠۠ۨۤ;-><init>(Ljava/io/OutputStream;LYue/ۥ۟ۢۥ;)V

    return-object v0
.end method
