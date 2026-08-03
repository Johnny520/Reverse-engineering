.class public final LYue/ۥ۟ۦۦ۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۦۦ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "\u06e5"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥ۟ۦۦ۟$ۥ$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,284:1\n360#2,4:285\n*S KotlinDebug\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core\n*L\n132#1:285,4\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic load:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ:I

.field public final ۥ۟:I

.field public final ۥ۟۟:I

.field public synthetic ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public synthetic ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۟۠:LYue/ۥ۟ۦۦ۟;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06e6\u06e6\u06df<",
            "TK;TV;>;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LYue/ۥ۟ۦۦ۟$ۥ;

    const-string v1, "load"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥ۟ۦۦ۟;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۠:LYue/ۥ۟ۦۦ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p2, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ:I

    invoke-static {p2}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟:I

    mul-int/lit8 p1, p2, 0x2

    div-int/lit8 p1, p1, 0x3

    iput p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟:I

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->load:I

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    new-instance p1, Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-direct {p1, p2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;-><init>(I)V

    iput-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    return-void
.end method

.method public static final synthetic ۥ(LYue/ۥ۟ۦۦ۟$ۥ;)I
    .locals 0

    iget p0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ:I

    return p0
.end method

.method public static synthetic ۥ۟۟۟ۡ(LYue/ۥ۟ۦۦ۟$ۥ;Ljava/lang/Object;Ljava/lang/Object;LYue/ۥ۠ۤۢ;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_0

    const/4 p3, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2, p3}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۠(Ljava/lang/Object;Ljava/lang/Object;LYue/ۥ۠ۤۢ;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final ۥ۟(LYue/ۥ۠ۤۢ;)V
    .locals 2
    .param p1    # LYue/ۥ۠ۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e4\u06e2<",
            "*>;)V"
        }
    .end annotation

    iget v0, p1, LYue/ۥ۠ۤۢ;->ۥ:I

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟(I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۤۢ;

    if-nez v1, :cond_0

    return-void

    :cond_0
    if-ne v1, p1, :cond_1

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥۣ۟۟۟(I)V

    return-void

    :cond_1
    if-nez v0, :cond_2

    iget v0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ:I

    :cond_2
    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public final ۥ۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;)TV;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟(I)I

    move-result v0

    :goto_0
    iget-object v1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥ۠ۤۢ;

    if-nez v1, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    invoke-virtual {v1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v1

    invoke-static {p1, v1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of v0, p1, LYue/ۥ۠ۨۨۡ;

    if-eqz v0, :cond_1

    check-cast p1, LYue/ۥ۠ۨۨۡ;

    iget-object p1, p1, LYue/ۥ۠ۨۨۡ;->ۥ:Ljava/lang/Object;

    :cond_1
    return-object p1

    :cond_2
    if-nez v1, :cond_3

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥۣ۟۟۟(I)V

    :cond_3
    if-nez v0, :cond_4

    iget v0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ:I

    :cond_4
    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public final ۥ۟۟۟(I)I
    .locals 1

    const v0, -0x61c88647

    mul-int/2addr p1, v0

    iget v0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟:I

    ushr-int/2addr p1, v0

    return p1
.end method

.method public final ۥ۟۟۟۟(LYue/ۥۣ۠ۢۢ;)Ljava/util/Iterator;
    .locals 1
    .param p1    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TK;-TV;+TE;>;)",
            "Ljava/util/Iterator<",
            "TE;>;"
        }
    .end annotation

    new-instance v0, LYue/ۥ۟ۦۦ۟$ۥ$ۥ;

    invoke-direct {v0, p0, p1}, LYue/ۥ۟ۦۦ۟$ۥ$ۥ;-><init>(LYue/ۥ۟ۦۦ۟$ۥ;LYue/ۥۣ۠ۢۢ;)V

    return-object v0
.end method

.method public final ۥ۟۟۟۠(Ljava/lang/Object;Ljava/lang/Object;LYue/ۥ۠ۤۢ;)Ljava/lang/Object;
    .locals 5
    .param p1    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Object;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .param p3    # LYue/ۥ۠ۤۢ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TK;TV;",
            "LYue/\u06e5\u06e0\u06e4\u06e2<",
            "TK;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟(I)I

    move-result v0

    const/4 v1, 0x0

    :goto_0
    iget-object v2, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v2, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, LYue/ۥ۠ۤۢ;

    if-nez v2, :cond_5

    const/4 v2, 0x0

    if-nez p2, :cond_0

    return-object v2

    :cond_0
    if-nez v1, :cond_3

    :goto_1
    iget v1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->load:I

    iget v3, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟:I

    if-lt v1, v3, :cond_1

    invoke-static {}, LYue/ۥ۟ۦۦ۠;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object p1

    return-object p1

    :cond_1
    add-int/lit8 v3, v1, 0x1

    sget-object v4, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v4, p0, v1, v3}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v1

    if-nez v1, :cond_2

    goto :goto_1

    :cond_2
    const/4 v1, 0x1

    :cond_3
    if-nez p3, :cond_4

    new-instance p3, LYue/ۥ۠ۤۢ;

    iget-object v3, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۠:LYue/ۥ۟ۦۦ۟;

    invoke-static {v3}, LYue/ۥ۟ۦۦ۟;->ۥ۟۟۟۠(LYue/ۥ۟ۦۦ۟;)Ljava/lang/ref/ReferenceQueue;

    move-result-object v3

    invoke-direct {p3, p1, v3}, LYue/ۥ۠ۤۢ;-><init>(Ljava/lang/Object;Ljava/lang/ref/ReferenceQueue;)V

    :cond_4
    iget-object v3, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v3, v0, v2, p3}, LYue/ۥ۟ۦۦ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    goto :goto_0

    :cond_5
    invoke-virtual {v2}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v2

    invoke-static {p1, v2}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۟ۡ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    if-eqz v1, :cond_6

    sget-object p1, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟ۡ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {p1, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->decrementAndGet(Ljava/lang/Object;)I

    :cond_6
    iget-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {p1, v0}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object p1

    instance-of p3, p1, LYue/ۥ۠ۨۨۡ;

    if-eqz p3, :cond_7

    invoke-static {}, LYue/ۥ۟ۦۦ۠;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object p1

    return-object p1

    :cond_7
    iget-object p3, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {p3, v0, p1, p2}, LYue/ۥ۟ۦۦ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_6

    return-object p1

    :cond_8
    if-nez v2, :cond_9

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥۣ۟۟۟(I)V

    :cond_9
    if-nez v0, :cond_a

    iget v0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ:I

    :cond_a
    add-int/lit8 v0, v0, -0x1

    goto :goto_0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥ۟ۦۦ۟$ۥ;
    .locals 8
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LYue/\u06e5\u06df\u06e6\u06e6\u06df<",
            "TK;TV;>.\u06e5;"
        }
    .end annotation

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۠:LYue/ۥ۟ۦۦ۟;

    invoke-virtual {v0}, LYue/ۥ۟۟ۡۨ;->size()I

    move-result v0

    const/4 v1, 0x4

    invoke-static {v0, v1}, LYue/ۥۡۦ۟;->ۥ۟۟۠ۤ(II)I

    move-result v0

    invoke-static {v0}, Ljava/lang/Integer;->highestOneBit(I)I

    move-result v0

    mul-int/2addr v0, v1

    new-instance v1, LYue/ۥ۟ۦۦ۟$ۥ;

    iget-object v2, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۠:LYue/ۥ۟ۦۦ۟;

    invoke-direct {v1, v2, v0}, LYue/ۥ۟ۦۦ۟$ۥ;-><init>(LYue/ۥ۟ۦۦ۟;I)V

    iget v0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ:I

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_5

    iget-object v3, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v3, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, LYue/ۥ۠ۤۢ;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    move-result-object v4

    goto :goto_1

    :cond_1
    const/4 v4, 0x0

    :goto_1
    if-eqz v3, :cond_2

    if-nez v4, :cond_2

    invoke-virtual {p0, v2}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥۣ۟۟۟(I)V

    :cond_2
    iget-object v5, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v5, v2}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v5

    instance-of v6, v5, LYue/ۥ۠ۨۨۡ;

    if-eqz v6, :cond_3

    check-cast v5, LYue/ۥ۠ۨۨۡ;

    iget-object v5, v5, LYue/ۥ۠ۨۨۡ;->ۥ:Ljava/lang/Object;

    goto :goto_2

    :cond_3
    iget-object v6, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-static {v5}, LYue/ۥ۟ۦۦ۠;->ۥ۟(Ljava/lang/Object;)LYue/ۥ۠ۨۨۡ;

    move-result-object v7

    invoke-static {v6, v2, v5, v7}, LYue/ۥ۟ۦۦ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    :goto_2
    if-eqz v4, :cond_4

    if-eqz v5, :cond_4

    invoke-virtual {v1, v4, v5, v3}, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۠(Ljava/lang/Object;Ljava/lang/Object;LYue/ۥ۠ۤۢ;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {}, LYue/ۥ۟ۦۦ۠;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v4

    if-eq v3, v4, :cond_0

    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_5
    return-object v1
.end method

.method public final ۥۣ۟۟۟(I)V
    .locals 3

    :cond_0
    iget-object v0, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/atomic/AtomicReferenceArray;->get(I)Ljava/lang/Object;

    move-result-object v0

    if-nez v0, :cond_1

    return-void

    :cond_1
    instance-of v1, v0, LYue/ۥ۠ۨۨۡ;

    if-eqz v1, :cond_2

    return-void

    :cond_2
    iget-object v1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۟:Ljava/util/concurrent/atomic/AtomicReferenceArray;

    const/4 v2, 0x0

    invoke-static {v1, p1, v0, v2}, LYue/ۥ۟ۦۦ;->ۥ(Ljava/util/concurrent/atomic/AtomicReferenceArray;ILjava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, LYue/ۥ۟ۦۦ۟$ۥ;->ۥ۟۟۟۠:LYue/ۥ۟ۦۦ۟;

    invoke-static {p1}, LYue/ۥ۟ۦۦ۟;->ۥ۟۟۟۟(LYue/ۥ۟ۦۦ۟;)V

    return-void
.end method
