.class public final enum Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "PrecomputedMethodGraph"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;",
        ">;",
        "Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;


# instance fields
.field private final transient methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->INSTANCE:Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->$VALUES:[Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 16
    .line 17
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 13
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
    new-instance p1, Ljava/util/LinkedHashMap;

    .line 5
    .line 6
    invoke-direct {p1}, Ljava/util/LinkedHashMap;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v0, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    .line 10
    .line 11
    const-class p2, Ljava/util/concurrent/Callable;

    .line 12
    .line 13
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    sget-object v4, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 18
    .line 19
    const-class p2, Ljava/lang/Object;

    .line 20
    .line 21
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 22
    .line 23
    .line 24
    move-result-object v5

    .line 25
    const-class p2, Ljava/lang/Exception;

    .line 26
    .line 27
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 28
    .line 29
    .line 30
    move-result-object p2

    .line 31
    invoke-static {p2}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 32
    .line 33
    .line 34
    move-result-object v7

    .line 35
    sget-object v9, Lnet/bytebuddy/description/annotation/AnnotationValue;->UNDEFINED:Lnet/bytebuddy/description/annotation/AnnotationValue;

    .line 36
    .line 37
    sget-object v10, Lnet/bytebuddy/description/type/TypeDescription$Generic;->UNDEFINED:Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 38
    .line 39
    const-string v2, "call"

    .line 40
    .line 41
    const/16 v3, 0x401

    .line 42
    .line 43
    move-object v6, v4

    .line 44
    move-object v8, v4

    .line 45
    invoke-direct/range {v0 .. v10}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v0}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 49
    .line 50
    .line 51
    move-result-object p2

    .line 52
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Simple;

    .line 53
    .line 54
    invoke-direct {v1, v0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Simple;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1, p2, v1}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 58
    .line 59
    .line 60
    new-instance v2, Lnet/bytebuddy/description/method/MethodDescription$Latent;

    .line 61
    .line 62
    const-class p2, Ljava/lang/Runnable;

    .line 63
    .line 64
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    .line 65
    .line 66
    .line 67
    move-result-object v3

    .line 68
    sget-object p2, Ljava/lang/Void;->TYPE:Ljava/lang/Class;

    .line 69
    .line 70
    invoke-static {p2}, Lnet/bytebuddy/description/type/TypeDescription$Generic$OfNonGenericType$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription$Generic;

    .line 71
    .line 72
    .line 73
    move-result-object v7

    .line 74
    const-string v4, "run"

    .line 75
    .line 76
    const/16 v5, 0x401

    .line 77
    .line 78
    move-object v8, v6

    .line 79
    move-object v11, v9

    .line 80
    move-object v9, v6

    .line 81
    move-object v12, v10

    .line 82
    move-object v10, v6

    .line 83
    invoke-direct/range {v2 .. v12}, Lnet/bytebuddy/description/method/MethodDescription$Latent;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Ljava/lang/String;ILjava/util/List;Lnet/bytebuddy/description/type/TypeDescription$Generic;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lnet/bytebuddy/description/annotation/AnnotationValue;Lnet/bytebuddy/description/type/TypeDescription$Generic;)V

    .line 84
    .line 85
    .line 86
    invoke-interface {v2}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 87
    .line 88
    .line 89
    move-result-object p2

    .line 90
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Simple;

    .line 91
    .line 92
    invoke-direct {v0, v2}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Node$Simple;-><init>(Lnet/bytebuddy/description/method/MethodDescription;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p1, p2, v0}, Ljava/util/AbstractMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    .line 97
    .line 98
    new-instance p2, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Simple;

    .line 99
    .line 100
    invoke-direct {p2, p1}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Simple;-><init>(Ljava/util/LinkedHashMap;)V

    .line 101
    .line 102
    .line 103
    new-instance p1, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked$Delegation;

    .line 104
    .line 105
    sget-object v0, Ljava/util/Collections;->EMPTY_MAP:Ljava/util/Map;

    .line 106
    .line 107
    invoke-direct {p1, p2, p2, v0}, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked$Delegation;-><init>(Lnet/bytebuddy/dynamic/scaffold/MethodGraph;Lnet/bytebuddy/dynamic/scaffold/MethodGraph;Ljava/util/Map;)V

    .line 108
    .line 109
    .line 110
    iput-object p1, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 111
    .line 112
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->$VALUES:[Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public compile(Lnet/bytebuddy/description/type/TypeDefinition;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    .line 2
    .line 3
    return-object p0
.end method

.method public compile(Lnet/bytebuddy/description/type/TypeDefinition;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;
    .locals 0

    .line 5
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    return-object p0
.end method

.method public compile(Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 4
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    return-object p0
.end method

.method public compile(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/description/type/TypeDescription;)Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;
    .locals 0
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 6
    iget-object p0, p0, Lnet/bytebuddy/implementation/auxiliary/MethodCallProxy$PrecomputedMethodGraph;->methodGraph:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;

    return-object p0
.end method
