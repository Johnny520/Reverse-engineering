.class public LYue/ۥ۟ۢ۟ۢ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۢۦ$ۥ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۢ۟ۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e2\u06e1\u06e2\u06e6$\u06e5<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public ۥ:LYue/ۥۣۣۢۡ$ۥ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e3$\u06e5<",
            "TT;>;"
        }
    .end annotation
.end field

.field public final ۥ۟:Landroid/util/SparseBooleanArray;

.field public ۥ۟۟:I

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I

.field public ۥ۟۟۟۠:I

.field public final synthetic ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۢ۟ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance p1, Landroid/util/SparseBooleanArray;

    invoke-direct {p1}, Landroid/util/SparseBooleanArray;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    return-void
.end method


# virtual methods
.method public ۥ(IIIII)V
    .locals 1

    if-le p1, p2, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۢ(I)I

    move-result p1

    invoke-virtual {p0, p2}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۢ(I)I

    move-result p2

    invoke-virtual {p0, p3}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۢ(I)I

    move-result p3

    iput p3, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۟:I

    invoke-virtual {p0, p4}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۢ(I)I

    move-result p3

    iput p3, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۠:I

    const/4 p4, 0x0

    const/4 v0, 0x1

    if-ne p5, v0, :cond_1

    iget p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۟:I

    invoke-virtual {p0, p1, p2, p5, v0}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۦ(IIIZ)V

    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget p1, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟:I

    add-int/2addr p2, p1

    iget p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۠:I

    invoke-virtual {p0, p2, p1, p5, p4}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۦ(IIIZ)V

    goto :goto_0

    :cond_1
    invoke-virtual {p0, p1, p3, p5, p4}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۦ(IIIZ)V

    iget p2, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۟:I

    iget-object p3, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget p3, p3, LYue/ۥ۟ۢ۟ۢ;->ۥ۟:I

    sub-int/2addr p1, p3

    invoke-virtual {p0, p2, p1, p5, v0}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۦ(IIIZ)V

    :goto_0
    return-void
.end method

