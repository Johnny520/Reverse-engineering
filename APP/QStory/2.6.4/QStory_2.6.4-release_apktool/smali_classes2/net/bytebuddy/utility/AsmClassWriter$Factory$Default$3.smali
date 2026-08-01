.class final enum Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default$3;
.super Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;
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
    invoke-direct {p0, p1, p2, v0}, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;-><init>(Ljava/lang/String;ILnet/bytebuddy/utility/AsmClassWriter$1;)V

    .line 3
    .line 4
    .line 5
    return-void
.end method


# virtual methods
.method public make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;
    .locals 1

    .line 1
    invoke-static {}, Lnet/bytebuddy/ClassFileVersion;->ofThisVm()Lnet/bytebuddy/ClassFileVersion;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    sget-object v0, Lnet/bytebuddy/ClassFileVersion;->JAVA_V24:Lnet/bytebuddy/ClassFileVersion;

    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lnet/bytebuddy/ClassFileVersion;->isAtLeast(Lnet/bytebuddy/ClassFileVersion;)Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    sget-object p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;->CLASS_FILE_API_ONLY:Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;

    .line 14
    .line 15
    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/utility/AsmClassWriter$Factory;->make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0

    .line 20
    :cond_0
    sget-object p0, Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;->ASM_ONLY:Lnet/bytebuddy/utility/AsmClassWriter$Factory$Default;

    .line 21
    .line 22
    invoke-interface {p0, p1, p2, p3}, Lnet/bytebuddy/utility/AsmClassWriter$Factory;->make(ILnet/bytebuddy/utility/AsmClassReader;Lnet/bytebuddy/pool/TypePool;)Lnet/bytebuddy/utility/AsmClassWriter;

    .line 23
    .line 24
    .line 25
    move-result-object p0

    .line 26
    return-object p0
.end method
