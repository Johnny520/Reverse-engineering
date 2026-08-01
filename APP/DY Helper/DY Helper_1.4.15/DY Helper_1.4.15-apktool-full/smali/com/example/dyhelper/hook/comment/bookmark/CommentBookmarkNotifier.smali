.class public final Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final $stable:I

.field private static final CHANNEL_ID:Ljava/lang/String; = "dyhelper_comment_bookmark"

.field private static final CHANNEL_NAME:Ljava/lang/String; = "\u8bc4\u8bba\u4e66\u7b7e\u63d0\u9192"

.field public static final INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;

.field private static final TAG:Ljava/lang/String; = "r88ffd85015f20410"

.field private static volatile appContext:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->INSTANCE:Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;

    .line 7
    .line 8
    const/16 v0, 0x8

    .line 9
    .line 10
    sput v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->$stable:I

    .line 11
    .line 12
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method private final ensureChannel()V
    .locals 4

    .line 1
    const-string p0, "dyhelper_comment_bookmark"

    .line 2
    .line 3
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->appContext:Landroid/content/Context;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    :try_start_0
    const-string v1, "notification"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    check-cast v0, Landroid/app/NotificationManager;

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/app/NotificationManager;->getNotificationChannel(Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    new-instance v1, Landroid/app/NotificationChannel;

    .line 26
    .line 27
    const-string v2, "\u8bc4\u8bba\u4e66\u7b7e\u63d0\u9192"

    .line 28
    .line 29
    const/4 v3, 0x3

    .line 30
    invoke-direct {v1, p0, v2, v3}, Landroid/app/NotificationChannel;-><init>(Ljava/lang/String;Ljava/lang/CharSequence;I)V

    .line 31
    .line 32
    .line 33
    const-string p0, "DyHelper \u8bc4\u8bba\u4e66\u7b7e\u65b0\u56de\u590d\u63d0\u9192"

    .line 34
    .line 35
    invoke-virtual {v1, p0}, Landroid/app/NotificationChannel;->setDescription(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->createNotificationChannel(Landroid/app/NotificationChannel;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 39
    .line 40
    .line 41
    :catchall_0
    :cond_1
    return-void
.end method


# virtual methods
.method public final init(Landroid/content/Context;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object p1, v0

    .line 12
    :goto_0
    sput-object p1, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->appContext:Landroid/content/Context;

    .line 13
    .line 14
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->ensureChannel()V

    .line 15
    .line 16
    .line 17
    return-void
.end method

.method public final notifyNewReply(Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;)V
    .locals 9

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object v0, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->appContext:Landroid/content/Context;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNotificationEnabled()Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto/16 :goto_3

    .line 17
    .line 18
    :cond_1
    :try_start_0
    invoke-direct {p0}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkNotifier;->ensureChannel()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {p0, v1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/high16 v2, 0xc000000

    .line 44
    .line 45
    invoke-static {v0, v1, p0, v2}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/4 p0, 0x0

    .line 51
    :goto_0
    const-string v1, "\u4f60\u4e66\u7b7e\u7684\u8bc4\u8bba\u6709\u65b0\u56de\u590d"

    .line 52
    .line 53
    new-instance v2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyItems()Ljava/util/List;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    invoke-static {v3}, Lxh;->К(Ljava/util/List;)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    check-cast v3, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 67
    .line 68
    const/4 v4, 0x1

    .line 69
    const/16 v5, 0x24

    .line 70
    .line 71
    const-string v6, "\uff1a"

    .line 72
    .line 73
    if-eqz v3, :cond_4

    .line 74
    .line 75
    :try_start_1
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getAuthorName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v7

    .line 79
    invoke-static {v7}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 80
    .line 81
    .line 82
    move-result v8

    .line 83
    if-eqz v8, :cond_3

    .line 84
    .line 85
    const-string v7, "\u6709\u4eba"

    .line 86
    .line 87
    :cond_3
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkReplyItem;->getContent()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-static {v3, v5}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v3

    .line 101
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    goto :goto_1

    .line 105
    :cond_4
    const-string v3, "\u65b0\u589e "

    .line 106
    .line 107
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getNewReplyCount()I

    .line 111
    .line 112
    .line 113
    move-result v3

    .line 114
    if-ge v3, v4, :cond_5

    .line 115
    .line 116
    move v3, v4

    .line 117
    :cond_5
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v3, " \u6761\u56de\u590d"

    .line 121
    .line 122
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getContent()Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v3

    .line 129
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    if-nez v3, :cond_6

    .line 134
    .line 135
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getContent()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    invoke-static {v3, v5}, Lq02;->я(Ljava/lang/String;I)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    :cond_6
    :goto_1
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v2

    .line 153
    new-instance v3, Landroid/app/Notification$Builder;

    .line 154
    .line 155
    const-string v5, "dyhelper_comment_bookmark"

    .line 156
    .line 157
    invoke-direct {v3, v0, v5}, Landroid/app/Notification$Builder;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    const v5, 0x108009b

    .line 161
    .line 162
    .line 163
    invoke-virtual {v3, v5}, Landroid/app/Notification$Builder;->setSmallIcon(I)Landroid/app/Notification$Builder;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    invoke-virtual {v3, v1}, Landroid/app/Notification$Builder;->setContentTitle(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 168
    .line 169
    .line 170
    move-result-object v1

    .line 171
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setContentText(Ljava/lang/CharSequence;)Landroid/app/Notification$Builder;

    .line 172
    .line 173
    .line 174
    move-result-object v1

    .line 175
    new-instance v3, Landroid/app/Notification$BigTextStyle;

    .line 176
    .line 177
    invoke-direct {v3}, Landroid/app/Notification$BigTextStyle;-><init>()V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v2}, Landroid/app/Notification$BigTextStyle;->bigText(Ljava/lang/CharSequence;)Landroid/app/Notification$BigTextStyle;

    .line 181
    .line 182
    .line 183
    move-result-object v2

    .line 184
    invoke-virtual {v1, v2}, Landroid/app/Notification$Builder;->setStyle(Landroid/app/Notification$Style;)Landroid/app/Notification$Builder;

    .line 185
    .line 186
    .line 187
    move-result-object v1

    .line 188
    invoke-virtual {v1, v4}, Landroid/app/Notification$Builder;->setAutoCancel(Z)Landroid/app/Notification$Builder;

    .line 189
    .line 190
    .line 191
    move-result-object v1

    .line 192
    invoke-virtual {v1, p0}, Landroid/app/Notification$Builder;->setContentIntent(Landroid/app/PendingIntent;)Landroid/app/Notification$Builder;

    .line 193
    .line 194
    .line 195
    move-result-object p0

    .line 196
    invoke-virtual {p0}, Landroid/app/Notification$Builder;->build()Landroid/app/Notification;

    .line 197
    .line 198
    .line 199
    move-result-object p0

    .line 200
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    const-string v1, "notification"

    .line 204
    .line 205
    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v0

    .line 209
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    check-cast v0, Landroid/app/NotificationManager;

    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/example/dyhelper/hook/comment/bookmark/CommentBookmarkRecord;->getCommentId()Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object p1

    .line 218
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 219
    .line 220
    .line 221
    move-result p1

    .line 222
    const v1, 0xffff

    .line 223
    .line 224
    .line 225
    and-int/2addr p1, v1

    .line 226
    const/high16 v1, 0xd10000

    .line 227
    .line 228
    add-int/2addr p1, v1

    .line 229
    invoke-virtual {v0, p1, p0}, Landroid/app/NotificationManager;->notify(ILandroid/app/Notification;)V

    .line 230
    .line 231
    .line 232
    sget-object p0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 233
    .line 234
    goto :goto_2

    .line 235
    :catchall_0
    move-exception p0

    .line 236
    new-instance p1, Leo1;

    .line 237
    .line 238
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 239
    .line 240
    .line 241
    move-object p0, p1

    .line 242
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    if-eqz p0, :cond_7

    .line 247
    .line 248
    const-string p1, "r88ffd85015f20410"

    .line 249
    .line 250
    const-string v0, "notify failed"

    .line 251
    .line 252
    invoke-static {p1, v0, p0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 253
    .line 254
    .line 255
    :cond_7
    :goto_3
    return-void
.end method
