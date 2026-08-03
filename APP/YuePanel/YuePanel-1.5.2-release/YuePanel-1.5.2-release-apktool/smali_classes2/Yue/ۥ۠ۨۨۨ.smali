.class public final LYue/ۥ۠ۨۨۨ;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟:LYue/ۥ۠ۥۣۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;LYue/ۥ۠ۥۣۨ;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۥۣۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "range"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    iput-object p2, p0, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    return-void
.end method

.method public static synthetic ۥ۟۟۟(LYue/ۥ۠ۨۨۨ;Ljava/lang/String;LYue/ۥ۠ۥۣۨ;ILjava/lang/Object;)LYue/ۥ۠ۨۨۨ;
    .locals 0

    and-int/lit8 p4, p3, 0x1

    if-eqz p4, :cond_0

    iget-object p1, p0, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    :cond_0
    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_1

    iget-object p2, p0, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    :cond_1
    invoke-virtual {p0, p1, p2}, LYue/ۥ۠ۨۨۨ;->ۥ۟۟(Ljava/lang/String;LYue/ۥ۠ۥۣۨ;)LYue/ۥ۠ۨۨۨ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥ۠ۨۨۨ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥ۠ۨۨۨ;

    iget-object v1, p0, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    iget-object v3, p1, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    invoke-static {v1, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    iget-object p1, p1, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    return v2

    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    invoke-virtual {v1}, LYue/ۥ۠ۥۣۨ;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "MatchGroup(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", range="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟()LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    return-object v0
.end method

.method public final ۥ۟۟(Ljava/lang/String;LYue/ۥ۠ۥۣۨ;)LYue/ۥ۠ۨۨۨ;
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۠ۥۣۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "range"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, LYue/ۥ۠ۨۨۨ;

    invoke-direct {v0, p1, p2}, LYue/ۥ۠ۨۨۨ;-><init>(Ljava/lang/String;LYue/ۥ۠ۥۣۨ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟۟()LYue/ۥ۠ۥۣۨ;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۨۨ;->ۥ۟:LYue/ۥ۠ۥۣۨ;

    return-object v0
.end method

.method public final ۥ۟۟۟۠()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۨۨ;->ۥ:Ljava/lang/String;

    return-object v0
.end method
