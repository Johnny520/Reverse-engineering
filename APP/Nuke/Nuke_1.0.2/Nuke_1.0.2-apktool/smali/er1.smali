.class public final synthetic Ler1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lin0;


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Lgu2;

.field public final synthetic j:Lgu2;


# direct methods
.method public synthetic constructor <init>(Lgu2;Lgu2;I)V
    .locals 0

    .line 1
    iput p3, p0, Ler1;->h:I

    .line 2
    .line 3
    iput-object p1, p0, Ler1;->i:Lgu2;

    .line 4
    .line 5
    iput-object p2, p0, Ler1;->j:Lgu2;

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
    .locals 3

    .line 1
    iget v0, p0, Ler1;->h:I

    .line 2
    .line 3
    sget-object v1, La83;->a:La83;

    .line 4
    .line 5
    iget-object v2, p0, Ler1;->j:Lgu2;

    .line 6
    .line 7
    iget-object p0, p0, Ler1;->i:Lgu2;

    .line 8
    .line 9
    check-cast p1, Lca2;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Lza0;

    .line 22
    .line 23
    iget p0, p0, Lza0;->h:F

    .line 24
    .line 25
    iget-object v0, p1, Lca2;->x:Le70;

    .line 26
    .line 27
    invoke-interface {v0}, Le70;->b()F

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    mul-float/2addr v0, p0

    .line 32
    invoke-virtual {p1, v0}, Lca2;->s(F)V

    .line 33
    .line 34
    .line 35
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    check-cast p0, Ljava/lang/Number;

    .line 40
    .line 41
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    invoke-virtual {p1, p0}, Lca2;->k(F)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    check-cast p0, Ljava/lang/Number;

    .line 53
    .line 54
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    invoke-virtual {p1, p0}, Lca2;->l(F)V

    .line 59
    .line 60
    .line 61
    return-object v1

    .line 62
    :pswitch_0
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    check-cast p0, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    invoke-virtual {p1, p0}, Lca2;->k(F)V

    .line 73
    .line 74
    .line 75
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    check-cast p0, Ljava/lang/Number;

    .line 80
    .line 81
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-virtual {p1, p0}, Lca2;->l(F)V

    .line 86
    .line 87
    .line 88
    return-object v1

    .line 89
    :pswitch_1
    invoke-interface {p0}, Lgu2;->getValue()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p0

    .line 93
    check-cast p0, Ljava/lang/Number;

    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 96
    .line 97
    .line 98
    move-result p0

    .line 99
    invoke-virtual {p1, p0}, Lca2;->j(F)V

    .line 100
    .line 101
    .line 102
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    check-cast p0, Ljava/lang/Number;

    .line 107
    .line 108
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 109
    .line 110
    .line 111
    move-result p0

    .line 112
    invoke-virtual {p1, p0}, Lca2;->k(F)V

    .line 113
    .line 114
    .line 115
    invoke-interface {v2}, Lgu2;->getValue()Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    check-cast p0, Ljava/lang/Number;

    .line 120
    .line 121
    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    invoke-virtual {p1, p0}, Lca2;->l(F)V

    .line 126
    .line 127
    .line 128
    return-object v1

    .line 129
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
