.class public final enum Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;
.super Ljava/lang/Enum;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "ForImplicitType"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;",
        ">;",
        "Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

.field public static final enum INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

    .line 2
    .line 3
    const-string v1, "INSTANCE"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-direct {v0, v1, v2}, Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;-><init>(Ljava/lang/String;I)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;->INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

    .line 10
    .line 11
    filled-new-array {v0}, [Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    sput-object v0, Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

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

.method public static valueOf(Ljava/lang/String;)Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;
    .locals 1

    .line 1
    const-class v0, Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;
    .locals 1

    .line 1
    sget-object v0, Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;->$VALUES:[Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

    .line 2
    .line 3
    invoke-virtual {v0}, [Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lnet/bytebuddy/implementation/bind/annotation/DefaultMethod$Binder$MethodLocator$ForImplicitType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public resolve(Lnet/bytebuddy/implementation/Implementation$Target;Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;
    .locals 0

    .line 1
    invoke-interface {p2}, Lnet/bytebuddy/description/method/MethodDescription;->asSignatureToken()Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-interface {p1, p0}, Lnet/bytebuddy/implementation/Implementation$Target;->invokeDefault(Lnet/bytebuddy/description/method/MethodDescription$SignatureToken;)Lnet/bytebuddy/implementation/Implementation$SpecialMethodInvocation;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    return-object p0
.end method
