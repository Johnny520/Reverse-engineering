.class public final LYue/ۥ۟۟۠ۤ$ۥۣ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۧۨۧ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۟۠ۤ;->ۥ۟۟۟ۦ()LYue/ۥۡۧۨۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e7\u06e8\u06e7<",
        "TE;>;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟۟۠ۤ;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
            "TE;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(LYue/ۥ۟۟۠ۤ;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LYue/\u06e5\u06df\u06df\u06e0\u06e4<",
            "TE;>;)V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟۟۠ۤ$ۥۣ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟۠ۤ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ۟۟ۡ۟(LYue/ۥۡۨ;LYue/ۥۣ۠ۢۢ;)V
    .locals 2
    .param p1    # LYue/ۥۡۨ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۣ۠ۢۢ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<R:",
            "Ljava/lang/Object;",
            ">(",
            "LYue/\u06e5\u06e1\u06e8<",
            "-TR;>;",
            "LYue/\u06e5\u06e0\u06e3\u06e2\u06e2<",
            "-TE;-",
            "LYue/\u06e5\u06df\u06e7\u06e4\u06e2<",
            "-TR;>;+",
            "Ljava/lang/Object;",
            ">;)V"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥ۟۟۠ۤ$ۥۣ۟۟۟;->ۥۣ۟۟۠:LYue/ۥ۟۟۠ۤ;

    const/4 v1, 0x0

    invoke-static {v0, p1, v1, p2}, LYue/ۥ۟۟۠ۤ;->ۥۣ۟۟۠(LYue/ۥ۟۟۠ۤ;LYue/ۥۡۨ;ILYue/ۥۣ۠ۢۢ;)V

    return-void
.end method
