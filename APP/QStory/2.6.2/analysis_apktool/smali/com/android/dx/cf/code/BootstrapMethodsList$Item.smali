.class public Lcom/android/dx/cf/code/BootstrapMethodsList$Item;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/code/BootstrapMethodsList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Item"
.end annotation


# instance fields
.field private final bootstrapMethodArgumentsList:Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;

.field private final bootstrapMethodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

.field private final declaringClass:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstMethodHandle;Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    if-eqz p2, :cond_1

    .line 8
    .line 9
    if-eqz p3, :cond_0

    .line 10
    .line 11
    iput-object p2, p0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->bootstrapMethodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 12
    .line 13
    iput-object p3, p0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->bootstrapMethodArgumentsList:Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;

    .line 14
    .line 15
    iput-object p1, p0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->declaringClass:Lcom/android/dx/rop/cst/CstType;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string p0, "bootstrapMethodArguments == null"

    .line 19
    .line 20
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    throw v0

    .line 24
    :cond_1
    const-string p0, "bootstrapMethodHandle == null"

    .line 25
    .line 26
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    throw v0

    .line 30
    :cond_2
    const-string p0, "declaringClass == null"

    .line 31
    .line 32
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    throw v0
.end method


# virtual methods
.method public getBootstrapMethodArguments()Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->bootstrapMethodArgumentsList:Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;

    .line 2
    .line 3
    return-object p0
.end method

.method public getBootstrapMethodHandle()Lcom/android/dx/rop/cst/CstMethodHandle;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->bootstrapMethodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 2
    .line 3
    return-object p0
.end method

.method public getDeclaringClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->declaringClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method
