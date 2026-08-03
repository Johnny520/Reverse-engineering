.class public final Luf/e;
.super Lm3/c;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Iterator;
.implements Lhg/a;


# instance fields
.field public final synthetic k:I


# direct methods
.method public constructor <init>(Luf/g;I)V
    .locals 0

    .line 1
    iput p2, p0, Luf/e;->k:I

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lm3/c;->j:Ljava/lang/Object;

    .line 10
    .line 11
    const/4 p2, -0x1

    .line 12
    iput p2, p0, Lm3/c;->h:I

    .line 13
    .line 14
    iget p1, p1, Luf/g;->n:I

    .line 15
    .line 16
    iput p1, p0, Lm3/c;->i:I

    .line 17
    .line 18
    invoke-virtual {p0}, Lm3/c;->d()V

    .line 19
    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public final next()Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Luf/e;->k:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lm3/c;->c()V

    .line 7
    .line 8
    .line 9
    iget v0, p0, Lm3/c;->g:I

    .line 10
    .line 11
    iget-object v1, p0, Lm3/c;->j:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Luf/g;

    .line 14
    .line 15
    iget v2, v1, Luf/g;->l:I

    .line 16
    .line 17
    if-ge v0, v2, :cond_0

    .line 18
    .line 19
    add-int/lit8 v2, v0, 0x1

    .line 20
    .line 21
    iput v2, p0, Lm3/c;->g:I

    .line 22
    .line 23
    iput v0, p0, Lm3/c;->h:I

    .line 24
    .line 25
    iget-object v0, v1, Luf/g;->h:[Ljava/lang/Object;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    iget v1, p0, Lm3/c;->h:I

    .line 31
    .line 32
    aget-object v0, v0, v1

    .line 33
    .line 34
    invoke-virtual {p0}, Lm3/c;->d()V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_0
    invoke-static {}, Lbsh/j;->e()V

    .line 39
    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    :goto_0
    return-object v0

    .line 43
    :pswitch_0
    invoke-virtual {p0}, Lm3/c;->c()V

    .line 44
    .line 45
    .line 46
    iget v0, p0, Lm3/c;->g:I

    .line 47
    .line 48
    iget-object v1, p0, Lm3/c;->j:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Luf/g;

    .line 51
    .line 52
    iget v2, v1, Luf/g;->l:I

    .line 53
    .line 54
    if-ge v0, v2, :cond_1

    .line 55
    .line 56
    add-int/lit8 v2, v0, 0x1

    .line 57
    .line 58
    iput v2, p0, Lm3/c;->g:I

    .line 59
    .line 60
    iput v0, p0, Lm3/c;->h:I

    .line 61
    .line 62
    iget-object v1, v1, Luf/g;->g:[Ljava/lang/Object;

    .line 63
    .line 64
    aget-object v0, v1, v0

    .line 65
    .line 66
    invoke-virtual {p0}, Lm3/c;->d()V

    .line 67
    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_1
    invoke-static {}, Lbsh/j;->e()V

    .line 71
    .line 72
    .line 73
    const/4 v0, 0x0

    .line 74
    :goto_1
    return-object v0

    .line 75
    :pswitch_1
    invoke-virtual {p0}, Lm3/c;->c()V

    .line 76
    .line 77
    .line 78
    iget v0, p0, Lm3/c;->g:I

    .line 79
    .line 80
    iget-object v1, p0, Lm3/c;->j:Ljava/lang/Object;

    .line 81
    .line 82
    check-cast v1, Luf/g;

    .line 83
    .line 84
    iget v2, v1, Luf/g;->l:I

    .line 85
    .line 86
    if-ge v0, v2, :cond_2

    .line 87
    .line 88
    add-int/lit8 v2, v0, 0x1

    .line 89
    .line 90
    iput v2, p0, Lm3/c;->g:I

    .line 91
    .line 92
    iput v0, p0, Lm3/c;->h:I

    .line 93
    .line 94
    new-instance v2, Luf/f;

    .line 95
    .line 96
    invoke-direct {v2, v1, v0}, Luf/f;-><init>(Luf/g;I)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0}, Lm3/c;->d()V

    .line 100
    .line 101
    .line 102
    goto :goto_2

    .line 103
    :cond_2
    invoke-static {}, Lbsh/j;->e()V

    .line 104
    .line 105
    .line 106
    const/4 v2, 0x0

    .line 107
    :goto_2
    return-object v2

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
