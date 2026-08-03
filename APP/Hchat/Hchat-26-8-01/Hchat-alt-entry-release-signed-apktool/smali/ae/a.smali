.class public final synthetic Lae/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/ToIntFunction;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lae/a;->a:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final applyAsInt(Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, Lae/a;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Lud/r;

    .line 7
    .line 8
    iget p1, p1, Lud/r;->o:I

    .line 9
    .line 10
    return p1

    .line 11
    :pswitch_0
    check-cast p1, Lud/e;

    .line 12
    .line 13
    iget-object p1, p1, Lud/e;->t:Ljava/util/List;

    .line 14
    .line 15
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :pswitch_1
    check-cast p1, Lqd/s;

    .line 21
    .line 22
    iget p1, p1, Lqd/s;->h:I

    .line 23
    .line 24
    return p1

    .line 25
    :pswitch_2
    check-cast p1, Lqd/s;

    .line 26
    .line 27
    iget p1, p1, Lqd/s;->g:I

    .line 28
    .line 29
    return p1

    .line 30
    :pswitch_3
    check-cast p1, Lke/l;

    .line 31
    .line 32
    iget p1, p1, Lke/l;->d:I

    .line 33
    .line 34
    return p1

    .line 35
    :pswitch_4
    check-cast p1, Ljava/lang/Integer;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    return p1

    .line 42
    :pswitch_5
    check-cast p1, Lnd/b0;

    .line 43
    .line 44
    iget p1, p1, Lnd/r;->i:I

    .line 45
    .line 46
    return p1

    .line 47
    :pswitch_6
    check-cast p1, Led/b;

    .line 48
    .line 49
    iget-object p1, p1, Led/b;->d:Ljava/util/Map;

    .line 50
    .line 51
    invoke-interface {p1}, Ljava/util/Map;->size()I

    .line 52
    .line 53
    .line 54
    move-result p1

    .line 55
    return p1

    .line 56
    :pswitch_7
    check-cast p1, Lef/c;

    .line 57
    .line 58
    iget p1, p1, Lef/c;->a:I

    .line 59
    .line 60
    return p1

    .line 61
    :pswitch_8
    check-cast p1, Ljava/lang/Integer;

    .line 62
    .line 63
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    return p1

    .line 68
    :pswitch_9
    check-cast p1, Lqd/r;

    .line 69
    .line 70
    if-eqz p1, :cond_0

    .line 71
    .line 72
    iget-object p1, p1, Lqd/l;->j:Lud/p;

    .line 73
    .line 74
    if-eqz p1, :cond_0

    .line 75
    .line 76
    iget p1, p1, Lud/p;->n:I

    .line 77
    .line 78
    goto :goto_0

    .line 79
    :cond_0
    const/4 p1, -0x1

    .line 80
    :goto_0
    return p1

    .line 81
    :pswitch_a
    check-cast p1, Ljava/lang/StackTraceElement;

    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    return p1

    .line 88
    :pswitch_b
    check-cast p1, Lud/a;

    .line 89
    .line 90
    iget-object p1, p1, Lud/a;->l:Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    return p1

    .line 97
    :pswitch_c
    check-cast p1, Lae/f;

    .line 98
    .line 99
    iget-object p1, p1, Lae/f;->d:Ljava/util/ArrayList;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 102
    .line 103
    .line 104
    move-result p1

    .line 105
    return p1

    .line 106
    :pswitch_d
    check-cast p1, Lnd/b0;

    .line 107
    .line 108
    iget p1, p1, Lnd/r;->i:I

    .line 109
    .line 110
    return p1

    .line 111
    :pswitch_e
    check-cast p1, Lae/f;

    .line 112
    .line 113
    iget p1, p1, Lae/f;->b:I

    .line 114
    .line 115
    return p1

    .line 116
    nop

    .line 117
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
