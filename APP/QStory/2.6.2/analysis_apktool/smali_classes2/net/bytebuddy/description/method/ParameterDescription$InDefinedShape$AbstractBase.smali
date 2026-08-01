.class public abstract Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape$AbstractBase;
.super Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"

# interfaces
.implements Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "AbstractBase"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lnet/bytebuddy/description/method/ParameterDescription$AbstractBase;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public bridge synthetic asDefined()Lnet/bytebuddy/description/ByteCodeElement$TypeDependant;
    .locals 0

    .line 1
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape$AbstractBase;->asDefined()Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public asDefined()Lnet/bytebuddy/description/method/ParameterDescription$InDefinedShape;
    .locals 0

    .line 6
    return-object p0
.end method
