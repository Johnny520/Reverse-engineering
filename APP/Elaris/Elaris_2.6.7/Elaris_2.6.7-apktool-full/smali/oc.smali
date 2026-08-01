.class public abstract Loc;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:[J

.field public static volatile c:Z

.field public static volatile d:J

.field public static volatile e:J

.field public static f:Landroid/os/Handler;

.field public static g:Lmc;

.field public static h:J

.field public static final i:[Ljava/lang/String;

.field public static final j:Ljava/lang/ThreadLocal;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    .line 1
    new-instance v0, Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Loc;->a:Ljava/lang/Object;

    .line 7
    .line 8
    const/4 v0, 0x3

    .line 9
    new-array v0, v0, [J

    .line 10
    .line 11
    fill-array-data v0, :array_0

    .line 12
    .line 13
    .line 14
    sput-object v0, Loc;->b:[J

    .line 15
    .line 16
    const/4 v0, 0x0

    .line 17
    sput-boolean v0, Loc;->c:Z

    .line 18
    .line 19
    const-wide/16 v0, 0x0

    .line 20
    .line 21
    sput-wide v0, Loc;->d:J

    .line 22
    .line 23
    sput-wide v0, Loc;->e:J

    .line 24
    .line 25
    const-string v10, "memberUid"

    .line 26
    .line 27
    const-string v11, "memberUin"

    .line 28
    .line 29
    const-string v2, "senderUid"

    .line 30
    .line 31
    const-string v3, "senderUin"

    .line 32
    .line 33
    const-string v4, "senderuin"

    .line 34
    .line 35
    const-string v5, "fromUid"

    .line 36
    .line 37
    const-string v6, "fromUin"

    .line 38
    .line 39
    const-string v7, "fromuin"

    .line 40
    .line 41
    const-string v8, "authorUid"

    .line 42
    .line 43
    const-string v9, "authorUin"

    .line 44
    .line 45
    filled-new-array/range {v2 .. v11}, [Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    sput-object v0, Loc;->i:[Ljava/lang/String;

    .line 50
    .line 51
    new-instance v0, Ljava/lang/ThreadLocal;

    .line 52
    .line 53
    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    .line 54
    .line 55
    .line 56
    sput-object v0, Loc;->j:Ljava/lang/ThreadLocal;

    .line 57
    .line 58
    return-void

    .line 59
    :array_0
    .array-data 8
        0x3c
        0xdc
        0x208
    .end array-data
.end method

.method public static a(Landroid/text/Spanned;)[I
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    :goto_0
    if-eqz v1, :cond_b

    .line 11
    .line 12
    if-nez p0, :cond_1

    .line 13
    .line 14
    goto/16 :goto_5

    .line 15
    .line 16
    :cond_1
    const/16 v2, 0xa0

    .line 17
    .line 18
    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    const-class v4, Ljava/lang/Object;

    .line 23
    .line 24
    invoke-interface {p0, v0, v3, v4}, Landroid/text/Spanned;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const/4 v5, -0x1

    .line 29
    move v6, v5

    .line 30
    :goto_1
    array-length v7, v4

    .line 31
    if-ge v0, v7, :cond_8

    .line 32
    .line 33
    aget-object v7, v4, v0

    .line 34
    .line 35
    if-nez v7, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    invoke-interface {p0, v7}, Landroid/text/Spanned;->getSpanStart(Ljava/lang/Object;)I

    .line 39
    .line 40
    .line 41
    move-result v8

    .line 42
    invoke-interface {p0, v7}, Landroid/text/Spanned;->getSpanEnd(Ljava/lang/Object;)I

    .line 43
    .line 44
    .line 45
    move-result v9

    .line 46
    if-ltz v8, :cond_7

    .line 47
    .line 48
    add-int/lit8 v10, v8, 0x1

    .line 49
    .line 50
    if-le v9, v10, :cond_7

    .line 51
    .line 52
    if-le v9, v3, :cond_3

    .line 53
    .line 54
    goto :goto_2

    .line 55
    :cond_3
    if-ge v8, v1, :cond_7

    .line 56
    .line 57
    invoke-interface {p0, v8}, Ljava/lang/CharSequence;->charAt(I)C

    .line 58
    .line 59
    .line 60
    move-result v10

    .line 61
    const/16 v11, 0x40

    .line 62
    .line 63
    if-eq v10, v11, :cond_4

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_4
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 75
    .line 76
    invoke-virtual {v7, v10}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    const-string v10, "at"

    .line 81
    .line 82
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 83
    .line 84
    .line 85
    move-result v10

    .line 86
    if-nez v10, :cond_5

    .line 87
    .line 88
    const-string v10, "mention"

    .line 89
    .line 90
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 91
    .line 92
    .line 93
    move-result v10

    .line 94
    if-nez v10, :cond_5

    .line 95
    .line 96
    const-string v10, "uin"

    .line 97
    .line 98
    invoke-virtual {v7, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-nez v7, :cond_5

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_5
    if-ltz v5, :cond_6

    .line 106
    .line 107
    if-ge v8, v5, :cond_7

    .line 108
    .line 109
    :cond_6
    move v5, v8

    .line 110
    move v6, v9

    .line 111
    :cond_7
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 112
    .line 113
    goto :goto_1

    .line 114
    :cond_8
    if-ltz v5, :cond_b

    .line 115
    .line 116
    if-ltz v6, :cond_a

    .line 117
    .line 118
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 119
    .line 120
    .line 121
    move-result v0

    .line 122
    :goto_3
    if-ge v6, v0, :cond_a

    .line 123
    .line 124
    invoke-interface {p0, v6}, Ljava/lang/CharSequence;->charAt(I)C

    .line 125
    .line 126
    .line 127
    move-result v1

    .line 128
    invoke-static {v1}, Ljava/lang/Character;->isWhitespace(C)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-nez v3, :cond_9

    .line 133
    .line 134
    const/16 v3, 0x2005

    .line 135
    .line 136
    if-eq v1, v3, :cond_9

    .line 137
    .line 138
    if-eq v1, v2, :cond_9

    .line 139
    .line 140
    goto :goto_4

    .line 141
    :cond_9
    add-int/lit8 v6, v6, 0x1

    .line 142
    .line 143
    goto :goto_3

    .line 144
    :cond_a
    :goto_4
    filled-new-array {v5, v6}, [I

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    return-object p0

    .line 149
    :cond_b
    :goto_5
    const/4 p0, 0x0

    .line 150
    return-object p0
.end method

.method public static b(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 6
    .line 7
    if-nez v1, :cond_4

    .line 8
    .line 9
    instance-of v1, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-nez v1, :cond_4

    .line 12
    .line 13
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 14
    .line 15
    if-nez v1, :cond_4

    .line 16
    .line 17
    instance-of v1, p0, Landroid/view/View;

    .line 18
    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    goto :goto_1

    .line 22
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 31
    .line 32
    invoke-virtual {p0, v1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    const-string v1, "aio"

    .line 37
    .line 38
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    const-string v1, "msg"

    .line 45
    .line 46
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_3

    .line 51
    .line 52
    const-string v1, "reply"

    .line 53
    .line 54
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v1

    .line 58
    if-nez v1, :cond_3

    .line 59
    .line 60
    const-string v1, "intent"

    .line 61
    .line 62
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 63
    .line 64
    .line 65
    move-result v1

    .line 66
    if-nez v1, :cond_3

    .line 67
    .line 68
    const-string v1, "record"

    .line 69
    .line 70
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_3

    .line 75
    .line 76
    const-string v1, "item"

    .line 77
    .line 78
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    if-nez v1, :cond_3

    .line 83
    .line 84
    const-string v1, "contact"

    .line 85
    .line 86
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    if-nez v1, :cond_3

    .line 91
    .line 92
    const-string v1, "member"

    .line 93
    .line 94
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 95
    .line 96
    .line 97
    move-result v1

    .line 98
    if-nez v1, :cond_3

    .line 99
    .line 100
    const-string v1, "user"

    .line 101
    .line 102
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_2

    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_2
    return v0

    .line 110
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 111
    return p0

    .line 112
    :catchall_0
    :cond_4
    :goto_1
    return v0
.end method

.method public static c(Ljava/util/ArrayList;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    add-int/lit8 v0, v0, -0x1

    .line 9
    .line 10
    :goto_0
    if-ltz v0, :cond_2

    .line 11
    .line 12
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    check-cast v1, Lnc;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    iget-object v2, v1, Lnc;->b:Ljava/lang/Object;

    .line 21
    .line 22
    iget-object v3, v1, Lnc;->a:Ljava/lang/String;

    .line 23
    .line 24
    iget-object v1, v1, Lnc;->c:Ljava/lang/Object;

    .line 25
    .line 26
    invoke-static {v2, v3, v1}, Lw4;->d(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_2
    :goto_1
    return-void
.end method

.method public static d(ILjava/lang/Object;)V
    .locals 8

    .line 1
    const-string v0, "reply auto-at stripped, start="

    .line 2
    .line 3
    const-string v1, "disable_reply_auto_at"

    .line 4
    .line 5
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    if-eqz v2, :cond_10

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 12
    .line 13
    .line 14
    move-result-wide v2

    .line 15
    sget-wide v4, Loc;->e:J

    .line 16
    .line 17
    cmp-long v2, v2, v4

    .line 18
    .line 19
    if-gtz v2, :cond_0

    .line 20
    .line 21
    return-void

    .line 22
    :cond_0
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_10

    .line 27
    .line 28
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 29
    .line 30
    .line 31
    move-result-wide v1

    .line 32
    sget-wide v3, Loc;->e:J

    .line 33
    .line 34
    cmp-long v1, v1, v3

    .line 35
    .line 36
    if-gtz v1, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 40
    .line 41
    .line 42
    move-result-wide v1

    .line 43
    sget-wide v3, Loc;->d:J

    .line 44
    .line 45
    cmp-long v1, v1, v3

    .line 46
    .line 47
    if-gtz v1, :cond_10

    .line 48
    .line 49
    if-eqz p1, :cond_10

    .line 50
    .line 51
    if-gez p0, :cond_2

    .line 52
    .line 53
    goto/16 :goto_6

    .line 54
    .line 55
    :cond_2
    instance-of v1, p1, Landroid/widget/EditText;

    .line 56
    .line 57
    const/4 v2, 0x0

    .line 58
    const/4 v3, 0x1

    .line 59
    if-eqz v1, :cond_b

    .line 60
    .line 61
    check-cast p1, Landroid/widget/EditText;

    .line 62
    .line 63
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 64
    .line 65
    .line 66
    move-result-wide v4

    .line 67
    sget-wide v6, Loc;->e:J

    .line 68
    .line 69
    cmp-long p0, v4, v6

    .line 70
    .line 71
    if-gtz p0, :cond_3

    .line 72
    .line 73
    return-void

    .line 74
    :cond_3
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 75
    .line 76
    sget-object v1, Loc;->j:Ljava/lang/ThreadLocal;

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    invoke-virtual {p0, v4}, Ljava/lang/Boolean;->equals(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v4

    .line 86
    if-eqz v4, :cond_4

    .line 87
    .line 88
    goto/16 :goto_6

    .line 89
    .line 90
    :cond_4
    :try_start_0
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 91
    .line 92
    .line 93
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 94
    if-eqz v4, :cond_a

    .line 95
    .line 96
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_a

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 103
    .line 104
    .line 105
    move-result v5

    .line 106
    const/4 v6, 0x0

    .line 107
    if-nez v5, :cond_5

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_5
    const/16 v7, 0xa0

    .line 111
    .line 112
    invoke-static {v5, v7}, Ljava/lang/Math;->min(II)I

    .line 113
    .line 114
    .line 115
    invoke-static {v4}, Loc;->a(Landroid/text/Spanned;)[I

    .line 116
    .line 117
    .line 118
    move-result-object v5

    .line 119
    if-eqz v5, :cond_6

    .line 120
    .line 121
    move-object v6, v5

    .line 122
    :cond_6
    :goto_0
    if-nez v6, :cond_7

    .line 123
    .line 124
    goto/16 :goto_6

    .line 125
    .line 126
    :cond_7
    aget v2, v6, v2

    .line 127
    .line 128
    aget v3, v6, v3

    .line 129
    .line 130
    if-gt v3, v2, :cond_8

    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 133
    .line 134
    .line 135
    return-void

    .line 136
    :cond_8
    invoke-virtual {v1, p0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 137
    .line 138
    .line 139
    :try_start_1
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 140
    .line 141
    .line 142
    move-result p0

    .line 143
    invoke-static {v3, p0}, Ljava/lang/Math;->min(II)I

    .line 144
    .line 145
    .line 146
    move-result p0

    .line 147
    invoke-interface {v4, v2, p0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    .line 149
    .line 150
    :try_start_2
    invoke-virtual {p1}, Landroid/widget/TextView;->length()I

    .line 151
    .line 152
    .line 153
    move-result p0

    .line 154
    invoke-static {v2, p0}, Ljava/lang/Math;->min(II)I

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    invoke-virtual {p1, p0}, Landroid/widget/EditText;->setSelection(I)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 159
    .line 160
    .line 161
    :catchall_0
    :try_start_3
    const-string p0, "debug_log"

    .line 162
    .line 163
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 164
    .line 165
    .line 166
    move-result p0

    .line 167
    if-eqz p0, :cond_9

    .line 168
    .line 169
    new-instance p0, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string p1, ", len="

    .line 178
    .line 179
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    sub-int/2addr v3, v2

    .line 183
    invoke-virtual {p0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object p0

    .line 190
    invoke-static {p0}, Lv4;->C(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 191
    .line 192
    .line 193
    goto :goto_1

    .line 194
    :catchall_1
    move-exception p0

    .line 195
    goto :goto_2

    .line 196
    :cond_9
    :goto_1
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 197
    .line 198
    .line 199
    goto/16 :goto_6

    .line 200
    .line 201
    :goto_2
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 202
    .line 203
    .line 204
    throw p0

    .line 205
    :cond_a
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->remove()V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :cond_b
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 210
    .line 211
    if-eqz v0, :cond_c

    .line 212
    .line 213
    check-cast p1, Landroid/view/ViewGroup;

    .line 214
    .line 215
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 216
    .line 217
    .line 218
    move-result v0

    .line 219
    const/16 v1, 0x50

    .line 220
    .line 221
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 222
    .line 223
    .line 224
    move-result v0

    .line 225
    :goto_3
    if-ge v2, v0, :cond_10

    .line 226
    .line 227
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    add-int/lit8 v4, p0, -0x1

    .line 232
    .line 233
    invoke-static {v4, v1}, Loc;->d(ILjava/lang/Object;)V

    .line 234
    .line 235
    .line 236
    add-int/lit8 v2, v2, 0x1

    .line 237
    .line 238
    goto :goto_3

    .line 239
    :cond_c
    instance-of v0, p1, Ljava/lang/CharSequence;

    .line 240
    .line 241
    if-nez v0, :cond_10

    .line 242
    .line 243
    instance-of v0, p1, Ljava/lang/Number;

    .line 244
    .line 245
    if-nez v0, :cond_10

    .line 246
    .line 247
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 248
    .line 249
    if-eqz v0, :cond_d

    .line 250
    .line 251
    goto :goto_6

    .line 252
    :cond_d
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    move-result-object v0

    .line 256
    :goto_4
    if-eqz v0, :cond_10

    .line 257
    .line 258
    const-class v1, Ljava/lang/Object;

    .line 259
    .line 260
    if-eq v0, v1, :cond_10

    .line 261
    .line 262
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 263
    .line 264
    .line 265
    move-result-object v1

    .line 266
    array-length v4, v1

    .line 267
    move v5, v2

    .line 268
    :goto_5
    if-ge v5, v4, :cond_f

    .line 269
    .line 270
    aget-object v6, v1, v5

    .line 271
    .line 272
    :try_start_4
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 273
    .line 274
    .line 275
    move-result v7

    .line 276
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 277
    .line 278
    .line 279
    move-result v7

    .line 280
    if-nez v7, :cond_e

    .line 281
    .line 282
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 283
    .line 284
    .line 285
    move-result-object v7

    .line 286
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 287
    .line 288
    .line 289
    move-result v7

    .line 290
    if-nez v7, :cond_e

    .line 291
    .line 292
    invoke-virtual {v6, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 293
    .line 294
    .line 295
    invoke-virtual {v6, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    move-result-object v6

    .line 299
    add-int/lit8 v7, p0, -0x1

    .line 300
    .line 301
    invoke-static {v7, v6}, Loc;->d(ILjava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 302
    .line 303
    .line 304
    :catchall_2
    :cond_e
    add-int/lit8 v5, v5, 0x1

    .line 305
    .line 306
    goto :goto_5

    .line 307
    :cond_f
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 308
    .line 309
    .line 310
    move-result-object v0

    .line 311
    goto :goto_4

    .line 312
    :catchall_3
    :cond_10
    :goto_6
    return-void
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 6

    .line 1
    const/4 v0, 0x5

    .line 2
    invoke-static {v0, p0}, Loc;->d(ILjava/lang/Object;)V

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Loc;->d(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    :try_start_0
    sget-object v0, Loc;->a:Ljava/lang/Object;

    .line 9
    .line 10
    monitor-enter v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 11
    :try_start_1
    sget-object v1, Loc;->f:Landroid/os/Handler;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    new-instance v1, Landroid/os/Handler;

    .line 16
    .line 17
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-direct {v1, v2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Loc;->f:Landroid/os/Handler;

    .line 25
    .line 26
    :cond_0
    sget-object v1, Loc;->f:Landroid/os/Handler;

    .line 27
    .line 28
    sget-object v2, Loc;->g:Lmc;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :catchall_0
    move-exception p0

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    sget-wide v2, Loc;->h:J

    .line 39
    .line 40
    const-wide/16 v4, 0x1

    .line 41
    .line 42
    add-long/2addr v2, v4

    .line 43
    sput-wide v2, Loc;->h:J

    .line 44
    .line 45
    new-instance v4, Lmc;

    .line 46
    .line 47
    invoke-direct {v4, v2, v3, p0, p1}, Lmc;-><init>(JLjava/lang/Object;Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    sput-object v4, Loc;->g:Lmc;

    .line 51
    .line 52
    sget-object p0, Loc;->b:[J

    .line 53
    .line 54
    const/4 p1, 0x0

    .line 55
    aget-wide p0, p0, p1

    .line 56
    .line 57
    invoke-virtual {v1, v4, p0, p1}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 58
    .line 59
    .line 60
    monitor-exit v0

    .line 61
    return-void

    .line 62
    :goto_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    :try_start_2
    throw p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 64
    :catchall_1
    move-exception p0

    .line 65
    const-string p1, "reply-no-at"

    .line 66
    .line 67
    const-string v0, "delayed-scrub"

    .line 68
    .line 69
    invoke-static {p1, v0, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public static f(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/Set;)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    if-eqz v0, :cond_14

    .line 8
    .line 9
    if-gez p2, :cond_0

    .line 10
    .line 11
    goto/16 :goto_7

    .line 12
    .line 13
    :cond_0
    instance-of v3, v0, Ljava/lang/CharSequence;

    .line 14
    .line 15
    if-nez v3, :cond_14

    .line 16
    .line 17
    instance-of v3, v0, Ljava/lang/Number;

    .line 18
    .line 19
    if-nez v3, :cond_14

    .line 20
    .line 21
    instance-of v3, v0, Ljava/lang/Boolean;

    .line 22
    .line 23
    if-nez v3, :cond_14

    .line 24
    .line 25
    instance-of v3, v0, Landroid/view/View;

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    goto/16 :goto_7

    .line 30
    .line 31
    :cond_1
    if-eqz v2, :cond_2

    .line 32
    .line 33
    invoke-interface {v2, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-nez v3, :cond_2

    .line 38
    .line 39
    goto/16 :goto_7

    .line 40
    .line 41
    :cond_2
    const/4 v3, 0x0

    .line 42
    move v4, v3

    .line 43
    :goto_0
    const/4 v5, 0x1

    .line 44
    const/16 v6, 0xa

    .line 45
    .line 46
    if-ge v4, v6, :cond_f

    .line 47
    .line 48
    sget-object v6, Loc;->i:[Ljava/lang/String;

    .line 49
    .line 50
    aget-object v6, v6, v4

    .line 51
    .line 52
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v7

    .line 56
    invoke-static {v7, v6}, Lw4;->a(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 57
    .line 58
    .line 59
    move-result-object v7

    .line 60
    if-nez v7, :cond_3

    .line 61
    .line 62
    goto/16 :goto_3

    .line 63
    .line 64
    :cond_3
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-class v8, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 72
    .line 73
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    const-class v10, Ljava/lang/Long;

    .line 76
    .line 77
    const-class v11, Ljava/lang/Integer;

    .line 78
    .line 79
    sget-object v12, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    if-eq v5, v8, :cond_4

    .line 82
    .line 83
    :try_start_1
    const-class v8, Ljava/lang/CharSequence;

    .line 84
    .line 85
    invoke-virtual {v8, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 86
    .line 87
    .line 88
    move-result v8

    .line 89
    if-nez v8, :cond_4

    .line 90
    .line 91
    if-eq v5, v9, :cond_4

    .line 92
    .line 93
    if-eq v5, v11, :cond_4

    .line 94
    .line 95
    if-eq v5, v12, :cond_4

    .line 96
    .line 97
    if-ne v5, v10, :cond_e

    .line 98
    .line 99
    :cond_4
    if-ne v5, v9, :cond_5

    .line 100
    .line 101
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I

    .line 102
    .line 103
    .line 104
    move-result v8

    .line 105
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    goto :goto_1

    .line 110
    :cond_5
    if-ne v5, v12, :cond_6

    .line 111
    .line 112
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->getLong(Ljava/lang/Object;)J

    .line 113
    .line 114
    .line 115
    move-result-wide v13

    .line 116
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    invoke-virtual {v7, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v8

    .line 125
    :goto_1
    const-wide/16 v13, 0x0

    .line 126
    .line 127
    if-eq v5, v9, :cond_8

    .line 128
    .line 129
    if-eq v5, v11, :cond_8

    .line 130
    .line 131
    if-eq v5, v12, :cond_8

    .line 132
    .line 133
    if-ne v5, v10, :cond_7

    .line 134
    .line 135
    goto :goto_2

    .line 136
    :cond_7
    if-eqz v8, :cond_e

    .line 137
    .line 138
    invoke-static {v8}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v15

    .line 142
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result v15

    .line 146
    if-nez v15, :cond_9

    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_8
    :goto_2
    instance-of v15, v8, Ljava/lang/Number;

    .line 150
    .line 151
    if-eqz v15, :cond_e

    .line 152
    .line 153
    move-object v15, v8

    .line 154
    check-cast v15, Ljava/lang/Number;

    .line 155
    .line 156
    invoke-virtual {v15}, Ljava/lang/Number;->longValue()J

    .line 157
    .line 158
    .line 159
    move-result-wide v15

    .line 160
    cmp-long v15, v15, v13

    .line 161
    .line 162
    if-nez v15, :cond_9

    .line 163
    .line 164
    goto :goto_3

    .line 165
    :cond_9
    new-instance v15, Lnc;

    .line 166
    .line 167
    invoke-direct {v15, v0, v6, v8}, Lnc;-><init>(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v1, v15}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    if-ne v5, v9, :cond_a

    .line 174
    .line 175
    invoke-virtual {v7, v0, v3}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 176
    .line 177
    .line 178
    goto :goto_3

    .line 179
    :cond_a
    if-ne v5, v12, :cond_b

    .line 180
    .line 181
    invoke-virtual {v7, v0, v13, v14}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 182
    .line 183
    .line 184
    goto :goto_3

    .line 185
    :cond_b
    if-ne v5, v11, :cond_c

    .line 186
    .line 187
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 188
    .line 189
    .line 190
    move-result-object v5

    .line 191
    invoke-virtual {v7, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 192
    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_c
    if-ne v5, v10, :cond_d

    .line 196
    .line 197
    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 198
    .line 199
    .line 200
    move-result-object v5

    .line 201
    invoke-virtual {v7, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    .line 204
    goto :goto_3

    .line 205
    :cond_d
    const-string v5, ""

    .line 206
    .line 207
    invoke-virtual {v7, v0, v5}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 208
    .line 209
    .line 210
    :catchall_0
    :cond_e
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 211
    .line 212
    goto/16 :goto_0

    .line 213
    .line 214
    :cond_f
    if-nez p2, :cond_10

    .line 215
    .line 216
    goto :goto_7

    .line 217
    :cond_10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    move-result-object v4

    .line 221
    :goto_4
    if-eqz v4, :cond_14

    .line 222
    .line 223
    const-class v6, Ljava/lang/Object;

    .line 224
    .line 225
    if-eq v4, v6, :cond_14

    .line 226
    .line 227
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 228
    .line 229
    .line 230
    move-result-object v6

    .line 231
    array-length v7, v6

    .line 232
    move v8, v3

    .line 233
    :goto_5
    if-ge v8, v7, :cond_13

    .line 234
    .line 235
    aget-object v9, v6, v8

    .line 236
    .line 237
    :try_start_2
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 238
    .line 239
    .line 240
    move-result v10

    .line 241
    invoke-static {v10}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 242
    .line 243
    .line 244
    move-result v10

    .line 245
    if-nez v10, :cond_12

    .line 246
    .line 247
    invoke-virtual {v9}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v10

    .line 251
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 252
    .line 253
    .line 254
    move-result v10

    .line 255
    if-eqz v10, :cond_11

    .line 256
    .line 257
    goto :goto_6

    .line 258
    :cond_11
    invoke-virtual {v9, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 259
    .line 260
    .line 261
    invoke-virtual {v9, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    .line 263
    .line 264
    move-result-object v9

    .line 265
    invoke-static {v9}, Loc;->b(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-eqz v10, :cond_12

    .line 270
    .line 271
    add-int/lit8 v10, p2, -0x1

    .line 272
    .line 273
    invoke-static {v9, v1, v10, v2}, Loc;->f(Ljava/lang/Object;Ljava/util/ArrayList;ILjava/util/Set;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 274
    .line 275
    .line 276
    :catchall_1
    :cond_12
    :goto_6
    add-int/lit8 v8, v8, 0x1

    .line 277
    .line 278
    goto :goto_5

    .line 279
    :cond_13
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 280
    .line 281
    .line 282
    move-result-object v4

    .line 283
    goto :goto_4

    .line 284
    :cond_14
    :goto_7
    return-void
.end method
