.class final enum Lnet/bytebuddy/asm/Advice$OffsetMapping$ForInstrumentedMethod$6;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$ForInstrumentedMethod;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForInstrumentedMethod;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForInstrumentedMethod;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public isRepresentable(Lnet/bytebuddy/description/method/MethodDescription;)Z
    .locals 0

    .line 1
    const/4 p0, 0x1

    .line 2
    return p0
.end method

.method public resolve(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;

    .line 2
    .line 3
    invoke-static {p1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->of(Lnet/bytebuddy/description/method/MethodDescription;)Lnet/bytebuddy/utility/JavaConstant$MethodType;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-virtual {p1}, Lnet/bytebuddy/utility/JavaConstant$MethodType;->toStackManipulation()Lnet/bytebuddy/implementation/bytecode/StackManipulation;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-direct {p0, p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;-><init>(Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    .line 12
    .line 13
    .line 14
    return-object p0
.end method
