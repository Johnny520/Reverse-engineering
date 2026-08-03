.class public final LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;
.super LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۨ۠ۥ;->ۥ۟۟ۥۦ(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠۠ۨ;)LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/SourceDebugExtension;
    value = "SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n*L\n1#1,671:1\n*E\n"
.end annotation


# instance fields
.field public final synthetic ۥ۟۟۟:LYue/ۥۣ۠۠ۨ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۠ۨ۠ۥ;LYue/ۥۣ۠۠ۨ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06e0\u06e8\u06e0\u06e5;",
            "LYue/\u06e5\u06e0\u06e3\u06e0\u06e8<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    iput-object p2, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;->ۥ۟۟۟:LYue/ۥۣ۠۠ۨ;

    invoke-direct {p0, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟;-><init>(LYue/ۥ۠ۨ۠ۥ;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥۣ۟۟۟(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    check-cast p1, LYue/ۥ۠ۨ۠ۥ;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;->ۥ۟۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟ۥ(LYue/ۥ۠ۨ۠ۥ;)Ljava/lang/Object;
    .locals 0
    .param p1    # LYue/ۥ۠ۨ۠ۥ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    iget-object p1, p0, LYue/ۥ۠ۨ۠ۥ$ۥ۟۟۟۠;->ۥ۟۟۟:LYue/ۥۣ۠۠ۨ;

    invoke-interface {p1}, LYue/ۥۣ۠۠ۨ;->invoke()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    invoke-static {}, LYue/ۥ۠ۨ۠ۤ;->ۥ()Ljava/lang/Object;

    move-result-object p1

    :goto_0
    return-object p1
.end method
