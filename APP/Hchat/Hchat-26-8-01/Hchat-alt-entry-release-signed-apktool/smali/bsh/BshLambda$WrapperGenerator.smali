.class Lbsh/BshLambda$WrapperGenerator;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lbsh/BshLambda;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "WrapperGenerator"
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static generateClass(Ljava/lang/Class;)Ljava/lang/Class;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)",
            "Ljava/lang/Class<",
            "TT;>;"
        }
    .end annotation

    .line 1
    invoke-static {}, Ljava/util/Base64;->getUrlEncoder()Ljava/util/Base64$Encoder;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/util/Base64$Encoder;->withoutPadding()Ljava/util/Base64$Encoder;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-virtual {p0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1}, Ljava/lang/String;->getBytes()[B

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1}, Ljava/util/Base64$Encoder;->encodeToString([B)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 24
    .line 25
    .line 26
    const-class v2, Lbsh/BshLambda;

    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 29
    .line 30
    .line 31
    move-result-object v2

    .line 32
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    const-string v2, "Generated"

    .line 36
    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    const-string v1, "."

    .line 48
    .line 49
    const-string v2, "/"

    .line 50
    .line 51
    invoke-virtual {v0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v1

    .line 55
    invoke-static {v1, p0}, Lbsh/BshLambda$WrapperGenerator;->generateClassBytes(Ljava/lang/String;Ljava/lang/Class;)[B

    .line 56
    .line 57
    .line 58
    move-result-object p0

    .line 59
    invoke-static {}, Lbsh/BshLambda;->b()Lbsh/BshLambda$ByteClassLoader;

    .line 60
    .line 61
    .line 62
    move-result-object v1

    .line 63
    invoke-virtual {v1, v0, p0}, Lbsh/BshLambda$ByteClassLoader;->classFromBytes(Ljava/lang/String;[B)Ljava/lang/Class;

    .line 64
    .line 65
    .line 66
    move-result-object p0

    .line 67
    return-object p0
.end method

.method private static generateClassBytes(Ljava/lang/String;Ljava/lang/Class;)[B
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "*>;)[B"
        }
    .end annotation

    .line 1
    new-instance v0, Lbsh/org/objectweb/asm/ClassWriter;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    invoke-direct {v0, v1}, Lbsh/org/objectweb/asm/ClassWriter;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Lbsh/Types;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    filled-new-array {v1}, [Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v6

    .line 15
    invoke-static {p1}, Lbsh/BshLambda$WrapperGenerator;->generateClassSignature(Ljava/lang/Class;)Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    const/4 v2, 0x1

    .line 20
    const-string v5, "java/lang/Object"

    .line 21
    .line 22
    const/16 v1, 0x34

    .line 23
    .line 24
    move-object v3, p0

    .line 25
    invoke-virtual/range {v0 .. v6}, Lbsh/org/objectweb/asm/ClassWriter;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    const-class v1, Lbsh/BshLambda;

    .line 29
    .line 30
    invoke-static {v1}, Lbsh/Types;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object v3

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    const/4 v1, 0x2

    .line 37
    const-string v2, "bshLambda"

    .line 38
    .line 39
    invoke-virtual/range {v0 .. v5}, Lbsh/org/objectweb/asm/ClassWriter;->visitField(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Lbsh/org/objectweb/asm/FieldVisitor;

    .line 40
    .line 41
    .line 42
    move-result-object v1

    .line 43
    invoke-virtual {v1}, Lbsh/org/objectweb/asm/FieldVisitor;->visitEnd()V

    .line 44
    .line 45
    .line 46
    invoke-static {v0, p0}, Lbsh/BshLambda$WrapperGenerator;->writeConstructor(Lbsh/org/objectweb/asm/ClassWriter;Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-static {p1}, Lbsh/BshLambda;->methodFromFI(Ljava/lang/Class;)Ljava/lang/reflect/Method;

    .line 50
    .line 51
    .line 52
    move-result-object p1

    .line 53
    invoke-static {v0, p0, p1}, Lbsh/BshLambda$WrapperGenerator;->writeMethod(Lbsh/org/objectweb/asm/ClassWriter;Ljava/lang/String;Ljava/lang/reflect/Method;)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/ClassWriter;->visitEnd()V

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lbsh/org/objectweb/asm/ClassWriter;->toByteArray()[B

    .line 60
    .line 61
    .line 62
    move-result-object p0

    .line 63
    return-object p0
.end method

.method private static generateClassSignature(Ljava/lang/Class;)Ljava/lang/String;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;)",
            "Ljava/lang/String;"
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    array-length v0, v0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    invoke-static {p0, v0}, Lbsh/Types;->createParameterizedType(Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/reflect/ParameterizedType;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object v0, p0

    .line 18
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Class;->getTypeParameters()[Ljava/lang/reflect/TypeVariable;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    const/4 v1, 0x1

    .line 23
    new-array v1, v1, [Ljava/lang/reflect/Type;

    .line 24
    .line 25
    const/4 v2, 0x0

    .line 26
    aput-object v0, v1, v2

    .line 27
    .line 28
    const-class v0, Ljava/lang/Object;

    .line 29
    .line 30
    invoke-static {p0, v0, v1}, Lbsh/Types;->getASMClassSignature([Ljava/lang/reflect/TypeVariable;Ljava/lang/reflect/Type;[Ljava/lang/reflect/Type;)Ljava/lang/String;

    .line 31
    .line 32
    .line 33
    move-result-object p0

    .line 34
    return-object p0
.end method

.method private static writeConstructor(Lbsh/org/objectweb/asm/ClassWriter;Ljava/lang/String;)V
    .locals 15

    .line 1
    const-class v0, Lbsh/BshLambda;

    .line 2
    .line 3
    filled-new-array {v0}, [Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 8
    .line 9
    invoke-static {v2, v1}, Lbsh/Types;->getMethodDescriptor(Ljava/lang/Class;[Ljava/lang/Class;)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v6

    .line 13
    const/4 v7, 0x0

    .line 14
    const/4 v8, 0x0

    .line 15
    const/4 v4, 0x1

    .line 16
    const-string v5, "<init>"

    .line 17
    .line 18
    move-object v3, p0

    .line 19
    invoke-virtual/range {v3 .. v8}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 20
    .line 21
    .line 22
    move-result-object v9

    .line 23
    invoke-virtual {v9}, Lbsh/org/objectweb/asm/MethodVisitor;->visitCode()V

    .line 24
    .line 25
    .line 26
    const/16 p0, 0x19

    .line 27
    .line 28
    const/4 v1, 0x0

    .line 29
    invoke-virtual {v9, p0, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 30
    .line 31
    .line 32
    const-string v13, "()V"

    .line 33
    .line 34
    const/4 v14, 0x0

    .line 35
    const/16 v10, 0xb7

    .line 36
    .line 37
    const-string v11, "java/lang/Object"

    .line 38
    .line 39
    const-string v12, "<init>"

    .line 40
    .line 41
    invoke-virtual/range {v9 .. v14}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {v9, p0, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-virtual {v9, p0, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 49
    .line 50
    .line 51
    const-string p0, "bshLambda"

    .line 52
    .line 53
    invoke-static {v0}, Lbsh/Types;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v0

    .line 57
    const/16 v2, 0xb5

    .line 58
    .line 59
    move-object/from16 v3, p1

    .line 60
    .line 61
    invoke-virtual {v9, v2, v3, p0, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    const/16 p0, 0xb1

    .line 65
    .line 66
    invoke-virtual {v9, p0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v9, v1, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v9}, Lbsh/org/objectweb/asm/MethodVisitor;->visitEnd()V

    .line 73
    .line 74
    .line 75
    return-void
.end method

.method private static writeMethod(Lbsh/org/objectweb/asm/ClassWriter;Ljava/lang/String;Ljava/lang/reflect/Method;)V
    .locals 18

    .line 1
    const-class v0, Lbsh/BshLambda;

    .line 2
    .line 3
    invoke-static {v0}, Lbsh/Types;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v3

    .line 7
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Executable;->getParameters()[Ljava/lang/reflect/Parameter;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getExceptionTypes()[Ljava/lang/Class;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v6

    .line 19
    invoke-static/range {p2 .. p2}, Lbsh/Types;->getMethodDescriptor(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object v7

    .line 23
    invoke-static/range {p2 .. p2}, Lbsh/Types;->getASMMethodSignature(Ljava/lang/reflect/Method;)Ljava/lang/String;

    .line 24
    .line 25
    .line 26
    move-result-object v8

    .line 27
    invoke-static {v2}, Lbsh/Types;->getInternalNames([Ljava/lang/Class;)[Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    move-result-object v9

    .line 31
    const/4 v5, 0x1

    .line 32
    move-object/from16 v4, p0

    .line 33
    .line 34
    invoke-virtual/range {v4 .. v9}, Lbsh/org/objectweb/asm/ClassWriter;->visitMethod(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)Lbsh/org/objectweb/asm/MethodVisitor;

    .line 35
    .line 36
    .line 37
    move-result-object v10

    .line 38
    invoke-virtual {v10}, Lbsh/org/objectweb/asm/MethodVisitor;->visitCode()V

    .line 39
    .line 40
    .line 41
    const/16 v4, 0x19

    .line 42
    .line 43
    const/4 v7, 0x0

    .line 44
    invoke-virtual {v10, v4, v7}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 45
    .line 46
    .line 47
    const-string v5, "bshLambda"

    .line 48
    .line 49
    invoke-static {v0}, Lbsh/Types;->getDescriptor(Ljava/lang/Class;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    const/16 v6, 0xb4

    .line 54
    .line 55
    move-object/from16 v8, p1

    .line 56
    .line 57
    invoke-virtual {v10, v6, v8, v5, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    array-length v0, v1

    .line 61
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    .line 63
    .line 64
    move-result-object v0

    .line 65
    invoke-virtual {v10, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 66
    .line 67
    .line 68
    const-string v0, "java/lang/Object"

    .line 69
    .line 70
    const/16 v5, 0xbd

    .line 71
    .line 72
    invoke-virtual {v10, v5, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 73
    .line 74
    .line 75
    move v6, v7

    .line 76
    const/4 v8, 0x1

    .line 77
    :goto_0
    array-length v9, v1

    .line 78
    sget-object v12, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    sget-object v13, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 81
    .line 82
    sget-object v14, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 83
    .line 84
    sget-object v15, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 85
    .line 86
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 87
    .line 88
    sget-object v11, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 89
    .line 90
    const/16 v7, 0x59

    .line 91
    .line 92
    sget-object v5, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 93
    .line 94
    sget-object v4, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 95
    .line 96
    if-ge v6, v9, :cond_a

    .line 97
    .line 98
    aget-object v9, v1, v6

    .line 99
    .line 100
    invoke-virtual {v9}, Ljava/lang/reflect/Parameter;->getType()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    move-result-object v9

    .line 104
    invoke-virtual {v10, v7}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 105
    .line 106
    .line 107
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v10, v7}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    const/16 v7, 0x15

    .line 115
    .line 116
    if-ne v9, v11, :cond_0

    .line 117
    .line 118
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 119
    .line 120
    .line 121
    const-string v14, "(C)Ljava/lang/Character;"

    .line 122
    .line 123
    const/4 v15, 0x0

    .line 124
    const/16 v11, 0xb8

    .line 125
    .line 126
    const-string v12, "java/lang/Character"

    .line 127
    .line 128
    const-string v13, "valueOf"

    .line 129
    .line 130
    const/16 v0, 0x53

    .line 131
    .line 132
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 133
    .line 134
    .line 135
    :goto_1
    const/16 v7, 0x19

    .line 136
    .line 137
    goto/16 :goto_2

    .line 138
    .line 139
    :cond_0
    const/16 v11, 0x53

    .line 140
    .line 141
    if-ne v9, v0, :cond_1

    .line 142
    .line 143
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 144
    .line 145
    .line 146
    const-string v14, "(Z)Ljava/lang/Boolean;"

    .line 147
    .line 148
    const/4 v15, 0x0

    .line 149
    move v0, v11

    .line 150
    const/16 v11, 0xb8

    .line 151
    .line 152
    const-string v12, "java/lang/Boolean"

    .line 153
    .line 154
    const-string v13, "valueOf"

    .line 155
    .line 156
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 157
    .line 158
    .line 159
    goto :goto_1

    .line 160
    :cond_1
    move v0, v11

    .line 161
    if-ne v9, v15, :cond_2

    .line 162
    .line 163
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 164
    .line 165
    .line 166
    const-string v14, "(B)Ljava/lang/Byte;"

    .line 167
    .line 168
    const/4 v15, 0x0

    .line 169
    const/16 v11, 0xb8

    .line 170
    .line 171
    const-string v12, "java/lang/Byte"

    .line 172
    .line 173
    const-string v13, "valueOf"

    .line 174
    .line 175
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 176
    .line 177
    .line 178
    goto :goto_1

    .line 179
    :cond_2
    if-ne v9, v14, :cond_3

    .line 180
    .line 181
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 182
    .line 183
    .line 184
    const-string v14, "(S)Ljava/lang/Short;"

    .line 185
    .line 186
    const/4 v15, 0x0

    .line 187
    const/16 v11, 0xb8

    .line 188
    .line 189
    const-string v12, "java/lang/Short"

    .line 190
    .line 191
    const-string v13, "valueOf"

    .line 192
    .line 193
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 194
    .line 195
    .line 196
    goto :goto_1

    .line 197
    :cond_3
    if-ne v9, v13, :cond_4

    .line 198
    .line 199
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 200
    .line 201
    .line 202
    const-string v14, "(I)Ljava/lang/Integer;"

    .line 203
    .line 204
    const/4 v15, 0x0

    .line 205
    const/16 v11, 0xb8

    .line 206
    .line 207
    const-string v12, "java/lang/Integer"

    .line 208
    .line 209
    const-string v13, "valueOf"

    .line 210
    .line 211
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 212
    .line 213
    .line 214
    goto :goto_1

    .line 215
    :cond_4
    if-ne v9, v4, :cond_5

    .line 216
    .line 217
    const/16 v7, 0x16

    .line 218
    .line 219
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 220
    .line 221
    .line 222
    const-string v14, "(J)Ljava/lang/Long;"

    .line 223
    .line 224
    const/4 v15, 0x0

    .line 225
    const/16 v11, 0xb8

    .line 226
    .line 227
    const-string v12, "java/lang/Long"

    .line 228
    .line 229
    const-string v13, "valueOf"

    .line 230
    .line 231
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 232
    .line 233
    .line 234
    goto :goto_1

    .line 235
    :cond_5
    if-ne v9, v12, :cond_6

    .line 236
    .line 237
    const/16 v7, 0x17

    .line 238
    .line 239
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 240
    .line 241
    .line 242
    const-string v14, "(F)Ljava/lang/Float;"

    .line 243
    .line 244
    const/4 v15, 0x0

    .line 245
    const/16 v11, 0xb8

    .line 246
    .line 247
    const-string v12, "java/lang/Float"

    .line 248
    .line 249
    const-string v13, "valueOf"

    .line 250
    .line 251
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 252
    .line 253
    .line 254
    goto :goto_1

    .line 255
    :cond_6
    if-ne v9, v5, :cond_7

    .line 256
    .line 257
    const/16 v7, 0x18

    .line 258
    .line 259
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 260
    .line 261
    .line 262
    const-string v14, "(D)Ljava/lang/Double;"

    .line 263
    .line 264
    const/4 v15, 0x0

    .line 265
    const/16 v11, 0xb8

    .line 266
    .line 267
    const-string v12, "java/lang/Double"

    .line 268
    .line 269
    const-string v13, "valueOf"

    .line 270
    .line 271
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 272
    .line 273
    .line 274
    goto/16 :goto_1

    .line 275
    .line 276
    :cond_7
    const/16 v7, 0x19

    .line 277
    .line 278
    invoke-virtual {v10, v7, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitVarInsn(II)V

    .line 279
    .line 280
    .line 281
    :goto_2
    invoke-virtual {v10, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 282
    .line 283
    .line 284
    if-eq v9, v4, :cond_9

    .line 285
    .line 286
    if-ne v9, v5, :cond_8

    .line 287
    .line 288
    goto :goto_3

    .line 289
    :cond_8
    const/4 v0, 0x1

    .line 290
    goto :goto_4

    .line 291
    :cond_9
    :goto_3
    const/4 v0, 0x2

    .line 292
    :goto_4
    add-int/2addr v8, v0

    .line 293
    add-int/lit8 v6, v6, 0x1

    .line 294
    .line 295
    move v4, v7

    .line 296
    const/16 v5, 0xbd

    .line 297
    .line 298
    const/4 v7, 0x0

    .line 299
    goto/16 :goto_0

    .line 300
    .line 301
    :cond_a
    const/16 v6, 0x53

    .line 302
    .line 303
    array-length v1, v2

    .line 304
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 305
    .line 306
    .line 307
    move-result-object v1

    .line 308
    invoke-virtual {v10, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 309
    .line 310
    .line 311
    const-string v1, "java/lang/Class"

    .line 312
    .line 313
    const/16 v8, 0xbd

    .line 314
    .line 315
    invoke-virtual {v10, v8, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 316
    .line 317
    .line 318
    const/4 v1, 0x0

    .line 319
    :goto_5
    array-length v8, v2

    .line 320
    if-ge v1, v8, :cond_b

    .line 321
    .line 322
    aget-object v8, v2, v1

    .line 323
    .line 324
    invoke-virtual {v10, v7}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 325
    .line 326
    .line 327
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 328
    .line 329
    .line 330
    move-result-object v9

    .line 331
    invoke-virtual {v10, v9}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 332
    .line 333
    .line 334
    invoke-static {v8}, Lbsh/Types;->getASMType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;

    .line 335
    .line 336
    .line 337
    move-result-object v8

    .line 338
    invoke-virtual {v10, v8}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 339
    .line 340
    .line 341
    invoke-virtual {v10, v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 342
    .line 343
    .line 344
    add-int/lit8 v1, v1, 0x1

    .line 345
    .line 346
    goto :goto_5

    .line 347
    :cond_b
    invoke-virtual/range {p2 .. p2}, Ljava/lang/reflect/Method;->getReturnType()Ljava/lang/Class;

    .line 348
    .line 349
    .line 350
    move-result-object v7

    .line 351
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 352
    .line 353
    .line 354
    move-result v1

    .line 355
    if-eqz v1, :cond_c

    .line 356
    .line 357
    invoke-static {v7}, Lbsh/Primitive;->boxType(Ljava/lang/Class;)Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    move-result-object v1

    .line 361
    move-object v8, v1

    .line 362
    goto :goto_6

    .line 363
    :cond_c
    move-object v8, v7

    .line 364
    :goto_6
    invoke-virtual {v7}, Ljava/lang/Class;->isPrimitive()Z

    .line 365
    .line 366
    .line 367
    move-result v1

    .line 368
    if-eqz v1, :cond_d

    .line 369
    .line 370
    invoke-static {v8}, Lbsh/Types;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v1

    .line 374
    const-string v2, "TYPE"

    .line 375
    .line 376
    const-string v6, "Ljava/lang/Class;"

    .line 377
    .line 378
    const/16 v9, 0xb2

    .line 379
    .line 380
    invoke-virtual {v10, v9, v1, v2, v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitFieldInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 381
    .line 382
    .line 383
    :goto_7
    move-object v1, v5

    .line 384
    goto :goto_8

    .line 385
    :cond_d
    invoke-static {v7}, Lbsh/Types;->getASMType(Ljava/lang/Class;)Lbsh/org/objectweb/asm/Type;

    .line 386
    .line 387
    .line 388
    move-result-object v1

    .line 389
    invoke-virtual {v10, v1}, Lbsh/org/objectweb/asm/MethodVisitor;->visitLdcInsn(Ljava/lang/Object;)V

    .line 390
    .line 391
    .line 392
    goto :goto_7

    .line 393
    :goto_8
    const-string v5, "([Ljava/lang/Object;[Ljava/lang/Class;Ljava/lang/Class;)Ljava/lang/Object;"

    .line 394
    .line 395
    const/4 v6, 0x0

    .line 396
    const/16 v2, 0xb6

    .line 397
    .line 398
    move-object v9, v4

    .line 399
    const-string v4, "invoke"

    .line 400
    .line 401
    move-object/from16 v17, v9

    .line 402
    .line 403
    move-object v9, v1

    .line 404
    move-object v1, v10

    .line 405
    move-object/from16 v10, v17

    .line 406
    .line 407
    invoke-virtual/range {v1 .. v6}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 408
    .line 409
    .line 410
    const/16 v2, 0xc0

    .line 411
    .line 412
    invoke-static {v8}, Lbsh/Types;->getInternalName(Ljava/lang/Class;)Ljava/lang/String;

    .line 413
    .line 414
    .line 415
    move-result-object v3

    .line 416
    invoke-virtual {v1, v2, v3}, Lbsh/org/objectweb/asm/MethodVisitor;->visitTypeInsn(ILjava/lang/String;)V

    .line 417
    .line 418
    .line 419
    sget-object v2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 420
    .line 421
    if-ne v7, v2, :cond_e

    .line 422
    .line 423
    const/16 v0, 0x57

    .line 424
    .line 425
    invoke-virtual {v1, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 426
    .line 427
    .line 428
    const/16 v0, 0xb1

    .line 429
    .line 430
    invoke-virtual {v1, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 431
    .line 432
    .line 433
    move-object v10, v1

    .line 434
    :goto_9
    const/4 v0, 0x0

    .line 435
    goto/16 :goto_a

    .line 436
    .line 437
    :cond_e
    const/16 v2, 0xac

    .line 438
    .line 439
    if-ne v7, v0, :cond_f

    .line 440
    .line 441
    const-string v14, "()Z"

    .line 442
    .line 443
    const/4 v15, 0x0

    .line 444
    const/16 v11, 0xb6

    .line 445
    .line 446
    const-string v12, "java/lang/Boolean"

    .line 447
    .line 448
    const-string v13, "booleanValue"

    .line 449
    .line 450
    move-object v10, v1

    .line 451
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 452
    .line 453
    .line 454
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 455
    .line 456
    .line 457
    goto :goto_9

    .line 458
    :cond_f
    if-ne v7, v11, :cond_10

    .line 459
    .line 460
    const-string v14, "()C"

    .line 461
    .line 462
    const/4 v15, 0x0

    .line 463
    const/16 v11, 0xb6

    .line 464
    .line 465
    const-string v12, "java/lang/Character"

    .line 466
    .line 467
    const-string v13, "charValue"

    .line 468
    .line 469
    move-object v10, v1

    .line 470
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 471
    .line 472
    .line 473
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 474
    .line 475
    .line 476
    goto :goto_9

    .line 477
    :cond_10
    if-ne v7, v15, :cond_11

    .line 478
    .line 479
    const-string v14, "()B"

    .line 480
    .line 481
    const/4 v15, 0x0

    .line 482
    const/16 v11, 0xb6

    .line 483
    .line 484
    const-string v12, "java/lang/Byte"

    .line 485
    .line 486
    const-string v13, "byteValue"

    .line 487
    .line 488
    move-object v10, v1

    .line 489
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 490
    .line 491
    .line 492
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 493
    .line 494
    .line 495
    goto :goto_9

    .line 496
    :cond_11
    if-ne v7, v14, :cond_12

    .line 497
    .line 498
    const-string v14, "()S"

    .line 499
    .line 500
    const/4 v15, 0x0

    .line 501
    const/16 v11, 0xb6

    .line 502
    .line 503
    const-string v12, "java/lang/Short"

    .line 504
    .line 505
    const-string v13, "shortValue"

    .line 506
    .line 507
    move-object v10, v1

    .line 508
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 509
    .line 510
    .line 511
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 512
    .line 513
    .line 514
    goto :goto_9

    .line 515
    :cond_12
    if-ne v7, v13, :cond_13

    .line 516
    .line 517
    const-string v14, "()I"

    .line 518
    .line 519
    const/4 v15, 0x0

    .line 520
    const/16 v11, 0xb6

    .line 521
    .line 522
    const-string v12, "java/lang/Integer"

    .line 523
    .line 524
    const-string v13, "intValue"

    .line 525
    .line 526
    move-object v10, v1

    .line 527
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 528
    .line 529
    .line 530
    invoke-virtual {v1, v2}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 531
    .line 532
    .line 533
    goto :goto_9

    .line 534
    :cond_13
    if-ne v7, v10, :cond_14

    .line 535
    .line 536
    const-string v14, "()J"

    .line 537
    .line 538
    const/4 v15, 0x0

    .line 539
    const/16 v11, 0xb6

    .line 540
    .line 541
    const-string v12, "java/lang/Long"

    .line 542
    .line 543
    const-string v13, "longValue"

    .line 544
    .line 545
    move-object v10, v1

    .line 546
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 547
    .line 548
    .line 549
    const/16 v0, 0xad

    .line 550
    .line 551
    invoke-virtual {v10, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 552
    .line 553
    .line 554
    goto :goto_9

    .line 555
    :cond_14
    move-object v10, v1

    .line 556
    if-ne v7, v12, :cond_15

    .line 557
    .line 558
    const-string v14, "()F"

    .line 559
    .line 560
    const/4 v15, 0x0

    .line 561
    const/16 v11, 0xb6

    .line 562
    .line 563
    const-string v12, "java/lang/Float"

    .line 564
    .line 565
    const-string v13, "floatValue"

    .line 566
    .line 567
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 568
    .line 569
    .line 570
    const/16 v0, 0xae

    .line 571
    .line 572
    invoke-virtual {v10, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 573
    .line 574
    .line 575
    goto/16 :goto_9

    .line 576
    .line 577
    :cond_15
    if-ne v7, v9, :cond_16

    .line 578
    .line 579
    const-string v14, "()D"

    .line 580
    .line 581
    const/4 v15, 0x0

    .line 582
    const/16 v11, 0xb6

    .line 583
    .line 584
    const-string v12, "java/lang/Double"

    .line 585
    .line 586
    const-string v13, "doubleValue"

    .line 587
    .line 588
    invoke-virtual/range {v10 .. v15}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMethodInsn(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V

    .line 589
    .line 590
    .line 591
    const/16 v0, 0xaf

    .line 592
    .line 593
    invoke-virtual {v10, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 594
    .line 595
    .line 596
    goto/16 :goto_9

    .line 597
    .line 598
    :cond_16
    const/16 v0, 0xb0

    .line 599
    .line 600
    invoke-virtual {v10, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitInsn(I)V

    .line 601
    .line 602
    .line 603
    goto/16 :goto_9

    .line 604
    .line 605
    :goto_a
    invoke-virtual {v10, v0, v0}, Lbsh/org/objectweb/asm/MethodVisitor;->visitMaxs(II)V

    .line 606
    .line 607
    .line 608
    invoke-virtual {v10}, Lbsh/org/objectweb/asm/MethodVisitor;->visitEnd()V

    .line 609
    .line 610
    .line 611
    return-void
.end method
