.class public Lcom/android/dx/util/MutabilityControl;
.super Ljava/lang/Object;
.source "r8-map-id-70bf64ddac3f904dcf61383bec717e6f4283f4f555a9f70f5d9ea129839b05ef"


# instance fields
.field private mutable:Z


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
    iput-boolean v0, p0, Lcom/android/dx/util/MutabilityControl;->mutable:Z

    .line 6
    .line 7
    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    iput-boolean p1, p0, Lcom/android/dx/util/MutabilityControl;->mutable:Z

    return-void
.end method


# virtual methods
.method public final isImmutable()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/util/MutabilityControl;->mutable:Z

    .line 2
    .line 3
    xor-int/lit8 p0, p0, 0x1

    .line 4
    .line 5
    return p0
.end method

.method public final isMutable()Z
    .locals 0

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/util/MutabilityControl;->mutable:Z

    .line 2
    .line 3
    return p0
.end method

.method public setImmutable()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/android/dx/util/MutabilityControl;->mutable:Z

    .line 3
    .line 4
    return-void
.end method

.method public final throwIfImmutable()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/util/MutabilityControl;->mutable:Z

    .line 2
    .line 3
    if-eqz p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Lcom/android/dx/util/MutabilityException;

    .line 7
    .line 8
    const-string v0, "immutable instance"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method

.method public final throwIfMutable()V
    .locals 1

    .line 1
    iget-boolean p0, p0, Lcom/android/dx/util/MutabilityControl;->mutable:Z

    .line 2
    .line 3
    if-nez p0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    new-instance p0, Lcom/android/dx/util/MutabilityException;

    .line 7
    .line 8
    const-string v0, "mutable instance"

    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcom/android/dx/util/MutabilityException;-><init>(Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    throw p0
.end method
