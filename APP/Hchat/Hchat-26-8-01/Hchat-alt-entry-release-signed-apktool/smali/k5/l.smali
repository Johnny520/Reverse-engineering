.class public final Lk5/l;
.super Lo5/s;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic k:I

.field public final synthetic l:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Landroidx/lifecycle/x;III)V
    .locals 0

    .line 1
    iput p5, p0, Lk5/l;->k:I

    .line 2
    .line 3
    iput-object p1, p0, Lk5/l;->l:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0, p2, p3, p4}, Lo5/s;-><init>(Landroidx/lifecycle/x;II)V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(La5/a;I)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lk5/l;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/l;->l:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lo5/r;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lo5/r;->a(La5/a;I)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    return-object p1

    .line 15
    :pswitch_0
    const/4 p2, 0x0

    .line 16
    invoke-virtual {p1, p2}, La5/a;->o(Z)I

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    return-object p1

    .line 25
    :pswitch_1
    const/4 p2, 0x0

    .line 26
    invoke-virtual {p1, p2}, La5/a;->o(Z)I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    return-object p1

    .line 35
    :pswitch_2
    const/4 p2, 0x0

    .line 36
    invoke-virtual {p1, p2}, La5/a;->o(Z)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    return-object p1

    .line 45
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lk5/l;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Lo5/s;->next()Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    iget v0, p0, Lo5/s;->j:I

    .line 12
    .line 13
    iget-object v1, p0, Lk5/l;->l:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Lk5/n;

    .line 16
    .line 17
    iget-object v2, v1, Lk5/n;->l:Ljava/lang/Object;

    .line 18
    .line 19
    check-cast v2, Lk5/o;

    .line 20
    .line 21
    iget v2, v2, Lk5/o;->s:I

    .line 22
    .line 23
    if-ne v0, v2, :cond_0

    .line 24
    .line 25
    iget-object v0, p0, Lo5/s;->g:La5/a;

    .line 26
    .line 27
    iget v0, v0, La5/a;->h:I

    .line 28
    .line 29
    iput v0, v1, Lk5/n;->k:I

    .line 30
    .line 31
    :cond_0
    invoke-super {p0}, Lo5/s;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Integer;

    .line 36
    .line 37
    return-object v0

    .line 38
    :pswitch_1
    iget v0, p0, Lo5/s;->j:I

    .line 39
    .line 40
    iget-object v1, p0, Lk5/l;->l:Ljava/lang/Object;

    .line 41
    .line 42
    check-cast v1, Lk5/n;

    .line 43
    .line 44
    iget-object v2, v1, Lk5/n;->l:Ljava/lang/Object;

    .line 45
    .line 46
    check-cast v2, Lk5/o;

    .line 47
    .line 48
    iget v2, v2, Lk5/o;->r:I

    .line 49
    .line 50
    if-ne v0, v2, :cond_1

    .line 51
    .line 52
    iget-object v0, p0, Lo5/s;->g:La5/a;

    .line 53
    .line 54
    iget v0, v0, La5/a;->h:I

    .line 55
    .line 56
    iput v0, v1, Lk5/n;->j:I

    .line 57
    .line 58
    :cond_1
    invoke-super {p0}, Lo5/s;->next()Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Ljava/lang/Integer;

    .line 63
    .line 64
    return-object v0

    .line 65
    :pswitch_2
    iget v0, p0, Lo5/s;->j:I

    .line 66
    .line 67
    iget-object v1, p0, Lk5/l;->l:Ljava/lang/Object;

    .line 68
    .line 69
    check-cast v1, Lk5/n;

    .line 70
    .line 71
    iget-object v2, v1, Lk5/n;->l:Ljava/lang/Object;

    .line 72
    .line 73
    check-cast v2, Lk5/o;

    .line 74
    .line 75
    iget v2, v2, Lk5/o;->q:I

    .line 76
    .line 77
    if-ne v0, v2, :cond_2

    .line 78
    .line 79
    iget-object v0, p0, Lo5/s;->g:La5/a;

    .line 80
    .line 81
    iget v0, v0, La5/a;->h:I

    .line 82
    .line 83
    iput v0, v1, Lk5/n;->i:I

    .line 84
    .line 85
    :cond_2
    invoke-super {p0}, Lo5/s;->next()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    check-cast v0, Ljava/lang/Integer;

    .line 90
    .line 91
    return-object v0

    .line 92
    nop

    .line 93
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
