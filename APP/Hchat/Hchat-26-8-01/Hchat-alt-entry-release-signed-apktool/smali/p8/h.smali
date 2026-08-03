.class public final Lp8/h;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final k:Ljava/util/List;

.field public static final l:Ljava/util/List;

.field public static final m:Ljava/util/List;

.field public static final n:Ljava/util/List;

.field public static final o:Ljava/util/List;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Lorg/luckypray/dexkit/DexKitBridge;

.field public final d:Lp8/p;

.field public final e:Landroid/content/SharedPreferences;

.field public volatile f:Ljava/lang/reflect/Method;

.field public volatile g:Ljava/lang/reflect/Method;

.field public volatile h:Ljava/lang/reflect/Method;

.field public volatile i:Ljava/lang/reflect/Method;

.field public volatile j:Ljava/lang/reflect/Method;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    const-string v0, "getSnsInfoStorage"

    .line 2
    .line 3
    const-string v1, "com.tencent.mm.plugin.sns.model.SnsCore"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lp8/h;->k:Ljava/util/List;

    .line 14
    .line 15
    const-string v0, "select *,rowid from SnsInfo  where SnsInfo.snsId="

    .line 16
    .line 17
    const-string v1, " limit 1"

    .line 18
    .line 19
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    sput-object v0, Lp8/h;->l:Ljava/util/List;

    .line 28
    .line 29
    const-string v0, "getCursorByUserName"

    .line 30
    .line 31
    const-string v1, "com.tencent.mm.plugin.sns.storage.SnsInfoStorage"

    .line 32
    .line 33
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    sput-object v0, Lp8/h;->m:Ljava/util/List;

    .line 42
    .line 43
    const-string v0, " from AdSnsInfo where createTime >"

    .line 44
    .line 45
    const-string v2, " limit "

    .line 46
    .line 47
    const-string v3, "getAdCursorForTimeLine"

    .line 48
    .line 49
    filled-new-array {v3, v1, v0, v2}, [Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    sput-object v0, Lp8/h;->n:Ljava/util/List;

    .line 58
    .line 59
    const-string v0, "snsId=?"

    .line 60
    .line 61
    const-string v2, "rowid"

    .line 62
    .line 63
    const-string v3, "update"

    .line 64
    .line 65
    filled-new-array {v3, v1, v0, v2}, [Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    sput-object v0, Lp8/h;->o:Ljava/util/List;

    .line 74
    .line 75
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/ClassLoader;Lorg/luckypray/dexkit/DexKitBridge;Lp8/p;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lp8/h;->a:Landroid/content/Context;

    .line 11
    .line 12
    iput-object p2, p0, Lp8/h;->b:Ljava/lang/ClassLoader;

    .line 13
    .line 14
    iput-object p3, p0, Lp8/h;->c:Lorg/luckypray/dexkit/DexKitBridge;

    .line 15
    .line 16
    iput-object p4, p0, Lp8/h;->d:Lp8/p;

    .line 17
    .line 18
    const-string p2, "Hchat_sns_cached_post_storage_cache"

    .line 19
    .line 20
    invoke-static {p1, p2}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 21
    .line 22
    .line 23
    move-result-object p1

    .line 24
    iput-object p1, p0, Lp8/h;->e:Landroid/content/SharedPreferences;

    .line 25
    .line 26
    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_0

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    const-string p1, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 45
    .line 46
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    if-eqz p0, :cond_0

    .line 51
    .line 52
    array-length p0, v0

    .line 53
    const/4 p1, 0x1

    .line 54
    if-ne p0, p1, :cond_0

    .line 55
    .line 56
    aget-object p0, v0, v2

    .line 57
    .line 58
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 59
    .line 60
    invoke-static {p0, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 61
    .line 62
    .line 63
    move-result p0

    .line 64
    if-eqz p0, :cond_0

    .line 65
    .line 66
    return p1

    .line 67
    :cond_0
    return v2
.end method

.method public static b(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 8

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const-class p0, Landroid/database/Cursor;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    const-class v5, Ljava/lang/String;

    .line 50
    .line 51
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 52
    .line 53
    const-class v2, Ljava/lang/String;

    .line 54
    .line 55
    move-object v4, v1

    .line 56
    move-object v6, v3

    .line 57
    move-object v7, v3

    .line 58
    filled-new-array/range {v1 .. v7}, [Ljava/lang/Class;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v0, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 63
    .line 64
    .line 65
    move-result p0

    .line 66
    if-eqz p0, :cond_0

    .line 67
    .line 68
    const/4 p0, 0x1

    .line 69
    return p0

    .line 70
    :cond_0
    const/4 p0, 0x0

    .line 71
    return p0
.end method

.method public static c(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-nez v1, :cond_0

    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 30
    .line 31
    .line 32
    move-result p0

    .line 33
    if-eqz p0, :cond_0

    .line 34
    .line 35
    const-class p0, Landroid/database/Cursor;

    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    invoke-virtual {p0, p1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 42
    .line 43
    .line 44
    move-result p0

    .line 45
    if-eqz p0, :cond_0

    .line 46
    .line 47
    const-class p0, Ljava/lang/String;

    .line 48
    .line 49
    sget-object p1, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 50
    .line 51
    filled-new-array {p0, p1, p1}, [Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    invoke-static {v0, p0}, Ljava/util/Arrays;->equals([Ljava/lang/Object;[Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result p0

    .line 59
    if-eqz p0, :cond_0

    .line 60
    .line 61
    const/4 p0, 0x1

    .line 62
    return p0

    .line 63
    :cond_0
    const/4 p0, 0x0

    .line 64
    return p0
.end method

.method public static d(Ljava/lang/reflect/Method;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    invoke-static {v0}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-nez v0, :cond_0

    .line 21
    .line 22
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    array-length v0, v0

    .line 30
    if-nez v0, :cond_0

    .line 31
    .line 32
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {v0}, Ljava/lang/Class;->isPrimitive()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-nez v0, :cond_0

    .line 41
    .line 42
    invoke-virtual {p0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p0

    .line 50
    const-string v0, "com.tencent.mm.plugin.sns.storage."

    .line 51
    .line 52
    invoke-static {p0, v0, v1}, Log/t;->d0(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 53
    .line 54
    .line 55
    move-result p0

    .line 56
    if-eqz p0, :cond_0

    .line 57
    .line 58
    const/4 p0, 0x1

    .line 59
    return p0

    .line 60
    :cond_0
    return v1
.end method

.method public static e(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z
    .locals 3

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isAbstract(I)Z

    .line 21
    .line 22
    .line 23
    move-result v1

    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v1, p0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    sget-object v1, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-static {p0, v1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result p0

    .line 46
    if-nez p0, :cond_0

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    const-class p1, Ljava/lang/Boolean;

    .line 53
    .line 54
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    move-result p0

    .line 58
    if-eqz p0, :cond_1

    .line 59
    .line 60
    :cond_0
    array-length p0, v0

    .line 61
    const/4 p1, 0x2

    .line 62
    if-ne p0, p1, :cond_1

    .line 63
    .line 64
    aget-object p0, v0, v2

    .line 65
    .line 66
    sget-object p1, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    invoke-static {p0, p1}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 69
    .line 70
    .line 71
    move-result p0

    .line 72
    if-eqz p0, :cond_1

    .line 73
    .line 74
    const/4 p0, 0x1

    .line 75
    aget-object p1, v0, p0

    .line 76
    .line 77
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    const-string v0, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 82
    .line 83
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 84
    .line 85
    .line 86
    move-result p1

    .line 87
    if-eqz p1, :cond_1

    .line 88
    .line 89
    return p0

    .line 90
    :cond_1
    return v2
.end method

.method public static j(Ljava/lang/Object;Ljava/lang/Long;)Lp8/g;
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
    const-string v1, "com.tencent.mm.plugin.sns.storage.SnsInfo"

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
    if-nez v0, :cond_0

    .line 17
    .line 18
    goto/16 :goto_5

    .line 19
    .line 20
    :cond_0
    const-string v0, "convertTo"

    .line 21
    .line 22
    const/4 v2, 0x0

    .line 23
    new-array v3, v2, [Ljava/lang/Object;

    .line 24
    .line 25
    invoke-static {p0, v0, v3}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    instance-of v3, v0, Landroid/content/ContentValues;

    .line 30
    .line 31
    if-eqz v3, :cond_1

    .line 32
    .line 33
    check-cast v0, Landroid/content/ContentValues;

    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_1
    move-object v0, v1

    .line 37
    :goto_0
    if-eqz v0, :cond_9

    .line 38
    .line 39
    new-instance v3, Landroid/content/ContentValues;

    .line 40
    .line 41
    invoke-direct {v3, v0}, Landroid/content/ContentValues;-><init>(Landroid/content/ContentValues;)V

    .line 42
    .line 43
    .line 44
    if-eqz p1, :cond_2

    .line 45
    .line 46
    goto :goto_4

    .line 47
    :cond_2
    const-string p1, "getLocalid"

    .line 48
    .line 49
    new-array v0, v2, [Ljava/lang/Object;

    .line 50
    .line 51
    invoke-static {p0, p1, v0}, Lh/Hchat/utils/KavaReflector;->invokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    instance-of v0, p1, Ljava/lang/Number;

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    check-cast p1, Ljava/lang/Number;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    move-object p1, v1

    .line 63
    :goto_1
    if-eqz p1, :cond_4

    .line 64
    .line 65
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 66
    .line 67
    .line 68
    move-result-wide v4

    .line 69
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    goto :goto_2

    .line 74
    :cond_4
    move-object p1, v1

    .line 75
    :goto_2
    if-eqz p1, :cond_5

    .line 76
    .line 77
    goto :goto_4

    .line 78
    :cond_5
    const-string p1, "localid"

    .line 79
    .line 80
    invoke-static {p0, p1}, Lh/Hchat/utils/KavaReflector;->readField(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    instance-of v0, p1, Ljava/lang/Number;

    .line 85
    .line 86
    if-eqz v0, :cond_6

    .line 87
    .line 88
    check-cast p1, Ljava/lang/Number;

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_6
    move-object p1, v1

    .line 92
    :goto_3
    if-eqz p1, :cond_7

    .line 93
    .line 94
    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    .line 95
    .line 96
    .line 97
    move-result-wide v0

    .line 98
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 99
    .line 100
    .line 101
    move-result-object p1

    .line 102
    goto :goto_4

    .line 103
    :cond_7
    move-object p1, v1

    .line 104
    :goto_4
    if-eqz p1, :cond_8

    .line 105
    .line 106
    const-string v0, "hchatLocalId"

    .line 107
    .line 108
    invoke-virtual {v3, v0, p1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    .line 109
    .line 110
    .line 111
    :cond_8
    new-instance p1, Lp8/g;

    .line 112
    .line 113
    invoke-direct {p1, p0, v3}, Lp8/g;-><init>(Ljava/lang/Object;Landroid/content/ContentValues;)V

    .line 114
    .line 115
    .line 116
    return-object p1

    .line 117
    :cond_9
    :goto_5
    return-object v1
.end method


# virtual methods
.method public final f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    iget-object v0, p0, Lp8/h;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lp8/h;->b:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-static {v0, v1}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v2, p0, Lp8/h;->e:Landroid/content/SharedPreferences;

    .line 10
    .line 11
    invoke-static {v2, v0, v1, p3}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p2, v1}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v4

    .line 22
    check-cast v4, Ljava/lang/Boolean;

    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    if-eqz v4, :cond_0

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    move-object v1, v3

    .line 32
    :goto_0
    if-eqz v1, :cond_1

    .line 33
    .line 34
    return-object v1

    .line 35
    :cond_1
    new-instance v1, Lgg/u;

    .line 36
    .line 37
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 38
    .line 39
    .line 40
    new-instance v4, Lac/l;

    .line 41
    .line 42
    const/16 v5, 0x18

    .line 43
    .line 44
    invoke-direct {v4, v1, p0, p1, v5}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 45
    .line 46
    .line 47
    invoke-static {v4}, Lr8/e;->c(Ljava/lang/Runnable;)V

    .line 48
    .line 49
    .line 50
    iget-object p1, v1, Lgg/u;->g:Ljava/lang/Object;

    .line 51
    .line 52
    if-eqz p1, :cond_6

    .line 53
    .line 54
    check-cast p1, Ljava/util/List;

    .line 55
    .line 56
    new-instance v1, Ljava/util/ArrayList;

    .line 57
    .line 58
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 59
    .line 60
    .line 61
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    :cond_2
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 66
    .line 67
    .line 68
    move-result v4

    .line 69
    if-eqz v4, :cond_3

    .line 70
    .line 71
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-interface {p2, v4}, Lfg/l;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    check-cast v5, Ljava/lang/Boolean;

    .line 80
    .line 81
    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    .line 82
    .line 83
    .line 84
    move-result v5

    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 88
    .line 89
    .line 90
    goto :goto_1

    .line 91
    :cond_3
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 92
    .line 93
    .line 94
    move-result p1

    .line 95
    const/4 p2, 0x1

    .line 96
    if-eq p1, p2, :cond_5

    .line 97
    .line 98
    const-string p1, "cache.key"

    .line 99
    .line 100
    :try_start_0
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 101
    .line 102
    .line 103
    move-result-object p2

    .line 104
    const-string v4, ""

    .line 105
    .line 106
    invoke-interface {v2, p1, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v2

    .line 110
    invoke-static {v2, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-nez v2, :cond_4

    .line 115
    .line 116
    invoke-interface {p2}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 117
    .line 118
    .line 119
    move-result-object v2

    .line 120
    invoke-interface {v2, p1, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 121
    .line 122
    .line 123
    :cond_4
    invoke-interface {p2, p3}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    invoke-interface {p1}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 128
    .line 129
    .line 130
    :catchall_0
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 131
    .line 132
    .line 133
    move-result p1

    .line 134
    new-instance p2, Ljava/lang/StringBuilder;

    .line 135
    .line 136
    const-string v0, "\u670b\u53cb\u5708\u7f13\u5b58\u67e5\u8be2\u5165\u53e3\u6570\u91cf\u5f02\u5e38: cache="

    .line 137
    .line 138
    invoke-direct {p2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    const-string p3, " count="

    .line 145
    .line 146
    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    iget-object p2, p0, Lp8/h;->d:Lp8/p;

    .line 157
    .line 158
    invoke-virtual {p2, p1}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    return-object v3

    .line 162
    :cond_5
    invoke-static {v1}, Ltf/m;->H1(Ljava/util/List;)Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object p1

    .line 166
    check-cast p1, Ljava/lang/reflect/Method;

    .line 167
    .line 168
    invoke-static {v2, v0, p3, p1}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 169
    .line 170
    .line 171
    return-object p1

    .line 172
    :cond_6
    const-string p1, "methods"

    .line 173
    .line 174
    invoke-static {p1}, Lgg/l;->g(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v3
.end method

.method public final g(Ljava/lang/String;)Lp8/f;
    .locals 6

    .line 1
    invoke-static {p1, p1}, Lp/a;->l(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x2

    .line 6
    new-array v0, v0, [C

    .line 7
    .line 8
    fill-array-data v0, :array_0

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Log/m;->S0(Ljava/lang/String;[C)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    const/4 v1, 0x0

    .line 20
    if-lez v0, :cond_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object p1, v1

    .line 24
    :goto_0
    if-eqz p1, :cond_3

    .line 25
    .line 26
    invoke-static {p1}, Log/t;->g0(Ljava/lang/String;)Ljava/lang/Long;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    .line 33
    .line 34
    .line 35
    move-result-wide v2

    .line 36
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    goto :goto_2

    .line 41
    :cond_1
    :try_start_0
    invoke-static {p1}, Ljava/lang/Long;->parseUnsignedLong(Ljava/lang/String;)J

    .line 42
    .line 43
    .line 44
    move-result-wide v2

    .line 45
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception p1

    .line 51
    new-instance v0, Lsf/f;

    .line 52
    .line 53
    invoke-direct {v0, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 54
    .line 55
    .line 56
    move-object p1, v0

    .line 57
    :goto_1
    nop

    .line 58
    instance-of v0, p1, Lsf/f;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    move-object p1, v1

    .line 63
    :cond_2
    check-cast p1, Ljava/lang/Long;

    .line 64
    .line 65
    goto :goto_2

    .line 66
    :cond_3
    move-object p1, v1

    .line 67
    :goto_2
    const/4 v0, 0x0

    .line 68
    if-eqz p1, :cond_a

    .line 69
    .line 70
    invoke-virtual {p0}, Lp8/h;->k()Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object v2

    .line 74
    if-eqz v2, :cond_9

    .line 75
    .line 76
    iget-object v3, p0, Lp8/h;->g:Ljava/lang/reflect/Method;

    .line 77
    .line 78
    if-eqz v3, :cond_5

    .line 79
    .line 80
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 81
    .line 82
    .line 83
    move-result-object v4

    .line 84
    invoke-static {v4, v3}, Lp8/h;->a(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 85
    .line 86
    .line 87
    move-result v4

    .line 88
    if-eqz v4, :cond_4

    .line 89
    .line 90
    goto :goto_3

    .line 91
    :cond_4
    move-object v3, v1

    .line 92
    :goto_3
    if-eqz v3, :cond_5

    .line 93
    .line 94
    goto :goto_4

    .line 95
    :cond_5
    sget-object v3, Lp8/h;->l:Ljava/util/List;

    .line 96
    .line 97
    new-instance v4, Lc9/k1;

    .line 98
    .line 99
    const/16 v5, 0x11

    .line 100
    .line 101
    invoke-direct {v4, p0, v2, v5}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 102
    .line 103
    .line 104
    const-string v5, "sns_info_get_by_id_v1"

    .line 105
    .line 106
    invoke-virtual {p0, v3, v4, v5}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 107
    .line 108
    .line 109
    move-result-object v3

    .line 110
    if-eqz v3, :cond_8

    .line 111
    .line 112
    iput-object v3, p0, Lp8/h;->g:Ljava/lang/reflect/Method;

    .line 113
    .line 114
    :goto_4
    :try_start_1
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-static {v3, v2, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 119
    .line 120
    .line 121
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 122
    goto :goto_5

    .line 123
    :catchall_1
    move-exception p1

    .line 124
    new-instance v2, Lsf/f;

    .line 125
    .line 126
    invoke-direct {v2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 127
    .line 128
    .line 129
    move-object p1, v2

    .line 130
    :goto_5
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    if-eqz v2, :cond_6

    .line 135
    .line 136
    iget-object v3, p0, Lp8/h;->d:Lp8/p;

    .line 137
    .line 138
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 139
    .line 140
    .line 141
    move-result-object v2

    .line 142
    new-instance v4, Ljava/lang/StringBuilder;

    .line 143
    .line 144
    const-string v5, "\u6309 ID \u8bfb\u53d6\u670b\u53cb\u5708\u7f13\u5b58\u5931\u8d25: "

    .line 145
    .line 146
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v2

    .line 156
    invoke-virtual {v3, v2}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    :cond_6
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    if-nez v2, :cond_7

    .line 164
    .line 165
    new-instance v0, Lp8/f;

    .line 166
    .line 167
    const/4 v1, 0x1

    .line 168
    invoke-direct {v0, p1, v1}, Lp8/f;-><init>(Ljava/lang/Object;Z)V

    .line 169
    .line 170
    .line 171
    goto :goto_6

    .line 172
    :cond_7
    new-instance p1, Lp8/f;

    .line 173
    .line 174
    invoke-direct {p1, v1, v0}, Lp8/f;-><init>(Ljava/lang/Object;Z)V

    .line 175
    .line 176
    .line 177
    move-object v0, p1

    .line 178
    :goto_6
    return-object v0

    .line 179
    :cond_8
    new-instance p1, Lp8/f;

    .line 180
    .line 181
    invoke-direct {p1, v1, v0}, Lp8/f;-><init>(Ljava/lang/Object;Z)V

    .line 182
    .line 183
    .line 184
    return-object p1

    .line 185
    :cond_9
    new-instance p1, Lp8/f;

    .line 186
    .line 187
    invoke-direct {p1, v1, v0}, Lp8/f;-><init>(Ljava/lang/Object;Z)V

    .line 188
    .line 189
    .line 190
    return-object p1

    .line 191
    :cond_a
    new-instance p1, Lp8/f;

    .line 192
    .line 193
    invoke-direct {p1, v1, v0}, Lp8/f;-><init>(Ljava/lang/Object;Z)V

    .line 194
    .line 195
    .line 196
    return-object p1

    .line 197
    :array_0
    .array-data 2
        0x27s
        0x22s
    .end array-data
.end method

.method public final h(Ljava/lang/String;IZ)Ljava/util/List;
    .locals 11

    .line 1
    const-string v0, ""

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 5
    .line 6
    .line 7
    move-result-object v7

    .line 8
    sget-object v1, Ltf/t;->g:Ltf/t;

    .line 9
    .line 10
    if-gtz p2, :cond_0

    .line 11
    .line 12
    goto/16 :goto_c

    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lp8/h;->k()Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object v9

    .line 18
    if-eqz v9, :cond_f

    .line 19
    .line 20
    const/16 v2, 0xc8

    .line 21
    .line 22
    const/4 v10, 0x0

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-static {p1}, Log/m;->t0(Ljava/lang/CharSequence;)Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_2

    .line 30
    .line 31
    :cond_1
    move v3, v2

    .line 32
    goto/16 :goto_6

    .line 33
    .line 34
    :cond_2
    iget-object v0, p0, Lp8/h;->h:Ljava/lang/reflect/Method;

    .line 35
    .line 36
    if-eqz v0, :cond_4

    .line 37
    .line 38
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object v3

    .line 42
    invoke-static {v3, v0}, Lp8/h;->b(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_3

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_3
    move-object v0, v10

    .line 50
    :goto_0
    if-eqz v0, :cond_4

    .line 51
    .line 52
    :goto_1
    move v3, v2

    .line 53
    goto :goto_2

    .line 54
    :cond_4
    sget-object v0, Lp8/h;->m:Ljava/util/List;

    .line 55
    .line 56
    new-instance v3, Lc9/k1;

    .line 57
    .line 58
    const/16 v4, 0xe

    .line 59
    .line 60
    invoke-direct {v3, p0, v9, v4}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    const-string v4, "sns_info_get_by_user_v1"

    .line 64
    .line 65
    invoke-virtual {p0, v0, v3, v4}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 66
    .line 67
    .line 68
    move-result-object v0

    .line 69
    if-eqz v0, :cond_f

    .line 70
    .line 71
    iput-object v0, p0, Lp8/h;->h:Ljava/lang/reflect/Method;

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :goto_2
    :try_start_0
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 75
    .line 76
    invoke-static {p1}, Log/m;->R0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    if-le p2, v3, :cond_5

    .line 85
    .line 86
    move p2, v3

    .line 87
    :cond_5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-static {p3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 92
    .line 93
    .line 94
    move-result-object v5

    .line 95
    const-string v6, ""

    .line 96
    .line 97
    move-object v8, v7

    .line 98
    move-object v3, p1

    .line 99
    filled-new-array/range {v2 .. v8}, [Ljava/lang/Object;

    .line 100
    .line 101
    .line 102
    move-result-object p1

    .line 103
    invoke-static {v0, v9, p1}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object p1

    .line 107
    instance-of p2, p1, Landroid/database/Cursor;

    .line 108
    .line 109
    if-eqz p2, :cond_6

    .line 110
    .line 111
    check-cast p1, Landroid/database/Cursor;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 112
    .line 113
    goto :goto_4

    .line 114
    :catchall_0
    move-exception v0

    .line 115
    move-object p1, v0

    .line 116
    goto :goto_3

    .line 117
    :cond_6
    move-object p1, v10

    .line 118
    goto :goto_4

    .line 119
    :goto_3
    new-instance p2, Lsf/f;

    .line 120
    .line 121
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 122
    .line 123
    .line 124
    move-object p1, p2

    .line 125
    :goto_4
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 126
    .line 127
    .line 128
    move-result-object p2

    .line 129
    if-eqz p2, :cond_7

    .line 130
    .line 131
    iget-object p3, p0, Lp8/h;->d:Lp8/p;

    .line 132
    .line 133
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object p2

    .line 137
    new-instance v0, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    const-string v2, "\u8bfb\u53d6\u670b\u53cb\u5708\u7f13\u5b58\u5217\u8868\u5931\u8d25: "

    .line 140
    .line 141
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 145
    .line 146
    .line 147
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 148
    .line 149
    .line 150
    move-result-object p2

    .line 151
    invoke-virtual {p3, p2}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 152
    .line 153
    .line 154
    :cond_7
    instance-of p2, p1, Lsf/f;

    .line 155
    .line 156
    if-eqz p2, :cond_8

    .line 157
    .line 158
    goto :goto_5

    .line 159
    :cond_8
    move-object v10, p1

    .line 160
    :goto_5
    check-cast v10, Landroid/database/Cursor;

    .line 161
    .line 162
    if-eqz v10, :cond_f

    .line 163
    .line 164
    :try_start_1
    invoke-virtual {p0, v10}, Lp8/h;->i(Landroid/database/Cursor;)Ljava/util/List;

    .line 165
    .line 166
    .line 167
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 168
    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    .line 169
    .line 170
    .line 171
    return-object p1

    .line 172
    :catchall_1
    move-exception v0

    .line 173
    move-object p1, v0

    .line 174
    :try_start_2
    throw p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 175
    :catchall_2
    move-exception v0

    .line 176
    move-object p2, v0

    .line 177
    invoke-static {v10, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 178
    .line 179
    .line 180
    throw p2

    .line 181
    :goto_6
    iget-object p1, p0, Lp8/h;->i:Ljava/lang/reflect/Method;

    .line 182
    .line 183
    if-eqz p1, :cond_a

    .line 184
    .line 185
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    move-result-object p3

    .line 189
    invoke-static {p3, p1}, Lp8/h;->c(Ljava/lang/Class;Ljava/lang/reflect/Method;)Z

    .line 190
    .line 191
    .line 192
    move-result p3

    .line 193
    if-eqz p3, :cond_9

    .line 194
    .line 195
    goto :goto_7

    .line 196
    :cond_9
    move-object p1, v10

    .line 197
    :goto_7
    if-eqz p1, :cond_a

    .line 198
    .line 199
    goto :goto_8

    .line 200
    :cond_a
    sget-object p1, Lp8/h;->n:Ljava/util/List;

    .line 201
    .line 202
    new-instance p3, Lc9/k1;

    .line 203
    .line 204
    const/16 v2, 0x12

    .line 205
    .line 206
    invoke-direct {p3, p0, v9, v2}, Lc9/k1;-><init>(Lp8/h;Ljava/lang/Object;I)V

    .line 207
    .line 208
    .line 209
    const-string v2, "sns_info_get_timeline_v1"

    .line 210
    .line 211
    invoke-virtual {p0, p1, p3, v2}, Lp8/h;->f(Ljava/util/List;Lfg/l;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 212
    .line 213
    .line 214
    move-result-object p1

    .line 215
    if-eqz p1, :cond_f

    .line 216
    .line 217
    iput-object p1, p0, Lp8/h;->i:Ljava/lang/reflect/Method;

    .line 218
    .line 219
    :goto_8
    if-le p2, v3, :cond_b

    .line 220
    .line 221
    move p2, v3

    .line 222
    :cond_b
    :try_start_3
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 223
    .line 224
    .line 225
    move-result-object p2

    .line 226
    filled-new-array {v0, v7, p2}, [Ljava/lang/Object;

    .line 227
    .line 228
    .line 229
    move-result-object p2

    .line 230
    invoke-static {p1, v9, p2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    instance-of p2, p1, Landroid/database/Cursor;

    .line 235
    .line 236
    if-eqz p2, :cond_c

    .line 237
    .line 238
    check-cast p1, Landroid/database/Cursor;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 239
    .line 240
    goto :goto_a

    .line 241
    :catchall_3
    move-exception v0

    .line 242
    move-object p1, v0

    .line 243
    goto :goto_9

    .line 244
    :cond_c
    move-object p1, v10

    .line 245
    goto :goto_a

    .line 246
    :goto_9
    new-instance p2, Lsf/f;

    .line 247
    .line 248
    invoke-direct {p2, p1}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 249
    .line 250
    .line 251
    move-object p1, p2

    .line 252
    :goto_a
    invoke-static {p1}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 253
    .line 254
    .line 255
    move-result-object p2

    .line 256
    if-eqz p2, :cond_d

    .line 257
    .line 258
    iget-object p3, p0, Lp8/h;->d:Lp8/p;

    .line 259
    .line 260
    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 261
    .line 262
    .line 263
    move-result-object p2

    .line 264
    new-instance v0, Ljava/lang/StringBuilder;

    .line 265
    .line 266
    const-string v2, "\u8bfb\u53d6\u670b\u53cb\u5708\u65f6\u95f4\u7ebf\u7f13\u5b58\u5931\u8d25: "

    .line 267
    .line 268
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 269
    .line 270
    .line 271
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 272
    .line 273
    .line 274
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object p2

    .line 278
    invoke-virtual {p3, p2}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    .line 280
    .line 281
    :cond_d
    instance-of p2, p1, Lsf/f;

    .line 282
    .line 283
    if-eqz p2, :cond_e

    .line 284
    .line 285
    goto :goto_b

    .line 286
    :cond_e
    move-object v10, p1

    .line 287
    :goto_b
    check-cast v10, Landroid/database/Cursor;

    .line 288
    .line 289
    if-eqz v10, :cond_f

    .line 290
    .line 291
    :try_start_4
    invoke-virtual {p0, v10}, Lp8/h;->i(Landroid/database/Cursor;)Ljava/util/List;

    .line 292
    .line 293
    .line 294
    move-result-object v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 295
    invoke-interface {v10}, Ljava/io/Closeable;->close()V

    .line 296
    .line 297
    .line 298
    goto :goto_c

    .line 299
    :catchall_4
    move-exception v0

    .line 300
    move-object p1, v0

    .line 301
    :try_start_5
    throw p1
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_5

    .line 302
    :catchall_5
    move-exception v0

    .line 303
    move-object p2, v0

    .line 304
    invoke-static {v10, p1}, Lig/a;->i(Ljava/io/Closeable;Ljava/lang/Throwable;)V

    .line 305
    .line 306
    .line 307
    throw p2

    .line 308
    :cond_f
    :goto_c
    return-object v1
.end method

.method public final i(Landroid/database/Cursor;)Ljava/util/List;
    .locals 9

    .line 1
    const-string v0, "com.tencent.mm.plugin.sns.storage.SnsInfo"

    .line 2
    .line 3
    iget-object v1, p0, Lp8/h;->b:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_7

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    new-array v2, v1, [Ljava/lang/Class;

    .line 13
    .line 14
    invoke-static {v0, v2}, Lh/Hchat/utils/KavaReflector;->findConstructor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    if-eqz v2, :cond_7

    .line 19
    .line 20
    const-class v3, Landroid/database/Cursor;

    .line 21
    .line 22
    filled-new-array {v3}, [Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    const-string v4, "convertFrom"

    .line 27
    .line 28
    invoke-static {v0, v4, v3}, Lh/Hchat/utils/KavaReflector;->findMethodRecursive(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    if-eqz v0, :cond_7

    .line 33
    .line 34
    const-string v3, "rowid"

    .line 35
    .line 36
    invoke-interface {p1, v3}, Landroid/database/Cursor;->getColumnIndex(Ljava/lang/String;)I

    .line 37
    .line 38
    .line 39
    move-result v3

    .line 40
    new-instance v4, Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-interface {p1}, Landroid/database/Cursor;->getCount()I

    .line 43
    .line 44
    .line 45
    move-result v5

    .line 46
    if-gez v5, :cond_0

    .line 47
    .line 48
    move v5, v1

    .line 49
    :cond_0
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 50
    .line 51
    .line 52
    :cond_1
    :goto_0
    invoke-interface {p1}, Landroid/database/Cursor;->moveToNext()Z

    .line 53
    .line 54
    .line 55
    move-result v5

    .line 56
    if-eqz v5, :cond_6

    .line 57
    .line 58
    new-array v5, v1, [Ljava/lang/Object;

    .line 59
    .line 60
    invoke-static {v2, v5}, Lh/Hchat/utils/KavaReflector;->newInstance(Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    if-eqz v5, :cond_1

    .line 65
    .line 66
    const/4 v6, 0x0

    .line 67
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v7

    .line 71
    invoke-static {v0, v5, v7}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 75
    .line 76
    .line 77
    move-result-object v7

    .line 78
    if-ltz v3, :cond_2

    .line 79
    .line 80
    const/4 v8, 0x1

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    move v8, v1

    .line 83
    :goto_1
    if-eqz v8, :cond_3

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_3
    move-object v7, v6

    .line 87
    :goto_2
    if-eqz v7, :cond_4

    .line 88
    .line 89
    invoke-virtual {v7}, Ljava/lang/Number;->intValue()I

    .line 90
    .line 91
    .line 92
    move-result v7

    .line 93
    invoke-interface {p1, v7}, Landroid/database/Cursor;->getLong(I)J

    .line 94
    .line 95
    .line 96
    move-result-wide v7

    .line 97
    invoke-static {v7, v8}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 98
    .line 99
    .line 100
    move-result-object v7

    .line 101
    goto :goto_3

    .line 102
    :catchall_0
    move-exception v5

    .line 103
    goto :goto_4

    .line 104
    :cond_4
    move-object v7, v6

    .line 105
    :goto_3
    invoke-static {v5, v7}, Lp8/h;->j(Ljava/lang/Object;Ljava/lang/Long;)Lp8/g;

    .line 106
    .line 107
    .line 108
    move-result-object v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 109
    goto :goto_5

    .line 110
    :goto_4
    new-instance v7, Lsf/f;

    .line 111
    .line 112
    invoke-direct {v7, v5}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    move-object v5, v7

    .line 116
    :goto_5
    nop

    .line 117
    instance-of v7, v5, Lsf/f;

    .line 118
    .line 119
    if-eqz v7, :cond_5

    .line 120
    .line 121
    goto :goto_6

    .line 122
    :cond_5
    move-object v6, v5

    .line 123
    :goto_6
    check-cast v6, Lp8/g;

    .line 124
    .line 125
    if-eqz v6, :cond_1

    .line 126
    .line 127
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    goto :goto_0

    .line 131
    :cond_6
    return-object v4

    .line 132
    :cond_7
    sget-object p1, Ltf/t;->g:Ltf/t;

    .line 133
    .line 134
    return-object p1
.end method

.method public final k()Ljava/lang/Object;
    .locals 8

    .line 1
    iget-object v0, p0, Lp8/h;->f:Ljava/lang/reflect/Method;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    invoke-static {v0}, Lp8/h;->d(Ljava/lang/reflect/Method;)Z

    .line 7
    .line 8
    .line 9
    move-result v2

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v1

    .line 14
    :goto_0
    if-eqz v0, :cond_1

    .line 15
    .line 16
    goto/16 :goto_5

    .line 17
    .line 18
    :cond_1
    iget-object v0, p0, Lp8/h;->a:Landroid/content/Context;

    .line 19
    .line 20
    iget-object v2, p0, Lp8/h;->b:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    invoke-static {v0, v2}, Le8/b;->g(Landroid/content/Context;Ljava/lang/ClassLoader;)Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    iget-object v3, p0, Lp8/h;->e:Landroid/content/SharedPreferences;

    .line 27
    .line 28
    const-string v4, "sns_info_storage_getter_v1"

    .line 29
    .line 30
    invoke-static {v3, v0, v2, v4}, Le8/b;->c(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    if-eqz v2, :cond_3

    .line 35
    .line 36
    invoke-static {v2}, Lp8/h;->d(Ljava/lang/reflect/Method;)Z

    .line 37
    .line 38
    .line 39
    move-result v5

    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_2
    move-object v2, v1

    .line 44
    :goto_1
    if-eqz v2, :cond_3

    .line 45
    .line 46
    :goto_2
    move-object v0, v2

    .line 47
    goto/16 :goto_4

    .line 48
    .line 49
    :cond_3
    sget-object v2, Lp8/h;->k:Ljava/util/List;

    .line 50
    .line 51
    new-instance v5, Lgg/u;

    .line 52
    .line 53
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 54
    .line 55
    .line 56
    new-instance v6, Lac/l;

    .line 57
    .line 58
    const/16 v7, 0x18

    .line 59
    .line 60
    invoke-direct {v6, v5, p0, v2, v7}, Lac/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 61
    .line 62
    .line 63
    invoke-static {v6}, Lr8/e;->c(Ljava/lang/Runnable;)V

    .line 64
    .line 65
    .line 66
    iget-object v2, v5, Lgg/u;->g:Ljava/lang/Object;

    .line 67
    .line 68
    if-eqz v2, :cond_b

    .line 69
    .line 70
    check-cast v2, Ljava/util/List;

    .line 71
    .line 72
    new-instance v5, Ljava/util/ArrayList;

    .line 73
    .line 74
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 75
    .line 76
    .line 77
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 78
    .line 79
    .line 80
    move-result-object v2

    .line 81
    :cond_4
    :goto_3
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_5

    .line 86
    .line 87
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object v6

    .line 91
    move-object v7, v6

    .line 92
    check-cast v7, Ljava/lang/reflect/Method;

    .line 93
    .line 94
    invoke-static {v7}, Lp8/h;->d(Ljava/lang/reflect/Method;)Z

    .line 95
    .line 96
    .line 97
    move-result v7

    .line 98
    if-eqz v7, :cond_4

    .line 99
    .line 100
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    goto :goto_3

    .line 104
    :cond_5
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 105
    .line 106
    .line 107
    move-result v2

    .line 108
    const/4 v6, 0x1

    .line 109
    if-eq v2, v6, :cond_7

    .line 110
    .line 111
    const-string v2, "cache.key"

    .line 112
    .line 113
    :try_start_0
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 114
    .line 115
    .line 116
    move-result-object v6

    .line 117
    const-string v7, ""

    .line 118
    .line 119
    invoke-interface {v3, v2, v7}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object v3

    .line 123
    invoke-static {v3, v0}, Lgg/l;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 124
    .line 125
    .line 126
    move-result v3

    .line 127
    if-nez v3, :cond_6

    .line 128
    .line 129
    invoke-interface {v6}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    invoke-interface {v3, v2, v0}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 134
    .line 135
    .line 136
    :cond_6
    invoke-interface {v6, v4}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 137
    .line 138
    .line 139
    move-result-object v0

    .line 140
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    .line 142
    .line 143
    :catchall_0
    iget-object v0, p0, Lp8/h;->d:Lp8/p;

    .line 144
    .line 145
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    .line 146
    .line 147
    .line 148
    move-result v2

    .line 149
    new-instance v3, Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v4, "\u670b\u53cb\u5708\u7f13\u5b58\u5b58\u50a8\u5165\u53e3\u6570\u91cf\u5f02\u5e38: "

    .line 152
    .line 153
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v2

    .line 163
    invoke-virtual {v0, v2}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    .line 165
    .line 166
    move-object v0, v1

    .line 167
    goto :goto_4

    .line 168
    :cond_7
    invoke-static {v5}, Ltf/m;->H1(Ljava/util/List;)Ljava/lang/Object;

    .line 169
    .line 170
    .line 171
    move-result-object v2

    .line 172
    check-cast v2, Ljava/lang/reflect/Method;

    .line 173
    .line 174
    invoke-static {v3, v0, v4, v2}, Le8/b;->h(Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 175
    .line 176
    .line 177
    goto/16 :goto_2

    .line 178
    .line 179
    :goto_4
    if-eqz v0, :cond_a

    .line 180
    .line 181
    iput-object v0, p0, Lp8/h;->f:Ljava/lang/reflect/Method;

    .line 182
    .line 183
    :goto_5
    const/4 v2, 0x0

    .line 184
    :try_start_1
    new-array v2, v2, [Ljava/lang/Object;

    .line 185
    .line 186
    invoke-static {v0, v1, v2}, Lh/Hchat/utils/KavaReflector;->invokeOrThrow(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    .line 188
    .line 189
    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 190
    goto :goto_6

    .line 191
    :catchall_1
    move-exception v0

    .line 192
    new-instance v2, Lsf/f;

    .line 193
    .line 194
    invoke-direct {v2, v0}, Lsf/f;-><init>(Ljava/lang/Throwable;)V

    .line 195
    .line 196
    .line 197
    move-object v0, v2

    .line 198
    :goto_6
    invoke-static {v0}, Lsf/g;->b(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 199
    .line 200
    .line 201
    move-result-object v2

    .line 202
    if-eqz v2, :cond_8

    .line 203
    .line 204
    iget-object v3, p0, Lp8/h;->d:Lp8/p;

    .line 205
    .line 206
    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v2

    .line 210
    new-instance v4, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    const-string v5, "\u83b7\u53d6\u670b\u53cb\u5708\u7f13\u5b58\u5b58\u50a8\u5931\u8d25: "

    .line 213
    .line 214
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 215
    .line 216
    .line 217
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 218
    .line 219
    .line 220
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 221
    .line 222
    .line 223
    move-result-object v2

    .line 224
    invoke-virtual {v3, v2}, Lp8/p;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    :cond_8
    instance-of v2, v0, Lsf/f;

    .line 228
    .line 229
    if-eqz v2, :cond_9

    .line 230
    .line 231
    goto :goto_7

    .line 232
    :cond_9
    move-object v1, v0

    .line 233
    :cond_a
    :goto_7
    return-object v1

    .line 234
    :cond_b
    const-string v0, "methods"

    .line 235
    .line 236
    invoke-static {v0}, Lgg/l;->g(Ljava/lang/String;)V

    .line 237
    .line 238
    .line 239
    throw v1
.end method
