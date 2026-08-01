.class public Lbsh/飘花落叶言子楪苏哲世兰;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final 飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;


# instance fields
.field public final transient 飘花落叶言子楪世兰哲苏:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public final transient 飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

.field public 飘花落叶言子楪世哲兰苏:L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世哲苏兰;

.field public final 飘花落叶言子楪世哲苏兰:L飘花落叶言世苏楪兰子哲/飘花落叶言子楪世苏兰哲;

.field public 飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

.field public 飘花落叶言子楪世苏哲兰:Lbsh/Interpreter;

.field public final transient 飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    new-instance v1, Lbsh/飘花落叶言子楪世哲苏兰;

    .line 4
    .line 5
    const/4 v2, 0x2

    .line 6
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 7
    .line 8
    .line 9
    sget-object v2, Lbsh/util/ValueReferenceMap$Type;->Soft:Lbsh/util/ValueReferenceMap$Type;

    .line 10
    .line 11
    invoke-direct {v0, v1, v2}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;-><init>(Ljava/util/function/Function;Lbsh/util/ValueReferenceMap$Type;)V

    .line 12
    .line 13
    .line 14
    sput-object v0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 15
    .line 16
    return-void
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, L飘花落叶言世苏楪兰子哲/飘花落叶言子楪世苏兰哲;

    .line 5
    .line 6
    const/4 v1, 0x1

    .line 7
    invoke-direct {v0, v1}, L飘花落叶言世苏楪兰子哲/飘花落叶言子楪世苏兰哲;-><init>(I)V

    .line 8
    .line 9
    .line 10
    iput-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲苏兰:L飘花落叶言世苏楪兰子哲/飘花落叶言子楪世苏兰哲;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    .line 14
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    iput-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 26
    .line 27
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 28
    .line 29
    .line 30
    iput-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世哲兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 31
    .line 32
    return-void
.end method

.method public static 飘花落叶言子楪世兰哲苏(Lbsh/Interpreter;)Lbsh/飘花落叶言子楪苏哲世兰;
    .locals 4

    .line 1
    sget-object v0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Ljava/util/WeakHashMap;

    .line 2
    .line 3
    const-string v1, "bsh.classpath.ClassManagerImpl"

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->containsKey(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x0

    .line 10
    if-nez v2, :cond_0

    .line 11
    .line 12
    :try_start_0
    const-class v2, Lbsh/classpath/ClassManagerImpl;

    .line 13
    .line 14
    invoke-virtual {v0, v1, v2}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_0

    .line 18
    :catch_0
    invoke-virtual {v0, v1, v3}, Ljava/util/WeakHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    :cond_0
    :goto_0
    sget-object v0, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲兰苏世:Ljava/util/WeakHashMap;

    .line 22
    .line 23
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v2

    .line 27
    check-cast v2, Ljava/lang/Class;

    .line 28
    .line 29
    if-eqz v2, :cond_1

    .line 30
    .line 31
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/util/WeakHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    check-cast v0, Ljava/lang/Class;
    :try_end_1
    .catch Ljava/lang/IllegalArgumentException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_1 .. :try_end_1} :catch_3
    .catch Ljava/lang/SecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 36
    .line 37
    :try_start_2
    invoke-virtual {v0, v3}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    invoke-virtual {v0, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast v0, Lbsh/飘花落叶言子楪苏哲世兰;
    :try_end_2
    .catch Ljava/lang/IllegalArgumentException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/ReflectiveOperationException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_2 .. :try_end_2} :catch_1

    .line 46
    .line 47
    goto :goto_2

    .line 48
    :catch_1
    move-exception p0

    .line 49
    goto :goto_1

    .line 50
    :catch_2
    move-exception p0

    .line 51
    goto :goto_1

    .line 52
    :catch_3
    move-exception p0

    .line 53
    :goto_1
    new-instance v0, Lbsh/InterpreterError;

    .line 54
    .line 55
    const-string v1, "Error loading classmanager"

    .line 56
    .line 57
    invoke-direct {v0, v1, p0}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 58
    .line 59
    .line 60
    throw v0

    .line 61
    :cond_1
    new-instance v0, Lbsh/飘花落叶言子楪苏哲世兰;

    .line 62
    .line 63
    invoke-direct {v0}, Lbsh/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 64
    .line 65
    .line 66
    :goto_2
    iput-object p0, v0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lbsh/Interpreter;

    .line 67
    .line 68
    return-object v0
