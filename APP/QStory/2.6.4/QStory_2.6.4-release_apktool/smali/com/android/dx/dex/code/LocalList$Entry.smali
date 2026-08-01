.class public Lcom/android/dx/dex/code/LocalList$Entry;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/dex/code/LocalList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Entry"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/code/LocalList$Entry;",
        ">;"
    }
.end annotation


# instance fields
.field private final address:I

.field private final disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

.field private final spec:Lcom/android/dx/rop/code/RegisterSpec;

.field private final type:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(ILcom/android/dx/dex/code/LocalList$Disposition;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-ltz p1, :cond_2

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {p3}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 10
    .line 11
    .line 12
    move-result-object v1
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    iput p1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 16
    .line 17
    iput-object p2, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 18
    .line 19
    iput-object p3, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 20
    .line 21
    invoke-virtual {p3}, Lcom/android/dx/rop/code/RegisterSpec;->getType()Lcom/android/dx/rop/type/Type;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-static {p1}, Lcom/android/dx/rop/cst/CstType;->intern(Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/CstType;

    .line 26
    .line 27
    .line 28
    move-result-object p1

    .line 29
    iput-object p1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->type:Lcom/android/dx/rop/cst/CstType;

    .line 30
    .line 31
    return-void

    .line 32
    :cond_0
    :try_start_1
    new-instance p0, Ljava/lang/NullPointerException;

    .line 33
    .line 34
    const-string p1, "spec.getLocalItem() == null"

    .line 35
    .line 36
    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 37
    .line 38
    .line 39
    throw p0
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0

    .line 40
    :catch_0
    const-string p0, "spec == null"

    .line 41
    .line 42
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 43
    .line 44
    .line 45
    throw v0

    .line 46
    :cond_1
    const-string p0, "disposition == null"

    .line 47
    .line 48
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    throw v0

    .line 52
    :cond_2
    const-string p0, "address < 0"

    .line 53
    .line 54
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪世兰苏哲(Ljava/lang/String;)V

    .line 55
    .line 56
    .line 57
    throw v0
.end method


# virtual methods
.method public compareTo(Lcom/android/dx/dex/code/LocalList$Entry;)I
    .locals 4

    .line 1
    iget v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 2
    .line 3
    iget v1, p1, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 4
    .line 5
    const/4 v2, -0x1

    .line 6
    if-ge v0, v1, :cond_0

    .line 7
    .line 8
    return v2

    .line 9
    :cond_0
    const/4 v3, 0x1

    .line 10
    if-le v0, v1, :cond_1

    .line 11
    .line 12
    return v3

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/dex/code/LocalList$Entry;->isStart()Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-virtual {p1}, Lcom/android/dx/dex/code/LocalList$Entry;->isStart()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eq v0, v1, :cond_3

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    return v3

    .line 26
    :cond_2
    return v2

    .line 27
    :cond_3
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->compareTo(Lcom/android/dx/rop/code/RegisterSpec;)I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 36
    check-cast p1, Lcom/android/dx/dex/code/LocalList$Entry;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/LocalList$Entry;->compareTo(Lcom/android/dx/dex/code/LocalList$Entry;)I

    move-result p0

    return p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/code/LocalList$Entry;

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
    check-cast p1, Lcom/android/dx/dex/code/LocalList$Entry;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/LocalList$Entry;->compareTo(Lcom/android/dx/dex/code/LocalList$Entry;)I

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

.method public getAddress()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 2
    .line 3
    return p0
.end method

.method public getDisposition()Lcom/android/dx/dex/code/LocalList$Disposition;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 2
    .line 3
    return-object p0
.end method

.method public getName()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/LocalItem;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getRegister()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public getRegisterSpec()Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    return-object p0
.end method

.method public getSignature()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/code/LocalItem;->getSignature()Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getType()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->type:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public isStart()Z
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 2
    .line 3
    sget-object v0, Lcom/android/dx/dex/code/LocalList$Disposition;->START:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 4
    .line 5
    if-ne p0, v0, :cond_0

    .line 6
    .line 7
    const/4 p0, 0x1

    .line 8
    return p0

    .line 9
    :cond_0
    const/4 p0, 0x0

    .line 10
    return p0
.end method

.method public matches(Lcom/android/dx/dex/code/LocalList$Entry;)Z
    .locals 0

    .line 8
    iget-object p1, p1, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/code/LocalList$Entry;->matches(Lcom/android/dx/rop/code/RegisterSpec;)Z

    move-result p0

    return p0
.end method

.method public matches(Lcom/android/dx/rop/code/RegisterSpec;)Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/code/RegisterSpec;->equalsUsingSimpleType(Lcom/android/dx/rop/code/RegisterSpec;)Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget v1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 7
    .line 8
    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    const-string v1, " "

    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    iget-object v2, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 21
    .line 22
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 29
    .line 30
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    return-object p0
.end method

.method public withDisposition(Lcom/android/dx/dex/code/LocalList$Disposition;)Lcom/android/dx/dex/code/LocalList$Entry;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->disposition:Lcom/android/dx/dex/code/LocalList$Disposition;

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-object p0

    .line 6
    :cond_0
    new-instance v0, Lcom/android/dx/dex/code/LocalList$Entry;

    .line 7
    .line 8
    iget v1, p0, Lcom/android/dx/dex/code/LocalList$Entry;->address:I

    .line 9
    .line 10
    iget-object p0, p0, Lcom/android/dx/dex/code/LocalList$Entry;->spec:Lcom/android/dx/rop/code/RegisterSpec;

    .line 11
    .line 12
    invoke-direct {v0, v1, p1, p0}, Lcom/android/dx/dex/code/LocalList$Entry;-><init>(ILcom/android/dx/dex/code/LocalList$Disposition;Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
