.class public final LYue/ۥ۠ۢۢ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۢ۟;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TE;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation
.end field

.field public ۥ۟۟۠ۤ:Ljava/util/Iterator;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Iterator<",
            "+TE;>;"
        }
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۠ۢۢ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e2\u06e2\u06df<",
            "TT;TR;TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۢۢ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e2\u06e2\u06df<",
            "TT;TR;TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۢۢ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥ۠ۢۢ۟;->ۥ۟۟۟(LYue/ۥ۠ۢۢ۟;)LYue/ۥۡۨۢ;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ()Z

    move-result v0

    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/Iterator;

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public remove()V
    .locals 2

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "Operation is not supported for read-only collection"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final ۥ()Z
    .locals 4

    iget-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/Iterator;

    if-eqz v0, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/Iterator;

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/Iterator;

    const/4 v1, 0x1

    if-nez v0, :cond_2

    iget-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    :cond_1
    iget-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    iget-object v2, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۢۢ۟;

    invoke-static {v2}, LYue/ۥ۠ۢۢ۟;->ۥ۟۟(LYue/ۥ۠ۢۢ۟;)LYue/ۥۣ۠ۡ۟;

    move-result-object v2

    iget-object v3, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۠ۢۢ۟;

    invoke-static {v3}, LYue/ۥ۠ۢۢ۟;->ۥ۟۟۟۟(LYue/ۥ۠ۢۢ۟;)LYue/ۥۣ۠ۡ۟;

    move-result-object v3

    invoke-interface {v3, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-interface {v2, v0}, LYue/ۥۣ۠ۡ۟;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    iput-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/Iterator;

    :cond_2
    return v1
.end method

.method public final ۥ۟()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/Iterator;

    return-object v0
.end method

.method public final ۥ۟۟()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-object v0
.end method

.method public final ۥ۟۟۟(Ljava/util/Iterator;)V
    .locals 0
    .param p1    # Ljava/util/Iterator;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Iterator<",
            "+TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۢ۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/Iterator;

    return-void
.end method
