.class public final synthetic LYue/ۥ۠ۨ۟ۨ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;

.field public final synthetic ۥ۟۟۠ۥ:I


# direct methods
.method public synthetic constructor <init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨ۟ۨ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    iput-object p2, p0, LYue/ۥ۠ۨ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;

    iput p3, p0, LYue/ۥ۠ۨ۟ۨ;->ۥ۟۟۠ۥ:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۠ۨ۟ۨ;->ۥۣ۟۟۠:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    iget-object v1, p0, LYue/ۥ۠ۨ۟ۨ;->ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;

    iget v2, p0, LYue/ۥ۠ۨ۟ۨ;->ۥ۟۟۠ۥ:I

    invoke-static {v0, v1, v2}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ۟(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;I)V

    return-void
.end method
