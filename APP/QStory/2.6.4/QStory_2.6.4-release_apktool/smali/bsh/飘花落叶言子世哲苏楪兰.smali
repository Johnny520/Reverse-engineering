.class public abstract Lbsh/飘花落叶言子世哲苏楪兰;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/reflect/Member;


# instance fields
.field public final 飘花落叶言子楪兰世哲苏:Ljava/lang/String;

.field public final 飘花落叶言子楪兰世苏哲:Ljava/lang/String;

.field public final 飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

.field public 飘花落叶言子楪兰哲苏世:I

.field public final 飘花落叶言子楪兰苏世哲:I

.field public final 飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

.field public final 飘花落叶言子楪哲兰世苏:Z

.field public final 飘花落叶言子楪哲兰苏世:Z

.field public 飘花落叶言子楪哲苏兰世:Ljava/lang/invoke/MethodHandle;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/AccessibleObject;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/invoke/MethodHandle;

    .line 6
    .line 7
    new-instance v0, Ljava/util/ArrayList;

    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

    .line 13
    .line 14
    move-object v0, p1

    .line 15
    check-cast v0, Ljava/lang/reflect/Member;

    .line 16
    .line 17
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iput v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲:I

    .line 22
    .line 23
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 24
    .line 25
    .line 26
    move-result-object v1

    .line 27
    iput-object v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 28
    .line 29
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getName()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    iput-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    iput-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 40
    .line 41
    const/4 v0, 0x0

    .line 42
    iput v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 43
    .line 44
    move-object v0, p1

    .line 45
    check-cast v0, Ljava/lang/reflect/Member;

    .line 46
    .line 47
    sget-object v1, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;

    .line 48
    .line 49
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getModifiers()I

    .line 50
    .line 51
    .line 52
    move-result v1

    .line 53
    invoke-static {v1}, Ljava/lang/reflect/Modifier;->isStatic(I)Z

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iput-boolean v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 58
    .line 59
    invoke-interface {v0}, Ljava/lang/reflect/Member;->isSynthetic()Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iput-boolean v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰苏世:Z

    .line 64
    .line 65
    invoke-static {}, Lbsh/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪世苏哲兰()Z

    .line 66
    .line 67
    .line 68
    move-result p0

    .line 69
    if-eqz p0, :cond_0

    .line 70
    .line 71
    invoke-interface {v0}, Ljava/lang/reflect/Member;->getDeclaringClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object p0

    .line 75
    const-class v0, Ljava/lang/Class;

    .line 76
    .line 77
    if-eq p0, v0, :cond_0

    .line 78
    .line 79
    const/4 p0, 0x1

    .line 80
    :try_start_0
    invoke-virtual {p1, p0}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 81
    .line 82
    .line 83
    :catch_0
    :cond_0
    return-void
.end method

