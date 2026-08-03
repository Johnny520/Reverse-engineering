.class public final Lq6/b;
.super Lr6/d;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 9

    .line 1
    invoke-super {p0}, Lr6/d;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lsf/e;

    .line 6
    .line 7
    const-string v2, "isEnumConstant"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Lsf/e;

    .line 14
    .line 15
    const-string v4, "isEnumConstantNot"

    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    move-object v4, v3

    .line 21
    new-instance v3, Lsf/e;

    .line 22
    .line 23
    const-string v5, "type"

    .line 24
    .line 25
    invoke-direct {v3, v5, v4}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 26
    .line 27
    .line 28
    move-object v5, v4

    .line 29
    new-instance v4, Lsf/e;

    .line 30
    .line 31
    const-string v6, "typeCondition"

    .line 32
    .line 33
    invoke-direct {v4, v6, v5}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    move-object v6, v5

    .line 37
    new-instance v5, Lsf/e;

    .line 38
    .line 39
    const-string v7, "genericType"

    .line 40
    .line 41
    invoke-direct {v5, v7, v6}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 42
    .line 43
    .line 44
    move-object v7, v6

    .line 45
    new-instance v6, Lsf/e;

    .line 46
    .line 47
    const-string v8, "genericTypeCondition"

    .line 48
    .line 49
    invoke-direct {v6, v8, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    filled-new-array/range {v1 .. v6}, [Lsf/e;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    invoke-static {v1}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 57
    .line 58
    .line 59
    move-result-object v1

    .line 60
    invoke-static {v0, v1}, Ltf/y;->c0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 61
    .line 62
    .line 63
    move-result-object v0

    .line 64
    return-object v0
.end method

.method public final b()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lr6/d;->a:Lr6/c;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lr6/c;->a:Ljava/lang/Class;

    .line 6
    .line 7
    new-instance v2, Li0/q0;

    .line 8
    .line 9
    const/4 v3, 0x7

    .line 10
    invoke-direct {v2, p0, v3, v0}, Li0/q0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1, v2}, Lx6/g;->i(Lr6/d;Lr6/c;Ljava/lang/Class;Lfg/l;)Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    :cond_0
    const-string v0, "You must provide a configuration to resolve the member use build(configuration)."

    .line 19
    .line 20
    invoke-static {v0}, Lj8/o;->t(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    return-object v0
.end method
