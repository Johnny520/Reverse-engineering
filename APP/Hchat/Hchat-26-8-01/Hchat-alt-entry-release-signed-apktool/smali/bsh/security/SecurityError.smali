.class public Lbsh/security/SecurityError;
.super Lbsh/UtilEvalError;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "SecurityError: "

    .line 2
    .line 3
    invoke-static {v0, p1}, Lwb/en;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lbsh/UtilEvalError;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method private static argsTypesString([Ljava/lang/Object;)Ljava/lang/String;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [Ljava/lang/String;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    :goto_0
    array-length v2, p0

    .line 6
    if-ge v1, v2, :cond_1

    .line 7
    .line 8
    aget-object v2, p0, v1

    .line 9
    .line 10
    invoke-static {v2}, Lbsh/Reflect;->getType(Ljava/lang/Object;)Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v2

    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    goto :goto_1

    .line 21
    :cond_0
    const-string v2, "null"

    .line 22
    .line 23
    :goto_1
    aput-object v2, v0, v1

    .line 24
    .line 25
    add-int/lit8 v1, v1, 0x1

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_1
    const-string p0, ", "

    .line 29
    .line 30
    invoke-static {p0, v0}, Ljava/lang/String;->join(Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method public static cantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "("

    .line 10
    .line 11
    const-string v1, ")"

    .line 12
    .line 13
    const-string v2, "Can\'t call this construct: new "

    .line 14
    .line 15
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance p1, Lbsh/security/SecurityError;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public static cantExtends(Ljava/lang/Class;)Lbsh/security/SecurityError;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Can\'t extend this class: "

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lbsh/security/SecurityError;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static cantGetField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/security/SecurityError;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "Can\'t get this field: "

    .line 10
    .line 11
    const-string v1, "."

    .line 12
    .line 13
    invoke-static {v0, p0, v1, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p1, Lbsh/security/SecurityError;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method

.method public static cantGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Lbsh/security/SecurityError;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Can\'t get this static field: "

    .line 6
    .line 7
    const-string v1, "."

    .line 8
    .line 9
    invoke-static {v0, p0, v1, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Lbsh/security/SecurityError;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public static cantImplements(Ljava/lang/Class;)Lbsh/security/SecurityError;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Can\'t implement this interface: "

    .line 6
    .line 7
    invoke-virtual {v0, p0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    new-instance v0, Lbsh/security/SecurityError;

    .line 12
    .line 13
    invoke-direct {v0, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public static cantInvokeLocalMethod(Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3

    .line 1
    invoke-static {p1}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    const-string v0, "("

    .line 6
    .line 7
    const-string v1, ")"

    .line 8
    .line 9
    const-string v2, "Can\'t invoke this local method: "

    .line 10
    .line 11
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    new-instance p1, Lbsh/security/SecurityError;

    .line 16
    .line 17
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    return-object p1
.end method

.method public static cantInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string v0, "."

    .line 14
    .line 15
    const-string v1, "("

    .line 16
    .line 17
    const-string v2, "Can\'t invoke this method: "

    .line 18
    .line 19
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, ")"

    .line 24
    .line 25
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Lbsh/security/SecurityError;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public static cantInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "."

    .line 10
    .line 11
    const-string v1, "("

    .line 12
    .line 13
    const-string v2, "Can\'t invoke this static method: "

    .line 14
    .line 15
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string p1, ")"

    .line 20
    .line 21
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Lbsh/security/SecurityError;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public static cantSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const-string v0, "."

    .line 18
    .line 19
    const-string v1, " ("

    .line 20
    .line 21
    const-string v2, "Can\'t set this field: "

    .line 22
    .line 23
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, ")"

    .line 28
    .line 29
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance p1, Lbsh/security/SecurityError;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public static cantSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string v0, "."

    .line 14
    .line 15
    const-string v1, " ("

    .line 16
    .line 17
    const-string v2, "Can\'t set this static field: "

    .line 18
    .line 19
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, ")"

    .line 24
    .line 25
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Lbsh/security/SecurityError;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public static reflectCantConstruct(Ljava/lang/Class;[Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Object;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p1}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    const-string v0, "("

    .line 10
    .line 11
    const-string v1, ")"

    .line 12
    .line 13
    const-string v2, "Can\'t call this construct using reflection: new "

    .line 14
    .line 15
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->k(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    new-instance p1, Lbsh/security/SecurityError;

    .line 20
    .line 21
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    return-object p1
.end method

.method public static reflectCantGetField(Ljava/lang/Object;Ljava/lang/String;)Lbsh/security/SecurityError;
    .locals 2

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    const-string v0, "Can\'t get this field using reflection: "

    .line 10
    .line 11
    const-string v1, "."

    .line 12
    .line 13
    invoke-static {v0, p0, v1, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    new-instance p1, Lbsh/security/SecurityError;

    .line 18
    .line 19
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    return-object p1
.end method

.method public static reflectCantGetStaticField(Ljava/lang/Class;Ljava/lang/String;)Lbsh/security/SecurityError;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const-string v0, "Can\'t get this static field using reflection: "

    .line 6
    .line 7
    const-string v1, "."

    .line 8
    .line 9
    invoke-static {v0, p0, v1, p1}, Lbc/e;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    new-instance p1, Lbsh/security/SecurityError;

    .line 14
    .line 15
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    return-object p1
.end method

.method public static reflectCantInvokeMethod(Ljava/lang/Object;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string v0, "."

    .line 14
    .line 15
    const-string v1, "("

    .line 16
    .line 17
    const-string v2, "Can\'t invoke this method using reflection: "

    .line 18
    .line 19
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, ")"

    .line 24
    .line 25
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Lbsh/security/SecurityError;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method

.method public static reflectCantInvokeStaticMethod(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "[",
            "Ljava/lang/Object;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    const-string v0, "."

    .line 10
    .line 11
    const-string v1, "("

    .line 12
    .line 13
    const-string v2, "Can\'t invoke this static method using reflection: "

    .line 14
    .line 15
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    const-string p1, ")"

    .line 20
    .line 21
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 22
    .line 23
    .line 24
    move-result-object p0

    .line 25
    new-instance p1, Lbsh/security/SecurityError;

    .line 26
    .line 27
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    return-object p1
.end method

.method public static reflectCantSetField(Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    const-string v0, "."

    .line 18
    .line 19
    const-string v1, " ("

    .line 20
    .line 21
    const-string v2, "Can\'t set this field using reflection: "

    .line 22
    .line 23
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, ")"

    .line 28
    .line 29
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    new-instance p1, Lbsh/security/SecurityError;

    .line 34
    .line 35
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    return-object p1
.end method

.method public static reflectCantSetStaticField(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)Lbsh/security/SecurityError;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ")",
            "Lbsh/security/SecurityError;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeName()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    filled-new-array {p2}, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    move-result-object p2

    .line 9
    invoke-static {p2}, Lbsh/security/SecurityError;->argsTypesString([Ljava/lang/Object;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p2

    .line 13
    const-string v0, "."

    .line 14
    .line 15
    const-string v1, " ("

    .line 16
    .line 17
    const-string v2, "Can\'t set this static field using reflection: "

    .line 18
    .line 19
    invoke-static {v2, p0, v0, p1, v1}, Lbc/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    move-result-object p0

    .line 23
    const-string p1, ")"

    .line 24
    .line 25
    invoke-static {p0, p2, p1}, Leh/a;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    new-instance p1, Lbsh/security/SecurityError;

    .line 30
    .line 31
    invoke-direct {p1, p0}, Lbsh/security/SecurityError;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    return-object p1
.end method


# virtual methods
.method public toEvalError(Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;
    .locals 2

    .line 11
    new-instance v0, Lbsh/EvalError;

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    return-object v0
.end method

.method public toEvalError(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)Lbsh/EvalError;
    .locals 1

    .line 1
    new-instance p1, Lbsh/EvalError;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-direct {p1, v0, p2, p3}, Lbsh/EvalError;-><init>(Ljava/lang/String;Lbsh/Node;Lbsh/CallStack;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method