.method public ۥ۟(II)V
    .locals 4

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥۣ۟۟۟(I)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۟()LYue/ۥۣۣۢۡ$ۥ;

    move-result-object v0

    iput p1, v0, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟:I

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟:I

    iget v2, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟:I

    sub-int/2addr v2, p1

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result p1

    iput p1, v0, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟۟:I

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟:LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;

    iget-object v2, v0, LYue/ۥۣۣۢۡ$ۥ;->ۥ:[Ljava/lang/Object;

    iget v3, v0, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟:I

    invoke-virtual {v1, v2, v3, p1}, LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;->ۥ([Ljava/lang/Object;II)V

    invoke-virtual {p0, p2}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ(I)V

    invoke-virtual {p0, v0}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۠(LYue/ۥۣۣۢۡ$ۥ;)V

    return-void
.end method

.method public ۥ۟۟(I)V
    .locals 2

    iput p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟:I

    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    invoke-virtual {p1}, Landroid/util/SparseBooleanArray;->clear()V

    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object p1, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟:LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;

    invoke-virtual {p1}, LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;->ۥ۟۟۟()I

    move-result p1

    iput p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟:I

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۢۡۢۦ$ۥ۟;

    iget v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟:I

    invoke-interface {v0, v1, p1}, LYue/ۥۢۡۢۦ$ۥ۟;->ۥ۟(II)V

    return-void
.end method

.method public ۥ۟۟۟(LYue/ۥۣۣۢۡ$ۥ;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e3$\u06e5<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟:LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;

    iget-object v1, p1, LYue/ۥۣۣۢۡ$ۥ;->ۥ:[Ljava/lang/Object;

    iget v2, p1, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟۟:I

    invoke-virtual {v0, v1, v2}, LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;->ۥ۟۟([Ljava/lang/Object;I)V

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ:LYue/ۥۣۣۢۡ$ۥ;

    iput-object v0, p1, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟۟۟:LYue/ۥۣۣۢۡ$ۥ;

    iput-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ:LYue/ۥۣۣۢۡ$ۥ;

    return-void
.end method

.method public final ۥ۟۟۟۟()LYue/ۥۣۣۢۡ$ۥ;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e3$\u06e5<",
            "TT;>;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ:LYue/ۥۣۣۢۡ$ۥ;

    if-eqz v0, :cond_0

    iget-object v1, v0, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟۟۟:LYue/ۥۣۣۢۡ$ۥ;

    iput-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ:LYue/ۥۣۣۢۡ$ۥ;

    return-object v0

    :cond_0
    new-instance v0, LYue/ۥۣۣۢۡ$ۥ;

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v2, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ:Ljava/lang/Class;

    iget v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟:I

    invoke-direct {v0, v2, v1}, LYue/ۥۣۣۢۡ$ۥ;-><init>(Ljava/lang/Class;I)V

    return-object v0
.end method

.method public final ۥ۟۟۟۠(LYue/ۥۣۣۢۡ$ۥ;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e3$\u06e5<",
            "TT;>;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    iget v1, p1, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟:I

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Landroid/util/SparseBooleanArray;->put(IZ)V

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۢۡۢۦ$ۥ۟;

    iget v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟:I

    invoke-interface {v0, v1, p1}, LYue/ۥۢۡۢۦ$ۥ۟;->ۥ۟۟(ILYue/ۥۣۣۢۡ$ۥ;)V

    return-void
.end method

.method public final ۥ۟۟۟ۡ(I)V
    .locals 7

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟:LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;

    invoke-virtual {v0}, LYue/ۥ۟ۢ۟ۢ$ۥ۟۟;->ۥ۟()I

    move-result v0

    :goto_0
    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    invoke-virtual {v1}, Landroid/util/SparseBooleanArray;->size()I

    move-result v1

    if-lt v1, v0, :cond_3

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v1

    iget-object v2, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    invoke-virtual {v2}, Landroid/util/SparseBooleanArray;->size()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    invoke-virtual {v2, v3}, Landroid/util/SparseBooleanArray;->keyAt(I)I

    move-result v2

    iget v3, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۟:I

    sub-int/2addr v3, v1

    iget v5, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟۠:I

    sub-int v5, v2, v5

    if-lez v3, :cond_1

    if-ge v3, v5, :cond_0

    const/4 v6, 0x2

    if-ne p1, v6, :cond_1

    :cond_0
    invoke-virtual {p0, v1}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۥ(I)V

    goto :goto_0

    :cond_1
    if-lez v5, :cond_3

    if-lt v3, v5, :cond_2

    if-ne p1, v4, :cond_3

    :cond_2
    invoke-virtual {p0, v2}, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۥ(I)V

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ۥ۟۟۟ۢ(I)I
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟:I

    rem-int v0, p1, v0

    sub-int/2addr p1, v0

    return p1
.end method

.method public final ۥۣ۟۟۟(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->get(I)Z

    move-result p1

    return p1
.end method

.method public final varargs ۥ۟۟۟ۤ(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "[BKGR] "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "AsyncListUtil"

    invoke-static {p2, p1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    return-void
.end method

.method public final ۥ۟۟۟ۥ(I)V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟:Landroid/util/SparseBooleanArray;

    invoke-virtual {v0, p1}, Landroid/util/SparseBooleanArray;->delete(I)V

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۠:LYue/ۥۢۡۢۦ$ۥ۟;

    iget v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟:I

    invoke-interface {v0, v1, p1}, LYue/ۥۢۡۢۦ$ۥ۟;->ۥ(II)V

    return-void
.end method

.method public final ۥ۟۟۟ۦ(IIIZ)V
    .locals 3

    move v0, p1

    :goto_0
    if-gt v0, p2, :cond_1

    if-eqz p4, :cond_0

    add-int v1, p2, p1

    sub-int/2addr v1, v0

    goto :goto_1

    :cond_0
    move v1, v0

    :goto_1
    iget-object v2, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v2, v2, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۢۦ$ۥ;

    invoke-interface {v2, v1, p3}, LYue/ۥۢۡۢۦ$ۥ;->ۥ۟(II)V

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ۟;->ۥ۟۟۟ۡ:LYue/ۥ۟ۢ۟ۢ;

    iget v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟:I

    add-int/2addr v0, v1

    goto :goto_0

    :cond_1
    return-void
.end method
