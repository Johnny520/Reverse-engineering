.class public final synthetic Lq0/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ld0/c;
.implements LM0/l;
.implements LM0/a;
.implements Lx/b;


# instance fields
.field public final synthetic a:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, Lq0/d;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/reflect/AccessibleObject;)Z
    .locals 5

    .line 1
    iget v0, p0, Lq0/d;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    check-cast p1, Ljava/lang/reflect/Method;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "rawQueryWithFactory"

    .line 13
    .line 14
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    array-length p1, p1

    .line 25
    const/4 v0, 0x4

    .line 26
    if-ne p1, v0, :cond_0

    .line 27
    .line 28
    const/4 p1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    const/4 p1, 0x0

    .line 31
    :goto_0
    return p1

    .line 32
    :sswitch_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 33
    .line 34
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "rawQueryWithFactory"

    .line 39
    .line 40
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_1

    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    array-length p1, p1

    .line 51
    const/4 v0, 0x4

    .line 52
    if-ne p1, v0, :cond_1

    .line 53
    .line 54
    const/4 p1, 0x1

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    const/4 p1, 0x0

    .line 57
    :goto_1
    return p1

    .line 58
    :sswitch_1
    check-cast p1, Ljava/lang/reflect/Method;

    .line 59
    .line 60
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    const-string v1, "callback"

    .line 65
    .line 66
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result v0

    .line 70
    const/4 v1, 0x0

    .line 71
    if-eqz v0, :cond_2

    .line 72
    .line 73
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    array-length v0, v0

    .line 78
    const/4 v2, 0x1

    .line 79
    if-ne v0, v2, :cond_2

    .line 80
    .line 81
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object p1

    .line 85
    aget-object p1, p1, v1

    .line 86
    .line 87
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    const-string v0, "com.tencent.mm.sdk.event.IEvent"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_2

    .line 98
    .line 99
    move v1, v2

    .line 100
    :cond_2
    return v1

    .line 101
    :sswitch_2
    check-cast p1, Ljava/lang/reflect/Method;

    .line 102
    .line 103
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sget-object v1, Lr0/i;->h:Ljava/util/Set;

    .line 108
    .line 109
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    const/4 v1, 0x0

    .line 114
    if-eqz v0, :cond_4

    .line 115
    .line 116
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object p1

    .line 120
    const-string v0, "getParameterTypes(...)"

    .line 121
    .line 122
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    array-length v0, p1

    .line 126
    move v2, v1

    .line 127
    :goto_2
    if-ge v2, v0, :cond_4

    .line 128
    .line 129
    aget-object v3, p1, v2

    .line 130
    .line 131
    const-class v4, Landroid/content/ContentValues;

    .line 132
    .line 133
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-eqz v3, :cond_3

    .line 138
    .line 139
    const/4 v1, 0x1

    .line 140
    goto :goto_3

    .line 141
    :cond_3
    add-int/lit8 v2, v2, 0x1

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_4
    :goto_3
    return v1

    .line 145
    :sswitch_3
    check-cast p1, Ljava/lang/reflect/Method;

    .line 146
    .line 147
    const-string v0, "b"

    .line 148
    .line 149
    const-string v1, "c"

    .line 150
    .line 151
    const-string v2, "d"

    .line 152
    .line 153
    const-string v3, "e"

    .line 154
    .line 155
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object p1

    .line 163
    invoke-static {v0, p1}, LF0/h;->b0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    .line 165
    .line 166
    move-result p1

    .line 167
    return p1

    .line 168
    :sswitch_4
    check-cast p1, Ljava/lang/reflect/Field;

    .line 169
    .line 170
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    const-string v0, "com.tencent.mm.storage."

    .line 179
    .line 180
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 181
    .line 182
    .line 183
    move-result p1

    .line 184
    return p1

    .line 185
    :sswitch_data_0
    .sparse-switch
        0x0 -> :sswitch_4
        0x2 -> :sswitch_3
        0x6 -> :sswitch_2
        0x7 -> :sswitch_1
        0x15 -> :sswitch_0
    .end sparse-switch
.end method

