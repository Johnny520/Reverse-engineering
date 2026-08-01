.class public final synthetic Lr0/P;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LM0/l;
.implements LM0/a;
.implements Ld0/c;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lr0/P;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget v1, v0, Lr0/P;->a:I

    .line 4
    .line 5
    packed-switch v1, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    :pswitch_0
    move-object/from16 v1, p1

    .line 9
    .line 10
    check-cast v1, Ljava/lang/reflect/Method;

    .line 11
    .line 12
    const-class v2, Ljava/lang/Object;

    .line 13
    .line 14
    const-class v3, Ljava/lang/String;

    .line 15
    .line 16
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 19
    .line 20
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 21
    .line 22
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 23
    .line 24
    sget-object v8, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 25
    .line 26
    const-class v9, Ljava/lang/String;

    .line 27
    .line 28
    sget-object v10, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 31
    .line 32
    sget-object v18, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 33
    .line 34
    move-object v11, v4

    .line 35
    move-object v12, v5

    .line 36
    move-object v13, v10

    .line 37
    move-object v15, v6

    .line 38
    move-object/from16 v16, v7

    .line 39
    .line 40
    move-object/from16 v17, v8

    .line 41
    .line 42
    filled-new-array/range {v2 .. v18}, [Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-static {v2, v3}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    array-length v3, v3

    .line 59
    const/4 v4, 0x0

    .line 60
    const/4 v5, 0x1

    .line 61
    if-ne v3, v5, :cond_0

    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    aget-object v3, v3, v4

    .line 68
    .line 69
    invoke-static {v3, v14}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_0

    .line 74
    .line 75
    if-nez v2, :cond_0

    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 78
    .line 79
    .line 80
    move-result v2

    .line 81
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isPublic(I)Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_0

    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 88
    .line 89
    .line 90
    move-result v1

    .line 91
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-nez v1, :cond_0

    .line 96
    .line 97
    move v4, v5

    .line 98
    :cond_0
    return v4

    .line 99
    :pswitch_1
    move-object/from16 v1, p1

    .line 100
    .line 101
    check-cast v1, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    const-string v3, "rawQuery"

    .line 108
    .line 109
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v2

    .line 113
    if-nez v2, :cond_2

    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v2, "rawQueryWithFactory"

    .line 120
    .line 121
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    move-result v1

    .line 125
    if-eqz v1, :cond_1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_1
    const/4 v1, 0x0

    .line 129
    goto :goto_1

    .line 130
    :cond_2
    :goto_0
    const/4 v1, 0x1

    .line 131
    :goto_1
    return v1

    .line 132
    :pswitch_2
    move-object/from16 v1, p1

    .line 133
    .line 134
    check-cast v1, Ljava/lang/reflect/Method;

    .line 135
    .line 136
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v2

    .line 140
    const-string v3, "onResume"

    .line 141
    .line 142
    invoke-static {v2, v3}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    .line 144
    .line 145
    move-result v2

    .line 146
    if-eqz v2, :cond_3

    .line 147
    .line 148
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const-string v2, "getParameterTypes(...)"

    .line 153
    .line 154
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 155
    .line 156
    .line 157
    array-length v1, v1

    .line 158
    if-nez v1, :cond_3

    .line 159
    .line 160
    const/4 v1, 0x1

    .line 161
    goto :goto_2

    .line 162
    :cond_3
    const/4 v1, 0x0

    .line 163
    :goto_2
    return v1

    .line 164
    :pswitch_3
    move-object/from16 v1, p1

    .line 165
    .line 166
    check-cast v1, Ljava/lang/reflect/Method;

    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    sget-object v3, Lr0/H0;->p0:Ljava/util/Set;

    .line 173
    .line 174
    invoke-interface {v3, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    move-result v2

    .line 178
    const/4 v3, 0x0

    .line 179
    if-eqz v2, :cond_5

    .line 180
    .line 181
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    const-string v2, "getParameterTypes(...)"

    .line 186
    .line 187
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 188
    .line 189
    .line 190
    array-length v2, v1

    .line 191
    move v4, v3

    .line 192
    :goto_3
    if-ge v4, v2, :cond_5

    .line 193
    .line 194
    aget-object v5, v1, v4

    .line 195
    .line 196
    const-class v6, Landroid/content/ContentValues;

    .line 197
    .line 198
    invoke-virtual {v6, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-eqz v5, :cond_4

    .line 203
    .line 204
    const/4 v3, 0x1

    .line 205
    goto :goto_4

    .line 206
    :cond_4
    add-int/lit8 v4, v4, 0x1

    .line 207
    .line 208
    goto :goto_3

    .line 209
    :cond_5
    :goto_4
    return v3

    .line 210
    nop

    .line 211
    :pswitch_data_0
    .packed-switch 0x8
        :pswitch_3
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public b()Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x4

    .line 2
    iget v1, p0, Lr0/P;->a:I

    .line 3
    .line 4
    sparse-switch v1, :sswitch_data_0

    .line 5
    .line 6
    .line 7
    new-instance v1, Landroid/media/AudioAttributes$Builder;

    .line 8
    .line 9
    invoke-direct {v1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v1, v0}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    return-object v0

    .line 25
    :sswitch_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 26
    .line 27
    invoke-static {}, Lz0/g;->D()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0

    .line 36
    :sswitch_1
    sget-boolean v0, Lz0/i;->a:Z

    .line 37
    .line 38
    invoke-static {}, Lz0/g;->C()Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-nez v0, :cond_3

    .line 43
    .line 44
    invoke-static {}, Lz0/g;->s()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsLike()Z

    .line 55
    .line 56
    .line 57
    move-result v0

    .line 58
    if-eqz v0, :cond_0

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_0
    invoke-static {}, Lz0/g;->s()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_1

    .line 66
    .line 67
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getHideSnsCloseFriendPosts()Z

    .line 72
    .line 73
    .line 74
    move-result v0

    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_1
    invoke-static {}, Lz0/g;->A()Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    const/4 v0, 0x0

    .line 86
    goto :goto_1

    .line 87
    :cond_3
    :goto_0
    const/4 v0, 0x1

    .line 88
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    return-object v0

    .line 93
    :sswitch_2
    sget-boolean v0, Lz0/i;->a:Z

    .line 94
    .line 95
    invoke-static {}, Lz0/g;->x()Z

    .line 96
    .line 97
    .line 98
    move-result v0

    .line 99
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    return-object v0

    .line 104
    :sswitch_3
    sget-boolean v0, Lz0/i;->a:Z

    .line 105
    .line 106
    invoke-static {}, Lz0/g;->F()Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    return-object v0

    .line 115
    :sswitch_4
    new-instance v1, Landroid/media/AudioAttributes$Builder;

    .line 116
    .line 117
    invoke-direct {v1}, Landroid/media/AudioAttributes$Builder;-><init>()V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v0}, Landroid/media/AudioAttributes$Builder;->setUsage(I)Landroid/media/AudioAttributes$Builder;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    invoke-virtual {v1, v0}, Landroid/media/AudioAttributes$Builder;->setContentType(I)Landroid/media/AudioAttributes$Builder;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    invoke-virtual {v0}, Landroid/media/AudioAttributes$Builder;->build()Landroid/media/AudioAttributes;

    .line 129
    .line 130
    .line 131
    move-result-object v0

    .line 132
    return-object v0

    .line 133
    :sswitch_5
    sget-boolean v0, Lz0/i;->a:Z

    .line 134
    .line 135
    invoke-static {}, Lz0/g;->x()Z

    .line 136
    .line 137
    .line 138
    move-result v0

    .line 139
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    return-object v0

    .line 144
    :sswitch_6
    sget-boolean v0, Lz0/i;->a:Z

    .line 145
    .line 146
    invoke-static {}, Lz0/g;->x()Z

    .line 147
    .line 148
    .line 149
    move-result v0

    .line 150
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 151
    .line 152
    .line 153
    move-result-object v0

    .line 154
    return-object v0

    .line 155
    :sswitch_7
    sget-boolean v0, Lz0/i;->a:Z

    .line 156
    .line 157
    invoke-static {}, Lz0/g;->x()Z

    .line 158
    .line 159
    .line 160
    move-result v0

    .line 161
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    return-object v0

    .line 166
    nop

    .line 167
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_7
        0x6 -> :sswitch_6
        0x9 -> :sswitch_5
        0xc -> :sswitch_4
        0xd -> :sswitch_3
        0x15 -> :sswitch_2
        0x19 -> :sswitch_1
        0x1b -> :sswitch_0
    .end sparse-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    iget v0, p0, Lr0/P;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    check-cast p1, Ljava/lang/Class;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :pswitch_1
    check-cast p1, Ljava/lang/Class;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :pswitch_2
    check-cast p1, Ljava/lang/Class;

    .line 21
    .line 22
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    return-object p1

    .line 27
    :pswitch_3
    instance-of v0, p1, Landroid/view/View;

    .line 28
    .line 29
    const/4 v1, 0x0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    check-cast p1, Landroid/view/View;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p1, v1

    .line 36
    :goto_0
    if-eqz p1, :cond_1

    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 39
    .line 40
    .line 41
    move-result-object v1

    .line 42
    :cond_1
    return-object v1

    .line 43
    :pswitch_4
    check-cast p1, Ljava/lang/Class;

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    return-object p1

    .line 50
    :pswitch_5
    check-cast p1, LE0/c;

    .line 51
    .line 52
    const-string v0, "<destruct>"

    .line 53
    .line 54
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    iget-object p1, p1, LE0/c;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, Ljava/lang/Number;

    .line 60
    .line 61
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    const/4 v0, 0x4

    .line 66
    if-lt p1, v0, :cond_2

    .line 67
    .line 68
    const/4 p1, 0x1

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 p1, 0x0

    .line 71
    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    return-object p1

    .line 76
    :pswitch_6
    check-cast p1, Ljava/lang/reflect/Method;

    .line 77
    .line 78
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    const-string v1, "getParameterTypes(...)"

    .line 83
    .line 84
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    array-length v0, v0

    .line 88
    if-nez v0, :cond_3

    .line 89
    .line 90
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    move-result v0

    .line 100
    if-eqz v0, :cond_3

    .line 101
    .line 102
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_3

    .line 111
    .line 112
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    const-class v1, Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    if-nez v0, :cond_3

    .line 123
    .line 124
    const-string v5, "onPause"

    .line 125
    .line 126
    const-string v6, "onDestroy"

    .line 127
    .line 128
    const-string v1, "notifyDataSetChanged"

    .line 129
    .line 130
    const-string v2, "notifyDataSetInvalidated"

    .line 131
    .line 132
    const-string v3, "onCreate"

    .line 133
    .line 134
    const-string v4, "onResume"

    .line 135
    .line 136
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p1

    .line 144
    invoke-static {v0, p1}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result p1

    .line 148
    if-nez p1, :cond_3

    .line 149
    .line 150
    const/4 p1, 0x1

    .line 151
    goto :goto_2

    .line 152
    :cond_3
    const/4 p1, 0x0

    .line 153
    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 154
    .line 155
    .line 156
    move-result-object p1

    .line 157
    return-object p1

    .line 158
    :pswitch_7
    check-cast p1, Ljava/lang/Class;

    .line 159
    .line 160
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    return-object p1

    .line 165
    :pswitch_8
    check-cast p1, Ljava/lang/String;

    .line 166
    .line 167
    const-string v0, "it"

    .line 168
    .line 169
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    const-string p1, "?"

    .line 173
    .line 174
    return-object p1

    .line 175
    :pswitch_9
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 176
    .line 177
    const-string v0, "it"

    .line 178
    .line 179
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object p1

    .line 186
    return-object p1

    .line 187
    :pswitch_a
    check-cast p1, Ljava/lang/reflect/Method;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    move-result-object v0

    .line 193
    const-string v1, "getParameterTypes(...)"

    .line 194
    .line 195
    invoke-static {v0, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    array-length v0, v0

    .line 199
    if-nez v0, :cond_4

    .line 200
    .line 201
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v0

    .line 205
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 206
    .line 207
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-nez v0, :cond_4

    .line 212
    .line 213
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    if-nez v0, :cond_4

    .line 222
    .line 223
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 224
    .line 225
    .line 226
    move-result v0

    .line 227
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 228
    .line 229
    .line 230
    move-result v0

    .line 231
    if-nez v0, :cond_4

    .line 232
    .line 233
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 234
    .line 235
    .line 236
    move-result-object v0

    .line 237
    const-class v1, Ljava/lang/Object;

    .line 238
    .line 239
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 240
    .line 241
    .line 242
    move-result v0

    .line 243
    if-nez v0, :cond_4

    .line 244
    .line 245
    const-string v0, "hashCode"

    .line 246
    .line 247
    const-string v1, "toString"

    .line 248
    .line 249
    const-string v2, "getCount"

    .line 250
    .line 251
    const-string v3, "isEmpty"

    .line 252
    .line 253
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v0

    .line 257
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object p1

    .line 261
    invoke-static {v0, p1}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 262
    .line 263
    .line 264
    move-result p1

    .line 265
    if-nez p1, :cond_4

    .line 266
    .line 267
    const/4 p1, 0x1

    .line 268
    goto :goto_3

    .line 269
    :cond_4
    const/4 p1, 0x0

    .line 270
    :goto_3
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    return-object p1

    .line 275
    :pswitch_b
    check-cast p1, Ljava/lang/Class;

    .line 276
    .line 277
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object p1

    .line 281
    return-object p1

    .line 282
    :pswitch_c
    if-eqz p1, :cond_5

    .line 283
    .line 284
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object p1

    .line 288
    goto :goto_4

    .line 289
    :cond_5
    const/4 p1, 0x0

    .line 290
    :goto_4
    if-nez p1, :cond_6

    .line 291
    .line 292
    const-string p1, ""

    .line 293
    .line 294
    :cond_6
    return-object p1

    .line 295
    :pswitch_d
    if-eqz p1, :cond_7

    .line 296
    .line 297
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 298
    .line 299
    .line 300
    move-result-object p1

    .line 301
    goto :goto_5

    .line 302
    :cond_7
    const/4 p1, 0x0

    .line 303
    :goto_5
    if-nez p1, :cond_8

    .line 304
    .line 305
    const-string p1, ""

    .line 306
    .line 307
    :cond_8
    return-object p1

    .line 308
    :pswitch_e
    if-eqz p1, :cond_9

    .line 309
    .line 310
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object p1

    .line 314
    goto :goto_6

    .line 315
    :cond_9
    const/4 p1, 0x0

    .line 316
    :goto_6
    if-nez p1, :cond_a

    .line 317
    .line 318
    const-string p1, ""

    .line 319
    .line 320
    :cond_a
    return-object p1

    .line 321
    :pswitch_f
    check-cast p1, Ljava/lang/String;

    .line 322
    .line 323
    const-string v0, "it"

    .line 324
    .line 325
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    const-string v0, "\'\'"

    .line 329
    .line 330
    const-string v1, "\'"

    .line 331
    .line 332
    invoke-static {p1, v1, v0}, LU0/q;->g0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 333
    .line 334
    .line 335
    move-result-object p1

    .line 336
    invoke-static {v1, p1, v1}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    move-result-object p1

    .line 340
    return-object p1

    .line 341
    :pswitch_10
    check-cast p1, Landroid/content/Context;

    .line 342
    .line 343
    const-string v0, "appContext"

    .line 344
    .line 345
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 346
    .line 347
    .line 348
    const-string p1, "contact_scan_status_v2"

    .line 349
    .line 350
    const/4 v0, 0x1

    .line 351
    invoke-static {p1, v0}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 352
    .line 353
    .line 354
    sget-object p1, LE0/i;->a:LE0/i;

    .line 355
    .line 356
    return-object p1

    .line 357
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_0
        :pswitch_d
        :pswitch_c
        :pswitch_0
        :pswitch_b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method
