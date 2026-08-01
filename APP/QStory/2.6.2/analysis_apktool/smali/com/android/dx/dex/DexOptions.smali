.class public final Lcom/android/dx/dex/DexOptions;
.super Ljava/lang/Object;
.source "r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776"


# static fields
.field public static final ALIGN_64BIT_REGS_SUPPORT:Z = true


# instance fields
.field public ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER:Z

.field public allowAllInterfaceMethodInvokes:Z

.field public final err:Ljava/io/PrintStream;

.field public forceJumbo:Z

.field public minSdkVersion:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    const/4 v0, 0x1

    .line 5
    iput-boolean v0, p0, Lcom/android/dx/dex/DexOptions;->ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER:Z

    .line 6
    .line 7
    const/16 v0, 0xd

    .line 8
    .line 9
    iput v0, p0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    iput-boolean v0, p0, Lcom/android/dx/dex/DexOptions;->forceJumbo:Z

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/android/dx/dex/DexOptions;->allowAllInterfaceMethodInvokes:Z

    .line 15
    .line 16
    sget-object v0, Ljava/lang/System;->err:Ljava/io/PrintStream;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/android/dx/dex/DexOptions;->err:Ljava/io/PrintStream;

    .line 19
    .line 20
    return-void
.end method

.method public constructor <init>(Ljava/io/PrintStream;)V
    .locals 1

    .line 21
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 22
    iput-boolean v0, p0, Lcom/android/dx/dex/DexOptions;->ALIGN_64BIT_REGS_IN_OUTPUT_FINISHER:Z

    const/16 v0, 0xd

    .line 23
    iput v0, p0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    const/4 v0, 0x0

    .line 24
    iput-boolean v0, p0, Lcom/android/dx/dex/DexOptions;->forceJumbo:Z

    .line 25
    iput-boolean v0, p0, Lcom/android/dx/dex/DexOptions;->allowAllInterfaceMethodInvokes:Z

    .line 26
    iput-object p1, p0, Lcom/android/dx/dex/DexOptions;->err:Ljava/io/PrintStream;

    return-void
.end method


# virtual methods
.method public apiIsSupported(I)Z
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 2
    .line 3
    if-lt p0, p1, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x1

    .line 6
    return p0

    .line 7
    :cond_0
    const/4 p0, 0x0

    .line 8
    return p0
.end method

.method public getMagic()Ljava/lang/String;
    .locals 0

    .line 1
    iget p0, p0, Lcom/android/dx/dex/DexOptions;->minSdkVersion:I

    .line 2
    .line 3
    invoke-static {p0}, Lcom/bumptech/glide/飘花落叶言子楪世兰苏哲;->飘花落叶言子楪世苏兰哲(I)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method
