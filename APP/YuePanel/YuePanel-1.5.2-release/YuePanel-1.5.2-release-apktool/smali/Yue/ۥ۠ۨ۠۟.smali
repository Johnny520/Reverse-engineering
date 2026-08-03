.class public final synthetic LYue/ۥ۠ۨ۠۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;


# direct methods
.method public synthetic constructor <init>(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۠ۨ۠۟;->ۥۣ۟۟۠:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    iput-object p2, p0, LYue/ۥ۠ۨ۠۟;->ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۠ۨ۠۟;->ۥۣ۟۟۠:LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;

    iget-object v1, p0, LYue/ۥ۠ۨ۠۟;->ۥ۟۟۠ۤ:Ljava/util/concurrent/Executor;

    invoke-static {v0, v1}, LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;->ۥ(LYue/ۥ۠ۧۨۤ$ۥ۟۟۟ۨ;Ljava/util/concurrent/Executor;)V

    return-void
.end method
