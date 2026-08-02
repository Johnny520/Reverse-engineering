.class public final Ldc3;
.super Lt70;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"

# interfaces
.implements Lw70;


# static fields
.field public static final d:Ldc3;

.field public static final e:Ljava/lang/String;

.field public static final f:Lhx2;

.field public static final g:Lhx2;

.field public static final h:Lhx2;

.field public static final i:Lhx2;

.field public static final j:Lhx2;

.field public static final k:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldc3;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Lvj;-><init>(Z)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ldc3;->d:Ldc3;

    .line 8
    .line 9
    const-string v0, "VoiceSend"

    .line 10
    .line 11
    sput-object v0, Ldc3;->e:Ljava/lang/String;

    .line 12
    .line 13
    new-instance v0, Ly63;

    .line 14
    .line 15
    invoke-direct {v0, v1}, Ly63;-><init>(I)V

    .line 16
    .line 17
    .line 18
    new-instance v1, Lhx2;

    .line 19
    .line 20
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Ldc3;->f:Lhx2;

    .line 24
    .line 25
    new-instance v0, Ly63;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    invoke-direct {v0, v1}, Ly63;-><init>(I)V

    .line 29
    .line 30
    .line 31
    new-instance v1, Lhx2;

    .line 32
    .line 33
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 34
    .line 35
    .line 36
    sput-object v1, Ldc3;->g:Lhx2;

    .line 37
    .line 38
    new-instance v0, Ly63;

    .line 39
    .line 40
    const/4 v1, 0x3

    .line 41
    invoke-direct {v0, v1}, Ly63;-><init>(I)V

    .line 42
    .line 43
    .line 44
    new-instance v1, Lhx2;

    .line 45
    .line 46
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 47
    .line 48
    .line 49
    sput-object v1, Ldc3;->h:Lhx2;

    .line 50
    .line 51
    new-instance v0, Ly63;

    .line 52
    .line 53
    const/4 v1, 0x4

    .line 54
    invoke-direct {v0, v1}, Ly63;-><init>(I)V

    .line 55
    .line 56
    .line 57
    new-instance v1, Lhx2;

    .line 58
    .line 59
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 60
    .line 61
    .line 62
    sput-object v1, Ldc3;->i:Lhx2;

    .line 63
    .line 64
    new-instance v0, Ly63;

    .line 65
    .line 66
    const/4 v1, 0x5

    .line 67
    invoke-direct {v0, v1}, Ly63;-><init>(I)V

    .line 68
    .line 69
    .line 70
    new-instance v1, Lhx2;

    .line 71
    .line 72
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 73
    .line 74
    .line 75
    sput-object v1, Ldc3;->j:Lhx2;

    .line 76
    .line 77
    new-instance v0, Ly63;

    .line 78
    .line 79
    const/4 v1, 0x6

    .line 80
    invoke-direct {v0, v1}, Ly63;-><init>(I)V

    .line 81
    .line 82
    .line 83
    new-instance v1, Lhx2;

    .line 84
    .line 85
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 86
    .line 87
    .line 88
    sput-object v1, Ldc3;->k:Lhx2;

    .line 89
    .line 90
    return-void
.end method

.method public static j(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    sget-object v0, Ldc3;->h:Lhx2;

    .line 2
    .line 3
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    check-cast v1, Ljava/lang/reflect/Method;

    .line 8
    .line 9
    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getModifiers()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    if-eqz v1, :cond_0

    .line 19
    .line 20
    move-object v1, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    sget-object v1, Lhp2;->d:Lhp2;

    .line 23
    .line 24
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Ljava/lang/reflect/Method;

    .line 29
    .line 30
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getDeclaringClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    invoke-static {v3}, Lhp2;->j(Ljava/lang/Class;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    :goto_0
    invoke-virtual {v0}, Lhx2;->getValue()Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    check-cast v0, Ljava/lang/reflect/Method;

    .line 49
    .line 50
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 51
    .line 52
    filled-new-array {v2, p0, v3}, [Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    invoke-virtual {v0, v1, p0}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    instance-of v0, p0, Ljava/lang/String;

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    .line 64
    check-cast p0, Ljava/lang/String;

    .line 65
    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move-object p0, v2

    .line 68
    :goto_1
    if-eqz p0, :cond_2

    .line 69
    .line 70
    return-object p0

    .line 71
    :cond_2
    const-string p0, "VoiceLogic returned an empty AMR path"

    .line 72
    .line 73
    invoke-static {p0}, Ls;->l(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    return-object v2
.end method

.method public static k(Ljava/lang/String;I)Z
    .locals 9

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    sget-object v2, Ldc3;->g:Lhx2;

    .line 7
    .line 8
    invoke-virtual {v2}, Lhx2;->getValue()Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v3

    .line 12
    check-cast v3, Ljava/lang/reflect/Method;

    .line 13
    .line 14
    invoke-virtual {v3}, Ljava/lang/reflect/Method;->getParameterCount()I

    .line 15
    .line 16
    .line 17
    move-result v3

    .line 18
    const/4 v4, 0x3

    .line 19
    const/4 v5, 0x2

    .line 20
    const/4 v6, 0x1

    .line 21
    const/4 v7, 0x0

    .line 22
    const/4 v8, 0x4

    .line 23
    if-ne v3, v8, :cond_0

    .line 24
    .line 25
    new-array v3, v8, [Ljava/lang/Object;

    .line 26
    .line 27
    aput-object p0, v3, v0

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    aput-object p0, v3, v6

    .line 34
    .line 35
    aput-object v1, v3, v5

    .line 36
    .line 37
    aput-object v7, v3, v4

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    new-array v3, v4, [Ljava/lang/Object;

    .line 41
    .line 42
    aput-object p0, v3, v0

    .line 43
    .line 44
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    aput-object p0, v3, v6

    .line 49
    .line 50
    aput-object v1, v3, v5

    .line 51
    .line 52
    :goto_0
    invoke-virtual {v2}, Lhx2;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    check-cast p0, Ljava/lang/reflect/Method;

    .line 57
    .line 58
    array-length p1, v3

    .line 59
    invoke-static {v3, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    invoke-virtual {p0, v7, p1}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    instance-of p1, p0, Ljava/lang/Boolean;

    .line 68
    .line 69
    if-eqz p1, :cond_1

    .line 70
    .line 71
    move-object v7, p0

    .line 72
    check-cast v7, Ljava/lang/Boolean;

    .line 73
    .line 74
    :cond_1
    if-eqz v7, :cond_2

    .line 75
    .line 76
    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    return p0

    .line 81
    :cond_2
    return v0
.end method


# virtual methods
.method public final a(Ljava/util/ArrayList;)V
    .locals 0

    .line 1
    sget-object p0, Lzb3;->b:Lzb3;

    .line 2
    .line 3
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    sget-object p0, Lac3;->b:Lac3;

    .line 7
    .line 8
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 9
    .line 10
    .line 11
    sget-object p0, Lxb3;->b:Lxb3;

    .line 12
    .line 13
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    sget-object p0, Lcc3;->b:Lcc3;

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 19
    .line 20
    .line 21
    sget-object p0, Lbc3;->b:Lbc3;

    .line 22
    .line 23
    invoke-virtual {p1, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    return-void
.end method

.method public final d()Ljava/lang/String;
    .locals 0

    .line 1
    sget-object p0, Ldc3;->e:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
