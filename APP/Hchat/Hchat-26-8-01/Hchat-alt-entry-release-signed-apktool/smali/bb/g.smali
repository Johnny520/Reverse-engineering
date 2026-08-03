.class public final Lbb/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lbb/l;

.field public final c:Lib/b;

.field public final d:Lbb/k;

.field public final e:Lab/b;

.field public final f:Ljava/util/Map;

.field public final g:Ljava/util/Map;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap;

.field public final j:Ljava/lang/ThreadLocal;

.field public final k:Landroid/content/SharedPreferences;

.field public volatile l:Z

.field public m:Lbb/b;


# direct methods
.method public constructor <init>(Lr8/g;Lbb/l;Lib/b;Lbb/k;Lab/b;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lbb/g;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Lbb/g;->b:Lbb/l;

    .line 10
    .line 11
    iput-object p3, p0, Lbb/g;->c:Lib/b;

    .line 12
    .line 13
    iput-object p4, p0, Lbb/g;->d:Lbb/k;

    .line 14
    .line 15
    iput-object p5, p0, Lbb/g;->e:Lab/b;

    .line 16
    .line 17
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    iput-object p2, p0, Lbb/g;->f:Ljava/util/Map;

    .line 22
    .line 23
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 24
    .line 25
    .line 26
    move-result-object p2

    .line 27
    iput-object p2, p0, Lbb/g;->g:Ljava/util/Map;

    .line 28
    .line 29
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 30
    .line 31
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object p2, p0, Lbb/g;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 35
    .line 36
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 37
    .line 38
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 39
    .line 40
    .line 41
    iput-object p2, p0, Lbb/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 42
    .line 43
    new-instance p2, Ljava/lang/ThreadLocal;

    .line 44
    .line 45
    invoke-direct {p2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 46
    .line 47
    .line 48
    iput-object p2, p0, Lbb/g;->j:Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 51
    .line 52
    const-string p2, "Hchat_real_tail_method_cache"

    .line 53
    .line 54
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    iput-object p1, p0, Lbb/g;->k:Landroid/content/SharedPreferences;

    .line 59
    .line 60
    return-void
.end method

.method public static e(Ljava/lang/Object;)Ljava/lang/String;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    const-string v1, "field_xml"

    .line 6
    .line 7
    const-string v2, "xml"

    .line 8
    .line 9
    const-string v3, "field_content"

    .line 10
    .line 11
    const-string v4, "content"

    .line 12
    .line 13
    const-string v5, "msgContent"

    .line 14
    .line 15
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    const/4 v2, 0x0

    .line 20
    move v3, v2

    .line 21
    :goto_0
    const/4 v4, 0x5

    .line 22
    if-lt v3, v4, :cond_1

    .line 23
    .line 24
    :goto_1
    return-object v0

    .line 25
    :cond_1
    aget-object v4, v1, v3

    .line 26
    .line 27
    invoke-static {p0, v4}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v4

    .line 31
    instance-of v5, v4, Ljava/lang/String;

    .line 32
    .line 33
    if-eqz v5, :cond_2

    .line 34
    .line 35
    check-cast v4, Ljava/lang/String;

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    move-object v4, v0

    .line 39
    :goto_2
    if-eqz v4, :cond_9

    .line 40
    .line 41
    const-string v5, ":\n"

    .line 42
    .line 43
    const/4 v6, 0x6

    .line 44
    invoke-static {v4, v5, v2, v2, v6}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 45
    .line 46
    .line 47
    move-result v7

    .line 48
    if-lez v7, :cond_3

    .line 49
    .line 50
    invoke-static {v4, v5, v2, v2, v6}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    goto :goto_3

    .line 55
    :cond_3
    const-string v5, ":\r\n"

    .line 56
    .line 57
    invoke-static {v4, v5, v2, v2, v6}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 58
    .line 59
    .line 60
    move-result v7

    .line 61
    if-lez v7, :cond_4

    .line 62
    .line 63
    invoke-static {v4, v5, v2, v2, v6}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    goto :goto_3

    .line 68
    :cond_4
    const/4 v5, -0x1

    .line 69
    :goto_3
    const-string v6, ""

    .line 70
    .line 71
    if-lez v5, :cond_8

    .line 72
    .line 73
    const/16 v7, 0x50

    .line 74
    .line 75
    if-le v5, v7, :cond_5

    .line 76
    .line 77
    goto :goto_5

    .line 78
    :cond_5
    invoke-virtual {v4, v2, v5}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    sget-object v5, Lbb/l;->c:Log/k;

    .line 83
    .line 84
    invoke-static {v4}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v5

    .line 88
    if-eqz v5, :cond_6

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_6
    move-object v4, v0

    .line 92
    :goto_4
    if-nez v4, :cond_7

    .line 93
    .line 94
    goto :goto_5

    .line 95
    :cond_7
    move-object v6, v4

    .line 96
    :cond_8
    :goto_5
    sget-object v4, Lbb/l;->c:Log/k;

    .line 97
    .line 98
    invoke-static {v6}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_9

    .line 103
    .line 104
    return-object v6

    .line 105
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 106
    .line 107
    goto :goto_0
.end method

.method public static i(Landroid/widget/TextView;)V
    .locals 2

    .line 1
    invoke-static {p0}, La9/i;->b(Landroid/widget/TextView;)La9/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, La9/i;->f(La9/c;)La9/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    iput-object v1, v0, La9/d;->b:La9/a;

    .line 13
    .line 14
    invoke-static {p0}, La9/i;->a(La9/c;)V

    .line 15
    .line 16
    .line 17
    :cond_0
    return-void
.end method

.method public static j(Landroid/widget/TextView;)V
    .locals 2

    .line 1
    invoke-static {p0}, La9/i;->b(Landroid/widget/TextView;)La9/c;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    invoke-static {p0}, La9/i;->f(La9/c;)La9/d;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const-string v1, ""

    .line 12
    .line 13
    iput-object v1, v0, La9/d;->d:Ljava/lang/CharSequence;

    .line 14
    .line 15
    invoke-static {p0}, La9/i;->a(La9/c;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static l(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->account()Lg8/a;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {v0}, Lg8/a;->c()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-string v0, ""

    .line 16
    .line 17
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-lez v1, :cond_2

    .line 22
    .line 23
    invoke-virtual {v0, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    if-eqz p0, :cond_2

    .line 28
    .line 29
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_2
    const/4 p0, 0x0

    .line 32
    return p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 3

    .line 1
    invoke-static {p1, p1}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    sget-object v0, Lbb/l;->c:Log/k;

    .line 6
    .line 7
    invoke-static {p1}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->tasks()Lo8/j;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    new-instance v1, La1/d;

    .line 21
    .line 22
    const/4 v2, 0x4

    .line 23
    invoke-direct {v1, p0, v2, p1}, La1/d;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lo8/j;->e(Ljava/lang/Runnable;)V

    .line 27
    .line 28
    .line 29
    :cond_1
    :goto_0
    return-void
.end method

.method public final b(Landroid/widget/TextView;)V
    .locals 4

    .line 1
    iget-object v0, p0, Lbb/g;->c:Lib/b;

    .line 2
    .line 3
    iget-object v0, v0, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    invoke-static {p1}, La9/i;->d(Landroid/widget/TextView;)La9/c;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    const-string v1, "nickname_color"

    .line 17
    .line 18
    const-string v2, ""

    .line 19
    .line 20
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-static {v1}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    sget-object v2, Lbb/l;->c:Log/k;

    .line 29
    .line 30
    const-string v2, "nickname_weight"

    .line 31
    .line 32
    const/16 v3, 0x190

    .line 33
    .line 34
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    invoke-static {v0}, Lfb/v0;->h(I)I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    invoke-static {p1}, La9/i;->f(La9/c;)La9/d;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    new-instance v3, La9/a;

    .line 47
    .line 48
    invoke-direct {v3, v1, v0}, La9/a;-><init>(Ly9/f;I)V

    .line 49
    .line 50
    .line 51
    iput-object v3, v2, La9/d;->b:La9/a;

    .line 52
    .line 53
    invoke-static {p1}, La9/i;->a(La9/c;)V

    .line 54
    .line 55
    .line 56
    return-void
.end method

.method public final c(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p1

    .line 4
    .line 5
    move-object/from16 v2, p2

    .line 6
    .line 7
    move-object/from16 v3, p3

    .line 8
    .line 9
    sget-object v4, Lbb/l;->c:Log/k;

    .line 10
    .line 11
    invoke-static {v2}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result v4

    .line 15
    const/4 v5, 0x0

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    goto/16 :goto_10

    .line 19
    .line 20
    :cond_0
    iget-object v4, v1, Lbb/g;->g:Ljava/util/Map;

    .line 21
    .line 22
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    check-cast v4, Ljava/util/Map;

    .line 26
    .line 27
    invoke-interface {v4, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    iget-object v4, v1, Lbb/g;->b:Lbb/l;

    .line 31
    .line 32
    invoke-virtual {v4, v2}, Lbb/l;->c(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 37
    .line 38
    .line 39
    move-result v6

    .line 40
    if-nez v6, :cond_1

    .line 41
    .line 42
    invoke-static {v0}, Lbb/g;->j(Landroid/widget/TextView;)V

    .line 43
    .line 44
    .line 45
    return v5

    .line 46
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_2

    .line 51
    .line 52
    const/4 v6, 0x1

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    move v6, v5

    .line 55
    :goto_0
    if-eqz v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v0, v5}, Landroid/view/View;->setVisibility(I)V

    .line 58
    .line 59
    .line 60
    :cond_3
    invoke-static {v0}, La9/i;->d(Landroid/widget/TextView;)La9/c;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    invoke-static {v0}, La9/i;->c(Landroid/widget/TextView;)Ljava/lang/CharSequence;

    .line 65
    .line 66
    .line 67
    move-result-object v9

    .line 68
    new-instance v10, Landroid/text/SpannableStringBuilder;

    .line 69
    .line 70
    const-string v11, ""

    .line 71
    .line 72
    if-eqz v6, :cond_4

    .line 73
    .line 74
    move-object v9, v11

    .line 75
    :cond_4
    invoke-direct {v10, v9}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 76
    .line 77
    .line 78
    move v6, v5

    .line 79
    :goto_1
    const/16 v9, 0x28

    .line 80
    .line 81
    const/4 v12, 0x6

    .line 82
    const/4 v14, 0x4

    .line 83
    const-string v15, " "

    .line 84
    .line 85
    const/16 v16, 0x29

    .line 86
    .line 87
    const v17, 0xff09

    .line 88
    .line 89
    .line 90
    const v13, 0xff08

    .line 91
    .line 92
    .line 93
    if-ge v6, v14, :cond_e

    .line 94
    .line 95
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object v14

    .line 99
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    invoke-static {v14, v9, v5, v12}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 103
    .line 104
    .line 105
    move-result v7

    .line 106
    invoke-static {v14, v13, v5, v12}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 107
    .line 108
    .line 109
    move-result v9

    .line 110
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    .line 111
    .line 112
    .line 113
    move-result v7

    .line 114
    if-ltz v7, :cond_e

    .line 115
    .line 116
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 117
    .line 118
    .line 119
    move-result v9

    .line 120
    add-int/lit8 v9, v9, -0x2

    .line 121
    .line 122
    if-lt v7, v9, :cond_5

    .line 123
    .line 124
    goto/16 :goto_4

    .line 125
    .line 126
    :cond_5
    invoke-virtual {v14, v7}, Ljava/lang/String;->charAt(I)C

    .line 127
    .line 128
    .line 129
    move-result v9

    .line 130
    if-ne v9, v13, :cond_6

    .line 131
    .line 132
    move/from16 v9, v17

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_6
    move/from16 v9, v16

    .line 136
    .line 137
    :goto_2
    invoke-static {v14}, Log/m;->u0(Ljava/lang/CharSequence;)C

    .line 138
    .line 139
    .line 140
    move-result v13

    .line 141
    if-eq v13, v9, :cond_7

    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_7
    add-int/lit8 v9, v7, 0x1

    .line 145
    .line 146
    const/4 v13, 0x1

    .line 147
    invoke-static {v13, v9, v14}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v9

    .line 151
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 152
    .line 153
    .line 154
    move-result v13

    .line 155
    if-nez v13, :cond_8

    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_8
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 159
    .line 160
    .line 161
    move-result v13

    .line 162
    const/16 v14, 0x40

    .line 163
    .line 164
    if-le v13, v14, :cond_9

    .line 165
    .line 166
    goto :goto_4

    .line 167
    :cond_9
    const/16 v13, 0x2a

    .line 168
    .line 169
    invoke-static {v9, v13}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 170
    .line 171
    .line 172
    move-result v14

    .line 173
    if-eqz v14, :cond_a

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_a
    invoke-virtual {v9, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v13

    .line 180
    if-nez v13, :cond_d

    .line 181
    .line 182
    invoke-virtual {v4, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v13

    .line 186
    invoke-static {v9, v13, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 187
    .line 188
    .line 189
    move-result v13

    .line 190
    if-eqz v13, :cond_b

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_b
    const/4 v13, 0x1

    .line 194
    invoke-static {v13, v4}, Log/m;->Q0(ILjava/lang/String;)Ljava/lang/String;

    .line 195
    .line 196
    .line 197
    move-result-object v14

    .line 198
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v13

    .line 202
    if-lez v13, :cond_c

    .line 203
    .line 204
    invoke-static {v9, v14, v5}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 205
    .line 206
    .line 207
    move-result v13

    .line 208
    if-eqz v13, :cond_c

    .line 209
    .line 210
    goto :goto_3

    .line 211
    :cond_c
    const-string v13, " \u7537"

    .line 212
    .line 213
    invoke-static {v9, v13, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 214
    .line 215
    .line 216
    move-result v13

    .line 217
    if-nez v13, :cond_d

    .line 218
    .line 219
    const-string v13, " \u5973"

    .line 220
    .line 221
    invoke-static {v9, v13, v5}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 222
    .line 223
    .line 224
    move-result v9

    .line 225
    if-eqz v9, :cond_e

    .line 226
    .line 227
    :cond_d
    :goto_3
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 228
    .line 229
    .line 230
    move-result v9

    .line 231
    invoke-virtual {v10, v7, v9}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 232
    .line 233
    .line 234
    add-int/lit8 v6, v6, 0x1

    .line 235
    .line 236
    goto/16 :goto_1

    .line 237
    .line 238
    :cond_e
    :goto_4
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 239
    .line 240
    .line 241
    move-result v6

    .line 242
    if-eqz v6, :cond_f

    .line 243
    .line 244
    goto/16 :goto_6

    .line 245
    .line 246
    :cond_f
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object v6

    .line 250
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 251
    .line 252
    .line 253
    const/16 v7, 0x28

    .line 254
    .line 255
    invoke-static {v6, v7, v5, v12}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 256
    .line 257
    .line 258
    move-result v9

    .line 259
    const v7, 0xff08

    .line 260
    .line 261
    .line 262
    invoke-static {v6, v7, v5, v12}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 263
    .line 264
    .line 265
    move-result v13

    .line 266
    invoke-static {v9, v13}, Ljava/lang/Math;->max(II)I

    .line 267
    .line 268
    .line 269
    move-result v9

    .line 270
    if-ltz v9, :cond_16

    .line 271
    .line 272
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 273
    .line 274
    .line 275
    move-result v13

    .line 276
    add-int/lit8 v13, v13, -0x2

    .line 277
    .line 278
    if-lt v9, v13, :cond_10

    .line 279
    .line 280
    goto :goto_6

    .line 281
    :cond_10
    invoke-virtual {v6, v9}, Ljava/lang/String;->charAt(I)C

    .line 282
    .line 283
    .line 284
    move-result v13

    .line 285
    if-ne v13, v7, :cond_11

    .line 286
    .line 287
    move/from16 v7, v17

    .line 288
    .line 289
    goto :goto_5

    .line 290
    :cond_11
    move/from16 v7, v16

    .line 291
    .line 292
    :goto_5
    invoke-static {v6}, Log/m;->u0(Ljava/lang/CharSequence;)C

    .line 293
    .line 294
    .line 295
    move-result v13

    .line 296
    if-eq v13, v7, :cond_12

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_12
    add-int/lit8 v7, v9, 0x1

    .line 300
    .line 301
    const/4 v13, 0x1

    .line 302
    invoke-static {v13, v7, v6}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v6

    .line 306
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 307
    .line 308
    .line 309
    move-result v7

    .line 310
    if-nez v7, :cond_13

    .line 311
    .line 312
    goto :goto_6

    .line 313
    :cond_13
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 314
    .line 315
    .line 316
    move-result v7

    .line 317
    const/16 v14, 0x10

    .line 318
    .line 319
    if-le v7, v14, :cond_14

    .line 320
    .line 321
    goto :goto_6

    .line 322
    :cond_14
    invoke-static {v13, v3}, Log/m;->Q0(ILjava/lang/String;)Ljava/lang/String;

    .line 323
    .line 324
    .line 325
    move-result-object v7

    .line 326
    invoke-virtual {v6, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v3

    .line 330
    if-nez v3, :cond_15

    .line 331
    .line 332
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 333
    .line 334
    .line 335
    move-result v3

    .line 336
    if-lez v3, :cond_16

    .line 337
    .line 338
    invoke-static {v6, v7, v5}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 339
    .line 340
    .line 341
    move-result v3

    .line 342
    if-eqz v3, :cond_16

    .line 343
    .line 344
    :cond_15
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 345
    .line 346
    .line 347
    move-result v3

    .line 348
    invoke-virtual {v10, v9, v3}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 349
    .line 350
    .line 351
    :cond_16
    :goto_6
    move v3, v5

    .line 352
    :goto_7
    const/4 v6, 0x4

    .line 353
    if-ge v3, v6, :cond_1a

    .line 354
    .line 355
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v7

    .line 359
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 360
    .line 361
    .line 362
    const/16 v9, 0x28

    .line 363
    .line 364
    invoke-static {v7, v9, v5, v12}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 365
    .line 366
    .line 367
    move-result v13

    .line 368
    const v14, 0xff08

    .line 369
    .line 370
    .line 371
    invoke-static {v7, v14, v5, v12}, Log/m;->w0(Ljava/lang/String;CII)I

    .line 372
    .line 373
    .line 374
    move-result v6

    .line 375
    invoke-static {v13, v6}, Ljava/lang/Math;->max(II)I

    .line 376
    .line 377
    .line 378
    move-result v6

    .line 379
    if-ltz v6, :cond_1a

    .line 380
    .line 381
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 382
    .line 383
    .line 384
    move-result v13

    .line 385
    add-int/lit8 v13, v13, -0x2

    .line 386
    .line 387
    if-lt v6, v13, :cond_17

    .line 388
    .line 389
    goto :goto_9

    .line 390
    :cond_17
    invoke-virtual {v7, v6}, Ljava/lang/String;->charAt(I)C

    .line 391
    .line 392
    .line 393
    move-result v13

    .line 394
    if-ne v13, v14, :cond_18

    .line 395
    .line 396
    move/from16 v13, v17

    .line 397
    .line 398
    goto :goto_8

    .line 399
    :cond_18
    move/from16 v13, v16

    .line 400
    .line 401
    :goto_8
    invoke-static {v7}, Log/m;->u0(Ljava/lang/CharSequence;)C

    .line 402
    .line 403
    .line 404
    move-result v9

    .line 405
    if-eq v9, v13, :cond_19

    .line 406
    .line 407
    goto :goto_9

    .line 408
    :cond_19
    add-int/lit8 v9, v6, 0x1

    .line 409
    .line 410
    const/4 v13, 0x1

    .line 411
    invoke-static {v13, v9, v7}, Lwb/en;->f(IILjava/lang/String;)Ljava/lang/String;

    .line 412
    .line 413
    .line 414
    move-result-object v7

    .line 415
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 416
    .line 417
    .line 418
    move-result v9

    .line 419
    if-gt v13, v9, :cond_1a

    .line 420
    .line 421
    const/16 v13, 0x11

    .line 422
    .line 423
    if-ge v9, v13, :cond_1a

    .line 424
    .line 425
    const/16 v13, 0x2a

    .line 426
    .line 427
    invoke-static {v7, v13}, Log/m;->i0(Ljava/lang/CharSequence;C)Z

    .line 428
    .line 429
    .line 430
    move-result v7

    .line 431
    if-eqz v7, :cond_1a

    .line 432
    .line 433
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 434
    .line 435
    .line 436
    move-result v7

    .line 437
    invoke-virtual {v10, v6, v7}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 438
    .line 439
    .line 440
    add-int/lit8 v3, v3, 0x1

    .line 441
    .line 442
    goto :goto_7

    .line 443
    :cond_1a
    :goto_9
    move v3, v5

    .line 444
    move v6, v3

    .line 445
    :goto_a
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 446
    .line 447
    .line 448
    move-result v7

    .line 449
    const/16 v9, 0x20

    .line 450
    .line 451
    if-ge v6, v7, :cond_1e

    .line 452
    .line 453
    invoke-virtual {v10, v6}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 454
    .line 455
    .line 456
    move-result v7

    .line 457
    const/16 v12, 0xa

    .line 458
    .line 459
    if-eq v7, v12, :cond_1c

    .line 460
    .line 461
    const/16 v12, 0xd

    .line 462
    .line 463
    if-eq v7, v12, :cond_1c

    .line 464
    .line 465
    const/16 v12, 0x9

    .line 466
    .line 467
    if-eq v7, v12, :cond_1c

    .line 468
    .line 469
    if-eq v7, v9, :cond_1c

    .line 470
    .line 471
    const/16 v9, 0x3000

    .line 472
    .line 473
    if-ne v7, v9, :cond_1b

    .line 474
    .line 475
    goto :goto_b

    .line 476
    :cond_1b
    add-int/lit8 v6, v6, 0x1

    .line 477
    .line 478
    move v3, v5

    .line 479
    goto :goto_a

    .line 480
    :cond_1c
    :goto_b
    if-eqz v3, :cond_1d

    .line 481
    .line 482
    add-int/lit8 v7, v6, 0x1

    .line 483
    .line 484
    invoke-virtual {v10, v6, v7}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 485
    .line 486
    .line 487
    goto :goto_a

    .line 488
    :cond_1d
    add-int/lit8 v3, v6, 0x1

    .line 489
    .line 490
    invoke-virtual {v10, v6, v3, v15}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 491
    .line 492
    .line 493
    move v6, v3

    .line 494
    const/4 v3, 0x1

    .line 495
    goto :goto_a

    .line 496
    :cond_1e
    :goto_c
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 497
    .line 498
    .line 499
    move-result v3

    .line 500
    if-lez v3, :cond_1f

    .line 501
    .line 502
    invoke-virtual {v10, v5}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 503
    .line 504
    .line 505
    move-result v3

    .line 506
    if-ne v3, v9, :cond_1f

    .line 507
    .line 508
    const/4 v13, 0x1

    .line 509
    invoke-virtual {v10, v5, v13}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 510
    .line 511
    .line 512
    goto :goto_c

    .line 513
    :cond_1f
    :goto_d
    const/4 v13, 0x1

    .line 514
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 515
    .line 516
    .line 517
    move-result v3

    .line 518
    if-lez v3, :cond_20

    .line 519
    .line 520
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 521
    .line 522
    .line 523
    move-result v3

    .line 524
    sub-int/2addr v3, v13

    .line 525
    invoke-virtual {v10, v3}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 526
    .line 527
    .line 528
    move-result v3

    .line 529
    if-ne v3, v9, :cond_20

    .line 530
    .line 531
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    sub-int/2addr v3, v13

    .line 536
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->length()I

    .line 537
    .line 538
    .line 539
    move-result v6

    .line 540
    invoke-virtual {v10, v3, v6}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 541
    .line 542
    .line 543
    goto :goto_d

    .line 544
    :cond_20
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 549
    .line 550
    .line 551
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 556
    .line 557
    .line 558
    move-result-object v3

    .line 559
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 560
    .line 561
    .line 562
    move-result v6

    .line 563
    const-string v7, "\u5fae\u4fe1\u7528\u6237\uff08"

    .line 564
    .line 565
    const-string v9, "\u5fae\u4fe1\u7528\u6237("

    .line 566
    .line 567
    const/4 v12, 0x0

    .line 568
    if-lez v6, :cond_21

    .line 569
    .line 570
    goto :goto_f

    .line 571
    :cond_21
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 572
    .line 573
    .line 574
    move-result-object v3

    .line 575
    if-eqz v3, :cond_23

    .line 576
    .line 577
    invoke-virtual {v3, v2}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 578
    .line 579
    .line 580
    move-result-object v3

    .line 581
    if-eqz v3, :cond_23

    .line 582
    .line 583
    invoke-static {v3}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 584
    .line 585
    .line 586
    move-result-object v3

    .line 587
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 588
    .line 589
    .line 590
    move-result-object v3

    .line 591
    if-eqz v3, :cond_23

    .line 592
    .line 593
    const-string v6, "\\s+"

    .line 594
    .line 595
    invoke-static {v6, v3, v15}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 596
    .line 597
    .line 598
    move-result-object v3

    .line 599
    invoke-static {v3}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 600
    .line 601
    .line 602
    move-result v6

    .line 603
    if-nez v6, :cond_22

    .line 604
    .line 605
    invoke-static {v3, v9, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 606
    .line 607
    .line 608
    move-result v6

    .line 609
    if-nez v6, :cond_22

    .line 610
    .line 611
    invoke-static {v3, v7, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 612
    .line 613
    .line 614
    move-result v6

    .line 615
    if-nez v6, :cond_22

    .line 616
    .line 617
    goto :goto_e

    .line 618
    :cond_22
    move-object v3, v12

    .line 619
    :goto_e
    if-eqz v3, :cond_23

    .line 620
    .line 621
    goto :goto_f

    .line 622
    :cond_23
    const-string v3, "\u00a0"

    .line 623
    .line 624
    :goto_f
    invoke-static {v3, v9, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 625
    .line 626
    .line 627
    move-result v6

    .line 628
    if-nez v6, :cond_27

    .line 629
    .line 630
    invoke-static {v3, v7, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 631
    .line 632
    .line 633
    move-result v6

    .line 634
    if-eqz v6, :cond_24

    .line 635
    .line 636
    goto :goto_11

    .line 637
    :cond_24
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 638
    .line 639
    .line 640
    move-result-object v6

    .line 641
    invoke-static {v6, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 642
    .line 643
    .line 644
    move-result v6

    .line 645
    if-nez v6, :cond_25

    .line 646
    .line 647
    invoke-virtual {v10}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 648
    .line 649
    .line 650
    invoke-virtual {v10, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 651
    .line 652
    .line 653
    :cond_25
    iget-object v3, v1, Lbb/g;->j:Ljava/lang/ThreadLocal;

    .line 654
    .line 655
    invoke-virtual {v3}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 656
    .line 657
    .line 658
    move-result-object v6

    .line 659
    sget-object v7, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 660
    .line 661
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 662
    .line 663
    .line 664
    move-result v6

    .line 665
    if-eqz v6, :cond_26

    .line 666
    .line 667
    :goto_10
    return v5

    .line 668
    :cond_26
    :try_start_0
    invoke-virtual {v3, v7}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1, v2, v4}, Lbb/g;->f(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 672
    .line 673
    .line 674
    move-result-object v2

    .line 675
    invoke-static {v8}, La9/i;->e(La9/c;)La9/d;

    .line 676
    .line 677
    .line 678
    move-result-object v4

    .line 679
    iput-object v10, v4, La9/d;->a:Ljava/lang/CharSequence;

    .line 680
    .line 681
    invoke-static {v8}, La9/i;->a(La9/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 682
    .line 683
    .line 684
    :try_start_1
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 685
    .line 686
    .line 687
    invoke-virtual {v0, v12}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 688
    .line 689
    .line 690
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 691
    .line 692
    .line 693
    const v4, 0x7fffffff

    .line 694
    .line 695
    .line 696
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setMaxLines(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 697
    .line 698
    .line 699
    :catchall_0
    :try_start_2
    sget-object v0, La9/i;->a:Ljava/util/Map;

    .line 700
    .line 701
    invoke-virtual {v1, v2}, Lbb/g;->d(Ljava/util/ArrayList;)Landroid/text/SpannableStringBuilder;

    .line 702
    .line 703
    .line 704
    move-result-object v0

    .line 705
    invoke-static {v8}, La9/i;->f(La9/c;)La9/d;

    .line 706
    .line 707
    .line 708
    move-result-object v2

    .line 709
    iput-object v0, v2, La9/d;->d:Ljava/lang/CharSequence;

    .line 710
    .line 711
    invoke-static {v8}, La9/i;->a(La9/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 712
    .line 713
    .line 714
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 715
    .line 716
    invoke-virtual {v3, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 717
    .line 718
    .line 719
    const/16 v18, 0x1

    .line 720
    .line 721
    return v18

    .line 722
    :catchall_1
    move-exception v0

    .line 723
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 724
    .line 725
    invoke-virtual {v3, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 726
    .line 727
    .line 728
    throw v0

    .line 729
    :cond_27
    :goto_11
    invoke-static {v8}, La9/i;->f(La9/c;)La9/d;

    .line 730
    .line 731
    .line 732
    move-result-object v0

    .line 733
    iput-object v11, v0, La9/d;->d:Ljava/lang/CharSequence;

    .line 734
    .line 735
    invoke-static {v8}, La9/i;->a(La9/c;)V

    .line 736
    .line 737
    .line 738
    return v5
.end method

.method public final d(Ljava/util/ArrayList;)Landroid/text/SpannableStringBuilder;
    .locals 9

    .line 1
    new-instance v0, Landroid/text/SpannableStringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/text/SpannableStringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "bracket_color"

    .line 7
    .line 8
    iget-object v2, p0, Lbb/g;->b:Lbb/l;

    .line 9
    .line 10
    invoke-virtual {v2, v1}, Lbb/l;->b(Ljava/lang/String;)Ly9/f;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v3, "bracket_weight"

    .line 15
    .line 16
    invoke-virtual {v2, v3}, Lbb/l;->f(Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    const-string v4, "("

    .line 25
    .line 26
    invoke-virtual {v0, v4}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 27
    .line 28
    .line 29
    new-instance v4, La9/e;

    .line 30
    .line 31
    invoke-direct {v4, v1, v2}, La9/e;-><init>(Ly9/f;I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    const/16 v6, 0x21

    .line 39
    .line 40
    invoke-virtual {v0, v4, v3, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    const/4 v3, 0x0

    .line 48
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 49
    .line 50
    .line 51
    move-result v4

    .line 52
    if-eqz v4, :cond_2

    .line 53
    .line 54
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    add-int/lit8 v5, v3, 0x1

    .line 59
    .line 60
    if-ltz v3, :cond_1

    .line 61
    .line 62
    check-cast v4, Lbb/f;

    .line 63
    .line 64
    if-lez v3, :cond_0

    .line 65
    .line 66
    const-string v3, " "

    .line 67
    .line 68
    invoke-virtual {v0, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    iget-object v7, v4, Lbb/f;->a:Ljava/lang/String;

    .line 76
    .line 77
    invoke-virtual {v0, v7}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 78
    .line 79
    .line 80
    new-instance v7, La9/e;

    .line 81
    .line 82
    iget-object v8, v4, Lbb/f;->b:Ly9/f;

    .line 83
    .line 84
    iget v4, v4, Lbb/f;->c:I

    .line 85
    .line 86
    invoke-direct {v7, v8, v4}, La9/e;-><init>(Ly9/f;I)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 90
    .line 91
    .line 92
    move-result v4

    .line 93
    invoke-virtual {v0, v7, v3, v4, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 94
    .line 95
    .line 96
    move v3, v5

    .line 97
    goto :goto_0

    .line 98
    :cond_1
    invoke-static {}, La/a;->Q0()V

    .line 99
    .line 100
    .line 101
    const/4 p1, 0x0

    .line 102
    throw p1

    .line 103
    :cond_2
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 104
    .line 105
    .line 106
    move-result p1

    .line 107
    const-string v3, ")"

    .line 108
    .line 109
    invoke-virtual {v0, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 110
    .line 111
    .line 112
    new-instance v3, La9/e;

    .line 113
    .line 114
    invoke-direct {v3, v1, v2}, La9/e;-><init>(Ly9/f;I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 118
    .line 119
    .line 120
    move-result v1

    .line 121
    invoke-virtual {v0, v3, p1, v1, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 122
    .line 123
    .line 124
    return-object v0
.end method

.method public final f(Ljava/lang/String;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 10

    .line 1
    new-instance v0, Lbb/f;

    .line 2
    .line 3
    iget-object v1, p0, Lbb/g;->b:Lbb/l;

    .line 4
    .line 5
    const-string v2, "tail_color"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lbb/l;->b(Ljava/lang/String;)Ly9/f;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    const-string v3, "tail_weight"

    .line 12
    .line 13
    invoke-virtual {v1, v3}, Lbb/l;->f(Ljava/lang/String;)I

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    invoke-direct {v0, p2, v2, v3}, Lbb/f;-><init>(Ljava/lang/String;Ly9/f;I)V

    .line 18
    .line 19
    .line 20
    filled-new-array {v0}, [Lbb/f;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p2}, La/a;->C0([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 25
    .line 26
    .line 27
    move-result-object p2

    .line 28
    iget-object v0, v1, Lbb/l;->a:Landroid/content/SharedPreferences;

    .line 29
    .line 30
    const-string v2, "show_gender"

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    const/4 v4, 0x1

    .line 38
    const/4 v5, 0x0

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v2, p1}, Lg8/i;->s(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    goto :goto_0

    .line 52
    :cond_0
    move v2, v3

    .line 53
    :goto_0
    invoke-virtual {v1, v2}, Lbb/l;->d(I)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    if-lez v6, :cond_1

    .line 62
    .line 63
    move v6, v4

    .line 64
    goto :goto_1

    .line 65
    :cond_1
    move v6, v3

    .line 66
    :goto_1
    if-eqz v6, :cond_2

    .line 67
    .line 68
    move-object v6, v2

    .line 69
    goto :goto_2

    .line 70
    :cond_2
    move-object v6, v5

    .line 71
    :goto_2
    if-eqz v6, :cond_3

    .line 72
    .line 73
    new-instance v7, Lbb/f;

    .line 74
    .line 75
    const-string v8, "gender_color"

    .line 76
    .line 77
    invoke-virtual {v1, v8}, Lbb/l;->b(Ljava/lang/String;)Ly9/f;

    .line 78
    .line 79
    .line 80
    move-result-object v8

    .line 81
    const-string v9, "gender_weight"

    .line 82
    .line 83
    invoke-virtual {v1, v9}, Lbb/l;->f(Ljava/lang/String;)I

    .line 84
    .line 85
    .line 86
    move-result v9

    .line 87
    invoke-direct {v7, v6, v8, v9}, Lbb/f;-><init>(Ljava/lang/String;Ly9/f;I)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 94
    .line 95
    .line 96
    move-result v2

    .line 97
    if-nez v2, :cond_4

    .line 98
    .line 99
    iget-object v2, p0, Lbb/g;->m:Lbb/b;

    .line 100
    .line 101
    if-eqz v2, :cond_4

    .line 102
    .line 103
    invoke-virtual {v2, p1}, Lbb/b;->j(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_4
    const-string v2, "show_region"

    .line 107
    .line 108
    invoke-interface {v0, v2, v3}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_a

    .line 113
    .line 114
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 115
    .line 116
    .line 117
    move-result-object v0

    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    invoke-virtual {v0, p1}, Lg8/i;->z(Ljava/lang/String;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    if-eqz v0, :cond_5

    .line 125
    .line 126
    invoke-static {v0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    if-eqz v0, :cond_5

    .line 135
    .line 136
    const-string v2, "\\s+"

    .line 137
    .line 138
    const-string v6, " "

    .line 139
    .line 140
    invoke-static {v2, v0, v6}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    goto :goto_3

    .line 145
    :cond_5
    move-object v0, v5

    .line 146
    :goto_3
    if-nez v0, :cond_6

    .line 147
    .line 148
    const-string v0, ""

    .line 149
    .line 150
    :cond_6
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v2

    .line 154
    if-lez v2, :cond_7

    .line 155
    .line 156
    move v3, v4

    .line 157
    :cond_7
    if-eqz v3, :cond_8

    .line 158
    .line 159
    move-object v5, v0

    .line 160
    :cond_8
    if-eqz v5, :cond_9

    .line 161
    .line 162
    new-instance v2, Lbb/f;

    .line 163
    .line 164
    const-string v3, "region_color"

    .line 165
    .line 166
    invoke-virtual {v1, v3}, Lbb/l;->b(Ljava/lang/String;)Ly9/f;

    .line 167
    .line 168
    .line 169
    move-result-object v3

    .line 170
    const-string v4, "region_weight"

    .line 171
    .line 172
    invoke-virtual {v1, v4}, Lbb/l;->f(Ljava/lang/String;)I

    .line 173
    .line 174
    .line 175
    move-result v1

    .line 176
    invoke-direct {v2, v5, v3, v1}, Lbb/f;-><init>(Ljava/lang/String;Ly9/f;I)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p2, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    :cond_9
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 183
    .line 184
    .line 185
    move-result v0

    .line 186
    if-nez v0, :cond_a

    .line 187
    .line 188
    iget-object v0, p0, Lbb/g;->m:Lbb/b;

    .line 189
    .line 190
    if-eqz v0, :cond_a

    .line 191
    .line 192
    invoke-virtual {v0, p1}, Lbb/b;->j(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    :cond_a
    return-object p2
.end method

.method public final varargs g([Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lbb/g;->a:Lr8/g;

    .line 2
    .line 3
    :try_start_0
    iget-object v1, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 4
    .line 5
    new-instance v2, Lch/e;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    new-instance v3, Lfh/k;

    .line 11
    .line 12
    invoke-direct {v3}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {v3, p1}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 20
    .line 21
    .line 22
    iput-object v3, v2, Lch/e;->h:Lfh/k;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_2

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    check-cast v2, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 48
    .line 49
    :try_start_1
    iget-object v3, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 50
    .line 51
    invoke-virtual {v2, v3}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 52
    .line 53
    .line 54
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    goto :goto_1

    .line 56
    :catchall_0
    move-exception v2

    .line 57
    :try_start_2
    new-instance v3, Lsf/f;

    .line 58
    .line 59
    invoke-direct {v3, v2}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 60
    .line 61
    .line 62
    move-object v2, v3

    .line 63
    :goto_1
    nop

    .line 64
    instance-of v3, v2, Lsf/f;

    .line 65
    .line 66
    if-eqz v3, :cond_1

    .line 67
    .line 68
    const/4 v2, 0x0

    .line 69
    :cond_1
    check-cast v2, Ljava/lang/reflect/Method;

    .line 70
    .line 71
    if-eqz v2, :cond_0

    .line 72
    .line 73
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 74
    .line 75
    .line 76
    goto :goto_0

    .line 77
    :catchall_1
    move-exception p1

    .line 78
    new-instance v1, Lsf/f;

    .line 79
    .line 80
    invoke-direct {v1, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 81
    .line 82
    .line 83
    :cond_2
    invoke-static {v1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    if-nez p1, :cond_3

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_3
    iget-object v0, p0, Lbb/g;->e:Lab/b;

    .line 91
    .line 92
    const-string v1, "\u5b9e\u540d\u5c3e\u5b57\u5b9a\u4f4d\u65b9\u6cd5\u5931\u8d25"

    .line 93
    .line 94
    invoke-virtual {v0, v1, p1}, Lab/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 98
    .line 99
    :goto_2
    check-cast v1, Ljava/util/List;

    .line 100
    .line 101
    return-object v1
.end method

.method public final h(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    iget-object v1, p0, Lbb/g;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/reflect/Field;

    .line 13
    .line 14
    if-eqz v2, :cond_1

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_1
    move-object v2, p1

    .line 18
    :goto_0
    if-eqz v2, :cond_7

    .line 19
    .line 20
    const-class v3, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v3

    .line 26
    if-nez v3, :cond_7

    .line 27
    .line 28
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    :cond_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    .line 38
    .line 39
    move-result v4

    .line 40
    if-eqz v4, :cond_5

    .line 41
    .line 42
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    move-object v5, v4

    .line 47
    check-cast v5, Ljava/lang/reflect/Field;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    const-class v7, Landroid/widget/TextView;

    .line 54
    .line 55
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    const/4 v7, 0x0

    .line 60
    if-eqz v6, :cond_4

    .line 61
    .line 62
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    const-string v8, "userTV"

    .line 67
    .line 68
    invoke-static {v6, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_3

    .line 73
    .line 74
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    const-string v8, "brc"

    .line 79
    .line 80
    invoke-static {v6, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v6

    .line 84
    if-nez v6, :cond_3

    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v5

    .line 90
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    sget-object v6, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 94
    .line 95
    const-string v8, "user"

    .line 96
    .line 97
    invoke-static {v5, v6, v8, v7}, Lbc/e;->t(Ljava/lang/String;Ljava/util/Locale;Ljava/lang/String;Z)Z

    .line 98
    .line 99
    .line 100
    move-result v5

    .line 101
    if-eqz v5, :cond_4

    .line 102
    .line 103
    :cond_3
    const/4 v7, 0x1

    .line 104
    :cond_4
    if-eqz v7, :cond_2

    .line 105
    .line 106
    goto :goto_1

    .line 107
    :cond_5
    move-object v4, v0

    .line 108
    :goto_1
    check-cast v4, Ljava/lang/reflect/Field;

    .line 109
    .line 110
    if-eqz v4, :cond_6

    .line 111
    .line 112
    invoke-virtual {v1, p1, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    .line 114
    .line 115
    return-object v4

    .line 116
    :cond_6
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    goto :goto_0

    .line 121
    :cond_7
    :goto_2
    return-object v0
.end method

.method public final k(Ljava/lang/Class;)Z
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, Lbb/g;->i:Ljava/util/concurrent/ConcurrentHashMap;

    .line 6
    .line 7
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    check-cast v2, Ljava/lang/Boolean;

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    return p1

    .line 20
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "com.tencent.mm.storage."

    .line 25
    .line 26
    invoke-static {v2, v3, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    if-nez v2, :cond_5

    .line 32
    .line 33
    invoke-static {p1}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    if-eqz v2, :cond_2

    .line 38
    .line 39
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 40
    .line 41
    .line 42
    move-result v4

    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_2
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    :cond_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_6

    .line 55
    .line 56
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v4

    .line 60
    check-cast v4, Ljava/lang/reflect/Method;

    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v5

    .line 66
    const-class v6, Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-eqz v5, :cond_4

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    array-length v5, v5

    .line 82
    if-nez v5, :cond_4

    .line 83
    .line 84
    const-string v11, "getSender"

    .line 85
    .line 86
    const-string v12, "getSendTalker"

    .line 87
    .line 88
    const-string v6, "R1"

    .line 89
    .line 90
    const-string v7, "P1"

    .line 91
    .line 92
    const-string v8, "o0"

    .line 93
    .line 94
    const-string v9, "x0"

    .line 95
    .line 96
    const-string v10, "j0"

    .line 97
    .line 98
    filled-new-array/range {v6 .. v12}, [Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v4

    .line 106
    invoke-static {v5, v4}, Ltf/l;->m0([Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v4

    .line 110
    if-eqz v4, :cond_4

    .line 111
    .line 112
    move v4, v3

    .line 113
    goto :goto_0

    .line 114
    :cond_4
    move v4, v0

    .line 115
    :goto_0
    if-eqz v4, :cond_3

    .line 116
    .line 117
    :cond_5
    move v0, v3

    .line 118
    :cond_6
    :goto_1
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    invoke-virtual {v1, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    return v0
.end method

.method public final m(Ljava/lang/reflect/Method;)Z
    .locals 5

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    array-length v0, p1

    .line 6
    const/4 v1, 0x3

    .line 7
    const/4 v2, 0x0

    .line 8
    if-lt v0, v1, :cond_2

    .line 9
    .line 10
    array-length v0, p1

    .line 11
    move v1, v2

    .line 12
    :goto_0
    if-ge v1, v0, :cond_2

    .line 13
    .line 14
    aget-object v3, p1, v1

    .line 15
    .line 16
    const-class v4, Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    array-length v0, p1

    .line 33
    move v1, v2

    .line 34
    :goto_1
    if-ge v1, v0, :cond_2

    .line 35
    .line 36
    aget-object v3, p1, v1

    .line 37
    .line 38
    invoke-virtual {p0, v3}, Lbb/g;->k(Ljava/lang/Class;)Z

    .line 39
    .line 40
    .line 41
    move-result v3

    .line 42
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    if-eqz v3, :cond_0

    .line 51
    .line 52
    aget-object p1, p1, v2

    .line 53
    .line 54
    invoke-virtual {p0, p1}, Lbb/g;->h(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    if-eqz p1, :cond_2

    .line 59
    .line 60
    const/4 p1, 0x1

    .line 61
    return p1

    .line 62
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_2
    return v2
.end method
