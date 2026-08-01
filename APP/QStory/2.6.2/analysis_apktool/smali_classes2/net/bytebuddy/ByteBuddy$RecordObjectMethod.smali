.class public final enum Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/ByteBuddy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "RecordObjectMethod"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;",
        ">;",
        "Lnet/bytebuddy/implementation/Implementation;"
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

.field public static final enum EQUALS:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

.field public static final enum HASH_CODE:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

.field public static final enum TO_STRING:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;


# instance fields
.field private final arguments:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "+",
            "Lnet/bytebuddy/description/type/TypeDescription;",
            ">;"
        }
    .end annotation
.end field

.field private final name:Ljava/lang/String;

.field private final returnType:Lnet/bytebuddy/description/type/TypeDescription;

.field private final stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    .line 1
    new-instance v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 2
    .line 3
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;->INSTANCE:Lnet/bytebuddy/implementation/bytecode/StackManipulation$Trivial;

    .line 4
    .line 5
    const/4 v7, 0x0

    .line 6
    new-array v6, v7, [Ljava/lang/Class;

    .line 7
    .line 8
    const-string v1, "HASH_CODE"

    .line 9
    .line 10
    const/4 v2, 0x0

    .line 11
    const-string v3, "hashCode"

    .line 12
    .line 13
    sget-object v5, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 14
    .line 15
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->HASH_CODE:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 19
    .line 20
    new-instance v8, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 21
    .line 22
    sget-object v1, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->REFERENCE:Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    invoke-virtual {v1, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 26
    .line 27
    .line 28
    move-result-object v12

    .line 29
    const-class v1, Ljava/lang/Object;

    .line 30
    .line 31
    filled-new-array {v1}, [Ljava/lang/Class;

    .line 32
    .line 33
    .line 34
    move-result-object v14

    .line 35
    const-string v9, "EQUALS"

    .line 36
    .line 37
    const/4 v10, 0x1

    .line 38
    const-string v11, "equals"

    .line 39
    .line 40
    sget-object v13, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 41
    .line 42
    invoke-direct/range {v8 .. v14}, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 43
    .line 44
    .line 45
    sput-object v8, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->EQUALS:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 46
    .line 47
    new-instance v1, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 48
    .line 49
    const-class v6, Ljava/lang/String;

    .line 50
    .line 51
    new-array v7, v7, [Ljava/lang/Class;

    .line 52
    .line 53
    const-string v2, "TO_STRING"

    .line 54
    .line 55
    const/4 v3, 0x2

    .line 56
    move-object v5, v4

    .line 57
    const-string v4, "toString"

    .line 58
    .line 59
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;-><init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V

    .line 60
    .line 61
    .line 62
    sput-object v1, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->TO_STRING:Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 63
    .line 64
    filled-new-array {v0, v8, v1}, [Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    sput-object v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->$VALUES:[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 69
    .line 70
    return-void
.end method

.method private varargs constructor <init>(Ljava/lang/String;ILjava/lang/String;Lnet/bytebuddy/implementation/bytecode/StackManipulation;Ljava/lang/Class;[Ljava/lang/Class;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lnet/bytebuddy/implementation/bytecode/StackManipulation;",
            "Ljava/lang/Class<",
            "*>;[",
            "Ljava/lang/Class<",
            "*>;)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->name:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p4, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 7
    .line 8
    invoke-static {p5}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 13
    .line 14
    new-instance p1, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;

    .line 15
    .line 16
    invoke-direct {p1, p6}, Lnet/bytebuddy/description/type/TypeList$ForLoadedTypes;-><init>([Ljava/lang/Class;)V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->arguments:Ljava/util/List;

    .line 20
    .line 21
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->$VALUES:[Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 18

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    invoke-interface {v3}, Ljava/util/List;->size()I

    .line 19
    .line 20
    .line 21
    move-result v3

    .line 22
    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 23
    .line 24
    .line 25
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    invoke-interface {v3}, Lnet/bytebuddy/description/type/TypeDescription;->getRecordComponents()Lnet/bytebuddy/description/type/RecordComponentList;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 38
    .line 39
    .line 40
    move-result v4

    .line 41
    if-eqz v4, :cond_1

    .line 42
    .line 43
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object v4

    .line 47
    check-cast v4, Lnet/bytebuddy/description/type/RecordComponentDescription$InDefinedShape;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->length()I

    .line 50
    .line 51
    .line 52
    move-result v5

    .line 53
    if-lez v5, :cond_0

    .line 54
    .line 55
    const-string v5, ";"

    .line 56
    .line 57
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    :cond_0
    invoke-interface {v4}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v5

    .line 64
    invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    .line 67
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    invoke-interface {v5}, Lnet/bytebuddy/description/type/TypeDescription;->getDeclaredFields()Lnet/bytebuddy/description/field/FieldList;

    .line 72
    .line 73
    .line 74
    move-result-object v5

    .line 75
    invoke-interface {v4}, Lnet/bytebuddy/description/NamedElement;->getActualName()Ljava/lang/String;

    .line 76
    .line 77
    .line 78
    move-result-object v4

    .line 79
    invoke-static {v4}, Lnet/bytebuddy/matcher/ElementMatchers;->named(Ljava/lang/String;)Lnet/bytebuddy/matcher/ElementMatcher$Junction;

    .line 80
    .line 81
    .line 82
    move-result-object v4

    .line 83
    invoke-interface {v5, v4}, Lnet/bytebuddy/matcher/FilterableList;->filter(Lnet/bytebuddy/matcher/ElementMatcher;)Lnet/bytebuddy/matcher/FilterableList;

    .line 84
    .line 85
    .line 86
    move-result-object v4

    .line 87
    check-cast v4, Lnet/bytebuddy/description/field/FieldList;

    .line 88
    .line 89
    invoke-interface {v4}, Lnet/bytebuddy/matcher/FilterableList;->getOnly()Ljava/lang/Object;

    .line 90
    .line 91
    .line 92
    move-result-object v4

    .line 93
    check-cast v4, Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;

    .line 94
    .line 95
    invoke-static {v4}, Lnet/bytebuddy/utility/JavaConstant$MethodHandle;->ofGetter(Lnet/bytebuddy/description/field/FieldDescription$InDefinedShape;)Lnet/bytebuddy/utility/JavaConstant$MethodHandle;

    .line 96
    .line 97
    .line 98
    move-result-object v4

    .line 99
    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 100
    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_1
    new-instance v3, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;

    .line 104
    .line 105
    invoke-static {}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadThis()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 106
    .line 107
    .line 108
    move-result-object v4

    .line 109
    iget-object v5, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->stackManipulation:Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 110
    .line 111
    new-instance v6, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    .line 112
    .line 113
    sget-object v7, Lnet/bytebuddy/utility/JavaType;->OBJECT_METHODS:Lnet/bytebuddy/utility/JavaType;

    .line 114
    .line 115
    invoke-virtual {v7}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    new-instance v8, Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 120
    .line 121
    const-class v9, Ljava/lang/Object;

    .line 122
    .line 123
    invoke-static {v9}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 124
    .line 125
    .line 126
    move-result-object v9

    .line 127
    sget-object v10, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLES_LOOKUP:Lnet/bytebuddy/utility/JavaType;

    .line 128
    .line 129
    invoke-virtual {v10}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 130
    .line 131
    .line 132
    move-result-object v10

    .line 133
    invoke-interface {v10}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 134
    .line 135
    .line 136
    move-result-object v10

    .line 137
    const-class v11, Ljava/lang/String;

    .line 138
    .line 139
    invoke-static {v11}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 140
    .line 141
    .line 142
    move-result-object v12

    .line 143
    invoke-interface {v12}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 144
    .line 145
    .line 146
    move-result-object v12

    .line 147
    sget-object v13, Lnet/bytebuddy/utility/JavaType;->TYPE_DESCRIPTOR:Lnet/bytebuddy/utility/JavaType;

    .line 148
    .line 149
    invoke-virtual {v13}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 150
    .line 151
    .line 152
    move-result-object v13

    .line 153
    invoke-interface {v13}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 154
    .line 155
    .line 156
    move-result-object v13

    .line 157
    const-class v14, Ljava/lang/Class;

    .line 158
    .line 159
    invoke-static {v14}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 160
    .line 161
    .line 162
    move-result-object v14

    .line 163
    invoke-interface {v14}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 164
    .line 165
    .line 166
    move-result-object v14

    .line 167
    invoke-static {v11}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 168
    .line 169
    .line 170
    move-result-object v11

    .line 171
    invoke-interface {v11}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 172
    .line 173
    .line 174
    move-result-object v11

    .line 175
    sget-object v15, Lnet/bytebuddy/utility/JavaType;->METHOD_HANDLE:Lnet/bytebuddy/utility/JavaType;

    .line 176
    .line 177
    invoke-virtual {v15}, Lnet/bytebuddy/utility/JavaType;->getTypeStub()Lnet/bytebuddy/description/type/TypeDescription;

    .line 178
    .line 179
    .line 180
    move-result-object v15

    .line 181
    invoke-static {v15}, Lnet/bytebuddy/description/type/TypeDescription$ArrayProjection;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 182
    .line 183
    .line 184
    move-result-object v15

    .line 185
    invoke-interface {v15}, Lnet/bytebuddy/description/type/TypeDefinition;->asGenericType()Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 186
    .line 187
    .line 188
    move-result-object v15

    .line 189
    move-object/from16 v16, v1

    .line 190
    .line 191
    const/4 v1, 0x6

    .line 192
    new-array v1, v1, [Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 193
    .line 194
    const/16 v17, 0x0

    .line 195
    .line 196
    aput-object v10, v1, v17

    .line 197
    .line 198
    const/4 v10, 0x1

    .line 199
    aput-object v12, v1, v10

    .line 200
    .line 201
    const/4 v12, 0x2

    .line 202
    aput-object v13, v1, v12

    .line 203
    .line 204
    const/4 v13, 0x3

    .line 205
    aput-object v14, v1, v13

    .line 206
    .line 207
    const/4 v14, 0x4

    .line 208
    aput-object v11, v1, v14

    .line 209
    .line 210
    const/4 v11, 0x5

    .line 211
    aput-object v15, v1, v11

    .line 212
    .line 213
    invoke-static {v1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 214
    .line 215
    .line 216
    move-result-object v1

    .line 217
    const-string v11, "bootstrap"

    .line 218
    .line 219
    const/16 v15, 0x9

    .line 220
    .line 221
    invoke-direct {v8, v11, v15, v9, v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;-><init>(Ljava/lang/String;ILnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;)V

    .line 222
    .line 223
    .line 224
    invoke-direct {v6, v7, v8}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/method/MethodDescription$Token;)V

    .line 225
    .line 226
    .line 227
    invoke-static {v6}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation;->invoke(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;

    .line 228
    .line 229
    .line 230
    move-result-object v1

    .line 231
    iget-object v6, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->name:Ljava/lang/String;

    .line 232
    .line 233
    iget-object v7, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 234
    .line 235
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 236
    .line 237
    .line 238
    move-result-object v8

    .line 239
    iget-object v9, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->arguments:Ljava/util/List;

    .line 240
    .line 241
    invoke-static {v8, v9}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/lang/Object;Ljava/util/List;)Ljava/util/List;

    .line 242
    .line 243
    .line 244
    move-result-object v8

    .line 245
    invoke-interface/range {p1 .. p1}, Lnet/bytebuddy/implementation/Implementation$Target;->getInstrumentedType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 246
    .line 247
    .line 248
    move-result-object v9

    .line 249
    invoke-static {v9}, Lnet/bytebuddy/utility/JavaConstant$Simple;->of(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/utility/JavaConstant;

    .line 250
    .line 251
    .line 252
    move-result-object v9

    .line 253
    invoke-virtual/range {v16 .. v16}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 254
    .line 255
    .line 256
    move-result-object v11

    .line 257
    invoke-static {v11}, Lnet/bytebuddy/utility/JavaConstant$Simple;->ofLoaded(Ljava/lang/Object;)Lnet/bytebuddy/utility/JavaConstant;

    .line 258
    .line 259
    .line 260
    move-result-object v11

    .line 261
    new-array v15, v12, [Lnet/bytebuddy/utility/JavaConstant;

    .line 262
    .line 263
    aput-object v9, v15, v17

    .line 264
    .line 265
    aput-object v11, v15, v10

    .line 266
    .line 267
    invoke-static {v15}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    .line 268
    .line 269
    .line 270
    move-result-object v9

    .line 271
    invoke-static {v9, v2}, Lnet/bytebuddy/utility/CompoundList;->of(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    .line 272
    .line 273
    .line 274
    move-result-object v2

    .line 275
    invoke-interface {v1, v6, v7, v8, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodInvocation$WithImplicitInvocationTargetType;->dynamic(Ljava/lang/String;Lnet/bytebuddy/description/type/TypeDescription;Ljava/util/List;Ljava/util/List;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 276
    .line 277
    .line 278
    move-result-object v1

    .line 279
    iget-object v0, v0, Lnet/bytebuddy/ByteBuddy$RecordObjectMethod;->returnType:Lnet/bytebuddy/description/type/TypeDescription;

    .line 280
    .line 281
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 282
    .line 283
    .line 284
    move-result-object v0

    .line 285
    new-array v2, v14, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 286
    .line 287
    aput-object v4, v2, v17

    .line 288
    .line 289
    aput-object v5, v2, v10

    .line 290
    .line 291
    aput-object v1, v2, v12

    .line 292
    .line 293
    aput-object v0, v2, v13

    .line 294
    .line 295
    invoke-direct {v3, v2}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 296
    .line 297
    .line 298
    return-object v3
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method
