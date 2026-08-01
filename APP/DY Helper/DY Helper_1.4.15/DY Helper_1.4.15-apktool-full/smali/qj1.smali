.class public final Lqj1;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lqj1;

.field public static final β:Ljava/util/concurrent/atomic/AtomicBoolean;

.field public static final γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lqj1;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lqj1;->α:Lqj1;

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
    sput-object v0, Lqj1;->β:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    sput-object v0, Lqj1;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 21
    .line 22
    return-void
.end method

.method public static final α(Lqj1;Ljava/lang/Object;Landroid/view/View;)V
    .locals 2

    .line 1
    invoke-static {p1}, Luj1;->ε(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-static {p0}, Luj1;->δ(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnj1;->β:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    sget-object p1, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    if-eqz p1, :cond_2

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p2, p0}, Lnj1;->θ(Landroid/view/View;F)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0

    .line 37
    throw p1

    .line 38
    :cond_0
    invoke-static {}, Lnj1;->ζ()V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lnj1;->β:Ljava/lang/Object;

    .line 42
    .line 43
    monitor-enter p0

    .line 44
    :try_start_1
    invoke-static {p2}, Lnj1;->β(Landroid/view/View;)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    sget-object p1, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 56
    const/4 v0, 0x1

    .line 57
    goto :goto_0

    .line 58
    :catchall_1
    move-exception p1

    .line 59
    goto :goto_3

    .line 60
    :cond_1
    const/4 p1, 0x0

    .line 61
    const/4 v0, 0x0

    .line 62
    :goto_0
    monitor-exit p0

    .line 63
    if-eqz v0, :cond_3

    .line 64
    .line 65
    check-cast p1, Ljava/lang/Float;

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 70
    .line 71
    .line 72
    move-result p0

    .line 73
    invoke-static {p2, p0}, Lnj1;->θ(Landroid/view/View;F)V

    .line 74
    .line 75
    .line 76
    :cond_2
    return-void

    .line 77
    :cond_3
    monitor-enter p0

    .line 78
    :try_start_2
    sget-object p1, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 79
    .line 80
    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    check-cast v0, Ljava/lang/Float;

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    goto :goto_1

    .line 93
    :catchall_2
    move-exception p1

    .line 94
    goto :goto_2

    .line 95
    :cond_4
    sget-object v0, Lrj1;->α:Ljava/util/Set;

    .line 96
    .line 97
    invoke-virtual {p2}, Landroid/view/View;->getAlpha()F

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    const/high16 v1, 0x3f800000    # 1.0f

    .line 102
    .line 103
    invoke-static {v0, v1}, Lrj1;->α(FF)F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {p1, p2, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 112
    .line 113
    .line 114
    move p1, v0

    .line 115
    :goto_1
    monitor-exit p0

    .line 116
    sget-object p0, Lrj1;->α:Ljava/util/Set;

    .line 117
    .line 118
    sget p0, Lnj1;->η:F

    .line 119
    .line 120
    invoke-static {p1, p0}, Lrj1;->α(FF)F

    .line 121
    .line 122
    .line 123
    move-result p0

    .line 124
    invoke-static {p2, p0}, Lnj1;->θ(Landroid/view/View;F)V

    .line 125
    .line 126
    .line 127
    return-void

    .line 128
    :goto_2
    monitor-exit p0

    .line 129
    throw p1

    .line 130
    :goto_3
    monitor-exit p0

    .line 131
    throw p1
.end method

.method public static final β(Lqj1;Ljava/lang/Object;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-static {p1}, Luj1;->ε(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object p1, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 6
    .line 7
    invoke-static {p0}, Luj1;->δ(Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-nez p0, :cond_1

    .line 12
    .line 13
    sget-object p0, Lnj1;->β:Ljava/lang/Object;

    .line 14
    .line 15
    monitor-enter p0

    .line 16
    :try_start_0
    sget-object p1, Lnj1;->ε:Ljava/util/WeakHashMap;

    .line 17
    .line 18
    invoke-virtual {p1, p2}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    check-cast p1, Ljava/lang/Float;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    monitor-exit p0

    .line 25
    if-eqz p1, :cond_0

    .line 26
    .line 27
    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    invoke-static {p2, p0}, Lnj1;->θ(Landroid/view/View;F)V

    .line 32
    .line 33
    .line 34
    :cond_0
    return-void

    .line 35
    :catchall_0
    move-exception p1

    .line 36
    monitor-exit p0

    .line 37
    throw p1

    .line 38
    :cond_1
    invoke-static {}, Lnj1;->ζ()V

    .line 39
    .line 40
    .line 41
    new-instance p0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    sget-object p1, Lnj1;->β:Ljava/lang/Object;

    .line 47
    .line 48
    monitor-enter p1

    .line 49
    :try_start_1
    sget-object v0, Lnj1;->δ:Ljava/util/WeakHashMap;

    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/util/WeakHashMap;->entrySet()Ljava/util/Set;

    .line 52
    .line 53
    .line 54
    move-result-object v0

    .line 55
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-eqz v1, :cond_6

    .line 64
    .line 65
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 70
    .line 71
    .line 72
    check-cast v1, Ljava/util/Map$Entry;

    .line 73
    .line 74
    sget-object v2, Lnj1;->α:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    check-cast v2, Landroid/view/View;

    .line 84
    .line 85
    :goto_1
    if-eqz v2, :cond_5

    .line 86
    .line 87
    if-ne v2, p2, :cond_3

    .line 88
    .line 89
    const/4 v2, 0x1

    .line 90
    goto :goto_2

    .line 91
    :cond_3
    invoke-virtual {v2}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    instance-of v3, v2, Landroid/view/View;

    .line 96
    .line 97
    if-eqz v3, :cond_4

    .line 98
    .line 99
    check-cast v2, Landroid/view/View;

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_4
    const/4 v2, 0x0

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    const/4 v2, 0x0

    .line 105
    :goto_2
    if-eqz v2, :cond_2

    .line 106
    .line 107
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 108
    .line 109
    .line 110
    move-result-object v2

    .line 111
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v1

    .line 115
    new-instance v3, Ll91;

    .line 116
    .line 117
    invoke-direct {v3, v2, v1}, Ll91;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    invoke-interface {v0}, Ljava/util/Iterator;->remove()V

    .line 124
    .line 125
    .line 126
    goto :goto_0

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    goto :goto_5

    .line 129
    :cond_6
    sget-object v0, Lnj1;->ε:Ljava/util/WeakHashMap;

    .line 130
    .line 131
    invoke-virtual {v0, p2}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v1

    .line 135
    check-cast v1, Ljava/lang/Float;

    .line 136
    .line 137
    if-eqz v1, :cond_7

    .line 138
    .line 139
    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    goto :goto_3

    .line 144
    :cond_7
    sget-object v1, Lrj1;->α:Ljava/util/Set;

    .line 145
    .line 146
    invoke-virtual {p2}, Landroid/view/View;->getAlpha()F

    .line 147
    .line 148
    .line 149
    move-result v1

    .line 150
    const/high16 v2, 0x3f800000    # 1.0f

    .line 151
    .line 152
    invoke-static {v1, v2}, Lrj1;->α(FF)F

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 157
    .line 158
    .line 159
    move-result-object v2

    .line 160
    invoke-virtual {v0, p2, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 161
    .line 162
    .line 163
    move v0, v1

    .line 164
    :goto_3
    monitor-exit p1

    .line 165
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 166
    .line 167
    .line 168
    move-result-object p0

    .line 169
    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 170
    .line 171
    .line 172
    move-result p1

    .line 173
    if-eqz p1, :cond_8

    .line 174
    .line 175
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    check-cast p1, Ll91;

    .line 180
    .line 181
    iget-object v1, p1, Ll91;->ε:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast v1, Landroid/view/View;

    .line 184
    .line 185
    iget-object p1, p1, Ll91;->ζ:Ljava/lang/Object;

    .line 186
    .line 187
    check-cast p1, Ljava/lang/Number;

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    .line 190
    .line 191
    .line 192
    move-result p1

    .line 193
    invoke-static {v1, p1}, Lnj1;->θ(Landroid/view/View;F)V

    .line 194
    .line 195
    .line 196
    goto :goto_4

    .line 197
    :cond_8
    sget-object p0, Lrj1;->α:Ljava/util/Set;

    .line 198
    .line 199
    sget p0, Lnj1;->η:F

    .line 200
    .line 201
    invoke-static {v0, p0}, Lrj1;->α(FF)F

    .line 202
    .line 203
    .line 204
    move-result p0

    .line 205
    invoke-static {p2, p0}, Lnj1;->θ(Landroid/view/View;F)V

    .line 206
    .line 207
    .line 208
    return-void

    .line 209
    :goto_5
    monitor-exit p1

    .line 210
    throw p0
.end method

.method public static ζ(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    sget-object v0, Lqj1;->γ:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string p0, "ProfileVideoOverlayAlphaHook: "

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Lux;->ρ(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method


# virtual methods
.method public final γ(Ljava/lang/ClassLoader;)Z
    .locals 10

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~7974716F46EDCCC8AB71015994E08EBF7057E4892C51F22F56F23F37A5FAABC9A96D4C6BD66211338CEF27A1FAB166CE0E4422D8132D6EA4"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const-string p0, "comment_class"

    .line 17
    .line 18
    const-string p1, "CommentInputFragment \u4e0d\u5b58\u5728\uff0c\u8df3\u8fc7\u8bc4\u8bba\u680f\u900f\u660e\u5ea6"

    .line 19
    .line 20
    invoke-static {p0, p1}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    sget-object v1, Luj1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    array-length v2, v1

    .line 34
    move v3, v0

    .line 35
    :goto_0
    const/4 v4, 0x0

    .line 36
    if-ge v3, v2, :cond_2

    .line 37
    .line 38
    aget-object v5, v1, v3

    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const-string v7, "onCreateView"

    .line 45
    .line 46
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v6

    .line 50
    if-eqz v6, :cond_1

    .line 51
    .line 52
    const-class v6, Landroid/view/View;

    .line 53
    .line 54
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 55
    .line 56
    .line 57
    move-result-object v7

    .line 58
    invoke-virtual {v6, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 59
    .line 60
    .line 61
    move-result v6

    .line 62
    if-eqz v6, :cond_1

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    move-result-object v6

    .line 68
    const-class v7, Landroid/view/ViewGroup;

    .line 69
    .line 70
    const-class v8, Landroid/os/Bundle;

    .line 71
    .line 72
    const-class v9, Landroid/view/LayoutInflater;

    .line 73
    .line 74
    filled-new-array {v9, v7, v8}, [Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_1

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_2
    move-object v5, v4

    .line 89
    :goto_1
    const/4 v1, 0x1

    .line 90
    if-eqz v5, :cond_3

    .line 91
    .line 92
    :try_start_0
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 93
    .line 94
    .line 95
    goto :goto_2

    .line 96
    :cond_3
    move-object v5, v4

    .line 97
    :catchall_0
    :goto_2
    if-nez v5, :cond_4

    .line 98
    .line 99
    const-string p0, "comment_create"

    .line 100
    .line 101
    const-string v2, "\u8bc4\u8bba\u680f onCreateView \u7ed3\u6784\u4e0d\u5339\u914d\uff0c\u8df3\u8fc7\u521d\u59cb\u900f\u660e\u5ea6"

    .line 102
    .line 103
    invoke-static {p0, v2}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    move p0, v0

    .line 107
    goto :goto_5

    .line 108
    :cond_4
    :try_start_1
    sget-object v2, Lxq0;->α:Lxq0;

    .line 109
    .line 110
    new-instance v3, Lpj1;

    .line 111
    .line 112
    invoke-direct {v3, p0, v0}, Lpj1;-><init>(Lqj1;I)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v2, v5, v3}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 116
    .line 117
    .line 118
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 119
    .line 120
    goto :goto_3

    .line 121
    :catchall_1
    move-exception p0

    .line 122
    new-instance v2, Leo1;

    .line 123
    .line 124
    invoke-direct {v2, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 125
    .line 126
    .line 127
    move-object p0, v2

    .line 128
    :goto_3
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 129
    .line 130
    .line 131
    move-result-object v2

    .line 132
    if-nez v2, :cond_5

    .line 133
    .line 134
    goto :goto_4

    .line 135
    :cond_5
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p0

    .line 139
    new-instance v2, Ljava/lang/StringBuilder;

    .line 140
    .line 141
    const-string v3, "\u8bc4\u8bba\u680f\u751f\u547d\u5468\u671f Hook \u5b89\u88c5\u5931\u8d25: "

    .line 142
    .line 143
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object p0

    .line 153
    const-string v2, "comment_create_install"

    .line 154
    .line 155
    invoke-static {v2, p0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 159
    .line 160
    :goto_4
    check-cast p0, Ljava/lang/Boolean;

    .line 161
    .line 162
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    :goto_5
    sget-object v2, Luj1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    array-length v2, p1

    .line 176
    move v3, v0

    .line 177
    :goto_6
    if-ge v3, v2, :cond_7

    .line 178
    .line 179
    aget-object v5, p1, v3

    .line 180
    .line 181
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 182
    .line 183
    .line 184
    move-result-object v6

    .line 185
    const-string v7, "y90"

    .line 186
    .line 187
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    move-result v6

    .line 191
    if-eqz v6, :cond_6

    .line 192
    .line 193
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 194
    .line 195
    .line 196
    move-result-object v6

    .line 197
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 198
    .line 199
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    move-result v6

    .line 203
    if-eqz v6, :cond_6

    .line 204
    .line 205
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 206
    .line 207
    .line 208
    move-result-object v6

    .line 209
    sget-object v7, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 210
    .line 211
    filled-new-array {v7}, [Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object v7

    .line 215
    invoke-static {v6, v7}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    if-eqz v6, :cond_6

    .line 220
    .line 221
    goto :goto_7

    .line 222
    :cond_6
    add-int/lit8 v3, v3, 0x1

    .line 223
    .line 224
    goto :goto_6

    .line 225
    :cond_7
    move-object v5, v4

    .line 226
    :goto_7
    if-eqz v5, :cond_8

    .line 227
    .line 228
    :try_start_2
    invoke-virtual {v5, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 229
    .line 230
    .line 231
    :catchall_2
    move-object v4, v5

    .line 232
    :cond_8
    if-nez v4, :cond_9

    .line 233
    .line 234
    const-string p1, "comment_alpha"

    .line 235
    .line 236
    const-string v0, "\u5bbf\u4e3b\u8bc4\u8bba\u680f\u52a8\u6001 alpha \u65b9\u6cd5\u672a\u547d\u4e2d\uff0c\u4fdd\u7559\u521d\u59cb\u900f\u660e\u5ea6\u964d\u7ea7"

    .line 237
    .line 238
    invoke-static {p1, v0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    goto :goto_a

    .line 242
    :cond_9
    :try_start_3
    sget-object p1, Lxq0;->α:Lxq0;

    .line 243
    .line 244
    new-instance v2, Lad1;

    .line 245
    .line 246
    const/16 v3, 0xa

    .line 247
    .line 248
    invoke-direct {v2, v3}, Lad1;-><init>(I)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1, v4, v2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 252
    .line 253
    .line 254
    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 255
    .line 256
    goto :goto_8

    .line 257
    :catchall_3
    move-exception p1

    .line 258
    new-instance v2, Leo1;

    .line 259
    .line 260
    invoke-direct {v2, p1}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 261
    .line 262
    .line 263
    move-object p1, v2

    .line 264
    :goto_8
    invoke-static {p1}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 265
    .line 266
    .line 267
    move-result-object v2

    .line 268
    if-nez v2, :cond_a

    .line 269
    .line 270
    goto :goto_9

    .line 271
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    move-result-object p1

    .line 275
    new-instance v2, Ljava/lang/StringBuilder;

    .line 276
    .line 277
    const-string v3, "\u8bc4\u8bba\u680f\u52a8\u6001 alpha Hook \u5b89\u88c5\u5931\u8d25: "

    .line 278
    .line 279
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 283
    .line 284
    .line 285
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 286
    .line 287
    .line 288
    move-result-object p1

    .line 289
    const-string v2, "comment_alpha_install"

    .line 290
    .line 291
    invoke-static {v2, p1}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 292
    .line 293
    .line 294
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 295
    .line 296
    :goto_9
    check-cast p1, Ljava/lang/Boolean;

    .line 297
    .line 298
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 299
    .line 300
    .line 301
    move-result p1

    .line 302
    if-nez p0, :cond_b

    .line 303
    .line 304
    if-eqz p1, :cond_c

    .line 305
    .line 306
    :cond_b
    move v0, v1

    .line 307
    :cond_c
    move p0, v0

    .line 308
    :goto_a
    return p0
.end method

.method public final δ(Ljava/lang/ClassLoader;)Z
    .locals 9

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~78DF588B0EC79FAF9E614C08184F8649CB64E2954C8C7DAB573EB3C6BF6486D9CA923ECD4F3CA9B9F844040DE3B405B321C12B300DF2FF5847E2041E475509941D7375173DEE04AE352B86D239ED54EBA58B"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    const-string p0, "search_class"

    .line 17
    .line 18
    const-string p1, "SearchBarViewHolder \u4e0d\u5b58\u5728\uff0c\u8df3\u8fc7\u9876\u90e8\u641c\u7d22\u6846\u900f\u660e\u5ea6"

    .line 19
    .line 20
    invoke-static {p0, p1}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    sget-object v1, Luj1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    new-instance v1, Ljava/util/ArrayList;

    .line 34
    .line 35
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 36
    .line 37
    .line 38
    array-length v2, p1

    .line 39
    move v3, v0

    .line 40
    :goto_0
    const/4 v4, 0x1

    .line 41
    if-ge v3, v2, :cond_2

    .line 42
    .line 43
    aget-object v5, p1, v3

    .line 44
    .line 45
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v7

    .line 53
    sget-object v8, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    invoke-static {v7, v8}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v7

    .line 59
    if-eqz v7, :cond_1

    .line 60
    .line 61
    array-length v7, v6

    .line 62
    const/4 v8, 0x3

    .line 63
    if-ne v7, v8, :cond_1

    .line 64
    .line 65
    const-class v7, Landroid/view/View;

    .line 66
    .line 67
    aget-object v8, v6, v0

    .line 68
    .line 69
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 70
    .line 71
    .line 72
    move-result v7

    .line 73
    if-eqz v7, :cond_1

    .line 74
    .line 75
    aget-object v4, v6, v4

    .line 76
    .line 77
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    const-string v7, "~792076A9A8C9D37392B1BEA902D394F25696F0B296E3734A64899A3BF2D3979A9BE4B6F08420571E569B93E597"

    .line 82
    .line 83
    invoke-static {v7}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v7

    .line 87
    invoke-virtual {v4, v7}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    move-result v4

    .line 91
    if-eqz v4, :cond_1

    .line 92
    .line 93
    const/4 v4, 0x2

    .line 94
    aget-object v4, v6, v4

    .line 95
    .line 96
    sget-object v6, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v4

    .line 102
    if-eqz v4, :cond_1

    .line 103
    .line 104
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 108
    .line 109
    goto :goto_0

    .line 110
    :cond_2
    invoke-static {v1}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    check-cast p1, Ljava/lang/reflect/Method;

    .line 115
    .line 116
    if-eqz p1, :cond_3

    .line 117
    .line 118
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 119
    .line 120
    .line 121
    goto :goto_1

    .line 122
    :cond_3
    const/4 p1, 0x0

    .line 123
    :catchall_0
    :goto_1
    if-nez p1, :cond_4

    .line 124
    .line 125
    const-string p0, "search_method"

    .line 126
    .line 127
    const-string p1, "\u641c\u7d22\u7ed1\u5b9a\u65b9\u6cd5\u7ed3\u6784\u4e0d\u5339\u914d\uff0c\u8df3\u8fc7\u9876\u90e8\u641c\u7d22\u6846\u900f\u660e\u5ea6"

    .line 128
    .line 129
    invoke-static {p0, p1}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    return v0

    .line 133
    :cond_4
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 134
    .line 135
    new-instance v1, Lad1;

    .line 136
    .line 137
    const/16 v2, 0xb

    .line 138
    .line 139
    invoke-direct {v1, v2, p0}, Lad1;-><init>(ILjava/lang/Object;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, p1, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 143
    .line 144
    .line 145
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 146
    .line 147
    goto :goto_2

    .line 148
    :catchall_1
    move-exception p0

    .line 149
    new-instance p1, Leo1;

    .line 150
    .line 151
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 152
    .line 153
    .line 154
    move-object p0, p1

    .line 155
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    if-nez p1, :cond_5

    .line 160
    .line 161
    goto :goto_3

    .line 162
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object p0

    .line 166
    new-instance p1, Ljava/lang/StringBuilder;

    .line 167
    .line 168
    const-string v0, "\u641c\u7d22\u6846 Hook \u5b89\u88c5\u5931\u8d25: "

    .line 169
    .line 170
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    const-string p1, "search_install"

    .line 181
    .line 182
    invoke-static {p1, p0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 183
    .line 184
    .line 185
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 186
    .line 187
    :goto_3
    check-cast p0, Ljava/lang/Boolean;

    .line 188
    .line 189
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 190
    .line 191
    .line 192
    move-result p0

    .line 193
    return p0
.end method

.method public final ε(Ljava/lang/ClassLoader;)Z
    .locals 8

    .line 1
    sget-object v0, Lqe0;->α:Ljava/lang/Object;

    .line 2
    .line 3
    const-string v0, "~78FFFE05059D677C5F115118CB977FD0DCE8657A2E98D251DB866B63984386F2A0411E448BECDC6B84344ACF6911540122A04C3456A0135425432108287CC6CFDC2964B80B9BA7AB0F16AE93A58D0BBDA47F16F7F066A1090EC6"

    .line 4
    .line 5
    invoke-static {v0}, Ljf0;->α(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {p1, v0}, Lqe0;->ι(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    const/4 v0, 0x0

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    return v0

    .line 17
    :cond_0
    sget-object v1, Luj1;->α:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    new-instance v1, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 29
    .line 30
    .line 31
    array-length v2, p1

    .line 32
    move v3, v0

    .line 33
    :goto_0
    const/4 v4, 0x1

    .line 34
    if-ge v3, v2, :cond_2

    .line 35
    .line 36
    aget-object v5, p1, v3

    .line 37
    .line 38
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    sget-object v7, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 43
    .line 44
    invoke-static {v6, v7}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-eqz v6, :cond_1

    .line 49
    .line 50
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v6

    .line 54
    array-length v6, v6

    .line 55
    if-ne v6, v4, :cond_1

    .line 56
    .line 57
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    aget-object v4, v4, v0

    .line 62
    .line 63
    const-class v6, Landroid/view/View;

    .line 64
    .line 65
    invoke-static {v4, v6}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_1

    .line 70
    .line 71
    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    :cond_1
    add-int/lit8 v3, v3, 0x1

    .line 75
    .line 76
    goto :goto_0

    .line 77
    :cond_2
    invoke-static {v1}, Lxh;->Э(Ljava/util/List;)Ljava/lang/Object;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    check-cast p1, Ljava/lang/reflect/Method;

    .line 82
    .line 83
    if-eqz p1, :cond_3

    .line 84
    .line 85
    :try_start_0
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 86
    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    const/4 p1, 0x0

    .line 90
    :catchall_0
    :goto_1
    if-nez p1, :cond_4

    .line 91
    .line 92
    const-string p0, "ultra_comment_method"

    .line 93
    .line 94
    const-string p1, "\u65b0\u7248\u8bc4\u8bba\u5e95\u680f\u7ed1\u5b9a\u65b9\u6cd5\u7ed3\u6784\u4e0d\u5339\u914d\uff0c\u4f7f\u7528\u5b50 Fragment \u964d\u7ea7"

    .line 95
    .line 96
    invoke-static {p0, p1}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    return v0

    .line 100
    :cond_4
    :try_start_1
    sget-object v0, Lxq0;->α:Lxq0;

    .line 101
    .line 102
    new-instance v1, Lpj1;

    .line 103
    .line 104
    invoke-direct {v1, p0, v4}, Lpj1;-><init>(Lqj1;I)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p1, v1}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 108
    .line 109
    .line 110
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :catchall_1
    move-exception p0

    .line 114
    new-instance p1, Leo1;

    .line 115
    .line 116
    invoke-direct {p1, p0}, Leo1;-><init>(Ljava/lang/Throwable;)V

    .line 117
    .line 118
    .line 119
    move-object p0, p1

    .line 120
    :goto_2
    invoke-static {p0}, Lfo1;->α(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 121
    .line 122
    .line 123
    move-result-object p1

    .line 124
    if-nez p1, :cond_5

    .line 125
    .line 126
    goto :goto_3

    .line 127
    :cond_5
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    new-instance p1, Ljava/lang/StringBuilder;

    .line 132
    .line 133
    const-string v0, "\u65b0\u7248\u8bc4\u8bba\u5e95\u680f Hook \u5b89\u88c5\u5931\u8d25: "

    .line 134
    .line 135
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    const-string p1, "ultra_comment_install"

    .line 146
    .line 147
    invoke-static {p1, p0}, Lqj1;->ζ(Ljava/lang/String;Ljava/lang/String;)V

    .line 148
    .line 149
    .line 150
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 151
    .line 152
    :goto_3
    check-cast p0, Ljava/lang/Boolean;

    .line 153
    .line 154
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 155
    .line 156
    .line 157
    move-result p0

    .line 158
    return p0
.end method
