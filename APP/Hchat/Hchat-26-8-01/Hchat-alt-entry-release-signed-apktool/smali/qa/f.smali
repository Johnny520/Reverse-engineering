.class public final Lqa/f;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final l:Ljava/util/Set;

.field public static final m:Ljava/util/List;


# instance fields
.field public final a:Lr8/g;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/util/WeakHashMap;

.field public final e:Ljava/util/WeakHashMap;

.field public final f:Ljava/lang/ThreadLocal;

.field public final g:Ljava/lang/ThreadLocal;

.field public volatile h:Z

.field public volatile i:Z

.field public volatile j:Z

.field public volatile k:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const-string v0, "setFirstMoney"

    .line 2
    .line 3
    const-string v1, "setNewMoney"

    .line 4
    .line 5
    const-string v2, "setMoney"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lqa/f;->l:Ljava/util/Set;

    .line 16
    .line 17
    const-string v0, "\u5546\u6237\u4f59\u989d"

    .line 18
    .line 19
    const-string v1, "\u5546\u5bb6\u8d26\u6237"

    .line 20
    .line 21
    const-string v2, "\u7ecf\u8425\u8d26\u6237"

    .line 22
    .line 23
    const-string v3, "\u7ecf\u8425\u8d26\u53f7"

    .line 24
    .line 25
    const-string v4, "\u5546\u6237\u8d26\u6237"

    .line 26
    .line 27
    filled-new-array {v2, v3, v4, v0, v1}, [Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    sput-object v0, Lqa/f;->m:Ljava/util/List;

    .line 36
    .line 37
    return-void
.end method

.method public constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lqa/f;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_fake_wallet_balance_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lqa/f;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v0, "Hchat_fake_wallet_balance_method_cache"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iput-object p1, p0, Lqa/f;->c:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    new-instance p1, Ljava/util/WeakHashMap;

    .line 28
    .line 29
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 30
    .line 31
    .line 32
    iput-object p1, p0, Lqa/f;->d:Ljava/util/WeakHashMap;

    .line 33
    .line 34
    new-instance p1, Ljava/util/WeakHashMap;

    .line 35
    .line 36
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 40
    .line 41
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 42
    .line 43
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object p1, p0, Lqa/f;->f:Ljava/lang/ThreadLocal;

    .line 47
    .line 48
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 49
    .line 50
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object p1, p0, Lqa/f;->g:Ljava/lang/ThreadLocal;

    .line 54
    .line 55
    return-void
.end method

.method public static final a(Lqa/f;Lqa/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 8

    .line 1
    iget-object p0, p0, Lqa/f;->b:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const-string v1, "fake_wallet_balance_mode_lqt"

    .line 8
    .line 9
    const-string v2, "fake_wallet_business_amount"

    .line 10
    .line 11
    const-string v3, "fake_wallet_lqt_amount"

    .line 12
    .line 13
    const/4 v4, 0x2

    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    const/4 v5, 0x1

    .line 17
    if-eq v0, v5, :cond_1

    .line 18
    .line 19
    if-ne v0, v4, :cond_0

    .line 20
    .line 21
    new-instance v0, Lsf/e;

    .line 22
    .line 23
    const-string v5, "fake_wallet_balance_mode_business"

    .line 24
    .line 25
    invoke-direct {v0, v2, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    new-instance v0, Lsf/e;

    .line 35
    .line 36
    invoke-direct {v0, v3, v1}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_2
    new-instance v0, Lsf/e;

    .line 41
    .line 42
    const-string v5, "fake_wallet_balance_amount"

    .line 43
    .line 44
    const-string v6, "fake_wallet_balance_mode_balance"

    .line 45
    .line 46
    invoke-direct {v0, v5, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    :goto_0
    iget-object v5, v0, Lsf/e;->g:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v5, Ljava/lang/String;

    .line 52
    .line 53
    iget-object v0, v0, Lsf/e;->h:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast v0, Ljava/lang/String;

    .line 56
    .line 57
    const-string v6, "0.00"

    .line 58
    .line 59
    sget-object v7, Lqa/b;->i:Lqa/b;

    .line 60
    .line 61
    if-ne p1, v7, :cond_3

    .line 62
    .line 63
    invoke-interface {p0, v3, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    :cond_3
    invoke-interface {p0, v5, v6}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    const-string v5, "fixed"

    .line 72
    .line 73
    if-ne p1, v7, :cond_4

    .line 74
    .line 75
    invoke-interface {p0, v2}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 76
    .line 77
    .line 78
    move-result p1

    .line 79
    if-nez p1, :cond_4

    .line 80
    .line 81
    sget-object p1, Lqa/g;->a:Log/k;

    .line 82
    .line 83
    invoke-static {p0, v1, v6, v5}, Lqa/g;->b(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    goto :goto_1

    .line 88
    :cond_4
    move-object p1, v5

    .line 89
    :goto_1
    sget-object v1, Lqa/g;->a:Log/k;

    .line 90
    .line 91
    invoke-static {p0, v0, v3, p1}, Lqa/g;->b(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p0

    .line 95
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Lqa/g;->a(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    invoke-virtual {p1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 106
    .line 107
    .line 108
    move-result-object p1

    .line 109
    invoke-static {p2}, Lqa/g;->a(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 110
    .line 111
    .line 112
    move-result-object p2

    .line 113
    invoke-static {p0, v5}, Lqa/g;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    const-string v0, "increase"

    .line 118
    .line 119
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v0

    .line 123
    if-eqz v0, :cond_5

    .line 124
    .line 125
    invoke-virtual {p2, p1}, Ljava/math/BigDecimal;->add(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    goto :goto_2

    .line 130
    :cond_5
    const-string v0, "decrease"

    .line 131
    .line 132
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    if-eqz p0, :cond_6

    .line 137
    .line 138
    invoke-virtual {p2, p1}, Ljava/math/BigDecimal;->subtract(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    :cond_6
    :goto_2
    sget-object p0, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 143
    .line 144
    invoke-virtual {p1, p0}, Ljava/math/BigDecimal;->max(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    sget-object p1, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    .line 149
    .line 150
    invoke-virtual {p0, v4, p1}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 151
    .line 152
    .line 153
    move-result-object p0

    .line 154
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 159
    .line 160
    .line 161
    return-object p0
.end method

.method public static final b(Lqa/f;Landroid/view/View;Ljava/lang/String;)Z
    .locals 5

    .line 1
    iget-object v0, p0, Lqa/f;->f:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    new-instance v0, Ljava/util/ArrayDeque;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/ArrayDeque;-><init>()V

    .line 15
    .line 16
    .line 17
    iget-object v1, p0, Lqa/f;->f:Ljava/lang/ThreadLocal;

    .line 18
    .line 19
    invoke-virtual {v1, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 20
    .line 21
    .line 22
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 25
    .line 26
    .line 27
    iget-object v0, p0, Lqa/f;->g:Ljava/lang/ThreadLocal;

    .line 28
    .line 29
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, Lqa/a;

    .line 34
    .line 35
    const/4 v1, 0x0

    .line 36
    if-eqz v0, :cond_3

    .line 37
    .line 38
    const/4 v2, 0x1

    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    :goto_1
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    if-ge v1, v3, :cond_2

    .line 48
    .line 49
    invoke-virtual {p2, v1}, Ljava/lang/String;->charAt(I)C

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_1

    .line 58
    .line 59
    sget-object v1, Lqa/g;->a:Log/k;

    .line 60
    .line 61
    iget-object v1, v0, Lqa/a;->b:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {v1}, Lqa/g;->a(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {v1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p2, v1}, Lqa/f;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    iget-object v3, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 79
    .line 80
    monitor-enter v3

    .line 81
    :try_start_0
    iget-object p0, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 82
    .line 83
    new-instance v4, Lqa/c;

    .line 84
    .line 85
    iget-object v0, v0, Lqa/a;->a:Lqa/b;

    .line 86
    .line 87
    invoke-direct {v4, v0, v1, p2}, Lqa/c;-><init>(Lqa/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, p1, v4}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    monitor-exit v3

    .line 94
    return v2

    .line 95
    :catchall_0
    move-exception p0

    .line 96
    monitor-exit v3

    .line 97
    throw p0

    .line 98
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 99
    .line 100
    goto :goto_1

    .line 101
    :cond_2
    return v2

    .line 102
    :cond_3
    return v1
.end method

.method public static final c(Lqa/f;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lqa/f;->g:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    iget-object p0, p0, Lqa/f;->f:Ljava/lang/ThreadLocal;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    check-cast v1, Ljava/util/ArrayDeque;

    .line 10
    .line 11
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result v2

    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_0
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    check-cast v2, Ljava/lang/Boolean;

    .line 31
    .line 32
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->remove()V

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v1}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    invoke-virtual {p0}, Ljava/lang/ThreadLocal;->remove()V

    .line 48
    .line 49
    .line 50
    :cond_2
    return-void
.end method

.method public static final d(Lqa/f;Lqa/b;)Z
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    const/4 v0, 0x1

    .line 8
    if-eq p1, v0, :cond_1

    .line 9
    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p1, v0, :cond_0

    .line 12
    .line 13
    const-string p1, "fake_wallet_balance_enable_business"

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-static {}, Lokio/a;->k()V

    .line 17
    .line 18
    .line 19
    const/4 p0, 0x0

    .line 20
    return p0

    .line 21
    :cond_1
    const-string p1, "fake_wallet_balance_enable_lqt"

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_2
    const-string p1, "fake_wallet_balance_enable_balance"

    .line 25
    .line 26
    :goto_0
    sget-object v0, Lqa/g;->a:Log/k;

    .line 27
    .line 28
    iget-object p0, p0, Lqa/f;->b:Landroid/content/SharedPreferences;

    .line 29
    .line 30
    invoke-static {p0, p1}, Lqa/g;->c(Landroid/content/SharedPreferences;Ljava/lang/String;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    return p0
.end method

.method public static final e(Lqa/f;Lqa/b;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lqa/f;->f:Ljava/lang/ThreadLocal;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/ArrayDeque;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayDeque;->removeLast()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/ArrayDeque;->addLast(Ljava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    iget-object p0, p0, Lqa/f;->g:Ljava/lang/ThreadLocal;

    .line 27
    .line 28
    new-instance v0, Lqa/a;

    .line 29
    .line 30
    invoke-direct {v0, p1, p2}, Lqa/a;-><init>(Lqa/b;Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v0}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_1
    :goto_0
    return-void
.end method

.method public static final f(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-object p3

    .line 4
    :cond_0
    iget-object v0, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lqa/c;

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    iget-object v2, v1, Lqa/c;->a:Lqa/b;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception p0

    .line 21
    goto :goto_4

    .line 22
    :cond_1
    const/4 v2, 0x0

    .line 23
    :goto_0
    if-ne v2, p2, :cond_5

    .line 24
    .line 25
    iget-object v2, v1, Lqa/c;->c:Ljava/lang/String;

    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    move v4, v3

    .line 29
    :goto_1
    invoke-virtual {p3}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    if-ge v4, v5, :cond_4

    .line 34
    .line 35
    invoke-virtual {p3, v4}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    if-eqz v5, :cond_3

    .line 44
    .line 45
    move v4, v3

    .line 46
    :goto_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-ge v4, v5, :cond_4

    .line 51
    .line 52
    invoke-virtual {v2, v4}, Ljava/lang/String;->charAt(I)C

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-static {v5}, Ljava/lang/Character;->isDigit(C)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_2

    .line 61
    .line 62
    invoke-static {p3}, Lqa/g;->a(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    invoke-static {v2}, Lqa/g;->a(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    invoke-virtual {v4, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-nez v2, :cond_4

    .line 75
    .line 76
    const/4 v3, 0x1

    .line 77
    goto :goto_3

    .line 78
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_4
    :goto_3
    if-eqz v3, :cond_5

    .line 85
    .line 86
    sget-object p0, Lqa/g;->a:Log/k;

    .line 87
    .line 88
    iget-object p0, v1, Lqa/c;->b:Ljava/lang/String;

    .line 89
    .line 90
    invoke-static {p0}, Lqa/g;->a(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-virtual {p0}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object p0

    .line 98
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 99
    .line 100
    .line 101
    invoke-static {p3, p0}, Lqa/f;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    monitor-exit v0

    .line 106
    return-object p0

    .line 107
    :cond_5
    :try_start_1
    iget-object p0, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 108
    .line 109
    new-instance v1, Lqa/c;

    .line 110
    .line 111
    invoke-direct {v1, p2, p3, p3}, Lqa/c;-><init>(Lqa/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 115
    .line 116
    .line 117
    monitor-exit v0

    .line 118
    return-object p3

    .line 119
    :goto_4
    monitor-exit v0

    .line 120
    throw p0
.end method

.method public static final g(Lqa/f;Landroid/view/View;Lqa/b;Ljava/lang/String;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    iget-object v0, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 5
    .line 6
    monitor-enter v0

    .line 7
    :try_start_0
    iget-object v1, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Lqa/c;

    .line 14
    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    iget-object v2, v1, Lqa/c;->a:Lqa/b;

    .line 18
    .line 19
    if-ne v2, p2, :cond_1

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_1
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-eqz v1, :cond_2

    .line 24
    .line 25
    iget-object v1, v1, Lqa/c;->b:Ljava/lang/String;

    .line 26
    .line 27
    if-eqz v1, :cond_2

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object v1, p3

    .line 33
    :goto_1
    iget-object p0, p0, Lqa/f;->e:Ljava/util/WeakHashMap;

    .line 34
    .line 35
    new-instance v2, Lqa/c;

    .line 36
    .line 37
    invoke-direct {v2, p2, v1, p3}, Lqa/c;-><init>(Lqa/b;Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    .line 43
    monitor-exit v0

    .line 44
    return-void

    .line 45
    :goto_2
    monitor-exit v0

    .line 46
    throw p0
.end method

.method public static final h(Lqa/f;Lqa/b;)Z
    .locals 0

    .line 1
    sget-object p0, Lqa/b;->h:Lqa/b;

    .line 2
    .line 3
    if-eq p1, p0, :cond_1

    .line 4
    .line 5
    sget-object p0, Lqa/b;->i:Lqa/b;

    .line 6
    .line 7
    if-ne p1, p0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0

    .line 12
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 13
    return p0
.end method

.method public static final i(Lqa/f;Landroid/view/View;)Lqa/b;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    move-object v1, p1

    .line 3
    move v2, v0

    .line 4
    :goto_0
    sget-object v3, Lqa/b;->h:Lqa/b;

    .line 5
    .line 6
    sget-object v4, Lqa/b;->g:Lqa/b;

    .line 7
    .line 8
    const/4 v5, 0x0

    .line 9
    if-eqz v1, :cond_9

    .line 10
    .line 11
    const/16 v6, 0x8

    .line 12
    .line 13
    if-ge v2, v6, :cond_9

    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    if-eqz v6, :cond_0

    .line 20
    .line 21
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v6

    .line 25
    goto :goto_1

    .line 26
    :cond_0
    move-object v6, v5

    .line 27
    :goto_1
    invoke-static {v6}, Lqa/f;->r(Ljava/lang/String;)Lqa/b;

    .line 28
    .line 29
    .line 30
    move-result-object v6

    .line 31
    if-eqz v6, :cond_1

    .line 32
    .line 33
    goto/16 :goto_5

    .line 34
    .line 35
    :cond_1
    instance-of v6, v1, Landroid/widget/TextView;

    .line 36
    .line 37
    if-eqz v6, :cond_3

    .line 38
    .line 39
    move-object v6, v1

    .line 40
    check-cast v6, Landroid/widget/TextView;

    .line 41
    .line 42
    invoke-virtual {v6}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 43
    .line 44
    .line 45
    move-result-object v6

    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v6

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v6, v5

    .line 54
    :goto_2
    invoke-static {v6}, Lqa/f;->r(Ljava/lang/String;)Lqa/b;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    if-eqz v6, :cond_3

    .line 59
    .line 60
    goto :goto_5

    .line 61
    :cond_3
    invoke-virtual {v1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    instance-of v7, v6, Landroid/view/View;

    .line 66
    .line 67
    if-eqz v7, :cond_4

    .line 68
    .line 69
    check-cast v6, Landroid/view/View;

    .line 70
    .line 71
    goto :goto_3

    .line 72
    :cond_4
    move-object v6, v5

    .line 73
    :goto_3
    instance-of v7, v6, Landroid/view/ViewGroup;

    .line 74
    .line 75
    if-eqz v7, :cond_8

    .line 76
    .line 77
    move-object v7, v6

    .line 78
    check-cast v7, Landroid/view/ViewGroup;

    .line 79
    .line 80
    new-instance v8, Lgg/q;

    .line 81
    .line 82
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 83
    .line 84
    .line 85
    new-instance v9, Lgg/q;

    .line 86
    .line 87
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v10, Lgg/q;

    .line 91
    .line 92
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    new-instance v11, Lb0/s;

    .line 96
    .line 97
    invoke-direct {v11, p0, v10, v9, v8}, Lb0/s;-><init>(Lqa/f;Lgg/q;Lgg/q;Lgg/q;)V

    .line 98
    .line 99
    .line 100
    invoke-static {v7, v1, v0, v11}, Lqa/f;->j(Landroid/view/View;Landroid/view/View;ILb0/s;)V

    .line 101
    .line 102
    .line 103
    iget-boolean v1, v10, Lgg/q;->g:Z

    .line 104
    .line 105
    if-eqz v1, :cond_5

    .line 106
    .line 107
    sget-object v1, Lqa/b;->i:Lqa/b;

    .line 108
    .line 109
    goto :goto_4

    .line 110
    :cond_5
    iget-boolean v1, v9, Lgg/q;->g:Z

    .line 111
    .line 112
    if-eqz v1, :cond_6

    .line 113
    .line 114
    move-object v1, v3

    .line 115
    goto :goto_4

    .line 116
    :cond_6
    iget-boolean v1, v8, Lgg/q;->g:Z

    .line 117
    .line 118
    if-eqz v1, :cond_7

    .line 119
    .line 120
    move-object v1, v4

    .line 121
    goto :goto_4

    .line 122
    :cond_7
    move-object v1, v5

    .line 123
    :goto_4
    if-eqz v1, :cond_8

    .line 124
    .line 125
    move-object v6, v1

    .line 126
    goto :goto_5

    .line 127
    :cond_8
    add-int/lit8 v2, v2, 0x1

    .line 128
    .line 129
    move-object v1, v6

    .line 130
    goto :goto_0

    .line 131
    :cond_9
    move-object v6, v5

    .line 132
    :goto_5
    if-eqz v6, :cond_a

    .line 133
    .line 134
    return-object v6

    .line 135
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    :goto_6
    instance-of p1, p0, Landroid/content/ContextWrapper;

    .line 140
    .line 141
    if-eqz p1, :cond_c

    .line 142
    .line 143
    instance-of p1, p0, Landroid/app/Activity;

    .line 144
    .line 145
    if-eqz p1, :cond_b

    .line 146
    .line 147
    check-cast p0, Landroid/app/Activity;

    .line 148
    .line 149
    goto :goto_7

    .line 150
    :cond_b
    check-cast p0, Landroid/content/ContextWrapper;

    .line 151
    .line 152
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    goto :goto_6

    .line 157
    :cond_c
    instance-of p1, p0, Landroid/app/Activity;

    .line 158
    .line 159
    if-eqz p1, :cond_d

    .line 160
    .line 161
    check-cast p0, Landroid/app/Activity;

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_d
    move-object p0, v5

    .line 165
    :goto_7
    const-string p1, "mallwallet"

    .line 166
    .line 167
    const-string v1, "mallindexui"

    .line 168
    .line 169
    const-string v2, "walletbalancemanagerui"

    .line 170
    .line 171
    const-string v6, "lqt"

    .line 172
    .line 173
    if-eqz p0, :cond_17

    .line 174
    .line 175
    invoke-virtual {p0}, Landroid/app/Activity;->getTitle()Ljava/lang/CharSequence;

    .line 176
    .line 177
    .line 178
    move-result-object v7

    .line 179
    if-eqz v7, :cond_e

    .line 180
    .line 181
    invoke-virtual {v7}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v7

    .line 185
    goto :goto_8

    .line 186
    :cond_e
    move-object v7, v5

    .line 187
    :goto_8
    invoke-static {v7}, Lqa/f;->r(Ljava/lang/String;)Lqa/b;

    .line 188
    .line 189
    .line 190
    move-result-object v7

    .line 191
    if-eqz v7, :cond_f

    .line 192
    .line 193
    goto :goto_d

    .line 194
    :cond_f
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 195
    .line 196
    .line 197
    move-result-object p0

    .line 198
    :goto_9
    if-eqz p0, :cond_17

    .line 199
    .line 200
    const-class v7, Landroid/app/Activity;

    .line 201
    .line 202
    invoke-virtual {p0, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v7

    .line 206
    if-nez v7, :cond_17

    .line 207
    .line 208
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v7

    .line 212
    sget-object v8, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 213
    .line 214
    invoke-static {v8, v7, v8}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 215
    .line 216
    .line 217
    move-result-object v7

    .line 218
    invoke-static {v7, v6, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 219
    .line 220
    .line 221
    move-result v8

    .line 222
    if-eqz v8, :cond_10

    .line 223
    .line 224
    :goto_a
    move-object v7, v3

    .line 225
    goto :goto_d

    .line 226
    :cond_10
    const-string v8, "moneyfund"

    .line 227
    .line 228
    invoke-static {v7, v8, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 229
    .line 230
    .line 231
    move-result v8

    .line 232
    if-eqz v8, :cond_11

    .line 233
    .line 234
    goto :goto_a

    .line 235
    :cond_11
    invoke-static {v7, v2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 236
    .line 237
    .line 238
    move-result v8

    .line 239
    if-eqz v8, :cond_12

    .line 240
    .line 241
    :goto_b
    move-object v7, v4

    .line 242
    goto :goto_d

    .line 243
    :cond_12
    invoke-static {v7, v1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 244
    .line 245
    .line 246
    move-result v8

    .line 247
    if-eqz v8, :cond_13

    .line 248
    .line 249
    :goto_c
    goto :goto_b

    .line 250
    :cond_13
    invoke-static {v7, p1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 251
    .line 252
    .line 253
    move-result v8

    .line 254
    if-eqz v8, :cond_14

    .line 255
    .line 256
    goto :goto_c

    .line 257
    :cond_14
    const-string v8, ".wallet.balance.ui."

    .line 258
    .line 259
    invoke-static {v7, v8, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 260
    .line 261
    .line 262
    move-result v8

    .line 263
    if-eqz v8, :cond_15

    .line 264
    .line 265
    goto :goto_b

    .line 266
    :cond_15
    const-string v8, ".plugin.mall.ui."

    .line 267
    .line 268
    invoke-static {v7, v8, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 269
    .line 270
    .line 271
    move-result v7

    .line 272
    if-eqz v7, :cond_16

    .line 273
    .line 274
    goto :goto_c

    .line 275
    :cond_16
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object p0

    .line 279
    goto :goto_9

    .line 280
    :cond_17
    move-object v7, v5

    .line 281
    :goto_d
    if-eqz v7, :cond_18

    .line 282
    .line 283
    return-object v7

    .line 284
    :cond_18
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 285
    .line 286
    .line 287
    move-result-object p0

    .line 288
    invoke-virtual {p0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 289
    .line 290
    .line 291
    move-result-object p0

    .line 292
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 293
    .line 294
    .line 295
    array-length v7, p0

    .line 296
    move v8, v0

    .line 297
    :goto_e
    if-lt v8, v7, :cond_19

    .line 298
    .line 299
    return-object v5

    .line 300
    :cond_19
    aget-object v9, p0, v8

    .line 301
    .line 302
    invoke-virtual {v9}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v9

    .line 306
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 307
    .line 308
    .line 309
    sget-object v10, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 310
    .line 311
    invoke-static {v10, v9, v10}, Lj8/b;->l(Ljava/util/Locale;Ljava/lang/String;Ljava/util/Locale;)Ljava/lang/String;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    invoke-static {v9, v6, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 316
    .line 317
    .line 318
    move-result v10

    .line 319
    if-eqz v10, :cond_1a

    .line 320
    .line 321
    return-object v3

    .line 322
    :cond_1a
    invoke-static {v9, v2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 323
    .line 324
    .line 325
    move-result v10

    .line 326
    if-eqz v10, :cond_1b

    .line 327
    .line 328
    return-object v4

    .line 329
    :cond_1b
    invoke-static {v9, v1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 330
    .line 331
    .line 332
    move-result v10

    .line 333
    if-eqz v10, :cond_1c

    .line 334
    .line 335
    return-object v4

    .line 336
    :cond_1c
    invoke-static {v9, p1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 337
    .line 338
    .line 339
    move-result v9

    .line 340
    if-eqz v9, :cond_1d

    .line 341
    .line 342
    return-object v4

    .line 343
    :cond_1d
    add-int/lit8 v8, v8, 0x1

    .line 344
    .line 345
    goto :goto_e
.end method

.method public static j(Landroid/view/View;Landroid/view/View;ILb0/s;)V
    .locals 4

    .line 1
    const/4 v0, 0x3

    .line 2
    if-le p2, v0, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    if-eq p0, p1, :cond_4

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_2

    .line 19
    .line 20
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    move-object v0, v1

    .line 28
    :goto_0
    if-eqz v0, :cond_2

    .line 29
    .line 30
    invoke-virtual {p3, v0}, Lb0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_2
    instance-of v0, p0, Landroid/widget/TextView;

    .line 34
    .line 35
    if-eqz v0, :cond_4

    .line 36
    .line 37
    move-object v0, p0

    .line 38
    check-cast v0, Landroid/widget/TextView;

    .line 39
    .line 40
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-eqz v0, :cond_4

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    if-eqz v0, :cond_4

    .line 51
    .line 52
    invoke-static {v0}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_3

    .line 57
    .line 58
    move-object v1, v0

    .line 59
    :cond_3
    if-eqz v1, :cond_4

    .line 60
    .line 61
    invoke-virtual {p3, v1}, Lb0/s;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    :cond_4
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 65
    .line 66
    if-eqz v0, :cond_6

    .line 67
    .line 68
    check-cast p0, Landroid/view/ViewGroup;

    .line 69
    .line 70
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 71
    .line 72
    .line 73
    move-result v0

    .line 74
    const/4 v1, 0x0

    .line 75
    :goto_1
    if-lt v1, v0, :cond_5

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_5
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    add-int/lit8 v3, p2, 0x1

    .line 86
    .line 87
    invoke-static {v2, p1, v3, p3}, Lqa/f;->j(Landroid/view/View;Landroid/view/View;ILb0/s;)V

    .line 88
    .line 89
    .line 90
    add-int/lit8 v1, v1, 0x1

    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_6
    :goto_2
    return-void
.end method

.method public static k(Landroid/view/View;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const-string v1, "com.robinhood.ticker.TickerView"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x0

    .line 30
    :goto_0
    if-lt v1, v0, :cond_2

    .line 31
    .line 32
    :goto_1
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_2
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    invoke-static {v2}, Lqa/f;->k(Landroid/view/View;)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    return-object v2

    .line 48
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 49
    .line 50
    goto :goto_0
.end method

.method public static l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

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
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto :goto_5

    .line 16
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    move v2, v1

    .line 22
    :goto_0
    if-ge v2, v0, :cond_2

    .line 23
    .line 24
    invoke-virtual {p0, v2}, Ljava/lang/String;->charAt(I)C

    .line 25
    .line 26
    .line 27
    move-result v3

    .line 28
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 v2, -0x1

    .line 39
    :goto_1
    if-gez v2, :cond_7

    .line 40
    .line 41
    move v0, v1

    .line 42
    :goto_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-ge v0, v2, :cond_6

    .line 47
    .line 48
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 49
    .line 50
    .line 51
    move-result v2

    .line 52
    const/16 v3, 0xa5

    .line 53
    .line 54
    if-eq v2, v3, :cond_4

    .line 55
    .line 56
    const v3, 0xffe5

    .line 57
    .line 58
    .line 59
    if-ne v2, v3, :cond_3

    .line 60
    .line 61
    goto :goto_3

    .line 62
    :cond_3
    move v2, v1

    .line 63
    goto :goto_4

    .line 64
    :cond_4
    :goto_3
    const/4 v2, 0x1

    .line 65
    :goto_4
    if-eqz v2, :cond_5

    .line 66
    .line 67
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    return-object p0

    .line 72
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_6
    :goto_5
    return-object p1

    .line 76
    :cond_7
    move v0, v2

    .line 77
    :goto_6
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 78
    .line 79
    .line 80
    move-result v3

    .line 81
    if-ge v0, v3, :cond_9

    .line 82
    .line 83
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    invoke-static {v3}, Ljava/lang/Character;->isDigit(C)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-nez v4, :cond_8

    .line 92
    .line 93
    const/16 v4, 0x2c

    .line 94
    .line 95
    if-eq v3, v4, :cond_8

    .line 96
    .line 97
    const/16 v4, 0x2e

    .line 98
    .line 99
    if-eq v3, v4, :cond_8

    .line 100
    .line 101
    goto :goto_7

    .line 102
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 103
    .line 104
    goto :goto_6

    .line 105
    :cond_9
    :goto_7
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v1

    .line 109
    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-static {v1, p1, p0}, Lwb/en;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p0

    .line 117
    return-object p0
.end method

.method public static q(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    array-length v0, p0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    aget-object v0, p0, v1

    .line 14
    .line 15
    const-class v2, Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v0, v2}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    array-length v0, p0

    .line 25
    const/4 v2, 0x1

    .line 26
    if-eq v0, v2, :cond_3

    .line 27
    .line 28
    array-length v0, p0

    .line 29
    const/4 v3, 0x2

    .line 30
    if-ne v0, v3, :cond_2

    .line 31
    .line 32
    aget-object p0, p0, v2

    .line 33
    .line 34
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result p0

    .line 40
    if-eqz p0, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    :goto_0
    return v1

    .line 44
    :cond_3
    :goto_1
    return v2
.end method

.method public static r(Ljava/lang/String;)Lqa/b;
    .locals 3

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    move-object p0, v0

    .line 6
    :cond_0
    const-string v1, "\\s+"

    .line 7
    .line 8
    invoke-static {v1, p0, v0}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    const/4 v0, 0x0

    .line 20
    sget-object v1, Lqa/f;->m:Ljava/util/List;

    .line 21
    .line 22
    if-eqz v1, :cond_2

    .line 23
    .line 24
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_4

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/String;

    .line 46
    .line 47
    invoke-static {p0, v2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 48
    .line 49
    .line 50
    move-result v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    sget-object p0, Lqa/b;->i:Lqa/b;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    :goto_0
    const-string v1, "\u96f6\u94b1\u901a"

    .line 57
    .line 58
    invoke-static {p0, v1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_8

    .line 63
    .line 64
    const-string v1, "\u7406\u8d22\u901a"

    .line 65
    .line 66
    invoke-static {p0, v1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_5

    .line 71
    .line 72
    goto :goto_3

    .line 73
    :cond_5
    const-string v1, "\u96f6\u94b1"

    .line 74
    .line 75
    invoke-static {p0, v1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_7

    .line 80
    .line 81
    const-string v1, "\u94b1\u5305\u4f59\u989d"

    .line 82
    .line 83
    invoke-static {p0, v1, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_6

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_6
    :goto_1
    const/4 p0, 0x0

    .line 91
    return-object p0

    .line 92
    :cond_7
    :goto_2
    sget-object p0, Lqa/b;->g:Lqa/b;

    .line 93
    .line 94
    return-object p0

    .line 95
    :cond_8
    :goto_3
    sget-object p0, Lqa/b;->h:Lqa/b;

    .line 96
    .line 97
    return-object p0
.end method

.method public static s(Landroid/view/View;)Landroid/animation/ValueAnimator;
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    move-object v3, v1

    .line 25
    check-cast v3, Ljava/lang/reflect/Field;

    .line 26
    .line 27
    const-class v4, Landroid/animation/ValueAnimator;

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v4, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-eqz v3, :cond_0

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v2

    .line 41
    :goto_0
    check-cast v1, Ljava/lang/reflect/Field;

    .line 42
    .line 43
    if-eqz v1, :cond_2

    .line 44
    .line 45
    invoke-static {v1, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    instance-of v0, p0, Landroid/animation/ValueAnimator;

    .line 50
    .line 51
    if-eqz v0, :cond_2

    .line 52
    .line 53
    check-cast p0, Landroid/animation/ValueAnimator;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_2
    return-object v2
.end method


# virtual methods
.method public final m()V
    .locals 9

    .line 1
    iget-object v0, p0, Lqa/f;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const-string v1, "com.tencent.kinda.framework.WxCrossServices"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v5, v2

    .line 39
    check-cast v5, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v7

    .line 49
    const-string v8, "startLqtDetailUseCaseWithBalanceInMMProcess"

    .line 50
    .line 51
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v7

    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 62
    .line 63
    invoke-static {v5, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_1

    .line 68
    .line 69
    array-length v5, v6

    .line 70
    const/4 v7, 0x2

    .line 71
    if-ne v5, v7, :cond_1

    .line 72
    .line 73
    const-class v5, Landroid/content/Context;

    .line 74
    .line 75
    aget-object v7, v6, v3

    .line 76
    .line 77
    invoke-virtual {v5, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 78
    .line 79
    .line 80
    move-result v5

    .line 81
    if-eqz v5, :cond_1

    .line 82
    .line 83
    aget-object v5, v6, v4

    .line 84
    .line 85
    sget-object v6, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v5

    .line 91
    if-eqz v5, :cond_1

    .line 92
    .line 93
    move v3, v4

    .line 94
    :cond_1
    if-eqz v3, :cond_0

    .line 95
    .line 96
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    goto :goto_2

    .line 107
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    move v1, v3

    .line 112
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 113
    .line 114
    .line 115
    move-result v2

    .line 116
    if-eqz v2, :cond_4

    .line 117
    .line 118
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    check-cast v2, Ljava/lang/reflect/Method;

    .line 123
    .line 124
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 125
    .line 126
    new-instance v6, Lqa/e;

    .line 127
    .line 128
    const/4 v7, 0x0

    .line 129
    invoke-direct {v6, p0, v7}, Lqa/e;-><init>(Lqa/f;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v5, v2, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 133
    .line 134
    .line 135
    add-int/lit8 v1, v1, 0x1

    .line 136
    .line 137
    goto :goto_1

    .line 138
    :cond_4
    if-lez v1, :cond_5

    .line 139
    .line 140
    move v3, v4

    .line 141
    :cond_5
    iput-boolean v3, p0, Lqa/f;->k:Z

    .line 142
    .line 143
    :cond_6
    :goto_2
    return-void
.end method

.method public final n()V
    .locals 9

    .line 1
    iget-object v0, p0, Lqa/f;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const-string v1, "com.tencent.mm.plugin.mall.ui.MallWalletSectionCellView"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_6

    .line 12
    .line 13
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x0

    .line 31
    const/4 v4, 0x1

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v5, v2

    .line 39
    check-cast v5, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    invoke-static {v5, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_1

    .line 56
    .line 57
    array-length v5, v6

    .line 58
    const/4 v7, 0x7

    .line 59
    if-ne v5, v7, :cond_1

    .line 60
    .line 61
    aget-object v5, v6, v4

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v5

    .line 67
    const-string v7, "org.json.JSONObject"

    .line 68
    .line 69
    invoke-virtual {v5, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v5

    .line 73
    if-eqz v5, :cond_1

    .line 74
    .line 75
    const/4 v5, 0x2

    .line 76
    aget-object v5, v6, v5

    .line 77
    .line 78
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-static {v5, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    move-result v5

    .line 84
    if-eqz v5, :cond_1

    .line 85
    .line 86
    const/4 v5, 0x3

    .line 87
    aget-object v5, v6, v5

    .line 88
    .line 89
    const-class v8, Ljava/lang/String;

    .line 90
    .line 91
    invoke-static {v5, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-eqz v5, :cond_1

    .line 96
    .line 97
    const/4 v5, 0x4

    .line 98
    aget-object v5, v6, v5

    .line 99
    .line 100
    invoke-static {v5, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v5

    .line 104
    if-eqz v5, :cond_1

    .line 105
    .line 106
    move v3, v4

    .line 107
    :cond_1
    if-eqz v3, :cond_0

    .line 108
    .line 109
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 114
    .line 115
    .line 116
    move-result v0

    .line 117
    if-eqz v0, :cond_3

    .line 118
    .line 119
    goto :goto_2

    .line 120
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    move v1, v3

    .line 125
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v2

    .line 129
    if-eqz v2, :cond_4

    .line 130
    .line 131
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v2

    .line 135
    check-cast v2, Ljava/lang/reflect/Method;

    .line 136
    .line 137
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 138
    .line 139
    new-instance v6, Lqa/e;

    .line 140
    .line 141
    const/4 v7, 0x1

    .line 142
    invoke-direct {v6, p0, v7}, Lqa/e;-><init>(Lqa/f;I)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v5, v2, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 146
    .line 147
    .line 148
    add-int/lit8 v1, v1, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_4
    if-lez v1, :cond_5

    .line 152
    .line 153
    move v3, v4

    .line 154
    :cond_5
    iput-boolean v3, p0, Lqa/f;->j:Z

    .line 155
    .line 156
    :cond_6
    :goto_2
    return-void
.end method

.method public final o()V
    .locals 9

    .line 1
    iget-object v0, p0, Lqa/f;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    const-string v1, "com.tencent.mm.plugin.wallet_core.ui.view.WcPayMoneyLoadingView"

    .line 6
    .line 7
    invoke-static {v1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_12

    .line 12
    .line 13
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    new-instance v1, Ljava/util/ArrayList;

    .line 18
    .line 19
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    const/4 v3, 0x1

    .line 31
    const/4 v4, 0x0

    .line 32
    if-eqz v2, :cond_e

    .line 33
    .line 34
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    move-object v5, v2

    .line 39
    check-cast v5, Ljava/lang/reflect/Method;

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v6

    .line 45
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    array-length v7, v6

    .line 49
    if-nez v7, :cond_1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_1
    aget-object v7, v6, v4

    .line 53
    .line 54
    const-class v8, Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v7, v8}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-nez v7, :cond_3

    .line 61
    .line 62
    :cond_2
    :goto_1
    move v3, v4

    .line 63
    goto/16 :goto_3

    .line 64
    .line 65
    :cond_3
    sget-object v7, Lqa/f;->l:Ljava/util/Set;

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v7, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v5

    .line 75
    if-eqz v5, :cond_4

    .line 76
    .line 77
    array-length v5, v6

    .line 78
    if-ne v5, v3, :cond_4

    .line 79
    .line 80
    goto :goto_3

    .line 81
    :cond_4
    array-length v5, v6

    .line 82
    const/4 v7, 0x2

    .line 83
    if-eq v5, v7, :cond_5

    .line 84
    .line 85
    array-length v5, v6

    .line 86
    const/4 v7, 0x4

    .line 87
    if-ne v5, v7, :cond_2

    .line 88
    .line 89
    :cond_5
    const-string v5, " is less than zero."

    .line 90
    .line 91
    const-string v7, "Requested element count "

    .line 92
    .line 93
    array-length v8, v6

    .line 94
    sub-int/2addr v8, v3

    .line 95
    if-gez v8, :cond_6

    .line 96
    .line 97
    const/4 v8, 0x0

    .line 98
    :cond_6
    if-ltz v8, :cond_a

    .line 99
    .line 100
    if-nez v8, :cond_7

    .line 101
    .line 102
    sget-object v5, Ltf/t;->g:Ltf/t;

    .line 103
    .line 104
    goto :goto_2

    .line 105
    :cond_7
    array-length v5, v6

    .line 106
    if-lt v8, v5, :cond_8

    .line 107
    .line 108
    invoke-static {v6}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    goto :goto_2

    .line 113
    :cond_8
    const/4 v7, 0x1

    .line 114
    if-ne v8, v7, :cond_9

    .line 115
    .line 116
    add-int/lit8 v5, v5, -0x1

    .line 117
    .line 118
    aget-object v5, v6, v5

    .line 119
    .line 120
    invoke-static {v5}, La/a;->x0(Ljava/lang/Object;)Ljava/util/List;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    goto :goto_2

    .line 125
    :cond_9
    sub-int v7, v5, v8

    .line 126
    .line 127
    invoke-static {v6, v7, v5}, Ltf/l;->u0([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-static {v5}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 132
    .line 133
    .line 134
    move-result-object v5

    .line 135
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 136
    .line 137
    .line 138
    goto :goto_2

    .line 139
    :cond_a
    invoke-static {v8, v7, v5}, Leh/a;->m(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 140
    .line 141
    .line 142
    move-result-object v5

    .line 143
    invoke-static {v5}, Lj8/o;->q(Ljava/lang/Object;)V

    .line 144
    .line 145
    .line 146
    const/4 v5, 0x0

    .line 147
    :goto_2
    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    .line 148
    .line 149
    .line 150
    move-result v6

    .line 151
    if-eqz v6, :cond_b

    .line 152
    .line 153
    goto :goto_3

    .line 154
    :cond_b
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 155
    .line 156
    .line 157
    move-result-object v5

    .line 158
    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 159
    .line 160
    .line 161
    move-result v6

    .line 162
    if-eqz v6, :cond_d

    .line 163
    .line 164
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object v6

    .line 168
    check-cast v6, Ljava/lang/Class;

    .line 169
    .line 170
    sget-object v7, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 171
    .line 172
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 173
    .line 174
    .line 175
    move-result v6

    .line 176
    if-nez v6, :cond_c

    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_d
    :goto_3
    if-eqz v3, :cond_0

    .line 180
    .line 181
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    goto/16 :goto_0

    .line 185
    .line 186
    :cond_e
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 187
    .line 188
    .line 189
    move-result v0

    .line 190
    if-eqz v0, :cond_f

    .line 191
    .line 192
    goto :goto_6

    .line 193
    :cond_f
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 194
    .line 195
    .line 196
    move-result-object v0

    .line 197
    move v1, v4

    .line 198
    :goto_4
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v2

    .line 202
    if-eqz v2, :cond_10

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v2

    .line 208
    check-cast v2, Ljava/lang/reflect/Method;

    .line 209
    .line 210
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 211
    .line 212
    new-instance v6, Lqa/e;

    .line 213
    .line 214
    const/4 v7, 0x2

    .line 215
    invoke-direct {v6, p0, v7}, Lqa/e;-><init>(Lqa/f;I)V

    .line 216
    .line 217
    .line 218
    invoke-virtual {v5, v2, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 219
    .line 220
    .line 221
    add-int/lit8 v1, v1, 0x1

    .line 222
    .line 223
    goto :goto_4

    .line 224
    :cond_10
    if-lez v1, :cond_11

    .line 225
    .line 226
    goto :goto_5

    .line 227
    :cond_11
    move v3, v4

    .line 228
    :goto_5
    iput-boolean v3, p0, Lqa/f;->h:Z

    .line 229
    .line 230
    :cond_12
    :goto_6
    return-void
.end method

.method public final p()V
    .locals 13

    .line 1
    sget-object v0, Ltf/t;->g:Ltf/t;

    .line 2
    .line 3
    iget-object v1, p0, Lqa/f;->c:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    sget-object v2, Le8/b;->a:Le8/b;

    .line 6
    .line 7
    iget-object v3, p0, Lqa/f;->a:Lr8/g;

    .line 8
    .line 9
    iget-object v4, v3, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    iget-object v5, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 12
    .line 13
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-static {v4, v5}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 17
    .line 18
    .line 19
    move-result-object v4

    .line 20
    iget-object v4, v4, Ll8/i;->h:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {v4}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    const/4 v6, 0x0

    .line 27
    if-nez v5, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move-object v4, v6

    .line 31
    :goto_0
    if-eqz v4, :cond_1

    .line 32
    .line 33
    const-string v5, "|fake_wallet_balance_wekit_style_v1"

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    goto :goto_1

    .line 40
    :cond_1
    move-object v4, v6

    .line 41
    :goto_1
    const-string v5, ""

    .line 42
    .line 43
    if-nez v4, :cond_2

    .line 44
    .line 45
    move-object v4, v5

    .line 46
    :cond_2
    iget-object v7, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 47
    .line 48
    const-string v8, "ticker_methods"

    .line 49
    .line 50
    invoke-static {v1, v4, v7, v8}, Le8/b;->f(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/util/List;

    .line 51
    .line 52
    .line 53
    move-result-object v7

    .line 54
    new-instance v9, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v7

    .line 63
    :cond_3
    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v10

    .line 67
    if-eqz v10, :cond_4

    .line 68
    .line 69
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    move-object v11, v10

    .line 74
    check-cast v11, Ljava/lang/reflect/Method;

    .line 75
    .line 76
    invoke-static {v11}, Lqa/f;->q(Ljava/lang/reflect/Method;)Z

    .line 77
    .line 78
    .line 79
    move-result v11

    .line 80
    if-eqz v11, :cond_3

    .line 81
    .line 82
    invoke-virtual {v9, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    invoke-virtual {v9}, Ljava/util/ArrayList;->isEmpty()Z

    .line 87
    .line 88
    .line 89
    move-result v7

    .line 90
    if-nez v7, :cond_5

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_5
    move-object v9, v6

    .line 94
    :goto_3
    const-string v7, "com.robinhood.ticker.TickerView"

    .line 95
    .line 96
    if-eqz v9, :cond_6

    .line 97
    .line 98
    goto/16 :goto_b

    .line 99
    .line 100
    :cond_6
    iget-object v9, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 101
    .line 102
    invoke-static {v7, v9}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v9

    .line 106
    if-eqz v9, :cond_8

    .line 107
    .line 108
    invoke-static {v9}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 109
    .line 110
    .line 111
    move-result-object v9

    .line 112
    new-instance v10, Ljava/util/ArrayList;

    .line 113
    .line 114
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 115
    .line 116
    .line 117
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 118
    .line 119
    .line 120
    move-result-object v9

    .line 121
    :cond_7
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 122
    .line 123
    .line 124
    move-result v11

    .line 125
    if-eqz v11, :cond_9

    .line 126
    .line 127
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 128
    .line 129
    .line 130
    move-result-object v11

    .line 131
    move-object v12, v11

    .line 132
    check-cast v12, Ljava/lang/reflect/Method;

    .line 133
    .line 134
    invoke-static {v12}, Lqa/f;->q(Ljava/lang/reflect/Method;)Z

    .line 135
    .line 136
    .line 137
    move-result v12

    .line 138
    if-eqz v12, :cond_7

    .line 139
    .line 140
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 141
    .line 142
    .line 143
    goto :goto_4

    .line 144
    :cond_8
    move-object v10, v6

    .line 145
    :cond_9
    if-nez v10, :cond_a

    .line 146
    .line 147
    move-object v9, v0

    .line 148
    goto :goto_5

    .line 149
    :cond_a
    move-object v9, v10

    .line 150
    :goto_5
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 151
    .line 152
    .line 153
    move-result v10

    .line 154
    if-nez v10, :cond_b

    .line 155
    .line 156
    invoke-virtual {v2, v1, v4, v8, v9}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 157
    .line 158
    .line 159
    goto/16 :goto_b

    .line 160
    .line 161
    :cond_b
    :try_start_0
    iget-object v9, v3, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 162
    .line 163
    new-instance v10, Lch/e;

    .line 164
    .line 165
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 166
    .line 167
    .line 168
    new-instance v11, Lfh/k;

    .line 169
    .line 170
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 171
    .line 172
    .line 173
    const/4 v12, 0x5

    .line 174
    invoke-virtual {v11, v12, v7}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 175
    .line 176
    .line 177
    const-string v12, "Need to call #setCharacterLists first."

    .line 178
    .line 179
    filled-new-array {v12}, [Ljava/lang/String;

    .line 180
    .line 181
    .line 182
    move-result-object v12

    .line 183
    invoke-virtual {v11, v12}, Lfh/k;->r0([Ljava/lang/String;)V

    .line 184
    .line 185
    .line 186
    iput-object v11, v10, Lch/e;->h:Lfh/k;

    .line 187
    .line 188
    invoke-virtual {v9, v10}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    new-instance v10, Ljava/util/ArrayList;

    .line 193
    .line 194
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 195
    .line 196
    .line 197
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 198
    .line 199
    .line 200
    move-result-object v9

    .line 201
    :cond_c
    :goto_6
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 202
    .line 203
    .line 204
    move-result v11

    .line 205
    if-eqz v11, :cond_f

    .line 206
    .line 207
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 208
    .line 209
    .line 210
    move-result-object v11

    .line 211
    check-cast v11, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 212
    .line 213
    :try_start_1
    iget-object v12, v3, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 214
    .line 215
    invoke-virtual {v11, v12}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 216
    .line 217
    .line 218
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 219
    goto :goto_7

    .line 220
    :catchall_0
    move-exception v11

    .line 221
    :try_start_2
    new-instance v12, Lsf/f;

    .line 222
    .line 223
    invoke-direct {v12, v11}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    move-object v11, v12

    .line 227
    :goto_7
    nop

    .line 228
    instance-of v12, v11, Lsf/f;

    .line 229
    .line 230
    if-eqz v12, :cond_d

    .line 231
    .line 232
    move-object v11, v6

    .line 233
    :cond_d
    check-cast v11, Ljava/lang/reflect/Method;

    .line 234
    .line 235
    if-eqz v11, :cond_e

    .line 236
    .line 237
    invoke-static {v11}, Lqa/f;->q(Ljava/lang/reflect/Method;)Z

    .line 238
    .line 239
    .line 240
    move-result v12

    .line 241
    if-eqz v12, :cond_e

    .line 242
    .line 243
    goto :goto_8

    .line 244
    :catchall_1
    move-exception v3

    .line 245
    goto :goto_9

    .line 246
    :cond_e
    move-object v11, v6

    .line 247
    :goto_8
    if-eqz v11, :cond_c

    .line 248
    .line 249
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 250
    .line 251
    .line 252
    goto :goto_6

    .line 253
    :goto_9
    new-instance v10, Lsf/f;

    .line 254
    .line 255
    invoke-direct {v10, v3}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 256
    .line 257
    .line 258
    :cond_f
    invoke-static {v10}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 259
    .line 260
    .line 261
    move-result-object v3

    .line 262
    if-nez v3, :cond_10

    .line 263
    .line 264
    move-object v0, v10

    .line 265
    goto :goto_a

    .line 266
    :cond_10
    invoke-virtual {v3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v6

    .line 270
    const-string v9, "[Hchat:FakeWalletBalance] \u5b9a\u4f4d TickerView \u91d1\u989d\u65b9\u6cd5\u5931\u8d25: "

    .line 271
    .line 272
    invoke-static {v9, v6, v3}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 273
    .line 274
    .line 275
    :goto_a
    move-object v9, v0

    .line 276
    check-cast v9, Ljava/util/List;

    .line 277
    .line 278
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 279
    .line 280
    .line 281
    move-result v0

    .line 282
    if-nez v0, :cond_11

    .line 283
    .line 284
    invoke-virtual {v2, v1, v4, v8, v9}, Le8/b;->j(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 285
    .line 286
    .line 287
    goto :goto_b

    .line 288
    :cond_11
    const-string v0, "cache.key"

    .line 289
    .line 290
    :try_start_3
    invoke-interface {v1}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 291
    .line 292
    .line 293
    move-result-object v2

    .line 294
    invoke-interface {v1, v0, v5}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 295
    .line 296
    .line 297
    move-result-object v1

    .line 298
    invoke-static {v1, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 299
    .line 300
    .line 301
    move-result v1

    .line 302
    if-nez v1, :cond_12

    .line 303
    .line 304
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-interface {v1, v0, v4}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 309
    .line 310
    .line 311
    :cond_12
    invoke-interface {v2, v8}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 312
    .line 313
    .line 314
    move-result-object v0

    .line 315
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 316
    .line 317
    .line 318
    :catchall_2
    :goto_b
    iget-object v0, p0, Lqa/f;->a:Lr8/g;

    .line 319
    .line 320
    iget-object v0, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 321
    .line 322
    invoke-static {v7, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 323
    .line 324
    .line 325
    move-result-object v0

    .line 326
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 327
    .line 328
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 329
    .line 330
    .line 331
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    move-result-object v1

    .line 335
    const-string v2, "setTextSize"

    .line 336
    .line 337
    invoke-static {v0, v2, v1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 338
    .line 339
    .line 340
    move-result-object v0

    .line 341
    invoke-interface {v9}, Ljava/util/List;->isEmpty()Z

    .line 342
    .line 343
    .line 344
    move-result v1

    .line 345
    if-eqz v1, :cond_13

    .line 346
    .line 347
    if-nez v0, :cond_13

    .line 348
    .line 349
    return-void

    .line 350
    :cond_13
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 351
    .line 352
    .line 353
    move-result-object v1

    .line 354
    const/4 v2, 0x0

    .line 355
    move v3, v2

    .line 356
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 357
    .line 358
    .line 359
    move-result v4

    .line 360
    if-eqz v4, :cond_14

    .line 361
    .line 362
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 363
    .line 364
    .line 365
    move-result-object v4

    .line 366
    check-cast v4, Ljava/lang/reflect/Method;

    .line 367
    .line 368
    sget-object v5, Lr8/i;->b:Lr8/i;

    .line 369
    .line 370
    new-instance v6, Lc9/c2;

    .line 371
    .line 372
    const/16 v7, 0xd

    .line 373
    .line 374
    invoke-direct {v6, p0, v7, v4}, Lc9/c2;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 375
    .line 376
    .line 377
    invoke-virtual {v5, v4, v6}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 378
    .line 379
    .line 380
    add-int/lit8 v3, v3, 0x1

    .line 381
    .line 382
    goto :goto_c

    .line 383
    :cond_14
    if-eqz v0, :cond_15

    .line 384
    .line 385
    sget-object v1, Lr8/i;->b:Lr8/i;

    .line 386
    .line 387
    new-instance v4, Lqa/e;

    .line 388
    .line 389
    const/4 v5, 0x3

    .line 390
    invoke-direct {v4, p0, v5}, Lqa/e;-><init>(Lqa/f;I)V

    .line 391
    .line 392
    .line 393
    invoke-virtual {v1, v0, v4}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 394
    .line 395
    .line 396
    add-int/lit8 v3, v3, 0x1

    .line 397
    .line 398
    :cond_15
    if-lez v3, :cond_16

    .line 399
    .line 400
    const/4 v2, 0x1

    .line 401
    :cond_16
    iput-boolean v2, p0, Lqa/f;->i:Z

    .line 402
    .line 403
    return-void
.end method
