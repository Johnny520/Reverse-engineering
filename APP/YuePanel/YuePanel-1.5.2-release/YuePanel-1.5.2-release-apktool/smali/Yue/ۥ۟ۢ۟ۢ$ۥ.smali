.class public LYue/ۥ۟ۢ۟ۢ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۢۡۢۦ$ۥ۟;


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
        "LYue/\u06e5\u06e2\u06e1\u06e2\u06e6$\u06e5\u06df<",
        "TT;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۢ۟ۢ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۢ۟ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(II)V
    .locals 1

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ۟۟۟(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object p1, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۟:LYue/ۥۣۣۢۡ;

    invoke-virtual {p1, p2}, LYue/ۥۣۣۢۡ;->ۥ۟۟۟۟(I)LYue/ۥۣۣۢۡ$ۥ;

    move-result-object p1

    if-nez p1, :cond_1

    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v0, "tile not found @"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string p2, "AsyncListUtil"

    invoke-static {p2, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_1
    iget-object p2, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object p2, p2, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۢۦ$ۥ;

    invoke-interface {p2, p1}, LYue/ۥۢۡۢۦ$ۥ;->ۥ۟۟۟(LYue/ۥۣۣۢۡ$ۥ;)V

    return-void
.end method

.method public ۥ۟(II)V
    .locals 0

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ۟۟۟(I)Z

    move-result p1

    if-nez p1, :cond_0

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iput p2, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۧ:I

    iget-object p1, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟:LYue/ۥ۟ۢ۟ۢ$ۥ۟۟۟;

    invoke-virtual {p1}, LYue/ۥ۟ۢ۟ۢ$ۥ۟۟۟;->ۥ۟۟()V

    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget p2, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۠:I

    iput p2, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۨ:I

    invoke-virtual {p0}, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ۟۟۟۟()V

    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    const/4 p2, 0x0

    iput-boolean p2, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۥ:Z

    invoke-virtual {p1}, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۡ()V

    return-void
.end method

.method public ۥ۟۟(ILYue/ۥۣۣۢۡ$ۥ;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "LYue/\u06e5\u06e2\u06e1\u06e3\u06e3$\u06e5<",
            "TT;>;)V"
        }
    .end annotation

    invoke-virtual {p0, p1}, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ۟۟۟(I)Z

    move-result p1

    if-nez p1, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object p1, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۢۦ$ۥ;

    invoke-interface {p1, p2}, LYue/ۥۢۡۢۦ$ۥ;->ۥ۟۟۟(LYue/ۥۣۣۢۡ$ۥ;)V

    return-void

    :cond_0
    iget-object p1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object p1, p1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۟:LYue/ۥۣۣۢۡ;

    invoke-virtual {p1, p2}, LYue/ۥۣۣۢۡ;->ۥ(LYue/ۥۣۣۢۡ$ۥ;)LYue/ۥۣۣۢۡ$ۥ;

    move-result-object p1

    if-eqz p1, :cond_1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "duplicate tile @"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p1, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "AsyncListUtil"

    invoke-static {v1, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۢۦ$ۥ;

    invoke-interface {v0, p1}, LYue/ۥۢۡۢۦ$ۥ;->ۥ۟۟۟(LYue/ۥۣۣۢۡ$ۥ;)V

    :cond_1
    iget p1, p2, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟:I

    iget v0, p2, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟۟:I

    add-int/2addr p1, v0

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۠۟:Landroid/util/SparseIntArray;

    invoke-virtual {v1}, Landroid/util/SparseIntArray;->size()I

    move-result v1

    if-ge v0, v1, :cond_3

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۠۟:Landroid/util/SparseIntArray;

    invoke-virtual {v1, v0}, Landroid/util/SparseIntArray;->keyAt(I)I

    move-result v1

    iget v2, p2, LYue/ۥۣۣۢۡ$ۥ;->ۥ۟:I

    if-gt v2, v1, :cond_2

    if-ge v1, p1, :cond_2

    iget-object v2, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v2, v2, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۠۟:Landroid/util/SparseIntArray;

    invoke-virtual {v2, v0}, Landroid/util/SparseIntArray;->removeAt(I)V

    iget-object v2, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v2, v2, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟:LYue/ۥ۟ۢ۟ۢ$ۥ۟۟۟;

    invoke-virtual {v2, v1}, LYue/ۥ۟ۢ۟ۢ$ۥ۟۟۟;->ۥ۟۟۟(I)V

    goto :goto_0

    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_3
    return-void
.end method

.method public final ۥ۟۟۟(I)Z
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۠:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method public final ۥ۟۟۟۟()V
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۟:LYue/ۥۣۣۢۡ;

    invoke-virtual {v1}, LYue/ۥۣۣۢۡ;->ۥ۟۟۟۠()I

    move-result v1

    if-ge v0, v1, :cond_0

    iget-object v1, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v2, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟ۡ:LYue/ۥۢۡۢۦ$ۥ;

    iget-object v1, v1, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۟:LYue/ۥۣۣۢۡ;

    invoke-virtual {v1, v0}, LYue/ۥۣۣۢۡ;->ۥ۟۟(I)LYue/ۥۣۣۢۡ$ۥ;

    move-result-object v1

    invoke-interface {v2, v1}, LYue/ۥۢۡۢۦ$ۥ;->ۥ۟۟۟(LYue/ۥۣۣۢۡ$ۥ;)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۢ۟ۢ$ۥ;->ۥ:LYue/ۥ۟ۢ۟ۢ;

    iget-object v0, v0, LYue/ۥ۟ۢ۟ۢ;->ۥ۟۟۟۟:LYue/ۥۣۣۢۡ;

    invoke-virtual {v0}, LYue/ۥۣۣۢۡ;->ۥ۟()V

    return-void
.end method
