.class public final Lbsh/security/MainSecurityGuard;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lbsh/security/MainSecurityGuard$BasicSecurityGuard;
    }
.end annotation


# instance fields
.field private final securityGuards:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lbsh/security/SecurityGuard;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Ljava/util/HashSet;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 10
    .line 11
    new-instance v1, Lbsh/security/MainSecurityGuard$BasicSecurityGuard;

    .line 12
    .line 13
    const/4 v2, 0x0

    .line 14
    invoke-direct {v1, p0, v2}, Lbsh/security/MainSecurityGuard$BasicSecurityGuard;-><init>(Lbsh/security/MainSecurityGuard;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method private final canInvokeMethodImpl(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2, p3}, Lbsh/security/SecurityGuard;->canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, p2, p3}, Lbsh/security/SecurityError;->cantInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1

    .line 31
    :cond_1
    return-void
.end method

.method private final canInvokeMethodImplToReflectionCanConstruct(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    instance-of v0, p1, Ljava/lang/Class;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "newInstance"

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    check-cast p1, Ljava/lang/Class;

    .line 15
    .line 16
    new-array p2, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lbsh/security/MainSecurityGuard;->canConstruct(Ljava/lang/Class;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    .line 20
    .line 21
    return-void

    .line 22
    :catch_0
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->reflectCantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    throw p1

    .line 27
    :cond_0
    instance-of v0, p1, Ljava/lang/reflect/Constructor;

    .line 28
    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p2

    .line 35
    if-eqz p2, :cond_2

    .line 36
    .line 37
    check-cast p1, Ljava/lang/reflect/Constructor;

    .line 38
    .line 39
    invoke-virtual {p1}, Ljava/lang/reflect/Constructor;->getDeclaringClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    array-length p2, p3

    .line 44
    const/4 v0, 0x1

    .line 45
    if-ne p2, v0, :cond_1

    .line 46
    .line 47
    aget-object p2, p3, v1

    .line 48
    .line 49
    instance-of v0, p2, [Ljava/lang/Object;

    .line 50
    .line 51
    if-eqz v0, :cond_1

    .line 52
    .line 53
    move-object p3, p2

    .line 54
    check-cast p3, [Ljava/lang/Object;

    .line 55
    .line 56
    :cond_1
    :try_start_1
    invoke-virtual {p0, p1, p3}, Lbsh/security/MainSecurityGuard;->canConstruct(Ljava/lang/Class;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lbsh/security/SecurityError; {:try_start_1 .. :try_end_1} :catch_1

    .line 57
    .line 58
    .line 59
    return-void

    .line 60
    :catch_1
    invoke-static {p1, p3}, Lbsh/security/SecurityError;->reflectCantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 61
    .line 62
    .line 63
    move-result-object p1

    .line 64
    throw p1

    .line 65
    :cond_2
    return-void
.end method

.method private final canInvokeMethodImplToReflectionCanGetField(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 1

    .line 1
    const-string v0, "get"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    array-length p2, p3

    .line 10
    const/4 v0, 0x1

    .line 11
    if-ne p2, v0, :cond_2

    .line 12
    .line 13
    instance-of p2, p1, Ljava/lang/reflect/Field;

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    check-cast p1, Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    invoke-static {p1}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :try_start_0
    invoke-virtual {p0, p1, p2}, Lbsh/security/MainSecurityGuard;->canGetStaticField(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :catch_0
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->reflectCantGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    throw p1

    .line 43
    :cond_1
    const/4 p1, 0x0

    .line 44
    aget-object p1, p3, p1

    .line 45
    .line 46
    :try_start_1
    invoke-virtual {p0, p1, p2}, Lbsh/security/MainSecurityGuard;->canGetField(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_1
    .catch Lbsh/security/SecurityError; {:try_start_1 .. :try_end_1} :catch_1

    .line 47
    .line 48
    .line 49
    return-void

    .line 50
    :catch_1
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->reflectCantGetField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    throw p1

    .line 55
    :cond_2
    :goto_0
    return-void
.end method

.method private final canInvokeMethodImplToReflectionCanInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 3

    .line 1
    const-string v0, "invoke"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_3

    .line 8
    .line 9
    array-length p2, p3

    .line 10
    if-eqz p2, :cond_3

    .line 11
    .line 12
    instance-of p2, p1, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    if-nez p2, :cond_0

    .line 15
    .line 16
    goto :goto_1

    .line 17
    :cond_0
    check-cast p1, Ljava/lang/reflect/Method;

    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p2

    .line 23
    array-length v0, p3

    .line 24
    const/4 v1, 0x2

    .line 25
    const/4 v2, 0x1

    .line 26
    if-ne v0, v1, :cond_1

    .line 27
    .line 28
    aget-object v0, p3, v2

    .line 29
    .line 30
    instance-of v1, v0, [Ljava/lang/Object;

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    check-cast v0, [Ljava/lang/Object;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    array-length v0, p3

    .line 38
    invoke-static {p3, v2, v0}, Ljava/util/Arrays;->copyOfRange([Ljava/lang/Object;II)[Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    :goto_0
    invoke-static {p1}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 43
    .line 44
    .line 45
    move-result v1

    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p1

    .line 52
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lbsh/security/MainSecurityGuard;->canInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 53
    .line 54
    .line 55
    return-void

    .line 56
    :catch_0
    invoke-static {p1, p2, v0}, Lbsh/security/SecurityError;->reflectCantInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    throw p1

    .line 61
    :cond_2
    const/4 p1, 0x0

    .line 62
    aget-object p1, p3, p1

    .line 63
    .line 64
    :try_start_1
    invoke-virtual {p0, p1, p2, v0}, Lbsh/security/MainSecurityGuard;->canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_1
    .catch Lbsh/security/SecurityError; {:try_start_1 .. :try_end_1} :catch_1

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :catch_1
    invoke-static {p1, p2, v0}, Lbsh/security/SecurityError;->reflectCantInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 69
    .line 70
    .line 71
    move-result-object p1

    .line 72
    throw p1

    .line 73
    :cond_3
    :goto_1
    return-void
.end method

.method private final canInvokeMethodImplToReflectionCanSetField(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-string v0, "set"

    .line 2
    .line 3
    invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result p2

    .line 7
    if-eqz p2, :cond_2

    .line 8
    .line 9
    array-length p2, p3

    .line 10
    const/4 v0, 0x2

    .line 11
    if-ne p2, v0, :cond_2

    .line 12
    .line 13
    instance-of p2, p1, Ljava/lang/reflect/Field;

    .line 14
    .line 15
    if-nez p2, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    check-cast p1, Ljava/lang/reflect/Field;

    .line 19
    .line 20
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getName()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object p2

    .line 24
    const/4 v0, 0x1

    .line 25
    aget-object v0, p3, v0

    .line 26
    .line 27
    invoke-static {p1}, Lbsh/Reflect;->isStatic(Ljava/lang/reflect/Member;)Z

    .line 28
    .line 29
    .line 30
    move-result v1

    .line 31
    if-eqz v1, :cond_1

    .line 32
    .line 33
    invoke-virtual {p1}, Ljava/lang/reflect/Field;->getDeclaringClass()Ljava/lang/Class;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    :try_start_0
    invoke-virtual {p0, p1, p2, v0}, Lbsh/security/MainSecurityGuard;->canSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :catch_0
    invoke-static {p1, p2, v0}, Lbsh/security/SecurityError;->reflectCantSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    throw p1

    .line 46
    :cond_1
    const/4 p1, 0x0

    .line 47
    aget-object p1, p3, p1

    .line 48
    .line 49
    :try_start_1
    invoke-virtual {p0, p1, p2, v0}, Lbsh/security/MainSecurityGuard;->canSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    :try_end_1
    .catch Lbsh/security/SecurityError; {:try_start_1 .. :try_end_1} :catch_1

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :catch_1
    invoke-static {p1, p2, v0}, Lbsh/security/SecurityError;->reflectCantSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    throw p1

    .line 58
    :cond_2
    :goto_0
    return-void
.end method

.method private canInvokeStaticMethodImpl(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2, p3}, Lbsh/security/SecurityGuard;->canInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, p2, p3}, Lbsh/security/SecurityError;->cantInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1

    .line 31
    :cond_1
    return-void
.end method

.method private canInvokeStaticMethodImplToReflectionCanGetArrayLength(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "length"

    .line 2
    .line 3
    const-string v1, "getLength"

    .line 4
    .line 5
    invoke-virtual {p2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    if-eqz p2, :cond_1

    .line 10
    .line 11
    array-length p2, p3

    .line 12
    const/4 v1, 0x1

    .line 13
    if-ne p2, v1, :cond_1

    .line 14
    .line 15
    const-class p2, Ljava/lang/reflect/Array;

    .line 16
    .line 17
    invoke-virtual {p1, p2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    const/4 p1, 0x0

    .line 25
    aget-object p1, p3, p1

    .line 26
    .line 27
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lbsh/security/MainSecurityGuard;->canGetField(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catch Lbsh/security/SecurityError; {:try_start_0 .. :try_end_0} :catch_0

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :catch_0
    invoke-static {p1, v0}, Lbsh/security/SecurityError;->reflectCantGetField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    throw p1

    .line 36
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public add(Lbsh/security/SecurityGuard;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public canConstruct(Ljava/lang/Class;[Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p2}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Lbsh/security/SecurityGuard;->canConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->cantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1

    .line 35
    :cond_1
    return-void
.end method

.method public canExtends(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lbsh/security/SecurityGuard;->canExtends(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1}, Lbsh/security/SecurityError;->cantExtends(Ljava/lang/Class;)Lbsh/security/SecurityError;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1

    .line 31
    :cond_1
    return-void
.end method

.method public canGetField(Ljava/lang/Object;Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2}, Lbsh/security/SecurityGuard;->canGetField(Ljava/lang/Object;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->cantGetField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1

    .line 31
    :cond_1
    return-void
.end method

.method public canGetStaticField(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 18
    .line 19
    invoke-interface {v1, p1, p2}, Lbsh/security/SecurityGuard;->canGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->cantGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Lbsh/security/SecurityError;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1

    .line 31
    :cond_1
    return-void
.end method

.method public canImplements(Ljava/lang/Class;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 18
    .line 19
    invoke-interface {v1, p1}, Lbsh/security/SecurityGuard;->canImplements(Ljava/lang/Class;)Z

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    if-eqz v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    invoke-static {p1}, Lbsh/security/SecurityError;->cantImplements(Ljava/lang/Class;)Lbsh/security/SecurityError;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    throw p1

    .line 31
    :cond_1
    return-void
.end method

.method public canInvokeLocalMethod(Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p2}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2}, Lbsh/security/SecurityGuard;->canInvokeLocalMethod(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p1, p2}, Lbsh/security/SecurityError;->cantInvokeLocalMethod(Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1

    .line 35
    :cond_1
    return-void
.end method

.method public canInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lbsh/security/MainSecurityGuard;->canInvokeMethodImpl(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3}, Lbsh/security/MainSecurityGuard;->canInvokeMethodImplToReflectionCanSetField(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, p1, p2, p3}, Lbsh/security/MainSecurityGuard;->canInvokeMethodImplToReflectionCanGetField(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1, p2, p3}, Lbsh/security/MainSecurityGuard;->canInvokeMethodImplToReflectionCanConstruct(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, p1, p2, p3}, Lbsh/security/MainSecurityGuard;->canInvokeMethodImplToReflectionCanInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    return-void
.end method

.method public canInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    invoke-direct {p0, p1, p2, p3}, Lbsh/security/MainSecurityGuard;->canInvokeStaticMethodImpl(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p2, p3}, Lbsh/security/MainSecurityGuard;->canInvokeStaticMethodImplToReflectionCanGetArrayLength(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public canSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2, p3}, Lbsh/security/SecurityGuard;->canSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p1, p2, p3}, Lbsh/security/SecurityError;->cantSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1

    .line 35
    :cond_1
    return-void
.end method

.method public canSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {p3}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p3

    .line 5
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 6
    .line 7
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Lbsh/security/SecurityGuard;

    .line 22
    .line 23
    invoke-interface {v1, p1, p2, p3}, Lbsh/security/SecurityGuard;->canSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-static {p1, p2, p3}, Lbsh/security/SecurityError;->cantSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    throw p1

    .line 35
    :cond_1
    return-void
.end method

.method public remove(Lbsh/security/SecurityGuard;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/security/MainSecurityGuard;->securityGuards:Ljava/util/Set;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    return-void
.end method
