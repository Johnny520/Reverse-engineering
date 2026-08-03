.class public final synthetic Lq2/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/r;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lq2/c;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lq2/c;->h:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget v0, p0, Lq2/c;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lq2/c;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lfg/q;

    .line 9
    .line 10
    check-cast p1, Lr/d;

    .line 11
    .line 12
    check-cast p2, Ljava/lang/Integer;

    .line 13
    .line 14
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast p3, Li0/h0;

    .line 18
    .line 19
    check-cast p4, Ljava/lang/Integer;

    .line 20
    .line 21
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 22
    .line 23
    .line 24
    move-result p2

    .line 25
    and-int/lit8 p4, p2, 0x6

    .line 26
    .line 27
    if-nez p4, :cond_1

    .line 28
    .line 29
    invoke-virtual {p3, p1}, Li0/h0;->f(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result p4

    .line 33
    if-eqz p4, :cond_0

    .line 34
    .line 35
    const/4 p4, 0x4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 p4, 0x2

    .line 38
    :goto_0
    or-int/2addr p2, p4

    .line 39
    :cond_1
    and-int/lit16 p4, p2, 0x83

    .line 40
    .line 41
    const/16 v1, 0x82

    .line 42
    .line 43
    if-eq p4, v1, :cond_2

    .line 44
    .line 45
    const/4 p4, 0x1

    .line 46
    goto :goto_1

    .line 47
    :cond_2
    const/4 p4, 0x0

    .line 48
    :goto_1
    and-int/lit8 v1, p2, 0x1

    .line 49
    .line 50
    invoke-virtual {p3, v1, p4}, Li0/h0;->S(IZ)Z

    .line 51
    .line 52
    .line 53
    move-result p4

    .line 54
    if-eqz p4, :cond_3

    .line 55
    .line 56
    and-int/lit8 p2, p2, 0xe

    .line 57
    .line 58
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object p2

    .line 62
    invoke-interface {v0, p1, p3, p2}, Lfg/q;->b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    invoke-virtual {p3}, Li0/h0;->V()V

    .line 67
    .line 68
    .line 69
    :goto_2
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 70
    .line 71
    return-object p1

    .line 72
    :pswitch_0
    iget-object v0, p0, Lq2/c;->h:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast v0, Lq2/d;

    .line 75
    .line 76
    check-cast p1, Lm2/p;

    .line 77
    .line 78
    check-cast p2, Lm2/k;

    .line 79
    .line 80
    check-cast p3, Lm2/i;

    .line 81
    .line 82
    check-cast p4, Lm2/j;

    .line 83
    .line 84
    iget-object v1, v0, Lq2/d;->e:Lm2/d;

    .line 85
    .line 86
    iget p3, p3, Lm2/i;->a:I

    .line 87
    .line 88
    iget p4, p4, Lm2/j;->a:I

    .line 89
    .line 90
    check-cast v1, Lm2/e;

    .line 91
    .line 92
    invoke-virtual {v1, p1, p2, p3, p4}, Lm2/e;->b(Lm2/p;Lm2/k;II)Lm2/r;

    .line 93
    .line 94
    .line 95
    move-result-object p1

    .line 96
    instance-of p2, p1, Lm2/r;

    .line 97
    .line 98
    if-nez p2, :cond_4

    .line 99
    .line 100
    new-instance p2, Lb5/c;

    .line 101
    .line 102
    iget-object p3, v0, Lq2/d;->j:Lb5/c;

    .line 103
    .line 104
    invoke-direct {p2, p1, p3}, Lb5/c;-><init>(Lm2/r;Lb5/c;)V

    .line 105
    .line 106
    .line 107
    iput-object p2, v0, Lq2/d;->j:Lb5/c;

    .line 108
    .line 109
    iget-object p1, p2, Lb5/c;->c:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    check-cast p1, Landroid/graphics/Typeface;

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_4
    iget-object p1, p1, Lm2/r;->g:Ljava/lang/Object;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 120
    .line 121
    .line 122
    check-cast p1, Landroid/graphics/Typeface;

    .line 123
    .line 124
    :goto_3
    return-object p1

    .line 125
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
