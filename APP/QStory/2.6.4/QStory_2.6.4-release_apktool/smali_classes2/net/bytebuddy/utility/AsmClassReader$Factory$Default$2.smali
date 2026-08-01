.class final enum Lnet/bytebuddy/utility/AsmClassReader$Factory$Default$2;
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
    .locals 1

    .line 1
    const-class p0, Lnet/bytebuddy/utility/AsmClassReader;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm()Lnet/bytebuddy/ClassFileVersion;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->latest()Lnet/bytebuddy/ClassFileVersion;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    invoke-virtual {p0, v0}, Lnet/bytebuddy/ClassFileVersion;->isGreaterThan(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 18
    .line 19
    .line 20
    move-result p0

    .line 21
    if-eqz p0, :cond_0

    .line 22
    .line 23
    sget-object p0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->CLASS_FILE_API_ONLY:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 24
    .line 25
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([BZ)Lnet/bytebuddy/utility/AsmClassReader;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0

    .line 30
    :cond_0
    sget-object p0, Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;->ASM_ONLY:Lnet/bytebuddy/utility/AsmClassReader$Factory$Default;

    .line 31
    .line 32
    invoke-interface {p0, p1, p2}, Lnet/bytebuddy/utility/AsmClassReader$Factory;->make([BZ)Lnet/bytebuddy/utility/AsmClassReader;

    .line 33
    .line 34
    .line 35
    move-result-object p0

    .line 36
    return-object p0
.end method
