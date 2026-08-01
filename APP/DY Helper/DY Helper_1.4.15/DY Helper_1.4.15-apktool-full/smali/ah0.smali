.class public final Lah0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final Α:Lym1;

.field public static final Β:Lym1;

.field public static final Γ:Lzb0;

.field public static final Δ:Lzb0;

.field public static final Ε:Lzb0;

.field public static final α:Landroid/os/Handler;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ε:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final η:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final θ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final ι:Ljava/lang/Object;

.field public static final κ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final λ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final μ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static volatile ν:Ldk0;

.field public static volatile ξ:Ljava/lang/ClassLoader;

.field public static volatile ο:Ljava/lang/Class;

.field public static volatile π:Ljava/lang/Class;

.field public static final ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static final σ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final τ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final υ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final φ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final χ:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final ψ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public static final ω:Lym1;


# direct methods
.method static constructor <clinit>()V
    .locals 8

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
    sput-object v0, Lah0;->α:Landroid/os/Handler;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lah0;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 19
    .line 20
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 21
    .line 22
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lah0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lah0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 33
    .line 34
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 37
    .line 38
    .line 39
    sput-object v0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 40
    .line 41
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 42
    .line 43
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 44
    .line 45
    .line 46
    sput-object v0, Lah0;->ζ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 49
    .line 50
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 51
    .line 52
    .line 53
    sput-object v0, Lah0;->η:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 54
    .line 55
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 56
    .line 57
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 58
    .line 59
    .line 60
    sput-object v0, Lah0;->θ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 61
    .line 62
    new-instance v0, Ljava/lang/Object;

    .line 63
    .line 64
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lah0;->ι:Ljava/lang/Object;

    .line 68
    .line 69
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lah0;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 75
    .line 76
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 77
    .line 78
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    sput-object v0, Lah0;->λ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 82
    .line 83
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    sput-object v0, Lah0;->μ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 88
    .line 89
    new-instance v1, Ldk0;

    .line 90
    .line 91
    const-string v6, "#000000"

    .line 92
    .line 93
    const-string v7, "#FFFFFF"

    .line 94
    .line 95
    const/4 v2, 0x0

    .line 96
    const/4 v3, 0x0

    .line 97
    const-string v4, "yyyy-MM-dd HH:mm:ss"

    .line 98
    .line 99
    const-string v5, "{time}"

    .line 100
    .line 101
    invoke-direct/range {v1 .. v7}, Ldk0;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    sput-object v1, Lah0;->ν:Ldk0;

    .line 105
    .line 106
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 107
    .line 108
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 109
    .line 110
    .line 111
    sput-object v0, Lah0;->ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 112
    .line 113
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 114
    .line 115
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 116
    .line 117
    .line 118
    sput-object v0, Lah0;->σ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 119
    .line 120
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 121
    .line 122
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    sput-object v0, Lah0;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 126
    .line 127
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 128
    .line 129
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 130
    .line 131
    .line 132
    sput-object v0, Lah0;->υ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 133
    .line 134
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 135
    .line 136
    .line 137
    move-result-object v0

    .line 138
    sput-object v0, Lah0;->φ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 139
    .line 140
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 141
    .line 142
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 143
    .line 144
    .line 145
    sput-object v0, Lah0;->χ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 146
    .line 147
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    sput-object v0, Lah0;->ψ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 152
    .line 153
    new-instance v0, Lym1;

    .line 154
    .line 155
    const-string v1, "^(?:(?:\u4eca\u5929|\u6628\u5929|\u524d\u5929|\u661f\u671f[\u4e00\u4e8c\u4e09\u56db\u4e94\u516d\u65e5\u5929]|\u5468[\u4e00\u4e8c\u4e09\u56db\u4e94\u516d\u65e5\u5929])\\s*)?(?:\u4e0a\u5348|\u4e0b\u5348|\u665a\u4e0a|\u51cc\u6668)?\\s*\\d{1,2}:\\d{2}(?::\\d{2})?$"

    .line 156
    .line 157
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    sput-object v0, Lah0;->ω:Lym1;

    .line 161
    .line 162
    new-instance v0, Lym1;

    .line 163
    .line 164
    const-string v1, "^\\d{4}(?:[-/\u5e74])\\d{1,2}(?:[-/\u6708])\\d{1,2}\u65e5?(?:\\s+(?:\u4e0a\u5348|\u4e0b\u5348|\u665a\u4e0a|\u51cc\u6668)?\\s*\\d{1,2}:\\d{2}(?::\\d{2})?)?$"

    .line 165
    .line 166
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    sput-object v0, Lah0;->Α:Lym1;

    .line 170
    .line 171
    new-instance v0, Lym1;

    .line 172
    .line 173
    const-string v1, "\\d{1,2}:\\d{2}"

    .line 174
    .line 175
    invoke-direct {v0, v1}, Lym1;-><init>(Ljava/lang/String;)V

    .line 176
    .line 177
    .line 178
    sput-object v0, Lah0;->Β:Lym1;

    .line 179
    .line 180
    new-instance v0, Lzb0;

    .line 181
    .line 182
    const/16 v1, 0x1a

    .line 183
    .line 184
    invoke-direct {v0, v1}, Lzb0;-><init>(I)V

    .line 185
    .line 186
    .line 187
    sput-object v0, Lah0;->Γ:Lzb0;

    .line 188
    .line 189
    new-instance v0, Lzb0;

    .line 190
    .line 191
    const/16 v1, 0x1b

    .line 192
    .line 193
    invoke-direct {v0, v1}, Lzb0;-><init>(I)V

    .line 194
    .line 195
    .line 196
    sput-object v0, Lah0;->Δ:Lzb0;

    .line 197
    .line 198
    new-instance v0, Lzb0;

    .line 199
    .line 200
    const/16 v1, 0x1c

    .line 201
    .line 202
    invoke-direct {v0, v1}, Lzb0;-><init>(I)V

    .line 203
    .line 204
    .line 205
    sput-object v0, Lah0;->Ε:Lzb0;

    .line 206
    .line 207
    return-void
.end method

