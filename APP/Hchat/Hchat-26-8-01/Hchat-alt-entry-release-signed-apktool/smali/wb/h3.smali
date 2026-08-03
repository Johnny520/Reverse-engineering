.class public final synthetic Lwb/h3;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/a;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lxb/i;


# direct methods
.method public synthetic constructor <init>(Lxb/i;I)V
    .locals 0

    .line 1
    iput p2, p0, Lwb/h3;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lwb/h3;->h:Lxb/i;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lwb/h3;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lwb/h3;->h:Lxb/i;

    .line 7
    .line 8
    iget-object v0, v0, Lxb/i;->k:Li/c;

    .line 9
    .line 10
    invoke-virtual {v0}, Li/c;->d()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    check-cast v0, Ljava/lang/Number;

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :pswitch_0
    iget-object v0, p0, Lwb/h3;->h:Lxb/i;

    .line 26
    .line 27
    iget-object v1, v0, Lxb/i;->d:Lhb/w;

    .line 28
    .line 29
    invoke-virtual {v1, v0}, Lhb/w;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    iget-object v1, v0, Lxb/i;->a:Lqg/t;

    .line 33
    .line 34
    new-instance v2, Lci/j;

    .line 35
    .line 36
    const/16 v3, 0x18

    .line 37
    .line 38
    const/4 v4, 0x0

    .line 39
    invoke-direct {v2, v0, v4, v3}, Lci/j;-><init>(Ljava/lang/Object;Lwf/c;I)V

    .line 40
    .line 41
    .line 42
    const/4 v0, 0x3

    .line 43
    invoke-static {v1, v4, v2, v0}, Lqg/v;->q(Lqg/t;Lwf/g;Lfg/p;I)Lqg/e1;

    .line 44
    .line 45
    .line 46
    sget-object v0, Lsf/n;->a:Lsf/n;

    .line 47
    .line 48
    return-object v0

    .line 49
    :pswitch_1
    const v0, 0x3f99999a    # 1.2f

    .line 50
    .line 51
    .line 52
    iget-object v1, p0, Lwb/h3;->h:Lxb/i;

    .line 53
    .line 54
    invoke-virtual {v1}, Lxb/i;->a()F

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    const/high16 v2, 0x3f800000    # 1.0f

    .line 59
    .line 60
    invoke-static {v2, v0, v1}, Lfb/v0;->C(FFF)F

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    return-object v0

    .line 69
    :pswitch_2
    new-instance v1, Lyb/b;

    .line 70
    .line 71
    const/16 v0, 0x8

    .line 72
    .line 73
    int-to-float v0, v0

    .line 74
    iget-object v2, p0, Lwb/h3;->h:Lxb/i;

    .line 75
    .line 76
    invoke-virtual {v2}, Lxb/i;->a()F

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    mul-float/2addr v3, v0

    .line 81
    sget-wide v4, Lf1/w;->b:J

    .line 82
    .line 83
    const v0, 0x3e19999a    # 0.15f

    .line 84
    .line 85
    .line 86
    invoke-static {v4, v5, v0}, Lf1/w;->b(JF)J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    invoke-virtual {v2}, Lxb/i;->a()F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const/16 v4, 0x12

    .line 95
    .line 96
    move v2, v3

    .line 97
    move v3, v0

    .line 98
    invoke-direct/range {v1 .. v6}, Lyb/b;-><init>(FFIJ)V

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    nop

    .line 103
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
