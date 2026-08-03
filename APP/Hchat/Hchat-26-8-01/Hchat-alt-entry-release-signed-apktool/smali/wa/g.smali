.class public final Lwa/g;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Ljava/lang/ClassLoader;

.field public final b:Lh/Hchat/dexkit/DexFinder;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Lokio/a;

.field public final e:Lb5/c;

.field public final f:Lwa/e;

.field public final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public final h:Ljava/util/concurrent/ConcurrentHashMap;

.field public volatile i:Z

.field public volatile j:Z


# direct methods
.method public constructor <init>(Ljava/lang/ClassLoader;Lh/Hchat/dexkit/DexFinder;Landroid/content/SharedPreferences;Lb5/c;Lokio/a;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lwa/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lwa/g;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    iput-object p1, p0, Lwa/g;->a:Ljava/lang/ClassLoader;

    .line 19
    .line 20
    iput-object p2, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    iput-object p3, p0, Lwa/g;->c:Landroid/content/SharedPreferences;

    .line 23
    .line 24
    iput-object p4, p0, Lwa/g;->e:Lb5/c;

    .line 25
    .line 26
    iput-object p5, p0, Lwa/g;->d:Lokio/a;

    .line 27
    .line 28
    new-instance p3, Lwa/e;

    .line 29
    .line 30
    invoke-direct {p3, p2, p1}, Lwa/e;-><init>(Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;)V

    .line 31
    .line 32
    .line 33
    iput-object p3, p0, Lwa/g;->f:Lwa/e;

    .line 34
    .line 35
    return-void
.end method

.method public static b(Ljava/util/ArrayList;Ljava/lang/Class;)V
    .locals 1

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Class;->isInterface()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    :cond_0
    return-void
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;I[B)V
    .locals 9

    .line 1
    sget-object v0, Lwa/j;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v7

    .line 14
    new-instance v2, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;

    .line 15
    .line 16
    move-object v3, p0

    .line 17
    move-object v4, p1

    .line 18
    move v5, p2

    .line 19
    move-object v6, p3

    .line 20
    invoke-direct/range {v2 .. v8}, Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;-><init>(Ljava/lang/String;Ljava/lang/String;I[BJ)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 28
    .line 29
    .line 30
    move-result p1

    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    check-cast p1, Lwa/i;

    .line 38
    .line 39
    :try_start_0
    check-cast p1, Leb/x;

    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Lh/Hchat/hooks/items/script/ScriptPluginRuntime;->a(Lh/Hchat/hooks/items/protobuf/ProtobufPacketRuntime$Packet;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    goto :goto_0

    .line 48
    :catchall_0
    move-exception v0

    .line 49
    move-object p1, v0

    .line 50
    const-string p2, "[Hchat:Protobuf] \u6570\u636e\u5305\u76d1\u542c\u5668\u5904\u7406\u5931\u8d25"

    .line 51
    .line 52
    invoke-static {p2, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_1
    :goto_1
    return-void
.end method

.method public static e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    :goto_0
    const/4 v1, 0x0

    .line 10
    new-array v2, v1, [Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {v0, p1, v2}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    new-array v0, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    invoke-static {p1, p0, v0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method

.method public static h(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "[Hchat:Protobuf] "

    .line 2
    .line 3
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p0}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static i(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    :try_start_0
    const-string v0, "a"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Lwa/g;->o(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :catchall_0
    :cond_1
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    if-eqz v0, :cond_4

    .line 22
    .line 23
    const-class v1, Ljava/lang/Object;

    .line 24
    .line 25
    if-eq v0, v1, :cond_4

    .line 26
    .line 27
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v1

    .line 35
    :catchall_1
    :cond_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_3

    .line 40
    .line 41
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    check-cast v2, Ljava/lang/reflect/Field;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 46
    .line 47
    :try_start_2
    invoke-static {v2, p0}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/reflect/Field;Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    invoke-static {v2}, Lwa/g;->o(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 55
    if-eqz v3, :cond_2

    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_3
    :try_start_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 62
    goto :goto_0

    .line 63
    :catchall_2
    :cond_4
    :goto_1
    const/4 p0, 0x0

    .line 64
    return-object p0
.end method

.method public static o(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_0

    .line 3
    .line 4
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "toByteArray"

    .line 9
    .line 10
    new-array v3, v0, [Ljava/lang/Class;

    .line 11
    .line 12
    invoke-static {v1, v2, v3}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const-class v1, [B

    .line 23
    .line 24
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    const-string v2, "parseFrom"

    .line 29
    .line 30
    invoke-static {p0, v2, v1}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    const/4 p0, 0x1

    .line 37
    return p0

    .line 38
    :cond_0
    return v0
.end method

.method public static u(Ljava/lang/Object;)[B
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    const-string v0, "toByteArray"

    .line 5
    .line 6
    invoke-static {p0, v0}, Lwa/g;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    instance-of v0, p0, [B

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    check-cast p0, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    return-object p0

    .line 17
    :catchall_0
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 18
    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/util/ArrayList;)V
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Lwa/g;->a:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 16
    .line 17
    .line 18
    :catchall_0
    :cond_0
    return-void
.end method

.method public final d(Ljava/lang/Class;Lorg/json/JSONObject;I)Ljava/lang/Object;
    .locals 22

    .line 1
    move/from16 v0, p3

    .line 2
    .line 3
    new-instance v1, Lwa/e;

    .line 4
    .line 5
    invoke-direct {v1}, Lwa/e;-><init>()V

    .line 6
    .line 7
    .line 8
    move-object/from16 v2, p2

    .line 9
    .line 10
    invoke-virtual {v1, v2}, Lwa/e;->c(Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    iget-object v2, v1, Lwa/e;->a:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v2, Ljava/util/LinkedHashMap;

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/AbstractMap;->isEmpty()Z

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    if-eqz v3, :cond_1

    .line 22
    .line 23
    :cond_0
    move-object/from16 v3, p0

    .line 24
    .line 25
    const/16 p2, 0x0

    .line 26
    .line 27
    goto/16 :goto_12

    .line 28
    .line 29
    :cond_1
    invoke-static/range {p1 .. p1}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v5

    .line 41
    if-eqz v5, :cond_0

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v5

    .line 47
    check-cast v5, Ljava/lang/reflect/Constructor;

    .line 48
    .line 49
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    move-result-object v6

    .line 53
    if-eqz v6, :cond_2

    .line 54
    .line 55
    array-length v7, v6

    .line 56
    if-nez v7, :cond_3

    .line 57
    .line 58
    :cond_2
    move-object/from16 v16, v2

    .line 59
    .line 60
    move-object/from16 v17, v3

    .line 61
    .line 62
    const/16 p2, 0x0

    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_3
    array-length v7, v6

    .line 66
    new-array v7, v7, [Ljava/lang/Object;

    .line 67
    .line 68
    array-length v8, v6

    .line 69
    const/4 v10, 0x0

    .line 70
    const/4 v11, 0x0

    .line 71
    :goto_1
    const-class v12, Ljava/lang/Boolean;

    .line 72
    .line 73
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 74
    .line 75
    const-class v14, Ljava/lang/Long;

    .line 76
    .line 77
    sget-object v15, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    const/16 p2, 0x0

    .line 80
    .line 81
    const-class v4, Ljava/lang/Integer;

    .line 82
    .line 83
    sget-object v9, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    move-object/from16 v16, v2

    .line 86
    .line 87
    const-class v2, Ljava/lang/String;

    .line 88
    .line 89
    if-ge v10, v8, :cond_7

    .line 90
    .line 91
    move-object/from16 v17, v3

    .line 92
    .line 93
    aget-object v3, v6, v10

    .line 94
    .line 95
    if-ne v3, v2, :cond_4

    .line 96
    .line 97
    add-int/lit8 v11, v11, 0x1

    .line 98
    .line 99
    :cond_4
    if-eq v3, v2, :cond_6

    .line 100
    .line 101
    if-eq v3, v9, :cond_6

    .line 102
    .line 103
    if-eq v3, v4, :cond_6

    .line 104
    .line 105
    if-eq v3, v15, :cond_6

    .line 106
    .line 107
    if-eq v3, v14, :cond_6

    .line 108
    .line 109
    if-eq v3, v13, :cond_6

    .line 110
    .line 111
    if-ne v3, v12, :cond_5

    .line 112
    .line 113
    goto :goto_3

    .line 114
    :cond_5
    :goto_2
    move-object/from16 v7, p2

    .line 115
    .line 116
    goto/16 :goto_10

    .line 117
    .line 118
    :cond_6
    :goto_3
    add-int/lit8 v10, v10, 0x1

    .line 119
    .line 120
    move-object/from16 v2, v16

    .line 121
    .line 122
    move-object/from16 v3, v17

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    move-object/from16 v17, v3

    .line 126
    .line 127
    if-lez v11, :cond_9

    .line 128
    .line 129
    invoke-virtual {v1}, Lwa/e;->h()Ljava/util/ArrayList;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-virtual {v3}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 134
    .line 135
    .line 136
    move-result-object v3

    .line 137
    :cond_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 138
    .line 139
    .line 140
    move-result v8

    .line 141
    if-eqz v8, :cond_5

    .line 142
    .line 143
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 144
    .line 145
    .line 146
    move-result-object v8

    .line 147
    check-cast v8, Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 150
    .line 151
    .line 152
    move-result v8

    .line 153
    if-nez v8, :cond_8

    .line 154
    .line 155
    :cond_9
    const/4 v3, 0x0

    .line 156
    const/4 v8, 0x0

    .line 157
    const/4 v10, 0x0

    .line 158
    :goto_4
    array-length v11, v6

    .line 159
    if-ge v3, v11, :cond_19

    .line 160
    .line 161
    aget-object v11, v6, v3

    .line 162
    .line 163
    if-ne v11, v2, :cond_b

    .line 164
    .line 165
    add-int/lit8 v11, v8, 0x1

    .line 166
    .line 167
    move-object/from16 v18, v2

    .line 168
    .line 169
    invoke-virtual {v1}, Lwa/e;->h()Ljava/util/ArrayList;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    move/from16 v19, v3

    .line 174
    .line 175
    if-ltz v8, :cond_a

    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 178
    .line 179
    .line 180
    move-result v3

    .line 181
    if-ge v8, v3, :cond_a

    .line 182
    .line 183
    invoke-virtual {v2, v8}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 184
    .line 185
    .line 186
    move-result-object v2

    .line 187
    check-cast v2, Ljava/lang/String;

    .line 188
    .line 189
    goto :goto_5

    .line 190
    :cond_a
    const-string v2, ""

    .line 191
    .line 192
    :goto_5
    aput-object v2, v7, v19

    .line 193
    .line 194
    move v8, v11

    .line 195
    goto/16 :goto_f

    .line 196
    .line 197
    :cond_b
    move-object/from16 v18, v2

    .line 198
    .line 199
    move/from16 v19, v3

    .line 200
    .line 201
    if-eq v11, v9, :cond_10

    .line 202
    .line 203
    if-ne v11, v4, :cond_c

    .line 204
    .line 205
    goto :goto_7

    .line 206
    :cond_c
    if-eq v11, v15, :cond_f

    .line 207
    .line 208
    if-ne v11, v14, :cond_d

    .line 209
    .line 210
    goto :goto_6

    .line 211
    :cond_d
    if-eq v11, v13, :cond_e

    .line 212
    .line 213
    if-ne v11, v12, :cond_18

    .line 214
    .line 215
    :cond_e
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 216
    .line 217
    aput-object v2, v7, v19

    .line 218
    .line 219
    goto/16 :goto_f

    .line 220
    .line 221
    :cond_f
    :goto_6
    const-wide/16 v2, 0x0

    .line 222
    .line 223
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 224
    .line 225
    .line 226
    move-result-object v2

    .line 227
    aput-object v2, v7, v19

    .line 228
    .line 229
    goto/16 :goto_f

    .line 230
    .line 231
    :cond_10
    :goto_7
    add-int/lit8 v2, v10, 0x1

    .line 232
    .line 233
    new-instance v3, Ljava/util/ArrayList;

    .line 234
    .line 235
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 236
    .line 237
    .line 238
    move/from16 v20, v2

    .line 239
    .line 240
    const/4 v11, 0x0

    .line 241
    :goto_8
    const/4 v2, 0x4

    .line 242
    if-ge v11, v2, :cond_13

    .line 243
    .line 244
    sget-object v2, Lwa/e;->d:[Ljava/lang/String;

    .line 245
    .line 246
    aget-object v2, v2, v11

    .line 247
    .line 248
    invoke-virtual {v1, v2}, Lwa/e;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object v2

    .line 252
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 253
    .line 254
    .line 255
    move-result v21

    .line 256
    if-eqz v21, :cond_11

    .line 257
    .line 258
    goto :goto_9

    .line 259
    :cond_11
    :try_start_0
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 260
    .line 261
    .line 262
    move-result-object v2

    .line 263
    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 264
    .line 265
    .line 266
    move-result v2

    .line 267
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 268
    .line 269
    .line 270
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 271
    goto :goto_a

    .line 272
    :catchall_0
    :goto_9
    move-object/from16 v2, p2

    .line 273
    .line 274
    :goto_a
    if-eqz v2, :cond_12

    .line 275
    .line 276
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 277
    .line 278
    .line 279
    :cond_12
    add-int/lit8 v11, v11, 0x1

    .line 280
    .line 281
    goto :goto_8

    .line 282
    :cond_13
    invoke-virtual/range {v16 .. v16}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 283
    .line 284
    .line 285
    move-result-object v2

    .line 286
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 287
    .line 288
    .line 289
    move-result-object v2

    .line 290
    :cond_14
    :goto_b
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 291
    .line 292
    .line 293
    move-result v11

    .line 294
    if-eqz v11, :cond_16

    .line 295
    .line 296
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 297
    .line 298
    .line 299
    move-result-object v11

    .line 300
    check-cast v11, Ljava/lang/String;

    .line 301
    .line 302
    invoke-static {v11}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 303
    .line 304
    .line 305
    move-result v21

    .line 306
    if-eqz v21, :cond_15

    .line 307
    .line 308
    goto :goto_c

    .line 309
    :cond_15
    :try_start_1
    invoke-virtual {v11}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 310
    .line 311
    .line 312
    move-result-object v11

    .line 313
    invoke-static {v11}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 314
    .line 315
    .line 316
    move-result v11

    .line 317
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 318
    .line 319
    .line 320
    move-result-object v11
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 321
    goto :goto_d

    .line 322
    :catchall_1
    :goto_c
    move-object/from16 v11, p2

    .line 323
    .line 324
    :goto_d
    if-eqz v11, :cond_14

    .line 325
    .line 326
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 327
    .line 328
    .line 329
    move-result v21

    .line 330
    if-nez v21, :cond_14

    .line 331
    .line 332
    invoke-virtual {v3, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 333
    .line 334
    .line 335
    goto :goto_b

    .line 336
    :cond_16
    if-ltz v10, :cond_17

    .line 337
    .line 338
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    .line 339
    .line 340
    .line 341
    move-result v2

    .line 342
    if-ge v10, v2, :cond_17

    .line 343
    .line 344
    invoke-virtual {v3, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 345
    .line 346
    .line 347
    move-result-object v2

    .line 348
    check-cast v2, Ljava/lang/Integer;

    .line 349
    .line 350
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 351
    .line 352
    .line 353
    move-result v2

    .line 354
    goto :goto_e

    .line 355
    :cond_17
    const/4 v2, 0x0

    .line 356
    :goto_e
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 357
    .line 358
    .line 359
    move-result-object v2

    .line 360
    aput-object v2, v7, v19

    .line 361
    .line 362
    move/from16 v10, v20

    .line 363
    .line 364
    :cond_18
    :goto_f
    add-int/lit8 v3, v19, 0x1

    .line 365
    .line 366
    move-object/from16 v2, v18

    .line 367
    .line 368
    goto/16 :goto_4

    .line 369
    .line 370
    :cond_19
    :goto_10
    if-nez v7, :cond_1a

    .line 371
    .line 372
    :goto_11
    move-object/from16 v2, v16

    .line 373
    .line 374
    move-object/from16 v3, v17

    .line 375
    .line 376
    goto/16 :goto_0

    .line 377
    .line 378
    :cond_1a
    invoke-static {v5, v7}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    .line 380
    .line 381
    move-result-object v2

    .line 382
    if-nez v2, :cond_1b

    .line 383
    .line 384
    goto :goto_11

    .line 385
    :cond_1b
    const/4 v3, -0x1

    .line 386
    :try_start_2
    const-string v4, "getType"

    .line 387
    .line 388
    invoke-static {v2, v4}, Lwa/g;->e(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 389
    .line 390
    .line 391
    move-result-object v4

    .line 392
    instance-of v6, v4, Ljava/lang/Number;

    .line 393
    .line 394
    if-eqz v6, :cond_1c

    .line 395
    .line 396
    check-cast v4, Ljava/lang/Number;

    .line 397
    .line 398
    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    .line 399
    .line 400
    .line 401
    move-result v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 402
    :catchall_2
    :cond_1c
    if-ne v3, v0, :cond_1d

    .line 403
    .line 404
    const-string v1, "\u539f\u751f\u573a\u666f\u53c2\u6570: type="

    .line 405
    .line 406
    const-string v3, " ctor="

    .line 407
    .line 408
    invoke-static {v0, v1, v3}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 409
    .line 410
    .line 411
    move-result-object v0

    .line 412
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 413
    .line 414
    .line 415
    move-result v1

    .line 416
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 417
    .line 418
    .line 419
    const-string v1, " query="

    .line 420
    .line 421
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 422
    .line 423
    .line 424
    invoke-virtual/range {v16 .. v16}, Ljava/util/LinkedHashMap;->keySet()Ljava/util/Set;

    .line 425
    .line 426
    .line 427
    move-result-object v1

    .line 428
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 429
    .line 430
    .line 431
    move-result-object v1

    .line 432
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 433
    .line 434
    .line 435
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 436
    .line 437
    .line 438
    move-result-object v0

    .line 439
    move-object/from16 v3, p0

    .line 440
    .line 441
    invoke-virtual {v3, v0}, Lwa/g;->p(Ljava/lang/String;)V

    .line 442
    .line 443
    .line 444
    return-object v2

    .line 445
    :cond_1d
    move-object/from16 v3, p0

    .line 446
    .line 447
    goto :goto_11

    .line 448
    :goto_12
    return-object p2
.end method

.method public final f()Ljava/util/ArrayList;
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "com.tencent.mm.modelbase.m1"

    .line 7
    .line 8
    invoke-virtual {p0, v1, v0}, Lwa/g;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 9
    .line 10
    .line 11
    const-string v1, "com.tencent.mm.modelbase.k1"

    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lwa/g;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 14
    .line 15
    .line 16
    const-string v1, "com.tencent.mm.modelbase.l1"

    .line 17
    .line 18
    invoke-virtual {p0, v1, v0}, Lwa/g;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 19
    .line 20
    .line 21
    const-string v1, "com.tencent.mm.modelbase.n1"

    .line 22
    .line 23
    invoke-virtual {p0, v1, v0}, Lwa/g;->a(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 24
    .line 25
    .line 26
    iget-object v1, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->packetBaseClasses:Ljava/util/List;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v1

    .line 38
    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    check-cast v2, Ljava/lang/Class;

    .line 49
    .line 50
    if-eqz v2, :cond_0

    .line 51
    .line 52
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 53
    .line 54
    .line 55
    move-result v3

    .line 56
    if-nez v3, :cond_0

    .line 57
    .line 58
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    return-object v0
.end method

.method public final g(Ljava/util/ArrayList;Ljava/lang/Class;)V
    .locals 6

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    goto :goto_3

    .line 4
    :cond_0
    invoke-virtual {p2}, Ljava/lang/Class;->isInterface()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_8

    .line 9
    .line 10
    iget-object v0, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 11
    .line 12
    if-nez v0, :cond_1

    .line 13
    .line 14
    goto :goto_3

    .line 15
    :cond_1
    new-instance v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->packetBaseClasses:Ljava/util/List;

    .line 21
    .line 22
    if-eqz v2, :cond_2

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 25
    .line 26
    .line 27
    :cond_2
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->netQueueCandidateClasses:Ljava/util/List;

    .line 28
    .line 29
    if-eqz v0, :cond_3

    .line 30
    .line 31
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 32
    .line 33
    .line 34
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    :cond_4
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-eqz v1, :cond_9

    .line 43
    .line 44
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    check-cast v1, Ljava/lang/Class;

    .line 49
    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_5
    invoke-virtual {p2, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 54
    .line 55
    .line 56
    move-result v2

    .line 57
    if-eqz v2, :cond_6

    .line 58
    .line 59
    invoke-static {p1, v1}, Lwa/g;->b(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 60
    .line 61
    .line 62
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredClasses()[Ljava/lang/Class;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    array-length v2, v1

    .line 67
    const/4 v3, 0x0

    .line 68
    :goto_1
    if-ge v3, v2, :cond_4

    .line 69
    .line 70
    aget-object v4, v1, v3

    .line 71
    .line 72
    invoke-virtual {p2, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 73
    .line 74
    .line 75
    move-result v5

    .line 76
    if-eqz v5, :cond_7

    .line 77
    .line 78
    invoke-static {p1, v4}, Lwa/g;->b(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 79
    .line 80
    .line 81
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_8
    invoke-static {p1, p2}, Lwa/g;->b(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 88
    .line 89
    .line 90
    move-result-object p2

    .line 91
    :goto_2
    if-eqz p2, :cond_9

    .line 92
    .line 93
    const-class v0, Ljava/lang/Object;

    .line 94
    .line 95
    if-eq p2, v0, :cond_9

    .line 96
    .line 97
    invoke-static {p1, p2}, Lwa/g;->b(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p2}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    goto :goto_2

    .line 105
    :cond_9
    :goto_3
    return-void
.end method

.method public final j(ILjava/lang/String;)Lwa/f;
    .locals 11

    .line 1
    if-nez p2, :cond_0

    .line 2
    .line 3
    const-string p2, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p2

    .line 10
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iget-object v2, p0, Lwa/g;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    const/4 v3, 0x0

    .line 25
    :cond_1
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_6

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v4

    .line 35
    check-cast v4, Lwa/f;

    .line 36
    .line 37
    iget v5, v4, Lwa/f;->b:I

    .line 38
    .line 39
    if-eq v5, p1, :cond_2

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    iget-object v5, v4, Lwa/f;->a:Ljava/lang/String;

    .line 43
    .line 44
    invoke-virtual {p2, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    if-nez v5, :cond_3

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_3
    iget-wide v5, v4, Lwa/f;->f:J

    .line 52
    .line 53
    sub-long v7, v0, v5

    .line 54
    .line 55
    const-wide/32 v9, 0x927c0

    .line 56
    .line 57
    .line 58
    cmp-long v7, v7, v9

    .line 59
    .line 60
    if-lez v7, :cond_4

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_4
    if-eqz v3, :cond_5

    .line 64
    .line 65
    iget-wide v7, v3, Lwa/f;->f:J

    .line 66
    .line 67
    cmp-long v5, v5, v7

    .line 68
    .line 69
    if-lez v5, :cond_1

    .line 70
    .line 71
    :cond_5
    move-object v3, v4

    .line 72
    goto :goto_1

    .line 73
    :cond_6
    const-string v0, " uri="

    .line 74
    .line 75
    if-eqz v3, :cond_7

    .line 76
    .line 77
    new-instance v1, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    const-string v2, "\u5feb\u7167\u547d\u4e2d: type="

    .line 80
    .line 81
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    const-string p1, " req="

    .line 94
    .line 95
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 96
    .line 97
    .line 98
    iget-object p1, v3, Lwa/f;->d:Ljava/lang/Object;

    .line 99
    .line 100
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p1

    .line 115
    invoke-virtual {p0, p1}, Lwa/g;->p(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    return-object v3

    .line 119
    :cond_7
    new-instance v1, Ljava/lang/StringBuilder;

    .line 120
    .line 121
    const-string v2, "\u5feb\u7167\u672a\u547d\u4e2d: type="

    .line 122
    .line 123
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-virtual {p0, p1}, Lwa/g;->p(Ljava/lang/String;)V

    .line 140
    .line 141
    .line 142
    return-object v3
.end method

.method public final k()V
    .locals 6

    .line 1
    iget-boolean v0, p0, Lwa/g;->j:Z

    .line 2
    .line 3
    if-nez v0, :cond_7

    .line 4
    .line 5
    iget-object v0, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 6
    .line 7
    if-eqz v0, :cond_7

    .line 8
    .line 9
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->protobufNetSceneBaseClass:Ljava/lang/Class;

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    goto/16 :goto_4

    .line 14
    .line 15
    :cond_0
    :try_start_0
    new-instance v0, Ljava/util/HashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    iget-object v1, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 21
    .line 22
    iget-object v1, v1, Lh/Hchat/dexkit/DexFinder;->protobufSceneEndMethods:Ljava/util/List;

    .line 23
    .line 24
    const/4 v2, 0x0

    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    move v3, v2

    .line 32
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    if-eqz v4, :cond_2

    .line 37
    .line 38
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v4

    .line 42
    check-cast v4, Ljava/lang/reflect/Method;

    .line 43
    .line 44
    invoke-virtual {p0, v4, v0}, Lwa/g;->l(Ljava/lang/reflect/Method;Ljava/util/HashSet;)I

    .line 45
    .line 46
    .line 47
    move-result v4

    .line 48
    add-int/2addr v3, v4

    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_3

    .line 52
    :cond_1
    move v3, v2

    .line 53
    :cond_2
    new-instance v1, Ljava/util/ArrayList;

    .line 54
    .line 55
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 56
    .line 57
    .line 58
    iget-object v4, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 59
    .line 60
    iget-object v4, v4, Lh/Hchat/dexkit/DexFinder;->protobufOnGYNetEndClass:Ljava/lang/Class;

    .line 61
    .line 62
    invoke-virtual {p0, v1, v4}, Lwa/g;->g(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 63
    .line 64
    .line 65
    iget-object v4, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 66
    .line 67
    iget-object v4, v4, Lh/Hchat/dexkit/DexFinder;->packetBaseClasses:Ljava/util/List;

    .line 68
    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    :goto_1
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 76
    .line 77
    .line 78
    move-result v5

    .line 79
    if-eqz v5, :cond_3

    .line 80
    .line 81
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v5

    .line 85
    check-cast v5, Ljava/lang/Class;

    .line 86
    .line 87
    invoke-virtual {p0, v1, v5}, Lwa/g;->g(Ljava/util/ArrayList;Ljava/lang/Class;)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 92
    .line 93
    .line 94
    move-result-object v1

    .line 95
    :cond_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    if-eqz v4, :cond_5

    .line 100
    .line 101
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    check-cast v4, Ljava/lang/Class;

    .line 106
    .line 107
    invoke-static {v4}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 108
    .line 109
    .line 110
    move-result-object v4

    .line 111
    invoke-interface {v4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    .line 116
    .line 117
    .line 118
    move-result v5

    .line 119
    if-eqz v5, :cond_4

    .line 120
    .line 121
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v5

    .line 125
    check-cast v5, Ljava/lang/reflect/Method;

    .line 126
    .line 127
    invoke-virtual {p0, v5, v0}, Lwa/g;->l(Ljava/lang/reflect/Method;Ljava/util/HashSet;)I

    .line 128
    .line 129
    .line 130
    move-result v5

    .line 131
    add-int/2addr v3, v5

    .line 132
    goto :goto_2

    .line 133
    :cond_5
    if-lez v3, :cond_6

    .line 134
    .line 135
    const/4 v2, 0x1

    .line 136
    :cond_6
    iput-boolean v2, p0, Lwa/g;->j:Z

    .line 137
    .line 138
    if-gtz v3, :cond_7

    .line 139
    .line 140
    const-string v0, "Hook\u901a\u7528\u53d1\u5305\u56de\u8c03\u9694\u79bb\u5931\u8d25: \u672a\u627e\u5230onSceneEnd"

    .line 141
    .line 142
    invoke-static {v0}, Lwa/g;->h(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 143
    .line 144
    .line 145
    return-void

    .line 146
    :goto_3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v2, "Hook\u901a\u7528\u53d1\u5305\u56de\u8c03\u9694\u79bb\u5931\u8d25: "

    .line 149
    .line 150
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 161
    .line 162
    .line 163
    move-result-object v0

    .line 164
    invoke-static {v0}, Lwa/g;->h(Ljava/lang/String;)V

    .line 165
    .line 166
    .line 167
    :cond_7
    :goto_4
    return-void
.end method

.method public final l(Ljava/lang/reflect/Method;Ljava/util/HashSet;)I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_2

    .line 3
    .line 4
    const-string v1, "onSceneEnd"

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    if-eqz v1, :cond_2

    .line 22
    .line 23
    array-length v2, v1

    .line 24
    const/4 v3, 0x4

    .line 25
    if-ne v2, v3, :cond_2

    .line 26
    .line 27
    aget-object v2, v1, v0

    .line 28
    .line 29
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 30
    .line 31
    if-ne v2, v3, :cond_2

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    aget-object v4, v1, v2

    .line 35
    .line 36
    if-ne v4, v3, :cond_2

    .line 37
    .line 38
    const/4 v3, 0x2

    .line 39
    aget-object v3, v1, v3

    .line 40
    .line 41
    const-class v4, Ljava/lang/String;

    .line 42
    .line 43
    if-ne v3, v4, :cond_2

    .line 44
    .line 45
    iget-object v3, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->protobufNetSceneBaseClass:Ljava/lang/Class;

    .line 50
    .line 51
    if-eqz v3, :cond_2

    .line 52
    .line 53
    const/4 v4, 0x3

    .line 54
    aget-object v1, v1, v4

    .line 55
    .line 56
    invoke-virtual {v3, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-eqz v1, :cond_2

    .line 61
    .line 62
    new-instance v1, Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v3

    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string v3, "#"

    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v3

    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v1

    .line 94
    invoke-virtual {p2, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result p2

    .line 98
    if-nez p2, :cond_1

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_1
    sget-object p2, Lr8/i;->b:Lr8/i;

    .line 102
    .line 103
    new-instance v0, Lba/f;

    .line 104
    .line 105
    const/16 v1, 0x1b

    .line 106
    .line 107
    invoke-direct {v0, v1}, Lba/f;-><init>(I)V

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, p1, v0}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 111
    .line 112
    .line 113
    return v2

    .line 114
    :cond_2
    :goto_0
    return v0
.end method

.method public final m()Z
    .locals 11

    .line 1
    iget-boolean v0, p0, Lwa/g;->i:Z

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    :try_start_0
    invoke-virtual {p0}, Lwa/g;->f()Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    new-instance v3, Ljava/util/HashSet;

    .line 13
    .line 14
    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    move v4, v0

    .line 22
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    .line 24
    .line 25
    move-result v5

    .line 26
    if-eqz v5, :cond_5

    .line 27
    .line 28
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    check-cast v5, Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 35
    .line 36
    .line 37
    move-result-object v6

    .line 38
    invoke-interface {v6}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 39
    .line 40
    .line 41
    move-result-object v6

    .line 42
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    .line 43
    .line 44
    .line 45
    move-result v7

    .line 46
    if-eqz v7, :cond_1

    .line 47
    .line 48
    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object v7

    .line 52
    check-cast v7, Ljava/lang/reflect/Method;

    .line 53
    .line 54
    const-string v8, "dispatch"

    .line 55
    .line 56
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result v8

    .line 64
    if-nez v8, :cond_2

    .line 65
    .line 66
    goto :goto_0

    .line 67
    :cond_2
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 68
    .line 69
    .line 70
    move-result-object v8

    .line 71
    array-length v8, v8

    .line 72
    const/4 v9, 0x3

    .line 73
    if-eq v8, v9, :cond_3

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    new-instance v8, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v9

    .line 85
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    const-string v9, "#"

    .line 89
    .line 90
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->toString()Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v9

    .line 97
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v8

    .line 104
    invoke-virtual {v3, v8}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-nez v8, :cond_4

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_4
    sget-object v8, Lr8/i;->b:Lr8/i;

    .line 112
    .line 113
    new-instance v9, Lb9/e;

    .line 114
    .line 115
    const/16 v10, 0x1d

    .line 116
    .line 117
    invoke-direct {v9, p0, v10}, Lb9/e;-><init>(Ljava/lang/Object;I)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v8, v7, v9}, Lr8/i;->b(Ljava/lang/reflect/Member;Lde/robv/android/xposed/XC_MethodHook;)Lde/robv/android/xposed/XC_MethodHook$Unhook;

    .line 121
    .line 122
    .line 123
    add-int/lit8 v4, v4, 0x1

    .line 124
    .line 125
    goto :goto_0

    .line 126
    :catchall_0
    move-exception v1

    .line 127
    goto :goto_2

    .line 128
    :cond_5
    invoke-virtual {p0}, Lwa/g;->k()V

    .line 129
    .line 130
    .line 131
    if-lez v4, :cond_6

    .line 132
    .line 133
    goto :goto_1

    .line 134
    :cond_6
    move v1, v0

    .line 135
    :goto_1
    iput-boolean v1, p0, Lwa/g;->i:Z

    .line 136
    .line 137
    if-gtz v4, :cond_7

    .line 138
    .line 139
    const-string v1, "Hook\u5931\u8d25: \u672a\u627e\u5230dispatch"

    .line 140
    .line 141
    invoke-static {v1}, Lwa/g;->h(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    :cond_7
    iget-boolean v0, p0, Lwa/g;->i:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 145
    .line 146
    return v0

    .line 147
    :goto_2
    new-instance v2, Ljava/lang/StringBuilder;

    .line 148
    .line 149
    const-string v3, "Hook\u5931\u8d25: "

    .line 150
    .line 151
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-static {v1}, Lwa/g;->h(Ljava/lang/String;)V

    .line 166
    .line 167
    .line 168
    return v0
.end method

.method public final n(I)Z
    .locals 6

    .line 1
    const-string v0, "25694,14186,5171,11421,389,3565,138,1948,211,29710,996,4326,4687,4768,28920,379,8674"

    .line 2
    .line 3
    iget-object v1, p0, Lwa/g;->c:Landroid/content/SharedPreferences;

    .line 4
    .line 5
    if-nez v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v2, "protobuf_packet_block_types"

    .line 9
    .line 10
    invoke-interface {v1, v2, v0}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_1

    .line 20
    .line 21
    return v2

    .line 22
    :cond_1
    const-string v1, "[,\uff0c|\\s]+"

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    array-length v1, v0

    .line 29
    move v3, v2

    .line 30
    :goto_1
    if-ge v3, v1, :cond_4

    .line 31
    .line 32
    aget-object v4, v0, v3

    .line 33
    .line 34
    invoke-virtual {v4}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v5

    .line 38
    if-nez v5, :cond_2

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_2
    :try_start_0
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v4

    .line 45
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 46
    .line 47
    .line 48
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    if-ne v4, p1, :cond_3

    .line 50
    .line 51
    const/4 p1, 0x1

    .line 52
    return p1

    .line 53
    :catchall_0
    :cond_3
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_4
    return v2
.end method

.method public final p(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lwa/g;->d:Lokio/a;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-string v0, "[Hchat:Protobuf] "

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-static {p1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method

.method public final q(Ljava/lang/String;Ljava/lang/String;I[B)V
    .locals 11

    .line 1
    :try_start_0
    invoke-static {p4}, Lig/a;->Z([B)Lorg/json/JSONObject;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 9
    goto :goto_0

    .line 10
    :catchall_0
    const-string v0, "{}"

    .line 11
    .line 12
    :goto_0
    const-string v1, "[Hchat:Protobuf] "

    .line 13
    .line 14
    const-string v2, "\nUri: "

    .line 15
    .line 16
    const-string v3, "\nType: "

    .line 17
    .line 18
    invoke-static {v1, p1, v2, p2, v3}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v2, "\nLen: "

    .line 26
    .line 27
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    array-length v2, p4

    .line 31
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v2, "\nJson: "

    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-static {v1}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lwa/g;->e:Lb5/c;

    .line 50
    .line 51
    if-eqz v1, :cond_1

    .line 52
    .line 53
    array-length p4, p4

    .line 54
    const-string v2, "[Hchat:Protobuf] \u5199\u5165\u6293\u5305\u6587\u4ef6\u5931\u8d25: "

    .line 55
    .line 56
    const-string v3, "\nJson: "

    .line 57
    .line 58
    const-string v4, "\nLen: "

    .line 59
    .line 60
    const-string v5, "\nType: "

    .line 61
    .line 62
    const-string v6, "\nUri: "

    .line 63
    .line 64
    const-string v7, "----- "

    .line 65
    .line 66
    monitor-enter v1

    .line 67
    :try_start_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 68
    .line 69
    .line 70
    :try_start_2
    invoke-virtual {v1}, Lb5/c;->E()Ljava/io/File;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v8}, Ljava/io/File;->isDirectory()Z

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    if-nez v9, :cond_0

    .line 79
    .line 80
    invoke-virtual {v8}, Ljava/io/File;->mkdirs()Z

    .line 81
    .line 82
    .line 83
    move-result v9
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 84
    if-nez v9, :cond_0

    .line 85
    .line 86
    monitor-exit v1

    .line 87
    goto :goto_3

    .line 88
    :catchall_1
    move-exception p1

    .line 89
    goto :goto_1

    .line 90
    :cond_0
    :try_start_3
    new-instance v9, Ljava/io/File;

    .line 91
    .line 92
    invoke-virtual {v1}, Lb5/c;->f()Ljava/lang/String;

    .line 93
    .line 94
    .line 95
    move-result-object v10

    .line 96
    invoke-direct {v9, v8, v10}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    new-instance v8, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    iget-object v7, v1, Lb5/c;->b:Ljava/lang/Object;

    .line 105
    .line 106
    check-cast v7, Ljava/text/SimpleDateFormat;

    .line 107
    .line 108
    new-instance v10, Ljava/util/Date;

    .line 109
    .line 110
    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    .line 111
    .line 112
    .line 113
    invoke-virtual {v7, v10}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 114
    .line 115
    .line 116
    move-result-object v7

    .line 117
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    const-string v7, " -----\n"

    .line 121
    .line 122
    invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 123
    .line 124
    .line 125
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v8, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 135
    .line 136
    .line 137
    invoke-virtual {v8, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v8, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    const-string p1, "\n\n"

    .line 153
    .line 154
    invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    invoke-static {v9, p1}, Ldg/l;->Z(Ljava/io/File;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 162
    .line 163
    .line 164
    goto :goto_2

    .line 165
    :goto_1
    :try_start_4
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 166
    .line 167
    .line 168
    move-result-object p2

    .line 169
    new-instance p3, Ljava/lang/StringBuilder;

    .line 170
    .line 171
    invoke-direct {p3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    invoke-static {p2, p1}, Lfb/v0;->n(Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 182
    .line 183
    .line 184
    :goto_2
    monitor-exit v1

    .line 185
    goto :goto_3

    .line 186
    :catchall_2
    move-exception p1

    .line 187
    :try_start_5
    monitor-exit v1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 188
    throw p1

    .line 189
    :cond_1
    :goto_3
    return-void
.end method

.method public final r(Lwa/h;ZLjava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-interface {p1, p3, p2}, Lwa/h;->c(Ljava/lang/String;Z)V

    .line 4
    .line 5
    .line 6
    :cond_0
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, p3}, Lwa/g;->p(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :cond_1
    invoke-static {p3}, Lwa/g;->h(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final s(Lwa/f;[BLjava/lang/String;ILwa/h;)Z
    .locals 7

    .line 1
    const-string v0, "\u5df2\u7528\u540c\u7c7b\u8bf7\u6c42\u91cd\u653e: "

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    :try_start_0
    iget-object v2, p1, Lwa/f;->c:Ljava/lang/Object;

    .line 5
    .line 6
    iget-object v3, p1, Lwa/f;->d:Ljava/lang/Object;

    .line 7
    .line 8
    if-eqz v2, :cond_6

    .line 9
    .line 10
    iget-object p1, p1, Lwa/f;->e:[B

    .line 11
    .line 12
    array-length v4, p1

    .line 13
    const/4 v5, 0x1

    .line 14
    const/4 v6, 0x4

    .line 15
    if-lt v4, v6, :cond_0

    .line 16
    .line 17
    aget-byte v4, p1, v1

    .line 18
    .line 19
    and-int/lit16 v4, v4, 0xff

    .line 20
    .line 21
    if-nez v4, :cond_0

    .line 22
    .line 23
    move v4, v5

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    move v4, v1

    .line 26
    :goto_0
    if-nez v4, :cond_1

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_1
    if-nez p2, :cond_2

    .line 30
    .line 31
    move v4, v1

    .line 32
    goto :goto_1

    .line 33
    :cond_2
    array-length v4, p2

    .line 34
    :goto_1
    add-int/2addr v4, v6

    .line 35
    new-array v4, v4, [B

    .line 36
    .line 37
    invoke-static {p1, v1, v4, v1, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 38
    .line 39
    .line 40
    if-eqz p2, :cond_3

    .line 41
    .line 42
    array-length p1, p2

    .line 43
    invoke-static {p2, v1, v4, v6, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    :cond_3
    move-object p2, v4

    .line 47
    :goto_2
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    const-string v4, "parseFrom"

    .line 52
    .line 53
    const-class v6, [B

    .line 54
    .line 55
    filled-new-array {v6}, [Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    move-result-object v6

    .line 59
    invoke-static {p1, v4, v6}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-static {p1, v3, p2}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 71
    .line 72
    .line 73
    move-result-object p1

    .line 74
    if-eqz p1, :cond_4

    .line 75
    .line 76
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    iget-object p1, p1, Lm8/a;->a:Lm8/c;

    .line 81
    .line 82
    invoke-virtual {p1, v2}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_4

    .line 87
    .line 88
    goto :goto_3

    .line 89
    :catchall_0
    move-exception p1

    .line 90
    goto :goto_5

    .line 91
    :cond_4
    move v5, v1

    .line 92
    :goto_3
    if-eqz v5, :cond_5

    .line 93
    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    const-string p2, " type="

    .line 103
    .line 104
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p1

    .line 114
    goto :goto_4

    .line 115
    :cond_5
    const-string p1, "\u53d1\u9001\u5931\u8d25: \u7f51\u7edcAPI\u672a\u5c31\u7eea"

    .line 116
    .line 117
    :goto_4
    invoke-virtual {p0, p5, v5, p1}, Lwa/g;->r(Lwa/h;ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 118
    .line 119
    .line 120
    return v5

    .line 121
    :cond_6
    return v1

    .line 122
    :goto_5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 123
    .line 124
    const-string p3, "\u91cd\u653e\u53d1\u9001\u5931\u8d25: "

    .line 125
    .line 126
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    invoke-virtual {p0, p5, v1, p1}, Lwa/g;->r(Lwa/h;ZLjava/lang/String;)V

    .line 141
    .line 142
    .line 143
    return v1
.end method

.method public final t(Ljava/lang/String;[B)Z
    .locals 4

    .line 1
    const-string v0, "|"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lbc/e;->n(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-static {p2}, Ljava/util/Arrays;->hashCode([B)I

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 19
    .line 20
    .line 21
    move-result-wide v0

    .line 22
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-object v2, p0, Lwa/g;->h:Ljava/util/concurrent/ConcurrentHashMap;

    .line 27
    .line 28
    invoke-virtual {v2, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p1

    .line 32
    check-cast p1, Ljava/lang/Long;

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->size()I

    .line 35
    .line 36
    .line 37
    move-result p2

    .line 38
    const/16 v3, 0x50

    .line 39
    .line 40
    if-le p2, v3, :cond_0

    .line 41
    .line 42
    :try_start_0
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 43
    .line 44
    .line 45
    move-result-object p2

    .line 46
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p2

    .line 54
    invoke-virtual {v2, p2}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 55
    .line 56
    .line 57
    :catchall_0
    :cond_0
    if-eqz p1, :cond_2

    .line 58
    .line 59
    invoke-virtual {p1}, Ljava/lang/Long;->longValue()J

    .line 60
    .line 61
    .line 62
    move-result-wide p1

    .line 63
    sub-long/2addr v0, p1

    .line 64
    const-wide/16 p1, 0x1f4

    .line 65
    .line 66
    cmp-long p1, v0, p1

    .line 67
    .line 68
    if-lez p1, :cond_1

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_1
    const/4 p1, 0x0

    .line 72
    goto :goto_1

    .line 73
    :cond_2
    :goto_0
    const/4 p1, 0x1

    .line 74
    :goto_1
    return p1
.end method

.method public final v(ILjava/lang/String;Lorg/json/JSONObject;Lwa/h;)Z
    .locals 4

    .line 1
    const-string v0, "\u539f\u751f\u573a\u666f\u5df2\u6784\u9020: type="

    .line 2
    .line 3
    const-string v1, " uri="

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Lwa/g;->b:Lh/Hchat/dexkit/DexFinder;

    .line 7
    .line 8
    if-eqz v3, :cond_2

    .line 9
    .line 10
    :try_start_0
    invoke-virtual {v3, p2, p1}, Lh/Hchat/dexkit/DexFinder;->findNativeNetSceneClass(Ljava/lang/String;I)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-nez v3, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v3, p3, p1}, Lwa/g;->d(Ljava/lang/Class;Lorg/json/JSONObject;I)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p3

    .line 21
    if-eqz p3, :cond_1

    .line 22
    .line 23
    new-instance v3, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string v0, " class="

    .line 32
    .line 33
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v0

    .line 51
    invoke-virtual {p0, v0}, Lwa/g;->p(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    :cond_1
    move-object v2, p3

    .line 55
    goto :goto_0

    .line 56
    :catchall_0
    move-exception p3

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    .line 58
    .line 59
    const-string v3, "\u539f\u751f\u573a\u666f\u6784\u9020\u5931\u8d25: type="

    .line 60
    .line 61
    invoke-direct {v0, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string v3, " msg="

    .line 74
    .line 75
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p3}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p3

    .line 82
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p3

    .line 89
    invoke-virtual {p0, p3}, Lwa/g;->p(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    :goto_0
    const/4 p3, 0x0

    .line 93
    if-nez v2, :cond_3

    .line 94
    .line 95
    return p3

    .line 96
    :cond_3
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    if-eqz v0, :cond_4

    .line 101
    .line 102
    invoke-static {}, Lh/Hchat/hooks/api/core/WeChatApis;->network()Lm8/a;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    iget-object v0, v0, Lm8/a;->a:Lm8/c;

    .line 107
    .line 108
    invoke-virtual {v0, v2}, Lm8/c;->j(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_4

    .line 113
    .line 114
    new-instance p3, Ljava/lang/StringBuilder;

    .line 115
    .line 116
    const-string v0, "\u5df2\u7528\u539f\u751f\u573a\u666f\u53d1\u9001: "

    .line 117
    .line 118
    invoke-direct {p3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    const-string p2, " type="

    .line 125
    .line 126
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object p1

    .line 136
    const/4 p2, 0x1

    .line 137
    invoke-virtual {p0, p4, p2, p1}, Lwa/g;->r(Lwa/h;ZLjava/lang/String;)V

    .line 138
    .line 139
    .line 140
    return p2

    .line 141
    :cond_4
    new-instance p4, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v0, "\u539f\u751f\u573a\u666f\u53d1\u9001\u5931\u8d25: type="

    .line 144
    .line 145
    invoke-direct {p4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 149
    .line 150
    .line 151
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    const-string p1, " scene="

    .line 158
    .line 159
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object p1

    .line 170
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object p1

    .line 177
    invoke-virtual {p0, p1}, Lwa/g;->p(Ljava/lang/String;)V

    .line 178
    .line 179
    .line 180
    return p3
.end method
