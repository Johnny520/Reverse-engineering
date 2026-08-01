.class public final Lcom/android/dx/rop/code/Rop;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final BRANCH_GOTO:I = 0x3

.field public static final BRANCH_IF:I = 0x4

.field public static final BRANCH_MAX:I = 0x6

.field public static final BRANCH_MIN:I = 0x1

.field public static final BRANCH_NONE:I = 0x1

.field public static final BRANCH_RETURN:I = 0x2

.field public static final BRANCH_SWITCH:I = 0x5

.field public static final BRANCH_THROW:I = 0x6


# instance fields
.field private final branchingness:I

.field private final exceptions:Lcom/android/dx/rop/type/TypeList;

.field private final isCallLike:Z

.field private final nickname:Ljava/lang/String;

.field private final opcode:I

.field private final result:Lcom/android/dx/rop/type/Type;

.field private final sources:Lcom/android/dx/rop/type/TypeList;


# direct methods
.method public constructor <init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;ILjava/lang/String;)V
    .locals 8

    .line 76
    sget-object v4, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move v5, p4

    move-object v7, p5

    invoke-direct/range {v0 .. v7}, Lcom/android/dx/rop/code/Rop;-><init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;ILjava/lang/String;)V
    .locals 8

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v7, p6

    .line 75
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/rop/code/Rop;-><init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;IZLjava/lang/String;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p2, :cond_5

    .line 6
    .line 7
    if-eqz p3, :cond_4

    .line 8
    .line 9
    if-eqz p4, :cond_3

    .line 10
    .line 11
    const/4 v1, 0x1

    .line 12
    if-lt p5, v1, :cond_2

    .line 13
    .line 14
    const/4 v1, 0x6

    .line 15
    if-gt p5, v1, :cond_2

    .line 16
    .line 17
    invoke-interface {p4}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    if-ne p5, v1, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string p0, "exceptions / branchingness mismatch"

    .line 27
    .line 28
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    throw v0

    .line 32
    :cond_1
    :goto_0
    iput p1, p0, Lcom/android/dx/rop/code/Rop;->opcode:I

    .line 33
    .line 34
    iput-object p2, p0, Lcom/android/dx/rop/code/Rop;->result:Lcom/android/dx/rop/type/Type;

    .line 35
    .line 36
    iput-object p3, p0, Lcom/android/dx/rop/code/Rop;->sources:Lcom/android/dx/rop/type/TypeList;

    .line 37
    .line 38
    iput-object p4, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 39
    .line 40
    iput p5, p0, Lcom/android/dx/rop/code/Rop;->branchingness:I

    .line 41
    .line 42
    iput-boolean p6, p0, Lcom/android/dx/rop/code/Rop;->isCallLike:Z

    .line 43
    .line 44
    iput-object p7, p0, Lcom/android/dx/rop/code/Rop;->nickname:Ljava/lang/String;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_2
    const-string p0, "invalid branchingness: "

    .line 48
    .line 49
    invoke-static {p5, p0}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object p0

    .line 53
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 54
    .line 55
    .line 56
    throw v0

    .line 57
    :cond_3
    const-string p0, "exceptions == null"

    .line 58
    .line 59
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    throw v0

    .line 63
    :cond_4
    const-string p0, "sources == null"

    .line 64
    .line 65
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    throw v0

    .line 69
    :cond_5
    const-string p0, "result == null"

    .line 70
    .line 71
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 72
    .line 73
    .line 74
    throw v0
.end method

.method public constructor <init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;Ljava/lang/String;)V
    .locals 8

    const/4 v5, 0x6

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v7, p5

    .line 78
    invoke-direct/range {v0 .. v7}, Lcom/android/dx/rop/code/Rop;-><init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Ljava/lang/String;)V
    .locals 8

    .line 77
    sget-object v4, Lcom/android/dx/rop/type/StdTypeList;->EMPTY:Lcom/android/dx/rop/type/StdTypeList;

    const/4 v5, 0x1

    const/4 v6, 0x0

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v7, p4

    invoke-direct/range {v0 .. v7}, Lcom/android/dx/rop/code/Rop;-><init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;IZLjava/lang/String;)V

    return-void
.end method

