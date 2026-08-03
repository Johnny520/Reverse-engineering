.class public final LYue/ۥ۠ۦ۠۟$ۥ۟۟۟;
.super LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۦ۠۟;->ۥۣ۟۟(Ljava/lang/Object;LYue/ۥۣۡۢۧ;LYue/ۥ۠ۦ۠;)Z
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,671:1\n524#2:672\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟:LYue/ۥ۠ۦ۠۟;

.field public final synthetic ۥ۟۟۟۟:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥ۠ۦ۠۟;Ljava/lang/Object;)V
    .locals 0

    iput-object p2, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥ۠ۦ۠۟;

    iput-object p3, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟;->ۥ۟۟۟۟:Ljava/lang/Object;

    invoke-direct {p0, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;-><init>(LYue/ۥ۠ۨ۠ۥ;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟;->ۥ۟۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 1
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object p1, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟;->ۥ۟۟۟:LYue/ۥ۠ۦ۠۟;

    invoke-virtual {p1}, LYue/ۥ۠ۦ۠۟;->ۥ۟۟ۦۣ()Ljava/lang/Object;

    move-result-object p1

    iget-object v0, p0, LYue/ۥ۠ۦ۠۟$ۥ۟۟۟;->ۥ۟۟۟۟:Ljava/lang/Object;

    if-ne p1, v0, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥ۠ۨ۠ۤ;->ۥ()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
