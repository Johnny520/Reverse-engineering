.class public LYue/ۥ۠ۢۦ۟$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥ۟ۧ۠ۧ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۠ۢۦ۟;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥ۠ۢۥۧ;ILjava/util/concurrent/Executor;LYue/ۥۣ۟ۧ۟;)Landroid/graphics/Typeface;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06df\u06e7\u06e0\u06e7<",
        "LYue/\u06e5\u06e0\u06e2\u06e6\u06df$\u06e5\u06df\u06df\u06df\u06df;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥۣ۟ۧ۟;


# direct methods
.method public constructor <init>(LYue/ۥۣ۟ۧ۟;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۠ۢۦ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۧ۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic accept(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    invoke-virtual {p0, p1}, LYue/ۥ۠ۢۦ۟$ۥ۟;->ۥ(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V

    return-void
.end method

.method public ۥ(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V
    .locals 1

    if-nez p1, :cond_0

    new-instance p1, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;

    const/4 v0, -0x3

    invoke-direct {p1, v0}, LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;-><init>(I)V

    :cond_0
    iget-object v0, p0, LYue/ۥ۠ۢۦ۟$ۥ۟;->ۥۣ۟۟۠:LYue/ۥۣ۟ۧ۟;

    invoke-virtual {v0, p1}, LYue/ۥۣ۟ۧ۟;->ۥ۟(LYue/ۥ۠ۢۦ۟$ۥ۟۟۟۟;)V

    return-void
.end method
