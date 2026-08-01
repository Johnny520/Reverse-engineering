.class public final Lr0/L0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Le0/a;


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/util/WeakHashMap;

.field public final c:Ljava/util/Set;

.field public final d:Ljava/util/Set;

.field public final e:Ljava/util/Set;

.field public final f:Ljava/util/Set;

.field public final g:Ljava/util/Set;

.field public final h:Ljava/util/WeakHashMap;

.field public i:J

.field public j:Ljava/util/Set;

.field public k:Ljava/util/Set;

.field public final l:Ljava/lang/Object;

.field public final m:Ljava/lang/Object;

.field public n:Ljava/lang/Object;

.field public o:Ljava/lang/Object;


# direct methods
.method public constructor <init>(I)V
    .locals 1

    .line 1
    iput p1, p0, Lr0/L0;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 10
    .line 11
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 15
    .line 16
    .line 17
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    iput-object p1, p0, Lr0/L0;->c:Ljava/util/Set;

    .line 27
    .line 28
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    iput-object p1, p0, Lr0/L0;->d:Ljava/util/Set;

    .line 38
    .line 39
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 40
    .line 41
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    iput-object p1, p0, Lr0/L0;->e:Ljava/util/Set;

    .line 49
    .line 50
    new-instance p1, Ljava/util/WeakHashMap;

    .line 51
    .line 52
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 53
    .line 54
    .line 55
    iput-object p1, p0, Lr0/L0;->b:Ljava/util/WeakHashMap;

    .line 56
    .line 57
    new-instance p1, Ljava/util/WeakHashMap;

    .line 58
    .line 59
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 60
    .line 61
    .line 62
    iput-object p1, p0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 63
    .line 64
    new-instance p1, Ljava/util/WeakHashMap;

    .line 65
    .line 66
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    iput-object p1, p0, Lr0/L0;->f:Ljava/util/Set;

    .line 74
    .line 75
    new-instance p1, Ljava/util/WeakHashMap;

    .line 76
    .line 77
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iput-object p1, p0, Lr0/L0;->g:Ljava/util/Set;

    .line 85
    .line 86
    new-instance p1, Ljava/util/WeakHashMap;

    .line 87
    .line 88
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 89
    .line 90
    .line 91
    sget-object p1, LF0/u;->a:LF0/u;

    .line 92
    .line 93
    iput-object p1, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 94
    .line 95
    const-string p1, "com.tencent.mm.ui.transmit.recent.i"

    .line 96
    .line 97
    const-string v0, "com.tencent.mm.ui.transmit.recent.d"

    .line 98
    .line 99
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {p1}, LF0/w;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    iput-object p1, p0, Lr0/L0;->k:Ljava/util/Set;

    .line 108
    .line 109
    const-string p1, "com.tencent.mm.ui.mvvm.datasource.a"

    .line 110
    .line 111
    const-string v0, "com.tencent.mm.ui.mvvm.a.a.a"

    .line 112
    .line 113
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-static {p1}, LF0/w;->a0([Ljava/lang/Object;)Ljava/util/Set;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    iput-object p1, p0, Lr0/L0;->l:Ljava/lang/Object;

    .line 122
    .line 123
    const-string p1, "com.tencent.mm.ui.contact.p6"

    .line 124
    .line 125
    invoke-static {p1}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    iput-object p1, p0, Lr0/L0;->m:Ljava/lang/Object;

    .line 130
    .line 131
    const-string p1, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    .line 132
    .line 133
    invoke-static {p1}, LD/h;->T(Ljava/lang/Object;)Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    return-void

    .line 137
    :pswitch_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    .line 139
    .line 140
    new-instance p1, Ljava/util/WeakHashMap;

    .line 141
    .line 142
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 143
    .line 144
    .line 145
    iput-object p1, p0, Lr0/L0;->b:Ljava/util/WeakHashMap;

    .line 146
    .line 147
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 148
    .line 149
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 150
    .line 151
    .line 152
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iput-object p1, p0, Lr0/L0;->c:Ljava/util/Set;

    .line 157
    .line 158
    new-instance p1, Ljava/util/WeakHashMap;

    .line 159
    .line 160
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 161
    .line 162
    .line 163
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object p1

    .line 167
    iput-object p1, p0, Lr0/L0;->d:Ljava/util/Set;

    .line 168
    .line 169
    new-instance p1, Ljava/util/WeakHashMap;

    .line 170
    .line 171
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, p0, Lr0/L0;->e:Ljava/util/Set;

    .line 179
    .line 180
    new-instance p1, Ljava/util/WeakHashMap;

    .line 181
    .line 182
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    iput-object p1, p0, Lr0/L0;->f:Ljava/util/Set;

    .line 190
    .line 191
    new-instance p1, Ljava/util/WeakHashMap;

    .line 192
    .line 193
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 194
    .line 195
    .line 196
    invoke-static {p1}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iput-object p1, p0, Lr0/L0;->g:Ljava/util/Set;

    .line 201
    .line 202
    new-instance p1, Ljava/util/WeakHashMap;

    .line 203
    .line 204
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 205
    .line 206
    .line 207
    iput-object p1, p0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 208
    .line 209
    new-instance p1, Ljava/util/WeakHashMap;

    .line 210
    .line 211
    invoke-direct {p1}, Ljava/util/WeakHashMap;-><init>()V

    .line 212
    .line 213
    .line 214
    iput-object p1, p0, Lr0/L0;->l:Ljava/lang/Object;

    .line 215
    .line 216
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 217
    .line 218
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 219
    .line 220
    .line 221
    iput-object p1, p0, Lr0/L0;->m:Ljava/lang/Object;

    .line 222
    .line 223
    new-instance p1, Ljava/util/IdentityHashMap;

    .line 224
    .line 225
    invoke-direct {p1}, Ljava/util/IdentityHashMap;-><init>()V

    .line 226
    .line 227
    .line 228
    iput-object p1, p0, Lr0/L0;->n:Ljava/lang/Object;

    .line 229
    .line 230
    new-instance p1, Ljava/lang/ThreadLocal;

    .line 231
    .line 232
    invoke-direct {p1}, Ljava/lang/ThreadLocal;-><init>()V

    .line 233
    .line 234
    .line 235
    iput-object p1, p0, Lr0/L0;->o:Ljava/lang/Object;

    .line 236
    .line 237
    sget-object p1, LF0/u;->a:LF0/u;

    .line 238
    .line 239
    iput-object p1, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 240
    .line 241
    iput-object p1, p0, Lr0/L0;->k:Ljava/util/Set;

    .line 242
    .line 243
    return-void

    .line 244
    nop

    .line 245
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
.end method

.method public static B(Landroid/view/View;)Ljava/lang/Object;
    .locals 3

    .line 1
    :try_start_0
    const-string v0, "getAdapter"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 7
    .line 8
    invoke-interface {v2, p0, v0, v1}, Ld0/a;->c(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    goto :goto_0

    .line 13
    :catchall_0
    move-exception p0

    .line 14
    new-instance v0, LE0/d;

    .line 15
    .line 16
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 17
    .line 18
    .line 19
    move-object p0, v0

    .line 20
    :goto_0
    nop

    .line 21
    instance-of v0, p0, LE0/d;

    .line 22
    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    :cond_0
    return-object p0
.end method

.method public static C(Landroid/view/View;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, -0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    if-ne v0, v1, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    new-instance v0, LE0/d;

    .line 21
    .line 22
    invoke-direct {v0, p0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p0, v0

    .line 26
    :goto_0
    nop

    .line 27
    instance-of v0, p0, LE0/d;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    move-object v2, p0

    .line 33
    :goto_1
    check-cast v2, Ljava/lang/String;

    .line 34
    .line 35
    return-object v2
.end method

.method public static O(Landroid/widget/ListView;)Z
    .locals 6

    .line 1
    invoke-static {p0}, Lr0/L0;->C(Landroid/view/View;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-string v1, "mil"

    .line 6
    .line 7
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    const/4 v2, 0x0

    .line 12
    if-nez v1, :cond_0

    .line 13
    .line 14
    const-string v1, "q0h"

    .line 15
    .line 16
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getRootView()Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    if-nez p0, :cond_1

    .line 28
    .line 29
    :goto_0
    return v2

    .line 30
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    move v1, v2

    .line 35
    :goto_1
    const/16 v3, 0x8

    .line 36
    .line 37
    const/4 v4, 0x1

    .line 38
    if-ge v1, v3, :cond_5

    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v5, "com.tencent.mm.ui.transmit.SelectConversationUI"

    .line 49
    .line 50
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_2

    .line 55
    .line 56
    goto :goto_5

    .line 57
    :cond_2
    :try_start_0
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v3

    .line 61
    const-string v5, "mBase"

    .line 62
    .line 63
    invoke-virtual {v3, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 64
    .line 65
    .line 66
    move-result-object v3

    .line 67
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    instance-of v3, v0, Landroid/content/Context;

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    check-cast v0, Landroid/content/Context;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    .line 80
    goto :goto_2

    .line 81
    :catchall_0
    move-exception v0

    .line 82
    goto :goto_3

    .line 83
    :cond_3
    const/4 v0, 0x0

    .line 84
    :goto_2
    if-nez v0, :cond_4

    .line 85
    .line 86
    goto :goto_4

    .line 87
    :goto_3
    new-instance v3, LE0/d;

    .line 88
    .line 89
    invoke-direct {v3, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    move-object v0, v3

    .line 93
    :cond_4
    invoke-static {v0}, LE0/e;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 94
    .line 95
    .line 96
    move-result-object v3

    .line 97
    if-nez v3, :cond_5

    .line 98
    .line 99
    add-int/lit8 v1, v1, 0x1

    .line 100
    .line 101
    goto :goto_1

    .line 102
    :cond_5
    :goto_4
    invoke-static {p0}, Lr0/L0;->z(Landroid/view/View;)Z

    .line 103
    .line 104
    .line 105
    move-result p0

    .line 106
    if-eqz p0, :cond_6

    .line 107
    .line 108
    :goto_5
    move v2, v4

    .line 109
    :cond_6
    return v2
.end method

.method public static final a(Lr0/L0;Landroid/app/Activity;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/L0;->g:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-eqz p1, :cond_2

    .line 15
    .line 16
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    if-nez p1, :cond_1

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    new-instance v1, Lr0/I0;

    .line 28
    .line 29
    invoke-direct {v1, p1, p0}, Lr0/I0;-><init>(Landroid/view/View;Lr0/L0;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnPreDrawListener(Landroid/view/ViewTreeObserver$OnPreDrawListener;)V

    .line 33
    .line 34
    .line 35
    :cond_2
    :goto_0
    return-void
.end method

.method public static final b(Lr0/L0;Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;Ljava/util/Set;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->getResult()Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    instance-of v1, v0, Ljava/util/List;

    .line 9
    .line 10
    if-eqz v1, :cond_3

    .line 11
    .line 12
    check-cast v0, Ljava/util/List;

    .line 13
    .line 14
    new-instance v1, Ljava/util/ArrayList;

    .line 15
    .line 16
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result v3

    .line 31
    if-eqz v3, :cond_2

    .line 32
    .line 33
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {p0, v3}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    if-nez v4, :cond_0

    .line 48
    .line 49
    :cond_1
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 58
    .line 59
    .line 60
    move-result p2

    .line 61
    if-eq p0, p2, :cond_5

    .line 62
    .line 63
    invoke-virtual {p1, v1}, Lde/robv/android/xposed/XC_MethodHook$MethodHookParam;->setResult(Ljava/lang/Object;)V

    .line 64
    .line 65
    .line 66
    return-void

    .line 67
    :cond_3
    invoke-static {v0}, LN0/o;->c(Ljava/lang/Object;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-eqz p1, :cond_5

    .line 72
    .line 73
    const-string p1, "null cannot be cast to non-null type kotlin.collections.MutableMap<kotlin.Any?, kotlin.Any?>"

    .line 74
    .line 75
    invoke-static {v0, p1}, LN0/g;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    instance-of p1, v0, LO0/a;

    .line 79
    .line 80
    if-nez p1, :cond_4

    .line 81
    .line 82
    :try_start_0
    check-cast v0, Ljava/util/Map;
    :try_end_0
    .catch Ljava/lang/ClassCastException; {:try_start_0 .. :try_end_0} :catch_0

    .line 83
    .line 84
    invoke-virtual {p0, v0, p2}, Lr0/L0;->w(Ljava/util/Map;Ljava/util/Set;)Z

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    :catch_0
    move-exception p0

    .line 89
    const-class p1, LN0/o;

    .line 90
    .line 91
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object p1

    .line 95
    invoke-static {p0, p1}, LN0/g;->f(Ljava/lang/RuntimeException;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    throw p0

    .line 99
    :cond_4
    const-string p0, "kotlin.collections.MutableMap"

    .line 100
    .line 101
    invoke-static {v0, p0}, LN0/o;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    const/4 p0, 0x0

    .line 105
    throw p0

    .line 106
    :cond_5
    return-void
.end method

.method public static final c(Lr0/L0;Ljava/lang/Object;Ljava/util/Set;)V
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    invoke-static {v0}, Lr0/L0;->h(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    :cond_1
    move v2, v1

    .line 21
    :catchall_0
    :cond_2
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_6

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    check-cast v3, Ljava/lang/reflect/Field;

    .line 32
    .line 33
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v4

    .line 37
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_3

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_3
    const/4 v4, 0x1

    .line 45
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    invoke-static {v3}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_5

    .line 57
    .line 58
    check-cast v3, Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {p0, v3, p2}, Lr0/L0;->v(Ljava/util/List;Ljava/util/Set;)Z

    .line 61
    .line 62
    .line 63
    move-result v3

    .line 64
    if-nez v3, :cond_4

    .line 65
    .line 66
    if-eqz v2, :cond_1

    .line 67
    .line 68
    :cond_4
    :goto_1
    move v2, v4

    .line 69
    goto :goto_0

    .line 70
    :cond_5
    invoke-static {v3}, LN0/o;->c(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v5

    .line 74
    if-eqz v5, :cond_2

    .line 75
    .line 76
    check-cast v3, Ljava/util/Map;

    .line 77
    .line 78
    invoke-virtual {p0, v3, p2}, Lr0/L0;->w(Ljava/util/Map;Ljava/util/Set;)Z

    .line 79
    .line 80
    .line 81
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 82
    if-nez v3, :cond_4

    .line 83
    .line 84
    if-eqz v2, :cond_1

    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_6
    :goto_2
    return-void
.end method

.method public static final d(Lr0/L0;)Z
    .locals 5

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    invoke-virtual {p0}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string v0, "getStackTrace(...)"

    .line 13
    .line 14
    invoke-static {p0, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    array-length v0, p0

    .line 18
    const/4 v1, 0x0

    .line 19
    move v2, v1

    .line 20
    :goto_0
    if-ge v2, v0, :cond_2

    .line 21
    .line 22
    aget-object v3, p0, v2

    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    const-string v4, "com.tencent.mm.ui.contact.item.q1"

    .line 29
    .line 30
    invoke-static {v3, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    .line 32
    .line 33
    move-result v4

    .line 34
    if-nez v4, :cond_1

    .line 35
    .line 36
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    const-string v4, "com.tencent.mm.ui.mvvm.uic.conversation.recent."

    .line 40
    .line 41
    invoke-static {v3, v1, v4}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 42
    .line 43
    .line 44
    move-result v4

    .line 45
    if-nez v4, :cond_1

    .line 46
    .line 47
    const-string v4, "com.tencent.mm.ui.transmit.recent."

    .line 48
    .line 49
    invoke-static {v3, v1, v4}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 50
    .line 51
    .line 52
    move-result v3

    .line 53
    if-eqz v3, :cond_0

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    :goto_1
    const/4 p0, 0x1

    .line 60
    return p0

    .line 61
    :cond_2
    return v1
.end method

.method public static final e(Lr0/L0;Landroid/widget/ListView;Z)V
    .locals 10

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    goto/16 :goto_6

    .line 11
    .line 12
    :cond_0
    instance-of v1, v0, Landroid/widget/HeaderViewListAdapter;

    .line 13
    .line 14
    if-eqz v1, :cond_2

    .line 15
    .line 16
    move-object v1, v0

    .line 17
    check-cast v1, Landroid/widget/HeaderViewListAdapter;

    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    if-nez v1, :cond_1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    move-object v0, v1

    .line 27
    :cond_2
    :goto_0
    iget-object v1, p0, Lr0/L0;->e:Ljava/util/Set;

    .line 28
    .line 29
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    iget-object v3, p0, Lr0/L0;->c:Ljava/util/Set;

    .line 38
    .line 39
    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-nez v3, :cond_3

    .line 44
    .line 45
    goto/16 :goto_5

    .line 46
    .line 47
    :cond_3
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 54
    .line 55
    const-string v6, "getItem"

    .line 56
    .line 57
    invoke-interface {v5, v2, v6, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const/4 v5, 0x0

    .line 62
    new-array v6, v5, [Ljava/lang/Object;

    .line 63
    .line 64
    sget-object v7, Lc0/f;->b:Ld0/b;

    .line 65
    .line 66
    const-string v8, "getCount"

    .line 67
    .line 68
    invoke-interface {v7, v2, v8, v6}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object v7

    .line 76
    sget-object v8, Lc0/f;->b:Ld0/b;

    .line 77
    .line 78
    const-string v9, "getItemId"

    .line 79
    .line 80
    invoke-interface {v8, v2, v9, v7}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 81
    .line 82
    .line 83
    move-result-object v7

    .line 84
    if-eqz v4, :cond_4

    .line 85
    .line 86
    iget-object v8, p0, Lr0/L0;->m:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v8, Ljava/util/IdentityHashMap;

    .line 89
    .line 90
    invoke-virtual {v8, v2, v4}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    :cond_4
    if-eqz v6, :cond_5

    .line 94
    .line 95
    iget-object v8, p0, Lr0/L0;->n:Ljava/lang/Object;

    .line 96
    .line 97
    check-cast v8, Ljava/util/IdentityHashMap;

    .line 98
    .line 99
    invoke-virtual {v8, v2, v6}, Ljava/util/IdentityHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    :cond_5
    if-eqz v6, :cond_6

    .line 103
    .line 104
    if-eqz v4, :cond_6

    .line 105
    .line 106
    new-instance v8, Lr0/a1;

    .line 107
    .line 108
    const/4 v9, 0x0

    .line 109
    invoke-direct {v8, p0, v9}, Lr0/a1;-><init>(Lr0/L0;I)V

    .line 110
    .line 111
    .line 112
    invoke-static {v6, v8}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 113
    .line 114
    .line 115
    new-instance v6, Lr0/a1;

    .line 116
    .line 117
    const/4 v8, 0x1

    .line 118
    invoke-direct {v6, p0, v8}, Lr0/a1;-><init>(Lr0/L0;I)V

    .line 119
    .line 120
    .line 121
    invoke-static {v4, v6}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 122
    .line 123
    .line 124
    :cond_6
    if-eqz v7, :cond_7

    .line 125
    .line 126
    new-instance v4, Lr0/a1;

    .line 127
    .line 128
    const/4 v6, 0x2

    .line 129
    invoke-direct {v4, p0, v6}, Lr0/a1;-><init>(Lr0/L0;I)V

    .line 130
    .line 131
    .line 132
    invoke-static {v7, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 133
    .line 134
    .line 135
    :cond_7
    new-array v4, v5, [Ljava/lang/Object;

    .line 136
    .line 137
    sget-object v5, Lc0/f;->b:Ld0/b;

    .line 138
    .line 139
    const-string v6, "notifyDataSetChanged"

    .line 140
    .line 141
    invoke-interface {v5, v2, v6, v4}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 142
    .line 143
    .line 144
    move-result-object v4

    .line 145
    if-eqz v4, :cond_8

    .line 146
    .line 147
    new-instance v5, Lr0/a1;

    .line 148
    .line 149
    const/4 v6, 0x3

    .line 150
    invoke-direct {v5, p0, v6}, Lr0/a1;-><init>(Lr0/L0;I)V

    .line 151
    .line 152
    .line 153
    invoke-static {v4, v5}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 154
    .line 155
    .line 156
    :cond_8
    :goto_1
    const/4 v4, 0x0

    .line 157
    if-eqz v2, :cond_b

    .line 158
    .line 159
    const-class v5, Ljava/lang/Object;

    .line 160
    .line 161
    invoke-virtual {v2, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 162
    .line 163
    .line 164
    move-result v5

    .line 165
    if-nez v5, :cond_b

    .line 166
    .line 167
    :try_start_0
    const-string v5, "getView"

    .line 168
    .line 169
    const-class v6, Landroid/view/View;

    .line 170
    .line 171
    const-class v7, Landroid/view/ViewGroup;

    .line 172
    .line 173
    filled-new-array {v3, v6, v7}, [Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    move-result-object v6

    .line 177
    invoke-virtual {v2, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 178
    .line 179
    .line 180
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 181
    goto :goto_2

    .line 182
    :catchall_0
    move-exception v5

    .line 183
    new-instance v6, LE0/d;

    .line 184
    .line 185
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 186
    .line 187
    .line 188
    move-object v5, v6

    .line 189
    :goto_2
    nop

    .line 190
    instance-of v6, v5, LE0/d;

    .line 191
    .line 192
    if-eqz v6, :cond_9

    .line 193
    .line 194
    goto :goto_3

    .line 195
    :cond_9
    move-object v4, v5

    .line 196
    :goto_3
    check-cast v4, Ljava/lang/reflect/Method;

    .line 197
    .line 198
    if-eqz v4, :cond_a

    .line 199
    .line 200
    goto :goto_4

    .line 201
    :cond_a
    invoke-virtual {v2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 202
    .line 203
    .line 204
    move-result-object v2

    .line 205
    goto :goto_1

    .line 206
    :cond_b
    :goto_4
    if-eqz v4, :cond_c

    .line 207
    .line 208
    new-instance v2, Lr0/a1;

    .line 209
    .line 210
    const/4 v3, 0x4

    .line 211
    invoke-direct {v2, p0, v3}, Lr0/a1;-><init>(Lr0/L0;I)V

    .line 212
    .line 213
    .line 214
    invoke-static {v4, v2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 215
    .line 216
    .line 217
    :cond_c
    :goto_5
    if-eqz p2, :cond_d

    .line 218
    .line 219
    if-eqz v1, :cond_d

    .line 220
    .line 221
    iget-object p0, p0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 222
    .line 223
    invoke-virtual {p0, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 224
    .line 225
    .line 226
    :try_start_1
    invoke-virtual {p1}, Landroid/widget/AbsListView;->invalidateViews()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 227
    .line 228
    .line 229
    :catchall_1
    :cond_d
    :goto_6
    return-void
.end method

.method public static final f(Lr0/L0;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lr0/L0;->n:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/lang/ClassLoader;

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    invoke-virtual {p0, v0}, Lr0/L0;->H(Ljava/lang/ClassLoader;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lr0/L0;->G(Ljava/lang/ClassLoader;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Lr0/L0;->F(Ljava/lang/ClassLoader;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v0}, Lr0/L0;->I(Ljava/lang/ClassLoader;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public static final g(Lr0/L0;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    return v0

    .line 8
    :cond_0
    iget-object v1, p0, Lr0/L0;->e:Ljava/util/Set;

    .line 9
    .line 10
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    sget-boolean p1, Lz0/i;->a:Z

    .line 17
    .line 18
    invoke-static {}, Lz0/g;->x()Z

    .line 19
    .line 20
    .line 21
    move-result p1

    .line 22
    if-eqz p1, :cond_1

    .line 23
    .line 24
    invoke-virtual {p0}, Lr0/L0;->m()Ljava/util/Set;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-nez p0, :cond_1

    .line 33
    .line 34
    const/4 p0, 0x1

    .line 35
    return p0

    .line 36
    :cond_1
    return v0
.end method

.method public static h(Ljava/lang/Class;)Ljava/util/ArrayList;
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
    const-string v2, "getDeclaredFields(...)"

    .line 21
    .line 22
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, LF0/q;->f0(Ljava/util/Collection;[Ljava/lang/Object;)Z

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

.method public static final i(Lr0/L0;Ljava/util/LinkedHashSet;Landroid/view/View;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-static {p2}, Lr0/L0;->C(Landroid/view/View;)Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    instance-of v0, p2, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    check-cast p2, Landroid/view/ViewGroup;

    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/view/ViewGroup;->getChildCount()I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    const/4 v1, 0x0

    .line 24
    :goto_0
    if-ge v1, v0, :cond_1

    .line 25
    .line 26
    invoke-virtual {p2, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    const-string v3, "getChildAt(...)"

    .line 31
    .line 32
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, p1, v2}, Lr0/L0;->i(Lr0/L0;Ljava/util/LinkedHashSet;Landroid/view/View;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    return-void
.end method

.method public static j(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/List;
    .locals 6

    .line 1
    sget-object v0, LF0/s;->a:LF0/s;

    .line 2
    .line 3
    if-eqz p0, :cond_7

    .line 4
    .line 5
    const/4 v1, 0x3

    .line 6
    if-le p1, v1, :cond_0

    .line 7
    .line 8
    goto/16 :goto_3

    .line 9
    .line 10
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 11
    .line 12
    if-eqz v1, :cond_3

    .line 13
    .line 14
    check-cast p0, Ljava/lang/String;

    .line 15
    .line 16
    invoke-static {p0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {p0}, LD/h;->E(Ljava/lang/Object;)Ljava/util/List;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    new-instance p1, Ljava/util/ArrayList;

    .line 29
    .line 30
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    :cond_1
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result p2

    .line 41
    if-eqz p2, :cond_2

    .line 42
    .line 43
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    move-object v0, p2

    .line 48
    check-cast v0, Ljava/lang/String;

    .line 49
    .line 50
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-nez v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {p1, p2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    return-object p1

    .line 61
    :cond_3
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result v1

    .line 65
    if-nez v1, :cond_4

    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    const-string v3, "java."

    .line 77
    .line 78
    const/4 v4, 0x0

    .line 79
    invoke-static {v2, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 80
    .line 81
    .line 82
    move-result v2

    .line 83
    if-nez v2, :cond_7

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v2

    .line 89
    const-string v3, "android."

    .line 90
    .line 91
    invoke-static {v2, v4, v3}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_5

    .line 96
    .line 97
    goto :goto_3

    .line 98
    :cond_5
    new-instance v0, Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    const-string v2, "getDeclaredFields(...)"

    .line 108
    .line 109
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 110
    .line 111
    .line 112
    array-length v2, v1

    .line 113
    :goto_1
    if-ge v4, v2, :cond_7

    .line 114
    .line 115
    aget-object v3, v1, v4

    .line 116
    .line 117
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 122
    .line 123
    .line 124
    move-result v5

    .line 125
    if-eqz v5, :cond_6

    .line 126
    .line 127
    goto :goto_2

    .line 128
    :cond_6
    const/4 v5, 0x1

    .line 129
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    add-int/2addr v5, p1

    .line 137
    invoke-static {v3, v5, p2}, Lr0/L0;->j(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 142
    .line 143
    .line 144
    :catchall_0
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 145
    .line 146
    goto :goto_1

    .line 147
    :cond_7
    :goto_3
    return-object v0
.end method

.method public static final k(Ljava/util/ArrayList;Landroid/view/View;)V
    .locals 4

    .line 1
    instance-of v0, p1, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-static {v0}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    const/4 v0, 0x0

    .line 30
    :goto_0
    if-nez v0, :cond_1

    .line 31
    .line 32
    const-string v0, ""

    .line 33
    .line 34
    :cond_1
    invoke-static {v0}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-nez v1, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    :cond_2
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    check-cast p1, Landroid/view/ViewGroup;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    const/4 v1, 0x0

    .line 54
    :goto_1
    if-ge v1, v0, :cond_3

    .line 55
    .line 56
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const-string v3, "getChildAt(...)"

    .line 61
    .line 62
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-static {p0, v2}, Lr0/L0;->k(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 66
    .line 67
    .line 68
    add-int/lit8 v1, v1, 0x1

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_3
    return-void
.end method

.method public static l(Ljava/util/Set;)Ljava/util/Set;
    .locals 6

    .line 1
    sget-boolean v0, Lz0/i;->a:Z

    .line 2
    .line 3
    invoke-static {}, Lz0/g;->i()Ljava/util/ArrayList;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    new-instance v1, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const-string v3, ""

    .line 21
    .line 22
    const/4 v4, 0x0

    .line 23
    if-eqz v2, :cond_3

    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    move-object v5, v2

    .line 30
    check-cast v5, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 31
    .line 32
    invoke-virtual {v5}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-eqz v5, :cond_1

    .line 37
    .line 38
    invoke-static {v5}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    :cond_1
    if-nez v4, :cond_2

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    move-object v3, v4

    .line 50
    :goto_1
    invoke-interface {p0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_0

    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_3
    new-instance p0, Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 70
    .line 71
    .line 72
    move-result v1

    .line 73
    if-eqz v1, :cond_8

    .line 74
    .line 75
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    check-cast v1, Lcom/lu/wxmask/bean/MaskItemBean;

    .line 80
    .line 81
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/MaskItemBean;->getMaskId()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v2

    .line 85
    if-eqz v2, :cond_4

    .line 86
    .line 87
    invoke-static {v2}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 92
    .line 93
    .line 94
    move-result-object v2

    .line 95
    goto :goto_3

    .line 96
    :cond_4
    move-object v2, v4

    .line 97
    :goto_3
    if-nez v2, :cond_5

    .line 98
    .line 99
    move-object v2, v3

    .line 100
    :cond_5
    invoke-virtual {v1}, Lcom/lu/wxmask/bean/MaskItemBean;->getTagName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    invoke-static {v1}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 107
    .line 108
    .line 109
    move-result-object v1

    .line 110
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    goto :goto_4

    .line 115
    :cond_6
    move-object v1, v4

    .line 116
    :goto_4
    if-nez v1, :cond_7

    .line 117
    .line 118
    move-object v1, v3

    .line 119
    :cond_7
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v1

    .line 123
    invoke-static {v1}, LF0/h;->Z([Ljava/lang/Object;)Ljava/util/List;

    .line 124
    .line 125
    .line 126
    move-result-object v1

    .line 127
    invoke-static {v1, p0}, LF0/q;->e0(Ljava/lang/Iterable;Ljava/util/AbstractCollection;)V

    .line 128
    .line 129
    .line 130
    goto :goto_2

    .line 131
    :cond_8
    new-instance v0, Ljava/util/ArrayList;

    .line 132
    .line 133
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 134
    .line 135
    .line 136
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 137
    .line 138
    .line 139
    move-result-object p0

    .line 140
    :cond_9
    :goto_5
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 141
    .line 142
    .line 143
    move-result v1

    .line 144
    if-eqz v1, :cond_a

    .line 145
    .line 146
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 147
    .line 148
    .line 149
    move-result-object v1

    .line 150
    move-object v2, v1

    .line 151
    check-cast v2, Ljava/lang/String;

    .line 152
    .line 153
    invoke-static {v2}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-nez v2, :cond_9

    .line 158
    .line 159
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 160
    .line 161
    .line 162
    goto :goto_5

    .line 163
    :cond_a
    invoke-static {v0}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    return-object p0
.end method

.method public static o(Landroid/widget/ListView;)Landroid/widget/ListAdapter;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x0

    .line 8
    return-object p0

    .line 9
    :cond_0
    instance-of v0, p0, Landroid/widget/HeaderViewListAdapter;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    move-object v0, p0

    .line 14
    check-cast v0, Landroid/widget/HeaderViewListAdapter;

    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getWrappedAdapter()Landroid/widget/ListAdapter;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    goto :goto_0

    .line 21
    :cond_1
    move-object v0, p0

    .line 22
    :goto_0
    if-nez v0, :cond_2

    .line 23
    .line 24
    return-object p0

    .line 25
    :cond_2
    return-object v0
.end method

.method public static p(Landroid/widget/ListView;I)Ljava/lang/Integer;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    invoke-virtual {p0}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    instance-of v1, p0, Landroid/widget/HeaderViewListAdapter;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    check-cast p0, Landroid/widget/HeaderViewListAdapter;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :cond_1
    move-object p0, v0

    .line 17
    :goto_0
    if-eqz p0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p0}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 20
    .line 21
    .line 22
    move-result p0

    .line 23
    goto :goto_1

    .line 24
    :cond_2
    const/4 p0, 0x0

    .line 25
    :goto_1
    sub-int/2addr p1, p0

    .line 26
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    if-ltz p1, :cond_3

    .line 31
    .line 32
    return-object p0

    .line 33
    :cond_3
    :goto_2
    return-object v0
.end method

.method public static q(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p1, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    move-object p1, p0

    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    const-string p2, "wxid_"

    .line 19
    .line 20
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    const-string p2, "@chatroom"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_2

    .line 33
    .line 34
    const-string p2, "gh_"

    .line 35
    .line 36
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_2

    .line 41
    .line 42
    const-string p2, "@openim"

    .line 43
    .line 44
    invoke-static {p1, p2, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p0, v0

    .line 52
    :cond_2
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v5, "java."

    .line 71
    .line 72
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_9

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-string v5, "android."

    .line 83
    .line 84
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v4, "getDeclaredFields(...)"

    .line 96
    .line 97
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    array-length v4, v1

    .line 101
    :goto_1
    if-ge v3, v4, :cond_9

    .line 102
    .line 103
    aget-object v5, v1, v3

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_6

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    :try_start_0
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    add-int/lit8 v6, p1, 0x1

    .line 124
    .line 125
    invoke-static {v5, v6, p2}, Lr0/L0;->q(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    goto :goto_2

    .line 130
    :catchall_0
    move-exception v5

    .line 131
    new-instance v6, LE0/d;

    .line 132
    .line 133
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v5, v6

    .line 137
    :goto_2
    nop

    .line 138
    instance-of v6, v5, LE0/d;

    .line 139
    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    move-object v5, v0

    .line 143
    :cond_7
    check-cast v5, Ljava/lang/String;

    .line 144
    .line 145
    if-eqz v5, :cond_8

    .line 146
    .line 147
    return-object v5

    .line 148
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_9
    :goto_4
    return-object v0
.end method

.method public static r(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_9

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p1, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_4

    .line 8
    .line 9
    :cond_0
    instance-of v1, p0, Ljava/lang/String;

    .line 10
    .line 11
    const/4 v2, 0x1

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v1, :cond_3

    .line 14
    .line 15
    move-object p1, p0

    .line 16
    check-cast p1, Ljava/lang/String;

    .line 17
    .line 18
    const-string p2, "wxid_"

    .line 19
    .line 20
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 21
    .line 22
    .line 23
    move-result p2

    .line 24
    if-nez p2, :cond_2

    .line 25
    .line 26
    const-string p2, "@chatroom"

    .line 27
    .line 28
    invoke-virtual {p1, p2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result p2

    .line 32
    if-nez p2, :cond_2

    .line 33
    .line 34
    const-string p2, "gh_"

    .line 35
    .line 36
    invoke-static {p1, v3, p2}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result p2

    .line 40
    if-nez p2, :cond_2

    .line 41
    .line 42
    const-string p2, "@openim"

    .line 43
    .line 44
    invoke-static {p1, p2, v2}, LU0/i;->i0(Ljava/lang/CharSequence;Ljava/lang/String;Z)Z

    .line 45
    .line 46
    .line 47
    move-result p1

    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    move-object p0, v0

    .line 52
    :cond_2
    :goto_0
    check-cast p0, Ljava/lang/String;

    .line 53
    .line 54
    return-object p0

    .line 55
    :cond_3
    invoke-interface {p2, p0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-nez v1, :cond_4

    .line 60
    .line 61
    goto :goto_4

    .line 62
    :cond_4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v4

    .line 70
    const-string v5, "java."

    .line 71
    .line 72
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    if-nez v4, :cond_9

    .line 77
    .line 78
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v4

    .line 82
    const-string v5, "android."

    .line 83
    .line 84
    invoke-static {v4, v3, v5}, LU0/q;->h0(Ljava/lang/String;ZLjava/lang/String;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_5

    .line 89
    .line 90
    goto :goto_4

    .line 91
    :cond_5
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    const-string v4, "getDeclaredFields(...)"

    .line 96
    .line 97
    invoke-static {v1, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    array-length v4, v1

    .line 101
    :goto_1
    if-ge v3, v4, :cond_9

    .line 102
    .line 103
    aget-object v5, v1, v3

    .line 104
    .line 105
    invoke-virtual {v5}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 106
    .line 107
    .line 108
    move-result v6

    .line 109
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 110
    .line 111
    .line 112
    move-result v6

    .line 113
    if-eqz v6, :cond_6

    .line 114
    .line 115
    goto :goto_3

    .line 116
    :cond_6
    :try_start_0
    invoke-virtual {v5, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {v5, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v5

    .line 123
    add-int/lit8 v6, p1, 0x1

    .line 124
    .line 125
    invoke-static {v5, v6, p2}, Lr0/L0;->r(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 129
    goto :goto_2

    .line 130
    :catchall_0
    move-exception v5

    .line 131
    new-instance v6, LE0/d;

    .line 132
    .line 133
    invoke-direct {v6, v5}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    move-object v5, v6

    .line 137
    :goto_2
    nop

    .line 138
    instance-of v6, v5, LE0/d;

    .line 139
    .line 140
    if-eqz v6, :cond_7

    .line 141
    .line 142
    move-object v5, v0

    .line 143
    :cond_7
    check-cast v5, Ljava/lang/String;

    .line 144
    .line 145
    if-eqz v5, :cond_8

    .line 146
    .line 147
    return-object v5

    .line 148
    :cond_8
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 149
    .line 150
    goto :goto_1

    .line 151
    :cond_9
    :goto_4
    return-object v0
.end method

.method public static synthetic s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p1, p0, v0}, Lr0/L0;->q(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static synthetic t(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;
    .locals 1

    .line 1
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const/4 p0, 0x0

    .line 14
    invoke-static {p1, p0, v0}, Lr0/L0;->r(Ljava/lang/Object;ILjava/util/Set;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method

.method public static z(Landroid/view/View;)Z
    .locals 5

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    move-object v0, p0

    .line 6
    check-cast v0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v0, 0x0

    .line 20
    :goto_0
    const-string v1, "\u9009\u62e9\u4e00\u4e2a\u804a\u5929"

    .line 21
    .line 22
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 30
    .line 31
    const/4 v1, 0x0

    .line 32
    if-eqz v0, :cond_3

    .line 33
    .line 34
    check-cast p0, Landroid/view/ViewGroup;

    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    move v2, v1

    .line 41
    :goto_1
    if-ge v2, v0, :cond_3

    .line 42
    .line 43
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    const-string v4, "getChildAt(...)"

    .line 48
    .line 49
    invoke-static {v3, v4}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v3}, Lr0/L0;->z(Landroid/view/View;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-eqz v3, :cond_2

    .line 57
    .line 58
    :goto_2
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_3
    return v1
.end method


# virtual methods
.method public A(Landroid/view/View;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {p0, v0}, Lr0/L0;->t(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/4 v1, 0x0

    .line 23
    :goto_0
    if-ge v1, v0, :cond_2

    .line 24
    .line 25
    invoke-virtual {p1, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "getChildAt(...)"

    .line 30
    .line 31
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lr0/L0;->A(Landroid/view/View;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-eqz v2, :cond_1

    .line 39
    .line 40
    return-object v2

    .line 41
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 p1, 0x0

    .line 45
    return-object p1
.end method

.method public D(Ljava/lang/Object;)Ljava/util/List;
    .locals 11

    .line 1
    iget-object v0, p0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/util/List;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    return-object v1

    .line 12
    :cond_0
    invoke-virtual {p0}, Lr0/L0;->m()Ljava/util/Set;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 17
    .line 18
    invoke-static {v1, v2}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    iget-object v2, p0, Lr0/L0;->k:Ljava/util/Set;

    .line 25
    .line 26
    goto :goto_0

    .line 27
    :cond_1
    invoke-static {v1}, Lr0/L0;->l(Ljava/util/Set;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    :goto_0
    iget-object v3, p0, Lr0/L0;->n:Ljava/lang/Object;

    .line 32
    .line 33
    check-cast v3, Ljava/util/IdentityHashMap;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    invoke-virtual {v3, v4}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v3

    .line 43
    check-cast v3, Ljava/lang/reflect/Method;

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    const/4 v5, 0x0

    .line 47
    if-nez v3, :cond_2

    .line 48
    .line 49
    goto :goto_2

    .line 50
    :cond_2
    :try_start_0
    new-array v6, v4, [Ljava/lang/Object;

    .line 51
    .line 52
    invoke-static {v3, p1, v6}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 56
    goto :goto_1

    .line 57
    :catchall_0
    move-exception v3

    .line 58
    new-instance v6, LE0/d;

    .line 59
    .line 60
    invoke-direct {v6, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 61
    .line 62
    .line 63
    move-object v3, v6

    .line 64
    :goto_1
    nop

    .line 65
    instance-of v6, v3, LE0/d;

    .line 66
    .line 67
    if-eqz v6, :cond_3

    .line 68
    .line 69
    move-object v3, v5

    .line 70
    :cond_3
    instance-of v6, v3, Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v6, :cond_4

    .line 73
    .line 74
    move-object v5, v3

    .line 75
    check-cast v5, Ljava/lang/Integer;

    .line 76
    .line 77
    :cond_4
    :goto_2
    if-eqz v5, :cond_d

    .line 78
    .line 79
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    .line 80
    .line 81
    .line 82
    move-result v3

    .line 83
    new-instance v5, Ljava/util/ArrayList;

    .line 84
    .line 85
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 86
    .line 87
    .line 88
    iget-object v6, p0, Lr0/L0;->l:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v6, Ljava/util/WeakHashMap;

    .line 91
    .line 92
    invoke-virtual {v6, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v6

    .line 96
    check-cast v6, Ljava/util/Set;

    .line 97
    .line 98
    if-nez v6, :cond_5

    .line 99
    .line 100
    sget-object v6, LF0/u;->a:LF0/u;

    .line 101
    .line 102
    :cond_5
    move v7, v4

    .line 103
    :goto_3
    if-ge v7, v3, :cond_c

    .line 104
    .line 105
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v8

    .line 109
    invoke-interface {v6, v8}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v8

    .line 113
    if-eqz v8, :cond_6

    .line 114
    .line 115
    goto :goto_6

    .line 116
    :cond_6
    invoke-virtual {p0, v7, p1}, Lr0/L0;->J(ILjava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    invoke-static {p0, v8}, Lr0/L0;->t(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v9

    .line 124
    if-eqz v9, :cond_8

    .line 125
    .line 126
    invoke-static {v9}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 127
    .line 128
    .line 129
    move-result v10

    .line 130
    if-eqz v10, :cond_7

    .line 131
    .line 132
    goto :goto_4

    .line 133
    :cond_7
    invoke-interface {v1, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v9

    .line 137
    if-eqz v9, :cond_8

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_8
    :goto_4
    new-instance v9, Ljava/util/IdentityHashMap;

    .line 141
    .line 142
    invoke-direct {v9}, Ljava/util/IdentityHashMap;-><init>()V

    .line 143
    .line 144
    .line 145
    invoke-static {v9}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 146
    .line 147
    .line 148
    move-result-object v9

    .line 149
    invoke-static {v8, v4, v9}, Lr0/L0;->j(Ljava/lang/Object;ILjava/util/Set;)Ljava/util/List;

    .line 150
    .line 151
    .line 152
    move-result-object v8

    .line 153
    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    .line 154
    .line 155
    .line 156
    move-result v9

    .line 157
    if-eqz v9, :cond_9

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_9
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 161
    .line 162
    .line 163
    move-result-object v8

    .line 164
    :cond_a
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 165
    .line 166
    .line 167
    move-result v9

    .line 168
    if-eqz v9, :cond_b

    .line 169
    .line 170
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 171
    .line 172
    .line 173
    move-result-object v9

    .line 174
    check-cast v9, Ljava/lang/String;

    .line 175
    .line 176
    invoke-interface {v2, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 177
    .line 178
    .line 179
    move-result v9

    .line 180
    if-eqz v9, :cond_a

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_b
    :goto_5
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    .line 185
    .line 186
    move-result-object v8

    .line 187
    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 188
    .line 189
    .line 190
    :goto_6
    add-int/lit8 v7, v7, 0x1

    .line 191
    .line 192
    goto :goto_3

    .line 193
    :cond_c
    invoke-virtual {v0, p1, v5}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    return-object v5

    .line 197
    :cond_d
    sget-object p1, LF0/s;->a:LF0/s;

    .line 198
    .line 199
    return-object p1
.end method

.method public E(Landroid/view/View;Landroid/widget/ListView;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/L0;->b:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    return-void

    .line 10
    :cond_0
    new-instance v1, Lr0/Z0;

    .line 11
    .line 12
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const/4 v4, 0x0

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    iget v3, v3, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 24
    .line 25
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v3, v4

    .line 31
    :goto_0
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    if-eqz v5, :cond_2

    .line 36
    .line 37
    iget v4, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 38
    .line 39
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->getMinimumHeight()I

    .line 44
    .line 45
    .line 46
    move-result v5

    .line 47
    invoke-direct {v1, v2, v3, v4, v5}, Lr0/Z0;-><init>(ILjava/lang/Integer;Ljava/lang/Integer;I)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, p1, v1}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    const/16 v0, 0x8

    .line 54
    .line 55
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 56
    .line 57
    .line 58
    const/4 v0, 0x0

    .line 59
    invoke-virtual {p1, v0}, Landroid/view/View;->setMinimumHeight(I)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    if-eqz v1, :cond_3

    .line 67
    .line 68
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 69
    .line 70
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 71
    .line 72
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 76
    .line 77
    .line 78
    invoke-virtual {p2}, Landroid/view/View;->requestLayout()V

    .line 79
    .line 80
    .line 81
    return-void
.end method

.method public F(Ljava/lang/ClassLoader;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lr0/L0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, "clazz"

    .line 22
    .line 23
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "classLoader"

    .line 27
    .line 28
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 32
    .line 33
    invoke-interface {v2, p1, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v2, p0, Lr0/L0;->d:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "getDeclaredMethods(...)"

    .line 54
    .line 55
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    array-length v3, v1

    .line 64
    const/4 v4, 0x0

    .line 65
    move v5, v4

    .line 66
    :goto_1
    if-ge v5, v3, :cond_4

    .line 67
    .line 68
    aget-object v6, v1, v5

    .line 69
    .line 70
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const-string v8, "v"

    .line 75
    .line 76
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_3

    .line 81
    .line 82
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    array-length v7, v7

    .line 87
    const/4 v8, 0x1

    .line 88
    if-ne v7, v8, :cond_3

    .line 89
    .line 90
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    aget-object v7, v7, v4

    .line 95
    .line 96
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 97
    .line 98
    invoke-static {v7, v8}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v7

    .line 102
    if-eqz v7, :cond_3

    .line 103
    .line 104
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 105
    .line 106
    .line 107
    move-result v7

    .line 108
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_3

    .line 113
    .line 114
    invoke-virtual {v2, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    :cond_3
    add-int/lit8 v5, v5, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 125
    .line 126
    .line 127
    move-result v2

    .line 128
    if-eqz v2, :cond_0

    .line 129
    .line 130
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    check-cast v2, Ljava/lang/reflect/Method;

    .line 135
    .line 136
    const-string v3, "hide-recent-forward-contact-adapter-"

    .line 137
    .line 138
    invoke-static {v3, v2}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v3

    .line 142
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 143
    .line 144
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    move-result v3

    .line 148
    if-nez v3, :cond_5

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :cond_5
    new-instance v3, Lr0/J0;

    .line 152
    .line 153
    const/4 v4, 0x0

    .line 154
    invoke-direct {v3, p0, v4}, Lr0/J0;-><init>(Lr0/L0;I)V

    .line 155
    .line 156
    .line 157
    invoke-static {v2, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 158
    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_6
    return-void
.end method

.method public G(Ljava/lang/ClassLoader;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lr0/L0;->l:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/Set;

    .line 4
    .line 5
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_6

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Ljava/lang/String;

    .line 20
    .line 21
    const-string v2, "clazz"

    .line 22
    .line 23
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    const-string v2, "classLoader"

    .line 27
    .line 28
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 32
    .line 33
    invoke-interface {v2, p1, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    if-nez v1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    iget-object v2, p0, Lr0/L0;->d:Ljava/util/Set;

    .line 41
    .line 42
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-nez v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    const-string v2, "getDeclaredMethods(...)"

    .line 54
    .line 55
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    new-instance v2, Ljava/util/ArrayList;

    .line 59
    .line 60
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 61
    .line 62
    .line 63
    array-length v3, v1

    .line 64
    const/4 v4, 0x0

    .line 65
    :goto_1
    if-ge v4, v3, :cond_4

    .line 66
    .line 67
    aget-object v5, v1, v4

    .line 68
    .line 69
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object v6

    .line 73
    const-string v7, "onCreate"

    .line 74
    .line 75
    invoke-static {v6, v7}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_3

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v6

    .line 85
    const-string v7, "getParameterTypes(...)"

    .line 86
    .line 87
    invoke-static {v6, v7}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    array-length v6, v6

    .line 91
    if-nez v6, :cond_3

    .line 92
    .line 93
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 98
    .line 99
    .line 100
    move-result v6

    .line 101
    if-nez v6, :cond_3

    .line 102
    .line 103
    invoke-virtual {v2, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 104
    .line 105
    .line 106
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_4
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 110
    .line 111
    .line 112
    move-result-object v1

    .line 113
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 114
    .line 115
    .line 116
    move-result v2

    .line 117
    if-eqz v2, :cond_0

    .line 118
    .line 119
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    move-result-object v2

    .line 123
    check-cast v2, Ljava/lang/reflect/Method;

    .line 124
    .line 125
    const-string v3, "hide-recent-forward-mvvm-source-"

    .line 126
    .line 127
    invoke-static {v3, v2}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 132
    .line 133
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 134
    .line 135
    .line 136
    move-result v3

    .line 137
    if-nez v3, :cond_5

    .line 138
    .line 139
    goto :goto_2

    .line 140
    :cond_5
    new-instance v3, Lr0/K0;

    .line 141
    .line 142
    const/4 v4, 0x0

    .line 143
    invoke-direct {v3, p0, v2, v4}, Lr0/K0;-><init>(Lr0/L0;Ljava/lang/reflect/Method;I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v2, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 147
    .line 148
    .line 149
    goto :goto_2

    .line 150
    :cond_6
    return-void
.end method

.method public H(Ljava/lang/ClassLoader;)V
    .locals 10

    .line 1
    iget-object v0, p0, Lr0/L0;->k:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_b

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Ljava/lang/String;

    .line 18
    .line 19
    const-string v2, "clazz"

    .line 20
    .line 21
    invoke-static {v1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    const-string v2, "classLoader"

    .line 25
    .line 26
    invoke-static {p1, v2}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    sget-object v2, Lc0/f;->b:Ld0/b;

    .line 30
    .line 31
    invoke-interface {v2, p1, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-nez v1, :cond_1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object v2, p0, Lr0/L0;->d:Ljava/util/Set;

    .line 39
    .line 40
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    if-nez v2, :cond_2

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_2
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    const-string v3, "getDeclaredMethods(...)"

    .line 52
    .line 53
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    new-instance v3, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    array-length v4, v2

    .line 62
    const/4 v5, 0x0

    .line 63
    move v6, v5

    .line 64
    :goto_1
    if-ge v6, v4, :cond_5

    .line 65
    .line 66
    aget-object v7, v2, v6

    .line 67
    .line 68
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v8

    .line 72
    const-string v9, "a"

    .line 73
    .line 74
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v8

    .line 78
    if-nez v8, :cond_3

    .line 79
    .line 80
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v8

    .line 84
    const-string v9, "b"

    .line 85
    .line 86
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v8

    .line 90
    if-eqz v8, :cond_4

    .line 91
    .line 92
    :cond_3
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v8

    .line 96
    const-string v9, "getParameterTypes(...)"

    .line 97
    .line 98
    invoke-static {v8, v9}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    array-length v8, v8

    .line 102
    if-nez v8, :cond_4

    .line 103
    .line 104
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v8

    .line 108
    sget-object v9, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 109
    .line 110
    invoke-static {v8, v9}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v8

    .line 114
    if-nez v8, :cond_4

    .line 115
    .line 116
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 117
    .line 118
    .line 119
    move-result v8

    .line 120
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 121
    .line 122
    .line 123
    move-result v8

    .line 124
    if-nez v8, :cond_4

    .line 125
    .line 126
    invoke-virtual {v3, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    :cond_4
    add-int/lit8 v6, v6, 0x1

    .line 130
    .line 131
    goto :goto_1

    .line 132
    :cond_5
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 133
    .line 134
    .line 135
    move-result-object v2

    .line 136
    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 137
    .line 138
    .line 139
    move-result v3

    .line 140
    if-eqz v3, :cond_7

    .line 141
    .line 142
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Ljava/lang/reflect/Method;

    .line 147
    .line 148
    const-string v4, "hide-recent-forward-provider-"

    .line 149
    .line 150
    invoke-static {v4, v3}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v4

    .line 154
    sget-object v6, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 155
    .line 156
    invoke-virtual {v6, v4}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 157
    .line 158
    .line 159
    move-result v4

    .line 160
    if-nez v4, :cond_6

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_6
    new-instance v4, Lr0/K0;

    .line 164
    .line 165
    const/4 v6, 0x1

    .line 166
    invoke-direct {v4, p0, v3, v6}, Lr0/K0;-><init>(Lr0/L0;Ljava/lang/reflect/Method;I)V

    .line 167
    .line 168
    .line 169
    invoke-static {v3, v4}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 170
    .line 171
    .line 172
    goto :goto_2

    .line 173
    :cond_7
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 174
    .line 175
    .line 176
    move-result-object v1

    .line 177
    const-string v2, "getDeclaredConstructors(...)"

    .line 178
    .line 179
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 180
    .line 181
    .line 182
    new-instance v2, Ljava/util/ArrayList;

    .line 183
    .line 184
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 185
    .line 186
    .line 187
    array-length v3, v1

    .line 188
    :goto_3
    if-ge v5, v3, :cond_9

    .line 189
    .line 190
    aget-object v4, v1, v5

    .line 191
    .line 192
    invoke-virtual {v4}, Ljava/lang/reflect/Constructor;->getModifiers()I

    .line 193
    .line 194
    .line 195
    move-result v6

    .line 196
    invoke-static {v6}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 197
    .line 198
    .line 199
    move-result v6

    .line 200
    if-nez v6, :cond_8

    .line 201
    .line 202
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    :cond_8
    add-int/lit8 v5, v5, 0x1

    .line 206
    .line 207
    goto :goto_3

    .line 208
    :cond_9
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 209
    .line 210
    .line 211
    move-result-object v1

    .line 212
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 213
    .line 214
    .line 215
    move-result v2

    .line 216
    if-eqz v2, :cond_0

    .line 217
    .line 218
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    check-cast v2, Ljava/lang/reflect/Constructor;

    .line 223
    .line 224
    new-instance v3, Ljava/lang/StringBuilder;

    .line 225
    .line 226
    const-string v4, "hide-recent-forward-provider-ctor-"

    .line 227
    .line 228
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 229
    .line 230
    .line 231
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 232
    .line 233
    .line 234
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v3

    .line 238
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 239
    .line 240
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 241
    .line 242
    .line 243
    move-result v3

    .line 244
    if-nez v3, :cond_a

    .line 245
    .line 246
    goto :goto_4

    .line 247
    :cond_a
    new-instance v3, Lr0/J0;

    .line 248
    .line 249
    const/4 v4, 0x3

    .line 250
    invoke-direct {v3, p0, v4}, Lr0/J0;-><init>(Lr0/L0;I)V

    .line 251
    .line 252
    .line 253
    invoke-static {v2, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 254
    .line 255
    .line 256
    goto :goto_4

    .line 257
    :cond_b
    return-void
.end method

.method public I(Ljava/lang/ClassLoader;)V
    .locals 5

    .line 1
    const-string v0, "classLoader"

    .line 2
    .line 3
    invoke-static {p1, v0}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    sget-object v0, Lc0/f;->b:Ld0/b;

    .line 7
    .line 8
    const-string v1, "com.tencent.mm.view.recyclerview.WxRecyclerAdapter"

    .line 9
    .line 10
    invoke-interface {v0, p1, v1}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    if-nez p1, :cond_0

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_0
    iget-object v0, p0, Lr0/L0;->c:Ljava/util/Set;

    .line 18
    .line 19
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    const-string v0, "getDeclaredConstructors(...)"

    .line 31
    .line 32
    invoke-static {p1, v0}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    array-length v0, p1

    .line 36
    const/4 v1, 0x0

    .line 37
    :goto_0
    if-ge v1, v0, :cond_3

    .line 38
    .line 39
    aget-object v2, p1, v1

    .line 40
    .line 41
    new-instance v3, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    const-string v4, "hide-recent-forward-adapter-constructor-"

    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    sget-object v4, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 56
    .line 57
    invoke-virtual {v4, v3}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-nez v3, :cond_2

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    new-instance v3, Lr0/J0;

    .line 65
    .line 66
    const/4 v4, 0x5

    .line 67
    invoke-direct {v3, p0, v4}, Lr0/J0;-><init>(Lr0/L0;I)V

    .line 68
    .line 69
    .line 70
    invoke-static {v2, v3}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 71
    .line 72
    .line 73
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    :goto_2
    return-void
.end method

.method public J(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lr0/L0;->m:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/IdentityHashMap;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v0, v1}, Ljava/util/IdentityHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    check-cast v0, Ljava/lang/reflect/Method;

    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    if-nez v0, :cond_0

    .line 17
    .line 18
    return-object v1

    .line 19
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    filled-new-array {p1}, [Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    invoke-static {v0, p2, p1}, Lde/robv/android/xposed/XposedBridge;->invokeOriginalMethod(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception p1

    .line 33
    new-instance p2, LE0/d;

    .line 34
    .line 35
    invoke-direct {p2, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 36
    .line 37
    .line 38
    move-object p1, p2

    .line 39
    :goto_0
    nop

    .line 40
    instance-of p2, p1, LE0/d;

    .line 41
    .line 42
    if-eqz p2, :cond_1

    .line 43
    .line 44
    goto :goto_1

    .line 45
    :cond_1
    move-object v1, p1

    .line 46
    :goto_1
    return-object v1
.end method

.method public K(Landroid/view/View;)Z
    .locals 3

    .line 1
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p0, v0, p1}, Lr0/L0;->i(Lr0/L0;Ljava/util/LinkedHashSet;Landroid/view/View;)V

    .line 7
    .line 8
    .line 9
    const-string p1, "odf"

    .line 10
    .line 11
    const-string v1, "mjc"

    .line 12
    .line 13
    const-string v2, "a_4"

    .line 14
    .line 15
    filled-new-array {v1, v2, p1}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-static {p1}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    if-nez p1, :cond_1

    .line 28
    .line 29
    const-string p1, "sdh"

    .line 30
    .line 31
    const-string v1, "q26"

    .line 32
    .line 33
    const-string v2, "ajr"

    .line 34
    .line 35
    filled-new-array {v1, v2, p1}, [Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, LF0/h;->k0([Ljava/lang/Object;)Ljava/util/Set;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-interface {v0, p1}, Ljava/util/Set;->containsAll(Ljava/util/Collection;)Z

    .line 44
    .line 45
    .line 46
    move-result p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 p1, 0x0

    .line 51
    return p1

    .line 52
    :cond_1
    :goto_0
    const/4 p1, 0x1

    .line 53
    return p1
.end method

.method public L(Landroid/app/Activity;)Z
    .locals 3

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
    const-string v1, "com.tencent.mm.ui.mvvm.MvvmContactListUI"

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    const/4 v2, 0x1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_0
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iget-object v1, p0, Lr0/L0;->o:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v1, LA0/U;

    .line 26
    .line 27
    if-nez v1, :cond_2

    .line 28
    .line 29
    if-eqz p1, :cond_1

    .line 30
    .line 31
    invoke-static {p1}, LA0/l;->k(Landroid/content/Context;)LA0/U;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    iput-object v1, p0, Lr0/L0;->o:Ljava/lang/Object;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    const/4 v1, 0x0

    .line 41
    :cond_2
    :goto_0
    if-eqz v1, :cond_3

    .line 42
    .line 43
    iget-object p1, v1, LA0/U;->a:Ljava/util/List;

    .line 44
    .line 45
    invoke-interface {p1, v0}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-ne p1, v2, :cond_3

    .line 50
    .line 51
    :goto_1
    return v2

    .line 52
    :cond_3
    const/4 p1, 0x0

    .line 53
    return p1
.end method

.method public M(Landroid/view/View;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    const/16 v2, 0x8

    .line 8
    .line 9
    if-ge v1, v2, :cond_3

    .line 10
    .line 11
    instance-of v2, p1, Landroid/app/Activity;

    .line 12
    .line 13
    if-eqz v2, :cond_2

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

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
    const-string v2, "com.tencent.mm.ui.transmit.SelectConversationUI"

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-nez v1, :cond_1

    .line 30
    .line 31
    check-cast p1, Landroid/app/Activity;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Lr0/L0;->L(Landroid/app/Activity;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-eqz p1, :cond_0

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_0
    return v0

    .line 41
    :cond_1
    :goto_1
    const/4 p1, 0x1

    .line 42
    return p1

    .line 43
    :cond_2
    instance-of v2, p1, Landroid/content/ContextWrapper;

    .line 44
    .line 45
    if-eqz v2, :cond_3

    .line 46
    .line 47
    check-cast p1, Landroid/content/ContextWrapper;

    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    add-int/lit8 v1, v1, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_3
    return v0
.end method

.method public N(Landroid/view/View;)Z
    .locals 11

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    :goto_0
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_18

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "androidx.recyclerview.widget.RecyclerView"

    .line 13
    .line 14
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const-string v3, "android.support.v7.widget.RecyclerView"

    .line 25
    .line 26
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    if-nez v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    const-string v3, ".RecyclerView"

    .line 37
    .line 38
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-nez v2, :cond_1

    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    const-string v3, ".WxRecyclerView"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 51
    .line 52
    .line 53
    move-result v2

    .line 54
    if-eqz v2, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    goto :goto_0

    .line 62
    :cond_1
    :goto_1
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    .line 63
    .line 64
    .line 65
    move-result v0

    .line 66
    const/4 v2, -0x1

    .line 67
    const/4 v3, 0x0

    .line 68
    if-ne v0, v2, :cond_2

    .line 69
    .line 70
    goto :goto_4

    .line 71
    :cond_2
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 79
    goto :goto_2

    .line 80
    :catchall_0
    move-exception v0

    .line 81
    new-instance v2, LE0/d;

    .line 82
    .line 83
    invoke-direct {v2, v0}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 84
    .line 85
    .line 86
    move-object v0, v2

    .line 87
    :goto_2
    nop

    .line 88
    instance-of v2, v0, LE0/d;

    .line 89
    .line 90
    if-eqz v2, :cond_3

    .line 91
    .line 92
    goto :goto_3

    .line 93
    :cond_3
    move-object v3, v0

    .line 94
    :goto_3
    check-cast v3, Ljava/lang/String;

    .line 95
    .line 96
    :goto_4
    const-string v0, "llt"

    .line 97
    .line 98
    invoke-static {v3, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 99
    .line 100
    .line 101
    move-result v0

    .line 102
    if-nez v0, :cond_17

    .line 103
    .line 104
    const-string v0, "ovi"

    .line 105
    .line 106
    invoke-static {v3, v0}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 107
    .line 108
    .line 109
    move-result v0

    .line 110
    if-nez v0, :cond_17

    .line 111
    .line 112
    const/4 v0, 0x1

    .line 113
    if-eqz v3, :cond_5

    .line 114
    .line 115
    invoke-static {v3}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v2

    .line 119
    if-eqz v2, :cond_4

    .line 120
    .line 121
    goto :goto_5

    .line 122
    :cond_4
    iget-object v2, p0, Lr0/L0;->o:Ljava/lang/Object;

    .line 123
    .line 124
    check-cast v2, LA0/U;

    .line 125
    .line 126
    if-eqz v2, :cond_5

    .line 127
    .line 128
    iget-object v2, v2, LA0/U;->d:Ljava/util/List;

    .line 129
    .line 130
    invoke-interface {v2, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v2

    .line 134
    if-ne v2, v0, :cond_5

    .line 135
    .line 136
    goto/16 :goto_e

    .line 137
    .line 138
    :cond_5
    :goto_5
    invoke-static {}, Lz0/r;->t()Z

    .line 139
    .line 140
    .line 141
    move-result v2

    .line 142
    if-nez v2, :cond_6

    .line 143
    .line 144
    goto/16 :goto_f

    .line 145
    .line 146
    :cond_6
    iget-object v2, p0, Lr0/L0;->f:Ljava/util/Set;

    .line 147
    .line 148
    invoke-interface {v2, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 149
    .line 150
    .line 151
    move-result v3

    .line 152
    if-eqz v3, :cond_7

    .line 153
    .line 154
    return v0

    .line 155
    :cond_7
    invoke-virtual {p0, p1}, Lr0/L0;->M(Landroid/view/View;)Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-nez v3, :cond_8

    .line 160
    .line 161
    goto/16 :goto_d

    .line 162
    .line 163
    :cond_8
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 164
    .line 165
    .line 166
    move-result v3

    .line 167
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 168
    .line 169
    .line 170
    move-result v4

    .line 171
    if-gt v3, v4, :cond_9

    .line 172
    .line 173
    goto/16 :goto_d

    .line 174
    .line 175
    :cond_9
    invoke-static {p1}, Lr0/L0;->B(Landroid/view/View;)Ljava/lang/Object;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    if-nez v3, :cond_a

    .line 180
    .line 181
    goto/16 :goto_d

    .line 182
    .line 183
    :cond_a
    invoke-virtual {p0}, Lr0/L0;->n()Ljava/util/Set;

    .line 184
    .line 185
    .line 186
    move-result-object v4

    .line 187
    invoke-interface {v4}, Ljava/util/Set;->isEmpty()Z

    .line 188
    .line 189
    .line 190
    move-result v5

    .line 191
    if-eqz v5, :cond_b

    .line 192
    .line 193
    goto/16 :goto_d

    .line 194
    .line 195
    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 196
    .line 197
    .line 198
    move-result-object v5

    .line 199
    invoke-virtual {v5}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 200
    .line 201
    .line 202
    move-result-object v5

    .line 203
    const-string v6, "getDeclaredFields(...)"

    .line 204
    .line 205
    invoke-static {v5, v6}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 206
    .line 207
    .line 208
    array-length v6, v5

    .line 209
    move v7, v1

    .line 210
    :goto_6
    if-ge v7, v6, :cond_16

    .line 211
    .line 212
    aget-object v8, v5, v7

    .line 213
    .line 214
    invoke-virtual {v8}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 215
    .line 216
    .line 217
    move-result v9

    .line 218
    invoke-static {v9}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 219
    .line 220
    .line 221
    move-result v9

    .line 222
    if-eqz v9, :cond_c

    .line 223
    .line 224
    goto/16 :goto_c

    .line 225
    .line 226
    :cond_c
    :try_start_1
    invoke-virtual {v8, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {v8, v3}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    .line 231
    .line 232
    move-result-object v8

    .line 233
    instance-of v9, v8, Ljava/util/List;

    .line 234
    .line 235
    if-eqz v9, :cond_10

    .line 236
    .line 237
    check-cast v8, Ljava/lang/Iterable;

    .line 238
    .line 239
    instance-of v9, v8, Ljava/util/Collection;

    .line 240
    .line 241
    if-eqz v9, :cond_e

    .line 242
    .line 243
    move-object v9, v8

    .line 244
    check-cast v9, Ljava/util/Collection;

    .line 245
    .line 246
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    .line 247
    .line 248
    .line 249
    move-result v9

    .line 250
    if-eqz v9, :cond_e

    .line 251
    .line 252
    :cond_d
    :goto_7
    move v8, v1

    .line 253
    goto :goto_9

    .line 254
    :catchall_1
    move-exception v8

    .line 255
    goto :goto_a

    .line 256
    :cond_e
    invoke-interface {v8}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 257
    .line 258
    .line 259
    move-result-object v8

    .line 260
    :cond_f
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 261
    .line 262
    .line 263
    move-result v9

    .line 264
    if-eqz v9, :cond_d

    .line 265
    .line 266
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 267
    .line 268
    .line 269
    move-result-object v9

    .line 270
    invoke-static {p0, v9}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v9

    .line 274
    if-eqz v9, :cond_f

    .line 275
    .line 276
    invoke-interface {v4, v9}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    move-result v9

    .line 280
    if-eqz v9, :cond_f

    .line 281
    .line 282
    :goto_8
    move v8, v0

    .line 283
    goto :goto_9

    .line 284
    :cond_10
    instance-of v9, v8, Ljava/util/Map;

    .line 285
    .line 286
    if-eqz v9, :cond_d

    .line 287
    .line 288
    check-cast v8, Ljava/util/Map;

    .line 289
    .line 290
    invoke-interface {v8}, Ljava/util/Map;->isEmpty()Z

    .line 291
    .line 292
    .line 293
    move-result v9

    .line 294
    if-eqz v9, :cond_11

    .line 295
    .line 296
    goto :goto_7

    .line 297
    :cond_11
    invoke-interface {v8}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 298
    .line 299
    .line 300
    move-result-object v8

    .line 301
    invoke-interface {v8}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 302
    .line 303
    .line 304
    move-result-object v8

    .line 305
    :cond_12
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 306
    .line 307
    .line 308
    move-result v9

    .line 309
    if-eqz v9, :cond_d

    .line 310
    .line 311
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object v9

    .line 315
    check-cast v9, Ljava/util/Map$Entry;

    .line 316
    .line 317
    invoke-interface {v9}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    move-result-object v10

    .line 321
    invoke-interface {v9}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    move-result-object v9

    .line 325
    invoke-static {p0, v10}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 326
    .line 327
    .line 328
    move-result-object v10

    .line 329
    if-nez v10, :cond_13

    .line 330
    .line 331
    invoke-static {p0, v9}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 332
    .line 333
    .line 334
    move-result-object v10

    .line 335
    :cond_13
    if-eqz v10, :cond_12

    .line 336
    .line 337
    invoke-interface {v4, v10}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 338
    .line 339
    .line 340
    move-result v9

    .line 341
    if-eqz v9, :cond_12

    .line 342
    .line 343
    goto :goto_8

    .line 344
    :goto_9
    invoke-static {v8}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 345
    .line 346
    .line 347
    move-result-object v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 348
    goto :goto_b

    .line 349
    :goto_a
    new-instance v9, LE0/d;

    .line 350
    .line 351
    invoke-direct {v9, v8}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 352
    .line 353
    .line 354
    move-object v8, v9

    .line 355
    :goto_b
    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 356
    .line 357
    instance-of v10, v8, LE0/d;

    .line 358
    .line 359
    if-eqz v10, :cond_14

    .line 360
    .line 361
    move-object v8, v9

    .line 362
    :cond_14
    check-cast v8, Ljava/lang/Boolean;

    .line 363
    .line 364
    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    .line 365
    .line 366
    .line 367
    move-result v8

    .line 368
    if-eqz v8, :cond_15

    .line 369
    .line 370
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 371
    .line 372
    .line 373
    move v1, v0

    .line 374
    goto :goto_d

    .line 375
    :cond_15
    :goto_c
    add-int/lit8 v7, v7, 0x1

    .line 376
    .line 377
    goto/16 :goto_6

    .line 378
    .line 379
    :cond_16
    :goto_d
    return v1

    .line 380
    :cond_17
    :goto_e
    invoke-virtual {p0, p1}, Lr0/L0;->M(Landroid/view/View;)Z

    .line 381
    .line 382
    .line 383
    move-result p1

    .line 384
    return p1

    .line 385
    :cond_18
    :goto_f
    return v1
.end method

.method public P(Landroid/view/View;Landroid/widget/ListView;)V
    .locals 3

    .line 1
    invoke-static {p2}, Lr0/L0;->o(Landroid/widget/ListView;)Landroid/widget/ListAdapter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto/16 :goto_1

    .line 8
    .line 9
    :cond_0
    :try_start_0
    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 14
    .line 15
    .line 16
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    goto :goto_0

    .line 18
    :catchall_0
    move-exception p1

    .line 19
    new-instance v1, LE0/d;

    .line 20
    .line 21
    invoke-direct {v1, p1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 22
    .line 23
    .line 24
    move-object p1, v1

    .line 25
    :goto_0
    const/4 v1, -0x1

    .line 26
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    instance-of v2, p1, LE0/d;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    move-object p1, v1

    .line 35
    :cond_1
    check-cast p1, Ljava/lang/Number;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-gez p1, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    invoke-static {p2, p1}, Lr0/L0;->p(Landroid/widget/ListView;I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p1

    .line 48
    if-eqz p1, :cond_6

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 51
    .line 52
    .line 53
    move-result p1

    .line 54
    iget-object v1, p0, Lr0/L0;->e:Ljava/util/Set;

    .line 55
    .line 56
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_3

    .line 61
    .line 62
    invoke-virtual {p0, v0}, Lr0/L0;->D(Ljava/lang/Object;)Ljava/util/List;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {v1, p1}, LF0/k;->k0(Ljava/util/List;I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    check-cast v1, Ljava/lang/Integer;

    .line 71
    .line 72
    if-eqz v1, :cond_3

    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    :cond_3
    iget-object v1, p0, Lr0/L0;->l:Ljava/lang/Object;

    .line 79
    .line 80
    check-cast v1, Ljava/util/WeakHashMap;

    .line 81
    .line 82
    invoke-virtual {v1, v0}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 83
    .line 84
    .line 85
    move-result-object v2

    .line 86
    if-nez v2, :cond_4

    .line 87
    .line 88
    new-instance v2, Ljava/util/LinkedHashSet;

    .line 89
    .line 90
    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    :cond_4
    check-cast v2, Ljava/util/Set;

    .line 97
    .line 98
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    invoke-interface {v2, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    .line 105
    move-result p1

    .line 106
    if-eqz p1, :cond_6

    .line 107
    .line 108
    iget-object p1, p0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 109
    .line 110
    invoke-virtual {p1, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    iget-object p1, p0, Lr0/L0;->f:Ljava/util/Set;

    .line 117
    .line 118
    invoke-interface {p1, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    move-result p1

    .line 122
    if-nez p1, :cond_5

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_5
    new-instance p1, LA0/r;

    .line 126
    .line 127
    const/16 v1, 0xa

    .line 128
    .line 129
    invoke-direct {p1, p0, p2, v0, v1}, LA0/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, p1}, Landroid/view/View;->postOnAnimation(Ljava/lang/Runnable;)V

    .line 133
    .line 134
    .line 135
    :cond_6
    :goto_1
    return-void
.end method

.method public Q(Landroid/view/View;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/L0;->b:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/WeakHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Lr0/Z0;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    return-void

    .line 12
    :cond_0
    iget v1, v0, Lr0/Z0;->a:I

    .line 13
    .line 14
    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 15
    .line 16
    .line 17
    iget v1, v0, Lr0/Z0;->d:I

    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    if-eqz v1, :cond_4

    .line 27
    .line 28
    const/4 v2, 0x1

    .line 29
    const/4 v3, 0x0

    .line 30
    iget-object v4, v0, Lr0/Z0;->b:Ljava/lang/Integer;

    .line 31
    .line 32
    if-eqz v4, :cond_1

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 35
    .line 36
    .line 37
    move-result v4

    .line 38
    iget v5, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 39
    .line 40
    if-eq v5, v4, :cond_1

    .line 41
    .line 42
    iput v4, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 43
    .line 44
    move v3, v2

    .line 45
    :cond_1
    iget-object v0, v0, Lr0/Z0;->c:Ljava/lang/Integer;

    .line 46
    .line 47
    if-eqz v0, :cond_3

    .line 48
    .line 49
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 50
    .line 51
    .line 52
    move-result v0

    .line 53
    iget v4, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 54
    .line 55
    if-eq v4, v0, :cond_2

    .line 56
    .line 57
    iput v0, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_2
    move v2, v3

    .line 61
    :goto_0
    move v3, v2

    .line 62
    :cond_3
    if-eqz v3, :cond_4

    .line 63
    .line 64
    invoke-virtual {p1, v1}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 65
    .line 66
    .line 67
    :cond_4
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 68
    .line 69
    .line 70
    return-void
.end method

.method public R(Landroid/view/View;Landroid/widget/ListView;)V
    .locals 6

    .line 1
    iget-object v0, p0, Lr0/L0;->d:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {p2}, Lr0/L0;->O(Landroid/widget/ListView;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Lr0/L0;->Q(Landroid/view/View;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :cond_0
    invoke-virtual {p2}, Landroid/widget/ListView;->getAdapter()Landroid/widget/ListAdapter;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, v0, Landroid/widget/HeaderViewListAdapter;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    check-cast v0, Landroid/widget/HeaderViewListAdapter;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v0, v2

    .line 32
    :goto_0
    const/4 v1, -0x1

    .line 33
    if-nez v0, :cond_2

    .line 34
    .line 35
    goto :goto_4

    .line 36
    :cond_2
    :try_start_0
    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 41
    .line 42
    .line 43
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    goto :goto_1

    .line 45
    :catchall_0
    move-exception v3

    .line 46
    new-instance v4, LE0/d;

    .line 47
    .line 48
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 49
    .line 50
    .line 51
    move-object v3, v4

    .line 52
    :goto_1
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    instance-of v5, v3, LE0/d;

    .line 57
    .line 58
    if-eqz v5, :cond_3

    .line 59
    .line 60
    move-object v3, v4

    .line 61
    :cond_3
    check-cast v3, Ljava/lang/Number;

    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-ltz v3, :cond_8

    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/widget/HeaderViewListAdapter;->getHeadersCount()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-ge v3, v0, :cond_8

    .line 74
    .line 75
    sget-boolean v0, Lz0/i;->a:Z

    .line 76
    .line 77
    invoke-static {}, Lz0/g;->x()Z

    .line 78
    .line 79
    .line 80
    move-result v0

    .line 81
    if-eqz v0, :cond_7

    .line 82
    .line 83
    invoke-virtual {p0}, Lr0/L0;->m()Ljava/util/Set;

    .line 84
    .line 85
    .line 86
    move-result-object v0

    .line 87
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 88
    .line 89
    .line 90
    move-result v0

    .line 91
    if-eqz v0, :cond_4

    .line 92
    .line 93
    goto :goto_3

    .line 94
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 95
    .line 96
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 97
    .line 98
    .line 99
    invoke-static {v0, p1}, Lr0/L0;->k(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 103
    .line 104
    .line 105
    move-result v0

    .line 106
    if-eqz v0, :cond_6

    .line 107
    .line 108
    invoke-virtual {p0, p1}, Lr0/L0;->K(Landroid/view/View;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    goto :goto_2

    .line 115
    :cond_5
    invoke-virtual {p0, p1, p2}, Lr0/L0;->E(Landroid/view/View;Landroid/widget/ListView;)V

    .line 116
    .line 117
    .line 118
    goto/16 :goto_c

    .line 119
    .line 120
    :cond_6
    :goto_2
    invoke-virtual {p0, p1}, Lr0/L0;->Q(Landroid/view/View;)V

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    :goto_3
    invoke-virtual {p0, p1}, Lr0/L0;->Q(Landroid/view/View;)V

    .line 125
    .line 126
    .line 127
    goto/16 :goto_c

    .line 128
    .line 129
    :cond_8
    :goto_4
    invoke-virtual {p0, p1}, Lr0/L0;->K(Landroid/view/View;)Z

    .line 130
    .line 131
    .line 132
    move-result v0

    .line 133
    if-nez v0, :cond_9

    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lr0/L0;->Q(Landroid/view/View;)V

    .line 136
    .line 137
    .line 138
    return-void

    .line 139
    :cond_9
    sget-boolean v0, Lz0/i;->a:Z

    .line 140
    .line 141
    invoke-static {}, Lz0/g;->x()Z

    .line 142
    .line 143
    .line 144
    move-result v0

    .line 145
    if-nez v0, :cond_a

    .line 146
    .line 147
    invoke-virtual {p0, p1}, Lr0/L0;->Q(Landroid/view/View;)V

    .line 148
    .line 149
    .line 150
    return-void

    .line 151
    :cond_a
    invoke-virtual {p0}, Lr0/L0;->m()Ljava/util/Set;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-interface {v0}, Ljava/util/Set;->isEmpty()Z

    .line 156
    .line 157
    .line 158
    move-result v3

    .line 159
    if-eqz v3, :cond_b

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lr0/L0;->Q(Landroid/view/View;)V

    .line 162
    .line 163
    .line 164
    return-void

    .line 165
    :cond_b
    :try_start_1
    invoke-virtual {p2, p1}, Landroid/widget/AdapterView;->getPositionForView(Landroid/view/View;)I

    .line 166
    .line 167
    .line 168
    move-result v3

    .line 169
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 170
    .line 171
    .line 172
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 173
    goto :goto_5

    .line 174
    :catchall_1
    move-exception v3

    .line 175
    new-instance v4, LE0/d;

    .line 176
    .line 177
    invoke-direct {v4, v3}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    move-object v3, v4

    .line 181
    :goto_5
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 182
    .line 183
    .line 184
    move-result-object v1

    .line 185
    instance-of v4, v3, LE0/d;

    .line 186
    .line 187
    if-eqz v4, :cond_c

    .line 188
    .line 189
    move-object v3, v1

    .line 190
    :cond_c
    check-cast v3, Ljava/lang/Number;

    .line 191
    .line 192
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 193
    .line 194
    .line 195
    move-result v1

    .line 196
    if-ltz v1, :cond_e

    .line 197
    .line 198
    invoke-static {p2}, Lr0/L0;->o(Landroid/widget/ListView;)Landroid/widget/ListAdapter;

    .line 199
    .line 200
    .line 201
    move-result-object v3

    .line 202
    invoke-static {p2, v1}, Lr0/L0;->p(Landroid/widget/ListView;I)Ljava/lang/Integer;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    if-eqz v3, :cond_e

    .line 207
    .line 208
    if-eqz v1, :cond_e

    .line 209
    .line 210
    :try_start_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 211
    .line 212
    .line 213
    move-result v1

    .line 214
    invoke-interface {v3, v1}, Landroid/widget/Adapter;->getItem(I)Ljava/lang/Object;

    .line 215
    .line 216
    .line 217
    move-result-object v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 218
    goto :goto_6

    .line 219
    :catchall_2
    move-exception v1

    .line 220
    new-instance v3, LE0/d;

    .line 221
    .line 222
    invoke-direct {v3, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 223
    .line 224
    .line 225
    move-object v1, v3

    .line 226
    :goto_6
    nop

    .line 227
    instance-of v3, v1, LE0/d;

    .line 228
    .line 229
    if-eqz v3, :cond_d

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_d
    move-object v2, v1

    .line 233
    :goto_7
    invoke-static {p0, v2}, Lr0/L0;->t(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 234
    .line 235
    .line 236
    move-result-object v1

    .line 237
    if-eqz v1, :cond_e

    .line 238
    .line 239
    goto :goto_8

    .line 240
    :cond_e
    invoke-virtual {p0, p1}, Lr0/L0;->A(Landroid/view/View;)Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    move-result-object v1

    .line 244
    :goto_8
    iget-object v2, p0, Lr0/L0;->b:Ljava/util/WeakHashMap;

    .line 245
    .line 246
    if-eqz v1, :cond_11

    .line 247
    .line 248
    invoke-static {v1}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 249
    .line 250
    .line 251
    move-result v3

    .line 252
    if-eqz v3, :cond_f

    .line 253
    .line 254
    goto :goto_9

    .line 255
    :cond_f
    invoke-interface {v0, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 256
    .line 257
    .line 258
    move-result v1

    .line 259
    if-eqz v1, :cond_11

    .line 260
    .line 261
    invoke-virtual {p0, p1, p2}, Lr0/L0;->P(Landroid/view/View;Landroid/widget/ListView;)V

    .line 262
    .line 263
    .line 264
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 265
    .line 266
    .line 267
    move-result v0

    .line 268
    if-eqz v0, :cond_10

    .line 269
    .line 270
    goto :goto_c

    .line 271
    :cond_10
    invoke-virtual {p0, p1, p2}, Lr0/L0;->E(Landroid/view/View;Landroid/widget/ListView;)V

    .line 272
    .line 273
    .line 274
    return-void

    .line 275
    :cond_11
    :goto_9
    iget-object v1, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 276
    .line 277
    invoke-static {v0, v1}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 278
    .line 279
    .line 280
    move-result v1

    .line 281
    if-eqz v1, :cond_12

    .line 282
    .line 283
    iget-object v0, p0, Lr0/L0;->k:Ljava/util/Set;

    .line 284
    .line 285
    goto :goto_a

    .line 286
    :cond_12
    invoke-static {v0}, Lr0/L0;->l(Ljava/util/Set;)Ljava/util/Set;

    .line 287
    .line 288
    .line 289
    move-result-object v0

    .line 290
    :goto_a
    new-instance v1, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 293
    .line 294
    .line 295
    invoke-static {v1, p1}, Lr0/L0;->k(Ljava/util/ArrayList;Landroid/view/View;)V

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 299
    .line 300
    .line 301
    move-result v3

    .line 302
    if-eqz v3, :cond_13

    .line 303
    .line 304
    goto :goto_b

    .line 305
    :cond_13
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 306
    .line 307
    .line 308
    move-result-object v1

    .line 309
    :cond_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 310
    .line 311
    .line 312
    move-result v3

    .line 313
    if-eqz v3, :cond_16

    .line 314
    .line 315
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 316
    .line 317
    .line 318
    move-result-object v3

    .line 319
    check-cast v3, Ljava/lang/String;

    .line 320
    .line 321
    invoke-interface {v0, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    if-eqz v3, :cond_14

    .line 326
    .line 327
    invoke-virtual {p0, p1, p2}, Lr0/L0;->P(Landroid/view/View;Landroid/widget/ListView;)V

    .line 328
    .line 329
    .line 330
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 331
    .line 332
    .line 333
    move-result v0

    .line 334
    if-eqz v0, :cond_15

    .line 335
    .line 336
    goto :goto_c

    .line 337
    :cond_15
    invoke-virtual {p0, p1, p2}, Lr0/L0;->E(Landroid/view/View;Landroid/widget/ListView;)V

    .line 338
    .line 339
    .line 340
    goto :goto_c

    .line 341
    :cond_16
    :goto_b
    invoke-virtual {p0, p1}, Lr0/L0;->Q(Landroid/view/View;)V

    .line 342
    .line 343
    .line 344
    :goto_c
    return-void
.end method

.method public final handleHook(Landroid/content/Context;Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;)V
    .locals 11

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, 0x10

    .line 3
    .line 4
    const-string v2, "setAdapter"

    .line 5
    .line 6
    iget v3, p0, Lr0/L0;->a:I

    .line 7
    .line 8
    packed-switch v3, :pswitch_data_0

    .line 9
    .line 10
    .line 11
    const-class p1, Landroid/widget/ListAdapter;

    .line 12
    .line 13
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 18
    .line 19
    const-class v0, Landroid/widget/ListView;

    .line 20
    .line 21
    invoke-interface {p2, v0, v2, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    if-eqz p1, :cond_1

    .line 26
    .line 27
    sget-object p2, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 28
    .line 29
    new-instance v1, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    const-string v2, "hide-share-select-set-adapter-"

    .line 32
    .line 33
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {p2, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-nez p2, :cond_0

    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    new-instance p2, Lr0/a1;

    .line 51
    .line 52
    const/4 v1, 0x6

    .line 53
    invoke-direct {p2, p0, v1}, Lr0/a1;-><init>(Lr0/L0;I)V

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    :goto_0
    new-instance p1, Lr0/a1;

    .line 60
    .line 61
    const/4 p2, 0x5

    .line 62
    invoke-direct {p1, p0, p2}, Lr0/a1;-><init>(Lr0/L0;I)V

    .line 63
    .line 64
    .line 65
    const-class p2, Landroid/graphics/Canvas;

    .line 66
    .line 67
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object p2

    .line 71
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 72
    .line 73
    const-string v2, "dispatchDraw"

    .line 74
    .line 75
    invoke-interface {v1, v0, v2, p2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-eqz p2, :cond_2

    .line 80
    .line 81
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 82
    .line 83
    new-instance v1, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    const-string v2, "hide-share-select-dispatch-draw-"

    .line 86
    .line 87
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v1

    .line 97
    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-eqz v0, :cond_2

    .line 102
    .line 103
    invoke-static {p2, p1}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    return-void

    .line 107
    :pswitch_0
    iget-object v3, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 108
    .line 109
    iput-object v3, p0, Lr0/L0;->n:Ljava/lang/Object;

    .line 110
    .line 111
    invoke-static {p1}, LA0/l;->k(Landroid/content/Context;)LA0/U;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    iput-object v3, p0, Lr0/L0;->o:Ljava/lang/Object;

    .line 116
    .line 117
    sget-object v3, LA0/y;->a:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 118
    .line 119
    new-instance v4, LA0/u;

    .line 120
    .line 121
    new-instance v7, Lr0/P;

    .line 122
    .line 123
    const/16 v3, 0x15

    .line 124
    .line 125
    invoke-direct {v7, v3}, Lr0/P;-><init>(I)V

    .line 126
    .line 127
    .line 128
    new-instance v8, LA0/h;

    .line 129
    .line 130
    invoke-direct {v8, p1, v1}, LA0/h;-><init>(Landroid/content/Context;I)V

    .line 131
    .line 132
    .line 133
    new-instance v9, LC/d;

    .line 134
    .line 135
    invoke-direct {v9, v0, p0}, LC/d;-><init>(ILjava/lang/Object;)V

    .line 136
    .line 137
    .line 138
    new-instance v10, LA0/a;

    .line 139
    .line 140
    invoke-direct {v10, v1}, LA0/a;-><init>(I)V

    .line 141
    .line 142
    .line 143
    const-string v5, "recent_forward"

    .line 144
    .line 145
    const-string v6, "\u6700\u8fd1\u8f6c\u53d1\u9690\u85cf"

    .line 146
    .line 147
    invoke-direct/range {v4 .. v10}, LA0/u;-><init>(Ljava/lang/String;Ljava/lang/String;LM0/a;LM0/a;LM0/l;LM0/l;)V

    .line 148
    .line 149
    .line 150
    invoke-static {p1, v4}, LA0/y;->c(Landroid/content/Context;LA0/u;)V

    .line 151
    .line 152
    .line 153
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 154
    .line 155
    const-string v1, "classLoader"

    .line 156
    .line 157
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0, p1}, Lr0/L0;->H(Ljava/lang/ClassLoader;)V

    .line 161
    .line 162
    .line 163
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 164
    .line 165
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {p0, p1}, Lr0/L0;->G(Ljava/lang/ClassLoader;)V

    .line 169
    .line 170
    .line 171
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 172
    .line 173
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0, p1}, Lr0/L0;->F(Ljava/lang/ClassLoader;)V

    .line 177
    .line 178
    .line 179
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 180
    .line 181
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-virtual {p0, p1}, Lr0/L0;->I(Ljava/lang/ClassLoader;)V

    .line 185
    .line 186
    .line 187
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 188
    .line 189
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 190
    .line 191
    .line 192
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 193
    .line 194
    const-string v4, "androidx.recyclerview.widget.RecyclerView"

    .line 195
    .line 196
    invoke-interface {v3, p1, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    if-nez p1, :cond_3

    .line 201
    .line 202
    iget-object p1, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 203
    .line 204
    invoke-static {p1, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    sget-object v3, Lc0/f;->b:Ld0/b;

    .line 208
    .line 209
    const-string v4, "android.support.v7.widget.RecyclerView"

    .line 210
    .line 211
    invoke-interface {v3, p1, v4}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-nez p1, :cond_3

    .line 216
    .line 217
    goto :goto_1

    .line 218
    :cond_3
    iget-object v3, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 219
    .line 220
    invoke-static {v3, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    sget-object v4, Lc0/f;->b:Ld0/b;

    .line 224
    .line 225
    const-string v5, "androidx.recyclerview.widget.RecyclerView$Adapter"

    .line 226
    .line 227
    invoke-interface {v4, v3, v5}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 228
    .line 229
    .line 230
    move-result-object v3

    .line 231
    if-nez v3, :cond_4

    .line 232
    .line 233
    iget-object p2, p2, Lde/robv/android/xposed/callbacks/XC_LoadPackage$LoadPackageParam;->classLoader:Ljava/lang/ClassLoader;

    .line 234
    .line 235
    invoke-static {p2, v1}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 236
    .line 237
    .line 238
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 239
    .line 240
    const-string v3, "android.support.v7.widget.RecyclerView$Adapter"

    .line 241
    .line 242
    invoke-interface {v1, p2, v3}, Ld0/a;->l(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    .line 243
    .line 244
    .line 245
    move-result-object v3

    .line 246
    if-nez v3, :cond_4

    .line 247
    .line 248
    goto :goto_1

    .line 249
    :cond_4
    filled-new-array {v3}, [Ljava/lang/Object;

    .line 250
    .line 251
    .line 252
    move-result-object p2

    .line 253
    sget-object v1, Lc0/f;->b:Ld0/b;

    .line 254
    .line 255
    invoke-interface {v1, p1, v2, p2}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 256
    .line 257
    .line 258
    move-result-object p1

    .line 259
    if-eqz p1, :cond_5

    .line 260
    .line 261
    new-instance p2, Lr0/J0;

    .line 262
    .line 263
    invoke-direct {p2, p0, v0}, Lr0/J0;-><init>(Lr0/L0;I)V

    .line 264
    .line 265
    .line 266
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 267
    .line 268
    .line 269
    :cond_5
    :goto_1
    const/4 p1, 0x0

    .line 270
    new-array p1, p1, [Ljava/lang/Object;

    .line 271
    .line 272
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 273
    .line 274
    const-class v0, Landroid/app/Activity;

    .line 275
    .line 276
    const-string v1, "onResume"

    .line 277
    .line 278
    invoke-interface {p2, v0, v1, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 279
    .line 280
    .line 281
    move-result-object p1

    .line 282
    if-nez p1, :cond_6

    .line 283
    .line 284
    goto :goto_2

    .line 285
    :cond_6
    const-string p2, "hide-recent-forward-resume-"

    .line 286
    .line 287
    invoke-static {p2, p1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 288
    .line 289
    .line 290
    move-result-object p2

    .line 291
    sget-object v1, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 292
    .line 293
    invoke-virtual {v1, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 294
    .line 295
    .line 296
    move-result p2

    .line 297
    if-nez p2, :cond_7

    .line 298
    .line 299
    goto :goto_2

    .line 300
    :cond_7
    new-instance p2, Lr0/J0;

    .line 301
    .line 302
    const/4 v1, 0x2

    .line 303
    invoke-direct {p2, p0, v1}, Lr0/J0;-><init>(Lr0/L0;I)V

    .line 304
    .line 305
    .line 306
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 307
    .line 308
    .line 309
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 310
    .line 311
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 312
    .line 313
    .line 314
    move-result-object p1

    .line 315
    sget-object p2, Lc0/f;->b:Ld0/b;

    .line 316
    .line 317
    const-string v1, "onWindowFocusChanged"

    .line 318
    .line 319
    invoke-interface {p2, v0, v1, p1}, Ld0/a;->b(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/reflect/Method;

    .line 320
    .line 321
    .line 322
    move-result-object p1

    .line 323
    if-nez p1, :cond_8

    .line 324
    .line 325
    goto :goto_3

    .line 326
    :cond_8
    const-string p2, "hide-recent-forward-focus-"

    .line 327
    .line 328
    invoke-static {p2, p1}, LL/d;->j(Ljava/lang/String;Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object p2

    .line 332
    sget-object v0, Lcom/lu/wxmask/MainHook;->uniqueMetaStore:Ljava/util/concurrent/CopyOnWriteArraySet;

    .line 333
    .line 334
    invoke-virtual {v0, p2}, Ljava/util/concurrent/CopyOnWriteArraySet;->add(Ljava/lang/Object;)Z

    .line 335
    .line 336
    .line 337
    move-result p2

    .line 338
    if-nez p2, :cond_9

    .line 339
    .line 340
    goto :goto_3

    .line 341
    :cond_9
    new-instance p2, Lr0/J0;

    .line 342
    .line 343
    const/4 v0, 0x1

    .line 344
    invoke-direct {p2, p0, v0}, Lr0/J0;-><init>(Lr0/L0;I)V

    .line 345
    .line 346
    .line 347
    invoke-static {p1, p2}, Lc0/f;->d(Ljava/lang/reflect/Member;Lc0/a;)V

    .line 348
    .line 349
    .line 350
    :goto_3
    return-void

    .line 351
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method

.method public m()Ljava/util/Set;
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lr0/L0;->i:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x12c

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-class v2, Lq0/h;

    .line 19
    .line 20
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lq0/h;

    .line 25
    .line 26
    invoke-virtual {v3}, Lq0/h;->c()V

    .line 27
    .line 28
    .line 29
    sget-boolean v3, Lz0/i;->a:Z

    .line 30
    .line 31
    invoke-static {}, Lz0/g;->s()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-nez v3, :cond_1

    .line 36
    .line 37
    sget-object v2, LF0/s;->a:LF0/s;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Lq0/h;

    .line 45
    .line 46
    new-instance v3, Ljava/util/ArrayList;

    .line 47
    .line 48
    iget-object v2, v2, Lq0/h;->a:Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 51
    .line 52
    .line 53
    move-object v2, v3

    .line 54
    :goto_0
    new-instance v3, Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_4

    .line 68
    .line 69
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    check-cast v4, Ljava/lang/String;

    .line 74
    .line 75
    if-eqz v4, :cond_3

    .line 76
    .line 77
    invoke-static {v4}, LU0/i;->C0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    goto :goto_2

    .line 86
    :cond_3
    const/4 v4, 0x0

    .line 87
    :goto_2
    if-eqz v4, :cond_2

    .line 88
    .line 89
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    goto :goto_1

    .line 93
    :cond_4
    new-instance v2, Ljava/util/ArrayList;

    .line 94
    .line 95
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 99
    .line 100
    .line 101
    move-result-object v3

    .line 102
    :cond_5
    :goto_3
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 103
    .line 104
    .line 105
    move-result v4

    .line 106
    if-eqz v4, :cond_6

    .line 107
    .line 108
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 109
    .line 110
    .line 111
    move-result-object v4

    .line 112
    move-object v5, v4

    .line 113
    check-cast v5, Ljava/lang/String;

    .line 114
    .line 115
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 116
    .line 117
    .line 118
    move-result v6

    .line 119
    if-nez v6, :cond_5

    .line 120
    .line 121
    sget-boolean v6, Lz0/i;->a:Z

    .line 122
    .line 123
    invoke-static {v5}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 124
    .line 125
    .line 126
    move-result v5

    .line 127
    if-nez v5, :cond_5

    .line 128
    .line 129
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_6
    invoke-static {v2}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v3, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 138
    .line 139
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v3

    .line 143
    if-nez v3, :cond_7

    .line 144
    .line 145
    iget-object v3, p0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 146
    .line 147
    invoke-virtual {v3}, Ljava/util/WeakHashMap;->clear()V

    .line 148
    .line 149
    .line 150
    iget-object v3, p0, Lr0/L0;->l:Ljava/lang/Object;

    .line 151
    .line 152
    check-cast v3, Ljava/util/WeakHashMap;

    .line 153
    .line 154
    invoke-virtual {v3}, Ljava/util/WeakHashMap;->clear()V

    .line 155
    .line 156
    .line 157
    :cond_7
    iput-wide v0, p0, Lr0/L0;->i:J

    .line 158
    .line 159
    iput-object v2, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 160
    .line 161
    invoke-static {v2}, Lr0/L0;->l(Ljava/util/Set;)Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    iput-object v0, p0, Lr0/L0;->k:Ljava/util/Set;

    .line 166
    .line 167
    return-object v2
.end method

.method public n()Ljava/util/Set;
    .locals 7

    .line 1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    iget-wide v2, p0, Lr0/L0;->i:J

    .line 6
    .line 7
    sub-long v2, v0, v2

    .line 8
    .line 9
    const-wide/16 v4, 0x12c

    .line 10
    .line 11
    cmp-long v2, v2, v4

    .line 12
    .line 13
    if-gez v2, :cond_0

    .line 14
    .line 15
    iget-object v0, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 16
    .line 17
    return-object v0

    .line 18
    :cond_0
    const-class v2, Lq0/h;

    .line 19
    .line 20
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    check-cast v3, Lq0/h;

    .line 25
    .line 26
    invoke-virtual {v3}, Lq0/h;->c()V

    .line 27
    .line 28
    .line 29
    sget-boolean v3, Lz0/i;->a:Z

    .line 30
    .line 31
    invoke-static {}, Lz0/g;->x()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_4

    .line 36
    .line 37
    invoke-static {}, Lz0/g;->s()Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-nez v3, :cond_1

    .line 42
    .line 43
    sget-object v2, LF0/s;->a:LF0/s;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_1
    invoke-static {v2}, Lb1/h;->u(Ljava/lang/Class;)Le0/a;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Lq0/h;

    .line 51
    .line 52
    new-instance v3, Ljava/util/ArrayList;

    .line 53
    .line 54
    iget-object v2, v2, Lq0/h;->a:Ljava/util/ArrayList;

    .line 55
    .line 56
    invoke-direct {v3, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 57
    .line 58
    .line 59
    move-object v2, v3

    .line 60
    :goto_0
    invoke-static {v2}, LF0/k;->h0(Ljava/util/List;)Ljava/util/ArrayList;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    new-instance v3, Ljava/util/ArrayList;

    .line 65
    .line 66
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    :cond_2
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_3

    .line 78
    .line 79
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    move-object v5, v4

    .line 84
    check-cast v5, Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {v5}, LU0/q;->d0(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v6

    .line 90
    if-nez v6, :cond_2

    .line 91
    .line 92
    sget-boolean v6, Lz0/i;->a:Z

    .line 93
    .line 94
    invoke-static {v5}, Lz0/g;->e(Ljava/lang/String;)Z

    .line 95
    .line 96
    .line 97
    move-result v5

    .line 98
    if-nez v5, :cond_2

    .line 99
    .line 100
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_3
    invoke-static {v3}, LF0/k;->B0(Ljava/util/Collection;)Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    goto :goto_2

    .line 109
    :cond_4
    sget-object v2, LF0/u;->a:LF0/u;

    .line 110
    .line 111
    :goto_2
    iput-wide v0, p0, Lr0/L0;->i:J

    .line 112
    .line 113
    iput-object v2, p0, Lr0/L0;->j:Ljava/util/Set;

    .line 114
    .line 115
    return-object v2
.end method

.method public u(Ljava/util/List;Ljava/util/Set;)Z
    .locals 3

    .line 1
    invoke-static {p1}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 p1, 0x0

    .line 9
    :goto_0
    if-nez p1, :cond_1

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 17
    .line 18
    .line 19
    move-result-object v1

    .line 20
    :cond_2
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_3

    .line 25
    .line 26
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {p0, v2}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_2

    .line 35
    .line 36
    invoke-interface {p2, v2}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    if-eqz v2, :cond_2

    .line 41
    .line 42
    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    .line 43
    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_3
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-eq p1, v0, :cond_4

    .line 51
    .line 52
    const/4 p1, 0x1

    .line 53
    return p1

    .line 54
    :cond_4
    :goto_2
    const/4 p1, 0x0

    .line 55
    return p1
.end method

.method public v(Ljava/util/List;Ljava/util/Set;)Z
    .locals 7

    .line 1
    invoke-static {p1}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    goto/16 :goto_6

    .line 14
    .line 15
    :cond_1
    iget-object v2, p0, Lr0/L0;->b:Ljava/util/WeakHashMap;

    .line 16
    .line 17
    invoke-virtual {v2, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    if-nez v3, :cond_2

    .line 22
    .line 23
    new-instance v3, Ljava/util/ArrayList;

    .line 24
    .line 25
    invoke-direct {v3, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2, p1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    :cond_2
    check-cast v3, Ljava/util/List;

    .line 32
    .line 33
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v2

    .line 41
    if-eqz v2, :cond_9

    .line 42
    .line 43
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v2

    .line 47
    invoke-static {p0, v2}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v4

    .line 51
    if-eqz v4, :cond_5

    .line 52
    .line 53
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-eqz v5, :cond_3

    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    :cond_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_8

    .line 69
    .line 70
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v6

    .line 74
    invoke-static {p0, v6}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v6

    .line 78
    invoke-static {v6, v4}, LN0/g;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v6

    .line 82
    if-eqz v6, :cond_4

    .line 83
    .line 84
    goto :goto_1

    .line 85
    :cond_5
    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    .line 86
    .line 87
    .line 88
    move-result v4

    .line 89
    if-eqz v4, :cond_6

    .line 90
    .line 91
    goto :goto_2

    .line 92
    :cond_6
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    :cond_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v5

    .line 100
    if-eqz v5, :cond_8

    .line 101
    .line 102
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v5

    .line 106
    if-ne v5, v2, :cond_7

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_8
    :goto_2
    invoke-interface {v3, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    goto :goto_1

    .line 113
    :cond_9
    new-instance p1, Ljava/util/ArrayList;

    .line 114
    .line 115
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 116
    .line 117
    .line 118
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 119
    .line 120
    .line 121
    move-result-object v2

    .line 122
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 123
    .line 124
    .line 125
    move-result v3

    .line 126
    if-eqz v3, :cond_b

    .line 127
    .line 128
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v3

    .line 132
    invoke-static {p0, v3}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v4

    .line 136
    if-eqz v4, :cond_a

    .line 137
    .line 138
    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 139
    .line 140
    .line 141
    move-result v4

    .line 142
    if-eqz v4, :cond_a

    .line 143
    .line 144
    goto :goto_3

    .line 145
    :cond_a
    invoke-virtual {p1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_3

    .line 149
    :cond_b
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 150
    .line 151
    .line 152
    move-result p2

    .line 153
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 154
    .line 155
    .line 156
    move-result v2

    .line 157
    if-eq p2, v2, :cond_c

    .line 158
    .line 159
    goto :goto_5

    .line 160
    :cond_c
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 161
    .line 162
    .line 163
    move-result p2

    .line 164
    move v2, v1

    .line 165
    :goto_4
    if-ge v2, p2, :cond_e

    .line 166
    .line 167
    invoke-interface {v0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v3

    .line 171
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    move-result-object v4

    .line 175
    if-eq v3, v4, :cond_d

    .line 176
    .line 177
    :goto_5
    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 178
    .line 179
    .line 180
    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 181
    .line 182
    .line 183
    const/4 p1, 0x1

    .line 184
    return p1

    .line 185
    :cond_d
    add-int/lit8 v2, v2, 0x1

    .line 186
    .line 187
    goto :goto_4

    .line 188
    :cond_e
    :goto_6
    return v1
.end method

.method public w(Ljava/util/Map;Ljava/util/Set;)Z
    .locals 5

    .line 1
    invoke-static {p1}, LN0/o;->c(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    move-object v0, p1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    :goto_0
    if-nez v0, :cond_1

    .line 11
    .line 12
    goto/16 :goto_4

    .line 13
    .line 14
    :cond_1
    iget-object v1, p0, Lr0/L0;->h:Ljava/util/WeakHashMap;

    .line 15
    .line 16
    invoke-virtual {v1, p1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    if-nez v2, :cond_2

    .line 21
    .line 22
    new-instance v2, Ljava/util/LinkedHashMap;

    .line 23
    .line 24
    invoke-direct {v2}, Ljava/util/LinkedHashMap;-><init>()V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :cond_2
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 34
    .line 35
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_3

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Ljava/util/Map$Entry;

    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-interface {v2, v3, v1}, Ljava/util/Map;->putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 68
    .line 69
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-interface {v2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 77
    .line 78
    .line 79
    move-result-object v1

    .line 80
    :cond_4
    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 81
    .line 82
    .line 83
    move-result v2

    .line 84
    if-eqz v2, :cond_7

    .line 85
    .line 86
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    check-cast v2, Ljava/util/Map$Entry;

    .line 91
    .line 92
    invoke-interface {v2}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    move-result-object v3

    .line 96
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-static {p0, v3}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-nez v4, :cond_5

    .line 105
    .line 106
    invoke-static {p0, v2}, Lr0/L0;->s(Lr0/L0;Ljava/lang/Object;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v4

    .line 110
    :cond_5
    if-eqz v4, :cond_6

    .line 111
    .line 112
    invoke-interface {p2, v4}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v4

    .line 116
    if-nez v4, :cond_4

    .line 117
    .line 118
    :cond_6
    invoke-interface {p1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_7
    invoke-interface {v0}, Ljava/util/Map;->size()I

    .line 123
    .line 124
    .line 125
    move-result p2

    .line 126
    invoke-virtual {p1}, Ljava/util/AbstractMap;->size()I

    .line 127
    .line 128
    .line 129
    move-result v1

    .line 130
    if-ne p2, v1, :cond_a

    .line 131
    .line 132
    invoke-interface {v0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 133
    .line 134
    .line 135
    move-result-object p2

    .line 136
    if-eqz p2, :cond_8

    .line 137
    .line 138
    invoke-interface {p2}, Ljava/util/Collection;->isEmpty()Z

    .line 139
    .line 140
    .line 141
    move-result v1

    .line 142
    if-eqz v1, :cond_8

    .line 143
    .line 144
    goto :goto_4

    .line 145
    :cond_8
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 146
    .line 147
    .line 148
    move-result-object p2

    .line 149
    :goto_3
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 150
    .line 151
    .line 152
    move-result v1

    .line 153
    if-eqz v1, :cond_9

    .line 154
    .line 155
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object v1

    .line 159
    check-cast v1, Ljava/util/Map$Entry;

    .line 160
    .line 161
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 162
    .line 163
    .line 164
    move-result-object v2

    .line 165
    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    .line 167
    .line 168
    move-result-object v2

    .line 169
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 170
    .line 171
    .line 172
    move-result-object v1

    .line 173
    if-ne v2, v1, :cond_a

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_9
    :goto_4
    const/4 p1, 0x0

    .line 177
    return p1

    .line 178
    :cond_a
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 179
    .line 180
    .line 181
    invoke-interface {v0, p1}, Ljava/util/Map;->putAll(Ljava/util/Map;)V

    .line 182
    .line 183
    .line 184
    const/4 p1, 0x1

    .line 185
    return p1
.end method

.method public x(Ljava/lang/Object;Ljava/util/Set;)Z
    .locals 6

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lr0/L0;->h(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    return v2

    .line 17
    :cond_0
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :cond_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_6

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/reflect/Field;

    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    const/4 v4, 0x1

    .line 42
    if-nez v3, :cond_5

    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-string v5, "getName(...)"

    .line 49
    .line 50
    invoke-static {v3, v5}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v5, "data"

    .line 54
    .line 55
    invoke-virtual {v3, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    if-eqz v5, :cond_2

    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_2
    iget-object v5, p0, Lr0/L0;->o:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v5, LA0/U;

    .line 65
    .line 66
    if-eqz v5, :cond_5

    .line 67
    .line 68
    iget-object v5, v5, LA0/U;->c:Ljava/util/List;

    .line 69
    .line 70
    invoke-interface {v5, v3}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v3

    .line 74
    if-ne v3, v4, :cond_5

    .line 75
    .line 76
    :goto_0
    :try_start_0
    invoke-virtual {v1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    invoke-static {v1}, LN0/o;->b(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result v3

    .line 87
    if-eqz v3, :cond_3

    .line 88
    .line 89
    check-cast v1, Ljava/util/List;

    .line 90
    .line 91
    invoke-virtual {p0, v1, p2}, Lr0/L0;->u(Ljava/util/List;Ljava/util/Set;)Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_3

    .line 96
    .line 97
    move v1, v4

    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception v1

    .line 100
    goto :goto_2

    .line 101
    :cond_3
    move v1, v2

    .line 102
    :goto_1
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 103
    .line 104
    .line 105
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 106
    goto :goto_3

    .line 107
    :goto_2
    new-instance v3, LE0/d;

    .line 108
    .line 109
    invoke-direct {v3, v1}, LE0/d;-><init>(Ljava/lang/Throwable;)V

    .line 110
    .line 111
    .line 112
    move-object v1, v3

    .line 113
    :goto_3
    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 114
    .line 115
    instance-of v5, v1, LE0/d;

    .line 116
    .line 117
    if-eqz v5, :cond_4

    .line 118
    .line 119
    move-object v1, v3

    .line 120
    :cond_4
    check-cast v1, Ljava/lang/Boolean;

    .line 121
    .line 122
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 123
    .line 124
    .line 125
    move-result v1

    .line 126
    goto :goto_4

    .line 127
    :cond_5
    move v1, v2

    .line 128
    :goto_4
    if-eqz v1, :cond_1

    .line 129
    .line 130
    move v2, v4

    .line 131
    :cond_6
    return v2
.end method

.method public y(Landroid/view/View;)Landroid/view/View;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lr0/L0;->N(Landroid/view/View;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    return-object p1

    .line 12
    :cond_1
    instance-of v1, p1, Landroid/view/ViewGroup;

    .line 13
    .line 14
    if-eqz v1, :cond_3

    .line 15
    .line 16
    check-cast p1, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    const/4 v2, 0x0

    .line 23
    :goto_0
    if-ge v2, v1, :cond_3

    .line 24
    .line 25
    invoke-virtual {p1, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-virtual {p0, v3}, Lr0/L0;->y(Landroid/view/View;)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    if-eqz v3, :cond_2

    .line 34
    .line 35
    return-object v3

    .line 36
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_3
    return-object v0
.end method
