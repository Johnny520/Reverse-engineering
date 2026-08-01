.class public Lcom/android/dx/ssa/SsaRenamer;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/android/dx/ssa/SsaRenamer$BlockRenamer;
    }
.end annotation


# static fields
.field private static final DEBUG:Z = false


# instance fields
.field private nextSsaReg:I

.field private final ropRegCount:I

.field private final ssaMeth:Lcom/android/dx/ssa/SsaMethod;

.field private final ssaRegToLocalItems:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/android/dx/rop/code/LocalItem;",
            ">;"
        }
    .end annotation
.end field

.field private ssaRegToRopReg:Lcom/android/dx/util/IntList;

.field private final startsForBlocks:[[Lcom/android/dx/rop/code/RegisterSpec;

.field private threshold:I


# direct methods
.method public constructor <init>(Lcom/android/dx/ssa/SsaMethod;)V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getRegCount()I

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    iput v0, p0, Lcom/android/dx/ssa/SsaRenamer;->ropRegCount:I

    .line 9
    .line 10
    iput-object p1, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 11
    .line 12
    iput v0, p0, Lcom/android/dx/ssa/SsaRenamer;->nextSsaReg:I

    .line 13
    .line 14
    const/4 v1, 0x0

    .line 15
    iput v1, p0, Lcom/android/dx/ssa/SsaRenamer;->threshold:I

    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getBlocks()Ljava/util/ArrayList;

    .line 18
    .line 19
    .line 20
    move-result-object v2

    .line 21
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 22
    .line 23
    .line 24
    move-result v2

    .line 25
    new-array v2, v2, [[Lcom/android/dx/rop/code/RegisterSpec;

    .line 26
    .line 27
    iput-object v2, p0, Lcom/android/dx/ssa/SsaRenamer;->startsForBlocks:[[Lcom/android/dx/rop/code/RegisterSpec;

    .line 28
    .line 29
    new-instance v2, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 32
    .line 33
    .line 34
    iput-object v2, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    .line 35
    .line 36
    new-array v0, v0, [Lcom/android/dx/rop/code/RegisterSpec;

    .line 37
    .line 38
    :goto_0
    iget v2, p0, Lcom/android/dx/ssa/SsaRenamer;->ropRegCount:I

    .line 39
    .line 40
    if-ge v1, v2, :cond_0

    .line 41
    .line 42
    sget-object v2, Lcom/android/dx/rop/type/Type;->VOID:Lcom/android/dx/rop/type/Type;

    .line 43
    .line 44
    invoke-static {v1, v2}, Lcom/android/dx/rop/code/RegisterSpec;->make(ILcom/android/dx/rop/type/TypeBearer;)Lcom/android/dx/rop/code/RegisterSpec;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    aput-object v2, v0, v1

    .line 49
    .line 50
    add-int/lit8 v1, v1, 0x1

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_0
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer;->startsForBlocks:[[Lcom/android/dx/rop/code/RegisterSpec;

    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/android/dx/ssa/SsaMethod;->getEntryBlockIndex()I

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    aput-object v0, p0, p1

    .line 60
    .line 61
    return-void
.end method

.method public constructor <init>(Lcom/android/dx/ssa/SsaMethod;I)V
    .locals 0

    .line 62
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/SsaRenamer;-><init>(Lcom/android/dx/ssa/SsaMethod;)V

    .line 63
    iput p2, p0, Lcom/android/dx/ssa/SsaRenamer;->threshold:I

    return-void
.end method

.method public static synthetic access$000(Lcom/android/dx/ssa/SsaRenamer;)[[Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer;->startsForBlocks:[[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$100(Lcom/android/dx/ssa/SsaRenamer;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaRenamer;->nextSsaReg:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$108(Lcom/android/dx/ssa/SsaRenamer;)I
    .locals 2

    .line 1
    iget v0, p0, Lcom/android/dx/ssa/SsaRenamer;->nextSsaReg:I

    .line 2
    .line 3
    add-int/lit8 v1, v0, 0x1

    .line 4
    .line 5
    iput v1, p0, Lcom/android/dx/ssa/SsaRenamer;->nextSsaReg:I

    .line 6
    .line 7
    return v0
.end method

.method public static synthetic access$1100(Lcom/android/dx/ssa/SsaRenamer;)Lcom/android/dx/ssa/SsaMethod;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    return-object p0
.end method

.method public static synthetic access$300([Lcom/android/dx/rop/code/RegisterSpec;)[Lcom/android/dx/rop/code/RegisterSpec;
    .locals 0

    .line 1
    invoke-static {p0}, Lcom/android/dx/ssa/SsaRenamer;->dupArray([Lcom/android/dx/rop/code/RegisterSpec;)[Lcom/android/dx/rop/code/RegisterSpec;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$400(Lcom/android/dx/ssa/SsaRenamer;Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/SsaRenamer;->setNameForSsaReg(Lcom/android/dx/rop/code/RegisterSpec;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$500(Lcom/android/dx/ssa/SsaRenamer;I)Lcom/android/dx/rop/code/LocalItem;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/SsaRenamer;->getLocalForNewReg(I)Lcom/android/dx/rop/code/LocalItem;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static synthetic access$600(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lcom/android/dx/ssa/SsaRenamer;->equalsHandlesNulls(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$700(Lcom/android/dx/ssa/SsaRenamer;)I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaRenamer;->threshold:I

    .line 2
    .line 3
    return p0
.end method

.method public static synthetic access$800(Lcom/android/dx/ssa/SsaRenamer;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/SsaRenamer;->isBelowThresholdRegister(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method public static synthetic access$900(Lcom/android/dx/ssa/SsaRenamer;I)Z
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/ssa/SsaRenamer;->isVersionZeroRegister(I)Z

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    return p0
.end method

.method private static dupArray([Lcom/android/dx/rop/code/RegisterSpec;)[Lcom/android/dx/rop/code/RegisterSpec;
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    new-array v0, v0, [Lcom/android/dx/rop/code/RegisterSpec;

    .line 3
    .line 4
    const/4 v1, 0x0

    .line 5
    array-length v2, p0

    .line 6
    invoke-static {p0, v1, v0, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method private static equalsHandlesNulls(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-eq p0, p1, :cond_1

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    if-eqz p0, :cond_0

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const/4 p0, 0x0

    .line 13
    return p0

    .line 14
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 15
    return p0
.end method

.method private getLocalForNewReg(I)Lcom/android/dx/rop/code/LocalItem;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-ge p1, v0, :cond_0

    .line 8
    .line 9
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    .line 10
    .line 11
    invoke-virtual {p0, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    check-cast p0, Lcom/android/dx/rop/code/LocalItem;

    .line 16
    .line 17
    return-object p0

    .line 18
    :cond_0
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method

.method private isBelowThresholdRegister(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaRenamer;->threshold:I

    .line 2
    .line 3
    if-ge p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method private isVersionZeroRegister(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/ssa/SsaRenamer;->ropRegCount:I

    .line 2
    .line 3
    if-ge p1, p0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method private setNameForSsaReg(Lcom/android/dx/rop/code/RegisterSpec;)V
    .locals 3

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getReg()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/rop/code/RegisterSpec;->getLocalItem()Lcom/android/dx/rop/code/LocalItem;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    .line 10
    .line 11
    add-int/lit8 v2, v0, 0x1

    .line 12
    .line 13
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->ensureCapacity(I)V

    .line 14
    .line 15
    .line 16
    :goto_0
    iget-object v1, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    iget-object v2, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaRegToLocalItems:Ljava/util/ArrayList;

    .line 23
    .line 24
    if-gt v1, v0, :cond_0

    .line 25
    .line 26
    const/4 v1, 0x0

    .line 27
    invoke-virtual {v2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :cond_0
    invoke-virtual {v2, v0, p1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    .line 32
    .line 33
    .line 34
    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 2
    .line 3
    new-instance v1, Lcom/android/dx/ssa/SsaRenamer$1;

    .line 4
    .line 5
    invoke-direct {v1, p0}, Lcom/android/dx/ssa/SsaRenamer$1;-><init>(Lcom/android/dx/ssa/SsaRenamer;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/android/dx/ssa/SsaMethod;->forEachBlockDepthFirstDom(Lcom/android/dx/ssa/SsaBasicBlock$Visitor;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 12
    .line 13
    iget v1, p0, Lcom/android/dx/ssa/SsaRenamer;->nextSsaReg:I

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/android/dx/ssa/SsaMethod;->setNewRegCount(I)V

    .line 16
    .line 17
    .line 18
    iget-object p0, p0, Lcom/android/dx/ssa/SsaRenamer;->ssaMeth:Lcom/android/dx/ssa/SsaMethod;

    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/android/dx/ssa/SsaMethod;->onInsnsChanged()V

    .line 21
    .line 22
    .line 23
    return-void
.end method