.method public b()Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    iget v2, p0, Lq0/d;->a:I

    .line 4
    .line 5
    sparse-switch v2, :sswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-boolean v0, Lz0/i;->a:Z

    .line 9
    .line 10
    invoke-static {}, Lz0/g;->y()Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    :sswitch_0
    sget-boolean v0, Lz0/i;->a:Z

    .line 20
    .line 21
    invoke-static {}, Lz0/g;->k()Lcom/lu/wxmask/bean/OptionData;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Lcom/lu/wxmask/bean/OptionData;->getChatHistoryQuickUnhideClickCount()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x2

    .line 30
    const/16 v2, 0x8

    .line 31
    .line 32
    invoke-static {v0, v1, v2}, LD/h;->g(III)I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    return-object v0

    .line 41
    :sswitch_1
    invoke-static {}, Lz0/l;->e()Lz0/k;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    iget-object v2, v2, Lz0/k;->b:Ljava/util/List;

    .line 48
    .line 49
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    xor-int/2addr v2, v1

    .line 54
    if-ne v2, v1, :cond_0

    .line 55
    .line 56
    move v0, v1

    .line 57
    :cond_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    return-object v0

    .line 62
    :sswitch_2
    sget-boolean v2, Lz0/i;->a:Z

    .line 63
    .line 64
    invoke-static {}, Lz0/g;->u()Z

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    if-eqz v2, :cond_1

    .line 69
    .line 70
    invoke-static {}, Lz0/l;->c()Ljava/util/Map;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    invoke-interface {v2}, Ljava/util/Map;->isEmpty()Z

    .line 75
    .line 76
    .line 77
    move-result v2

    .line 78
    if-nez v2, :cond_1

    .line 79
    .line 80
    move v0, v1

    .line 81
    :cond_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    return-object v0

    .line 86
    :sswitch_3
    sget-boolean v0, Lz0/i;->a:Z

    .line 87
    .line 88
    invoke-static {}, Lz0/g;->r()Z

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :sswitch_data_0
    .sparse-switch
        0x3 -> :sswitch_3
        0x8 -> :sswitch_2
        0x9 -> :sswitch_1
        0x12 -> :sswitch_0
    .end sparse-switch
.end method

