.class public final Le8/c;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field public final a:Lorg/luckypray/dexkit/DexKitBridge;

.field public final b:Ljava/lang/ClassLoader;

.field public final c:Landroid/content/SharedPreferences;

.field public final d:Ljava/lang/String;

.field public e:Ljava/lang/Class;

.field public f:Ljava/lang/Class;

.field public g:Ljava/lang/reflect/Method;

.field public h:Ljava/lang/reflect/Method;

.field public i:Ljava/lang/reflect/Method;

.field public j:Ljava/lang/reflect/Method;

.field public k:Ljava/lang/Class;

.field public l:Ljava/lang/Class;

.field public m:Ljava/lang/Class;

.field public n:Ljava/lang/Class;

.field public o:Ljava/lang/Class;

.field public p:Ljava/lang/Class;

.field public q:Ljava/lang/Class;

.field public r:Ljava/lang/Class;

.field public s:Ljava/lang/Class;

.field public t:Ljava/lang/Class;

.field public u:Ljava/lang/reflect/Method;

.field public v:Ljava/lang/reflect/Method;

.field public w:Ljava/lang/Class;

.field public x:Ljava/lang/reflect/Method;

.field public y:Ljava/lang/reflect/Method;

.field public z:Ljava/lang/Class;


# direct methods
.method public constructor <init>(Lorg/luckypray/dexkit/DexKitBridge;Ljava/lang/ClassLoader;Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Le8/c;->a:Lorg/luckypray/dexkit/DexKitBridge;

    .line 5
    .line 6
    iput-object p2, p0, Le8/c;->b:Ljava/lang/ClassLoader;

    .line 7
    .line 8
    const-string p1, "Hchat_settings_dex_cache"

    .line 9
    .line 10
    invoke-static {p3, p1}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    iput-object p1, p0, Le8/c;->c:Landroid/content/SharedPreferences;

    .line 15
    .line 16
    invoke-static {p3, p2}, Lo8/k;->a(Landroid/content/Context;Ljava/lang/ClassLoader;)Ll8/i;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    iget-object p1, p1, Ll8/i;->h:Ljava/lang/String;

    .line 21
    .line 22
    iput-object p1, p0, Le8/c;->d:Ljava/lang/String;

    .line 23
    .line 24
    return-void
.end method

.method public static a(Ljava/lang/Class;Ljava/lang/Class;)I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    if-eqz p0, :cond_2

    .line 3
    .line 4
    const-class v1, Ljava/lang/Object;

    .line 5
    .line 6
    if-eq p0, v1, :cond_2

    .line 7
    .line 8
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :cond_0
    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 17
    .line 18
    .line 19
    move-result v2

    .line 20
    if-eqz v2, :cond_1

    .line 21
    .line 22
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v2

    .line 26
    check-cast v2, Ljava/lang/reflect/Method;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 29
    .line 30
    .line 31
    move-result v3

    .line 32
    if-nez v3, :cond_0

    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    move-result-object v2

    .line 38
    if-ne v2, p1, :cond_0

    .line 39
    .line 40
    add-int/lit8 v0, v0, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    return v0
.end method

.method public static b(Ljava/lang/Class;)Ljava/lang/reflect/Method;
    .locals 4

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/reflect/Method;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    const-string v2, "onItemClick"

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-virtual {v0}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    sget-object v3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 42
    .line 43
    if-ne v2, v3, :cond_0

    .line 44
    .line 45
    array-length v2, v1

    .line 46
    const/4 v3, 0x4

    .line 47
    if-ne v2, v3, :cond_0

    .line 48
    .line 49
    const/4 v2, 0x0

    .line 50
    aget-object v2, v1, v2

    .line 51
    .line 52
    const-class v3, Landroid/widget/AdapterView;

    .line 53
    .line 54
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    if-eqz v2, :cond_0

    .line 59
    .line 60
    const/4 v2, 0x1

    .line 61
    aget-object v2, v1, v2

    .line 62
    .line 63
    const-class v3, Landroid/view/View;

    .line 64
    .line 65
    invoke-virtual {v3, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_0

    .line 70
    .line 71
    const/4 v2, 0x2

    .line 72
    aget-object v2, v1, v2

    .line 73
    .line 74
    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 75
    .line 76
    if-ne v2, v3, :cond_0

    .line 77
    .line 78
    const/4 v2, 0x3

    .line 79
    aget-object v1, v1, v2

    .line 80
    .line 81
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 82
    .line 83
    if-ne v1, v2, :cond_0

    .line 84
    .line 85
    return-object v0

    .line 86
    :cond_1
    const/4 p0, 0x0

    .line 87
    return-object p0
.end method

.method public static d(Ljava/lang/Class;Ljava/lang/Class;)Z
    .locals 2

    .line 1
    invoke-static {p0}, Lh/Hchat/utils/KavaReflector;->declaredFields(Ljava/lang/Class;)Ljava/util/List;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    check-cast v0, Ljava/lang/reflect/Field;

    .line 20
    .line 21
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->isStatic(Ljava/lang/reflect/Field;)Z

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-nez v1, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/reflect/Field;->getType()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    move-result-object v0

    .line 31
    invoke-virtual {p1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 32
    .line 33
    .line 34
    move-result v0

    .line 35
    if-eqz v0, :cond_0

    .line 36
    .line 37
    const/4 p0, 0x1

    .line 38
    return p0

    .line 39
    :cond_1
    const/4 p0, 0x0

    .line 40
    return p0
.end method

.method public static i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const-string p2, ""

    .line 9
    .line 10
    :goto_0
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    return-void
.end method

.method public static j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 4

    .line 1
    if-eqz p2, :cond_2

    .line 2
    .line 3
    new-instance v0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v1, "#"

    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    new-instance v1, Ljava/lang/StringBuilder;

    .line 32
    .line 33
    const-string v2, "("

    .line 34
    .line 35
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/lang/reflect/Method;->getParameterTypes()[Ljava/lang/Class;

    .line 39
    .line 40
    .line 41
    move-result-object p2

    .line 42
    const/4 v2, 0x0

    .line 43
    :goto_0
    array-length v3, p2

    .line 44
    if-ge v2, v3, :cond_1

    .line 45
    .line 46
    if-lez v2, :cond_0

    .line 47
    .line 48
    const/16 v3, 0x2c

    .line 49
    .line 50
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    :cond_0
    aget-object v3, p2, v2

    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v3

    .line 59
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    add-int/lit8 v2, v2, 0x1

    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/16 p2, 0x29

    .line 66
    .line 67
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object p2

    .line 74
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p2

    .line 81
    goto :goto_1

    .line 82
    :cond_2
    const-string p2, ""

    .line 83
    .line 84
    :goto_1
    invoke-interface {p0, p1, p2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 85
    .line 86
    .line 87
    return-void
.end method


# virtual methods
.method public final c(Ljava/lang/String;)Ljava/lang/Class;
    .locals 1

    .line 1
    :try_start_0
    iget-object v0, p0, Le8/c;->b:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    return-object p1

    .line 8
    :catchall_0
    const/4 p1, 0x0

    .line 9
    return-object p1
.end method

.method public final e()Z
    .locals 1

    .line 1
    iget-object v0, p0, Le8/c;->e:Ljava/lang/Class;

    .line 2
    .line 3
    if-nez v0, :cond_1

    .line 4
    .line 5
    iget-object v0, p0, Le8/c;->g:Ljava/lang/reflect/Method;

    .line 6
    .line 7
    if-nez v0, :cond_1

    .line 8
    .line 9
    iget-object v0, p0, Le8/c;->h:Ljava/lang/reflect/Method;

    .line 10
    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    iget-object v0, p0, Le8/c;->i:Ljava/lang/reflect/Method;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 18
    .line 19
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Le8/c;->k:Ljava/lang/Class;

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    iget-object v0, p0, Le8/c;->l:Ljava/lang/Class;

    .line 26
    .line 27
    if-nez v0, :cond_1

    .line 28
    .line 29
    iget-object v0, p0, Le8/c;->m:Ljava/lang/Class;

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    iget-object v0, p0, Le8/c;->n:Ljava/lang/Class;

    .line 34
    .line 35
    if-nez v0, :cond_1

    .line 36
    .line 37
    iget-object v0, p0, Le8/c;->o:Ljava/lang/Class;

    .line 38
    .line 39
    if-nez v0, :cond_1

    .line 40
    .line 41
    iget-object v0, p0, Le8/c;->p:Ljava/lang/Class;

    .line 42
    .line 43
    if-nez v0, :cond_1

    .line 44
    .line 45
    iget-object v0, p0, Le8/c;->q:Ljava/lang/Class;

    .line 46
    .line 47
    if-nez v0, :cond_1

    .line 48
    .line 49
    iget-object v0, p0, Le8/c;->r:Ljava/lang/Class;

    .line 50
    .line 51
    if-nez v0, :cond_1

    .line 52
    .line 53
    iget-object v0, p0, Le8/c;->s:Ljava/lang/Class;

    .line 54
    .line 55
    if-nez v0, :cond_1

    .line 56
    .line 57
    iget-object v0, p0, Le8/c;->t:Ljava/lang/Class;

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    iget-object v0, p0, Le8/c;->w:Ljava/lang/Class;

    .line 62
    .line 63
    if-nez v0, :cond_1

    .line 64
    .line 65
    iget-object v0, p0, Le8/c;->x:Ljava/lang/reflect/Method;

    .line 66
    .line 67
    if-nez v0, :cond_1

    .line 68
    .line 69
    iget-object v0, p0, Le8/c;->y:Ljava/lang/reflect/Method;

    .line 70
    .line 71
    if-nez v0, :cond_1

    .line 72
    .line 73
    iget-object v0, p0, Le8/c;->z:Ljava/lang/Class;

    .line 74
    .line 75
    if-eqz v0, :cond_0

    .line 76
    .line 77
    goto :goto_0

    .line 78
    :cond_0
    const/4 v0, 0x0

    .line 79
    return v0

    .line 80
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 81
    return v0
.end method

.method public final f(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Le8/c;->c:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    if-eqz v1, :cond_2

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->isEmpty()Z

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    iget-object p1, p0, Le8/c;->b:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    invoke-static {v1, p1}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 23
    .line 24
    .line 25
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 26
    return-object p1

    .line 27
    :catchall_0
    :cond_2
    :goto_0
    const/4 p1, 0x0

    .line 28
    return-object p1
.end method

.method public final g(Ljava/lang/String;)Ljava/lang/reflect/Method;
    .locals 6

    .line 1
    :try_start_0
    iget-object v0, p0, Le8/c;->c:Landroid/content/SharedPreferences;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 2
    .line 3
    const-string v1, ""

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    :try_start_1
    invoke-interface {v0, p1, v1}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    :cond_0
    if-eqz v1, :cond_3

    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 14
    .line 15
    .line 16
    move-result p1

    .line 17
    if-nez p1, :cond_1

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/16 p1, 0x23

    .line 21
    .line 22
    invoke-virtual {v1, p1}, Ljava/lang/String;->indexOf(I)I

    .line 23
    .line 24
    .line 25
    move-result p1

    .line 26
    add-int/lit8 v0, p1, 0x1

    .line 27
    .line 28
    const/16 v2, 0x28

    .line 29
    .line 30
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->indexOf(II)I

    .line 31
    .line 32
    .line 33
    move-result v2

    .line 34
    add-int/lit8 v3, v2, 0x1

    .line 35
    .line 36
    const/16 v4, 0x29

    .line 37
    .line 38
    invoke-virtual {v1, v4, v3}, Ljava/lang/String;->indexOf(II)I

    .line 39
    .line 40
    .line 41
    move-result v4

    .line 42
    if-lez p1, :cond_3

    .line 43
    .line 44
    if-le v2, p1, :cond_3

    .line 45
    .line 46
    if-ge v4, v2, :cond_2

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_2
    const/4 v5, 0x0

    .line 50
    invoke-virtual {v1, v5, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    iget-object v5, p0, Le8/c;->b:Ljava/lang/ClassLoader;

    .line 55
    .line 56
    invoke-static {p1, v5}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    invoke-virtual {v1, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    invoke-virtual {v1, v3, v4}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v1

    .line 68
    invoke-virtual {p0, v1}, Le8/c;->h(Ljava/lang/String;)[Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-static {p1, v0, v1}, Lh/Hchat/utils/KavaReflector;->findDeclaredMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 73
    .line 74
    .line 75
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    return-object p1

    .line 77
    :catchall_0
    :cond_3
    :goto_0
    const/4 p1, 0x0

    .line 78
    return-object p1
.end method

.method public final h(Ljava/lang/String;)[Ljava/lang/Class;
    .locals 4

    .line 1
    invoke-virtual {p1}, Ljava/lang/String;->length()I

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
    new-array p1, v1, [Ljava/lang/Class;

    .line 9
    .line 10
    return-object p1

    .line 11
    :cond_0
    const-string v0, ","

    .line 12
    .line 13
    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    array-length v0, p1

    .line 18
    new-array v0, v0, [Ljava/lang/Class;

    .line 19
    .line 20
    :goto_0
    array-length v2, p1

    .line 21
    if-ge v1, v2, :cond_a

    .line 22
    .line 23
    aget-object v2, p1, v1

    .line 24
    .line 25
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    const-string v3, "boolean"

    .line 30
    .line 31
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_1

    .line 36
    .line 37
    sget-object v2, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 38
    .line 39
    goto :goto_1

    .line 40
    :cond_1
    const-string v3, "byte"

    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_2

    .line 47
    .line 48
    sget-object v2, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const-string v3, "char"

    .line 52
    .line 53
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 54
    .line 55
    .line 56
    move-result v3

    .line 57
    if-eqz v3, :cond_3

    .line 58
    .line 59
    sget-object v2, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_3
    const-string v3, "short"

    .line 63
    .line 64
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v3

    .line 68
    if-eqz v3, :cond_4

    .line 69
    .line 70
    sget-object v2, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_4
    const-string v3, "int"

    .line 74
    .line 75
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v3

    .line 79
    if-eqz v3, :cond_5

    .line 80
    .line 81
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_5
    const-string v3, "long"

    .line 85
    .line 86
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result v3

    .line 90
    if-eqz v3, :cond_6

    .line 91
    .line 92
    sget-object v2, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    goto :goto_1

    .line 95
    :cond_6
    const-string v3, "float"

    .line 96
    .line 97
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    if-eqz v3, :cond_7

    .line 102
    .line 103
    sget-object v2, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 104
    .line 105
    goto :goto_1

    .line 106
    :cond_7
    const-string v3, "double"

    .line 107
    .line 108
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 109
    .line 110
    .line 111
    move-result v3

    .line 112
    if-eqz v3, :cond_8

    .line 113
    .line 114
    sget-object v2, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_8
    const-string v3, "void"

    .line 118
    .line 119
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    move-result v3

    .line 123
    if-eqz v3, :cond_9

    .line 124
    .line 125
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_9
    iget-object v3, p0, Le8/c;->b:Ljava/lang/ClassLoader;

    .line 129
    .line 130
    invoke-static {v2, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    :goto_1
    aput-object v2, v0, v1

    .line 135
    .line 136
    add-int/lit8 v1, v1, 0x1

    .line 137
    .line 138
    goto :goto_0

    .line 139
    :cond_a
    return-object v0
.end method

.method public final k(Z)V
    .locals 5

    .line 1
    const-string v0, "cache.key"

    .line 2
    .line 3
    iget-object v1, p0, Le8/c;->d:Ljava/lang/String;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    iget-object v3, p0, Le8/c;->c:Landroid/content/SharedPreferences;

    .line 7
    .line 8
    if-eqz v3, :cond_1

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 13
    .line 14
    .line 15
    move-result v4

    .line 16
    if-nez v4, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    :try_start_0
    const-string v4, "cache.complete"

    .line 20
    .line 21
    invoke-interface {v3, v4, v2}, Landroid/content/SharedPreferences;->getBoolean(Ljava/lang/String;Z)Z

    .line 22
    .line 23
    .line 24
    move-result v4

    .line 25
    if-nez v4, :cond_2

    .line 26
    .line 27
    :catchall_0
    :cond_1
    :goto_0
    move v0, v2

    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_2
    const-string v4, ""

    .line 31
    .line 32
    invoke-interface {v3, v0, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 40
    if-nez v4, :cond_3

    .line 41
    .line 42
    :try_start_1
    invoke-interface {v3}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-interface {v3}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 47
    .line 48
    .line 49
    move-result-object v3

    .line 50
    invoke-interface {v3, v0, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_3
    :try_start_2
    const-string v0, "preferenceClass"

    .line 59
    .line 60
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    iput-object v0, p0, Le8/c;->e:Ljava/lang/Class;

    .line 65
    .line 66
    const-string v0, "iconPreferenceClass"

    .line 67
    .line 68
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    move-result-object v0

    .line 72
    iput-object v0, p0, Le8/c;->f:Ljava/lang/Class;

    .line 73
    .line 74
    const-string v0, "methodSetKey"

    .line 75
    .line 76
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    iput-object v0, p0, Le8/c;->g:Ljava/lang/reflect/Method;

    .line 81
    .line 82
    const-string v0, "methodSetTitle"

    .line 83
    .line 84
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    iput-object v0, p0, Le8/c;->h:Ljava/lang/reflect/Method;

    .line 89
    .line 90
    const-string v0, "methodGetKey"

    .line 91
    .line 92
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    iput-object v0, p0, Le8/c;->i:Ljava/lang/reflect/Method;

    .line 97
    .line 98
    const-string v0, "methodAddPref"

    .line 99
    .line 100
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iput-object v0, p0, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 105
    .line 106
    const-string v0, "settingItemClassesProviderClass"

    .line 107
    .line 108
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 109
    .line 110
    .line 111
    move-result-object v0

    .line 112
    iput-object v0, p0, Le8/c;->k:Ljava/lang/Class;

    .line 113
    .line 114
    const-string v0, "baseSettingItemClass"

    .line 115
    .line 116
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    iput-object v0, p0, Le8/c;->l:Ljava/lang/Class;

    .line 121
    .line 122
    const-string v0, "settingLocationClass"

    .line 123
    .line 124
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 125
    .line 126
    .line 127
    move-result-object v0

    .line 128
    iput-object v0, p0, Le8/c;->m:Ljava/lang/Class;

    .line 129
    .line 130
    const-string v0, "settingGroupMainClass"

    .line 131
    .line 132
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 133
    .line 134
    .line 135
    move-result-object v0

    .line 136
    iput-object v0, p0, Le8/c;->n:Ljava/lang/Class;

    .line 137
    .line 138
    const-string v0, "settingGroupAccountInfoClass"

    .line 139
    .line 140
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 141
    .line 142
    .line 143
    move-result-object v0

    .line 144
    iput-object v0, p0, Le8/c;->o:Ljava/lang/Class;

    .line 145
    .line 146
    const-string v0, "settingGroupPersonalInfoClass"

    .line 147
    .line 148
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 149
    .line 150
    .line 151
    move-result-object v0

    .line 152
    iput-object v0, p0, Le8/c;->p:Ljava/lang/Class;

    .line 153
    .line 154
    const-string v0, "settingAdditionHeaderSearchClass"

    .line 155
    .line 156
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 157
    .line 158
    .line 159
    move-result-object v0

    .line 160
    iput-object v0, p0, Le8/c;->q:Ljava/lang/Class;

    .line 161
    .line 162
    const-string v0, "baseSettingPrefUIClass"

    .line 163
    .line 164
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    iput-object v0, p0, Le8/c;->r:Ljava/lang/Class;

    .line 169
    .line 170
    const-string v0, "baseSettingUIClass"

    .line 171
    .line 172
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 173
    .line 174
    .line 175
    move-result-object v0

    .line 176
    iput-object v0, p0, Le8/c;->s:Ljava/lang/Class;

    .line 177
    .line 178
    const-string v0, "mainSettingsUIClass"

    .line 179
    .line 180
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    iput-object v0, p0, Le8/c;->t:Ljava/lang/Class;

    .line 185
    .line 186
    const-string v0, "methodAccountInfoReturns1"

    .line 187
    .line 188
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 189
    .line 190
    .line 191
    move-result-object v0

    .line 192
    iput-object v0, p0, Le8/c;->u:Ljava/lang/reflect/Method;

    .line 193
    .line 194
    const-string v0, "methodAccountInfoSettingKey"

    .line 195
    .line 196
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 197
    .line 198
    .line 199
    move-result-object v0

    .line 200
    iput-object v0, p0, Le8/c;->v:Ljava/lang/reflect/Method;

    .line 201
    .line 202
    const-string v0, "plusSubMenuHelperClass"

    .line 203
    .line 204
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 205
    .line 206
    .line 207
    move-result-object v0

    .line 208
    iput-object v0, p0, Le8/c;->w:Ljava/lang/Class;

    .line 209
    .line 210
    const-string v0, "plusSubMenuAdapterMethod"

    .line 211
    .line 212
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 213
    .line 214
    .line 215
    move-result-object v0

    .line 216
    iput-object v0, p0, Le8/c;->x:Ljava/lang/reflect/Method;

    .line 217
    .line 218
    const-string v0, "plusSubMenuOnItemClickMethod"

    .line 219
    .line 220
    invoke-virtual {p0, v0}, Le8/c;->g(Ljava/lang/String;)Ljava/lang/reflect/Method;

    .line 221
    .line 222
    .line 223
    move-result-object v0

    .line 224
    iput-object v0, p0, Le8/c;->y:Ljava/lang/reflect/Method;

    .line 225
    .line 226
    const-string v0, "settingsUIClass"

    .line 227
    .line 228
    invoke-virtual {p0, v0}, Le8/c;->f(Ljava/lang/String;)Ljava/lang/Class;

    .line 229
    .line 230
    .line 231
    move-result-object v0

    .line 232
    iput-object v0, p0, Le8/c;->z:Ljava/lang/Class;

    .line 233
    .line 234
    invoke-virtual {p0}, Le8/c;->e()Z

    .line 235
    .line 236
    .line 237
    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 238
    goto :goto_1

    .line 239
    :catchall_1
    move-exception v0

    .line 240
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 241
    .line 242
    .line 243
    goto/16 :goto_0

    .line 244
    .line 245
    :goto_1
    if-eqz v0, :cond_6

    .line 246
    .line 247
    invoke-virtual {p0, p1}, Le8/c;->m(Z)V

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Le8/c;->n()V

    .line 251
    .line 252
    .line 253
    if-nez v1, :cond_4

    .line 254
    .line 255
    goto :goto_2

    .line 256
    :cond_4
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 257
    .line 258
    .line 259
    move-result p1

    .line 260
    const/16 v0, 0x50

    .line 261
    .line 262
    if-gt p1, v0, :cond_5

    .line 263
    .line 264
    goto :goto_2

    .line 265
    :cond_5
    invoke-virtual {v1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 266
    .line 267
    .line 268
    move-result-object p1

    .line 269
    const-string v0, "..."

    .line 270
    .line 271
    invoke-virtual {p1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 272
    .line 273
    .line 274
    :goto_2
    return-void

    .line 275
    :cond_6
    invoke-virtual {p0, p1}, Le8/c;->m(Z)V

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Le8/c;->n()V

    .line 279
    .line 280
    .line 281
    return-void
.end method

.method public final l()Ljava/lang/Class;
    .locals 6

    .line 1
    iget-object v0, p0, Le8/c;->o:Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return-object v1

    .line 7
    :cond_0
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    if-eqz v0, :cond_4

    .line 12
    .line 13
    const-class v2, Ljava/lang/Object;

    .line 14
    .line 15
    if-eq v0, v2, :cond_4

    .line 16
    .line 17
    :try_start_0
    invoke-static {v0}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    :cond_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 26
    .line 27
    .line 28
    move-result v3

    .line 29
    if-eqz v3, :cond_3

    .line 30
    .line 31
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v3

    .line 35
    check-cast v3, Ljava/lang/reflect/Constructor;

    .line 36
    .line 37
    invoke-virtual {v3}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    array-length v4, v3

    .line 42
    const/4 v5, 0x1

    .line 43
    if-ne v4, v5, :cond_1

    .line 44
    .line 45
    const/4 v4, 0x0

    .line 46
    aget-object v3, v3, v4

    .line 47
    .line 48
    invoke-virtual {v3}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object v3

    .line 52
    const-string v4, "AppCompatActivity"

    .line 53
    .line 54
    invoke-virtual {v3, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 55
    .line 56
    .line 57
    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 58
    if-eqz v3, :cond_1

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    move-object v1, v0

    .line 63
    :cond_2
    const-class v2, Ljava/lang/String;

    .line 64
    .line 65
    invoke-static {v0, v2}, Le8/c;->a(Ljava/lang/Class;Ljava/lang/Class;)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-lez v2, :cond_3

    .line 70
    .line 71
    const-class v2, Ljava/lang/Class;

    .line 72
    .line 73
    invoke-static {v0, v2}, Le8/c;->a(Ljava/lang/Class;Ljava/lang/Class;)I

    .line 74
    .line 75
    .line 76
    move-result v2

    .line 77
    if-lez v2, :cond_3

    .line 78
    .line 79
    sget-object v2, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 80
    .line 81
    invoke-static {v0, v2}, Le8/c;->a(Ljava/lang/Class;Ljava/lang/Class;)I

    .line 82
    .line 83
    .line 84
    move-result v2

    .line 85
    if-lez v2, :cond_3

    .line 86
    .line 87
    return-object v0

    .line 88
    :catchall_0
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Class;->getSuperclass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    goto :goto_0

    .line 93
    :cond_4
    return-object v1
.end method

.method public final m(Z)V
    .locals 17

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    iget-object v0, v1, Le8/c;->e:Ljava/lang/Class;

    .line 4
    .line 5
    const-string v2, "com.tencent.mm.ui.base.preference.Preference"

    .line 6
    .line 7
    iget-object v3, v1, Le8/c;->b:Ljava/lang/ClassLoader;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    :try_start_0
    invoke-static {v2, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    iput-object v0, v1, Le8/c;->e:Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    :goto_0
    iget-object v0, v1, Le8/c;->f:Ljava/lang/Class;

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    goto :goto_1

    .line 28
    :cond_1
    :try_start_1
    const-string v0, "com.tencent.mm.ui.base.preference.IconPreference"

    .line 29
    .line 30
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    iput-object v0, v1, Le8/c;->f:Ljava/lang/Class;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 35
    .line 36
    goto :goto_1

    .line 37
    :catchall_1
    move-exception v0

    .line 38
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    :goto_1
    iget-object v0, v1, Le8/c;->g:Ljava/lang/reflect/Method;

    .line 42
    .line 43
    const-string v4, "java.lang.String"

    .line 44
    .line 45
    const-string v5, "void"

    .line 46
    .line 47
    const/4 v6, 0x5

    .line 48
    iget-object v7, v1, Le8/c;->a:Lorg/luckypray/dexkit/DexKitBridge;

    .line 49
    .line 50
    if-eqz v0, :cond_2

    .line 51
    .line 52
    goto :goto_2

    .line 53
    :cond_2
    iget-object v0, v1, Le8/c;->e:Ljava/lang/Class;

    .line 54
    .line 55
    if-nez v0, :cond_3

    .line 56
    .line 57
    goto :goto_2

    .line 58
    :cond_3
    :try_start_2
    new-instance v0, Lch/e;

    .line 59
    .line 60
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 61
    .line 62
    .line 63
    new-instance v8, Lfh/k;

    .line 64
    .line 65
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8, v6, v2}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-static {v8, v5}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    filled-new-array {v4}, [Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object v9

    .line 78
    invoke-virtual {v8, v9}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    const-string v9, "Preference"

    .line 82
    .line 83
    filled-new-array {v9}, [Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v9

    .line 87
    invoke-static {v9}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 88
    .line 89
    .line 90
    move-result-object v9

    .line 91
    invoke-virtual {v8, v9}, Lfh/k;->t0(Ljava/util/List;)V

    .line 92
    .line 93
    .line 94
    iput-object v8, v0, Lch/e;->h:Lfh/k;

    .line 95
    .line 96
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 97
    .line 98
    .line 99
    move-result-object v0

    .line 100
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 105
    .line 106
    .line 107
    move-result v8

    .line 108
    if-eqz v8, :cond_4

    .line 109
    .line 110
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 111
    .line 112
    .line 113
    move-result-object v0

    .line 114
    check-cast v0, Lhh/o;

    .line 115
    .line 116
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 117
    .line 118
    .line 119
    move-result-object v8

    .line 120
    iget-object v8, v8, Llh/d;->g:Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {v8, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 123
    .line 124
    .line 125
    move-result-object v8

    .line 126
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 127
    .line 128
    .line 129
    move-result-object v9

    .line 130
    iget-object v9, v9, Llh/d;->h:Ljava/lang/String;

    .line 131
    .line 132
    const-class v10, Ljava/lang/String;

    .line 133
    .line 134
    filled-new-array {v10}, [Ljava/lang/Class;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-static {v8, v9, v10}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 139
    .line 140
    .line 141
    move-result-object v8

    .line 142
    iput-object v8, v1, Le8/c;->g:Ljava/lang/reflect/Method;

    .line 143
    .line 144
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 145
    .line 146
    .line 147
    move-result-object v0

    .line 148
    iget-object v0, v0, Llh/d;->h:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 149
    .line 150
    goto :goto_2

    .line 151
    :catchall_2
    move-exception v0

    .line 152
    new-instance v8, Ljava/lang/StringBuilder;

    .line 153
    .line 154
    const-string v9, "[Hchat:SettingsDex] setKey \u5931\u8d25: "

    .line 155
    .line 156
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    invoke-static {v0, v8, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 160
    .line 161
    .line 162
    :cond_4
    :goto_2
    iget-object v0, v1, Le8/c;->h:Ljava/lang/reflect/Method;

    .line 163
    .line 164
    const/4 v8, 0x1

    .line 165
    if-eqz v0, :cond_5

    .line 166
    .line 167
    goto/16 :goto_6

    .line 168
    .line 169
    :cond_5
    iget-object v0, v1, Le8/c;->e:Ljava/lang/Class;

    .line 170
    .line 171
    if-nez v0, :cond_6

    .line 172
    .line 173
    goto/16 :goto_6

    .line 174
    .line 175
    :cond_6
    :try_start_3
    new-instance v0, Lch/c;

    .line 176
    .line 177
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 178
    .line 179
    .line 180
    new-instance v9, Lfh/a;

    .line 181
    .line 182
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 183
    .line 184
    .line 185
    invoke-virtual {v9, v6, v2}, Lfh/a;->m0(ILjava/lang/String;)V

    .line 186
    .line 187
    .line 188
    iput-object v9, v0, Lch/c;->h:Lfh/a;

    .line 189
    .line 190
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 191
    .line 192
    .line 193
    move-result-object v0

    .line 194
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 195
    .line 196
    .line 197
    move-result-object v0

    .line 198
    :cond_7
    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 199
    .line 200
    .line 201
    move-result v9

    .line 202
    if-eqz v9, :cond_a

    .line 203
    .line 204
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v9

    .line 208
    check-cast v9, Lhh/i;

    .line 209
    .line 210
    new-instance v9, Lch/e;

    .line 211
    .line 212
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 213
    .line 214
    .line 215
    new-instance v10, Lfh/k;

    .line 216
    .line 217
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 218
    .line 219
    .line 220
    invoke-static {v10, v5}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 221
    .line 222
    .line 223
    const-string v11, "java.lang.CharSequence"

    .line 224
    .line 225
    filled-new-array {v11}, [Ljava/lang/String;

    .line 226
    .line 227
    .line 228
    move-result-object v11

    .line 229
    invoke-virtual {v10, v11}, Lfh/k;->o0([Ljava/lang/String;)V

    .line 230
    .line 231
    .line 232
    iput-object v10, v9, Lch/e;->h:Lfh/k;

    .line 233
    .line 234
    invoke-virtual {v7, v9}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 235
    .line 236
    .line 237
    move-result-object v9

    .line 238
    new-instance v10, Ljava/util/ArrayList;

    .line 239
    .line 240
    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v9}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 244
    .line 245
    .line 246
    move-result-object v9

    .line 247
    :cond_8
    :goto_4
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    .line 248
    .line 249
    .line 250
    move-result v11

    .line 251
    if-eqz v11, :cond_9

    .line 252
    .line 253
    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    check-cast v11, Lhh/o;

    .line 258
    .line 259
    invoke-virtual {v11}, Lhh/o;->p()Llh/d;

    .line 260
    .line 261
    .line 262
    move-result-object v12

    .line 263
    iget-object v12, v12, Llh/d;->g:Ljava/lang/String;

    .line 264
    .line 265
    invoke-virtual {v2, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 266
    .line 267
    .line 268
    move-result v12

    .line 269
    if-eqz v12, :cond_8

    .line 270
    .line 271
    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 272
    .line 273
    .line 274
    goto :goto_4

    .line 275
    :catchall_3
    move-exception v0

    .line 276
    goto :goto_5

    .line 277
    :cond_9
    invoke-virtual {v10}, Ljava/util/ArrayList;->isEmpty()Z

    .line 278
    .line 279
    .line 280
    move-result v9

    .line 281
    if-nez v9, :cond_7

    .line 282
    .line 283
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    .line 284
    .line 285
    .line 286
    move-result v9

    .line 287
    sub-int/2addr v9, v8

    .line 288
    invoke-virtual {v10, v9}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 289
    .line 290
    .line 291
    move-result-object v9

    .line 292
    check-cast v9, Lhh/o;

    .line 293
    .line 294
    invoke-virtual {v9}, Lhh/o;->p()Llh/d;

    .line 295
    .line 296
    .line 297
    move-result-object v10

    .line 298
    iget-object v10, v10, Llh/d;->g:Ljava/lang/String;

    .line 299
    .line 300
    invoke-static {v10, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 301
    .line 302
    .line 303
    move-result-object v10

    .line 304
    invoke-virtual {v9}, Lhh/o;->p()Llh/d;

    .line 305
    .line 306
    .line 307
    move-result-object v11

    .line 308
    iget-object v11, v11, Llh/d;->h:Ljava/lang/String;

    .line 309
    .line 310
    const-class v12, Ljava/lang/CharSequence;

    .line 311
    .line 312
    filled-new-array {v12}, [Ljava/lang/Class;

    .line 313
    .line 314
    .line 315
    move-result-object v12

    .line 316
    invoke-static {v10, v11, v12}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 317
    .line 318
    .line 319
    move-result-object v10

    .line 320
    iput-object v10, v1, Le8/c;->h:Ljava/lang/reflect/Method;

    .line 321
    .line 322
    invoke-virtual {v9}, Lhh/o;->p()Llh/d;

    .line 323
    .line 324
    .line 325
    move-result-object v9

    .line 326
    iget-object v9, v9, Llh/d;->h:Ljava/lang/String;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_3

    .line 327
    .line 328
    goto/16 :goto_3

    .line 329
    .line 330
    :goto_5
    new-instance v9, Ljava/lang/StringBuilder;

    .line 331
    .line 332
    const-string v10, "[Hchat:SettingsDex] setTitle \u5931\u8d25: "

    .line 333
    .line 334
    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 335
    .line 336
    .line 337
    invoke-static {v0, v9, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 338
    .line 339
    .line 340
    :cond_a
    :goto_6
    iget-object v0, v1, Le8/c;->i:Ljava/lang/reflect/Method;

    .line 341
    .line 342
    const/4 v9, 0x0

    .line 343
    if-eqz v0, :cond_b

    .line 344
    .line 345
    goto :goto_7

    .line 346
    :cond_b
    iget-object v0, v1, Le8/c;->e:Ljava/lang/Class;

    .line 347
    .line 348
    if-nez v0, :cond_c

    .line 349
    .line 350
    goto :goto_7

    .line 351
    :cond_c
    :try_start_4
    new-instance v0, Lch/e;

    .line 352
    .line 353
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 354
    .line 355
    .line 356
    new-instance v10, Lfh/k;

    .line 357
    .line 358
    invoke-direct {v10}, Ljava/lang/Object;-><init>()V

    .line 359
    .line 360
    .line 361
    invoke-virtual {v10, v6, v2}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 362
    .line 363
    .line 364
    invoke-virtual {v10, v9}, Lfh/k;->m0(I)V

    .line 365
    .line 366
    .line 367
    invoke-static {v10, v4}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 368
    .line 369
    .line 370
    iput-object v10, v0, Lch/e;->h:Lfh/k;

    .line 371
    .line 372
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 373
    .line 374
    .line 375
    move-result-object v0

    .line 376
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 377
    .line 378
    .line 379
    move-result-object v0

    .line 380
    :cond_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 381
    .line 382
    .line 383
    move-result v2

    .line 384
    if-eqz v2, :cond_e

    .line 385
    .line 386
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    move-result-object v2

    .line 390
    check-cast v2, Lhh/o;

    .line 391
    .line 392
    const-string v10, "toString"

    .line 393
    .line 394
    invoke-virtual {v2}, Lhh/o;->p()Llh/d;

    .line 395
    .line 396
    .line 397
    move-result-object v11

    .line 398
    iget-object v11, v11, Llh/d;->h:Ljava/lang/String;

    .line 399
    .line 400
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 401
    .line 402
    .line 403
    move-result v10

    .line 404
    if-nez v10, :cond_d

    .line 405
    .line 406
    invoke-virtual {v2}, Lhh/o;->p()Llh/d;

    .line 407
    .line 408
    .line 409
    move-result-object v0

    .line 410
    iget-object v0, v0, Llh/d;->g:Ljava/lang/String;

    .line 411
    .line 412
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 413
    .line 414
    .line 415
    move-result-object v0

    .line 416
    invoke-virtual {v2}, Lhh/o;->p()Llh/d;

    .line 417
    .line 418
    .line 419
    move-result-object v10

    .line 420
    iget-object v10, v10, Llh/d;->h:Ljava/lang/String;

    .line 421
    .line 422
    new-array v11, v9, [Ljava/lang/Class;

    .line 423
    .line 424
    invoke-static {v0, v10, v11}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 425
    .line 426
    .line 427
    move-result-object v0

    .line 428
    iput-object v0, v1, Le8/c;->i:Ljava/lang/reflect/Method;

    .line 429
    .line 430
    invoke-virtual {v2}, Lhh/o;->p()Llh/d;

    .line 431
    .line 432
    .line 433
    move-result-object v0

    .line 434
    iget-object v0, v0, Llh/d;->h:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    .line 435
    .line 436
    goto :goto_7

    .line 437
    :catchall_4
    move-exception v0

    .line 438
    new-instance v2, Ljava/lang/StringBuilder;

    .line 439
    .line 440
    const-string v10, "[Hchat:SettingsDex] getKey \u5931\u8d25: "

    .line 441
    .line 442
    invoke-direct {v2, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 443
    .line 444
    .line 445
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 446
    .line 447
    .line 448
    :cond_e
    :goto_7
    const-string v0, "com.tencent.mm.ui.base.preference"

    .line 449
    .line 450
    iget-object v2, v1, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 451
    .line 452
    if-eqz v2, :cond_f

    .line 453
    .line 454
    :goto_8
    move/from16 v16, v9

    .line 455
    .line 456
    goto/16 :goto_e

    .line 457
    .line 458
    :cond_f
    iget-object v2, v1, Le8/c;->e:Ljava/lang/Class;

    .line 459
    .line 460
    if-nez v2, :cond_10

    .line 461
    .line 462
    goto :goto_8

    .line 463
    :cond_10
    :try_start_5
    new-instance v2, Lch/c;

    .line 464
    .line 465
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 466
    .line 467
    .line 468
    new-instance v11, Lfh/a;

    .line 469
    .line 470
    invoke-direct {v11}, Ljava/lang/Object;-><init>()V

    .line 471
    .line 472
    .line 473
    const-string v12, "android.widget.BaseAdapter"

    .line 474
    .line 475
    invoke-virtual {v11, v12}, Lfh/a;->o0(Ljava/lang/String;)V

    .line 476
    .line 477
    .line 478
    filled-new-array {v0}, [Ljava/lang/String;

    .line 479
    .line 480
    .line 481
    move-result-object v12

    .line 482
    invoke-static {v12}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 483
    .line 484
    .line 485
    move-result-object v12

    .line 486
    iput-object v12, v2, Lch/c;->g:Ljava/util/List;

    .line 487
    .line 488
    iput-object v11, v2, Lch/c;->h:Lfh/a;

    .line 489
    .line 490
    invoke-virtual {v7, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 491
    .line 492
    .line 493
    move-result-object v2

    .line 494
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 495
    .line 496
    .line 497
    move-result-object v2

    .line 498
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 499
    .line 500
    .line 501
    move-result v11

    .line 502
    if-eqz v11, :cond_16

    .line 503
    .line 504
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 505
    .line 506
    .line 507
    move-result-object v11

    .line 508
    check-cast v11, Lhh/i;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_7

    .line 509
    .line 510
    :try_start_6
    invoke-virtual {v11}, Lhh/i;->p()Llh/a;

    .line 511
    .line 512
    .line 513
    move-result-object v12

    .line 514
    iget-object v12, v12, Llh/a;->g:Ljava/lang/String;

    .line 515
    .line 516
    invoke-static {v12, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 517
    .line 518
    .line 519
    move-result-object v12

    .line 520
    invoke-static {v12}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 521
    .line 522
    .line 523
    move-result-object v13

    .line 524
    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 525
    .line 526
    .line 527
    move-result-object v13

    .line 528
    move v14, v9

    .line 529
    :goto_a
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    .line 530
    .line 531
    .line 532
    move-result v15

    .line 533
    const/4 v10, 0x3

    .line 534
    if-eqz v15, :cond_12

    .line 535
    .line 536
    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 537
    .line 538
    .line 539
    move-result-object v15

    .line 540
    check-cast v15, Ljava/lang/reflect/Method;
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    .line 541
    .line 542
    move/from16 v16, v9

    .line 543
    .line 544
    :try_start_7
    const-string v9, "getView"

    .line 545
    .line 546
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 547
    .line 548
    .line 549
    move-result-object v8

    .line 550
    invoke-virtual {v9, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 551
    .line 552
    .line 553
    move-result v8

    .line 554
    if-eqz v8, :cond_11

    .line 555
    .line 556
    invoke-static {v15}, Lh/Hchat/utils/KavaReflector;->isPublic(Ljava/lang/reflect/Method;)Z

    .line 557
    .line 558
    .line 559
    move-result v8

    .line 560
    if-eqz v8, :cond_11

    .line 561
    .line 562
    invoke-virtual {v15}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 563
    .line 564
    .line 565
    move-result v8

    .line 566
    if-ne v8, v10, :cond_11

    .line 567
    .line 568
    const/4 v14, 0x1

    .line 569
    :cond_11
    move/from16 v9, v16

    .line 570
    .line 571
    const/4 v8, 0x1

    .line 572
    goto :goto_a

    .line 573
    :cond_12
    move/from16 v16, v9

    .line 574
    .line 575
    invoke-static {v12}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 576
    .line 577
    .line 578
    move-result-object v8

    .line 579
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 580
    .line 581
    .line 582
    move-result-object v8

    .line 583
    move/from16 v9, v16

    .line 584
    .line 585
    :cond_13
    :goto_b
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 586
    .line 587
    .line 588
    move-result v12

    .line 589
    if-eqz v12, :cond_14

    .line 590
    .line 591
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 592
    .line 593
    .line 594
    move-result-object v12

    .line 595
    check-cast v12, Ljava/lang/reflect/Constructor;

    .line 596
    .line 597
    invoke-virtual {v12}, Ljava/lang/reflect/Constructor;->getParameterCount()I

    .line 598
    .line 599
    .line 600
    move-result v12

    .line 601
    if-ne v12, v10, :cond_13

    .line 602
    .line 603
    const/4 v9, 0x1

    .line 604
    goto :goto_b

    .line 605
    :cond_14
    if-eqz v14, :cond_15

    .line 606
    .line 607
    if-eqz v9, :cond_15

    .line 608
    .line 609
    invoke-virtual {v11}, Lhh/i;->p()Llh/a;

    .line 610
    .line 611
    .line 612
    move-result-object v8

    .line 613
    iget-object v2, v8, Llh/a;->g:Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_6

    .line 614
    .line 615
    goto :goto_c

    .line 616
    :catchall_5
    move/from16 v16, v9

    .line 617
    .line 618
    :catchall_6
    :cond_15
    move/from16 v9, v16

    .line 619
    .line 620
    const/4 v8, 0x1

    .line 621
    goto :goto_9

    .line 622
    :catchall_7
    move-exception v0

    .line 623
    move/from16 v16, v9

    .line 624
    .line 625
    goto/16 :goto_d

    .line 626
    .line 627
    :cond_16
    move/from16 v16, v9

    .line 628
    .line 629
    const/4 v2, 0x0

    .line 630
    :goto_c
    if-nez v2, :cond_17

    .line 631
    .line 632
    goto/16 :goto_e

    .line 633
    .line 634
    :cond_17
    :try_start_8
    new-instance v8, Lch/e;

    .line 635
    .line 636
    invoke-direct {v8}, Ljava/lang/Object;-><init>()V

    .line 637
    .line 638
    .line 639
    new-instance v9, Lfh/k;

    .line 640
    .line 641
    invoke-direct {v9}, Ljava/lang/Object;-><init>()V

    .line 642
    .line 643
    .line 644
    invoke-virtual {v9, v6, v2}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 645
    .line 646
    .line 647
    const/4 v2, 0x2

    .line 648
    invoke-virtual {v9, v2}, Lfh/k;->m0(I)V

    .line 649
    .line 650
    .line 651
    invoke-static {v9, v5}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 652
    .line 653
    .line 654
    filled-new-array {v0}, [Ljava/lang/String;

    .line 655
    .line 656
    .line 657
    move-result-object v0

    .line 658
    invoke-static {v0}, Ltf/l;->L0([Ljava/lang/Object;)Ljava/util/List;

    .line 659
    .line 660
    .line 661
    move-result-object v0

    .line 662
    iput-object v0, v8, Lch/e;->g:Ljava/util/List;

    .line 663
    .line 664
    iput-object v9, v8, Lch/e;->h:Lfh/k;

    .line 665
    .line 666
    invoke-virtual {v7, v8}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 667
    .line 668
    .line 669
    move-result-object v0

    .line 670
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 671
    .line 672
    .line 673
    move-result-object v0

    .line 674
    :catchall_8
    :cond_18
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 675
    .line 676
    .line 677
    move-result v5

    .line 678
    if-eqz v5, :cond_1c

    .line 679
    .line 680
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 681
    .line 682
    .line 683
    move-result-object v5

    .line 684
    check-cast v5, Lhh/o;
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_9

    .line 685
    .line 686
    :try_start_9
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 687
    .line 688
    .line 689
    move-result-object v8

    .line 690
    iget-object v8, v8, Llh/d;->g:Ljava/lang/String;

    .line 691
    .line 692
    invoke-static {v8, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 693
    .line 694
    .line 695
    move-result-object v8

    .line 696
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 697
    .line 698
    .line 699
    move-result-object v9

    .line 700
    iget-object v9, v9, Llh/d;->h:Ljava/lang/String;

    .line 701
    .line 702
    iget-object v10, v1, Le8/c;->e:Ljava/lang/Class;

    .line 703
    .line 704
    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 705
    .line 706
    filled-new-array {v10, v11}, [Ljava/lang/Class;

    .line 707
    .line 708
    .line 709
    move-result-object v10

    .line 710
    invoke-static {v8, v9, v10}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 711
    .line 712
    .line 713
    move-result-object v9

    .line 714
    iput-object v9, v1, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 715
    .line 716
    if-nez v9, :cond_1a

    .line 717
    .line 718
    invoke-static {v8}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 719
    .line 720
    .line 721
    move-result-object v8

    .line 722
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 723
    .line 724
    .line 725
    move-result-object v8

    .line 726
    :cond_19
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 727
    .line 728
    .line 729
    move-result v9

    .line 730
    if-eqz v9, :cond_1a

    .line 731
    .line 732
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 733
    .line 734
    .line 735
    move-result-object v9

    .line 736
    check-cast v9, Ljava/lang/reflect/Method;

    .line 737
    .line 738
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 739
    .line 740
    .line 741
    move-result-object v10

    .line 742
    iget-object v10, v10, Llh/d;->h:Ljava/lang/String;

    .line 743
    .line 744
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 745
    .line 746
    .line 747
    move-result-object v11

    .line 748
    invoke-virtual {v10, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 749
    .line 750
    .line 751
    move-result v10

    .line 752
    if-eqz v10, :cond_19

    .line 753
    .line 754
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 755
    .line 756
    .line 757
    move-result v10

    .line 758
    if-ne v10, v2, :cond_19

    .line 759
    .line 760
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 761
    .line 762
    .line 763
    move-result-object v10

    .line 764
    sget-object v11, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 765
    .line 766
    if-ne v10, v11, :cond_19

    .line 767
    .line 768
    iput-object v9, v1, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 769
    .line 770
    :cond_1a
    iget-object v8, v1, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 771
    .line 772
    if-eqz v8, :cond_1b

    .line 773
    .line 774
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 775
    .line 776
    .line 777
    move-result-object v8

    .line 778
    iget-object v8, v8, Llh/d;->g:Ljava/lang/String;

    .line 779
    .line 780
    invoke-virtual {v5}, Lhh/o;->p()Llh/d;

    .line 781
    .line 782
    .line 783
    move-result-object v5

    .line 784
    iget-object v5, v5, Llh/d;->h:Ljava/lang/String;

    .line 785
    .line 786
    :cond_1b
    iget-object v5, v1, Le8/c;->j:Ljava/lang/reflect/Method;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_8

    .line 787
    .line 788
    if-eqz v5, :cond_18

    .line 789
    .line 790
    goto :goto_e

    .line 791
    :catchall_9
    move-exception v0

    .line 792
    :goto_d
    new-instance v2, Ljava/lang/StringBuilder;

    .line 793
    .line 794
    const-string v5, "[Hchat:SettingsDex] addPreference \u5931\u8d25: "

    .line 795
    .line 796
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 797
    .line 798
    .line 799
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 800
    .line 801
    .line 802
    :cond_1c
    :goto_e
    iget-object v0, v1, Le8/c;->z:Ljava/lang/Class;

    .line 803
    .line 804
    if-eqz v0, :cond_1d

    .line 805
    .line 806
    iget-object v0, v1, Le8/c;->t:Ljava/lang/Class;

    .line 807
    .line 808
    if-eqz v0, :cond_1d

    .line 809
    .line 810
    goto :goto_f

    .line 811
    :cond_1d
    :try_start_a
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting.SettingsUI"

    .line 812
    .line 813
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 814
    .line 815
    .line 816
    move-result-object v0

    .line 817
    iput-object v0, v1, Le8/c;->z:Ljava/lang/Class;
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_a

    .line 818
    .line 819
    :catchall_a
    :try_start_b
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting_new.MainSettingsUI"

    .line 820
    .line 821
    invoke-static {v0, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 822
    .line 823
    .line 824
    move-result-object v0

    .line 825
    iput-object v0, v1, Le8/c;->t:Ljava/lang/Class;
    :try_end_b
    .catchall {:try_start_b .. :try_end_b} :catchall_b

    .line 826
    .line 827
    :catchall_b
    :goto_f
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupMain"

    .line 828
    .line 829
    invoke-virtual {v1, v0}, Le8/c;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 830
    .line 831
    .line 832
    move-result-object v0

    .line 833
    iput-object v0, v1, Le8/c;->n:Ljava/lang/Class;

    .line 834
    .line 835
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupAccountInfo"

    .line 836
    .line 837
    invoke-virtual {v1, v0}, Le8/c;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 838
    .line 839
    .line 840
    move-result-object v0

    .line 841
    iput-object v0, v1, Le8/c;->o:Ljava/lang/Class;

    .line 842
    .line 843
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingGroupPersonalInfo"

    .line 844
    .line 845
    invoke-virtual {v1, v0}, Le8/c;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 846
    .line 847
    .line 848
    move-result-object v0

    .line 849
    iput-object v0, v1, Le8/c;->p:Ljava/lang/Class;

    .line 850
    .line 851
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingAdditionHeaderSearch"

    .line 852
    .line 853
    invoke-virtual {v1, v0}, Le8/c;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 854
    .line 855
    .line 856
    move-result-object v0

    .line 857
    iput-object v0, v1, Le8/c;->q:Ljava/lang/Class;

    .line 858
    .line 859
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingPrefUI"

    .line 860
    .line 861
    invoke-virtual {v1, v0}, Le8/c;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 862
    .line 863
    .line 864
    move-result-object v0

    .line 865
    iput-object v0, v1, Le8/c;->r:Ljava/lang/Class;

    .line 866
    .line 867
    const-string v0, "com.tencent.mm.plugin.setting.ui.setting_new.base.BaseSettingUI"

    .line 868
    .line 869
    invoke-virtual {v1, v0}, Le8/c;->c(Ljava/lang/String;)Ljava/lang/Class;

    .line 870
    .line 871
    .line 872
    move-result-object v0

    .line 873
    iput-object v0, v1, Le8/c;->s:Ljava/lang/Class;

    .line 874
    .line 875
    iget-object v0, v1, Le8/c;->k:Ljava/lang/Class;

    .line 876
    .line 877
    if-eqz v0, :cond_1e

    .line 878
    .line 879
    goto/16 :goto_12

    .line 880
    .line 881
    :cond_1e
    :try_start_c
    new-instance v0, Lch/c;

    .line 882
    .line 883
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 884
    .line 885
    .line 886
    new-instance v2, Lfh/a;

    .line 887
    .line 888
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 889
    .line 890
    .line 891
    const-string v5, "Repairer_Setting"

    .line 892
    .line 893
    filled-new-array {v5}, [Ljava/lang/String;

    .line 894
    .line 895
    .line 896
    move-result-object v5

    .line 897
    invoke-virtual {v2, v5}, Lfh/a;->p0([Ljava/lang/String;)V

    .line 898
    .line 899
    .line 900
    iput-object v2, v0, Lch/c;->h:Lfh/a;

    .line 901
    .line 902
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 903
    .line 904
    .line 905
    move-result-object v0

    .line 906
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 907
    .line 908
    .line 909
    move-result-object v0

    .line 910
    const/4 v2, 0x0

    .line 911
    :cond_1f
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 912
    .line 913
    .line 914
    move-result v5

    .line 915
    if-eqz v5, :cond_22

    .line 916
    .line 917
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 918
    .line 919
    .line 920
    move-result-object v5

    .line 921
    check-cast v5, Lhh/i;

    .line 922
    .line 923
    invoke-virtual {v5}, Lhh/i;->p()Llh/a;

    .line 924
    .line 925
    .line 926
    move-result-object v5

    .line 927
    iget-object v5, v5, Llh/a;->g:Ljava/lang/String;

    .line 928
    .line 929
    invoke-static {v5, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 930
    .line 931
    .line 932
    move-result-object v5

    .line 933
    if-nez v2, :cond_20

    .line 934
    .line 935
    move-object v2, v5

    .line 936
    :cond_20
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 937
    .line 938
    .line 939
    move-result-object v8

    .line 940
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 941
    .line 942
    .line 943
    move-result-object v8

    .line 944
    :cond_21
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 945
    .line 946
    .line 947
    move-result v9

    .line 948
    if-eqz v9, :cond_1f

    .line 949
    .line 950
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 951
    .line 952
    .line 953
    move-result-object v9

    .line 954
    check-cast v9, Ljava/lang/reflect/Method;

    .line 955
    .line 956
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 957
    .line 958
    .line 959
    move-result v10

    .line 960
    if-nez v10, :cond_21

    .line 961
    .line 962
    const-class v10, Ljava/util/Map;

    .line 963
    .line 964
    invoke-virtual {v9}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 965
    .line 966
    .line 967
    move-result-object v9

    .line 968
    invoke-virtual {v10, v9}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 969
    .line 970
    .line 971
    move-result v9

    .line 972
    if-eqz v9, :cond_21

    .line 973
    .line 974
    iput-object v5, v1, Le8/c;->k:Ljava/lang/Class;

    .line 975
    .line 976
    goto :goto_10

    .line 977
    :catchall_c
    move-exception v0

    .line 978
    goto :goto_11

    .line 979
    :cond_22
    :goto_10
    iget-object v0, v1, Le8/c;->k:Ljava/lang/Class;

    .line 980
    .line 981
    if-nez v0, :cond_23

    .line 982
    .line 983
    iput-object v2, v1, Le8/c;->k:Ljava/lang/Class;
    :try_end_c
    .catchall {:try_start_c .. :try_end_c} :catchall_c

    .line 984
    .line 985
    goto :goto_12

    .line 986
    :goto_11
    new-instance v2, Ljava/lang/StringBuilder;

    .line 987
    .line 988
    const-string v5, "[Hchat:SettingsDex] SettingItemClassesProvider \u5931\u8d25: "

    .line 989
    .line 990
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 991
    .line 992
    .line 993
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 994
    .line 995
    .line 996
    :cond_23
    :goto_12
    iget-object v0, v1, Le8/c;->l:Ljava/lang/Class;

    .line 997
    .line 998
    if-eqz v0, :cond_24

    .line 999
    .line 1000
    goto/16 :goto_16

    .line 1001
    .line 1002
    :cond_24
    :try_start_d
    invoke-virtual {v1}, Le8/c;->l()Ljava/lang/Class;

    .line 1003
    .line 1004
    .line 1005
    move-result-object v0

    .line 1006
    iput-object v0, v1, Le8/c;->l:Ljava/lang/Class;

    .line 1007
    .line 1008
    if-eqz v0, :cond_25

    .line 1009
    .line 1010
    goto/16 :goto_16

    .line 1011
    .line 1012
    :cond_25
    new-instance v0, Lch/c;

    .line 1013
    .line 1014
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1015
    .line 1016
    .line 1017
    new-instance v2, Lfh/a;

    .line 1018
    .line 1019
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1020
    .line 1021
    .line 1022
    const-string v5, ""

    .line 1023
    .line 1024
    const-string v8, "activity"

    .line 1025
    .line 1026
    const-string v9, "context"

    .line 1027
    .line 1028
    const-string v10, "intent"

    .line 1029
    .line 1030
    filled-new-array {v5, v8, v9, v10}, [Ljava/lang/String;

    .line 1031
    .line 1032
    .line 1033
    move-result-object v5

    .line 1034
    invoke-virtual {v2, v5}, Lfh/a;->p0([Ljava/lang/String;)V

    .line 1035
    .line 1036
    .line 1037
    iput-object v2, v0, Lch/c;->h:Lfh/a;

    .line 1038
    .line 1039
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 1040
    .line 1041
    .line 1042
    move-result-object v0

    .line 1043
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1044
    .line 1045
    .line 1046
    move-result-object v0

    .line 1047
    const/4 v2, 0x0

    .line 1048
    :catchall_d
    :cond_26
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1049
    .line 1050
    .line 1051
    move-result v5

    .line 1052
    if-eqz v5, :cond_2a

    .line 1053
    .line 1054
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1055
    .line 1056
    .line 1057
    move-result-object v5

    .line 1058
    check-cast v5, Lhh/i;
    :try_end_d
    .catchall {:try_start_d .. :try_end_d} :catchall_e

    .line 1059
    .line 1060
    :try_start_e
    invoke-virtual {v5}, Lhh/i;->p()Llh/a;

    .line 1061
    .line 1062
    .line 1063
    move-result-object v5

    .line 1064
    iget-object v5, v5, Llh/a;->g:Ljava/lang/String;

    .line 1065
    .line 1066
    invoke-static {v5, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1067
    .line 1068
    .line 1069
    move-result-object v5

    .line 1070
    invoke-static {v5}, Lh/Hchat/utils/KavaReflector;->declaredConstructors(Ljava/lang/Class;)Ljava/util/List;

    .line 1071
    .line 1072
    .line 1073
    move-result-object v8

    .line 1074
    invoke-interface {v8}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1075
    .line 1076
    .line 1077
    move-result-object v8

    .line 1078
    :cond_27
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    .line 1079
    .line 1080
    .line 1081
    move-result v9

    .line 1082
    if-eqz v9, :cond_26

    .line 1083
    .line 1084
    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1085
    .line 1086
    .line 1087
    move-result-object v9

    .line 1088
    check-cast v9, Ljava/lang/reflect/Constructor;

    .line 1089
    .line 1090
    invoke-virtual {v9}, Ljava/lang/reflect/Constructor;->getParameterTypes()[Ljava/lang/Class;

    .line 1091
    .line 1092
    .line 1093
    move-result-object v9

    .line 1094
    array-length v10, v9

    .line 1095
    const/4 v11, 0x1

    .line 1096
    if-ne v10, v11, :cond_27

    .line 1097
    .line 1098
    aget-object v9, v9, v16

    .line 1099
    .line 1100
    invoke-virtual {v9}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1101
    .line 1102
    .line 1103
    move-result-object v9

    .line 1104
    const-string v10, "AppCompatActivity"

    .line 1105
    .line 1106
    invoke-virtual {v9, v10}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 1107
    .line 1108
    .line 1109
    move-result v9

    .line 1110
    if-eqz v9, :cond_27

    .line 1111
    .line 1112
    if-nez v2, :cond_28

    .line 1113
    .line 1114
    move-object v2, v5

    .line 1115
    :cond_28
    invoke-virtual {v5}, Ljava/lang/Class;->getInterfaces()[Ljava/lang/Class;

    .line 1116
    .line 1117
    .line 1118
    move-result-object v8

    .line 1119
    array-length v9, v8

    .line 1120
    move/from16 v10, v16

    .line 1121
    .line 1122
    :goto_13
    if-ge v10, v9, :cond_26

    .line 1123
    .line 1124
    aget-object v11, v8, v10

    .line 1125
    .line 1126
    invoke-virtual {v11}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1127
    .line 1128
    .line 1129
    move-result-object v11

    .line 1130
    const-string v12, "com.tencent.mm.plugin.newtips.model"

    .line 1131
    .line 1132
    invoke-virtual {v11, v12}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 1133
    .line 1134
    .line 1135
    move-result v11

    .line 1136
    if-eqz v11, :cond_29

    .line 1137
    .line 1138
    iput-object v5, v1, Le8/c;->l:Ljava/lang/Class;
    :try_end_e
    .catchall {:try_start_e .. :try_end_e} :catchall_d

    .line 1139
    .line 1140
    goto :goto_14

    .line 1141
    :cond_29
    add-int/lit8 v10, v10, 0x1

    .line 1142
    .line 1143
    goto :goto_13

    .line 1144
    :catchall_e
    move-exception v0

    .line 1145
    goto :goto_15

    .line 1146
    :cond_2a
    :goto_14
    :try_start_f
    iget-object v0, v1, Le8/c;->l:Ljava/lang/Class;

    .line 1147
    .line 1148
    if-nez v0, :cond_2b

    .line 1149
    .line 1150
    iput-object v2, v1, Le8/c;->l:Ljava/lang/Class;
    :try_end_f
    .catchall {:try_start_f .. :try_end_f} :catchall_e

    .line 1151
    .line 1152
    goto :goto_16

    .line 1153
    :goto_15
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1154
    .line 1155
    const-string v5, "[Hchat:SettingsDex] BaseSettingItem \u5931\u8d25: "

    .line 1156
    .line 1157
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1158
    .line 1159
    .line 1160
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 1161
    .line 1162
    .line 1163
    :cond_2b
    :goto_16
    iget-object v0, v1, Le8/c;->m:Ljava/lang/Class;

    .line 1164
    .line 1165
    if-eqz v0, :cond_2c

    .line 1166
    .line 1167
    goto :goto_17

    .line 1168
    :cond_2c
    :try_start_10
    new-instance v0, Lch/c;

    .line 1169
    .line 1170
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1171
    .line 1172
    .line 1173
    new-instance v2, Lfh/a;

    .line 1174
    .line 1175
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1176
    .line 1177
    .line 1178
    const-string v5, "SettingLocation(parentGroup="

    .line 1179
    .line 1180
    const-string v8, ", frontItem="

    .line 1181
    .line 1182
    filled-new-array {v5, v8}, [Ljava/lang/String;

    .line 1183
    .line 1184
    .line 1185
    move-result-object v5

    .line 1186
    invoke-virtual {v2, v5}, Lfh/a;->p0([Ljava/lang/String;)V

    .line 1187
    .line 1188
    .line 1189
    iput-object v2, v0, Lch/c;->h:Lfh/a;

    .line 1190
    .line 1191
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 1192
    .line 1193
    .line 1194
    move-result-object v0

    .line 1195
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1196
    .line 1197
    .line 1198
    move-result-object v0

    .line 1199
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1200
    .line 1201
    .line 1202
    move-result v2

    .line 1203
    if-eqz v2, :cond_2d

    .line 1204
    .line 1205
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1206
    .line 1207
    .line 1208
    move-result-object v0

    .line 1209
    check-cast v0, Lhh/i;

    .line 1210
    .line 1211
    invoke-virtual {v0}, Lhh/i;->p()Llh/a;

    .line 1212
    .line 1213
    .line 1214
    move-result-object v2

    .line 1215
    iget-object v2, v2, Llh/a;->g:Ljava/lang/String;

    .line 1216
    .line 1217
    invoke-static {v2, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1218
    .line 1219
    .line 1220
    move-result-object v2

    .line 1221
    iput-object v2, v1, Le8/c;->m:Ljava/lang/Class;

    .line 1222
    .line 1223
    invoke-virtual {v0}, Lhh/i;->p()Llh/a;

    .line 1224
    .line 1225
    .line 1226
    move-result-object v0

    .line 1227
    iget-object v0, v0, Llh/a;->g:Ljava/lang/String;
    :try_end_10
    .catchall {:try_start_10 .. :try_end_10} :catchall_f

    .line 1228
    .line 1229
    goto :goto_17

    .line 1230
    :catchall_f
    move-exception v0

    .line 1231
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1232
    .line 1233
    const-string v5, "[Hchat:SettingsDex] SettingLocation \u5931\u8d25: "

    .line 1234
    .line 1235
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1236
    .line 1237
    .line 1238
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 1239
    .line 1240
    .line 1241
    :cond_2d
    :goto_17
    iget-object v0, v1, Le8/c;->u:Ljava/lang/reflect/Method;

    .line 1242
    .line 1243
    if-eqz v0, :cond_2e

    .line 1244
    .line 1245
    goto :goto_18

    .line 1246
    :cond_2e
    iget-object v0, v1, Le8/c;->o:Ljava/lang/Class;

    .line 1247
    .line 1248
    if-nez v0, :cond_2f

    .line 1249
    .line 1250
    goto :goto_18

    .line 1251
    :cond_2f
    :try_start_11
    new-instance v2, Lch/e;

    .line 1252
    .line 1253
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1254
    .line 1255
    .line 1256
    new-instance v5, Lfh/k;

    .line 1257
    .line 1258
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1259
    .line 1260
    .line 1261
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1262
    .line 1263
    .line 1264
    move-result-object v0

    .line 1265
    invoke-virtual {v5, v6, v0}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 1266
    .line 1267
    .line 1268
    const/4 v11, 0x1

    .line 1269
    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 1270
    .line 1271
    .line 1272
    move-result-object v0

    .line 1273
    new-array v8, v11, [Ljava/lang/Number;

    .line 1274
    .line 1275
    aput-object v0, v8, v16

    .line 1276
    .line 1277
    invoke-virtual {v5, v8}, Lfh/k;->s0([Ljava/lang/Number;)V

    .line 1278
    .line 1279
    .line 1280
    const-string v0, "int"

    .line 1281
    .line 1282
    invoke-static {v5, v0}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 1283
    .line 1284
    .line 1285
    iput-object v5, v2, Lch/e;->h:Lfh/k;

    .line 1286
    .line 1287
    invoke-virtual {v7, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 1288
    .line 1289
    .line 1290
    move-result-object v0

    .line 1291
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1292
    .line 1293
    .line 1294
    move-result-object v0

    .line 1295
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1296
    .line 1297
    .line 1298
    move-result v2

    .line 1299
    if-eqz v2, :cond_30

    .line 1300
    .line 1301
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1302
    .line 1303
    .line 1304
    move-result-object v0

    .line 1305
    check-cast v0, Lhh/o;

    .line 1306
    .line 1307
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1308
    .line 1309
    .line 1310
    move-result-object v2

    .line 1311
    iget-object v2, v2, Llh/d;->g:Ljava/lang/String;

    .line 1312
    .line 1313
    invoke-static {v2, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1314
    .line 1315
    .line 1316
    move-result-object v2

    .line 1317
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1318
    .line 1319
    .line 1320
    move-result-object v5

    .line 1321
    iget-object v5, v5, Llh/d;->h:Ljava/lang/String;

    .line 1322
    .line 1323
    move/from16 v8, v16

    .line 1324
    .line 1325
    new-array v9, v8, [Ljava/lang/Class;

    .line 1326
    .line 1327
    invoke-static {v2, v5, v9}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1328
    .line 1329
    .line 1330
    move-result-object v2

    .line 1331
    iput-object v2, v1, Le8/c;->u:Ljava/lang/reflect/Method;

    .line 1332
    .line 1333
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1334
    .line 1335
    .line 1336
    move-result-object v0

    .line 1337
    iget-object v0, v0, Llh/d;->h:Ljava/lang/String;
    :try_end_11
    .catchall {:try_start_11 .. :try_end_11} :catchall_10

    .line 1338
    .line 1339
    goto :goto_18

    .line 1340
    :catchall_10
    move-exception v0

    .line 1341
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1342
    .line 1343
    const-string v5, "[Hchat:SettingsDex] AccountInfo.returns1 \u5931\u8d25: "

    .line 1344
    .line 1345
    invoke-direct {v2, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1346
    .line 1347
    .line 1348
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 1349
    .line 1350
    .line 1351
    :cond_30
    :goto_18
    iget-object v0, v1, Le8/c;->v:Ljava/lang/reflect/Method;

    .line 1352
    .line 1353
    if-eqz v0, :cond_31

    .line 1354
    .line 1355
    goto :goto_19

    .line 1356
    :cond_31
    iget-object v0, v1, Le8/c;->o:Ljava/lang/Class;

    .line 1357
    .line 1358
    if-nez v0, :cond_32

    .line 1359
    .line 1360
    goto :goto_19

    .line 1361
    :cond_32
    :try_start_12
    new-instance v2, Lch/e;

    .line 1362
    .line 1363
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1364
    .line 1365
    .line 1366
    new-instance v5, Lfh/k;

    .line 1367
    .line 1368
    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    .line 1369
    .line 1370
    .line 1371
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 1372
    .line 1373
    .line 1374
    move-result-object v0

    .line 1375
    invoke-virtual {v5, v6, v0}, Lfh/k;->l0(ILjava/lang/String;)V

    .line 1376
    .line 1377
    .line 1378
    const/4 v8, 0x0

    .line 1379
    invoke-virtual {v5, v8}, Lfh/k;->m0(I)V

    .line 1380
    .line 1381
    .line 1382
    invoke-static {v5, v4}, Lfh/k;->q0(Lfh/k;Ljava/lang/String;)V

    .line 1383
    .line 1384
    .line 1385
    const-string v0, "SettingGroup_Main_AccountInfo"

    .line 1386
    .line 1387
    filled-new-array {v0}, [Ljava/lang/String;

    .line 1388
    .line 1389
    .line 1390
    move-result-object v0

    .line 1391
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1392
    .line 1393
    .line 1394
    move-result-object v0

    .line 1395
    invoke-virtual {v5, v0}, Lfh/k;->t0(Ljava/util/List;)V

    .line 1396
    .line 1397
    .line 1398
    iput-object v5, v2, Lch/e;->h:Lfh/k;

    .line 1399
    .line 1400
    invoke-virtual {v7, v2}, Lorg/luckypray/dexkit/DexKitBridge;->findMethod(Lch/e;)Lhh/p;

    .line 1401
    .line 1402
    .line 1403
    move-result-object v0

    .line 1404
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1405
    .line 1406
    .line 1407
    move-result-object v0

    .line 1408
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1409
    .line 1410
    .line 1411
    move-result v2

    .line 1412
    if-eqz v2, :cond_33

    .line 1413
    .line 1414
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1415
    .line 1416
    .line 1417
    move-result-object v0

    .line 1418
    check-cast v0, Lhh/o;

    .line 1419
    .line 1420
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1421
    .line 1422
    .line 1423
    move-result-object v2

    .line 1424
    iget-object v2, v2, Llh/d;->g:Ljava/lang/String;

    .line 1425
    .line 1426
    invoke-static {v2, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1427
    .line 1428
    .line 1429
    move-result-object v2

    .line 1430
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1431
    .line 1432
    .line 1433
    move-result-object v4

    .line 1434
    iget-object v4, v4, Llh/d;->h:Ljava/lang/String;

    .line 1435
    .line 1436
    const/4 v8, 0x0

    .line 1437
    new-array v5, v8, [Ljava/lang/Class;

    .line 1438
    .line 1439
    invoke-static {v2, v4, v5}, Lh/Hchat/utils/KavaReflector;->findMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1440
    .line 1441
    .line 1442
    move-result-object v2

    .line 1443
    iput-object v2, v1, Le8/c;->v:Ljava/lang/reflect/Method;

    .line 1444
    .line 1445
    invoke-virtual {v0}, Lhh/o;->p()Llh/d;

    .line 1446
    .line 1447
    .line 1448
    move-result-object v0

    .line 1449
    iget-object v0, v0, Llh/d;->h:Ljava/lang/String;
    :try_end_12
    .catchall {:try_start_12 .. :try_end_12} :catchall_11

    .line 1450
    .line 1451
    goto :goto_19

    .line 1452
    :catchall_11
    move-exception v0

    .line 1453
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1454
    .line 1455
    const-string v4, "[Hchat:SettingsDex] AccountInfo.settingKey \u5931\u8d25: "

    .line 1456
    .line 1457
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1458
    .line 1459
    .line 1460
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 1461
    .line 1462
    .line 1463
    :cond_33
    :goto_19
    if-eqz p1, :cond_3b

    .line 1464
    .line 1465
    iget-object v0, v1, Le8/c;->w:Ljava/lang/Class;

    .line 1466
    .line 1467
    if-eqz v0, :cond_34

    .line 1468
    .line 1469
    iget-object v0, v1, Le8/c;->x:Ljava/lang/reflect/Method;

    .line 1470
    .line 1471
    if-eqz v0, :cond_34

    .line 1472
    .line 1473
    iget-object v0, v1, Le8/c;->y:Ljava/lang/reflect/Method;

    .line 1474
    .line 1475
    if-eqz v0, :cond_34

    .line 1476
    .line 1477
    goto/16 :goto_1c

    .line 1478
    .line 1479
    :cond_34
    :try_start_13
    new-instance v0, Lch/c;

    .line 1480
    .line 1481
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 1482
    .line 1483
    .line 1484
    new-instance v2, Lfh/a;

    .line 1485
    .line 1486
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 1487
    .line 1488
    .line 1489
    const-string v4, "MicroMsg.PlusSubMenuHelper"

    .line 1490
    .line 1491
    filled-new-array {v4}, [Ljava/lang/String;

    .line 1492
    .line 1493
    .line 1494
    move-result-object v4

    .line 1495
    invoke-static {v4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 1496
    .line 1497
    .line 1498
    move-result-object v4

    .line 1499
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1500
    .line 1501
    .line 1502
    invoke-static {v2, v4}, Lfh/a;->r0(Lfh/a;Ljava/util/Collection;)V

    .line 1503
    .line 1504
    .line 1505
    iput-object v2, v0, Lch/c;->h:Lfh/a;

    .line 1506
    .line 1507
    invoke-virtual {v7, v0}, Lorg/luckypray/dexkit/DexKitBridge;->findClass(Lch/c;)Lhh/j;

    .line 1508
    .line 1509
    .line 1510
    move-result-object v0

    .line 1511
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 1512
    .line 1513
    .line 1514
    move-result-object v0

    .line 1515
    :catchall_12
    :cond_35
    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 1516
    .line 1517
    .line 1518
    move-result v2

    .line 1519
    if-eqz v2, :cond_3b

    .line 1520
    .line 1521
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1522
    .line 1523
    .line 1524
    move-result-object v2

    .line 1525
    check-cast v2, Lhh/i;
    :try_end_13
    .catchall {:try_start_13 .. :try_end_13} :catchall_13

    .line 1526
    .line 1527
    :try_start_14
    invoke-virtual {v2}, Lhh/i;->p()Llh/a;

    .line 1528
    .line 1529
    .line 1530
    move-result-object v2

    .line 1531
    iget-object v2, v2, Llh/a;->g:Ljava/lang/String;

    .line 1532
    .line 1533
    invoke-static {v2, v3}, Lh/Hchat/utils/KavaReflector;->loadClass(Ljava/lang/String;Ljava/lang/ClassLoader;)Ljava/lang/Class;

    .line 1534
    .line 1535
    .line 1536
    move-result-object v2

    .line 1537
    invoke-static {v2}, Le8/c;->b(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 1538
    .line 1539
    .line 1540
    move-result-object v4

    .line 1541
    invoke-static {v2}, Lh/Hchat/utils/KavaReflector;->declaredMethods(Ljava/lang/Class;)Ljava/util/List;

    .line 1542
    .line 1543
    .line 1544
    move-result-object v5

    .line 1545
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 1546
    .line 1547
    .line 1548
    move-result-object v5

    .line 1549
    :cond_36
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    .line 1550
    .line 1551
    .line 1552
    move-result v6

    .line 1553
    if-eqz v6, :cond_37

    .line 1554
    .line 1555
    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1556
    .line 1557
    .line 1558
    move-result-object v6

    .line 1559
    check-cast v6, Ljava/lang/reflect/Method;

    .line 1560
    .line 1561
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 1562
    .line 1563
    .line 1564
    move-result v7

    .line 1565
    if-nez v7, :cond_36

    .line 1566
    .line 1567
    const-class v7, Landroid/widget/BaseAdapter;

    .line 1568
    .line 1569
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 1570
    .line 1571
    .line 1572
    move-result-object v8

    .line 1573
    invoke-virtual {v7, v8}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 1574
    .line 1575
    .line 1576
    move-result v7

    .line 1577
    if-eqz v7, :cond_36

    .line 1578
    .line 1579
    goto :goto_1b

    .line 1580
    :cond_37
    const/4 v6, 0x0

    .line 1581
    :goto_1b
    if-eqz v4, :cond_35

    .line 1582
    .line 1583
    if-nez v6, :cond_38

    .line 1584
    .line 1585
    goto :goto_1a

    .line 1586
    :cond_38
    const-class v5, Landroid/util/SparseArray;

    .line 1587
    .line 1588
    invoke-static {v2, v5}, Le8/c;->d(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 1589
    .line 1590
    .line 1591
    move-result v5

    .line 1592
    if-nez v5, :cond_39

    .line 1593
    .line 1594
    goto :goto_1a

    .line 1595
    :cond_39
    const-class v5, Landroid/content/Context;

    .line 1596
    .line 1597
    invoke-static {v2, v5}, Le8/c;->d(Ljava/lang/Class;Ljava/lang/Class;)Z

    .line 1598
    .line 1599
    .line 1600
    move-result v5

    .line 1601
    if-nez v5, :cond_3a

    .line 1602
    .line 1603
    goto :goto_1a

    .line 1604
    :cond_3a
    iput-object v2, v1, Le8/c;->w:Ljava/lang/Class;

    .line 1605
    .line 1606
    iput-object v4, v1, Le8/c;->y:Ljava/lang/reflect/Method;

    .line 1607
    .line 1608
    iput-object v6, v1, Le8/c;->x:Ljava/lang/reflect/Method;

    .line 1609
    .line 1610
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1611
    .line 1612
    .line 1613
    invoke-virtual {v6}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;
    :try_end_14
    .catchall {:try_start_14 .. :try_end_14} :catchall_12

    .line 1614
    .line 1615
    .line 1616
    goto :goto_1c

    .line 1617
    :catchall_13
    move-exception v0

    .line 1618
    new-instance v2, Ljava/lang/StringBuilder;

    .line 1619
    .line 1620
    const-string v3, "[Hchat:SettingsDex] PlusSubMenuHelper \u5931\u8d25: "

    .line 1621
    .line 1622
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1623
    .line 1624
    .line 1625
    invoke-static {v0, v2, v0}, Lbc/e;->s(Ljava/lang/Throwable;Ljava/lang/StringBuilder;Ljava/lang/Throwable;)V

    .line 1626
    .line 1627
    .line 1628
    :cond_3b
    :goto_1c
    return-void
.end method

.method public final n()V
    .locals 3

    .line 1
    iget-object v0, p0, Le8/c;->c:Landroid/content/SharedPreferences;

    .line 2
    .line 3
    if-eqz v0, :cond_1

    .line 4
    .line 5
    iget-object v1, p0, Le8/c;->d:Ljava/lang/String;

    .line 6
    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    goto/16 :goto_0

    .line 16
    .line 17
    :cond_0
    :try_start_0
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->clear()Landroid/content/SharedPreferences$Editor;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    const-string v2, "cache.key"

    .line 26
    .line 27
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    const-string v1, "preferenceClass"

    .line 31
    .line 32
    iget-object v2, p0, Le8/c;->e:Ljava/lang/Class;

    .line 33
    .line 34
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 35
    .line 36
    .line 37
    const-string v1, "iconPreferenceClass"

    .line 38
    .line 39
    iget-object v2, p0, Le8/c;->f:Ljava/lang/Class;

    .line 40
    .line 41
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 42
    .line 43
    .line 44
    const-string v1, "methodSetKey"

    .line 45
    .line 46
    iget-object v2, p0, Le8/c;->g:Ljava/lang/reflect/Method;

    .line 47
    .line 48
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 49
    .line 50
    .line 51
    const-string v1, "methodSetTitle"

    .line 52
    .line 53
    iget-object v2, p0, Le8/c;->h:Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 56
    .line 57
    .line 58
    const-string v1, "methodGetKey"

    .line 59
    .line 60
    iget-object v2, p0, Le8/c;->i:Ljava/lang/reflect/Method;

    .line 61
    .line 62
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 63
    .line 64
    .line 65
    const-string v1, "methodAddPref"

    .line 66
    .line 67
    iget-object v2, p0, Le8/c;->j:Ljava/lang/reflect/Method;

    .line 68
    .line 69
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 70
    .line 71
    .line 72
    const-string v1, "settingItemClassesProviderClass"

    .line 73
    .line 74
    iget-object v2, p0, Le8/c;->k:Ljava/lang/Class;

    .line 75
    .line 76
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 77
    .line 78
    .line 79
    const-string v1, "baseSettingItemClass"

    .line 80
    .line 81
    iget-object v2, p0, Le8/c;->l:Ljava/lang/Class;

    .line 82
    .line 83
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 84
    .line 85
    .line 86
    const-string v1, "settingLocationClass"

    .line 87
    .line 88
    iget-object v2, p0, Le8/c;->m:Ljava/lang/Class;

    .line 89
    .line 90
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 91
    .line 92
    .line 93
    const-string v1, "settingGroupMainClass"

    .line 94
    .line 95
    iget-object v2, p0, Le8/c;->n:Ljava/lang/Class;

    .line 96
    .line 97
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 98
    .line 99
    .line 100
    const-string v1, "settingGroupAccountInfoClass"

    .line 101
    .line 102
    iget-object v2, p0, Le8/c;->o:Ljava/lang/Class;

    .line 103
    .line 104
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 105
    .line 106
    .line 107
    const-string v1, "settingGroupPersonalInfoClass"

    .line 108
    .line 109
    iget-object v2, p0, Le8/c;->p:Ljava/lang/Class;

    .line 110
    .line 111
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 112
    .line 113
    .line 114
    const-string v1, "settingAdditionHeaderSearchClass"

    .line 115
    .line 116
    iget-object v2, p0, Le8/c;->q:Ljava/lang/Class;

    .line 117
    .line 118
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 119
    .line 120
    .line 121
    const-string v1, "baseSettingPrefUIClass"

    .line 122
    .line 123
    iget-object v2, p0, Le8/c;->r:Ljava/lang/Class;

    .line 124
    .line 125
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 126
    .line 127
    .line 128
    const-string v1, "baseSettingUIClass"

    .line 129
    .line 130
    iget-object v2, p0, Le8/c;->s:Ljava/lang/Class;

    .line 131
    .line 132
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 133
    .line 134
    .line 135
    const-string v1, "mainSettingsUIClass"

    .line 136
    .line 137
    iget-object v2, p0, Le8/c;->t:Ljava/lang/Class;

    .line 138
    .line 139
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 140
    .line 141
    .line 142
    const-string v1, "methodAccountInfoReturns1"

    .line 143
    .line 144
    iget-object v2, p0, Le8/c;->u:Ljava/lang/reflect/Method;

    .line 145
    .line 146
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 147
    .line 148
    .line 149
    const-string v1, "methodAccountInfoSettingKey"

    .line 150
    .line 151
    iget-object v2, p0, Le8/c;->v:Ljava/lang/reflect/Method;

    .line 152
    .line 153
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 154
    .line 155
    .line 156
    const-string v1, "plusSubMenuHelperClass"

    .line 157
    .line 158
    iget-object v2, p0, Le8/c;->w:Ljava/lang/Class;

    .line 159
    .line 160
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 161
    .line 162
    .line 163
    const-string v1, "plusSubMenuAdapterMethod"

    .line 164
    .line 165
    iget-object v2, p0, Le8/c;->x:Ljava/lang/reflect/Method;

    .line 166
    .line 167
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 168
    .line 169
    .line 170
    const-string v1, "plusSubMenuOnItemClickMethod"

    .line 171
    .line 172
    iget-object v2, p0, Le8/c;->y:Ljava/lang/reflect/Method;

    .line 173
    .line 174
    invoke-static {v0, v1, v2}, Le8/c;->j(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 175
    .line 176
    .line 177
    const-string v1, "settingsUIClass"

    .line 178
    .line 179
    iget-object v2, p0, Le8/c;->z:Ljava/lang/Class;

    .line 180
    .line 181
    invoke-static {v0, v1, v2}, Le8/c;->i(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;Ljava/lang/Class;)V

    .line 182
    .line 183
    .line 184
    const-string v1, "cache.complete"

    .line 185
    .line 186
    const/4 v2, 0x1

    .line 187
    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 188
    .line 189
    .line 190
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 191
    .line 192
    .line 193
    return-void

    .line 194
    :catchall_0
    move-exception v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 196
    .line 197
    .line 198
    :cond_1
    :goto_0
    return-void
.end method
