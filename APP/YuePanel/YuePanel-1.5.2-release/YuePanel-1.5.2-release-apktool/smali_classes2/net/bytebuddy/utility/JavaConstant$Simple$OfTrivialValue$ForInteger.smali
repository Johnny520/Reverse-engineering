.class public Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue$ForInteger;
.super Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForInteger"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue<",
        "Ljava/lang/Integer;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/Integer;)V
    .locals 1

    sget-object v0, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    invoke-static {v0}, Lnet/bytebuddy/description/type/TypeDescription$ForLoadedType;->of(Ljava/lang/Class;)Lnet/bytebuddy/description/type/TypeDescription;

    move-result-object v0

    invoke-direct {p0, p1, v0}, Lnet/bytebuddy/utility/JavaConstant$Simple$OfTrivialValue;-><init>(Ljava/lang/Object;Lnet/bytebuddy/description/type/TypeDescription;)V

    return-void
.end method


# virtual methods
.method public toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 1

    iget-object v0, p0, Lnet/bytebuddy/utility/JavaConstant$Simple;->value:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/constant/IntegerConstant;->forValue(I)Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    move-result-object v0

    return-object v0
.end method
