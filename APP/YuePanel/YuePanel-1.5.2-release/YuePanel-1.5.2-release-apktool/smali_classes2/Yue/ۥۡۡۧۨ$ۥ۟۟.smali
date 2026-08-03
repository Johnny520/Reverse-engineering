.class public abstract LYue/ۥۡۡۧۨ$ۥ۟۟;
.super LYue/ۥ۠ۨ۠ۥ;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠۟;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۡۧۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x401
    name = "\u06e5\u06df\u06df"
.end annotation


# static fields
.field public static final synthetic ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;


# instance fields
.field private volatile synthetic isTaken:I
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field

.field public final ۥ۟۟۠ۦ:Ljava/lang/Object;
    .annotation build LYue/ۥ۠ۦ۠ۧ;
    .end annotation

    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation
.end field

.field public final synthetic ۥ۟۟۠ۧ:LYue/ۥۡۡۧۨ;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const-class v0, LYue/ۥۡۡۧۨ$ۥ۟۟;

    const-string v1, "isTaken"

    invoke-static {v0, v1}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->newUpdater(Ljava/lang/Class;Ljava/lang/String;)Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    move-result-object v0

    sput-object v0, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    return-void
.end method

.method public constructor <init>(LYue/ۥۡۡۧۨ;Ljava/lang/Object;)V
    .locals 0
    .param p1    # LYue/ۥۡۡۧۨ;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Object;",
            ")V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟۠ۧ:LYue/ۥۡۡۧۨ;

    invoke-direct {p0}, LYue/ۥ۠ۨ۠ۥ;-><init>()V

    iput-object p2, p0, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟۠ۦ:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, p0, LYue/ۥۡۡۧۨ$ۥ۟۟;->isTaken:I

    return-void
.end method


# virtual methods
.method public final ۥ۟۟ۡۥ()V
    .locals 0

    invoke-virtual {p0}, LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۨ()Z

    return-void
.end method

.method public abstract ۥ۟۟ۦۤ()V
.end method

.method public final ۥ۟۟ۦۥ()Z
    .locals 3

    sget-object v0, LYue/ۥۡۡۧۨ$ۥ۟۟;->ۥ۟۟۠ۨ:Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;

    const/4 v1, 0x0

    const/4 v2, 0x1

    invoke-virtual {v0, p0, v1, v2}, Ljava/util/concurrent/atomic/AtomicIntegerFieldUpdater;->compareAndSet(Ljava/lang/Object;II)Z

    move-result v0

    return v0
.end method

.method public abstract ۥ۟۟ۦۦ()Z
.end method
