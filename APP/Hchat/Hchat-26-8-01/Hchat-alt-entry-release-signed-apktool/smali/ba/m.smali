.class public final Lba/m;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final o:Ljava/util/Set;

.field public static final p:Log/k;

.field public static final q:Log/k;

.field public static final r:Log/k;

.field public static final s:Log/k;

.field public static final t:Ljava/util/Set;

.field public static final u:Ljava/util/Set;

.field public static final v:Ljava/util/List;

.field public static final w:Ljava/util/ArrayList;


# instance fields
.field public final a:Lr8/g;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Landroid/content/SharedPreferences;

.field public final e:Ljava/util/concurrent/ConcurrentHashMap;

.field public final f:Ljava/util/concurrent/ConcurrentHashMap;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public final i:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final j:Ljava/util/concurrent/ConcurrentHashMap;

.field public final k:Ljava/util/concurrent/ConcurrentHashMap;

.field public final l:Ljava/lang/ThreadLocal;

.field public final m:Lsf/i;

.field public volatile n:Z


# direct methods
.method static constructor <clinit>()V
    .locals 8

    .line 1
    const/16 v0, 0x32

    .line 2
    .line 3
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const v1, 0xf4274

    .line 8
    .line 9
    .line 10
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const v2, 0xf4275

    .line 15
    .line 16
    .line 17
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    filled-new-array {v0, v1, v2}, [Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lba/m;->o:Ljava/util/Set;

    .line 30
    .line 31
    new-instance v0, Log/k;

    .line 32
    .line 33
    const-string v1, "<type>\\s*2001\\s*</type>"

    .line 34
    .line 35
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    sput-object v0, Lba/m;->p:Log/k;

    .line 39
    .line 40
    new-instance v0, Log/k;

    .line 41
    .line 42
    const-string v1, "<type>\\s*(2000|2011)\\s*</type>"

    .line 43
    .line 44
    invoke-direct {v0, v1}, Log/k;-><init>(Ljava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lba/m;->q:Log/k;

    .line 48
    .line 49
    new-instance v0, Log/k;

    .line 50
    .line 51
    const-string v1, "<type>\\s*57\\s*</type>"

    .line 52
    .line 53
    const/4 v2, 0x0

    .line 54
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 55
    .line 56
    .line 57
    sput-object v0, Lba/m;->r:Log/k;

    .line 58
    .line 59
    new-instance v0, Log/k;

    .line 60
    .line 61
    const-string v1, "<type>\\s*19\\s*</type>"

    .line 62
    .line 63
    invoke-direct {v0, v1, v2}, Log/k;-><init>(Ljava/lang/String;I)V

    .line 64
    .line 65
    .line 66
    sput-object v0, Lba/m;->s:Log/k;

    .line 67
    .line 68
    const/16 v0, 0x40

    .line 69
    .line 70
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    const v0, 0x22000031

    .line 75
    .line 76
    .line 77
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    const v0, 0x24000031

    .line 82
    .line 83
    .line 84
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 85
    .line 86
    .line 87
    move-result-object v3

    .line 88
    const v0, 0x35000031

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    const v0, 0x37000031

    .line 96
    .line 97
    .line 98
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object v5

    .line 102
    const v0, -0x6fffffff

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v6

    .line 109
    const v0, 0x40400031    # 3.0000117f

    .line 110
    .line 111
    .line 112
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 113
    .line 114
    .line 115
    move-result-object v7

    .line 116
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Integer;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 121
    .line 122
    .line 123
    move-result-object v0

    .line 124
    sput-object v0, Lba/m;->t:Ljava/util/Set;

    .line 125
    .line 126
    filled-new-array {v4, v5}, [Ljava/lang/Integer;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    invoke-static {v0}, Ltf/d0;->W([Ljava/lang/Object;)Ljava/util/Set;

    .line 131
    .line 132
    .line 133
    move-result-object v0

    .line 134
    sput-object v0, Lba/m;->u:Ljava/util/Set;

    .line 135
    .line 136
    const-string v5, "bs0"

    .line 137
    .line 138
    const-string v6, "bs2"

    .line 139
    .line 140
    const-string v1, "bkl"

    .line 141
    .line 142
    const-string v2, "brp"

    .line 143
    .line 144
    const-string v3, "brl"

    .line 145
    .line 146
    const-string v4, "bro"

    .line 147
    .line 148
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    sput-object v0, Lba/m;->v:Ljava/util/List;

    .line 157
    .line 158
    const-string v1, "bkg"

    .line 159
    .line 160
    const-string v2, "kpw"

    .line 161
    .line 162
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    invoke-static {v1}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 167
    .line 168
    .line 169
    move-result-object v1

    .line 170
    invoke-static {v1, v0}, Ltf/m;->F1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    sput-object v0, Lba/m;->w:Ljava/util/ArrayList;

    .line 175
    .line 176
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
    iput-object p1, p0, Lba/m;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_message_bubble_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iput-object v0, p0, Lba/m;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    const-string v0, "Hchat_message_text_color_config"

    .line 20
    .line 21
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    iput-object v0, p0, Lba/m;->c:Landroid/content/SharedPreferences;

    .line 26
    .line 27
    const-string v0, "Hchat_message_bubble_method_cache"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    iput-object p1, p0, Lba/m;->d:Landroid/content/SharedPreferences;

    .line 34
    .line 35
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 36
    .line 37
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 38
    .line 39
    .line 40
    iput-object p1, p0, Lba/m;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 43
    .line 44
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 45
    .line 46
    .line 47
    iput-object p1, p0, Lba/m;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 52
    .line 53
    .line 54
    iput-object p1, p0, Lba/m;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 55
    .line 56
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 57
    .line 58
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 59
    .line 60
    .line 61
    iput-object p1, p0, Lba/m;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 62
    .line 63
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    iput-object p1, p0, Lba/m;->i:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 68
    .line 69
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 70
    .line 71
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    iput-object p1, p0, Lba/m;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 75
    .line 76
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 77
    .line 78
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 79
    .line 80
    .line 81
    iput-object p1, p0, Lba/m;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 82
    .line 83
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 84
    .line 85
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 86
    .line 87
    .line 88
    iput-object p1, p0, Lba/m;->l:Ljava/lang/ThreadLocal;

    .line 89
    .line 90
    new-instance p1, Lab/a;

    .line 91
    .line 92
    const/4 v0, 0x6

    .line 93
    invoke-direct {p1, p0, v0}, Lab/a;-><init>(Ljava/lang/Object;I)V

    .line 94
    .line 95
    .line 96
    new-instance v0, Lsf/i;

    .line 97
    .line 98
    invoke-direct {v0, p1}, Lsf/i;-><init>(Lfg/a;)V

    .line 99
    .line 100
    .line 101
    iput-object v0, p0, Lba/m;->m:Lsf/i;

    .line 102
    .line 103
    return-void
.end method

.method public static a(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V
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
    const-string v1, "com.tencent.mm.ui.widget.MMNeat7extView"

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
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-static {p0, p1}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 33
    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    check-cast p0, Landroid/view/ViewGroup;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    const/4 v1, 0x0

    .line 43
    :goto_0
    if-lt v1, v0, :cond_1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    invoke-static {v2, p1, p2}, Lba/m;->a(Landroid/view/View;Landroid/view/View;Ljava/util/ArrayList;)V

    .line 54
    .line 55
    .line 56
    add-int/lit8 v1, v1, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_2
    :goto_1
    return-void
.end method

.method public static final b(Lba/m;Landroid/view/View;Ljava/util/LinkedHashMap;Landroid/view/View;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lba/m;->y(Landroid/view/View;)Lba/l;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    if-eq p3, p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p3}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-nez v1, :cond_1

    .line 17
    .line 18
    :cond_0
    iget-object v1, v0, Lba/l;->b:Landroid/widget/TextView;

    .line 19
    .line 20
    iget-object v0, v0, Lba/l;->a:Landroid/view/View;

    .line 21
    .line 22
    invoke-interface {p2, v1, v0}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    :cond_1
    instance-of v0, p3, Landroid/view/ViewGroup;

    .line 26
    .line 27
    if-eqz v0, :cond_3

    .line 28
    .line 29
    check-cast p3, Landroid/view/ViewGroup;

    .line 30
    .line 31
    invoke-virtual {p3}, Landroid/view/ViewGroup;->getChildCount()I

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    const/4 v1, 0x0

    .line 36
    :goto_0
    if-lt v1, v0, :cond_2

    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_2
    invoke-virtual {p3, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    invoke-static {p0, p1, p2, v2}, Lba/m;->b(Lba/m;Landroid/view/View;Ljava/util/LinkedHashMap;Landroid/view/View;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v1, v1, 0x1

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    :goto_1
    return-void
.end method

.method public static c(Landroid/view/View;ILjava/util/ArrayList;)V
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-ne v0, p1, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 11
    .line 12
    if-eqz v0, :cond_2

    .line 13
    .line 14
    check-cast p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/4 v1, 0x0

    .line 21
    :goto_0
    if-lt v1, v0, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    invoke-static {v2, p1, p2}, Lba/m;->c(Landroid/view/View;ILjava/util/ArrayList;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_2
    :goto_1
    return-void
.end method

.method public static d(Landroid/view/View;Landroid/view/View;)Landroid/view/View;
    .locals 6

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
    const-string v1, "com.tencent.mm.ui.chatting.viewitems.foldItem.ChattingItemFoldSys$ExpandTextView"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    const/4 v1, 0x0

    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    instance-of v0, p0, Landroid/widget/TextView;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    invoke-static {p0, p1}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    return-object p0

    .line 29
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 30
    .line 31
    if-eqz v0, :cond_3

    .line 32
    .line 33
    move-object v0, p0

    .line 34
    check-cast v0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    move v3, v1

    .line 41
    :goto_0
    if-lt v3, v2, :cond_1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    instance-of v5, v4, Landroid/widget/TextView;

    .line 49
    .line 50
    if-eqz v5, :cond_2

    .line 51
    .line 52
    invoke-static {v4, p1}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_2

    .line 57
    .line 58
    return-object v4

    .line 59
    :cond_2
    add-int/lit8 v3, v3, 0x1

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_3
    :goto_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 63
    .line 64
    if-eqz v0, :cond_6

    .line 65
    .line 66
    check-cast p0, Landroid/view/ViewGroup;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 69
    .line 70
    .line 71
    move-result v0

    .line 72
    :goto_2
    if-lt v1, v0, :cond_4

    .line 73
    .line 74
    goto :goto_3

    .line 75
    :cond_4
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    invoke-static {v2, p1}, Lba/m;->d(Landroid/view/View;Landroid/view/View;)Landroid/view/View;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-eqz v2, :cond_5

    .line 87
    .line 88
    return-object v2

    .line 89
    :cond_5
    add-int/lit8 v1, v1, 0x1

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    :goto_3
    const/4 p0, 0x0

    .line 93
    return-object p0
.end method

.method public static h(II)Z
    .locals 10

    .line 1
    const/high16 v0, -0x1000000

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    const/4 v0, -0x1

    .line 6
    :cond_0
    invoke-static {p0}, Landroid/graphics/Color;->alpha(I)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    int-to-double v1, p1

    .line 11
    const-wide v3, 0x406fe00000000000L    # 255.0

    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    div-double/2addr v1, v3

    .line 17
    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    .line 18
    .line 19
    cmpl-double p1, v1, v3

    .line 20
    .line 21
    if-ltz p1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    invoke-static {v0}, Landroid/graphics/Color;->red(I)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    int-to-double v6, p1

    .line 33
    mul-double/2addr v6, v1

    .line 34
    int-to-double v8, v5

    .line 35
    sub-double/2addr v3, v1

    .line 36
    mul-double/2addr v8, v3

    .line 37
    add-double/2addr v8, v6

    .line 38
    double-to-int p1, v8

    .line 39
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 40
    .line 41
    .line 42
    move-result v5

    .line 43
    invoke-static {v0}, Landroid/graphics/Color;->green(I)I

    .line 44
    .line 45
    .line 46
    move-result v6

    .line 47
    int-to-double v7, v5

    .line 48
    mul-double/2addr v7, v1

    .line 49
    int-to-double v5, v6

    .line 50
    mul-double/2addr v5, v3

    .line 51
    add-double/2addr v5, v7

    .line 52
    double-to-int v5, v5

    .line 53
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-static {v0}, Landroid/graphics/Color;->blue(I)I

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    int-to-double v7, p0

    .line 62
    mul-double/2addr v7, v1

    .line 63
    int-to-double v1, v6

    .line 64
    mul-double/2addr v3, v1

    .line 65
    add-double/2addr v3, v7

    .line 66
    double-to-int p0, v3

    .line 67
    invoke-static {p1, v5, p0}, Landroid/graphics/Color;->rgb(III)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    :goto_0
    invoke-static {p0}, Lba/m;->t(I)D

    .line 72
    .line 73
    .line 74
    move-result-wide v1

    .line 75
    invoke-static {v0}, Lba/m;->t(I)D

    .line 76
    .line 77
    .line 78
    move-result-wide v3

    .line 79
    invoke-static {v1, v2, v3, v4}, Ljava/lang/Math;->max(DD)D

    .line 80
    .line 81
    .line 82
    move-result-wide v1

    .line 83
    invoke-static {p0}, Lba/m;->t(I)D

    .line 84
    .line 85
    .line 86
    move-result-wide p0

    .line 87
    invoke-static {v0}, Lba/m;->t(I)D

    .line 88
    .line 89
    .line 90
    move-result-wide v3

    .line 91
    invoke-static {p0, p1, v3, v4}, Ljava/lang/Math;->min(DD)D

    .line 92
    .line 93
    .line 94
    move-result-wide p0

    .line 95
    const-wide v3, 0x3fa999999999999aL    # 0.05

    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    add-double/2addr v1, v3

    .line 101
    add-double/2addr p0, v3

    .line 102
    div-double/2addr v1, p0

    .line 103
    const-wide/high16 p0, 0x4012000000000000L    # 4.5

    .line 104
    .line 105
    cmpg-double p0, v1, p0

    .line 106
    .line 107
    if-gez p0, :cond_2

    .line 108
    .line 109
    const/4 p0, 0x1

    .line 110
    return p0

    .line 111
    :cond_2
    const/4 p0, 0x0

    .line 112
    return p0
.end method

.method public static j(Landroid/view/View;Landroid/view/View;)Z
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-static {p0, p1}, Lba/m;->o(Landroid/view/View;Landroid/view/View;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return p0
.end method

.method public static k(Ljava/lang/Integer;Ljava/lang/String;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    if-eqz p0, :cond_5

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-gtz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    and-int/lit16 v2, p0, 0xff

    .line 13
    .line 14
    const v3, 0xffff

    .line 15
    .line 16
    .line 17
    and-int/2addr v3, p0

    .line 18
    ushr-int/lit8 v4, p0, 0x10

    .line 19
    .line 20
    if-nez v4, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    const/16 v4, 0x2710

    .line 24
    .line 25
    if-eq v3, v4, :cond_2

    .line 26
    .line 27
    const/16 v4, 0x2712

    .line 28
    .line 29
    if-eq v3, v4, :cond_2

    .line 30
    .line 31
    if-eqz v2, :cond_3

    .line 32
    .line 33
    if-ne v3, v2, :cond_3

    .line 34
    .line 35
    move p0, v2

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    move p0, v3

    .line 38
    :cond_3
    :goto_0
    const/16 v2, 0x31

    .line 39
    .line 40
    if-ne p0, v2, :cond_4

    .line 41
    .line 42
    move p0, v1

    .line 43
    goto :goto_1

    .line 44
    :cond_4
    move p0, v0

    .line 45
    :goto_1
    if-ne p0, v1, :cond_5

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :cond_5
    const-string p0, "<appmsg"

    .line 49
    .line 50
    invoke-static {p1, p0, v1}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    if-eqz p0, :cond_6

    .line 55
    .line 56
    :goto_2
    sget-object p0, Lba/m;->s:Log/k;

    .line 57
    .line 58
    invoke-virtual {p0, p1}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 59
    .line 60
    .line 61
    move-result p0

    .line 62
    if-eqz p0, :cond_6

    .line 63
    .line 64
    return v1

    .line 65
    :cond_6
    return v0
.end method

.method public static l(Landroid/view/View;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    :goto_0
    const/4 v0, 0x0

    .line 6
    if-eqz p0, :cond_2

    .line 7
    .line 8
    const-class v1, Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    const-string v2, "com.tencent.mm.ui.widget.MMNeat7extView"

    .line 21
    .line 22
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    if-nez v2, :cond_1

    .line 27
    .line 28
    const-string v2, "com.tencent.neattextview.textview.view.NeatTextView"

    .line 29
    .line 30
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    if-nez v2, :cond_1

    .line 35
    .line 36
    const-string v2, "NeatTextView"

    .line 37
    .line 38
    invoke-static {v1, v2, v0}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 51
    return p0

    .line 52
    :cond_2
    return v0
.end method

.method public static n(I)Z
    .locals 5

    .line 1
    const/16 v0, 0x2712

    .line 2
    .line 3
    const/16 v1, 0x2710

    .line 4
    .line 5
    if-gtz p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    and-int/lit16 v2, p0, 0xff

    .line 9
    .line 10
    const v3, 0xffff

    .line 11
    .line 12
    .line 13
    and-int/2addr v3, p0

    .line 14
    ushr-int/lit8 v4, p0, 0x10

    .line 15
    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    if-eq v3, v1, :cond_3

    .line 20
    .line 21
    if-eq v3, v0, :cond_3

    .line 22
    .line 23
    if-eqz v2, :cond_2

    .line 24
    .line 25
    if-ne v3, v2, :cond_2

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_2
    :goto_0
    move v2, p0

    .line 29
    goto :goto_1

    .line 30
    :cond_3
    move v2, v3

    .line 31
    :goto_1
    if-eq v2, v1, :cond_6

    .line 32
    .line 33
    if-ne v2, v0, :cond_4

    .line 34
    .line 35
    goto :goto_2

    .line 36
    :cond_4
    sget-object v0, Lba/m;->t:Ljava/util/Set;

    .line 37
    .line 38
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_5

    .line 47
    .line 48
    goto :goto_2

    .line 49
    :cond_5
    const/4 p0, 0x0

    .line 50
    return p0

    .line 51
    :cond_6
    :goto_2
    const/4 p0, 0x1

    .line 52
    return p0
.end method

.method public static o(Landroid/view/View;Landroid/view/View;)Z
    .locals 3

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    const/4 v0, 0x0

    .line 9
    move v1, v0

    .line 10
    :goto_0
    instance-of v2, p0, Landroid/view/View;

    .line 11
    .line 12
    if-eqz v2, :cond_2

    .line 13
    .line 14
    const/16 v2, 0x10

    .line 15
    .line 16
    if-ge v1, v2, :cond_2

    .line 17
    .line 18
    if-ne p0, p1, :cond_1

    .line 19
    .line 20
    :goto_1
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_1
    check-cast p0, Landroid/view/View;

    .line 23
    .line 24
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_2
    return v0
.end method

.method public static q(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x2

    .line 4
    if-ge v1, v2, :cond_0

    .line 5
    .line 6
    const-string v2, "&lt;"

    .line 7
    .line 8
    const-string v3, "<"

    .line 9
    .line 10
    const/4 v4, 0x1

    .line 11
    invoke-static {p0, v2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    const-string v2, "&gt;"

    .line 16
    .line 17
    const-string v3, ">"

    .line 18
    .line 19
    invoke-static {p0, v2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v2, "&quot;"

    .line 24
    .line 25
    const-string v3, "\""

    .line 26
    .line 27
    invoke-static {p0, v2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    const-string v2, "&apos;"

    .line 32
    .line 33
    const-string v3, "\'"

    .line 34
    .line 35
    invoke-static {p0, v2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    const-string v2, "&amp;"

    .line 40
    .line 41
    const-string v3, "&"

    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4}, Log/t;->a0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    new-instance v2, Ljava/lang/StringBuilder;

    .line 55
    .line 56
    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    :goto_1
    if-lt v0, v1, :cond_1

    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    const-string v0, "[ \\t\\x0B\\f\\r]+"

    .line 70
    .line 71
    const-string v1, " "

    .line 72
    .line 73
    invoke-static {v0, p0, v1}, Lj8/b;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p0

    .line 77
    const-string v0, " *\\n *"

    .line 78
    .line 79
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 80
    .line 81
    .line 82
    move-result-object v0

    .line 83
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    const-string v1, "\n"

    .line 87
    .line 88
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0, v1}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object p0

    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object p0

    .line 107
    return-object p0

    .line 108
    :cond_1
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    const/16 v4, 0xa0

    .line 113
    .line 114
    if-eq v3, v4, :cond_2

    .line 115
    .line 116
    const/16 v4, 0x2007

    .line 117
    .line 118
    if-eq v3, v4, :cond_2

    .line 119
    .line 120
    const/16 v4, 0x202f

    .line 121
    .line 122
    if-eq v3, v4, :cond_2

    .line 123
    .line 124
    const/16 v4, 0x2060

    .line 125
    .line 126
    if-eq v3, v4, :cond_3

    .line 127
    .line 128
    const v4, 0xfeff

    .line 129
    .line 130
    .line 131
    if-eq v3, v4, :cond_3

    .line 132
    .line 133
    const v4, 0xfffc

    .line 134
    .line 135
    .line 136
    if-eq v3, v4, :cond_3

    .line 137
    .line 138
    packed-switch v3, :pswitch_data_0

    .line 139
    .line 140
    .line 141
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    goto :goto_2

    .line 145
    :cond_2
    const/16 v3, 0x20

    .line 146
    .line 147
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    :cond_3
    :goto_2
    :pswitch_0
    add-int/lit8 v0, v0, 0x1

    .line 151
    .line 152
    goto :goto_1

    .line 153
    :pswitch_data_0
    .packed-switch 0x200b
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public static r(Ljava/lang/Object;)Ljava/lang/Integer;
    .locals 1

    .line 1
    instance-of v0, p0, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0

    .line 16
    :cond_0
    instance-of v0, p0, Ljava/lang/String;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    check-cast p0, Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p0}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-static {p0}, Log/t;->f0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_1
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public static s(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    new-array v2, v1, [Ljava/lang/Class;

    .line 7
    .line 8
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    new-array v0, v1, [Ljava/lang/Object;

    .line 13
    .line 14
    invoke-static {p1, p0, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    return-object p1

    .line 21
    :cond_0
    invoke-static {p0, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    return-object p1

    .line 28
    :cond_1
    invoke-static {p0, p3}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static t(I)D
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/graphics/Color;->red(I)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Lba/m;->u(I)D

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    const-wide v2, 0x3fcb367a0f9096bcL    # 0.2126

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    mul-double/2addr v0, v2

    .line 15
    invoke-static {p0}, Landroid/graphics/Color;->green(I)I

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    invoke-static {v2}, Lba/m;->u(I)D

    .line 20
    .line 21
    .line 22
    move-result-wide v2

    .line 23
    const-wide v4, 0x3fe6e2eb1c432ca5L    # 0.7152

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    mul-double/2addr v2, v4

    .line 29
    add-double/2addr v2, v0

    .line 30
    invoke-static {p0}, Landroid/graphics/Color;->blue(I)I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    invoke-static {p0}, Lba/m;->u(I)D

    .line 35
    .line 36
    .line 37
    move-result-wide v0

    .line 38
    const-wide v4, 0x3fb27bb2fec56d5dL    # 0.0722

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    mul-double/2addr v0, v4

    .line 44
    add-double/2addr v0, v2

    .line 45
    return-wide v0
.end method

.method public static final u(I)D
    .locals 4

    .line 1
    int-to-double v0, p0

    .line 2
    const-wide v2, 0x406fe00000000000L    # 255.0

    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    div-double/2addr v0, v2

    .line 8
    const-wide v2, 0x3fa4b5dcc63f1412L    # 0.04045

    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    cmpg-double p0, v0, v2

    .line 14
    .line 15
    if-gtz p0, :cond_0

    .line 16
    .line 17
    const-wide v2, 0x4029d70a3d70a3d7L    # 12.92

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    div-double/2addr v0, v2

    .line 23
    return-wide v0

    .line 24
    :cond_0
    const-wide v2, 0x3fac28f5c28f5c29L    # 0.055

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    add-double/2addr v0, v2

    .line 30
    const-wide v2, 0x3ff0e147ae147ae1L    # 1.055

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    div-double/2addr v0, v2

    .line 36
    const-wide v2, 0x4003333333333333L    # 2.4

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->pow(DD)D

    .line 42
    .line 43
    .line 44
    move-result-wide v0

    .line 45
    return-wide v0
.end method

.method public static v(Ljava/lang/Integer;Ljava/lang/String;)Lba/a;
    .locals 6

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    invoke-static {v0}, Lba/m;->n(I)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lba/a;->k:Lba/a;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_0
    sget-object v0, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    sget-object v0, Lba/a;->h:Lba/a;

    .line 26
    .line 27
    const-string v1, "<wcpayinfo"

    .line 28
    .line 29
    const/4 v2, 0x0

    .line 30
    if-eqz p0, :cond_6

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-gtz p0, :cond_1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    and-int/lit16 v3, p0, 0xff

    .line 40
    .line 41
    const v4, 0xffff

    .line 42
    .line 43
    .line 44
    and-int/2addr v4, p0

    .line 45
    ushr-int/lit8 v5, p0, 0x10

    .line 46
    .line 47
    if-nez v5, :cond_2

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_2
    const/16 v5, 0x2710

    .line 51
    .line 52
    if-eq v4, v5, :cond_3

    .line 53
    .line 54
    const/16 v5, 0x2712

    .line 55
    .line 56
    if-eq v4, v5, :cond_3

    .line 57
    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    if-ne v4, v3, :cond_4

    .line 61
    .line 62
    move p0, v3

    .line 63
    goto :goto_0

    .line 64
    :cond_3
    move p0, v4

    .line 65
    :cond_4
    :goto_0
    const/16 v3, 0x31

    .line 66
    .line 67
    const/4 v4, 0x1

    .line 68
    if-ne p0, v3, :cond_5

    .line 69
    .line 70
    move p0, v4

    .line 71
    goto :goto_1

    .line 72
    :cond_5
    move p0, v2

    .line 73
    :goto_1
    if-ne p0, v4, :cond_6

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_6
    const-string p0, "<appmsg"

    .line 77
    .line 78
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-nez p0, :cond_8

    .line 83
    .line 84
    invoke-static {p1, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-eqz p0, :cond_7

    .line 89
    .line 90
    goto :goto_2

    .line 91
    :cond_7
    return-object v0

    .line 92
    :cond_8
    :goto_2
    const-string p0, "receivehongbao"

    .line 93
    .line 94
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 95
    .line 96
    .line 97
    move-result p0

    .line 98
    if-nez p0, :cond_d

    .line 99
    .line 100
    const-string p0, "wxhb_personalreceive"

    .line 101
    .line 102
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-nez p0, :cond_d

    .line 107
    .line 108
    const-string p0, "hongbao"

    .line 109
    .line 110
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    if-nez p0, :cond_d

    .line 115
    .line 116
    const-string p0, "/hongbao/"

    .line 117
    .line 118
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 119
    .line 120
    .line 121
    move-result p0

    .line 122
    if-nez p0, :cond_d

    .line 123
    .line 124
    sget-object p0, Lba/m;->p:Log/k;

    .line 125
    .line 126
    invoke-virtual {p0, p1}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result p0

    .line 130
    if-eqz p0, :cond_9

    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_9
    invoke-static {p1, v1, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 134
    .line 135
    .line 136
    move-result p0

    .line 137
    if-eqz p0, :cond_a

    .line 138
    .line 139
    const-string p0, "<transferid>"

    .line 140
    .line 141
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 142
    .line 143
    .line 144
    move-result p0

    .line 145
    if-nez p0, :cond_b

    .line 146
    .line 147
    const-string p0, "<transcationid>"

    .line 148
    .line 149
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 150
    .line 151
    .line 152
    move-result p0

    .line 153
    if-nez p0, :cond_b

    .line 154
    .line 155
    const-string p0, "<transactionid>"

    .line 156
    .line 157
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 158
    .line 159
    .line 160
    move-result p0

    .line 161
    if-nez p0, :cond_b

    .line 162
    .line 163
    const-string p0, "transfer_id="

    .line 164
    .line 165
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 166
    .line 167
    .line 168
    move-result p0

    .line 169
    if-nez p0, :cond_b

    .line 170
    .line 171
    const-string p0, "trans_id="

    .line 172
    .line 173
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 174
    .line 175
    .line 176
    move-result p0

    .line 177
    if-nez p0, :cond_b

    .line 178
    .line 179
    const-string p0, "transferoperation"

    .line 180
    .line 181
    invoke-static {p1, p0, v2}, Log/m;->h0(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 182
    .line 183
    .line 184
    move-result p0

    .line 185
    if-nez p0, :cond_b

    .line 186
    .line 187
    :cond_a
    sget-object p0, Lba/m;->q:Log/k;

    .line 188
    .line 189
    invoke-virtual {p0, p1}, Log/k;->a(Ljava/lang/CharSequence;)Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    if-eqz p0, :cond_c

    .line 194
    .line 195
    :cond_b
    sget-object p0, Lba/a;->j:Lba/a;

    .line 196
    .line 197
    return-object p0

    .line 198
    :cond_c
    return-object v0

    .line 199
    :cond_d
    :goto_3
    sget-object p0, Lba/a;->i:Lba/a;

    .line 200
    .line 201
    return-object p0
.end method

.method public static x(Landroid/view/View;)V
    .locals 11

    .line 1
    const v0, 0x7f06003d

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Lba/j;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Lba/j;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    if-eqz v1, :cond_7

    .line 18
    .line 19
    iget-object v2, v1, Lba/j;->a:Landroid/graphics/drawable/Drawable;

    .line 20
    .line 21
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 22
    .line 23
    .line 24
    iget v2, v1, Lba/j;->b:I

    .line 25
    .line 26
    iget v4, v1, Lba/j;->c:I

    .line 27
    .line 28
    iget v5, v1, Lba/j;->d:I

    .line 29
    .line 30
    iget v6, v1, Lba/j;->e:I

    .line 31
    .line 32
    invoke-virtual {p0, v2, v4, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 33
    .line 34
    .line 35
    iget-object v1, v1, Lba/j;->f:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_6

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    check-cast v2, Lba/k;

    .line 52
    .line 53
    iget-object v4, v2, Lba/k;->a:Lba/l;

    .line 54
    .line 55
    iget-object v5, v2, Lba/k;->b:Landroid/content/res/ColorStateList;

    .line 56
    .line 57
    iget v6, v2, Lba/k;->f:I

    .line 58
    .line 59
    iget-object v7, v4, Lba/l;->a:Landroid/view/View;

    .line 60
    .line 61
    iget-object v4, v4, Lba/l;->b:Landroid/widget/TextView;

    .line 62
    .line 63
    const v8, 0x7f06003f

    .line 64
    .line 65
    .line 66
    invoke-virtual {v7, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v9

    .line 70
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 71
    .line 72
    invoke-static {v9, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v9

    .line 76
    if-nez v9, :cond_2

    .line 77
    .line 78
    invoke-virtual {v4, v8}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v8

    .line 82
    invoke-static {v8, v10}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result v8

    .line 86
    if-eqz v8, :cond_1

    .line 87
    .line 88
    goto :goto_2

    .line 89
    :cond_1
    const/4 v8, 0x0

    .line 90
    goto :goto_3

    .line 91
    :cond_2
    :goto_2
    const/4 v8, 0x1

    .line 92
    :goto_3
    iget-boolean v9, v2, Lba/k;->d:Z

    .line 93
    .line 94
    if-eqz v9, :cond_4

    .line 95
    .line 96
    if-nez v8, :cond_4

    .line 97
    .line 98
    invoke-virtual {v4}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 99
    .line 100
    .line 101
    move-result v9

    .line 102
    if-ne v9, v6, :cond_4

    .line 103
    .line 104
    invoke-static {v7}, Lba/m;->l(Landroid/view/View;)Z

    .line 105
    .line 106
    .line 107
    move-result v9

    .line 108
    if-eqz v9, :cond_3

    .line 109
    .line 110
    invoke-virtual {v5}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 111
    .line 112
    .line 113
    move-result v9

    .line 114
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 115
    .line 116
    .line 117
    move-result-object v9

    .line 118
    filled-new-array {v9}, [Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v9

    .line 122
    const-string v10, "setTextColor"

    .line 123
    .line 124
    invoke-static {v7, v10, v9}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 125
    .line 126
    .line 127
    :cond_3
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(Landroid/content/res/ColorStateList;)V

    .line 128
    .line 129
    .line 130
    :cond_4
    iget-boolean v5, v2, Lba/k;->e:Z

    .line 131
    .line 132
    if-eqz v5, :cond_5

    .line 133
    .line 134
    if-nez v8, :cond_5

    .line 135
    .line 136
    invoke-virtual {v4}, Landroid/widget/TextView;->getLinkTextColors()Landroid/content/res/ColorStateList;

    .line 137
    .line 138
    .line 139
    move-result-object v5

    .line 140
    invoke-virtual {v5}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    .line 141
    .line 142
    .line 143
    move-result v5

    .line 144
    if-ne v5, v6, :cond_5

    .line 145
    .line 146
    iget-object v2, v2, Lba/k;->c:Landroid/content/res/ColorStateList;

    .line 147
    .line 148
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setLinkTextColor(Landroid/content/res/ColorStateList;)V

    .line 149
    .line 150
    .line 151
    :cond_5
    invoke-virtual {v4}, Landroid/view/View;->invalidate()V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v7}, Landroid/view/View;->invalidate()V

    .line 155
    .line 156
    .line 157
    goto :goto_1

    .line 158
    :cond_6
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

    .line 162
    .line 163
    .line 164
    :cond_7
    return-void
.end method

.method public static y(Landroid/view/View;)Lba/l;
    .locals 3

    .line 1
    invoke-static {p0}, Lba/m;->l(Landroid/view/View;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    new-array v0, v0, [Ljava/lang/Object;

    .line 10
    .line 11
    const-string v2, "getWrappedTextView"

    .line 12
    .line 13
    invoke-static {p0, v2, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    instance-of v2, v0, Landroid/widget/TextView;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    check-cast v0, Landroid/widget/TextView;

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v0, v1

    .line 25
    :goto_0
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 29
    .line 30
    if-eqz v0, :cond_3

    .line 31
    .line 32
    move-object v0, p0

    .line 33
    check-cast v0, Landroid/widget/TextView;

    .line 34
    .line 35
    goto :goto_1

    .line 36
    :cond_2
    instance-of v0, p0, Landroid/widget/TextView;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    move-object v0, p0

    .line 41
    check-cast v0, Landroid/widget/TextView;

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_3
    move-object v0, v1

    .line 45
    :goto_1
    if-eqz v0, :cond_4

    .line 46
    .line 47
    new-instance v1, Lba/l;

    .line 48
    .line 49
    invoke-direct {v1, p0, v0}, Lba/l;-><init>(Landroid/view/View;Landroid/widget/TextView;)V

    .line 50
    .line 51
    .line 52
    :cond_4
    return-object v1
.end method


# virtual methods
.method public final e(Ljava/lang/Class;)Ljava/lang/reflect/Field;
    .locals 8

    .line 1
    iget-object v0, p0, Lba/m;->e:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/reflect/Field;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    move-object v1, p1

    .line 13
    :goto_0
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_6

    .line 15
    .line 16
    const-class v3, Ljava/lang/Object;

    .line 17
    .line 18
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    if-nez v3, :cond_6

    .line 23
    .line 24
    invoke-static {v1}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    .line 30
    .line 31
    move-result-object v3

    .line 32
    :cond_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_4

    .line 37
    .line 38
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    move-object v5, v4

    .line 43
    check-cast v5, Ljava/lang/reflect/Field;

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    const-string v7, "itemView"

    .line 50
    .line 51
    invoke-static {v6, v7}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v6

    .line 55
    if-nez v6, :cond_3

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    const-class v6, Landroid/view/View;

    .line 62
    .line 63
    invoke-static {v5, v6}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_2

    .line 68
    .line 69
    goto :goto_1

    .line 70
    :cond_2
    const/4 v5, 0x0

    .line 71
    goto :goto_2

    .line 72
    :cond_3
    :goto_1
    const/4 v5, 0x1

    .line 73
    :goto_2
    if-eqz v5, :cond_1

    .line 74
    .line 75
    move-object v2, v4

    .line 76
    :cond_4
    check-cast v2, Ljava/lang/reflect/Field;

    .line 77
    .line 78
    if-eqz v2, :cond_5

    .line 79
    .line 80
    invoke-virtual {v0, p1, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    return-object v2

    .line 84
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    goto :goto_0

    .line 89
    :cond_6
    return-object v2
.end method

.method public final f(Ljava/lang/Object;)Landroid/view/View;
    .locals 3

    .line 1
    const-string v0, "itemView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    instance-of v1, v0, Landroid/view/View;

    .line 8
    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    check-cast v0, Landroid/view/View;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object v0, v2

    .line 16
    :goto_0
    if-eqz v0, :cond_1

    .line 17
    .line 18
    return-object v0

    .line 19
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {p0, v0}, Lba/m;->e(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    instance-of v0, p1, Landroid/view/View;

    .line 32
    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    check-cast p1, Landroid/view/View;

    .line 36
    .line 37
    return-object p1

    .line 38
    :cond_2
    return-object v2
.end method

.method public final g()Ljava/util/Map;
    .locals 1

    .line 1
    iget-object v0, p0, Lba/m;->m:Lsf/i;

    .line 2
    .line 3
    invoke-virtual {v0}, Lsf/i;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/util/Map;

    .line 8
    .line 9
    return-object v0
.end method

.method public final i(Ljava/lang/Object;)Ljava/util/Map;
    .locals 8

    .line 1
    if-eqz p1, :cond_7

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lba/m;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/util/List;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    goto :goto_2

    .line 18
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :goto_0
    if-eqz v2, :cond_3

    .line 28
    .line 29
    const-class v3, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_3

    .line 36
    .line 37
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    new-instance v4, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    :cond_1
    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 51
    .line 52
    .line 53
    move-result v5

    .line 54
    if-eqz v5, :cond_2

    .line 55
    .line 56
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v5

    .line 60
    move-object v6, v5

    .line 61
    check-cast v6, Ljava/lang/reflect/Field;

    .line 62
    .line 63
    const-class v7, Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {v6}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v6

    .line 69
    invoke-virtual {v7, v6}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result v6

    .line 73
    if-eqz v6, :cond_1

    .line 74
    .line 75
    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_2
    invoke-static {v0, v4}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    goto :goto_0

    .line 87
    :cond_3
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v1, v2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    :goto_2
    new-instance v1, Luf/g;

    .line 95
    .line 96
    invoke-direct {v1}, Luf/g;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_4
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v2

    .line 107
    if-eqz v2, :cond_6

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v2

    .line 113
    check-cast v2, Ljava/lang/reflect/Field;

    .line 114
    .line 115
    invoke-static {v2, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    instance-of v3, v2, Landroid/view/View;

    .line 120
    .line 121
    if-eqz v3, :cond_5

    .line 122
    .line 123
    check-cast v2, Landroid/view/View;

    .line 124
    .line 125
    goto :goto_4

    .line 126
    :cond_5
    const/4 v2, 0x0

    .line 127
    :goto_4
    if-eqz v2, :cond_4

    .line 128
    .line 129
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 130
    .line 131
    .line 132
    move-result v3

    .line 133
    const/4 v4, -0x1

    .line 134
    if-eq v3, v4, :cond_4

    .line 135
    .line 136
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    .line 146
    .line 147
    goto :goto_3

    .line 148
    :cond_6
    invoke-virtual {v1}, Luf/g;->c()Luf/g;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    return-object p1

    .line 153
    :cond_7
    sget-object p1, Ltf/u;->g:Ltf/u;

    .line 154
    .line 155
    return-object p1
.end method

.method public final m(Ljava/lang/reflect/Method;)Z
    .locals 6

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
    if-lt v0, v1, :cond_5

    .line 9
    .line 10
    array-length v0, p1

    .line 11
    move v1, v2

    .line 12
    :goto_0
    if-ge v1, v0, :cond_5

    .line 13
    .line 14
    aget-object v3, p1, v1

    .line 15
    .line 16
    sget-object v4, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v4

    .line 22
    const/4 v5, 0x1

    .line 23
    if-nez v4, :cond_1

    .line 24
    .line 25
    const-class v4, Ljava/lang/Integer;

    .line 26
    .line 27
    invoke-static {v3, v4}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_0

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_0
    move v3, v2

    .line 35
    goto :goto_2

    .line 36
    :cond_1
    :goto_1
    move v3, v5

    .line 37
    :goto_2
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_4

    .line 46
    .line 47
    array-length v0, p1

    .line 48
    move v1, v2

    .line 49
    :goto_3
    if-ge v1, v0, :cond_5

    .line 50
    .line 51
    aget-object v3, p1, v1

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v3}, Lba/m;->e(Ljava/lang/Class;)Ljava/lang/reflect/Field;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    if-eqz v3, :cond_2

    .line 61
    .line 62
    move v3, v5

    .line 63
    goto :goto_4

    .line 64
    :cond_2
    move v3, v2

    .line 65
    :goto_4
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 66
    .line 67
    .line 68
    move-result-object v3

    .line 69
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    if-eqz v3, :cond_3

    .line 74
    .line 75
    return v5

    .line 76
    :cond_3
    add-int/lit8 v1, v1, 0x1

    .line 77
    .line 78
    goto :goto_3

    .line 79
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 80
    .line 81
    goto :goto_0

    .line 82
    :cond_5
    return v2
.end method

.method public final p()Ljava/lang/reflect/Method;
    .locals 10

    .line 1
    iget-object v0, p0, Lba/m;->a:Lr8/g;

    .line 2
    .line 3
    iget-object v1, v0, Lr8/g;->a:Landroid/content/Context;

    .line 4
    .line 5
    iget-object v2, v0, Lr8/g;->c:Ljava/lang/ClassLoader;

    .line 6
    .line 7
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-static {v1, v2}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    iget-object v1, v1, Ll8/i;->h:Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {v1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    const/4 v4, 0x0

    .line 21
    if-nez v3, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object v1, v4

    .line 25
    :goto_0
    if-eqz v1, :cond_1

    .line 26
    .line 27
    const-string v3, "|message_bubble_v3"

    .line 28
    .line 29
    invoke-virtual {v1, v3}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object v1, v4

    .line 35
    :goto_1
    const-string v3, ""

    .line 36
    .line 37
    if-nez v1, :cond_2

    .line 38
    .line 39
    move-object v1, v3

    .line 40
    :cond_2
    iget-object v5, p0, Lba/m;->d:Landroid/content/SharedPreferences;

    .line 41
    .line 42
    const-string v6, "adapter_bind"

    .line 43
    .line 44
    invoke-static {v5, v1, v2, v6}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 45
    .line 46
    .line 47
    move-result-object v7

    .line 48
    if-eqz v7, :cond_4

    .line 49
    .line 50
    invoke-virtual {p0, v7}, Lba/m;->m(Ljava/lang/reflect/Method;)Z

    .line 51
    .line 52
    .line 53
    move-result v8

    .line 54
    if-eqz v8, :cond_3

    .line 55
    .line 56
    goto :goto_2

    .line 57
    :cond_3
    move-object v7, v4

    .line 58
    :goto_2
    if-eqz v7, :cond_4

    .line 59
    .line 60
    return-object v7

    .line 61
    :cond_4
    const-string v7, "MicroMsg.MvvmChattingItem"

    .line 62
    .line 63
    const-string v8, "[onBindView]"

    .line 64
    .line 65
    filled-new-array {v7, v8}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    :try_start_0
    iget-object v0, v0, Lr8/g;->d:Lorg/luckypray/dexkit/DexKitBridge;

    .line 70
    .line 71
    new-instance v8, Lch/e;

    .line 72
    .line 73
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 74
    .line 75
    .line 76
    new-instance v9, Lfh/k;

    .line 77
    .line 78
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-static {v7}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    invoke-static {v9, v7}, Lfh/k;->u0(Lfh/k;Ljava/util/Collection;)V

    .line 86
    .line 87
    .line 88
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 89
    .line 90
    invoke-virtual {v0, v8}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    new-instance v7, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v7}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    :cond_5
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 104
    .line 105
    .line 106
    move-result v8

    .line 107
    if-eqz v8, :cond_7

    .line 108
    .line 109
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v8

    .line 113
    check-cast v8, Lhh/o;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 114
    .line 115
    :try_start_1
    invoke-virtual {v8, v2}, Lhh/o;->r(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 116
    .line 117
    .line 118
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 119
    goto :goto_4

    .line 120
    :catchall_0
    move-exception v8

    .line 121
    :try_start_2
    new-instance v9, Lsf/f;

    .line 122
    .line 123
    invoke-direct {v9, v8}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 124
    .line 125
    .line 126
    move-object v8, v9

    .line 127
    :goto_4
    nop

    .line 128
    instance-of v9, v8, Lsf/f;

    .line 129
    .line 130
    if-eqz v9, :cond_6

    .line 131
    .line 132
    move-object v8, v4

    .line 133
    :cond_6
    check-cast v8, Ljava/lang/reflect/Method;

    .line 134
    .line 135
    if-eqz v8, :cond_5

    .line 136
    .line 137
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 138
    .line 139
    .line 140
    goto :goto_3

    .line 141
    :catchall_1
    move-exception v0

    .line 142
    new-instance v7, Lsf/f;

    .line 143
    .line 144
    invoke-direct {v7, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-static {v7}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    if-nez v0, :cond_8

    .line 152
    .line 153
    goto :goto_5

    .line 154
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    const-string v7, "[Hchat:MessageBubble] \u5b9a\u4f4d\u804a\u5929\u6d88\u606f\u7ed1\u5b9a\u65b9\u6cd5\u5f02\u5e38: "

    .line 159
    .line 160
    invoke-static {v7, v2, v0}, Leh/a;->x(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 161
    .line 162
    .line 163
    sget-object v7, Ltf/t;->g:Ltf/t;

    .line 164
    .line 165
    :goto_5
    check-cast v7, Ljava/util/List;

    .line 166
    .line 167
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 168
    .line 169
    .line 170
    move-result-object v0

    .line 171
    :cond_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 172
    .line 173
    .line 174
    move-result v2

    .line 175
    if-eqz v2, :cond_a

    .line 176
    .line 177
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    move-result-object v2

    .line 181
    move-object v7, v2

    .line 182
    check-cast v7, Ljava/lang/reflect/Method;

    .line 183
    .line 184
    invoke-virtual {p0, v7}, Lba/m;->m(Ljava/lang/reflect/Method;)Z

    .line 185
    .line 186
    .line 187
    move-result v7

    .line 188
    if-eqz v7, :cond_9

    .line 189
    .line 190
    move-object v4, v2

    .line 191
    :cond_a
    check-cast v4, Ljava/lang/reflect/Method;

    .line 192
    .line 193
    if-eqz v4, :cond_b

    .line 194
    .line 195
    invoke-static {v5, v1, v6, v4}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 196
    .line 197
    .line 198
    goto :goto_6

    .line 199
    :cond_b
    const-string v0, "cache.key"

    .line 200
    .line 201
    :try_start_3
    invoke-interface {v5}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    invoke-interface {v5, v0, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 206
    .line 207
    .line 208
    move-result-object v3

    .line 209
    invoke-static {v3, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 210
    .line 211
    .line 212
    move-result v3

    .line 213
    if-nez v3, :cond_c

    .line 214
    .line 215
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 216
    .line 217
    .line 218
    move-result-object v3

    .line 219
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 220
    .line 221
    .line 222
    :cond_c
    invoke-interface {v2, v6}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 227
    .line 228
    .line 229
    :catchall_2
    :goto_6
    return-object v4
.end method

.method public final w(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p2, :cond_e

    .line 3
    .line 4
    const/4 v1, 0x4

    .line 5
    if-gt p1, v1, :cond_e

    .line 6
    .line 7
    invoke-interface {p3, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    iget-object v3, p0, Lba/m;->k:Ljava/util/concurrent/ConcurrentHashMap;

    .line 28
    .line 29
    invoke-virtual {v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    check-cast v4, Ljava/lang/Boolean;

    .line 34
    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v6, 0x1

    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 40
    .line 41
    .line 42
    move-result v2

    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const-string v4, "field_msgId"

    .line 45
    .line 46
    invoke-static {v2, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    if-eqz v4, :cond_2

    .line 51
    .line 52
    const-string v4, "field_msgSvrId"

    .line 53
    .line 54
    invoke-static {v2, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 55
    .line 56
    .line 57
    move-result-object v4

    .line 58
    if-eqz v4, :cond_2

    .line 59
    .line 60
    const-string v4, "field_type"

    .line 61
    .line 62
    invoke-static {v2, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 63
    .line 64
    .line 65
    move-result-object v4

    .line 66
    if-eqz v4, :cond_2

    .line 67
    .line 68
    const-string v4, "field_isSend"

    .line 69
    .line 70
    invoke-static {v2, v4}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 71
    .line 72
    .line 73
    move-result-object v4

    .line 74
    if-eqz v4, :cond_2

    .line 75
    .line 76
    move v4, v6

    .line 77
    goto :goto_0

    .line 78
    :cond_2
    move v4, v5

    .line 79
    :goto_0
    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 80
    .line 81
    .line 82
    move-result-object v7

    .line 83
    invoke-virtual {v3, v2, v7}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move v2, v4

    .line 87
    :goto_1
    if-eqz v2, :cond_3

    .line 88
    .line 89
    return-object p2

    .line 90
    :cond_3
    const-string v2, "java."

    .line 91
    .line 92
    invoke-static {v1, v2, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 93
    .line 94
    .line 95
    move-result v2

    .line 96
    if-nez v2, :cond_e

    .line 97
    .line 98
    const-string v2, "android."

    .line 99
    .line 100
    invoke-static {v1, v2, v5}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 101
    .line 102
    .line 103
    move-result v1

    .line 104
    if-eqz v1, :cond_4

    .line 105
    .line 106
    goto/16 :goto_6

    .line 107
    .line 108
    :cond_4
    instance-of v1, p2, Landroid/view/View;

    .line 109
    .line 110
    if-nez v1, :cond_e

    .line 111
    .line 112
    instance-of v1, p2, Landroid/view/ViewGroup;

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    return-object v0

    .line 117
    :cond_5
    instance-of v1, p2, Ljava/util/Collection;

    .line 118
    .line 119
    if-eqz v1, :cond_7

    .line 120
    .line 121
    check-cast p2, Ljava/util/Collection;

    .line 122
    .line 123
    invoke-interface {p2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    :cond_6
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_e

    .line 132
    .line 133
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v1

    .line 137
    add-int/lit8 v2, p1, 0x1

    .line 138
    .line 139
    invoke-virtual {p0, v2, v1, p3}, Lba/m;->w(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-eqz v1, :cond_6

    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_7
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    iget-object v2, p0, Lba/m;->j:Ljava/util/concurrent/ConcurrentHashMap;

    .line 151
    .line 152
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    check-cast v3, Ljava/util/List;

    .line 157
    .line 158
    if-eqz v3, :cond_8

    .line 159
    .line 160
    goto :goto_5

    .line 161
    :cond_8
    new-instance v3, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    move-object v4, v1

    .line 167
    :goto_2
    if-eqz v4, :cond_c

    .line 168
    .line 169
    const-class v7, Ljava/lang/Object;

    .line 170
    .line 171
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-nez v7, :cond_c

    .line 176
    .line 177
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 178
    .line 179
    .line 180
    move-result-object v7

    .line 181
    new-instance v8, Ljava/util/ArrayList;

    .line 182
    .line 183
    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 184
    .line 185
    .line 186
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 187
    .line 188
    .line 189
    move-result-object v7

    .line 190
    :cond_9
    :goto_3
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 191
    .line 192
    .line 193
    move-result v9

    .line 194
    if-eqz v9, :cond_b

    .line 195
    .line 196
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    move-result-object v9

    .line 200
    move-object v10, v9

    .line 201
    check-cast v10, Ljava/lang/reflect/Field;

    .line 202
    .line 203
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    invoke-virtual {v10}, Ljava/lang/Class;->isPrimitive()Z

    .line 208
    .line 209
    .line 210
    move-result v11

    .line 211
    if-nez v11, :cond_a

    .line 212
    .line 213
    invoke-virtual {v10}, Ljava/lang/Class;->isArray()Z

    .line 214
    .line 215
    .line 216
    move-result v11

    .line 217
    if-nez v11, :cond_a

    .line 218
    .line 219
    const-class v11, Ljava/lang/String;

    .line 220
    .line 221
    invoke-virtual {v10, v11}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 222
    .line 223
    .line 224
    move-result v11

    .line 225
    if-nez v11, :cond_a

    .line 226
    .line 227
    const-class v11, Ljava/lang/Number;

    .line 228
    .line 229
    invoke-virtual {v11, v10}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 230
    .line 231
    .line 232
    move-result v10

    .line 233
    if-nez v10, :cond_a

    .line 234
    .line 235
    move v10, v6

    .line 236
    goto :goto_4

    .line 237
    :cond_a
    move v10, v5

    .line 238
    :goto_4
    if-eqz v10, :cond_9

    .line 239
    .line 240
    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    goto :goto_3

    .line 244
    :cond_b
    invoke-static {v3, v8}, Ltf/r;->h1(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 248
    .line 249
    .line 250
    move-result-object v4

    .line 251
    goto :goto_2

    .line 252
    :cond_c
    invoke-virtual {v2, v1, v3}, Ljava/util/concurrent/ConcurrentHashMap;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 253
    .line 254
    .line 255
    :goto_5
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 256
    .line 257
    .line 258
    move-result-object v1

    .line 259
    :cond_d
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 260
    .line 261
    .line 262
    move-result v2

    .line 263
    if-eqz v2, :cond_e

    .line 264
    .line 265
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    check-cast v2, Ljava/lang/reflect/Field;

    .line 270
    .line 271
    invoke-static {v2, p2}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    if-eqz v2, :cond_d

    .line 276
    .line 277
    add-int/lit8 v3, p1, 0x1

    .line 278
    .line 279
    invoke-virtual {p0, v3, v2, p3}, Lba/m;->w(ILjava/lang/Object;Ljava/util/Set;)Ljava/lang/Object;

    .line 280
    .line 281
    .line 282
    move-result-object v2

    .line 283
    if-eqz v2, :cond_d

    .line 284
    .line 285
    return-object v2

    .line 286
    :cond_e
    :goto_6
    return-object v0
.end method
