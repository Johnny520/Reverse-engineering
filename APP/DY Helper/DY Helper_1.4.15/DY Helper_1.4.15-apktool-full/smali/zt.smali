.class public final Lzt;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Lg40;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Lum1;

.field public final synthetic η:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lau;Lum1;Lg40;)V
    .locals 0

    .line 1
    const/4 p1, 0x0

    .line 2
    iput p1, p0, Lzt;->ε:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p2, p0, Lzt;->ζ:Lum1;

    .line 8
    .line 9
    iput-object p3, p0, Lzt;->η:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public constructor <init>(Le80;Lum1;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lzt;->ε:I

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput-object p1, p0, Lzt;->η:Ljava/lang/Object;

    iput-object p2, p0, Lzt;->ζ:Lum1;

    return-void
.end method


# virtual methods
.method public final δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, Lzt;->ε:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    instance-of v0, p2, Ln40;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    move-object v0, p2

    .line 11
    check-cast v0, Ln40;

    .line 12
    .line 13
    iget v1, v0, Ln40;->κ:I

    .line 14
    .line 15
    const/high16 v2, -0x80000000

    .line 16
    .line 17
    and-int v3, v1, v2

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    sub-int/2addr v1, v2

    .line 22
    iput v1, v0, Ln40;->κ:I

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    new-instance v0, Ln40;

    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Ln40;-><init>(Lzt;Lop;)V

    .line 28
    .line 29
    .line 30
    :goto_0
    iget-object p2, v0, Ln40;->ι:Ljava/lang/Object;

    .line 31
    .line 32
    iget v1, v0, Ln40;->κ:I

    .line 33
    .line 34
    const/4 v2, 0x1

    .line 35
    if-eqz v1, :cond_2

    .line 36
    .line 37
    if-ne v1, v2, :cond_1

    .line 38
    .line 39
    iget-object p1, v0, Ln40;->μ:Ljava/lang/Object;

    .line 40
    .line 41
    iget-object p0, v0, Ln40;->θ:Lzt;

    .line 42
    .line 43
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_1
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 48
    .line 49
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    const/4 p0, 0x0

    .line 53
    goto :goto_2

    .line 54
    :cond_2
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    iget-object p2, p0, Lzt;->η:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p2, Le80;

    .line 60
    .line 61
    iput-object p0, v0, Ln40;->θ:Lzt;

    .line 62
    .line 63
    iput-object p1, v0, Ln40;->μ:Ljava/lang/Object;

    .line 64
    .line 65
    iput v2, v0, Ln40;->κ:I

    .line 66
    .line 67
    invoke-interface {p2, p1, v0}, Le80;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v0, Lcq;->ε:Lcq;

    .line 72
    .line 73
    if-ne p2, v0, :cond_3

    .line 74
    .line 75
    move-object p0, v0

    .line 76
    goto :goto_2

    .line 77
    :cond_3
    :goto_1
    check-cast p2, Ljava/lang/Boolean;

    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 80
    .line 81
    .line 82
    move-result p2

    .line 83
    if-nez p2, :cond_4

    .line 84
    .line 85
    sget-object p0, Ls62;->α:Ls62;

    .line 86
    .line 87
    :goto_2
    return-object p0

    .line 88
    :cond_4
    iget-object p2, p0, Lzt;->ζ:Lum1;

    .line 89
    .line 90
    iput-object p1, p2, Lum1;->ε:Ljava/lang/Object;

    .line 91
    .line 92
    new-instance p1, Lδ;

    .line 93
    .line 94
    invoke-direct {p1, p0}, Lδ;-><init>(Lzt;)V

    .line 95
    .line 96
    .line 97
    throw p1

    .line 98
    :pswitch_0
    instance-of v0, p2, Lyt;

    .line 99
    .line 100
    if-eqz v0, :cond_5

    .line 101
    .line 102
    move-object v0, p2

    .line 103
    check-cast v0, Lyt;

    .line 104
    .line 105
    iget v1, v0, Lyt;->κ:I

    .line 106
    .line 107
    const/high16 v2, -0x80000000

    .line 108
    .line 109
    and-int v3, v1, v2

    .line 110
    .line 111
    if-eqz v3, :cond_5

    .line 112
    .line 113
    sub-int/2addr v1, v2

    .line 114
    iput v1, v0, Lyt;->κ:I

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    new-instance v0, Lyt;

    .line 118
    .line 119
    invoke-direct {v0, p0, p2}, Lyt;-><init>(Lzt;Lop;)V

    .line 120
    .line 121
    .line 122
    :goto_3
    iget-object p2, v0, Lyt;->θ:Ljava/lang/Object;

    .line 123
    .line 124
    iget v1, v0, Lyt;->κ:I

    .line 125
    .line 126
    sget-object v2, Ls62;->α:Ls62;

    .line 127
    .line 128
    const/4 v3, 0x1

    .line 129
    if-eqz v1, :cond_7

    .line 130
    .line 131
    if-ne v1, v3, :cond_6

    .line 132
    .line 133
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 134
    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_6
    const-string p0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 138
    .line 139
    invoke-static {p0}, Lγ;->ρ(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    const/4 v2, 0x0

    .line 143
    goto :goto_4

    .line 144
    :cond_7
    invoke-static {p2}, Li81;->Β(Ljava/lang/Object;)V

    .line 145
    .line 146
    .line 147
    iget-object p2, p0, Lzt;->ζ:Lum1;

    .line 148
    .line 149
    iget-object v1, p2, Lum1;->ε:Ljava/lang/Object;

    .line 150
    .line 151
    sget-object v4, Lxb;->ο:Luy;

    .line 152
    .line 153
    if-eq v1, v4, :cond_8

    .line 154
    .line 155
    invoke-static {v1, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 156
    .line 157
    .line 158
    move-result v1

    .line 159
    if-nez v1, :cond_9

    .line 160
    .line 161
    :cond_8
    iput-object p1, p2, Lum1;->ε:Ljava/lang/Object;

    .line 162
    .line 163
    iget-object p0, p0, Lzt;->η:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast p0, Lg40;

    .line 166
    .line 167
    iput v3, v0, Lyt;->κ:I

    .line 168
    .line 169
    invoke-interface {p0, p1, v0}, Lg40;->δ(Ljava/lang/Object;Lop;)Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object p0

    .line 173
    sget-object p1, Lcq;->ε:Lcq;

    .line 174
    .line 175
    if-ne p0, p1, :cond_9

    .line 176
    .line 177
    move-object v2, p1

    .line 178
    :cond_9
    :goto_4
    return-object v2

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
