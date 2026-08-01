.class public final Lbsh/飘花落叶言子世苏楪哲兰;
.super Lbsh/飘花落叶言子世苏楪兰哲;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field public final 飘花落叶言子世楪兰哲苏:Z

.field public 飘花落叶言子世楪兰苏哲:Ljava/lang/reflect/Constructor;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Constructor;)V
    .locals 1

    .line 1
    invoke-direct {p0, p1}, Lbsh/飘花落叶言子世苏楪兰哲;-><init>(Ljava/lang/reflect/Executable;)V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/reflect/Constructor;

    .line 5
    .line 6
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 7
    .line 8
    sget-object v0, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Class;->getModifiers()I

    .line 11
    .line 12
    .line 13
    move-result p1

    .line 14
    invoke-static {p1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 15
    .line 16
    .line 17
    move-result p1

    .line 18
    iput-boolean p1, p0, Lbsh/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰哲苏:Z

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Class;->isMemberClass()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-boolean v0, p0, Lbsh/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰哲苏:Z

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    invoke-static {p1}, Ljava/util/stream/Stream;->of(Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {p2}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 18
    .line 19
    .line 20
    move-result-object p2

    .line 21
    invoke-static {v0, p2}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 22
    .line 23
    .line 24
    move-result-object p2

    .line 25
    invoke-interface {p2}, Ljava/util/stream/Stream;->toArray()[Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object p2

    .line 29
    :cond_0
    invoke-super {p0, p1, p2}, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final 飘花落叶言子楪哲世兰苏()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰哲苏:Z

    .line 2
    .line 3
    return p0
.end method

.method public final 飘花落叶言子楪哲苏兰世(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
    .locals 2

    .line 1
    const/4 p1, 0x0

    .line 2
    :try_start_0
    invoke-static {}, Ljava/lang/invoke/MethodHandles;->lookup()Ljava/lang/invoke/MethodHandles$Lookup;

    .line 3
    .line 4
    .line 5
    move-result-object v0

    .line 6
    iget-object v1, p0, Lbsh/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/reflect/Constructor;

    .line 7
    .line 8
    invoke-virtual {v0, v1}, Ljava/lang/invoke/MethodHandles$Lookup;->unreflectConstructor(Ljava/lang/reflect/Constructor;)Ljava/lang/invoke/MethodHandle;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    iget-boolean v1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪哲兰苏:Z

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v1, p0, Lbsh/飘花落叶言子世苏楪兰哲;->飘花落叶言子世楪苏哲兰:Ljava/lang/Class;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/invoke/MethodHandle;->asVarargsCollector(Ljava/lang/Class;)Ljava/lang/invoke/MethodHandle;

    .line 21
    .line 22
    .line 23
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 24
    :cond_0
    iput-object p1, p0, Lbsh/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/reflect/Constructor;

    .line 25
    .line 26
    return-object v0

    .line 27
    :catchall_0
    move-exception v0

    .line 28
    goto :goto_0

    .line 29
    :catch_0
    move-exception v0

    .line 30
    :try_start_1
    new-instance v1, Ljava/lang/RuntimeException;

    .line 31
    .line 32
    invoke-direct {v1, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V

    .line 33
    .line 34
    .line 35
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 36
    :goto_0
    iput-object p1, p0, Lbsh/飘花落叶言子世苏楪哲兰;->飘花落叶言子世楪兰苏哲:Ljava/lang/reflect/Constructor;

    .line 37
    .line 38
    throw v0
.end method

.method public final 飘花落叶言子楪苏世哲兰()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final 飘花落叶言子楪苏兰哲世()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->isMemberClass()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
