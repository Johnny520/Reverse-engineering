.class final enum Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$4;
.super Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;IIIIII)V
    .locals 9

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v4, p4

    move v5, p5

    move v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;-><init>(Ljava/lang/String;IIIIIILnet/bytebuddy/asm/Advice$1;)V

    return-void
.end method


# virtual methods
.method public convertValue(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 0

    return-void
.end method
