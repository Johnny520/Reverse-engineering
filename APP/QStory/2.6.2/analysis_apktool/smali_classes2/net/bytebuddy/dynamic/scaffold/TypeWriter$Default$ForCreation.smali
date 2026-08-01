.class public Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;
.super Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForCreation"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$PatchingModuleVisitor;,
        Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<U:",
        "Ljava/lang/Object;",
        ">",
        "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default<",
        "TU;>;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# instance fields
.field private final methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;Ljava/util/List;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/type/RecordComponentList;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/pool/TypePool;)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/ClassFileVersion;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;",
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/dynamic/DynamicType;",
            ">;",
            "Lnet/bytebuddy/description/field/FieldList<",
            "Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;",
            "Lnet/bytebuddy/description/method/MethodList<",
            "*>;",
            "Lnet/bytebuddy/description/type/RecordComponentList<",
            "Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;",
            ">;",
            "Lnet/bytebuddy/implementation/LoadedTypeInitializer;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;",
            "Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;",
            "Lnet/bytebuddy/asm/AsmVisitorWrapper;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;",
            "Lnet/bytebuddy/implementation/attribute/AnnotationRetention;",
            "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;",
            "Lnet/bytebuddy/implementation/Implementation$Context$Factory;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeValidation;",
            "Lnet/bytebuddy/utility/AsmClassReader$Factory;",
            "Lnet/bytebuddy/utility/AsmClassWriter$Factory;",
            "Lnet/bytebuddy/pool/TypePool;",
            ")V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p5

    move-object/from16 v5, p6

    move-object/from16 v6, p7

    move-object/from16 v7, p8

    move-object/from16 v8, p9

    move-object/from16 v9, p10

    move-object/from16 v10, p11

    move-object/from16 v11, p12

    move-object/from16 v12, p13

    move-object/from16 v13, p14

    move-object/from16 v14, p15

    move-object/from16 v15, p16

    move-object/from16 v16, p17

    move-object/from16 v17, p18

    move-object/from16 v18, p19

    move-object/from16 v19, p20

    move-object/from16 v20, p21

    move-object/from16 v21, p22

    .line 1
    invoke-direct/range {v0 .. v21}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;Ljava/util/List;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/method/MethodList;Lnet/bytebuddy/description/type/RecordComponentList;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;Lnet/bytebuddy/asm/AsmVisitorWrapper;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;Lnet/bytebuddy/implementation/attribute/AnnotationRetention;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/implementation/Implementation$Context$Factory;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;Lnet/bytebuddy/utility/AsmClassReader$Factory;Lnet/bytebuddy/utility/AsmClassWriter$Factory;Lnet/bytebuddy/pool/TypePool;)V

    move-object/from16 v1, p4

    .line 2
    iput-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    return-void
.end method

