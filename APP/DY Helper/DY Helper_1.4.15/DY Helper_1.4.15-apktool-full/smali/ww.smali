.class public final synthetic Lww;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:F


# direct methods
.method public synthetic constructor <init>(IF)V
    .locals 0

    .line 1
    iput p1, p0, Lww;->ε:I

    .line 2
    .line 3
    iput p2, p0, Lww;->ζ:F

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
    .locals 3

    .line 1
    iget v0, p0, Lww;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lyv;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    sget-object p1, Lpt0;->α:Lie0;

    .line 12
    .line 13
    iget v0, p1, Lie0;->α:F

    .line 14
    .line 15
    iget-object p1, p1, Lie0;->γ:Lla;

    .line 16
    .line 17
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    new-instance v1, Lie0;

    .line 21
    .line 22
    iget p0, p0, Lww;->ζ:F

    .line 23
    .line 24
    invoke-direct {v1, v0, p0, p1}, Lie0;-><init>(FFLla;)V

    .line 25
    .line 26
    .line 27
    return-object v1

    .line 28
    :pswitch_0
    check-cast p1, Lyv;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/16 v0, 0xa

    .line 34
    .line 35
    int-to-float v0, v0

    .line 36
    invoke-virtual {p1}, Lyv;->β()F

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    mul-float/2addr v1, v0

    .line 41
    iget p0, p0, Lww;->ζ:F

    .line 42
    .line 43
    mul-float/2addr v1, p0

    .line 44
    const/16 v0, 0xe

    .line 45
    .line 46
    int-to-float v0, v0

    .line 47
    invoke-virtual {p1}, Lyv;->β()F

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    mul-float/2addr v2, v0

    .line 52
    mul-float/2addr v2, p0

    .line 53
    const/4 p0, 0x1

    .line 54
    const/high16 v0, 0x3f000000    # 0.5f

    .line 55
    .line 56
    invoke-static {p1, v1, v2, p0, v0}, Lpd2;->ε(Lyv;FFZF)V

    .line 57
    .line 58
    .line 59
    sget-object p0, Ls62;->α:Ls62;

    .line 60
    .line 61
    return-object p0

    .line 62
    :pswitch_1
    check-cast p1, Lza0;

    .line 63
    .line 64
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const/4 v0, 0x1

    .line 68
    int-to-float v0, v0

    .line 69
    iget p0, p0, Lww;->ζ:F

    .line 70
    .line 71
    sub-float/2addr v0, p0

    .line 72
    const/high16 v1, 0x3f800000    # 1.0f

    .line 73
    .line 74
    mul-float/2addr v0, v1

    .line 75
    const v1, 0x3fb24925

    .line 76
    .line 77
    .line 78
    mul-float/2addr p0, v1

    .line 79
    add-float/2addr p0, v0

    .line 80
    invoke-interface {p1, p0}, Lza0;->Δ(F)V

    .line 81
    .line 82
    .line 83
    invoke-interface {p1, p0}, Lza0;->Τ(F)V

    .line 84
    .line 85
    .line 86
    sget-object p0, Ls62;->α:Ls62;

    .line 87
    .line 88
    return-object p0

    .line 89
    :pswitch_2
    check-cast p1, Ljava/lang/Integer;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    int-to-float p1, p1

    .line 96
    iget p0, p0, Lww;->ζ:F

    .line 97
    .line 98
    mul-float/2addr p1, p0

    .line 99
    float-to-int p0, p1

    .line 100
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    return-object p0

    .line 105
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
