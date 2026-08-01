.class public Lcom/android/dx/dex/cf/CfTranslator;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final DEBUG:Z = false


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

.method private static coerceConstant(Lcom/android/dx/rop/cst/TypedConstant;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/TypedConstant;
    .locals 3

    .line 1
    invoke-interface {p0}, Lcom/android/dx/rop/type/TypeBearer;->getType()Lcom/android/dx/rop/type/Type;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0, p1}, Lcom/android/dx/rop/type/Type;->equals(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/rop/type/Type;->getBasicType()I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    const/4 v1, 0x1

    .line 17
    if-eq v0, v1, :cond_4

    .line 18
    .line 19
    const/4 v1, 0x2

    .line 20
    if-eq v0, v1, :cond_3

    .line 21
    .line 22
    const/4 v1, 0x3

    .line 23
    if-eq v0, v1, :cond_2

    .line 24
    .line 25
    const/16 v1, 0x8

    .line 26
    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 32
    .line 33
    .line 34
    move-result p0

    .line 35
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstShort;->make(I)Lcom/android/dx/rop/cst/CstShort;

    .line 36
    .line 37
    .line 38
    move-result-object p0

    .line 39
    return-object p0

    .line 40
    :cond_1
    new-instance v0, Ljava/lang/UnsupportedOperationException;

    .line 41
    .line 42
    new-instance v1, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v2, "can\'t coerce "

    .line 45
    .line 46
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string p0, " to "

    .line 53
    .line 54
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object p0

    .line 64
    invoke-direct {v0, p0}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V

    .line 65
    .line 66
    .line 67
    throw v0

    .line 68
    :cond_2
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 71
    .line 72
    .line 73
    move-result p0

    .line 74
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstChar;->make(I)Lcom/android/dx/rop/cst/CstChar;

    .line 75
    .line 76
    .line 77
    move-result-object p0

    .line 78
    return-object p0

    .line 79
    :cond_3
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstByte;->make(I)Lcom/android/dx/rop/cst/CstByte;

    .line 86
    .line 87
    .line 88
    move-result-object p0

    .line 89
    return-object p0

    .line 90
    :cond_4
    check-cast p0, Lcom/android/dx/rop/cst/CstInteger;

    .line 91
    .line 92
    invoke-virtual {p0}, Lcom/android/dx/rop/cst/CstInteger;->getValue()I

    .line 93
    .line 94
    .line 95
    move-result p0

    .line 96
    invoke-static {p0}, Lcom/android/dx/rop/cst/CstBoolean;->make(I)Lcom/android/dx/rop/cst/CstBoolean;

    .line 97
    .line 98
    .line 99
    move-result-object p0

    .line 100
    return-object p0
.end method

.method private static processFields(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/dex/file/ClassDefItem;Lcom/android/dx/dex/file/DexFile;)V
    .locals 8

    .line 1
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {p0}, Lcom/android/dx/cf/direct/DirectClassFile;->getFields()Lcom/android/dx/cf/iface/FieldList;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-interface {p0}, Lcom/android/dx/cf/iface/FieldList;->size()I

    .line 10
    .line 11
    .line 12
    move-result v1

    .line 13
    const/4 v2, 0x0

    .line 14
    :goto_0
    if-ge v2, v1, :cond_3

    .line 15
    .line 16
    invoke-interface {p0, v2}, Lcom/android/dx/cf/iface/FieldList;->get(I)Lcom/android/dx/cf/iface/Field;

    .line 17
    .line 18
    .line 19
    move-result-object v3

    .line 20
    :try_start_0
    new-instance v4, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 21
    .line 22
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Member;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 23
    .line 24
    .line 25
    move-result-object v5

    .line 26
    invoke-direct {v4, v0, v5}, Lcom/android/dx/rop/cst/CstFieldRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 27
    .line 28
    .line 29
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Member;->getAccessFlags()I

    .line 30
    .line 31
    .line 32
    move-result v5

    .line 33
    invoke-static {v5}, Lcom/android/dx/rop/code/AccessFlags;->isStatic(I)Z

    .line 34
    .line 35
    .line 36
    move-result v6

    .line 37
    if-eqz v6, :cond_1

    .line 38
    .line 39
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Field;->getConstantValue()Lcom/android/dx/rop/cst/TypedConstant;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    new-instance v7, Lcom/android/dx/dex/file/EncodedField;

    .line 44
    .line 45
    invoke-direct {v7, v4, v5}, Lcom/android/dx/dex/file/EncodedField;-><init>(Lcom/android/dx/rop/cst/CstFieldRef;I)V

    .line 46
    .line 47
    .line 48
    if-eqz v6, :cond_0

    .line 49
    .line 50
    invoke-virtual {v4}, Lcom/android/dx/rop/cst/CstFieldRef;->getType()Lcom/android/dx/rop/type/Type;

    .line 51
    .line 52
    .line 53
    move-result-object v5

    .line 54
    invoke-static {v6, v5}, Lcom/android/dx/dex/cf/CfTranslator;->coerceConstant(Lcom/android/dx/rop/cst/TypedConstant;Lcom/android/dx/rop/type/Type;)Lcom/android/dx/rop/cst/TypedConstant;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    goto :goto_1

    .line 59
    :catch_0
    move-exception p0

    .line 60
    goto :goto_3

    .line 61
    :cond_0
    :goto_1
    invoke-virtual {p1, v7, v6}, Lcom/android/dx/dex/file/ClassDefItem;->addStaticField(Lcom/android/dx/dex/file/EncodedField;Lcom/android/dx/rop/cst/Constant;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_1
    new-instance v6, Lcom/android/dx/dex/file/EncodedField;

    .line 66
    .line 67
    invoke-direct {v6, v4, v5}, Lcom/android/dx/dex/file/EncodedField;-><init>(Lcom/android/dx/rop/cst/CstFieldRef;I)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v6}, Lcom/android/dx/dex/file/ClassDefItem;->addInstanceField(Lcom/android/dx/dex/file/EncodedField;)V

    .line 71
    .line 72
    .line 73
    :goto_2
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Member;->getAttributes()Lcom/android/dx/cf/iface/AttributeList;

    .line 74
    .line 75
    .line 76
    move-result-object v5

    .line 77
    invoke-static {v5}, Lcom/android/dx/dex/cf/AttributeTranslator;->getAnnotations(Lcom/android/dx/cf/iface/AttributeList;)Lcom/android/dx/rop/annotation/Annotations;

    .line 78
    .line 79
    .line 80
    move-result-object v5

    .line 81
    invoke-virtual {v5}, Lcom/android/dx/rop/annotation/Annotations;->size()I

    .line 82
    .line 83
    .line 84
    move-result v6

    .line 85
    if-eqz v6, :cond_2

    .line 86
    .line 87
    invoke-virtual {p1, v4, v5, p2}, Lcom/android/dx/dex/file/ClassDefItem;->addFieldAnnotations(Lcom/android/dx/rop/cst/CstFieldRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 88
    .line 89
    .line 90
    :cond_2
    invoke-virtual {p2}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 91
    .line 92
    .line 93
    move-result-object v5

    .line 94
    invoke-virtual {v5, v4}, Lcom/android/dx/dex/file/FieldIdsSection;->intern(Lcom/android/dx/rop/cst/CstFieldRef;)Lcom/android/dx/dex/file/FieldIdItem;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 95
    .line 96
    .line 97
    add-int/lit8 v2, v2, 0x1

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :goto_3
    new-instance p1, Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string p2, "...while processing "

    .line 103
    .line 104
    invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 105
    .line 106
    .line 107
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Member;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 108
    .line 109
    .line 110
    move-result-object p2

    .line 111
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 112
    .line 113
    .line 114
    move-result-object p2

    .line 115
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    const-string p2, " "

    .line 119
    .line 120
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 121
    .line 122
    .line 123
    invoke-interface {v3}, Lcom/android/dx/cf/iface/Member;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 124
    .line 125
    .line 126
    move-result-object p2

    .line 127
    invoke-virtual {p2}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object p2

    .line 131
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object p1

    .line 138
    invoke-static {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 139
    .line 140
    .line 141
    move-result-object p0

    .line 142
    throw p0

    .line 143
    :cond_3
    return-void
.end method

.method private static processMethods(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/ClassDefItem;Lcom/android/dx/dex/file/DexFile;)V
    .locals 25

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p2

    .line 4
    .line 5
    move-object/from16 v2, p3

    .line 6
    .line 7
    move-object/from16 v8, p4

    .line 8
    .line 9
    move-object/from16 v9, p5

    .line 10
    .line 11
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 12
    .line 13
    .line 14
    move-result-object v10

    .line 15
    invoke-virtual/range {p1 .. p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getMethods()Lcom/android/dx/cf/iface/MethodList;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    invoke-interface {v11}, Lcom/android/dx/cf/iface/MethodList;->size()I

    .line 20
    .line 21
    .line 22
    move-result v12

    .line 23
    const/4 v14, 0x0

    .line 24
    :goto_0
    if-ge v14, v12, :cond_f

    .line 25
    .line 26
    invoke-interface {v11, v14}, Lcom/android/dx/cf/iface/MethodList;->get(I)Lcom/android/dx/cf/iface/Method;

    .line 27
    .line 28
    .line 29
    move-result-object v15

    .line 30
    :try_start_0
    new-instance v3, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 31
    .line 32
    invoke-interface {v15}, Lcom/android/dx/cf/iface/Member;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 33
    .line 34
    .line 35
    move-result-object v4

    .line 36
    invoke-direct {v3, v10, v4}, Lcom/android/dx/rop/cst/CstMethodRef;-><init>(Lcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/cst/CstNat;)V

    .line 37
    .line 38
    .line 39
    invoke-interface {v15}, Lcom/android/dx/cf/iface/Member;->getAccessFlags()I

    .line 40
    .line 41
    .line 42
    move-result v16

    .line 43
    invoke-static/range {v16 .. v16}, Lcom/android/dx/rop/code/AccessFlags;->isStatic(I)Z

    .line 44
    .line 45
    .line 46
    move-result v4

    .line 47
    invoke-static/range {v16 .. v16}, Lcom/android/dx/rop/code/AccessFlags;->isPrivate(I)Z

    .line 48
    .line 49
    .line 50
    move-result v17

    .line 51
    invoke-static/range {v16 .. v16}, Lcom/android/dx/rop/code/AccessFlags;->isNative(I)Z

    .line 52
    .line 53
    .line 54
    move-result v18

    .line 55
    invoke-static/range {v16 .. v16}, Lcom/android/dx/rop/code/AccessFlags;->isAbstract(I)Z

    .line 56
    .line 57
    .line 58
    move-result v5

    .line 59
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isInstanceInit()Z

    .line 60
    .line 61
    .line 62
    move-result v6

    .line 63
    const/4 v7, 0x1

    .line 64
    if-nez v6, :cond_1

    .line 65
    .line 66
    invoke-virtual {v3}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isClassInit()Z

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    if-eqz v6, :cond_0

    .line 71
    .line 72
    goto :goto_1

    .line 73
    :cond_0
    const/16 v19, 0x0

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :catch_0
    move-exception v0

    .line 77
    goto/16 :goto_b

    .line 78
    .line 79
    :cond_1
    :goto_1
    move/from16 v19, v7

    .line 80
    .line 81
    :goto_2
    if-nez v18, :cond_2

    .line 82
    .line 83
    if-eqz v5, :cond_3

    .line 84
    .line 85
    :cond_2
    move-object/from16 v13, p1

    .line 86
    .line 87
    move/from16 v21, v4

    .line 88
    .line 89
    move-object/from16 v24, v10

    .line 90
    .line 91
    move-object v10, v3

    .line 92
    goto/16 :goto_7

    .line 93
    .line 94
    :cond_3
    new-instance v5, Lcom/android/dx/cf/code/ConcreteMethod;

    .line 95
    .line 96
    iget v6, v1, Lcom/android/dx/dex/cf/CfOptions;->positionInfo:I

    .line 97
    .line 98
    if-eq v6, v7, :cond_4

    .line 99
    .line 100
    goto :goto_3

    .line 101
    :cond_4
    const/4 v7, 0x0

    .line 102
    :goto_3
    iget-boolean v6, v1, Lcom/android/dx/dex/cf/CfOptions;->localInfo:Z

    .line 103
    .line 104
    move-object/from16 v13, p1

    .line 105
    .line 106
    invoke-direct {v5, v15, v13, v7, v6}, Lcom/android/dx/cf/code/ConcreteMethod;-><init>(Lcom/android/dx/cf/iface/Method;Lcom/android/dx/cf/iface/ClassFile;ZZ)V

    .line 107
    .line 108
    .line 109
    sget-object v6, Lcom/android/dx/rop/code/DexTranslationAdvice;->THE_ONE:Lcom/android/dx/rop/code/DexTranslationAdvice;

    .line 110
    .line 111
    invoke-static {v5, v6, v11, v2}, Lcom/android/dx/cf/code/Ropper;->convert(Lcom/android/dx/cf/code/ConcreteMethod;Lcom/android/dx/rop/code/TranslationAdvice;Lcom/android/dx/cf/iface/MethodList;Lcom/android/dx/dex/DexOptions;)Lcom/android/dx/rop/code/RopMethod;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    move-object/from16 v21, v5

    .line 116
    .line 117
    invoke-virtual {v3, v4}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->getParameterWordCount(Z)I

    .line 118
    .line 119
    .line 120
    move-result v5

    .line 121
    move-object/from16 v22, v3

    .line 122
    .line 123
    new-instance v3, Ljava/lang/StringBuilder;

    .line 124
    .line 125
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v10}, Lcom/android/dx/rop/cst/CstType;->getClassType()Lcom/android/dx/rop/type/Type;

    .line 129
    .line 130
    .line 131
    move-result-object v23

    .line 132
    move-object/from16 v24, v10

    .line 133
    .line 134
    invoke-virtual/range {v23 .. v23}, Lcom/android/dx/rop/type/Type;->getDescriptor()Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v10

    .line 138
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    const-string v10, "."

    .line 142
    .line 143
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-interface {v15}, Lcom/android/dx/cf/iface/Member;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 147
    .line 148
    .line 149
    move-result-object v10

    .line 150
    invoke-virtual {v10}, Lcom/android/dx/rop/cst/CstString;->getString()Ljava/lang/String;

    .line 151
    .line 152
    .line 153
    move-result-object v10

    .line 154
    invoke-virtual {v3, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 158
    .line 159
    .line 160
    move-result-object v3

    .line 161
    iget-boolean v10, v1, Lcom/android/dx/dex/cf/CfOptions;->optimize:Z

    .line 162
    .line 163
    if-eqz v10, :cond_5

    .line 164
    .line 165
    iget-object v10, v0, Lcom/android/dx/command/dexer/DxContext;->optimizerOptions:Lcom/android/dx/dex/cf/OptimizerOptions;

    .line 166
    .line 167
    invoke-virtual {v10, v3}, Lcom/android/dx/dex/cf/OptimizerOptions;->shouldOptimize(Ljava/lang/String;)Z

    .line 168
    .line 169
    .line 170
    move-result v3

    .line 171
    if-eqz v3, :cond_5

    .line 172
    .line 173
    iget-boolean v3, v1, Lcom/android/dx/dex/cf/CfOptions;->localInfo:Z

    .line 174
    .line 175
    invoke-static {v7, v5, v4, v3, v6}, Lcom/android/dx/ssa/Optimizer;->optimize(Lcom/android/dx/rop/code/RopMethod;IZZLcom/android/dx/rop/code/TranslationAdvice;)Lcom/android/dx/rop/code/RopMethod;

    .line 176
    .line 177
    .line 178
    move-result-object v3

    .line 179
    iget-boolean v6, v1, Lcom/android/dx/dex/cf/CfOptions;->statistics:Z

    .line 180
    .line 181
    if-eqz v6, :cond_6

    .line 182
    .line 183
    iget-object v6, v0, Lcom/android/dx/command/dexer/DxContext;->codeStatistics:Lcom/android/dx/dex/cf/CodeStatistics;

    .line 184
    .line 185
    invoke-virtual {v6, v7, v3}, Lcom/android/dx/dex/cf/CodeStatistics;->updateRopStatistics(Lcom/android/dx/rop/code/RopMethod;Lcom/android/dx/rop/code/RopMethod;)V

    .line 186
    .line 187
    .line 188
    goto :goto_4

    .line 189
    :cond_5
    move-object v3, v7

    .line 190
    const/4 v7, 0x0

    .line 191
    :cond_6
    :goto_4
    iget-boolean v6, v1, Lcom/android/dx/dex/cf/CfOptions;->localInfo:Z

    .line 192
    .line 193
    if-eqz v6, :cond_7

    .line 194
    .line 195
    invoke-static {v3}, Lcom/android/dx/rop/code/LocalVariableExtractor;->extract(Lcom/android/dx/rop/code/RopMethod;)Lcom/android/dx/rop/code/LocalVariableInfo;

    .line 196
    .line 197
    .line 198
    move-result-object v6

    .line 199
    goto :goto_5

    .line 200
    :cond_7
    const/4 v6, 0x0

    .line 201
    :goto_5
    iget v10, v1, Lcom/android/dx/dex/cf/CfOptions;->positionInfo:I

    .line 202
    .line 203
    invoke-static {v3, v10, v6, v5, v2}, Lcom/android/dx/dex/code/RopTranslator;->translate(Lcom/android/dx/rop/code/RopMethod;ILcom/android/dx/rop/code/LocalVariableInfo;ILcom/android/dx/dex/DexOptions;)Lcom/android/dx/dex/code/DalvCode;

    .line 204
    .line 205
    .line 206
    move-result-object v10

    .line 207
    iget-boolean v0, v1, Lcom/android/dx/dex/cf/CfOptions;->statistics:Z

    .line 208
    .line 209
    if-eqz v0, :cond_8

    .line 210
    .line 211
    if-eqz v7, :cond_8

    .line 212
    .line 213
    invoke-virtual/range {v21 .. v21}, Lcom/android/dx/cf/code/ConcreteMethod;->getCode()Lcom/android/dx/cf/code/BytecodeArray;

    .line 214
    .line 215
    .line 216
    move-result-object v0

    .line 217
    invoke-virtual {v0}, Lcom/android/dx/cf/code/BytecodeArray;->size()I

    .line 218
    .line 219
    .line 220
    move-result v0

    .line 221
    move-object/from16 v20, v6

    .line 222
    .line 223
    move v6, v5

    .line 224
    move-object/from16 v5, v20

    .line 225
    .line 226
    move/from16 v21, v4

    .line 227
    .line 228
    move-object v4, v7

    .line 229
    move-object/from16 v20, v10

    .line 230
    .line 231
    move-object/from16 v10, v22

    .line 232
    .line 233
    move v7, v0

    .line 234
    move-object/from16 v0, p0

    .line 235
    .line 236
    invoke-static/range {v0 .. v7}, Lcom/android/dx/dex/cf/CfTranslator;->updateDexStatistics(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/rop/code/RopMethod;Lcom/android/dx/rop/code/RopMethod;Lcom/android/dx/rop/code/LocalVariableInfo;II)V

    .line 237
    .line 238
    .line 239
    goto :goto_6

    .line 240
    :cond_8
    move/from16 v21, v4

    .line 241
    .line 242
    move-object/from16 v20, v10

    .line 243
    .line 244
    move-object/from16 v10, v22

    .line 245
    .line 246
    :goto_6
    move-object/from16 v6, v20

    .line 247
    .line 248
    goto :goto_8

    .line 249
    :goto_7
    const/4 v6, 0x0

    .line 250
    :goto_8
    invoke-static/range {v16 .. v16}, Lcom/android/dx/rop/code/AccessFlags;->isSynchronized(I)Z

    .line 251
    .line 252
    .line 253
    move-result v0

    .line 254
    if-eqz v0, :cond_9

    .line 255
    .line 256
    const/high16 v0, 0x20000

    .line 257
    .line 258
    or-int v16, v16, v0

    .line 259
    .line 260
    if-nez v18, :cond_9

    .line 261
    .line 262
    and-int/lit8 v16, v16, -0x21

    .line 263
    .line 264
    :cond_9
    if-eqz v19, :cond_a

    .line 265
    .line 266
    const/high16 v0, 0x10000

    .line 267
    .line 268
    or-int v16, v16, v0

    .line 269
    .line 270
    :cond_a
    move/from16 v0, v16

    .line 271
    .line 272
    invoke-static {v15}, Lcom/android/dx/dex/cf/AttributeTranslator;->getExceptions(Lcom/android/dx/cf/iface/Method;)Lcom/android/dx/rop/type/TypeList;

    .line 273
    .line 274
    .line 275
    move-result-object v1

    .line 276
    new-instance v2, Lcom/android/dx/dex/file/EncodedMethod;

    .line 277
    .line 278
    invoke-direct {v2, v10, v0, v6, v1}, Lcom/android/dx/dex/file/EncodedMethod;-><init>(Lcom/android/dx/rop/cst/CstMethodRef;ILcom/android/dx/dex/code/DalvCode;Lcom/android/dx/rop/type/TypeList;)V

    .line 279
    .line 280
    .line 281
    invoke-virtual {v10}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isInstanceInit()Z

    .line 282
    .line 283
    .line 284
    move-result v0

    .line 285
    if-nez v0, :cond_c

    .line 286
    .line 287
    invoke-virtual {v10}, Lcom/android/dx/rop/cst/CstBaseMethodRef;->isClassInit()Z

    .line 288
    .line 289
    .line 290
    move-result v0

    .line 291
    if-nez v0, :cond_c

    .line 292
    .line 293
    if-nez v21, :cond_c

    .line 294
    .line 295
    if-eqz v17, :cond_b

    .line 296
    .line 297
    goto :goto_9

    .line 298
    :cond_b
    invoke-virtual {v8, v2}, Lcom/android/dx/dex/file/ClassDefItem;->addVirtualMethod(Lcom/android/dx/dex/file/EncodedMethod;)V

    .line 299
    .line 300
    .line 301
    goto :goto_a

    .line 302
    :cond_c
    :goto_9
    invoke-virtual {v8, v2}, Lcom/android/dx/dex/file/ClassDefItem;->addDirectMethod(Lcom/android/dx/dex/file/EncodedMethod;)V

    .line 303
    .line 304
    .line 305
    :goto_a
    invoke-static {v15}, Lcom/android/dx/dex/cf/AttributeTranslator;->getMethodAnnotations(Lcom/android/dx/cf/iface/Method;)Lcom/android/dx/rop/annotation/Annotations;

    .line 306
    .line 307
    .line 308
    move-result-object v0

    .line 309
    invoke-virtual {v0}, Lcom/android/dx/rop/annotation/Annotations;->size()I

    .line 310
    .line 311
    .line 312
    move-result v1

    .line 313
    if-eqz v1, :cond_d

    .line 314
    .line 315
    invoke-virtual {v8, v10, v0, v9}, Lcom/android/dx/dex/file/ClassDefItem;->addMethodAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 316
    .line 317
    .line 318
    :cond_d
    invoke-static {v15}, Lcom/android/dx/dex/cf/AttributeTranslator;->getParameterAnnotations(Lcom/android/dx/cf/iface/Method;)Lcom/android/dx/rop/annotation/AnnotationsList;

    .line 319
    .line 320
    .line 321
    move-result-object v0

    .line 322
    invoke-virtual {v0}, Lcom/android/dx/util/FixedSizeList;->size()I

    .line 323
    .line 324
    .line 325
    move-result v1

    .line 326
    if-eqz v1, :cond_e

    .line 327
    .line 328
    invoke-virtual {v8, v10, v0, v9}, Lcom/android/dx/dex/file/ClassDefItem;->addParameterAnnotations(Lcom/android/dx/rop/cst/CstMethodRef;Lcom/android/dx/rop/annotation/AnnotationsList;Lcom/android/dx/dex/file/DexFile;)V

    .line 329
    .line 330
    .line 331
    :cond_e
    invoke-virtual {v9}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 332
    .line 333
    .line 334
    move-result-object v0

    .line 335
    invoke-virtual {v0, v10}, Lcom/android/dx/dex/file/MethodIdsSection;->intern(Lcom/android/dx/rop/cst/CstBaseMethodRef;)Lcom/android/dx/dex/file/MethodIdItem;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 336
    .line 337
    .line 338
    add-int/lit8 v14, v14, 0x1

    .line 339
    .line 340
    move-object/from16 v0, p0

    .line 341
    .line 342
    move-object/from16 v1, p2

    .line 343
    .line 344
    move-object/from16 v2, p3

    .line 345
    .line 346
    move-object/from16 v10, v24

    .line 347
    .line 348
    goto/16 :goto_0

    .line 349
    .line 350
    :goto_b
    new-instance v1, Ljava/lang/StringBuilder;

    .line 351
    .line 352
    const-string v2, "...while processing "

    .line 353
    .line 354
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 355
    .line 356
    .line 357
    invoke-interface {v15}, Lcom/android/dx/cf/iface/Member;->getName()Lcom/android/dx/rop/cst/CstString;

    .line 358
    .line 359
    .line 360
    move-result-object v2

    .line 361
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 362
    .line 363
    .line 364
    move-result-object v2

    .line 365
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 366
    .line 367
    .line 368
    const-string v2, " "

    .line 369
    .line 370
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 371
    .line 372
    .line 373
    invoke-interface {v15}, Lcom/android/dx/cf/iface/Member;->getDescriptor()Lcom/android/dx/rop/cst/CstString;

    .line 374
    .line 375
    .line 376
    move-result-object v2

    .line 377
    invoke-virtual {v2}, Lcom/android/dx/rop/cst/CstString;->toHuman()Ljava/lang/String;

    .line 378
    .line 379
    .line 380
    move-result-object v2

    .line 381
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 382
    .line 383
    .line 384
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 385
    .line 386
    .line 387
    move-result-object v1

    .line 388
    invoke-static {v0, v1}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 389
    .line 390
    .line 391
    move-result-object v0

    .line 392
    throw v0

    .line 393
    :cond_f
    return-void
.end method

.method public static translate(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/cf/direct/DirectClassFile;[BLcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/DexFile;)Lcom/android/dx/dex/file/ClassDefItem;
    .locals 1

    .line 1
    :try_start_0
    invoke-static/range {p0 .. p5}, Lcom/android/dx/dex/cf/CfTranslator;->translate0(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/cf/direct/DirectClassFile;[BLcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/DexFile;)Lcom/android/dx/dex/file/ClassDefItem;

    .line 2
    .line 3
    .line 4
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 5
    return-object p0

    .line 6
    :catch_0
    move-exception v0

    .line 7
    move-object p0, v0

    .line 8
    new-instance p2, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    const-string p3, "...while processing "

    .line 11
    .line 12
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getFilePath()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {p0, p1}, Lcom/android/dex/util/ExceptionWithContext;->withContext(Ljava/lang/Throwable;Ljava/lang/String;)Lcom/android/dex/util/ExceptionWithContext;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    throw p0
.end method

.method private static translate0(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/cf/direct/DirectClassFile;[BLcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/DexFile;)Lcom/android/dx/dex/file/ClassDefItem;
    .locals 8

    .line 1
    iget-object p2, p0, Lcom/android/dx/command/dexer/DxContext;->optimizerOptions:Lcom/android/dx/dex/cf/OptimizerOptions;

    .line 2
    .line 3
    iget-object v0, p3, Lcom/android/dx/dex/cf/CfOptions;->optimizeListFile:Ljava/lang/String;

    .line 4
    .line 5
    iget-object v1, p3, Lcom/android/dx/dex/cf/CfOptions;->dontOptimizeListFile:Ljava/lang/String;

    .line 6
    .line 7
    invoke-virtual {p2, v0, v1}, Lcom/android/dx/dex/cf/OptimizerOptions;->loadOptimizeLists(Ljava/lang/String;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getAccessFlags()I

    .line 15
    .line 16
    .line 17
    move-result p2

    .line 18
    and-int/lit8 v4, p2, -0x21

    .line 19
    .line 20
    iget p2, p3, Lcom/android/dx/dex/cf/CfOptions;->positionInfo:I

    .line 21
    .line 22
    const/4 v0, 0x1

    .line 23
    if-ne p2, v0, :cond_0

    .line 24
    .line 25
    const/4 p2, 0x0

    .line 26
    :goto_0
    move-object v7, p2

    .line 27
    goto :goto_1

    .line 28
    :cond_0
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getSourceFile()Lcom/android/dx/rop/cst/CstString;

    .line 29
    .line 30
    .line 31
    move-result-object p2

    .line 32
    goto :goto_0

    .line 33
    :goto_1
    new-instance v2, Lcom/android/dx/dex/file/ClassDefItem;

    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getSuperclass()Lcom/android/dx/rop/cst/CstType;

    .line 36
    .line 37
    .line 38
    move-result-object v5

    .line 39
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getInterfaces()Lcom/android/dx/rop/type/TypeList;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-direct/range {v2 .. v7}, Lcom/android/dx/dex/file/ClassDefItem;-><init>(Lcom/android/dx/rop/cst/CstType;ILcom/android/dx/rop/cst/CstType;Lcom/android/dx/rop/type/TypeList;Lcom/android/dx/rop/cst/CstString;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1, p3}, Lcom/android/dx/dex/cf/AttributeTranslator;->getClassAnnotations(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/dex/cf/CfOptions;)Lcom/android/dx/rop/annotation/Annotations;

    .line 47
    .line 48
    .line 49
    move-result-object p2

    .line 50
    invoke-virtual {p2}, Lcom/android/dx/rop/annotation/Annotations;->size()I

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_1

    .line 55
    .line 56
    invoke-virtual {v2, p2, p5}, Lcom/android/dx/dex/file/ClassDefItem;->setClassAnnotations(Lcom/android/dx/rop/annotation/Annotations;Lcom/android/dx/dex/file/DexFile;)V

    .line 57
    .line 58
    .line 59
    :cond_1
    invoke-virtual {p5}, Lcom/android/dx/dex/file/DexFile;->getFieldIds()Lcom/android/dx/dex/file/FieldIdsSection;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {p5}, Lcom/android/dx/dex/file/DexFile;->getMethodIds()Lcom/android/dx/dex/file/MethodIdsSection;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-virtual {p5}, Lcom/android/dx/dex/file/DexFile;->getMethodHandles()Lcom/android/dx/dex/file/MethodHandlesSection;

    .line 68
    .line 69
    .line 70
    move-result-object v3

    .line 71
    invoke-virtual {p5}, Lcom/android/dx/dex/file/DexFile;->getCallSiteIds()Lcom/android/dx/dex/file/CallSiteIdsSection;

    .line 72
    .line 73
    .line 74
    move-result-object v4

    .line 75
    invoke-static {p1, v2, p5}, Lcom/android/dx/dex/cf/CfTranslator;->processFields(Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/dex/file/ClassDefItem;Lcom/android/dx/dex/file/DexFile;)V

    .line 76
    .line 77
    .line 78
    move-object p2, p3

    .line 79
    move-object p3, p4

    .line 80
    move-object p4, v2

    .line 81
    invoke-static/range {p0 .. p5}, Lcom/android/dx/dex/cf/CfTranslator;->processMethods(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/cf/direct/DirectClassFile;Lcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/dex/file/ClassDefItem;Lcom/android/dx/dex/file/DexFile;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getConstantPool()Lcom/android/dx/rop/cst/ConstantPool;

    .line 85
    .line 86
    .line 87
    move-result-object p0

    .line 88
    invoke-interface {p0}, Lcom/android/dx/rop/cst/ConstantPool;->size()I

    .line 89
    .line 90
    .line 91
    move-result p2

    .line 92
    const/4 p3, 0x0

    .line 93
    :goto_2
    if-ge p3, p2, :cond_8

    .line 94
    .line 95
    invoke-interface {p0, p3}, Lcom/android/dx/rop/cst/ConstantPool;->getOrNull(I)Lcom/android/dx/rop/cst/Constant;

    .line 96
    .line 97
    .line 98
    move-result-object p4

    .line 99
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstMethodRef;

    .line 100
    .line 101
    if-eqz p5, :cond_2

    .line 102
    .line 103
    check-cast p4, Lcom/android/dx/rop/cst/CstBaseMethodRef;

    .line 104
    .line 105
    invoke-virtual {v1, p4}, Lcom/android/dx/dex/file/MethodIdsSection;->intern(Lcom/android/dx/rop/cst/CstBaseMethodRef;)Lcom/android/dx/dex/file/MethodIdItem;

    .line 106
    .line 107
    .line 108
    goto/16 :goto_4

    .line 109
    .line 110
    :cond_2
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 111
    .line 112
    if-eqz p5, :cond_3

    .line 113
    .line 114
    check-cast p4, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;

    .line 115
    .line 116
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInterfaceMethodRef;->toMethodRef()Lcom/android/dx/rop/cst/CstMethodRef;

    .line 117
    .line 118
    .line 119
    move-result-object p4

    .line 120
    invoke-virtual {v1, p4}, Lcom/android/dx/dex/file/MethodIdsSection;->intern(Lcom/android/dx/rop/cst/CstBaseMethodRef;)Lcom/android/dx/dex/file/MethodIdItem;

    .line 121
    .line 122
    .line 123
    goto :goto_4

    .line 124
    :cond_3
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 125
    .line 126
    if-eqz p5, :cond_4

    .line 127
    .line 128
    check-cast p4, Lcom/android/dx/rop/cst/CstFieldRef;

    .line 129
    .line 130
    invoke-virtual {v0, p4}, Lcom/android/dx/dex/file/FieldIdsSection;->intern(Lcom/android/dx/rop/cst/CstFieldRef;)Lcom/android/dx/dex/file/FieldIdItem;

    .line 131
    .line 132
    .line 133
    goto :goto_4

    .line 134
    :cond_4
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 135
    .line 136
    if-eqz p5, :cond_5

    .line 137
    .line 138
    check-cast p4, Lcom/android/dx/rop/cst/CstEnumRef;

    .line 139
    .line 140
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstEnumRef;->getFieldRef()Lcom/android/dx/rop/cst/CstFieldRef;

    .line 141
    .line 142
    .line 143
    move-result-object p4

    .line 144
    invoke-virtual {v0, p4}, Lcom/android/dx/dex/file/FieldIdsSection;->intern(Lcom/android/dx/rop/cst/CstFieldRef;)Lcom/android/dx/dex/file/FieldIdItem;

    .line 145
    .line 146
    .line 147
    goto :goto_4

    .line 148
    :cond_5
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 149
    .line 150
    if-eqz p5, :cond_6

    .line 151
    .line 152
    check-cast p4, Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 153
    .line 154
    invoke-virtual {v3, p4}, Lcom/android/dx/dex/file/MethodHandlesSection;->intern(Lcom/android/dx/rop/cst/CstMethodHandle;)V

    .line 155
    .line 156
    .line 157
    goto :goto_4

    .line 158
    :cond_6
    instance-of p5, p4, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 159
    .line 160
    if-eqz p5, :cond_7

    .line 161
    .line 162
    check-cast p4, Lcom/android/dx/rop/cst/CstInvokeDynamic;

    .line 163
    .line 164
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getBootstrapMethodIndex()I

    .line 165
    .line 166
    .line 167
    move-result p5

    .line 168
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getBootstrapMethods()Lcom/android/dx/cf/code/BootstrapMethodsList;

    .line 169
    .line 170
    .line 171
    move-result-object v5

    .line 172
    invoke-virtual {v5, p5}, Lcom/android/dx/cf/code/BootstrapMethodsList;->get(I)Lcom/android/dx/cf/code/BootstrapMethodsList$Item;

    .line 173
    .line 174
    .line 175
    move-result-object p5

    .line 176
    invoke-virtual {p5}, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->getBootstrapMethodHandle()Lcom/android/dx/rop/cst/CstMethodHandle;

    .line 177
    .line 178
    .line 179
    move-result-object v5

    .line 180
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getNat()Lcom/android/dx/rop/cst/CstNat;

    .line 181
    .line 182
    .line 183
    move-result-object v6

    .line 184
    invoke-virtual {p5}, Lcom/android/dx/cf/code/BootstrapMethodsList$Item;->getBootstrapMethodArguments()Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;

    .line 185
    .line 186
    .line 187
    move-result-object p5

    .line 188
    invoke-static {v5, v6, p5}, Lcom/android/dx/rop/cst/CstCallSite;->make(Lcom/android/dx/rop/cst/CstMethodHandle;Lcom/android/dx/rop/cst/CstNat;Lcom/android/dx/cf/code/BootstrapMethodArgumentsList;)Lcom/android/dx/rop/cst/CstCallSite;

    .line 189
    .line 190
    .line 191
    move-result-object p5

    .line 192
    invoke-virtual {p1}, Lcom/android/dx/cf/direct/DirectClassFile;->getThisClass()Lcom/android/dx/rop/cst/CstType;

    .line 193
    .line 194
    .line 195
    move-result-object v5

    .line 196
    invoke-virtual {p4, v5}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->setDeclaringClass(Lcom/android/dx/rop/cst/CstType;)V

    .line 197
    .line 198
    .line 199
    invoke-virtual {p4, p5}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->setCallSite(Lcom/android/dx/rop/cst/CstCallSite;)V

    .line 200
    .line 201
    .line 202
    invoke-virtual {p4}, Lcom/android/dx/rop/cst/CstInvokeDynamic;->getReferences()Ljava/util/List;

    .line 203
    .line 204
    .line 205
    move-result-object p4

    .line 206
    invoke-interface {p4}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 207
    .line 208
    .line 209
    move-result-object p4

    .line 210
    :goto_3
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 211
    .line 212
    .line 213
    move-result p5

    .line 214
    if-eqz p5, :cond_7

    .line 215
    .line 216
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 217
    .line 218
    .line 219
    move-result-object p5

    .line 220
    check-cast p5, Lcom/android/dx/rop/cst/CstCallSiteRef;

    .line 221
    .line 222
    invoke-virtual {v4, p5}, Lcom/android/dx/dex/file/CallSiteIdsSection;->intern(Lcom/android/dx/rop/cst/CstCallSiteRef;)V

    .line 223
    .line 224
    .line 225
    goto :goto_3

    .line 226
    :cond_7
    :goto_4
    add-int/lit8 p3, p3, 0x1

    .line 227
    .line 228
    goto/16 :goto_2

    .line 229
    .line 230
    :cond_8
    return-object v2
.end method

.method private static updateDexStatistics(Lcom/android/dx/command/dexer/DxContext;Lcom/android/dx/dex/cf/CfOptions;Lcom/android/dx/dex/DexOptions;Lcom/android/dx/rop/code/RopMethod;Lcom/android/dx/rop/code/RopMethod;Lcom/android/dx/rop/code/LocalVariableInfo;II)V
    .locals 1

    .line 1
    iget v0, p1, Lcom/android/dx/dex/cf/CfOptions;->positionInfo:I

    .line 2
    .line 3
    invoke-static {p3, v0, p5, p6, p2}, Lcom/android/dx/dex/code/RopTranslator;->translate(Lcom/android/dx/rop/code/RopMethod;ILcom/android/dx/rop/code/LocalVariableInfo;ILcom/android/dx/dex/DexOptions;)Lcom/android/dx/dex/code/DalvCode;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget p1, p1, Lcom/android/dx/dex/cf/CfOptions;->positionInfo:I

    .line 8
    .line 9
    invoke-static {p4, p1, p5, p6, p2}, Lcom/android/dx/dex/code/RopTranslator;->translate(Lcom/android/dx/rop/code/RopMethod;ILcom/android/dx/rop/code/LocalVariableInfo;ILcom/android/dx/dex/DexOptions;)Lcom/android/dx/dex/code/DalvCode;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    new-instance p2, Lcom/android/dx/dex/cf/CfTranslator$1;

    .line 14
    .line 15
    invoke-direct {p2}, Lcom/android/dx/dex/cf/CfTranslator$1;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p3, p2}, Lcom/android/dx/dex/code/DalvCode;->assignIndices(Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lcom/android/dx/dex/code/DalvCode;->assignIndices(Lcom/android/dx/dex/code/DalvCode$AssignIndicesCallback;)V

    .line 22
    .line 23
    .line 24
    iget-object p2, p0, Lcom/android/dx/command/dexer/DxContext;->codeStatistics:Lcom/android/dx/dex/cf/CodeStatistics;

    .line 25
    .line 26
    invoke-virtual {p2, p1, p3}, Lcom/android/dx/dex/cf/CodeStatistics;->updateDexStatistics(Lcom/android/dx/dex/code/DalvCode;Lcom/android/dx/dex/code/DalvCode;)V

    .line 27
    .line 28
    .line 29
    iget-object p0, p0, Lcom/android/dx/command/dexer/DxContext;->codeStatistics:Lcom/android/dx/dex/cf/CodeStatistics;

    .line 30
    .line 31
    invoke-virtual {p0, p7}, Lcom/android/dx/dex/cf/CodeStatistics;->updateOriginalByteCount(I)V

    .line 32
    .line 33
    .line 34
    return-void
.end method
