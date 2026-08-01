.class public abstract Lxhss/ᲇᛱᲈᛸ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"


# instance fields
.field public final ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

.field public final ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

.field public final ᛷᛵᛵᲈ:Lxhss/ᛴᛷᛱ;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 11
    .line 12
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 13
    .line 14
    .line 15
    iput-object v1, p0, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛴᛷᛱ;

    .line 16
    .line 17
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 21
    .line 22
    .line 23
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 24
    .line 25
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 26
    .line 27
    .line 28
    iput-object v1, p0, Lxhss/ᲇᛱᲈᛸ;->ᛱᛱᛲᲇ:Lxhss/ᛴᛷᛱ;

    .line 29
    .line 30
    new-instance v0, Lxhss/ᛴᛶᛲᛶ;

    .line 31
    .line 32
    const/4 v1, 0x2

    .line 33
    invoke-direct {v0, v1}, Lxhss/ᛴᛶᛲᛶ;-><init>(I)V

    .line 34
    .line 35
    .line 36
    new-instance v1, Lxhss/ᛴᛷᛱ;

    .line 37
    .line 38
    invoke-direct {v1, v0}, Lxhss/ᛴᛷᛱ;-><init>(Lxhss/ᛱᛳᲇᛶ;)V

    .line 39
    .line 40
    .line 41
    iput-object v1, p0, Lxhss/ᲇᛱᲈᛸ;->ᛳᲁᲇᛸ:Lxhss/ᛴᛷᛱ;

    .line 42
    .line 43
    return-void
.end method

