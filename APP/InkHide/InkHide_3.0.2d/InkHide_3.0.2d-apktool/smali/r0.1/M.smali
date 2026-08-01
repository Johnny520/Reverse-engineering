.class public final synthetic Lr0/M;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lr0/d0;

.field public final synthetic b:I

.field public final synthetic c:[J

.field public final synthetic d:Ljava/lang/Object;

.field public final synthetic e:Landroid/widget/ListView;

.field public final synthetic f:Landroid/view/View;


# direct methods
.method public synthetic constructor <init>(Lr0/d0;I[JLjava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/M;->a:Lr0/d0;

    iput p2, p0, Lr0/M;->b:I

    iput-object p3, p0, Lr0/M;->c:[J

    iput-object p4, p0, Lr0/M;->d:Ljava/lang/Object;

    iput-object p5, p0, Lr0/M;->e:Landroid/widget/ListView;

    iput-object p6, p0, Lr0/M;->f:Landroid/view/View;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Lr0/M;->a:Lr0/d0;

    .line 2
    .line 3
    iget-object v1, p0, Lr0/M;->d:Ljava/lang/Object;

    .line 4
    .line 5
    iget-object v2, p0, Lr0/M;->e:Landroid/widget/ListView;

    .line 6
    .line 7
    iget-object v3, p0, Lr0/M;->f:Landroid/view/View;

    .line 8
    .line 9
    :try_start_0
    invoke-virtual {v0, v1, v2, v3}, Lr0/d0;->o(Ljava/lang/Object;Landroid/widget/ListView;Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 10
    .line 11
    .line 12
    :catchall_0
    iget-object v1, p0, Lr0/M;->c:[J

    .line 13
    .line 14
    array-length v1, v1

    .line 15
    add-int/lit8 v1, v1, -0x1

    .line 16
    .line 17
    iget v2, p0, Lr0/M;->b:I

    .line 18
    .line 19
    if-ne v2, v1, :cond_0

    .line 20
    .line 21
    const/4 v1, 0x0

    .line 22
    iput-boolean v1, v0, Lr0/d0;->s:Z

    .line 23
    .line 24
    :cond_0
    return-void
.end method
