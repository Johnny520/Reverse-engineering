.class public final synthetic Lzb1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:J

.field public final synthetic η:La80;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(JLa80;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p5, p0, Lzb1;->ε:I

    .line 2
    .line 3
    iput-wide p1, p0, Lzb1;->ζ:J

    .line 4
    .line 5
    iput-object p3, p0, Lzb1;->η:La80;

    .line 6
    .line 7
    iput-object p4, p0, Lzb1;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 1
    iget v0, p0, Lzb1;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-wide v0, p0, Lzb1;->ζ:J

    .line 7
    .line 8
    iget-object v2, p0, Lzb1;->η:La80;

    .line 9
    .line 10
    check-cast v2, Lmb1;

    .line 11
    .line 12
    iget-object p0, p0, Lzb1;->θ:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast p0, Lgc1;

    .line 15
    .line 16
    sget-object v3, Ljc1;->γ:La;

    .line 17
    .line 18
    iget-object v3, v3, La;->β:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast v3, Lｚ;

    .line 21
    .line 22
    iget-wide v4, v3, Lｚ;->α:J

    .line 23
    .line 24
    cmp-long v0, v4, v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    iget-boolean v0, v3, Lｚ;->β:Z

    .line 29
    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {v2, p0}, Lmb1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    return-void

    .line 36
    :pswitch_0
    iget-wide v0, p0, Lzb1;->ζ:J

    .line 37
    .line 38
    iget-object v2, p0, Lzb1;->η:La80;

    .line 39
    .line 40
    check-cast v2, Lmb1;

    .line 41
    .line 42
    iget-object p0, p0, Lzb1;->θ:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Ldc1;

    .line 45
    .line 46
    sget-object v3, Ljc1;->γ:La;

    .line 47
    .line 48
    iget-object v3, v3, La;->β:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v3, Lｚ;

    .line 51
    .line 52
    iget-wide v4, v3, Lｚ;->α:J

    .line 53
    .line 54
    cmp-long v0, v4, v0

    .line 55
    .line 56
    if-nez v0, :cond_1

    .line 57
    .line 58
    iget-boolean v0, v3, Lｚ;->β:Z

    .line 59
    .line 60
    if-nez v0, :cond_1

    .line 61
    .line 62
    invoke-virtual {v2, p0}, Lmb1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    :cond_1
    return-void

    .line 66
    :pswitch_1
    iget-wide v0, p0, Lzb1;->ζ:J

    .line 67
    .line 68
    iget-object v2, p0, Lzb1;->η:La80;

    .line 69
    .line 70
    check-cast v2, Lmb1;

    .line 71
    .line 72
    iget-object p0, p0, Lzb1;->θ:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p0, Ldc1;

    .line 75
    .line 76
    sget-object v3, Ljc1;->γ:La;

    .line 77
    .line 78
    iget-object v3, v3, La;->β:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v3, Lｚ;

    .line 81
    .line 82
    iget-wide v4, v3, Lｚ;->α:J

    .line 83
    .line 84
    cmp-long v0, v4, v0

    .line 85
    .line 86
    if-nez v0, :cond_2

    .line 87
    .line 88
    iget-boolean v0, v3, Lｚ;->β:Z

    .line 89
    .line 90
    if-nez v0, :cond_2

    .line 91
    .line 92
    invoke-virtual {v2, p0}, Lmb1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    :cond_2
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
