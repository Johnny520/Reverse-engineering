.class public final LA0/Q;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;

.field public final synthetic c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p3, p0, LA0/Q;->a:I

    iput-object p1, p0, LA0/Q;->b:Ljava/lang/Object;

    iput-object p2, p0, LA0/Q;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, LA0/Q;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LA0/Q;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, LA0/Q;

    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, LA0/Q;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Ls0/i;

    .line 18
    .line 19
    iget-object v0, p0, LA0/Q;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v0, Ls0/l;

    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    invoke-static {p1}, Ls0/l;->e(Ls0/i;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    check-cast p2, Ls0/i;

    .line 31
    .line 32
    invoke-static {p2}, Ls0/l;->e(Ls0/i;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p2

    .line 36
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    :goto_0
    return v0

    .line 41
    :pswitch_0
    iget-object v0, p0, LA0/Q;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, Ls0/k;

    .line 44
    .line 45
    invoke-virtual {v0, p1, p2}, Ls0/k;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 46
    .line 47
    .line 48
    move-result v0

    .line 49
    if-eqz v0, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    check-cast p1, Ls0/i;

    .line 53
    .line 54
    iget-object v0, p0, LA0/Q;->c:Ljava/lang/Object;

    .line 55
    .line 56
    check-cast v0, Ls0/l;

    .line 57
    .line 58
    invoke-static {v0, p1}, Ls0/l;->a(Ls0/l;Ls0/i;)I

    .line 59
    .line 60
    .line 61
    move-result p1

    .line 62
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p2, Ls0/i;

    .line 67
    .line 68
    invoke-static {v0, p2}, Ls0/l;->a(Ls0/l;Ls0/i;)I

    .line 69
    .line 70
    .line 71
    move-result p2

    .line 72
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    .line 74
    .line 75
    move-result-object p2

    .line 76
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    :goto_1
    return v0

    .line 81
    :pswitch_1
    iget-object v0, p0, LA0/Q;->b:Ljava/lang/Object;

    .line 82
    .line 83
    check-cast v0, LA0/Q;

    .line 84
    .line 85
    invoke-virtual {v0, p1, p2}, LA0/Q;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-eqz v0, :cond_2

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_2
    check-cast p1, Ls0/i;

    .line 93
    .line 94
    iget-object v0, p0, LA0/Q;->c:Ljava/lang/Object;

    .line 95
    .line 96
    check-cast v0, Ls0/l;

    .line 97
    .line 98
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {p1}, Ls0/l;->e(Ls0/i;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    check-cast p2, Ls0/i;

    .line 106
    .line 107
    invoke-static {p2}, Ls0/l;->e(Ls0/i;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 112
    .line 113
    .line 114
    move-result v0

    .line 115
    :goto_2
    return v0

    .line 116
    :pswitch_2
    iget-object v0, p0, LA0/Q;->b:Ljava/lang/Object;

    .line 117
    .line 118
    check-cast v0, Ls0/k;

    .line 119
    .line 120
    invoke-virtual {v0, p1, p2}, Ls0/k;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 121
    .line 122
    .line 123
    move-result v0

    .line 124
    if-eqz v0, :cond_3

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_3
    check-cast p1, Ls0/i;

    .line 128
    .line 129
    iget-object v0, p0, LA0/Q;->c:Ljava/lang/Object;

    .line 130
    .line 131
    check-cast v0, Ls0/l;

    .line 132
    .line 133
    invoke-static {v0, p1}, Ls0/l;->a(Ls0/l;Ls0/i;)I

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 138
    .line 139
    .line 140
    move-result-object p1

    .line 141
    check-cast p2, Ls0/i;

    .line 142
    .line 143
    invoke-static {v0, p2}, Ls0/l;->a(Ls0/l;Ls0/i;)I

    .line 144
    .line 145
    .line 146
    move-result p2

    .line 147
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-static {p1, p2}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 152
    .line 153
    .line 154
    move-result v0

    .line 155
    :goto_3
    return v0

    .line 156
    :pswitch_3
    check-cast p2, Ljava/lang/Class;

    .line 157
    .line 158
    iget-object v0, p0, LA0/Q;->b:Ljava/lang/Object;

    .line 159
    .line 160
    check-cast v0, Ljava/util/Set;

    .line 161
    .line 162
    iget-object v1, p0, LA0/Q;->c:Ljava/lang/Object;

    .line 163
    .line 164
    check-cast v1, Ljava/util/Set;

    .line 165
    .line 166
    invoke-static {p2, v0, v1}, LA0/g;->e(Ljava/lang/Class;Ljava/util/Set;Ljava/util/Set;)I

    .line 167
    .line 168
    .line 169
    move-result p2

    .line 170
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 171
    .line 172
    .line 173
    move-result-object p2

    .line 174
    check-cast p1, Ljava/lang/Class;

    .line 175
    .line 176
    invoke-static {p1, v0, v1}, LA0/g;->e(Ljava/lang/Class;Ljava/util/Set;Ljava/util/Set;)I

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 181
    .line 182
    .line 183
    move-result-object p1

    .line 184
    invoke-static {p2, p1}, LD/h;->h(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 185
    .line 186
    .line 187
    move-result p1

    .line 188
    return p1

    .line 189
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