.method public static 飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-static {p1, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪苏哲世兰(Ljava/lang/Object;Z)Ljava/lang/Class;

    .line 3
    .line 4
    .line 5
    move-result-object v1

    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    if-nez v1, :cond_1

    .line 13
    .line 14
    :cond_0
    invoke-static {p1, p0, v0}, Lbsh/飘花落叶言子苏世哲楪兰;->飘花落叶言子楪世兰哲苏(Ljava/lang/Object;Ljava/lang/Class;I)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :cond_1
    invoke-static {p1}, Lbsh/Primitive;->unwrap(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    goto :goto_2

    .line 5
    :cond_0
    if-ne p0, p1, :cond_1

    .line 6
    .line 7
    goto :goto_1

    .line 8
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    if-eq v1, v2, :cond_2

    .line 17
    .line 18
    goto :goto_2

    .line 19
    :cond_2
    check-cast p1, Lbsh/飘花落叶言子世哲苏楪兰;

    .line 20
    .line 21
    iget-object v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 22
    .line 23
    iget-object v2, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v1

    .line 29
    if-eqz v1, :cond_6

    .line 30
    .line 31
    iget-object v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 32
    .line 33
    iget-object v2, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 34
    .line 35
    if-ne v1, v2, :cond_6

    .line 36
    .line 37
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 42
    .line 43
    .line 44
    move-result v2

    .line 45
    if-ne v1, v2, :cond_6

    .line 46
    .line 47
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 48
    .line 49
    .line 50
    move-result-object v1

    .line 51
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    if-ne v1, v2, :cond_6

    .line 56
    .line 57
    iget v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲:I

    .line 58
    .line 59
    iget v2, p1, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲:I

    .line 60
    .line 61
    if-eq v1, v2, :cond_3

    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move v1, v0

    .line 65
    :goto_0
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-ge v1, v2, :cond_5

    .line 70
    .line 71
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    move-result-object v2

    .line 75
    aget-object v2, v2, v1

    .line 76
    .line 77
    invoke-virtual {p1}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    aget-object v3, v3, v1

    .line 82
    .line 83
    if-eq v2, v3, :cond_4

    .line 84
    .line 85
    goto :goto_2

    .line 86
    :cond_4
    add-int/lit8 v1, v1, 0x1

    .line 87
    .line 88
    goto :goto_0

    .line 89
    :cond_5
    :goto_1
    const/4 p0, 0x1

    .line 90
    return p0

    .line 91
    :cond_6
    :goto_2
    return v0
.end method

.method public final getDeclaringClass()Ljava/lang/Class;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public final getModifiers()I
    .locals 0

    .line 1
    iget p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲:I

    .line 2
    .line 3
    return p0
.end method

.method public final getName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    iget-object v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 10
    .line 11
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    xor-int/2addr v0, v1

    .line 16
    iget-object v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏哲世:Ljava/lang/Class;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    xor-int/2addr v0, v1

    .line 23
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    xor-int/2addr v0, v1

    .line 28
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v1

    .line 36
    xor-int/2addr v0, v1

    .line 37
    iget v1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰苏世哲:I

    .line 38
    .line 39
    xor-int/2addr v0, v1

    .line 40
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 41
    .line 42
    .line 43
    move-result-object p0

    .line 44
    invoke-static {p0}, Ljava/util/stream/Stream;->of([Ljava/lang/Object;)Ljava/util/stream/Stream;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    new-instance v1, Lbsh/飘花落叶言子楪世哲苏兰;

    .line 49
    .line 50
    const/16 v2, 0xb

    .line 51
    .line 52
    invoke-direct {v1, v2}, Lbsh/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 53
    .line 54
    .line 55
    invoke-interface {p0, v1}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    const/16 v1, 0x4b

    .line 60
    .line 61
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    new-instance v2, Lbsh/飘花落叶言子世哲楪苏兰;

    .line 66
    .line 67
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-interface {p0, v1, v2}, Ljava/util/stream/Stream;->reduce(Ljava/lang/Object;Ljava/util/function/BinaryOperator;)Ljava/lang/Object;

    .line 71
    .line 72
    .line 73
    move-result-object p0

    .line 74
    check-cast p0, Ljava/lang/Integer;

    .line 75
    .line 76
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 77
    .line 78
    .line 79
    move-result p0

    .line 80
    xor-int/2addr p0, v0

    .line 81
    return p0
.end method

.method public final isSynthetic()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰苏世:Z

    .line 2
    .line 3
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世苏哲:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract 飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;
.end method

.method public abstract 飘花落叶言子楪世兰苏哲()I
.end method

.method public final 飘花落叶言子楪世哲兰苏()[Ljava/lang/String;
    .locals 2

    .line 1
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {v0, p0}, Ljava/lang/invoke/MethodType;->methodType(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/invoke/MethodType;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p0}, Ljava/lang/invoke/MethodType;->parameterList()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    new-instance v0, Lbsh/飘花落叶言子楪世哲苏兰;

    .line 22
    .line 23
    const/4 v1, 0x1

    .line 24
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪世哲苏兰;-><init>(I)V

    .line 25
    .line 26
    .line 27
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    new-instance v0, Lbsh/飘花落叶言子楪哲世兰苏;

    .line 32
    .line 33
    const/4 v1, 0x3

    .line 34
    invoke-direct {v0, v1}, Lbsh/飘花落叶言子楪哲世兰苏;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->toArray(Ljava/util/function/IntFunction;)[Ljava/lang/Object;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    check-cast p0, [Ljava/lang/String;

    .line 42
    .line 43
    return-object p0
.end method

.method public final 飘花落叶言子楪世哲苏兰()Ljava/lang/invoke/MethodHandle;
    .locals 1

    .line 1
    iget-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/invoke/MethodHandle;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    invoke-virtual {p0, v0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    iput-object v0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/invoke/MethodHandle;

    .line 11
    .line 12
    :cond_0
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲苏兰世:Ljava/lang/invoke/MethodHandle;

    .line 13
    .line 14
    return-object p0
.end method

.method public 飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;
    .locals 4

    .line 1
    iget p1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 2
    .line 3
    array-length v0, p2

    .line 4
    if-gt p1, v0, :cond_1

    .line 5
    .line 6
    iget-object p1, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲世苏:Ljava/util/ArrayList;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    move v1, v0

    .line 13
    :goto_0
    iget v2, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰哲苏世:I

    .line 14
    .line 15
    if-ge v1, v2, :cond_0

    .line 16
    .line 17
    aget-object v2, p2, v1

    .line 18
    .line 19
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 20
    .line 21
    .line 22
    move-result-object v3

    .line 23
    aget-object v3, v3, v1

    .line 24
    .line 25
    invoke-static {v3, v2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏哲兰(Ljava/lang/Class;Ljava/lang/Object;)Ljava/lang/Object;

    .line 26
    .line 27
    .line 28
    move-result-object v2

    .line 29
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 30
    .line 31
    .line 32
    add-int/lit8 v1, v1, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    new-instance p0, Lbsh/飘花落叶言子世哲楪兰苏;

    .line 36
    .line 37
    invoke-direct {p0, p1, v0}, Lbsh/飘花落叶言子世哲楪兰苏;-><init>(Ljava/util/ArrayList;Z)V

    .line 38
    .line 39
    .line 40
    return-object p0

    .line 41
    :cond_1
    new-instance p1, Ljava/lang/reflect/InvocationTargetException;

    .line 42
    .line 43
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰哲苏()[Ljava/lang/Class;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-static {p2}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    new-instance v0, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, "Insufficient parameters passed for method: "

    .line 54
    .line 55
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    iget-object p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪兰世哲苏:Ljava/lang/String;

    .line 59
    .line 60
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 67
    .line 68
    .line 69
    move-result-object p0

    .line 70
    const/4 p2, 0x0

    .line 71
    invoke-direct {p1, p2, p0}, Ljava/lang/reflect/InvocationTargetException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw p1
.end method

.method public 飘花落叶言子楪哲世兰苏()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲兰世苏:Z

    .line 2
    .line 3
    return p0
.end method

.method public 飘花落叶言子楪哲世苏兰()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子楪哲苏世兰()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public abstract 飘花落叶言子楪哲苏兰世(Ljava/lang/invoke/MethodHandle;)Ljava/lang/invoke/MethodHandle;
.end method

.method public 飘花落叶言子楪苏世兰哲()Ljava/lang/Class;
    .locals 0

    .line 1
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    return-object p0
.end method

.method public abstract 飘花落叶言子楪苏世哲兰()Ljava/lang/Class;
.end method

.method public 飘花落叶言子楪苏兰世哲()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public 飘花落叶言子楪苏兰哲世()Z
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return p0
.end method

.method public varargs declared-synchronized 飘花落叶言子楪苏哲世兰(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    monitor-enter p0

    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    :try_start_0
    sget-object p2, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子楪世苏哲兰:[Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 5
    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    goto :goto_1

    .line 9
    :cond_0
    :goto_0
    :try_start_1
    invoke-virtual {p0, p1, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪苏世哲兰()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object p2

    .line 17
    invoke-static {p1, p2}, Lbsh/Primitive;->wrap(Ljava/lang/Object;Ljava/lang/Class;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 21
    monitor-exit p0

    .line 22
    return-object p1

    .line 23
    :catchall_1
    move-exception p1

    .line 24
    :try_start_2
    new-instance p2, Ljava/lang/reflect/InvocationTargetException;

    .line 25
    .line 26
    invoke-direct {p2, p1}, Ljava/lang/reflect/InvocationTargetException;-><init>(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    throw p2

    .line 30
    :goto_1
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 31
    throw p1
.end method

.method public final declared-synchronized 飘花落叶言子楪苏哲兰世(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "Invoking method (entry): "

    .line 3
    .line 4
    invoke-static {v0, p0, p2}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;[Ljava/lang/Object;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世苏兰哲(Ljava/lang/Object;[Ljava/lang/Object;)Lbsh/飘花落叶言子世哲楪兰苏;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    iget-object p2, p1, Lbsh/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏哲兰:Ljava/util/List;

    .line 12
    .line 13
    const-string v0, "Invoking method (after): "

    .line 14
    .line 15
    sget-object v1, Lbsh/Interpreter;->DEBUG:Ljava/lang/ThreadLocal;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    check-cast v1, Ljava/lang/Boolean;

    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 24
    .line 25
    .line 26
    move-result v1

    .line 27
    if-eqz v1, :cond_0

    .line 28
    .line 29
    invoke-interface {p2}, Ljava/util/List;->toArray()[Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    move-result-object v1

    .line 33
    invoke-static {v0, p0, v1}, Lbsh/飘花落叶言子苏楪兰世哲;->飘花落叶言子世楪哲苏兰(Ljava/lang/String;Lbsh/飘花落叶言子世哲苏楪兰;[Ljava/lang/Object;)V

    .line 34
    .line 35
    .line 36
    :cond_0
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世兰苏哲()I

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-lez v0, :cond_2

    .line 41
    .line 42
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/invoke/MethodHandle;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    iget-boolean p1, p1, Lbsh/飘花落叶言子世哲楪兰苏;->飘花落叶言子楪世苏兰哲:Z

    .line 47
    .line 48
    if-eqz p1, :cond_1

    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/lang/invoke/MethodHandle;->asFixedArity()Ljava/lang/invoke/MethodHandle;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception p1

    .line 56
    goto :goto_2

    .line 57
    :cond_1
    :goto_0
    invoke-virtual {v0, p2}, Ljava/lang/invoke/MethodHandle;->invokeWithArguments(Ljava/util/List;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 61
    monitor-exit p0

    .line 62
    return-object p1

    .line 63
    :cond_2
    :try_start_1
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪哲世兰苏()Z

    .line 64
    .line 65
    .line 66
    move-result p1

    .line 67
    if-nez p1, :cond_4

    .line 68
    .line 69
    instance-of p1, p0, Lbsh/飘花落叶言子世苏楪哲兰;

    .line 70
    .line 71
    if-eqz p1, :cond_3

    .line 72
    .line 73
    goto :goto_1

    .line 74
    :cond_3
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/invoke/MethodHandle;

    .line 75
    .line 76
    .line 77
    move-result-object p1

    .line 78
    const/4 v0, 0x0

    .line 79
    invoke-interface {p2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 80
    .line 81
    .line 82
    move-result-object p2

    .line 83
    invoke-polymorphic {p1, p2}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, (Ljava/lang/Object;)Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    .line 87
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 88
    monitor-exit p0

    .line 89
    return-object p1

    .line 90
    :cond_4
    :goto_1
    :try_start_2
    invoke-virtual {p0}, Lbsh/飘花落叶言子世哲苏楪兰;->飘花落叶言子楪世哲苏兰()Ljava/lang/invoke/MethodHandle;

    .line 91
    .line 92
    .line 93
    move-result-object p1

    .line 94
    invoke-polymorphic {p1}, Ljava/lang/invoke/MethodHandle;->invoke([Ljava/lang/Object;)Ljava/lang/Object;, ()Ljava/lang/Object;

    .line 95
    .line 96
    .line 97
    .line 98
    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 99
    monitor-exit p0

    .line 100
    return-object p1

    .line 101
    :goto_2
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 102
    throw p1
.end method
