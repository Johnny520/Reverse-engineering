.class public final Lwa/e;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final c:[[Ljava/lang/String;

.field public static final d:[Ljava/lang/String;


# instance fields
.field public final a:Ljava/lang/Object;

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    const-string v0, "sendId"

    .line 2
    .line 3
    const-string v1, "sendid"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    const-string v0, "nativeUrl"

    .line 10
    .line 11
    const-string v1, "nativeurl"

    .line 12
    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    const-string v0, "headImg"

    .line 18
    .line 19
    const-string v1, "headimg"

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v4

    .line 25
    const-string v0, "nickName"

    .line 26
    .line 27
    const-string v1, "nickname"

    .line 28
    .line 29
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v5

    .line 33
    const-string v0, "sessionUserName"

    .line 34
    .line 35
    const-string v1, "sessionUser"

    .line 36
    .line 37
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v6

    .line 41
    const-string v0, "ver"

    .line 42
    .line 43
    filled-new-array {v0}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    const-string v0, "timingIdentifier"

    .line 48
    .line 49
    filled-new-array {v0}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v8

    .line 53
    const-string v0, "left_button_continue"

    .line 54
    .line 55
    const-string v1, "leftButtonContinue"

    .line 56
    .line 57
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    filled-new-array/range {v2 .. v9}, [[Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    sput-object v0, Lwa/e;->c:[[Ljava/lang/String;

    .line 66
    .line 67
    const-string v0, "channelId"

    .line 68
    .line 69
    const-string v1, "channelid"

    .line 70
    .line 71
    const-string v2, "msgType"

    .line 72
    .line 73
    const-string v3, "msgtype"

    .line 74
    .line 75
    filled-new-array {v2, v3, v0, v1}, [Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v0

    .line 79
    sput-object v0, Lwa/e;->d:[Ljava/lang/String;

    .line 80
    .line 81
    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 10
    .line 11
    new-instance v0, Ljava/util/ArrayList;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 14
    .line 15
    .line 16
    iput-object v0, p0, Lwa/e;->b:Ljava/lang/Object;

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lh/Hchat/dexkit/DexFinder;Ljava/lang/ClassLoader;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 20
    iput-object p1, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 21
    iput-object p2, p0, Lwa/e;->b:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)V
    .locals 0

    .line 1
    if-eqz p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->length()I

    .line 5
    .line 6
    .line 7
    move-result p0

    .line 8
    if-lez p0, :cond_1

    .line 9
    .line 10
    const/16 p0, 0x2c

    .line 11
    .line 12
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    :cond_1
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public static d([BLjava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    const/4 v0, 0x0

    .line 5
    new-array v1, v0, [Ljava/lang/Class;

    .line 6
    .line 7
    invoke-static {p1, v1}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    new-array v0, v0, [Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    :goto_0
    const/4 p0, 0x0

    .line 20
    return-object p0

    .line 21
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-class v1, [B

    .line 26
    .line 27
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    const-string v2, "parseFrom"

    .line 32
    .line 33
    invoke-static {v0, v2, v1}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {v0, p1, p0}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    if-eqz p0, :cond_2

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    return-object p1
.end method

.method public static f(Ljava/lang/Object;)[B
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto :goto_1

    .line 5
    :cond_0
    :try_start_0
    const-string v1, "b"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    const-string v1, "a"

    .line 12
    .line 13
    invoke-static {p0, v1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 17
    const/4 v1, 0x0

    .line 18
    :try_start_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const-string v3, "initialProtobufBytes"

    .line 23
    .line 24
    new-array v4, v1, [Ljava/lang/Class;

    .line 25
    .line 26
    invoke-static {v2, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    new-array v3, v1, [Ljava/lang/Object;

    .line 31
    .line 32
    invoke-static {v2, p0, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    goto :goto_0

    .line 37
    :catchall_0
    move-object v2, v0

    .line 38
    :goto_0
    :try_start_2
    instance-of v3, v2, [B

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    check-cast v2, [B

    .line 43
    .line 44
    return-object v2

    .line 45
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    const-string v3, "toByteArray"

    .line 50
    .line 51
    new-array v4, v1, [Ljava/lang/Class;

    .line 52
    .line 53
    invoke-static {v2, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    new-array v1, v1, [Ljava/lang/Object;

    .line 58
    .line 59
    invoke-static {v2, p0, v1}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    instance-of v1, p0, [B

    .line 64
    .line 65
    if-eqz v1, :cond_2

    .line 66
    .line 67
    check-cast p0, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 68
    .line 69
    move-object v0, p0

    .line 70
    :catchall_1
    :cond_2
    :goto_1
    return-object v0
.end method

.method public static g(Lwa/h;ZLjava/lang/String;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    new-instance v0, Landroid/os/Handler;

    .line 5
    .line 6
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 11
    .line 12
    .line 13
    new-instance v1, Lwa/b;

    .line 14
    .line 15
    invoke-direct {v1, p0, p1, p2}, Lwa/b;-><init>(Lwa/h;ZLjava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 19
    .line 20
    .line 21
    return-void
.end method

.method public static l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0, p1}, Lh/Hchat/utils/KavaReflector;->findFieldRecursive(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-static {v0, p0, p2}, Lh/Hchat/utils/KavaReflector;->writeField(Ljava/lang/reflect/Field;Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    new-instance p0, Ljava/lang/IllegalAccessException;

    .line 19
    .line 20
    invoke-direct {p0, p1}, Ljava/lang/IllegalAccessException;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw p0

    .line 24
    :cond_1
    new-instance p0, Ljava/lang/NoSuchFieldException;

    .line 25
    .line 26
    invoke-direct {p0, p1}, Ljava/lang/NoSuchFieldException;-><init>(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw p0
.end method


# virtual methods
.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-object v0, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    const/4 v1, 0x0

    .line 6
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v2

    .line 10
    const-string v3, "a"

    .line 11
    .line 12
    new-array v4, v1, [Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v2, v3, v4}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    new-array v3, v1, [Ljava/lang/Object;

    .line 19
    .line 20
    invoke-static {v2, p1, v3}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v2

    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->protobufReqRespClass:Ljava/lang/Class;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 38
    if-eqz v3, :cond_1

    .line 39
    .line 40
    :cond_0
    return-object v2

    .line 41
    :catchall_0
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 46
    .line 47
    .line 48
    move-result-object v2

    .line 49
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    .line 51
    .line 52
    move-result-object v2

    .line 53
    :catchall_1
    :cond_2
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_6

    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v3

    .line 63
    check-cast v3, Ljava/lang/reflect/Method;

    .line 64
    .line 65
    :try_start_1
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 66
    .line 67
    .line 68
    move-result-object v4

    .line 69
    array-length v4, v4

    .line 70
    if-eqz v4, :cond_3

    .line 71
    .line 72
    goto :goto_0

    .line 73
    :cond_3
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 74
    .line 75
    .line 76
    move-result-object v4

    .line 77
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 78
    .line 79
    if-eq v4, v5, :cond_2

    .line 80
    .line 81
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    if-ne v4, v5, :cond_4

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_4
    iget-object v4, v0, Lh/Hchat/dexkit/DexFinder;->protobufReqRespClass:Ljava/lang/Class;

    .line 89
    .line 90
    if-eqz v4, :cond_5

    .line 91
    .line 92
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 93
    .line 94
    .line 95
    move-result-object v5

    .line 96
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 97
    .line 98
    .line 99
    move-result v4

    .line 100
    if-nez v4, :cond_5

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    new-array v4, v1, [Ljava/lang/Object;

    .line 104
    .line 105
    invoke-static {v3, p1, v4}, Lh/Hchat/utils/KavaReflector;->invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    .line 107
    .line 108
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 109
    return-object p1

    .line 110
    :cond_6
    const/4 p1, 0x0

    .line 111
    return-object p1
.end method

.method public c(Ljava/lang/Object;)V
    .locals 9

    .line 1
    const-string v0, "UTF-8"

    .line 2
    .line 3
    if-eqz p1, :cond_9

    .line 4
    .line 5
    sget-object v1, Lorg/json/JSONObject;->NULL:Ljava/lang/Object;

    .line 6
    .line 7
    if-ne p1, v1, :cond_0

    .line 8
    .line 9
    goto/16 :goto_4

    .line 10
    .line 11
    :cond_0
    instance-of v1, p1, Lorg/json/JSONObject;

    .line 12
    .line 13
    if-eqz v1, :cond_1

    .line 14
    .line 15
    check-cast p1, Lorg/json/JSONObject;

    .line 16
    .line 17
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-eqz v1, :cond_9

    .line 26
    .line 27
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    check-cast v1, Ljava/lang/String;

    .line 32
    .line 33
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-virtual {p0, v1}, Lwa/e;->c(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    instance-of v1, p1, Lorg/json/JSONArray;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    check-cast p1, Lorg/json/JSONArray;

    .line 47
    .line 48
    :goto_1
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    .line 49
    .line 50
    .line 51
    move-result v0

    .line 52
    if-ge v2, v0, :cond_9

    .line 53
    .line 54
    invoke-virtual {p1, v2}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {p0, v0}, Lwa/e;->c(Ljava/lang/Object;)V

    .line 59
    .line 60
    .line 61
    add-int/lit8 v2, v2, 0x1

    .line 62
    .line 63
    goto :goto_1

    .line 64
    :cond_2
    instance-of v1, p1, Ljava/lang/Number;

    .line 65
    .line 66
    if-nez v1, :cond_9

    .line 67
    .line 68
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 69
    .line 70
    if-eqz v1, :cond_3

    .line 71
    .line 72
    return-void

    .line 73
    :cond_3
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 78
    .line 79
    .line 80
    move-result v1

    .line 81
    if-eqz v1, :cond_4

    .line 82
    .line 83
    goto :goto_4

    .line 84
    :cond_4
    const/16 v1, 0x3d

    .line 85
    .line 86
    invoke-virtual {p1, v1}, Ljava/lang/String;->indexOf(I)I

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-ltz v3, :cond_8

    .line 91
    .line 92
    const/16 v3, 0x26

    .line 93
    .line 94
    invoke-virtual {p1, v3}, Ljava/lang/String;->indexOf(I)I

    .line 95
    .line 96
    .line 97
    move-result v3

    .line 98
    if-ltz v3, :cond_8

    .line 99
    .line 100
    iget-object v3, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast v3, Ljava/util/LinkedHashMap;

    .line 103
    .line 104
    const-string v4, "&"

    .line 105
    .line 106
    invoke-virtual {p1, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p1

    .line 110
    array-length v4, p1

    .line 111
    move v5, v2

    .line 112
    :goto_2
    if-ge v5, v4, :cond_9

    .line 113
    .line 114
    aget-object v6, p1, v5

    .line 115
    .line 116
    invoke-virtual {v6, v1}, Ljava/lang/String;->indexOf(I)I

    .line 117
    .line 118
    .line 119
    move-result v7

    .line 120
    if-gtz v7, :cond_5

    .line 121
    .line 122
    goto :goto_3

    .line 123
    :cond_5
    invoke-virtual {v6, v2, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v8

    .line 127
    :try_start_0
    invoke-static {v8, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 131
    :catchall_0
    add-int/lit8 v7, v7, 0x1

    .line 132
    .line 133
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v6

    .line 137
    :try_start_1
    invoke-static {v6, v0}, Ljava/net/URLDecoder;->decode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 138
    .line 139
    .line 140
    move-result-object v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 141
    :catchall_1
    invoke-static {v8}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 142
    .line 143
    .line 144
    move-result v7

    .line 145
    if-nez v7, :cond_7

    .line 146
    .line 147
    invoke-virtual {v3, v8}, Ljava/util/AbstractMap;->containsKey(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v7

    .line 151
    if-nez v7, :cond_7

    .line 152
    .line 153
    if-nez v6, :cond_6

    .line 154
    .line 155
    const-string v6, ""

    .line 156
    .line 157
    :cond_6
    invoke-virtual {v3, v8, v6}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    :cond_7
    :goto_3
    add-int/lit8 v5, v5, 0x1

    .line 161
    .line 162
    goto :goto_2

    .line 163
    :cond_8
    iget-object v0, p0, Lwa/e;->b:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v0, Ljava/util/ArrayList;

    .line 166
    .line 167
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 168
    .line 169
    .line 170
    :cond_9
    :goto_4
    return-void
.end method

.method public e(ILjava/lang/String;[BLjava/lang/Object;Lwa/h;Ljava/lang/String;)V
    .locals 6

    .line 1
    const-string v0, ": "

    .line 2
    .line 3
    const-string v1, "\u901a\u7528\u53d1\u5305\u5931\u8d25: Dispatch\u5f02\u5e38 "

    .line 4
    .line 5
    iget-object v2, p0, Lwa/e;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v2, Ljava/lang/ClassLoader;

    .line 8
    .line 9
    iget-object v3, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v3, Lh/Hchat/dexkit/DexFinder;

    .line 12
    .line 13
    iget-object v4, v3, Lh/Hchat/dexkit/DexFinder;->protobufCallbackClass:Ljava/lang/Class;

    .line 14
    .line 15
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    new-instance v5, Lwa/c;

    .line 20
    .line 21
    invoke-direct {v5, p0, p1, p2, p5}, Lwa/c;-><init>(Lwa/e;ILjava/lang/String;Lwa/h;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v4, v5}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    const/4 v4, 0x0

    .line 29
    :try_start_0
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->protobufStaticDispatchMethod:Ljava/lang/reflect/Method;

    .line 30
    .line 31
    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 32
    .line 33
    filled-new-array {p4, v2, v5}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const/4 v5, 0x0

    .line 38
    invoke-static {v3, v5, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    if-eqz v0, :cond_0

    .line 43
    .line 44
    sget-object v1, Lwa/j;->b:Ljava/util/Map;

    .line 45
    .line 46
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 47
    .line 48
    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    :cond_0
    const-string v1, "[Hchat:Protobuf] \u53d1\u5305Dispatch: type="

    .line 52
    .line 53
    const-string v2, " reqResp="

    .line 54
    .line 55
    invoke-static {p1, v1, v2}, Leh/a;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    move-result-object v1

    .line 59
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object p4

    .line 63
    invoke-virtual {p4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p4

    .line 67
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    const-string p4, " req="

    .line 71
    .line 72
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    const-string p4, " len="

    .line 79
    .line 80
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    if-nez p3, :cond_1

    .line 84
    .line 85
    goto :goto_0

    .line 86
    :cond_1
    array-length v4, p3

    .line 87
    :goto_0
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    const-string p3, " scene="

    .line 91
    .line 92
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    if-nez v0, :cond_2

    .line 96
    .line 97
    const-string p3, "null"

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object p3

    .line 104
    invoke-virtual {p3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object p3

    .line 108
    :goto_1
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p3

    .line 115
    invoke-static {p3}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    new-instance p3, Ljava/lang/StringBuilder;

    .line 119
    .line 120
    const-string p4, "\u901a\u7528\u53d1\u5305\u5df2\u53d1\u9001: "

    .line 121
    .line 122
    invoke-direct {p3, p4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    .line 128
    const-string p2, " type="

    .line 129
    .line 130
    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object p1

    .line 140
    const/4 p2, 0x1

    .line 141
    invoke-static {p5, p2, p1}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V

    .line 142
    .line 143
    .line 144
    return-void

    .line 145
    :catchall_0
    move-exception p1

    .line 146
    goto :goto_2

    .line 147
    :catch_0
    move-exception p1

    .line 148
    goto :goto_3

    .line 149
    :goto_2
    new-instance p2, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object p3

    .line 158
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object p3

    .line 162
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p1

    .line 172
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object p1

    .line 179
    invoke-static {p5, v4, p1}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :goto_3
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 184
    .line 185
    .line 186
    move-result-object p2

    .line 187
    if-eqz p2, :cond_3

    .line 188
    .line 189
    invoke-virtual {p1}, Ljava/lang/reflect/InvocationTargetException;->getCause()Ljava/lang/Throwable;

    .line 190
    .line 191
    .line 192
    move-result-object p1

    .line 193
    :cond_3
    new-instance p2, Ljava/lang/StringBuilder;

    .line 194
    .line 195
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 196
    .line 197
    .line 198
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 199
    .line 200
    .line 201
    move-result-object p3

    .line 202
    invoke-virtual {p3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object p3

    .line 206
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    .line 208
    .line 209
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p1

    .line 216
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-static {p5, v4, p1}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V

    .line 224
    .line 225
    .line 226
    return-void
.end method

.method public h()Ljava/util/ArrayList;
    .locals 9

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    move v2, v1

    .line 8
    :goto_0
    const/16 v3, 0x8

    .line 9
    .line 10
    if-ge v2, v3, :cond_3

    .line 11
    .line 12
    sget-object v3, Lwa/e;->c:[[Ljava/lang/String;

    .line 13
    .line 14
    aget-object v3, v3, v2

    .line 15
    .line 16
    const-string v4, ""

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    goto :goto_2

    .line 21
    :cond_0
    array-length v5, v3

    .line 22
    move v6, v1

    .line 23
    :goto_1
    if-ge v6, v5, :cond_2

    .line 24
    .line 25
    aget-object v7, v3, v6

    .line 26
    .line 27
    invoke-virtual {p0, v7}, Lwa/e;->k(Ljava/lang/String;)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v7

    .line 31
    invoke-static {v7}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result v8

    .line 35
    if-nez v8, :cond_1

    .line 36
    .line 37
    move-object v4, v7

    .line 38
    goto :goto_2

    .line 39
    :cond_1
    add-int/lit8 v6, v6, 0x1

    .line 40
    .line 41
    goto :goto_1

    .line 42
    :cond_2
    :goto_2
    invoke-virtual {v0, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    add-int/lit8 v2, v2, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_3
    iget-object v1, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v1, Ljava/util/LinkedHashMap;

    .line 51
    .line 52
    invoke-virtual {v1}, Ljava/util/LinkedHashMap;->values()Ljava/util/Collection;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-interface {v1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    :cond_4
    :goto_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_5

    .line 65
    .line 66
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v2

    .line 70
    check-cast v2, Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 73
    .line 74
    .line 75
    move-result v3

    .line 76
    if-nez v3, :cond_4

    .line 77
    .line 78
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 79
    .line 80
    .line 81
    move-result v3

    .line 82
    if-nez v3, :cond_4

    .line 83
    .line 84
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_5
    iget-object v1, p0, Lwa/e;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v1, Ljava/util/ArrayList;

    .line 91
    .line 92
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 93
    .line 94
    .line 95
    move-result-object v1

    .line 96
    :cond_6
    :goto_4
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 97
    .line 98
    .line 99
    move-result v2

    .line 100
    if-eqz v2, :cond_7

    .line 101
    .line 102
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v2

    .line 106
    check-cast v2, Ljava/lang/String;

    .line 107
    .line 108
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-nez v3, :cond_6

    .line 113
    .line 114
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_6

    .line 119
    .line 120
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_7
    return-object v0
.end method

.method public i()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lh/Hchat/dexkit/DexFinder;

    .line 4
    .line 5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v2, "RawReq"

    .line 11
    .line 12
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->protobufRawReqClass:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v3, v2, v1}, Lwa/e;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 15
    .line 16
    .line 17
    const-string v2, "GenericResp"

    .line 18
    .line 19
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->protobufGenericRespClass:Ljava/lang/Class;

    .line 20
    .line 21
    invoke-static {v3, v2, v1}, Lwa/e;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 22
    .line 23
    .line 24
    const-string v2, "ConfigBuilder"

    .line 25
    .line 26
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->protobufConfigBuilderClass:Ljava/lang/Class;

    .line 27
    .line 28
    invoke-static {v3, v2, v1}, Lwa/e;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 29
    .line 30
    .line 31
    const-string v2, "ReqResp"

    .line 32
    .line 33
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->protobufReqRespClass:Ljava/lang/Class;

    .line 34
    .line 35
    invoke-static {v3, v2, v1}, Lwa/e;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 36
    .line 37
    .line 38
    const-string v2, "Callback"

    .line 39
    .line 40
    iget-object v3, v0, Lh/Hchat/dexkit/DexFinder;->protobufCallbackClass:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-static {v3, v2, v1}, Lwa/e;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 43
    .line 44
    .line 45
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->protobufCallbackClass:Ljava/lang/Class;

    .line 46
    .line 47
    if-eqz v2, :cond_1

    .line 48
    .line 49
    invoke-virtual {v2}, Ljava/lang/Class;->isInterface()Z

    .line 50
    .line 51
    .line 52
    move-result v2

    .line 53
    if-nez v2, :cond_1

    .line 54
    .line 55
    iget-object v2, v0, Lh/Hchat/dexkit/DexFinder;->protobufCallbackClass:Ljava/lang/Class;

    .line 56
    .line 57
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v3, "Callback\u975e\u63a5\u53e3="

    .line 62
    .line 63
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object v2

    .line 67
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 68
    .line 69
    .line 70
    move-result v3

    .line 71
    if-lez v3, :cond_0

    .line 72
    .line 73
    const/16 v3, 0x2c

    .line 74
    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    :cond_0
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    :cond_1
    const-string v2, "Dispatch"

    .line 82
    .line 83
    iget-object v0, v0, Lh/Hchat/dexkit/DexFinder;->protobufStaticDispatchMethod:Ljava/lang/reflect/Method;

    .line 84
    .line 85
    invoke-static {v0, v2, v1}, Lwa/e;->a(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 89
    .line 90
    .line 91
    move-result v0

    .line 92
    if-nez v0, :cond_2

    .line 93
    .line 94
    const-string v0, "\u5df2\u5c31\u7eea"

    .line 95
    .line 96
    return-object v0

    .line 97
    :cond_2
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    return-object v0
.end method

.method public j(Ljava/lang/String;III[BLwa/h;)Z
    .locals 16

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move/from16 v2, p2

    .line 4
    .line 5
    move-object/from16 v4, p5

    .line 6
    .line 7
    move-object/from16 v6, p6

    .line 8
    .line 9
    const-string v0, "[Hchat:Protobuf] \u53d1\u5305\u8bf7\u6c42: type="

    .line 10
    .line 11
    iget-object v3, v1, Lwa/e;->a:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v3, Lh/Hchat/dexkit/DexFinder;

    .line 14
    .line 15
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->protobufRawReqClass:Ljava/lang/Class;

    .line 16
    .line 17
    const/4 v8, 0x0

    .line 18
    if-eqz v5, :cond_9

    .line 19
    .line 20
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->protobufGenericRespClass:Ljava/lang/Class;

    .line 21
    .line 22
    if-eqz v5, :cond_9

    .line 23
    .line 24
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->protobufConfigBuilderClass:Ljava/lang/Class;

    .line 25
    .line 26
    if-eqz v5, :cond_9

    .line 27
    .line 28
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->protobufReqRespClass:Ljava/lang/Class;

    .line 29
    .line 30
    if-eqz v5, :cond_9

    .line 31
    .line 32
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->protobufCallbackClass:Ljava/lang/Class;

    .line 33
    .line 34
    if-eqz v5, :cond_9

    .line 35
    .line 36
    invoke-virtual {v5}, Ljava/lang/Class;->isInterface()Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_9

    .line 41
    .line 42
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->protobufStaticDispatchMethod:Ljava/lang/reflect/Method;

    .line 43
    .line 44
    if-eqz v5, :cond_9

    .line 45
    .line 46
    const/16 v5, 0x20a

    .line 47
    .line 48
    const/4 v9, 0x1

    .line 49
    if-ne v2, v5, :cond_0

    .line 50
    .line 51
    :try_start_0
    iget-object v7, v3, Lh/Hchat/dexkit/DexFinder;->protobufNewSendMsgReqClass:Ljava/lang/Class;

    .line 52
    .line 53
    invoke-static {v4, v7}, Lwa/e;->d([BLjava/lang/Class;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v7

    .line 57
    goto :goto_0

    .line 58
    :cond_0
    const/4 v7, 0x0

    .line 59
    :goto_0
    const/16 v10, 0x2a9

    .line 60
    .line 61
    if-nez v7, :cond_1

    .line 62
    .line 63
    if-ne v2, v10, :cond_1

    .line 64
    .line 65
    iget-object v7, v3, Lh/Hchat/dexkit/DexFinder;->protobufOplogReqClass:Ljava/lang/Class;

    .line 66
    .line 67
    invoke-static {v4, v7}, Lwa/e;->d([BLjava/lang/Class;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    :cond_1
    if-eqz v7, :cond_2

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_2
    iget-object v7, v3, Lh/Hchat/dexkit/DexFinder;->protobufRawReqClass:Ljava/lang/Class;

    .line 75
    .line 76
    const-class v11, [B

    .line 77
    .line 78
    filled-new-array {v11}, [Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    move-result-object v11

    .line 82
    invoke-static {v7, v11}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 83
    .line 84
    .line 85
    move-result-object v7

    .line 86
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 87
    .line 88
    .line 89
    move-result-object v11

    .line 90
    invoke-static {v7, v11}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    :goto_1
    iget-object v11, v3, Lh/Hchat/dexkit/DexFinder;->protobufGenericRespClass:Ljava/lang/Class;

    .line 95
    .line 96
    new-array v12, v8, [Ljava/lang/Class;

    .line 97
    .line 98
    invoke-static {v11, v12}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 99
    .line 100
    .line 101
    move-result-object v11

    .line 102
    new-array v12, v8, [Ljava/lang/Object;

    .line 103
    .line 104
    invoke-static {v11, v12}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 105
    .line 106
    .line 107
    move-result-object v11

    .line 108
    iget-object v12, v3, Lh/Hchat/dexkit/DexFinder;->protobufConfigBuilderClass:Ljava/lang/Class;

    .line 109
    .line 110
    new-array v13, v8, [Ljava/lang/Class;

    .line 111
    .line 112
    invoke-static {v12, v13}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 113
    .line 114
    .line 115
    move-result-object v12

    .line 116
    new-array v13, v8, [Ljava/lang/Object;

    .line 117
    .line 118
    invoke-static {v12, v13}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object v12

    .line 122
    if-eqz v7, :cond_8

    .line 123
    .line 124
    if-eqz v11, :cond_8

    .line 125
    .line 126
    if-nez v12, :cond_3

    .line 127
    .line 128
    goto/16 :goto_4

    .line 129
    .line 130
    :cond_3
    new-instance v13, Ljava/lang/StringBuilder;

    .line 131
    .line 132
    invoke-direct {v13, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 136
    .line 137
    .line 138
    const-string v0, " req="

    .line 139
    .line 140
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 144
    .line 145
    .line 146
    move-result-object v0

    .line 147
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object v0

    .line 151
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    const-string v0, " len="

    .line 155
    .line 156
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    if-nez v4, :cond_4

    .line 160
    .line 161
    move v0, v8

    .line 162
    goto :goto_2

    .line 163
    :cond_4
    array-length v0, v4

    .line 164
    :goto_2
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 165
    .line 166
    .line 167
    const-string v0, " func="

    .line 168
    .line 169
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 170
    .line 171
    .line 172
    move/from16 v0, p3

    .line 173
    .line 174
    invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 175
    .line 176
    .line 177
    const-string v14, " route="

    .line 178
    .line 179
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 180
    .line 181
    .line 182
    move/from16 v14, p4

    .line 183
    .line 184
    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    const-string v15, " special="

    .line 188
    .line 189
    invoke-virtual {v13, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 193
    .line 194
    .line 195
    move-result-object v15

    .line 196
    if-ne v2, v5, :cond_5

    .line 197
    .line 198
    iget-object v5, v3, Lh/Hchat/dexkit/DexFinder;->protobufNewSendMsgReqClass:Ljava/lang/Class;

    .line 199
    .line 200
    if-eqz v5, :cond_5

    .line 201
    .line 202
    invoke-virtual {v5, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 203
    .line 204
    .line 205
    move-result v3

    .line 206
    goto :goto_3

    .line 207
    :cond_5
    if-ne v2, v10, :cond_6

    .line 208
    .line 209
    iget-object v3, v3, Lh/Hchat/dexkit/DexFinder;->protobufOplogReqClass:Ljava/lang/Class;

    .line 210
    .line 211
    if-eqz v3, :cond_6

    .line 212
    .line 213
    invoke-virtual {v3, v15}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 214
    .line 215
    .line 216
    move-result v3

    .line 217
    goto :goto_3

    .line 218
    :cond_6
    move v3, v8

    .line 219
    :goto_3
    invoke-virtual {v13, v3}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v3

    .line 226
    invoke-static {v3}, Lde/robv/android/xposed/XposedBridge;->log(Ljava/lang/String;)V

    .line 227
    .line 228
    .line 229
    const-string v3, "a"

    .line 230
    .line 231
    invoke-static {v12, v3, v7}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 232
    .line 233
    .line 234
    const-string v3, "b"

    .line 235
    .line 236
    invoke-static {v12, v3, v11}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 237
    .line 238
    .line 239
    const-string v3, "c"

    .line 240
    .line 241
    move-object/from16 v5, p1

    .line 242
    .line 243
    invoke-static {v12, v3, v5}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 244
    .line 245
    .line 246
    const-string v3, "d"

    .line 247
    .line 248
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 249
    .line 250
    .line 251
    move-result-object v10

    .line 252
    invoke-static {v12, v3, v10}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 253
    .line 254
    .line 255
    const-string v3, "e"

    .line 256
    .line 257
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 258
    .line 259
    .line 260
    move-result-object v0

    .line 261
    invoke-static {v12, v3, v0}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 262
    .line 263
    .line 264
    const-string v0, "f"

    .line 265
    .line 266
    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 267
    .line 268
    .line 269
    move-result-object v3

    .line 270
    invoke-static {v12, v0, v3}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 271
    .line 272
    .line 273
    const-string v0, "l"

    .line 274
    .line 275
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 276
    .line 277
    .line 278
    move-result-object v3

    .line 279
    invoke-static {v12, v0, v3}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 280
    .line 281
    .line 282
    const-string v0, "n"

    .line 283
    .line 284
    invoke-static {v12, v0, v4}, Lwa/e;->l(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V

    .line 285
    .line 286
    .line 287
    invoke-virtual {v1, v12}, Lwa/e;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v0

    .line 291
    if-nez v0, :cond_7

    .line 292
    .line 293
    const-string v0, "\u901a\u7528\u53d1\u5305\u5931\u8d25: ReqResp\u6784\u9020\u5931\u8d25"

    .line 294
    .line 295
    invoke-static {v6, v8, v0}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V

    .line 296
    .line 297
    .line 298
    return v9

    .line 299
    :catchall_0
    move-exception v0

    .line 300
    goto :goto_5

    .line 301
    :cond_7
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 302
    .line 303
    .line 304
    move-result-object v3

    .line 305
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 306
    .line 307
    .line 308
    move-result-object v7

    .line 309
    move-object v3, v5

    .line 310
    move-object v5, v0

    .line 311
    invoke-virtual/range {v1 .. v7}, Lwa/e;->e(ILjava/lang/String;[BLjava/lang/Object;Lwa/h;Ljava/lang/String;)V

    .line 312
    .line 313
    .line 314
    return v9

    .line 315
    :cond_8
    :goto_4
    const-string v0, "\u901a\u7528\u53d1\u5305\u5931\u8d25: \u5bf9\u8c61\u521b\u5efa\u5931\u8d25"

    .line 316
    .line 317
    invoke-static {v6, v8, v0}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 318
    .line 319
    .line 320
    return v9

    .line 321
    :goto_5
    new-instance v1, Ljava/lang/StringBuilder;

    .line 322
    .line 323
    const-string v2, "\u901a\u7528\u53d1\u5305\u5931\u8d25: "

    .line 324
    .line 325
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 329
    .line 330
    .line 331
    move-result-object v0

    .line 332
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 333
    .line 334
    .line 335
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 336
    .line 337
    .line 338
    move-result-object v0

    .line 339
    invoke-static {v6, v8, v0}, Lwa/e;->g(Lwa/h;ZLjava/lang/String;)V

    .line 340
    .line 341
    .line 342
    return v9

    .line 343
    :cond_9
    return v8
.end method

.method public k(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lwa/e;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/LinkedHashMap;

    .line 4
    .line 5
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const-string v2, ""

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    return-object v2

    .line 14
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    check-cast v1, Ljava/lang/String;

    .line 19
    .line 20
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 21
    .line 22
    .line 23
    move-result v3

    .line 24
    if-nez v3, :cond_1

    .line 25
    .line 26
    return-object v1

    .line 27
    :cond_1
    invoke-virtual {v0}, Ljava/util/LinkedHashMap;->entrySet()Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_3

    .line 40
    .line 41
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    check-cast v1, Ljava/util/Map$Entry;

    .line 46
    .line 47
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object v3

    .line 51
    check-cast v3, Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {p1, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_2

    .line 58
    .line 59
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ljava/lang/String;

    .line 64
    .line 65
    return-object p1

    .line 66
    :cond_3
    return-object v2
.end method
