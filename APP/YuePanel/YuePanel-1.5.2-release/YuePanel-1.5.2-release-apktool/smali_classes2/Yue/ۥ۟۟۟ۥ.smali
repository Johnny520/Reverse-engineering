.class public final LYue/ۥ۟۟۟ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۠ۦۡ۠;
    name = "-InflaterSourceExtensions"
.end annotation


# direct methods
.method public static final ۥ(LYue/ۥۣۢ۟ۦ;Ljava/util/zip/Inflater;)LYue/ۥ۠ۥۡۨ;
    .locals 1
    .param p0    # LYue/ۥۣۢ۟ۦ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p1    # Ljava/util/zip/Inflater;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "inflater"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۥۡۨ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۠ۥۡۨ;-><init>(LYue/ۥۣۢ۟ۦ;Ljava/util/zip/Inflater;)V

    return-object v0
.end method

.method public static synthetic ۥ۟(LYue/ۥۣۢ۟ۦ;Ljava/util/zip/Inflater;ILjava/lang/Object;)LYue/ۥ۠ۥۡۨ;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    new-instance p1, Ljava/util/zip/Inflater;

    invoke-direct {p1}, Ljava/util/zip/Inflater;-><init>()V

    :cond_0
    const-string p2, "<this>"

    invoke-static {p0, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "inflater"

    invoke-static {p1, p2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, LYue/ۥ۠ۥۡۨ;

    invoke-direct {p2, p0, p1}, LYue/ۥ۠ۥۡۨ;-><init>(LYue/ۥۣۢ۟ۦ;Ljava/util/zip/Inflater;)V

    return-object p2
.end method