.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    const-string v0, "anti_revoke_scan_status"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "/"

    .line 5
    .line 6
    const-string v3, "#"

    .line 7
    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x2

    .line 10
    const-string v6, "appContext"

    .line 11
    .line 12
    const/4 v7, 0x1

    .line 13
    const-string v8, "it"

    .line 14
    .line 15
    iget v9, p0, Lq0/d;->a:I

    .line 16
    .line 17
    packed-switch v9, :pswitch_data_0

    .line 18
    .line 19
    .line 20
    :pswitch_0
    check-cast p1, LA0/O;

    .line 21
    .line 22
    invoke-static {p1, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    iget-object v1, p1, LA0/O;->a:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p1, LA0/O;->c:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    iget-object p1, p1, LA0/O;->b:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    :pswitch_1
    check-cast p1, Ljava/lang/Class;

    .line 57
    .line 58
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    return-object p1

    .line 63
    :pswitch_2
    check-cast p1, Lr0/S;

    .line 64
    .line 65
    invoke-static {p1, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    new-instance v0, Ljava/lang/StringBuilder;

    .line 69
    .line 70
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 71
    .line 72
    .line 73
    iget-object v1, p1, Lr0/S;->a:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    iget-object v1, p1, Lr0/S;->c:Ljava/lang/String;

    .line 82
    .line 83
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    iget-object p1, p1, Lr0/S;->b:Ljava/lang/String;

    .line 90
    .line 91
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p1

    .line 98
    return-object p1

    .line 99
    :pswitch_3
    check-cast p1, Ljava/lang/Class;

    .line 100
    .line 101
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    return-object p1

    .line 106
    :pswitch_4
    check-cast p1, Ljava/lang/Class;

    .line 107
    .line 108
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    return-object p1

    .line 113
    :pswitch_5
    check-cast p1, Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {p1, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance v0, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string v1, "\""

    .line 121
    .line 122
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    return-object p1

    .line 136
    :pswitch_6
    check-cast p1, Ljava/lang/String;

    .line 137
    .line 138
    invoke-static {p1, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    xor-int/2addr p1, v7

    .line 146
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 147
    .line 148
    .line 149
    move-result-object p1

    .line 150
    return-object p1

    .line 151
    :pswitch_7
    check-cast p1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 152
    .line 153
    invoke-static {p1, v8}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {p1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object p1

    .line 160
    invoke-static {p1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 161
    .line 162
    .line 163
    move-result-object p1

    .line 164
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object p1

    .line 168
    return-object p1

    .line 169
    :pswitch_8
    check-cast p1, Ljava/lang/Class;

    .line 170
    .line 171
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 172
    .line 173
    .line 174
    move-result-object p1

    .line 175
    return-object p1

    .line 176
    :pswitch_9
    check-cast p1, Ljava/lang/Class;

    .line 177
    .line 178
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object p1

    .line 182
    return-object p1

    .line 183
    :pswitch_a
    check-cast p1, Ljava/lang/Class;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    return-object p1

    .line 190
    :pswitch_b
    check-cast p1, Ljava/lang/Class;

    .line 191
    .line 192
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object p1

    .line 196
    return-object p1

    .line 197
    :pswitch_c
    check-cast p1, Landroid/content/Context;

    .line 198
    .line 199
    invoke-static {p1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 200
    .line 201
    .line 202
    invoke-static {}, LA0/k;->a()Z

    .line 203
    .line 204
    .line 205
    move-result v0

    .line 206
    if-nez v0, :cond_0

    .line 207
    .line 208
    goto :goto_4

    .line 209
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    if-eqz v0, :cond_1

    .line 214
    .line 215
    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 216
    .line 217
    goto :goto_0

    .line 218
    :cond_1
    move-object v0, v1

    .line 219
    :goto_0
    if-eqz v0, :cond_5

    .line 220
    .line 221
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 222
    .line 223
    .line 224
    move-result v2

    .line 225
    if-eqz v2, :cond_2

    .line 226
    .line 227
    goto :goto_3

    .line 228
    :cond_2
    :try_start_0
    new-instance v2, LA0/h;

    .line 229
    .line 230
    invoke-direct {v2, p1, v5}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 231
    .line 232
    .line 233
    invoke-static {v0, v2}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 234
    .line 235
    .line 236
    move-result-object p1

    .line 237
    check-cast p1, Lz0/k;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 238
    .line 239
    goto :goto_1

    .line 240
    :catchall_0
    move-exception p1

    .line 241
    new-instance v0, LE0/d;

    .line 242
    .line 243
    invoke-direct {v0, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 244
    .line 245
    .line 246
    move-object p1, v0

    .line 247
    :goto_1
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 248
    .line 249
    .line 250
    move-result-object v0

    .line 251
    if-eqz v0, :cond_3

    .line 252
    .line 253
    const-string v2, "custom avatar dexkit resolve fail"

    .line 254
    .line 255
    filled-new-array {v2, v0}, [Ljava/lang/Object;

    .line 256
    .line 257
    .line 258
    move-result-object v0

    .line 259
    invoke-static {v0}, Li0/a;->d([Ljava/lang/Object;)V

    .line 260
    .line 261
    .line 262
    :cond_3
    instance-of v0, p1, LE0/d;

    .line 263
    .line 264
    if-eqz v0, :cond_4

    .line 265
    .line 266
    goto :goto_2

    .line 267
    :cond_4
    move-object v1, p1

    .line 268
    :goto_2
    check-cast v1, Lz0/k;

    .line 269
    .line 270
    goto :goto_4

    .line 271
    :cond_5
    :goto_3
    const-string p1, "custom avatar dexkit apk path empty"

    .line 272
    .line 273
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 274
    .line 275
    .line 276
    move-result-object p1

    .line 277
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 278
    .line 279
    .line 280
    :goto_4
    if-eqz v1, :cond_7

    .line 281
    .line 282
    sget-object p1, Lz0/l;->a:Landroid/util/LruCache;

    .line 283
    .line 284
    new-instance p1, Lorg/json/JSONObject;

    .line 285
    .line 286
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 287
    .line 288
    .line 289
    invoke-static {}, Lz0/r;->p()I

    .line 290
    .line 291
    .line 292
    move-result v0

    .line 293
    const-string v2, "versionCode"

    .line 294
    .line 295
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 296
    .line 297
    .line 298
    move-result-object p1

    .line 299
    invoke-static {}, Lz0/r;->q()Ljava/lang/String;

    .line 300
    .line 301
    .line 302
    move-result-object v0

    .line 303
    const-string v2, "versionName"

    .line 304
    .line 305
    invoke-virtual {p1, v2, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 306
    .line 307
    .line 308
    move-result-object p1

    .line 309
    iget-object v0, v1, Lz0/k;->a:Ljava/util/List;

    .line 310
    .line 311
    invoke-static {v0}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 316
    .line 317
    .line 318
    move-result-object v2

    .line 319
    invoke-static {v2}, Lz0/l;->h(Ljava/util/List;)Lorg/json/JSONArray;

    .line 320
    .line 321
    .line 322
    move-result-object v2

    .line 323
    const-string v3, "loadMethods"

    .line 324
    .line 325
    invoke-virtual {p1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 326
    .line 327
    .line 328
    move-result-object p1

    .line 329
    iget-object v1, v1, Lz0/k;->b:Ljava/util/List;

    .line 330
    .line 331
    invoke-static {v1}, LF0/k;->A0(Ljava/util/Collection;)Ljava/util/Set;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    invoke-static {v2}, LF0/k;->w0(Ljava/lang/Iterable;)Ljava/util/List;

    .line 336
    .line 337
    .line 338
    move-result-object v2

    .line 339
    invoke-static {v2}, Lz0/l;->h(Ljava/util/List;)Lorg/json/JSONArray;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    const-string v3, "hdGalleryMethods"

    .line 344
    .line 345
    invoke-virtual {p1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 346
    .line 347
    .line 348
    move-result-object p1

    .line 349
    const-string v2, "updatedAt"

    .line 350
    .line 351
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 352
    .line 353
    .line 354
    move-result-wide v5

    .line 355
    invoke-virtual {p1, v2, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 356
    .line 357
    .line 358
    move-result-object p1

    .line 359
    sget-boolean v2, Lz0/i;->a:Z

    .line 360
    .line 361
    invoke-static {}, Lz0/g;->n()Landroid/content/SharedPreferences;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 366
    .line 367
    .line 368
    move-result-object v2

    .line 369
    const-string v3, "custom_local_avatar_methods"

    .line 370
    .line 371
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object p1

    .line 375
    invoke-interface {v2, v3, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 376
    .line 377
    .line 378
    move-result-object p1

    .line 379
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->commit()Z

    .line 380
    .line 381
    .line 382
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 383
    .line 384
    .line 385
    move-result p1

    .line 386
    if-nez p1, :cond_6

    .line 387
    .line 388
    new-instance p1, LA0/t;

    .line 389
    .line 390
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 391
    .line 392
    .line 393
    move-result v0

    .line 394
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 395
    .line 396
    .line 397
    move-result v1

    .line 398
    new-instance v2, Ljava/lang/StringBuilder;

    .line 399
    .line 400
    const-string v3, "\u5934\u50cf\u52a0\u8f7d "

    .line 401
    .line 402
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 403
    .line 404
    .line 405
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 406
    .line 407
    .line 408
    const-string v0, " \u9879\uff0c\u5927\u5934\u50cf "

    .line 409
    .line 410
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 411
    .line 412
    .line 413
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 414
    .line 415
    .line 416
    const-string v0, " \u9879"

    .line 417
    .line 418
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 419
    .line 420
    .line 421
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v0

    .line 425
    invoke-direct {p1, v7, v0, v7}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 426
    .line 427
    .line 428
    goto :goto_5

    .line 429
    :cond_6
    new-instance p1, LA0/t;

    .line 430
    .line 431
    const-string v0, "\u672a\u627e\u5230\u9ad8\u6e05\u5934\u50cf\u9875 Hook \u70b9"

    .line 432
    .line 433
    invoke-direct {p1, v4, v0, v7}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 434
    .line 435
    .line 436
    goto :goto_5

    .line 437
    :cond_7
    new-instance p1, LA0/t;

    .line 438
    .line 439
    const-string v0, "\u672a\u627e\u5230\u672c\u5730\u5934\u50cf Hook \u70b9"

    .line 440
    .line 441
    invoke-direct {p1, v4, v0, v7}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 442
    .line 443
    .line 444
    :goto_5
    return-object p1

    .line 445
    :pswitch_d
    check-cast p1, Landroid/content/Context;

    .line 446
    .line 447
    invoke-static {p1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 448
    .line 449
    .line 450
    invoke-static {v0, v7}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 451
    .line 452
    .line 453
    sget-object p1, LE0/i;->a:LE0/i;

    .line 454
    .line 455
    return-object p1

    .line 456
    :pswitch_e
    check-cast p1, Landroid/content/Context;

    .line 457
    .line 458
    invoke-static {p1, v6}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 459
    .line 460
    .line 461
    invoke-static {p1}, LA0/l;->c(Landroid/content/Context;)LA0/b;

    .line 462
    .line 463
    .line 464
    move-result-object v2

    .line 465
    if-nez v2, :cond_e

    .line 466
    .line 467
    invoke-static {}, LA0/k;->a()Z

    .line 468
    .line 469
    .line 470
    move-result v2

    .line 471
    if-nez v2, :cond_8

    .line 472
    .line 473
    :goto_6
    move-object v2, v1

    .line 474
    goto :goto_a

    .line 475
    :cond_8
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    if-eqz v2, :cond_9

    .line 480
    .line 481
    iget-object v2, v2, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 482
    .line 483
    goto :goto_7

    .line 484
    :cond_9
    move-object v2, v1

    .line 485
    :goto_7
    if-eqz v2, :cond_d

    .line 486
    .line 487
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 488
    .line 489
    .line 490
    move-result v3

    .line 491
    if-eqz v3, :cond_a

    .line 492
    .line 493
    goto :goto_9

    .line 494
    :cond_a
    :try_start_1
    new-instance v3, LA0/a;

    .line 495
    .line 496
    invoke-direct {v3, v7}, LA0/a;-><init>(I)V

    .line 497
    .line 498
    .line 499
    invoke-static {v2, v3}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 500
    .line 501
    .line 502
    move-result-object v2

    .line 503
    check-cast v2, LA0/b;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 504
    .line 505
    goto :goto_8

    .line 506
    :catchall_1
    move-exception v2

    .line 507
    new-instance v3, LE0/d;

    .line 508
    .line 509
    invoke-direct {v3, v2}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 510
    .line 511
    .line 512
    move-object v2, v3

    .line 513
    :goto_8
    invoke-static {v2}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 514
    .line 515
    .line 516
    move-result-object v3

    .line 517
    if-eqz v3, :cond_b

    .line 518
    .line 519
    const-string v6, "anti revoke dexkit resolve fail"

    .line 520
    .line 521
    filled-new-array {v6, v3}, [Ljava/lang/Object;

    .line 522
    .line 523
    .line 524
    move-result-object v3

    .line 525
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 526
    .line 527
    .line 528
    :cond_b
    instance-of v3, v2, LE0/d;

    .line 529
    .line 530
    if-eqz v3, :cond_c

    .line 531
    .line 532
    move-object v2, v1

    .line 533
    :cond_c
    check-cast v2, LA0/b;

    .line 534
    .line 535
    goto :goto_a

    .line 536
    :cond_d
    :goto_9
    const-string v2, "anti revoke dexkit apk path empty"

    .line 537
    .line 538
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 539
    .line 540
    .line 541
    move-result-object v2

    .line 542
    invoke-static {v2}, Li0/a;->d([Ljava/lang/Object;)V

    .line 543
    .line 544
    .line 545
    goto :goto_6

    .line 546
    :cond_e
    :goto_a
    invoke-static {p1}, LA0/l;->d(Landroid/content/Context;)LA0/c;

    .line 547
    .line 548
    .line 549
    move-result-object v3

    .line 550
    if-nez v3, :cond_15

    .line 551
    .line 552
    invoke-static {}, LA0/k;->a()Z

    .line 553
    .line 554
    .line 555
    move-result v3

    .line 556
    if-nez v3, :cond_f

    .line 557
    .line 558
    :goto_b
    move-object v3, v1

    .line 559
    goto :goto_f

    .line 560
    :cond_f
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 561
    .line 562
    .line 563
    move-result-object v3

    .line 564
    if-eqz v3, :cond_10

    .line 565
    .line 566
    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 567
    .line 568
    goto :goto_c

    .line 569
    :cond_10
    move-object v3, v1

    .line 570
    :goto_c
    if-eqz v3, :cond_14

    .line 571
    .line 572
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 573
    .line 574
    .line 575
    move-result v6

    .line 576
    if-eqz v6, :cond_11

    .line 577
    .line 578
    goto :goto_e

    .line 579
    :cond_11
    :try_start_2
    new-instance v6, LA0/a;

    .line 580
    .line 581
    invoke-direct {v6, v4}, LA0/a;-><init>(I)V

    .line 582
    .line 583
    .line 584
    invoke-static {v3, v6}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 585
    .line 586
    .line 587
    move-result-object v3

    .line 588
    check-cast v3, LA0/c;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 589
    .line 590
    goto :goto_d

    .line 591
    :catchall_2
    move-exception v3

    .line 592
    new-instance v6, LE0/d;

    .line 593
    .line 594
    invoke-direct {v6, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 595
    .line 596
    .line 597
    move-object v3, v6

    .line 598
    :goto_d
    invoke-static {v3}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 599
    .line 600
    .line 601
    move-result-object v6

    .line 602
    if-eqz v6, :cond_12

    .line 603
    .line 604
    const-string v8, "anti revoke storage dexkit resolve fail"

    .line 605
    .line 606
    filled-new-array {v8, v6}, [Ljava/lang/Object;

    .line 607
    .line 608
    .line 609
    move-result-object v6

    .line 610
    invoke-static {v6}, Li0/a;->d([Ljava/lang/Object;)V

    .line 611
    .line 612
    .line 613
    :cond_12
    instance-of v6, v3, LE0/d;

    .line 614
    .line 615
    if-eqz v6, :cond_13

    .line 616
    .line 617
    move-object v3, v1

    .line 618
    :cond_13
    check-cast v3, LA0/c;

    .line 619
    .line 620
    goto :goto_f

    .line 621
    :cond_14
    :goto_e
    const-string v3, "anti revoke storage dexkit apk path empty"

    .line 622
    .line 623
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    invoke-static {v3}, Li0/a;->d([Ljava/lang/Object;)V

    .line 628
    .line 629
    .line 630
    goto :goto_b

    .line 631
    :cond_15
    :goto_f
    invoke-static {p1}, LA0/l;->q(Landroid/content/Context;)LA0/d;

    .line 632
    .line 633
    .line 634
    move-result-object v6

    .line 635
    if-nez v6, :cond_1c

    .line 636
    .line 637
    invoke-static {}, LA0/k;->a()Z

    .line 638
    .line 639
    .line 640
    move-result v6

    .line 641
    if-nez v6, :cond_16

    .line 642
    .line 643
    goto :goto_14

    .line 644
    :cond_16
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 645
    .line 646
    .line 647
    move-result-object p1

    .line 648
    if-eqz p1, :cond_17

    .line 649
    .line 650
    iget-object p1, p1, Landroid/content/pm/ApplicationInfo;->sourceDir:Ljava/lang/String;

    .line 651
    .line 652
    goto :goto_10

    .line 653
    :cond_17
    move-object p1, v1

    .line 654
    :goto_10
    if-eqz p1, :cond_1b

    .line 655
    .line 656
    invoke-static {p1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 657
    .line 658
    .line 659
    move-result v6

    .line 660
    if-eqz v6, :cond_18

    .line 661
    .line 662
    goto :goto_13

    .line 663
    :cond_18
    :try_start_3
    new-instance v6, LA0/a;

    .line 664
    .line 665
    invoke-direct {v6, v5}, LA0/a;-><init>(I)V

    .line 666
    .line 667
    .line 668
    invoke-static {p1, v6}, LA0/l;->B(Ljava/lang/String;LM0/l;)Ljava/lang/Object;

    .line 669
    .line 670
    .line 671
    move-result-object p1

    .line 672
    check-cast p1, LA0/d;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 673
    .line 674
    goto :goto_11

    .line 675
    :catchall_3
    move-exception p1

    .line 676
    new-instance v6, LE0/d;

    .line 677
    .line 678
    invoke-direct {v6, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 679
    .line 680
    .line 681
    move-object p1, v6

    .line 682
    :goto_11
    invoke-static {p1}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 683
    .line 684
    .line 685
    move-result-object v6

    .line 686
    if-eqz v6, :cond_19

    .line 687
    .line 688
    const-string v8, "xml parser dexkit resolve fail"

    .line 689
    .line 690
    filled-new-array {v8, v6}, [Ljava/lang/Object;

    .line 691
    .line 692
    .line 693
    move-result-object v6

    .line 694
    invoke-static {v6}, Li0/a;->d([Ljava/lang/Object;)V

    .line 695
    .line 696
    .line 697
    :cond_19
    instance-of v6, p1, LE0/d;

    .line 698
    .line 699
    if-eqz v6, :cond_1a

    .line 700
    .line 701
    goto :goto_12

    .line 702
    :cond_1a
    move-object v1, p1

    .line 703
    :goto_12
    check-cast v1, LA0/d;

    .line 704
    .line 705
    goto :goto_14

    .line 706
    :cond_1b
    :goto_13
    const-string p1, "xml parser dexkit apk path empty"

    .line 707
    .line 708
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 709
    .line 710
    .line 711
    move-result-object p1

    .line 712
    invoke-static {p1}, Li0/a;->d([Ljava/lang/Object;)V

    .line 713
    .line 714
    .line 715
    :goto_14
    move-object v6, v1

    .line 716
    :cond_1c
    if-eqz v2, :cond_1d

    .line 717
    .line 718
    if-eqz v3, :cond_1d

    .line 719
    .line 720
    if-eqz v6, :cond_1d

    .line 721
    .line 722
    new-instance p1, Lorg/json/JSONObject;

    .line 723
    .line 724
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 725
    .line 726
    .line 727
    const-string v1, "className"

    .line 728
    .line 729
    iget-object v8, v2, LA0/b;->a:Ljava/lang/String;

    .line 730
    .line 731
    invoke-virtual {p1, v1, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 732
    .line 733
    .line 734
    move-result-object p1

    .line 735
    const-string v8, "methodName"

    .line 736
    .line 737
    iget-object v9, v2, LA0/b;->b:Ljava/lang/String;

    .line 738
    .line 739
    invoke-virtual {p1, v8, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 740
    .line 741
    .line 742
    move-result-object p1

    .line 743
    const-string v9, "methodSign"

    .line 744
    .line 745
    iget-object v2, v2, LA0/b;->c:Ljava/lang/String;

    .line 746
    .line 747
    invoke-virtual {p1, v9, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 748
    .line 749
    .line 750
    move-result-object p1

    .line 751
    const-string v2, "put(...)"

    .line 752
    .line 753
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 754
    .line 755
    .line 756
    invoke-static {p1, v5}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 757
    .line 758
    .line 759
    move-result-object p1

    .line 760
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 761
    .line 762
    .line 763
    move-result-object v10

    .line 764
    const-string v11, "hook_point_cache"

    .line 765
    .line 766
    invoke-virtual {v10, v11, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 767
    .line 768
    .line 769
    move-result-object v10

    .line 770
    const-string v12, "getSharedPreferences(...)"

    .line 771
    .line 772
    invoke-static {v10, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 773
    .line 774
    .line 775
    invoke-interface {v10}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 776
    .line 777
    .line 778
    move-result-object v10

    .line 779
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 780
    .line 781
    .line 782
    move-result-object p1

    .line 783
    const-string v13, "anti_revoke_revoke_method"

    .line 784
    .line 785
    invoke-interface {v10, v13, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 786
    .line 787
    .line 788
    move-result-object p1

    .line 789
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 790
    .line 791
    .line 792
    new-instance p1, Lorg/json/JSONObject;

    .line 793
    .line 794
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 795
    .line 796
    .line 797
    iget-object v10, v3, LA0/c;->a:Ljava/lang/String;

    .line 798
    .line 799
    invoke-virtual {p1, v1, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 800
    .line 801
    .line 802
    move-result-object p1

    .line 803
    iget-object v10, v3, LA0/c;->b:Ljava/lang/String;

    .line 804
    .line 805
    invoke-virtual {p1, v8, v10}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 806
    .line 807
    .line 808
    move-result-object p1

    .line 809
    iget-object v3, v3, LA0/c;->c:Ljava/lang/String;

    .line 810
    .line 811
    invoke-virtual {p1, v9, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 812
    .line 813
    .line 814
    move-result-object p1

    .line 815
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 816
    .line 817
    .line 818
    invoke-static {p1, v5}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 819
    .line 820
    .line 821
    move-result-object p1

    .line 822
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 823
    .line 824
    .line 825
    move-result-object v3

    .line 826
    invoke-virtual {v3, v11, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 827
    .line 828
    .line 829
    move-result-object v3

    .line 830
    invoke-static {v3, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 831
    .line 832
    .line 833
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 834
    .line 835
    .line 836
    move-result-object v3

    .line 837
    const-string v10, "anti_revoke_message_storage_method_v1"

    .line 838
    .line 839
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 840
    .line 841
    .line 842
    move-result-object p1

    .line 843
    invoke-interface {v3, v10, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 844
    .line 845
    .line 846
    move-result-object p1

    .line 847
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 848
    .line 849
    .line 850
    new-instance p1, Lorg/json/JSONObject;

    .line 851
    .line 852
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 853
    .line 854
    .line 855
    iget-object v3, v6, LA0/d;->a:Ljava/lang/String;

    .line 856
    .line 857
    invoke-virtual {p1, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 858
    .line 859
    .line 860
    move-result-object p1

    .line 861
    iget-object v1, v6, LA0/d;->b:Ljava/lang/String;

    .line 862
    .line 863
    invoke-virtual {p1, v8, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 864
    .line 865
    .line 866
    move-result-object p1

    .line 867
    iget-object v1, v6, LA0/d;->c:Ljava/lang/String;

    .line 868
    .line 869
    invoke-virtual {p1, v9, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 870
    .line 871
    .line 872
    move-result-object p1

    .line 873
    invoke-static {p1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 874
    .line 875
    .line 876
    invoke-static {p1, v5}, LA0/l;->v(Lorg/json/JSONObject;I)Lorg/json/JSONObject;

    .line 877
    .line 878
    .line 879
    move-result-object p1

    .line 880
    invoke-static {}, Lb1/h;->x()Landroid/content/Context;

    .line 881
    .line 882
    .line 883
    move-result-object v1

    .line 884
    invoke-virtual {v1, v11, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 885
    .line 886
    .line 887
    move-result-object v1

    .line 888
    invoke-static {v1, v12}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 889
    .line 890
    .line 891
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 892
    .line 893
    .line 894
    move-result-object v1

    .line 895
    const-string v2, "wechat_xml_parser_method_v1"

    .line 896
    .line 897
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 898
    .line 899
    .line 900
    move-result-object p1

    .line 901
    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 902
    .line 903
    .line 904
    move-result-object p1

    .line 905
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 906
    .line 907
    .line 908
    invoke-static {v0, v7}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 909
    .line 910
    .line 911
    new-instance p1, LA0/t;

    .line 912
    .line 913
    const-string v0, "\u9632\u64a4\u56de\u9002\u914d\u6210\u529f"

    .line 914
    .line 915
    invoke-direct {p1, v7, v0, v7}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 916
    .line 917
    .line 918
    goto :goto_15

    .line 919
    :cond_1d
    invoke-static {v0, v4}, LA0/l;->s(Ljava/lang/String;Z)V

    .line 920
    .line 921
    .line 922
    new-instance p1, LA0/t;

    .line 923
    .line 924
    const-string v0, "\u672a\u627e\u5230\u53ef\u7528 Hook \u70b9"

    .line 925
    .line 926
    invoke-direct {p1, v4, v0, v7}, LA0/t;-><init>(ZLjava/lang/String;Z)V

    .line 927
    .line 928
    .line 929
    :goto_15
    return-object p1

    .line 930
    :pswitch_f
    check-cast p1, Ljava/lang/Class;

    .line 931
    .line 932
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 933
    .line 934
    .line 935
    move-result-object p1

    .line 936
    return-object p1

    .line 937
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_f
        :pswitch_0
        :pswitch_0
        :pswitch_e
        :pswitch_d
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_7
        :pswitch_6
        :pswitch_0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method public test(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    iget v0, p0, Lq0/d;->a:I

    .line 2
    .line 3
    check-cast p1, Landroid/view/View;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    instance-of v0, p1, Landroid/widget/EditText;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    if-nez p1, :cond_0

    .line 17
    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    :goto_0
    return p1

    .line 22
    :pswitch_0
    instance-of v0, p1, Landroid/widget/EditText;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-nez p1, :cond_1

    .line 31
    .line 32
    const/4 p1, 0x1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    const/4 p1, 0x0

    .line 35
    :goto_1
    return p1

    .line 36
    :pswitch_1
    instance-of p1, p1, Landroid/widget/EditText;

    .line 37
    .line 38
    return p1

    .line 39
    :pswitch_data_0
    .packed-switch 0xf
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
