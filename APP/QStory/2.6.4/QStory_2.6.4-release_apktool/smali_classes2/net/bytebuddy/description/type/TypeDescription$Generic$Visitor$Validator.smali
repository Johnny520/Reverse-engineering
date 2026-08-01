.class public enum Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = "Validator"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$ForTypeAnnotations;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;",
        ">;",
        "Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor<",
        "Ljava/lang/Boolean;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum EXCEPTION:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum FIELD:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum INTERFACE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum METHOD_PARAMETER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum METHOD_RETURN:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum RECEIVER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum SUPER_CLASS:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

.field public static final enum TYPE_VARIABLE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;


# instance fields
.field private final acceptsArray:Z

.field private final acceptsPrimitive:Z

.field private final acceptsVariable:Z

.field private final acceptsVoid:Z


# direct methods
.method static constructor <clinit>()V
    .locals 14

    .line 1
    new-instance v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$1;

    .line 2
    .line 3
    const/4 v5, 0x0

    .line 4
    const/4 v6, 0x0

    .line 5
    const-string v1, "SUPER_CLASS"

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x0

    .line 10
    invoke-direct/range {v0 .. v6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$1;-><init>(Ljava/lang/String;IZZZZ)V

    .line 11
    .line 12
    .line 13
    sput-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->SUPER_CLASS:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 14
    .line 15
    new-instance v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$2;

    .line 16
    .line 17
    const/4 v7, 0x0

    .line 18
    const-string v2, "INTERFACE"

    .line 19
    .line 20
    const/4 v3, 0x1

    .line 21
    invoke-direct/range {v1 .. v7}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$2;-><init>(Ljava/lang/String;IZZZZ)V

    .line 22
    .line 23
    .line 24
    sput-object v1, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->INTERFACE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 25
    .line 26
    new-instance v2, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 27
    .line 28
    const/4 v7, 0x1

    .line 29
    const/4 v8, 0x0

    .line 30
    const-string v3, "TYPE_VARIABLE"

    .line 31
    .line 32
    const/4 v4, 0x2

    .line 33
    invoke-direct/range {v2 .. v8}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;-><init>(Ljava/lang/String;IZZZZ)V

    .line 34
    .line 35
    .line 36
    sput-object v2, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->TYPE_VARIABLE:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 37
    .line 38
    new-instance v3, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 39
    .line 40
    const/4 v8, 0x1

    .line 41
    const/4 v9, 0x0

    .line 42
    const-string v4, "FIELD"

    .line 43
    .line 44
    const/4 v5, 0x3

    .line 45
    const/4 v6, 0x1

    .line 46
    invoke-direct/range {v3 .. v9}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;-><init>(Ljava/lang/String;IZZZZ)V

    .line 47
    .line 48
    .line 49
    sput-object v3, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->FIELD:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 50
    .line 51
    new-instance v4, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 52
    .line 53
    const/4 v9, 0x1

    .line 54
    const/4 v10, 0x1

    .line 55
    const-string v5, "METHOD_RETURN"

    .line 56
    .line 57
    const/4 v6, 0x4

    .line 58
    invoke-direct/range {v4 .. v10}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;-><init>(Ljava/lang/String;IZZZZ)V

    .line 59
    .line 60
    .line 61
    sput-object v4, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->METHOD_RETURN:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 62
    .line 63
    new-instance v5, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 64
    .line 65
    const/4 v11, 0x0

    .line 66
    const-string v6, "METHOD_PARAMETER"

    .line 67
    .line 68
    const/4 v7, 0x5

    .line 69
    invoke-direct/range {v5 .. v11}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;-><init>(Ljava/lang/String;IZZZZ)V

    .line 70
    .line 71
    .line 72
    sput-object v5, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->METHOD_PARAMETER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 73
    .line 74
    new-instance v6, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$3;

    .line 75
    .line 76
    const/4 v11, 0x1

    .line 77
    const/4 v12, 0x0

    .line 78
    const-string v7, "EXCEPTION"

    .line 79
    .line 80
    const/4 v8, 0x6

    .line 81
    const/4 v9, 0x0

    .line 82
    const/4 v10, 0x0

    .line 83
    invoke-direct/range {v6 .. v12}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator$3;-><init>(Ljava/lang/String;IZZZZ)V

    .line 84
    .line 85
    .line 86
    sput-object v6, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->EXCEPTION:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 87
    .line 88
    new-instance v7, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 89
    .line 90
    const/4 v13, 0x0

    .line 91
    const-string v8, "RECEIVER"

    .line 92
    .line 93
    const/4 v9, 0x7

    .line 94
    const/4 v11, 0x0

    .line 95
    invoke-direct/range {v7 .. v13}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;-><init>(Ljava/lang/String;IZZZZ)V

    .line 96
    .line 97
    .line 98
    sput-object v7, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->RECEIVER:Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 99
    .line 100
    const/16 v8, 0x8

    .line 101
    .line 102
    new-array v8, v8, [Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 103
    .line 104
    const/4 v9, 0x0

    .line 105
    aput-object v0, v8, v9

    .line 106
    .line 107
    const/4 v0, 0x1

    .line 108
    aput-object v1, v8, v0

    .line 109
    .line 110
    const/4 v0, 0x2

    .line 111
    aput-object v2, v8, v0

    .line 112
    .line 113
    const/4 v0, 0x3

    .line 114
    aput-object v3, v8, v0

    .line 115
    .line 116
    const/4 v0, 0x4

    .line 117
    aput-object v4, v8, v0

    .line 118
    .line 119
    const/4 v0, 0x5

    .line 120
    aput-object v5, v8, v0

    .line 121
    .line 122
    const/4 v0, 0x6

    .line 123
    aput-object v6, v8, v0

    .line 124
    .line 125
    const/4 v0, 0x7

    .line 126
    aput-object v7, v8, v0

    .line 127
    .line 128
    sput-object v8, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->$VALUES:[Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 129
    .line 130
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZZZZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(ZZZZ)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsArray:Z

    .line 5
    .line 6
    iput-boolean p4, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsPrimitive:Z

    .line 7
    .line 8
    iput-boolean p5, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsVariable:Z

    .line 9
    .line 10
    iput-boolean p6, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsVoid:Z

    .line 11
    .line 12
    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;IZZZZLnet/bytebuddy/description/type/TypeDescription$1;)V
    .locals 0

    .line 13
    invoke-direct/range {p0 .. p6}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;-><init>(Ljava/lang/String;IZZZZ)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->$VALUES:[Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsArray:Z

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public bridge synthetic onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->onGenericArray(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-boolean v0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsArray:Z

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isArray()Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-nez v0, :cond_2

    .line 10
    .line 11
    :cond_0
    iget-boolean v0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsPrimitive:Z

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    invoke-interface {p1}, Lnet/bytebuddy/description/type/TypeDefinition;->isPrimitive()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-nez v0, :cond_2

    .line 20
    .line 21
    :cond_1
    iget-boolean p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsVoid:Z

    .line 22
    .line 23
    if-nez p0, :cond_3

    .line 24
    .line 25
    sget-object p0, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 26
    .line 27
    invoke-interface {p1, p0}, Lnet/bytebuddy/description/type/TypeDefinition;->represents(Ljava/lang/reflect/Type;)Z

    .line 28
    .line 29
    .line 30
    move-result p0

    .line 31
    if-nez p0, :cond_2

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 p0, 0x0

    .line 35
    goto :goto_1

    .line 36
    :cond_3
    :goto_0
    const/4 p0, 0x1

    .line 37
    :goto_1
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    return-object p0
.end method

.method public bridge synthetic onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 42
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->onNonGenericType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;
    .locals 0

    .line 6
    sget-object p0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->onParameterizedType(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;
    .locals 0

    .line 1
    iget-boolean p0, p0, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->acceptsVariable:Z

    .line 2
    .line 3
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public bridge synthetic onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 8
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->onTypeVariable(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method public onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;
    .locals 0

    .line 6
    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p0
.end method

.method public bridge synthetic onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Object;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lnet/bytebuddy/description/type/TypeDescription$Generic$Visitor$Validator;->onWildcard(Lnet/bytebuddy/description/type/TypeDescription$Generic;)Ljava/lang/Boolean;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method
