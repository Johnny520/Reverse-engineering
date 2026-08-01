.class final enum Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$5;
.super Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


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

    .line 1
    const/4 v8, 0x0

    .line 2
    move-object v0, p0

    .line 3
    move-object v1, p1

    .line 4
    move v2, p2

    .line 5
    move v3, p3

    .line 6
    move v4, p4

    .line 7
    move v5, p5

    .line 8
    move v6, p6

    .line 9
    move/from16 v7, p7

    .line 10
    .line 11
    invoke-direct/range {v0 .. v8}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;-><init>(Ljava/lang/String;IIIIIILnet/bytebuddy/asm/Advice$1;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public convertValue(Lnet/bytebuddy/jar/asm/MethodVisitor;)V
    .locals 0

    .line 1
    return-void
.end method
