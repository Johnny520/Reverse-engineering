.class public final LYue/ۥۢۡۧ۠$ۥ۟۟۟;
.super LYue/ۥۢۡۧ۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۢۡۧ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

.field public ۥ۟۟۠ۨ:Ljava/lang/String;

.field public ۥ۟۟ۡ:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    sget-object v0, LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;->ۥ۟۟۠ۦ:LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, LYue/ۥۢۡۧ۠;-><init>(LYue/ۥۢۡۧ۠$ۥ۟۟۟ۤ;LYue/ۥۢۡۧ۠$ۥ;)V

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ:Z

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "<!--"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡۢ()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "-->"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠;
    .locals 1

    invoke-super {p0}, LYue/ۥۢۡۧ۠;->ۥ۟۟۠ۢ()LYue/ۥۢۡۧ۠;

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-static {v0}, LYue/ۥۢۡۧ۠;->ۥۣ۟۟۠(Ljava/lang/StringBuilder;)V

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    const/4 v0, 0x0

    iput-boolean v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡ:Z

    return-object p0
.end method

.method public ۥ۟۟ۡ۟(C)LYue/ۥۢۡۧ۠$ۥ۟۟۟;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡۡ()V

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    return-object p0
.end method

.method public ۥ۟۟ۡ۠(Ljava/lang/String;)LYue/ۥۢۡۧ۠$ۥ۟۟۟;
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟ۡۡ()V

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_0
    return-object p0
.end method

.method public final ۥ۟۟ۡۡ()V
    .locals 2

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-eqz v0, :cond_0

    iget-object v1, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public ۥ۟۟ۡۢ()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۨ:Ljava/lang/String;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥۢۡۧ۠$ۥ۟۟۟;->ۥ۟۟۠ۧ:Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    :goto_0
    return-object v0
.end method
