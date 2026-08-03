.class public final LYue/ۥ۠۟ۨۡ;
.super LYue/ۥۡۥ۠ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e5\u06e0\u06e2<",
        "[D>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۟:[D
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۡۥ۠ۢ;-><init>(I)V

    new-array p1, p1, [D

    iput-object p1, p0, LYue/ۥ۠۟ۨۡ;->ۥ۟۟۟:[D

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ۟۟(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [D

    invoke-virtual {p0, p1}, LYue/ۥ۠۟ۨۡ;->ۥۣ۟۟۟([D)I

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۢ(D)V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠۟ۨۡ;->ۥ۟۟۟:[D

    invoke-virtual {p0}, LYue/ۥۡۥ۠ۢ;->ۥ۟()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, LYue/ۥۡۥ۠ۢ;->ۥ۟۟۟۟(I)V

    aput-wide p1, v0, v1

    return-void
.end method

.method public ۥۣ۟۟۟([D)I
    .locals 1
    .param p1    # [D
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    return p1
.end method

.method public final ۥ۟۟۟ۤ()[D
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠۟ۨۡ;->ۥ۟۟۟:[D

    invoke-virtual {p0}, LYue/ۥۡۥ۠ۢ;->ۥ۟۟۟۠()I

    move-result v1

    new-array v1, v1, [D

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۥ۠ۢ;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [D

    return-object v0
.end method
