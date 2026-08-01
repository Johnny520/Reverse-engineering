.class public final Landroidx/activity/飘花落叶言子楪哲兰世苏;
.super L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final synthetic 飘花落叶言子楪苏世兰哲:Landroidx/activity/ComponentActivity;


# direct methods
.method public constructor <init>(Landroidx/activity/ComponentActivity;)V
    .locals 0

    .line 1
    iput-object p1, p0, Landroidx/activity/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Landroidx/activity/ComponentActivity;

    .line 2
    .line 3
    invoke-direct {p0}, L飘花落叶言子楪世兰苏哲/飘花落叶言子楪苏世兰哲;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(IL飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;Ljava/lang/Object;)V
    .locals 8

    .line 1
    iget-object v0, p0, Landroidx/activity/飘花落叶言子楪哲兰世苏;->飘花落叶言子楪苏世兰哲:Landroidx/activity/ComponentActivity;

    .line 2
    .line 3
    invoke-virtual {p2, v0, p3}, L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏兰哲(Landroid/content/Context;Ljava/lang/Object;)L飘花落叶言子世苏哲兰楪/飘花落叶言子楪世哲兰苏;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    new-instance p2, Landroid/os/Handler;

    .line 11
    .line 12
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 13
    .line 14
    .line 15
    move-result-object p3

    .line 16
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 17
    .line 18
    .line 19
    new-instance p3, Landroidx/activity/飘花落叶言子楪哲苏世兰;

    .line 20
    .line 21
    invoke-direct {p3, p1, v2, p0, v1}, Landroidx/activity/飘花落叶言子楪哲苏世兰;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 25
    .line 26
    .line 27
    return-void

    .line 28
    :cond_0
    invoke-virtual {p2, v0, p3}, L飘花落叶言子楪世兰哲苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 33
    .line 34
    .line 35
    move-result-object p3

    .line 36
    if-eqz p3, :cond_1

    .line 37
    .line 38
    invoke-virtual {p2}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 39
    .line 40
    .line 41
    move-result-object p3

    .line 42
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    invoke-virtual {p3}, Landroid/os/Bundle;->getClassLoader()Ljava/lang/ClassLoader;

    .line 46
    .line 47
    .line 48
    move-result-object p3

    .line 49
    if-nez p3, :cond_1

    .line 50
    .line 51
    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 52
    .line 53
    .line 54
    move-result-object p3

    .line 55
    invoke-virtual {p2, p3}, Landroid/content/Intent;->setExtrasClassLoader(Ljava/lang/ClassLoader;)V

    .line 56
    .line 57
    .line 58
    :cond_1
    const-string p3, "androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE"

    .line 59
    .line 60
    invoke-virtual {p2, p3}, Landroid/content/Intent;->hasExtra(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v1

    .line 64
    if-eqz v1, :cond_2

    .line 65
    .line 66
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getBundleExtra(Ljava/lang/String;)Landroid/os/Bundle;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-virtual {p2, p3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    :goto_0
    move-object v7, v1

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    const/4 v1, 0x0

    .line 76
    goto :goto_0

    .line 77
    :goto_1
    const-string p3, "androidx.activity.result.contract.action.REQUEST_PERMISSIONS"

    .line 78
    .line 79
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-virtual {p3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p3

    .line 87
    if-eqz p3, :cond_c

    .line 88
    .line 89
    const-string p0, "androidx.activity.result.contract.extra.PERMISSIONS"

    .line 90
    .line 91
    invoke-virtual {p2, p0}, Landroid/content/Intent;->getStringArrayExtra(Ljava/lang/String;)[Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    if-nez p0, :cond_3

    .line 96
    .line 97
    new-array p0, v2, [Ljava/lang/String;

    .line 98
    .line 99
    :cond_3
    new-instance p2, Ljava/util/HashSet;

    .line 100
    .line 101
    invoke-direct {p2}, Ljava/util/HashSet;-><init>()V

    .line 102
    .line 103
    .line 104
    move p3, v2

    .line 105
    :goto_2
    array-length v1, p0

    .line 106
    if-ge p3, v1, :cond_6

    .line 107
    .line 108
    aget-object v1, p0, p3

    .line 109
    .line 110
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    if-nez v1, :cond_5

    .line 115
    .line 116
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 117
    .line 118
    const/16 v3, 0x21

    .line 119
    .line 120
    if-ge v1, v3, :cond_4

    .line 121
    .line 122
    aget-object v1, p0, p3

    .line 123
    .line 124
    const-string v3, "android.permission.POST_NOTIFICATIONS"

    .line 125
    .line 126
    invoke-static {v1, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-eqz v1, :cond_4

    .line 131
    .line 132
    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    invoke-virtual {p2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    :cond_4
    add-int/lit8 p3, p3, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string p2, "Permission request for permissions "

    .line 145
    .line 146
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    const-string p2, " must not contain null or empty values"

    .line 154
    .line 155
    invoke-static {p1, p0, p2}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪兰苏世哲(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_6
    invoke-virtual {p2}, Ljava/util/HashSet;->size()I

    .line 164
    .line 165
    .line 166
    move-result p3

    .line 167
    if-lez p3, :cond_7

    .line 168
    .line 169
    array-length v1, p0

    .line 170
    sub-int/2addr v1, p3

    .line 171
    new-array v1, v1, [Ljava/lang/String;

    .line 172
    .line 173
    goto :goto_3

    .line 174
    :cond_7
    move-object v1, p0

    .line 175
    :goto_3
    if-lez p3, :cond_a

    .line 176
    .line 177
    array-length v3, p0

    .line 178
    if-ne p3, v3, :cond_8

    .line 179
    .line 180
    return-void

    .line 181
    :cond_8
    move p3, v2

    .line 182
    :goto_4
    array-length v3, p0

    .line 183
    if-ge v2, v3, :cond_a

    .line 184
    .line 185
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-virtual {p2, v3}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    .line 190
    .line 191
    .line 192
    move-result v3

    .line 193
    if-nez v3, :cond_9

    .line 194
    .line 195
    add-int/lit8 v3, p3, 0x1

    .line 196
    .line 197
    aget-object v4, p0, v2

    .line 198
    .line 199
    aput-object v4, v1, p3

    .line 200
    .line 201
    move p3, v3

    .line 202
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 203
    .line 204
    goto :goto_4

    .line 205
    :cond_a
    instance-of p2, v0, Landroidx/fragment/app/FragmentActivity;

    .line 206
    .line 207
    if-eqz p2, :cond_b

    .line 208
    .line 209
    move-object p2, v0

    .line 210
    check-cast p2, Landroidx/fragment/app/FragmentActivity;

    .line 211
    .line 212
    invoke-virtual {p2, p1}, Landroidx/fragment/app/FragmentActivity;->validateRequestPermissionsRequestCode(I)V

    .line 213
    .line 214
    .line 215
    :cond_b
    invoke-virtual {v0, p0, p1}, Landroid/app/Activity;->requestPermissions([Ljava/lang/String;I)V

    .line 216
    .line 217
    .line 218
    return-void

    .line 219
    :cond_c
    const-string p3, "androidx.activity.result.contract.action.INTENT_SENDER_REQUEST"

    .line 220
    .line 221
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 222
    .line 223
    .line 224
    move-result-object v1

    .line 225
    invoke-virtual {p3, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 226
    .line 227
    .line 228
    move-result p3

    .line 229
    if-eqz p3, :cond_d

    .line 230
    .line 231
    const-string p3, "androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST"

    .line 232
    .line 233
    invoke-virtual {p2, p3}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 234
    .line 235
    .line 236
    move-result-object p2

    .line 237
    check-cast p2, Landroidx/activity/result/IntentSenderRequest;

    .line 238
    .line 239
    :try_start_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 240
    .line 241
    .line 242
    iget-object v1, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪哲苏兰世:Landroid/content/IntentSender;

    .line 243
    .line 244
    iget-object v3, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪哲兰世苏:Landroid/content/Intent;

    .line 245
    .line 246
    iget v4, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪哲兰苏世:I

    .line 247
    .line 248
    iget v5, p2, Landroidx/activity/result/IntentSenderRequest;->飘花落叶言子楪兰世苏哲:I
    :try_end_0
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_0 .. :try_end_0} :catch_1

    .line 249
    .line 250
    const/4 v6, 0x0

    .line 251
    move v2, p1

    .line 252
    :try_start_1
    invoke-virtual/range {v0 .. v7}, Landroidx/activity/ComponentActivity;->startIntentSenderForResult(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V
    :try_end_1
    .catch Landroid/content/IntentSender$SendIntentException; {:try_start_1 .. :try_end_1} :catch_0

    .line 253
    .line 254
    .line 255
    return-void

    .line 256
    :catch_0
    move-exception v0

    .line 257
    :goto_5
    move-object p1, v0

    .line 258
    goto :goto_6

    .line 259
    :catch_1
    move-exception v0

    .line 260
    move v2, p1

    .line 261
    goto :goto_5

    .line 262
    :goto_6
    new-instance p2, Landroid/os/Handler;

    .line 263
    .line 264
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 265
    .line 266
    .line 267
    move-result-object p3

    .line 268
    invoke-direct {p2, p3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 269
    .line 270
    .line 271
    new-instance p3, Landroidx/activity/飘花落叶言子楪哲苏世兰;

    .line 272
    .line 273
    const/4 v0, 0x1

    .line 274
    invoke-direct {p3, v2, v0, p0, p1}, Landroidx/activity/飘花落叶言子楪哲苏世兰;-><init>(IILjava/lang/Object;Ljava/lang/Object;)V

    .line 275
    .line 276
    .line 277
    invoke-virtual {p2, p3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 278
    .line 279
    .line 280
    return-void

    .line 281
    :cond_d
    move v2, p1

    .line 282
    invoke-virtual {v0, p2, v2, v7}, Landroidx/activity/ComponentActivity;->startActivityForResult(Landroid/content/Intent;ILandroid/os/Bundle;)V

    .line 283
    .line 284
    .line 285
    return-void
.end method
