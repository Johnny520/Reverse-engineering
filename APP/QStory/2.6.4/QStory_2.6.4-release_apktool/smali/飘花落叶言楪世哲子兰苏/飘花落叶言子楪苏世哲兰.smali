.class public final L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public final 飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

.field public final synthetic 飘花落叶言子楪世苏哲兰:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "mIntent"

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    check-cast v2, Landroid/content/Intent;

    .line 20
    .line 21
    new-instance v3, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v4, "handleMessage: target wrapper ="

    .line 24
    .line 25
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    const-string v4, "ParasiticsUtils:"

    .line 36
    .line 37
    invoke-static {v4, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    const/4 v3, 0x0

    .line 41
    :try_start_0
    const-class v4, Landroid/content/Intent;

    .line 42
    .line 43
    const-string v5, "mExtras"

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 46
    .line 47
    .line 48
    move-result-object v4

    .line 49
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Landroid/os/Bundle;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catch_0
    move-object v4, v3

    .line 60
    :goto_0
    if-eqz v4, :cond_1

    .line 61
    .line 62
    sget-object v5, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

    .line 63
    .line 64
    invoke-virtual {v4, v5}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 65
    .line 66
    .line 67
    sget-object v4, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v2, v4}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    invoke-virtual {v2, v4}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Landroid/content/Intent;

    .line 80
    .line 81
    invoke-virtual {v0, p1, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 85
    .line 86
    const/16 v0, 0x1f

    .line 87
    .line 88
    if-lt p1, v0, :cond_1

    .line 89
    .line 90
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    const-string v0, "getActivityToken"

    .line 95
    .line 96
    invoke-virtual {p1, v0, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 97
    .line 98
    .line 99
    move-result-object p1

    .line 100
    invoke-virtual {p1, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    check-cast p0, Landroid/os/IBinder;

    .line 105
    .line 106
    const-string p1, "android.app.ActivityThread"

    .line 107
    .line 108
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object p1

    .line 112
    const-string v0, "currentActivityThread"

    .line 113
    .line 114
    invoke-virtual {p1, v0, v3}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v3, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    :try_start_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v0

    .line 129
    const-string v3, "getLaunchingActivity"

    .line 130
    .line 131
    const-class v4, Landroid/os/IBinder;

    .line 132
    .line 133
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v4

    .line 137
    invoke-virtual {v0, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 138
    .line 139
    .line 140
    move-result-object v0

    .line 141
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    invoke-virtual {v0, p1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-eqz p0, :cond_1

    .line 150
    .line 151
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 152
    .line 153
    .line 154
    move-result-object p1

    .line 155
    const-string v0, "intent"

    .line 156
    .line 157
    invoke-virtual {p1, v0}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 165
    .line 166
    .line 167
    goto :goto_1

    .line 168
    :catch_1
    move-exception p0

    .line 169
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 170
    .line 171
    const/16 v0, 0x21

    .line 172
    .line 173
    if-ne p1, v0, :cond_0

    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_0
    throw p0

    .line 177
    :cond_1
    :goto_1
    return-void
.end method


# virtual methods
.method public final handleMessage(Landroid/os/Message;)Z
    .locals 8

    .line 1
    iget v0, p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x0

    .line 6
    packed-switch v0, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    iget v0, p1, Landroid/os/Message;->what:I

    .line 10
    .line 11
    const/16 v4, 0x64

    .line 12
    .line 13
    if-eq v0, v4, :cond_3

    .line 14
    .line 15
    const/16 v4, 0x9f

    .line 16
    .line 17
    if-eq v0, v4, :cond_0

    .line 18
    .line 19
    goto/16 :goto_1

    .line 20
    .line 21
    :cond_0
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 22
    .line 23
    if-eqz v0, :cond_4

    .line 24
    .line 25
    :try_start_0
    const-string v4, "android.app.servertransaction.ClientTransaction"

    .line 26
    .line 27
    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    const-string v5, "getCallbacks"

    .line 32
    .line 33
    invoke-virtual {v4, v5, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v4

    .line 37
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/util/List;

    .line 45
    .line 46
    if-nez v2, :cond_1

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_1
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v4

    .line 63
    if-eqz v4, :cond_4

    .line 64
    .line 65
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    const-string v6, "LaunchActivityItem"

    .line 78
    .line 79
    invoke-virtual {v5, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v5

    .line 83
    if-eqz v5, :cond_2

    .line 84
    .line 85
    invoke-static {v0, v4}, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 86
    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_3
    iget-object v0, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const-string v5, "intent"

    .line 96
    .line 97
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v5

    .line 108
    check-cast v5, Landroid/content/Intent;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 109
    .line 110
    :try_start_1
    const-class v6, Landroid/content/Intent;

    .line 111
    .line 112
    const-string v7, "mExtras"

    .line 113
    .line 114
    invoke-virtual {v6, v7}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 115
    .line 116
    .line 117
    move-result-object v6

    .line 118
    invoke-virtual {v6, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v6, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v6

    .line 125
    check-cast v6, Landroid/os/Bundle;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 126
    .line 127
    move-object v2, v6

    .line 128
    :catch_0
    if-eqz v2, :cond_4

    .line 129
    .line 130
    :try_start_2
    sget-object v6, L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏兰哲;->飘花落叶言子楪世苏兰哲:L飘花落叶言苏楪兰世子哲/飘花落叶言子楪世苏哲兰;

    .line 131
    .line 132
    invoke-virtual {v2, v6}, Landroid/os/Bundle;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 133
    .line 134
    .line 135
    sget-object v2, L飘花落叶言苏楪哲世子兰/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/lang/String;

    .line 136
    .line 137
    invoke-virtual {v5, v2}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v6

    .line 141
    if-eqz v6, :cond_4

    .line 142
    .line 143
    invoke-virtual {v5, v2}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 144
    .line 145
    .line 146
    move-result-object v2

    .line 147
    check-cast v2, Landroid/content/Intent;

    .line 148
    .line 149
    invoke-virtual {v4, v0, v2}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 150
    .line 151
    .line 152
    :catch_1
    :cond_4
    :goto_1
    iget-object p0, p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 153
    .line 154
    check-cast p0, Landroid/os/Handler$Callback;

    .line 155
    .line 156
    if-eqz p0, :cond_5

    .line 157
    .line 158
    invoke-interface {p0, p1}, Landroid/os/Handler$Callback;->handleMessage(Landroid/os/Message;)Z

    .line 159
    .line 160
    .line 161
    move-result p0

    .line 162
    if-eqz p0, :cond_5

    .line 163
    .line 164
    goto :goto_2

    .line 165
    :cond_5
    move v1, v3

    .line 166
    :goto_2
    return v1

    .line 167
    :pswitch_0
    iget v0, p1, Landroid/os/Message;->what:I

    .line 168
    .line 169
    if-eqz v0, :cond_6

    .line 170
    .line 171
    goto :goto_3

    .line 172
    :cond_6
    iget-object p0, p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast p0, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 175
    .line 176
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 177
    .line 178
    if-eqz p1, :cond_7

    .line 179
    .line 180
    invoke-static {}, Lcom/alibaba/fastjson2/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪世苏哲兰()V

    .line 181
    .line 182
    .line 183
    :goto_3
    return v3

    .line 184
    :cond_7
    iget-object v0, p0, L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰:Ljava/lang/Object;

    .line 185
    .line 186
    monitor-enter v0

    .line 187
    :try_start_3
    throw v2

    .line 188
    :catchall_0
    move-exception p0

    .line 189
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 190
    throw p0

    .line 191
    :pswitch_1
    iget-object p0, p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏哲世兰;

    .line 194
    .line 195
    iget v0, p1, Landroid/os/Message;->what:I

    .line 196
    .line 197
    if-ne v0, v1, :cond_8

    .line 198
    .line 199
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p1, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪世兰哲苏;

    .line 202
    .line 203
    invoke-virtual {p0, p1}, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(L飘花落叶言楪世哲子兰苏/飘花落叶言子楪世兰哲苏;)V

    .line 204
    .line 205
    .line 206
    goto :goto_4

    .line 207
    :cond_8
    const/4 v1, 0x2

    .line 208
    if-ne v0, v1, :cond_9

    .line 209
    .line 210
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 211
    .line 212
    check-cast p1, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪世兰哲苏;

    .line 213
    .line 214
    iget-object p0, p0, L飘花落叶言楪世哲子兰苏/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;

    .line 215
    .line 216
    invoke-virtual {p0, p1}, Lcom/bumptech/glide/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世苏兰(L飘花落叶言楪世兰子苏哲/飘花落叶言子楪世兰苏哲;)V

    .line 217
    .line 218
    .line 219
    :cond_9
    move v1, v3

    .line 220
    :goto_4
    return v1

    .line 221
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
