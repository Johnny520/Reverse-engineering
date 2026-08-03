.class public final Lk5/y;
.super Lk5/t;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final synthetic g:I

.field public final synthetic h:I

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;III)V
    .locals 0

    .line 1
    iput p4, p0, Lk5/y;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lk5/y;->j:Ljava/lang/Object;

    .line 4
    .line 5
    iput p2, p0, Lk5/y;->h:I

    .line 6
    .line 7
    iput p3, p0, Lk5/y;->i:I

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/util/AbstractList;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lk5/y;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lk5/y;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lk5/u;

    .line 9
    .line 10
    iget-object v1, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 11
    .line 12
    iget v2, p0, Lk5/y;->h:I

    .line 13
    .line 14
    add-int/lit8 v2, v2, 0x4

    .line 15
    .line 16
    mul-int/lit8 p1, p1, 0x4

    .line 17
    .line 18
    add-int/2addr p1, v2

    .line 19
    invoke-virtual {v1, p1}, Landroidx/lifecycle/x;->N(I)I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    invoke-static {v0, p1}, Lo5/e;->a(Lk5/u;I)Ljava/util/Set;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    return-object p1

    .line 28
    :pswitch_0
    iget-object v0, p0, Lk5/y;->j:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, Ln5/e;

    .line 31
    .line 32
    iget-object v0, v0, Ln5/e;->j:Lk5/u;

    .line 33
    .line 34
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 35
    .line 36
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 37
    .line 38
    mul-int/lit8 p1, p1, 0x2

    .line 39
    .line 40
    iget v2, p0, Lk5/y;->h:I

    .line 41
    .line 42
    add-int/2addr p1, v2

    .line 43
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->P(I)I

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    invoke-virtual {v1, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    :pswitch_1
    iget-object v0, p0, Lk5/y;->j:Ljava/lang/Object;

    .line 53
    .line 54
    check-cast v0, Ln5/d;

    .line 55
    .line 56
    iget-object v0, v0, Ln5/d;->j:Lk5/u;

    .line 57
    .line 58
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 59
    .line 60
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 61
    .line 62
    mul-int/lit8 p1, p1, 0x2

    .line 63
    .line 64
    iget v2, p0, Lk5/y;->h:I

    .line 65
    .line 66
    add-int/2addr p1, v2

    .line 67
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->P(I)I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    invoke-virtual {v1, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :pswitch_2
    iget-object v0, p0, Lk5/y;->j:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, Lk5/z;

    .line 79
    .line 80
    iget-object v0, v0, Lk5/z;->j:Lk5/u;

    .line 81
    .line 82
    iget-object v1, v0, Lk5/u;->s:Lk5/s;

    .line 83
    .line 84
    iget-object v0, v0, Lk5/u;->b:Landroidx/lifecycle/x;

    .line 85
    .line 86
    mul-int/lit8 p1, p1, 0x2

    .line 87
    .line 88
    iget v2, p0, Lk5/y;->h:I

    .line 89
    .line 90
    add-int/2addr p1, v2

    .line 91
    invoke-virtual {v0, p1}, Landroidx/lifecycle/x;->P(I)I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    invoke-virtual {v1, p1}, Lk5/s;->b(I)Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    return-object p1

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final size()I
    .locals 1

    .line 1
    iget v0, p0, Lk5/y;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget v0, p0, Lk5/y;->i:I

    .line 7
    .line 8
    return v0

    .line 9
    :pswitch_0
    iget v0, p0, Lk5/y;->i:I

    .line 10
    .line 11
    return v0

    .line 12
    :pswitch_1
    iget v0, p0, Lk5/y;->i:I

    .line 13
    .line 14
    return v0

    .line 15
    :pswitch_2
    iget v0, p0, Lk5/y;->i:I

    .line 16
    .line 17
    return v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
