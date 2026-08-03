.class public final Ly9/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lr8/g;

.field public final b:Lib/b;

.field public final c:Ly9/b;

.field public final d:Ljava/util/Map;

.field public final e:Ljava/util/Map;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:Ljava/lang/ThreadLocal;

.field public final i:Landroid/content/SharedPreferences;

.field public volatile j:Z


# direct methods
.method public constructor <init>(Lr8/g;Lib/b;Ly9/b;)V
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
    iput-object p1, p0, Ly9/e;->a:Lr8/g;

    .line 8
    .line 9
    iput-object p2, p0, Ly9/e;->b:Lib/b;

    .line 10
    .line 11
    iput-object p3, p0, Ly9/e;->c:Ly9/b;

    .line 12
    .line 13
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    iput-object p2, p0, Ly9/e;->d:Ljava/util/Map;

    .line 18
    .line 19
    invoke-static {}, Lp/a;->p()Ljava/util/Map;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    iput-object p2, p0, Ly9/e;->e:Ljava/util/Map;

    .line 24
    .line 25
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object p2, p0, Ly9/e;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    new-instance p2, Ljava/util/concurrent/ConcurrentHashMap;

    .line 33
    .line 34
    invoke-direct {p2}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 35
    .line 36
    .line 37
    iput-object p2, p0, Ly9/e;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 38
    .line 39
    new-instance p2, Ljava/lang/ThreadLocal;

    .line 40
    .line 41
    invoke-direct {p2}, Ljava/lang/ThreadLocal;-><init>()V

    .line 42
    .line 43
    .line 44
    iput-object p2, p0, Ly9/e;->h:Ljava/lang/ThreadLocal;

    .line 45
    .line 46
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 47
    .line 48
    const-string p2, "Hchat_member_title_method_cache"

    .line 49
    .line 50
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iput-object p1, p0, Ly9/e;->i:Landroid/content/SharedPreferences;

    .line 55
    .line 56
    return-void
.end method

.method public static b(Ljava/lang/Object;)Ljava/lang/String;
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
    invoke-static {v4}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result v5

    .line 86
    if-eqz v5, :cond_6

    .line 87
    .line 88
    goto :goto_4

    .line 89
    :cond_6
    move-object v4, v0

    .line 90
    :goto_4
    if-nez v4, :cond_7

    .line 91
    .line 92
    goto :goto_5

    .line 93
    :cond_7
    move-object v6, v4

    .line 94
    :cond_8
    :goto_5
    invoke-static {v6}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v4

    .line 98
    if-eqz v4, :cond_9

    .line 99
    .line 100
    return-object v6

    .line 101
    :cond_9
    add-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    goto :goto_0
.end method

