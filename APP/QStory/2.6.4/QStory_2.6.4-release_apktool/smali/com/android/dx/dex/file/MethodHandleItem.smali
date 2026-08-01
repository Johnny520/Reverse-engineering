.class public final Lcom/android/dx/dex/file/MethodHandleItem;
.super Lcom/android/dx/dex/file/IndexedItem;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private final ITEM_SIZE:I

.field private final methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/cst/CstMethodHandle;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lcom/android/dx/dex/file/IndexedItem;-><init>()V

    .line 2
    .line 3
    .line 4
    const/16 v0, 0x8

    .line 5
    .line 6
    iput v0, p0, Lcom/android/dx/dex/file/MethodHandleItem;->ITEM_SIZE:I

    .line 7
    .line 8
    iput-object p1, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 9
    .line 10
    return-void
.end method

.method private getTargetIndex(Lcom/android/dx/dex/file/DexFile;)I
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 2
    .line 3
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstMethodHandle;->getRef()Lcom/android/dx/rop/cst/Constant;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 8
    .line 9
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstMethodHandle;->isAccessor()Z

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    check-cast v0, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/FieldIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstFieldRef;)I

    .line 22
    .line 23
    .line 24
    move-result p0

    .line 25
    return p0

    .line 26
    :cond_0
    iget-object p0, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstMethodHandle;->isInvocation()Z

    .line 29
    .line 30
    .line 31
    move-result p0

    .line 32
    if-eqz p0, :cond_2

    .line 33
    .line 34
    instance-of p0, v0, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 35
    .line 36
    if-eqz p0, :cond_1

    .line 37
    .line 38
    check-cast v0, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->toMethodRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    :cond_1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    check-cast v0, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 49
    .line 50
    invoke-virtual {p0, v0}, Lcom/android/dx/dex/file/MethodIdsSection;->indexOf(Lcom/android/dx/rop/cst/CstBaseMethodRef;)I

    .line 51
    .line 52
    .line 53
    move-result p0

    .line 54
    return p0

    .line 55
    :cond_2
    const-string p0, "Unhandled invocation type"

    .line 56
    .line 57
    invoke-static {p0}, L飘花落叶言苏哲子楪兰世/飘花落叶言子楪世哲兰苏;->飘花落叶言子楪苏哲世兰(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    const/4 p0, 0x0

    .line 61
    return p0
.end method


# virtual methods
.method public addContents(Lcom/android/dx/dex/file/DexFile;)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Lcom/android/dx/dex/file/DexFile;->getMethodHandles()Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    iget-object p0, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 6
    .line 7
    invoke-virtual {p1, p0}, Lcom/android/dx/dex/file/MethodHandlesSection;->intern(Lcom/android/dx/rop/cst/CstMethodHandle;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public itemType()Lcom/android/dx/dex/file/ItemType;
    .locals 0

    .line 1
    sget-object p0, Lcom/android/dx/dex/file/ItemType;->TYPE_METHOD_HANDLE_ITEM:Lcom/android/dx/dex/file/ItemType;

    .line 2
    .line 3
    return-object p0
.end method

.method public writeSize()I
    .locals 0

    .line 1
    const/16 p0, 0x8

    .line 2
    .line 3
    return p0
.end method

.method public writeTo(Lcom/android/dx/dex/file/DexFile;Lcom/android/dx/util/AnnotatedOutput;)V
    .locals 8

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/MethodHandleItem;->getTargetIndex(Lcom/android/dx/dex/file/DexFile;)I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    iget-object v1, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/android/dx/rop/cst/CstMethodHandle;->getMethodHandleType()I

    .line 8
    .line 9
    .line 10
    move-result v1

    .line 11
    invoke-interface {p2}, Lcom/android/dx/util/AnnotatedOutput;->annotates()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    const/4 v3, 0x0

    .line 16
    if-eqz v2, :cond_1

    .line 17
    .line 18
    new-instance v2, Ljava/lang/StringBuilder;

    .line 19
    .line 20
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/android/dx/dex/file/IndexedItem;->indexString()Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const/16 v4, 0x20

    .line 31
    .line 32
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v4, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstMethodHandle;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v2

    .line 48
    invoke-interface {p2, v3, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 49
    .line 50
    .line 51
    new-instance v2, Ljava/lang/StringBuilder;

    .line 52
    .line 53
    const-string v4, " // "

    .line 54
    .line 55
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v1}, Lcom/android/dx/rop/cst/CstMethodHandle;->getMethodHandleTypeName(I)Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v5

    .line 62
    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    move-result-object v2

    .line 69
    new-instance v5, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v6, "type:     "

    .line 72
    .line 73
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-static {v1}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object v6

    .line 80
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v2

    .line 90
    const/4 v5, 0x2

    .line 91
    invoke-interface {p2, v5, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 92
    .line 93
    .line 94
    new-instance v2, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    const-string v6, "reserved: "

    .line 97
    .line 98
    invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 99
    .line 100
    .line 101
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 102
    .line 103
    .line 104
    move-result-object v7

    .line 105
    invoke-virtual {v2, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    move-result-object v2

    .line 112
    invoke-interface {p2, v5, v2}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 113
    .line 114
    .line 115
    new-instance v2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    invoke-direct {v2, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    iget-object v4, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 121
    .line 122
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstMethodHandle;->getRef()Lcom/android/dx/rop/cst/Constant;

    .line 123
    .line 124
    .line 125
    move-result-object v4

    .line 126
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object v4

    .line 130
    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 134
    .line 135
    .line 136
    move-result-object v2

    .line 137
    iget-object v4, p0, Lcom/android/dx/dex/file/MethodHandleItem;->methodHandle:Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 138
    .line 139
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstMethodHandle;->isAccessor()Z

    .line 140
    .line 141
    .line 142
    move-result v4

    .line 143
    if-eqz v4, :cond_0

    .line 144
    .line 145
    new-instance v4, Ljava/lang/StringBuilder;

    .line 146
    .line 147
    const-string v7, "fieldId:  "

    .line 148
    .line 149
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 150
    .line 151
    .line 152
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v0

    .line 156
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v0

    .line 166
    invoke-interface {p2, v5, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 167
    .line 168
    .line 169
    goto :goto_0

    .line 170
    :cond_0
    new-instance v4, Ljava/lang/StringBuilder;

    .line 171
    .line 172
    const-string v7, "methodId: "

    .line 173
    .line 174
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    invoke-static {v0}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 182
    .line 183
    .line 184
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 188
    .line 189
    .line 190
    move-result-object v0

    .line 191
    invoke-interface {p2, v5, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 192
    .line 193
    .line 194
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 195
    .line 196
    invoke-direct {v0, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 197
    .line 198
    .line 199
    invoke-static {v3}, Lcom/android/dx/util/Hex;->u2(I)Ljava/lang/String;

    .line 200
    .line 201
    .line 202
    move-result-object v2

    .line 203
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 207
    .line 208
    .line 209
    move-result-object v0

    .line 210
    invoke-interface {p2, v5, v0}, Lcom/android/dx/util/AnnotatedOutput;->annotate(ILjava/lang/String;)V

    .line 211
    .line 212
    .line 213
    :cond_1
    invoke-interface {p2, v1}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 214
    .line 215
    .line 216
    invoke-interface {p2, v3}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 217
    .line 218
    .line 219
    invoke-direct {p0, p1}, Lcom/android/dx/dex/file/MethodHandleItem;->getTargetIndex(Lcom/android/dx/dex/file/DexFile;)I

    .line 220
    .line 221
    .line 222
    move-result p0

    .line 223
    invoke-interface {p2, p0}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 224
    .line 225
    .line 226
    invoke-interface {p2, v3}, Lcom/android/dx/util/Output;->writeShort(I)V

    .line 227
    .line 228
    .line 229
    return-void
.end method
