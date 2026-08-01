.class public final Lji0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public final synthetic α:Lli0;


# direct methods
.method public synthetic constructor <init>(Lli0;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lji0;->α:Lli0;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public α(IILhj0;)V
    .locals 6

    .line 1
    iget-object v0, p3, Lhj0;->β:Lyi0;

    .line 2
    .line 3
    sget-object v1, Lyi0;->ε:Lyi0;

    .line 4
    .line 5
    if-ne v0, v1, :cond_7

    .line 6
    .line 7
    sget-object v0, Lvh0;->α:Lvh0;

    .line 8
    .line 9
    iget-object v0, p3, Lhj0;->α:Lxi0;

    .line 10
    .line 11
    iget-object v0, v0, Lxi0;->α:Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {v0}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    if-eqz v1, :cond_0

    .line 18
    .line 19
    goto/16 :goto_3

    .line 20
    .line 21
    :cond_0
    const-string v1, "cid:"

    .line 22
    .line 23
    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    sget-object v2, Lvh0;->ι:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    const/4 v2, 0x0

    .line 34
    const/4 v3, 0x1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    move v1, v3

    .line 38
    goto :goto_0

    .line 39
    :cond_1
    move v1, v2

    .line 40
    :goto_0
    const-string v4, "#"

    .line 41
    .line 42
    invoke-virtual {v0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    sget-object v4, Lvh0;->μ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 47
    .line 48
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    check-cast v4, Ljava/lang/Iterable;

    .line 56
    .line 57
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    :cond_2
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v5

    .line 65
    if-eqz v5, :cond_3

    .line 66
    .line 67
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    check-cast v5, Ljava/lang/String;

    .line 72
    .line 73
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    invoke-static {v5, v0, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 77
    .line 78
    .line 79
    move-result v5

    .line 80
    if-ne v5, v3, :cond_2

    .line 81
    .line 82
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 83
    .line 84
    .line 85
    goto :goto_1

    .line 86
    :cond_3
    sget-object v4, Lvh0;->ν:Ljava/util/concurrent/ConcurrentHashMap;

    .line 87
    .line 88
    invoke-virtual {v4}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 89
    .line 90
    .line 91
    move-result-object v4

    .line 92
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    check-cast v4, Ljava/lang/Iterable;

    .line 96
    .line 97
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    :cond_4
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 102
    .line 103
    .line 104
    move-result v5

    .line 105
    if-eqz v5, :cond_5

    .line 106
    .line 107
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v5

    .line 111
    check-cast v5, Ljava/lang/String;

    .line 112
    .line 113
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {v5, v0, v2}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 117
    .line 118
    .line 119
    move-result v5

    .line 120
    if-ne v5, v3, :cond_4

    .line 121
    .line 122
    invoke-interface {v4}, Ljava/util/Iterator;->remove()V

    .line 123
    .line 124
    .line 125
    goto :goto_2

    .line 126
    :cond_5
    if-eqz v1, :cond_7

    .line 127
    .line 128
    sget-object v0, Lvh0;->ο:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArraySet;->isEmpty()Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_6

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    sget-object v0, Lvh0;->κ:Lh22;

    .line 138
    .line 139
    invoke-virtual {v0}, Lh22;->getValue()Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    check-cast v0, Landroid/os/Handler;

    .line 144
    .line 145
    new-instance v1, Lfb0;

    .line 146
    .line 147
    const/4 v2, 0x4

    .line 148
    invoke-direct {v1, v2}, Lfb0;-><init>(I)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 152
    .line 153
    .line 154
    :cond_7
    :goto_3
    new-instance v0, Lyf0;

    .line 155
    .line 156
    iget-object p0, p0, Lji0;->α:Lli0;

    .line 157
    .line 158
    invoke-direct {v0, p0, p1, p2, p3}, Lyf0;-><init>(Lli0;IILhj0;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, v0}, Lli0;->δ(Lp70;)V

    .line 162
    .line 163
    .line 164
    return-void
.end method
