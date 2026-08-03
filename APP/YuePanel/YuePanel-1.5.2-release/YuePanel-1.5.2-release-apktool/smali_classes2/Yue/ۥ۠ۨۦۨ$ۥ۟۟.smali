.class public final LYue/ۥ۠ۨۦۨ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Map$Entry;
.implements LYue/ۥ۠ۦۣۣ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۠ۨۦۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<K:",
        "Ljava/lang/Object;",
        "V:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "Ljava/util/Map$Entry<",
        "TK;TV;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e3\u06e3$\u06e5;"
    }
.end annotation


# instance fields
.field public final ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;"
        }
    .end annotation
.end field

.field public final ۥ۟۟۠ۤ:I


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨۦۨ;I)V
    .locals 1
    .param p1    # LYue/ۥ۠ۨۦۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e6\u06e8<",
            "TK;TV;>;I)V"
        }
    .end annotation

    const-string v0, "map"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    iput p2, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param

    instance-of v0, p1, Ljava/util/Map$Entry;

    if-eqz v0, :cond_0

    check-cast p1, Ljava/util/Map$Entry;

    invoke-interface {p1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v0

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-interface {p1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p1

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->getValue()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public getKey()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TK;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public getValue()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TV;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟۠(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۧ(Ljava/lang/Object;)V

    iget v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    aget-object v0, v0, v1

    return-object v0
.end method

.method public hashCode()I
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->getKey()Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->getValue()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :cond_1
    xor-int/2addr v0, v1

    return v0
.end method

.method public setValue(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TV;)TV;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۨۦۨ;->ۥ۟۟۟ۦ()V

    iget-object v0, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥۣ۟۟۠:LYue/ۥ۠ۨۦۨ;

    invoke-static {v0}, LYue/ۥ۠ۨۦۨ;->ۥ(LYue/ۥ۠ۨۦۨ;)[Ljava/lang/Object;

    move-result-object v0

    iget v1, p0, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->ۥ۟۟۠ۤ:I

    aget-object v2, v0, v1

    aput-object p1, v0, v1

    return-object v2
.end method

.method public toString()Ljava/lang/String;
    .locals 2
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->getKey()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x3d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥ۠ۨۦۨ$ۥ۟۟;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
