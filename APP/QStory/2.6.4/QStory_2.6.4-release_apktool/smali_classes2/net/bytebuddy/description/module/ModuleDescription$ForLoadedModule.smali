.class public Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;
.super Lnet/bytebuddy/description/module/ModuleDescription$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/module/ModuleDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForLoadedModule"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;,
        Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;,
        Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;
    }
.end annotation


# static fields
.field private static final ACCESS_CONTROLLER:Z

.field protected static final MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

.field protected static final MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

.field protected static final MODULE_DESCRIPTOR_EXPORTS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;

.field protected static final MODULE_DESCRIPTOR_OPENS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;

.field protected static final MODULE_DESCRIPTOR_PROVIDES:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Provides;

.field protected static final MODULE_DESCRIPTOR_REQUIRES:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;

.field protected static final OPTIONAL:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;


# instance fields
.field private final module:Ljava/lang/reflect/AnnotatedElement;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    const-string v1, "java.security.AccessController"

    .line 3
    .line 4
    const/4 v2, 0x0

    .line 5
    invoke-static {v1, v0, v2}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-string v1, "net.bytebuddy.securitymanager"

    .line 9
    .line 10
    const-string v2, "true"

    .line 11
    .line 12
    invoke-static {v1, v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    invoke-static {v1}, Ljava/lang/Boolean;->parseBoolean(Ljava/lang/String;)Z

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    sput-boolean v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->ACCESS_CONTROLLER:Z
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :catch_0
    const/4 v0, 0x1

    .line 24
    :catch_1
    sput-boolean v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->ACCESS_CONTROLLER:Z

    .line 25
    .line 26
    :goto_0
    const-class v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 27
    .line 28
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 29
    .line 30
    .line 31
    move-result-object v0

    .line 32
    invoke-static {v0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    check-cast v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 37
    .line 38
    sput-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 39
    .line 40
    const-class v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 41
    .line 42
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    check-cast v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 51
    .line 52
    sput-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 53
    .line 54
    const-class v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;

    .line 55
    .line 56
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    invoke-static {v0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    check-cast v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;

    .line 65
    .line 66
    sput-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_EXPORTS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;

    .line 67
    .line 68
    const-class v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;

    .line 69
    .line 70
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 71
    .line 72
    .line 73
    move-result-object v0

    .line 74
    invoke-static {v0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 75
    .line 76
    .line 77
    move-result-object v0

    .line 78
    check-cast v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;

    .line 79
    .line 80
    sput-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_OPENS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;

    .line 81
    .line 82
    const-class v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;

    .line 83
    .line 84
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-static {v0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    check-cast v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;

    .line 93
    .line 94
    sput-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_REQUIRES:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;

    .line 95
    .line 96
    const-class v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Provides;

    .line 97
    .line 98
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 99
    .line 100
    .line 101
    move-result-object v0

    .line 102
    invoke-static {v0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 103
    .line 104
    .line 105
    move-result-object v0

    .line 106
    check-cast v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Provides;

    .line 107
    .line 108
    sput-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_PROVIDES:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Provides;

    .line 109
    .line 110
    const-class v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;

    .line 111
    .line 112
    invoke-static {v0}, Lnet/bytebuddy/utility/dispatcher/JavaDispatcher;->of(Ljava/lang/Class;)Ljava/security/PrivilegedAction;

    .line 113
    .line 114
    .line 115
    move-result-object v0

    .line 116
    invoke-static {v0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v0

    .line 120
    check-cast v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;

    .line 121
    .line 122
    sput-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->OPTIONAL:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;

    .line 123
    .line 124
    return-void
.end method

.method public constructor <init>(Ljava/lang/reflect/AnnotatedElement;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/module/ModuleDescription$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 5
    .line 6
    return-void
.end method

.method private static doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/security/PrivilegedAction<",
            "TT;>;)TT;"
        }
    .end annotation

    .annotation runtime Lnet/bytebuddy/build/AccessControllerPlugin$Enhance;
    .end annotation

    .line 1
    sget-boolean v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->ACCESS_CONTROLLER:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-static {p0}, Ljava/security/AccessController;->doPrivileged(Ljava/security/PrivilegedAction;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0

    .line 10
    :cond_0
    invoke-interface {p0}, Ljava/security/PrivilegedAction;->run()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    return-object p0
.end method

.method public static of(Ljava/lang/Object;)Lnet/bytebuddy/description/module/ModuleDescription;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 2
    .line 3
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->isInstance(Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v1

    .line 7
    if-eqz v1, :cond_1

    .line 8
    .line 9
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->isNamed(Ljava/lang/Object;)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    new-instance v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;

    .line 16
    .line 17
    check-cast p0, Ljava/lang/reflect/AnnotatedElement;

    .line 18
    .line 19
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;-><init>(Ljava/lang/reflect/AnnotatedElement;)V

    .line 20
    .line 21
    .line 22
    return-object v0

    .line 23
    :cond_0
    const-string v0, "Not a named module: "

    .line 24
    .line 25
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    const/4 p0, 0x0

    .line 33
    return-object p0

    .line 34
    :cond_1
    const-string v0, "Not a Java module: "

    .line 35
    .line 36
    invoke-static {p0, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object p0

    .line 40
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    goto :goto_0
.end method


# virtual methods
.method public getActualName()Ljava/lang/String;
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->name(Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 4
    .line 5
    invoke-interface {p0}, Ljava/lang/reflect/AnnotatedElement;->getDeclaredAnnotations()[Ljava/lang/annotation/Annotation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-direct {v0, p0}, Lnet/bytebuddy/description/annotation/AnnotationList$ForLoadedAnnotations;-><init>([Ljava/lang/annotation/Annotation;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public getExports()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Exports;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 7
    .line 8
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 11
    .line 12
    invoke-interface {v2, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->exports(Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_EXPORTS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;

    .line 35
    .line 36
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;->modifiers(Ljava/lang/Object;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Enum;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, "SYNTHETIC"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_0

    .line 68
    .line 69
    or-int/lit16 v3, v3, 0x1000

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    const-string v5, "MANDATED"

    .line 73
    .line 74
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    const v4, 0x8000

    .line 81
    .line 82
    .line 83
    or-int/2addr v3, v4

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const-string p0, "Unknown export modifier: "

    .line 86
    .line 87
    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    return-object p0

    .line 96
    :cond_2
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_EXPORTS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;

    .line 97
    .line 98
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;->source(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    new-instance v5, Lnet/bytebuddy/description/module/ModuleDescription$Exports$Simple;

    .line 103
    .line 104
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Exports;->targets(Ljava/lang/Object;)Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v5, v1, v3}, Lnet/bytebuddy/description/module/ModuleDescription$Exports$Simple;-><init>(Ljava/util/Set;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    return-object v0
.end method

.method public getMainClass()Ljava/lang/String;
    .locals 3
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->OPTIONAL:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 8
    .line 9
    invoke-interface {v2, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->mainClass(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-interface {v0, p0, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;->orElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/String;

    .line 23
    .line 24
    return-object p0
.end method

.method public getModifiers()I
    .locals 4

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->modifiers(Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const/4 v0, 0x0

    .line 20
    move v1, v0

    .line 21
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    if-eqz v2, :cond_3

    .line 26
    .line 27
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object v2

    .line 31
    check-cast v2, Ljava/lang/Enum;

    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    const-string v3, "SYNTHETIC"

    .line 38
    .line 39
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v3

    .line 43
    if-eqz v3, :cond_0

    .line 44
    .line 45
    or-int/lit16 v1, v1, 0x1000

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_0
    const-string v3, "MANDATED"

    .line 49
    .line 50
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v3

    .line 54
    if-eqz v3, :cond_1

    .line 55
    .line 56
    const v2, 0x8000

    .line 57
    .line 58
    .line 59
    or-int/2addr v1, v2

    .line 60
    goto :goto_0

    .line 61
    :cond_1
    const-string v3, "OPEN"

    .line 62
    .line 63
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v3

    .line 67
    if-eqz v3, :cond_2

    .line 68
    .line 69
    or-int/lit8 v1, v1, 0x20

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_2
    const-string p0, "Unknown module modifier: "

    .line 73
    .line 74
    invoke-virtual {p0, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    return v0

    .line 82
    :cond_3
    return v1
.end method

.method public getOpens()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Opens;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 7
    .line 8
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 11
    .line 12
    invoke-interface {v2, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->opens(Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_3

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_OPENS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;

    .line 35
    .line 36
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;->modifiers(Ljava/lang/Object;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    if-eqz v4, :cond_2

    .line 50
    .line 51
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object v4

    .line 55
    check-cast v4, Ljava/lang/Enum;

    .line 56
    .line 57
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v4

    .line 61
    const-string v5, "SYNTHETIC"

    .line 62
    .line 63
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    move-result v5

    .line 67
    if-eqz v5, :cond_0

    .line 68
    .line 69
    or-int/lit16 v3, v3, 0x1000

    .line 70
    .line 71
    goto :goto_1

    .line 72
    :cond_0
    const-string v5, "MANDATED"

    .line 73
    .line 74
    invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    .line 76
    .line 77
    move-result v5

    .line 78
    if-eqz v5, :cond_1

    .line 79
    .line 80
    const v4, 0x8000

    .line 81
    .line 82
    .line 83
    or-int/2addr v3, v4

    .line 84
    goto :goto_1

    .line 85
    :cond_1
    const-string p0, "Unknown opens modifier: "

    .line 86
    .line 87
    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 92
    .line 93
    .line 94
    const/4 p0, 0x0

    .line 95
    return-object p0

    .line 96
    :cond_2
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_OPENS:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;

    .line 97
    .line 98
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;->source(Ljava/lang/Object;)Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v4

    .line 102
    new-instance v5, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;

    .line 103
    .line 104
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Opens;->targets(Ljava/lang/Object;)Ljava/util/Set;

    .line 105
    .line 106
    .line 107
    move-result-object v1

    .line 108
    invoke-direct {v5, v1, v3}, Lnet/bytebuddy/description/module/ModuleDescription$Opens$Simple;-><init>(Ljava/util/Set;I)V

    .line 109
    .line 110
    .line 111
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    goto :goto_0

    .line 115
    :cond_3
    return-object v0
.end method

.method public getPackages()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->packages(Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public getProvides()Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Provides;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 7
    .line 8
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 11
    .line 12
    invoke-interface {v2, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->provides(Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_0

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_PROVIDES:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Provides;

    .line 35
    .line 36
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Provides;->service(Ljava/lang/Object;)Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v3

    .line 40
    new-instance v4, Lnet/bytebuddy/description/module/ModuleDescription$Provides$Simple;

    .line 41
    .line 42
    new-instance v5, Ljava/util/LinkedHashSet;

    .line 43
    .line 44
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Provides;->providers(Ljava/lang/Object;)Ljava/util/List;

    .line 45
    .line 46
    .line 47
    move-result-object v1

    .line 48
    invoke-direct {v5, v1}, Ljava/util/LinkedHashSet;-><init>(Ljava/util/Collection;)V

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v5}, Lnet/bytebuddy/description/module/ModuleDescription$Provides$Simple;-><init>(Ljava/util/Set;)V

    .line 52
    .line 53
    .line 54
    invoke-interface {v0, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :cond_0
    return-object v0
.end method

.method public getRequires()Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/description/module/ModuleDescription$Requires;",
            ">;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 7
    .line 8
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 9
    .line 10
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 11
    .line 12
    invoke-interface {v2, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->requires(Ljava/lang/Object;)Ljava/util/Set;

    .line 17
    .line 18
    .line 19
    move-result-object p0

    .line 20
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    if-eqz v1, :cond_5

    .line 29
    .line 30
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_REQUIRES:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;

    .line 35
    .line 36
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;->modifiers(Ljava/lang/Object;)Ljava/util/Set;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    const/4 v3, 0x0

    .line 45
    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 46
    .line 47
    .line 48
    move-result v4

    .line 49
    const/4 v5, 0x0

    .line 50
    if-eqz v4, :cond_4

    .line 51
    .line 52
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ljava/lang/Enum;

    .line 57
    .line 58
    invoke-virtual {v4}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    const-string v6, "SYNTHETIC"

    .line 63
    .line 64
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v6

    .line 68
    if-eqz v6, :cond_0

    .line 69
    .line 70
    or-int/lit16 v3, v3, 0x1000

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const-string v6, "MANDATED"

    .line 74
    .line 75
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v6

    .line 79
    if-eqz v6, :cond_1

    .line 80
    .line 81
    const v4, 0x8000

    .line 82
    .line 83
    .line 84
    or-int/2addr v3, v4

    .line 85
    goto :goto_1

    .line 86
    :cond_1
    const-string v6, "TRANSITIVE"

    .line 87
    .line 88
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 89
    .line 90
    .line 91
    move-result v6

    .line 92
    if-eqz v6, :cond_2

    .line 93
    .line 94
    or-int/lit8 v3, v3, 0x20

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_2
    const-string v6, "STATIC"

    .line 98
    .line 99
    invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    move-result v6

    .line 103
    if-eqz v6, :cond_3

    .line 104
    .line 105
    or-int/lit8 v3, v3, 0x40

    .line 106
    .line 107
    goto :goto_1

    .line 108
    :cond_3
    const-string p0, "Unknown requires modifier: "

    .line 109
    .line 110
    invoke-virtual {p0, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p0

    .line 114
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    return-object v5

    .line 118
    :cond_4
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR_REQUIRES:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;

    .line 119
    .line 120
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;->name(Ljava/lang/Object;)Ljava/lang/String;

    .line 121
    .line 122
    .line 123
    move-result-object v4

    .line 124
    new-instance v6, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;

    .line 125
    .line 126
    sget-object v7, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->OPTIONAL:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;

    .line 127
    .line 128
    invoke-interface {v2, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor$Requires;->rawCompiledVersion(Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    .line 130
    .line 131
    move-result-object v1

    .line 132
    invoke-interface {v7, v1, v5}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;->orElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v1

    .line 136
    check-cast v1, Ljava/lang/String;

    .line 137
    .line 138
    invoke-direct {v6, v1, v3}, Lnet/bytebuddy/description/module/ModuleDescription$Requires$Simple;-><init>(Ljava/lang/String;I)V

    .line 139
    .line 140
    .line 141
    invoke-interface {v0, v4, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    .line 143
    .line 144
    goto :goto_0

    .line 145
    :cond_5
    return-object v0
.end method

.method public getUses()Ljava/util/Set;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->uses(Ljava/lang/Object;)Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public getVersion()Ljava/lang/String;
    .locals 3
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->OPTIONAL:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 4
    .line 5
    sget-object v2, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 8
    .line 9
    invoke-interface {v2, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->rawVersion(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    const/4 v1, 0x0

    .line 18
    invoke-interface {v0, p0, v1}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Optional;->orElse(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    check-cast p0, Ljava/lang/String;

    .line 23
    .line 24
    return-object p0
.end method

.method public isOpen()Z
    .locals 2

    .line 1
    sget-object v0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE_DESCRIPTOR:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;

    .line 2
    .line 3
    sget-object v1, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->MODULE:Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;

    .line 4
    .line 5
    iget-object p0, p0, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule;->module:Ljava/lang/reflect/AnnotatedElement;

    .line 6
    .line 7
    invoke-interface {v1, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$Module;->getDescriptor(Ljava/lang/Object;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {v0, p0}, Lnet/bytebuddy/description/module/ModuleDescription$ForLoadedModule$ModuleDescriptor;->isOpen(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