.method public static synthetic access$1500(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    .line 2
    .line 3
    return-object p0
.end method


# virtual methods
.method public create(Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ClassDumpAction$Dispatcher;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$UnresolvedType;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ClassDumpAction$Dispatcher;",
            ")",
            "Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default<",
            "TU;>.UnresolvedType;"
        }
    .end annotation

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeWriter(I)I

    .line 7
    .line 8
    .line 9
    move-result v10

    .line 10
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 11
    .line 12
    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeReader(I)I

    .line 13
    .line 14
    .line 15
    move-result v11

    .line 16
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->classWriterFactory:Lnet/bytebuddy/utility/AsmClassWriter$Factory;

    .line 17
    .line 18
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 19
    .line 20
    invoke-interface {v1, v10, v2}, Lnet/bytebuddy/utility/AsmClassWriter$Factory;->make(ILnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 25
    .line 26
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 27
    .line 28
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 29
    .line 30
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 31
    .line 32
    and-int/lit8 v5, v10, 0x2

    .line 33
    .line 34
    if-nez v5, :cond_1

    .line 35
    .line 36
    sget-object v5, Lnet/bytebuddy/ClassFileVersion;->JAVA_V6:Lnet/bytebuddy/ClassFileVersion;

    .line 37
    .line 38
    invoke-virtual {v6, v5}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 39
    .line 40
    .line 41
    move-result v5

    .line 42
    if-eqz v5, :cond_1

    .line 43
    .line 44
    and-int/lit8 v5, v11, 0x8

    .line 45
    .line 46
    if-nez v5, :cond_0

    .line 47
    .line 48
    sget-object v5, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->GENERATE:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 49
    .line 50
    :goto_0
    move-object v8, v5

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    sget-object v5, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EXPAND:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 53
    .line 54
    goto :goto_0

    .line 55
    :cond_1
    sget-object v5, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->DISABLED:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_1
    move-object v7, v6

    .line 59
    move-object/from16 v5, p1

    .line 60
    .line 61
    invoke-interface/range {v2 .. v8}, Lnet/bytebuddy/implementation/Implementation$Context$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;)Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

    .line 62
    .line 63
    .line 64
    move-result-object v6

    .line 65
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 66
    .line 67
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    invoke-interface {v1}, Lnet/bytebuddy/utility/AsmClassWriter;->getVisitor()Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 70
    .line 71
    .line 72
    move-result-object v2

    .line 73
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 74
    .line 75
    invoke-static {v2, v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->of(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 76
    .line 77
    .line 78
    move-result-object v5

    .line 79
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 80
    .line 81
    iget-object v8, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->fields:Lnet/bytebuddy/description/field/FieldList;

    .line 82
    .line 83
    iget-object v9, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 84
    .line 85
    invoke-interface/range {v3 .. v11}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;II)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 86
    .line 87
    .line 88
    move-result-object v12

    .line 89
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 90
    .line 91
    invoke-virtual {v2}, Lnet/bytebuddy/ClassFileVersion;->getMinorMajorVersion()I

    .line 92
    .line 93
    .line 94
    move-result v13

    .line 95
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 96
    .line 97
    invoke-interface {v2}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 98
    .line 99
    .line 100
    move-result v3

    .line 101
    xor-int/lit8 v3, v3, 0x1

    .line 102
    .line 103
    invoke-interface {v2, v3}, Lnet/bytebuddy/description/type/TypeDescription;->getActualModifiers(Z)I

    .line 104
    .line 105
    .line 106
    move-result v14

    .line 107
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 108
    .line 109
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v15

    .line 113
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 114
    .line 115
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getGenericSignature()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v16

    .line 119
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 120
    .line 121
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 122
    .line 123
    .line 124
    move-result-object v2

    .line 125
    const-string v3, "module-info"

    .line 126
    .line 127
    invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 128
    .line 129
    .line 130
    move-result v2

    .line 131
    if-eqz v2, :cond_2

    .line 132
    .line 133
    const/4 v2, 0x0

    .line 134
    :goto_2
    move-object/from16 v17, v2

    .line 135
    .line 136
    goto :goto_4

    .line 137
    :cond_2
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 138
    .line 139
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 140
    .line 141
    .line 142
    move-result-object v2

    .line 143
    if-nez v2, :cond_3

    .line 144
    .line 145
    const-class v2, Ljava/lang/Object;

    .line 146
    .line 147
    invoke-static {v2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 148
    .line 149
    .line 150
    move-result-object v2

    .line 151
    goto :goto_3

    .line 152
    :cond_3
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 153
    .line 154
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 155
    .line 156
    .line 157
    move-result-object v2

    .line 158
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 159
    .line 160
    .line 161
    move-result-object v2

    .line 162
    :goto_3
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 163
    .line 164
    .line 165
    move-result-object v2

    .line 166
    goto :goto_2

    .line 167
    :goto_4
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 168
    .line 169
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDefinition;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 170
    .line 171
    .line 172
    move-result-object v2

    .line 173
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeList$Generic;->asErasures()Lnet/bytebuddy/description/type/TypeList;

    .line 174
    .line 175
    .line 176
    move-result-object v2

    .line 177
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeList;->toInternalNames()[Ljava/lang/String;

    .line 178
    .line 179
    .line 180
    move-result-object v18

    .line 181
    invoke-virtual/range {v12 .. v18}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visit(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 185
    .line 186
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;

    .line 187
    .line 188
    .line 189
    move-result-object v2

    .line 190
    if-eqz v2, :cond_4

    .line 191
    .line 192
    invoke-interface {v2, v12}, Lnet/bytebuddy/description/module/ModuleDescription;->accept(Lnet/bytebuddy/jar/asm/ClassVisitor;)V

    .line 193
    .line 194
    .line 195
    :cond_4
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 196
    .line 197
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->isNestHost()Z

    .line 198
    .line 199
    .line 200
    move-result v2

    .line 201
    if-nez v2, :cond_5

    .line 202
    .line 203
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 204
    .line 205
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getNestHost()Lnet/bytebuddy/description/type/TypeDescription;

    .line 206
    .line 207
    .line 208
    move-result-object v2

    .line 209
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 210
    .line 211
    .line 212
    move-result-object v2

    .line 213
    invoke-virtual {v12, v2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestHost(Ljava/lang/String;)V

    .line 214
    .line 215
    .line 216
    :cond_5
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 217
    .line 218
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 219
    .line 220
    .line 221
    move-result-object v2

    .line 222
    if-eqz v2, :cond_6

    .line 223
    .line 224
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 225
    .line 226
    .line 227
    move-result-object v3

    .line 228
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 229
    .line 230
    .line 231
    move-result-object v3

    .line 232
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 233
    .line 234
    .line 235
    move-result-object v4

    .line 236
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithDescriptor;->getDescriptor()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v2

    .line 240
    invoke-virtual {v12, v3, v4, v2}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 241
    .line 242
    .line 243
    goto :goto_5

    .line 244
    :cond_6
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 245
    .line 246
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->isLocalType()Z

    .line 247
    .line 248
    .line 249
    move-result v2

    .line 250
    if-nez v2, :cond_7

    .line 251
    .line 252
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 253
    .line 254
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->isAnonymousType()Z

    .line 255
    .line 256
    .line 257
    move-result v2

    .line 258
    if-eqz v2, :cond_8

    .line 259
    .line 260
    :cond_7
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 261
    .line 262
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 263
    .line 264
    .line 265
    move-result-object v2

    .line 266
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 267
    .line 268
    .line 269
    move-result-object v2

    .line 270
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    .line 275
    .line 276
    .line 277
    move-result-object v4

    .line 278
    invoke-virtual {v12, v2, v3, v4}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitOuterClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :cond_8
    :goto_5
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeAttributeAppender:Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;

    .line 282
    .line 283
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 284
    .line 285
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 286
    .line 287
    invoke-interface {v4, v3}, Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;->on(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;

    .line 288
    .line 289
    .line 290
    move-result-object v4

    .line 291
    invoke-interface {v2, v12, v3, v4}, Lnet/bytebuddy/implementation/attribute/TypeAttributeAppender;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter;)V

    .line 292
    .line 293
    .line 294
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 295
    .line 296
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->isNestHost()Z

    .line 297
    .line 298
    .line 299
    move-result v2

    .line 300
    if-eqz v2, :cond_9

    .line 301
    .line 302
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 303
    .line 304
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getNestMembers()Lnet/bytebuddy/description/type/TypeList;

    .line 305
    .line 306
    .line 307
    move-result-object v2

    .line 308
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 309
    .line 310
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 311
    .line 312
    .line 313
    move-result-object v3

    .line 314
    invoke-static {v3}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 315
    .line 316
    .line 317
    move-result-object v3

    .line 318
    invoke-interface {v2, v3}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 319
    .line 320
    .line 321
    move-result-object v2

    .line 322
    check-cast v2, Lnet/bytebuddy/description/type/TypeList;

    .line 323
    .line 324
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 325
    .line 326
    .line 327
    move-result-object v2

    .line 328
    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    if-eqz v3, :cond_9

    .line 333
    .line 334
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    move-result-object v3

    .line 338
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 339
    .line 340
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 341
    .line 342
    .line 343
    move-result-object v3

    .line 344
    invoke-virtual {v12, v3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitNestMember(Ljava/lang/String;)V

    .line 345
    .line 346
    .line 347
    goto :goto_6

    .line 348
    :cond_9
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 349
    .line 350
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;

    .line 351
    .line 352
    .line 353
    move-result-object v2

    .line 354
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 355
    .line 356
    .line 357
    move-result-object v2

    .line 358
    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-eqz v3, :cond_a

    .line 363
    .line 364
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 369
    .line 370
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 371
    .line 372
    .line 373
    move-result-object v3

    .line 374
    invoke-virtual {v12, v3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitPermittedSubclass(Ljava/lang/String;)V

    .line 375
    .line 376
    .line 377
    goto :goto_7

    .line 378
    :cond_a
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 379
    .line 380
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 381
    .line 382
    .line 383
    move-result-object v2

    .line 384
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 385
    .line 386
    if-eqz v2, :cond_b

    .line 387
    .line 388
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 389
    .line 390
    .line 391
    move-result-object v3

    .line 392
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 393
    .line 394
    .line 395
    move-result-object v2

    .line 396
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 397
    .line 398
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 403
    .line 404
    invoke-interface {v5}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 405
    .line 406
    .line 407
    move-result v5

    .line 408
    invoke-virtual {v12, v3, v2, v4, v5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 409
    .line 410
    .line 411
    goto :goto_8

    .line 412
    :cond_b
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->isLocalType()Z

    .line 413
    .line 414
    .line 415
    move-result v2

    .line 416
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 417
    .line 418
    if-eqz v2, :cond_c

    .line 419
    .line 420
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 421
    .line 422
    .line 423
    move-result-object v2

    .line 424
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    .line 425
    .line 426
    .line 427
    move-result-object v3

    .line 428
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 429
    .line 430
    invoke-interface {v4}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 431
    .line 432
    .line 433
    move-result-object v4

    .line 434
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 435
    .line 436
    invoke-interface {v5}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 437
    .line 438
    .line 439
    move-result v5

    .line 440
    invoke-virtual {v12, v2, v3, v4, v5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 441
    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_c
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->isAnonymousType()Z

    .line 445
    .line 446
    .line 447
    move-result v2

    .line 448
    if-eqz v2, :cond_d

    .line 449
    .line 450
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 451
    .line 452
    invoke-interface {v2}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 453
    .line 454
    .line 455
    move-result-object v2

    .line 456
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    .line 457
    .line 458
    .line 459
    move-result-object v3

    .line 460
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    .line 461
    .line 462
    .line 463
    move-result-object v4

    .line 464
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 465
    .line 466
    invoke-interface {v5}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 467
    .line 468
    .line 469
    move-result v5

    .line 470
    invoke-virtual {v12, v2, v3, v4, v5}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 471
    .line 472
    .line 473
    :cond_d
    :goto_8
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 474
    .line 475
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 476
    .line 477
    .line 478
    move-result-object v2

    .line 479
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 480
    .line 481
    .line 482
    move-result-object v2

    .line 483
    :goto_9
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 484
    .line 485
    .line 486
    move-result v3

    .line 487
    if-eqz v3, :cond_10

    .line 488
    .line 489
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 490
    .line 491
    .line 492
    move-result-object v3

    .line 493
    check-cast v3, Lnet/bytebuddy/description/type/TypeDescription;

    .line 494
    .line 495
    invoke-interface {v3}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 496
    .line 497
    .line 498
    move-result-object v4

    .line 499
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->isMemberType()Z

    .line 500
    .line 501
    .line 502
    move-result v5

    .line 503
    if-eqz v5, :cond_e

    .line 504
    .line 505
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 506
    .line 507
    invoke-interface {v5}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getInternalName()Ljava/lang/String;

    .line 508
    .line 509
    .line 510
    move-result-object v5

    .line 511
    goto :goto_a

    .line 512
    :cond_e
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    .line 513
    .line 514
    .line 515
    move-result-object v5

    .line 516
    :goto_a
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->isAnonymousType()Z

    .line 517
    .line 518
    .line 519
    move-result v7

    .line 520
    if-eqz v7, :cond_f

    .line 521
    .line 522
    invoke-static {}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->access$300()Ljava/lang/String;

    .line 523
    .line 524
    .line 525
    move-result-object v7

    .line 526
    goto :goto_b

    .line 527
    :cond_f
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->getSimpleName()Ljava/lang/String;

    .line 528
    .line 529
    .line 530
    move-result-object v7

    .line 531
    :goto_b
    invoke-interface {v3}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 532
    .line 533
    .line 534
    move-result v3

    .line 535
    invoke-virtual {v12, v4, v5, v7, v3}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitInnerClass(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V

    .line 536
    .line 537
    .line 538
    goto :goto_9

    .line 539
    :cond_10
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->recordComponents:Lnet/bytebuddy/description/type/RecordComponentList;

    .line 540
    .line 541
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 542
    .line 543
    .line 544
    move-result-object v2

    .line 545
    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 546
    .line 547
    .line 548
    move-result v3

    .line 549
    if-eqz v3, :cond_11

    .line 550
    .line 551
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 552
    .line 553
    .line 554
    move-result-object v3

    .line 555
    check-cast v3, Lnet/bytebuddy/description/type/RecordComponentDescription;

    .line 556
    .line 557
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->recordComponentPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;

    .line 558
    .line 559
    invoke-interface {v4, v3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool;->target(Lnet/bytebuddy/description/type/RecordComponentDescription;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool$Record;

    .line 560
    .line 561
    .line 562
    move-result-object v3

    .line 563
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 564
    .line 565
    invoke-interface {v3, v12, v4}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$RecordComponentPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 566
    .line 567
    .line 568
    goto :goto_c

    .line 569
    :cond_11
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->fields:Lnet/bytebuddy/description/field/FieldList;

    .line 570
    .line 571
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 572
    .line 573
    .line 574
    move-result-object v2

    .line 575
    :goto_d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 576
    .line 577
    .line 578
    move-result v3

    .line 579
    if-eqz v3, :cond_12

    .line 580
    .line 581
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    move-result-object v3

    .line 585
    check-cast v3, Lnet/bytebuddy/description/field/FieldDescription;

    .line 586
    .line 587
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->fieldPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;

    .line 588
    .line 589
    invoke-interface {v4, v3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool;->target(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool$Record;

    .line 590
    .line 591
    .line 592
    move-result-object v3

    .line 593
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 594
    .line 595
    invoke-interface {v3, v12, v4}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$FieldPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 596
    .line 597
    .line 598
    goto :goto_d

    .line 599
    :cond_12
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedMethods:Lnet/bytebuddy/description/method/MethodList;

    .line 600
    .line 601
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 602
    .line 603
    .line 604
    move-result-object v2

    .line 605
    :goto_e
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 606
    .line 607
    .line 608
    move-result v3

    .line 609
    if-eqz v3, :cond_13

    .line 610
    .line 611
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 612
    .line 613
    .line 614
    move-result-object v3

    .line 615
    check-cast v3, Lnet/bytebuddy/description/method/MethodDescription;

    .line 616
    .line 617
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    .line 618
    .line 619
    invoke-interface {v4, v3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;->target(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;

    .line 620
    .line 621
    .line 622
    move-result-object v3

    .line 623
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 624
    .line 625
    invoke-interface {v3, v12, v6, v4}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool$Record;->apply(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 626
    .line 627
    .line 628
    goto :goto_e

    .line 629
    :cond_13
    new-instance v2, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain$Default;

    .line 630
    .line 631
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 632
    .line 633
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    .line 634
    .line 635
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 636
    .line 637
    invoke-direct {v2, v3, v4, v5}, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain$Default;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 638
    .line 639
    .line 640
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->annotationValueFilterFactory:Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;

    .line 641
    .line 642
    invoke-interface {v6, v2, v12, v3}, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;->drain(Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$Drain;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/attribute/AnnotationValueFilter$Factory;)V

    .line 643
    .line 644
    .line 645
    invoke-virtual {v12}, Lnet/bytebuddy/jar/asm/ClassVisitor;->visitEnd()V

    .line 646
    .line 647
    .line 648
    new-instance v2, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$UnresolvedType;

    .line 649
    .line 650
    invoke-interface {v1}, Lnet/bytebuddy/utility/AsmClassWriter;->getBinaryRepresentation()[B

    .line 651
    .line 652
    .line 653
    move-result-object v1

    .line 654
    invoke-interface {v6}, Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;->getAuxiliaryTypes()Ljava/util/List;

    .line 655
    .line 656
    .line 657
    move-result-object v3

    .line 658
    invoke-direct {v2, v0, v1, v3}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$UnresolvedType;-><init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;[BLjava/util/List;)V

    .line 659
    .line 660
    .line 661
    return-object v2
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    invoke-super {p0, p1}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->equals(Ljava/lang/Object;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    return v1

    .line 9
    :cond_0
    const/4 v0, 0x1

    .line 10
    if-ne p0, p1, :cond_1

    .line 11
    .line 12
    return v0

    .line 13
    :cond_1
    if-nez p1, :cond_2

    .line 14
    .line 15
    return v1

    .line 16
    :cond_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    .line 18
    .line 19
    move-result-object v2

    .line 20
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 21
    .line 22
    .line 23
    move-result-object v3

    .line 24
    if-eq v2, v3, :cond_3

    .line 25
    .line 26
    return v1

    .line 27
    :cond_3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    .line 28
    .line 29
    check-cast p1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;

    .line 30
    .line 31
    iget-object p1, p1, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    .line 32
    .line 33
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p0

    .line 37
    if-nez p0, :cond_4

    .line 38
    .line 39
    return v1

    .line 40
    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-super {p0}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->hashCode()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    mul-int/lit8 v0, v0, 0x1f

    .line 6
    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;->methodPool:Lnet/bytebuddy/dynamic/scaffold/TypeWriter$MethodPool;

    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    add-int/2addr p0, v0

    .line 14
    return p0
.end method

.method public wrap(Lnet/bytebuddy/jar/asm/ClassVisitor;II)Lnet/bytebuddy/utility/visitor/ContextClassVisitor;
    .locals 19

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move/from16 v1, p2

    .line 4
    .line 5
    move/from16 v2, p3

    .line 6
    .line 7
    iget-object v3, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->implementationContextFactory:Lnet/bytebuddy/implementation/Implementation$Context$Factory;

    .line 8
    .line 9
    iget-object v4, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 10
    .line 11
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->auxiliaryTypeNamingStrategy:Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;

    .line 12
    .line 13
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeInitializer:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;

    .line 14
    .line 15
    iget-object v7, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->classFileVersion:Lnet/bytebuddy/ClassFileVersion;

    .line 16
    .line 17
    and-int/lit8 v8, v1, 0x2

    .line 18
    .line 19
    if-nez v8, :cond_1

    .line 20
    .line 21
    sget-object v8, Lnet/bytebuddy/ClassFileVersion;->JAVA_V6:Lnet/bytebuddy/ClassFileVersion;

    .line 22
    .line 23
    invoke-virtual {v7, v8}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 24
    .line 25
    .line 26
    move-result v8

    .line 27
    if-eqz v8, :cond_1

    .line 28
    .line 29
    and-int/lit8 v8, v2, 0x8

    .line 30
    .line 31
    if-nez v8, :cond_0

    .line 32
    .line 33
    sget-object v8, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->GENERATE:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 34
    .line 35
    :goto_0
    move-object v9, v8

    .line 36
    goto :goto_1

    .line 37
    :cond_0
    sget-object v8, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->EXPAND:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object v8, Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;->DISABLED:Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :goto_1
    move-object v8, v7

    .line 44
    invoke-interface/range {v3 .. v9}, Lnet/bytebuddy/implementation/Implementation$Context$Factory;->make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$NamingStrategy;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/Implementation$Context$FrameGeneration;)Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;

    .line 45
    .line 46
    .line 47
    move-result-object v13

    .line 48
    new-instance v3, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;

    .line 49
    .line 50
    new-instance v4, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;

    .line 51
    .line 52
    iget-object v10, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 53
    .line 54
    iget-object v11, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 55
    .line 56
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typeValidation:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 57
    .line 58
    move-object/from16 v6, p1

    .line 59
    .line 60
    invoke-static {v6, v5}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ValidatingClassVisitor;->of(Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 61
    .line 62
    .line 63
    move-result-object v12

    .line 64
    iget-object v14, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->typePool:Lnet/bytebuddy/pool/TypePool;

    .line 65
    .line 66
    iget-object v15, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->fields:Lnet/bytebuddy/description/field/FieldList;

    .line 67
    .line 68
    iget-object v5, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->methods:Lnet/bytebuddy/description/method/MethodList;

    .line 69
    .line 70
    iget-object v6, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 71
    .line 72
    invoke-interface {v6, v1}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeWriter(I)I

    .line 73
    .line 74
    .line 75
    move-result v17

    .line 76
    iget-object v1, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->asmVisitorWrapper:Lnet/bytebuddy/asm/AsmVisitorWrapper;

    .line 77
    .line 78
    invoke-interface {v1, v2}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->mergeReader(I)I

    .line 79
    .line 80
    .line 81
    move-result v18

    .line 82
    move-object/from16 v16, v5

    .line 83
    .line 84
    invoke-interface/range {v10 .. v18}, Lnet/bytebuddy/asm/AsmVisitorWrapper;->wrap(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context;Lnet/bytebuddy/pool/TypePool;Lnet/bytebuddy/description/field/FieldList;Lnet/bytebuddy/description/method/MethodList;II)Lnet/bytebuddy/jar/asm/ClassVisitor;

    .line 85
    .line 86
    .line 87
    move-result-object v1

    .line 88
    iget-object v2, v0, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default;->instrumentedType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 89
    .line 90
    invoke-interface {v2}, Lnet/bytebuddy/description/type/TypeDescription;->toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    invoke-direct {v4, v0, v1, v13, v2}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$CreationClassVisitor;-><init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;Lnet/bytebuddy/description/module/ModuleDescription;)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v3, v0, v4, v13}, Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation$ImplementationContextClassVisitor;-><init>(Lnet/bytebuddy/dynamic/scaffold/TypeWriter$Default$ForCreation;Lnet/bytebuddy/jar/asm/ClassVisitor;Lnet/bytebuddy/implementation/Implementation$Context$ExtractableView;)V

    .line 98
    .line 99
    .line 100
    return-object v3
.end method
