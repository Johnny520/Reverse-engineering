.class public final synthetic Lnt;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:La80;


# direct methods
.method public synthetic constructor <init>(La80;I)V
    .locals 0

    .line 1
    iput p2, p0, Lnt;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lnt;->ζ:La80;

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
    .locals 6

    .line 1
    iget v0, p0, Lnt;->ε:I

    .line 2
    .line 3
    sget-object v1, Ls62;->α:Ls62;

    .line 4
    .line 5
    iget-object p0, p0, Lnt;->ζ:La80;

    .line 6
    .line 7
    packed-switch v0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object v0, Lbv1;->α:Lbv1;

    .line 11
    .line 12
    invoke-static {}, Lbv1;->ψ()Ljava/util/List;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x0

    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_0
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    move v2, v3

    .line 29
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_3

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Lku1;

    .line 40
    .line 41
    iget-object v4, v4, Lku1;->α:Ljava/lang/String;

    .line 42
    .line 43
    const-string v5, "feed_right_control_hide_"

    .line 44
    .line 45
    invoke-virtual {v5, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-static {v4, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-eqz v4, :cond_1

    .line 54
    .line 55
    add-int/lit8 v2, v2, 0x1

    .line 56
    .line 57
    if-ltz v2, :cond_2

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    invoke-static {}, Lyh;->ф()V

    .line 61
    .line 62
    .line 63
    const/4 p0, 0x0

    .line 64
    throw p0

    .line 65
    :cond_3
    move v3, v2

    .line 66
    :goto_1
    if-lez v3, :cond_4

    .line 67
    .line 68
    const-string v0, "\u5df2\u9690\u85cf "

    .line 69
    .line 70
    const-string v2, " \u9879"

    .line 71
    .line 72
    invoke-static {v0, v3, v2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_2

    .line 77
    :cond_4
    const-string v0, "\u672a\u9690\u85cf"

    .line 78
    .line 79
    :goto_2
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    invoke-static {}, Lbv1;->ω()V

    .line 83
    .line 84
    .line 85
    return-object v1

    .line 86
    :pswitch_0
    sget-object v0, Lbv1;->α:Lbv1;

    .line 87
    .line 88
    invoke-static {}, Lbv1;->Κ()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    return-object v1

    .line 96
    :pswitch_1
    const-string v0, "\u5df2\u4e0b\u8f7d"

    .line 97
    .line 98
    invoke-interface {p0, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    return-object v1

    .line 102
    :pswitch_2
    sget-object v0, Lst;->μ:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 103
    .line 104
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArraySet;->remove(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    return-object v1

    .line 108
    nop

    .line 109
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
