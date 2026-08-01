.class public final Lcom/android/dx/cf/iface/StdMethod;
.super Lcom/android/dx/cf/iface/StdMember;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lcom/android/dx/cf/iface/Method;


# instance fields
.field private final effectiveDescriptor:Lcom/android/dx/rop/type/Prototype;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/iface/StdMember;-><init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Lcom/android/dx/cf/iface/StdMember;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 5
    .line 6
    .line 7
    move-result-object p4

    .line 8
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 9
    .line 10
    .line 11
    move-result-object p4

    .line 12
    invoke-virtual {p1}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-static {p2}, Lcom/android/dx/rop/code/AccessFlags;->isStatic(I)Z

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    invoke-virtual {p3}, Lcom/android/dx/rop/cst/CstNat;->isInstanceInit()Z

    .line 21
    .line 22
    .line 23
    move-result p3

    .line 24
    invoke-static {p4, p1, p2, p3}, Lcom/android/dx/rop/type/Prototype;->intern(Ljava/lang/String;Lcom/android/dx/rop/type/Type;ZZ)Lcom/android/dx/rop/type/Prototype;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    iput-object p1, p0, Lcom/android/dx/cf/iface/StdMethod;->effectiveDescriptor:Lcom/android/dx/rop/type/Prototype;

    .line 29
    .line 30
    return-void
.end method


# virtual methods
.method public getEffectiveDescriptor()Lcom/android/dx/rop/type/Prototype;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/cf/iface/StdMethod;->effectiveDescriptor:Lcom/android/dx/rop/type/Prototype;

    .line 2
    .line 3
    return-object p0
.end method
