.class public final Lio/ktor/server/engine/飘花落叶言子楪兰世苏哲;
.super Ljava/lang/ClassLoader;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Ljava/io/Closeable;


# instance fields
.field public final 飘花落叶言子楪哲苏兰世:Lbsh/classpath/飘花落叶言子楪世苏哲兰;


# direct methods
.method public constructor <init>(Ljava/util/ArrayList;Ljava/lang/ClassLoader;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Ljava/lang/ClassLoader;-><init>(Ljava/lang/ClassLoader;)V

    .line 2
    .line 3
    .line 4
    new-instance p2, Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    new-array v0, v0, [Ljava/net/URL;

    .line 8
    .line 9
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    check-cast p1, [Ljava/net/URL;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/ClassLoader;->getParent()Ljava/lang/ClassLoader;

    .line 16
    .line 17
    .line 18
    move-result-object v0

    .line 19
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    invoke-direct {p2, p1, v0}, Lbsh/classpath/飘花落叶言子楪世苏哲兰;-><init>([Ljava/net/URL;Ljava/lang/ClassLoader;)V

    .line 23
    .line 24
    .line 25
    iput-object p2, p0, Lio/ktor/server/engine/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 26
    .line 27
    return-void
.end method


# virtual methods
.method public final close()V
    .locals 0

    .line 1
    iget-object p0, p0, Lio/ktor/server/engine/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/net/URLClassLoader;->close()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final declared-synchronized loadClass(Ljava/lang/String;Z)Ljava/lang/Class;
    .locals 1

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 3
    .line 4
    .line 5
    :try_start_1
    iget-object v0, p0, Lio/ktor/server/engine/飘花落叶言子楪兰世苏哲;->飘花落叶言子楪哲苏兰世:Lbsh/classpath/飘花落叶言子楪世苏哲兰;

    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lbsh/classpath/飘花落叶言子楪世苏哲兰;->findClass(Ljava/lang/String;)Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object p1
    :try_end_1
    .catch Ljava/lang/ClassNotFoundException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    goto :goto_0

    .line 12
    :catchall_0
    move-exception p1

    .line 13
    goto :goto_1

    .line 14
    :catch_0
    :try_start_2
    invoke-super {p0, p1, p2}, Ljava/lang/ClassLoader;->loadClass(Ljava/lang/String;Z)Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 18
    :goto_0
    monitor-exit p0

    .line 19
    return-object p1

    .line 20
    :goto_1
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 21
    throw p1
.end method
