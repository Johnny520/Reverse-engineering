.class public final Lxq0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# static fields
.field public static final α:Lxq0;

.field public static final β:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lxq0;

    .line 2
    .line 3
    invoke-direct {v0}, Lxq0;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lxq0;->α:Lxq0;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic α(Ljava/lang/String;Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lxq0;->δ(Ljava/lang/String;Ljava/lang/reflect/Method;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static final δ(Ljava/lang/String;Ljava/lang/reflect/Method;)Z
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-static {p1, p0}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method


# virtual methods
.method public final β(Ljava/lang/Class;Lm01;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Lm01;",
            ")",
            "Ljava/util/Set<",
            "Ll01;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredConstructors()[Ljava/lang/reflect/Constructor;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    new-instance p1, Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    invoke-direct {p1}, Ljava/util/LinkedHashSet;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-interface {p0}, Lss1;->iterator()Ljava/util/Iterator;

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
    move-result v0

    .line 31
    if-eqz v0, :cond_0

    .line 32
    .line 33
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    check-cast v0, Ljava/lang/reflect/Constructor;

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 41
    .line 42
    .line 43
    sget-object v1, Lxq0;->α:Lxq0;

    .line 44
    .line 45
    invoke-virtual {v1, v0, p2}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-interface {p1, v0}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    return-object p1
.end method

.method public final γ(Ljava/lang/Class;Ljava/lang/String;Lm01;)Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Lm01;",
            ")",
            "Ljava/util/Set<",
            "Ll01;",
            ">;"
        }
    .end annotation

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getDeclaredMethods()[Ljava/lang/reflect/Method;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lg7;->Θ([Ljava/lang/Object;)Lss1;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance p1, Lyh0;

    .line 22
    .line 23
    const/4 v0, 0x2

    .line 24
    invoke-direct {p1, p2, v0}, Lyh0;-><init>(Ljava/lang/String;I)V

    .line 25
    .line 26
    .line 27
    new-instance p2, Ly30;

    .line 28
    .line 29
    const/4 v0, 0x1

    .line 30
    invoke-direct {p2, p0, v0, p1}, Ly30;-><init>(Lss1;ZLa80;)V

    .line 31
    .line 32
    .line 33
    new-instance p0, Ljava/util/LinkedHashSet;

    .line 34
    .line 35
    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 36
    .line 37
    .line 38
    new-instance p1, Lx30;

    .line 39
    .line 40
    invoke-direct {p1, p2}, Lx30;-><init>(Ly30;)V

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {p1}, Lx30;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result p2

    .line 47
    if-eqz p2, :cond_0

    .line 48
    .line 49
    invoke-virtual {p1}, Lx30;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object p2

    .line 53
    check-cast p2, Ljava/lang/reflect/Method;

    .line 54
    .line 55
    invoke-virtual {p2, v0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 56
    .line 57
    .line 58
    sget-object v1, Lxq0;->α:Lxq0;

    .line 59
    .line 60
    invoke-virtual {v1, p2, p3}, Lxq0;->ε(Ljava/lang/reflect/Member;Lm01;)Ll01;

    .line 61
    .line 62
    .line 63
    move-result-object p2

    .line 64
    invoke-interface {p0, p2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_0
    return-object p0
.end method

.method public final ε(Ljava/lang/reflect/Member;Lm01;)Ll01;
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    instance-of p0, p1, Ljava/lang/reflect/Executable;

    .line 8
    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    move-object p0, p1

    .line 12
    check-cast p0, Ljava/lang/reflect/Executable;

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    if-eqz p0, :cond_1

    .line 17
    .line 18
    new-instance p1, Ll01;

    .line 19
    .line 20
    sget-object v0, Lyq0;->α:Lyq0;

    .line 21
    .line 22
    invoke-virtual {v0, p0, p2}, Lyq0;->β(Ljava/lang/reflect/Executable;Lm01;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-direct {p1, p0}, Ll01;-><init>(Lio/github/libxposed/api/XposedInterface$HookHandle;)V

    .line 27
    .line 28
    .line 29
    return-object p1

    .line 30
    :cond_1
    const-string p0, "Only methods and constructors can be hooked: "

    .line 31
    .line 32
    invoke-static {p1, p0}, Lγ;->μ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    const/4 p0, 0x0

    .line 36
    return-object p0
.end method

.method public final ζ(Ljava/lang/reflect/Member;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    instance-of p0, p1, Ljava/lang/reflect/Method;

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    move-object p0, p1

    .line 9
    check-cast p0, Ljava/lang/reflect/Method;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    :goto_0
    if-eqz p0, :cond_2

    .line 14
    .line 15
    sget-object p1, Lyq0;->α:Lyq0;

    .line 16
    .line 17
    if-nez p3, :cond_1

    .line 18
    .line 19
    const/4 p3, 0x0

    .line 20
    new-array p3, p3, [Ljava/lang/Object;

    .line 21
    .line 22
    :cond_1
    invoke-virtual {p1, p0, p2, p3}, Lyq0;->γ(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0

    .line 27
    :cond_2
    const-string p0, "Original invocation only supports Method: "

    .line 28
    .line 29
    invoke-static {p1, p0}, Lγ;->μ(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const/4 p0, 0x0

    .line 33
    return-object p0
.end method

.method public final η(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lyq0;->α:Lyq0;

    .line 5
    .line 6
    const-string v0, "DYHelper"

    .line 7
    .line 8
    invoke-virtual {p0, v0, p1}, Lyq0;->δ(Ljava/lang/String;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-void
.end method

.method public final θ(Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    sget-object p0, Lyq0;->α:Lyq0;

    .line 5
    .line 6
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v0

    .line 20
    :cond_0
    const-string v1, "DYHelper"

    .line 21
    .line 22
    invoke-virtual {p0, v1, v0, p1}, Lyq0;->ε(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method
