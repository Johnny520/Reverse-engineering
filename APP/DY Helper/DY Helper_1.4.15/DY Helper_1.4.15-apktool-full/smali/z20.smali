.class public final Lz20;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lz20;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final δ:Ljava/util/concurrent/CopyOnWriteArrayList;

.field public static volatile ε:Ljava/lang/ClassLoader;

.field public static volatile ζ:Ljava/lang/Class;

.field public static volatile η:Ljava/lang/Class;

.field public static final θ:Ljava/util/Map;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lz20;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lz20;->α:Lz20;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lz20;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 17
    .line 18
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 19
    .line 20
    .line 21
    sput-object v0, Lz20;->γ:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 24
    .line 25
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 26
    .line 27
    .line 28
    sput-object v0, Lz20;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 29
    .line 30
    new-instance v0, Ly20;

    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    sput-object v0, Lz20;->θ:Ljava/util/Map;

    .line 40
    .line 41
    return-void
.end method

.method public static final α(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lu20;

    .line 16
    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-direct {v0, p0, p1, v1}, Lu20;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;I)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 22
    .line 23
    .line 24
    return-void

    .line 25
    :cond_0
    new-instance v0, Lu20;

    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-direct {v0, p0, p1, v1}, Lu20;-><init>(Landroid/view/ViewGroup;Ljava/lang/String;I)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 32
    .line 33
    .line 34
    return-void
.end method

