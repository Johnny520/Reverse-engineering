.class public final synthetic Le9/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic g:I

.field public final synthetic h:J

.field public final synthetic i:I

.field public final synthetic j:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Landroid/app/NotificationManager;IJ)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Le9/f;->g:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Le9/f;->j:Ljava/lang/Object;

    .line 8
    .line 9
    iput p2, p0, Le9/f;->i:I

    .line 10
    .line 11
    iput-wide p3, p0, Le9/f;->h:J

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Lj8/y;JI)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Le9/f;->g:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Le9/f;->j:Ljava/lang/Object;

    iput-wide p2, p0, Le9/f;->h:J

    iput p4, p0, Le9/f;->i:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 8

    .line 1
    iget v0, p0, Le9/f;->g:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Le9/f;->j:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lj8/y;

    .line 9
    .line 10
    iget-wide v1, p0, Le9/f;->h:J

    .line 11
    .line 12
    invoke-virtual {v0, v1, v2}, Lj8/y;->c(J)Lb/e;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    :try_start_0
    iget-object v2, v1, Lb/e;->i:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v2, Lnb/o;

    .line 22
    .line 23
    iget-object v1, v1, Lb/e;->h:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, Lnb/w;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    iget-object v3, v1, Lnb/w;->b:Landroid/os/Handler;

    .line 28
    .line 29
    const/4 v4, 0x3

    .line 30
    iget v5, p0, Le9/f;->i:I

    .line 31
    .line 32
    if-ne v5, v4, :cond_1

    .line 33
    .line 34
    :try_start_1
    new-instance v4, Lnb/s;

    .line 35
    .line 36
    const/4 v5, 0x1

    .line 37
    invoke-direct {v4, v1, v2, v5}, Lnb/s;-><init>(Lnb/w;Lnb/o;I)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 41
    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception v1

    .line 45
    goto :goto_0

    .line 46
    :cond_1
    new-instance v4, Lnb/s;

    .line 47
    .line 48
    const/4 v5, 0x0

    .line 49
    invoke-direct {v4, v1, v2, v5}, Lnb/s;-><init>(Lnb/w;Lnb/o;I)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    goto :goto_1

    .line 56
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v3, "\u539f\u8bed\u97f3\u64ad\u653e\u56de\u8c03\u6267\u884c\u5931\u8d25: "

    .line 59
    .line 60
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-virtual {v0, v1}, Lj8/y;->m(Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    :goto_1
    return-void

    .line 78
    :pswitch_0
    iget-object v0, p0, Le9/f;->j:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v0, Landroid/app/NotificationManager;

    .line 81
    .line 82
    iget v1, p0, Le9/f;->i:I

    .line 83
    .line 84
    :try_start_2
    invoke-virtual {v0}, Landroid/app/NotificationManager;->getActiveNotifications()[Landroid/service/notification/StatusBarNotification;

    .line 85
    .line 86
    .line 87
    move-result-object v2

    .line 88
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    array-length v3, v2

    .line 92
    const/4 v4, 0x0

    .line 93
    move v5, v4

    .line 94
    :goto_2
    if-ge v5, v3, :cond_3

    .line 95
    .line 96
    aget-object v6, v2, v5

    .line 97
    .line 98
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getTag()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    if-nez v7, :cond_2

    .line 103
    .line 104
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getId()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    if-ne v7, v1, :cond_2

    .line 109
    .line 110
    goto :goto_3

    .line 111
    :catchall_1
    move-exception v2

    .line 112
    goto :goto_4

    .line 113
    :cond_2
    add-int/lit8 v5, v5, 0x1

    .line 114
    .line 115
    goto :goto_2

    .line 116
    :cond_3
    const/4 v6, 0x0

    .line 117
    :goto_3
    if-eqz v6, :cond_4

    .line 118
    .line 119
    invoke-virtual {v6}, Landroid/service/notification/StatusBarNotification;->getNotification()Landroid/app/Notification;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    if-eqz v2, :cond_4

    .line 124
    .line 125
    iget-object v2, v2, Landroid/app/Notification;->extras:Landroid/os/Bundle;

    .line 126
    .line 127
    if-eqz v2, :cond_4

    .line 128
    .line 129
    const-string v3, "hchat_custom_notification_reply_completion_token"

    .line 130
    .line 131
    invoke-virtual {v2, v3}, Landroid/os/BaseBundle;->getLong(Ljava/lang/String;)J

    .line 132
    .line 133
    .line 134
    move-result-wide v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 135
    iget-wide v5, p0, Le9/f;->h:J

    .line 136
    .line 137
    cmp-long v2, v2, v5

    .line 138
    .line 139
    if-nez v2, :cond_4

    .line 140
    .line 141
    const/4 v4, 0x1

    .line 142
    :cond_4
    :try_start_3
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 143
    .line 144
    .line 145
    move-result-object v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 146
    goto :goto_5

    .line 147
    :goto_4
    new-instance v3, Lsf/f;

    .line 148
    .line 149
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 150
    .line 151
    .line 152
    move-object v2, v3

    .line 153
    :goto_5
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 154
    .line 155
    instance-of v4, v2, Lsf/f;

    .line 156
    .line 157
    if-eqz v4, :cond_5

    .line 158
    .line 159
    move-object v2, v3

    .line 160
    :cond_5
    check-cast v2, Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    move-result v2

    .line 166
    if-eqz v2, :cond_6

    .line 167
    .line 168
    invoke-virtual {v0, v1}, Landroid/app/NotificationManager;->cancel(I)V

    .line 169
    .line 170
    .line 171
    :cond_6
    return-void

    .line 172
    nop

    .line 173
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
