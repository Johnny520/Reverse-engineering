.class public final LYue/ۥ۟ۦۥۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 3 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,242:1\n25#1,3:252\n28#1,11:262\n45#1:273\n46#1,8:276\n106#2,7:243\n106#2,7:255\n106#2,7:284\n155#3,2:250\n155#3,2:274\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n72#1:252,3\n72#1:262,11\n73#1:273\n73#1:276,8\n27#1:243,7\n72#1:255,7\n84#1:284,7\n45#1:250,2\n73#1:274,2\n*E\n"
.end annotation


# static fields
.field public static final ۥ:I = 0x10

.field public static final ۥ۟:LYue/ۥۢ۠ۦۢ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۢ۠ۦۢ;

    const-string v1, "CLOSED"

    invoke-direct {v0, v1}, LYue/ۥۢ۠ۦۢ;-><init>(Ljava/lang/String;)V

    sput-object v0, LYue/ۥ۟ۦۥۧ;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    return-void
.end method

.method public static final synthetic ۥ()LYue/ۥۢ۠ۦۢ;
    .locals 1

    sget-object v0, LYue/ۥ۟ۦۥۧ;->ۥ۟:LYue/ۥۢ۠ۦۢ;

    return-object v0
.end method

.method public static final ۥ۟(LYue/ۥ۟ۦۥۨ;)LYue/ۥ۟ۦۥۨ;
    .locals 2
    .param p0    # LYue/ۥ۟ۦۥۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<N:",
            "LYue/\u06e5\u06df\u06e6\u06e5\u06e8<",
            "TN;>;>(TN;)TN;"
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-static {p0}, LYue/ۥ۟ۦۥۨ;->ۥ(LYue/ۥ۟ۦۥۨ;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-ne v0, v1, :cond_1

    return-object p0

    :cond_1
    check-cast v0, LYue/ۥ۟ۦۥۨ;

    if-nez v0, :cond_2

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۤ()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p0

    :cond_2
    move-object p0, v0

    goto :goto_0
.end method

.method public static final ۥ۟۟(LYue/ۥۡۧۨ۟;JLYue/ۥۣ۠ۢۢ;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<S:",
            "LYue/\u06e5\u06e1\u06e7\u06e8\u06df<",
            "TS;>;>(TS;J",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-",
            "Ljava/lang/Long;",
            "-TS;+TS;>;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    :cond_0
    :goto_0
    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v0

    cmp-long v0, v0, p1

    if-ltz v0, :cond_2

    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۡ()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {p0}, LYue/ۥۡۧۨ۠;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_2
    :goto_1
    invoke-static {p0}, LYue/ۥ۟ۦۥۨ;->ۥ(LYue/ۥ۟ۦۥۨ;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object v1

    if-ne v0, v1, :cond_3

    invoke-static {}, LYue/ۥ۟ۦۥۧ;->ۥ()LYue/ۥۢ۠ۦۢ;

    move-result-object p0

    invoke-static {p0}, LYue/ۥۡۧۨ۠;->ۥ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_3
    check-cast v0, LYue/ۥ۟ۦۥۨ;

    check-cast v0, LYue/ۥۡۧۨ۟;

    if-eqz v0, :cond_5

    :cond_4
    :goto_2
    move-object p0, v0

    goto :goto_0

    :cond_5
    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۠()J

    move-result-wide v0

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-interface {p3, v0, p0}, LYue/ۥۣ۠ۢۢ;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, LYue/ۥۡۧۨ۟;

    invoke-virtual {p0, v0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۧ(LYue/ۥ۟ۦۥۨ;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p0}, LYue/ۥۡۧۨ۟;->ۥ۟۟۟ۡ()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {p0}, LYue/ۥ۟ۦۥۨ;->ۥ۟۟۟ۦ()V

    goto :goto_2
.end method

.method public static synthetic ۥ۟۟۟()V
    .locals 0

    return-void
.end method
