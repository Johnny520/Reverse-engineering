.class public final Lx30;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/util/Iterator;
.implements Llo0;


# instance fields
.field public final synthetic ε:I

.field public final ζ:Ljava/util/Iterator;

.field public η:I

.field public θ:Ljava/lang/Object;

.field public final synthetic ι:Lss1;


# direct methods
.method public constructor <init>(Lc40;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lx30;->ε:I

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 22
    iput-object p1, p0, Lx30;->ι:Lss1;

    .line 23
    iget-object p1, p1, Lc40;->α:Lss1;

    .line 24
    invoke-interface {p1}, Lss1;->iterator()Ljava/util/Iterator;

    move-result-object p1

    iput-object p1, p0, Lx30;->ζ:Ljava/util/Iterator;

    return-void
.end method

.method public constructor <init>(Ly30;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lx30;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lx30;->ι:Lss1;

    .line 8
    .line 9
    iget-object p1, p1, Ly30;->α:Lss1;

    .line 10
    .line 11
    invoke-interface {p1}, Lss1;->iterator()Ljava/util/Iterator;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    iput-object p1, p0, Lx30;->ζ:Ljava/util/Iterator;

    .line 16
    .line 17
    const/4 p1, -0x1

    .line 18
    iput p1, p0, Lx30;->η:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lx30;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lx30;->η:I

    .line 7
    .line 8
    const/4 v1, 0x1

    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v1, 0x2

    .line 13
    if-ne v0, v1, :cond_1

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, Lx30;->β()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    :goto_0
    return v1

    .line 22
    :pswitch_0
    iget v0, p0, Lx30;->η:I

    .line 23
    .line 24
    const/4 v1, -0x1

    .line 25
    if-ne v0, v1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p0}, Lx30;->α()V

    .line 28
    .line 29
    .line 30
    :cond_2
    iget p0, p0, Lx30;->η:I

    .line 31
    .line 32
    const/4 v0, 0x1

    .line 33
    if-ne p0, v0, :cond_3

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_3
    const/4 v0, 0x0

    .line 37
    :goto_1
    return v0

    .line 38
    nop

    .line 39
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lx30;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lx30;->η:I

    .line 7
    .line 8
    const/4 v1, 0x2

    .line 9
    if-eq v0, v1, :cond_2

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0}, Lx30;->β()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_0
    invoke-static {}, Lγ;->ο()V

    .line 21
    .line 22
    .line 23
    :goto_0
    const/4 p0, 0x0

    .line 24
    goto :goto_2

    .line 25
    :cond_1
    :goto_1
    const/4 v0, 0x0

    .line 26
    iput v0, p0, Lx30;->η:I

    .line 27
    .line 28
    iget-object p0, p0, Lx30;->θ:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p0, Ljava/util/Iterator;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    invoke-static {}, Lγ;->ο()V

    .line 41
    .line 42
    .line 43
    goto :goto_0

    .line 44
    :goto_2
    return-object p0

    .line 45
    :pswitch_0
    iget v0, p0, Lx30;->η:I

    .line 46
    .line 47
    const/4 v1, -0x1

    .line 48
    if-ne v0, v1, :cond_3

    .line 49
    .line 50
    invoke-virtual {p0}, Lx30;->α()V

    .line 51
    .line 52
    .line 53
    :cond_3
    iget v0, p0, Lx30;->η:I

    .line 54
    .line 55
    if-eqz v0, :cond_4

    .line 56
    .line 57
    iget-object v0, p0, Lx30;->θ:Ljava/lang/Object;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    iput-object v2, p0, Lx30;->θ:Ljava/lang/Object;

    .line 61
    .line 62
    iput v1, p0, Lx30;->η:I

    .line 63
    .line 64
    goto :goto_3

    .line 65
    :cond_4
    invoke-static {}, Lγ;->ο()V

    .line 66
    .line 67
    .line 68
    const/4 v0, 0x0

    .line 69
    :goto_3
    return-object v0

    .line 70
    nop

    .line 71
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    iget p0, p0, Lx30;->ε:I

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

.method public α()V
    .locals 4

    .line 1
    iget-object v0, p0, Lx30;->ι:Lss1;

    .line 2
    .line 3
    check-cast v0, Ly30;

    .line 4
    .line 5
    :cond_0
    iget-object v1, p0, Lx30;->ζ:Ljava/util/Iterator;

    .line 6
    .line 7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    if-eqz v2, :cond_1

    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    iget-object v2, v0, Ly30;->γ:La80;

    .line 18
    .line 19
    invoke-interface {v2, v1}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    check-cast v2, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    iget-boolean v3, v0, Ly30;->β:Z

    .line 30
    .line 31
    if-ne v2, v3, :cond_0

    .line 32
    .line 33
    iput-object v1, p0, Lx30;->θ:Ljava/lang/Object;

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    iput v0, p0, Lx30;->η:I

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    const/4 v0, 0x0

    .line 40
    iput v0, p0, Lx30;->η:I

    .line 41
    .line 42
    return-void
.end method

.method public β()Z
    .locals 4

    .line 1
    iget-object v0, p0, Lx30;->θ:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Iterator;

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iput v1, p0, Lx30;->η:I

    .line 15
    .line 16
    return v1

    .line 17
    :cond_0
    iget-object v0, p0, Lx30;->ζ:Ljava/util/Iterator;

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    if-eqz v2, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    iget-object v2, p0, Lx30;->ι:Lss1;

    .line 30
    .line 31
    check-cast v2, Lc40;

    .line 32
    .line 33
    iget-object v3, v2, Lc40;->γ:La80;

    .line 34
    .line 35
    iget-object v2, v2, Lc40;->β:La80;

    .line 36
    .line 37
    invoke-interface {v2, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-interface {v3, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Ljava/util/Iterator;

    .line 46
    .line 47
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_0

    .line 52
    .line 53
    iput-object v0, p0, Lx30;->θ:Ljava/lang/Object;

    .line 54
    .line 55
    iput v1, p0, Lx30;->η:I

    .line 56
    .line 57
    return v1

    .line 58
    :cond_1
    const/4 v0, 0x2

    .line 59
    iput v0, p0, Lx30;->η:I

    .line 60
    .line 61
    const/4 v0, 0x0

    .line 62
    iput-object v0, p0, Lx30;->θ:Ljava/lang/Object;

    .line 63
    .line 64
    const/4 p0, 0x0

    .line 65
    return p0
.end method
