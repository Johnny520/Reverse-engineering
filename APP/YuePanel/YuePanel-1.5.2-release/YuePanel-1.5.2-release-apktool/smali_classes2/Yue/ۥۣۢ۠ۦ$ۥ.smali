.class public final LYue/ۥۣۢ۠ۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;
.implements LYue/ۥ۠ۦۢۨ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۣۢ۠ۦ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "TT;>;",
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

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥۣۢ۠ۦ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06e0\u06e3\u06e6<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥۣۢ۠ۦ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e0\u06e3\u06e6<",
            "TT;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۢ۠ۦ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥۣۢ۠ۦ;->ۥ۟۟۟(LYue/ۥۣۢ۠ۦ;)LYue/ۥۡۨۢ;

    move-result-object p1

    invoke-interface {p1}, LYue/ۥۡۨۢ;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-void
.end method

.method private final ۥ()V
    .locals 2

    :goto_0
    iget v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۢ۠ۦ;

    invoke-static {v1}, LYue/ۥۣۢ۠ۦ;->ۥ۟۟۟۟(LYue/ۥۣۢ۠ۦ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    iget v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 2

    invoke-direct {p0}, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ()V

    iget v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۢ۠ۦ;

    invoke-static {v1}, LYue/ۥۣۢ۠ۦ;->ۥ۟۟(LYue/ۥۣۢ۠ۦ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public next()Ljava/lang/Object;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    invoke-direct {p0}, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ()V

    iget v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۣۢ۠ۦ;

    invoke-static {v1}, LYue/ۥۣۢ۠ۦ;->ۥ۟۟(LYue/ۥۣۢ۠ۦ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    iget v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v0, v0, 0x1

    iput v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

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

    iget-object v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥۣ۟۟۠:Ljava/util/Iterator;

    return-object v0
.end method

.method public final ۥ۟۟()I
    .locals 1

    iget v0, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    return v0
.end method

.method public final ۥ۟۟۟(I)V
    .locals 0

    iput p1, p0, LYue/ۥۣۢ۠ۦ$ۥ;->ۥ۟۟۠ۤ:I

    return-void
.end method
