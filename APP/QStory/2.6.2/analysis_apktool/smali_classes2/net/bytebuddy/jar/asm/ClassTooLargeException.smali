.class public final Lnet/bytebuddy/jar/asm/ClassTooLargeException;
.super Ljava/lang/IndexOutOfBoundsException;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field private static final serialVersionUID:J = 0x23af9fecf3bf67dL


# instance fields
.field private final className:Ljava/lang/String;

.field private final constantPoolCount:I


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    invoke-static {p1}, Lnet/bytebuddy/jar/asm/ClassTooLargeException;->stringConcat$0(Ljava/lang/String;)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-direct {p0, v0}, Ljava/lang/IndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, p0, Lnet/bytebuddy/jar/asm/ClassTooLargeException;->className:Ljava/lang/String;

    .line 9
    .line 10
    iput p2, p0, Lnet/bytebuddy/jar/asm/ClassTooLargeException;->constantPoolCount:I

    .line 11
    .line 12
    return-void
.end method

.method private static synthetic stringConcat$0(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "Class too large: "

    .line 2
    .line 3
    invoke-static {v0, p0}, Landroidx/activity/飘花落叶言子楪哲苏兰世;->飘花落叶言子楪哲世兰苏(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method


# virtual methods
.method public getClassName()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/jar/asm/ClassTooLargeException;->className:Ljava/lang/String;

    .line 2
    .line 3
    return-object p0
.end method

.method public getConstantPoolCount()I
    .locals 0

    .line 1
    iget p0, p0, Lnet/bytebuddy/jar/asm/ClassTooLargeException;->constantPoolCount:I

    .line 2
    .line 3
    return p0
.end method