.method public static Α(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lef;

    .line 6
    .line 7
    const/16 v2, 0x8

    .line 8
    .line 9
    invoke-direct {v1, v2, p0}, Lef;-><init>(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    new-instance v2, Lc8;

    .line 13
    .line 14
    const/16 v3, 0xa

    .line 15
    .line 16
    invoke-direct {v2, v1, v3}, Lc8;-><init>(La80;I)V

    .line 17
    .line 18
    .line 19
    sget-object v1, Lah0;->τ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 20
    .line 21
    invoke-virtual {v1, v0, v2}, Ljava/util/concurrent/ConcurrentHashMap;->computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    check-cast v0, Ljava/util/List;

    .line 29
    .line 30
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x0

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/lang/reflect/Field;

    .line 46
    .line 47
    :try_start_0
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    goto :goto_0

    .line 52
    :catchall_0
    move-exception v1

    .line 53
    new-instance v3, Leo1;

    .line 54
    .line 55
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 56
    .line 57
    .line 58
    move-object v1, v3

    .line 59
    :goto_0
    instance-of v3, v1, Leo1;

    .line 60
    .line 61
    if-eqz v3, :cond_1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_1
    move-object v2, v1

    .line 65
    :goto_1
    invoke-static {v2}, Lah0;->Λ(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    .line 71
    :cond_2
    return-object v2
.end method

.method public static Β(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V
    .locals 6

    .line 1
    invoke-static {p1}, Lah0;->φ(Ljava/lang/Object;)Landroid/view/View;

    .line 2
    .line 3
    .line 4
    move-result-object v1

    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_0
    invoke-static {}, Lah0;->Θ()Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    invoke-static {v1}, Lah0;->η(Landroid/view/View;)V

    .line 15
    .line 16
    .line 17
    return-void

    .line 18
    :cond_1
    invoke-static {p1}, Lah0;->ω(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_3

    .line 23
    .line 24
    if-eqz p0, :cond_2

    .line 25
    .line 26
    if-eqz p2, :cond_2

    .line 27
    .line 28
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    invoke-static {v0, p0}, Lah0;->ψ(ILjava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    goto :goto_0

    .line 37
    :cond_2
    const/4 v0, 0x0

    .line 38
    :cond_3
    :goto_0
    if-nez v0, :cond_5

    .line 39
    .line 40
    invoke-static {v1}, Lah0;->η(Landroid/view/View;)V

    .line 41
    .line 42
    .line 43
    const v0, 0x7e34000a

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 51
    .line 52
    invoke-static {v2, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-eqz v2, :cond_4

    .line 57
    .line 58
    :goto_1
    return-void

    .line 59
    :cond_4
    invoke-virtual {v1, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    new-instance v0, Lvg0;

    .line 63
    .line 64
    move-object v3, p0

    .line 65
    move-object v2, p1

    .line 66
    move-object v4, p2

    .line 67
    move-object v5, p3

    .line 68
    invoke-direct/range {v0 .. v5}, Lvg0;-><init>(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_5
    move-object v2, p1

    .line 76
    invoke-static {v1, v2, v0}, Lah0;->Ρ(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 77
    .line 78
    .line 79
    return-void
.end method

.method public static Γ(Ljava/lang/Class;Ljava/lang/String;)Z
    .locals 1

    .line 1
    :goto_0
    if-eqz p0, :cond_1

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    const/4 p0, 0x1

    .line 22
    return p0

    .line 23
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const/4 p0, 0x0

    .line 29
    return p0
.end method

.method public static Δ(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)Lyg0;
    .locals 29

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    move/from16 v3, p3

    .line 6
    .line 7
    move-object/from16 v8, p4

    .line 8
    .line 9
    sget-object v9, Lyg0;->ζ:Lyg0;

    .line 10
    .line 11
    sget-object v10, Lyg0;->η:Lyg0;

    .line 12
    .line 13
    const v2, 0x7e340002

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-static {v2, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_0

    .line 25
    .line 26
    return-object v10

    .line 27
    :cond_0
    instance-of v2, v1, Landroid/widget/FrameLayout;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    move-object v2, v1

    .line 32
    check-cast v2, Landroid/widget/FrameLayout;

    .line 33
    .line 34
    move-object v12, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v12, 0x0

    .line 37
    :goto_0
    const/4 v13, 0x0

    .line 38
    if-nez v12, :cond_2

    .line 39
    .line 40
    invoke-static {v1, v13}, Lah0;->Υ(Landroid/view/View;Z)V

    .line 41
    .line 42
    .line 43
    return-object v10

    .line 44
    :cond_2
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-gtz v2, :cond_3

    .line 49
    .line 50
    return-object v9

    .line 51
    :cond_3
    const v14, 0x7e340006

    .line 52
    .line 53
    .line 54
    invoke-static {v1, v14}, Lah0;->τ(Landroid/view/View;I)Landroid/view/View;

    .line 55
    .line 56
    .line 57
    move-result-object v2

    .line 58
    if-eqz v2, :cond_4

    .line 59
    .line 60
    invoke-static {v2, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 61
    .line 62
    .line 63
    move-result v4

    .line 64
    if-eqz v4, :cond_4

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_4
    const/4 v2, 0x0

    .line 68
    :goto_1
    const/high16 v15, -0x80000000

    .line 69
    .line 70
    if-nez v2, :cond_2d

    .line 71
    .line 72
    instance-of v2, v1, Landroid/view/ViewGroup;

    .line 73
    .line 74
    if-eqz v2, :cond_5

    .line 75
    .line 76
    move-object v5, v1

    .line 77
    check-cast v5, Landroid/view/ViewGroup;

    .line 78
    .line 79
    goto :goto_2

    .line 80
    :cond_5
    const/4 v5, 0x0

    .line 81
    :goto_2
    if-nez v5, :cond_6

    .line 82
    .line 83
    const/4 v5, 0x0

    .line 84
    goto :goto_3

    .line 85
    :cond_6
    new-instance v6, Lum1;

    .line 86
    .line 87
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 88
    .line 89
    .line 90
    new-instance v7, Lsm1;

    .line 91
    .line 92
    invoke-direct {v7}, Ljava/lang/Object;-><init>()V

    .line 93
    .line 94
    .line 95
    iput v15, v7, Lsm1;->ε:I

    .line 96
    .line 97
    invoke-static {v1, v3, v7, v6, v5}, Lah0;->σ(Landroid/view/View;ZLsm1;Lum1;Landroid/view/View;)V

    .line 98
    .line 99
    .line 100
    iget-object v5, v6, Lum1;->ε:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v5, Landroid/view/View;

    .line 103
    .line 104
    :goto_3
    if-eqz v5, :cond_7

    .line 105
    .line 106
    invoke-static {v5, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 107
    .line 108
    .line 109
    move-result v6

    .line 110
    if-eqz v6, :cond_7

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_7
    const/4 v5, 0x0

    .line 114
    :goto_4
    if-nez v5, :cond_2c

    .line 115
    .line 116
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 117
    .line 118
    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    .line 119
    .line 120
    .line 121
    const-string v6, "o"

    .line 122
    .line 123
    const-string v7, "p"

    .line 124
    .line 125
    filled-new-array {v6, v7}, [Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v6

    .line 129
    invoke-static {v6}, Lyh;->б([Ljava/lang/Object;)Ljava/util/List;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    :goto_5
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v7

    .line 141
    if-eqz v7, :cond_a

    .line 142
    .line 143
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    check-cast v7, Ljava/lang/String;

    .line 148
    .line 149
    move-object/from16 v11, p1

    .line 150
    .line 151
    invoke-static {v11, v7}, Lah0;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    move-result-object v7

    .line 155
    instance-of v14, v7, Ljava/lang/Iterable;

    .line 156
    .line 157
    if-eqz v14, :cond_8

    .line 158
    .line 159
    check-cast v7, Ljava/lang/Iterable;

    .line 160
    .line 161
    goto :goto_6

    .line 162
    :cond_8
    const/4 v7, 0x0

    .line 163
    :goto_6
    if-eqz v7, :cond_9

    .line 164
    .line 165
    invoke-static {v7}, Lxh;->Ж(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 166
    .line 167
    .line 168
    move-result-object v7

    .line 169
    invoke-virtual {v7}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v7

    .line 173
    :goto_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v14

    .line 177
    if-eqz v14, :cond_9

    .line 178
    .line 179
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v14

    .line 183
    invoke-virtual {v5, v14}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 184
    .line 185
    .line 186
    goto :goto_7

    .line 187
    :cond_9
    const v14, 0x7e340006

    .line 188
    .line 189
    .line 190
    goto :goto_5

    .line 191
    :cond_a
    move-object/from16 v11, p1

    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->isEmpty()Z

    .line 194
    .line 195
    .line 196
    move-result v6

    .line 197
    if-eqz v6, :cond_c

    .line 198
    .line 199
    move/from16 v19, v2

    .line 200
    .line 201
    const/4 v5, 0x1

    .line 202
    :cond_b
    const/4 v7, 0x0

    .line 203
    goto/16 :goto_e

    .line 204
    .line 205
    :cond_c
    invoke-virtual {v5}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 210
    .line 211
    .line 212
    const/4 v7, 0x0

    .line 213
    :goto_8
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 214
    .line 215
    .line 216
    move-result v14

    .line 217
    const-string v15, "getCellView"

    .line 218
    .line 219
    const-string v4, "getCellViewOrNull"

    .line 220
    .line 221
    if-eqz v14, :cond_15

    .line 222
    .line 223
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    move-result-object v14

    .line 227
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 231
    .line 232
    .line 233
    move-result-object v18

    .line 234
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 239
    .line 240
    .line 241
    move-result-object v18

    .line 242
    move/from16 v19, v2

    .line 243
    .line 244
    invoke-virtual/range {v18 .. v18}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object v2

    .line 248
    const-string v3, "NewBgContentCellUI"

    .line 249
    .line 250
    move-object/from16 v18, v5

    .line 251
    .line 252
    const/4 v5, 0x0

    .line 253
    invoke-static {v13, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 254
    .line 255
    .line 256
    move-result v3

    .line 257
    if-nez v3, :cond_d

    .line 258
    .line 259
    const-string v3, "BgContent"

    .line 260
    .line 261
    const/4 v5, 0x1

    .line 262
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 263
    .line 264
    .line 265
    move-result v3

    .line 266
    if-nez v3, :cond_e

    .line 267
    .line 268
    const-string v3, "BGContent"

    .line 269
    .line 270
    invoke-static {v2, v3, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 271
    .line 272
    .line 273
    move-result v2

    .line 274
    if-eqz v2, :cond_14

    .line 275
    .line 276
    goto :goto_9

    .line 277
    :cond_d
    const/4 v5, 0x1

    .line 278
    :cond_e
    :goto_9
    const-string v2, "getBgContainerView"

    .line 279
    .line 280
    invoke-static {v14, v2}, Lah0;->ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;

    .line 281
    .line 282
    .line 283
    move-result-object v2

    .line 284
    if-nez v2, :cond_10

    .line 285
    .line 286
    const-string v2, "bgContentContainer"

    .line 287
    .line 288
    invoke-static {v14, v2}, Lah0;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v2

    .line 292
    instance-of v3, v2, Landroid/view/View;

    .line 293
    .line 294
    if-eqz v3, :cond_f

    .line 295
    .line 296
    check-cast v2, Landroid/view/View;

    .line 297
    .line 298
    goto :goto_a

    .line 299
    :cond_f
    const/4 v2, 0x0

    .line 300
    :cond_10
    :goto_a
    invoke-static {v2, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 301
    .line 302
    .line 303
    move-result v3

    .line 304
    if-eqz v3, :cond_11

    .line 305
    .line 306
    move-object v7, v2

    .line 307
    goto/16 :goto_e

    .line 308
    .line 309
    :cond_11
    const-string v2, "contentView"

    .line 310
    .line 311
    invoke-static {v14, v2}, Lah0;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v2

    .line 315
    instance-of v3, v2, Landroid/view/View;

    .line 316
    .line 317
    if-eqz v3, :cond_12

    .line 318
    .line 319
    check-cast v2, Landroid/view/View;

    .line 320
    .line 321
    goto :goto_b

    .line 322
    :cond_12
    const/4 v2, 0x0

    .line 323
    :goto_b
    if-nez v2, :cond_13

    .line 324
    .line 325
    invoke-static {v14, v4}, Lah0;->ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;

    .line 326
    .line 327
    .line 328
    move-result-object v2

    .line 329
    if-nez v2, :cond_13

    .line 330
    .line 331
    invoke-static {v14, v15}, Lah0;->ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;

    .line 332
    .line 333
    .line 334
    move-result-object v2

    .line 335
    :cond_13
    invoke-static {v2, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 336
    .line 337
    .line 338
    move-result v3

    .line 339
    if-eqz v3, :cond_14

    .line 340
    .line 341
    move/from16 v3, p3

    .line 342
    .line 343
    move-object v7, v2

    .line 344
    :goto_c
    move-object/from16 v5, v18

    .line 345
    .line 346
    move/from16 v2, v19

    .line 347
    .line 348
    const/4 v13, 0x0

    .line 349
    const/high16 v15, -0x80000000

    .line 350
    .line 351
    goto/16 :goto_8

    .line 352
    .line 353
    :cond_14
    move/from16 v3, p3

    .line 354
    .line 355
    goto :goto_c

    .line 356
    :cond_15
    move/from16 v19, v2

    .line 357
    .line 358
    move-object/from16 v18, v5

    .line 359
    .line 360
    const/4 v5, 0x1

    .line 361
    if-eqz v7, :cond_16

    .line 362
    .line 363
    goto :goto_e

    .line 364
    :cond_16
    invoke-virtual/range {v18 .. v18}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 365
    .line 366
    .line 367
    move-result-object v2

    .line 368
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 369
    .line 370
    .line 371
    :cond_17
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 372
    .line 373
    .line 374
    move-result v3

    .line 375
    if-eqz v3, :cond_b

    .line 376
    .line 377
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 378
    .line 379
    .line 380
    move-result-object v3

    .line 381
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 382
    .line 383
    .line 384
    invoke-static {v3, v4}, Lah0;->ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;

    .line 385
    .line 386
    .line 387
    move-result-object v6

    .line 388
    if-nez v6, :cond_18

    .line 389
    .line 390
    invoke-static {v3, v15}, Lah0;->ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;

    .line 391
    .line 392
    .line 393
    move-result-object v3

    .line 394
    move-object v7, v3

    .line 395
    goto :goto_d

    .line 396
    :cond_18
    move-object v7, v6

    .line 397
    :goto_d
    invoke-static {v7, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 398
    .line 399
    .line 400
    move-result v3

    .line 401
    if-eqz v3, :cond_17

    .line 402
    .line 403
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 404
    .line 405
    .line 406
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 407
    .line 408
    .line 409
    move-result-object v3

    .line 410
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 411
    .line 412
    .line 413
    move-result-object v3

    .line 414
    const-string v6, "ConstraintLayout"

    .line 415
    .line 416
    const/4 v13, 0x0

    .line 417
    invoke-static {v3, v6, v13}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 418
    .line 419
    .line 420
    move-result v6

    .line 421
    if-nez v6, :cond_19

    .line 422
    .line 423
    const-string v6, "FrameLayout"

    .line 424
    .line 425
    invoke-static {v3, v6, v13}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 426
    .line 427
    .line 428
    move-result v6

    .line 429
    if-nez v6, :cond_19

    .line 430
    .line 431
    const-string v6, "LinearLayout"

    .line 432
    .line 433
    invoke-static {v3, v6, v13}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 434
    .line 435
    .line 436
    move-result v3

    .line 437
    if-eqz v3, :cond_17

    .line 438
    .line 439
    :cond_19
    :goto_e
    if-eqz v7, :cond_1a

    .line 440
    .line 441
    goto :goto_10

    .line 442
    :cond_1a
    invoke-static {v11}, Lah0;->ξ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v2

    .line 446
    if-nez v2, :cond_1c

    .line 447
    .line 448
    :cond_1b
    const/4 v7, 0x0

    .line 449
    goto :goto_f

    .line 450
    :cond_1c
    const-string v3, "getContentAndSireContainer"

    .line 451
    .line 452
    invoke-static {v2, v3}, Lah0;->ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;

    .line 453
    .line 454
    .line 455
    move-result-object v3

    .line 456
    invoke-static {v3, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 457
    .line 458
    .line 459
    move-result v4

    .line 460
    if-eqz v4, :cond_1d

    .line 461
    .line 462
    move-object v7, v3

    .line 463
    goto :goto_f

    .line 464
    :cond_1d
    const-string v3, "getContentView"

    .line 465
    .line 466
    invoke-static {v2, v3}, Lah0;->ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    invoke-static {v2, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 471
    .line 472
    .line 473
    move-result v3

    .line 474
    if-eqz v3, :cond_1b

    .line 475
    .line 476
    move-object v7, v2

    .line 477
    :goto_f
    if-eqz v7, :cond_1e

    .line 478
    .line 479
    goto :goto_10

    .line 480
    :cond_1e
    const/4 v7, 0x0

    .line 481
    :goto_10
    if-eqz v7, :cond_20

    .line 482
    .line 483
    invoke-static {v7, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 484
    .line 485
    .line 486
    move-result v2

    .line 487
    if-eqz v2, :cond_1f

    .line 488
    .line 489
    goto :goto_11

    .line 490
    :cond_1f
    const/4 v7, 0x0

    .line 491
    :goto_11
    move-object v2, v7

    .line 492
    goto :goto_12

    .line 493
    :cond_20
    const/4 v2, 0x0

    .line 494
    :goto_12
    if-nez v2, :cond_2b

    .line 495
    .line 496
    if-eqz v19, :cond_21

    .line 497
    .line 498
    move-object v2, v1

    .line 499
    check-cast v2, Landroid/view/ViewGroup;

    .line 500
    .line 501
    goto :goto_13

    .line 502
    :cond_21
    const/4 v2, 0x0

    .line 503
    :goto_13
    if-nez v2, :cond_23

    .line 504
    .line 505
    move v11, v5

    .line 506
    :cond_22
    const/4 v2, 0x0

    .line 507
    goto :goto_16

    .line 508
    :cond_23
    invoke-virtual {v2}, Landroid/view/View;->getWidth()I

    .line 509
    .line 510
    .line 511
    move-result v3

    .line 512
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 513
    .line 514
    .line 515
    move-result-object v4

    .line 516
    if-lez v3, :cond_24

    .line 517
    .line 518
    goto :goto_14

    .line 519
    :cond_24
    const/4 v4, 0x0

    .line 520
    :goto_14
    if-eqz v4, :cond_25

    .line 521
    .line 522
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 523
    .line 524
    .line 525
    move-result v3

    .line 526
    goto :goto_15

    .line 527
    :cond_25
    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 528
    .line 529
    .line 530
    move-result-object v3

    .line 531
    invoke-virtual {v3}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 532
    .line 533
    .line 534
    move-result-object v3

    .line 535
    iget v3, v3, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 536
    .line 537
    :goto_15
    new-instance v6, Lum1;

    .line 538
    .line 539
    invoke-direct {v6}, Ljava/lang/Object;-><init>()V

    .line 540
    .line 541
    .line 542
    move/from16 v17, v5

    .line 543
    .line 544
    new-instance v5, Lsm1;

    .line 545
    .line 546
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 547
    .line 548
    .line 549
    const/high16 v4, -0x80000000

    .line 550
    .line 551
    iput v4, v5, Lsm1;->ε:I

    .line 552
    .line 553
    move-object v7, v2

    .line 554
    move/from16 v4, p3

    .line 555
    .line 556
    move/from16 v11, v17

    .line 557
    .line 558
    invoke-static/range {v1 .. v7}, Lah0;->π(Landroid/view/View;Landroid/view/ViewGroup;IZLsm1;Lum1;Landroid/view/View;)V

    .line 559
    .line 560
    .line 561
    iget v2, v5, Lsm1;->ε:I

    .line 562
    .line 563
    const/16 v3, 0x3c

    .line 564
    .line 565
    if-lt v2, v3, :cond_22

    .line 566
    .line 567
    iget-object v2, v6, Lum1;->ε:Ljava/lang/Object;

    .line 568
    .line 569
    check-cast v2, Landroid/view/View;

    .line 570
    .line 571
    :goto_16
    if-eqz v2, :cond_26

    .line 572
    .line 573
    invoke-static {v2, v1}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 574
    .line 575
    .line 576
    move-result v3

    .line 577
    if-eqz v3, :cond_26

    .line 578
    .line 579
    goto :goto_17

    .line 580
    :cond_26
    const/4 v2, 0x0

    .line 581
    :goto_17
    if-nez v2, :cond_2e

    .line 582
    .line 583
    if-eqz v19, :cond_27

    .line 584
    .line 585
    move-object v2, v1

    .line 586
    check-cast v2, Landroid/view/ViewGroup;

    .line 587
    .line 588
    move-object v6, v2

    .line 589
    goto :goto_18

    .line 590
    :cond_27
    const/4 v6, 0x0

    .line 591
    :goto_18
    if-nez v6, :cond_29

    .line 592
    .line 593
    :cond_28
    :goto_19
    const/4 v2, 0x0

    .line 594
    goto :goto_1a

    .line 595
    :cond_29
    invoke-virtual {v6}, Landroid/view/View;->getWidth()I

    .line 596
    .line 597
    .line 598
    move-result v2

    .line 599
    if-gtz v2, :cond_2a

    .line 600
    .line 601
    goto :goto_19

    .line 602
    :cond_2a
    new-instance v5, Lum1;

    .line 603
    .line 604
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 605
    .line 606
    .line 607
    new-instance v4, Lsm1;

    .line 608
    .line 609
    invoke-direct {v4}, Ljava/lang/Object;-><init>()V

    .line 610
    .line 611
    .line 612
    const/high16 v3, -0x80000000

    .line 613
    .line 614
    iput v3, v4, Lsm1;->ε:I

    .line 615
    .line 616
    move/from16 v3, p3

    .line 617
    .line 618
    invoke-static/range {v1 .. v6}, Lah0;->ο(Landroid/view/View;IZLsm1;Lum1;Landroid/view/View;)V

    .line 619
    .line 620
    .line 621
    iget v2, v4, Lsm1;->ε:I

    .line 622
    .line 623
    const/16 v3, 0x23

    .line 624
    .line 625
    if-lt v2, v3, :cond_28

    .line 626
    .line 627
    iget-object v2, v5, Lum1;->ε:Ljava/lang/Object;

    .line 628
    .line 629
    check-cast v2, Landroid/view/View;

    .line 630
    .line 631
    goto :goto_1a

    .line 632
    :cond_2b
    move v11, v5

    .line 633
    goto :goto_1a

    .line 634
    :cond_2c
    const/4 v11, 0x1

    .line 635
    move-object v2, v5

    .line 636
    goto :goto_1a

    .line 637
    :cond_2d
    const/4 v11, 0x1

    .line 638
    :cond_2e
    :goto_1a
    if-eqz v2, :cond_2f

    .line 639
    .line 640
    invoke-static {v2, v1}, Lah0;->Η(Landroid/view/View;Landroid/view/View;)Z

    .line 641
    .line 642
    .line 643
    move-result v3

    .line 644
    if-nez v3, :cond_30

    .line 645
    .line 646
    :cond_2f
    const/4 v13, 0x0

    .line 647
    goto/16 :goto_3c

    .line 648
    .line 649
    :cond_30
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 650
    .line 651
    invoke-direct {v3, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 652
    .line 653
    .line 654
    const v4, 0x7e340006

    .line 655
    .line 656
    .line 657
    invoke-virtual {v1, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 658
    .line 659
    .line 660
    invoke-static {v2, v12}, Lah0;->Σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    .line 661
    .line 662
    .line 663
    move-result-object v2

    .line 664
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 665
    .line 666
    .line 667
    move-result v3

    .line 668
    if-lez v3, :cond_58

    .line 669
    .line 670
    invoke-virtual {v2}, Landroid/graphics/Rect;->height()I

    .line 671
    .line 672
    .line 673
    move-result v3

    .line 674
    if-gtz v3, :cond_31

    .line 675
    .line 676
    goto/16 :goto_3b

    .line 677
    .line 678
    :cond_31
    const/4 v3, 0x4

    .line 679
    invoke-static {v1, v3}, Lah0;->μ(Landroid/view/View;I)I

    .line 680
    .line 681
    .line 682
    move-result v4

    .line 683
    invoke-virtual {v12}, Landroid/view/View;->getPaddingLeft()I

    .line 684
    .line 685
    .line 686
    move-result v5

    .line 687
    add-int/2addr v5, v4

    .line 688
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 689
    .line 690
    .line 691
    move-result v6

    .line 692
    invoke-virtual {v12}, Landroid/view/View;->getPaddingRight()I

    .line 693
    .line 694
    .line 695
    move-result v7

    .line 696
    sub-int/2addr v6, v7

    .line 697
    sub-int/2addr v6, v4

    .line 698
    const/16 v4, 0x10

    .line 699
    .line 700
    invoke-static {v1, v4}, Lah0;->μ(Landroid/view/View;I)I

    .line 701
    .line 702
    .line 703
    move-result v7

    .line 704
    sub-int v9, v6, v5

    .line 705
    .line 706
    invoke-static {v7, v9}, Ljava/lang/Math;->max(II)I

    .line 707
    .line 708
    .line 709
    move-result v7

    .line 710
    const v9, 0x7e340007

    .line 711
    .line 712
    .line 713
    invoke-static {v1, v9}, Lah0;->τ(Landroid/view/View;I)Landroid/view/View;

    .line 714
    .line 715
    .line 716
    move-result-object v10

    .line 717
    instance-of v13, v10, Landroid/widget/TextView;

    .line 718
    .line 719
    if-eqz v13, :cond_32

    .line 720
    .line 721
    check-cast v10, Landroid/widget/TextView;

    .line 722
    .line 723
    goto :goto_1b

    .line 724
    :cond_32
    const/4 v10, 0x0

    .line 725
    :goto_1b
    const-string v13, "dyhelper_im_bubble_time_label_v6"

    .line 726
    .line 727
    const v14, 0x7e340001

    .line 728
    .line 729
    .line 730
    const/4 v15, 0x2

    .line 731
    if-eqz v10, :cond_34

    .line 732
    .line 733
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 734
    .line 735
    .line 736
    move-result-object v11

    .line 737
    if-ne v11, v12, :cond_33

    .line 738
    .line 739
    invoke-virtual {v10, v14}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    move-result-object v11

    .line 743
    invoke-static {v11, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 744
    .line 745
    .line 746
    move-result v11

    .line 747
    if-eqz v11, :cond_33

    .line 748
    .line 749
    goto :goto_1c

    .line 750
    :cond_33
    const/4 v10, 0x0

    .line 751
    :goto_1c
    if-eqz v10, :cond_34

    .line 752
    .line 753
    goto :goto_1f

    .line 754
    :cond_34
    invoke-virtual {v12}, Landroid/view/ViewGroup;->getChildCount()I

    .line 755
    .line 756
    .line 757
    move-result v10

    .line 758
    const/4 v11, 0x0

    .line 759
    :goto_1d
    if-ge v11, v10, :cond_36

    .line 760
    .line 761
    invoke-virtual {v12, v11}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 762
    .line 763
    .line 764
    move-result-object v4

    .line 765
    instance-of v9, v4, Landroid/widget/TextView;

    .line 766
    .line 767
    if-eqz v9, :cond_35

    .line 768
    .line 769
    check-cast v4, Landroid/widget/TextView;

    .line 770
    .line 771
    invoke-virtual {v4, v14}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 772
    .line 773
    .line 774
    move-result-object v9

    .line 775
    invoke-static {v9, v13}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 776
    .line 777
    .line 778
    move-result v9

    .line 779
    if-eqz v9, :cond_35

    .line 780
    .line 781
    move-object v10, v4

    .line 782
    goto :goto_1e

    .line 783
    :cond_35
    add-int/lit8 v11, v11, 0x1

    .line 784
    .line 785
    const/16 v4, 0x10

    .line 786
    .line 787
    const v9, 0x7e340007

    .line 788
    .line 789
    .line 790
    goto :goto_1d

    .line 791
    :cond_36
    const/4 v10, 0x0

    .line 792
    :goto_1e
    if-nez v10, :cond_37

    .line 793
    .line 794
    new-instance v10, Landroid/widget/TextView;

    .line 795
    .line 796
    invoke-virtual {v12}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 797
    .line 798
    .line 799
    move-result-object v4

    .line 800
    invoke-direct {v10, v4}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 801
    .line 802
    .line 803
    invoke-static {}, Landroid/view/View;->generateViewId()I

    .line 804
    .line 805
    .line 806
    move-result v4

    .line 807
    invoke-virtual {v10, v4}, Landroid/view/View;->setId(I)V

    .line 808
    .line 809
    .line 810
    invoke-virtual {v10, v14, v13}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 811
    .line 812
    .line 813
    const/high16 v4, 0x41280000    # 10.5f

    .line 814
    .line 815
    invoke-virtual {v10, v4}, Landroid/widget/TextView;->setTextSize(F)V

    .line 816
    .line 817
    .line 818
    const/4 v13, 0x0

    .line 819
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 820
    .line 821
    .line 822
    invoke-virtual {v10, v13}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 823
    .line 824
    .line 825
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 826
    .line 827
    .line 828
    sget-object v3, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 829
    .line 830
    invoke-virtual {v10, v3}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 831
    .line 832
    .line 833
    invoke-virtual {v10, v13}, Landroid/view/View;->setClickable(Z)V

    .line 834
    .line 835
    .line 836
    invoke-virtual {v10, v13}, Landroid/view/View;->setLongClickable(Z)V

    .line 837
    .line 838
    .line 839
    invoke-virtual {v10, v13}, Landroid/view/View;->setFocusable(Z)V

    .line 840
    .line 841
    .line 842
    invoke-virtual {v10, v13}, Landroid/view/View;->setSaveEnabled(Z)V

    .line 843
    .line 844
    .line 845
    invoke-virtual {v10, v13, v13, v13, v13}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 846
    .line 847
    .line 848
    invoke-virtual {v10, v13}, Landroid/view/View;->setBackgroundColor(I)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v10, v15}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 852
    .line 853
    .line 854
    :cond_37
    :goto_1f
    new-instance v3, Ljava/lang/ref/WeakReference;

    .line 855
    .line 856
    invoke-direct {v3, v10}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 857
    .line 858
    .line 859
    const v4, 0x7e340007

    .line 860
    .line 861
    .line 862
    invoke-virtual {v1, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 863
    .line 864
    .line 865
    invoke-virtual {v10}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 866
    .line 867
    .line 868
    move-result-object v3

    .line 869
    if-eqz v3, :cond_38

    .line 870
    .line 871
    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 872
    .line 873
    .line 874
    move-result-object v3

    .line 875
    goto :goto_20

    .line 876
    :cond_38
    const/4 v3, 0x0

    .line 877
    :goto_20
    invoke-static {v3, v0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 878
    .line 879
    .line 880
    move-result v3

    .line 881
    if-nez v3, :cond_39

    .line 882
    .line 883
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 884
    .line 885
    .line 886
    :cond_39
    const v3, 0x7e340004

    .line 887
    .line 888
    .line 889
    invoke-virtual {v10, v3, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 890
    .line 891
    .line 892
    invoke-virtual {v10}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 893
    .line 894
    .line 895
    move-result-object v0

    .line 896
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 897
    .line 898
    .line 899
    invoke-static {v0}, Ljx0;->Η(Landroid/content/Context;)Z

    .line 900
    .line 901
    .line 902
    move-result v0

    .line 903
    sget-object v4, Lah0;->ν:Ldk0;

    .line 904
    .line 905
    if-eqz v0, :cond_3a

    .line 906
    .line 907
    iget-object v4, v4, Ldk0;->ζ:Ljava/lang/String;

    .line 908
    .line 909
    goto :goto_21

    .line 910
    :cond_3a
    iget-object v4, v4, Ldk0;->ε:Ljava/lang/String;

    .line 911
    .line 912
    :goto_21
    if-eqz v0, :cond_3b

    .line 913
    .line 914
    const/4 v0, -0x1

    .line 915
    :goto_22
    move v9, v0

    .line 916
    goto :goto_23

    .line 917
    :cond_3b
    const/high16 v0, -0x1000000

    .line 918
    .line 919
    goto :goto_22

    .line 920
    :goto_23
    :try_start_0
    invoke-static {v4}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 921
    .line 922
    .line 923
    move-result v0

    .line 924
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 925
    .line 926
    .line 927
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 928
    goto :goto_24

    .line 929
    :catchall_0
    move-exception v0

    .line 930
    new-instance v4, Leo1;

    .line 931
    .line 932
    invoke-direct {v4, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 933
    .line 934
    .line 935
    move-object v0, v4

    .line 936
    :goto_24
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 937
    .line 938
    .line 939
    move-result-object v4

    .line 940
    instance-of v9, v0, Leo1;

    .line 941
    .line 942
    if-eqz v9, :cond_3c

    .line 943
    .line 944
    move-object v0, v4

    .line 945
    :cond_3c
    check-cast v0, Ljava/lang/Number;

    .line 946
    .line 947
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 948
    .line 949
    .line 950
    move-result v0

    .line 951
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setTextColor(I)V

    .line 952
    .line 953
    .line 954
    if-eqz p3, :cond_3d

    .line 955
    .line 956
    const v0, 0x800005

    .line 957
    .line 958
    .line 959
    goto :goto_25

    .line 960
    :cond_3d
    const v0, 0x800003

    .line 961
    .line 962
    .line 963
    :goto_25
    invoke-virtual {v10, v0}, Landroid/widget/TextView;->setGravity(I)V

    .line 964
    .line 965
    .line 966
    invoke-virtual {v10, v7}, Landroid/widget/TextView;->setMaxWidth(I)V

    .line 967
    .line 968
    .line 969
    const/4 v13, 0x0

    .line 970
    invoke-virtual {v10, v13}, Landroid/view/View;->setVisibility(I)V

    .line 971
    .line 972
    .line 973
    const/4 v0, 0x0

    .line 974
    invoke-virtual {v10, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 975
    .line 976
    .line 977
    invoke-virtual {v10, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v10}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 981
    .line 982
    .line 983
    move-result-object v0

    .line 984
    const/16 v4, 0x33

    .line 985
    .line 986
    const/4 v9, -0x2

    .line 987
    if-eq v0, v12, :cond_3e

    .line 988
    .line 989
    invoke-static {v10}, Lah0;->Χ(Landroid/view/View;)V

    .line 990
    .line 991
    .line 992
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 993
    .line 994
    invoke-direct {v0, v9, v9}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 995
    .line 996
    .line 997
    iput v4, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 998
    .line 999
    invoke-virtual {v12, v10, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1000
    .line 1001
    .line 1002
    const/4 v0, 0x1

    .line 1003
    :goto_26
    const/high16 v11, -0x80000000

    .line 1004
    .line 1005
    goto :goto_27

    .line 1006
    :cond_3e
    const/4 v0, 0x0

    .line 1007
    goto :goto_26

    .line 1008
    :goto_27
    invoke-static {v7, v11}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1009
    .line 1010
    .line 1011
    move-result v11

    .line 1012
    const/4 v13, 0x0

    .line 1013
    invoke-static {v13, v13}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    .line 1014
    .line 1015
    .line 1016
    move-result v14

    .line 1017
    invoke-virtual {v10, v11, v14}, Landroid/view/View;->measure(II)V

    .line 1018
    .line 1019
    .line 1020
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredWidth()I

    .line 1021
    .line 1022
    .line 1023
    move-result v11

    .line 1024
    const/16 v13, 0x10

    .line 1025
    .line 1026
    invoke-static {v1, v13}, Lah0;->μ(Landroid/view/View;I)I

    .line 1027
    .line 1028
    .line 1029
    move-result v13

    .line 1030
    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    .line 1031
    .line 1032
    .line 1033
    move-result v11

    .line 1034
    if-le v11, v7, :cond_3f

    .line 1035
    .line 1036
    goto :goto_28

    .line 1037
    :cond_3f
    move v7, v11

    .line 1038
    :goto_28
    invoke-virtual {v10}, Landroid/view/View;->getMeasuredHeight()I

    .line 1039
    .line 1040
    .line 1041
    move-result v11

    .line 1042
    const/16 v13, 0xc

    .line 1043
    .line 1044
    invoke-static {v1, v13}, Lah0;->μ(Landroid/view/View;I)I

    .line 1045
    .line 1046
    .line 1047
    move-result v13

    .line 1048
    invoke-static {v11, v13}, Ljava/lang/Math;->max(II)I

    .line 1049
    .line 1050
    .line 1051
    move-result v11

    .line 1052
    const/4 v13, 0x3

    .line 1053
    invoke-static {v1, v13}, Lah0;->μ(Landroid/view/View;I)I

    .line 1054
    .line 1055
    .line 1056
    move-result v13

    .line 1057
    if-eqz p3, :cond_40

    .line 1058
    .line 1059
    iget v14, v2, Landroid/graphics/Rect;->right:I

    .line 1060
    .line 1061
    sub-int/2addr v14, v7

    .line 1062
    goto :goto_29

    .line 1063
    :cond_40
    iget v14, v2, Landroid/graphics/Rect;->left:I

    .line 1064
    .line 1065
    :goto_29
    sub-int/2addr v6, v7

    .line 1066
    invoke-static {v5, v6}, Ljava/lang/Math;->max(II)I

    .line 1067
    .line 1068
    .line 1069
    move-result v6

    .line 1070
    invoke-static {v14, v5, v6}, Lj81;->μ(III)I

    .line 1071
    .line 1072
    .line 1073
    move-result v5

    .line 1074
    invoke-virtual {v12}, Landroid/view/View;->getPaddingLeft()I

    .line 1075
    .line 1076
    .line 1077
    move-result v6

    .line 1078
    sub-int/2addr v5, v6

    .line 1079
    new-instance v6, Llk0;

    .line 1080
    .line 1081
    iget v7, v2, Landroid/graphics/Rect;->left:I

    .line 1082
    .line 1083
    iget v14, v2, Landroid/graphics/Rect;->top:I

    .line 1084
    .line 1085
    iget v3, v2, Landroid/graphics/Rect;->right:I

    .line 1086
    .line 1087
    iget v2, v2, Landroid/graphics/Rect;->bottom:I

    .line 1088
    .line 1089
    invoke-direct {v6, v7, v14, v3, v2}, Llk0;-><init>(IIII)V

    .line 1090
    .line 1091
    .line 1092
    new-instance v3, Ljava/util/ArrayList;

    .line 1093
    .line 1094
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 1095
    .line 1096
    .line 1097
    invoke-static {v12, v12, v10, v3}, Lah0;->θ(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/TextView;Ljava/util/ArrayList;)V

    .line 1098
    .line 1099
    .line 1100
    sget-object v7, Lnk0;->α:Lnk0;

    .line 1101
    .line 1102
    invoke-virtual {v12}, Landroid/view/View;->getWidth()I

    .line 1103
    .line 1104
    .line 1105
    move-result v14

    .line 1106
    invoke-static {v12, v15}, Lah0;->μ(Landroid/view/View;I)I

    .line 1107
    .line 1108
    .line 1109
    move-result v15

    .line 1110
    const/16 v4, 0x118

    .line 1111
    .line 1112
    invoke-static {v12, v4}, Lah0;->μ(Landroid/view/View;I)I

    .line 1113
    .line 1114
    .line 1115
    move-result v4

    .line 1116
    const/16 v9, 0x30

    .line 1117
    .line 1118
    invoke-static {v12, v9}, Lah0;->μ(Landroid/view/View;I)I

    .line 1119
    .line 1120
    .line 1121
    move-result v16

    .line 1122
    move/from16 v18, v0

    .line 1123
    .line 1124
    const/16 v0, 0x18

    .line 1125
    .line 1126
    invoke-static {v12, v0}, Lah0;->μ(Landroid/view/View;I)I

    .line 1127
    .line 1128
    .line 1129
    move-result v22

    .line 1130
    invoke-static {v12, v9}, Lah0;->μ(Landroid/view/View;I)I

    .line 1131
    .line 1132
    .line 1133
    move-result v23

    .line 1134
    const/16 v0, 0x12

    .line 1135
    .line 1136
    invoke-static {v12, v0}, Lah0;->μ(Landroid/view/View;I)I

    .line 1137
    .line 1138
    .line 1139
    move-result v24

    .line 1140
    const/16 v0, 0xf0

    .line 1141
    .line 1142
    invoke-static {v12, v0}, Lah0;->μ(Landroid/view/View;I)I

    .line 1143
    .line 1144
    .line 1145
    move-result v25

    .line 1146
    if-gez v13, :cond_41

    .line 1147
    .line 1148
    const/4 v13, 0x0

    .line 1149
    :cond_41
    if-gtz v14, :cond_42

    .line 1150
    .line 1151
    add-int/2addr v2, v13

    .line 1152
    const/4 v7, 0x1

    .line 1153
    goto/16 :goto_31

    .line 1154
    .line 1155
    :cond_42
    if-gez v15, :cond_43

    .line 1156
    .line 1157
    const/16 v21, 0x0

    .line 1158
    .line 1159
    goto :goto_2a

    .line 1160
    :cond_43
    move/from16 v21, v15

    .line 1161
    .line 1162
    :goto_2a
    new-instance v0, Lf7;

    .line 1163
    .line 1164
    const/4 v9, 0x1

    .line 1165
    invoke-direct {v0, v9, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1166
    .line 1167
    .line 1168
    new-instance v19, Ljk0;

    .line 1169
    .line 1170
    move-object/from16 v20, v6

    .line 1171
    .line 1172
    invoke-direct/range {v19 .. v25}, Ljk0;-><init>(Llk0;IIIII)V

    .line 1173
    .line 1174
    .line 1175
    move/from16 v27, v4

    .line 1176
    .line 1177
    move-object/from16 v9, v19

    .line 1178
    .line 1179
    move/from16 v15, v21

    .line 1180
    .line 1181
    new-instance v4, Ly30;

    .line 1182
    .line 1183
    move-object/from16 v28, v6

    .line 1184
    .line 1185
    const/4 v6, 0x1

    .line 1186
    invoke-direct {v4, v0, v6, v9}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1187
    .line 1188
    .line 1189
    new-instance v0, Lx30;

    .line 1190
    .line 1191
    invoke-direct {v0, v4}, Lx30;-><init>(Ly30;)V

    .line 1192
    .line 1193
    .line 1194
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 1195
    .line 1196
    .line 1197
    move-result v4

    .line 1198
    if-nez v4, :cond_44

    .line 1199
    .line 1200
    const/4 v4, 0x0

    .line 1201
    goto :goto_2c

    .line 1202
    :cond_44
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 1203
    .line 1204
    .line 1205
    move-result-object v4

    .line 1206
    check-cast v4, Lmk0;

    .line 1207
    .line 1208
    iget-object v4, v4, Lmk0;->α:Llk0;

    .line 1209
    .line 1210
    iget v4, v4, Llk0;->δ:I

    .line 1211
    .line 1212
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1213
    .line 1214
    .line 1215
    move-result-object v4

    .line 1216
    :cond_45
    :goto_2b
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 1217
    .line 1218
    .line 1219
    move-result v6

    .line 1220
    if-eqz v6, :cond_46

    .line 1221
    .line 1222
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 1223
    .line 1224
    .line 1225
    move-result-object v6

    .line 1226
    check-cast v6, Lmk0;

    .line 1227
    .line 1228
    iget-object v6, v6, Lmk0;->α:Llk0;

    .line 1229
    .line 1230
    iget v6, v6, Llk0;->δ:I

    .line 1231
    .line 1232
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1233
    .line 1234
    .line 1235
    move-result-object v6

    .line 1236
    invoke-virtual {v4, v6}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 1237
    .line 1238
    .line 1239
    move-result v9

    .line 1240
    if-gez v9, :cond_45

    .line 1241
    .line 1242
    move-object v4, v6

    .line 1243
    goto :goto_2b

    .line 1244
    :cond_46
    :goto_2c
    if-eqz p3, :cond_49

    .line 1245
    .line 1246
    new-instance v0, Lf7;

    .line 1247
    .line 1248
    const/4 v6, 0x1

    .line 1249
    invoke-direct {v0, v6, v3}, Lf7;-><init>(ILjava/lang/Object;)V

    .line 1250
    .line 1251
    .line 1252
    new-instance v19, Lng;

    .line 1253
    .line 1254
    const/16 v25, 0x0

    .line 1255
    .line 1256
    const/16 v26, 0x18

    .line 1257
    .line 1258
    const/16 v20, 0x1

    .line 1259
    .line 1260
    const-class v22, Lnk0;

    .line 1261
    .line 1262
    const-string v23, "hasReadStatusSemantics"

    .line 1263
    .line 1264
    const-string v24, "hasReadStatusSemantics(Lcom/example/dyhelper/hook/IM/IMTimeLabelLayoutPolicy$HostViewSnapshot;)Z"

    .line 1265
    .line 1266
    move-object/from16 v21, v7

    .line 1267
    .line 1268
    invoke-direct/range {v19 .. v26}, Lng;-><init>(ILjava/lang/Object;Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;II)V

    .line 1269
    .line 1270
    .line 1271
    move-object/from16 v3, v19

    .line 1272
    .line 1273
    new-instance v6, Ly30;

    .line 1274
    .line 1275
    const/4 v7, 0x1

    .line 1276
    invoke-direct {v6, v0, v7, v3}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1277
    .line 1278
    .line 1279
    new-instance v19, Lkk0;

    .line 1280
    .line 1281
    move/from16 v21, v14

    .line 1282
    .line 1283
    move/from16 v22, v15

    .line 1284
    .line 1285
    move/from16 v24, v16

    .line 1286
    .line 1287
    move/from16 v23, v27

    .line 1288
    .line 1289
    move-object/from16 v20, v28

    .line 1290
    .line 1291
    invoke-direct/range {v19 .. v24}, Lkk0;-><init>(Llk0;IIII)V

    .line 1292
    .line 1293
    .line 1294
    move-object/from16 v0, v19

    .line 1295
    .line 1296
    new-instance v3, Ly30;

    .line 1297
    .line 1298
    invoke-direct {v3, v6, v7, v0}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 1299
    .line 1300
    .line 1301
    new-instance v0, Lx30;

    .line 1302
    .line 1303
    invoke-direct {v0, v3}, Lx30;-><init>(Ly30;)V

    .line 1304
    .line 1305
    .line 1306
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 1307
    .line 1308
    .line 1309
    move-result v3

    .line 1310
    if-nez v3, :cond_47

    .line 1311
    .line 1312
    goto :goto_2e

    .line 1313
    :cond_47
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v3

    .line 1317
    check-cast v3, Lmk0;

    .line 1318
    .line 1319
    iget-object v3, v3, Lmk0;->α:Llk0;

    .line 1320
    .line 1321
    iget v3, v3, Llk0;->δ:I

    .line 1322
    .line 1323
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1324
    .line 1325
    .line 1326
    move-result-object v3

    .line 1327
    :cond_48
    :goto_2d
    invoke-virtual {v0}, Lx30;->hasNext()Z

    .line 1328
    .line 1329
    .line 1330
    move-result v6

    .line 1331
    if-eqz v6, :cond_4a

    .line 1332
    .line 1333
    invoke-virtual {v0}, Lx30;->next()Ljava/lang/Object;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v6

    .line 1337
    check-cast v6, Lmk0;

    .line 1338
    .line 1339
    iget-object v6, v6, Lmk0;->α:Llk0;

    .line 1340
    .line 1341
    iget v6, v6, Llk0;->δ:I

    .line 1342
    .line 1343
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1344
    .line 1345
    .line 1346
    move-result-object v6

    .line 1347
    invoke-virtual {v3, v6}, Ljava/lang/Integer;->compareTo(Ljava/lang/Object;)I

    .line 1348
    .line 1349
    .line 1350
    move-result v9

    .line 1351
    if-gez v9, :cond_48

    .line 1352
    .line 1353
    move-object v3, v6

    .line 1354
    goto :goto_2d

    .line 1355
    :cond_49
    const/4 v7, 0x1

    .line 1356
    :goto_2e
    const/4 v3, 0x0

    .line 1357
    :cond_4a
    if-eqz v4, :cond_4b

    .line 1358
    .line 1359
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1360
    .line 1361
    .line 1362
    move-result v0

    .line 1363
    goto :goto_2f

    .line 1364
    :cond_4b
    move v0, v2

    .line 1365
    :goto_2f
    if-eqz v3, :cond_4c

    .line 1366
    .line 1367
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 1368
    .line 1369
    .line 1370
    move-result v3

    .line 1371
    goto :goto_30

    .line 1372
    :cond_4c
    move v3, v2

    .line 1373
    :goto_30
    invoke-static {v0, v3}, Ljava/lang/Math;->max(II)I

    .line 1374
    .line 1375
    .line 1376
    move-result v0

    .line 1377
    invoke-static {v2, v0}, Ljava/lang/Math;->max(II)I

    .line 1378
    .line 1379
    .line 1380
    move-result v0

    .line 1381
    add-int v2, v0, v13

    .line 1382
    .line 1383
    :goto_31
    invoke-virtual {v12}, Landroid/view/View;->getPaddingTop()I

    .line 1384
    .line 1385
    .line 1386
    move-result v0

    .line 1387
    invoke-static {v0, v2}, Ljava/lang/Math;->max(II)I

    .line 1388
    .line 1389
    .line 1390
    move-result v0

    .line 1391
    invoke-virtual {v12}, Landroid/view/View;->getPaddingTop()I

    .line 1392
    .line 1393
    .line 1394
    move-result v2

    .line 1395
    sub-int v2, v0, v2

    .line 1396
    .line 1397
    const v3, 0x7e340005

    .line 1398
    .line 1399
    .line 1400
    invoke-virtual {v12, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v4

    .line 1404
    instance-of v6, v4, Ljava/lang/Integer;

    .line 1405
    .line 1406
    if-eqz v6, :cond_4d

    .line 1407
    .line 1408
    check-cast v4, Ljava/lang/Integer;

    .line 1409
    .line 1410
    goto :goto_32

    .line 1411
    :cond_4d
    const/4 v4, 0x0

    .line 1412
    :goto_32
    if-eqz v4, :cond_4e

    .line 1413
    .line 1414
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 1415
    .line 1416
    .line 1417
    move-result v3

    .line 1418
    goto :goto_33

    .line 1419
    :cond_4e
    invoke-virtual {v12}, Landroid/view/View;->getMinimumHeight()I

    .line 1420
    .line 1421
    .line 1422
    move-result v4

    .line 1423
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1424
    .line 1425
    .line 1426
    move-result-object v6

    .line 1427
    invoke-virtual {v12, v3, v6}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1428
    .line 1429
    .line 1430
    move v3, v4

    .line 1431
    :goto_33
    add-int/2addr v0, v11

    .line 1432
    invoke-virtual {v12}, Landroid/view/View;->getPaddingBottom()I

    .line 1433
    .line 1434
    .line 1435
    move-result v4

    .line 1436
    add-int/2addr v4, v0

    .line 1437
    const/4 v0, 0x5

    .line 1438
    invoke-static {v1, v0}, Lah0;->μ(Landroid/view/View;I)I

    .line 1439
    .line 1440
    .line 1441
    move-result v0

    .line 1442
    add-int/2addr v0, v4

    .line 1443
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 1444
    .line 1445
    .line 1446
    move-result v0

    .line 1447
    invoke-virtual {v12}, Landroid/view/View;->getMinimumHeight()I

    .line 1448
    .line 1449
    .line 1450
    move-result v3

    .line 1451
    if-eq v3, v0, :cond_4f

    .line 1452
    .line 1453
    invoke-virtual {v12, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 1454
    .line 1455
    .line 1456
    move v4, v7

    .line 1457
    goto :goto_34

    .line 1458
    :cond_4f
    const/4 v4, 0x0

    .line 1459
    :goto_34
    invoke-virtual {v10}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1460
    .line 1461
    .line 1462
    move-result-object v0

    .line 1463
    instance-of v3, v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 1464
    .line 1465
    if-eqz v3, :cond_50

    .line 1466
    .line 1467
    check-cast v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 1468
    .line 1469
    goto :goto_35

    .line 1470
    :cond_50
    const/4 v0, 0x0

    .line 1471
    :goto_35
    if-nez v0, :cond_51

    .line 1472
    .line 1473
    new-instance v0, Landroid/widget/FrameLayout$LayoutParams;

    .line 1474
    .line 1475
    const/4 v3, -0x2

    .line 1476
    invoke-direct {v0, v3, v3}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1477
    .line 1478
    .line 1479
    :cond_51
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1480
    .line 1481
    const/16 v6, 0x33

    .line 1482
    .line 1483
    if-ne v3, v6, :cond_53

    .line 1484
    .line 1485
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1486
    .line 1487
    if-ne v3, v5, :cond_53

    .line 1488
    .line 1489
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1490
    .line 1491
    if-ne v3, v2, :cond_53

    .line 1492
    .line 1493
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 1494
    .line 1495
    if-nez v3, :cond_53

    .line 1496
    .line 1497
    iget v3, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 1498
    .line 1499
    if-eqz v3, :cond_52

    .line 1500
    .line 1501
    goto :goto_36

    .line 1502
    :cond_52
    const/4 v7, 0x0

    .line 1503
    :cond_53
    :goto_36
    if-eqz v7, :cond_54

    .line 1504
    .line 1505
    const/16 v6, 0x33

    .line 1506
    .line 1507
    iput v6, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1508
    .line 1509
    iput v5, v0, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1510
    .line 1511
    iput v2, v0, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1512
    .line 1513
    const/4 v13, 0x0

    .line 1514
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 1515
    .line 1516
    iput v13, v0, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 1517
    .line 1518
    invoke-virtual {v10, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 1519
    .line 1520
    .line 1521
    :cond_54
    if-nez v18, :cond_56

    .line 1522
    .line 1523
    if-nez v7, :cond_56

    .line 1524
    .line 1525
    if-eqz v4, :cond_55

    .line 1526
    .line 1527
    goto :goto_38

    .line 1528
    :cond_55
    :goto_37
    const v2, 0x7e340004

    .line 1529
    .line 1530
    .line 1531
    goto :goto_3a

    .line 1532
    :cond_56
    :goto_38
    invoke-virtual {v12}, Landroid/view/View;->requestLayout()V

    .line 1533
    .line 1534
    .line 1535
    move-object v0, v1

    .line 1536
    check-cast v0, Landroid/widget/FrameLayout;

    .line 1537
    .line 1538
    invoke-virtual {v0}, Landroid/view/View;->requestLayout()V

    .line 1539
    .line 1540
    .line 1541
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v0

    .line 1545
    instance-of v2, v0, Landroid/view/View;

    .line 1546
    .line 1547
    if-eqz v2, :cond_57

    .line 1548
    .line 1549
    move-object v11, v0

    .line 1550
    check-cast v11, Landroid/view/View;

    .line 1551
    .line 1552
    goto :goto_39

    .line 1553
    :cond_57
    const/4 v11, 0x0

    .line 1554
    :goto_39
    if-eqz v11, :cond_55

    .line 1555
    .line 1556
    invoke-virtual {v11}, Landroid/view/View;->requestLayout()V

    .line 1557
    .line 1558
    .line 1559
    goto :goto_37

    .line 1560
    :goto_3a
    invoke-virtual {v1, v2, v8}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 1561
    .line 1562
    .line 1563
    sget-object v0, Lyg0;->ε:Lyg0;

    .line 1564
    .line 1565
    return-object v0

    .line 1566
    :cond_58
    :goto_3b
    return-object v9

    .line 1567
    :goto_3c
    invoke-static {v1, v13}, Lah0;->Υ(Landroid/view/View;Z)V

    .line 1568
    .line 1569
    .line 1570
    move-object v0, v1

    .line 1571
    check-cast v0, Landroid/widget/FrameLayout;

    .line 1572
    .line 1573
    invoke-virtual {v0}, Landroid/view/View;->isLayoutRequested()Z

    .line 1574
    .line 1575
    .line 1576
    move-result v0

    .line 1577
    if-eqz v0, :cond_59

    .line 1578
    .line 1579
    return-object v9

    .line 1580
    :cond_59
    return-object v10
.end method

.method public static Ε(Ljava/lang/Class;)Z
    .locals 16

    .line 1
    sget-object v1, Lah0;->ι:Ljava/lang/Object;

    .line 2
    .line 3
    monitor-enter v1

    .line 4
    :try_start_0
    invoke-static {}, Lah0;->Θ()Z

    .line 5
    .line 6
    .line 7
    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const/4 v2, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    monitor-exit v1

    .line 12
    return v2

    .line 13
    :cond_0
    :try_start_1
    sget-object v0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 16
    .line 17
    .line 18
    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 19
    const/4 v3, 0x1

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    monitor-exit v1

    .line 23
    return v3

    .line 24
    :cond_1
    :try_start_2
    new-instance v4, Ljava/util/ArrayList;

    .line 25
    .line 26
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    new-instance v5, Ljava/util/ArrayList;

    .line 37
    .line 38
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 39
    .line 40
    .line 41
    array-length v6, v0

    .line 42
    move v7, v2

    .line 43
    :goto_0
    if-ge v7, v6, :cond_3

    .line 44
    .line 45
    aget-object v8, v0, v7

    .line 46
    .line 47
    invoke-static {v8}, Lah0;->Ζ(Ljava/lang/reflect/Method;)Z

    .line 48
    .line 49
    .line 50
    move-result v9

    .line 51
    if-eqz v9, :cond_2

    .line 52
    .line 53
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v0

    .line 58
    goto/16 :goto_d

    .line 59
    .line 60
    :cond_2
    :goto_1
    add-int/lit8 v7, v7, 0x1

    .line 61
    .line 62
    goto :goto_0

    .line 63
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 64
    .line 65
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v5}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    :cond_4
    :goto_2
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 73
    .line 74
    .line 75
    move-result v7

    .line 76
    if-eqz v7, :cond_6

    .line 77
    .line 78
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 79
    .line 80
    .line 81
    move-result-object v7

    .line 82
    move-object v8, v7

    .line 83
    check-cast v8, Ljava/lang/reflect/Method;

    .line 84
    .line 85
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->isBridge()Z

    .line 86
    .line 87
    .line 88
    move-result v9

    .line 89
    if-nez v9, :cond_4

    .line 90
    .line 91
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->isSynthetic()Z

    .line 92
    .line 93
    .line 94
    move-result v8

    .line 95
    if-eqz v8, :cond_5

    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_5
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :cond_6
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_7

    .line 107
    .line 108
    goto :goto_3

    .line 109
    :cond_7
    move-object v5, v0

    .line 110
    :goto_3
    new-instance v0, Ljava/util/ArrayList;

    .line 111
    .line 112
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 113
    .line 114
    .line 115
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 116
    .line 117
    .line 118
    move-result-object v6

    .line 119
    :cond_8
    :goto_4
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 120
    .line 121
    .line 122
    move-result v7

    .line 123
    if-eqz v7, :cond_9

    .line 124
    .line 125
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    move-object v8, v7

    .line 130
    check-cast v8, Ljava/lang/reflect/Method;

    .line 131
    .line 132
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v8

    .line 136
    const-string v9, "onBindViewHolder"

    .line 137
    .line 138
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v8

    .line 142
    if-eqz v8, :cond_8

    .line 143
    .line 144
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 149
    .line 150
    .line 151
    move-result v6

    .line 152
    if-eqz v6, :cond_a

    .line 153
    .line 154
    goto :goto_5

    .line 155
    :cond_a
    move-object v5, v0

    .line 156
    :goto_5
    new-instance v0, Ljava/util/HashSet;

    .line 157
    .line 158
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 159
    .line 160
    .line 161
    new-instance v6, Ljava/util/ArrayList;

    .line 162
    .line 163
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 164
    .line 165
    .line 166
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 167
    .line 168
    .line 169
    move-result-object v5

    .line 170
    :cond_b
    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 171
    .line 172
    .line 173
    move-result v7

    .line 174
    if-eqz v7, :cond_c

    .line 175
    .line 176
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v7

    .line 180
    move-object v8, v7

    .line 181
    check-cast v8, Ljava/lang/reflect/Method;

    .line 182
    .line 183
    new-instance v9, Ljava/lang/StringBuilder;

    .line 184
    .line 185
    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v10

    .line 192
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    const/16 v10, 0x28

    .line 196
    .line 197
    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 198
    .line 199
    .line 200
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 201
    .line 202
    .line 203
    move-result-object v10

    .line 204
    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    const-string v11, ","

    .line 208
    .line 209
    new-instance v12, Lzb0;

    .line 210
    .line 211
    const/16 v13, 0x19

    .line 212
    .line 213
    invoke-direct {v12, v13}, Lzb0;-><init>(I)V

    .line 214
    .line 215
    .line 216
    const/16 v13, 0x1e

    .line 217
    .line 218
    const/4 v14, 0x0

    .line 219
    invoke-static {v10, v11, v14, v12, v13}, Lg7;->з([Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;La80;I)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v10

    .line 223
    const-string v11, "):"

    .line 224
    .line 225
    invoke-static {v9, v10, v11, v8}, Llz1;->ρ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v8

    .line 229
    invoke-virtual {v0, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    if-eqz v8, :cond_b

    .line 234
    .line 235
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 236
    .line 237
    .line 238
    goto :goto_6

    .line 239
    :cond_c
    invoke-static {v6}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 240
    .line 241
    .line 242
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 243
    :try_start_3
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 244
    .line 245
    .line 246
    move-result-object v5

    .line 247
    invoke-static {v5}, Lh62;->л([Ljava/lang/Object;)Lτ;

    .line 248
    .line 249
    .line 250
    move-result-object v5

    .line 251
    move v6, v2

    .line 252
    move v7, v6

    .line 253
    move v8, v7

    .line 254
    move v9, v8

    .line 255
    move v10, v9

    .line 256
    :cond_d
    :goto_7
    invoke-virtual {v5}, Lτ;->hasNext()Z

    .line 257
    .line 258
    .line 259
    move-result v11

    .line 260
    if-eqz v11, :cond_12

    .line 261
    .line 262
    invoke-virtual {v5}, Lτ;->next()Ljava/lang/Object;

    .line 263
    .line 264
    .line 265
    move-result-object v11

    .line 266
    check-cast v11, Ljava/lang/reflect/Method;

    .line 267
    .line 268
    invoke-interface {v0, v11}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v12

    .line 272
    if-eqz v12, :cond_e

    .line 273
    .line 274
    invoke-virtual {v11, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 275
    .line 276
    .line 277
    sget-object v12, Lxq0;->α:Lxq0;

    .line 278
    .line 279
    new-instance v13, Lxe;

    .line 280
    .line 281
    const/4 v14, 0x6

    .line 282
    const/4 v15, 0x0

    .line 283
    invoke-direct {v13, v11, v14, v15}, Lxe;-><init>(Ljava/lang/reflect/Method;IZ)V

    .line 284
    .line 285
    .line 286
    invoke-virtual {v12, v11, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 287
    .line 288
    .line 289
    move-result-object v12

    .line 290
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 291
    .line 292
    .line 293
    add-int/lit8 v6, v6, 0x1

    .line 294
    .line 295
    goto :goto_8

    .line 296
    :catchall_1
    move-exception v0

    .line 297
    goto/16 :goto_a

    .line 298
    .line 299
    :cond_e
    :goto_8
    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 300
    .line 301
    .line 302
    const-string v12, "onAttachedToRecyclerView"

    .line 303
    .line 304
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 305
    .line 306
    .line 307
    move-result-object v13

    .line 308
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v14

    .line 312
    invoke-static {v14, v12}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 313
    .line 314
    .line 315
    move-result v12

    .line 316
    if-eqz v12, :cond_f

    .line 317
    .line 318
    invoke-virtual {v11}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 319
    .line 320
    .line 321
    move-result-object v12

    .line 322
    sget-object v14, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 323
    .line 324
    invoke-static {v12, v14}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 325
    .line 326
    .line 327
    move-result v12

    .line 328
    if-eqz v12, :cond_f

    .line 329
    .line 330
    array-length v12, v13

    .line 331
    if-ne v12, v3, :cond_f

    .line 332
    .line 333
    aget-object v12, v13, v2

    .line 334
    .line 335
    const-string v13, "androidx.recyclerview.widget.RecyclerView"

    .line 336
    .line 337
    invoke-static {v12, v13}, Lah0;->Γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 338
    .line 339
    .line 340
    move-result v12

    .line 341
    if-eqz v12, :cond_f

    .line 342
    .line 343
    invoke-virtual {v11, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 344
    .line 345
    .line 346
    sget-object v12, Lxq0;->α:Lxq0;

    .line 347
    .line 348
    new-instance v13, Lf10;

    .line 349
    .line 350
    const/16 v14, 0x15

    .line 351
    .line 352
    invoke-direct {v13, v14}, Lf10;-><init>(I)V

    .line 353
    .line 354
    .line 355
    invoke-virtual {v12, v11, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 356
    .line 357
    .line 358
    move-result-object v12

    .line 359
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 360
    .line 361
    .line 362
    add-int/lit8 v7, v7, 0x1

    .line 363
    .line 364
    :cond_f
    const-string v12, "onViewAttachedToWindow"

    .line 365
    .line 366
    invoke-static {v12, v11}, Lah0;->Μ(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    .line 367
    .line 368
    .line 369
    move-result v12

    .line 370
    if-eqz v12, :cond_10

    .line 371
    .line 372
    invoke-virtual {v11, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 373
    .line 374
    .line 375
    sget-object v12, Lxq0;->α:Lxq0;

    .line 376
    .line 377
    new-instance v13, Lf10;

    .line 378
    .line 379
    const/16 v14, 0x16

    .line 380
    .line 381
    invoke-direct {v13, v14}, Lf10;-><init>(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v12, v11, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 385
    .line 386
    .line 387
    move-result-object v12

    .line 388
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 389
    .line 390
    .line 391
    add-int/lit8 v8, v8, 0x1

    .line 392
    .line 393
    :cond_10
    const-string v12, "onViewRecycled"

    .line 394
    .line 395
    invoke-static {v12, v11}, Lah0;->Μ(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    .line 396
    .line 397
    .line 398
    move-result v12

    .line 399
    if-eqz v12, :cond_11

    .line 400
    .line 401
    invoke-virtual {v11, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 402
    .line 403
    .line 404
    sget-object v12, Lxq0;->α:Lxq0;

    .line 405
    .line 406
    new-instance v13, Lf10;

    .line 407
    .line 408
    const/16 v14, 0x17

    .line 409
    .line 410
    invoke-direct {v13, v14}, Lf10;-><init>(I)V

    .line 411
    .line 412
    .line 413
    invoke-virtual {v12, v11, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 414
    .line 415
    .line 416
    move-result-object v12

    .line 417
    invoke-virtual {v4, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 418
    .line 419
    .line 420
    add-int/lit8 v9, v9, 0x1

    .line 421
    .line 422
    :cond_11
    const-string v12, "onViewDetachedFromWindow"

    .line 423
    .line 424
    invoke-static {v12, v11}, Lah0;->Μ(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    .line 425
    .line 426
    .line 427
    move-result v12

    .line 428
    if-eqz v12, :cond_d

    .line 429
    .line 430
    invoke-virtual {v11, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 431
    .line 432
    .line 433
    sget-object v12, Lxq0;->α:Lxq0;

    .line 434
    .line 435
    new-instance v13, Lf10;

    .line 436
    .line 437
    const/16 v14, 0x18

    .line 438
    .line 439
    invoke-direct {v13, v14}, Lf10;-><init>(I)V

    .line 440
    .line 441
    .line 442
    invoke-virtual {v12, v11, v13}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 443
    .line 444
    .line 445
    move-result-object v11

    .line 446
    invoke-virtual {v4, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 447
    .line 448
    .line 449
    add-int/lit8 v10, v10, 0x1

    .line 450
    .line 451
    goto/16 :goto_7

    .line 452
    .line 453
    :cond_12
    if-lez v6, :cond_14

    .line 454
    .line 455
    sput-object p0, Lah0;->ο:Ljava/lang/Class;

    .line 456
    .line 457
    sget-object v0, Lah0;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 458
    .line 459
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 460
    .line 461
    .line 462
    sget-object v0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 463
    .line 464
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 465
    .line 466
    .line 467
    sget-object v0, Lah0;->λ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 468
    .line 469
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 470
    .line 471
    .line 472
    move-result-object v0

    .line 473
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 474
    .line 475
    .line 476
    move-result-object v0

    .line 477
    :catchall_2
    :goto_9
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 478
    .line 479
    .line 480
    move-result v5

    .line 481
    if-eqz v5, :cond_13

    .line 482
    .line 483
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 484
    .line 485
    .line 486
    move-result-object v5

    .line 487
    check-cast v5, Ll01;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 488
    .line 489
    :try_start_4
    invoke-virtual {v5}, Ll01;->α()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 490
    .line 491
    .line 492
    goto :goto_9

    .line 493
    :cond_13
    :try_start_5
    sget-object v0, Lah0;->λ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 494
    .line 495
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 496
    .line 497
    .line 498
    sget-object v0, Lah0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 499
    .line 500
    invoke-virtual {v0, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 501
    .line 502
    .line 503
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 504
    .line 505
    .line 506
    move-result-object v0

    .line 507
    new-instance v5, Ljava/lang/StringBuilder;

    .line 508
    .line 509
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 510
    .line 511
    .line 512
    const-string v11, "Adapter Hook installed: "

    .line 513
    .line 514
    invoke-virtual {v5, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 515
    .line 516
    .line 517
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 518
    .line 519
    .line 520
    const-string v0, ", bind="

    .line 521
    .line 522
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 523
    .line 524
    .line 525
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 526
    .line 527
    .line 528
    const-string v0, ", recyclerAttach="

    .line 529
    .line 530
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 531
    .line 532
    .line 533
    invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 534
    .line 535
    .line 536
    const-string v0, ", holderAttach="

    .line 537
    .line 538
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 539
    .line 540
    .line 541
    invoke-virtual {v5, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 542
    .line 543
    .line 544
    const-string v0, ", detach="

    .line 545
    .line 546
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 547
    .line 548
    .line 549
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 550
    .line 551
    .line 552
    const-string v0, ", recycle="

    .line 553
    .line 554
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 555
    .line 556
    .line 557
    invoke-virtual {v5, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 558
    .line 559
    .line 560
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 561
    .line 562
    .line 563
    move-result-object v0

    .line 564
    const-string v5, "r746360516c14870"

    .line 565
    .line 566
    const/4 v6, 0x0

    .line 567
    const/4 v7, 0x4

    .line 568
    invoke-static {v5, v0, v6, v7, v6}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 569
    .line 570
    .line 571
    move v2, v3

    .line 572
    goto :goto_c

    .line 573
    :cond_14
    const-string v0, "\u6ca1\u6709\u53ef\u5b89\u5168 Hook \u7684\u6d88\u606f\u7ed1\u5b9a\u65b9\u6cd5"

    .line 574
    .line 575
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 576
    .line 577
    invoke-direct {v3, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 578
    .line 579
    .line 580
    throw v3
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 581
    :goto_a
    :try_start_6
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    :catchall_3
    :goto_b
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v4

    .line 589
    if-eqz v4, :cond_15

    .line 590
    .line 591
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v4

    .line 595
    check-cast v4, Ll01;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 596
    .line 597
    :try_start_7
    invoke-virtual {v4}, Ll01;->α()V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    .line 598
    .line 599
    .line 600
    goto :goto_b

    .line 601
    :cond_15
    :try_start_8
    sget-object v3, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 602
    .line 603
    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 604
    .line 605
    .line 606
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 607
    .line 608
    .line 609
    move-result-object v3

    .line 610
    new-instance v4, Ljava/lang/StringBuilder;

    .line 611
    .line 612
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 613
    .line 614
    .line 615
    const-string v5, "install-adapter:"

    .line 616
    .line 617
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 618
    .line 619
    .line 620
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 621
    .line 622
    .line 623
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 624
    .line 625
    .line 626
    move-result-object v3

    .line 627
    invoke-static {v3, v0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 628
    .line 629
    .line 630
    :goto_c
    monitor-exit v1

    .line 631
    return v2

    .line 632
    :goto_d
    monitor-exit v1

    .line 633
    throw v0
.end method

.method public static Ζ(Ljava/lang/reflect/Method;)Z
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v1, v0

    .line 6
    const/4 v2, 0x3

    .line 7
    const/4 v3, 0x0

    .line 8
    if-ne v1, v2, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 15
    .line 16
    invoke-static {p0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    if-eqz p0, :cond_0

    .line 21
    .line 22
    aget-object p0, v0, v3

    .line 23
    .line 24
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    const-string v1, "androidx.recyclerview.widget.RecyclerView$ViewHolder"

    .line 28
    .line 29
    invoke-static {p0, v1}, Lah0;->Γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const/4 p0, 0x1

    .line 36
    aget-object v1, v0, p0

    .line 37
    .line 38
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 39
    .line 40
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_0

    .line 45
    .line 46
    const/4 v1, 0x2

    .line 47
    aget-object v0, v0, v1

    .line 48
    .line 49
    const-class v1, Ljava/util/List;

    .line 50
    .line 51
    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 52
    .line 53
    .line 54
    move-result v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    .line 57
    return p0

    .line 58
    :cond_0
    return v3
.end method

.method public static Η(Landroid/view/View;Landroid/view/View;)Z
    .locals 1

    .line 1
    :goto_0
    instance-of v0, p0, Landroid/view/View;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    if-ne p0, p1, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    check-cast p0, Landroid/view/View;

    .line 10
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    goto :goto_0

    .line 16
    :cond_1
    const/4 p0, 0x0

    .line 17
    return p0
.end method

.method public static Θ()Z
    .locals 2

    .line 1
    sget-object v0, Lah0;->ν:Ldk0;

    .line 2
    .line 3
    iget-boolean v1, v0, Ldk0;->α:Z

    .line 4
    .line 5
    if-nez v1, :cond_1

    .line 6
    .line 7
    iget-boolean v0, v0, Ldk0;->β:Z

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return v0

    .line 14
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 15
    return v0
.end method

.method public static Ι(Landroid/view/View;Landroid/view/View;)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_2

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getVisibility()I

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-lez v1, :cond_e

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-gtz v1, :cond_2

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_2
    invoke-static {p0, p1}, Lah0;->Η(Landroid/view/View;Landroid/view/View;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    goto/16 :goto_2

    .line 35
    .line 36
    :cond_3
    const v1, 0x7e340001

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const-string v2, "dyhelper_im_bubble_time_label_v6"

    .line 44
    .line 45
    invoke-static {v1, v2}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v1

    .line 49
    if-eqz v1, :cond_4

    .line 50
    .line 51
    goto/16 :goto_2

    .line 52
    .line 53
    :cond_4
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 54
    .line 55
    const/4 v2, 0x0

    .line 56
    if-eqz v1, :cond_5

    .line 57
    .line 58
    move-object v1, p1

    .line 59
    check-cast v1, Landroid/view/ViewGroup;

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_5
    move-object v1, v2

    .line 63
    :goto_0
    if-nez v1, :cond_6

    .line 64
    .line 65
    goto/16 :goto_2

    .line 66
    .line 67
    :cond_6
    invoke-static {p0, v1}, Lah0;->Σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    move-object v3, p1

    .line 72
    check-cast v3, Landroid/view/ViewGroup;

    .line 73
    .line 74
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 75
    .line 76
    .line 77
    move-result v4

    .line 78
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v5

    .line 82
    if-lez v4, :cond_7

    .line 83
    .line 84
    move-object v2, v5

    .line 85
    :cond_7
    if-eqz v2, :cond_8

    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 88
    .line 89
    .line 90
    move-result v2

    .line 91
    goto :goto_1

    .line 92
    :cond_8
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 93
    .line 94
    .line 95
    move-result-object v2

    .line 96
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    iget v2, v2, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 101
    .line 102
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v3

    .line 106
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    invoke-static {p0}, Lah0;->Ξ(Landroid/view/View;)Z

    .line 111
    .line 112
    .line 113
    move-result v4

    .line 114
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 115
    .line 116
    .line 117
    move-result v5

    .line 118
    int-to-float v5, v5

    .line 119
    int-to-float v6, v2

    .line 120
    const v7, 0x3f5c28f6    # 0.86f

    .line 121
    .line 122
    .line 123
    mul-float/2addr v7, v6

    .line 124
    cmpl-float v5, v5, v7

    .line 125
    .line 126
    if-ltz v5, :cond_9

    .line 127
    .line 128
    iget v5, v1, Landroid/graphics/Rect;->left:I

    .line 129
    .line 130
    const/16 v7, 0x8

    .line 131
    .line 132
    invoke-static {p1, v7}, Lah0;->μ(Landroid/view/View;I)I

    .line 133
    .line 134
    .line 135
    move-result v8

    .line 136
    if-gt v5, v8, :cond_9

    .line 137
    .line 138
    iget v5, v1, Landroid/graphics/Rect;->right:I

    .line 139
    .line 140
    invoke-static {p1, v7}, Lah0;->μ(Landroid/view/View;I)I

    .line 141
    .line 142
    .line 143
    move-result v7

    .line 144
    sub-int/2addr v2, v7

    .line 145
    if-lt v5, v2, :cond_9

    .line 146
    .line 147
    if-nez v4, :cond_9

    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_9
    if-nez v4, :cond_a

    .line 151
    .line 152
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 153
    .line 154
    .line 155
    move-result v2

    .line 156
    int-to-float v2, v2

    .line 157
    const v5, 0x3f3851ec    # 0.72f

    .line 158
    .line 159
    .line 160
    mul-float/2addr v5, v6

    .line 161
    cmpl-float v2, v2, v5

    .line 162
    .line 163
    if-ltz v2, :cond_a

    .line 164
    .line 165
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 166
    .line 167
    .line 168
    move-result v2

    .line 169
    const/16 v5, 0x8c

    .line 170
    .line 171
    invoke-static {p1, v5}, Lah0;->μ(Landroid/view/View;I)I

    .line 172
    .line 173
    .line 174
    move-result v5

    .line 175
    if-gt v2, v5, :cond_a

    .line 176
    .line 177
    new-instance v2, Lqm1;

    .line 178
    .line 179
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 180
    .line 181
    .line 182
    invoke-static {v2, p0}, Lah0;->ι(Lqm1;Landroid/view/View;)V

    .line 183
    .line 184
    .line 185
    iget-boolean p0, v2, Lqm1;->ε:Z

    .line 186
    .line 187
    if-eqz p0, :cond_a

    .line 188
    .line 189
    goto :goto_2

    .line 190
    :cond_a
    if-nez v4, :cond_b

    .line 191
    .line 192
    const-string p0, "LinearLayout"

    .line 193
    .line 194
    invoke-static {v3, p0, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 195
    .line 196
    .line 197
    move-result p0

    .line 198
    if-eqz p0, :cond_b

    .line 199
    .line 200
    invoke-virtual {v1}, Landroid/graphics/Rect;->width()I

    .line 201
    .line 202
    .line 203
    move-result p0

    .line 204
    int-to-float p0, p0

    .line 205
    const v2, 0x3f59999a    # 0.85f

    .line 206
    .line 207
    .line 208
    mul-float/2addr v6, v2

    .line 209
    cmpl-float p0, p0, v6

    .line 210
    .line 211
    if-ltz p0, :cond_b

    .line 212
    .line 213
    invoke-virtual {v1}, Landroid/graphics/Rect;->height()I

    .line 214
    .line 215
    .line 216
    move-result p0

    .line 217
    const/16 v1, 0x96

    .line 218
    .line 219
    invoke-static {p1, v1}, Lah0;->μ(Landroid/view/View;I)I

    .line 220
    .line 221
    .line 222
    move-result p1

    .line 223
    if-gt p0, p1, :cond_b

    .line 224
    .line 225
    goto :goto_2

    .line 226
    :cond_b
    const-string p0, "MsgTime"

    .line 227
    .line 228
    const/4 p1, 0x1

    .line 229
    invoke-static {v3, p0, p1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 230
    .line 231
    .line 232
    move-result p0

    .line 233
    if-eqz p0, :cond_c

    .line 234
    .line 235
    goto :goto_2

    .line 236
    :cond_c
    const-string p0, "Avatar"

    .line 237
    .line 238
    invoke-static {v3, p0, p1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    if-eqz p0, :cond_d

    .line 243
    .line 244
    goto :goto_2

    .line 245
    :cond_d
    return p1

    .line 246
    :cond_e
    :goto_2
    return v0
.end method

.method public static Κ(Ljava/lang/Class;)Z
    .locals 11

    .line 1
    sget-object v0, Lah0;->σ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/Boolean;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0

    .line 16
    :cond_0
    const-string v1, "androidx.recyclerview.widget.RecyclerView$Adapter"

    .line 17
    .line 18
    invoke-static {p0, v1}, Lah0;->Γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_6

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    array-length v3, v1

    .line 35
    move v4, v2

    .line 36
    :goto_0
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 37
    .line 38
    const/4 v6, 0x1

    .line 39
    if-ge v4, v3, :cond_3

    .line 40
    .line 41
    aget-object v7, v1, v4

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    const-string v9, "getItemCount"

    .line 48
    .line 49
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    move-result v8

    .line 53
    if-eqz v8, :cond_2

    .line 54
    .line 55
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v8

    .line 59
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    array-length v8, v8

    .line 63
    if-nez v8, :cond_2

    .line 64
    .line 65
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v7

    .line 69
    invoke-static {v7, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_2

    .line 74
    .line 75
    move v1, v6

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    add-int/lit8 v4, v4, 0x1

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_3
    move v1, v2

    .line 81
    :goto_1
    invoke-virtual {p0}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    array-length v4, v3

    .line 89
    move v7, v2

    .line 90
    :goto_2
    if-ge v7, v4, :cond_5

    .line 91
    .line 92
    aget-object v8, v3, v7

    .line 93
    .line 94
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    move-result-object v9

    .line 98
    const-string v10, "getItemId"

    .line 99
    .line 100
    invoke-static {v9, v10}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    move-result v9

    .line 104
    if-eqz v9, :cond_4

    .line 105
    .line 106
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v9

    .line 110
    array-length v9, v9

    .line 111
    if-ne v9, v6, :cond_4

    .line 112
    .line 113
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object v9

    .line 117
    aget-object v9, v9, v2

    .line 118
    .line 119
    invoke-static {v9, v5}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v9

    .line 123
    if-eqz v9, :cond_4

    .line 124
    .line 125
    invoke-virtual {v8}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    move-result-object v8

    .line 129
    sget-object v9, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 130
    .line 131
    invoke-static {v8, v9}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 132
    .line 133
    .line 134
    move-result v8

    .line 135
    if-eqz v8, :cond_4

    .line 136
    .line 137
    move v3, v6

    .line 138
    goto :goto_3

    .line 139
    :cond_4
    add-int/lit8 v7, v7, 0x1

    .line 140
    .line 141
    goto :goto_2

    .line 142
    :cond_5
    move v3, v2

    .line 143
    :goto_3
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 144
    .line 145
    .line 146
    move-result-object v4

    .line 147
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 148
    .line 149
    .line 150
    array-length v5, v4

    .line 151
    move v7, v2

    .line 152
    :goto_4
    if-ge v7, v5, :cond_7

    .line 153
    .line 154
    aget-object v8, v4, v7

    .line 155
    .line 156
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    invoke-static {v8}, Lah0;->Ζ(Ljava/lang/reflect/Method;)Z

    .line 160
    .line 161
    .line 162
    move-result v8

    .line 163
    if-eqz v8, :cond_6

    .line 164
    .line 165
    move v4, v6

    .line 166
    goto :goto_5

    .line 167
    :cond_6
    add-int/lit8 v7, v7, 0x1

    .line 168
    .line 169
    goto :goto_4

    .line 170
    :cond_7
    move v4, v2

    .line 171
    :goto_5
    if-eqz v1, :cond_8

    .line 172
    .line 173
    if-eqz v3, :cond_8

    .line 174
    .line 175
    if-eqz v4, :cond_8

    .line 176
    .line 177
    move v2, v6

    .line 178
    :cond_8
    :goto_6
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    .line 184
    .line 185
    return v2
.end method

.method public static Λ(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    const-string v1, "~7918AA8396C85B92707DC4C904CF4F6B873956D476D564A4B4FA8249966EA0F63C4AD8"

    .line 13
    .line 14
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {}, Lah0;->χ()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {v0, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-eqz p0, :cond_2

    .line 36
    .line 37
    :goto_0
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_2
    :goto_1
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public static Μ(Ljava/lang/String;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 p1, 0x0

    .line 14
    if-eqz p0, :cond_0

    .line 15
    .line 16
    array-length p0, v0

    .line 17
    const/4 v1, 0x1

    .line 18
    if-ne p0, v1, :cond_0

    .line 19
    .line 20
    aget-object p0, v0, p1

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    const-string v0, "androidx.recyclerview.widget.RecyclerView$ViewHolder"

    .line 26
    .line 27
    invoke-static {p0, v0}, Lah0;->Γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_0

    .line 32
    .line 33
    return v1

    .line 34
    :cond_0
    return p1
.end method

.method public static Ν(Landroid/view/View;)Z
    .locals 2

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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, "~78B71E7541C477E838C50BCD302E054C40CC02248AA0B9F3FD7794A78143886D1800F82A71492D2EFEBF5BE098D7821C75D8FEAB38C82D347D777F70134900FEEF4F336A7F57B449"

    .line 18
    .line 19
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const-string v1, "IMMsgTextView"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    const-string p0, ".IMMsgTextView"

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {v0, p0, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return v1

    .line 48
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 49
    return p0
.end method

.method public static Ξ(Landroid/view/View;)Z
    .locals 2

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
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const-string v1, "~78B38367CFE852F14F689594842A0085750A11DB0443EB2AFF2A05B4BCE68BA61BACA110BE0D1C57860A136E9C6E4F91C347AE77685953205A3C2E9B1C751CDCD4EAF2B23394531E7E"

    .line 18
    .line 19
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-nez v1, :cond_1

    .line 28
    .line 29
    const-string v1, "FixWidthFrameLayout"

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_1

    .line 36
    .line 37
    const-string p0, ".FixWidthFrameLayout"

    .line 38
    .line 39
    const/4 v1, 0x0

    .line 40
    invoke-static {v0, p0, v1}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-eqz p0, :cond_0

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    return v1

    .line 48
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 49
    return p0
.end method

.method public static Ο(Landroid/view/ViewGroup;Ljava/lang/Object;)Z
    .locals 5

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
    const/4 v1, 0x0

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move-object v2, v1

    .line 22
    :goto_0
    const-string v3, ""

    .line 23
    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    move-object v2, v3

    .line 27
    :cond_1
    const-string v4, "getLayoutManager"

    .line 28
    .line 29
    invoke-static {p0, v4}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    if-eqz p0, :cond_2

    .line 34
    .line 35
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    :cond_2
    if-nez v1, :cond_3

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    move-object v3, v1

    .line 47
    :goto_1
    sget-object p0, Lah0;->ο:Ljava/lang/Class;

    .line 48
    .line 49
    const/4 v1, 0x1

    .line 50
    if-eqz p0, :cond_4

    .line 51
    .line 52
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-ne p0, v1, :cond_4

    .line 57
    .line 58
    goto :goto_2

    .line 59
    :cond_4
    const-string p0, ".im."

    .line 60
    .line 61
    invoke-static {v2, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    const/4 v4, 0x0

    .line 66
    if-eqz p1, :cond_5

    .line 67
    .line 68
    const-string p1, "CellComposeAdapter"

    .line 69
    .line 70
    invoke-static {v2, p1, v4}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 71
    .line 72
    .line 73
    move-result p1

    .line 74
    if-eqz p1, :cond_5

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_5
    invoke-static {v2, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 78
    .line 79
    .line 80
    move-result p1

    .line 81
    if-eqz p1, :cond_6

    .line 82
    .line 83
    const-string p1, "msgcell"

    .line 84
    .line 85
    invoke-static {v2, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 86
    .line 87
    .line 88
    move-result p1

    .line 89
    if-eqz p1, :cond_6

    .line 90
    .line 91
    const-string p1, "Adapter"

    .line 92
    .line 93
    invoke-static {v2, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-eqz p1, :cond_6

    .line 98
    .line 99
    goto :goto_2

    .line 100
    :cond_6
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 101
    .line 102
    .line 103
    move-result p1

    .line 104
    if-eqz p1, :cond_7

    .line 105
    .line 106
    const-string p1, "ChatRecyclerView"

    .line 107
    .line 108
    invoke-static {v0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_7

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_7
    invoke-static {v0, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 116
    .line 117
    .line 118
    move-result p1

    .line 119
    if-eqz p1, :cond_8

    .line 120
    .line 121
    const-string p1, "CustomRecyclerView"

    .line 122
    .line 123
    invoke-static {v0, p1, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    if-eqz p1, :cond_8

    .line 128
    .line 129
    goto :goto_2

    .line 130
    :cond_8
    invoke-static {v3, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 131
    .line 132
    .line 133
    move-result p0

    .line 134
    if-eqz p0, :cond_a

    .line 135
    .line 136
    const-string p0, "ChatLinearLayoutManager"

    .line 137
    .line 138
    invoke-static {v3, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 139
    .line 140
    .line 141
    move-result p0

    .line 142
    if-nez p0, :cond_9

    .line 143
    .line 144
    const-string p0, "ChatLinearLayoutTrackManager"

    .line 145
    .line 146
    invoke-static {v3, p0, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 147
    .line 148
    .line 149
    move-result p0

    .line 150
    if-eqz p0, :cond_a

    .line 151
    .line 152
    :cond_9
    :goto_2
    return v1

    .line 153
    :cond_a
    return v4
.end method

.method public static Π(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/String;)V
    .locals 4

    .line 1
    invoke-static {}, Lah0;->Θ()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    invoke-static {p0, p1}, Lah0;->Ο(Landroid/view/ViewGroup;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto/16 :goto_1

    .line 16
    .line 17
    :cond_1
    invoke-static {p0}, Lah0;->Τ(Landroid/view/ViewGroup;)V

    .line 18
    .line 19
    .line 20
    sget-object v0, Lah0;->ο:Ljava/lang/Class;

    .line 21
    .line 22
    const/4 v1, 0x0

    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    sget-object v0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    const-string p1, "/resolved"

    .line 34
    .line 35
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p0, p1, v1}, Lah0;->б(Landroid/view/ViewGroup;Ljava/lang/String;Z)V

    .line 40
    .line 41
    .line 42
    return-void

    .line 43
    :cond_2
    if-eqz p1, :cond_3

    .line 44
    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    const/4 v0, 0x0

    .line 51
    :goto_0
    const/4 v2, 0x1

    .line 52
    if-eqz v0, :cond_4

    .line 53
    .line 54
    invoke-static {v0}, Lah0;->Κ(Ljava/lang/Class;)Z

    .line 55
    .line 56
    .line 57
    move-result v3

    .line 58
    if-eqz v3, :cond_4

    .line 59
    .line 60
    invoke-static {v0}, Lah0;->Ε(Ljava/lang/Class;)Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_4

    .line 65
    .line 66
    const-string p1, "/runtime"

    .line 67
    .line 68
    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    invoke-static {p0, p1, v2}, Lah0;->б(Landroid/view/ViewGroup;Ljava/lang/String;Z)V

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_4
    if-nez p1, :cond_5

    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 79
    .line 80
    .line 81
    move-result p0

    .line 82
    if-gtz p0, :cond_5

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    invoke-static {}, Lah0;->Θ()Z

    .line 86
    .line 87
    .line 88
    move-result p0

    .line 89
    if-eqz p0, :cond_9

    .line 90
    .line 91
    sget-object p0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 94
    .line 95
    .line 96
    move-result p0

    .line 97
    if-eqz p0, :cond_6

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_6
    sget-object p0, Lah0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 101
    .line 102
    invoke-virtual {p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-nez p1, :cond_7

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_7
    sget-object p1, Lah0;->ξ:Ljava/lang/ClassLoader;

    .line 110
    .line 111
    if-nez p1, :cond_8

    .line 112
    .line 113
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    if-nez p1, :cond_8

    .line 122
    .line 123
    invoke-virtual {p0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 124
    .line 125
    .line 126
    return-void

    .line 127
    :cond_8
    new-instance p0, Ljava/lang/Thread;

    .line 128
    .line 129
    new-instance p2, Loj;

    .line 130
    .line 131
    const/4 v0, 0x4

    .line 132
    invoke-direct {p2, p1, v0}, Loj;-><init>(Ljava/lang/ClassLoader;I)V

    .line 133
    .line 134
    .line 135
    const-string p1, "r4e7cd9169eb48b78"

    .line 136
    .line 137
    invoke-direct {p0, p2, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {p0, v2}, Ljava/lang/Thread;->setDaemon(Z)V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_1
    return-void
.end method

.method public static Ρ(Landroid/view/View;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 23

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v0, p2

    .line 4
    .line 5
    const v2, 0x7e34000a

    .line 6
    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    invoke-virtual {v1, v2, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    sget-object v2, Lah0;->ν:Ldk0;

    .line 13
    .line 14
    iget-boolean v4, v2, Ldk0;->α:Z

    .line 15
    .line 16
    if-nez v4, :cond_1

    .line 17
    .line 18
    iget-boolean v4, v2, Ldk0;->β:Z

    .line 19
    .line 20
    if-eqz v4, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-static {v1}, Lah0;->η(Landroid/view/View;)V

    .line 24
    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    :goto_0
    const-string v4, "getUuid"

    .line 28
    .line 29
    const/4 v5, 0x0

    .line 30
    :try_start_0
    new-array v6, v5, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v0, v4, v6}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    instance-of v6, v4, Ljava/lang/String;

    .line 37
    .line 38
    if-eqz v6, :cond_2

    .line 39
    .line 40
    check-cast v4, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :catchall_0
    :cond_2
    move-object v4, v3

    .line 44
    :goto_1
    const-string v6, "getMsgId"

    .line 45
    .line 46
    invoke-static {v0, v6}, Lah0;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 47
    .line 48
    .line 49
    move-result-object v6

    .line 50
    const-wide/16 v7, 0x0

    .line 51
    .line 52
    if-eqz v6, :cond_3

    .line 53
    .line 54
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 55
    .line 56
    .line 57
    move-result-wide v9

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-wide v9, v7

    .line 60
    :goto_2
    const-string v6, "getCreatedAt"

    .line 61
    .line 62
    invoke-static {v0, v6}, Lah0;->γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;

    .line 63
    .line 64
    .line 65
    move-result-object v6

    .line 66
    if-eqz v6, :cond_4

    .line 67
    .line 68
    :goto_3
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 69
    .line 70
    .line 71
    move-result-wide v11

    .line 72
    goto :goto_6

    .line 73
    :cond_4
    const-string v6, "createdAt"

    .line 74
    .line 75
    invoke-static {v0, v6}, Lah0;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v6

    .line 79
    instance-of v11, v6, Ljava/lang/Number;

    .line 80
    .line 81
    if-eqz v11, :cond_5

    .line 82
    .line 83
    check-cast v6, Ljava/lang/Number;

    .line 84
    .line 85
    goto :goto_4

    .line 86
    :cond_5
    move-object v6, v3

    .line 87
    :goto_4
    if-eqz v6, :cond_6

    .line 88
    .line 89
    invoke-virtual {v6}, Ljava/lang/Number;->longValue()J

    .line 90
    .line 91
    .line 92
    move-result-wide v11

    .line 93
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 94
    .line 95
    .line 96
    move-result-object v6

    .line 97
    goto :goto_5

    .line 98
    :cond_6
    move-object v6, v3

    .line 99
    :goto_5
    if-eqz v6, :cond_9

    .line 100
    .line 101
    goto :goto_3

    .line 102
    :goto_6
    const/16 v6, 0x3e8

    .line 103
    .line 104
    int-to-long v13, v6

    .line 105
    const-wide v15, 0x125e72e7800L

    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    div-long v17, v15, v13

    .line 111
    .line 112
    const-wide v19, 0x3bb2cc3d800L

    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    div-long v21, v19, v13

    .line 118
    .line 119
    cmp-long v6, v11, v21

    .line 120
    .line 121
    if-gtz v6, :cond_7

    .line 122
    .line 123
    cmp-long v6, v17, v11

    .line 124
    .line 125
    if-gtz v6, :cond_7

    .line 126
    .line 127
    mul-long/2addr v11, v13

    .line 128
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 129
    .line 130
    .line 131
    move-result-object v6

    .line 132
    goto :goto_7

    .line 133
    :cond_7
    cmp-long v6, v15, v11

    .line 134
    .line 135
    if-gtz v6, :cond_8

    .line 136
    .line 137
    cmp-long v6, v11, v19

    .line 138
    .line 139
    if-gtz v6, :cond_8

    .line 140
    .line 141
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 142
    .line 143
    .line 144
    move-result-object v6

    .line 145
    goto :goto_7

    .line 146
    :cond_8
    mul-long/2addr v15, v13

    .line 147
    mul-long v19, v19, v13

    .line 148
    .line 149
    cmp-long v6, v11, v19

    .line 150
    .line 151
    if-gtz v6, :cond_9

    .line 152
    .line 153
    cmp-long v6, v15, v11

    .line 154
    .line 155
    if-gtz v6, :cond_9

    .line 156
    .line 157
    div-long/2addr v11, v13

    .line 158
    invoke-static {v11, v12}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 159
    .line 160
    .line 161
    move-result-object v6

    .line 162
    goto :goto_7

    .line 163
    :cond_9
    move-object v6, v3

    .line 164
    :goto_7
    iget-boolean v11, v2, Ldk0;->β:Z

    .line 165
    .line 166
    if-eqz v11, :cond_b

    .line 167
    .line 168
    sget-object v11, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 169
    .line 170
    if-eqz v4, :cond_b

    .line 171
    .line 172
    invoke-static {v4}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 173
    .line 174
    .line 175
    move-result v11

    .line 176
    if-eqz v11, :cond_a

    .line 177
    .line 178
    goto :goto_8

    .line 179
    :cond_a
    sget-object v11, Lsg0;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 180
    .line 181
    invoke-virtual {v11, v4}, Ljava/util/concurrent/ConcurrentHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 182
    .line 183
    .line 184
    move-result v11

    .line 185
    if-eqz v11, :cond_b

    .line 186
    .line 187
    const/4 v11, 0x1

    .line 188
    goto :goto_9

    .line 189
    :cond_b
    :goto_8
    move v11, v5

    .line 190
    :goto_9
    invoke-static {v6, v11, v2}, Lx;->Ρ(Ljava/lang/Long;ZLdk0;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v2

    .line 194
    if-eqz v2, :cond_17

    .line 195
    .line 196
    invoke-static {v2}, Lq02;->ж(Ljava/lang/CharSequence;)Z

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    if-eqz v12, :cond_c

    .line 201
    .line 202
    goto/16 :goto_f

    .line 203
    .line 204
    :cond_c
    invoke-static/range {p1 .. p1}, Lah0;->ξ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v12

    .line 208
    if-eqz v12, :cond_e

    .line 209
    .line 210
    const-string v13, "isMsgSender"

    .line 211
    .line 212
    :try_start_1
    new-array v14, v5, [Ljava/lang/Object;

    .line 213
    .line 214
    invoke-static {v12, v13, v14}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v12

    .line 218
    instance-of v13, v12, Ljava/lang/Boolean;

    .line 219
    .line 220
    if-eqz v13, :cond_d

    .line 221
    .line 222
    check-cast v12, Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 223
    .line 224
    goto :goto_a

    .line 225
    :catchall_1
    :cond_d
    move-object v12, v3

    .line 226
    :goto_a
    if-eqz v12, :cond_e

    .line 227
    .line 228
    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    goto :goto_b

    .line 233
    :cond_e
    const-string v12, "isSelf"

    .line 234
    .line 235
    :try_start_2
    new-array v13, v5, [Ljava/lang/Object;

    .line 236
    .line 237
    invoke-static {v0, v12, v13}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 238
    .line 239
    .line 240
    move-result-object v0

    .line 241
    instance-of v12, v0, Ljava/lang/Boolean;

    .line 242
    .line 243
    if-eqz v12, :cond_f

    .line 244
    .line 245
    check-cast v0, Ljava/lang/Boolean;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 246
    .line 247
    move-object v3, v0

    .line 248
    :catchall_2
    :cond_f
    if-eqz v3, :cond_10

    .line 249
    .line 250
    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    goto :goto_b

    .line 255
    :cond_10
    move v0, v5

    .line 256
    :goto_b
    new-instance v3, Ljava/lang/StringBuilder;

    .line 257
    .line 258
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 259
    .line 260
    .line 261
    if-nez v4, :cond_11

    .line 262
    .line 263
    const-string v4, "no_uuid"

    .line 264
    .line 265
    :cond_11
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 266
    .line 267
    .line 268
    const/16 v4, 0x7c

    .line 269
    .line 270
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 271
    .line 272
    .line 273
    invoke-virtual {v3, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 274
    .line 275
    .line 276
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 277
    .line 278
    .line 279
    if-eqz v6, :cond_12

    .line 280
    .line 281
    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    .line 282
    .line 283
    .line 284
    move-result-wide v7

    .line 285
    :cond_12
    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    if-eqz v0, :cond_13

    .line 292
    .line 293
    const/16 v6, 0x4f

    .line 294
    .line 295
    goto :goto_c

    .line 296
    :cond_13
    const/16 v6, 0x49

    .line 297
    .line 298
    :goto_c
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 299
    .line 300
    .line 301
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 302
    .line 303
    .line 304
    if-eqz v11, :cond_14

    .line 305
    .line 306
    const/16 v6, 0x52

    .line 307
    .line 308
    goto :goto_d

    .line 309
    :cond_14
    const/16 v6, 0x2d

    .line 310
    .line 311
    :goto_d
    invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 315
    .line 316
    .line 317
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 321
    .line 322
    .line 323
    move-result-object v3

    .line 324
    const v4, 0x7e340002

    .line 325
    .line 326
    .line 327
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 328
    .line 329
    .line 330
    move-result-object v6

    .line 331
    invoke-static {v6, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 332
    .line 333
    .line 334
    move-result v6

    .line 335
    if-nez v6, :cond_15

    .line 336
    .line 337
    invoke-static {v1, v5, v5}, Lah0;->ζ(Landroid/view/View;ZZ)V

    .line 338
    .line 339
    .line 340
    :cond_15
    invoke-virtual {v1, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 341
    .line 342
    .line 343
    const v4, 0x7e340003

    .line 344
    .line 345
    .line 346
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 347
    .line 348
    .line 349
    move-result-object v5

    .line 350
    invoke-static {v5, v3}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 351
    .line 352
    .line 353
    move-result v5

    .line 354
    if-eqz v5, :cond_16

    .line 355
    .line 356
    goto :goto_e

    .line 357
    :cond_16
    invoke-virtual {v1, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 358
    .line 359
    .line 360
    move v5, v0

    .line 361
    new-instance v0, Lug0;

    .line 362
    .line 363
    const/4 v7, 0x1

    .line 364
    move-object v4, v2

    .line 365
    move-object v2, v3

    .line 366
    move v6, v11

    .line 367
    move-object/from16 v3, p1

    .line 368
    .line 369
    invoke-direct/range {v0 .. v7}, Lug0;-><init>(Landroid/view/View;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZZI)V

    .line 370
    .line 371
    .line 372
    invoke-virtual {v1, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 373
    .line 374
    .line 375
    :goto_e
    return-void

    .line 376
    :cond_17
    :goto_f
    invoke-static {v1}, Lah0;->η(Landroid/view/View;)V

    .line 377
    .line 378
    .line 379
    return-void
.end method

.method public static Σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;
    .locals 3

    .line 1
    const/4 v0, 0x2

    .line 2
    new-array v1, v0, [I

    .line 3
    .line 4
    new-array v0, v0, [I

    .line 5
    .line 6
    invoke-virtual {p0, v1}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/view/View;->getLocationOnScreen([I)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    aget v2, v1, p1

    .line 14
    .line 15
    aget p1, v0, p1

    .line 16
    .line 17
    sub-int/2addr v2, p1

    .line 18
    const/4 p1, 0x1

    .line 19
    aget v1, v1, p1

    .line 20
    .line 21
    aget p1, v0, p1

    .line 22
    .line 23
    sub-int/2addr v1, p1

    .line 24
    new-instance p1, Landroid/graphics/Rect;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    add-int/2addr v0, v2

    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    add-int/2addr p0, v1

    .line 36
    invoke-direct {p1, v2, v1, v0, p0}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 37
    .line 38
    .line 39
    return-object p1
.end method

.method public static Τ(Landroid/view/ViewGroup;)V
    .locals 6

    .line 1
    sget-object v0, Lah0;->ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    move v3, v2

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-eqz v4, :cond_2

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v5

    .line 28
    check-cast v5, Landroid/view/ViewGroup;

    .line 29
    .line 30
    if-ne v5, p0, :cond_0

    .line 31
    .line 32
    goto :goto_2

    .line 33
    :cond_0
    if-nez v5, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0, v4}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 43
    .line 44
    invoke-direct {v1, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :goto_1
    const/4 p0, 0x4

    .line 51
    if-lt v3, p0, :cond_3

    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    if-nez p0, :cond_3

    .line 58
    .line 59
    :try_start_0
    invoke-virtual {v0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->remove(I)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    check-cast p0, Ljava/lang/ref/WeakReference;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    :catchall_0
    add-int/lit8 v3, v3, -0x1

    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_3
    :goto_2
    return-void
.end method

.method public static Υ(Landroid/view/View;Z)V
    .locals 7

    .line 1
    const v0, 0x7e340007

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    instance-of v2, v1, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    const/4 v3, 0x0

    .line 11
    if-eqz v2, :cond_0

    .line 12
    .line 13
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v1, v3

    .line 17
    :goto_0
    if-eqz v1, :cond_1

    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    goto :goto_1

    .line 24
    :cond_1
    move-object v1, v3

    .line 25
    :goto_1
    instance-of v2, v1, Landroid/view/View;

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    check-cast v1, Landroid/view/View;

    .line 30
    .line 31
    goto :goto_2

    .line 32
    :cond_2
    move-object v1, v3

    .line 33
    :goto_2
    invoke-virtual {p0, v0, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    sget-object v0, Lah0;->α:Landroid/os/Handler;

    .line 37
    .line 38
    const/16 v2, 0x8

    .line 39
    .line 40
    const v4, 0x7e340001

    .line 41
    .line 42
    .line 43
    if-eqz v1, :cond_4

    .line 44
    .line 45
    invoke-virtual {v1, v4}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v5

    .line 49
    const-string v6, "dyhelper_im_bubble_time_label_v6"

    .line 50
    .line 51
    invoke-static {v5, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v5

    .line 55
    if-eqz v5, :cond_4

    .line 56
    .line 57
    if-eqz p1, :cond_3

    .line 58
    .line 59
    invoke-virtual {v1, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 63
    .line 64
    .line 65
    new-instance p0, Ljb;

    .line 66
    .line 67
    const/16 p1, 0x16

    .line 68
    .line 69
    invoke-direct {p0, v1, p1}, Ljb;-><init>(Landroid/view/View;I)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 73
    .line 74
    .line 75
    return-void

    .line 76
    :cond_3
    invoke-static {v1}, Lah0;->Χ(Landroid/view/View;)V

    .line 77
    .line 78
    .line 79
    return-void

    .line 80
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 81
    .line 82
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 83
    .line 84
    .line 85
    invoke-static {v1, p0}, Lah0;->Φ(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v1

    .line 99
    if-eqz v1, :cond_6

    .line 100
    .line 101
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 106
    .line 107
    .line 108
    check-cast v1, Landroid/view/View;

    .line 109
    .line 110
    if-eqz p1, :cond_5

    .line 111
    .line 112
    invoke-virtual {v1, v4, v3}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 116
    .line 117
    .line 118
    new-instance v5, Ljb;

    .line 119
    .line 120
    const/16 v6, 0x16

    .line 121
    .line 122
    invoke-direct {v5, v1, v6}, Ljb;-><init>(Landroid/view/View;I)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v0, v5}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 126
    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_5
    invoke-static {v1}, Lah0;->Χ(Landroid/view/View;)V

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    return-void
.end method

.method public static final Φ(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    const v0, 0x7e340001

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "dyhelper_im_bubble_time_label_v6"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 20
    .line 21
    if-eqz v0, :cond_3

    .line 22
    .line 23
    new-instance v0, Ljava/util/ArrayList;

    .line 24
    .line 25
    check-cast p1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    const/4 v2, 0x0

    .line 39
    :goto_0
    if-ge v2, v1, :cond_2

    .line 40
    .line 41
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    if-eqz v3, :cond_1

    .line 46
    .line 47
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    if-eqz v0, :cond_3

    .line 65
    .line 66
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 71
    .line 72
    .line 73
    check-cast v0, Landroid/view/View;

    .line 74
    .line 75
    invoke-static {p0, v0}, Lah0;->Φ(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 76
    .line 77
    .line 78
    goto :goto_1

    .line 79
    :cond_3
    return-void
.end method

.method public static Χ(Landroid/view/View;)V
    .locals 2

    .line 1
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    check-cast v0, Landroid/view/ViewGroup;

    .line 10
    .line 11
    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    sget-object p0, Ls62;->α:Ls62;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    new-instance v0, Leo1;

    .line 19
    .line 20
    invoke-direct {v0, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 21
    .line 22
    .line 23
    move-object p0, v0

    .line 24
    :goto_0
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    :cond_1
    return-void
.end method

.method public static Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    const-string v1, "|"

    .line 10
    .line 11
    invoke-static {p0, v1, v0}, Llz1;->ν(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sget-object v1, Lah0;->μ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 16
    .line 17
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string p0, " failed: "

    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    const-string v0, "r746360516c14870"

    .line 48
    .line 49
    invoke-static {v0, p0, p1}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    :cond_0
    return-void
.end method

.method public static Ω(Ljava/lang/ClassLoader;)Ljava/lang/Class;
    .locals 5

    .line 1
    sget-object v0, Lox;->α:Ljava/lang/Object;

    .line 2
    .line 3
    sget-object v0, Lkx;->ф:Lkx;

    .line 4
    .line 5
    invoke-static {v0, p0}, Lox;->π(Lkx;Ljava/lang/ClassLoader;)Ljava/util/List;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    move-object v4, v3

    .line 27
    check-cast v4, Ljava/lang/Class;

    .line 28
    .line 29
    invoke-static {v4}, Lah0;->Κ(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_0

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v3, v2

    .line 37
    :goto_0
    check-cast v3, Ljava/lang/Class;

    .line 38
    .line 39
    if-eqz v3, :cond_2

    .line 40
    .line 41
    sput-object v3, Lah0;->ο:Ljava/lang/Class;

    .line 42
    .line 43
    return-object v3

    .line 44
    :cond_2
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 45
    .line 46
    sget-object v1, Lox;->ι:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-eqz v1, :cond_5

    .line 53
    .line 54
    new-instance v1, Lt20;

    .line 55
    .line 56
    const/4 v3, 0x3

    .line 57
    invoke-direct {v1, p0, v3}, Lt20;-><init>(Ljava/lang/ClassLoader;I)V

    .line 58
    .line 59
    .line 60
    const-string v3, "\u5b9a\u4f4d\u79c1\u4fe1\u6c14\u6ce1\u65f6\u95f4\u6d88\u606f\u5217\u8868 Adapter"

    .line 61
    .line 62
    invoke-static {v0, p0, v3, v1}, Lox;->ι(Lkx;Ljava/lang/ClassLoader;Ljava/lang/String;La80;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-eqz v3, :cond_4

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v3

    .line 80
    move-object v4, v3

    .line 81
    check-cast v4, Ljava/lang/Class;

    .line 82
    .line 83
    invoke-static {v4}, Lah0;->Κ(Ljava/lang/Class;)Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-eqz v4, :cond_3

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_4
    move-object v3, v2

    .line 91
    :goto_1
    check-cast v3, Ljava/lang/Class;

    .line 92
    .line 93
    if-eqz v3, :cond_5

    .line 94
    .line 95
    sput-object v3, Lah0;->ο:Ljava/lang/Class;

    .line 96
    .line 97
    return-object v3

    .line 98
    :cond_5
    :try_start_0
    sget-object v1, Lqe0;->α:Ljava/lang/Object;

    .line 99
    .line 100
    const-string v1, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B68022FEB1363311D25B705764E55B8AABAF59A8850E3BC8893FDC62DE2C89437BCF5FF344B9B8120F3B930AC1E3CEF212579"

    .line 101
    .line 102
    invoke-static {v1}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object v1

    .line 106
    invoke-static {p0, v1}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 110
    goto :goto_2

    .line 111
    :catchall_0
    move-exception p0

    .line 112
    new-instance v1, Leo1;

    .line 113
    .line 114
    invoke-direct {v1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 115
    .line 116
    .line 117
    move-object p0, v1

    .line 118
    :goto_2
    instance-of v1, p0, Leo1;

    .line 119
    .line 120
    if-eqz v1, :cond_6

    .line 121
    .line 122
    move-object p0, v2

    .line 123
    :cond_6
    check-cast p0, Ljava/lang/Class;

    .line 124
    .line 125
    if-eqz p0, :cond_7

    .line 126
    .line 127
    invoke-static {p0}, Lah0;->Κ(Ljava/lang/Class;)Z

    .line 128
    .line 129
    .line 130
    move-result v1

    .line 131
    if-eqz v1, :cond_7

    .line 132
    .line 133
    sput-object p0, Lah0;->ο:Ljava/lang/Class;

    .line 134
    .line 135
    :try_start_1
    sget-object v1, Lox;->α:Ljava/lang/Object;

    .line 136
    .line 137
    invoke-static {p0}, Lyh;->а(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    invoke-static {v0, v1}, Lox;->υ(Lkx;Ljava/util/List;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 142
    .line 143
    .line 144
    :catchall_1
    return-object p0

    .line 145
    :cond_7
    return-object v2
.end method

.method public static α(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 3

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_0

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
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    array-length v2, v1

    .line 21
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {v0, v1}, Ljava/util/Collections;->addAll(Ljava/util/Collection;[Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0
.end method

.method public static β(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Integer;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {p0, p1, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, v1

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return-object p0

    .line 28
    :catchall_0
    :cond_1
    return-object v1
.end method

.method public static γ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Long;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x0

    .line 3
    :try_start_0
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    invoke-static {p0, p1, v0}, Lqe0;->α(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of p1, p0, Ljava/lang/Number;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object p0, v1

    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    .line 20
    .line 21
    .line 22
    move-result-wide p0

    .line 23
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    .line 25
    .line 26
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    return-object p0

    .line 28
    :catchall_0
    :cond_1
    return-object v1
.end method

.method public static δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lah0;->ρ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const/4 v0, 0x0

    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    return-object v0

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p1, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p0

    .line 19
    new-instance p1, Leo1;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p0, p1

    .line 25
    :goto_0
    instance-of p1, p0, Leo1;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    goto :goto_1

    .line 30
    :cond_1
    move-object v0, p0

    .line 31
    :goto_1
    return-object v0
.end method

.method public static ε(Ljava/lang/Object;Ljava/lang/String;)Landroid/view/View;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Landroid/view/View;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Landroid/view/View;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method

.method public static ζ(Landroid/view/View;ZZ)V
    .locals 6

    .line 1
    const v0, 0x7e340002

    .line 2
    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const v0, 0x7e340003

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    const v2, 0x7e340004

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    const v3, 0x7e34000a

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 24
    .line 25
    .line 26
    const v3, 0x7e34000b

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, v3}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    instance-of v5, v4, Landroid/view/View$OnLayoutChangeListener;

    .line 34
    .line 35
    if-eqz v5, :cond_0

    .line 36
    .line 37
    check-cast v4, Landroid/view/View$OnLayoutChangeListener;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    move-object v4, v1

    .line 41
    :goto_0
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {p0, v4}, Landroid/view/View;->removeOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 44
    .line 45
    .line 46
    :cond_1
    invoke-virtual {p0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 47
    .line 48
    .line 49
    const v3, 0x7e34000c

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 53
    .line 54
    .line 55
    if-eqz p1, :cond_2

    .line 56
    .line 57
    const p1, 0x7e340006

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    invoke-static {p0, p2}, Lah0;->Υ(Landroid/view/View;Z)V

    .line 64
    .line 65
    .line 66
    const p1, 0x7e340005

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object p2

    .line 73
    instance-of v4, p2, Ljava/lang/Integer;

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    check-cast p2, Ljava/lang/Integer;

    .line 78
    .line 79
    goto :goto_1

    .line 80
    :cond_3
    move-object p2, v1

    .line 81
    :goto_1
    if-eqz p2, :cond_4

    .line 82
    .line 83
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 84
    .line 85
    .line 86
    move-result p2

    .line 87
    invoke-virtual {p0, p2}, Landroid/view/View;->setMinimumHeight(I)V

    .line 88
    .line 89
    .line 90
    :cond_4
    invoke-virtual {p0, p1, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v0, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v2, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p0, v3, v1}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 100
    .line 101
    .line 102
    return-void
.end method

.method public static η(Landroid/view/View;)V
    .locals 2

    .line 1
    const v0, 0x7e340002

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const v0, 0x7e340003

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const v0, 0x7e340004

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    const v0, 0x7e340007

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-nez v0, :cond_0

    .line 36
    .line 37
    const v0, 0x7e34000b

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    if-nez v0, :cond_0

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    const/4 v0, 0x1

    .line 48
    const/4 v1, 0x0

    .line 49
    invoke-static {p0, v0, v1}, Lah0;->ζ(Landroid/view/View;ZZ)V

    .line 50
    .line 51
    .line 52
    return-void
.end method

.method public static θ(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/TextView;Ljava/util/ArrayList;)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v1

    .line 5
    const/4 v0, 0x0

    .line 6
    move v2, v0

    .line 7
    :goto_0
    if-ge v2, v1, :cond_8

    .line 8
    .line 9
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object v3

    .line 13
    if-nez v3, :cond_0

    .line 14
    .line 15
    goto/16 :goto_5

    .line 16
    .line 17
    :cond_0
    if-eq v3, p2, :cond_7

    .line 18
    .line 19
    const v0, 0x7e340001

    .line 20
    .line 21
    .line 22
    invoke-virtual {v3, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    const-string v4, "dyhelper_im_bubble_time_label_v6"

    .line 27
    .line 28
    invoke-static {v0, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-nez v0, :cond_7

    .line 33
    .line 34
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-nez v0, :cond_7

    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/view/View;->getAlpha()F

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    const/4 v4, 0x0

    .line 45
    cmpg-float v0, v0, v4

    .line 46
    .line 47
    if-lez v0, :cond_7

    .line 48
    .line 49
    invoke-virtual {v3}, Landroid/view/View;->getWidth()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-lez v0, :cond_7

    .line 54
    .line 55
    invoke-virtual {v3}, Landroid/view/View;->getHeight()I

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-gtz v0, :cond_1

    .line 60
    .line 61
    goto/16 :goto_5

    .line 62
    .line 63
    :cond_1
    invoke-static {v3, p1}, Lah0;->Σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    new-instance v4, Lmk0;

    .line 68
    .line 69
    new-instance v5, Llk0;

    .line 70
    .line 71
    iget v6, v0, Landroid/graphics/Rect;->left:I

    .line 72
    .line 73
    iget v7, v0, Landroid/graphics/Rect;->top:I

    .line 74
    .line 75
    iget v8, v0, Landroid/graphics/Rect;->right:I

    .line 76
    .line 77
    iget v0, v0, Landroid/graphics/Rect;->bottom:I

    .line 78
    .line 79
    invoke-direct {v5, v6, v7, v8, v0}, Llk0;-><init>(IIII)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v6

    .line 90
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    const/4 v7, -0x1

    .line 95
    const/4 v8, 0x0

    .line 96
    if-ne v0, v7, :cond_2

    .line 97
    .line 98
    move-object v7, v8

    .line 99
    goto :goto_2

    .line 100
    :cond_2
    :try_start_0
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-virtual {v3}, Landroid/view/View;->getId()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    invoke-virtual {v0, v7}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    goto :goto_1

    .line 113
    :catchall_0
    move-exception v0

    .line 114
    new-instance v7, Leo1;

    .line 115
    .line 116
    invoke-direct {v7, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-object v0, v7

    .line 120
    :goto_1
    instance-of v7, v0, Leo1;

    .line 121
    .line 122
    if-eqz v7, :cond_3

    .line 123
    .line 124
    move-object v0, v8

    .line 125
    :cond_3
    check-cast v0, Ljava/lang/String;

    .line 126
    .line 127
    move-object v7, v0

    .line 128
    :goto_2
    instance-of v0, v3, Landroid/widget/TextView;

    .line 129
    .line 130
    if-eqz v0, :cond_4

    .line 131
    .line 132
    move-object v0, v3

    .line 133
    check-cast v0, Landroid/widget/TextView;

    .line 134
    .line 135
    goto :goto_3

    .line 136
    :cond_4
    move-object v0, v8

    .line 137
    :goto_3
    if-eqz v0, :cond_5

    .line 138
    .line 139
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 140
    .line 141
    .line 142
    move-result-object v0

    .line 143
    if-eqz v0, :cond_5

    .line 144
    .line 145
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    goto :goto_4

    .line 150
    :cond_5
    move-object v0, v8

    .line 151
    :goto_4
    invoke-virtual {v3}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 152
    .line 153
    .line 154
    move-result-object v9

    .line 155
    if-eqz v9, :cond_6

    .line 156
    .line 157
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v8

    .line 161
    :cond_6
    move-object v9, v8

    .line 162
    move-object v8, v0

    .line 163
    invoke-direct/range {v4 .. v9}, Lmk0;-><init>(Llk0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 167
    .line 168
    .line 169
    instance-of v0, v3, Landroid/view/ViewGroup;

    .line 170
    .line 171
    if-eqz v0, :cond_7

    .line 172
    .line 173
    check-cast v3, Landroid/view/ViewGroup;

    .line 174
    .line 175
    invoke-static {v3, p1, p2, p3}, Lah0;->θ(Landroid/view/ViewGroup;Landroid/widget/FrameLayout;Landroid/widget/TextView;Ljava/util/ArrayList;)V

    .line 176
    .line 177
    .line 178
    :cond_7
    :goto_5
    add-int/lit8 v2, v2, 0x1

    .line 179
    .line 180
    goto/16 :goto_0

    .line 181
    .line 182
    :cond_8
    return-void
.end method

.method public static final ι(Lqm1;Landroid/view/View;)V
    .locals 3

    .line 1
    iget-boolean v0, p0, Lqm1;->ε:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    goto :goto_2

    .line 6
    :cond_0
    instance-of v0, p1, Landroid/widget/TextView;

    .line 7
    .line 8
    if-eqz v0, :cond_4

    .line 9
    .line 10
    move-object v0, p1

    .line 11
    check-cast v0, Landroid/widget/TextView;

    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v0, 0x0

    .line 35
    :goto_0
    if-nez v0, :cond_2

    .line 36
    .line 37
    const-string v0, ""

    .line 38
    .line 39
    :cond_2
    sget-object v1, Lah0;->ω:Lym1;

    .line 40
    .line 41
    invoke-virtual {v1, v0}, Lym1;->γ(Ljava/lang/CharSequence;)Z

    .line 42
    .line 43
    .line 44
    move-result v1

    .line 45
    if-nez v1, :cond_3

    .line 46
    .line 47
    sget-object v1, Lah0;->Α:Lym1;

    .line 48
    .line 49
    invoke-virtual {v1, v0}, Lym1;->γ(Ljava/lang/CharSequence;)Z

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    if-eqz v0, :cond_4

    .line 54
    .line 55
    :cond_3
    const/4 p1, 0x1

    .line 56
    iput-boolean p1, p0, Lqm1;->ε:Z

    .line 57
    .line 58
    return-void

    .line 59
    :cond_4
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 60
    .line 61
    if-eqz v0, :cond_5

    .line 62
    .line 63
    check-cast p1, Landroid/view/ViewGroup;

    .line 64
    .line 65
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v1, 0x0

    .line 70
    :goto_1
    if-ge v1, v0, :cond_5

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    invoke-static {p0, v2}, Lah0;->ι(Lqm1;Landroid/view/View;)V

    .line 80
    .line 81
    .line 82
    add-int/lit8 v1, v1, 0x1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    :goto_2
    return-void
.end method

.method public static κ()V
    .locals 3

    .line 1
    invoke-static {}, Li;->α()Landroid/app/Activity;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    move-object v0, v1

    .line 20
    :goto_0
    instance-of v2, v0, Landroid/view/ViewGroup;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    move-object v1, v0

    .line 25
    check-cast v1, Landroid/view/ViewGroup;

    .line 26
    .line 27
    :cond_1
    if-nez v1, :cond_2

    .line 28
    .line 29
    return-void

    .line 30
    :cond_2
    const/4 v0, 0x0

    .line 31
    invoke-static {v1, v0}, Lah0;->λ(Landroid/view/View;I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static final λ(Landroid/view/View;I)V
    .locals 5

    .line 1
    const/16 v0, 0x18

    .line 2
    .line 3
    if-le p1, v0, :cond_0

    .line 4
    .line 5
    goto :goto_1

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    const-string v1, "androidx.recyclerview.widget.RecyclerView"

    .line 11
    .line 12
    invoke-static {v0, v1}, Lah0;->Γ(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-nez v0, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    const-string v2, "RecyclerView"

    .line 28
    .line 29
    invoke-static {v0, v2, v1}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    if-eqz v0, :cond_2

    .line 34
    .line 35
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 36
    .line 37
    if-eqz v0, :cond_2

    .line 38
    .line 39
    const-string v0, "getAdapter"

    .line 40
    .line 41
    invoke-static {p0, v0}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    move-object v2, p0

    .line 46
    check-cast v2, Landroid/view/ViewGroup;

    .line 47
    .line 48
    invoke-static {v2, v0}, Lah0;->Ο(Landroid/view/ViewGroup;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-eqz v3, :cond_2

    .line 53
    .line 54
    const-string v3, "current-activity"

    .line 55
    .line 56
    invoke-static {v2, v0, v3}, Lah0;->Π(Landroid/view/ViewGroup;Ljava/lang/Object;Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    :cond_2
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 60
    .line 61
    if-eqz v0, :cond_3

    .line 62
    .line 63
    check-cast p0, Landroid/view/ViewGroup;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    const/4 v2, 0x0

    .line 70
    :goto_0
    if-ge v2, v0, :cond_3

    .line 71
    .line 72
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    add-int/lit8 v4, p1, 0x1

    .line 80
    .line 81
    invoke-static {v3, v4}, Lah0;->λ(Landroid/view/View;I)V

    .line 82
    .line 83
    .line 84
    add-int/lit8 v2, v2, 0x1

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_3
    :goto_1
    return-void
.end method

.method public static μ(Landroid/view/View;I)I
    .locals 0

    .line 1
    int-to-float p1, p1

    .line 2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 3
    .line 4
    .line 5
    move-result-object p0

    .line 6
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    .line 12
    mul-float/2addr p1, p0

    .line 13
    const/high16 p0, 0x3f000000    # 0.5f

    .line 14
    .line 15
    add-float/2addr p1, p0

    .line 16
    float-to-int p0, p1

    .line 17
    return p0
.end method

.method public static ν(Ljava/lang/Object;)Ljava/util/List;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lah0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    check-cast v1, Ljava/lang/reflect/Field;

    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-eqz v3, :cond_1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    const/4 v3, 0x1

    .line 38
    :try_start_0
    invoke-virtual {v1, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v1

    .line 47
    new-instance v3, Leo1;

    .line 48
    .line 49
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 50
    .line 51
    .line 52
    move-object v1, v3

    .line 53
    :goto_1
    instance-of v3, v1, Leo1;

    .line 54
    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    move-object v1, v2

    .line 58
    :cond_2
    if-nez v1, :cond_3

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_3
    :try_start_1
    const-string v3, "getAdapterData"

    .line 62
    .line 63
    invoke-static {v1, v3}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 67
    goto :goto_2

    .line 68
    :catchall_1
    move-exception v1

    .line 69
    new-instance v3, Leo1;

    .line 70
    .line 71
    invoke-direct {v3, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 72
    .line 73
    .line 74
    move-object v1, v3

    .line 75
    :goto_2
    instance-of v3, v1, Leo1;

    .line 76
    .line 77
    if-eqz v3, :cond_4

    .line 78
    .line 79
    goto :goto_3

    .line 80
    :cond_4
    move-object v2, v1

    .line 81
    :goto_3
    instance-of v1, v2, Ljava/util/List;

    .line 82
    .line 83
    if-eqz v1, :cond_0

    .line 84
    .line 85
    check-cast v2, Ljava/util/List;

    .line 86
    .line 87
    :cond_5
    return-object v2
.end method

.method public static ξ(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "getContentView"

    .line 6
    .line 7
    invoke-static {v0, v1}, Lah0;->ρ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v0, "f"

    .line 15
    .line 16
    invoke-static {p0, v0}, Lah0;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {v2, v1}, Lah0;->ρ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    return-object v0

    .line 33
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, Lah0;->α(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    const/4 v3, 0x0

    .line 50
    if-eqz v2, :cond_6

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    check-cast v2, Ljava/lang/reflect/Field;

    .line 57
    .line 58
    invoke-virtual {v2}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 63
    .line 64
    .line 65
    move-result v4

    .line 66
    if-eqz v4, :cond_3

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_3
    const/4 v4, 0x1

    .line 70
    :try_start_0
    invoke-virtual {v2, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 77
    goto :goto_1

    .line 78
    :catchall_0
    move-exception v2

    .line 79
    new-instance v4, Leo1;

    .line 80
    .line 81
    invoke-direct {v4, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object v2, v4

    .line 85
    :goto_1
    instance-of v4, v2, Leo1;

    .line 86
    .line 87
    if-eqz v4, :cond_4

    .line 88
    .line 89
    goto :goto_2

    .line 90
    :cond_4
    move-object v3, v2

    .line 91
    :goto_2
    if-nez v3, :cond_5

    .line 92
    .line 93
    goto :goto_0

    .line 94
    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v2

    .line 98
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v2

    .line 102
    const-string v4, "BasicViewHolder"

    .line 103
    .line 104
    const/4 v5, 0x0

    .line 105
    invoke-static {v2, v4, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 106
    .line 107
    .line 108
    move-result v2

    .line 109
    if-nez v2, :cond_6

    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    move-result-object v2

    .line 115
    invoke-static {v2, v1}, Lah0;->ρ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    if-eqz v2, :cond_2

    .line 120
    .line 121
    :cond_6
    return-object v3
.end method

.method public static final ο(Landroid/view/View;IZLsm1;Lum1;Landroid/view/View;)V
    .locals 8

    .line 1
    const v0, 0x7e340001

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "dyhelper_im_bubble_time_label_v6"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    if-eq p5, p0, :cond_1

    .line 18
    .line 19
    invoke-static {p5, p0}, Lah0;->Ι(Landroid/view/View;Landroid/view/View;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p5}, Landroid/view/View;->getWidth()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-virtual {p5}, Landroid/view/View;->getHeight()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    const/16 v2, 0x18

    .line 34
    .line 35
    invoke-static {p0, v2}, Lah0;->μ(Landroid/view/View;I)I

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-le v0, v2, :cond_1

    .line 40
    .line 41
    const/16 v2, 0x10

    .line 42
    .line 43
    invoke-static {p0, v2}, Lah0;->μ(Landroid/view/View;I)I

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-le v1, v2, :cond_1

    .line 48
    .line 49
    int-to-float v0, v0

    .line 50
    int-to-float v1, p1

    .line 51
    const v2, 0x3f6b851f    # 0.92f

    .line 52
    .line 53
    .line 54
    mul-float/2addr v1, v2

    .line 55
    cmpg-float v0, v0, v1

    .line 56
    .line 57
    if-gez v0, :cond_1

    .line 58
    .line 59
    invoke-static {p0, p5, p2}, Lah0;->в(Landroid/view/View;Landroid/view/View;Z)I

    .line 60
    .line 61
    .line 62
    move-result v0

    .line 63
    iget v1, p3, Lsm1;->ε:I

    .line 64
    .line 65
    if-le v0, v1, :cond_1

    .line 66
    .line 67
    iput v0, p3, Lsm1;->ε:I

    .line 68
    .line 69
    iput-object p5, p4, Lum1;->ε:Ljava/lang/Object;

    .line 70
    .line 71
    :cond_1
    instance-of v0, p5, Landroid/view/ViewGroup;

    .line 72
    .line 73
    if-eqz v0, :cond_2

    .line 74
    .line 75
    check-cast p5, Landroid/view/ViewGroup;

    .line 76
    .line 77
    invoke-virtual {p5}, Landroid/view/ViewGroup;->getChildCount()I

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    const/4 v1, 0x0

    .line 82
    :goto_0
    if-ge v1, v0, :cond_2

    .line 83
    .line 84
    invoke-virtual {p5, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-object v2, p0

    .line 92
    move v3, p1

    .line 93
    move v4, p2

    .line 94
    move-object v5, p3

    .line 95
    move-object v6, p4

    .line 96
    invoke-static/range {v2 .. v7}, Lah0;->ο(Landroid/view/View;IZLsm1;Lum1;Landroid/view/View;)V

    .line 97
    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_0

    .line 102
    :cond_2
    :goto_1
    return-void
.end method

.method public static final π(Landroid/view/View;Landroid/view/ViewGroup;IZLsm1;Lum1;Landroid/view/View;)V
    .locals 9

    .line 1
    const v0, 0x7e340001

    .line 2
    .line 3
    .line 4
    invoke-virtual {p6, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "dyhelper_im_bubble_time_label_v6"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    if-eq p6, p0, :cond_16

    .line 20
    .line 21
    invoke-virtual {p6}, Landroid/view/View;->getVisibility()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_16

    .line 26
    .line 27
    invoke-virtual {p6}, Landroid/view/View;->getWidth()I

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    const/16 v2, 0x14

    .line 32
    .line 33
    invoke-static {p0, v2}, Lah0;->μ(Landroid/view/View;I)I

    .line 34
    .line 35
    .line 36
    move-result v2

    .line 37
    if-le v1, v2, :cond_16

    .line 38
    .line 39
    invoke-virtual {p6}, Landroid/view/View;->getHeight()I

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    const/16 v2, 0x10

    .line 44
    .line 45
    invoke-static {p0, v2}, Lah0;->μ(Landroid/view/View;I)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-le v1, v2, :cond_16

    .line 50
    .line 51
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-static {p6, p1}, Lah0;->Σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-static {p6}, Lah0;->Ξ(Landroid/view/View;)Z

    .line 72
    .line 73
    .line 74
    move-result v4

    .line 75
    if-eqz v4, :cond_1

    .line 76
    .line 77
    const/16 v4, 0xb4

    .line 78
    .line 79
    goto :goto_0

    .line 80
    :cond_1
    move v4, v0

    .line 81
    :goto_0
    invoke-static {p6}, Lah0;->Ν(Landroid/view/View;)Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x5a

    .line 88
    .line 89
    :cond_2
    const-string v5, "IMMsgTextView"

    .line 90
    .line 91
    invoke-static {v1, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 92
    .line 93
    .line 94
    move-result v5

    .line 95
    if-nez v5, :cond_3

    .line 96
    .line 97
    const-string v5, "RichTextSpanInterceptNoTextView"

    .line 98
    .line 99
    invoke-static {v1, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 100
    .line 101
    .line 102
    move-result v5

    .line 103
    if-eqz v5, :cond_4

    .line 104
    .line 105
    :cond_3
    add-int/lit8 v4, v4, 0x5a

    .line 106
    .line 107
    :cond_4
    const-string v5, "ReverseRemoteImageView"

    .line 108
    .line 109
    invoke-static {v1, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 110
    .line 111
    .line 112
    move-result v5

    .line 113
    if-nez v5, :cond_5

    .line 114
    .line 115
    const-string v5, "SmartImageView"

    .line 116
    .line 117
    invoke-static {v1, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-nez v5, :cond_5

    .line 122
    .line 123
    const-string v5, "RecyclerViewGradualItemLayout"

    .line 124
    .line 125
    invoke-static {v1, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 126
    .line 127
    .line 128
    move-result v5

    .line 129
    if-eqz v5, :cond_6

    .line 130
    .line 131
    :cond_5
    add-int/lit8 v4, v4, 0x50

    .line 132
    .line 133
    :cond_6
    const-string v5, "ContentViewContainer"

    .line 134
    .line 135
    invoke-static {v1, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 136
    .line 137
    .line 138
    move-result v5

    .line 139
    if-nez v5, :cond_7

    .line 140
    .line 141
    const-string v5, "IMStubView"

    .line 142
    .line 143
    invoke-static {v1, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 144
    .line 145
    .line 146
    move-result v5

    .line 147
    if-eqz v5, :cond_8

    .line 148
    .line 149
    :cond_7
    add-int/lit8 v4, v4, 0x32

    .line 150
    .line 151
    :cond_8
    invoke-virtual {p6}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    if-eqz v5, :cond_9

    .line 156
    .line 157
    add-int/lit8 v4, v4, 0x12

    .line 158
    .line 159
    :cond_9
    const-string v5, "ConstraintLayout"

    .line 160
    .line 161
    invoke-static {v2, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-nez v5, :cond_a

    .line 166
    .line 167
    const-string v5, "FrameLayout"

    .line 168
    .line 169
    invoke-static {v2, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 170
    .line 171
    .line 172
    move-result v5

    .line 173
    if-nez v5, :cond_a

    .line 174
    .line 175
    const-string v5, "LinearLayout"

    .line 176
    .line 177
    invoke-static {v2, v5, v0}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 178
    .line 179
    .line 180
    move-result v2

    .line 181
    if-eqz v2, :cond_b

    .line 182
    .line 183
    :cond_a
    add-int/lit8 v4, v4, 0xa

    .line 184
    .line 185
    :cond_b
    const-string v2, "Avatar"

    .line 186
    .line 187
    const/4 v5, 0x1

    .line 188
    invoke-static {v1, v2, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 189
    .line 190
    .line 191
    move-result v2

    .line 192
    if-eqz v2, :cond_c

    .line 193
    .line 194
    add-int/lit16 v4, v4, -0x1f4

    .line 195
    .line 196
    :cond_c
    const-string v2, "MsgTime"

    .line 197
    .line 198
    invoke-static {v1, v2, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 199
    .line 200
    .line 201
    move-result v1

    .line 202
    if-eqz v1, :cond_d

    .line 203
    .line 204
    add-int/lit16 v4, v4, -0x1f4

    .line 205
    .line 206
    :cond_d
    instance-of v1, p6, Landroid/widget/TextView;

    .line 207
    .line 208
    const/4 v2, 0x0

    .line 209
    if-eqz v1, :cond_e

    .line 210
    .line 211
    move-object v1, p6

    .line 212
    check-cast v1, Landroid/widget/TextView;

    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_e
    move-object v1, v2

    .line 216
    :goto_1
    if-eqz v1, :cond_f

    .line 217
    .line 218
    invoke-virtual {v1}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 219
    .line 220
    .line 221
    move-result-object v1

    .line 222
    if-eqz v1, :cond_f

    .line 223
    .line 224
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object v1

    .line 228
    if-eqz v1, :cond_f

    .line 229
    .line 230
    invoke-static {v1}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 231
    .line 232
    .line 233
    move-result-object v1

    .line 234
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    :cond_f
    if-nez v2, :cond_10

    .line 239
    .line 240
    const-string v2, ""

    .line 241
    .line 242
    :cond_10
    sget-object v1, Lah0;->Β:Lym1;

    .line 243
    .line 244
    invoke-virtual {v1, v2}, Lym1;->γ(Ljava/lang/CharSequence;)Z

    .line 245
    .line 246
    .line 247
    move-result v1

    .line 248
    if-eqz v1, :cond_11

    .line 249
    .line 250
    add-int/lit16 v4, v4, -0xc8

    .line 251
    .line 252
    :cond_11
    invoke-virtual {v3}, Landroid/graphics/Rect;->width()I

    .line 253
    .line 254
    .line 255
    move-result v1

    .line 256
    int-to-float v1, v1

    .line 257
    int-to-float v2, p2

    .line 258
    const v5, 0x3f666666    # 0.9f

    .line 259
    .line 260
    .line 261
    mul-float/2addr v2, v5

    .line 262
    cmpl-float v1, v1, v2

    .line 263
    .line 264
    if-ltz v1, :cond_12

    .line 265
    .line 266
    add-int/lit8 v4, v4, -0x78

    .line 267
    .line 268
    :cond_12
    invoke-virtual {v3}, Landroid/graphics/Rect;->centerX()I

    .line 269
    .line 270
    .line 271
    move-result v1

    .line 272
    if-eqz p3, :cond_14

    .line 273
    .line 274
    div-int/lit8 v2, p2, 0x2

    .line 275
    .line 276
    if-le v1, v2, :cond_13

    .line 277
    .line 278
    :goto_2
    add-int/lit8 v4, v4, 0x1e

    .line 279
    .line 280
    goto :goto_3

    .line 281
    :cond_13
    add-int/lit8 v4, v4, -0x1e

    .line 282
    .line 283
    goto :goto_3

    .line 284
    :cond_14
    div-int/lit8 v2, p2, 0x2

    .line 285
    .line 286
    if-ge v1, v2, :cond_13

    .line 287
    .line 288
    goto :goto_2

    .line 289
    :goto_3
    iget v1, v3, Landroid/graphics/Rect;->left:I

    .line 290
    .line 291
    const/4 v2, 0x4

    .line 292
    invoke-static {p0, v2}, Lah0;->μ(Landroid/view/View;I)I

    .line 293
    .line 294
    .line 295
    move-result v5

    .line 296
    if-gt v1, v5, :cond_15

    .line 297
    .line 298
    iget v1, v3, Landroid/graphics/Rect;->right:I

    .line 299
    .line 300
    invoke-static {p0, v2}, Lah0;->μ(Landroid/view/View;I)I

    .line 301
    .line 302
    .line 303
    move-result v2

    .line 304
    sub-int v2, p2, v2

    .line 305
    .line 306
    if-lt v1, v2, :cond_15

    .line 307
    .line 308
    add-int/lit16 v4, v4, -0xb4

    .line 309
    .line 310
    :cond_15
    iget v1, p4, Lsm1;->ε:I

    .line 311
    .line 312
    if-le v4, v1, :cond_16

    .line 313
    .line 314
    iput v4, p4, Lsm1;->ε:I

    .line 315
    .line 316
    iput-object p6, p5, Lum1;->ε:Ljava/lang/Object;

    .line 317
    .line 318
    :cond_16
    instance-of v1, p6, Landroid/view/ViewGroup;

    .line 319
    .line 320
    if-eqz v1, :cond_17

    .line 321
    .line 322
    check-cast p6, Landroid/view/ViewGroup;

    .line 323
    .line 324
    invoke-virtual {p6}, Landroid/view/ViewGroup;->getChildCount()I

    .line 325
    .line 326
    .line 327
    move-result v1

    .line 328
    :goto_4
    if-ge v0, v1, :cond_17

    .line 329
    .line 330
    invoke-virtual {p6, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 331
    .line 332
    .line 333
    move-result-object v8

    .line 334
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 335
    .line 336
    .line 337
    move-object v2, p0

    .line 338
    move-object v3, p1

    .line 339
    move v4, p2

    .line 340
    move v5, p3

    .line 341
    move-object v6, p4

    .line 342
    move-object v7, p5

    .line 343
    invoke-static/range {v2 .. v8}, Lah0;->π(Landroid/view/View;Landroid/view/ViewGroup;IZLsm1;Lum1;Landroid/view/View;)V

    .line 344
    .line 345
    .line 346
    add-int/lit8 v0, v0, 0x1

    .line 347
    .line 348
    goto :goto_4

    .line 349
    :cond_17
    :goto_5
    return-void
.end method

.method public static ρ(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    new-instance v0, Lzg0;

    .line 2
    .line 3
    invoke-direct {v0, p0, p1}, Lzg0;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lah0;->χ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    return-object v2

    .line 17
    :cond_0
    sget-object v2, Lah0;->ψ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 18
    .line 19
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    const/4 v4, 0x0

    .line 24
    if-eqz v3, :cond_1

    .line 25
    .line 26
    return-object v4

    .line 27
    :cond_1
    :goto_0
    if-eqz p0, :cond_5

    .line 28
    .line 29
    const-class v3, Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_5

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {p0, p1, v4}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 38
    .line 39
    .line 40
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    goto :goto_1

    .line 42
    :catchall_0
    move-exception v3

    .line 43
    new-instance v5, Leo1;

    .line 44
    .line 45
    invoke-direct {v5, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 46
    .line 47
    .line 48
    move-object v3, v5

    .line 49
    :goto_1
    instance-of v5, v3, Leo1;

    .line 50
    .line 51
    if-eqz v5, :cond_2

    .line 52
    .line 53
    move-object v3, v4

    .line 54
    :cond_2
    check-cast v3, Ljava/lang/reflect/Method;

    .line 55
    .line 56
    if-eqz v3, :cond_4

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 59
    .line 60
    .line 61
    move-result v5

    .line 62
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 63
    .line 64
    .line 65
    move-result v5

    .line 66
    if-nez v5, :cond_4

    .line 67
    .line 68
    const/4 v5, 0x1

    .line 69
    :try_start_1
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_1
    move-exception v3

    .line 74
    new-instance v5, Leo1;

    .line 75
    .line 76
    invoke-direct {v5, v3}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 77
    .line 78
    .line 79
    move-object v3, v5

    .line 80
    :goto_2
    instance-of v5, v3, Leo1;

    .line 81
    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    move-object v3, v4

    .line 85
    :cond_3
    check-cast v3, Ljava/lang/reflect/Method;

    .line 86
    .line 87
    if-eqz v3, :cond_4

    .line 88
    .line 89
    invoke-virtual {v1, v0, v3}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    return-object v3

    .line 93
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    goto :goto_0

    .line 98
    :cond_5
    invoke-virtual {v2, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    return-object v4
.end method

.method public static final σ(Landroid/view/View;ZLsm1;Lum1;Landroid/view/View;)V
    .locals 3

    .line 1
    const v0, 0x7e340001

    .line 2
    .line 3
    .line 4
    invoke-virtual {p4, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    const-string v1, "dyhelper_im_bubble_time_label_v6"

    .line 9
    .line 10
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    goto :goto_4

    .line 17
    :cond_0
    invoke-static {p4}, Lah0;->Ν(Landroid/view/View;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_4

    .line 22
    .line 23
    invoke-virtual {p4}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    :goto_0
    instance-of v1, v0, Landroid/view/View;

    .line 28
    .line 29
    if-eqz v1, :cond_3

    .line 30
    .line 31
    if-ne v0, p0, :cond_1

    .line 32
    .line 33
    goto :goto_1

    .line 34
    :cond_1
    check-cast v0, Landroid/view/View;

    .line 35
    .line 36
    invoke-static {v0}, Lah0;->Ξ(Landroid/view/View;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    goto :goto_0

    .line 48
    :cond_3
    :goto_1
    const/4 v0, 0x0

    .line 49
    :goto_2
    if-eqz v0, :cond_4

    .line 50
    .line 51
    if-eq v0, p0, :cond_4

    .line 52
    .line 53
    invoke-static {v0, p0}, Lah0;->Η(Landroid/view/View;Landroid/view/View;)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    if-eqz v1, :cond_4

    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_4

    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    if-lez v1, :cond_4

    .line 70
    .line 71
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-lez v1, :cond_4

    .line 76
    .line 77
    invoke-static {p0, v0, p1}, Lah0;->в(Landroid/view/View;Landroid/view/View;Z)I

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    add-int/lit16 v1, v1, 0xb4

    .line 82
    .line 83
    iget v2, p2, Lsm1;->ε:I

    .line 84
    .line 85
    if-le v1, v2, :cond_4

    .line 86
    .line 87
    iput v1, p2, Lsm1;->ε:I

    .line 88
    .line 89
    iput-object v0, p3, Lum1;->ε:Ljava/lang/Object;

    .line 90
    .line 91
    :cond_4
    instance-of v0, p4, Landroid/view/ViewGroup;

    .line 92
    .line 93
    if-eqz v0, :cond_5

    .line 94
    .line 95
    check-cast p4, Landroid/view/ViewGroup;

    .line 96
    .line 97
    invoke-virtual {p4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    const/4 v1, 0x0

    .line 102
    :goto_3
    if-ge v1, v0, :cond_5

    .line 103
    .line 104
    invoke-virtual {p4, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    invoke-static {p0, p1, p2, p3, v2}, Lah0;->σ(Landroid/view/View;ZLsm1;Lum1;Landroid/view/View;)V

    .line 112
    .line 113
    .line 114
    add-int/lit8 v1, v1, 0x1

    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_5
    :goto_4
    return-void
.end method

.method public static τ(Landroid/view/View;I)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p0, p1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Ljava/lang/ref/WeakReference;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    check-cast v0, Ljava/lang/ref/WeakReference;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    move-object v0, v2

    .line 22
    :goto_1
    instance-of v1, v0, Landroid/view/View;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    check-cast v0, Landroid/view/View;

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    move-object v0, v2

    .line 30
    :goto_2
    if-nez v0, :cond_3

    .line 31
    .line 32
    invoke-virtual {p0, p1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 33
    .line 34
    .line 35
    return-object v2

    .line 36
    :cond_3
    invoke-static {v0, p0}, Lah0;->Η(Landroid/view/View;Landroid/view/View;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_5

    .line 41
    .line 42
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_4

    .line 47
    .line 48
    goto :goto_3

    .line 49
    :cond_4
    return-object v0

    .line 50
    :cond_5
    :goto_3
    invoke-virtual {p0, p1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    return-object v2
.end method

.method public static υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 7

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lzg0;

    .line 6
    .line 7
    invoke-direct {v1, v0, p1}, Lzg0;-><init>(Ljava/lang/Class;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    sget-object v2, Lah0;->υ:Ljava/util/concurrent/ConcurrentHashMap;

    .line 11
    .line 12
    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    check-cast v3, Ljava/lang/reflect/Field;

    .line 17
    .line 18
    const/4 v4, 0x0

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    goto :goto_4

    .line 22
    :cond_0
    sget-object v3, Lah0;->φ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 23
    .line 24
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-eqz v5, :cond_1

    .line 29
    .line 30
    :goto_0
    move-object v3, v4

    .line 31
    goto :goto_4

    .line 32
    :cond_1
    :goto_1
    if-eqz v0, :cond_5

    .line 33
    .line 34
    const-class v5, Ljava/lang/Object;

    .line 35
    .line 36
    invoke-virtual {v0, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-nez v5, :cond_5

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    goto :goto_2

    .line 47
    :catchall_0
    move-exception v5

    .line 48
    new-instance v6, Leo1;

    .line 49
    .line 50
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 51
    .line 52
    .line 53
    move-object v5, v6

    .line 54
    :goto_2
    instance-of v6, v5, Leo1;

    .line 55
    .line 56
    if-eqz v6, :cond_2

    .line 57
    .line 58
    move-object v5, v4

    .line 59
    :cond_2
    check-cast v5, Ljava/lang/reflect/Field;

    .line 60
    .line 61
    if-eqz v5, :cond_4

    .line 62
    .line 63
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 64
    .line 65
    .line 66
    move-result v6

    .line 67
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 68
    .line 69
    .line 70
    move-result v6

    .line 71
    if-nez v6, :cond_4

    .line 72
    .line 73
    const/4 v6, 0x1

    .line 74
    :try_start_1
    invoke-virtual {v5, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_3

    .line 78
    :catchall_1
    move-exception v5

    .line 79
    new-instance v6, Leo1;

    .line 80
    .line 81
    invoke-direct {v6, v5}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 82
    .line 83
    .line 84
    move-object v5, v6

    .line 85
    :goto_3
    instance-of v6, v5, Leo1;

    .line 86
    .line 87
    if-eqz v6, :cond_3

    .line 88
    .line 89
    move-object v5, v4

    .line 90
    :cond_3
    check-cast v5, Ljava/lang/reflect/Field;

    .line 91
    .line 92
    if-eqz v5, :cond_4

    .line 93
    .line 94
    invoke-virtual {v2, v1, v5}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-object v3, v5

    .line 98
    goto :goto_4

    .line 99
    :cond_4
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    invoke-virtual {v3, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    goto :goto_0

    .line 108
    :goto_4
    if-nez v3, :cond_6

    .line 109
    .line 110
    return-object v4

    .line 111
    :cond_6
    :try_start_2
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 115
    goto :goto_5

    .line 116
    :catchall_2
    move-exception p0

    .line 117
    new-instance p1, Leo1;

    .line 118
    .line 119
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 120
    .line 121
    .line 122
    move-object p0, p1

    .line 123
    :goto_5
    instance-of p1, p0, Leo1;

    .line 124
    .line 125
    if-eqz p1, :cond_7

    .line 126
    .line 127
    goto :goto_6

    .line 128
    :cond_7
    move-object v4, p0

    .line 129
    :goto_6
    return-object v4
.end method

.method public static φ(Ljava/lang/Object;)Landroid/view/View;
    .locals 1

    .line 1
    const-string v0, "itemView"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lah0;->υ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    instance-of v0, p0, Landroid/view/View;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    check-cast p0, Landroid/view/View;

    .line 12
    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return-object p0
.end method

.method public static χ()Ljava/lang/Class;
    .locals 3

    .line 1
    sget-object v0, Lah0;->π:Ljava/lang/Class;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    sget-object v0, Lah0;->ξ:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    if-nez v0, :cond_1

    .line 10
    .line 11
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    return-object v1

    .line 22
    :cond_1
    :try_start_0
    sget-object v2, Lqe0;->α:Ljava/lang/Object;

    .line 23
    .line 24
    const-string v2, "~7918AA8396C85B92707DC4C904CF4F6B873956D476D564A4B4FA8249966EA0F63C4AD8"

    .line 25
    .line 26
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {v0, v2}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    new-instance v2, Leo1;

    .line 37
    .line 38
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 39
    .line 40
    .line 41
    move-object v0, v2

    .line 42
    :goto_0
    instance-of v2, v0, Leo1;

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    goto :goto_1

    .line 47
    :cond_2
    move-object v1, v0

    .line 48
    :goto_1
    check-cast v1, Ljava/lang/Class;

    .line 49
    .line 50
    sput-object v1, Lah0;->π:Ljava/lang/Class;

    .line 51
    .line 52
    return-object v1
.end method

.method public static ψ(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Lah0;->ν(Ljava/lang/Object;)Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    goto :goto_2

    .line 9
    :cond_0
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    goto :goto_2

    .line 16
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    add-int/lit8 v1, v1, -0x1

    .line 21
    .line 22
    sub-int/2addr v1, p0

    .line 23
    if-ltz v1, :cond_5

    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Collection;->size()I

    .line 26
    .line 27
    .line 28
    move-result p0

    .line 29
    if-ge v1, p0, :cond_5

    .line 30
    .line 31
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 35
    if-nez p0, :cond_2

    .line 36
    .line 37
    goto :goto_2

    .line 38
    :cond_2
    :try_start_1
    const-string p1, "LJIIIIZZ"

    .line 39
    .line 40
    invoke-static {p0, p1}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception p1

    .line 46
    :try_start_2
    new-instance v1, Leo1;

    .line 47
    .line 48
    invoke-direct {v1, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object p1, v1

    .line 52
    :goto_0
    instance-of v1, p1, Leo1;

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    move-object p1, v0

    .line 57
    :cond_3
    if-nez p1, :cond_4

    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_4
    move-object p0, p1

    .line 61
    :goto_1
    invoke-static {p0}, Lah0;->Α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 65
    nop

    .line 66
    :catchall_1
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static ω(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    invoke-static {p0}, Lah0;->Α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-object v0

    .line 8
    :cond_0
    invoke-static {p0}, Lah0;->ξ(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const/4 v0, 0x0

    .line 13
    if-eqz p0, :cond_7

    .line 14
    .line 15
    const-string v1, "getCurrentMsg"

    .line 16
    .line 17
    invoke-static {p0, v1}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {v1}, Lah0;->Λ(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    if-eqz v2, :cond_2

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_2
    :goto_0
    move-object v1, v0

    .line 32
    :goto_1
    if-eqz v1, :cond_3

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_3
    const-string v1, "N1"

    .line 36
    .line 37
    invoke-static {p0, v1}, Lah0;->δ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object v1

    .line 41
    if-nez v1, :cond_4

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_4
    invoke-static {v1}, Lah0;->Λ(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v2

    .line 48
    if-eqz v2, :cond_5

    .line 49
    .line 50
    goto :goto_3

    .line 51
    :cond_5
    :goto_2
    move-object v1, v0

    .line 52
    :goto_3
    if-eqz v1, :cond_6

    .line 53
    .line 54
    return-object v1

    .line 55
    :cond_6
    invoke-static {p0}, Lah0;->Α(Ljava/lang/Object;)Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_7

    .line 60
    .line 61
    return-object p0

    .line 62
    :cond_7
    return-object v0
.end method

.method public static а(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)Lyg0;
    .locals 0

    .line 1
    :try_start_0
    invoke-static {p0, p1, p2, p3, p4}, Lah0;->Δ(Landroid/view/View;Ljava/lang/Object;Ljava/lang/String;ZLjava/lang/String;)Lyg0;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    return-object p0

    .line 6
    :catchall_0
    move-exception p1

    .line 7
    const-string p2, "inject-label"

    .line 8
    .line 9
    invoke-static {p2, p1}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x0

    .line 13
    :try_start_1
    invoke-static {p0, p1}, Lah0;->Υ(Landroid/view/View;Z)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 14
    .line 15
    .line 16
    :catchall_1
    sget-object p0, Lyg0;->η:Lyg0;

    .line 17
    .line 18
    return-object p0
.end method

.method public static б(Landroid/view/ViewGroup;Ljava/lang/String;Z)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-gtz v0, :cond_0

    .line 6
    .line 7
    goto :goto_2

    .line 8
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 9
    .line 10
    .line 11
    move-result-wide v0

    .line 12
    const v2, 0x7e340009

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    instance-of v4, v3, Ljava/lang/Long;

    .line 20
    .line 21
    if-eqz v4, :cond_1

    .line 22
    .line 23
    check-cast v3, Ljava/lang/Long;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 v3, 0x0

    .line 27
    :goto_0
    if-eqz v3, :cond_2

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/lang/Long;->longValue()J

    .line 30
    .line 31
    .line 32
    move-result-wide v3

    .line 33
    goto :goto_1

    .line 34
    :cond_2
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    :goto_1
    if-nez p2, :cond_3

    .line 37
    .line 38
    sub-long v3, v0, v3

    .line 39
    .line 40
    const-wide/16 v5, 0xb4

    .line 41
    .line 42
    cmp-long p2, v3, v5

    .line 43
    .line 44
    if-gez p2, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    const p2, 0x7e340008

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p2}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 55
    .line 56
    invoke-static {v3, v4}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    if-eqz v3, :cond_4

    .line 61
    .line 62
    :goto_2
    return-void

    .line 63
    :cond_4
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-virtual {p0, v2, v0}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, p2, v4}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 71
    .line 72
    .line 73
    new-instance p2, Lu20;

    .line 74
    .line 75
    const/4 v0, 0x2

    .line 76
    invoke-direct {p2, p0, p1, v0}, Lu20;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, p2}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 80
    .line 81
    .line 82
    return-void
.end method

.method public static в(Landroid/view/View;Landroid/view/View;Z)I
    .locals 7

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    instance-of v2, p0, Landroid/view/ViewGroup;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    move-object v2, p0

    .line 23
    check-cast v2, Landroid/view/ViewGroup;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v3

    .line 27
    :goto_0
    if-nez v2, :cond_1

    .line 28
    .line 29
    const/16 p0, -0x270f

    .line 30
    .line 31
    return p0

    .line 32
    :cond_1
    invoke-static {p1, v2}, Lah0;->Σ(Landroid/view/View;Landroid/view/ViewGroup;)Landroid/graphics/Rect;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast p0, Landroid/view/ViewGroup;

    .line 37
    .line 38
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    .line 44
    .line 45
    move-result-object v5

    .line 46
    if-lez v4, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v5, v3

    .line 50
    :goto_1
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    goto :goto_2

    .line 57
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    iget p0, p0, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 66
    .line 67
    :goto_2
    invoke-static {p1}, Lah0;->Ξ(Landroid/view/View;)Z

    .line 68
    .line 69
    .line 70
    move-result v4

    .line 71
    const/4 v5, 0x0

    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    const/16 v4, 0xb4

    .line 75
    .line 76
    goto :goto_3

    .line 77
    :cond_4
    move v4, v5

    .line 78
    :goto_3
    invoke-static {p1}, Lah0;->Ν(Landroid/view/View;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_5

    .line 83
    .line 84
    add-int/lit8 v4, v4, 0x50

    .line 85
    .line 86
    :cond_5
    const-string v6, "IMMsgTextView"

    .line 87
    .line 88
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-nez v6, :cond_6

    .line 93
    .line 94
    const-string v6, "RichTextSpanInterceptNoTextView"

    .line 95
    .line 96
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 97
    .line 98
    .line 99
    move-result v6

    .line 100
    if-nez v6, :cond_6

    .line 101
    .line 102
    const-string v6, "ReverseRemoteImageView"

    .line 103
    .line 104
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 105
    .line 106
    .line 107
    move-result v6

    .line 108
    if-nez v6, :cond_6

    .line 109
    .line 110
    const-string v6, "RecyclerViewGradualItemLayout"

    .line 111
    .line 112
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 113
    .line 114
    .line 115
    move-result v6

    .line 116
    if-nez v6, :cond_6

    .line 117
    .line 118
    const-string v6, "ContentViewContainer"

    .line 119
    .line 120
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 121
    .line 122
    .line 123
    move-result v6

    .line 124
    if-nez v6, :cond_6

    .line 125
    .line 126
    const-string v6, "IMStubView"

    .line 127
    .line 128
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 129
    .line 130
    .line 131
    move-result v6

    .line 132
    if-eqz v6, :cond_7

    .line 133
    .line 134
    :cond_6
    add-int/lit8 v4, v4, 0x3c

    .line 135
    .line 136
    :cond_7
    const-string v6, "SmartImageView"

    .line 137
    .line 138
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 139
    .line 140
    .line 141
    move-result v6

    .line 142
    if-nez v6, :cond_8

    .line 143
    .line 144
    const-string v6, "RemoteImageView"

    .line 145
    .line 146
    invoke-static {v0, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_9

    .line 151
    .line 152
    :cond_8
    add-int/lit8 v4, v4, 0x23

    .line 153
    .line 154
    :cond_9
    instance-of v6, p1, Landroid/view/ViewGroup;

    .line 155
    .line 156
    if-eqz v6, :cond_a

    .line 157
    .line 158
    add-int/lit8 v4, v4, 0xc

    .line 159
    .line 160
    :cond_a
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    .line 161
    .line 162
    .line 163
    move-result-object v6

    .line 164
    if-eqz v6, :cond_b

    .line 165
    .line 166
    add-int/lit8 v4, v4, 0x10

    .line 167
    .line 168
    :cond_b
    const-string v6, "ConstraintLayout"

    .line 169
    .line 170
    invoke-static {v1, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    if-nez v6, :cond_c

    .line 175
    .line 176
    const-string v6, "FrameLayout"

    .line 177
    .line 178
    invoke-static {v1, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 179
    .line 180
    .line 181
    move-result v6

    .line 182
    if-nez v6, :cond_c

    .line 183
    .line 184
    const-string v6, "LinearLayout"

    .line 185
    .line 186
    invoke-static {v1, v6, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 187
    .line 188
    .line 189
    move-result v1

    .line 190
    if-eqz v1, :cond_d

    .line 191
    .line 192
    :cond_c
    add-int/lit8 v4, v4, 0x8

    .line 193
    .line 194
    :cond_d
    const-string v1, "Avatar"

    .line 195
    .line 196
    const/4 v5, 0x1

    .line 197
    invoke-static {v0, v1, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 198
    .line 199
    .line 200
    move-result v1

    .line 201
    if-eqz v1, :cond_e

    .line 202
    .line 203
    add-int/lit8 v4, v4, -0x78

    .line 204
    .line 205
    :cond_e
    const-string v1, "MsgTime"

    .line 206
    .line 207
    invoke-static {v0, v1, v5}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 208
    .line 209
    .line 210
    move-result v0

    .line 211
    if-eqz v0, :cond_f

    .line 212
    .line 213
    add-int/lit8 v4, v4, -0x78

    .line 214
    .line 215
    :cond_f
    instance-of v0, p1, Landroid/widget/TextView;

    .line 216
    .line 217
    if-eqz v0, :cond_10

    .line 218
    .line 219
    move-object v0, p1

    .line 220
    check-cast v0, Landroid/widget/TextView;

    .line 221
    .line 222
    goto :goto_4

    .line 223
    :cond_10
    move-object v0, v3

    .line 224
    :goto_4
    if-eqz v0, :cond_11

    .line 225
    .line 226
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 227
    .line 228
    .line 229
    move-result-object v0

    .line 230
    if-eqz v0, :cond_11

    .line 231
    .line 232
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v0

    .line 236
    if-eqz v0, :cond_11

    .line 237
    .line 238
    invoke-static {v0}, Lq02;->Б(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 239
    .line 240
    .line 241
    move-result-object v0

    .line 242
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    :cond_11
    if-nez v3, :cond_12

    .line 247
    .line 248
    const-string v3, ""

    .line 249
    .line 250
    :cond_12
    sget-object v0, Lah0;->Β:Lym1;

    .line 251
    .line 252
    invoke-virtual {v0, v3}, Lym1;->γ(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v0

    .line 256
    if-eqz v0, :cond_13

    .line 257
    .line 258
    add-int/lit8 v4, v4, -0x64

    .line 259
    .line 260
    :cond_13
    invoke-virtual {v2}, Landroid/graphics/Rect;->centerX()I

    .line 261
    .line 262
    .line 263
    move-result v0

    .line 264
    if-eqz p2, :cond_15

    .line 265
    .line 266
    div-int/lit8 p2, p0, 0x2

    .line 267
    .line 268
    if-le v0, p2, :cond_14

    .line 269
    .line 270
    :goto_5
    add-int/lit8 v4, v4, 0x18

    .line 271
    .line 272
    goto :goto_6

    .line 273
    :cond_14
    add-int/lit8 v4, v4, -0x18

    .line 274
    .line 275
    goto :goto_6

    .line 276
    :cond_15
    div-int/lit8 p2, p0, 0x2

    .line 277
    .line 278
    if-ge v0, p2, :cond_14

    .line 279
    .line 280
    goto :goto_5

    .line 281
    :goto_6
    invoke-virtual {v2}, Landroid/graphics/Rect;->width()I

    .line 282
    .line 283
    .line 284
    move-result p2

    .line 285
    int-to-float p2, p2

    .line 286
    int-to-float p0, p0

    .line 287
    const v0, 0x3f51eb85    # 0.82f

    .line 288
    .line 289
    .line 290
    mul-float/2addr p0, v0

    .line 291
    cmpl-float p0, p2, p0

    .line 292
    .line 293
    if-lez p0, :cond_16

    .line 294
    .line 295
    invoke-static {p1}, Lah0;->Ξ(Landroid/view/View;)Z

    .line 296
    .line 297
    .line 298
    move-result p0

    .line 299
    if-nez p0, :cond_16

    .line 300
    .line 301
    add-int/lit8 v4, v4, -0xc

    .line 302
    .line 303
    :cond_16
    return v4
.end method

.method public static г(Ljava/lang/String;)V
    .locals 13

    .line 1
    sget-object v0, Lhk0;->α:Lym1;

    .line 2
    .line 3
    const-string v0, "#FFFFFF"

    .line 4
    .line 5
    const-string v1, "#000000"

    .line 6
    .line 7
    const-string v2, "im_anti_recall_enabled"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-static {v2, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    const-string v4, "im_recall_mark_enabled"

    .line 15
    .line 16
    invoke-static {v4, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    new-instance v5, Ldk0;

    .line 21
    .line 22
    const-string v6, "im_time_label_enabled"

    .line 23
    .line 24
    invoke-static {v6, v3}, Lui1;->η(Ljava/lang/String;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v6

    .line 28
    const/4 v12, 0x1

    .line 29
    if-eqz v2, :cond_0

    .line 30
    .line 31
    if-eqz v4, :cond_0

    .line 32
    .line 33
    move v7, v12

    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move v7, v3

    .line 36
    :goto_0
    const-string v2, "im_time_label_format"

    .line 37
    .line 38
    const-string v4, "yyyy-MM-dd HH:mm:ss"

    .line 39
    .line 40
    invoke-static {v2, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-static {v2}, Lhk0;->δ(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v8

    .line 48
    const-string v2, "im_time_label_text"

    .line 49
    .line 50
    const-string v4, "{time}"

    .line 51
    .line 52
    invoke-static {v2, v4}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v2

    .line 56
    invoke-static {v2}, Lhk0;->ε(Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    const-string v2, "im_time_label_light_color"

    .line 61
    .line 62
    invoke-static {v2, v1}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-static {v2, v1}, Lhk0;->γ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v10

    .line 70
    const-string v1, "im_time_label_dark_color"

    .line 71
    .line 72
    invoke-static {v1, v0}, Lui1;->ν(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-static {v1, v0}, Lhk0;->γ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v11

    .line 80
    invoke-direct/range {v5 .. v11}, Ldk0;-><init>(ZZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v5, Lah0;->ν:Ldk0;

    .line 84
    .line 85
    const/4 v1, 0x0

    .line 86
    if-nez v6, :cond_8

    .line 87
    .line 88
    if-eqz v7, :cond_1

    .line 89
    .line 90
    goto/16 :goto_6

    .line 91
    .line 92
    :cond_1
    sget-object v0, Lah0;->ρ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 93
    .line 94
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 95
    .line 96
    .line 97
    move-result-object v0

    .line 98
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-eqz v2, :cond_5

    .line 103
    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 109
    .line 110
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    check-cast v2, Landroid/view/ViewGroup;

    .line 115
    .line 116
    if-nez v2, :cond_3

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_3
    invoke-virtual {v2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 120
    .line 121
    .line 122
    move-result v4

    .line 123
    move v5, v3

    .line 124
    :goto_2
    if-ge v5, v4, :cond_2

    .line 125
    .line 126
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 127
    .line 128
    .line 129
    move-result-object v6

    .line 130
    if-eqz v6, :cond_4

    .line 131
    .line 132
    invoke-static {v6}, Lah0;->η(Landroid/view/View;)V

    .line 133
    .line 134
    .line 135
    :cond_4
    add-int/lit8 v5, v5, 0x1

    .line 136
    .line 137
    goto :goto_2

    .line 138
    :cond_5
    const-string v0, "disabled:"

    .line 139
    .line 140
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    .line 142
    .line 143
    move-result-object p0

    .line 144
    sget-object v2, Lah0;->ι:Ljava/lang/Object;

    .line 145
    .line 146
    monitor-enter v2

    .line 147
    :try_start_0
    sget-object v0, Lah0;->κ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 148
    .line 149
    invoke-static {v0}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v4

    .line 153
    sget-object v5, Lah0;->λ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 154
    .line 155
    invoke-static {v5}, Lxh;->ｅ(Ljava/lang/Iterable;)Ljava/util/List;

    .line 156
    .line 157
    .line 158
    move-result-object v6

    .line 159
    invoke-static {v4, v6}, Lxh;->Х(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    .line 160
    .line 161
    .line 162
    move-result-object v4

    .line 163
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 164
    .line 165
    .line 166
    invoke-virtual {v5}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 167
    .line 168
    .line 169
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 170
    .line 171
    .line 172
    move-result-object v5

    .line 173
    :cond_6
    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 174
    .line 175
    .line 176
    move-result v0

    .line 177
    if-eqz v0, :cond_7

    .line 178
    .line 179
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v0

    .line 183
    check-cast v0, Ll01;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 184
    .line 185
    :try_start_1
    invoke-virtual {v0}, Ll01;->α()V

    .line 186
    .line 187
    .line 188
    sget-object v0, Ls62;->α:Ls62;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 189
    .line 190
    goto :goto_4

    .line 191
    :catchall_0
    move-exception v0

    .line 192
    :try_start_2
    new-instance v6, Leo1;

    .line 193
    .line 194
    invoke-direct {v6, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    move-object v0, v6

    .line 198
    :goto_4
    invoke-static {v0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    if-eqz v0, :cond_6

    .line 203
    .line 204
    const-string v6, "unhook"

    .line 205
    .line 206
    invoke-static {v6, v0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 207
    .line 208
    .line 209
    goto :goto_3

    .line 210
    :catchall_1
    move-exception v0

    .line 211
    move-object p0, v0

    .line 212
    goto :goto_5

    .line 213
    :cond_7
    sget-object v0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 214
    .line 215
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 216
    .line 217
    .line 218
    sget-object v0, Lah0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 219
    .line 220
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 221
    .line 222
    .line 223
    sget-object v0, Lah0;->δ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 224
    .line 225
    invoke-virtual {v0, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    .line 229
    .line 230
    .line 231
    move-result v0

    .line 232
    new-instance v3, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string v4, "feature hooks removed count="

    .line 238
    .line 239
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    const-string v0, " reason="

    .line 246
    .line 247
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 251
    .line 252
    .line 253
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object p0

    .line 257
    const-string v0, "r746360516c14870"

    .line 258
    .line 259
    const/4 v3, 0x4

    .line 260
    invoke-static {v0, p0, v1, v3, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 261
    .line 262
    .line 263
    monitor-exit v2

    .line 264
    return-void

    .line 265
    :goto_5
    monitor-exit v2

    .line 266
    throw p0

    .line 267
    :cond_8
    :goto_6
    sget-object p0, Lah0;->ξ:Ljava/lang/ClassLoader;

    .line 268
    .line 269
    if-nez p0, :cond_9

    .line 270
    .line 271
    return-void

    .line 272
    :cond_9
    sget-object v0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 275
    .line 276
    .line 277
    move-result v0

    .line 278
    if-eqz v0, :cond_a

    .line 279
    .line 280
    move v0, v12

    .line 281
    goto :goto_a

    .line 282
    :cond_a
    :try_start_3
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 283
    .line 284
    const-string v0, "~78BBAA042CD8BAA2073ADC6B9996030F9A590BEBC2C973FA8B68022FEB1363311D25B705764E55B8AABAF59A8850E3BC8893FDC62DE2C89437BCF5FF344B9B8120F3B930AC1E3CEF212579"

    .line 285
    .line 286
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    invoke-static {p0, v0}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 291
    .line 292
    .line 293
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 294
    goto :goto_7

    .line 295
    :catchall_2
    move-exception v0

    .line 296
    new-instance v2, Leo1;

    .line 297
    .line 298
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 299
    .line 300
    .line 301
    move-object v0, v2

    .line 302
    :goto_7
    instance-of v2, v0, Leo1;

    .line 303
    .line 304
    if-eqz v2, :cond_b

    .line 305
    .line 306
    goto :goto_8

    .line 307
    :cond_b
    move-object v1, v0

    .line 308
    :goto_8
    check-cast v1, Ljava/lang/Class;

    .line 309
    .line 310
    if-nez v1, :cond_c

    .line 311
    .line 312
    :goto_9
    move v0, v3

    .line 313
    goto :goto_a

    .line 314
    :cond_c
    invoke-static {v1}, Lah0;->Κ(Ljava/lang/Class;)Z

    .line 315
    .line 316
    .line 317
    move-result v0

    .line 318
    if-nez v0, :cond_d

    .line 319
    .line 320
    goto :goto_9

    .line 321
    :cond_d
    invoke-static {v1}, Lah0;->Ε(Ljava/lang/Class;)Z

    .line 322
    .line 323
    .line 324
    move-result v0

    .line 325
    :goto_a
    if-nez v0, :cond_14

    .line 326
    .line 327
    sget-object v1, Lah0;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 328
    .line 329
    invoke-static {}, Lah0;->Θ()Z

    .line 330
    .line 331
    .line 332
    move-result v0

    .line 333
    if-eqz v0, :cond_14

    .line 334
    .line 335
    sget-object v0, Lah0;->ε:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 336
    .line 337
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 338
    .line 339
    .line 340
    move-result v2

    .line 341
    if-eqz v2, :cond_e

    .line 342
    .line 343
    goto/16 :goto_f

    .line 344
    .line 345
    :cond_e
    invoke-virtual {v1, v3, v12}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 346
    .line 347
    .line 348
    move-result v2

    .line 349
    if-nez v2, :cond_f

    .line 350
    .line 351
    goto/16 :goto_f

    .line 352
    .line 353
    :cond_f
    new-instance v2, Ljava/util/ArrayList;

    .line 354
    .line 355
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 356
    .line 357
    .line 358
    :try_start_4
    const-string v4, "androidx.recyclerview.widget.RecyclerView"

    .line 359
    .line 360
    invoke-static {p0, v4}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 361
    .line 362
    .line 363
    move-result-object v4

    .line 364
    const-string v5, "androidx.recyclerview.widget.RecyclerView$Adapter"

    .line 365
    .line 366
    invoke-static {p0, v5}, Lqe0;->θ(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 367
    .line 368
    .line 369
    move-result-object p0

    .line 370
    sget-object v5, Lxq0;->α:Lxq0;

    .line 371
    .line 372
    const-string v6, "onAttachedToRecyclerView"

    .line 373
    .line 374
    new-instance v7, Lf10;

    .line 375
    .line 376
    const/16 v8, 0x19

    .line 377
    .line 378
    invoke-direct {v7, v8}, Lf10;-><init>(I)V

    .line 379
    .line 380
    .line 381
    invoke-virtual {v5, p0, v6, v7}, Lxq0;->γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;

    .line 382
    .line 383
    .line 384
    move-result-object v5

    .line 385
    check-cast v5, Ljava/util/Collection;

    .line 386
    .line 387
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 388
    .line 389
    .line 390
    const-string v5, "setAdapter"

    .line 391
    .line 392
    new-instance v6, Lf10;

    .line 393
    .line 394
    const/16 v7, 0x1a

    .line 395
    .line 396
    invoke-direct {v6, v7}, Lf10;-><init>(I)V

    .line 397
    .line 398
    .line 399
    filled-new-array {p0, v6}, [Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    move-result-object p0

    .line 403
    invoke-static {v4, v5, p0}, Lqe0;->ε(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ll01;

    .line 404
    .line 405
    .line 406
    move-result-object p0

    .line 407
    invoke-virtual {v2, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 408
    .line 409
    .line 410
    invoke-static {}, Lah0;->Θ()Z

    .line 411
    .line 412
    .line 413
    move-result p0

    .line 414
    if-eqz p0, :cond_11

    .line 415
    .line 416
    invoke-virtual {v0}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 417
    .line 418
    .line 419
    move-result p0

    .line 420
    if-eqz p0, :cond_10

    .line 421
    .line 422
    goto :goto_b

    .line 423
    :cond_10
    sget-object p0, Lah0;->λ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 424
    .line 425
    invoke-virtual {p0, v2}, Ljava/util/concurrent/CopyOnWriteArrayList;->addAll(Ljava/util/Collection;)Z

    .line 426
    .line 427
    .line 428
    goto :goto_f

    .line 429
    :catchall_3
    move-exception v0

    .line 430
    move-object p0, v0

    .line 431
    goto :goto_d

    .line 432
    :cond_11
    :goto_b
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 433
    .line 434
    .line 435
    move-result-object p0

    .line 436
    :goto_c
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 437
    .line 438
    .line 439
    move-result v0

    .line 440
    if-eqz v0, :cond_12

    .line 441
    .line 442
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 443
    .line 444
    .line 445
    move-result-object v0

    .line 446
    check-cast v0, Ll01;

    .line 447
    .line 448
    invoke-virtual {v0}, Ll01;->α()V

    .line 449
    .line 450
    .line 451
    goto :goto_c

    .line 452
    :cond_12
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 453
    .line 454
    .line 455
    goto :goto_f

    .line 456
    :goto_d
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 457
    .line 458
    .line 459
    move-result-object v0

    .line 460
    :catchall_4
    :goto_e
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 461
    .line 462
    .line 463
    move-result v2

    .line 464
    if-eqz v2, :cond_13

    .line 465
    .line 466
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 467
    .line 468
    .line 469
    move-result-object v2

    .line 470
    check-cast v2, Ll01;

    .line 471
    .line 472
    :try_start_5
    invoke-virtual {v2}, Ll01;->α()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 473
    .line 474
    .line 475
    goto :goto_e

    .line 476
    :cond_13
    invoke-virtual {v1, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 477
    .line 478
    .line 479
    const-string v0, "install-lazy-entry"

    .line 480
    .line 481
    invoke-static {v0, p0}, Lah0;->Ψ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 482
    .line 483
    .line 484
    :cond_14
    :goto_f
    invoke-static {}, Lah0;->κ()V

    .line 485
    .line 486
    .line 487
    sget-object p0, Lah0;->α:Landroid/os/Handler;

    .line 488
    .line 489
    new-instance v0, Lfb0;

    .line 490
    .line 491
    const/4 v1, 0x2

    .line 492
    invoke-direct {v0, v1}, Lfb0;-><init>(I)V

    .line 493
    .line 494
    .line 495
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 496
    .line 497
    .line 498
    return-void
.end method
