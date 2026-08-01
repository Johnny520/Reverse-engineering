.class abstract Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "Delegate"
.end annotation


# instance fields
.field final synthetic this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;


# direct methods
.method private constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;->this$1:Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public synthetic constructor <init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;Lnet/bytebuddy/pool/TypePool$1;)V
    .locals 0

    .line 7
    invoke-direct {p0, p1}, Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$Delegate;-><init>(Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription;)V

    return-void
.end method


# virtual methods
.method public abstract getInterfaces()Lnet/bytebuddy/description/type/TypeList$Generic;
.end method

.method public abstract getModifiers()I
.end method

.method public abstract getName()Ljava/lang/String;
.end method

.method public abstract getSuperClass()Lnet/bytebuddy/description/type/TypeDescription$Generic;
    .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
    .end annotation
.end method

.method public abstract resolve()Lnet/bytebuddy/pool/TypePool$Default$WithLazyResolution$ExtendedLazyTypeDescription$ResolvedDelegate;
.end method
