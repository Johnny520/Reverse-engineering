.class public final synthetic Lhu1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lhu1;->ε:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget p0, p0, Lhu1;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    sget-object v1, Ls62;->α:Ls62;

    .line 5
    .line 6
    packed-switch p0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast p1, Ljava/lang/Integer;

    .line 10
    .line 11
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 12
    .line 13
    .line 14
    check-cast p2, Ljava/lang/String;

    .line 15
    .line 16
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    return-object v1

    .line 20
    :pswitch_0
    check-cast p1, Lg42;

    .line 21
    .line 22
    check-cast p2, Lsp;

    .line 23
    .line 24
    instance-of p0, p2, Lc42;

    .line 25
    .line 26
    if-eqz p0, :cond_0

    .line 27
    .line 28
    check-cast p2, Lc42;

    .line 29
    .line 30
    iget-object p0, p1, Lg42;->α:Lup;

    .line 31
    .line 32
    const-string p0, "Compose:LaunchedEffect"

    .line 33
    .line 34
    invoke-static {p0}, Landroid/os/Trace;->beginSection(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object p0, p1, Lg42;->β:[Ljava/lang/Object;

    .line 38
    .line 39
    iget v0, p1, Lg42;->δ:I

    .line 40
    .line 41
    aput-object v1, p0, v0

    .line 42
    .line 43
    iget-object p0, p1, Lg42;->γ:[Lc42;

    .line 44
    .line 45
    add-int/lit8 v1, v0, 0x1

    .line 46
    .line 47
    iput v1, p1, Lg42;->δ:I

    .line 48
    .line 49
    aput-object p2, p0, v0

    .line 50
    .line 51
    :cond_0
    return-object p1

    .line 52
    :pswitch_1
    check-cast p1, Lc42;

    .line 53
    .line 54
    check-cast p2, Lsp;

    .line 55
    .line 56
    if-eqz p1, :cond_1

    .line 57
    .line 58
    move-object v0, p1

    .line 59
    goto :goto_0

    .line 60
    :cond_1
    instance-of p0, p2, Lc42;

    .line 61
    .line 62
    if-eqz p0, :cond_2

    .line 63
    .line 64
    move-object v0, p2

    .line 65
    check-cast v0, Lc42;

    .line 66
    .line 67
    :cond_2
    :goto_0
    return-object v0

    .line 68
    :pswitch_2
    check-cast p2, Lsp;

    .line 69
    .line 70
    instance-of p0, p2, Lc42;

    .line 71
    .line 72
    if-eqz p0, :cond_6

    .line 73
    .line 74
    instance-of p0, p1, Ljava/lang/Integer;

    .line 75
    .line 76
    if-eqz p0, :cond_3

    .line 77
    .line 78
    move-object v0, p1

    .line 79
    check-cast v0, Ljava/lang/Integer;

    .line 80
    .line 81
    :cond_3
    const/4 p0, 0x1

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    goto :goto_1

    .line 89
    :cond_4
    move p1, p0

    .line 90
    :goto_1
    if-nez p1, :cond_5

    .line 91
    .line 92
    move-object p1, p2

    .line 93
    goto :goto_2

    .line 94
    :cond_5
    add-int/2addr p1, p0

    .line 95
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 96
    .line 97
    .line 98
    move-result-object p1

    .line 99
    :cond_6
    :goto_2
    return-object p1

    .line 100
    :pswitch_3
    check-cast p1, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    check-cast p2, Landroid/widget/Switch;

    .line 107
    .line 108
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    sget-object p1, Lbv1;->α:Lbv1;

    .line 112
    .line 113
    const-string p1, "auto_scroll_article_enabled"

    .line 114
    .line 115
    invoke-static {p1, p0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 116
    .line 117
    .line 118
    return-object v1

    .line 119
    :pswitch_4
    check-cast p1, Ljava/lang/Boolean;

    .line 120
    .line 121
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 122
    .line 123
    .line 124
    move-result p0

    .line 125
    check-cast p2, Landroid/widget/Switch;

    .line 126
    .line 127
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    sget-object p1, Lbv1;->α:Lbv1;

    .line 131
    .line 132
    const-string p1, "auto_scroll_image_enabled"

    .line 133
    .line 134
    invoke-static {p1, p0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 135
    .line 136
    .line 137
    return-object v1

    .line 138
    :pswitch_5
    check-cast p1, Ljava/lang/Boolean;

    .line 139
    .line 140
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 141
    .line 142
    .line 143
    move-result p0

    .line 144
    check-cast p2, Landroid/widget/Switch;

    .line 145
    .line 146
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    sget-object p1, Lbv1;->α:Lbv1;

    .line 150
    .line 151
    const-string p1, "auto_scroll_next_enabled"

    .line 152
    .line 153
    invoke-static {p1, p0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 154
    .line 155
    .line 156
    return-object v1

    .line 157
    :pswitch_6
    check-cast p1, Ljava/lang/Boolean;

    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 160
    .line 161
    .line 162
    move-result p0

    .line 163
    check-cast p2, Landroid/widget/Switch;

    .line 164
    .line 165
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    sget-object p1, Lbv1;->α:Lbv1;

    .line 169
    .line 170
    const-string p1, "seekbar_time_enabled"

    .line 171
    .line 172
    invoke-static {p1, p0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 173
    .line 174
    .line 175
    return-object v1

    .line 176
    :pswitch_7
    check-cast p1, Ljava/lang/Boolean;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 179
    .line 180
    .line 181
    move-result p0

    .line 182
    check-cast p2, Landroid/widget/Switch;

    .line 183
    .line 184
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 185
    .line 186
    .line 187
    sget-object p1, Lbv1;->α:Lbv1;

    .line 188
    .line 189
    const-string p1, "pet_elf_auto_success_toast_enabled"

    .line 190
    .line 191
    invoke-static {p1, p0}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 192
    .line 193
    .line 194
    return-object v1

    .line 195
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
