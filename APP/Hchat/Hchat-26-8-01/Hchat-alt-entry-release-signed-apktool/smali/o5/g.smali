.class public final Lo5/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;


# instance fields
.field public final g:La5/a;

.field public final h:I

.field public i:I

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Iterable;


# direct methods
.method public constructor <init>(Lk5/a;Landroidx/lifecycle/x;II)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lo5/g;->j:I

    .line 3
    .line 4
    iput-object p1, p0, Lo5/g;->k:Ljava/lang/Iterable;

    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    new-instance p1, La5/a;

    .line 13
    .line 14
    const/4 v0, 0x5

    .line 15
    invoke-direct {p1, p3, v0, p2}, La5/a;-><init>(IILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    iput-object p1, p0, Lo5/g;->g:La5/a;

    .line 19
    .line 20
    iput p4, p0, Lo5/g;->h:I

    .line 21
    .line 22
    return-void
.end method

.method public constructor <init>(Lo5/h;La5/a;I)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, Lo5/g;->j:I

    .line 23
    iput-object p1, p0, Lo5/g;->k:Ljava/lang/Iterable;

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 25
    iput-object p2, p0, Lo5/g;->g:La5/a;

    .line 26
    iput p3, p0, Lo5/g;->h:I

    return-void
.end method


# virtual methods
.method public final hasNext()Z
    .locals 2

    .line 1
    iget v0, p0, Lo5/g;->i:I

    .line 2
    .line 3
    iget v1, p0, Lo5/g;->h:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
.end method

.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lo5/g;->i:I

    .line 2
    .line 3
    iget v1, p0, Lo5/g;->h:I

    .line 4
    .line 5
    if-ge v0, v1, :cond_0

    .line 6
    .line 7
    add-int/lit8 v0, v0, 0x1

    .line 8
    .line 9
    iput v0, p0, Lo5/g;->i:I

    .line 10
    .line 11
    iget v0, p0, Lo5/g;->j:I

    .line 12
    .line 13
    iget-object v1, p0, Lo5/g;->g:La5/a;

    .line 14
    .line 15
    packed-switch v0, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object v0, p0, Lo5/g;->k:Ljava/lang/Iterable;

    .line 19
    .line 20
    check-cast v0, Lk5/a;

    .line 21
    .line 22
    iget v2, v0, Lk5/a;->j:I

    .line 23
    .line 24
    packed-switch v2, :pswitch_data_1

    .line 25
    .line 26
    .line 27
    new-instance v2, Lk5/c;

    .line 28
    .line 29
    iget-object v0, v0, Lk5/a;->k:Ljava/lang/Comparable;

    .line 30
    .line 31
    check-cast v0, Lp5/a;

    .line 32
    .line 33
    iget-object v0, v0, Lp5/a;->g:Lk5/u;

    .line 34
    .line 35
    invoke-direct {v2, v0, v1}, Lk5/c;-><init>(Lk5/u;La5/a;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :pswitch_0
    new-instance v2, Lk5/c;

    .line 40
    .line 41
    iget-object v0, v0, Lk5/a;->k:Ljava/lang/Comparable;

    .line 42
    .line 43
    check-cast v0, Lk5/b;

    .line 44
    .line 45
    iget-object v0, v0, Lk5/b;->g:Lk5/u;

    .line 46
    .line 47
    invoke-direct {v2, v0, v1}, Lk5/c;-><init>(Lk5/u;La5/a;)V

    .line 48
    .line 49
    .line 50
    goto :goto_0

    .line 51
    :pswitch_1
    iget-object v0, p0, Lo5/g;->k:Ljava/lang/Iterable;

    .line 52
    .line 53
    check-cast v0, Lo5/h;

    .line 54
    .line 55
    iget-object v0, v0, Lo5/h;->g:Lk5/u;

    .line 56
    .line 57
    iget-object v0, v0, Lk5/u;->r:Lk5/s;

    .line 58
    .line 59
    const/4 v2, 0x0

    .line 60
    invoke-virtual {v1, v2}, La5/a;->o(Z)I

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    add-int/lit8 v1, v1, -0x1

    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lk5/s;->d(I)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    :goto_0
    return-object v2

    .line 71
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 72
    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    return-object v0

    .line 76
    nop

    .line 77
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
    .end packed-switch

    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    :pswitch_data_1
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public final remove()V
    .locals 1

    .line 1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    .line 4
    .line 5
    .line 6
    throw v0
.end method
