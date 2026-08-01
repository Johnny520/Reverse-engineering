.class public Lnet/bytebuddy/implementation/Implementation$Simple;
.super Ljava/lang/Object;
.source "r8-map-id-447c03deab370cabd87f71de7ff996ccc1a6dc9764ce389c731d875d052048e4"

# interfaces
.implements Lnet/bytebuddy/implementation/Implementation;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/implementation/Implementation;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Simple"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;,
        Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;
    }
.end annotation

.annotation runtime Lnet/bytebuddy/build/HashCodeAndEqualsPlugin$Enhance;
.end annotation


# static fields
.field private static final NO_ADDITIONAL_VARIABLES:I


# instance fields
.field private final byteCodeAppender:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;


# direct methods
.method public varargs constructor <init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Compound;

    .line 5
    .line 6
    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Compound;-><init>([Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;)V

    .line 7
    .line 8
    .line 9
    iput-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Simple;->byteCodeAppender:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 10
    .line 11
    return-void
.end method

.method public varargs constructor <init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V
    .locals 1

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    new-instance v0, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;

    invoke-direct {v0, p1}, Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender$Simple;-><init>([Lnet/bytebuddy/implementation/bytecode/StackManipulation;)V

    iput-object v0, p0, Lnet/bytebuddy/implementation/Implementation$Simple;->byteCodeAppender:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    return-void
.end method

.method public static of(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;)Lnet/bytebuddy/implementation/Implementation;
    .locals 1

    const/4 v0, 0x0

    .line 22
    invoke-static {p0, v0}, Lnet/bytebuddy/implementation/Implementation$Simple;->of(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;I)Lnet/bytebuddy/implementation/Implementation;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;I)Lnet/bytebuddy/implementation/Implementation;
    .locals 1

    .line 20
    sget-object v0, Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable$NoOp;->INSTANCE:Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable$NoOp;

    invoke-static {p0, v0, p1}, Lnet/bytebuddy/implementation/Implementation$Simple;->of(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;I)Lnet/bytebuddy/implementation/Implementation;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;)Lnet/bytebuddy/implementation/Implementation;
    .locals 1

    const/4 v0, 0x0

    .line 21
    invoke-static {p0, p1, v0}, Lnet/bytebuddy/implementation/Implementation$Simple;->of(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;I)Lnet/bytebuddy/implementation/Implementation;

    move-result-object p0

    return-object p0
.end method

.method public static of(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;I)Lnet/bytebuddy/implementation/Implementation;
    .locals 1

    .line 1
    if-ltz p2, :cond_0

    .line 2
    .line 3
    new-instance v0, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;

    .line 4
    .line 5
    invoke-direct {v0, p0, p1, p2}, Lnet/bytebuddy/implementation/Implementation$Simple$ForDispatcher;-><init>(Lnet/bytebuddy/implementation/Implementation$Simple$Dispatcher;Lnet/bytebuddy/dynamic/scaffold/InstrumentedType$Prepareable;I)V

    .line 6
    .line 7
    .line 8
    return-object v0

    .line 9
    :cond_0
    const-string p0, "Additional variable length cannot be negative: "

    .line 10
    .line 11
    invoke-static {p2, p0}, L飘花落叶言世兰子苏哲楪/飘花落叶言子楪苏哲兰世;->飘花落叶言子楪苏兰世哲(ILjava/lang/String;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-static {p0}, Ltop/suzhelan/qstory/hook/item/飘花落叶言子楪哲兰苏世;->飘花落叶言子楪苏世哲兰(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    const/4 p0, 0x0

    .line 19
    return-object p0
.end method


# virtual methods
.method public appender(Lnet/bytebuddy/implementation/Implementation$Target;)Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Simple;->byteCodeAppender:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 2
    .line 3
    return-object p0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation runtime Lnet/bytebuddy/utility/nullability/MaybeNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-nez p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    move-result-object v2

    .line 13
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    move-result-object v3

    .line 17
    if-eq v2, v3, :cond_2

    .line 18
    .line 19
    return v1

    .line 20
    :cond_2
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Simple;->byteCodeAppender:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 21
    .line 22
    check-cast p1, Lnet/bytebuddy/implementation/Implementation$Simple;

    .line 23
    .line 24
    iget-object p1, p1, Lnet/bytebuddy/implementation/Implementation$Simple;->byteCodeAppender:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 25
    .line 26
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p0

    .line 30
    if-nez p0, :cond_3

    .line 31
    .line 32
    return v1

    .line 33
    :cond_3
    return v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    mul-int/lit8 v0, v0, 0x1f

    .line 10
    .line 11
    iget-object p0, p0, Lnet/bytebuddy/implementation/Implementation$Simple;->byteCodeAppender:Lnet/bytebuddy/implementation/bytecode/ByteCodeAppender;

    .line 12
    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result p0

    .line 17
    add-int/2addr p0, v0

    .line 18
    return p0
.end method

.method public prepare(Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;)Lnet/bytebuddy/dynamic/scaffold/InstrumentedType;
    .locals 0

    .line 1
    return-object p1
.end method
