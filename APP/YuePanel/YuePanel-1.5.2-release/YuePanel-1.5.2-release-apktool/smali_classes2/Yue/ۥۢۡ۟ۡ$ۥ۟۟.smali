.class public final LYue/ۥۢۡ۟ۡ$ۥ۟۟;
.super LYue/ۥۢ۠ۨۦ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۣۢ۟ۧ;
    value = {
        "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"
    }
.end annotation

.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۢۡ۟ۡ;->ۥ۟۟۟ۨ(Ljava/lang/String;JLYue/ۥۣ۠۠ۨ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟۟:LYue/ۥۣ۠۠ۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Long;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;LYue/ۥۣ۠۠ۨ;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    iput-object p2, p0, LYue/ۥۢۡ۟ۡ$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥۣ۠۠ۨ;

    const/4 p2, 0x2

    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, p1, v1, p2, v0}, LYue/ۥۢ۠ۨۦ;-><init>(Ljava/lang/String;ZILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۠()J
    .locals 2

    iget-object v0, p0, LYue/ۥۢۡ۟ۡ$ۥ۟۟;->ۥ۟۟۟۟:LYue/ۥۣ۠۠ۨ;

    invoke-interface {v0}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method
