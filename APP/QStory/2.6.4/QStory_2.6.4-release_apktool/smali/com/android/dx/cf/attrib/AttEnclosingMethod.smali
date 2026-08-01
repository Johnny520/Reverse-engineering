.class public final Lcom/android/dx/cf/attrib/AttEnclosingMethod;
.super Lcom/android/dx/cf/attrib/BaseAttribute;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# static fields
.field public static final ATTRIBUTE_NAME:Ljava/lang/String; = "EnclosingMethod"


# instance fields
.field private final method:Lcom/android/dx/rop/cst/CstNat;

.field private final type:Lcom/android/dx/rop/cst/CstType;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V
    .locals 1

    .line 1
    const-string v0, "EnclosingMethod"

    .line 2
    .line 3
    invoke-direct {p0, v0}, Lcom/android/dx/cf/attrib/BaseAttribute;-><init>(Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->type:Lcom/android/dx/rop/cst/CstType;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->method:Lcom/android/dx/rop/cst/CstNat;

    .line 11
    .line 12
    return-void

    .line 13
    :cond_0
    const-string p0, "type == null"

    .line 14
    .line 15
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    throw p0
.end method


# virtual methods
.method public byteLength()I
    .locals 0

    .line 1
    const/16 p0, 0xa

    .line 2
    .line 3
    return p0
.end method

.method public getEnclosingClass()Lcom/android/dx/rop/cst/CstType;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->type:Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethod()Lcom/android/dx/rop/cst/CstNat;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/attrib/AttEnclosingMethod;->method:Lcom/android/dx/rop/cst/CstNat;

    .line 2
    .line 3
    return-object p0
.end method
