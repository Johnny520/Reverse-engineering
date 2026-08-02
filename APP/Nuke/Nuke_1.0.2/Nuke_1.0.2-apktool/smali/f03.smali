.class public final synthetic Lf03;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Le70;

.field public final synthetic j:Lxk1;


# direct methods
.method public synthetic constructor <init>(Le70;Lxk1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lf03;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Lf03;->i:Le70;

    .line 4
    .line 5
    iput-object p2, p0, Lf03;->j:Lxk1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final j(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lf03;->h:I

    .line 2
    .line 3
    iget-object v1, p0, Lf03;->j:Lxk1;

    .line 4
    .line 5
    iget-object p0, p0, Lf03;->i:Le70;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lcb0;

    .line 11
    .line 12
    iget-wide v2, p1, Lcb0;->a:J

    .line 13
    .line 14
    const/16 v0, 0x20

    .line 15
    .line 16
    shr-long/2addr v2, v0

    .line 17
    long-to-int v2, v2

    .line 18
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    invoke-interface {p0, v2}, Le70;->T(F)I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    iget-wide v3, p1, Lcb0;->a:J

    .line 27
    .line 28
    const-wide v5, 0xffffffffL

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    and-long/2addr v3, v5

    .line 34
    long-to-int p1, v3

    .line 35
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    invoke-interface {p0, p1}, Le70;->T(F)I

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    int-to-long v2, v2

    .line 44
    shl-long/2addr v2, v0

    .line 45
    int-to-long p0, p0

    .line 46
    and-long/2addr p0, v5

    .line 47
    or-long/2addr p0, v2

    .line 48
    new-instance v0, Lh11;

    .line 49
    .line 50
    invoke-direct {v0, p0, p1}, Lh11;-><init>(J)V

    .line 51
    .line 52
    .line 53
    invoke-interface {v1, v0}, Lxk1;->setValue(Ljava/lang/Object;)V

    .line 54
    .line 55
    .line 56
    sget-object p0, La83;->a:La83;

    .line 57
    .line 58
    return-object p0

    .line 59
    :pswitch_0
    check-cast p1, Lxm0;

    .line 60
    .line 61
    new-instance v0, Lgp1;

    .line 62
    .line 63
    const/4 v2, 0x2

    .line 64
    invoke-direct {v0, p1, v2}, Lgp1;-><init>(Lxm0;I)V

    .line 65
    .line 66
    .line 67
    new-instance p1, Lf03;

    .line 68
    .line 69
    const/4 v2, 0x1

    .line 70
    invoke-direct {p1, p0, v1, v2}, Lf03;-><init>(Le70;Lxk1;I)V

    .line 71
    .line 72
    .line 73
    invoke-static {}, Lhe1;->a()Z

    .line 74
    .line 75
    .line 76
    move-result p0

    .line 77
    if-eqz p0, :cond_2

    .line 78
    .line 79
    sget p0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 80
    .line 81
    const/16 v1, 0x1c

    .line 82
    .line 83
    if-ne p0, v1, :cond_0

    .line 84
    .line 85
    sget-object p0, Lh02;->b:Lh02;

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_0
    sget-object p0, Lh02;->c:Lh02;

    .line 89
    .line 90
    :goto_0
    invoke-static {}, Lhe1;->a()Z

    .line 91
    .line 92
    .line 93
    move-result v1

    .line 94
    if-eqz v1, :cond_1

    .line 95
    .line 96
    new-instance v1, Lee1;

    .line 97
    .line 98
    invoke-direct {v1, v0, p1, p0}, Lee1;-><init>(Lgp1;Lf03;Lf02;)V

    .line 99
    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_1
    sget-object v1, Lrh1;->a:Lrh1;

    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_2
    const-string p0, "Magnifier is only supported on API level 28 and higher."

    .line 106
    .line 107
    invoke-static {p0}, Lc80;->t(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    const/4 v1, 0x0

    .line 111
    :goto_1
    return-object v1

    .line 112
    nop

    .line 113
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
