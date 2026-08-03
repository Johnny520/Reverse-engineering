.class public LYue/ۥ۟۟ۡۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۡۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5\u06df"
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
.field public ۥۣ۟۟۠:I

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡۢ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e1\u06e2<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟ۡۢ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    iget v0, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥۣ۟۟۠:I

    iget-object v1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡۢ;

    invoke-virtual {v1}, LYue/ۥ۟۟۠ۦ;->size()I

    move-result v1

    if-ge v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TE;"
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥ۟۟ۡۢ$ۥ۟;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥ۟۟۠ۤ:LYue/ۥ۟۟ۡۢ;

    iget v1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥۣ۟۟۠:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥۣ۟۟۠:I

    invoke-virtual {v0, v1}, LYue/ۥ۟۟ۡۢ;->get(I)Ljava/lang/Object;

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

.method public final ۥ()I
    .locals 1

    iget v0, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥۣ۟۟۠:I

    return v0
.end method

.method public final ۥ۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۟۟ۡۢ$ۥ۟;->ۥۣ۟۟۠:I

    return-void
.end method
