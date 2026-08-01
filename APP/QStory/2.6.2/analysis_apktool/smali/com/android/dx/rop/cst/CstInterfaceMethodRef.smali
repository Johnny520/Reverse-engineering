.class public final Lcom/android/dx/rop/cst/CstInterfaceMethodRef;
.super Lcom/android/dx/rop/cst/CstBaseMethodRef;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private methodRef:Lcom/android/dx/rop/cst/CstMethodRef;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/android/dx/rop/cst/CstBaseMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 2
    .line 3
    .line 4
    const/4 p1, 0x0

    .line 5
    iput-object p1, p0, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->methodRef:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 6
    .line 7
    return-void
.end method


# virtual methods
.method public toMethodRef()Lcom/android/dx/rop/cst/CstMethodRef;
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->methodRef:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getDefiningClass()Lcom/android/dx/rop/cst/CstType;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-direct {v0, v1, v2}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 16
    .line 17
    .line 18
    iput-object v0, p0, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->methodRef:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 19
    .line 20
    :cond_0
    iget-object p0, p0, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->methodRef:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 21
    .line 22
    return-object p0
.end method

.method public typeName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "ifaceMethod"

    .line 2
    .line 3
    return-object p0
.end method
