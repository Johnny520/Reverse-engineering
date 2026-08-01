.class final Lcom/android/dx/cf/direct/MethodListParser;
.super Lcom/android/dx/cf/direct/MemberListParser;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final methods:Lcom/android/dx/cf/iface/StdMethodList;


# direct methods
.method public constructor <init>(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/cf/direct/AttributeFactory;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/android/dx/cf/direct/MemberListParser;-><init>(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/cf/direct/AttributeFactory;)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lcom/android/dx/cf/iface/StdMethodList;

    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/MemberListParser;->getCount()I

    .line 7
    .line 8
    .line 9
    move-result p2

    .line 10
    invoke-direct {p1, p2}, Lcom/android/dx/cf/iface/StdMethodList;-><init>(I)V

    .line 11
    .line 12
    .line 13
    iput-object p1, p0, Lcom/android/dx/cf/direct/MethodListParser;->methods:Lcom/android/dx/cf/iface/StdMethodList;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public getAttributeContext()I
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    return p0
.end method

.method public getList()Lcom/android/dx/cf/iface/StdMethodList;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/MemberListParser;->parseIfNecessary()V

    .line 2
    .line 3
    .line 4
    iget-object p0, p0, Lcom/android/dx/cf/direct/MethodListParser;->methods:Lcom/android/dx/cf/iface/StdMethodList;

    .line 5
    .line 6
    return-object p0
.end method

.method public humanAccessFlags(I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/android/dx/rop/code/AccessFlags;->methodString(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public humanName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "method"

    .line 2
    .line 3
    return-object p0
.end method

.method public set(IILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/cf/iface/Member;
    .locals 2

    .line 1
    new-instance v0, Lcom/android/dx/cf/iface/StdMethod;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/MemberListParser;->getDefiner()Lcom/android/dx/rop/cst/CstType;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1, p2, p3, p4}, Lcom/android/dx/cf/iface/StdMethod;-><init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/iface/AttributeList;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/android/dx/cf/direct/MethodListParser;->methods:Lcom/android/dx/cf/iface/StdMethodList;

    .line 11
    .line 12
    invoke-virtual {p0, p1, v0}, Lcom/android/dx/cf/iface/StdMethodList;->set(ILcom/android/dx/cf/iface/Method;)V

    .line 13
    .line 14
    .line 15
    return-object v0
.end method
