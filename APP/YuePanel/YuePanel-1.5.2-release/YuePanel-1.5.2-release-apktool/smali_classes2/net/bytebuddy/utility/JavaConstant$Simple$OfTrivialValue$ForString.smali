.class public Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForString;
.super Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForString"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue<",
        "Ljava/lang/String;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-class v0, Ljava/lang/String;

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 2

    new-instance v0, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;

    iget-object v1, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    invoke-direct {v0, v1}, Lnet/bytebuddy/implementation/bytecode/constant/TextConstant;-><init>(Ljava/lang/String;)V

    return-object v0
.end method
