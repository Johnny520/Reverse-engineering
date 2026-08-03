.class public final LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5"
.end annotation


# instance fields
.field public ۥ:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟:Ljava/lang/String;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟۟:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;

    invoke-virtual {v0}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;->ۥ()LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ:Ljava/lang/String;

    invoke-virtual {v0}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;->ۥ()LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;

    move-result-object v1

    invoke-virtual {v1}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟۟۟()Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟:Ljava/lang/String;

    invoke-virtual {v0}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ۟;->ۥ()LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;->ۥ۟۟۟()Z

    move-result v0

    iput-boolean v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟۟:Z

    return-void
.end method


# virtual methods
.method public final ۥ()LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;
    .locals 4
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;

    iget-object v1, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ:Ljava/lang/String;

    iget-object v2, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟:Ljava/lang/String;

    iget-boolean v3, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟۟:Z

    invoke-direct {v0, v1, v2, v3}, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟;-><init>(Ljava/lang/String;Ljava/lang/String;Z)V

    return-object v0
.end method

.method public final ۥ۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟()Z
    .locals 1

    iget-boolean v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟۟:Z

    return v0
.end method

.method public final ۥ۟۟۟()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟:Ljava/lang/String;

    return-object v0
.end method

.method public final ۥ۟۟۟۟(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۦۧ(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xd

    invoke-static {p1, v0, v1, v2, v3}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۦۧ(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ:Ljava/lang/String;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LF and CR characters are prohibited in prefix, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ۟۟۟۠(Z)V
    .locals 0

    iput-boolean p1, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟۟:Z

    return-void
.end method

.method public final ۥ۟۟۟ۡ(Ljava/lang/String;)V
    .locals 4
    .param p1    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "value"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xa

    const/4 v1, 0x0

    const/4 v2, 0x2

    const/4 v3, 0x0

    invoke-static {p1, v0, v1, v2, v3}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۦۧ(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    const/16 v0, 0xd

    invoke-static {p1, v0, v1, v2, v3}, LYue/ۥۢ۠ۢۥ;->ۥ۟۠ۦۧ(Ljava/lang/CharSequence;CZILjava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iput-object p1, p0, LYue/ۥۣ۠ۤۤ$ۥ۟۟۟$ۥ;->ۥ۟:Ljava/lang/String;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "LF and CR characters are prohibited in suffix, but was "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method
