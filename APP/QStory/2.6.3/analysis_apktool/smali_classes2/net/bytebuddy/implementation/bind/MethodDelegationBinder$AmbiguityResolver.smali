.class public interface abstract Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/bind/MethodDelegationBinder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "AmbiguityResolver"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Compound;,
        Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Directional;,
        Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$NoOp;,
        Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;
    }
.end annotation


# static fields
.field public static final DEFAULT:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Compound;

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    new-array v1, v1, [Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 5
    .line 6
    sget-object v2, Lnet/bytebuddy/implementation/bind/annotation/BindingPriority$Resolver;->INSTANCE:Lnet/bytebuddy/implementation/bind/annotation/BindingPriority$Resolver;

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    aput-object v2, v1, v3

    .line 10
    .line 11
    sget-object v2, Lnet/bytebuddy/implementation/bind/DeclaringTypeResolver;->INSTANCE:Lnet/bytebuddy/implementation/bind/DeclaringTypeResolver;

    .line 12
    .line 13
    const/4 v3, 0x1

    .line 14
    aput-object v2, v1, v3

    .line 15
    .line 16
    sget-object v2, Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver;->INSTANCE:Lnet/bytebuddy/implementation/bind/ArgumentTypeResolver;

    .line 17
    .line 18
    const/4 v3, 0x2

    .line 19
    aput-object v2, v1, v3

    .line 20
    .line 21
    sget-object v2, Lnet/bytebuddy/implementation/bind/MethodNameEqualityResolver;->INSTANCE:Lnet/bytebuddy/implementation/bind/MethodNameEqualityResolver;

    .line 22
    .line 23
    const/4 v3, 0x3

    .line 24
    aput-object v2, v1, v3

    .line 25
    .line 26
    sget-object v2, Lnet/bytebuddy/implementation/bind/ParameterLengthResolver;->INSTANCE:Lnet/bytebuddy/implementation/bind/ParameterLengthResolver;

    .line 27
    .line 28
    const/4 v3, 0x4

    .line 29
    aput-object v2, v1, v3

    .line 30
    .line 31
    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Compound;-><init>([Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;)V

    .line 32
    .line 33
    .line 34
    sput-object v0, Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;->DEFAULT:Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver;

    .line 35
    .line 36
    return-void
.end method


# virtual methods
.method public abstract resolve(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$MethodBinding;)Lnet/bytebuddy/implementation/bind/MethodDelegationBinder$AmbiguityResolver$Resolution;
.end method
