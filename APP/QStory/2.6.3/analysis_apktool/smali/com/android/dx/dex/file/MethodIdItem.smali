.class public final Lcom/android/dx/dex/file/MethodIdItem;
.super Lcom/android/dx/dex/file/MemberIdItem;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstBaseMethodRef;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/MemberIdItem;-><init>(Lcom/android/dx/rop/cst/CstMemberRef;)V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    invoke-super {p0, p1}, Lcom/android/dx/dex/file/MemberIdItem;->addContents(Lcom/android/dx/dex/file/DexFile;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getProtoIds()Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-virtual {p0}, Lcom/android/dx/dex/file/MethodIdItem;->getMethodRef()Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/ProtoIdsSection;->intern(Lcom/android/dx/rop/type/Prototype;)Lcom/android/dx/dex/file/ProtoIdItem;

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public getMethodRef()Lcom/android/dx/rop/cst/CstBaseMethodRef;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/MemberIdItem;->getRef()Lcom/android/dx/rop/cst/CstMemberRef;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    check-cast p0, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 6
    .line 7
    return-object p0
.end method

.method public getTypoidIdx(Lcom/android/dx/dex/file/DexFile;)I
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getProtoIds()Lcom/android/dx/dex/file/ProtoIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/dex/file/MethodIdItem;->getMethodRef()Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getPrototype()Lcom/android/dx/rop/type/Prototype;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/ProtoIdsSection;->indexOf(Lcom/android/dx/rop/type/Prototype;)I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    return p0
.end method

.method public getTypoidName()Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "proto_idx"

    .line 2
    .line 3
    return-object p0
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_METHOD_ID_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method
