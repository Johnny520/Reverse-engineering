.class public final LYue/ۥ۠ۥۡۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۥۡۧ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "LYue/\u06e5\u06e0\u06e5\u06e1\u06e4<",
        "+TT;>;>;",
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

.field public ۥ۟۟۠ۤ:I


# direct methods
.method public constructor <init>(LYue/ۥ۠ۥۡۧ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e5\u06e1\u06e7<",
            "TT;>;)V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥ۠ۥۡۧ;->ۥ۟۟(LYue/ۥ۠ۥۡۧ;)LYue/ۥۡۨۢ;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    return v0
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۠ۥۡۧ$ۥ;->ۥ۟۟()LYue/ۥ۠ۥۡۤ;

    move-result-object v0

    return-object v0
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

    iget v0, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ۟()Ljava/util/Iterator;
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

    iget-object v0, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-object v0
.end method

.method public ۥ۟۟()LYue/ۥ۠ۥۡۤ;
    .locals 3
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e0\u06e5\u06e1\u06e4<",
            "TT;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۠ۥۡۤ;

    iget v1, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥ۟۟۠ۤ:I

    if-gez v1, :cond_0

    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟۟()V

    :cond_0
    iget-object v2, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-direct {v0, v1, v2}, LYue/ۥ۠ۥۡۤ;-><init>(ILjava/lang/Object;)V

    return-object v0
.end method

.method public final ۥ۟۟۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥ۠ۥۡۧ$ۥ;->ۥ۟۟۠ۤ:I

    return-void
.end method
