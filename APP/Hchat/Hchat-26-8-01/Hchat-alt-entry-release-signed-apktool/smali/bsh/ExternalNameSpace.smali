.class public Lbsh/ExternalNameSpace;
.super Lbsh/NameSpace;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# instance fields
.field private externalMap:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 2

    const/4 v0, 0x0

    .line 14
    const-string v1, "External Map Namespace"

    invoke-direct {p0, v0, v1, v0}, Lbsh/ExternalNameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public constructor <init>(Lbsh/NameSpace;Ljava/lang/String;Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbsh/NameSpace;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Lbsh/NameSpace;-><init>(Lbsh/NameSpace;Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    if-nez p3, :cond_0

    .line 5
    .line 6
    new-instance p3, Ljava/util/HashMap;

    .line 7
    .line 8
    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    .line 9
    .line 10
    .line 11
    :cond_0
    iput-object p3, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 12
    .line 13
    return-void
.end method

.method public static synthetic h(I)[Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p0}, Lbsh/ExternalNameSpace;->lambda$getVariableNames$0(I)[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private static synthetic lambda$getVariableNames$0(I)[Ljava/lang/String;
    .locals 0

    .line 1
    new-array p0, p0, [Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public clear()V
    .locals 1

    .line 1
    invoke-super {p0}, Lbsh/NameSpace;->clear()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0}, Ljava/util/Map;->clear()V

    .line 7
    .line 8
    .line 9
    return-void
.end method

.method public createVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;
    .locals 1

    .line 1
    new-instance p4, Lbsh/LHS;

    .line 2
    .line 3
    iget-object v0, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 4
    .line 5
    invoke-direct {p4, v0, p1}, Lbsh/LHS;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    const/4 v0, 0x0

    .line 9
    :try_start_0
    invoke-virtual {p4, p3, v0}, Lbsh/LHS;->assign(Ljava/lang/Object;Z)Ljava/lang/Object;
    :try_end_0
    .catch Lbsh/UtilEvalError; {:try_start_0 .. :try_end_0} :catch_0

    .line 10
    .line 11
    .line 12
    new-instance p3, Lbsh/Variable;

    .line 13
    .line 14
    invoke-direct {p3, p1, p2, p4}, Lbsh/Variable;-><init>(Ljava/lang/String;Ljava/lang/Class;Lbsh/LHS;)V

    .line 15
    .line 16
    .line 17
    return-object p3

    .line 18
    :catch_0
    move-exception p1

    .line 19
    new-instance p2, Lbsh/InterpreterError;

    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-direct {p2, p1}, Lbsh/InterpreterError;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    throw p2
.end method

.method public getMap()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 2
    .line 3
    return-object v0
.end method

.method public getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;
    .locals 2

    .line 1
    iget-object v0, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 2
    .line 3
    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v1, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    sget-object v0, Lbsh/Primitive;->NULL:Lbsh/Primitive;

    .line 18
    .line 19
    :cond_0
    if-nez v0, :cond_1

    .line 20
    .line 21
    invoke-super {p0, p1}, Lbsh/NameSpace;->unsetVariable(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-super {p0, p1, p2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :cond_1
    const/4 p2, 0x0

    .line 30
    invoke-super {p0, p1, p2}, Lbsh/NameSpace;->getVariableImpl(Ljava/lang/String;Z)Lbsh/Variable;

    .line 31
    .line 32
    .line 33
    move-result-object p2

    .line 34
    if-nez p2, :cond_2

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-virtual {p0, p1, p2, v0, p2}, Lbsh/ExternalNameSpace;->createVariable(Ljava/lang/String;Ljava/lang/Class;Ljava/lang/Object;Lbsh/Modifiers;)Lbsh/Variable;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    return-object p1

    .line 42
    :cond_2
    return-object p2
.end method

.method public getVariableNames()[Ljava/lang/String;
    .locals 3

    .line 1
    invoke-super {p0}, Lbsh/NameSpace;->getVariableNames()[Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-static {v0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    iget-object v1, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 10
    .line 11
    invoke-interface {v1}, Ljava/util/Map;->keySet()Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-static {v0, v1}, Ljava/util/stream/Stream;->concat(Ljava/util/stream/Stream;Ljava/util/stream/Stream;)Ljava/util/stream/Stream;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    new-instance v1, Lbsh/e;

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    invoke-direct {v1, v2}, Lbsh/e;-><init>(I)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    check-cast v0, [Ljava/lang/String;

    .line 34
    .line 35
    return-object v0
.end method

.method public setMap(Ljava/util/Map;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lbsh/ExternalNameSpace;->clear()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 5
    .line 6
    return-void
.end method

.method public unsetVariable(Ljava/lang/String;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lbsh/NameSpace;->unsetVariable(Ljava/lang/String;)V

    .line 2
    .line 3
    .line 4
    iget-object v0, p0, Lbsh/ExternalNameSpace;->externalMap:Ljava/util/Map;

    .line 5
    .line 6
    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    return-void
.end method
