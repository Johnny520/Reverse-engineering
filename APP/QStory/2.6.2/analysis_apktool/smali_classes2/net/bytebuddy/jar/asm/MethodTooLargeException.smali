.class public final Lnet/bytebuddy/jar/asm/MethodTooLargeException;
.super Ljava/lang/IndexOutOfBoundsException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final serialVersionUID:J = 0x5e78ac6c04ef3f4aL


# instance fields
.field private final className:Ljava/lang/String;

.field private final codeSize:I

.field private final descriptor:Ljava/lang/String;

.field private final methodName:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-static {p1, p2, p3}, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->stringConcat$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->className:Ljava/lang/String;

    .line 9
    .line 10
    iput-object p2, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->methodName:Ljava/lang/String;

    .line 11
    .line 12
    iput-object p3, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->descriptor:Ljava/lang/String;

    .line 13
    .line 14
    iput p4, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->codeSize:I

    .line 15
    .line 16
    return-void
.end method

.method private static synthetic stringConcat$0(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    const-string v0, "."

    .line 2
    .line 3
    const-string v1, " "

    .line 4
    .line 5
    const-string v2, "Method too large: "

    .line 6
    .line 7
    invoke-static {v2, p0, v0, p1, v1}, L飘花落叶言世兰子哲楪苏/飘花落叶言子楪兰苏世哲;->飘花落叶言子楪哲兰苏世(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    move-result-object p0

    .line 18
    return-object p0
.end method


# virtual methods
.method public getClassName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getCodeSize()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->codeSize:I

    .line 2
    .line 3
    return p0
.end method

.method public getDescriptor()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->descriptor:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getMethodName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/MethodTooLargeException;->methodName:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method
