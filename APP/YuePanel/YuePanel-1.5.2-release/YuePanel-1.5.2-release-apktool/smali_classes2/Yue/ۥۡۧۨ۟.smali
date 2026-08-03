.class public abstract LYue/ۥۡۧۨ۟;
.super LYue/ۥ۟ۦۥۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "<S:",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06df<",
        "TS;>;>",
        "LYue/\u06e5\u06df\u06e6\u06e5\u06e8<",
        "TS;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,242:1\n224#2,4:243\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n210#1:243,4\n*E\n"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic cleanedAndPointers:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟:J


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LYue/ۥۡۧۨ۟;

    const-string v1, "cleanedAndPointers"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۧۨ۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(JLYue/ۥۡۧۨ۟;I)V
    .locals 0
    .param p3    # LYue/ۥۡۧۨ۟;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(JTS;I)V"
        }
    .end annotation

    invoke-direct {p0, p3}, LYue/ۥ۟ۦۥۨ;-><init>(LYue/ۥ۟ۦۥۨ;)V

    iput-wide p1, p0, LYue/ۥۡۧۨ۟;->ۥ۟۟:J

    shl-int/lit8 p1, p4, 0x10

    iput p1, p0, LYue/ۥۡۧۨ۟;->cleanedAndPointers:I

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟ۡ()Z
    .locals 2

    iget v0, p0, LYue/ۥۡۧۨ۟;->cleanedAndPointers:I

    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠۟()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥۣ۟۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۟ۨ()Z
    .locals 2

    sget-object v0, LYue/ۥۡۧۨ۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/high16 v1, -0x10000

    invoke-virtual {v0, p0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->addAndGet(Ljava/lang/Object;I)I

    move-result v0

    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠۟()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥۣ۟۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public final ۥ۟۟۠()J
    .locals 2

    iget-wide v0, p0, LYue/ۥۡۧۨ۟;->ۥ۟۟:J

    return-wide v0
.end method

.method public abstract ۥ۟۟۠۟()I
.end method

.method public final ۥ۟۟۠۠()V
    .locals 2

    sget-object v0, LYue/ۥۡۧۨ۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    invoke-virtual {v0, p0}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->incrementAndGet(Ljava/lang/Object;)I

    move-result v0

    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠۟()I

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥۣ۟۟۟()Z

    move-result v0

    if-nez v0, :cond_0

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    :cond_0
    return-void
.end method

.method public final ۥ۟۟۠ۡ()Z
    .locals 3

    :cond_0
    iget v0, p0, LYue/ۥۡۧۨ۟;->cleanedAndPointers:I

    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠۟()I

    move-result v1

    if-ne v0, v1, :cond_2

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥۣ۟۟۟()Z

    move-result v1

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    sget-object v1, LYue/ۥۡۧۨ۟;->ۥ۟۟۟:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/high16 v2, 0x10000

    add-int/2addr v2, v0

    invoke-virtual {v1, p0, v0, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_1
    return v0
.end method
