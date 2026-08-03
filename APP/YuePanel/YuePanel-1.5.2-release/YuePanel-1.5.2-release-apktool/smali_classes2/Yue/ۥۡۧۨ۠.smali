.class public final LYue/ۥۡۧۨ۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime LYue/ۥ۠ۦۡ;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06df<",
        "TS;>;>",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public final ۥ:Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥۡۧۨ۠;->ۥ:Ljava/lang/Object;

    return-void
.end method

.method public static final synthetic ۥ(Ljava/lang/Object;)LYue/ۥۡۧۨ۠;
    .locals 1

    new-instance v0, LYue/ۥۡۧۨ۠;

    invoke-direct {v0, p0}, LYue/ۥۡۧۨ۠;-><init>(Ljava/lang/Object;)V

    return-object v0
.end method

.method public static ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .param p0    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06df<",
            "TS;>;>(",
            "Ljava/lang/Object;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    return-object p0
.end method

.method public static ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, LYue/ۥۡۧۨ۠;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    :cond_0
    check-cast p1, LYue/ۥۡۧۨ۠;

    invoke-virtual {p1}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟ۤ()Ljava/lang/Object;

    move-result-object p1

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_1

    return v1

    :cond_1
    const/4 p0, 0x1

    return p0
.end method

.method public static final ۥ۟۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    invoke-static {p0, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static synthetic ۥ۟۟۟۟()V
    .locals 0

    return-void
.end method

.method public static final ۥ۟۟۟۠(Ljava/lang/Object;)LYue/ۥۡۧۨ۟;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")TS;"
        }
    .end annotation

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v0

    if-eq p0, v0, :cond_1

    if-eqz p0, :cond_0

    check-cast p0, LYue/ۥۡۧۨ۟;

    return-object p0

    :cond_0
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "Does not contain segment"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static ۥ۟۟۟ۡ(Ljava/lang/Object;)I
    .locals 0

    if-nez p0, :cond_0

    const/4 p0, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    :goto_0
    return p0
.end method

.method public static final ۥ۟۟۟ۢ(Ljava/lang/Object;)Z
    .locals 1

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v0

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    return p0
.end method

.method public static ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "SegmentOrClosed(value="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 p0, 0x29

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۨ۠;->ۥ:Ljava/lang/Object;

    invoke-static {v0, p1}, LYue/ۥۡۧۨ۠;->ۥ۟۟(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public hashCode()I
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۨ۠;->ۥ:Ljava/lang/Object;

    invoke-static {v0}, LYue/ۥۡۧۨ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۨ۠;->ۥ:Ljava/lang/Object;

    invoke-static {v0}, LYue/ۥۡۧۨ۠;->ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final synthetic ۥ۟۟۟ۤ()Ljava/lang/Object;
    .locals 1

    iget-object v0, p0, LYue/ۥۡۧۨ۠;->ۥ:Ljava/lang/Object;

    return-object v0
.end method
