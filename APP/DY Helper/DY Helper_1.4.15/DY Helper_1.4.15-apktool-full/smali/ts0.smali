.class public final synthetic Lts0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lc02;


# direct methods
.method public synthetic constructor <init>(Lc02;I)V
    .locals 0

    .line 1
    iput p2, p0, Lts0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lts0;->ζ:Lc02;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    iget v0, p0, Lts0;->ε:I

    .line 2
    .line 3
    check-cast p1, Lza0;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lts0;->ζ:Lc02;

    .line 12
    .line 13
    invoke-interface {p0}, Lc02;->getValue()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    check-cast v0, Ljava/lang/Number;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    invoke-interface {p1, v0}, Lza0;->Δ(F)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p0}, Lc02;->getValue()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    check-cast p0, Ljava/lang/Number;

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    invoke-interface {p1, p0}, Lza0;->Τ(F)V

    .line 37
    .line 38
    .line 39
    :goto_0
    sget-object p0, Ls62;->α:Ls62;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Lza0;->α()J

    .line 46
    .line 47
    .line 48
    move-result-wide v0

    .line 49
    const/16 v2, 0x20

    .line 50
    .line 51
    shr-long/2addr v0, v2

    .line 52
    long-to-int v0, v0

    .line 53
    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    const/high16 v1, 0x3f800000    # 1.0f

    .line 58
    .line 59
    cmpg-float v2, v0, v1

    .line 60
    .line 61
    if-gez v2, :cond_0

    .line 62
    .line 63
    move v0, v1

    .line 64
    :cond_0
    const/16 v2, 0x10

    .line 65
    .line 66
    int-to-float v2, v2

    .line 67
    invoke-interface {p1}, Lyr;->β()F

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    mul-float/2addr v3, v2

    .line 72
    div-float/2addr v3, v0

    .line 73
    add-float/2addr v3, v1

    .line 74
    iget-object p0, p0, Lts0;->ζ:Lc02;

    .line 75
    .line 76
    invoke-interface {p0}, Lc02;->getValue()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    check-cast p0, Ljava/lang/Number;

    .line 81
    .line 82
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 83
    .line 84
    .line 85
    move-result p0

    .line 86
    const/4 v0, 0x1

    .line 87
    int-to-float v0, v0

    .line 88
    sub-float/2addr v0, p0

    .line 89
    mul-float/2addr v0, v1

    .line 90
    mul-float/2addr p0, v3

    .line 91
    add-float/2addr p0, v0

    .line 92
    invoke-interface {p1, p0}, Lza0;->Δ(F)V

    .line 93
    .line 94
    .line 95
    invoke-interface {p1, p0}, Lza0;->Τ(F)V

    .line 96
    .line 97
    .line 98
    goto :goto_0

    .line 99
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    iget-object p0, p0, Lts0;->ζ:Lc02;

    .line 103
    .line 104
    invoke-interface {p0}, Lc02;->getValue()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    check-cast v0, Ljava/lang/Number;

    .line 109
    .line 110
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    invoke-interface {p1, v0}, Lza0;->Δ(F)V

    .line 115
    .line 116
    .line 117
    invoke-interface {p0}, Lc02;->getValue()Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p0

    .line 121
    check-cast p0, Ljava/lang/Number;

    .line 122
    .line 123
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    invoke-interface {p1, p0}, Lza0;->Τ(F)V

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
