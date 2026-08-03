.class public final LYue/ۥۢۡۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧۦۥ$ۥ۟۟;


# annotations
.annotation build LYue/ۥۡۥۤ۠;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e7\u06e6\u06e5$\u06e5\u06df\u06df<",
        "LYue/\u06e5\u06e2\u06e1\u06e1\u06e7<",
        "*>;>;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:Ljava/lang/ThreadLocal;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "*>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/ThreadLocal;)V
    .locals 0
    .param p1    # Ljava/lang/ThreadLocal;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ThreadLocal<",
            "*>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۢۡۢ;->ۥۣ۟۟۠:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public static synthetic ۥ۟۟(LYue/ۥۢۡۢ;Ljava/lang/ThreadLocal;ILjava/lang/Object;)LYue/ۥۢۡۢ;
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    iget-object p1, p0, LYue/ۥۢۡۢ;->ۥۣ۟۟۠:Ljava/lang/ThreadLocal;

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥۢۡۢ;->ۥ۟(Ljava/lang/ThreadLocal;)LYue/ۥۢۡۢ;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, LYue/ۥۢۡۢ;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, LYue/ۥۢۡۢ;

    iget-object v1, p0, LYue/ۥۢۡۢ;->ۥۣ۟۟۠:Ljava/lang/ThreadLocal;

    iget-object p1, p1, LYue/ۥۢۡۢ;->ۥۣ۟۟۠:Ljava/lang/ThreadLocal;

    invoke-static {v1, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    return v2

    :cond_2
    return v0
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۢۡۢ;->ۥۣ۟۟۠:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ThreadLocalKey(threadLocal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, LYue/ۥۢۡۢ;->ۥۣ۟۟۠:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ۥ()Ljava/lang/ThreadLocal;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/lang/ThreadLocal<",
            "*>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۢۡۢ;->ۥۣ۟۟۠:Ljava/lang/ThreadLocal;

    return-object v0
.end method

.method public final ۥ۟(Ljava/lang/ThreadLocal;)LYue/ۥۢۡۢ;
    .locals 1
    .param p1    # Ljava/lang/ThreadLocal;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/ThreadLocal<",
            "*>;)",
            "LYue/\u06e5\u06e2\u06e1\u06e2;"
        }
    .end annotation

    new-instance v0, LYue/ۥۢۡۢ;

    invoke-direct {v0, p1}, LYue/ۥۢۡۢ;-><init>(Ljava/lang/ThreadLocal;)V

    return-object v0
.end method
