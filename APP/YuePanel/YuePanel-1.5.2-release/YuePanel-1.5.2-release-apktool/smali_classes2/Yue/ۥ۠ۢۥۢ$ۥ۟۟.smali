.class public final LYue/ۥ۠ۢۥۢ$ۥ۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۣ۠ۢۡ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۥۢ;->ۥ۟(LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۧ;)LYue/ۥۣ۠ۢۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e0\u06e2\u06e3\u06e1<",
        "TR;>;"
    }
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Zip.kt\nkotlinx/coroutines/flow/FlowKt__ZipKt\n*L\n1#1,112:1\n262#2,2:113\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:[LYue/ۥۣ۠ۢۡ;

.field public final synthetic ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۧ;


# direct methods
.method public constructor <init>([LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠ۢۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟;->ۥۣ۟۟۠:[LYue/ۥۣ۠ۢۡ;

    iput-object p2, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ(LYue/ۥۣۣ۠ۢ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;
    .locals 5
    .param p1    # LYue/ۥۣۣ۠ۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥ۟ۧۤۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object v0, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟;->ۥۣ۟۟۠:[LYue/ۥۣ۠ۢۡ;

    invoke-static {}, LYue/ۥ۠ۢۥۢ;->ۥ()LYue/ۥۣ۠۠ۨ;

    move-result-object v1

    new-instance v2, LYue/ۥ۠ۢۥۢ$ۥ۟۟$ۥ;

    const/4 v3, 0x0

    iget-object v4, p0, LYue/ۥ۠ۢۥۢ$ۥ۟۟;->ۥ۟۟۠ۤ:LYue/ۥۣ۠ۢۧ;

    invoke-direct {v2, v3, v4}, LYue/ۥ۠ۢۥۢ$ۥ۟۟$ۥ;-><init>(LYue/ۥ۟ۧۤۢ;LYue/ۥۣ۠ۢۧ;)V

    invoke-static {p1, v0, v1, v2, p2}, LYue/ۥ۟ۥۤ۠;->ۥ(LYue/ۥۣۣ۠ۢ;[LYue/ۥۣ۠ۢۡ;LYue/ۥۣ۠۠ۨ;LYue/ۥۣ۠ۢۤ;LYue/ۥ۟ۧۤۢ;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, LYue/ۥ۠ۥۣۧ;->ۥ۟۟۟ۦ()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, LYue/ۥۣۢ۠ۤ;->ۥ:LYue/ۥۣۢ۠ۤ;

    return-object p1
.end method
