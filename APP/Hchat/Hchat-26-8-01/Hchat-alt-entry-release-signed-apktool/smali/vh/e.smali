.class public final Lvh/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lf1/r0;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lvh/e;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lvh/e;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(JLu2/m;Lu2/c;)Lf1/c0;
    .locals 4

    .line 1
    iget v0, p0, Lvh/e;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance p1, Lf1/j0;

    .line 7
    .line 8
    iget-object p2, p0, Lvh/e;->b:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p2, Lf1/j;

    .line 11
    .line 12
    invoke-direct {p1, p2}, Lf1/j0;-><init>(Lf1/j;)V

    .line 13
    .line 14
    .line 15
    return-object p1

    .line 16
    :pswitch_0
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    iget-object v0, p0, Lvh/e;->b:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast v0, Lvh/f;

    .line 25
    .line 26
    iget-object v1, v0, Lvh/f;->c:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v1, Lfg/a;

    .line 29
    .line 30
    invoke-interface {v1}, Lfg/a;->invoke()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    check-cast v1, Lf1/r0;

    .line 35
    .line 36
    iget-object v2, v0, Lvh/f;->d:Ljava/lang/Object;

    .line 37
    .line 38
    check-cast v2, Lf1/r0;

    .line 39
    .line 40
    invoke-static {v2, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_0

    .line 45
    .line 46
    iput-object v1, v0, Lvh/f;->d:Ljava/lang/Object;

    .line 47
    .line 48
    const/4 v2, 0x0

    .line 49
    iput-object v2, v0, Lvh/f;->e:Ljava/lang/Object;

    .line 50
    .line 51
    :cond_0
    iget-object v2, v0, Lvh/f;->e:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v2, Lf1/c0;

    .line 54
    .line 55
    if-eqz v2, :cond_1

    .line 56
    .line 57
    iget-wide v2, v0, Lvh/f;->b:J

    .line 58
    .line 59
    invoke-static {v2, v3, p1, p2}, Le1/e;->a(JJ)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    iget-object v2, v0, Lvh/f;->a:Lu2/m;

    .line 66
    .line 67
    if-ne v2, p3, :cond_1

    .line 68
    .line 69
    iget-object v2, v0, Lvh/f;->f:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v2, Ljava/lang/Float;

    .line 72
    .line 73
    invoke-interface {p4}, Lu2/c;->d()F

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    if-eqz v2, :cond_1

    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    cmpl-float v2, v2, v3

    .line 84
    .line 85
    if-nez v2, :cond_1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_1
    iput-wide p1, v0, Lvh/f;->b:J

    .line 89
    .line 90
    iput-object p3, v0, Lvh/f;->a:Lu2/m;

    .line 91
    .line 92
    invoke-interface {p4}, Lu2/c;->d()F

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iput-object v2, v0, Lvh/f;->f:Ljava/lang/Object;

    .line 101
    .line 102
    invoke-interface {v1, p1, p2, p3, p4}, Lf1/r0;->a(JLu2/m;Lu2/c;)Lf1/c0;

    .line 103
    .line 104
    .line 105
    move-result-object p1

    .line 106
    iput-object p1, v0, Lvh/f;->e:Ljava/lang/Object;

    .line 107
    .line 108
    :goto_0
    iget-object p1, v0, Lvh/f;->e:Ljava/lang/Object;

    .line 109
    .line 110
    check-cast p1, Lf1/c0;

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    return-object p1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
