.class public Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "OfDefault"
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
    includeSyntheticFields = true
.end annotation


# instance fields
.field private final index:I

.field final synthetic this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;I)V
    .locals 0

    iput-object p1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->index:I

    return-void
.end method


# virtual methods
.method public bind(Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;)Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Bound;
    .locals 7

    new-instance v6, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    iget v4, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->index:I

    const/4 v5, 0x0

    move-object v0, v6

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v0 .. v5}, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$Bound;-><init>(Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;Lnet/bytebuddy/description/method/MethodDescription;Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$Relocation;IZ)V

    return-object v6
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-nez p1, :cond_1

    return v1

    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_2

    return v1

    :cond_2
    iget v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->index:I

    check-cast p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;

    iget v3, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->index:I

    if-eq v2, v3, :cond_3

    return v1

    :cond_3
    iget-object v2, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    iget-object p1, p1, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-virtual {v2, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    return v1

    :cond_4
    return v0
.end method

.method public hashCode()I
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->index:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue$OfDefault;->this$0:Lnet/bytebuddy/asm/Advice$Dispatcher$RelocationHandler$ForValue;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method
