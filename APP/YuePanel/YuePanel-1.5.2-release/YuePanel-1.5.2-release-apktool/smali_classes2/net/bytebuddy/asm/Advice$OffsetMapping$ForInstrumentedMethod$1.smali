.class final enum Lnet/bytebuddy/asm/Advice$OffsetMapping$ForInstrumentedMethod$1;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$ForInstrumentedMethod;
.source "SourceFile"


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

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForInstrumentedMethod;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V

    return-void
.end method


# virtual methods
.method public isRepresentable(Lnet/bytebuddy/description/method/MethodDescription;)Z
    .locals 0

    invoke-interface {p1}, Lnet/bytebuddy/description/method/MethodDescription;->isMethod()Z

    move-result p1

    return p1
.end method

.method public resolve(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;
    .locals 0

    invoke-static {p1}, Lnet/bytebuddy/asm/Advice$OffsetMapping$Target$ForStackManipulation;->of(Lnet/bytebuddy/description/method/MethodDescription$InDefinedShape;)Lnet/bytebuddy/asm/Advice$OffsetMapping$Target;

    move-result-object p1

    return-object p1
.end method
