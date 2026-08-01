.class Lcom/android/dx/rop/code/RegisterSpecList$Expander;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/rop/code/RegisterSpecList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Expander"
.end annotation


# instance fields
.field private base:I

.field private final compatRegs:Ljava/util/BitSet;

.field private duplicateFirst:Z

.field private final regSpecList:Lcom/android/dx/rop/code/RegisterSpecList;

.field private final result:Lcom/android/dx/rop/code/RegisterSpecList;


# direct methods
.method private constructor <init>(Lcom/android/dx/rop/code/RegisterSpecList;Ljava/util/BitSet;IZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->regSpecList:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->compatRegs:Ljava/util/BitSet;

    .line 7
    .line 8
    iput p3, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->base:I

    .line 9
    .line 10
    new-instance p2, Lcom/android/dx/rop/code/RegisterSpecList;

    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 13
    .line 14
    .line 15
    move-result p1

    .line 16
    invoke-direct {p2, p1}, Lcom/android/dx/rop/code/RegisterSpecList;-><init>(I)V

    .line 17
    .line 18
    .line 19
    iput-object p2, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->result:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 20
    .line 21
    iput-boolean p4, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->duplicateFirst:Z

    .line 22
    .line 23
    return-void
.end method

.method public synthetic constructor <init>(Lcom/android/dx/rop/code/RegisterSpecList;Ljava/util/BitSet;IZLcom/android/dx/rop/code/RegisterSpecList$1;)V
    .locals 0

    .line 24
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/rop/code/RegisterSpecList$Expander;-><init>(Lcom/android/dx/rop/code/RegisterSpecList;Ljava/util/BitSet;IZ)V

    return-void
.end method

.method public static synthetic access$100(Lcom/android/dx/rop/code/RegisterSpecList$Expander;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->expandRegister(I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static synthetic access$200(Lcom/android/dx/rop/code/RegisterSpecList$Expander;)Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->getResult()Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private expandRegister(I)V
    .locals 1

    .line 40
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->regSpecList:Lcom/android/dx/rop/code/RegisterSpecList;

    invoke-static {v0, p1}, Lcom/android/dx/rop/code/RegisterSpecList;->access$300(Lcom/android/dx/rop/code/RegisterSpecList;I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/android/dx/rop/code/RegisterSpec;

    invoke-direct {p0, p1, v0}, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->expandRegister(ILcom/android/dx/rop/code/RegisterSpec;)V

    return-void
.end method

.method private expandRegister(ILcom/android/dx/rop/code/RegisterSpec;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->compatRegs:Ljava/util/BitSet;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    goto :goto_0

    .line 6
    :cond_0
    invoke-virtual {v0, p1}, Ljava/util/BitSet;->get(I)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_1

    .line 11
    .line 12
    :goto_0
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->base:I

    .line 13
    .line 14
    invoke-virtual {p2, v0}, Lcom/android/dx/rop/code/RegisterSpec;->withReg(I)Lcom/android/dx/rop/code/RegisterSpec;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    iget-boolean v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->duplicateFirst:Z

    .line 19
    .line 20
    if-nez v0, :cond_1

    .line 21
    .line 22
    iget v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->base:I

    .line 23
    .line 24
    invoke-virtual {p2}, Lcom/android/dx/rop/code/RegisterSpec;->getCategory()I

    .line 25
    .line 26
    .line 27
    move-result v1

    .line 28
    add-int/2addr v1, v0

    .line 29
    iput v1, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->base:I

    .line 30
    .line 31
    :cond_1
    const/4 v0, 0x0

    .line 32
    iput-boolean v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->duplicateFirst:Z

    .line 33
    .line 34
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->result:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 35
    .line 36
    invoke-static {p0, p1, p2}, Lcom/android/dx/rop/code/RegisterSpecList;->access$400(Lcom/android/dx/rop/code/RegisterSpecList;ILjava/lang/Object;)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method private getResult()Lcom/android/dx/rop/code/RegisterSpecList;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->regSpecList:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->isImmutable()Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->result:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/android/dx/util/MutabilityControl;->setImmutable()V

    .line 12
    .line 13
    .line 14
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/code/RegisterSpecList$Expander;->result:Lcom/android/dx/rop/code/RegisterSpecList;

    .line 15
    .line 16
    return-object p0
.end method
