.class public LYue/ۥۡۤۤ۠$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۤۤ۠$ۥ;


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۤۤ۠;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e4\u06e4\u06e0$\u06e5<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nPools.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pools.kt\nandroidx/core/util/Pools$SimplePool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"
.end annotation


# instance fields
.field public final ۥ:[Ljava/lang/Object;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public ۥ۟:I


# direct methods
.method public constructor <init>(I)V
    .locals 1
    .param p1    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x1L
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    if-lez p1, :cond_0

    new-array p1, p1, [Ljava/lang/Object;

    iput-object p1, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ:[Ljava/lang/Object;

    return-void

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "The max pool size must be > 0"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method


# virtual methods
.method public acquire()Ljava/lang/Object;
    .locals 4
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    iget v0, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ۟:I

    const/4 v1, 0x0

    if-lez v0, :cond_0

    add-int/lit8 v0, v0, -0x1

    iget-object v2, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ:[Ljava/lang/Object;

    aget-object v2, v2, v0

    const-string v3, "null cannot be cast to non-null type T of androidx.core.util.Pools.SimplePool"

    invoke-static {v2, v3}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۨ(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v3, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ:[Ljava/lang/Object;

    aput-object v1, v3, v0

    iget v0, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ۟:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ۟:I

    return-object v2

    :cond_0
    return-object v1
.end method

.method public release(Ljava/lang/Object;)Z
    .locals 4
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    const-string v0, "instance"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    if-eqz v0, :cond_1

    iget v0, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ۟:I

    iget-object v2, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ:[Ljava/lang/Object;

    array-length v3, v2

    if-ge v0, v3, :cond_0

    aput-object p1, v2, v0

    add-int/2addr v0, v1

    iput v0, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ۟:I

    return v1

    :cond_0
    const/4 p1, 0x0

    return p1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "Already in the pool!"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final ۥ(Ljava/lang/Object;)Z
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)Z"
        }
    .end annotation

    iget v0, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ۟:I

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    if-ge v2, v0, :cond_1

    iget-object v3, p0, LYue/ۥۡۤۤ۠$ۥ۟;->ۥ:[Ljava/lang/Object;

    aget-object v3, v3, v2

    if-ne v3, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    return v1
.end method
