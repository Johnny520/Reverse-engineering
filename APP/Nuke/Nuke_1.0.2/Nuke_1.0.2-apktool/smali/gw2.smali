.class public final Lgw2;
.super Lw51;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lmn0;


# instance fields
.field public final synthetic i:I

.field public final synthetic j:Lhw2;


# direct methods
.method public synthetic constructor <init>(Lhw2;I)V
    .locals 0

    .line 1
    iput p2, p0, Lgw2;->i:I

    .line 2
    .line 3
    iput-object p1, p0, Lgw2;->j:Lhw2;

    .line 4
    .line 5
    const/4 p1, 0x2

    .line 6
    invoke-direct {p0, p1}, Lw51;-><init>(I)V

    .line 7
    .line 8
    .line 9
    return-void
.end method


# virtual methods
.method public final g(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lgw2;->i:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object p0, p0, Lgw2;->j:Lhw2;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    check-cast p1, Lr61;

    .line 11
    .line 12
    check-cast p2, Lhw2;

    .line 13
    .line 14
    iget-object p2, p0, Lhw2;->a:Lsz0;

    .line 15
    .line 16
    iget-object v0, p1, Lr61;->O:Lf71;

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v0, Lf71;

    .line 21
    .line 22
    invoke-direct {v0, p1, p2}, Lf71;-><init>(Lr61;Lsz0;)V

    .line 23
    .line 24
    .line 25
    iput-object v0, p1, Lr61;->O:Lf71;

    .line 26
    .line 27
    :cond_0
    iput-object v0, p0, Lhw2;->b:Lf71;

    .line 28
    .line 29
    invoke-virtual {p0}, Lhw2;->a()Lf71;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {p1}, Lf71;->h()V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lhw2;->a()Lf71;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    iget-object p1, p0, Lf71;->j:Lsz0;

    .line 41
    .line 42
    if-eq p1, p2, :cond_1

    .line 43
    .line 44
    iput-object p2, p0, Lf71;->j:Lsz0;

    .line 45
    .line 46
    const/4 p1, 0x0

    .line 47
    invoke-virtual {p0, p1}, Lf71;->i(Z)V

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lf71;->h:Lr61;

    .line 51
    .line 52
    const/4 p2, 0x7

    .line 53
    invoke-static {p0, p1, p2}, Lr61;->V(Lr61;ZI)V

    .line 54
    .line 55
    .line 56
    :cond_1
    return-object v1

    .line 57
    :pswitch_0
    check-cast p1, Lr61;

    .line 58
    .line 59
    check-cast p2, Lmn0;

    .line 60
    .line 61
    invoke-virtual {p0}, Lhw2;->a()Lf71;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget-object v0, p0, Lf71;->w:Ljava/lang/String;

    .line 66
    .line 67
    new-instance v2, Lb71;

    .line 68
    .line 69
    invoke-direct {v2, p0, p2, v0}, Lb71;-><init>(Lf71;Lmn0;Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1, v2}, Lr61;->c0(Lnf1;)V

    .line 73
    .line 74
    .line 75
    return-object v1

    .line 76
    :pswitch_1
    check-cast p1, Lr61;

    .line 77
    .line 78
    check-cast p2, Lyx;

    .line 79
    .line 80
    invoke-virtual {p0}, Lhw2;->a()Lf71;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    iput-object p2, p0, Lf71;->i:Lyx;

    .line 85
    .line 86
    return-object v1

    .line 87
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
