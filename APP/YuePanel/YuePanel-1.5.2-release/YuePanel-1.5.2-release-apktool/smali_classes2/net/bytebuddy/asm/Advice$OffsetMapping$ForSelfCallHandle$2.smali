.class final enum Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle$2;
.super Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/asm/Advice$OffsetMapping$ForSelfCallHandle;-><init>(Ljava/lang/String;ILnet/bytebuddy/asm/Advice$1;)V

    return-void
.end method


# virtual methods
.method public decorate(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/implementation/bytecode/StackManipulation;)Lnet/bytebuddy/implementation/bytecode/StackManipulation;
    .locals 0

    return-object p2
.end method
