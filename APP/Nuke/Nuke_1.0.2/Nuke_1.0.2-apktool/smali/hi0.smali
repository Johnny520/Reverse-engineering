.class public final Lhi0;
.super Lzf1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public g:Ljava/lang/Class;

.field public h:Lin0;


# virtual methods
.method public final a()Ljava/util/Map;
    .locals 8

    .line 1
    invoke-super {p0}, Lzf1;->a()Ljava/util/Map;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Low1;

    .line 6
    .line 7
    const-string v2, "isEnumConstant"

    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    invoke-direct {v1, v2, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    new-instance v2, Low1;

    .line 14
    .line 15
    const-string v4, "isEnumConstantNot"

    .line 16
    .line 17
    invoke-direct {v2, v4, v3}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    iget-object v4, p0, Lhi0;->g:Ljava/lang/Class;

    .line 21
    .line 22
    move-object v5, v3

    .line 23
    new-instance v3, Low1;

    .line 24
    .line 25
    const-string v6, "type"

    .line 26
    .line 27
    invoke-direct {v3, v6, v4}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p0, p0, Lhi0;->h:Lin0;

    .line 31
    .line 32
    new-instance v4, Low1;

    .line 33
    .line 34
    const-string v6, "typeCondition"

    .line 35
    .line 36
    invoke-direct {v4, v6, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    move-object p0, v5

    .line 40
    new-instance v5, Low1;

    .line 41
    .line 42
    const-string v6, "genericType"

    .line 43
    .line 44
    invoke-direct {v5, v6, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    new-instance v6, Low1;

    .line 48
    .line 49
    const-string v7, "genericTypeCondition"

    .line 50
    .line 51
    invoke-direct {v6, v7, p0}, Low1;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    filled-new-array/range {v1 .. v6}, [Low1;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    invoke-static {p0}, Lwe1;->q0([Low1;)Ljava/util/Map;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-static {v0, p0}, Lwe1;->r0(Ljava/util/Map;Ljava/util/Map;)Ljava/util/LinkedHashMap;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method

.method public final c()Ljava/util/List;
    .locals 4

    .line 1
    iget-object v0, p0, Lzf1;->a:Lyf1;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, v0, Lyf1;->a:Ljava/lang/Class;

    .line 6
    .line 7
    new-instance v2, Lzh;

    .line 8
    .line 9
    const/16 v3, 0x8

    .line 10
    .line 11
    invoke-direct {v2, v3, p0, v0}, Lzh;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0, v1, v2}, Ltl;->T(Lzf1;Lyf1;Ljava/lang/Class;Lin0;)Ljava/util/List;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    return-object p0

    .line 22
    :cond_0
    const-string p0, "You must provide a configuration to resolve the member use build(configuration)."

    .line 23
    .line 24
    invoke-static {p0}, Ls;->j(Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    const/4 p0, 0x0

    .line 28
    return-object p0
.end method
