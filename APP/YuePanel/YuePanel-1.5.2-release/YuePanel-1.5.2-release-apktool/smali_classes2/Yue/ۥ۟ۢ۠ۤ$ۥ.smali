.class public LYue/ۥ۟ۢ۠ۤ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Iterator;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟ۢ۠ۤ;->iterator()Ljava/util/Iterator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Iterator<",
        "LYue/\u06e5\u06df\u06e2\u06e0\u06e2;",
        ">;"
    }
.end annotation


# instance fields
.field public ۥۣ۟۟۠:I

.field public ۥ۟۟۠ۤ:I

.field public final synthetic ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۢ۠ۤ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟(LYue/ۥ۟ۢ۠ۤ;)I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥۣ۟۟۠:I

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    return-void
.end method


# virtual methods
.method public hasNext()Z
    .locals 3

    invoke-virtual {p0}, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ()V

    :goto_0
    iget v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    invoke-static {v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟(LYue/ۥ۟ۢ۠ۤ;)I

    move-result v1

    const/4 v2, 0x1

    if-ge v0, v1, :cond_0

    iget-object v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    iget-object v0, v0, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۠ۤ:[Ljava/lang/String;

    iget v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    aget-object v0, v0, v1

    invoke-static {v0}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟ۡۦ(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    add-int/2addr v0, v2

    iput v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    goto :goto_0

    :cond_0
    iget v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    invoke-static {v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟(LYue/ۥ۟ۢ۠ۤ;)I

    move-result v1

    if-ge v0, v1, :cond_1

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    return v2
.end method

.method public bridge synthetic next()Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟()LYue/ۥ۟ۢ۠ۢ;

    move-result-object v0

    return-object v0
.end method

.method public remove()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    iget v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v1, v1, -0x1

    iput v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    invoke-static {v0, v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۟(LYue/ۥ۟ۢ۠ۤ;I)V

    iget v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥۣ۟۟۠:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥۣ۟۟۠:I

    return-void
.end method

.method public final ۥ()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    invoke-static {v0}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟(LYue/ۥ۟ۢ۠ۤ;)I

    move-result v0

    iget v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥۣ۟۟۠:I

    if-ne v0, v1, :cond_0

    return-void

    :cond_0
    new-instance v0, Ljava/util/ConcurrentModificationException;

    const-string v1, "Use Iterator#remove() instead to remove attributes while iterating."

    invoke-direct {v0, v1}, Ljava/util/ConcurrentModificationException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public ۥ۟()LYue/ۥ۟ۢ۠ۢ;
    .locals 5

    invoke-virtual {p0}, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ()V

    iget v0, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    iget-object v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    invoke-static {v1}, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟(LYue/ۥ۟ۢ۠ۤ;)I

    move-result v1

    if-ge v0, v1, :cond_0

    new-instance v0, LYue/ۥ۟ۢ۠ۢ;

    iget-object v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۥ:LYue/ۥ۟ۢ۠ۤ;

    iget-object v2, v1, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۠ۤ:[Ljava/lang/String;

    iget v3, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    aget-object v2, v2, v3

    iget-object v4, v1, LYue/ۥ۟ۢ۠ۤ;->ۥ۟۟۠ۥ:[Ljava/lang/Object;

    aget-object v3, v4, v3

    check-cast v3, Ljava/lang/String;

    invoke-direct {v0, v2, v3, v1}, LYue/ۥ۟ۢ۠ۢ;-><init>(Ljava/lang/String;Ljava/lang/String;LYue/ۥ۟ۢ۠ۤ;)V

    iget v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, LYue/ۥ۟ۢ۠ۤ$ۥ;->ۥ۟۟۠ۤ:I

    return-object v0

    :cond_0
    new-instance v0, Ljava/util/NoSuchElementException;

    invoke-direct {v0}, Ljava/util/NoSuchElementException;-><init>()V

    throw v0
.end method
