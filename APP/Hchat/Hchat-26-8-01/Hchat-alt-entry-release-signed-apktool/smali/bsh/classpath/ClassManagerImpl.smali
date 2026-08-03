.class public Lbsh/classpath/ClassManagerImpl;
.super Lbsh/BshClassManager;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field static final BSH_PACKAGE:Ljava/lang/String; = "bsh"


# instance fields
.field private baseClassPath:Lbsh/classpath/BshClassPath;

.field private baseLoader:Lbsh/classpath/BshClassLoader;

.field private fullClassPath:Lbsh/classpath/BshClassPath;

.field private final listeners:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/ref/WeakReference<",
            "Lbsh/BshClassManager$Listener;",
            ">;>;"
        }
    .end annotation
.end field

.field private final loaderMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lbsh/classpath/DiscreteFilesClassLoader;",
            ">;"
        }
    .end annotation
.end field

.field private final refQueue:Ljava/lang/ref/ReferenceQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/ReferenceQueue<",
            "Lbsh/BshClassManager$Listener;",
            ">;"
        }
    .end annotation
.end field

.field private superImport:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/BshClassManager;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->listeners:Ljava/util/Set;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->refQueue:Ljava/lang/ref/ReferenceQueue;

    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->loaderMap:Ljava/util/Map;

    .line 23
    .line 24
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->reset()V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method private initBaseLoader()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/classpath/BshClassLoader;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 4
    .line 5
    invoke-direct {v0, p0, v1}, Lbsh/classpath/BshClassLoader;-><init>(Lbsh/BshClassManager;Lbsh/classpath/BshClassPath;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 9
    .line 10
    return-void
.end method

.method private initPluginLoader()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/loader/BshPluginLoader;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/BshClassManager;->externalClassLoader:Ljava/lang/ClassLoader;

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    :goto_0
    invoke-direct {v0, v1}, Lbsh/loader/BshPluginLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 17
    .line 18
    .line 19
    iput-object v0, p0, Lbsh/BshClassManager;->pluginLoader:Lbsh/loader/BshPluginLoader;

    .line 20
    .line 21
    return-void
.end method


# virtual methods
.method public addClassPath(Ljava/net/URL;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    filled-new-array {p1}, [Ljava/net/URL;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lbsh/classpath/ClassManagerImpl;->setClassPath([Ljava/net/URL;)V

    .line 10
    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassLoader;->addURL(Ljava/net/URL;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassPath;->add(Ljava/net/URL;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->classLoaderChanged()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public addListener(Lbsh/BshClassManager$Listener;)V
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->listeners:Ljava/util/Set;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 4
    .line 5
    iget-object v2, p0, Lbsh/classpath/ClassManagerImpl;->refQueue:Ljava/lang/ref/ReferenceQueue;

    .line 6
    .line 7
    invoke-direct {v1, p1, v2}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object p1, p0, Lbsh/classpath/ClassManagerImpl;->refQueue:Ljava/lang/ref/ReferenceQueue;

    .line 14
    .line 15
    invoke-virtual {p1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->listeners:Ljava/util/Set;

    .line 22
    .line 23
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-nez v0, :cond_0

    .line 28
    .line 29
    const-string v0, "tried to remove non-existent weak ref: "

    .line 30
    .line 31
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    return-void
.end method

.method public classForName(Ljava/lang/String;)Ljava/lang/Class;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->absoluteClassCache:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Ljava/lang/Class;

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    iget-object v1, p0, Lbsh/BshClassManager;->absoluteNonClasses:Ljava/util/Set;

    .line 13
    .line 14
    invoke-interface {v1, p1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const-string v0, "absoluteNonClass list hit: "

    .line 21
    .line 22
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return-object p1

    .line 31
    :cond_1
    const-string v1, "Trying to load class: "

    .line 32
    .line 33
    filled-new-array {v1, p1}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1}, Lbsh/classpath/ClassManagerImpl;->getLoaderForClass(Ljava/lang/String;)Ljava/lang/ClassLoader;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    if-eqz v1, :cond_2

    .line 45
    .line 46
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 50
    goto :goto_0

    .line 51
    :catch_0
    move-exception v1

    .line 52
    const-string v2, "overlay loader failed for \'"

    .line 53
    .line 54
    const-string v3, "\' - "

    .line 55
    .line 56
    filled-new-array {v2, v3, v1}, [Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 61
    .line 62
    .line 63
    :cond_2
    :goto_0
    if-nez v0, :cond_4

    .line 64
    .line 65
    const-string v1, "bsh"

    .line 66
    .line 67
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 68
    .line 69
    .line 70
    move-result v1

    .line 71
    if-eqz v1, :cond_4

    .line 72
    .line 73
    const-class v1, Lbsh/Interpreter;

    .line 74
    .line 75
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 76
    .line 77
    .line 78
    move-result-object v1

    .line 79
    if-eqz v1, :cond_3

    .line 80
    .line 81
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 82
    .line 83
    .line 84
    move-result-object v0

    .line 85
    goto :goto_1

    .line 86
    :cond_3
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 87
    .line 88
    .line 89
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1

    .line 90
    :catch_1
    :cond_4
    :goto_1
    if-nez v0, :cond_5

    .line 91
    .line 92
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 93
    .line 94
    if-eqz v1, :cond_5

    .line 95
    .line 96
    :try_start_2
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 97
    .line 98
    .line 99
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 100
    :catch_2
    :cond_5
    if-nez v0, :cond_6

    .line 101
    .line 102
    iget-object v1, p0, Lbsh/BshClassManager;->externalClassLoader:Ljava/lang/ClassLoader;

    .line 103
    .line 104
    if-eqz v1, :cond_6

    .line 105
    .line 106
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 107
    .line 108
    .line 109
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 110
    :catch_3
    :cond_6
    if-nez v0, :cond_7

    .line 111
    .line 112
    :try_start_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 113
    .line 114
    .line 115
    move-result-object v1

    .line 116
    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    if-eqz v1, :cond_7

    .line 121
    .line 122
    const/4 v2, 0x1

    .line 123
    invoke-static {p1, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 124
    .line 125
    .line 126
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_4

    .line 127
    :catch_4
    :cond_7
    if-nez v0, :cond_8

    .line 128
    .line 129
    :try_start_5
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 130
    .line 131
    .line 132
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_5 .. :try_end_5} :catch_5

    .line 133
    goto :goto_2

    .line 134
    :catch_5
    move-exception v1

    .line 135
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 136
    .line 137
    const-string v3, "The class named \'"

    .line 138
    .line 139
    const-string v4, "\' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: "

    .line 140
    .line 141
    invoke-static {v3, p1, v4}, Lbc/e;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 146
    .line 147
    .line 148
    move-result-object v1

    .line 149
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v1

    .line 156
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    :catch_6
    :cond_8
    :goto_2
    if-nez v0, :cond_9

    .line 160
    .line 161
    invoke-virtual {p0, p1}, Lbsh/BshClassManager;->loadSourceClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 162
    .line 163
    .line 164
    move-result-object v0

    .line 165
    :cond_9
    invoke-virtual {p0, p1, v0}, Lbsh/BshClassManager;->cacheClassInfo(Ljava/lang/String;Ljava/lang/Class;)V

    .line 166
    .line 167
    .line 168
    return-object v0
.end method

.method public classLoaderChanged()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->listeners:Ljava/util/Set;

    .line 7
    .line 8
    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v2

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    check-cast v2, Ljava/lang/ref/WeakReference;

    .line 23
    .line 24
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Lbsh/BshClassManager$Listener;

    .line 29
    .line 30
    if-nez v3, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_0
    invoke-interface {v3}, Lbsh/BshClassManager$Listener;->classLoaderChanged()V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    check-cast v1, Ljava/lang/ref/WeakReference;

    .line 55
    .line 56
    iget-object v2, p0, Lbsh/classpath/ClassManagerImpl;->listeners:Ljava/util/Set;

    .line 57
    .line 58
    invoke-interface {v2, v1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 59
    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_2
    return-void
.end method

.method public defineClass(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    new-instance v1, Lbsh/classpath/BshClassPath$GeneratedClassSource;

    .line 4
    .line 5
    invoke-direct {v1, p2}, Lbsh/classpath/BshClassPath$GeneratedClassSource;-><init>([B)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, Lbsh/classpath/BshClassPath;->setClassSource(Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)V

    .line 9
    .line 10
    .line 11
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p2

    .line 15
    invoke-virtual {p0, p2}, Lbsh/classpath/ClassManagerImpl;->reloadClasses([Ljava/lang/String;)V
    :try_end_0
    .catch Lbsh/ClassPathException; {:try_start_0 .. :try_end_0} :catch_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lbsh/classpath/ClassManagerImpl;->classForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :catch_0
    move-exception p1

    .line 24
    const-string p2, "defineClass: "

    .line 25
    .line 26
    invoke-static {p2, p1}, Lbsh/j;->d(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    const/4 p1, 0x0

    .line 30
    return-object p1
.end method

.method public doSuperImport()V
    .locals 4

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->getClassPath()Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lbsh/classpath/BshClassPath;->insureInitialized()V

    .line 6
    .line 7
    .line 8
    const-string v0, ""

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lbsh/classpath/ClassManagerImpl;->getClassNameByUnqName(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lbsh/ClassPathException; {:try_start_0 .. :try_end_0} :catch_0

    .line 11
    .line 12
    .line 13
    const/4 v0, 0x1

    .line 14
    iput-boolean v0, p0, Lbsh/classpath/ClassManagerImpl;->superImport:Z

    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception v0

    .line 18
    new-instance v1, Lbsh/UtilEvalError;

    .line 19
    .line 20
    new-instance v2, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v3, "Error importing classpath "

    .line 23
    .line 24
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    invoke-direct {v1, v2, v0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v1
.end method

.method public dump(Ljava/io/PrintWriter;)V
    .locals 3

    .line 1
    const-string v0, "Bsh Class Manager Dump: "

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "----------------------- "

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v1, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    const-string v2, "baseLoader = "

    .line 14
    .line 15
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 19
    .line 20
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    new-instance v1, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v2, "loaderMap= "

    .line 33
    .line 34
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    iget-object v2, p0, Lbsh/classpath/ClassManagerImpl;->loaderMap:Ljava/util/Map;

    .line 38
    .line 39
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    invoke-virtual {p1, v1}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    new-instance v0, Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, "baseClassPath = "

    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 57
    .line 58
    .line 59
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    return-void
.end method

.method public getBaseLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 2
    .line 3
    return-object v0
.end method

.method public getClassNameByUnqName(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->getClassPath()Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassPath;->getClassNameByUnqName(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    return-object p1
.end method

.method public getClassPath()Lbsh/classpath/BshClassPath;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->fullClassPath:Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lbsh/classpath/BshClassPath;

    .line 7
    .line 8
    const-string v1, "BeanShell Full Class Path"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lbsh/classpath/BshClassPath;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->fullClassPath:Lbsh/classpath/BshClassPath;

    .line 14
    .line 15
    invoke-static {}, Lbsh/classpath/BshClassPath;->getUserClassPath()Lbsh/classpath/BshClassPath;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lbsh/classpath/BshClassPath;->addComponent(Lbsh/classpath/BshClassPath;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->fullClassPath:Lbsh/classpath/BshClassPath;

    .line 23
    .line 24
    invoke-static {}, Lbsh/classpath/BshClassPath;->getBootClassPath()Lbsh/classpath/BshClassPath;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lbsh/classpath/BshClassPath;->addComponent(Lbsh/classpath/BshClassPath;)V
    :try_end_0
    .catch Lbsh/ClassPathException; {:try_start_0 .. :try_end_0} :catch_0

    .line 29
    .line 30
    .line 31
    goto :goto_0

    .line 32
    :catch_0
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 33
    .line 34
    const-string v1, "Warning: can\'t get boot class path"

    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    :goto_0
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->fullClassPath:Lbsh/classpath/BshClassPath;

    .line 40
    .line 41
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lbsh/classpath/BshClassPath;->addComponent(Lbsh/classpath/BshClassPath;)V

    .line 44
    .line 45
    .line 46
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->fullClassPath:Lbsh/classpath/BshClassPath;

    .line 47
    .line 48
    return-object v0
.end method

.method public getLoaderForClass(Ljava/lang/String;)Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->loaderMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    check-cast p1, Ljava/lang/ClassLoader;

    .line 8
    .line 9
    return-object p1
.end method

.method public getResource(Ljava/lang/String;)Ljava/net/URL;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-super {p0, p1}, Lbsh/BshClassManager;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    return-object v0
.end method

.method public getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {p1, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v1

    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    :goto_0
    if-nez v0, :cond_1

    .line 17
    .line 18
    invoke-super {p0, p1}, Lbsh/BshClassManager;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    return-object p1

    .line 23
    :cond_1
    return-object v0
.end method

.method public hasSuperImport()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, Lbsh/classpath/ClassManagerImpl;->superImport:Z

    .line 2
    .line 3
    return v0
.end method

.method public loadGeneratedClass(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B)",
            "Ljava/lang/Class<",
            "*>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/BshClassManager;->pluginLoader:Lbsh/loader/BshPluginLoader;

    .line 2
    .line 3
    invoke-static {p1, p2, v0}, Lbsh/loader/BshLoaderHelper;->getClassByCode(Ljava/lang/String;[BLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object p2

    .line 7
    iget-object v0, p0, Lbsh/BshClassManager;->pluginLoader:Lbsh/loader/BshPluginLoader;

    .line 8
    .line 9
    invoke-virtual {v0, p1, p2}, Lbsh/loader/BshPluginLoader;->putClass(Ljava/lang/String;Ljava/lang/Class;)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public reloadAllClasses()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    const-string v1, "temp"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/classpath/BshClassPath;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Lbsh/classpath/BshClassPath;->addComponent(Lbsh/classpath/BshClassPath;)V

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lbsh/classpath/BshClassPath;->getUserClassPath()Lbsh/classpath/BshClassPath;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Lbsh/classpath/BshClassPath;->addComponent(Lbsh/classpath/BshClassPath;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lbsh/classpath/BshClassPath;->getPathComponents()[Ljava/net/URL;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    invoke-virtual {p0, v0}, Lbsh/classpath/ClassManagerImpl;->setClassPath([Ljava/net/URL;)V

    .line 25
    .line 26
    .line 27
    return-void
.end method

.method public reloadClasses([Ljava/lang/String;)V
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/BshClassManager;->clearCaches()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    invoke-direct {p0}, Lbsh/classpath/ClassManagerImpl;->initBaseLoader()V

    .line 9
    .line 10
    .line 11
    :cond_0
    new-instance v0, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 12
    .line 13
    invoke-direct {v0}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;-><init>()V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x0

    .line 17
    :goto_0
    array-length v2, p1

    .line 18
    if-ge v1, v2, :cond_4

    .line 19
    .line 20
    aget-object v2, p1, v1

    .line 21
    .line 22
    iget-object v3, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 23
    .line 24
    invoke-virtual {v3, v2}, Lbsh/classpath/BshClassPath;->getClassSource(Ljava/lang/String;)Lbsh/classpath/BshClassPath$ClassSource;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    if-nez v3, :cond_1

    .line 29
    .line 30
    invoke-static {}, Lbsh/classpath/BshClassPath;->getUserClassPath()Lbsh/classpath/BshClassPath;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    invoke-virtual {v3}, Lbsh/classpath/BshClassPath;->insureInitialized()V

    .line 35
    .line 36
    .line 37
    invoke-static {}, Lbsh/classpath/BshClassPath;->getUserClassPath()Lbsh/classpath/BshClassPath;

    .line 38
    .line 39
    .line 40
    move-result-object v3

    .line 41
    invoke-virtual {v3, v2}, Lbsh/classpath/BshClassPath;->getClassSource(Ljava/lang/String;)Lbsh/classpath/BshClassPath$ClassSource;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    :cond_1
    if-eqz v3, :cond_3

    .line 46
    .line 47
    instance-of v4, v3, Lbsh/classpath/BshClassPath$JarClassSource;

    .line 48
    .line 49
    if-nez v4, :cond_2

    .line 50
    .line 51
    invoke-virtual {v0, v2, v3}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;->put(Ljava/lang/String;Lbsh/classpath/BshClassPath$ClassSource;)Lbsh/classpath/BshClassPath$ClassSource;

    .line 52
    .line 53
    .line 54
    add-int/lit8 v1, v1, 0x1

    .line 55
    .line 56
    goto :goto_0

    .line 57
    :cond_2
    new-instance p1, Lbsh/ClassPathException;

    .line 58
    .line 59
    new-instance v0, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v1, "Cannot reload class: "

    .line 62
    .line 63
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    const-string v1, " from source: "

    .line 70
    .line 71
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    invoke-direct {p1, v0}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw p1

    .line 85
    :cond_3
    new-instance p1, Lbsh/ClassPathException;

    .line 86
    .line 87
    const-string v0, "Nothing known about class: "

    .line 88
    .line 89
    invoke-static {v0, v2}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 90
    .line 91
    .line 92
    move-result-object v0

    .line 93
    invoke-direct {p1, v0}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_4
    invoke-static {p0, v0}, Lbsh/classpath/DiscreteFilesClassLoader;->newInstance(Lbsh/BshClassManager;Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    .line 101
    .line 102
    .line 103
    move-result-object p1

    .line 104
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 105
    .line 106
    .line 107
    move-result-object p1

    .line 108
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 109
    .line 110
    .line 111
    move-result v0

    .line 112
    if-eqz v0, :cond_5

    .line 113
    .line 114
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->loaderMap:Ljava/util/Map;

    .line 115
    .line 116
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    check-cast v1, Ljava/lang/String;

    .line 121
    .line 122
    invoke-static {}, Lbsh/classpath/DiscreteFilesClassLoader;->instance()Lbsh/classpath/DiscreteFilesClassLoader;

    .line 123
    .line 124
    .line 125
    move-result-object v2

    .line 126
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    .line 128
    .line 129
    goto :goto_1

    .line 130
    :cond_5
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->classLoaderChanged()V

    .line 131
    .line 132
    .line 133
    return-void
.end method

.method public reloadPackage(Ljava/lang/String;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassPath;->getClassesForPackage(Ljava/lang/String;)Ljava/util/Set;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lbsh/classpath/BshClassPath;->getUserClassPath()Lbsh/classpath/BshClassPath;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassPath;->getClassesForPackage(Ljava/lang/String;)Ljava/util/Set;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    :cond_0
    if-eqz v0, :cond_1

    .line 18
    .line 19
    invoke-interface {v0}, Ljava/util/Collection;->size()I

    .line 20
    .line 21
    .line 22
    move-result p1

    .line 23
    new-array p1, p1, [Ljava/lang/String;

    .line 24
    .line 25
    invoke-interface {v0, p1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    check-cast p1, [Ljava/lang/String;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lbsh/classpath/ClassManagerImpl;->reloadClasses([Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-void

    .line 35
    :cond_1
    new-instance v0, Lbsh/ClassPathException;

    .line 36
    .line 37
    const-string v1, "No classes found for package: "

    .line 38
    .line 39
    invoke-static {v1, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    invoke-direct {v0, p1}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v0
.end method

.method public removeListener(Lbsh/BshClassManager$Listener;)V
    .locals 1

    .line 1
    new-instance p1, Ljava/lang/Error;

    .line 2
    .line 3
    const-string v0, "unimplemented"

    .line 4
    .line 5
    invoke-direct {p1, v0}, Ljava/lang/Error;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p1
.end method

.method public reset()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    const-string v1, "baseClassPath"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/classpath/BshClassPath;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseLoader:Lbsh/classpath/BshClassLoader;

    .line 12
    .line 13
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->loaderMap:Ljava/util/Map;

    .line 14
    .line 15
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lbsh/classpath/ClassManagerImpl;->initPluginLoader()V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->classLoaderChanged()V

    .line 22
    .line 23
    .line 24
    return-void
.end method

.method public setClassPath([Ljava/net/URL;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->baseClassPath:Lbsh/classpath/BshClassPath;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/classpath/BshClassPath;->setPath([Ljava/net/URL;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lbsh/classpath/ClassManagerImpl;->initBaseLoader()V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lbsh/classpath/ClassManagerImpl;->loaderMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {p1}, Ljava/util/Map;->clear()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->classLoaderChanged()V

    .line 15
    .line 16
    .line 17
    return-void
.end method
