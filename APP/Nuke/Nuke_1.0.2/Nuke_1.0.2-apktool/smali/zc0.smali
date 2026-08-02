.class public final Lzc0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Les1;


# instance fields
.field public final a:Lfs1;

.field public final b:Lcom/dokar/quickjs/QuickJs;

.field public final c:Ljava/util/LinkedHashMap;

.field public final d:Ljava/util/LinkedHashMap;

.field public final e:Ljava/util/ArrayList;

.field public final f:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Lfs1;Lcom/dokar/quickjs/QuickJs;)V
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lzc0;->a:Lfs1;

    .line 8
    .line 9
    iput-object p2, p0, Lzc0;->b:Lcom/dokar/quickjs/QuickJs;

    .line 10
    .line 11
    iget-object p2, p1, Lfs1;->b:Ljava/util/ArrayList;

    .line 12
    .line 13
    const/16 v0, 0xa

    .line 14
    .line 15
    invoke-static {p2, v0}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Lxe1;->U(I)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/16 v2, 0x10

    .line 24
    .line 25
    if-ge v1, v2, :cond_0

    .line 26
    .line 27
    move v1, v2

    .line 28
    :cond_0
    new-instance v3, Ljava/util/LinkedHashMap;

    .line 29
    .line 30
    invoke-direct {v3, v1}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v4, 0x0

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    iput-object v3, p0, Lzc0;->c:Ljava/util/LinkedHashMap;

    .line 45
    .line 46
    iget-object p1, p1, Lfs1;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    invoke-static {p1, v0}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 49
    .line 50
    .line 51
    move-result p2

    .line 52
    invoke-static {p2}, Lxe1;->U(I)I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    if-ge p2, v2, :cond_1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    move v2, p2

    .line 60
    :goto_0
    new-instance p2, Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    invoke-direct {p2, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    move-object v2, v1

    .line 80
    check-cast v2, Lyc0;

    .line 81
    .line 82
    iget-object v2, v2, Lyc0;->a:Ljava/lang/String;

    .line 83
    .line 84
    invoke-interface {p2, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 85
    .line 86
    .line 87
    goto :goto_1

    .line 88
    :cond_2
    iput-object p2, p0, Lzc0;->d:Ljava/util/LinkedHashMap;

    .line 89
    .line 90
    iget-object p1, p0, Lzc0;->a:Lfs1;

    .line 91
    .line 92
    iget-object p1, p1, Lfs1;->b:Ljava/util/ArrayList;

    .line 93
    .line 94
    new-instance p2, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-static {p1, v0}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-direct {p2, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-nez v1, :cond_4

    .line 112
    .line 113
    iput-object p2, p0, Lzc0;->e:Ljava/util/ArrayList;

    .line 114
    .line 115
    iget-object p1, p0, Lzc0;->a:Lfs1;

    .line 116
    .line 117
    iget-object p1, p1, Lfs1;->c:Ljava/util/ArrayList;

    .line 118
    .line 119
    new-instance p2, Ljava/util/ArrayList;

    .line 120
    .line 121
    invoke-static {p1, v0}, Leu;->B(Ljava/lang/Iterable;I)I

    .line 122
    .line 123
    .line 124
    move-result v0

    .line 125
    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 129
    .line 130
    .line 131
    move-result-object p1

    .line 132
    :goto_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 133
    .line 134
    .line 135
    move-result v0

    .line 136
    if-eqz v0, :cond_3

    .line 137
    .line 138
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    check-cast v0, Lyc0;

    .line 143
    .line 144
    new-instance v1, Lcom/dokar/quickjs/binding/JsFunction;

    .line 145
    .line 146
    iget-object v2, v0, Lyc0;->a:Ljava/lang/String;

    .line 147
    .line 148
    iget-object v0, v0, Lyc0;->b:Lsk;

    .line 149
    .line 150
    instance-of v0, v0, Lug;

    .line 151
    .line 152
    invoke-direct {v1, v2, v0}, Lcom/dokar/quickjs/binding/JsFunction;-><init>(Ljava/lang/String;Z)V

    .line 153
    .line 154
    .line 155
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    goto :goto_2

    .line 159
    :cond_3
    iput-object p2, p0, Lzc0;->f:Ljava/util/ArrayList;

    .line 160
    .line 161
    return-void

    .line 162
    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 167
    .line 168
    .line 169
    invoke-static {}, Lc80;->g()V

    .line 170
    .line 171
    .line 172
    throw v4

    .line 173
    :cond_5
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 174
    .line 175
    .line 176
    move-result-object p0

    .line 177
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 178
    .line 179
    .line 180
    invoke-static {}, Lc80;->g()V

    .line 181
    .line 182
    .line 183
    throw v4
.end method
