.class public abstract LYue/ۥ۠ۨۥۥ;
.super LYue/ۥ۟ۧۦۨ;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۧۦۨ;-><init>()V

    return-void
.end method


# virtual methods
.method public limitedParallelism(I)LYue/ۥ۟ۧۦۨ;
    .locals 0
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-static {p1}, LYue/ۥ۠ۧ۠۠;->ۥ(I)V

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨۥۥ;->ۥ۟۟ۧ۠()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x40

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-static {p0}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public abstract ۥ۟۟ۧ۟()LYue/ۥ۠ۨۥۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end method

.method public final ۥ۟۟ۧ۠()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥ۠ۥۦۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    invoke-static {}, LYue/ۥ۠۟ۢۦ;->ۥ۟۟۟۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v0

    if-ne p0, v0, :cond_0

    const-string v0, "Dispatchers.Main"

    return-object v0

    :cond_0
    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {v0}, LYue/ۥ۠ۨۥۥ;->ۥ۟۟ۧ۟()LYue/ۥ۠ۨۥۥ;

    move-result-object v0
    :try_end_0
    .catch Ljava/lang/UnsupportedOperationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-object v0, v1

    :goto_0
    if-ne p0, v0, :cond_1

    const-string v0, "Dispatchers.Main.immediate"

    return-object v0

    :cond_1
    return-object v1
.end method
