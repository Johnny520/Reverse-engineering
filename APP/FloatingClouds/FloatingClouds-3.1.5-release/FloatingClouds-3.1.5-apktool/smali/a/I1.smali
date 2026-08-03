.class public final La/I1;
.super La/Z9;
.source "SourceFile"


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    iput p1, p0, La/I1;->d:I

    iput-object p2, p0, La/I1;->e:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/L1;

    invoke-virtual {v0}, La/L1;->clear()V

    return-void

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    invoke-virtual {v0}, La/ge;->clear()V

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final b(II)Ljava/lang/Object;
    .locals 1

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, La/I1;->e:Ljava/lang/Object;

    check-cast p2, La/L1;

    iget-object p2, p2, La/L1;->b:[Ljava/lang/Object;

    aget-object p1, p2, p1

    return-object p1

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    iget-object v0, v0, La/ge;->b:[Ljava/lang/Object;

    shl-int/lit8 p1, p1, 0x1

    add-int/2addr p1, p2

    aget-object p1, v0, p1

    return-object p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final c()Ljava/util/Map;
    .locals 2

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    const-string v1, "not a map"

    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    return-object v0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final d()I
    .locals 1

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/L1;

    iget v0, v0, La/L1;->c:I

    return v0

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    iget v0, v0, La/ge;->c:I

    return v0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final e(Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/L1;

    if-nez p1, :cond_0

    invoke-virtual {v0}, La/L1;->d()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1, p1}, La/L1;->c(ILjava/lang/Object;)I

    move-result p1

    :goto_0
    return p1

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    invoke-virtual {v0, p1}, La/ge;->e(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final f(Ljava/lang/Object;)I
    .locals 2

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/L1;

    if-nez p1, :cond_0

    invoke-virtual {v0}, La/L1;->d()I

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    invoke-virtual {v0, v1, p1}, La/L1;->c(ILjava/lang/Object;)I

    move-result p1

    :goto_0
    return p1

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    invoke-virtual {v0, p1}, La/ge;->g(Ljava/lang/Object;)I

    move-result p1

    return p1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final g(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 1

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object p2, p0, La/I1;->e:Ljava/lang/Object;

    check-cast p2, La/L1;

    invoke-virtual {p2, p1}, La/L1;->add(Ljava/lang/Object;)Z

    return-void

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    invoke-virtual {v0, p1, p2}, La/ge;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final h(I)V
    .locals 1

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/L1;

    invoke-virtual {v0, p1}, La/L1;->e(I)V

    return-void

    :pswitch_0
    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    invoke-virtual {v0, p1}, La/ge;->i(I)Ljava/lang/Object;

    return-void

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final i(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, La/I1;->d:I

    packed-switch v0, :pswitch_data_0

    new-instance p1, Ljava/lang/UnsupportedOperationException;

    const-string p2, "not a map"

    invoke-direct {p1, p2}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    shl-int/lit8 p1, p1, 0x1

    add-int/lit8 p1, p1, 0x1

    iget-object v0, p0, La/I1;->e:Ljava/lang/Object;

    check-cast v0, La/J1;

    iget-object v0, v0, La/ge;->b:[Ljava/lang/Object;

    aget-object v1, v0, p1

    aput-object p2, v0, p1

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
