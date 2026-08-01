.class public final Landroidx/savedstate/Recreator;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/lifecycle/q;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LM/f;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Landroidx/savedstate/Recreator;->a:Ljava/lang/Object;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final c(Landroidx/lifecycle/s;Landroidx/lifecycle/m;)V
    .locals 5

    .line 1
    sget-object v0, Landroidx/lifecycle/m;->ON_CREATE:Landroidx/lifecycle/m;

    .line 2
    .line 3
    if-ne p2, v0, :cond_5

    .line 4
    .line 5
    invoke-interface {p1}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p1, p0}, Landroidx/lifecycle/u;->f(Landroidx/lifecycle/r;)V

    .line 10
    .line 11
    .line 12
    iget-object p1, p0, Landroidx/savedstate/Recreator;->a:Ljava/lang/Object;

    .line 13
    .line 14
    invoke-interface {p1}, LM/f;->b()LM/d;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-string v0, "androidx.savedstate.Restarter"

    .line 19
    .line 20
    invoke-virtual {p2, v0}, LM/d;->c(Ljava/lang/String;)Landroid/os/Bundle;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    if-nez p2, :cond_0

    .line 25
    .line 26
    goto/16 :goto_2

    .line 27
    .line 28
    :cond_0
    const-string v0, "classes_to_restore"

    .line 29
    .line 30
    invoke-virtual {p2, v0}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-eqz p2, :cond_4

    .line 35
    .line 36
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 37
    .line 38
    .line 39
    move-result-object p2

    .line 40
    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Ljava/lang/String;

    .line 51
    .line 52
    const-string v1, "Class "

    .line 53
    .line 54
    :try_start_0
    const-class v2, Landroidx/savedstate/Recreator;

    .line 55
    .line 56
    invoke-virtual {v2}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 57
    .line 58
    .line 59
    move-result-object v2

    .line 60
    const/4 v3, 0x0

    .line 61
    invoke-static {v0, v3, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-class v3, LM/b;

    .line 66
    .line 67
    invoke-virtual {v2, v3}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v2

    .line 71
    const-string v3, "{\n                Class.\u2026class.java)\n            }"

    .line 72
    .line 73
    invoke-static {v2, v3}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 74
    .line 75
    .line 76
    const/4 v3, 0x0

    .line 77
    :try_start_1
    invoke-virtual {v2, v3}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 78
    .line 79
    .line 80
    move-result-object v1
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 81
    const/4 v2, 0x1

    .line 82
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 83
    .line 84
    .line 85
    :try_start_2
    invoke-virtual {v1, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-string v2, "{\n                constr\u2026wInstance()\n            }"

    .line 90
    .line 91
    invoke-static {v1, v2}, LN0/g;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    check-cast v1, LM/b;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 95
    .line 96
    move-object v0, p1

    .line 97
    check-cast v0, Landroidx/lifecycle/Q;

    .line 98
    .line 99
    invoke-interface {v0}, Landroidx/lifecycle/Q;->getViewModelStore()Landroidx/lifecycle/P;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {p1}, LM/f;->b()LM/d;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    new-instance v2, Ljava/util/HashSet;

    .line 111
    .line 112
    iget-object v0, v0, Landroidx/lifecycle/P;->a:Ljava/util/LinkedHashMap;

    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-direct {v2, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 126
    .line 127
    .line 128
    move-result v3

    .line 129
    if-eqz v3, :cond_2

    .line 130
    .line 131
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object v3

    .line 135
    check-cast v3, Ljava/lang/String;

    .line 136
    .line 137
    const-string v4, "key"

    .line 138
    .line 139
    invoke-static {v3, v4}, LN0/g;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0, v3}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 143
    .line 144
    .line 145
    move-result-object v3

    .line 146
    check-cast v3, Landroidx/lifecycle/L;

    .line 147
    .line 148
    invoke-static {v3}, LN0/g;->b(Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    invoke-interface {p1}, Landroidx/lifecycle/s;->c()Landroidx/lifecycle/u;

    .line 152
    .line 153
    .line 154
    move-result-object v4

    .line 155
    invoke-static {v3, v1, v4}, Landroidx/lifecycle/G;->a(Landroidx/lifecycle/L;LM/d;Landroidx/lifecycle/u;)V

    .line 156
    .line 157
    .line 158
    goto :goto_1

    .line 159
    :cond_2
    new-instance v2, Ljava/util/HashSet;

    .line 160
    .line 161
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    invoke-direct {v2, v0}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/util/HashSet;->isEmpty()Z

    .line 169
    .line 170
    .line 171
    move-result v0

    .line 172
    if-nez v0, :cond_1

    .line 173
    .line 174
    invoke-virtual {v1}, LM/d;->g()V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_0

    .line 178
    .line 179
    :catch_0
    move-exception p1

    .line 180
    new-instance p2, Ljava/lang/RuntimeException;

    .line 181
    .line 182
    const-string v1, "Failed to instantiate "

    .line 183
    .line 184
    invoke-static {v1, v0}, LL/d;->h(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 185
    .line 186
    .line 187
    move-result-object v0

    .line 188
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 189
    .line 190
    .line 191
    throw p2

    .line 192
    :catch_1
    move-exception p1

    .line 193
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 194
    .line 195
    new-instance v0, Ljava/lang/StringBuilder;

    .line 196
    .line 197
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v1, " must have default constructor in order to be automatically recreated"

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    invoke-direct {p2, v0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 217
    .line 218
    .line 219
    throw p2

    .line 220
    :catch_2
    move-exception p1

    .line 221
    new-instance p2, Ljava/lang/RuntimeException;

    .line 222
    .line 223
    const-string v2, " wasn\'t found"

    .line 224
    .line 225
    invoke-static {v1, v0, v2}, LL/d;->i(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v0

    .line 229
    invoke-direct {p2, v0, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 230
    .line 231
    .line 232
    throw p2

    .line 233
    :cond_3
    :goto_2
    return-void

    .line 234
    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 235
    .line 236
    const-string p2, "Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 237
    .line 238
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    throw p1

    .line 242
    :cond_5
    new-instance p1, Ljava/lang/AssertionError;

    .line 243
    .line 244
    const-string p2, "Next event must be ON_CREATE"

    .line 245
    .line 246
    invoke-direct {p1, p2}, Ljava/lang/AssertionError;-><init>(Ljava/lang/Object;)V

    .line 247
    .line 248
    .line 249
    throw p1
.end method
