.class public Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$MethodSizeHandler$ForAdvice;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ForAdvice"
.end annotation


# instance fields
.field private final baseLocalVariableLength:I

.field private localVariableLengthPadding:I

.field private stackSizePadding:I

.field final synthetic this$0:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;

.field private final typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;Lnet/bytebuddy/description/method/MethodDescription$TypeToken;I)V
    .locals 0

    .line 1
    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p2, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 7
    .line 8
    iput p3, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->baseLocalVariableLength:I

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public recordMaxima(II)V
    .locals 2

    .line 1
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;

    .line 2
    .line 3
    iget v1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->stackSizePadding:I

    .line 4
    .line 5
    add-int/2addr p1, v1

    .line 6
    invoke-virtual {v0, p1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->requireStackSize(I)V

    .line 7
    .line 8
    .line 9
    iget-object p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;

    .line 10
    .line 11
    iget-object v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->typeToken:Lnet/bytebuddy/description/method/MethodDescription$TypeToken;

    .line 12
    .line 13
    invoke-virtual {v0}, Lnet/bytebuddy/description/method/MethodDescription$TypeToken;->getParameterTypes()Ljava/util/List;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-static {v0}, Lnet/bytebuddy/implementation/bytecode/StackSize;->of(Ljava/util/Collection;)I

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    sub-int/2addr p2, v0

    .line 22
    iget v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->baseLocalVariableLength:I

    .line 23
    .line 24
    add-int/2addr p2, v0

    .line 25
    iget p0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->localVariableLengthPadding:I

    .line 26
    .line 27
    add-int/2addr p2, p0

    .line 28
    invoke-virtual {p1, p2}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->requireLocalVariableLength(I)V

    .line 29
    .line 30
    .line 31
    return-void
.end method

.method public requireLocalVariableLength(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->requireLocalVariableLength(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public requireLocalVariableLengthPadding(I)V
    .locals 1

    .line 1
    iget v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->localVariableLengthPadding:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->localVariableLengthPadding:I

    .line 8
    .line 9
    return-void
.end method

.method public requireStackSize(I)V
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->this$0:Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default;->requireStackSize(I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public requireStackSizePadding(I)V
    .locals 1

    .line 1
    iget v0, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->stackSizePadding:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Ljava/lang/Math;->max(II)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    iput p1, p0, Lnet/bytebuddy/asm/Advice$MethodSizeHandler$Default$ForAdvice;->stackSizePadding:I

    .line 8
    .line 9
    return-void
.end method
