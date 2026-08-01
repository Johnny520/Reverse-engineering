.class public final synthetic Lyf0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lp70;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:I

.field public final synthetic η:I

.field public final synthetic θ:Ljava/lang/Object;

.field public final synthetic ι:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ldg0;ILsc;IZ)V
    .locals 0

    .line 1
    const/4 p5, 0x0

    .line 2
    iput p5, p0, Lyf0;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyf0;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Lyf0;->ζ:I

    .line 10
    .line 11
    iput-object p3, p0, Lyf0;->ι:Ljava/lang/Object;

    .line 12
    .line 13
    iput p4, p0, Lyf0;->η:I

    .line 14
    .line 15
    return-void
.end method

.method public synthetic constructor <init>(Lli0;IILhj0;)V
    .locals 1

    .line 16
    const/4 v0, 0x1

    iput v0, p0, Lyf0;->ε:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lyf0;->θ:Ljava/lang/Object;

    iput p2, p0, Lyf0;->ζ:I

    iput p3, p0, Lyf0;->η:I

    iput-object p4, p0, Lyf0;->ι:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Lyf0;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lyf0;->θ:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lli0;

    .line 9
    .line 10
    iget v1, p0, Lyf0;->ζ:I

    .line 11
    .line 12
    iget v2, p0, Lyf0;->η:I

    .line 13
    .line 14
    iget-object p0, p0, Lyf0;->ι:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p0, Lhj0;

    .line 17
    .line 18
    iput v1, v0, Lli0;->Η:I

    .line 19
    .line 20
    iput v2, v0, Lli0;->Θ:I

    .line 21
    .line 22
    iput-object p0, v0, Lli0;->Ι:Lhj0;

    .line 23
    .line 24
    iget-object v1, p0, Lhj0;->β:Lyi0;

    .line 25
    .line 26
    sget-object v2, Lyi0;->ε:Lyi0;

    .line 27
    .line 28
    if-ne v1, v2, :cond_2

    .line 29
    .line 30
    iget-object v1, v0, Lli0;->τ:Lij0;

    .line 31
    .line 32
    iget-object v2, p0, Lhj0;->α:Lxi0;

    .line 33
    .line 34
    iget-object v2, v2, Lxi0;->α:Ljava/lang/String;

    .line 35
    .line 36
    monitor-enter v1

    .line 37
    :try_start_0
    iget-object v3, v1, Lij0;->α:Ljava/util/LinkedHashSet;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/util/AbstractCollection;->remove(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    .line 42
    monitor-exit v1

    .line 43
    iget-object v1, v0, Lli0;->χ:Ljava/util/List;

    .line 44
    .line 45
    new-instance v2, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    move-object v4, v3

    .line 65
    check-cast v4, Lxi0;

    .line 66
    .line 67
    iget-object v4, v4, Lxi0;->α:Ljava/lang/String;

    .line 68
    .line 69
    iget-object v5, p0, Lhj0;->α:Lxi0;

    .line 70
    .line 71
    iget-object v5, v5, Lxi0;->α:Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-nez v4, :cond_0

    .line 78
    .line 79
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 80
    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_1
    iput-object v2, v0, Lli0;->χ:Ljava/util/List;

    .line 84
    .line 85
    invoke-virtual {v0}, Lli0;->α()V

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_0
    move-exception p0

    .line 90
    :try_start_1
    monitor-exit v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 91
    throw p0

    .line 92
    :cond_2
    invoke-virtual {v0}, Lli0;->θ()V

    .line 93
    .line 94
    .line 95
    :goto_1
    sget-object p0, Ls62;->α:Ls62;

    .line 96
    .line 97
    return-object p0

    .line 98
    :pswitch_0
    iget-object v0, p0, Lyf0;->θ:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast v0, Ldg0;

    .line 101
    .line 102
    iget v1, p0, Lyf0;->ζ:I

    .line 103
    .line 104
    iget-object v2, p0, Lyf0;->ι:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Lsc;

    .line 107
    .line 108
    iget p0, p0, Lyf0;->η:I

    .line 109
    .line 110
    :try_start_2
    iget-object v3, v0, Ldg0;->ο:Lxn0;

    .line 111
    .line 112
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    int-to-long v3, p0

    .line 116
    invoke-virtual {v2, v3, v4}, Lsc;->skip(J)V

    .line 117
    .line 118
    .line 119
    iget-object p0, v0, Ldg0;->Γ:Llg0;

    .line 120
    .line 121
    sget-object v2, Lsz;->μ:Lsz;

    .line 122
    .line 123
    invoke-virtual {p0, v1, v2}, Llg0;->ρ(ILsz;)V

    .line 124
    .line 125
    .line 126
    monitor-enter v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0

    .line 127
    :try_start_3
    iget-object p0, v0, Ldg0;->Ε:Ljava/util/LinkedHashSet;

    .line 128
    .line 129
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 130
    .line 131
    .line 132
    move-result-object v1

    .line 133
    invoke-interface {p0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 134
    .line 135
    .line 136
    :try_start_4
    monitor-exit v0

    .line 137
    goto :goto_2

    .line 138
    :catchall_1
    move-exception p0

    .line 139
    monitor-exit v0

    .line 140
    throw p0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0

    .line 141
    :catch_0
    :goto_2
    sget-object p0, Ls62;->α:Ls62;

    .line 142
    .line 143
    return-object p0

    .line 144
    nop

    .line 145
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