.end method


# virtual methods
.method public final 飘花落叶言子楪世兰苏哲()V
    .locals 4

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->clear()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 9
    .line 10
    .line 11
    sget-object p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    monitor-enter p0

    .line 14
    :try_start_0
    iget-object v0, p0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/HashMap;

    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰苏哲:Ljava/lang/ref/ReferenceQueue;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    iget-object v3, p0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 31
    .line 32
    invoke-virtual {v3, v2}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    goto :goto_0

    .line 39
    :cond_1
    iget-object v0, p0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲苏兰:Ljava/util/HashMap;

    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 42
    .line 43
    .line 44
    iget-object v0, p0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世哲兰苏:Ljava/util/HashMap;

    .line 45
    .line 46
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 47
    .line 48
    .line 49
    const/4 v0, 0x0

    .line 50
    iput v0, p0, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世兰哲苏:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 51
    .line 52
    monitor-exit p0

    .line 53
    return-void

    .line 54
    :catchall_0
    move-exception v0

    .line 55
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 56
    throw v0
.end method

.method public 飘花落叶言子楪世哲兰苏()V
    .locals 0

    .line 1
    return-void
.end method

.method public 飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Class;
    .locals 2

    .line 1
    :try_start_0
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    :goto_0
    invoke-virtual {p0, v0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    .line 16
    .line 17
    goto :goto_1

    .line 18
    :catch_0
    const/4 v0, 0x0

    .line 19
    :goto_1
    if-nez v0, :cond_1

    .line 20
    .line 21
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lbsh/Interpreter;

    .line 22
    .line 23
    invoke-virtual {v1}, Lbsh/Interpreter;->getCompatibility()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Ljava/lang/Class;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    :cond_1
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V
    .locals 0

    .line 1
    if-eqz p1, :cond_0

    .line 2
    .line 3
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 4
    .line 5
    invoke-virtual {p0, p2, p1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    sget-object p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏世兰哲:L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;

    .line 9
    .line 10
    invoke-virtual {p0, p1}, L飘花落叶言楪子世哲兰苏/飘花落叶言子楪世苏哲兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 15
    .line 16
    invoke-virtual {p0, p2}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public 飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V
    .locals 0

    .line 1
    return-void
.end method

.method public 飘花落叶言子楪哲世苏兰()V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public 飘花落叶言子楪苏世兰哲()V
    .locals 1

    .line 1
    new-instance p0, Lbsh/Capabilities$Unavailable;

    .line 2
    .line 3
    const-string v0, "ClassLoading features unavailable."

    .line 4
    .line 5
    invoke-direct {p0, v0}, Lbsh/Capabilities$Unavailable;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言子楪苏世哲兰(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 1

    .line 1
    new-instance p0, Lbsh/InterpreterError;

    .line 2
    .line 3
    const-string p2, "Can\'t create class ("

    .line 4
    .line 5
    const-string v0, ") without class manager package."

    .line 6
    .line 7
    invoke-static {p2, p1, v0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲苏世兰(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    throw p0
.end method

.method public 飘花落叶言子楪苏兰世哲()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public final 飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Ljava/lang/Class;
    .locals 5

    .line 1
    const-string v0, "Loading class from source file: "

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "/"

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const/16 v2, 0x2e

    .line 11
    .line 12
    const/16 v3, 0x2f

    .line 13
    .line 14
    invoke-virtual {p1, v2, v3}, Ljava/lang/String;->replace(CC)Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object v2

    .line 18
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string v2, ".java"

    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {p0, v1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)Ljava/net/URL;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    const/4 v3, 0x0

    .line 35
    if-nez v2, :cond_0

    .line 36
    .line 37
    return-object v3

    .line 38
    :cond_0
    :try_start_0
    new-instance v4, Lbsh/飘花落叶言子世苏哲兰楪;

    .line 39
    .line 40
    invoke-virtual {v2}, Ljava/net/URL;->getContent()Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    check-cast v2, Ljava/io/InputStream;

    .line 45
    .line 46
    invoke-direct {v4, v2}, Lbsh/飘花落叶言子世苏哲兰楪;-><init>(Ljava/io/InputStream;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Lbsh/EvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    .line 48
    .line 49
    :try_start_1
    invoke-virtual {v0, v1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    invoke-static {v0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏哲兰:Lbsh/Interpreter;

    .line 61
    .line 62
    invoke-virtual {v0, v4}, Lbsh/Interpreter;->eval(Ljava/io/Reader;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 63
    .line 64
    .line 65
    :try_start_2
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_1
    .catch Lbsh/EvalError; {:try_start_2 .. :try_end_2} :catch_0

    .line 66
    .line 67
    .line 68
    goto :goto_2

    .line 69
    :catch_0
    move-exception v0

    .line 70
    goto :goto_1

    .line 71
    :catch_1
    move-exception v0

    .line 72
    goto :goto_1

    .line 73
    :catchall_0
    move-exception v0

    .line 74
    :try_start_3
    invoke-virtual {v4}, Ljava/io/Reader;->close()V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    .line 75
    .line 76
    .line 77
    goto :goto_0

    .line 78
    :catchall_1
    move-exception v1

    .line 79
    :try_start_4
    invoke-virtual {v0, v1}, Ljava/lang/Throwable;->addSuppressed(Ljava/lang/Throwable;)V

    .line 80
    .line 81
    .line 82
    :goto_0
    throw v0
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Lbsh/EvalError; {:try_start_4 .. :try_end_4} :catch_0

    .line 83
    :goto_1
    sget-object v1, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    check-cast v1, Ljava/lang/Boolean;

    .line 90
    .line 91
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 92
    .line 93
    .line 94
    move-result v1

    .line 95
    if-eqz v1, :cond_1

    .line 96
    .line 97
    invoke-virtual {v0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 98
    .line 99
    .line 100
    :cond_1
    :goto_2
    :try_start_5
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 101
    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    invoke-virtual {v0, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 105
    .line 106
    .line 107
    move-result-object v0

    .line 108
    goto :goto_3

    .line 109
    :cond_2
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    :goto_3
    invoke-virtual {p0, v0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_2

    .line 114
    .line 115
    .line 116
    return-object v0

    .line 117
    :catch_2
    const-string p0, "Class not found in source file: "

    .line 118
    .line 119
    invoke-virtual {p0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 120
    .line 121
    .line 122
    move-result-object p0

    .line 123
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p0

    .line 127
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 128
    .line 129
    .line 130
    return-object v3
.end method

.method public 飘花落叶言子楪苏哲世兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 1
    new-instance p0, Lbsh/Capabilities$Unavailable;

    .line 2
    .line 3
    const-string p1, "ClassLoading features unavailable."

    .line 4
    .line 5
    invoke-direct {p0, p1}, Lbsh/Capabilities$Unavailable;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    throw p0
.end method

.method public 飘花落叶言子楪苏哲兰世(Ljava/lang/String;)Ljava/net/URL;
    .locals 1

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {p0, v0}, Ljava/lang/ClassLoader;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    :goto_0
    if-nez p0, :cond_1

    .line 17
    .line 18
    const-class p0, Lbsh/Interpreter;

    .line 19
    .line 20
    invoke-virtual {p0, p1}, Ljava/lang/Class;->getResource(Ljava/lang/String;)Ljava/net/URL;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    :cond_1
    return-object p0
.end method
