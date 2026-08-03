.class public LYue/ۥ۟۠ۦۧ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۦۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟۠ۦۧ;


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۦۧ;)V
    .locals 0

    iput-object p1, p0, LYue/ۥ۟۠ۦۧ$ۥ;->ۥ:LYue/ۥ۟۠ۦۧ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 3

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ$ۥ;->ۥ:LYue/ۥ۟۠ۦۧ;

    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۟:J

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ$ۥ;->ۥ:LYue/ۥ۟۠ۦۧ;

    iget-wide v1, v0, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۟:J

    invoke-virtual {v0, v1, v2}, LYue/ۥ۟۠ۦۧ;->ۥ۟۟(J)V

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ$ۥ;->ۥ:LYue/ۥ۟۠ۦۧ;

    iget-object v0, v0, LYue/ۥ۟۠ۦۧ;->ۥ۟:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ$ۥ;->ۥ:LYue/ۥ۟۠ۦۧ;

    invoke-virtual {v0}, LYue/ۥ۟۠ۦۧ;->ۥ۟۟۟۠()LYue/ۥ۟۠ۦۧ$ۥ۟۟;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥ۟۠ۦۧ$ۥ۟۟;->ۥ()V

    :cond_0
    return-void
.end method
