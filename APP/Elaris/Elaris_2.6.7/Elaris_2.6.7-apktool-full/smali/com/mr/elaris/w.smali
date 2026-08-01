.class public abstract Lcom/mr/elaris/w;
.super Ljava/lang/Object;
.source "r8-map-id-cb25a2bafef54619fff8cdac9d36ff56d89ce0d5459e21e33664152f938f1f39"


# static fields
.field public static final a:[Ljava/lang/String;

.field public static final b:Ljava/util/Map;

.field public static final c:Ljava/util/Set;

.field public static final d:Ljava/util/Set;

.field public static final e:Ljava/util/Set;

.field public static final f:Ljava/util/Set;

.field public static volatile g:Z

.field public static volatile h:Z

.field public static volatile i:Z

.field public static volatile j:Z

.field public static volatile k:Z

.field public static volatile l:Z

.field public static volatile m:Z

.field public static volatile n:J

.field public static volatile o:J

.field public static volatile p:Lpd;

.field public static volatile q:J

.field public static volatile r:Ly;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "com.tencent.qqnt.aio.menu.ui.QQCustomMenuNoIconLayout"

    .line 2
    .line 3
    const-string v1, "com.tencent.mobileqq.utils.dialogutils.QQCustomMenuNoIconLayout"

    .line 4
    .line 5
    const-string v2, "com.tencent.qqnt.aio.menu.ui.QQCustomMenuExpandableLayout"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lcom/mr/elaris/w;->a:[Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ljava/util/WeakHashMap;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Ljava/util/Collections;->synchronizedMap(Ljava/util/Map;)Ljava/util/Map;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    sput-object v0, Lcom/mr/elaris/w;->b:Ljava/util/Map;

    .line 23
    .line 24
    new-instance v0, Ljava/util/IdentityHashMap;

    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/IdentityHashMap;-><init>()V

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    sput-object v0, Lcom/mr/elaris/w;->c:Ljava/util/Set;

    .line 38
    .line 39
    new-instance v0, Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    sput-object v0, Lcom/mr/elaris/w;->d:Ljava/util/Set;

    .line 53
    .line 54
    new-instance v0, Ljava/util/HashMap;

    .line 55
    .line 56
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    sput-object v0, Lcom/mr/elaris/w;->e:Ljava/util/Set;

    .line 68
    .line 69
    new-instance v0, Ljava/util/HashMap;

    .line 70
    .line 71
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 72
    .line 73
    .line 74
    invoke-static {v0}, Ljava/util/Collections;->newSetFromMap(Ljava/util/Map;)Ljava/util/Set;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0}, Ljava/util/Collections;->synchronizedSet(Ljava/util/Set;)Ljava/util/Set;

    .line 79
    .line 80
    .line 81
    move-result-object v0

    .line 82
    sput-object v0, Lcom/mr/elaris/w;->f:Ljava/util/Set;

    .line 83
    .line 84
    return-void
.end method

.method public static A(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    :goto_0
    array-length v2, p0

    .line 8
    if-ge v1, v2, :cond_2

    .line 9
    .line 10
    aget-object v2, p0, v1

    .line 11
    .line 12
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    const-class v4, Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v5

    .line 22
    invoke-virtual {v4, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 23
    .line 24
    .line 25
    move-result v4

    .line 26
    if-eqz v4, :cond_1

    .line 27
    .line 28
    array-length v4, v3

    .line 29
    const/4 v5, 0x4

    .line 30
    if-ne v4, v5, :cond_1

    .line 31
    .line 32
    aget-object v4, v3, v0

    .line 33
    .line 34
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    if-ne v4, v5, :cond_1

    .line 37
    .line 38
    const/4 v4, 0x1

    .line 39
    aget-object v5, v3, v4

    .line 40
    .line 41
    invoke-virtual {v5}, Ljava/lang/Class;->isPrimitive()Z

    .line 42
    .line 43
    .line 44
    move-result v5

    .line 45
    if-nez v5, :cond_1

    .line 46
    .line 47
    aget-object v5, v3, v4

    .line 48
    .line 49
    invoke-virtual {v5, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-nez v5, :cond_0

    .line 54
    .line 55
    aget-object v4, v3, v4

    .line 56
    .line 57
    const-class v5, Ljava/lang/Object;

    .line 58
    .line 59
    if-eq v5, v4, :cond_0

    .line 60
    .line 61
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 66
    .line 67
    invoke-virtual {v4, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    const-string v5, "menu"

    .line 72
    .line 73
    invoke-virtual {v4, v5}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 74
    .line 75
    .line 76
    move-result v4

    .line 77
    if-eqz v4, :cond_1

    .line 78
    .line 79
    :cond_0
    const/4 v4, 0x2

    .line 80
    aget-object v4, v3, v4

    .line 81
    .line 82
    sget-object v5, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    if-ne v4, v5, :cond_1

    .line 85
    .line 86
    const/4 v4, 0x3

    .line 87
    aget-object v3, v3, v4

    .line 88
    .line 89
    const-class v4, [F

    .line 90
    .line 91
    if-ne v3, v4, :cond_1

    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 98
    .line 99
    const-string p1, "menu item view builder"

    .line 100
    .line 101
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 102
    .line 103
    .line 104
    throw p0
.end method

.method public static A0(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    goto/16 :goto_3

    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-static {v1}, Lcom/mr/elaris/w;->b0(Ljava/lang/Class;)Z

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    return-object p0

    .line 17
    :cond_1
    const-string v1, "pttElement"

    .line 18
    .line 19
    const-string v2, "mPttElement"

    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    if-eqz v1, :cond_2

    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2}, Lcom/mr/elaris/w;->b0(Ljava/lang/Class;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    if-eqz v2, :cond_2

    .line 40
    .line 41
    return-object v1

    .line 42
    :cond_2
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 47
    .line 48
    .line 49
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 50
    const/4 v2, 0x0

    .line 51
    move v3, v2

    .line 52
    :goto_0
    array-length v4, v1

    .line 53
    if-ge v3, v4, :cond_6

    .line 54
    .line 55
    aget-object v4, v1, v3

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    array-length v5, v5

    .line 62
    if-nez v5, :cond_5

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 65
    .line 66
    .line 67
    move-result v5

    .line 68
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 69
    .line 70
    .line 71
    move-result v5

    .line 72
    if-nez v5, :cond_5

    .line 73
    .line 74
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    invoke-static {v5}, Lcom/mr/elaris/w;->b0(Ljava/lang/Class;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-nez v5, :cond_3

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_3
    const/4 v5, 0x1

    .line 86
    :try_start_1
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    if-eqz v4, :cond_4

    .line 94
    .line 95
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v6

    .line 99
    invoke-static {v6}, Lcom/mr/elaris/w;->b0(Ljava/lang/Class;)Z

    .line 100
    .line 101
    .line 102
    move-result v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 103
    if-eqz v6, :cond_4

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_4
    move v5, v2

    .line 107
    :goto_1
    if-eqz v5, :cond_5

    .line 108
    .line 109
    return-object v4

    .line 110
    :catchall_0
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :catchall_1
    :cond_6
    :goto_3
    return-object v0
.end method

.method public static B(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    :goto_0
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_1
    array-length v2, v0

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    invoke-virtual {v3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-eqz v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    array-length v3, v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    const-class v3, Ljava/util/List;

    .line 35
    .line 36
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    invoke-virtual {v3, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    if-eqz v3, :cond_0

    .line 45
    .line 46
    return-object v2

    .line 47
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 48
    .line 49
    goto :goto_1

    .line 50
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    goto :goto_0

    .line 55
    :cond_2
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 56
    .line 57
    const-string p1, "component menu method"

    .line 58
    .line 59
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw p0
.end method

.method public static B0(Ljava/lang/Object;)Llb;
    .locals 9

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/w;->A0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    invoke-static {p0}, Lv4;->p(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    invoke-static {p0}, Lcom/mr/elaris/MessageRepeater;->cachedMsgRecordFromAny(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_1
    invoke-static {v0}, Lcom/mr/elaris/w;->A0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eqz v3, :cond_2

    .line 25
    .line 26
    move-object v0, v3

    .line 27
    goto :goto_2

    .line 28
    :cond_2
    const-string v3, "getElements"

    .line 29
    .line 30
    invoke-static {v0, v3}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    instance-of v4, v3, Ljava/util/List;

    .line 35
    .line 36
    if-eqz v4, :cond_3

    .line 37
    .line 38
    check-cast v3, Ljava/util/List;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_3
    const-string v3, "msgElementList"

    .line 42
    .line 43
    const-string v4, "elementList"

    .line 44
    .line 45
    const-string v5, "elements"

    .line 46
    .line 47
    const-string v6, "msgElements"

    .line 48
    .line 49
    filled-new-array {v5, v6, v3, v4}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v3

    .line 53
    invoke-static {v0, v3}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    instance-of v3, v0, Ljava/util/List;

    .line 58
    .line 59
    if-eqz v3, :cond_4

    .line 60
    .line 61
    move-object v3, v0

    .line 62
    check-cast v3, Ljava/util/List;

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_4
    move-object v3, v2

    .line 66
    :goto_0
    if-eqz v3, :cond_6

    .line 67
    .line 68
    move v0, v1

    .line 69
    :goto_1
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v4

    .line 73
    if-ge v0, v4, :cond_6

    .line 74
    .line 75
    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4}, Lcom/mr/elaris/w;->A0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    if-eqz v4, :cond_5

    .line 84
    .line 85
    move-object v0, v4

    .line 86
    goto :goto_2

    .line 87
    :cond_5
    add-int/lit8 v0, v0, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_6
    move-object v0, v2

    .line 91
    :goto_2
    if-nez v0, :cond_7

    .line 92
    .line 93
    return-object v2

    .line 94
    :cond_7
    const-string v3, "filePath"

    .line 95
    .line 96
    const-string v4, "path"

    .line 97
    .line 98
    const-string v5, "localPath"

    .line 99
    .line 100
    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v6

    .line 104
    invoke-static {v0, v6}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 109
    .line 110
    .line 111
    move-result v7

    .line 112
    if-nez v7, :cond_8

    .line 113
    .line 114
    filled-new-array {v3, v4, v5}, [Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v3

    .line 118
    invoke-static {p0, v3}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v6

    .line 122
    :cond_8
    invoke-virtual {v6}, Ljava/lang/String;->length()I

    .line 123
    .line 124
    .line 125
    move-result p0

    .line 126
    if-nez p0, :cond_9

    .line 127
    .line 128
    goto :goto_3

    .line 129
    :cond_9
    new-instance v2, Ljava/io/File;

    .line 130
    .line 131
    invoke-direct {v2, v6}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 132
    .line 133
    .line 134
    :goto_3
    const-string p0, "fileName"

    .line 135
    .line 136
    const-string v3, "name"

    .line 137
    .line 138
    filled-new-array {p0, v3}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-static {v0, p0}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const-string v3, "duration"

    .line 147
    .line 148
    filled-new-array {v3}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v3

    .line 152
    invoke-static {v0, v3}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v3

    .line 156
    invoke-static {v1, v3}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 157
    .line 158
    .line 159
    move-result v3

    .line 160
    new-instance v4, Llb;

    .line 161
    .line 162
    const-string v5, "waves"

    .line 163
    .line 164
    const-string v6, "wave"

    .line 165
    .line 166
    const-string v7, "waveAmplitudes"

    .line 167
    .line 168
    filled-new-array {v7, v5, v6}, [Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-static {v0, v5}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    instance-of v5, v0, [B

    .line 177
    .line 178
    if-eqz v5, :cond_a

    .line 179
    .line 180
    check-cast v0, [B

    .line 181
    .line 182
    goto :goto_6

    .line 183
    :cond_a
    instance-of v5, v0, Ljava/util/List;

    .line 184
    .line 185
    if-nez v5, :cond_b

    .line 186
    .line 187
    new-array v0, v1, [B

    .line 188
    .line 189
    goto :goto_6

    .line 190
    :cond_b
    check-cast v0, Ljava/util/List;

    .line 191
    .line 192
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 193
    .line 194
    .line 195
    move-result v5

    .line 196
    new-array v5, v5, [B

    .line 197
    .line 198
    move v6, v1

    .line 199
    :goto_4
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-ge v6, v7, :cond_d

    .line 204
    .line 205
    invoke-interface {v0, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    instance-of v8, v7, Ljava/lang/Number;

    .line 210
    .line 211
    if-eqz v8, :cond_c

    .line 212
    .line 213
    check-cast v7, Ljava/lang/Number;

    .line 214
    .line 215
    invoke-virtual {v7}, Ljava/lang/Number;->byteValue()B

    .line 216
    .line 217
    .line 218
    move-result v7

    .line 219
    goto :goto_5

    .line 220
    :cond_c
    move v7, v1

    .line 221
    :goto_5
    aput-byte v7, v5, v6

    .line 222
    .line 223
    add-int/lit8 v6, v6, 0x1

    .line 224
    .line 225
    goto :goto_4

    .line 226
    :cond_d
    move-object v0, v5

    .line 227
    :goto_6
    invoke-direct {v4, v2, p0, v3, v0}, Llb;-><init>(Ljava/io/File;Ljava/lang/String;I[B)V

    .line 228
    .line 229
    .line 230
    return-object v4
.end method

.method public static C(Ljava/lang/Class;)Ljava/lang/String;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    :goto_0
    array-length v1, p0

    .line 7
    if-ge v0, v1, :cond_1

    .line 8
    .line 9
    aget-object v1, p0, v0

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    invoke-static {v2}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    array-length v2, v2

    .line 26
    if-nez v2, :cond_0

    .line 27
    .line 28
    const-class v2, Ljava/util/List;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v2, v3}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-eqz v2, :cond_0

    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    return-object p0

    .line 45
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_1
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 49
    .line 50
    const-string v0, "menu list method"

    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    throw p0
.end method

.method public static C0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "com.tencent.mobileqq.qroute.QRoute"

    .line 3
    .line 4
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    const-string p1, "api"

    .line 13
    .line 14
    const-class v2, Ljava/lang/Class;

    .line 15
    .line 16
    filled-new-array {v2}, [Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {v1, p1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    const/4 v1, 0x1

    .line 25
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 26
    .line 27
    .line 28
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {p1, v0, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 36
    return-object p0

    .line 37
    :catchall_0
    return-object v0
.end method

.method public static D(Ljava/lang/Class;Ljava/lang/Class;)Lec;
    .locals 11

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    const/4 v1, 0x0

    .line 7
    move-object v2, v0

    .line 8
    move-object v3, v2

    .line 9
    move v4, v1

    .line 10
    :goto_0
    array-length v5, p0

    .line 11
    if-ge v4, v5, :cond_4

    .line 12
    .line 13
    aget-object v5, p0, v4

    .line 14
    .line 15
    invoke-virtual {v5}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    array-length v7, v6

    .line 20
    const-class v8, Landroid/content/Context;

    .line 21
    .line 22
    const/4 v9, 0x2

    .line 23
    const/4 v10, 0x1

    .line 24
    if-ne v7, v9, :cond_0

    .line 25
    .line 26
    aget-object v7, v6, v1

    .line 27
    .line 28
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 29
    .line 30
    .line 31
    move-result v7

    .line 32
    if-eqz v7, :cond_0

    .line 33
    .line 34
    aget-object v7, v6, v10

    .line 35
    .line 36
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 37
    .line 38
    .line 39
    move-result v7

    .line 40
    if-eqz v7, :cond_0

    .line 41
    .line 42
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 43
    .line 44
    .line 45
    new-instance p0, Lec;

    .line 46
    .line 47
    invoke-direct {p0, v5, v1}, Lec;-><init>(Ljava/lang/reflect/Constructor;I)V

    .line 48
    .line 49
    .line 50
    return-object p0

    .line 51
    :cond_0
    array-length v7, v6

    .line 52
    if-ne v7, v10, :cond_1

    .line 53
    .line 54
    aget-object v7, v6, v1

    .line 55
    .line 56
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_1

    .line 61
    .line 62
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 63
    .line 64
    .line 65
    new-instance v0, Lec;

    .line 66
    .line 67
    invoke-direct {v0, v5, v10}, Lec;-><init>(Ljava/lang/reflect/Constructor;I)V

    .line 68
    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_1
    array-length v7, v6

    .line 72
    if-ne v7, v10, :cond_2

    .line 73
    .line 74
    aget-object v7, v6, v1

    .line 75
    .line 76
    invoke-virtual {v8, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 77
    .line 78
    .line 79
    move-result v7

    .line 80
    if-eqz v7, :cond_2

    .line 81
    .line 82
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 83
    .line 84
    .line 85
    new-instance v2, Lec;

    .line 86
    .line 87
    invoke-direct {v2, v5, v9}, Lec;-><init>(Ljava/lang/reflect/Constructor;I)V

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_2
    array-length v6, v6

    .line 92
    if-nez v6, :cond_3

    .line 93
    .line 94
    invoke-virtual {v5, v10}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 95
    .line 96
    .line 97
    new-instance v3, Lec;

    .line 98
    .line 99
    const/4 v6, 0x3

    .line 100
    invoke-direct {v3, v5, v6}, Lec;-><init>(Ljava/lang/reflect/Constructor;I)V

    .line 101
    .line 102
    .line 103
    :cond_3
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_4
    if-eqz v0, :cond_5

    .line 107
    .line 108
    return-object v0

    .line 109
    :cond_5
    if-eqz v2, :cond_6

    .line 110
    .line 111
    return-object v2

    .line 112
    :cond_6
    if-eqz v3, :cond_7

    .line 113
    .line 114
    return-object v3

    .line 115
    :cond_7
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 116
    .line 117
    const-string p1, "menu item constructor"

    .line 118
    .line 119
    invoke-direct {p0, p1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 120
    .line 121
    .line 122
    throw p0
.end method

.method public static D0(Landroid/app/Activity;Ljava/io/File;Ljava/util/ArrayList;Ljava/util/HashSet;Landroid/net/Uri;)V
    .locals 26

    .line 1
    :try_start_0
    const-string v2, "_id"

    .line 2
    .line 3
    const-string v3, "_display_name"

    .line 4
    .line 5
    const-string v4, "_size"

    .line 6
    .line 7
    const-string v5, "date_modified"

    .line 8
    .line 9
    const-string v6, "_data"

    .line 10
    .line 11
    const-string v7, "relative_path"

    .line 12
    .line 13
    const-string v8, "mime_type"

    .line 14
    .line 15
    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    const-string v14, "date_modified DESC"

    .line 24
    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    move-object/from16 v10, p4

    .line 28
    .line 29
    invoke-virtual/range {v9 .. v14}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 30
    .line 31
    .line 32
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 33
    if-nez v2, :cond_0

    .line 34
    .line 35
    invoke-static {v2}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :cond_0
    :try_start_1
    const-string v0, "_id"

    .line 40
    .line 41
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 42
    .line 43
    .line 44
    move-result v0

    .line 45
    const-string v3, "_display_name"

    .line 46
    .line 47
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 48
    .line 49
    .line 50
    move-result v3

    .line 51
    const-string v4, "_size"

    .line 52
    .line 53
    invoke-interface {v2, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    const-string v5, "date_modified"

    .line 58
    .line 59
    invoke-interface {v2, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 60
    .line 61
    .line 62
    move-result v5

    .line 63
    const-string v6, "_data"

    .line 64
    .line 65
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 66
    .line 67
    .line 68
    move-result v6

    .line 69
    const-string v7, "relative_path"

    .line 70
    .line 71
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const-string v8, "mime_type"

    .line 76
    .line 77
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    const/4 v9, 0x0

    .line 82
    :goto_0
    invoke-interface {v2}, Landroid/database/Cursor;->moveToNext()Z

    .line 83
    .line 84
    .line 85
    move-result v10
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 86
    if-eqz v10, :cond_f

    .line 87
    .line 88
    const/16 v10, 0xf0

    .line 89
    .line 90
    if-ge v9, v10, :cond_f

    .line 91
    .line 92
    const-string v10, ""

    .line 93
    .line 94
    if-ltz v3, :cond_1

    .line 95
    .line 96
    :try_start_2
    invoke-interface {v2, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v11

    .line 100
    move-object v13, v11

    .line 101
    goto :goto_1

    .line 102
    :catchall_0
    move-exception v0

    .line 103
    move-object v1, v2

    .line 104
    goto/16 :goto_e

    .line 105
    .line 106
    :cond_1
    move-object v13, v10

    .line 107
    :goto_1
    if-ltz v8, :cond_2

    .line 108
    .line 109
    invoke-interface {v2, v8}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v11

    .line 113
    move-object v15, v11

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move-object v15, v10

    .line 116
    :goto_2
    invoke-static {v13, v15}, Lcom/mr/elaris/w;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 117
    .line 118
    .line 119
    move-result v11

    .line 120
    if-nez v11, :cond_3

    .line 121
    .line 122
    move-object/from16 v10, p1

    .line 123
    .line 124
    :goto_3
    move-object/from16 v12, p4

    .line 125
    .line 126
    move/from16 v21, v0

    .line 127
    .line 128
    move-object/from16 p0, v2

    .line 129
    .line 130
    move-object/from16 v2, p3

    .line 131
    .line 132
    goto/16 :goto_9

    .line 133
    .line 134
    :cond_3
    if-ltz v6, :cond_4

    .line 135
    .line 136
    invoke-interface {v2, v6}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v11

    .line 140
    goto :goto_4

    .line 141
    :cond_4
    move-object v11, v10

    .line 142
    :goto_4
    if-ltz v7, :cond_5

    .line 143
    .line 144
    invoke-interface {v2, v7}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object v10

    .line 148
    :cond_5
    move-object v14, v10

    .line 149
    move-object/from16 v10, p1

    .line 150
    .line 151
    invoke-static {v10, v11, v14}, Lcom/mr/elaris/w;->o0(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z

    .line 152
    .line 153
    .line 154
    move-result v12

    .line 155
    if-nez v12, :cond_6

    .line 156
    .line 157
    goto :goto_3

    .line 158
    :cond_6
    if-ltz v0, :cond_7

    .line 159
    .line 160
    invoke-interface {v2, v0}, Landroid/database/Cursor;->getLong(I)J

    .line 161
    .line 162
    .line 163
    move-result-wide v16
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 164
    :goto_5
    move-object/from16 p0, v2

    .line 165
    .line 166
    move-wide/from16 v1, v16

    .line 167
    .line 168
    goto :goto_6

    .line 169
    :cond_7
    const-wide/16 v16, -0x1

    .line 170
    .line 171
    goto :goto_5

    .line 172
    :goto_6
    const-wide/16 v16, 0x0

    .line 173
    .line 174
    cmp-long v12, v1, v16

    .line 175
    .line 176
    if-gez v12, :cond_8

    .line 177
    .line 178
    move-object/from16 v2, p3

    .line 179
    .line 180
    move-object/from16 v12, p4

    .line 181
    .line 182
    move/from16 v21, v0

    .line 183
    .line 184
    goto :goto_9

    .line 185
    :cond_8
    move-object/from16 v12, p4

    .line 186
    .line 187
    :try_start_3
    invoke-static {v12, v1, v2}, Landroid/content/ContentUris;->withAppendedId(Landroid/net/Uri;J)Landroid/net/Uri;

    .line 188
    .line 189
    .line 190
    move-result-object v1

    .line 191
    if-eqz v11, :cond_9

    .line 192
    .line 193
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 194
    .line 195
    .line 196
    move-result v2

    .line 197
    if-lez v2, :cond_9

    .line 198
    .line 199
    new-instance v2, Ljava/lang/StringBuilder;

    .line 200
    .line 201
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 202
    .line 203
    .line 204
    move/from16 v21, v0

    .line 205
    .line 206
    const-string v0, "path:"

    .line 207
    .line 208
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 209
    .line 210
    .line 211
    invoke-static {v11}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object v0

    .line 215
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v0

    .line 222
    :goto_7
    move-object/from16 v2, p3

    .line 223
    .line 224
    goto :goto_8

    .line 225
    :catchall_1
    move-exception v0

    .line 226
    move-object/from16 v1, p0

    .line 227
    .line 228
    goto/16 :goto_e

    .line 229
    .line 230
    :cond_9
    move/from16 v21, v0

    .line 231
    .line 232
    new-instance v0, Ljava/lang/StringBuilder;

    .line 233
    .line 234
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 235
    .line 236
    .line 237
    const-string v2, "uri:"

    .line 238
    .line 239
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 243
    .line 244
    .line 245
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 246
    .line 247
    .line 248
    move-result-object v0

    .line 249
    goto :goto_7

    .line 250
    :goto_8
    invoke-virtual {v2, v0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 251
    .line 252
    .line 253
    move-result v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 254
    if-nez v0, :cond_a

    .line 255
    .line 256
    :goto_9
    move-object/from16 v2, p0

    .line 257
    .line 258
    :goto_a
    move/from16 v0, v21

    .line 259
    .line 260
    goto/16 :goto_0

    .line 261
    .line 262
    :cond_a
    if-ltz v4, :cond_b

    .line 263
    .line 264
    move-object v0, v1

    .line 265
    move-object/from16 v1, p0

    .line 266
    .line 267
    :try_start_4
    invoke-interface {v1, v4}, Landroid/database/Cursor;->getLong(I)J

    .line 268
    .line 269
    .line 270
    move-result-wide v18

    .line 271
    goto :goto_b

    .line 272
    :catchall_2
    move-exception v0

    .line 273
    goto :goto_e

    .line 274
    :cond_b
    move-object v0, v1

    .line 275
    move-object/from16 v1, p0

    .line 276
    .line 277
    move-wide/from16 v18, v16

    .line 278
    .line 279
    :goto_b
    if-ltz v5, :cond_c

    .line 280
    .line 281
    invoke-interface {v1, v5}, Landroid/database/Cursor;->getLong(I)J

    .line 282
    .line 283
    .line 284
    move-result-wide v16

    .line 285
    const-wide/16 v22, 0x3e8

    .line 286
    .line 287
    mul-long v16, v16, v22

    .line 288
    .line 289
    :cond_c
    if-eqz v11, :cond_d

    .line 290
    .line 291
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    .line 292
    .line 293
    .line 294
    move-result v20

    .line 295
    if-nez v20, :cond_e

    .line 296
    .line 297
    :cond_d
    move-object/from16 p0, v0

    .line 298
    .line 299
    goto :goto_c

    .line 300
    :cond_e
    move-object/from16 p0, v0

    .line 301
    .line 302
    new-instance v0, Ljava/io/File;

    .line 303
    .line 304
    invoke-direct {v0, v11}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 305
    .line 306
    .line 307
    move-object v11, v0

    .line 308
    goto :goto_d

    .line 309
    :goto_c
    const/4 v11, 0x0

    .line 310
    :goto_d
    new-instance v10, Ln9;

    .line 311
    .line 312
    const/16 v20, 0x0

    .line 313
    .line 314
    move-wide/from16 v24, v18

    .line 315
    .line 316
    move-wide/from16 v18, v16

    .line 317
    .line 318
    move-wide/from16 v16, v24

    .line 319
    .line 320
    move-object/from16 v12, p0

    .line 321
    .line 322
    invoke-direct/range {v10 .. v20}, Ln9;-><init>(Ljava/io/File;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 323
    .line 324
    .line 325
    move-object/from16 v0, p2

    .line 326
    .line 327
    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 328
    .line 329
    .line 330
    add-int/lit8 v9, v9, 0x1

    .line 331
    .line 332
    move-object v2, v1

    .line 333
    goto :goto_a

    .line 334
    :cond_f
    move-object v1, v2

    .line 335
    invoke-static {v1}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 336
    .line 337
    .line 338
    return-void

    .line 339
    :catchall_3
    move-exception v0

    .line 340
    const/4 v1, 0x0

    .line 341
    :goto_e
    :try_start_5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 342
    .line 343
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 344
    .line 345
    .line 346
    const-string v3, "local voice mediastore query failed: "

    .line 347
    .line 348
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 352
    .line 353
    .line 354
    move-result-object v3

    .line 355
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 356
    .line 357
    .line 358
    move-result-object v3

    .line 359
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 360
    .line 361
    .line 362
    const-string v3, ": "

    .line 363
    .line 364
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 365
    .line 366
    .line 367
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 368
    .line 369
    .line 370
    move-result-object v0

    .line 371
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 372
    .line 373
    .line 374
    move-result-object v0

    .line 375
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 376
    .line 377
    .line 378
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 379
    .line 380
    .line 381
    move-result-object v0

    .line 382
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 383
    .line 384
    .line 385
    invoke-static {v1}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 386
    .line 387
    .line 388
    return-void

    .line 389
    :catchall_4
    move-exception v0

    .line 390
    invoke-static {v1}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 391
    .line 392
    .line 393
    throw v0
.end method

.method public static E(Ljava/lang/Class;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    const/4 v1, 0x0

    .line 11
    move v2, v1

    .line 12
    :goto_0
    array-length v3, p0

    .line 13
    if-ge v2, v3, :cond_1

    .line 14
    .line 15
    aget-object v3, p0, v2

    .line 16
    .line 17
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    sget-object v6, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    if-ne v5, v6, :cond_0

    .line 28
    .line 29
    array-length v5, v4

    .line 30
    const/4 v6, 0x3

    .line 31
    if-ne v5, v6, :cond_0

    .line 32
    .line 33
    aget-object v5, v4, v1

    .line 34
    .line 35
    sget-object v6, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-ne v5, v6, :cond_0

    .line 38
    .line 39
    const/4 v5, 0x1

    .line 40
    aget-object v5, v4, v5

    .line 41
    .line 42
    const-class v6, Ljava/lang/String;

    .line 43
    .line 44
    if-ne v5, v6, :cond_0

    .line 45
    .line 46
    const/4 v5, 0x2

    .line 47
    aget-object v4, v4, v5

    .line 48
    .line 49
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    if-nez v4, :cond_0

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 59
    .line 60
    goto :goto_0

    .line 61
    :cond_1
    return-object v0
.end method

.method public static E0(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V
    .locals 23

    if-eqz p1, :cond_35

    .line 1
    invoke-virtual/range {p3 .. p3}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    .line 2
    instance-of v1, v0, Landroid/widget/ScrollView;

    const/4 v9, 0x0

    if-eqz v1, :cond_0

    .line 3
    check-cast v0, Landroid/widget/ScrollView;

    invoke-virtual {v0, v9, v9}, Landroid/widget/ScrollView;->scrollTo(II)V

    .line 4
    :cond_0
    invoke-virtual/range {p3 .. p3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 5
    aget-object v0, p7, v9

    if-eqz v0, :cond_2

    .line 6
    invoke-virtual {v0}, Lw6;->d()Z

    move-result v1

    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    :goto_0
    move-object v10, v0

    goto :goto_2

    .line 7
    :cond_2
    :goto_1
    invoke-static/range {p1 .. p1}, Lcom/mr/elaris/w;->O(Landroid/app/Activity;)Lw6;

    move-result-object v0

    .line 8
    aput-object v0, p7, v9

    goto :goto_0

    .line 9
    :goto_2
    invoke-virtual {v10}, Lw6;->c()Ljava/lang/String;

    move-result-object v0

    move-object/from16 v5, p4

    invoke-virtual {v5, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 10
    invoke-virtual {v10}, Lw6;->f()Lw6;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 11
    invoke-virtual {v0}, Lw6;->d()Z

    move-result v1

    if-eqz v1, :cond_3

    .line 12
    invoke-virtual {v0}, Lw6;->c()Ljava/lang/String;

    move-result-object v11

    new-instance v0, Lge;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v8}, Lge;-><init>(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V

    const/4 v6, 0x0

    .line 13
    const-string v3, ".."

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object v5, v0

    move-object v4, v11

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    goto :goto_3

    :cond_3
    move-object/from16 v1, p1

    .line 14
    :goto_3
    new-instance v11, Ljava/util/ArrayList;

    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V

    .line 15
    invoke-virtual {v10}, Lw6;->e()Z

    move-result v0

    if-eqz v0, :cond_5

    .line 16
    invoke-static {v1, v10, v11}, Lcom/mr/elaris/w;->g(Landroid/app/Activity;Lw6;Ljava/util/ArrayList;)I

    move-result v0

    if-gez v0, :cond_4

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 17
    const-string v3, "\u65e0\u6cd5\u8bfb\u53d6\u6388\u6743\u76ee\u5f55"

    const-string v4, "\u8bf7\u70b9\u53f3\u4e0a\u89d2\u6388\u6743\u91cd\u65b0\u9009\u62e9\u76ee\u5f55"

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    return-void

    :cond_4
    move-object/from16 v4, p1

    move v1, v9

    goto/16 :goto_1a

    .line 18
    :cond_5
    :try_start_0
    iget-object v0, v10, Lw6;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    if-nez v0, :cond_6

    const/4 v0, 0x0

    goto :goto_4

    :cond_6
    invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_4
    move-object v2, v0

    goto :goto_5

    :catchall_0
    const/4 v2, 0x0

    :goto_5
    if-nez v2, :cond_7

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 19
    const-string v3, "\u65e0\u6cd5\u8bfb\u53d6\u6b64\u76ee\u5f55"

    const-string v4, "\u8bf7\u70b9\u53f3\u4e0a\u89d2\u6388\u6743\u76ee\u5f55"

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    return-void

    :cond_7
    move-object/from16 v4, p1

    .line 20
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    move v0, v9

    .line 21
    :goto_6
    array-length v5, v2

    const-string v6, "name-file:"

    const-string v7, "name-dir:"

    if-ge v0, v5, :cond_f

    .line 22
    aget-object v13, v2, v0

    if-nez v13, :cond_8

    goto/16 :goto_b

    .line 23
    :cond_8
    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_9

    .line 24
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/mr/elaris/w;->a0(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_9

    const/4 v8, 0x1

    goto :goto_7

    :cond_9
    move v8, v9

    .line 25
    :goto_7
    invoke-virtual {v13}, Ljava/io/File;->isHidden()Z

    move-result v5

    if-eqz v5, :cond_a

    if-nez v8, :cond_a

    goto/16 :goto_b

    .line 26
    :cond_a
    invoke-virtual {v13}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-nez v5, :cond_b

    invoke-virtual {v13}, Ljava/io/File;->isFile()Z

    move-result v5

    if-eqz v5, :cond_e

    .line 27
    :cond_b
    new-instance v12, Ln9;

    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 28
    invoke-virtual {v13}, Ljava/io/File;->isDirectory()Z

    move-result v5

    if-eqz v5, :cond_c

    const-wide/16 v16, 0x0

    :goto_8
    move-wide/from16 v18, v16

    goto :goto_9

    :cond_c
    invoke-virtual {v13}, Ljava/io/File;->length()J

    move-result-wide v16

    goto :goto_8

    :goto_9
    invoke-virtual {v13}, Ljava/io/File;->lastModified()J

    move-result-wide v20

    invoke-virtual {v13}, Ljava/io/File;->isDirectory()Z

    move-result v22

    const/4 v14, 0x0

    const-string v16, ""

    const-string v17, ""

    invoke-direct/range {v12 .. v22}, Ln9;-><init>(Ljava/io/File;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 29
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    const-string v5, "path:"

    .line 31
    :try_start_1
    invoke-virtual {v13}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_a

    .line 32
    :catchall_1
    invoke-virtual {v13}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v5, v8}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 33
    :goto_a
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 34
    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v13}, Ljava/io/File;->isDirectory()Z

    move-result v8

    if-eqz v8, :cond_d

    move-object v6, v7

    :cond_d
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    invoke-virtual {v13}, Ljava/io/File;->getName()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v6, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    .line 36
    invoke-virtual {v3, v5}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    :cond_e
    :goto_b
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_6

    .line 37
    :cond_f
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v5

    .line 38
    iget-object v0, v10, Lw6;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    if-eqz v0, :cond_10

    .line 39
    sget-object v12, Landroid/provider/MediaStore$Audio$Media;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v4, v0, v11, v3, v12}, Lcom/mr/elaris/w;->D0(Landroid/app/Activity;Ljava/io/File;Ljava/util/ArrayList;Ljava/util/HashSet;Landroid/net/Uri;)V

    .line 40
    sget-object v12, Landroid/provider/MediaStore$Downloads;->EXTERNAL_CONTENT_URI:Landroid/net/Uri;

    invoke-static {v4, v0, v11, v3, v12}, Lcom/mr/elaris/w;->D0(Landroid/app/Activity;Ljava/io/File;Ljava/util/ArrayList;Ljava/util/HashSet;Landroid/net/Uri;)V

    .line 41
    :cond_10
    iget-object v0, v10, Lw6;->a:Ljava/lang/Object;

    check-cast v0, Ljava/io/File;

    if-eqz v0, :cond_22

    .line 42
    invoke-static {v4}, Lcom/mr/elaris/w;->H0(Landroid/content/Context;)Lw6;

    move-result-object v12

    if-eqz v12, :cond_22

    .line 43
    invoke-virtual {v12}, Lw6;->e()Z

    move-result v13

    if-nez v13, :cond_11

    goto/16 :goto_15

    .line 44
    :cond_11
    iget-object v13, v12, Lw6;->b:Ljava/lang/Object;

    check-cast v13, Landroid/net/Uri;

    invoke-virtual {v12}, Lw6;->e()Z

    move-result v14

    if-eqz v14, :cond_1b

    .line 45
    iget-object v14, v12, Lw6;->c:Ljava/lang/Comparable;

    check-cast v14, Landroid/net/Uri;

    if-nez v14, :cond_12

    const/4 v1, 0x0

    const/16 v18, 0x1

    goto :goto_f

    .line 46
    :cond_12
    :try_start_2
    invoke-static {v14}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_13

    .line 47
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v15

    if-nez v15, :cond_14

    :catchall_2
    :cond_13
    const/16 v18, 0x1

    goto :goto_e

    :cond_14
    const/16 v15, 0x3a

    .line 48
    invoke-virtual {v14, v15}, Ljava/lang/String;->indexOf(I)I

    move-result v15

    if-ltz v15, :cond_15

    .line 49
    invoke-virtual {v14, v9, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v16

    :goto_c
    move-object/from16 v17, v16

    goto :goto_d

    :cond_15
    const-string v16, ""

    goto :goto_c

    .line 50
    :goto_d
    invoke-virtual/range {v17 .. v17}, Ljava/lang/String;->length()I

    move-result v16

    if-lez v16, :cond_16

    const-string v1, "primary"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    move-object/from16 v8, v17

    const/16 v18, 0x1

    :try_start_3
    invoke-virtual {v1, v8}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_17

    :catchall_3
    :goto_e
    const/4 v1, 0x0

    goto :goto_f

    :cond_16
    const/16 v18, 0x1

    :cond_17
    if-ltz v15, :cond_18

    add-int/lit8 v15, v15, 0x1

    .line 51
    invoke-virtual {v14, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v14

    .line 52
    :cond_18
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    move-result-object v1

    if-nez v1, :cond_19

    goto :goto_e

    .line 53
    :cond_19
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_1a

    goto :goto_f

    :cond_1a
    new-instance v8, Ljava/io/File;

    invoke-direct {v8, v1, v14}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    move-object v1, v8

    :goto_f
    if-nez v1, :cond_1c

    :cond_1b
    :goto_10
    const/4 v1, 0x0

    goto/16 :goto_14

    .line 54
    :cond_1c
    invoke-static {v1}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 55
    invoke-static {v0}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    .line 56
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v14

    const-string v15, "/"

    if-nez v14, :cond_1d

    invoke-virtual {v1, v15}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v8, v14}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    move-result v14

    if-nez v14, :cond_1d

    goto :goto_10

    .line 57
    :cond_1d
    :try_start_4
    invoke-static {v13}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_1b

    .line 58
    invoke-virtual {v14}, Ljava/lang/String;->length()I

    move-result v17

    if-nez v17, :cond_1e

    goto :goto_10

    .line 59
    :cond_1e
    invoke-virtual {v8, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v17

    if-nez v17, :cond_20

    .line 60
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v1, v1, 0x1

    invoke-virtual {v8, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    .line 61
    const-string v8, ":"

    invoke-virtual {v14, v8}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1f

    goto :goto_11

    :cond_1f
    invoke-virtual {v15, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    :goto_11
    invoke-virtual {v14, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v14

    goto :goto_12

    :catchall_4
    move-exception v0

    goto :goto_13

    .line 62
    :cond_20
    :goto_12
    invoke-static {v13, v14}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v20

    .line 63
    iget-object v1, v12, Lw6;->b:Ljava/lang/Object;

    move-object/from16 v19, v1

    check-cast v19, Landroid/net/Uri;

    .line 64
    invoke-static {v0}, Lcom/mr/elaris/w;->h0(Ljava/io/File;)Ljava/lang/String;

    move-result-object v0

    .line 65
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 66
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v8

    if-nez v8, :cond_21

    const-string v0, "\u6388\u6743\u76ee\u5f55"

    :cond_21
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 67
    new-instance v17, Lw6;

    new-instance v21, Ljava/util/ArrayList;

    invoke-direct/range {v21 .. v21}, Ljava/util/ArrayList;-><init>()V

    const/16 v18, 0x0

    move-object/from16 v22, v1

    invoke-direct/range {v17 .. v22}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object/from16 v1, v17

    goto :goto_14

    .line 68
    :goto_13
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v8, "local voice granted tree mapping failed: "

    invoke-direct {v1, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v8

    invoke-virtual {v8}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ": "

    invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 70
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    goto/16 :goto_10

    :goto_14
    if-nez v1, :cond_23

    :cond_22
    :goto_15
    move v8, v9

    goto :goto_19

    .line 71
    :cond_23
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 72
    invoke-static {v4, v1, v0}, Lcom/mr/elaris/w;->g(Landroid/app/Activity;Lw6;Ljava/util/ArrayList;)I

    move-result v1

    if-gez v1, :cond_24

    goto :goto_15

    :cond_24
    move v1, v9

    move v8, v1

    .line 73
    :goto_16
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v12

    if-ge v1, v12, :cond_28

    .line 74
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ln9;

    if-nez v12, :cond_25

    goto :goto_18

    .line 75
    :cond_25
    iget-boolean v13, v12, Ln9;->h:Z

    .line 76
    iget-object v14, v12, Ln9;->c:Ljava/lang/String;

    if-eqz v13, :cond_26

    .line 77
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v14, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    goto :goto_17

    .line 78
    :cond_26
    new-instance v13, Ljava/lang/StringBuilder;

    invoke-direct {v13, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v15, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v14, v15}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v13

    .line 79
    :goto_17
    invoke-virtual {v3, v13}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_27

    goto :goto_18

    .line 80
    :cond_27
    invoke-virtual {v11, v12}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    :goto_18
    add-int/lit8 v1, v1, 0x1

    goto :goto_16

    .line 81
    :cond_28
    :goto_19
    array-length v0, v2

    .line 82
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v1

    sub-int/2addr v1, v5

    if-lez v8, :cond_29

    .line 83
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "local voice granted tree supplemented dir="

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v3, v10, Lw6;->a:Ljava/lang/Object;

    check-cast v3, Ljava/io/File;

    .line 84
    invoke-static {v3}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " count="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 85
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 86
    :cond_29
    :goto_1a
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 87
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v5

    .line 88
    sget-wide v7, Lcom/mr/elaris/w;->o:J

    sub-long v7, v5, v7

    const-wide/16 v12, 0x1388

    cmp-long v3, v7, v12

    if-gez v3, :cond_2a

    goto :goto_1d

    .line 89
    :cond_2a
    sput-wide v5, Lcom/mr/elaris/w;->o:J

    .line 90
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v5, "local voice entry browser dir="

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 91
    invoke-virtual {v10}, Lw6;->e()Z

    move-result v5

    if-eqz v5, :cond_2b

    invoke-virtual {v10}, Lw6;->c()Ljava/lang/String;

    move-result-object v5

    const-string v6, "tree:"

    invoke-virtual {v6, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_1b

    .line 92
    :cond_2b
    iget-object v5, v10, Lw6;->a:Ljava/lang/Object;

    check-cast v5, Ljava/io/File;

    invoke-static {v5}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    move-result-object v5

    .line 93
    :goto_1b
    invoke-static {v5}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " files="

    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " shown="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " media="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, " mode="

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    invoke-virtual {v10}, Lw6;->e()Z

    move-result v0

    if-eqz v0, :cond_2c

    const-string v0, "tree"

    goto :goto_1c

    :cond_2c
    const-string v0, "file"

    :goto_1c
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 95
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 96
    :goto_1d
    new-instance v0, Lue;

    .line 97
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 98
    invoke-static {v11, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 99
    invoke-virtual {v11}, Ljava/util/ArrayList;->size()I

    move-result v12

    .line 100
    aget v0, p6, v9

    invoke-static {v9, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    if-gtz v12, :cond_2d

    move v1, v9

    goto :goto_1e

    :cond_2d
    add-int/lit8 v1, v12, -0x1

    .line 101
    div-int/lit8 v1, v1, 0x50

    :goto_1e
    if-le v0, v1, :cond_2e

    move v0, v1

    .line 102
    :cond_2e
    aput v0, p6, v9

    mul-int/lit8 v13, v0, 0x50

    add-int/lit8 v1, v13, 0x50

    .line 103
    invoke-static {v12, v1}, Ljava/lang/Math;->min(II)I

    move-result v14

    .line 104
    const-string v15, " / "

    if-lez v0, :cond_2f

    .line 105
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    add-int/lit8 v1, v13, 0x1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v16

    new-instance v0, Lge;

    const/4 v9, 0x2

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    move-object/from16 v6, p4

    move-object/from16 v3, p5

    move-object/from16 v1, p6

    move-object/from16 v8, p7

    move-object v2, v4

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v9}, Lge;-><init>([ILandroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;[Lw6;I)V

    const/4 v6, 0x0

    .line 106
    const-string v3, "\u4e0a\u4e00\u9875"

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object v5, v0

    move-object/from16 v4, v16

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    :cond_2f
    :goto_1f
    if-ge v13, v14, :cond_33

    .line 107
    invoke-virtual {v11, v13}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    move-object v9, v0

    check-cast v9, Ln9;

    if-nez v9, :cond_30

    move-object/from16 v17, v10

    goto/16 :goto_20

    .line 108
    :cond_30
    iget-boolean v0, v9, Ln9;->h:Z

    if-eqz v0, :cond_31

    .line 109
    iget-object v0, v9, Ln9;->c:Ljava/lang/String;

    new-instance v5, Lde;

    move-object/from16 v7, p0

    move-object/from16 v4, p1

    move-object/from16 v8, p2

    move-object/from16 v6, p5

    move-object/from16 v1, p7

    move-object/from16 v16, v0

    move-object v0, v5

    move-object v3, v9

    move-object v2, v10

    move-object/from16 v10, p3

    move-object/from16 v9, p4

    move-object/from16 v5, p6

    invoke-direct/range {v0 .. v10}, Lde;-><init>([Lw6;Lw6;Ln9;Landroid/app/Activity;[ILjava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;)V

    move-object v7, v2

    const/4 v6, 0x0

    .line 110
    const-string v4, "\u6587\u4ef6\u5939"

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object v5, v0

    move-object/from16 v3, v16

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    move-object/from16 v17, v7

    goto :goto_20

    :cond_31
    move-object v7, v10

    .line 111
    invoke-virtual {v9}, Ln9;->a()Z

    move-result v0

    .line 112
    iget-object v10, v9, Ln9;->c:Ljava/lang/String;

    if-eqz v0, :cond_32

    .line 113
    invoke-static {v9}, Lcom/mr/elaris/w;->x(Ln9;)Ljava/lang/String;

    move-result-object v16

    new-instance v0, Lee;

    move-object/from16 v5, p0

    move-object/from16 v2, p1

    move-object/from16 v1, p2

    move-object/from16 v4, p5

    move-object v3, v7

    move-object v6, v9

    invoke-direct/range {v0 .. v6}, Lee;-><init>(Landroid/app/Dialog;Landroid/app/Activity;Lw6;Ljava/lang/ClassLoader;Lpd;Ln9;)V

    move-object/from16 v18, v0

    move-object/from16 v17, v3

    new-instance v0, Lfe;

    move-object/from16 v3, p0

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v6, p3

    move-object/from16 v5, p4

    move-object/from16 v2, p5

    move-object/from16 v8, p6

    move-object/from16 v7, p7

    invoke-direct/range {v0 .. v9}, Lfe;-><init>(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;[Lw6;[ILn9;)V

    move-object v2, v6

    move-object v3, v10

    move-object/from16 v4, v16

    move-object/from16 v5, v18

    move-object v6, v0

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    goto :goto_20

    :cond_32
    move-object/from16 v17, v7

    move-object v3, v10

    .line 114
    invoke-static {v9}, Lcom/mr/elaris/w;->x(Ln9;)Ljava/lang/String;

    move-result-object v0

    const-string v1, "  \u4e0d\u652f\u6301"

    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    .line 115
    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    :goto_20
    add-int/lit8 v13, v13, 0x1

    move-object/from16 v10, v17

    goto/16 :goto_1f

    :cond_33
    if-ge v14, v12, :cond_34

    .line 116
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v10

    new-instance v0, Lge;

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p2

    move-object/from16 v7, p3

    move-object/from16 v6, p4

    move-object/from16 v3, p5

    move-object/from16 v1, p6

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v9}, Lge;-><init>([ILandroid/app/Activity;Ljava/lang/ClassLoader;Lpd;Landroid/app/Dialog;Landroid/widget/TextView;Landroid/widget/LinearLayout;[Lw6;I)V

    const/4 v6, 0x0

    .line 117
    const-string v3, "\u4e0b\u4e00\u9875"

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    move-object v5, v0

    move-object v4, v10

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    :cond_34
    if-nez v12, :cond_35

    const/4 v5, 0x0

    const/4 v6, 0x0

    .line 118
    const-string v3, "\u6b64\u76ee\u5f55\u6ca1\u6709\u53ef\u663e\u793a\u7684\u6587\u4ef6"

    const-string v4, "\u53ef\u8fdb\u5165\u5176\u4ed6\u76ee\u5f55\u6216\u70b9\u53f3\u4e0a\u89d2\u6388\u6743"

    move-object/from16 v1, p1

    move-object/from16 v2, p3

    invoke-static/range {v1 .. v6}, Lcom/mr/elaris/w;->f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V

    :cond_35
    return-void
.end method

.method public static F(Landroid/view/View;)Landroid/widget/ImageView;
    .locals 4

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
    const/4 v1, 0x0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    return-object v1

    .line 14
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    const/16 v2, 0x14

    .line 21
    .line 22
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v2, 0x0

    .line 27
    :goto_0
    if-ge v2, v0, :cond_3

    .line 28
    .line 29
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-static {v3}, Lcom/mr/elaris/w;->F(Landroid/view/View;)Landroid/widget/ImageView;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    if-eqz v3, :cond_2

    .line 38
    .line 39
    return-object v3

    .line 40
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_3
    return-object v1
.end method

.method public static F0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    const/16 v1, 0xa0

    .line 11
    .line 12
    if-le v0, v1, :cond_1

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    :cond_1
    return-object p0
.end method

.method public static varargs G([Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p0

    .line 3
    if-ge v0, v1, :cond_1

    .line 4
    .line 5
    aget-object v1, p0, v0

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-lez v2, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    const-string p0, ""

    .line 20
    .line 21
    return-object p0
.end method

.method public static G0(Landroid/content/Context;)Ljava/io/File;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    if-nez v1, :cond_1

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_1
    move-object p0, v1

    .line 13
    :goto_0
    const-string v1, "elaris_local_voice_state"

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    invoke-virtual {p0, v1, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    const-string v1, "last_dir"

    .line 21
    .line 22
    const-string v2, ""

    .line 23
    .line 24
    invoke-interface {p0, v1, v2}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    if-eqz p0, :cond_3

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v1

    .line 34
    if-nez v1, :cond_2

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_2
    new-instance v1, Ljava/io/File;

    .line 38
    .line 39
    invoke-direct {v1, p0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-eqz p0, :cond_3

    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/io/File;->isDirectory()Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-eqz p0, :cond_3

    .line 53
    .line 54
    invoke-virtual {v1}, Ljava/io/File;->canRead()Z

    .line 55
    .line 56
    .line 57
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    if-eqz p0, :cond_3

    .line 59
    .line 60
    return-object v1

    .line 61
    :catchall_0
    :cond_3
    :goto_1
    return-object v0
.end method

.method public static varargs H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    array-length v1, p1

    .line 5
    if-ge v0, v1, :cond_2

    .line 6
    .line 7
    aget-object v1, p1, v0

    .line 8
    .line 9
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->K(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    return-object v1

    .line 16
    :cond_0
    aget-object v1, p1, v0

    .line 17
    .line 18
    invoke-static {v1}, Lcom/mr/elaris/w;->Z0(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    const-string v2, "get"

    .line 23
    .line 24
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    const/4 p0, 0x0

    .line 39
    return-object p0
.end method

.method public static H0(Landroid/content/Context;)Lw6;
    .locals 13

    .line 1
    const-string v0, "elaris_local_voice_state"

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    const-string v2, "local voice saved tree permission expired uri="

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    if-nez p0, :cond_0

    .line 9
    .line 10
    return-object v3

    .line 11
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    .line 13
    .line 14
    move-result-object v4

    .line 15
    if-nez v4, :cond_1

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_1
    move-object p0, v4

    .line 19
    :goto_0
    const/4 v4, 0x0

    .line 20
    invoke-virtual {p0, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 21
    .line 22
    .line 23
    move-result-object v5

    .line 24
    const-string v6, "tree_uri"

    .line 25
    .line 26
    invoke-interface {v5, v6, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    if-eqz v5, :cond_11

    .line 31
    .line 32
    invoke-virtual {v5}, Ljava/lang/String;->length()I

    .line 33
    .line 34
    .line 35
    move-result v6

    .line 36
    if-nez v6, :cond_2

    .line 37
    .line 38
    goto/16 :goto_b

    .line 39
    .line 40
    :cond_2
    invoke-static {v5}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 41
    .line 42
    .line 43
    move-result-object v9

    .line 44
    invoke-static {p0, v9}, Lcom/mr/elaris/w;->L(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 45
    .line 46
    .line 47
    move-result v6

    .line 48
    if-nez v6, :cond_3

    .line 49
    .line 50
    invoke-static {p0}, Lcom/mr/elaris/w;->k(Landroid/content/Context;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v5}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    return-object v3

    .line 65
    :catchall_0
    move-exception v0

    .line 66
    move-object p0, v0

    .line 67
    goto/16 :goto_c

    .line 68
    .line 69
    :cond_3
    invoke-virtual {p0, v0, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    const-string v2, "tree_doc_uri"

    .line 74
    .line 75
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    if-eqz v2, :cond_4

    .line 80
    .line 81
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-lez v5, :cond_4

    .line 86
    .line 87
    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    :goto_1
    move-object v10, v2

    .line 92
    goto :goto_2

    .line 93
    :cond_4
    invoke-static {v9}, Landroid/provider/DocumentsContract;->getTreeDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v2

    .line 97
    invoke-static {v9, v2}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 98
    .line 99
    .line 100
    move-result-object v2

    .line 101
    goto :goto_1

    .line 102
    :goto_2
    const-string v2, "tree_parent_docs"

    .line 103
    .line 104
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v2

    .line 108
    new-instance v11, Ljava/util/ArrayList;

    .line 109
    .line 110
    invoke-direct {v11}, Ljava/util/ArrayList;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 111
    .line 112
    .line 113
    const-string v5, "\\n"

    .line 114
    .line 115
    if-eqz v2, :cond_8

    .line 116
    .line 117
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 118
    .line 119
    .line 120
    move-result v6

    .line 121
    if-nez v6, :cond_5

    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_5
    invoke-virtual {v2, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v2

    .line 128
    move v6, v4

    .line 129
    :goto_3
    array-length v7, v2

    .line 130
    if-ge v6, v7, :cond_8

    .line 131
    .line 132
    aget-object v7, v2, v6

    .line 133
    .line 134
    if-eqz v7, :cond_7

    .line 135
    .line 136
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 137
    .line 138
    .line 139
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 140
    if-nez v8, :cond_6

    .line 141
    .line 142
    goto :goto_4

    .line 143
    :cond_6
    :try_start_2
    invoke-static {v7}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    invoke-virtual {v11, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 148
    .line 149
    .line 150
    :catchall_1
    :cond_7
    :goto_4
    add-int/lit8 v6, v6, 0x1

    .line 151
    .line 152
    goto :goto_3

    .line 153
    :cond_8
    :goto_5
    :try_start_3
    const-string v2, "tree_segments"

    .line 154
    .line 155
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    new-instance v12, Ljava/util/ArrayList;

    .line 160
    .line 161
    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    .line 162
    .line 163
    .line 164
    if-eqz v0, :cond_c

    .line 165
    .line 166
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 167
    .line 168
    .line 169
    move-result v1

    .line 170
    if-nez v1, :cond_9

    .line 171
    .line 172
    goto :goto_8

    .line 173
    :cond_9
    invoke-virtual {v0, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 174
    .line 175
    .line 176
    move-result-object v0

    .line 177
    move v1, v4

    .line 178
    :goto_6
    array-length v2, v0

    .line 179
    if-ge v1, v2, :cond_c

    .line 180
    .line 181
    aget-object v2, v0, v1

    .line 182
    .line 183
    if-eqz v2, :cond_b

    .line 184
    .line 185
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 186
    .line 187
    .line 188
    move-result v5

    .line 189
    if-nez v5, :cond_a

    .line 190
    .line 191
    goto :goto_7

    .line 192
    :cond_a
    invoke-static {v2}, Landroid/net/Uri;->decode(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v2

    .line 196
    if-eqz v2, :cond_b

    .line 197
    .line 198
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 199
    .line 200
    .line 201
    move-result v5

    .line 202
    if-lez v5, :cond_b

    .line 203
    .line 204
    invoke-virtual {v12, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 205
    .line 206
    .line 207
    :cond_b
    :goto_7
    add-int/lit8 v1, v1, 0x1

    .line 208
    .line 209
    goto :goto_6

    .line 210
    :cond_c
    :goto_8
    invoke-virtual {v12}, Ljava/util/ArrayList;->isEmpty()Z

    .line 211
    .line 212
    .line 213
    move-result v0

    .line 214
    if-eqz v0, :cond_e

    .line 215
    .line 216
    invoke-static {p0, v10}, Lcom/mr/elaris/w;->n0(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 221
    .line 222
    .line 223
    move-result v0

    .line 224
    if-nez v0, :cond_d

    .line 225
    .line 226
    const-string p0, "\u6388\u6743\u76ee\u5f55"

    .line 227
    .line 228
    :cond_d
    invoke-virtual {v12, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 229
    .line 230
    .line 231
    goto :goto_a

    .line 232
    :cond_e
    :goto_9
    invoke-virtual {v12}, Ljava/util/ArrayList;->size()I

    .line 233
    .line 234
    .line 235
    move-result p0

    .line 236
    if-ge v4, p0, :cond_10

    .line 237
    .line 238
    invoke-virtual {v12, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 239
    .line 240
    .line 241
    move-result-object p0

    .line 242
    check-cast p0, Ljava/lang/String;

    .line 243
    .line 244
    invoke-static {p0}, Lcom/mr/elaris/w;->t0(Ljava/lang/String;)Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 249
    .line 250
    .line 251
    move-result v0

    .line 252
    if-lez v0, :cond_f

    .line 253
    .line 254
    invoke-virtual {v12, v4, p0}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 255
    .line 256
    .line 257
    :cond_f
    add-int/lit8 v4, v4, 0x1

    .line 258
    .line 259
    goto :goto_9

    .line 260
    :cond_10
    :goto_a
    new-instance v7, Lw6;

    .line 261
    .line 262
    const/4 v8, 0x0

    .line 263
    invoke-direct/range {v7 .. v12}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 264
    .line 265
    .line 266
    return-object v7

    .line 267
    :cond_11
    :goto_b
    return-object v3

    .line 268
    :goto_c
    new-instance v0, Ljava/lang/StringBuilder;

    .line 269
    .line 270
    const-string v1, "local voice saved tree unavailable: "

    .line 271
    .line 272
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 280
    .line 281
    .line 282
    move-result-object v1

    .line 283
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 284
    .line 285
    .line 286
    const-string v1, ": "

    .line 287
    .line 288
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 289
    .line 290
    .line 291
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 292
    .line 293
    .line 294
    move-result-object p0

    .line 295
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 296
    .line 297
    .line 298
    move-result-object p0

    .line 299
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 300
    .line 301
    .line 302
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 303
    .line 304
    .line 305
    move-result-object p0

    .line 306
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 307
    .line 308
    .line 309
    return-object v3
.end method

.method public static varargs I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    instance-of p1, p0, Ljava/lang/String;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    check-cast p0, Ljava/lang/String;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    const-string p0, ""

    .line 13
    .line 14
    return-object p0
.end method

.method public static I0(Ljava/lang/ClassLoader;Ljava/lang/String;)I
    .locals 8

    .line 1
    const-string v0, "kk-tts"

    .line 2
    .line 3
    const-string v1, "com.tencent.qqnt.aio.adapter.api.IAIOPttApi"

    .line 4
    .line 5
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->C0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return v1

    .line 13
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 18
    .line 19
    .line 20
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    move v3, v1

    .line 22
    :goto_0
    array-length v4, v2

    .line 23
    if-ge v3, v4, :cond_4

    .line 24
    .line 25
    aget-object v4, v2, v3

    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    const-string v6, "getPttFileDuration"

    .line 32
    .line 33
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v7

    .line 37
    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result v6

    .line 41
    if-eqz v6, :cond_3

    .line 42
    .line 43
    array-length v6, v5

    .line 44
    const/4 v7, 0x1

    .line 45
    if-ne v6, v7, :cond_3

    .line 46
    .line 47
    aget-object v5, v5, v1

    .line 48
    .line 49
    const-class v6, Ljava/lang/String;

    .line 50
    .line 51
    if-eq v5, v6, :cond_1

    .line 52
    .line 53
    goto :goto_3

    .line 54
    :cond_1
    :try_start_1
    invoke-virtual {v4, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 55
    .line 56
    .line 57
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    invoke-virtual {v4, p0, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object p0

    .line 65
    instance-of p1, p0, Ljava/lang/Number;

    .line 66
    .line 67
    if-eqz p1, :cond_2

    .line 68
    .line 69
    check-cast p0, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    goto :goto_1

    .line 76
    :catchall_0
    move-exception p0

    .line 77
    goto :goto_2

    .line 78
    :cond_2
    move p0, v1

    .line 79
    :goto_1
    invoke-static {v1, p0}, Ljava/lang/Math;->max(II)I

    .line 80
    .line 81
    .line 82
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    return p0

    .line 84
    :goto_2
    const-string p1, "script-duration"

    .line 85
    .line 86
    invoke-static {v0, p1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    return v1

    .line 90
    :cond_3
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    goto :goto_0

    .line 93
    :cond_4
    return v1

    .line 94
    :catchall_1
    move-exception p0

    .line 95
    const-string p1, "script-duration-methods"

    .line 96
    .line 97
    invoke-static {v0, p1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 98
    .line 99
    .line 100
    return v1
.end method

.method public static J(Landroid/view/View;)I
    .locals 4

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    check-cast p0, Landroid/widget/TextView;

    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/widget/TextView;->getCurrentTextColor()I

    .line 9
    .line 10
    .line 11
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    return p0

    .line 13
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    goto :goto_1

    .line 18
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 19
    .line 20
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 21
    .line 22
    .line 23
    move-result v0

    .line 24
    const/16 v2, 0x14

    .line 25
    .line 26
    invoke-static {v0, v2}, Ljava/lang/Math;->min(II)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    const/4 v2, 0x0

    .line 31
    :goto_0
    if-ge v2, v0, :cond_3

    .line 32
    .line 33
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v3}, Lcom/mr/elaris/w;->J(Landroid/view/View;)I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-eq v3, v1, :cond_2

    .line 42
    .line 43
    return v3

    .line 44
    :cond_2
    add-int/lit8 v2, v2, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :catchall_0
    :cond_3
    :goto_1
    return v1
.end method

.method public static J0(Ljava/lang/ClassLoader;Ljava/lang/String;I[BLpd;Lx2;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "com.tencent.qqnt.msg.api.IMsgUtilApi"

    .line 3
    .line 4
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->C0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "com.tencent.qqnt.msg.api.IMsgService"

    .line 9
    .line 10
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->C0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v1, :cond_7

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_0
    invoke-static {v1, p1, p2, p3}, Lcom/mr/elaris/w;->o(Ljava/lang/Object;Ljava/lang/String;I[B)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto :goto_2

    .line 26
    :cond_1
    const-string p2, "com.tencent.qqnt.kernel.nativeinterface.Contact"

    .line 27
    .line 28
    invoke-static {p2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    if-eqz p2, :cond_2

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_2
    const-string p2, "com.tencent.qqnt.kernelpublic.nativeinterface.Contact"

    .line 36
    .line 37
    invoke-static {p2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p2

    .line 41
    :goto_0
    if-nez p2, :cond_3

    .line 42
    .line 43
    goto :goto_2

    .line 44
    :cond_3
    iget-object p3, p4, Lpd;->a:Ljava/lang/String;

    .line 45
    .line 46
    iget p4, p4, Lpd;->b:I

    .line 47
    .line 48
    const/4 v1, 0x1

    .line 49
    if-eq p4, v1, :cond_4

    .line 50
    .line 51
    const/16 v1, 0x64

    .line 52
    .line 53
    if-ne p4, v1, :cond_5

    .line 54
    .line 55
    :cond_4
    invoke-static {p3}, Lcom/mr/elaris/w;->Z(Ljava/lang/String;)Z

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    if-eqz v1, :cond_5

    .line 60
    .line 61
    invoke-static {p0, p3}, Lcom/mr/elaris/w;->Y0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 66
    .line 67
    .line 68
    move-result v3

    .line 69
    if-lez v3, :cond_5

    .line 70
    .line 71
    move-object p3, v1

    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception p0

    .line 74
    goto :goto_3

    .line 75
    :cond_5
    :goto_1
    invoke-static {p2, p3, p4}, Lcom/mr/elaris/w;->r0(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object p2

    .line 79
    if-nez p2, :cond_6

    .line 80
    .line 81
    goto :goto_2

    .line 82
    :cond_6
    new-instance p3, Ljava/util/ArrayList;

    .line 83
    .line 84
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    invoke-static {v2, p2, p3, p0, p5}, Lcom/mr/elaris/w;->X(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/ClassLoader;Lx2;)Z

    .line 91
    .line 92
    .line 93
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 94
    return p0

    .line 95
    :cond_7
    :goto_2
    return v0

    .line 96
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string p2, "voice forward send failed reason="

    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 104
    .line 105
    .line 106
    move-result-object p2

    .line 107
    invoke-virtual {p2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    const-string p2, ": "

    .line 115
    .line 116
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 135
    .line 136
    .line 137
    return v0
.end method

.method public static K(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_1

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :goto_0
    if-eqz v1, :cond_1

    .line 12
    .line 13
    const-class v2, Ljava/lang/Object;

    .line 14
    .line 15
    if-eq v1, v2, :cond_1

    .line 16
    .line 17
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    const/4 v3, 0x1

    .line 22
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return-object p0

    .line 30
    :catchall_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    return-object v0
.end method

.method public static K0(Ljava/lang/ClassLoader;Ljava/lang/String;ILpd;)Z
    .locals 12

    .line 1
    const-string v0, "kk-tts"

    .line 2
    .line 3
    const-string v1, "kk tts script ptt prepared duration_units="

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    :try_start_0
    const-string v3, "com.tencent.qqnt.msg.api.IMsgService"

    .line 7
    .line 8
    invoke-static {p0, v3}, Lcom/mr/elaris/w;->C0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    if-nez v3, :cond_0

    .line 13
    .line 14
    goto/16 :goto_7

    .line 15
    .line 16
    :cond_0
    invoke-static {p0, p1}, Lcom/mr/elaris/w;->I0(Ljava/lang/ClassLoader;Ljava/lang/String;)I

    .line 17
    .line 18
    .line 19
    move-result v4

    .line 20
    const-wide/16 v5, 0x3e8

    .line 21
    .line 22
    if-gtz v4, :cond_1

    .line 23
    .line 24
    invoke-static {v2, p2}, Ljava/lang/Math;->max(II)I

    .line 25
    .line 26
    .line 27
    move-result v7

    .line 28
    int-to-long v7, v7

    .line 29
    :goto_0
    mul-long/2addr v7, v5

    .line 30
    goto :goto_1

    .line 31
    :cond_1
    invoke-static {v4, p2}, Li5;->d0(II)Z

    .line 32
    .line 33
    .line 34
    move-result v7

    .line 35
    if-eqz v7, :cond_2

    .line 36
    .line 37
    int-to-long v7, v4

    .line 38
    goto :goto_0

    .line 39
    :cond_2
    int-to-long v5, v4

    .line 40
    const-wide/16 v7, 0x14

    .line 41
    .line 42
    mul-long/2addr v7, v5

    .line 43
    :goto_1
    const-wide/32 v5, 0x7fffffff

    .line 44
    .line 45
    .line 46
    cmp-long v5, v7, v5

    .line 47
    .line 48
    if-lez v5, :cond_3

    .line 49
    .line 50
    const v5, 0x7fffffff

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :cond_3
    long-to-int v5, v7

    .line 55
    :goto_2
    if-gtz v4, :cond_4

    .line 56
    .line 57
    const-string p2, "silk-fallback"

    .line 58
    .line 59
    goto :goto_3

    .line 60
    :cond_4
    invoke-static {v4, p2}, Li5;->d0(II)Z

    .line 61
    .line 62
    .line 63
    move-result p2

    .line 64
    if-eqz p2, :cond_5

    .line 65
    .line 66
    const-string p2, "seconds"

    .line 67
    .line 68
    goto :goto_3

    .line 69
    :cond_5
    const-string p2, "frames20ms"

    .line 70
    .line 71
    :goto_3
    sget-object v6, Li5;->i:[B

    .line 72
    .line 73
    invoke-virtual {v6}, [B->clone()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object v6

    .line 77
    check-cast v6, [B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 78
    .line 79
    const/4 v7, 0x1

    .line 80
    const/4 v8, 0x0

    .line 81
    :try_start_1
    const-string v9, "com.tencent.qqnt.msg.api.impl.MsgUtilApiImpl"

    .line 82
    .line 83
    invoke-static {v9, v2, p0}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-virtual {v9, v8}, Ljava/lang/Class;->getDeclaredConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v9, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v9, v8}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 98
    goto :goto_4

    .line 99
    :catchall_0
    move-exception v9

    .line 100
    :try_start_2
    const-string v10, "script-msg-util"

    .line 101
    .line 102
    invoke-static {v0, v10, v9}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 103
    .line 104
    .line 105
    move-object v9, v8

    .line 106
    :goto_4
    invoke-static {v9, p1, v5, v6}, Lcom/mr/elaris/w;->p(Ljava/lang/Object;Ljava/lang/String;I[B)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    move-result-object v10

    .line 110
    const-string v11, "impl-2arg"

    .line 111
    .line 112
    if-nez v10, :cond_6

    .line 113
    .line 114
    const-string v9, "com.tencent.qqnt.msg.api.IMsgUtilApi"

    .line 115
    .line 116
    invoke-static {p0, v9}, Lcom/mr/elaris/w;->C0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v9

    .line 120
    invoke-static {v9, p1, v5, v6}, Lcom/mr/elaris/w;->p(Ljava/lang/Object;Ljava/lang/String;I[B)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v10

    .line 124
    const-string v11, "qroute-2arg"

    .line 125
    .line 126
    goto :goto_5

    .line 127
    :catchall_1
    move-exception p0

    .line 128
    goto/16 :goto_8

    .line 129
    .line 130
    :cond_6
    :goto_5
    if-nez v10, :cond_7

    .line 131
    .line 132
    if-eqz v9, :cond_7

    .line 133
    .line 134
    invoke-static {v9, p1, v5, v6}, Lcom/mr/elaris/w;->o(Ljava/lang/Object;Ljava/lang/String;I[B)Ljava/lang/Object;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-static {v10, v6}, Lcom/mr/elaris/w;->w0(Ljava/lang/Object;[B)V

    .line 139
    .line 140
    .line 141
    const-string v11, "qroute-3arg-fallback"

    .line 142
    .line 143
    :cond_7
    if-nez v10, :cond_8

    .line 144
    .line 145
    goto :goto_7

    .line 146
    :cond_8
    const-string p1, "com.tencent.qqnt.kernel.nativeinterface.Contact"

    .line 147
    .line 148
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    if-eqz p1, :cond_9

    .line 153
    .line 154
    goto :goto_6

    .line 155
    :cond_9
    const-string p1, "com.tencent.qqnt.kernelpublic.nativeinterface.Contact"

    .line 156
    .line 157
    invoke-static {p1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 158
    .line 159
    .line 160
    move-result-object p1

    .line 161
    :goto_6
    if-nez p1, :cond_a

    .line 162
    .line 163
    goto :goto_7

    .line 164
    :cond_a
    iget-object v6, p3, Lpd;->a:Ljava/lang/String;

    .line 165
    .line 166
    iget v9, p3, Lpd;->b:I

    .line 167
    .line 168
    if-eq v9, v7, :cond_b

    .line 169
    .line 170
    const/16 v7, 0x64

    .line 171
    .line 172
    if-ne v9, v7, :cond_c

    .line 173
    .line 174
    :cond_b
    invoke-static {v6}, Lcom/mr/elaris/w;->Z(Ljava/lang/String;)Z

    .line 175
    .line 176
    .line 177
    move-result v7

    .line 178
    if-eqz v7, :cond_c

    .line 179
    .line 180
    invoke-static {p0, v6}, Lcom/mr/elaris/w;->Y0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 185
    .line 186
    .line 187
    move-result v9

    .line 188
    if-lez v9, :cond_c

    .line 189
    .line 190
    move-object v6, v7

    .line 191
    :cond_c
    iget p3, p3, Lpd;->b:I

    .line 192
    .line 193
    invoke-static {p1, v6, p3}, Lcom/mr/elaris/w;->r0(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    if-nez p1, :cond_d

    .line 198
    .line 199
    :goto_7
    return v2

    .line 200
    :cond_d
    new-instance p3, Ljava/util/ArrayList;

    .line 201
    .line 202
    invoke-direct {p3}, Ljava/util/ArrayList;-><init>()V

    .line 203
    .line 204
    .line 205
    invoke-virtual {p3, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 206
    .line 207
    .line 208
    invoke-static {v3, p1, p3, p0, v8}, Lcom/mr/elaris/w;->X(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/ClassLoader;Lx2;)Z

    .line 209
    .line 210
    .line 211
    move-result p0

    .line 212
    if-eqz p0, :cond_e

    .line 213
    .line 214
    new-instance p1, Ljava/lang/StringBuilder;

    .line 215
    .line 216
    invoke-direct {p1, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    const-string p3, " duration_ms="

    .line 223
    .line 224
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    .line 227
    invoke-virtual {p1, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    const-string p3, " duration_mode="

    .line 231
    .line 232
    invoke-virtual {p1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 233
    .line 234
    .line 235
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 236
    .line 237
    .line 238
    const-string p2, " factory="

    .line 239
    .line 240
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 241
    .line 242
    .line 243
    invoke-virtual {p1, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 244
    .line 245
    .line 246
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 247
    .line 248
    .line 249
    move-result-object p1

    .line 250
    invoke-static {p1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 251
    .line 252
    .line 253
    :cond_e
    return p0

    .line 254
    :goto_8
    const-string p1, "script-ptt-send"

    .line 255
    .line 256
    invoke-static {v0, p1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 257
    .line 258
    .line 259
    return v2
.end method

.method public static L(Landroid/content/Context;Landroid/net/Uri;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    if-nez p1, :cond_0

    .line 5
    .line 6
    goto :goto_1

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Landroid/content/ContentResolver;->getPersistedUriPermissions()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    move v1, v0

    .line 16
    :goto_0
    if-eqz p0, :cond_2

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    if-ge v1, v2, :cond_2

    .line 23
    .line 24
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    check-cast v2, Landroid/content/UriPermission;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/content/UriPermission;->getUri()Landroid/net/Uri;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    if-eqz v3, :cond_1

    .line 41
    .line 42
    invoke-virtual {v2}, Landroid/content/UriPermission;->isReadPermission()Z

    .line 43
    .line 44
    .line 45
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    const/4 p0, 0x1

    .line 49
    return p0

    .line 50
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :catchall_0
    :cond_2
    :goto_1
    return v0
.end method

.method public static varargs L0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V
    .locals 4

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    const/4 v0, 0x0

    .line 4
    :goto_0
    array-length v1, p2

    .line 5
    if-ge v0, v1, :cond_5

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    aget-object v2, p2, v0

    .line 12
    .line 13
    :goto_1
    if-eqz v1, :cond_0

    .line 14
    .line 15
    const-class v3, Ljava/lang/Object;

    .line 16
    .line 17
    if-eq v1, v3, :cond_0

    .line 18
    .line 19
    :try_start_0
    invoke-virtual {v1, v2}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 20
    .line 21
    .line 22
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_2

    .line 24
    :catchall_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_1

    .line 29
    :cond_0
    const/4 v1, 0x0

    .line 30
    :goto_2
    if-nez v1, :cond_1

    .line 31
    .line 32
    goto :goto_3

    .line 33
    :cond_1
    const/4 v2, 0x1

    .line 34
    :try_start_1
    invoke-virtual {v1, v2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    if-ne v2, v3, :cond_2

    .line 44
    .line 45
    instance-of v3, p1, Ljava/lang/Number;

    .line 46
    .line 47
    if-eqz v3, :cond_2

    .line 48
    .line 49
    move-object v2, p1

    .line 50
    check-cast v2, Ljava/lang/Number;

    .line 51
    .line 52
    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->setInt(Ljava/lang/Object;I)V

    .line 57
    .line 58
    .line 59
    goto :goto_4

    .line 60
    :cond_2
    sget-object v3, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 61
    .line 62
    if-ne v2, v3, :cond_3

    .line 63
    .line 64
    instance-of v3, p1, Ljava/lang/Number;

    .line 65
    .line 66
    if-eqz v3, :cond_3

    .line 67
    .line 68
    move-object v2, p1

    .line 69
    check-cast v2, Ljava/lang/Number;

    .line 70
    .line 71
    invoke-virtual {v2}, Ljava/lang/Number;->longValue()J

    .line 72
    .line 73
    .line 74
    move-result-wide v2

    .line 75
    invoke-virtual {v1, p0, v2, v3}, Ljava/lang/reflect/Field;->setLong(Ljava/lang/Object;J)V

    .line 76
    .line 77
    .line 78
    goto :goto_4

    .line 79
    :cond_3
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    if-ne v2, v3, :cond_4

    .line 82
    .line 83
    instance-of v3, p1, Ljava/lang/Boolean;

    .line 84
    .line 85
    if-eqz v3, :cond_4

    .line 86
    .line 87
    move-object v2, p1

    .line 88
    check-cast v2, Ljava/lang/Boolean;

    .line 89
    .line 90
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    invoke-virtual {v1, p0, v2}, Ljava/lang/reflect/Field;->setBoolean(Ljava/lang/Object;Z)V

    .line 95
    .line 96
    .line 97
    goto :goto_4

    .line 98
    :cond_4
    invoke-virtual {v2}, Ljava/lang/Class;->isPrimitive()Z

    .line 99
    .line 100
    .line 101
    move-result v2

    .line 102
    if-nez v2, :cond_5

    .line 103
    .line 104
    invoke-virtual {v1, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    .line 106
    .line 107
    goto :goto_4

    .line 108
    :catchall_1
    :goto_3
    add-int/lit8 v0, v0, 0x1

    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_5
    :goto_4
    return-void
.end method

.method public static M(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)I
    .locals 4

    .line 1
    invoke-static {p1}, Lcom/mr/elaris/w;->q0(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    sget-object v1, Lcom/mr/elaris/w;->e:Ljava/util/Set;

    .line 6
    .line 7
    monitor-enter v1

    .line 8
    :try_start_0
    invoke-interface {v1, v0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    const/4 v3, 0x0

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    monitor-exit v1

    .line 16
    return v3

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    invoke-interface {v1, v0}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    const/4 v1, 0x1

    .line 24
    :try_start_1
    invoke-virtual {p1, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 25
    .line 26
    .line 27
    new-instance v2, Lle;

    .line 28
    .line 29
    invoke-direct {v2, p0}, Lle;-><init>(Ljava/lang/ClassLoader;)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 33
    .line 34
    .line 35
    return v1

    .line 36
    :catchall_1
    move-exception p0

    .line 37
    sget-object v2, Lcom/mr/elaris/w;->e:Ljava/util/Set;

    .line 38
    .line 39
    monitor-enter v2

    .line 40
    :try_start_2
    invoke-interface {v2, v0}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 41
    .line 42
    .line 43
    monitor-exit v2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 44
    new-instance v0, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    const-string v1, "voice forward method hook failed method="

    .line 47
    .line 48
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    const-string p1, " reason="

    .line 59
    .line 60
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string p1, ": "

    .line 75
    .line 76
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object p0

    .line 83
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object p0

    .line 87
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p0

    .line 94
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    return v3

    .line 98
    :catchall_2
    move-exception p0

    .line 99
    :try_start_3
    monitor-exit v2
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 100
    throw p0

    .line 101
    :goto_0
    :try_start_4
    monitor-exit v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 102
    throw p0
.end method

.method public static varargs M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    array-length v2, p2

    .line 4
    if-ge v1, v2, :cond_6

    .line 5
    .line 6
    aget-object v2, p2, v1

    .line 7
    .line 8
    filled-new-array {v2}, [Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    invoke-static {p0, p1, v3}, Lcom/mr/elaris/w;->L0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance v3, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v4, "set"

    .line 18
    .line 19
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const-string v4, "m"

    .line 23
    .line 24
    invoke-virtual {v2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    const/4 v5, 0x1

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 32
    .line 33
    .line 34
    move-result v4

    .line 35
    if-le v4, v5, :cond_0

    .line 36
    .line 37
    invoke-virtual {v2, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    :cond_0
    invoke-static {v2}, Lcom/mr/elaris/w;->Z0(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v3

    .line 56
    invoke-virtual {v3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 57
    .line 58
    .line 59
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 60
    move v4, v0

    .line 61
    :goto_1
    array-length v6, v3

    .line 62
    if-ge v4, v6, :cond_5

    .line 63
    .line 64
    aget-object v6, v3, v4

    .line 65
    .line 66
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object v7

    .line 70
    invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v7

    .line 74
    if-eqz v7, :cond_4

    .line 75
    .line 76
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 77
    .line 78
    .line 79
    move-result-object v7

    .line 80
    array-length v7, v7

    .line 81
    if-eq v7, v5, :cond_1

    .line 82
    .line 83
    goto :goto_2

    .line 84
    :cond_1
    :try_start_1
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    aget-object v7, v7, v0

    .line 89
    .line 90
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 91
    .line 92
    if-ne v7, v8, :cond_2

    .line 93
    .line 94
    instance-of v8, p1, Ljava/lang/Number;

    .line 95
    .line 96
    if-eqz v8, :cond_2

    .line 97
    .line 98
    move-object v7, p1

    .line 99
    check-cast v7, Ljava/lang/Number;

    .line 100
    .line 101
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 102
    .line 103
    .line 104
    move-result v7

    .line 105
    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 106
    .line 107
    .line 108
    move-result-object v7

    .line 109
    filled-new-array {v7}, [Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v7

    .line 113
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 114
    .line 115
    .line 116
    goto :goto_3

    .line 117
    :cond_2
    sget-object v8, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 118
    .line 119
    if-ne v7, v8, :cond_3

    .line 120
    .line 121
    instance-of v8, p1, Ljava/lang/Boolean;

    .line 122
    .line 123
    if-eqz v8, :cond_3

    .line 124
    .line 125
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    .line 131
    .line 132
    goto :goto_3

    .line 133
    :cond_3
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 134
    .line 135
    .line 136
    move-result v8

    .line 137
    if-nez v8, :cond_4

    .line 138
    .line 139
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    move-result v7

    .line 143
    if-eqz v7, :cond_4

    .line 144
    .line 145
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v7

    .line 149
    invoke-virtual {v6, p0, v7}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 150
    .line 151
    .line 152
    goto :goto_3

    .line 153
    :catchall_0
    :cond_4
    :goto_2
    add-int/lit8 v4, v4, 0x1

    .line 154
    .line 155
    goto :goto_1

    .line 156
    :catchall_1
    :cond_5
    :goto_3
    add-int/lit8 v1, v1, 0x1

    .line 157
    .line 158
    goto/16 :goto_0

    .line 159
    .line 160
    :cond_6
    return-void
.end method

.method public static N(Ljava/lang/ClassLoader;Ljava/lang/Class;)Z
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p1}, Lcom/mr/elaris/w;->z(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 6
    invoke-static {p1}, Lcom/mr/elaris/w;->q0(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    sget-object v2, Lcom/mr/elaris/w;->d:Ljava/util/Set;

    .line 11
    .line 12
    monitor-enter v2

    .line 13
    :try_start_1
    invoke-interface {v2, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v3

    .line 17
    const/4 v4, 0x1

    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    monitor-exit v2

    .line 21
    return v4

    .line 22
    :catchall_0
    move-exception p0

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-interface {v2, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    :try_start_2
    invoke-virtual {p1, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 29
    .line 30
    .line 31
    new-instance v2, Lqe;

    .line 32
    .line 33
    invoke-direct {v2, p0, p1}, Lqe;-><init>(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)V

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v2}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 37
    .line 38
    .line 39
    return v4

    .line 40
    :catchall_1
    sget-object p0, Lcom/mr/elaris/w;->d:Ljava/util/Set;

    .line 41
    .line 42
    monitor-enter p0

    .line 43
    :try_start_3
    invoke-interface {p0, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 44
    .line 45
    .line 46
    monitor-exit p0

    .line 47
    return v0

    .line 48
    :catchall_2
    move-exception p1

    .line 49
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 50
    throw p1

    .line 51
    :goto_0
    :try_start_4
    monitor-exit v2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 52
    throw p0

    .line 53
    :catchall_3
    return v0
.end method

.method public static N0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lu9;->t(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_2

    .line 6
    .line 7
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-static {p1}, Lcom/mr/elaris/w;->Y(Ljava/lang/String;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const-string v0, ".bin"

    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 23
    .line 24
    .line 25
    move-result p0

    .line 26
    if-nez p0, :cond_1

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const-string p0, "amr"

    .line 30
    .line 31
    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    if-nez p0, :cond_3

    .line 36
    .line 37
    const-string p0, "silk"

    .line 38
    .line 39
    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 40
    .line 41
    .line 42
    move-result p0

    .line 43
    if-nez p0, :cond_3

    .line 44
    .line 45
    const-string p0, "ptt"

    .line 46
    .line 47
    invoke-virtual {p1, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-nez p0, :cond_3

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    invoke-static {p0}, Lu9;->s(Ljava/lang/String;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-nez p0, :cond_4

    .line 59
    .line 60
    invoke-static {p1}, Lcom/mr/elaris/w;->Y(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_3

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_3
    :goto_0
    const/4 p0, 0x0

    .line 68
    return p0

    .line 69
    :cond_4
    :goto_1
    const/4 p0, 0x1

    .line 70
    return p0
.end method

.method public static O(Landroid/app/Activity;)Lw6;
    .locals 8

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/w;->H0(Landroid/content/Context;)Lw6;

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
    invoke-static {p0}, Lcom/mr/elaris/w;->G0(Landroid/content/Context;)Ljava/io/File;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    new-instance v1, Lw6;

    .line 15
    .line 16
    const/4 v5, 0x0

    .line 17
    const/4 v6, 0x0

    .line 18
    const/4 v3, 0x0

    .line 19
    const/4 v4, 0x0

    .line 20
    invoke-direct/range {v1 .. v6}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 21
    .line 22
    .line 23
    return-object v1

    .line 24
    :cond_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-eqz v3, :cond_2

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 31
    .line 32
    .line 33
    move-result v0

    .line 34
    if-eqz v0, :cond_2

    .line 35
    .line 36
    invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/io/File;->canRead()Z

    .line 43
    .line 44
    .line 45
    move-result v0

    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    new-instance v2, Lw6;

    .line 49
    .line 50
    const/4 v6, 0x0

    .line 51
    const/4 v7, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    invoke-direct/range {v2 .. v7}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 55
    .line 56
    .line 57
    return-object v2

    .line 58
    :cond_2
    invoke-static {p0}, Lcom/mr/elaris/w;->G0(Landroid/content/Context;)Ljava/io/File;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    if-eqz p0, :cond_4

    .line 63
    .line 64
    :cond_3
    :goto_0
    move-object v2, p0

    .line 65
    goto :goto_1

    .line 66
    :cond_4
    sget-object p0, Landroid/os/Environment;->DIRECTORY_DOWNLOADS:Ljava/lang/String;

    .line 67
    .line 68
    invoke-static {p0}, Landroid/os/Environment;->getExternalStoragePublicDirectory(Ljava/lang/String;)Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    new-instance v0, Ljava/io/File;

    .line 73
    .line 74
    const-string v1, "Elaris/Voice"

    .line 75
    .line 76
    invoke-direct {v0, p0, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Ljava/io/File;->exists()Z

    .line 80
    .line 81
    .line 82
    move-result v1

    .line 83
    if-eqz v1, :cond_5

    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/io/File;->isDirectory()Z

    .line 86
    .line 87
    .line 88
    move-result v1

    .line 89
    if-eqz v1, :cond_5

    .line 90
    .line 91
    move-object v2, v0

    .line 92
    goto :goto_1

    .line 93
    :cond_5
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 94
    .line 95
    .line 96
    move-result v0

    .line 97
    if-eqz v0, :cond_6

    .line 98
    .line 99
    invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_6

    .line 104
    .line 105
    goto :goto_0

    .line 106
    :cond_6
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    if-nez p0, :cond_3

    .line 111
    .line 112
    new-instance p0, Ljava/io/File;

    .line 113
    .line 114
    const-string v0, "/"

    .line 115
    .line 116
    invoke-direct {p0, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    goto :goto_0

    .line 120
    :goto_1
    new-instance v1, Lw6;

    .line 121
    .line 122
    const/4 v5, 0x0

    .line 123
    const/4 v6, 0x0

    .line 124
    const/4 v3, 0x0

    .line 125
    const/4 v4, 0x0

    .line 126
    invoke-direct/range {v1 .. v6}, Lw6;-><init>(Ljava/io/File;Landroid/net/Uri;Landroid/net/Uri;Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 127
    .line 128
    .line 129
    return-object v1
.end method

.method public static O0(Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;)V
    .locals 17

    move-object/from16 v2, p0

    if-eqz v2, :cond_2

    .line 1
    invoke-static {v2}, Lcom/mr/elaris/w;->O(Landroid/app/Activity;)Lw6;

    move-result-object v0

    filled-new-array {v0}, [Lw6;

    move-result-object v7

    const/4 v6, 0x0

    .line 2
    filled-new-array {v6}, [I

    move-result-object v8

    .line 3
    new-instance v1, Landroid/app/Dialog;

    invoke-direct {v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-static {v1}, Lu9;->d(Landroid/app/Dialog;)V

    const/4 v9, 0x1

    .line 5
    :try_start_0
    invoke-virtual {v1, v9}, Landroid/app/Dialog;->requestWindowFeature(I)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    :catchall_0
    new-instance v10, Landroid/widget/LinearLayout;

    invoke-direct {v10, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 7
    invoke-virtual {v10, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 8
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 9
    invoke-virtual {v10, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    const/high16 v11, 0x41400000    # 12.0f

    .line 10
    invoke-static {v2, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v0

    invoke-static {v2, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v3

    .line 11
    invoke-static {v2, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v4

    const/high16 v12, 0x41200000    # 10.0f

    invoke-static {v2, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v5

    .line 12
    invoke-virtual {v10, v0, v3, v4, v5}, Landroid/view/View;->setPadding(IIII)V

    .line 13
    invoke-static {v2}, Lcom/mr/elaris/w;->l0(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v0

    invoke-virtual {v10, v0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 14
    new-instance v0, Lse;

    const/4 v5, 0x0

    move-object/from16 v3, p1

    move-object/from16 v4, p2

    invoke-direct/range {v0 .. v5}, Lse;-><init>(Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;I)V

    move-object v13, v0

    new-instance v0, Lse;

    const/4 v5, 0x1

    move-object/from16 v2, p0

    invoke-direct/range {v0 .. v5}, Lse;-><init>(Landroid/app/Dialog;Landroid/app/Activity;Ljava/lang/ClassLoader;Lpd;I)V

    .line 15
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 16
    invoke-virtual {v3, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    const/16 v4, 0x10

    .line 17
    invoke-virtual {v3, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 18
    invoke-virtual {v3, v6, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 19
    new-instance v5, Landroid/widget/ImageView;

    invoke-direct {v5, v2}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 20
    :try_start_1
    new-instance v14, Lm9;

    const v15, 0x3fd70a3d    # 1.68f

    invoke-direct {v14, v15}, Lm9;-><init>(F)V

    invoke-virtual {v5, v14}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    :catchall_1
    sget-object v14, Landroid/widget/ImageView$ScaleType;->CENTER_INSIDE:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5, v14}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 22
    invoke-virtual {v5, v6, v6, v6, v6}, Landroid/view/View;->setPadding(IIII)V

    .line 23
    invoke-static {v2}, Lcom/mr/elaris/w;->k0(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v14

    invoke-virtual {v5, v14}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 24
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v15, 0x42100000    # 36.0f

    .line 25
    invoke-static {v2, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v11

    invoke-static {v2, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v15

    invoke-direct {v14, v11, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 26
    invoke-static {v2, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v11

    iput v11, v14, Landroid/widget/LinearLayout$LayoutParams;->rightMargin:I

    .line 27
    invoke-virtual {v3, v5, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 28
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 29
    invoke-virtual {v5, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 30
    invoke-virtual {v5, v4}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 31
    new-instance v11, Landroid/widget/TextView;

    invoke-direct {v11, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 32
    const-string v14, "\u6587\u4ef6\u9009\u62e9"

    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    invoke-static {v2}, Lu9;->G(Landroid/content/Context;)I

    move-result v14

    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v14, 0x41880000    # 17.0f

    .line 34
    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTextSize(F)V

    .line 35
    sget-object v14, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    invoke-virtual {v11, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 36
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 37
    sget-object v15, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 38
    new-instance v12, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    const/4 v6, -0x2

    invoke-direct {v12, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v11, v12}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 39
    new-instance v11, Landroid/widget/TextView;

    invoke-direct {v11, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 40
    const-string v12, "\u53d1\u9001\u4e3a QQ \u8bed\u97f3\u4f1a\u538b\u7f29\uff0c\u539f\u97f3\u8d28\u8bf7\u53d1\u6587\u4ef6"

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    invoke-static {v2}, Lu9;->E(Landroid/content/Context;)I

    move-result v12

    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v12, 0x41300000    # 11.0f

    .line 42
    invoke-virtual {v11, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 43
    invoke-virtual {v11, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 44
    invoke-virtual {v11, v15}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/high16 v15, 0x40400000    # 3.0f

    .line 45
    invoke-static {v2, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v15

    const/4 v9, 0x0

    invoke-virtual {v11, v9, v15, v9, v9}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 46
    new-instance v15, Landroid/widget/LinearLayout$LayoutParams;

    invoke-direct {v15, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v5, v11, v15}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    new-instance v11, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v11, v9, v6, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    invoke-virtual {v3, v5, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 48
    new-instance v5, Landroid/widget/TextView;

    invoke-direct {v5, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 49
    const-string v9, "\u6587\u5b57\u8f6c\u8bed\u97f3"

    invoke-virtual {v5, v9}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 50
    invoke-static {v2}, Lu9;->c(Landroid/content/Context;)I

    move-result v11

    .line 51
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 52
    invoke-virtual {v5, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 53
    invoke-virtual {v5, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    const/16 v11, 0x11

    .line 54
    invoke-virtual {v5, v11}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v15, 0x1

    .line 55
    invoke-virtual {v5, v15}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 56
    invoke-static {v2}, Lcom/mr/elaris/w;->i0(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v15

    invoke-virtual {v5, v15}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 57
    invoke-virtual {v5, v13}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 58
    invoke-virtual {v5, v9}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 59
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v13, 0x42900000    # 72.0f

    .line 60
    invoke-static {v2, v13}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v13

    const/high16 v15, 0x41f00000    # 30.0f

    invoke-static {v2, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v4

    invoke-direct {v9, v13, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x40c00000    # 6.0f

    .line 61
    invoke-static {v2, v4}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v4

    iput v4, v9, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 62
    invoke-virtual {v3, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 63
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 64
    const-string v5, "\u6388\u6743"

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    invoke-static {v2}, Lu9;->c(Landroid/content/Context;)I

    move-result v5

    .line 66
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 67
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 68
    invoke-virtual {v4, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 69
    invoke-virtual {v4, v11}, Landroid/widget/TextView;->setGravity(I)V

    const/4 v5, 0x1

    .line 70
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 71
    invoke-static {v2}, Lcom/mr/elaris/w;->i0(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v5

    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 72
    invoke-virtual {v4, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 73
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v5, 0x42400000    # 48.0f

    .line 74
    invoke-static {v2, v5}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v5

    invoke-static {v2, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v9

    invoke-direct {v0, v5, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v5, 0x41000000    # 8.0f

    .line 75
    invoke-static {v2, v5}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v5

    iput v5, v0, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 76
    invoke-virtual {v3, v4, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 77
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v4, -0x1

    invoke-direct {v0, v4, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v10, v3, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 78
    new-instance v0, Landroid/widget/ScrollView;

    invoke-direct {v0, v2}, Landroid/widget/ScrollView;-><init>(Landroid/content/Context;)V

    const/4 v3, 0x2

    .line 79
    invoke-virtual {v0, v3}, Landroid/view/View;->setOverScrollMode(I)V

    const/4 v9, 0x0

    .line 80
    invoke-virtual {v0, v9}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

    const/4 v5, 0x1

    .line 81
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 82
    invoke-virtual {v0, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 83
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 84
    invoke-virtual {v3, v5}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 85
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 86
    invoke-virtual {v3, v5}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    .line 87
    new-instance v4, Landroid/widget/TextView;

    invoke-direct {v4, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 88
    invoke-static {v2}, Lu9;->E(Landroid/content/Context;)I

    move-result v9

    invoke-virtual {v4, v9}, Landroid/widget/TextView;->setTextColor(I)V

    .line 89
    invoke-virtual {v4, v12}, Landroid/widget/TextView;->setTextSize(F)V

    .line 90
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 91
    sget-object v5, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/16 v5, 0x10

    .line 92
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setGravity(I)V

    const/high16 v5, 0x41200000    # 10.0f

    .line 93
    invoke-static {v2, v5}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v9

    invoke-static {v2, v5}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v12

    const/4 v5, 0x0

    invoke-virtual {v4, v9, v5, v12, v5}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 94
    invoke-static {v2}, Lu9;->y(Landroid/content/Context;)I

    move-result v5

    const/high16 v9, 0x41400000    # 12.0f

    .line 95
    invoke-static {v2, v9}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v9

    .line 96
    invoke-static {v2}, Lu9;->o(Landroid/content/Context;)Z

    move-result v12

    const v16, -0xb3aea2

    if-eqz v12, :cond_0

    move/from16 v12, v16

    :goto_0
    const/high16 v13, 0x3f800000    # 1.0f

    goto :goto_1

    :cond_0
    const v12, -0x17130e

    goto :goto_0

    .line 97
    :goto_1
    invoke-static {v2, v13}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v11

    .line 98
    invoke-static {v5, v9, v12, v11}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v5

    .line 99
    invoke-virtual {v4, v5}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 100
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    .line 101
    invoke-static {v2, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v9

    const/4 v11, -0x1

    invoke-direct {v5, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 102
    invoke-virtual {v3, v4, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 103
    new-instance v5, Landroid/widget/LinearLayout;

    invoke-direct {v5, v2}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v9, 0x1

    .line 104
    invoke-virtual {v5, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 105
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->setClipChildren(Z)V

    .line 106
    invoke-virtual {v5, v9}, Landroid/view/ViewGroup;->setClipToPadding(Z)V

    const/high16 v9, 0x40a00000    # 5.0f

    .line 107
    invoke-static {v2, v9}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v11

    invoke-static {v2, v9}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v12

    .line 108
    invoke-static {v2, v9}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v13

    invoke-static {v2, v9}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v9

    .line 109
    invoke-virtual {v5, v11, v12, v13, v9}, Landroid/view/View;->setPadding(IIII)V

    .line 110
    invoke-static {v2}, Lu9;->y(Landroid/content/Context;)I

    move-result v9

    const/high16 v11, 0x41800000    # 16.0f

    .line 111
    invoke-static {v2, v11}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v11

    .line 112
    invoke-static {v2}, Lu9;->o(Landroid/content/Context;)Z

    move-result v12

    if-eqz v12, :cond_1

    move/from16 v13, v16

    :goto_2
    const/high16 v12, 0x3f800000    # 1.0f

    goto :goto_3

    :cond_1
    const v13, -0x17130e

    goto :goto_2

    .line 113
    :goto_3
    invoke-static {v2, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v12

    .line 114
    invoke-static {v9, v11, v13, v12}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    move-result-object v9

    .line 115
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 116
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v11, -0x1

    invoke-direct {v9, v11, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v12, 0x41100000    # 9.0f

    .line 117
    invoke-static {v2, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v13

    iput v13, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 118
    invoke-virtual {v3, v5, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 119
    new-instance v9, Landroid/widget/FrameLayout$LayoutParams;

    invoke-direct {v9, v11, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v3, v9}, Landroid/widget/ScrollView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 120
    invoke-virtual {v5, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 121
    invoke-static {v2}, Lu9;->z(Landroid/app/Activity;)I

    move-result v3

    .line 122
    new-instance v9, Landroid/widget/LinearLayout$LayoutParams;

    .line 123
    invoke-static {v2, v15}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v13

    invoke-static {v2, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v15

    add-int/2addr v15, v13

    add-int/2addr v15, v3

    invoke-direct {v9, v11, v15}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    const/high16 v3, 0x41200000    # 10.0f

    .line 124
    invoke-static {v2, v3}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v3

    iput v3, v9, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 125
    invoke-virtual {v10, v0, v9}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 126
    new-instance v0, Landroid/widget/TextView;

    invoke-direct {v0, v2}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 127
    const-string v3, "\u53d6\u6d88"

    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 128
    invoke-static {v2}, Lu9;->c(Landroid/content/Context;)I

    move-result v3

    .line 129
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/high16 v3, 0x41500000    # 13.0f

    .line 130
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setTextSize(F)V

    const/16 v3, 0x11

    .line 131
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 132
    invoke-virtual {v0, v14}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 133
    invoke-static {v2}, Lcom/mr/elaris/w;->i0(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 134
    new-instance v3, Lte;

    invoke-direct {v3, v2, v7, v1}, Lte;-><init>(Landroid/app/Activity;[Lw6;Landroid/app/Dialog;)V

    invoke-virtual {v0, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 135
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    const/high16 v9, 0x42080000    # 34.0f

    .line 136
    invoke-static {v2, v9}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v9

    const/4 v11, -0x1

    invoke-direct {v3, v11, v9}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 137
    invoke-static {v2, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    move-result v9

    iput v9, v3, Landroid/widget/LinearLayout$LayoutParams;->topMargin:I

    .line 138
    invoke-virtual {v10, v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 139
    new-instance v0, Lme;

    const/4 v15, 0x1

    invoke-direct {v0, v2, v7, v15}, Lme;-><init>(Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 140
    invoke-virtual {v1, v10}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    move-object v0, v2

    move-object v2, v1

    move-object v1, v0

    move-object v0, v8

    move v8, v6

    move-object v6, v0

    move-object/from16 v0, p2

    move-object v3, v5

    move-object/from16 v5, p1

    .line 141
    invoke-static/range {v0 .. v7}, Lcom/mr/elaris/w;->E0(Lpd;Landroid/app/Activity;Landroid/app/Dialog;Landroid/widget/LinearLayout;Landroid/widget/TextView;Ljava/lang/ClassLoader;[I[Lw6;)V

    move-object v1, v2

    .line 142
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 143
    :try_start_2
    invoke-virtual {v1}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    if-eqz v0, :cond_2

    const v1, 0x106000d

    .line 144
    invoke-virtual {v0, v1}, Landroid/view/Window;->setBackgroundDrawableResource(I)V

    .line 145
    invoke-virtual {v0}, Landroid/view/Window;->getAttributes()Landroid/view/WindowManager$LayoutParams;

    move-result-object v1

    .line 146
    invoke-static/range {p0 .. p0}, Lu9;->A(Landroid/app/Activity;)I

    move-result v2

    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->width:I

    .line 147
    iput v8, v1, Landroid/view/WindowManager$LayoutParams;->height:I

    const v2, 0x3ecccccd    # 0.4f

    .line 148
    iput v2, v1, Landroid/view/WindowManager$LayoutParams;->dimAmount:F

    .line 149
    invoke-virtual {v0, v1}, Landroid/view/Window;->setAttributes(Landroid/view/WindowManager$LayoutParams;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    :catchall_2
    :cond_2
    return-void
.end method

.method public static declared-synchronized P(Ljava/lang/ClassLoader;)V
    .locals 4

    .line 1
    const-string v0, "voice message action hooks installed count="

    .line 2
    .line 3
    const-class v1, Lcom/mr/elaris/w;

    .line 4
    .line 5
    monitor-enter v1

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    monitor-exit v1

    .line 9
    return-void

    .line 10
    :cond_0
    :try_start_0
    sget-boolean v2, Lcom/mr/elaris/w;->g:Z

    .line 11
    .line 12
    if-eqz v2, :cond_1

    .line 13
    .line 14
    sget-boolean v2, Lcom/mr/elaris/w;->h:Z

    .line 15
    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    sget-boolean v2, Lcom/mr/elaris/w;->i:Z

    .line 19
    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    sget-boolean v2, Lcom/mr/elaris/w;->j:Z

    .line 23
    .line 24
    if-eqz v2, :cond_1

    .line 25
    .line 26
    sget-boolean v2, Lcom/mr/elaris/w;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    monitor-exit v1

    .line 31
    return-void

    .line 32
    :catchall_0
    move-exception p0

    .line 33
    goto :goto_2

    .line 34
    :cond_1
    :try_start_1
    sget-boolean v2, Lcom/mr/elaris/w;->g:Z

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    invoke-static {p0}, Lcom/mr/elaris/w;->U(Ljava/lang/ClassLoader;)I

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-lez v2, :cond_3

    .line 43
    .line 44
    const/4 v3, 0x1

    .line 45
    sput-boolean v3, Lcom/mr/elaris/w;->g:Z

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_2
    const/4 v2, 0x0

    .line 49
    :cond_3
    :goto_0
    sget-boolean v3, Lcom/mr/elaris/w;->j:Z

    .line 50
    .line 51
    if-nez v3, :cond_4

    .line 52
    .line 53
    invoke-static {p0}, Lcom/mr/elaris/w;->V(Ljava/lang/ClassLoader;)I

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    add-int/2addr v2, v3

    .line 58
    :cond_4
    sget-boolean v3, Lcom/mr/elaris/w;->h:Z

    .line 59
    .line 60
    if-nez v3, :cond_5

    .line 61
    .line 62
    invoke-static {p0}, Lcom/mr/elaris/w;->R(Ljava/lang/ClassLoader;)I

    .line 63
    .line 64
    .line 65
    move-result v3

    .line 66
    add-int/2addr v2, v3

    .line 67
    :cond_5
    sget-boolean v3, Lcom/mr/elaris/w;->i:Z

    .line 68
    .line 69
    if-nez v3, :cond_6

    .line 70
    .line 71
    invoke-static {p0}, Lcom/mr/elaris/w;->Q(Ljava/lang/ClassLoader;)I

    .line 72
    .line 73
    .line 74
    move-result p0

    .line 75
    add-int/2addr v2, p0

    .line 76
    :cond_6
    sget-boolean p0, Lcom/mr/elaris/w;->k:Z

    .line 77
    .line 78
    if-nez p0, :cond_7

    .line 79
    .line 80
    invoke-static {}, Lcom/mr/elaris/w;->S()I

    .line 81
    .line 82
    .line 83
    move-result p0

    .line 84
    add-int/2addr v2, p0

    .line 85
    :cond_7
    if-lez v2, :cond_8

    .line 86
    .line 87
    new-instance p0, Ljava/lang/StringBuilder;

    .line 88
    .line 89
    invoke-direct {p0, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    .line 97
    .line 98
    move-result-object p0

    .line 99
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_8
    const-string p0, "voice message action hooks unavailable"

    .line 104
    .line 105
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 106
    .line 107
    .line 108
    :goto_1
    monitor-exit v1

    .line 109
    return-void

    .line 110
    :goto_2
    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 111
    throw p0
.end method

.method public static P0(Ljava/lang/Object;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    const-string v1, "null"

    .line 15
    .line 16
    invoke-virtual {v1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_1
    return-object p0
.end method

.method public static Q(Ljava/lang/ClassLoader;)I
    .locals 8

    .line 1
    const-string v0, ": "

    .line 2
    .line 3
    const-string v1, "local voice entry target hook installed class="

    .line 4
    .line 5
    const-string v2, "local voice entry target show hook failed: "

    .line 6
    .line 7
    sget-boolean v3, Lcom/mr/elaris/w;->i:Z

    .line 8
    .line 9
    const/4 v4, 0x0

    .line 10
    if-eqz v3, :cond_0

    .line 11
    .line 12
    return v4

    .line 13
    :cond_0
    :try_start_0
    const-string v3, "com.tencent.qqnt.aio.activity.AIODelegate"

    .line 14
    .line 15
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    if-nez p0, :cond_1

    .line 20
    .line 21
    const-string p0, "local voice entry target hook skipped reason=AIODelegate missing"

    .line 22
    .line 23
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    .line 25
    .line 26
    return v4

    .line 27
    :catchall_0
    move-exception p0

    .line 28
    goto :goto_1

    .line 29
    :cond_1
    const/4 v3, 0x1

    .line 30
    :try_start_1
    const-string v5, "show"

    .line 31
    .line 32
    const/4 v6, 0x0

    .line 33
    invoke-virtual {p0, v5, v6}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 34
    .line 35
    .line 36
    move-result-object v5

    .line 37
    invoke-virtual {v5, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 38
    .line 39
    .line 40
    new-instance v6, Lke;

    .line 41
    .line 42
    const/16 v7, 0x28

    .line 43
    .line 44
    invoke-direct {v6, v7}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v5, v6}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 48
    .line 49
    .line 50
    move v2, v3

    .line 51
    goto :goto_0

    .line 52
    :catchall_1
    move-exception v5

    .line 53
    :try_start_2
    new-instance v6, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    invoke-direct {v6, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v2

    .line 66
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v2

    .line 76
    invoke-static {v2}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v2

    .line 80
    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v2

    .line 87
    invoke-static {v2}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    move v2, v4

    .line 91
    :goto_0
    if-lez v2, :cond_2

    .line 92
    .line 93
    sput-boolean v3, Lcom/mr/elaris/w;->i:Z

    .line 94
    .line 95
    new-instance v3, Ljava/lang/StringBuilder;

    .line 96
    .line 97
    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object p0

    .line 104
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    const-string p0, " count="

    .line 108
    .line 109
    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object p0

    .line 119
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 120
    .line 121
    .line 122
    :cond_2
    return v2

    .line 123
    :goto_1
    new-instance v1, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    const-string v2, "local voice entry target hook failed reason="

    .line 126
    .line 127
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v2

    .line 138
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    return v4
.end method

.method public static Q0(Ljava/lang/Object;)Lpd;
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
    const-string v1, "peerUid"

    .line 6
    .line 7
    const-string v2, "a"

    .line 8
    .line 9
    const-string v3, "uin"

    .line 10
    .line 11
    const-string v4, "uid"

    .line 12
    .line 13
    const-string v5, "peerUin"

    .line 14
    .line 15
    filled-new-array {v3, v4, v5, v1, v2}, [Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v1

    .line 23
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    return-object v0

    .line 30
    :cond_1
    const-string v0, "type"

    .line 31
    .line 32
    const-string v2, "b"

    .line 33
    .line 34
    const-string v3, "uinType"

    .line 35
    .line 36
    const-string v4, "uintype"

    .line 37
    .line 38
    filled-new-array {v3, v4, v0, v2}, [Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    const/4 v0, -0x1

    .line 47
    invoke-static {v0, p0}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    new-instance v0, Lpd;

    .line 52
    .line 53
    invoke-static {p0}, Lcom/mr/elaris/w;->i(I)I

    .line 54
    .line 55
    .line 56
    move-result p0

    .line 57
    invoke-direct {v0, v1, p0}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 58
    .line 59
    .line 60
    return-object v0
.end method

.method public static R(Ljava/lang/ClassLoader;)I
    .locals 8

    .line 1
    sget-boolean v0, Lcom/mr/elaris/w;->h:Z

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    :try_start_0
    const-string v0, "com.tencent.mobileqq.forward.ForwardBaseOption"

    .line 8
    .line 9
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v0, :cond_4

    .line 15
    .line 16
    :try_start_1
    const-string v0, "com.tencent.mobileqq.activity.DirectForwardActivity"

    .line 17
    .line 18
    invoke-static {v0, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    :catchall_0
    :cond_1
    move-object v0, v2

    .line 25
    goto :goto_1

    .line 26
    :cond_2
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    move v3, v1

    .line 31
    :goto_0
    array-length v4, v0

    .line 32
    if-ge v3, v4, :cond_1

    .line 33
    .line 34
    aget-object v4, v0, v3

    .line 35
    .line 36
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    if-eqz v4, :cond_3

    .line 41
    .line 42
    invoke-virtual {v4}, Ljava/lang/Class;->getModifiers()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    if-eqz v5, :cond_3

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v5

    .line 56
    const-string v6, "android."

    .line 57
    .line 58
    invoke-virtual {v5, v6}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    if-nez v5, :cond_3

    .line 63
    .line 64
    move-object v0, v4

    .line 65
    goto :goto_1

    .line 66
    :cond_3
    add-int/lit8 v3, v3, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_4
    :goto_1
    if-nez v0, :cond_5

    .line 70
    .line 71
    :try_start_2
    const-string p0, "voice forward hook skipped reason=ForwardBaseOption missing"

    .line 72
    .line 73
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return v1

    .line 77
    :catchall_1
    move-exception p0

    .line 78
    goto/16 :goto_7

    .line 79
    .line 80
    :cond_5
    const-string v3, "buildConfirmDialog"
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 81
    .line 82
    move-object v4, v0

    .line 83
    :goto_2
    sget-object v5, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 84
    .line 85
    if-eqz v4, :cond_7

    .line 86
    .line 87
    :try_start_3
    const-class v6, Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 88
    .line 89
    if-eq v4, v6, :cond_7

    .line 90
    .line 91
    :try_start_4
    invoke-virtual {v4, v3, v2}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 92
    .line 93
    .line 94
    move-result-object v6

    .line 95
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 96
    .line 97
    .line 98
    move-result-object v7

    .line 99
    array-length v7, v7

    .line 100
    if-nez v7, :cond_6

    .line 101
    .line 102
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 103
    .line 104
    .line 105
    move-result-object v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 106
    if-ne v7, v5, :cond_6

    .line 107
    .line 108
    move-object v2, v6

    .line 109
    goto :goto_3

    .line 110
    :catchall_2
    :cond_6
    :try_start_5
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v4

    .line 114
    goto :goto_2

    .line 115
    :cond_7
    :goto_3
    if-eqz v2, :cond_8

    .line 116
    .line 117
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->M(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    goto :goto_6

    .line 122
    :cond_8
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    move v3, v1

    .line 127
    move v4, v3

    .line 128
    :goto_4
    array-length v6, v2

    .line 129
    if-ge v4, v6, :cond_b

    .line 130
    .line 131
    aget-object v6, v2, v4

    .line 132
    .line 133
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v7

    .line 137
    array-length v7, v7

    .line 138
    if-nez v7, :cond_c

    .line 139
    .line 140
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v7

    .line 144
    if-ne v7, v5, :cond_c

    .line 145
    .line 146
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 147
    .line 148
    .line 149
    move-result v7

    .line 150
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 151
    .line 152
    .line 153
    move-result v7

    .line 154
    if-eqz v7, :cond_9

    .line 155
    .line 156
    goto :goto_5

    .line 157
    :cond_9
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 158
    .line 159
    .line 160
    move-result v7

    .line 161
    invoke-static {v7}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 162
    .line 163
    .line 164
    move-result v7

    .line 165
    if-nez v7, :cond_a

    .line 166
    .line 167
    if-lez v3, :cond_a

    .line 168
    .line 169
    goto :goto_5

    .line 170
    :cond_a
    invoke-static {p0, v6}, Lcom/mr/elaris/w;->M(Ljava/lang/ClassLoader;Ljava/lang/reflect/Method;)I

    .line 171
    .line 172
    .line 173
    move-result v6

    .line 174
    add-int/2addr v3, v6

    .line 175
    const/4 v6, 0x2

    .line 176
    if-lt v3, v6, :cond_c

    .line 177
    .line 178
    :cond_b
    move p0, v3

    .line 179
    goto :goto_6

    .line 180
    :cond_c
    :goto_5
    add-int/lit8 v4, v4, 0x1

    .line 181
    .line 182
    goto :goto_4

    .line 183
    :goto_6
    if-lez p0, :cond_d

    .line 184
    .line 185
    const/4 v2, 0x1

    .line 186
    sput-boolean v2, Lcom/mr/elaris/w;->h:Z

    .line 187
    .line 188
    new-instance v2, Ljava/lang/StringBuilder;

    .line 189
    .line 190
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 191
    .line 192
    .line 193
    const-string v3, "voice forward confirm hooked class="

    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v0

    .line 202
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    const-string v0, " count="

    .line 206
    .line 207
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    .line 218
    .line 219
    .line 220
    :cond_d
    return p0

    .line 221
    :goto_7
    new-instance v0, Ljava/lang/StringBuilder;

    .line 222
    .line 223
    const-string v2, "voice forward hook failed reason="

    .line 224
    .line 225
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 226
    .line 227
    .line 228
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v2

    .line 232
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v2

    .line 236
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 237
    .line 238
    .line 239
    const-string v2, ": "

    .line 240
    .line 241
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 249
    .line 250
    .line 251
    move-result-object p0

    .line 252
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    .line 257
    .line 258
    move-result-object p0

    .line 259
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 260
    .line 261
    .line 262
    return v1
.end method

.method public static R0(Landroid/app/Activity;)Lpd;
    .locals 8

    .line 1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "peerUid"

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    const-string v0, "peerUin"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    const-string v0, "uin"

    .line 21
    .line 22
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v0, "uid"

    .line 27
    .line 28
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v4

    .line 32
    const-string v0, "troopUin"

    .line 33
    .line 34
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 35
    .line 36
    .line 37
    move-result-object v5

    .line 38
    const-string v0, "friendUin"

    .line 39
    .line 40
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v6

    .line 44
    const-string v0, "key_peerUin"

    .line 45
    .line 46
    invoke-virtual {p0, v0}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v7

    .line 50
    filled-new-array/range {v1 .. v7}, [Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v0}, Lcom/mr/elaris/w;->G([Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v0

    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    .line 60
    .line 61
    move-result v1

    .line 62
    if-nez v1, :cond_1

    .line 63
    .line 64
    :goto_0
    const/4 p0, 0x0

    .line 65
    return-object p0

    .line 66
    :cond_1
    const-string v1, "chatType"

    .line 67
    .line 68
    const/high16 v2, -0x80000000

    .line 69
    .line 70
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-ne v1, v2, :cond_2

    .line 75
    .line 76
    const-string v1, "type"

    .line 77
    .line 78
    invoke-virtual {p0, v1, v2}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 79
    .line 80
    .line 81
    move-result v1

    .line 82
    :cond_2
    if-ne v1, v2, :cond_3

    .line 83
    .line 84
    const-string v1, "uintype"

    .line 85
    .line 86
    const/4 v3, -0x1

    .line 87
    invoke-virtual {p0, v1, v3}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 88
    .line 89
    .line 90
    move-result p0

    .line 91
    invoke-static {p0}, Lcom/mr/elaris/w;->i(I)I

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    :cond_3
    new-instance p0, Lpd;

    .line 96
    .line 97
    const/4 v3, 0x1

    .line 98
    if-ne v1, v2, :cond_4

    .line 99
    .line 100
    move v1, v3

    .line 101
    :cond_4
    if-gtz v1, :cond_5

    .line 102
    .line 103
    goto :goto_1

    .line 104
    :cond_5
    move v3, v1

    .line 105
    :goto_1
    invoke-direct {p0, v0, v3}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 106
    .line 107
    .line 108
    return-object p0
.end method

.method public static declared-synchronized S()I
    .locals 5

    .line 1
    const-class v0, Lcom/mr/elaris/w;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    sget-boolean v1, Lcom/mr/elaris/w;->k:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    if-eqz v1, :cond_0

    .line 8
    .line 9
    monitor-exit v0

    .line 10
    return v2

    .line 11
    :cond_0
    const/4 v1, 0x1

    .line 12
    :try_start_1
    sput-boolean v1, Lcom/mr/elaris/w;->k:Z

    .line 13
    .line 14
    new-instance v3, Lk;

    .line 15
    .line 16
    const/4 v4, 0x2

    .line 17
    invoke-direct {v3, v4}, Lk;-><init>(I)V

    .line 18
    .line 19
    .line 20
    const/16 v4, 0x2018

    .line 21
    .line 22
    invoke-static {v4, v3}, Ld;->a(ILc;)I

    .line 23
    .line 24
    .line 25
    move-result v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    if-ltz v3, :cond_1

    .line 27
    .line 28
    monitor-exit v0

    .line 29
    return v1

    .line 30
    :cond_1
    :try_start_2
    sput-boolean v2, Lcom/mr/elaris/w;->k:Z

    .line 31
    .line 32
    const-string v1, "local voice picker result hook failed reason=shared router unavailable"

    .line 33
    .line 34
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 35
    .line 36
    .line 37
    monitor-exit v0

    .line 38
    return v2

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 41
    throw v1
.end method

.method public static S0(Ljava/lang/Object;)Lpd;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    :try_start_0
    const-string v2, "d"

    .line 7
    .line 8
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->K(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    const-string v3, "e"

    .line 13
    .line 14
    invoke-static {p0, v3}, Lcom/mr/elaris/w;->K(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    const-string v4, "f"

    .line 19
    .line 20
    invoke-static {p0, v4}, Lcom/mr/elaris/w;->K(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    const/high16 v5, -0x80000000

    .line 25
    .line 26
    invoke-static {v5, v2}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 27
    .line 28
    .line 29
    move-result v2

    .line 30
    invoke-static {v5, v3}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 31
    .line 32
    .line 33
    move-result v5

    .line 34
    instance-of v6, v3, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 35
    .line 36
    const-string v7, ""

    .line 37
    .line 38
    if-eqz v6, :cond_1

    .line 39
    .line 40
    :try_start_1
    check-cast v3, Ljava/lang/String;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :cond_1
    move-object v3, v7

    .line 44
    :goto_0
    instance-of v6, v4, Ljava/lang/String;

    .line 45
    .line 46
    if-eqz v6, :cond_2

    .line 47
    .line 48
    move-object v7, v4

    .line 49
    check-cast v7, Ljava/lang/String;

    .line 50
    .line 51
    :cond_2
    if-lez v2, :cond_4

    .line 52
    .line 53
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-lez v4, :cond_4

    .line 58
    .line 59
    new-instance v4, Lpd;

    .line 60
    .line 61
    if-gtz v2, :cond_3

    .line 62
    .line 63
    move v2, v1

    .line 64
    :cond_3
    invoke-direct {v4, v3, v2}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_4
    if-lez v5, :cond_6

    .line 69
    .line 70
    invoke-virtual {v7}, Ljava/lang/String;->length()I

    .line 71
    .line 72
    .line 73
    move-result v2

    .line 74
    if-lez v2, :cond_6

    .line 75
    .line 76
    new-instance v4, Lpd;

    .line 77
    .line 78
    if-gtz v5, :cond_5

    .line 79
    .line 80
    move v5, v1

    .line 81
    :cond_5
    invoke-direct {v4, v7, v5}, Lpd;-><init>(Ljava/lang/String;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 82
    .line 83
    .line 84
    goto :goto_1

    .line 85
    :catchall_0
    :cond_6
    move-object v4, v0

    .line 86
    :goto_1
    if-eqz v4, :cond_7

    .line 87
    .line 88
    return-object v4

    .line 89
    :cond_7
    const-string v9, "troopUin"

    .line 90
    .line 91
    const-string v10, "friendUin"

    .line 92
    .line 93
    const-string v5, "peerUid"

    .line 94
    .line 95
    const-string v6, "peerUin"

    .line 96
    .line 97
    const-string v7, "uin"

    .line 98
    .line 99
    const-string v8, "uid"

    .line 100
    .line 101
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v2

    .line 105
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v2

    .line 109
    const-string v3, "getPeerUid"

    .line 110
    .line 111
    invoke-static {p0, v3}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    invoke-static {v3}, Lcom/mr/elaris/w;->P0(Ljava/lang/Object;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v3

    .line 119
    const-string v4, "getPeerUin"

    .line 120
    .line 121
    invoke-static {p0, v4}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v4

    .line 125
    invoke-static {v4}, Lcom/mr/elaris/w;->P0(Ljava/lang/Object;)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v4

    .line 129
    filled-new-array {v2, v3, v4}, [Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object v2

    .line 133
    invoke-static {v2}, Lcom/mr/elaris/w;->G([Ljava/lang/String;)Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 138
    .line 139
    .line 140
    move-result v3

    .line 141
    if-nez v3, :cond_8

    .line 142
    .line 143
    return-object v0

    .line 144
    :cond_8
    const-string v0, "chatType"

    .line 145
    .line 146
    const-string v3, "type"

    .line 147
    .line 148
    filled-new-array {v0, v3}, [Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    const-string v3, "getChatType"

    .line 157
    .line 158
    invoke-static {p0, v3}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    move-result-object p0

    .line 162
    invoke-static {v1, p0}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 163
    .line 164
    .line 165
    move-result p0

    .line 166
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 167
    .line 168
    .line 169
    move-result p0

    .line 170
    new-instance v0, Lpd;

    .line 171
    .line 172
    if-gtz p0, :cond_9

    .line 173
    .line 174
    goto :goto_2

    .line 175
    :cond_9
    move v1, p0

    .line 176
    :goto_2
    invoke-direct {v0, v2, v1}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 177
    .line 178
    .line 179
    return-object v0
.end method

.method public static T(Ljava/lang/ClassLoader;Ljava/lang/Class;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    sget-object v1, Lcom/mr/elaris/w;->a:[Ljava/lang/String;

    .line 3
    .line 4
    const/4 v2, 0x3

    .line 5
    if-ge v0, v2, :cond_0

    .line 6
    .line 7
    :try_start_0
    aget-object v2, v1, v0

    .line 8
    .line 9
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-static {v2, p1}, Lcom/mr/elaris/w;->A(Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    const/4 v3, 0x1

    .line 18
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 19
    .line 20
    .line 21
    new-instance v3, Lpe;

    .line 22
    .line 23
    invoke-direct {v3, p0}, Lpe;-><init>(Ljava/lang/ClassLoader;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, v3}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 27
    .line 28
    .line 29
    new-instance v2, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 32
    .line 33
    .line 34
    const-string v3, "voice menu view hook installed layout="

    .line 35
    .line 36
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    aget-object v1, v1, v0

    .line 40
    .line 41
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_0
    :goto_1
    return-void
.end method

.method public static T0(Ljava/lang/Object;)Lpd;
    .locals 7

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto/16 :goto_5

    .line 4
    .line 5
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/w;->V0(Ljava/lang/Object;)Lpd;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_1
    const-string v5, "peer"

    .line 13
    .line 14
    const-string v6, "aioPeer"

    .line 15
    .line 16
    const-string v1, "aioContact"

    .line 17
    .line 18
    const-string v2, "mAioContact"

    .line 19
    .line 20
    const-string v3, "contact"

    .line 21
    .line 22
    const-string v4, "mContact"

    .line 23
    .line 24
    filled-new-array/range {v1 .. v6}, [Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-nez v0, :cond_2

    .line 33
    .line 34
    const-string v0, "getAIOContact"

    .line 35
    .line 36
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    :cond_2
    invoke-static {v0}, Lcom/mr/elaris/w;->V0(Ljava/lang/Object;)Lpd;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_3

    .line 45
    .line 46
    return-object v1

    .line 47
    :cond_3
    invoke-static {v0}, Lcom/mr/elaris/w;->S0(Ljava/lang/Object;)Lpd;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    if-eqz v1, :cond_4

    .line 52
    .line 53
    return-object v1

    .line 54
    :cond_4
    const-string v1, "param"

    .line 55
    .line 56
    const-string v2, "mParam"

    .line 57
    .line 58
    const-string v3, "aioParam"

    .line 59
    .line 60
    const-string v4, "mAioParam"

    .line 61
    .line 62
    filled-new-array {v3, v4, v1, v2}, [Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object v1

    .line 66
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object v1

    .line 70
    invoke-static {v1}, Lcom/mr/elaris/w;->U0(Ljava/lang/Object;)Lpd;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    if-eqz v1, :cond_5

    .line 75
    .line 76
    return-object v1

    .line 77
    :cond_5
    invoke-static {p0}, Lcom/mr/elaris/w;->S0(Ljava/lang/Object;)Lpd;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    if-eqz v1, :cond_6

    .line 82
    .line 83
    return-object v1

    .line 84
    :cond_6
    if-nez v0, :cond_7

    .line 85
    .line 86
    goto :goto_0

    .line 87
    :cond_7
    move-object p0, v0

    .line 88
    :goto_0
    invoke-static {p0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0

    .line 92
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_f

    .line 97
    .line 98
    const-string v0, "null"

    .line 99
    .line 100
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 101
    .line 102
    .line 103
    move-result v0

    .line 104
    if-eqz v0, :cond_8

    .line 105
    .line 106
    goto :goto_5

    .line 107
    :cond_8
    const-string v0, "peerUid"

    .line 108
    .line 109
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    const-string v1, "peerUin"

    .line 114
    .line 115
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    const-string v2, "uin"

    .line 120
    .line 121
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const-string v3, "uid"

    .line 126
    .line 127
    invoke-static {p0, v3}, Lcom/mr/elaris/w;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    filled-new-array {v0, v1, v2, v3}, [Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v0

    .line 135
    invoke-static {v0}, Lcom/mr/elaris/w;->G([Ljava/lang/String;)Ljava/lang/String;

    .line 136
    .line 137
    .line 138
    move-result-object v0

    .line 139
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 140
    .line 141
    .line 142
    move-result v1

    .line 143
    if-nez v1, :cond_9

    .line 144
    .line 145
    goto :goto_5

    .line 146
    :cond_9
    const-string v1, "chatType"

    .line 147
    .line 148
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v1

    .line 152
    const-string v2, "type"

    .line 153
    .line 154
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object p0

    .line 158
    const/4 v2, 0x1

    .line 159
    if-eqz p0, :cond_b

    .line 160
    .line 161
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 162
    .line 163
    .line 164
    move-result v3

    .line 165
    if-nez v3, :cond_a

    .line 166
    .line 167
    goto :goto_1

    .line 168
    :cond_a
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 169
    .line 170
    .line 171
    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 172
    goto :goto_2

    .line 173
    :catchall_0
    :cond_b
    :goto_1
    move p0, v2

    .line 174
    :goto_2
    if-eqz v1, :cond_d

    .line 175
    .line 176
    :try_start_1
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 177
    .line 178
    .line 179
    move-result v3

    .line 180
    if-nez v3, :cond_c

    .line 181
    .line 182
    goto :goto_3

    .line 183
    :cond_c
    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 184
    .line 185
    .line 186
    move-result p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 187
    :catchall_1
    :cond_d
    :goto_3
    new-instance v1, Lpd;

    .line 188
    .line 189
    if-gtz p0, :cond_e

    .line 190
    .line 191
    goto :goto_4

    .line 192
    :cond_e
    move v2, p0

    .line 193
    :goto_4
    invoke-direct {v1, v0, v2}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 194
    .line 195
    .line 196
    return-object v1

    .line 197
    :cond_f
    :goto_5
    const/4 p0, 0x0

    .line 198
    return-object p0
.end method

.method public static U(Ljava/lang/ClassLoader;)I
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "com.tencent.mobileqq.aio.msglist.holder.component.BaseContentComponent"

    .line 3
    .line 4
    invoke-static {v1, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    move-result-object v1

    .line 8
    const-string v2, "com.tencent.mobileqq.aio.msg.AIOMsgItem"

    .line 9
    .line 10
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    const-string v3, "com.tencent.mobileqq.aio.msglist.holder.component.ptt.AIOPttContentComponent"

    .line 15
    .line 16
    invoke-static {v3, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    const-string v4, "com.tencent.qqnt.aio.menu.c"

    .line 21
    .line 22
    invoke-static {v4, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v5

    .line 30
    move v6, v0

    .line 31
    :goto_0
    array-length v7, v5

    .line 32
    if-ge v6, v7, :cond_6

    .line 33
    .line 34
    aget-object v7, v5, v6

    .line 35
    .line 36
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object v8

    .line 40
    array-length v8, v8

    .line 41
    if-nez v8, :cond_5

    .line 42
    .line 43
    invoke-virtual {v7}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object v8

    .line 47
    invoke-virtual {v2, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 48
    .line 49
    .line 50
    move-result v8

    .line 51
    if-eqz v8, :cond_5

    .line 52
    .line 53
    invoke-static {v1}, Lcom/mr/elaris/w;->C(Ljava/lang/Class;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v3, v1}, Lcom/mr/elaris/w;->B(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-static {v4, v2}, Lcom/mr/elaris/w;->D(Ljava/lang/Class;Ljava/lang/Class;)Lec;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    const-class v5, Ljava/lang/String;

    .line 66
    .line 67
    move-object v6, v4

    .line 68
    :goto_1
    if-eqz v6, :cond_2

    .line 69
    .line 70
    const-class v8, Ljava/lang/Object;

    .line 71
    .line 72
    if-eq v6, v8, :cond_2

    .line 73
    .line 74
    invoke-virtual {v6}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 75
    .line 76
    .line 77
    move-result-object v8

    .line 78
    move v9, v0

    .line 79
    :goto_2
    array-length v10, v8

    .line 80
    if-ge v9, v10, :cond_1

    .line 81
    .line 82
    aget-object v10, v8, v9

    .line 83
    .line 84
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 85
    .line 86
    .line 87
    move-result v11

    .line 88
    invoke-static {v11}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 89
    .line 90
    .line 91
    move-result v11

    .line 92
    if-nez v11, :cond_0

    .line 93
    .line 94
    invoke-virtual {v10}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v11

    .line 98
    if-ne v11, v5, :cond_0

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_0
    add-int/lit8 v9, v9, 0x1

    .line 102
    .line 103
    goto :goto_2

    .line 104
    :cond_1
    invoke-virtual {v6}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v6

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    const/4 v10, 0x0

    .line 110
    :goto_3
    const/4 v5, 0x1

    .line 111
    if-eqz v10, :cond_3

    .line 112
    .line 113
    invoke-virtual {v10, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 114
    .line 115
    .line 116
    goto :goto_4

    .line 117
    :catchall_0
    move-exception p0

    .line 118
    goto :goto_6

    .line 119
    :cond_3
    :goto_4
    invoke-virtual {v7, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 123
    .line 124
    .line 125
    invoke-static {p0, v4}, Lcom/mr/elaris/w;->N(Ljava/lang/ClassLoader;Ljava/lang/Class;)Z

    .line 126
    .line 127
    .line 128
    invoke-static {p0, v4}, Lcom/mr/elaris/w;->T(Ljava/lang/ClassLoader;Ljava/lang/Class;)V

    .line 129
    .line 130
    .line 131
    sget-object v4, Lcom/mr/elaris/w;->c:Ljava/util/Set;

    .line 132
    .line 133
    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 134
    :try_start_1
    invoke-interface {v4, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 135
    .line 136
    .line 137
    move-result v5

    .line 138
    if-eqz v5, :cond_4

    .line 139
    .line 140
    monitor-exit v4

    .line 141
    return v0

    .line 142
    :catchall_1
    move-exception p0

    .line 143
    goto :goto_5

    .line 144
    :cond_4
    invoke-interface {v4, v3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 145
    .line 146
    .line 147
    monitor-exit v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 148
    :try_start_2
    new-instance v4, Lie;

    .line 149
    .line 150
    invoke-direct {v4, v7, v2, v10, p0}, Lie;-><init>(Ljava/lang/reflect/Method;Lec;Ljava/lang/reflect/Field;Ljava/lang/ClassLoader;)V

    .line 151
    .line 152
    .line 153
    invoke-static {v1, v4}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;

    .line 154
    .line 155
    .line 156
    new-instance p0, Ljava/lang/StringBuilder;

    .line 157
    .line 158
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 159
    .line 160
    .line 161
    const-string v2, "voice menu hooked component="

    .line 162
    .line 163
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 167
    .line 168
    .line 169
    move-result-object v2

    .line 170
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    const-string v2, " method="

    .line 174
    .line 175
    invoke-virtual {p0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 179
    .line 180
    .line 181
    move-result-object v1

    .line 182
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p0

    .line 189
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 190
    .line 191
    .line 192
    const/4 p0, 0x2

    .line 193
    return p0

    .line 194
    :goto_5
    :try_start_3
    monitor-exit v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 195
    :try_start_4
    throw p0

    .line 196
    :cond_5
    add-int/lit8 v6, v6, 0x1

    .line 197
    .line 198
    goto/16 :goto_0

    .line 199
    .line 200
    :cond_6
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 201
    .line 202
    const-string v1, "AIOMsgItem getter"

    .line 203
    .line 204
    invoke-direct {p0, v1}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 205
    .line 206
    .line 207
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 208
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 209
    .line 210
    const-string v2, "voice menu hook failed reason="

    .line 211
    .line 212
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 216
    .line 217
    .line 218
    move-result-object v2

    .line 219
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object v2

    .line 223
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 224
    .line 225
    .line 226
    const-string v2, ": "

    .line 227
    .line 228
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 232
    .line 233
    .line 234
    move-result-object p0

    .line 235
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 236
    .line 237
    .line 238
    move-result-object p0

    .line 239
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 240
    .line 241
    .line 242
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 243
    .line 244
    .line 245
    move-result-object p0

    .line 246
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 247
    .line 248
    .line 249
    return v0
.end method

.method public static U0(Ljava/lang/Object;)Lpd;
    .locals 12

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return-object v0

    .line 5
    :cond_0
    const-string v1, "getContact"

    .line 6
    .line 7
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-static {v2}, Lcom/mr/elaris/w;->V0(Ljava/lang/Object;)Lpd;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    if-eqz v2, :cond_1

    .line 16
    .line 17
    return-object v2

    .line 18
    :cond_1
    const-string v2, "session"

    .line 19
    .line 20
    const-string v3, "mSession"

    .line 21
    .line 22
    const-string v4, "aioSession"

    .line 23
    .line 24
    const-string v5, "mAioSession"

    .line 25
    .line 26
    filled-new-array {v4, v5, v2, v3}, [Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v2

    .line 30
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x1

    .line 35
    if-nez v2, :cond_2

    .line 36
    .line 37
    :try_start_0
    const-string v4, "com.tencent.aio.data.AIOSession"

    .line 38
    .line 39
    invoke-static {p0, v4, v3}, Lv4;->l(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 43
    :catchall_0
    :cond_2
    const-string v8, "peer"

    .line 44
    .line 45
    const-string v9, "aioPeer"

    .line 46
    .line 47
    const-string v4, "contact"

    .line 48
    .line 49
    const-string v5, "aioContact"

    .line 50
    .line 51
    const-string v6, "mContact"

    .line 52
    .line 53
    const-string v7, "mAioContact"

    .line 54
    .line 55
    filled-new-array/range {v4 .. v9}, [Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v4

    .line 59
    invoke-static {p0, v4}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    if-nez v4, :cond_3

    .line 64
    .line 65
    const-string v4, "getAIOContact"

    .line 66
    .line 67
    invoke-static {p0, v4}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    :cond_3
    if-nez v4, :cond_4

    .line 72
    .line 73
    if-eqz v2, :cond_4

    .line 74
    .line 75
    const-string v9, "peer"

    .line 76
    .line 77
    const-string v10, "aioPeer"

    .line 78
    .line 79
    const-string v5, "contact"

    .line 80
    .line 81
    const-string v6, "aioContact"

    .line 82
    .line 83
    const-string v7, "mContact"

    .line 84
    .line 85
    const-string v8, "mAioContact"

    .line 86
    .line 87
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {v2, v4}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    :cond_4
    if-nez v4, :cond_5

    .line 96
    .line 97
    if-eqz v2, :cond_5

    .line 98
    .line 99
    :try_start_1
    const-string v5, "com.tencent.aio.data.AIOContact"

    .line 100
    .line 101
    invoke-static {v2, v5, v3}, Lv4;->l(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object v4
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 105
    :catchall_1
    :cond_5
    if-nez v4, :cond_6

    .line 106
    .line 107
    const-string v2, "getAioContact"

    .line 108
    .line 109
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 110
    .line 111
    .line 112
    move-result-object v4

    .line 113
    :cond_6
    if-nez v4, :cond_7

    .line 114
    .line 115
    const-string v2, "getContactInfo"

    .line 116
    .line 117
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    :cond_7
    invoke-static {v4, v1}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-static {v1}, Lcom/mr/elaris/w;->V0(Ljava/lang/Object;)Lpd;

    .line 126
    .line 127
    .line 128
    move-result-object v1

    .line 129
    if-eqz v1, :cond_8

    .line 130
    .line 131
    return-object v1

    .line 132
    :cond_8
    invoke-static {v4}, Lcom/mr/elaris/w;->V0(Ljava/lang/Object;)Lpd;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    if-eqz v1, :cond_9

    .line 137
    .line 138
    return-object v1

    .line 139
    :cond_9
    invoke-static {v4}, Lcom/mr/elaris/w;->S0(Ljava/lang/Object;)Lpd;

    .line 140
    .line 141
    .line 142
    move-result-object v1

    .line 143
    if-eqz v1, :cond_a

    .line 144
    .line 145
    return-object v1

    .line 146
    :cond_a
    const-string v9, "troopUin"

    .line 147
    .line 148
    const-string v10, "friendUin"

    .line 149
    .line 150
    const-string v5, "peerUid"

    .line 151
    .line 152
    const-string v6, "peerUin"

    .line 153
    .line 154
    const-string v7, "uin"

    .line 155
    .line 156
    const-string v8, "uid"

    .line 157
    .line 158
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    .line 159
    .line 160
    .line 161
    move-result-object v1

    .line 162
    invoke-static {v4, v1}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v1

    .line 166
    const-string v2, "getPeerUid"

    .line 167
    .line 168
    invoke-static {v4, v2}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-static {v2}, Lcom/mr/elaris/w;->P0(Ljava/lang/Object;)Ljava/lang/String;

    .line 173
    .line 174
    .line 175
    move-result-object v2

    .line 176
    const-string v5, "getPeerUin"

    .line 177
    .line 178
    invoke-static {v4, v5}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 179
    .line 180
    .line 181
    move-result-object v5

    .line 182
    invoke-static {v5}, Lcom/mr/elaris/w;->P0(Ljava/lang/Object;)Ljava/lang/String;

    .line 183
    .line 184
    .line 185
    move-result-object v5

    .line 186
    const-string v10, "troopUin"

    .line 187
    .line 188
    const-string v11, "friendUin"

    .line 189
    .line 190
    const-string v6, "peerUid"

    .line 191
    .line 192
    const-string v7, "peerUin"

    .line 193
    .line 194
    const-string v8, "uin"

    .line 195
    .line 196
    const-string v9, "uid"

    .line 197
    .line 198
    filled-new-array/range {v6 .. v11}, [Ljava/lang/String;

    .line 199
    .line 200
    .line 201
    move-result-object v6

    .line 202
    invoke-static {p0, v6}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v6

    .line 206
    filled-new-array {v1, v2, v5, v6}, [Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v1

    .line 210
    invoke-static {v1}, Lcom/mr/elaris/w;->G([Ljava/lang/String;)Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object v1

    .line 214
    const-string v2, "chatType"

    .line 215
    .line 216
    const-string v5, "type"

    .line 217
    .line 218
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object v6

    .line 222
    invoke-static {v4, v6}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 223
    .line 224
    .line 225
    move-result-object v4

    .line 226
    filled-new-array {v2, v5}, [Ljava/lang/String;

    .line 227
    .line 228
    .line 229
    move-result-object v2

    .line 230
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p0

    .line 234
    invoke-static {v3, p0}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 235
    .line 236
    .line 237
    move-result p0

    .line 238
    invoke-static {p0, v4}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 239
    .line 240
    .line 241
    move-result p0

    .line 242
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 243
    .line 244
    .line 245
    move-result v2

    .line 246
    if-nez v2, :cond_b

    .line 247
    .line 248
    return-object v0

    .line 249
    :cond_b
    new-instance v0, Lpd;

    .line 250
    .line 251
    if-gtz p0, :cond_c

    .line 252
    .line 253
    goto :goto_0

    .line 254
    :cond_c
    move v3, p0

    .line 255
    :goto_0
    invoke-direct {v0, v1, v3}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 256
    .line 257
    .line 258
    return-object v0
.end method

.method public static V(Ljava/lang/ClassLoader;)I
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    sput-boolean v0, Lcom/mr/elaris/w;->j:Z

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    const-string v2, "com.tencent.qqnt.aio.shortcutbar.PanelIconLinearLayout"

    .line 6
    .line 7
    invoke-static {v2, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClassIfExists(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    if-nez p0, :cond_0

    .line 12
    .line 13
    const-string p0, "local voice shortcut bar hook skipped reason=PanelIconLinearLayout missing"

    .line 14
    .line 15
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return v1

    .line 19
    :catchall_0
    move-exception p0

    .line 20
    goto/16 :goto_3

    .line 21
    .line 22
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/w;->E(Ljava/lang/Class;)Ljava/util/ArrayList;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-virtual {v2}, Ljava/util/ArrayList;->isEmpty()Z

    .line 27
    .line 28
    .line 29
    move-result v3

    .line 30
    if-eqz v3, :cond_1

    .line 31
    .line 32
    const-string p0, "local voice shortcut bar hook skipped reason=bind method missing"

    .line 33
    .line 34
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return v1

    .line 38
    :cond_1
    move v3, v1

    .line 39
    move v4, v3

    .line 40
    :goto_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 41
    .line 42
    .line 43
    move-result v5

    .line 44
    if-ge v3, v5, :cond_3

    .line 45
    .line 46
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Ljava/lang/reflect/Method;

    .line 51
    .line 52
    invoke-static {v5}, Lcom/mr/elaris/w;->q0(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v6

    .line 56
    sget-object v7, Lcom/mr/elaris/w;->f:Ljava/util/Set;

    .line 57
    .line 58
    monitor-enter v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    :try_start_1
    invoke-interface {v7, v6}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v8

    .line 63
    if-eqz v8, :cond_2

    .line 64
    .line 65
    monitor-exit v7

    .line 66
    goto :goto_1

    .line 67
    :catchall_1
    move-exception p0

    .line 68
    goto :goto_2

    .line 69
    :cond_2
    invoke-interface {v7, v6}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    monitor-exit v7
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 73
    :try_start_2
    invoke-virtual {v5, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 74
    .line 75
    .line 76
    new-instance v7, Lje;

    .line 77
    .line 78
    const/16 v8, 0x24

    .line 79
    .line 80
    invoke-direct {v7, v8}, Lcom/mr/elaris/xposedcompat/XC_MethodHook;-><init>(I)V

    .line 81
    .line 82
    .line 83
    invoke-static {v5, v7}, Lcom/mr/elaris/xposedcompat/XposedBridge;->hookMethod(Ljava/lang/reflect/Member;Lcom/mr/elaris/xposedcompat/XC_MethodHook;)Lcom/mr/elaris/xposedcompat/XC_MethodHook$Unhook;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 84
    .line 85
    .line 86
    add-int/lit8 v4, v4, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :catchall_2
    move-exception v5

    .line 90
    :try_start_3
    sget-object v7, Lcom/mr/elaris/w;->f:Ljava/util/Set;

    .line 91
    .line 92
    monitor-enter v7
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 93
    :try_start_4
    invoke-interface {v7, v6}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 94
    .line 95
    .line 96
    monitor-exit v7
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 97
    :try_start_5
    new-instance v6, Ljava/lang/StringBuilder;

    .line 98
    .line 99
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 100
    .line 101
    .line 102
    const-string v7, "local voice shortcut bar hook method failed: "

    .line 103
    .line 104
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 105
    .line 106
    .line 107
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v7}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string v7, ": "

    .line 119
    .line 120
    invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v5}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-static {v5}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v5

    .line 131
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v5

    .line 138
    invoke-static {v5}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 139
    .line 140
    .line 141
    :goto_1
    add-int/lit8 v3, v3, 0x1

    .line 142
    .line 143
    goto :goto_0

    .line 144
    :catchall_3
    move-exception p0

    .line 145
    :try_start_6
    monitor-exit v7
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 146
    :try_start_7
    throw p0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_0

    .line 147
    :goto_2
    :try_start_8
    monitor-exit v7
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    .line 148
    :try_start_9
    throw p0

    .line 149
    :cond_3
    if-lez v4, :cond_4

    .line 150
    .line 151
    new-instance v0, Ljava/lang/StringBuilder;

    .line 152
    .line 153
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 154
    .line 155
    .line 156
    const-string v2, "local voice shortcut bar hook installed class="

    .line 157
    .line 158
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    const-string p0, " count="

    .line 169
    .line 170
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 174
    .line 175
    .line 176
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 177
    .line 178
    .line 179
    move-result-object p0

    .line 180
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_0

    .line 181
    .line 182
    .line 183
    :cond_4
    return v4

    .line 184
    :goto_3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 185
    .line 186
    const-string v2, "local voice shortcut bar hook failed reason="

    .line 187
    .line 188
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 192
    .line 193
    .line 194
    move-result-object v2

    .line 195
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    move-result-object v2

    .line 199
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    .line 201
    .line 202
    const-string v2, ": "

    .line 203
    .line 204
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 208
    .line 209
    .line 210
    move-result-object p0

    .line 211
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 212
    .line 213
    .line 214
    move-result-object p0

    .line 215
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 216
    .line 217
    .line 218
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 219
    .line 220
    .line 221
    move-result-object p0

    .line 222
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 223
    .line 224
    .line 225
    return v1
.end method

.method public static V0(Ljava/lang/Object;)Lpd;
    .locals 11

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_5

    .line 3
    .line 4
    instance-of v1, p0, Ljava/lang/CharSequence;

    .line 5
    .line 6
    if-nez v1, :cond_5

    .line 7
    .line 8
    instance-of v1, p0, Ljava/lang/Number;

    .line 9
    .line 10
    if-nez v1, :cond_5

    .line 11
    .line 12
    instance-of v1, p0, Ljava/lang/Boolean;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v1

    .line 26
    const-string v2, ".Contact"

    .line 27
    .line 28
    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    const-string v3, "type"

    .line 33
    .line 34
    const-string v4, "chatType"

    .line 35
    .line 36
    if-nez v2, :cond_2

    .line 37
    .line 38
    const-string v2, "nativeinterface.Contact"

    .line 39
    .line 40
    invoke-virtual {v1, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result v1

    .line 44
    if-eqz v1, :cond_1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_1
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    const/4 v2, 0x0

    .line 56
    invoke-static {v2, v1}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 57
    .line 58
    .line 59
    move-result v1

    .line 60
    if-lez v1, :cond_5

    .line 61
    .line 62
    const-string v9, "troopUin"

    .line 63
    .line 64
    const-string v10, "friendUin"

    .line 65
    .line 66
    const-string v5, "peerUid"

    .line 67
    .line 68
    const-string v6, "peerUin"

    .line 69
    .line 70
    const-string v7, "uin"

    .line 71
    .line 72
    const-string v8, "uid"

    .line 73
    .line 74
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v1

    .line 78
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v1

    .line 82
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 83
    .line 84
    .line 85
    move-result v1

    .line 86
    if-lez v1, :cond_5

    .line 87
    .line 88
    :cond_2
    :goto_0
    const-string v9, "troopUin"

    .line 89
    .line 90
    const-string v10, "friendUin"

    .line 91
    .line 92
    const-string v5, "peerUid"

    .line 93
    .line 94
    const-string v6, "peerUin"

    .line 95
    .line 96
    const-string v7, "uin"

    .line 97
    .line 98
    const-string v8, "uid"

    .line 99
    .line 100
    filled-new-array/range {v5 .. v10}, [Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->I(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/String;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    const-string v2, "getPeerUid"

    .line 109
    .line 110
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    invoke-static {v2}, Lcom/mr/elaris/w;->P0(Ljava/lang/Object;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object v2

    .line 118
    const-string v5, "getPeerUin"

    .line 119
    .line 120
    invoke-static {p0, v5}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 121
    .line 122
    .line 123
    move-result-object v5

    .line 124
    invoke-static {v5}, Lcom/mr/elaris/w;->P0(Ljava/lang/Object;)Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object v5

    .line 128
    const-string v6, "getUin"

    .line 129
    .line 130
    invoke-static {p0, v6}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 131
    .line 132
    .line 133
    move-result-object v6

    .line 134
    invoke-static {v6}, Lcom/mr/elaris/w;->P0(Ljava/lang/Object;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    filled-new-array {v1, v2, v5, v6}, [Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    invoke-static {v1}, Lcom/mr/elaris/w;->G([Ljava/lang/String;)Ljava/lang/String;

    .line 143
    .line 144
    .line 145
    move-result-object v1

    .line 146
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 147
    .line 148
    .line 149
    move-result v2

    .line 150
    if-nez v2, :cond_3

    .line 151
    .line 152
    return-object v0

    .line 153
    :cond_3
    filled-new-array {v4, v3}, [Ljava/lang/String;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 158
    .line 159
    .line 160
    move-result-object v0

    .line 161
    const-string v2, "getChatType"

    .line 162
    .line 163
    invoke-static {p0, v2}, Lcom/mr/elaris/w;->h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-result-object p0

    .line 167
    const/4 v2, 0x1

    .line 168
    invoke-static {v2, p0}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 169
    .line 170
    .line 171
    move-result p0

    .line 172
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->W(ILjava/lang/Object;)I

    .line 173
    .line 174
    .line 175
    move-result p0

    .line 176
    new-instance v0, Lpd;

    .line 177
    .line 178
    if-gtz p0, :cond_4

    .line 179
    .line 180
    goto :goto_1

    .line 181
    :cond_4
    move v2, p0

    .line 182
    :goto_1
    invoke-direct {v0, v1, v2}, Lpd;-><init>(Ljava/lang/String;I)V

    .line 183
    .line 184
    .line 185
    :cond_5
    :goto_2
    return-object v0
.end method

.method public static W(ILjava/lang/Object;)I
    .locals 1

    .line 1
    instance-of v0, p1, Ljava/lang/Number;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    check-cast p1, Ljava/lang/Number;

    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    :cond_0
    return p0
.end method

.method public static W0(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 1
    if-eqz p0, :cond_3

    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-nez v0, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    :goto_0
    new-instance v0, Li3;

    .line 22
    .line 23
    const/4 v1, 0x3

    .line 24
    invoke-direct {v0, p0, p1, v1}, Li3;-><init>(Landroid/content/Context;Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    if-ne p0, p1, :cond_2

    .line 36
    .line 37
    invoke-virtual {v0}, Li3;->run()V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :cond_2
    new-instance p0, Landroid/os/Handler;

    .line 42
    .line 43
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    invoke-direct {p0, p1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 51
    .line 52
    .line 53
    :cond_3
    :goto_1
    return-void
.end method

.method public static X(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/ClassLoader;Lx2;)Z
    .locals 11

    .line 1
    const-string v0, "voice-message"

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const/4 v2, 0x0

    .line 12
    move v3, v2

    .line 13
    :goto_0
    array-length v4, v1

    .line 14
    if-ge v3, v4, :cond_5

    .line 15
    .line 16
    aget-object v4, v1, v3

    .line 17
    .line 18
    const-string v5, "sendMsg"

    .line 19
    .line 20
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v6

    .line 24
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 25
    .line 26
    .line 27
    move-result v5

    .line 28
    if-nez v5, :cond_0

    .line 29
    .line 30
    goto :goto_4

    .line 31
    :cond_0
    invoke-virtual {v4}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    const/4 v6, 0x1

    .line 36
    :try_start_0
    invoke-virtual {v4, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 37
    .line 38
    .line 39
    array-length v7, v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    const/4 v8, 0x3

    .line 41
    const/4 v9, 0x2

    .line 42
    const-class v10, Ljava/util/List;

    .line 43
    .line 44
    if-ne v7, v8, :cond_3

    .line 45
    .line 46
    :try_start_1
    aget-object v7, v5, v2

    .line 47
    .line 48
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v7

    .line 52
    if-eqz v7, :cond_3

    .line 53
    .line 54
    aget-object v7, v5, v6

    .line 55
    .line 56
    invoke-virtual {v10, v7}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 57
    .line 58
    .line 59
    move-result v7

    .line 60
    if-eqz v7, :cond_3

    .line 61
    .line 62
    aget-object v5, v5, v9

    .line 63
    .line 64
    const/4 v7, 0x0

    .line 65
    if-eqz v5, :cond_2

    .line 66
    .line 67
    invoke-virtual {v5}, Ljava/lang/Class;->isInterface()Z

    .line 68
    .line 69
    .line 70
    move-result v8
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 71
    if-nez v8, :cond_1

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_1
    :try_start_2
    filled-new-array {v5}, [Ljava/lang/Class;

    .line 75
    .line 76
    .line 77
    move-result-object v5

    .line 78
    new-instance v8, Ln6;

    .line 79
    .line 80
    invoke-direct {v8, v6, p4}, Ln6;-><init>(ILjava/lang/Object;)V

    .line 81
    .line 82
    .line 83
    invoke-static {p3, v5, v8}, Ljava/lang/reflect/Proxy;->newProxyInstance(Ljava/lang/ClassLoader;[Ljava/lang/Class;Ljava/lang/reflect/InvocationHandler;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v7
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception v5

    .line 89
    :try_start_3
    const-string v8, "callback-proxy"

    .line 90
    .line 91
    invoke-static {v0, v8, v5}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_1
    filled-new-array {p1, p2, v7}, [Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    move-result-object v5

    .line 98
    invoke-virtual {v4, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 99
    .line 100
    .line 101
    goto :goto_2

    .line 102
    :catchall_1
    move-exception v4

    .line 103
    goto :goto_3

    .line 104
    :cond_3
    array-length v7, v5

    .line 105
    if-ne v7, v9, :cond_4

    .line 106
    .line 107
    aget-object v7, v5, v2

    .line 108
    .line 109
    invoke-virtual {v7, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 110
    .line 111
    .line 112
    move-result v7

    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    aget-object v5, v5, v6

    .line 116
    .line 117
    invoke-virtual {v10, v5}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    if-eqz v5, :cond_4

    .line 122
    .line 123
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object v5

    .line 127
    invoke-virtual {v4, p0, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 128
    .line 129
    .line 130
    :goto_2
    return v6

    .line 131
    :goto_3
    const-string v5, "invoke-send-msg"

    .line 132
    .line 133
    invoke-static {v0, v5, v4}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 134
    .line 135
    .line 136
    :cond_4
    :goto_4
    add-int/lit8 v3, v3, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_5
    return v2
.end method

.method public static X0(Landroid/content/Context;Ljava/io/File;Lve;)Lna;
    .locals 27

    move-object/from16 v1, p0

    move-object/from16 v7, p1

    move-object/from16 v6, p2

    .line 1
    const-string v8, ".amr"

    const-string v9, ".silk"

    const-string v10, "local voice audio amr-wb fallback reason="

    const-string v11, "local voice audio silk-compat fallback reason="

    const-string v12, "local voice audio silk-hq fallback reason="

    if-eqz v1, :cond_c

    if-eqz v7, :cond_c

    invoke-virtual {v7}, Ljava/io/File;->exists()Z

    move-result v0

    if-eqz v0, :cond_c

    invoke-virtual {v7}, Ljava/io/File;->isFile()Z

    move-result v0

    if-eqz v0, :cond_c

    .line 2
    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v0, v2, v4

    if-lez v0, :cond_b

    .line 3
    invoke-virtual {v7}, Ljava/io/File;->length()J

    move-result-wide v14

    .line 4
    invoke-virtual {v7}, Ljava/io/File;->lastModified()J

    move-result-wide v2

    .line 5
    invoke-static {v6}, Li5;->y(Lve;)V

    .line 6
    invoke-static {v1}, Li5;->u(Landroid/content/Context;)Ljava/io/File;

    move-result-object v4

    const v0, 0xfa00

    const v5, 0xbb80

    const/16 v16, 0x0

    .line 7
    :try_start_0
    invoke-static {v1, v7, v5, v0, v6}, Li5;->S(Landroid/content/Context;Ljava/io/File;IILve;)Lt0;

    move-result-object v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_7

    :try_start_1
    iget-object v5, v13, Lt0;->c:Ljava/io/Serializable;

    check-cast v5, Ljava/io/File;

    iget v0, v13, Lt0;->b:I

    move-object/from16 v18, v5

    .line 8
    iget-wide v5, v13, Lt0;->a:J
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-wide/16 v19, 0x2

    cmp-long v5, v5, v19

    const-string v6, "audio decode empty"

    if-ltz v5, :cond_9

    .line 9
    :try_start_2
    invoke-static {v7, v14, v15, v2, v3}, Li5;->d2(Ljava/io/File;JJ)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 10
    :try_start_3
    const-string v5, "Elaris-local-audio-silk-hq-"

    invoke-static {v4, v5, v9}, Li5;->j1(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v5
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    move-object/from16 v21, v4

    const v4, 0xbb80

    move-wide/from16 v22, v2

    move-object v3, v5

    const v5, 0xfa00

    move-object/from16 v26, v6

    move-object/from16 v17, v8

    move-object/from16 v24, v10

    move-object/from16 v25, v11

    move-object/from16 v2, v18

    move-wide/from16 v10, v22

    const v8, 0xbb80

    move-object/from16 v6, p2

    .line 11
    :try_start_4
    invoke-static/range {v1 .. v6}, Li5;->g0(Landroid/content/Context;Ljava/io/File;Ljava/io/File;IILve;)V

    .line 12
    const-string v4, "silk-hq"

    const v5, 0xfa00

    invoke-static {v4, v8, v5, v0, v3}, Li5;->Y0(Ljava/lang/String;IIILjava/io/File;)V

    .line 13
    new-instance v4, Lna;

    invoke-direct {v4, v3, v0}, Lna;-><init>(Ljava/io/File;I)V
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_0
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 14
    invoke-static {v2}, Li5;->U(Ljava/io/File;)V

    return-object v4

    :catchall_0
    move-exception v0

    goto/16 :goto_a

    :catch_0
    move-exception v0

    goto :goto_0

    :catch_1
    move-exception v0

    move-object/from16 v21, v4

    move-object/from16 v26, v6

    move-object/from16 v17, v8

    move-object/from16 v24, v10

    move-object/from16 v25, v11

    move-object/from16 v6, p2

    move-wide v10, v2

    .line 15
    :goto_0
    :try_start_5
    invoke-static {v6}, Li5;->y(Lve;)V

    .line 16
    invoke-static {v0}, Li5;->K0(Ljava/io/IOException;)Z

    move-result v2

    if-eqz v2, :cond_8

    .line 17
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li5;->E1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 19
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 20
    iget-object v0, v13, Lt0;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Li5;->U(Ljava/io/File;)V

    const/16 v0, 0x7d00

    const/16 v8, 0x5d2a

    .line 21
    :try_start_6
    invoke-static {v0, v8}, Ljava/lang/Math;->max(II)I

    move-result v2

    const/16 v12, 0x5dc0

    .line 22
    invoke-static {v1, v7, v12, v2, v6}, Li5;->S(Landroid/content/Context;Ljava/io/File;IILve;)Lt0;

    move-result-object v13
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_6

    .line 23
    :try_start_7
    iget-wide v2, v13, Lt0;->a:J

    cmp-long v2, v2, v19

    if-ltz v2, :cond_6

    .line 24
    invoke-static {v7, v14, v15, v10, v11}, Li5;->d2(Ljava/io/File;JJ)V
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    .line 25
    :try_start_8
    const-string v2, "Elaris-local-audio-silk-compat-"
    :try_end_8
    .catch Ljava/io/IOException; {:try_start_8 .. :try_end_8} :catch_4
    .catchall {:try_start_8 .. :try_end_8} :catchall_1

    move-object/from16 v3, v21

    :try_start_9
    invoke-static {v3, v2, v9}, Li5;->j1(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v2

    .line 26
    iget-object v4, v13, Lt0;->c:Ljava/io/Serializable;

    check-cast v4, Ljava/io/File;
    :try_end_9
    .catch Ljava/io/IOException; {:try_start_9 .. :try_end_9} :catch_3
    .catchall {:try_start_9 .. :try_end_9} :catchall_1

    move-object/from16 v21, v3

    move-object v3, v2

    move-object v2, v4

    const/16 v4, 0x5dc0

    const/16 v5, 0x7d00

    move-object/from16 v9, v21

    :try_start_a
    invoke-static/range {v1 .. v6}, Li5;->g0(Landroid/content/Context;Ljava/io/File;Ljava/io/File;IILve;)V

    .line 27
    const-string v2, "silk-compat"

    iget v4, v13, Lt0;->b:I

    invoke-static {v2, v12, v0, v4, v3}, Li5;->Y0(Ljava/lang/String;IIILjava/io/File;)V

    .line 28
    new-instance v0, Lna;

    iget v2, v13, Lt0;->b:I

    invoke-direct {v0, v3, v2}, Lna;-><init>(Ljava/io/File;I)V
    :try_end_a
    .catch Ljava/io/IOException; {:try_start_a .. :try_end_a} :catch_2
    .catchall {:try_start_a .. :try_end_a} :catchall_1

    .line 29
    iget-object v1, v13, Lt0;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/io/File;

    invoke-static {v1}, Li5;->U(Ljava/io/File;)V

    goto/16 :goto_3

    :catchall_1
    move-exception v0

    goto/16 :goto_8

    :catch_2
    move-exception v0

    goto :goto_1

    :catch_3
    move-exception v0

    move-object v9, v3

    goto :goto_1

    :catch_4
    move-exception v0

    move-object/from16 v9, v21

    .line 30
    :goto_1
    :try_start_b
    invoke-static {v6}, Li5;->y(Lve;)V

    .line 31
    invoke-static {v0}, Li5;->K0(Ljava/io/IOException;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 32
    new-instance v2, Ljava/lang/StringBuilder;

    move-object/from16 v3, v25

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 33
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li5;->E1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 34
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_1

    .line 35
    iget-object v0, v13, Lt0;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Li5;->U(Ljava/io/File;)V

    const/16 v0, 0x3e80

    .line 36
    :try_start_c
    invoke-static {v1, v7, v0, v8, v6}, Li5;->S(Landroid/content/Context;Ljava/io/File;IILve;)Lt0;

    move-result-object v2
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 37
    :try_start_d
    iget-wide v3, v2, Lt0;->a:J

    cmp-long v3, v3, v19

    if-ltz v3, :cond_3

    .line 38
    invoke-static {v7, v14, v15, v10, v11}, Li5;->d2(Ljava/io/File;JJ)V
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_2

    .line 39
    :try_start_e
    const-string v3, "Elaris-local-audio-amr-wb-"
    :try_end_e
    .catch Ljava/io/IOException; {:try_start_e .. :try_end_e} :catch_6
    .catchall {:try_start_e .. :try_end_e} :catchall_2

    move-object/from16 v4, v17

    :try_start_f
    invoke-static {v9, v3, v4}, Li5;->j1(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 40
    iget-object v5, v2, Lt0;->c:Ljava/io/Serializable;

    check-cast v5, Ljava/io/File;

    const/4 v12, 0x1

    invoke-static {v5, v3, v12, v6}, Li5;->f0(Ljava/io/File;Ljava/io/File;ZLve;)V

    .line 41
    const-string v5, "amr-wb"

    iget v12, v2, Lt0;->b:I

    invoke-static {v5, v0, v8, v12, v3}, Li5;->Y0(Ljava/lang/String;IIILjava/io/File;)V

    .line 42
    new-instance v0, Lna;

    iget v5, v2, Lt0;->b:I

    invoke-direct {v0, v3, v5}, Lna;-><init>(Ljava/io/File;I)V
    :try_end_f
    .catch Ljava/io/IOException; {:try_start_f .. :try_end_f} :catch_5
    .catchall {:try_start_f .. :try_end_f} :catchall_2

    .line 43
    iget-object v1, v2, Lt0;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/io/File;

    invoke-static {v1}, Li5;->U(Ljava/io/File;)V

    goto :goto_3

    :catchall_2
    move-exception v0

    goto/16 :goto_6

    :catch_5
    move-exception v0

    goto :goto_2

    :catch_6
    move-exception v0

    move-object/from16 v4, v17

    .line 44
    :goto_2
    :try_start_10
    invoke-static {v6}, Li5;->y(Lve;)V

    .line 45
    invoke-static {v0}, Li5;->K0(Ljava/io/IOException;)Z

    move-result v3

    if-eqz v3, :cond_2

    .line 46
    new-instance v3, Ljava/lang/StringBuilder;

    move-object/from16 v5, v24

    invoke-direct {v3, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Li5;->E1(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 48
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_2

    .line 49
    iget-object v0, v2, Lt0;->c:Ljava/io/Serializable;

    check-cast v0, Ljava/io/File;

    invoke-static {v0}, Li5;->U(Ljava/io/File;)V

    const/16 v0, 0x2fa8

    const/16 v2, 0x1f40

    .line 50
    :try_start_11
    invoke-static {v1, v7, v2, v0, v6}, Li5;->S(Landroid/content/Context;Ljava/io/File;IILve;)Lt0;

    move-result-object v1
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_4

    .line 51
    :try_start_12
    iget-wide v12, v1, Lt0;->a:J

    cmp-long v3, v12, v19

    if-ltz v3, :cond_0

    .line 52
    invoke-static {v7, v14, v15, v10, v11}, Li5;->d2(Ljava/io/File;JJ)V

    .line 53
    const-string v3, "Elaris-local-audio-amr-nb-"

    invoke-static {v9, v3, v4}, Li5;->j1(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Ljava/io/File;

    move-result-object v3

    .line 54
    iget-object v4, v1, Lt0;->c:Ljava/io/Serializable;

    check-cast v4, Ljava/io/File;

    const/4 v5, 0x0

    invoke-static {v4, v3, v5, v6}, Li5;->f0(Ljava/io/File;Ljava/io/File;ZLve;)V

    .line 55
    const-string v4, "amr-nb"

    iget v5, v1, Lt0;->b:I

    invoke-static {v4, v2, v0, v5, v3}, Li5;->Y0(Ljava/lang/String;IIILjava/io/File;)V

    .line 56
    new-instance v0, Lna;

    iget v2, v1, Lt0;->b:I

    invoke-direct {v0, v3, v2}, Lna;-><init>(Ljava/io/File;I)V
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_3

    .line 57
    iget-object v1, v1, Lt0;->c:Ljava/io/Serializable;

    check-cast v1, Ljava/io/File;

    invoke-static {v1}, Li5;->U(Ljava/io/File;)V

    :goto_3
    return-object v0

    :catchall_3
    move-exception v0

    goto :goto_4

    .line 58
    :cond_0
    :try_start_13
    new-instance v0, Ljava/io/IOException;

    move-object/from16 v3, v26

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_3

    :catchall_4
    move-exception v0

    move-object/from16 v1, v16

    :goto_4
    if-nez v1, :cond_1

    move-object/from16 v13, v16

    goto :goto_5

    .line 59
    :cond_1
    iget-object v1, v1, Lt0;->c:Ljava/io/Serializable;

    move-object v13, v1

    check-cast v13, Ljava/io/File;

    :goto_5
    invoke-static {v13}, Li5;->U(Ljava/io/File;)V

    .line 60
    throw v0

    .line 61
    :cond_2
    :try_start_14
    throw v0

    :cond_3
    move-object/from16 v3, v26

    .line 62
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_2

    :catchall_5
    move-exception v0

    move-object/from16 v2, v16

    :goto_6
    if-nez v2, :cond_4

    move-object/from16 v13, v16

    goto :goto_7

    .line 63
    :cond_4
    iget-object v1, v2, Lt0;->c:Ljava/io/Serializable;

    move-object v13, v1

    check-cast v13, Ljava/io/File;

    :goto_7
    invoke-static {v13}, Li5;->U(Ljava/io/File;)V

    .line 64
    throw v0

    .line 65
    :cond_5
    :try_start_15
    throw v0

    :cond_6
    move-object/from16 v3, v26

    .line 66
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_15
    .catchall {:try_start_15 .. :try_end_15} :catchall_1

    :catchall_6
    move-exception v0

    move-object/from16 v13, v16

    :goto_8
    if-nez v13, :cond_7

    move-object/from16 v13, v16

    goto :goto_9

    .line 67
    :cond_7
    iget-object v1, v13, Lt0;->c:Ljava/io/Serializable;

    move-object v13, v1

    check-cast v13, Ljava/io/File;

    :goto_9
    invoke-static {v13}, Li5;->U(Ljava/io/File;)V

    .line 68
    throw v0

    .line 69
    :cond_8
    :try_start_16
    throw v0

    :cond_9
    move-object v3, v6

    .line 70
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, v3}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    throw v0
    :try_end_16
    .catchall {:try_start_16 .. :try_end_16} :catchall_0

    :catchall_7
    move-exception v0

    move-object/from16 v13, v16

    :goto_a
    if-nez v13, :cond_a

    move-object/from16 v13, v16

    goto :goto_b

    .line 71
    :cond_a
    iget-object v1, v13, Lt0;->c:Ljava/io/Serializable;

    move-object v13, v1

    check-cast v13, Ljava/io/File;

    :goto_b
    invoke-static {v13}, Li5;->U(Ljava/io/File;)V

    .line 72
    throw v0

    :cond_b
    const/16 v16, 0x0

    .line 73
    const-string v0, "audio source empty"

    invoke-static {v0}, Lu2;->c(Ljava/lang/String;)V

    return-object v16

    :cond_c
    const/16 v16, 0x0

    .line 74
    const-string v0, "audio source missing"

    invoke-static {v0}, Lu2;->c(Ljava/lang/String;)V

    return-object v16
.end method

.method public static Y(Ljava/lang/String;)Z
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 7
    .line 8
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    const-string v0, "audio/"

    .line 17
    .line 18
    invoke-virtual {p0, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    if-nez v0, :cond_2

    .line 23
    .line 24
    const-string v0, "application/ogg"

    .line 25
    .line 26
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-eqz p0, :cond_1

    .line 31
    .line 32
    goto :goto_1

    .line 33
    :cond_1
    const/4 p0, 0x0

    .line 34
    return p0

    .line 35
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public static Y0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, "com.tencent.relation.common.api.IRelationNTUinAndUidApi"

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->C0(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    const-string v0, "getUidFromUin"

    .line 11
    .line 12
    const-string v1, "getFriendUidFromUin"

    .line 13
    .line 14
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    const/4 v1, 0x0

    .line 19
    :goto_0
    const/4 v2, 0x2

    .line 20
    if-ge v1, v2, :cond_2

    .line 21
    .line 22
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    aget-object v3, v0, v1

    .line 27
    .line 28
    const-class v4, Ljava/lang/String;

    .line 29
    .line 30
    filled-new-array {v4}, [Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    const/4 v3, 0x1

    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 40
    .line 41
    .line 42
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {v2, p0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    instance-of v3, v2, Ljava/lang/String;

    .line 51
    .line 52
    if-eqz v3, :cond_1

    .line 53
    .line 54
    move-object v3, v2

    .line 55
    check-cast v3, Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v3}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v3

    .line 61
    if-lez v3, :cond_1

    .line 62
    .line 63
    check-cast v2, Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 64
    .line 65
    return-object v2

    .line 66
    :catchall_0
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    :goto_1
    const-string p0, ""

    .line 70
    .line 71
    return-object p0
.end method

.method public static Z(Ljava/lang/String;)Z
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto :goto_1

    .line 9
    :cond_0
    move v0, v1

    .line 10
    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v2

    .line 14
    if-ge v0, v2, :cond_2

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    invoke-static {v2}, Ljava/lang/Character;->isDigit(C)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-nez v2, :cond_1

    .line 25
    .line 26
    :goto_1
    return v1

    .line 27
    :cond_1
    add-int/lit8 v0, v0, 0x1

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_2
    const/4 p0, 0x1

    .line 31
    return p0
.end method

.method public static Z0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-eqz p0, :cond_1

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

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
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/Character;->toUpperCase(C)C

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const/4 v1, 0x1

    .line 28
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object p0

    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    :goto_0
    const-string p0, ""

    .line 41
    .line 42
    return-object p0
.end method

.method public static a(Lec;Landroid/content/Context;Ljava/lang/Object;Ljava/util/List;Ljava/lang/reflect/Field;Ljava/lang/String;)Ljava/lang/Object;
    .locals 10

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    iget-object v2, p0, Lec;->a:Ljava/lang/reflect/Constructor;

    .line 4
    .line 5
    iget p0, p0, Lec;->b:I

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    filled-new-array {p1, p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    if-ne p0, v1, :cond_1

    .line 19
    .line 20
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    const/4 p2, 0x2

    .line 30
    if-ne p0, p2, :cond_2

    .line 31
    .line 32
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {v2, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    goto :goto_0

    .line 41
    :cond_2
    invoke-virtual {v2, v0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    :goto_0
    invoke-static {p0, p5, p4}, Lcom/mr/elaris/w;->f0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Field;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    .line 48
    return-object p0

    .line 49
    :catchall_0
    move-exception p0

    .line 50
    const/4 p1, 0x0

    .line 51
    move p2, p1

    .line 52
    :goto_1
    invoke-interface {p3}, Ljava/util/List;->size()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-ge p2, v2, :cond_e

    .line 57
    .line 58
    invoke-interface {p3, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    move-result-object v2

    .line 62
    if-eqz v2, :cond_d

    .line 63
    .line 64
    invoke-static {v2}, Lcom/mr/elaris/w;->p0(Ljava/lang/Object;)Lv9;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    if-eqz v3, :cond_3

    .line 69
    .line 70
    goto/16 :goto_8

    .line 71
    .line 72
    :cond_3
    invoke-static {p1, v2}, Lcom/mr/elaris/w;->x0(ILjava/lang/Object;)Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    move-result-object v3

    .line 76
    const-string v4, "\u4fdd\u5b58\u8bed\u97f3"

    .line 77
    .line 78
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_d

    .line 83
    .line 84
    const-string v4, "\u8f6c\u53d1\u8bed\u97f3"

    .line 85
    .line 86
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_4

    .line 91
    .line 92
    goto/16 :goto_8

    .line 93
    .line 94
    :cond_4
    :try_start_1
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 95
    .line 96
    .line 97
    move-result-object v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_3

    .line 98
    :try_start_2
    invoke-virtual {v3}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    move v5, p1

    .line 103
    :goto_2
    array-length v6, v4

    .line 104
    if-ge v5, v6, :cond_7

    .line 105
    .line 106
    aget-object v6, v4, v5

    .line 107
    .line 108
    invoke-virtual {v6}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v7

    .line 112
    array-length v8, v7

    .line 113
    const/4 v9, 0x4

    .line 114
    if-le v8, v9, :cond_5

    .line 115
    .line 116
    add-int/lit8 v5, v5, 0x1

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    array-length v3, v7

    .line 120
    new-array v3, v3, [Ljava/lang/Object;

    .line 121
    .line 122
    move v4, p1

    .line 123
    :goto_3
    array-length v5, v7

    .line 124
    if-ge v4, v5, :cond_6

    .line 125
    .line 126
    aget-object v5, v7, v4

    .line 127
    .line 128
    invoke-static {v5}, Lcom/mr/elaris/w;->r(Ljava/lang/Class;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v5

    .line 132
    aput-object v5, v3, v4

    .line 133
    .line 134
    add-int/lit8 v4, v4, 0x1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_6
    invoke-virtual {v6, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 138
    .line 139
    .line 140
    invoke-virtual {v6, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    goto :goto_4

    .line 145
    :cond_7
    invoke-virtual {v3}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    move-result-object v3
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 149
    goto :goto_4

    .line 150
    :catchall_1
    move-object v3, v0

    .line 151
    :goto_4
    if-nez v3, :cond_8

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_8
    :try_start_3
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 155
    .line 156
    .line 157
    move-result-object v4

    .line 158
    :goto_5
    if-eqz v4, :cond_c

    .line 159
    .line 160
    const-class v5, Ljava/lang/Object;

    .line 161
    .line 162
    if-eq v4, v5, :cond_c

    .line 163
    .line 164
    invoke-virtual {v4}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 165
    .line 166
    .line 167
    move-result-object v5

    .line 168
    move v6, p1

    .line 169
    :goto_6
    array-length v7, v5

    .line 170
    if-ge v6, v7, :cond_b

    .line 171
    .line 172
    aget-object v7, v5, v6

    .line 173
    .line 174
    invoke-virtual {v7}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 175
    .line 176
    .line 177
    move-result v8

    .line 178
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 179
    .line 180
    .line 181
    move-result v9

    .line 182
    if-nez v9, :cond_a

    .line 183
    .line 184
    invoke-static {v8}, Ljava/lang/reflect/Modifier;->isFinal(I)Z

    .line 185
    .line 186
    .line 187
    move-result v8
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 188
    if-eqz v8, :cond_9

    .line 189
    .line 190
    goto :goto_7

    .line 191
    :cond_9
    :try_start_4
    invoke-virtual {v7, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v7, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    .line 196
    .line 197
    move-result-object v8

    .line 198
    invoke-virtual {v7, v3, v8}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 199
    .line 200
    .line 201
    :catchall_2
    :cond_a
    :goto_7
    add-int/lit8 v6, v6, 0x1

    .line 202
    .line 203
    goto :goto_6

    .line 204
    :cond_b
    :try_start_5
    invoke-virtual {v4}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v4
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    .line 208
    goto :goto_5

    .line 209
    :cond_c
    move-object v0, v3

    .line 210
    goto :goto_9

    .line 211
    :catchall_3
    :cond_d
    :goto_8
    add-int/lit8 p2, p2, 0x1

    .line 212
    .line 213
    goto/16 :goto_1

    .line 214
    .line 215
    :cond_e
    :goto_9
    if-eqz v0, :cond_f

    .line 216
    .line 217
    invoke-static {v0, p5, p4}, Lcom/mr/elaris/w;->f0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Field;)V

    .line 218
    .line 219
    .line 220
    return-object v0

    .line 221
    :cond_f
    new-instance p1, Ljava/lang/Exception;

    .line 222
    .line 223
    invoke-direct {p1, p0}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 224
    .line 225
    .line 226
    throw p1
.end method

.method public static a0(Ljava/lang/String;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lu9;->t(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_1

    .line 6
    .line 7
    invoke-static {p0}, Lu9;->s(Ljava/lang/String;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 17
    return p0
.end method

.method public static a1(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string v0, "="

    .line 9
    .line 10
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    invoke-virtual {p0, p1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-gez v0, :cond_1

    .line 19
    .line 20
    :goto_0
    const-string p0, ""

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    add-int/2addr p1, v0

    .line 28
    move v0, p1

    .line 29
    :goto_1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    if-ge v0, v1, :cond_3

    .line 34
    .line 35
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    const/16 v2, 0x2c

    .line 40
    .line 41
    if-eq v1, v2, :cond_3

    .line 42
    .line 43
    const/16 v2, 0x29

    .line 44
    .line 45
    if-eq v1, v2, :cond_3

    .line 46
    .line 47
    const/16 v2, 0x7d

    .line 48
    .line 49
    if-ne v1, v2, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    add-int/lit8 v0, v0, 0x1

    .line 53
    .line 54
    goto :goto_1

    .line 55
    :cond_3
    :goto_2
    invoke-virtual {p0, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    const/4 v0, 0x2

    .line 68
    if-lt p1, v0, :cond_6

    .line 69
    .line 70
    const/4 p1, 0x0

    .line 71
    invoke-virtual {p0, p1}, Ljava/lang/String;->charAt(I)C

    .line 72
    .line 73
    .line 74
    move-result p1

    .line 75
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 76
    .line 77
    .line 78
    move-result v0

    .line 79
    const/4 v1, 0x1

    .line 80
    sub-int/2addr v0, v1

    .line 81
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    .line 82
    .line 83
    .line 84
    move-result v0

    .line 85
    const/16 v2, 0x27

    .line 86
    .line 87
    if-ne p1, v2, :cond_4

    .line 88
    .line 89
    if-eq v0, v2, :cond_5

    .line 90
    .line 91
    :cond_4
    const/16 v2, 0x22

    .line 92
    .line 93
    if-ne p1, v2, :cond_6

    .line 94
    .line 95
    if-ne v0, v2, :cond_6

    .line 96
    .line 97
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 98
    .line 99
    .line 100
    move-result p1

    .line 101
    sub-int/2addr p1, v1

    .line 102
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 103
    .line 104
    .line 105
    move-result-object p0

    .line 106
    :cond_6
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object p0

    .line 110
    return-object p0
.end method

.method public static b(Ljava/lang/ClassLoader;Lv9;)V
    .locals 6

    .line 1
    const-string v0, "voice_message_actions"

    .line 2
    .line 3
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->runtimeBool(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto/16 :goto_2

    .line 10
    .line 11
    :cond_0
    iget-object v0, p1, Lv9;->b:Ljava/lang/Object;

    .line 12
    .line 13
    invoke-static {v0}, Lcom/mr/elaris/w;->B0(Ljava/lang/Object;)Llb;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    if-eqz v0, :cond_7

    .line 18
    .line 19
    iget-object v1, v0, Llb;->a:Ljava/io/File;

    .line 20
    .line 21
    if-eqz v1, :cond_7

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/io/File;->exists()Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_1

    .line 28
    .line 29
    goto/16 :goto_3

    .line 30
    .line 31
    :cond_1
    iget p1, p1, Lv9;->a:I

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    if-ne p1, v2, :cond_2

    .line 35
    .line 36
    new-instance p0, Ljava/lang/Thread;

    .line 37
    .line 38
    new-instance p1, Lh0;

    .line 39
    .line 40
    const/16 v1, 0x9

    .line 41
    .line 42
    invoke-direct {p1, v1, v0}, Lh0;-><init>(ILjava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    const-string v0, "Elaris-VoiceSave"

    .line 46
    .line 47
    invoke-direct {p0, p1, v0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V

    .line 51
    .line 52
    .line 53
    return-void

    .line 54
    :cond_2
    const/4 v3, 0x2

    .line 55
    if-ne p1, v3, :cond_6

    .line 56
    .line 57
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 58
    .line 59
    .line 60
    move-result-object p1

    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    invoke-static {}, Lcom/mr/elaris/HookEntry;->hostContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    :cond_3
    if-nez p1, :cond_4

    .line 68
    .line 69
    const-string p0, "voice forward failed reason=context missing"

    .line 70
    .line 71
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_4
    :try_start_0
    const-string v4, "com.tencent.mobileqq.activity.ForwardRecentActivity"

    .line 76
    .line 77
    invoke-static {v4, p0}, Lcom/mr/elaris/xposedcompat/XposedHelpers;->findClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object p0

    .line 81
    new-instance v4, Landroid/content/Intent;

    .line 82
    .line 83
    invoke-direct {v4, p1, p0}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    const-string p0, "selection_mode"

    .line 87
    .line 88
    invoke-virtual {v4, p0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 89
    .line 90
    .line 91
    const-string p0, "direct_send_if_dataline_forward"

    .line 92
    .line 93
    const/4 v3, 0x0

    .line 94
    invoke-virtual {v4, p0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 95
    .line 96
    .line 97
    const-string p0, "forward_text"

    .line 98
    .line 99
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v5

    .line 103
    invoke-virtual {v4, p0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 104
    .line 105
    .line 106
    const-string p0, "ptt_forward_path"

    .line 107
    .line 108
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v5

    .line 112
    invoke-virtual {v4, p0, v5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 113
    .line 114
    .line 115
    const-string p0, "elaris_ptt_forward_path"

    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-virtual {v4, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 122
    .line 123
    .line 124
    const-string p0, "elaris_ptt_forward_duration"

    .line 125
    .line 126
    iget v1, v0, Llb;->c:I

    .line 127
    .line 128
    invoke-virtual {v4, p0, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 129
    .line 130
    .line 131
    const-string p0, "elaris_ptt_forward_waves"

    .line 132
    .line 133
    iget-object v0, v0, Llb;->d:[B

    .line 134
    .line 135
    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[B)Landroid/content/Intent;

    .line 136
    .line 137
    .line 138
    const-string p0, "forward_type"

    .line 139
    .line 140
    const/4 v0, -0x1

    .line 141
    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 142
    .line 143
    .line 144
    const-string p0, "caller_name"

    .line 145
    .line 146
    const-string v0, "ChatActivity"

    .line 147
    .line 148
    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 149
    .line 150
    .line 151
    const-string p0, "k_smartdevice"

    .line 152
    .line 153
    invoke-virtual {v4, p0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 154
    .line 155
    .line 156
    const-string p0, "k_dataline"

    .line 157
    .line 158
    invoke-virtual {v4, p0, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 159
    .line 160
    .line 161
    const-string p0, "is_need_show_toast"

    .line 162
    .line 163
    invoke-virtual {v4, p0, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 164
    .line 165
    .line 166
    const-string p0, "k_forward_title"

    .line 167
    .line 168
    const-string v0, "\u8f6c\u53d1\u8bed\u97f3"

    .line 169
    .line 170
    invoke-virtual {v4, p0, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 171
    .line 172
    .line 173
    instance-of p0, p1, Landroid/app/Activity;

    .line 174
    .line 175
    if-nez p0, :cond_5

    .line 176
    .line 177
    const/high16 p0, 0x10000000

    .line 178
    .line 179
    invoke-virtual {v4, p0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 180
    .line 181
    .line 182
    goto :goto_0

    .line 183
    :catchall_0
    move-exception p0

    .line 184
    goto :goto_1

    .line 185
    :cond_5
    :goto_0
    invoke-virtual {p1, v4}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 186
    .line 187
    .line 188
    return-void

    .line 189
    :goto_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 190
    .line 191
    const-string v1, "voice forward start failed reason="

    .line 192
    .line 193
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    move-result-object v1

    .line 200
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 201
    .line 202
    .line 203
    move-result-object v1

    .line 204
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    .line 206
    .line 207
    const-string v1, ": "

    .line 208
    .line 209
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 213
    .line 214
    .line 215
    move-result-object p0

    .line 216
    invoke-static {p0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 217
    .line 218
    .line 219
    move-result-object p0

    .line 220
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-static {p0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V

    .line 228
    .line 229
    .line 230
    const-string p0, "\u672a\u627e\u5230 QQ \u8bed\u97f3\u8f6c\u53d1\u5165\u53e3"

    .line 231
    .line 232
    invoke-static {p1, p0}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 233
    .line 234
    .line 235
    :cond_6
    :goto_2
    return-void

    .line 236
    :cond_7
    :goto_3
    invoke-static {}, Lcom/mr/elaris/HookEntry;->topActivity()Landroid/app/Activity;

    .line 237
    .line 238
    .line 239
    move-result-object p0

    .line 240
    const-string p1, "\u8bed\u97f3\u672a\u4e0b\u8f7d\uff0c\u5148\u64ad\u653e\u4e00\u6b21\u518d\u8bd5"

    .line 241
    .line 242
    invoke-static {p0, p1}, Lcom/mr/elaris/w;->W0(Landroid/content/Context;Ljava/lang/String;)V

    .line 243
    .line 244
    .line 245
    return-void
.end method

.method public static b0(Ljava/lang/Class;)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v1, "com.tencent.qqnt.kernel.nativeinterface.PttElement"

    .line 10
    .line 11
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    const-string v1, "com.tencent.qqnt.kernelpublic.nativeinterface.PttElement"

    .line 18
    .line 19
    invoke-virtual {v1, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_2

    .line 24
    .line 25
    const-string v1, ".PttElement"

    .line 26
    .line 27
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-eqz p0, :cond_1

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    return v0

    .line 35
    :cond_2
    :goto_0
    const/4 p0, 0x1

    .line 36
    return p0
.end method

.method public static c(Landroid/content/Context;Ln9;Lve;)Lna;
    .locals 12

    .line 1
    iget-object v0, p1, Ln9;->e:Ljava/lang/String;

    .line 2
    .line 3
    iget-object v1, p1, Ln9;->c:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v2, p1, Ln9;->a:Ljava/io/File;

    .line 6
    .line 7
    if-eqz v2, :cond_1

    .line 8
    .line 9
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 10
    .line 11
    .line 12
    move-result v3

    .line 13
    if-eqz v3, :cond_1

    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/io/File;->isFile()Z

    .line 16
    .line 17
    .line 18
    move-result v3

    .line 19
    if-eqz v3, :cond_1

    .line 20
    .line 21
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1, v0}, Lcom/mr/elaris/w;->N0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    if-eqz p1, :cond_0

    .line 30
    .line 31
    invoke-static {p0, v2, p2}, Lcom/mr/elaris/w;->X0(Landroid/content/Context;Ljava/io/File;Lve;)Lna;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    return-object p0

    .line 36
    :cond_0
    invoke-static {p0, v2, p2}, Lcom/mr/elaris/w;->z0(Landroid/content/Context;Ljava/io/File;Lve;)Lna;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    return-object p0

    .line 41
    :cond_1
    iget-object v2, p1, Ln9;->b:Landroid/net/Uri;

    .line 42
    .line 43
    const/4 v3, 0x0

    .line 44
    if-eqz v2, :cond_19

    .line 45
    .line 46
    iget-wide v4, p1, Ln9;->f:J

    .line 47
    .line 48
    if-eqz p0, :cond_15

    .line 49
    .line 50
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 55
    .line 56
    .line 57
    move-result v6

    .line 58
    if-nez v6, :cond_c

    .line 59
    .line 60
    sget-object p1, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 61
    .line 62
    invoke-virtual {v0, p1}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-string v6, "mpeg"

    .line 67
    .line 68
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 69
    .line 70
    .line 71
    move-result v6

    .line 72
    if-nez v6, :cond_b

    .line 73
    .line 74
    const-string v6, "mp3"

    .line 75
    .line 76
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 77
    .line 78
    .line 79
    move-result v6

    .line 80
    if-eqz v6, :cond_2

    .line 81
    .line 82
    goto :goto_1

    .line 83
    :cond_2
    const-string v6, "mp4"

    .line 84
    .line 85
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 86
    .line 87
    .line 88
    move-result v6

    .line 89
    if-nez v6, :cond_a

    .line 90
    .line 91
    const-string v6, "m4a"

    .line 92
    .line 93
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 94
    .line 95
    .line 96
    move-result v6

    .line 97
    if-eqz v6, :cond_3

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_3
    const-string v6, "aac"

    .line 101
    .line 102
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v6

    .line 106
    if-eqz v6, :cond_4

    .line 107
    .line 108
    const-string p1, ".aac"

    .line 109
    .line 110
    goto :goto_2

    .line 111
    :cond_4
    const-string v6, "wav"

    .line 112
    .line 113
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 114
    .line 115
    .line 116
    move-result v6

    .line 117
    if-eqz v6, :cond_5

    .line 118
    .line 119
    const-string p1, ".wav"

    .line 120
    .line 121
    goto :goto_2

    .line 122
    :cond_5
    const-string v6, "flac"

    .line 123
    .line 124
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 125
    .line 126
    .line 127
    move-result v6

    .line 128
    if-eqz v6, :cond_6

    .line 129
    .line 130
    const-string p1, ".flac"

    .line 131
    .line 132
    goto :goto_2

    .line 133
    :cond_6
    const-string v6, "opus"

    .line 134
    .line 135
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 136
    .line 137
    .line 138
    move-result v6

    .line 139
    if-eqz v6, :cond_7

    .line 140
    .line 141
    const-string p1, ".opus"

    .line 142
    .line 143
    goto :goto_2

    .line 144
    :cond_7
    const-string v6, "ogg"

    .line 145
    .line 146
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 147
    .line 148
    .line 149
    move-result v6

    .line 150
    if-eqz v6, :cond_8

    .line 151
    .line 152
    const-string p1, ".ogg"

    .line 153
    .line 154
    goto :goto_2

    .line 155
    :cond_8
    const-string v6, "amr"

    .line 156
    .line 157
    invoke-virtual {p1, v6}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 158
    .line 159
    .line 160
    move-result p1

    .line 161
    if-eqz p1, :cond_9

    .line 162
    .line 163
    const-string p1, ".amr"

    .line 164
    .line 165
    goto :goto_2

    .line 166
    :cond_9
    const-string p1, ""

    .line 167
    .line 168
    goto :goto_2

    .line 169
    :cond_a
    :goto_0
    const-string p1, ".m4a"

    .line 170
    .line 171
    goto :goto_2

    .line 172
    :cond_b
    :goto_1
    const-string p1, ".mp3"

    .line 173
    .line 174
    :cond_c
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 175
    .line 176
    .line 177
    move-result v6

    .line 178
    if-nez v6, :cond_d

    .line 179
    .line 180
    const-string p1, ".audio"

    .line 181
    .line 182
    :cond_d
    invoke-static {v1, v0}, Lcom/mr/elaris/w;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result v6

    .line 186
    if-eqz v6, :cond_14

    .line 187
    .line 188
    new-instance v6, Ljava/io/File;

    .line 189
    .line 190
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 191
    .line 192
    .line 193
    move-result-object v7

    .line 194
    const-string v8, "elaris_local_voice"

    .line 195
    .line 196
    invoke-direct {v6, v7, v8}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 200
    .line 201
    .line 202
    move-result v7

    .line 203
    if-nez v7, :cond_f

    .line 204
    .line 205
    invoke-virtual {v6}, Ljava/io/File;->mkdirs()Z

    .line 206
    .line 207
    .line 208
    move-result v7

    .line 209
    if-eqz v7, :cond_e

    .line 210
    .line 211
    goto :goto_3

    .line 212
    :cond_e
    const-string p0, "voice cache mkdir failed"

    .line 213
    .line 214
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    return-object v3

    .line 218
    :cond_f
    :goto_3
    invoke-static {v6}, Lcom/mr/elaris/w;->j(Ljava/io/File;)V

    .line 219
    .line 220
    .line 221
    sget-object v7, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 222
    .line 223
    invoke-virtual {p1, v7}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 224
    .line 225
    .line 226
    move-result-object p1

    .line 227
    const-string v7, "Elaris-local-media-"

    .line 228
    .line 229
    invoke-static {v7, p1, v6}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 230
    .line 231
    .line 232
    move-result-object p1

    .line 233
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 234
    .line 235
    .line 236
    move-result-object v7

    .line 237
    invoke-virtual {v7, v2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    .line 238
    .line 239
    .line 240
    move-result-object v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 241
    if-eqz v2, :cond_12

    .line 242
    .line 243
    :try_start_1
    new-instance v7, Ljava/io/FileOutputStream;

    .line 244
    .line 245
    invoke-direct {v7, p1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 246
    .line 247
    .line 248
    :try_start_2
    invoke-static {v4, v5, v6}, Lcom/mr/elaris/w;->u(JLjava/io/File;)V

    .line 249
    .line 250
    .line 251
    invoke-static {v2, v7, p1, p2}, Lcom/mr/elaris/w;->n(Ljava/io/InputStream;Ljava/io/FileOutputStream;Ljava/io/File;Lve;)J

    .line 252
    .line 253
    .line 254
    move-result-wide v8

    .line 255
    const-wide/16 v10, 0x0

    .line 256
    .line 257
    cmp-long v3, v4, v10

    .line 258
    .line 259
    if-lez v3, :cond_11

    .line 260
    .line 261
    cmp-long v3, v8, v4

    .line 262
    .line 263
    if-nez v3, :cond_10

    .line 264
    .line 265
    goto :goto_6

    .line 266
    :cond_10
    new-instance p0, Ljava/io/IOException;

    .line 267
    .line 268
    const-string p2, "voice source changed or incomplete"

    .line 269
    .line 270
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    throw p0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 274
    :catchall_0
    move-exception p0

    .line 275
    :goto_4
    move-object v3, v2

    .line 276
    goto :goto_9

    .line 277
    :catch_0
    move-exception p0

    .line 278
    :goto_5
    move-object v3, v2

    .line 279
    goto :goto_7

    .line 280
    :cond_11
    :goto_6
    invoke-static {v2}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 281
    .line 282
    .line 283
    invoke-static {v7}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 284
    .line 285
    .line 286
    move-object v3, p1

    .line 287
    goto :goto_a

    .line 288
    :catchall_1
    move-exception p0

    .line 289
    move-object v7, v3

    .line 290
    goto :goto_4

    .line 291
    :catch_1
    move-exception p0

    .line 292
    move-object v7, v3

    .line 293
    goto :goto_5

    .line 294
    :cond_12
    :try_start_3
    new-instance p0, Ljava/io/IOException;

    .line 295
    .line 296
    const-string p2, "voice uri open failed"

    .line 297
    .line 298
    invoke-direct {p0, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 299
    .line 300
    .line 301
    throw p0
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 302
    :catchall_2
    move-exception p0

    .line 303
    move-object v7, v3

    .line 304
    goto :goto_9

    .line 305
    :catch_2
    move-exception p0

    .line 306
    move-object v7, v3

    .line 307
    :goto_7
    :try_start_4
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 308
    .line 309
    .line 310
    move-result p2

    .line 311
    if-eqz p2, :cond_13

    .line 312
    .line 313
    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    .line 314
    .line 315
    .line 316
    goto :goto_8

    .line 317
    :catchall_3
    move-exception p0

    .line 318
    goto :goto_9

    .line 319
    :cond_13
    :goto_8
    throw p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 320
    :goto_9
    invoke-static {v3}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 321
    .line 322
    .line 323
    invoke-static {v7}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 324
    .line 325
    .line 326
    throw p0

    .line 327
    :cond_14
    const-string p0, "unsupported voice extension: "

    .line 328
    .line 329
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 330
    .line 331
    .line 332
    move-result-object p0

    .line 333
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    return-object v3

    .line 337
    :cond_15
    :goto_a
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 338
    .line 339
    .line 340
    move-result-object p1

    .line 341
    invoke-static {p1, v0}, Lcom/mr/elaris/w;->N0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 342
    .line 343
    .line 344
    move-result p1

    .line 345
    if-nez p1, :cond_16

    .line 346
    .line 347
    invoke-static {p0, v3, p2}, Lcom/mr/elaris/w;->z0(Landroid/content/Context;Ljava/io/File;Lve;)Lna;

    .line 348
    .line 349
    .line 350
    move-result-object p0

    .line 351
    return-object p0

    .line 352
    :cond_16
    :try_start_5
    invoke-static {p0, v3, p2}, Lcom/mr/elaris/w;->X0(Landroid/content/Context;Ljava/io/File;Lve;)Lna;

    .line 353
    .line 354
    .line 355
    move-result-object p0
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 356
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 357
    .line 358
    .line 359
    move-result p1

    .line 360
    if-eqz p1, :cond_17

    .line 361
    .line 362
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 363
    .line 364
    .line 365
    :cond_17
    return-object p0

    .line 366
    :catchall_4
    move-exception p0

    .line 367
    if-eqz v3, :cond_18

    .line 368
    .line 369
    invoke-virtual {v3}, Ljava/io/File;->exists()Z

    .line 370
    .line 371
    .line 372
    move-result p1

    .line 373
    if-eqz p1, :cond_18

    .line 374
    .line 375
    invoke-virtual {v3}, Ljava/io/File;->delete()Z

    .line 376
    .line 377
    .line 378
    :cond_18
    throw p0

    .line 379
    :cond_19
    const-string p0, "voice source missing"

    .line 380
    .line 381
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 382
    .line 383
    .line 384
    return-object v3
.end method

.method public static c0(Landroid/view/View;I)Z
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_a

    .line 3
    .line 4
    const/4 v1, 0x3

    .line 5
    if-le p1, v1, :cond_0

    .line 6
    .line 7
    goto/16 :goto_2

    .line 8
    .line 9
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-virtual {p0}, Landroid/view/View;->getContentDescription()Ljava/lang/CharSequence;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :catchall_0
    :cond_1
    instance-of v2, p0, Landroid/widget/TextView;

    .line 24
    .line 25
    const/16 v3, 0x20

    .line 26
    .line 27
    if-eqz v2, :cond_3

    .line 28
    .line 29
    :try_start_1
    move-object v2, p0

    .line 30
    check-cast v2, Landroid/widget/TextView;

    .line 31
    .line 32
    invoke-virtual {v2}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    if-eqz v2, :cond_2

    .line 37
    .line 38
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :cond_2
    move-object v2, p0

    .line 45
    check-cast v2, Landroid/widget/TextView;

    .line 46
    .line 47
    invoke-virtual {v2}, Landroid/widget/TextView;->getHint()Ljava/lang/CharSequence;

    .line 48
    .line 49
    .line 50
    move-result-object v2

    .line 51
    if-eqz v2, :cond_3

    .line 52
    .line 53
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;)Ljava/lang/StringBuilder;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 57
    .line 58
    .line 59
    :catchall_1
    :cond_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-static {v1}, Lcom/mr/elaris/w;->m(Ljava/lang/String;)Z

    .line 64
    .line 65
    .line 66
    move-result v1

    .line 67
    const/4 v2, 0x1

    .line 68
    if-nez v1, :cond_9

    .line 69
    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    .line 71
    .line 72
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 73
    .line 74
    .line 75
    :try_start_2
    invoke-virtual {p0}, Landroid/view/View;->getId()I

    .line 76
    .line 77
    .line 78
    move-result v4

    .line 79
    const/4 v5, -0x1

    .line 80
    if-eq v4, v5, :cond_4

    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 83
    .line 84
    .line 85
    move-result-object v5

    .line 86
    invoke-virtual {v5, v4}, Landroid/content/res/Resources;->getResourceEntryName(I)Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v4

    .line 90
    invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 91
    .line 92
    .line 93
    :catchall_2
    :cond_4
    :try_start_3
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v3

    .line 100
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 105
    .line 106
    .line 107
    :catchall_3
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-static {v1}, Lcom/mr/elaris/w;->m(Ljava/lang/String;)Z

    .line 112
    .line 113
    .line 114
    move-result v1

    .line 115
    if-eqz v1, :cond_5

    .line 116
    .line 117
    goto :goto_1

    .line 118
    :cond_5
    instance-of v1, p0, Landroid/view/ViewGroup;

    .line 119
    .line 120
    if-nez v1, :cond_6

    .line 121
    .line 122
    return v0

    .line 123
    :cond_6
    check-cast p0, Landroid/view/ViewGroup;

    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    const/16 v3, 0xc

    .line 130
    .line 131
    invoke-static {v1, v3}, Ljava/lang/Math;->min(II)I

    .line 132
    .line 133
    .line 134
    move-result v1

    .line 135
    move v3, v0

    .line 136
    :goto_0
    if-ge v3, v1, :cond_8

    .line 137
    .line 138
    invoke-virtual {p0, v3}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 139
    .line 140
    .line 141
    move-result-object v4

    .line 142
    add-int/lit8 v5, p1, 0x1

    .line 143
    .line 144
    invoke-static {v4, v5}, Lcom/mr/elaris/w;->c0(Landroid/view/View;I)Z

    .line 145
    .line 146
    .line 147
    move-result v4

    .line 148
    if-eqz v4, :cond_7

    .line 149
    .line 150
    return v2

    .line 151
    :cond_7
    add-int/lit8 v3, v3, 0x1

    .line 152
    .line 153
    goto :goto_0

    .line 154
    :cond_8
    return v0

    .line 155
    :cond_9
    :goto_1
    return v2

    .line 156
    :cond_a
    :goto_2
    return v0
.end method

.method public static d(Landroid/content/Context;Lw6;)V
    .locals 6

    .line 1
    if-eqz p0, :cond_e

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    goto/16 :goto_6

    .line 6
    .line 7
    :cond_0
    iget-object v0, p1, Lw6;->c:Ljava/lang/Comparable;

    .line 8
    .line 9
    check-cast v0, Landroid/net/Uri;

    .line 10
    .line 11
    iget-object v1, p1, Lw6;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v1, Landroid/net/Uri;

    .line 14
    .line 15
    invoke-virtual {p1}, Lw6;->e()Z

    .line 16
    .line 17
    .line 18
    move-result v2

    .line 19
    const-string v3, "elaris_local_voice_state"

    .line 20
    .line 21
    const/4 v4, 0x0

    .line 22
    if-nez v2, :cond_5

    .line 23
    .line 24
    iget-object p1, p1, Lw6;->a:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, Ljava/io/File;

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    .line 30
    goto/16 :goto_6

    .line 31
    .line 32
    :cond_1
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    if-eqz v0, :cond_2

    .line 37
    .line 38
    invoke-virtual {p1}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    :cond_2
    if-eqz p1, :cond_e

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 45
    .line 46
    .line 47
    move-result v0

    .line 48
    if-eqz v0, :cond_e

    .line 49
    .line 50
    invoke-virtual {p1}, Ljava/io/File;->isDirectory()Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_e

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/io/File;->canRead()Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    if-nez v0, :cond_3

    .line 61
    .line 62
    goto/16 :goto_6

    .line 63
    .line 64
    :cond_3
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    if-nez v0, :cond_4

    .line 69
    .line 70
    goto :goto_0

    .line 71
    :cond_4
    move-object p0, v0

    .line 72
    :goto_0
    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 73
    .line 74
    .line 75
    move-result-object p0

    .line 76
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    const-string v0, "last_dir"

    .line 81
    .line 82
    invoke-static {p1}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p1

    .line 86
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 87
    .line 88
    .line 89
    move-result-object p0

    .line 90
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    .line 92
    .line 93
    return-void

    .line 94
    :cond_5
    if-eqz v1, :cond_e

    .line 95
    .line 96
    if-nez v0, :cond_6

    .line 97
    .line 98
    goto/16 :goto_6

    .line 99
    .line 100
    :cond_6
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->L(Landroid/content/Context;Landroid/net/Uri;)Z

    .line 101
    .line 102
    .line 103
    move-result v2

    .line 104
    if-nez v2, :cond_7

    .line 105
    .line 106
    invoke-static {p0}, Lcom/mr/elaris/w;->k(Landroid/content/Context;)V

    .line 107
    .line 108
    .line 109
    return-void

    .line 110
    :cond_7
    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 111
    .line 112
    .line 113
    move-result-object v2

    .line 114
    if-nez v2, :cond_8

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_8
    move-object p0, v2

    .line 118
    :goto_1
    invoke-virtual {p0, v3, v4}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 119
    .line 120
    .line 121
    move-result-object p0

    .line 122
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    const-string v2, "tree_uri"

    .line 127
    .line 128
    invoke-virtual {v1}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-interface {p0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 133
    .line 134
    .line 135
    move-result-object p0

    .line 136
    const-string v1, "tree_doc_uri"

    .line 137
    .line 138
    invoke-virtual {v0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v0

    .line 142
    invoke-interface {p0, v1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 143
    .line 144
    .line 145
    move-result-object p0

    .line 146
    const-string v0, "tree_parent_docs"

    .line 147
    .line 148
    iget-object v1, p1, Lw6;->d:Ljava/io/Serializable;

    .line 149
    .line 150
    check-cast v1, Ljava/util/ArrayList;

    .line 151
    .line 152
    if-eqz v1, :cond_d

    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 155
    .line 156
    .line 157
    move-result v2

    .line 158
    if-eqz v2, :cond_9

    .line 159
    .line 160
    goto :goto_4

    .line 161
    :cond_9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 162
    .line 163
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 164
    .line 165
    .line 166
    :goto_2
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 167
    .line 168
    .line 169
    move-result v3

    .line 170
    if-ge v4, v3, :cond_c

    .line 171
    .line 172
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    move-result-object v3

    .line 176
    check-cast v3, Landroid/net/Uri;

    .line 177
    .line 178
    if-nez v3, :cond_a

    .line 179
    .line 180
    goto :goto_3

    .line 181
    :cond_a
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I

    .line 182
    .line 183
    .line 184
    move-result v5

    .line 185
    if-lez v5, :cond_b

    .line 186
    .line 187
    const/16 v5, 0xa

    .line 188
    .line 189
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 190
    .line 191
    .line 192
    :cond_b
    invoke-virtual {v3}, Landroid/net/Uri;->toString()Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v3

    .line 196
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    :goto_3
    add-int/lit8 v4, v4, 0x1

    .line 200
    .line 201
    goto :goto_2

    .line 202
    :cond_c
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 203
    .line 204
    .line 205
    move-result-object v1

    .line 206
    goto :goto_5

    .line 207
    :cond_d
    :goto_4
    const-string v1, ""

    .line 208
    .line 209
    :goto_5
    invoke-interface {p0, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 210
    .line 211
    .line 212
    move-result-object p0

    .line 213
    const-string v0, "tree_segments"

    .line 214
    .line 215
    iget-object p1, p1, Lw6;->e:Ljava/lang/Object;

    .line 216
    .line 217
    check-cast p1, Ljava/util/ArrayList;

    .line 218
    .line 219
    invoke-static {p1}, Lcom/mr/elaris/w;->e0(Ljava/util/ArrayList;)Ljava/lang/String;

    .line 220
    .line 221
    .line 222
    move-result-object p1

    .line 223
    invoke-interface {p0, v0, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 224
    .line 225
    .line 226
    move-result-object p0

    .line 227
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 228
    .line 229
    .line 230
    :catchall_0
    :cond_e
    :goto_6
    return-void
.end method

.method public static d0(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p0}, Lcom/mr/elaris/w;->a0(Ljava/lang/String;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-nez p0, :cond_1

    .line 10
    .line 11
    invoke-static {p1}, Lcom/mr/elaris/w;->Y(Ljava/lang/String;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return p0

    .line 20
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 21
    return p0
.end method

.method public static e(Landroid/view/View;)Landroid/app/Activity;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    move-object p0, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    :goto_0
    const/4 v1, 0x0

    .line 11
    :goto_1
    if-eqz p0, :cond_3

    .line 12
    .line 13
    const/16 v2, 0x8

    .line 14
    .line 15
    if-ge v1, v2, :cond_3

    .line 16
    .line 17
    instance-of v2, p0, Landroid/app/Activity;

    .line 18
    .line 19
    if-eqz v2, :cond_1

    .line 20
    .line 21
    check-cast p0, Landroid/app/Activity;

    .line 22
    .line 23
    return-object p0

    .line 24
    :cond_1
    instance-of v2, p0, Landroid/content/ContextWrapper;

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_2
    check-cast p0, Landroid/content/ContextWrapper;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/content/ContextWrapper;->getBaseContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    add-int/lit8 v1, v1, 0x1

    .line 36
    .line 37
    goto :goto_1

    .line 38
    :cond_3
    :goto_2
    return-object v0
.end method

.method public static e0(Ljava/util/ArrayList;)Ljava/lang/String;
    .locals 4

    .line 1
    if-eqz p0, :cond_5

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    goto :goto_2

    .line 10
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    .line 15
    const/4 v1, 0x0

    .line 16
    :goto_0
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-ge v1, v2, :cond_4

    .line 21
    .line 22
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/String;

    .line 27
    .line 28
    if-eqz v2, :cond_3

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 31
    .line 32
    .line 33
    move-result v3

    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I

    .line 38
    .line 39
    .line 40
    move-result v3

    .line 41
    if-lez v3, :cond_2

    .line 42
    .line 43
    const/16 v3, 0xa

    .line 44
    .line 45
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v2

    .line 52
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_3
    :goto_1
    add-int/lit8 v1, v1, 0x1

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_4
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0

    .line 63
    :cond_5
    :goto_2
    const-string p0, ""

    .line 64
    .line 65
    return-object p0
.end method

.method public static f(Landroid/app/Activity;Landroid/widget/LinearLayout;Ljava/lang/String;Ljava/lang/String;Landroid/view/View$OnClickListener;Lfe;)V
    .locals 16

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v3, p4

    .line 8
    .line 9
    move-object/from16 v4, p5

    .line 10
    .line 11
    new-instance v5, Landroid/widget/LinearLayout;

    .line 12
    .line 13
    invoke-direct {v5, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 14
    .line 15
    .line 16
    const/4 v6, 0x0

    .line 17
    invoke-virtual {v5, v6}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 18
    .line 19
    .line 20
    const/16 v7, 0x10

    .line 21
    .line 22
    invoke-virtual {v5, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 23
    .line 24
    .line 25
    const/high16 v8, 0x42380000    # 46.0f

    .line 26
    .line 27
    invoke-static {v0, v8}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 28
    .line 29
    .line 30
    move-result v8

    .line 31
    invoke-virtual {v5, v8}, Landroid/view/View;->setMinimumHeight(I)V

    .line 32
    .line 33
    .line 34
    const/high16 v8, 0x40e00000    # 7.0f

    .line 35
    .line 36
    invoke-static {v0, v8}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 37
    .line 38
    .line 39
    move-result v9

    .line 40
    const/high16 v10, 0x40800000    # 4.0f

    .line 41
    .line 42
    invoke-static {v0, v10}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 43
    .line 44
    .line 45
    move-result v11

    .line 46
    invoke-static {v0, v8}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 47
    .line 48
    .line 49
    move-result v12

    .line 50
    invoke-static {v0, v10}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 51
    .line 52
    .line 53
    move-result v10

    .line 54
    invoke-virtual {v5, v9, v11, v12, v10}, Landroid/view/View;->setPadding(IIII)V

    .line 55
    .line 56
    .line 57
    new-instance v9, Landroid/graphics/drawable/StateListDrawable;

    .line 58
    .line 59
    invoke-direct {v9}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 60
    .line 61
    .line 62
    const/high16 v10, 0x41600000    # 14.0f

    .line 63
    .line 64
    invoke-static {v0, v10}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 65
    .line 66
    .line 67
    move-result v11

    .line 68
    const v12, 0x10100a7

    .line 69
    .line 70
    .line 71
    filled-new-array {v12}, [I

    .line 72
    .line 73
    .line 74
    move-result-object v12

    .line 75
    invoke-static {v0}, Lu9;->o(Landroid/content/Context;)Z

    .line 76
    .line 77
    .line 78
    move-result v13

    .line 79
    if-eqz v13, :cond_0

    .line 80
    .line 81
    const v13, -0xd4d0c8

    .line 82
    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_0
    const v13, -0x100e0b

    .line 86
    .line 87
    .line 88
    :goto_0
    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    .line 89
    .line 90
    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v14, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 94
    .line 95
    .line 96
    int-to-float v11, v11

    .line 97
    invoke-virtual {v14, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v9, v12, v14}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 101
    .line 102
    .line 103
    const v12, 0x10100a1

    .line 104
    .line 105
    .line 106
    filled-new-array {v12}, [I

    .line 107
    .line 108
    .line 109
    move-result-object v12

    .line 110
    invoke-static {v0}, Lu9;->o(Landroid/content/Context;)Z

    .line 111
    .line 112
    .line 113
    move-result v13

    .line 114
    if-eqz v13, :cond_1

    .line 115
    .line 116
    const v13, -0xcfcbc2

    .line 117
    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_1
    const v13, -0xd0b09

    .line 121
    .line 122
    .line 123
    :goto_1
    new-instance v14, Landroid/graphics/drawable/GradientDrawable;

    .line 124
    .line 125
    invoke-direct {v14}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v14, v13}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {v14, v11}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v9, v12, v14}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 135
    .line 136
    .line 137
    new-array v11, v6, [I

    .line 138
    .line 139
    new-instance v12, Landroid/graphics/drawable/ColorDrawable;

    .line 140
    .line 141
    invoke-direct {v12, v6}, Landroid/graphics/drawable/ColorDrawable;-><init>(I)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v9, v11, v12}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5, v9}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 148
    .line 149
    .line 150
    const/4 v9, 0x1

    .line 151
    if-eqz v3, :cond_2

    .line 152
    .line 153
    move v11, v9

    .line 154
    goto :goto_2

    .line 155
    :cond_2
    move v11, v6

    .line 156
    :goto_2
    invoke-virtual {v5, v11}, Landroid/view/View;->setClickable(Z)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v5, v6}, Landroid/view/View;->setFocusable(Z)V

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5, v3}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 163
    .line 164
    .line 165
    if-eqz v4, :cond_3

    .line 166
    .line 167
    invoke-virtual {v5, v9}, Landroid/view/View;->setLongClickable(Z)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {v5, v4}, Landroid/view/View;->setOnLongClickListener(Landroid/view/View$OnLongClickListener;)V

    .line 171
    .line 172
    .line 173
    :cond_3
    const-string v4, ".."

    .line 174
    .line 175
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 176
    .line 177
    .line 178
    move-result v11

    .line 179
    const-string v12, "\u4e0b\u4e00\u9875"

    .line 180
    .line 181
    const-string v13, "\u4e0a\u4e00\u9875"

    .line 182
    .line 183
    const-string v14, "\u4e0a\u4e00\u7ea7"

    .line 184
    .line 185
    const-string v15, "\u6587\u4ef6\u5939"

    .line 186
    .line 187
    const/16 v10, 0x60

    .line 188
    .line 189
    const/16 v6, 0x52

    .line 190
    .line 191
    const/16 v8, 0x76

    .line 192
    .line 193
    if-nez v11, :cond_9

    .line 194
    .line 195
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 196
    .line 197
    .line 198
    move-result v11

    .line 199
    if-eqz v11, :cond_4

    .line 200
    .line 201
    goto :goto_4

    .line 202
    :cond_4
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 203
    .line 204
    .line 205
    move-result v11

    .line 206
    if-nez v11, :cond_8

    .line 207
    .line 208
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 209
    .line 210
    .line 211
    move-result v11

    .line 212
    if-eqz v11, :cond_5

    .line 213
    .line 214
    goto :goto_3

    .line 215
    :cond_5
    invoke-virtual {v2, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 216
    .line 217
    .line 218
    move-result v6

    .line 219
    if-eqz v6, :cond_6

    .line 220
    .line 221
    const/16 v6, 0xbe

    .line 222
    .line 223
    const/16 v8, 0x8f

    .line 224
    .line 225
    const/16 v10, 0x22

    .line 226
    .line 227
    invoke-static {v10, v6, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 228
    .line 229
    .line 230
    move-result v6

    .line 231
    goto :goto_5

    .line 232
    :cond_6
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v6

    .line 236
    invoke-static {v6}, Lcom/mr/elaris/w;->a0(Ljava/lang/String;)Z

    .line 237
    .line 238
    .line 239
    move-result v6

    .line 240
    if-eqz v6, :cond_7

    .line 241
    .line 242
    const/16 v6, 0x84

    .line 243
    .line 244
    const/16 v8, 0xff

    .line 245
    .line 246
    const/16 v10, 0x34

    .line 247
    .line 248
    invoke-static {v10, v6, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 249
    .line 250
    .line 251
    move-result v6

    .line 252
    goto :goto_5

    .line 253
    :cond_7
    const/16 v6, 0x7e

    .line 254
    .line 255
    const/16 v10, 0x8c

    .line 256
    .line 257
    invoke-static {v8, v6, v10}, Landroid/graphics/Color;->rgb(III)I

    .line 258
    .line 259
    .line 260
    move-result v6

    .line 261
    goto :goto_5

    .line 262
    :cond_8
    :goto_3
    invoke-static {v6, v10, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 263
    .line 264
    .line 265
    move-result v6

    .line 266
    goto :goto_5

    .line 267
    :cond_9
    :goto_4
    invoke-static {v6, v10, v8}, Landroid/graphics/Color;->rgb(III)I

    .line 268
    .line 269
    .line 270
    move-result v6

    .line 271
    :goto_5
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    move-result v4

    .line 275
    const/4 v11, 0x3

    .line 276
    const/4 v10, 0x2

    .line 277
    if-nez v4, :cond_f

    .line 278
    .line 279
    invoke-virtual {v14, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 280
    .line 281
    .line 282
    move-result v4

    .line 283
    if-eqz v4, :cond_a

    .line 284
    .line 285
    goto :goto_7

    .line 286
    :cond_a
    invoke-virtual {v13, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 287
    .line 288
    .line 289
    move-result v4

    .line 290
    if-nez v4, :cond_e

    .line 291
    .line 292
    invoke-virtual {v12, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-eqz v4, :cond_b

    .line 297
    .line 298
    goto :goto_6

    .line 299
    :cond_b
    invoke-virtual {v2, v15}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 300
    .line 301
    .line 302
    move-result v4

    .line 303
    if-eqz v4, :cond_c

    .line 304
    .line 305
    move v4, v9

    .line 306
    goto :goto_8

    .line 307
    :cond_c
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 308
    .line 309
    .line 310
    move-result-object v4

    .line 311
    invoke-static {v4}, Lcom/mr/elaris/w;->a0(Ljava/lang/String;)Z

    .line 312
    .line 313
    .line 314
    move-result v4

    .line 315
    if-eqz v4, :cond_d

    .line 316
    .line 317
    move v4, v10

    .line 318
    goto :goto_8

    .line 319
    :cond_d
    move v4, v11

    .line 320
    goto :goto_8

    .line 321
    :cond_e
    :goto_6
    const/4 v4, 0x5

    .line 322
    goto :goto_8

    .line 323
    :cond_f
    :goto_7
    const/4 v4, 0x4

    .line 324
    :goto_8
    new-instance v12, Landroid/widget/ImageView;

    .line 325
    .line 326
    invoke-direct {v12, v0}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 327
    .line 328
    .line 329
    new-instance v13, Ll9;

    .line 330
    .line 331
    invoke-direct {v13, v4, v6}, Ll9;-><init>(II)V

    .line 332
    .line 333
    .line 334
    invoke-virtual {v12, v13}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 335
    .line 336
    .line 337
    if-nez v3, :cond_10

    .line 338
    .line 339
    if-ne v4, v11, :cond_10

    .line 340
    .line 341
    const v14, 0x3ef5c28f    # 0.48f

    .line 342
    .line 343
    .line 344
    goto :goto_9

    .line 345
    :cond_10
    const/high16 v14, 0x3f800000    # 1.0f

    .line 346
    .line 347
    :goto_9
    invoke-virtual {v12, v14}, Landroid/view/View;->setAlpha(F)V

    .line 348
    .line 349
    .line 350
    new-instance v14, Landroid/widget/LinearLayout$LayoutParams;

    .line 351
    .line 352
    const/high16 v8, 0x41e00000    # 28.0f

    .line 353
    .line 354
    invoke-static {v0, v8}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 355
    .line 356
    .line 357
    move-result v13

    .line 358
    invoke-static {v0, v8}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 359
    .line 360
    .line 361
    move-result v8

    .line 362
    invoke-direct {v14, v13, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v5, v12, v14}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 366
    .line 367
    .line 368
    new-instance v8, Landroid/widget/LinearLayout;

    .line 369
    .line 370
    invoke-direct {v8, v0}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 371
    .line 372
    .line 373
    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 374
    .line 375
    .line 376
    invoke-virtual {v8, v7}, Landroid/widget/LinearLayout;->setGravity(I)V

    .line 377
    .line 378
    .line 379
    const/high16 v12, 0x41200000    # 10.0f

    .line 380
    .line 381
    invoke-static {v0, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 382
    .line 383
    .line 384
    move-result v12

    .line 385
    const/high16 v13, 0x40e00000    # 7.0f

    .line 386
    .line 387
    invoke-static {v0, v13}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 388
    .line 389
    .line 390
    move-result v14

    .line 391
    const/4 v13, 0x0

    .line 392
    invoke-virtual {v8, v12, v13, v14, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 393
    .line 394
    .line 395
    new-instance v12, Landroid/widget/TextView;

    .line 396
    .line 397
    invoke-direct {v12, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 398
    .line 399
    .line 400
    invoke-virtual {v12, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 401
    .line 402
    .line 403
    if-nez v3, :cond_11

    .line 404
    .line 405
    if-ne v4, v11, :cond_11

    .line 406
    .line 407
    invoke-static {v0}, Lu9;->E(Landroid/content/Context;)I

    .line 408
    .line 409
    .line 410
    move-result v11

    .line 411
    goto :goto_a

    .line 412
    :cond_11
    invoke-static {v0}, Lu9;->G(Landroid/content/Context;)I

    .line 413
    .line 414
    .line 415
    move-result v11

    .line 416
    :goto_a
    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setTextColor(I)V

    .line 417
    .line 418
    .line 419
    const/high16 v11, 0x41600000    # 14.0f

    .line 420
    .line 421
    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setTextSize(F)V

    .line 422
    .line 423
    .line 424
    invoke-virtual {v12, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 425
    .line 426
    .line 427
    sget-object v11, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    .line 428
    .line 429
    invoke-virtual {v12, v11}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 430
    .line 431
    .line 432
    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setGravity(I)V

    .line 433
    .line 434
    .line 435
    if-eq v4, v10, :cond_13

    .line 436
    .line 437
    if-ne v4, v9, :cond_12

    .line 438
    .line 439
    goto :goto_b

    .line 440
    :cond_12
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    .line 441
    .line 442
    goto :goto_c

    .line 443
    :cond_13
    :goto_b
    sget-object v7, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 444
    .line 445
    :goto_c
    invoke-virtual {v12, v7}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 446
    .line 447
    .line 448
    new-instance v7, Landroid/widget/LinearLayout$LayoutParams;

    .line 449
    .line 450
    const/4 v11, -0x1

    .line 451
    const/4 v13, -0x2

    .line 452
    invoke-direct {v7, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v8, v12, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 459
    .line 460
    .line 461
    move-result v7

    .line 462
    if-lez v7, :cond_14

    .line 463
    .line 464
    invoke-virtual {v15, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 465
    .line 466
    .line 467
    move-result v7

    .line 468
    if-nez v7, :cond_14

    .line 469
    .line 470
    new-instance v7, Landroid/widget/TextView;

    .line 471
    .line 472
    invoke-direct {v7, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 473
    .line 474
    .line 475
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 476
    .line 477
    .line 478
    invoke-static {v0}, Lu9;->E(Landroid/content/Context;)I

    .line 479
    .line 480
    .line 481
    move-result v2

    .line 482
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 483
    .line 484
    .line 485
    const/high16 v2, 0x41300000    # 11.0f

    .line 486
    .line 487
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setTextSize(F)V

    .line 488
    .line 489
    .line 490
    invoke-virtual {v7, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 491
    .line 492
    .line 493
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->MIDDLE:Landroid/text/TextUtils$TruncateAt;

    .line 494
    .line 495
    invoke-virtual {v7, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 496
    .line 497
    .line 498
    const/high16 v2, 0x40400000    # 3.0f

    .line 499
    .line 500
    invoke-static {v0, v2}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 501
    .line 502
    .line 503
    move-result v2

    .line 504
    const/4 v12, 0x0

    .line 505
    invoke-virtual {v7, v12, v2, v12, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 506
    .line 507
    .line 508
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 509
    .line 510
    invoke-direct {v2, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 511
    .line 512
    .line 513
    invoke-virtual {v8, v7, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 514
    .line 515
    .line 516
    goto :goto_d

    .line 517
    :cond_14
    const/4 v12, 0x0

    .line 518
    :goto_d
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 519
    .line 520
    const/high16 v7, 0x3f800000    # 1.0f

    .line 521
    .line 522
    invoke-direct {v2, v12, v13, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 523
    .line 524
    .line 525
    invoke-virtual {v5, v8, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 526
    .line 527
    .line 528
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 529
    .line 530
    .line 531
    move-result-object v1

    .line 532
    invoke-static {v1}, Lcom/mr/elaris/w;->a0(Ljava/lang/String;)Z

    .line 533
    .line 534
    .line 535
    move-result v2

    .line 536
    if-eqz v2, :cond_15

    .line 537
    .line 538
    invoke-virtual {v1, v9}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 539
    .line 540
    .line 541
    move-result-object v1

    .line 542
    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 543
    .line 544
    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 545
    .line 546
    .line 547
    move-result-object v1

    .line 548
    goto :goto_e

    .line 549
    :cond_15
    const-string v1, ""

    .line 550
    .line 551
    :goto_e
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 552
    .line 553
    .line 554
    move-result v2

    .line 555
    const/high16 v7, 0x41b00000    # 22.0f

    .line 556
    .line 557
    const/16 v8, 0x11

    .line 558
    .line 559
    if-lez v2, :cond_16

    .line 560
    .line 561
    if-ne v4, v10, :cond_16

    .line 562
    .line 563
    new-instance v2, Landroid/widget/TextView;

    .line 564
    .line 565
    invoke-direct {v2, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 566
    .line 567
    .line 568
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 569
    .line 570
    .line 571
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setTextColor(I)V

    .line 572
    .line 573
    .line 574
    const/high16 v1, 0x41180000    # 9.5f

    .line 575
    .line 576
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 577
    .line 578
    .line 579
    invoke-virtual {v2, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 580
    .line 581
    .line 582
    invoke-virtual {v2, v9}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 583
    .line 584
    .line 585
    const/high16 v1, 0x40e00000    # 7.0f

    .line 586
    .line 587
    invoke-static {v0, v1}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 588
    .line 589
    .line 590
    move-result v10

    .line 591
    invoke-static {v0, v1}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 592
    .line 593
    .line 594
    move-result v1

    .line 595
    const/4 v12, 0x0

    .line 596
    invoke-virtual {v2, v10, v12, v1, v12}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 597
    .line 598
    .line 599
    const v1, 0x3f6b851f    # 0.92f

    .line 600
    .line 601
    .line 602
    invoke-static {v0, v6, v1}, Lu9;->v(Landroid/content/Context;IF)I

    .line 603
    .line 604
    .line 605
    move-result v1

    .line 606
    const/high16 v10, 0x41400000    # 12.0f

    .line 607
    .line 608
    invoke-static {v0, v10}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 609
    .line 610
    .line 611
    move-result v10

    .line 612
    const v12, 0x3f47ae14    # 0.78f

    .line 613
    .line 614
    .line 615
    invoke-static {v0, v6, v12}, Lu9;->v(Landroid/content/Context;IF)I

    .line 616
    .line 617
    .line 618
    move-result v6

    .line 619
    const/high16 v12, 0x3f800000    # 1.0f

    .line 620
    .line 621
    invoke-static {v0, v12}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 622
    .line 623
    .line 624
    move-result v12

    .line 625
    invoke-static {v1, v10, v6, v12}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 626
    .line 627
    .line 628
    move-result-object v1

    .line 629
    invoke-virtual {v2, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 630
    .line 631
    .line 632
    new-instance v1, Landroid/widget/LinearLayout$LayoutParams;

    .line 633
    .line 634
    invoke-static {v0, v7}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 635
    .line 636
    .line 637
    move-result v6

    .line 638
    invoke-direct {v1, v13, v6}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 639
    .line 640
    .line 641
    invoke-virtual {v5, v2, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 642
    .line 643
    .line 644
    :cond_16
    if-eqz v3, :cond_18

    .line 645
    .line 646
    if-eq v4, v9, :cond_17

    .line 647
    .line 648
    const/4 v1, 0x4

    .line 649
    if-eq v4, v1, :cond_17

    .line 650
    .line 651
    const/4 v1, 0x5

    .line 652
    if-ne v4, v1, :cond_18

    .line 653
    .line 654
    :cond_17
    new-instance v1, Landroid/widget/TextView;

    .line 655
    .line 656
    invoke-direct {v1, v0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 657
    .line 658
    .line 659
    const-string v2, "\u203a"

    .line 660
    .line 661
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 662
    .line 663
    .line 664
    invoke-static {v0}, Lu9;->E(Landroid/content/Context;)I

    .line 665
    .line 666
    .line 667
    move-result v2

    .line 668
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setTextColor(I)V

    .line 669
    .line 670
    .line 671
    invoke-virtual {v1, v7}, Landroid/widget/TextView;->setTextSize(F)V

    .line 672
    .line 673
    .line 674
    invoke-virtual {v1, v8}, Landroid/widget/TextView;->setGravity(I)V

    .line 675
    .line 676
    .line 677
    new-instance v2, Landroid/widget/LinearLayout$LayoutParams;

    .line 678
    .line 679
    const/high16 v3, 0x41a00000    # 20.0f

    .line 680
    .line 681
    invoke-static {v0, v3}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 682
    .line 683
    .line 684
    move-result v3

    .line 685
    invoke-direct {v2, v3, v11}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 686
    .line 687
    .line 688
    const/high16 v3, 0x40000000    # 2.0f

    .line 689
    .line 690
    invoke-static {v0, v3}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 691
    .line 692
    .line 693
    move-result v0

    .line 694
    iput v0, v2, Landroid/widget/LinearLayout$LayoutParams;->leftMargin:I

    .line 695
    .line 696
    invoke-virtual {v5, v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 697
    .line 698
    .line 699
    :cond_18
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 700
    .line 701
    invoke-direct {v0, v11, v13}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 702
    .line 703
    .line 704
    move-object/from16 v1, p1

    .line 705
    .line 706
    invoke-virtual {v1, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 707
    .line 708
    .line 709
    return-void
.end method

.method public static f0(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/reflect/Field;)V
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    return-void

    .line 4
    :cond_0
    if-eqz p2, :cond_1

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    :try_start_0
    invoke-virtual {p2, p0, p1}, Ljava/lang/reflect/Field;->set(Ljava/lang/Object;Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    :catchall_0
    :cond_1
    const-string p2, "name"

    .line 24
    .line 25
    const-string v0, "a"

    .line 26
    .line 27
    const-string v1, "title"

    .line 28
    .line 29
    const-string v2, "text"

    .line 30
    .line 31
    const-string v3, "label"

    .line 32
    .line 33
    filled-new-array {v1, v2, v3, p2, v0}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p2

    .line 37
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/w;->L0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    return-void
.end method

.method public static g(Landroid/app/Activity;Lw6;Ljava/util/ArrayList;)I
    .locals 20

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    const-string v1, "last_modified"

    .line 4
    .line 5
    const-string v2, "_size"

    .line 6
    .line 7
    const-string v3, "mime_type"

    .line 8
    .line 9
    const-string v4, "_display_name"

    .line 10
    .line 11
    const-string v5, "document_id"

    .line 12
    .line 13
    const/4 v6, -0x1

    .line 14
    if-eqz p0, :cond_c

    .line 15
    .line 16
    iget-object v7, v0, Lw6;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v7, Landroid/net/Uri;

    .line 19
    .line 20
    invoke-virtual {v0}, Lw6;->e()Z

    .line 21
    .line 22
    .line 23
    move-result v8

    .line 24
    if-eqz v8, :cond_c

    .line 25
    .line 26
    const/4 v8, 0x0

    .line 27
    :try_start_0
    iget-object v0, v0, Lw6;->c:Ljava/lang/Comparable;

    .line 28
    .line 29
    check-cast v0, Landroid/net/Uri;

    .line 30
    .line 31
    invoke-static {v0}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-static {v7, v0}, Landroid/provider/DocumentsContract;->buildChildDocumentsUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 36
    .line 37
    .line 38
    move-result-object v10

    .line 39
    invoke-virtual/range {p0 .. p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 40
    .line 41
    .line 42
    move-result-object v9

    .line 43
    filled-new-array {v5, v4, v3, v2, v1}, [Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v11

    .line 47
    const/4 v13, 0x0

    .line 48
    const/4 v14, 0x0

    .line 49
    const/4 v12, 0x0

    .line 50
    invoke-virtual/range {v9 .. v14}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 51
    .line 52
    .line 53
    move-result-object v8
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 54
    if-nez v8, :cond_0

    .line 55
    .line 56
    invoke-static {v8}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 57
    .line 58
    .line 59
    return v6

    .line 60
    :cond_0
    :try_start_1
    invoke-interface {v8, v5}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 61
    .line 62
    .line 63
    move-result v0

    .line 64
    invoke-interface {v8, v4}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 65
    .line 66
    .line 67
    move-result v4

    .line 68
    invoke-interface {v8, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 69
    .line 70
    .line 71
    move-result v3

    .line 72
    invoke-interface {v8, v2}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    invoke-interface {v8, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 77
    .line 78
    .line 79
    move-result v1

    .line 80
    const/4 v5, 0x0

    .line 81
    :goto_0
    invoke-interface {v8}, Landroid/database/Cursor;->moveToNext()Z

    .line 82
    .line 83
    .line 84
    move-result v9
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 85
    if-eqz v9, :cond_a

    .line 86
    .line 87
    add-int/lit8 v5, v5, 0x1

    .line 88
    .line 89
    const-string v9, ""

    .line 90
    .line 91
    if-ltz v4, :cond_1

    .line 92
    .line 93
    :try_start_2
    invoke-interface {v8, v4}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object v10

    .line 97
    move-object v12, v10

    .line 98
    goto :goto_1

    .line 99
    :catchall_0
    move-exception v0

    .line 100
    goto/16 :goto_5

    .line 101
    .line 102
    :cond_1
    move-object v12, v9

    .line 103
    :goto_1
    if-eqz v12, :cond_2

    .line 104
    .line 105
    invoke-virtual {v12}, Ljava/lang/String;->length()I

    .line 106
    .line 107
    .line 108
    move-result v10

    .line 109
    if-nez v10, :cond_3

    .line 110
    .line 111
    :cond_2
    :goto_2
    move-object/from16 v10, p2

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_3
    if-ltz v3, :cond_4

    .line 115
    .line 116
    invoke-interface {v8, v3}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 117
    .line 118
    .line 119
    move-result-object v10

    .line 120
    move-object v14, v10

    .line 121
    goto :goto_3

    .line 122
    :cond_4
    move-object v14, v9

    .line 123
    :goto_3
    const-string v10, "vnd.android.document/directory"

    .line 124
    .line 125
    invoke-virtual {v10, v14}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    move-result v19

    .line 129
    invoke-static {v12, v14}, Lcom/mr/elaris/w;->d0(Ljava/lang/String;Ljava/lang/String;)Z

    .line 130
    .line 131
    .line 132
    move-result v10

    .line 133
    if-nez v19, :cond_5

    .line 134
    .line 135
    const-string v11, "."

    .line 136
    .line 137
    invoke-virtual {v12, v11}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 138
    .line 139
    .line 140
    move-result v11

    .line 141
    if-eqz v11, :cond_5

    .line 142
    .line 143
    if-nez v10, :cond_5

    .line 144
    .line 145
    goto :goto_2

    .line 146
    :cond_5
    if-ltz v0, :cond_6

    .line 147
    .line 148
    invoke-interface {v8, v0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 149
    .line 150
    .line 151
    move-result-object v9

    .line 152
    :cond_6
    if-eqz v9, :cond_2

    .line 153
    .line 154
    invoke-virtual {v9}, Ljava/lang/String;->length()I

    .line 155
    .line 156
    .line 157
    move-result v10

    .line 158
    if-nez v10, :cond_7

    .line 159
    .line 160
    goto :goto_2

    .line 161
    :cond_7
    invoke-static {v7, v9}, Landroid/provider/DocumentsContract;->buildDocumentUriUsingTree(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;

    .line 162
    .line 163
    .line 164
    move-result-object v11

    .line 165
    const-wide/16 v9, 0x0

    .line 166
    .line 167
    if-ltz v2, :cond_8

    .line 168
    .line 169
    invoke-interface {v8, v2}, Landroid/database/Cursor;->isNull(I)Z

    .line 170
    .line 171
    .line 172
    move-result v13

    .line 173
    if-nez v13, :cond_8

    .line 174
    .line 175
    invoke-interface {v8, v2}, Landroid/database/Cursor;->getLong(I)J

    .line 176
    .line 177
    .line 178
    move-result-wide v15

    .line 179
    goto :goto_4

    .line 180
    :cond_8
    move-wide v15, v9

    .line 181
    :goto_4
    if-ltz v1, :cond_9

    .line 182
    .line 183
    invoke-interface {v8, v1}, Landroid/database/Cursor;->isNull(I)Z

    .line 184
    .line 185
    .line 186
    move-result v13

    .line 187
    if-nez v13, :cond_9

    .line 188
    .line 189
    invoke-interface {v8, v1}, Landroid/database/Cursor;->getLong(I)J

    .line 190
    .line 191
    .line 192
    move-result-wide v9

    .line 193
    :cond_9
    move-wide/from16 v17, v9

    .line 194
    .line 195
    new-instance v9, Ln9;

    .line 196
    .line 197
    const-string v13, ""

    .line 198
    .line 199
    const/4 v10, 0x0

    .line 200
    invoke-direct/range {v9 .. v19}, Ln9;-><init>(Ljava/io/File;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJZ)V

    .line 201
    .line 202
    .line 203
    move-object/from16 v10, p2

    .line 204
    .line 205
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 206
    .line 207
    .line 208
    goto :goto_0

    .line 209
    :cond_a
    invoke-static {v8}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 210
    .line 211
    .line 212
    return v5

    .line 213
    :goto_5
    :try_start_3
    instance-of v1, v0, Ljava/lang/SecurityException;

    .line 214
    .line 215
    if-eqz v1, :cond_b

    .line 216
    .line 217
    invoke-static/range {p0 .. p0}, Lcom/mr/elaris/w;->k(Landroid/content/Context;)V

    .line 218
    .line 219
    .line 220
    new-instance v1, Ljava/lang/StringBuilder;

    .line 221
    .line 222
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 223
    .line 224
    .line 225
    const-string v2, "local voice tree permission invalidated uri="

    .line 226
    .line 227
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 228
    .line 229
    .line 230
    invoke-static {v7}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 231
    .line 232
    .line 233
    move-result-object v2

    .line 234
    invoke-static {v2}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object v2

    .line 238
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 242
    .line 243
    .line 244
    move-result-object v1

    .line 245
    invoke-static {v1}, Lcom/mr/elaris/HookEntry;->logAlways(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    goto :goto_6

    .line 249
    :catchall_1
    move-exception v0

    .line 250
    goto :goto_7

    .line 251
    :cond_b
    :goto_6
    new-instance v1, Ljava/lang/StringBuilder;

    .line 252
    .line 253
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 254
    .line 255
    .line 256
    const-string v2, "local voice tree query failed: "

    .line 257
    .line 258
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 262
    .line 263
    .line 264
    move-result-object v2

    .line 265
    invoke-virtual {v2}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object v2

    .line 269
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 270
    .line 271
    .line 272
    const-string v2, ": "

    .line 273
    .line 274
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 275
    .line 276
    .line 277
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 278
    .line 279
    .line 280
    move-result-object v0

    .line 281
    invoke-static {v0}, Lcom/mr/elaris/w;->F0(Ljava/lang/String;)Ljava/lang/String;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 289
    .line 290
    .line 291
    move-result-object v0

    .line 292
    invoke-static {v0}, Lcom/mr/elaris/HookEntry;->log(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 293
    .line 294
    .line 295
    invoke-static {v8}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 296
    .line 297
    .line 298
    return v6

    .line 299
    :goto_7
    invoke-static {v8}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 300
    .line 301
    .line 302
    throw v0

    .line 303
    :cond_c
    return v6
.end method

.method public static g0(Landroid/view/View;Ljava/lang/String;)V
    .locals 3

    .line 1
    instance-of v0, p0, Landroid/widget/TextView;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    check-cast p0, Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    .line 10
    return-void

    .line 11
    :cond_0
    instance-of v0, p0, Landroid/view/ViewGroup;

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_1
    check-cast p0, Landroid/view/ViewGroup;

    .line 17
    .line 18
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    const/16 v1, 0x14

    .line 23
    .line 24
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    const/4 v1, 0x0

    .line 29
    :goto_0
    if-ge v1, v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-static {v2, p1}, Lcom/mr/elaris/w;->g0(Landroid/view/View;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    add-int/lit8 v1, v1, 0x1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :catchall_0
    :cond_2
    :goto_1
    return-void
.end method

.method public static h(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
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
    :goto_0
    if-eqz v1, :cond_0

    .line 9
    .line 10
    const-class v2, Ljava/lang/Object;

    .line 11
    .line 12
    if-eq v1, v2, :cond_0

    .line 13
    .line 14
    :try_start_0
    invoke-virtual {v1, p1, v0}, Ljava/lang/Class;->getDeclaredMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    const/4 v3, 0x1

    .line 19
    invoke-virtual {v2, v3}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v2, p0, v0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    return-object p0

    .line 27
    :catchall_0
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-object v0
.end method

.method public static h0(Ljava/io/File;)Ljava/lang/String;
    .locals 4

    .line 1
    const-string v0, "\u5185\u90e8\u5b58\u50a8 > "

    .line 2
    .line 3
    const-string v1, "/"

    .line 4
    .line 5
    const-string v2, ""

    .line 6
    .line 7
    if-nez p0, :cond_0

    .line 8
    .line 9
    return-object v2

    .line 10
    :cond_0
    invoke-static {p0}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-static {p0}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    :try_start_0
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-nez v3, :cond_1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_1
    invoke-static {v3}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-static {v2}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v2

    .line 33
    :goto_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    if-lez v3, :cond_2

    .line 38
    .line 39
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    const-string p0, "\u5185\u90e8\u5b58\u50a8"

    .line 46
    .line 47
    return-object p0

    .line 48
    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 49
    .line 50
    .line 51
    move-result v3

    .line 52
    if-lez v3, :cond_3

    .line 53
    .line 54
    invoke-virtual {v2, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v3

    .line 58
    invoke-virtual {p0, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v3

    .line 62
    if-eqz v3, :cond_3

    .line 63
    .line 64
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/lit8 v2, v2, 0x1

    .line 69
    .line 70
    invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    new-instance v3, Ljava/lang/StringBuilder;

    .line 75
    .line 76
    invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 77
    .line 78
    .line 79
    const-string v0, " > "

    .line 80
    .line 81
    invoke-virtual {v2, v1, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 89
    .line 90
    .line 91
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    :catchall_0
    :cond_3
    return-object p0
.end method

.method public static i(I)I
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-nez p0, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x2

    .line 6
    if-ne p0, v0, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    const/16 v2, 0x3e8

    .line 10
    .line 11
    const/16 v3, 0x64

    .line 12
    .line 13
    if-ne p0, v2, :cond_2

    .line 14
    .line 15
    return v3

    .line 16
    :cond_2
    if-eq p0, v1, :cond_5

    .line 17
    .line 18
    const/4 v1, 0x4

    .line 19
    if-eq p0, v1, :cond_5

    .line 20
    .line 21
    if-ne p0, v3, :cond_3

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_3
    if-lez p0, :cond_4

    .line 25
    .line 26
    add-int/2addr p0, v0

    .line 27
    return p0

    .line 28
    :cond_4
    return v0

    .line 29
    :cond_5
    :goto_0
    return p0
.end method

.method public static i0(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;
    .locals 6

    .line 1
    const/high16 v0, 0x41a00000    # 20.0f

    .line 2
    .line 3
    invoke-static {p0, v0}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/high16 v1, 0x3f800000    # 1.0f

    .line 8
    .line 9
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    new-instance v2, Landroid/graphics/drawable/StateListDrawable;

    .line 14
    .line 15
    invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 16
    .line 17
    .line 18
    const v3, 0x10100a7

    .line 19
    .line 20
    .line 21
    filled-new-array {v3}, [I

    .line 22
    .line 23
    .line 24
    move-result-object v3

    .line 25
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 26
    .line 27
    .line 28
    move-result v4

    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    const v4, -0xd4cbbe

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const v4, -0x170c01

    .line 36
    .line 37
    .line 38
    :goto_0
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    const v5, -0xb69161

    .line 45
    .line 46
    .line 47
    goto :goto_1

    .line 48
    :cond_1
    const v5, -0x684109

    .line 49
    .line 50
    .line 51
    :goto_1
    invoke-static {v4, v0, v5, v1}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 56
    .line 57
    .line 58
    const v3, 0x101009c

    .line 59
    .line 60
    .line 61
    filled-new-array {v3}, [I

    .line 62
    .line 63
    .line 64
    move-result-object v3

    .line 65
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_2

    .line 70
    .line 71
    const v4, -0xcfc7ba

    .line 72
    .line 73
    .line 74
    goto :goto_2

    .line 75
    :cond_2
    const v4, -0x100801

    .line 76
    .line 77
    .line 78
    :goto_2
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 79
    .line 80
    .line 81
    move-result v5

    .line 82
    if-eqz v5, :cond_3

    .line 83
    .line 84
    const v5, -0xb38856

    .line 85
    .line 86
    .line 87
    goto :goto_3

    .line 88
    :cond_3
    const v5, -0x533307

    .line 89
    .line 90
    .line 91
    :goto_3
    invoke-static {v4, v0, v5, v1}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 92
    .line 93
    .line 94
    move-result-object v4

    .line 95
    invoke-virtual {v2, v3, v4}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 96
    .line 97
    .line 98
    const/4 v3, 0x0

    .line 99
    new-array v3, v3, [I

    .line 100
    .line 101
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 102
    .line 103
    .line 104
    move-result v4

    .line 105
    if-eqz v4, :cond_4

    .line 106
    .line 107
    const v4, -0xdcd3c5

    .line 108
    .line 109
    .line 110
    goto :goto_4

    .line 111
    :cond_4
    const v4, -0x90501

    .line 112
    .line 113
    .line 114
    :goto_4
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 115
    .line 116
    .line 117
    move-result p0

    .line 118
    if-eqz p0, :cond_5

    .line 119
    .line 120
    const p0, -0xcaad89

    .line 121
    .line 122
    .line 123
    goto :goto_5

    .line 124
    :cond_5
    const p0, -0x3b2709

    .line 125
    .line 126
    .line 127
    :goto_5
    invoke-static {v4, v0, p0, v1}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 128
    .line 129
    .line 130
    move-result-object p0

    .line 131
    invoke-virtual {v2, v3, p0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 132
    .line 133
    .line 134
    return-object v2
.end method

.method public static j(Ljava/io/File;)V
    .locals 6

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    if-eqz p0, :cond_2

    .line 6
    .line 7
    array-length v0, p0

    .line 8
    const/16 v1, 0x20

    .line 9
    .line 10
    if-gt v0, v1, :cond_0

    .line 11
    .line 12
    goto :goto_1

    .line 13
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    .line 15
    .line 16
    move-result-wide v0

    .line 17
    const-wide/32 v2, 0xa4cb800

    .line 18
    .line 19
    .line 20
    sub-long/2addr v0, v2

    .line 21
    const/4 v2, 0x0

    .line 22
    :goto_0
    array-length v3, p0

    .line 23
    if-ge v2, v3, :cond_2

    .line 24
    .line 25
    aget-object v3, p0, v2

    .line 26
    .line 27
    if-eqz v3, :cond_1

    .line 28
    .line 29
    invoke-virtual {v3}, Ljava/io/File;->isFile()Z

    .line 30
    .line 31
    .line 32
    move-result v4

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    invoke-virtual {v3}, Ljava/io/File;->lastModified()J

    .line 36
    .line 37
    .line 38
    move-result-wide v4

    .line 39
    cmp-long v4, v4, v0

    .line 40
    .line 41
    if-gez v4, :cond_1

    .line 42
    .line 43
    invoke-virtual {v3}, Ljava/io/File;->delete()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    .line 45
    .line 46
    :cond_1
    add-int/lit8 v2, v2, 0x1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :catchall_0
    :cond_2
    :goto_1
    return-void
.end method

.method public static j0(Landroid/content/Context;Ljava/lang/String;)Landroid/widget/TextView;
    .locals 1

    .line 1
    new-instance v0, Landroid/widget/TextView;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    invoke-static {p0}, Lu9;->c(Landroid/content/Context;)I

    .line 10
    .line 11
    .line 12
    move-result p1

    .line 13
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 14
    .line 15
    .line 16
    const/high16 p1, 0x41500000    # 13.0f

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTextSize(F)V

    .line 19
    .line 20
    .line 21
    sget-object p1, Landroid/graphics/Typeface;->DEFAULT_BOLD:Landroid/graphics/Typeface;

    .line 22
    .line 23
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setTypeface(Landroid/graphics/Typeface;)V

    .line 24
    .line 25
    .line 26
    const/16 p1, 0x11

    .line 27
    .line 28
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setGravity(I)V

    .line 29
    .line 30
    .line 31
    const/4 p1, 0x1

    .line 32
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setSingleLine(Z)V

    .line 33
    .line 34
    .line 35
    invoke-static {p0}, Lcom/mr/elaris/w;->i0(Landroid/content/Context;)Landroid/graphics/drawable/StateListDrawable;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    invoke-virtual {v0, p0}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static k(Landroid/content/Context;)V
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_1
    move-object p0, v0

    .line 12
    :goto_0
    const-string v0, "elaris_local_voice_state"

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    invoke-virtual {p0, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    invoke-interface {p0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string v0, "tree_uri"

    .line 24
    .line 25
    invoke-interface {p0, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    const-string v0, "tree_doc_uri"

    .line 30
    .line 31
    invoke-interface {p0, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    const-string v0, "tree_parent_docs"

    .line 36
    .line 37
    invoke-interface {p0, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    const-string v0, "tree_segments"

    .line 42
    .line 43
    invoke-interface {p0, v0}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {p0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 48
    .line 49
    .line 50
    :catchall_0
    :goto_1
    return-void
.end method

.method public static k0(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;
    .locals 5

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setShape(I)V

    .line 8
    .line 9
    .line 10
    const/16 v1, 0xec

    .line 11
    .line 12
    const/16 v2, 0xff

    .line 13
    .line 14
    invoke-static {v1, v2, v2, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    invoke-virtual {v0, v1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 19
    .line 20
    .line 21
    const/high16 v1, 0x3f800000    # 1.0f

    .line 22
    .line 23
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 24
    .line 25
    .line 26
    move-result p0

    .line 27
    const/16 v1, 0xcd

    .line 28
    .line 29
    const/16 v2, 0xd8

    .line 30
    .line 31
    const/16 v3, 0x38

    .line 32
    .line 33
    const/16 v4, 0xc6

    .line 34
    .line 35
    invoke-static {v3, v4, v1, v2}, Landroid/graphics/Color;->argb(IIII)I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    invoke-virtual {v0, p0, v1}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 40
    .line 41
    .line 42
    return-object v0
.end method

.method public static l(Ljava/io/Closeable;)V
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    :try_start_0
    invoke-interface {p0}, Ljava/io/Closeable;->close()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    .line 7
    :catchall_0
    :goto_0
    return-void
.end method

.method public static l0(Landroid/content/Context;)Landroid/graphics/drawable/GradientDrawable;
    .locals 4

    .line 1
    invoke-static {p0}, Lu9;->y(Landroid/content/Context;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/high16 v1, 0x41c00000    # 24.0f

    .line 6
    .line 7
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-static {p0}, Lu9;->o(Landroid/content/Context;)Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-eqz v2, :cond_0

    .line 16
    .line 17
    const v2, -0xb3aea2

    .line 18
    .line 19
    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const v2, -0x17130e

    .line 22
    .line 23
    .line 24
    :goto_0
    const/high16 v3, 0x3f800000    # 1.0f

    .line 25
    .line 26
    invoke-static {p0, v3}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    invoke-static {v0, v1, v2, p0}, Lcom/mr/elaris/w;->m0(IIII)Landroid/graphics/drawable/GradientDrawable;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static m(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const-string v1, "\u8868\u60c5"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    if-nez v1, :cond_2

    .line 21
    .line 22
    const-string v1, "\u741b\u3126\u510f"

    .line 23
    .line 24
    invoke-virtual {p0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 25
    .line 26
    .line 27
    move-result p0

    .line 28
    if-nez p0, :cond_2

    .line 29
    .line 30
    const-string p0, "emoji"

    .line 31
    .line 32
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    if-nez p0, :cond_2

    .line 37
    .line 38
    const-string p0, "emoticon"

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 41
    .line 42
    .line 43
    move-result p0

    .line 44
    if-nez p0, :cond_2

    .line 45
    .line 46
    const-string p0, "emotion"

    .line 47
    .line 48
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 49
    .line 50
    .line 51
    move-result p0

    .line 52
    if-nez p0, :cond_2

    .line 53
    .line 54
    const-string p0, "smile"

    .line 55
    .line 56
    invoke-virtual {v0, p0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 57
    .line 58
    .line 59
    move-result p0

    .line 60
    if-eqz p0, :cond_1

    .line 61
    .line 62
    goto :goto_1

    .line 63
    :cond_1
    :goto_0
    const/4 p0, 0x0

    .line 64
    return p0

    .line 65
    :cond_2
    :goto_1
    const/4 p0, 0x1

    .line 66
    return p0
.end method

.method public static m0(IIII)Landroid/graphics/drawable/GradientDrawable;
    .locals 1

    .line 1
    new-instance v0, Landroid/graphics/drawable/GradientDrawable;

    .line 2
    .line 3
    invoke-direct {v0}, Landroid/graphics/drawable/GradientDrawable;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 7
    .line 8
    .line 9
    int-to-float p0, p1

    .line 10
    invoke-virtual {v0, p0}, Landroid/graphics/drawable/GradientDrawable;->setCornerRadius(F)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p3, p2}, Landroid/graphics/drawable/GradientDrawable;->setStroke(II)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static n(Ljava/io/InputStream;Ljava/io/FileOutputStream;Ljava/io/File;Lve;)J
    .locals 16

    .line 1
    move-object/from16 v0, p1

    .line 2
    .line 3
    move-object/from16 v1, p3

    .line 4
    .line 5
    const/high16 v2, 0x10000

    .line 6
    .line 7
    new-array v2, v2, [B

    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    const-wide/32 v5, 0x400000

    .line 12
    .line 13
    .line 14
    move-wide v7, v3

    .line 15
    move-wide v9, v5

    .line 16
    :cond_0
    :goto_0
    iget-object v11, v1, Lve;->b:Ljava/lang/Thread;

    .line 17
    .line 18
    if-nez v11, :cond_1

    .line 19
    .line 20
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 21
    .line 22
    .line 23
    move-result-object v11

    .line 24
    iput-object v11, v1, Lve;->b:Ljava/lang/Thread;

    .line 25
    .line 26
    :cond_1
    iget-boolean v11, v1, Lve;->a:Z

    .line 27
    .line 28
    const-string v12, "voice conversion cancelled"

    .line 29
    .line 30
    if-nez v11, :cond_9

    .line 31
    .line 32
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 33
    .line 34
    .line 35
    move-result-object v11

    .line 36
    invoke-virtual {v11}, Ljava/lang/Thread;->isInterrupted()Z

    .line 37
    .line 38
    .line 39
    move-result v11

    .line 40
    if-nez v11, :cond_8

    .line 41
    .line 42
    move-object/from16 v11, p0

    .line 43
    .line 44
    invoke-virtual {v11, v2}, Ljava/io/InputStream;->read([B)I

    .line 45
    .line 46
    .line 47
    move-result v12

    .line 48
    if-gez v12, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const/4 v13, 0x0

    .line 52
    if-nez v12, :cond_6

    .line 53
    .line 54
    invoke-virtual {v11}, Ljava/io/InputStream;->read()I

    .line 55
    .line 56
    .line 57
    move-result v12

    .line 58
    if-gez v12, :cond_3

    .line 59
    .line 60
    :goto_1
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 61
    .line 62
    .line 63
    return-wide v7

    .line 64
    :cond_3
    const-wide/16 v14, 0x1

    .line 65
    .line 66
    add-long/2addr v14, v7

    .line 67
    invoke-virtual {v0, v12}, Ljava/io/OutputStream;->write(I)V

    .line 68
    .line 69
    .line 70
    cmp-long v12, v14, v9

    .line 71
    .line 72
    if-ltz v12, :cond_5

    .line 73
    .line 74
    if-nez p2, :cond_4

    .line 75
    .line 76
    goto :goto_2

    .line 77
    :cond_4
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 78
    .line 79
    .line 80
    move-result-object v13

    .line 81
    :goto_2
    invoke-static {v3, v4, v13}, Lcom/mr/elaris/w;->u(JLjava/io/File;)V

    .line 82
    .line 83
    .line 84
    const-wide/32 v9, 0x400001

    .line 85
    .line 86
    .line 87
    add-long/2addr v9, v7

    .line 88
    :cond_5
    move-wide v7, v14

    .line 89
    goto :goto_0

    .line 90
    :cond_6
    int-to-long v14, v12

    .line 91
    add-long/2addr v7, v14

    .line 92
    const/4 v14, 0x0

    .line 93
    invoke-virtual {v0, v2, v14, v12}, Ljava/io/OutputStream;->write([BII)V

    .line 94
    .line 95
    .line 96
    cmp-long v12, v7, v9

    .line 97
    .line 98
    if-ltz v12, :cond_0

    .line 99
    .line 100
    if-nez p2, :cond_7

    .line 101
    .line 102
    goto :goto_3

    .line 103
    :cond_7
    invoke-virtual/range {p2 .. p2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object v13

    .line 107
    :goto_3
    invoke-static {v3, v4, v13}, Lcom/mr/elaris/w;->u(JLjava/io/File;)V

    .line 108
    .line 109
    .line 110
    add-long v9, v7, v5

    .line 111
    .line 112
    goto :goto_0

    .line 113
    :cond_8
    invoke-static {v12}, Lu2;->c(Ljava/lang/String;)V

    .line 114
    .line 115
    .line 116
    return-wide v3

    .line 117
    :cond_9
    invoke-static {v12}, Lu2;->c(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    return-wide v3
.end method

.method public static n0(Landroid/content/Context;Landroid/net/Uri;)Ljava/lang/String;
    .locals 9

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const-string v1, "_display_name"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    if-nez p1, :cond_0

    .line 7
    .line 8
    move-object v4, p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    filled-new-array {v1}, [Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 18
    const/4 v7, 0x0

    .line 19
    const/4 v8, 0x0

    .line 20
    const/4 v6, 0x0

    .line 21
    move-object v4, p1

    .line 22
    :try_start_1
    invoke-virtual/range {v3 .. v8}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    :goto_0
    if-eqz v2, :cond_2

    .line 27
    .line 28
    invoke-interface {v2}, Landroid/database/Cursor;->moveToFirst()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    invoke-interface {v2, v1}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 35
    .line 36
    .line 37
    move-result p0

    .line 38
    if-ltz p0, :cond_2

    .line 39
    .line 40
    invoke-interface {v2, p0}, Landroid/database/Cursor;->getString(I)Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    if-nez p0, :cond_1

    .line 45
    .line 46
    move-object p0, v0

    .line 47
    goto :goto_1

    .line 48
    :cond_1
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 52
    :goto_1
    invoke-static {v2}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 53
    .line 54
    .line 55
    goto :goto_4

    .line 56
    :catchall_0
    :cond_2
    :goto_2
    invoke-static {v2}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 57
    .line 58
    .line 59
    goto :goto_3

    .line 60
    :catchall_1
    move-object v4, p1

    .line 61
    goto :goto_2

    .line 62
    :goto_3
    move-object p0, v0

    .line 63
    :goto_4
    invoke-static {p0}, Lcom/mr/elaris/w;->t0(Ljava/lang/String;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    if-lez p1, :cond_3

    .line 72
    .line 73
    return-object p0

    .line 74
    :cond_3
    if-nez v4, :cond_4

    .line 75
    .line 76
    move-object p0, v0

    .line 77
    goto :goto_5

    .line 78
    :cond_4
    :try_start_2
    invoke-static {v4}, Landroid/provider/DocumentsContract;->getDocumentId(Landroid/net/Uri;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    :goto_5
    if-eqz p0, :cond_8

    .line 83
    .line 84
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 85
    .line 86
    .line 87
    move-result p1

    .line 88
    if-nez p1, :cond_5

    .line 89
    .line 90
    goto :goto_7

    .line 91
    :cond_5
    const/16 p1, 0x3a

    .line 92
    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 94
    .line 95
    .line 96
    move-result p1

    .line 97
    if-ltz p1, :cond_6

    .line 98
    .line 99
    add-int/lit8 v1, p1, 0x1

    .line 100
    .line 101
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v1

    .line 105
    goto :goto_6

    .line 106
    :cond_6
    move-object v1, p0

    .line 107
    :goto_6
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 108
    .line 109
    .line 110
    move-result v2

    .line 111
    if-nez v2, :cond_7

    .line 112
    .line 113
    if-ltz p1, :cond_7

    .line 114
    .line 115
    const/4 v1, 0x0

    .line 116
    add-int/lit8 p1, p1, 0x1

    .line 117
    .line 118
    invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 119
    .line 120
    .line 121
    move-result-object v1

    .line 122
    :cond_7
    const/16 p0, 0x2f

    .line 123
    .line 124
    invoke-virtual {v1, p0}, Ljava/lang/String;->lastIndexOf(I)I

    .line 125
    .line 126
    .line 127
    move-result p0

    .line 128
    if-ltz p0, :cond_9

    .line 129
    .line 130
    add-int/lit8 p0, p0, 0x1

    .line 131
    .line 132
    invoke-virtual {v1, p0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    goto :goto_8

    .line 137
    :cond_8
    :goto_7
    move-object v1, v0

    .line 138
    :cond_9
    :goto_8
    invoke-static {v1}, Lcom/mr/elaris/w;->t0(Ljava/lang/String;)Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 143
    .line 144
    .line 145
    move-result p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 146
    if-lez p1, :cond_a

    .line 147
    .line 148
    return-object p0

    .line 149
    :catchall_2
    :cond_a
    return-object v0
.end method

.method public static o(Ljava/lang/Object;Ljava/lang/String;I[B)Ljava/lang/Object;
    .locals 8

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
    if-eqz p3, :cond_0

    .line 8
    .line 9
    move v2, v1

    .line 10
    :goto_0
    array-length v3, p3

    .line 11
    if-ge v2, v3, :cond_0

    .line 12
    .line 13
    aget-byte v3, p3, v2

    .line 14
    .line 15
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 16
    .line 17
    .line 18
    move-result-object v3

    .line 19
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    add-int/lit8 v2, v2, 0x1

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object p3

    .line 29
    invoke-virtual {p3}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 30
    .line 31
    .line 32
    move-result-object p3

    .line 33
    move v2, v1

    .line 34
    :goto_1
    array-length v3, p3

    .line 35
    if-ge v2, v3, :cond_4

    .line 36
    .line 37
    aget-object v3, p3, v2

    .line 38
    .line 39
    const-string v4, "createPttElement"

    .line 40
    .line 41
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-nez v4, :cond_1

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_1
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    array-length v5, v4

    .line 57
    const/4 v6, 0x3

    .line 58
    if-ne v5, v6, :cond_3

    .line 59
    .line 60
    aget-object v5, v4, v1

    .line 61
    .line 62
    const-class v6, Ljava/lang/String;

    .line 63
    .line 64
    if-ne v5, v6, :cond_3

    .line 65
    .line 66
    const/4 v5, 0x1

    .line 67
    aget-object v6, v4, v5

    .line 68
    .line 69
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 70
    .line 71
    if-ne v6, v7, :cond_3

    .line 72
    .line 73
    const/4 v6, 0x2

    .line 74
    aget-object v4, v4, v6

    .line 75
    .line 76
    const-class v6, Ljava/util/List;

    .line 77
    .line 78
    invoke-virtual {v6, v4}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 79
    .line 80
    .line 81
    move-result v4

    .line 82
    if-nez v4, :cond_2

    .line 83
    .line 84
    goto :goto_2

    .line 85
    :cond_2
    :try_start_0
    invoke-virtual {v3, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 86
    .line 87
    .line 88
    invoke-static {v1, p2}, Ljava/lang/Math;->max(II)I

    .line 89
    .line 90
    .line 91
    move-result v4

    .line 92
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 93
    .line 94
    .line 95
    move-result-object v4

    .line 96
    filled-new-array {p1, v4, v0}, [Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object v4

    .line 100
    invoke-virtual {v3, p0, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v3

    .line 104
    invoke-static {v3}, Lcom/mr/elaris/w;->s0(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 105
    .line 106
    .line 107
    return-object v3

    .line 108
    :catchall_0
    move-exception v3

    .line 109
    const-string v4, "voice-message"

    .line 110
    .line 111
    const-string v5, "create-ptt-element"

    .line 112
    .line 113
    invoke-static {v4, v5, v3}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 114
    .line 115
    .line 116
    :cond_3
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_4
    const/4 p0, 0x0

    .line 120
    return-object p0
.end method

.method public static o0(Ljava/io/File;Ljava/lang/String;Ljava/lang/String;)Z
    .locals 4

    .line 1
    invoke-static {p0}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    const/4 v1, 0x1

    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-lez v2, :cond_0

    .line 17
    .line 18
    :try_start_0
    new-instance v2, Ljava/io/File;

    .line 19
    .line 20
    invoke-direct {v2, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    if-eqz p1, :cond_0

    .line 28
    .line 29
    invoke-static {p1}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-static {p1}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    return v1

    .line 44
    :catchall_0
    :cond_0
    const-string p1, "/"

    .line 45
    .line 46
    const-string v0, ""

    .line 47
    .line 48
    if-nez p0, :cond_1

    .line 49
    .line 50
    goto :goto_0

    .line 51
    :cond_1
    :try_start_1
    invoke-static {}, Landroid/os/Environment;->getExternalStorageDirectory()Ljava/io/File;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v2

    .line 59
    invoke-static {v2}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v2

    .line 63
    invoke-static {p0}, Lcom/mr/elaris/w;->s(Ljava/io/File;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    invoke-static {p0}, Lcom/mr/elaris/w;->u0(Ljava/lang/String;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p0

    .line 71
    invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    move-result v3

    .line 75
    if-eqz v3, :cond_2

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_2
    invoke-virtual {v2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p1

    .line 82
    invoke-virtual {p0, p1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 83
    .line 84
    .line 85
    move-result p1

    .line 86
    if-eqz p1, :cond_3

    .line 87
    .line 88
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    .line 89
    .line 90
    .line 91
    move-result p1

    .line 92
    add-int/2addr p1, v1

    .line 93
    invoke-virtual {p0, p1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    invoke-static {p0}, Lcom/mr/elaris/w;->v0(Ljava/lang/String;)Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 101
    :catchall_1
    :cond_3
    :goto_0
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 102
    .line 103
    .line 104
    move-result p0

    .line 105
    if-lez p0, :cond_4

    .line 106
    .line 107
    if-eqz p2, :cond_4

    .line 108
    .line 109
    invoke-static {p2}, Lcom/mr/elaris/w;->v0(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 114
    .line 115
    .line 116
    move-result p0

    .line 117
    if-eqz p0, :cond_4

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_4
    const/4 v1, 0x0

    .line 121
    :goto_1
    return v1
.end method

.method public static p(Ljava/lang/Object;Ljava/lang/String;I[B)Ljava/lang/Object;
    .locals 9

    .line 1
    const-string v0, "kk-tts"

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez p0, :cond_0

    .line 5
    .line 6
    goto :goto_2

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v2

    .line 11
    invoke-virtual {v2}, Ljava/lang/Class;->getMethods()[Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 15
    const/4 v3, 0x0

    .line 16
    move v4, v3

    .line 17
    :goto_0
    array-length v5, v2

    .line 18
    if-ge v4, v5, :cond_3

    .line 19
    .line 20
    aget-object v5, v2, v4

    .line 21
    .line 22
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v6

    .line 26
    const-string v7, "createPttElement"

    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v8

    .line 32
    invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    move-result v7

    .line 36
    if-eqz v7, :cond_2

    .line 37
    .line 38
    array-length v7, v6

    .line 39
    const/4 v8, 0x2

    .line 40
    if-ne v7, v8, :cond_2

    .line 41
    .line 42
    aget-object v7, v6, v3

    .line 43
    .line 44
    const-class v8, Ljava/lang/String;

    .line 45
    .line 46
    if-ne v7, v8, :cond_2

    .line 47
    .line 48
    const/4 v7, 0x1

    .line 49
    aget-object v6, v6, v7

    .line 50
    .line 51
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    if-eq v6, v8, :cond_1

    .line 54
    .line 55
    goto :goto_1

    .line 56
    :cond_1
    :try_start_1
    invoke-virtual {v5, v7}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 57
    .line 58
    .line 59
    invoke-static {v3, p2}, Ljava/lang/Math;->max(II)I

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object v6

    .line 67
    filled-new-array {p1, v6}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    invoke-virtual {v5, p0, v6}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-static {v5, p3}, Lcom/mr/elaris/w;->w0(Ljava/lang/Object;[B)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    .line 78
    return-object v5

    .line 79
    :catchall_0
    move-exception v5

    .line 80
    const-string v6, "script-create-ptt"

    .line 81
    .line 82
    invoke-static {v0, v6, v5}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 83
    .line 84
    .line 85
    :cond_2
    :goto_1
    add-int/lit8 v4, v4, 0x1

    .line 86
    .line 87
    goto :goto_0

    .line 88
    :cond_3
    :goto_2
    return-object v1

    .line 89
    :catchall_1
    move-exception p0

    .line 90
    const-string p1, "script-ptt-methods"

    .line 91
    .line 92
    invoke-static {v0, p1, p0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 93
    .line 94
    .line 95
    return-object v1
.end method

.method public static p0(Ljava/lang/Object;)Lv9;
    .locals 1

    .line 1
    sget-object v0, Lcom/mr/elaris/w;->b:Ljava/util/Map;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    :try_start_0
    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 5
    .line 6
    .line 7
    move-result-object p0

    .line 8
    check-cast p0, Lv9;

    .line 9
    .line 10
    monitor-exit v0

    .line 11
    return-object p0

    .line 12
    :catchall_0
    move-exception p0

    .line 13
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    throw p0
.end method

.method public static q(Landroid/app/Activity;Landroid/view/View;)Lpd;
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    const/4 v1, 0x0

    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    const/16 v2, 0x8

    .line 6
    .line 7
    if-ge v0, v2, :cond_3

    .line 8
    .line 9
    :try_start_0
    invoke-static {p1}, Lcom/mr/elaris/w;->T0(Ljava/lang/Object;)Lpd;

    .line 10
    .line 11
    .line 12
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    goto :goto_3

    .line 16
    :cond_0
    :try_start_1
    const-string v2, "com.tencent.aio.data.AIOParam"

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    invoke-static {p1, v2, v3}, Lv4;->l(Ljava/lang/Object;Ljava/lang/String;I)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v2

    .line 23
    invoke-static {v2}, Lcom/mr/elaris/w;->U0(Ljava/lang/Object;)Lpd;

    .line 24
    .line 25
    .line 26
    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 27
    if-eqz v2, :cond_1

    .line 28
    .line 29
    goto :goto_3

    .line 30
    :catchall_0
    :cond_1
    :try_start_2
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 31
    .line 32
    .line 33
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 34
    goto :goto_1

    .line 35
    :catchall_1
    move-object p1, v1

    .line 36
    :goto_1
    :try_start_3
    instance-of v2, p1, Landroid/view/View;

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    check-cast p1, Landroid/view/View;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 41
    .line 42
    goto :goto_2

    .line 43
    :cond_2
    move-object p1, v1

    .line 44
    :goto_2
    add-int/lit8 v0, v0, 0x1

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_3
    move-object v2, v1

    .line 48
    :goto_3
    if-eqz v2, :cond_4

    .line 49
    .line 50
    return-object v2

    .line 51
    :catchall_2
    :cond_4
    sget-object p1, Lcom/mr/elaris/w;->p:Lpd;

    .line 52
    .line 53
    if-eqz p1, :cond_5

    .line 54
    .line 55
    iget-object v0, p1, Lpd;->a:Ljava/lang/String;

    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    if-lez v0, :cond_5

    .line 62
    .line 63
    sget-object v0, Lcom/mr/elaris/w;->p:Lpd;

    .line 64
    .line 65
    if-eqz v0, :cond_5

    .line 66
    .line 67
    iget-object v0, v0, Lpd;->a:Ljava/lang/String;

    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-lez v0, :cond_5

    .line 74
    .line 75
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 76
    .line 77
    .line 78
    move-result-wide v2

    .line 79
    sget-wide v4, Lcom/mr/elaris/w;->q:J

    .line 80
    .line 81
    sub-long/2addr v2, v4

    .line 82
    const-wide/32 v4, 0x927c0

    .line 83
    .line 84
    .line 85
    cmp-long v0, v2, v4

    .line 86
    .line 87
    if-gez v0, :cond_5

    .line 88
    .line 89
    return-object p1

    .line 90
    :cond_5
    :try_start_4
    invoke-static {p0}, Lcom/mr/elaris/w;->R0(Landroid/app/Activity;)Lpd;

    .line 91
    .line 92
    .line 93
    move-result-object p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 94
    if-eqz p0, :cond_6

    .line 95
    .line 96
    return-object p0

    .line 97
    :catchall_3
    :cond_6
    return-object v1
.end method

.method public static q0(Ljava/lang/reflect/Method;)Ljava/lang/String;
    .locals 4

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    const/16 v1, 0x23

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v1

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const/16 v1, 0x28

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_0
    array-length v3, v1

    .line 45
    if-ge v2, v3, :cond_2

    .line 46
    .line 47
    if-lez v2, :cond_1

    .line 48
    .line 49
    const/16 v3, 0x2c

    .line 50
    .line 51
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    :cond_1
    aget-object v3, v1, v2

    .line 55
    .line 56
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v3

    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    add-int/lit8 v2, v2, 0x1

    .line 64
    .line 65
    goto :goto_0

    .line 66
    :cond_2
    const-string v1, "):"

    .line 67
    .line 68
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object p0

    .line 79
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object p0

    .line 86
    return-object p0
.end method

.method public static r(Ljava/lang/Class;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_8

    .line 3
    .line 4
    sget-object v1, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 5
    .line 6
    if-ne p0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_0

    .line 9
    :cond_0
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    if-ne p0, v1, :cond_1

    .line 12
    .line 13
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 14
    .line 15
    return-object p0

    .line 16
    :cond_1
    sget-object v1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-ne p0, v1, :cond_2

    .line 20
    .line 21
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    return-object p0

    .line 26
    :cond_2
    sget-object v1, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 27
    .line 28
    if-ne p0, v1, :cond_3

    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Short;->valueOf(S)Ljava/lang/Short;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0

    .line 35
    :cond_3
    sget-object v1, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 36
    .line 37
    if-ne p0, v1, :cond_4

    .line 38
    .line 39
    invoke-static {v2}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    return-object p0

    .line 44
    :cond_4
    sget-object v1, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 45
    .line 46
    if-ne p0, v1, :cond_5

    .line 47
    .line 48
    invoke-static {v2}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0

    .line 53
    :cond_5
    sget-object v1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 54
    .line 55
    if-ne p0, v1, :cond_6

    .line 56
    .line 57
    const-wide/16 v0, 0x0

    .line 58
    .line 59
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0

    .line 64
    :cond_6
    sget-object v1, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 65
    .line 66
    if-ne p0, v1, :cond_7

    .line 67
    .line 68
    const/4 p0, 0x0

    .line 69
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    return-object p0

    .line 74
    :cond_7
    sget-object v1, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    if-ne p0, v1, :cond_8

    .line 77
    .line 78
    const-wide/16 v0, 0x0

    .line 79
    .line 80
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 81
    .line 82
    .line 83
    move-result-object p0

    .line 84
    return-object p0

    .line 85
    :cond_8
    :goto_0
    return-object v0
.end method

.method public static r0(Ljava/lang/Class;Ljava/lang/String;I)Ljava/lang/Object;
    .locals 9

    .line 1
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    :goto_0
    array-length v3, v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    const-string v4, ""

    .line 9
    .line 10
    if-ge v2, v3, :cond_1

    .line 11
    .line 12
    :try_start_1
    aget-object v3, v0, v2

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v5

    .line 18
    const/4 v6, 0x1

    .line 19
    invoke-virtual {v3, v6}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 20
    .line 21
    .line 22
    array-length v7, v5

    .line 23
    const/4 v8, 0x3

    .line 24
    if-ne v7, v8, :cond_0

    .line 25
    .line 26
    aget-object v7, v5, v1

    .line 27
    .line 28
    sget-object v8, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    if-ne v7, v8, :cond_0

    .line 31
    .line 32
    aget-object v6, v5, v6
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 33
    .line 34
    const-class v7, Ljava/lang/String;

    .line 35
    .line 36
    if-ne v6, v7, :cond_0

    .line 37
    .line 38
    const/4 v6, 0x2

    .line 39
    :try_start_2
    aget-object v5, v5, v6

    .line 40
    .line 41
    if-ne v5, v7, :cond_0

    .line 42
    .line 43
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    filled-new-array {p0, p1, v4}, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    invoke-virtual {v3, p0}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    return-object p0

    .line 56
    :cond_0
    add-int/lit8 v2, v2, 0x1

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    const-string v0, "chatType"

    .line 68
    .line 69
    const-string v1, "type"

    .line 70
    .line 71
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    invoke-static {p0, p2, v0}, Lcom/mr/elaris/w;->L0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    const-string p2, "peerUid"

    .line 79
    .line 80
    const-string v0, "peerUin"

    .line 81
    .line 82
    const-string v1, "uin"

    .line 83
    .line 84
    const-string v2, "uid"

    .line 85
    .line 86
    filled-new-array {p2, v0, v1, v2}, [Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/w;->L0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    const-string p1, "guildId"

    .line 94
    .line 95
    const-string p2, "guildID"

    .line 96
    .line 97
    filled-new-array {p1, p2}, [Ljava/lang/String;

    .line 98
    .line 99
    .line 100
    move-result-object p1

    .line 101
    invoke-static {p0, v4, p1}, Lcom/mr/elaris/w;->L0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 102
    .line 103
    .line 104
    return-object p0

    .line 105
    :catchall_0
    const/4 p0, 0x0

    .line 106
    return-object p0
.end method

.method public static s(Ljava/io/File;)Ljava/lang/String;
    .locals 0

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    return-object p0

    .line 11
    :catchall_0
    invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public static s0(Ljava/lang/Object;)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    invoke-static {p0}, Lcom/mr/elaris/w;->A0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v1, 0x2

    .line 14
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v1

    .line 18
    const-string v2, "voiceType"

    .line 19
    .line 20
    const-string v3, "mVoiceType"

    .line 21
    .line 22
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    invoke-static {p0, v1, v2}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    const-string v1, "voiceChangeType"

    .line 30
    .line 31
    const-string v2, "mVoiceChangeType"

    .line 32
    .line 33
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 41
    .line 42
    const-string v2, "canConvert2Text"

    .line 43
    .line 44
    const-string v3, "mCanConvert2Text"

    .line 45
    .line 46
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    invoke-static {p0, v1, v2}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    const-string v1, "text"

    .line 54
    .line 55
    const-string v2, "mText"

    .line 56
    .line 57
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    const-string v2, ""

    .line 62
    .line 63
    invoke-static {p0, v2, v1}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    const-string v1, "otherBusinessInfo"

    .line 67
    .line 68
    const-string v2, "mOtherBusinessInfo"

    .line 69
    .line 70
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v1

    .line 74
    invoke-static {p0, v1}, Lcom/mr/elaris/w;->H(Ljava/lang/Object;[Ljava/lang/String;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    if-eqz p0, :cond_1

    .line 79
    .line 80
    const-string v1, "aiVoiceType"

    .line 81
    .line 82
    const-string v2, "mAiVoiceType"

    .line 83
    .line 84
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {p0, v0, v1}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 89
    .line 90
    .line 91
    :cond_1
    :goto_0
    return-void
.end method

.method public static t(Landroid/content/Context;F)I
    .locals 0

    .line 1
    :try_start_0
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
    iget p0, p0, Landroid/util/DisplayMetrics;->density:F
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    const/high16 p0, 0x3f800000    # 1.0f

    .line 13
    .line 14
    :goto_0
    mul-float/2addr p1, p0

    .line 15
    const/high16 p0, 0x3f000000    # 0.5f

    .line 16
    .line 17
    add-float/2addr p1, p0

    .line 18
    float-to-int p0, p1

    .line 19
    return p0
.end method

.method public static t0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    return-object v0

    .line 17
    :cond_1
    const-string v0, "0"

    .line 18
    .line 19
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_3

    .line 24
    .line 25
    const-string v0, "primary"

    .line 26
    .line 27
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    if-nez v0, :cond_3

    .line 32
    .line 33
    const-string v0, "primary:"

    .line 34
    .line 35
    invoke-virtual {v0, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    goto :goto_0

    .line 42
    :cond_2
    return-object p0

    .line 43
    :cond_3
    :goto_0
    const-string p0, "\u5185\u90e8\u5b58\u50a8"

    .line 44
    .line 45
    return-object p0
.end method

.method public static u(JLjava/io/File;)V
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    invoke-static {v0, v1, p0, p1}, Ljava/lang/Math;->max(JJ)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-virtual {p2}, Ljava/io/File;->getUsableSpace()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    :goto_0
    const-wide/32 v2, 0x2000000

    .line 15
    .line 16
    .line 17
    cmp-long p2, v0, v2

    .line 18
    .line 19
    if-ltz p2, :cond_1

    .line 20
    .line 21
    sub-long/2addr v0, v2

    .line 22
    cmp-long p0, p0, v0

    .line 23
    .line 24
    if-gtz p0, :cond_1

    .line 25
    .line 26
    return-void

    .line 27
    :cond_1
    const-string p0, "not enough storage for voice copy"

    .line 28
    .line 29
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    return-void
.end method

.method public static u0(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    const-string p0, ""

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    const/16 v0, 0x5c

    .line 7
    .line 8
    const/16 v1, 0x2f

    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    const-string v0, "/"

    .line 15
    .line 16
    invoke-virtual {p0, v0}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v0

    .line 26
    const/4 v1, 0x1

    .line 27
    if-le v0, v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sub-int/2addr v0, v1

    .line 34
    const/4 v1, 0x0

    .line 35
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    return-object p0
.end method

.method public static v(Ljava/io/File;)I
    .locals 20

    .line 1
    invoke-virtual/range {p0 .. p0}, Ljava/io/File;->exists()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const-wide/16 v4, 0x0

    .line 6
    .line 7
    const/4 v6, 0x1

    .line 8
    const/4 v7, 0x0

    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    move-object/from16 v9, p0

    .line 12
    .line 13
    :goto_0
    const-wide/32 v16, 0x7fffffff

    .line 14
    .line 15
    .line 16
    goto/16 :goto_14

    .line 17
    .line 18
    :cond_0
    :try_start_0
    new-instance v8, Ljava/io/FileInputStream;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_6

    .line 19
    .line 20
    move-object/from16 v9, p0

    .line 21
    .line 22
    :try_start_1
    invoke-direct {v8, v9}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 23
    .line 24
    .line 25
    const/16 v0, 0xa

    .line 26
    .line 27
    :try_start_2
    new-array v10, v0, [B
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_4

    .line 28
    .line 29
    move v11, v7

    .line 30
    :goto_1
    if-ge v11, v0, :cond_3

    .line 31
    .line 32
    rsub-int/lit8 v12, v11, 0xa

    .line 33
    .line 34
    :try_start_3
    invoke-virtual {v8, v10, v11, v12}, Ljava/io/FileInputStream;->read([BII)I

    .line 35
    .line 36
    .line 37
    move-result v12
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 38
    if-gez v12, :cond_1

    .line 39
    .line 40
    goto :goto_2

    .line 41
    :cond_1
    if-nez v12, :cond_2

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_2
    add-int/2addr v11, v12

    .line 45
    goto :goto_1

    .line 46
    :catchall_0
    move-exception v0

    .line 47
    move-object v1, v0

    .line 48
    const-wide/32 v16, 0x7fffffff

    .line 49
    .line 50
    .line 51
    goto/16 :goto_11

    .line 52
    .line 53
    :cond_3
    :goto_2
    if-eq v11, v0, :cond_4

    .line 54
    .line 55
    :goto_3
    :try_start_4
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 56
    .line 57
    .line 58
    goto :goto_0

    .line 59
    :catchall_1
    move-exception v0

    .line 60
    :goto_4
    const-wide/32 v16, 0x7fffffff

    .line 61
    .line 62
    .line 63
    goto/16 :goto_13

    .line 64
    .line 65
    :cond_4
    :try_start_5
    aget-byte v11, v10, v7
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_4

    .line 66
    .line 67
    and-int/lit16 v11, v11, 0xff

    .line 68
    .line 69
    const/4 v12, 0x6

    .line 70
    const/4 v13, -0x1

    .line 71
    const/16 v14, 0x9

    .line 72
    .line 73
    if-gt v11, v12, :cond_6

    .line 74
    .line 75
    :try_start_6
    sget-object v11, Li5;->s:[B

    .line 76
    .line 77
    move v12, v7

    .line 78
    :goto_5
    if-ge v12, v14, :cond_9

    .line 79
    .line 80
    add-int v15, v6, v12

    .line 81
    .line 82
    aget-byte v1, v10, v15

    .line 83
    .line 84
    aget-byte v12, v11, v12
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 85
    .line 86
    if-eq v1, v12, :cond_5

    .line 87
    .line 88
    goto :goto_6

    .line 89
    :cond_5
    move v12, v15

    .line 90
    goto :goto_5

    .line 91
    :cond_6
    :goto_6
    :try_start_7
    const-string v1, "#!SILK_V3"
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_4

    .line 92
    .line 93
    move v11, v7

    .line 94
    :goto_7
    if-ge v11, v14, :cond_8

    .line 95
    .line 96
    :try_start_8
    aget-byte v12, v10, v11

    .line 97
    .line 98
    and-int/lit16 v12, v12, 0xff

    .line 99
    .line 100
    invoke-virtual {v1, v11}, Ljava/lang/String;->charAt(I)C

    .line 101
    .line 102
    .line 103
    move-result v15
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_0

    .line 104
    if-eq v12, v15, :cond_7

    .line 105
    .line 106
    goto :goto_3

    .line 107
    :cond_7
    add-int/lit8 v11, v11, 0x1

    .line 108
    .line 109
    goto :goto_7

    .line 110
    :cond_8
    :try_start_9
    aget-byte v1, v10, v14

    .line 111
    .line 112
    if-eq v1, v0, :cond_9

    .line 113
    .line 114
    and-int/lit16 v0, v1, 0xff

    .line 115
    .line 116
    goto :goto_8

    .line 117
    :cond_9
    move v0, v13

    .line 118
    :goto_8
    move-wide v10, v4

    .line 119
    :goto_9
    if-ltz v0, :cond_a

    .line 120
    .line 121
    goto :goto_a

    .line 122
    :cond_a
    invoke-virtual {v8}, Ljava/io/FileInputStream;->read()I

    .line 123
    .line 124
    .line 125
    move-result v0

    .line 126
    :goto_a
    invoke-virtual {v8}, Ljava/io/FileInputStream;->read()I

    .line 127
    .line 128
    .line 129
    move-result v1
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    .line 130
    if-ltz v0, :cond_b

    .line 131
    .line 132
    if-gez v1, :cond_c

    .line 133
    .line 134
    :cond_b
    :goto_b
    const-wide/32 v16, 0x7fffffff

    .line 135
    .line 136
    .line 137
    goto :goto_f

    .line 138
    :cond_c
    shl-int/lit8 v1, v1, 0x8

    .line 139
    .line 140
    or-int/2addr v0, v1

    .line 141
    if-lez v0, :cond_b

    .line 142
    .line 143
    const/16 v1, 0x2000

    .line 144
    .line 145
    if-le v0, v1, :cond_d

    .line 146
    .line 147
    goto :goto_b

    .line 148
    :cond_d
    move-wide v14, v4

    .line 149
    const-wide/32 v16, 0x7fffffff

    .line 150
    .line 151
    .line 152
    :goto_c
    int-to-long v2, v0

    .line 153
    cmp-long v1, v14, v2

    .line 154
    .line 155
    const-wide/16 v18, 0x1

    .line 156
    .line 157
    if-gez v1, :cond_10

    .line 158
    .line 159
    sub-long/2addr v2, v14

    .line 160
    :try_start_a
    invoke-virtual {v8, v2, v3}, Ljava/io/FileInputStream;->skip(J)J

    .line 161
    .line 162
    .line 163
    move-result-wide v2

    .line 164
    cmp-long v12, v2, v4

    .line 165
    .line 166
    if-gtz v12, :cond_e

    .line 167
    .line 168
    invoke-virtual {v8}, Ljava/io/FileInputStream;->read()I

    .line 169
    .line 170
    .line 171
    move-result v2

    .line 172
    if-gez v2, :cond_f

    .line 173
    .line 174
    goto :goto_e

    .line 175
    :catchall_2
    move-exception v0

    .line 176
    :goto_d
    move-object v1, v0

    .line 177
    goto :goto_11

    .line 178
    :cond_e
    move-wide/from16 v18, v2

    .line 179
    .line 180
    :cond_f
    add-long v14, v14, v18

    .line 181
    .line 182
    goto :goto_c

    .line 183
    :cond_10
    :goto_e
    if-gez v1, :cond_11

    .line 184
    .line 185
    goto :goto_f

    .line 186
    :cond_11
    add-long v10, v10, v18

    .line 187
    .line 188
    move v0, v13

    .line 189
    goto :goto_9

    .line 190
    :goto_f
    const-wide/16 v0, 0x14

    .line 191
    .line 192
    mul-long/2addr v0, v10

    .line 193
    const-wide/16 v2, 0x3e7

    .line 194
    .line 195
    add-long/2addr v0, v2

    .line 196
    const-wide/16 v2, 0x3e8

    .line 197
    .line 198
    div-long/2addr v0, v2

    .line 199
    cmp-long v2, v10, v4

    .line 200
    .line 201
    if-gtz v2, :cond_12

    .line 202
    .line 203
    move v0, v7

    .line 204
    goto :goto_10

    .line 205
    :cond_12
    cmp-long v2, v0, v16

    .line 206
    .line 207
    if-lez v2, :cond_13

    .line 208
    .line 209
    const v0, 0x7fffffff

    .line 210
    .line 211
    .line 212
    goto :goto_10

    .line 213
    :cond_13
    long-to-int v0, v0

    .line 214
    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    .line 215
    .line 216
    .line 217
    move-result v0
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_2

    .line 218
    :goto_10
    :try_start_b
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_3

    .line 219
    .line 220
    .line 221
    move v7, v0

    .line 222
    goto :goto_14

    .line 223
    :catchall_3
    move-exception v0

    .line 224
    goto :goto_13

    .line 225
    :catchall_4
    move-exception v0

    .line 226
    const-wide/32 v16, 0x7fffffff

    .line 227
    .line 228
    .line 229
    goto :goto_d

    .line 230
    :goto_11
    :try_start_c
    invoke-virtual {v8}, Ljava/io/FileInputStream;->close()V
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_5

    .line 231
    .line 232
    .line 233
    goto :goto_12

    .line 234
    :catchall_5
    move-exception v0

    .line 235
    :try_start_d
    invoke-virtual {v1, v0}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 236
    .line 237
    .line 238
    :goto_12
    throw v1
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_3

    .line 239
    :catchall_6
    move-exception v0

    .line 240
    move-object/from16 v9, p0

    .line 241
    .line 242
    goto/16 :goto_4

    .line 243
    .line 244
    :goto_13
    const-string v1, "voice-audio-metadata"

    .line 245
    .line 246
    const-string v2, "silk-duration"

    .line 247
    .line 248
    invoke-static {v1, v2, v0}, Le7;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    :goto_14
    if-lez v7, :cond_14

    .line 252
    .line 253
    move v6, v7

    .line 254
    goto :goto_16

    .line 255
    :cond_14
    invoke-virtual {v9}, Ljava/io/File;->length()J

    .line 256
    .line 257
    .line 258
    move-result-wide v0

    .line 259
    cmp-long v2, v0, v4

    .line 260
    .line 261
    if-gtz v2, :cond_15

    .line 262
    .line 263
    goto :goto_16

    .line 264
    :cond_15
    long-to-double v0, v0

    .line 265
    const-wide v2, 0x4092c00000000000L    # 1200.0

    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    div-double/2addr v0, v2

    .line 271
    invoke-static {v0, v1}, Ljava/lang/Math;->ceil(D)D

    .line 272
    .line 273
    .line 274
    move-result-wide v0

    .line 275
    double-to-long v0, v0

    .line 276
    cmp-long v2, v0, v16

    .line 277
    .line 278
    if-lez v2, :cond_16

    .line 279
    .line 280
    const v1, 0x7fffffff

    .line 281
    .line 282
    .line 283
    goto :goto_15

    .line 284
    :cond_16
    long-to-int v0, v0

    .line 285
    invoke-static {v6, v0}, Ljava/lang/Math;->max(II)I

    .line 286
    .line 287
    .line 288
    move-result v1

    .line 289
    :goto_15
    move v6, v1

    .line 290
    :goto_16
    return v6
.end method

.method public static v0(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/16 v1, 0x5c

    .line 7
    .line 8
    const/16 v2, 0x2f

    .line 9
    .line 10
    invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    :goto_0
    const-string v1, "/"

    .line 15
    .line 16
    invoke-virtual {p0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    const/4 v3, 0x1

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    goto :goto_0

    .line 28
    :cond_1
    :goto_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-lez v2, :cond_2

    .line 39
    .line 40
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 41
    .line 42
    .line 43
    move-result v2

    .line 44
    sub-int/2addr v2, v3

    .line 45
    const/4 v4, 0x0

    .line 46
    invoke-virtual {p0, v4, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 52
    .line 53
    .line 54
    move-result v2

    .line 55
    if-nez v2, :cond_3

    .line 56
    .line 57
    return-object v0

    .line 58
    :cond_3
    invoke-virtual {p0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    return-object p0
.end method

.method public static w(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    const/16 v1, 0x2e

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(I)I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-ltz v1, :cond_3

    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    const/4 v3, 0x1

    .line 19
    sub-int/2addr v2, v3

    .line 20
    if-ge v1, v2, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 23
    .line 24
    .line 25
    move-result v2

    .line 26
    sub-int/2addr v2, v1

    .line 27
    const/16 v4, 0x8

    .line 28
    .line 29
    if-le v2, v4, :cond_1

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :cond_1
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const-string v1, "[^A-Za-z0-9.]"

    .line 37
    .line 38
    invoke-virtual {p0, v1, v0}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object p0

    .line 42
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-gt v1, v3, :cond_2

    .line 47
    .line 48
    return-object v0

    .line 49
    :cond_2
    return-object p0

    .line 50
    :cond_3
    :goto_0
    return-object v0
.end method

.method public static w0(Ljava/lang/Object;[B)V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    invoke-static {p0}, Lcom/mr/elaris/w;->A0(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    if-nez p0, :cond_0

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    new-instance v2, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    :goto_0
    array-length v3, p1

    .line 19
    if-ge v0, v3, :cond_1

    .line 20
    .line 21
    aget-byte v3, p1, v0

    .line 22
    .line 23
    invoke-static {v3}, Ljava/lang/Byte;->valueOf(B)Ljava/lang/Byte;

    .line 24
    .line 25
    .line 26
    move-result-object v3

    .line 27
    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    add-int/lit8 v0, v0, 0x1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const-string p1, "autoConvertText"

    .line 34
    .line 35
    const-string v0, "mAutoConvertText"

    .line 36
    .line 37
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-static {p0, v1, p1}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    const-string p1, "voiceChangeType"

    .line 45
    .line 46
    const-string v0, "mVoiceChangeType"

    .line 47
    .line 48
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    invoke-static {p0, v1, p1}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 53
    .line 54
    .line 55
    const-string p1, "waveAmplitudes"

    .line 56
    .line 57
    const-string v0, "mWaveAmplitudes"

    .line 58
    .line 59
    filled-new-array {p1, v0}, [Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-static {p0, v2, p1}, Lcom/mr/elaris/w;->M0(Ljava/lang/Object;Ljava/io/Serializable;[Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    return-void
.end method

.method public static x(Ln9;)Ljava/lang/String;
    .locals 6

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    iget-wide v1, p0, Ln9;->f:J

    .line 4
    .line 5
    const-wide/16 v3, 0x400

    .line 6
    .line 7
    cmp-long v3, v1, v3

    .line 8
    .line 9
    if-gez v3, :cond_0

    .line 10
    .line 11
    new-instance v3, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, " B"

    .line 20
    .line 21
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    long-to-double v1, v1

    .line 30
    const-wide/high16 v3, 0x4090000000000000L    # 1024.0

    .line 31
    .line 32
    div-double/2addr v1, v3

    .line 33
    cmpg-double v5, v1, v3

    .line 34
    .line 35
    if-gez v5, :cond_1

    .line 36
    .line 37
    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 38
    .line 39
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v1

    .line 47
    const-string v2, "%.1f KB"

    .line 48
    .line 49
    invoke-static {v3, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    goto :goto_0

    .line 54
    :cond_1
    sget-object v5, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 55
    .line 56
    div-double/2addr v1, v3

    .line 57
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    const-string v2, "%.2f MB"

    .line 66
    .line 67
    invoke-static {v5, v2, v1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    :goto_0
    :try_start_0
    new-instance v2, Ljava/text/SimpleDateFormat;

    .line 72
    .line 73
    const-string v3, "MM-dd HH:mm"

    .line 74
    .line 75
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 76
    .line 77
    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 78
    .line 79
    .line 80
    new-instance v3, Ljava/util/Date;

    .line 81
    .line 82
    iget-wide v4, p0, Ln9;->g:J

    .line 83
    .line 84
    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-object v2, v0

    .line 93
    :goto_1
    iget-object v3, p0, Ln9;->a:Ljava/io/File;

    .line 94
    .line 95
    if-eqz v3, :cond_2

    .line 96
    .line 97
    :try_start_1
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    if-eqz v4, :cond_2

    .line 102
    .line 103
    invoke-virtual {v3}, Ljava/io/File;->getParentFile()Ljava/io/File;

    .line 104
    .line 105
    .line 106
    move-result-object v3

    .line 107
    invoke-virtual {v3}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 111
    goto :goto_2

    .line 112
    :catchall_1
    :cond_2
    iget-object p0, p0, Ln9;->d:Ljava/lang/String;

    .line 113
    .line 114
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 115
    .line 116
    .line 117
    move-result v3

    .line 118
    if-nez v3, :cond_3

    .line 119
    .line 120
    move-object p0, v0

    .line 121
    goto :goto_2

    .line 122
    :cond_3
    invoke-static {p0}, Lcom/mr/elaris/w;->v0(Ljava/lang/String;)Ljava/lang/String;

    .line 123
    .line 124
    .line 125
    move-result-object p0

    .line 126
    const-string v3, "/"

    .line 127
    .line 128
    invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    .line 129
    .line 130
    .line 131
    move-result v3

    .line 132
    if-eqz v3, :cond_4

    .line 133
    .line 134
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    add-int/lit8 v3, v3, -0x1

    .line 139
    .line 140
    const/4 v4, 0x0

    .line 141
    invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 142
    .line 143
    .line 144
    move-result-object p0

    .line 145
    :cond_4
    const/16 v3, 0x2f

    .line 146
    .line 147
    invoke-virtual {p0, v3}, Ljava/lang/String;->lastIndexOf(I)I

    .line 148
    .line 149
    .line 150
    move-result v3

    .line 151
    if-ltz v3, :cond_5

    .line 152
    .line 153
    add-int/lit8 v3, v3, 0x1

    .line 154
    .line 155
    invoke-virtual {p0, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object p0

    .line 159
    :cond_5
    :goto_2
    new-instance v3, Ljava/lang/StringBuilder;

    .line 160
    .line 161
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 162
    .line 163
    .line 164
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v2

    .line 168
    invoke-static {v2}, Lcom/mr/elaris/w;->G([Ljava/lang/String;)Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    const-string v2, "  "

    .line 176
    .line 177
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 181
    .line 182
    .line 183
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 184
    .line 185
    .line 186
    move-result v1

    .line 187
    if-nez v1, :cond_6

    .line 188
    .line 189
    goto :goto_3

    .line 190
    :cond_6
    invoke-virtual {v2, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    :goto_3
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 195
    .line 196
    .line 197
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 198
    .line 199
    .line 200
    move-result-object p0

    .line 201
    return-object p0
.end method

.method public static x0(ILjava/lang/Object;)Ljava/lang/String;
    .locals 8

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    if-eqz p1, :cond_8

    .line 4
    .line 5
    const/4 v1, 0x2

    .line 6
    if-le p0, v1, :cond_0

    .line 7
    .line 8
    goto :goto_3

    .line 9
    :cond_0
    instance-of v1, p1, Ljava/lang/CharSequence;

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0

    .line 18
    :cond_1
    instance-of v1, p1, Ljava/lang/Number;

    .line 19
    .line 20
    if-nez v1, :cond_8

    .line 21
    .line 22
    instance-of v1, p1, Ljava/lang/Boolean;

    .line 23
    .line 24
    if-eqz v1, :cond_2

    .line 25
    .line 26
    goto :goto_3

    .line 27
    :cond_2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    :goto_0
    if-eqz v1, :cond_7

    .line 37
    .line 38
    const-class v2, Ljava/lang/Object;

    .line 39
    .line 40
    if-eq v1, v2, :cond_7

    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 43
    .line 44
    .line 45
    move-result-object v2

    .line 46
    const/4 v3, 0x0

    .line 47
    :goto_1
    array-length v4, v2

    .line 48
    if-ge v3, v4, :cond_6

    .line 49
    .line 50
    aget-object v4, v2, v3

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    invoke-static {v5}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 57
    .line 58
    .line 59
    move-result v5

    .line 60
    if-eqz v5, :cond_3

    .line 61
    .line 62
    goto :goto_2

    .line 63
    :cond_3
    const/4 v5, 0x1

    .line 64
    :try_start_0
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v4, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    instance-of v7, v6, Ljava/lang/CharSequence;

    .line 72
    .line 73
    if-eqz v7, :cond_4

    .line 74
    .line 75
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    goto :goto_2

    .line 79
    :cond_4
    invoke-virtual {v4}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 84
    .line 85
    .line 86
    move-result v4

    .line 87
    if-nez v4, :cond_5

    .line 88
    .line 89
    add-int/2addr v5, p0

    .line 90
    invoke-static {v5, v6}, Lcom/mr/elaris/w;->x0(ILjava/lang/Object;)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    .line 96
    .line 97
    :catchall_0
    :cond_5
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 98
    .line 99
    goto :goto_1

    .line 100
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v1

    .line 104
    goto :goto_0

    .line 105
    :cond_7
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object p0

    .line 109
    return-object p0

    .line 110
    :cond_8
    :goto_3
    return-object v0
.end method

.method public static y(ILjava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    if-eqz p1, :cond_6

    .line 2
    .line 3
    const/4 v0, 0x2

    .line 4
    if-le p0, v0, :cond_0

    .line 5
    .line 6
    goto :goto_3

    .line 7
    :cond_0
    const-class v0, Landroid/app/Activity;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    return-object p1

    .line 16
    :cond_1
    instance-of v0, p1, Ljava/lang/CharSequence;

    .line 17
    .line 18
    if-nez v0, :cond_6

    .line 19
    .line 20
    instance-of v0, p1, Ljava/lang/Number;

    .line 21
    .line 22
    if-nez v0, :cond_6

    .line 23
    .line 24
    instance-of v0, p1, Ljava/lang/Boolean;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    goto :goto_3

    .line 29
    :cond_2
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :goto_0
    if-eqz v0, :cond_6

    .line 34
    .line 35
    const-class v1, Ljava/lang/Object;

    .line 36
    .line 37
    if-eq v0, v1, :cond_6

    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Class;->getDeclaredFields()[Ljava/lang/reflect/Field;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    const/4 v2, 0x0

    .line 44
    :goto_1
    array-length v3, v1

    .line 45
    if-ge v2, v3, :cond_5

    .line 46
    .line 47
    aget-object v3, v1, v2

    .line 48
    .line 49
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getModifiers()I

    .line 50
    .line 51
    .line 52
    move-result v4

    .line 53
    invoke-static {v4}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 54
    .line 55
    .line 56
    move-result v4

    .line 57
    if-nez v4, :cond_4

    .line 58
    .line 59
    invoke-virtual {v3}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 60
    .line 61
    .line 62
    move-result-object v4

    .line 63
    invoke-virtual {v4}, Ljava/lang/Class;->isPrimitive()Z

    .line 64
    .line 65
    .line 66
    move-result v4

    .line 67
    if-eqz v4, :cond_3

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :cond_3
    const/4 v4, 0x1

    .line 71
    :try_start_0
    invoke-virtual {v3, v4}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3, p1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v3

    .line 78
    add-int/2addr v4, p0

    .line 79
    invoke-static {v4, v3}, Lcom/mr/elaris/w;->y(ILjava/lang/Object;)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 83
    if-eqz v3, :cond_4

    .line 84
    .line 85
    return-object v3

    .line 86
    :catchall_0
    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    goto :goto_0

    .line 94
    :cond_6
    :goto_3
    const/4 p0, 0x0

    .line 95
    return-object p0
.end method

.method public static y0(Landroid/view/ViewGroup;Landroid/widget/ImageView;)V
    .locals 7

    .line 1
    :try_start_0
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    instance-of v1, v0, Landroid/widget/FrameLayout;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    const/16 v2, 0x11

    .line 8
    .line 9
    const/high16 v3, 0x42080000    # 34.0f

    .line 10
    .line 11
    const-string v4, "ELARIS_LOCAL_VOICE_BAR_CELL"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    :try_start_1
    move-object v1, v0

    .line 16
    check-cast v1, Landroid/view/View;

    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    invoke-virtual {v4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    move-object v1, v0

    .line 29
    check-cast v1, Landroid/widget/FrameLayout;

    .line 30
    .line 31
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 32
    .line 33
    .line 34
    move-result-object v5

    .line 35
    invoke-static {v5, v3}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 36
    .line 37
    .line 38
    move-result v5

    .line 39
    new-instance v6, Landroid/widget/FrameLayout$LayoutParams;

    .line 40
    .line 41
    invoke-direct {v6, v5, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 42
    .line 43
    .line 44
    iput v2, v6, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 45
    .line 46
    invoke-virtual {p1, v6}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :cond_0
    const/4 v1, 0x0

    .line 51
    :goto_0
    if-nez v1, :cond_2

    .line 52
    .line 53
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 54
    .line 55
    if-eqz v1, :cond_1

    .line 56
    .line 57
    check-cast v0, Landroid/view/ViewGroup;

    .line 58
    .line 59
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 60
    .line 61
    .line 62
    :cond_1
    new-instance v1, Landroid/widget/FrameLayout;

    .line 63
    .line 64
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-direct {v1, v0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v4}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    invoke-static {v0, v3}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    new-instance v4, Landroid/widget/FrameLayout$LayoutParams;

    .line 83
    .line 84
    invoke-direct {v4, v0, v0}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V

    .line 85
    .line 86
    .line 87
    iput v2, v4, Landroid/widget/FrameLayout$LayoutParams;->gravity:I

    .line 88
    .line 89
    invoke-virtual {v1, p1, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 93
    .line 94
    .line 95
    move-result p1

    .line 96
    const/4 v0, 0x0

    .line 97
    move v2, v0

    .line 98
    :goto_1
    if-ge v2, p1, :cond_5

    .line 99
    .line 100
    invoke-virtual {p0, v2}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    if-eqz v4, :cond_4

    .line 105
    .line 106
    if-ne v4, v1, :cond_3

    .line 107
    .line 108
    goto :goto_2

    .line 109
    :cond_3
    invoke-static {v4, v0}, Lcom/mr/elaris/w;->c0(Landroid/view/View;I)Z

    .line 110
    .line 111
    .line 112
    move-result v4

    .line 113
    if-eqz v4, :cond_4

    .line 114
    .line 115
    move p1, v2

    .line 116
    goto :goto_3

    .line 117
    :cond_4
    :goto_2
    add-int/lit8 v2, v2, 0x1

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_5
    :goto_3
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->indexOfChild(Landroid/view/View;)I

    .line 121
    .line 122
    .line 123
    move-result v2

    .line 124
    if-ltz v2, :cond_6

    .line 125
    .line 126
    invoke-virtual {p0, v1}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    .line 127
    .line 128
    .line 129
    if-ge v2, p1, :cond_6

    .line 130
    .line 131
    add-int/lit8 p1, p1, -0x1

    .line 132
    .line 133
    :cond_6
    if-ltz p1, :cond_7

    .line 134
    .line 135
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 136
    .line 137
    .line 138
    move-result v2

    .line 139
    if-le p1, v2, :cond_8

    .line 140
    .line 141
    :cond_7
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    :cond_8
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 146
    .line 147
    .line 148
    move-result-object v2

    .line 149
    invoke-static {v2, v3}, Lcom/mr/elaris/w;->t(Landroid/content/Context;F)I

    .line 150
    .line 151
    .line 152
    move-result v2

    .line 153
    new-instance v3, Landroid/widget/LinearLayout$LayoutParams;

    .line 154
    .line 155
    const/high16 v4, 0x3f800000    # 1.0f

    .line 156
    .line 157
    invoke-direct {v3, v0, v2, v4}, Landroid/widget/LinearLayout$LayoutParams;-><init>(IIF)V

    .line 158
    .line 159
    .line 160
    const/16 v0, 0x10

    .line 161
    .line 162
    iput v0, v3, Landroid/widget/LinearLayout$LayoutParams;->gravity:I

    .line 163
    .line 164
    invoke-virtual {p0, v1, p1, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 165
    .line 166
    .line 167
    :catchall_0
    return-void
.end method

.method public static z(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 5

    .line 1
    :goto_0
    if-eqz p0, :cond_2

    .line 2
    .line 3
    const-class v0, Ljava/lang/Object;

    .line 4
    .line 5
    if-eq p0, v0, :cond_2

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    const/4 v1, 0x0

    .line 12
    :goto_1
    array-length v2, v0

    .line 13
    if-ge v1, v2, :cond_1

    .line 14
    .line 15
    aget-object v2, v0, v1

    .line 16
    .line 17
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v3

    .line 21
    invoke-static {v3}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    if-nez v3, :cond_0

    .line 26
    .line 27
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 32
    .line 33
    if-ne v3, v4, :cond_0

    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    array-length v3, v3

    .line 40
    if-nez v3, :cond_0

    .line 41
    .line 42
    return-object v2

    .line 43
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 44
    .line 45
    goto :goto_1

    .line 46
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    new-instance p0, Ljava/lang/NoSuchMethodException;

    .line 52
    .line 53
    const-string v0, "menu click"

    .line 54
    .line 55
    invoke-direct {p0, v0}, Ljava/lang/NoSuchMethodException;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    throw p0
.end method

.method public static z0(Landroid/content/Context;Ljava/io/File;Lve;)Lna;
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p0, :cond_a

    .line 3
    .line 4
    if-eqz p1, :cond_a

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/io/File;->exists()Z

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    if-eqz v1, :cond_a

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/io/File;->isFile()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_a

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 19
    .line 20
    .line 21
    move-result-wide v1

    .line 22
    const-wide/16 v3, 0x0

    .line 23
    .line 24
    cmp-long v1, v1, v3

    .line 25
    .line 26
    if-lez v1, :cond_9

    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v1

    .line 36
    invoke-static {v1}, Lu9;->t(Ljava/lang/String;)Z

    .line 37
    .line 38
    .line 39
    move-result v2

    .line 40
    const-string v3, "unsupported voice extension: "

    .line 41
    .line 42
    if-eqz v2, :cond_7

    .line 43
    .line 44
    invoke-virtual {p1}, Ljava/io/File;->getName()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-static {v1}, Lcom/mr/elaris/w;->w(Ljava/lang/String;)Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v1

    .line 52
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 53
    .line 54
    .line 55
    move-result v2

    .line 56
    if-nez v2, :cond_0

    .line 57
    .line 58
    const-string v1, ".slk"

    .line 59
    .line 60
    :cond_0
    invoke-static {v1}, Lu9;->t(Ljava/lang/String;)Z

    .line 61
    .line 62
    .line 63
    move-result v2

    .line 64
    if-eqz v2, :cond_6

    .line 65
    .line 66
    new-instance v2, Ljava/io/File;

    .line 67
    .line 68
    invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 69
    .line 70
    .line 71
    move-result-object p0

    .line 72
    const-string v3, "elaris_local_voice"

    .line 73
    .line 74
    invoke-direct {v2, p0, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2}, Ljava/io/File;->exists()Z

    .line 78
    .line 79
    .line 80
    move-result p0

    .line 81
    if-nez p0, :cond_2

    .line 82
    .line 83
    invoke-virtual {v2}, Ljava/io/File;->mkdirs()Z

    .line 84
    .line 85
    .line 86
    move-result p0

    .line 87
    if-eqz p0, :cond_1

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_1
    const-string p0, "voice cache mkdir failed"

    .line 91
    .line 92
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 93
    .line 94
    .line 95
    return-object v0

    .line 96
    :cond_2
    :goto_0
    invoke-static {v2}, Lcom/mr/elaris/w;->j(Ljava/io/File;)V

    .line 97
    .line 98
    .line 99
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 100
    .line 101
    invoke-virtual {v1, p0}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object p0

    .line 105
    const-string v1, "Elaris-local-voice-"

    .line 106
    .line 107
    invoke-static {v1, p0, v2}, Ljava/io/File;->createTempFile(Ljava/lang/String;Ljava/lang/String;Ljava/io/File;)Ljava/io/File;

    .line 108
    .line 109
    .line 110
    move-result-object p0

    .line 111
    :try_start_0
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 112
    .line 113
    .line 114
    move-result-wide v3

    .line 115
    invoke-static {v3, v4, v2}, Lcom/mr/elaris/w;->u(JLjava/io/File;)V

    .line 116
    .line 117
    .line 118
    new-instance v1, Ljava/io/FileInputStream;

    .line 119
    .line 120
    invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    .line 121
    .line 122
    .line 123
    :try_start_1
    new-instance v2, Ljava/io/FileOutputStream;

    .line 124
    .line 125
    invoke-direct {v2, p0}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 126
    .line 127
    .line 128
    :try_start_2
    invoke-static {v1, v2, p0, p2}, Lcom/mr/elaris/w;->n(Ljava/io/InputStream;Ljava/io/FileOutputStream;Ljava/io/File;Lve;)J

    .line 129
    .line 130
    .line 131
    move-result-wide v3

    .line 132
    invoke-virtual {p1}, Ljava/io/File;->length()J

    .line 133
    .line 134
    .line 135
    move-result-wide p1
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    cmp-long p1, v3, p1

    .line 137
    .line 138
    if-nez p1, :cond_4

    .line 139
    .line 140
    invoke-static {v1}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v2}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 144
    .line 145
    .line 146
    if-eqz p0, :cond_3

    .line 147
    .line 148
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 149
    .line 150
    .line 151
    move-result p1

    .line 152
    if-eqz p1, :cond_3

    .line 153
    .line 154
    new-instance p1, Lna;

    .line 155
    .line 156
    invoke-static {p0}, Lcom/mr/elaris/w;->v(Ljava/io/File;)I

    .line 157
    .line 158
    .line 159
    move-result p2

    .line 160
    invoke-direct {p1, p0, p2}, Lna;-><init>(Ljava/io/File;I)V

    .line 161
    .line 162
    .line 163
    return-object p1

    .line 164
    :cond_3
    const-string p0, "voice cache missing"

    .line 165
    .line 166
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 167
    .line 168
    .line 169
    return-object v0

    .line 170
    :cond_4
    :try_start_3
    new-instance p1, Ljava/io/IOException;

    .line 171
    .line 172
    const-string p2, "voice source changed or incomplete"

    .line 173
    .line 174
    invoke-direct {p1, p2}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw p1
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 178
    :catchall_0
    move-exception p0

    .line 179
    :goto_1
    move-object v0, v1

    .line 180
    goto :goto_5

    .line 181
    :catch_0
    move-exception p1

    .line 182
    :goto_2
    move-object v0, v1

    .line 183
    goto :goto_3

    .line 184
    :catchall_1
    move-exception p0

    .line 185
    move-object v2, v0

    .line 186
    goto :goto_1

    .line 187
    :catch_1
    move-exception p1

    .line 188
    move-object v2, v0

    .line 189
    goto :goto_2

    .line 190
    :catchall_2
    move-exception p0

    .line 191
    move-object v2, v0

    .line 192
    goto :goto_5

    .line 193
    :catch_2
    move-exception p1

    .line 194
    move-object v2, v0

    .line 195
    :goto_3
    :try_start_4
    invoke-virtual {p0}, Ljava/io/File;->exists()Z

    .line 196
    .line 197
    .line 198
    move-result p2

    .line 199
    if-eqz p2, :cond_5

    .line 200
    .line 201
    invoke-virtual {p0}, Ljava/io/File;->delete()Z

    .line 202
    .line 203
    .line 204
    goto :goto_4

    .line 205
    :catchall_3
    move-exception p0

    .line 206
    goto :goto_5

    .line 207
    :cond_5
    :goto_4
    throw p1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_3

    .line 208
    :goto_5
    invoke-static {v0}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 209
    .line 210
    .line 211
    invoke-static {v2}, Lcom/mr/elaris/w;->l(Ljava/io/Closeable;)V

    .line 212
    .line 213
    .line 214
    throw p0

    .line 215
    :cond_6
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 216
    .line 217
    .line 218
    move-result-object p0

    .line 219
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 220
    .line 221
    .line 222
    return-object v0

    .line 223
    :cond_7
    invoke-static {v1}, Lu9;->s(Ljava/lang/String;)Z

    .line 224
    .line 225
    .line 226
    move-result v2

    .line 227
    if-eqz v2, :cond_8

    .line 228
    .line 229
    invoke-static {p0, p1, p2}, Lcom/mr/elaris/w;->X0(Landroid/content/Context;Ljava/io/File;Lve;)Lna;

    .line 230
    .line 231
    .line 232
    move-result-object p0

    .line 233
    return-object p0

    .line 234
    :cond_8
    invoke-virtual {v3, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 235
    .line 236
    .line 237
    move-result-object p0

    .line 238
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 239
    .line 240
    .line 241
    return-object v0

    .line 242
    :cond_9
    const-string p0, "voice source empty"

    .line 243
    .line 244
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 245
    .line 246
    .line 247
    return-object v0

    .line 248
    :cond_a
    const-string p0, "voice source missing"

    .line 249
    .line 250
    invoke-static {p0}, Lu2;->c(Ljava/lang/String;)V

    .line 251
    .line 252
    .line 253
    return-object v0
.end method
