.class public Lbsh/PreparsedScript;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private final interpreter:Lbsh/Interpreter;

.field private final prepared:Lbsh/BshMethod;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 79
    invoke-static {}, Lbsh/PreparsedScript;->getDefaultClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lbsh/PreparsedScript;-><init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/ClassLoader;)V
    .locals 3

    .line 1
    const-string v0, "__execute() {"

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v1, Lbsh/Interpreter;

    .line 7
    .line 8
    invoke-direct {v1}, Lbsh/Interpreter;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, p0, Lbsh/PreparsedScript;->interpreter:Lbsh/Interpreter;

    .line 12
    .line 13
    invoke-virtual {v1, p2}, Lbsh/Interpreter;->setClassLoader(Ljava/lang/ClassLoader;)V

    .line 14
    .line 15
    .line 16
    :try_start_0
    new-instance p2, Ljava/io/StringReader;

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, p1}, Lbsh/Interpreter;->terminatedScript(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v0, "} return this;"

    .line 31
    .line 32
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    invoke-direct {p2, v0}, Ljava/io/StringReader;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    .line 42
    iget-object v0, v1, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 43
    .line 44
    const-string v2, "pre-parsed script"

    .line 45
    .line 46
    invoke-virtual {v1, v2, p1}, Lbsh/Interpreter;->showEvalString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-virtual {v1, p2, v0, p1}, Lbsh/Interpreter;->eval(Ljava/io/Reader;Lbsh/NameSpace;Ljava/lang/String;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    check-cast p1, Lbsh/This;

    .line 55
    .line 56
    invoke-virtual {p1}, Lbsh/This;->getNameSpace()Lbsh/NameSpace;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    const-string p2, "__execute"

    .line 61
    .line 62
    sget-object v0, Lbsh/Reflect;->ZERO_TYPES:[Ljava/lang/Class;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-virtual {p1, p2, v0, v1}, Lbsh/NameSpace;->getMethod(Ljava/lang/String;[Ljava/lang/Class;Z)Lbsh/BshMethod;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    iput-object p1, p0, Lbsh/PreparsedScript;->prepared:Lbsh/BshMethod;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    return-void

    .line 72
    :catch_0
    move-exception p1

    .line 73
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 74
    .line 75
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/Throwable;)V

    .line 76
    .line 77
    .line 78
    throw p2
.end method

.method private static getDefaultClassLoader()Ljava/lang/ClassLoader;
    .locals 1

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 6
    .line 7
    .line 8
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    goto :goto_0

    .line 10
    :catch_0
    const/4 v0, 0x0

    .line 11
    :goto_0
    if-nez v0, :cond_0

    .line 12
    .line 13
    const-class v0, Lbsh/PreparsedScript;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    :cond_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-static {}, Ljava/lang/ClassLoader;->getSystemClassLoader()Ljava/lang/ClassLoader;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    :cond_1
    return-object v0
.end method


# virtual methods
.method public invoke(Ljava/util/Map;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "*>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Lbsh/NameSpace;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/PreparsedScript;->interpreter:Lbsh/Interpreter;

    .line 4
    .line 5
    iget-object v2, v1, Lbsh/Interpreter;->globalNameSpace:Lbsh/NameSpace;

    .line 6
    .line 7
    invoke-virtual {v1}, Lbsh/Interpreter;->getClassManager()Lbsh/BshClassManager;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    const-string v3, "BeanshellExecutable"

    .line 12
    .line 13
    invoke-direct {v0, v2, v1, v3}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Lbsh/BshClassManager;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x1

    .line 17
    iput-boolean v1, v0, Lbsh/NameSpace;->isMethod:Z

    .line 18
    .line 19
    new-instance v4, Lbsh/Interpreter;

    .line 20
    .line 21
    iget-object v1, p0, Lbsh/PreparsedScript;->interpreter:Lbsh/Interpreter;

    .line 22
    .line 23
    invoke-direct {v4, v0, v1}, Lbsh/Interpreter;-><init>(Lbsh/NameSpace;Lbsh/Interpreter;)V

    .line 24
    .line 25
    .line 26
    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 31
    .line 32
    .line 33
    move-result-object p1

    .line 34
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 35
    .line 36
    .line 37
    move-result v1

    .line 38
    if-eqz v1, :cond_0

    .line 39
    .line 40
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v1

    .line 44
    check-cast v1, Ljava/util/Map$Entry;

    .line 45
    .line 46
    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v2

    .line 50
    check-cast v2, Ljava/lang/String;

    .line 51
    .line 52
    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-virtual {v4, v2, v1}, Lbsh/Interpreter;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_0

    .line 60
    :cond_0
    iget-object v2, p0, Lbsh/PreparsedScript;->prepared:Lbsh/BshMethod;

    .line 61
    .line 62
    sget-object v3, Lbsh/Reflect;->ZERO_ARGS:[Ljava/lang/Object;

    .line 63
    .line 64
    new-instance v5, Lbsh/CallStack;

    .line 65
    .line 66
    invoke-direct {v5, v0}, Lbsh/CallStack;-><init>(Lbsh/NameSpace;)V

    .line 67
    .line 68
    .line 69
    sget-object v6, Lbsh/Node;->JAVACODE:Lbsh/Node;

    .line 70
    .line 71
    const/4 v7, 0x1

    .line 72
    invoke-virtual/range {v2 .. v7}, Lbsh/BshMethod;->invoke([Ljava/lang/Object;Lbsh/Interpreter;Lbsh/CallStack;Lbsh/Node;Z)Ljava/lang/Object;

    .line 73
    .line 74
    .line 75
    move-result-object p1

    .line 76
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    .line 78
    .line 79
    move-result-object p1

    .line 80
    return-object p1
.end method

.method public setErr(Ljava/io/PrintStream;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/PreparsedScript;->interpreter:Lbsh/Interpreter;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/Interpreter;->setErr(Ljava/io/PrintStream;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public setOut(Ljava/io/PrintStream;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/PreparsedScript;->interpreter:Lbsh/Interpreter;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lbsh/Interpreter;->setOut(Ljava/io/PrintStream;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
