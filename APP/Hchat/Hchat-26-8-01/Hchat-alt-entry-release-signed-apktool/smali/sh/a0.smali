.class public final synthetic Lsh/a0;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:Ljava/lang/Object;

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLi0/f1;Li/c;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lsh/a0;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-wide p1, p0, Lsh/a0;->h:J

    .line 8
    .line 9
    iput-object p3, p0, Lsh/a0;->i:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p4, p0, Lsh/a0;->j:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lfg/a;Lfg/a;J)V
    .locals 1

    .line 14
    const/4 v0, 0x0

    iput v0, p0, Lsh/a0;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lsh/a0;->i:Ljava/lang/Object;

    iput-object p2, p0, Lsh/a0;->j:Ljava/lang/Object;

    iput-wide p3, p0, Lsh/a0;->h:J

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    iget v0, p0, Lsh/a0;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lsh/a0;->i:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Li0/f1;

    .line 9
    .line 10
    iget-object v1, p0, Lsh/a0;->j:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Li/c;

    .line 13
    .line 14
    move-object v2, p1

    .line 15
    check-cast v2, Lh1/d;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    iget-wide v3, p0, Lsh/a0;->h:J

    .line 21
    .line 22
    invoke-static {v3, v4}, Lf1/w;->d(J)F

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    invoke-virtual {v0}, Li0/f1;->g()F

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    mul-float/2addr v0, p1

    .line 31
    invoke-virtual {v1}, Li/c;->d()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    mul-float/2addr p1, v0

    .line 42
    invoke-static {v3, v4, p1}, Lf1/w;->b(JF)J

    .line 43
    .line 44
    .line 45
    move-result-wide v3

    .line 46
    const/4 v8, 0x0

    .line 47
    const/16 v9, 0x7e

    .line 48
    .line 49
    const-wide/16 v5, 0x0

    .line 50
    .line 51
    const/4 v7, 0x0

    .line 52
    invoke-static/range {v2 .. v9}, Lh1/d;->Z(Lh1/d;JJFII)V

    .line 53
    .line 54
    .line 55
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_0
    iget-object v0, p0, Lsh/a0;->i:Ljava/lang/Object;

    .line 59
    .line 60
    check-cast v0, Lfg/a;

    .line 61
    .line 62
    iget-object v1, p0, Lsh/a0;->j:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v1, Lfg/a;

    .line 65
    .line 66
    check-cast p1, Lf1/d0;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-interface {v0}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/Number;

    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const v2, 0x3f59999a    # 0.85f

    .line 82
    .line 83
    .line 84
    mul-float/2addr v0, v2

    .line 85
    const v2, 0x3e19999a    # 0.15f

    .line 86
    .line 87
    .line 88
    add-float/2addr v0, v2

    .line 89
    invoke-interface {p1, v0}, Lf1/d0;->q(F)V

    .line 90
    .line 91
    .line 92
    invoke-interface {p1, v0}, Lf1/d0;->i(F)V

    .line 93
    .line 94
    .line 95
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    check-cast v0, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 102
    .line 103
    .line 104
    move-result v0

    .line 105
    invoke-interface {p1, v0}, Lf1/d0;->n(F)V

    .line 106
    .line 107
    .line 108
    iget-wide v0, p0, Lsh/a0;->h:J

    .line 109
    .line 110
    invoke-interface {p1, v0, v1}, Lf1/d0;->H0(J)V

    .line 111
    .line 112
    .line 113
    goto :goto_0

    .line 114
    nop

    .line 115
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
