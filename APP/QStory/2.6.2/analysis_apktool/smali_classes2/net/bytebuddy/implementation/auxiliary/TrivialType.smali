.class public final enum Lnet/bytebuddy/implementation/auxiliary/TrivialType;
.super Ljava/lang/Enum;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/auxiliary/TrivialType;",
        ">;",
        "Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/auxiliary/TrivialType;

.field public static final enum PLAIN:Lnet/bytebuddy/implementation/auxiliary/TrivialType;

.field public static final enum SIGNATURE_RELEVANT:Lnet/bytebuddy/implementation/auxiliary/TrivialType;


# instance fields
.field private final eager:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 2
    .line 3
    const-string v1, "SIGNATURE_RELEVANT"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x1

    .line 7
    invoke-direct {v0, v1, v2, v3}, Lnet/bytebuddy/implementation/auxiliary/TrivialType;-><init>(Ljava/lang/String;IZ)V

    .line 8
    .line 9
    .line 10
    sput-object v0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;->SIGNATURE_RELEVANT:Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 11
    .line 12
    new-instance v1, Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 13
    .line 14
    const-string v4, "PLAIN"

    .line 15
    .line 16
    invoke-direct {v1, v4, v3, v2}, Lnet/bytebuddy/implementation/auxiliary/TrivialType;-><init>(Ljava/lang/String;IZ)V

    .line 17
    .line 18
    .line 19
    sput-object v1, Lnet/bytebuddy/implementation/auxiliary/TrivialType;->PLAIN:Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 20
    .line 21
    filled-new-array {v0, v1}, [Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    sput-object v0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;->$VALUES:[Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 26
    .line 27
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;IZ)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-boolean p3, p0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;->eager:Z

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/auxiliary/TrivialType;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/auxiliary/TrivialType;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;->$VALUES:[Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/auxiliary/TrivialType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/auxiliary/TrivialType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public getSuffix()Ljava/lang/String;
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    invoke-static {p0}, Lnet/bytebuddy/utility/RandomString;->hashOf(I)Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    return-object p0
.end method

.method public make(Ljava/lang/String;Lnet/bytebuddy/ClassFileVersion;Lnet/bytebuddy/implementation/MethodAccessorFactory;)Lnet/bytebuddy/dynamic/DynamicType;
    .locals 1

    .line 1
    new-instance p3, Lnet/bytebuddy/ByteBuddy;

    .line 2
    .line 3
    invoke-direct {p3, p2}, Lnet/bytebuddy/ByteBuddy;-><init>(Lnet/bytebuddy/ClassFileVersion;)V

    .line 4
    .line 5
    .line 6
    sget-object p2, Lnet/bytebuddy/dynamic/scaffold/TypeValidation;->DISABLED:Lnet/bytebuddy/dynamic/scaffold/TypeValidation;

    .line 7
    .line 8
    invoke-virtual {p3, p2}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/TypeValidation;)Lnet/bytebuddy/ByteBuddy;

    .line 9
    .line 10
    .line 11
    move-result-object p2

    .line 12
    sget-object p3, Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Empty;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Empty;

    .line 13
    .line 14
    invoke-virtual {p2, p3}, Lnet/bytebuddy/ByteBuddy;->with(Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Compiler;)Lnet/bytebuddy/ByteBuddy;

    .line 15
    .line 16
    .line 17
    move-result-object p2

    .line 18
    const-class p3, Ljava/lang/Object;

    .line 19
    .line 20
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;->NO_CONSTRUCTORS:Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy$Default;

    .line 21
    .line 22
    invoke-virtual {p2, p3, v0}, Lnet/bytebuddy/ByteBuddy;->subclass(Ljava/lang/Class;Lnet/bytebuddy/dynamic/scaffold/subclass/ConstructorStrategy;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 23
    .line 24
    .line 25
    move-result-object p2

    .line 26
    iget-boolean p0, p0, Lnet/bytebuddy/implementation/auxiliary/TrivialType;->eager:Z

    .line 27
    .line 28
    if-eqz p0, :cond_0

    .line 29
    .line 30
    const-class p0, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType$SignatureRelevant;

    .line 31
    .line 32
    invoke-static {p0}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->ofType(Ljava/lang/Class;)Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    const/4 p3, 0x0

    .line 37
    invoke-virtual {p0, p3}, Lnet/bytebuddy/description/annotation/AnnotationDescription$Builder;->build(Z)Lnet/bytebuddy/description/annotation/AnnotationDescription;

    .line 38
    .line 39
    .line 40
    move-result-object p0

    .line 41
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 42
    .line 43
    .line 44
    move-result-object p0

    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object p0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    .line 47
    .line 48
    :goto_0
    invoke-interface {p2, p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->annotateType(Ljava/util/Collection;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->name(Ljava/lang/String;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    sget-object p1, Lnet/bytebuddy/implementation/auxiliary/AuxiliaryType;->DEFAULT_TYPE_MODIFIER:[Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;

    .line 57
    .line 58
    invoke-interface {p0, p1}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->modifiers([Lnet/bytebuddy/description/modifier/ModifierContributor$ForType;)Lnet/bytebuddy/dynamic/DynamicType$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object p0

    .line 62
    invoke-interface {p0}, Lnet/bytebuddy/dynamic/DynamicType$Builder;->make()Lnet/bytebuddy/dynamic/DynamicType$Unloaded;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
