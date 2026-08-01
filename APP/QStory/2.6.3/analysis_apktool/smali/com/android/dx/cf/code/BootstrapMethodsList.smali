.class public Lcom/android/dx/cf/code/BootstrapMethodsList;
.super Lcom/android/dx/util/FixedSizeList;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/cf/code/BootstrapMethodsList$Item;
    }
.end annotation


# static fields
.field public static final EMPTY:Lcom/android/dx/cf/code/BootstrapMethodsList;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/android/dx/cf/code/BootstrapMethodsList;-><init>(I)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/android/dx/cf/code/BootstrapMethodsList;->EMPTY:Lcom/android/dx/cf/code/BootstrapMethodsList;

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

.method public static concat(Lcom/android/dx/cf/code/BootstrapMethodsList;Lcom/android/dx/cf/code/BootstrapMethodsList;)Lcom/android/dx/cf/code/BootstrapMethodsList;
    .locals 6

    .line 1
    sget-object v0, Lcom/android/dx/cf/code/BootstrapMethodsList;->EMPTY:Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    return-object p1

    .line 6
    :cond_0
    if-ne p1, v0, :cond_1

    .line 7
    .line 8
    return-object p0

    .line 9
    :cond_1
    invoke-virtual {p0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    new-instance v2, Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 18
    .line 19
    add-int v3, v0, v1

    .line 20
    .line 21
    invoke-direct {v2, v3}, Lcom/android/dx/cf/code/BootstrapMethodsList;-><init>(I)V

    .line 22
    .line 23
    .line 24
    const/4 v3, 0x0

    .line 25
    move v4, v3

    .line 26
    :goto_0
    if-ge v4, v0, :cond_2

    .line 27
    .line 28
    invoke-virtual {p0, v4}, Lcom/android/dx/cf/code/BootstrapMethodsList;->get(I)Lcom/android/dx/cf/code/BootstrapMethodsList$Item;

    .line 29
    .line 30
    .line 31
    move-result-object v5

    .line 32
    invoke-virtual {v2, v4, v5}, Lcom/android/dx/cf/code/BootstrapMethodsList;->set(ILcom/android/dx/cf/code/BootstrapMethodsList$Item;)V

    .line 33
    .line 34
    .line 35
    add-int/lit8 v4, v4, 0x1

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_2
    :goto_1
    if-ge v3, v1, :cond_3

    .line 39
    .line 40
    add-int p0, v0, v3

    .line 41
    .line 42
    invoke-virtual {p1, v3}, Lcom/android/dx/cf/code/BootstrapMethodsList;->get(I)Lcom/android/dx/cf/code/BootstrapMethodsList$Item;

    .line 43
    .line 44
    .line 45
    move-result-object v4

    .line 46
    invoke-virtual {v2, p0, v4}, Lcom/android/dx/cf/code/BootstrapMethodsList;->set(ILcom/android/dx/cf/code/BootstrapMethodsList$Item;)V

    .line 47
    .line 48
    .line 49
    add-int/lit8 v3, v3, 0x1

    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_3
    return-object v2
.end method


# virtual methods
.method public get(I)Lcom/android/dx/cf/code/BootstrapMethodsList$Item;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/android/dx/util/FixedSizeList;->get0(I)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;

    .line 6
    .line 7
    return-object p0
.end method

.method public set(ILcom/android/dx/cf/code/BootstrapMethodsList$Item;)V
    .locals 0

    .line 1
    if-eqz p2, :cond_0

    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/android/dx/util/FixedSizeList;->set0(ILjava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :cond_0
    const-string p0, "item == null"

    .line 8
    .line 9
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public set(ILcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstMethodHandle;Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;)V
    .locals 1

    .line 13
    new-instance v0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;

    invoke-direct {v0, p2, p3, p4}, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstMethodHandle;Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;)V

    invoke-virtual {p0, p1, v0}, Lcom/android/dx/cf/code/BootstrapMethodsList;->set(ILcom/android/dx/cf/code/BootstrapMethodsList$Item;)V

    return-void
.end method