.method public constructor <init>(ILcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;)V
    .locals 8

    .line 79
    sget-object v2, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v5, 0x6

    move-object v0, p0

    move v1, p1

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v7}, Lcom/android/dx/rop/code/Rop;-><init>(ILcom/android/dx/rop/type/Type;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/type/TypeList;IZLjava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final canThrow()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const/4 p0, 0x1

    .line 10
    return p0

    .line 11
    :cond_0
    const/4 p0, 0x0

    .line 12
    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/android/dx/rop/code/Rop;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/android/dx/rop/code/Rop;

    .line 12
    .line 13
    iget v1, p0, Lcom/android/dx/rop/code/Rop;->opcode:I

    .line 14
    .line 15
    iget v3, p1, Lcom/android/dx/rop/code/Rop;->opcode:I

    .line 16
    .line 17
    if-ne v1, v3, :cond_2

    .line 18
    .line 19
    iget v1, p0, Lcom/android/dx/rop/code/Rop;->branchingness:I

    .line 20
    .line 21
    iget v3, p1, Lcom/android/dx/rop/code/Rop;->branchingness:I

    .line 22
    .line 23
    if-ne v1, v3, :cond_2

    .line 24
    .line 25
    iget-object v1, p0, Lcom/android/dx/rop/code/Rop;->result:Lcom/android/dx/rop/type/Type;

    .line 26
    .line 27
    iget-object v3, p1, Lcom/android/dx/rop/code/Rop;->result:Lcom/android/dx/rop/type/Type;

    .line 28
    .line 29
    if-ne v1, v3, :cond_2

    .line 30
    .line 31
    iget-object v1, p0, Lcom/android/dx/rop/code/Rop;->sources:Lcom/android/dx/rop/type/TypeList;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/android/dx/rop/code/Rop;->sources:Lcom/android/dx/rop/type/TypeList;

    .line 34
    .line 35
    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-eqz v1, :cond_2

    .line 40
    .line 41
    iget-object p0, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 42
    .line 43
    iget-object p1, p1, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 44
    .line 45
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p0

    .line 49
    if-eqz p0, :cond_2

    .line 50
    .line 51
    return v0

    .line 52
    :cond_2
    return v2
.end method

.method public getBranchingness()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/Rop;->branchingness:I

    .line 2
    .line 3
    return p0
.end method

.method public getExceptions()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getNickname()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/Rop;->nickname:Ljava/lang/String;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/rop/code/Rop;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public getOpcode()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/Rop;->opcode:I

    .line 2
    .line 3
    return p0
.end method

.method public getResult()Lcom/android/dx/rop/type/Type;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/Rop;->result:Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSources()Lcom/android/dx/rop/type/TypeList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/Rop;->sources:Lcom/android/dx/rop/type/TypeList;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/rop/code/Rop;->opcode:I

    .line 2
    .line 3
    mul-int/lit8 v0, v0, 0x1f

    .line 4
    .line 5
    iget v1, p0, Lcom/android/dx/rop/code/Rop;->branchingness:I

    .line 6
    .line 7
    add-int/2addr v0, v1

    .line 8
    mul-int/lit8 v0, v0, 0x1f

    .line 9
    .line 10
    iget-object v1, p0, Lcom/android/dx/rop/code/Rop;->result:Lcom/android/dx/rop/type/Type;

    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/android/dx/rop/type/Type;->hashCode()I

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    add-int/2addr v1, v0

    .line 17
    mul-int/lit8 v1, v1, 0x1f

    .line 18
    .line 19
    iget-object v0, p0, Lcom/android/dx/rop/code/Rop;->sources:Lcom/android/dx/rop/type/TypeList;

    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    add-int/2addr v0, v1

    .line 26
    mul-int/lit8 v0, v0, 0x1f

    .line 27
    .line 28
    iget-object p0, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 29
    .line 30
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 31
    .line 32
    .line 33
    move-result p0

    .line 34
    add-int/2addr p0, v0

    .line 35
    return p0
.end method

.method public isCallLike()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/rop/code/Rop;->isCallLike:Z

    .line 2
    .line 3
    return p0
.end method

.method public isCommutative()Z
    .locals 1

    .line 1
    iget p0, p0, Lcom/android/dx/rop/code/Rop;->opcode:I

    .line 2
    .line 3
    const/16 v0, 0xe

    .line 4
    .line 5
    if-eq p0, v0, :cond_0

    .line 6
    .line 7
    const/16 v0, 0x10

    .line 8
    .line 9
    if-eq p0, v0, :cond_0

    .line 10
    .line 11
    packed-switch p0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    :cond_0
    :pswitch_0
    const/4 p0, 0x1

    .line 17
    return p0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x14
        :pswitch_0
        :pswitch_0
        :pswitch_0
    .end packed-switch
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x28

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-string v1, "Rop{"

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    iget v1, p0, Lcom/android/dx/rop/code/Rop;->opcode:I

    .line 14
    .line 15
    invoke-static {v1}, Lcom/android/dx/rop/code/RegOps;->opName(I)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    iget-object v1, p0, Lcom/android/dx/rop/code/Rop;->result:Lcom/android/dx/rop/type/Type;

    .line 23
    .line 24
    sget-object v2, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 25
    .line 26
    const-string v3, " ."

    .line 27
    .line 28
    const-string v4, " "

    .line 29
    .line 30
    if-eq v1, v2, :cond_0

    .line 31
    .line 32
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/android/dx/rop/code/Rop;->result:Lcom/android/dx/rop/type/Type;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    :goto_0
    const-string v1, " <-"

    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v1, p0, Lcom/android/dx/rop/code/Rop;->sources:Lcom/android/dx/rop/type/TypeList;

    .line 50
    .line 51
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 52
    .line 53
    .line 54
    move-result v1

    .line 55
    const/16 v2, 0x20

    .line 56
    .line 57
    const/4 v5, 0x0

    .line 58
    if-nez v1, :cond_1

    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    goto :goto_2

    .line 64
    :cond_1
    move v3, v5

    .line 65
    :goto_1
    if-ge v3, v1, :cond_2

    .line 66
    .line 67
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    iget-object v6, p0, Lcom/android/dx/rop/code/Rop;->sources:Lcom/android/dx/rop/type/TypeList;

    .line 71
    .line 72
    invoke-interface {v6, v3}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    add-int/lit8 v3, v3, 0x1

    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_2
    :goto_2
    iget-boolean v1, p0, Lcom/android/dx/rop/code/Rop;->isCallLike:Z

    .line 83
    .line 84
    if-eqz v1, :cond_3

    .line 85
    .line 86
    const-string v1, " call"

    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    :cond_3
    iget-object v1, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 92
    .line 93
    invoke-interface {v1}, Lcom/android/dx/rop/type/TypeList;->size()I

    .line 94
    .line 95
    .line 96
    move-result v1

    .line 97
    if-eqz v1, :cond_5

    .line 98
    .line 99
    const-string v3, " throws"

    .line 100
    .line 101
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    .line 104
    :goto_3
    if-ge v5, v1, :cond_b

    .line 105
    .line 106
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    iget-object v3, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 110
    .line 111
    invoke-interface {v3, v5}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 112
    .line 113
    .line 114
    move-result-object v3

    .line 115
    sget-object v4, Lcom/android/dx/rop/type/Type;->THROWABLE:Lcom/android/dx/rop/type/Type;

    .line 116
    .line 117
    if-ne v3, v4, :cond_4

    .line 118
    .line 119
    const-string v3, "<any>"

    .line 120
    .line 121
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    goto :goto_4

    .line 125
    :cond_4
    iget-object v3, p0, Lcom/android/dx/rop/code/Rop;->exceptions:Lcom/android/dx/rop/type/TypeList;

    .line 126
    .line 127
    invoke-interface {v3, v5}, Lcom/android/dx/rop/type/TypeList;->getType(I)Lcom/android/dx/rop/type/Type;

    .line 128
    .line 129
    .line 130
    move-result-object v3

    .line 131
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 135
    .line 136
    goto :goto_3

    .line 137
    :cond_5
    iget v1, p0, Lcom/android/dx/rop/code/Rop;->branchingness:I

    .line 138
    .line 139
    const/4 v2, 0x1

    .line 140
    if-eq v1, v2, :cond_a

    .line 141
    .line 142
    const/4 v2, 0x2

    .line 143
    if-eq v1, v2, :cond_9

    .line 144
    .line 145
    const/4 v2, 0x3

    .line 146
    if-eq v1, v2, :cond_8

    .line 147
    .line 148
    const/4 v2, 0x4

    .line 149
    if-eq v1, v2, :cond_7

    .line 150
    .line 151
    const/4 v2, 0x5

    .line 152
    if-eq v1, v2, :cond_6

    .line 153
    .line 154
    new-instance v1, Ljava/lang/StringBuilder;

    .line 155
    .line 156
    invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 157
    .line 158
    .line 159
    iget p0, p0, Lcom/android/dx/rop/code/Rop;->branchingness:I

    .line 160
    .line 161
    invoke-static {p0}, Lcom/android/dx/util/Hex;->u1(I)Ljava/lang/String;

    .line 162
    .line 163
    .line 164
    move-result-object p0

    .line 165
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    .line 170
    .line 171
    move-result-object p0

    .line 172
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    goto :goto_5

    .line 176
    :cond_6
    const-string p0, " switches"

    .line 177
    .line 178
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    goto :goto_5

    .line 182
    :cond_7
    const-string p0, " ifs"

    .line 183
    .line 184
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    goto :goto_5

    .line 188
    :cond_8
    const-string p0, " gotos"

    .line 189
    .line 190
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 191
    .line 192
    .line 193
    goto :goto_5

    .line 194
    :cond_9
    const-string p0, " returns"

    .line 195
    .line 196
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    goto :goto_5

    .line 200
    :cond_a
    const-string p0, " flows"

    .line 201
    .line 202
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    :cond_b
    :goto_5
    const/16 p0, 0x7d

    .line 206
    .line 207
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 211
    .line 212
    .line 213
    move-result-object p0

    .line 214
    return-object p0
.end method