.method public static ᛱᛱᛲᲇ(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-eqz p1, :cond_4

    .line 3
    .line 4
    invoke-static {p1}, Lxhss/ᛲᛱᛲᲀ;->ᛴᛴᛲᛸ(Ljava/lang/CharSequence;)Z

    .line 5
    .line 6
    .line 7
    move-result v1

    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    goto :goto_1

    .line 11
    :cond_0
    if-nez p0, :cond_1

    .line 12
    .line 13
    goto :goto_1

    .line 14
    :cond_1
    sget v1, Lxhss/ᲇᲀᛵᲁ;->ᛷᛵᛵᲈ:I

    .line 15
    .line 16
    invoke-static {p0}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    iget-object v1, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lxhss/ᛸᛵᲇᲈ;

    .line 23
    .line 24
    const/4 v2, 0x2

    .line 25
    iput v2, v1, Lxhss/ᛸᛵᲇᲈ;->ᲇᛴᲇᛵ:I

    .line 26
    .line 27
    invoke-virtual {p0}, Lxhss/ᲇᛵᛲᲁ;->ᛸᛷᲈᲈ()Lxhss/ᛵᛸᲈᛲ;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    invoke-virtual {p0}, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ()V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lxhss/ᛵᛸᲈᛲ;->ᲀᲇᛳᲁ:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {p0}, Lxhss/ᛵᛸᲈᛲ;->ᛳᲁᲇᛸ()Ljava/util/List;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, Lxhss/ᛷᲇᛵᛳ;->ᛱᲈᛳᛴ(Ljava/util/List;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    check-cast p0, Lxhss/ᛸᛴᲁᛸ;

    .line 45
    .line 46
    if-eqz p0, :cond_2

    .line 47
    .line 48
    invoke-virtual {p0}, Lxhss/ᛸᛴᲁᛸ;->ᛱᲈᛳᛴ()Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    goto :goto_0

    .line 53
    :cond_2
    move-object p0, v0

    .line 54
    :goto_0
    if-nez p0, :cond_3

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_3
    return-object p0

    .line 58
    :cond_4
    :goto_1
    return-object v0
.end method

.method public static ᛳᲁᲇᛸ(Lxhss/ᛷᛱᛳᲁ;Lio/github/libxposed/api/XposedInterface$Chain;)Ljava/lang/Object;
    .locals 4

    .line 1
    const-wide v0, -0x11f791b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x11f821b858845L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getArgs()Ljava/util/List;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const-wide v1, -0x11f881b858845L

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    new-instance v1, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    new-instance v0, Lxhss/ᛸᲀᲇᛱ;

    .line 38
    .line 39
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getExecutable()Ljava/lang/reflect/Executable;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-direct {v0, v2, v1, v3}, Lxhss/ᛸᲀᲇᛱ;-><init>(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/reflect/Executable;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lxhss/ᛷᛱᛳᲁ;->ᛳᲁᲇᛸ(Lxhss/ᛸᲀᲇᛱ;)V

    .line 51
    .line 52
    .line 53
    iget-boolean v2, v0, Lxhss/ᛸᲀᲇᛱ;->ᛳᲁᲇᛸ:Z

    .line 54
    .line 55
    if-eqz v2, :cond_0

    .line 56
    .line 57
    iget-object p0, v0, Lxhss/ᛸᲀᲇᛱ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 58
    .line 59
    return-object p0

    .line 60
    :cond_0
    const/4 v0, 0x0

    .line 61
    new-array v0, v0, [Ljava/lang/Object;

    .line 62
    .line 63
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 64
    .line 65
    .line 66
    move-result-object v0

    .line 67
    invoke-interface {p1, v0}, Lio/github/libxposed/api/XposedInterface$Chain;->proceed([Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    new-instance v2, Lxhss/ᛵᛴᛲᛵ;

    .line 72
    .line 73
    invoke-interface {p1}, Lio/github/libxposed/api/XposedInterface$Chain;->getThisObject()Ljava/lang/Object;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    invoke-direct {v2, p1, v1, v0}, Lxhss/ᛵᛴᛲᛵ;-><init>(Ljava/lang/Object;Ljava/util/ArrayList;Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v2}, Lxhss/ᛷᛱᛳᲁ;->ᲀᲇᛳᲁ(Lxhss/ᛵᛴᛲᛵ;)V

    .line 81
    .line 82
    .line 83
    iget-object p0, v2, Lxhss/ᛵᛴᛲᛵ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 84
    .line 85
    return-object p0
.end method

.method public static ᛷᲁᲁ(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 2

    .line 1
    const-wide v0, -0x11f671b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x11f6f1b858845L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    return-void
.end method

.method public static varargs ᛸᛷᲈᲈ(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)V
    .locals 2

    .line 1
    const-wide v0, -0x120b61b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x120c11b858845L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    if-eqz p0, :cond_0

    .line 18
    .line 19
    sget v0, Lxhss/ᲇᲀᛵᲁ;->ᛷᛵᛵᲈ:I

    .line 20
    .line 21
    invoke-static {p0}, Lxhss/ᲀᲈᛵᛸ;->ᲈᛲᛵᲁ(Ljava/lang/Object;)Lxhss/ᲇᛵᛲᲁ;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    iget-object v0, p0, Lxhss/ᲇᛵᛲᲁ;->ᛳᲁᲇᛸ:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, Lxhss/ᛸᛵᲇᲈ;

    .line 28
    .line 29
    const/4 v1, 0x2

    .line 30
    iput v1, v0, Lxhss/ᛸᛵᲇᲈ;->ᲇᛴᲇᛵ:I

    .line 31
    .line 32
    invoke-virtual {p0}, Lxhss/ᲇᛵᛲᲁ;->ᛳᲈᲈᛲ()Lxhss/ᛷᛴᲀᛳ;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    invoke-virtual {p0}, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ()V

    .line 37
    .line 38
    .line 39
    iput-object p1, p0, Lxhss/ᛵᛷᛴᲁ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 40
    .line 41
    invoke-virtual {p0}, Lxhss/ᛷᛴᲀᛳ;->ᛳᲁᲇᛸ()Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    invoke-static {p0}, Lxhss/ᛷᲇᛵᛳ;->ᛱᲈᛳᛴ(Ljava/util/List;)Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    check-cast p0, Lxhss/ᛲᲀᛱ;

    .line 50
    .line 51
    if-eqz p0, :cond_0

    .line 52
    .line 53
    array-length p1, p2

    .line 54
    invoke-static {p2, p1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p1

    .line 58
    invoke-virtual {p0, p1}, Lxhss/ᛲᲀᛱ;->ᛱᲈᛳᛴ([Ljava/lang/Object;)Ljava/lang/Object;

    .line 59
    .line 60
    .line 61
    :cond_0
    return-void
.end method

.method public static ᲈᛳᲀ(Ljava/lang/String;)V
    .locals 2

    .line 1
    const-wide v0, -0x11f5f1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    sget-object v0, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lxhss/ᲇᲁᛱᛸ;->ᛳᛶᛷᲀ(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method


# virtual methods
.method public final ᛷᛴᛷᛱ(Ljava/lang/reflect/Member;Lxhss/ᛲᛳᛳᛲ;)V
    .locals 3

    .line 1
    const-wide v0, -0x11fbf1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    const-wide v0, -0x11fc61b858845L

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-interface {p1}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object v1

    .line 25
    new-instance v2, Lxhss/ᛷᛱᛳᲁ;

    .line 26
    .line 27
    invoke-direct {v2, p2, p0, v0, v1}, Lxhss/ᛷᛱᛳᲁ;-><init>(Lxhss/ᛲᛳᛳᛲ;Lxhss/ᲇᛱᲈᛸ;Ljava/lang/Class;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    const-wide v0, -0x11f951b858845L

    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    const-wide v0, -0x11f9c1b858845L

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    instance-of p2, p1, Ljava/lang/reflect/Method;

    .line 47
    .line 48
    if-eqz p2, :cond_0

    .line 49
    .line 50
    sget-object p2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 56
    .line 57
    .line 58
    move-result-object p2

    .line 59
    check-cast p1, Ljava/lang/reflect/Executable;

    .line 60
    .line 61
    invoke-virtual {p2, p1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 62
    .line 63
    .line 64
    move-result-object p1

    .line 65
    new-instance p2, Lxhss/ᲇᛶᛶᲀ;

    .line 66
    .line 67
    const/4 v0, 0x0

    .line 68
    invoke-direct {p2, p0, v2, v0}, Lxhss/ᲇᛶᛶᲀ;-><init>(Lxhss/ᲇᛱᲈᛸ;Lxhss/ᛷᛱᛳᲁ;I)V

    .line 69
    .line 70
    .line 71
    invoke-interface {p1, p2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 72
    .line 73
    .line 74
    return-void

    .line 75
    :cond_0
    instance-of p2, p1, Ljava/lang/reflect/Constructor;

    .line 76
    .line 77
    if-eqz p2, :cond_1

    .line 78
    .line 79
    sget-object p2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 80
    .line 81
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    invoke-static {}, Lxhss/ᲇᲁᛱᛸ;->ᛷᲁᲁ()Lcom/xingin/xhss/ModuleMain;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    check-cast p1, Ljava/lang/reflect/Executable;

    .line 89
    .line 90
    invoke-virtual {p2, p1}, Lio/github/libxposed/api/XposedModule;->hook(Ljava/lang/reflect/Executable;)Lio/github/libxposed/api/XposedInterface$HookBuilder;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    new-instance p2, Lxhss/ᲇᛶᛶᲀ;

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    invoke-direct {p2, p0, v2, v0}, Lxhss/ᲇᛶᛶᲀ;-><init>(Lxhss/ᲇᛱᲈᛸ;Lxhss/ᛷᛱᛳᲁ;I)V

    .line 98
    .line 99
    .line 100
    invoke-interface {p1, p2}, Lio/github/libxposed/api/XposedInterface$HookBuilder;->intercept(Lio/github/libxposed/api/XposedInterface$Hooker;)Lio/github/libxposed/api/XposedInterface$HookHandle;

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :cond_1
    const-wide v0, -0x11fa51b858845L

    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object p0

    .line 113
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 114
    .line 115
    .line 116
    move-result-object p1

    .line 117
    invoke-virtual {p1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object p0

    .line 125
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    return-void
.end method

.method public final ᛷᛵᛵᲈ()Ljava/lang/ClassLoader;
    .locals 0

    .line 1
    iget-object p0, p0, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ:Lxhss/ᛴᛷᛱ;

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᛴᛷᛱ;->ᛷᛵᛵᲈ()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Ljava/lang/ClassLoader;

    .line 8
    .line 9
    return-object p0
.end method

.method public final ᛸᛲᲀᛵ(Lxhss/ᲇᛴᲇᛴ;Lxhss/ᛷᛴᛲᛲ;)V
    .locals 2

    .line 1
    const-wide v0, -0x1203a1b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    goto :goto_2

    .line 12
    :cond_0
    :try_start_0
    iget-object v0, p1, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 13
    .line 14
    const-string v1, "<init>"

    .line 15
    .line 16
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result v0

    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ()Ljava/lang/ClassLoader;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p1, v0}, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-virtual {p0, p1, p2}, Lxhss/ᲇᛱᲈᛸ;->ᛸᛴᛶᛳ(Ljava/lang/reflect/Member;Lxhss/ᛷᛴᛲᛲ;)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ()Ljava/lang/ClassLoader;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    invoke-static {p1, v0}, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ(Lxhss/ᲇᛴᲇᛴ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 39
    .line 40
    .line 41
    move-result-object p1

    .line 42
    invoke-virtual {p0, p1, p2}, Lxhss/ᲇᛱᲈᛸ;->ᛸᛴᛶᛳ(Ljava/lang/reflect/Member;Lxhss/ᛷᛴᛲᛲ;)V

    .line 43
    .line 44
    .line 45
    :goto_0
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 46
    .line 47
    goto :goto_1

    .line 48
    :catchall_0
    move-exception p0

    .line 49
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 50
    .line 51
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 52
    .line 53
    .line 54
    move-object p0, p1

    .line 55
    :goto_1
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    if-eqz p0, :cond_2

    .line 60
    .line 61
    const-wide p1, -0x120471b858845L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    const-wide v0, -0xfd181b858845L

    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    const-wide v0, -0xfd201b858845L

    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    sget-object p2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 87
    .line 88
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    :cond_2
    :goto_2
    return-void
.end method

.method public final ᛸᛴᛶᛳ(Ljava/lang/reflect/Member;Lxhss/ᛷᛴᛲᛲ;)V
    .locals 2

    .line 1
    const-wide v0, -0x11ff41b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛶᛶᛸᛵ;

    .line 12
    .line 13
    const/4 v1, 0x1

    .line 14
    invoke-direct {v0, p2, p0, v1}, Lxhss/ᛶᛶᛸᛵ;-><init>(Lxhss/ᛷᛴᛲᛲ;Lxhss/ᲇᛱᲈᛸ;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛴᛷᛱ(Ljava/lang/reflect/Member;Lxhss/ᛲᛳᛳᛲ;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final ᛸᛶᲈᛶ()V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lxhss/ᲇᛱᲈᛸ;->ᲇᛴᲇᛵ()V

    .line 2
    .line 3
    .line 4
    sget-object v0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception v0

    .line 8
    new-instance v1, Lxhss/ᲈᛳᛱᲇ;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    move-object v0, v1

    .line 14
    :goto_0
    invoke-static {v0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-wide v2, -0x11f401b858845L

    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-wide v2, -0x11f451b858845L

    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    invoke-static {v2, v3}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object p0

    .line 46
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    const-wide v1, -0xfd181b858845L

    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    const-wide v1, -0xfd201b858845L

    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    invoke-static {v1, v2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    sget-object v1, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 70
    .line 71
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    invoke-static {p0, v0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    :cond_0
    return-void
.end method

.method public final ᲀᲇᛳᲁ(Lxhss/ᲇᛴᲇᛴ;Lxhss/ᛷᛴᛲᛲ;)V
    .locals 2

    .line 1
    const-wide v0, -0x120681b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    :try_start_0
    iget-object v0, p1, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ:Ljava/lang/String;

    .line 12
    .line 13
    const-string v1, "<init>"

    .line 14
    .line 15
    invoke-static {v0, v1}, Lxhss/ᛱᛱᛷᛸ;->ᛷᛵᛵᲈ(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    invoke-virtual {p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    invoke-virtual {p1, v0}, Lxhss/ᲇᛴᲇᛴ;->ᛷᛵᛵᲈ(Ljava/lang/ClassLoader;)Ljava/lang/reflect/Constructor;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ()Ljava/lang/ClassLoader;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-static {p1, v0}, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ(Lxhss/ᲇᛴᲇᛴ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    :goto_0
    invoke-virtual {p0, p1, p2}, Lxhss/ᲇᛱᲈᛸ;->ᲇᛶᛴᲀ(Ljava/lang/reflect/Member;Lxhss/ᛷᛴᛲᛲ;)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lxhss/ᛵᛷᲈᛶ;->ᛷᛵᛵᲈ:Lxhss/ᛵᛷᲈᛶ;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    new-instance p1, Lxhss/ᲈᛳᛱᲇ;

    .line 46
    .line 47
    invoke-direct {p1, p0}, Lxhss/ᲈᛳᛱᲇ;-><init>(Ljava/lang/Throwable;)V

    .line 48
    .line 49
    .line 50
    move-object p0, p1

    .line 51
    :goto_1
    invoke-static {p0}, Lxhss/ᛲᛲᛷ;->ᛷᛵᛵᲈ(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 52
    .line 53
    .line 54
    move-result-object p0

    .line 55
    if-eqz p0, :cond_1

    .line 56
    .line 57
    const-wide p1, -0x120751b858845L

    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    invoke-static {p1, p2}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    const-wide v0, -0xfd181b858845L

    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 72
    .line 73
    .line 74
    const-wide v0, -0xfd201b858845L

    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    sget-object p2, Lxhss/ᲇᲁᛱᛸ;->ᛷᛵᛵᲈ:Lxhss/ᲇᲁᛱᛸ;

    .line 83
    .line 84
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p0}, Lxhss/ᲇᲁᛱᛸ;->ᲁᛲᛴᛴ(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 88
    .line 89
    .line 90
    :cond_1
    return-void
.end method

.method public abstract ᲇᛴᲇᛵ()V
.end method

.method public final ᲇᛶᛴᲀ(Ljava/lang/reflect/Member;Lxhss/ᛷᛴᛲᛲ;)V
    .locals 2

    .line 1
    const-wide v0, -0x120011b858845L

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Lxhss/ᛸᛶᛳᛷ;->ᛸᛲᲀᛵ(J)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    new-instance v0, Lxhss/ᛶᛶᛸᛵ;

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-direct {v0, p2, p0, v1}, Lxhss/ᛶᛶᛸᛵ;-><init>(Lxhss/ᛷᛴᛲᛲ;Lxhss/ᲇᛱᲈᛸ;I)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p1, v0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛴᛷᛱ(Ljava/lang/reflect/Member;Lxhss/ᛲᛳᛳᛲ;)V

    .line 18
    .line 19
    .line 20
    :cond_0
    return-void
.end method

.method public final ᲇᛸᛳᲁ(Lxhss/ᲇᛴᲇᛴ;)Ljava/lang/reflect/Method;
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0}, Lxhss/ᲇᛱᲈᛸ;->ᛷᛵᛵᲈ()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-static {p1, p0}, Lxhss/ᲇᛴᲇᛴ;->ᛱᛱᛲᲇ(Lxhss/ᲇᛴᲇᛴ;Ljava/lang/ClassLoader;)Ljava/lang/reflect/Method;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return-object p0
.end method
