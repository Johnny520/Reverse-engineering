.class public final synthetic Lgd1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements La80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lorg/json/JSONObject;


# direct methods
.method public synthetic constructor <init>(Lij0;Lorg/json/JSONObject;)V
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    iput p1, p0, Lgd1;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lgd1;->ζ:Lorg/json/JSONObject;

    .line 8
    .line 9
    return-void
.end method

.method public synthetic constructor <init>(Lorg/json/JSONObject;I)V
    .locals 0

    .line 10
    iput p2, p0, Lgd1;->ε:I

    iput-object p1, p0, Lgd1;->ζ:Lorg/json/JSONObject;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lgd1;->ε:I

    .line 2
    .line 3
    check-cast p1, Ljava/lang/String;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object p0, p0, Lgd1;->ζ:Lorg/json/JSONObject;

    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 p1, 0x0

    .line 18
    if-eqz p0, :cond_1

    .line 19
    .line 20
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 21
    .line 22
    if-ne p0, v0, :cond_0

    .line 23
    .line 24
    move-object p0, p1

    .line 25
    :cond_0
    if-eqz p0, :cond_1

    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    :cond_1
    return-object p1

    .line 32
    :pswitch_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    iget-object p0, p0, Lgd1;->ζ:Lorg/json/JSONObject;

    .line 36
    .line 37
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    instance-of p1, p0, Ljava/lang/Number;

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    check-cast p0, Ljava/lang/Number;

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    goto :goto_0

    .line 56
    :cond_2
    instance-of p1, p0, Ljava/lang/String;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    check-cast p0, Ljava/lang/String;

    .line 61
    .line 62
    const/16 p1, 0xa

    .line 63
    .line 64
    invoke-static {p0, p1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 p0, 0x0

    .line 70
    :goto_0
    return-object p0

    .line 71
    :pswitch_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p0, p0, Lgd1;->ζ:Lorg/json/JSONObject;

    .line 75
    .line 76
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    instance-of p1, p0, Ljava/lang/Number;

    .line 81
    .line 82
    if-eqz p1, :cond_4

    .line 83
    .line 84
    check-cast p0, Ljava/lang/Number;

    .line 85
    .line 86
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    goto :goto_1

    .line 95
    :cond_4
    instance-of p1, p0, Ljava/lang/String;

    .line 96
    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    check-cast p0, Ljava/lang/String;

    .line 100
    .line 101
    const/16 p1, 0xa

    .line 102
    .line 103
    invoke-static {p0, p1}, Lx02;->Ρ(Ljava/lang/String;I)Ljava/lang/Integer;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    goto :goto_1

    .line 108
    :cond_5
    const/4 p0, 0x0

    .line 109
    :goto_1
    return-object p0

    .line 110
    :pswitch_2
    iget-object p0, p0, Lgd1;->ζ:Lorg/json/JSONObject;

    .line 111
    .line 112
    invoke-virtual {p0, p1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    move-result-object p0

    .line 116
    instance-of v0, p0, Lorg/json/JSONObject;

    .line 117
    .line 118
    if-eqz v0, :cond_6

    .line 119
    .line 120
    const-string p0, "object"

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_6
    instance-of v0, p0, Lorg/json/JSONArray;

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    const-string p0, "array"

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_7
    instance-of v0, p0, Ljava/lang/String;

    .line 131
    .line 132
    if-eqz v0, :cond_8

    .line 133
    .line 134
    const-string p0, "string"

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_8
    instance-of v0, p0, Ljava/lang/Number;

    .line 138
    .line 139
    if-eqz v0, :cond_9

    .line 140
    .line 141
    const-string p0, "number"

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_9
    instance-of v0, p0, Ljava/lang/Boolean;

    .line 145
    .line 146
    if-eqz v0, :cond_a

    .line 147
    .line 148
    const-string p0, "boolean"

    .line 149
    .line 150
    goto :goto_3

    .line 151
    :cond_a
    if-eqz p0, :cond_c

    .line 152
    .line 153
    sget-object v0, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 154
    .line 155
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_b

    .line 160
    .line 161
    goto :goto_2

    .line 162
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p0

    .line 170
    goto :goto_3

    .line 171
    :cond_c
    :goto_2
    const-string p0, "null"

    .line 172
    .line 173
    :goto_3
    const-string v0, ":"

    .line 174
    .line 175
    invoke-static {p1, v0, p0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p0

    .line 179
    return-object p0

    .line 180
    :pswitch_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    iget-object p0, p0, Lgd1;->ζ:Lorg/json/JSONObject;

    .line 184
    .line 185
    invoke-static {p1, p0}, Lkd1;->η(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/Object;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    const/4 p1, 0x0

    .line 190
    sget-object v0, Lkd1;->α:Lkd1;

    .line 191
    .line 192
    invoke-virtual {v0, p1, p0}, Lkd1;->γ(ILjava/lang/Object;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    return-object p0

    .line 197
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
