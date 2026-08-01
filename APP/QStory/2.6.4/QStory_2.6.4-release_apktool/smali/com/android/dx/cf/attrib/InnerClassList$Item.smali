.class public Lcom/android/dx/cf/attrib/InnerClassList$Item;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/android/dx/cf/attrib/InnerClassList;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Item"
.end annotation


# instance fields
.field private final accessFlags:I

.field private final innerClass:Lcom/android/dx/rop/cst/CstType;

.field private final innerName:Lcom/android/dx/rop/cst/CstString;

.field private final outerClass:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstString;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->innerClass:Lcom/android/dx/rop/cst/CstType;

    .line 7
    .line 8
    iput-object p2, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->outerClass:Lcom/android/dx/rop/cst/CstType;

    .line 9
    .line 10
    iput-object p3, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->innerName:Lcom/android/dx/rop/cst/CstString;

    .line 11
    .line 12
    iput p4, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->accessFlags:I

    .line 13
    .line 14
    return-void

    .line 15
    :cond_0
    const-string p0, "innerClass == null"

    .line 16
    .line 17
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const/4 p0, 0x0

    .line 21
    throw p0
.end method


# virtual methods
.method public getAccessFlags()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->accessFlags:I

    .line 2
    .line 3
    return p0
.end method

.method public getInnerClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->innerClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getInnerName()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->innerName:Lcom/android/dx/rop/cst/CstString;

    .line 2
    .line 3
    return-object p0
.end method

.method public getOuterClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/InnerClassList$Item;->outerClass:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method
