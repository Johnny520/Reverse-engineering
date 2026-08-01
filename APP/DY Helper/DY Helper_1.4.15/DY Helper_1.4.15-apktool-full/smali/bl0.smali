.class public final synthetic Lbl0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Le80;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Ljava/lang/Object;

.field public final synthetic η:Ljava/lang/Object;

.field public final synthetic θ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p4, p0, Lbl0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lbl0;->ζ:Ljava/lang/Object;

    .line 4
    .line 5
    iput-object p2, p0, Lbl0;->η:Ljava/lang/Object;

    .line 6
    .line 7
    iput-object p3, p0, Lbl0;->θ:Ljava/lang/Object;

    .line 8
    .line 9
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 10
    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lbl0;->ε:I

    .line 2
    .line 3
    const-string v1, "\u8be5\u529f\u80fd\u4ec5\u9650\u5185\u6d4b\u7528\u6237\u4f7f\u7528"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    sget-object v3, Ls62;->α:Ls62;

    .line 7
    .line 8
    iget-object v4, p0, Lbl0;->θ:Ljava/lang/Object;

    .line 9
    .line 10
    iget-object v5, p0, Lbl0;->η:Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p0, p0, Lbl0;->ζ:Ljava/lang/Object;

    .line 13
    .line 14
    packed-switch v0, :pswitch_data_0

    .line 15
    .line 16
    .line 17
    check-cast p0, Landroid/content/Context;

    .line 18
    .line 19
    check-cast v5, Landroid/widget/LinearLayout;

    .line 20
    .line 21
    check-cast v4, Landroid/app/Activity;

    .line 22
    .line 23
    check-cast p1, Ljava/lang/Boolean;

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    check-cast p2, Landroid/widget/Switch;

    .line 30
    .line 31
    sget-object v0, Lbv1;->α:Lbv1;

    .line 32
    .line 33
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    const-string v0, "pet_elf_auto_task_enabled"

    .line 37
    .line 38
    if-eqz p1, :cond_0

    .line 39
    .line 40
    invoke-static {}, Lx9;->η()Z

    .line 41
    .line 42
    .line 43
    move-result v6

    .line 44
    if-nez v6, :cond_0

    .line 45
    .line 46
    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v2}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_0
    invoke-static {v0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 61
    .line 62
    .line 63
    if-eqz p1, :cond_1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_1
    const/16 v2, 0x8

    .line 67
    .line 68
    :goto_0
    invoke-virtual {v5, v2}, Landroid/view/View;->setVisibility(I)V

    .line 69
    .line 70
    .line 71
    if-eqz p1, :cond_2

    .line 72
    .line 73
    invoke-static {v4}, Lpg1;->ι(Landroid/app/Activity;)V

    .line 74
    .line 75
    .line 76
    :cond_2
    :goto_1
    return-object v3

    .line 77
    :pswitch_0
    check-cast p0, Landroid/content/Context;

    .line 78
    .line 79
    check-cast v5, Lod;

    .line 80
    .line 81
    check-cast v4, Landroid/app/Activity;

    .line 82
    .line 83
    check-cast p1, Ljava/lang/Boolean;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    check-cast p2, Landroid/widget/Switch;

    .line 90
    .line 91
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    invoke-static {}, Lx9;->ζ()Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-nez v0, :cond_3

    .line 101
    .line 102
    invoke-virtual {p2, v2}, Landroid/widget/Switch;->setChecked(Z)V

    .line 103
    .line 104
    .line 105
    invoke-static {p0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 110
    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_3
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    invoke-static {}, Lui1;->Α()Z

    .line 117
    .line 118
    .line 119
    move-result p0

    .line 120
    if-nez p0, :cond_4

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_4
    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    .line 124
    .line 125
    .line 126
    move-result p0

    .line 127
    if-eqz p0, :cond_7

    .line 128
    .line 129
    const/4 p2, 0x1

    .line 130
    if-eq p0, p2, :cond_6

    .line 131
    .line 132
    const/4 p2, 0x2

    .line 133
    if-ne p0, p2, :cond_5

    .line 134
    .line 135
    const-string p0, "pet_elf_camp_auto_water"

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    invoke-static {}, Lγ;->κ()V

    .line 139
    .line 140
    .line 141
    const/4 v3, 0x0

    .line 142
    goto :goto_4

    .line 143
    :cond_6
    const-string p0, "pet_elf_camp_auto_plant"

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_7
    const-string p0, "pet_elf_camp_auto_harvest"

    .line 147
    .line 148
    :goto_2
    invoke-static {p0, p1}, Lui1;->Ε(Ljava/lang/String;Z)V

    .line 149
    .line 150
    .line 151
    invoke-static {}, Lxn0;->Ψ()V

    .line 152
    .line 153
    .line 154
    :goto_3
    invoke-static {}, Ldd1;->γ()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    invoke-static {v4, p0}, Ldd1;->ε(Landroid/app/Activity;Z)V

    .line 159
    .line 160
    .line 161
    :goto_4
    return-object v3

    .line 162
    :pswitch_1
    check-cast p0, Ljava/util/LinkedHashSet;

    .line 163
    .line 164
    check-cast v5, Landroid/widget/TextView;

    .line 165
    .line 166
    check-cast v4, Ljava/util/ArrayList;

    .line 167
    .line 168
    check-cast p1, Ljava/lang/Integer;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    check-cast p2, Ljava/lang/Boolean;

    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 176
    .line 177
    .line 178
    move-result p2

    .line 179
    if-eqz p2, :cond_8

    .line 180
    .line 181
    invoke-interface {p0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto :goto_5

    .line 185
    :cond_8
    invoke-interface {p0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 186
    .line 187
    .line 188
    :goto_5
    invoke-interface {p0}, Ljava/util/Set;->isEmpty()Z

    .line 189
    .line 190
    .line 191
    move-result p1

    .line 192
    if-eqz p1, :cond_9

    .line 193
    .line 194
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    const-string p1, "\u9009\u62e9\u56fe\u7247\uff08\u5171 "

    .line 199
    .line 200
    const-string p2, " \u5f20\uff09"

    .line 201
    .line 202
    invoke-static {p1, p0, p2}, Lnx;->ζ(Ljava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p0

    .line 206
    goto :goto_6

    .line 207
    :cond_9
    invoke-interface {p0}, Ljava/util/Set;->size()I

    .line 208
    .line 209
    .line 210
    move-result p0

    .line 211
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 212
    .line 213
    .line 214
    move-result p1

    .line 215
    const-string p2, " / "

    .line 216
    .line 217
    const-string v0, " \u5f20"

    .line 218
    .line 219
    const-string v1, "\u5df2\u9009 "

    .line 220
    .line 221
    invoke-static {v1, p0, p2, p1, v0}, Lnx;->η(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object p0

    .line 225
    :goto_6
    invoke-virtual {v5, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 226
    .line 227
    .line 228
    return-object v3

    .line 229
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
