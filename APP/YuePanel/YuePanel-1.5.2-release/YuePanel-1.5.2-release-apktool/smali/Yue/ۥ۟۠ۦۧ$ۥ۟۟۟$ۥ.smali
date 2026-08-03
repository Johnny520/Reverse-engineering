.class public LYue/ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;-><init>(LYue/ۥ۟۠ۦۧ$ۥ;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;->ۥ۟۟۟:J

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:LYue/ۥ۟۠ۦۧ$ۥ۟۟۟;

    iget-object v0, v0, LYue/ۥ۟۠ۦۧ$ۥ۟۟;->ۥ:LYue/ۥ۟۠ۦۧ$ۥ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۦۧ$ۥ;->ۥ()V

    return-void
.end method
