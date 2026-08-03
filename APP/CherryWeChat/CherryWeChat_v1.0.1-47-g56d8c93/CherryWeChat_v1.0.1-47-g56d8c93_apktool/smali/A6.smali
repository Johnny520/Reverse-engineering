.class public final LA6;
.super LM4;
.source ""


# instance fields
.field public g:I


# virtual methods
.method public final clear()V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA6;->g:I

    invoke-super {p0}, Lsy;->clear()V

    return-void
.end method

.method public final g(LM4;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA6;->g:I

    invoke-super {p0, p1}, Lsy;->g(LM4;)V

    return-void
.end method

.method public final h(I)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA6;->g:I

    invoke-super {p0, p1}, Lsy;->h(I)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final hashCode()I
    .locals 1

    iget v0, p0, LA6;->g:I

    if-nez v0, :cond_0

    invoke-super {p0}, Lsy;->hashCode()I

    move-result v0

    iput v0, p0, LA6;->g:I

    :cond_0
    iget v0, p0, LA6;->g:I

    return v0
.end method

.method public final i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA6;->g:I

    invoke-super {p0, p1, p2}, Lsy;->i(ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA6;->g:I

    invoke-super {p0, p1, p2}, Lsy;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
