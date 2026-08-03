.class public final Lda/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:Ljava/lang/Object;

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(Lda/h;Landroid/view/View;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lda/g;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lda/g;->h:Ljava/lang/Object;

    .line 8
    .line 9
    iput-object p2, p0, Lda/g;->i:Ljava/lang/Object;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Ljava/util/Comparator;Ljava/lang/Object;I)V
    .locals 0

    .line 12
    iput p3, p0, Lda/g;->g:I

    iput-object p1, p0, Lda/g;->i:Ljava/lang/Object;

    iput-object p2, p0, Lda/g;->h:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 2

    .line 1
    iget v0, p0, Lda/g;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lda/g;->h:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Ln8/c;

    .line 9
    .line 10
    iget-object v1, p0, Lda/g;->i:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v1, La9/h;

    .line 13
    .line 14
    invoke-virtual {v1, p1, p2}, La9/h;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    check-cast p2, Ljava/lang/reflect/Constructor;

    .line 22
    .line 23
    invoke-static {v0, p2}, Ln8/c;->a(Ln8/c;Ljava/lang/reflect/Constructor;)I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 32
    .line 33
    invoke-static {v0, p1}, Ln8/c;->a(Ln8/c;Ljava/lang/reflect/Constructor;)I

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p2, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    :goto_0
    return v1

    .line 46
    :pswitch_0
    iget-object v0, p0, Lda/g;->h:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lda/h;

    .line 49
    .line 50
    iget-object v1, p0, Lda/g;->i:Ljava/lang/Object;

    .line 51
    .line 52
    check-cast v1, Lda/g;

    .line 53
    .line 54
    invoke-virtual {v1, p1, p2}, Lda/g;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    goto :goto_1

    .line 61
    :cond_1
    check-cast p1, Lda/f;

    .line 62
    .line 63
    iget-object v1, p1, Lda/f;->a:Landroid/view/View;

    .line 64
    .line 65
    iget-object p1, p1, Lda/f;->b:Landroid/widget/TextView;

    .line 66
    .line 67
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    invoke-static {v1, p1}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    invoke-static {p1}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 79
    .line 80
    .line 81
    move-result p1

    .line 82
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    check-cast p2, Lda/f;

    .line 87
    .line 88
    iget-object v0, p2, Lda/f;->a:Landroid/view/View;

    .line 89
    .line 90
    iget-object p2, p2, Lda/f;->b:Landroid/widget/TextView;

    .line 91
    .line 92
    invoke-static {v0, p2}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p2

    .line 96
    invoke-static {p2}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 101
    .line 102
    .line 103
    move-result p2

    .line 104
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 105
    .line 106
    .line 107
    move-result-object p2

    .line 108
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 109
    .line 110
    .line 111
    move-result v1

    .line 112
    :goto_1
    return v1

    .line 113
    :pswitch_1
    check-cast p2, Lda/f;

    .line 114
    .line 115
    iget-object v0, p0, Lda/g;->h:Ljava/lang/Object;

    .line 116
    .line 117
    check-cast v0, Lda/h;

    .line 118
    .line 119
    iget-object v1, p0, Lda/g;->i:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v1, Landroid/view/View;

    .line 122
    .line 123
    invoke-static {v0, v1, p2}, Lda/h;->a(Lda/h;Landroid/view/View;Lda/f;)I

    .line 124
    .line 125
    .line 126
    move-result p2

    .line 127
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    check-cast p1, Lda/f;

    .line 132
    .line 133
    invoke-static {v0, v1, p1}, Lda/h;->a(Lda/h;Landroid/view/View;Lda/f;)I

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
    invoke-virtual {p2, p1}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    return p1

    .line 146
    :pswitch_2
    iget-object v0, p0, Lda/g;->h:Ljava/lang/Object;

    .line 147
    .line 148
    check-cast v0, Lda/h;

    .line 149
    .line 150
    iget-object v1, p0, Lda/g;->i:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v1, Lc9/a0;

    .line 153
    .line 154
    invoke-virtual {v1, p1, p2}, Lc9/a0;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 155
    .line 156
    .line 157
    move-result v1

    .line 158
    if-eqz v1, :cond_2

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_2
    check-cast p1, Lda/e;

    .line 162
    .line 163
    iget-object p1, p1, Lda/e;->a:Lda/f;

    .line 164
    .line 165
    iget-object v1, p1, Lda/f;->a:Landroid/view/View;

    .line 166
    .line 167
    iget-object p1, p1, Lda/f;->b:Landroid/widget/TextView;

    .line 168
    .line 169
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 170
    .line 171
    .line 172
    invoke-static {v1, p1}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object p1

    .line 176
    invoke-static {p1}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 185
    .line 186
    .line 187
    move-result-object p1

    .line 188
    check-cast p2, Lda/e;

    .line 189
    .line 190
    iget-object p2, p2, Lda/e;->a:Lda/f;

    .line 191
    .line 192
    iget-object v0, p2, Lda/f;->a:Landroid/view/View;

    .line 193
    .line 194
    iget-object p2, p2, Lda/f;->b:Landroid/widget/TextView;

    .line 195
    .line 196
    invoke-static {v0, p2}, Lda/h;->r(Landroid/view/View;Landroid/widget/TextView;)Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p2

    .line 200
    invoke-static {p2}, Lda/h;->s(Ljava/lang/String;)Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object p2

    .line 204
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 205
    .line 206
    .line 207
    move-result p2

    .line 208
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 209
    .line 210
    .line 211
    move-result-object p2

    .line 212
    invoke-virtual {p1, p2}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 213
    .line 214
    .line 215
    move-result v1

    .line 216
    :goto_2
    return v1

    .line 217
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
