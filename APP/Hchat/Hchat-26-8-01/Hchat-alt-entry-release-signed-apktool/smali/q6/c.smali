.class public final Lq6/c;
.super Lr6/a;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 13

    .line 1
    invoke-super {p0}, Lr6/a;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lsf/e;

    .line 6
    .line 7
    const-string v2, "returnType"

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
    const-string v4, "returnTypeCondition"

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
    const-string v5, "genericReturnType"

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
    const-string v6, "genericReturnTypeCondition"

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
    const-string v7, "isBridge"

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
    const-string v8, "isBridgeNot"

    .line 48
    .line 49
    invoke-direct {v6, v8, v7}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    move-object v8, v7

    .line 53
    new-instance v7, Lsf/e;

    .line 54
    .line 55
    const-string v9, "isDefault"

    .line 56
    .line 57
    invoke-direct {v7, v9, v8}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 58
    .line 59
    .line 60
    move-object v9, v8

    .line 61
    new-instance v8, Lsf/e;

    .line 62
    .line 63
    const-string v10, "isDefaultNot"

    .line 64
    .line 65
    invoke-direct {v8, v10, v9}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    move-object v10, v9

    .line 69
    new-instance v9, Lsf/e;

    .line 70
    .line 71
    const-string v11, "defaultValue"

    .line 72
    .line 73
    invoke-direct {v9, v11, v10}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    move-object v11, v10

    .line 77
    new-instance v10, Lsf/e;

    .line 78
    .line 79
    const-string v12, "defaultValueCondition"

    .line 80
    .line 81
    invoke-direct {v10, v12, v11}, Lsf/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 82
    .line 83
    .line 84
    filled-new-array/range {v1 .. v10}, [Lsf/e;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    invoke-static {v1}, Ltf/y;->b0([Lsf/e;)Ljava/util/Map;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-static {v0, v1}, Ltf/y;->c0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
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
    const/4 v3, 0x6

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
