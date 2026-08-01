.class public Lbsh/classpath/ClassManagerImpl;
.super Lbsh/飘花落叶言子楪苏哲世兰;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field public 飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

.field public final 飘花落叶言子楪哲世苏兰:Ljava/lang/ref/ReferenceQueue;

.field public final 飘花落叶言子楪哲苏世兰:Ljava/util/concurrent/ConcurrentHashMap;

.field public 飘花落叶言子楪苏兰世哲:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

.field public final 飘花落叶言子楪苏兰哲世:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

.field public 飘花落叶言子楪苏哲世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

.field public 飘花落叶言子楪苏哲兰世:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Lbsh/飘花落叶言子楪苏哲世兰;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 5
    .line 6
    .line 7
    move-result-object v0

    .line 8
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰哲世:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    new-instance v0, Ljava/lang/ref/ReferenceQueue;

    .line 11
    .line 12
    invoke-direct {v0}, Ljava/lang/ref/ReferenceQueue;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世苏兰:Ljava/lang/ref/ReferenceQueue;

    .line 16
    .line 17
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲苏世兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 23
    .line 24
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世苏兰()V

    .line 25
    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世哲兰苏()V
    .locals 4

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object p0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰哲世:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->iterator()Ljava/util/Iterator;

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
    check-cast v3, Lbsh/飘花落叶言子楪苏世哲兰;

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
    invoke-interface {v3}, Lbsh/飘花落叶言子楪苏世哲兰;->classLoaderChanged()V

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
    invoke-virtual {p0, v1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    goto :goto_1

    .line 60
    :cond_2
    return-void
.end method

.method public final 飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Class;
    .locals 5

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰哲苏:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 13
    .line 14
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->contains(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    const-string p0, "absoluteNonClass list hit: "

    .line 21
    .line 22
    filled-new-array {p0, p1}, [Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    invoke-static {p0}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 27
    .line 28
    .line 29
    const/4 p0, 0x0

    .line 30
    return-object p0

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
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲苏世兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 41
    .line 42
    invoke-virtual {v1, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 43
    .line 44
    .line 45
    move-result-object v1

    .line 46
    check-cast v1, Ljava/lang/ClassLoader;

    .line 47
    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    :try_start_0
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 51
    .line 52
    .line 53
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 54
    goto :goto_0

    .line 55
    :catch_0
    move-exception v1

    .line 56
    const-string v2, "overlay loader failed for \'"

    .line 57
    .line 58
    const-string v3, "\' - "

    .line 59
    .line 60
    filled-new-array {v2, v3, v1}, [Ljava/lang/Object;

    .line 61
    .line 62
    .line 63
    move-result-object v1

    .line 64
    invoke-static {v1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_0
    if-nez v0, :cond_4

    .line 68
    .line 69
    const-string v1, "bsh"

    .line 70
    .line 71
    invoke-virtual {p1, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 72
    .line 73
    .line 74
    move-result v1

    .line 75
    if-eqz v1, :cond_4

    .line 76
    .line 77
    const-class v1, Lbsh/Interpreter;

    .line 78
    .line 79
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 80
    .line 81
    .line 82
    move-result-object v1

    .line 83
    if-eqz v1, :cond_3

    .line 84
    .line 85
    :try_start_1
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    move-result-object v0

    .line 89
    goto :goto_1

    .line 90
    :cond_3
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 91
    .line 92
    .line 93
    move-result-object v0
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_1 .. :try_end_1} :catch_1

    .line 94
    :catch_1
    :cond_4
    :goto_1
    if-nez v0, :cond_5

    .line 95
    .line 96
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 97
    .line 98
    if-eqz v1, :cond_5

    .line 99
    .line 100
    :try_start_2
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v0
    :try_end_2
    .catch Ljava/lang/ClassNotFoundException; {:try_start_2 .. :try_end_2} :catch_2

    .line 104
    :catch_2
    :cond_5
    if-nez v0, :cond_6

    .line 105
    .line 106
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 107
    .line 108
    if-eqz v1, :cond_6

    .line 109
    .line 110
    :try_start_3
    invoke-virtual {v1, p1}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 111
    .line 112
    .line 113
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/ClassNotFoundException; {:try_start_3 .. :try_end_3} :catch_3

    .line 114
    :catch_3
    :cond_6
    if-nez v0, :cond_7

    .line 115
    .line 116
    :try_start_4
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 117
    .line 118
    .line 119
    move-result-object v1

    .line 120
    invoke-virtual {v1}, Ljava/lang/Thread;->getContextClassLoader()Ljava/lang/ClassLoader;

    .line 121
    .line 122
    .line 123
    move-result-object v1

    .line 124
    if-eqz v1, :cond_7

    .line 125
    .line 126
    const/4 v2, 0x1

    .line 127
    invoke-static {p1, v2, v1}, Ljava/lang/Class;->forName(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;

    .line 128
    .line 129
    .line 130
    move-result-object v0
    :try_end_4
    .catch Ljava/lang/ClassNotFoundException; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_4 .. :try_end_4} :catch_4
    .catch Ljava/lang/SecurityException; {:try_start_4 .. :try_end_4} :catch_4

    .line 131
    :catch_4
    :cond_7
    if-nez v0, :cond_8

    .line 132
    .line 133
    :try_start_5
    invoke-static {p1}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 134
    .line 135
    .line 136
    move-result-object v0
    :try_end_5
    .catch Ljava/lang/ClassNotFoundException; {:try_start_5 .. :try_end_5} :catch_6
    .catch Ljava/lang/NoClassDefFoundError; {:try_start_5 .. :try_end_5} :catch_5

    .line 137
    goto :goto_2

    .line 138
    :catch_5
    move-exception v1

    .line 139
    sget-object v2, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 140
    .line 141
    const-string v3, "The class named \'"

    .line 142
    .line 143
    const-string v4, "\' could not be found, either because it no longer exists or it is not contained in the class file of the same name. Caused by: "

    .line 144
    .line 145
    invoke-static {v3, p1, v4}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰世苏(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 150
    .line 151
    .line 152
    move-result-object v1

    .line 153
    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v1

    .line 160
    invoke-virtual {v2, v1}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    :catch_6
    :cond_8
    :goto_2
    if-nez v0, :cond_9

    .line 164
    .line 165
    invoke-virtual {p0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏兰哲世(Ljava/lang/String;)Ljava/lang/Class;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    :cond_9
    invoke-virtual {p0, v0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Class;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    return-object v0
.end method

.method public final 飘花落叶言子楪世苏哲兰(Lbsh/飘花落叶言子楪苏世哲兰;)V
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 2
    .line 3
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世苏兰:Ljava/lang/ref/ReferenceQueue;

    .line 4
    .line 5
    invoke-direct {v0, p1, v1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    .line 6
    .line 7
    .line 8
    iget-object p0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰哲世:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->add(Ljava/lang/Object;)Z

    .line 11
    .line 12
    .line 13
    :cond_0
    :goto_0
    invoke-virtual {v1}, Ljava/lang/ref/ReferenceQueue;->poll()Ljava/lang/ref/Reference;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    if-eqz p1, :cond_1

    .line 18
    .line 19
    invoke-virtual {p0, p1}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->remove(Ljava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-nez v0, :cond_0

    .line 24
    .line 25
    const-string v0, "tried to remove non-existent weak ref: "

    .line 26
    .line 27
    filled-new-array {v0, p1}, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    move-result-object p1

    .line 31
    invoke-static {p1}, Lbsh/Interpreter;->debug([Ljava/lang/Object;)V

    .line 32
    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    return-void
.end method

.method public final 飘花落叶言子楪哲世兰苏()Lbsh/classpath/飘花落叶言子楪苏兰世哲;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰世哲:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 7
    .line 8
    const-string v1, "BeanShell Full Class Path"

    .line 9
    .line 10
    invoke-direct {v0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰世哲:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 14
    .line 15
    invoke-static {}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰()Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Lbsh/classpath/飘花落叶言子楪苏兰世哲;)V

    .line 20
    .line 21
    .line 22
    :try_start_0
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰世哲:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 23
    .line 24
    invoke-static {}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲兰苏()Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    invoke-virtual {v0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Lbsh/classpath/飘花落叶言子楪苏兰世哲;)V
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
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰世哲:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 40
    .line 41
    iget-object v1, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏哲兰(Lbsh/classpath/飘花落叶言子楪苏兰世哲;)V

    .line 44
    .line 45
    .line 46
    iget-object p0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏兰世哲:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 47
    .line 48
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世苏兰()V
    .locals 2

    .line 1
    new-instance v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    const-string v1, "baseClassPath"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 9
    .line 10
    const/4 v0, 0x0

    .line 11
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 12
    .line 13
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲苏世兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 14
    .line 15
    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 16
    .line 17
    .line 18
    new-instance v0, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世哲苏兰;

    .line 19
    .line 20
    iget-object v1, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世苏兰哲:Ljava/lang/ClassLoader;

    .line 21
    .line 22
    if-eqz v1, :cond_0

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    invoke-virtual {v1}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    :goto_0
    invoke-direct {v0, v1}, L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世哲苏兰;-><init>(Ljava/lang/ClassLoader;)V

    .line 34
    .line 35
    .line 36
    iput-object v0, p0, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世哲兰苏:L飘花落叶言子兰哲苏楪世/飘花落叶言子楪世哲苏兰;

    .line 37
    .line 38
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪世哲兰苏()V

    .line 39
    .line 40
    .line 41
    return-void
.end method

.method public final 飘花落叶言子楪哲苏世兰([Ljava/lang/String;)V
    .locals 7

    .line 1
    invoke-virtual {p0}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪世兰苏哲()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 10
    .line 11
    iget-object v2, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 12
    .line 13
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    new-instance v3, Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 19
    .line 20
    .line 21
    iget-object v4, v2, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 22
    .line 23
    new-instance v5, Lbsh/classpath/飘花落叶言子楪世苏兰哲;

    .line 24
    .line 25
    const/4 v6, 0x3

    .line 26
    invoke-direct {v5, v3, v6}, Lbsh/classpath/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {v4, v5}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->forEach(Ljava/util/function/Consumer;)V

    .line 30
    .line 31
    .line 32
    iget-object v2, v2, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世苏兰哲:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 33
    .line 34
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 35
    .line 36
    .line 37
    new-array v2, v1, [Ljava/net/URL;

    .line 38
    .line 39
    invoke-virtual {v3, v2}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    check-cast v2, [Ljava/net/URL;

    .line 44
    .line 45
    invoke-direct {v0, p0, v2}, Lbsh/classpath/飘花落叶言子楪世苏哲兰;-><init>(Lbsh/classpath/ClassManagerImpl;[Ljava/net/URL;)V

    .line 46
    .line 47
    .line 48
    iput-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 49
    .line 50
    :cond_0
    new-instance v0, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 51
    .line 52
    invoke-direct {v0}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;-><init>()V

    .line 53
    .line 54
    .line 55
    move v2, v1

    .line 56
    :goto_0
    array-length v3, p1

    .line 57
    if-ge v2, v3, :cond_4

    .line 58
    .line 59
    aget-object v3, p1, v2

    .line 60
    .line 61
    iget-object v4, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 62
    .line 63
    invoke-virtual {v4, v3}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lbsh/classpath/飘花落叶言子楪苏世兰哲;

    .line 64
    .line 65
    .line 66
    move-result-object v4

    .line 67
    if-nez v4, :cond_1

    .line 68
    .line 69
    invoke-static {}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰()Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 70
    .line 71
    .line 72
    move-result-object v4

    .line 73
    const/4 v5, 0x1

    .line 74
    invoke-virtual {v4, v5}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Z)V

    .line 75
    .line 76
    .line 77
    invoke-static {}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰()Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    invoke-virtual {v4, v3}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)Lbsh/classpath/飘花落叶言子楪苏世兰哲;

    .line 82
    .line 83
    .line 84
    move-result-object v4

    .line 85
    :cond_1
    if-eqz v4, :cond_3

    .line 86
    .line 87
    instance-of v5, v4, Lbsh/classpath/飘花落叶言子楪苏哲兰世;

    .line 88
    .line 89
    if-nez v5, :cond_2

    .line 90
    .line 91
    invoke-virtual {v0, v3, v4}, Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;->put(Ljava/lang/String;Lbsh/classpath/飘花落叶言子楪苏世兰哲;)Lbsh/classpath/飘花落叶言子楪苏世兰哲;

    .line 92
    .line 93
    .line 94
    add-int/lit8 v2, v2, 0x1

    .line 95
    .line 96
    goto :goto_0

    .line 97
    :cond_2
    new-instance p0, Lbsh/ClassPathException;

    .line 98
    .line 99
    new-instance p1, Ljava/lang/StringBuilder;

    .line 100
    .line 101
    const-string v0, "Cannot reload class: "

    .line 102
    .line 103
    invoke-direct {p1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    const-string v0, " from source: "

    .line 110
    .line 111
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object p1

    .line 121
    invoke-direct {p0, p1}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;)V

    .line 122
    .line 123
    .line 124
    throw p0

    .line 125
    :cond_3
    new-instance p0, Lbsh/ClassPathException;

    .line 126
    .line 127
    const-string p1, "Nothing known about class: "

    .line 128
    .line 129
    invoke-static {p1, v3}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p0, p1}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p0

    .line 137
    :cond_4
    new-instance p1, Lbsh/classpath/飘花落叶言子楪苏兰哲世;

    .line 138
    .line 139
    new-array v1, v1, [Ljava/net/URL;

    .line 140
    .line 141
    invoke-direct {p1, p0, v1}, Lbsh/classpath/飘花落叶言子楪世苏哲兰;-><init>(Lbsh/classpath/ClassManagerImpl;[Ljava/net/URL;)V

    .line 142
    .line 143
    .line 144
    iput-object v0, p1, Lbsh/classpath/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪哲兰苏世:Lbsh/classpath/DiscreteFilesClassLoader$ClassSourceMap;

    .line 145
    .line 146
    sput-object p1, Lbsh/classpath/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Lbsh/classpath/飘花落叶言子楪苏兰哲世;

    .line 147
    .line 148
    invoke-virtual {v0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    .line 149
    .line 150
    .line 151
    move-result-object p1

    .line 152
    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 153
    .line 154
    .line 155
    move-result-object p1

    .line 156
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 157
    .line 158
    .line 159
    move-result v0

    .line 160
    if-eqz v0, :cond_5

    .line 161
    .line 162
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    check-cast v0, Ljava/lang/String;

    .line 167
    .line 168
    sget-object v1, Lbsh/classpath/飘花落叶言子楪苏兰哲世;->飘花落叶言子楪兰世苏哲:Lbsh/classpath/飘花落叶言子楪苏兰哲世;

    .line 169
    .line 170
    iget-object v2, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲苏世兰:Ljava/util/concurrent/ConcurrentHashMap;

    .line 171
    .line 172
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 173
    .line 174
    .line 175
    goto :goto_1

    .line 176
    :cond_5
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪世哲兰苏()V

    .line 177
    .line 178
    .line 179
    return-void
.end method

.method public final 飘花落叶言子楪苏世兰哲()V
    .locals 3

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世兰苏()Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    invoke-virtual {v0, v1}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Z)V

    .line 7
    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)Ljava/lang/String;
    :try_end_0
    .catch Lbsh/ClassPathException; {:try_start_0 .. :try_end_0} :catch_0

    .line 12
    .line 13
    .line 14
    iput-boolean v1, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲兰世:Z

    .line 15
    .line 16
    return-void

    .line 17
    :catch_0
    move-exception p0

    .line 18
    new-instance v0, Lbsh/UtilEvalError;

    .line 19
    .line 20
    new-instance v1, Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, "Error importing classpath "

    .line 23
    .line 24
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v1

    .line 34
    invoke-direct {v0, v1, p0}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 35
    .line 36
    .line 37
    throw v0
.end method

.method public final 飘花落叶言子楪苏世哲兰(Ljava/lang/String;[B)Ljava/lang/Class;
    .locals 3

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲世兰:Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    new-instance v1, Lbsh/classpath/飘花落叶言子楪苏哲世兰;

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    invoke-direct {v1, v2}, Lbsh/classpath/飘花落叶言子楪苏哲世兰;-><init>(I)V

    .line 7
    .line 8
    .line 9
    iput-object p2, v1, Lbsh/classpath/飘花落叶言子楪苏世兰哲;->飘花落叶言子楪世苏哲兰:Ljava/io/Serializable;

    .line 10
    .line 11
    iget-object p2, v0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 12
    .line 13
    invoke-virtual {p2, p1, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    :try_start_0
    filled-new-array {p1}, [Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p2

    .line 20
    invoke-virtual {p0, p2}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲苏世兰([Ljava/lang/String;)V
    :try_end_0
    .catch Lbsh/ClassPathException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪世哲苏兰(Ljava/lang/String;)Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0

    .line 28
    :catch_0
    move-exception p0

    .line 29
    const-string p1, "defineClass: "

    .line 30
    .line 31
    invoke-static {p1, p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪世哲兰苏(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 32
    .line 33
    .line 34
    const/4 p0, 0x0

    .line 35
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰世哲()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪苏哲兰世:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪苏哲世兰(Ljava/lang/String;)Ljava/lang/String;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世兰苏()Lbsh/classpath/飘花落叶言子楪苏兰世哲;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x1

    .line 6
    invoke-virtual {p0, v0}, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世兰哲(Z)V

    .line 7
    .line 8
    .line 9
    iget-object v1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 14
    .line 15
    invoke-direct {v1}, Lbsh/classpath/BshClassPath$UnqualifiedNameTable;-><init>()V

    .line 16
    .line 17
    .line 18
    iget-object v2, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世哲苏兰:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 19
    .line 20
    new-instance v3, Lbsh/classpath/飘花落叶言子楪世苏兰哲;

    .line 21
    .line 22
    invoke-direct {v3, v1, v0}, Lbsh/classpath/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap$KeySetView;->forEach(Ljava/util/function/Consumer;)V

    .line 26
    .line 27
    .line 28
    iget-object v2, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪世兰苏哲:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentHashMap;->keySet()Ljava/util/Set;

    .line 31
    .line 32
    .line 33
    move-result-object v2

    .line 34
    new-instance v3, Lbsh/classpath/飘花落叶言子楪世苏兰哲;

    .line 35
    .line 36
    const/4 v4, 0x2

    .line 37
    invoke-direct {v3, v1, v4}, Lbsh/classpath/飘花落叶言子楪世苏兰哲;-><init>(Ljava/lang/Object;I)V

    .line 38
    .line 39
    .line 40
    invoke-interface {v2, v3}, Ljava/lang/Iterable;->forEach(Ljava/util/function/Consumer;)V

    .line 41
    .line 42
    .line 43
    iput-object v1, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 44
    .line 45
    :cond_0
    iget-object p0, p0, Lbsh/classpath/飘花落叶言子楪苏兰世哲;->飘花落叶言子楪苏世哲兰:Lbsh/classpath/BshClassPath$UnqualifiedNameTable;

    .line 46
    .line 47
    invoke-virtual {p0, p1}, Ljava/util/AbstractMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    check-cast p0, Lbsh/classpath/飘花落叶言子楪苏世哲兰;

    .line 52
    .line 53
    if-nez p0, :cond_1

    .line 54
    .line 55
    const/4 p0, 0x0

    .line 56
    return-object p0

    .line 57
    :cond_1
    iget-object p0, p0, Lbsh/classpath/飘花落叶言子楪苏世哲兰;->飘花落叶言子楪世苏哲兰:Ljava/util/ArrayList;

    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 60
    .line 61
    .line 62
    move-result p1

    .line 63
    if-ne p1, v0, :cond_2

    .line 64
    .line 65
    const/4 p1, 0x0

    .line 66
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    check-cast p0, Ljava/lang/String;

    .line 71
    .line 72
    return-object p0

    .line 73
    :cond_2
    new-instance p1, Lbsh/ClassPathException;

    .line 74
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v1, "Ambiguous class names: "

    .line 78
    .line 79
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    invoke-direct {p1, p0}, Lbsh/ClassPathException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method public final 飘花落叶言子楪苏哲兰世(Ljava/lang/String;)Ljava/net/URL;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/classpath/ClassManagerImpl;->飘花落叶言子楪哲世兰苏:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

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
    invoke-super {p0, p1}, Lbsh/飘花落叶言子楪苏哲世兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)Ljava/net/URL;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0

    .line 23
    :cond_1
    return-object v0
.end method
