.class public final synthetic Lsh/v0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:F

.field public final synthetic i:Llg/a;

.field public final synthetic j:I

.field public final synthetic k:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(FLlg/a;ILi0/a1;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lsh/v0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput p1, p0, Lsh/v0;->h:F

    .line 8
    .line 9
    iput-object p2, p0, Lsh/v0;->i:Llg/a;

    .line 10
    .line 11
    iput p3, p0, Lsh/v0;->j:I

    .line 12
    .line 13
    iput-object p4, p0, Lsh/v0;->k:Ljava/lang/Object;

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Llg/a;I[FF)V
    .locals 1

    .line 16
    const/4 v0, 0x0

    iput v0, p0, Lsh/v0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/v0;->i:Llg/a;

    iput p2, p0, Lsh/v0;->j:I

    iput-object p3, p0, Lsh/v0;->k:Ljava/lang/Object;

    iput p4, p0, Lsh/v0;->h:F

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lsh/v0;->g:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    iget-object v3, p0, Lsh/v0;->k:Ljava/lang/Object;

    .line 6
    .line 7
    iget v4, p0, Lsh/v0;->j:I

    .line 8
    .line 9
    iget-object v5, p0, Lsh/v0;->i:Llg/a;

    .line 10
    .line 11
    iget v6, p0, Lsh/v0;->h:F

    .line 12
    .line 13
    packed-switch v0, :pswitch_data_0

    .line 14
    .line 15
    .line 16
    check-cast v3, Li0/a1;

    .line 17
    .line 18
    check-cast p1, Lf2/y;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    new-instance v0, Lf2/h;

    .line 24
    .line 25
    iget v7, v5, Llg/a;->a:F

    .line 26
    .line 27
    iget v8, v5, Llg/a;->b:F

    .line 28
    .line 29
    new-instance v9, Llg/a;

    .line 30
    .line 31
    invoke-direct {v9, v7, v8}, Llg/a;-><init>(FF)V

    .line 32
    .line 33
    .line 34
    if-lez v4, :cond_0

    .line 35
    .line 36
    move v2, v4

    .line 37
    :cond_0
    invoke-direct {v0, v6, v9, v2}, Lf2/h;-><init>(FLlg/a;I)V

    .line 38
    .line 39
    .line 40
    sget-object v2, Lf2/w;->a:[Lmg/d;

    .line 41
    .line 42
    sget-object v2, Lf2/u;->c:Lf2/x;

    .line 43
    .line 44
    sget-object v4, Lf2/w;->a:[Lmg/d;

    .line 45
    .line 46
    aget-object v1, v4, v1

    .line 47
    .line 48
    invoke-interface {p1, v2, v0}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    new-instance v0, Lm/b;

    .line 52
    .line 53
    const/16 v1, 0x10

    .line 54
    .line 55
    invoke-direct {v0, v5, v1, v3}, Lm/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lf2/l;->i:Lf2/x;

    .line 59
    .line 60
    new-instance v2, Lf2/a;

    .line 61
    .line 62
    const/4 v3, 0x0

    .line 63
    invoke-direct {v2, v3, v0}, Lf2/a;-><init>(Ljava/lang/String;Lsf/b;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {p1, v1, v2}, Lf2/y;->a(Lf2/x;Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    check-cast v3, [F

    .line 73
    .line 74
    check-cast p1, Ljava/lang/Float;

    .line 75
    .line 76
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    const/4 v0, 0x0

    .line 81
    const/high16 v7, 0x3f800000    # 1.0f

    .line 82
    .line 83
    invoke-static {p1, v0, v7}, Lr9/e0;->q(FFF)F

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    iget v0, v5, Llg/a;->a:F

    .line 88
    .line 89
    iget v5, v5, Llg/a;->b:F

    .line 90
    .line 91
    invoke-static {v0, v5, p1}, Lfb/v0;->C(FFF)F

    .line 92
    .line 93
    .line 94
    move-result v7

    .line 95
    if-lez v4, :cond_1

    .line 96
    .line 97
    add-int/2addr v4, v1

    .line 98
    float-to-double v0, v0

    .line 99
    float-to-double v5, v5

    .line 100
    int-to-float v3, v4

    .line 101
    mul-float/2addr p1, v3

    .line 102
    invoke-static {p1}, Lig/a;->X(F)I

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    invoke-static {p1, v2, v4}, Lr9/e0;->r(III)I

    .line 107
    .line 108
    .line 109
    move-result p1

    .line 110
    sub-double/2addr v5, v0

    .line 111
    int-to-double v2, p1

    .line 112
    mul-double/2addr v5, v2

    .line 113
    int-to-double v2, v4

    .line 114
    div-double/2addr v5, v2

    .line 115
    add-double/2addr v5, v0

    .line 116
    double-to-float v7, v5

    .line 117
    goto :goto_1

    .line 118
    :cond_1
    array-length v4, v3

    .line 119
    if-nez v4, :cond_2

    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_2
    aget v2, v3, v2

    .line 123
    .line 124
    sub-float v4, v2, p1

    .line 125
    .line 126
    invoke-static {v4}, Ljava/lang/Math;->abs(F)F

    .line 127
    .line 128
    .line 129
    move-result v4

    .line 130
    array-length v8, v3

    .line 131
    :goto_0
    if-ge v1, v8, :cond_4

    .line 132
    .line 133
    aget v9, v3, v1

    .line 134
    .line 135
    sub-float v10, v9, p1

    .line 136
    .line 137
    invoke-static {v10}, Ljava/lang/Math;->abs(F)F

    .line 138
    .line 139
    .line 140
    move-result v10

    .line 141
    cmpg-float v11, v10, v4

    .line 142
    .line 143
    if-gez v11, :cond_3

    .line 144
    .line 145
    move v2, v9

    .line 146
    move v4, v10

    .line 147
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 148
    .line 149
    goto :goto_0

    .line 150
    :cond_4
    cmpg-float p1, v4, v6

    .line 151
    .line 152
    if-gez p1, :cond_5

    .line 153
    .line 154
    invoke-static {v0, v5, v2}, Lfb/v0;->C(FFF)F

    .line 155
    .line 156
    .line 157
    move-result v7

    .line 158
    :cond_5
    :goto_1
    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 159
    .line 160
    .line 161
    move-result-object p1

    .line 162
    return-object p1

    .line 163
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
