.class public abstract LYue/ۥ۠ۦ۠;
.super LYue/ۥ۟ۦۣۤ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠۟;
.implements LYue/ۥ۠ۥۡ۠;


# instance fields
.field public ۥ۟۟۠ۦ:LYue/ۥ۠ۦ۠۟;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, LYue/ۥ۟ۦۣۤ;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

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

    const-string v1, "[job@"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v1

    invoke-static {v1}, LYue/ۥۣ۟ۨۤ;->ۥ۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v1, 0x5d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥ۟۟ۡ()LYue/ۥۣۡۢۧ;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    const/4 v0, 0x0

    return-object v0
.end method

.method public ۥ۟۟ۡۥ()V
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۦ۠;->ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;

    move-result-object v0

    invoke-virtual {v0, p0}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۨۦ(LYue/ۥ۠ۦ۠;)V

    return-void
.end method

.method public final ۥ۟۟ۦۥ()LYue/ۥ۠ۦ۠۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۦ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۦ۠۟;

    if-eqz v0, :cond_0

    return-object v0

    :cond_0
    const-string v0, "job"

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟ۢۦ(Ljava/lang/String;)V

    const/4 v0, 0x0

    return-object v0
.end method

.method public final ۥ۟۟ۦۦ(LYue/ۥ۠ۦ۠۟;)V
    .locals 0
    .param p1    # LYue/ۥ۠ۦ۠۟;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    iput-object p1, p0, LYue/ۥ۠ۦ۠;->ۥ۟۟۠ۦ:LYue/ۥ۠ۦ۠۟;

    return-void
.end method
