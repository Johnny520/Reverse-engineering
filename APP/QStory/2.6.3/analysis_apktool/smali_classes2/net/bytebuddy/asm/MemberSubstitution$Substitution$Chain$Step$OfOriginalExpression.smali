.class public final enum Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.implements Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "OfOriginalExpression"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;",
        ">;",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
        ">;",
        "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Factory<",
        "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

.field public static final enum INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->INSTANCE:Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->$VALUES:[Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$OfOriginalExpression;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public make(Lnet/bytebuddy/implementation/bytecode/assign/Assigner;Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner;",
            "Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            "Lnet/bytebuddy/description/method/MethodDescription;",
            ")",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step<",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            ">;"
        }
    .end annotation

    .line 1
    return-object p0
.end method

.method public resolve(Lnet/bytebuddy/asm/MemberSubstitution$Target;Lnet/bytebuddy/description/type/TypeList$Generic;Lnet/bytebuddy/description/type/TypeDescription$Generic;Lnet/bytebuddy/utility/JavaConstant$MethodHandle;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/Map;I)Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/asm/MemberSubstitution$Target;",
            "Lnet/bytebuddy/description/type/TypeList$Generic;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Lnet/bytebuddy/utility/JavaConstant$MethodHandle;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Lnet/bytebuddy/description/type/TypeDescription$Generic;",
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Ljava/lang/Integer;",
            ">;I)",
            "Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Resolution;"
        }
    .end annotation

    .line 1
    instance-of p0, p1, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;

    .line 2
    .line 3
    const/4 p3, 0x0

    .line 4
    const/4 p4, 0x0

    .line 5
    if-eqz p0, :cond_8

    .line 6
    .line 7
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;

    .line 8
    .line 9
    invoke-virtual {p1}, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForMember;->getMember()Lnet/bytebuddy/description/ByteCodeElement$Member;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    instance-of p1, p0, Lnet/bytebuddy/description/method/MethodDescription;

    .line 14
    .line 15
    if-eqz p1, :cond_0

    .line 16
    .line 17
    move-object p8, p0

    .line 18
    check-cast p8, Lnet/bytebuddy/description/method/MethodDescription;

    .line 19
    .line 20
    invoke-interface {p8}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 21
    .line 22
    .line 23
    move-result p8

    .line 24
    if-eqz p8, :cond_0

    .line 25
    .line 26
    new-instance p8, Ljava/util/ArrayList;

    .line 27
    .line 28
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    add-int/lit8 v0, v0, 0x4

    .line 33
    .line 34
    invoke-direct {p8, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-static {p6}, Lnet/bytebuddy/implementation/bytecode/Removal;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 38
    .line 39
    .line 40
    move-result-object p6

    .line 41
    invoke-virtual {p8, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 42
    .line 43
    .line 44
    invoke-interface {p0}, Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 45
    .line 46
    .line 47
    move-result-object p6

    .line 48
    invoke-interface {p6}, Lnet/bytebuddy/description/type/TypeDefinition;->asErasure()Lnet/bytebuddy/description/type/TypeDescription;

    .line 49
    .line 50
    .line 51
    move-result-object p6

    .line 52
    invoke-static {p6}, Lnet/bytebuddy/implementation/bytecode/TypeCreation;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 53
    .line 54
    .line 55
    move-result-object p6

    .line 56
    invoke-virtual {p8, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 57
    .line 58
    .line 59
    sget-object p6, Lnet/bytebuddy/implementation/bytecode/Duplication;->SINGLE:Lnet/bytebuddy/implementation/bytecode/Duplication;

    .line 60
    .line 61
    invoke-virtual {p8, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    goto :goto_0

    .line 65
    :cond_0
    new-instance p8, Ljava/util/ArrayList;

    .line 66
    .line 67
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    add-int/lit8 v0, v0, 0x4

    .line 72
    .line 73
    invoke-direct {p8, v0}, Ljava/util/ArrayList;-><init>(I)V

    .line 74
    .line 75
    .line 76
    invoke-static {p6}, Lnet/bytebuddy/implementation/bytecode/Removal;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 77
    .line 78
    .line 79
    move-result-object p6

    .line 80
    invoke-virtual {p8, p6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 81
    .line 82
    .line 83
    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 84
    .line 85
    .line 86
    move-result p6

    .line 87
    if-ge p4, p6, :cond_1

    .line 88
    .line 89
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object p6

    .line 93
    check-cast p6, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 94
    .line 95
    invoke-static {p6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 96
    .line 97
    .line 98
    move-result-object p6

    .line 99
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-interface {p7, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    check-cast v0, Ljava/lang/Integer;

    .line 108
    .line 109
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 110
    .line 111
    .line 112
    move-result v0

    .line 113
    invoke-virtual {p6, v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 114
    .line 115
    .line 116
    move-result-object p6

    .line 117
    invoke-interface {p8, p6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 118
    .line 119
    .line 120
    add-int/lit8 p4, p4, 0x1

    .line 121
    .line 122
    goto :goto_0

    .line 123
    :cond_1
    if-eqz p1, :cond_3

    .line 124
    .line 125
    invoke-interface {p8, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 126
    .line 127
    .line 128
    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 129
    .line 130
    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 131
    .line 132
    invoke-direct {p2, p8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 133
    .line 134
    .line 135
    move-object p3, p0

    .line 136
    check-cast p3, Lnet/bytebuddy/description/method/MethodDescription;

    .line 137
    .line 138
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->isConstructor()Z

    .line 139
    .line 140
    .line 141
    move-result p4

    .line 142
    if-eqz p4, :cond_2

    .line 143
    .line 144
    invoke-interface {p0}, Lnet/bytebuddy/description/DeclaredByType$WithMandatoryDeclaration;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDefinition;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    goto :goto_1

    .line 153
    :cond_2
    invoke-interface {p3}, Lnet/bytebuddy/description/method/MethodDescription;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 154
    .line 155
    .line 156
    move-result-object p0

    .line 157
    :goto_1
    invoke-direct {p1, p2, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 158
    .line 159
    .line 160
    return-object p1

    .line 161
    :cond_3
    instance-of p1, p0, Lnet/bytebuddy/description/field/FieldDescription;

    .line 162
    .line 163
    if-eqz p1, :cond_7

    .line 164
    .line 165
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$OfByteCodeElement;->isStatic()Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    sget-object p3, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 170
    .line 171
    if-eqz p1, :cond_5

    .line 172
    .line 173
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    .line 174
    .line 175
    .line 176
    move-result p1

    .line 177
    if-eqz p1, :cond_4

    .line 178
    .line 179
    invoke-interface {p8, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 183
    .line 184
    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 185
    .line 186
    invoke-direct {p2, p8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 187
    .line 188
    .line 189
    check-cast p0, Lnet/bytebuddy/description/field/FieldDescription;

    .line 190
    .line 191
    invoke-interface {p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 192
    .line 193
    .line 194
    move-result-object p0

    .line 195
    invoke-direct {p1, p2, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 196
    .line 197
    .line 198
    return-object p1

    .line 199
    :cond_4
    invoke-interface {p8, p5}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 200
    .line 201
    .line 202
    new-instance p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 203
    .line 204
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 205
    .line 206
    invoke-direct {p1, p8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 207
    .line 208
    .line 209
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 214
    .line 215
    .line 216
    return-object p0

    .line 217
    :cond_5
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 218
    .line 219
    .line 220
    move-result p1

    .line 221
    const/4 p2, 0x1

    .line 222
    if-ne p1, p2, :cond_6

    .line 223
    .line 224
    check-cast p0, Lnet/bytebuddy/description/field/FieldDescription;

    .line 225
    .line 226
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 227
    .line 228
    .line 229
    move-result-object p1

    .line 230
    invoke-interface {p1}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->read()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 231
    .line 232
    .line 233
    move-result-object p1

    .line 234
    invoke-interface {p8, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 235
    .line 236
    .line 237
    new-instance p1, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 238
    .line 239
    new-instance p2, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 240
    .line 241
    invoke-direct {p2, p8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 242
    .line 243
    .line 244
    invoke-interface {p0}, Lnet/bytebuddy/description/field/FieldDescription;->getType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 245
    .line 246
    .line 247
    move-result-object p0

    .line 248
    invoke-direct {p1, p2, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 249
    .line 250
    .line 251
    return-object p1

    .line 252
    :cond_6
    check-cast p0, Lnet/bytebuddy/description/field/FieldDescription;

    .line 253
    .line 254
    invoke-static {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess;->forField(Lnet/bytebuddy/description/field/FieldDescription;)Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;

    .line 255
    .line 256
    .line 257
    move-result-object p0

    .line 258
    invoke-interface {p0}, Lnet/bytebuddy/implementation/bytecode/member/FieldAccess$Defined;->write()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 259
    .line 260
    .line 261
    move-result-object p0

    .line 262
    invoke-interface {p8, p0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 263
    .line 264
    .line 265
    new-instance p0, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 266
    .line 267
    new-instance p1, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 268
    .line 269
    invoke-direct {p1, p8}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 270
    .line 271
    .line 272
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDefinition$Sort;->describe(Ljava/lang/reflect/Type;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 273
    .line 274
    .line 275
    move-result-object p2

    .line 276
    invoke-direct {p0, p1, p2}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 277
    .line 278
    .line 279
    return-object p0

    .line 280
    :cond_7
    const-string p1, "Unexpected member: "

    .line 281
    .line 282
    invoke-static {p0, p1}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 283
    .line 284
    .line 285
    return-object p3

    .line 286
    :cond_8
    instance-of p0, p1, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;

    .line 287
    .line 288
    if-eqz p0, :cond_a

    .line 289
    .line 290
    new-instance p0, Ljava/util/ArrayList;

    .line 291
    .line 292
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 293
    .line 294
    .line 295
    move-result p3

    .line 296
    add-int/lit8 p3, p3, 0x4

    .line 297
    .line 298
    invoke-direct {p0, p3}, Ljava/util/ArrayList;-><init>(I)V

    .line 299
    .line 300
    .line 301
    invoke-static {p6}, Lnet/bytebuddy/implementation/bytecode/Removal;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 302
    .line 303
    .line 304
    move-result-object p3

    .line 305
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 306
    .line 307
    .line 308
    :goto_2
    invoke-interface {p2}, Ljava/util/List;->size()I

    .line 309
    .line 310
    .line 311
    move-result p3

    .line 312
    if-ge p4, p3, :cond_9

    .line 313
    .line 314
    invoke-interface {p2, p4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 315
    .line 316
    .line 317
    move-result-object p3

    .line 318
    check-cast p3, Lnet/bytebuddy/description/type/TypeDefinition;

    .line 319
    .line 320
    invoke-static {p3}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 321
    .line 322
    .line 323
    move-result-object p3

    .line 324
    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 325
    .line 326
    .line 327
    move-result-object p6

    .line 328
    invoke-interface {p7, p6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 329
    .line 330
    .line 331
    move-result-object p6

    .line 332
    check-cast p6, Ljava/lang/Integer;

    .line 333
    .line 334
    invoke-virtual {p6}, Ljava/lang/Integer;->intValue()I

    .line 335
    .line 336
    .line 337
    move-result p6

    .line 338
    invoke-virtual {p3, p6}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 339
    .line 340
    .line 341
    move-result-object p3

    .line 342
    invoke-virtual {p0, p3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 343
    .line 344
    .line 345
    add-int/lit8 p4, p4, 0x1

    .line 346
    .line 347
    goto :goto_2

    .line 348
    :cond_9
    invoke-virtual {p0, p5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 349
    .line 350
    .line 351
    new-instance p2, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;

    .line 352
    .line 353
    new-instance p3, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;

    .line 354
    .line 355
    invoke-direct {p3, p0}, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Compound;-><init>(Ljava/util/List;)V

    .line 356
    .line 357
    .line 358
    check-cast p1, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;

    .line 359
    .line 360
    invoke-virtual {p1}, Lnet/bytebuddy/asm/MemberSubstitution$Target$ForDynamicInvocation;->getMethodType()Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 361
    .line 362
    .line 363
    move-result-object p0

    .line 364
    invoke-virtual {p0}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->getReturnType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 365
    .line 366
    .line 367
    move-result-object p0

    .line 368
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 369
    .line 370
    .line 371
    move-result-object p0

    .line 372
    invoke-direct {p2, p3, p0}, Lnet/bytebuddy/asm/MemberSubstitution$Substitution$Chain$Step$Simple;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 373
    .line 374
    .line 375
    return-object p2

    .line 376
    :cond_a
    const-string p0, "Unexpected target: "

    .line 377
    .line 378
    invoke-static {p1, p0}, L飘花落叶言子兰楪苏哲世/飘花落叶言子楪世兰哲苏;->飘花落叶言子楪苏兰哲世(Ljava/lang/Object;Ljava/lang/String;)V

    .line 379
    .line 380
    .line 381
    return-object p3
.end method
