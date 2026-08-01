.class public final enum Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;
.super Ljava/lang/Enum;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation$Target$Factory;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "Factory"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;",
        ">;",
        "Lnet/bytebuddy/implementation/Implementation$Target$Factory;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

.field public static final enum LEVEL_TYPE:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

.field public static final enum SUPER_CLASS:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;


# instance fields
.field private final originTypeResolver:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    sget-object v2, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;->SUPER_CLASS:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;

    .line 5
    .line 6
    const-string v3, "SUPER_CLASS"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;->SUPER_CLASS:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 12
    .line 13
    new-instance v1, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 14
    .line 15
    const/4 v2, 0x1

    .line 16
    sget-object v3, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;->LEVEL_TYPE:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;

    .line 17
    .line 18
    const-string v4, "LEVEL_TYPE"

    .line 19
    .line 20
    invoke-direct {v1, v4, v2, v3}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;-><init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;)V

    .line 21
    .line 22
    .line 23
    sput-object v1, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;->LEVEL_TYPE:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 24
    .line 25
    filled-new-array {v0, v1}, [Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 26
    .line 27
    .line 28
    move-result-object v0

    .line 29
    sput-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 30
    .line 31
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;->originTypeResolver:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;

    .line 5
    .line 6
    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;->$VALUES:[Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public make(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/implementation/Implementation$Target;
    .locals 1

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget;

    .line 2
    .line 3
    invoke-static {p3}, Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;->of(Lnet/bytebuddy/ClassFileVersion;)Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;

    .line 4
    .line 5
    .line 6
    move-result-object p3

    .line 7
    iget-object p0, p0, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$Factory;->originTypeResolver:Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;

    .line 8
    .line 9
    invoke-direct {v0, p1, p2, p3, p0}, Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget;-><init>(Lnet/bytebuddy/description/type/TypeDescription;Lnet/bytebuddy/dynamic/scaffold/MethodGraph$Linked;Lnet/bytebuddy/implementation/Implementation$Target$AbstractBase$DefaultMethodInvocation;Lnet/bytebuddy/dynamic/scaffold/subclass/SubclassImplementationTarget$OriginTypeResolver;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
