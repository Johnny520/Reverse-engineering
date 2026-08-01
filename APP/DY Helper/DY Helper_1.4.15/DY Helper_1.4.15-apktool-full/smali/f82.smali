.class public abstract Lf82;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Landroid/os/Handler;

.field public static final β:Ljava/util/LinkedHashSet;

.field public static volatile γ:Z

.field public static volatile δ:Z

.field public static volatile ε:Le82;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Landroid/os/Handler;

    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lf82;->α:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    sput-object v0, Lf82;->β:Ljava/util/LinkedHashSet;

    .line 18
    .line 19
    return-void
.end method

.method public static α(Ljava/lang/Object;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-eqz v0, :cond_6

    .line 7
    .line 8
    const-class v2, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {v0, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-nez v2, :cond_6

    .line 15
    .line 16
    const/4 v2, 0x3

    .line 17
    if-ge v1, v2, :cond_6

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    :goto_1
    invoke-virtual {v2}, Lτ;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_5

    .line 32
    .line 33
    invoke-virtual {v2}, Lτ;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    check-cast v3, Ljava/lang/reflect/Field;

    .line 38
    .line 39
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 44
    .line 45
    .line 46
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 47
    if-nez v4, :cond_0

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    :try_start_1
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v4

    .line 57
    if-nez v4, :cond_1

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_1
    instance-of v5, v4, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v5, :cond_2

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    goto :goto_2

    .line 68
    :cond_2
    instance-of v5, v4, Ljava/lang/Number;

    .line 69
    .line 70
    if-eqz v5, :cond_3

    .line 71
    .line 72
    check-cast v4, Ljava/lang/Number;

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_3
    instance-of v5, v4, Ljava/lang/Boolean;

    .line 79
    .line 80
    if-eqz v5, :cond_4

    .line 81
    .line 82
    check-cast v4, Ljava/lang/Boolean;

    .line 83
    .line 84
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    invoke-static {v4}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_4
    invoke-static {v4}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 93
    .line 94
    .line 95
    move-result v4

    .line 96
    invoke-static {v4}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    :goto_2
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v4

    .line 103
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 107
    .line 108
    .line 109
    goto :goto_1

    .line 110
    :catchall_0
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    goto :goto_1

    .line 121
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 125
    add-int/lit8 v1, v1, 0x1

    .line 126
    .line 127
    goto :goto_0

    .line 128
    :catchall_1
    move-exception p0

    .line 129
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    :cond_6
    return-void
.end method

.method public static β()V
    .locals 1

    .line 1
    invoke-static {}, Lui1;->Α()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    :try_start_0
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    :goto_0
    if-eqz v0, :cond_2

    .line 21
    .line 22
    invoke-static {v0}, Lui1;->π(Landroid/content/Context;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    :cond_2
    :goto_1
    return-void

    .line 26
    :catchall_0
    move-exception v0

    .line 27
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    return-void
.end method

.method public static γ(Ljava/lang/Object;)Ljava/lang/String;
    .locals 7

    .line 1
    const-string v5, "itemId"

    .line 2
    .line 3
    const-string v6, "aweme_id"

    .line 4
    .line 5
    const-string v0, "aid"

    .line 6
    .line 7
    const-string v1, "awemeId"

    .line 8
    .line 9
    const-string v2, "id"

    .line 10
    .line 11
    const-string v3, "aId"

    .line 12
    .line 13
    const-string v4, "mAwemeId"

    .line 14
    .line 15
    filled-new-array/range {v0 .. v6}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :catchall_0
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const-wide/16 v2, 0x0

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v1

    .line 39
    check-cast v1, Ljava/lang/String;

    .line 40
    .line 41
    :try_start_0
    invoke-static {p0, v1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    instance-of v4, v1, Ljava/lang/String;

    .line 46
    .line 47
    if-eqz v4, :cond_1

    .line 48
    .line 49
    move-object v4, v1

    .line 50
    check-cast v4, Ljava/lang/CharSequence;

    .line 51
    .line 52
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v4

    .line 56
    if-nez v4, :cond_1

    .line 57
    .line 58
    check-cast v1, Ljava/lang/String;

    .line 59
    .line 60
    return-object v1

    .line 61
    :cond_1
    instance-of v4, v1, Ljava/lang/Long;

    .line 62
    .line 63
    if-eqz v4, :cond_0

    .line 64
    .line 65
    move-object v4, v1

    .line 66
    check-cast v4, Ljava/lang/Number;

    .line 67
    .line 68
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v4

    .line 72
    cmp-long v2, v4, v2

    .line 73
    .line 74
    if-lez v2, :cond_0

    .line 75
    .line 76
    check-cast v1, Ljava/lang/Number;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 79
    .line 80
    .line 81
    move-result-wide v1

    .line 82
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    return-object p0

    .line 87
    :cond_2
    const-string v0, "getId"

    .line 88
    .line 89
    const-string v1, "getItemId"

    .line 90
    .line 91
    const-string v4, "getAid"

    .line 92
    .line 93
    const-string v5, "getAwemeId"

    .line 94
    .line 95
    filled-new-array {v4, v5, v0, v1}, [Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    :catchall_1
    :cond_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    .line 109
    .line 110
    move-result v1

    .line 111
    if-eqz v1, :cond_5

    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    check-cast v1, Ljava/lang/String;

    .line 118
    .line 119
    const/4 v4, 0x0

    .line 120
    :try_start_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 121
    .line 122
    invoke-static {p0, v1, v4}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v1

    .line 126
    instance-of v4, v1, Ljava/lang/String;

    .line 127
    .line 128
    if-eqz v4, :cond_4

    .line 129
    .line 130
    move-object v4, v1

    .line 131
    check-cast v4, Ljava/lang/CharSequence;

    .line 132
    .line 133
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 134
    .line 135
    .line 136
    move-result v4

    .line 137
    if-nez v4, :cond_4

    .line 138
    .line 139
    check-cast v1, Ljava/lang/String;

    .line 140
    .line 141
    return-object v1

    .line 142
    :cond_4
    instance-of v4, v1, Ljava/lang/Long;

    .line 143
    .line 144
    if-eqz v4, :cond_3

    .line 145
    .line 146
    move-object v4, v1

    .line 147
    check-cast v4, Ljava/lang/Number;

    .line 148
    .line 149
    invoke-virtual {v4}, Ljava/lang/Number;->longValue()J

    .line 150
    .line 151
    .line 152
    move-result-wide v4

    .line 153
    cmp-long v4, v4, v2

    .line 154
    .line 155
    if-lez v4, :cond_3

    .line 156
    .line 157
    check-cast v1, Ljava/lang/Number;

    .line 158
    .line 159
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    .line 160
    .line 161
    .line 162
    move-result-wide v4

    .line 163
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 167
    return-object p0

    .line 168
    :cond_5
    const/4 p0, 0x0

    .line 169
    return-object p0
.end method

.method public static δ(Ljava/lang/Object;)J
    .locals 6

    .line 1
    const-string v0, "videoDuration"

    .line 2
    .line 3
    const-string v1, "totalDuration"

    .line 4
    .line 5
    const-string v2, "duration"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :catchall_0
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const-wide/16 v2, 0x0

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    :try_start_0
    invoke-static {p0, v1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Lf82;->ο(Ljava/lang/Object;)J

    .line 38
    .line 39
    .line 40
    move-result-wide v4

    .line 41
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    .line 44
    cmp-long v1, v4, v2

    .line 45
    .line 46
    if-lez v1, :cond_0

    .line 47
    .line 48
    return-wide v4

    .line 49
    :cond_1
    const-string v0, "getVideoDuration"

    .line 50
    .line 51
    const-string v1, "getTotalDuration"

    .line 52
    .line 53
    const-string v4, "getDuration"

    .line 54
    .line 55
    filled-new-array {v4, v0, v1}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    :catchall_1
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_3

    .line 72
    .line 73
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v1

    .line 77
    check-cast v1, Ljava/lang/String;

    .line 78
    .line 79
    const/4 v4, 0x0

    .line 80
    :try_start_1
    new-array v4, v4, [Ljava/lang/Object;

    .line 81
    .line 82
    invoke-static {p0, v1, v4}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v1

    .line 86
    invoke-static {v1}, Lf82;->ο(Ljava/lang/Object;)J

    .line 87
    .line 88
    .line 89
    move-result-wide v4

    .line 90
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 91
    .line 92
    .line 93
    cmp-long v1, v4, v2

    .line 94
    .line 95
    if-lez v1, :cond_2

    .line 96
    .line 97
    return-wide v4

    .line 98
    :cond_3
    return-wide v2
.end method

.method public static ε(Ljava/lang/Object;)J
    .locals 10

    .line 1
    sget-boolean v0, Lf82;->δ:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_4

    .line 5
    .line 6
    const/4 v0, 0x1

    .line 7
    sput-boolean v0, Lf82;->δ:Z

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    move-object v2, v0

    .line 14
    move v3, v1

    .line 15
    :goto_0
    if-eqz v2, :cond_1

    .line 16
    .line 17
    const-class v4, Ljava/lang/Object;

    .line 18
    .line 19
    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v4

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    const/4 v4, 0x3

    .line 26
    if-ge v3, v4, :cond_1

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    invoke-static {v4}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    :goto_1
    invoke-virtual {v4}, Lτ;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    invoke-virtual {v4}, Lτ;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    check-cast v5, Ljava/lang/reflect/Field;

    .line 47
    .line 48
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 49
    .line 50
    .line 51
    move-result v6

    .line 52
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->toString(I)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_0
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    add-int/lit8 v3, v3, 0x1

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-static {v0}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    :cond_2
    :goto_2
    invoke-virtual {v0}, Lτ;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-virtual {v0}, Lτ;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    check-cast v2, Ljava/lang/reflect/Method;

    .line 92
    .line 93
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 98
    .line 99
    .line 100
    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 101
    .line 102
    invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    array-length v4, v4

    .line 117
    if-nez v4, :cond_2

    .line 118
    .line 119
    const-string v4, "duration"

    .line 120
    .line 121
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 122
    .line 123
    .line 124
    move-result v4

    .line 125
    if-nez v4, :cond_3

    .line 126
    .line 127
    const-string v4, "dur"

    .line 128
    .line 129
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 130
    .line 131
    .line 132
    move-result v4

    .line 133
    if-nez v4, :cond_3

    .line 134
    .line 135
    const-string v4, "time"

    .line 136
    .line 137
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 138
    .line 139
    .line 140
    move-result v4

    .line 141
    if-nez v4, :cond_3

    .line 142
    .line 143
    const-string v4, "length"

    .line 144
    .line 145
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 146
    .line 147
    .line 148
    move-result v4

    .line 149
    if-nez v4, :cond_3

    .line 150
    .line 151
    const-string v4, "video"

    .line 152
    .line 153
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 154
    .line 155
    .line 156
    move-result v4

    .line 157
    if-nez v4, :cond_3

    .line 158
    .line 159
    const-string v4, "aid"

    .line 160
    .line 161
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v4

    .line 165
    if-nez v4, :cond_3

    .line 166
    .line 167
    const-string v4, "id"

    .line 168
    .line 169
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 170
    .line 171
    .line 172
    move-result v4

    .line 173
    if-nez v4, :cond_3

    .line 174
    .line 175
    const-string v4, "aweme"

    .line 176
    .line 177
    invoke-static {v3, v4, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-eqz v3, :cond_2

    .line 182
    .line 183
    :cond_3
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 184
    .line 185
    .line 186
    move-result-object v3

    .line 187
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    goto :goto_2

    .line 194
    :cond_4
    const-string v8, "mDuration"

    .line 195
    .line 196
    const-string v9, "dur"

    .line 197
    .line 198
    const-string v4, "duration"

    .line 199
    .line 200
    const-string v5, "totalDuration"

    .line 201
    .line 202
    const-string v6, "_duration"

    .line 203
    .line 204
    const-string v7, "videoDuration"

    .line 205
    .line 206
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 211
    .line 212
    .line 213
    move-result-object v0

    .line 214
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    :catchall_0
    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 219
    .line 220
    .line 221
    move-result v2

    .line 222
    const-wide/16 v3, 0x0

    .line 223
    .line 224
    if-eqz v2, :cond_6

    .line 225
    .line 226
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    check-cast v2, Ljava/lang/String;

    .line 231
    .line 232
    :try_start_0
    invoke-static {p0, v2}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-static {v2}, Lf82;->ο(Ljava/lang/Object;)J

    .line 237
    .line 238
    .line 239
    move-result-wide v5

    .line 240
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 241
    .line 242
    .line 243
    cmp-long v2, v5, v3

    .line 244
    .line 245
    if-lez v2, :cond_5

    .line 246
    .line 247
    return-wide v5

    .line 248
    :cond_6
    const-string v0, "getTotalDuration"

    .line 249
    .line 250
    const-string v2, "getVideoDuration"

    .line 251
    .line 252
    const-string v5, "getDuration"

    .line 253
    .line 254
    filled-new-array {v5, v0, v2}, [Ljava/lang/String;

    .line 255
    .line 256
    .line 257
    move-result-object v0

    .line 258
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 259
    .line 260
    .line 261
    move-result-object v0

    .line 262
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 263
    .line 264
    .line 265
    move-result-object v0

    .line 266
    :catchall_1
    :cond_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 267
    .line 268
    .line 269
    move-result v2

    .line 270
    if-eqz v2, :cond_8

    .line 271
    .line 272
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 273
    .line 274
    .line 275
    move-result-object v2

    .line 276
    check-cast v2, Ljava/lang/String;

    .line 277
    .line 278
    :try_start_1
    new-array v5, v1, [Ljava/lang/Object;

    .line 279
    .line 280
    invoke-static {p0, v2, v5}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-static {v2}, Lf82;->ο(Ljava/lang/Object;)J

    .line 285
    .line 286
    .line 287
    move-result-wide v5

    .line 288
    invoke-static {v2}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 289
    .line 290
    .line 291
    cmp-long v2, v5, v3

    .line 292
    .line 293
    if-lez v2, :cond_7

    .line 294
    .line 295
    return-wide v5

    .line 296
    :cond_8
    return-wide v3
.end method

.method public static ζ(Ljava/lang/Object;)J
    .locals 8

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    :goto_0
    if-eqz v2, :cond_4

    .line 8
    .line 9
    const-class v3, Ljava/lang/Object;

    .line 10
    .line 11
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v3

    .line 15
    if-nez v3, :cond_4

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-static {v3}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    :cond_0
    invoke-virtual {v3}, Lτ;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_3

    .line 30
    .line 31
    invoke-virtual {v3}, Lτ;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Ljava/lang/reflect/Field;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 45
    .line 46
    invoke-virtual {v5, v6}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    const-string v6, "duration"

    .line 54
    .line 55
    const/4 v7, 0x0

    .line 56
    invoke-static {v5, v6, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v6

    .line 60
    if-nez v6, :cond_1

    .line 61
    .line 62
    const-string v6, "dur"

    .line 63
    .line 64
    invoke-static {v5, v6, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-nez v6, :cond_1

    .line 69
    .line 70
    const-string v6, "length"

    .line 71
    .line 72
    invoke-static {v5, v6, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-nez v6, :cond_1

    .line 77
    .line 78
    const-string v6, "time"

    .line 79
    .line 80
    invoke-static {v5, v6, v7}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_0

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catchall_0
    move-exception p0

    .line 88
    goto :goto_2

    .line 89
    :cond_1
    :goto_1
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v5

    .line 93
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 94
    .line 95
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 96
    .line 97
    .line 98
    move-result v5

    .line 99
    if-nez v5, :cond_2

    .line 100
    .line 101
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v5

    .line 105
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 108
    .line 109
    .line 110
    move-result v5

    .line 111
    if-nez v5, :cond_2

    .line 112
    .line 113
    const-class v5, Ljava/lang/Number;

    .line 114
    .line 115
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    invoke-virtual {v5, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 120
    .line 121
    .line 122
    move-result v5

    .line 123
    if-eqz v5, :cond_0

    .line 124
    .line 125
    :cond_2
    const/4 v5, 0x1

    .line 126
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v4, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v5

    .line 133
    invoke-static {v5}, Lf82;->ο(Ljava/lang/Object;)J

    .line 134
    .line 135
    .line 136
    move-result-wide v6

    .line 137
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    invoke-static {v5}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    cmp-long v4, v6, v0

    .line 144
    .line 145
    if-lez v4, :cond_0

    .line 146
    .line 147
    return-wide v6

    .line 148
    :cond_3
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 152
    goto/16 :goto_0

    .line 153
    .line 154
    :cond_4
    return-wide v0

    .line 155
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    return-wide v0
.end method

.method public static η(J)Ljava/lang/String;
    .locals 7

    .line 1
    const/16 v0, 0x3e8

    .line 2
    .line 3
    int-to-long v0, v0

    .line 4
    div-long/2addr p0, v0

    .line 5
    const/16 v0, 0xe10

    .line 6
    .line 7
    int-to-long v0, v0

    .line 8
    div-long v2, p0, v0

    .line 9
    .line 10
    rem-long v0, p0, v0

    .line 11
    .line 12
    const/16 v4, 0x3c

    .line 13
    .line 14
    int-to-long v4, v4

    .line 15
    div-long/2addr v0, v4

    .line 16
    rem-long/2addr p0, v4

    .line 17
    const-wide/16 v4, 0x0

    .line 18
    .line 19
    cmp-long v4, v2, v4

    .line 20
    .line 21
    const-string v5, "\u79d2"

    .line 22
    .line 23
    const-string v6, "\u5206"

    .line 24
    .line 25
    if-lez v4, :cond_0

    .line 26
    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, "\u65f6"

    .line 36
    .line 37
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v4, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v4, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0

    .line 57
    :cond_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, p0, p1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0
.end method

.method public static θ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    const-string v0, "mVideo"

    .line 2
    .line 3
    const-string v1, "videoModel"

    .line 4
    .line 5
    const-string v2, "video"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :catchall_0
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    :try_start_0
    invoke-static {p0, v1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    if-eqz v1, :cond_0

    .line 36
    .line 37
    return-object v1

    .line 38
    :cond_1
    const-string v0, "getVideo"

    .line 39
    .line 40
    const-string v1, "getVideoModel"

    .line 41
    .line 42
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    :catchall_1
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-eqz v1, :cond_3

    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    check-cast v1, Ljava/lang/String;

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 68
    .line 69
    invoke-static {p0, v1, v2}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    return-object v1

    .line 76
    :cond_3
    const/4 p0, 0x0

    .line 77
    return-object p0
.end method

.method public static ι(Ljava/lang/Object;)V
    .locals 13

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object v2

    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    goto/16 :goto_c

    .line 10
    .line 11
    :cond_0
    invoke-static {p0}, Lf82;->γ(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    if-eqz v3, :cond_11

    .line 16
    .line 17
    invoke-static {v3}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 18
    .line 19
    .line 20
    move-result v4

    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    goto/16 :goto_a

    .line 24
    .line 25
    :cond_1
    sget-boolean v4, Lf82;->γ:Z

    .line 26
    .line 27
    const/4 v5, 0x1

    .line 28
    if-nez v4, :cond_2

    .line 29
    .line 30
    sput-boolean v5, Lf82;->γ:Z

    .line 31
    .line 32
    invoke-static {p0}, Lf82;->α(Ljava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto/16 :goto_b

    .line 38
    .line 39
    :cond_2
    :goto_0
    invoke-static {p0}, Lf82;->κ(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_3

    .line 44
    .line 45
    goto/16 :goto_c

    .line 46
    .line 47
    :cond_3
    invoke-static {p0}, Lf82;->θ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    sget-object v6, Lf82;->β:Ljava/util/LinkedHashSet;

    .line 52
    .line 53
    monitor-enter v6
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    :try_start_1
    invoke-virtual {v6, v3}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_5

    .line 58
    if-eqz v7, :cond_4

    .line 59
    .line 60
    :try_start_2
    monitor-exit v6

    .line 61
    return-void

    .line 62
    :cond_4
    monitor-exit v6

    .line 63
    invoke-static {p0, v4}, Lf82;->λ(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    invoke-static {p0}, Lf82;->δ(Ljava/lang/Object;)J

    .line 67
    .line 68
    .line 69
    move-result-wide v6

    .line 70
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    const-wide/16 v8, 0x0

    .line 75
    .line 76
    cmp-long v6, v6, v8

    .line 77
    .line 78
    if-lez v6, :cond_5

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    move-object p0, v1

    .line 82
    :goto_1
    if-eqz p0, :cond_6

    .line 83
    .line 84
    :goto_2
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 85
    .line 86
    .line 87
    move-result-wide v6

    .line 88
    goto :goto_5

    .line 89
    :cond_6
    if-eqz v4, :cond_7

    .line 90
    .line 91
    invoke-static {v4}, Lf82;->ε(Ljava/lang/Object;)J

    .line 92
    .line 93
    .line 94
    move-result-wide v6

    .line 95
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    cmp-long v6, v6, v8

    .line 100
    .line 101
    if-lez v6, :cond_7

    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_7
    move-object p0, v1

    .line 105
    :goto_3
    if-eqz p0, :cond_8

    .line 106
    .line 107
    goto :goto_2

    .line 108
    :cond_8
    if-eqz v4, :cond_9

    .line 109
    .line 110
    invoke-static {v4}, Lf82;->ζ(Ljava/lang/Object;)J

    .line 111
    .line 112
    .line 113
    move-result-wide v6

    .line 114
    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 115
    .line 116
    .line 117
    move-result-object p0

    .line 118
    goto :goto_4

    .line 119
    :cond_9
    move-object p0, v1

    .line 120
    :goto_4
    if-eqz p0, :cond_a

    .line 121
    .line 122
    goto :goto_2

    .line 123
    :cond_a
    move-wide v6, v8

    .line 124
    :goto_5
    invoke-static {v6, v7}, Lf82;->η(J)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p0

    .line 128
    cmp-long v8, v6, v8

    .line 129
    .line 130
    if-gtz v8, :cond_b

    .line 131
    .line 132
    if-eqz v4, :cond_12

    .line 133
    .line 134
    invoke-static {v4}, Lf82;->α(Ljava/lang/Object;)V

    .line 135
    .line 136
    .line 137
    return-void

    .line 138
    :cond_b
    const-string v4, "video_length_alert_minutes"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 139
    .line 140
    const/16 v8, 0xa

    .line 141
    .line 142
    :try_start_3
    invoke-static {}, Lf82;->β()V

    .line 143
    .line 144
    .line 145
    invoke-static {}, Lui1;->Α()Z

    .line 146
    .line 147
    .line 148
    move-result v9

    .line 149
    if-eqz v9, :cond_c

    .line 150
    .line 151
    invoke-static {}, Lui1;->μ()Landroid/content/SharedPreferences;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    invoke-interface {v9, v4, v8}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 156
    .line 157
    .line 158
    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 159
    :catchall_1
    :cond_c
    if-ge v8, v5, :cond_d

    .line 160
    .line 161
    move v8, v5

    .line 162
    :cond_d
    int-to-long v9, v8

    .line 163
    const-wide/32 v11, 0xea60

    .line 164
    .line 165
    .line 166
    mul-long/2addr v9, v11

    .line 167
    cmp-long v4, v6, v9

    .line 168
    .line 169
    if-ltz v4, :cond_12

    .line 170
    .line 171
    :try_start_4
    sget-object v4, Lf82;->β:Ljava/util/LinkedHashSet;

    .line 172
    .line 173
    monitor-enter v4
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 174
    :try_start_5
    invoke-virtual {v4, v3}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 175
    .line 176
    .line 177
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 178
    .line 179
    .line 180
    move-result v9

    .line 181
    const/16 v10, 0xc8

    .line 182
    .line 183
    if-le v9, v10, :cond_f

    .line 184
    .line 185
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 186
    .line 187
    .line 188
    move-result-object v9

    .line 189
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/util/AbstractCollection;->size()I

    .line 193
    .line 194
    .line 195
    move-result v11

    .line 196
    sub-int/2addr v11, v10

    .line 197
    const/4 v10, 0x0

    .line 198
    :goto_6
    if-ge v10, v11, :cond_f

    .line 199
    .line 200
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 201
    .line 202
    .line 203
    move-result v12

    .line 204
    if-eqz v12, :cond_e

    .line 205
    .line 206
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 207
    .line 208
    .line 209
    invoke-interface {v9}, Ljava/util/Iterator;->remove()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 210
    .line 211
    .line 212
    goto :goto_7

    .line 213
    :catchall_2
    move-exception p0

    .line 214
    goto :goto_9

    .line 215
    :cond_e
    :goto_7
    add-int/lit8 v10, v10, 0x1

    .line 216
    .line 217
    goto :goto_6

    .line 218
    :cond_f
    :try_start_6
    monitor-exit v4

    .line 219
    const-string v4, "video_length_alert_toast_msg"

    .line 220
    .line 221
    const-string v9, "\u5f53\u524d\u89c6\u9891\u65f6\u957f\u8d85\u8fc7 %d \u5206\u949f"
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 222
    .line 223
    :try_start_7
    invoke-static {}, Lf82;->β()V

    .line 224
    .line 225
    .line 226
    invoke-static {}, Lui1;->Α()Z

    .line 227
    .line 228
    .line 229
    move-result v10

    .line 230
    if-eqz v10, :cond_10

    .line 231
    .line 232
    invoke-static {v4, v9}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v9
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 236
    :catchall_3
    :cond_10
    const/16 v4, 0x3e8

    .line 237
    .line 238
    int-to-long v10, v4

    .line 239
    :try_start_8
    div-long/2addr v6, v10

    .line 240
    const/16 v4, 0x3c

    .line 241
    .line 242
    int-to-long v10, v4

    .line 243
    div-long/2addr v6, v10
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 244
    long-to-int v4, v6

    .line 245
    :try_start_9
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 246
    .line 247
    .line 248
    move-result-object v6

    .line 249
    filled-new-array {v6}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object v6

    .line 253
    invoke-static {v6, v5}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v6

    .line 257
    invoke-static {v9, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 258
    .line 259
    .line 260
    move-result-object v4
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 261
    goto :goto_8

    .line 262
    :catchall_4
    :try_start_a
    const-string v6, "%d"

    .line 263
    .line 264
    invoke-static {v4}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 265
    .line 266
    .line 267
    move-result-object v4

    .line 268
    invoke-static {v9, v6, v4}, Lx02;->Ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 269
    .line 270
    .line 271
    move-result-object v4

    .line 272
    :goto_8
    const-string v6, "video_length_alert_vibrate"

    .line 273
    .line 274
    invoke-static {v6, v5}, Lf82;->ξ(Ljava/lang/String;Z)Z

    .line 275
    .line 276
    .line 277
    move-result v5

    .line 278
    sget-object v6, Lf82;->α:Landroid/os/Handler;

    .line 279
    .line 280
    new-instance v7, Lau1;

    .line 281
    .line 282
    invoke-direct {v7, v2, v4, v5}, Lau1;-><init>(Landroid/app/Activity;Ljava/lang/String;Z)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v6, v7}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 286
    .line 287
    .line 288
    const-string v2, "DYHelper: VideoLengthAlert"

    .line 289
    .line 290
    new-instance v4, Ljava/lang/StringBuilder;

    .line 291
    .line 292
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 293
    .line 294
    .line 295
    const-string v5, "\u89c6\u9891\u65f6\u957f\u63d0\u9192: "

    .line 296
    .line 297
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 298
    .line 299
    .line 300
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 301
    .line 302
    .line 303
    const-string p0, " (\u9608\u503c"

    .line 304
    .line 305
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 306
    .line 307
    .line 308
    invoke-virtual {v4, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 309
    .line 310
    .line 311
    const-string p0, "\u5206\u949f) awemeId="

    .line 312
    .line 313
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    .line 315
    .line 316
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 317
    .line 318
    .line 319
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 320
    .line 321
    .line 322
    move-result-object p0

    .line 323
    invoke-static {v2, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 324
    .line 325
    .line 326
    goto :goto_c

    .line 327
    :goto_9
    monitor-exit v4

    .line 328
    throw p0

    .line 329
    :catchall_5
    move-exception p0

    .line 330
    monitor-exit v6

    .line 331
    throw p0

    .line 332
    :cond_11
    :goto_a
    invoke-static {p0}, Lf82;->α(Ljava/lang/Object;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_0

    .line 333
    .line 334
    .line 335
    return-void

    .line 336
    :goto_b
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 337
    .line 338
    .line 339
    const-string v2, "DYHelper: VideoLengthAlert"

    .line 340
    .line 341
    invoke-static {p0}, Lln0;->з(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 342
    .line 343
    .line 344
    move-result-object p0

    .line 345
    const-string v3, "handleCurrentAweme \u5f02\u5e38: "

    .line 346
    .line 347
    invoke-virtual {v3, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    invoke-static {v2, p0, v1, v0, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 352
    .line 353
    .line 354
    :cond_12
    :goto_c
    return-void
.end method

.method public static κ(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const-string v4, "slides"

    .line 2
    .line 3
    const-string v5, "imageUrlStruct"

    .line 4
    .line 5
    const-string v0, "images"

    .line 6
    .line 7
    const-string v1, "imageInfos"

    .line 8
    .line 9
    const-string v2, "imagesInfo"

    .line 10
    .line 11
    const-string v3, "photoModeImages"

    .line 12
    .line 13
    filled-new-array/range {v0 .. v5}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :catchall_0
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    check-cast v1, Ljava/lang/String;

    .line 36
    .line 37
    :try_start_0
    invoke-static {p0, v1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    instance-of v2, v1, Ljava/util/Collection;

    .line 42
    .line 43
    if-eqz v2, :cond_1

    .line 44
    .line 45
    move-object v2, v1

    .line 46
    check-cast v2, Ljava/util/Collection;

    .line 47
    .line 48
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    if-nez v2, :cond_0

    .line 53
    .line 54
    check-cast v1, Ljava/util/Collection;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Collection;->size()I

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_1
    if-eqz v1, :cond_0

    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v2}, Ljava/lang/Class;->isArray()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_0

    .line 71
    .line 72
    invoke-static {v1}, Ljava/lang/reflect/Array;->getLength(Ljava/lang/Object;)I

    .line 73
    .line 74
    .line 75
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 76
    if-lez v1, :cond_0

    .line 77
    .line 78
    :goto_0
    const/4 p0, 0x1

    .line 79
    return p0

    .line 80
    :cond_2
    const/4 p0, 0x0

    .line 81
    return p0
.end method

.method public static λ(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    const-string v0, "videoDuration"

    .line 2
    .line 3
    const-string v1, "totalDuration"

    .line 4
    .line 5
    const-string v2, "duration"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :catchall_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    check-cast v1, Ljava/lang/String;

    .line 30
    .line 31
    :try_start_0
    invoke-static {p0, v1}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    invoke-static {v1}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_0
    if-eqz p1, :cond_1

    .line 40
    .line 41
    const-string v6, "mDuration"

    .line 42
    .line 43
    const-string v7, "dur"

    .line 44
    .line 45
    const-string v2, "duration"

    .line 46
    .line 47
    const-string v3, "totalDuration"

    .line 48
    .line 49
    const-string v4, "_duration"

    .line 50
    .line 51
    const-string v5, "videoDuration"

    .line 52
    .line 53
    filled-new-array/range {v2 .. v7}, [Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-static {p0}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    :catchall_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-eqz v0, :cond_1

    .line 70
    .line 71
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Ljava/lang/String;

    .line 76
    .line 77
    :try_start_1
    invoke-static {p1, v0}, Lqe0;->λ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-static {v0}, Ljava/util/Objects;->toString(Ljava/lang/Object;)Ljava/lang/String;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    return-void
.end method

.method public static μ(Ljava/lang/Long;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-static {}, Lf82;->β()V

    .line 9
    .line 10
    .line 11
    const-string v0, "video_length_alert_enabled"

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-static {v0, v1}, Lf82;->ξ(Ljava/lang/String;Z)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_1
    sget-object v0, Lpq;->α:Lpq;

    .line 22
    .line 23
    invoke-static {}, Lpq;->β()Lkq;

    .line 24
    .line 25
    .line 26
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-nez v0, :cond_2

    .line 28
    .line 29
    :goto_0
    return-void

    .line 30
    :cond_2
    iget-object v1, v0, Lkq;->β:Ljava/lang/Object;

    .line 31
    .line 32
    iget-object v0, v0, Lkq;->δ:Lmq;

    .line 33
    .line 34
    :try_start_1
    iget-wide v2, v0, Lmq;->δ:J

    .line 35
    .line 36
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 37
    .line 38
    .line 39
    move-result-wide v4

    .line 40
    cmp-long p0, v2, v4

    .line 41
    .line 42
    if-eqz p0, :cond_3

    .line 43
    .line 44
    return-void

    .line 45
    :cond_3
    invoke-static {v1}, Lf82;->ι(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 46
    .line 47
    .line 48
    return-void

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-static {p0}, Lln0;->з(Ljava/lang/Throwable;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    const-string v0, "onFeedMaybeChanged \u5f02\u5e38: "

    .line 58
    .line 59
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    const/4 v0, 0x4

    .line 64
    const-string v1, "DYHelper: VideoLengthAlert"

    .line 65
    .line 66
    const/4 v2, 0x0

    .line 67
    invoke-static {v1, p0, v2, v0, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public static ν(Landroid/content/Context;)V
    .locals 6

    .line 1
    :try_start_0
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    const-wide/16 v3, 0x12c

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    if-lt v0, v1, :cond_2

    .line 10
    .line 11
    const-string v0, "vibrator_manager"

    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-static {p0}, Lp1;->Ε(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0}, Lp1;->θ(Ljava/lang/Object;)Landroid/os/VibratorManager;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move-object p0, v5

    .line 29
    :goto_0
    if-eqz p0, :cond_1

    .line 30
    .line 31
    invoke-static {p0}, Lp1;->η(Landroid/os/VibratorManager;)Landroid/os/Vibrator;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    :cond_1
    if-eqz v5, :cond_4

    .line 36
    .line 37
    invoke-static {v3, v4, v2}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-virtual {v5, p0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V

    .line 42
    .line 43
    .line 44
    return-void

    .line 45
    :cond_2
    const-string v0, "vibrator"

    .line 46
    .line 47
    invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    instance-of v0, p0, Landroid/os/Vibrator;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    move-object v5, p0

    .line 56
    check-cast v5, Landroid/os/Vibrator;

    .line 57
    .line 58
    :cond_3
    if-eqz v5, :cond_4

    .line 59
    .line 60
    invoke-static {v3, v4, v2}, Landroid/os/VibrationEffect;->createOneShot(JI)Landroid/os/VibrationEffect;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-virtual {v5, p0}, Landroid/os/Vibrator;->vibrate(Landroid/os/VibrationEffect;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    .line 66
    .line 67
    :cond_4
    return-void

    .line 68
    :catchall_0
    move-exception p0

    .line 69
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static ξ(Ljava/lang/String;Z)Z
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Lf82;->β()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Lui1;->Α()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-static {p0, p1}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    return p0

    .line 15
    :catchall_0
    :cond_0
    return p1
.end method

.method public static ο(Ljava/lang/Object;)J
    .locals 2

    .line 1
    instance-of v0, p0, Ljava/lang/Long;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    return-wide v0

    .line 12
    :cond_0
    instance-of v0, p0, Ljava/lang/Integer;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    check-cast p0, Ljava/lang/Number;

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 19
    .line 20
    .line 21
    move-result p0

    .line 22
    int-to-long v0, p0

    .line 23
    return-wide v0

    .line 24
    :cond_1
    instance-of v0, p0, Ljava/lang/Number;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p0, Ljava/lang/Number;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    return-wide v0

    .line 35
    :cond_2
    instance-of v0, p0, Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    check-cast p0, Ljava/lang/String;

    .line 40
    .line 41
    const/16 v0, 0xa

    .line 42
    .line 43
    invoke-static {p0, v0}, Lx02;->Τ(Ljava/lang/String;I)Ljava/lang/Long;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    if-eqz p0, :cond_3

    .line 48
    .line 49
    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    return-wide v0

    .line 54
    :cond_3
    const-wide/16 v0, 0x0

    .line 55
    .line 56
    return-wide v0
.end method
