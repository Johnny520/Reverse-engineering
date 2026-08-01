.class public Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"

# interfaces
.implements Lnet/bytebuddy/utility/AsmClassWriter;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassWriter;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ForAsm"
.end annotation


# instance fields
.field private final classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;


# direct methods
.method public constructor <init>(Lnet/bytebuddy/jar/asm/ClassWriter;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public getBinaryRepresentation()[B
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 2
    .line 3
    invoke-virtual {p0}, Lnet/bytebuddy/jar/asm/ClassWriter;->toByteArray()[B

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public getVisitor()Lnet/bytebuddy/jar/asm/ClassVisitor;
    .locals 0

    .line 1
    iget-object p0, p0, Lnet/bytebuddy/utility/AsmClassWriter$ForAsm;->classWriter:Lnet/bytebuddy/jar/asm/ClassWriter;

    .line 2
    .line 3
    return-object p0
.end method
