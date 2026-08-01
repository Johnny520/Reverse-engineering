.class final enum Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default$1;
.super Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Factory$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/scaffold/InstrumentedType$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public represent(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$WithFlexibleName;
    .locals 25

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;

    .line 2
    .line 3
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/NamedElement$WithRuntimeName;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/ModifierReviewable;->getModifiers()I

    .line 8
    .line 9
    .line 10
    move-result v2

    .line 11
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->toModuleDescription()Lnet/bytebuddy/description/module/ModuleDescription;

    .line 12
    .line 13
    .line 14
    move-result-object v3

    .line 15
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/TypeVariableSource;->getTypeVariables()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 16
    .line 17
    .line 18
    move-result-object v4

    .line 19
    invoke-static/range {p1 .. p1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 20
    .line 21
    .line 22
    move-result-object v5

    .line 23
    invoke-interface {v4, v5}, Lnet/bytebuddy/description/type/TypeList$Generic;->asTokenList(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 24
    .line 25
    .line 26
    move-result-object v4

    .line 27
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    .line 30
    move-result-object v5

    .line 31
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDefinition;->getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 32
    .line 33
    .line 34
    move-result-object v6

    .line 35
    invoke-static/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Substitutor$ForDetachment;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;

    .line 36
    .line 37
    .line 38
    move-result-object v7

    .line 39
    invoke-interface {v6, v7}, Lnet/bytebuddy/description/type/TypeList$Generic;->accept(Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;)Lnet/bytebuddy/description/type/TypeList$Generic;

    .line 40
    .line 41
    .line 42
    move-result-object v6

    .line 43
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 44
    .line 45
    .line 46
    move-result-object v7

    .line 47
    invoke-static/range {p1 .. p1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 48
    .line 49
    .line 50
    move-result-object v8

    .line 51
    invoke-interface {v7, v8}, Lnet/bytebuddy/description/field/FieldList;->asTokenList(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 52
    .line 53
    .line 54
    move-result-object v7

    .line 55
    sget-object v8, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 56
    .line 57
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredMethods()Lnet/bytebuddy/description/method/MethodList;

    .line 58
    .line 59
    .line 60
    move-result-object v9

    .line 61
    invoke-static/range {p1 .. p1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 62
    .line 63
    .line 64
    move-result-object v10

    .line 65
    invoke-interface {v9, v10}, Lnet/bytebuddy/description/method/MethodList;->asTokenList(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 66
    .line 67
    .line 68
    move-result-object v9

    .line 69
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;

    .line 70
    .line 71
    .line 72
    move-result-object v10

    .line 73
    invoke-static/range {p1 .. p1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 74
    .line 75
    .line 76
    move-result-object v11

    .line 77
    invoke-interface {v10, v11}, Lnet/bytebuddy/description/type/RecordComponentList;->asTokenList(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 78
    .line 79
    .line 80
    move-result-object v10

    .line 81
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/annotation/AnnotationSource;->getDeclaredAnnotations()Lnet/bytebuddy/description/annotation/AnnotationList;

    .line 82
    .line 83
    .line 84
    move-result-object v11

    .line 85
    sget-object v12, Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$None;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/TypeInitializer$None;

    .line 86
    .line 87
    sget-object v13, Lnet/bytebuddy/implementation/LoadedTypeInitializer$NoOp;->INSTANCE:Lnet/bytebuddy/implementation/LoadedTypeInitializer$NoOp;

    .line 88
    .line 89
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 90
    .line 91
    .line 92
    move-result-object v14

    .line 93
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getEnclosingMethod()Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;

    .line 94
    .line 95
    .line 96
    move-result-object v15

    .line 97
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getEnclosingType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 98
    .line 99
    .line 100
    move-result-object v16

    .line 101
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredTypes()Lnet/bytebuddy/description/type/TypeList;

    .line 102
    .line 103
    .line 104
    move-result-object v17

    .line 105
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->isSealed()Z

    .line 106
    .line 107
    .line 108
    move-result v18

    .line 109
    if-eqz v18, :cond_0

    .line 110
    .line 111
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getPermittedSubtypes()Lnet/bytebuddy/description/type/TypeList;

    .line 112
    .line 113
    .line 114
    move-result-object v18

    .line 115
    goto :goto_0

    .line 116
    :cond_0
    sget-object v18, Lnet/bytebuddy/description/type/TypeList;->UNDEFINED:Lnet/bytebuddy/description/type/TypeList;

    .line 117
    .line 118
    :goto_0
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->isAnonymousType()Z

    .line 119
    .line 120
    .line 121
    move-result v19

    .line 122
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->isLocalType()Z

    .line 123
    .line 124
    .line 125
    move-result v20

    .line 126
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isRecord()Z

    .line 127
    .line 128
    .line 129
    move-result v21

    .line 130
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->isNestHost()Z

    .line 131
    .line 132
    .line 133
    move-result v22

    .line 134
    if-eqz v22, :cond_1

    .line 135
    .line 136
    sget-object v22, Lnet/bytebuddy/dynamic/TargetType;->DESCRIPTION:Lnet/bytebuddy/description/type/TypeDescription;

    .line 137
    .line 138
    goto :goto_1

    .line 139
    :cond_1
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getNestHost()Lnet/bytebuddy/description/type/TypeDescription;

    .line 140
    .line 141
    .line 142
    move-result-object v22

    .line 143
    :goto_1
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->isNestHost()Z

    .line 144
    .line 145
    .line 146
    move-result v23

    .line 147
    if-eqz v23, :cond_2

    .line 148
    .line 149
    move-object/from16 p0, v0

    .line 150
    .line 151
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/description/type/TypeDescription;->getNestMembers()Lnet/bytebuddy/description/type/TypeList;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-static/range {p1 .. p1}, Lnet/bytebuddy/matcher/ElementMatchers;->is(Ljava/lang/Object;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 156
    .line 157
    .line 158
    move-result-object v23

    .line 159
    move-object/from16 v24, v1

    .line 160
    .line 161
    invoke-static/range {v23 .. v23}, Lnet/bytebuddy/matcher/ElementMatchers;->not(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 162
    .line 163
    .line 164
    move-result-object v1

    .line 165
    invoke-interface {v0, v1}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    move-object/from16 v23, v0

    .line 170
    .line 171
    move-object/from16 v1, v24

    .line 172
    .line 173
    :goto_2
    move-object/from16 v0, p0

    .line 174
    .line 175
    goto :goto_3

    .line 176
    :cond_2
    move-object/from16 p0, v0

    .line 177
    .line 178
    move-object/from16 v24, v1

    .line 179
    .line 180
    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 181
    .line 182
    move-object/from16 v23, v0

    .line 183
    .line 184
    goto :goto_2

    .line 185
    :goto_3
    invoke-direct/range {v0 .. v23}, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/module/ModuleDescription;Ljava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/dynamic/scaffold/TypeInitializer;Lnet/bytebuddy/implementation/LoadedTypeInitializer;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;ZZZLnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;)V

    .line 186
    .line 187
    .line 188
    return-object v0
.end method
