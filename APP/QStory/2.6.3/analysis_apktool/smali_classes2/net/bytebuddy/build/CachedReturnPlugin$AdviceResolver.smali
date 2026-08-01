.class public final enum Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/build/CachedReturnPlugin;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "AdviceResolver"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum BOOLEAN:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum BYTE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum CHARACTER:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum DOUBLE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum FLOAT:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum INTEGER:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum LONG:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum REFERENCE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

.field public static final enum SHORT:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;


# instance fields
.field private final dynamicType:Lnet/bytebuddy/dynamic/DynamicType;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    new-instance v0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 2
    .line 3
    const/4 v6, 0x0

    .line 4
    const/16 v7, 0x9a

    .line 5
    .line 6
    const-string v1, "BOOLEAN"

    .line 7
    .line 8
    const/4 v2, 0x0

    .line 9
    sget-object v3, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 10
    .line 11
    const/16 v4, 0x15

    .line 12
    .line 13
    const/16 v5, 0x36

    .line 14
    .line 15
    invoke-direct/range {v0 .. v7}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->BOOLEAN:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 19
    .line 20
    new-instance v1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 21
    .line 22
    const/4 v7, 0x0

    .line 23
    const/16 v8, 0x9a

    .line 24
    .line 25
    const-string v2, "BYTE"

    .line 26
    .line 27
    const/4 v3, 0x1

    .line 28
    sget-object v4, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 29
    .line 30
    const/16 v5, 0x15

    .line 31
    .line 32
    const/16 v6, 0x36

    .line 33
    .line 34
    invoke-direct/range {v1 .. v8}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 35
    .line 36
    .line 37
    sput-object v1, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->BYTE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 38
    .line 39
    new-instance v2, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 40
    .line 41
    const/4 v8, 0x0

    .line 42
    const/16 v9, 0x9a

    .line 43
    .line 44
    const-string v3, "SHORT"

    .line 45
    .line 46
    const/4 v4, 0x2

    .line 47
    sget-object v5, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 48
    .line 49
    const/16 v6, 0x15

    .line 50
    .line 51
    const/16 v7, 0x36

    .line 52
    .line 53
    invoke-direct/range {v2 .. v9}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 54
    .line 55
    .line 56
    sput-object v2, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->SHORT:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 57
    .line 58
    new-instance v3, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 59
    .line 60
    const/4 v9, 0x0

    .line 61
    const/16 v10, 0x9a

    .line 62
    .line 63
    const-string v4, "CHARACTER"

    .line 64
    .line 65
    const/4 v5, 0x3

    .line 66
    sget-object v6, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 67
    .line 68
    const/16 v7, 0x15

    .line 69
    .line 70
    const/16 v8, 0x36

    .line 71
    .line 72
    invoke-direct/range {v3 .. v10}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 73
    .line 74
    .line 75
    sput-object v3, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->CHARACTER:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 76
    .line 77
    new-instance v4, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 78
    .line 79
    const/4 v10, 0x0

    .line 80
    const/16 v11, 0x9a

    .line 81
    .line 82
    const-string v5, "INTEGER"

    .line 83
    .line 84
    const/4 v6, 0x4

    .line 85
    sget-object v7, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 86
    .line 87
    const/16 v8, 0x15

    .line 88
    .line 89
    const/16 v9, 0x36

    .line 90
    .line 91
    invoke-direct/range {v4 .. v11}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 92
    .line 93
    .line 94
    sput-object v4, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->INTEGER:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 95
    .line 96
    new-instance v5, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 97
    .line 98
    const/16 v11, 0x88

    .line 99
    .line 100
    const/16 v12, 0x9a

    .line 101
    .line 102
    const-string v6, "LONG"

    .line 103
    .line 104
    const/4 v7, 0x5

    .line 105
    sget-object v8, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 106
    .line 107
    const/16 v9, 0x16

    .line 108
    .line 109
    const/16 v10, 0x37

    .line 110
    .line 111
    invoke-direct/range {v5 .. v12}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 112
    .line 113
    .line 114
    sput-object v5, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->LONG:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 115
    .line 116
    new-instance v6, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 117
    .line 118
    const/16 v12, 0x8b

    .line 119
    .line 120
    const/16 v13, 0x9a

    .line 121
    .line 122
    const-string v7, "FLOAT"

    .line 123
    .line 124
    const/4 v8, 0x6

    .line 125
    sget-object v9, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 126
    .line 127
    const/16 v10, 0x17

    .line 128
    .line 129
    const/16 v11, 0x38

    .line 130
    .line 131
    invoke-direct/range {v6 .. v13}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 132
    .line 133
    .line 134
    sput-object v6, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->FLOAT:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 135
    .line 136
    new-instance v7, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 137
    .line 138
    const/16 v13, 0x8e

    .line 139
    .line 140
    const/16 v14, 0x9a

    .line 141
    .line 142
    const-string v8, "DOUBLE"

    .line 143
    .line 144
    const/4 v9, 0x7

    .line 145
    sget-object v10, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 146
    .line 147
    const/16 v11, 0x18

    .line 148
    .line 149
    const/16 v12, 0x39

    .line 150
    .line 151
    invoke-direct/range {v7 .. v14}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 152
    .line 153
    .line 154
    sput-object v7, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->DOUBLE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 155
    .line 156
    new-instance v8, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 157
    .line 158
    const/4 v14, 0x0

    .line 159
    const/16 v15, 0xc7

    .line 160
    .line 161
    const-string v9, "REFERENCE"

    .line 162
    .line 163
    const/16 v10, 0x8

    .line 164
    .line 165
    const-class v11, Ljava/lang/Object;

    .line 166
    .line 167
    const/16 v12, 0x19

    .line 168
    .line 169
    const/16 v13, 0x3a

    .line 170
    .line 171
    invoke-direct/range {v8 .. v15}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;-><init>(Ljava/lang/String;ILjava/lang/Class;IIII)V

    .line 172
    .line 173
    .line 174
    sput-object v8, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->REFERENCE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 175
    .line 176
    filled-new-array/range {v0 .. v8}, [Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    sput-object v0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->$VALUES:[Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 181
    .line 182
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/Class;IIII)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "*>;IIII)V"
        }
    .end annotation

    .line 1
    invoke-direct/range {p0 .. p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    new-instance p1, Lnet/bytebuddy/ByteBuddy;

    .line 5
    .line 6
    sget-object p2, Lnet/bytebuddy/ClassFileVersion;->JAVA_V6:Lnet/bytebuddy/ClassFileVersion;

    .line 7
    .line 8
    invoke-direct {p1, p2}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 9
    .line 10
    .line 11
    sget-object p2, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    const-class p2, Ljava/lang/Object;

    .line 18
    .line 19
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 20
    .line 21
    invoke-virtual {p1, p2, v0}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    new-instance p2, Ljava/lang/StringBuilder;

    .line 26
    .line 27
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 28
    .line 29
    .line 30
    const-class v0, Lnet/bytebuddy/build/CachedReturnPlugin;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 33
    .line 34
    .line 35
    move-result-object v0

    .line 36
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string v0, "$Advice$"

    .line 40
    .line 41
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p2

    .line 51
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    sget-object p2, Lnet/bytebuddy/description/modifier/Ownership;->STATIC:Lnet/bytebuddy/description/modifier/Ownership;

    .line 56
    .line 57
    const/4 v0, 0x1

    .line 58
    new-array v1, v0, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 59
    .line 60
    const/4 v2, 0x0

    .line 61
    aput-object p2, v1, v2

    .line 62
    .line 63
    const-string v3, "enter"

    .line 64
    .line 65
    invoke-interface {p1, v3, p3, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 66
    .line 67
    .line 68
    move-result-object p1

    .line 69
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple;->withParameter(Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const-class v1, Lnet/bytebuddy/build/CachedReturnPlugin$CacheField;

    .line 74
    .line 75
    invoke-static {v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 76
    .line 77
    .line 78
    move-result-object v3

    .line 79
    invoke-virtual {v3}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->build()Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 80
    .line 81
    .line 82
    move-result-object v3

    .line 83
    new-array v4, v0, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 84
    .line 85
    aput-object v3, v4, v2

    .line 86
    .line 87
    invoke-interface {p1, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;->annotateParameter([Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    new-instance v3, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 92
    .line 93
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 94
    .line 95
    .line 96
    move-result-object v4

    .line 97
    invoke-static {v4}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;

    .line 98
    .line 99
    .line 100
    move-result-object v4

    .line 101
    invoke-virtual {v4, v2}, Lnet/bytebuddy/implementation/bytecode/member/MethodVariableAccess;->loadFrom(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 102
    .line 103
    .line 104
    move-result-object v4

    .line 105
    invoke-static {p3}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 106
    .line 107
    .line 108
    move-result-object v5

    .line 109
    invoke-static {v5}, Lnet/bytebuddy/implementation/bytecode/member/MethodReturn;->of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 110
    .line 111
    .line 112
    move-result-object v5

    .line 113
    const/4 v6, 0x2

    .line 114
    new-array v6, v6, [Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 115
    .line 116
    aput-object v4, v6, v2

    .line 117
    .line 118
    aput-object v5, v6, v0

    .line 119
    .line 120
    invoke-direct {v3, v6}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    const-class v3, Lnet/bytebuddy/asm/Advice$OnMethodEnter;

    .line 128
    .line 129
    invoke-static {v3}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 130
    .line 131
    .line 132
    move-result-object v3

    .line 133
    const-string v4, "skipOn"

    .line 134
    .line 135
    const-class v5, Lnet/bytebuddy/asm/Advice$OnNonDefaultValue;

    .line 136
    .line 137
    invoke-virtual {v3, v4, v5}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 138
    .line 139
    .line 140
    move-result-object v3

    .line 141
    invoke-virtual {v3}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->build()Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 142
    .line 143
    .line 144
    move-result-object v3

    .line 145
    new-array v4, v0, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 146
    .line 147
    aput-object v3, v4, v2

    .line 148
    .line 149
    invoke-interface {p1, v4}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition;->annotateMethod([Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    new-array v3, v0, [Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;

    .line 154
    .line 155
    aput-object p2, v3, v2

    .line 156
    .line 157
    const-string p2, "exit"

    .line 158
    .line 159
    sget-object v4, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 160
    .line 161
    invoke-interface {p1, p2, v4, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->defineMethod(Ljava/lang/String;Ljava/lang/reflect/Type;[Lnet/bytebuddy/description/modifier/ModifierContributor$ForMethod;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial;

    .line 162
    .line 163
    .line 164
    move-result-object p1

    .line 165
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple;->withParameter(Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;

    .line 166
    .line 167
    .line 168
    move-result-object p1

    .line 169
    const-class p2, Lnet/bytebuddy/asm/Advice$Return;

    .line 170
    .line 171
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 172
    .line 173
    .line 174
    move-result-object p2

    .line 175
    const-string v3, "readOnly"

    .line 176
    .line 177
    invoke-virtual {p2, v3, v2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Z)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 178
    .line 179
    .line 180
    move-result-object p2

    .line 181
    const-string v3, "typing"

    .line 182
    .line 183
    sget-object v4, Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;->DYNAMIC:Lnet/bytebuddy/implementation/bytecode/assign/Assigner$Typing;

    .line 184
    .line 185
    invoke-virtual {p2, v3, v4}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->define(Ljava/lang/String;Ljava/lang/Enum;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 186
    .line 187
    .line 188
    move-result-object p2

    .line 189
    invoke-virtual {p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->build()Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 190
    .line 191
    .line 192
    move-result-object p2

    .line 193
    new-array v3, v0, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 194
    .line 195
    aput-object p2, v3, v2

    .line 196
    .line 197
    invoke-interface {p1, v3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;->annotateParameter([Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;

    .line 198
    .line 199
    .line 200
    move-result-object p1

    .line 201
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple;->withParameter(Ljava/lang/reflect/Type;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;

    .line 202
    .line 203
    .line 204
    move-result-object p1

    .line 205
    invoke-static {v1}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 206
    .line 207
    .line 208
    move-result-object p2

    .line 209
    invoke-virtual {p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->build()Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 210
    .line 211
    .line 212
    move-result-object p2

    .line 213
    new-array v1, v0, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 214
    .line 215
    aput-object p2, v1, v2

    .line 216
    .line 217
    invoke-interface {p1, v1}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;->annotateParameter([Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable;

    .line 218
    .line 219
    .line 220
    move-result-object p1

    .line 221
    new-instance p2, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 222
    .line 223
    new-instance v3, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;

    .line 224
    .line 225
    invoke-static {p3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/lang/Class;)Lnet/bytebuddy/implementation/bytecode/StackSize;

    .line 226
    .line 227
    .line 228
    move-result-object p3

    .line 229
    invoke-virtual {p3}, Lnet/bytebuddy/implementation/bytecode/StackSize;->getSize()I

    .line 230
    .line 231
    .line 232
    move-result v8

    .line 233
    move v4, p4

    .line 234
    move v5, p5

    .line 235
    move v6, p6

    .line 236
    move/from16 v7, p7

    .line 237
    .line 238
    invoke-direct/range {v3 .. v8}, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver$ExitAdviceByteCodeAppender;-><init>(IIIII)V

    .line 239
    .line 240
    .line 241
    new-array p3, v0, [Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 242
    .line 243
    aput-object v3, p3, v2

    .line 244
    .line 245
    invoke-direct {p2, p3}, Lnet/bytebuddy/implementation/Implementation$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 246
    .line 247
    .line 248
    invoke-interface {p1, p2}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ImplementationDefinition;->intercept(Lnet/bytebuddy/implementation/Implementation;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition;

    .line 249
    .line 250
    .line 251
    move-result-object p1

    .line 252
    const-class p2, Lnet/bytebuddy/asm/Advice$OnMethodExit;

    .line 253
    .line 254
    invoke-static {p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 255
    .line 256
    .line 257
    move-result-object p2

    .line 258
    invoke-virtual {p2}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->build()Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 259
    .line 260
    .line 261
    move-result-object p2

    .line 262
    new-array p3, v0, [Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 263
    .line 264
    aput-object p2, p3, v2

    .line 265
    .line 266
    invoke-interface {p1, p3}, Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition;->annotateMethod([Lnet/bytebuddy/description/annotation/AnnotationDescription;)Lnet/bytebuddy/dynamic/DynamicType$Builder$MethodDefinition;

    .line 267
    .line 268
    .line 269
    move-result-object p1

    .line 270
    invoke-interface {p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 271
    .line 272
    .line 273
    move-result-object p1

    .line 274
    iput-object p1, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->dynamicType:Lnet/bytebuddy/dynamic/DynamicType;

    .line 275
    .line 276
    return-void
.end method

.method public static of(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;
    .locals 1

    .line 1
    sget-object v0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->BOOLEAN:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object v0, Ljava/lang/Byte;->TYPE:Ljava/lang/Class;

    .line 13
    .line 14
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->BYTE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 21
    .line 22
    return-object p0

    .line 23
    :cond_1
    sget-object v0, Ljava/lang/Short;->TYPE:Ljava/lang/Class;

    .line 24
    .line 25
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_2

    .line 30
    .line 31
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->SHORT:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 32
    .line 33
    return-object p0

    .line 34
    :cond_2
    sget-object v0, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    .line 35
    .line 36
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    if-eqz v0, :cond_3

    .line 41
    .line 42
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->CHARACTER:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 43
    .line 44
    return-object p0

    .line 45
    :cond_3
    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    .line 46
    .line 47
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 48
    .line 49
    .line 50
    move-result v0

    .line 51
    if-eqz v0, :cond_4

    .line 52
    .line 53
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->INTEGER:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 54
    .line 55
    return-object p0

    .line 56
    :cond_4
    sget-object v0, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    .line 57
    .line 58
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 59
    .line 60
    .line 61
    move-result v0

    .line 62
    if-eqz v0, :cond_5

    .line 63
    .line 64
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->LONG:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 65
    .line 66
    return-object p0

    .line 67
    :cond_5
    sget-object v0, Ljava/lang/Float;->TYPE:Ljava/lang/Class;

    .line 68
    .line 69
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 70
    .line 71
    .line 72
    move-result v0

    .line 73
    if-eqz v0, :cond_6

    .line 74
    .line 75
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->FLOAT:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 76
    .line 77
    return-object p0

    .line 78
    :cond_6
    sget-object v0, Ljava/lang/Double;->TYPE:Ljava/lang/Class;

    .line 79
    .line 80
    invoke-interface {p0, v0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    if-eqz v0, :cond_7

    .line 85
    .line 86
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->DOUBLE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 87
    .line 88
    return-object p0

    .line 89
    :cond_7
    invoke-interface {p0}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 90
    .line 91
    .line 92
    move-result v0

    .line 93
    if-nez v0, :cond_8

    .line 94
    .line 95
    sget-object p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->REFERENCE:Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 96
    .line 97
    return-object p0

    .line 98
    :cond_8
    const-string v0, "Unexpected advice type: "

    .line 99
    .line 100
    invoke-static {p0, v0}, Lio/ktor/util/飘花落叶言子楪哲世苏兰;->飘花落叶言子楪兰世苏哲(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    const/4 p0, 0x0

    .line 104
    return-object p0
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->$VALUES:[Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public toAdvice(Ljava/lang/String;)Lnet/bytebuddy/asm/Advice;
    .locals 2

    .line 1
    invoke-static {}, Lnet/bytebuddy/asm/Advice;->withCustomMapping()Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, Lnet/bytebuddy/build/CachedReturnPlugin$CacheFieldOffsetMapping;

    .line 6
    .line 7
    invoke-direct {v1, p1}, Lnet/bytebuddy/build/CachedReturnPlugin$CacheFieldOffsetMapping;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    const-class p1, Lnet/bytebuddy/build/CachedReturnPlugin$CacheField;

    .line 11
    .line 12
    invoke-virtual {v0, p1, v1}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->bind(Ljava/lang/Class;Lnet/bytebuddy/asm/Advice$OffsetMapping;)Lnet/bytebuddy/asm/Advice$WithCustomMapping;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iget-object v0, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->dynamicType:Lnet/bytebuddy/dynamic/DynamicType;

    .line 17
    .line 18
    invoke-interface {v0}, Lnet/bytebuddy/dynamic/DynamicType;->getTypeDescription()Lnet/bytebuddy/description/type/TypeDescription;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    iget-object p0, p0, Lnet/bytebuddy/build/CachedReturnPlugin$AdviceResolver;->dynamicType:Lnet/bytebuddy/dynamic/DynamicType;

    .line 23
    .line 24
    invoke-virtual {p1, v0, p0}, Lnet/bytebuddy/asm/Advice$WithCustomMapping;->to(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/ClassFileLocator;)Lnet/bytebuddy/asm/Advice;

    .line 25
    .line 26
    .line 27
    move-result-object p0

    .line 28
    return-object p0
.end method
