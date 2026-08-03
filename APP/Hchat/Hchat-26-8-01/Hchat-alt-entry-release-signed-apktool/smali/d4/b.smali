.class public final synthetic Ld4/b;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/function/Function;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;

.field public final synthetic d:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lff/a;Ljava/lang/String;[B)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Ld4/b;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Ld4/b;->d:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Ld4/b;->b:Ljava/lang/Object;

    .line 10
    .line 11
    iput-object p3, p0, Ld4/b;->c:Ljava/lang/Object;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 14
    iput p4, p0, Ld4/b;->a:I

    iput-object p1, p0, Ld4/b;->b:Ljava/lang/Object;

    iput-object p2, p0, Ld4/b;->c:Ljava/lang/Object;

    iput-object p3, p0, Ld4/b;->d:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final apply(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, Ld4/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Ld4/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ljava/util/Collection;

    .line 9
    .line 10
    iget-object v1, p0, Ld4/b;->c:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, Lnd/b0;

    .line 13
    .line 14
    iget-object v2, p0, Ld4/b;->d:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, Lqd/j;

    .line 17
    .line 18
    check-cast p1, Lqd/j;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    instance-of v3, p1, Lqd/c;

    .line 24
    .line 25
    if-eqz v3, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Lqd/j;->l()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-interface {v0}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v4

    .line 39
    if-eqz v4, :cond_1

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    check-cast v4, Lqd/j;

    .line 46
    .line 47
    invoke-virtual {v4}, Lqd/j;->l()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v5

    .line 51
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_0

    .line 56
    .line 57
    invoke-virtual {v4}, Lqd/j;->i()Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {p1, v0}, Lqd/j;->B(Ljava/util/List;)V

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    invoke-static {v2}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    new-instance v0, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v2, "Unknown type variable: "

    .line 72
    .line 73
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    const-string v2, " in type: "

    .line 80
    .line 81
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v1, p1}, Lnd/b0;->L(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 95
    return-object p1

    .line 96
    :pswitch_0
    iget-object v0, p0, Ld4/b;->b:Ljava/lang/Object;

    .line 97
    .line 98
    check-cast v0, Lfe/a;

    .line 99
    .line 100
    iget-object v1, p0, Ld4/b;->c:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v1, Lqd/j;

    .line 103
    .line 104
    iget-object v2, p0, Ld4/b;->d:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v2, Ljava/util/List;

    .line 107
    .line 108
    check-cast p1, Ljava/lang/Integer;

    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 111
    .line 112
    .line 113
    move-result p1

    .line 114
    invoke-interface {v2, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    check-cast p1, Lqd/j;

    .line 119
    .line 120
    invoke-virtual {v0, v1, v1, p1}, Lfe/a;->l(Lqd/j;Lqd/j;Lqd/j;)Lqd/j;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    return-object p1

    .line 125
    :pswitch_1
    iget-object v0, p0, Ld4/b;->d:Ljava/lang/Object;

    .line 126
    .line 127
    check-cast v0, Lff/a;

    .line 128
    .line 129
    iget-object v1, p0, Ld4/b;->b:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v1, Ljava/lang/String;

    .line 132
    .line 133
    iget-object v2, p0, Ld4/b;->c:Ljava/lang/Object;

    .line 134
    .line 135
    check-cast v2, [B

    .line 136
    .line 137
    check-cast p1, Ljava/lang/Integer;

    .line 138
    .line 139
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 140
    .line 141
    .line 142
    move-result p1

    .line 143
    invoke-virtual {v0, v1, v2, p1}, Lff/a;->e(Ljava/lang/String;[BI)Lff/e;

    .line 144
    .line 145
    .line 146
    move-result-object p1

    .line 147
    return-object p1

    .line 148
    :pswitch_2
    iget-object v0, p0, Ld4/b;->b:Ljava/lang/Object;

    .line 149
    .line 150
    check-cast v0, Ljava/lang/String;

    .line 151
    .line 152
    iget-object v1, p0, Ld4/b;->c:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast v1, [B

    .line 155
    .line 156
    iget-object v2, p0, Ld4/b;->d:Ljava/lang/Object;

    .line 157
    .line 158
    check-cast v2, Ljava/lang/ClassLoader;

    .line 159
    .line 160
    check-cast p1, Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v0, v1, v2, p1}, Lbsh/loader/BshLoaderHelper;->a(Ljava/lang/String;[BLjava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    return-object p1

    .line 167
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
