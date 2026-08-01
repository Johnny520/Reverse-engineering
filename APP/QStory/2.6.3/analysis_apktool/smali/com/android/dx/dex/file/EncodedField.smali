.class public final Lcom/android/dx/dex/file/EncodedField;
.super Lcom/android/dx/dex/file/EncodedMember;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/dex/file/EncodedMember;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/file/EncodedField;",
        ">;"
    }
.end annotation


# instance fields
.field private final field:Lcom/android/dx/rop/cst/CstFieldRef;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstFieldRef;I)V
    .locals 0

    .line 1
    invoke-direct {p0, p2}, Lcom/android/dx/dex/file/EncodedMember;-><init>(I)V

    .line 2
    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    iput-object p1, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 7
    .line 8
    return-void

    .line 9
    :cond_0
    const-string p0, "field == null"

    .line 10
    .line 11
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    throw p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/FieldIdsSection;->intern(Lcom/android/dx/rop/cst/CstFieldRef;)Lcom/android/dx/dex/file/FieldIdItem;

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public compareTo(Lcom/android/dx/dex/file/EncodedField;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/android/dx/rop/cst/Constant;->compareTo(Lcom/android/dx/rop/cst/Constant;)I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public bridge synthetic compareTo(Ljava/lang/Object;)I
    .locals 0

    .line 10
    check-cast p1, Lcom/android/dx/dex/file/EncodedField;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/EncodedField;->compareTo(Lcom/android/dx/dex/file/EncodedField;)I

    move-result p0

    return p0
.end method

.method public debugPrint(Ljava/io/PrintWriter;Z)V
    .locals 0

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/dex/file/EncodedField;->toString()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    return-void
.end method

.method public encode(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;II)I
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/file/FieldIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstFieldRef;)I

    .line 8
    .line 9
    .line 10
    move-result p1

    .line 11
    sub-int p3, p1, p3

    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/android/dx/dex/file/EncodedMember;->getAccessFlags()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 24
    .line 25
    .line 26
    move-result-object p4

    .line 27
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    filled-new-array {p4, p0}, [Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    const-string p4, "  [%x] %s"

    .line 38
    .line 39
    invoke-static {p4, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    const/4 p4, 0x0

    .line 44
    invoke-interface {p2, p4, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p3}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲苏兰楪(I)I

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    new-instance p4, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v1, "    field_idx:    "

    .line 54
    .line 55
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v1

    .line 62
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object p4

    .line 69
    invoke-interface {p2, p0, p4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪世兰哲苏;->飘花落叶言子世哲苏兰楪(I)I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    new-instance p4, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    const-string v1, "    access_flags: "

    .line 79
    .line 80
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 81
    .line 82
    .line 83
    invoke-static {v0}, Lcom/android/dx/rop/code/AccessFlags;->fieldString(I)Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    move-result-object v1

    .line 87
    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object p4

    .line 94
    invoke-interface {p2, p0, p4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 95
    .line 96
    .line 97
    :cond_0
    invoke-interface {p2, p3}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 98
    .line 99
    .line 100
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 101
    .line 102
    .line 103
    return p1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/file/EncodedField;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    return v1

    .line 7
    :cond_0
    check-cast p1, Lcom/android/dx/dex/file/EncodedField;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/EncodedField;->compareTo(Lcom/android/dx/dex/file/EncodedField;)I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    if-nez p0, :cond_1

    .line 14
    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_1
    return v1
.end method

.method public getName()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstNat;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method

.method public getRef()Lcom/android/dx/rop/cst/CstFieldRef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 2
    .line 3
    return-object p0
.end method

.method public hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const/16 v1, 0x64

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 6
    .line 7
    .line 8
    const-class v1, Lcom/android/dx/dex/file/EncodedField;

    .line 9
    .line 10
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    const/16 v1, 0x7b

    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/android/dx/dex/file/EncodedMember;->getAccessFlags()I

    .line 23
    .line 24
    .line 25
    move-result v1

    .line 26
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const/16 v1, 0x20

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedField;->field:Lcom/android/dx/rop/cst/CstFieldRef;

    .line 39
    .line 40
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const/16 p0, 0x7d

    .line 44
    .line 45
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    return-object p0
.end method
