.class public Lbsh/classpath/BshClassLoader;
.super Ljava/net/URLClassLoader;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field classManager:Lbsh/BshClassManager;


# direct methods
.method public constructor <init>(Lbsh/BshClassManager;)V
    .locals 1

    const/4 v0, 0x0

    .line 11
    new-array v0, v0, [Ljava/net/URL;

    invoke-direct {p0, p1, v0}, Lbsh/classpath/BshClassLoader;-><init>(Lbsh/BshClassManager;[Ljava/net/URL;)V

    return-void
.end method

.method public constructor <init>(Lbsh/BshClassManager;Lbsh/classpath/BshClassPath;)V
    .locals 0

    .line 1
    invoke-virtual {p2}, Lbsh/classpath/BshClassPath;->getPathComponents()[Ljava/net/URL;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    invoke-direct {p0, p1, p2}, Lbsh/classpath/BshClassLoader;-><init>(Lbsh/BshClassManager;[Ljava/net/URL;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public constructor <init>(Lbsh/BshClassManager;[Ljava/net/URL;)V
    .locals 0

    .line 9
    invoke-direct {p0, p2}, Ljava/net/URLClassLoader;-><init>([Ljava/net/URL;)V

    .line 10
    iput-object p1, p0, Lbsh/classpath/BshClassLoader;->classManager:Lbsh/BshClassManager;

    return-void
.end method


# virtual methods
.method public addURL(Ljava/net/URL;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Ljava/net/URLClassLoader;->addURL(Ljava/net/URL;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public findClass(Ljava/lang/String;)Ljava/lang/Class;
    .locals 3

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/BshClassLoader;->getClassManager()Lbsh/BshClassManager;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    check-cast v0, Lbsh/classpath/ClassManagerImpl;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lbsh/classpath/ClassManagerImpl;->getLoaderForClass(Ljava/lang/String;)Ljava/lang/ClassLoader;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    if-eq v1, p0, :cond_0

    .line 14
    .line 15
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 19
    return-object p1

    .line 20
    :catch_0
    move-exception p1

    .line 21
    new-instance v0, Ljava/lang/ClassNotFoundException;

    .line 22
    .line 23
    new-instance v1, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "Designated loader could not find class: "

    .line 26
    .line 27
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    invoke-direct {v0, p1}, Ljava/lang/ClassNotFoundException;-><init>(Ljava/lang/String;)V

    .line 38
    .line 39
    .line 40
    throw v0

    .line 41
    :cond_0
    invoke-virtual {p0}, Ljava/net/URLClassLoader;->getURLs()[Ljava/net/URL;

    .line 42
    .line 43
    .line 44
    move-result-object v1

    .line 45
    array-length v1, v1

    .line 46
    if-lez v1, :cond_1

    .line 47
    .line 48
    :try_start_1
    invoke-super {p0, p1}, Ljava/net/URLClassLoader;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 49
    .line 50
    .line 51
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1

    .line 52
    return-object p1

    .line 53
    :catch_1
    :cond_1
    invoke-virtual {v0}, Lbsh/classpath/ClassManagerImpl;->getBaseLoader()Ljava/lang/ClassLoader;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    if-eq v1, p0, :cond_2

    .line 60
    .line 61
    :try_start_2
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 62
    .line 63
    .line 64
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 65
    return-object p1

    .line 66
    :catch_2
    :cond_2
    invoke-virtual {v0, p1}, Lbsh/BshClassManager;->plainClassForName(Ljava/lang/String;)Ljava/lang/Class;

    .line 67
    .line 68
    .line 69
    move-result-object p1

    .line 70
    return-object p1
.end method

.method public getClassManager()Lbsh/BshClassManager;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/classpath/BshClassLoader;->classManager:Lbsh/BshClassManager;

    .line 2
    .line 3
    return-object v0
.end method

.method public loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 1

    .line 1
    const-string v0, "java."

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1

    .line 14
    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->findLoadedClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    return-object v0

    .line 21
    :cond_1
    const-string v0, "bsh"

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 24
    .line 25
    .line 26
    move-result v0

    .line 27
    if-eqz v0, :cond_2

    .line 28
    .line 29
    const-class v0, Lbsh/Interpreter;

    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    if-eqz v0, :cond_2

    .line 36
    .line 37
    :try_start_0
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 38
    .line 39
    .line 40
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 41
    return-object p1

    .line 42
    :catch_0
    :cond_2
    invoke-virtual {p0, p1}, Lbsh/classpath/BshClassLoader;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 43
    .line 44
    .line 45
    move-result-object p1

    .line 46
    if-eqz p2, :cond_3

    .line 47
    .line 48
    invoke-virtual {p0, p1}, Ljava/lang/ClassLoader;->resolveClass(Ljava/lang/Class;)V

    .line 49
    .line 50
    .line 51
    :cond_3
    return-object p1
.end method
