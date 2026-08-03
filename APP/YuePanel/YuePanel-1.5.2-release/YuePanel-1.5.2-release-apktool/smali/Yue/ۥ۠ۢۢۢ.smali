.class public final LYue/ۥ۠ۢۢۢ;
.super LYue/ۥۣ۠۠ۤ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۠ۢۢۢ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e0\u06e3\u06e4<",
        "LYue/\u06e5\u06e0\u06e2\u06e2\u06e2;",
        ">;"
    }
.end annotation


# instance fields
.field public final ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;


# direct methods
.method public constructor <init>(LYue/ۥۣ۠ۢ;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, LYue/ۥۣ۠۠ۤ;-><init>(LYue/ۥۣ۠ۢ;)V

    .line 2
    new-instance p1, LYue/ۥ۠ۢۢۢ$ۥ;

    invoke-direct {p1}, LYue/ۥ۠ۢۢۢ$ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    .line 3
    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥۣ۟۟۟()F

    move-result v0

    invoke-virtual {p1, v0}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟۟۟(F)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Object;LYue/ۥ۠ۢۢۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            ">(TK;",
            "LYue/\u06e5\u06e0\u06e2\u06e2\u06e6<",
            "TK;>;)V"
        }
    .end annotation

    .line 4
    invoke-direct {p0, p1, p2}, LYue/ۥۣ۠۠ۤ;-><init>(Ljava/lang/Object;LYue/ۥ۠ۢۢۦ;)V

    .line 5
    new-instance p1, LYue/ۥ۠ۢۢۢ$ۥ;

    invoke-direct {p1}, LYue/ۥ۠ۢۢۢ$ۥ;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    .line 6
    invoke-virtual {p0}, LYue/ۥۣ۠۠ۤ;->ۥۣ۟۟۟()F

    move-result p2

    invoke-virtual {p1, p2}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟۟۟(F)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠(FF)F
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟(FF)F

    move-result p1

    return p1
.end method

.method public ۥ۟۟۟ۤ(FF)Z
    .locals 1

    iget v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۡ:F

    cmpl-float v0, p1, v0

    if-gez v0, :cond_1

    iget v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ:F

    cmpg-float v0, p1, v0

    if-lez v0, :cond_1

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    invoke-virtual {v0, p1, p2}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ(FF)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 p1, 0x1

    :goto_1
    return p1
.end method

.method public bridge synthetic ۥ۟۟۠۟(F)LYue/ۥۣ۠۠ۤ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡ۠(F)LYue/ۥ۠ۢۢۢ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠۠(F)LYue/ۥۣ۠۠ۤ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۡ(F)LYue/ۥ۠ۢۢۢ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟۠ۤ(F)LYue/ۥۣ۠۠ۤ;
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۢ(F)LYue/ۥ۠ۢۢۢ;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۠ۥ(F)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟۟۟(F)V

    return-void
.end method

.method public ۥ۟۟۠ۨ(J)Z
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    iget v1, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟:F

    iget v2, p0, LYue/ۥۣ۠۠ۤ;->ۥ:F

    invoke-virtual {v0, v1, v2, p1, p2}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟۟۠(FFJ)LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;

    move-result-object p1

    iget p2, p1, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ:F

    iput p2, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟:F

    iget p1, p1, LYue/ۥۣ۠۠ۤ$ۥ۟۟۠۟;->ۥ۟:F

    iput p1, p0, LYue/ۥۣ۠۠ۤ;->ۥ:F

    iget v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۢ:F

    cmpg-float v1, p2, v0

    const/4 v2, 0x1

    if-gez v1, :cond_0

    iput v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟:F

    return v2

    :cond_0
    iget v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۟ۡ:F

    cmpl-float v1, p2, v0

    if-lez v1, :cond_1

    iput v0, p0, LYue/ۥۣ۠۠ۤ;->ۥ۟:F

    return v2

    :cond_1
    invoke-virtual {p0, p2, p1}, LYue/ۥ۠ۢۢۢ;->ۥ۟۟۟ۤ(FF)Z

    move-result p1

    if-eqz p1, :cond_2

    return v2

    :cond_2
    const/4 p1, 0x0

    return p1
.end method

.method public ۥ۟۟ۡ()F
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟()F

    move-result v0

    return v0
.end method

.method public ۥ۟۟ۡ۟(F)LYue/ۥ۠ۢۢۢ;
    .locals 1
    .param p1    # F
        .annotation build LYue/ۥ۠ۢۢۧ;
            from = 0.0
            fromInclusive = false
        .end annotation
    .end param

    const/4 v0, 0x0

    cmpg-float v0, p1, v0

    if-lez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۢۢۢ;->ۥ۟۟ۡۥ:LYue/ۥ۠ۢۢۢ$ۥ;

    invoke-virtual {v0, p1}, LYue/ۥ۠ۢۢۢ$ۥ;->ۥ۟۟۟(F)V

    return-object p0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Friction must be positive"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public ۥ۟۟ۡ۠(F)LYue/ۥ۠ۢۢۢ;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۠۟(F)LYue/ۥۣ۠۠ۤ;

    return-object p0
.end method

.method public ۥ۟۟ۡۡ(F)LYue/ۥ۠ۢۢۢ;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۠۠(F)LYue/ۥۣ۠۠ۤ;

    return-object p0
.end method

.method public ۥ۟۟ۡۢ(F)LYue/ۥ۠ۢۢۢ;
    .locals 0

    invoke-super {p0, p1}, LYue/ۥۣ۠۠ۤ;->ۥ۟۟۠ۤ(F)LYue/ۥۣ۠۠ۤ;

    return-object p0
.end method
