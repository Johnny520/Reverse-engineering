.class public final Lcom/android/dx/dex/file/EncodedMethod;
.super Lcom/android/dx/dex/file/EncodedMember;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Ljava/lang/Comparable;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/android/dx/dex/file/EncodedMember;",
        "Ljava/lang/Comparable<",
        "Lcom/android/dx/dex/file/EncodedMethod;",
        ">;"
    }
.end annotation


# instance fields
.field private final code:Lcom/android/dx/dex/file/CodeItem;

.field private final method:Lcom/android/dx/rop/cst/CstMethodRef;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstMethodRef;ILcom/android/dx/dex/code/DalvCode;Lcom/android/dx/rop/type/TypeList;)V
    .locals 1

    .line 1
    invoke-direct {p0, p2}, Lcom/android/dx/dex/file/EncodedMember;-><init>(I)V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x0

    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iput-object p1, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 8
    .line 9
    if-nez p3, :cond_0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/android/dx/dex/file/EncodedMethod;->code:Lcom/android/dx/dex/file/CodeItem;

    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    and-int/lit8 p2, p2, 0x8

    .line 15
    .line 16
    if-eqz p2, :cond_1

    .line 17
    .line 18
    const/4 p2, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 p2, 0x0

    .line 21
    :goto_0
    new-instance v0, Lcom/android/dx/dex/file/CodeItem;

    .line 22
    .line 23
    invoke-direct {v0, p1, p3, p2, p4}, Lcom/android/dx/dex/file/CodeItem;-><init>(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/dex/code/DalvCode;ZLcom/android/dx/rop/type/TypeList;)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lcom/android/dx/dex/file/EncodedMethod;->code:Lcom/android/dx/dex/file/CodeItem;

    .line 27
    .line 28
    return-void

    .line 29
    :cond_2
    const-string p0, "method == null"

    .line 30
    .line 31
    invoke-static {p0}, Lbsh/飘花落叶言子世苏兰楪哲;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    throw v0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getWordData()Lcom/android/dx/dex/file/MixedItemSection;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    iget-object v1, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/android/dx/dex/file/MethodIdsSection;->intern(Lcom/android/dx/rop/cst/CstBaseMethodRef;)Lcom/android/dx/dex/file/MethodIdItem;

    .line 12
    .line 13
    .line 14
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedMethod;->code:Lcom/android/dx/dex/file/CodeItem;

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/MixedItemSection;->add(Lcom/android/dx/dex/file/OffsettedItem;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method

.method public compareTo(Lcom/android/dx/dex/file/EncodedMethod;)I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    iget-object p1, p1, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

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
    check-cast p1, Lcom/android/dx/dex/file/EncodedMethod;

    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/EncodedMethod;->compareTo(Lcom/android/dx/dex/file/EncodedMethod;)I

    move-result p0

    return p0
.end method

.method public debugPrint(Ljava/io/PrintWriter;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/EncodedMethod;->code:Lcom/android/dx/dex/file/CodeItem;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    new-instance p2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/android/dx/dex/file/EncodedMethod;->getRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 11
    .line 12
    .line 13
    move-result-object p0

    .line 14
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 19
    .line 20
    .line 21
    const-string p0, ": abstract or native"

    .line 22
    .line 23
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    invoke-virtual {p1, p0}, Ljava/io/PrintWriter;->println(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    const-string p0, "  "

    .line 35
    .line 36
    invoke-virtual {v0, p1, p0, p2}, Lcom/android/dx/dex/file/CodeItem;->debugPrint(Ljava/io/PrintWriter;Ljava/lang/String;Z)V

    .line 37
    .line 38
    .line 39
    return-void
.end method

.method public encode(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;II)I
    .locals 6

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object v0, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 6
    .line 7
    invoke-virtual {p1, v0}, Lcom/android/dx/dex/file/MethodIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstBaseMethodRef;)I

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
    iget-object v1, p0, Lcom/android/dx/dex/file/EncodedMethod;->code:Lcom/android/dx/dex/file/CodeItem;

    .line 18
    .line 19
    invoke-static {v1}, Lcom/android/dx/dex/file/OffsettedItem;->getAbsoluteOffsetOr0(Lcom/android/dx/dex/file/OffsettedItem;)I

    .line 20
    .line 21
    .line 22
    move-result v1

    .line 23
    const/4 v2, 0x1

    .line 24
    const/4 v3, 0x0

    .line 25
    if-eqz v1, :cond_0

    .line 26
    .line 27
    move v4, v2

    .line 28
    goto :goto_0

    .line 29
    :cond_0
    move v4, v3

    .line 30
    :goto_0
    and-int/lit16 v5, v0, 0x500

    .line 31
    .line 32
    if-nez v5, :cond_1

    .line 33
    .line 34
    goto :goto_1

    .line 35
    :cond_1
    move v2, v3

    .line 36
    :goto_1
    if-ne v4, v2, :cond_3

    .line 37
    .line 38
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_2

    .line 43
    .line 44
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 45
    .line 46
    .line 47
    move-result-object p4

    .line 48
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMemberRef;->toHuman()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object p0

    .line 54
    filled-new-array {p4, p0}, [Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    const-string p4, "  [%x] %s"

    .line 59
    .line 60
    invoke-static {p4, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-interface {p2, v3, p0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p3}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪(I)I

    .line 68
    .line 69
    .line 70
    move-result p0

    .line 71
    new-instance p4, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v2, "    method_idx:   "

    .line 74
    .line 75
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    invoke-static {p1}, Lcom/android/dx/util/Hex;->u4(I)Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object v2

    .line 82
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object p4

    .line 89
    invoke-interface {p2, p0, p4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-static {v0}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪(I)I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    new-instance p4, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v2, "    access_flags: "

    .line 99
    .line 100
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-static {v0}, Lcom/android/dx/rop/code/AccessFlags;->methodString(I)Ljava/lang/String;

    .line 104
    .line 105
    .line 106
    move-result-object v2

    .line 107
    invoke-virtual {p4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object p4

    .line 114
    invoke-interface {p2, p0, p4}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-static {v1}, Lcom/bumptech/glide/飘花落叶言子楪苏世哲兰;->飘花落叶言子世苏兰哲楪(I)I

    .line 118
    .line 119
    .line 120
    move-result p0

    .line 121
    new-instance p4, Ljava/lang/StringBuilder;

    .line 122
    .line 123
    const-string v2, "    code_off:     "

    .line 124
    .line 125
    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    invoke-static {v1, p4, p2, p0}, Landroidx/profileinstaller/飘花落叶言子楪世哲苏兰;->飘花落叶言子世楪哲苏兰(ILjava/lang/StringBuilder;Lcom/android/dx/util/AnnotatedOutput;I)V

    .line 129
    .line 130
    .line 131
    :cond_2
    invoke-interface {p2, p3}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 132
    .line 133
    .line 134
    invoke-interface {p2, v0}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 135
    .line 136
    .line 137
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeUleb128(I)I

    .line 138
    .line 139
    .line 140
    return p1

    .line 141
    :cond_3
    const-string p0, "code vs. access_flags mismatch"

    .line 142
    .line 143
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲兰世(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    return v3
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/android/dx/dex/file/EncodedMethod;

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
    check-cast p1, Lcom/android/dx/dex/file/EncodedMethod;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/android/dx/dex/file/EncodedMethod;->compareTo(Lcom/android/dx/dex/file/EncodedMethod;)I

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

.method public final getName()Lcom/android/dx/rop/cst/CstString;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

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

.method public final getRef()Lcom/android/dx/rop/cst/CstMethodRef;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 2
    .line 3
    return-object p0
.end method

.method public final toHuman()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

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
    .locals 3

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
    const-class v1, Lcom/android/dx/dex/file/EncodedMethod;

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
    iget-object v2, p0, Lcom/android/dx/dex/file/EncodedMethod;->method:Lcom/android/dx/rop/cst/CstMethodRef;

    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    iget-object v2, p0, Lcom/android/dx/dex/file/EncodedMethod;->code:Lcom/android/dx/dex/file/CodeItem;

    .line 44
    .line 45
    if-eqz v2, :cond_0

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    iget-object p0, p0, Lcom/android/dx/dex/file/EncodedMethod;->code:Lcom/android/dx/dex/file/CodeItem;

    .line 51
    .line 52
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    :cond_0
    const/16 p0, 0x7d

    .line 56
    .line 57
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    return-object p0
.end method
