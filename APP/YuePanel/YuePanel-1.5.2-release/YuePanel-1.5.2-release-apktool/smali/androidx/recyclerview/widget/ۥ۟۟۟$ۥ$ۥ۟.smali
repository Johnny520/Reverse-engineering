.class public Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ۟;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic ۥۣ۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;

.field public final synthetic ۥ۟۟۠ۤ:Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;


# direct methods
.method public constructor <init>(Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;)V
    .locals 0

    iput-object p1, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ۟;->ۥ۟۟۠ۤ:Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;

    iput-object p2, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ۟;->ۥ۟۟۠ۤ:Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;

    iget-object v1, v0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۧ:Landroidx/recyclerview/widget/ۥ۟۟۟;

    iget v2, v1, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟۟ۡ:I

    iget v3, v0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۥ:I

    if-ne v2, v3, :cond_0

    iget-object v2, v0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۤ:Ljava/util/List;

    iget-object v3, p0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ$ۥ۟;->ۥۣ۟۟۠:Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;

    iget-object v0, v0, Landroidx/recyclerview/widget/ۥ۟۟۟$ۥ;->ۥ۟۟۠ۦ:Ljava/lang/Runnable;

    invoke-virtual {v1, v2, v3, v0}, Landroidx/recyclerview/widget/ۥ۟۟۟;->ۥ۟۟(Ljava/util/List;Landroidx/recyclerview/widget/ۥ۟۟۟ۡ$ۥ۟۟;Ljava/lang/Runnable;)V

    :cond_0
    return-void
.end method
