.class public final synthetic Lf0/l;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Lfg/l;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Lgg/s;

.field public final synthetic i:Lgg/s;


# direct methods
.method public synthetic constructor <init>(Lgg/s;Lgg/s;I)V
    .locals 0

    .line 1
    iput p3, p0, Lf0/l;->g:I

    .line 2
    .line 3
    iput-object p1, p0, Lf0/l;->h:Lgg/s;

    .line 4
    .line 5
    iput-object p2, p0, Lf0/l;->i:Lgg/s;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    iget v0, p0, Lf0/l;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/String;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lf0/l;->h:Lgg/s;

    .line 12
    .line 13
    iget v1, v0, Lgg/s;->g:I

    .line 14
    .line 15
    add-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    iput v1, v0, Lgg/s;->g:I

    .line 18
    .line 19
    const-string v0, "\u5907\u6ce8"

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    iget-object v2, p0, Lf0/l;->i:Lgg/s;

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget p1, v2, Lgg/s;->g:I

    .line 31
    .line 32
    add-int/lit8 p1, p1, 0xc

    .line 33
    .line 34
    iput p1, v2, Lgg/s;->g:I

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const-string v0, "\u6807\u7b7e"

    .line 38
    .line 39
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_1

    .line 44
    .line 45
    iget p1, v2, Lgg/s;->g:I

    .line 46
    .line 47
    add-int/lit8 p1, p1, 0xc

    .line 48
    .line 49
    iput p1, v2, Lgg/s;->g:I

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_1
    const-string v0, "\u7fa4\u804a\u540d\u79f0"

    .line 53
    .line 54
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    iget p1, v2, Lgg/s;->g:I

    .line 61
    .line 62
    add-int/lit8 p1, p1, 0x10

    .line 63
    .line 64
    iput p1, v2, Lgg/s;->g:I

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    const-string v0, "\u67e5\u627e\u804a\u5929\u8bb0\u5f55"

    .line 68
    .line 69
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    iget p1, v2, Lgg/s;->g:I

    .line 76
    .line 77
    add-int/lit8 p1, p1, 0xa

    .line 78
    .line 79
    iput p1, v2, Lgg/s;->g:I

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_3
    const-string v0, "\u804a\u5929\u4fe1\u606f"

    .line 83
    .line 84
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 85
    .line 86
    .line 87
    move-result v0

    .line 88
    if-eqz v0, :cond_4

    .line 89
    .line 90
    iget p1, v2, Lgg/s;->g:I

    .line 91
    .line 92
    add-int/lit8 p1, p1, 0x8

    .line 93
    .line 94
    iput p1, v2, Lgg/s;->g:I

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_4
    const-string v0, "\u8bbe\u7f6e"

    .line 98
    .line 99
    invoke-static {p1, v0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    iget p1, v2, Lgg/s;->g:I

    .line 106
    .line 107
    add-int/lit8 p1, p1, 0x4

    .line 108
    .line 109
    iput p1, v2, Lgg/s;->g:I

    .line 110
    .line 111
    :cond_5
    :goto_0
    sget-object p1, Lsf/n;->a:Lsf/n;

    .line 112
    .line 113
    return-object p1

    .line 114
    :pswitch_0
    check-cast p1, Log/f;

    .line 115
    .line 116
    iget-object v0, p0, Lf0/l;->h:Lgg/s;

    .line 117
    .line 118
    iget v1, v0, Lgg/s;->g:I

    .line 119
    .line 120
    const/4 v2, -0x1

    .line 121
    if-ne v1, v2, :cond_6

    .line 122
    .line 123
    move-object v1, p1

    .line 124
    check-cast v1, Log/i;

    .line 125
    .line 126
    invoke-virtual {v1}, Log/i;->b()Llg/d;

    .line 127
    .line 128
    .line 129
    move-result-object v1

    .line 130
    iget v1, v1, Llg/b;->g:I

    .line 131
    .line 132
    iput v1, v0, Lgg/s;->g:I

    .line 133
    .line 134
    :cond_6
    check-cast p1, Log/i;

    .line 135
    .line 136
    invoke-virtual {p1}, Log/i;->b()Llg/d;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    iget p1, p1, Llg/b;->h:I

    .line 141
    .line 142
    add-int/lit8 p1, p1, 0x1

    .line 143
    .line 144
    iget-object v0, p0, Lf0/l;->i:Lgg/s;

    .line 145
    .line 146
    iput p1, v0, Lgg/s;->g:I

    .line 147
    .line 148
    const-string p1, ""

    .line 149
    .line 150
    return-object p1

    .line 151
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
