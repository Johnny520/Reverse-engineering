.class public final LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۢ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣۣ۠ۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۥ۟;->ۥ۟۟۟ۥ(LYue/ۥۣ۠ۢۡ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e3<",
        "TT;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLimit.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Limit.kt\nkotlinx/coroutines/flow/FlowKt__LimitKt$collectWhile$collector$1\n+ 2 Reduce.kt\nkotlinx/coroutines/flow/FlowKt__ReduceKt\n*L\n1#1,141:1\n74#2,7:142\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;


# direct methods
.method public constructor <init>(LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۢ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟(Ljava/lang/Object;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 2
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-",
            "LYue/\u06e5\u06e2\u06e3\u06e0\u06e4;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object p2, p0, LYue/ۥ۠ۢۥ۟$ۥ۟۟۠ۢ;->ۥۣ۟۟۠:LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;

    iget-object v0, p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object v1, LYue/ۥۡۢۧ;->ۥ:LYue/ۥۢ۠ۦۢ;

    if-ne v0, v1, :cond_0

    iput-object p1, p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1

    :cond_0
    iput-object v1, p2, LYue/ۥۡۦۢۥ$ۥ۟۟۟ۢ;->ۥۣ۟۟۠:Ljava/lang/Object;

    new-instance p1, LYue/ۥ۟۟۠ۡ;

    invoke-direct {p1, p0}, LYue/ۥ۟۟۠ۡ;-><init>(LYue/ۥۣۣ۠ۢ;)V

    throw p1
.end method
