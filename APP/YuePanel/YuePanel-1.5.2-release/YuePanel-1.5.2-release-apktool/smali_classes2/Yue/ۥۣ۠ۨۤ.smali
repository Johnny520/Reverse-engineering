.class public final LYue/ۥۣ۠ۨۤ;
.super LYue/ۥۡۥ۠ۢ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e1\u06e5\u06e0\u06e2<",
        "[J>;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟۟:[J
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۡۥ۠ۢ;-><init>(I)V

    new-array p1, p1, [J

    iput-object p1, p0, LYue/ۥۣ۠ۨۤ;->ۥ۟۟۟:[J

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ۟۟(Ljava/lang/Object;)I
    .locals 0

    check-cast p1, [J

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۨۤ;->ۥۣ۟۟۟([J)I

    move-result p1

    return p1
.end method

.method public final ۥ۟۟۟ۢ(J)V
    .locals 3

    iget-object v0, p0, LYue/ۥۣ۠ۨۤ;->ۥ۟۟۟:[J

    invoke-virtual {p0}, LYue/ۥۡۥ۠ۢ;->ۥ۟()I

    move-result v1

    add-int/lit8 v2, v1, 0x1

    invoke-virtual {p0, v2}, LYue/ۥۡۥ۠ۢ;->ۥ۟۟۟۟(I)V

    aput-wide p1, v0, v1

    return-void
.end method

.method public ۥۣ۟۟۟([J)I
    .locals 1
    .param p1    # [J
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "<this>"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    array-length p1, p1

    return p1
.end method

.method public final ۥ۟۟۟ۤ()[J
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۨۤ;->ۥ۟۟۟:[J

    invoke-virtual {p0}, LYue/ۥۡۥ۠ۢ;->ۥ۟۟۟۠()I

    move-result v1

    new-array v1, v1, [J

    invoke-virtual {p0, v0, v1}, LYue/ۥۡۥ۠ۢ;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [J

    return-object v0
.end method
