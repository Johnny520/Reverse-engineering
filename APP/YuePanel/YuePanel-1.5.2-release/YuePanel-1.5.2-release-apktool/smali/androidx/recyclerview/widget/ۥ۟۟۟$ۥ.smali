.class public Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۡ(Ljava/util/List;Ljava/lang/Runnable;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Ljava/util/List;

.field public final synthetic ۥ۟۟۠ۤ:Ljava/util/List;

.field public final synthetic ۥ۟۟۠ۥ:I

.field public final synthetic ۥ۟۟۠ۦ:Ljava/lang/Runnable;

.field public final synthetic ۥ۟۟۠ۧ:Landroidx/recyclerview/widget/ۥ۟۟۟;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۟;Ljava/util/List;Ljava/util/List;ILjava/lang/Runnable;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۧ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    iput-object p2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥۣ۟۟۠:Ljava/util/List;

    iput-object p3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/List;

    iput p4, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:I

    iput-object p5, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    new-instance v0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ;

    invoke-direct {v0, p0}, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;)V

    invoke-static {v0}, Landroidx/recyclerview/widget/ۥ۟۟۟ۡ;->ۥ(Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟;)Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;

    move-result-object v0

    iget-object v1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۧ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    iget-object v1, v1, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟:Ljava/util/concurrent/Executor;

    new-instance v2, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ۟;

    invoke-direct {v2, p0, v0}, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ۟;-><init>(Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;)V

    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    return-void
.end method
