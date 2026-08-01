.class public abstract Lnet/bytebuddy/implementation/Implementation$Context$Default$AbstractPropertyAccessorMethod;
.super Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation$Context$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractPropertyAccessorMethod"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public abstract getBaseModifiers()I
.end method

.method public getModifiers()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/implementation/Implementation$Context$Default$AbstractPropertyAccessorMethod;->getBaseModifiers()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    or-int/lit16 v0, v0, 0x1000

    .line 6
    .line 7
    invoke-interface {p0}, Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;->getDeclaringType()Lnet/bytebuddy/description/type/TypeDescription;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-interface {p0}, Lnet/bytebuddy/description/ModifierReviewable$ForTypeDefinition;->isInterface()Z

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    if-eqz p0, :cond_0

    .line 16
    .line 17
    const/4 p0, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/16 p0, 0x10

    .line 20
    .line 21
    :goto_0
    or-int/2addr p0, v0

    .line 22
    return p0
.end method
