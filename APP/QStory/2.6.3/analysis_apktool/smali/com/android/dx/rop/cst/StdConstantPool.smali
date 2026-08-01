.class public final Lcom/android/dx/rop/cst/StdConstantPool;
.super Lcom/android/dx/util/MutabilityControl;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lcom/android/dx/rop/cst/ConstantPool;


# instance fields
.field private final entries:[Lcom/android/dx/rop/cst/Constant;


# direct methods
.method public constructor <init>(I)V
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    if-le p1, v0, :cond_0

    .line 3
    .line 4
    move v1, v0

    .line 5
    goto :goto_0

    .line 6
    :cond_0
    const/4 v1, 0x0

    .line 7
    :goto_0
    invoke-direct {p0, v1}, Lcom/android/dx/util/MutabilityControl;-><init>(Z)V

    .line 8
    .line 9
    .line 10
    if-lt p1, v0, :cond_1

    .line 11
    .line 12
    new-array p1, p1, [Lcom/android/dx/rop/cst/Constant;

    .line 13
    .line 14
    iput-object p1, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 15
    .line 16
    return-void

    .line 17
    :cond_1
    const-string p0, "size < 1"

    .line 18
    .line 19
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0
.end method

.method private static throwInvalid(I)Lcom/android/dx/rop/cst/Constant;
    .locals 3

    .line 1
    new-instance v0, Lcom/android/dex/util/ExceptionWithContext;

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "invalid constant pool index "

    .line 6
    .line 7
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-static {v1, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪兰哲苏(Ljava/lang/StringBuilder;I)Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-direct {v0, p0}, Lcom/android/dex/util/ExceptionWithContext;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    throw v0
.end method


# virtual methods
.method public get(I)Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    aget-object p0, p0, p1

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    .line 7
    invoke-static {p1}, Lcom/android/dx/rop/cst/StdConstantPool;->throwInvalid(I)Lcom/android/dx/rop/cst/Constant;
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    .line 9
    .line 10
    :cond_0
    return-object p0

    .line 11
    :catch_0
    invoke-static {p1}, Lcom/android/dx/rop/cst/StdConstantPool;->throwInvalid(I)Lcom/android/dx/rop/cst/Constant;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method

.method public get0Ok(I)Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return-object p0

    .line 5
    :cond_0
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/StdConstantPool;->get(I)Lcom/android/dx/rop/cst/Constant;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method

.method public getEntries()[Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOrNull(I)Lcom/android/dx/rop/cst/Constant;
    .locals 0

    .line 1
    :try_start_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    aget-object p0, p0, p1
    :try_end_0
    .catch Ljava/lang/IndexOutOfBoundsException; {:try_start_0 .. :try_end_0} :catch_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :catch_0
    invoke-static {p1}, Lcom/android/dx/rop/cst/StdConstantPool;->throwInvalid(I)Lcom/android/dx/rop/cst/Constant;

    .line 7
    .line 8
    .line 9
    move-result-object p0

    .line 10
    return-object p0
.end method

.method public set(ILcom/android/dx/rop/cst/Constant;)V
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/MutabilityControl;->throwIfImmutable()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    if-eqz p2, :cond_0

    .line 6
    .line 7
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/Constant;->isCategory2()Z

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    move v1, v0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 v1, 0x0

    .line 16
    :goto_0
    if-lt p1, v0, :cond_4

    .line 17
    .line 18
    const/4 v2, 0x0

    .line 19
    if-eqz v1, :cond_2

    .line 20
    .line 21
    iget-object v1, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 22
    .line 23
    array-length v3, v1

    .line 24
    sub-int/2addr v3, v0

    .line 25
    if-eq p1, v3, :cond_1

    .line 26
    .line 27
    add-int/lit8 v0, p1, 0x1

    .line 28
    .line 29
    aput-object v2, v1, v0

    .line 30
    .line 31
    goto :goto_1

    .line 32
    :cond_1
    const-string p0, "(n == size - 1) && cst.isCategory2()"

    .line 33
    .line 34
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    return-void

    .line 38
    :cond_2
    :goto_1
    if-eqz p2, :cond_3

    .line 39
    .line 40
    iget-object v0, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 41
    .line 42
    aget-object v1, v0, p1

    .line 43
    .line 44
    if-nez v1, :cond_3

    .line 45
    .line 46
    add-int/lit8 v1, p1, -0x1

    .line 47
    .line 48
    aget-object v0, v0, v1

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/Constant;->isCategory2()Z

    .line 53
    .line 54
    .line 55
    move-result v0

    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v0, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 59
    .line 60
    aput-object v2, v0, v1

    .line 61
    .line 62
    :cond_3
    iget-object p0, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 63
    .line 64
    aput-object p2, p0, p1

    .line 65
    .line 66
    return-void

    .line 67
    :cond_4
    const-string p0, "n < 1"

    .line 68
    .line 69
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/cst/StdConstantPool;->entries:[Lcom/android/dx/rop/cst/Constant;

    .line 2
    .line 3
    array-length p0, p0

    .line 4
    return p0
.end method
