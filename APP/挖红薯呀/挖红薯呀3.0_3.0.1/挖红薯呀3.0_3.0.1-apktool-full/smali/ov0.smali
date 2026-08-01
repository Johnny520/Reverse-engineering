.class public final Lov0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Ljava/util/Iterator;
.implements Lp40;


# instance fields
.field public final synthetic d:I

.field public e:I

.field public f:I

.field public g:I

.field public h:Ljava/lang/Object;

.field public final i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lpv0;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lov0;->d:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lov0;->i:Ljava/lang/Object;

    .line 8
    .line 9
    iget v0, p1, Lpv0;->g:I

    .line 10
    .line 11
    iput v0, p0, Lov0;->f:I

    .line 12
    .line 13
    iget p1, p1, Lpv0;->f:I

    .line 14
    .line 15
    iput p1, p0, Lov0;->g:I

    .line 16
    .line 17
    return-void
.end method

.method public constructor <init>(Lw11;ILey;Lj50;)V
    .locals 0

    const/4 p3, 0x1

    iput p3, p0, Lov0;->d:I

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput-object p1, p0, Lov0;->h:Ljava/lang/Object;

    .line 20
    iput p2, p0, Lov0;->e:I

    .line 21
    iput-object p4, p0, Lov0;->i:Ljava/lang/Object;

    .line 22
    iget p1, p1, Lw11;->k:I

    .line 23
    iput p1, p0, Lov0;->f:I

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 5

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lov0;->e:I

    .line 3
    .line 4
    iget v0, p0, Lov0;->f:I

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const/4 v0, 0x2

    .line 10
    iput v0, p0, Lov0;->e:I

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    iget-object v2, p0, Lov0;->i:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Lpv0;

    .line 16
    .line 17
    iget-object v3, v2, Lpv0;->d:[Ljava/lang/Object;

    .line 18
    .line 19
    iget v4, p0, Lov0;->g:I

    .line 20
    .line 21
    aget-object v3, v3, v4

    .line 22
    .line 23
    iput-object v3, p0, Lov0;->h:Ljava/lang/Object;

    .line 24
    .line 25
    iput v1, p0, Lov0;->e:I

    .line 26
    .line 27
    add-int/2addr v4, v1

    .line 28
    iget v2, v2, Lpv0;->e:I

    .line 29
    .line 30
    rem-int/2addr v4, v2

    .line 31
    iput v4, p0, Lov0;->g:I

    .line 32
    .line 33
    add-int/lit8 v0, v0, -0x1

    .line 34
    .line 35
    iput v0, p0, Lov0;->f:I

    .line 36
    .line 37
    :goto_0
    iget p0, p0, Lov0;->e:I

    .line 38
    .line 39
    if-ne p0, v1, :cond_1

    .line 40
    .line 41
    return v1

    .line 42
    :cond_1
    const/4 p0, 0x0

    .line 43
    return p0
.end method

.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lov0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    throw p0

    .line 8
    :pswitch_0
    iget v0, p0, Lov0;->e:I

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    const/4 p0, 0x1

    .line 13
    if-eq v0, p0, :cond_2

    .line 14
    .line 15
    const/4 p0, 0x2

    .line 16
    if-ne v0, p0, :cond_0

    .line 17
    .line 18
    :goto_0
    const/4 p0, 0x0

    .line 19
    goto :goto_1

    .line 20
    :cond_0
    const-string p0, "hasNext called when the iterator is in the FAILED state."

    .line 21
    .line 22
    invoke-static {p0}, Lxc;->l(Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    invoke-virtual {p0}, Lov0;->a()Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    :cond_2
    :goto_1
    return p0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lov0;->d:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const/4 p0, 0x0

    .line 7
    throw p0

    .line 8
    :pswitch_0
    iget v0, p0, Lov0;->e:I

    .line 9
    .line 10
    const/4 v1, 0x1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-ne v0, v1, :cond_0

    .line 13
    .line 14
    iput v2, p0, Lov0;->e:I

    .line 15
    .line 16
    iget-object p0, p0, Lov0;->h:Ljava/lang/Object;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x2

    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lov0;->a()Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput v2, p0, Lov0;->e:I

    .line 29
    .line 30
    iget-object p0, p0, Lov0;->h:Ljava/lang/Object;

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    invoke-static {}, Lxc;->m()V

    .line 34
    .line 35
    .line 36
    const/4 p0, 0x0

    .line 37
    :goto_0
    return-object p0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lov0;->d:I

    .line 2
    .line 3
    packed-switch p0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v0, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0

    .line 14
    :pswitch_0
    new-instance p0, Ljava/lang/UnsupportedOperationException;

    .line 15
    .line 16
    const-string v0, "Operation is not supported for read-only collection"

    .line 17
    .line 18
    invoke-direct {p0, v0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    throw p0

    .line 22
    nop

    .line 23
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
