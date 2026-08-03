.class public final synthetic Lfd/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lfd/b;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Lfd/b;->b:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lfd/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lfd/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lr8/g;

    .line 9
    .line 10
    iget-object v1, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 11
    .line 12
    invoke-virtual {v1}, Lh/Hchat/dexkit/DexFinder;->resolveConversationMuteApi()V

    .line 13
    .line 14
    .line 15
    iget-object v0, v0, Lr8/g;->e:Lh/Hchat/dexkit/DexFinder;

    .line 16
    .line 17
    invoke-virtual {v0}, Lh/Hchat/dexkit/DexFinder;->isPrivateConversationMuteApiReady()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    return-object v0

    .line 26
    :pswitch_0
    iget-object v0, p0, Lfd/b;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v0, Lfd/a;

    .line 29
    .line 30
    iget-object v1, v0, Lfd/a;->a:Lud/e;

    .line 31
    .line 32
    sget-object v2, Lmd/a;->L:Lmd/a;

    .line 33
    .line 34
    iget-object v3, v1, Lmd/e;->g:Lmd/f;

    .line 35
    .line 36
    invoke-virtual {v3, v2}, Lmd/f;->a(Lmd/a;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    iget-object v3, v1, Lud/e;->k:Lud/u;

    .line 41
    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    invoke-virtual {v3}, Lud/u;->c()Lfc/b;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    iget-object v3, v0, Lfd/a;->c:Lb/e;

    .line 49
    .line 50
    iget-object v4, v3, Lb/e;->h:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v4, Lud/e;

    .line 53
    .line 54
    invoke-virtual {v3, v4, v2}, Lb/e;->i(Lmd/i;Lfc/f;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {v2}, Lfc/b;->f()V

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2, v1}, Lfc/b;->k(Lhc/c;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lfd/a;->j(Lfc/b;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lfc/b;->f()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Lfd/a;->g(Lfc/b;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v2}, Lfc/b;->w()Lbc/d;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    goto :goto_1

    .line 77
    :cond_0
    invoke-virtual {v3}, Lud/u;->c()Lfc/b;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    sget-object v4, Lmd/a;->s:Lmd/a;

    .line 82
    .line 83
    iget-object v1, v1, Lmd/e;->g:Lmd/f;

    .line 84
    .line 85
    invoke-virtual {v1, v4}, Lmd/f;->a(Lmd/a;)Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_1
    invoke-virtual {v0, v2}, Lfd/a;->b(Lfc/f;)V

    .line 93
    .line 94
    .line 95
    const/4 v1, 0x0

    .line 96
    invoke-virtual {v0, v2, v1}, Lfd/a;->a(Lfc/f;Z)V

    .line 97
    .line 98
    .line 99
    :goto_0
    invoke-virtual {v3}, Lud/u;->c()Lfc/b;

    .line 100
    .line 101
    .line 102
    move-result-object v1

    .line 103
    invoke-virtual {v0, v1}, Lfd/a;->j(Lfc/b;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lfc/b;->f()V

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0, v1}, Lfd/a;->g(Lfc/b;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, Lfc/b;->c(Lfc/b;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Lfc/b;->w()Lbc/d;

    .line 116
    .line 117
    .line 118
    move-result-object v0

    .line 119
    :goto_1
    return-object v0

    .line 120
    :pswitch_1
    iget-object v0, p0, Lfd/b;->b:Ljava/lang/Object;

    .line 121
    .line 122
    check-cast v0, Lgd/b;

    .line 123
    .line 124
    iget-object v1, v0, Lgd/b;->a:Lud/e;

    .line 125
    .line 126
    const/4 v2, 0x0

    .line 127
    invoke-virtual {v0, v1, v2}, Lgd/b;->b(Lud/e;Lfd/a;)Lhd/a;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    sget-object v1, Lgd/b;->c:Lh6/f;

    .line 132
    .line 133
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    new-instance v3, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 143
    .line 144
    .line 145
    :try_start_0
    new-instance v4, Lj6/q;

    .line 146
    .line 147
    invoke-direct {v4, v3}, Lj6/q;-><init>(Ljava/lang/Appendable;)V

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1, v4}, Lh6/f;->c(Ljava/io/Writer;)Lo6/a;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    invoke-virtual {v1, v0, v2, v4}, Lh6/f;->d(Ljava/lang/Object;Ljava/lang/Class;Lo6/a;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    return-object v0

    .line 162
    :catch_0
    move-exception v0

    .line 163
    new-instance v1, Laf/d;

    .line 164
    .line 165
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 166
    .line 167
    .line 168
    throw v1

    .line 169
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