.method public static β(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 2

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
    invoke-static {p0, v0}, Llz1;->ι(Ljava/lang/Class;Ljava/util/ArrayList;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    return-object v0
.end method

.method public static γ(Landroid/content/Context;F)I
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v0, 0x1

    .line 10
    invoke-static {v0, p1, p0}, Landroid/util/TypedValue;->applyDimension(IFLandroid/util/DisplayMetrics;)F

    .line 11
    .line 12
    .line 13
    move-result p0

    .line 14
    float-to-int p0, p0

    .line 15
    return p0
.end method

.method public static final δ(Ljava/lang/Class;Ljava/util/Set;Ljava/lang/Object;I)Ljava/lang/Object;
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_4

    .line 5
    .line 6
    :cond_0
    const/4 v1, 0x4

    .line 7
    if-le p3, v1, :cond_1

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_1
    invoke-virtual {p0, p2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_2

    .line 16
    .line 17
    return-object p2

    .line 18
    :cond_2
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    const-string v3, "java."

    .line 27
    .line 28
    const/4 v4, 0x0

    .line 29
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 30
    .line 31
    .line 32
    move-result v2

    .line 33
    if-nez v2, :cond_10

    .line 34
    .line 35
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v2

    .line 39
    const-string v3, "android."

    .line 40
    .line 41
    invoke-static {v2, v3, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    instance-of v2, p2, Landroid/view/View;

    .line 48
    .line 49
    if-nez v2, :cond_3

    .line 50
    .line 51
    goto/16 :goto_4

    .line 52
    .line 53
    :cond_3
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-nez v2, :cond_4

    .line 58
    .line 59
    goto/16 :goto_4

    .line 60
    .line 61
    :cond_4
    invoke-static {v1}, Lz20;->β(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    :cond_5
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    if-eqz v2, :cond_10

    .line 74
    .line 75
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    check-cast v2, Ljava/lang/reflect/Field;

    .line 80
    .line 81
    const/4 v3, 0x1

    .line 82
    :try_start_0
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {v2, p2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    goto :goto_1

    .line 90
    :catchall_0
    move-exception v2

    .line 91
    new-instance v5, Leo1;

    .line 92
    .line 93
    invoke-direct {v5, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    move-object v2, v5

    .line 97
    :goto_1
    instance-of v5, v2, Leo1;

    .line 98
    .line 99
    if-eqz v5, :cond_6

    .line 100
    .line 101
    move-object v2, v0

    .line 102
    :cond_6
    if-nez v2, :cond_7

    .line 103
    .line 104
    goto :goto_0

    .line 105
    :cond_7
    invoke-virtual {p0, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    move-result v5

    .line 109
    if-eqz v5, :cond_8

    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_8
    instance-of v5, v2, Ljava/util/Collection;

    .line 113
    .line 114
    if-eqz v5, :cond_b

    .line 115
    .line 116
    move-object v5, v2

    .line 117
    check-cast v5, Ljava/lang/Iterable;

    .line 118
    .line 119
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    :cond_9
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    .line 125
    .line 126
    move-result v6

    .line 127
    if-eqz v6, :cond_a

    .line 128
    .line 129
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    move-result-object v6

    .line 133
    invoke-virtual {p0, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v7

    .line 137
    if-eqz v7, :cond_9

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_a
    move-object v6, v0

    .line 141
    :goto_2
    if-eqz v6, :cond_b

    .line 142
    .line 143
    return-object v6

    .line 144
    :cond_b
    instance-of v5, v2, Ljava/util/Map;

    .line 145
    .line 146
    if-eqz v5, :cond_e

    .line 147
    .line 148
    move-object v5, v2

    .line 149
    check-cast v5, Ljava/util/Map;

    .line 150
    .line 151
    invoke-interface {v5}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 152
    .line 153
    .line 154
    move-result-object v5

    .line 155
    check-cast v5, Ljava/lang/Iterable;

    .line 156
    .line 157
    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v5

    .line 161
    :cond_c
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v6

    .line 165
    if-eqz v6, :cond_d

    .line 166
    .line 167
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v6

    .line 171
    invoke-virtual {p0, v6}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 172
    .line 173
    .line 174
    move-result v7

    .line 175
    if-eqz v7, :cond_c

    .line 176
    .line 177
    goto :goto_3

    .line 178
    :cond_d
    move-object v6, v0

    .line 179
    :goto_3
    if-eqz v6, :cond_e

    .line 180
    .line 181
    return-object v6

    .line 182
    :cond_e
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 187
    .line 188
    .line 189
    move-result-object v5

    .line 190
    const-string v6, "~79F5E25B4ED201D89B6CE77FECC600ECA88AB6F7485F4A97"

    .line 191
    .line 192
    invoke-static {v6}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v6

    .line 196
    invoke-static {v5, v6, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    if-nez v6, :cond_f

    .line 201
    .line 202
    const-string v6, "X."

    .line 203
    .line 204
    invoke-static {v5, v6, v4}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 205
    .line 206
    .line 207
    move-result v5

    .line 208
    if-eqz v5, :cond_5

    .line 209
    .line 210
    :cond_f
    add-int/2addr v3, p3

    .line 211
    invoke-static {p0, p1, v2, v3}, Lz20;->δ(Ljava/lang/Class;Ljava/util/Set;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 212
    .line 213
    .line 214
    move-result-object v2

    .line 215
    if-eqz v2, :cond_5

    .line 216
    .line 217
    return-object v2

    .line 218
    :cond_10
    :goto_4
    return-object v0
.end method

.method public static final ε(Lsm1;Ljava/lang/Class;Landroid/view/View;I)Ljava/lang/Object;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    const/16 v1, 0x12

    .line 7
    .line 8
    if-le p3, v1, :cond_1

    .line 9
    .line 10
    goto/16 :goto_3

    .line 11
    .line 12
    :cond_1
    iget v1, p0, Lsm1;->ε:I

    .line 13
    .line 14
    add-int/lit8 v2, v1, 0x1

    .line 15
    .line 16
    iput v2, p0, Lsm1;->ε:I

    .line 17
    .line 18
    const/16 v2, 0x384

    .line 19
    .line 20
    if-le v1, v2, :cond_2

    .line 21
    .line 22
    goto/16 :goto_3

    .line 23
    .line 24
    :cond_2
    :try_start_0
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v1

    .line 30
    new-instance v2, Leo1;

    .line 31
    .line 32
    invoke-direct {v2, v1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    move-object v1, v2

    .line 36
    :goto_0
    instance-of v2, v1, Leo1;

    .line 37
    .line 38
    if-eqz v2, :cond_3

    .line 39
    .line 40
    move-object v1, v0

    .line 41
    :cond_3
    if-eqz v1, :cond_7

    .line 42
    .line 43
    invoke-virtual {p1, v1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v2

    .line 47
    if-eqz v2, :cond_4

    .line 48
    .line 49
    return-object v1

    .line 50
    :cond_4
    instance-of v2, v1, Ljava/util/Map;

    .line 51
    .line 52
    if-eqz v2, :cond_7

    .line 53
    .line 54
    check-cast v1, Ljava/util/Map;

    .line 55
    .line 56
    invoke-interface {v1}, Ljava/util/Map;->values()Ljava/util/Collection;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    check-cast v1, Ljava/lang/Iterable;

    .line 61
    .line 62
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 67
    .line 68
    .line 69
    move-result v2

    .line 70
    if-eqz v2, :cond_6

    .line 71
    .line 72
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-virtual {p1, v2}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v3

    .line 80
    if-eqz v3, :cond_5

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_6
    move-object v2, v0

    .line 84
    :goto_1
    if-eqz v2, :cond_7

    .line 85
    .line 86
    return-object v2

    .line 87
    :cond_7
    new-instance v1, Ljava/util/IdentityHashMap;

    .line 88
    .line 89
    invoke-direct {v1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 90
    .line 91
    .line 92
    invoke-static {v1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    const/4 v2, 0x0

    .line 97
    invoke-static {p1, v1, p2, v2}, Lz20;->δ(Ljava/lang/Class;Ljava/util/Set;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 98
    .line 99
    .line 100
    move-result-object v1

    .line 101
    if-eqz v1, :cond_8

    .line 102
    .line 103
    return-object v1

    .line 104
    :cond_8
    instance-of v1, p2, Landroid/view/ViewGroup;

    .line 105
    .line 106
    if-eqz v1, :cond_a

    .line 107
    .line 108
    check-cast p2, Landroid/view/ViewGroup;

    .line 109
    .line 110
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 111
    .line 112
    .line 113
    move-result v1

    .line 114
    :goto_2
    if-ge v2, v1, :cond_a

    .line 115
    .line 116
    invoke-virtual {p2, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 117
    .line 118
    .line 119
    move-result-object v3

    .line 120
    add-int/lit8 v4, p3, 0x1

    .line 121
    .line 122
    invoke-static {p0, p1, v3, v4}, Lz20;->ε(Lsm1;Ljava/lang/Class;Landroid/view/View;I)Ljava/lang/Object;

    .line 123
    .line 124
    .line 125
    move-result-object v3

    .line 126
    if-eqz v3, :cond_9

    .line 127
    .line 128
    return-object v3

    .line 129
    :cond_9
    add-int/lit8 v2, v2, 0x1

    .line 130
    .line 131
    goto :goto_2

    .line 132
    :cond_a
    :goto_3
    return-object v0
.end method

.method public static ζ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;
    .locals 4

    .line 1
    const-string v0, "dyhelper_right_button:"

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_0
    const/4 v2, 0x0

    .line 13
    if-ge v1, v0, :cond_2

    .line 14
    .line 15
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    if-eqz v3, :cond_0

    .line 20
    .line 21
    invoke-virtual {v3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_0
    invoke-static {v2, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v2

    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    return-object v3

    .line 32
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    return-object v2
.end method

.method public static η(Landroid/view/View;)Landroid/widget/ImageView;
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/widget/ImageView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/widget/ImageView;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lz20;->η(Landroid/view/View;)Landroid/widget/ImageView;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static θ(Landroid/view/View;)Landroid/widget/TextView;
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    return-object p0

    .line 8
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    check-cast p0, Landroid/view/ViewGroup;

    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    if-ge v1, v0, :cond_2

    .line 20
    .line 21
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lz20;->θ(Landroid/view/View;)Landroid/widget/TextView;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    return-object v2

    .line 35
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static final ι(Landroid/view/View;I)Landroid/widget/LinearLayout;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x5

    .line 6
    if-le p1, v1, :cond_1

    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_1
    instance-of v1, p0, Landroid/widget/LinearLayout;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    move-object v1, p0

    .line 15
    check-cast v1, Landroid/widget/LinearLayout;

    .line 16
    .line 17
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-nez v3, :cond_2

    .line 22
    .line 23
    invoke-virtual {v1}, Landroid/widget/LinearLayout;->getOrientation()I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    if-ne v3, v2, :cond_2

    .line 28
    .line 29
    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    const/16 v4, 0x96

    .line 34
    .line 35
    if-gt v4, v3, :cond_2

    .line 36
    .line 37
    const/16 v5, 0xf1

    .line 38
    .line 39
    if-ge v3, v5, :cond_2

    .line 40
    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getHeight()I

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-gt v4, v3, :cond_2

    .line 46
    .line 47
    const/16 v4, 0x105

    .line 48
    .line 49
    if-ge v3, v4, :cond_2

    .line 50
    .line 51
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 52
    .line 53
    .line 54
    move-result v3

    .line 55
    const/4 v4, 0x2

    .line 56
    if-lt v3, v4, :cond_2

    .line 57
    .line 58
    return-object v1

    .line 59
    :cond_2
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 60
    .line 61
    if-eqz v1, :cond_4

    .line 62
    .line 63
    check-cast p0, Landroid/view/ViewGroup;

    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 66
    .line 67
    .line 68
    move-result v1

    .line 69
    const/4 v3, 0x0

    .line 70
    :goto_0
    if-ge v3, v1, :cond_4

    .line 71
    .line 72
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 73
    .line 74
    .line 75
    move-result-object v4

    .line 76
    add-int/lit8 v5, p1, 0x1

    .line 77
    .line 78
    invoke-static {v4, v5}, Lz20;->ι(Landroid/view/View;I)Landroid/widget/LinearLayout;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    if-eqz v4, :cond_3

    .line 83
    .line 84
    return-object v4

    .line 85
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    return-object v0
.end method

.method public static κ(Landroid/view/View;Ljava/lang/String;Ljava/lang/Class;)Landroid/view/View;
    .locals 3

    .line 1
    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0, p1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    invoke-virtual {p2, p0}, Ljava/lang/Class;->cast(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    check-cast p0, Landroid/view/View;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    check-cast p0, Landroid/view/ViewGroup;

    .line 29
    .line 30
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    const/4 v1, 0x0

    .line 35
    :goto_0
    if-ge v1, v0, :cond_2

    .line 36
    .line 37
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v2, p1, p2}, Lz20;->κ(Landroid/view/View;Ljava/lang/String;Ljava/lang/Class;)Landroid/view/View;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    if-eqz v2, :cond_1

    .line 49
    .line 50
    return-object v2

    .line 51
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 52
    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const/4 p0, 0x0

    .line 55
    return-object p0
.end method

.method public static final λ(Landroid/view/View;I)Landroid/view/View;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    const/4 v0, 0x5

    .line 5
    if-le p1, v0, :cond_1

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    return-object p0

    .line 13
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-string v1, "TextSwitcher"

    .line 22
    .line 23
    const/4 v2, 0x0

    .line 24
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-nez v0, :cond_6

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "DuxTextView"

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lq02;->Υ(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    goto :goto_2

    .line 47
    :cond_3
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 48
    .line 49
    if-eqz v0, :cond_5

    .line 50
    .line 51
    check-cast p0, Landroid/view/ViewGroup;

    .line 52
    .line 53
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 54
    .line 55
    .line 56
    move-result v0

    .line 57
    :goto_0
    if-ge v2, v0, :cond_5

    .line 58
    .line 59
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    add-int/lit8 v3, p1, 0x1

    .line 64
    .line 65
    invoke-static {v1, v3}, Lz20;->λ(Landroid/view/View;I)Landroid/view/View;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    if-eqz v1, :cond_4

    .line 70
    .line 71
    return-object v1

    .line 72
    :cond_4
    add-int/lit8 v2, v2, 0x1

    .line 73
    .line 74
    goto :goto_0

    .line 75
    :cond_5
    :goto_1
    const/4 p0, 0x0

    .line 76
    :cond_6
    :goto_2
    return-object p0
.end method

.method public static μ(Landroid/view/ViewGroup;Ljava/util/Set;)I
    .locals 2

    .line 1
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    check-cast p1, Ljava/lang/Iterable;

    .line 6
    .line 7
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Landroid/view/View;

    .line 22
    .line 23
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-ltz v1, :cond_0

    .line 28
    .line 29
    if-ge v1, v0, :cond_0

    .line 30
    .line 31
    move v0, v1

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    return v0
.end method

.method public static ν(Landroid/view/ViewGroup;Ljava/lang/String;)V
    .locals 30

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    sget-object v2, Ls62;->α:Ls62;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :goto_0
    if-eqz v0, :cond_51

    .line 10
    .line 11
    const-class v3, Landroid/view/View;

    .line 12
    .line 13
    invoke-virtual {v0, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v4

    .line 17
    if-nez v4, :cond_51

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    const-string v5, "~7958639020ABF95155FECBEFEE807165BD4E6AA9062C97DCAC477B07F2CC5FA3D6AA2F8632C81877EA9DEE34649246A2C86F42"

    .line 24
    .line 25
    invoke-static {v5}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    const/4 v6, 0x0

    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    const-string v5, ".FeedRightScaleView"

    .line 37
    .line 38
    invoke-static {v4, v5, v6}, Lx02;->Ι(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-eqz v4, :cond_0

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    goto :goto_0

    .line 50
    :cond_1
    :goto_1
    new-instance v4, Ljava/util/ArrayList;

    .line 51
    .line 52
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 53
    .line 54
    .line 55
    sget-object v0, Lz20;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    :cond_2
    :goto_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 62
    .line 63
    .line 64
    move-result v0

    .line 65
    if-eqz v0, :cond_4

    .line 66
    .line 67
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    move-object v0, v7

    .line 72
    check-cast v0, Lv20;

    .line 73
    .line 74
    :try_start_0
    iget-object v0, v0, Lv20;->δ:Lp70;

    .line 75
    .line 76
    invoke-interface {v0}, Lp70;->invoke()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    check-cast v0, Ljava/lang/Boolean;

    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    .line 84
    .line 85
    goto :goto_3

    .line 86
    :catchall_0
    move-exception v0

    .line 87
    new-instance v8, Leo1;

    .line 88
    .line 89
    invoke-direct {v8, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    move-object v0, v8

    .line 93
    :goto_3
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 94
    .line 95
    instance-of v9, v0, Leo1;

    .line 96
    .line 97
    if-eqz v9, :cond_3

    .line 98
    .line 99
    move-object v0, v8

    .line 100
    :cond_3
    check-cast v0, Ljava/lang/Boolean;

    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_2

    .line 107
    .line 108
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    goto :goto_2

    .line 112
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 113
    .line 114
    const/16 v5, 0xa

    .line 115
    .line 116
    invoke-static {v4, v5}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    invoke-direct {v0, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 124
    .line 125
    .line 126
    move-result-object v7

    .line 127
    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    .line 128
    .line 129
    .line 130
    move-result v8

    .line 131
    if-eqz v8, :cond_5

    .line 132
    .line 133
    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 134
    .line 135
    .line 136
    move-result-object v8

    .line 137
    check-cast v8, Lv20;

    .line 138
    .line 139
    iget-object v8, v8, Lv20;->α:Ljava/lang/String;

    .line 140
    .line 141
    invoke-virtual {v0, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 142
    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_5
    invoke-static {v0}, Lxh;->ｊ(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 146
    .line 147
    .line 148
    move-result-object v0

    .line 149
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 150
    .line 151
    .line 152
    move-result v7

    .line 153
    const/4 v8, 0x1

    .line 154
    sub-int/2addr v7, v8

    .line 155
    :goto_5
    const-string v9, "dyhelper_right_button:"

    .line 156
    .line 157
    const/4 v10, -0x1

    .line 158
    const/4 v11, 0x0

    .line 159
    if-ge v10, v7, :cond_a

    .line 160
    .line 161
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 162
    .line 163
    .line 164
    move-result-object v10

    .line 165
    if-nez v10, :cond_6

    .line 166
    .line 167
    goto :goto_6

    .line 168
    :cond_6
    invoke-virtual {v10}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v10

    .line 172
    instance-of v12, v10, Ljava/lang/String;

    .line 173
    .line 174
    if-eqz v12, :cond_7

    .line 175
    .line 176
    move-object v11, v10

    .line 177
    check-cast v11, Ljava/lang/String;

    .line 178
    .line 179
    :cond_7
    if-nez v11, :cond_8

    .line 180
    .line 181
    goto :goto_6

    .line 182
    :cond_8
    invoke-static {v11, v9, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 183
    .line 184
    .line 185
    move-result v10

    .line 186
    if-eqz v10, :cond_9

    .line 187
    .line 188
    invoke-static {v11, v9}, Lq02;->н(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v9

    .line 192
    invoke-interface {v0, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 193
    .line 194
    .line 195
    move-result v9

    .line 196
    if-nez v9, :cond_9

    .line 197
    .line 198
    invoke-virtual {v1, v7}, Landroid/view/ViewGroup;->removeViewAt(I)V

    .line 199
    .line 200
    .line 201
    :cond_9
    :goto_6
    add-int/lit8 v7, v7, -0x1

    .line 202
    .line 203
    goto :goto_5

    .line 204
    :cond_a
    invoke-virtual {v4}, Ljava/util/ArrayList;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result v0

    .line 208
    if-eqz v0, :cond_b

    .line 209
    .line 210
    goto/16 :goto_3d

    .line 211
    .line 212
    :cond_b
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 213
    .line 214
    .line 215
    move-result-object v7

    .line 216
    if-nez v7, :cond_c

    .line 217
    .line 218
    goto/16 :goto_3d

    .line 219
    .line 220
    :cond_c
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 221
    .line 222
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 223
    .line 224
    .line 225
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 226
    .line 227
    .line 228
    move-result-object v12

    .line 229
    :try_start_1
    sget-object v0, Leh;->α:Leh;

    .line 230
    .line 231
    invoke-static {}, Leh;->α()Ljava/util/ArrayList;

    .line 232
    .line 233
    .line 234
    move-result-object v0

    .line 235
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    :cond_d
    :goto_7
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 240
    .line 241
    .line 242
    move-result v13

    .line 243
    if-eqz v13, :cond_11

    .line 244
    .line 245
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 246
    .line 247
    .line 248
    move-result-object v13

    .line 249
    check-cast v13, Landroid/view/View;

    .line 250
    .line 251
    move v14, v6

    .line 252
    :goto_8
    if-eqz v13, :cond_10

    .line 253
    .line 254
    const/16 v15, 0x18

    .line 255
    .line 256
    if-ge v14, v15, :cond_10

    .line 257
    .line 258
    invoke-virtual {v13}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 259
    .line 260
    .line 261
    move-result-object v15

    .line 262
    if-ne v15, v1, :cond_e

    .line 263
    .line 264
    goto :goto_a

    .line 265
    :cond_e
    instance-of v13, v15, Landroid/view/View;

    .line 266
    .line 267
    if-eqz v13, :cond_f

    .line 268
    .line 269
    check-cast v15, Landroid/view/View;

    .line 270
    .line 271
    move-object v13, v15

    .line 272
    goto :goto_9

    .line 273
    :cond_f
    move-object v13, v11

    .line 274
    :goto_9
    add-int/lit8 v14, v14, 0x1

    .line 275
    .line 276
    goto :goto_8

    .line 277
    :cond_10
    move-object v13, v11

    .line 278
    :goto_a
    if-eqz v13, :cond_d

    .line 279
    .line 280
    invoke-interface {v12, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 281
    .line 282
    .line 283
    goto :goto_7

    .line 284
    :catchall_1
    move-exception v0

    .line 285
    goto :goto_b

    .line 286
    :cond_11
    move-object v13, v2

    .line 287
    goto :goto_c

    .line 288
    :goto_b
    new-instance v13, Leo1;

    .line 289
    .line 290
    invoke-direct {v13, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 291
    .line 292
    .line 293
    :goto_c
    invoke-static {v13}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 294
    .line 295
    .line 296
    move-result-object v0

    .line 297
    const/4 v13, 0x4

    .line 298
    const-string v14, "FeedRightButtonManager"

    .line 299
    .line 300
    if-eqz v0, :cond_12

    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object v0

    .line 306
    const-string v15, "\u8bfb\u53d6\u5531\u7247\u5c3e\u90e8\u951a\u70b9\u5931\u8d25\uff0c\u4fdd\u7559\u5bbf\u4e3b\u5f53\u524d\u987a\u5e8f: "

    .line 307
    .line 308
    invoke-static {v15, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 309
    .line 310
    .line 311
    move-result-object v0

    .line 312
    invoke-static {v14, v0, v11, v13, v11}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 313
    .line 314
    .line 315
    :cond_12
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 316
    .line 317
    .line 318
    move-result v0

    .line 319
    move v15, v6

    .line 320
    :goto_d
    if-ge v15, v0, :cond_16

    .line 321
    .line 322
    invoke-virtual {v1, v15}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 323
    .line 324
    .line 325
    move-result-object v5

    .line 326
    if-nez v5, :cond_14

    .line 327
    .line 328
    :cond_13
    move/from16 v19, v8

    .line 329
    .line 330
    goto :goto_f

    .line 331
    :cond_14
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 332
    .line 333
    .line 334
    move-result-object v16

    .line 335
    move-object/from16 v11, v16

    .line 336
    .line 337
    :goto_e
    if-eqz v11, :cond_13

    .line 338
    .line 339
    invoke-virtual {v11, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 340
    .line 341
    .line 342
    move-result v16

    .line 343
    if-nez v16, :cond_13

    .line 344
    .line 345
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 346
    .line 347
    .line 348
    move-result-object v13

    .line 349
    const-string v18, "~7883762E03D36847EFF3BA0793C09F8E02F6EC9E30B4641E11171B5DA0BE514FE985D742D83AAE78638743D2BA3687C926224D31E60992AEED40D196DAE2A28FB8E8F48913"

    .line 350
    .line 351
    move/from16 v19, v8

    .line 352
    .line 353
    invoke-static/range {v18 .. v18}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 354
    .line 355
    .line 356
    move-result-object v8

    .line 357
    invoke-virtual {v13, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 358
    .line 359
    .line 360
    move-result v8

    .line 361
    if-eqz v8, :cond_15

    .line 362
    .line 363
    invoke-interface {v12, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 364
    .line 365
    .line 366
    goto :goto_f

    .line 367
    :cond_15
    invoke-virtual {v11}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 368
    .line 369
    .line 370
    move-result-object v11

    .line 371
    move/from16 v8, v19

    .line 372
    .line 373
    const/4 v13, 0x4

    .line 374
    goto :goto_e

    .line 375
    :goto_f
    add-int/lit8 v15, v15, 0x1

    .line 376
    .line 377
    move/from16 v8, v19

    .line 378
    .line 379
    const/16 v5, 0xa

    .line 380
    .line 381
    const/4 v11, 0x0

    .line 382
    const/4 v13, 0x4

    .line 383
    goto :goto_d

    .line 384
    :cond_16
    move/from16 v19, v8

    .line 385
    .line 386
    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 387
    .line 388
    .line 389
    new-instance v0, Ljava/util/ArrayList;

    .line 390
    .line 391
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 395
    .line 396
    .line 397
    move-result-object v3

    .line 398
    :goto_10
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 399
    .line 400
    .line 401
    move-result v5

    .line 402
    if-eqz v5, :cond_18

    .line 403
    .line 404
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 405
    .line 406
    .line 407
    move-result-object v5

    .line 408
    check-cast v5, Lv20;

    .line 409
    .line 410
    iget-object v8, v5, Lv20;->α:Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v1, v8}, Lz20;->ζ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 413
    .line 414
    .line 415
    move-result-object v8

    .line 416
    if-eqz v8, :cond_17

    .line 417
    .line 418
    invoke-static {v8, v5}, Lz20;->σ(Landroid/view/View;Lv20;)V

    .line 419
    .line 420
    .line 421
    goto :goto_10

    .line 422
    :cond_17
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 423
    .line 424
    .line 425
    goto :goto_10

    .line 426
    :cond_18
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 427
    .line 428
    .line 429
    move-result v3

    .line 430
    if-nez v3, :cond_24

    .line 431
    .line 432
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 433
    .line 434
    .line 435
    move-result v3

    .line 436
    add-int/lit8 v3, v3, -0x1

    .line 437
    .line 438
    :goto_11
    if-ge v10, v3, :cond_23

    .line 439
    .line 440
    invoke-virtual {v1, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 441
    .line 442
    .line 443
    move-result-object v5

    .line 444
    if-nez v5, :cond_1a

    .line 445
    .line 446
    :cond_19
    :goto_12
    move-object/from16 v26, v0

    .line 447
    .line 448
    move-object/from16 v27, v2

    .line 449
    .line 450
    move-object/from16 v28, v4

    .line 451
    .line 452
    move-object/from16 v29, v12

    .line 453
    .line 454
    goto/16 :goto_18

    .line 455
    .line 456
    :cond_1a
    invoke-virtual {v5}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 457
    .line 458
    .line 459
    move-result-object v8

    .line 460
    instance-of v11, v8, Ljava/lang/String;

    .line 461
    .line 462
    if-eqz v11, :cond_1b

    .line 463
    .line 464
    check-cast v8, Ljava/lang/String;

    .line 465
    .line 466
    goto :goto_13

    .line 467
    :cond_1b
    const/4 v8, 0x0

    .line 468
    :goto_13
    if-eqz v8, :cond_1c

    .line 469
    .line 470
    invoke-static {v8, v9, v6}, Lx02;->Ο(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 471
    .line 472
    .line 473
    move-result v8

    .line 474
    move/from16 v11, v19

    .line 475
    .line 476
    if-ne v8, v11, :cond_1c

    .line 477
    .line 478
    goto :goto_12

    .line 479
    :cond_1c
    invoke-interface {v12, v5}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 480
    .line 481
    .line 482
    move-result v8

    .line 483
    if-nez v8, :cond_19

    .line 484
    .line 485
    invoke-virtual {v5}, Landroid/view/View;->getVisibility()I

    .line 486
    .line 487
    .line 488
    move-result v8

    .line 489
    if-nez v8, :cond_19

    .line 490
    .line 491
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 492
    .line 493
    .line 494
    move-result v8

    .line 495
    if-lez v8, :cond_19

    .line 496
    .line 497
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 498
    .line 499
    .line 500
    move-result v8

    .line 501
    if-gtz v8, :cond_1d

    .line 502
    .line 503
    goto :goto_12

    .line 504
    :cond_1d
    instance-of v8, v5, Landroid/view/ViewGroup;

    .line 505
    .line 506
    if-eqz v8, :cond_1e

    .line 507
    .line 508
    check-cast v5, Landroid/view/ViewGroup;

    .line 509
    .line 510
    goto :goto_14

    .line 511
    :cond_1e
    const/4 v5, 0x0

    .line 512
    :goto_14
    if-nez v5, :cond_1f

    .line 513
    .line 514
    goto :goto_12

    .line 515
    :cond_1f
    invoke-static {v5, v6}, Lz20;->ι(Landroid/view/View;I)Landroid/widget/LinearLayout;

    .line 516
    .line 517
    .line 518
    move-result-object v8

    .line 519
    if-nez v8, :cond_20

    .line 520
    .line 521
    goto :goto_12

    .line 522
    :cond_20
    invoke-static {v8}, Lz20;->η(Landroid/view/View;)Landroid/widget/ImageView;

    .line 523
    .line 524
    .line 525
    move-result-object v23

    .line 526
    invoke-static {v8}, Lz20;->θ(Landroid/view/View;)Landroid/widget/TextView;

    .line 527
    .line 528
    .line 529
    move-result-object v24

    .line 530
    invoke-static {v8, v6}, Lz20;->λ(Landroid/view/View;I)Landroid/view/View;

    .line 531
    .line 532
    .line 533
    move-result-object v25

    .line 534
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 535
    .line 536
    .line 537
    move-result-object v3

    .line 538
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v3

    .line 542
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 543
    .line 544
    .line 545
    move-result v11

    .line 546
    invoke-virtual {v5}, Landroid/view/View;->getHeight()I

    .line 547
    .line 548
    .line 549
    move-result v13

    .line 550
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 551
    .line 552
    .line 553
    move-result-object v15

    .line 554
    invoke-virtual {v15}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 555
    .line 556
    .line 557
    move-result-object v15

    .line 558
    invoke-virtual {v8}, Landroid/view/View;->getWidth()I

    .line 559
    .line 560
    .line 561
    move-result v10

    .line 562
    invoke-virtual {v8}, Landroid/view/View;->getHeight()I

    .line 563
    .line 564
    .line 565
    move-result v6

    .line 566
    move-object/from16 v26, v0

    .line 567
    .line 568
    invoke-virtual {v8}, Landroid/view/View;->getX()F

    .line 569
    .line 570
    .line 571
    move-result v0

    .line 572
    move-object/from16 v27, v2

    .line 573
    .line 574
    invoke-virtual {v8}, Landroid/view/View;->getY()F

    .line 575
    .line 576
    .line 577
    move-result v2

    .line 578
    if-eqz v23, :cond_21

    .line 579
    .line 580
    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 581
    .line 582
    .line 583
    move-result-object v20

    .line 584
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v20

    .line 588
    move-object/from16 v28, v4

    .line 589
    .line 590
    move-object/from16 v4, v20

    .line 591
    .line 592
    goto :goto_15

    .line 593
    :cond_21
    move-object/from16 v28, v4

    .line 594
    .line 595
    const/4 v4, 0x0

    .line 596
    :goto_15
    if-eqz v24, :cond_22

    .line 597
    .line 598
    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 599
    .line 600
    .line 601
    move-result-object v20

    .line 602
    invoke-virtual/range {v20 .. v20}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 603
    .line 604
    .line 605
    move-result-object v20

    .line 606
    move-object/from16 v21, v5

    .line 607
    .line 608
    move-object/from16 v5, v20

    .line 609
    .line 610
    :goto_16
    move-object/from16 v22, v8

    .line 611
    .line 612
    goto :goto_17

    .line 613
    :cond_22
    move-object/from16 v21, v5

    .line 614
    .line 615
    const/4 v5, 0x0

    .line 616
    goto :goto_16

    .line 617
    :goto_17
    const-string v8, "\u627e\u5230\u53f3\u4fa7\u6309\u94ae\u6a21\u677f outer="

    .line 618
    .line 619
    move-object/from16 v29, v12

    .line 620
    .line 621
    const-string v12, " outerSize="

    .line 622
    .line 623
    const-string v1, "x"

    .line 624
    .line 625
    invoke-static {v11, v8, v3, v12, v1}, Lnx;->ξ(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 626
    .line 627
    .line 628
    move-result-object v3

    .line 629
    const-string v8, " inner="

    .line 630
    .line 631
    const-string v11, " innerSize="

    .line 632
    .line 633
    invoke-static {v3, v13, v8, v15, v11}, Llz1;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 634
    .line 635
    .line 636
    const-string v8, " innerX="

    .line 637
    .line 638
    invoke-static {v3, v10, v1, v6, v8}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 642
    .line 643
    .line 644
    const-string v0, " innerY="

    .line 645
    .line 646
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 650
    .line 651
    .line 652
    const-string v0, " icon="

    .line 653
    .line 654
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 655
    .line 656
    .line 657
    const-string v0, " text="

    .line 658
    .line 659
    invoke-static {v3, v4, v0, v5}, Lnx;->μ(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 660
    .line 661
    .line 662
    move-result-object v0

    .line 663
    const/4 v1, 0x4

    .line 664
    const/4 v2, 0x0

    .line 665
    invoke-static {v14, v0, v2, v1, v2}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    new-instance v20, Lx20;

    .line 669
    .line 670
    invoke-direct/range {v20 .. v25}, Lx20;-><init>(Landroid/view/ViewGroup;Landroid/widget/LinearLayout;Landroid/widget/ImageView;Landroid/widget/TextView;Landroid/view/View;)V

    .line 671
    .line 672
    .line 673
    goto :goto_19

    .line 674
    :goto_18
    add-int/lit8 v3, v3, -0x1

    .line 675
    .line 676
    const/4 v6, 0x0

    .line 677
    const/4 v10, -0x1

    .line 678
    const/16 v19, 0x1

    .line 679
    .line 680
    move-object/from16 v1, p0

    .line 681
    .line 682
    move-object/from16 v0, v26

    .line 683
    .line 684
    move-object/from16 v2, v27

    .line 685
    .line 686
    move-object/from16 v4, v28

    .line 687
    .line 688
    move-object/from16 v12, v29

    .line 689
    .line 690
    goto/16 :goto_11

    .line 691
    .line 692
    :cond_23
    move-object/from16 v26, v0

    .line 693
    .line 694
    move-object/from16 v27, v2

    .line 695
    .line 696
    move-object/from16 v28, v4

    .line 697
    .line 698
    move-object/from16 v29, v12

    .line 699
    .line 700
    const/16 v20, 0x0

    .line 701
    .line 702
    :goto_19
    move-object/from16 v1, v20

    .line 703
    .line 704
    goto :goto_1a

    .line 705
    :cond_24
    move-object/from16 v26, v0

    .line 706
    .line 707
    move-object/from16 v27, v2

    .line 708
    .line 709
    move-object/from16 v28, v4

    .line 710
    .line 711
    move-object/from16 v29, v12

    .line 712
    .line 713
    const/4 v1, 0x0

    .line 714
    :goto_1a
    invoke-virtual/range {v26 .. v26}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 715
    .line 716
    .line 717
    move-result-object v2

    .line 718
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 719
    .line 720
    .line 721
    :goto_1b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 722
    .line 723
    .line 724
    move-result v0

    .line 725
    if-eqz v0, :cond_41

    .line 726
    .line 727
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 728
    .line 729
    .line 730
    move-result-object v0

    .line 731
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 732
    .line 733
    .line 734
    move-object v3, v0

    .line 735
    check-cast v3, Lv20;

    .line 736
    .line 737
    iget-object v4, v3, Lv20;->α:Ljava/lang/String;

    .line 738
    .line 739
    if-eqz v1, :cond_25

    .line 740
    .line 741
    iget-object v0, v1, Lx20;->α:Landroid/view/ViewGroup;

    .line 742
    .line 743
    goto :goto_1c

    .line 744
    :cond_25
    const/4 v0, 0x0

    .line 745
    :goto_1c
    if-eqz v1, :cond_26

    .line 746
    .line 747
    iget-object v5, v1, Lx20;->β:Landroid/widget/LinearLayout;

    .line 748
    .line 749
    goto :goto_1d

    .line 750
    :cond_26
    const/4 v5, 0x0

    .line 751
    :goto_1d
    if-eqz v1, :cond_27

    .line 752
    .line 753
    iget-object v6, v1, Lx20;->γ:Landroid/widget/ImageView;

    .line 754
    .line 755
    goto :goto_1e

    .line 756
    :cond_27
    const/4 v6, 0x0

    .line 757
    :goto_1e
    if-eqz v1, :cond_28

    .line 758
    .line 759
    iget-object v8, v1, Lx20;->δ:Landroid/widget/TextView;

    .line 760
    .line 761
    goto :goto_1f

    .line 762
    :cond_28
    const/4 v8, 0x0

    .line 763
    :goto_1f
    const/high16 v10, 0x42840000    # 66.0f

    .line 764
    .line 765
    if-eqz v5, :cond_2a

    .line 766
    .line 767
    invoke-virtual {v5}, Landroid/view/View;->getWidth()I

    .line 768
    .line 769
    .line 770
    move-result v11

    .line 771
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 772
    .line 773
    .line 774
    move-result-object v12

    .line 775
    if-lez v11, :cond_29

    .line 776
    .line 777
    goto :goto_20

    .line 778
    :cond_29
    const/4 v12, 0x0

    .line 779
    :goto_20
    if-eqz v12, :cond_2a

    .line 780
    .line 781
    invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I

    .line 782
    .line 783
    .line 784
    move-result v11

    .line 785
    goto :goto_21

    .line 786
    :cond_2a
    invoke-static {v7, v10}, Lz20;->γ(Landroid/content/Context;F)I

    .line 787
    .line 788
    .line 789
    move-result v11

    .line 790
    :goto_21
    const/high16 v12, 0x42500000    # 52.0f

    .line 791
    .line 792
    invoke-static {v7, v12}, Lz20;->γ(Landroid/content/Context;F)I

    .line 793
    .line 794
    .line 795
    move-result v13

    .line 796
    const/high16 v15, 0x42180000    # 38.0f

    .line 797
    .line 798
    invoke-static {v7, v15}, Lz20;->γ(Landroid/content/Context;F)I

    .line 799
    .line 800
    .line 801
    move-result v15

    .line 802
    new-instance v12, Landroid/widget/FrameLayout;

    .line 803
    .line 804
    invoke-direct {v12, v7}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 805
    .line 806
    .line 807
    iget-object v10, v3, Lv20;->β:Ljava/lang/String;

    .line 808
    .line 809
    move-object/from16 v22, v0

    .line 810
    .line 811
    invoke-virtual {v9, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 812
    .line 813
    .line 814
    move-result-object v0

    .line 815
    invoke-virtual {v12, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 816
    .line 817
    .line 818
    move-object/from16 v23, v2

    .line 819
    .line 820
    const/4 v2, 0x0

    .line 821
    invoke-virtual {v12, v2}, Landroid/view/View;->setClickable(Z)V

    .line 822
    .line 823
    .line 824
    invoke-virtual {v12, v2}, Landroid/view/View;->setFocusable(Z)V

    .line 825
    .line 826
    .line 827
    invoke-virtual {v12, v2}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 828
    .line 829
    .line 830
    invoke-virtual {v12, v2}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 831
    .line 832
    .line 833
    const/high16 v0, 0x40c00000    # 6.0f

    .line 834
    .line 835
    invoke-static {v7, v0}, Lz20;->γ(Landroid/content/Context;F)I

    .line 836
    .line 837
    .line 838
    move-result v0

    .line 839
    int-to-float v0, v0

    .line 840
    neg-float v0, v0

    .line 841
    invoke-virtual {v12, v0}, Landroid/view/View;->setTranslationX(F)V

    .line 842
    .line 843
    .line 844
    if-eqz v22, :cond_2b

    .line 845
    .line 846
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPaddingLeft()I

    .line 847
    .line 848
    .line 849
    move-result v0

    .line 850
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPaddingTop()I

    .line 851
    .line 852
    .line 853
    move-result v2

    .line 854
    move-object/from16 v24, v5

    .line 855
    .line 856
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPaddingRight()I

    .line 857
    .line 858
    .line 859
    move-result v5

    .line 860
    move-object/from16 v25, v6

    .line 861
    .line 862
    invoke-virtual/range {v22 .. v22}, Landroid/view/View;->getPaddingBottom()I

    .line 863
    .line 864
    .line 865
    move-result v6

    .line 866
    invoke-virtual {v12, v0, v2, v5, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 867
    .line 868
    .line 869
    goto :goto_22

    .line 870
    :cond_2b
    move-object/from16 v24, v5

    .line 871
    .line 872
    move-object/from16 v25, v6

    .line 873
    .line 874
    :goto_22
    new-instance v2, Landroid/widget/LinearLayout;

    .line 875
    .line 876
    invoke-direct {v2, v7}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 877
    .line 878
    .line 879
    const/4 v5, 0x1

    .line 880
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 881
    .line 882
    .line 883
    invoke-virtual {v2, v5}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 884
    .line 885
    .line 886
    invoke-virtual {v2, v5}, Landroid/view/View;->setClickable(Z)V

    .line 887
    .line 888
    .line 889
    invoke-virtual {v2, v5}, Landroid/view/View;->setFocusable(Z)V

    .line 890
    .line 891
    .line 892
    iget-object v0, v3, Lv20;->γ:Ljava/lang/String;

    .line 893
    .line 894
    invoke-virtual {v2, v0}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 895
    .line 896
    .line 897
    const/4 v5, 0x0

    .line 898
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 899
    .line 900
    .line 901
    invoke-virtual {v2, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 902
    .line 903
    .line 904
    if-eqz v24, :cond_2c

    .line 905
    .line 906
    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getMinimumWidth()I

    .line 907
    .line 908
    .line 909
    move-result v0

    .line 910
    invoke-virtual {v2, v0}, Landroid/view/View;->setMinimumWidth(I)V

    .line 911
    .line 912
    .line 913
    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getPaddingLeft()I

    .line 914
    .line 915
    .line 916
    move-result v0

    .line 917
    invoke-virtual/range {v24 .. v24}, Landroid/view/View;->getPaddingRight()I

    .line 918
    .line 919
    .line 920
    move-result v6

    .line 921
    invoke-virtual {v2, v0, v5, v6, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 922
    .line 923
    .line 924
    :cond_2c
    :try_start_2
    new-instance v0, Landroid/util/TypedValue;

    .line 925
    .line 926
    invoke-direct {v0}, Landroid/util/TypedValue;-><init>()V

    .line 927
    .line 928
    .line 929
    invoke-virtual {v7}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 930
    .line 931
    .line 932
    move-result-object v5
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_3

    .line 933
    const v6, 0x101045c

    .line 934
    .line 935
    .line 936
    move-object/from16 v22, v8

    .line 937
    .line 938
    const/4 v8, 0x1

    .line 939
    :try_start_3
    invoke-virtual {v5, v6, v0, v8}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    .line 940
    .line 941
    .line 942
    iget v0, v0, Landroid/util/TypedValue;->resourceId:I

    .line 943
    .line 944
    invoke-virtual {v7, v0}, Landroid/content/Context;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 945
    .line 946
    .line 947
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 948
    goto :goto_24

    .line 949
    :catchall_2
    move-exception v0

    .line 950
    goto :goto_23

    .line 951
    :catchall_3
    move-exception v0

    .line 952
    move-object/from16 v22, v8

    .line 953
    .line 954
    :goto_23
    new-instance v5, Leo1;

    .line 955
    .line 956
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 957
    .line 958
    .line 959
    move-object v0, v5

    .line 960
    :goto_24
    instance-of v5, v0, Leo1;

    .line 961
    .line 962
    if-eqz v5, :cond_2d

    .line 963
    .line 964
    const/4 v0, 0x0

    .line 965
    :cond_2d
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 966
    .line 967
    invoke-virtual {v2, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 968
    .line 969
    .line 970
    new-instance v0, Landroid/widget/ImageView;

    .line 971
    .line 972
    invoke-direct {v0, v7}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 973
    .line 974
    .line 975
    const-string v5, "icon"

    .line 976
    .line 977
    invoke-virtual {v0, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 978
    .line 979
    .line 980
    invoke-virtual {v0, v10}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 981
    .line 982
    .line 983
    if-eqz v25, :cond_2e

    .line 984
    .line 985
    invoke-virtual/range {v25 .. v25}, Landroid/widget/ImageView;->getScaleType()Landroid/widget/ImageView$ScaleType;

    .line 986
    .line 987
    .line 988
    move-result-object v5

    .line 989
    if-nez v5, :cond_2f

    .line 990
    .line 991
    :cond_2e
    sget-object v5, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    .line 992
    .line 993
    :cond_2f
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 994
    .line 995
    .line 996
    const/4 v5, 0x0

    .line 997
    invoke-virtual {v0, v5}, Landroid/widget/ImageView;->setAdjustViewBounds(Z)V

    .line 998
    .line 999
    .line 1000
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1001
    .line 1002
    invoke-direct {v5, v15, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1003
    .line 1004
    .line 1005
    const/4 v8, 0x1

    .line 1006
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1007
    .line 1008
    const/high16 v6, 0x40000000    # 2.0f

    .line 1009
    .line 1010
    invoke-static {v7, v6}, Lz20;->γ(Landroid/content/Context;F)I

    .line 1011
    .line 1012
    .line 1013
    move-result v6

    .line 1014
    iput v6, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1015
    .line 1016
    invoke-virtual {v2, v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1017
    .line 1018
    .line 1019
    new-instance v0, Landroid/widget/TextView;

    .line 1020
    .line 1021
    invoke-direct {v0, v7}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 1022
    .line 1023
    .line 1024
    const-string v5, "label"

    .line 1025
    .line 1026
    invoke-virtual {v0, v5}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 1027
    .line 1028
    .line 1029
    invoke-virtual {v0, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 1030
    .line 1031
    .line 1032
    const/16 v5, 0x11

    .line 1033
    .line 1034
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setGravity(I)V

    .line 1035
    .line 1036
    .line 1037
    const/4 v8, 0x1

    .line 1038
    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 1039
    .line 1040
    .line 1041
    const/4 v5, 0x0

    .line 1042
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setIncludeFontPadding(Z)V

    .line 1043
    .line 1044
    .line 1045
    const/high16 v6, 0x41200000    # 10.0f

    .line 1046
    .line 1047
    const/4 v8, 0x2

    .line 1048
    invoke-virtual {v0, v8, v6}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 1049
    .line 1050
    .line 1051
    if-eqz v22, :cond_30

    .line 1052
    .line 1053
    invoke-virtual/range {v22 .. v22}, Landroid/widget/TextView;->getTypeface()Landroid/graphics/Typeface;

    .line 1054
    .line 1055
    .line 1056
    move-result-object v6

    .line 1057
    goto :goto_25

    .line 1058
    :cond_30
    const/4 v6, 0x0

    .line 1059
    :goto_25
    invoke-virtual {v0, v6}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 1060
    .line 1061
    .line 1062
    invoke-virtual {v0, v5, v5, v5, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 1063
    .line 1064
    .line 1065
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 1066
    .line 1067
    const/4 v6, -0x2

    .line 1068
    invoke-direct {v5, v11, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1069
    .line 1070
    .line 1071
    const/4 v8, 0x1

    .line 1072
    iput v8, v5, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1073
    .line 1074
    const/high16 v10, -0x40000000    # -2.0f

    .line 1075
    .line 1076
    invoke-static {v7, v10}, Lz20;->γ(Landroid/content/Context;F)I

    .line 1077
    .line 1078
    .line 1079
    move-result v10

    .line 1080
    iput v10, v5, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1081
    .line 1082
    invoke-virtual {v2, v0, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1083
    .line 1084
    .line 1085
    new-instance v0, Lc9;

    .line 1086
    .line 1087
    const/4 v10, 0x4

    .line 1088
    move-object/from16 v5, p0

    .line 1089
    .line 1090
    invoke-direct {v0, v5, v3, v12, v10}, Lc9;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 1091
    .line 1092
    .line 1093
    invoke-virtual {v2, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 1094
    .line 1095
    .line 1096
    if-eqz v1, :cond_31

    .line 1097
    .line 1098
    iget-object v0, v1, Lx20;->β:Landroid/widget/LinearLayout;

    .line 1099
    .line 1100
    goto :goto_26

    .line 1101
    :cond_31
    const/4 v0, 0x0

    .line 1102
    :goto_26
    if-eqz v1, :cond_32

    .line 1103
    .line 1104
    iget-object v10, v1, Lx20;->α:Landroid/view/ViewGroup;

    .line 1105
    .line 1106
    goto :goto_27

    .line 1107
    :cond_32
    const/4 v10, 0x0

    .line 1108
    :goto_27
    if-eqz v0, :cond_34

    .line 1109
    .line 1110
    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    .line 1111
    .line 1112
    .line 1113
    move-result v11

    .line 1114
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1115
    .line 1116
    .line 1117
    move-result-object v15

    .line 1118
    if-lez v11, :cond_33

    .line 1119
    .line 1120
    goto :goto_28

    .line 1121
    :cond_33
    const/4 v15, 0x0

    .line 1122
    :goto_28
    if-eqz v15, :cond_34

    .line 1123
    .line 1124
    invoke-virtual {v15}, Ljava/lang/Integer;->intValue()I

    .line 1125
    .line 1126
    .line 1127
    move-result v11

    .line 1128
    :goto_29
    const/high16 v15, 0x42500000    # 52.0f

    .line 1129
    .line 1130
    goto :goto_2a

    .line 1131
    :cond_34
    const/high16 v11, 0x42840000    # 66.0f

    .line 1132
    .line 1133
    invoke-static {v7, v11}, Lz20;->γ(Landroid/content/Context;F)I

    .line 1134
    .line 1135
    .line 1136
    move-result v11

    .line 1137
    goto :goto_29

    .line 1138
    :goto_2a
    invoke-static {v7, v15}, Lz20;->γ(Landroid/content/Context;F)I

    .line 1139
    .line 1140
    .line 1141
    move-result v8

    .line 1142
    new-instance v15, Landroid/widget/FrameLayout$LayoutParams;

    .line 1143
    .line 1144
    invoke-direct {v15, v11, v8}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 1145
    .line 1146
    .line 1147
    if-eqz v0, :cond_35

    .line 1148
    .line 1149
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1150
    .line 1151
    .line 1152
    move-result-object v0

    .line 1153
    goto :goto_2b

    .line 1154
    :cond_35
    const/4 v0, 0x0

    .line 1155
    :goto_2b
    instance-of v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1156
    .line 1157
    if-eqz v6, :cond_36

    .line 1158
    .line 1159
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1160
    .line 1161
    goto :goto_2c

    .line 1162
    :cond_36
    const/4 v0, 0x0

    .line 1163
    :goto_2c
    if-eqz v0, :cond_37

    .line 1164
    .line 1165
    iget v6, v0, Landroid/view/ViewGroup$MarginLayoutParams;->leftMargin:I

    .line 1166
    .line 1167
    iput v6, v15, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1168
    .line 1169
    iget v0, v0, Landroid/view/ViewGroup$MarginLayoutParams;->rightMargin:I

    .line 1170
    .line 1171
    iput v0, v15, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 1172
    .line 1173
    const/4 v6, 0x0

    .line 1174
    iput v6, v15, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1175
    .line 1176
    iput v6, v15, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 1177
    .line 1178
    :cond_37
    iget v0, v15, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1179
    .line 1180
    if-nez v0, :cond_38

    .line 1181
    .line 1182
    if-eqz v10, :cond_38

    .line 1183
    .line 1184
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 1185
    .line 1186
    .line 1187
    move-result v0

    .line 1188
    if-lez v0, :cond_38

    .line 1189
    .line 1190
    if-lez v11, :cond_38

    .line 1191
    .line 1192
    invoke-virtual {v10}, Landroid/view/View;->getWidth()I

    .line 1193
    .line 1194
    .line 1195
    move-result v0

    .line 1196
    sub-int/2addr v0, v11

    .line 1197
    iput v0, v15, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1198
    .line 1199
    :cond_38
    iget v0, v15, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1200
    .line 1201
    if-nez v0, :cond_39

    .line 1202
    .line 1203
    const/high16 v0, 0x421c0000    # 39.0f

    .line 1204
    .line 1205
    invoke-static {v7, v0}, Lz20;->γ(Landroid/content/Context;F)I

    .line 1206
    .line 1207
    .line 1208
    move-result v0

    .line 1209
    iput v0, v15, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1210
    .line 1211
    :cond_39
    const/4 v6, 0x0

    .line 1212
    iput v6, v15, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 1213
    .line 1214
    iget v0, v15, Landroid/widget/FrameLayout$LayoutParams;->leftMargin:I

    .line 1215
    .line 1216
    iget v6, v15, Landroid/widget/FrameLayout$LayoutParams;->topMargin:I

    .line 1217
    .line 1218
    iget v10, v15, Landroid/widget/FrameLayout$LayoutParams;->rightMargin:I

    .line 1219
    .line 1220
    move-object/from16 v22, v9

    .line 1221
    .line 1222
    iget v9, v15, Landroid/widget/FrameLayout$LayoutParams;->bottomMargin:I

    .line 1223
    .line 1224
    move-object/from16 v24, v4

    .line 1225
    .line 1226
    const-string v4, " height="

    .line 1227
    .line 1228
    const-string v5, " left="

    .line 1229
    .line 1230
    move-object/from16 v25, v7

    .line 1231
    .line 1232
    const-string v7, "\u53f3\u4fa7\u6309\u94ae innerLp width="

    .line 1233
    .line 1234
    invoke-static {v7, v11, v4, v8, v5}, Lnx;->ο(Ljava/lang/String;ILjava/lang/String;ILjava/lang/String;)Ljava/lang/StringBuilder;

    .line 1235
    .line 1236
    .line 1237
    move-result-object v4

    .line 1238
    const-string v5, " top="

    .line 1239
    .line 1240
    const-string v7, " right="

    .line 1241
    .line 1242
    invoke-static {v4, v0, v5, v6, v7}, Lnx;->Α(Ljava/lang/StringBuilder;ILjava/lang/String;ILjava/lang/String;)V

    .line 1243
    .line 1244
    .line 1245
    invoke-virtual {v4, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1246
    .line 1247
    .line 1248
    const-string v0, " bottom="

    .line 1249
    .line 1250
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1251
    .line 1252
    .line 1253
    invoke-virtual {v4, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1254
    .line 1255
    .line 1256
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1257
    .line 1258
    .line 1259
    move-result-object v0

    .line 1260
    const/4 v4, 0x0

    .line 1261
    const/4 v10, 0x4

    .line 1262
    invoke-static {v14, v0, v4, v10, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1263
    .line 1264
    .line 1265
    iput v13, v15, Landroid/widget/FrameLayout$LayoutParams;->height:I

    .line 1266
    .line 1267
    invoke-virtual {v12, v2, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 1268
    .line 1269
    .line 1270
    invoke-static {v12, v3}, Lz20;->σ(Landroid/view/View;Lv20;)V

    .line 1271
    .line 1272
    .line 1273
    if-eqz v1, :cond_3a

    .line 1274
    .line 1275
    iget-object v0, v1, Lx20;->α:Landroid/view/ViewGroup;

    .line 1276
    .line 1277
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1278
    .line 1279
    .line 1280
    move-result-object v0

    .line 1281
    goto :goto_2d

    .line 1282
    :cond_3a
    const/4 v0, 0x0

    .line 1283
    :goto_2d
    instance-of v2, v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1284
    .line 1285
    if-eqz v2, :cond_3b

    .line 1286
    .line 1287
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1288
    .line 1289
    check-cast v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 1290
    .line 1291
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/widget/LinearLayout$LayoutParams;)V

    .line 1292
    .line 1293
    .line 1294
    :goto_2e
    move-object/from16 v3, v25

    .line 1295
    .line 1296
    const/4 v4, -0x2

    .line 1297
    const/high16 v15, 0x42500000    # 52.0f

    .line 1298
    .line 1299
    goto :goto_2f

    .line 1300
    :cond_3b
    instance-of v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1301
    .line 1302
    if-eqz v2, :cond_3c

    .line 1303
    .line 1304
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1305
    .line 1306
    check-cast v0, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 1307
    .line 1308
    invoke-direct {v2, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(Landroid/view/ViewGroup$MarginLayoutParams;)V

    .line 1309
    .line 1310
    .line 1311
    goto :goto_2e

    .line 1312
    :cond_3c
    if-eqz v0, :cond_3d

    .line 1313
    .line 1314
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1315
    .line 1316
    iget v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 1317
    .line 1318
    iget v0, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 1319
    .line 1320
    invoke-direct {v2, v3, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1321
    .line 1322
    .line 1323
    goto :goto_2e

    .line 1324
    :cond_3d
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 1325
    .line 1326
    move-object/from16 v3, v25

    .line 1327
    .line 1328
    const/high16 v15, 0x42500000    # 52.0f

    .line 1329
    .line 1330
    invoke-static {v3, v15}, Lz20;->γ(Landroid/content/Context;F)I

    .line 1331
    .line 1332
    .line 1333
    move-result v0

    .line 1334
    const/4 v4, -0x2

    .line 1335
    invoke-direct {v2, v4, v0}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 1336
    .line 1337
    .line 1338
    :goto_2f
    iget v0, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1339
    .line 1340
    const/4 v5, -0x1

    .line 1341
    if-ne v0, v5, :cond_3e

    .line 1342
    .line 1343
    iput v4, v2, Landroid/widget/LinearLayout$LayoutParams;->width:I

    .line 1344
    .line 1345
    :cond_3e
    invoke-static {v3, v15}, Lz20;->γ(Landroid/content/Context;F)I

    .line 1346
    .line 1347
    .line 1348
    move-result v0

    .line 1349
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->height:I

    .line 1350
    .line 1351
    const/4 v6, 0x0

    .line 1352
    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 1353
    .line 1354
    const/4 v0, 0x5

    .line 1355
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->bottomMargin:I

    .line 1356
    .line 1357
    iput v6, v2, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 1358
    .line 1359
    invoke-virtual {v2, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 1360
    .line 1361
    .line 1362
    const v0, 0x800005

    .line 1363
    .line 1364
    .line 1365
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 1366
    .line 1367
    move-object/from16 v4, p0

    .line 1368
    .line 1369
    move-object/from16 v6, v29

    .line 1370
    .line 1371
    :try_start_4
    invoke-static {v4, v6}, Lz20;->μ(Landroid/view/ViewGroup;Ljava/util/Set;)I

    .line 1372
    .line 1373
    .line 1374
    move-result v0

    .line 1375
    invoke-virtual {v4, v12, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1376
    .line 1377
    .line 1378
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 1379
    .line 1380
    .line 1381
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1382
    .line 1383
    .line 1384
    move-result v2

    .line 1385
    if-eqz v1, :cond_3f

    .line 1386
    .line 1387
    iget-object v7, v1, Lx20;->α:Landroid/view/ViewGroup;

    .line 1388
    .line 1389
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1390
    .line 1391
    .line 1392
    move-result-object v7

    .line 1393
    invoke-virtual {v7}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1394
    .line 1395
    .line 1396
    move-result-object v7

    .line 1397
    goto :goto_30

    .line 1398
    :catchall_4
    move-exception v0

    .line 1399
    move-object/from16 v10, p1

    .line 1400
    .line 1401
    move-object/from16 v9, v24

    .line 1402
    .line 1403
    goto :goto_31

    .line 1404
    :cond_3f
    const/4 v7, 0x0

    .line 1405
    :goto_30
    new-instance v8, Ljava/lang/StringBuilder;

    .line 1406
    .line 1407
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 1408
    .line 1409
    .line 1410
    const-string v9, "\u5df2\u8ffd\u52a0\u53f3\u4fa7\u6309\u94ae id="

    .line 1411
    .line 1412
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 1413
    .line 1414
    .line 1415
    move-object/from16 v9, v24

    .line 1416
    .line 1417
    :try_start_5
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1418
    .line 1419
    .line 1420
    const-string v10, " reason="

    .line 1421
    .line 1422
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_6

    .line 1423
    .line 1424
    .line 1425
    move-object/from16 v10, p1

    .line 1426
    .line 1427
    :try_start_6
    invoke-virtual {v8, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1428
    .line 1429
    .line 1430
    const-string v11, " index="

    .line 1431
    .line 1432
    invoke-virtual {v8, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1433
    .line 1434
    .line 1435
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1436
    .line 1437
    .line 1438
    const-string v0, " childCount="

    .line 1439
    .line 1440
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1441
    .line 1442
    .line 1443
    invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1444
    .line 1445
    .line 1446
    const-string v0, " template="

    .line 1447
    .line 1448
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1449
    .line 1450
    .line 1451
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1452
    .line 1453
    .line 1454
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1455
    .line 1456
    .line 1457
    move-result-object v0

    .line 1458
    const/4 v2, 0x4

    .line 1459
    const/4 v7, 0x0

    .line 1460
    invoke-static {v14, v0, v7, v2, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 1461
    .line 1462
    .line 1463
    move-object/from16 v2, v27

    .line 1464
    .line 1465
    goto :goto_32

    .line 1466
    :catchall_5
    move-exception v0

    .line 1467
    goto :goto_31

    .line 1468
    :catchall_6
    move-exception v0

    .line 1469
    move-object/from16 v10, p1

    .line 1470
    .line 1471
    :goto_31
    new-instance v2, Leo1;

    .line 1472
    .line 1473
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1474
    .line 1475
    .line 1476
    :goto_32
    invoke-static {v2}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1477
    .line 1478
    .line 1479
    move-result-object v0

    .line 1480
    if-eqz v0, :cond_40

    .line 1481
    .line 1482
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1483
    .line 1484
    .line 1485
    move-result-object v0

    .line 1486
    const-string v2, "\u8ffd\u52a0\u53f3\u4fa7\u6309\u94ae\u5931\u8d25 id="

    .line 1487
    .line 1488
    const-string v7, ": "

    .line 1489
    .line 1490
    invoke-static {v2, v9, v7, v0}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1491
    .line 1492
    .line 1493
    move-result-object v0

    .line 1494
    const/4 v2, 0x4

    .line 1495
    const/4 v7, 0x0

    .line 1496
    invoke-static {v14, v0, v7, v2, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1497
    .line 1498
    .line 1499
    :cond_40
    move-object v7, v3

    .line 1500
    move-object/from16 v29, v6

    .line 1501
    .line 1502
    move-object/from16 v9, v22

    .line 1503
    .line 1504
    move-object/from16 v2, v23

    .line 1505
    .line 1506
    goto/16 :goto_1b

    .line 1507
    .line 1508
    :cond_41
    move-object/from16 v4, p0

    .line 1509
    .line 1510
    move-object/from16 v6, v29

    .line 1511
    .line 1512
    invoke-interface {v6}, Ljava/util/Set;->isEmpty()Z

    .line 1513
    .line 1514
    .line 1515
    move-result v0

    .line 1516
    if-eqz v0, :cond_42

    .line 1517
    .line 1518
    goto/16 :goto_3d

    .line 1519
    .line 1520
    :cond_42
    new-instance v1, Ljava/util/ArrayList;

    .line 1521
    .line 1522
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 1523
    .line 1524
    .line 1525
    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1526
    .line 1527
    .line 1528
    move-result-object v0

    .line 1529
    :cond_43
    :goto_33
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1530
    .line 1531
    .line 1532
    move-result v2

    .line 1533
    if-eqz v2, :cond_44

    .line 1534
    .line 1535
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1536
    .line 1537
    .line 1538
    move-result-object v2

    .line 1539
    check-cast v2, Lv20;

    .line 1540
    .line 1541
    iget-object v2, v2, Lv20;->α:Ljava/lang/String;

    .line 1542
    .line 1543
    invoke-static {v4, v2}, Lz20;->ζ(Landroid/view/ViewGroup;Ljava/lang/String;)Landroid/view/View;

    .line 1544
    .line 1545
    .line 1546
    move-result-object v2

    .line 1547
    if-eqz v2, :cond_43

    .line 1548
    .line 1549
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1550
    .line 1551
    .line 1552
    goto :goto_33

    .line 1553
    :cond_44
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 1554
    .line 1555
    .line 1556
    move-result v0

    .line 1557
    if-eqz v0, :cond_45

    .line 1558
    .line 1559
    goto/16 :goto_3d

    .line 1560
    .line 1561
    :cond_45
    invoke-static {v4, v6}, Lz20;->μ(Landroid/view/ViewGroup;Ljava/util/Set;)I

    .line 1562
    .line 1563
    .line 1564
    move-result v0

    .line 1565
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1566
    .line 1567
    .line 1568
    move-result v2

    .line 1569
    if-lt v0, v2, :cond_46

    .line 1570
    .line 1571
    goto/16 :goto_3d

    .line 1572
    .line 1573
    :cond_46
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1574
    .line 1575
    .line 1576
    move-result v2

    .line 1577
    sub-int/2addr v0, v2

    .line 1578
    if-ltz v0, :cond_48

    .line 1579
    .line 1580
    invoke-static {v1}, Lyh;->Κ(Ljava/util/Collection;)Lxm0;

    .line 1581
    .line 1582
    .line 1583
    move-result-object v2

    .line 1584
    instance-of v3, v2, Ljava/util/Collection;

    .line 1585
    .line 1586
    if-eqz v3, :cond_47

    .line 1587
    .line 1588
    move-object v3, v2

    .line 1589
    check-cast v3, Ljava/util/Collection;

    .line 1590
    .line 1591
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 1592
    .line 1593
    .line 1594
    move-result v3

    .line 1595
    if-eqz v3, :cond_47

    .line 1596
    .line 1597
    goto/16 :goto_3d

    .line 1598
    .line 1599
    :cond_47
    invoke-virtual {v2}, Lvm0;->iterator()Ljava/util/Iterator;

    .line 1600
    .line 1601
    .line 1602
    move-result-object v2

    .line 1603
    :goto_34
    move-object v3, v2

    .line 1604
    check-cast v3, Lwm0;

    .line 1605
    .line 1606
    iget-boolean v5, v3, Lwm0;->η:Z

    .line 1607
    .line 1608
    if-eqz v5, :cond_51

    .line 1609
    .line 1610
    invoke-virtual {v3}, Lwm0;->nextInt()I

    .line 1611
    .line 1612
    .line 1613
    move-result v3

    .line 1614
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1615
    .line 1616
    .line 1617
    move-result-object v5

    .line 1618
    check-cast v5, Landroid/view/View;

    .line 1619
    .line 1620
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 1621
    .line 1622
    .line 1623
    move-result v5

    .line 1624
    add-int/2addr v3, v0

    .line 1625
    if-ne v5, v3, :cond_48

    .line 1626
    .line 1627
    goto :goto_34

    .line 1628
    :cond_48
    new-instance v2, Ljava/util/ArrayList;

    .line 1629
    .line 1630
    const/16 v3, 0xa

    .line 1631
    .line 1632
    invoke-static {v1, v3}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 1633
    .line 1634
    .line 1635
    move-result v0

    .line 1636
    invoke-direct {v2, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1637
    .line 1638
    .line 1639
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1640
    .line 1641
    .line 1642
    move-result-object v0

    .line 1643
    :goto_35
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1644
    .line 1645
    .line 1646
    move-result v3

    .line 1647
    if-eqz v3, :cond_49

    .line 1648
    .line 1649
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1650
    .line 1651
    .line 1652
    move-result-object v3

    .line 1653
    check-cast v3, Landroid/view/View;

    .line 1654
    .line 1655
    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 1656
    .line 1657
    .line 1658
    move-result v3

    .line 1659
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1660
    .line 1661
    .line 1662
    move-result-object v3

    .line 1663
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1664
    .line 1665
    .line 1666
    goto :goto_35

    .line 1667
    :cond_49
    new-instance v3, Ljava/util/ArrayList;

    .line 1668
    .line 1669
    const/16 v5, 0xa

    .line 1670
    .line 1671
    invoke-static {v1, v5}, Lyh;->σ(Ljava/lang/Iterable;I)I

    .line 1672
    .line 1673
    .line 1674
    move-result v0

    .line 1675
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 1676
    .line 1677
    .line 1678
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1679
    .line 1680
    .line 1681
    move-result-object v0

    .line 1682
    :goto_36
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1683
    .line 1684
    .line 1685
    move-result v5

    .line 1686
    if-eqz v5, :cond_4a

    .line 1687
    .line 1688
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1689
    .line 1690
    .line 1691
    move-result-object v5

    .line 1692
    check-cast v5, Landroid/view/View;

    .line 1693
    .line 1694
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 1695
    .line 1696
    .line 1697
    move-result-object v5

    .line 1698
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1699
    .line 1700
    .line 1701
    goto :goto_36

    .line 1702
    :cond_4a
    :try_start_7
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1703
    .line 1704
    .line 1705
    move-result-object v0

    .line 1706
    :goto_37
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1707
    .line 1708
    .line 1709
    move-result v5

    .line 1710
    if-eqz v5, :cond_4b

    .line 1711
    .line 1712
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1713
    .line 1714
    .line 1715
    move-result-object v5

    .line 1716
    check-cast v5, Landroid/view/View;

    .line 1717
    .line 1718
    invoke-virtual {v4, v5}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 1719
    .line 1720
    .line 1721
    goto :goto_37

    .line 1722
    :catchall_7
    move-exception v0

    .line 1723
    goto :goto_39

    .line 1724
    :cond_4b
    invoke-static {v4, v6}, Lz20;->μ(Landroid/view/ViewGroup;Ljava/util/Set;)I

    .line 1725
    .line 1726
    .line 1727
    move-result v0

    .line 1728
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1729
    .line 1730
    .line 1731
    move-result-object v5

    .line 1732
    const/4 v6, 0x0

    .line 1733
    :goto_38
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1734
    .line 1735
    .line 1736
    move-result v7

    .line 1737
    if-eqz v7, :cond_4d

    .line 1738
    .line 1739
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1740
    .line 1741
    .line 1742
    move-result-object v7

    .line 1743
    add-int/lit8 v8, v6, 0x1

    .line 1744
    .line 1745
    if-ltz v6, :cond_4c

    .line 1746
    .line 1747
    check-cast v7, Landroid/view/View;

    .line 1748
    .line 1749
    invoke-virtual {v3, v6}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1750
    .line 1751
    .line 1752
    move-result-object v6

    .line 1753
    check-cast v6, Landroid/view/ViewGroup$LayoutParams;

    .line 1754
    .line 1755
    invoke-virtual {v4, v7, v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 1756
    .line 1757
    .line 1758
    add-int/lit8 v0, v0, 0x1

    .line 1759
    .line 1760
    move v6, v8

    .line 1761
    goto :goto_38

    .line 1762
    :cond_4c
    invoke-static {}, Lyh;->х()V

    .line 1763
    .line 1764
    .line 1765
    const/16 v17, 0x0

    .line 1766
    .line 1767
    throw v17

    .line 1768
    :cond_4d
    invoke-virtual {v4}, Landroid/view/View;->requestLayout()V

    .line 1769
    .line 1770
    .line 1771
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 1772
    .line 1773
    .line 1774
    move-result v0

    .line 1775
    new-instance v5, Ljava/lang/StringBuilder;

    .line 1776
    .line 1777
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 1778
    .line 1779
    .line 1780
    const-string v6, "\u5df2\u7ea0\u6b63\u53f3\u4fa7\u6309\u94ae\u987a\u5e8f\uff0c\u4fdd\u7559\u5531\u7247/\u542c\u6296\u97f3\u5c3e\u90e8\u533a\u57df buttons="

    .line 1781
    .line 1782
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1783
    .line 1784
    .line 1785
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 1786
    .line 1787
    .line 1788
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1789
    .line 1790
    .line 1791
    move-result-object v0

    .line 1792
    const/4 v7, 0x0

    .line 1793
    const/4 v10, 0x4

    .line 1794
    invoke-static {v14, v0, v7, v10, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_7

    .line 1795
    .line 1796
    .line 1797
    move-object/from16 v5, v27

    .line 1798
    .line 1799
    goto :goto_3a

    .line 1800
    :goto_39
    new-instance v5, Leo1;

    .line 1801
    .line 1802
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 1803
    .line 1804
    .line 1805
    :goto_3a
    invoke-static {v5}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 1806
    .line 1807
    .line 1808
    move-result-object v0

    .line 1809
    if-eqz v0, :cond_51

    .line 1810
    .line 1811
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1812
    .line 1813
    .line 1814
    move-result-object v1

    .line 1815
    const/4 v5, 0x0

    .line 1816
    :goto_3b
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 1817
    .line 1818
    .line 1819
    move-result v6

    .line 1820
    if-eqz v6, :cond_50

    .line 1821
    .line 1822
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1823
    .line 1824
    .line 1825
    move-result-object v6

    .line 1826
    add-int/lit8 v7, v5, 0x1

    .line 1827
    .line 1828
    if-ltz v5, :cond_4f

    .line 1829
    .line 1830
    check-cast v6, Landroid/view/View;

    .line 1831
    .line 1832
    invoke-virtual {v6}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 1833
    .line 1834
    .line 1835
    move-result-object v8

    .line 1836
    if-eq v8, v4, :cond_4e

    .line 1837
    .line 1838
    :try_start_8
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1839
    .line 1840
    .line 1841
    move-result-object v8

    .line 1842
    check-cast v8, Ljava/lang/Number;

    .line 1843
    .line 1844
    invoke-virtual {v8}, Ljava/lang/Number;->intValue()I

    .line 1845
    .line 1846
    .line 1847
    move-result v8

    .line 1848
    invoke-virtual {v4}, Landroid/view/ViewGroup;->getChildCount()I

    .line 1849
    .line 1850
    .line 1851
    move-result v9
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_8

    .line 1852
    const/4 v10, 0x0

    .line 1853
    :try_start_9
    invoke-static {v8, v10, v9}, Lj81;->μ(III)I

    .line 1854
    .line 1855
    .line 1856
    move-result v8

    .line 1857
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 1858
    .line 1859
    .line 1860
    move-result-object v5

    .line 1861
    check-cast v5, Landroid/view/ViewGroup$LayoutParams;

    .line 1862
    .line 1863
    invoke-virtual {v4, v6, v8, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_9

    .line 1864
    .line 1865
    .line 1866
    goto :goto_3c

    .line 1867
    :catchall_8
    :cond_4e
    const/4 v10, 0x0

    .line 1868
    :catchall_9
    :goto_3c
    move v5, v7

    .line 1869
    goto :goto_3b

    .line 1870
    :cond_4f
    invoke-static {}, Lyh;->х()V

    .line 1871
    .line 1872
    .line 1873
    const/4 v7, 0x0

    .line 1874
    throw v7

    .line 1875
    :cond_50
    const/4 v7, 0x0

    .line 1876
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 1877
    .line 1878
    .line 1879
    move-result-object v0

    .line 1880
    const-string v1, "\u7ea0\u6b63\u53f3\u4fa7\u6309\u94ae\u987a\u5e8f\u5931\u8d25\uff0c\u5df2\u4fdd\u7559\u5bbf\u4e3b\u5e03\u5c40: "

    .line 1881
    .line 1882
    invoke-static {v1, v0}, Llz1;->μ(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 1883
    .line 1884
    .line 1885
    move-result-object v0

    .line 1886
    const/4 v10, 0x4

    .line 1887
    invoke-static {v14, v0, v7, v10, v7}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 1888
    .line 1889
    .line 1890
    :cond_51
    :goto_3d
    return-void
.end method

.method public static ξ(Lv20;)V
    .locals 4

    .line 1
    sget-object v0, Lz20;->δ:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_2

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Lv20;

    .line 27
    .line 28
    iget-object v2, v2, Lv20;->α:Ljava/lang/String;

    .line 29
    .line 30
    iget-object v3, p0, Lv20;->α:Ljava/lang/String;

    .line 31
    .line 32
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    return-void

    .line 39
    :cond_2
    :goto_0
    invoke-virtual {v0, p0}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    return-void
.end method

.method public static ο(Landroid/view/ViewGroup;)Ljava/lang/Object;
    .locals 6

    .line 1
    sget-object v0, Lz20;->ε:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    goto/16 :goto_6

    .line 17
    .line 18
    :cond_0
    sget-object v2, Lz20;->η:Ljava/lang/Class;

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :try_start_0
    const-string v2, "~7930256E6FA81116F35A8C2AC6E1F26036E68A18C000538406145429DCFD52564510E72B66959BEEBB"

    .line 24
    .line 25
    invoke-static {v2}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {v0, v2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 33
    goto :goto_0

    .line 34
    :catchall_0
    move-exception v0

    .line 35
    new-instance v2, Leo1;

    .line 36
    .line 37
    invoke-direct {v2, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 38
    .line 39
    .line 40
    move-object v0, v2

    .line 41
    :goto_0
    instance-of v2, v0, Leo1;

    .line 42
    .line 43
    if-nez v2, :cond_2

    .line 44
    .line 45
    move-object v3, v0

    .line 46
    check-cast v3, Ljava/lang/Class;

    .line 47
    .line 48
    sput-object v3, Lz20;->η:Ljava/lang/Class;

    .line 49
    .line 50
    :cond_2
    if-eqz v2, :cond_3

    .line 51
    .line 52
    move-object v0, v1

    .line 53
    :cond_3
    move-object v2, v0

    .line 54
    check-cast v2, Ljava/lang/Class;

    .line 55
    .line 56
    :goto_1
    if-nez v2, :cond_4

    .line 57
    .line 58
    goto/16 :goto_6

    .line 59
    .line 60
    :cond_4
    new-instance v0, Lsm1;

    .line 61
    .line 62
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 63
    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-static {v0, v2, p0, v3}, Lz20;->ε(Lsm1;Ljava/lang/Class;Landroid/view/View;I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v0

    .line 70
    if-eqz v0, :cond_5

    .line 71
    .line 72
    return-object v0

    .line 73
    :cond_5
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 74
    .line 75
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 76
    .line 77
    .line 78
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    invoke-static {v2, v0, p0, v3}, Lz20;->δ(Ljava/lang/Class;Ljava/util/Set;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v0

    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    return-object v0

    .line 89
    :cond_6
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    move v4, v3

    .line 94
    :goto_2
    if-eqz v0, :cond_a

    .line 95
    .line 96
    const/16 v5, 0x8

    .line 97
    .line 98
    if-ge v4, v5, :cond_a

    .line 99
    .line 100
    new-instance v5, Ljava/util/IdentityHashMap;

    .line 101
    .line 102
    invoke-direct {v5}, Ljava/util/IdentityHashMap;-><init>()V

    .line 103
    .line 104
    .line 105
    invoke-static {v5}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v2, v5, v0, v3}, Lz20;->δ(Ljava/lang/Class;Ljava/util/Set;Ljava/lang/Object;I)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    if-eqz v5, :cond_7

    .line 114
    .line 115
    return-object v5

    .line 116
    :cond_7
    instance-of v5, v0, Landroid/view/View;

    .line 117
    .line 118
    if-eqz v5, :cond_8

    .line 119
    .line 120
    check-cast v0, Landroid/view/View;

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_8
    move-object v0, v1

    .line 124
    :goto_3
    if-eqz v0, :cond_9

    .line 125
    .line 126
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 127
    .line 128
    .line 129
    move-result-object v0

    .line 130
    goto :goto_4

    .line 131
    :cond_9
    move-object v0, v1

    .line 132
    :goto_4
    add-int/lit8 v4, v4, 0x1

    .line 133
    .line 134
    goto :goto_2

    .line 135
    :cond_a
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    invoke-static {p0}, Lz20;->ρ(Landroid/content/Context;)Landroid/app/Activity;

    .line 140
    .line 141
    .line 142
    move-result-object p0

    .line 143
    if-eqz p0, :cond_b

    .line 144
    .line 145
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 146
    .line 147
    .line 148
    move-result-object p0

    .line 149
    if-eqz p0, :cond_b

    .line 150
    .line 151
    invoke-virtual {p0}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 152
    .line 153
    .line 154
    move-result-object p0

    .line 155
    goto :goto_5

    .line 156
    :cond_b
    move-object p0, v1

    .line 157
    :goto_5
    if-eqz p0, :cond_c

    .line 158
    .line 159
    new-instance v0, Lsm1;

    .line 160
    .line 161
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 162
    .line 163
    .line 164
    invoke-static {v0, v2, p0, v3}, Lz20;->ε(Lsm1;Ljava/lang/Class;Landroid/view/View;I)Ljava/lang/Object;

    .line 165
    .line 166
    .line 167
    move-result-object p0

    .line 168
    if-eqz p0, :cond_c

    .line 169
    .line 170
    return-object p0

    .line 171
    :cond_c
    :goto_6
    return-object v1
.end method

.method public static π(ILandroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
    .locals 5

    .line 1
    const-string v0, "com.example.dyhelper"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    const/4 v2, 0x2

    .line 8
    invoke-virtual {p1, v0, v2}, Landroid/content/Context;->createPackageContext(Ljava/lang/String;I)Landroid/content/Context;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2}, Landroid/content/Context;->getPackageResourcePath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v4

    .line 23
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 24
    .line 25
    .line 26
    :try_start_1
    invoke-virtual {v2}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 27
    .line 28
    .line 29
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 30
    goto :goto_0

    .line 31
    :catchall_0
    move-exception v2

    .line 32
    :try_start_2
    new-instance v4, Leo1;

    .line 33
    .line 34
    invoke-direct {v4, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    move-object v2, v4

    .line 38
    :goto_0
    instance-of v4, v2, Leo1;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    move-object v2, v1

    .line 43
    :cond_0
    check-cast v2, Ljava/lang/ClassLoader;

    .line 44
    .line 45
    if-eqz p0, :cond_1

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const-string p0, "drawable"

    .line 49
    .line 50
    invoke-virtual {v3, p2, p0, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    :goto_1
    if-nez p0, :cond_2

    .line 55
    .line 56
    move-object p0, v1

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    invoke-virtual {p1}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    .line 59
    .line 60
    .line 61
    move-result-object p1

    .line 62
    invoke-virtual {v3, p0, p1}, Landroid/content/res/Resources;->getDrawable(ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    .line 63
    .line 64
    .line 65
    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 66
    goto :goto_2

    .line 67
    :catchall_1
    move-exception p0

    .line 68
    new-instance p1, Leo1;

    .line 69
    .line 70
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 71
    .line 72
    .line 73
    move-object p0, p1

    .line 74
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    const-string v0, "\u52a0\u8f7d\u6a21\u5757\u56fe\u6807\u5931\u8d25 name="

    .line 85
    .line 86
    const-string v2, ": "

    .line 87
    .line 88
    invoke-static {v0, p2, v2, p1}, La12;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    const/4 p2, 0x4

    .line 93
    const-string v0, "FeedRightButtonManager"

    .line 94
    .line 95
    invoke-static {v0, p1, v1, p2, v1}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    :cond_3
    instance-of p1, p0, Leo1;

    .line 99
    .line 100
    if-eqz p1, :cond_4

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_4
    move-object v1, p0

    .line 104
    :goto_3
    check-cast v1, Landroid/graphics/drawable/Drawable;

    .line 105
    .line 106
    return-object v1
.end method

.method public static ρ(Landroid/content/Context;)Landroid/app/Activity;
    .locals 2

    .line 1
    new-instance v0, Ljava/util/HashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    :goto_0
    if-eqz p0, :cond_2

    .line 7
    .line 8
    instance-of v1, p0, Landroid/app/Activity;

    .line 9
    .line 10
    if-nez v1, :cond_2

    .line 11
    .line 12
    instance-of v1, p0, Landroid/content/ContextWrapper;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    invoke-virtual {v0, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_1

    .line 22
    .line 23
    goto :goto_1

    .line 24
    :cond_1
    check-cast p0, Landroid/content/ContextWrapper;

    .line 25
    .line 26
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    goto :goto_0

    .line 31
    :cond_2
    instance-of v0, p0, Landroid/app/Activity;

    .line 32
    .line 33
    if-eqz v0, :cond_3

    .line 34
    .line 35
    check-cast p0, Landroid/app/Activity;

    .line 36
    .line 37
    return-object p0

    .line 38
    :cond_3
    :goto_1
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static σ(Landroid/view/View;Lv20;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    const-string v1, "icon"

    .line 10
    .line 11
    const-class v2, Landroid/widget/ImageView;

    .line 12
    .line 13
    invoke-static {p0, v1, v2}, Lz20;->κ(Landroid/view/View;Ljava/lang/String;Ljava/lang/Class;)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Landroid/widget/ImageView;

    .line 18
    .line 19
    const-string v2, "label"

    .line 20
    .line 21
    const-class v3, Landroid/widget/TextView;

    .line 22
    .line 23
    invoke-static {p0, v2, v3}, Lz20;->κ(Landroid/view/View;Ljava/lang/String;Ljava/lang/Class;)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    check-cast p0, Landroid/widget/TextView;

    .line 28
    .line 29
    :try_start_0
    iget-object v2, p1, Lv20;->ζ:La80;

    .line 30
    .line 31
    invoke-interface {v2, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    check-cast v2, Ljava/lang/Integer;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :catchall_0
    move-exception v2

    .line 39
    new-instance v3, Leo1;

    .line 40
    .line 41
    invoke-direct {v3, v2}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 42
    .line 43
    .line 44
    move-object v2, v3

    .line 45
    :goto_0
    instance-of v3, v2, Leo1;

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    if-eqz v3, :cond_1

    .line 49
    .line 50
    move-object v2, v4

    .line 51
    :cond_1
    check-cast v2, Ljava/lang/Integer;

    .line 52
    .line 53
    const/4 v3, -0x1

    .line 54
    if-eqz v1, :cond_6

    .line 55
    .line 56
    :try_start_1
    iget-object v5, p1, Lv20;->ε:La80;

    .line 57
    .line 58
    invoke-interface {v5, v0}, La80;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    check-cast v0, Landroid/graphics/drawable/Drawable;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 63
    .line 64
    goto :goto_1

    .line 65
    :catchall_1
    move-exception v0

    .line 66
    new-instance v5, Leo1;

    .line 67
    .line 68
    invoke-direct {v5, v0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 69
    .line 70
    .line 71
    move-object v0, v5

    .line 72
    :goto_1
    instance-of v5, v0, Leo1;

    .line 73
    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    move-object v0, v4

    .line 77
    :cond_2
    check-cast v0, Landroid/graphics/drawable/Drawable;

    .line 78
    .line 79
    if-eqz v0, :cond_4

    .line 80
    .line 81
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    .line 83
    .line 84
    if-eqz v2, :cond_3

    .line 85
    .line 86
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 87
    .line 88
    .line 89
    move-result v0

    .line 90
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 91
    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_3
    invoke-virtual {v1, v4}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Landroid/widget/ImageView;->clearColorFilter()V

    .line 98
    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    iget-object v0, p1, Lv20;->α:Ljava/lang/String;

    .line 102
    .line 103
    const-string v5, "\u53f3\u4fa7\u6309\u94ae\u56fe\u6807\u4e3a\u7a7a\uff0c\u4f7f\u7528\u900f\u660e\u5360\u4f4d id="

    .line 104
    .line 105
    invoke-virtual {v5, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v0

    .line 109
    const/4 v5, 0x4

    .line 110
    const-string v6, "FeedRightButtonManager"

    .line 111
    .line 112
    invoke-static {v6, v0, v4, v5, v4}, Lux;->υ(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    .line 113
    .line 114
    .line 115
    new-instance v0, Landroid/graphics/drawable/ColorDrawable;

    .line 116
    .line 117
    const/4 v4, 0x0

    .line 118
    invoke-direct {v0, v4}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 122
    .line 123
    .line 124
    if-eqz v2, :cond_5

    .line 125
    .line 126
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 127
    .line 128
    .line 129
    move-result v0

    .line 130
    goto :goto_2

    .line 131
    :cond_5
    move v0, v3

    .line 132
    :goto_2
    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    .line 133
    .line 134
    .line 135
    :cond_6
    :goto_3
    if-eqz p0, :cond_8

    .line 136
    .line 137
    iget-object p1, p1, Lv20;->β:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 140
    .line 141
    .line 142
    if-eqz v2, :cond_7

    .line 143
    .line 144
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    :cond_7
    invoke-virtual {p0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    .line 149
    .line 150
    .line 151
    :cond_8
    :goto_4
    return-void
.end method
