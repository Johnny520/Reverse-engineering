.class final enum Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$4;
.super Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4009
    name = null
.end annotation


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/utility/AsmClassReader$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public make([BZ)Lnet/bytebuddy/utility/AsmClassReader;
    .locals 0

    .line 1
    new-instance p0, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;

    .line 2
    .line 3
    invoke-static {p1, p2}, Lnet/bytebuddy/utility/OpenedClassReader;->of([BZ)Lnet/bytebuddy/jar/asm/ClassReader;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    invoke-direct {p0, p1}, Lnet/bytebuddy/utility/AsmClassReader$ForAsm;-><init>(Lnet/bytebuddy/jar/asm/ClassReader;)V

    .line 8
    .line 9
    .line 10
    return-object p0
.end method
