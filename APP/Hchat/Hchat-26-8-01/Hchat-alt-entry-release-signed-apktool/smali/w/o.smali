.class public final synthetic Lw/o;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Li0/a1;

.field public final synthetic i:Lfg/l;


# direct methods
.method public synthetic constructor <init>(Lfg/l;Li0/a1;I)V
    .locals 0

    .line 1
    iput p3, p0, Lw/o;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lw/o;->i:Lfg/l;

    .line 4
    .line 5
    iput-object p2, p0, Lw/o;->h:Li0/a1;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public synthetic constructor <init>(Li0/a1;Lfg/l;I)V
    .locals 0

    .line 11
    iput p3, p0, Lw/o;->g:I

    iput-object p1, p0, Lw/o;->h:Li0/a1;

    iput-object p2, p0, Lw/o;->i:Lfg/l;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 12

    .line 1
    iget v0, p0, Lw/o;->g:I

    .line 2
    .line 3
    sget-object v1, Lsf/n;->a:Lsf/n;

    .line 4
    .line 5
    iget-object v2, p0, Lw/o;->h:Li0/a1;

    .line 6
    .line 7
    iget-object v3, p0, Lw/o;->i:Lfg/l;

    .line 8
    .line 9
    packed-switch v0, :pswitch_data_0

    .line 10
    .line 11
    .line 12
    check-cast p1, Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    check-cast v0, Ln2/s;

    .line 22
    .line 23
    iget-wide v4, v0, Ln2/s;->b:J

    .line 24
    .line 25
    sget v6, Li2/m0;->c:I

    .line 26
    .line 27
    const/16 v6, 0x20

    .line 28
    .line 29
    shr-long/2addr v4, v6

    .line 30
    long-to-int v4, v4

    .line 31
    iget-object v5, v0, Ln2/s;->a:Li2/g;

    .line 32
    .line 33
    iget-object v6, v5, Li2/g;->h:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 36
    .line 37
    .line 38
    move-result v6

    .line 39
    const/4 v7, 0x0

    .line 40
    invoke-static {v4, v7, v6}, Lr9/e0;->r(III)I

    .line 41
    .line 42
    .line 43
    move-result v4

    .line 44
    iget-wide v8, v0, Ln2/s;->b:J

    .line 45
    .line 46
    const-wide v10, 0xffffffffL

    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    and-long/2addr v8, v10

    .line 52
    long-to-int v0, v8

    .line 53
    iget-object v5, v5, Li2/g;->h:Ljava/lang/String;

    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    invoke-static {v0, v7, v6}, Lr9/e0;->r(III)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    invoke-static {v4, v0}, Ljava/lang/Math;->min(II)I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    invoke-static {v5, v6, v0, p1}, Log/m;->C0(Ljava/lang/CharSequence;IILjava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 80
    .line 81
    .line 82
    move-result p1

    .line 83
    add-int/2addr p1, v6

    .line 84
    new-instance v4, Ln2/s;

    .line 85
    .line 86
    invoke-static {p1, p1}, Li2/e0;->b(II)J

    .line 87
    .line 88
    .line 89
    move-result-wide v5

    .line 90
    const/4 p1, 0x4

    .line 91
    invoke-direct {v4, p1, v0, v5, v6}, Ln2/s;-><init>(ILjava/lang/String;J)V

    .line 92
    .line 93
    .line 94
    invoke-interface {v2, v4}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    iget-object p1, v4, Ln2/s;->a:Li2/g;

    .line 98
    .line 99
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 100
    .line 101
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    return-object v1

    .line 105
    :pswitch_0
    check-cast p1, Ln2/s;

    .line 106
    .line 107
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p1, Ln2/s;->a:Li2/g;

    .line 114
    .line 115
    iget-object p1, p1, Li2/g;->h:Ljava/lang/String;

    .line 116
    .line 117
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    return-object v1

    .line 121
    :pswitch_1
    check-cast p1, Ljava/lang/String;

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    return-object v1

    .line 135
    :pswitch_2
    check-cast p1, Lx8/b;

    .line 136
    .line 137
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 141
    .line 142
    .line 143
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    return-object v1

    .line 147
    :pswitch_3
    check-cast p1, Le1/b;

    .line 148
    .line 149
    invoke-interface {v2}, Li0/l2;->getValue()Ljava/lang/Object;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    check-cast v0, Li2/k0;

    .line 154
    .line 155
    if-eqz v0, :cond_0

    .line 156
    .line 157
    iget-wide v4, p1, Le1/b;->a:J

    .line 158
    .line 159
    iget-object p1, v0, Li2/k0;->b:Li2/o;

    .line 160
    .line 161
    invoke-virtual {p1, v4, v5}, Li2/o;->g(J)I

    .line 162
    .line 163
    .line 164
    move-result p1

    .line 165
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    :cond_0
    return-object v1

    .line 173
    :pswitch_4
    check-cast p1, Li2/k0;

    .line 174
    .line 175
    invoke-interface {v2, p1}, Li0/a1;->setValue(Ljava/lang/Object;)V

    .line 176
    .line 177
    .line 178
    invoke-interface {v3, p1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    return-object v1

    .line 182
    nop

    .line 183
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
