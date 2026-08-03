.class public final Lm1/f0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;
.implements Lhg/a;


# instance fields
.field public final synthetic g:I

.field public final h:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Ljava/util/Enumeration;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, Lm1/f0;->g:I

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lm1/f0;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lm1/g0;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lm1/f0;->g:I

    .line 34
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 35
    iget-object p1, p1, Lm1/g0;->p:Ljava/util/List;

    .line 36
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lm1/f0;->h:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Ls0/g;)V
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lm1/f0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    const/16 v0, 0x8

    .line 8
    .line 9
    new-array v1, v0, [Lp0/k;

    .line 10
    .line 11
    const/4 v2, 0x0

    .line 12
    :goto_0
    if-ge v2, v0, :cond_0

    .line 13
    .line 14
    new-instance v3, Lp0/m;

    .line 15
    .line 16
    invoke-direct {v3, p0}, Lp0/m;-><init>(Lm1/f0;)V

    .line 17
    .line 18
    .line 19
    aput-object v3, v1, v2

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    new-instance v0, Lp0/d;

    .line 25
    .line 26
    invoke-direct {v0, p1, v1}, Lp0/d;-><init>(Ls0/g;[Lp0/k;)V

    .line 27
    .line 28
    .line 29
    iput-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 30
    .line 31
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 1

    .line 1
    iget v0, p0, Lm1/f0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Enumeration;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Enumeration;->hasMoreElements()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    return v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lp0/d;

    .line 18
    .line 19
    iget-boolean v0, v0, Lp0/c;->i:Z

    .line 20
    .line 21
    return v0

    .line 22
    :pswitch_1
    iget-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Ljava/util/Iterator;

    .line 25
    .line 26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    return v0

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lm1/f0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Enumeration;

    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/Enumeration;->nextElement()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    return-object v0

    .line 15
    :pswitch_0
    iget-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v0, Lp0/d;

    .line 18
    .line 19
    invoke-virtual {v0}, Lp0/d;->next()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/util/Map$Entry;

    .line 24
    .line 25
    return-object v0

    .line 26
    :pswitch_1
    iget-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Ljava/util/Iterator;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    check-cast v0, Lm1/i0;

    .line 35
    .line 36
    return-object v0

    .line 37
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 2

    .line 1
    iget v0, p0, Lm1/f0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 7
    .line 8
    const-string v1, "Operation is not supported for read-only collection"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw v0

    .line 14
    :pswitch_0
    iget-object v0, p0, Lm1/f0;->h:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v0, Lp0/d;

    .line 17
    .line 18
    invoke-virtual {v0}, Lp0/d;->remove()V

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :pswitch_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 23
    .line 24
    const-string v1, "Operation is not supported for read-only collection"

    .line 25
    .line 26
    invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    nop

    .line 31
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
