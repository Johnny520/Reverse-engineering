.class public final LYue/ۥ۠ۨۦۨ$ۥ۟;
.super LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۣ۠;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨۦۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8$\u06e5\u06df\u06df\u06df<",
        "TK;TV;>;",
        "Ljava/util/Iterator<",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e0;"
    }
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨۦۨ;)V
    .locals 1
    .param p1    # LYue/ۥ۠ۨۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;-><init>(LYue/ۥ۠ۨۦۨ;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟;->ۥ۟۟۟ۥ()LYue/ۥ۠ۨۦۨ$ۥ۟۟;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()LYue/ۥ۠ۨۦۨ$ۥ۟۟;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8$\u06e5\u06df\u06df<",
            "TK;TV;>;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟(LYue/ۥ۠ۨۦۨ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟ۢ(I)V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۟(I)V

    new-instance v0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟()I

    move-result v2

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۨۦۨ$ۥ۟۟;-><init>(LYue/ۥ۠ۨۦۨ;I)V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟()V

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public final ۥ۟۟۟ۦ(Ljava/lang/StringBuilder;)V
    .locals 3
    .param p1    # Ljava/lang/StringBuilder;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param

    const-string v0, "sb"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟(LYue/ۥ۠ۨۦۨ;)I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟ۢ(I)V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const-string v2, "(this Map)"

    if-eqz v1, :cond_0

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_0

    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_0
    const/16 v0, 0x3d

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟۠(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟()I

    move-result v1

    aget-object v0, v0, v1

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_1

    :cond_1
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    :goto_1
    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟()V

    return-void

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method

.method public final ۥ۟۟۟ۧ()I
    .locals 4

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v1

    invoke-static {v1}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟(LYue/ۥ۠ۨۦۨ;)I

    move-result v1

    if-ge v0, v1, :cond_2

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ()I

    move-result v0

    add-int/lit8 v1, v0, 0x1

    invoke-virtual {p0, v1}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟ۢ(I)V

    invoke-virtual {p0, v0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥۣ۟۟۟(I)V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟()I

    move-result v1

    aget-object v0, v0, v1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟()LYue/ۥ۠ۨۦۨ;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟۠(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v2

    invoke-static {v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟()I

    move-result v3

    aget-object v2, v2, v3

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    xor-int/2addr v0, v1

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟۟;->ۥ۟۟۟()V

    return v0

    :cond_2
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
