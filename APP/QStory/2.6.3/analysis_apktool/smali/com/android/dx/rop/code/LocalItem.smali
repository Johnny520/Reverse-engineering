.class public Lcom/android/dx/rop/code/LocalItem;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/rop/code/LocalItem;",
        ">;"
    }
.end annotation


# instance fields
.field private final name:Lcom/android/dx/rop/cst/CstString;

.field private final signature:Lcom/android/dx/rop/cst/CstString;


# direct methods
.method private constructor <init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/rop/code/LocalItem;->name:Lcom/android/dx/rop/cst/CstString;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 7
    .line 8
    return-void
.end method

.method private static compareHandlesNulls(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)I
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x0

    .line 4
    return p0

    .line 5
    :cond_0
    if-nez p0, :cond_1

    .line 6
    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    :cond_1
    if-nez p1, :cond_2

    .line 10
    .line 11
    const/4 p0, 0x1

    .line 12
    return p0

    .line 13
    :cond_2
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public static make(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/rop/code/LocalItem;
    .locals 1

    .line 1
    if-nez p0, :cond_0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    new-instance v0, Lcom/android/dx/rop/code/LocalItem;

    .line 8
    .line 9
    invoke-direct {v0, p0, p1}, Lcom/android/dx/rop/code/LocalItem;-><init>(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method


# virtual methods
.method public compareTo(Lcom/android/dx/rop/code/LocalItem;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/LocalItem;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    iget-object v1, p1, Lcom/android/dx/rop/code/LocalItem;->name:Lcom/android/dx/rop/cst/CstString;

    .line 4
    .line 5
    invoke-static {v0, v1}, Lcom/android/dx/rop/code/LocalItem;->compareHandlesNulls(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return v0

    .line 12
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 13
    .line 14
    iget-object p1, p1, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 15
    .line 16
    invoke-static {p0, p1}, Lcom/android/dx/rop/code/LocalItem;->compareHandlesNulls(Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;)I

    .line 17
    .line 18
    .line 19
    move-result p0

    .line 20
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 21
    check-cast p1, Lcom/android/dx/rop/code/LocalItem;

    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/LocalItem;->compareTo(Lcom/android/dx/rop/code/LocalItem;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/rop/code/LocalItem;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/rop/code/LocalItem;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/LocalItem;->compareTo(Lcom/android/dx/rop/code/LocalItem;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    return v1
.end method

.method public getName()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/LocalItem;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSignature()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/LocalItem;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    move v0, v1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v0

    .line 12
    :goto_0
    mul-int/lit8 v0, v0, 0x1f

    .line 13
    .line 14
    iget-object p0, p0, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 15
    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    goto :goto_1

    .line 19
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->hashCode()I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    :goto_1
    add-int/2addr v0, v1

    .line 24
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/LocalItem;->name:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    iget-object v1, p0, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 6
    .line 7
    if-nez v1, :cond_0

    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const-string v1, ""

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    iget-object v0, p0, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    return-object v1

    .line 23
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v2, "["

    .line 26
    .line 27
    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iget-object v2, p0, Lcom/android/dx/rop/code/LocalItem;->name:Lcom/android/dx/rop/cst/CstString;

    .line 31
    .line 32
    if-nez v2, :cond_2

    .line 33
    .line 34
    move-object v2, v1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    move-result-object v2

    .line 40
    :goto_0
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v2, "|"

    .line 44
    .line 45
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-object p0, p0, Lcom/android/dx/rop/code/LocalItem;->signature:Lcom/android/dx/rop/cst/CstString;

    .line 49
    .line 50
    if-nez p0, :cond_3

    .line 51
    .line 52
    goto :goto_1

    .line 53
    :cond_3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstString;->toQuoted()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    :goto_1
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