.method public static e(Landroid/text/SpannableStringBuilder;)V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    move v2, v1

    .line 4
    :goto_0
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 5
    .line 6
    .line 7
    move-result v3

    .line 8
    const/16 v4, 0x20

    .line 9
    .line 10
    const/4 v5, 0x1

    .line 11
    if-ge v1, v3, :cond_3

    .line 12
    .line 13
    invoke-virtual {p0, v1}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/16 v6, 0xa

    .line 18
    .line 19
    if-eq v3, v6, :cond_1

    .line 20
    .line 21
    const/16 v6, 0xd

    .line 22
    .line 23
    if-eq v3, v6, :cond_1

    .line 24
    .line 25
    const/16 v6, 0x9

    .line 26
    .line 27
    if-eq v3, v6, :cond_1

    .line 28
    .line 29
    if-eq v3, v4, :cond_1

    .line 30
    .line 31
    const/16 v4, 0x3000

    .line 32
    .line 33
    if-ne v3, v4, :cond_0

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 37
    .line 38
    move v2, v0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    :goto_1
    if-eqz v2, :cond_2

    .line 41
    .line 42
    add-int/lit8 v3, v1, 0x1

    .line 43
    .line 44
    invoke-virtual {p0, v1, v3}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    add-int/lit8 v2, v1, 0x1

    .line 49
    .line 50
    const-string v3, " "

    .line 51
    .line 52
    invoke-virtual {p0, v1, v2, v3}, Landroid/text/SpannableStringBuilder;->replace(IILjava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 53
    .line 54
    .line 55
    move v1, v2

    .line 56
    move v2, v5

    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :goto_2
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-lez v1, :cond_4

    .line 63
    .line 64
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-ne v1, v4, :cond_4

    .line 69
    .line 70
    invoke-virtual {p0, v0, v5}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 71
    .line 72
    .line 73
    goto :goto_2

    .line 74
    :cond_4
    :goto_3
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 75
    .line 76
    .line 77
    move-result v0

    .line 78
    if-lez v0, :cond_5

    .line 79
    .line 80
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    sub-int/2addr v0, v5

    .line 85
    invoke-virtual {p0, v0}, Landroid/text/SpannableStringBuilder;->charAt(I)C

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-ne v0, v4, :cond_5

    .line 90
    .line 91
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 92
    .line 93
    .line 94
    move-result v0

    .line 95
    sub-int/2addr v0, v5

    .line 96
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 97
    .line 98
    .line 99
    move-result v1

    .line 100
    invoke-virtual {p0, v0, v1}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    return-void
.end method

.method public static g(Ljava/lang/String;)Z
    .locals 2

    .line 1
    const-string v0, "@chatroom"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    const-string v0, "@im.chatroom"

    .line 11
    .line 12
    invoke-static {p0, v0, v1}, Log/t;->W(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 13
    .line 14
    .line 15
    move-result p0

    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    return v1

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static h(Ljava/lang/String;)Z
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

.method public static j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-lez v0, :cond_0

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    invoke-static {}, Lwb/en;->c()Lg8/i;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    if-eqz p0, :cond_2

    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lg8/i;->r(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    if-eqz p0, :cond_2

    .line 27
    .line 28
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    if-eqz p0, :cond_2

    .line 37
    .line 38
    const-string p1, "\\s+"

    .line 39
    .line 40
    const-string v0, " "

    .line 41
    .line 42
    invoke-static {p1, p0, v0}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-static {p0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_1

    .line 51
    .line 52
    const-string p1, "\u5fae\u4fe1\u7528\u6237("

    .line 53
    .line 54
    const/4 v0, 0x0

    .line 55
    invoke-static {p0, p1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    if-nez p1, :cond_1

    .line 60
    .line 61
    const-string p1, "\u5fae\u4fe1\u7528\u6237\uff08"

    .line 62
    .line 63
    invoke-static {p0, p1, v0}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    goto :goto_0

    .line 70
    :cond_1
    const/4 p0, 0x0

    .line 71
    :goto_0
    if-eqz p0, :cond_2

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_2
    const-string p0, "\u00a0"

    .line 75
    .line 76
    return-object p0
.end method

.method public static k(Landroid/text/SpannableStringBuilder;)V
    .locals 4

    .line 1
    :goto_0
    const-string v0, "\ufffc"

    .line 2
    .line 3
    invoke-static {p0, v0}, Log/m;->H0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_3

    .line 8
    .line 9
    const-string v0, " "

    .line 10
    .line 11
    const/4 v1, 0x6

    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-static {p0, v0, v2, v2, v1}, Log/m;->r0(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    const/4 v3, 0x1

    .line 22
    if-ltz v0, :cond_0

    .line 23
    .line 24
    move v0, v3

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move v0, v2

    .line 27
    :goto_1
    if-eqz v0, :cond_1

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_1
    const/4 v1, 0x0

    .line 31
    :goto_2
    if-eqz v1, :cond_3

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    add-int/2addr v0, v3

    .line 38
    invoke-virtual {p0}, Landroid/text/SpannableStringBuilder;->length()I

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-le v0, v1, :cond_2

    .line 43
    .line 44
    move v0, v1

    .line 45
    :cond_2
    invoke-virtual {p0, v2, v0}, Landroid/text/SpannableStringBuilder;->delete(II)Landroid/text/SpannableStringBuilder;

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    return-void
.end method


# virtual methods
.method public final a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 21

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
    iget-object v4, v1, Ly9/e;->b:Lib/b;

    .line 10
    .line 11
    iget-object v4, v4, Lib/b;->a:Landroid/content/SharedPreferences;

    .line 12
    .line 13
    invoke-static {v3}, Lzb/c;->b(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v5

    .line 17
    const/4 v6, 0x0

    .line 18
    if-eqz v5, :cond_23

    .line 19
    .line 20
    invoke-static {v2}, Ly9/e;->g(Ljava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result v5

    .line 24
    if-nez v5, :cond_0

    .line 25
    .line 26
    goto/16 :goto_15

    .line 27
    .line 28
    :cond_0
    new-instance v5, Ly9/d;

    .line 29
    .line 30
    invoke-direct {v5, v2, v3}, Ly9/d;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    iget-object v7, v1, Ly9/e;->e:Ljava/util/Map;

    .line 34
    .line 35
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    check-cast v7, Ljava/util/Map;

    .line 39
    .line 40
    invoke-interface {v7, v0, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->contact()Li8/a;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->c()Lg8/d;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    if-eqz v7, :cond_1

    .line 55
    .line 56
    invoke-virtual {v7, v2, v3}, Lg8/d;->j(Ljava/lang/String;Ljava/lang/String;)I

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    move v7, v6

    .line 62
    :goto_0
    invoke-static/range {p2 .. p3}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v8

    .line 66
    const-string v9, "custom_title_"

    .line 67
    .line 68
    invoke-virtual {v9, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const-string v9, ""

    .line 73
    .line 74
    invoke-interface {v4, v8, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    if-eqz v8, :cond_2

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_2
    move-object v8, v9

    .line 82
    :goto_1
    invoke-static {v8}, La7/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v8

    .line 86
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 87
    .line 88
    .line 89
    move-result v10

    .line 90
    const/4 v11, 0x2

    .line 91
    const/4 v12, 0x1

    .line 92
    if-nez v10, :cond_9

    .line 93
    .line 94
    if-eq v7, v12, :cond_4

    .line 95
    .line 96
    if-eq v7, v11, :cond_3

    .line 97
    .line 98
    const-string v10, "member_title"

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_3
    const-string v10, "owner_title"

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_4
    const-string v10, "admin_title"

    .line 105
    .line 106
    :goto_2
    if-eq v7, v12, :cond_6

    .line 107
    .line 108
    if-eq v7, v11, :cond_5

    .line 109
    .line 110
    const-string v13, "\u7fa4\u5458"

    .line 111
    .line 112
    goto :goto_3

    .line 113
    :cond_5
    const-string v13, "\u7fa4\u4e3b"

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    const-string v13, "\u7ba1\u7406\u5458"

    .line 117
    .line 118
    :goto_3
    invoke-interface {v4, v10, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v10

    .line 122
    if-eqz v10, :cond_7

    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_7
    move-object v10, v13

    .line 126
    :goto_4
    invoke-static {v10}, La7/a;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v10

    .line 130
    invoke-virtual {v10}, Ljava/lang/String;->length()I

    .line 131
    .line 132
    .line 133
    move-result v14

    .line 134
    if-nez v14, :cond_8

    .line 135
    .line 136
    goto :goto_5

    .line 137
    :cond_8
    move-object v13, v10

    .line 138
    :goto_5
    move-object v15, v13

    .line 139
    goto :goto_6

    .line 140
    :cond_9
    move-object v15, v8

    .line 141
    :goto_6
    invoke-virtual {v15}, Ljava/lang/String;->length()I

    .line 142
    .line 143
    .line 144
    move-result v10

    .line 145
    if-nez v10, :cond_a

    .line 146
    .line 147
    goto :goto_7

    .line 148
    :cond_a
    if-nez v7, :cond_b

    .line 149
    .line 150
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-nez v10, :cond_b

    .line 155
    .line 156
    const-string v10, "show_member"

    .line 157
    .line 158
    invoke-interface {v4, v10, v12}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 159
    .line 160
    .line 161
    move-result v10

    .line 162
    if-nez v10, :cond_b

    .line 163
    .line 164
    :goto_7
    invoke-virtual/range {p0 .. p1}, Ly9/e;->l(Landroid/widget/TextView;)V

    .line 165
    .line 166
    .line 167
    return v6

    .line 168
    :cond_b
    invoke-static/range {p2 .. p3}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    const-string v13, "custom_color_"

    .line 173
    .line 174
    invoke-virtual {v13, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object v10

    .line 178
    invoke-interface {v4, v10, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v10

    .line 182
    if-eqz v10, :cond_c

    .line 183
    .line 184
    goto :goto_8

    .line 185
    :cond_c
    move-object v10, v9

    .line 186
    :goto_8
    invoke-static {v10}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 187
    .line 188
    .line 189
    move-result-object v10

    .line 190
    if-eqz v10, :cond_d

    .line 191
    .line 192
    goto :goto_d

    .line 193
    :cond_d
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 194
    .line 195
    .line 196
    move-result v10

    .line 197
    if-lez v10, :cond_f

    .line 198
    .line 199
    const-string v10, "custom_color"

    .line 200
    .line 201
    const-string v13, "#2563EB"

    .line 202
    .line 203
    invoke-interface {v4, v10, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-static {v10}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 208
    .line 209
    .line 210
    move-result-object v10

    .line 211
    if-eqz v10, :cond_e

    .line 212
    .line 213
    goto :goto_d

    .line 214
    :cond_e
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 215
    .line 216
    .line 217
    move-result v10

    .line 218
    new-instance v13, Ly9/f;

    .line 219
    .line 220
    invoke-direct {v13, v10, v10}, Ly9/f;-><init>(II)V

    .line 221
    .line 222
    .line 223
    :goto_9
    move-object v10, v13

    .line 224
    goto :goto_d

    .line 225
    :cond_f
    if-eq v7, v12, :cond_11

    .line 226
    .line 227
    if-eq v7, v11, :cond_10

    .line 228
    .line 229
    const-string v10, "member_color"

    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_10
    const-string v10, "owner_color"

    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_11
    const-string v10, "admin_color"

    .line 236
    .line 237
    :goto_a
    if-eq v7, v12, :cond_13

    .line 238
    .line 239
    if-eq v7, v11, :cond_12

    .line 240
    .line 241
    const-string v13, "#64748B"

    .line 242
    .line 243
    goto :goto_b

    .line 244
    :cond_12
    const-string v13, "#F59E0B"

    .line 245
    .line 246
    goto :goto_b

    .line 247
    :cond_13
    const-string v13, "#22C55E"

    .line 248
    .line 249
    :goto_b
    invoke-interface {v4, v10, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 250
    .line 251
    .line 252
    move-result-object v10

    .line 253
    if-eqz v10, :cond_14

    .line 254
    .line 255
    goto :goto_c

    .line 256
    :cond_14
    move-object v10, v13

    .line 257
    :goto_c
    invoke-static {v10}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 258
    .line 259
    .line 260
    move-result-object v10

    .line 261
    if-eqz v10, :cond_15

    .line 262
    .line 263
    goto :goto_d

    .line 264
    :cond_15
    invoke-static {v13}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 265
    .line 266
    .line 267
    move-result v10

    .line 268
    new-instance v13, Ly9/f;

    .line 269
    .line 270
    invoke-direct {v13, v10, v10}, Ly9/f;-><init>(II)V

    .line 271
    .line 272
    .line 273
    goto :goto_9

    .line 274
    :goto_d
    invoke-static/range {p2 .. p3}, Lib/b;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v2

    .line 278
    const-string v13, "custom_text_color_"

    .line 279
    .line 280
    invoke-virtual {v13, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    invoke-interface {v4, v2, v9}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v2

    .line 288
    if-eqz v2, :cond_16

    .line 289
    .line 290
    goto :goto_e

    .line 291
    :cond_16
    move-object v2, v9

    .line 292
    :goto_e
    invoke-static {v2}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 293
    .line 294
    .line 295
    move-result-object v2

    .line 296
    if-eqz v2, :cond_17

    .line 297
    .line 298
    goto :goto_10

    .line 299
    :cond_17
    invoke-virtual {v8}, Ljava/lang/String;->length()I

    .line 300
    .line 301
    .line 302
    move-result v2

    .line 303
    const/4 v8, -0x1

    .line 304
    const-string v13, "#FFFFFF"

    .line 305
    .line 306
    if-lez v2, :cond_19

    .line 307
    .line 308
    const-string v2, "custom_text_color"

    .line 309
    .line 310
    invoke-interface {v4, v2, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 311
    .line 312
    .line 313
    move-result-object v2

    .line 314
    invoke-static {v2}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 315
    .line 316
    .line 317
    move-result-object v2

    .line 318
    if-eqz v2, :cond_18

    .line 319
    .line 320
    goto :goto_10

    .line 321
    :cond_18
    new-instance v2, Ly9/f;

    .line 322
    .line 323
    invoke-direct {v2, v8, v8}, Ly9/f;-><init>(II)V

    .line 324
    .line 325
    .line 326
    goto :goto_10

    .line 327
    :cond_19
    if-eq v7, v12, :cond_1b

    .line 328
    .line 329
    if-eq v7, v11, :cond_1a

    .line 330
    .line 331
    const-string v2, "member_text_color"

    .line 332
    .line 333
    goto :goto_f

    .line 334
    :cond_1a
    const-string v2, "owner_text_color"

    .line 335
    .line 336
    goto :goto_f

    .line 337
    :cond_1b
    const-string v2, "admin_text_color"

    .line 338
    .line 339
    :goto_f
    invoke-interface {v4, v2, v13}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 340
    .line 341
    .line 342
    move-result-object v2

    .line 343
    if-eqz v2, :cond_1c

    .line 344
    .line 345
    move-object v13, v2

    .line 346
    :cond_1c
    invoke-static {v13}, La7/a;->G(Ljava/lang/String;)Ly9/f;

    .line 347
    .line 348
    .line 349
    move-result-object v2

    .line 350
    if-eqz v2, :cond_1d

    .line 351
    .line 352
    goto :goto_10

    .line 353
    :cond_1d
    new-instance v2, Ly9/f;

    .line 354
    .line 355
    invoke-direct {v2, v8, v8}, Ly9/f;-><init>(II)V

    .line 356
    .line 357
    .line 358
    :goto_10
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 359
    .line 360
    .line 361
    move-result v4

    .line 362
    if-eqz v4, :cond_1e

    .line 363
    .line 364
    move v4, v12

    .line 365
    goto :goto_11

    .line 366
    :cond_1e
    move v4, v6

    .line 367
    :goto_11
    if-eqz v4, :cond_1f

    .line 368
    .line 369
    invoke-virtual {v0, v6}, Landroid/view/View;->setVisibility(I)V

    .line 370
    .line 371
    .line 372
    :cond_1f
    iget-object v7, v1, Ly9/e;->h:Ljava/lang/ThreadLocal;

    .line 373
    .line 374
    invoke-virtual {v7}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 375
    .line 376
    .line 377
    move-result-object v8

    .line 378
    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 379
    .line 380
    invoke-static {v8, v11}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 381
    .line 382
    .line 383
    move-result v8

    .line 384
    if-eqz v8, :cond_20

    .line 385
    .line 386
    goto/16 :goto_15

    .line 387
    .line 388
    :cond_20
    :try_start_0
    invoke-virtual {v7, v11}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 389
    .line 390
    .line 391
    invoke-static {v0}, La9/i;->d(Landroid/widget/TextView;)La9/c;

    .line 392
    .line 393
    .line 394
    move-result-object v8

    .line 395
    invoke-static {v0}, La9/i;->c(Landroid/widget/TextView;)Ljava/lang/CharSequence;

    .line 396
    .line 397
    .line 398
    move-result-object v11

    .line 399
    new-instance v13, Landroid/text/SpannableStringBuilder;

    .line 400
    .line 401
    if-eqz v4, :cond_21

    .line 402
    .line 403
    goto :goto_12

    .line 404
    :cond_21
    move-object v9, v11

    .line 405
    :goto_12
    invoke-direct {v13, v9}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 406
    .line 407
    .line 408
    invoke-static {v13}, Ly9/e;->k(Landroid/text/SpannableStringBuilder;)V

    .line 409
    .line 410
    .line 411
    invoke-static {v13}, Ly9/e;->e(Landroid/text/SpannableStringBuilder;)V

    .line 412
    .line 413
    .line 414
    invoke-virtual {v13}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 415
    .line 416
    .line 417
    move-result-object v4

    .line 418
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 419
    .line 420
    .line 421
    invoke-static {v4, v3}, Ly9/e;->j(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 422
    .line 423
    .line 424
    move-result-object v3

    .line 425
    invoke-virtual {v13}, Landroid/text/SpannableStringBuilder;->toString()Ljava/lang/String;

    .line 426
    .line 427
    .line 428
    move-result-object v4

    .line 429
    invoke-static {v4, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 430
    .line 431
    .line 432
    move-result v4

    .line 433
    if-nez v4, :cond_22

    .line 434
    .line 435
    invoke-virtual {v13}, Landroid/text/SpannableStringBuilder;->clear()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v13, v3}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    .line 439
    .line 440
    .line 441
    goto :goto_13

    .line 442
    :catchall_0
    move-exception v0

    .line 443
    goto :goto_14

    .line 444
    :cond_22
    :goto_13
    invoke-static {v8}, La9/i;->e(La9/c;)La9/d;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    iput-object v13, v3, La9/d;->a:Ljava/lang/CharSequence;

    .line 449
    .line 450
    invoke-static {v8}, La9/i;->a(La9/c;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 451
    .line 452
    .line 453
    :try_start_1
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setHorizontallyScrolling(Z)V

    .line 454
    .line 455
    .line 456
    const/4 v3, 0x0

    .line 457
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 458
    .line 459
    .line 460
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 461
    .line 462
    .line 463
    const v3, 0x7fffffff

    .line 464
    .line 465
    .line 466
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setMaxLines(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 467
    .line 468
    .line 469
    :catchall_1
    :try_start_2
    sget-object v0, La9/i;->a:Ljava/util/Map;

    .line 470
    .line 471
    iget v0, v10, Ly9/f;->a:I

    .line 472
    .line 473
    iget v3, v10, Ly9/f;->b:I

    .line 474
    .line 475
    iget v4, v2, Ly9/f;->a:I

    .line 476
    .line 477
    iget v2, v2, Ly9/f;->b:I

    .line 478
    .line 479
    new-instance v6, Lwb/zh;

    .line 480
    .line 481
    const/16 v9, 0x10

    .line 482
    .line 483
    invoke-direct {v6, v1, v8, v5, v9}, Lwb/zh;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 484
    .line 485
    .line 486
    invoke-static {v8}, La9/i;->f(La9/c;)La9/d;

    .line 487
    .line 488
    .line 489
    move-result-object v5

    .line 490
    new-instance v14, La9/g;

    .line 491
    .line 492
    move/from16 v16, v0

    .line 493
    .line 494
    move/from16 v19, v2

    .line 495
    .line 496
    move/from16 v17, v3

    .line 497
    .line 498
    move/from16 v18, v4

    .line 499
    .line 500
    move-object/from16 v20, v6

    .line 501
    .line 502
    invoke-direct/range {v14 .. v20}, La9/g;-><init>(Ljava/lang/String;IIIILwb/zh;)V

    .line 503
    .line 504
    .line 505
    iput-object v14, v5, La9/d;->c:La9/g;

    .line 506
    .line 507
    invoke-static {v8}, La9/i;->a(La9/c;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 508
    .line 509
    .line 510
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 511
    .line 512
    invoke-virtual {v7, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 513
    .line 514
    .line 515
    return v12

    .line 516
    :goto_14
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 517
    .line 518
    invoke-virtual {v7, v2}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 519
    .line 520
    .line 521
    throw v0

    .line 522
    :cond_23
    :goto_15
    return v6
.end method

.method public final varargs c([Ljava/lang/String;)Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Ly9/e;->a:Lr8/g;

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
    iget-object v0, p0, Ly9/e;->c:Ly9/b;

    .line 91
    .line 92
    const-string v1, "\u7fa4\u5458\u5934\u8854\u5b9a\u4f4d\u65b9\u6cd5\u5931\u8d25"

    .line 93
    .line 94
    invoke-virtual {v0, v1, p1}, Ly9/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final d(Ljava/lang/Class;)Ljava/lang/reflect/Field;
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
    iget-object v1, p0, Ly9/e;->f:Ljava/util/concurrent/ConcurrentHashMap;

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

.method public final f(Ljava/lang/Class;)Z
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
    iget-object v1, p0, Ly9/e;->g:Ljava/util/concurrent/ConcurrentHashMap;

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

.method public final i(Ljava/lang/reflect/Method;)Z
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
    invoke-virtual {p0, v3}, Ly9/e;->f(Ljava/lang/Class;)Z

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
    invoke-virtual {p0, p1}, Ly9/e;->d(Ljava/lang/Class;)Ljava/lang/reflect/Field;

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

.method public final l(Landroid/widget/TextView;)V
    .locals 4

    .line 1
    invoke-static {p1}, La9/i;->b(Landroid/widget/TextView;)La9/c;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {v0}, La9/i;->f(La9/c;)La9/d;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    new-instance v2, La9/g;

    .line 12
    .line 13
    invoke-direct {v2}, La9/g;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v2, v1, La9/d;->c:La9/g;

    .line 17
    .line 18
    invoke-static {v0}, La9/i;->a(La9/c;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-eqz v0, :cond_2

    .line 26
    .line 27
    iget-object v1, p0, Ly9/e;->h:Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 34
    .line 35
    invoke-static {v2, v3}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_1
    :try_start_0
    invoke-virtual {v1, v3}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    new-instance v2, Landroid/text/SpannableStringBuilder;

    .line 46
    .line 47
    invoke-direct {v2, v0}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 48
    .line 49
    .line 50
    invoke-static {v2}, Ly9/e;->k(Landroid/text/SpannableStringBuilder;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Ly9/e;->e(Landroid/text/SpannableStringBuilder;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    .line 58
    .line 59
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 60
    .line 61
    invoke-virtual {v1, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :catchall_0
    move-exception p1

    .line 66
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 67
    .line 68
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 69
    .line 70
    .line 71
    throw p1

    .line 72
    :cond_2
    :goto_0
    return-void
.end method
