.class public final synthetic Lds;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:I

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lfs;Lzm0;Lu11;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lds;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lds;->η:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lds;->θ:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Lds;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lds;->ζ:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>([Lch1;Lgp1;I[I)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lds;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lds;->η:Ljava/lang/Object;

    iput-object p2, p0, Lds;->θ:Ljava/lang/Object;

    iput p3, p0, Lds;->ζ:I

    iput-object p4, p0, Lds;->ι:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    iget v0, p0, Lds;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lds;->η:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, [Lch1;

    .line 9
    .line 10
    iget-object v1, p0, Lds;->θ:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lgp1;

    .line 13
    .line 14
    iget-object v2, p0, Lds;->ι:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, [I

    .line 17
    .line 18
    check-cast p1, Lbh1;

    .line 19
    .line 20
    array-length v3, v0

    .line 21
    const/4 v4, 0x0

    .line 22
    move v5, v4

    .line 23
    :goto_0
    if-ge v4, v3, :cond_0

    .line 24
    .line 25
    aget-object v6, v0, v4

    .line 26
    .line 27
    add-int/lit8 v7, v5, 0x1

    .line 28
    .line 29
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v6}, Lch1;->λ()Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    iget-object v8, v1, Lgp1;->α:Lz9;

    .line 36
    .line 37
    iget v9, v6, Lch1;->ζ:I

    .line 38
    .line 39
    iget v10, p0, Lds;->ζ:I

    .line 40
    .line 41
    sub-int/2addr v10, v9

    .line 42
    int-to-float v9, v10

    .line 43
    const/high16 v10, 0x40000000    # 2.0f

    .line 44
    .line 45
    div-float/2addr v9, v10

    .line 46
    const/4 v10, 0x1

    .line 47
    int-to-float v10, v10

    .line 48
    iget v8, v8, Lz9;->α:F

    .line 49
    .line 50
    add-float/2addr v10, v8

    .line 51
    mul-float/2addr v10, v9

    .line 52
    invoke-static {v10}, Ljava/lang/Math;->round(F)I

    .line 53
    .line 54
    .line 55
    move-result v8

    .line 56
    aget v5, v2, v5

    .line 57
    .line 58
    invoke-static {p1, v6, v5, v8}, Lbh1;->λ(Lbh1;Lch1;II)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v4, v4, 0x1

    .line 62
    .line 63
    move v5, v7

    .line 64
    goto :goto_0

    .line 65
    :cond_0
    sget-object p0, Ls62;->α:Ls62;

    .line 66
    .line 67
    return-object p0

    .line 68
    :pswitch_0
    iget-object v0, p0, Lds;->η:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v0, Lfs;

    .line 71
    .line 72
    iget-object v1, p0, Lds;->θ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v1, Lzm0;

    .line 75
    .line 76
    iget-object v2, p0, Lds;->ι:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v2, Lu11;

    .line 79
    .line 80
    if-eq p1, v0, :cond_3

    .line 81
    .line 82
    instance-of v0, p1, Li02;

    .line 83
    .line 84
    if-eqz v0, :cond_2

    .line 85
    .line 86
    iget v0, v1, Lzm0;->α:I

    .line 87
    .line 88
    iget p0, p0, Lds;->ζ:I

    .line 89
    .line 90
    sub-int/2addr v0, p0

    .line 91
    invoke-virtual {v2, p1}, Lu11;->γ(Ljava/lang/Object;)I

    .line 92
    .line 93
    .line 94
    move-result p0

    .line 95
    if-ltz p0, :cond_1

    .line 96
    .line 97
    iget-object v1, v2, Lu11;->γ:[I

    .line 98
    .line 99
    aget p0, v1, p0

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    const p0, 0x7fffffff

    .line 103
    .line 104
    .line 105
    :goto_1
    invoke-static {v0, p0}, Ljava/lang/Math;->min(II)I

    .line 106
    .line 107
    .line 108
    move-result p0

    .line 109
    invoke-virtual {v2, p0, p1}, Lu11;->ζ(ILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    :cond_2
    sget-object p0, Ls62;->α:Ls62;

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_3
    const-string p0, "A derived state calculation cannot read itself"

    .line 116
    .line 117
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const/4 p0, 0x0

    .line 121
    :goto_2
    return-object p0

    .line 122
    nop

    .line 123
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
