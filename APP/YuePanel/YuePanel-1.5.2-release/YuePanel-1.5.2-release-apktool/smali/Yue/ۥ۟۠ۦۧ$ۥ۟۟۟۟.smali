.class public LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;
.super LYue/ۥ۟۠ۦۧ$ۥ۟۟;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x10
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۦۧ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ۟:Landroid/view/Choreographer;

.field public final ۥ۟۟:Landroid/view/Choreographer$FrameCallback;


# direct methods
.method public constructor <init>(LYue/ۥ۟۠ۦۧ$ۥ;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥ۟۠ۦۧ$ۥ۟۟;-><init>(LYue/ۥ۟۠ۦۧ$ۥ;)V

    invoke-static {}, Landroid/view/Choreographer;->getInstance()Landroid/view/Choreographer;

    move-result-object p1

    iput-object p1, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;->ۥ۟:Landroid/view/Choreographer;

    new-instance p1, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟$ۥ;

    invoke-direct {p1, p0}, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟$ۥ;-><init>(LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;)V

    iput-object p1, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;->ۥ۟۟:Landroid/view/Choreographer$FrameCallback;

    return-void
.end method


# virtual methods
.method public ۥ()V
    .locals 2

    iget-object v0, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;->ۥ۟:Landroid/view/Choreographer;

    iget-object v1, p0, LYue/ۥ۟۠ۦۧ$ۥ۟۟۟۟;->ۥ۟۟:Landroid/view/Choreographer$FrameCallback;

    invoke-virtual {v0, v1}, Landroid/view/Choreographer;->postFrameCallback(Landroid/view/Choreographer$FrameCallback;)V

    return-void
.end method
