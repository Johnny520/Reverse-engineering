.class public final Lwh;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/util/Comparator;


# direct methods
.method public constructor <init>(Ljava/util/Comparator;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    iput v0, p0, Lwh;->a:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lwh;->b:Ljava/util/Comparator;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Comparator;I)V
    .locals 0

    .line 10
    iput p2, p0, Lwh;->a:I

    iput-object p1, p0, Lwh;->b:Ljava/util/Comparator;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, Lwh;->a:I

    .line 2
    .line 3
    iget-object p0, p0, Lwh;->b:Ljava/util/Comparator;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    check-cast p0, Lsl0;

    .line 9
    .line 10
    invoke-virtual {p0, p1, p2}, Lsl0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    check-cast p1, Ljc3;

    .line 18
    .line 19
    iget-object p0, p1, Ljc3;->b:Ljava/lang/String;

    .line 20
    .line 21
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    check-cast p2, Ljc3;

    .line 31
    .line 32
    iget-object p2, p2, Ljc3;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    :goto_0
    return p0

    .line 46
    :pswitch_0
    check-cast p0, Lwh;

    .line 47
    .line 48
    invoke-virtual {p0, p1, p2}, Lwh;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    check-cast p1, Lqn2;

    .line 56
    .line 57
    iget p0, p1, Lqn2;->f:I

    .line 58
    .line 59
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p2, Lqn2;

    .line 64
    .line 65
    iget p1, p2, Lqn2;->f:I

    .line 66
    .line 67
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    :goto_1
    return p0

    .line 76
    :pswitch_1
    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    if-eqz p0, :cond_2

    .line 81
    .line 82
    goto :goto_2

    .line 83
    :cond_2
    check-cast p1, Lqn2;

    .line 84
    .line 85
    iget-object p0, p1, Lqn2;->c:Lr61;

    .line 86
    .line 87
    check-cast p2, Lqn2;

    .line 88
    .line 89
    iget-object p1, p2, Lqn2;->c:Lr61;

    .line 90
    .line 91
    sget-object p2, Lr61;->a0:Lqa;

    .line 92
    .line 93
    invoke-virtual {p2, p0, p1}, Lqa;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    :goto_2
    return p0

    .line 98
    :pswitch_2
    check-cast p0, Lsl0;

    .line 99
    .line 100
    invoke-virtual {p0, p1, p2}, Lsl0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 101
    .line 102
    .line 103
    move-result p0

    .line 104
    if-eqz p0, :cond_3

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_3
    check-cast p1, Lz80;

    .line 108
    .line 109
    iget-object p0, p1, Lz80;->a:Ljava/io/File;

    .line 110
    .line 111
    invoke-virtual {p0}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p0

    .line 115
    check-cast p2, Lz80;

    .line 116
    .line 117
    iget-object p1, p2, Lz80;->a:Ljava/io/File;

    .line 118
    .line 119
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p1

    .line 123
    invoke-static {p0, p1}, Lgf1;->o(Ljava/lang/Comparable;Ljava/lang/Comparable;)I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    :goto_3
    return p0

    .line 128
    :pswitch_3
    check-cast p0, Lsl0;

    .line 129
    .line 130
    invoke-virtual {p0, p1, p2}, Lsl0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_4

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_4
    check-cast p1, Lg33;

    .line 138
    .line 139
    iget-object p0, p1, Lg33;->b:Ljava/lang/String;

    .line 140
    .line 141
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 142
    .line 143
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 144
    .line 145
    .line 146
    move-result-object p0

    .line 147
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    check-cast p2, Lg33;

    .line 151
    .line 152
    iget-object p2, p2, Lg33;->b:Ljava/lang/String;

    .line 153
    .line 154
    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p1

    .line 158
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 162
    .line 163
    .line 164
    move-result p0

    .line 165
    :goto_4
    return p0

    .line 166
    :pswitch_4
    check-cast p0, Lsl0;

    .line 167
    .line 168
    invoke-virtual {p0, p1, p2}, Lsl0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    if-eqz p0, :cond_5

    .line 173
    .line 174
    goto :goto_5

    .line 175
    :cond_5
    check-cast p1, Ls62;

    .line 176
    .line 177
    iget-object p0, p1, Ls62;->b:Ljava/lang/String;

    .line 178
    .line 179
    sget-object p1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 180
    .line 181
    invoke-virtual {p0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object p0

    .line 185
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    check-cast p2, Ls62;

    .line 189
    .line 190
    iget-object p2, p2, Ls62;->b:Ljava/lang/String;

    .line 191
    .line 192
    invoke-virtual {p2, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/Object;)I

    .line 200
    .line 201
    .line 202
    move-result p0

    .line 203
    :goto_5
    return p0

    .line 204
    nop

    .line 205
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
