.class public abstract LYue/ۥۣۣۡۡ;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public abstract ۥ()LYue/ۥ۟ۢ۠;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e2\u06e0<",
            "*>;"
        }
    .end annotation
.end method

.method public final ۥ۟(LYue/ۥۣۣۡۡ;)Z
    .locals 6
    .param p1    # LYue/ۥۣۣۡۡ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    invoke-virtual {p0}, LYue/ۥۣۣۡۡ;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    invoke-virtual {p1}, LYue/ۥۣۣۡۡ;->ۥ()LYue/ۥ۟ۢ۠;

    move-result-object p1

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {v0}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟ۡ()J

    move-result-wide v2

    invoke-virtual {p1}, LYue/ۥ۟ۢ۠;->ۥ۟۟۟ۡ()J

    move-result-wide v4

    cmp-long p1, v2, v4

    if-gez p1, :cond_2

    const/4 v1, 0x1

    :cond_2
    return v1
.end method

.method public abstract ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end method
