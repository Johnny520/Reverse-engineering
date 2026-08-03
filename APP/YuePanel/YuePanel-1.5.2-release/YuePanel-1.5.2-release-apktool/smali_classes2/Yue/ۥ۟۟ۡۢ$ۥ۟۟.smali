.class public LYue/ۥ۟۟ۡۢ$ۥ۟۟;
.super LYue/ۥ۟۟ۡۢ$ۥ۟;
.source "SourceFile"

# interfaces
.implements Ljava/util/ListIterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۡۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
        "TE;>.\u06e5\u06df;",
        "Ljava/util/ListIterator<",
        "TE;>;",
        "LYue/\u06e5\u06e0\u06e6\u06e2\u06e8;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۟۟ۡۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟ۡۢ;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥ۟۟ۡۢ;

    invoke-direct {p0, p1}, LYue/ۥ۟۟ۡۢ$ۥ۟;-><init>(LYue/ۥ۟۟ۡۢ;)V

    sget-object v0, LYue/ۥ۟۟ۡۢ;->ۥۣ۟۟۠:LYue/ۥ۟۟ۡۢ$ۥ;

    invoke-virtual {p1}, LYue/ۥ۟۟۠ۦ;->size()I

    move-result p1

    invoke-virtual {v0, p2, p1}, LYue/ۥ۟۟ۡۢ$ۥ;->ۥ۟۟(II)V

    invoke-virtual {p0, p2}, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ۟(I)V

    return-void
.end method


# virtual methods
.method public add(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public hasPrevious()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public nextIndex()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ()I

    move-result v0

    return v0
.end method

.method public previous()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۢ$ۥ۟۟;->hasPrevious()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟ۡۢ$ۥ۟۟;->ۥ۟۟۠ۥ:LYue/ۥ۟۟ۡۢ;

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    invoke-virtual {p0, v1}, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ۟(I)V

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ()I

    move-result v1

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۡۢ;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method

.method public previousIndex()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    return v0
.end method

.method public set(Ljava/lang/Object;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TE;)V"
        }
    .end annotation

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string v0, "Operation is not supported for read-only collection"

    invoke-direct {p1, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
