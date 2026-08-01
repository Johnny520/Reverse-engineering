.class public final L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Landroidx/lifecycle/飘花落叶言子世楪兰苏哲;


# instance fields
.field public final 飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

.field public final synthetic 飘花落叶言子楪哲苏兰世:I


# direct methods
.method public synthetic constructor <init>(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;I)V
    .locals 0

    .line 1
    iput p2, p0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iput-object p1, p0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪哲世苏兰(Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;Landroidx/lifecycle/Lifecycle$Event;)V
    .locals 4

    .line 1
    iget v0, p0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲苏兰世:I

    .line 2
    .line 3
    iget-object v1, p0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪哲兰世苏:Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget-object p0, Landroidx/lifecycle/Lifecycle$Event;->ON_DESTROY:Landroidx/lifecycle/Lifecycle$Event;

    .line 9
    .line 10
    if-ne p2, p0, :cond_0

    .line 11
    .line 12
    check-cast v1, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;

    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪哲苏世兰()Landroid/app/Activity;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/飘花落叶言子楪世兰苏哲;->飘花落叶言子世楪兰苏哲(Landroid/app/Activity;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void

    .line 22
    :pswitch_0
    check-cast v1, Landroidx/activity/ComponentActivity;

    .line 23
    .line 24
    invoke-static {v1}, Landroidx/activity/ComponentActivity;->access$ensureViewModelStore(Landroidx/activity/ComponentActivity;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/activity/ComponentActivity;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-virtual {p1, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :pswitch_1
    check-cast v1, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰哲苏;

    .line 36
    .line 37
    sget-object v0, Landroidx/lifecycle/Lifecycle$Event;->ON_CREATE:Landroidx/lifecycle/Lifecycle$Event;

    .line 38
    .line 39
    if-ne p2, v0, :cond_7

    .line 40
    .line 41
    invoke-interface {p1}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1, p0}, Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;->飘花落叶言子楪世苏兰哲(Landroidx/lifecycle/飘花落叶言子世苏楪兰哲;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰哲苏;->getSavedStateRegistry()L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世哲兰苏;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-string p1, "androidx.savedstate.Restarter"

    .line 53
    .line 54
    invoke-virtual {p0, p1}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世苏哲兰(Ljava/lang/String;)Landroid/os/Bundle;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    if-nez p0, :cond_1

    .line 59
    .line 60
    goto/16 :goto_2

    .line 61
    .line 62
    :cond_1
    const-string p1, "classes_to_restore"

    .line 63
    .line 64
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object p0

    .line 68
    if-eqz p0, :cond_6

    .line 69
    .line 70
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    :cond_2
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 75
    .line 76
    .line 77
    move-result p1

    .line 78
    if-eqz p1, :cond_8

    .line 79
    .line 80
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    check-cast p1, Ljava/lang/String;

    .line 85
    .line 86
    const-string p2, "Class "

    .line 87
    .line 88
    :try_start_0
    const-class v0, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏哲兰;

    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 91
    .line 92
    .line 93
    move-result-object v0

    .line 94
    const/4 v2, 0x0

    .line 95
    invoke-static {p1, v2, v0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v0

    .line 99
    const-class v2, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏兰哲;

    .line 100
    .line 101
    invoke-virtual {v0, v2}, Ljava/lang/Class;->asSubclass(Ljava/lang/Class;)Ljava/lang/Class;

    .line 102
    .line 103
    .line 104
    move-result-object v0

    .line 105
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_2

    .line 106
    .line 107
    .line 108
    const/4 v2, 0x0

    .line 109
    :try_start_1
    invoke-virtual {v0, v2}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 110
    .line 111
    .line 112
    move-result-object p2
    :try_end_1
    .catch Ljava/lang/NoSuchMethodException; {:try_start_1 .. :try_end_1} :catch_1

    .line 113
    const/4 v0, 0x1

    .line 114
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 115
    .line 116
    .line 117
    :try_start_2
    invoke-virtual {p2, v2}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object p2

    .line 121
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 122
    .line 123
    .line 124
    check-cast p2, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世苏兰哲;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 125
    .line 126
    instance-of p1, v1, Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;

    .line 127
    .line 128
    if-eqz p1, :cond_5

    .line 129
    .line 130
    move-object p1, v1

    .line 131
    check-cast p1, Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;

    .line 132
    .line 133
    invoke-interface {p1}, Landroidx/lifecycle/飘花落叶言子苏兰世楪哲;->getViewModelStore()Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;

    .line 134
    .line 135
    .line 136
    move-result-object p1

    .line 137
    invoke-interface {v1}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世兰哲苏;->getSavedStateRegistry()L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世哲兰苏;

    .line 138
    .line 139
    .line 140
    move-result-object p2

    .line 141
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 142
    .line 143
    .line 144
    iget-object p1, p1, Landroidx/lifecycle/飘花落叶言子苏兰楪哲世;->飘花落叶言子楪世苏哲兰:Ljava/util/LinkedHashMap;

    .line 145
    .line 146
    new-instance v0, Ljava/util/HashSet;

    .line 147
    .line 148
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object v2

    .line 152
    check-cast v2, Ljava/util/Collection;

    .line 153
    .line 154
    invoke-direct {v0, v2}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 162
    .line 163
    .line 164
    move-result v2

    .line 165
    if-eqz v2, :cond_4

    .line 166
    .line 167
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 168
    .line 169
    .line 170
    move-result-object v2

    .line 171
    check-cast v2, Ljava/lang/String;

    .line 172
    .line 173
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p1, v2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object v2

    .line 180
    check-cast v2, Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;

    .line 181
    .line 182
    if-nez v2, :cond_3

    .line 183
    .line 184
    goto :goto_1

    .line 185
    :cond_3
    invoke-interface {v1}, Landroidx/lifecycle/飘花落叶言子世苏哲楪兰;->getLifecycle()Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;

    .line 186
    .line 187
    .line 188
    move-result-object v3

    .line 189
    invoke-static {v2, p2, v3}, Landroidx/lifecycle/飘花落叶言子苏楪哲世兰;->飘花落叶言子楪世苏哲兰(Landroidx/lifecycle/飘花落叶言子苏哲世楪兰;L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世哲兰苏;Landroidx/lifecycle/飘花落叶言子楪兰苏哲世;)V

    .line 190
    .line 191
    .line 192
    goto :goto_1

    .line 193
    :cond_4
    new-instance v0, Ljava/util/HashSet;

    .line 194
    .line 195
    invoke-virtual {p1}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 196
    .line 197
    .line 198
    move-result-object p1

    .line 199
    check-cast p1, Ljava/util/Collection;

    .line 200
    .line 201
    invoke-direct {v0, p1}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {v0}, Ljava/util/HashSet;->isEmpty()Z

    .line 205
    .line 206
    .line 207
    move-result p1

    .line 208
    if-nez p1, :cond_2

    .line 209
    .line 210
    invoke-virtual {p2}, L飘花落叶言子兰世楪苏哲/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲兰苏()V

    .line 211
    .line 212
    .line 213
    goto/16 :goto_0

    .line 214
    .line 215
    :cond_5
    const-string p0, "Internal error: OnRecreation should be registered only on components that implement ViewModelStoreOwner. Received owner: "

    .line 216
    .line 217
    invoke-static {v1, p0}, Lcom/typesafe/config/impl/飘花落叶言子世苏兰哲楪;->飘花落叶言子楪哲兰苏世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    .line 220
    goto :goto_2

    .line 221
    :catch_0
    move-exception p0

    .line 222
    const-string p2, "Failed to instantiate "

    .line 223
    .line 224
    invoke-static {p2, p1}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 225
    .line 226
    .line 227
    move-result-object p1

    .line 228
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 229
    .line 230
    .line 231
    goto :goto_2

    .line 232
    :catch_1
    move-exception p0

    .line 233
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 234
    .line 235
    invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object v0

    .line 239
    new-instance v1, Ljava/lang/StringBuilder;

    .line 240
    .line 241
    invoke-direct {v1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    const-string p2, " must have default constructor in order to be automatically recreated"

    .line 248
    .line 249
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    invoke-direct {p1, p2, p0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    throw p1

    .line 260
    :catch_2
    move-exception p0

    .line 261
    const-string v0, " wasn\'t found"

    .line 262
    .line 263
    invoke-static {p2, p1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏兰世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 264
    .line 265
    .line 266
    move-result-object p1

    .line 267
    invoke-static {p1, p0}, Landroidx/collection/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪哲世苏兰(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 268
    .line 269
    .line 270
    goto :goto_2

    .line 271
    :cond_6
    const-string p0, "SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\""

    .line 272
    .line 273
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 274
    .line 275
    .line 276
    goto :goto_2

    .line 277
    :cond_7
    const-string p0, "Next event must be ON_CREATE"

    .line 278
    .line 279
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世哲苏兰(Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    :cond_8
    :goto_2
    return-void

    .line 283
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
