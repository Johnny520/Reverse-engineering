.class public final Lcom/android/dx/cf/code/LocalVariableList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/LocalVariableList$Item;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/android/dx/cf/code/LocalVariableList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/LocalVariableList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/LocalVariableList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/cf/code/LocalVariableList;->EMPTY:Lcom/android/dx/cf/code/LocalVariableList;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/util/FixedSizeList;-><init>(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static concat(Lcom/android/dx/cf/code/LocalVariableList;Lcom/android/dx/cf/code/LocalVariableList;)Lcom/android/dx/cf/code/LocalVariableList;
    .locals 6

    .line 1
    sget-object v0, Lcom/android/dx/cf/code/LocalVariableList;->EMPTY:Lcom/android/dx/cf/code/LocalVariableList;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    new-instance v2, Lcom/android/dx/cf/code/LocalVariableList;

    .line 15
    .line 16
    add-int v3, v0, v1

    .line 17
    .line 18
    invoke-direct {v2, v3}, Lcom/android/dx/cf/code/LocalVariableList;-><init>(I)V

    .line 19
    .line 20
    .line 21
    const/4 v3, 0x0

    .line 22
    move v4, v3

    .line 23
    :goto_0
    if-ge v4, v0, :cond_1

    .line 24
    .line 25
    invoke-virtual {p0, v4}, Lcom/android/dx/cf/code/LocalVariableList;->get(I)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 26
    .line 27
    .line 28
    move-result-object v5

    .line 29
    invoke-virtual {v2, v4, v5}, Lcom/android/dx/cf/code/LocalVariableList;->set(ILcom/android/dx/cf/code/LocalVariableList$Item;)V

    .line 30
    .line 31
    .line 32
    add-int/lit8 v4, v4, 0x1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    :goto_1
    if-ge v3, v1, :cond_2

    .line 36
    .line 37
    add-int p0, v0, v3

    .line 38
    .line 39
    invoke-virtual {p1, v3}, Lcom/android/dx/cf/code/LocalVariableList;->get(I)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    invoke-virtual {v2, p0, v4}, Lcom/android/dx/cf/code/LocalVariableList;->set(ILcom/android/dx/cf/code/LocalVariableList$Item;)V

    .line 44
    .line 45
    .line 46
    add-int/lit8 v3, v3, 0x1

    .line 47
    .line 48
    goto :goto_1

    .line 49
    :cond_2
    invoke-virtual {v2}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 50
    .line 51
    .line 52
    return-object v2
.end method

.method public static mergeDescriptorsAndSignatures(Lcom/android/dx/cf/code/LocalVariableList;Lcom/android/dx/cf/code/LocalVariableList;)Lcom/android/dx/cf/code/LocalVariableList;
    .locals 5

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    new-instance v1, Lcom/android/dx/cf/code/LocalVariableList;

    .line 6
    .line 7
    invoke-direct {v1, v0}, Lcom/android/dx/cf/code/LocalVariableList;-><init>(I)V

    .line 8
    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    :goto_0
    if-ge v2, v0, :cond_1

    .line 12
    .line 13
    invoke-virtual {p0, v2}, Lcom/android/dx/cf/code/LocalVariableList;->get(I)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    invoke-virtual {p1, v3}, Lcom/android/dx/cf/code/LocalVariableList;->itemToLocal(Lcom/android/dx/cf/code/LocalVariableList$Item;)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 18
    .line 19
    .line 20
    move-result-object v4

    .line 21
    if-eqz v4, :cond_0

    .line 22
    .line 23
    invoke-static {v4}, Lcom/android/dx/cf/code/LocalVariableList$Item;->access$000(Lcom/android/dx/cf/code/LocalVariableList$Item;)Lcom/android/dx/rop/cst/CstString;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v3, v4}, Lcom/android/dx/cf/code/LocalVariableList$Item;->withSignature(Lcom/android/dx/rop/cst/CstString;)Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    :cond_0
    invoke-virtual {v1, v2, v3}, Lcom/android/dx/cf/code/LocalVariableList;->set(ILcom/android/dx/cf/code/LocalVariableList$Item;)V

    .line 32
    .line 33
    .line 34
    add-int/lit8 v2, v2, 0x1

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_1
    invoke-virtual {v1}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 38
    .line 39
    .line 40
    return-object v1
.end method


# virtual methods
.method public get(I)Lcom/android/dx/cf/code/LocalVariableList$Item;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 6
    .line 7
    return-object p0
.end method

.method public itemToLocal(Lcom/android/dx/cf/code/LocalVariableList$Item;)Lcom/android/dx/cf/code/LocalVariableList$Item;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2, p1}, Lcom/android/dx/cf/code/LocalVariableList$Item;->matchesAllButType(Lcom/android/dx/cf/code/LocalVariableList$Item;)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public pcAndIndexToLocal(II)Lcom/android/dx/cf/code/LocalVariableList$Item;
    .locals 4

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    :goto_0
    if-ge v1, v0, :cond_1

    .line 7
    .line 8
    invoke-virtual {p0, v1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    check-cast v2, Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 13
    .line 14
    if-eqz v2, :cond_0

    .line 15
    .line 16
    invoke-virtual {v2, p1, p2}, Lcom/android/dx/cf/code/LocalVariableList$Item;->matchesPcAndIndex(II)Z

    .line 17
    .line 18
    .line 19
    move-result v3

    .line 20
    if-eqz v3, :cond_0

    .line 21
    .line 22
    return-object v2

    .line 23
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_1
    const/4 p0, 0x0

    .line 27
    return-object p0
.end method

.method public set(IIILcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;I)V
    .locals 7

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/LocalVariableList$Item;

    .line 2
    .line 3
    move v1, p2

    .line 4
    move v2, p3

    .line 5
    move-object v3, p4

    .line 6
    move-object v4, p5

    .line 7
    move-object v5, p6

    .line 8
    move v6, p7

    .line 9
    invoke-direct/range {v0 .. v6}, Lcom/android/dx/cf/code/LocalVariableList$Item;-><init>(IILcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;Lcom/android/dx/rop/cst/CstString;I)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public set(ILcom/android/dx/cf/code/LocalVariableList$Item;)V
    .locals 0

    if-eqz p2, :cond_0

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    return-void

    .line 17
    :cond_0
    const-string p0, "item == null"

    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    return-void
.end method
