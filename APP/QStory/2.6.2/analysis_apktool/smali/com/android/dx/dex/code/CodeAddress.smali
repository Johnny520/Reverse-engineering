.class public final Lcom/android/dx/dex/code/CodeAddress;
.super Lcom/android/dx/dex/code/ZeroSizeInsn;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# instance fields
.field private final bindsClosely:Z


# direct methods
.method public constructor <init>(Lcom/android/dx/rop/code/SourcePosition;)V
    .locals 1

    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, p1, v0}, Lcom/android/dx/dex/code/CodeAddress;-><init>(Lcom/android/dx/rop/code/SourcePosition;Z)V

    return-void
.end method

.method public constructor <init>(Lcom/android/dx/rop/code/SourcePosition;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/android/dx/dex/code/ZeroSizeInsn;-><init>(Lcom/android/dx/rop/code/SourcePosition;)V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/android/dx/dex/code/CodeAddress;->bindsClosely:Z

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public argString()Ljava/lang/String;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    return-object p0
.end method

.method public getBindsClosely()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/dex/code/CodeAddress;->bindsClosely:Z

    .line 2
    .line 3
    return p0
.end method

.method public listingString0(Z)Ljava/lang/String;
    .locals 0

    .line 1
    const-string p0, "code-address"

    .line 2
    .line 3
    return-object p0
.end method

.method public final withRegisters(Lcom/android/dx/rop/code/RegisterSpecList;)Lcom/android/dx/dex/code/DalvInsn;
    .locals 0

    .line 1
    new-instance p1, Lcom/android/dx/dex/code/CodeAddress;

    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/android/dx/dex/code/DalvInsn;->getPosition()Lcom/android/dx/rop/code/SourcePosition;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-direct {p1, p0}, Lcom/android/dx/dex/code/CodeAddress;-><init>(Lcom/android/dx/rop/code/SourcePosition;)V

    .line 8
    .line 9
    .line 10
    return-object p1
.end method
