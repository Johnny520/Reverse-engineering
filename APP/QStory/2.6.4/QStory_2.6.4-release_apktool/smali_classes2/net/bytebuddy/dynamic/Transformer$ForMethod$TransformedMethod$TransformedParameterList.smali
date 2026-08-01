.class public Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;
.super Lnet/bytebuddy/description/method/ParameterList$AbstractBase;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "TransformedParameterList"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/description/method/ParameterList$AbstractBase<",
        "Lnet/bytebuddy/description/method/ParameterDescription;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;->this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;

    .line 2
    .line 3
    invoke-direct {p0}, Lnet/bytebuddy/description/method/ParameterList$AbstractBase;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public bridge synthetic get(I)Ljava/lang/Object;
    .locals 0

    .line 23
    invoke-virtual {p0, p1}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;->get(I)Lnet/bytebuddy/description/method/ParameterDescription;

    move-result-object p0

    return-object p0
.end method

.method public get(I)Lnet/bytebuddy/description/method/ParameterDescription;
    .locals 2

    .line 1
    new-instance v0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;

    .line 2
    .line 3
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;->this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;

    .line 4
    .line 5
    invoke-static {p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->access$000(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 6
    .line 7
    .line 8
    move-result-object v1

    .line 9
    invoke-virtual {v1}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getParameterTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-virtual {v1, p1}, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;->get(I)Lnet/bytebuddy/description/ByteCodeElement$Token;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    check-cast v1, Lnet/bytebuddy/description/method/ParameterDescription$Token;

    .line 18
    .line 19
    invoke-direct {v0, p0, p1, v1}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameter;-><init>(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;ILnet/bytebuddy/description/method/ParameterDescription$Token;)V

    .line 20
    .line 21
    .line 22
    return-object v0
.end method

.method public size()I
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod$TransformedParameterList;->this$0:Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;

    .line 2
    .line 3
    invoke-static {p0}, Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;->access$000(Lnet/bytebuddy/dynamic/Transformer$ForMethod$TransformedMethod;)Lnet/bytebuddy/description/method/MethodDescription$Token;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Lnet/bytebuddy/description/method/MethodDescription$Token;->getParameterTokens()Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Lnet/bytebuddy/description/ByteCodeElement$Token$TokenList;->size()I

    .line 12
    .line 13
    .line 14
    move-result p0

    .line 15
    return p0
.end method
